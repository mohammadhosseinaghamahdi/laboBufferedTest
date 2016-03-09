package ch.heigvd.res.io;


import ch.heigvd.res.io.BufferedIOBenchmark.IOStrategy;


/**
 *
 * @author mohammadhossein
 */
public class MyExperimentData implements IData{
    public MyExperimentData(String operation , IOStrategy strategy ,  int blockSize, long fileSizeInBytes, long durationInMs){
        this.operation = operation;
        this.strategy = strategy;
        this.blockSize = blockSize;
        this.fileSizeInBytes = fileSizeInBytes;
        this.durationInMs = durationInMs;
    }
    public String getOperation(){
        return operation;
    }
    
    
    public IOStrategy getStrategy(){
        return strategy;
    }
    
    
    public int getBlockSize(){
        return blockSize;
    }
    
    public long getFileSizeInBytes (){
        return fileSizeInBytes;
    }
    
    public long getDurationInMs(){
        return durationInMs;
    }
    
    private final String operation;
    private final IOStrategy strategy;
    private final int blockSize;
    private final long fileSizeInBytes;
    private final long durationInMs;
}
