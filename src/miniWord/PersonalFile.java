/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniWord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author juju
 */
public class PersonalFile {
    private File file;
    private String currentPath;
    
    public boolean selectFile () {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Abrir nuevo rchivo");
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("Solo se permiten archivos .txt", "txt");
        fileChooser.setFileFilter(txtFilter);
        int action  = fileChooser.showOpenDialog(null);
        if (action != JFileChooser.APPROVE_OPTION) {
            System.out.println("bye!!");
            return false;
        }
        this.file = fileChooser.getSelectedFile();
        this.currentPath = this.file.getAbsolutePath();
        return true;
    }
    
    public static String encriptContent (String pass, String algorit, String txt) throws Exception{
        byte[] encrypt = null;
        Cipher inst = Cipher.getInstance(algorit);
        SecretKey key = new SecretKeySpec(pass.getBytes(), algorit);
        inst.init(inst.ENCRYPT_MODE, key);
        encrypt = inst.doFinal(txt.getBytes());
        System.out.println(txt);
        System.out.println(inst);
        System.out.println(encrypt);
        System.out.println(Base64.getEncoder().encodeToString(encrypt));
        return Base64.getEncoder().encodeToString(encrypt);
    }
    
    public static String decriptContent (String pass, String algorit,String txt) throws Exception{
        byte[] decript = null;
        Cipher inst = Cipher.getInstance(algorit);            
        SecretKey key = new SecretKeySpec(pass.getBytes(), algorit);
        inst.init(inst.DECRYPT_MODE, key);
        decript = inst.doFinal(Base64.getDecoder().decode(txt));
        return new String(decript);
    
    }
    public FileWriter getFileByPath (String path) {
        try {
            FileWriter fileByPath = new FileWriter(path);
            return fileByPath;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }  
    
    public void saveAs (String text) {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Guardar como");
        int selection = chooser.showSaveDialog(null);
        if (selection != JFileChooser.APPROVE_OPTION) return;
        
        this.file = chooser.getSelectedFile();
        String path = this.file.getAbsolutePath();
        try (BufferedWriter bw = new BufferedWriter(this.getFileByPath(path));) {
                bw.write(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String readFile (String path) {
        StringBuilder contend = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null ) {
                contend.append(line).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return contend.toString();
    } 
    
    public void writeFile (File file, String text) {
        try (
            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
           out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static SecretKeySpec getInstancePrivateKey (String type) {
        return new SecretKeySpec("juju".getBytes(), type);
    } 
    
    public String getInformation () {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm");
        return this.file.getName() + " modificado el: " + sdf.format(new Date(this.file.lastModified()));
    }

    public File getFile() {
        return file;
    }

    public String getCurrentPath() {
        return currentPath;
    }
}
