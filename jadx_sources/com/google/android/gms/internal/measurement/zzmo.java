package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzmo {
    static final Charset zza;
    public static final byte[] zzb;

    public static int zzc(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        int i11 = zzli.zza;
        try {
            new zzlh(bArr, 0, 0, false, null).zza(0);
        } catch (zzmq e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static int zzb(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    public static boolean zzd(zznl zznlVar) {
        if (zznlVar instanceof zzks) {
            throw null;
        }
        return false;
    }
}
