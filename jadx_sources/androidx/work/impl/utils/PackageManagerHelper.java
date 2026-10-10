package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Logger;
import com.tencent.bugly.proguard.C33627eb;

/* JADX INFO: loaded from: classes34.dex */
public class PackageManagerHelper {
    private static final String TAG = Logger.tagWithPrefix("PackageManagerHelper");

    public static boolean isComponentExplicitlyEnabled(@NonNull Context context, @NonNull Class<?> cls) {
        return isComponentExplicitlyEnabled(context, cls.getName());
    }

    public static boolean isComponentExplicitlyEnabled(@NonNull Context context, @NonNull String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str)) == 1;
    }

    public static void setComponentEnabled(@NonNull Context context, @NonNull Class<?> cls, boolean z11) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z11 ? 1 : 2, 1);
            Logger logger = Logger.get();
            String str = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(C33627eb.f69716f);
            sb2.append(z11 ? "enabled" : "disabled");
            logger.debug(str, sb2.toString());
        } catch (Exception e11) {
            Logger logger2 = Logger.get();
            String str2 = TAG;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z11 ? "enabled" : "disabled");
            logger2.debug(str2, sb3.toString(), e11);
        }
    }

    private PackageManagerHelper() {
    }
}
