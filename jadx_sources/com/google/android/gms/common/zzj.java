package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzj extends com.google.android.gms.common.internal.zzz {
    private final int zza;

    public final boolean equals(@Nullable Object obj) {
        IObjectWrapper iObjectWrapperZzd;
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.zzaa)) {
            try {
                com.google.android.gms.common.internal.zzaa zzaaVar = (com.google.android.gms.common.internal.zzaa) obj;
                if (zzaaVar.zzc() == this.zza && (iObjectWrapperZzd = zzaaVar.zzd()) != null) {
                    return Arrays.equals(zzf(), (byte[]) ObjectWrapper.unwrap(iObjectWrapperZzd));
                }
                return false;
            } catch (RemoteException e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            }
        }
        return false;
    }

    public abstract byte[] zzf();

    public static byte[] zze(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError(e11);
        }
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
        return this.zza;
    }

    public zzj(byte[] bArr) {
        boolean z11;
        if (bArr.length == 25) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        this.zza = Arrays.hashCode(bArr);
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper zzd() {
        return ObjectWrapper.wrap(zzf());
    }
}
