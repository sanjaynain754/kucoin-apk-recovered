package com.google.mlkit.common.sdkinternal;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzmm;
import com.google.android.gms.internal.mlkit_common.zzmn;
import com.google.android.gms.internal.mlkit_common.zzmv;
import com.google.android.gms.internal.mlkit_common.zzmw;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.tencent.bugly.proguard.C33786m2;
import java.io.Closeable;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes56.dex */
@KeepForSdk
public class CloseGuard implements Closeable {

    @KeepForSdk
    public static final int API_TRANSLATE = 1;
    private final AtomicBoolean zza = new AtomicBoolean();
    private final String zzb;
    private final Cleaner.Cleanable zzc;

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    /* JADX INFO: loaded from: classes.dex */
    @KeepForSdk
    public static class Factory {
        private final Cleaner zza;

        @NonNull
        @KeepForSdk
        public CloseGuard create(@NonNull Object obj, int i11, @NonNull Runnable runnable) {
            return new CloseGuard(obj, i11, this.zza, runnable, zzss.zzb(C33786m2.f70892t));
        }

        public Factory(@NonNull Cleaner cleaner) {
            this.zza = cleaner;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.set(true);
        this.zzc.clean();
    }

    public final /* synthetic */ void zza(int i11, zzsh zzshVar, Runnable runnable) {
        if (!this.zza.get()) {
            Log.e("MlKitCloseGuard", String.format(Locale.ENGLISH, "%s has not been closed", this.zzb));
            zzmw zzmwVar = new zzmw();
            zzmn zzmnVar = new zzmn();
            zzmnVar.zzb(zzmm.zzb(i11));
            zzmwVar.zzh(zzmnVar.zzc());
            zzshVar.zzd(zzsk.zzf(zzmwVar), zzmv.HANDLE_LEAKED);
        }
        runnable.run();
    }

    public CloseGuard(Object obj, final int i11, Cleaner cleaner, final Runnable runnable, final zzsh zzshVar) {
        this.zzb = obj.toString();
        this.zzc = cleaner.register(obj, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zze
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(i11, zzshVar, runnable);
            }
        });
    }
}
