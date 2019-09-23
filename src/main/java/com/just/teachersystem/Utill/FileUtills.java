package com.just.teachersystem.Utill;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;

@Configuration
@PropertySource(value = {"classpath:application.properties"})
@Component
public class FileUtills {


        private static int k=0;

        private String basePath;

        public String filesupload(List<MultipartFile> files){

            if(files.isEmpty()){
                return null;
            }
            SimpleDateFormat sd=new SimpleDateFormat("/yyyy/MM/dd");
            String dirPath = sd.format(new Date());
            for (MultipartFile file:files) {

                if(files.isEmpty()){
                    return null;
                }else {
                    File dest=new File(dirPath+"/"+k+ file.getName());
                    if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
                        dest.getParentFile().mkdir();
                    }
                    try {
                        file.transferTo(dest);
                    }catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        return null;
                    }

                }
                k++;
            }
            return "";
        }


}
