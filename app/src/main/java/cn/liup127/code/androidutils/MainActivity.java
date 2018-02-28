package cn.liup127.code.androidutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.liup127.code.androidutils.utils.EditTextHintUtils;
import cn.liup127.code.androidutils.utils.GetVersion;
import cn.liup127.code.androidutils.utils.statusdark.StatusBarFontHelper;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.hintTest)
    EditText hintTest;
    @BindView(R.id.version)
    TextView version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        editTextHintUtilsTest();//EditText文字输入文字和提示大小不一样工具
        versionCodeNameTest();//获取版本号和名字
        setStatusBarDark();//状态栏文字图标变黑色，（为了使用白色背景）
    }

    private void editTextHintUtilsTest() {
        EditTextHintUtils.setEtListener(hintTest, 18, "输入文字和提示大小不一样");

    }

    private void versionCodeNameTest() {
        version.setText("获取工具VersionName:" + GetVersion.getVersionName(this) + " VersionCode:" + GetVersion.getVersionCode(this));
    }

    private void setStatusBarDark() {
        //方式1
        StatusBarFontHelper.setStatusBarMode(this, true);
        //方式2
        //        StatusBarFontHelper.setLightMode(this, StatusBarFontHelper.MIUI);
        //        StatusBarFontHelper.setStatusBarMode(this, StatusBarFontHelper.FLYME);
        //        StatusBarFontHelper.setStatusBarMode(this, StatusBarFontHelper.ANDROID_M);
        //方式3
        //        StatusBarFontHelper.setDarkMode(this, StatusBarFontHelper.MIUI);
        //        StatusBarFontHelper.setDarkMode(this, StatusBarFontHelper.FLYME);
        //        StatusBarFontHelper.setDarkMode(this, StatusBarFontHelper.ANDROID_M);
    }


}
