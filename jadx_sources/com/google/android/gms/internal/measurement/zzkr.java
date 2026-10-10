package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkq;
import com.google.android.gms.internal.measurement.zzkr;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzkr<MessageType extends zzkr<MessageType, BuilderType>, BuilderType extends zzkq<MessageType, BuilderType>> implements zznl {
    protected int zza = 0;

    public int zzcd(zznw zznwVar) {
        throw null;
    }

    public static void zzce(Iterable iterable, List list) {
        zzkq.zzaU(iterable, list);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final zzlg zzcb() {
        try {
            int iZzcn = zzcn();
            zzlg zzlgVar = zzlg.zzb;
            byte[] bArr = new byte[iZzcn];
            int i11 = zzll.zzb;
            zzlj zzljVar = new zzlj(bArr, 0, iZzcn);
            zzcB(zzljVar);
            return zzld.zza(zzljVar, bArr);
        } catch (IOException e11) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e11);
        }
    }

    public final byte[] zzcc() {
        try {
            int iZzcn = zzcn();
            byte[] bArr = new byte[iZzcn];
            int i11 = zzll.zzb;
            zzlj zzljVar = new zzlj(bArr, 0, iZzcn);
            zzcB(zzljVar);
            zzljVar.zzE();
            return bArr;
        } catch (IOException e11) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e11);
        }
    }
}
