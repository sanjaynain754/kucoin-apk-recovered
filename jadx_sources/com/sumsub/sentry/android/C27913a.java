package com.sumsub.sentry.android;

import android.os.Build;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C34052z4;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sentry.android.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27913a {
    /* JADX INFO: renamed from: a */
    public final boolean m68994a() {
        try {
            if (StringsKt.startsWith$default(Build.BRAND, "generic", false, 2, (Object) null) && StringsKt.startsWith$default(Build.DEVICE, "generic", false, 2, (Object) null)) {
                return true;
            }
            String str = Build.FINGERPRINT;
            if (StringsKt.startsWith$default(str, "generic", false, 2, (Object) null) || StringsKt.startsWith$default(str, "unknown", false, 2, (Object) null)) {
                return true;
            }
            String str2 = Build.HARDWARE;
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "goldfish", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "ranchu", false, 2, (Object) null)) {
                return true;
            }
            String str3 = Build.MODEL;
            if (StringsKt.contains$default((CharSequence) str3, (CharSequence) "google_sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str3, (CharSequence) "Emulator", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str3, (CharSequence) "Android SDK built for x86", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) Build.MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null)) {
                return true;
            }
            String str4 = Build.PRODUCT;
            return StringsKt.contains$default((CharSequence) str4, (CharSequence) "sdk_google", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str4, (CharSequence) "google_sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str4, (CharSequence) "sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str4, (CharSequence) "sdk_x86", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str4, (CharSequence) "vbox86p", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str4, (CharSequence) C34052z4.f72600l, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str4, (CharSequence) "simulator", false, 2, (Object) null);
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error checking whether application is running in an emulator.", th2);
            return false;
        }
    }
}
