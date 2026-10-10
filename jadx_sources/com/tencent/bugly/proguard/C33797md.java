package com.tencent.bugly.proguard;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.md */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33797md {

    /* JADX INFO: renamed from: b */
    public static final String f70960b = "unknown";

    /* JADX INFO: renamed from: a */
    public static final Pattern f70959a = Pattern.compile("(([1-9]\\d*|0)\\.){0,2}([1-9]\\d*)");

    /* JADX INFO: renamed from: c */
    public static final SparseArray<String> f70961c = new a();

    /* JADX INFO: renamed from: a */
    public static String m74119a(int i11, String str) {
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            return m74118a(i11);
        }
        Matcher matcher = f70959a.matcher(str);
        String strGroup = matcher.find() ? matcher.group() : null;
        return TextUtils.isEmpty(strGroup) ? m74118a(i11) : strGroup;
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.md$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends SparseArray<String> {
        public a() {
            append(15, "4.0.3");
            append(16, "4.1");
            append(17, "4.2");
            append(18, "4.3");
            append(19, "4.4");
            append(20, "4.4");
            append(21, "5");
            append(22, "5.1");
            append(23, "6");
            append(24, TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO);
            append(25, "7.1");
            append(26, "8");
            append(27, "8.1");
            append(28, "9");
            append(29, "10");
            append(30, "11");
            append(31, TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_TYPING);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m74120b(int i11, String str) {
        if (str != null) {
            str = str.trim();
        }
        return "Android " + str + ",level " + i11;
    }

    /* JADX INFO: renamed from: a */
    public static String m74118a(int i11) {
        String str = f70961c.get(i11);
        return TextUtils.isEmpty(str) ? "unknown" : str;
    }
}
