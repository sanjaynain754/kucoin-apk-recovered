package androidx.core.telephony;

import android.os.Build;
import android.telephony.SubscriptionManager;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(22)
public class SubscriptionManagerCompat {
    private static Method sGetSlotIndexMethod;

    public static int getSlotIndex(int i11) {
        if (i11 == -1) {
            return -1;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            return Api29Impl.getSlotIndex(i11);
        }
        try {
            if (sGetSlotIndexMethod == null) {
                Class cls = Integer.TYPE;
                if (i12 >= 26) {
                    sGetSlotIndexMethod = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", cls);
                } else {
                    sGetSlotIndexMethod = SubscriptionManager.class.getDeclaredMethod("getSlotId", cls);
                }
                sGetSlotIndexMethod.setAccessible(true);
            }
            Integer num = (Integer) sGetSlotIndexMethod.invoke(null, Integer.valueOf(i11));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }

    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static int getSlotIndex(int i11) {
            return SubscriptionManager.getSlotIndex(i11);
        }
    }

    private SubscriptionManagerCompat() {
    }
}
