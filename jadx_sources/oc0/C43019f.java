package oc0;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: oc0.f */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C43019f {
    /* JADX INFO: renamed from: a */
    public static String m94494a(String str, AtomicLong atomicLong) {
        return (str + C33820nf.f71144W + Long.toHexString(atomicLong.getAndIncrement())).toUpperCase();
    }

    /* JADX INFO: renamed from: b */
    public static String m94495b(int i11) {
        String strM94487a = C43017d.m94487a();
        if (strM94487a == null) {
            strM94487a = "127.0.0.1";
        }
        return Hashing.farmHashFingerprint64().hashString(strM94487a + C33820nf.f71144W + ("cls-producer" + String.valueOf(new Date().getTime())) + C33820nf.f71144W + i11, Charsets.US_ASCII).toString();
    }
}
