package com.qfedu.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectResult;
import com.qfedu.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: JingWang
 * Date: 2020/9/4
 * Time: 19:34
 * Code introduction:
 */


public class OSSUtils {
    public static String upLoad(MultipartFile file, User user) throws IOException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "oss-cn-hangzhou.aliyuncs.com";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAI4GH4S587WvxQDi1WN1op";
        String accessKeySecret = "XixVtNaG9IwDxIcq279VkADqDaCFSS";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId,accessKeySecret);


        byte[] content = file.getBytes();

        // 上传本地文件流
        //InputStream inputStream = new FileInputStream(file);

        PutObjectResult putObjectResult = ossClient.putObject("mac-mini", "Virtual/"+user.getId() + ".jpg",new ByteArrayInputStream(content));
        //System.out.println(putObjectResult);
        // 关闭OSSClient。
        ossClient.shutdown();

        Date expiration = new Date(System.currentTimeMillis() + 3600L * 1000 * 24 * 365 );
        String url = ossClient.generatePresignedUrl("mac-mini", "Virtual/"+user.getId() + ".jpg", expiration).toString();
        System.out.println(url);

        return url;
    }

    //获取上传文件的url

}
