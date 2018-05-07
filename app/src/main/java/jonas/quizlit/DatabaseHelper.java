package jonas.quizlit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jonas on 30.04.18.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Fragen.db";
    public static final String TABLE_NAME = "fragen_table";
    public static final String COL_1 = "Frage";
    public static final String COL_2 = "Antwort1";
    public static final String COL_3 = "Antwort2";
    public static final String COL_4 = "Antwort3";
    public static final String COL_5 = "Antwort4";
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
     sqLiteDatabase.execSQL(" create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,Antwort1 TEXT,Antwort2 TEXT,Antwort3 TEXT,Antwort4 TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(sqLiteDatabase);


    }
}
