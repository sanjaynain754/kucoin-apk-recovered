package com.geetest.gtc4;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import com.geetest.gtc4.AbstractC6891u3;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.function.Consumer;

/* JADX INFO: renamed from: com.geetest.gtc4.u3 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6891u3 {
    /* JADX INFO: renamed from: a */
    public static void m12728a(final Context context) {
        Application application;
        WindowManager windowManager;
        try {
            if (Build.VERSION.SDK_INT >= 35 && context != null && (application = (Application) context.getApplicationContext()) != null && (windowManager = (WindowManager) application.getSystemService(InterfaceC33953u5.f72199F)) != null) {
                windowManager.addScreenRecordingCallback(application.getMainExecutor(), new Consumer() { // from class: v7.g
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        AbstractC6891u3.m12729a(context, (Integer) obj);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12729a(Context context, Integer num) {
        try {
            AbstractC6882t3.m12717a(num.intValue(), context.getSharedPreferences("gt_core", 0));
        } catch (Exception unused) {
        }
    }
}
