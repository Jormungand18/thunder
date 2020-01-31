/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Evento;
import service.EventoService;
import service.impl.EventoServiceImpl;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author emaravi
 */
@WebServlet(name = "ServletExcel", urlPatterns = {"/sExcel"})
public class ServletExcel extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/vnd.ms-excel");
        HSSFWorkbook wb = new HSSFWorkbook();				
        HSSFSheet sheet = wb.createSheet("HojaDeCursos");	

        HSSFRow row1 = sheet.createRow((short) 0);			// crea fila1
        HSSFCell a1 = row1.createCell((short) 0);			// crea A1
        HSSFCell b1 = row1.createCell((short) 1);			// crea B1
        a1.setCellValue("Curso");
        b1.setCellValue("Creditos");
        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
        b1.setCellStyle(cellStyle);

        EventoService service = new EventoServiceImpl();
        int i = 1;
        for(Evento evento : service.listar()){
            HSSFRow row2 = sheet.createRow((short) i);	
            row2.createCell((short) 0).setCellValue(evento.getId_evento());
            row2.createCell((short) 1).setCellValue(evento.getNombre());
            i++;
        }

        try (OutputStream out = response.getOutputStream()) {
            wb.write(out);
        }
    }

   

}
