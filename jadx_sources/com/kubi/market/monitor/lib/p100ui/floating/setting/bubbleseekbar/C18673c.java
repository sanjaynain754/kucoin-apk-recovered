package com.kubi.market.monitor.lib.p100ui.floating.setting.bubbleseekbar;

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

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.bubbleseekbar.c */
/* JADX INFO: compiled from: SettingBubbleUtils.java */
/* JADX INFO: loaded from: classes27.dex */
public class C18673c {

    /* JADX INFO: renamed from: a */
    public static Properties f34367a = new Properties();

    /* JADX INFO: renamed from: b */
    public static Boolean f34368b;

    /* JADX INFO: renamed from: b */
    public static int m40909b(int i11) {
        return (int) TypedValue.applyDimension(1, i11, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: d */
    public static int m40911d(int i11) {
        return (int) TypedValue.applyDimension(2, i11, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m40910c() throws Throwable {
        Boolean bool = f34368b;
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
                            f34367a.load(fileInputStream2);
                            fileInputStream2.close();
                        } catch (IOException e11) {
                            e = e11;
                            fileInputStream = fileInputStream2;
                            C44128b.m97264h(e);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            f34368b = Boolean.valueOf(f34367a.containsKey("ro.miui.ui.version.name"));
                            return f34368b.booleanValue();
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
                    f34368b = Boolean.valueOf(f34367a.containsKey("ro.miui.ui.version.name"));
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                try {
                    f34368b = Boolean.valueOf(!TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.miui.ui.version.name")));
                } catch (Exception unused) {
                    f34368b = Boolean.FALSE;
                }
            }
        } catch (IOException e14) {
            C44128b.m97264h(e14);
        }
        return f34368b.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public static int m40908a(float f11) {
        return (int) TypedValue.applyDimension(1, f11, Resources.getSystem().getDisplayMetrics());
    }
}
