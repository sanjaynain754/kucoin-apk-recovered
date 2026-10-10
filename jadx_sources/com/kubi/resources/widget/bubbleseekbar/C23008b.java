package com.kubi.resources.widget.bubbleseekbar;

import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.b */
/* JADX INFO: compiled from: BubbleUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class C23008b {

    /* JADX INFO: renamed from: a */
    public static Properties f44388a = new Properties();

    /* JADX INFO: renamed from: b */
    public static Boolean f44389b;

    /* JADX INFO: renamed from: a */
    public static int m55029a(int i11) {
        return (int) TypedValue.applyDimension(1, i11, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: c */
    public static int m55031c(int i11) {
        return (int) TypedValue.applyDimension(2, i11, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m55030b() throws Throwable {
        Boolean bool = f44389b;
        if (bool != null) {
            return bool.booleanValue();
        }
        FileInputStream fileInputStream = null;
        try {
            if (Build.VERSION.SDK_INT < 26) {
                try {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
                        try {
                            f44388a.load(fileInputStream2);
                            fileInputStream2.close();
                        } catch (IOException e11) {
                            e = e11;
                            fileInputStream = fileInputStream2;
                            C44128b.m97264h(e);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            f44389b = Boolean.valueOf(f44388a.containsKey("ro.miui.ui.version.name"));
                            return f44389b.booleanValue();
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e12) {
                                    C44128b.m97264h(e12);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e13) {
                        e = e13;
                    }
                    f44389b = Boolean.valueOf(f44388a.containsKey("ro.miui.ui.version.name"));
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                try {
                    f44389b = Boolean.valueOf(!TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.miui.ui.version.name")));
                } catch (Exception unused) {
                    f44389b = Boolean.FALSE;
                }
            }
        } catch (IOException e14) {
            C44128b.m97264h(e14);
        }
        return f44389b.booleanValue();
    }
}
