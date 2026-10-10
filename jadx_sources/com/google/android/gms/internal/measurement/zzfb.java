package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.media3.common.C2711C;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfb {
    private static volatile zzfb zzc;
    protected final ExecutorService zzb;
    private final AppMeasurementSdk zze;

    @GuardedBy("listenerList")
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private final String zzi;
    private volatile zzcr zzj;
    private final String zzd = "FA";
    protected final Clock zza = DefaultClock.getInstance();

    public final void zzh(@NonNull String str, Bundle bundle) {
        zzU(null, str, bundle, false, true, null);
    }

    public final void zzi(String str, String str2, Bundle bundle) {
        zzU(str, str2, bundle, true, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
    public final void zzM(zzeq zzeqVar) {
        this.zzb.execute(zzeqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
    public final void zzN(Exception exc, boolean z11, boolean z12) {
        zzfb zzfbVar;
        Exception exc2;
        this.zzh |= z11;
        if (z11) {
            Log.w(this.zzd, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z12) {
            zzfbVar = this;
            exc2 = exc;
            zzfbVar.zzD(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            zzfbVar = this;
            exc2 = exc;
        }
        Log.w(zzfbVar.zzd, "Error with data collection. Data lost.", exc2);
    }

    private final void zzU(String str, String str2, Bundle bundle, boolean z11, boolean z12, Long l11) {
        zzM(new zzep(this, l11, str, str2, bundle, z11, z12));
    }

    public final String zzA() {
        zzco zzcoVar = new zzco();
        zzM(new zzdz(this, zzcoVar));
        return zzcoVar.zzc(500L);
    }

    public final String zzB() {
        zzco zzcoVar = new zzco();
        zzM(new zzea(this, zzcoVar));
        return zzcoVar.zzc(500L);
    }

    public final Map zzC(String str, String str2, boolean z11) {
        zzco zzcoVar = new zzco();
        zzM(new zzeb(this, str, str2, z11, zzcoVar));
        Bundle bundleZze = zzcoVar.zze(5000L);
        if (bundleZze == null || bundleZze.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleZze.size());
        for (String str3 : bundleZze.keySet()) {
            Object obj = bundleZze.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void zzD(int i11, String str, Object obj, Object obj2, Object obj3) {
        zzM(new zzec(this, false, 5, str, obj, null, null));
    }

    public final Bundle zzE(Bundle bundle, boolean z11) {
        zzco zzcoVar = new zzco();
        zzM(new zzee(this, bundle, zzcoVar));
        if (z11) {
            return zzcoVar.zze(5000L);
        }
        return null;
    }

    public final int zzF(String str) {
        zzco zzcoVar = new zzco();
        zzM(new zzef(this, str, zzcoVar));
        Integer num = (Integer) zzco.zzf(zzcoVar.zze(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @WorkerThread
    public final String zzG() {
        zzco zzcoVar = new zzco();
        zzM(new zzeg(this, zzcoVar));
        return zzcoVar.zzc(120000L);
    }

    @WorkerThread
    public final Long zzH() {
        zzco zzcoVar = new zzco();
        zzM(new zzeh(this, zzcoVar));
        return zzcoVar.zzd(120000L);
    }

    public final String zzI() {
        return this.zzi;
    }

    public final Object zzJ(int i11) {
        zzco zzcoVar = new zzco();
        zzM(new zzei(this, zzcoVar, i11));
        return zzco.zzf(zzcoVar.zze(C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS), Object.class);
    }

    public final void zzK(boolean z11) {
        zzM(new zzej(this, z11));
    }

    public final void zzL(Bundle bundle) {
        zzM(new zzek(this, bundle));
    }

    public final /* synthetic */ String zzO() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzP() {
        return this.zzh;
    }

    public final /* synthetic */ zzcr zzQ() {
        return this.zzj;
    }

    public final /* synthetic */ void zzR(zzcr zzcrVar) {
        this.zzj = zzcrVar;
    }

    public final AppMeasurementSdk zzb() {
        return this.zze;
    }

    public final zzcr zzc(Context context, boolean z11) {
        try {
            return zzcq.asInterface(DynamiteModule.load(context, z11 ? DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION : DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e11) {
            zzN(e11, true, false);
            return null;
        }
    }

    public final void zzd(com.google.android.gms.measurement.internal.zzjo zzjoVar) {
        zzer zzerVar = new zzer(zzjoVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzerVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.zzd, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zzM(new zzel(this, zzerVar));
    }

    public final void zze(Intent intent) {
        zzM(new zzem(this, intent));
    }

    public final void zzk(String str, String str2, Object obj, boolean z11) {
        zzM(new zzdh(this, str, str2, obj, z11));
    }

    public final void zzl(Bundle bundle) {
        zzM(new zzdi(this, bundle));
    }

    public final void zzm(String str, String str2, Bundle bundle) {
        zzM(new zzdj(this, str, str2, bundle));
    }

    public final List zzn(String str, String str2) {
        zzco zzcoVar = new zzco();
        zzM(new zzdk(this, str, str2, zzcoVar));
        List list = (List) zzco.zzf(zzcoVar.zze(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void zzo(String str) {
        zzM(new zzdl(this, str));
    }

    public final void zzp(zzdf zzdfVar, String str, String str2) {
        zzM(new zzdm(this, zzdfVar, str, str2));
    }

    public final void zzq(Boolean bool) {
        zzM(new zzdn(this, bool));
    }

    public final void zzr(Bundle bundle) {
        zzM(new zzdo(this, bundle));
    }

    public final void zzs() {
        zzM(new zzdp(this));
    }

    public final void zzt(long j11) {
        zzM(new zzdq(this, j11));
    }

    public final void zzu(String str) {
        zzM(new zzds(this, str));
    }

    public final void zzv(String str) {
        zzM(new zzdt(this, str));
    }

    public final void zzw(Runnable runnable) {
        zzM(new zzdv(this, runnable));
    }

    public final String zzx() {
        zzco zzcoVar = new zzco();
        zzM(new zzdw(this, zzcoVar));
        return zzcoVar.zzc(500L);
    }

    public final String zzy() {
        zzco zzcoVar = new zzco();
        zzM(new zzdx(this, zzcoVar));
        return zzcoVar.zzc(50L);
    }

    public final long zzz() {
        zzco zzcoVar = new zzco();
        zzM(new zzdy(this, zzcoVar));
        Long lZzd = zzcoVar.zzd(500L);
        if (lZzd != null) {
            return lZzd.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
        int i11 = this.zzg + 1;
        this.zzg = i11;
        return jNextLong + ((long) i11);
    }

    public zzfb(Context context, Bundle bundle) {
        zzcm.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzed(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.zzls.zza(context, "google_app_id", com.google.android.gms.measurement.internal.zzht.zza(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzfb.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.zzi = null;
                    this.zzh = true;
                    Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.zzi = "fa";
        zzM(new zzdr(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.zzd, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zzfa(this));
        }
    }

    public static zzfb zza(Context context, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (zzc == null) {
            synchronized (zzfb.class) {
                try {
                    if (zzc == null) {
                        zzc = new zzfb(context, bundle);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zzc;
    }

    public final void zzf(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        Preconditions.checkNotNull(zzjpVar);
        List list = this.zzf;
        synchronized (list) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                try {
                    if (zzjpVar.equals(((Pair) list.get(i11)).first)) {
                        Log.w(this.zzd, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzes zzesVar = new zzes(zzjpVar);
            list.add(new Pair(zzjpVar, zzesVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzesVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzM(new zzen(this, zzesVar));
        }
    }

    public final void zzg(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        Pair pair;
        Preconditions.checkNotNull(zzjpVar);
        List list = this.zzf;
        synchronized (list) {
            int i11 = 0;
            while (true) {
                try {
                    if (i11 < list.size()) {
                        if (zzjpVar.equals(((Pair) list.get(i11)).first)) {
                            pair = (Pair) list.get(i11);
                            break;
                        }
                        i11++;
                    } else {
                        pair = null;
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pair == null) {
                Log.w(this.zzd, "OnEventListener had not been registered.");
                return;
            }
            list.remove(pair);
            zzes zzesVar = (zzes) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzesVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzM(new zzeo(this, zzesVar));
        }
    }

    public final void zzj(String str, String str2, Bundle bundle, long j11) {
        zzU(str, str2, bundle, true, false, Long.valueOf(j11));
    }
}
