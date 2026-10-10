package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzpf implements com.google.android.gms.measurement.internal.zzjf {
    private static volatile com.google.android.gms.measurement.internal.zzpf zzb;
    private java.util.List zzA;
    private long zzB;
    private final java.util.Map zzC;
    private final java.util.Map zzD;
    private final java.util.Map zzE;
    private final java.util.Map zzF;
    private com.google.android.gms.measurement.internal.zzlt zzG;
    private java.lang.String zzH;
    private com.google.android.gms.measurement.internal.zzay zzI;
    private long zzJ;
    private final com.google.android.gms.measurement.internal.zzpn zzK;

    @androidx.annotation.VisibleForTesting
    long zza;
    private final com.google.android.gms.measurement.internal.zzhs zzc;
    private final com.google.android.gms.measurement.internal.zzgy zzd;
    private com.google.android.gms.measurement.internal.zzav zze;
    private com.google.android.gms.measurement.internal.zzha zzf;
    private com.google.android.gms.measurement.internal.zzoj zzg;
    private com.google.android.gms.measurement.internal.zzad zzh;
    private final com.google.android.gms.measurement.internal.zzpj zzi;
    private com.google.android.gms.measurement.internal.zzlo zzj;
    private com.google.android.gms.measurement.internal.zznm zzk;
    private final com.google.android.gms.measurement.internal.zzot zzl;
    private com.google.android.gms.measurement.internal.zzhj zzm;
    private final com.google.android.gms.measurement.internal.zzib zzn;
    private final java.util.concurrent.atomic.AtomicBoolean zzo;
    private boolean zzp;
    private java.util.List zzq;
    private final java.util.Deque zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private java.nio.channels.FileLock zzx;
    private java.nio.channels.FileChannel zzy;
    private java.util.List zzz;

    public zzpf(com.google.android.gms.measurement.internal.zzpg r3, com.google.android.gms.measurement.internal.zzib r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r4.<init>(r0)
            r2.zzo = r4
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r2.zzr = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.zzF = r4
            com.google.android.gms.measurement.internal.zzpa r4 = new com.google.android.gms.measurement.internal.zzpa
            r4.<init>(r2)
            r2.zzK = r4
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.content.Context r4 = r3.zza
            r0 = 0
            com.google.android.gms.measurement.internal.zzib r4 = com.google.android.gms.measurement.internal.zzib.zzy(r4, r0, r0)
            r2.zzn = r4
            r0 = -1
            r2.zzB = r0
            com.google.android.gms.measurement.internal.zzot r4 = new com.google.android.gms.measurement.internal.zzot
            r4.<init>(r2)
            r2.zzl = r4
            com.google.android.gms.measurement.internal.zzpj r4 = new com.google.android.gms.measurement.internal.zzpj
            r4.<init>(r2)
            r4.zzaz()
            r2.zzi = r4
            com.google.android.gms.measurement.internal.zzgy r4 = new com.google.android.gms.measurement.internal.zzgy
            r4.<init>(r2)
            r4.zzaz()
            r2.zzd = r4
            com.google.android.gms.measurement.internal.zzhs r4 = new com.google.android.gms.measurement.internal.zzhs
            r4.<init>(r2)
            r4.zzaz()
            r2.zzc = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.zzC = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.zzD = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.zzE = r4
            com.google.android.gms.measurement.internal.zzhy r4 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzou r0 = new com.google.android.gms.measurement.internal.zzou
            r0.<init>(r2, r3)
            r4.zzj(r0)
            return
    }

    public static com.google.android.gms.measurement.internal.zzpf zza(android.content.Context r3) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.content.Context r0 = r3.getApplicationContext()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzpf r0 = com.google.android.gms.measurement.internal.zzpf.zzb
            if (r0 != 0) goto L2f
            java.lang.Class<com.google.android.gms.measurement.internal.zzpf> r0 = com.google.android.gms.measurement.internal.zzpf.class
            monitor-enter(r0)
            com.google.android.gms.measurement.internal.zzpf r1 = com.google.android.gms.measurement.internal.zzpf.zzb     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L2b
            com.google.android.gms.measurement.internal.zzpg r1 = new com.google.android.gms.measurement.internal.zzpg     // Catch: java.lang.Throwable -> L29
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.measurement.internal.zzpg r3 = (com.google.android.gms.measurement.internal.zzpg) r3     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.measurement.internal.zzpf r1 = new com.google.android.gms.measurement.internal.zzpf     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.measurement.internal.zzpf.zzb = r1     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r3 = move-exception
            goto L2d
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            goto L2f
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r3
        L2f:
            com.google.android.gms.measurement.internal.zzpf r3 = com.google.android.gms.measurement.internal.zzpf.zzb
            return r3
    }

    @androidx.annotation.VisibleForTesting
    public static final void zzaA(com.google.android.gms.internal.measurement.zzhr r3, @androidx.annotation.NonNull java.lang.String r4) {
            java.util.List r0 = r3.zza()
            r1 = 0
        L5:
            int r2 = r0.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzhw r2 = (com.google.android.gms.internal.measurement.zzhw) r2
            java.lang.String r2 = r2.zzb()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1f
            r3.zzj(r1)
            return
        L1f:
            int r1 = r1 + 1
            goto L5
        L22:
            return
    }

    private final int zzaB(java.lang.String r7, com.google.android.gms.measurement.internal.zzan r8) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzhs r0 = r6.zzc
            com.google.android.gms.internal.measurement.zzgf r1 = r0.zzx(r7)
            r2 = 1
            if (r1 != 0) goto L11
            com.google.android.gms.measurement.internal.zzjj r7 = com.google.android.gms.measurement.internal.zzjj.zzd
            com.google.android.gms.measurement.internal.zzam r0 = com.google.android.gms.measurement.internal.zzam.zzj
            r8.zzc(r7, r0)
            return r2
        L11:
            com.google.android.gms.measurement.internal.zzav r1 = r6.zzj()
            com.google.android.gms.measurement.internal.zzh r1 = r1.zzu(r7)
            r3 = 0
            if (r1 == 0) goto L41
            java.lang.String r1 = r1.zzaH()
            com.google.android.gms.measurement.internal.zze r1 = com.google.android.gms.measurement.internal.zze.zzc(r1)
            com.google.android.gms.measurement.internal.zzjh r1 = r1.zza()
            com.google.android.gms.measurement.internal.zzjh r4 = com.google.android.gms.measurement.internal.zzjh.zzb
            if (r1 != r4) goto L41
            com.google.android.gms.measurement.internal.zzjj r1 = com.google.android.gms.measurement.internal.zzjj.zzd
            com.google.android.gms.measurement.internal.zzjh r4 = r0.zzA(r7, r1)
            com.google.android.gms.measurement.internal.zzjh r5 = com.google.android.gms.measurement.internal.zzjh.zza
            if (r4 == r5) goto L41
            com.google.android.gms.measurement.internal.zzam r7 = com.google.android.gms.measurement.internal.zzam.zzi
            r8.zzc(r1, r7)
            com.google.android.gms.measurement.internal.zzjh r7 = com.google.android.gms.measurement.internal.zzjh.zzd
            if (r4 != r7) goto L40
            return r3
        L40:
            return r2
        L41:
            com.google.android.gms.measurement.internal.zzjj r1 = com.google.android.gms.measurement.internal.zzjj.zzd
            com.google.android.gms.measurement.internal.zzam r4 = com.google.android.gms.measurement.internal.zzam.zzb
            r8.zzc(r1, r4)
            boolean r7 = r0.zzv(r7, r1)
            if (r7 == 0) goto L4f
            return r3
        L4f:
            return r2
    }

    private final java.util.Map zzaC(com.google.android.gms.internal.measurement.zzhs r4) {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.zzp()
            java.lang.String r1 = "gad_"
            java.util.Map r4 = com.google.android.gms.measurement.internal.zzpj.zzH(r4, r1)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L16:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
            goto L16
        L34:
            return r0
    }

    private final com.google.android.gms.measurement.internal.zzay zzaD() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzay r0 = r2.zzI
            if (r0 != 0) goto Ld
            com.google.android.gms.measurement.internal.zzib r0 = r2.zzn
            com.google.android.gms.measurement.internal.zzox r1 = new com.google.android.gms.measurement.internal.zzox
            r1.<init>(r2, r0)
            r2.zzI = r1
        Ld:
            com.google.android.gms.measurement.internal.zzay r0 = r2.zzI
            return r0
    }

    @androidx.annotation.WorkerThread
    private final void zzaE() {
            r5 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r5.zzaW()
            r0.zzg()
            java.util.Deque r0 = r5.zzr
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L51
            com.google.android.gms.measurement.internal.zzay r0 = r5.zzaD()
            boolean r0 = r0.zzc()
            if (r0 != 0) goto L51
            com.google.android.gms.common.util.Clock r0 = r5.zzaZ()
            long r0 = r0.elapsedRealtime()
            long r2 = r5.zzJ
            long r0 = r0 - r2
            com.google.android.gms.measurement.internal.zzfw r2 = com.google.android.gms.measurement.internal.zzfx.zzaB
            r3 = 0
            java.lang.Object r2 = r2.zzb(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r2 = (long) r2
            long r2 = r2 - r0
            r0 = 0
            long r0 = java.lang.Math.max(r0, r2)
            com.google.android.gms.measurement.internal.zzgt r2 = r5.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzk()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = "Scheduling notify next app runnable, delay in ms"
            r2.zzb(r4, r3)
            com.google.android.gms.measurement.internal.zzay r2 = r5.zzaD()
            r2.zzb(r0)
        L51:
            return
    }

    @androidx.annotation.WorkerThread
    private final boolean zzaF(java.lang.String r46, long r47) {
            r45 = this;
            r1 = r45
            java.lang.String r2 = "_efs"
            java.lang.String r0 = "Generated trigger URI. appId, uri"
            java.lang.String r3 = "_tr"
            java.lang.String r4 = "_tu"
            java.lang.String r7 = "_ai"
            java.lang.String r8 = "purchase"
            java.lang.String r9 = "items"
            com.google.android.gms.measurement.internal.zzav r10 = r1.zzj()
            r10.zzb()
            com.google.android.gms.measurement.internal.zzpb r10 = new com.google.android.gms.measurement.internal.zzpb     // Catch: java.lang.Throwable -> L105
            r11 = 0
            r10.<init>(r1, r11)     // Catch: java.lang.Throwable -> L105
            r12 = r11
            com.google.android.gms.measurement.internal.zzav r11 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            long r13 = r1.zzB     // Catch: java.lang.Throwable -> L105
            r17 = r10
            r10 = r12
            r15 = r13
            r12 = r46
            r13 = r47
            r11.zzav(r12, r13, r15, r17)     // Catch: java.lang.Throwable -> L105
            r11 = r17
            java.util.List r12 = r11.zzc     // Catch: java.lang.Throwable -> L105
            if (r12 == 0) goto L3c
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> L105
            if (r12 == 0) goto L3f
        L3c:
            r3 = 0
            goto Lede
        L3f:
            com.google.android.gms.internal.measurement.zzid r12 = r11.zza     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzma r12 = r12.zzcl()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzic r12 = (com.google.android.gms.internal.measurement.zzic) r12     // Catch: java.lang.Throwable -> L105
            r12.zzi()     // Catch: java.lang.Throwable -> L105
            r14 = r10
            r15 = r14
            r6 = -1
            r10 = 0
            r13 = -1
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 1
        L57:
            java.util.List r5 = r11.zzc     // Catch: java.lang.Throwable -> L105
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L105
            r47 = r14
            java.lang.String r14 = "_et"
            r48 = r15
            java.lang.String r15 = "_fr"
            r22 = r2
            java.lang.String r2 = "_e"
            r23 = r3
            java.lang.String r3 = "_c"
            r24 = r12
            r25 = r13
            if (r10 >= r5) goto L695
            java.util.List r5 = r11.zzc     // Catch: java.lang.Throwable -> L105
            java.lang.Object r5 = r5.get(r10)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhs r5 = (com.google.android.gms.internal.measurement.zzhs) r5     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzma r5 = r5.zzcl()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhr r5 = (com.google.android.gms.internal.measurement.zzhr) r5     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzhs r12 = r1.zzh()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r13 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r13 = r13.zzA()     // Catch: java.lang.Throwable -> L105
            r28 = r4
            java.lang.String r4 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            boolean r4 = r12.zzj(r13, r4)     // Catch: java.lang.Throwable -> L105
            java.lang.String r12 = "_err"
            if (r4 == 0) goto L118
            com.google.android.gms.measurement.internal.zzgt r2 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zze()     // Catch: java.lang.Throwable -> L105
            java.lang.String r3 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.zzid r4 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r4 = r4.zzA()     // Catch: java.lang.Throwable -> L105
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgt.zzl(r4)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzib r13 = r1.zzn     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgm r13 = r13.zzl()     // Catch: java.lang.Throwable -> L105
            java.lang.String r14 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            java.lang.String r13 = r13.zza(r14)     // Catch: java.lang.Throwable -> L105
            r2.zzc(r3, r4, r13)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzhs r2 = r1.zzh()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r3 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r3 = r3.zzA()     // Catch: java.lang.Throwable -> L105
            boolean r2 = r2.zzn(r3)     // Catch: java.lang.Throwable -> L105
            if (r2 != 0) goto L108
            com.google.android.gms.measurement.internal.zzhs r2 = r1.zzh()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r3 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r3 = r3.zzA()     // Catch: java.lang.Throwable -> L105
            boolean r2 = r2.zzo(r3)     // Catch: java.lang.Throwable -> L105
            if (r2 == 0) goto Ldf
            goto L108
        Ldf:
            java.lang.String r2 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            boolean r2 = r12.equals(r2)     // Catch: java.lang.Throwable -> L105
            if (r2 != 0) goto L108
            com.google.android.gms.measurement.internal.zzpo r29 = r1.zzt()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzpn r2 = r1.zzK     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r3 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r31 = r3.zzA()     // Catch: java.lang.Throwable -> L105
            java.lang.String r33 = "_ev"
            java.lang.String r34 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            r35 = 0
            r32 = 11
            r30 = r2
            r29.zzN(r30, r31, r32, r33, r34, r35)     // Catch: java.lang.Throwable -> L105
            goto L108
        L105:
            r0 = move-exception
            goto Leee
        L108:
            r32 = r7
            r33 = r8
            r4 = r10
            r12 = r24
            r13 = r25
            r10 = r9
        L112:
            r14 = r47
            r15 = r48
            goto L685
        L118:
            java.lang.String r4 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            boolean r13 = r4.equals(r8)     // Catch: java.lang.Throwable -> L105
            r29 = r13
            java.lang.String r13 = "ecommerce_purchase"
            r30 = r10
            java.lang.String r10 = "_iap"
            if (r29 != 0) goto L13a
            boolean r29 = r4.equals(r10)     // Catch: java.lang.Throwable -> L105
            if (r29 != 0) goto L13a
            boolean r4 = r4.equals(r13)     // Catch: java.lang.Throwable -> L105
            if (r4 == 0) goto L137
            goto L13a
        L137:
            r29 = r9
            goto L173
        L13a:
            com.google.android.gms.internal.measurement.zzhv r4 = com.google.android.gms.internal.measurement.zzhw.zzn()     // Catch: java.lang.Throwable -> L105
            r29 = r9
            java.lang.String r9 = "_ct"
            r4.zzb(r9)     // Catch: java.lang.Throwable -> L105
            if (r18 != 0) goto L162
            com.google.android.gms.internal.measurement.zzid r9 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzA()     // Catch: java.lang.Throwable -> L105
            boolean r18 = r1.zzaO(r9, r8)     // Catch: java.lang.Throwable -> L105
            if (r18 == 0) goto L162
            boolean r10 = r1.zzaO(r9, r10)     // Catch: java.lang.Throwable -> L105
            if (r10 == 0) goto L162
            boolean r9 = r1.zzaO(r9, r13)     // Catch: java.lang.Throwable -> L105
            if (r9 == 0) goto L162
            java.lang.String r9 = "new"
            goto L165
        L162:
            java.lang.String r9 = "returning"
        L165:
            r4.zzd(r9)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r4 = r4.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r4 = (com.google.android.gms.internal.measurement.zzhw) r4     // Catch: java.lang.Throwable -> L105
            r5.zzf(r4)     // Catch: java.lang.Throwable -> L105
            r18 = r20
        L173:
            java.lang.String r4 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = com.google.android.gms.measurement.internal.zzjl.zza(r7)     // Catch: java.lang.Throwable -> L105
            boolean r4 = r4.equals(r9)     // Catch: java.lang.Throwable -> L105
            if (r4 == 0) goto L1e5
            r5.zzl(r7)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgt r4 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzk()     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = "Renaming ad_impression to _ai"
            r4.zza(r9)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgt r4 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            java.lang.String r4 = r4.zzn()     // Catch: java.lang.Throwable -> L105
            r9 = 5
            boolean r4 = android.util.Log.isLoggable(r4, r9)     // Catch: java.lang.Throwable -> L105
            if (r4 == 0) goto L1e5
            r4 = 0
        L1a1:
            int r9 = r5.zzb()     // Catch: java.lang.Throwable -> L105
            if (r4 >= r9) goto L1e5
            java.lang.String r9 = "ad_platform"
            com.google.android.gms.internal.measurement.zzhw r10 = r5.zzc(r4)     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = r10.zzb()     // Catch: java.lang.Throwable -> L105
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L105
            if (r9 == 0) goto L1e2
            com.google.android.gms.internal.measurement.zzhw r9 = r5.zzc(r4)     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzd()     // Catch: java.lang.Throwable -> L105
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L105
            if (r9 != 0) goto L1e2
            java.lang.String r9 = "admob"
            com.google.android.gms.internal.measurement.zzhw r10 = r5.zzc(r4)     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = r10.zzd()     // Catch: java.lang.Throwable -> L105
            boolean r9 = r9.equalsIgnoreCase(r10)     // Catch: java.lang.Throwable -> L105
            if (r9 == 0) goto L1e2
            com.google.android.gms.measurement.internal.zzgt r9 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r9 = r9.zzh()     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = "AdMob ad impression logged from app. Potentially duplicative."
            r9.zza(r10)     // Catch: java.lang.Throwable -> L105
        L1e2:
            int r4 = r4 + 1
            goto L1a1
        L1e5:
            com.google.android.gms.measurement.internal.zzhs r4 = r1.zzh()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r9 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzA()     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            boolean r4 = r4.zzk(r9, r10)     // Catch: java.lang.Throwable -> L105
            if (r4 != 0) goto L215
            r1.zzp()     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)     // Catch: java.lang.Throwable -> L105
            int r10 = r9.hashCode()     // Catch: java.lang.Throwable -> L105
            r13 = 95027(0x17333, float:1.33161E-40)
            if (r10 == r13) goto L20d
            goto L21b
        L20d:
            java.lang.String r10 = "_ui"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L21b
        L215:
            r31 = r4
            r9 = 0
            r10 = 0
            r13 = 0
            goto L223
        L21b:
            r32 = r7
            r33 = r8
            r31 = 0
            goto L3e7
        L223:
            int r4 = r5.zzb()     // Catch: java.lang.Throwable -> L105
            r32 = r7
            java.lang.String r7 = "_r"
            if (r9 >= r4) goto L289
            com.google.android.gms.internal.measurement.zzhw r4 = r5.zzc(r9)     // Catch: java.lang.Throwable -> L105
            java.lang.String r4 = r4.zzb()     // Catch: java.lang.Throwable -> L105
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L105
            if (r4 == 0) goto L258
            com.google.android.gms.internal.measurement.zzhw r4 = r5.zzc(r9)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzma r4 = r4.zzcl()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhv r4 = (com.google.android.gms.internal.measurement.zzhv) r4     // Catch: java.lang.Throwable -> L105
            r33 = r8
            r7 = 1
            r4.zzf(r7)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r4 = r4.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r4 = (com.google.android.gms.internal.measurement.zzhw) r4     // Catch: java.lang.Throwable -> L105
            r5.zzd(r9, r4)     // Catch: java.lang.Throwable -> L105
            r10 = r20
            goto L282
        L258:
            r33 = r8
            com.google.android.gms.internal.measurement.zzhw r4 = r5.zzc(r9)     // Catch: java.lang.Throwable -> L105
            java.lang.String r4 = r4.zzb()     // Catch: java.lang.Throwable -> L105
            boolean r4 = r7.equals(r4)     // Catch: java.lang.Throwable -> L105
            if (r4 == 0) goto L282
            com.google.android.gms.internal.measurement.zzhw r4 = r5.zzc(r9)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzma r4 = r4.zzcl()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhv r4 = (com.google.android.gms.internal.measurement.zzhv) r4     // Catch: java.lang.Throwable -> L105
            r7 = 1
            r4.zzf(r7)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r4 = r4.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r4 = (com.google.android.gms.internal.measurement.zzhw) r4     // Catch: java.lang.Throwable -> L105
            r5.zzd(r9, r4)     // Catch: java.lang.Throwable -> L105
            r13 = r20
        L282:
            int r9 = r9 + 1
            r7 = r32
            r8 = r33
            goto L223
        L289:
            r33 = r8
            if (r10 != 0) goto L2b9
            if (r31 == 0) goto L2b9
            com.google.android.gms.measurement.internal.zzgt r4 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzk()     // Catch: java.lang.Throwable -> L105
            java.lang.String r8 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.zzib r9 = r1.zzn     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgm r9 = r9.zzl()     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zza(r10)     // Catch: java.lang.Throwable -> L105
            r4.zzb(r8, r9)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhv r4 = com.google.android.gms.internal.measurement.zzhw.zzn()     // Catch: java.lang.Throwable -> L105
            r4.zzb(r3)     // Catch: java.lang.Throwable -> L105
            r8 = 1
            r4.zzf(r8)     // Catch: java.lang.Throwable -> L105
            r5.zzg(r4)     // Catch: java.lang.Throwable -> L105
        L2b9:
            if (r13 != 0) goto L2e5
            com.google.android.gms.measurement.internal.zzgt r4 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzk()     // Catch: java.lang.Throwable -> L105
            java.lang.String r8 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.zzib r9 = r1.zzn     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgm r9 = r9.zzl()     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zza(r10)     // Catch: java.lang.Throwable -> L105
            r4.zzb(r8, r9)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhv r4 = com.google.android.gms.internal.measurement.zzhw.zzn()     // Catch: java.lang.Throwable -> L105
            r4.zzb(r7)     // Catch: java.lang.Throwable -> L105
            r8 = 1
            r4.zzf(r8)     // Catch: java.lang.Throwable -> L105
            r5.zzg(r4)     // Catch: java.lang.Throwable -> L105
        L2e5:
            com.google.android.gms.measurement.internal.zzav r34 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            long r35 = r1.zzC()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r4 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r37 = r4.zzA()     // Catch: java.lang.Throwable -> L105
            r43 = 0
            r44 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 1
            com.google.android.gms.measurement.internal.zzar r4 = r34.zzw(r35, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch: java.lang.Throwable -> L105
            long r8 = r4.zze     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzal r4 = r1.zzd()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r10 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = r10.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzfw r13 = com.google.android.gms.measurement.internal.zzfx.zzo     // Catch: java.lang.Throwable -> L105
            int r4 = r4.zzm(r10, r13)     // Catch: java.lang.Throwable -> L105
            r26 = r8
            long r8 = (long) r4     // Catch: java.lang.Throwable -> L105
            int r4 = (r26 > r8 ? 1 : (r26 == r8 ? 0 : -1))
            if (r4 <= 0) goto L322
            zzaA(r5, r7)     // Catch: java.lang.Throwable -> L105
            goto L324
        L322:
            r19 = r20
        L324:
            java.lang.String r4 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            boolean r4 = com.google.android.gms.measurement.internal.zzpo.zzh(r4)     // Catch: java.lang.Throwable -> L105
            if (r4 == 0) goto L3e7
            if (r31 == 0) goto L3e7
            com.google.android.gms.measurement.internal.zzav r34 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            long r35 = r1.zzC()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r4 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r37 = r4.zzA()     // Catch: java.lang.Throwable -> L105
            r43 = 0
            r44 = 0
            r38 = 0
            r39 = 0
            r40 = 1
            r41 = 0
            r42 = 0
            com.google.android.gms.measurement.internal.zzar r4 = r34.zzw(r35, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch: java.lang.Throwable -> L105
            long r7 = r4.zzc     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzal r4 = r1.zzd()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r9 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzfw r10 = com.google.android.gms.measurement.internal.zzfx.zzn     // Catch: java.lang.Throwable -> L105
            int r4 = r4.zzm(r9, r10)     // Catch: java.lang.Throwable -> L105
            long r9 = (long) r4     // Catch: java.lang.Throwable -> L105
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L3e7
            com.google.android.gms.measurement.internal.zzgt r4 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zze()     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzid r8 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r8 = r8.zzA()     // Catch: java.lang.Throwable -> L105
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzgt.zzl(r8)     // Catch: java.lang.Throwable -> L105
            r4.zzb(r7, r8)     // Catch: java.lang.Throwable -> L105
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = -1
        L382:
            int r10 = r5.zzb()     // Catch: java.lang.Throwable -> L105
            if (r4 >= r10) goto L3ad
            com.google.android.gms.internal.measurement.zzhw r10 = r5.zzc(r4)     // Catch: java.lang.Throwable -> L105
            java.lang.String r13 = r10.zzb()     // Catch: java.lang.Throwable -> L105
            boolean r13 = r3.equals(r13)     // Catch: java.lang.Throwable -> L105
            if (r13 == 0) goto L39e
            com.google.android.gms.internal.measurement.zzma r7 = r10.zzcl()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhv r7 = (com.google.android.gms.internal.measurement.zzhv) r7     // Catch: java.lang.Throwable -> L105
            r9 = r4
            goto L3aa
        L39e:
            java.lang.String r10 = r10.zzb()     // Catch: java.lang.Throwable -> L105
            boolean r10 = r12.equals(r10)     // Catch: java.lang.Throwable -> L105
            if (r10 == 0) goto L3aa
            r8 = r20
        L3aa:
            int r4 = r4 + 1
            goto L382
        L3ad:
            if (r8 == 0) goto L3b6
            if (r7 == 0) goto L3b5
            r5.zzj(r9)     // Catch: java.lang.Throwable -> L105
            goto L3e7
        L3b5:
            r7 = 0
        L3b6:
            if (r7 == 0) goto L3d0
            com.google.android.gms.internal.measurement.zzma r4 = r7.zzba()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhv r4 = (com.google.android.gms.internal.measurement.zzhv) r4     // Catch: java.lang.Throwable -> L105
            r4.zzb(r12)     // Catch: java.lang.Throwable -> L105
            r7 = 10
            r4.zzf(r7)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r4 = r4.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r4 = (com.google.android.gms.internal.measurement.zzhw) r4     // Catch: java.lang.Throwable -> L105
            r5.zzd(r9, r4)     // Catch: java.lang.Throwable -> L105
            goto L3e7
        L3d0:
            com.google.android.gms.measurement.internal.zzgt r4 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzb()     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzid r8 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r8 = r8.zzA()     // Catch: java.lang.Throwable -> L105
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzgt.zzl(r8)     // Catch: java.lang.Throwable -> L105
            r4.zzb(r7, r8)     // Catch: java.lang.Throwable -> L105
        L3e7:
            if (r31 == 0) goto L4a0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L105
            java.util.List r7 = r5.zza()     // Catch: java.lang.Throwable -> L105
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L105
            r7 = 0
            r8 = -1
            r9 = -1
        L3f5:
            int r10 = r4.size()     // Catch: java.lang.Throwable -> L105
            java.lang.String r12 = "currency"
            java.lang.String r13 = "value"
            if (r7 >= r10) goto L426
            java.lang.Object r10 = r4.get(r7)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r10 = (com.google.android.gms.internal.measurement.zzhw) r10     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = r10.zzb()     // Catch: java.lang.Throwable -> L105
            boolean r10 = r13.equals(r10)     // Catch: java.lang.Throwable -> L105
            if (r10 == 0) goto L412
            r8 = r7
            goto L423
        L412:
            java.lang.Object r10 = r4.get(r7)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r10 = (com.google.android.gms.internal.measurement.zzhw) r10     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = r10.zzb()     // Catch: java.lang.Throwable -> L105
            boolean r10 = r12.equals(r10)     // Catch: java.lang.Throwable -> L105
            if (r10 == 0) goto L423
            r9 = r7
        L423:
            int r7 = r7 + 1
            goto L3f5
        L426:
            r7 = -1
            if (r8 != r7) goto L42b
            goto L4a0
        L42b:
            java.lang.Object r7 = r4.get(r8)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r7 = (com.google.android.gms.internal.measurement.zzhw) r7     // Catch: java.lang.Throwable -> L105
            boolean r7 = r7.zze()     // Catch: java.lang.Throwable -> L105
            if (r7 != 0) goto L45c
            java.lang.Object r7 = r4.get(r8)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r7 = (com.google.android.gms.internal.measurement.zzhw) r7     // Catch: java.lang.Throwable -> L105
            boolean r7 = r7.zzi()     // Catch: java.lang.Throwable -> L105
            if (r7 != 0) goto L45c
            com.google.android.gms.measurement.internal.zzgt r4 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzh()     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = "Value must be specified with a numeric type."
            r4.zza(r7)     // Catch: java.lang.Throwable -> L105
            r5.zzj(r8)     // Catch: java.lang.Throwable -> L105
            zzaA(r5, r3)     // Catch: java.lang.Throwable -> L105
            r3 = 18
            zzaz(r5, r3, r13)     // Catch: java.lang.Throwable -> L105
            goto L4a0
        L45c:
            r7 = -1
            if (r9 != r7) goto L460
            goto L488
        L460:
            java.lang.Object r4 = r4.get(r9)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r4 = (com.google.android.gms.internal.measurement.zzhw) r4     // Catch: java.lang.Throwable -> L105
            java.lang.String r4 = r4.zzd()     // Catch: java.lang.Throwable -> L105
            int r7 = r4.length()     // Catch: java.lang.Throwable -> L105
            r9 = 3
            if (r7 != r9) goto L488
            r7 = 0
        L472:
            int r9 = r4.length()     // Catch: java.lang.Throwable -> L105
            if (r7 >= r9) goto L4a0
            int r9 = r4.codePointAt(r7)     // Catch: java.lang.Throwable -> L105
            boolean r10 = java.lang.Character.isLetter(r9)     // Catch: java.lang.Throwable -> L105
            if (r10 == 0) goto L488
            int r9 = java.lang.Character.charCount(r9)     // Catch: java.lang.Throwable -> L105
            int r7 = r7 + r9
            goto L472
        L488:
            com.google.android.gms.measurement.internal.zzgt r4 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzh()     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r4.zza(r7)     // Catch: java.lang.Throwable -> L105
            r5.zzj(r8)     // Catch: java.lang.Throwable -> L105
            zzaA(r5, r3)     // Catch: java.lang.Throwable -> L105
            r3 = 19
            zzaz(r5, r3, r12)     // Catch: java.lang.Throwable -> L105
        L4a0:
            java.lang.String r3 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L105
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L4f6
            r1.zzp()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r2 = r5.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhs r2 = (com.google.android.gms.internal.measurement.zzhs) r2     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r2 = com.google.android.gms.measurement.internal.zzpj.zzF(r2, r15)     // Catch: java.lang.Throwable -> L105
            if (r2 != 0) goto L4f1
            if (r48 == 0) goto L4e6
            long r7 = r48.zzn()     // Catch: java.lang.Throwable -> L105
            long r9 = r5.zzn()     // Catch: java.lang.Throwable -> L105
            long r7 = r7 - r9
            long r7 = java.lang.Math.abs(r7)     // Catch: java.lang.Throwable -> L105
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 > 0) goto L4e6
            com.google.android.gms.internal.measurement.zzma r2 = r48.zzba()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhr r2 = (com.google.android.gms.internal.measurement.zzhr) r2     // Catch: java.lang.Throwable -> L105
            boolean r3 = r1.zzaH(r5, r2)     // Catch: java.lang.Throwable -> L105
            if (r3 == 0) goto L4e6
            r12 = r24
            r7 = r25
            r12.zzf(r7, r2)     // Catch: java.lang.Throwable -> L105
        L4e1:
            r13 = r7
            r2 = 0
            r3 = 0
            goto L543
        L4e6:
            r12 = r24
            r7 = r25
            r3 = r48
            r2 = r5
            r13 = r7
            r6 = r17
            goto L543
        L4f1:
            r12 = r24
            r7 = r25
            goto L53e
        L4f6:
            r12 = r24
            r7 = r25
            java.lang.String r2 = "_vs"
            java.lang.String r8 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            boolean r2 = r2.equals(r8)     // Catch: java.lang.Throwable -> L105
            if (r2 == 0) goto L53e
            r1.zzp()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r2 = r5.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhs r2 = (com.google.android.gms.internal.measurement.zzhs) r2     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r2 = com.google.android.gms.measurement.internal.zzpj.zzF(r2, r14)     // Catch: java.lang.Throwable -> L105
            if (r2 != 0) goto L53e
            if (r47 == 0) goto L538
            long r8 = r47.zzn()     // Catch: java.lang.Throwable -> L105
            long r13 = r5.zzn()     // Catch: java.lang.Throwable -> L105
            long r8 = r8 - r13
            long r8 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> L105
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 > 0) goto L538
            com.google.android.gms.internal.measurement.zzma r2 = r47.zzba()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhr r2 = (com.google.android.gms.internal.measurement.zzhr) r2     // Catch: java.lang.Throwable -> L105
            boolean r3 = r1.zzaH(r2, r5)     // Catch: java.lang.Throwable -> L105
            if (r3 == 0) goto L538
            r12.zzf(r6, r2)     // Catch: java.lang.Throwable -> L105
            goto L4e1
        L538:
            r2 = r47
            r3 = r5
            r13 = r17
            goto L543
        L53e:
            r2 = r47
            r3 = r48
            r13 = r7
        L543:
            int r4 = r5.zzb()     // Catch: java.lang.Throwable -> L105
            if (r4 == 0) goto L667
            r1.zzp()     // Catch: java.lang.Throwable -> L105
            java.util.List r4 = r5.zza()     // Catch: java.lang.Throwable -> L105
            android.os.Bundle r4 = com.google.android.gms.measurement.internal.zzpj.zzE(r4)     // Catch: java.lang.Throwable -> L105
            r7 = 0
        L555:
            int r8 = r5.zzb()     // Catch: java.lang.Throwable -> L105
            if (r7 >= r8) goto L611
            com.google.android.gms.internal.measurement.zzhw r8 = r5.zzc(r7)     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r8.zzb()     // Catch: java.lang.Throwable -> L105
            r10 = r29
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L105
            if (r9 == 0) goto L5e2
            java.util.List r9 = r8.zzk()     // Catch: java.lang.Throwable -> L105
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L105
            if (r9 != 0) goto L5e2
            com.google.android.gms.internal.measurement.zzid r9 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzA()     // Catch: java.lang.Throwable -> L105
            java.util.List r8 = r8.zzk()     // Catch: java.lang.Throwable -> L105
            int r14 = r8.size()     // Catch: java.lang.Throwable -> L105
            android.os.Bundle[] r14 = new android.os.Bundle[r14]     // Catch: java.lang.Throwable -> L105
            r47 = r2
            r15 = 0
        L588:
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L105
            if (r15 >= r2) goto L5da
            java.lang.Object r2 = r8.get(r15)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r2 = (com.google.android.gms.internal.measurement.zzhw) r2     // Catch: java.lang.Throwable -> L105
            r1.zzp()     // Catch: java.lang.Throwable -> L105
            java.util.List r24 = r2.zzk()     // Catch: java.lang.Throwable -> L105
            r48 = r2
            android.os.Bundle r2 = com.google.android.gms.measurement.internal.zzpj.zzE(r24)     // Catch: java.lang.Throwable -> L105
            java.util.List r24 = r48.zzk()     // Catch: java.lang.Throwable -> L105
            java.util.Iterator r24 = r24.iterator()     // Catch: java.lang.Throwable -> L105
        L5a9:
            boolean r25 = r24.hasNext()     // Catch: java.lang.Throwable -> L105
            if (r25 == 0) goto L5cd
            java.lang.Object r25 = r24.next()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r25 = (com.google.android.gms.internal.measurement.zzhw) r25     // Catch: java.lang.Throwable -> L105
            r48 = r3
            java.lang.String r3 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzma r25 = r25.zzcl()     // Catch: java.lang.Throwable -> L105
            r26 = r6
            r6 = r25
            com.google.android.gms.internal.measurement.zzhv r6 = (com.google.android.gms.internal.measurement.zzhv) r6     // Catch: java.lang.Throwable -> L105
            r1.zzT(r3, r6, r2, r9)     // Catch: java.lang.Throwable -> L105
            r3 = r48
            r6 = r26
            goto L5a9
        L5cd:
            r48 = r3
            r26 = r6
            r14[r15] = r2     // Catch: java.lang.Throwable -> L105
            int r15 = r15 + 1
            r3 = r48
            r6 = r26
            goto L588
        L5da:
            r48 = r3
            r26 = r6
            r4.putParcelableArray(r10, r14)     // Catch: java.lang.Throwable -> L105
            goto L605
        L5e2:
            r47 = r2
            r48 = r3
            r26 = r6
            java.lang.String r2 = r8.zzb()     // Catch: java.lang.Throwable -> L105
            boolean r2 = r2.equals(r10)     // Catch: java.lang.Throwable -> L105
            if (r2 != 0) goto L605
            java.lang.String r2 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzma r3 = r8.zzcl()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhv r3 = (com.google.android.gms.internal.measurement.zzhv) r3     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r6 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r6 = r6.zzA()     // Catch: java.lang.Throwable -> L105
            r1.zzT(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L105
        L605:
            int r7 = r7 + 1
            r2 = r47
            r3 = r48
            r29 = r10
            r6 = r26
            goto L555
        L611:
            r47 = r2
            r48 = r3
            r26 = r6
            r10 = r29
            r5.zzi()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzpj r2 = r1.zzp()     // Catch: java.lang.Throwable -> L105
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L105
            r3.<init>()     // Catch: java.lang.Throwable -> L105
            java.util.Set r6 = r4.keySet()     // Catch: java.lang.Throwable -> L105
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L105
        L62d:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L105
            if (r7 == 0) goto L653
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhv r8 = com.google.android.gms.internal.measurement.zzhw.zzn()     // Catch: java.lang.Throwable -> L105
            r8.zzb(r7)     // Catch: java.lang.Throwable -> L105
            java.lang.Object r7 = r4.get(r7)     // Catch: java.lang.Throwable -> L105
            if (r7 == 0) goto L62d
            r2.zzd(r8, r7)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r7 = r8.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r7 = (com.google.android.gms.internal.measurement.zzhw) r7     // Catch: java.lang.Throwable -> L105
            r3.add(r7)     // Catch: java.lang.Throwable -> L105
            goto L62d
        L653:
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L105
        L657:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L105
            if (r3 == 0) goto L66f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r3 = (com.google.android.gms.internal.measurement.zzhw) r3     // Catch: java.lang.Throwable -> L105
            r5.zzf(r3)     // Catch: java.lang.Throwable -> L105
            goto L657
        L667:
            r47 = r2
            r48 = r3
            r26 = r6
            r10 = r29
        L66f:
            java.util.List r2 = r11.zzc     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r3 = r5.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhs r3 = (com.google.android.gms.internal.measurement.zzhs) r3     // Catch: java.lang.Throwable -> L105
            r4 = r30
            r2.set(r4, r3)     // Catch: java.lang.Throwable -> L105
            r12.zzg(r5)     // Catch: java.lang.Throwable -> L105
            int r17 = r17 + 1
            r6 = r26
            goto L112
        L685:
            int r2 = r4 + 1
            r9 = r10
            r3 = r23
            r4 = r28
            r7 = r32
            r8 = r33
            r10 = r2
            r2 = r22
            goto L57
        L695:
            r28 = r4
            r12 = r24
            r4 = 0
            r8 = r4
            r7 = r17
            r6 = 0
        L69f:
            if (r6 >= r7) goto L6f0
            com.google.android.gms.internal.measurement.zzhs r10 = r12.zzd(r6)     // Catch: java.lang.Throwable -> L105
            java.lang.String r13 = r10.zzd()     // Catch: java.lang.Throwable -> L105
            boolean r13 = r2.equals(r13)     // Catch: java.lang.Throwable -> L105
            if (r13 == 0) goto L6c2
            r1.zzp()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r13 = com.google.android.gms.measurement.internal.zzpj.zzF(r10, r15)     // Catch: java.lang.Throwable -> L105
            if (r13 == 0) goto L6c2
            r12.zzj(r6)     // Catch: java.lang.Throwable -> L105
            r21 = -1
            int r7 = r7 + (-1)
            int r6 = r6 + (-1)
            goto L6ed
        L6c2:
            r21 = -1
            r1.zzp()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r10 = com.google.android.gms.measurement.internal.zzpj.zzF(r10, r14)     // Catch: java.lang.Throwable -> L105
            if (r10 == 0) goto L6ed
            boolean r13 = r10.zze()     // Catch: java.lang.Throwable -> L105
            if (r13 == 0) goto L6dc
            long r17 = r10.zzf()     // Catch: java.lang.Throwable -> L105
            java.lang.Long r10 = java.lang.Long.valueOf(r17)     // Catch: java.lang.Throwable -> L105
            goto L6dd
        L6dc:
            r10 = 0
        L6dd:
            if (r10 == 0) goto L6ed
            long r17 = r10.longValue()     // Catch: java.lang.Throwable -> L105
            int r13 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r13 <= 0) goto L6ed
            long r17 = r10.longValue()     // Catch: java.lang.Throwable -> L105
            long r8 = r8 + r17
        L6ed:
            int r6 = r6 + 1
            goto L69f
        L6f0:
            r2 = 0
            r1.zzaG(r12, r8, r2)     // Catch: java.lang.Throwable -> L105
            java.util.List r2 = r12.zzb()     // Catch: java.lang.Throwable -> L105
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L105
        L6fc:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = "_se"
            if (r6 == 0) goto L721
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhs r6 = (com.google.android.gms.internal.measurement.zzhs) r6     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = "_s"
            java.lang.String r6 = r6.zzd()     // Catch: java.lang.Throwable -> L105
            boolean r6 = r10.equals(r6)     // Catch: java.lang.Throwable -> L105
            if (r6 == 0) goto L6fc
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            java.lang.String r6 = r12.zzK()     // Catch: java.lang.Throwable -> L105
            r2.zzk(r6, r7)     // Catch: java.lang.Throwable -> L105
        L721:
            java.lang.String r2 = "_sid"
            int r2 = com.google.android.gms.measurement.internal.zzpj.zzx(r12, r2)     // Catch: java.lang.Throwable -> L105
            if (r2 < 0) goto L72f
            r2 = r20
            r1.zzaG(r12, r8, r2)     // Catch: java.lang.Throwable -> L105
            goto L74f
        L72f:
            int r2 = com.google.android.gms.measurement.internal.zzpj.zzx(r12, r7)     // Catch: java.lang.Throwable -> L105
            if (r2 < 0) goto L74f
            r12.zzr(r2)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgt r2 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzb()     // Catch: java.lang.Throwable -> L105
            java.lang.String r6 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.zzid r7 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = r7.zzA()     // Catch: java.lang.Throwable -> L105
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgt.zzl(r7)     // Catch: java.lang.Throwable -> L105
            r2.zzb(r6, r7)     // Catch: java.lang.Throwable -> L105
        L74f:
            com.google.android.gms.internal.measurement.zzid r2 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r2 = r2.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzhy r6 = r1.zzaW()     // Catch: java.lang.Throwable -> L105
            r6.zzg()     // Catch: java.lang.Throwable -> L105
            r1.zzu()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzav r6 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzh r6 = r6.zzu(r2)     // Catch: java.lang.Throwable -> L105
            if (r6 != 0) goto L77b
            com.google.android.gms.measurement.internal.zzgt r6 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzb()     // Catch: java.lang.Throwable -> L105
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgt.zzl(r2)     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = "Cannot fix consent fields without appInfo. appId"
            r6.zzb(r7, r2)     // Catch: java.lang.Throwable -> L105
            goto L77e
        L77b:
            r1.zzI(r6, r12)     // Catch: java.lang.Throwable -> L105
        L77e:
            com.google.android.gms.internal.measurement.zzid r2 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r2 = r2.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzhy r6 = r1.zzaW()     // Catch: java.lang.Throwable -> L105
            r6.zzg()     // Catch: java.lang.Throwable -> L105
            r1.zzu()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzav r6 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzh r6 = r6.zzu(r2)     // Catch: java.lang.Throwable -> L105
            if (r6 != 0) goto L7aa
            com.google.android.gms.measurement.internal.zzgt r6 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zze()     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = "Cannot populate ad_campaign_info without appInfo. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgt.zzl(r2)     // Catch: java.lang.Throwable -> L105
            r6.zzb(r7, r2)     // Catch: java.lang.Throwable -> L105
            goto L7ad
        L7aa:
            r1.zzJ(r6, r12)     // Catch: java.lang.Throwable -> L105
        L7ad:
            zzaR(r12)     // Catch: java.lang.Throwable -> L105
            r12.zzak()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzjk r2 = com.google.android.gms.measurement.internal.zzjk.zza     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r2 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r2 = r2.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzjk r2 = r1.zzB(r2)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r6 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r6 = r6.zzaf()     // Catch: java.lang.Throwable -> L105
            r7 = 100
            com.google.android.gms.measurement.internal.zzjk r6 = com.google.android.gms.measurement.internal.zzjk.zzf(r6, r7)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzjk r2 = r2.zzs(r6)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzav r6 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r7 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = r7.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzjk r6 = r6.zzaf(r7)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzav r7 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r8 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r8 = r8.zzA()     // Catch: java.lang.Throwable -> L105
            r7.zzae(r8, r2)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzjj r7 = com.google.android.gms.measurement.internal.zzjj.zzb     // Catch: java.lang.Throwable -> L105
            boolean r8 = r2.zzo(r7)     // Catch: java.lang.Throwable -> L105
            if (r8 != 0) goto L806
            boolean r8 = r6.zzo(r7)     // Catch: java.lang.Throwable -> L105
            if (r8 == 0) goto L806
            com.google.android.gms.measurement.internal.zzav r6 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r8 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r8 = r8.zzA()     // Catch: java.lang.Throwable -> L105
            r6.zzi(r8)     // Catch: java.lang.Throwable -> L105
            goto L81f
        L806:
            boolean r8 = r2.zzo(r7)     // Catch: java.lang.Throwable -> L105
            if (r8 == 0) goto L81f
            boolean r6 = r6.zzo(r7)     // Catch: java.lang.Throwable -> L105
            if (r6 != 0) goto L81f
            com.google.android.gms.measurement.internal.zzav r6 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r8 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r8 = r8.zzA()     // Catch: java.lang.Throwable -> L105
            r6.zzj(r8)     // Catch: java.lang.Throwable -> L105
        L81f:
            com.google.android.gms.measurement.internal.zzjj r6 = com.google.android.gms.measurement.internal.zzjj.zza     // Catch: java.lang.Throwable -> L105
            boolean r8 = r2.zzo(r6)     // Catch: java.lang.Throwable -> L105
            if (r8 != 0) goto L830
            r12.zzR()     // Catch: java.lang.Throwable -> L105
            r12.zzU()     // Catch: java.lang.Throwable -> L105
            r12.zzan()     // Catch: java.lang.Throwable -> L105
        L830:
            boolean r8 = r2.zzo(r7)     // Catch: java.lang.Throwable -> L105
            if (r8 != 0) goto L83c
            r12.zzX()     // Catch: java.lang.Throwable -> L105
            r12.zzav()     // Catch: java.lang.Throwable -> L105
        L83c:
            com.google.android.gms.internal.measurement.zzql.zza()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzal r8 = r1.zzd()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r9 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzfw r10 = com.google.android.gms.measurement.internal.zzfx.zzaP     // Catch: java.lang.Throwable -> L105
            boolean r8 = r8.zzp(r9, r10)     // Catch: java.lang.Throwable -> L105
            if (r8 == 0) goto La5b
            com.google.android.gms.measurement.internal.zzpo r8 = r1.zzt()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r9 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzA()     // Catch: java.lang.Throwable -> L105
            boolean r8 = r8.zzX(r9)     // Catch: java.lang.Throwable -> L105
            if (r8 == 0) goto La5b
            com.google.android.gms.internal.measurement.zzid r8 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r8 = r8.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzjk r8 = r1.zzB(r8)     // Catch: java.lang.Throwable -> L105
            boolean r6 = r8.zzo(r6)     // Catch: java.lang.Throwable -> L105
            if (r6 == 0) goto La5b
            com.google.android.gms.internal.measurement.zzid r6 = r11.zza     // Catch: java.lang.Throwable -> L105
            boolean r6 = r6.zzak()     // Catch: java.lang.Throwable -> L105
            if (r6 == 0) goto La5b
            r6 = 0
        L87a:
            int r8 = r12.zzc()     // Catch: java.lang.Throwable -> L105
            if (r6 >= r8) goto La5b
            com.google.android.gms.internal.measurement.zzhs r8 = r12.zzd(r6)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzma r8 = r8.zzcl()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhr r8 = (com.google.android.gms.internal.measurement.zzhr) r8     // Catch: java.lang.Throwable -> L105
            java.util.List r9 = r8.zza()     // Catch: java.lang.Throwable -> L105
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L105
        L892:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L105
            if (r10 == 0) goto La4a
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r10 = (com.google.android.gms.internal.measurement.zzhw) r10     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = r10.zzb()     // Catch: java.lang.Throwable -> L105
            boolean r10 = r3.equals(r10)     // Catch: java.lang.Throwable -> L105
            if (r10 == 0) goto L892
            com.google.android.gms.internal.measurement.zzid r9 = r11.zza     // Catch: java.lang.Throwable -> L105
            int r9 = r9.zzar()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzal r10 = r1.zzd()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r13 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r13 = r13.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzfw r14 = com.google.android.gms.measurement.internal.zzfx.zzal     // Catch: java.lang.Throwable -> L105
            int r10 = r10.zzm(r13, r14)     // Catch: java.lang.Throwable -> L105
            if (r9 < r10) goto L910
            com.google.android.gms.measurement.internal.zzal r9 = r1.zzd()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r10 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = r10.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzfw r13 = com.google.android.gms.measurement.internal.zzfx.zzay     // Catch: java.lang.Throwable -> L105
            int r9 = r9.zzm(r10, r13)     // Catch: java.lang.Throwable -> L105
            if (r9 <= 0) goto L9ad
            com.google.android.gms.measurement.internal.zzav r29 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            long r30 = r1.zzC()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r10 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r32 = r10.zzA()     // Catch: java.lang.Throwable -> L105
            r38 = 0
            r39 = 1
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            com.google.android.gms.measurement.internal.zzar r10 = r29.zzw(r30, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch: java.lang.Throwable -> L105
            long r13 = r10.zzg     // Catch: java.lang.Throwable -> L105
            long r9 = (long) r9     // Catch: java.lang.Throwable -> L105
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 <= 0) goto L918
            com.google.android.gms.internal.measurement.zzhv r9 = com.google.android.gms.internal.measurement.zzhw.zzn()     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = "_tnr"
            r9.zzb(r10)     // Catch: java.lang.Throwable -> L105
            r13 = 1
            r9.zzf(r13)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r9 = r9.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r9 = (com.google.android.gms.internal.measurement.zzhw) r9     // Catch: java.lang.Throwable -> L105
            r8.zzf(r9)     // Catch: java.lang.Throwable -> L105
        L910:
            r47 = r4
            r14 = r23
            r13 = r28
            goto La3e
        L918:
            com.google.android.gms.measurement.internal.zzal r9 = r1.zzd()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r10 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = r10.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzfw r13 = com.google.android.gms.measurement.internal.zzfx.zzaR     // Catch: java.lang.Throwable -> L105
            boolean r9 = r9.zzp(r10, r13)     // Catch: java.lang.Throwable -> L105
            if (r9 == 0) goto L948
            com.google.android.gms.measurement.internal.zzpo r9 = r1.zzt()     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzaw()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhv r10 = com.google.android.gms.internal.measurement.zzhw.zzn()     // Catch: java.lang.Throwable -> L105
            r13 = r28
            r10.zzb(r13)     // Catch: java.lang.Throwable -> L105
            r10.zzd(r9)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r10 = r10.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r10 = (com.google.android.gms.internal.measurement.zzhw) r10     // Catch: java.lang.Throwable -> L105
            r8.zzf(r10)     // Catch: java.lang.Throwable -> L105
            goto L94b
        L948:
            r13 = r28
            r9 = 0
        L94b:
            com.google.android.gms.internal.measurement.zzhv r10 = com.google.android.gms.internal.measurement.zzhw.zzn()     // Catch: java.lang.Throwable -> L105
            r14 = r23
            r10.zzb(r14)     // Catch: java.lang.Throwable -> L105
            r47 = r4
            r4 = 1
            r10.zzf(r4)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r4 = r10.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r4 = (com.google.android.gms.internal.measurement.zzhw) r4     // Catch: java.lang.Throwable -> L105
            r8.zzf(r4)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzpj r4 = r1.zzp()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r5 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r5 = r5.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzog r4 = r4.zzf(r5, r12, r8, r9)     // Catch: java.lang.Throwable -> L105
            if (r4 == 0) goto La3e
            com.google.android.gms.measurement.internal.zzgt r5 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r5 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r9 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzA()     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = r4.zza     // Catch: java.lang.Throwable -> L105
            r5.zzc(r0, r9, r10)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzav r5 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r9 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzA()     // Catch: java.lang.Throwable -> L105
            r5.zzaa(r9, r4)     // Catch: java.lang.Throwable -> L105
            java.util.Deque r4 = r1.zzr     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r5 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r5 = r5.zzA()     // Catch: java.lang.Throwable -> L105
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L105
            if (r5 != 0) goto La3e
            com.google.android.gms.internal.measurement.zzid r5 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r5 = r5.zzA()     // Catch: java.lang.Throwable -> L105
            r4.add(r5)     // Catch: java.lang.Throwable -> L105
            goto La3e
        L9ad:
            r47 = r4
            r14 = r23
            r13 = r28
            com.google.android.gms.measurement.internal.zzal r4 = r1.zzd()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r5 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r5 = r5.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzfw r9 = com.google.android.gms.measurement.internal.zzfx.zzaR     // Catch: java.lang.Throwable -> L105
            boolean r4 = r4.zzp(r5, r9)     // Catch: java.lang.Throwable -> L105
            if (r4 == 0) goto L9e1
            com.google.android.gms.measurement.internal.zzpo r4 = r1.zzt()     // Catch: java.lang.Throwable -> L105
            java.lang.String r4 = r4.zzaw()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhv r5 = com.google.android.gms.internal.measurement.zzhw.zzn()     // Catch: java.lang.Throwable -> L105
            r5.zzb(r13)     // Catch: java.lang.Throwable -> L105
            r5.zzd(r4)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r5 = r5.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r5 = (com.google.android.gms.internal.measurement.zzhw) r5     // Catch: java.lang.Throwable -> L105
            r8.zzf(r5)     // Catch: java.lang.Throwable -> L105
            goto L9e2
        L9e1:
            r4 = 0
        L9e2:
            com.google.android.gms.internal.measurement.zzhv r5 = com.google.android.gms.internal.measurement.zzhw.zzn()     // Catch: java.lang.Throwable -> L105
            r5.zzb(r14)     // Catch: java.lang.Throwable -> L105
            r9 = 1
            r5.zzf(r9)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r5 = r5.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhw r5 = (com.google.android.gms.internal.measurement.zzhw) r5     // Catch: java.lang.Throwable -> L105
            r8.zzf(r5)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzpj r5 = r1.zzp()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r9 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzog r4 = r5.zzf(r9, r12, r8, r4)     // Catch: java.lang.Throwable -> L105
            if (r4 == 0) goto La3e
            com.google.android.gms.measurement.internal.zzgt r5 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r5 = r5.zzk()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r9 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzA()     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = r4.zza     // Catch: java.lang.Throwable -> L105
            r5.zzc(r0, r9, r10)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzav r5 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r9 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzA()     // Catch: java.lang.Throwable -> L105
            r5.zzaa(r9, r4)     // Catch: java.lang.Throwable -> L105
            java.util.Deque r4 = r1.zzr     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r5 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r5 = r5.zzA()     // Catch: java.lang.Throwable -> L105
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L105
            if (r5 != 0) goto La3e
            com.google.android.gms.internal.measurement.zzid r5 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r5 = r5.zzA()     // Catch: java.lang.Throwable -> L105
            r4.add(r5)     // Catch: java.lang.Throwable -> L105
        La3e:
            com.google.android.gms.internal.measurement.zzme r4 = r8.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhs r4 = (com.google.android.gms.internal.measurement.zzhs) r4     // Catch: java.lang.Throwable -> L105
            r12.zze(r6, r4)     // Catch: java.lang.Throwable -> L105
        La47:
            r20 = 1
            goto La51
        La4a:
            r47 = r4
            r14 = r23
            r13 = r28
            goto La47
        La51:
            int r6 = r6 + 1
            r4 = r47
            r28 = r13
            r23 = r14
            goto L87a
        La5b:
            r47 = r4
            r12.zzag()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzad r0 = r1.zzm()     // Catch: java.lang.Throwable -> L105
            java.lang.String r3 = r12.zzK()     // Catch: java.lang.Throwable -> L105
            java.util.List r4 = r12.zzb()     // Catch: java.lang.Throwable -> L105
            java.util.List r5 = r12.zzk()     // Catch: java.lang.Throwable -> L105
            long r8 = r12.zzu()     // Catch: java.lang.Throwable -> L105
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L105
            long r8 = r12.zzw()     // Catch: java.lang.Throwable -> L105
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L105
            boolean r2 = r2.zzo(r7)     // Catch: java.lang.Throwable -> L105
            r20 = 1
            r2 = r2 ^ 1
            r7 = r8
            r8 = r2
            r2 = r0
            java.util.List r0 = r2.zzb(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L105
            r12.zzaf(r0)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzal r0 = r1.zzd()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r2 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r2 = r2.zzA()     // Catch: java.lang.Throwable -> L105
            boolean r0 = r0.zzD(r2)     // Catch: java.lang.Throwable -> L105
            if (r0 == 0) goto Ldce
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbdb
            r2.<init>()     // Catch: java.lang.Throwable -> Lbdb
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbdb
            r3.<init>()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzpo r0 = r1.zzt()     // Catch: java.lang.Throwable -> Lbdb
            java.security.SecureRandom r4 = r0.zzf()     // Catch: java.lang.Throwable -> Lbdb
            r5 = 0
        Lab5:
            int r0 = r12.zzc()     // Catch: java.lang.Throwable -> Lbdb
            if (r5 >= r0) goto Ld95
            com.google.android.gms.internal.measurement.zzhs r0 = r12.zzd(r5)     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzma r0 = r0.zzcl()     // Catch: java.lang.Throwable -> Lbdb
            r6 = r0
            com.google.android.gms.internal.measurement.zzhr r6 = (com.google.android.gms.internal.measurement.zzhr) r6     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r0 = r6.zzk()     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r7 = "_ep"
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r7 = "_sr"
            if (r0 == 0) goto Lb57
            r1.zzp()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r0 = r6.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhs r0 = (com.google.android.gms.internal.measurement.zzhs) r0     // Catch: java.lang.Throwable -> L105
            java.lang.String r8 = "_en"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzpj.zzI(r0, r8)     // Catch: java.lang.Throwable -> L105
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L105
            java.lang.Object r8 = r2.get(r0)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzbc r8 = (com.google.android.gms.measurement.internal.zzbc) r8     // Catch: java.lang.Throwable -> L105
            if (r8 != 0) goto Lb06
            com.google.android.gms.measurement.internal.zzav r8 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r9 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = r9.zzA()     // Catch: java.lang.Throwable -> L105
            java.lang.Object r10 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzbc r8 = r8.zzf(r9, r10)     // Catch: java.lang.Throwable -> L105
            if (r8 == 0) goto Lb06
            r2.put(r0, r8)     // Catch: java.lang.Throwable -> L105
        Lb06:
            if (r8 == 0) goto Lb45
            java.lang.Long r0 = r8.zzi     // Catch: java.lang.Throwable -> L105
            if (r0 != 0) goto Lb45
            java.lang.Long r0 = r8.zzj     // Catch: java.lang.Throwable -> L105
            if (r0 == 0) goto Lb20
            long r9 = r0.longValue()     // Catch: java.lang.Throwable -> L105
            r26 = 1
            int r9 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r9 <= 0) goto Lb20
            r1.zzp()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzpj.zzC(r6, r7, r0)     // Catch: java.lang.Throwable -> L105
        Lb20:
            java.lang.Boolean r0 = r8.zzk     // Catch: java.lang.Throwable -> L105
            if (r0 == 0) goto Lb39
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L105
            if (r0 == 0) goto Lb39
            r1.zzp()     // Catch: java.lang.Throwable -> L105
            r26 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r26)     // Catch: java.lang.Throwable -> L105
            r8 = r22
            com.google.android.gms.measurement.internal.zzpj.zzC(r6, r8, r0)     // Catch: java.lang.Throwable -> L105
            goto Lb3b
        Lb39:
            r8 = r22
        Lb3b:
            com.google.android.gms.internal.measurement.zzme r0 = r6.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzhs r0 = (com.google.android.gms.internal.measurement.zzhs) r0     // Catch: java.lang.Throwable -> L105
            r3.add(r0)     // Catch: java.lang.Throwable -> L105
            goto Lb47
        Lb45:
            r8 = r22
        Lb47:
            r12.zzf(r5, r6)     // Catch: java.lang.Throwable -> L105
            r21 = r4
            r1 = r5
            r5 = r8
            r18 = r11
            r10 = 0
            r20 = 1
            r26 = 1
            goto Ld88
        Lb57:
            r8 = r22
            com.google.android.gms.measurement.internal.zzhs r9 = r1.zzh()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzid r0 = r11.zza     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r10 = r0.zzA()     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r0 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r0 = r9.zza(r10, r0)     // Catch: java.lang.Throwable -> Lbdb
            boolean r13 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lbdb
            if (r13 != 0) goto Lb88
            long r9 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L105 java.lang.NumberFormatException -> Lb74
            goto Lb8a
        Lb74:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzib r9 = r9.zzu     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgt r9 = r9.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r9 = r9.zze()     // Catch: java.lang.Throwable -> L105
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzgt.zzl(r10)     // Catch: java.lang.Throwable -> L105
            java.lang.String r13 = "Unable to parse timezone offset. appId"
            r9.zzc(r13, r10, r0)     // Catch: java.lang.Throwable -> L105
        Lb88:
            r9 = r47
        Lb8a:
            com.google.android.gms.measurement.internal.zzpo r0 = r1.zzt()     // Catch: java.lang.Throwable -> Lbdb
            long r13 = r6.zzn()     // Catch: java.lang.Throwable -> Lbdb
            long r13 = r0.zzaj(r13, r9)     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzme r0 = r6.zzbc()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzhs r0 = (com.google.android.gms.internal.measurement.zzhs) r0     // Catch: java.lang.Throwable -> Lbdb
            r26 = 1
            java.lang.Long r15 = java.lang.Long.valueOf(r26)     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r1 = "_dbg"
            boolean r17 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lbdb
            if (r17 != 0) goto Lbe3
            java.util.List r0 = r0.zza()     // Catch: java.lang.Throwable -> Lbdb
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lbdb
        Lbb2:
            boolean r17 = r0.hasNext()     // Catch: java.lang.Throwable -> Lbdb
            if (r17 == 0) goto Lbe3
            java.lang.Object r17 = r0.next()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzhw r17 = (com.google.android.gms.internal.measurement.zzhw) r17     // Catch: java.lang.Throwable -> Lbdb
            r22 = r8
            java.lang.String r8 = r17.zzb()     // Catch: java.lang.Throwable -> Lbdb
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> Lbdb
            if (r8 == 0) goto Lbe0
            long r0 = r17.zzf()     // Catch: java.lang.Throwable -> Lbdb
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lbdb
            boolean r0 = r15.equals(r0)     // Catch: java.lang.Throwable -> Lbdb
            if (r0 != 0) goto Lbd9
            goto Lbe5
        Lbd9:
            r0 = 1
            goto Lbf7
        Lbdb:
            r0 = move-exception
            r1 = r45
            goto Leee
        Lbe0:
            r8 = r22
            goto Lbb2
        Lbe3:
            r22 = r8
        Lbe5:
            com.google.android.gms.measurement.internal.zzhs r0 = r45.zzh()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzid r1 = r11.zza     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r1 = r1.zzA()     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r8 = r6.zzk()     // Catch: java.lang.Throwable -> Lbdb
            int r0 = r0.zzm(r1, r8)     // Catch: java.lang.Throwable -> Lbdb
        Lbf7:
            if (r0 > 0) goto Lc26
            com.google.android.gms.measurement.internal.zzgt r1 = r45.zzaV()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zze()     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r7 = "Sample rate must be positive. event, rate"
            java.lang.String r8 = r6.zzk()     // Catch: java.lang.Throwable -> Lbdb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lbdb
            r1.zzc(r7, r8, r0)     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzme r0 = r6.zzbc()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzhs r0 = (com.google.android.gms.internal.measurement.zzhs) r0     // Catch: java.lang.Throwable -> Lbdb
            r3.add(r0)     // Catch: java.lang.Throwable -> Lbdb
            r12.zzf(r5, r6)     // Catch: java.lang.Throwable -> Lbdb
        Lc1a:
            r21 = r4
            r1 = r5
            r18 = r11
            r5 = r22
            r10 = 0
        Lc22:
            r20 = 1
            goto Ld88
        Lc26:
            java.lang.String r1 = r6.zzk()     // Catch: java.lang.Throwable -> Lbdb
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzbc r1 = (com.google.android.gms.measurement.internal.zzbc) r1     // Catch: java.lang.Throwable -> Lbdb
            if (r1 != 0) goto Lc8a
            com.google.android.gms.measurement.internal.zzav r1 = r45.zzj()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzid r8 = r11.zza     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r8 = r8.zzA()     // Catch: java.lang.Throwable -> Lbdb
            r17 = r15
            java.lang.String r15 = r6.zzk()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzbc r1 = r1.zzf(r8, r15)     // Catch: java.lang.Throwable -> Lbdb
            if (r1 != 0) goto Lc87
            com.google.android.gms.measurement.internal.zzgt r1 = r45.zzaV()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zze()     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r8 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzid r15 = r11.zza     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r15 = r15.zzA()     // Catch: java.lang.Throwable -> Lbdb
            r23 = r9
            java.lang.String r9 = r6.zzk()     // Catch: java.lang.Throwable -> Lbdb
            r1.zzc(r8, r15, r9)     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzbc r28 = new com.google.android.gms.measurement.internal.zzbc     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzid r1 = r11.zza     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r29 = r1.zzA()     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r30 = r6.zzk()     // Catch: java.lang.Throwable -> Lbdb
            long r37 = r6.zzn()     // Catch: java.lang.Throwable -> Lbdb
            r43 = 0
            r44 = 0
            r31 = 1
            r33 = 1
            r35 = 1
            r39 = 0
            r41 = 0
            r42 = 0
            r28.<init>(r29, r30, r31, r33, r35, r37, r39, r41, r42, r43, r44)     // Catch: java.lang.Throwable -> Lbdb
            r1 = r28
            goto Lc8e
        Lc87:
            r23 = r9
            goto Lc8e
        Lc8a:
            r23 = r9
            r17 = r15
        Lc8e:
            r45.zzp()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzme r8 = r6.zzbc()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzhs r8 = (com.google.android.gms.internal.measurement.zzhs) r8     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r9 = "_eid"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzpj.zzI(r8, r9)     // Catch: java.lang.Throwable -> Lbdb
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> Lbdb
            if (r8 == 0) goto Lca4
            r9 = 1
        Lca2:
            r10 = 1
            goto Lca6
        Lca4:
            r9 = 0
            goto Lca2
        Lca6:
            if (r0 != r10) goto Lcd0
            com.google.android.gms.internal.measurement.zzme r0 = r6.zzbc()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzhs r0 = (com.google.android.gms.internal.measurement.zzhs) r0     // Catch: java.lang.Throwable -> Lbdb
            r3.add(r0)     // Catch: java.lang.Throwable -> Lbdb
            if (r9 == 0) goto Lccb
            java.lang.Long r0 = r1.zzi     // Catch: java.lang.Throwable -> Lbdb
            if (r0 != 0) goto Lcbf
            java.lang.Long r0 = r1.zzj     // Catch: java.lang.Throwable -> Lbdb
            if (r0 != 0) goto Lcbf
            java.lang.Boolean r0 = r1.zzk     // Catch: java.lang.Throwable -> Lbdb
            if (r0 == 0) goto Lccb
        Lcbf:
            r10 = 0
            com.google.android.gms.measurement.internal.zzbc r0 = r1.zzc(r10, r10, r10)     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r1 = r6.zzk()     // Catch: java.lang.Throwable -> Lbdb
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> Lbdb
        Lccb:
            r12.zzf(r5, r6)     // Catch: java.lang.Throwable -> Lbdb
            goto Lc1a
        Lcd0:
            int r10 = r4.nextInt(r0)     // Catch: java.lang.Throwable -> Lbdb
            if (r10 != 0) goto Ld0b
            r45.zzp()     // Catch: java.lang.Throwable -> Lbdb
            r10 = r9
            long r8 = (long) r0     // Catch: java.lang.Throwable -> Lbdb
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzpj.zzC(r6, r7, r0)     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzme r7 = r6.zzbc()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzhs r7 = (com.google.android.gms.internal.measurement.zzhs) r7     // Catch: java.lang.Throwable -> Lbdb
            r3.add(r7)     // Catch: java.lang.Throwable -> Lbdb
            if (r10 == 0) goto Lcf2
            r10 = 0
            com.google.android.gms.measurement.internal.zzbc r1 = r1.zzc(r10, r0, r10)     // Catch: java.lang.Throwable -> Lbdb
        Lcf2:
            java.lang.String r0 = r6.zzk()     // Catch: java.lang.Throwable -> Lbdb
            long r7 = r6.zzn()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzbc r1 = r1.zzb(r7, r13)     // Catch: java.lang.Throwable -> Lbdb
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> Lbdb
            r21 = r4
            r1 = r5
            r18 = r11
            r5 = r22
        Ld08:
            r10 = 0
            goto Ld83
        Ld0b:
            r10 = r9
            java.lang.Long r9 = r1.zzh     // Catch: java.lang.Throwable -> Lbdb
            if (r9 == 0) goto Ld1c
            long r23 = r9.longValue()     // Catch: java.lang.Throwable -> Lbdb
            r21 = r4
            r25 = r5
            r15 = r10
            r18 = r11
            goto Ld31
        Ld1c:
            com.google.android.gms.measurement.internal.zzpo r9 = r45.zzt()     // Catch: java.lang.Throwable -> Lbdb
            r15 = r10
            r18 = r11
            long r10 = r6.zzp()     // Catch: java.lang.Throwable -> Lbdb
            r21 = r4
            r25 = r5
            r4 = r23
            long r23 = r9.zzaj(r10, r4)     // Catch: java.lang.Throwable -> Lbdb
        Ld31:
            int r4 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r4 == 0) goto Ld6e
            r45.zzp()     // Catch: java.lang.Throwable -> Lbdb
            r4 = r17
            r5 = r22
            com.google.android.gms.measurement.internal.zzpj.zzC(r6, r5, r4)     // Catch: java.lang.Throwable -> Lbdb
            r45.zzp()     // Catch: java.lang.Throwable -> Lbdb
            long r8 = (long) r0     // Catch: java.lang.Throwable -> Lbdb
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzpj.zzC(r6, r7, r0)     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzme r4 = r6.zzbc()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.internal.measurement.zzhs r4 = (com.google.android.gms.internal.measurement.zzhs) r4     // Catch: java.lang.Throwable -> Lbdb
            r3.add(r4)     // Catch: java.lang.Throwable -> Lbdb
            if (r15 == 0) goto Ld5c
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lbdb
            r10 = 0
            com.google.android.gms.measurement.internal.zzbc r1 = r1.zzc(r10, r0, r4)     // Catch: java.lang.Throwable -> Lbdb
        Ld5c:
            java.lang.String r0 = r6.zzk()     // Catch: java.lang.Throwable -> Lbdb
            long r7 = r6.zzn()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzbc r1 = r1.zzb(r7, r13)     // Catch: java.lang.Throwable -> Lbdb
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> Lbdb
            r1 = r25
            goto Ld08
        Ld6e:
            r5 = r22
            if (r15 == 0) goto Ld81
            java.lang.String r0 = r6.zzk()     // Catch: java.lang.Throwable -> Lbdb
            r10 = 0
            com.google.android.gms.measurement.internal.zzbc r1 = r1.zzc(r8, r10, r10)     // Catch: java.lang.Throwable -> Lbdb
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> Lbdb
        Ld7e:
            r1 = r25
            goto Ld83
        Ld81:
            r10 = 0
            goto Ld7e
        Ld83:
            r12.zzf(r1, r6)     // Catch: java.lang.Throwable -> Lbdb
            goto Lc22
        Ld88:
            int r0 = r1 + 1
            r1 = r45
            r22 = r5
            r11 = r18
            r4 = r21
            r5 = r0
            goto Lab5
        Ld95:
            r18 = r11
            r20 = 1
            int r0 = r3.size()     // Catch: java.lang.Throwable -> Lbdb
            int r1 = r12.zzc()     // Catch: java.lang.Throwable -> Lbdb
            if (r0 >= r1) goto Lda9
            r12.zzi()     // Catch: java.lang.Throwable -> Lbdb
            r12.zzh(r3)     // Catch: java.lang.Throwable -> Lbdb
        Lda9:
            java.util.Set r0 = r2.entrySet()     // Catch: java.lang.Throwable -> Lbdb
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lbdb
        Ldb1:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lbdb
            if (r1 == 0) goto Ldcb
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lbdb
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzav r2 = r45.zzj()     // Catch: java.lang.Throwable -> Lbdb
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzbc r1 = (com.google.android.gms.measurement.internal.zzbc) r1     // Catch: java.lang.Throwable -> Lbdb
            r2.zzh(r1)     // Catch: java.lang.Throwable -> Lbdb
            goto Ldb1
        Ldcb:
            r11 = r18
            goto Ldd0
        Ldce:
            r20 = 1
        Ldd0:
            com.google.android.gms.internal.measurement.zzid r0 = r11.zza     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r0 = r0.zzA()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzav r1 = r45.zzj()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzh r1 = r1.zzu(r0)     // Catch: java.lang.Throwable -> Lbdb
            if (r1 != 0) goto Ldf8
            com.google.android.gms.measurement.internal.zzgt r1 = r45.zzaV()     // Catch: java.lang.Throwable -> Lbdb
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzb()     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r2 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzid r3 = r11.zza     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r3 = r3.zzA()     // Catch: java.lang.Throwable -> Lbdb
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgt.zzl(r3)     // Catch: java.lang.Throwable -> Lbdb
            r1.zzb(r2, r3)     // Catch: java.lang.Throwable -> Lbdb
            goto Le5d
        Ldf8:
            int r2 = r12.zzc()     // Catch: java.lang.Throwable -> Lbdb
            if (r2 <= 0) goto Le5d
            long r2 = r1.zzp()     // Catch: java.lang.Throwable -> Lbdb
            int r4 = (r2 > r47 ? 1 : (r2 == r47 ? 0 : -1))
            if (r4 == 0) goto Le0a
            r12.zzA(r2)     // Catch: java.lang.Throwable -> Lbdb
            goto Le0d
        Le0a:
            r12.zzB()     // Catch: java.lang.Throwable -> Lbdb
        Le0d:
            long r4 = r1.zzn()     // Catch: java.lang.Throwable -> Lbdb
            int r6 = (r4 > r47 ? 1 : (r4 == r47 ? 0 : -1))
            if (r6 != 0) goto Le16
            goto Le17
        Le16:
            r2 = r4
        Le17:
            int r4 = (r2 > r47 ? 1 : (r2 == r47 ? 0 : -1))
            if (r4 == 0) goto Le1f
            r12.zzy(r2)     // Catch: java.lang.Throwable -> Lbdb
            goto Le22
        Le1f:
            r12.zzz()     // Catch: java.lang.Throwable -> Lbdb
        Le22:
            int r2 = r12.zzc()     // Catch: java.lang.Throwable -> Lbdb
            long r2 = (long) r2     // Catch: java.lang.Throwable -> Lbdb
            r1.zzM(r2)     // Catch: java.lang.Throwable -> Lbdb
            long r2 = r1.zzaF()     // Catch: java.lang.Throwable -> Lbdb
            int r2 = (int) r2     // Catch: java.lang.Throwable -> Lbdb
            r12.zzaJ(r2)     // Catch: java.lang.Throwable -> Lbdb
            long r2 = r1.zzG()     // Catch: java.lang.Throwable -> Lbdb
            int r2 = (int) r2     // Catch: java.lang.Throwable -> Lbdb
            r12.zzZ(r2)     // Catch: java.lang.Throwable -> Lbdb
            long r2 = r12.zzu()     // Catch: java.lang.Throwable -> Lbdb
            r1.zzo(r2)     // Catch: java.lang.Throwable -> Lbdb
            long r2 = r12.zzw()     // Catch: java.lang.Throwable -> Lbdb
            r1.zzq(r2)     // Catch: java.lang.Throwable -> Lbdb
            java.lang.String r2 = r1.zzaa()     // Catch: java.lang.Throwable -> Lbdb
            if (r2 == 0) goto Le52
            r12.zzaa(r2)     // Catch: java.lang.Throwable -> Lbdb
            goto Le55
        Le52:
            r12.zzab()     // Catch: java.lang.Throwable -> Lbdb
        Le55:
            com.google.android.gms.measurement.internal.zzav r2 = r45.zzj()     // Catch: java.lang.Throwable -> Lbdb
            r3 = 0
            r2.zzv(r1, r3, r3)     // Catch: java.lang.Throwable -> Lbdb
        Le5d:
            int r1 = r12.zzc()     // Catch: java.lang.Throwable -> Lbdb
            if (r1 <= 0) goto Lec2
            r1 = r45
            com.google.android.gms.measurement.internal.zzib r2 = r1.zzn     // Catch: java.lang.Throwable -> L105
            r2.zzaU()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzhs r2 = r1.zzh()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r3 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r3 = r3.zzA()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzgl r2 = r2.zzb(r3)     // Catch: java.lang.Throwable -> L105
            if (r2 == 0) goto Le89
            boolean r3 = r2.zza()     // Catch: java.lang.Throwable -> L105
            if (r3 != 0) goto Le81
            goto Le89
        Le81:
            long r2 = r2.zzb()     // Catch: java.lang.Throwable -> L105
            r12.zzal(r2)     // Catch: java.lang.Throwable -> L105
            goto Leb2
        Le89:
            com.google.android.gms.internal.measurement.zzid r2 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r2 = r2.zzP()     // Catch: java.lang.Throwable -> L105
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L105
            if (r2 == 0) goto Le9b
            r2 = -1
            r12.zzal(r2)     // Catch: java.lang.Throwable -> L105
            goto Leb2
        Le9b:
            com.google.android.gms.measurement.internal.zzgt r2 = r1.zzaV()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zze()     // Catch: java.lang.Throwable -> L105
            java.lang.String r3 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzid r4 = r11.zza     // Catch: java.lang.Throwable -> L105
            java.lang.String r4 = r4.zzA()     // Catch: java.lang.Throwable -> L105
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgt.zzl(r4)     // Catch: java.lang.Throwable -> L105
            r2.zzb(r3, r4)     // Catch: java.lang.Throwable -> L105
        Leb2:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzme r3 = r12.zzbc()     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.internal.measurement.zzid r3 = (com.google.android.gms.internal.measurement.zzid) r3     // Catch: java.lang.Throwable -> L105
            r13 = r19
            r2.zzz(r3, r13)     // Catch: java.lang.Throwable -> L105
            goto Lec4
        Lec2:
            r1 = r45
        Lec4:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            java.util.List r3 = r11.zzb     // Catch: java.lang.Throwable -> L105
            r2.zzS(r3)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            r2.zzT(r0)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            r0.zzc()     // Catch: java.lang.Throwable -> L105
            r6 = r20
            goto Lee6
        Lede:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L105
            r0.zzc()     // Catch: java.lang.Throwable -> L105
            r6 = r3
        Lee6:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            r0.zzd()
            return r6
        Leee:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()
            r2.zzd()
            throw r0
    }

    @androidx.annotation.VisibleForTesting
    private final void zzaG(com.google.android.gms.internal.measurement.zzic r11, long r12, boolean r14) {
            r10 = this;
            r0 = 1
            if (r0 == r14) goto L7
            java.lang.String r1 = "_lte"
        L5:
            r5 = r1
            goto La
        L7:
            java.lang.String r1 = "_se"
            goto L5
        La:
            com.google.android.gms.measurement.internal.zzav r1 = r10.zzj()
            java.lang.String r2 = r11.zzK()
            com.google.android.gms.measurement.internal.zzpm r1 = r1.zzm(r2, r5)
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r1.zze
            if (r1 != 0) goto L1d
            goto L3c
        L1d:
            com.google.android.gms.measurement.internal.zzpm r2 = new com.google.android.gms.measurement.internal.zzpm
            java.lang.String r3 = r11.zzK()
            com.google.android.gms.common.util.Clock r4 = r10.zzaZ()
            long r6 = r4.currentTimeMillis()
            java.lang.Long r1 = (java.lang.Long) r1
            long r8 = r1.longValue()
            long r8 = r8 + r12
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r4 = "auto"
            r2.<init>(r3, r4, r5, r6, r8)
            goto L53
        L3c:
            com.google.android.gms.measurement.internal.zzpm r2 = new com.google.android.gms.measurement.internal.zzpm
            java.lang.String r3 = r11.zzK()
            com.google.android.gms.common.util.Clock r1 = r10.zzaZ()
            long r6 = r1.currentTimeMillis()
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            java.lang.String r4 = "auto"
            r2.<init>(r3, r4, r5, r6, r8)
        L53:
            com.google.android.gms.internal.measurement.zzit r1 = com.google.android.gms.internal.measurement.zziu.zzm()
            r1.zzb(r5)
            com.google.android.gms.common.util.Clock r3 = r10.zzaZ()
            long r3 = r3.currentTimeMillis()
            r1.zza(r3)
            java.lang.Object r3 = r2.zze
            r4 = r3
            java.lang.Long r4 = (java.lang.Long) r4
            long r6 = r4.longValue()
            r1.zze(r6)
            com.google.android.gms.internal.measurement.zzme r1 = r1.zzbc()
            com.google.android.gms.internal.measurement.zziu r1 = (com.google.android.gms.internal.measurement.zziu) r1
            int r4 = com.google.android.gms.measurement.internal.zzpj.zzx(r11, r5)
            if (r4 < 0) goto L81
            r11.zzn(r4, r1)
            goto L84
        L81:
            r11.zzo(r1)
        L84:
            r4 = 0
            int r11 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r11 <= 0) goto La6
            com.google.android.gms.measurement.internal.zzav r11 = r10.zzj()
            r11.zzl(r2)
            if (r0 == r14) goto L96
            java.lang.String r11 = "lifetime"
            goto L99
        L96:
            java.lang.String r11 = "session-scoped"
        L99:
            com.google.android.gms.measurement.internal.zzgt r12 = r10.zzaV()
            com.google.android.gms.measurement.internal.zzgr r12 = r12.zzk()
            java.lang.String r13 = "Updated engagement user property. scope, value"
            r12.zzc(r13, r11, r3)
        La6:
            return
    }

    private final boolean zzaH(com.google.android.gms.internal.measurement.zzhr r9, com.google.android.gms.internal.measurement.zzhr r10) {
            r8 = this;
            java.lang.String r0 = r9.zzk()
            java.lang.String r1 = "_e"
            boolean r0 = r1.equals(r0)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            r8.zzp()
            com.google.android.gms.internal.measurement.zzme r0 = r9.zzbc()
            com.google.android.gms.internal.measurement.zzhs r0 = (com.google.android.gms.internal.measurement.zzhs) r0
            java.lang.String r2 = "_sc"
            com.google.android.gms.internal.measurement.zzhw r0 = com.google.android.gms.measurement.internal.zzpj.zzF(r0, r2)
            r2 = 0
            if (r0 != 0) goto L21
            r0 = r2
            goto L25
        L21:
            java.lang.String r0 = r0.zzd()
        L25:
            r8.zzp()
            com.google.android.gms.internal.measurement.zzme r3 = r10.zzbc()
            com.google.android.gms.internal.measurement.zzhs r3 = (com.google.android.gms.internal.measurement.zzhs) r3
            java.lang.String r4 = "_pc"
            com.google.android.gms.internal.measurement.zzhw r3 = com.google.android.gms.measurement.internal.zzpj.zzF(r3, r4)
            if (r3 != 0) goto L37
            goto L3b
        L37:
            java.lang.String r2 = r3.zzd()
        L3b:
            if (r2 == 0) goto Laa
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Laa
            java.lang.String r0 = r9.zzk()
            boolean r0 = r1.equals(r0)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            r8.zzp()
            com.google.android.gms.internal.measurement.zzme r0 = r9.zzbc()
            com.google.android.gms.internal.measurement.zzhs r0 = (com.google.android.gms.internal.measurement.zzhs) r0
            java.lang.String r1 = "_et"
            com.google.android.gms.internal.measurement.zzhw r0 = com.google.android.gms.measurement.internal.zzpj.zzF(r0, r1)
            if (r0 == 0) goto La8
            boolean r2 = r0.zze()
            if (r2 == 0) goto La8
            long r2 = r0.zzf()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L70
            goto La8
        L70:
            long r2 = r0.zzf()
            r8.zzp()
            com.google.android.gms.internal.measurement.zzme r0 = r10.zzbc()
            com.google.android.gms.internal.measurement.zzhs r0 = (com.google.android.gms.internal.measurement.zzhs) r0
            com.google.android.gms.internal.measurement.zzhw r0 = com.google.android.gms.measurement.internal.zzpj.zzF(r0, r1)
            if (r0 == 0) goto L90
            long r6 = r0.zzf()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L90
            long r4 = r0.zzf()
            long r2 = r2 + r4
        L90:
            r8.zzp()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            com.google.android.gms.measurement.internal.zzpj.zzC(r10, r1, r0)
            r8.zzp()
            r0 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "_fr"
            com.google.android.gms.measurement.internal.zzpj.zzC(r9, r0, r10)
        La8:
            r9 = 1
            return r9
        Laa:
            r9 = 0
            return r9
    }

    private final boolean zzaI() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r1.zzaW()
            r0.zzg()
            r1.zzu()
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            boolean r0 = r0.zzP()
            if (r0 != 0) goto L25
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            java.lang.String r0 = r0.zzF()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L23
            goto L25
        L23:
            r0 = 0
            return r0
        L25:
            r0 = 1
            return r0
    }

    private static java.lang.String zzaJ(java.util.Map r2, java.lang.String r3) {
            if (r2 != 0) goto L3
            goto L3d
        L3:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto Lb
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3d
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L3d:
            r2 = 0
            return r2
    }

    @androidx.annotation.WorkerThread
    private final void zzaK() {
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.zzhy r1 = r0.zzaW()
            r1.zzg()
            r0.zzu()
            long r1 = r0.zza
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4d
            com.google.android.gms.common.util.Clock r1 = r0.zzaZ()
            long r1 = r1.elapsedRealtime()
            long r5 = r0.zza
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4b
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.zzb(r3, r2)
            com.google.android.gms.measurement.internal.zzha r1 = r0.zzk()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzoj r1 = r0.zzl()
            r1.zzd()
            return
        L4b:
            r0.zza = r3
        L4d:
            com.google.android.gms.measurement.internal.zzib r1 = r0.zzn
            boolean r1 = r1.zzH()
            if (r1 == 0) goto L254
            boolean r1 = r0.zzaI()
            if (r1 != 0) goto L5d
            goto L254
        L5d:
            com.google.android.gms.common.util.Clock r1 = r0.zzaZ()
            long r1 = r1.currentTimeMillis()
            r0.zzd()
            com.google.android.gms.measurement.internal.zzfw r5 = com.google.android.gms.measurement.internal.zzfx.zzO
            r6 = 0
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.zzav r5 = r0.zzj()
            boolean r5 = r5.zzR()
            r10 = 1
            if (r5 != 0) goto L90
            com.google.android.gms.measurement.internal.zzav r5 = r0.zzj()
            boolean r5 = r5.zzG()
            if (r5 == 0) goto L8f
            goto L90
        L8f:
            r10 = 0
        L90:
            if (r10 == 0) goto Ld0
            com.google.android.gms.measurement.internal.zzal r5 = r0.zzd()
            java.lang.String r5 = r5.zzA()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto Lbc
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto Lbc
            r0.zzd()
            com.google.android.gms.measurement.internal.zzfw r5 = com.google.android.gms.measurement.internal.zzfx.zzJ
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto Le3
        Lbc:
            r0.zzd()
            com.google.android.gms.measurement.internal.zzfw r5 = com.google.android.gms.measurement.internal.zzfx.zzI
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto Le3
        Ld0:
            r0.zzd()
            com.google.android.gms.measurement.internal.zzfw r5 = com.google.android.gms.measurement.internal.zzfx.zzH
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        Le3:
            com.google.android.gms.measurement.internal.zznm r5 = r0.zzk
            com.google.android.gms.measurement.internal.zzhd r5 = r5.zzd
            long r13 = r5.zza()
            com.google.android.gms.measurement.internal.zznm r5 = r0.zzk
            com.google.android.gms.measurement.internal.zzhd r5 = r5.zze
            long r15 = r5.zza()
            com.google.android.gms.measurement.internal.zzav r5 = r0.zzj()
            r17 = r3
            long r3 = r5.zzM()
            com.google.android.gms.measurement.internal.zzav r5 = r0.zzj()
            r19 = r10
            long r9 = r5.zzO()
            long r3 = java.lang.Math.max(r3, r9)
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 != 0) goto L113
            r7 = r17
            goto L191
        L113:
            long r3 = r3 - r1
            long r3 = java.lang.Math.abs(r3)
            long r3 = r1 - r3
            long r13 = r13 - r1
            long r9 = java.lang.Math.abs(r13)
            long r9 = r1 - r9
            long r15 = r15 - r1
            long r13 = java.lang.Math.abs(r15)
            long r1 = r1 - r13
            long r7 = r7 + r3
            long r9 = java.lang.Math.max(r9, r1)
            if (r19 == 0) goto L137
            int r5 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r5 <= 0) goto L137
            long r7 = java.lang.Math.min(r3, r9)
            long r7 = r7 + r11
        L137:
            com.google.android.gms.measurement.internal.zzpj r5 = r0.zzp()
            boolean r5 = r5.zzs(r9, r11)
            if (r5 != 0) goto L143
            long r9 = r9 + r11
            r7 = r9
        L143:
            int r5 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r5 == 0) goto L186
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L186
            r3 = 0
        L14c:
            r0.zzd()
            com.google.android.gms.measurement.internal.zzfw r4 = com.google.android.gms.measurement.internal.zzfx.zzQ
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            r9 = 20
            int r4 = java.lang.Math.min(r9, r4)
            if (r3 >= r4) goto L18e
            r9 = 1
            long r9 = r9 << r3
            r0.zzd()
            com.google.android.gms.measurement.internal.zzfw r4 = com.google.android.gms.measurement.internal.zzfx.zzP
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r11 = r4.longValue()
            r13 = r17
            long r11 = java.lang.Math.max(r13, r11)
            long r11 = r11 * r9
            long r7 = r7 + r11
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 <= 0) goto L189
        L186:
            r17 = 0
            goto L191
        L189:
            int r3 = r3 + 1
            r17 = 0
            goto L14c
        L18e:
            r7 = 0
            goto L186
        L191:
            int r1 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r1 != 0) goto L1b1
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()
            java.lang.String r2 = "Next upload time is 0"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzha r1 = r0.zzk()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzoj r1 = r0.zzl()
            r1.zzd()
            return
        L1b1:
            com.google.android.gms.measurement.internal.zzgy r1 = r0.zzi()
            boolean r1 = r1.zzb()
            if (r1 == 0) goto L238
            com.google.android.gms.measurement.internal.zznm r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzhd r1 = r1.zzc
            long r1 = r1.zza()
            r0.zzd()
            com.google.android.gms.measurement.internal.zzfw r3 = com.google.android.gms.measurement.internal.zzfx.zzF
            java.lang.Object r3 = r3.zzb(r6)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r13 = 0
            long r3 = java.lang.Math.max(r13, r3)
            com.google.android.gms.measurement.internal.zzpj r5 = r0.zzp()
            boolean r5 = r5.zzs(r1, r3)
            if (r5 != 0) goto L1e7
            long r1 = r1 + r3
            long r7 = java.lang.Math.max(r7, r1)
        L1e7:
            com.google.android.gms.measurement.internal.zzha r1 = r0.zzk()
            r1.zzb()
            com.google.android.gms.common.util.Clock r1 = r0.zzaZ()
            long r1 = r1.currentTimeMillis()
            long r7 = r7 - r1
            r13 = 0
            int r1 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r1 > 0) goto L21f
            r0.zzd()
            com.google.android.gms.measurement.internal.zzfw r1 = com.google.android.gms.measurement.internal.zzfx.zzK
            java.lang.Object r1 = r1.zzb(r6)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r13, r1)
            com.google.android.gms.measurement.internal.zznm r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzhd r1 = r1.zzd
            com.google.android.gms.common.util.Clock r2 = r0.zzaZ()
            long r2 = r2.currentTimeMillis()
            r1.zzb(r2)
        L21f:
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.zzb(r3, r2)
            com.google.android.gms.measurement.internal.zzoj r1 = r0.zzl()
            r1.zzc(r7)
            return
        L238:
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()
            java.lang.String r2 = "No network"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzha r1 = r0.zzk()
            r1.zza()
            com.google.android.gms.measurement.internal.zzoj r1 = r0.zzl()
            r1.zzd()
            return
        L254:
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzha r1 = r0.zzk()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzoj r1 = r0.zzl()
            r1.zzd()
            return
    }

    @androidx.annotation.WorkerThread
    private final void zzaL() {
            r5 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r5.zzaW()
            r0.zzg()
            boolean r0 = r5.zzu
            if (r0 != 0) goto L46
            boolean r0 = r5.zzv
            if (r0 != 0) goto L46
            boolean r0 = r5.zzw
            if (r0 == 0) goto L14
            goto L46
        L14:
            com.google.android.gms.measurement.internal.zzgt r0 = r5.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            java.lang.String r1 = "Stopping uploading service(s)"
            r0.zza(r1)
            java.util.List r0 = r5.zzq
            if (r0 != 0) goto L26
            return
        L26:
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L2a
        L3a:
            java.util.List r0 = r5.zzq
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.util.List r0 = (java.util.List) r0
            r0.clear()
            return
        L46:
            com.google.android.gms.measurement.internal.zzgt r0 = r5.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            boolean r1 = r5.zzu
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r2 = r5.zzv
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r5.zzw
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Not stopping services. fetch, network, upload"
            r0.zzd(r4, r1, r2, r3)
            return
    }

    @androidx.annotation.WorkerThread
    private final java.lang.Boolean zzaM(com.google.android.gms.measurement.internal.zzh r6) {
            r5 = this;
            long r0 = r6.zzt()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L2c
            com.google.android.gms.measurement.internal.zzib r0 = r5.zzn     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            android.content.Context r0 = r0.zzaY()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            java.lang.String r2 = r6.zzc()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            int r0 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            long r1 = r6.zzt()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            long r3 = (long) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L4f
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            return r6
        L2c:
            com.google.android.gms.measurement.internal.zzib r0 = r5.zzn     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            android.content.Context r0 = r0.zzaY()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            java.lang.String r2 = r6.zzc()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            java.lang.String r0 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            java.lang.String r6 = r6.zzr()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            if (r6 == 0) goto L4f
            boolean r6 = r6.equals(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            if (r6 == 0) goto L4f
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            return r6
        L4f:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L52:
            r6 = 0
            return r6
    }

    @androidx.annotation.WorkerThread
    private final com.google.android.gms.measurement.internal.zzr zzaN(java.lang.String r41) {
            r40 = this;
            r1 = r41
            com.google.android.gms.measurement.internal.zzav r0 = r40.zzj()
            com.google.android.gms.measurement.internal.zzh r0 = r0.zzu(r1)
            r2 = 0
            if (r0 == 0) goto Lb7
            java.lang.String r3 = r0.zzr()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L19
            goto Lb7
        L19:
            r3 = r40
            java.lang.Boolean r4 = r3.zzaM(r0)
            if (r4 == 0) goto L39
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L39
            com.google.android.gms.measurement.internal.zzgt r0 = r3.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzgt.zzl(r1)
            java.lang.String r4 = "App version does not match; dropping. appId"
            r0.zzb(r4, r1)
            return r2
        L39:
            r2 = r0
            com.google.android.gms.measurement.internal.zzr r0 = new com.google.android.gms.measurement.internal.zzr
            r4 = r2
            java.lang.String r2 = r4.zzf()
            java.lang.String r3 = r4.zzr()
            r6 = r4
            long r4 = r6.zzt()
            r7 = r6
            java.lang.String r6 = r7.zzv()
            r9 = r7
            long r7 = r9.zzx()
            r11 = r9
            long r9 = r11.zzz()
            boolean r12 = r11.zzD()
            java.lang.String r14 = r11.zzl()
            boolean r18 = r11.zzac()
            java.lang.Boolean r20 = r11.zzae()
            long r21 = r11.zzB()
            java.util.List r23 = r11.zzag()
            com.google.android.gms.measurement.internal.zzjk r13 = r40.zzB(r41)
            java.lang.String r24 = r13.zzl()
            boolean r27 = r11.zzai()
            long r28 = r11.zzak()
            com.google.android.gms.measurement.internal.zzjk r13 = r40.zzB(r41)
            int r30 = r13.zzb()
            com.google.android.gms.measurement.internal.zzaz r13 = r40.zzx(r41)
            java.lang.String r31 = r13.zze()
            int r32 = r11.zzao()
            long r33 = r11.zzaw()
            java.lang.String r35 = r11.zzay()
            java.lang.String r36 = r11.zzaH()
            int r39 = r11.zzaL()
            r26 = 0
            r37 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            java.lang.String r25 = ""
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r35, r36, r37, r39)
            return r0
        Lb7:
            com.google.android.gms.measurement.internal.zzgt r0 = r40.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzj()
            java.lang.String r3 = "No app data available; dropping"
            r0.zzb(r3, r1)
            return r2
    }

    @androidx.annotation.WorkerThread
    private final boolean zzaO(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzav r0 = r2.zzj()
            com.google.android.gms.measurement.internal.zzbc r3 = r0.zzf(r3, r4)
            if (r3 == 0) goto L15
            long r3 = r3.zzc
            r0 = 1
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L13
            goto L15
        L13:
            r3 = 0
            return r3
        L15:
            r3 = 1
            return r3
    }

    private static void zzaP(android.content.Context r2, android.content.Intent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto La
            r2.sendBroadcast(r3)
            return
        La:
            android.app.BroadcastOptions r0 = com.google.android.gms.measurement.internal.C7075a.m12907a()
            r1 = 1
            android.app.BroadcastOptions r0 = com.google.android.gms.measurement.internal.C7076b.m12908a(r0, r1)
            android.os.Bundle r0 = com.google.android.gms.measurement.internal.C7077c.m12909a(r0)
            r1 = 0
            com.google.android.gms.measurement.internal.C7078d.m12910a(r2, r3, r1, r0)
            return
    }

    private static final boolean zzaQ(com.google.android.gms.measurement.internal.zzr r0) {
            java.lang.String r0 = r0.zzb
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private static final void zzaR(com.google.android.gms.internal.measurement.zzic r6) {
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.zzv(r0)
            r0 = -9223372036854775808
            r6.zzx(r0)
            r0 = 0
        Le:
            int r1 = r6.zzc()
            if (r0 >= r1) goto L41
            com.google.android.gms.internal.measurement.zzhs r1 = r6.zzd(r0)
            long r2 = r1.zzf()
            long r4 = r6.zzu()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L2b
            long r2 = r1.zzf()
            r6.zzv(r2)
        L2b:
            long r2 = r1.zzf()
            long r4 = r6.zzw()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L3e
            long r1 = r1.zzf()
            r6.zzx(r1)
        L3e:
            int r0 = r0 + 1
            goto Le
        L41:
            return
    }

    private static final com.google.android.gms.measurement.internal.zzor zzaS(com.google.android.gms.measurement.internal.zzor r2) {
            if (r2 == 0) goto L1d
            boolean r0 = r2.zzax()
            if (r0 == 0) goto L9
            return r2
        L9:
            java.lang.Class r2 = r2.getClass()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Component not initialized: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L1d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Upload Component not created"
            r2.<init>(r0)
            throw r2
    }

    private static final java.lang.Boolean zzaT(com.google.android.gms.measurement.internal.zzr r2) {
            java.lang.Boolean r0 = r2.zzp
            java.lang.String r2 = r2.zzC
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L2c
            com.google.android.gms.measurement.internal.zze r2 = com.google.android.gms.measurement.internal.zze.zzc(r2)
            com.google.android.gms.measurement.internal.zzjh r2 = r2.zza()
            com.google.android.gms.measurement.internal.zzjh r1 = com.google.android.gms.measurement.internal.zzjh.zza
            int r2 = r2.ordinal()
            if (r2 == 0) goto L2a
            r1 = 1
            if (r2 == r1) goto L2a
            r1 = 2
            if (r2 == r1) goto L27
            r1 = 3
            if (r2 == r1) goto L24
            goto L2c
        L24:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        L27:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            return r2
        L2a:
            r2 = 0
            return r2
        L2c:
            return r0
    }

    public static /* synthetic */ void zzav(android.content.Context r0, android.content.Intent r1) {
            zzaP(r0, r1)
            return
    }

    @androidx.annotation.VisibleForTesting
    public static final void zzaz(com.google.android.gms.internal.measurement.zzhr r4, int r5, java.lang.String r6) {
            java.util.List r0 = r4.zza()
            r1 = 0
        L5:
            int r2 = r0.size()
            java.lang.String r3 = "_err"
            if (r1 >= r2) goto L21
            java.lang.Object r2 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzhw r2 = (com.google.android.gms.internal.measurement.zzhw) r2
            java.lang.String r2 = r2.zzb()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1e
            return
        L1e:
            int r1 = r1 + 1
            goto L5
        L21:
            com.google.android.gms.internal.measurement.zzhv r0 = com.google.android.gms.internal.measurement.zzhw.zzn()
            r0.zzb(r3)
            long r1 = (long) r5
            r0.zzf(r1)
            com.google.android.gms.internal.measurement.zzme r5 = r0.zzbc()
            com.google.android.gms.internal.measurement.zzhw r5 = (com.google.android.gms.internal.measurement.zzhw) r5
            com.google.android.gms.internal.measurement.zzhv r0 = com.google.android.gms.internal.measurement.zzhw.zzn()
            java.lang.String r1 = "_ev"
            r0.zzb(r1)
            r0.zzd(r6)
            com.google.android.gms.internal.measurement.zzme r6 = r0.zzbc()
            com.google.android.gms.internal.measurement.zzhw r6 = (com.google.android.gms.internal.measurement.zzhw) r6
            r4.zzf(r5)
            r4.zzf(r6)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzA(java.lang.String r2, com.google.android.gms.measurement.internal.zzjk r3) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r1.zzaW()
            r0.zzg()
            r1.zzu()
            java.util.Map r0 = r1.zzC
            r0.put(r2, r3)
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            r0.zzab(r2, r3)
            return
    }

    @androidx.annotation.WorkerThread
    public final com.google.android.gms.measurement.internal.zzjk zzB(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzjk r0 = com.google.android.gms.measurement.internal.zzjk.zza
            com.google.android.gms.measurement.internal.zzhy r0 = r1.zzaW()
            r0.zzg()
            r1.zzu()
            java.util.Map r0 = r1.zzC
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.measurement.internal.zzjk r0 = (com.google.android.gms.measurement.internal.zzjk) r0
            if (r0 != 0) goto L25
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            com.google.android.gms.measurement.internal.zzjk r0 = r0.zzZ(r2)
            if (r0 != 0) goto L22
            com.google.android.gms.measurement.internal.zzjk r0 = com.google.android.gms.measurement.internal.zzjk.zza
        L22:
            r1.zzA(r2, r0)
        L25:
            return r0
    }

    public final long zzC() {
            r8 = this;
            com.google.android.gms.common.util.Clock r0 = r8.zzaZ()
            long r0 = r0.currentTimeMillis()
            com.google.android.gms.measurement.internal.zznm r2 = r8.zzk
            r2.zzay()
            r2.zzg()
            com.google.android.gms.measurement.internal.zzhd r3 = r2.zzf
            long r4 = r3.zza()
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 != 0) goto L34
            com.google.android.gms.measurement.internal.zzib r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzpo r2 = r2.zzk()
            java.security.SecureRandom r2 = r2.zzf()
            r4 = 86400000(0x5265c00, float:7.82218E-36)
            int r2 = r2.nextInt(r4)
            long r4 = (long) r2
            r6 = 1
            long r4 = r4 + r6
            r3.zzb(r4)
        L34:
            long r0 = r0 + r4
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r2 = 60
            long r0 = r0 / r2
            long r0 = r0 / r2
            r2 = 24
            long r0 = r0 / r2
            return r0
    }

    @androidx.annotation.WorkerThread
    public final void zzD(com.google.android.gms.measurement.internal.zzbg r43, java.lang.String r44) {
            r42 = this;
            r0 = r42
            r1 = r43
            r3 = r44
            com.google.android.gms.measurement.internal.zzav r2 = r0.zzj()
            com.google.android.gms.measurement.internal.zzh r2 = r2.zzu(r3)
            if (r2 == 0) goto Ld8
            java.lang.String r4 = r2.zzr()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L1c
            goto Ld8
        L1c:
            java.lang.Boolean r4 = r0.zzaM(r2)
            if (r4 != 0) goto L3f
            java.lang.String r4 = r1.zza
            java.lang.String r5 = "_ui"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L3d
            com.google.android.gms.measurement.internal.zzgt r4 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zze()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgt.zzl(r3)
            java.lang.String r6 = "Could not find package. appId"
            r4.zzb(r6, r5)
        L3d:
            r4 = r2
            goto L57
        L3f:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L3d
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzb()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgt.zzl(r3)
            java.lang.String r3 = "App version does not match; dropping event. appId"
            r1.zzb(r3, r2)
            return
        L57:
            com.google.android.gms.measurement.internal.zzr r2 = new com.google.android.gms.measurement.internal.zzr
            r5 = r4
            java.lang.String r4 = r5.zzf()
            r6 = r5
            java.lang.String r5 = r6.zzr()
            r8 = r6
            long r6 = r8.zzt()
            r9 = r8
            java.lang.String r8 = r9.zzv()
            r11 = r9
            long r9 = r11.zzx()
            r13 = r11
            long r11 = r13.zzz()
            boolean r14 = r13.zzD()
            java.lang.String r16 = r13.zzl()
            boolean r20 = r13.zzac()
            java.lang.Boolean r22 = r13.zzae()
            long r23 = r13.zzB()
            java.util.List r25 = r13.zzag()
            com.google.android.gms.measurement.internal.zzjk r15 = r0.zzB(r3)
            java.lang.String r26 = r15.zzl()
            boolean r29 = r13.zzai()
            long r30 = r13.zzak()
            com.google.android.gms.measurement.internal.zzjk r15 = r0.zzB(r3)
            int r32 = r15.zzb()
            com.google.android.gms.measurement.internal.zzaz r15 = r0.zzx(r3)
            java.lang.String r33 = r15.zze()
            int r34 = r13.zzao()
            long r35 = r13.zzaw()
            java.lang.String r37 = r13.zzay()
            java.lang.String r38 = r13.zzaH()
            int r41 = r13.zzaL()
            r28 = 0
            r39 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            java.lang.String r27 = ""
            r2.<init>(r3, r4, r5, r6, r8, r9, r11, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39, r41)
            r0.zzE(r1, r2)
            return
        Ld8:
            com.google.android.gms.measurement.internal.zzgt r1 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzj()
            java.lang.String r2 = "No app data available; dropping event"
            r1.zzb(r2, r3)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzE(com.google.android.gms.measurement.internal.zzbg r9, com.google.android.gms.measurement.internal.zzr r10) {
            r8 = this;
            java.lang.String r0 = r10.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.measurement.internal.zzgu r9 = com.google.android.gms.measurement.internal.zzgu.zza(r9)
            android.os.Bundle r1 = r9.zzd
            com.google.android.gms.measurement.internal.zzpo r2 = r8.zzt()
            com.google.android.gms.measurement.internal.zzav r3 = r8.zzj()
            android.os.Bundle r3 = r3.zzW(r0)
            r2.zzI(r1, r3)
            com.google.android.gms.measurement.internal.zzpo r1 = r8.zzt()
            com.google.android.gms.measurement.internal.zzal r2 = r8.zzd()
            int r0 = r2.zzd(r0)
            r1.zzG(r9, r0)
            com.google.android.gms.measurement.internal.zzbg r9 = r9.zzb()
            com.google.android.gms.measurement.internal.zzal r0 = r8.zzd()
            r1 = 0
            com.google.android.gms.measurement.internal.zzfw r2 = com.google.android.gms.measurement.internal.zzfx.zzbg
            boolean r0 = r0.zzp(r1, r2)
            if (r0 == 0) goto L3b
            goto L70
        L3b:
            java.lang.String r0 = r9.zza
            java.lang.String r1 = "_cmp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L70
            com.google.android.gms.measurement.internal.zzbe r0 = r9.zzb
            java.lang.String r1 = "_cis"
            java.lang.String r1 = r0.zzd(r1)
            java.lang.String r2 = "referrer API v2"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L70
            java.lang.String r1 = "gclid"
            java.lang.String r6 = r0.zzd(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L70
            long r4 = r9.zzd
            com.google.android.gms.measurement.internal.zzpk r2 = new com.google.android.gms.measurement.internal.zzpk
            java.lang.String r7 = "auto"
            java.lang.String r3 = "_lgclid"
            r2.<init>(r3, r4, r6, r7)
            r8.zzab(r2, r10)
        L70:
            r8.zzF(r9, r10)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzF(com.google.android.gms.measurement.internal.zzbg r19, com.google.android.gms.measurement.internal.zzr r20) {
            r18 = this;
            r1 = r18
            r0 = r20
            java.lang.String r2 = "_s"
            java.lang.String r3 = "_sid"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r4 = r0.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            com.google.android.gms.measurement.internal.zzhy r5 = r1.zzaW()
            r5.zzg()
            r1.zzu()
            r5 = r19
            long r9 = r5.zzd
            com.google.android.gms.measurement.internal.zzgu r5 = com.google.android.gms.measurement.internal.zzgu.zza(r5)
            com.google.android.gms.measurement.internal.zzhy r6 = r1.zzaW()
            r6.zzg()
            com.google.android.gms.measurement.internal.zzlt r6 = r1.zzG
            r7 = 0
            if (r6 == 0) goto L38
            java.lang.String r6 = r1.zzH
            if (r6 == 0) goto L38
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L3a
        L38:
            r6 = r7
            goto L3c
        L3a:
            com.google.android.gms.measurement.internal.zzlt r6 = r1.zzG
        L3c:
            android.os.Bundle r8 = r5.zzd
            r11 = 0
            com.google.android.gms.measurement.internal.zzpo.zzav(r6, r8, r11)
            com.google.android.gms.measurement.internal.zzbg r5 = r5.zzb()
            r1.zzp()
            boolean r6 = com.google.android.gms.measurement.internal.zzpj.zzD(r5, r0)
            if (r6 != 0) goto L50
            return
        L50:
            boolean r6 = r0.zzh
            if (r6 != 0) goto L58
            r1.zzan(r0)
            return
        L58:
            java.util.List r6 = r0.zzr
            if (r6 == 0) goto L94
            java.lang.String r12 = r5.zza
            boolean r6 = r6.contains(r12)
            if (r6 == 0) goto L82
            com.google.android.gms.measurement.internal.zzbe r6 = r5.zzb
            android.os.Bundle r6 = r6.zzf()
            java.lang.String r8 = "ga_safelisted"
            r13 = 1
            r6.putLong(r8, r13)
            com.google.android.gms.measurement.internal.zzbg r11 = new com.google.android.gms.measurement.internal.zzbg
            com.google.android.gms.measurement.internal.zzbe r13 = new com.google.android.gms.measurement.internal.zzbe
            r13.<init>(r6)
            java.lang.String r14 = r5.zzc
            long r5 = r5.zzd
            r15 = r5
            r11.<init>(r12, r13, r14, r15)
            r12 = r11
            goto L95
        L82:
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzj()
            java.lang.String r2 = r5.zza
            java.lang.String r3 = r5.zzc
            java.lang.String r5 = "Dropping non-safelisted event. appId, event name, origin"
            r0.zzd(r5, r4, r2, r3)
            return
        L94:
            r12 = r5
        L95:
            com.google.android.gms.measurement.internal.zzav r5 = r1.zzj()
            r5.zzb()
            java.lang.String r5 = r12.zza     // Catch: java.lang.Throwable -> Lf2
            boolean r6 = r2.equals(r5)     // Catch: java.lang.Throwable -> Lf2
            r13 = 0
            if (r6 == 0) goto L100
            com.google.android.gms.measurement.internal.zzav r6 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            boolean r2 = r6.zzQ(r4, r2)     // Catch: java.lang.Throwable -> Lf2
            if (r2 != 0) goto L100
            com.google.android.gms.measurement.internal.zzbe r2 = r12.zzb     // Catch: java.lang.Throwable -> Lf2
            java.lang.Long r2 = r2.zzb(r3)     // Catch: java.lang.Throwable -> Lf2
            long r15 = r2.longValue()     // Catch: java.lang.Throwable -> Lf2
            int r2 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r2 == 0) goto L100
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r6 = "_f"
            boolean r2 = r2.zzQ(r4, r6)     // Catch: java.lang.Throwable -> Lf2
            if (r2 != 0) goto Lf5
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r6 = "_v"
            boolean r2 = r2.zzQ(r4, r6)     // Catch: java.lang.Throwable -> Lf2
            if (r2 == 0) goto Ld7
            goto Lf5
        Ld7:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.common.util.Clock r6 = r1.zzaZ()     // Catch: java.lang.Throwable -> Lf2
            long r6 = r6.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf2
            r15 = -15000(0xffffffffffffc568, double:NaN)
            long r6 = r6 + r15
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Lf2
            android.os.Bundle r7 = r1.zzG(r4, r12)     // Catch: java.lang.Throwable -> Lf2
            r2.zzY(r4, r6, r3, r7)     // Catch: java.lang.Throwable -> Lf2
            goto L100
        Lf2:
            r0 = move-exception
            goto L340
        Lf5:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            android.os.Bundle r6 = r1.zzG(r4, r12)     // Catch: java.lang.Throwable -> Lf2
            r2.zzY(r4, r7, r3, r6)     // Catch: java.lang.Throwable -> Lf2
        L100:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch: java.lang.Throwable -> Lf2
            r2.zzg()     // Catch: java.lang.Throwable -> Lf2
            r2.zzay()     // Catch: java.lang.Throwable -> Lf2
            int r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r3 >= 0) goto L12b
            com.google.android.gms.measurement.internal.zzib r2 = r2.zzu     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgt r2 = r2.zzaV()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zze()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r6 = "Invalid time querying timed out conditional properties"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgt.zzl(r4)     // Catch: java.lang.Throwable -> Lf2
            java.lang.Long r8 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> Lf2
            r2.zzc(r6, r7, r8)     // Catch: java.lang.Throwable -> Lf2
            java.util.List r2 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Lf2
            goto L139
        L12b:
            java.lang.String r6 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"
            java.lang.String r7 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String[] r7 = new java.lang.String[]{r4, r7}     // Catch: java.lang.Throwable -> Lf2
            java.util.List r2 = r2.zzt(r6, r7)     // Catch: java.lang.Throwable -> Lf2
        L139:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lf2
        L13d:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> Lf2
            if (r6 == 0) goto L186
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzah r6 = (com.google.android.gms.measurement.internal.zzah) r6     // Catch: java.lang.Throwable -> Lf2
            if (r6 == 0) goto L13d
            com.google.android.gms.measurement.internal.zzgt r7 = r1.zzaV()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgr r7 = r7.zzk()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r8 = "User property timed out"
            java.lang.String r11 = r6.zza     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzib r13 = r1.zzn     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgm r13 = r13.zzl()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzpk r14 = r6.zzc     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r14 = r14.zzb     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r13 = r13.zzc(r14)     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzpk r14 = r6.zzc     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r14 = r14.zza()     // Catch: java.lang.Throwable -> Lf2
            r7.zzd(r8, r11, r13, r14)     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzbg r7 = r6.zzg     // Catch: java.lang.Throwable -> Lf2
            if (r7 == 0) goto L17a
            com.google.android.gms.measurement.internal.zzbg r8 = new com.google.android.gms.measurement.internal.zzbg     // Catch: java.lang.Throwable -> Lf2
            r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> Lf2
            r1.zzH(r8, r0)     // Catch: java.lang.Throwable -> Lf2
        L17a:
            com.google.android.gms.measurement.internal.zzav r7 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzpk r6 = r6.zzc     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r6 = r6.zzb     // Catch: java.lang.Throwable -> Lf2
            r7.zzr(r4, r6)     // Catch: java.lang.Throwable -> Lf2
            goto L13d
        L186:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch: java.lang.Throwable -> Lf2
            r2.zzg()     // Catch: java.lang.Throwable -> Lf2
            r2.zzay()     // Catch: java.lang.Throwable -> Lf2
            if (r3 >= 0) goto L1af
            com.google.android.gms.measurement.internal.zzib r2 = r2.zzu     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgt r2 = r2.zzaV()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zze()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r6 = "Invalid time querying expired conditional properties"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgt.zzl(r4)     // Catch: java.lang.Throwable -> Lf2
            java.lang.Long r8 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> Lf2
            r2.zzc(r6, r7, r8)     // Catch: java.lang.Throwable -> Lf2
            java.util.List r2 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Lf2
            goto L1bd
        L1af:
            java.lang.String r6 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"
            java.lang.String r7 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String[] r7 = new java.lang.String[]{r4, r7}     // Catch: java.lang.Throwable -> Lf2
            java.util.List r2 = r2.zzt(r6, r7)     // Catch: java.lang.Throwable -> Lf2
        L1bd:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf2
            int r7 = r2.size()     // Catch: java.lang.Throwable -> Lf2
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lf2
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lf2
        L1ca:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> Lf2
            if (r7 == 0) goto L219
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzah r7 = (com.google.android.gms.measurement.internal.zzah) r7     // Catch: java.lang.Throwable -> Lf2
            if (r7 == 0) goto L1ca
            com.google.android.gms.measurement.internal.zzgt r8 = r1.zzaV()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgr r8 = r8.zzk()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r11 = "User property expired"
            java.lang.String r13 = r7.zza     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzib r14 = r1.zzn     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgm r14 = r14.zzl()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzpk r15 = r7.zzc     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r15 = r15.zzb     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r14 = r14.zzc(r15)     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzpk r15 = r7.zzc     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r15 = r15.zza()     // Catch: java.lang.Throwable -> Lf2
            r8.zzd(r11, r13, r14, r15)     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzav r8 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzpk r11 = r7.zzc     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r11 = r11.zzb     // Catch: java.lang.Throwable -> Lf2
            r8.zzk(r4, r11)     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzbg r8 = r7.zzk     // Catch: java.lang.Throwable -> Lf2
            if (r8 == 0) goto L20d
            r6.add(r8)     // Catch: java.lang.Throwable -> Lf2
        L20d:
            com.google.android.gms.measurement.internal.zzav r8 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzpk r7 = r7.zzc     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r7 = r7.zzb     // Catch: java.lang.Throwable -> Lf2
            r8.zzr(r4, r7)     // Catch: java.lang.Throwable -> Lf2
            goto L1ca
        L219:
            java.util.Iterator r2 = r6.iterator()     // Catch: java.lang.Throwable -> Lf2
        L21d:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> Lf2
            if (r6 == 0) goto L232
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzbg r6 = (com.google.android.gms.measurement.internal.zzbg) r6     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzbg r7 = new com.google.android.gms.measurement.internal.zzbg     // Catch: java.lang.Throwable -> Lf2
            r7.<init>(r6, r9)     // Catch: java.lang.Throwable -> Lf2
            r1.zzH(r7, r0)     // Catch: java.lang.Throwable -> Lf2
            goto L21d
        L232:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)     // Catch: java.lang.Throwable -> Lf2
            r2.zzg()     // Catch: java.lang.Throwable -> Lf2
            r2.zzay()     // Catch: java.lang.Throwable -> Lf2
            if (r3 >= 0) goto L266
            com.google.android.gms.measurement.internal.zzib r2 = r2.zzu     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgt r3 = r2.zzaV()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgr r3 = r3.zze()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r6 = "Invalid time querying triggered conditional properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgt.zzl(r4)     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgm r2 = r2.zzl()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r2 = r2.zza(r5)     // Catch: java.lang.Throwable -> Lf2
            java.lang.Long r5 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> Lf2
            r3.zzd(r6, r4, r2, r5)     // Catch: java.lang.Throwable -> Lf2
            java.util.List r2 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Lf2
            goto L274
        L266:
            java.lang.String r3 = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"
            java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch: java.lang.Throwable -> Lf2
            java.util.List r2 = r2.zzt(r3, r4)     // Catch: java.lang.Throwable -> Lf2
        L274:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf2
            int r4 = r2.size()     // Catch: java.lang.Throwable -> Lf2
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lf2
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lf2
        L281:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Lf2
            if (r4 == 0) goto L315
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzah r4 = (com.google.android.gms.measurement.internal.zzah) r4     // Catch: java.lang.Throwable -> Lf2
            if (r4 == 0) goto L281
            com.google.android.gms.measurement.internal.zzpk r5 = r4.zzc     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzpm r6 = new com.google.android.gms.measurement.internal.zzpm     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r7 = r4.zza     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Lf2
            r8 = r6
            r6 = r7
            java.lang.String r7 = r4.zzb     // Catch: java.lang.Throwable -> Lf2
            r11 = r8
            java.lang.String r8 = r5.zzb     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r5 = r5.zza()     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch: java.lang.Throwable -> Lf2
            r17 = r11
            r11 = r5
            r5 = r17
            r5.<init>(r6, r7, r8, r9, r11)     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzav r6 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            boolean r6 = r6.zzl(r5)     // Catch: java.lang.Throwable -> Lf2
            if (r6 == 0) goto L2da
            com.google.android.gms.measurement.internal.zzgt r6 = r1.zzaV()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzk()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r7 = "User property triggered"
            java.lang.String r8 = r4.zza     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzib r11 = r1.zzn     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgm r11 = r11.zzl()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r13 = r5.zzc     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r11 = r11.zzc(r13)     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r13 = r5.zze     // Catch: java.lang.Throwable -> Lf2
            r6.zzd(r7, r8, r11, r13)     // Catch: java.lang.Throwable -> Lf2
            goto L2fb
        L2da:
            com.google.android.gms.measurement.internal.zzgt r6 = r1.zzaV()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzb()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r7 = "Too many active user properties, ignoring"
            java.lang.String r8 = r4.zza     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzgt.zzl(r8)     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzib r11 = r1.zzn     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzgm r11 = r11.zzl()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r13 = r5.zzc     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r11 = r11.zzc(r13)     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r13 = r5.zze     // Catch: java.lang.Throwable -> Lf2
            r6.zzd(r7, r8, r11, r13)     // Catch: java.lang.Throwable -> Lf2
        L2fb:
            com.google.android.gms.measurement.internal.zzbg r6 = r4.zzi     // Catch: java.lang.Throwable -> Lf2
            if (r6 == 0) goto L302
            r3.add(r6)     // Catch: java.lang.Throwable -> Lf2
        L302:
            com.google.android.gms.measurement.internal.zzpk r6 = new com.google.android.gms.measurement.internal.zzpk     // Catch: java.lang.Throwable -> Lf2
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lf2
            r4.zzc = r6     // Catch: java.lang.Throwable -> Lf2
            r5 = 1
            r4.zze = r5     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzav r5 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            r5.zzp(r4)     // Catch: java.lang.Throwable -> Lf2
            goto L281
        L315:
            r1.zzH(r12, r0)     // Catch: java.lang.Throwable -> Lf2
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> Lf2
        L31c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lf2
            if (r3 == 0) goto L331
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzbg r3 = (com.google.android.gms.measurement.internal.zzbg) r3     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzbg r4 = new com.google.android.gms.measurement.internal.zzbg     // Catch: java.lang.Throwable -> Lf2
            r4.<init>(r3, r9)     // Catch: java.lang.Throwable -> Lf2
            r1.zzH(r4, r0)     // Catch: java.lang.Throwable -> Lf2
            goto L31c
        L331:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> Lf2
            r0.zzc()     // Catch: java.lang.Throwable -> Lf2
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            r0.zzd()
            return
        L340:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()
            r2.zzd()
            throw r0
    }

    public final android.os.Bundle zzG(java.lang.String r5, com.google.android.gms.measurement.internal.zzbg r6) {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.zzbe r6 = r6.zzb
            java.lang.String r1 = "_sid"
            java.lang.Long r6 = r6.zzb(r1)
            long r2 = r6.longValue()
            r0.putLong(r1, r2)
            com.google.android.gms.measurement.internal.zzav r6 = r4.zzj()
            java.lang.String r1 = "_sno"
            com.google.android.gms.measurement.internal.zzpm r5 = r6.zzm(r5, r1)
            if (r5 == 0) goto L2f
            java.lang.Object r5 = r5.zze
            boolean r6 = r5 instanceof java.lang.Long
            if (r6 == 0) goto L2f
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r0.putLong(r1, r5)
        L2f:
            return r0
    }

    @androidx.annotation.WorkerThread
    public final void zzH(com.google.android.gms.measurement.internal.zzbg r45, com.google.android.gms.measurement.internal.zzr r46) {
            r44 = this;
            r1 = r44
            r2 = r46
            java.lang.String r3 = "metadata_fingerprint"
            java.lang.String r4 = "app_id"
            java.lang.String r5 = "_fx"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r10 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            long r25 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.zzhy r0 = r1.zzaW()
            r0.zzg()
            r1.zzu()
            r1.zzp()
            boolean r0 = com.google.android.gms.measurement.internal.zzpj.zzD(r45, r46)
            if (r0 != 0) goto L30
            goto Ld4
        L30:
            boolean r0 = r2.zzh
            if (r0 != 0) goto L38
            r1.zzan(r2)
            return
        L38:
            com.google.android.gms.measurement.internal.zzhs r0 = r1.zzh()
            r8 = r45
            java.lang.String r13 = r8.zza
            boolean r0 = r0.zzj(r10, r13)
            java.lang.String r15 = "_err"
            r9 = 0
            if (r0 == 0) goto Ld5
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zze()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgt.zzl(r10)
            com.google.android.gms.measurement.internal.zzib r3 = r1.zzn
            com.google.android.gms.measurement.internal.zzgm r3 = r3.zzl()
            java.lang.String r3 = r3.zza(r13)
            java.lang.String r4 = "Dropping blocked event. appId"
            r0.zzc(r4, r2, r3)
            com.google.android.gms.measurement.internal.zzhs r0 = r1.zzh()
            boolean r0 = r0.zzn(r10)
            if (r0 != 0) goto L8e
            com.google.android.gms.measurement.internal.zzhs r0 = r1.zzh()
            boolean r0 = r0.zzo(r10)
            if (r0 == 0) goto L79
            goto L8e
        L79:
            boolean r0 = r15.equals(r13)
            if (r0 != 0) goto Ld4
            com.google.android.gms.measurement.internal.zzpo r8 = r1.zzt()
            com.google.android.gms.measurement.internal.zzpn r9 = r1.zzK
            java.lang.String r12 = "_ev"
            r14 = 0
            r11 = 11
            r8.zzN(r9, r10, r11, r12, r13, r14)
            return
        L8e:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            com.google.android.gms.measurement.internal.zzh r0 = r0.zzu(r10)
            if (r0 == 0) goto Ld4
            long r2 = r0.zzJ()
            long r4 = r0.zzH()
            long r2 = java.lang.Math.max(r2, r4)
            com.google.android.gms.common.util.Clock r4 = r1.zzaZ()
            long r4 = r4.currentTimeMillis()
            long r4 = r4 - r2
            long r2 = java.lang.Math.abs(r4)
            r1.zzd()
            com.google.android.gms.measurement.internal.zzfw r4 = com.google.android.gms.measurement.internal.zzfx.zzN
            java.lang.Object r4 = r4.zzb(r9)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto Ld4
            com.google.android.gms.measurement.internal.zzgt r2 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzj()
            java.lang.String r3 = "Fetching config for blocked app"
            r2.zza(r3)
            r1.zzV(r0)
        Ld4:
            return
        Ld5:
            com.google.android.gms.measurement.internal.zzgu r0 = com.google.android.gms.measurement.internal.zzgu.zza(r8)
            com.google.android.gms.measurement.internal.zzpo r8 = r1.zzt()
            com.google.android.gms.measurement.internal.zzal r11 = r1.zzd()
            int r11 = r11.zzd(r10)
            r8.zzG(r0, r11)
            com.google.android.gms.measurement.internal.zzal r8 = r1.zzd()
            com.google.android.gms.measurement.internal.zzfw r11 = com.google.android.gms.measurement.internal.zzfx.zzag
            r12 = 10
            r13 = 35
            int r8 = r8.zzn(r10, r11, r12, r13)
            android.os.Bundle r11 = r0.zzd
            java.util.TreeSet r12 = new java.util.TreeSet
            java.util.Set r13 = r11.keySet()
            r12.<init>(r13)
            java.util.Iterator r12 = r12.iterator()
        L105:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L125
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = "items"
            boolean r14 = r14.equals(r13)
            if (r14 == 0) goto L105
            com.google.android.gms.measurement.internal.zzpo r14 = r1.zzt()
            android.os.Parcelable[] r13 = r11.getParcelableArray(r13)
            r14.zzH(r13, r8)
            goto L105
        L125:
            com.google.android.gms.measurement.internal.zzbg r8 = r0.zzb()
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()
            java.lang.String r0 = r0.zzn()
            r11 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r11)
            if (r0 == 0) goto L14f
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            com.google.android.gms.measurement.internal.zzib r11 = r1.zzn
            com.google.android.gms.measurement.internal.zzgm r11 = r11.zzl()
            java.lang.String r11 = r11.zzd(r8)
            java.lang.String r12 = "Logging event"
            r0.zzb(r12, r11)
        L14f:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            r0.zzb()
            r1.zzan(r2)     // Catch: java.lang.Throwable -> L179
            java.lang.String r0 = "ecommerce_purchase"
            java.lang.String r11 = r8.zza     // Catch: java.lang.Throwable -> L179
            boolean r0 = r0.equals(r11)     // Catch: java.lang.Throwable -> L179
            java.lang.String r12 = "refund"
            if (r0 != 0) goto L175
            java.lang.String r0 = "purchase"
            boolean r0 = r0.equals(r11)     // Catch: java.lang.Throwable -> L179
            if (r0 != 0) goto L175
            boolean r0 = r12.equals(r11)     // Catch: java.lang.Throwable -> L179
            if (r0 == 0) goto L177
        L175:
            r0 = 1
            goto L17c
        L177:
            r0 = 0
            goto L17c
        L179:
            r0 = move-exception
            goto Lb6b
        L17c:
            java.lang.String r9 = "_iap"
            boolean r9 = r9.equals(r11)     // Catch: java.lang.Throwable -> L179
            r27 = r3
            java.lang.String r3 = "value"
            if (r9 != 0) goto L195
            if (r0 == 0) goto L18d
            r0 = 1
            goto L195
        L18d:
            r28 = r4
            r29 = r5
        L191:
            r5 = r8
            r4 = 0
            goto L2f6
        L195:
            java.lang.String r9 = "_ltv_"
            com.google.android.gms.measurement.internal.zzbe r13 = r8.zzb     // Catch: java.lang.Throwable -> L179
            java.lang.String r14 = "currency"
            java.lang.String r14 = r13.zzd(r14)     // Catch: java.lang.Throwable -> L179
            if (r0 == 0) goto L200
            java.lang.Double r0 = r13.zzc(r3)     // Catch: java.lang.Throwable -> L179
            double r18 = r0.doubleValue()     // Catch: java.lang.Throwable -> L179
            r20 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r18 = r18 * r20
            r22 = 0
            int r0 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r0 != 0) goto L1c6
            java.lang.Long r0 = r13.zzb(r3)     // Catch: java.lang.Throwable -> L179
            r28 = r4
            r29 = r5
            long r4 = r0.longValue()     // Catch: java.lang.Throwable -> L179
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L179
            double r18 = r4 * r20
            goto L1ca
        L1c6:
            r28 = r4
            r29 = r5
        L1ca:
            r4 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r0 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r0 > 0) goto L1e2
            r4 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r0 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r0 < 0) goto L1e2
            long r4 = java.lang.Math.round(r18)     // Catch: java.lang.Throwable -> L179
            boolean r0 = r12.equals(r11)     // Catch: java.lang.Throwable -> L179
            if (r0 == 0) goto L20c
            long r4 = -r4
            goto L20c
        L1e2:
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zze()     // Catch: java.lang.Throwable -> L179
            java.lang.String r2 = "Data lost. Currency value is too big. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgt.zzl(r10)     // Catch: java.lang.Throwable -> L179
            java.lang.Double r4 = java.lang.Double.valueOf(r18)     // Catch: java.lang.Throwable -> L179
            r0.zzc(r2, r3, r4)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            r0.zzc()     // Catch: java.lang.Throwable -> L179
            goto L582
        L200:
            r28 = r4
            r29 = r5
            java.lang.Long r0 = r13.zzb(r3)     // Catch: java.lang.Throwable -> L179
            long r4 = r0.longValue()     // Catch: java.lang.Throwable -> L179
        L20c:
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L179
            if (r0 != 0) goto L191
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L179
            java.lang.String r0 = r14.toUpperCase(r0)     // Catch: java.lang.Throwable -> L179
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r0.matches(r11)     // Catch: java.lang.Throwable -> L179
            if (r11 == 0) goto L191
            java.lang.String r11 = r9.concat(r0)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpm r0 = r0.zzm(r10, r11)     // Catch: java.lang.Throwable -> L179
            if (r0 == 0) goto L234
            java.lang.Object r0 = r0.zze     // Catch: java.lang.Throwable -> L179
            boolean r9 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L179
            if (r9 != 0) goto L23a
        L234:
            r9 = 1
            r16 = 0
            r17 = 0
            goto L263
        L23a:
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L179
            long r12 = r0.longValue()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpm r0 = new com.google.android.gms.measurement.internal.zzpm     // Catch: java.lang.Throwable -> L179
            r9 = r10
            java.lang.String r10 = r8.zzc     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.common.util.Clock r14 = r1.zzaZ()     // Catch: java.lang.Throwable -> L179
            long r18 = r14.currentTimeMillis()     // Catch: java.lang.Throwable -> L179
            long r12 = r12 + r4
            java.lang.Long r14 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L179
            r5 = r8
            r12 = r18
            r4 = 1
            r16 = 0
            r17 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r14)     // Catch: java.lang.Throwable -> L179
            r10 = r9
            r4 = r16
        L261:
            r0 = r8
            goto L2bf
        L263:
            com.google.android.gms.measurement.internal.zzav r12 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzal r0 = r1.zzd()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzfw r13 = com.google.android.gms.measurement.internal.zzfx.zzT     // Catch: java.lang.Throwable -> L179
            int r0 = r0.zzm(r10, r13)     // Catch: java.lang.Throwable -> L179
            int r0 = r0 + (-1)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch: java.lang.Throwable -> L179
            r12.zzg()     // Catch: java.lang.Throwable -> L179
            r12.zzay()     // Catch: java.lang.Throwable -> L179
            android.database.sqlite.SQLiteDatabase r13 = r12.zze()     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L28e
            java.lang.String r14 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L28e
            java.lang.String[] r0 = new java.lang.String[]{r10, r10, r0}     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L28e
            r13.execSQL(r14, r0)     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L28e
            goto L2a2
        L28e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzib r12 = r12.zzu     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgt r12 = r12.zzaV()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgr r12 = r12.zzb()     // Catch: java.lang.Throwable -> L179
            java.lang.String r13 = "Error pruning currencies. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzgt.zzl(r10)     // Catch: java.lang.Throwable -> L179
            r12.zzc(r13, r14, r0)     // Catch: java.lang.Throwable -> L179
        L2a2:
            com.google.android.gms.measurement.internal.zzpm r0 = new com.google.android.gms.measurement.internal.zzpm     // Catch: java.lang.Throwable -> L179
            r12 = r9
            r9 = r10
            java.lang.String r10 = r8.zzc     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.common.util.Clock r13 = r1.zzaZ()     // Catch: java.lang.Throwable -> L179
            long r13 = r13.currentTimeMillis()     // Catch: java.lang.Throwable -> L179
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L179
            r5 = r8
            r12 = r13
            r8 = r0
            r14 = r4
            r4 = r16
            r8.<init>(r9, r10, r11, r12, r14)     // Catch: java.lang.Throwable -> L179
            r10 = r9
            goto L261
        L2bf:
            com.google.android.gms.measurement.internal.zzav r8 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            boolean r8 = r8.zzl(r0)     // Catch: java.lang.Throwable -> L179
            if (r8 != 0) goto L2f6
            com.google.android.gms.measurement.internal.zzgt r8 = r1.zzaV()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgr r8 = r8.zzb()     // Catch: java.lang.Throwable -> L179
            java.lang.String r9 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzgt.zzl(r10)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzib r12 = r1.zzn     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgm r12 = r12.zzl()     // Catch: java.lang.Throwable -> L179
            java.lang.String r13 = r0.zzc     // Catch: java.lang.Throwable -> L179
            java.lang.String r12 = r12.zzc(r13)     // Catch: java.lang.Throwable -> L179
            java.lang.Object r0 = r0.zze     // Catch: java.lang.Throwable -> L179
            r8.zzd(r9, r11, r12, r0)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpo r8 = r1.zzt()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpn r9 = r1.zzK     // Catch: java.lang.Throwable -> L179
            r13 = 0
            r14 = 0
            r11 = 9
            r12 = 0
            r8.zzN(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L179
        L2f6:
            java.lang.String r0 = r5.zza     // Catch: java.lang.Throwable -> L179
            boolean r8 = com.google.android.gms.measurement.internal.zzpo.zzh(r0)     // Catch: java.lang.Throwable -> L179
            boolean r17 = r15.equals(r0)     // Catch: java.lang.Throwable -> L179
            r1.zzt()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzbe r9 = r5.zzb     // Catch: java.lang.Throwable -> L179
            if (r9 != 0) goto L30a
            r14 = 0
            goto L329
        L30a:
            com.google.android.gms.measurement.internal.zzbd r13 = new com.google.android.gms.measurement.internal.zzbd     // Catch: java.lang.Throwable -> L179
            r13.<init>(r9)     // Catch: java.lang.Throwable -> L179
            r14 = 0
        L311:
            boolean r16 = r13.hasNext()     // Catch: java.lang.Throwable -> L179
            if (r16 == 0) goto L329
            java.lang.String r11 = r13.zza()     // Catch: java.lang.Throwable -> L179
            java.lang.Object r11 = r9.zza(r11)     // Catch: java.lang.Throwable -> L179
            boolean r12 = r11 instanceof android.os.Parcelable[]     // Catch: java.lang.Throwable -> L179
            if (r12 == 0) goto L311
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11     // Catch: java.lang.Throwable -> L179
            int r11 = r11.length     // Catch: java.lang.Throwable -> L179
            long r11 = (long) r11     // Catch: java.lang.Throwable -> L179
            long r14 = r14 + r11
            goto L311
        L329:
            r11 = 1
            long r14 = r14 + r11
            r20 = r11
            r12 = r14
            r15 = r8
            com.google.android.gms.measurement.internal.zzav r8 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            r14 = r9
            r11 = r10
            long r9 = r1.zzC()     // Catch: java.lang.Throwable -> L179
            r22 = 0
            r19 = 0
            r31 = r20
            r20 = 0
            r16 = r14
            r14 = 1
            r18 = r16
            r16 = 0
            r21 = r18
            r18 = 0
            r24 = r5
            r4 = r31
            r31 = r22
            com.google.android.gms.measurement.internal.zzar r8 = r8.zzx(r9, r11, r12, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L179
            r10 = r11
            r18 = r15
            long r11 = r8.zzb     // Catch: java.lang.Throwable -> L179
            r1.zzd()     // Catch: java.lang.Throwable -> L179
            long r13 = com.google.android.gms.measurement.internal.zzal.zzH()     // Catch: java.lang.Throwable -> L179
            long r11 = r11 - r13
            int r9 = (r11 > r31 ? 1 : (r11 == r31 ? 0 : -1))
            r13 = 1000(0x3e8, double:4.94E-321)
            if (r9 <= 0) goto L38f
            long r11 = r11 % r13
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 != 0) goto L386
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()     // Catch: java.lang.Throwable -> L179
            java.lang.String r2 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgt.zzl(r10)     // Catch: java.lang.Throwable -> L179
            long r4 = r8.zzb     // Catch: java.lang.Throwable -> L179
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L179
            r0.zzc(r2, r3, r4)     // Catch: java.lang.Throwable -> L179
        L386:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            r0.zzc()     // Catch: java.lang.Throwable -> L179
            goto L582
        L38f:
            if (r18 == 0) goto L3e1
            long r11 = r8.zza     // Catch: java.lang.Throwable -> L179
            r1.zzd()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzfw r9 = com.google.android.gms.measurement.internal.zzfx.zzm     // Catch: java.lang.Throwable -> L179
            r15 = 0
            java.lang.Object r9 = r9.zzb(r15)     // Catch: java.lang.Throwable -> L179
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> L179
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L179
            r15 = r13
            long r13 = (long) r9     // Catch: java.lang.Throwable -> L179
            long r11 = r11 - r13
            int r9 = (r11 > r31 ? 1 : (r11 == r31 ? 0 : -1))
            if (r9 <= 0) goto L3e1
            long r11 = r11 % r15
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 != 0) goto L3c6
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()     // Catch: java.lang.Throwable -> L179
            java.lang.String r2 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgt.zzl(r10)     // Catch: java.lang.Throwable -> L179
            long r4 = r8.zza     // Catch: java.lang.Throwable -> L179
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L179
            r0.zzc(r2, r3, r4)     // Catch: java.lang.Throwable -> L179
        L3c6:
            com.google.android.gms.measurement.internal.zzpo r8 = r1.zzt()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpn r9 = r1.zzK     // Catch: java.lang.Throwable -> L179
            java.lang.String r12 = "_ev"
            r11 = r24
            java.lang.String r13 = r11.zza     // Catch: java.lang.Throwable -> L179
            r14 = 0
            r11 = 16
            r8.zzN(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            r0.zzc()     // Catch: java.lang.Throwable -> L179
            goto L582
        L3e1:
            r11 = r24
            r9 = 1000000(0xf4240, float:1.401298E-39)
            if (r17 == 0) goto L42b
            long r12 = r8.zzd     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzal r14 = r1.zzd()     // Catch: java.lang.Throwable -> L179
            java.lang.String r15 = r2.zza     // Catch: java.lang.Throwable -> L179
            r33 = r4
            com.google.android.gms.measurement.internal.zzfw r4 = com.google.android.gms.measurement.internal.zzfx.zzl     // Catch: java.lang.Throwable -> L179
            int r4 = r14.zzm(r15, r4)     // Catch: java.lang.Throwable -> L179
            int r4 = java.lang.Math.min(r9, r4)     // Catch: java.lang.Throwable -> L179
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)     // Catch: java.lang.Throwable -> L179
            long r14 = (long) r4     // Catch: java.lang.Throwable -> L179
            long r12 = r12 - r14
            int r4 = (r12 > r31 ? 1 : (r12 == r31 ? 0 : -1))
            if (r4 <= 0) goto L42e
            int r0 = (r12 > r33 ? 1 : (r12 == r33 ? 0 : -1))
            if (r0 != 0) goto L422
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()     // Catch: java.lang.Throwable -> L179
            java.lang.String r2 = "Too many error events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgt.zzl(r10)     // Catch: java.lang.Throwable -> L179
            long r4 = r8.zzd     // Catch: java.lang.Throwable -> L179
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L179
            r0.zzc(r2, r3, r4)     // Catch: java.lang.Throwable -> L179
        L422:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            r0.zzc()     // Catch: java.lang.Throwable -> L179
            goto L582
        L42b:
            r33 = r4
            r5 = 0
        L42e:
            android.os.Bundle r4 = r21.zzf()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpo r8 = r1.zzt()     // Catch: java.lang.Throwable -> L179
            java.lang.String r12 = "_o"
            java.lang.String r13 = r11.zzc     // Catch: java.lang.Throwable -> L179
            r8.zzM(r4, r12, r13)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpo r8 = r1.zzt()     // Catch: java.lang.Throwable -> L179
            java.lang.String r12 = r2.zzB     // Catch: java.lang.Throwable -> L179
            boolean r8 = r8.zzaa(r10, r12)     // Catch: java.lang.Throwable -> L179
            java.lang.String r12 = "_r"
            if (r8 == 0) goto L45f
            com.google.android.gms.measurement.internal.zzpo r8 = r1.zzt()     // Catch: java.lang.Throwable -> L179
            java.lang.String r14 = "_dbg"
            java.lang.Long r15 = java.lang.Long.valueOf(r33)     // Catch: java.lang.Throwable -> L179
            r8.zzM(r4, r14, r15)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpo r8 = r1.zzt()     // Catch: java.lang.Throwable -> L179
            r8.zzM(r4, r12, r15)     // Catch: java.lang.Throwable -> L179
        L45f:
            java.lang.String r8 = "_s"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L179
            if (r8 == 0) goto L480
            com.google.android.gms.measurement.internal.zzav r8 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            java.lang.String r14 = r2.zza     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpm r8 = r8.zzm(r14, r7)     // Catch: java.lang.Throwable -> L179
            if (r8 == 0) goto L480
            java.lang.Object r8 = r8.zze     // Catch: java.lang.Throwable -> L179
            boolean r14 = r8 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L179
            if (r14 == 0) goto L480
            com.google.android.gms.measurement.internal.zzpo r14 = r1.zzt()     // Catch: java.lang.Throwable -> L179
            r14.zzM(r4, r7, r8)     // Catch: java.lang.Throwable -> L179
        L480:
            com.google.android.gms.measurement.internal.zzal r7 = r1.zzd()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzfw r8 = com.google.android.gms.measurement.internal.zzfx.zzaX     // Catch: java.lang.Throwable -> L179
            r15 = 0
            boolean r7 = r7.zzp(r15, r8)     // Catch: java.lang.Throwable -> L179
            if (r7 == 0) goto L4b1
            java.lang.String r7 = "am"
            boolean r7 = java.util.Objects.equals(r13, r7)     // Catch: java.lang.Throwable -> L179
            if (r7 == 0) goto L4b1
            java.lang.String r7 = "_ai"
            boolean r0 = java.util.Objects.equals(r0, r7)     // Catch: java.lang.Throwable -> L179
            if (r0 == 0) goto L4b1
            java.lang.Object r0 = r4.get(r3)     // Catch: java.lang.Throwable -> L179
            boolean r7 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L179
            if (r7 == 0) goto L4b1
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L4b1
            double r7 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L4b1
            r4.remove(r3)     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L4b1
            r4.putDouble(r3, r7)     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L4b1
        L4b1:
            com.google.android.gms.measurement.internal.zzav r3 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch: java.lang.Throwable -> L179
            r3.zzg()     // Catch: java.lang.Throwable -> L179
            r3.zzay()     // Catch: java.lang.Throwable -> L179
            android.database.sqlite.SQLiteDatabase r0 = r3.zze()     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L4e7
            com.google.android.gms.measurement.internal.zzib r7 = r3.zzu     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L4e7
            com.google.android.gms.measurement.internal.zzal r7 = r7.zzc()     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L4e7
            com.google.android.gms.measurement.internal.zzfw r8 = com.google.android.gms.measurement.internal.zzfx.zzp     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L4e7
            int r7 = r7.zzm(r10, r8)     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L4e7
            int r7 = java.lang.Math.min(r9, r7)     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L4e7
            int r7 = java.lang.Math.max(r5, r7)     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L4e7
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L4e7
            java.lang.String r8 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            java.lang.String[] r7 = new java.lang.String[]{r10, r7}     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L4e7
            int r0 = r0.delete(r6, r8, r7)     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> L4e7
            long r7 = (long) r0
            goto L4fd
        L4e7:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzib r3 = r3.zzu     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgt r3 = r3.zzaV()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgr r3 = r3.zzb()     // Catch: java.lang.Throwable -> L179
            java.lang.String r7 = "Error deleting over the limit events. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzgt.zzl(r10)     // Catch: java.lang.Throwable -> L179
            r3.zzc(r7, r8, r0)     // Catch: java.lang.Throwable -> L179
            r7 = r31
        L4fd:
            int r0 = (r7 > r31 ? 1 : (r7 == r31 ? 0 : -1))
            if (r0 <= 0) goto L516
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zze()     // Catch: java.lang.Throwable -> L179
            java.lang.String r3 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzgt.zzl(r10)     // Catch: java.lang.Throwable -> L179
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L179
            r0.zzc(r3, r9, r7)     // Catch: java.lang.Throwable -> L179
        L516:
            com.google.android.gms.measurement.internal.zzbb r8 = new com.google.android.gms.measurement.internal.zzbb     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzib r9 = r1.zzn     // Catch: java.lang.Throwable -> L179
            r3 = r10
            java.lang.String r10 = r11.zzc     // Catch: java.lang.Throwable -> L179
            r7 = r12
            java.lang.String r12 = r11.zza     // Catch: java.lang.Throwable -> L179
            long r13 = r11.zzd     // Catch: java.lang.Throwable -> L179
            r15 = 0
            r11 = r3
            r17 = r4
            r8.<init>(r9, r10, r11, r12, r13, r15, r17)     // Catch: java.lang.Throwable -> L179
            r0 = r8
            r10 = r11
            com.google.android.gms.measurement.internal.zzav r3 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            java.lang.String r4 = r0.zzb     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzbc r3 = r3.zzf(r10, r4)     // Catch: java.lang.Throwable -> L179
            if (r3 != 0) goto L5a7
            com.google.android.gms.measurement.internal.zzav r3 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            long r11 = r3.zzU(r10)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzal r3 = r1.zzd()     // Catch: java.lang.Throwable -> L179
            int r3 = r3.zzh(r10)     // Catch: java.lang.Throwable -> L179
            long r13 = (long) r3     // Catch: java.lang.Throwable -> L179
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 < 0) goto L58a
            if (r18 == 0) goto L58a
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()     // Catch: java.lang.Throwable -> L179
            java.lang.String r2 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgt.zzl(r10)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgm r5 = r9.zzl()     // Catch: java.lang.Throwable -> L179
            java.lang.String r4 = r5.zza(r4)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzal r5 = r1.zzd()     // Catch: java.lang.Throwable -> L179
            int r5 = r5.zzh(r10)     // Catch: java.lang.Throwable -> L179
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L179
            r0.zzd(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpo r8 = r1.zzt()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpn r9 = r1.zzK     // Catch: java.lang.Throwable -> L179
            r13 = 0
            r14 = 0
            r11 = 8
            r12 = 0
            r8.zzN(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L179
        L582:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            r0.zzd()
            return
        L58a:
            com.google.android.gms.measurement.internal.zzbc r8 = new com.google.android.gms.measurement.internal.zzbc     // Catch: java.lang.Throwable -> L179
            long r11 = r0.zzd     // Catch: java.lang.Throwable -> L179
            r23 = 0
            r24 = 0
            r17 = r11
            r11 = 0
            r13 = 0
            r15 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r9 = r10
            r10 = r4
            r8.<init>(r9, r10, r11, r13, r15, r17, r19, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L179
            r3 = r0
            goto L5b5
        L5a7:
            long r10 = r3.zzf     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzbb r8 = r0.zza(r9, r10)     // Catch: java.lang.Throwable -> L179
            long r9 = r8.zzd     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzbc r0 = r3.zza(r9)     // Catch: java.lang.Throwable -> L179
            r3 = r8
            r8 = r0
        L5b5:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            r0.zzh(r8)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzhy r0 = r1.zzaW()     // Catch: java.lang.Throwable -> L179
            r0.zzg()     // Catch: java.lang.Throwable -> L179
            r1.zzu()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L179
            java.lang.String r0 = r3.zza     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)     // Catch: java.lang.Throwable -> L179
            java.lang.String r4 = r2.zza     // Catch: java.lang.Throwable -> L179
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.internal.measurement.zzic r8 = com.google.android.gms.internal.measurement.zzid.zzaE()     // Catch: java.lang.Throwable -> L179
            r9 = 1
            r8.zza(r9)     // Catch: java.lang.Throwable -> L179
            java.lang.String r0 = "android"
            r8.zzC(r0)     // Catch: java.lang.Throwable -> L179
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L179
            if (r0 != 0) goto L5f0
            r8.zzL(r4)     // Catch: java.lang.Throwable -> L179
        L5f0:
            java.lang.String r0 = r2.zzd     // Catch: java.lang.Throwable -> L179
            boolean r10 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L179
            if (r10 != 0) goto L5fb
            r8.zzJ(r0)     // Catch: java.lang.Throwable -> L179
        L5fb:
            java.lang.String r0 = r2.zzc     // Catch: java.lang.Throwable -> L179
            boolean r10 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L179
            if (r10 != 0) goto L606
            r8.zzM(r0)     // Catch: java.lang.Throwable -> L179
        L606:
            java.lang.String r0 = r2.zzu     // Catch: java.lang.Throwable -> L179
            boolean r10 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L179
            if (r10 != 0) goto L611
            r8.zzau(r0)     // Catch: java.lang.Throwable -> L179
        L611:
            long r10 = r2.zzj     // Catch: java.lang.Throwable -> L179
            r12 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L61e
            int r0 = (int) r10     // Catch: java.lang.Throwable -> L179
            r8.zzaj(r0)     // Catch: java.lang.Throwable -> L179
        L61e:
            long r10 = r2.zze     // Catch: java.lang.Throwable -> L179
            r8.zzN(r10)     // Catch: java.lang.Throwable -> L179
            java.lang.String r0 = r2.zzb     // Catch: java.lang.Throwable -> L179
            boolean r10 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L179
            if (r10 != 0) goto L62e
            r8.zzad(r0)     // Catch: java.lang.Throwable -> L179
        L62e:
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L179
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzjk r0 = r1.zzB(r0)     // Catch: java.lang.Throwable -> L179
            java.lang.String r10 = r2.zzs     // Catch: java.lang.Throwable -> L179
            r11 = 100
            com.google.android.gms.measurement.internal.zzjk r10 = com.google.android.gms.measurement.internal.zzjk.zzf(r10, r11)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzjk r0 = r0.zzs(r10)     // Catch: java.lang.Throwable -> L179
            java.lang.String r10 = r0.zzk()     // Catch: java.lang.Throwable -> L179
            r8.zzat(r10)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.internal.measurement.zzql.zza()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzal r10 = r1.zzd()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzfw r12 = com.google.android.gms.measurement.internal.zzfx.zzaP     // Catch: java.lang.Throwable -> L179
            boolean r10 = r10.zzp(r4, r12)     // Catch: java.lang.Throwable -> L179
            if (r10 == 0) goto L6f7
            com.google.android.gms.measurement.internal.zzpo r10 = r1.zzt()     // Catch: java.lang.Throwable -> L179
            boolean r4 = r10.zzX(r4)     // Catch: java.lang.Throwable -> L179
            if (r4 == 0) goto L6f7
            int r4 = r2.zzz     // Catch: java.lang.Throwable -> L179
            r8.zzaH(r4)     // Catch: java.lang.Throwable -> L179
            long r12 = r2.zzA     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzjj r4 = com.google.android.gms.measurement.internal.zzjj.zza     // Catch: java.lang.Throwable -> L179
            boolean r0 = r0.zzo(r4)     // Catch: java.lang.Throwable -> L179
            r14 = 32
            if (r0 != 0) goto L67e
            int r0 = (r12 > r31 ? 1 : (r12 == r31 ? 0 : -1))
            if (r0 == 0) goto L67e
            r16 = -2
            long r12 = r12 & r16
            long r12 = r12 | r14
        L67e:
            int r0 = (r12 > r33 ? 1 : (r12 == r33 ? 0 : -1))
            if (r0 != 0) goto L684
            r0 = r9
            goto L685
        L684:
            r0 = r5
        L685:
            r8.zzaz(r0)     // Catch: java.lang.Throwable -> L179
            int r0 = (r12 > r31 ? 1 : (r12 == r31 ? 0 : -1))
            if (r0 != 0) goto L68e
            goto L6f7
        L68e:
            com.google.android.gms.internal.measurement.zzhd r0 = com.google.android.gms.internal.measurement.zzhe.zzh()     // Catch: java.lang.Throwable -> L179
            long r16 = r12 & r33
            int r4 = (r16 > r31 ? 1 : (r16 == r31 ? 0 : -1))
            if (r4 == 0) goto L69a
            r4 = r9
            goto L69b
        L69a:
            r4 = r5
        L69b:
            r0.zza(r4)     // Catch: java.lang.Throwable -> L179
            r16 = 2
            long r16 = r12 & r16
            int r4 = (r16 > r31 ? 1 : (r16 == r31 ? 0 : -1))
            if (r4 == 0) goto L6a8
            r4 = r9
            goto L6a9
        L6a8:
            r4 = r5
        L6a9:
            r0.zzb(r4)     // Catch: java.lang.Throwable -> L179
            r16 = 4
            long r16 = r12 & r16
            int r4 = (r16 > r31 ? 1 : (r16 == r31 ? 0 : -1))
            if (r4 == 0) goto L6b6
            r4 = r9
            goto L6b7
        L6b6:
            r4 = r5
        L6b7:
            r0.zzc(r4)     // Catch: java.lang.Throwable -> L179
            r16 = 8
            long r16 = r12 & r16
            int r4 = (r16 > r31 ? 1 : (r16 == r31 ? 0 : -1))
            if (r4 == 0) goto L6c4
            r4 = r9
            goto L6c5
        L6c4:
            r4 = r5
        L6c5:
            r0.zzd(r4)     // Catch: java.lang.Throwable -> L179
            r16 = 16
            long r16 = r12 & r16
            int r4 = (r16 > r31 ? 1 : (r16 == r31 ? 0 : -1))
            if (r4 == 0) goto L6d2
            r4 = r9
            goto L6d3
        L6d2:
            r4 = r5
        L6d3:
            r0.zze(r4)     // Catch: java.lang.Throwable -> L179
            long r14 = r14 & r12
            int r4 = (r14 > r31 ? 1 : (r14 == r31 ? 0 : -1))
            if (r4 == 0) goto L6dd
            r4 = r9
            goto L6de
        L6dd:
            r4 = r5
        L6de:
            r0.zzf(r4)     // Catch: java.lang.Throwable -> L179
            r14 = 64
            long r12 = r12 & r14
            int r4 = (r12 > r31 ? 1 : (r12 == r31 ? 0 : -1))
            if (r4 == 0) goto L6ea
            r13 = r9
            goto L6eb
        L6ea:
            r13 = r5
        L6eb:
            r0.zzg(r13)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.internal.measurement.zzme r0 = r0.zzbc()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.internal.measurement.zzhe r0 = (com.google.android.gms.internal.measurement.zzhe) r0     // Catch: java.lang.Throwable -> L179
            r8.zzaI(r0)     // Catch: java.lang.Throwable -> L179
        L6f7:
            long r12 = r2.zzf     // Catch: java.lang.Throwable -> L179
            int r0 = (r12 > r31 ? 1 : (r12 == r31 ? 0 : -1))
            if (r0 == 0) goto L700
            r8.zzY(r12)     // Catch: java.lang.Throwable -> L179
        L700:
            long r12 = r2.zzq     // Catch: java.lang.Throwable -> L179
            r8.zzar(r12)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpj r4 = r1.zzp()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpf r0 = r4.zzg     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzib r0 = r0.zzn     // Catch: java.lang.Throwable -> L179
            android.content.Context r0 = r0.zzaY()     // Catch: java.lang.Throwable -> L179
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L179
            java.lang.String r10 = "com.google.android.gms.measurement"
            android.net.Uri r10 = com.google.android.gms.internal.measurement.zzka.zza(r10)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzfu r12 = com.google.android.gms.measurement.internal.zzfu.zza     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.internal.measurement.zzjq r0 = com.google.android.gms.internal.measurement.zzjq.zza(r0, r10, r12)     // Catch: java.lang.Throwable -> L179
            if (r0 != 0) goto L726
            java.util.Map r0 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L179
            goto L72a
        L726:
            java.util.Map r0 = r0.zzb()     // Catch: java.lang.Throwable -> L179
        L72a:
            if (r0 == 0) goto L732
            boolean r10 = r0.isEmpty()     // Catch: java.lang.Throwable -> L179
            if (r10 == 0) goto L735
        L732:
            r10 = 0
            goto L7b2
        L735:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L179
            r10.<init>()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzfw r12 = com.google.android.gms.measurement.internal.zzfx.zzaf     // Catch: java.lang.Throwable -> L179
            r15 = 0
            java.lang.Object r12 = r12.zzb(r15)     // Catch: java.lang.Throwable -> L179
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> L179
            int r12 = r12.intValue()     // Catch: java.lang.Throwable -> L179
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L179
            java.util.Iterator r13 = r0.iterator()     // Catch: java.lang.Throwable -> L179
        L74f:
            boolean r0 = r13.hasNext()     // Catch: java.lang.Throwable -> L179
            if (r0 == 0) goto L7ab
            java.lang.Object r0 = r13.next()     // Catch: java.lang.Throwable -> L179
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L179
            java.lang.Object r14 = r0.getKey()     // Catch: java.lang.Throwable -> L179
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L179
            java.lang.String r15 = "measurement.id."
            boolean r14 = r14.startsWith(r15)     // Catch: java.lang.Throwable -> L179
            if (r14 == 0) goto L74f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L79a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L79a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L79a
            if (r0 == 0) goto L74f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L79a
            r10.add(r0)     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L79a
            int r0 = r10.size()     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L79a
            if (r0 < r12) goto L74f
            com.google.android.gms.measurement.internal.zzib r0 = r4.zzu     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L79a
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L79a
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zze()     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L79a
            java.lang.String r14 = "Too many experiment IDs. Number of IDs"
            int r15 = r10.size()     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L79a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L79a
            r0.zzb(r14, r15)     // Catch: java.lang.Throwable -> L179 java.lang.NumberFormatException -> L79a
            goto L7ab
        L79a:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzib r14 = r4.zzu     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgt r14 = r14.zzaV()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgr r14 = r14.zze()     // Catch: java.lang.Throwable -> L179
            java.lang.String r15 = "Experiment ID NumberFormatException"
            r14.zzb(r15, r0)     // Catch: java.lang.Throwable -> L179
            goto L74f
        L7ab:
            boolean r0 = r10.isEmpty()     // Catch: java.lang.Throwable -> L179
            if (r0 == 0) goto L7b2
            goto L732
        L7b2:
            if (r10 == 0) goto L7b7
            r8.zzaq(r10)     // Catch: java.lang.Throwable -> L179
        L7b7:
            com.google.android.gms.measurement.internal.zzal r0 = r1.zzd()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzfw r4 = com.google.android.gms.measurement.internal.zzfx.zzbb     // Catch: java.lang.Throwable -> L179
            r15 = 0
            boolean r0 = r0.zzp(r15, r4)     // Catch: java.lang.Throwable -> L179
            if (r0 == 0) goto L7c9
            java.lang.String r0 = ""
            r8.zzaP(r0)     // Catch: java.lang.Throwable -> L179
        L7c9:
            java.lang.String r0 = r2.zza     // Catch: java.lang.Throwable -> L179
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L179
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzjk r4 = r1.zzB(r4)     // Catch: java.lang.Throwable -> L179
            java.lang.String r10 = r2.zzs     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzjk r10 = com.google.android.gms.measurement.internal.zzjk.zzf(r10, r11)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzjk r4 = r4.zzs(r10)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzjj r10 = com.google.android.gms.measurement.internal.zzjj.zza     // Catch: java.lang.Throwable -> L179
            boolean r11 = r4.zzo(r10)     // Catch: java.lang.Throwable -> L179
            if (r11 == 0) goto L874
            boolean r11 = r2.zzn     // Catch: java.lang.Throwable -> L179
            if (r11 == 0) goto L874
            com.google.android.gms.measurement.internal.zznm r11 = r1.zzk     // Catch: java.lang.Throwable -> L179
            android.util.Pair r11 = r11.zzc(r0, r4)     // Catch: java.lang.Throwable -> L179
            java.lang.Object r12 = r11.first     // Catch: java.lang.Throwable -> L179
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch: java.lang.Throwable -> L179
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L179
            if (r12 != 0) goto L874
            java.lang.Object r12 = r11.first     // Catch: java.lang.Throwable -> L179
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L179
            r8.zzQ(r12)     // Catch: java.lang.Throwable -> L179
            java.lang.Object r12 = r11.second     // Catch: java.lang.Throwable -> L179
            if (r12 == 0) goto L80f
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L179
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L179
            r8.zzT(r12)     // Catch: java.lang.Throwable -> L179
        L80f:
            java.lang.String r12 = r3.zzb     // Catch: java.lang.Throwable -> L179
            r13 = r29
            boolean r12 = r12.equals(r13)     // Catch: java.lang.Throwable -> L179
            if (r12 != 0) goto L874
            java.lang.Object r11 = r11.first     // Catch: java.lang.Throwable -> L179
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L179
            java.lang.String r12 = "00000000-0000-0000-0000-000000000000"
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> L179
            if (r11 != 0) goto L874
            com.google.android.gms.measurement.internal.zzav r11 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzh r11 = r11.zzu(r0)     // Catch: java.lang.Throwable -> L179
            if (r11 == 0) goto L874
            boolean r12 = r11.zzaq()     // Catch: java.lang.Throwable -> L179
            if (r12 == 0) goto L874
            r15 = 0
            r1.zzR(r0, r5, r15, r15)     // Catch: java.lang.Throwable -> L179
            android.os.Bundle r12 = new android.os.Bundle     // Catch: java.lang.Throwable -> L179
            r12.<init>()     // Catch: java.lang.Throwable -> L179
            java.lang.Long r14 = r11.zzas()     // Catch: java.lang.Throwable -> L179
            if (r14 == 0) goto L857
            java.lang.String r15 = "_pfo"
            r16 = r6
            long r5 = r14.longValue()     // Catch: java.lang.Throwable -> L179
            r14 = r10
            r9 = r31
            long r5 = java.lang.Math.max(r9, r5)     // Catch: java.lang.Throwable -> L179
            r12.putLong(r15, r5)     // Catch: java.lang.Throwable -> L179
            goto L85a
        L857:
            r16 = r6
            r14 = r10
        L85a:
            java.lang.Long r5 = r11.zzau()     // Catch: java.lang.Throwable -> L179
            if (r5 == 0) goto L869
            java.lang.String r6 = "_uwa"
            long r9 = r5.longValue()     // Catch: java.lang.Throwable -> L179
            r12.putLong(r6, r9)     // Catch: java.lang.Throwable -> L179
        L869:
            r5 = r33
            r12.putLong(r7, r5)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpn r5 = r1.zzK     // Catch: java.lang.Throwable -> L179
            r5.zza(r0, r13, r12)     // Catch: java.lang.Throwable -> L179
            goto L877
        L874:
            r16 = r6
            r14 = r10
        L877:
            com.google.android.gms.measurement.internal.zzib r5 = r1.zzn     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzba r6 = r5.zzu()     // Catch: java.lang.Throwable -> L179
            r6.zzw()     // Catch: java.lang.Throwable -> L179
            java.lang.String r6 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L179
            r8.zzF(r6)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzba r6 = r5.zzu()     // Catch: java.lang.Throwable -> L179
            r6.zzw()     // Catch: java.lang.Throwable -> L179
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L179
            r8.zzE(r6)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzba r6 = r5.zzu()     // Catch: java.lang.Throwable -> L179
            long r9 = r6.zzb()     // Catch: java.lang.Throwable -> L179
            int r6 = (int) r9     // Catch: java.lang.Throwable -> L179
            r8.zzI(r6)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzba r6 = r5.zzu()     // Catch: java.lang.Throwable -> L179
            java.lang.String r6 = r6.zzc()     // Catch: java.lang.Throwable -> L179
            r8.zzH(r6)     // Catch: java.lang.Throwable -> L179
            long r9 = r2.zzw     // Catch: java.lang.Throwable -> L179
            r8.zzay(r9)     // Catch: java.lang.Throwable -> L179
            boolean r6 = r5.zzB()     // Catch: java.lang.Throwable -> L179
            if (r6 == 0) goto L8c0
            r8.zzK()     // Catch: java.lang.Throwable -> L179
            r15 = 0
            boolean r6 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> L179
            if (r6 != 0) goto L8c0
            r8.zzam(r15)     // Catch: java.lang.Throwable -> L179
        L8c0:
            com.google.android.gms.measurement.internal.zzav r6 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzh r6 = r6.zzu(r0)     // Catch: java.lang.Throwable -> L179
            if (r6 != 0) goto L928
            com.google.android.gms.measurement.internal.zzh r6 = new com.google.android.gms.measurement.internal.zzh     // Catch: java.lang.Throwable -> L179
            r6.<init>(r5, r0)     // Catch: java.lang.Throwable -> L179
            java.lang.String r5 = r1.zzK(r4)     // Catch: java.lang.Throwable -> L179
            r6.zze(r5)     // Catch: java.lang.Throwable -> L179
            java.lang.String r5 = r2.zzk     // Catch: java.lang.Throwable -> L179
            r6.zzm(r5)     // Catch: java.lang.Throwable -> L179
            java.lang.String r5 = r2.zzb     // Catch: java.lang.Throwable -> L179
            r6.zzg(r5)     // Catch: java.lang.Throwable -> L179
            boolean r5 = r4.zzo(r14)     // Catch: java.lang.Throwable -> L179
            if (r5 == 0) goto L8f1
            com.google.android.gms.measurement.internal.zznm r5 = r1.zzk     // Catch: java.lang.Throwable -> L179
            boolean r9 = r2.zzn     // Catch: java.lang.Throwable -> L179
            java.lang.String r5 = r5.zzf(r0, r9)     // Catch: java.lang.Throwable -> L179
            r6.zzk(r5)     // Catch: java.lang.Throwable -> L179
        L8f1:
            r9 = 0
            r6.zzF(r9)     // Catch: java.lang.Throwable -> L179
            r6.zzo(r9)     // Catch: java.lang.Throwable -> L179
            r6.zzq(r9)     // Catch: java.lang.Throwable -> L179
            java.lang.String r5 = r2.zzc     // Catch: java.lang.Throwable -> L179
            r6.zzs(r5)     // Catch: java.lang.Throwable -> L179
            long r9 = r2.zzj     // Catch: java.lang.Throwable -> L179
            r6.zzu(r9)     // Catch: java.lang.Throwable -> L179
            java.lang.String r5 = r2.zzd     // Catch: java.lang.Throwable -> L179
            r6.zzw(r5)     // Catch: java.lang.Throwable -> L179
            long r9 = r2.zze     // Catch: java.lang.Throwable -> L179
            r6.zzy(r9)     // Catch: java.lang.Throwable -> L179
            long r9 = r2.zzf     // Catch: java.lang.Throwable -> L179
            r6.zzA(r9)     // Catch: java.lang.Throwable -> L179
            boolean r5 = r2.zzh     // Catch: java.lang.Throwable -> L179
            r6.zzE(r5)     // Catch: java.lang.Throwable -> L179
            long r9 = r2.zzq     // Catch: java.lang.Throwable -> L179
            r6.zzC(r9)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzav r5 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            r9 = 0
            r5.zzv(r6, r9, r9)     // Catch: java.lang.Throwable -> L179
            goto L929
        L928:
            r9 = 0
        L929:
            com.google.android.gms.measurement.internal.zzjj r5 = com.google.android.gms.measurement.internal.zzjj.zzb     // Catch: java.lang.Throwable -> L179
            boolean r4 = r4.zzo(r5)     // Catch: java.lang.Throwable -> L179
            if (r4 == 0) goto L948
            java.lang.String r4 = r6.zzd()     // Catch: java.lang.Throwable -> L179
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L179
            if (r4 != 0) goto L948
            java.lang.String r4 = r6.zzd()     // Catch: java.lang.Throwable -> L179
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L179
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L179
            r8.zzW(r4)     // Catch: java.lang.Throwable -> L179
        L948:
            java.lang.String r4 = r6.zzl()     // Catch: java.lang.Throwable -> L179
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L179
            if (r4 != 0) goto L95f
            java.lang.String r4 = r6.zzl()     // Catch: java.lang.Throwable -> L179
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L179
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L179
            r8.zzah(r4)     // Catch: java.lang.Throwable -> L179
        L95f:
            com.google.android.gms.measurement.internal.zzav r4 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            java.util.List r0 = r4.zzn(r0)     // Catch: java.lang.Throwable -> L179
            r14 = r9
        L968:
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L179
            if (r14 >= r4) goto L9cc
            com.google.android.gms.internal.measurement.zzit r4 = com.google.android.gms.internal.measurement.zziu.zzm()     // Catch: java.lang.Throwable -> L179
            java.lang.Object r5 = r0.get(r14)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpm r5 = (com.google.android.gms.measurement.internal.zzpm) r5     // Catch: java.lang.Throwable -> L179
            java.lang.String r5 = r5.zzc     // Catch: java.lang.Throwable -> L179
            r4.zzb(r5)     // Catch: java.lang.Throwable -> L179
            java.lang.Object r5 = r0.get(r14)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpm r5 = (com.google.android.gms.measurement.internal.zzpm) r5     // Catch: java.lang.Throwable -> L179
            long r10 = r5.zzd     // Catch: java.lang.Throwable -> L179
            r4.zza(r10)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpj r5 = r1.zzp()     // Catch: java.lang.Throwable -> L179
            java.lang.Object r10 = r0.get(r14)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpm r10 = (com.google.android.gms.measurement.internal.zzpm) r10     // Catch: java.lang.Throwable -> L179
            java.lang.Object r10 = r10.zze     // Catch: java.lang.Throwable -> L179
            r5.zzc(r4, r10)     // Catch: java.lang.Throwable -> L179
            r8.zzp(r4)     // Catch: java.lang.Throwable -> L179
            java.lang.String r4 = "_sid"
            java.lang.Object r5 = r0.get(r14)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpm r5 = (com.google.android.gms.measurement.internal.zzpm) r5     // Catch: java.lang.Throwable -> L179
            java.lang.String r5 = r5.zzc     // Catch: java.lang.Throwable -> L179
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L179
            if (r4 == 0) goto L9c9
            long r4 = r6.zzam()     // Catch: java.lang.Throwable -> L179
            r31 = 0
            int r4 = (r4 > r31 ? 1 : (r4 == r31 ? 0 : -1))
            if (r4 == 0) goto L9c9
            com.google.android.gms.measurement.internal.zzpj r4 = r1.zzp()     // Catch: java.lang.Throwable -> L179
            java.lang.String r5 = r2.zzu     // Catch: java.lang.Throwable -> L179
            long r4 = r4.zzu(r5)     // Catch: java.lang.Throwable -> L179
            long r10 = r6.zzam()     // Catch: java.lang.Throwable -> L179
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L9c9
            r8.zzav()     // Catch: java.lang.Throwable -> L179
        L9c9:
            int r14 = r14 + 1
            goto L968
        L9cc:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            com.google.android.gms.internal.measurement.zzme r0 = r8.zzbc()     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            r4 = r0
            com.google.android.gms.internal.measurement.zzid r4 = (com.google.android.gms.internal.measurement.zzid) r4     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            r2.zzg()     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            r2.zzay()     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            java.lang.String r0 = r4.zzA()     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            byte[] r0 = r4.zzcc()     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            com.google.android.gms.measurement.internal.zzpf r5 = r2.zzg     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            com.google.android.gms.measurement.internal.zzpj r5 = r5.zzp()     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            long r5 = r5.zzt(r0)     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            r10.<init>()     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            java.lang.String r11 = r4.zzA()     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            r12 = r28
            r10.put(r12, r11)     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            java.lang.Long r11 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            r13 = r27
            r10.put(r13, r11)     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            java.lang.String r11 = "metadata"
            r10.put(r11, r0)     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            android.database.sqlite.SQLiteDatabase r0 = r2.zze()     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a android.database.sqlite.SQLiteException -> Lb0c
            java.lang.String r11 = "raw_events_metadata"
            r14 = 4
            r15 = 0
            r0.insertWithOnConflict(r11, r15, r10, r14)     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a android.database.sqlite.SQLiteException -> Lb0c
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzbe r0 = r3.zzf     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzbd r4 = new com.google.android.gms.measurement.internal.zzbd     // Catch: java.lang.Throwable -> L179
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L179
        La28:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L179
            if (r0 == 0) goto La3b
            java.lang.String r0 = r4.zza()     // Catch: java.lang.Throwable -> L179
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Throwable -> L179
            if (r0 == 0) goto La28
        La38:
            r30 = 1
            goto La7b
        La3b:
            com.google.android.gms.measurement.internal.zzhs r0 = r1.zzh()     // Catch: java.lang.Throwable -> L179
            java.lang.String r4 = r3.zza     // Catch: java.lang.Throwable -> L179
            java.lang.String r7 = r3.zzb     // Catch: java.lang.Throwable -> L179
            boolean r0 = r0.zzk(r4, r7)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzav r33 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            long r34 = r1.zzC()     // Catch: java.lang.Throwable -> L179
            r42 = 0
            r43 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r36 = r4
            com.google.android.gms.measurement.internal.zzar r4 = r33.zzw(r34, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch: java.lang.Throwable -> L179
            r7 = r36
            if (r0 == 0) goto La79
            long r10 = r4.zze     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzal r0 = r1.zzd()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzfw r4 = com.google.android.gms.measurement.internal.zzfx.zzo     // Catch: java.lang.Throwable -> L179
            int r0 = r0.zzm(r7, r4)     // Catch: java.lang.Throwable -> L179
            long r7 = (long) r0     // Catch: java.lang.Throwable -> L179
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 >= 0) goto La79
            goto La38
        La79:
            r30 = r9
        La7b:
            r2.zzg()     // Catch: java.lang.Throwable -> L179
            r2.zzay()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L179
            java.lang.String r0 = r3.zza     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpf r4 = r2.zzg     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzpj r4 = r4.zzp()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.internal.measurement.zzhs r4 = r4.zzh(r3)     // Catch: java.lang.Throwable -> L179
            byte[] r4 = r4.zzcc()     // Catch: java.lang.Throwable -> L179
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L179
            r7.<init>()     // Catch: java.lang.Throwable -> L179
            r7.put(r12, r0)     // Catch: java.lang.Throwable -> L179
            java.lang.String r8 = "name"
            java.lang.String r9 = r3.zzb     // Catch: java.lang.Throwable -> L179
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L179
            java.lang.String r8 = "timestamp"
            long r9 = r3.zzd     // Catch: java.lang.Throwable -> L179
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L179
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L179
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L179
            r7.put(r13, r5)     // Catch: java.lang.Throwable -> L179
            java.lang.String r5 = "data"
            r7.put(r5, r4)     // Catch: java.lang.Throwable -> L179
            java.lang.String r4 = "realtime"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r30)     // Catch: java.lang.Throwable -> L179
            r7.put(r4, r5)     // Catch: java.lang.Throwable -> L179
            android.database.sqlite.SQLiteDatabase r4 = r2.zze()     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> Laed
            r5 = r16
            r15 = 0
            long r4 = r4.insert(r5, r15, r7)     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> Laed
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto Laef
            com.google.android.gms.measurement.internal.zzib r4 = r2.zzu     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> Laed
            com.google.android.gms.measurement.internal.zzgt r4 = r4.zzaV()     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> Laed
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzb()     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> Laed
            java.lang.String r5 = "Failed to insert raw event (got -1). appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzgt.zzl(r0)     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> Laed
            r4.zzb(r5, r0)     // Catch: java.lang.Throwable -> L179 android.database.sqlite.SQLiteException -> Laed
            goto Lb3a
        Laed:
            r0 = move-exception
            goto Laf4
        Laef:
            r9 = 0
            r1.zza = r9     // Catch: java.lang.Throwable -> L179
            goto Lb3a
        Laf4:
            com.google.android.gms.measurement.internal.zzib r2 = r2.zzu     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgt r2 = r2.zzaV()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzb()     // Catch: java.lang.Throwable -> L179
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r3 = r3.zza     // Catch: java.lang.Throwable -> L179
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgt.zzl(r3)     // Catch: java.lang.Throwable -> L179
            r2.zzc(r4, r3, r0)     // Catch: java.lang.Throwable -> L179
            goto Lb3a
        Lb0a:
            r0 = move-exception
            goto Lb25
        Lb0c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzib r2 = r2.zzu     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            com.google.android.gms.measurement.internal.zzgt r2 = r2.zzaV()     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzb()     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            java.lang.String r3 = "Error storing raw event metadata. appId"
            java.lang.String r4 = r4.zzA()     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgt.zzl(r4)     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            r2.zzc(r3, r4, r0)     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
            throw r0     // Catch: java.lang.Throwable -> L179 java.io.IOException -> Lb0a
        Lb25:
            com.google.android.gms.measurement.internal.zzgt r2 = r1.zzaV()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzb()     // Catch: java.lang.Throwable -> L179
            java.lang.String r3 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r4 = r8.zzK()     // Catch: java.lang.Throwable -> L179
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgt.zzl(r4)     // Catch: java.lang.Throwable -> L179
            r2.zzc(r3, r4, r0)     // Catch: java.lang.Throwable -> L179
        Lb3a:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L179
            r0.zzc()     // Catch: java.lang.Throwable -> L179
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            r0.zzd()
            r1.zzaK()
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r25
            r4 = 500000(0x7a120, double:2.47033E-318)
            long r2 = r2 + r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Background event processing time, ms"
            r0.zzb(r3, r2)
            return
        Lb6b:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()
            r2.zzd()
            throw r0
    }

    @androidx.annotation.WorkerThread
    public final void zzI(com.google.android.gms.measurement.internal.zzh r12, com.google.android.gms.internal.measurement.zzic r13) {
            r11 = this;
            r0 = 1
            com.google.android.gms.measurement.internal.zzhy r1 = r11.zzaW()
            r1.zzg()
            r11.zzu()
            java.lang.String r1 = r13.zzaA()
            com.google.android.gms.measurement.internal.zzan r1 = com.google.android.gms.measurement.internal.zzan.zzd(r1)
            java.lang.String r2 = r12.zzc()
            com.google.android.gms.measurement.internal.zzhy r3 = r11.zzaW()
            r3.zzg()
            r11.zzu()
            com.google.android.gms.measurement.internal.zzjk r2 = r11.zzB(r2)
            com.google.android.gms.measurement.internal.zzjh r3 = com.google.android.gms.measurement.internal.zzjh.zza
            com.google.android.gms.measurement.internal.zzjh r3 = r2.zzp()
            int r3 = r3.ordinal()
            r4 = 3
            r5 = 2
            if (r3 == r0) goto L49
            if (r3 == r5) goto L3f
            if (r3 == r4) goto L3f
            com.google.android.gms.measurement.internal.zzjj r3 = com.google.android.gms.measurement.internal.zzjj.zza
            com.google.android.gms.measurement.internal.zzam r6 = com.google.android.gms.measurement.internal.zzam.zzj
            r1.zzc(r3, r6)
            goto L50
        L3f:
            com.google.android.gms.measurement.internal.zzjj r3 = com.google.android.gms.measurement.internal.zzjj.zza
            int r6 = r2.zzb()
            r1.zzb(r3, r6)
            goto L50
        L49:
            com.google.android.gms.measurement.internal.zzjj r3 = com.google.android.gms.measurement.internal.zzjj.zza
            com.google.android.gms.measurement.internal.zzam r6 = com.google.android.gms.measurement.internal.zzam.zzi
            r1.zzc(r3, r6)
        L50:
            com.google.android.gms.measurement.internal.zzjh r3 = r2.zzq()
            int r3 = r3.ordinal()
            if (r3 == r0) goto L70
            if (r3 == r5) goto L66
            if (r3 == r4) goto L66
            com.google.android.gms.measurement.internal.zzjj r2 = com.google.android.gms.measurement.internal.zzjj.zzb
            com.google.android.gms.measurement.internal.zzam r3 = com.google.android.gms.measurement.internal.zzam.zzj
            r1.zzc(r2, r3)
            goto L77
        L66:
            com.google.android.gms.measurement.internal.zzjj r3 = com.google.android.gms.measurement.internal.zzjj.zzb
            int r2 = r2.zzb()
            r1.zzb(r3, r2)
            goto L77
        L70:
            com.google.android.gms.measurement.internal.zzjj r2 = com.google.android.gms.measurement.internal.zzjj.zzb
            com.google.android.gms.measurement.internal.zzam r3 = com.google.android.gms.measurement.internal.zzam.zzi
            r1.zzc(r2, r3)
        L77:
            java.lang.String r2 = r12.zzc()
            com.google.android.gms.measurement.internal.zzhy r3 = r11.zzaW()
            r3.zzg()
            r11.zzu()
            com.google.android.gms.measurement.internal.zzaz r3 = r11.zzx(r2)
            com.google.android.gms.measurement.internal.zzjk r4 = r11.zzB(r2)
            com.google.android.gms.measurement.internal.zzaz r2 = r11.zzz(r2, r3, r4, r1)
            java.lang.Boolean r3 = r2.zzj()
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r13.zzaD(r3)
            java.lang.String r3 = r2.zzk()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto Lb3
            java.lang.String r2 = r2.zzk()
            r13.zzaF(r2)
        Lb3:
            com.google.android.gms.measurement.internal.zzhy r2 = r11.zzaW()
            r2.zzg()
            r11.zzu()
            java.util.List r2 = r13.zzk()
            java.util.Iterator r2 = r2.iterator()
        Lc5:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "_npa"
            if (r3 == 0) goto Lde
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zziu r3 = (com.google.android.gms.internal.measurement.zziu) r3
            java.lang.String r5 = r3.zzc()
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto Lc5
            goto Ldf
        Lde:
            r3 = 0
        Ldf:
            if (r3 == 0) goto L155
            com.google.android.gms.measurement.internal.zzjj r2 = com.google.android.gms.measurement.internal.zzjj.zzd
            com.google.android.gms.measurement.internal.zzam r5 = r1.zza(r2)
            com.google.android.gms.measurement.internal.zzam r6 = com.google.android.gms.measurement.internal.zzam.zza
            if (r5 == r6) goto Led
            goto L18f
        Led:
            com.google.android.gms.measurement.internal.zzav r5 = r11.zzj()
            java.lang.String r6 = r12.zzc()
            com.google.android.gms.measurement.internal.zzpm r4 = r5.zzm(r6, r4)
            if (r4 == 0) goto L122
            java.lang.String r3 = r4.zzb
            java.lang.String r4 = "tcf"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L10d
            com.google.android.gms.measurement.internal.zzam r3 = com.google.android.gms.measurement.internal.zzam.zzh
            r1.zzc(r2, r3)
            goto L18f
        L10d:
            java.lang.String r4 = "app"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L11c
            com.google.android.gms.measurement.internal.zzam r3 = com.google.android.gms.measurement.internal.zzam.zzf
            r1.zzc(r2, r3)
            goto L18f
        L11c:
            com.google.android.gms.measurement.internal.zzam r3 = com.google.android.gms.measurement.internal.zzam.zzd
            r1.zzc(r2, r3)
            goto L18f
        L122:
            java.lang.Boolean r4 = r12.zzae()
            if (r4 == 0) goto L14f
            boolean r5 = r4.booleanValue()
            if (r5 == 0) goto L138
            long r5 = r3.zzg()
            r7 = 1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L14f
        L138:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L149
            long r3 = r3.zzg()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L149
            goto L14f
        L149:
            com.google.android.gms.measurement.internal.zzam r3 = com.google.android.gms.measurement.internal.zzam.zzd
            r1.zzc(r2, r3)
            goto L18f
        L14f:
            com.google.android.gms.measurement.internal.zzam r3 = com.google.android.gms.measurement.internal.zzam.zzf
            r1.zzc(r2, r3)
            goto L18f
        L155:
            java.lang.String r2 = r12.zzc()
            int r2 = r11.zzaB(r2, r1)
            com.google.android.gms.internal.measurement.zzit r3 = com.google.android.gms.internal.measurement.zziu.zzm()
            r3.zzb(r4)
            com.google.android.gms.common.util.Clock r4 = r11.zzaZ()
            long r4 = r4.currentTimeMillis()
            r3.zza(r4)
            long r4 = (long) r2
            r3.zze(r4)
            com.google.android.gms.internal.measurement.zzme r3 = r3.zzbc()
            com.google.android.gms.internal.measurement.zziu r3 = (com.google.android.gms.internal.measurement.zziu) r3
            r13.zzo(r3)
            com.google.android.gms.measurement.internal.zzgt r3 = r11.zzaV()
            com.google.android.gms.measurement.internal.zzgr r3 = r3.zzk()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "Setting user property"
            java.lang.String r5 = "non_personalized_ads(_npa)"
            r3.zzc(r4, r5, r2)
        L18f:
            java.lang.String r1 = r1.toString()
            r13.zzaB(r1)
            com.google.android.gms.measurement.internal.zzhs r1 = r11.zzc
            java.lang.String r12 = r12.zzc()
            boolean r12 = r1.zzy(r12)
            java.util.List r1 = r13.zzb()
            r2 = 0
            r3 = r2
        L1a6:
            int r4 = r1.size()
            if (r3 >= r4) goto L234
            java.lang.Object r4 = r1.get(r3)
            com.google.android.gms.internal.measurement.zzhs r4 = (com.google.android.gms.internal.measurement.zzhs) r4
            java.lang.String r4 = r4.zzd()
            java.lang.String r5 = "_tcf"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L231
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.internal.measurement.zzhs r1 = (com.google.android.gms.internal.measurement.zzhs) r1
            com.google.android.gms.internal.measurement.zzma r1 = r1.zzcl()
            com.google.android.gms.internal.measurement.zzhr r1 = (com.google.android.gms.internal.measurement.zzhr) r1
            java.util.List r4 = r1.zza()
            r5 = r2
        L1cf:
            int r6 = r4.size()
            if (r5 >= r6) goto L22d
            java.lang.Object r6 = r4.get(r5)
            com.google.android.gms.internal.measurement.zzhw r6 = (com.google.android.gms.internal.measurement.zzhw) r6
            java.lang.String r6 = r6.zzb()
            java.lang.String r7 = "_tcfd"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L22b
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.internal.measurement.zzhw r4 = (com.google.android.gms.internal.measurement.zzhw) r4
            java.lang.String r4 = r4.zzd()
            if (r12 == 0) goto L21d
            int r12 = r4.length()
            r6 = 4
            if (r12 > r6) goto L1fb
            goto L21d
        L1fb:
            char[] r12 = r4.toCharArray()
            r4 = r0
        L200:
            r8 = 64
            java.lang.String r9 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_"
            if (r4 >= r8) goto L212
            char r8 = r12[r6]
            char r10 = r9.charAt(r4)
            if (r8 != r10) goto L210
            r2 = r4
            goto L212
        L210:
            int r4 = r4 + r0
            goto L200
        L212:
            r0 = r0 | r2
            char r0 = r9.charAt(r0)
            r12[r6] = r0
            java.lang.String r4 = java.lang.String.valueOf(r12)
        L21d:
            com.google.android.gms.internal.measurement.zzhv r12 = com.google.android.gms.internal.measurement.zzhw.zzn()
            r12.zzb(r7)
            r12.zzd(r4)
            r1.zze(r5, r12)
            goto L22d
        L22b:
            int r5 = r5 + r0
            goto L1cf
        L22d:
            r13.zzf(r3, r1)
            return
        L231:
            int r3 = r3 + r0
            goto L1a6
        L234:
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzJ(com.google.android.gms.measurement.internal.zzh r12, com.google.android.gms.internal.measurement.zzic r13) {
            r11 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r11.zzaW()
            r0.zzg()
            r11.zzu()
            com.google.android.gms.internal.measurement.zzgx r0 = com.google.android.gms.internal.measurement.zzha.zzr()
            byte[] r1 = r12.zzaJ()
            if (r1 == 0) goto L31
            com.google.android.gms.internal.measurement.zznk r1 = com.google.android.gms.measurement.internal.zzpj.zzw(r0, r1)     // Catch: com.google.android.gms.internal.measurement.zzmq -> L1c
            com.google.android.gms.internal.measurement.zzgx r1 = (com.google.android.gms.internal.measurement.zzgx) r1     // Catch: com.google.android.gms.internal.measurement.zzmq -> L1c
            r0 = r1
            goto L31
        L1c:
            com.google.android.gms.measurement.internal.zzgt r1 = r11.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zze()
            java.lang.String r2 = r12.zzc()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgt.zzl(r2)
            java.lang.String r3 = "Failed to parse locally stored ad campaign info. appId"
            r1.zzb(r3, r2)
        L31:
            java.util.List r1 = r13.zzb()
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L12c
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.zzhs r2 = (com.google.android.gms.internal.measurement.zzhs) r2
            java.lang.String r4 = r2.zzd()
            java.lang.String r5 = "_cmp"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L39
            java.lang.String r4 = "gclid"
            java.lang.String r5 = ""
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzpj.zzJ(r2, r4, r5)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r6 = "gbraid"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzpj.zzJ(r2, r6, r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "gad_source"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzpj.zzJ(r2, r7, r5)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.measurement.internal.zzfw r7 = com.google.android.gms.measurement.internal.zzfx.zzbh
            java.lang.Object r3 = r7.zzb(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r7 = ","
            java.lang.String[] r3 = r3.split(r7)
            r11.zzp()
            java.util.Map r3 = com.google.android.gms.measurement.internal.zzpj.zzG(r2, r3)
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L39
            r7 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            java.lang.String r9 = "click_timestamp"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzpj.zzJ(r2, r9, r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r9 = r3.longValue()
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 > 0) goto La1
            long r9 = r2.zzf()
        La1:
            java.lang.String r3 = "_cis"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzpj.zzI(r2, r3)
            java.lang.String r7 = "referrer API v2"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto Lee
            long r7 = r0.zzo()
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 <= 0) goto L39
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto Lc2
            r0.zzj()
            goto Lc5
        Lc2:
            r0.zzi(r4)
        Lc5:
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto Lcf
            r0.zzl()
            goto Ld2
        Lcf:
            r0.zzk(r6)
        Ld2:
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto Ldc
            r0.zzn()
            goto Ldf
        Ldc:
            r0.zzm(r5)
        Ldf:
            r0.zzp(r9)
            r0.zzs()
            java.util.Map r2 = r11.zzaC(r2)
            r0.zzt(r2)
            goto L39
        Lee:
            long r7 = r0.zzg()
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 <= 0) goto L39
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L100
            r0.zzb()
            goto L103
        L100:
            r0.zza(r4)
        L103:
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L10d
            r0.zzd()
            goto L110
        L10d:
            r0.zzc(r6)
        L110:
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L11a
            r0.zzf()
            goto L11d
        L11a:
            r0.zze(r5)
        L11d:
            r0.zzh(r9)
            r0.zzq()
            java.util.Map r2 = r11.zzaC(r2)
            r0.zzr(r2)
            goto L39
        L12c:
            com.google.android.gms.internal.measurement.zzme r1 = r0.zzbc()
            com.google.android.gms.internal.measurement.zzha r1 = (com.google.android.gms.internal.measurement.zzha) r1
            com.google.android.gms.internal.measurement.zzha r2 = com.google.android.gms.internal.measurement.zzha.zzs()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L145
            com.google.android.gms.internal.measurement.zzme r1 = r0.zzbc()
            com.google.android.gms.internal.measurement.zzha r1 = (com.google.android.gms.internal.measurement.zzha) r1
            r13.zzaM(r1)
        L145:
            com.google.android.gms.internal.measurement.zzme r13 = r0.zzbc()
            com.google.android.gms.internal.measurement.zzha r13 = (com.google.android.gms.internal.measurement.zzha) r13
            byte[] r13 = r13.zzcc()
            r12.zzaI(r13)
            boolean r13 = r12.zza()
            if (r13 == 0) goto L160
            com.google.android.gms.measurement.internal.zzav r13 = r11.zzj()
            r0 = 0
            r13.zzv(r12, r0, r0)
        L160:
            com.google.android.gms.measurement.internal.zzal r13 = r11.zzd()
            com.google.android.gms.measurement.internal.zzfw r0 = com.google.android.gms.measurement.internal.zzfx.zzbg
            boolean r13 = r13.zzp(r3, r0)
            if (r13 == 0) goto L179
            com.google.android.gms.measurement.internal.zzav r13 = r11.zzj()
            java.lang.String r12 = r12.zzc()
            java.lang.String r0 = "_lgclid"
            r13.zzk(r12, r0)
        L179:
            return
    }

    @androidx.annotation.WorkerThread
    public final java.lang.String zzK(com.google.android.gms.measurement.internal.zzjk r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzjj r0 = com.google.android.gms.measurement.internal.zzjj.zzb
            boolean r4 = r4.zzo(r0)
            if (r4 == 0) goto L2a
            r4 = 16
            byte[] r4 = new byte[r4]
            com.google.android.gms.measurement.internal.zzpo r0 = r3.zzt()
            java.security.SecureRandom r0 = r0.zzf()
            r0.nextBytes(r4)
            java.util.Locale r0 = java.util.Locale.US
            java.math.BigInteger r1 = new java.math.BigInteger
            r2 = 1
            r1.<init>(r2, r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            java.lang.String r1 = "%032x"
            java.lang.String r4 = java.lang.String.format(r0, r1, r4)
            return r4
        L2a:
            r4 = 0
            return r4
    }

    @androidx.annotation.VisibleForTesting
    public final void zzL(java.util.List r2) {
            r1 = this;
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            java.util.List r0 = r1.zzz
            if (r0 == 0) goto L1b
            com.google.android.gms.measurement.internal.zzgt r2 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzb()
            java.lang.String r0 = "Set uploading progress before finishing the previous upload"
            r2.zza(r0)
            return
        L1b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.zzz = r0
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzM() {
            r11 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r11.zzaW()
            r0.zzg()
            r11.zzu()
            r0 = 1
            r11.zzw = r0
            r0 = 0
            com.google.android.gms.measurement.internal.zzib r1 = r11.zzn     // Catch: java.lang.Throwable -> L2c
            r1.zzaU()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zznk r1 = r1.zzt()     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r1 = r1.zzJ()     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L2f
            com.google.android.gms.measurement.internal.zzgt r1 = r11.zzaV()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zze()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r1.zza(r2)     // Catch: java.lang.Throwable -> L2c
            goto L1ac
        L2c:
            r1 = move-exception
            goto L1b8
        L2f:
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L44
            com.google.android.gms.measurement.internal.zzgt r1 = r11.zzaV()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzb()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r1.zza(r2)     // Catch: java.lang.Throwable -> L2c
            goto L1ac
        L44:
            long r1 = r11.zza     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L51
            r11.zzaK()     // Catch: java.lang.Throwable -> L2c
            goto L1ac
        L51:
            com.google.android.gms.measurement.internal.zzhy r1 = r11.zzaW()     // Catch: java.lang.Throwable -> L2c
            r1.zzg()     // Catch: java.lang.Throwable -> L2c
            java.util.List r1 = r11.zzz     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L6b
            com.google.android.gms.measurement.internal.zzgt r1 = r11.zzaV()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "Uploading requested multiple times"
            r1.zza(r2)     // Catch: java.lang.Throwable -> L2c
            goto L1ac
        L6b:
            com.google.android.gms.measurement.internal.zzgy r1 = r11.zzi()     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r1.zzb()     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L87
            com.google.android.gms.measurement.internal.zzgt r1 = r11.zzaV()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r1.zza(r2)     // Catch: java.lang.Throwable -> L2c
            r11.zzaK()     // Catch: java.lang.Throwable -> L2c
            goto L1ac
        L87:
            com.google.android.gms.common.util.Clock r1 = r11.zzaZ()     // Catch: java.lang.Throwable -> L2c
            long r1 = r1.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzal r5 = r11.zzd()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzfw r6 = com.google.android.gms.measurement.internal.zzfx.zzai     // Catch: java.lang.Throwable -> L2c
            r7 = 0
            int r5 = r5.zzm(r7, r6)     // Catch: java.lang.Throwable -> L2c
            r11.zzd()     // Catch: java.lang.Throwable -> L2c
            long r8 = com.google.android.gms.measurement.internal.zzal.zzF()     // Catch: java.lang.Throwable -> L2c
            long r8 = r1 - r8
            r6 = r0
        La4:
            if (r6 >= r5) goto Laf
            boolean r10 = r11.zzaF(r7, r8)     // Catch: java.lang.Throwable -> L2c
            if (r10 == 0) goto Laf
            int r6 = r6 + 1
            goto La4
        Laf:
            com.google.android.gms.internal.measurement.zzql.zza()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzhy r5 = r11.zzaW()     // Catch: java.lang.Throwable -> L2c
            r5.zzg()     // Catch: java.lang.Throwable -> L2c
            r11.zzaE()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zznm r5 = r11.zzk     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzhd r5 = r5.zzd     // Catch: java.lang.Throwable -> L2c
            long r5 = r5.zza()     // Catch: java.lang.Throwable -> L2c
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto Ldf
            com.google.android.gms.measurement.internal.zzgt r3 = r11.zzaV()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgr r3 = r3.zzj()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L2c
            r3.zzb(r4, r5)     // Catch: java.lang.Throwable -> L2c
        Ldf:
            com.google.android.gms.measurement.internal.zzav r3 = r11.zzj()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r3.zzF()     // Catch: java.lang.Throwable -> L2c
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2c
            r5 = -1
            if (r4 != 0) goto L136
            long r8 = r11.zzB     // Catch: java.lang.Throwable -> L2c
            int r4 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r4 != 0) goto L131
            com.google.android.gms.measurement.internal.zzav r4 = r11.zzj()     // Catch: java.lang.Throwable -> L2c
            android.database.sqlite.SQLiteDatabase r8 = r4.zze()     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L115
            java.lang.String r9 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r7 = r8.rawQuery(r9, r7)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L115
            boolean r8 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L115
            if (r8 != 0) goto L10e
        L10a:
            r7.close()     // Catch: java.lang.Throwable -> L2c
            goto L128
        L10e:
            long r5 = r7.getLong(r0)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L115
            goto L10a
        L113:
            r1 = move-exception
            goto L12b
        L115:
            r8 = move-exception
            com.google.android.gms.measurement.internal.zzib r4 = r4.zzu     // Catch: java.lang.Throwable -> L113
            com.google.android.gms.measurement.internal.zzgt r4 = r4.zzaV()     // Catch: java.lang.Throwable -> L113
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzb()     // Catch: java.lang.Throwable -> L113
            java.lang.String r9 = "Error querying raw events"
            r4.zzb(r9, r8)     // Catch: java.lang.Throwable -> L113
            if (r7 == 0) goto L128
            goto L10a
        L128:
            r11.zzB = r5     // Catch: java.lang.Throwable -> L2c
            goto L131
        L12b:
            if (r7 == 0) goto L130
            r7.close()     // Catch: java.lang.Throwable -> L2c
        L130:
            throw r1     // Catch: java.lang.Throwable -> L2c
        L131:
            r11.zzN(r3, r1)     // Catch: java.lang.Throwable -> L2c
            goto L1ac
        L136:
            r11.zzB = r5     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzav r3 = r11.zzj()     // Catch: java.lang.Throwable -> L2c
            r11.zzd()     // Catch: java.lang.Throwable -> L2c
            long r4 = com.google.android.gms.measurement.internal.zzal.zzF()     // Catch: java.lang.Throwable -> L2c
            long r1 = r1 - r4
            r3.zzg()     // Catch: java.lang.Throwable -> L2c
            r3.zzay()     // Catch: java.lang.Throwable -> L2c
            android.database.sqlite.SQLiteDatabase r4 = r3.zze()     // Catch: java.lang.Throwable -> L181 android.database.sqlite.SQLiteException -> L184
            java.lang.String r5 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L181 android.database.sqlite.SQLiteException -> L184
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L181 android.database.sqlite.SQLiteException -> L184
            android.database.Cursor r1 = r4.rawQuery(r5, r1)     // Catch: java.lang.Throwable -> L181 android.database.sqlite.SQLiteException -> L184
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L176 android.database.sqlite.SQLiteException -> L178
            if (r2 != 0) goto L17a
            com.google.android.gms.measurement.internal.zzib r2 = r3.zzu     // Catch: java.lang.Throwable -> L176 android.database.sqlite.SQLiteException -> L178
            com.google.android.gms.measurement.internal.zzgt r2 = r2.zzaV()     // Catch: java.lang.Throwable -> L176 android.database.sqlite.SQLiteException -> L178
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzk()     // Catch: java.lang.Throwable -> L176 android.database.sqlite.SQLiteException -> L178
            java.lang.String r4 = "No expired configs for apps with pending events"
            r2.zza(r4)     // Catch: java.lang.Throwable -> L176 android.database.sqlite.SQLiteException -> L178
        L172:
            r1.close()     // Catch: java.lang.Throwable -> L2c
            goto L199
        L176:
            r2 = move-exception
            goto L17f
        L178:
            r2 = move-exception
            goto L187
        L17a:
            java.lang.String r7 = r1.getString(r0)     // Catch: java.lang.Throwable -> L176 android.database.sqlite.SQLiteException -> L178
            goto L172
        L17f:
            r7 = r1
            goto L1b2
        L181:
            r1 = move-exception
            r2 = r1
            goto L1b2
        L184:
            r1 = move-exception
            r2 = r1
            r1 = r7
        L187:
            com.google.android.gms.measurement.internal.zzib r3 = r3.zzu     // Catch: java.lang.Throwable -> L176
            com.google.android.gms.measurement.internal.zzgt r3 = r3.zzaV()     // Catch: java.lang.Throwable -> L176
            com.google.android.gms.measurement.internal.zzgr r3 = r3.zzb()     // Catch: java.lang.Throwable -> L176
            java.lang.String r4 = "Error selecting expired configs"
            r3.zzb(r4, r2)     // Catch: java.lang.Throwable -> L176
            if (r1 == 0) goto L199
            goto L172
        L199:
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L1ac
            com.google.android.gms.measurement.internal.zzav r1 = r11.zzj()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzh r1 = r1.zzu(r7)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L1ac
            r11.zzV(r1)     // Catch: java.lang.Throwable -> L2c
        L1ac:
            r11.zzw = r0
            r11.zzaL()
            return
        L1b2:
            if (r7 == 0) goto L1b7
            r7.close()     // Catch: java.lang.Throwable -> L2c
        L1b7:
            throw r2     // Catch: java.lang.Throwable -> L2c
        L1b8:
            r11.zzw = r0
            r11.zzaL()
            throw r1
    }

    @androidx.annotation.VisibleForTesting
    public final void zzN(java.lang.String r33, long r34) {
            r32 = this;
            r1 = r32
            r6 = r33
            r2 = r34
            java.lang.String r4 = "data"
            com.google.android.gms.measurement.internal.zzal r0 = r1.zzd()
            com.google.android.gms.measurement.internal.zzfw r5 = com.google.android.gms.measurement.internal.zzfx.zzg
            int r0 = r0.zzm(r6, r5)
            com.google.android.gms.measurement.internal.zzal r5 = r1.zzd()
            com.google.android.gms.measurement.internal.zzfw r7 = com.google.android.gms.measurement.internal.zzfx.zzh
            int r5 = r5.zzm(r6, r7)
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            com.google.android.gms.measurement.internal.zzav r8 = r1.zzj()
            r8.zzg()
            r8.zzay()
            r9 = 1
            if (r0 <= 0) goto L30
            r10 = r9
            goto L31
        L30:
            r10 = r7
        L31:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r10)
            if (r5 <= 0) goto L38
            r10 = r9
            goto L39
        L38:
            r10 = r7
        L39:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r10)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            android.database.sqlite.SQLiteDatabase r14 = r8.zze()     // Catch: java.lang.Throwable -> L20d android.database.sqlite.SQLiteException -> L211
            java.lang.String r15 = "queue"
            r23 = -1
            java.lang.String r10 = "rowid"
            java.lang.String r11 = "retry_count"
            java.lang.String[] r16 = new java.lang.String[]{r10, r4, r11}     // Catch: java.lang.Throwable -> L20d android.database.sqlite.SQLiteException -> L20f
            java.lang.String r17 = "app_id=?"
            java.lang.String[] r18 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L20d android.database.sqlite.SQLiteException -> L20f
            java.lang.String r21 = "rowid"
            java.lang.String r22 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L20d android.database.sqlite.SQLiteException -> L20f
            r19 = 0
            r20 = 0
            android.database.Cursor r10 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L20d android.database.sqlite.SQLiteException -> L20f
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            if (r0 != 0) goto L7f
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
        L6f:
            r10.close()
        L72:
            r11 = r0
            goto L232
        L75:
            r0 = move-exception
            r22 = r10
            goto L206
        L7a:
            r0 = move-exception
            r22 = r10
            goto L20a
        L7f:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            r11.<init>()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            r14 = r7
        L85:
            long r15 = r10.getLong(r7)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            byte[] r0 = r10.getBlob(r9)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1dd
            com.google.android.gms.measurement.internal.zzpf r9 = r8.zzg     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1dd
            com.google.android.gms.measurement.internal.zzpj r9 = r9.zzp()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1dd
            java.io.ByteArrayInputStream r13 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1b8
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1b8
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1b8
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1b8
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1b8
            r12.<init>()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1b8
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1b8
            r21 = r13
        La8:
            int r13 = r0.read(r7)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1b8
            if (r13 > 0) goto L1bc
            r0.close()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1b8
            r21.close()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1b8
            byte[] r0 = r12.toByteArray()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1b8
            boolean r7 = r11.isEmpty()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            if (r7 != 0) goto Lc6
            int r7 = r0.length     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            int r7 = r7 + r14
            if (r7 <= r5) goto Lc6
        Lc2:
            r22 = r10
            goto L202
        Lc6:
            com.google.android.gms.internal.measurement.zzic r7 = com.google.android.gms.internal.measurement.zzid.zzaE()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1a3
            com.google.android.gms.internal.measurement.zznk r7 = com.google.android.gms.measurement.internal.zzpj.zzw(r7, r0)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1a3
            com.google.android.gms.internal.measurement.zzic r7 = (com.google.android.gms.internal.measurement.zzic) r7     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a java.io.IOException -> L1a3
            boolean r9 = r11.isEmpty()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            if (r9 != 0) goto L17f
            r9 = 0
            java.lang.Object r12 = r11.get(r9)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            android.util.Pair r12 = (android.util.Pair) r12     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            java.lang.Object r9 = r12.first     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            com.google.android.gms.internal.measurement.zzid r9 = (com.google.android.gms.internal.measurement.zzid) r9     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            com.google.android.gms.internal.measurement.zzme r12 = r7.zzbc()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            com.google.android.gms.internal.measurement.zzid r12 = (com.google.android.gms.internal.measurement.zzid) r12     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r13 = r9.zzaf()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            r21 = r9
            java.lang.String r9 = r12.zzaf()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            boolean r9 = r13.equals(r9)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            if (r9 == 0) goto Lc2
            java.lang.String r9 = r21.zzam()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r13 = r12.zzam()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            boolean r9 = r9.equals(r13)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            if (r9 == 0) goto Lc2
            boolean r9 = r21.zzao()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            boolean r13 = r12.zzao()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            if (r9 != r13) goto Lc2
            java.lang.String r9 = r21.zzaq()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r13 = r12.zzaq()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            boolean r9 = r9.equals(r13)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            if (r9 == 0) goto Lc2
            java.util.List r9 = r21.zzf()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
        L125:
            boolean r13 = r9.hasNext()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            r21 = r9
            java.lang.String r9 = "_npa"
            if (r13 == 0) goto L14b
            java.lang.Object r13 = r21.next()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            com.google.android.gms.internal.measurement.zziu r13 = (com.google.android.gms.internal.measurement.zziu) r13     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            r22 = r12
            java.lang.String r12 = r13.zzc()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            boolean r12 = r9.equals(r12)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            if (r12 == 0) goto L146
            long r12 = r13.zzg()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            goto L14f
        L146:
            r9 = r21
            r12 = r22
            goto L125
        L14b:
            r22 = r12
            r12 = r23
        L14f:
            java.util.List r21 = r22.zzf()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            java.util.Iterator r21 = r21.iterator()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
        L157:
            boolean r22 = r21.hasNext()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            if (r22 == 0) goto L177
            java.lang.Object r22 = r21.next()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            com.google.android.gms.internal.measurement.zziu r22 = (com.google.android.gms.internal.measurement.zziu) r22     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            r25 = r12
            java.lang.String r12 = r22.zzc()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            boolean r12 = r9.equals(r12)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            if (r12 == 0) goto L174
            long r12 = r22.zzg()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            goto L17b
        L174:
            r12 = r25
            goto L157
        L177:
            r25 = r12
            r12 = r23
        L17b:
            int r9 = (r25 > r12 ? 1 : (r25 == r12 ? 0 : -1))
            if (r9 != 0) goto Lc2
        L17f:
            r9 = 2
            boolean r12 = r10.isNull(r9)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            if (r12 != 0) goto L18d
            int r12 = r10.getInt(r9)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            r7.zzao(r12)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
        L18d:
            int r0 = r0.length     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            int r14 = r14 + r0
            com.google.android.gms.internal.measurement.zzme r0 = r7.zzbc()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            com.google.android.gms.internal.measurement.zzid r0 = (com.google.android.gms.internal.measurement.zzid) r0     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            java.lang.Long r7 = java.lang.Long.valueOf(r15)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            android.util.Pair r0 = android.util.Pair.create(r0, r7)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            r11.add(r0)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
        L1a0:
            r22 = r10
            goto L1f3
        L1a3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzib r7 = r8.zzu     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            com.google.android.gms.measurement.internal.zzgt r7 = r7.zzaV()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            com.google.android.gms.measurement.internal.zzgr r7 = r7.zzb()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r9 = "Failed to merge queued bundle. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzgt.zzl(r6)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            r7.zzc(r9, r12, r0)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L7a
            goto L1a0
        L1b8:
            r0 = move-exception
            r22 = r10
            goto L1cb
        L1bc:
            r22 = r10
            r10 = 0
            r12.write(r7, r10, r13)     // Catch: java.lang.Throwable -> L1c6 android.database.sqlite.SQLiteException -> L1c8 java.io.IOException -> L1ca
            r10 = r22
            goto La8
        L1c6:
            r0 = move-exception
            goto L206
        L1c8:
            r0 = move-exception
            goto L20a
        L1ca:
            r0 = move-exception
        L1cb:
            com.google.android.gms.measurement.internal.zzib r7 = r9.zzu     // Catch: java.lang.Throwable -> L1c6 android.database.sqlite.SQLiteException -> L1c8 java.io.IOException -> L1db
            com.google.android.gms.measurement.internal.zzgt r7 = r7.zzaV()     // Catch: java.lang.Throwable -> L1c6 android.database.sqlite.SQLiteException -> L1c8 java.io.IOException -> L1db
            com.google.android.gms.measurement.internal.zzgr r7 = r7.zzb()     // Catch: java.lang.Throwable -> L1c6 android.database.sqlite.SQLiteException -> L1c8 java.io.IOException -> L1db
            java.lang.String r9 = "Failed to ungzip content"
            r7.zzb(r9, r0)     // Catch: java.lang.Throwable -> L1c6 android.database.sqlite.SQLiteException -> L1c8 java.io.IOException -> L1db
            throw r0     // Catch: java.lang.Throwable -> L1c6 android.database.sqlite.SQLiteException -> L1c8 java.io.IOException -> L1db
        L1db:
            r0 = move-exception
            goto L1e0
        L1dd:
            r0 = move-exception
            r22 = r10
        L1e0:
            com.google.android.gms.measurement.internal.zzib r7 = r8.zzu     // Catch: java.lang.Throwable -> L1c6 android.database.sqlite.SQLiteException -> L1c8
            com.google.android.gms.measurement.internal.zzgt r7 = r7.zzaV()     // Catch: java.lang.Throwable -> L1c6 android.database.sqlite.SQLiteException -> L1c8
            com.google.android.gms.measurement.internal.zzgr r7 = r7.zzb()     // Catch: java.lang.Throwable -> L1c6 android.database.sqlite.SQLiteException -> L1c8
            java.lang.String r9 = "Failed to unzip queued bundle. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzgt.zzl(r6)     // Catch: java.lang.Throwable -> L1c6 android.database.sqlite.SQLiteException -> L1c8
            r7.zzc(r9, r10, r0)     // Catch: java.lang.Throwable -> L1c6 android.database.sqlite.SQLiteException -> L1c8
        L1f3:
            boolean r0 = r22.moveToNext()     // Catch: java.lang.Throwable -> L1c6 android.database.sqlite.SQLiteException -> L1c8
            if (r0 == 0) goto L202
            if (r14 <= r5) goto L1fc
            goto L202
        L1fc:
            r10 = r22
            r7 = 0
            r9 = 1
            goto L85
        L202:
            r22.close()
            goto L232
        L206:
            r13 = r22
            goto La0f
        L20a:
            r10 = r22
            goto L219
        L20d:
            r0 = move-exception
            goto L215
        L20f:
            r0 = move-exception
            goto L218
        L211:
            r0 = move-exception
            r23 = -1
            goto L218
        L215:
            r13 = 0
            goto La0f
        L218:
            r10 = 0
        L219:
            com.google.android.gms.measurement.internal.zzib r5 = r8.zzu     // Catch: java.lang.Throwable -> La0d
            com.google.android.gms.measurement.internal.zzgt r5 = r5.zzaV()     // Catch: java.lang.Throwable -> La0d
            com.google.android.gms.measurement.internal.zzgr r5 = r5.zzb()     // Catch: java.lang.Throwable -> La0d
            java.lang.String r7 = "Error querying bundles. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzgt.zzl(r6)     // Catch: java.lang.Throwable -> La0d
            r5.zzc(r7, r8, r0)     // Catch: java.lang.Throwable -> La0d
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> La0d
            if (r10 == 0) goto L72
            goto L6f
        L232:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L23a
            goto La0c
        L23a:
            com.google.android.gms.internal.measurement.zzpk.zza()
            com.google.android.gms.measurement.internal.zzal r0 = r1.zzd()
            com.google.android.gms.measurement.internal.zzfw r5 = com.google.android.gms.measurement.internal.zzfx.zzbi
            r7 = 0
            boolean r0 = r0.zzp(r7, r5)
            java.lang.String r8 = "_f"
            if (r0 == 0) goto L56f
            com.google.android.gms.internal.measurement.zzpk.zza()
            com.google.android.gms.measurement.internal.zzal r0 = r1.zzd()
            boolean r0 = r0.zzp(r7, r5)
            if (r0 == 0) goto L566
            com.google.android.gms.measurement.internal.zzjk r0 = r32.zzB(r33)
            com.google.android.gms.measurement.internal.zzjj r5 = com.google.android.gms.measurement.internal.zzjj.zzb
            boolean r0 = r0.zzo(r5)
            java.lang.String r5 = "no_data_mode_events"
            if (r0 != 0) goto L384
            com.google.android.gms.measurement.internal.zzhs r0 = r1.zzh()
            boolean r0 = r0.zzB(r6)
            if (r0 == 0) goto L384
            com.google.android.gms.measurement.internal.zzfw r0 = com.google.android.gms.measurement.internal.zzfx.zzbj
            java.lang.Object r0 = r0.zzb(r7)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = ","
            java.lang.String[] r0 = r0.split(r7)
            java.util.List r7 = java.util.Arrays.asList(r0)
            java.util.Iterator r9 = r11.iterator()
        L287:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L380
            java.lang.Object r0 = r9.next()
            android.util.Pair r0 = (android.util.Pair) r0
            com.google.android.gms.measurement.internal.zzav r10 = r1.zzj()     // Catch: android.database.sqlite.SQLiteException -> L371
            java.lang.Object r11 = r0.second     // Catch: android.database.sqlite.SQLiteException -> L371
            java.lang.Long r11 = (java.lang.Long) r11     // Catch: android.database.sqlite.SQLiteException -> L371
            long r11 = r11.longValue()     // Catch: android.database.sqlite.SQLiteException -> L371
            r10.zzH(r11)     // Catch: android.database.sqlite.SQLiteException -> L371
            java.lang.Object r0 = r0.first     // Catch: android.database.sqlite.SQLiteException -> L371
            com.google.android.gms.internal.measurement.zzid r0 = (com.google.android.gms.internal.measurement.zzid) r0     // Catch: android.database.sqlite.SQLiteException -> L371
            java.util.List r0 = r0.zzc()     // Catch: android.database.sqlite.SQLiteException -> L371
            java.util.Iterator r10 = r0.iterator()     // Catch: android.database.sqlite.SQLiteException -> L371
        L2ae:
            boolean r0 = r10.hasNext()     // Catch: android.database.sqlite.SQLiteException -> L371
            if (r0 == 0) goto L287
            java.lang.Object r0 = r10.next()     // Catch: android.database.sqlite.SQLiteException -> L371
            com.google.android.gms.internal.measurement.zzhs r0 = (com.google.android.gms.internal.measurement.zzhs) r0     // Catch: android.database.sqlite.SQLiteException -> L371
            java.lang.String r11 = r0.zzd()     // Catch: android.database.sqlite.SQLiteException -> L371
            boolean r11 = r7.contains(r11)     // Catch: android.database.sqlite.SQLiteException -> L371
            if (r11 == 0) goto L2ae
            java.lang.String r11 = r0.zzd()     // Catch: android.database.sqlite.SQLiteException -> L371
            boolean r11 = r11.equals(r8)     // Catch: android.database.sqlite.SQLiteException -> L371
            if (r11 != 0) goto L2da
            java.lang.String r11 = r0.zzd()     // Catch: android.database.sqlite.SQLiteException -> L371
            java.lang.String r12 = "_v"
            boolean r11 = r11.equals(r12)     // Catch: android.database.sqlite.SQLiteException -> L371
            if (r11 == 0) goto L2f4
        L2da:
            com.google.android.gms.internal.measurement.zzma r0 = r0.zzcl()     // Catch: android.database.sqlite.SQLiteException -> L371
            com.google.android.gms.internal.measurement.zzhr r0 = (com.google.android.gms.internal.measurement.zzhr) r0     // Catch: android.database.sqlite.SQLiteException -> L371
            r1.zzp()     // Catch: android.database.sqlite.SQLiteException -> L371
            java.lang.String r11 = "_dac"
            r12 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch: android.database.sqlite.SQLiteException -> L371
            com.google.android.gms.measurement.internal.zzpj.zzC(r0, r11, r12)     // Catch: android.database.sqlite.SQLiteException -> L371
            com.google.android.gms.internal.measurement.zzme r0 = r0.zzbc()     // Catch: android.database.sqlite.SQLiteException -> L371
            com.google.android.gms.internal.measurement.zzhs r0 = (com.google.android.gms.internal.measurement.zzhs) r0     // Catch: android.database.sqlite.SQLiteException -> L371
        L2f4:
            com.google.android.gms.measurement.internal.zzav r11 = r1.zzj()     // Catch: android.database.sqlite.SQLiteException -> L371
            r11.zzg()     // Catch: android.database.sqlite.SQLiteException -> L371
            r11.zzay()     // Catch: android.database.sqlite.SQLiteException -> L371
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: android.database.sqlite.SQLiteException -> L371
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)     // Catch: android.database.sqlite.SQLiteException -> L371
            com.google.android.gms.measurement.internal.zzib r12 = r11.zzu     // Catch: android.database.sqlite.SQLiteException -> L371
            com.google.android.gms.measurement.internal.zzgt r13 = r12.zzaV()     // Catch: android.database.sqlite.SQLiteException -> L371
            com.google.android.gms.measurement.internal.zzgr r13 = r13.zzk()     // Catch: android.database.sqlite.SQLiteException -> L371
            java.lang.String r14 = "Caching events in NO_DATA mode"
            r13.zzb(r14, r0)     // Catch: android.database.sqlite.SQLiteException -> L371
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch: android.database.sqlite.SQLiteException -> L371
            r13.<init>()     // Catch: android.database.sqlite.SQLiteException -> L371
            java.lang.String r14 = "app_id"
            r13.put(r14, r6)     // Catch: android.database.sqlite.SQLiteException -> L371
            java.lang.String r14 = "name"
            java.lang.String r15 = r0.zzd()     // Catch: android.database.sqlite.SQLiteException -> L371
            r13.put(r14, r15)     // Catch: android.database.sqlite.SQLiteException -> L371
            byte[] r14 = r0.zzcc()     // Catch: android.database.sqlite.SQLiteException -> L371
            r13.put(r4, r14)     // Catch: android.database.sqlite.SQLiteException -> L371
            java.lang.String r14 = "timestamp_millis"
            long r15 = r0.zzf()     // Catch: android.database.sqlite.SQLiteException -> L371
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch: android.database.sqlite.SQLiteException -> L371
            r13.put(r14, r0)     // Catch: android.database.sqlite.SQLiteException -> L371
            android.database.sqlite.SQLiteDatabase r0 = r11.zze()     // Catch: android.database.sqlite.SQLiteException -> L35b
            r14 = 0
            long r15 = r0.insert(r5, r14, r13)     // Catch: android.database.sqlite.SQLiteException -> L35b
            int r0 = (r15 > r23 ? 1 : (r15 == r23 ? 0 : -1))
            if (r0 != 0) goto L2ae
            com.google.android.gms.measurement.internal.zzgt r0 = r12.zzaV()     // Catch: android.database.sqlite.SQLiteException -> L35b
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()     // Catch: android.database.sqlite.SQLiteException -> L35b
            java.lang.String r12 = "Failed to insert NO_DATA mode event (got -1). appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzgt.zzl(r6)     // Catch: android.database.sqlite.SQLiteException -> L35b
            r0.zzb(r12, r13)     // Catch: android.database.sqlite.SQLiteException -> L35b
            goto L2ae
        L35b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzib r11 = r11.zzu     // Catch: android.database.sqlite.SQLiteException -> L371
            com.google.android.gms.measurement.internal.zzgt r11 = r11.zzaV()     // Catch: android.database.sqlite.SQLiteException -> L371
            com.google.android.gms.measurement.internal.zzgr r11 = r11.zzb()     // Catch: android.database.sqlite.SQLiteException -> L371
            java.lang.String r12 = "Error storing NO_DATA mode event. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzgt.zzl(r6)     // Catch: android.database.sqlite.SQLiteException -> L371
            r11.zzc(r12, r13, r0)     // Catch: android.database.sqlite.SQLiteException -> L371
            goto L2ae
        L371:
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzh()
            java.lang.String r10 = "Failed handling NO_DATA mode bundles. appId"
            r0.zzb(r10, r6)
            goto L287
        L380:
            java.util.List r11 = java.util.Collections.EMPTY_LIST
            goto L568
        L384:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r11.size()
            r7.<init>(r0)
            com.google.android.gms.measurement.internal.zzav r9 = r1.zzj()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            r9.zzg()
            r9.zzay()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r12 = " NO_DATA mode events. appId"
            java.lang.String r13 = "Pruned "
            android.database.sqlite.SQLiteDatabase r21 = r9.zze()     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L46c
            com.google.android.gms.measurement.internal.zzib r0 = r9.zzu     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L46c
            com.google.android.gms.common.util.Clock r0 = r0.zzaZ()     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L46c
            long r14 = r0.currentTimeMillis()     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L46c
            java.lang.String r22 = "no_data_mode_events"
            java.lang.String[] r23 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L46c
            java.lang.String r24 = "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)"
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L46c
            java.lang.String[] r25 = new java.lang.String[]{r6, r0}     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L46c
            java.lang.String r28 = "rowid"
            r29 = 0
            r26 = 0
            r27 = 0
            android.database.Cursor r4 = r21.query(r22, r23, r24, r25, r26, r27, r28, r29)     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L46c
            r16 = r11
            r11 = r21
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L3f5 android.database.sqlite.SQLiteException -> L3fa
            if (r0 == 0) goto L462
            r21 = r14
        L3da:
            r14 = 0
            byte[] r0 = r4.getBlob(r14)     // Catch: java.lang.Throwable -> L3f5 android.database.sqlite.SQLiteException -> L3fa com.google.android.gms.internal.measurement.zzmq -> L3ff
            com.google.android.gms.internal.measurement.zzhr r14 = com.google.android.gms.internal.measurement.zzhs.zzk()     // Catch: java.lang.Throwable -> L3f5 android.database.sqlite.SQLiteException -> L3fa com.google.android.gms.internal.measurement.zzmq -> L3ff
            com.google.android.gms.internal.measurement.zznk r0 = com.google.android.gms.measurement.internal.zzpj.zzw(r14, r0)     // Catch: java.lang.Throwable -> L3f5 android.database.sqlite.SQLiteException -> L3fa com.google.android.gms.internal.measurement.zzmq -> L3ff
            com.google.android.gms.internal.measurement.zzhr r0 = (com.google.android.gms.internal.measurement.zzhr) r0     // Catch: java.lang.Throwable -> L3f5 android.database.sqlite.SQLiteException -> L3fa com.google.android.gms.internal.measurement.zzmq -> L3ff
            com.google.android.gms.internal.measurement.zzme r0 = r0.zzbc()     // Catch: java.lang.Throwable -> L3f5 android.database.sqlite.SQLiteException -> L3fa com.google.android.gms.internal.measurement.zzmq -> L3ff
            com.google.android.gms.internal.measurement.zzhs r0 = (com.google.android.gms.internal.measurement.zzhs) r0     // Catch: java.lang.Throwable -> L3f5 android.database.sqlite.SQLiteException -> L3fa com.google.android.gms.internal.measurement.zzmq -> L3ff
            r10.add(r0)     // Catch: java.lang.Throwable -> L3f5 android.database.sqlite.SQLiteException -> L3fa com.google.android.gms.internal.measurement.zzmq -> L3ff
            r23 = r4
            goto L415
        L3f5:
            r0 = move-exception
            r23 = r4
            goto L468
        L3fa:
            r0 = move-exception
            r23 = r4
            goto L475
        L3ff:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzib r14 = r9.zzu     // Catch: java.lang.Throwable -> L3f5 android.database.sqlite.SQLiteException -> L3fa
            com.google.android.gms.measurement.internal.zzgt r14 = r14.zzaV()     // Catch: java.lang.Throwable -> L3f5 android.database.sqlite.SQLiteException -> L3fa
            com.google.android.gms.measurement.internal.zzgr r14 = r14.zzh()     // Catch: java.lang.Throwable -> L3f5 android.database.sqlite.SQLiteException -> L3fa
            java.lang.String r15 = "Failed to parse stored NO_DATA mode event, appId"
            r23 = r4
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgt.zzl(r6)     // Catch: java.lang.Throwable -> L45a android.database.sqlite.SQLiteException -> L45c
            r14.zzc(r15, r4, r0)     // Catch: java.lang.Throwable -> L45a android.database.sqlite.SQLiteException -> L45c
        L415:
            boolean r0 = r23.moveToNext()     // Catch: java.lang.Throwable -> L45a android.database.sqlite.SQLiteException -> L45c
            if (r0 != 0) goto L45e
            r23.close()     // Catch: java.lang.Throwable -> L45a android.database.sqlite.SQLiteException -> L45c
            java.lang.String r0 = "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)"
            java.lang.String r4 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            java.lang.String[] r4 = new java.lang.String[]{r6, r4}     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            int r0 = r11.delete(r5, r0, r4)     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            com.google.android.gms.measurement.internal.zzib r4 = r9.zzu     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            com.google.android.gms.measurement.internal.zzgt r4 = r4.zzaV()     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzk()     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            int r5 = r5 + 34
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            r11.<init>(r5)     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            r11.append(r13)     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            r11.append(r0)     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            r11.append(r12)     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            r4.zzb(r0, r6)     // Catch: java.lang.Throwable -> L456 android.database.sqlite.SQLiteException -> L458
            goto L48d
        L456:
            r0 = move-exception
            goto L470
        L458:
            r0 = move-exception
            goto L473
        L45a:
            r0 = move-exception
            goto L468
        L45c:
            r0 = move-exception
            goto L475
        L45e:
            r4 = r23
            goto L3da
        L462:
            r23 = r4
        L464:
            r23.close()
            goto L48d
        L468:
            r13 = r23
            goto L560
        L46c:
            r0 = move-exception
            r16 = r11
            goto L473
        L470:
            r13 = 0
            goto L560
        L473:
            r23 = 0
        L475:
            com.google.android.gms.measurement.internal.zzib r4 = r9.zzu     // Catch: java.lang.Throwable -> L45a
            com.google.android.gms.measurement.internal.zzgt r4 = r4.zzaV()     // Catch: java.lang.Throwable -> L45a
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzb()     // Catch: java.lang.Throwable -> L45a
            java.lang.String r5 = "Error flushing NO_DATA mode events. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzgt.zzl(r6)     // Catch: java.lang.Throwable -> L45a
            r4.zzc(r5, r9, r0)     // Catch: java.lang.Throwable -> L45a
            java.util.List r10 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L45a
            if (r23 == 0) goto L48d
            goto L464
        L48d:
            java.util.Iterator r0 = r16.iterator()
            r4 = 1
        L492:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L55e
            java.lang.Object r5 = r0.next()
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r9 = r5.first
            com.google.android.gms.internal.measurement.zzid r9 = (com.google.android.gms.internal.measurement.zzid) r9
            com.google.android.gms.internal.measurement.zzma r9 = r9.zzcl()
            com.google.android.gms.internal.measurement.zzic r9 = (com.google.android.gms.internal.measurement.zzic) r9
            if (r4 == 0) goto L4be
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L4be
            java.util.List r4 = r9.zzb()
            r9.zzi()
            r9.zzh(r10)
            r9.zzh(r4)
            r4 = 0
        L4be:
            com.google.android.gms.internal.measurement.zzhh r11 = com.google.android.gms.internal.measurement.zzho.zzb()
            com.google.android.gms.measurement.internal.zzhs r12 = r1.zzh()
            com.google.android.gms.internal.measurement.zzgf r12 = r12.zzx(r6)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            if (r12 != 0) goto L4d9
        L4d1:
            r21 = r0
            r16 = r4
            r23 = r10
            goto L53f
        L4d9:
            java.util.List r12 = r12.zza()
            java.util.Iterator r12 = r12.iterator()
        L4e1:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L4d1
            java.lang.Object r14 = r12.next()
            com.google.android.gms.internal.measurement.zzfu r14 = (com.google.android.gms.internal.measurement.zzfu) r14
            com.google.android.gms.internal.measurement.zzhk r15 = com.google.android.gms.internal.measurement.zzhl.zza()
            int r16 = r14.zzb()
            com.google.android.gms.measurement.internal.zzjh r21 = com.google.android.gms.measurement.internal.zzjh.zza
            r21 = r0
            int r0 = r16 + (-1)
            r16 = r4
            r4 = 1
            if (r0 == r4) goto L516
            r4 = 2
            if (r0 == r4) goto L511
            r4 = 4
            r23 = r10
            r10 = 3
            if (r0 == r10) goto L50f
            if (r0 == r4) goto L50d
            r0 = 1
            goto L51a
        L50d:
            r0 = 5
            goto L51a
        L50f:
            r0 = r4
            goto L51a
        L511:
            r23 = r10
            r10 = 3
            r0 = r10
            goto L51a
        L516:
            r23 = r10
            r10 = 3
            r0 = 2
        L51a:
            r15.zza(r0)
            int r0 = r14.zzd()
            int r0 = r0 + (-1)
            r4 = 1
            if (r0 == r4) goto L52b
            r4 = 2
            if (r0 == r4) goto L52c
            r10 = 1
            goto L52c
        L52b:
            r10 = 2
        L52c:
            r15.zzb(r10)
            com.google.android.gms.internal.measurement.zzme r0 = r15.zzbc()
            com.google.android.gms.internal.measurement.zzhl r0 = (com.google.android.gms.internal.measurement.zzhl) r0
            r13.add(r0)
            r4 = r16
            r0 = r21
            r10 = r23
            goto L4e1
        L53f:
            r11.zza(r13)
            r9.zzaQ(r11)
            com.google.android.gms.internal.measurement.zzme r0 = r9.zzbc()
            com.google.android.gms.internal.measurement.zzid r0 = (com.google.android.gms.internal.measurement.zzid) r0
            java.lang.Object r4 = r5.second
            java.lang.Long r4 = (java.lang.Long) r4
            android.util.Pair r0 = android.util.Pair.create(r0, r4)
            r7.add(r0)
            r4 = r16
            r0 = r21
            r10 = r23
            goto L492
        L55e:
            r11 = r7
            goto L568
        L560:
            if (r13 == 0) goto L565
            r13.close()
        L565:
            throw r0
        L566:
            r16 = r11
        L568:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto La0c
            goto L571
        L56f:
            r16 = r11
        L571:
            com.google.android.gms.measurement.internal.zzjk r0 = r32.zzB(r33)
            com.google.android.gms.measurement.internal.zzjj r4 = com.google.android.gms.measurement.internal.zzjj.zza
            boolean r0 = r0.zzo(r4)
            if (r0 == 0) goto L5d4
            java.util.Iterator r0 = r11.iterator()
        L581:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L5a0
            java.lang.Object r5 = r0.next()
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r5 = r5.first
            com.google.android.gms.internal.measurement.zzid r5 = (com.google.android.gms.internal.measurement.zzid) r5
            java.lang.String r7 = r5.zzG()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L581
            java.lang.String r0 = r5.zzG()
            goto L5a1
        L5a0:
            r0 = 0
        L5a1:
            if (r0 == 0) goto L5d4
            r9 = 0
        L5a4:
            int r5 = r11.size()
            if (r9 >= r5) goto L5d4
            java.lang.Object r5 = r11.get(r9)
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r5 = r5.first
            com.google.android.gms.internal.measurement.zzid r5 = (com.google.android.gms.internal.measurement.zzid) r5
            java.lang.String r7 = r5.zzG()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L5c1
        L5be:
            r17 = 1
            goto L5d1
        L5c1:
            java.lang.String r5 = r5.zzG()
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5be
            r14 = 0
            java.util.List r11 = r11.subList(r14, r9)
            goto L5d4
        L5d1:
            int r9 = r9 + 1
            goto L5a4
        L5d4:
            com.google.android.gms.internal.measurement.zzhz r0 = com.google.android.gms.internal.measurement.zzib.zzh()
            int r5 = r11.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            int r9 = r11.size()
            r7.<init>(r9)
            com.google.android.gms.measurement.internal.zzal r9 = r1.zzd()
            boolean r9 = r9.zzC(r6)
            if (r9 == 0) goto L5fb
            com.google.android.gms.measurement.internal.zzjk r9 = r32.zzB(r33)
            boolean r9 = r9.zzo(r4)
            if (r9 == 0) goto L5fb
            r9 = 1
            goto L5fc
        L5fb:
            r9 = 0
        L5fc:
            com.google.android.gms.measurement.internal.zzjk r10 = r32.zzB(r33)
            boolean r4 = r10.zzo(r4)
            com.google.android.gms.measurement.internal.zzjk r10 = r32.zzB(r33)
            com.google.android.gms.measurement.internal.zzjj r12 = com.google.android.gms.measurement.internal.zzjj.zzb
            boolean r10 = r10.zzo(r12)
            com.google.android.gms.internal.measurement.zzqu.zza()
            com.google.android.gms.measurement.internal.zzal r12 = r1.zzd()
            com.google.android.gms.measurement.internal.zzfw r13 = com.google.android.gms.measurement.internal.zzfx.zzaM
            boolean r12 = r12.zzp(r6, r13)
            com.google.android.gms.measurement.internal.zzot r13 = r1.zzl
            com.google.android.gms.measurement.internal.zzos r14 = r13.zza(r6)
            r15 = 0
        L622:
            if (r15 >= r5) goto L783
            java.lang.Object r16 = r11.get(r15)
            r21 = r4
            r4 = r16
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r4 = r4.first
            com.google.android.gms.internal.measurement.zzid r4 = (com.google.android.gms.internal.measurement.zzid) r4
            com.google.android.gms.internal.measurement.zzma r4 = r4.zzcl()
            com.google.android.gms.internal.measurement.zzic r4 = (com.google.android.gms.internal.measurement.zzic) r4
            java.lang.Object r16 = r11.get(r15)
            r22 = r5
            r5 = r16
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            r7.add(r5)
            com.google.android.gms.measurement.internal.zzal r5 = r1.zzd()
            r5.zzi()
            r5 = r9
            r16 = r10
            r9 = 130000(0x1fbd0, double:6.42285E-319)
            r4.zzO(r9)
            r4.zzs(r2)
            com.google.android.gms.measurement.internal.zzib r9 = r1.zzn
            r9.zzaU()
            r9 = 0
            r4.zzae(r9)
            if (r5 != 0) goto L66a
            r4.zzan()
        L66a:
            if (r21 != 0) goto L672
            r4.zzR()
            r4.zzU()
        L672:
            if (r16 != 0) goto L677
            r4.zzX()
        L677:
            r1.zzS(r6, r4)
            if (r12 != 0) goto L67f
            r4.zzav()
        L67f:
            if (r16 != 0) goto L684
            r4.zzag()
        L684:
            java.lang.String r10 = r4.zzP()
            boolean r20 = android.text.TextUtils.isEmpty(r10)
            if (r20 != 0) goto L6a1
            java.lang.String r9 = "00000000-0000-0000-0000-000000000000"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L697
            goto L6a1
        L697:
            r25 = r5
            r28 = r11
            r27 = r12
            r29 = r15
            goto L73c
        L6a1:
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List r10 = r4.zzb()
            r9.<init>(r10)
            java.util.Iterator r10 = r9.iterator()
            r25 = r5
            r26 = r10
            r5 = 0
            r10 = 0
            r23 = 0
            r24 = 0
        L6b8:
            boolean r27 = r26.hasNext()
            if (r27 == 0) goto L724
            java.lang.Object r27 = r26.next()
            r28 = r11
            r11 = r27
            com.google.android.gms.internal.measurement.zzhs r11 = (com.google.android.gms.internal.measurement.zzhs) r11
            r27 = r12
            java.lang.String r12 = r11.zzd()
            r29 = r15
            java.lang.String r15 = "_fx"
            boolean r12 = r15.equals(r12)
            if (r12 == 0) goto L6e6
            r26.remove()
            r12 = r27
            r11 = r28
            r15 = r29
            r23 = 1
        L6e3:
            r24 = 1
            goto L6b8
        L6e6:
            java.lang.String r12 = r11.zzd()
            boolean r12 = r8.equals(r12)
            if (r12 == 0) goto L71d
            r1.zzp()
            java.lang.String r12 = "_pfo"
            com.google.android.gms.internal.measurement.zzhw r12 = com.google.android.gms.measurement.internal.zzpj.zzF(r11, r12)
            if (r12 == 0) goto L703
            long r30 = r12.zzf()
            java.lang.Long r5 = java.lang.Long.valueOf(r30)
        L703:
            r1.zzp()
            java.lang.String r12 = "_uwa"
            com.google.android.gms.internal.measurement.zzhw r11 = com.google.android.gms.measurement.internal.zzpj.zzF(r11, r12)
            if (r11 == 0) goto L716
            long r10 = r11.zzf()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
        L716:
            r12 = r27
            r11 = r28
            r15 = r29
            goto L6e3
        L71d:
            r12 = r27
            r11 = r28
            r15 = r29
            goto L6b8
        L724:
            r28 = r11
            r27 = r12
            r29 = r15
            if (r23 == 0) goto L732
            r4.zzi()
            r4.zzh(r9)
        L732:
            if (r24 == 0) goto L73c
            java.lang.String r9 = r4.zzK()
            r11 = 1
            r1.zzR(r9, r11, r5, r10)
        L73c:
            int r5 = r4.zzc()
            if (r5 != 0) goto L745
        L742:
            r17 = 1
            goto L773
        L745:
            com.google.android.gms.measurement.internal.zzal r5 = r1.zzd()
            com.google.android.gms.measurement.internal.zzfw r9 = com.google.android.gms.measurement.internal.zzfx.zzaC
            boolean r5 = r5.zzp(r6, r9)
            if (r5 == 0) goto L766
            com.google.android.gms.internal.measurement.zzme r5 = r4.zzbc()
            com.google.android.gms.internal.measurement.zzid r5 = (com.google.android.gms.internal.measurement.zzid) r5
            byte[] r5 = r5.zzcc()
            com.google.android.gms.measurement.internal.zzpj r9 = r1.zzp()
            long r9 = r9.zzt(r5)
            r4.zzas(r9)
        L766:
            com.google.android.gms.internal.measurement.zzis r5 = r14.zzd()
            if (r5 == 0) goto L76f
            r4.zzaN(r5)
        L76f:
            r0.zze(r4)
            goto L742
        L773:
            int r15 = r29 + 1
            r10 = r16
            r4 = r21
            r5 = r22
            r9 = r25
            r12 = r27
            r11 = r28
            goto L622
        L783:
            int r4 = r0.zzb()
            if (r4 != 0) goto L797
            r1.zzL(r7)
            r5 = 0
            java.util.List r7 = java.util.Collections.EMPTY_LIST
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r1.zzU(r2, r3, r4, r5, r6, r7)
            return
        L797:
            com.google.android.gms.internal.measurement.zzme r4 = r0.zzbc()
            com.google.android.gms.internal.measurement.zzib r4 = (com.google.android.gms.internal.measurement.zzib) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.google.android.gms.measurement.internal.zzlr r8 = r14.zzc()
            com.google.android.gms.measurement.internal.zzlr r9 = com.google.android.gms.measurement.internal.zzlr.zzd
            if (r8 != r9) goto L7ac
            r8 = 1
            goto L7ad
        L7ac:
            r8 = 0
        L7ad:
            com.google.android.gms.measurement.internal.zzlr r9 = r14.zzc()
            com.google.android.gms.measurement.internal.zzlr r10 = com.google.android.gms.measurement.internal.zzlr.zzc
            if (r9 == r10) goto L7bd
            if (r8 == 0) goto L7b9
            r8 = 1
            goto L7bd
        L7b9:
            r13 = 0
        L7ba:
            r0 = r5
            goto L9b9
        L7bd:
            com.google.android.gms.internal.measurement.zzme r4 = r0.zzbc()
            com.google.android.gms.internal.measurement.zzib r4 = (com.google.android.gms.internal.measurement.zzib) r4
            java.util.List r4 = r4.zza()
            java.util.Iterator r4 = r4.iterator()
        L7cb:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L7e6
            java.lang.Object r9 = r4.next()
            com.google.android.gms.internal.measurement.zzid r9 = (com.google.android.gms.internal.measurement.zzid) r9
            boolean r9 = r9.zzY()
            if (r9 == 0) goto L7cb
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            goto L7e7
        L7e6:
            r4 = 0
        L7e7:
            com.google.android.gms.internal.measurement.zzme r9 = r0.zzbc()
            com.google.android.gms.internal.measurement.zzib r9 = (com.google.android.gms.internal.measurement.zzib) r9
            com.google.android.gms.measurement.internal.zzhy r10 = r1.zzaW()
            r10.zzg()
            r1.zzu()
            com.google.android.gms.internal.measurement.zzhz r10 = com.google.android.gms.internal.measurement.zzib.zzi(r9)
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 != 0) goto L804
            r10.zzi(r4)
        L804:
            com.google.android.gms.measurement.internal.zzhs r11 = r1.zzh()
            java.lang.String r11 = r11.zzc(r6)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L815
            r10.zzj(r11)
        L815:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r9 = r9.zza()
            java.util.Iterator r9 = r9.iterator()
        L822:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L83f
            java.lang.Object r12 = r9.next()
            com.google.android.gms.internal.measurement.zzid r12 = (com.google.android.gms.internal.measurement.zzid) r12
            com.google.android.gms.internal.measurement.zzic r12 = com.google.android.gms.internal.measurement.zzid.zzaF(r12)
            r12.zzan()
            com.google.android.gms.internal.measurement.zzme r12 = r12.zzbc()
            com.google.android.gms.internal.measurement.zzid r12 = (com.google.android.gms.internal.measurement.zzid) r12
            r11.add(r12)
            goto L822
        L83f:
            r10.zzg()
            r10.zzf(r11)
            com.google.android.gms.measurement.internal.zzgt r9 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r9 = r9.zzk()
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 == 0) goto L856
            java.lang.String r11 = "null"
            goto L85a
        L856:
            java.lang.String r11 = r10.zzh()
        L85a:
            java.lang.String r12 = "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: "
            r9.zzb(r12, r11)
            com.google.android.gms.internal.measurement.zzme r9 = r10.zzbc()
            com.google.android.gms.internal.measurement.zzib r9 = (com.google.android.gms.internal.measurement.zzib) r9
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 != 0) goto L947
            com.google.android.gms.internal.measurement.zzme r0 = r0.zzbc()
            com.google.android.gms.internal.measurement.zzib r0 = (com.google.android.gms.internal.measurement.zzib) r0
            com.google.android.gms.measurement.internal.zzhy r10 = r1.zzaW()
            r10.zzg()
            r1.zzu()
            com.google.android.gms.internal.measurement.zzhz r10 = com.google.android.gms.internal.measurement.zzib.zzh()
            com.google.android.gms.measurement.internal.zzgt r11 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r11 = r11.zzk()
            java.lang.String r12 = "[sgtm] Processing Google Signal, sgtmJoinId:"
            r11.zzb(r12, r4)
            r10.zzi(r4)
            java.util.List r0 = r0.zza()
            java.util.Iterator r0 = r0.iterator()
        L897:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L8b9
            java.lang.Object r4 = r0.next()
            com.google.android.gms.internal.measurement.zzid r4 = (com.google.android.gms.internal.measurement.zzid) r4
            com.google.android.gms.internal.measurement.zzic r11 = com.google.android.gms.internal.measurement.zzid.zzaE()
            java.lang.String r12 = r4.zzZ()
            r11.zzam(r12)
            int r4 = r4.zzav()
            r11.zzaJ(r4)
            r10.zze(r11)
            goto L897
        L8b9:
            com.google.android.gms.internal.measurement.zzme r0 = r10.zzbc()
            com.google.android.gms.internal.measurement.zzib r0 = (com.google.android.gms.internal.measurement.zzib) r0
            com.google.android.gms.measurement.internal.zzpf r4 = r13.zzg
            com.google.android.gms.measurement.internal.zzhs r4 = r4.zzh()
            java.lang.String r4 = r4.zzc(r6)
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 != 0) goto L928
            com.google.android.gms.measurement.internal.zzfw r10 = com.google.android.gms.measurement.internal.zzfx.zzr
            r11 = 0
            java.lang.Object r10 = r10.zzb(r11)
            java.lang.String r10 = (java.lang.String) r10
            android.net.Uri r10 = android.net.Uri.parse(r10)
            android.net.Uri$Builder r11 = r10.buildUpon()
            java.lang.String r10 = r10.getAuthority()
            java.lang.String r12 = java.lang.String.valueOf(r4)
            int r12 = r12.length()
            java.lang.String r13 = java.lang.String.valueOf(r10)
            r17 = 1
            int r12 = r12 + 1
            int r13 = r13.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r12 = r12 + r13
            r15.<init>(r12)
            r15.append(r4)
            java.lang.String r4 = "."
            r15.append(r4)
            r15.append(r10)
            java.lang.String r4 = r15.toString()
            r11.authority(r4)
            com.google.android.gms.measurement.internal.zzos r4 = new com.google.android.gms.measurement.internal.zzos
            android.net.Uri r10 = r11.build()
            java.lang.String r10 = r10.toString()
            if (r8 == 0) goto L91f
            com.google.android.gms.measurement.internal.zzlr r11 = com.google.android.gms.measurement.internal.zzlr.zze
            goto L921
        L91f:
            com.google.android.gms.measurement.internal.zzlr r11 = com.google.android.gms.measurement.internal.zzlr.zzb
        L921:
            java.util.Map r12 = java.util.Collections.EMPTY_MAP
            r13 = 0
            r4.<init>(r10, r12, r11, r13)
            goto L93f
        L928:
            r13 = 0
            com.google.android.gms.measurement.internal.zzos r4 = new com.google.android.gms.measurement.internal.zzos
            com.google.android.gms.measurement.internal.zzfw r10 = com.google.android.gms.measurement.internal.zzfx.zzr
            java.lang.Object r10 = r10.zzb(r13)
            java.lang.String r10 = (java.lang.String) r10
            if (r8 == 0) goto L938
            com.google.android.gms.measurement.internal.zzlr r11 = com.google.android.gms.measurement.internal.zzlr.zze
            goto L93a
        L938:
            com.google.android.gms.measurement.internal.zzlr r11 = com.google.android.gms.measurement.internal.zzlr.zzb
        L93a:
            java.util.Map r12 = java.util.Collections.EMPTY_MAP
            r4.<init>(r10, r12, r11, r13)
        L93f:
            android.util.Pair r0 = android.util.Pair.create(r0, r4)
            r5.add(r0)
            goto L948
        L947:
            r13 = 0
        L948:
            if (r8 == 0) goto L9b6
            com.google.android.gms.internal.measurement.zzma r0 = r9.zzcl()
            com.google.android.gms.internal.measurement.zzhz r0 = (com.google.android.gms.internal.measurement.zzhz) r0
            r4 = 0
        L951:
            int r8 = r9.zzb()
            if (r4 >= r8) goto L96f
            com.google.android.gms.internal.measurement.zzid r8 = r9.zzc(r4)
            com.google.android.gms.internal.measurement.zzma r8 = r8.zzcl()
            com.google.android.gms.internal.measurement.zzic r8 = (com.google.android.gms.internal.measurement.zzic) r8
            r8.zzt()
            r8.zzaO(r2)
            r0.zzd(r4, r8)
            r17 = 1
            int r4 = r4 + 1
            goto L951
        L96f:
            com.google.android.gms.internal.measurement.zzme r0 = r0.zzbc()
            com.google.android.gms.internal.measurement.zzib r0 = (com.google.android.gms.internal.measurement.zzib) r0
            android.util.Pair r0 = android.util.Pair.create(r0, r14)
            r5.add(r0)
            r1.zzL(r7)
            r4 = 0
            r7 = r5
            r5 = 0
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            r1.zzU(r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = r14.zza()
            boolean r0 = r1.zzO(r6, r0)
            if (r0 == 0) goto La0c
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            java.lang.String r2 = "[sgtm] Sending sgtm batches available notification to app"
            r0.zzb(r2, r6)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "com.google.android.gms.measurement.BATCHES_AVAILABLE"
            r0.setAction(r2)
            r0.setPackage(r6)
            com.google.android.gms.measurement.internal.zzib r2 = r1.zzn
            android.content.Context r2 = r2.zzaY()
            zzaP(r2, r0)
            return
        L9b6:
            r4 = r9
            goto L7ba
        L9b9:
            com.google.android.gms.measurement.internal.zzgy r5 = r1.zzi()
            boolean r5 = r5.zzb()
            if (r5 == 0) goto La0c
            com.google.android.gms.measurement.internal.zzgt r5 = r1.zzaV()
            java.lang.String r5 = r5.zzn()
            r9 = 2
            boolean r5 = android.util.Log.isLoggable(r5, r9)
            if (r5 == 0) goto L9da
            com.google.android.gms.measurement.internal.zzpj r5 = r1.zzp()
            java.lang.String r13 = r5.zzi(r4)
        L9da:
            r1.zzp()
            byte[] r5 = r4.zzcc()
            r1.zzL(r7)
            com.google.android.gms.measurement.internal.zznm r7 = r1.zzk
            com.google.android.gms.measurement.internal.zzhd r7 = r7.zze
            r7.zzb(r2)
            com.google.android.gms.measurement.internal.zzgt r2 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzk()
            int r3 = r5.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "Uploading data. app, uncompressed size, data"
            r2.zzd(r5, r6, r3, r13)
            r11 = 1
            r1.zzv = r11
            com.google.android.gms.measurement.internal.zzgy r2 = r1.zzi()
            com.google.android.gms.measurement.internal.zzov r3 = new com.google.android.gms.measurement.internal.zzov
            r3.<init>(r1, r6, r0)
            r2.zzc(r6, r14, r4, r3)
        La0c:
            return
        La0d:
            r0 = move-exception
            r13 = r10
        La0f:
            if (r13 == 0) goto La14
            r13.close()
        La14:
            throw r0
    }

    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    public final boolean zzO(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzav r0 = r3.zzj()
            com.google.android.gms.measurement.internal.zzh r0 = r0.zzu(r4)
            r1 = 1
            if (r0 == 0) goto L20
            com.google.android.gms.measurement.internal.zzpo r2 = r3.zzt()
            java.lang.String r0 = r0.zzay()
            boolean r4 = r2.zzaa(r4, r0)
            if (r4 != 0) goto L1a
            goto L20
        L1a:
            java.util.Map r4 = r3.zzF
            r4.remove(r5)
            return r1
        L20:
            java.util.Map r4 = r3.zzF
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.measurement.internal.zzpd r4 = (com.google.android.gms.measurement.internal.zzpd) r4
            if (r4 != 0) goto L2b
            return r1
        L2b:
            boolean r4 = r4.zzb()
            return r4
    }

    @androidx.annotation.WorkerThread
    public final void zzP(java.lang.String r9) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r8.zzaW()
            r0.zzg()
            r8.zzu()
            r0 = 1
            r8.zzw = r0
            r1 = 0
            com.google.android.gms.measurement.internal.zzib r2 = r8.zzn     // Catch: java.lang.Throwable -> L2c
            r2.zzaU()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zznk r2 = r2.zzt()     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r2 = r2.zzJ()     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L2f
            com.google.android.gms.measurement.internal.zzgt r9 = r8.zzaV()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgr r9 = r9.zze()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "Upload data called on the client side before use of service was decided"
            r9.zza(r0)     // Catch: java.lang.Throwable -> L2c
            goto L10b
        L2c:
            r9 = move-exception
            goto L111
        L2f:
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L44
            com.google.android.gms.measurement.internal.zzgt r9 = r8.zzaV()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgr r9 = r9.zzb()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "Upload called in the client side when service should be used"
            r9.zza(r0)     // Catch: java.lang.Throwable -> L2c
            goto L10b
        L44:
            long r2 = r8.zza     // Catch: java.lang.Throwable -> L2c
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L51
            r8.zzaK()     // Catch: java.lang.Throwable -> L2c
            goto L10b
        L51:
            com.google.android.gms.measurement.internal.zzgy r2 = r8.zzi()     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r2.zzb()     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L6d
            com.google.android.gms.measurement.internal.zzgt r9 = r8.zzaV()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgr r9 = r9.zzk()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "Network not connected, ignoring upload request"
            r9.zza(r0)     // Catch: java.lang.Throwable -> L2c
            r8.zzaK()     // Catch: java.lang.Throwable -> L2c
            goto L10b
        L6d:
            com.google.android.gms.measurement.internal.zzav r2 = r8.zzj()     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r2.zzD(r9)     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L86
            com.google.android.gms.measurement.internal.zzgt r0 = r8.zzaV()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "[sgtm] Upload queue has no batches for appId"
            r0.zzb(r2, r9)     // Catch: java.lang.Throwable -> L2c
            goto L10b
        L86:
            com.google.android.gms.measurement.internal.zzav r2 = r8.zzj()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)     // Catch: java.lang.Throwable -> L2c
            r2.zzg()     // Catch: java.lang.Throwable -> L2c
            r2.zzay()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzlr r3 = com.google.android.gms.measurement.internal.zzlr.zzb     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzlr[] r3 = new com.google.android.gms.measurement.internal.zzlr[]{r3}     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzon r3 = com.google.android.gms.measurement.internal.zzon.zza(r3)     // Catch: java.lang.Throwable -> L2c
            java.util.List r2 = r2.zzC(r9, r3, r0)     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto La9
            r2 = 0
            goto Laf
        La9:
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzpi r2 = (com.google.android.gms.measurement.internal.zzpi) r2     // Catch: java.lang.Throwable -> L2c
        Laf:
            if (r2 == 0) goto L10b
            com.google.android.gms.internal.measurement.zzib r3 = r2.zzd()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L10b
            com.google.android.gms.measurement.internal.zzgt r4 = r8.zzaV()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzk()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = "[sgtm] Uploading data from upload queue. appId, type, url"
            com.google.android.gms.measurement.internal.zzlr r6 = r2.zzf()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r7 = r2.zze()     // Catch: java.lang.Throwable -> L2c
            r4.zzd(r5, r9, r6, r7)     // Catch: java.lang.Throwable -> L2c
            byte[] r4 = r3.zzcc()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgt r5 = r8.zzaV()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = r5.zzn()     // Catch: java.lang.Throwable -> L2c
            r6 = 2
            boolean r5 = android.util.Log.isLoggable(r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto Lf9
            com.google.android.gms.measurement.internal.zzpj r5 = r8.zzp()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = r5.zzi(r3)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgt r6 = r8.zzaV()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzk()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r7 = "[sgtm] Uploading data from upload queue. appId, uncompressed size, data"
            int r4 = r4.length     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2c
            r6.zzd(r7, r9, r4, r5)     // Catch: java.lang.Throwable -> L2c
        Lf9:
            com.google.android.gms.measurement.internal.zzos r4 = r2.zza()     // Catch: java.lang.Throwable -> L2c
            r8.zzv = r0     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgy r0 = r8.zzi()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzow r5 = new com.google.android.gms.measurement.internal.zzow     // Catch: java.lang.Throwable -> L2c
            r5.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> L2c
            r0.zzc(r9, r4, r3, r5)     // Catch: java.lang.Throwable -> L2c
        L10b:
            r8.zzw = r1
            r8.zzaL()
            return
        L111:
            r8.zzw = r1
            r8.zzaL()
            throw r9
    }

    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    public final void zzQ(@androidx.annotation.NonNull java.lang.String r4, int r5, java.lang.Throwable r6, byte[] r7, com.google.android.gms.measurement.internal.zzpi r8) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r3.zzaW()
            r0.zzg()
            r3.zzu()
            r0 = 0
            if (r7 != 0) goto L13
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r4 = move-exception
            goto L9b
        L13:
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L1c
            r1 = 204(0xcc, float:2.86E-43)
            if (r5 != r1) goto L5a
            r5 = r1
        L1c:
            if (r6 != 0) goto L5a
            com.google.android.gms.measurement.internal.zzav r6 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            long r7 = r8.zzc()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L10
            r6.zzE(r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgt r6 = r3.zzaV()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgr r6 = r6.zzk()     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r6.zzc(r7, r4, r5)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgy r5 = r3.zzi()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.zzb()     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            com.google.android.gms.measurement.internal.zzav r5 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.zzD(r4)     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            r3.zzP(r4)     // Catch: java.lang.Throwable -> L10
            goto L95
        L56:
            r3.zzaK()     // Catch: java.lang.Throwable -> L10
            goto L95
        L5a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L10
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L10
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L10
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L10
            r2 = 32
            int r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r1.substring(r0, r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgt r1 = r3.zzaV()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzh()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L80
            r6 = r7
        L80:
            r1.zzd(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzav r4 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            long r5 = r8.zzc()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r4.zzK(r5)     // Catch: java.lang.Throwable -> L10
            r3.zzaK()     // Catch: java.lang.Throwable -> L10
        L95:
            r3.zzv = r0
            r3.zzaL()
            return
        L9b:
            r3.zzv = r0
            r3.zzaL()
            throw r4
    }

    @androidx.annotation.WorkerThread
    public final void zzR(java.lang.String r2, boolean r3, java.lang.Long r4, java.lang.Long r5) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            com.google.android.gms.measurement.internal.zzh r2 = r0.zzu(r2)
            if (r2 == 0) goto L21
            r2.zzar(r3)
            r2.zzat(r4)
            r2.zzav(r5)
            boolean r3 = r2.zza()
            if (r3 == 0) goto L21
            com.google.android.gms.measurement.internal.zzav r3 = r1.zzj()
            r4 = 0
            r3.zzv(r2, r4, r4)
        L21:
            return
    }

    public final void zzS(java.lang.String r7, com.google.android.gms.internal.measurement.zzic r8) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzhs r0 = r6.zzh()
            java.util.Set r0 = r0.zzl(r7)
            if (r0 == 0) goto Ld
            r8.zzaw(r0)
        Ld:
            com.google.android.gms.measurement.internal.zzhs r0 = r6.zzh()
            boolean r0 = r0.zzp(r7)
            if (r0 == 0) goto L1a
            r8.zzG()
        L1a:
            com.google.android.gms.measurement.internal.zzhs r0 = r6.zzh()
            boolean r0 = r0.zzq(r7)
            r1 = -1
            if (r0 == 0) goto L3f
            java.lang.String r0 = r8.zzD()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L3f
            java.lang.String r2 = "."
            int r2 = r0.indexOf(r2)
            if (r2 == r1) goto L3f
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r2)
            r8.zzE(r0)
        L3f:
            com.google.android.gms.measurement.internal.zzhs r0 = r6.zzh()
            boolean r0 = r0.zzr(r7)
            if (r0 == 0) goto L54
            java.lang.String r0 = "_id"
            int r0 = com.google.android.gms.measurement.internal.zzpj.zzx(r8, r0)
            if (r0 == r1) goto L54
            r8.zzr(r0)
        L54:
            com.google.android.gms.measurement.internal.zzhs r0 = r6.zzh()
            boolean r0 = r0.zzs(r7)
            if (r0 == 0) goto L61
            r8.zzan()
        L61:
            com.google.android.gms.measurement.internal.zzhs r0 = r6.zzh()
            boolean r0 = r0.zzt(r7)
            if (r0 == 0) goto Lab
            r8.zzX()
            com.google.android.gms.measurement.internal.zzjk r0 = r6.zzB(r7)
            com.google.android.gms.measurement.internal.zzjj r1 = com.google.android.gms.measurement.internal.zzjj.zzb
            boolean r0 = r0.zzo(r1)
            if (r0 == 0) goto Lab
            java.util.Map r0 = r6.zzE
            java.lang.Object r1 = r0.get(r7)
            com.google.android.gms.measurement.internal.zzpc r1 = (com.google.android.gms.measurement.internal.zzpc) r1
            if (r1 == 0) goto L9d
            long r2 = r1.zzb
            com.google.android.gms.measurement.internal.zzal r4 = r6.zzd()
            com.google.android.gms.measurement.internal.zzfw r5 = com.google.android.gms.measurement.internal.zzfx.zzak
            long r4 = r4.zzl(r7, r5)
            long r2 = r2 + r4
            com.google.android.gms.common.util.Clock r4 = r6.zzaZ()
            long r4 = r4.elapsedRealtime()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto La6
        L9d:
            com.google.android.gms.measurement.internal.zzpc r1 = new com.google.android.gms.measurement.internal.zzpc
            r2 = 0
            r1.<init>(r6, r2)
            r0.put(r7, r1)
        La6:
            java.lang.String r0 = r1.zza
            r8.zzax(r0)
        Lab:
            com.google.android.gms.measurement.internal.zzhs r0 = r6.zzh()
            boolean r7 = r0.zzu(r7)
            if (r7 == 0) goto Lb8
            r8.zzav()
        Lb8:
            return
    }

    @androidx.annotation.VisibleForTesting
    public final void zzT(java.lang.String r10, com.google.android.gms.internal.measurement.zzhv r11, android.os.Bundle r12, java.lang.String r13) {
            r9 = this;
            java.lang.String r0 = "_sc"
            java.lang.String r1 = "_si"
            java.lang.String r2 = "_o"
            java.lang.String r3 = "_sn"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = com.google.android.gms.common.util.CollectionUtils.listOf(r0)
            java.lang.String r1 = r11.zza()
            boolean r1 = com.google.android.gms.measurement.internal.zzpo.zzZ(r1)
            r2 = 1
            if (r1 != 0) goto L2c
            boolean r10 = com.google.android.gms.measurement.internal.zzpo.zzZ(r10)
            if (r10 == 0) goto L22
            goto L2c
        L22:
            com.google.android.gms.measurement.internal.zzal r10 = r9.zzd()
            int r10 = r10.zze(r13, r2)
        L2a:
            long r3 = (long) r10
            goto L35
        L2c:
            com.google.android.gms.measurement.internal.zzal r10 = r9.zzd()
            int r10 = r10.zzf(r13, r2)
            goto L2a
        L35:
            java.lang.String r10 = r11.zzc()
            java.lang.String r1 = r11.zzc()
            int r1 = r1.length()
            r5 = 0
            int r10 = r10.codePointCount(r5, r1)
            long r5 = (long) r10
            com.google.android.gms.measurement.internal.zzpo r10 = r9.zzt()
            java.lang.String r1 = r11.zza()
            r9.zzd()
            r7 = 40
            java.lang.String r10 = r10.zzC(r1, r7, r2)
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto Lc1
            java.lang.String r1 = r11.zza()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Lc1
            java.lang.String r0 = r11.zza()
            java.lang.String r1 = "_ev"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8a
            com.google.android.gms.measurement.internal.zzpo r10 = r9.zzt()
            java.lang.String r11 = r11.zzc()
            com.google.android.gms.measurement.internal.zzal r0 = r9.zzd()
            int r13 = r0.zzf(r13, r2)
            java.lang.String r10 = r10.zzC(r11, r13, r2)
            r12.putString(r1, r10)
            return
        L8a:
            com.google.android.gms.measurement.internal.zzgt r13 = r9.zzaV()
            com.google.android.gms.measurement.internal.zzgr r13 = r13.zzh()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.String r2 = "Param value is too long; discarded. Name, value length"
            r13.zzc(r2, r10, r0)
            java.lang.String r13 = "_err"
            long r2 = r12.getLong(r13)
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto Lba
            r2 = 4
            r12.putLong(r13, r2)
            java.lang.String r13 = r12.getString(r1)
            if (r13 != 0) goto Lba
            r12.putString(r1, r10)
            java.lang.String r10 = "_el"
            r12.putLong(r10, r5)
        Lba:
            java.lang.String r10 = r11.zza()
            r12.remove(r10)
        Lc1:
            return
    }

    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    public final void zzU(boolean r19, int r20, java.lang.Throwable r21, byte[] r22, java.lang.String r23, java.util.List r24) {
            r18 = this;
            r1 = r18
            r0 = r20
            r2 = r21
            com.google.android.gms.measurement.internal.zzhy r3 = r1.zzaW()
            r3.zzg()
            r1.zzu()
            r9 = 0
            if (r22 != 0) goto L19
            byte[] r3 = new byte[r9]     // Catch: java.lang.Throwable -> L16
            goto L1b
        L16:
            r0 = move-exception
            goto L297
        L19:
            r3 = r22
        L1b:
            java.util.List r4 = r1.zzz     // Catch: java.lang.Throwable -> L16
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L16
            r10 = r4
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L16
            r11 = 0
            r1.zzz = r11     // Catch: java.lang.Throwable -> L16
            if (r19 == 0) goto L8c
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 == r4) goto L32
            r4 = 204(0xcc, float:2.86E-43)
            if (r0 != r4) goto L34
            r0 = r4
        L32:
            if (r2 == 0) goto L8c
        L34:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L16
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L16
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L16
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L16
            r5 = 32
            int r3 = java.lang.Math.min(r5, r3)     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r4.substring(r9, r3)     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.measurement.internal.zzgt r4 = r1.zzaV()     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzh()     // Catch: java.lang.Throwable -> L16
            java.lang.String r5 = "Network upload failed. Will retry later. code, error"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L16
            r4.zzd(r5, r6, r2, r3)     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.measurement.internal.zznm r2 = r1.zzk     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.measurement.internal.zzhd r2 = r2.zze     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.common.util.Clock r3 = r1.zzaZ()     // Catch: java.lang.Throwable -> L16
            long r3 = r3.currentTimeMillis()     // Catch: java.lang.Throwable -> L16
            r2.zzb(r3)     // Catch: java.lang.Throwable -> L16
            r2 = 503(0x1f7, float:7.05E-43)
            if (r0 == r2) goto L71
            r2 = 429(0x1ad, float:6.01E-43)
            if (r0 != r2) goto L80
        L71:
            com.google.android.gms.measurement.internal.zznm r0 = r1.zzk     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.measurement.internal.zzhd r0 = r0.zzc     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.common.util.Clock r2 = r1.zzaZ()     // Catch: java.lang.Throwable -> L16
            long r2 = r2.currentTimeMillis()     // Catch: java.lang.Throwable -> L16
            r0.zzb(r2)     // Catch: java.lang.Throwable -> L16
        L80:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L16
            r0.zzJ(r10)     // Catch: java.lang.Throwable -> L16
            r1.zzaK()     // Catch: java.lang.Throwable -> L16
            goto L291
        L8c:
            com.google.android.gms.measurement.internal.zzgt r2 = r1.zzaV()     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzk()     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = "Network upload successful with code, uploadAttempted"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L16
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r19)     // Catch: java.lang.Throwable -> L16
            r2.zzc(r4, r0, r5)     // Catch: java.lang.Throwable -> L16
            if (r19 == 0) goto Lb6
            com.google.android.gms.measurement.internal.zznm r2 = r1.zzk     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            com.google.android.gms.measurement.internal.zzhd r2 = r2.zzd     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            com.google.android.gms.common.util.Clock r4 = r1.zzaZ()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            long r4 = r4.currentTimeMillis()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            r2.zzb(r4)     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            goto Lb6
        Lb3:
            r0 = move-exception
            goto L267
        Lb6:
            com.google.android.gms.measurement.internal.zznm r2 = r1.zzk     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            com.google.android.gms.measurement.internal.zzhd r2 = r2.zze     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            r12 = 0
            r2.zzb(r12)     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            r1.zzaK()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            if (r19 == 0) goto Ld7
            com.google.android.gms.measurement.internal.zzgt r2 = r1.zzaV()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzk()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            java.lang.String r4 = "Successful upload. Got network response. code, size"
            int r3 = r3.length     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            r2.zzc(r4, r0, r3)     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            goto Le4
        Ld7:
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            java.lang.String r2 = "Purged empty bundles"
            r0.zza(r2)     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
        Le4:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            r0.zzb()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L155
            r0.<init>()     // Catch: java.lang.Throwable -> L155
            java.util.Iterator r14 = r24.iterator()     // Catch: java.lang.Throwable -> L155
        Lf4:
            boolean r2 = r14.hasNext()     // Catch: java.lang.Throwable -> L155
            r3 = -1
            if (r2 == 0) goto L158
            java.lang.Object r2 = r14.next()     // Catch: java.lang.Throwable -> L155
            android.util.Pair r2 = (android.util.Pair) r2     // Catch: java.lang.Throwable -> L155
            java.lang.Object r5 = r2.first     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.internal.measurement.zzib r5 = (com.google.android.gms.internal.measurement.zzib) r5     // Catch: java.lang.Throwable -> L155
            java.lang.Object r2 = r2.second     // Catch: java.lang.Throwable -> L155
            r15 = r2
            com.google.android.gms.measurement.internal.zzos r15 = (com.google.android.gms.measurement.internal.zzos) r15     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzlr r2 = r15.zzc()     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzlr r6 = com.google.android.gms.measurement.internal.zzlr.zzd     // Catch: java.lang.Throwable -> L155
            if (r2 == r6) goto Lf4
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> L155
            r6 = r3
            r4 = r5
            java.lang.String r5 = r15.zza()     // Catch: java.lang.Throwable -> L155
            r7 = r6
            java.util.Map r6 = r15.zzb()     // Catch: java.lang.Throwable -> L155
            r16 = r7
            com.google.android.gms.measurement.internal.zzlr r7 = r15.zzc()     // Catch: java.lang.Throwable -> L155
            r8 = 0
            r3 = r23
            r12 = r16
            long r5 = r2.zzA(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzlr r2 = r15.zzc()     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzlr r3 = com.google.android.gms.measurement.internal.zzlr.zze     // Catch: java.lang.Throwable -> L155
            if (r2 != r3) goto L152
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L152
            java.lang.String r2 = r4.zze()     // Catch: java.lang.Throwable -> L155
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L155
            if (r2 != 0) goto L152
            java.lang.String r2 = r4.zze()     // Catch: java.lang.Throwable -> L155
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L155
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L155
        L152:
            r12 = 0
            goto Lf4
        L155:
            r0 = move-exception
            goto L25f
        L158:
            r12 = r3
            java.util.Iterator r14 = r24.iterator()     // Catch: java.lang.Throwable -> L155
        L15d:
            boolean r2 = r14.hasNext()     // Catch: java.lang.Throwable -> L155
            if (r2 == 0) goto L19f
            java.lang.Object r2 = r14.next()     // Catch: java.lang.Throwable -> L155
            android.util.Pair r2 = (android.util.Pair) r2     // Catch: java.lang.Throwable -> L155
            java.lang.Object r3 = r2.first     // Catch: java.lang.Throwable -> L155
            r4 = r3
            com.google.android.gms.internal.measurement.zzib r4 = (com.google.android.gms.internal.measurement.zzib) r4     // Catch: java.lang.Throwable -> L155
            java.lang.Object r2 = r2.second     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzos r2 = (com.google.android.gms.measurement.internal.zzos) r2     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzlr r3 = r2.zzc()     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzlr r5 = com.google.android.gms.measurement.internal.zzlr.zzd     // Catch: java.lang.Throwable -> L155
            if (r3 != r5) goto L19c
            java.lang.String r3 = r4.zze()     // Catch: java.lang.Throwable -> L155
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L155
            r8 = r3
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L155
            r3 = r2
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> L155
            java.lang.String r5 = r3.zza()     // Catch: java.lang.Throwable -> L155
            java.util.Map r6 = r3.zzb()     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzlr r7 = r3.zzc()     // Catch: java.lang.Throwable -> L155
            r3 = r23
            r2.zzA(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L155
            goto L15d
        L19c:
            r3 = r23
            goto L15d
        L19f:
            r3 = r23
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzlr r2 = com.google.android.gms.measurement.internal.zzlr.zzd     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzlr[] r2 = new com.google.android.gms.measurement.internal.zzlr[]{r2}     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzon r2 = com.google.android.gms.measurement.internal.zzon.zza(r2)     // Catch: java.lang.Throwable -> L155
            r4 = 1
            java.util.List r0 = r0.zzC(r3, r2, r4)     // Catch: java.lang.Throwable -> L155
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L155
            if (r2 != 0) goto L1ee
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzpi r0 = (com.google.android.gms.measurement.internal.zzpi) r0     // Catch: java.lang.Throwable -> L155
            long r4 = r0.zzg()     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.common.util.Clock r0 = r1.zzaZ()     // Catch: java.lang.Throwable -> L155
            long r6 = r0.currentTimeMillis()     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzfw r0 = com.google.android.gms.measurement.internal.zzfx.zzE     // Catch: java.lang.Throwable -> L155
            java.lang.Object r0 = r0.zzb(r11)     // Catch: java.lang.Throwable -> L155
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L155
            long r14 = r0.longValue()     // Catch: java.lang.Throwable -> L155
            long r14 = r14 + r4
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 <= 0) goto L1ee
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zze()     // Catch: java.lang.Throwable -> L155
            java.lang.String r2 = "[sgtm] client batches are queued too long. appId, creationTime"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L155
            r0.zzc(r2, r3, r4)     // Catch: java.lang.Throwable -> L155
        L1ee:
            java.util.Iterator r2 = r10.iterator()     // Catch: java.lang.Throwable -> L155
        L1f2:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L155
            if (r0 == 0) goto L218
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L155
            r4 = r0
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L155 android.database.sqlite.SQLiteException -> L20b
            long r5 = r4.longValue()     // Catch: java.lang.Throwable -> L155 android.database.sqlite.SQLiteException -> L20b
            r0.zzH(r5)     // Catch: java.lang.Throwable -> L155 android.database.sqlite.SQLiteException -> L20b
            goto L1f2
        L20b:
            r0 = move-exception
            java.util.List r5 = r1.zzA     // Catch: java.lang.Throwable -> L155
            if (r5 == 0) goto L217
            boolean r4 = r5.contains(r4)     // Catch: java.lang.Throwable -> L155
            if (r4 == 0) goto L217
            goto L1f2
        L217:
            throw r0     // Catch: java.lang.Throwable -> L155
        L218:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L155
            r0.zzc()     // Catch: java.lang.Throwable -> L155
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            r0.zzd()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            r1.zzA = r11     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            com.google.android.gms.measurement.internal.zzgy r0 = r1.zzi()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            boolean r0 = r0.zzb()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            if (r0 == 0) goto L242
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            boolean r0 = r0.zzD(r3)     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            if (r0 == 0) goto L242
            r1.zzP(r3)     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
        L23f:
            r2 = 0
            goto L25c
        L242:
            com.google.android.gms.measurement.internal.zzgy r0 = r1.zzi()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            boolean r0 = r0.zzb()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            if (r0 == 0) goto L256
            boolean r0 = r1.zzaI()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            if (r0 == 0) goto L256
            r1.zzM()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            goto L23f
        L256:
            r1.zzB = r12     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            r1.zzaK()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            goto L23f
        L25c:
            r1.zza = r2     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            goto L291
        L25f:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            r2.zzd()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
            throw r0     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteException -> Lb3
        L267:
            com.google.android.gms.measurement.internal.zzgt r2 = r1.zzaV()     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzb()     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = "Database error while trying to delete uploaded bundles"
            r2.zzb(r3, r0)     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.common.util.Clock r0 = r1.zzaZ()     // Catch: java.lang.Throwable -> L16
            long r2 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L16
            r1.zza = r2     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "Disable upload, time"
            long r3 = r1.zza     // Catch: java.lang.Throwable -> L16
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L16
            r0.zzb(r2, r3)     // Catch: java.lang.Throwable -> L16
        L291:
            r1.zzv = r9
            r1.zzaL()
            return
        L297:
            r1.zzv = r9
            r1.zzaL()
            throw r0
    }

    @androidx.annotation.WorkerThread
    public final void zzV(com.google.android.gms.measurement.internal.zzh r7) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r6.zzaW()
            r0.zzg()
            java.lang.String r0 = r7.zzf()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L26
            java.lang.String r7 = r7.zzc()
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            r4 = 0
            r5 = 0
            r2 = 204(0xcc, float:2.86E-43)
            r3 = 0
            r0 = r6
            r0.zzW(r1, r2, r3, r4, r5)
            return
        L26:
            r0 = r6
            java.lang.String r1 = r7.zzc()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.gms.measurement.internal.zzgt r2 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzk()
            java.lang.String r3 = "Fetching remote configuration"
            r2.zzb(r3, r1)
            com.google.android.gms.measurement.internal.zzhs r2 = r6.zzh()
            com.google.android.gms.internal.measurement.zzgl r2 = r2.zzb(r1)
            com.google.android.gms.measurement.internal.zzhs r3 = r6.zzh()
            java.lang.String r3 = r3.zzd(r1)
            r4 = 0
            if (r2 == 0) goto L7c
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L61
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>()
            java.lang.String r2 = "If-Modified-Since"
            r4.put(r2, r3)
        L61:
            com.google.android.gms.measurement.internal.zzhs r2 = r6.zzh()
            java.lang.String r1 = r2.zze(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L7c
            if (r4 != 0) goto L77
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            r4 = r2
        L77:
            java.lang.String r2 = "If-None-Match"
            r4.put(r2, r1)
        L7c:
            r1 = 1
            r0.zzu = r1
            com.google.android.gms.measurement.internal.zzgy r1 = r6.zzi()
            com.google.android.gms.measurement.internal.zzpe r2 = new com.google.android.gms.measurement.internal.zzpe
            r2.<init>(r6)
            r1.zzd(r7, r4, r2)
            return
    }

    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    public final void zzW(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r6.zzaW()
            r0.zzg()
            r6.zzu()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            r0 = 0
            if (r10 != 0) goto L16
            byte[] r10 = new byte[r0]     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r7 = move-exception
            goto L16f
        L16:
            com.google.android.gms.measurement.internal.zzgt r1 = r6.zzaV()     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch: java.lang.Throwable -> L13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L13
            r1.zzb(r2, r3)     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.measurement.internal.zzav r1 = r6.zzj()     // Catch: java.lang.Throwable -> L13
            r1.zzb()     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.measurement.internal.zzav r1 = r6.zzj()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzh r1 = r1.zzu(r7)     // Catch: java.lang.Throwable -> L5f
            r2 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r2) goto L47
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L47
            if (r8 != r4) goto L45
            r8 = r4
            goto L47
        L45:
            r2 = r0
            goto L4a
        L47:
            if (r9 != 0) goto L45
            r2 = 1
        L4a:
            if (r1 != 0) goto L62
            com.google.android.gms.measurement.internal.zzgt r8 = r6.zzaV()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzgr r8 = r8.zze()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgt.zzl(r7)     // Catch: java.lang.Throwable -> L5f
            r8.zzb(r9, r7)     // Catch: java.lang.Throwable -> L5f
            goto L153
        L5f:
            r7 = move-exception
            goto L167
        L62:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto Lbe
            if (r8 != r5) goto L69
            goto Lbe
        L69:
            com.google.android.gms.common.util.Clock r10 = r6.zzaZ()     // Catch: java.lang.Throwable -> L5f
            long r10 = r10.currentTimeMillis()     // Catch: java.lang.Throwable -> L5f
            r1.zzK(r10)     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzav r10 = r6.zzj()     // Catch: java.lang.Throwable -> L5f
            r10.zzv(r1, r0, r0)     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzgt r10 = r6.zzaV()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzgr r10 = r10.zzk()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L5f
            r10.zzc(r11, r1, r9)     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzhs r9 = r6.zzh()     // Catch: java.lang.Throwable -> L5f
            r9.zzf(r7)     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zznm r7 = r6.zzk     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzhd r7 = r7.zze     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.common.util.Clock r9 = r6.zzaZ()     // Catch: java.lang.Throwable -> L5f
            long r9 = r9.currentTimeMillis()     // Catch: java.lang.Throwable -> L5f
            r7.zzb(r9)     // Catch: java.lang.Throwable -> L5f
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto Laa
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto Lb9
        Laa:
            com.google.android.gms.measurement.internal.zznm r7 = r6.zzk     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzhd r7 = r7.zzc     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.common.util.Clock r8 = r6.zzaZ()     // Catch: java.lang.Throwable -> L5f
            long r8 = r8.currentTimeMillis()     // Catch: java.lang.Throwable -> L5f
            r7.zzb(r8)     // Catch: java.lang.Throwable -> L5f
        Lb9:
            r6.zzaK()     // Catch: java.lang.Throwable -> L5f
            goto L153
        Lbe:
            java.lang.String r9 = "Last-Modified"
            java.lang.String r9 = zzaJ(r11, r9)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = "ETag"
            java.lang.String r11 = zzaJ(r11, r2)     // Catch: java.lang.Throwable -> L5f
            if (r8 == r5) goto Ld7
            if (r8 != r4) goto Lcf
            goto Ld7
        Lcf:
            com.google.android.gms.measurement.internal.zzhs r2 = r6.zzh()     // Catch: java.lang.Throwable -> L5f
            r2.zzi(r7, r10, r9, r11)     // Catch: java.lang.Throwable -> L5f
            goto Le9
        Ld7:
            com.google.android.gms.measurement.internal.zzhs r9 = r6.zzh()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.measurement.zzgl r9 = r9.zzb(r7)     // Catch: java.lang.Throwable -> L5f
            if (r9 != 0) goto Le9
            com.google.android.gms.measurement.internal.zzhs r9 = r6.zzh()     // Catch: java.lang.Throwable -> L5f
            r10 = 0
            r9.zzi(r7, r10, r10, r10)     // Catch: java.lang.Throwable -> L5f
        Le9:
            com.google.android.gms.common.util.Clock r9 = r6.zzaZ()     // Catch: java.lang.Throwable -> L5f
            long r9 = r9.currentTimeMillis()     // Catch: java.lang.Throwable -> L5f
            r1.zzI(r9)     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzav r9 = r6.zzj()     // Catch: java.lang.Throwable -> L5f
            r9.zzv(r1, r0, r0)     // Catch: java.lang.Throwable -> L5f
            if (r8 != r5) goto L10b
            com.google.android.gms.measurement.internal.zzgt r8 = r6.zzaV()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzgr r8 = r8.zzh()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.zzb(r9, r7)     // Catch: java.lang.Throwable -> L5f
            goto L11c
        L10b:
            com.google.android.gms.measurement.internal.zzgt r7 = r6.zzaV()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzgr r7 = r7.zzk()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L5f
            r7.zzc(r9, r8, r3)     // Catch: java.lang.Throwable -> L5f
        L11c:
            com.google.android.gms.measurement.internal.zzgy r7 = r6.zzi()     // Catch: java.lang.Throwable -> L5f
            boolean r7 = r7.zzb()     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L130
            boolean r7 = r6.zzaI()     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L130
            r6.zzM()     // Catch: java.lang.Throwable -> L5f
            goto L153
        L130:
            com.google.android.gms.measurement.internal.zzgy r7 = r6.zzi()     // Catch: java.lang.Throwable -> L5f
            boolean r7 = r7.zzb()     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L150
            com.google.android.gms.measurement.internal.zzav r7 = r6.zzj()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r8 = r1.zzc()     // Catch: java.lang.Throwable -> L5f
            boolean r7 = r7.zzD(r8)     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L150
            java.lang.String r7 = r1.zzc()     // Catch: java.lang.Throwable -> L5f
            r6.zzP(r7)     // Catch: java.lang.Throwable -> L5f
            goto L153
        L150:
            r6.zzaK()     // Catch: java.lang.Throwable -> L5f
        L153:
            com.google.android.gms.measurement.internal.zzav r7 = r6.zzj()     // Catch: java.lang.Throwable -> L5f
            r7.zzc()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzav r7 = r6.zzj()     // Catch: java.lang.Throwable -> L13
            r7.zzd()     // Catch: java.lang.Throwable -> L13
            r6.zzu = r0
            r6.zzaL()
            return
        L167:
            com.google.android.gms.measurement.internal.zzav r8 = r6.zzj()     // Catch: java.lang.Throwable -> L13
            r8.zzd()     // Catch: java.lang.Throwable -> L13
            throw r7     // Catch: java.lang.Throwable -> L13
        L16f:
            r6.zzu = r0
            r6.zzaL()
            throw r7
    }

    @androidx.annotation.WorkerThread
    public final void zzX(java.lang.Runnable r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r1.zzaW()
            r0.zzg()
            java.util.List r0 = r1.zzq
            if (r0 != 0) goto L12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzq = r0
        L12:
            java.util.List r0 = r1.zzq
            r0.add(r2)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzY() {
            r9 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r9.zzaW()
            r0.zzg()
            r9.zzu()
            boolean r0 = r9.zzp
            if (r0 != 0) goto L12a
            r0 = 1
            r9.zzp = r0
            boolean r1 = r9.zzZ()
            if (r1 == 0) goto L12a
            java.nio.channels.FileChannel r1 = r9.zzy
            com.google.android.gms.measurement.internal.zzhy r2 = r9.zzaW()
            r2.zzg()
            java.lang.String r2 = "Bad channel to read from"
            r3 = 0
            r5 = 4
            r6 = 0
            if (r1 == 0) goto L69
            boolean r7 = r1.isOpen()
            if (r7 != 0) goto L2f
            goto L69
        L2f:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r5)
            r1.position(r3)     // Catch: java.io.IOException -> L51
            int r1 = r1.read(r7)     // Catch: java.io.IOException -> L51
            if (r1 == r5) goto L53
            r7 = -1
            if (r1 == r7) goto L74
            com.google.android.gms.measurement.internal.zzgt r7 = r9.zzaV()     // Catch: java.io.IOException -> L51
            com.google.android.gms.measurement.internal.zzgr r7 = r7.zze()     // Catch: java.io.IOException -> L51
            java.lang.String r8 = "Unexpected data length. Bytes read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> L51
            r7.zzb(r8, r1)     // Catch: java.io.IOException -> L51
            goto L74
        L51:
            r1 = move-exception
            goto L5b
        L53:
            r7.flip()     // Catch: java.io.IOException -> L51
            int r6 = r7.getInt()     // Catch: java.io.IOException -> L51
            goto L74
        L5b:
            com.google.android.gms.measurement.internal.zzgt r7 = r9.zzaV()
            com.google.android.gms.measurement.internal.zzgr r7 = r7.zzb()
            java.lang.String r8 = "Failed to read from channel"
            r7.zzb(r8, r1)
            goto L74
        L69:
            com.google.android.gms.measurement.internal.zzgt r1 = r9.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzb()
            r1.zza(r2)
        L74:
            com.google.android.gms.measurement.internal.zzib r1 = r9.zzn
            com.google.android.gms.measurement.internal.zzgh r1 = r1.zzv()
            int r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzhy r7 = r9.zzaW()
            r7.zzg()
            if (r6 <= r1) goto L9d
            com.google.android.gms.measurement.internal.zzgt r0 = r9.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Panic: can't downgrade version. Previous, current version"
            r0.zzc(r3, r2, r1)
            return
        L9d:
            if (r6 >= r1) goto L12a
            java.nio.channels.FileChannel r7 = r9.zzy
            com.google.android.gms.measurement.internal.zzhy r8 = r9.zzaW()
            r8.zzg()
            if (r7 == 0) goto L10a
            boolean r8 = r7.isOpen()
            if (r8 != 0) goto Lb1
            goto L10a
        Lb1:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r5)
            r2.putInt(r1)
            r2.flip()
            r7.truncate(r3)     // Catch: java.io.IOException -> Le4
            r7.write(r2)     // Catch: java.io.IOException -> Le4
            r7.force(r0)     // Catch: java.io.IOException -> Le4
            long r2 = r7.size()     // Catch: java.io.IOException -> Le4
            r4 = 4
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto Le6
            com.google.android.gms.measurement.internal.zzgt r0 = r9.zzaV()     // Catch: java.io.IOException -> Le4
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()     // Catch: java.io.IOException -> Le4
            java.lang.String r2 = "Error writing to channel. Bytes written"
            long r3 = r7.size()     // Catch: java.io.IOException -> Le4
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.io.IOException -> Le4
            r0.zzb(r2, r3)     // Catch: java.io.IOException -> Le4
            goto Le6
        Le4:
            r0 = move-exception
            goto Lfc
        Le6:
            com.google.android.gms.measurement.internal.zzgt r0 = r9.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgraded. Previous, current version"
            r0.zzc(r3, r2, r1)
            return
        Lfc:
            com.google.android.gms.measurement.internal.zzgt r2 = r9.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzb()
            java.lang.String r3 = "Failed to write to channel"
            r2.zzb(r3, r0)
            goto L115
        L10a:
            com.google.android.gms.measurement.internal.zzgt r0 = r9.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()
            r0.zza(r2)
        L115:
            com.google.android.gms.measurement.internal.zzgt r0 = r9.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgrade failed. Previous, current version"
            r0.zzc(r3, r2, r1)
        L12a:
            return
    }

    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    public final boolean zzZ() {
            r6 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r6.zzaW()
            r0.zzg()
            java.nio.channels.FileLock r0 = r6.zzx
            r1 = 1
            java.lang.String r2 = "Storage concurrent access okay"
            if (r0 == 0) goto L21
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L15
            goto L21
        L15:
            com.google.android.gms.measurement.internal.zzgt r0 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            r0.zza(r2)
            return r1
        L21:
            com.google.android.gms.measurement.internal.zzav r0 = r6.zze
            com.google.android.gms.measurement.internal.zzib r0 = r0.zzu
            r0.zzc()
            com.google.android.gms.measurement.internal.zzib r0 = r6.zzn
            android.content.Context r0 = r0.zzaY()
            java.io.File r0 = r0.getFilesDir()
            java.io.File r3 = new java.io.File
            com.google.android.gms.internal.measurement.zzbv.zza()
            int r4 = com.google.android.gms.internal.measurement.zzca.zzb
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "google_app_measurement.db"
            r4.<init>(r0, r5)
            java.lang.String r0 = r4.getPath()
            r3.<init>(r0)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L69 java.io.IOException -> L6b java.io.FileNotFoundException -> L6d
            java.lang.String r4 = "rw"
            r0.<init>(r3, r4)     // Catch: java.nio.channels.OverlappingFileLockException -> L69 java.io.IOException -> L6b java.io.FileNotFoundException -> L6d
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L69 java.io.IOException -> L6b java.io.FileNotFoundException -> L6d
            r6.zzy = r0     // Catch: java.nio.channels.OverlappingFileLockException -> L69 java.io.IOException -> L6b java.io.FileNotFoundException -> L6d
            java.nio.channels.FileLock r0 = r0.tryLock()     // Catch: java.nio.channels.OverlappingFileLockException -> L69 java.io.IOException -> L6b java.io.FileNotFoundException -> L6d
            r6.zzx = r0     // Catch: java.nio.channels.OverlappingFileLockException -> L69 java.io.IOException -> L6b java.io.FileNotFoundException -> L6d
            if (r0 == 0) goto L6f
            com.google.android.gms.measurement.internal.zzgt r0 = r6.zzaV()     // Catch: java.nio.channels.OverlappingFileLockException -> L69 java.io.IOException -> L6b java.io.FileNotFoundException -> L6d
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()     // Catch: java.nio.channels.OverlappingFileLockException -> L69 java.io.IOException -> L6b java.io.FileNotFoundException -> L6d
            r0.zza(r2)     // Catch: java.nio.channels.OverlappingFileLockException -> L69 java.io.IOException -> L6b java.io.FileNotFoundException -> L6d
            return r1
        L69:
            r0 = move-exception
            goto L7d
        L6b:
            r0 = move-exception
            goto L8b
        L6d:
            r0 = move-exception
            goto L99
        L6f:
            com.google.android.gms.measurement.internal.zzgt r0 = r6.zzaV()     // Catch: java.nio.channels.OverlappingFileLockException -> L69 java.io.IOException -> L6b java.io.FileNotFoundException -> L6d
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()     // Catch: java.nio.channels.OverlappingFileLockException -> L69 java.io.IOException -> L6b java.io.FileNotFoundException -> L6d
            java.lang.String r1 = "Storage concurrent data access panic"
            r0.zza(r1)     // Catch: java.nio.channels.OverlappingFileLockException -> L69 java.io.IOException -> L6b java.io.FileNotFoundException -> L6d
            goto La6
        L7d:
            com.google.android.gms.measurement.internal.zzgt r1 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zze()
            java.lang.String r2 = "Storage lock already acquired"
            r1.zzb(r2, r0)
            goto La6
        L8b:
            com.google.android.gms.measurement.internal.zzgt r1 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzb()
            java.lang.String r2 = "Failed to access storage lock file"
            r1.zzb(r2, r0)
            goto La6
        L99:
            com.google.android.gms.measurement.internal.zzgt r1 = r6.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzb()
            java.lang.String r2 = "Failed to acquire storage lock"
            r1.zzb(r2, r0)
        La6:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final com.google.android.gms.measurement.internal.zzae zzaU() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzn
            com.google.android.gms.measurement.internal.zzae r0 = r0.zzaU()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final com.google.android.gms.measurement.internal.zzgt zzaV() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzn
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzib r0 = (com.google.android.gms.measurement.internal.zzib) r0
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final com.google.android.gms.measurement.internal.zzhy zzaW() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzn
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzib r0 = (com.google.android.gms.measurement.internal.zzib) r0
            com.google.android.gms.measurement.internal.zzhy r0 = r0.zzaW()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final android.content.Context zzaY() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzn
            android.content.Context r0 = r0.zzaY()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final com.google.android.gms.common.util.Clock zzaZ() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzn
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzib r0 = (com.google.android.gms.measurement.internal.zzib) r0
            com.google.android.gms.common.util.Clock r0 = r0.zzaZ()
            return r0
    }

    @androidx.annotation.VisibleForTesting(otherwise = 4)
    @androidx.annotation.WorkerThread
    public final void zzaa(com.google.android.gms.measurement.internal.zzr r11) {
            r10 = this;
            java.lang.String r0 = "app_id=?"
            java.util.List r1 = r10.zzz
            if (r1 == 0) goto L12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.zzA = r1
            java.util.List r2 = r10.zzz
            r1.addAll(r2)
        L12:
            com.google.android.gms.measurement.internal.zzav r1 = r10.zzj()
            java.lang.String r2 = r11.zza
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r1.zzg()
            r1.zzay()
            android.database.sqlite.SQLiteDatabase r3 = r1.zze()     // Catch: android.database.sqlite.SQLiteException -> La9
            java.lang.String[] r4 = new java.lang.String[]{r2}     // Catch: android.database.sqlite.SQLiteException -> La9
            java.lang.String r5 = "apps"
            int r5 = r3.delete(r5, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            java.lang.String r6 = "events"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            int r5 = r5 + r6
            java.lang.String r6 = "events_snapshot"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            int r5 = r5 + r6
            java.lang.String r6 = "user_attributes"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            int r5 = r5 + r6
            java.lang.String r6 = "conditional_properties"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            int r5 = r5 + r6
            java.lang.String r6 = "raw_events"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            int r5 = r5 + r6
            java.lang.String r6 = "raw_events_metadata"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            int r5 = r5 + r6
            java.lang.String r6 = "queue"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            int r5 = r5 + r6
            java.lang.String r6 = "audience_filter_values"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            int r5 = r5 + r6
            java.lang.String r6 = "main_event_params"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            int r5 = r5 + r6
            java.lang.String r6 = "default_event_params"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            int r5 = r5 + r6
            java.lang.String r6 = "trigger_uris"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            int r5 = r5 + r6
            java.lang.String r6 = "upload_queue"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            int r5 = r5 + r6
            com.google.android.gms.internal.measurement.zzpk.zza()     // Catch: android.database.sqlite.SQLiteException -> La9
            com.google.android.gms.measurement.internal.zzib r6 = r1.zzu     // Catch: android.database.sqlite.SQLiteException -> La9
            com.google.android.gms.measurement.internal.zzal r7 = r6.zzc()     // Catch: android.database.sqlite.SQLiteException -> La9
            com.google.android.gms.measurement.internal.zzfw r8 = com.google.android.gms.measurement.internal.zzfx.zzbi     // Catch: android.database.sqlite.SQLiteException -> La9
            r9 = 0
            boolean r7 = r7.zzp(r9, r8)     // Catch: android.database.sqlite.SQLiteException -> La9
            if (r7 == 0) goto Lab
            java.lang.String r7 = "no_data_mode_events"
            int r0 = r3.delete(r7, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            int r5 = r5 + r0
            goto Lab
        La9:
            r0 = move-exception
            goto Lbf
        Lab:
            if (r5 <= 0) goto Ld2
            com.google.android.gms.measurement.internal.zzgt r0 = r6.zzaV()     // Catch: android.database.sqlite.SQLiteException -> La9
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()     // Catch: android.database.sqlite.SQLiteException -> La9
            java.lang.String r3 = "Reset analytics data. app, records"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: android.database.sqlite.SQLiteException -> La9
            r0.zzc(r3, r2, r4)     // Catch: android.database.sqlite.SQLiteException -> La9
            goto Ld2
        Lbf:
            com.google.android.gms.measurement.internal.zzib r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzgt r1 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzb()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgt.zzl(r2)
            java.lang.String r3 = "Error resetting analytics data. appId, error"
            r1.zzc(r3, r2, r0)
        Ld2:
            boolean r0 = r11.zzh
            if (r0 == 0) goto Ld9
            r10.zzag(r11)
        Ld9:
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzab(com.google.android.gms.measurement.internal.zzpk r22, com.google.android.gms.measurement.internal.zzr r23) {
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            java.lang.String r3 = "_id"
            com.google.android.gms.measurement.internal.zzhy r4 = r1.zzaW()
            r4.zzg()
            r1.zzu()
            boolean r4 = zzaQ(r2)
            if (r4 != 0) goto L1a
            goto L1ef
        L1a:
            boolean r4 = r2.zzh
            if (r4 != 0) goto L22
            r1.zzan(r2)
            return
        L22:
            com.google.android.gms.measurement.internal.zzpo r4 = r1.zzt()
            java.lang.String r8 = r0.zzb
            int r12 = r4.zzp(r8)
            r4 = 1
            r5 = 24
            r13 = 0
            if (r12 == 0) goto L52
            com.google.android.gms.measurement.internal.zzpo r0 = r1.zzt()
            r1.zzd()
            java.lang.String r14 = r0.zzC(r8, r5, r4)
            if (r8 == 0) goto L43
            int r13 = r8.length()
        L43:
            r15 = r13
            com.google.android.gms.measurement.internal.zzpo r9 = r1.zzt()
            com.google.android.gms.measurement.internal.zzpn r10 = r1.zzK
            java.lang.String r11 = r2.zza
            java.lang.String r13 = "_ev"
            r9.zzN(r10, r11, r12, r13, r14, r15)
            return
        L52:
            com.google.android.gms.measurement.internal.zzpo r6 = r1.zzt()
            java.lang.Object r7 = r0.zza()
            int r17 = r6.zzK(r8, r7)
            if (r17 == 0) goto L96
            com.google.android.gms.measurement.internal.zzpo r3 = r1.zzt()
            r1.zzd()
            java.lang.String r19 = r3.zzC(r8, r5, r4)
            java.lang.Object r0 = r0.zza()
            if (r0 == 0) goto L7a
            boolean r3 = r0 instanceof java.lang.String
            if (r3 != 0) goto L7d
            boolean r3 = r0 instanceof java.lang.CharSequence
            if (r3 == 0) goto L7a
            goto L7d
        L7a:
            r20 = r13
            goto L86
        L7d:
            java.lang.String r0 = r0.toString()
            int r13 = r0.length()
            goto L7a
        L86:
            com.google.android.gms.measurement.internal.zzpo r14 = r1.zzt()
            com.google.android.gms.measurement.internal.zzpn r15 = r1.zzK
            java.lang.String r0 = r2.zza
            java.lang.String r18 = "_ev"
            r16 = r0
            r14.zzN(r15, r16, r17, r18, r19, r20)
            return
        L96:
            com.google.android.gms.measurement.internal.zzpo r4 = r1.zzt()
            java.lang.Object r5 = r0.zza()
            java.lang.Object r11 = r4.zzL(r8, r5)
            if (r11 == 0) goto L1ef
            java.lang.String r4 = "_sid"
            boolean r5 = r4.equals(r8)
            if (r5 == 0) goto L11a
            long r5 = r0.zzc
            java.lang.String r7 = r0.zzf
            java.lang.String r9 = r2.zza
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            java.lang.String r9 = (java.lang.String) r9
            com.google.android.gms.measurement.internal.zzav r10 = r1.zzj()
            java.lang.String r12 = "_sno"
            com.google.android.gms.measurement.internal.zzpm r10 = r10.zzm(r9, r12)
            if (r10 == 0) goto Ld1
            java.lang.Object r12 = r10.zze
            boolean r14 = r12 instanceof java.lang.Long
            if (r14 == 0) goto Ld1
            java.lang.Long r12 = (java.lang.Long) r12
            long r9 = r12.longValue()
            goto L105
        Ld1:
            if (r10 == 0) goto Le2
            com.google.android.gms.measurement.internal.zzgt r12 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r12 = r12.zze()
            java.lang.String r14 = "Retrieved last session number from database does not contain a valid (long) value"
            java.lang.Object r10 = r10.zze
            r12.zzb(r14, r10)
        Le2:
            com.google.android.gms.measurement.internal.zzav r10 = r1.zzj()
            java.lang.String r12 = "_s"
            com.google.android.gms.measurement.internal.zzbc r9 = r10.zzf(r9, r12)
            if (r9 == 0) goto L103
            com.google.android.gms.measurement.internal.zzgt r10 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r10 = r10.zzk()
            long r14 = r9.zzc
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            java.lang.String r12 = "Backfill the session number. Last used session number"
            r10.zzb(r12, r9)
            r9 = r14
            goto L105
        L103:
            r9 = 0
        L105:
            com.google.android.gms.measurement.internal.zzpk r14 = new com.google.android.gms.measurement.internal.zzpk
            r15 = 1
            long r9 = r9 + r15
            java.lang.Long r18 = java.lang.Long.valueOf(r9)
            java.lang.String r15 = "_sno"
            r16 = r5
            r19 = r7
            r14.<init>(r15, r16, r18, r19)
            r1.zzab(r14, r2)
        L11a:
            com.google.android.gms.measurement.internal.zzpm r5 = new com.google.android.gms.measurement.internal.zzpm
            java.lang.String r12 = r2.zza
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r0.zzf
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.lang.String r7 = (java.lang.String) r7
            long r9 = r0.zzc
            r5.<init>(r6, r7, r8, r9, r11)
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            com.google.android.gms.measurement.internal.zzib r6 = r1.zzn
            java.lang.String r7 = r5.zzc
            com.google.android.gms.measurement.internal.zzgm r9 = r6.zzl()
            java.lang.String r9 = r9.zzc(r7)
            java.lang.String r10 = "Setting user property"
            r0.zzc(r10, r9, r11)
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            r0.zzb()
            boolean r0 = r3.equals(r7)     // Catch: java.lang.Throwable -> L175
            if (r0 == 0) goto L177
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L175
            com.google.android.gms.measurement.internal.zzpm r0 = r0.zzm(r12, r3)     // Catch: java.lang.Throwable -> L175
            if (r0 == 0) goto L177
            java.lang.Object r3 = r5.zze     // Catch: java.lang.Throwable -> L175
            java.lang.Object r0 = r0.zze     // Catch: java.lang.Throwable -> L175
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L175
            if (r0 != 0) goto L177
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L175
            java.lang.String r3 = "_lair"
            r0.zzk(r12, r3)     // Catch: java.lang.Throwable -> L175
            goto L177
        L175:
            r0 = move-exception
            goto L1e7
        L177:
            r1.zzan(r2)     // Catch: java.lang.Throwable -> L175
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> L175
            boolean r0 = r0.zzl(r5)     // Catch: java.lang.Throwable -> L175
            boolean r3 = r4.equals(r8)     // Catch: java.lang.Throwable -> L175
            if (r3 == 0) goto L1ac
            com.google.android.gms.measurement.internal.zzpj r3 = r1.zzp()     // Catch: java.lang.Throwable -> L175
            java.lang.String r2 = r2.zzu     // Catch: java.lang.Throwable -> L175
            long r2 = r3.zzu(r2)     // Catch: java.lang.Throwable -> L175
            com.google.android.gms.measurement.internal.zzav r4 = r1.zzj()     // Catch: java.lang.Throwable -> L175
            com.google.android.gms.measurement.internal.zzh r4 = r4.zzu(r12)     // Catch: java.lang.Throwable -> L175
            if (r4 == 0) goto L1ac
            r4.zzan(r2)     // Catch: java.lang.Throwable -> L175
            boolean r2 = r4.zza()     // Catch: java.lang.Throwable -> L175
            if (r2 == 0) goto L1ac
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> L175
            r2.zzv(r4, r13, r13)     // Catch: java.lang.Throwable -> L175
        L1ac:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()     // Catch: java.lang.Throwable -> L175
            r2.zzc()     // Catch: java.lang.Throwable -> L175
            if (r0 != 0) goto L1df
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()     // Catch: java.lang.Throwable -> L175
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()     // Catch: java.lang.Throwable -> L175
            java.lang.String r2 = "Too many unique user properties are set. Ignoring user property"
            com.google.android.gms.measurement.internal.zzgm r3 = r6.zzl()     // Catch: java.lang.Throwable -> L175
            java.lang.String r3 = r3.zzc(r7)     // Catch: java.lang.Throwable -> L175
            java.lang.Object r4 = r5.zze     // Catch: java.lang.Throwable -> L175
            r0.zzc(r2, r3, r4)     // Catch: java.lang.Throwable -> L175
            com.google.android.gms.measurement.internal.zzpo r14 = r1.zzt()     // Catch: java.lang.Throwable -> L175
            com.google.android.gms.measurement.internal.zzpn r15 = r1.zzK     // Catch: java.lang.Throwable -> L175
            r19 = 0
            r20 = 0
            r17 = 9
            r18 = 0
            r16 = r12
            r14.zzN(r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L175
        L1df:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            r0.zzd()
            return
        L1e7:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()
            r2.zzd()
            throw r0
        L1ef:
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzac(java.lang.String r9, com.google.android.gms.measurement.internal.zzr r10) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r8.zzaW()
            r0.zzg()
            r8.zzu()
            boolean r0 = zzaQ(r10)
            if (r0 != 0) goto L11
            return
        L11:
            boolean r0 = r10.zzh
            if (r0 != 0) goto L19
            r8.zzan(r10)
            return
        L19:
            java.lang.Boolean r0 = zzaT(r10)
            java.lang.String r1 = "_npa"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L59
            if (r0 == 0) goto L59
            com.google.android.gms.measurement.internal.zzgt r9 = r8.zzaV()
            com.google.android.gms.measurement.internal.zzgr r9 = r9.zzj()
            java.lang.String r1 = "Falling back to manifest metadata value for ad personalization"
            r9.zza(r1)
            com.google.android.gms.measurement.internal.zzpk r2 = new com.google.android.gms.measurement.internal.zzpk
            com.google.android.gms.common.util.Clock r9 = r8.zzaZ()
            long r4 = r9.currentTimeMillis()
            r9 = 1
            boolean r0 = r0.booleanValue()
            if (r9 == r0) goto L48
            r0 = 0
            goto L4a
        L48:
            r0 = 1
        L4a:
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            java.lang.String r7 = "auto"
            java.lang.String r3 = "_npa"
            r2.<init>(r3, r4, r6, r7)
            r8.zzab(r2, r10)
            return
        L59:
            com.google.android.gms.measurement.internal.zzgt r0 = r8.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzj()
            com.google.android.gms.measurement.internal.zzib r1 = r8.zzn
            com.google.android.gms.measurement.internal.zzgm r2 = r1.zzl()
            java.lang.String r2 = r2.zzc(r9)
            java.lang.String r3 = "Removing user property"
            r0.zzb(r3, r2)
            com.google.android.gms.measurement.internal.zzav r0 = r8.zzj()
            r0.zzb()
            r8.zzan(r10)     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "_id"
            boolean r0 = r0.equals(r9)     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L97
            com.google.android.gms.measurement.internal.zzav r0 = r8.zzj()     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = r10.zza     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = "_lair"
            r0.zzk(r2, r3)     // Catch: java.lang.Throwable -> L94
            goto L97
        L94:
            r0 = move-exception
            r9 = r0
            goto Lca
        L97:
            com.google.android.gms.measurement.internal.zzav r0 = r8.zzj()     // Catch: java.lang.Throwable -> L94
            java.lang.String r10 = r10.zza     // Catch: java.lang.Throwable -> L94
            java.lang.Object r10 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)     // Catch: java.lang.Throwable -> L94
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L94
            r0.zzk(r10, r9)     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.measurement.internal.zzav r10 = r8.zzj()     // Catch: java.lang.Throwable -> L94
            r10.zzc()     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.measurement.internal.zzgt r10 = r8.zzaV()     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.measurement.internal.zzgr r10 = r10.zzj()     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "User property removed"
            com.google.android.gms.measurement.internal.zzgm r1 = r1.zzl()     // Catch: java.lang.Throwable -> L94
            java.lang.String r9 = r1.zzc(r9)     // Catch: java.lang.Throwable -> L94
            r10.zzb(r0, r9)     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.measurement.internal.zzav r9 = r8.zzj()
            r9.zzd()
            return
        Lca:
            com.google.android.gms.measurement.internal.zzav r10 = r8.zzj()
            r10.zzd()
            throw r9
    }

    public final void zzad() {
            r1 = this;
            int r0 = r1.zzs
            int r0 = r0 + 1
            r1.zzs = r0
            return
    }

    public final void zzae() {
            r1 = this;
            int r0 = r1.zzt
            int r0 = r0 + 1
            r1.zzt = r0
            return
    }

    public final com.google.android.gms.measurement.internal.zzib zzaf() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzn
            return r0
    }

    @androidx.annotation.WorkerThread
    public final void zzag(com.google.android.gms.measurement.internal.zzr r27) {
            r26 = this;
            r1 = r26
            r2 = r27
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r0 = "com.android.vending"
            java.lang.String r6 = "_npa"
            java.lang.String r7 = "_uwa"
            com.google.android.gms.measurement.internal.zzhy r8 = r1.zzaW()
            r8.zzg()
            r1.zzu()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r8 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            boolean r9 = zzaQ(r2)
            if (r9 != 0) goto L29
            return
        L29:
            com.google.android.gms.measurement.internal.zzav r9 = r1.zzj()
            com.google.android.gms.measurement.internal.zzh r9 = r9.zzu(r8)
            r10 = 0
            r11 = 0
            if (r9 == 0) goto L59
            java.lang.String r13 = r9.zzf()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L59
            java.lang.String r13 = r2.zzb
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L59
            r9.zzI(r11)
            com.google.android.gms.measurement.internal.zzav r13 = r1.zzj()
            r13.zzv(r9, r10, r10)
            com.google.android.gms.measurement.internal.zzhs r9 = r1.zzh()
            r9.zzh(r8)
        L59:
            boolean r9 = r2.zzh
            if (r9 != 0) goto L61
            r26.zzan(r27)
            return
        L61:
            long r13 = r2.zzl
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 != 0) goto L6f
            com.google.android.gms.common.util.Clock r9 = r1.zzaZ()
            long r13 = r9.currentTimeMillis()
        L6f:
            r17 = r13
            int r9 = r2.zzm
            r13 = 1
            if (r9 == 0) goto L8e
            if (r9 == r13) goto L8e
            com.google.android.gms.measurement.internal.zzgt r14 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r14 = r14.zze()
            java.lang.Object r15 = com.google.android.gms.measurement.internal.zzgt.zzl(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r11 = "Incorrect app type, assuming installed app. appId, appType"
            r14.zzc(r11, r15, r9)
            r9 = r10
        L8e:
            com.google.android.gms.measurement.internal.zzav r11 = r1.zzj()
            r11.zzb()
            com.google.android.gms.measurement.internal.zzav r11 = r1.zzj()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzpm r11 = r11.zzm(r8, r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.Boolean r12 = zzaT(r2)     // Catch: java.lang.Throwable -> Lb3
            if (r11 == 0) goto Lb6
            java.lang.String r14 = "auto"
            java.lang.String r15 = r11.zzb     // Catch: java.lang.Throwable -> Lb3
            boolean r14 = r14.equals(r15)     // Catch: java.lang.Throwable -> Lb3
            if (r14 == 0) goto Lae
            goto Lb6
        Lae:
            r12 = r17
            r24 = 1
            goto Lf3
        Lb3:
            r0 = move-exception
            goto L401
        Lb6:
            if (r12 == 0) goto Lea
            com.google.android.gms.measurement.internal.zzpk r15 = new com.google.android.gms.measurement.internal.zzpk     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r16 = "_npa"
            boolean r6 = r12.booleanValue()     // Catch: java.lang.Throwable -> Lb3
            if (r13 == r6) goto Lc5
            r23 = 0
            goto Lc7
        Lc5:
            r23 = 1
        Lc7:
            java.lang.Long r6 = java.lang.Long.valueOf(r23)     // Catch: java.lang.Throwable -> Lb3
            r23 = 1
            java.lang.String r20 = "auto"
            r19 = r6
            r13 = r23
            r15.<init>(r16, r17, r19, r20)     // Catch: java.lang.Throwable -> Lb3
            r24 = r13
            r12 = r17
            if (r11 == 0) goto Le6
            java.lang.Object r6 = r11.zze     // Catch: java.lang.Throwable -> Lb3
            java.lang.Long r11 = r15.zzd     // Catch: java.lang.Throwable -> Lb3
            boolean r6 = r6.equals(r11)     // Catch: java.lang.Throwable -> Lb3
            if (r6 != 0) goto Lf3
        Le6:
            r1.zzab(r15, r2)     // Catch: java.lang.Throwable -> Lb3
            goto Lf3
        Lea:
            r12 = r17
            r24 = 1
            if (r11 == 0) goto Lf3
            r1.zzac(r6, r2)     // Catch: java.lang.Throwable -> Lb3
        Lf3:
            com.google.android.gms.measurement.internal.zzal r6 = r1.zzd()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzfw r11 = com.google.android.gms.measurement.internal.zzfx.zzbc     // Catch: java.lang.Throwable -> Lb3
            r14 = 0
            boolean r6 = r6.zzp(r14, r11)     // Catch: java.lang.Throwable -> Lb3
            if (r6 == 0) goto L106
            long r14 = r2.zzD     // Catch: java.lang.Throwable -> Lb3
            r1.zzam(r2, r14)     // Catch: java.lang.Throwable -> Lb3
            goto L109
        L106:
            r1.zzam(r2, r12)     // Catch: java.lang.Throwable -> Lb3
        L109:
            r26.zzan(r27)     // Catch: java.lang.Throwable -> Lb3
            if (r9 != 0) goto L11a
            com.google.android.gms.measurement.internal.zzav r9 = r1.zzj()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r11 = "_f"
            com.google.android.gms.measurement.internal.zzbc r9 = r9.zzf(r8, r11)     // Catch: java.lang.Throwable -> Lb3
            r11 = r10
            goto L125
        L11a:
            com.google.android.gms.measurement.internal.zzav r9 = r1.zzj()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r11 = "_v"
            com.google.android.gms.measurement.internal.zzbc r9 = r9.zzf(r8, r11)     // Catch: java.lang.Throwable -> Lb3
            r11 = 1
        L125:
            if (r9 != 0) goto L3d2
            r14 = 3600000(0x36ee80, double:1.7786363E-317)
            long r17 = r12 / r14
            long r17 = r17 + r24
            long r17 = r17 * r14
            java.lang.String r9 = "_dac"
            java.lang.String r14 = "_et"
            java.lang.String r15 = "_r"
            java.lang.String r6 = "_c"
            if (r11 != 0) goto L384
            r11 = r15
            com.google.android.gms.measurement.internal.zzpk r15 = new com.google.android.gms.measurement.internal.zzpk     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r16 = "_fot"
            java.lang.Long r19 = java.lang.Long.valueOf(r17)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r20 = "auto"
            r17 = r12
            r15.<init>(r16, r17, r19, r20)     // Catch: java.lang.Throwable -> Lb3
            r1.zzab(r15, r2)     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzhy r12 = r1.zzaW()     // Catch: java.lang.Throwable -> Lb3
            r12.zzg()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzhj r12 = r1.zzm     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r12 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)     // Catch: java.lang.Throwable -> Lb3
            r13 = r12
            com.google.android.gms.measurement.internal.zzhj r13 = (com.google.android.gms.measurement.internal.zzhj) r13     // Catch: java.lang.Throwable -> Lb3
            if (r8 == 0) goto L23f
            boolean r12 = r8.isEmpty()     // Catch: java.lang.Throwable -> Lb3
            if (r12 == 0) goto L167
            goto L23f
        L167:
            com.google.android.gms.measurement.internal.zzib r15 = r13.zza     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzhy r12 = r15.zzaW()     // Catch: java.lang.Throwable -> Lb3
            r12.zzg()     // Catch: java.lang.Throwable -> Lb3
            boolean r12 = r13.zza()     // Catch: java.lang.Throwable -> Lb3
            if (r12 != 0) goto L185
            com.google.android.gms.measurement.internal.zzgt r0 = r15.zzaV()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzi()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r8 = "Install Referrer Reporter is not available"
            r0.zza(r8)     // Catch: java.lang.Throwable -> Lb3
            goto L24e
        L185:
            com.google.android.gms.measurement.internal.zzhi r12 = new com.google.android.gms.measurement.internal.zzhi     // Catch: java.lang.Throwable -> Lb3
            r12.<init>(r13, r8)     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzhy r8 = r15.zzaW()     // Catch: java.lang.Throwable -> Lb3
            r8.zzg()     // Catch: java.lang.Throwable -> Lb3
            android.content.Intent r8 = new android.content.Intent     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r10 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Lb3
            android.content.ComponentName r10 = new android.content.ComponentName     // Catch: java.lang.Throwable -> Lb3
            r16 = r15
            java.lang.String r15 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r10.<init>(r0, r15)     // Catch: java.lang.Throwable -> Lb3
            r8.setComponent(r10)     // Catch: java.lang.Throwable -> Lb3
            android.content.Context r10 = r16.zzaY()     // Catch: java.lang.Throwable -> Lb3
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch: java.lang.Throwable -> Lb3
            if (r10 != 0) goto L1bd
            com.google.android.gms.measurement.internal.zzgt r0 = r16.zzaV()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzf()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r8 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.zza(r8)     // Catch: java.lang.Throwable -> Lb3
            goto L24e
        L1bd:
            r15 = 0
            java.util.List r10 = r10.queryIntentServices(r8, r15)     // Catch: java.lang.Throwable -> Lb3
            if (r10 == 0) goto L231
            boolean r19 = r10.isEmpty()     // Catch: java.lang.Throwable -> Lb3
            if (r19 != 0) goto L231
            java.lang.Object r10 = r10.get(r15)     // Catch: java.lang.Throwable -> Lb3
            android.content.pm.ResolveInfo r10 = (android.content.pm.ResolveInfo) r10     // Catch: java.lang.Throwable -> Lb3
            android.content.pm.ServiceInfo r10 = r10.serviceInfo     // Catch: java.lang.Throwable -> Lb3
            if (r10 == 0) goto L24e
            java.lang.String r15 = r10.packageName     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r10 = r10.name     // Catch: java.lang.Throwable -> Lb3
            if (r10 == 0) goto L223
            boolean r0 = r0.equals(r15)     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto L223
            boolean r0 = r13.zza()     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto L223
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> Lb3
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.common.stats.ConnectionTracker r8 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch: java.lang.Throwable -> Lb3 java.lang.RuntimeException -> L207
            android.content.Context r10 = r16.zzaY()     // Catch: java.lang.Throwable -> Lb3 java.lang.RuntimeException -> L207
            r15 = 1
            boolean r0 = r8.bindService(r10, r0, r12, r15)     // Catch: java.lang.Throwable -> Lb3 java.lang.RuntimeException -> L207
            com.google.android.gms.measurement.internal.zzgt r8 = r16.zzaV()     // Catch: java.lang.Throwable -> Lb3 java.lang.RuntimeException -> L207
            com.google.android.gms.measurement.internal.zzgr r8 = r8.zzk()     // Catch: java.lang.Throwable -> Lb3 java.lang.RuntimeException -> L207
            java.lang.String r10 = "Install Referrer Service is"
            if (r0 == 0) goto L209
            java.lang.String r0 = "available"
            goto L20b
        L207:
            r0 = move-exception
            goto L20f
        L209:
            java.lang.String r0 = "not available"
        L20b:
            r8.zzb(r10, r0)     // Catch: java.lang.Throwable -> Lb3 java.lang.RuntimeException -> L207
            goto L24e
        L20f:
            com.google.android.gms.measurement.internal.zzib r8 = r13.zza     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzgt r8 = r8.zzaV()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzgr r8 = r8.zzb()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r10 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lb3
            r8.zzb(r10, r0)     // Catch: java.lang.Throwable -> Lb3
            goto L24e
        L223:
            com.google.android.gms.measurement.internal.zzgt r0 = r16.zzaV()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zze()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r8 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.zza(r8)     // Catch: java.lang.Throwable -> Lb3
            goto L24e
        L231:
            com.google.android.gms.measurement.internal.zzgt r0 = r16.zzaV()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzi()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r8 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.zza(r8)     // Catch: java.lang.Throwable -> Lb3
            goto L24e
        L23f:
            com.google.android.gms.measurement.internal.zzib r0 = r13.zza     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzf()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r8 = "Install Referrer Reporter was called with invalid app package name"
            r0.zza(r8)     // Catch: java.lang.Throwable -> Lb3
        L24e:
            com.google.android.gms.measurement.internal.zzhy r0 = r1.zzaW()     // Catch: java.lang.Throwable -> Lb3
            r0.zzg()     // Catch: java.lang.Throwable -> Lb3
            r1.zzu()     // Catch: java.lang.Throwable -> Lb3
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lb3
            r8.<init>()     // Catch: java.lang.Throwable -> Lb3
            r12 = r24
            r8.putLong(r6, r12)     // Catch: java.lang.Throwable -> Lb3
            r8.putLong(r11, r12)     // Catch: java.lang.Throwable -> Lb3
            r10 = 0
            r8.putLong(r7, r10)     // Catch: java.lang.Throwable -> Lb3
            r8.putLong(r5, r10)     // Catch: java.lang.Throwable -> Lb3
            r8.putLong(r4, r10)     // Catch: java.lang.Throwable -> Lb3
            r8.putLong(r3, r10)     // Catch: java.lang.Throwable -> Lb3
            r8.putLong(r14, r12)     // Catch: java.lang.Throwable -> Lb3
            boolean r0 = r2.zzo     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto L27d
            r8.putLong(r9, r12)     // Catch: java.lang.Throwable -> Lb3
        L27d:
            java.lang.String r0 = r2.zza     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> Lb3
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)     // Catch: java.lang.Throwable -> Lb3
            r0.zzg()     // Catch: java.lang.Throwable -> Lb3
            r0.zzay()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r9 = "first_open_count"
            long r10 = r0.zzN(r6, r9)     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzn     // Catch: java.lang.Throwable -> Lb3
            android.content.Context r9 = r0.zzaY()     // Catch: java.lang.Throwable -> Lb3
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch: java.lang.Throwable -> Lb3
            if (r9 != 0) goto L2ba
            com.google.android.gms.measurement.internal.zzgt r0 = r1.zzaV()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r3 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgt.zzl(r6)     // Catch: java.lang.Throwable -> Lb3
            r0.zzb(r3, r4)     // Catch: java.lang.Throwable -> Lb3
        L2b6:
            r21 = 0
            goto L367
        L2ba:
            android.content.Context r0 = r0.zzaY()     // Catch: java.lang.Throwable -> Lb3 android.content.pm.PackageManager.NameNotFoundException -> L2c8
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: java.lang.Throwable -> Lb3 android.content.pm.PackageManager.NameNotFoundException -> L2c8
            r15 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r15)     // Catch: java.lang.Throwable -> Lb3 android.content.pm.PackageManager.NameNotFoundException -> L2c8
            goto L2db
        L2c8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgt r9 = r1.zzaV()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzgr r9 = r9.zzb()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r12 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzgt.zzl(r6)     // Catch: java.lang.Throwable -> Lb3
            r9.zzc(r12, r13, r0)     // Catch: java.lang.Throwable -> Lb3
            r0 = 0
        L2db:
            if (r0 == 0) goto L328
            long r12 = r0.firstInstallTime     // Catch: java.lang.Throwable -> Lb3
            r21 = 0
            int r9 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r9 == 0) goto L328
            long r14 = r0.lastUpdateTime     // Catch: java.lang.Throwable -> Lb3
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L30d
            com.google.android.gms.measurement.internal.zzal r0 = r1.zzd()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzfw r9 = com.google.android.gms.measurement.internal.zzfx.zzaI     // Catch: java.lang.Throwable -> Lb3
            r13 = 0
            boolean r0 = r0.zzp(r13, r9)     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto L307
            r21 = 0
            int r0 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r0 != 0) goto L305
            r14 = 1
            r8.putLong(r7, r14)     // Catch: java.lang.Throwable -> Lb3
            r10 = 0
        L305:
            r12 = 0
            goto L30f
        L307:
            r14 = 1
            r8.putLong(r7, r14)     // Catch: java.lang.Throwable -> Lb3
            goto L305
        L30d:
            r13 = 0
            r12 = 1
        L30f:
            com.google.android.gms.measurement.internal.zzpk r15 = new com.google.android.gms.measurement.internal.zzpk     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r16 = "_fi"
            r7 = 1
            if (r7 == r12) goto L319
            r19 = 0
            goto L31b
        L319:
            r19 = 1
        L31b:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r20 = "auto"
            r15.<init>(r16, r17, r19, r20)     // Catch: java.lang.Throwable -> Lb3
            r1.zzab(r15, r2)     // Catch: java.lang.Throwable -> Lb3
            goto L329
        L328:
            r13 = 0
        L329:
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzn     // Catch: java.lang.Throwable -> Lb3 android.content.pm.PackageManager.NameNotFoundException -> L339
            android.content.Context r0 = r0.zzaY()     // Catch: java.lang.Throwable -> Lb3 android.content.pm.PackageManager.NameNotFoundException -> L339
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: java.lang.Throwable -> Lb3 android.content.pm.PackageManager.NameNotFoundException -> L339
            r15 = 0
            android.content.pm.ApplicationInfo r14 = r0.getApplicationInfo(r6, r15)     // Catch: java.lang.Throwable -> Lb3 android.content.pm.PackageManager.NameNotFoundException -> L339
            goto L34c
        L339:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgt r7 = r1.zzaV()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzgr r7 = r7.zzb()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r9 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgt.zzl(r6)     // Catch: java.lang.Throwable -> Lb3
            r7.zzc(r9, r6, r0)     // Catch: java.lang.Throwable -> Lb3
            r14 = r13
        L34c:
            if (r14 == 0) goto L2b6
            int r0 = r14.flags     // Catch: java.lang.Throwable -> Lb3
            r12 = 1
            r0 = r0 & r12
            if (r0 == 0) goto L35a
            r12 = 1
            r8.putLong(r4, r12)     // Catch: java.lang.Throwable -> Lb3
            goto L35c
        L35a:
            r12 = 1
        L35c:
            int r0 = r14.flags     // Catch: java.lang.Throwable -> Lb3
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2b6
            r8.putLong(r3, r12)     // Catch: java.lang.Throwable -> Lb3
            goto L2b6
        L367:
            int r0 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r0 < 0) goto L36e
            r8.putLong(r5, r10)     // Catch: java.lang.Throwable -> Lb3
        L36e:
            com.google.android.gms.measurement.internal.zzbg r15 = new com.google.android.gms.measurement.internal.zzbg     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r16 = "_f"
            com.google.android.gms.measurement.internal.zzbe r0 = new com.google.android.gms.measurement.internal.zzbe     // Catch: java.lang.Throwable -> Lb3
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Lb3
            r19 = r17
            java.lang.String r18 = "auto"
            r17 = r0
            r15.<init>(r16, r17, r18, r19)     // Catch: java.lang.Throwable -> Lb3
            r1.zzE(r15, r2)     // Catch: java.lang.Throwable -> Lb3
            goto L3f2
        L384:
            r19 = r12
            r11 = r15
            com.google.android.gms.measurement.internal.zzpk r15 = new com.google.android.gms.measurement.internal.zzpk     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r16 = "_fvt"
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch: java.lang.Throwable -> Lb3
            r17 = r19
            java.lang.String r20 = "auto"
            r19 = r0
            r15.<init>(r16, r17, r19, r20)     // Catch: java.lang.Throwable -> Lb3
            r1.zzab(r15, r2)     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzhy r0 = r1.zzaW()     // Catch: java.lang.Throwable -> Lb3
            r0.zzg()     // Catch: java.lang.Throwable -> Lb3
            r1.zzu()     // Catch: java.lang.Throwable -> Lb3
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lb3
            r0.<init>()     // Catch: java.lang.Throwable -> Lb3
            r12 = 1
            r0.putLong(r6, r12)     // Catch: java.lang.Throwable -> Lb3
            r0.putLong(r11, r12)     // Catch: java.lang.Throwable -> Lb3
            r0.putLong(r14, r12)     // Catch: java.lang.Throwable -> Lb3
            boolean r3 = r2.zzo     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L3bc
            r0.putLong(r9, r12)     // Catch: java.lang.Throwable -> Lb3
        L3bc:
            com.google.android.gms.measurement.internal.zzbg r15 = new com.google.android.gms.measurement.internal.zzbg     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r16 = "_v"
            com.google.android.gms.measurement.internal.zzbe r3 = new com.google.android.gms.measurement.internal.zzbe     // Catch: java.lang.Throwable -> Lb3
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lb3
            r19 = r17
            java.lang.String r18 = "auto"
            r17 = r3
            r15.<init>(r16, r17, r18, r19)     // Catch: java.lang.Throwable -> Lb3
            r1.zzE(r15, r2)     // Catch: java.lang.Throwable -> Lb3
            goto L3f2
        L3d2:
            r17 = r12
            boolean r0 = r2.zzi     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto L3f2
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lb3
            r0.<init>()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzbg r15 = new com.google.android.gms.measurement.internal.zzbg     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r16 = "_cd"
            com.google.android.gms.measurement.internal.zzbe r3 = new com.google.android.gms.measurement.internal.zzbe     // Catch: java.lang.Throwable -> Lb3
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lb3
            r19 = r17
            java.lang.String r18 = "auto"
            r17 = r3
            r15.<init>(r16, r17, r18, r19)     // Catch: java.lang.Throwable -> Lb3
            r1.zzE(r15, r2)     // Catch: java.lang.Throwable -> Lb3
        L3f2:
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()     // Catch: java.lang.Throwable -> Lb3
            r0.zzc()     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.zzav r0 = r1.zzj()
            r0.zzd()
            return
        L401:
            com.google.android.gms.measurement.internal.zzav r2 = r1.zzj()
            r2.zzd()
            throw r0
    }

    @androidx.annotation.WorkerThread
    public final void zzah(com.google.android.gms.measurement.internal.zzr r9) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r8.zzaW()
            r0.zzg()
            r8.zzu()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            java.lang.String r0 = r9.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.measurement.internal.zzal r1 = r8.zzd()
            com.google.android.gms.measurement.internal.zzfw r2 = com.google.android.gms.measurement.internal.zzfx.zzaz
            r3 = 0
            boolean r1 = r1.zzp(r3, r2)
            r2 = 0
            if (r1 == 0) goto L45
            com.google.android.gms.common.util.Clock r1 = r8.zzaZ()
            long r4 = r1.currentTimeMillis()
            com.google.android.gms.measurement.internal.zzal r1 = r8.zzd()
            com.google.android.gms.measurement.internal.zzfw r6 = com.google.android.gms.measurement.internal.zzfx.zzai
            int r1 = r1.zzm(r3, r6)
            r8.zzd()
            long r6 = com.google.android.gms.measurement.internal.zzal.zzF()
            long r4 = r4 - r6
        L3a:
            if (r2 >= r1) goto L5c
            boolean r6 = r8.zzaF(r3, r4)
            if (r6 == 0) goto L5c
            int r2 = r2 + 1
            goto L3a
        L45:
            r8.zzd()
            long r4 = com.google.android.gms.measurement.internal.zzal.zzH()
        L4c:
            long r6 = (long) r2
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L5c
            r6 = 0
            boolean r1 = r8.zzaF(r0, r6)
            if (r1 == 0) goto L5c
            int r2 = r2 + 1
            goto L4c
        L5c:
            com.google.android.gms.measurement.internal.zzal r1 = r8.zzd()
            com.google.android.gms.measurement.internal.zzfw r2 = com.google.android.gms.measurement.internal.zzfx.zzaA
            boolean r1 = r1.zzp(r3, r2)
            if (r1 == 0) goto L72
            com.google.android.gms.measurement.internal.zzhy r1 = r8.zzaW()
            r1.zzg()
            r8.zzaE()
        L72:
            com.google.android.gms.measurement.internal.zzot r1 = r8.zzl
            int r9 = r9.zzE
            com.google.android.gms.internal.measurement.zzin r9 = com.google.android.gms.internal.measurement.zzin.zzb(r9)
            boolean r9 = r1.zzc(r0, r9)
            if (r9 == 0) goto L98
            com.google.android.gms.measurement.internal.zzgt r9 = r8.zzaV()
            com.google.android.gms.measurement.internal.zzgr r9 = r9.zzk()
            java.lang.String r1 = "[sgtm] Going background, trigger client side upload. appId"
            r9.zzb(r1, r0)
            com.google.android.gms.common.util.Clock r9 = r8.zzaZ()
            long r1 = r9.currentTimeMillis()
            r8.zzN(r0, r1)
        L98:
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzai(com.google.android.gms.measurement.internal.zzah r2) {
            r1 = this;
            java.lang.String r0 = r2.zza
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.measurement.internal.zzr r0 = r1.zzaN(r0)
            if (r0 == 0) goto L11
            r1.zzaj(r2, r0)
        L11:
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzaj(com.google.android.gms.measurement.internal.zzah r11, com.google.android.gms.measurement.internal.zzr r12) {
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)
            java.lang.String r0 = r11.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            java.lang.String r0 = r11.zzb
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzpk r0 = r11.zzc
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzpk r0 = r11.zzc
            java.lang.String r0 = r0.zzb
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.measurement.internal.zzhy r0 = r10.zzaW()
            r0.zzg()
            r10.zzu()
            boolean r0 = zzaQ(r12)
            if (r0 != 0) goto L2a
            return
        L2a:
            boolean r0 = r12.zzh
            if (r0 != 0) goto L32
            r10.zzan(r12)
            return
        L32:
            com.google.android.gms.measurement.internal.zzah r0 = new com.google.android.gms.measurement.internal.zzah
            r0.<init>(r11)
            r11 = 0
            r0.zze = r11
            com.google.android.gms.measurement.internal.zzav r1 = r10.zzj()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzav r1 = r10.zzj()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = r0.zza     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzpk r3 = r0.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = r3.zzb     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzah r1 = r1.zzq(r2, r3)     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L85
            java.lang.String r2 = r1.zzb     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = r0.zzb     // Catch: java.lang.Throwable -> L81
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L81
            if (r2 != 0) goto L85
            com.google.android.gms.measurement.internal.zzgt r2 = r10.zzaV()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zze()     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "Updating a conditional user property with different origin. name, origin, origin (from DB)"
            com.google.android.gms.measurement.internal.zzib r4 = r10.zzn     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzgm r4 = r4.zzl()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzpk r5 = r0.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = r4.zzc(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = r0.zzb     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = r1.zzb     // Catch: java.lang.Throwable -> L81
            r2.zzd(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L81
            goto L85
        L81:
            r0 = move-exception
            r11 = r0
            goto L1ba
        L85:
            r2 = 1
            if (r1 == 0) goto Lba
            boolean r3 = r1.zze     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto Lba
            java.lang.String r3 = r1.zzb     // Catch: java.lang.Throwable -> L81
            r0.zzb = r3     // Catch: java.lang.Throwable -> L81
            long r3 = r1.zzd     // Catch: java.lang.Throwable -> L81
            r0.zzd = r3     // Catch: java.lang.Throwable -> L81
            long r3 = r1.zzh     // Catch: java.lang.Throwable -> L81
            r0.zzh = r3     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = r1.zzf     // Catch: java.lang.Throwable -> L81
            r0.zzf = r3     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzbg r3 = r1.zzi     // Catch: java.lang.Throwable -> L81
            r0.zzi = r3     // Catch: java.lang.Throwable -> L81
            r0.zze = r2     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzpk r4 = new com.google.android.gms.measurement.internal.zzpk     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzpk r2 = r0.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = r2.zzb     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzpk r3 = r1.zzc     // Catch: java.lang.Throwable -> L81
            long r6 = r3.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.Object r8 = r2.zza()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzpk r1 = r1.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.String r9 = r1.zzf     // Catch: java.lang.Throwable -> L81
            r4.<init>(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L81
            r0.zzc = r4     // Catch: java.lang.Throwable -> L81
            goto Lda
        Lba:
            java.lang.String r1 = r0.zzf     // Catch: java.lang.Throwable -> L81
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto Lda
            com.google.android.gms.measurement.internal.zzpk r3 = new com.google.android.gms.measurement.internal.zzpk     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzpk r11 = r0.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = r11.zzb     // Catch: java.lang.Throwable -> L81
            long r5 = r0.zzd     // Catch: java.lang.Throwable -> L81
            java.lang.Object r7 = r11.zza()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzpk r11 = r0.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.String r8 = r11.zzf     // Catch: java.lang.Throwable -> L81
            r3.<init>(r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L81
            r0.zzc = r3     // Catch: java.lang.Throwable -> L81
            r0.zze = r2     // Catch: java.lang.Throwable -> L81
            r11 = r2
        Lda:
            boolean r1 = r0.zze     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L156
            com.google.android.gms.measurement.internal.zzpk r1 = r0.zzc     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzpm r2 = new com.google.android.gms.measurement.internal.zzpm     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = r0.zza     // Catch: java.lang.Throwable -> L81
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = r0.zzb     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = r1.zzb     // Catch: java.lang.Throwable -> L81
            long r6 = r1.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.Object r1 = r1.zza()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L81
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzav r1 = r10.zzj()     // Catch: java.lang.Throwable -> L81
            boolean r1 = r1.zzl(r2)     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L123
            com.google.android.gms.measurement.internal.zzgt r1 = r10.zzaV()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzj()     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "User property updated immediately"
            java.lang.String r4 = r0.zza     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzib r5 = r10.zzn     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzgm r5 = r5.zzl()     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = r2.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = r5.zzc(r6)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r2.zze     // Catch: java.lang.Throwable -> L81
            r1.zzd(r3, r4, r5, r2)     // Catch: java.lang.Throwable -> L81
            goto L144
        L123:
            com.google.android.gms.measurement.internal.zzgt r1 = r10.zzaV()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzb()     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "(2)Too many active user properties, ignoring"
            java.lang.String r4 = r0.zza     // Catch: java.lang.Throwable -> L81
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgt.zzl(r4)     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzib r5 = r10.zzn     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzgm r5 = r5.zzl()     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = r2.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = r5.zzc(r6)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r2.zze     // Catch: java.lang.Throwable -> L81
            r1.zzd(r3, r4, r5, r2)     // Catch: java.lang.Throwable -> L81
        L144:
            if (r11 == 0) goto L156
            com.google.android.gms.measurement.internal.zzbg r11 = r0.zzi     // Catch: java.lang.Throwable -> L81
            if (r11 == 0) goto L156
            com.google.android.gms.measurement.internal.zzbg r11 = new com.google.android.gms.measurement.internal.zzbg     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzbg r1 = r0.zzi     // Catch: java.lang.Throwable -> L81
            long r2 = r0.zzd     // Catch: java.lang.Throwable -> L81
            r11.<init>(r1, r2)     // Catch: java.lang.Throwable -> L81
            r10.zzH(r11, r12)     // Catch: java.lang.Throwable -> L81
        L156:
            com.google.android.gms.measurement.internal.zzav r11 = r10.zzj()     // Catch: java.lang.Throwable -> L81
            boolean r11 = r11.zzp(r0)     // Catch: java.lang.Throwable -> L81
            if (r11 == 0) goto L184
            com.google.android.gms.measurement.internal.zzgt r11 = r10.zzaV()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzgr r11 = r11.zzj()     // Catch: java.lang.Throwable -> L81
            java.lang.String r12 = "Conditional property added"
            java.lang.String r1 = r0.zza     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzib r2 = r10.zzn     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzgm r2 = r2.zzl()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzpk r3 = r0.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = r3.zzb     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = r2.zzc(r3)     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzpk r0 = r0.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r0.zza()     // Catch: java.lang.Throwable -> L81
            r11.zzd(r12, r1, r2, r0)     // Catch: java.lang.Throwable -> L81
            goto L1ab
        L184:
            com.google.android.gms.measurement.internal.zzgt r11 = r10.zzaV()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzgr r11 = r11.zzb()     // Catch: java.lang.Throwable -> L81
            java.lang.String r12 = "Too many conditional properties, ignoring"
            java.lang.String r1 = r0.zza     // Catch: java.lang.Throwable -> L81
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzgt.zzl(r1)     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzib r2 = r10.zzn     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzgm r2 = r2.zzl()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzpk r3 = r0.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = r3.zzb     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = r2.zzc(r3)     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzpk r0 = r0.zzc     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r0.zza()     // Catch: java.lang.Throwable -> L81
            r11.zzd(r12, r1, r2, r0)     // Catch: java.lang.Throwable -> L81
        L1ab:
            com.google.android.gms.measurement.internal.zzav r11 = r10.zzj()     // Catch: java.lang.Throwable -> L81
            r11.zzc()     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.measurement.internal.zzav r11 = r10.zzj()
            r11.zzd()
            return
        L1ba:
            com.google.android.gms.measurement.internal.zzav r12 = r10.zzj()
            r12.zzd()
            throw r11
    }

    @androidx.annotation.WorkerThread
    public final void zzak(com.google.android.gms.measurement.internal.zzah r2) {
            r1 = this;
            java.lang.String r0 = r2.zza
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.measurement.internal.zzr r0 = r1.zzaN(r0)
            if (r0 == 0) goto L11
            r1.zzal(r2, r0)
        L11:
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzal(com.google.android.gms.measurement.internal.zzah r11, com.google.android.gms.measurement.internal.zzr r12) {
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)
            java.lang.String r0 = r11.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.measurement.internal.zzpk r0 = r11.zzc
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzpk r0 = r11.zzc
            java.lang.String r0 = r0.zzb
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.measurement.internal.zzhy r0 = r10.zzaW()
            r0.zzg()
            r10.zzu()
            boolean r0 = zzaQ(r12)
            if (r0 != 0) goto L25
            return
        L25:
            boolean r0 = r12.zzh
            if (r0 != 0) goto L2d
            r10.zzan(r12)
            return
        L2d:
            com.google.android.gms.measurement.internal.zzav r0 = r10.zzj()
            r0.zzb()
            r10.zzan(r12)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = r11.zza     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L86
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzav r0 = r10.zzj()     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzpk r1 = r11.zzc     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = r1.zzb     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzah r0 = r0.zzq(r2, r1)     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto Lb9
            com.google.android.gms.measurement.internal.zzgt r1 = r10.zzaV()     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzj()     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = "Removing conditional user property"
            java.lang.String r4 = r11.zza     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzib r5 = r10.zzn     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzgm r5 = r5.zzl()     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzpk r6 = r11.zzc     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r6.zzb     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = r5.zzc(r6)     // Catch: java.lang.Throwable -> L86
            r1.zzc(r3, r4, r5)     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzav r1 = r10.zzj()     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzpk r3 = r11.zzc     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = r3.zzb     // Catch: java.lang.Throwable -> L86
            r1.zzr(r2, r3)     // Catch: java.lang.Throwable -> L86
            boolean r1 = r0.zze     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L89
            com.google.android.gms.measurement.internal.zzav r1 = r10.zzj()     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzpk r3 = r11.zzc     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = r3.zzb     // Catch: java.lang.Throwable -> L86
            r1.zzk(r2, r3)     // Catch: java.lang.Throwable -> L86
            goto L89
        L86:
            r0 = move-exception
            r11 = r0
            goto Le9
        L89:
            com.google.android.gms.measurement.internal.zzbg r11 = r11.zzk     // Catch: java.lang.Throwable -> L86
            if (r11 == 0) goto Lda
            com.google.android.gms.measurement.internal.zzbe r1 = r11.zzb     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L97
            android.os.Bundle r1 = r1.zzf()     // Catch: java.lang.Throwable -> L86
        L95:
            r4 = r1
            goto L99
        L97:
            r1 = 0
            goto L95
        L99:
            com.google.android.gms.measurement.internal.zzpo r1 = r10.zzt()     // Catch: java.lang.Throwable -> L86
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzbg r3 = (com.google.android.gms.measurement.internal.zzbg) r3     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = r3.zza     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = r0.zzb     // Catch: java.lang.Throwable -> L86
            long r6 = r11.zzd     // Catch: java.lang.Throwable -> L86
            r8 = 1
            r9 = 1
            com.google.android.gms.measurement.internal.zzbg r11 = r1.zzac(r2, r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r11 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzbg r11 = (com.google.android.gms.measurement.internal.zzbg) r11     // Catch: java.lang.Throwable -> L86
            r10.zzH(r11, r12)     // Catch: java.lang.Throwable -> L86
            goto Lda
        Lb9:
            com.google.android.gms.measurement.internal.zzgt r12 = r10.zzaV()     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzgr r12 = r12.zze()     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "Conditional user property doesn't exist"
            java.lang.String r1 = r11.zza     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzgt.zzl(r1)     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzib r2 = r10.zzn     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzgm r2 = r2.zzl()     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzpk r11 = r11.zzc     // Catch: java.lang.Throwable -> L86
            java.lang.String r11 = r11.zzb     // Catch: java.lang.Throwable -> L86
            java.lang.String r11 = r2.zzc(r11)     // Catch: java.lang.Throwable -> L86
            r12.zzc(r0, r1, r11)     // Catch: java.lang.Throwable -> L86
        Lda:
            com.google.android.gms.measurement.internal.zzav r11 = r10.zzj()     // Catch: java.lang.Throwable -> L86
            r11.zzc()     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzav r11 = r10.zzj()
            r11.zzd()
            return
        Le9:
            com.google.android.gms.measurement.internal.zzav r12 = r10.zzj()
            r12.zzd()
            throw r11
    }

    @androidx.annotation.WorkerThread
    public final void zzam(com.google.android.gms.measurement.internal.zzr r17, long r18) {
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.zzav r3 = r1.zzj()
            java.lang.String r4 = r2.zza
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.measurement.internal.zzh r3 = r3.zzu(r4)
            r4 = 0
            if (r3 == 0) goto Lf3
            com.google.android.gms.measurement.internal.zzpo r5 = r1.zzt()
            java.lang.String r6 = r2.zzb
            java.lang.String r7 = r3.zzf()
            boolean r5 = r5.zzB(r6, r7)
            if (r5 == 0) goto Lf3
            com.google.android.gms.measurement.internal.zzgt r5 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgr r5 = r5.zze()
            java.lang.String r6 = r3.zzc()
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgt.zzl(r6)
            java.lang.String r7 = "New GMP App Id passed in. Removing cached database data. appId"
            r5.zzb(r7, r6)
            com.google.android.gms.measurement.internal.zzav r5 = r1.zzj()
            java.lang.String r3 = r3.zzc()
            r5.zzay()
            r5.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            android.database.sqlite.SQLiteDatabase r6 = r5.zze()     // Catch: android.database.sqlite.SQLiteException -> Lc8
            java.lang.String[] r7 = new java.lang.String[]{r3}     // Catch: android.database.sqlite.SQLiteException -> Lc8
            java.lang.String r8 = "events"
            int r8 = r6.delete(r8, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            java.lang.String r9 = "user_attributes"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            int r8 = r8 + r9
            java.lang.String r9 = "conditional_properties"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            int r8 = r8 + r9
            java.lang.String r9 = "apps"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            int r8 = r8 + r9
            java.lang.String r9 = "raw_events"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            int r8 = r8 + r9
            java.lang.String r9 = "raw_events_metadata"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            int r8 = r8 + r9
            java.lang.String r9 = "event_filters"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            int r8 = r8 + r9
            java.lang.String r9 = "property_filters"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            int r8 = r8 + r9
            java.lang.String r9 = "audience_filter_values"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            int r8 = r8 + r9
            java.lang.String r9 = "consent_settings"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            int r8 = r8 + r9
            java.lang.String r9 = "default_event_params"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            int r8 = r8 + r9
            java.lang.String r9 = "trigger_uris"
            int r9 = r6.delete(r9, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            int r8 = r8 + r9
            com.google.android.gms.internal.measurement.zzpk.zza()     // Catch: android.database.sqlite.SQLiteException -> Lc8
            com.google.android.gms.measurement.internal.zzib r9 = r5.zzu     // Catch: android.database.sqlite.SQLiteException -> Lc8
            com.google.android.gms.measurement.internal.zzal r10 = r9.zzc()     // Catch: android.database.sqlite.SQLiteException -> Lc8
            com.google.android.gms.measurement.internal.zzfw r11 = com.google.android.gms.measurement.internal.zzfx.zzbi     // Catch: android.database.sqlite.SQLiteException -> Lc8
            boolean r10 = r10.zzp(r4, r11)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            if (r10 == 0) goto Lca
            java.lang.String r10 = "no_data_mode_events"
            int r0 = r6.delete(r10, r0, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            int r8 = r8 + r0
            goto Lca
        Lc8:
            r0 = move-exception
            goto Ldf
        Lca:
            if (r8 <= 0) goto Ldd
            com.google.android.gms.measurement.internal.zzgt r0 = r9.zzaV()     // Catch: android.database.sqlite.SQLiteException -> Lc8
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()     // Catch: android.database.sqlite.SQLiteException -> Lc8
            java.lang.String r6 = "Deleted application data. app, records"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch: android.database.sqlite.SQLiteException -> Lc8
            r0.zzc(r6, r3, r7)     // Catch: android.database.sqlite.SQLiteException -> Lc8
        Ldd:
            r3 = r4
            goto Lf3
        Ldf:
            com.google.android.gms.measurement.internal.zzib r5 = r5.zzu
            com.google.android.gms.measurement.internal.zzgt r5 = r5.zzaV()
            com.google.android.gms.measurement.internal.zzgr r5 = r5.zzb()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgt.zzl(r3)
            java.lang.String r6 = "Error deleting application data. appId, error"
            r5.zzc(r6, r3, r0)
            goto Ldd
        Lf3:
            if (r3 == 0) goto L157
            long r5 = r3.zzt()
            r7 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L10e
            long r9 = r3.zzt()
            long r11 = r2.zzj
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L10e
            r0 = r5
            goto L10f
        L10e:
            r0 = r6
        L10f:
            java.lang.String r9 = r3.zzr()
            long r10 = r3.zzt()
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 != 0) goto L126
            if (r9 == 0) goto L126
            java.lang.String r3 = r2.zzc
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L126
            goto L127
        L126:
            r5 = r6
        L127:
            r0 = r0 | r5
            if (r0 == 0) goto L157
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r3 = "_pv"
            r0.putString(r3, r9)
            com.google.android.gms.measurement.internal.zzbg r10 = new com.google.android.gms.measurement.internal.zzbg
            com.google.android.gms.measurement.internal.zzbe r12 = new com.google.android.gms.measurement.internal.zzbe
            r12.<init>(r0)
            java.lang.String r13 = "auto"
            java.lang.String r11 = "_au"
            r14 = r18
            r10.<init>(r11, r12, r13, r14)
            com.google.android.gms.measurement.internal.zzal r0 = r1.zzd()
            com.google.android.gms.measurement.internal.zzfw r3 = com.google.android.gms.measurement.internal.zzfx.zzbd
            boolean r0 = r0.zzp(r4, r3)
            if (r0 == 0) goto L154
            r1.zzE(r10, r2)
            return
        L154:
            r1.zzF(r10, r2)
        L157:
            return
    }

    @androidx.annotation.WorkerThread
    public final com.google.android.gms.measurement.internal.zzh zzan(com.google.android.gms.measurement.internal.zzr r13) {
            r12 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r12.zzaW()
            r0.zzg()
            r12.zzu()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            java.lang.String r2 = r13.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            java.lang.String r0 = r13.zzt
            boolean r1 = r0.isEmpty()
            r8 = 0
            if (r1 != 0) goto L25
            java.util.Map r1 = r12.zzE
            com.google.android.gms.measurement.internal.zzpc r3 = new com.google.android.gms.measurement.internal.zzpc
            r3.<init>(r12, r0, r8)
            r1.put(r2, r3)
        L25:
            com.google.android.gms.measurement.internal.zzav r0 = r12.zzj()
            com.google.android.gms.measurement.internal.zzh r0 = r0.zzu(r2)
            com.google.android.gms.measurement.internal.zzjk r1 = r12.zzB(r2)
            java.lang.String r3 = r13.zzs
            r4 = 100
            com.google.android.gms.measurement.internal.zzjk r3 = com.google.android.gms.measurement.internal.zzjk.zzf(r3, r4)
            com.google.android.gms.measurement.internal.zzjk r1 = r1.zzs(r3)
            com.google.android.gms.measurement.internal.zzjj r3 = com.google.android.gms.measurement.internal.zzjj.zza
            boolean r4 = r1.zzo(r3)
            if (r4 == 0) goto L4e
            com.google.android.gms.measurement.internal.zznm r4 = r12.zzk
            boolean r5 = r13.zzn
            java.lang.String r4 = r4.zzf(r2, r5)
            goto L50
        L4e:
            java.lang.String r4 = ""
        L50:
            r9 = 1
            r10 = 0
            if (r0 != 0) goto L77
            com.google.android.gms.measurement.internal.zzib r0 = r12.zzn
            com.google.android.gms.measurement.internal.zzh r5 = new com.google.android.gms.measurement.internal.zzh
            r5.<init>(r0, r2)
            com.google.android.gms.measurement.internal.zzjj r0 = com.google.android.gms.measurement.internal.zzjj.zzb
            boolean r0 = r1.zzo(r0)
            if (r0 == 0) goto L6a
            java.lang.String r0 = r12.zzK(r1)
            r5.zze(r0)
        L6a:
            boolean r0 = r1.zzo(r3)
            if (r0 == 0) goto L73
            r5.zzk(r4)
        L73:
            r0 = r5
        L74:
            r11 = r10
            goto L129
        L77:
            boolean r3 = r1.zzo(r3)
            if (r3 == 0) goto L10e
            if (r4 == 0) goto L10e
            java.lang.String r3 = r0.zzj()
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L10e
            java.lang.String r3 = r0.zzj()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r0.zzk(r4)
            boolean r4 = r13.zzn
            if (r4 == 0) goto Lf3
            com.google.android.gms.measurement.internal.zznm r4 = r12.zzk
            android.util.Pair r4 = r4.zzc(r2, r1)
            java.lang.Object r4 = r4.first
            java.lang.String r5 = "00000000-0000-0000-0000-000000000000"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto Lf3
            if (r3 != 0) goto Lf3
            com.google.android.gms.measurement.internal.zzjj r3 = com.google.android.gms.measurement.internal.zzjj.zzb
            boolean r3 = r1.zzo(r3)
            if (r3 == 0) goto Lbb
            java.lang.String r1 = r12.zzK(r1)
            r0.zze(r1)
            r11 = r10
            goto Lbc
        Lbb:
            r11 = r9
        Lbc:
            com.google.android.gms.measurement.internal.zzav r1 = r12.zzj()
            java.lang.String r3 = "_id"
            com.google.android.gms.measurement.internal.zzpm r1 = r1.zzm(r2, r3)
            if (r1 == 0) goto L129
            com.google.android.gms.measurement.internal.zzav r1 = r12.zzj()
            java.lang.String r3 = "_lair"
            com.google.android.gms.measurement.internal.zzpm r1 = r1.zzm(r2, r3)
            if (r1 != 0) goto L129
            com.google.android.gms.common.util.Clock r1 = r12.zzaZ()
            long r5 = r1.currentTimeMillis()
            com.google.android.gms.measurement.internal.zzpm r1 = new com.google.android.gms.measurement.internal.zzpm
            r3 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "auto"
            java.lang.String r4 = "_lair"
            r1.<init>(r2, r3, r4, r5, r7)
            com.google.android.gms.measurement.internal.zzav r2 = r12.zzj()
            r2.zzl(r1)
            goto L129
        Lf3:
            java.lang.String r2 = r0.zzd()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L74
            com.google.android.gms.measurement.internal.zzjj r2 = com.google.android.gms.measurement.internal.zzjj.zzb
            boolean r2 = r1.zzo(r2)
            if (r2 == 0) goto L74
            java.lang.String r1 = r12.zzK(r1)
            r0.zze(r1)
            goto L74
        L10e:
            java.lang.String r2 = r0.zzd()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L74
            com.google.android.gms.measurement.internal.zzjj r2 = com.google.android.gms.measurement.internal.zzjj.zzb
            boolean r2 = r1.zzo(r2)
            if (r2 == 0) goto L74
            java.lang.String r1 = r12.zzK(r1)
            r0.zze(r1)
            goto L74
        L129:
            java.lang.String r1 = r13.zzb
            r0.zzg(r1)
            java.lang.String r1 = r13.zzk
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L139
            r0.zzm(r1)
        L139:
            long r1 = r13.zze
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L144
            r0.zzy(r1)
        L144:
            java.lang.String r1 = r13.zzc
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L14f
            r0.zzs(r1)
        L14f:
            long r1 = r13.zzj
            r0.zzu(r1)
            java.lang.String r1 = r13.zzd
            if (r1 == 0) goto L15b
            r0.zzw(r1)
        L15b:
            long r1 = r13.zzf
            r0.zzA(r1)
            boolean r1 = r13.zzh
            r0.zzE(r1)
            java.lang.String r1 = r13.zzg
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L170
            r0.zzab(r1)
        L170:
            boolean r1 = r13.zzn
            r0.zzad(r1)
            java.lang.Boolean r1 = r13.zzp
            r0.zzaf(r1)
            long r1 = r13.zzq
            r0.zzC(r1)
            java.lang.String r1 = r13.zzu
            r0.zzi(r1)
            com.google.android.gms.internal.measurement.zzpn.zza()
            com.google.android.gms.measurement.internal.zzal r1 = r12.zzd()
            com.google.android.gms.measurement.internal.zzfw r2 = com.google.android.gms.measurement.internal.zzfx.zzaL
            boolean r1 = r1.zzp(r8, r2)
            if (r1 == 0) goto L199
            java.util.List r1 = r13.zzr
            r0.zzah(r1)
            goto L1ab
        L199:
            com.google.android.gms.internal.measurement.zzpn.zza()
            com.google.android.gms.measurement.internal.zzal r1 = r12.zzd()
            com.google.android.gms.measurement.internal.zzfw r2 = com.google.android.gms.measurement.internal.zzfx.zzaK
            boolean r1 = r1.zzp(r8, r2)
            if (r1 == 0) goto L1ab
            r0.zzah(r8)
        L1ab:
            boolean r1 = r13.zzv
            r0.zzaj(r1)
            java.lang.String r1 = r13.zzB
            r0.zzaz(r1)
            com.google.android.gms.internal.measurement.zzql.zza()
            com.google.android.gms.measurement.internal.zzal r1 = r12.zzd()
            com.google.android.gms.measurement.internal.zzfw r2 = com.google.android.gms.measurement.internal.zzfx.zzaP
            boolean r1 = r1.zzp(r8, r2)
            if (r1 == 0) goto L1c9
            int r1 = r13.zzz
            r0.zzap(r1)
        L1c9:
            long r1 = r13.zzw
            r0.zzal(r1)
            java.lang.String r1 = r13.zzC
            r0.zzaG(r1)
            int r13 = r13.zzE
            r0.zzaK(r13)
            boolean r13 = r0.zza()
            if (r13 != 0) goto L1e2
            if (r11 == 0) goto L1e1
            goto L1e3
        L1e1:
            return r0
        L1e2:
            r9 = r11
        L1e3:
            com.google.android.gms.measurement.internal.zzav r13 = r12.zzj()
            r13.zzv(r0, r9, r10)
            return r0
    }

    public final java.lang.String zzao(com.google.android.gms.measurement.internal.zzr r5) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzoy r1 = new com.google.android.gms.measurement.internal.zzoy
            r1.<init>(r4, r5)
            java.util.concurrent.Future r0 = r0.zzh(r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L1a java.util.concurrent.TimeoutException -> L1c
            r2 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r0 = r0.get(r2, r1)     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L1a java.util.concurrent.TimeoutException -> L1c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L1a java.util.concurrent.TimeoutException -> L1c
            return r0
        L18:
            r0 = move-exception
            goto L1d
        L1a:
            r0 = move-exception
            goto L1d
        L1c:
            r0 = move-exception
        L1d:
            com.google.android.gms.measurement.internal.zzgt r1 = r4.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzb()
            java.lang.String r5 = r5.zza
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgt.zzl(r5)
            java.lang.String r2 = "Failed to get app instance id. appId"
            r1.zzc(r2, r5, r0)
            r5 = 0
            return r5
    }

    @androidx.annotation.WorkerThread
    public final java.util.List zzap(com.google.android.gms.measurement.internal.zzr r17, android.os.Bundle r18) {
            r16 = this;
            r1 = r17
            r0 = r18
            com.google.android.gms.measurement.internal.zzhy r2 = r16.zzaW()
            r2.zzg()
            com.google.android.gms.internal.measurement.zzql.zza()
            com.google.android.gms.measurement.internal.zzal r2 = r16.zzd()
            java.lang.String r3 = r1.zza
            com.google.android.gms.measurement.internal.zzfw r4 = com.google.android.gms.measurement.internal.zzfx.zzaP
            boolean r2 = r2.zzp(r3, r4)
            if (r2 == 0) goto L149
            if (r3 != 0) goto L20
            goto L149
        L20:
            if (r0 == 0) goto Lc2
            java.lang.String r4 = "uriSources"
            int[] r4 = r0.getIntArray(r4)
            java.lang.String r5 = "uriTimestamps"
            long[] r5 = r0.getLongArray(r5)
            if (r4 == 0) goto Lc2
            if (r5 == 0) goto Lb5
            int r0 = r5.length
            int r6 = r4.length
            if (r0 == r6) goto L3a
            goto Lb5
        L3a:
            r6 = 0
        L3b:
            int r0 = r4.length
            if (r6 >= r0) goto Lc2
            com.google.android.gms.measurement.internal.zzav r7 = r16.zzj()
            r0 = r4[r6]
            r8 = r5[r6]
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            r7.zzg()
            r7.zzay()
            java.lang.String r10 = " trigger URIs. appId, source, timestamp"
            java.lang.String r11 = "Pruned "
            android.database.sqlite.SQLiteDatabase r12 = r7.zze()     // Catch: android.database.sqlite.SQLiteException -> L9e
            java.lang.String r13 = "trigger_uris"
            java.lang.String r14 = "app_id=? and source=? and timestamp_millis<=?"
            java.lang.String r15 = java.lang.String.valueOf(r0)     // Catch: android.database.sqlite.SQLiteException -> L9e
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch: android.database.sqlite.SQLiteException -> L9e
            java.lang.String[] r2 = new java.lang.String[]{r3, r15, r2}     // Catch: android.database.sqlite.SQLiteException -> L9e
            int r2 = r12.delete(r13, r14, r2)     // Catch: android.database.sqlite.SQLiteException -> L9e
            com.google.android.gms.measurement.internal.zzib r12 = r7.zzu     // Catch: android.database.sqlite.SQLiteException -> L9e
            com.google.android.gms.measurement.internal.zzgt r12 = r12.zzaV()     // Catch: android.database.sqlite.SQLiteException -> L9e
            com.google.android.gms.measurement.internal.zzgr r12 = r12.zzk()     // Catch: android.database.sqlite.SQLiteException -> L9e
            java.lang.String r13 = java.lang.String.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9e
            int r13 = r13.length()     // Catch: android.database.sqlite.SQLiteException -> L9e
            int r13 = r13 + 46
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> L9e
            r14.<init>(r13)     // Catch: android.database.sqlite.SQLiteException -> L9e
            r14.append(r11)     // Catch: android.database.sqlite.SQLiteException -> L9e
            r14.append(r2)     // Catch: android.database.sqlite.SQLiteException -> L9e
            r14.append(r10)     // Catch: android.database.sqlite.SQLiteException -> L9e
            java.lang.String r2 = r14.toString()     // Catch: android.database.sqlite.SQLiteException -> L9e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: android.database.sqlite.SQLiteException -> L9e
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: android.database.sqlite.SQLiteException -> L9e
            r12.zzd(r2, r3, r0, r8)     // Catch: android.database.sqlite.SQLiteException -> L9e
            goto Lb2
        L9e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzib r2 = r7.zzu
            com.google.android.gms.measurement.internal.zzgt r2 = r2.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzb()
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgt.zzl(r3)
            java.lang.String r8 = "Error pruning trigger URIs. appId"
            r2.zzc(r8, r7, r0)
        Lb2:
            int r6 = r6 + 1
            goto L3b
        Lb5:
            com.google.android.gms.measurement.internal.zzgt r0 = r16.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzb()
            java.lang.String r2 = "Uri sources and timestamps do not match"
            r0.zza(r2)
        Lc2:
            com.google.android.gms.measurement.internal.zzav r2 = r16.zzj()
            java.lang.String r1 = r1.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            r2.zzg()
            r2.zzay()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r2.zze()     // Catch: java.lang.Throwable -> L10b android.database.sqlite.SQLiteException -> L10d
            java.lang.String r5 = "trigger_uris"
            java.lang.String r6 = "trigger_uri"
            java.lang.String r7 = "timestamp_millis"
            java.lang.String r8 = "source"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8}     // Catch: java.lang.Throwable -> L10b android.database.sqlite.SQLiteException -> L10d
            java.lang.String r7 = "app_id=?"
            java.lang.String[] r8 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L10b android.database.sqlite.SQLiteException -> L10d
            java.lang.String r11 = "rowid"
            r12 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L10b android.database.sqlite.SQLiteException -> L10d
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L10b android.database.sqlite.SQLiteException -> L10d
            if (r4 == 0) goto L13d
            r4 = 0
        L102:
            java.lang.String r5 = r3.getString(r4)     // Catch: java.lang.Throwable -> L10b android.database.sqlite.SQLiteException -> L10d
            if (r5 != 0) goto L10f
            java.lang.String r5 = ""
            goto L10f
        L10b:
            r0 = move-exception
            goto L143
        L10d:
            r0 = move-exception
            goto L128
        L10f:
            r6 = 1
            long r6 = r3.getLong(r6)     // Catch: java.lang.Throwable -> L10b android.database.sqlite.SQLiteException -> L10d
            r8 = 2
            int r8 = r3.getInt(r8)     // Catch: java.lang.Throwable -> L10b android.database.sqlite.SQLiteException -> L10d
            com.google.android.gms.measurement.internal.zzog r9 = new com.google.android.gms.measurement.internal.zzog     // Catch: java.lang.Throwable -> L10b android.database.sqlite.SQLiteException -> L10d
            r9.<init>(r5, r6, r8)     // Catch: java.lang.Throwable -> L10b android.database.sqlite.SQLiteException -> L10d
            r0.add(r9)     // Catch: java.lang.Throwable -> L10b android.database.sqlite.SQLiteException -> L10d
            boolean r5 = r3.moveToNext()     // Catch: java.lang.Throwable -> L10b android.database.sqlite.SQLiteException -> L10d
            if (r5 != 0) goto L102
            goto L13d
        L128:
            com.google.android.gms.measurement.internal.zzib r2 = r2.zzu     // Catch: java.lang.Throwable -> L10b
            com.google.android.gms.measurement.internal.zzgt r2 = r2.zzaV()     // Catch: java.lang.Throwable -> L10b
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzb()     // Catch: java.lang.Throwable -> L10b
            java.lang.String r4 = "Error querying trigger uris. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzgt.zzl(r1)     // Catch: java.lang.Throwable -> L10b
            r2.zzc(r4, r1, r0)     // Catch: java.lang.Throwable -> L10b
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L10b
        L13d:
            if (r3 == 0) goto L142
            r3.close()
        L142:
            return r0
        L143:
            if (r3 == 0) goto L148
            r3.close()
        L148:
            throw r0
        L149:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @androidx.annotation.WorkerThread
    public final void zzaq(java.lang.String r12, com.google.android.gms.measurement.internal.zzaf r13) {
            r11 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r11.zzaW()
            r0.zzg()
            r11.zzu()
            com.google.android.gms.measurement.internal.zzav r0 = r11.zzj()
            long r1 = r13.zza
            com.google.android.gms.measurement.internal.zzpi r0 = r0.zzB(r1)
            if (r0 != 0) goto L28
            com.google.android.gms.measurement.internal.zzgt r13 = r11.zzaV()
            com.google.android.gms.measurement.internal.zzgr r13 = r13.zze()
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "[sgtm] Queued batch doesn't exist. appId, rowId"
            r13.zzc(r1, r12, r0)
            return
        L28:
            java.lang.String r0 = r0.zze()
            int r3 = r13.zzb
            com.google.android.gms.measurement.internal.zzlq r4 = com.google.android.gms.measurement.internal.zzlq.zzb
            int r4 = r4.zza()
            if (r3 != r4) goto Lfd
            java.util.Map r3 = r11.zzF
            boolean r4 = r3.containsKey(r0)
            if (r4 == 0) goto L41
            r3.remove(r0)
        L41:
            com.google.android.gms.measurement.internal.zzav r0 = r11.zzj()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.zzE(r1)
            com.google.android.gms.measurement.internal.zzgt r0 = r11.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            java.lang.String r2 = "[sgtm] queued batch deleted after successful client upload. appId, rowId"
            r0.zzc(r2, r12, r1)
            long r0 = r13.zzc
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lfc
            com.google.android.gms.measurement.internal.zzav r2 = r11.zzj()
            r2.zzg()
            r2.zzay()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            com.google.android.gms.measurement.internal.zzlr r5 = com.google.android.gms.measurement.internal.zzlr.zzb
            int r5 = r5.zza()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "upload_type"
            r4.put(r6, r5)
            com.google.android.gms.measurement.internal.zzib r5 = r2.zzu
            com.google.android.gms.common.util.Clock r6 = r5.zzaZ()
            long r6 = r6.currentTimeMillis()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.String r7 = "creation_timestamp"
            r4.put(r7, r6)
            android.database.sqlite.SQLiteDatabase r6 = r2.zze()     // Catch: android.database.sqlite.SQLiteException -> Lcf
            java.lang.String r7 = "upload_queue"
            java.lang.String r8 = "rowid=? AND app_id=? AND upload_type=?"
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch: android.database.sqlite.SQLiteException -> Lcf
            com.google.android.gms.measurement.internal.zzlr r10 = com.google.android.gms.measurement.internal.zzlr.zze     // Catch: android.database.sqlite.SQLiteException -> Lcf
            int r10 = r10.zza()     // Catch: android.database.sqlite.SQLiteException -> Lcf
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: android.database.sqlite.SQLiteException -> Lcf
            java.lang.String[] r9 = new java.lang.String[]{r9, r12, r10}     // Catch: android.database.sqlite.SQLiteException -> Lcf
            int r4 = r6.update(r7, r4, r8, r9)     // Catch: android.database.sqlite.SQLiteException -> Lcf
            long r6 = (long) r4     // Catch: android.database.sqlite.SQLiteException -> Lcf
            r8 = 1
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto Ld1
            com.google.android.gms.measurement.internal.zzgt r4 = r5.zzaV()     // Catch: android.database.sqlite.SQLiteException -> Lcf
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zze()     // Catch: android.database.sqlite.SQLiteException -> Lcf
            java.lang.String r5 = "Google Signal pending batch not updated. appId, rowId"
            r4.zzc(r5, r12, r3)     // Catch: android.database.sqlite.SQLiteException -> Lcf
            goto Ld1
        Lcf:
            r13 = move-exception
            goto Le8
        Ld1:
            com.google.android.gms.measurement.internal.zzgt r0 = r11.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            long r1 = r13.zzc
            java.lang.Long r13 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "[sgtm] queued Google Signal batch updated. appId, signalRowId"
            r0.zzc(r1, r12, r13)
            r11.zzP(r12)
            return
        Le8:
            com.google.android.gms.measurement.internal.zzib r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzgt r2 = r2.zzaV()
            com.google.android.gms.measurement.internal.zzgr r2 = r2.zzb()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "Failed to update google Signal pending batch. appid, rowId"
            r2.zzd(r1, r12, r0, r13)
            throw r13
        Lfc:
            return
        Lfd:
            int r1 = r13.zzb
            com.google.android.gms.measurement.internal.zzlq r2 = com.google.android.gms.measurement.internal.zzlq.zzd
            int r2 = r2.zza()
            if (r1 != r2) goto L13e
            java.util.Map r1 = r11.zzF
            java.lang.Object r2 = r1.get(r0)
            com.google.android.gms.measurement.internal.zzpd r2 = (com.google.android.gms.measurement.internal.zzpd) r2
            if (r2 != 0) goto L11a
            com.google.android.gms.measurement.internal.zzpd r2 = new com.google.android.gms.measurement.internal.zzpd
            r2.<init>(r11)
            r1.put(r0, r2)
            goto L11d
        L11a:
            r2.zza()
        L11d:
            com.google.android.gms.common.util.Clock r1 = r11.zzaZ()
            long r3 = r1.currentTimeMillis()
            long r1 = r2.zzc()
            long r1 = r1 - r3
            com.google.android.gms.measurement.internal.zzgt r3 = r11.zzaV()
            com.google.android.gms.measurement.internal.zzgr r3 = r3.zzk()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds"
            r3.zzd(r2, r12, r0, r1)
        L13e:
            com.google.android.gms.measurement.internal.zzav r0 = r11.zzj()
            long r1 = r13.zza
            java.lang.Long r13 = java.lang.Long.valueOf(r1)
            r0.zzK(r13)
            com.google.android.gms.measurement.internal.zzgt r0 = r11.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            java.lang.String r1 = "[sgtm] increased batch retry count after failed client upload. appId, rowId"
            r0.zzc(r1, r12, r13)
            return
    }

    public final void zzar(boolean r1) {
            r0 = this;
            r0.zzaK()
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzas(java.lang.String r2, com.google.android.gms.measurement.internal.zzlt r3) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r1.zzaW()
            r0.zzg()
            java.lang.String r0 = r1.zzH
            if (r0 == 0) goto L15
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L15
            if (r3 == 0) goto L14
            goto L15
        L14:
            return
        L15:
            r1.zzH = r2
            r1.zzG = r3
            return
    }

    public final /* synthetic */ void zzat(com.google.android.gms.measurement.internal.zzpg r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzhy r4 = r3.zzaW()
            r4.zzg()
            com.google.android.gms.measurement.internal.zzhj r4 = new com.google.android.gms.measurement.internal.zzhj
            r4.<init>(r3)
            r3.zzm = r4
            com.google.android.gms.measurement.internal.zzav r4 = new com.google.android.gms.measurement.internal.zzav
            r4.<init>(r3)
            r4.zzaz()
            r3.zze = r4
            com.google.android.gms.measurement.internal.zzhs r4 = r3.zzc
            com.google.android.gms.measurement.internal.zzal r0 = r3.zzd()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.measurement.internal.zzak r4 = (com.google.android.gms.measurement.internal.zzak) r4
            r0.zza(r4)
            com.google.android.gms.measurement.internal.zznm r4 = new com.google.android.gms.measurement.internal.zznm
            r4.<init>(r3)
            r4.zzaz()
            r3.zzk = r4
            com.google.android.gms.measurement.internal.zzad r4 = new com.google.android.gms.measurement.internal.zzad
            r4.<init>(r3)
            r4.zzaz()
            r3.zzh = r4
            com.google.android.gms.measurement.internal.zzlo r4 = new com.google.android.gms.measurement.internal.zzlo
            r4.<init>(r3)
            r4.zzaz()
            r3.zzj = r4
            com.google.android.gms.measurement.internal.zzoj r4 = new com.google.android.gms.measurement.internal.zzoj
            r4.<init>(r3)
            r4.zzaz()
            r3.zzg = r4
            com.google.android.gms.measurement.internal.zzha r4 = new com.google.android.gms.measurement.internal.zzha
            r4.<init>(r3)
            r3.zzf = r4
            int r4 = r3.zzs
            int r0 = r3.zzt
            if (r4 == r0) goto L75
            com.google.android.gms.measurement.internal.zzgt r4 = r3.zzaV()
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzb()
            int r0 = r3.zzs
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r3.zzt
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Not all upload components initialized"
            r4.zzc(r2, r0, r1)
        L75:
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.zzo
            r0 = 1
            r4.set(r0)
            com.google.android.gms.measurement.internal.zzgt r4 = r3.zzaV()
            com.google.android.gms.measurement.internal.zzgr r4 = r4.zzk()
            java.lang.String r0 = "UploadController is now fully initialized"
            r4.zza(r0)
            return
    }

    public final /* synthetic */ void zzau() {
            r0 = this;
            r0.zzaE()
            return
    }

    public final /* synthetic */ com.google.android.gms.measurement.internal.zzib zzaw() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzn
            return r0
    }

    public final /* synthetic */ java.util.Deque zzax() {
            r1 = this;
            java.util.Deque r0 = r1.zzr
            return r0
    }

    public final /* synthetic */ void zzay(long r1) {
            r0 = this;
            r0.zzJ = r1
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzc() {
            r8 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r8.zzaW()
            r0.zzg()
            com.google.android.gms.measurement.internal.zzav r0 = r8.zzj()
            r0.zzI()
            com.google.android.gms.measurement.internal.zzav r0 = r8.zzj()
            r0.zzg()
            r0.zzay()
            boolean r1 = r0.zzai()
            r2 = 0
            if (r1 == 0) goto L6c
            com.google.android.gms.measurement.internal.zzfw r1 = com.google.android.gms.measurement.internal.zzfx.zzav
            r4 = 0
            java.lang.Object r5 = r1.zzb(r4)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 != 0) goto L32
            goto L6c
        L32:
            android.database.sqlite.SQLiteDatabase r5 = r0.zze()
            com.google.android.gms.measurement.internal.zzib r0 = r0.zzu
            com.google.android.gms.common.util.Clock r6 = r0.zzaZ()
            long r6 = r6.currentTimeMillis()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Object r1 = r1.zzb(r4)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String[] r1 = new java.lang.String[]{r6, r1}
            java.lang.String r4 = "trigger_uris"
            java.lang.String r6 = "abs(timestamp_millis - ?) > cast(? as integer)"
            int r1 = r5.delete(r4, r6, r1)
            if (r1 <= 0) goto L6c
            com.google.android.gms.measurement.internal.zzgt r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r4 = "Deleted stale trigger uris. rowsDeleted"
            r0.zzb(r4, r1)
        L6c:
            com.google.android.gms.measurement.internal.zznm r0 = r8.zzk
            com.google.android.gms.measurement.internal.zzhd r0 = r0.zzd
            long r0 = r0.zza()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L87
            com.google.android.gms.measurement.internal.zznm r0 = r8.zzk
            com.google.android.gms.measurement.internal.zzhd r0 = r0.zzd
            com.google.android.gms.common.util.Clock r1 = r8.zzaZ()
            long r1 = r1.currentTimeMillis()
            r0.zzb(r1)
        L87:
            r8.zzaK()
            return
    }

    public final com.google.android.gms.measurement.internal.zzal zzd() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzn
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzib r0 = (com.google.android.gms.measurement.internal.zzib) r0
            com.google.android.gms.measurement.internal.zzal r0 = r0.zzc()
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzot zzf() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzot r0 = r1.zzl
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzhs zzh() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhs r0 = r1.zzc
            zzaS(r0)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzgy zzi() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzgy r0 = r1.zzd
            zzaS(r0)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzav zzj() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzav r0 = r1.zze
            zzaS(r0)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzha zzk() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzha r0 = r2.zzf
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Network broadcast receiver not created"
            r0.<init>(r1)
            throw r0
    }

    public final com.google.android.gms.measurement.internal.zzoj zzl() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzoj r0 = r1.zzg
            zzaS(r0)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzad zzm() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzad r0 = r1.zzh
            zzaS(r0)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzlo zzn() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlo r0 = r1.zzj
            zzaS(r0)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzpj zzp() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzpj r0 = r1.zzi
            zzaS(r0)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zznm zzq() {
            r1 = this;
            com.google.android.gms.measurement.internal.zznm r0 = r1.zzk
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzgm zzs() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzn
            com.google.android.gms.measurement.internal.zzgm r0 = r0.zzl()
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzpo zzt() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r1.zzn
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzib r0 = (com.google.android.gms.measurement.internal.zzib) r0
            com.google.android.gms.measurement.internal.zzpo r0 = r0.zzk()
            return r0
    }

    public final void zzu() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzo
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "UploadController is not initialized"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.WorkerThread
    public final void zzv(com.google.android.gms.measurement.internal.zzr r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r3.zzaW()
            r0.zzg()
            r3.zzu()
            java.lang.String r0 = r4.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            int r1 = r4.zzx
            java.lang.String r4 = r4.zzs
            com.google.android.gms.measurement.internal.zzjk r4 = com.google.android.gms.measurement.internal.zzjk.zzf(r4, r1)
            r3.zzB(r0)
            com.google.android.gms.measurement.internal.zzgt r1 = r3.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()
            java.lang.String r2 = "Setting storage consent for package"
            r1.zzc(r2, r0, r4)
            r3.zzA(r0, r4)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzw(com.google.android.gms.measurement.internal.zzr r13) {
            r12 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r12.zzaW()
            r0.zzg()
            r12.zzu()
            java.lang.String r4 = r13.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            java.lang.String r13 = r13.zzy
            com.google.android.gms.measurement.internal.zzaz r13 = com.google.android.gms.measurement.internal.zzaz.zzg(r13)
            com.google.android.gms.measurement.internal.zzgt r0 = r12.zzaV()
            com.google.android.gms.measurement.internal.zzgr r0 = r0.zzk()
            java.lang.String r1 = "Setting DMA consent for package"
            r0.zzc(r1, r4, r13)
            com.google.android.gms.measurement.internal.zzhy r0 = r12.zzaW()
            r0.zzg()
            r12.zzu()
            android.os.Bundle r0 = r12.zzy(r4)
            r1 = 100
            com.google.android.gms.measurement.internal.zzaz r0 = com.google.android.gms.measurement.internal.zzaz.zzh(r0, r1)
            com.google.android.gms.measurement.internal.zzjh r0 = r0.zzc()
            java.util.Map r2 = r12.zzD
            r2.put(r4, r13)
            com.google.android.gms.measurement.internal.zzav r2 = r12.zzj()
            r2.zzad(r4, r13)
            android.os.Bundle r13 = r12.zzy(r4)
            com.google.android.gms.measurement.internal.zzaz r13 = com.google.android.gms.measurement.internal.zzaz.zzh(r13, r1)
            com.google.android.gms.measurement.internal.zzjh r13 = r13.zzc()
            com.google.android.gms.measurement.internal.zzhy r1 = r12.zzaW()
            r1.zzg()
            r12.zzu()
            com.google.android.gms.measurement.internal.zzjh r1 = com.google.android.gms.measurement.internal.zzjh.zzc
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L68
            com.google.android.gms.measurement.internal.zzjh r5 = com.google.android.gms.measurement.internal.zzjh.zzd
            if (r13 != r5) goto L68
            r5 = r2
            goto L69
        L68:
            r5 = r3
        L69:
            com.google.android.gms.measurement.internal.zzjh r6 = com.google.android.gms.measurement.internal.zzjh.zzd
            if (r0 != r6) goto L70
            if (r13 != r1) goto L70
            goto L71
        L70:
            r2 = r3
        L71:
            if (r5 != 0) goto L77
            if (r2 == 0) goto L76
            goto L77
        L76:
            return
        L77:
            com.google.android.gms.measurement.internal.zzgt r13 = r12.zzaV()
            com.google.android.gms.measurement.internal.zzgr r13 = r13.zzk()
            java.lang.String r0 = "Generated _dcu event for"
            r13.zzb(r0, r4)
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            com.google.android.gms.measurement.internal.zzav r1 = r12.zzj()
            long r2 = r12.zzC()
            r10 = 0
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.google.android.gms.measurement.internal.zzar r0 = r1.zzw(r2, r4, r5, r6, r7, r8, r9, r10, r11)
            long r0 = r0.zzf
            com.google.android.gms.measurement.internal.zzal r2 = r12.zzd()
            com.google.android.gms.measurement.internal.zzfw r3 = com.google.android.gms.measurement.internal.zzfx.zzam
            int r2 = r2.zzm(r4, r3)
            long r2 = (long) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto Lda
            java.lang.String r0 = "_r"
            r1 = 1
            r13.putLong(r0, r1)
            com.google.android.gms.measurement.internal.zzav r1 = r12.zzj()
            long r2 = r12.zzC()
            r10 = 1
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.google.android.gms.measurement.internal.zzar r0 = r1.zzw(r2, r4, r5, r6, r7, r8, r9, r10, r11)
            com.google.android.gms.measurement.internal.zzgt r1 = r12.zzaV()
            com.google.android.gms.measurement.internal.zzgr r1 = r1.zzk()
            long r2 = r0.zzf
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "_dcu realtime event count"
            r1.zzc(r2, r4, r0)
        Lda:
            com.google.android.gms.measurement.internal.zzpn r0 = r12.zzK
            java.lang.String r1 = "_dcu"
            r0.zza(r4, r1, r13)
            return
    }

    @androidx.annotation.WorkerThread
    public final com.google.android.gms.measurement.internal.zzaz zzx(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r2.zzaW()
            r0.zzg()
            r2.zzu()
            java.util.Map r0 = r2.zzD
            java.lang.Object r1 = r0.get(r3)
            com.google.android.gms.measurement.internal.zzaz r1 = (com.google.android.gms.measurement.internal.zzaz) r1
            if (r1 != 0) goto L1f
            com.google.android.gms.measurement.internal.zzav r1 = r2.zzj()
            com.google.android.gms.measurement.internal.zzaz r1 = r1.zzac(r3)
            r0.put(r3, r1)
        L1f:
            return r1
    }

    @androidx.annotation.WorkerThread
    public final android.os.Bundle zzy(java.lang.String r5) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzhy r0 = r4.zzaW()
            r0.zzg()
            r4.zzu()
            com.google.android.gms.measurement.internal.zzhs r0 = r4.zzh()
            com.google.android.gms.internal.measurement.zzgf r0 = r0.zzx(r5)
            if (r0 != 0) goto L16
            r5 = 0
            return r5
        L16:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.zzjk r1 = r4.zzB(r5)
            android.os.Bundle r2 = r1.zzn()
            r0.putAll(r2)
            com.google.android.gms.measurement.internal.zzaz r2 = r4.zzx(r5)
            com.google.android.gms.measurement.internal.zzan r3 = new com.google.android.gms.measurement.internal.zzan
            r3.<init>()
            com.google.android.gms.measurement.internal.zzaz r1 = r4.zzz(r5, r2, r1, r3)
            android.os.Bundle r1 = r1.zzf()
            r0.putAll(r1)
            com.google.android.gms.measurement.internal.zzav r1 = r4.zzj()
            java.lang.String r2 = "_npa"
            com.google.android.gms.measurement.internal.zzpm r1 = r1.zzm(r5, r2)
            if (r1 == 0) goto L53
            java.lang.Object r5 = r1.zze
            r1 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r5 = r5.equals(r1)
            goto L5c
        L53:
            com.google.android.gms.measurement.internal.zzan r1 = new com.google.android.gms.measurement.internal.zzan
            r1.<init>()
            int r5 = r4.zzaB(r5, r1)
        L5c:
            r1 = 1
            if (r1 == r5) goto L62
            java.lang.String r5 = "granted"
            goto L64
        L62:
            java.lang.String r5 = "denied"
        L64:
            java.lang.String r1 = "ad_personalization"
            r0.putString(r1, r5)
            return r0
    }

    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    public final com.google.android.gms.measurement.internal.zzaz zzz(java.lang.String r10, com.google.android.gms.measurement.internal.zzaz r11, com.google.android.gms.measurement.internal.zzjk r12, com.google.android.gms.measurement.internal.zzan r13) {
            r9 = this;
            com.google.android.gms.measurement.internal.zzhs r0 = r9.zzh()
            com.google.android.gms.internal.measurement.zzgf r0 = r0.zzx(r10)
            java.lang.String r1 = "-"
            r2 = 90
            if (r0 != 0) goto L31
            com.google.android.gms.measurement.internal.zzjh r10 = r11.zzc()
            com.google.android.gms.measurement.internal.zzjh r12 = com.google.android.gms.measurement.internal.zzjh.zzc
            if (r10 != r12) goto L20
            int r2 = r11.zzb()
            com.google.android.gms.measurement.internal.zzjj r10 = com.google.android.gms.measurement.internal.zzjj.zzc
            r13.zzb(r10, r2)
            goto L27
        L20:
            com.google.android.gms.measurement.internal.zzjj r10 = com.google.android.gms.measurement.internal.zzjj.zzc
            com.google.android.gms.measurement.internal.zzam r11 = com.google.android.gms.measurement.internal.zzam.zzj
            r13.zzc(r10, r11)
        L27:
            com.google.android.gms.measurement.internal.zzaz r10 = new com.google.android.gms.measurement.internal.zzaz
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r10.<init>(r11, r2, r12, r1)
            return r10
        L31:
            com.google.android.gms.measurement.internal.zzjh r0 = r11.zzc()
            com.google.android.gms.measurement.internal.zzjh r3 = com.google.android.gms.measurement.internal.zzjh.zzd
            if (r0 == r3) goto L85
            com.google.android.gms.measurement.internal.zzjh r4 = com.google.android.gms.measurement.internal.zzjh.zzc
            if (r0 != r4) goto L3e
            goto L85
        L3e:
            com.google.android.gms.measurement.internal.zzjh r11 = com.google.android.gms.measurement.internal.zzjh.zzb
            if (r0 != r11) goto L55
            com.google.android.gms.measurement.internal.zzhs r11 = r9.zzc
            com.google.android.gms.measurement.internal.zzjj r0 = com.google.android.gms.measurement.internal.zzjj.zzc
            com.google.android.gms.measurement.internal.zzjh r11 = r11.zzA(r10, r0)
            com.google.android.gms.measurement.internal.zzjh r5 = com.google.android.gms.measurement.internal.zzjh.zza
            if (r11 == r5) goto L55
            com.google.android.gms.measurement.internal.zzam r12 = com.google.android.gms.measurement.internal.zzam.zzi
            r13.zzc(r0, r12)
            r0 = r11
            goto L8e
        L55:
            com.google.android.gms.measurement.internal.zzhs r11 = r9.zzc
            com.google.android.gms.measurement.internal.zzjj r0 = com.google.android.gms.measurement.internal.zzjj.zzc
            com.google.android.gms.measurement.internal.zzjj r5 = r11.zzw(r10, r0)
            com.google.android.gms.measurement.internal.zzjh r12 = r12.zzp()
            r6 = 1
            if (r12 == r3) goto L66
            if (r12 != r4) goto L68
        L66:
            r7 = r6
            goto L69
        L68:
            r7 = 0
        L69:
            com.google.android.gms.measurement.internal.zzjj r8 = com.google.android.gms.measurement.internal.zzjj.zza
            if (r5 != r8) goto L76
            if (r7 == 0) goto L76
            com.google.android.gms.measurement.internal.zzam r11 = com.google.android.gms.measurement.internal.zzam.zzc
            r13.zzc(r0, r11)
            r0 = r12
            goto L8e
        L76:
            com.google.android.gms.measurement.internal.zzam r12 = com.google.android.gms.measurement.internal.zzam.zzb
            r13.zzc(r0, r12)
            boolean r11 = r11.zzv(r10, r0)
            if (r6 == r11) goto L83
            r0 = r4
            goto L8e
        L83:
            r0 = r3
            goto L8e
        L85:
            int r2 = r11.zzb()
            com.google.android.gms.measurement.internal.zzjj r11 = com.google.android.gms.measurement.internal.zzjj.zzc
            r13.zzb(r11, r2)
        L8e:
            com.google.android.gms.measurement.internal.zzhs r11 = r9.zzc
            boolean r11 = r11.zzy(r10)
            com.google.android.gms.measurement.internal.zzhs r12 = r9.zzh()
            java.util.SortedSet r10 = r12.zzz(r10)
            com.google.android.gms.measurement.internal.zzjh r12 = com.google.android.gms.measurement.internal.zzjh.zzc
            if (r0 == r12) goto Lbb
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto La7
            goto Lbb
        La7:
            com.google.android.gms.measurement.internal.zzaz r12 = new com.google.android.gms.measurement.internal.zzaz
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.String r1 = ""
            if (r11 == 0) goto Lb7
            java.lang.String r1 = android.text.TextUtils.join(r1, r10)
        Lb7:
            r12.<init>(r13, r2, r0, r1)
            return r12
        Lbb:
            com.google.android.gms.measurement.internal.zzaz r10 = new com.google.android.gms.measurement.internal.zzaz
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.<init>(r12, r2, r11, r1)
            return r10
    }
}
