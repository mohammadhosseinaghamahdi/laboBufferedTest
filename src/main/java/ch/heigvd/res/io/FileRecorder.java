package ch.heigvd.res.io;



import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author mohammadhossein
 */
public class FileRecorder implements IRecorder{

    
    public void record(IData data) {
        serializer.serialize(data, ps);
    }
    
    
    public FileRecorder(String fileName ,  ISerializer serializer , String title) {
        this.fileName = fileName;
        this.serializer = serializer;
        try {
            ps = new FileOutputStream(fileName);
            ps.write(title.getBytes("UTF8"));
            ps.write("\n".getBytes("UTF8"));
        }catch (IOException ex) {
           ex.getStackTrace();
        }
            

            
    }
    
    private String fileName;
    private ISerializer serializer;
    private FileOutputStream ps;
}
