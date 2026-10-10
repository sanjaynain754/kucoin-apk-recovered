package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.tencent.bugly.proguard.C33844oi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zznk extends zzg {
    private final zzne zza;
    private zzga zzb;
    private volatile Boolean zzc;
    private final zzay zzd;
    private ScheduledExecutorService zze;
    private final zzof zzf;
    private final List zzg;
    private final zzay zzh;

    public final /* synthetic */ void zzS(AtomicReference atomicReference, zzr zzrVar, Bundle bundle) {
        synchronized (atomicReference) {
            try {
                zzga zzgaVar = this.zzb;
                if (zzgaVar == null) {
                    this.zzu.zzaV().zzb().zza("Failed to request trigger URIs; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(zzrVar);
                zzgaVar.zzD(zzrVar, bundle, new zzmd(this, atomicReference));
                zzV();
            } catch (RemoteException e11) {
                this.zzu.zzaV().zzb().zzb("Failed to request trigger URIs; remote exception", e11);
                atomicReference.notifyAll();
            }
        }
    }

    public final /* synthetic */ void zzT(AtomicReference atomicReference, zzr zzrVar, zzon zzonVar) {
        synchronized (atomicReference) {
            try {
                zzga zzgaVar = this.zzb;
                if (zzgaVar == null) {
                    this.zzu.zzaV().zzb().zza("[sgtm] Failed to get upload batches; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(zzrVar);
                zzgaVar.zzB(zzrVar, zzonVar, new zzme(this, atomicReference));
                zzV();
            } catch (RemoteException e11) {
                this.zzu.zzaV().zzb().zzb("[sgtm] Failed to get upload batches; remote exception", e11);
                atomicReference.notifyAll();
            }
        }
    }

    public final /* synthetic */ void zzaa(zzga zzgaVar) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    private final boolean zzad() {
        this.zzu.zzaU();
        return true;
    }

    @WorkerThread
    private final zzr zzah(boolean z11) {
        Pair pairZzb;
        zzib zzibVar = this.zzu;
        zzibVar.zzaU();
        zzgh zzghVarZzv = this.zzu.zzv();
        String string = null;
        if (z11) {
            zzib zzibVar2 = zzibVar.zzaV().zzu;
            if (zzibVar2.zzd().zzb != null && (pairZzb = zzibVar2.zzd().zzb.zzb()) != null && pairZzb != zzhg.zza) {
                String strValueOf = String.valueOf(pairZzb.second);
                String str = (String) pairZzb.first;
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb2.append(strValueOf);
                sb2.append(C33844oi.f71346o);
                sb2.append(str);
                string = sb2.toString();
            }
        }
        return zzghVarZzv.zzh(string);
    }

    public final Boolean zzJ() {
        return this.zzc;
    }

    public final /* synthetic */ void zzQ() {
        zzga zzgaVar = this.zzb;
        if (zzgaVar == null) {
            this.zzu.zzaV().zzb().zza("Failed to send storage consent settings to service");
            return;
        }
        try {
            zzr zzrVarZzah = zzah(false);
            Preconditions.checkNotNull(zzrVarZzah);
            zzgaVar.zzy(zzrVarZzah);
            zzV();
        } catch (RemoteException e11) {
            this.zzu.zzaV().zzb().zzb("Failed to send storage consent settings to the service", e11);
        }
    }

    public final /* synthetic */ void zzR() {
        zzga zzgaVar = this.zzb;
        if (zzgaVar == null) {
            this.zzu.zzaV().zzb().zza("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzr zzrVarZzah = zzah(false);
            Preconditions.checkNotNull(zzrVarZzah);
            zzgaVar.zzz(zzrVarZzah);
            zzV();
        } catch (RemoteException e11) {
            this.zzu.zzaV().zzb().zzb("Failed to send Dma consent settings to the service", e11);
        }
    }

    public final /* synthetic */ void zzU(zzr zzrVar, zzaf zzafVar) {
        zzga zzgaVar = this.zzb;
        if (zzgaVar == null) {
            this.zzu.zzaV().zzb().zza("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            zzgaVar.zzC(zzrVar, zzafVar);
            zzV();
        } catch (RemoteException e11) {
            this.zzu.zzaV().zzb().zzc("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(zzafVar.zza), e11);
        }
    }

    public final /* synthetic */ zzne zzY() {
        return this.zza;
    }

    public final /* synthetic */ zzga zzZ() {
        return this.zzb;
    }

    public final /* synthetic */ ScheduledExecutorService zzab() {
        return this.zze;
    }

    public final /* synthetic */ void zzac(ScheduledExecutorService scheduledExecutorService) {
        this.zze = scheduledExecutorService;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00fe  */
    @WorkerThread
    public final void zzm(zzga zzgaVar, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) {
        zzr zzrVar2;
        String str;
        long jElapsedRealtime;
        long j11;
        zzg();
        zzb();
        zzad();
        zzib zzibVar = this.zzu;
        zzibVar.zzc();
        zzr zzrVar3 = zzrVar;
        int size = 100;
        int i11 = 0;
        for (int i12 = 100; i11 < 1001 && size == i12; i12 = 100) {
            zzib zzibVar2 = this.zzu;
            ArrayList arrayList = new ArrayList();
            List listZzm = zzibVar2.zzm().zzm(i12);
            if (listZzm != null) {
                arrayList.addAll(listZzm);
                size = listZzm.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != 0 && size < i12) {
                arrayList.add(new zzgj(abstractSafeParcelable, zzrVar3.zzc, zzrVar3.zzj));
            }
            String str2 = null;
            boolean zZzp = zzibVar.zzc().zzp(null, zzfx.zzaO);
            int size2 = arrayList.size();
            int i13 = 0;
            while (i13 < size2) {
                zzgj zzgjVar = (zzgj) arrayList.get(i13);
                AbstractSafeParcelable abstractSafeParcelable2 = zzgjVar.zza;
                zzal zzalVarZzc = zzibVar.zzc();
                zzfw zzfwVar = zzfx.zzbc;
                if (zzalVarZzc.zzp(str2, zzfwVar)) {
                    String str3 = zzgjVar.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        zzrVar2 = zzrVar3;
                    } else {
                        zzrVar2 = new zzr(zzrVar3.zza, zzrVar3.zzb, str3, zzgjVar.zzc, zzrVar3.zzd, zzrVar3.zze, zzrVar3.zzf, zzrVar3.zzg, zzrVar3.zzh, zzrVar3.zzi, zzrVar3.zzk, zzrVar3.zzl, zzrVar3.zzm, zzrVar3.zzn, zzrVar3.zzo, zzrVar3.zzp, zzrVar3.zzq, zzrVar3.zzr, zzrVar3.zzs, zzrVar3.zzt, zzrVar3.zzu, zzrVar3.zzv, zzrVar3.zzw, zzrVar3.zzx, zzrVar3.zzy, zzrVar3.zzz, zzrVar3.zzA, zzrVar3.zzB, zzrVar3.zzC, zzrVar3.zzD, zzrVar3.zzE);
                    }
                } else {
                    zzrVar2 = zzrVar3;
                }
                if (abstractSafeParcelable2 instanceof zzbg) {
                    if (zZzp) {
                        try {
                            zzib zzibVar3 = this.zzu;
                            long jCurrentTimeMillis = zzibVar3.zzaZ().currentTimeMillis();
                            try {
                                j11 = jCurrentTimeMillis;
                                jElapsedRealtime = zzibVar3.zzaZ().elapsedRealtime();
                            } catch (RemoteException e11) {
                                e = e11;
                                j11 = jCurrentTimeMillis;
                                jElapsedRealtime = 0;
                                this.zzu.zzaV().zzb().zzb("Failed to send event to the service", e);
                                if (zZzp && j11 != 0) {
                                    zzib zzibVar4 = this.zzu;
                                    zzgp.zza(zzibVar4).zzb(36301, 13, j11, zzibVar4.zzaZ().currentTimeMillis(), (int) (zzibVar4.zzaZ().elapsedRealtime() - jElapsedRealtime));
                                }
                                str = null;
                                i13++;
                                zzrVar3 = zzrVar2;
                                str2 = str;
                                zzibVar = zzibVar;
                            }
                        } catch (RemoteException e12) {
                            e = e12;
                            jElapsedRealtime = 0;
                            j11 = 0;
                        }
                    } else {
                        jElapsedRealtime = 0;
                        j11 = 0;
                    }
                    try {
                        zzgaVar.zze((zzbg) abstractSafeParcelable2, zzrVar2);
                        if (zZzp) {
                            zzibVar.zzaV().zzk().zza("Logging telemetry for logEvent from database");
                            zzib zzibVar5 = this.zzu;
                            zzgp.zza(zzibVar5).zzb(36301, 0, j11, zzibVar5.zzaZ().currentTimeMillis(), (int) (zzibVar5.zzaZ().elapsedRealtime() - jElapsedRealtime));
                        }
                    } catch (RemoteException e13) {
                        e = e13;
                        this.zzu.zzaV().zzb().zzb("Failed to send event to the service", e);
                        if (zZzp) {
                            zzib zzibVar6 = this.zzu;
                            zzgp.zza(zzibVar6).zzb(36301, 13, j11, zzibVar6.zzaZ().currentTimeMillis(), (int) (zzibVar6.zzaZ().elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } else if (abstractSafeParcelable2 instanceof zzpk) {
                    try {
                        zzgaVar.zzf((zzpk) abstractSafeParcelable2, zzrVar2);
                    } catch (RemoteException e14) {
                        this.zzu.zzaV().zzb().zzb("Failed to send user property to the service", e14);
                    }
                } else {
                    if (abstractSafeParcelable2 instanceof zzah) {
                        try {
                            zzgaVar.zzn((zzah) abstractSafeParcelable2, zzrVar2);
                        } catch (RemoteException e15) {
                            this.zzu.zzaV().zzb().zzb("Failed to send conditional user property to the service", e15);
                        }
                    } else {
                        zzib zzibVar7 = this.zzu;
                        str = null;
                        if (zzibVar7.zzc().zzp(null, zzfwVar) && (abstractSafeParcelable2 instanceof zzbe)) {
                            try {
                                zzgaVar.zzu(((zzbe) abstractSafeParcelable2).zzf(), zzrVar2);
                            } catch (RemoteException e16) {
                                this.zzu.zzaV().zzb().zzb("Failed to send default event parameters to the service", e16);
                            }
                        } else {
                            zzibVar7.zzaV().zzb().zza("Discarding data. Unrecognized parcel type.");
                        }
                    }
                    i13++;
                    zzrVar3 = zzrVar2;
                    str2 = str;
                    zzibVar = zzibVar;
                }
                str = null;
                i13++;
                zzrVar3 = zzrVar2;
                str2 = str;
                zzibVar = zzibVar;
            }
            i11++;
        }
    }

    public zznk(zzib zzibVar) {
        super(zzibVar);
        this.zzg = new ArrayList();
        this.zzf = new zzof(zzibVar.zzaZ());
        this.zza = new zzne(this);
        this.zzd = new zzml(this, zzibVar);
        this.zzh = new zzmp(this, zzibVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzV() {
        zzg();
        this.zzf.zza();
        this.zzu.zzc();
        this.zzd.zzb(((Long) zzfx.zzY.zzb(null)).longValue());
    }

    @WorkerThread
    private final void zzaf(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzh()) {
            runnable.run();
            return;
        }
        List list = this.zzg;
        long size = list.size();
        zzib zzibVar = this.zzu;
        zzibVar.zzc();
        if (size >= 1000) {
            zzibVar.zzaV().zzb().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.zzh.zzb(60000L);
        zzI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzX() {
        zzg();
        zzgr zzgrVarZzk = this.zzu.zzaV().zzk();
        List list = this.zzg;
        zzgrVarZzk.zzb("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e11) {
                this.zzu.zzaV().zzb().zzb("Task exception while flushing queue", e11);
            }
        }
        this.zzg.clear();
        this.zzh.zzd();
    }

    @WorkerThread
    public final void zzA(zzpk zzpkVar) {
        zzg();
        zzb();
        zzad();
        zzaf(new zzmf(this, zzah(true), this.zzu.zzm().zzj(zzpkVar), zzpkVar));
    }

    @WorkerThread
    public final void zzB() {
        zzg();
        zzb();
        zzr zzrVarZzah = zzah(false);
        zzad();
        this.zzu.zzm().zzh();
        zzaf(new zzmg(this, zzrVarZzah));
    }

    @WorkerThread
    public final void zzC(AtomicReference atomicReference) {
        zzg();
        zzb();
        zzaf(new zzmh(this, atomicReference, zzah(false)));
    }

    @WorkerThread
    public final void zzD(com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        zzg();
        zzb();
        zzaf(new zzmi(this, zzah(false), zzcuVar));
    }

    @WorkerThread
    public final void zzE() {
        zzg();
        zzb();
        zzr zzrVarZzah = zzah(true);
        zzad();
        this.zzu.zzc().zzp(null, zzfx.zzbc);
        this.zzu.zzm().zzn();
        zzaf(new zzmj(this, zzrVarZzah, true));
    }

    @WorkerThread
    public final void zzF() {
        zzg();
        zzb();
        zzaf(new zzmk(this, zzah(true)));
    }

    @WorkerThread
    public final void zzG(zzlt zzltVar) {
        zzg();
        zzb();
        zzaf(new zzmm(this, zzltVar));
    }

    @WorkerThread
    public final void zzH(Bundle bundle) {
        boolean z11;
        zzg();
        zzb();
        zzbe zzbeVar = new zzbe(bundle);
        zzad();
        if (this.zzu.zzc().zzp(null, zzfx.zzbc) && this.zzu.zzm().zzl(zzbeVar)) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzaf(new zzmn(this, true, zzah(false), z11, zzbeVar, bundle));
    }

    @WorkerThread
    public final void zzI() {
        zzg();
        zzb();
        if (!zzh()) {
            if (!zzK()) {
                zzib zzibVar = this.zzu;
                if (!zzibVar.zzc().zzE()) {
                    zzibVar.zzaU();
                    List<ResolveInfo> listQueryIntentServices = zzibVar.zzaY().getPackageManager().queryIntentServices(new Intent().setClassName(zzibVar.zzaY(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                    if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                        Intent intent = new Intent("com.google.android.gms.measurement.START");
                        Context contextZzaY = zzibVar.zzaY();
                        zzibVar.zzaU();
                        intent.setComponent(new ComponentName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementService"));
                        this.zza.zza(intent);
                        return;
                    }
                    zzibVar.zzaV().zzb().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                return;
            }
            this.zza.zzc();
        }
    }

    @WorkerThread
    public final boolean zzK() {
        Boolean boolValueOf;
        zzg();
        zzb();
        if (this.zzc == null) {
            zzg();
            zzb();
            zzib zzibVar = this.zzu;
            zzhg zzhgVarZzd = zzibVar.zzd();
            zzhgVarZzd.zzg();
            boolean z11 = false;
            if (!zzhgVarZzd.zzd().contains("use_service")) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(zzhgVarZzd.zzd().getBoolean("use_service", false));
            }
            boolean z12 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                zzibVar.zzaU();
                if (this.zzu.zzv().zzo() == 1) {
                    z11 = true;
                } else {
                    zzibVar.zzaV().zzk().zza("Checking service availability");
                    int iZzai = zzibVar.zzk().zzai(12451000);
                    if (iZzai != 0) {
                        if (iZzai != 1) {
                            if (iZzai != 2) {
                                if (iZzai != 3) {
                                    if (iZzai != 9) {
                                        if (iZzai != 18) {
                                            zzibVar.zzaV().zze().zzb("Unexpected service status", Integer.valueOf(iZzai));
                                        } else {
                                            zzibVar.zzaV().zze().zza("Service updating");
                                        }
                                    } else {
                                        zzibVar.zzaV().zze().zza("Service invalid");
                                    }
                                } else {
                                    zzibVar.zzaV().zze().zza("Service disabled");
                                }
                                z12 = false;
                            } else {
                                zzibVar.zzaV().zzj().zza("Service container out of date");
                                if (zzibVar.zzk().zzah() >= 17443) {
                                    if (boolValueOf != null) {
                                        z12 = false;
                                    }
                                    z11 = z12;
                                    z12 = false;
                                }
                            }
                        } else {
                            zzibVar.zzaV().zzk().zza("Service missing");
                        }
                    } else {
                        zzibVar.zzaV().zzk().zza("Service available");
                    }
                    z11 = true;
                }
                if (!z11 && zzibVar.zzc().zzE()) {
                    zzibVar.zzaV().zzb().zza("No way to upload. Consider using the full version of Analytics");
                } else if (z12) {
                    zzhg zzhgVarZzd2 = zzibVar.zzd();
                    zzhgVarZzd2.zzg();
                    SharedPreferences.Editor editorEdit = zzhgVarZzd2.zzd().edit();
                    editorEdit.putBoolean("use_service", z11);
                    editorEdit.apply();
                }
                z12 = z11;
            }
            this.zzc = Boolean.valueOf(z12);
        }
        return this.zzc.booleanValue();
    }

    @WorkerThread
    public final void zzL(zzga zzgaVar) {
        zzg();
        Preconditions.checkNotNull(zzgaVar);
        this.zzb = zzgaVar;
        zzV();
        zzX();
    }

    @WorkerThread
    public final void zzM() {
        zzg();
        zzb();
        zzne zzneVar = this.zza;
        zzneVar.zzb();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzu.zzaY(), zzneVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    @WorkerThread
    public final void zzN(com.google.android.gms.internal.measurement.zzcu zzcuVar, zzbg zzbgVar, String str) {
        zzg();
        zzb();
        zzib zzibVar = this.zzu;
        if (zzibVar.zzk().zzai(12451000) != 0) {
            zzibVar.zzaV().zze().zza("Not bundling data. Service unavailable or out of date");
            zzibVar.zzk().zzao(zzcuVar, new byte[0]);
        } else {
            zzaf(new zzmo(this, zzbgVar, str, zzcuVar));
        }
    }

    @WorkerThread
    public final boolean zzO() {
        zzg();
        zzb();
        if (!zzK() || this.zzu.zzk().zzah() >= ((Integer) zzfx.zzaJ.zzb(null)).intValue()) {
            return true;
        }
        return false;
    }

    @WorkerThread
    public final boolean zzP() {
        zzg();
        zzb();
        if (!zzK() || this.zzu.zzk().zzah() >= 241200) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void zzW(ComponentName componentName) {
        zzg();
        if (this.zzb != null) {
            this.zzb = null;
            this.zzu.zzaV().zzk().zzb("Disconnected from device MeasurementService", componentName);
            zzg();
            zzI();
        }
    }

    @WorkerThread
    public final boolean zzh() {
        zzg();
        zzb();
        if (this.zzb != null) {
            return true;
        }
        return false;
    }

    @WorkerThread
    public final void zzi() {
        zzg();
        zzb();
        zzaf(new zzmq(this, zzah(true)));
    }

    @WorkerThread
    public final void zzj(boolean z11) {
        zzg();
        zzb();
        if (zzO()) {
            zzaf(new zzmr(this, zzah(false)));
        }
    }

    @WorkerThread
    public final void zzk(boolean z11) {
        zzg();
        zzb();
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzQ();
            }
        });
    }

    @WorkerThread
    public final void zzl() {
        zzg();
        zzb();
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzR();
            }
        });
    }

    @WorkerThread
    public final void zzn(zzbg zzbgVar, String str) {
        Preconditions.checkNotNull(zzbgVar);
        zzg();
        zzb();
        zzad();
        zzaf(new zzms(this, true, zzah(true), this.zzu.zzm().zzi(zzbgVar), zzbgVar, str));
    }

    @WorkerThread
    public final void zzp(zzah zzahVar) {
        Preconditions.checkNotNull(zzahVar);
        zzg();
        zzb();
        this.zzu.zzaU();
        zzaf(new zzmt(this, true, zzah(true), this.zzu.zzm().zzk(zzahVar), new zzah(zzahVar), zzahVar));
    }

    @WorkerThread
    public final void zzq(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zzb();
        zzaf(new zzmu(this, atomicReference, null, str2, str3, zzah(false)));
    }

    @WorkerThread
    public final void zzs(com.google.android.gms.internal.measurement.zzcu zzcuVar, String str, String str2) {
        zzg();
        zzb();
        zzaf(new zzmv(this, str, str2, zzah(false), zzcuVar));
    }

    @WorkerThread
    public final void zzt(AtomicReference atomicReference, String str, String str2, String str3, boolean z11) {
        zzg();
        zzb();
        zzaf(new zzmw(this, atomicReference, null, str2, str3, zzah(false), z11));
    }

    @WorkerThread
    public final void zzu(com.google.android.gms.internal.measurement.zzcu zzcuVar, String str, String str2, boolean z11) {
        zzg();
        zzb();
        zzaf(new zzmb(this, str, str2, zzah(false), z11, zzcuVar));
    }

    @WorkerThread
    public final void zzv(AtomicReference atomicReference, boolean z11) {
        zzg();
        zzb();
        zzaf(new zzmc(this, atomicReference, zzah(false), z11));
    }

    @WorkerThread
    public final void zzw(final AtomicReference atomicReference, final Bundle bundle) {
        zzg();
        zzb();
        final zzr zzrVarZzah = zzah(false);
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzng
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS(atomicReference, zzrVarZzah, bundle);
            }
        });
    }

    @WorkerThread
    public final void zzx(final AtomicReference atomicReference, final zzon zzonVar) {
        zzg();
        zzb();
        final zzr zzrVarZzah = zzah(false);
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzT(atomicReference, zzrVarZzah, zzonVar);
            }
        });
    }

    @WorkerThread
    public final void zzy(final zzaf zzafVar) {
        zzg();
        zzb();
        final zzr zzrVarZzah = zzah(true);
        Preconditions.checkNotNull(zzrVarZzah);
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzni
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzU(zzrVarZzah, zzafVar);
            }
        });
    }

    @WorkerThread
    public final zzao zzz() {
        zzg();
        zzb();
        zzga zzgaVar = this.zzb;
        if (zzgaVar == null) {
            zzI();
            this.zzu.zzaV().zzj().zza("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzr zzrVarZzah = zzah(false);
        Preconditions.checkNotNull(zzrVarZzah);
        try {
            zzao zzaoVarZzw = zzgaVar.zzw(zzrVarZzah);
            zzV();
            return zzaoVarZzw;
        } catch (RemoteException e11) {
            this.zzu.zzaV().zzb().zzb("Failed to get consents; remote exception", e11);
            return null;
        }
    }
}
