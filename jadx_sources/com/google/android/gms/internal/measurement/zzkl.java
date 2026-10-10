package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzkl {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkg zze;
    private static volatile boolean zzf;
    private static final AtomicInteger zzh;
    final zzkf zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    public abstract Object zza(Object obj);

    static {
        new AtomicReference();
        Preconditions.checkNotNull(zzkj.zza, "BuildInfo must be non-null");
        zzh = new AtomicInteger();
    }

    public static void zzb(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zzd;
        synchronized (obj) {
            try {
                if (zze == null) {
                    synchronized (obj) {
                        try {
                            zzkg zzkgVar = zze;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzkgVar == null || zzkgVar.zza() != context) {
                                if (zzkgVar != null) {
                                    zzjq.zzd();
                                    zzkn.zzb();
                                    zzjx.zzc();
                                }
                                zze = new zzjn(context, Suppliers.memoize(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzkk
                                    @Override // com.google.common.base.Supplier
                                    public final /* synthetic */ Object get() {
                                        int i11 = zzkl.zzc;
                                        return zzjy.zza(context);
                                    }
                                }));
                                zzh.incrementAndGet();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void zzc() {
        zzh.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 com.google.common.base.Optional) = (r2v0 com.google.common.base.Optional), (r2v0 com.google.common.base.Optional), (r2v7 com.google.common.base.Optional) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object zzd() {
        String strZza;
        zzju zzjuVarZza;
        String strZze;
        Object objZze;
        int i11 = zzh.get();
        if (this.zzi < i11) {
            synchronized (this) {
                try {
                    if (this.zzi < i11) {
                        zzkg zzkgVar = zze;
                        Optional optionalAbsent = Optional.absent();
                        Object objZza = null;
                        if (zzkgVar == null || zzkgVar.zzb() == null) {
                            strZza = null;
                        } else {
                            optionalAbsent = (Optional) ((Supplier) Preconditions.checkNotNull(zzkgVar.zzb())).get();
                            if (optionalAbsent.isPresent()) {
                                zzjs zzjsVar = (zzjs) optionalAbsent.get();
                                zzkf zzkfVar = this.zza;
                                strZza = zzjsVar.zza(zzkfVar.zza, null, zzkfVar.zzc, this.zzb);
                            } else {
                                strZza = null;
                            }
                        }
                        Preconditions.checkState(zzkgVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        zzkf zzkfVar2 = this.zza;
                        Uri uri = zzkfVar2.zza;
                        if (uri != null) {
                            zzjuVarZza = zzjz.zza(zzkgVar.zza(), uri) ? zzjq.zza(zzkgVar.zza().getContentResolver(), uri, zzki.zza) : null;
                        } else {
                            zzjuVarZza = zzkn.zza(zzkgVar.zza(), (String) Preconditions.checkNotNull(null), zzkh.zza);
                        }
                        Object objZza2 = (zzjuVarZza == null || (objZze = zzjuVarZza.zze(this.zzb)) == null) ? null : zza(objZze);
                        if (objZza2 == null) {
                            if (!zzkfVar2.zzd && (strZze = zzjx.zza(zzkgVar.zza()).zze(this.zzb)) != null) {
                                objZza = zza(strZze);
                            }
                            objZza2 = objZza == null ? this.zzg : objZza;
                        }
                        if (optionalAbsent.isPresent()) {
                            objZza2 = strZza == null ? this.zzg : zza(strZza);
                        }
                        this.zzj = objZza2;
                        this.zzi = i11;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.zzj;
    }

    public /* synthetic */ zzkl(zzkf zzkfVar, String str, Object obj, boolean z11, byte[] bArr) {
        if (zzkfVar.zza != null) {
            this.zza = zzkfVar;
            this.zzb = str;
            this.zzg = obj;
            this.zzk = false;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }
}
