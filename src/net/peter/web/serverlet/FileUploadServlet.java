package net.peter.web.serverlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@WebServlet("/fileUpload")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("username="+username);
        Part part = request.getPart("img");


        //获取真实文件名称
        //找到原始的头信息
        String header = part.getHeader("content-disposition");
        //输出是一整串的输出
        //提取拿到原始文件名
        String realFileName = header.substring(header.indexOf("filename=")+10,header.length()-1);
        System.out.println("realFileName="+realFileName);


        //获取真实的文件内容
        InputStream is =  part.getInputStream();
        //web-inf目录外界不能直接访问，如果文件机密性强则放这里
        //String dir = this.getServletContext().getRealPath("/WEB-INF/file");

        String dir = this.getServletContext().getRealPath("/file");

        File dirFile = new File(dir);

        //如果目录不存在，则创建

        if(!dirFile.exists()){
            dirFile.mkdirs();
        }


        //文件流拷贝
        //File file = new File(dir,realFileName);​
        String uniqueName = UUID.randomUUID()+realFileName;
        File file = new File(dir,uniqueName);
        FileOutputStream out = new FileOutputStream(file);

        // 建立缓存存取flow
        byte[] buf = new byte[1024];
        int len;

        while ((len = is.read(buf))!=-1 ){

            //没有到尾部继续写入
            out.write(buf,0,len);
        }

        out.close();
        //关闭流
        is.close();
        //图片访问
        request.getRequestDispatcher("/file/"+uniqueName).forward(request,response);







    }
}
