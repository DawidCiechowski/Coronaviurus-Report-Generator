package com.coronaviursapplication.model.PdfGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import com.coronaviursapplication.statistics.CovidStatistics;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneralReport implements IReport {

    private String country;
    private CovidStatistics statistics; 

    public GeneralReport(String country) {
        this.country = country;
        statistics = new CovidStatistics(country);
    }

    @Override
    public void generateReport() {
        Document document = new Document();
        long timestamp = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        String documentTitle = timestamp + "_General_Report.pdf";

        try{
            PdfWriter.getInstance(document, new FileOutputStream(documentTitle));

            document.open();
            
            document.add(addTitle());
            document.add(addCountry());
            document.add(addFirstAppearance());
            document.add(addConfirmedCases());
            document.add(addCurrentActiveCases());
            document.close();
        } catch(DocumentException err) {
            System.err.print("Document doesn't exist.");
            err.printStackTrace();
        } catch(FileNotFoundException err) {
            System.err.println("Couldn't find a file");
            err.printStackTrace();
        }
    }

    public Paragraph addTitle() {
        LocalDate today = LocalDate.now();
        Font font = FontFactory.getFont(FontFactory.TIMES, 16, Font.BOLD, BaseColor.BLACK);
        final String title = today.toString() + " General report for country: ";
        Chunk titleChunk = new Chunk(title, font);
            
        Paragraph titleParagraph = new Paragraph(titleChunk);
        titleParagraph.setAlignment(Paragraph.ALIGN_CENTER);

        return titleParagraph;
    }

    public Paragraph addCountry() {
        Font font = FontFactory.getFont(FontFactory.TIMES_BOLD, 24, BaseColor.BLACK);
        Chunk countryChunk = new Chunk(this.country.toUpperCase(), font);

        Paragraph countryParagraph = new Paragraph(countryChunk);
        countryParagraph.setAlignment(Paragraph.ALIGN_CENTER);
        countryParagraph.setSpacingAfter(50);

        return countryParagraph;
    }

    public Paragraph addFirstAppearance() {
        Font font = FontFactory.getFont(FontFactory.TIMES, 12, BaseColor.BLACK);
        String firstAppearance = "First appearance of COVID-19 in " + this.country.toUpperCase() + " occured on: " + statistics.getDayOne();
        Chunk firstAppearaChunk = new Chunk(firstAppearance, font);

        Paragraph firstAppearanceParagraph = new Paragraph(firstAppearaChunk);
        firstAppearanceParagraph.setSpacingAfter(10);

        return firstAppearanceParagraph;
    }

    public Paragraph addConfirmedCases() {
        Font font = FontFactory.getFont(FontFactory.TIMES, 12, BaseColor.BLACK);
        int confirmedCases = statistics.getConfirmedCases();
        String confirmed = "Number of confirmed cases since first appearance: " + confirmedCases;
        Chunk confirmedChunk = new Chunk(confirmed, font);

        Paragraph confirmedParagraph = new Paragraph(confirmedChunk);
        confirmedParagraph.setSpacingAfter(10);

        return confirmedParagraph;
    }

    public Paragraph addCurrentActiveCases() {
        Font font = FontFactory.getFont(FontFactory.TIMES, 12, BaseColor.BLACK);
        int activeCases = statistics.getCurrentActiveCases();
        String active = "Number of currently active cases in " + this.country.toUpperCase() + ": " + activeCases;
        Chunk activeChunk = new Chunk(active, font);

        Paragraph activeParagraph = new Paragraph(activeChunk);
        activeParagraph.setSpacingAfter(10);

        return activeParagraph;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}