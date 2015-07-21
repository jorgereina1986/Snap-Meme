package gmsyrimis.c4q.nyc.cammy;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by c4q-jorgereina1986 on 7/17/15.
 */

@DatabaseTable
public class PopMeme {
    @DatabaseField(generatedId = true) //Id is automatically generated for us
    private int id;

    @DatabaseField
    private int picture;

    public PopMeme() {
    }

    public PopMeme(int picture) {
        this.picture = picture;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
