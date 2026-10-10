package com.tencent.rmonitor.memory.leakdetect;

import android.content.Context;
import android.media.AudioManager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class ActivityLeakSolution {

    /* JADX INFO: renamed from: a */
    public static final String f75274a = "RMonitor_MemoryLeak_ActivityLeakSolution";

    /* JADX INFO: renamed from: b */
    public static boolean f75275b;

    /* JADX INFO: renamed from: a */
    public static void m77185a(Context context, InputMethodManager inputMethodManager) {
        String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
        for (int i11 = 0; i11 < 3; i11++) {
            try {
                Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i11]);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(inputMethodManager);
                if (obj instanceof View) {
                    View view = (View) obj;
                    if (view.getContext() != context) {
                        Logger.INSTANCE.mo77130d(f75274a, "fixInputMethodManagerLeak break, context not suitable", ", get_context=", view.getContext().toString(), ", dest_context=", context.toString());
                        return;
                    }
                    declaredField.set(inputMethodManager, null);
                } else {
                    continue;
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(f75274a, th2);
            }
        }
    }

    public static void fixAudioManagerLeak(@NonNull Context context) {
        if (!f75275b || AndroidVersion.isOverM()) {
            return;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            Field declaredField = audioManager.getClass().getDeclaredField("mContext");
            declaredField.setAccessible(true);
            declaredField.set(audioManager, null);
        } catch (Exception e11) {
            Logger.INSTANCE.mo77131e(f75274a, e11.toString());
        }
    }

    public static void fixInputMethodManagerLeak(@Nullable Context context) {
        InputMethodManager inputMethodManager;
        if (f75275b && context != null) {
            try {
                inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(f75274a, th2);
                inputMethodManager = null;
            }
            if (inputMethodManager == null) {
                return;
            }
            m77185a(context, inputMethodManager);
        }
    }

    public static void setSwitchLeakSolution(boolean z11) {
        f75275b = z11;
    }
}
