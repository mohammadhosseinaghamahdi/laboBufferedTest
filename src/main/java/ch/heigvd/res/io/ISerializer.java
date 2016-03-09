package ch.heigvd.res.io;

import java.io.FileOutputStream;
//import java.io.PrintStream;

/**
 *
 * @author mohammadhossein
 */
public interface ISerializer {
    void serialize(IData data , FileOutputStream ps);
}
