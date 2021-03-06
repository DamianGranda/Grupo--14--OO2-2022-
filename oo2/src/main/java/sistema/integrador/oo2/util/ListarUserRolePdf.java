package sistema.integrador.oo2.util;
import java.awt.Color;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import sistema.integrador.oo2.entities.UserRole;


@Component("userRole/listaAuditor")
public class ListarUserRolePdf extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		@SuppressWarnings("unchecked")
		List<UserRole> listadoPerfiles = (List<UserRole>) model.get("userRoles");
		
		response.setHeader("Content-Disposition","attachment; filename=Lista-de-perfiles"+LocalDate.now().toString()+".pdf");
		PdfPTable tablaPerfiles = new PdfPTable(2);
		tablaPerfiles.setSpacingBefore(20);
		
		PdfPCell cell = new PdfPCell();
		Color colorParaCeldasHeader = new Color(252, 144, 121);
		Color primerColorParaCeldas = new Color(253,239,236);
		Color segundoColorParaCeldas = new Color(250,225,220);
		cell.setBackgroundColor(colorParaCeldasHeader);
		cell.setPadding(5);
		
		Font font = FontFactory.getFont(FontFactory.HELVETICA_OBLIQUE);
		font.setColor(Color.BLACK);
		
		Paragraph titulo = new Paragraph("Listado de perfiles", font);
		titulo.setAlignment(Paragraph.ALIGN_CENTER);
		document.add(titulo);

		
		dibujarHeader(tablaPerfiles,cell,font);
		dibujarTabla(listadoPerfiles,tablaPerfiles,cell,primerColorParaCeldas,segundoColorParaCeldas,font);
	
		document.add(tablaPerfiles);
	}
	
	private void dibujarTabla(List<UserRole> listadoPerfiles,PdfPTable tablaPerfiles,PdfPCell cell,Color primerColor, Color segundoColor, Font font) {
		
		for(int i = 0; i < listadoPerfiles.size();i++) {
			if(i % 2 == 0)cell.setBackgroundColor(primerColor);
			
			String id = String.valueOf(listadoPerfiles.get(i).getId());
			
			cell.setPhrase(new Phrase(id,font));
			tablaPerfiles.addCell(cell);
			
			cell.setPhrase(new Phrase(listadoPerfiles.get(i).getRole(),font));
			tablaPerfiles.addCell(cell);
			
			cell.setBackgroundColor(segundoColor);
		}
	}
	
	private void dibujarHeader(PdfPTable tablaPerfiles, PdfPCell cell, Font font) {
		
		cell.setPhrase(new Phrase("ID",font));
		tablaPerfiles.addCell(cell);
		cell.setPhrase(new Phrase("ROL",font));
		tablaPerfiles.addCell(cell);
		
		
	}


	

}