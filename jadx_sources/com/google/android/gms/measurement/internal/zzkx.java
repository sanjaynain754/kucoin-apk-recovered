package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
@MainThread
@VisibleForTesting
final class zzkx implements Application.ActivityLifecycleCallbacks, zzkv {
    final /* synthetic */ zzli zza;

    @Override // com.google.android.gms.measurement.internal.zzkv
    public final void zza(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) throws Throwable {
        zzkx zzkxVar;
        zzib zzibVar;
        Uri uri;
        try {
            try {
                zzli zzliVar = this.zza;
                zzib zzibVar2 = zzliVar.zzu;
                zzibVar2.zzaV().zzk().zza("onActivityCreated");
                Intent intent = zzdfVar.zzc;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        uri = null;
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        zzibVar2.zzk();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        zzkxVar = this;
                        try {
                            zzibVar2.zzaW().zzj(new zzkw(zzkxVar, bundle == null, uri, str, queryParameter));
                        } catch (RuntimeException e11) {
                            e = e11;
                            zzkxVar.zza.zzu.zzaV().zzb().zzb("Throwable caught in onActivityCreated", e);
                        }
                        zzibVar = zzkxVar.zza.zzu;
                    }
                    zzibVar.zzs().zzm(zzdfVar, bundle);
                }
                zzibVar = zzliVar.zzu;
            } catch (Throwable th2) {
                th = th2;
                zzkxVar.zza.zzu.zzs().zzm(zzdfVar, bundle);
                throw th;
            }
        } catch (RuntimeException e12) {
            e = e12;
            zzkxVar = this;
        } catch (Throwable th3) {
            th = th3;
            zzkxVar = this;
            zzkxVar.zza.zzu.zzs().zzm(zzdfVar, bundle);
            throw th;
        }
        zzibVar.zzs().zzm(zzdfVar, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    public final void zzb(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        this.zza.zzu.zzs().zzs(zzdfVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    @MainThread
    public final void zzc(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        zzib zzibVar = this.zza.zzu;
        zzibVar.zzs().zzp(zzdfVar);
        zzob zzobVarZzh = zzibVar.zzh();
        zzib zzibVar2 = zzobVarZzh.zzu;
        zzibVar2.zzaW().zzj(new zznu(zzobVarZzh, zzibVar2.zzaZ().elapsedRealtime()));
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    @MainThread
    public final void zzd(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        zzib zzibVar = this.zza.zzu;
        zzob zzobVarZzh = zzibVar.zzh();
        zzib zzibVar2 = zzobVarZzh.zzu;
        zzibVar2.zzaW().zzj(new zznt(zzobVarZzh, zzibVar2.zzaZ().elapsedRealtime()));
        zzibVar.zzs().zzn(zzdfVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    public final void zze(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) {
        this.zza.zzu.zzs().zzq(zzdfVar, bundle);
    }

    public zzkx(zzli zzliVar) {
        Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        zza(com.google.android.gms.internal.measurement.zzdf.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzb(com.google.android.gms.internal.measurement.zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        zzc(com.google.android.gms.internal.measurement.zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity) {
        zzd(com.google.android.gms.internal.measurement.zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zze(com.google.android.gms.internal.measurement.zzdf.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
