package harshad.com.getpackagename;

import android.content.pm.PackageInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt =(TextView)findViewById(R.id.txtpackage);
        installedApps();

    }


    public void installedApps(){
        List<PackageInfo> packagelist = getPackageManager().getInstalledPackages(0);
        for(int i=0;i<packagelist.size();i++){
            PackageInfo packageInfo = packagelist.get(i);

            String appname = packageInfo.applicationInfo.loadLabel(getPackageManager()).toString();
            String packagename  =packageInfo.packageName;
       /*     final int e = Log.e("App name + package name :::", appname + "-----" + packagename);*/
       txt.append(""+ Integer.toString(i)+"----"+ appname + "----"+packagename+"\n");


        }
    }
}
