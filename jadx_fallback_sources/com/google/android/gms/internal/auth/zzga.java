package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
final class zzga<T> implements com.google.android.gms.internal.auth.zzgi<T> {
    private static final int[] zza = null;
    private static final sun.misc.Unsafe zzb = null;
    private final int[] zzc;
    private final java.lang.Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.gms.internal.auth.zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final com.google.android.gms.internal.auth.zzfl zzk;
    private final com.google.android.gms.internal.auth.zzgz zzl;
    private final com.google.android.gms.internal.auth.zzem zzm;
    private final com.google.android.gms.internal.auth.zzgc zzn;
    private final com.google.android.gms.internal.auth.zzfs zzo;

    static {
            r0 = 0
            int[] r0 = new int[r0]
            com.google.android.gms.internal.auth.zzga.zza = r0
            sun.misc.Unsafe r0 = com.google.android.gms.internal.auth.zzhj.zzg()
            com.google.android.gms.internal.auth.zzga.zzb = r0
            return
    }

    private zzga(int[] r1, java.lang.Object[] r2, int r3, int r4, com.google.android.gms.internal.auth.zzfx r5, int r6, boolean r7, int[] r8, int r9, int r10, com.google.android.gms.internal.auth.zzgc r11, com.google.android.gms.internal.auth.zzfl r12, com.google.android.gms.internal.auth.zzgz r13, com.google.android.gms.internal.auth.zzem r14, com.google.android.gms.internal.auth.zzfs r15) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r2
            r0.zze = r3
            r0.zzf = r4
            r0.zzh = r8
            r0.zzi = r9
            r0.zzj = r10
            r0.zzn = r11
            r0.zzk = r12
            r0.zzl = r13
            r0.zzm = r14
            r0.zzg = r5
            r0.zzo = r15
            return
    }

    private final void zzA(java.lang.Object r3, int r4, int r5) {
            r2 = this;
            int r5 = r2.zzl(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            com.google.android.gms.internal.auth.zzhj.zzn(r3, r0, r4)
            return
    }

    private final void zzB(java.lang.Object r4, int r5, java.lang.Object r6) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.android.gms.internal.auth.zzga.zzb
            int r1 = r3.zzo(r5)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            r0.putObject(r4, r1, r6)
            r3.zzz(r4, r5)
            return
    }

    private final void zzC(java.lang.Object r4, int r5, int r6, java.lang.Object r7) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.android.gms.internal.auth.zzga.zzb
            int r1 = r3.zzo(r6)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            r0.putObject(r4, r1, r7)
            r3.zzA(r4, r5, r6)
            return
    }

    private final boolean zzD(java.lang.Object r1, java.lang.Object r2, int r3) {
            r0 = this;
            boolean r1 = r0.zzE(r1, r3)
            boolean r2 = r0.zzE(r2, r3)
            if (r1 != r2) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private final boolean zzE(java.lang.Object r8, int r9) {
            r7 = this;
            int r0 = r7.zzl(r9)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r0 & r1
            long r2 = (long) r2
            r4 = 1048575(0xfffff, double:5.18065E-318)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 != 0) goto Lee
            int r9 = r7.zzo(r9)
            r0 = r9 & r1
            int r9 = zzn(r9)
            long r0 = (long) r0
            r2 = 0
            switch(r9) {
                case 0: goto Le0;
                case 1: goto Ld4;
                case 2: goto Lca;
                case 3: goto Lc0;
                case 4: goto Lb8;
                case 5: goto Lae;
                case 6: goto La6;
                case 7: goto La1;
                case 8: goto L7b;
                case 9: goto L73;
                case 10: goto L65;
                case 11: goto L5d;
                case 12: goto L55;
                case 13: goto L4d;
                case 14: goto L43;
                case 15: goto L3b;
                case 16: goto L31;
                case 17: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L29:
            java.lang.Object r8 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r0)
            if (r8 == 0) goto L30
            return r6
        L30:
            return r5
        L31:
            long r8 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r0)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto L3a
            return r6
        L3a:
            return r5
        L3b:
            int r8 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r0)
            if (r8 == 0) goto L42
            return r6
        L42:
            return r5
        L43:
            long r8 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r0)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto L4c
            return r6
        L4c:
            return r5
        L4d:
            int r8 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r0)
            if (r8 == 0) goto L54
            return r6
        L54:
            return r5
        L55:
            int r8 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r0)
            if (r8 == 0) goto L5c
            return r6
        L5c:
            return r5
        L5d:
            int r8 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r0)
            if (r8 == 0) goto L64
            return r6
        L64:
            return r5
        L65:
            com.google.android.gms.internal.auth.zzef r9 = com.google.android.gms.internal.auth.zzef.zzb
            java.lang.Object r8 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r0)
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L72
            return r6
        L72:
            return r5
        L73:
            java.lang.Object r8 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r0)
            if (r8 == 0) goto L7a
            return r6
        L7a:
            return r5
        L7b:
            java.lang.Object r8 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r0)
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L8d
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L8c
            return r6
        L8c:
            return r5
        L8d:
            boolean r9 = r8 instanceof com.google.android.gms.internal.auth.zzef
            if (r9 == 0) goto L9b
            com.google.android.gms.internal.auth.zzef r9 = com.google.android.gms.internal.auth.zzef.zzb
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L9a
            return r6
        L9a:
            return r5
        L9b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        La1:
            boolean r8 = com.google.android.gms.internal.auth.zzhj.zzt(r8, r0)
            return r8
        La6:
            int r8 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r0)
            if (r8 == 0) goto Lad
            return r6
        Lad:
            return r5
        Lae:
            long r8 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r0)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto Lb7
            return r6
        Lb7:
            return r5
        Lb8:
            int r8 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r0)
            if (r8 == 0) goto Lbf
            return r6
        Lbf:
            return r5
        Lc0:
            long r8 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r0)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto Lc9
            return r6
        Lc9:
            return r5
        Lca:
            long r8 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r0)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto Ld3
            return r6
        Ld3:
            return r5
        Ld4:
            float r8 = com.google.android.gms.internal.auth.zzhj.zzb(r8, r0)
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            if (r8 == 0) goto Ldf
            return r6
        Ldf:
            return r5
        Le0:
            double r8 = com.google.android.gms.internal.auth.zzhj.zza(r8, r0)
            long r8 = java.lang.Double.doubleToRawLongBits(r8)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto Led
            return r6
        Led:
            return r5
        Lee:
            int r9 = r0 >>> 20
            int r9 = r6 << r9
            int r8 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r2)
            r8 = r8 & r9
            if (r8 == 0) goto Lfa
            return r6
        Lfa:
            return r5
    }

    private final boolean zzF(java.lang.Object r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r0) goto La
            boolean r2 = r1.zzE(r2, r3)
            return r2
        La:
            r2 = r5 & r6
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    private static boolean zzG(java.lang.Object r2, int r3, com.google.android.gms.internal.auth.zzgi r4) {
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r0
            long r0 = (long) r3
            java.lang.Object r2 = com.google.android.gms.internal.auth.zzhj.zzf(r2, r0)
            boolean r2 = r4.zzi(r2)
            return r2
    }

    private static boolean zzH(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = r1 instanceof com.google.android.gms.internal.auth.zzev
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.auth.zzev r1 = (com.google.android.gms.internal.auth.zzev) r1
            boolean r1 = r1.zzm()
            return r1
        Lf:
            r1 = 1
            return r1
    }

    private final boolean zzI(java.lang.Object r3, int r4, int r5) {
            r2 = this;
            int r5 = r2.zzl(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r3, r0)
            if (r3 != r4) goto L11
            r3 = 1
            return r3
        L11:
            r3 = 0
            return r3
    }

    public static com.google.android.gms.internal.auth.zzha zzc(java.lang.Object r2) {
            com.google.android.gms.internal.auth.zzev r2 = (com.google.android.gms.internal.auth.zzev) r2
            com.google.android.gms.internal.auth.zzha r0 = r2.zzc
            com.google.android.gms.internal.auth.zzha r1 = com.google.android.gms.internal.auth.zzha.zza()
            if (r0 != r1) goto L10
            com.google.android.gms.internal.auth.zzha r0 = com.google.android.gms.internal.auth.zzha.zzd()
            r2.zzc = r0
        L10:
            return r0
    }

    public static com.google.android.gms.internal.auth.zzga zzj(java.lang.Class r31, com.google.android.gms.internal.auth.zzfu r32, com.google.android.gms.internal.auth.zzgc r33, com.google.android.gms.internal.auth.zzfl r34, com.google.android.gms.internal.auth.zzgz r35, com.google.android.gms.internal.auth.zzem r36, com.google.android.gms.internal.auth.zzfs r37) {
            r0 = r32
            boolean r1 = r0 instanceof com.google.android.gms.internal.auth.zzgh
            if (r1 == 0) goto L3e1
            com.google.android.gms.internal.auth.zzgh r0 = (com.google.android.gms.internal.auth.zzgh) r0
            java.lang.String r1 = r0.zzd()
            int r2 = r1.length()
            r3 = 0
            char r4 = r1.charAt(r3)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L25
            r4 = 1
        L1b:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L26
            r4 = r7
            goto L1b
        L25:
            r7 = 1
        L26:
            int r4 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L45
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L32:
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L42
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r9
            r7 = r7 | r4
            int r9 = r9 + 13
            r4 = r10
            goto L32
        L42:
            int r4 = r4 << r9
            r7 = r7 | r4
            r4 = r10
        L45:
            if (r7 != 0) goto L57
            int[] r7 = com.google.android.gms.internal.auth.zzga.zza
            r9 = r3
            r11 = r9
            r12 = r11
            r13 = r12
            r16 = r13
            r18 = r16
            r17 = r7
            r7 = r18
            goto L169
        L57:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L76
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L63:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L73
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r4 = r4 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L63
        L73:
            int r7 = r7 << r9
            r4 = r4 | r7
            r7 = r10
        L76:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L95
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L82:
            int r11 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L92
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L82
        L92:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r11
        L95:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto Lb4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        La1:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto Lb1
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto La1
        Lb1:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        Lb4:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto Ld3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        Lc0:
            int r13 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto Ld0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto Lc0
        Ld0:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        Ld3:
            int r12 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto Lf2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        Ldf:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto Lef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto Ldf
        Lef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        Lf2:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        Lfe:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L10e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto Lfe
        L10e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L111:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L11d:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L12e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L11d
        L12e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L132:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L13e:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r5) goto L150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L13e
        L150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int r16 = r4 + r4
            int r16 = r16 + r7
            int[] r7 = new int[r13]
            r13 = r12
            r12 = r9
            r9 = r13
            r17 = r7
            r13 = r10
            r18 = r14
            r7 = r4
            r4 = r15
        L169:
            sun.misc.Unsafe r10 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object[] r14 = r0.zze()
            com.google.android.gms.internal.auth.zzfx r15 = r0.zza()
            java.lang.Class r15 = r15.getClass()
            int r19 = r18 + r9
            int r9 = r11 + r11
            int r11 = r11 * 3
            int[] r11 = new int[r11]
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r20 = r3
            r21 = r20
            r22 = r18
            r23 = r19
        L189:
            if (r4 >= r2) goto L3c2
            int r24 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L1b1
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L199:
            int r25 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r5) goto L1ab
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r25
            goto L199
        L1ab:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r25
            goto L1b3
        L1b1:
            r3 = r24
        L1b3:
            int r24 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r5) goto L1d9
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r8 = r24
            r24 = 13
        L1c1:
            int r25 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L1d3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r24
            r3 = r3 | r8
            int r24 = r24 + 13
            r8 = r25
            goto L1c1
        L1d3:
            int r8 = r8 << r24
            r3 = r3 | r8
            r8 = r25
            goto L1db
        L1d9:
            r8 = r24
        L1db:
            r6 = r3 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L1e5
            int r6 = r20 + 1
            r17[r20] = r21
            r20 = r6
        L1e5:
            r6 = r3 & 255(0xff, float:3.57E-43)
            r5 = 51
            if (r6 < r5) goto L287
            int r5 = r8 + 1
            char r8 = r1.charAt(r8)
            r26 = r0
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r0) goto L216
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r29 = 13
        L1fc:
            int r30 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r0) goto L211
            r0 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r29
            r8 = r8 | r0
            int r29 = r29 + 13
            r5 = r30
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L1fc
        L211:
            int r0 = r5 << r29
            r8 = r8 | r0
            r5 = r30
        L216:
            int r0 = r6 + (-51)
            r29 = r2
            r2 = 9
            if (r0 == r2) goto L23f
            r2 = 17
            if (r0 != r2) goto L223
            goto L23f
        L223:
            r2 = 12
            if (r0 != r2) goto L24d
            int r0 = r26.zzc()
            r2 = 1
            if (r0 == r2) goto L232
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L24d
        L232:
            int r0 = r21 / 3
            int r0 = r0 + r0
            int r0 = r0 + r2
            int r2 = r16 + 1
            r16 = r14[r16]
            r9[r0] = r16
        L23c:
            r16 = r2
            goto L24d
        L23f:
            int r0 = r21 / 3
            int r0 = r0 + r0
            r24 = 1
            int r0 = r0 + 1
            int r2 = r16 + 1
            r16 = r14[r16]
            r9[r0] = r16
            goto L23c
        L24d:
            int r8 = r8 + r8
            r0 = r14[r8]
            boolean r2 = r0 instanceof java.lang.reflect.Field
            if (r2 == 0) goto L25a
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
        L256:
            r2 = r4
            r27 = r5
            goto L263
        L25a:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = zzv(r15, r0)
            r14[r8] = r0
            goto L256
        L263:
            long r4 = r10.objectFieldOffset(r0)
            int r0 = (int) r4
            int r8 = r8 + 1
            r4 = r14[r8]
            boolean r5 = r4 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L273
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            goto L27b
        L273:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = zzv(r15, r4)
            r14[r8] = r4
        L27b:
            long r4 = r10.objectFieldOffset(r4)
            int r4 = (int) r4
            r28 = r1
            r25 = r27
            r8 = 0
            goto L384
        L287:
            r26 = r0
            r29 = r2
            r2 = r4
            int r0 = r16 + 1
            r4 = r14[r16]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = zzv(r15, r4)
            r5 = 9
            if (r6 == r5) goto L29e
            r5 = 17
            if (r6 != r5) goto L2a3
        L29e:
            r27 = r0
            r0 = 1
            goto L308
        L2a3:
            r5 = 27
            if (r6 == r5) goto L2ab
            r5 = 49
            if (r6 != r5) goto L2af
        L2ab:
            r27 = r0
            r0 = 1
            goto L2fd
        L2af:
            r5 = 12
            if (r6 == r5) goto L2e3
            r5 = 30
            if (r6 == r5) goto L2e3
            r5 = 44
            if (r6 != r5) goto L2bc
            goto L2e3
        L2bc:
            r5 = 50
            if (r6 != r5) goto L2e0
            int r5 = r22 + 1
            r17[r22] = r21
            int r22 = r21 / 3
            int r27 = r16 + 2
            r0 = r14[r0]
            int r22 = r22 + r22
            r9[r22] = r0
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L2dc
            int r22 = r22 + 1
            int r0 = r16 + 3
            r16 = r14[r27]
            r9[r22] = r16
            r27 = r0
        L2dc:
            r22 = r5
        L2de:
            r0 = 1
            goto L312
        L2e0:
            r27 = r0
            goto L2de
        L2e3:
            int r5 = r26.zzc()
            r27 = r0
            r0 = 1
            if (r5 == r0) goto L2f0
            r5 = r3 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L312
        L2f0:
            int r5 = r21 / 3
            int r5 = r5 + r5
            int r5 = r5 + r0
            int r16 = r16 + 2
            r24 = r14[r27]
            r9[r5] = r24
        L2fa:
            r27 = r16
            goto L312
        L2fd:
            int r5 = r21 / 3
            int r5 = r5 + r5
            int r5 = r5 + r0
            int r16 = r16 + 2
            r24 = r14[r27]
            r9[r5] = r24
            goto L2fa
        L308:
            int r5 = r21 / 3
            int r5 = r5 + r5
            int r5 = r5 + r0
            java.lang.Class r16 = r4.getType()
            r9[r5] = r16
        L312:
            long r4 = r10.objectFieldOffset(r4)
            int r4 = (int) r4
            r5 = r3 & 4096(0x1000, float:5.74E-42)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == 0) goto L36c
            r5 = 17
            if (r6 > r5) goto L36c
            int r5 = r8 + 1
            char r8 = r1.charAt(r8)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r0) goto L347
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L331:
            int r25 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r0) goto L343
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r16
            r8 = r8 | r5
            int r16 = r16 + 13
            r5 = r25
            goto L331
        L343:
            int r5 = r5 << r16
            r8 = r8 | r5
            goto L349
        L347:
            r25 = r5
        L349:
            int r5 = r7 + r7
            int r16 = r8 / 32
            int r5 = r5 + r16
            r0 = r14[r5]
            r28 = r1
            boolean r1 = r0 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L35a
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L362
        L35a:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = zzv(r15, r0)
            r14[r5] = r0
        L362:
            long r0 = r10.objectFieldOffset(r0)
            int r0 = (int) r0
            int r8 = r8 % 32
            r16 = r0
            goto L371
        L36c:
            r28 = r1
            r25 = r8
            r8 = 0
        L371:
            r0 = 18
            if (r6 < r0) goto L37f
            r5 = 49
            if (r6 > r5) goto L37f
            int r0 = r23 + 1
            r17[r23] = r4
            r23 = r0
        L37f:
            r0 = r4
            r4 = r16
            r16 = r27
        L384:
            int r1 = r21 + 1
            r11[r21] = r2
            int r2 = r21 + 2
            r5 = r3 & 512(0x200, float:7.17E-43)
            if (r5 == 0) goto L391
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L392
        L391:
            r5 = 0
        L392:
            r27 = r0
            r0 = r3 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L39b
            r0 = 268435456(0x10000000, float:2.524355E-29)
            goto L39c
        L39b:
            r0 = 0
        L39c:
            r3 = r3 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L3a3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L3a4
        L3a3:
            r3 = 0
        L3a4:
            int r6 = r6 << 20
            r0 = r0 | r5
            r0 = r0 | r3
            r0 = r0 | r6
            r0 = r0 | r27
            r11[r1] = r0
            int r21 = r21 + 3
            int r0 = r8 << 20
            r0 = r0 | r4
            r11[r2] = r0
            r4 = r25
            r0 = r26
            r1 = r28
            r2 = r29
            r3 = 0
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L189
        L3c2:
            r26 = r0
            com.google.android.gms.internal.auth.zzga r0 = new com.google.android.gms.internal.auth.zzga
            com.google.android.gms.internal.auth.zzfx r14 = r26.zza()
            int r15 = r26.zzc()
            r16 = 0
            r20 = r33
            r21 = r34
            r22 = r35
            r23 = r36
            r24 = r37
            r10 = r11
            r11 = r9
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r9
        L3e1:
            com.google.android.gms.internal.auth.zzgw r0 = (com.google.android.gms.internal.auth.zzgw) r0
            r0 = 0
            throw r0
    }

    private static int zzk(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.auth.zzhj.zzf(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    private final int zzl(int r2) {
            r1 = this;
            int[] r0 = r1.zzc
            int r2 = r2 + 2
            r2 = r0[r2]
            return r2
    }

    private final int zzm(int r6, int r7) {
            r5 = this;
            int[] r0 = r5.zzc
            int r0 = r0.length
            int r0 = r0 / 3
            r1 = -1
            int r0 = r0 + r1
        L7:
            if (r7 > r0) goto L1e
            int r2 = r0 + r7
            int r2 = r2 >>> 1
            int r3 = r2 * 3
            int[] r4 = r5.zzc
            r4 = r4[r3]
            if (r6 != r4) goto L16
            return r3
        L16:
            if (r6 >= r4) goto L1b
            int r0 = r2 + (-1)
            goto L7
        L1b:
            int r7 = r2 + 1
            goto L7
        L1e:
            return r1
    }

    private static int zzn(int r0) {
            int r0 = r0 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    private final int zzo(int r2) {
            r1 = this;
            int[] r0 = r1.zzc
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    private static long zzp(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.auth.zzhj.zzf(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    private final com.google.android.gms.internal.auth.zzey zzq(int r2) {
            r1 = this;
            int r2 = r2 / 3
            int r2 = r2 + r2
            java.lang.Object[] r0 = r1.zzd
            int r2 = r2 + 1
            r2 = r0[r2]
            com.google.android.gms.internal.auth.zzey r2 = (com.google.android.gms.internal.auth.zzey) r2
            return r2
    }

    private final com.google.android.gms.internal.auth.zzgi zzr(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.zzd
            int r4 = r4 / 3
            int r4 = r4 + r4
            r0 = r0[r4]
            com.google.android.gms.internal.auth.zzgi r0 = (com.google.android.gms.internal.auth.zzgi) r0
            if (r0 == 0) goto Lc
            return r0
        Lc:
            com.google.android.gms.internal.auth.zzgf r0 = com.google.android.gms.internal.auth.zzgf.zza()
            java.lang.Object[] r1 = r3.zzd
            int r2 = r4 + 1
            r1 = r1[r2]
            java.lang.Class r1 = (java.lang.Class) r1
            com.google.android.gms.internal.auth.zzgi r0 = r0.zzb(r1)
            java.lang.Object[] r1 = r3.zzd
            r1[r4] = r0
            return r0
    }

    private final java.lang.Object zzs(int r2) {
            r1 = this;
            int r2 = r2 / 3
            java.lang.Object[] r0 = r1.zzd
            int r2 = r2 + r2
            r2 = r0[r2]
            return r2
    }

    private final java.lang.Object zzt(java.lang.Object r4, int r5) {
            r3 = this;
            com.google.android.gms.internal.auth.zzgi r0 = r3.zzr(r5)
            int r1 = r3.zzo(r5)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            boolean r5 = r3.zzE(r4, r5)
            if (r5 != 0) goto L17
            java.lang.Object r4 = r0.zzd()
            return r4
        L17:
            long r1 = (long) r1
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r4 = r5.getObject(r4, r1)
            boolean r5 = zzH(r4)
            if (r5 == 0) goto L25
            return r4
        L25:
            java.lang.Object r5 = r0.zzd()
            if (r4 == 0) goto L2e
            r0.zzf(r5, r4)
        L2e:
            return r5
    }

    private final java.lang.Object zzu(java.lang.Object r4, int r5, int r6) {
            r3 = this;
            com.google.android.gms.internal.auth.zzgi r0 = r3.zzr(r6)
            boolean r5 = r3.zzI(r4, r5, r6)
            if (r5 != 0) goto Lf
            java.lang.Object r4 = r0.zzd()
            return r4
        Lf:
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.zzga.zzb
            int r6 = r3.zzo(r6)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r1
            long r1 = (long) r6
            java.lang.Object r4 = r5.getObject(r4, r1)
            boolean r5 = zzH(r4)
            if (r5 == 0) goto L25
            return r4
        L25:
            java.lang.Object r5 = r0.zzd()
            if (r4 == 0) goto L2e
            r0.zzf(r5, r4)
        L2e:
            return r5
    }

    private static java.lang.reflect.Field zzv(java.lang.Class r5, java.lang.String r6) {
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> L5
            return r5
        L5:
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1d
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Field "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " for "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = " not found. Known fields are "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    private static void zzw(java.lang.Object r2) {
            boolean r0 = zzH(r2)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Mutating immutable message: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
    }

    private final void zzx(java.lang.Object r6, java.lang.Object r7, int r8) {
            r5 = this;
            boolean r0 = r5.zzE(r7, r8)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r5.zzo(r8)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            sun.misc.Unsafe r1 = com.google.android.gms.internal.auth.zzga.zzb
            long r2 = (long) r0
            java.lang.Object r0 = r1.getObject(r7, r2)
            if (r0 == 0) goto L53
            com.google.android.gms.internal.auth.zzgi r7 = r5.zzr(r8)
            boolean r4 = r5.zzE(r6, r8)
            if (r4 != 0) goto L3a
            boolean r4 = zzH(r0)
            if (r4 != 0) goto L2c
            r1.putObject(r6, r2, r0)
            goto L36
        L2c:
            java.lang.Object r4 = r7.zzd()
            r7.zzf(r4, r0)
            r1.putObject(r6, r2, r4)
        L36:
            r5.zzz(r6, r8)
            return
        L3a:
            java.lang.Object r8 = r1.getObject(r6, r2)
            boolean r4 = zzH(r8)
            if (r4 != 0) goto L4f
            java.lang.Object r4 = r7.zzd()
            r7.zzf(r4, r8)
            r1.putObject(r6, r2, r4)
            r8 = r4
        L4f:
            r7.zzf(r8, r0)
            return
        L53:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            int[] r0 = r5.zzc
            r8 = r0[r8]
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Source subfield "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = " is present but null: "
            r0.append(r8)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
    }

    private final void zzy(java.lang.Object r7, java.lang.Object r8, int r9) {
            r6 = this;
            int[] r0 = r6.zzc
            r0 = r0[r9]
            boolean r1 = r6.zzI(r8, r0, r9)
            if (r1 != 0) goto Lb
            return
        Lb:
            int r1 = r6.zzo(r9)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            sun.misc.Unsafe r2 = com.google.android.gms.internal.auth.zzga.zzb
            long r3 = (long) r1
            java.lang.Object r1 = r2.getObject(r8, r3)
            if (r1 == 0) goto L57
            com.google.android.gms.internal.auth.zzgi r8 = r6.zzr(r9)
            boolean r5 = r6.zzI(r7, r0, r9)
            if (r5 != 0) goto L3e
            boolean r5 = zzH(r1)
            if (r5 != 0) goto L30
            r2.putObject(r7, r3, r1)
            goto L3a
        L30:
            java.lang.Object r5 = r8.zzd()
            r8.zzf(r5, r1)
            r2.putObject(r7, r3, r5)
        L3a:
            r6.zzA(r7, r0, r9)
            return
        L3e:
            java.lang.Object r9 = r2.getObject(r7, r3)
            boolean r0 = zzH(r9)
            if (r0 != 0) goto L53
            java.lang.Object r0 = r8.zzd()
            r8.zzf(r0, r9)
            r2.putObject(r7, r3, r0)
            r9 = r0
        L53:
            r8.zzf(r9, r1)
            return
        L57:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            int[] r0 = r6.zzc
            r9 = r0[r9]
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Source subfield "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " is present but null: "
            r0.append(r9)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
    }

    private final void zzz(java.lang.Object r5, int r6) {
            r4 = this;
            int r6 = r4.zzl(r6)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r6
            long r0 = (long) r0
            r2 = 1048575(0xfffff, double:5.18065E-318)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L11
            return
        L11:
            int r6 = r6 >>> 20
            int r2 = com.google.android.gms.internal.auth.zzhj.zzc(r5, r0)
            r3 = 1
            int r6 = r3 << r6
            r6 = r6 | r2
            com.google.android.gms.internal.auth.zzhj.zzn(r5, r0, r6)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(java.lang.Object r10) {
            r9 = this;
            int[] r0 = r9.zzc
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L5:
            if (r1 >= r0) goto L22e
            int r3 = r9.zzo(r1)
            int[] r4 = r9.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            int r3 = zzn(r3)
            long r5 = (long) r5
            r7 = 37
            r8 = 32
            switch(r3) {
                case 0: goto L21c;
                case 1: goto L210;
                case 2: goto L206;
                case 3: goto L1fc;
                case 4: goto L1f4;
                case 5: goto L1ea;
                case 6: goto L1e2;
                case 7: goto L1d6;
                case 8: goto L1c8;
                case 9: goto L1bd;
                case 10: goto L1b1;
                case 11: goto L1a9;
                case 12: goto L1a1;
                case 13: goto L199;
                case 14: goto L18f;
                case 15: goto L187;
                case 16: goto L17d;
                case 17: goto L16e;
                case 18: goto L162;
                case 19: goto L162;
                case 20: goto L162;
                case 21: goto L162;
                case 22: goto L162;
                case 23: goto L162;
                case 24: goto L162;
                case 25: goto L162;
                case 26: goto L162;
                case 27: goto L162;
                case 28: goto L162;
                case 29: goto L162;
                case 30: goto L162;
                case 31: goto L162;
                case 32: goto L162;
                case 33: goto L162;
                case 34: goto L162;
                case 35: goto L162;
                case 36: goto L162;
                case 37: goto L162;
                case 38: goto L162;
                case 39: goto L162;
                case 40: goto L162;
                case 41: goto L162;
                case 42: goto L162;
                case 43: goto L162;
                case 44: goto L162;
                case 45: goto L162;
                case 46: goto L162;
                case 47: goto L162;
                case 48: goto L162;
                case 49: goto L162;
                case 50: goto L156;
                case 51: goto L13c;
                case 52: goto L124;
                case 53: goto L114;
                case 54: goto L104;
                case 55: goto Lf6;
                case 56: goto Le6;
                case 57: goto Ld8;
                case 58: goto Lc0;
                case 59: goto Lac;
                case 60: goto L9b;
                case 61: goto L8a;
                case 62: goto L7d;
                case 63: goto L70;
                case 64: goto L63;
                case 65: goto L54;
                case 66: goto L47;
                case 67: goto L34;
                case 68: goto L21;
                default: goto L1f;
            }
        L1f:
            goto L22a
        L21:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L31:
            int r2 = r2 + r3
            goto L22a
        L34:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            long r3 = zzp(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
        L42:
            long r5 = r3 >>> r8
            long r3 = r3 ^ r5
            int r3 = (int) r3
            goto L31
        L47:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            int r3 = zzk(r10, r5)
            goto L31
        L54:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            long r3 = zzp(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L42
        L63:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            int r3 = zzk(r10, r5)
            goto L31
        L70:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            int r3 = zzk(r10, r5)
            goto L31
        L7d:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            int r3 = zzk(r10, r5)
            goto L31
        L8a:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L31
        L9b:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L31
        Lac:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L31
        Lc0:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            int r3 = com.google.android.gms.internal.auth.zzfa.zza(r3)
            goto L31
        Ld8:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            int r3 = zzk(r10, r5)
            goto L31
        Le6:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            long r3 = zzp(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L42
        Lf6:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            int r3 = zzk(r10, r5)
            goto L31
        L104:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            long r3 = zzp(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L42
        L114:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            long r3 = zzp(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L42
        L124:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L31
        L13c:
            boolean r3 = r9.zzI(r10, r4, r1)
            if (r3 == 0) goto L22a
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L42
        L156:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L31
        L162:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L31
        L16e:
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            if (r3 == 0) goto L178
            int r7 = r3.hashCode()
        L178:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L22a
        L17d:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L42
        L187:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            goto L31
        L18f:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L42
        L199:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            goto L31
        L1a1:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            goto L31
        L1a9:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            goto L31
        L1b1:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            int r3 = r3.hashCode()
            goto L31
        L1bd:
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            if (r3 == 0) goto L178
            int r7 = r3.hashCode()
            goto L178
        L1c8:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L31
        L1d6:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.auth.zzhj.zzt(r10, r5)
            int r3 = com.google.android.gms.internal.auth.zzfa.zza(r3)
            goto L31
        L1e2:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            goto L31
        L1ea:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L42
        L1f4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            goto L31
        L1fc:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L42
        L206:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L42
        L210:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.auth.zzhj.zzb(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L31
        L21c:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.auth.zzhj.zza(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.gms.internal.auth.zzfa.zzd
            goto L42
        L22a:
            int r1 = r1 + 3
            goto L5
        L22e:
            int r2 = r2 * 53
            com.google.android.gms.internal.auth.zzgz r0 = r9.zzl
            java.lang.Object r10 = r0.zzb(r10)
            int r10 = r10.hashCode()
            int r2 = r2 + r10
            return r2
    }

    public final int zzb(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.auth.zzdt r42) throws java.io.IOException {
            r36 = this;
            r0 = r36
            r2 = r37
            r3 = r38
            r4 = r40
            r6 = r42
            zzw(r2)
            sun.misc.Unsafe r1 = com.google.android.gms.internal.auth.zzga.zzb
            r14 = 0
            r15 = -1
            r7 = r39
            r9 = r14
            r12 = r9
            r18 = r12
            r8 = r15
            r13 = 1048575(0xfffff, float:1.469367E-39)
        L1b:
            r16 = 1
            r17 = 2
        L1f:
            r19 = 0
            if (r7 >= r4) goto Ldfc
            r20 = 3
            int r11 = r7 + 1
            r7 = r3[r7]
            if (r7 >= 0) goto L31
            int r11 = com.google.android.gms.internal.auth.zzdu.zzi(r7, r3, r11, r6)
            int r7 = r6.zza
        L31:
            r18 = r7
            int r7 = r18 >>> 3
            if (r7 <= r8) goto L46
            int r9 = r9 / 3
            int r8 = r0.zze
            if (r7 < r8) goto L53
            int r8 = r0.zzf
            if (r7 > r8) goto L53
            int r8 = r0.zzm(r7, r9)
            goto L54
        L46:
            int r8 = r0.zze
            if (r7 < r8) goto L53
            int r8 = r0.zzf
            if (r7 > r8) goto L53
            int r8 = r0.zzm(r7, r14)
            goto L54
        L53:
            r8 = r15
        L54:
            if (r8 != r15) goto L6d
            r29 = r1
            r8 = r2
            r5 = r3
            r3 = r11
            r25 = r12
            r9 = r14
            r23 = r9
            r21 = r15
            r10 = r18
            r28 = 1048575(0xfffff, float:1.469367E-39)
            r14 = r41
            r12 = r6
            r11 = r7
            goto Ldd4
        L6d:
            r9 = r18 & 7
            r21 = r15
            int[] r15 = r0.zzc
            int r22 = r8 + 1
            r14 = r15[r22]
            r22 = 1048575(0xfffff, float:1.469367E-39)
            int r5 = zzn(r14)
            r3 = r14 & r22
            long r3 = (long) r3
            r24 = r3
            r3 = 17
            r39 = 536870912(0x20000000, float:1.0842022E-19)
            r26 = 0
            java.lang.String r4 = ""
            if (r5 > r3) goto L552
            int r3 = r8 + 2
            r3 = r15[r3]
            int r15 = r3 >>> 20
            int r15 = r16 << r15
            r3 = r3 & r22
            r6 = r22
            r22 = r7
            if (r3 == r13) goto Lb1
            if (r13 == r6) goto La6
            long r6 = (long) r13
            r1.putInt(r2, r6, r12)
            r6 = 1048575(0xfffff, float:1.469367E-39)
        La6:
            if (r3 != r6) goto Laa
            r7 = 0
            goto Laf
        Laa:
            long r12 = (long) r3
            int r7 = r1.getInt(r2, r12)
        Laf:
            r13 = r3
            r12 = r7
        Lb1:
            switch(r5) {
                case 0: goto L516;
                case 1: goto L4e8;
                case 2: goto L4b9;
                case 3: goto L4b9;
                case 4: goto L484;
                case 5: goto L43b;
                case 6: goto L418;
                case 7: goto L3dd;
                case 8: goto L288;
                case 9: goto L22d;
                case 10: goto L1fd;
                case 11: goto L484;
                case 12: goto L190;
                case 13: goto L418;
                case 14: goto L43b;
                case 15: goto L157;
                case 16: goto L110;
                default: goto Lb4;
            }
        Lb4:
            r3 = r20
            if (r9 != r3) goto Lf7
            r20 = r3
            java.lang.Object r3 = r0.zzt(r2, r8)
            int r4 = r22 << 3
            r4 = r4 | 4
            r5 = r4
            com.google.android.gms.internal.auth.zzgi r4 = r0.zzr(r8)
            r7 = r13
            r13 = r6
            r6 = r11
            r11 = r22
            r22 = r7
            r7 = r18
            r18 = r12
            r12 = r7
            r7 = r40
            r9 = r42
            r14 = r8
            r8 = r5
            r5 = r38
            int r4 = com.google.android.gms.internal.auth.zzdu.zzl(r3, r4, r5, r6, r7, r8, r9)
            r7 = r5
            r8 = r9
            r0.zzB(r2, r14, r3)
            r3 = r18 | r15
            r6 = r8
            r8 = r11
            r18 = r12
            r9 = r14
            r15 = r21
            r13 = r22
            r14 = 0
            r12 = r3
            r3 = r7
        Lf2:
            r7 = r4
        Lf3:
            r4 = r40
            goto L1f
        Lf7:
            r4 = r18
            r18 = r12
            r12 = r4
            r4 = r11
            r11 = r22
            r22 = r13
            r7 = r2
            r2 = r1
            r1 = r7
            r7 = r38
            r28 = r6
            r13 = r8
            r24 = r12
            r8 = r42
        L10d:
            r12 = r4
            goto L53f
        L110:
            r4 = r18
            r18 = r12
            r12 = r4
            r7 = r38
            r14 = r8
            r4 = r11
            r11 = r22
            r8 = r42
            r22 = r13
            r13 = r6
            if (r9 != 0) goto L14c
            int r9 = com.google.android.gms.internal.auth.zzdu.zzk(r7, r4, r8)
            long r3 = r8.zzb
            long r5 = com.google.android.gms.internal.auth.zzej.zzc(r3)
            r3 = r24
            r1.putLong(r2, r3, r5)
            r35 = r2
            r2 = r1
            r1 = r35
            r3 = r18 | r15
            r4 = r2
            r2 = r1
            r1 = r4
            r4 = r40
            r6 = r8
            r8 = r11
            r18 = r12
            r15 = r21
            r13 = r22
            r12 = r3
            r3 = r7
            r7 = r9
            r9 = r14
            r14 = 0
            goto L1f
        L14c:
            r35 = r2
            r2 = r1
            r1 = r35
        L151:
            r24 = r12
            r28 = r13
            r13 = r14
            goto L10d
        L157:
            r4 = r2
            r2 = r1
            r1 = r4
            r4 = r18
            r18 = r12
            r12 = r4
            r7 = r38
            r14 = r8
            r4 = r11
            r11 = r22
            r8 = r42
            r22 = r13
            r13 = r6
            r5 = r24
            if (r9 != 0) goto L151
            int r3 = com.google.android.gms.internal.auth.zzdu.zzh(r7, r4, r8)
            int r4 = r8.zza
            int r4 = com.google.android.gms.internal.auth.zzej.zzb(r4)
            r2.putInt(r1, r5, r4)
            r4 = r18 | r15
            r6 = r2
            r2 = r1
            r1 = r6
            r6 = r7
            r7 = r3
            r3 = r6
            r6 = r8
            r8 = r11
            r18 = r12
            r9 = r14
            r15 = r21
            r13 = r22
            r14 = 0
            r12 = r4
            goto Lf3
        L190:
            r3 = r2
            r2 = r1
            r1 = r3
            r3 = r18
            r18 = r12
            r12 = r3
            r7 = r38
            r3 = r8
            r4 = r11
            r11 = r22
            r8 = r42
            r22 = r13
            r13 = r6
            r5 = r24
            if (r9 != 0) goto L1f6
            int r4 = com.google.android.gms.internal.auth.zzdu.zzh(r7, r4, r8)
            int r9 = r8.zza
            com.google.android.gms.internal.auth.zzey r19 = r0.zzq(r3)
            r24 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = r14 & r24
            if (r14 == 0) goto L1df
            if (r19 == 0) goto L1df
            boolean r14 = r19.zza()
            if (r14 == 0) goto L1c0
            goto L1df
        L1c0:
            com.google.android.gms.internal.auth.zzha r5 = zzc(r1)
            long r14 = (long) r9
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r5.zzh(r12, r6)
            r6 = r2
            r2 = r1
            r1 = r6
            r6 = r18
            r18 = r12
            r12 = r6
            r9 = r3
            r3 = r7
            r6 = r8
            r8 = r11
            r15 = r21
            r13 = r22
            r14 = 0
            goto Lf2
        L1df:
            r2.putInt(r1, r5, r9)
            r5 = r18 | r15
            r6 = r2
            r2 = r1
            r1 = r6
            r9 = r3
            r3 = r7
            r6 = r8
            r8 = r11
            r18 = r12
        L1ed:
            r15 = r21
            r13 = r22
            r14 = 0
            r7 = r4
            r12 = r5
            goto Lf3
        L1f6:
            r24 = r12
            r28 = r13
            r13 = r3
            goto L10d
        L1fd:
            r3 = r2
            r2 = r1
            r1 = r3
            r3 = r18
            r18 = r12
            r12 = r3
            r7 = r38
            r3 = r8
            r4 = r11
            r14 = r17
            r11 = r22
            r8 = r42
            r22 = r13
            r13 = r6
            r5 = r24
            if (r9 != r14) goto L1f6
            int r4 = com.google.android.gms.internal.auth.zzdu.zza(r7, r4, r8)
            java.lang.Object r9 = r8.zzc
            r2.putObject(r1, r5, r9)
            r5 = r18 | r15
            r6 = r2
            r2 = r1
            r1 = r6
            r9 = r3
            r3 = r7
            r6 = r8
            r8 = r11
            r18 = r12
            r17 = r14
            goto L1ed
        L22d:
            r3 = r2
            r2 = r1
            r1 = r3
            r3 = r18
            r18 = r12
            r12 = r3
            r7 = r38
            r3 = r8
            r4 = r11
            r14 = r17
            r11 = r22
            r8 = r42
            r22 = r13
            r13 = r6
            if (r9 != r14) goto L275
            r5 = r1
            java.lang.Object r1 = r0.zzt(r5, r3)
            r6 = r2
            com.google.android.gms.internal.auth.zzgi r2 = r0.zzr(r3)
            r9 = r8
            r8 = r6
            r6 = r9
            r9 = r3
            r3 = r7
            r7 = r5
            r5 = r40
            int r2 = com.google.android.gms.internal.auth.zzdu.zzm(r1, r2, r3, r4, r5, r6)
            r4 = r1
            r1 = r3
            r3 = r6
            r0.zzB(r7, r9, r4)
            r4 = r18 | r15
            r6 = r7
            r7 = r2
            r2 = r6
            r6 = r3
            r18 = r12
            r17 = r14
            r15 = r21
            r13 = r22
            r14 = 0
            r3 = r1
            r12 = r4
            r1 = r8
            r8 = r11
            goto Lf3
        L275:
            r9 = r7
            r7 = r1
            r1 = r9
            r9 = r3
            r3 = r8
            r8 = r2
            r2 = r7
            r7 = r1
            r1 = r2
            r2 = r8
            r24 = r12
            r28 = r13
            r8 = r3
            r12 = r4
            r13 = r9
            goto L53f
        L288:
            r3 = r42
            r7 = r2
            r28 = r6
            r2 = r11
            r11 = r22
            r5 = r24
            r22 = r13
            r24 = r18
            r13 = r8
            r18 = r12
            r12 = r17
            r8 = r1
            r1 = r38
            if (r9 != r12) goto L3d5
            r9 = r14 & r39
            if (r9 == 0) goto L39b
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r1, r2, r3)
            int r9 = r3.zza
            if (r9 < 0) goto L396
            if (r9 != 0) goto L2b5
            r3.zzc = r4
            r25 = r15
            r14 = 0
            goto L3b5
        L2b5:
            int r4 = com.google.android.gms.internal.auth.zzhn.zza
            int r4 = r1.length
            int r12 = r4 - r2
            r14 = r2 | r9
            int r12 = r12 - r9
            r12 = r12 | r14
            if (r12 < 0) goto L37a
            int r4 = r2 + r9
            char[] r9 = new char[r9]
            r12 = 0
        L2c5:
            if (r2 >= r4) goto L2d9
            r14 = r1[r2]
            boolean r19 = com.google.android.gms.internal.auth.zzhk.zzd(r14)
            if (r19 == 0) goto L2d9
            int r2 = r2 + 1
            int r19 = r12 + 1
            char r14 = (char) r14
            r9[r12] = r14
            r12 = r19
            goto L2c5
        L2d9:
            if (r2 >= r4) goto L36d
            int r14 = r2 + 1
            r19 = r2
            r2 = r1[r19]
            boolean r25 = com.google.android.gms.internal.auth.zzhk.zzd(r2)
            if (r25 == 0) goto L301
            int r19 = r12 + 1
            char r2 = (char) r2
            r9[r12] = r2
            r2 = r14
        L2ed:
            r12 = r19
            if (r2 >= r4) goto L2d9
            r14 = r1[r2]
            boolean r19 = com.google.android.gms.internal.auth.zzhk.zzd(r14)
            if (r19 == 0) goto L2d9
            int r2 = r2 + 1
            int r19 = r12 + 1
            char r14 = (char) r14
            r9[r12] = r14
            goto L2ed
        L301:
            r25 = r15
            r15 = -32
            if (r2 >= r15) goto L31f
            if (r14 >= r4) goto L31a
            r17 = 2
            int r15 = r19 + 2
            r14 = r1[r14]
            int r19 = r12 + 1
            com.google.android.gms.internal.auth.zzhk.zzc(r2, r14, r9, r12)
            r2 = r15
            r12 = r19
        L317:
            r15 = r25
            goto L2d9
        L31a:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzb()
            throw r1
        L31f:
            r17 = 2
            r15 = -16
            if (r2 >= r15) goto L344
            int r15 = r4 + (-1)
            if (r14 >= r15) goto L33f
            int r15 = r19 + 2
            r14 = r1[r14]
            r20 = 3
            int r19 = r19 + 3
            r15 = r1[r15]
            int r26 = r12 + 1
            com.google.android.gms.internal.auth.zzhk.zzb(r2, r14, r15, r9, r12)
            r2 = r19
            r15 = r25
            r12 = r26
            goto L2d9
        L33f:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzb()
            throw r1
        L344:
            int r15 = r4 + (-2)
            if (r14 >= r15) goto L368
            r17 = 2
            int r15 = r19 + 2
            r30 = r1[r14]
            r20 = 3
            int r14 = r19 + 3
            r31 = r1[r15]
            int r15 = r19 + 4
            r32 = r1[r14]
            r29 = r2
            r33 = r9
            r34 = r12
            com.google.android.gms.internal.auth.zzhk.zza(r29, r30, r31, r32, r33, r34)
            r2 = r33
            int r12 = r12 + 2
            r9 = r2
            r2 = r15
            goto L317
        L368:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzb()
            throw r1
        L36d:
            r2 = r9
            r25 = r15
            java.lang.String r9 = new java.lang.String
            r14 = 0
            r9.<init>(r2, r14, r12)
            r3.zzc = r9
            r2 = r4
            goto L3b5
        L37a:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2, r4}
            java.lang.String r3 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>(r2)
            throw r1
        L396:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r1
        L39b:
            r25 = r15
            r14 = 0
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r1, r2, r3)
            int r9 = r3.zza
            if (r9 < 0) goto L3d0
            if (r9 != 0) goto L3ab
            r3.zzc = r4
            goto L3b5
        L3ab:
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r12 = com.google.android.gms.internal.auth.zzfa.zzb
            r4.<init>(r1, r2, r9, r12)
            r3.zzc = r4
            int r2 = r2 + r9
        L3b5:
            java.lang.Object r4 = r3.zzc
            r8.putObject(r7, r5, r4)
            r12 = r18 | r25
            r4 = r7
            r7 = r2
            r2 = r4
            r4 = r40
            r6 = r3
            r9 = r13
            r15 = r21
            r13 = r22
            r18 = r24
        L3c9:
            r17 = 2
            r3 = r1
            r1 = r8
            r8 = r11
            goto L1f
        L3d0:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r1
        L3d5:
            r12 = r7
            r7 = r1
            r1 = r12
            r12 = r2
            r2 = r8
            r8 = r3
            goto L53f
        L3dd:
            r3 = r42
            r7 = r2
            r28 = r6
            r2 = r11
            r11 = r22
            r5 = r24
            r14 = 0
            r22 = r13
            r25 = r15
            r24 = r18
            r13 = r8
            r18 = r12
            r8 = r1
            r1 = r38
            if (r9 != 0) goto L3d5
            int r2 = com.google.android.gms.internal.auth.zzdu.zzk(r1, r2, r3)
            long r14 = r3.zzb
            int r4 = (r14 > r26 ? 1 : (r14 == r26 ? 0 : -1))
            if (r4 == 0) goto L403
            r4 = r16
            goto L404
        L403:
            r4 = 0
        L404:
            com.google.android.gms.internal.auth.zzhj.zzk(r7, r5, r4)
        L407:
            r12 = r18 | r25
            r4 = r7
            r7 = r2
            r2 = r4
            r4 = r40
            r6 = r3
            r9 = r13
            r15 = r21
            r13 = r22
            r18 = r24
            r14 = 0
            goto L3c9
        L418:
            r3 = r42
            r7 = r2
            r28 = r6
            r2 = r11
            r11 = r22
            r5 = r24
            r4 = 5
            r22 = r13
            r25 = r15
            r24 = r18
            r13 = r8
            r18 = r12
            r8 = r1
            r1 = r38
            if (r9 != r4) goto L3d5
            int r4 = com.google.android.gms.internal.auth.zzdu.zzb(r1, r2)
            r8.putInt(r7, r5, r4)
            int r2 = r2 + 4
            goto L407
        L43b:
            r3 = r42
            r7 = r2
            r28 = r6
            r2 = r11
            r4 = r16
            r11 = r22
            r5 = r24
            r22 = r13
            r25 = r15
            r24 = r18
            r13 = r8
            r18 = r12
            r8 = r1
            r1 = r38
            if (r9 != r4) goto L478
            r3 = r5
            long r5 = com.google.android.gms.internal.auth.zzdu.zzn(r1, r2)
            r12 = r2
            r2 = r7
            r7 = r1
            r1 = r8
            r8 = r42
            r1.putLong(r2, r3, r5)
            int r3 = r12 + 8
            r12 = r18 | r25
        L467:
            r4 = r7
            r7 = r3
            r3 = r4
            r4 = r40
            r6 = r8
        L46d:
            r8 = r11
            r9 = r13
            r15 = r21
            r13 = r22
            r18 = r24
            r14 = 0
            goto L1b
        L478:
            r12 = r2
            r2 = r7
            r7 = r1
            r1 = r8
            r8 = r3
        L47d:
            r35 = r2
            r2 = r1
            r1 = r35
            goto L53f
        L484:
            r7 = r38
            r28 = r6
            r3 = r24
            r25 = r15
            r24 = r18
            r18 = r12
            r12 = r11
            r11 = r22
            r22 = r13
            r13 = r8
            r8 = r42
            if (r9 != 0) goto L47d
            int r5 = com.google.android.gms.internal.auth.zzdu.zzh(r7, r12, r8)
            int r6 = r8.zza
            r1.putInt(r2, r3, r6)
            r12 = r18 | r25
            r4 = r40
            r3 = r7
            r6 = r8
            r8 = r11
            r9 = r13
            r15 = r21
            r13 = r22
            r18 = r24
            r14 = 0
            r16 = 1
            r17 = 2
            r7 = r5
            goto L1f
        L4b9:
            r7 = r38
            r28 = r6
            r3 = r24
            r25 = r15
            r24 = r18
            r18 = r12
            r12 = r11
            r11 = r22
            r22 = r13
            r13 = r8
            r8 = r42
            if (r9 != 0) goto L47d
            int r9 = com.google.android.gms.internal.auth.zzdu.zzk(r7, r12, r8)
            long r5 = r8.zzb
            r1.putLong(r2, r3, r5)
            r35 = r2
            r2 = r1
            r1 = r35
            r12 = r18 | r25
            r3 = r2
            r2 = r1
            r1 = r3
            r4 = r40
            r3 = r7
            r6 = r8
            r7 = r9
            goto L46d
        L4e8:
            r3 = r2
            r2 = r1
            r1 = r3
            r7 = r38
            r28 = r6
            r3 = r24
            r5 = 5
            r25 = r15
            r24 = r18
            r18 = r12
            r12 = r11
            r11 = r22
            r22 = r13
            r13 = r8
            r8 = r42
            if (r9 != r5) goto L53f
            int r5 = com.google.android.gms.internal.auth.zzdu.zzb(r7, r12)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            com.google.android.gms.internal.auth.zzhj.zzm(r1, r3, r5)
            int r3 = r12 + 4
        L50f:
            r12 = r18 | r25
            r4 = r2
            r2 = r1
            r1 = r4
            goto L467
        L516:
            r3 = r2
            r2 = r1
            r1 = r3
            r7 = r38
            r28 = r6
            r5 = r16
            r3 = r24
            r25 = r15
            r24 = r18
            r18 = r12
            r12 = r11
            r11 = r22
            r22 = r13
            r13 = r8
            r8 = r42
            if (r9 != r5) goto L53f
            long r5 = com.google.android.gms.internal.auth.zzdu.zzn(r7, r12)
            double r5 = java.lang.Double.longBitsToDouble(r5)
            com.google.android.gms.internal.auth.zzhj.zzl(r1, r3, r5)
            int r3 = r12 + 8
            goto L50f
        L53f:
            r14 = r41
            r29 = r2
            r5 = r7
            r3 = r12
            r9 = r13
            r25 = r18
            r13 = r22
            r10 = r24
            r23 = 0
            r12 = r8
            r8 = r1
            goto Ldd4
        L552:
            r23 = r2
            r2 = r1
            r1 = r23
            r28 = r22
            r23 = 0
            r22 = r13
            r13 = r8
            r8 = r6
            r35 = r11
            r11 = r7
            r6 = r24
            r25 = r12
            r24 = r18
            r12 = r35
            r3 = 27
            r18 = 10
            if (r5 != r3) goto L5c9
            r3 = 2
            if (r9 != r3) goto L5bb
            java.lang.Object r3 = r2.getObject(r1, r6)
            com.google.android.gms.internal.auth.zzez r3 = (com.google.android.gms.internal.auth.zzez) r3
            boolean r4 = r3.zzc()
            if (r4 != 0) goto L592
            int r4 = r3.size()
            if (r4 != 0) goto L588
        L585:
            r4 = r18
            goto L58b
        L588:
            int r18 = r4 + r4
            goto L585
        L58b:
            com.google.android.gms.internal.auth.zzez r3 = r3.zzd(r4)
            r2.putObject(r1, r6, r3)
        L592:
            r6 = r3
            com.google.android.gms.internal.auth.zzgi r1 = r0.zzr(r13)
            r3 = r38
            r5 = r40
            r7 = r8
            r4 = r12
            r8 = r37
            r12 = r2
            r2 = r24
            int r1 = com.google.android.gms.internal.auth.zzdu.zze(r1, r2, r3, r4, r5, r6, r7)
            r4 = r40
            r6 = r42
            r7 = r1
            r18 = r2
            r2 = r8
            r8 = r11
            r1 = r12
            r9 = r13
            r15 = r21
            r13 = r22
            r14 = r23
            r12 = r25
            goto L1b
        L5bb:
            r8 = r1
            r3 = r12
            r12 = r2
            r2 = r42
            r29 = r12
            r10 = r24
            r12 = r3
            r3 = r38
            goto Lbbe
        L5c9:
            r8 = r1
            r3 = r12
            r12 = r2
            r2 = r24
            r1 = 49
            if (r5 > r1) goto Lb8b
            long r14 = (long) r14
            sun.misc.Unsafe r1 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r24 = r1.getObject(r8, r6)
            r29 = r2
            r2 = r24
            com.google.android.gms.internal.auth.zzez r2 = (com.google.android.gms.internal.auth.zzez) r2
            boolean r24 = r2.zzc()
            if (r24 != 0) goto L5fc
            int r24 = r2.size()
            if (r24 != 0) goto L5f0
        L5eb:
            r24 = r3
            r3 = r18
            goto L5f3
        L5f0:
            int r18 = r24 + r24
            goto L5eb
        L5f3:
            com.google.android.gms.internal.auth.zzez r2 = r2.zzd(r3)
            r1.putObject(r8, r6, r2)
        L5fa:
            r7 = r2
            goto L5ff
        L5fc:
            r24 = r3
            goto L5fa
        L5ff:
            switch(r5) {
                case 18: goto Lb0d;
                case 19: goto Lab0;
                case 20: goto La60;
                case 21: goto La60;
                case 22: goto La32;
                case 23: goto L9e2;
                case 24: goto L993;
                case 25: goto L929;
                case 26: goto L85e;
                case 27: goto L838;
                case 28: goto L7c2;
                case 29: goto La32;
                case 30: goto L710;
                case 31: goto L993;
                case 32: goto L9e2;
                case 33: goto L6b9;
                case 34: goto L657;
                case 35: goto Lb0d;
                case 36: goto Lab0;
                case 37: goto La60;
                case 38: goto La60;
                case 39: goto La32;
                case 40: goto L9e2;
                case 41: goto L993;
                case 42: goto L929;
                case 43: goto La32;
                case 44: goto L710;
                case 45: goto L993;
                case 46: goto L9e2;
                case 47: goto L6b9;
                case 48: goto L657;
                default: goto L602;
            }
        L602:
            r3 = 3
            if (r9 != r3) goto L649
            com.google.android.gms.internal.auth.zzgi r1 = r0.zzr(r13)
            r2 = r29 & (-8)
            r5 = r2 | 4
            r2 = r38
            r4 = r40
            r6 = r42
            r3 = r24
            r14 = r29
            int r9 = com.google.android.gms.internal.auth.zzdu.zzc(r1, r2, r3, r4, r5, r6)
            r15 = r3
            java.lang.Object r2 = r6.zzc
            r7.add(r2)
        L621:
            if (r9 >= r4) goto L63e
            r2 = r38
            int r3 = com.google.android.gms.internal.auth.zzdu.zzh(r2, r9, r6)
            r39 = r1
            int r1 = r6.zza
            if (r14 != r1) goto L63c
            r1 = r39
            int r9 = com.google.android.gms.internal.auth.zzdu.zzc(r1, r2, r3, r4, r5, r6)
            r3 = r2
            java.lang.Object r2 = r6.zzc
            r7.add(r2)
            goto L621
        L63c:
            r3 = r2
            goto L640
        L63e:
            r3 = r38
        L640:
            r1 = r4
            r2 = r6
            r7 = r9
        L643:
            r29 = r12
            r10 = r14
            r4 = r15
            goto Lb6c
        L649:
            r3 = r38
            r1 = r40
            r2 = r42
            r4 = r24
            r10 = r29
            r29 = r12
            goto Lb6b
        L657:
            r3 = r38
            r4 = r40
            r6 = r42
            r15 = r24
            r14 = r29
            r1 = 2
            if (r9 != r1) goto L688
            com.google.android.gms.internal.auth.zzfm r7 = (com.google.android.gms.internal.auth.zzfm) r7
            int r1 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r15, r6)
            int r2 = r6.zza
            int r2 = r2 + r1
        L66d:
            if (r1 >= r2) goto L67d
            int r1 = com.google.android.gms.internal.auth.zzdu.zzk(r3, r1, r6)
            long r9 = r6.zzb
            long r9 = com.google.android.gms.internal.auth.zzej.zzc(r9)
            r7.zze(r9)
            goto L66d
        L67d:
            if (r1 != r2) goto L683
        L67f:
            r7 = r1
            r1 = r4
            r2 = r6
            goto L643
        L683:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        L688:
            if (r9 != 0) goto L6b1
            com.google.android.gms.internal.auth.zzfm r7 = (com.google.android.gms.internal.auth.zzfm) r7
            int r1 = com.google.android.gms.internal.auth.zzdu.zzk(r3, r15, r6)
            long r9 = r6.zzb
            long r9 = com.google.android.gms.internal.auth.zzej.zzc(r9)
            r7.zze(r9)
        L699:
            if (r1 >= r4) goto L67f
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r1, r6)
            int r5 = r6.zza
            if (r14 != r5) goto L67f
            int r1 = com.google.android.gms.internal.auth.zzdu.zzk(r3, r2, r6)
            long r9 = r6.zzb
            long r9 = com.google.android.gms.internal.auth.zzej.zzc(r9)
            r7.zze(r9)
            goto L699
        L6b1:
            r1 = r4
            r2 = r6
            r29 = r12
        L6b5:
            r10 = r14
        L6b6:
            r4 = r15
            goto Lb6b
        L6b9:
            r3 = r38
            r4 = r40
            r6 = r42
            r15 = r24
            r14 = r29
            r1 = 2
            if (r9 != r1) goto L6e7
            com.google.android.gms.internal.auth.zzew r7 = (com.google.android.gms.internal.auth.zzew) r7
            int r1 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r15, r6)
            int r2 = r6.zza
            int r2 = r2 + r1
        L6cf:
            if (r1 >= r2) goto L6df
            int r1 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r1, r6)
            int r5 = r6.zza
            int r5 = com.google.android.gms.internal.auth.zzej.zzb(r5)
            r7.zze(r5)
            goto L6cf
        L6df:
            if (r1 != r2) goto L6e2
            goto L67f
        L6e2:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        L6e7:
            if (r9 != 0) goto L6b1
            com.google.android.gms.internal.auth.zzew r7 = (com.google.android.gms.internal.auth.zzew) r7
            int r1 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r15, r6)
            int r2 = r6.zza
            int r2 = com.google.android.gms.internal.auth.zzej.zzb(r2)
            r7.zze(r2)
        L6f8:
            if (r1 >= r4) goto L67f
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r1, r6)
            int r5 = r6.zza
            if (r14 != r5) goto L67f
            int r1 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r2, r6)
            int r2 = r6.zza
            int r2 = com.google.android.gms.internal.auth.zzej.zzb(r2)
            r7.zze(r2)
            goto L6f8
        L710:
            r3 = r38
            r4 = r40
            r6 = r42
            r15 = r24
            r14 = r29
            r1 = 2
            if (r9 != r1) goto L725
            int r1 = com.google.android.gms.internal.auth.zzdu.zzf(r3, r15, r7, r6)
            r5 = r7
            r7 = r1
            r1 = r14
            goto L730
        L725:
            if (r9 != 0) goto L7ba
            r2 = r3
            r5 = r7
            r1 = r14
            r3 = r15
            int r7 = com.google.android.gms.internal.auth.zzdu.zzj(r1, r2, r3, r4, r5, r6)
            r3 = r2
        L730:
            com.google.android.gms.internal.auth.zzey r2 = r0.zzq(r13)
            com.google.android.gms.internal.auth.zzgz r9 = r0.zzl
            int r10 = com.google.android.gms.internal.auth.zzgk.zza
            if (r2 == 0) goto L7ac
            if (r5 == 0) goto L782
            int r10 = r5.size()
            r39 = r2
            r18 = r7
            r7 = r19
            r2 = r23
            r14 = r2
        L749:
            if (r14 >= r10) goto L776
            java.lang.Object r24 = r5.get(r14)
            r29 = r12
            r12 = r24
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r0 = r12.intValue()
            boolean r24 = r39.zza()
            if (r24 == 0) goto L769
            if (r14 == r2) goto L764
            r5.set(r2, r12)
        L764:
            r16 = 1
            int r2 = r2 + 1
            goto L76f
        L769:
            r16 = 1
            java.lang.Object r7 = com.google.android.gms.internal.auth.zzgk.zzc(r8, r11, r0, r7, r9)
        L76f:
            int r14 = r14 + 1
            r0 = r36
            r12 = r29
            goto L749
        L776:
            r29 = r12
            if (r2 == r10) goto L7b0
            java.util.List r0 = r5.subList(r2, r10)
            r0.clear()
            goto L7b0
        L782:
            r39 = r2
            r18 = r7
            r29 = r12
            java.util.Iterator r0 = r5.iterator()
            r2 = r19
        L78e:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L7b0
            java.lang.Object r5 = r0.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            boolean r7 = r39.zza()
            if (r7 != 0) goto L78e
            java.lang.Object r2 = com.google.android.gms.internal.auth.zzgk.zzc(r8, r11, r5, r2, r9)
            r0.remove()
            goto L78e
        L7ac:
            r18 = r7
            r29 = r12
        L7b0:
            r0 = r36
            r10 = r1
            r1 = r4
            r2 = r6
            r4 = r15
            r7 = r18
            goto Lb6c
        L7ba:
            r29 = r12
            r0 = r36
            r1 = r4
            r2 = r6
            goto L6b5
        L7c2:
            r3 = r38
            r4 = r40
            r6 = r42
            r5 = r7
            r15 = r24
            r1 = r29
            r29 = r12
            r12 = 2
            if (r9 != r12) goto L831
            int r0 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r15, r6)
            int r2 = r6.zza
            if (r2 < 0) goto L82c
            int r7 = r3.length
            int r7 = r7 - r0
            if (r2 > r7) goto L827
            if (r2 != 0) goto L7e6
            com.google.android.gms.internal.auth.zzef r2 = com.google.android.gms.internal.auth.zzef.zzb
            r5.add(r2)
            goto L7ee
        L7e6:
            com.google.android.gms.internal.auth.zzef r7 = com.google.android.gms.internal.auth.zzef.zzk(r3, r0, r2)
            r5.add(r7)
        L7ed:
            int r0 = r0 + r2
        L7ee:
            if (r0 >= r4) goto L81e
            int r2 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r0, r6)
            int r7 = r6.zza
            if (r1 != r7) goto L81e
            int r0 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r2, r6)
            int r2 = r6.zza
            if (r2 < 0) goto L819
            int r7 = r3.length
            int r7 = r7 - r0
            if (r2 > r7) goto L814
            if (r2 != 0) goto L80c
            com.google.android.gms.internal.auth.zzef r2 = com.google.android.gms.internal.auth.zzef.zzb
            r5.add(r2)
            goto L7ee
        L80c:
            com.google.android.gms.internal.auth.zzef r7 = com.google.android.gms.internal.auth.zzef.zzk(r3, r0, r2)
            r5.add(r7)
            goto L7ed
        L814:
            com.google.android.gms.internal.auth.zzfb r0 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r0
        L819:
            com.google.android.gms.internal.auth.zzfb r0 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r0
        L81e:
            r7 = r0
            r10 = r1
            r1 = r4
            r2 = r6
            r4 = r15
            r0 = r36
            goto Lb6c
        L827:
            com.google.android.gms.internal.auth.zzfb r0 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r0
        L82c:
            com.google.android.gms.internal.auth.zzfb r0 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r0
        L831:
            r0 = r36
            r10 = r1
            r1 = r4
            r2 = r6
            goto L6b6
        L838:
            r3 = r38
            r4 = r40
            r6 = r42
            r5 = r7
            r15 = r24
            r1 = r29
            r29 = r12
            r12 = 2
            if (r9 != r12) goto L831
            r0 = r36
            r2 = r1
            com.google.android.gms.internal.auth.zzgi r1 = r0.zzr(r13)
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r15
            int r1 = com.google.android.gms.internal.auth.zzdu.zze(r1, r2, r3, r4, r5, r6, r7)
            r6 = r7
            r7 = r1
        L859:
            r10 = r2
            r1 = r5
            r2 = r6
            goto Lb6c
        L85e:
            r3 = r38
            r5 = r40
            r6 = r42
            r1 = r7
            r7 = r24
            r2 = r29
            r29 = r12
            r12 = 2
            if (r9 != r12) goto L923
            r9 = 536870912(0x20000000, double:2.65249474E-315)
            long r9 = r9 & r14
            int r9 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r9 != 0) goto L8c3
            int r9 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r7, r6)
            int r10 = r6.zza
            if (r10 < 0) goto L8be
            if (r10 != 0) goto L884
            r1.add(r4)
            goto L88f
        L884:
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r14 = com.google.android.gms.internal.auth.zzfa.zzb
            r12.<init>(r3, r9, r10, r14)
            r1.add(r12)
        L88e:
            int r9 = r9 + r10
        L88f:
            if (r9 >= r5) goto L8b7
            int r10 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r9, r6)
            int r12 = r6.zza
            if (r2 != r12) goto L8b7
            int r9 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r10, r6)
            int r10 = r6.zza
            if (r10 < 0) goto L8b2
            if (r10 != 0) goto L8a7
            r1.add(r4)
            goto L88f
        L8a7:
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r14 = com.google.android.gms.internal.auth.zzfa.zzb
            r12.<init>(r3, r9, r10, r14)
            r1.add(r12)
            goto L88e
        L8b2:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r1
        L8b7:
            r10 = r2
            r1 = r5
            r2 = r6
            r4 = r7
            r7 = r9
            goto Lb6c
        L8be:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r1
        L8c3:
            int r9 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r7, r6)
            int r10 = r6.zza
            if (r10 < 0) goto L91e
            if (r10 != 0) goto L8d1
            r1.add(r4)
            goto L8e4
        L8d1:
            int r12 = r9 + r10
            boolean r14 = com.google.android.gms.internal.auth.zzhn.zzc(r3, r9, r12)
            if (r14 == 0) goto L919
            java.lang.String r14 = new java.lang.String
            java.nio.charset.Charset r15 = com.google.android.gms.internal.auth.zzfa.zzb
            r14.<init>(r3, r9, r10, r15)
            r1.add(r14)
        L8e3:
            r9 = r12
        L8e4:
            if (r9 >= r5) goto L8b7
            int r10 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r9, r6)
            int r12 = r6.zza
            if (r2 != r12) goto L8b7
            int r9 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r10, r6)
            int r10 = r6.zza
            if (r10 < 0) goto L914
            if (r10 != 0) goto L8fc
            r1.add(r4)
            goto L8e4
        L8fc:
            int r12 = r9 + r10
            boolean r14 = com.google.android.gms.internal.auth.zzhn.zzc(r3, r9, r12)
            if (r14 == 0) goto L90f
            java.lang.String r14 = new java.lang.String
            java.nio.charset.Charset r15 = com.google.android.gms.internal.auth.zzfa.zzb
            r14.<init>(r3, r9, r10, r15)
            r1.add(r14)
            goto L8e3
        L90f:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzb()
            throw r1
        L914:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r1
        L919:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzb()
            throw r1
        L91e:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzc()
            throw r1
        L923:
            r10 = r2
            r1 = r5
            r2 = r6
            r4 = r7
            goto Lb6b
        L929:
            r3 = r38
            r5 = r40
            r6 = r42
            r1 = r7
            r7 = r24
            r2 = r29
            r29 = r12
            r12 = 2
            if (r9 != r12) goto L962
            com.google.android.gms.internal.auth.zzdv r1 = (com.google.android.gms.internal.auth.zzdv) r1
            int r4 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r7, r6)
            int r9 = r6.zza
            int r9 = r9 + r4
        L942:
            if (r4 >= r9) goto L956
            int r4 = com.google.android.gms.internal.auth.zzdu.zzk(r3, r4, r6)
            long r14 = r6.zzb
            int r10 = (r14 > r26 ? 1 : (r14 == r26 ? 0 : -1))
            if (r10 == 0) goto L950
            r10 = 1
            goto L952
        L950:
            r10 = r23
        L952:
            r1.zze(r10)
            goto L942
        L956:
            if (r4 != r9) goto L95d
        L958:
            r1 = r7
            r7 = r4
            r4 = r1
            goto L859
        L95d:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        L962:
            if (r9 != 0) goto L923
            com.google.android.gms.internal.auth.zzdv r1 = (com.google.android.gms.internal.auth.zzdv) r1
            int r4 = com.google.android.gms.internal.auth.zzdu.zzk(r3, r7, r6)
            long r9 = r6.zzb
            int r9 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r9 == 0) goto L972
            r9 = 1
            goto L974
        L972:
            r9 = r23
        L974:
            r1.zze(r9)
        L977:
            if (r4 >= r5) goto L958
            int r9 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r4, r6)
            int r10 = r6.zza
            if (r2 != r10) goto L958
            int r4 = com.google.android.gms.internal.auth.zzdu.zzk(r3, r9, r6)
            long r9 = r6.zzb
            int r9 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r9 == 0) goto L98d
            r9 = 1
            goto L98f
        L98d:
            r9 = r23
        L98f:
            r1.zze(r9)
            goto L977
        L993:
            r3 = r38
            r5 = r40
            r6 = r42
            r1 = r7
            r7 = r24
            r2 = r29
            r29 = r12
            r12 = 2
            if (r9 != r12) goto L9c0
            com.google.android.gms.internal.auth.zzew r1 = (com.google.android.gms.internal.auth.zzew) r1
            int r4 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r7, r6)
            int r9 = r6.zza
            int r9 = r9 + r4
        L9ac:
            if (r4 >= r9) goto L9b8
            int r10 = com.google.android.gms.internal.auth.zzdu.zzb(r3, r4)
            r1.zze(r10)
            int r4 = r4 + 4
            goto L9ac
        L9b8:
            if (r4 != r9) goto L9bb
            goto L958
        L9bb:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        L9c0:
            r4 = 5
            if (r9 != r4) goto L923
            com.google.android.gms.internal.auth.zzew r1 = (com.google.android.gms.internal.auth.zzew) r1
            int r4 = com.google.android.gms.internal.auth.zzdu.zzb(r3, r7)
            r1.zze(r4)
            int r4 = r7 + 4
        L9ce:
            if (r4 >= r5) goto L958
            int r9 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r4, r6)
            int r10 = r6.zza
            if (r2 != r10) goto L958
            int r4 = com.google.android.gms.internal.auth.zzdu.zzb(r3, r9)
            r1.zze(r4)
            int r4 = r9 + 4
            goto L9ce
        L9e2:
            r3 = r38
            r5 = r40
            r6 = r42
            r1 = r7
            r7 = r24
            r2 = r29
            r29 = r12
            r12 = 2
            if (r9 != r12) goto La10
            com.google.android.gms.internal.auth.zzfm r1 = (com.google.android.gms.internal.auth.zzfm) r1
            int r4 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r7, r6)
            int r9 = r6.zza
            int r9 = r9 + r4
        L9fb:
            if (r4 >= r9) goto La07
            long r14 = com.google.android.gms.internal.auth.zzdu.zzn(r3, r4)
            r1.zze(r14)
            int r4 = r4 + 8
            goto L9fb
        La07:
            if (r4 != r9) goto La0b
            goto L958
        La0b:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        La10:
            r4 = 1
            if (r9 != r4) goto L923
            com.google.android.gms.internal.auth.zzfm r1 = (com.google.android.gms.internal.auth.zzfm) r1
            long r9 = com.google.android.gms.internal.auth.zzdu.zzn(r3, r7)
            r1.zze(r9)
            int r4 = r7 + 8
        La1e:
            if (r4 >= r5) goto L958
            int r9 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r4, r6)
            int r10 = r6.zza
            if (r2 != r10) goto L958
            long r14 = com.google.android.gms.internal.auth.zzdu.zzn(r3, r9)
            r1.zze(r14)
            int r4 = r9 + 8
            goto La1e
        La32:
            r3 = r38
            r5 = r40
            r6 = r42
            r1 = r7
            r7 = r24
            r2 = r29
            r29 = r12
            r12 = 2
            if (r9 != r12) goto La4d
            int r1 = com.google.android.gms.internal.auth.zzdu.zzf(r3, r7, r1, r6)
            r10 = r2
            r2 = r6
            r4 = r7
            r7 = r1
            r1 = r5
            goto Lb6c
        La4d:
            if (r9 != 0) goto L923
            r4 = r5
            r5 = r1
            r1 = r2
            r2 = r3
            r3 = r7
            int r5 = com.google.android.gms.internal.auth.zzdu.zzj(r1, r2, r3, r4, r5, r6)
            r10 = r1
            r1 = r4
            r4 = r3
            r3 = r2
            r2 = r6
        La5d:
            r7 = r5
            goto Lb6c
        La60:
            r3 = r38
            r1 = r40
            r2 = r42
            r5 = r7
            r4 = r24
            r10 = r29
            r29 = r12
            r12 = 2
            if (r9 != r12) goto La8e
            r7 = r5
            com.google.android.gms.internal.auth.zzfm r7 = (com.google.android.gms.internal.auth.zzfm) r7
            int r5 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r4, r2)
            int r6 = r2.zza
            int r6 = r6 + r5
        La7a:
            if (r5 >= r6) goto La86
            int r5 = com.google.android.gms.internal.auth.zzdu.zzk(r3, r5, r2)
            long r14 = r2.zzb
            r7.zze(r14)
            goto La7a
        La86:
            if (r5 != r6) goto La89
        La88:
            goto La5d
        La89:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        La8e:
            if (r9 != 0) goto Lb6b
            r7 = r5
            com.google.android.gms.internal.auth.zzfm r7 = (com.google.android.gms.internal.auth.zzfm) r7
            int r5 = com.google.android.gms.internal.auth.zzdu.zzk(r3, r4, r2)
            long r14 = r2.zzb
            r7.zze(r14)
        La9c:
            if (r5 >= r1) goto La5d
            int r6 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r5, r2)
            int r9 = r2.zza
            if (r10 != r9) goto La5d
            int r5 = com.google.android.gms.internal.auth.zzdu.zzk(r3, r6, r2)
            long r14 = r2.zzb
            r7.zze(r14)
            goto La9c
        Lab0:
            r3 = r38
            r1 = r40
            r2 = r42
            r5 = r7
            r4 = r24
            r10 = r29
            r29 = r12
            r12 = 2
            if (r9 != r12) goto Lae2
            r7 = r5
            com.google.android.gms.internal.auth.zzer r7 = (com.google.android.gms.internal.auth.zzer) r7
            int r5 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r4, r2)
            int r6 = r2.zza
            int r6 = r6 + r5
        Laca:
            if (r5 >= r6) goto Lada
            int r9 = com.google.android.gms.internal.auth.zzdu.zzb(r3, r5)
            float r9 = java.lang.Float.intBitsToFloat(r9)
            r7.zze(r9)
            int r5 = r5 + 4
            goto Laca
        Lada:
            if (r5 != r6) goto Ladd
            goto La88
        Ladd:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        Lae2:
            r6 = 5
            if (r9 != r6) goto Lb6b
            r7 = r5
            com.google.android.gms.internal.auth.zzer r7 = (com.google.android.gms.internal.auth.zzer) r7
            int r5 = com.google.android.gms.internal.auth.zzdu.zzb(r3, r4)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r7.zze(r5)
            int r5 = r4 + 4
        Laf5:
            if (r5 >= r1) goto La5d
            int r6 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r5, r2)
            int r9 = r2.zza
            if (r10 != r9) goto La5d
            int r5 = com.google.android.gms.internal.auth.zzdu.zzb(r3, r6)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r7.zze(r5)
            int r5 = r6 + 4
            goto Laf5
        Lb0d:
            r3 = r38
            r1 = r40
            r2 = r42
            r5 = r7
            r4 = r24
            r10 = r29
            r29 = r12
            r12 = 2
            if (r9 != r12) goto Lb40
            r7 = r5
            com.google.android.gms.internal.auth.zzek r7 = (com.google.android.gms.internal.auth.zzek) r7
            int r5 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r4, r2)
            int r6 = r2.zza
            int r6 = r6 + r5
        Lb27:
            if (r5 >= r6) goto Lb37
            long r14 = com.google.android.gms.internal.auth.zzdu.zzn(r3, r5)
            double r14 = java.lang.Double.longBitsToDouble(r14)
            r7.zze(r14)
            int r5 = r5 + 8
            goto Lb27
        Lb37:
            if (r5 != r6) goto Lb3b
            goto La88
        Lb3b:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzf()
            throw r1
        Lb40:
            r6 = 1
            if (r9 != r6) goto Lb6b
            r7 = r5
            com.google.android.gms.internal.auth.zzek r7 = (com.google.android.gms.internal.auth.zzek) r7
            long r5 = com.google.android.gms.internal.auth.zzdu.zzn(r3, r4)
            double r5 = java.lang.Double.longBitsToDouble(r5)
            r7.zze(r5)
            int r5 = r4 + 8
        Lb53:
            if (r5 >= r1) goto La5d
            int r6 = com.google.android.gms.internal.auth.zzdu.zzh(r3, r5, r2)
            int r9 = r2.zza
            if (r10 != r9) goto La5d
            long r14 = com.google.android.gms.internal.auth.zzdu.zzn(r3, r6)
            double r14 = java.lang.Double.longBitsToDouble(r14)
            r7.zze(r14)
            int r5 = r6 + 8
            goto Lb53
        Lb6b:
            r7 = r4
        Lb6c:
            if (r7 == r4) goto Lb81
            r4 = r1
            r6 = r2
            r2 = r8
            r18 = r10
            r8 = r11
            r9 = r13
        Lb75:
            r15 = r21
            r13 = r22
        Lb79:
            r14 = r23
            r12 = r25
            r1 = r29
            goto L1b
        Lb81:
            r14 = r41
            r12 = r2
            r5 = r3
            r3 = r7
            r9 = r13
        Lb87:
            r13 = r22
            goto Ldd4
        Lb8b:
            r10 = r2
            r29 = r12
            r2 = r42
            r12 = r3
            r3 = r38
            r1 = 50
            if (r5 != r1) goto Lbc8
            r1 = 2
            if (r9 != r1) goto Lbbe
            sun.misc.Unsafe r1 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r2 = r0.zzs(r13)
            java.lang.Object r3 = r1.getObject(r8, r6)
            r4 = r3
            com.google.android.gms.internal.auth.zzfr r4 = (com.google.android.gms.internal.auth.zzfr) r4
            boolean r4 = r4.zze()
            if (r4 != 0) goto Lbbb
            com.google.android.gms.internal.auth.zzfr r4 = com.google.android.gms.internal.auth.zzfr.zza()
            com.google.android.gms.internal.auth.zzfr r4 = r4.zzb()
            com.google.android.gms.internal.auth.zzfs.zza(r4, r3)
            r1.putObject(r8, r6, r4)
        Lbbb:
            com.google.android.gms.internal.auth.zzfq r2 = (com.google.android.gms.internal.auth.zzfq) r2
            throw r19
        Lbbe:
            r14 = r41
            r5 = r3
            r3 = r12
            r9 = r13
            r13 = r22
            r12 = r2
            goto Ldd4
        Lbc8:
            r17 = 2
            int r1 = r13 + 2
            r18 = r1
            sun.misc.Unsafe r1 = com.google.android.gms.internal.auth.zzga.zzb
            r15 = r15[r18]
            r15 = r15 & r28
            long r2 = (long) r15
            switch(r5) {
                case 51: goto Ld9e;
                case 52: goto Ld7e;
                case 53: goto Ld64;
                case 54: goto Ld64;
                case 55: goto Ld4a;
                case 56: goto Ld2f;
                case 57: goto Ld14;
                case 58: goto Lcf0;
                case 59: goto Lcb7;
                case 60: goto Lc8a;
                case 61: goto Lc76;
                case 62: goto Ld4a;
                case 63: goto Lc45;
                case 64: goto Ld14;
                case 65: goto Ld2f;
                case 66: goto Lc2a;
                case 67: goto Lc07;
                case 68: goto Lbe1;
                default: goto Lbd8;
            }
        Lbd8:
            r5 = r38
            r17 = r13
            r13 = r12
            r12 = r42
            goto Ldbe
        Lbe1:
            r15 = 3
            if (r9 != r15) goto Lbd8
            java.lang.Object r1 = r0.zzu(r8, r11, r13)
            r2 = r10 & (-8)
            r6 = r2 | 4
            com.google.android.gms.internal.auth.zzgi r2 = r0.zzr(r13)
            r3 = r38
            r5 = r40
            r7 = r42
            r4 = r12
            int r2 = com.google.android.gms.internal.auth.zzdu.zzl(r1, r2, r3, r4, r5, r6, r7)
            r5 = r3
            r4 = r7
            r0.zzC(r8, r11, r13, r1)
            r7 = r2
        Lc01:
            r17 = r13
            r13 = r12
            r12 = r4
            goto Ldbf
        Lc07:
            r5 = r38
            r4 = r42
            r15 = 3
            if (r9 != 0) goto Lc24
            int r9 = com.google.android.gms.internal.auth.zzdu.zzk(r5, r12, r4)
            long r14 = r4.zzb
            long r14 = com.google.android.gms.internal.auth.zzej.zzc(r14)
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r1.putObject(r8, r6, r14)
            r1.putInt(r8, r2, r11)
        Lc22:
            r7 = r9
            goto Lc01
        Lc24:
            r17 = r13
            r13 = r12
            r12 = r4
            goto Ldbe
        Lc2a:
            r5 = r38
            r4 = r42
            if (r9 != 0) goto Lc24
            int r9 = com.google.android.gms.internal.auth.zzdu.zzh(r5, r12, r4)
            int r14 = r4.zza
            int r14 = com.google.android.gms.internal.auth.zzej.zzb(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r1.putObject(r8, r6, r14)
            r1.putInt(r8, r2, r11)
            goto Lc22
        Lc45:
            r5 = r38
            r4 = r42
            if (r9 != 0) goto Lc24
            int r9 = com.google.android.gms.internal.auth.zzdu.zzh(r5, r12, r4)
            int r14 = r4.zza
            com.google.android.gms.internal.auth.zzey r15 = r0.zzq(r13)
            if (r15 == 0) goto Lc6b
            boolean r15 = r15.zza()
            if (r15 == 0) goto Lc5e
            goto Lc6b
        Lc5e:
            com.google.android.gms.internal.auth.zzha r1 = zzc(r8)
            long r2 = (long) r14
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.zzh(r10, r2)
            goto Lc22
        Lc6b:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r1.putObject(r8, r6, r14)
            r1.putInt(r8, r2, r11)
            goto Lc22
        Lc76:
            r5 = r38
            r4 = r42
            r15 = 2
            if (r9 != r15) goto Lc24
            int r9 = com.google.android.gms.internal.auth.zzdu.zza(r5, r12, r4)
            java.lang.Object r14 = r4.zzc
            r1.putObject(r8, r6, r14)
            r1.putInt(r8, r2, r11)
            goto Lc22
        Lc8a:
            r5 = r38
            r4 = r42
            r15 = 2
            if (r9 != r15) goto Lcad
            java.lang.Object r1 = r0.zzu(r8, r11, r13)
            com.google.android.gms.internal.auth.zzgi r2 = r0.zzr(r13)
            r6 = r4
            r3 = r5
            r4 = r12
            r5 = r40
            int r2 = com.google.android.gms.internal.auth.zzdu.zzm(r1, r2, r3, r4, r5, r6)
            r5 = r3
            r12 = r6
            r0.zzC(r8, r11, r13, r1)
            r7 = r2
            r17 = r13
            r13 = r4
            goto Ldbf
        Lcad:
            r35 = r12
            r12 = r4
            r4 = r35
            r17 = r13
            r13 = r4
            goto Ldbe
        Lcb7:
            r5 = r38
            r17 = r13
            r15 = 2
            r13 = r12
            r12 = r42
            if (r9 != r15) goto Ldbe
            int r9 = com.google.android.gms.internal.auth.zzdu.zzh(r5, r13, r12)
            int r15 = r12.zza
            if (r15 != 0) goto Lccd
            r1.putObject(r8, r6, r4)
            goto Lcea
        Lccd:
            r4 = r14 & r39
            if (r4 == 0) goto Lcdf
            int r4 = r9 + r15
            boolean r4 = com.google.android.gms.internal.auth.zzhn.zzc(r5, r9, r4)
            if (r4 == 0) goto Lcda
            goto Lcdf
        Lcda:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzb()
            throw r1
        Lcdf:
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r14 = com.google.android.gms.internal.auth.zzfa.zzb
            r4.<init>(r5, r9, r15, r14)
            r1.putObject(r8, r6, r4)
            int r9 = r9 + r15
        Lcea:
            r1.putInt(r8, r2, r11)
            r7 = r9
            goto Ldbf
        Lcf0:
            r5 = r38
            r17 = r13
            r13 = r12
            r12 = r42
            if (r9 != 0) goto Ldbe
            int r4 = com.google.android.gms.internal.auth.zzdu.zzk(r5, r13, r12)
            long r14 = r12.zzb
            int r9 = (r14 > r26 ? 1 : (r14 == r26 ? 0 : -1))
            if (r9 == 0) goto Ld05
            r9 = 1
            goto Ld07
        Ld05:
            r9 = r23
        Ld07:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r1.putObject(r8, r6, r9)
            r1.putInt(r8, r2, r11)
        Ld11:
            r7 = r4
            goto Ldbf
        Ld14:
            r5 = r38
            r17 = r13
            r4 = 5
            r13 = r12
            r12 = r42
            if (r9 != r4) goto Ldbe
            int r4 = com.google.android.gms.internal.auth.zzdu.zzb(r5, r13)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.putObject(r8, r6, r4)
            int r4 = r13 + 4
            r1.putInt(r8, r2, r11)
            goto Ld11
        Ld2f:
            r5 = r38
            r17 = r13
            r4 = 1
            r13 = r12
            r12 = r42
            if (r9 != r4) goto Ldbe
            long r14 = com.google.android.gms.internal.auth.zzdu.zzn(r5, r13)
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r1.putObject(r8, r6, r4)
            int r4 = r13 + 8
            r1.putInt(r8, r2, r11)
            goto Ld11
        Ld4a:
            r5 = r38
            r17 = r13
            r13 = r12
            r12 = r42
            if (r9 != 0) goto Ldbe
            int r4 = com.google.android.gms.internal.auth.zzdu.zzh(r5, r13, r12)
            int r9 = r12.zza
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1.putObject(r8, r6, r9)
            r1.putInt(r8, r2, r11)
            goto Ld11
        Ld64:
            r5 = r38
            r17 = r13
            r13 = r12
            r12 = r42
            if (r9 != 0) goto Ldbe
            int r4 = com.google.android.gms.internal.auth.zzdu.zzk(r5, r13, r12)
            long r14 = r12.zzb
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            r1.putObject(r8, r6, r9)
            r1.putInt(r8, r2, r11)
            goto Ld11
        Ld7e:
            r5 = r38
            r17 = r13
            r4 = 5
            r13 = r12
            r12 = r42
            if (r9 != r4) goto Ldbe
            int r4 = com.google.android.gms.internal.auth.zzdu.zzb(r5, r13)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r1.putObject(r8, r6, r4)
            int r4 = r13 + 4
            r1.putInt(r8, r2, r11)
            goto Ld11
        Ld9e:
            r5 = r38
            r17 = r13
            r4 = 1
            r13 = r12
            r12 = r42
            if (r9 != r4) goto Ldbe
            long r14 = com.google.android.gms.internal.auth.zzdu.zzn(r5, r13)
            double r14 = java.lang.Double.longBitsToDouble(r14)
            java.lang.Double r4 = java.lang.Double.valueOf(r14)
            r1.putObject(r8, r6, r4)
            int r4 = r13 + 8
            r1.putInt(r8, r2, r11)
            goto Ld11
        Ldbe:
            r7 = r13
        Ldbf:
            if (r7 == r13) goto Ldcd
            r4 = r40
            r3 = r5
            r2 = r8
            r18 = r10
            r8 = r11
            r6 = r12
            r9 = r17
            goto Lb75
        Ldcd:
            r14 = r41
            r3 = r7
            r9 = r17
            goto Lb87
        Ldd4:
            if (r10 != r14) goto Lde1
            if (r14 != 0) goto Ldd9
            goto Lde1
        Ldd9:
            r4 = r40
            r7 = r3
            r6 = r28
            r12 = r25
            goto Le0a
        Lde1:
            com.google.android.gms.internal.auth.zzha r5 = zzc(r8)
            r2 = r38
            r4 = r40
            r1 = r10
            r6 = r12
            int r7 = com.google.android.gms.internal.auth.zzdu.zzg(r1, r2, r3, r4, r5, r6)
            r2 = r1
            r3 = r38
            r6 = r42
            r18 = r2
            r2 = r8
            r8 = r11
            r15 = r21
            goto Lb79
        Ldfc:
            r14 = r41
            r29 = r1
            r8 = r2
            r25 = r12
            r22 = r13
            r10 = r18
            r6 = 1048575(0xfffff, float:1.469367E-39)
        Le0a:
            if (r13 == r6) goto Le12
            long r1 = (long) r13
            r6 = r29
            r6.putInt(r8, r1, r12)
        Le12:
            int r1 = r0.zzi
        Le14:
            int r2 = r0.zzj
            if (r1 >= r2) goto Le46
            int[] r2 = r0.zzh
            r2 = r2[r1]
            int[] r3 = r0.zzc
            r3 = r3[r2]
            int r3 = r0.zzo(r2)
            r28 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r28
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r5)
            if (r3 != 0) goto Le33
        Le30:
            r16 = 1
            goto Le3a
        Le33:
            com.google.android.gms.internal.auth.zzey r5 = r0.zzq(r2)
            if (r5 != 0) goto Le3d
            goto Le30
        Le3a:
            int r1 = r1 + 1
            goto Le14
        Le3d:
            com.google.android.gms.internal.auth.zzfr r3 = (com.google.android.gms.internal.auth.zzfr) r3
            java.lang.Object r1 = r0.zzs(r2)
            com.google.android.gms.internal.auth.zzfq r1 = (com.google.android.gms.internal.auth.zzfq) r1
            throw r19
        Le46:
            if (r14 != 0) goto Le50
            if (r7 != r4) goto Le4b
            goto Le54
        Le4b:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzd()
            throw r1
        Le50:
            if (r7 > r4) goto Le55
            if (r10 != r14) goto Le55
        Le54:
            return r7
        Le55:
            com.google.android.gms.internal.auth.zzfb r1 = com.google.android.gms.internal.auth.zzfb.zzd()
            throw r1
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final java.lang.Object zzd() {
            r1 = this;
            com.google.android.gms.internal.auth.zzfx r0 = r1.zzg
            com.google.android.gms.internal.auth.zzev r0 = (com.google.android.gms.internal.auth.zzev) r0
            com.google.android.gms.internal.auth.zzev r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(java.lang.Object r8) {
            r7 = this;
            boolean r0 = zzH(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.auth.zzev
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.auth.zzev r0 = (com.google.android.gms.internal.auth.zzev) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzl(r2)
            r0.zza = r1
            r0.zzj()
        L1a:
            int[] r0 = r7.zzc
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L82
            int r2 = r7.zzo(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzn(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6c
            r5 = 60
            if (r2 == r5) goto L54
            r5 = 68
            if (r2 == r5) goto L54
            switch(r2) {
                case 17: goto L6c;
                case 18: goto L4e;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto L4e;
                case 22: goto L4e;
                case 23: goto L4e;
                case 24: goto L4e;
                case 25: goto L4e;
                case 26: goto L4e;
                case 27: goto L4e;
                case 28: goto L4e;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L4e;
                case 32: goto L4e;
                case 33: goto L4e;
                case 34: goto L4e;
                case 35: goto L4e;
                case 36: goto L4e;
                case 37: goto L4e;
                case 38: goto L4e;
                case 39: goto L4e;
                case 40: goto L4e;
                case 41: goto L4e;
                case 42: goto L4e;
                case 43: goto L4e;
                case 44: goto L4e;
                case 45: goto L4e;
                case 46: goto L4e;
                case 47: goto L4e;
                case 48: goto L4e;
                case 49: goto L4e;
                case 50: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L7f
        L3c:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7f
            r6 = r5
            com.google.android.gms.internal.auth.zzfr r6 = (com.google.android.gms.internal.auth.zzfr) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L7f
        L4e:
            com.google.android.gms.internal.auth.zzfl r2 = r7.zzk
            r2.zza(r8, r3)
            goto L7f
        L54:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzI(r8, r2, r1)
            if (r2 == 0) goto L7f
            com.google.android.gms.internal.auth.zzgi r2 = r7.zzr(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zze(r3)
            goto L7f
        L6c:
            boolean r2 = r7.zzE(r8, r1)
            if (r2 == 0) goto L7f
            com.google.android.gms.internal.auth.zzgi r2 = r7.zzr(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zze(r3)
        L7f:
            int r1 = r1 + 3
            goto L1d
        L82:
            com.google.android.gms.internal.auth.zzgz r0 = r7.zzl
            r0.zze(r8)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            zzw(r7)
            r8.getClass()
            r0 = 0
        L7:
            int[] r1 = r6.zzc
            int r1 = r1.length
            if (r0 >= r1) goto L190
            int r1 = r6.zzo(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            int[] r3 = r6.zzc
            r3 = r3[r0]
            int r1 = zzn(r1)
            long r4 = (long) r2
            switch(r1) {
                case 0: goto L17c;
                case 1: goto L16b;
                case 2: goto L15a;
                case 3: goto L149;
                case 4: goto L138;
                case 5: goto L127;
                case 6: goto L116;
                case 7: goto L104;
                case 8: goto Lf2;
                case 9: goto Led;
                case 10: goto Ldb;
                case 11: goto Lc9;
                case 12: goto Lb7;
                case 13: goto La5;
                case 14: goto L93;
                case 15: goto L81;
                case 16: goto L6f;
                case 17: goto L6a;
                case 18: goto L63;
                case 19: goto L63;
                case 20: goto L63;
                case 21: goto L63;
                case 22: goto L63;
                case 23: goto L63;
                case 24: goto L63;
                case 25: goto L63;
                case 26: goto L63;
                case 27: goto L63;
                case 28: goto L63;
                case 29: goto L63;
                case 30: goto L63;
                case 31: goto L63;
                case 32: goto L63;
                case 33: goto L63;
                case 34: goto L63;
                case 35: goto L63;
                case 36: goto L63;
                case 37: goto L63;
                case 38: goto L63;
                case 39: goto L63;
                case 40: goto L63;
                case 41: goto L63;
                case 42: goto L63;
                case 43: goto L63;
                case 44: goto L63;
                case 45: goto L63;
                case 46: goto L63;
                case 47: goto L63;
                case 48: goto L63;
                case 49: goto L63;
                case 50: goto L50;
                case 51: goto L3e;
                case 52: goto L3e;
                case 53: goto L3e;
                case 54: goto L3e;
                case 55: goto L3e;
                case 56: goto L3e;
                case 57: goto L3e;
                case 58: goto L3e;
                case 59: goto L3e;
                case 60: goto L39;
                case 61: goto L27;
                case 62: goto L27;
                case 63: goto L27;
                case 64: goto L27;
                case 65: goto L27;
                case 66: goto L27;
                case 67: goto L27;
                case 68: goto L22;
                default: goto L20;
            }
        L20:
            goto L18c
        L22:
            r6.zzy(r7, r8, r0)
            goto L18c
        L27:
            boolean r1 = r6.zzI(r8, r3, r0)
            if (r1 == 0) goto L18c
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzp(r7, r4, r1)
            r6.zzA(r7, r3, r0)
            goto L18c
        L39:
            r6.zzy(r7, r8, r0)
            goto L18c
        L3e:
            boolean r1 = r6.zzI(r8, r3, r0)
            if (r1 == 0) goto L18c
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzp(r7, r4, r1)
            r6.zzA(r7, r3, r0)
            goto L18c
        L50:
            int r1 = com.google.android.gms.internal.auth.zzgk.zza
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhj.zzf(r7, r4)
            java.lang.Object r2 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r4)
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzfs.zza(r1, r2)
            com.google.android.gms.internal.auth.zzhj.zzp(r7, r4, r1)
            goto L18c
        L63:
            com.google.android.gms.internal.auth.zzfl r1 = r6.zzk
            r1.zzb(r7, r8, r4)
            goto L18c
        L6a:
            r6.zzx(r7, r8, r0)
            goto L18c
        L6f:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            long r1 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzo(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L81:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            int r1 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzn(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L93:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            long r1 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzo(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        La5:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            int r1 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzn(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        Lb7:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            int r1 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzn(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        Lc9:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            int r1 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzn(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        Ldb:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzp(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        Led:
            r6.zzx(r7, r8, r0)
            goto L18c
        Lf2:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzp(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L104:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            boolean r1 = com.google.android.gms.internal.auth.zzhj.zzt(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzk(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L116:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            int r1 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzn(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L127:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            long r1 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzo(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L138:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            int r1 = com.google.android.gms.internal.auth.zzhj.zzc(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzn(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L149:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            long r1 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzo(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L15a:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            long r1 = com.google.android.gms.internal.auth.zzhj.zzd(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzo(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L16b:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            float r1 = com.google.android.gms.internal.auth.zzhj.zzb(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzm(r7, r4, r1)
            r6.zzz(r7, r0)
            goto L18c
        L17c:
            boolean r1 = r6.zzE(r8, r0)
            if (r1 == 0) goto L18c
            double r1 = com.google.android.gms.internal.auth.zzhj.zza(r8, r4)
            com.google.android.gms.internal.auth.zzhj.zzl(r7, r4, r1)
            r6.zzz(r7, r0)
        L18c:
            int r0 = r0 + 3
            goto L7
        L190:
            com.google.android.gms.internal.auth.zzgz r0 = r6.zzl
            com.google.android.gms.internal.auth.zzgk.zzd(r0, r7, r8)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(java.lang.Object r8, byte[] r9, int r10, int r11, com.google.android.gms.internal.auth.zzdt r12) throws java.io.IOException {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.zzb(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L5:
            if (r2 >= r0) goto L1c5
            int r3 = r8.zzo(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            int r3 = zzn(r3)
            long r5 = (long) r5
            switch(r3) {
                case 0: goto L1a6;
                case 1: goto L18d;
                case 2: goto L17a;
                case 3: goto L167;
                case 4: goto L156;
                case 5: goto L143;
                case 6: goto L131;
                case 7: goto L11f;
                case 8: goto L109;
                case 9: goto Lf3;
                case 10: goto Ldd;
                case 11: goto Lcb;
                case 12: goto Lb9;
                case 13: goto La7;
                case 14: goto L93;
                case 15: goto L81;
                case 16: goto L6d;
                case 17: goto L57;
                case 18: goto L47;
                case 19: goto L47;
                case 20: goto L47;
                case 21: goto L47;
                case 22: goto L47;
                case 23: goto L47;
                case 24: goto L47;
                case 25: goto L47;
                case 26: goto L47;
                case 27: goto L47;
                case 28: goto L47;
                case 29: goto L47;
                case 30: goto L47;
                case 31: goto L47;
                case 32: goto L47;
                case 33: goto L47;
                case 34: goto L47;
                case 35: goto L47;
                case 36: goto L47;
                case 37: goto L47;
                case 38: goto L47;
                case 39: goto L47;
                case 40: goto L47;
                case 41: goto L47;
                case 42: goto L47;
                case 43: goto L47;
                case 44: goto L47;
                case 45: goto L47;
                case 46: goto L47;
                case 47: goto L47;
                case 48: goto L47;
                case 49: goto L47;
                case 50: goto L3a;
                case 51: goto L1a;
                case 52: goto L1a;
                case 53: goto L1a;
                case 54: goto L1a;
                case 55: goto L1a;
                case 56: goto L1a;
                case 57: goto L1a;
                case 58: goto L1a;
                case 59: goto L1a;
                case 60: goto L1a;
                case 61: goto L1a;
                case 62: goto L1a;
                case 63: goto L1a;
                case 64: goto L1a;
                case 65: goto L1a;
                case 66: goto L1a;
                case 67: goto L1a;
                case 68: goto L1a;
                default: goto L18;
            }
        L18:
            goto L1c0
        L1a:
            int r3 = r8.zzl(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r3)
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r3)
            if (r7 != r3) goto L1c4
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
            if (r3 != 0) goto L1c0
            goto L1c4
        L3a:
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
            goto L53
        L47:
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
        L53:
            if (r3 != 0) goto L1c0
            goto L1c4
        L57:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
            if (r3 == 0) goto L1c4
            goto L1c0
        L6d:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1c4
            goto L1c0
        L81:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            if (r3 != r4) goto L1c4
            goto L1c0
        L93:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1c4
            goto L1c0
        La7:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            if (r3 != r4) goto L1c4
            goto L1c0
        Lb9:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            if (r3 != r4) goto L1c4
            goto L1c0
        Lcb:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            if (r3 != r4) goto L1c4
            goto L1c0
        Ldd:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
            if (r3 == 0) goto L1c4
            goto L1c0
        Lf3:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
            if (r3 == 0) goto L1c4
            goto L1c0
        L109:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.auth.zzhj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.auth.zzgk.zzf(r3, r4)
            if (r3 == 0) goto L1c4
            goto L1c0
        L11f:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            boolean r3 = com.google.android.gms.internal.auth.zzhj.zzt(r9, r5)
            boolean r4 = com.google.android.gms.internal.auth.zzhj.zzt(r10, r5)
            if (r3 != r4) goto L1c4
            goto L1c0
        L131:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            if (r3 != r4) goto L1c4
            goto L1c0
        L143:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1c4
            goto L1c0
        L156:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            int r3 = com.google.android.gms.internal.auth.zzhj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.auth.zzhj.zzc(r10, r5)
            if (r3 != r4) goto L1c4
            goto L1c0
        L167:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1c4
            goto L1c0
        L17a:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            long r3 = com.google.android.gms.internal.auth.zzhj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.auth.zzhj.zzd(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1c4
            goto L1c0
        L18d:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            float r3 = com.google.android.gms.internal.auth.zzhj.zzb(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = com.google.android.gms.internal.auth.zzhj.zzb(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L1c4
            goto L1c0
        L1a6:
            boolean r3 = r8.zzD(r9, r10, r2)
            if (r3 == 0) goto L1c4
            double r3 = com.google.android.gms.internal.auth.zzhj.zza(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = com.google.android.gms.internal.auth.zzhj.zza(r10, r5)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1c4
        L1c0:
            int r2 = r2 + 3
            goto L5
        L1c4:
            return r1
        L1c5:
            com.google.android.gms.internal.auth.zzgz r0 = r8.zzl
            java.lang.Object r9 = r0.zzb(r9)
            com.google.android.gms.internal.auth.zzgz r0 = r8.zzl
            java.lang.Object r10 = r0.zzb(r10)
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L1d8
            return r1
        L1d8:
            r9 = 1
            return r9
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(java.lang.Object r15) {
            r14 = this;
            r0 = 0
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r0
            r4 = r2
            r3 = r1
        L7:
            int r5 = r14.zzi
            r6 = 1
            if (r2 >= r5) goto Lcd
            int[] r5 = r14.zzh
            r9 = r5[r2]
            int[] r5 = r14.zzc
            r5 = r5[r9]
            int r13 = r14.zzo(r9)
            int[] r7 = r14.zzc
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r1
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r1) goto L2f
            long r3 = (long) r8
            sun.misc.Unsafe r6 = com.google.android.gms.internal.auth.zzga.zzb
            int r4 = r6.getInt(r15, r3)
        L2f:
            r11 = r4
            r10 = r8
            goto L34
        L32:
            r10 = r3
            r11 = r4
        L34:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r3 = r3 & r13
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r15 = r7.zzF(r8, r9, r10, r11, r12)
            if (r15 == 0) goto L42
            goto L43
        L42:
            return r0
        L43:
            int r15 = zzn(r13)
            r3 = 9
            if (r15 == r3) goto Lb5
            r3 = 17
            if (r15 == r3) goto Lb5
            r3 = 27
            if (r15 == r3) goto L8d
            r3 = 60
            if (r15 == r3) goto L7c
            r3 = 68
            if (r15 == r3) goto L7c
            r3 = 49
            if (r15 == r3) goto L8d
            r3 = 50
            if (r15 == r3) goto L64
            goto Lc6
        L64:
            r15 = r13 & r1
            long r3 = (long) r15
            java.lang.Object r15 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r3)
            com.google.android.gms.internal.auth.zzfr r15 = (com.google.android.gms.internal.auth.zzfr) r15
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L74
            goto Lc6
        L74:
            java.lang.Object r15 = r14.zzs(r9)
            com.google.android.gms.internal.auth.zzfq r15 = (com.google.android.gms.internal.auth.zzfq) r15
            r15 = 0
            throw r15
        L7c:
            boolean r15 = r14.zzI(r8, r5, r9)
            if (r15 == 0) goto Lc6
            com.google.android.gms.internal.auth.zzgi r15 = r14.zzr(r9)
            boolean r15 = zzG(r8, r13, r15)
            if (r15 != 0) goto Lc6
            return r0
        L8d:
            r15 = r13 & r1
            long r3 = (long) r15
            java.lang.Object r15 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r3)
            java.util.List r15 = (java.util.List) r15
            boolean r3 = r15.isEmpty()
            if (r3 != 0) goto Lc6
            com.google.android.gms.internal.auth.zzgi r3 = r14.zzr(r9)
            r4 = r0
        La1:
            int r5 = r15.size()
            if (r4 >= r5) goto Lc6
            java.lang.Object r5 = r15.get(r4)
            boolean r5 = r3.zzi(r5)
            if (r5 != 0) goto Lb2
            return r0
        Lb2:
            int r4 = r4 + 1
            goto La1
        Lb5:
            boolean r15 = r7.zzF(r8, r9, r10, r11, r12)
            if (r15 == 0) goto Lc6
            com.google.android.gms.internal.auth.zzgi r15 = r14.zzr(r9)
            boolean r15 = zzG(r8, r13, r15)
            if (r15 != 0) goto Lc6
            return r0
        Lc6:
            int r2 = r2 + 1
            r15 = r8
            r3 = r10
            r4 = r11
            goto L7
        Lcd:
            r7 = r14
            return r6
    }
}
