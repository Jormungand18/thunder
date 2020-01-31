/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.controllers;

import cjava.beans.Cliente;
import cjava.service.ClienteService;
import cjava.service.impl.ClienteServiceImpl;
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
        HSSFCell b1 = row1.createCell((short) 1);
        HSSFCell c1 = row1.createCell((short) 2);
        HSSFCell d1 = row1.createCell((short) 3);// crea B1
        HSSFCell e1 = row1.createCell((short) 4);
        a1.setCellValue("IDcliente");
        b1.setCellValue("Apellido");
        c1.setCellValue("Nombre");
        d1.setCellValue("Correo");
        e1.setCellValue("Telefono");
        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
        b1.setCellStyle(cellStyle);

        ClienteService service = new ClienteServiceImpl();
        int i = 1;
        for(Cliente cliente : service.listar()){
            HSSFRow row2 = sheet.createRow((short) i);	
            row2.createCell((short) 0).setCellValue(cliente.getIdcliente());
            row2.createCell((short) 1).setCellValue(cliente.getApellido());
            row2.createCell((short) 2).setCellValue(cliente.getNombre());
            row2.createCell((short) 3).setCellValue(cliente.getCorreo());
            row2.createCell((short) 4).setCellValue(cliente.getApellido());
            i++;
        }

        try (OutputStream out = response.getOutputStream()) {
            wb.write(out);
        }
    }

   

}
