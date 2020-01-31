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

import org.jfree.chart.*;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;
/**
 *
 * @author emaravi
 */
@WebServlet(name = "ServletPie", urlPatterns = {"/sPie"})
public class ServletPie extends HttpServlet {

    private PieDataset createDataset() {
        DefaultPieDataset datos = new DefaultPieDataset();
        EventoService service = new EventoServiceImpl();
        for(Evento evento : service.listar()){
        datos.setValue(evento.getNombre(), evento.getId_evento());
        }
        return datos;
    }

    private JFreeChart createChart(PieDataset piedataset) {
        JFreeChart jfreechart = ChartFactory.createPieChart3D("Grafico Cursos", piedataset, true, true, false);
        PiePlot3D pieplot3d = (PiePlot3D) jfreechart.getPlot();
        pieplot3d.setStartAngle(290D);
        pieplot3d.setDirection(Rotation.CLOCKWISE);
        pieplot3d.setForegroundAlpha(0.5F);

        return jfreechart;
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("image/jpeg");
        OutputStream out = response.getOutputStream();
        //--------------------------------------------------
        PieDataset pie = createDataset();
        JFreeChart grafico = createChart(pie);

        ChartUtilities.writeChartAsJPEG(out, grafico, 500, 300);
        //--------------------------------------------------
        out.close();
    }

    
}
