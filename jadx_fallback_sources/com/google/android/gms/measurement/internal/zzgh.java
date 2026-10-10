package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgh extends com.google.android.gms.measurement.internal.zzg {
    private java.lang.String zza;
    private java.lang.String zzb;
    private int zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private java.util.List zzi;
    private java.lang.String zzj;
    private int zzk;
    private java.lang.String zzl;
    private java.lang.String zzm;
    private long zzn;
    private java.lang.String zzo;

    public zzgh(com.google.android.gms.measurement.internal.zzib r3, long r4, long r6) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.zzn = r0
            r3 = 0
            r2.zzo = r3
            r2.zzg = r4
            r2.zzh = r6
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    @androidx.annotation.WorkerThread
    public final void zzf() {
            r11 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r11.zzu
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()
            long r2 = r11.zzh
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r11.zzg
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "sdkVersion bundled with app, dynamiteVersion"
            r1.zzc(r4, r2, r3)
            android.content.Context r1 = r0.zzaY()
            java.lang.String r1 = r1.getPackageName()
            android.content.Context r2 = r0.zzaY()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r3 = 0
            java.lang.String r4 = ""
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r6 = "Unknown"
            java.lang.String r7 = "unknown"
            if (r2 != 0) goto L4b
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzgt.zzl(r1)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r0.zzb(r9, r8)
        L48:
            r8 = r6
            goto Lb2
        L4b:
            java.lang.String r7 = r2.getInstallerPackageName(r1)     // Catch: java.lang.IllegalArgumentException -> L50
            goto L63
        L50:
            com.google.android.gms.measurement.internal.zzib r0 = r11.zzu
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzgt.zzl(r1)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r0.zzb(r9, r8)
        L63:
            if (r7 != 0) goto L69
            java.lang.String r0 = "manual_install"
            r7 = r0
            goto L72
        L69:
            java.lang.String r0 = "com.android.vending"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L72
            r7 = r4
        L72:
            com.google.android.gms.measurement.internal.zzib r0 = r11.zzu     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9c
            android.content.Context r0 = r0.zzaY()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9c
            java.lang.String r0 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9c
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9c
            if (r0 == 0) goto L48
            android.content.pm.ApplicationInfo r8 = r0.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9c
            java.lang.CharSequence r8 = r2.getApplicationLabel(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9c
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9c
            if (r9 != 0) goto L93
            java.lang.String r8 = r8.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9c
            goto L94
        L93:
            r8 = r6
        L94:
            java.lang.String r6 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L99
            int r5 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L99
            goto Lb2
        L99:
            r0 = r6
            r6 = r8
            goto L9d
        L9c:
            r0 = r6
        L9d:
            com.google.android.gms.measurement.internal.zzib r8 = r11.zzu
            com.google.android.gms.measurement.internal.zzgt r8 = r8.zzaV()
            com.google.android.gms.measurement.internal.zzgr r8 = r8.zzb()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzgt.zzl(r1)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.zzc(r10, r9, r6)
            r8 = r6
            r6 = r0
        Lb2:
            r11.zza = r1
            r11.zzd = r7
            r11.zzb = r6
            r11.zzc = r5
            r11.zze = r8
            r5 = 0
            r11.zzf = r5
            com.google.android.gms.measurement.internal.zzib r0 = r11.zzu
            int r5 = r0.zzC()
            if (r5 == 0) goto L158
            r6 = 1
            if (r5 == r6) goto L148
            r6 = 3
            if (r5 == r6) goto L138
            r6 = 4
            if (r5 == r6) goto L128
            r6 = 6
            if (r5 == r6) goto L118
            r6 = 7
            if (r5 == r6) goto L108
            r6 = 8
            if (r5 == r6) goto Lf8
            com.google.android.gms.measurement.internal.zzib r6 = r11.zzu
            com.google.android.gms.measurement.internal.zzgt r7 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r7 = r7.zzi()
            java.lang.String r8 = "App measurement disabled"
            r7.zza(r8)
            com.google.android.gms.measurement.internal.zzgt r6 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzc()
            java.lang.String r7 = "Invalid scion state in identity"
            r6.zza(r7)
            goto L167
        Lf8:
            com.google.android.gms.measurement.internal.zzib r6 = r11.zzu
            com.google.android.gms.measurement.internal.zzgt r6 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzi()
            java.lang.String r7 = "App measurement disabled due to denied storage consent"
            r6.zza(r7)
            goto L167
        L108:
            com.google.android.gms.measurement.internal.zzib r6 = r11.zzu
            com.google.android.gms.measurement.internal.zzgt r6 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzi()
            java.lang.String r7 = "App measurement disabled via the global data collection setting"
            r6.zza(r7)
            goto L167
        L118:
            com.google.android.gms.measurement.internal.zzib r6 = r11.zzu
            com.google.android.gms.measurement.internal.zzgt r6 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzh()
            java.lang.String r7 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r6.zza(r7)
            goto L167
        L128:
            com.google.android.gms.measurement.internal.zzib r6 = r11.zzu
            com.google.android.gms.measurement.internal.zzgt r6 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzi()
            java.lang.String r7 = "App measurement disabled via the manifest"
            r6.zza(r7)
            goto L167
        L138:
            com.google.android.gms.measurement.internal.zzib r6 = r11.zzu
            com.google.android.gms.measurement.internal.zzgt r6 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzi()
            java.lang.String r7 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r6.zza(r7)
            goto L167
        L148:
            com.google.android.gms.measurement.internal.zzib r6 = r11.zzu
            com.google.android.gms.measurement.internal.zzgt r6 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzi()
            java.lang.String r7 = "App measurement deactivated via the manifest"
            r6.zza(r7)
            goto L167
        L158:
            com.google.android.gms.measurement.internal.zzib r6 = r11.zzu
            com.google.android.gms.measurement.internal.zzgt r6 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzk()
            java.lang.String r7 = "App measurement collection enabled"
            r6.zza(r7)
        L167:
            r11.zzl = r4
            com.google.android.gms.measurement.internal.zzib r6 = r11.zzu
            r6.zzaU()
            android.content.Context r7 = r6.zzaY()     // Catch: java.lang.IllegalStateException -> L19a
            java.lang.String r0 = r0.zzq()     // Catch: java.lang.IllegalStateException -> L19a
            java.lang.String r8 = "google_app_id"
            java.lang.String r0 = com.google.android.gms.measurement.internal.zzls.zza(r7, r8, r0)     // Catch: java.lang.IllegalStateException -> L19a
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.IllegalStateException -> L19a
            if (r7 == 0) goto L183
            goto L184
        L183:
            r4 = r0
        L184:
            r11.zzl = r4     // Catch: java.lang.IllegalStateException -> L19a
            if (r5 != 0) goto L1ae
            com.google.android.gms.measurement.internal.zzgt r0 = r6.zzaV()     // Catch: java.lang.IllegalStateException -> L19a
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()     // Catch: java.lang.IllegalStateException -> L19a
            java.lang.String r4 = "App measurement enabled for app package, google app id"
            java.lang.String r5 = r11.zza     // Catch: java.lang.IllegalStateException -> L19a
            java.lang.String r6 = r11.zzl     // Catch: java.lang.IllegalStateException -> L19a
            r0.zzc(r4, r5, r6)     // Catch: java.lang.IllegalStateException -> L19a
            goto L1ae
        L19a:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzib r4 = r11.zzu
            com.google.android.gms.measurement.internal.zzgt r4 = r4.zzaV()
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzb()
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzgt.zzl(r1)
            java.lang.String r5 = "Fetching Google App Id failed with exception. appId"
            r4.zzc(r5, r1, r0)
        L1ae:
            r0 = 0
            r11.zzi = r0
            com.google.android.gms.measurement.internal.zzib r0 = r11.zzu
            r0.zzaU()
            com.google.android.gms.measurement.internal.zzal r1 = r0.zzc()
            java.lang.String r4 = "analytics.safelisted_events"
            java.util.List r1 = r1.zzs(r4)
            if (r1 != 0) goto L1c3
            goto L1f4
        L1c3:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L1d7
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzh()
            java.lang.String r4 = "Safelisted event list is empty. Ignoring"
            r1.zza(r4)
            goto L1f6
        L1d7:
            java.util.Iterator r4 = r1.iterator()
        L1db:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1f4
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.measurement.internal.zzpo r6 = r0.zzk()
            java.lang.String r7 = "safelisted event"
            boolean r5 = r6.zzk(r7, r5)
            if (r5 != 0) goto L1db
            goto L1f6
        L1f4:
            r11.zzi = r1
        L1f6:
            if (r2 == 0) goto L203
            android.content.Context r0 = r0.zzaY()
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r0)
            r11.zzk = r0
            return
        L203:
            r11.zzk = r3
            return
    }

    @androidx.annotation.WorkerThread
    public final com.google.android.gms.measurement.internal.zzr zzh(java.lang.String r45) {
            r44 = this;
            r1 = r44
            r1.zzg()
            com.google.android.gms.measurement.internal.zzr r2 = new com.google.android.gms.measurement.internal.zzr
            java.lang.String r3 = r1.zzj()
            java.lang.String r4 = r1.zzk()
            r1.zzb()
            java.lang.String r5 = r1.zzb
            r1.zzb()
            int r0 = r1.zzc
            long r6 = (long) r0
            r1.zzb()
            java.lang.String r0 = r1.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r8 = r1.zzd
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzal r9 = r0.zzc()
            r9.zzi()
            r1.zzb()
            r1.zzg()
            long r9 = r1.zzf
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r14 = 0
            if (r13 != 0) goto Ldd
            com.google.android.gms.measurement.internal.zzib r9 = r1.zzu
            com.google.android.gms.measurement.internal.zzpo r9 = r9.zzk()
            android.content.Context r10 = r0.zzaY()
            android.content.Context r0 = r0.zzaY()
            java.lang.String r0 = r0.getPackageName()
            r9.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            android.content.pm.PackageManager r13 = r10.getPackageManager()
            java.security.MessageDigest r15 = com.google.android.gms.measurement.internal.zzpo.zzO()
            r16 = -1
            if (r15 != 0) goto L77
            com.google.android.gms.measurement.internal.zzib r0 = r9.zzu
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()
            java.lang.String r9 = "Could not get MD5 instance"
            r0.zza(r9)
            r18 = r11
        L74:
            r9 = r16
            goto Ld9
        L77:
            if (r13 == 0) goto Ld6
            boolean r0 = r9.zzad(r10, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbb
            if (r0 != 0) goto Lbf
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbb
            com.google.android.gms.measurement.internal.zzib r10 = r9.zzu     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbb
            android.content.Context r13 = r10.zzaY()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbb
            java.lang.String r13 = r13.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbb
            r18 = r11
            r11 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r13, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
            if (r0 == 0) goto Lad
            int r11 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
            if (r11 <= 0) goto Lad
            r0 = r0[r14]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
            byte[] r0 = r0.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
            byte[] r0 = r15.digest(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
            long r16 = com.google.android.gms.measurement.internal.zzpo.zzP(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
            goto L74
        Lab:
            r0 = move-exception
            goto Lc4
        Lad:
            com.google.android.gms.measurement.internal.zzgt r0 = r10.zzaV()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zze()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
            java.lang.String r10 = "Could not get signatures"
            r0.zza(r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
            goto L74
        Lbb:
            r0 = move-exception
            r18 = r11
            goto Lc4
        Lbf:
            r18 = r11
            r16 = r18
            goto L74
        Lc4:
            com.google.android.gms.measurement.internal.zzib r9 = r9.zzu
            com.google.android.gms.measurement.internal.zzgt r9 = r9.zzaV()
            com.google.android.gms.measurement.internal.zzgr r9 = r9.zzb()
            java.lang.String r10 = "Package name not found"
            r9.zzb(r10, r0)
        Ld3:
            r9 = r18
            goto Ld9
        Ld6:
            r18 = r11
            goto Ld3
        Ld9:
            r1.zzf = r9
        Ldb:
            r11 = r9
            goto Le0
        Ldd:
            r18 = r11
            goto Ldb
        Le0:
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzu
            boolean r9 = r0.zzB()
            com.google.android.gms.measurement.internal.zzhg r10 = r0.zzd()
            boolean r10 = r10.zzm
            r13 = 1
            r15 = r10 ^ 1
            r1.zzg()
            boolean r10 = r0.zzB()
            r13 = 0
            if (r10 != 0) goto Lfe
        Lf9:
            r21 = r2
            r0 = r13
            goto L187
        Lfe:
            com.google.android.gms.internal.measurement.zzrg.zza()
            com.google.android.gms.measurement.internal.zzal r10 = r0.zzc()
            com.google.android.gms.measurement.internal.zzfw r14 = com.google.android.gms.measurement.internal.zzfx.zzaH
            boolean r10 = r10.zzp(r13, r14)
            if (r10 == 0) goto L11d
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            java.lang.String r10 = "Disabled IID for tests."
            r0.zza(r10)
            goto Lf9
        L11d:
            android.content.Context r0 = r0.zzaY()     // Catch: java.lang.ClassNotFoundException -> L184
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L184
            java.lang.String r10 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = r0.loadClass(r10)     // Catch: java.lang.ClassNotFoundException -> L184
            if (r0 != 0) goto L12e
            goto Lf9
        L12e:
            java.lang.String r10 = "getInstance"
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            java.lang.Class[] r14 = new java.lang.Class[]{r14}     // Catch: java.lang.Exception -> L172
            java.lang.reflect.Method r10 = r0.getDeclaredMethod(r10, r14)     // Catch: java.lang.Exception -> L172
            com.google.android.gms.measurement.internal.zzib r14 = r1.zzu     // Catch: java.lang.Exception -> L172
            android.content.Context r14 = r14.zzaY()     // Catch: java.lang.Exception -> L172
            java.lang.Object[] r14 = new java.lang.Object[]{r14}     // Catch: java.lang.Exception -> L172
            java.lang.Object r10 = r10.invoke(r13, r14)     // Catch: java.lang.Exception -> L172
            if (r10 != 0) goto L14b
            goto Lf9
        L14b:
            java.lang.String r14 = "getFirebaseInstanceId"
            r21 = r2
            r13 = 0
            java.lang.Class[] r2 = new java.lang.Class[r13]     // Catch: java.lang.Exception -> L161
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r14, r2)     // Catch: java.lang.Exception -> L161
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch: java.lang.Exception -> L161
            java.lang.Object r0 = r0.invoke(r10, r2)     // Catch: java.lang.Exception -> L161
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L161
            goto L187
        L15f:
            r21 = r2
        L161:
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzh()
            java.lang.String r2 = "Failed to retrieve Firebase Instance Id"
            r0.zza(r2)
        L170:
            r0 = 0
            goto L187
        L172:
            r21 = r2
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzf()
            java.lang.String r2 = "Failed to obtain Firebase Analytics instance"
            r0.zza(r2)
            goto L170
        L184:
            r21 = r2
            goto L170
        L187:
            com.google.android.gms.measurement.internal.zzib r2 = r1.zzu
            com.google.android.gms.measurement.internal.zzhg r10 = r2.zzd()
            com.google.android.gms.measurement.internal.zzhd r10 = r10.zzc
            long r13 = r10.zza()
            int r10 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r10 != 0) goto L19b
            long r13 = r2.zza
            r10 = r3
            goto L1a2
        L19b:
            r10 = r3
            long r2 = r2.zza
            long r13 = java.lang.Math.min(r2, r13)
        L1a2:
            r1.zzb()
            int r2 = r1.zzk
            com.google.android.gms.measurement.internal.zzib r3 = r1.zzu
            com.google.android.gms.measurement.internal.zzal r22 = r3.zzc()
            boolean r22 = r22.zzu()
            com.google.android.gms.measurement.internal.zzhg r23 = r3.zzd()
            r23.zzg()
            r24 = r0
            android.content.SharedPreferences r0 = r23.zzd()
            r23 = r2
            java.lang.String r2 = "deferred_analytics_collection"
            r25 = r3
            r3 = 0
            boolean r0 = r0.getBoolean(r2, r3)
            com.google.android.gms.measurement.internal.zzal r2 = r25.zzc()
            java.lang.String r3 = "google_analytics_default_allow_ad_personalization_signals"
            r26 = r0
            r0 = 1
            com.google.android.gms.measurement.internal.zzjh r2 = r2.zzw(r3, r0)
            com.google.android.gms.measurement.internal.zzjh r0 = com.google.android.gms.measurement.internal.zzjh.zzd
            if (r2 == r0) goto L1df
            r0 = 1
        L1db:
            r2 = r4
            r27 = r5
            goto L1e1
        L1df:
            r0 = 0
            goto L1db
        L1e1:
            long r4 = r1.zzg
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r28 = r0
            java.util.List r0 = r1.zzi
            com.google.android.gms.measurement.internal.zzhg r29 = r25.zzd()
            com.google.android.gms.measurement.internal.zzjk r29 = r29.zzl()
            java.lang.String r29 = r29.zzl()
            r30 = r0
            java.lang.String r0 = r1.zzj
            if (r0 != 0) goto L207
            com.google.android.gms.measurement.internal.zzpo r0 = r25.zzk()
            java.lang.String r0 = r0.zzaw()
            r1.zzj = r0
        L207:
            java.lang.String r0 = r1.zzj
            com.google.android.gms.measurement.internal.zzhg r31 = r25.zzd()
            r32 = r0
            com.google.android.gms.measurement.internal.zzjk r0 = r31.zzl()
            r31 = r2
            com.google.android.gms.measurement.internal.zzjj r2 = com.google.android.gms.measurement.internal.zzjj.zzb
            boolean r0 = r0.zzo(r2)
            if (r0 != 0) goto L221
            r33 = r4
            r0 = 0
            goto L256
        L221:
            r1.zzg()
            r33 = r4
            long r4 = r1.zzn
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 != 0) goto L22d
            goto L24d
        L22d:
            com.google.android.gms.common.util.Clock r0 = r25.zzaZ()
            long r4 = r0.currentTimeMillis()
            r35 = r4
            long r4 = r1.zzn
            long r4 = r35 - r4
            java.lang.String r0 = r1.zzm
            if (r0 == 0) goto L24d
            r35 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r4 > r35 ? 1 : (r4 == r35 ? 0 : -1))
            if (r0 <= 0) goto L24d
            java.lang.String r0 = r1.zzo
            if (r0 != 0) goto L24d
            r1.zzi()
        L24d:
            java.lang.String r0 = r1.zzm
            if (r0 != 0) goto L254
            r1.zzi()
        L254:
            java.lang.String r0 = r1.zzm
        L256:
            com.google.android.gms.measurement.internal.zzal r2 = r25.zzc()
            boolean r2 = r2.zzx()
            com.google.android.gms.measurement.internal.zzpo r4 = r25.zzk()
            java.lang.String r5 = r1.zzj()
            r25 = r0
            com.google.android.gms.measurement.internal.zzib r0 = r4.zzu
            android.content.Context r35 = r0.zzaY()
            android.content.pm.PackageManager r35 = r35.getPackageManager()
            if (r35 != 0) goto L27a
            r35 = r2
            r4 = r18
            r2 = 0
            goto L2a7
        L27a:
            android.content.Context r0 = r0.zzaY()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L290
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L290
            r35 = r2
            r2 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r5, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L293
            if (r0 == 0) goto L28e
            int r0 = r0.targetSdkVersion     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L293
            goto L2a6
        L28e:
            r0 = r2
            goto L2a6
        L290:
            r35 = r2
            r2 = 0
        L293:
            com.google.android.gms.measurement.internal.zzib r0 = r4.zzu
            r0.zzaU()
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzi()
            java.lang.String r4 = "PackageManager failed to find running app: app_id"
            r0.zzb(r4, r5)
            goto L28e
        L2a6:
            long r4 = (long) r0
        L2a7:
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzhg r17 = r0.zzd()
            com.google.android.gms.measurement.internal.zzjk r17 = r17.zzl()
            int r17 = r17.zzb()
            com.google.android.gms.measurement.internal.zzhg r36 = r0.zzd()
            com.google.android.gms.measurement.internal.zzaz r36 = r36.zzj()
            java.lang.String r36 = r36.zze()
            com.google.android.gms.internal.measurement.zzql.zza()
            com.google.android.gms.measurement.internal.zzal r2 = r0.zzc()
            r38 = r0
            com.google.android.gms.measurement.internal.zzfw r0 = com.google.android.gms.measurement.internal.zzfx.zzaQ
            r39 = r4
            r4 = 0
            boolean r2 = r2.zzp(r4, r0)
            if (r2 == 0) goto L2de
            com.google.android.gms.measurement.internal.zzpo r2 = r38.zzk()
            int r2 = r2.zzU()
            goto L2df
        L2de:
            r2 = 0
        L2df:
            com.google.android.gms.internal.measurement.zzql.zza()
            com.google.android.gms.measurement.internal.zzal r5 = r38.zzc()
            boolean r0 = r5.zzp(r4, r0)
            if (r0 == 0) goto L2f6
            com.google.android.gms.measurement.internal.zzpo r0 = r38.zzk()
            long r4 = r0.zzV()
            r18 = r4
        L2f6:
            com.google.android.gms.measurement.internal.zzal r0 = r38.zzc()
            java.lang.String r37 = r0.zzz()
            com.google.android.gms.measurement.internal.zzal r0 = r38.zzc()
            r4 = 1
            com.google.android.gms.measurement.internal.zzjh r0 = r0.zzw(r3, r4)
            com.google.android.gms.measurement.internal.zze r3 = new com.google.android.gms.measurement.internal.zze
            r3.<init>(r0)
            java.lang.String r38 = r3.zzb()
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzu
            long r3 = r0.zza
            com.google.android.gms.measurement.internal.zzlp r0 = r0.zzx()
            com.google.android.gms.internal.measurement.zzin r0 = r0.zzj()
            int r41 = r0.zza()
            r20 = r22
            r16 = r24
            r5 = r27
            r22 = r28
            r27 = r32
            r32 = r17
            r28 = r25
            r25 = r30
            r42 = r33
            r34 = r2
            r2 = r21
            r21 = r26
            r26 = r29
            r29 = r35
            r33 = r36
            r35 = r18
            r19 = r23
            r23 = r42
            r17 = r13
            r14 = r9
            r42 = r3
            r3 = r10
            r4 = r31
            r30 = r39
            r39 = r42
            r9 = 130000(0x1fbd0, double:6.42285E-319)
            r13 = r45
            r2.<init>(r3, r4, r5, r6, r8, r9, r11, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39, r41)
            return r2
    }

    @androidx.annotation.WorkerThread
    public final void zzi() {
            r5 = this;
            r5.zzg()
            com.google.android.gms.measurement.internal.zzib r0 = r5.zzu
            com.google.android.gms.measurement.internal.zzhg r1 = r0.zzd()
            com.google.android.gms.measurement.internal.zzjk r1 = r1.zzl()
            com.google.android.gms.measurement.internal.zzjj r2 = com.google.android.gms.measurement.internal.zzjj.zzb
            boolean r1 = r1.zzo(r2)
            if (r1 != 0) goto L24
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzj()
            java.lang.String r2 = "Analytics Storage consent is not granted"
            r1.zza(r2)
            r1 = 0
            goto L45
        L24:
            r1 = 16
            byte[] r1 = new byte[r1]
            com.google.android.gms.measurement.internal.zzpo r2 = r0.zzk()
            java.security.SecureRandom r2 = r2.zzf()
            r2.nextBytes(r1)
            java.util.Locale r2 = java.util.Locale.US
            java.math.BigInteger r3 = new java.math.BigInteger
            r4 = 1
            r3.<init>(r4, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r3 = "%032x"
            java.lang.String r1 = java.lang.String.format(r2, r3, r1)
        L45:
            com.google.android.gms.measurement.internal.zzgt r2 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzj()
            if (r1 != 0) goto L52
            java.lang.String r3 = "null"
            goto L54
        L52:
            java.lang.String r3 = "not null"
        L54:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "Resetting session stitching token to %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.zza(r3)
            r5.zzm = r1
            com.google.android.gms.common.util.Clock r0 = r0.zzaZ()
            long r0 = r0.currentTimeMillis()
            r5.zzn = r0
            return
    }

    @androidx.annotation.WorkerThread
    public final java.lang.String zzj() {
            r1 = this;
            r1.zzb()
            java.lang.String r0 = r1.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = r1.zza
            return r0
    }

    @androidx.annotation.WorkerThread
    public final java.lang.String zzk() {
            r1 = this;
            r1.zzg()
            r1.zzb()
            java.lang.String r0 = r1.zzl
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = r1.zzl
            return r0
    }

    @androidx.annotation.WorkerThread
    public final java.lang.String zzl() {
            r1 = this;
            r1.zzb()
            java.lang.String r0 = r1.zze
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = r1.zze
            return r0
    }

    @androidx.annotation.WorkerThread
    public final int zzm() {
            r1 = this;
            r1.zzb()
            int r0 = r1.zzc
            return r0
    }

    public final long zzn() {
            r2 = this;
            long r0 = r2.zzh
            return r0
    }

    @androidx.annotation.WorkerThread
    public final int zzo() {
            r1 = this;
            r1.zzb()
            int r0 = r1.zzk
            return r0
    }

    @androidx.annotation.WorkerThread
    public final java.util.List zzp() {
            r1 = this;
            java.util.List r0 = r1.zzi
            return r0
    }

    public final boolean zzq(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.zzo
            r1 = 0
            if (r0 == 0) goto Lc
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto Lc
            r1 = 1
        Lc:
            r2.zzo = r3
            return r1
    }
}
