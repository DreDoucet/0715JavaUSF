package com.drivers;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataDBDriver <T>{    
    
    public boolean writerFile(T t, String filename) {
        FileOutputStream fileOut = null ;
        File file = null;
        List<T> objTemp = new ArrayList<>();    
        
        try {
            file = new File(filename);            
            if(!file.exists()) {
                file.createNewFile();                
            }else {
                ObjectInputStream objt = new ObjectInputStream( new FileInputStream(file));
                objTemp = (List<T>) objt.readObject();
            }
            
                
            objTemp.add(t);
                                            
            ObjectOutputStream obj = new ObjectOutputStream( new FileOutputStream(file));
            obj.writeObject(objTemp);
            obj.close();
            return true;
            
        }catch(Exception fileExp) {
            fileExp.printStackTrace();
            return false;            
        }
    }
    
    public boolean updateFile(List<T> aList,  String filename) {
//      FileOutputStream fileOut = null ;
      File file = null;
      if(!aList.isEmpty()) {
          try {
              file = new File(filename);            
              if(file.exists()) {
                  ObjectOutputStream obj = new ObjectOutputStream( new FileOutputStream(file));
                  obj.writeObject(aList);
                  obj.close();
                  return true;
              }else return false;
          }catch(Exception e) {
              e.printStackTrace();
              return false;
          }            
      } else return false;
  }
    
    public  List<T>  readFile(String filename) {
        
             
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream obj = new ObjectInputStream(file);
            
            List<T> t = (List<T>) obj.readObject();
            
            return t;
                        
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
        
    }
    
    
}