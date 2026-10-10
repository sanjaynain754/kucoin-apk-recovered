package com.google.android.gms.internal.fido;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzhp implements Comparable {
    public abstract int zza();

    public int zzb() {
        return 0;
    }

    public static int zzd(byte b11) {
        return (b11 >> 5) & 7;
    }

    public static zzhk zzg(long j11) {
        return new zzhk(j11);
    }

    public static zzhn zzi(String str) {
        return new zzhn(str);
    }

    public static zzhp zzk(InputStream inputStream) throws zzhj {
        return zzhq.zza(inputStream, new zzhs(inputStream));
    }

    public final zzhi zze() throws zzho {
        return (zzhi) zzc(zzhi.class);
    }

    public final zzhk zzf() throws zzho {
        return (zzhk) zzc(zzhk.class);
    }

    public final zzhm zzh() throws zzho {
        return (zzhm) zzc(zzhm.class);
    }

    private final zzhp zzc(Class cls) throws zzho {
        if (cls.isInstance(this)) {
            return (zzhp) cls.cast(this);
        }
        throw new zzho("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }

    public static zzhp zzj(byte... bArr) throws zzhj {
        bArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length));
        return zzhq.zza(byteArrayInputStream, new zzhs(byteArrayInputStream));
    }
}
