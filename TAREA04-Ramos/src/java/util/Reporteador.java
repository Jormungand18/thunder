package util;

import beans.Evento;
import service.EventoService;
import service.impl.EventoServiceImpl;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContext;

public class Reporteador {

    public Reporteador() {
    }

    public void generaPDF(String nombre, ServletContext contexto) {
        try {

            //---------------------------------------------------------------------------------------------------------------------
            Document document = new Document(PageSize.A4, 20, 20, 20, 20);
            //document.set
            String ruta = contexto.getRealPath("/");//ruta de los JSPs
            try {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(ruta + "/reporte.pdf"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(ruta + "reporte.pdf");
            document.open();
            float[] widths = {0.50f, 1.20f, 0.95f};

            Paragraph p = null;
            PdfPTable table = null;
            PdfPCell cell = null;

            Font negrita = FontFactory.getFont("Arial", 10, Font.BOLD, BaseColor.BLACK);
            Font text = FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK);
            Font normal = FontFactory.getFont("Arial", 10, Font.NORMAL, BaseColor.BLACK);

            Font linea = FontFactory.getFont("Arial", 10, Font.UNDERLINE, BaseColor.BLACK);
  
           

            //---------------------------------------------------------
            table = new PdfPTable(widths);

            //Codigo
            p = new Paragraph("id", negrita);
            cell = new PdfPCell(p);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBorderColor(BaseColor.BLACK);
            cell.setBackgroundColor(new BaseColor(214, 214, 255));
            table.addCell(cell);

            //Nombres
            p = new Paragraph("Nombres", negrita);
            cell = new PdfPCell(p);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBorderColor(BaseColor.BLACK);
            cell.setBackgroundColor(new BaseColor(214, 214, 255));
            table.addCell(cell);

            //Fecha de Nacimiento
            p = new Paragraph("fecha", negrita);
            cell = new PdfPCell(p);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBorderColor(BaseColor.BLACK);
            cell.setBackgroundColor(new BaseColor(214, 214, 255));
            table.addCell(cell);
            
            
            p = new Paragraph("direccion", negrita);
            cell = new PdfPCell(p);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBorderColor(BaseColor.BLACK);
            cell.setBackgroundColor(new BaseColor(214, 214, 255));
            table.addCell(cell);
            
            p = new Paragraph("capacidad", negrita);
            cell = new PdfPCell(p);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBorderColor(BaseColor.BLACK);
            cell.setBackgroundColor(new BaseColor(214, 214, 255));
            table.addCell(cell);

            document.add(table);

            p = new Paragraph("                                                                       ");
            document.add(p);

            //---------------------------------------------------------------------------------------------------
            EventoService servicio = new EventoServiceImpl();

            for(Evento evento: servicio.listar()) {
                table = new PdfPTable(widths);

                //Codigo
                p = new Paragraph(evento.getId_evento()+"", text);
                cell = new PdfPCell(p);
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                cell.setBorderColor(BaseColor.BLACK);
                table.addCell(cell);
                
                //Nombre
                p = new Paragraph(evento.getNombre(), text);
                cell = new PdfPCell(p);
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                cell.setBorderColor(BaseColor.BLACK);
                table.addCell(cell);
                
                //Creditos
                p = new Paragraph(evento.getFecha()+"", text);
                cell = new PdfPCell(p);
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                cell.setBorderColor(BaseColor.BLACK);
                table.addCell(cell);
                
                p = new Paragraph(evento.getDireccion(), text);
                cell = new PdfPCell(p);
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                cell.setBorderColor(BaseColor.BLACK);
                table.addCell(cell);
                
                p = new Paragraph(evento.getCapacidad()+"", text);
                cell = new PdfPCell(p);
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                cell.setBorderColor(BaseColor.BLACK);
                table.addCell(cell);
           
                document.add(table);
            }

            
            p = new Paragraph("                                                                       ");
            document.add(p);

            

            document.add(table);

            document.close();

            //---------------------------------------------------------------------------------------------------------------------
        } catch (DocumentException de) {
            System.out.println("error: " + de.toString());
        }

    }

}
