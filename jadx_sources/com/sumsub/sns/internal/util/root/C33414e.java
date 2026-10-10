package com.sumsub.sns.internal.util.root;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33844oi;
import java.io.File;
import java.util.Set;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.util.root.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33414e {

    /* JADX INFO: renamed from: a */
    public final String[] f68126a = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/", "/debug_ramdisk/"};

    /* JADX INFO: renamed from: b */
    public final String[] f68127b = {CmcdConfiguration.KEY_STARTUP, "Superuser", "superuser"};

    /* JADX INFO: renamed from: c */
    public final String[] f68128c = {"magisk", "magiskpolicy", "magisk32", "magisk64", "magiskhide", "magiskinit"};

    /* JADX INFO: renamed from: d */
    public Set f68129d;

    /* JADX INFO: renamed from: a */
    public final boolean m71701a(String str) {
        boolean z11 = false;
        for (String str2 : m71700a()) {
            File file = new File(str2, str);
            if (file.exists() || file.canRead() || file.canWrite() || file.length() > 0) {
                String str3 = str2 + str;
                Logger.DefaultImpls.w$default(C33272c.f67812a, "SNSRootChecker", "Binary found: " + str3, null, 4, null);
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: a */
    public final Set m71700a() {
        Set set = this.f68129d;
        if (set != null) {
            return set;
        }
        Set mutableSet = ArraysKt.toMutableSet(this.f68126a);
        String str = System.getenv("PATH");
        if (str != null && !Intrinsics.areEqual("", str)) {
            for (String str2 : StringsKt.split$default((CharSequence) str, new String[]{C33844oi.f71346o}, false, 0, 6, (Object) null)) {
                if (!StringsKt.endsWith$default(str2, "/", false, 2, (Object) null)) {
                    str2 = str2 + "/";
                }
                if (!mutableSet.contains(str2)) {
                    mutableSet.add(str2);
                }
            }
            this.f68129d = mutableSet;
        }
        return mutableSet;
    }
}
