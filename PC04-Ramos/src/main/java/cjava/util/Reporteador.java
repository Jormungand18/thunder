package cjava.util;

import cjava.beans.Cliente;
import cjava.service.ClienteService;
import cjava.service.impl.ClienteServiceImpl;
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

            System.out.println(ruta+ "reporte.pdf");
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

            
            p = new Paragraph("Codigo", negrita);
            cell = new PdfPCell(p);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBorderColor(BaseColor.BLACK);
            cell.setBackgroundColor(new BaseColor(214, 214, 255));
            table.addCell(cell);


            p = new Paragraph("Apellidos", negrita);
            cell = new PdfPCell(p);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBorderColor(BaseColor.BLACK);
            cell.setBackgroundColor(new BaseColor(214, 214, 255));
            table.addCell(cell);

          
            p = new Paragraph("Nombre", negrita);
            cell = new PdfPCell(p);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBorderColor(BaseColor.BLACK);
            cell.setBackgroundColor(new BaseColor(214, 214, 255));
            table.addCell(cell);

            p = new Paragraph("Correo", negrita);
            cell = new PdfPCell(p);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBorderColor(BaseColor.BLACK);
            cell.setBackgroundColor(new BaseColor(214, 214, 255));
            table.addCell(cell);
            
            p = new Paragraph("Telefono", negrita);
            cell = new PdfPCell(p);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBorderColor(BaseColor.BLACK);
            cell.setBackgroundColor(new BaseColor(214, 214, 255));
            table.addCell(cell);
            document.add(table);

            p = new Paragraph("                                                                       ");
            document.add(p);

            //---------------------------------------------------------------------------------------------------
            ClienteService servicio = new ClienteServiceImpl();

            for(Cliente cliente: servicio.listar()) {
                table = new PdfPTable(widths);

                //Codigo
                p = new Paragraph(cliente.getIdcliente()+"", text);
                cell = new PdfPCell(p);
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                cell.setBorderColor(BaseColor.BLACK);
                table.addCell(cell);
                
                //Nombre
                p = new Paragraph(cliente.getApellido(), text);
                cell = new PdfPCell(p);
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                cell.setBorderColor(BaseColor.BLACK);
                table.addCell(cell);
                
                //Creditos
                p = new Paragraph(cliente.getNombre(), text);
                cell = new PdfPCell(p);
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                cell.setBorderColor(BaseColor.BLACK);
                table.addCell(cell);
                
                p = new Paragraph(cliente.getCorreo(), text);
                cell = new PdfPCell(p);
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                cell.setBorderColor(BaseColor.BLACK);
                table.addCell(cell);
                
                p = new Paragraph(cliente.getTelefono(), text);
                cell = new PdfPCell(p);
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                cell.setBorderColor(BaseColor.BLACK);
                table.addCell(cell);
                
                document.add(table);
            }

            
            p = new Paragraph("                                                                     ");
            document.add(p);

            

            document.add(table);

            document.close();

            //---------------------------------------------------------------------------------------------------------------------
        } catch (DocumentException de) {
            System.out.println("error: " + de.toString());
        }

    }

}
