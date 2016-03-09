package ch.heigvd.res.io;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohammadhossein
 */
public class CsvSerializer implements ISerializer {
    
    @Override
    public void serialize(IData data , FileOutputStream ps){
        
        String csv = 
                ((MyExperimentData)data).getOperation() + ";" + 
                ((MyExperimentData)data).getStrategy() + ";" + 
                ((MyExperimentData)data).getBlockSize() + ";" + 
                ((MyExperimentData)data).getFileSizeInBytes() + ";" + 
                ((MyExperimentData)data).getDurationInMs() ;
                       
        try {
            ps.write(csv.getBytes("UTF8"));
            ps.write("\n".getBytes("UTF8"));
        } catch (IOException ex) {
            Logger.getLogger(CsvSerializer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
