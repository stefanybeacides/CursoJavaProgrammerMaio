package arquivo;

import java.awt.Desktop;
import java.util.List;

import entidade.Correntista;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class ManipuladorArquivo {
	
	public static void gerarPdfCorrentista(List<Correntista> correntista) {
		String caminhoArquivo = "C:\\Users\\ritad\\Documents\\correntista.pdf";
		Document document = new Document();

		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
			writer.setPageEvent(new RodapeTemplate());

			document.open();
			document.add(new Paragraph("Empresa: IMPACTA", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));

			document.add(new Paragraph("Relatorio detalhado de correntistas", FontFactory.getFont(FontFactory.HELVETICA_BOLD,14)));

			document.add(new Paragraph(" "));

			if (correntista != null) {
				
				for (Correntista listCorrentista : correntista) {
					PdfPTable table = new PdfPTable(2);
					table.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
					table.setWidthPercentage(100);
					
					table.addCell("Tipo de Correntista");
					table.addCell(listCorrentista.getTabela());

					table.addCell("Nome");
					table.addCell(listCorrentista.getNome());

					table.addCell("CPF");
					table.addCell(listCorrentista.getCpf());
					
					table.addCell("CEP");
					table.addCell(listCorrentista.getCep());
					
					table.addCell("Logradouro");
					table.addCell(listCorrentista.getLogradouro());
					
					table.addCell("Bairro");
					table.addCell(listCorrentista.getBairro());
					
					table.addCell("Cidade");
					table.addCell(listCorrentista.getCidade());
					
					table.addCell("Uf");
					table.addCell(listCorrentista.getUf());
					
					table.addCell("Email");
					table.addCell(listCorrentista.getEmail());
					
					/*table.addCell("Qtd Transações");
					table.addCell(listCorrentista.getQtdTransacao());
					
					table.addCell("Valor de Anuidade");
					table.addCell(listCorrentista.getValorAnuidade());*/
					
					document.add(new Paragraph(" "));


					document.add(table);
				}

	
			}

			document.close();

			File pdfArquivo = new File(caminhoArquivo);

			if(pdfArquivo.exists()) {
				if(Desktop.isDesktopSupported()) {
					Desktop.getDesktop().open(pdfArquivo);
					JOptionPane.showMessageDialog(null, "PDF Gerado com sucesso!");
				}else {
					System.out.println("PDF gerado mas não foi possivel abrir!");
				}

			}else {
				System.out.println("PDF gerado mas não foi possivel encontrar!");
			}


		} catch (Exception e) {
			e.getMessage();
		}

	}

}