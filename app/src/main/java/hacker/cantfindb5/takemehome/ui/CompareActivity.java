package hacker.cantfindb5.takemehome.ui;

import android.os.Bundle;

import com.isnc.facesdk.aty.Aty_BaseGroupCompare;

/**
 * This is a file created by sunny on 5/21/16 for TakeMeHome
 * Contact sunny via sunny@mogara.org for cooperation.
 */
public class CompareActivity extends Aty_BaseGroupCompare {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        int[] size = {480,640};
        this.initFacesFeature(null);
        setCameraType(0);
        facesDetect("066ece45c805d77a7f1eee93", "test");
    }
}
