package prototypePattern;

import com.sun.xml.internal.bind.v2.util.QNameMap;
import com.sun.xml.internal.bind.v2.util.XmlFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;
import java.io.InputStream;

public class PrototypePatternDemo {

    public static void main(String[] args) throws IOException {
//        ShapeCache.loadShape();
//
//        Shape shape = ShapeCache.getShape("1");
//        System.out.println("shape : " +shape.getType());
//
//        Shape shape1 = ShapeCache.getShape("2");
//        System.out.println("shape : " +shape1.getType());

//        FileSystemResource fileSystemResource= new FileSystemResource("D:/物品(1).xlsx");
//        InputStream inputStream = fileSystemResource.getInputStream();
//        System.out.println(fileSystemResource.getFilename());
//        byte b[] = new byte[1024];
//        int len = 0;
//        int temp=0;          //所有读取的内容都使用temp接收
//        while((temp=inputStream.read(b))!=-1){    //当没有读取完时，继续读取
//            System.out.println(new String(b,"utf-8"));
//        }
//        inputStream.close();
//        ResourcePatternResolver resourcePatternResolver= new PathMatchingResourcePatternResolver();
        String path="G:\\Workspace\\idea-test\\myDesignPattern\\creatingMode\\src\\main\\resources\\com\\beans.xml";
//        Resource[] resource = resourcePatternResolver.getResources(path);
//        for (Resource re:resource) {
//            System.out.println(re.getFilename());
//            System.out.println(re.getDescription());
//        }

//        Resource resource = resourcePatternResolver.getResource(path);
//        FileSystemResource resource = new FileSystemResource(path);
//
//        BeanFactory bf = new XmlBeanFactory(resource);
//        Square square = bf.getBean("square", Square.class);
        ApplicationContext context = new FileSystemXmlApplicationContext(path);
        Square square =(Square) context.getBean("square");
//        System.out.println(square.getId());




    }
}
