package db;

import java.io.Serial;

public class DbIntegretyException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    public DbIntegretyException(String msg){
        super(msg);
    }

}
