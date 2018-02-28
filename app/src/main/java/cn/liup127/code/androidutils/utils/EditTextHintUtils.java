package cn.liup127.code.androidutils.utils;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.style.AbsoluteSizeSpan;
import android.widget.EditText;

/**
 * @title EditText文字输入文字和提示大小不一样工具
 * @desc .
 * Created by liup on 2018/2/6.
 */

public class EditTextHintUtils {
    /**
     * @param et       EditText
     * @param hintSize 提示文字大小
     * @param hintText 提示文字
     */
    public static void setEtListener(final EditText et, final int hintSize, String hintText) {
        //监听输入用来动态改变字体的大小
        SpannableString ss = new SpannableString(hintText);
        // 新建一个属性对象,设置文字的大小
        AbsoluteSizeSpan ass = new AbsoluteSizeSpan(hintSize,true);
        // 附加属性到文本
        ss.setSpan(ass, 0, ss.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        et.setHint(new SpannedString(ss));

    }
}
