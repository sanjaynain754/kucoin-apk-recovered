package p387k;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;

/* JADX INFO: renamed from: k.j */
/* JADX INFO: loaded from: classes23.dex */
public class C40835j {
    /* JADX INFO: renamed from: a */
    public static void m89367a(Activity activity, int i11) {
        float f11;
        if (activity != null) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (i11 == -1) {
                f11 = -1.0f;
            } else {
                if (i11 <= 0) {
                    i11 = 1;
                }
                f11 = i11 / 255.0f;
            }
            attributes.screenBrightness = f11;
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m89369c() {
        return System.currentTimeMillis() + "_" + UUID.randomUUID().toString() + "_android_" + new Random().nextInt(10);
    }

    /* JADX INFO: renamed from: b */
    public static String m89368b() {
        return Locale.getDefault().toString();
    }
}
