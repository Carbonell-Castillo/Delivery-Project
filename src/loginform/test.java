/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginform;
import com.barcodelib.barcode.Linear;
import java.io.*;
import java.util.*;
import com.google.zxing.*;
import com.google.zxing.common.*;
import com.google.zxing.qrcode.*;
import com.google.zxing.qrcode.decoder.*;
import com.google.zxing.EncodeHintType;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import java.awt.image.BufferedImage;


/**
 *
 * @author brand
 */
public class test {
         public static void main(String[] args) throws IOException {
        // Crear el objeto Code128Bean
             try {
                 Linear barcode = new Linear();
                 barcode.setType(Linear.CODE128B);
                 barcode.setData("1223");
                 barcode.setI(11.0f);
                 String fname="123";
                 barcode.renderBarcode("C:\\Users\\brand\\Desktop\\Bruce\\USAC\\IPC\\-IPC1-S12023_Proyecto1_-202203069-\\src\\barCodes\\"+fname+".png");
                         
             } catch (Exception e) {
                 System.out.println("error");
             }
    }
}
