/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InitialData;

import PackageManagement.Departments;
import PackageManagement.Kiosks;
import PackageManagement.ManagementsOfRegionsAndPrices;
import PackageManagement.Municipalities;
import PackageManagement.Packages;
import PackageManagement.Users;
import com.barcodelib.barcode.Linear;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.barcodelib.barcode.Linear;
import java.io.*;
/**
 *
 * @author bruce
 */
public class SG {
    //Region and price management
    public static Users user = new Users();
    public static Departments departments = new Departments();  
    public static Kiosks kiosks= new Kiosks();
    public static Municipalities municipalities= new Municipalities();
    public static Packages packages= new Packages();
    public static ManagementsOfRegionsAndPrices managementsOfRegionsAndPrices = new ManagementsOfRegionsAndPrices();
    //Session
    public static String SESSION_DPI = "";
    public static Integer SESSION_ROLE = -1;
    public static User userFound;
    public static Client clientFound;
    public static final double SURCHARGE_DELIVERY=5;
    public static Integer quantityPackageFound[];
    
    public static Integer quantityPackageFoundRegion[];
    
    
    public static final double STICKY_PACKAGE=100;
    public static final double MEDIUM_PACKAGE=200;
    public static final double LARGE_PACKAGE=300;

    public static Integer[] getQuantityPackageFound() {
        return quantityPackageFound;
    }

    public static void setQuantityPackageFound(Integer[] quantityPackageFound) {
        SG.quantityPackageFound = quantityPackageFound;
    }

    public static Integer[] getQuantityPackageFoundRegion() {
        return quantityPackageFoundRegion;
    }

    public static void setQuantityPackageFoundRegion(Integer[] quantityPackageFoundRegion) {
        SG.quantityPackageFoundRegion = quantityPackageFoundRegion;
    }
    
    public static String getTypeOfPayment(Integer type){
        String typePayment;
            switch (type) {
            case 0:
                typePayment="Contraentrega";
                break;
            case 1:
               typePayment="Tarjeta de credito";
               break;
            default:
                throw new AssertionError();
        }
        return typePayment;
    }
    
    public static void generateGuide(PackageDelivery packageDelivery) throws IOException{
        String fname="";
        try {
                 Linear barcode = new Linear();
                 barcode.setType(Linear.CODE128B);
                 barcode.setData(packageDelivery.getCode());
                 barcode.setI(11.0f);
                 fname=packageDelivery.getCode();
                 fname="C:\\Users\\brand\\Desktop\\Bruce\\USAC\\IPC\\-IPC1-S12023_Proyecto1_-202203069-\\src\\barCodes\\"+fname+".png";
                 barcode.renderBarcode(fname);
                         
             } catch (Exception e) {
                 System.out.println("error");
             }
        String content = "<html lang=\"en\">\n" +
                 
                  
                 
                         
             
"\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <title>Document</title>\n" +
"    <!-- google Font -->\n" +
"    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap\" rel=\"stylesheet\">\n" +
"    <!-- My Style -->\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <style>\n" +
"        * {\n" +
"            box-sizing: border-box;\n" +
"            padding: 0px;\n" +
"            margin: 0px;\n" +
"        }\n" +
"        \n" +
"        body,\n" +
"        html {\n" +
"            font-family: \"Roboto\", serif;\n" +
"            font-size: 16px;\n" +
"            background: #F4F4F4;\n" +
"            line-height: 1.5;\n" +
"        }\n" +
"        \n" +
"        .header {\n" +
"            display: flex;\n" +
"            background: #fff;\n" +
"            padding: 15px 20px;\n" +
"            align-items: center;\n" +
"            justify-content: space-between;\n" +
"            margin-bottom: 2rem;\n" +
"            box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.05);\n" +
"        }\n" +
"        \n" +
"        .header .logo {\n" +
"            font-size: 32px;\n" +
"            font-weight: bold;\n" +
"            color: #0034BB;\n" +
"        }\n" +
"        \n" +
"        .header .search {\n" +
"            position: relative;\n" +
"        }\n" +
"        \n" +
"        .header .search .icon {\n" +
"            position: absolute;\n" +
"            top: 5px;\n" +
"            left: 5px;\n" +
"        }\n" +
"        \n" +
"        .header .search .icon img {\n" +
"            width: 24px;\n" +
"            height: 24px;\n" +
"            object-fit: cover;\n" +
"        }\n" +
"        \n" +
"        .header .search .form-control {\n" +
"            padding: 8px 10px;\n" +
"            border-radius: 8px;\n" +
"            font-size: 1rem;\n" +
"            width: 100%;\n" +
"            background: rgba(0, 52, 187, 0.06);\n" +
"            border: 1px solid transparent;\n" +
"            color: #2B2B2B;\n" +
"            padding-left: 40px;\n" +
"            outline: 0px;\n" +
"        }\n" +
"        \n" +
"        .header .search .form-control:focus {\n" +
"            background: #fff;\n" +
"            border-color: #0034BB;\n" +
"        }\n" +
"        \n" +
"        .header .search .form-control::placeholder {\n" +
"            color: rgba(0, 52, 187, 0.5);\n" +
"        }\n" +
"        \n" +
"        .main-content {\n" +
"            padding: 0px 20px;\n" +
"        }\n" +
"        \n" +
"        .invoice-container {\n" +
"            max-width: 800px;\n" +
"            margin: auto;\n" +
"            padding: 3rem;\n" +
"            background: #fff;\n" +
"        }\n" +
"        \n" +
"        .invoice-container .top {\n" +
"            margin-bottom: 4rem;\n" +
"            display: flex;\n" +
"            justify-content: space-between;\n" +
"        }\n" +
"        \n" +
"        .invoice-container .top .top-left {\n" +
"            color: #0034BB;\n" +
"        }\n" +
"        \n" +
"        .invoice-container .top .main {\n" +
"            font-size: 40px;\n" +
"            text-transform: uppercase;\n" +
"            font-weight: 500;\n" +
"            display: block;\n" +
"            margin-bottom: 0.5rem;\n" +
"        }\n" +
"        \n" +
"        .invoice-container .top .code {\n" +
"            font-size: 24px;\n" +
"        }\n" +
"        \n" +
"        .invoice-container .top .date {\n" +
"            font-size: 18px;\n" +
"            color: #ADADAD;\n" +
"            margin-bottom: 10px;\n" +
"        }\n" +
"        \n" +
"        .bill-box {\n" +
"            display: flex;\n" +
"            justify-content: space-between;\n" +
"            margin-bottom: 4rem;\n" +
"            color: #ADADAD;\n" +
"        }\n" +
"        \n" +
"        .bill-box .left,\n" +
"        .bill-box .right {\n" +
"            max-width: 240px;\n" +
"        }\n" +
"        \n" +
"        .bill-box .text-m {\n" +
"            font-size: 18px;\n" +
"            margin-bottom: 1rem;\n" +
"            text-transform: uppercase;\n" +
"        }\n" +
"        \n" +
"        .bill-box .title {\n" +
"            font-size: 2rem;\n" +
"            margin-bottom: 1rem;\n" +
"            font-weight: 500;\n" +
"            color: #2B2B2B;\n" +
"        }\n" +
"        \n" +
"        .table-bill table {\n" +
"            width: 100%;\n" +
"            border-collapse: 0px;\n" +
"            border-spacing: 0px;\n" +
"            font-size: 1rem;\n" +
"        }\n" +
"        \n" +
"        .table-bill th,\n" +
"        .table-bill td {\n" +
"            text-align: left;\n" +
"            padding: 10px 10px;\n" +
"            font-weight: 500;\n" +
"        }\n" +
"        \n" +
"        .table-bill td {\n" +
"            padding: 15px 10px;\n" +
"        }\n" +
"        \n" +
"        .table-bill th {\n" +
"            text-transform: uppercase;\n" +
"            color: #0034BB;\n" +
"            font-weight: 500;\n" +
"        }\n" +
"        \n" +
"        .table-bill .quantity {\n" +
"            width: 100px;\n" +
"        }\n" +
"        \n" +
"        .table-bill .cost {\n" +
"            text-align: right;\n" +
"            white-space: nowrap;\n" +
"        }\n" +
"        \n" +
"        .table-bill .total {\n" +
"            font-size: 24px;\n" +
"            color: #0034BB;\n" +
"        }\n" +
"        \n" +
"        .table-bill .total td {\n" +
"            font-weight: normal;\n" +
"            border-top: 1px solid #ececec;\n" +
"        }\n" +
"        \n" +
"        .table-bill .total .number {\n" +
"            text-align: right;\n" +
"            font-weight: 600;\n" +
"        }\n" +
"        \n" +
"        .actions {\n" +
"            text-align: center;\n" +
"            margin-top: 4rem;\n" +
"        }\n" +
"        \n" +
"        .actions .btn {\n" +
"            margin: 3px;\n" +
"            padding: 8px 10px;\n" +
"            font-size: 1rem;\n" +
"            text-transform: uppercase;\n" +
"            font-weight: bold;\n" +
"            border: 0px;\n" +
"            min-width: 130px;\n" +
"            color: #0034BB;\n" +
"            border-radius: 8px;\n" +
"            background: rgba(0, 52, 187, 0.06);\n" +
"            cursor: pointer;\n" +
"        }\n" +
"        \n" +
"        .actions .btn:hover {\n" +
"            background: rgba(0, 52, 187, 0.1);\n" +
"        }\n" +
"        \n" +
"        .note {\n" +
"            text-align: center;\n" +
"            margin-top: 1rem;\n" +
"            font-size: 12px;\n" +
"            color: #ADADAD;\n" +
"        }\n" +
"        \n" +
"        @media (max-width: 1320px) {\n" +
"            body,\n" +
"            html {\n" +
"                font-size: 14px;\n" +
"            }\n" +
"            .invoice-container .top .date {\n" +
"                font-size: 14px;\n" +
"            }\n" +
"            .invoice-container .top .main {\n" +
"                font-size: 32px;\n" +
"            }\n" +
"            .invoice-container .top .code {\n" +
"                font-size: 18px;\n" +
"            }\n" +
"            .bill-box .text-m {\n" +
"                font-size: 14px;\n" +
"            }\n" +
"            .bill-box .title {\n" +
"                font-size: 1.5rem;\n" +
"            }\n" +
"            .table-bill .total {\n" +
"                font-size: 16px;\n" +
"            }\n" +
"        }\n" +
"        \n" +
"        @media (max-width: 768px) {\n" +
"            .invoice-container .top {\n" +
"                display: block;\n" +
"            }\n" +
"            .invoice-container .top .top-left {\n" +
"                margin-bottom: 1rem;\n" +
"            }\n" +
"            .bill-box {\n" +
"                display: block;\n" +
"            }\n" +
"            .bill-box .left,\n" +
"            .bill-box .right {\n" +
"                max-width: 100%;\n" +
"            }\n" +
"            .table-bill table,\n" +
"            .table-bill tbody,\n" +
"            .table-bill tfoot,\n" +
"            .table-bill td,\n" +
"            .table-bill th,\n" +
"            .table-bill tr {\n" +
"                display: block;\n" +
"            }\n" +
"            .table-bill th {\n" +
"                display: none;\n" +
"            }\n" +
"            .table-bill tbody tr {\n" +
"                padding: 10px 0px;\n" +
"                border-bottom: 1px solid #e5e5e5;\n" +
"            }\n" +
"            .table-bill tbody tr td:first-child {\n" +
"                display: none;\n" +
"            }\n" +
"            .table-bill td {\n" +
"                padding: 5px 0px;\n" +
"            }\n" +
"            .table-bill .cost {\n" +
"                text-align: left;\n" +
"            }\n" +
"            .table-bill .total {\n" +
"                margin-top: 20px;\n" +
"            }\n" +
"            .table-bill .total td {\n" +
"                border-top: 0px;\n" +
"            }\n" +
"            .table-bill .total .number {\n" +
"                text-align: left;\n" +
"            }\n" +
"        }\n" +
"        \n" +
"        @media (max-width: 420px) {\n" +
"            .actions .btn {\n" +
"                width: 100%;\n" +
"                margin: 5px 0px;\n" +
"            }\n" +
"            .header {\n" +
"                display: block;\n" +
"            }\n" +
"        }\n" +
"    </style>\n" +
"    <div class=\"main-content\">\n" +
"        <div class=\"invoice-container\">\n" +
"            <div class=\"top\">\n" +
"                <div class=\"top-left\">\n" +
"                    <h1 class=\"main\">DELIVERY USAC</h1>\n" +
"                    <span class=\"code\">#"+packages.getLength()+"</span>\n" +
"                </div>\n" +
"                <div class=\"top-right\">\n" +
"                    <div class=\"date\">Fecha: "+packageDelivery.getDateSent()+"</div>\n" +
"                    <div class=\"date\">Codigo: "+packageDelivery.getCode()+"</div>\n" +
"                    <div class=\"date\">Tipo de pago: "+getTypeOfPayment(packageDelivery.getPaymentMethod())+"</div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"bill-box\">\n" +
"                <div class=\"left\">\n" +
"                    <div class=\"text-m\">ORIGEN:</div>\n" +
"                    <div class=\"title\">"+packageDelivery.getClient().getUser().getName()+"</div>\n" +
"                    <div class=\"addr\">"+packageDelivery.getOrigin()+"</div>\n" +
"                </div>\n" +
"                <div class=\"right\">\n" +
"                    <div class=\"text-m\">DESTINO:</div>\n" +
"                    <div class=\"title\">"+packageDelivery.getRecipientsName()+"</div>\n" +
"                    <div class=\"addr\">"+packageDelivery.getDestiny()+"</div>\n" +
"                </div>\n" +
"            </div>\n" +
"                    <div class=\"addr\">Numero de paqutes: "+packageDelivery.getNumberOfPackages()+"</div>\n" +
"            <br><center>\n" +
"\n" +"<img src=\""+fname+"\" alt=\"Barcode\">" +
"            </center>\n" +
"            <div class=\"actions\">\n" +
"                <button class=\"btn btn-main\">Imprimir</button>\n" +
"\n" +
"            </div>\n" +
"            <div class=\"note\">\n" +
"                <p>Gracias por trabajar con nosotros</p>\n" +
"                <p>DELIVERY USAC</p>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"</body>\n" +
"\n" +
"</html>";

        // Escribe el contenido en un archivo HTML
        Files.write(Paths.get("file.html"), content.getBytes(StandardCharsets.UTF_8));

        // Abre el archivo HTML en el navegador predeterminado
        File file = new File("file.html");
        Desktop.getDesktop().browse(file.toURI());
    }
    
    public static void generateInvoice(PackageDelivery packageDelivery) throws IOException{
        
        String content = "<html lang=\"en\">\n" +
"\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <title>Document</title>\n" +
"    <!-- google Font -->\n" +
"    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap\" rel=\"stylesheet\">\n" +
"    <!-- My Style -->\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <style>\n" +
"        * {\n" +
"            box-sizing: border-box;\n" +
"            padding: 0px;\n" +
"            margin: 0px;\n" +
"        }\n" +
"        \n" +
"        body,\n" +
"        html {\n" +
"            font-family: \"Roboto\", serif;\n" +
"            font-size: 16px;\n" +
"            background: #F4F4F4;\n" +
"            line-height: 1.5;\n" +
"        }\n" +
"        \n" +
"        .header {\n" +
"            display: flex;\n" +
"            background: #fff;\n" +
"            padding: 15px 20px;\n" +
"            align-items: center;\n" +
"            justify-content: space-between;\n" +
"            margin-bottom: 2rem;\n" +
"            box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.05);\n" +
"        }\n" +
"        \n" +
"        .header .logo {\n" +
"            font-size: 32px;\n" +
"            font-weight: bold;\n" +
"            color: #0034BB;\n" +
"        }\n" +
"        \n" +
"        .header .search {\n" +
"            position: relative;\n" +
"        }\n" +
"        \n" +
"        .header .search .icon {\n" +
"            position: absolute;\n" +
"            top: 5px;\n" +
"            left: 5px;\n" +
"        }\n" +
"        \n" +
"        .header .search .icon img {\n" +
"            width: 24px;\n" +
"            height: 24px;\n" +
"            object-fit: cover;\n" +
"        }\n" +
"        \n" +
"        .header .search .form-control {\n" +
"            padding: 8px 10px;\n" +
"            border-radius: 8px;\n" +
"            font-size: 1rem;\n" +
"            width: 100%;\n" +
"            background: rgba(0, 52, 187, 0.06);\n" +
"            border: 1px solid transparent;\n" +
"            color: #2B2B2B;\n" +
"            padding-left: 40px;\n" +
"            outline: 0px;\n" +
"        }\n" +
"        \n" +
"        .header .search .form-control:focus {\n" +
"            background: #fff;\n" +
"            border-color: #0034BB;\n" +
"        }\n" +
"        \n" +
"        .header .search .form-control::placeholder {\n" +
"            color: rgba(0, 52, 187, 0.5);\n" +
"        }\n" +
"        \n" +
"        .main-content {\n" +
"            padding: 0px 20px;\n" +
"        }\n" +
"        \n" +
"        .invoice-container {\n" +
"            max-width: 800px;\n" +
"            margin: auto;\n" +
"            padding: 3rem;\n" +
"            background: #fff;\n" +
"        }\n" +
"        \n" +
"        .invoice-container .top {\n" +
"            margin-bottom: 4rem;\n" +
"            display: flex;\n" +
"            justify-content: space-between;\n" +
"        }\n" +
"        \n" +
"        .invoice-container .top .top-left {\n" +
"            color: #0034BB;\n" +
"        }\n" +
"        \n" +
"        .invoice-container .top .main {\n" +
"            font-size: 40px;\n" +
"            text-transform: uppercase;\n" +
"            font-weight: 500;\n" +
"            display: block;\n" +
"            margin-bottom: 0.5rem;\n" +
"        }\n" +
"        \n" +
"        .invoice-container .top .code {\n" +
"            font-size: 24px;\n" +
"        }\n" +
"        \n" +
"        .invoice-container .top .date {\n" +
"            font-size: 18px;\n" +
"            color: #ADADAD;\n" +
"            margin-bottom: 10px;\n" +
"        }\n" +
"        \n" +
"        .bill-box {\n" +
"            display: flex;\n" +
"            justify-content: space-between;\n" +
"            margin-bottom: 4rem;\n" +
"            color: #ADADAD;\n" +
"        }\n" +
"        \n" +
"        .bill-box .left,\n" +
"        .bill-box .right {\n" +
"            max-width: 240px;\n" +
"        }\n" +
"        \n" +
"        .bill-box .text-m {\n" +
"            font-size: 18px;\n" +
"            margin-bottom: 1rem;\n" +
"            text-transform: uppercase;\n" +
"        }\n" +
"        \n" +
"        .bill-box .title {\n" +
"            font-size: 2rem;\n" +
"            margin-bottom: 1rem;\n" +
"            font-weight: 500;\n" +
"            color: #2B2B2B;\n" +
"        }\n" +
"        \n" +
"        .table-bill table {\n" +
"            width: 100%;\n" +
"            border-collapse: 0px;\n" +
"            border-spacing: 0px;\n" +
"            font-size: 1rem;\n" +
"        }\n" +
"        \n" +
"        .table-bill th,\n" +
"        .table-bill td {\n" +
"            text-align: left;\n" +
"            padding: 10px 10px;\n" +
"            font-weight: 500;\n" +
"        }\n" +
"        \n" +
"        .table-bill td {\n" +
"            padding: 15px 10px;\n" +
"        }\n" +
"        \n" +
"        .table-bill th {\n" +
"            text-transform: uppercase;\n" +
"            color: #0034BB;\n" +
"            font-weight: 500;\n" +
"        }\n" +
"        \n" +
"        .table-bill .quantity {\n" +
"            width: 100px;\n" +
"        }\n" +
"        \n" +
"        .table-bill .cost {\n" +
"            text-align: right;\n" +
"            white-space: nowrap;\n" +
"        }\n" +
"        \n" +
"        .table-bill .total {\n" +
"            font-size: 24px;\n" +
"            color: #0034BB;\n" +
"        }\n" +
"        \n" +
"        .table-bill .total td {\n" +
"            font-weight: normal;\n" +
"            border-top: 1px solid #ececec;\n" +
"        }\n" +
"        \n" +
"        .table-bill .total .number {\n" +
"            text-align: right;\n" +
"            font-weight: 600;\n" +
"        }\n" +
"        \n" +
"        .actions {\n" +
"            text-align: center;\n" +
"            margin-top: 4rem;\n" +
"        }\n" +
"        \n" +
"        .actions .btn {\n" +
"            margin: 3px;\n" +
"            padding: 8px 10px;\n" +
"            font-size: 1rem;\n" +
"            text-transform: uppercase;\n" +
"            font-weight: bold;\n" +
"            border: 0px;\n" +
"            min-width: 130px;\n" +
"            color: #0034BB;\n" +
"            border-radius: 8px;\n" +
"            background: rgba(0, 52, 187, 0.06);\n" +
"            cursor: pointer;\n" +
"        }\n" +
"        \n" +
"        .actions .btn:hover {\n" +
"            background: rgba(0, 52, 187, 0.1);\n" +
"        }\n" +
"        \n" +
"        .note {\n" +
"            text-align: center;\n" +
"            margin-top: 1rem;\n" +
"            font-size: 12px;\n" +
"            color: #ADADAD;\n" +
"        }\n" +
"        \n" +
"        @media (max-width: 1320px) {\n" +
"            body,\n" +
"            html {\n" +
"                font-size: 14px;\n" +
"            }\n" +
"            .invoice-container .top .date {\n" +
"                font-size: 14px;\n" +
"            }\n" +
"            .invoice-container .top .main {\n" +
"                font-size: 32px;\n" +
"            }\n" +
"            .invoice-container .top .code {\n" +
"                font-size: 18px;\n" +
"            }\n" +
"            .bill-box .text-m {\n" +
"                font-size: 14px;\n" +
"            }\n" +
"            .bill-box .title {\n" +
"                font-size: 1.5rem;\n" +
"            }\n" +
"            .table-bill .total {\n" +
"                font-size: 16px;\n" +
"            }\n" +
"        }\n" +
"        \n" +
"        @media (max-width: 768px) {\n" +
"            .invoice-container .top {\n" +
"                display: block;\n" +
"            }\n" +
"            .invoice-container .top .top-left {\n" +
"                margin-bottom: 1rem;\n" +
"            }\n" +
"            .bill-box {\n" +
"                display: block;\n" +
"            }\n" +
"            .bill-box .left,\n" +
"            .bill-box .right {\n" +
"                max-width: 100%;\n" +
"            }\n" +
"            .table-bill table,\n" +
"            .table-bill tbody,\n" +
"            .table-bill tfoot,\n" +
"            .table-bill td,\n" +
"            .table-bill th,\n" +
"            .table-bill tr {\n" +
"                display: block;\n" +
"            }\n" +
"            .table-bill th {\n" +
"                display: none;\n" +
"            }\n" +
"            .table-bill tbody tr {\n" +
"                padding: 10px 0px;\n" +
"                border-bottom: 1px solid #e5e5e5;\n" +
"            }\n" +
"            .table-bill tbody tr td:first-child {\n" +
"                display: none;\n" +
"            }\n" +
"            .table-bill td {\n" +
"                padding: 5px 0px;\n" +
"            }\n" +
"            .table-bill .cost {\n" +
"                text-align: left;\n" +
"            }\n" +
"            .table-bill .total {\n" +
"                margin-top: 20px;\n" +
"            }\n" +
"            .table-bill .total td {\n" +
"                border-top: 0px;\n" +
"            }\n" +
"            .table-bill .total .number {\n" +
"                text-align: left;\n" +
"            }\n" +
"        }\n" +
"        \n" +
"        @media (max-width: 420px) {\n" +
"            .actions .btn {\n" +
"                width: 100%;\n" +
"                margin: 5px 0px;\n" +
"            }\n" +
"            .header {\n" +
"                display: block;\n" +
"            }\n" +
"        }\n" +
"    </style>\n" +
"    <div class=\"main-content\">\n" +
"        <div class=\"invoice-container\">\n" +
"            <div class=\"top\">\n" +
"                <div class=\"top-left\">\n" +
"                    <h1 class=\"main\">DELIVERY USAC</h1>\n" +
"                    <span class=\"code\">#"+packages.getLength()+"</span>\n" +
"                </div>\n" +
"                <div class=\"top-right\">\n" +
"                    <div class=\"date\">Fecha: "+packageDelivery.getDateSent()+"</div>\n" +
"                    <div class=\"date\">Codigo: "+packageDelivery.getCode()+"</div>\n" +
"                    <div class=\"date\">Tipo de pago: "+getTypeOfPayment(packageDelivery.getPaymentMethod())+"</div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"bill-box\">\n" +
"                <div class=\"left\">\n" +
"                    <div class=\"text-m\">FACTURA DE:</div>\n" +
"                    <div class=\"title\">DELIVERY USAC</div>\n" +
"                    <div class=\"addr\">Universidad de San Carlos de Guatemala</div>\n" +
"                </div>\n" +
"                <div class=\"right\">\n" +
"                    <div class=\"text-m\">COBRAR A:</div>\n" +
"                    <div class=\"title\">"+packageDelivery.getClient().getUser().getName()+"</div>\n" +
"                    <div class=\"addr\">NIT: "+packageDelivery.getBillingData().getNit()+"</div>\n" +
"                    <div class=\"addr\">"+packageDelivery.getDestiny()+"</div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"table-bill\">\n" +
"                <table class=\"table-service\">\n" +
"                    <thead>\n" +
"                        <th class=\"quantity\">No.</th>\n" +
"                        <th>Descripcion</th>\n" +
"                        <th>Tamaño de paquete</th>\n" +
"                        <th class=\"cost\">Total a pagar</th>\n" +
"                    </thead>\n" +
"                    <tbody>\n" +
"                        <tr>\n" +
"                            <td>"+packageDelivery.getNumberOfPackages()+"</td>\n" +
"                            <td>"+packageDelivery.getDescription()+"</td>\n" +
"                            <td>"+packageDelivery.getSize()+"</td>\n" +
"                            <td class=\"cost\">Q"+packageDelivery.getTotal()+"</td>\n" +
"                        </tr>\n" +       
"                    </tbody>\n" +
"                    <tfoot>\n" +
"                        <tr class=\"total\">\n" +
"                            <td class=\"name\">Total</td>\n" +
"                            <td class=\"name\"></td>\n" +
"                            <td colspan=\"2\" class=\"number\">Q"+packageDelivery.getTotal()+"</td>\n" +
"                        </tr>\n" +
"                    </tfoot>\n" +
"                </table>\n" +
"            </div>\n" +
"            <div class=\"actions\">\n" +
"                <button class=\"btn btn-main\">Imprimir</button>\n" +
"\n" +
"            </div>\n" +
"            <div class=\"note\">\n" +
"                <p>Gracias por trabajar con nosotros</p>\n" +
"                <p>DELIVERY USAC</p>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"</body>\n" +
"\n" +
"</html>";

        // Escribe el contenido en un archivo HTML
        Files.write(Paths.get("file.html"), content.getBytes(StandardCharsets.UTF_8));

        // Abre el archivo HTML en el navegador predeterminado
        File file = new File("file.html");
        Desktop.getDesktop().browse(file.toURI());
    }
    
    public static String getTypeRole(Integer type){
        String role="";
        switch (type) {
            case 0:
                role="Administrador";
                break;
                case 1:
                role= "Cliente";
                break;
            default:
                throw new AssertionError();
        }
        return role;
    }
    
    public static Client getClientFound() {
        return clientFound;
    }

    public static void setClientFound(Client clientFound) {
        SG.clientFound = clientFound;
    }
    
    public static User getUserFound() {
        return userFound;
    }

    public static void setUserFound(User userFound) {
        SG.userFound = userFound;
    }
    
    public static String getSESSION_DPI() {
        return SESSION_DPI;
    }

    public static void setSESSION_DPI(String SESSION_DPI) {
        SG.SESSION_DPI = SESSION_DPI;
    }

    public static Users getUser() {
        return user;
    }

    public static void setUser(Users user) {
        SG.user = user;
    }

    public static Integer getSESSION_ROLE() {
        return SESSION_ROLE;
    }

    public static void setSESSION_ROLE(Integer SESSION_ROLE) {
        SG.SESSION_ROLE = SESSION_ROLE;
    }
    
    
}
