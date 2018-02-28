package cn.liup127.code.androidutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.liup127.code.androidutils.utils.ActionSheetDialog;
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
    }

    private void editTextHintUtilsTest() {
        EditTextHintUtils.setEtListener(hintTest, 18, "输入文字和提示大小不一样");
    }

    private void versionCodeNameTest() {
        version.setText("获取工具VersionName:" + GetVersion.getVersionName(this) + " VersionCode:" + GetVersion.getVersionCode(this));
    }


    public void light1(View view) {
        //方式1
        StatusBarFontHelper.setStatusBarMode(this, true);
    }

    public void light2(View view) {
        //方式2
        StatusBarFontHelper.setLightMode(this, StatusBarFontHelper.MIUI);
        //        StatusBarFontHelper.setStatusBarMode(this, StatusBarFontHelper.FLYME);
        //        StatusBarFontHelper.setStatusBarMode(this, StatusBarFontHelper.ANDROID_M);
    }

    public void light3(View view) {
        //方式3
        StatusBarFontHelper.setDarkMode(this, StatusBarFontHelper.MIUI);
        //        StatusBarFontHelper.setDarkMode(this, StatusBarFontHelper.FLYME);
        //        StatusBarFontHelper.setDarkMode(this, StatusBarFontHelper.ANDROID_M);
    }

    public void iosDialog(View view) {
        new ActionSheetDialog(this)
                .builder()
                .setTitle("请选择性别")
                .setCancelable(false)
                .setCanceledOnTouchOutside(false)
                .addSheetItem("男", ActionSheetDialog.SheetItemColor.Blue,
                        new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this,"男",Toast.LENGTH_LONG).show();
                            }
                        }).addSheetItem("女", ActionSheetDialog.SheetItemColor.Blue,
                new ActionSheetDialog.OnSheetItemClickListener() {
                    @Override
                    public void onClick(int which) {
                        Toast.makeText(MainActivity.this,"女",Toast.LENGTH_LONG).show();
                    }
                }).show();
    }
}
