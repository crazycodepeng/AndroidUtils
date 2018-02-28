package cn.liup127.code.androidutils.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * 获取versionCode、versionName
 * */
public class GetVersion {
    public static String getVersionName(Context context){//versionName
        try {
            PackageManager manager = context.getPackageManager();
            PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
            String version = info.versionName;
            return  version;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int getVersionCode(Context context)//获取版本号(内部识别号)
    {
        try {
            PackageInfo pi=context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return pi.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

//    public static void versionForceUpdate(Activity activity){
//        /*需要强制升级*/
//        UpdateHelper.getInstance().init(activity.getApplicationContext(), Color.parseColor("#ef508d"));
//        UpdateHelper.getInstance().autoUpdate(activity.getPackageName(),true, 1);
//    }
//    public static void versionAutoUpdate(Activity activity){
//        //提示更新
//        UpdateHelper.getInstance().init(activity.getApplicationContext(), Color.parseColor("#ef508d"));
//        UpdateHelper.getInstance().manualUpdate(activity.getPackageName());
//    }
}
