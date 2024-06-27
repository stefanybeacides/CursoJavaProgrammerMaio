package service;

import entidade.Cep;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

public class BuscarCep {
	
	public Cep ConsultaCep (String Cep) throws Exception {
		
		String urlApi = "https://viacep.com.br/ws/" + Cep + "/json/" ; // URL PARA BUSCAR NA API
		Cep enderecoPopulado = new Cep();
		
		URL obj = new URL(urlApi); // CRIAR OBJETO URL COM A STRING DA URL DA API
		
		HttpURLConnection con = (HttpURLConnection)obj.openConnection(); // ABRE CONEXÃO COM SERVIDOR DA API
		
		con.setRequestMethod("GET"); // É UM METODO HTTP PARA CONSULTA
		
		int statusRespostaApi = con.getResponseCode();// RECEBE O STATUS HTTP DA RESPOSTA DA API 200 OU 400
		
		if(statusRespostaApi == HttpURLConnection.HTTP_OK) {
			BufferedReader dadosEntradaDaApi = new BufferedReader(new InputStreamReader(con.getInputStream()));// Armazena toda resposta do servidor no objeto dadosEntradaDaApi
			String linhaEntrada; // String temporaria para montar o string StringBuffer
			StringBuffer respostaDaApi = new StringBuffer(); // String buffer que será montada durante a leitura do json
			
			while ((linhaEntrada = dadosEntradaDaApi.readLine()) != null) {
				respostaDaApi.append(linhaEntrada);
			}
			
			dadosEntradaDaApi.close();
			String jsonRecebidoDaApi = respostaDaApi.toString();
			System.out.println(jsonRecebidoDaApi);
			enderecoPopulado = jsonParaEndereco(jsonRecebidoDaApi);
			
		}else {
			JOptionPane.showMessageDialog(null, "Não foi possivel Buscar o endereco do cep informado");
		}
		
		return enderecoPopulado;
	}
	
public static Cep jsonParaEndereco(String jsonString) {
        
		Cep endereco = new Cep();
        
        jsonString = jsonString.trim().substring(1, jsonString.length() - 1);

        String[] parts = jsonString.split(",\\s*");

        for (String part : parts) {
           
            String[] keyValue = part.split(":\\s*");

            if (keyValue.length == 2) {
                String key = keyValue[0].trim().replaceAll("^\"|\"$", "");
                String value = keyValue[1].trim().replaceAll("^\"|\"$", "");

                switch (key) {
                    case "cep":
                        endereco.setCep(value);
                        break;
                    case "logradouro":
                        endereco.setLogradouro(value);
                        break;
                    case "bairro":
                        endereco.setBairro(value);
                        break;
                    case "localidade":
                        endereco.setLocalidade(value);
                        break;
                    case "uf":
                        endereco.setUf(value);
                        break;
                    case "ibge":
                        endereco.setIbge(value);
                        break;
                    case "gia":
                        endereco.setGia(value);
                        break;
                    case "ddd":
                        endereco.setDdd(value);
                        break;
                    case "siafi":
                        endereco.setSiafi(value);
                        break;
                    default:
                        
                        break;
                }
            }
        }

        return endereco;
    }

}
