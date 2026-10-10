package com.appsflyer.internal;

/* JADX INFO: loaded from: classes34.dex */
public class AFa1hSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final java.util.Map AFLogger = null;
    private static long afDebugLog;
    private static int afErrorLog;
    private static byte[] afErrorLogForExcManagerOnly;
    private static long afInfoLog;
    private static int afLogForce;
    private static int afWarnLog;

    /* JADX INFO: renamed from: d */
    private static java.lang.Object f6282d;

    /* JADX INFO: renamed from: e */
    public static final java.util.Map f6283e = null;
    private static int force;

    /* JADX INFO: renamed from: i */
    private static byte[] f6284i;
    private static byte[] unregisterClient;

    /* JADX INFO: renamed from: v */
    private static long f6285v;

    /* JADX INFO: renamed from: w */
    private static java.lang.Object f6286w;

    private static java.lang.String $$c(byte r7, short r8, int r9) {
            int r0 = com.appsflyer.internal.AFa1hSDK.$12
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1hSDK.$13 = r1
            int r0 = r0 % 2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L21
            int r9 = r9 + 63
            r0 = 37
            int r0 = r0 % r7
            byte[] r7 = com.appsflyer.internal.AFa1hSDK.$$a
            int r4 = r8 + 25
            byte[] r4 = new byte[r4]
            int r8 = r8 + 110
            if (r7 != 0) goto L1f
            r0 = r3
            goto L2e
        L1f:
            r1 = r3
            goto L3b
        L21:
            int r9 = r9 + 4
            int r0 = 119 - r7
            byte[] r7 = com.appsflyer.internal.AFa1hSDK.$$a
            int r4 = r8 + 1
            byte[] r4 = new byte[r4]
            if (r7 != 0) goto L3a
            r0 = r2
        L2e:
            int r1 = r1 + 19
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1hSDK.$12 = r1
            r1 = r9
            r5 = r4
            r9 = r8
            r4 = r0
            r0 = r1
            goto L51
        L3a:
            r1 = r2
        L3b:
            int r9 = r9 + r3
            byte r5 = (byte) r0
            r4[r1] = r5
            if (r1 != r8) goto L47
            java.lang.String r7 = new java.lang.String
            r7.<init>(r4, r2)
            return r7
        L47:
            int r1 = r1 + 1
            r5 = r7[r9]
            r6 = r9
            r9 = r8
            r8 = r5
            r5 = r4
            r4 = r1
            r1 = r6
        L51:
            int r8 = -r8
            int r0 = r0 + r8
            int r0 = r0 + (-1)
            r8 = r9
            r9 = r1
            r1 = r4
            r4 = r5
            goto L3b
    }

    static {
            java.lang.Class<com.appsflyer.internal.AFa1hSDK> r1 = com.appsflyer.internal.AFa1hSDK.class
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r0 = 193(0xc1, float:2.7E-43)
            java.lang.Class<java.lang.Class> r7 = java.lang.Class.class
            r10 = 282(0x11a, float:3.95E-43)
            r13 = 0
            r14 = 7
            r16 = 1123(0x463, float:1.574E-42)
            r4 = 1
            r17 = 159(0x9f, float:2.23E-43)
            java.lang.Class<byte[]> r5 = byte[].class
            init$0()
            r18 = 147(0x93, float:2.06E-43)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> L1c13
            r19 = 48
            java.lang.Object[] r6 = new java.lang.Object[]{r18}     // Catch: java.lang.Throwable -> L1c13
            byte[] r18 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L1c13
            r20 = 287(0x11f, float:4.02E-43)
            r21 = 102(0x66, float:1.43E-43)
            r8 = r18[r20]     // Catch: java.lang.Throwable -> L1c13
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1c13
            r22 = 324(0x144, float:4.54E-43)
            r9 = r18[r10]     // Catch: java.lang.Throwable -> L1c13
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1c13
            r23 = 32
            r24 = r10
            r10 = r18[r23]     // Catch: java.lang.Throwable -> L1c13
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L1c13
            java.lang.String r8 = $$c(r8, r9, r10)     // Catch: java.lang.Throwable -> L1c13
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L1c13
            r9 = 8
            r10 = r18[r9]     // Catch: java.lang.Throwable -> L1c13
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1c13
            r23 = r9
            r9 = r18[r14]     // Catch: java.lang.Throwable -> L1c13
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1c13
            r25 = 200(0xc8, float:2.8E-43)
            r26 = 4
            r12 = r18[r25]     // Catch: java.lang.Throwable -> L1c13
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L1c13
            java.lang.String r9 = $$c(r10, r9, r12)     // Catch: java.lang.Throwable -> L1c13
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1c13
            java.lang.Class[] r10 = new java.lang.Class[]{r10}     // Catch: java.lang.Throwable -> L1c13
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch: java.lang.Throwable -> L1c13
            r9 = 0
            java.lang.Object r6 = r8.invoke(r9, r6)     // Catch: java.lang.Throwable -> L1c13
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L1c13
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L1c13
            r8 = 6
            long r11 = java.lang.System.currentTimeMillis()
            int r10 = (int) r11
            r11 = -408029237(0xffffffffe7adf7cb, float:-1.6430808E24)
            r12 = r11 ^ r10
            r11 = r11 & r10
            r11 = r11 | r12
            int r11 = ~r11
            r12 = 545546505(0x20846109, float:2.2425882E-19)
            r11 = r11 | r12
            int r11 = r11 * (-756)
            int r11 = -r11
            int r11 = -r11
            r12 = -513727508(0xffffffffe16123ec, float:-2.5956912E20)
            r27 = r12 | r11
            int r27 = r27 << 1
            r11 = r11 ^ r12
            int r27 = r27 - r11
            int r10 = ~r10
            r11 = -408029237(0xffffffffe7adf7cb, float:-1.6430808E24)
            r12 = r11 ^ r10
            r10 = r10 & r11
            r10 = r10 | r12
            int r10 = r10 * 756
            r11 = r27 ^ r10
            r10 = r27 & r10
            int r10 = r10 << r4
            int r11 = r11 + r10
            r10 = -1610589100(0xffffffffa0005c54, float:-1.087257E-19)
            r12 = r6 ^ r10
            r10 = r10 & r6
            r10 = r10 | r12
            r12 = 1347977346(0x50588082, float:1.4529202E10)
            r27 = r10 ^ r12
            r10 = r10 & r12
            r10 = r27 | r10
            int r10 = r10 * 614
            int r10 = -r10
            int r10 = -r10
            r12 = r11 | r10
            int r12 = r12 << r4
            r10 = r10 ^ r11
            int r12 = r12 - r10
            int r10 = ~r6
            r11 = 1516208770(0x5a5f8282, float:1.5728104E16)
            r27 = r11 ^ r10
            r11 = r11 & r10
            r11 = r27 | r11
            int r11 = ~r11
            r27 = -1610589100(0xffffffffa0005c54, float:-1.087257E-19)
            r28 = r11 ^ r27
            r11 = r11 & r27
            r11 = r28 | r11
            int r6 = ~r6
            r27 = 1442357675(0x55f8a1ab, float:3.4171655E13)
            r28 = r8
            r8 = r6 | r27
            int r8 = ~r8
            r29 = r11 ^ r8
            r8 = r8 & r11
            r8 = r29 | r8
            int r8 = r8 * (-1228)
            int r8 = -r8
            int r8 = -r8
            r11 = r12 | r8
            int r11 = r11 << r4
            r8 = r8 ^ r12
            int r11 = r11 - r8
            r8 = -94380330(0xfffffffffa5fded6, float:-2.9060046E35)
            r12 = r8 ^ r10
            r8 = r8 & r10
            r8 = r8 | r12
            int r8 = ~r8
            r10 = -1516208771(0xffffffffa5a07d7d, float:-2.784061E-16)
            r12 = r6 ^ r10
            r6 = r6 & r10
            r6 = r6 | r12
            r10 = r6 ^ r27
            r6 = r6 & r27
            r6 = r6 | r10
            int r6 = ~r6
            r10 = r8 ^ r6
            r6 = r6 & r8
            r6 = r6 | r10
            int r8 = r6 * 614
            r12 = r4
            long r3 = java.lang.System.currentTimeMillis()
            int r3 = (int) r3
            r4 = 385592(0x5e238, float:5.4033E-40)
            int r6 = r6 * r4
            int r4 = r11 * 628
            int r4 = ~r4
            int r6 = r6 - r4
            int r6 = r6 - r12
            r4 = r11 | r3
            int r10 = ~r8
            r29 = r4 ^ r10
            r4 = r4 & r10
            r4 = r29 | r4
            int r4 = r4 * (-627)
            r10 = r6 | r4
            int r10 = r10 << r12
            r4 = r4 ^ r6
            int r10 = r10 - r4
            int r4 = ~r11
            r4 = r4 | r3
            int r4 = ~r4
            r6 = r8 ^ r4
            r4 = r4 & r8
            r4 = r4 | r6
            int r4 = r4 * (-627)
            r6 = r10 | r4
            int r6 = r6 << r12
            r4 = r4 ^ r10
            int r6 = r6 - r4
            int r4 = ~r3
            r10 = r4 ^ r11
            r4 = r4 & r11
            r4 = r4 | r10
            int r4 = ~r4
            r3 = r3 | r8
            int r3 = ~r3
            r3 = r3 | r4
            int r3 = r3 * 627
            int r3 = -r3
            int r3 = -r3
            r4 = r6 ^ r3
            r3 = r3 & r6
            int r3 = r3 << r12
            int r4 = r4 + r3
            if (r4 != 0) goto L138
            goto L1bf0
        L138:
            r3 = -1281604104301336962(0xee36d3db7c6fa67e, double:-8.251567389252479E222)
            com.appsflyer.internal.AFa1hSDK.afInfoLog = r3
            com.appsflyer.internal.AFa1hSDK.afLogForce = r13
            r3 = 2
            com.appsflyer.internal.AFa1hSDK.afWarnLog = r3
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.appsflyer.internal.AFa1hSDK.AFLogger = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.appsflyer.internal.AFa1hSDK.f6283e = r4
            r4 = r18[r25]     // Catch: java.lang.Exception -> L1c0c
            byte r4 = (byte) r4     // Catch: java.lang.Exception -> L1c0c
            r6 = 175(0xaf, float:2.45E-43)
            r6 = r18[r6]     // Catch: java.lang.Exception -> L1c0c
            byte r6 = (byte) r6     // Catch: java.lang.Exception -> L1c0c
            r8 = r18[r20]     // Catch: java.lang.Exception -> L1c0c
            short r8 = (short) r8     // Catch: java.lang.Exception -> L1c0c
            java.lang.String r4 = $$c(r4, r6, r8)     // Catch: java.lang.Exception -> L1c0c
            java.lang.Object r6 = com.appsflyer.internal.AFa1hSDK.f6282d     // Catch: java.lang.Exception -> L1c0c
            if (r6 != 0) goto L178
            r6 = r18[r25]     // Catch: java.lang.Exception -> L1c0c
            byte r6 = (byte) r6     // Catch: java.lang.Exception -> L1c0c
            r8 = 25
            r8 = r18[r8]     // Catch: java.lang.Exception -> L1c0c
            byte r8 = (byte) r8     // Catch: java.lang.Exception -> L1c0c
            r10 = 188(0xbc, float:2.63E-43)
            r10 = r18[r10]     // Catch: java.lang.Exception -> L1c0c
            int r10 = -r10
            short r10 = (short) r10     // Catch: java.lang.Exception -> L1c0c
            java.lang.String r6 = $$c(r6, r8, r10)     // Catch: java.lang.Exception -> L1c0c
            goto L179
        L178:
            r6 = r9
        L179:
            r10 = r18[r20]     // Catch: java.lang.Exception -> L1bd
            byte r10 = (byte) r10     // Catch: java.lang.Exception -> L1bd
            r11 = 205(0xcd, float:2.87E-43)
            r11 = r18[r11]     // Catch: java.lang.Exception -> L1bd
            int r11 = -r11
            byte r11 = (byte) r11
            r29 = 39
            r30 = 13
            r8 = r18[r29]     // Catch: java.lang.Exception -> L1ba
            short r8 = (short) r8     // Catch: java.lang.Exception -> L1ba
            java.lang.String r8 = $$c(r10, r11, r8)     // Catch: java.lang.Exception -> L1ba
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Exception -> L1ba
            r10 = r18[r25]     // Catch: java.lang.Exception -> L1ba
            byte r10 = (byte) r10     // Catch: java.lang.Exception -> L1ba
            r11 = 1160(0x488, float:1.626E-42)
            r11 = r18[r11]     // Catch: java.lang.Exception -> L1ba
            byte r11 = (byte) r11
            r18 = r12
            r12 = r11 | 74
            short r12 = (short) r12
            java.lang.String r10 = $$c(r10, r11, r12)     // Catch: java.lang.Exception -> L1c1
            java.lang.Class[] r11 = new java.lang.Class[r13]     // Catch: java.lang.Exception -> L1c1
            java.lang.reflect.Method r8 = r8.getMethod(r10, r11)     // Catch: java.lang.Exception -> L1c1
            java.lang.Object r8 = r8.invoke(r9, r9)     // Catch: java.lang.Exception -> L1c1
            if (r8 == 0) goto L1c2
            int r10 = com.appsflyer.internal.AFa1hSDK.$11
            r11 = r10 & 33
            r10 = r10 | 33
            int r11 = r11 + r10
            int r11 = r11 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r11
            goto L1ec
        L1ba:
            r18 = r12
            goto L1c1
        L1bd:
            r18 = r12
            r30 = 13
        L1c1:
            r8 = r9
        L1c2:
            byte[] r10 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Exception -> L1ec
            r11 = r10[r20]     // Catch: java.lang.Exception -> L1ec
            byte r11 = (byte) r11     // Catch: java.lang.Exception -> L1ec
            r12 = r10[r24]     // Catch: java.lang.Exception -> L1ec
            byte r12 = (byte) r12     // Catch: java.lang.Exception -> L1ec
            r15 = 108(0x6c, float:1.51E-43)
            short r15 = (short) r15     // Catch: java.lang.Exception -> L1ec
            java.lang.String r11 = $$c(r11, r12, r15)     // Catch: java.lang.Exception -> L1ec
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Exception -> L1ec
            r12 = r10[r30]     // Catch: java.lang.Exception -> L1ec
            byte r12 = (byte) r12     // Catch: java.lang.Exception -> L1ec
            r10 = r10[r25]     // Catch: java.lang.Exception -> L1ec
            byte r10 = (byte) r10     // Catch: java.lang.Exception -> L1ec
            r15 = 129(0x81, float:1.81E-43)
            short r15 = (short) r15     // Catch: java.lang.Exception -> L1ec
            java.lang.String r10 = $$c(r12, r10, r15)     // Catch: java.lang.Exception -> L1ec
            java.lang.Class[] r12 = new java.lang.Class[r13]     // Catch: java.lang.Exception -> L1ec
            java.lang.reflect.Method r10 = r11.getMethod(r10, r12)     // Catch: java.lang.Exception -> L1ec
            java.lang.Object r8 = r10.invoke(r9, r9)     // Catch: java.lang.Exception -> L1ec
        L1ec:
            r11 = 85
            if (r8 == 0) goto L21d
            int r10 = com.appsflyer.internal.AFa1hSDK.$11
            r12 = r10 | 95
            int r12 = r12 << 1
            r10 = r10 ^ 95
            int r12 = r12 - r10
            int r12 = r12 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r12
            java.lang.Class r10 = r8.getClass()     // Catch: java.lang.Exception -> L21d
            byte[] r12 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Exception -> L21d
            r15 = r12[r30]     // Catch: java.lang.Exception -> L21d
            byte r15 = (byte) r15     // Catch: java.lang.Exception -> L21d
            r12 = r12[r11]     // Catch: java.lang.Exception -> L21d
            byte r12 = (byte) r12
            r31 = r11
            r11 = 149(0x95, float:2.09E-43)
            short r11 = (short) r11
            java.lang.String r11 = $$c(r15, r12, r11)     // Catch: java.lang.Exception -> L21b
            java.lang.reflect.Method r10 = r10.getMethod(r11, r9)     // Catch: java.lang.Exception -> L21b
            java.lang.Object r10 = r10.invoke(r8, r9)     // Catch: java.lang.Exception -> L21b
            goto L220
        L21b:
            r10 = r9
            goto L220
        L21d:
            r31 = r11
            goto L21b
        L220:
            if (r8 == 0) goto L272
            int r11 = com.appsflyer.internal.AFa1hSDK.$10
            int r11 = r11 + 17
            int r12 = r11 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r12
            int r11 = r11 % r3
            if (r11 != 0) goto L255
            java.lang.Class r11 = r8.getClass()     // Catch: java.lang.Exception -> L252
            byte[] r12 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Exception -> L252
            r15 = 127(0x7f, float:1.78E-43)
            r15 = r12[r15]     // Catch: java.lang.Exception -> L252
            byte r15 = (byte) r15     // Catch: java.lang.Exception -> L252
            r32 = 19
            r12 = r12[r32]     // Catch: java.lang.Exception -> L252
            byte r12 = (byte) r12
            r32 = r13
            r13 = r12 ^ 12021(0x2ef5, float:1.6845E-41)
            r14 = r12 & 12021(0x2ef5, float:1.6845E-41)
            r13 = r13 | r14
            short r13 = (short) r13
            java.lang.String r12 = $$c(r15, r12, r13)     // Catch: java.lang.Exception -> L270
        L249:
            java.lang.reflect.Method r11 = r11.getMethod(r12, r9)     // Catch: java.lang.Exception -> L270
            java.lang.Object r11 = r11.invoke(r8, r9)     // Catch: java.lang.Exception -> L270
            goto L275
        L252:
            r32 = r13
            goto L270
        L255:
            r32 = r13
            java.lang.Class r11 = r8.getClass()     // Catch: java.lang.Exception -> L270
            byte[] r12 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Exception -> L270
            r13 = r12[r30]     // Catch: java.lang.Exception -> L270
            byte r13 = (byte) r13     // Catch: java.lang.Exception -> L270
            r14 = 43
            r12 = r12[r14]     // Catch: java.lang.Exception -> L270
            byte r12 = (byte) r12     // Catch: java.lang.Exception -> L270
            r14 = r12 ^ 145(0x91, float:2.03E-43)
            r15 = r12 & 145(0x91, float:2.03E-43)
            r14 = r14 | r15
            short r14 = (short) r14     // Catch: java.lang.Exception -> L270
            java.lang.String r12 = $$c(r13, r12, r14)     // Catch: java.lang.Exception -> L270
            goto L249
        L270:
            r11 = r9
            goto L27b
        L272:
            r32 = r13
            r11 = r9
        L275:
            java.lang.System.currentTimeMillis()
            java.lang.System.currentTimeMillis()
        L27b:
            if (r8 == 0) goto L2d8
            java.lang.Class r12 = r8.getClass()     // Catch: java.lang.Exception -> L2d8
            byte[] r14 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Exception -> L2d8
            r15 = r14[r30]     // Catch: java.lang.Exception -> L2d8
            byte r15 = (byte) r15     // Catch: java.lang.Exception -> L2d8
            r14 = r14[r31]     // Catch: java.lang.Exception -> L2d8
            byte r14 = (byte) r14
            r34 = 45
            int r13 = com.appsflyer.internal.AFa1hSDK.$$b     // Catch: java.lang.Exception -> L2d2
            r35 = r3
            r36 = r4
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2d6
            int r3 = (int) r3     // Catch: java.lang.Exception -> L2d6
            int r4 = r13 * 46
            int r9 = ~r13     // Catch: java.lang.Exception -> L2d6
            int r4 = r4 + 44
            r38 = r4
            int r4 = ~r13     // Catch: java.lang.Exception -> L2d6
            r39 = r4 ^ r3
            r4 = r4 & r3
            r4 = r39 | r4
            int r4 = ~r4     // Catch: java.lang.Exception -> L2d6
            r39 = -1
            r39 = r39 ^ r13
            r13 = r39 | r13
            int r13 = ~r13     // Catch: java.lang.Exception -> L2d6
            r39 = r4 ^ r13
            r4 = r4 & r13
            r4 = r39 | r4
            int r4 = r4 * (-45)
            int r4 = ~r4     // Catch: java.lang.Exception -> L2d6
            int r4 = r38 - r4
            int r4 = r4 + (-1)
            int r3 = ~r3     // Catch: java.lang.Exception -> L2d6
            r3 = r3 | r9
            int r3 = r3 * 45
            int r3 = -r3
            int r3 = -r3
            r9 = r4 | r3
            int r9 = r9 << 1
            r3 = r3 ^ r4
            int r9 = r9 - r3
            short r3 = (short) r9     // Catch: java.lang.Exception -> L2d6
            java.lang.String r3 = $$c(r15, r14, r3)     // Catch: java.lang.Exception -> L2d6
            r4 = 0
            java.lang.reflect.Method r3 = r12.getMethod(r3, r4)     // Catch: java.lang.Exception -> L2d6
            java.lang.Object r3 = r3.invoke(r8, r4)     // Catch: java.lang.Exception -> L2d6
            goto L2df
        L2d2:
            r35 = r3
            r36 = r4
        L2d6:
            r3 = 0
            goto L2df
        L2d8:
            r35 = r3
            r36 = r4
            r34 = 45
            goto L2d6
        L2df:
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8 = 219(0xdb, float:3.07E-43)
            r9 = 356(0x164, float:4.99E-43)
            if (r10 == 0) goto L2e8
            goto L33d
        L2e8:
            if (r6 != 0) goto L2fd
            int r6 = com.appsflyer.internal.AFa1hSDK.$10
            int r6 = r6 + 71
            int r10 = r6 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r10
            int r6 = r6 % 2
            if (r6 == 0) goto L2f8
            r10 = 0
            goto L33d
        L2f8:
            r37 = 0
            throw r37     // Catch: java.lang.Throwable -> L2fb java.lang.Exception -> L1c0c
        L2fb:
            r0 = move-exception
            throw r0
        L2fd:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1c0c
            r10.<init>()     // Catch: java.lang.Exception -> L1c0c
            byte[] r12 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Exception -> L1c0c
            r13 = 734(0x2de, float:1.029E-42)
            r13 = r12[r13]     // Catch: java.lang.Exception -> L1c0c
            int r13 = -r13
            byte r13 = (byte) r13     // Catch: java.lang.Exception -> L1c0c
            r14 = r12[r31]     // Catch: java.lang.Exception -> L1c0c
            byte r14 = (byte) r14     // Catch: java.lang.Exception -> L1c0c
            r15 = 183(0xb7, float:2.56E-43)
            short r15 = (short) r15     // Catch: java.lang.Exception -> L1c0c
            java.lang.String r13 = $$c(r13, r14, r15)     // Catch: java.lang.Exception -> L1c0c
            r10.append(r13)     // Catch: java.lang.Exception -> L1c0c
            r10.append(r6)     // Catch: java.lang.Exception -> L1c0c
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Exception -> L1c0c
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L1c03
            r10 = r12[r9]     // Catch: java.lang.Throwable -> L1c03
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1c03
            r12 = r12[r8]     // Catch: java.lang.Throwable -> L1c03
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1c03
            short r13 = (short) r0     // Catch: java.lang.Throwable -> L1c03
            java.lang.String r10 = $$c(r10, r12, r13)     // Catch: java.lang.Throwable -> L1c03
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L1c03
            java.lang.Class[] r12 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L1c03
            java.lang.reflect.Constructor r10 = r10.getDeclaredConstructor(r12)     // Catch: java.lang.Throwable -> L1c03
            java.lang.Object r10 = r10.newInstance(r6)     // Catch: java.lang.Throwable -> L1c03
        L33d:
            if (r3 == 0) goto L340
            goto L3aa
        L340:
            byte[] r3 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Exception -> L1c0c
            r6 = r3[r9]     // Catch: java.lang.Exception -> L1c0c
            byte r6 = (byte) r6     // Catch: java.lang.Exception -> L1c0c
            byte r12 = (byte) r6     // Catch: java.lang.Exception -> L1c0c
            r13 = 204(0xcc, float:2.86E-43)
            short r13 = (short) r13     // Catch: java.lang.Exception -> L1c0c
            java.lang.String r6 = $$c(r6, r12, r13)     // Catch: java.lang.Exception -> L1c0c
            int r12 = com.appsflyer.internal.AFa1hSDK.$11
            r13 = r12 ^ 119(0x77, float:1.67E-43)
            r12 = r12 & 119(0x77, float:1.67E-43)
            int r12 = r12 << 1
            int r13 = r13 + r12
            int r13 = r13 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r13
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L1bfa
            r12 = r3[r9]     // Catch: java.lang.Throwable -> L1bfa
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1bfa
            r13 = 662(0x296, float:9.28E-43)
            r13 = r3[r13]     // Catch: java.lang.Throwable -> L1bfa
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1bfa
            r14 = 217(0xd9, float:3.04E-43)
            short r14 = (short) r14     // Catch: java.lang.Throwable -> L1bfa
            java.lang.String r12 = $$c(r12, r13, r14)     // Catch: java.lang.Throwable -> L1bfa
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L1bfa
            r13 = r3[r30]     // Catch: java.lang.Throwable -> L1bfa
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1bfa
            r14 = r3[r31]     // Catch: java.lang.Throwable -> L1bfa
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1bfa
            r15 = 232(0xe8, float:3.25E-43)
            short r15 = (short) r15     // Catch: java.lang.Throwable -> L1bfa
            java.lang.String r13 = $$c(r13, r14, r15)     // Catch: java.lang.Throwable -> L1bfa
            java.lang.Class[] r14 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L1bfa
            java.lang.reflect.Method r12 = r12.getMethod(r13, r14)     // Catch: java.lang.Throwable -> L1bfa
            r13 = 0
            java.lang.Object r6 = r12.invoke(r13, r6)     // Catch: java.lang.Throwable -> L1bfa
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L1bf1
            r12 = r3[r9]     // Catch: java.lang.Throwable -> L1bf1
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1bf1
            r3 = r3[r8]     // Catch: java.lang.Throwable -> L1bf1
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1bf1
            short r13 = (short) r0     // Catch: java.lang.Throwable -> L1bf1
            java.lang.String r3 = $$c(r12, r3, r13)     // Catch: java.lang.Throwable -> L1bf1
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L1bf1
            java.lang.Class[] r12 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L1bf1
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r12)     // Catch: java.lang.Throwable -> L1bf1
            java.lang.Object r3 = r3.newInstance(r6)     // Catch: java.lang.Throwable -> L1bf1
        L3aa:
            r6 = 5
            if (r11 != 0) goto L3f9
            if (r10 == 0) goto L3f9
            byte[] r11 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Exception -> L1c0c
            r12 = r11[r25]     // Catch: java.lang.Exception -> L1c0c
            byte r12 = (byte) r12     // Catch: java.lang.Exception -> L1c0c
            r13 = r11[r6]     // Catch: java.lang.Exception -> L1c0c
            byte r13 = (byte) r13     // Catch: java.lang.Exception -> L1c0c
            r14 = 242(0xf2, float:3.39E-43)
            short r14 = (short) r14     // Catch: java.lang.Exception -> L1c0c
            java.lang.String r12 = $$c(r12, r13, r14)     // Catch: java.lang.Exception -> L1c0c
            r13 = r35
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L3f0
            r14[r18] = r12     // Catch: java.lang.Throwable -> L3f0
            r14[r32] = r10     // Catch: java.lang.Throwable -> L3f0
            r12 = r11[r9]     // Catch: java.lang.Throwable -> L3f0
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L3f0
            r13 = r11[r8]     // Catch: java.lang.Throwable -> L3f0
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L3f0
            short r15 = (short) r0     // Catch: java.lang.Throwable -> L3f0
            java.lang.String r12 = $$c(r12, r13, r15)     // Catch: java.lang.Throwable -> L3f0
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L3f0
            r13 = r11[r9]     // Catch: java.lang.Throwable -> L3f0
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L3f0
            r11 = r11[r8]     // Catch: java.lang.Throwable -> L3f0
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L3f0
            java.lang.String r11 = $$c(r13, r11, r15)     // Catch: java.lang.Throwable -> L3f0
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L3f0
            java.lang.Class[] r11 = new java.lang.Class[]{r11, r4}     // Catch: java.lang.Throwable -> L3f0
            java.lang.reflect.Constructor r11 = r12.getDeclaredConstructor(r11)     // Catch: java.lang.Throwable -> L3f0
            java.lang.Object r11 = r11.newInstance(r14)     // Catch: java.lang.Throwable -> L3f0
            goto L3f9
        L3f0:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L1c0c
            if (r1 == 0) goto L3f8
            throw r1     // Catch: java.lang.Exception -> L1c0c
        L3f8:
            throw r0     // Catch: java.lang.Exception -> L1c0c
        L3f9:
            byte[] r12 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Exception -> L1c0c
            r13 = r12[r9]     // Catch: java.lang.Exception -> L1c0c
            byte r13 = (byte) r13     // Catch: java.lang.Exception -> L1c0c
            r14 = r12[r8]     // Catch: java.lang.Exception -> L1c0c
            byte r14 = (byte) r14     // Catch: java.lang.Exception -> L1c0c
            short r15 = (short) r0     // Catch: java.lang.Exception -> L1c0c
            java.lang.String r0 = $$c(r13, r14, r15)     // Catch: java.lang.Exception -> L1c0c
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1c0c
            r13 = 7
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r13)     // Catch: java.lang.Exception -> L1c0c
            r13 = r0
            java.lang.Object[] r13 = (java.lang.Object[]) r13     // Catch: java.lang.Exception -> L1c0c
            r37 = 0
            r13[r32] = r37     // Catch: java.lang.Exception -> L1c0c
            r13[r18] = r11     // Catch: java.lang.Exception -> L1c0c
            r35 = 2
            r13[r35] = r10     // Catch: java.lang.Exception -> L1c0c
            r14 = 3
            r13[r14] = r3     // Catch: java.lang.Exception -> L1c0c
            r13[r26] = r11     // Catch: java.lang.Exception -> L1c0c
            r13[r6] = r10     // Catch: java.lang.Exception -> L1c0c
            r13[r28] = r3     // Catch: java.lang.Exception -> L1c0c
            r3 = 7
            boolean[] r11 = new boolean[r3]     // Catch: java.lang.Exception -> L1c0c
            r11 = {x1c1c: FILL_ARRAY_DATA , data: [0, 1, 1, 1, 1, 1, 1} // fill-array     // Catch: java.lang.Exception -> L1c0c
            boolean[] r10 = new boolean[r3]     // Catch: java.lang.Exception -> L1c0c
            r10 = {x1c24: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 1, 1, 1} // fill-array     // Catch: java.lang.Exception -> L1c0c
            r38 = r8
            boolean[] r8 = new boolean[r3]     // Catch: java.lang.Exception -> L1c0c
            r8[r32] = r32     // Catch: java.lang.Exception -> L1c0c
            r8[r18] = r32     // Catch: java.lang.Exception -> L1c0c
            r35 = 2
            r8[r35] = r18     // Catch: java.lang.Exception -> L1c0c
            r8[r14] = r18     // Catch: java.lang.Exception -> L1c0c
            r8[r26] = r32     // Catch: java.lang.Exception -> L1c0c
            r8[r6] = r18     // Catch: java.lang.Exception -> L1c0c
            r8[r28] = r18     // Catch: java.lang.Exception -> L1c0c
            r3 = 26
            r0 = r12[r20]     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            byte r0 = (byte) r0     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            r14 = r12[r22]     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            byte r14 = (byte) r14     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            r6 = 251(0xfb, float:3.52E-43)
            short r6 = (short) r6     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            java.lang.String r0 = $$c(r0, r14, r6)     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            r6 = 90
            r6 = r12[r6]     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            byte r6 = (byte) r6     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            r12 = r12[r17]     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            byte r12 = (byte) r12     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            r14 = 274(0x112, float:3.84E-43)
            short r14 = (short) r14     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            java.lang.String r6 = $$c(r6, r12, r14)     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            java.lang.reflect.Field r6 = r0.getDeclaredField(r6)     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            int r0 = r6.getInt(r0)     // Catch: java.lang.ClassNotFoundException -> L4ab java.lang.Exception -> L1c0c
            r6 = 34
            if (r0 < r6) goto L475
            r12 = r18
            goto L477
        L475:
            r12 = r32
        L477:
            r6 = 29
            if (r0 != r6) goto L47c
            goto L481
        L47c:
            if (r0 < r3) goto L481
            r6 = r18
            goto L483
        L481:
            r6 = r32
        L483:
            r8[r32] = r6     // Catch: java.lang.ClassNotFoundException -> L4a9 java.lang.Exception -> L1c0c
            r6 = 21
            if (r0 < r6) goto L497
            int r6 = com.appsflyer.internal.AFa1hSDK.$11
            int r6 = r6 + 89
            int r14 = r6 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r14
            r35 = 2
            int r6 = r6 % 2
            if (r6 == 0) goto L49a
        L497:
            r6 = r32
            goto L49c
        L49a:
            r6 = r18
        L49c:
            r8[r18] = r6     // Catch: java.lang.ClassNotFoundException -> L4a9 java.lang.Exception -> L1c0c
            r6 = 21
            if (r0 < r6) goto L4a5
            r0 = r18
            goto L4a7
        L4a5:
            r0 = r32
        L4a7:
            r8[r26] = r0     // Catch: java.lang.ClassNotFoundException -> L4a9 java.lang.Exception -> L1c0c
        L4a9:
            r6 = r12
            goto L4ae
        L4ab:
            r12 = r32
            goto L4a9
        L4ae:
            r12 = r32
            r14 = r12
        L4b1:
            if (r14 != 0) goto L1bf0
            java.lang.System.currentTimeMillis()
            java.lang.System.currentTimeMillis()
            r41 = r9
            r9 = 9
            if (r12 >= r9) goto L1bf0
            boolean r0 = r8[r12]     // Catch: java.lang.Exception -> L1c0c
            r42 = r9
            r9 = r18
            if (r0 == r9) goto L4ec
            r9 = r12
            r37 = r2
            r2 = r1
            r1 = r37
            r46 = r3
            r64 = r5
            r45 = r6
            r49 = r8
            r47 = r9
            r48 = r10
            r55 = r11
            r44 = r13
            r54 = r14
            r62 = r15
            r13 = 7
            r37 = 0
            r39 = 3
            r40 = 5
            r56 = 16
            goto L1b80
        L4ec:
            r9 = r12
            r18 = 191(0xbf, float:2.68E-43)
            boolean r12 = r11[r9]     // Catch: java.lang.Throwable -> L1b4b
            r0 = r13[r9]     // Catch: java.lang.Throwable -> L1b4b
            boolean r44 = r10[r9]     // Catch: java.lang.Throwable -> L1b4b
            if (r12 == 0) goto L5f1
            if (r0 == 0) goto L583
            int r45 = com.appsflyer.internal.AFa1hSDK.$11
            r46 = r3
            int r3 = r45 + 77
            r45 = r6
            int r6 = r3 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r6
            r35 = 2
            int r3 = r3 % 2
            if (r3 == 0) goto L530
            r3 = 36
            int r3 = r3 / 0
            goto L530
        L510:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r49 = r8
            r47 = r9
        L51c:
            r48 = r10
        L51e:
            r55 = r11
            r44 = r13
            r54 = r14
            r62 = r15
            r39 = 3
            r40 = 5
            r43 = 1
        L52c:
            r56 = 16
            goto L1b60
        L530:
            byte[] r3 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L56e
            r6 = r3[r41]     // Catch: java.lang.Throwable -> L56e
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L56e
            r47 = r3
            r3 = r47[r38]     // Catch: java.lang.Throwable -> L56e
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L56e
            java.lang.String r3 = $$c(r6, r3, r15)     // Catch: java.lang.Throwable -> L56e
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L56e
            r6 = r47[r25]     // Catch: java.lang.Throwable -> L56e
            byte r6 = (byte) r6
            r48 = 15
            r49 = r8
            r8 = r47[r48]     // Catch: java.lang.Throwable -> L56a
            byte r8 = (byte) r8
            r47 = r9
            r9 = 280(0x118, float:3.92E-43)
            short r9 = (short) r9
            java.lang.String r6 = $$c(r6, r8, r9)     // Catch: java.lang.Throwable -> L568
            r8 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r6, r8)     // Catch: java.lang.Throwable -> L568
            java.lang.Object r3 = r3.invoke(r0, r8)     // Catch: java.lang.Throwable -> L568
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L568
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L568
            if (r3 == 0) goto L58b
            goto L5f9
        L568:
            r0 = move-exception
            goto L572
        L56a:
            r0 = move-exception
        L56b:
            r47 = r9
            goto L572
        L56e:
            r0 = move-exception
            r49 = r8
            goto L56b
        L572:
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L579
            if (r3 == 0) goto L582
            throw r3     // Catch: java.lang.Throwable -> L579
        L579:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            goto L51c
        L582:
            throw r0     // Catch: java.lang.Throwable -> L579
        L583:
            r46 = r3
            r45 = r6
            r49 = r8
            r47 = r9
        L58b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L579
            r3.<init>()     // Catch: java.lang.Throwable -> L579
            byte[] r6 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L579
            r8 = r6[r21]     // Catch: java.lang.Throwable -> L579
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L579
            r9 = r6[r42]     // Catch: java.lang.Throwable -> L579
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L579
            r12 = r9 ^ 283(0x11b, float:3.97E-43)
            r44 = r6
            r6 = r9 & 283(0x11b, float:3.97E-43)
            r6 = r6 | r12
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L579
            java.lang.String r6 = $$c(r8, r9, r6)     // Catch: java.lang.Throwable -> L579
            r3.append(r6)     // Catch: java.lang.Throwable -> L579
            r3.append(r0)     // Catch: java.lang.Throwable -> L579
            r0 = r44[r16]     // Catch: java.lang.Throwable -> L579
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L579
            r6 = r44[r46]     // Catch: java.lang.Throwable -> L579
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L579
            r8 = 291(0x123, float:4.08E-43)
            r9 = r6 ^ 291(0x123, float:4.08E-43)
            r12 = r6 & 291(0x123, float:4.08E-43)
            r8 = r9 | r12
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L579
            java.lang.String r0 = $$c(r0, r6, r8)     // Catch: java.lang.Throwable -> L579
            r3.append(r0)     // Catch: java.lang.Throwable -> L579
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L579
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L5e8
            r3 = r44[r41]     // Catch: java.lang.Throwable -> L5e8
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L5e8
            r6 = r44[r18]     // Catch: java.lang.Throwable -> L5e8
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L5e8
            r8 = 291(0x123, float:4.08E-43)
            short r9 = (short) r8     // Catch: java.lang.Throwable -> L5e8
            java.lang.String r3 = $$c(r3, r6, r9)     // Catch: java.lang.Throwable -> L5e8
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L5e8
            java.lang.Class[] r6 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L5e8
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r6)     // Catch: java.lang.Throwable -> L5e8
            java.lang.Object r0 = r3.newInstance(r0)     // Catch: java.lang.Throwable -> L5e8
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L5e8
            throw r0     // Catch: java.lang.Throwable -> L5e8
        L5e8:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L579
            if (r3 == 0) goto L5f0
            throw r3     // Catch: java.lang.Throwable -> L579
        L5f0:
            throw r0     // Catch: java.lang.Throwable -> L579
        L5f1:
            r46 = r3
            r45 = r6
            r49 = r8
            r47 = r9
        L5f9:
            if (r12 == 0) goto La47
            java.util.Random r3 = new java.util.Random     // Catch: java.lang.Throwable -> La42
            r3.<init>()     // Catch: java.lang.Throwable -> La42
            byte[] r6 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> La36
            r8 = r6[r41]     // Catch: java.lang.Throwable -> La36
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> La36
            r9 = 662(0x296, float:9.28E-43)
            r9 = r6[r9]     // Catch: java.lang.Throwable -> La36
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> La36
            r48 = r6
            r6 = 217(0xd9, float:3.04E-43)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> La36
            java.lang.String r6 = $$c(r8, r9, r6)     // Catch: java.lang.Throwable -> La36
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> La36
            r8 = r48[r25]     // Catch: java.lang.Throwable -> La36
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> La36
            r9 = r48[r30]     // Catch: java.lang.Throwable -> La36
            byte r9 = (byte) r9
            r48 = r10
            r10 = r9 ^ 293(0x125, float:4.1E-43)
            r50 = r10
            r10 = r9 & 293(0x125, float:4.1E-43)
            r10 = r50 | r10
            short r10 = (short) r10
            java.lang.String r8 = $$c(r8, r9, r10)     // Catch: java.lang.Throwable -> La32
            r9 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r8, r9)     // Catch: java.lang.Throwable -> La32
            java.lang.Object r6 = r6.invoke(r9, r9)     // Catch: java.lang.Throwable -> La32
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> La32
            long r8 = r6.longValue()     // Catch: java.lang.Throwable -> La32
            r50 = -1617552406(0xffffffff9f961bea, double:NaN)
            long r8 = r8 ^ r50
            r3.setSeed(r8)     // Catch: java.lang.Throwable -> L7a5
            r6 = 0
            r8 = 0
            r9 = 0
            r50 = 0
        L648:
            if (r6 != 0) goto La29
            int r10 = com.appsflyer.internal.AFa1hSDK.$11
            r51 = r10 ^ 49
            r10 = r10 & 49
            r43 = 1
            int r10 = r10 << 1
            int r10 = r51 + r10
            r51 = r6
            int r6 = r10 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r6
            r35 = 2
            int r10 = r10 % 2
            if (r10 != 0) goto La24
            if (r8 != 0) goto L667
            r6 = r28
            goto L671
        L667:
            if (r9 != 0) goto L66b
            r6 = 5
            goto L671
        L66b:
            if (r50 != 0) goto L670
            r6 = r26
            goto L671
        L670:
            r6 = 3
        L671:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a5
            r52 = r8
            r53 = r9
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7a5
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L7a5
            int r9 = r6 * 407
            int r9 = -r9
            int r9 = -r9
            r54 = -405(0xfffffffffffffe6b, float:NaN)
            r55 = r54 | r9
            r43 = 1
            int r55 = r55 << 1
            r9 = r54 ^ r9
            int r55 = r55 - r9
            int r9 = ~r6     // Catch: java.lang.Throwable -> L7a5
            r54 = r9 ^ r8
            r9 = r9 & r8
            r9 = r54 | r9
            int r9 = ~r9     // Catch: java.lang.Throwable -> L7a5
            r54 = r9
            int r9 = ~r8     // Catch: java.lang.Throwable -> L7a5
            r56 = r9 ^ 1
            r57 = r9 & 1
            r56 = r56 | r57
            r57 = r9
            r9 = r56 | r6
            int r9 = ~r9     // Catch: java.lang.Throwable -> L7a5
            r56 = r54 ^ r9
            r9 = r54 & r9
            r9 = r56 | r9
            int r9 = r9 * (-406)
            int r9 = -r9
            int r9 = -r9
            r54 = r55 & r9
            r9 = r55 | r9
            int r54 = r54 + r9
            int r9 = ~r6     // Catch: java.lang.Throwable -> L7a5
            r55 = r9
            int r9 = ~r8     // Catch: java.lang.Throwable -> L7a5
            r9 = r55 | r9
            r43 = 1
            r55 = r9 ^ 1
            r9 = r9 & 1
            r9 = r55 | r9
            int r9 = ~r9     // Catch: java.lang.Throwable -> L7a5
            int r9 = r9 * (-406)
            r55 = r54 & r9
            r9 = r54 | r9
            int r55 = r55 + r9
            r9 = -2
            r8 = r8 | r9
            int r8 = ~r8     // Catch: java.lang.Throwable -> L7a5
            r9 = r57 ^ r6
            r54 = r57 & r6
            r9 = r9 | r54
            int r9 = ~r9     // Catch: java.lang.Throwable -> L7a5
            r8 = r8 | r9
            int r8 = r8 * 406
            int r8 = -r8
            int r8 = -r8
            r9 = r55 & r8
            r8 = r55 | r8
            int r9 = r9 + r8
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L7a5
            r8 = 46
            r10.append(r8)     // Catch: java.lang.Throwable -> L7a5
            r8 = r32
        L6e6:
            if (r8 >= r6) goto L80d
            if (r44 == 0) goto L7a9
            int r9 = com.appsflyer.internal.AFa1hSDK.$10
            int r9 = r9 + 61
            r54 = r6
            int r6 = r9 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r6
            r35 = 2
            int r9 = r9 % 2
            if (r9 != 0) goto L71a
            r6 = 16
            int r9 = r3.nextInt(r6)     // Catch: java.lang.Throwable -> L710
            r6 = r10
            boolean r27 = r3.nextBoolean()     // Catch: java.lang.Throwable -> L710
            if (r27 == 0) goto L70a
        L707:
            r55 = r11
            goto L72a
        L70a:
            r58 = r8
            r55 = r11
            goto L79b
        L710:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            goto L51e
        L71a:
            r6 = r10
            r9 = r46
            int r27 = r3.nextInt(r9)     // Catch: java.lang.Throwable -> L7a5
            boolean r9 = r3.nextBoolean()     // Catch: java.lang.Throwable -> L7a5
            if (r9 == 0) goto L797
            r9 = r27
            goto L707
        L72a:
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L77f
            int r10 = (int) r10     // Catch: java.lang.Throwable -> L77f
            int r11 = r9 * 141
            int r11 = r11 + (-18135)
            r27 = r10 ^ 65
            r57 = r10 & 65
            r58 = r8
            r8 = r27 | r57
            int r8 = r8 * 140
            int r8 = -r8
            int r8 = -r8
            r27 = r11 | r8
            r43 = 1
            int r27 = r27 << 1
            r8 = r8 ^ r11
            int r27 = r27 - r8
            int r8 = ~r9     // Catch: java.lang.Throwable -> L77f
            r11 = r8 ^ 65
            r8 = r8 & 65
            r8 = r8 | r11
            int r11 = ~r8     // Catch: java.lang.Throwable -> L77f
            r57 = r8
            int r8 = ~r10     // Catch: java.lang.Throwable -> L77f
            r59 = r8 ^ 65
            r8 = r8 & 65
            r8 = r59 | r8
            int r8 = ~r8     // Catch: java.lang.Throwable -> L77f
            r59 = r11 ^ r8
            r8 = r8 & r11
            r8 = r59 | r8
            int r8 = r8 * (-280)
            int r27 = r27 + r8
            r8 = -66
            r11 = r8 ^ r9
            r8 = r8 & r9
            r8 = r8 | r11
            int r8 = ~r8     // Catch: java.lang.Throwable -> L77f
            int r11 = ~r10     // Catch: java.lang.Throwable -> L77f
            r9 = r9 | r11
            int r9 = ~r9     // Catch: java.lang.Throwable -> L77f
            r11 = r8 ^ r9
            r8 = r8 & r9
            r8 = r8 | r11
            r9 = r57 | r10
            int r9 = ~r9     // Catch: java.lang.Throwable -> L77f
            r10 = r8 ^ r9
            r8 = r8 & r9
            r8 = r8 | r10
            int r8 = r8 * 140
            r9 = r27 & r8
            r8 = r27 | r8
            int r9 = r9 + r8
            goto L79e
        L77f:
            r0 = move-exception
        L780:
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r44 = r13
            r54 = r14
            r62 = r15
            r39 = 3
            r40 = 5
            r43 = 1
            r46 = 26
            goto L52c
        L797:
            r9 = r27
            goto L70a
        L79b:
            int r8 = ~r9     // Catch: java.lang.Throwable -> L77f
            int r9 = 95 - r8
        L79e:
            char r8 = (char) r9     // Catch: java.lang.Throwable -> L77f
            r6.append(r8)     // Catch: java.lang.Throwable -> L77f
        L7a2:
            r43 = 1
            goto L7ff
        L7a5:
            r0 = move-exception
        L7a6:
            r55 = r11
            goto L780
        L7a9:
            r54 = r6
            r58 = r8
            r6 = r10
            r55 = r11
            r8 = 12
            int r8 = r3.nextInt(r8)     // Catch: java.lang.Throwable -> L77f
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L77f
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L77f
            int r10 = r8 * (-755)
            r11 = -6184960(0xffffffffffa1a000, float:NaN)
            r27 = r10 ^ r11
            r10 = r10 & r11
            r43 = 1
            int r10 = r10 << 1
            int r27 = r27 + r10
            int r10 = ~r8     // Catch: java.lang.Throwable -> L77f
            r10 = r10 | (-8193(0xffffffffffffdfff, float:NaN))
            int r10 = ~r10     // Catch: java.lang.Throwable -> L77f
            int r10 = r10 * 1512
            int r27 = r27 + r10
            int r10 = ~r8     // Catch: java.lang.Throwable -> L77f
            r11 = r10 ^ (-8193(0xffffffffffffdfff, float:NaN))
            r10 = r10 & (-8193(0xffffffffffffdfff, float:NaN))
            r10 = r10 | r11
            int r10 = ~r10     // Catch: java.lang.Throwable -> L77f
            r11 = r8 ^ 8192(0x2000, float:1.148E-41)
            r8 = r8 & 8192(0x2000, float:1.148E-41)
            r8 = r8 | r11
            r11 = r8 ^ r9
            r57 = r8 & r9
            r11 = r11 | r57
            int r11 = ~r11     // Catch: java.lang.Throwable -> L77f
            r10 = r10 | r11
            int r10 = r10 * (-756)
            int r10 = -r10
            int r10 = -r10
            r11 = r27 ^ r10
            r10 = r27 & r10
            r43 = 1
            int r10 = r10 << 1
            int r11 = r11 + r10
            int r9 = ~r9     // Catch: java.lang.Throwable -> L77f
            r10 = r8 ^ r9
            r8 = r8 & r9
            r8 = r8 | r10
            int r8 = r8 * 756
            int r11 = r11 + r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L77f
            r6.append(r8)     // Catch: java.lang.Throwable -> L77f
            goto L7a2
        L7ff:
            r8 = r58 & 1
            r9 = r58 | 1
            int r8 = r8 + r9
            r10 = r6
            r6 = r54
            r11 = r55
            r46 = 26
            goto L6e6
        L80d:
            r6 = r10
            r55 = r11
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L77f
            if (r52 != 0) goto L85b
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L852
            r43 = 1
            r9[r43] = r6     // Catch: java.lang.Throwable -> L852
            r9[r32] = r0     // Catch: java.lang.Throwable -> L852
            byte[] r6 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L852
            r8 = r6[r41]     // Catch: java.lang.Throwable -> L852
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L852
            r10 = r6[r38]     // Catch: java.lang.Throwable -> L852
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L852
            java.lang.String r8 = $$c(r8, r10, r15)     // Catch: java.lang.Throwable -> L852
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L852
            r10 = r6[r41]     // Catch: java.lang.Throwable -> L852
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L852
            r6 = r6[r38]     // Catch: java.lang.Throwable -> L852
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L852
            java.lang.String r6 = $$c(r10, r6, r15)     // Catch: java.lang.Throwable -> L852
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L852
            java.lang.Class[] r6 = new java.lang.Class[]{r6, r4}     // Catch: java.lang.Throwable -> L852
            java.lang.reflect.Constructor r6 = r8.getDeclaredConstructor(r6)     // Catch: java.lang.Throwable -> L852
            java.lang.Object r6 = r6.newInstance(r9)     // Catch: java.lang.Throwable -> L852
            r27 = r3
            r8 = r6
            r6 = r51
        L84e:
            r9 = r53
            goto L99b
        L852:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L77f
            if (r3 == 0) goto L85a
            throw r3     // Catch: java.lang.Throwable -> L77f
        L85a:
            throw r0     // Catch: java.lang.Throwable -> L77f
        L85b:
            if (r53 != 0) goto L8c1
            int r8 = com.appsflyer.internal.AFa1hSDK.$10
            r9 = r8 | 75
            r43 = 1
            int r9 = r9 << 1
            r10 = r8 ^ 75
            int r9 = r9 - r10
            int r10 = r9 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r10
            r35 = 2
            int r9 = r9 % 2
            if (r9 != 0) goto L876
            r9 = 68
            int r9 = r9 / 0
        L876:
            int r8 = r8 + 71
            int r8 = r8 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r8
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L8b8
            r43 = 1
            r9[r43] = r6     // Catch: java.lang.Throwable -> L8b8
            r9[r32] = r0     // Catch: java.lang.Throwable -> L8b8
            byte[] r6 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L8b8
            r8 = r6[r41]     // Catch: java.lang.Throwable -> L8b8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L8b8
            r10 = r6[r38]     // Catch: java.lang.Throwable -> L8b8
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L8b8
            java.lang.String r8 = $$c(r8, r10, r15)     // Catch: java.lang.Throwable -> L8b8
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L8b8
            r10 = r6[r41]     // Catch: java.lang.Throwable -> L8b8
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L8b8
            r6 = r6[r38]     // Catch: java.lang.Throwable -> L8b8
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L8b8
            java.lang.String r6 = $$c(r10, r6, r15)     // Catch: java.lang.Throwable -> L8b8
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L8b8
            java.lang.Class[] r6 = new java.lang.Class[]{r6, r4}     // Catch: java.lang.Throwable -> L8b8
            java.lang.reflect.Constructor r6 = r8.getDeclaredConstructor(r6)     // Catch: java.lang.Throwable -> L8b8
            java.lang.Object r6 = r6.newInstance(r9)     // Catch: java.lang.Throwable -> L8b8
            r27 = r3
            r9 = r6
            r6 = r51
            r8 = r52
            goto L99b
        L8b8:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L77f
            if (r3 == 0) goto L8c0
            throw r3     // Catch: java.lang.Throwable -> L77f
        L8c0:
            throw r0     // Catch: java.lang.Throwable -> L77f
        L8c1:
            if (r50 != 0) goto L909
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L900
            r43 = 1
            r9[r43] = r6     // Catch: java.lang.Throwable -> L900
            r9[r32] = r0     // Catch: java.lang.Throwable -> L900
            byte[] r6 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L900
            r8 = r6[r41]     // Catch: java.lang.Throwable -> L900
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L900
            r10 = r6[r38]     // Catch: java.lang.Throwable -> L900
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L900
            java.lang.String r8 = $$c(r8, r10, r15)     // Catch: java.lang.Throwable -> L900
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L900
            r10 = r6[r41]     // Catch: java.lang.Throwable -> L900
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L900
            r6 = r6[r38]     // Catch: java.lang.Throwable -> L900
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L900
            java.lang.String r6 = $$c(r10, r6, r15)     // Catch: java.lang.Throwable -> L900
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L900
            java.lang.Class[] r6 = new java.lang.Class[]{r6, r4}     // Catch: java.lang.Throwable -> L900
            java.lang.reflect.Constructor r6 = r8.getDeclaredConstructor(r6)     // Catch: java.lang.Throwable -> L900
            java.lang.Object r6 = r6.newInstance(r9)     // Catch: java.lang.Throwable -> L900
            r27 = r3
            r50 = r6
            r6 = r51
        L8fc:
            r8 = r52
            goto L84e
        L900:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L77f
            if (r3 == 0) goto L908
            throw r3     // Catch: java.lang.Throwable -> L77f
        L908:
            throw r0     // Catch: java.lang.Throwable -> L77f
        L909:
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> La1b
            r43 = 1
            r9[r43] = r6     // Catch: java.lang.Throwable -> La1b
            r9[r32] = r0     // Catch: java.lang.Throwable -> La1b
            byte[] r6 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> La1b
            r8 = r6[r41]     // Catch: java.lang.Throwable -> La1b
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> La1b
            r10 = r6[r38]     // Catch: java.lang.Throwable -> La1b
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> La1b
            java.lang.String r8 = $$c(r8, r10, r15)     // Catch: java.lang.Throwable -> La1b
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> La1b
            r10 = r6[r41]     // Catch: java.lang.Throwable -> La1b
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> La1b
            r11 = r6[r38]     // Catch: java.lang.Throwable -> La1b
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> La1b
            java.lang.String r10 = $$c(r10, r11, r15)     // Catch: java.lang.Throwable -> La1b
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> La1b
            java.lang.Class[] r10 = new java.lang.Class[]{r10, r4}     // Catch: java.lang.Throwable -> La1b
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r10)     // Catch: java.lang.Throwable -> La1b
            java.lang.Object r8 = r8.newInstance(r9)     // Catch: java.lang.Throwable -> La1b
            java.lang.Object[] r9 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L9ae
            r10 = r6[r41]     // Catch: java.lang.Throwable -> L9ae
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L9ae
            r11 = r6[r22]     // Catch: java.lang.Throwable -> L9ae
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L9ae
            r27 = r3
            r3 = 325(0x145, float:4.55E-43)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L9ae
            java.lang.String r10 = $$c(r10, r11, r3)     // Catch: java.lang.Throwable -> L9ae
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L9ae
            r11 = r6[r41]     // Catch: java.lang.Throwable -> L9ae
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L9ae
            r51 = r6
            r6 = r51[r38]     // Catch: java.lang.Throwable -> L9ae
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L9ae
            java.lang.String r6 = $$c(r11, r6, r15)     // Catch: java.lang.Throwable -> L9ae
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L9ae
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch: java.lang.Throwable -> L9ae
            java.lang.reflect.Constructor r6 = r10.getDeclaredConstructor(r6)     // Catch: java.lang.Throwable -> L9ae
            java.lang.Object r6 = r6.newInstance(r9)     // Catch: java.lang.Throwable -> L9ae
            r9 = r51[r41]     // Catch: java.lang.Throwable -> L9a3
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L9a3
            r10 = r51[r22]     // Catch: java.lang.Throwable -> L9a3
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L9a3
            java.lang.String r3 = $$c(r9, r10, r3)     // Catch: java.lang.Throwable -> L9a3
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L9a3
            r9 = r51[r25]     // Catch: java.lang.Throwable -> L9a3
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L9a3
            r10 = r51[r42]     // Catch: java.lang.Throwable -> L9a3
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L9a3
            r11 = r10 ^ 344(0x158, float:4.82E-43)
            r51 = r11
            r11 = r10 & 344(0x158, float:4.82E-43)
            r11 = r51 | r11
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L9a3
            java.lang.String r9 = $$c(r9, r10, r11)     // Catch: java.lang.Throwable -> L9a3
            r10 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r9, r10)     // Catch: java.lang.Throwable -> L9a3
            r3.invoke(r6, r10)     // Catch: java.lang.Throwable -> L9a3
            r6 = r8
            goto L8fc
        L99b:
            r3 = r27
            r11 = r55
            r46 = 26
            goto L648
        L9a3:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L77f java.lang.Exception -> L9ab
            if (r3 == 0) goto L9ad
            throw r3     // Catch: java.lang.Throwable -> L77f java.lang.Exception -> L9ab
        L9ab:
            r0 = move-exception
            goto L9b7
        L9ad:
            throw r0     // Catch: java.lang.Throwable -> L77f java.lang.Exception -> L9ab
        L9ae:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L77f java.lang.Exception -> L9ab
            if (r3 == 0) goto L9b6
            throw r3     // Catch: java.lang.Throwable -> L77f java.lang.Exception -> L9ab
        L9b6:
            throw r0     // Catch: java.lang.Throwable -> L77f java.lang.Exception -> L9ab
        L9b7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77f
            r3.<init>()     // Catch: java.lang.Throwable -> L77f
            byte[] r6 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L77f
            r9 = r6[r21]     // Catch: java.lang.Throwable -> L77f
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L77f
            r10 = r6[r42]     // Catch: java.lang.Throwable -> L77f
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L77f
            r11 = 352(0x160, float:4.93E-43)
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L77f
            java.lang.String r9 = $$c(r9, r10, r11)     // Catch: java.lang.Throwable -> L77f
            r3.append(r9)     // Catch: java.lang.Throwable -> L77f
            r3.append(r8)     // Catch: java.lang.Throwable -> L77f
            r8 = r6[r16]     // Catch: java.lang.Throwable -> L77f
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L77f
            r46 = 26
            r9 = r6[r46]     // Catch: java.lang.Throwable -> L77f
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L77f
            r10 = 291(0x123, float:4.08E-43)
            r11 = r9 | 291(0x123, float:4.08E-43)
            short r10 = (short) r11     // Catch: java.lang.Throwable -> L77f
            java.lang.String r8 = $$c(r8, r9, r10)     // Catch: java.lang.Throwable -> L77f
            r3.append(r8)     // Catch: java.lang.Throwable -> L77f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L77f
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> La12
            r43 = 1
            r9[r43] = r0     // Catch: java.lang.Throwable -> La12
            r9[r32] = r3     // Catch: java.lang.Throwable -> La12
            r0 = r6[r41]     // Catch: java.lang.Throwable -> La12
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> La12
            r3 = r6[r18]     // Catch: java.lang.Throwable -> La12
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> La12
            r8 = 291(0x123, float:4.08E-43)
            short r6 = (short) r8     // Catch: java.lang.Throwable -> La12
            java.lang.String r0 = $$c(r0, r3, r6)     // Catch: java.lang.Throwable -> La12
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> La12
            java.lang.Class[] r3 = new java.lang.Class[]{r4, r2}     // Catch: java.lang.Throwable -> La12
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> La12
            java.lang.Object r0 = r0.newInstance(r9)     // Catch: java.lang.Throwable -> La12
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> La12
            throw r0     // Catch: java.lang.Throwable -> La12
        La12:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L77f
            if (r3 == 0) goto La1a
            throw r3     // Catch: java.lang.Throwable -> L77f
        La1a:
            throw r0     // Catch: java.lang.Throwable -> L77f
        La1b:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L77f
            if (r3 == 0) goto La23
            throw r3     // Catch: java.lang.Throwable -> L77f
        La23:
            throw r0     // Catch: java.lang.Throwable -> L77f
        La24:
            r55 = r11
            r37 = 0
            throw r37     // Catch: java.lang.Throwable -> L77f
        La29:
            r51 = r6
            r52 = r8
            r53 = r9
        La2f:
            r55 = r11
            goto La52
        La32:
            r0 = move-exception
        La33:
            r55 = r11
            goto La3a
        La36:
            r0 = move-exception
            r48 = r10
            goto La33
        La3a:
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L77f
            if (r3 == 0) goto La41
            throw r3     // Catch: java.lang.Throwable -> L77f
        La41:
            throw r0     // Catch: java.lang.Throwable -> L77f
        La42:
            r0 = move-exception
            r48 = r10
            goto L7a6
        La47:
            r48 = r10
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            goto La2f
        La52:
            byte[] r0 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L1ad2
            r3 = 734(0x2de, float:1.029E-42)
            r3 = r0[r3]     // Catch: java.lang.Throwable -> L1ad2
            int r3 = -r3
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1ad2
            r6 = 52
            r6 = r0[r6]     // Catch: java.lang.Throwable -> L1ad2
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1ad2
            r8 = r41
            short r9 = (short) r8     // Catch: java.lang.Throwable -> L1ad2
            java.lang.String r3 = $$c(r3, r6, r9)     // Catch: java.lang.Throwable -> L1ad2
            java.lang.Object[] r6 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L1b2d
            r8 = r0[r30]     // Catch: java.lang.Throwable -> L1b2d
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1b2d
            r9 = r0[r31]     // Catch: java.lang.Throwable -> L1b2d
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1b2d
            r10 = 404(0x194, float:5.66E-43)
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L1b2d
            java.lang.String r8 = $$c(r8, r9, r10)     // Catch: java.lang.Throwable -> L1b2d
            java.lang.Class[] r9 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L1b2d
            java.lang.reflect.Method r8 = r7.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L1b2d
            java.lang.Object r6 = r8.invoke(r1, r6)     // Catch: java.lang.Throwable -> L1b2d
            r41 = 356(0x164, float:4.99E-43)
            r8 = r0[r41]     // Catch: java.lang.Throwable -> L1b0f
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1b0f
            r9 = r0[r38]     // Catch: java.lang.Throwable -> L1b0f
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1b0f
            r10 = 414(0x19e, float:5.8E-43)
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L1b0f
            java.lang.String r8 = $$c(r8, r9, r10)     // Catch: java.lang.Throwable -> L1b0f
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L1b0f
            r9 = r0[r30]     // Catch: java.lang.Throwable -> L1b0f
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1b0f
            r10 = r0[r17]     // Catch: java.lang.Throwable -> L1b0f
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1b0f
            r11 = 425(0x1a9, float:5.96E-43)
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L1b0f
            java.lang.String r9 = $$c(r9, r10, r11)     // Catch: java.lang.Throwable -> L1b0f
            r10 = 0
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch: java.lang.Throwable -> L1b0f
            java.lang.Object r6 = r8.invoke(r6, r10)     // Catch: java.lang.Throwable -> L1b0f
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L1b0f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ad2
            r8.<init>()     // Catch: java.lang.Throwable -> L1ad2
            r9 = 86
            byte r9 = (byte) r9
            r46 = 26
            r10 = r0[r46]     // Catch: java.lang.Throwable -> L1afc
            byte r10 = (byte) r10
            r11 = r10 ^ 431(0x1af, float:6.04E-43)
            r27 = r11
            r11 = r10 & 431(0x1af, float:6.04E-43)
            r11 = r27 | r11
            short r11 = (short) r11
            java.lang.String r9 = $$c(r9, r10, r11)     // Catch: java.lang.Throwable -> L1ad2
            r8.append(r9)     // Catch: java.lang.Throwable -> L1ad2
            r8.append(r3)     // Catch: java.lang.Throwable -> L1ad2
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L1ad2
            int r8 = r6.lastIndexOf(r8)     // Catch: java.lang.Throwable -> L1ad2
            r9 = 5
            java.lang.String r6 = r6.substring(r9, r8)     // Catch: java.lang.Throwable -> L1ae9
            java.util.zip.ZipFile r8 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L1ad2
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L1ad2
            r6 = 7936(0x1f00, float:1.1121E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L1ab6
            r9 = 1
            java.lang.String r3 = r3.substring(r9)     // Catch: java.lang.Throwable -> L1ab6
            java.util.zip.ZipEntry r3 = r8.getEntry(r3)     // Catch: java.lang.Throwable -> L1ab6
            java.io.InputStream r3 = r8.getInputStream(r3)     // Catch: java.lang.Throwable -> L1ab6
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L1a98
            r41 = 356(0x164, float:4.99E-43)
            r9 = r0[r41]     // Catch: java.lang.Throwable -> L1a98
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1a98
            r10 = 451(0x1c3, float:6.32E-43)
            r10 = r0[r10]     // Catch: java.lang.Throwable -> L1a98
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1a98
            int r11 = com.appsflyer.internal.AFa1hSDK.$$b     // Catch: java.lang.Throwable -> L1a98
            r27 = r6
            r6 = r11 ^ 257(0x101, float:3.6E-43)
            r11 = r11 & 257(0x101, float:3.6E-43)
            r6 = r6 | r11
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L1a98
            java.lang.String r6 = $$c(r9, r10, r6)     // Catch: java.lang.Throwable -> L1a98
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L1a98
            r41 = 356(0x164, float:4.99E-43)
            r9 = r0[r41]     // Catch: java.lang.Throwable -> L1a98
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1a98
            r10 = r0[r18]     // Catch: java.lang.Throwable -> L1a98
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1a98
            r11 = 457(0x1c9, float:6.4E-43)
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L1a98
            java.lang.String r9 = $$c(r9, r10, r11)     // Catch: java.lang.Throwable -> L1a98
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L1a98
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L1a98
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r9)     // Catch: java.lang.Throwable -> L1a98
            java.lang.Object r3 = r6.newInstance(r3)     // Catch: java.lang.Throwable -> L1a98
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L1a85
            r41 = 356(0x164, float:4.99E-43)
            r6 = r0[r41]     // Catch: java.lang.Throwable -> L1a85
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1a85
            r9 = r0[r20]     // Catch: java.lang.Throwable -> L1a85
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1a85
            r10 = 475(0x1db, float:6.66E-43)
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L1a85
            java.lang.String r6 = $$c(r6, r9, r10)     // Catch: java.lang.Throwable -> L1a85
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L1a85
            r41 = 356(0x164, float:4.99E-43)
            r9 = r0[r41]     // Catch: java.lang.Throwable -> L1a85
            byte r9 = (byte) r9
            r44 = r13
            r13 = r0[r18]     // Catch: java.lang.Throwable -> L1a70
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1a70
            java.lang.String r9 = $$c(r9, r13, r11)     // Catch: java.lang.Throwable -> L1a70
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L1a70
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L1a70
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r9)     // Catch: java.lang.Throwable -> L1a70
            java.lang.Object r3 = r6.newInstance(r3)     // Catch: java.lang.Throwable -> L1a70
            java.lang.Object[] r6 = new java.lang.Object[]{r27}     // Catch: java.lang.Throwable -> L1a5d
            r41 = 356(0x164, float:4.99E-43)
            r9 = r0[r41]     // Catch: java.lang.Throwable -> L1a5d
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1a5d
            r11 = r0[r20]     // Catch: java.lang.Throwable -> L1a5d
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1a5d
            java.lang.String r9 = $$c(r9, r11, r10)     // Catch: java.lang.Throwable -> L1a5d
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L1a5d
            r11 = r0[r23]     // Catch: java.lang.Throwable -> L1a5d
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1a5d
            r13 = 198(0xc6, float:2.77E-43)
            r13 = r0[r13]     // Catch: java.lang.Throwable -> L1a5d
            byte r13 = (byte) r13
            r54 = r14
            r14 = 497(0x1f1, float:6.96E-43)
            short r14 = (short) r14
            java.lang.String r11 = $$c(r11, r13, r14)     // Catch: java.lang.Throwable -> L1a4a
            java.lang.Class[] r13 = new java.lang.Class[]{r5}     // Catch: java.lang.Throwable -> L1a4a
            java.lang.reflect.Method r9 = r9.getMethod(r11, r13)     // Catch: java.lang.Throwable -> L1a4a
            r9.invoke(r3, r6)     // Catch: java.lang.Throwable -> L1a4a
            r41 = 356(0x164, float:4.99E-43)
            r6 = r0[r41]     // Catch: java.lang.Throwable -> L1a30
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1a30
            r9 = r0[r20]     // Catch: java.lang.Throwable -> L1a30
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1a30
            java.lang.String r6 = $$c(r6, r9, r10)     // Catch: java.lang.Throwable -> L1a30
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L1a30
            r9 = r0[r25]     // Catch: java.lang.Throwable -> L1a30
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1a30
            r0 = r0[r42]     // Catch: java.lang.Throwable -> L1a30
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1a30
            r10 = r0 ^ 344(0x158, float:4.82E-43)
            r11 = r0 & 344(0x158, float:4.82E-43)
            r10 = r10 | r11
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L1a30
            java.lang.String r0 = $$c(r9, r0, r10)     // Catch: java.lang.Throwable -> L1a30
            r10 = 0
            java.lang.reflect.Method r0 = r6.getMethod(r0, r10)     // Catch: java.lang.Throwable -> L1a30
            r0.invoke(r3, r10)     // Catch: java.lang.Throwable -> L1a30
            r0 = 7896(0x1ed8, float:1.1065E-41)
            r6 = r27
            r11 = r36
            r3 = 0
            r9 = 16
        Lbc6:
            r10 = 1
            long r13 = (long) r10
            int r10 = r6.length     // Catch: java.lang.Throwable -> L19fb
            r57 = r13
            r13 = r32
        Lbcd:
            if (r13 >= r10) goto Lbfa
            r14 = r6[r13]     // Catch: java.lang.Throwable -> Lbe7
            r27 = r13
            long r13 = (long) r14
            long r59 = r57 << r28
            long r13 = r13 + r59
            r56 = 16
            long r59 = r57 << r56
            r56 = r10
            long r13 = r13 + r59
            long r57 = r13 - r57
            r43 = 1
            int r13 = r27 + 1
            goto Lbcd
        Lbe7:
            r0 = move-exception
            r3 = r2
            r2 = r1
            r1 = r3
            r3 = r0
            r64 = r5
            r62 = r15
            r39 = 3
            r40 = 5
            r46 = 26
            r56 = 16
            goto L1ac4
        Lbfa:
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19fb
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L19fb
            int r14 = r9 * (-657)
            r27 = 106758(0x1a106, float:1.496E-40)
            int r27 = r27 + r14
            r14 = -163(0xffffffffffffff5d, float:NaN)
            r56 = r14 ^ r9
            r14 = r14 & r9
            r14 = r56 | r14
            int r14 = ~r14     // Catch: java.lang.Throwable -> L19fb
            int r10 = ~r9     // Catch: java.lang.Throwable -> L19fb
            r59 = r14
            r14 = r10 ^ 162(0xa2, float:2.27E-43)
            r60 = r14
            r14 = r10 & 162(0xa2, float:2.27E-43)
            r14 = r60 | r14
            int r14 = ~r14     // Catch: java.lang.Throwable -> L19fb
            r60 = r59 ^ r14
            r14 = r59 & r14
            r14 = r60 | r14
            r59 = r14
            r14 = r13 ^ 162(0xa2, float:2.27E-43)
            r60 = r14
            r14 = r13 & 162(0xa2, float:2.27E-43)
            r14 = r60 | r14
            int r14 = ~r14     // Catch: java.lang.Throwable -> L19fb
            r60 = r59 ^ r14
            r14 = r59 & r14
            r14 = r60 | r14
            int r14 = r14 * (-658)
            int r14 = -r14
            int r14 = -r14
            r59 = r27 ^ r14
            r14 = r27 & r14
            r43 = 1
            int r14 = r14 << 1
            int r59 = r59 + r14
            r14 = r10 ^ 162(0xa2, float:2.27E-43)
            r10 = r10 & 162(0xa2, float:2.27E-43)
            r10 = r10 | r14
            int r14 = ~r10     // Catch: java.lang.Throwable -> L19fb
            int r14 = r14 * 658
            r27 = r59 ^ r14
            r14 = r59 & r14
            int r14 = r14 << 1
            int r27 = r27 + r14
            int r10 = ~r10     // Catch: java.lang.Throwable -> L19fb
            r13 = r13 | 162(0xa2, float:2.27E-43)
            int r13 = ~r13     // Catch: java.lang.Throwable -> L19fb
            r14 = r10 ^ r13
            r10 = r10 & r13
            r10 = r10 | r14
            int r10 = r10 * 658
            r13 = r27 & r10
            r10 = r27 | r10
            int r13 = r13 + r10
            int r10 = r9 + 7919
            r10 = r6[r10]     // Catch: java.lang.Throwable -> L19fb
            r14 = r10 | (-9)
            r43 = 1
            int r14 = r14 << 1
            r10 = r10 ^ (-9)
            int r14 = r14 - r10
            byte r10 = (byte) r14     // Catch: java.lang.Throwable -> L19fb
            r6[r13] = r10     // Catch: java.lang.Throwable -> L19fb
            int r10 = r6.length     // Catch: java.lang.Throwable -> L19fb
            int r13 = -r9
            r14 = r10 ^ r13
            r10 = r10 & r13
            r43 = 1
            int r10 = r10 << 1
            int r14 = r14 + r10
            r10 = 3
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L1a1b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L1a08
            r35 = 2
            r13[r35] = r10     // Catch: java.lang.Throwable -> L1a08
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L1a08
            r13[r43] = r10     // Catch: java.lang.Throwable -> L1a08
            r13[r32] = r6     // Catch: java.lang.Throwable -> L1a08
            byte[] r6 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L1a08
            r41 = 356(0x164, float:4.99E-43)
            r10 = r6[r41]     // Catch: java.lang.Throwable -> L1a08
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1a08
            r14 = 959(0x3bf, float:1.344E-42)
            r14 = r6[r14]     // Catch: java.lang.Throwable -> L1a08
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1a08
            r27 = r6
            r6 = 505(0x1f9, float:7.08E-43)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L1a08
            java.lang.String r6 = $$c(r10, r14, r6)     // Catch: java.lang.Throwable -> L1a08
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L1a08
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1a08
            java.lang.Class[] r14 = new java.lang.Class[]{r5, r10, r10}     // Catch: java.lang.Throwable -> L1a08
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r14)     // Catch: java.lang.Throwable -> L1a08
            java.lang.Object r6 = r6.newInstance(r13)     // Catch: java.lang.Throwable -> L1a08
            java.lang.Object r13 = com.appsflyer.internal.AFa1hSDK.f6282d     // Catch: java.lang.Throwable -> L19fb
            if (r13 != 0) goto Ldc5
            int r13 = com.appsflyer.internal.AFa1hSDK.$10
            r14 = r13 | 77
            r43 = 1
            int r14 = r14 << 1
            r13 = r13 ^ 77
            int r14 = r14 - r13
            int r14 = r14 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r14
            com.appsflyer.internal.AFa1hSDK.afDebugLog = r57     // Catch: java.lang.Throwable -> Lbe7
            long r13 = android.os.Process.getElapsedCpuTime()     // Catch: java.lang.Throwable -> Lbe7
            long r13 = r13 >> r19
            r59 = 4475636157570058436(0x3e1ca75f53db88c4, double:1.6678705772653194E-9)
            long r13 = r13 + r59
            long r13 = r57 ^ r13
            int r13 = (int) r13     // Catch: java.lang.Throwable -> Lbe7
            long r57 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> Lbe7
            r59 = 0
            int r14 = (r57 > r59 ? 1 : (r57 == r59 ? 0 : -1))
            int r14 = r14 + 6
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> Lbe7
            long r57 = com.appsflyer.internal.AFa1hSDK.afDebugLog     // Catch: java.lang.Throwable -> Lbe7
            long r59 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()     // Catch: java.lang.Throwable -> Lbe7
            r61 = 32
            long r59 = r59 >> r61
            r61 = 4475636156806528145(0x3e1ca75f2658fc91, double:1.667870419370956E-9)
            long r61 = r61 - r59
            r65 = r9
            r59 = r10
            long r9 = r57 ^ r61
            int r9 = (int) r9     // Catch: java.lang.Throwable -> Lbe7
            int[] r9 = new int[r9]     // Catch: java.lang.Throwable -> Lbe7
            int r10 = android.graphics.Color.blue(r32)     // Catch: java.lang.Throwable -> Lbe7
            long r57 = com.appsflyer.internal.AFa1hSDK.afInfoLog     // Catch: java.lang.Throwable -> Lbe7
            long r60 = com.appsflyer.internal.AFa1hSDK.afDebugLog     // Catch: java.lang.Throwable -> Lbe7
            long r62 = android.os.Process.getElapsedCpuTime()     // Catch: java.lang.Throwable -> Lbe7
            long r62 = r62 >> r19
            r66 = 4475636156806528179(0x3e1ca75f2658fcb3, double:1.667870419370963E-9)
            long r66 = r66 - r62
            r62 = r9
            r63 = r10
            long r9 = r60 ^ r66
            int r9 = (int) r9     // Catch: java.lang.Throwable -> Lbe7
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> Lbe7
            long r9 = r57 >>> r9
            int r9 = (int) r9     // Catch: java.lang.Throwable -> Lbe7
            r10 = r9 & r13
            int r10 = ~r10     // Catch: java.lang.Throwable -> Lbe7
            r9 = r9 | r13
            r9 = r9 & r10
            r62[r63] = r9     // Catch: java.lang.Throwable -> Lbe7
            long r9 = com.appsflyer.internal.AFa1hSDK.afDebugLog     // Catch: java.lang.Throwable -> Lbe7
            long r57 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lbe7
            long r57 = r57 >> r19
            r60 = 4475636156806528146(0x3e1ca75f2658fc92, double:1.6678704193709562E-9)
            long r57 = r57 + r60
            long r9 = r9 ^ r57
            int r9 = (int) r9     // Catch: java.lang.Throwable -> Lbe7
            r57 = r9
            long r9 = com.appsflyer.internal.AFa1hSDK.afInfoLog     // Catch: java.lang.Throwable -> Lbe7
            int r9 = (int) r9     // Catch: java.lang.Throwable -> Lbe7
            int r10 = ~r13     // Catch: java.lang.Throwable -> Lbe7
            r10 = r10 & r9
            int r9 = ~r9     // Catch: java.lang.Throwable -> Lbe7
            r9 = r9 & r13
            r9 = r9 | r10
            r62[r57] = r9     // Catch: java.lang.Throwable -> Lbe7
            int r9 = com.appsflyer.internal.AFa1hSDK.afLogForce     // Catch: java.lang.Throwable -> Lbe7
            byte[] r10 = com.appsflyer.internal.AFa1hSDK.afErrorLogForExcManagerOnly     // Catch: java.lang.Throwable -> Lbe7
            int r13 = com.appsflyer.internal.AFa1hSDK.afWarnLog     // Catch: java.lang.Throwable -> Lbe7
            r60 = r6
            r6 = r28
            r28 = r9
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Ldbc
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> Ldbc
            r40 = 5
            r9[r40] = r13     // Catch: java.lang.Throwable -> Ldbc
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> Ldbc
            r9[r26] = r13     // Catch: java.lang.Throwable -> Ldbc
            r39 = 3
            r9[r39] = r10     // Catch: java.lang.Throwable -> Ldbc
            java.lang.Integer r10 = java.lang.Integer.valueOf(r28)     // Catch: java.lang.Throwable -> Ldbc
            r35 = 2
            r9[r35] = r10     // Catch: java.lang.Throwable -> Ldbc
            r43 = 1
            r9[r43] = r62     // Catch: java.lang.Throwable -> Ldbc
            r9[r32] = r60     // Catch: java.lang.Throwable -> Ldbc
            r10 = r27[r25]     // Catch: java.lang.Throwable -> Ldbc
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> Ldbc
            r13 = 488(0x1e8, float:6.84E-43)
            r13 = r27[r13]     // Catch: java.lang.Throwable -> Ldbc
            int r13 = -r13
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> Ldbc
            r14 = 532(0x214, float:7.45E-43)
            short r14 = (short) r14     // Catch: java.lang.Throwable -> Ldbc
            java.lang.String r10 = $$c(r10, r13, r14)     // Catch: java.lang.Throwable -> Ldbc
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> Ldbc
            r41 = 356(0x164, float:4.99E-43)
            r13 = r27[r41]     // Catch: java.lang.Throwable -> Ldbc
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> Ldbc
            r14 = r27[r18]     // Catch: java.lang.Throwable -> Ldbc
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> Ldbc
            r6 = 457(0x1c9, float:6.4E-43)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> Ldbc
            java.lang.String r6 = $$c(r13, r14, r6)     // Catch: java.lang.Throwable -> Ldbc
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> Ldbc
            java.lang.Class<int[]> r60 = int[].class
            java.lang.Class<byte[]> r62 = byte[].class
            r63 = r59
            r64 = r59
            r61 = r59
            r59 = r6
            java.lang.Class[] r6 = new java.lang.Class[]{r59, r60, r61, r62, r63, r64}     // Catch: java.lang.Throwable -> Ldbc
            r14 = r61
            java.lang.reflect.Constructor r6 = r10.getDeclaredConstructor(r6)     // Catch: java.lang.Throwable -> Ldbc
            java.lang.Object r6 = r6.newInstance(r9)     // Catch: java.lang.Throwable -> Ldbc
            r26 = r3
            r58 = r8
            r59 = r12
            r39 = 3
        Ldb8:
            r41 = 356(0x164, float:4.99E-43)
            goto Le7f
        Ldbc:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> Lbe7
            if (r3 == 0) goto Ldc4
            throw r3     // Catch: java.lang.Throwable -> Lbe7
        Ldc4:
            throw r0     // Catch: java.lang.Throwable -> Lbe7
        Ldc5:
            r60 = r6
            r65 = r9
            r14 = r10
            com.appsflyer.internal.AFa1hSDK.f6285v = r57     // Catch: java.lang.Throwable -> L19fb
            long r9 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch: java.lang.Throwable -> L19fb
            r6 = 32
            long r9 = r9 >> r6
            r61 = -1019492535543493491(0xf1da08f0bfc48c8d, double:-2.7125194675178367E240)
            long r61 = r61 - r9
            long r9 = r57 ^ r61
            int r6 = (int) r9     // Catch: java.lang.Throwable -> L19fb
            long r9 = com.appsflyer.internal.AFa1hSDK.f6285v     // Catch: java.lang.Throwable -> L19fb
            long r57 = android.os.Process.getElapsedCpuTime()     // Catch: java.lang.Throwable -> L19fb
            long r57 = r57 >> r19
            r61 = 1019492535602842750(0xe25f70f43c50c7e, double:1.6470477750405544E-240)
            long r61 = r61 - r57
            long r9 = r9 ^ r61
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L19fb
            long r57 = com.appsflyer.internal.AFa1hSDK.f6285v     // Catch: java.lang.Throwable -> L19fb
            long r61 = android.os.Process.getElapsedCpuTime()     // Catch: java.lang.Throwable -> L19fb
            long r61 = r61 >> r19
            r63 = -1019492535644021012(0xf1da08f0b9c69eec, double:-2.7125194303076595E240)
            long r61 = r61 + r63
            r59 = r9
            long r9 = r57 ^ r61
            int r9 = (int) r9
            int r10 = com.appsflyer.internal.AFa1hSDK.$10
            int r10 = r10 + 49
            int r10 = r10 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r10
            r10 = r26
            r26 = r6
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L19e6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L19e6
            r39 = 3
            r6[r39] = r9     // Catch: java.lang.Throwable -> L19db
            java.lang.Integer r9 = java.lang.Integer.valueOf(r59)     // Catch: java.lang.Throwable -> L19db
            r35 = 2
            r6[r35] = r9     // Catch: java.lang.Throwable -> L19db
            java.lang.Short r9 = java.lang.Short.valueOf(r26)     // Catch: java.lang.Throwable -> L19db
            r43 = 1
            r6[r43] = r9     // Catch: java.lang.Throwable -> L19db
            r6[r32] = r60     // Catch: java.lang.Throwable -> L19db
            r9 = r27[r25]     // Catch: java.lang.Throwable -> L19db
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L19db
            r26 = 175(0xaf, float:2.45E-43)
            r10 = r27[r26]     // Catch: java.lang.Throwable -> L19db
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L19db
            r26 = r3
            r3 = r10 ^ 530(0x212, float:7.43E-43)
            r58 = r3
            r3 = r10 & 530(0x212, float:7.43E-43)
            r3 = r58 | r3
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L19db
            java.lang.String r3 = $$c(r9, r10, r3)     // Catch: java.lang.Throwable -> L19db
            java.lang.Object r9 = com.appsflyer.internal.AFa1hSDK.f6286w     // Catch: java.lang.Throwable -> L19db
            java.lang.ClassLoader r9 = (java.lang.ClassLoader) r9     // Catch: java.lang.Throwable -> L19db
            r10 = 1
            java.lang.Class r3 = java.lang.Class.forName(r3, r10, r9)     // Catch: java.lang.Throwable -> L19db
            r9 = r27[r30]     // Catch: java.lang.Throwable -> L19db
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L19db
            r10 = r27[r24]     // Catch: java.lang.Throwable -> L19db
            byte r10 = (byte) r10
            r58 = r8
            r8 = 594(0x252, float:8.32E-43)
            short r8 = (short) r8
            java.lang.String r8 = $$c(r9, r10, r8)     // Catch: java.lang.Throwable -> L19ca
            r41 = 356(0x164, float:4.99E-43)
            r9 = r27[r41]     // Catch: java.lang.Throwable -> L19ca
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L19ca
            r10 = r27[r18]     // Catch: java.lang.Throwable -> L19ca
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L19ca
            r59 = r12
            r12 = 457(0x1c9, float:6.4E-43)
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L19ca
            java.lang.String r9 = $$c(r9, r10, r12)     // Catch: java.lang.Throwable -> L19ca
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L19ca
            java.lang.Class r10 = java.lang.Short.TYPE     // Catch: java.lang.Throwable -> L19ca
            java.lang.Class[] r9 = new java.lang.Class[]{r9, r10, r14, r14}     // Catch: java.lang.Throwable -> L19ca
            java.lang.reflect.Method r3 = r3.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L19ca
            java.lang.Object r6 = r3.invoke(r13, r6)     // Catch: java.lang.Throwable -> L19ca
            goto Ldb8
        Le7f:
            r3 = r27[r41]     // Catch: java.lang.Throwable -> L19b8
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L19b8
            r8 = r27[r18]     // Catch: java.lang.Throwable -> L19b8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L19b8
            r9 = 457(0x1c9, float:6.4E-43)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L19b8
            java.lang.String r3 = $$c(r3, r8, r9)     // Catch: java.lang.Throwable -> L19b8
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L19b8
            r8 = r27[r42]     // Catch: java.lang.Throwable -> L19b8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L19b8
            r10 = r27[r34]     // Catch: java.lang.Throwable -> L19b8
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L19b8
            r12 = r10 ^ 612(0x264, float:8.58E-43)
            r13 = r10 & 612(0x264, float:8.58E-43)
            r12 = r12 | r13
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L19b8
            java.lang.String r8 = $$c(r8, r10, r12)     // Catch: java.lang.Throwable -> L19b8
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L19b8
            java.lang.Class[] r10 = new java.lang.Class[]{r10}     // Catch: java.lang.Throwable -> L19b8
            java.lang.reflect.Method r3 = r3.getMethod(r8, r10)     // Catch: java.lang.Throwable -> L19b8
            r56 = 16
            java.lang.Integer r8 = java.lang.Integer.valueOf(r56)     // Catch: java.lang.Throwable -> L19b3
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L19b3
            r3.invoke(r6, r8)     // Catch: java.lang.Throwable -> L19b3
            if (r59 == 0) goto L129f
            int r8 = com.appsflyer.internal.AFa1hSDK.$10
            int r8 = r8 + 35
            int r8 = r8 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r8
            java.lang.Object r8 = com.appsflyer.internal.AFa1hSDK.f6282d     // Catch: java.lang.Throwable -> L1298
            if (r8 != 0) goto Lec8
            r10 = r52
            goto Leca
        Lec8:
            r10 = r53
        Leca:
            if (r8 != 0) goto Led1
            r8 = r50
        Lece:
            r41 = 356(0x164, float:4.99E-43)
            goto Led4
        Led1:
            r8 = r51
            goto Lece
        Led4:
            r12 = r27[r41]     // Catch: java.lang.Throwable -> L1298
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1298
            r13 = r27[r18]     // Catch: java.lang.Throwable -> L1298
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1298
            java.lang.String r12 = $$c(r12, r13, r9)     // Catch: java.lang.Throwable -> L1298
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L1298
            r13 = r27[r23]     // Catch: java.lang.Throwable -> L1298
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1298
            r60 = 37
            r3 = r27[r34]     // Catch: java.lang.Throwable -> L1298
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1298
            r61 = r11
            r11 = 618(0x26a, float:8.66E-43)
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L1298
            java.lang.String r3 = $$c(r13, r3, r11)     // Catch: java.lang.Throwable -> L1298
            java.lang.Class[] r11 = new java.lang.Class[]{r5, r14, r14}     // Catch: java.lang.Throwable -> L1298
            java.lang.reflect.Method r3 = r12.getMethod(r3, r11)     // Catch: java.lang.Throwable -> L1298
            r41 = 356(0x164, float:4.99E-43)
            r11 = r27[r41]     // Catch: java.lang.Throwable -> L1298
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1298
            r12 = r27[r22]     // Catch: java.lang.Throwable -> L1298
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1298
            r13 = 325(0x145, float:4.55E-43)
            short r13 = (short) r13     // Catch: java.lang.Throwable -> L1298
            java.lang.String r11 = $$c(r11, r12, r13)     // Catch: java.lang.Throwable -> L1298
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L1298
            r41 = 356(0x164, float:4.99E-43)
            r12 = r27[r41]     // Catch: java.lang.Throwable -> L11a6 java.lang.Exception -> L11ab
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L11a6 java.lang.Exception -> L11ab
            r13 = r27[r38]     // Catch: java.lang.Throwable -> L11a6 java.lang.Exception -> L11ab
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L11a6 java.lang.Exception -> L11ab
            java.lang.String r12 = $$c(r12, r13, r15)     // Catch: java.lang.Throwable -> L11a6 java.lang.Exception -> L11ab
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L11a6 java.lang.Exception -> L11ab
            java.lang.Class[] r12 = new java.lang.Class[]{r12}     // Catch: java.lang.Throwable -> L11a6 java.lang.Exception -> L11ab
            java.lang.reflect.Constructor r12 = r11.getConstructor(r12)     // Catch: java.lang.Throwable -> L11a6 java.lang.Exception -> L11ab
            java.lang.Object[] r13 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L11a6 java.lang.Exception -> L11ab
            java.lang.Object r12 = r12.newInstance(r13)     // Catch: java.lang.Throwable -> L11a6 java.lang.Exception -> L11ab
            if (r45 == 0) goto Lf81
            r41 = 356(0x164, float:4.99E-43)
            r13 = r27[r41]     // Catch: java.lang.Throwable -> Lf68
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> Lf68
            r62 = r9
            r9 = r27[r38]     // Catch: java.lang.Throwable -> Lf68
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> Lf68
            java.lang.String r9 = $$c(r13, r9, r15)     // Catch: java.lang.Throwable -> Lf68
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> Lf68
            r13 = r27[r42]     // Catch: java.lang.Throwable -> Lf68
            byte r13 = (byte) r13
            r63 = r2
            r2 = r27[r31]     // Catch: java.lang.Throwable -> Lf64
            byte r2 = (byte) r2
            r64 = r1
            r1 = 621(0x26d, float:8.7E-43)
            short r1 = (short) r1
            java.lang.String r1 = $$c(r13, r2, r1)     // Catch: java.lang.Throwable -> Lf62
            r13 = 0
            java.lang.reflect.Method r1 = r9.getMethod(r1, r13)     // Catch: java.lang.Throwable -> Lf62
            java.lang.Object r1 = r1.invoke(r10, r13)     // Catch: java.lang.Throwable -> Lf62
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lf62
            r1.getClass()     // Catch: java.lang.Throwable -> Lf62
            goto Lf87
        Lf62:
            r0 = move-exception
            goto Lf6d
        Lf64:
            r0 = move-exception
            r64 = r1
            goto Lf6d
        Lf68:
            r0 = move-exception
            r64 = r1
            r63 = r2
        Lf6d:
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> Lf74 java.lang.Exception -> Lf7b
            if (r1 == 0) goto Lf80
            throw r1     // Catch: java.lang.Throwable -> Lf74 java.lang.Exception -> Lf7b
        Lf74:
            r0 = move-exception
            r1 = r63
            r2 = r64
            goto L1226
        Lf7b:
            r0 = move-exception
            r2 = r64
            goto L11af
        Lf80:
            throw r0     // Catch: java.lang.Throwable -> Lf74 java.lang.Exception -> Lf7b
        Lf81:
            r64 = r1
            r63 = r2
            r62 = r9
        Lf87:
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L1187
            r46 = 26
            r9 = r27[r46]     // Catch: java.lang.Throwable -> L1187
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1187
            r13 = r27[r42]     // Catch: java.lang.Throwable -> L1187
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1187
            r1 = 635(0x27b, float:8.9E-43)
            short r1 = (short) r1     // Catch: java.lang.Throwable -> L1187
            java.lang.String r1 = $$c(r9, r13, r1)     // Catch: java.lang.Throwable -> L1187
            java.lang.Class[] r9 = new java.lang.Class[]{r5, r14, r14}     // Catch: java.lang.Throwable -> L1187
            java.lang.reflect.Method r1 = r11.getMethod(r1, r9)     // Catch: java.lang.Throwable -> L1187
        Lfa2:
            if (r0 <= 0) goto Lfe2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r32)     // Catch: java.lang.Throwable -> Lf74
            r13 = 1024(0x400, float:1.435E-42)
            int r14 = java.lang.Math.min(r13, r0)     // Catch: java.lang.Throwable -> Lf74
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> Lf74
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r9, r14}     // Catch: java.lang.Throwable -> Lf74
            java.lang.Object r9 = r3.invoke(r6, r9)     // Catch: java.lang.Throwable -> Lf74
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> Lf74
            int r14 = r9.intValue()     // Catch: java.lang.Throwable -> Lf74
            r13 = -1
            if (r14 == r13) goto Lfe2
            int r13 = com.appsflyer.internal.AFa1hSDK.$10
            r33 = 7
            r27 = r13 & 7
            r13 = r13 | 7
            int r13 = r27 + r13
            int r13 = r13 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r32)     // Catch: java.lang.Throwable -> Lf74
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r13, r9}     // Catch: java.lang.Throwable -> Lf74
            r1.invoke(r12, r9)     // Catch: java.lang.Throwable -> Lf74
            int r9 = -r14
            r13 = r0 & r9
            r0 = r0 | r9
            int r0 = r0 + r13
            goto Lfa2
        Lfe2:
            byte[] r0 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L1187
            r1 = r0[r30]     // Catch: java.lang.Throwable -> L1187
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L1187
            r2 = r0[r42]     // Catch: java.lang.Throwable -> L1187
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1187
            r3 = r2 ^ 635(0x27b, float:8.9E-43)
            r6 = r2 & 635(0x27b, float:8.9E-43)
            r3 = r3 | r6
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L1187
            java.lang.String r1 = $$c(r1, r2, r3)     // Catch: java.lang.Throwable -> L1187
            r2 = r32
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1187
            java.lang.reflect.Method r1 = r11.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L1187
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1187
            java.lang.Object r1 = r1.invoke(r12, r3)     // Catch: java.lang.Throwable -> L1187
            r41 = 356(0x164, float:4.99E-43)
            r2 = r0[r41]     // Catch: java.lang.Throwable -> L1187
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1187
            r3 = r0[r24]     // Catch: java.lang.Throwable -> L1187
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1187
            r6 = 643(0x283, float:9.01E-43)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L1187
            java.lang.String r2 = $$c(r2, r3, r6)     // Catch: java.lang.Throwable -> L1187
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1187
            r3 = r0[r42]     // Catch: java.lang.Throwable -> L1187
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1187
            r6 = r0[r34]     // Catch: java.lang.Throwable -> L1187
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1187
            r9 = 664(0x298, float:9.3E-43)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L1187
            java.lang.String r3 = $$c(r3, r6, r9)     // Catch: java.lang.Throwable -> L1187
            r6 = 0
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L1187
            java.lang.reflect.Method r2 = r2.getMethod(r3, r9)     // Catch: java.lang.Throwable -> L1187
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1187
            r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L1187
            r1 = r0[r25]     // Catch: java.lang.Throwable -> L1187
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L1187
            r2 = r0[r42]     // Catch: java.lang.Throwable -> L1187
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1187
            r3 = r2 ^ 344(0x158, float:4.82E-43)
            r6 = r2 & 344(0x158, float:4.82E-43)
            r3 = r3 | r6
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L1187
            java.lang.String r1 = $$c(r1, r2, r3)     // Catch: java.lang.Throwable -> L1187
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1187
            java.lang.reflect.Method r1 = r11.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L1187
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1187
            r1.invoke(r12, r3)     // Catch: java.lang.Throwable -> L1187
            r1 = r0[r60]     // Catch: java.lang.Throwable -> L1187
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L1187
            r2 = r0[r25]     // Catch: java.lang.Throwable -> L1187
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1187
            r3 = 667(0x29b, float:9.35E-43)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L1187
            java.lang.String r1 = $$c(r1, r2, r3)     // Catch: java.lang.Throwable -> L1187
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1187
            r2 = r0[r38]     // Catch: java.lang.Throwable -> L1187
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1187
            r3 = r0[r17]     // Catch: java.lang.Throwable -> L1187
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1187
            r6 = r3 ^ 681(0x2a9, float:9.54E-43)
            r9 = r3 & 681(0x2a9, float:9.54E-43)
            r6 = r6 | r9
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L1187
            java.lang.String r2 = $$c(r2, r3, r6)     // Catch: java.lang.Throwable -> L1187
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1187
            java.lang.Class[] r3 = new java.lang.Class[]{r4, r4, r3}     // Catch: java.lang.Throwable -> L1187
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L1187
            r41 = 356(0x164, float:4.99E-43)
            r2 = r0[r41]     // Catch: java.lang.Throwable -> L119b
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L119b
            r3 = r0[r38]     // Catch: java.lang.Throwable -> L119b
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L119b
            java.lang.String r2 = $$c(r2, r3, r15)     // Catch: java.lang.Throwable -> L119b
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L119b
            r3 = r0[r30]     // Catch: java.lang.Throwable -> L119b
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L119b
            r6 = 43
            r6 = r0[r6]     // Catch: java.lang.Throwable -> L119b
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L119b
            r9 = 693(0x2b5, float:9.71E-43)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L119b
            java.lang.String r3 = $$c(r3, r6, r9)     // Catch: java.lang.Throwable -> L119b
            r13 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r3, r13)     // Catch: java.lang.Throwable -> L119b
            java.lang.Object r2 = r2.invoke(r10, r13)     // Catch: java.lang.Throwable -> L119b
            r41 = 356(0x164, float:4.99E-43)
            r3 = r0[r41]     // Catch: java.lang.Throwable -> L118e
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L118e
            r6 = r0[r38]     // Catch: java.lang.Throwable -> L118e
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L118e
            java.lang.String r3 = $$c(r3, r6, r15)     // Catch: java.lang.Throwable -> L118e
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L118e
            r6 = r0[r30]     // Catch: java.lang.Throwable -> L118e
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L118e
            r11 = 43
            r11 = r0[r11]     // Catch: java.lang.Throwable -> L118e
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L118e
            java.lang.String r6 = $$c(r6, r11, r9)     // Catch: java.lang.Throwable -> L118e
            r13 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r6, r13)     // Catch: java.lang.Throwable -> L118e
            java.lang.Object r3 = r3.invoke(r8, r13)     // Catch: java.lang.Throwable -> L118e
            r32 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r32)     // Catch: java.lang.Throwable -> L1187
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r6}     // Catch: java.lang.Throwable -> L1187
            java.lang.Object r1 = r1.invoke(r13, r2)     // Catch: java.lang.Throwable -> L1187
            r41 = 356(0x164, float:4.99E-43)
            r2 = r0[r41]     // Catch: java.lang.Throwable -> L117c
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L117c
            r3 = r0[r38]     // Catch: java.lang.Throwable -> L117c
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L117c
            java.lang.String r2 = $$c(r2, r3, r15)     // Catch: java.lang.Throwable -> L117c
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L117c
            r3 = r0[r60]     // Catch: java.lang.Throwable -> L117c
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L117c
            r6 = r0[r23]     // Catch: java.lang.Throwable -> L117c
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L117c
            r9 = 707(0x2c3, float:9.91E-43)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L117c
            java.lang.String r3 = $$c(r3, r6, r9)     // Catch: java.lang.Throwable -> L117c
            r13 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r3, r13)     // Catch: java.lang.Throwable -> L117c
            java.lang.Object r2 = r2.invoke(r10, r13)     // Catch: java.lang.Throwable -> L117c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L117c
            r2.getClass()     // Catch: java.lang.Throwable -> L117c
            r41 = 356(0x164, float:4.99E-43)
            r2 = r0[r41]     // Catch: java.lang.Throwable -> L1171
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1171
            r3 = r0[r38]     // Catch: java.lang.Throwable -> L1171
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1171
            java.lang.String r2 = $$c(r2, r3, r15)     // Catch: java.lang.Throwable -> L1171
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1171
            r3 = r0[r60]     // Catch: java.lang.Throwable -> L1171
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1171
            r6 = r0[r23]     // Catch: java.lang.Throwable -> L1171
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1171
            java.lang.String r3 = $$c(r3, r6, r9)     // Catch: java.lang.Throwable -> L1171
            r13 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r3, r13)     // Catch: java.lang.Throwable -> L1171
            java.lang.Object r2 = r2.invoke(r8, r13)     // Catch: java.lang.Throwable -> L1171
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L1171
            r2.getClass()     // Catch: java.lang.Throwable -> L1171
            java.lang.Object r2 = com.appsflyer.internal.AFa1hSDK.f6286w     // Catch: java.lang.Throwable -> L116d
            if (r2 != 0) goto L1161
            r2 = r0[r30]     // Catch: java.lang.Throwable -> L1156
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1156
            r41 = 356(0x164, float:4.99E-43)
            r0 = r0[r41]     // Catch: java.lang.Throwable -> L1156
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1156
            r3 = 712(0x2c8, float:9.98E-43)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L1156
            java.lang.String r0 = $$c(r2, r0, r3)     // Catch: java.lang.Throwable -> L1156
            r13 = 0
            java.lang.reflect.Method r0 = r7.getMethod(r0, r13)     // Catch: java.lang.Throwable -> L1156
            r2 = r64
            java.lang.Object r0 = r0.invoke(r2, r13)     // Catch: java.lang.Throwable -> L1154
            com.appsflyer.internal.AFa1hSDK.f6286w = r0     // Catch: java.lang.Throwable -> L1144
            goto L1163
        L1144:
            r0 = move-exception
        L1145:
            r3 = r0
            r64 = r5
            r62 = r15
        L114a:
            r8 = r58
            r1 = r63
        L114e:
            r40 = 5
        L1150:
            r46 = 26
            goto L1ac4
        L1154:
            r0 = move-exception
            goto L1159
        L1156:
            r0 = move-exception
            r2 = r64
        L1159:
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1144
            if (r1 == 0) goto L1160
            throw r1     // Catch: java.lang.Throwable -> L1144
        L1160:
            throw r0     // Catch: java.lang.Throwable -> L1144
        L1161:
            r2 = r64
        L1163:
            r64 = r5
            r68 = r62
            r40 = 5
            r62 = r15
            goto L161c
        L116d:
            r0 = move-exception
            r2 = r64
            goto L1145
        L1171:
            r0 = move-exception
            r2 = r64
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1144
            if (r1 == 0) goto L117b
            throw r1     // Catch: java.lang.Throwable -> L1144
        L117b:
            throw r0     // Catch: java.lang.Throwable -> L1144
        L117c:
            r0 = move-exception
            r2 = r64
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1144
            if (r1 == 0) goto L1186
            throw r1     // Catch: java.lang.Throwable -> L1144
        L1186:
            throw r0     // Catch: java.lang.Throwable -> L1144
        L1187:
            r0 = move-exception
            r2 = r64
        L118a:
            r1 = r63
            goto L1226
        L118e:
            r0 = move-exception
            r2 = r64
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1198
            if (r1 == 0) goto L119a
            throw r1     // Catch: java.lang.Throwable -> L1198
        L1198:
            r0 = move-exception
            goto L118a
        L119a:
            throw r0     // Catch: java.lang.Throwable -> L1198
        L119b:
            r0 = move-exception
            r2 = r64
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1198
            if (r1 == 0) goto L11a5
            throw r1     // Catch: java.lang.Throwable -> L1198
        L11a5:
            throw r0     // Catch: java.lang.Throwable -> L1198
        L11a6:
            r0 = move-exception
            r63 = r2
            r2 = r1
            goto L118a
        L11ab:
            r0 = move-exception
            r63 = r2
            r2 = r1
        L11af:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1198
            r1.<init>()     // Catch: java.lang.Throwable -> L1198
            byte[] r3 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L1198
            r6 = r3[r21]     // Catch: java.lang.Throwable -> L1198
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1198
            r9 = r3[r42]     // Catch: java.lang.Throwable -> L1198
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1198
            r11 = r9 ^ 627(0x273, float:8.79E-43)
            r12 = r9 & 627(0x273, float:8.79E-43)
            r11 = r11 | r12
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L1198
            java.lang.String r6 = $$c(r6, r9, r11)     // Catch: java.lang.Throwable -> L1198
            r1.append(r6)     // Catch: java.lang.Throwable -> L1198
            r1.append(r10)     // Catch: java.lang.Throwable -> L1198
            r6 = r3[r16]     // Catch: java.lang.Throwable -> L1198
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1198
            r46 = 26
            r9 = r3[r46]     // Catch: java.lang.Throwable -> L1198
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1198
            r11 = 291(0x123, float:4.08E-43)
            r12 = r9 ^ 291(0x123, float:4.08E-43)
            r13 = r9 & 291(0x123, float:4.08E-43)
            r11 = r12 | r13
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L1198
            java.lang.String r6 = $$c(r6, r9, r11)     // Catch: java.lang.Throwable -> L1198
            r1.append(r6)     // Catch: java.lang.Throwable -> L1198
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1198
            r13 = 2
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L1219
            r43 = 1
            r6[r43] = r0     // Catch: java.lang.Throwable -> L1219
            r32 = 0
            r6[r32] = r1     // Catch: java.lang.Throwable -> L1219
            r41 = 356(0x164, float:4.99E-43)
            r0 = r3[r41]     // Catch: java.lang.Throwable -> L1219
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1219
            r1 = r3[r18]     // Catch: java.lang.Throwable -> L1219
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L1219
            r11 = 291(0x123, float:4.08E-43)
            short r3 = (short) r11     // Catch: java.lang.Throwable -> L1219
            java.lang.String r0 = $$c(r0, r1, r3)     // Catch: java.lang.Throwable -> L1219
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1219
            r1 = r63
            java.lang.Class[] r3 = new java.lang.Class[]{r4, r1}     // Catch: java.lang.Throwable -> L1217
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L1217
            java.lang.Object r0 = r0.newInstance(r6)     // Catch: java.lang.Throwable -> L1217
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L1217
            throw r0     // Catch: java.lang.Throwable -> L1217
        L1217:
            r0 = move-exception
            goto L121c
        L1219:
            r0 = move-exception
            r1 = r63
        L121c:
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L1223
            if (r3 == 0) goto L1225
            throw r3     // Catch: java.lang.Throwable -> L1223
        L1223:
            r0 = move-exception
            goto L1226
        L1225:
            throw r0     // Catch: java.lang.Throwable -> L1223
        L1226:
            byte[] r3 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L128f
            r41 = 356(0x164, float:4.99E-43)
            r6 = r3[r41]     // Catch: java.lang.Throwable -> L128f
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L128f
            r9 = r3[r38]     // Catch: java.lang.Throwable -> L128f
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L128f
            java.lang.String r6 = $$c(r6, r9, r15)     // Catch: java.lang.Throwable -> L128f
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L128f
            r9 = r3[r60]     // Catch: java.lang.Throwable -> L128f
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L128f
            r11 = r3[r23]     // Catch: java.lang.Throwable -> L128f
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L128f
            r12 = 707(0x2c3, float:9.91E-43)
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L128f
            java.lang.String r9 = $$c(r9, r11, r12)     // Catch: java.lang.Throwable -> L128f
            r13 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r9, r13)     // Catch: java.lang.Throwable -> L128f
            java.lang.Object r6 = r6.invoke(r10, r13)     // Catch: java.lang.Throwable -> L128f
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L128f
            r6.getClass()     // Catch: java.lang.Throwable -> L128f
            r41 = 356(0x164, float:4.99E-43)
            r6 = r3[r41]     // Catch: java.lang.Throwable -> L1286
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1286
            r9 = r3[r38]     // Catch: java.lang.Throwable -> L1286
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1286
            java.lang.String r6 = $$c(r6, r9, r15)     // Catch: java.lang.Throwable -> L1286
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L1286
            r9 = r3[r60]     // Catch: java.lang.Throwable -> L1286
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1286
            r3 = r3[r23]     // Catch: java.lang.Throwable -> L1286
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1286
            java.lang.String r3 = $$c(r9, r3, r12)     // Catch: java.lang.Throwable -> L1286
            r13 = 0
            java.lang.reflect.Method r3 = r6.getMethod(r3, r13)     // Catch: java.lang.Throwable -> L1286
            java.lang.Object r3 = r3.invoke(r8, r13)     // Catch: java.lang.Throwable -> L1286
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L1286
            r3.getClass()     // Catch: java.lang.Throwable -> L1286
            throw r0     // Catch: java.lang.Throwable -> L127c
        L127c:
            r0 = move-exception
        L127d:
            r3 = r0
            r64 = r5
            r62 = r15
            r8 = r58
            goto L114e
        L1286:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L127c
            if (r3 == 0) goto L128e
            throw r3     // Catch: java.lang.Throwable -> L127c
        L128e:
            throw r0     // Catch: java.lang.Throwable -> L127c
        L128f:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L127c
            if (r3 == 0) goto L1297
            throw r3     // Catch: java.lang.Throwable -> L127c
        L1297:
            throw r0     // Catch: java.lang.Throwable -> L127c
        L1298:
            r0 = move-exception
            r71 = r2
            r2 = r1
            r1 = r71
            goto L127d
        L129f:
            r41 = r2
            r2 = r1
            r1 = r41
            r62 = r9
            r61 = r11
            r41 = 356(0x164, float:4.99E-43)
            r60 = 37
            r0 = r27[r41]     // Catch: java.lang.Throwable -> L1987
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1987
            r3 = 959(0x3bf, float:1.344E-42)
            r3 = r27[r3]     // Catch: java.lang.Throwable -> L1987
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1987
            r8 = 725(0x2d5, float:1.016E-42)
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L1987
            java.lang.String r0 = $$c(r0, r3, r8)     // Catch: java.lang.Throwable -> L1987
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1987
            r41 = 356(0x164, float:4.99E-43)
            r3 = r27[r41]     // Catch: java.lang.Throwable -> L1987
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1987
            r8 = r27[r18]     // Catch: java.lang.Throwable -> L1987
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1987
            r9 = r62
            java.lang.String r3 = $$c(r3, r8, r9)     // Catch: java.lang.Throwable -> L1987
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L1987
            java.lang.Class[] r8 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L1987
            java.lang.reflect.Constructor r8 = r0.getConstructor(r8)     // Catch: java.lang.Throwable -> L1987
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L1987
            java.lang.Object r6 = r8.newInstance(r6)     // Catch: java.lang.Throwable -> L1987
            r8 = r27[r30]     // Catch: java.lang.Throwable -> L1987
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1987
            r10 = r27[r38]     // Catch: java.lang.Throwable -> L1987
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1987
            r11 = 752(0x2f0, float:1.054E-42)
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L1987
            java.lang.String r8 = $$c(r8, r10, r11)     // Catch: java.lang.Throwable -> L1987
            r10 = 0
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> L1987
            java.lang.reflect.Method r0 = r0.getMethod(r8, r11)     // Catch: java.lang.Throwable -> L1987
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L1987
            java.lang.Object r0 = r0.invoke(r6, r8)     // Catch: java.lang.Throwable -> L1987
            r41 = 356(0x164, float:4.99E-43)
            r8 = r27[r41]     // Catch: java.lang.Throwable -> L1987
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1987
            r10 = r27[r24]     // Catch: java.lang.Throwable -> L1987
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1987
            r11 = 763(0x2fb, float:1.069E-42)
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L1987
            java.lang.String r8 = $$c(r8, r10, r11)     // Catch: java.lang.Throwable -> L1987
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L1987
            r10 = r27[r30]     // Catch: java.lang.Throwable -> L1987
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1987
            r11 = r27[r17]     // Catch: java.lang.Throwable -> L1987
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1987
            r12 = 784(0x310, float:1.099E-42)
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L1987
            java.lang.String r10 = $$c(r10, r11, r12)     // Catch: java.lang.Throwable -> L1987
            r11 = 0
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch: java.lang.Throwable -> L1987
            java.lang.reflect.Method r8 = r8.getMethod(r10, r12)     // Catch: java.lang.Throwable -> L1987
            r10 = r27[r23]     // Catch: java.lang.Throwable -> L1987
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1987
            r11 = r27[r34]     // Catch: java.lang.Throwable -> L1987
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1987
            r12 = 618(0x26a, float:8.66E-43)
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L1987
            java.lang.String r10 = $$c(r10, r11, r12)     // Catch: java.lang.Throwable -> L1987
            java.lang.Class[] r11 = new java.lang.Class[]{r5}     // Catch: java.lang.Throwable -> L1987
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch: java.lang.Throwable -> L1987
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L19a0
            r41 = 356(0x164, float:4.99E-43)
            r10 = r27[r41]     // Catch: java.lang.Throwable -> L19a0
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L19a0
            r11 = 451(0x1c3, float:6.32E-43)
            r11 = r27[r11]     // Catch: java.lang.Throwable -> L19a0
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L19a0
            int r12 = com.appsflyer.internal.AFa1hSDK.$$b     // Catch: java.lang.Throwable -> L19a0
            r13 = r12 ^ 257(0x101, float:3.6E-43)
            r12 = r12 & 257(0x101, float:3.6E-43)
            r12 = r12 | r13
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L19a0
            java.lang.String r10 = $$c(r10, r11, r12)     // Catch: java.lang.Throwable -> L19a0
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L19a0
            r41 = 356(0x164, float:4.99E-43)
            r11 = r27[r41]     // Catch: java.lang.Throwable -> L19a0
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L19a0
            r12 = r27[r18]     // Catch: java.lang.Throwable -> L19a0
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L19a0
            java.lang.String r11 = $$c(r11, r12, r9)     // Catch: java.lang.Throwable -> L19a0
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L19a0
            java.lang.Class[] r11 = new java.lang.Class[]{r11}     // Catch: java.lang.Throwable -> L19a0
            java.lang.reflect.Constructor r10 = r10.getDeclaredConstructor(r11)     // Catch: java.lang.Throwable -> L19a0
            java.lang.Object r6 = r10.newInstance(r6)     // Catch: java.lang.Throwable -> L19a0
            r10 = r27[r30]     // Catch: java.lang.Throwable -> L198d
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L198d
            r41 = 356(0x164, float:4.99E-43)
            r11 = r27[r41]     // Catch: java.lang.Throwable -> L198d
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L198d
            r12 = 712(0x2c8, float:9.98E-43)
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L198d
            java.lang.String r10 = $$c(r10, r11, r12)     // Catch: java.lang.Throwable -> L198d
            r13 = 0
            java.lang.reflect.Method r10 = r7.getMethod(r10, r13)     // Catch: java.lang.Throwable -> L198d
            java.lang.Object r10 = r10.invoke(r2, r13)     // Catch: java.lang.Throwable -> L198d
            r11 = r27[r41]     // Catch: java.lang.Throwable -> L1987
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1987
            r12 = 564(0x234, float:7.9E-43)
            r12 = r27[r12]     // Catch: java.lang.Throwable -> L1987
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1987
            r13 = 790(0x316, float:1.107E-42)
            short r13 = (short) r13     // Catch: java.lang.Throwable -> L1987
            java.lang.String r11 = $$c(r11, r12, r13)     // Catch: java.lang.Throwable -> L1987
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L1987
            r12 = 0
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> L1987
            java.lang.reflect.Constructor r13 = r11.getConstructor(r13)     // Catch: java.lang.Throwable -> L1987
            r62 = r15
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L1979
            java.lang.Object r12 = r13.newInstance(r15)     // Catch: java.lang.Throwable -> L1979
            r46 = 26
            r13 = r27[r46]     // Catch: java.lang.Throwable -> L197f
            byte r13 = (byte) r13
            r15 = r27[r42]     // Catch: java.lang.Throwable -> L1979
            byte r15 = (byte) r15
            r63 = r1
            r1 = 635(0x27b, float:8.9E-43)
            short r1 = (short) r1
            java.lang.String r1 = $$c(r13, r15, r1)     // Catch: java.lang.Throwable -> L1975
            java.lang.Class[] r13 = new java.lang.Class[]{r5, r14, r14}     // Catch: java.lang.Throwable -> L1975
            java.lang.reflect.Method r1 = r11.getMethod(r1, r13)     // Catch: java.lang.Throwable -> L1975
            r13 = r27[r34]     // Catch: java.lang.Throwable -> L1975
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1975
            r14 = r27[r31]     // Catch: java.lang.Throwable -> L1975
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1975
            r15 = 818(0x332, float:1.146E-42)
            short r15 = (short) r15     // Catch: java.lang.Throwable -> L1975
            java.lang.String r13 = $$c(r13, r14, r15)     // Catch: java.lang.Throwable -> L1975
            r14 = 0
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L1975
            java.lang.reflect.Method r11 = r11.getMethod(r13, r15)     // Catch: java.lang.Throwable -> L1975
            r41 = 356(0x164, float:4.99E-43)
            r13 = r27[r41]     // Catch: java.lang.Throwable -> L1975
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1975
            r14 = r27[r30]     // Catch: java.lang.Throwable -> L1975
            byte r14 = (byte) r14
            r15 = r14 ^ 812(0x32c, float:1.138E-42)
            r64 = r5
            r5 = r14 & 812(0x32c, float:1.138E-42)
            r5 = r5 | r15
            short r5 = (short) r5
            java.lang.String r5 = $$c(r13, r14, r5)     // Catch: java.lang.Throwable -> L1954
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L1954
            r13 = r27[r25]     // Catch: java.lang.Throwable -> L1954
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1954
            r14 = r27[r42]     // Catch: java.lang.Throwable -> L1954
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1954
            r15 = r14 ^ 344(0x158, float:4.82E-43)
            r27 = r15
            r15 = r14 & 344(0x158, float:4.82E-43)
            r15 = r27 | r15
            short r15 = (short) r15     // Catch: java.lang.Throwable -> L1954
            java.lang.String r13 = $$c(r13, r14, r15)     // Catch: java.lang.Throwable -> L1954
            r14 = 0
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L1954
            java.lang.reflect.Method r5 = r5.getMethod(r13, r15)     // Catch: java.lang.Throwable -> L1954
            r13 = 1024(0x400, float:1.435E-42)
            byte[] r13 = new byte[r13]     // Catch: java.lang.Throwable -> L1954
            r14 = 0
        L140f:
            java.lang.Object[] r15 = new java.lang.Object[]{r13}     // Catch: java.lang.Throwable -> L1954
            java.lang.Object r15 = r3.invoke(r6, r15)     // Catch: java.lang.Throwable -> L1954
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch: java.lang.Throwable -> L1954
            r27 = r3
            int r3 = r15.intValue()     // Catch: java.lang.Throwable -> L1954
            if (r3 <= 0) goto L14ad
            int r66 = com.appsflyer.internal.AFa1hSDK.$10
            r67 = r66 & 111(0x6f, float:1.56E-43)
            r66 = r66 | 111(0x6f, float:1.56E-43)
            r68 = r9
            int r9 = r67 + r66
            int r9 = r9 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r9
            r66 = r10
            long r9 = (long) r14
            r69 = r9
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L14a7
            java.lang.Object r9 = r8.invoke(r0, r10)     // Catch: java.lang.Throwable -> L14a7
            java.lang.Long r9 = (java.lang.Long) r9     // Catch: java.lang.Throwable -> L14a7
            long r9 = r9.longValue()     // Catch: java.lang.Throwable -> L14a7
            int r9 = (r69 > r9 ? 1 : (r69 == r9 ? 0 : -1))
            if (r9 >= 0) goto L14ab
            int r9 = com.appsflyer.internal.AFa1hSDK.$11
            int r9 = r9 + 81
            int r9 = r9 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r9
            r32 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r32)     // Catch: java.lang.Throwable -> L14a7
            java.lang.Object[] r9 = new java.lang.Object[]{r13, r9, r15}     // Catch: java.lang.Throwable -> L14a7
            r1.invoke(r12, r9)     // Catch: java.lang.Throwable -> L14a7
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L14a7
            int r9 = (int) r9
            int r10 = r3 * 860
            int r15 = r14 * (-858)
            int r10 = r10 + r15
            r15 = r3 ^ r9
            r67 = r3 & r9
            r15 = r15 | r67
            int r15 = r15 * (-859)
            int r10 = r10 + r15
            int r15 = ~r9
            r67 = r15 ^ r3
            r69 = r15 & r3
            r70 = r1
            r1 = r67 | r69
            int r1 = ~r1
            r67 = r1
            int r1 = ~r3
            int r14 = ~r14
            r1 = r1 | r14
            r69 = r1 ^ r9
            r1 = r1 & r9
            r1 = r69 | r1
            int r1 = ~r1
            r9 = r67 ^ r1
            r1 = r67 & r1
            r1 = r1 | r9
            int r1 = r1 * 859
            int r10 = r10 + r1
            r1 = r14 ^ r15
            r9 = r14 & r15
            r1 = r1 | r9
            int r1 = ~r1
            r9 = r14 ^ r3
            r3 = r3 & r14
            r3 = r3 | r9
            int r3 = ~r3
            r9 = r1 ^ r3
            r1 = r1 & r3
            r1 = r1 | r9
            int r1 = r1 * 859
            int r14 = r10 + r1
            r3 = r27
            r10 = r66
            r9 = r68
            r1 = r70
            goto L140f
        L14a7:
            r0 = move-exception
            r3 = r0
            goto L114a
        L14ab:
            r14 = 0
            goto L14b2
        L14ad:
            r68 = r9
            r66 = r10
            goto L14ab
        L14b2:
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L1954
            java.lang.Object r0 = r11.invoke(r12, r0)     // Catch: java.lang.Throwable -> L1954
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L1954
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L14a7 java.lang.Exception -> L14c4
            r5.invoke(r6, r1)     // Catch: java.lang.Throwable -> L14a7 java.lang.Exception -> L14c4
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L14a7 java.lang.Exception -> L14c4
            r5.invoke(r12, r1)     // Catch: java.lang.Throwable -> L14a7 java.lang.Exception -> L14c4
        L14c4:
            byte[] r1 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L1954
            r3 = r1[r60]     // Catch: java.lang.Throwable -> L1954
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1954
            r5 = 239(0xef, float:3.35E-43)
            r5 = r1[r5]     // Catch: java.lang.Throwable -> L1954
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1954
            r6 = 844(0x34c, float:1.183E-42)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L1954
            java.lang.String r3 = $$c(r3, r5, r6)     // Catch: java.lang.Throwable -> L1954
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L1954
            r41 = 356(0x164, float:4.99E-43)
            r5 = r1[r41]     // Catch: java.lang.Throwable -> L1954
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1954
            r6 = r1[r18]     // Catch: java.lang.Throwable -> L1954
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1954
            r8 = 879(0x36f, float:1.232E-42)
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L1954
            java.lang.String r5 = $$c(r5, r6, r8)     // Catch: java.lang.Throwable -> L1954
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L1954
            r41 = 356(0x164, float:4.99E-43)
            r6 = r1[r41]     // Catch: java.lang.Throwable -> L1954
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1954
            r9 = r1[r25]     // Catch: java.lang.Throwable -> L1954
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1954
            r10 = 897(0x381, float:1.257E-42)
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L1954
            java.lang.String r6 = $$c(r6, r9, r10)     // Catch: java.lang.Throwable -> L1954
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L1954
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6}     // Catch: java.lang.Throwable -> L1954
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r5)     // Catch: java.lang.Throwable -> L1954
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L195c
            r41 = 356(0x164, float:4.99E-43)
            r5 = r1[r41]     // Catch: java.lang.Throwable -> L195c
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L195c
            r6 = r1[r18]     // Catch: java.lang.Throwable -> L195c
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L195c
            java.lang.String r5 = $$c(r5, r6, r8)     // Catch: java.lang.Throwable -> L195c
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L195c
            r46 = 26
            r6 = r1[r46]     // Catch: java.lang.Throwable -> L1966
            byte r6 = (byte) r6
            r8 = r1[r34]     // Catch: java.lang.Throwable -> L195c
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L195c
            r9 = 917(0x395, float:1.285E-42)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L195c
            java.lang.String r6 = $$c(r6, r8, r9)     // Catch: java.lang.Throwable -> L195c
            java.lang.Class[] r8 = new java.lang.Class[]{r64}     // Catch: java.lang.Throwable -> L195c
            java.lang.reflect.Method r5 = r5.getMethod(r6, r8)     // Catch: java.lang.Throwable -> L195c
            r13 = 0
            java.lang.Object r0 = r5.invoke(r13, r0)     // Catch: java.lang.Throwable -> L195c
            r5 = r66
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r5}     // Catch: java.lang.Throwable -> L1954
            java.lang.Object r0 = r3.newInstance(r0)     // Catch: java.lang.Throwable -> L1954
            r3 = r1[r60]     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            r6 = 320(0x140, float:4.48E-43)
            r6 = r1[r6]     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            r8 = 920(0x398, float:1.289E-42)
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            java.lang.String r3 = $$c(r3, r6, r8)     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            r6 = 15
            r6 = r1[r6]     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            byte r8 = (byte) r6     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            r9 = r8 ^ 944(0x3b0, float:1.323E-42)
            r10 = r8 & 944(0x3b0, float:1.323E-42)
            r9 = r9 | r10
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            java.lang.String r6 = $$c(r6, r8, r9)     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            java.lang.reflect.Field r3 = r3.getDeclaredField(r6)     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            r12 = 1
            r3.setAccessible(r12)     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            java.lang.Class r8 = r6.getClass()     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            r40 = 5
            r9 = r1[r40]     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            byte r9 = (byte) r9
            r10 = r1[r22]     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            int r11 = com.appsflyer.internal.AFa1hSDK.$$b     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            r11 = r11 | 784(0x310, float:1.099E-42)
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            java.lang.String r9 = $$c(r9, r10, r11)     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            java.lang.reflect.Field r9 = r8.getDeclaredField(r9)     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            r12 = 1
            r9.setAccessible(r12)     // Catch: java.lang.Throwable -> L18c9 java.lang.Exception -> L18d0
            r40 = 5
            r10 = r1[r40]     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            byte r10 = (byte) r10     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            r11 = 968(0x3c8, float:1.356E-42)
            r11 = r1[r11]     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            byte r11 = (byte) r11     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            r12 = 981(0x3d5, float:1.375E-42)
            short r12 = (short) r12     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            java.lang.String r10 = $$c(r10, r11, r12)     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            java.lang.reflect.Field r8 = r8.getDeclaredField(r10)     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            r12 = 1
            r8.setAccessible(r12)     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            java.lang.Object r10 = r9.get(r6)     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            java.lang.Object r6 = r8.get(r6)     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            r11.<init>(r10)     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            java.lang.Class r10 = r6.getClass()     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            r12 = r1[r30]     // Catch: java.lang.Throwable -> L18bc
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L18bc
            r13 = 662(0x296, float:9.28E-43)
            r1 = r1[r13]     // Catch: java.lang.Throwable -> L18bc
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L18bc
            r13 = 1005(0x3ed, float:1.408E-42)
            short r13 = (short) r13     // Catch: java.lang.Throwable -> L18bc
            java.lang.String r1 = $$c(r12, r1, r13)     // Catch: java.lang.Throwable -> L18bc
            r13 = 0
            java.lang.reflect.Method r1 = r7.getMethod(r1, r13)     // Catch: java.lang.Throwable -> L18bc
            java.lang.Object r1 = r1.invoke(r10, r13)     // Catch: java.lang.Throwable -> L18bc
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L18bc
            int r10 = java.lang.reflect.Array.getLength(r6)     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r10)     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            r12 = 0
        L15e0:
            if (r12 >= r10) goto L1600
            java.lang.Object r13 = java.lang.reflect.Array.get(r6, r12)     // Catch: java.lang.Throwable -> L15f3 java.lang.Exception -> L15fb
            java.lang.reflect.Array.set(r1, r12, r13)     // Catch: java.lang.Throwable -> L15f3 java.lang.Exception -> L15fb
            r43 = 1
            r13 = r12 ^ 1
            r12 = r12 & 1
            int r12 = r12 << 1
            int r12 = r12 + r13
            goto L15e0
        L15f3:
            r0 = move-exception
            r3 = r0
            r8 = r58
        L15f7:
            r1 = r63
            goto L1150
        L15fb:
            r0 = move-exception
            r8 = r58
            goto L18d5
        L1600:
            r9.set(r3, r11)     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            r8.set(r3, r1)     // Catch: java.lang.Exception -> L15fb java.lang.Throwable -> L185f
            int r1 = com.appsflyer.internal.AFa1hSDK.$10
            r3 = r1 ^ 115(0x73, float:1.61E-43)
            r1 = r1 & 115(0x73, float:1.61E-43)
            r43 = 1
            int r1 = r1 << 1
            int r3 = r3 + r1
            int r3 = r3 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r3
            java.lang.Object r1 = com.appsflyer.internal.AFa1hSDK.f6286w     // Catch: java.lang.Throwable -> L185f
            if (r1 != 0) goto L161b
            com.appsflyer.internal.AFa1hSDK.f6286w = r0     // Catch: java.lang.Throwable -> L15f3
        L161b:
            r1 = r0
        L161c:
            if (r59 == 0) goto L16aa
            byte[] r0 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L15f3
            r3 = r0[r60]     // Catch: java.lang.Throwable -> L15f3
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L15f3
            r5 = r0[r25]     // Catch: java.lang.Throwable -> L15f3
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L15f3
            r6 = 667(0x29b, float:9.35E-43)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L15f3
            java.lang.String r3 = $$c(r3, r5, r6)     // Catch: java.lang.Throwable -> L15f3
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L15f3
            r5 = r0[r38]     // Catch: java.lang.Throwable -> L15f3
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L15f3
            r6 = 198(0xc6, float:2.77E-43)
            r6 = r0[r6]     // Catch: java.lang.Throwable -> L15f3
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L15f3
            r8 = 1024(0x400, float:1.435E-42)
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L15f3
            java.lang.String r5 = $$c(r5, r6, r8)     // Catch: java.lang.Throwable -> L15f3
            r41 = 356(0x164, float:4.99E-43)
            r6 = r0[r41]     // Catch: java.lang.Throwable -> L15f3
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L15f3
            r8 = r0[r25]     // Catch: java.lang.Throwable -> L15f3
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L15f3
            r9 = 897(0x381, float:1.257E-42)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L15f3
            java.lang.String r6 = $$c(r6, r8, r9)     // Catch: java.lang.Throwable -> L15f3
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L15f3
            java.lang.Class[] r6 = new java.lang.Class[]{r4, r6}     // Catch: java.lang.Throwable -> L15f3
            java.lang.reflect.Method r5 = r3.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L15f3
            r12 = 1
            r5.setAccessible(r12)     // Catch: java.lang.Throwable -> L15f3
            r6 = r0[r30]     // Catch: java.lang.Throwable -> L16a1
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L16a1
            r41 = 356(0x164, float:4.99E-43)
            r8 = r0[r41]     // Catch: java.lang.Throwable -> L16a1
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L16a1
            r9 = 712(0x2c8, float:9.98E-43)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L16a1
            java.lang.String r6 = $$c(r6, r8, r9)     // Catch: java.lang.Throwable -> L16a1
            r13 = 0
            java.lang.reflect.Method r6 = r7.getMethod(r6, r13)     // Catch: java.lang.Throwable -> L16a1
            java.lang.Object r6 = r6.invoke(r2, r13)     // Catch: java.lang.Throwable -> L16a1
            r8 = r61
            java.lang.Object[] r6 = new java.lang.Object[]{r8, r6}     // Catch: java.lang.Throwable -> L15f3
            java.lang.Object r5 = r5.invoke(r1, r6)     // Catch: java.lang.Throwable -> L15f3
            if (r5 == 0) goto L169f
            r6 = r0[r25]     // Catch: java.lang.Throwable -> L15f3
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L15f3
            r0 = r0[r42]     // Catch: java.lang.Throwable -> L15f3
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L15f3
            r8 = r0 ^ 344(0x158, float:4.82E-43)
            r9 = r0 & 344(0x158, float:4.82E-43)
            r8 = r8 | r9
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L15f3
            java.lang.String r0 = $$c(r6, r0, r8)     // Catch: java.lang.Throwable -> L15f3
            r14 = 0
            java.lang.Class[] r6 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L15f3
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r0, r6)     // Catch: java.lang.Throwable -> L15f3
            java.lang.Object[] r3 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L15f3
            r0.invoke(r1, r3)     // Catch: java.lang.Throwable -> L15f3
        L169f:
            r0 = r5
            goto L16ee
        L16a1:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L15f3
            if (r1 == 0) goto L16a9
            throw r1     // Catch: java.lang.Throwable -> L15f3
        L16a9:
            throw r0     // Catch: java.lang.Throwable -> L15f3
        L16aa:
            r8 = r61
            byte[] r0 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L185f
            r41 = 356(0x164, float:4.99E-43)
            r3 = r0[r41]     // Catch: java.lang.Throwable -> L185f
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L185f
            r5 = r0[r25]     // Catch: java.lang.Throwable -> L185f
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L185f
            r6 = 897(0x381, float:1.257E-42)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L185f
            java.lang.String r3 = $$c(r3, r5, r6)     // Catch: java.lang.Throwable -> L185f
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L185f
            r5 = r0[r38]     // Catch: java.lang.Throwable -> L185f
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L185f
            r6 = 198(0xc6, float:2.77E-43)
            r0 = r0[r6]     // Catch: java.lang.Throwable -> L185f
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L185f
            r6 = 1024(0x400, float:1.435E-42)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L185f
            java.lang.String r0 = $$c(r5, r0, r6)     // Catch: java.lang.Throwable -> L185f
            java.lang.Class[] r5 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L185f
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r0, r5)     // Catch: java.lang.Throwable -> L185f
            r12 = 1
            r0.setAccessible(r12)     // Catch: java.lang.Throwable -> L15f3 java.lang.reflect.InvocationTargetException -> L16e5
            java.lang.Object[] r3 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L15f3 java.lang.reflect.InvocationTargetException -> L16e5
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch: java.lang.Throwable -> L15f3 java.lang.reflect.InvocationTargetException -> L16e5
            goto L16ee
        L16e5:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L15f3 java.lang.ClassNotFoundException -> L16ed
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch: java.lang.Throwable -> L15f3 java.lang.ClassNotFoundException -> L16ed
            throw r0     // Catch: java.lang.Throwable -> L15f3 java.lang.ClassNotFoundException -> L16ed
        L16ed:
            r0 = 0
        L16ee:
            if (r0 == 0) goto L1863
            r3 = r0
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L185f
            byte[] r0 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L185f
            r5 = r0[r25]     // Catch: java.lang.Throwable -> L185f
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L185f
            r6 = 175(0xaf, float:2.45E-43)
            r6 = r0[r6]     // Catch: java.lang.Throwable -> L185f
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L185f
            r8 = 1032(0x408, float:1.446E-42)
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L185f
            java.lang.String r11 = $$c(r5, r6, r8)     // Catch: java.lang.Throwable -> L185f
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L185f
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6}     // Catch: java.lang.Throwable -> L185f
            java.lang.reflect.Constructor r5 = r3.getDeclaredConstructor(r5)     // Catch: java.lang.Throwable -> L185f
            r12 = 1
            r5.setAccessible(r12)     // Catch: java.lang.Throwable -> L185f
            r6 = r59
            if (r6 == r12) goto L1722
            int r8 = com.appsflyer.internal.AFa1hSDK.$11
            int r8 = r8 + 15
            int r8 = r8 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r8
            r12 = 1
            goto L1723
        L1722:
            r12 = 0
        L1723:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> L185f
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r8}     // Catch: java.lang.Throwable -> L185f
            java.lang.Object r1 = r5.newInstance(r1)     // Catch: java.lang.Throwable -> L185f
            com.appsflyer.internal.AFa1hSDK.f6282d = r1     // Catch: java.lang.Throwable -> L185f
            r1 = 13692(0x357c, float:1.9187E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L185f
            r5 = 734(0x2de, float:1.029E-42)
            r5 = r0[r5]     // Catch: java.lang.Throwable -> L185f
            int r5 = -r5
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L185f
            r8 = 52
            r8 = r0[r8]     // Catch: java.lang.Throwable -> L185f
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L185f
            r9 = 1064(0x428, float:1.491E-42)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L185f
            java.lang.String r5 = $$c(r5, r8, r9)     // Catch: java.lang.Throwable -> L185f
            r12 = 1
            java.lang.String r5 = r5.substring(r12)     // Catch: java.lang.Throwable -> L185f
            r8 = r58
            java.util.zip.ZipEntry r5 = r8.getEntry(r5)     // Catch: java.lang.Throwable -> L1837
            java.io.InputStream r5 = r8.getInputStream(r5)     // Catch: java.lang.Throwable -> L1837
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L1856
            r41 = 356(0x164, float:4.99E-43)
            r9 = r0[r41]     // Catch: java.lang.Throwable -> L1856
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1856
            r10 = 451(0x1c3, float:6.32E-43)
            r10 = r0[r10]     // Catch: java.lang.Throwable -> L1856
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1856
            int r12 = com.appsflyer.internal.AFa1hSDK.$$b     // Catch: java.lang.Throwable -> L1856
            r13 = r12 ^ 257(0x101, float:3.6E-43)
            r12 = r12 & 257(0x101, float:3.6E-43)
            r12 = r12 | r13
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L1856
            java.lang.String r9 = $$c(r9, r10, r12)     // Catch: java.lang.Throwable -> L1856
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L1856
            r41 = 356(0x164, float:4.99E-43)
            r10 = r0[r41]     // Catch: java.lang.Throwable -> L1856
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1856
            r12 = r0[r18]     // Catch: java.lang.Throwable -> L1856
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1856
            r13 = r68
            java.lang.String r10 = $$c(r10, r12, r13)     // Catch: java.lang.Throwable -> L1856
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L1856
            java.lang.Class[] r10 = new java.lang.Class[]{r10}     // Catch: java.lang.Throwable -> L1856
            java.lang.reflect.Constructor r9 = r9.getDeclaredConstructor(r10)     // Catch: java.lang.Throwable -> L1856
            java.lang.Object r5 = r9.newInstance(r5)     // Catch: java.lang.Throwable -> L1856
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L184d
            r41 = 356(0x164, float:4.99E-43)
            r9 = r0[r41]     // Catch: java.lang.Throwable -> L184d
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L184d
            r10 = r0[r20]     // Catch: java.lang.Throwable -> L184d
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L184d
            r12 = 475(0x1db, float:6.66E-43)
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L184d
            java.lang.String r9 = $$c(r9, r10, r12)     // Catch: java.lang.Throwable -> L184d
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L184d
            r41 = 356(0x164, float:4.99E-43)
            r10 = r0[r41]     // Catch: java.lang.Throwable -> L184d
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L184d
            r14 = r0[r18]     // Catch: java.lang.Throwable -> L184d
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L184d
            java.lang.String r10 = $$c(r10, r14, r13)     // Catch: java.lang.Throwable -> L184d
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L184d
            java.lang.Class[] r10 = new java.lang.Class[]{r10}     // Catch: java.lang.Throwable -> L184d
            java.lang.reflect.Constructor r9 = r9.getDeclaredConstructor(r10)     // Catch: java.lang.Throwable -> L184d
            java.lang.Object r5 = r9.newInstance(r5)     // Catch: java.lang.Throwable -> L184d
            java.lang.Object[] r9 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L1844
            r41 = 356(0x164, float:4.99E-43)
            r10 = r0[r41]     // Catch: java.lang.Throwable -> L1844
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1844
            r13 = r0[r20]     // Catch: java.lang.Throwable -> L1844
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1844
            java.lang.String r10 = $$c(r10, r13, r12)     // Catch: java.lang.Throwable -> L1844
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L1844
            r13 = r0[r23]     // Catch: java.lang.Throwable -> L1844
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1844
            r14 = 198(0xc6, float:2.77E-43)
            r14 = r0[r14]     // Catch: java.lang.Throwable -> L1844
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1844
            r15 = 497(0x1f1, float:6.96E-43)
            short r15 = (short) r15     // Catch: java.lang.Throwable -> L1844
            java.lang.String r13 = $$c(r13, r14, r15)     // Catch: java.lang.Throwable -> L1844
            java.lang.Class[] r14 = new java.lang.Class[]{r64}     // Catch: java.lang.Throwable -> L1844
            java.lang.reflect.Method r10 = r10.getMethod(r13, r14)     // Catch: java.lang.Throwable -> L1844
            r10.invoke(r5, r9)     // Catch: java.lang.Throwable -> L1844
            int r9 = com.appsflyer.internal.AFa1hSDK.$10
            int r9 = r9 + 51
            int r9 = r9 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r9
            r41 = 356(0x164, float:4.99E-43)
            r9 = r0[r41]     // Catch: java.lang.Throwable -> L183b
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L183b
            r10 = r0[r20]     // Catch: java.lang.Throwable -> L183b
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L183b
            java.lang.String r9 = $$c(r9, r10, r12)     // Catch: java.lang.Throwable -> L183b
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L183b
            r10 = r0[r25]     // Catch: java.lang.Throwable -> L183b
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L183b
            r0 = r0[r42]     // Catch: java.lang.Throwable -> L183b
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L183b
            r12 = r0 | 344(0x158, float:4.82E-43)
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L183b
            java.lang.String r0 = $$c(r10, r0, r12)     // Catch: java.lang.Throwable -> L183b
            r13 = 0
            java.lang.reflect.Method r0 = r9.getMethod(r0, r13)     // Catch: java.lang.Throwable -> L183b
            r0.invoke(r5, r13)     // Catch: java.lang.Throwable -> L183b
            int r9 = java.lang.Math.abs(r65)     // Catch: java.lang.Throwable -> L1837
            r0 = 13656(0x3558, float:1.9136E-41)
            r12 = r6
            r15 = r62
            r5 = r64
            r26 = 4
            r28 = 6
            r32 = 0
            r6 = r1
            r1 = r2
            r2 = r63
            goto Lbc6
        L1837:
            r0 = move-exception
        L1838:
            r3 = r0
            goto L15f7
        L183b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1837
            if (r1 == 0) goto L1843
            throw r1     // Catch: java.lang.Throwable -> L1837
        L1843:
            throw r0     // Catch: java.lang.Throwable -> L1837
        L1844:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1837
            if (r1 == 0) goto L184c
            throw r1     // Catch: java.lang.Throwable -> L1837
        L184c:
            throw r0     // Catch: java.lang.Throwable -> L1837
        L184d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1837
            if (r1 == 0) goto L1855
            throw r1     // Catch: java.lang.Throwable -> L1837
        L1855:
            throw r0     // Catch: java.lang.Throwable -> L1837
        L1856:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1837
            if (r1 == 0) goto L185e
            throw r1     // Catch: java.lang.Throwable -> L1837
        L185e:
            throw r0     // Catch: java.lang.Throwable -> L1837
        L185f:
            r0 = move-exception
            r8 = r58
            goto L1838
        L1863:
            r8 = r58
            r6 = r59
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L1837
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r3}     // Catch: java.lang.Throwable -> L1837
            r3 = r26
            java.lang.reflect.Constructor r0 = r3.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L1837
            r12 = 1
            r0.setAccessible(r12)     // Catch: java.lang.Throwable -> L1837
            if (r6 != 0) goto L188d
            int r3 = com.appsflyer.internal.AFa1hSDK.$11
            r5 = r3 | 45
            int r5 = r5 << r12
            r3 = r3 ^ 45
            int r5 = r5 - r3
            int r3 = r5 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r3
            r35 = 2
            int r5 = r5 % 2
            if (r5 == 0) goto L188f
        L188d:
            r3 = 0
            goto L1890
        L188f:
            r3 = 1
        L1890:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L1837
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}     // Catch: java.lang.Throwable -> L1837
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L1837
            com.appsflyer.internal.AFa1hSDK.f6282d = r0     // Catch: java.lang.Throwable -> L1837
            r8.close()     // Catch: java.lang.Throwable -> L18b3
            int r0 = com.appsflyer.internal.AFa1hSDK.$11
            int r0 = r0 + 7
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r0
            r1 = r63
            r13 = 7
            r14 = 1
            r37 = 0
            r46 = 26
            goto L1b82
        L18b3:
            r0 = move-exception
            r1 = r63
            r43 = 1
            r46 = 26
            goto L1b60
        L18bc:
            r0 = move-exception
            r8 = r58
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1837 java.lang.Exception -> L18c6
            if (r1 == 0) goto L18c8
            throw r1     // Catch: java.lang.Throwable -> L1837 java.lang.Exception -> L18c6
        L18c6:
            r0 = move-exception
            goto L18d5
        L18c8:
            throw r0     // Catch: java.lang.Throwable -> L1837 java.lang.Exception -> L18c6
        L18c9:
            r0 = move-exception
            r8 = r58
            r40 = 5
            goto L1838
        L18d0:
            r0 = move-exception
            r8 = r58
            r40 = 5
        L18d5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L194e
            r1.<init>()     // Catch: java.lang.Throwable -> L194e
            byte[] r3 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L194e
            r6 = r3[r21]     // Catch: java.lang.Throwable -> L194e
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L194e
            r9 = r3[r42]     // Catch: java.lang.Throwable -> L194e
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L194e
            r10 = r9 | 1016(0x3f8, float:1.424E-42)
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L194e
            java.lang.String r6 = $$c(r6, r9, r10)     // Catch: java.lang.Throwable -> L194e
            r1.append(r6)     // Catch: java.lang.Throwable -> L194e
            r1.append(r5)     // Catch: java.lang.Throwable -> L194e
            r5 = r3[r16]     // Catch: java.lang.Throwable -> L194e
            byte r5 = (byte) r5
            r46 = 26
            r6 = r3[r46]     // Catch: java.lang.Throwable -> L194a
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L194a
            r11 = 291(0x123, float:4.08E-43)
            r9 = r6 ^ 291(0x123, float:4.08E-43)
            r10 = r6 & 291(0x123, float:4.08E-43)
            r9 = r9 | r10
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L194a
            java.lang.String r5 = $$c(r5, r6, r9)     // Catch: java.lang.Throwable -> L194a
            r1.append(r5)     // Catch: java.lang.Throwable -> L194a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L194a
            r13 = 2
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L193b
            r43 = 1
            r5[r43] = r0     // Catch: java.lang.Throwable -> L193b
            r32 = 0
            r5[r32] = r1     // Catch: java.lang.Throwable -> L193b
            r41 = 356(0x164, float:4.99E-43)
            r0 = r3[r41]     // Catch: java.lang.Throwable -> L193b
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L193b
            r1 = r3[r18]     // Catch: java.lang.Throwable -> L193b
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L193b
            r11 = 291(0x123, float:4.08E-43)
            short r3 = (short) r11     // Catch: java.lang.Throwable -> L193b
            java.lang.String r0 = $$c(r0, r1, r3)     // Catch: java.lang.Throwable -> L193b
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L193b
            r1 = r63
            java.lang.Class[] r3 = new java.lang.Class[]{r4, r1}     // Catch: java.lang.Throwable -> L1939
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L1939
            java.lang.Object r0 = r0.newInstance(r5)     // Catch: java.lang.Throwable -> L1939
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L1939
            throw r0     // Catch: java.lang.Throwable -> L1939
        L1939:
            r0 = move-exception
            goto L193e
        L193b:
            r0 = move-exception
            r1 = r63
        L193e:
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L1945
            if (r3 == 0) goto L1949
            throw r3     // Catch: java.lang.Throwable -> L1945
        L1945:
            r0 = move-exception
        L1946:
            r3 = r0
            goto L1ac4
        L1949:
            throw r0     // Catch: java.lang.Throwable -> L1945
        L194a:
            r0 = move-exception
            r1 = r63
            goto L1946
        L194e:
            r0 = move-exception
            r1 = r63
        L1951:
            r46 = 26
            goto L1946
        L1954:
            r0 = move-exception
        L1955:
            r8 = r58
            r1 = r63
        L1959:
            r40 = 5
            goto L1951
        L195c:
            r0 = move-exception
            r8 = r58
            r1 = r63
            r40 = 5
            r46 = 26
            goto L196d
        L1966:
            r0 = move-exception
            r8 = r58
            r1 = r63
            r40 = 5
        L196d:
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L1945
            if (r3 == 0) goto L1974
            throw r3     // Catch: java.lang.Throwable -> L1945
        L1974:
            throw r0     // Catch: java.lang.Throwable -> L1945
        L1975:
            r0 = move-exception
            r64 = r5
            goto L1955
        L1979:
            r0 = move-exception
            r64 = r5
        L197c:
            r8 = r58
            goto L1959
        L197f:
            r0 = move-exception
            r64 = r5
            r8 = r58
            r40 = 5
            goto L1946
        L1987:
            r0 = move-exception
        L1988:
            r64 = r5
            r62 = r15
            goto L197c
        L198d:
            r0 = move-exception
            r64 = r5
            r62 = r15
            r8 = r58
            r40 = 5
            r46 = 26
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L1945
            if (r3 == 0) goto L199f
            throw r3     // Catch: java.lang.Throwable -> L1945
        L199f:
            throw r0     // Catch: java.lang.Throwable -> L1945
        L19a0:
            r0 = move-exception
            r64 = r5
            r62 = r15
            r8 = r58
            r40 = 5
            r46 = 26
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L1945
            if (r3 == 0) goto L19b2
            throw r3     // Catch: java.lang.Throwable -> L1945
        L19b2:
            throw r0     // Catch: java.lang.Throwable -> L1945
        L19b3:
            r0 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
            goto L1988
        L19b8:
            r0 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
            r64 = r5
            r62 = r15
            r8 = r58
        L19c2:
            r40 = 5
            r46 = 26
            r56 = 16
            goto L1946
        L19ca:
            r0 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
            r64 = r5
            r62 = r15
            r8 = r58
        L19d4:
            r40 = 5
            r46 = 26
            r56 = 16
            goto L19f3
        L19db:
            r0 = move-exception
            r40 = r2
            r2 = r1
            r1 = r40
            r64 = r5
            r62 = r15
            goto L19d4
        L19e6:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r62 = r15
            r39 = 3
            goto L19d4
        L19f3:
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L1945
            if (r3 == 0) goto L19fa
            throw r3     // Catch: java.lang.Throwable -> L1945
        L19fa:
            throw r0     // Catch: java.lang.Throwable -> L1945
        L19fb:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
        L1a03:
            r62 = r15
            r39 = 3
            goto L19c2
        L1a08:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r62 = r15
            r39 = 3
        L1a14:
            r40 = 5
            r46 = 26
            r56 = 16
            goto L1a28
        L1a1b:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r39 = r10
            r62 = r15
            goto L1a14
        L1a28:
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L1945
            if (r3 == 0) goto L1a2f
            throw r3     // Catch: java.lang.Throwable -> L1945
        L1a2f:
            throw r0     // Catch: java.lang.Throwable -> L1945
        L1a30:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r62 = r15
            r39 = 3
            r40 = 5
            r46 = 26
            r56 = 16
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L1945
            if (r3 == 0) goto L1a49
            throw r3     // Catch: java.lang.Throwable -> L1945
        L1a49:
            throw r0     // Catch: java.lang.Throwable -> L1945
        L1a4a:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
        L1a52:
            r62 = r15
            r39 = 3
            r40 = 5
            r46 = 26
            r56 = 16
            goto L1a68
        L1a5d:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r54 = r14
            goto L1a52
        L1a68:
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L1945
            if (r3 == 0) goto L1a6f
            throw r3     // Catch: java.lang.Throwable -> L1945
        L1a6f:
            throw r0     // Catch: java.lang.Throwable -> L1945
        L1a70:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
        L1a78:
            r54 = r14
            r62 = r15
            r39 = 3
            r40 = 5
            r46 = 26
            r56 = 16
            goto L1a90
        L1a85:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r44 = r13
            goto L1a78
        L1a90:
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L1945
            if (r3 == 0) goto L1a97
            throw r3     // Catch: java.lang.Throwable -> L1945
        L1a97:
            throw r0     // Catch: java.lang.Throwable -> L1945
        L1a98:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r44 = r13
            r54 = r14
            r62 = r15
            r39 = 3
            r40 = 5
            r46 = 26
            r56 = 16
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L1945
            if (r3 == 0) goto L1ab5
            throw r3     // Catch: java.lang.Throwable -> L1945
        L1ab5:
            throw r0     // Catch: java.lang.Throwable -> L1945
        L1ab6:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r44 = r13
            r54 = r14
            goto L1a03
        L1ac4:
            r8.close()     // Catch: java.lang.Throwable -> L1ac8
            goto L1acc
        L1ac8:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L1acd
        L1acc:
            throw r3     // Catch: java.lang.Throwable -> L1acd
        L1acd:
            r0 = move-exception
        L1ace:
            r43 = 1
            goto L1b60
        L1ad2:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r44 = r13
            r54 = r14
            r62 = r15
            r39 = 3
            r40 = 5
        L1ae4:
            r46 = 26
        L1ae6:
            r56 = 16
            goto L1ace
        L1ae9:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r40 = r9
            r44 = r13
            r54 = r14
            r62 = r15
            r39 = 3
            goto L1ae4
        L1afc:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
        L1b04:
            r44 = r13
            r54 = r14
            r62 = r15
            r39 = 3
            r40 = 5
            goto L1ae6
        L1b0f:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r44 = r13
            r54 = r14
            r62 = r15
            r39 = 3
            r40 = 5
            r46 = 26
            r56 = 16
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L1acd
            if (r3 == 0) goto L1b2c
            throw r3     // Catch: java.lang.Throwable -> L1acd
        L1b2c:
            throw r0     // Catch: java.lang.Throwable -> L1acd
        L1b2d:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r64 = r5
            r44 = r13
            r54 = r14
            r62 = r15
            r39 = 3
            r40 = 5
            r46 = 26
            r56 = 16
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L1acd
            if (r3 == 0) goto L1b4a
            throw r3     // Catch: java.lang.Throwable -> L1acd
        L1b4a:
            throw r0     // Catch: java.lang.Throwable -> L1acd
        L1b4b:
            r0 = move-exception
            r39 = r2
            r2 = r1
            r1 = r39
            r46 = r3
            r64 = r5
            r45 = r6
            r49 = r8
            r47 = r9
            r48 = r10
            r55 = r11
            goto L1b04
        L1b60:
            r3 = r47 & 1
            r5 = r47 | 1
            int r3 = r3 + r5
            r13 = 7
        L1b66:
            if (r3 >= r13) goto L1bab
            boolean r5 = r49[r3]     // Catch: java.lang.Exception -> L1c0c
            if (r5 == 0) goto L1ba4
            int r3 = com.appsflyer.internal.AFa1hSDK.$10
            int r3 = r3 + 105
            int r5 = r3 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r5
            r35 = 2
            int r3 = r3 % 2
            if (r3 == 0) goto L1bab
            r37 = 0
            com.appsflyer.internal.AFa1hSDK.f6282d = r37     // Catch: java.lang.Exception -> L1c0c
            com.appsflyer.internal.AFa1hSDK.f6286w = r37     // Catch: java.lang.Exception -> L1c0c
        L1b80:
            r14 = r54
        L1b82:
            int r0 = r47 + 1
            r3 = r2
            r2 = r1
            r1 = r3
            r12 = r0
            r13 = r44
            r6 = r45
            r3 = r46
            r10 = r48
            r8 = r49
            r11 = r55
            r15 = r62
            r5 = r64
            r9 = 356(0x164, float:4.99E-43)
            r18 = 1
            r26 = 4
            r28 = 6
            r32 = 0
            goto L4b1
        L1ba4:
            r37 = 0
            r43 = 1
            int r3 = r3 + 1
            goto L1b66
        L1bab:
            byte[] r2 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Exception -> L1c0c
            r3 = r2[r21]     // Catch: java.lang.Exception -> L1c0c
            byte r3 = (byte) r3     // Catch: java.lang.Exception -> L1c0c
            r5 = r2[r20]     // Catch: java.lang.Exception -> L1c0c
            byte r5 = (byte) r5     // Catch: java.lang.Exception -> L1c0c
            r6 = 1112(0x458, float:1.558E-42)
            short r6 = (short) r6     // Catch: java.lang.Exception -> L1c0c
            java.lang.String r3 = $$c(r3, r5, r6)     // Catch: java.lang.Exception -> L1c0c
            r8 = 2
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L1be7
            r43 = 1
            r5[r43] = r0     // Catch: java.lang.Throwable -> L1be7
            r32 = 0
            r5[r32] = r3     // Catch: java.lang.Throwable -> L1be7
            r41 = 356(0x164, float:4.99E-43)
            r0 = r2[r41]     // Catch: java.lang.Throwable -> L1be7
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1be7
            r2 = r2[r18]     // Catch: java.lang.Throwable -> L1be7
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1be7
            r11 = 291(0x123, float:4.08E-43)
            short r3 = (short) r11     // Catch: java.lang.Throwable -> L1be7
            java.lang.String r0 = $$c(r0, r2, r3)     // Catch: java.lang.Throwable -> L1be7
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1be7
            java.lang.Class[] r1 = new java.lang.Class[]{r4, r1}     // Catch: java.lang.Throwable -> L1be7
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L1be7
            java.lang.Object r0 = r0.newInstance(r5)     // Catch: java.lang.Throwable -> L1be7
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L1be7
            throw r0     // Catch: java.lang.Throwable -> L1be7
        L1be7:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L1c0c
            if (r1 == 0) goto L1bef
            throw r1     // Catch: java.lang.Exception -> L1c0c
        L1bef:
            throw r0     // Catch: java.lang.Exception -> L1c0c
        L1bf0:
            return
        L1bf1:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L1c0c
            if (r1 == 0) goto L1bf9
            throw r1     // Catch: java.lang.Exception -> L1c0c
        L1bf9:
            throw r0     // Catch: java.lang.Exception -> L1c0c
        L1bfa:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L1c0c
            if (r1 == 0) goto L1c02
            throw r1     // Catch: java.lang.Exception -> L1c0c
        L1c02:
            throw r0     // Catch: java.lang.Exception -> L1c0c
        L1c03:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L1c0c
            if (r1 == 0) goto L1c0b
            throw r1     // Catch: java.lang.Exception -> L1c0c
        L1c0b:
            throw r0     // Catch: java.lang.Exception -> L1c0c
        L1c0c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L1c13:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L1c1b
            throw r1
        L1c1b:
            throw r0
    }

    private AFa1hSDK() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void AFAdRevenueData(int r0, int r1) {
            int r0 = com.appsflyer.internal.AFa1hSDK.$10
            r1 = r0 ^ 47
            r0 = r0 & 47
            int r0 = r0 << 1
            int r1 = r1 + r0
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r1
            return
    }

    public static int getCurrencyIso4217Code(int r6) {
            int r0 = com.appsflyer.internal.AFa1hSDK.$10
            r1 = r0 & 107(0x6b, float:1.5E-43)
            r0 = r0 | 107(0x6b, float:1.5E-43)
            int r1 = r1 + r0
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r1
            java.lang.Object r0 = com.appsflyer.internal.AFa1hSDK.f6282d
            int r1 = r1 + 37
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L68
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L68
            byte[] r1 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L68
            r2 = 200(0xc8, float:2.8E-43)
            r2 = r1[r2]     // Catch: java.lang.Throwable -> L68
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L68
            r3 = 175(0xaf, float:2.45E-43)
            r3 = r1[r3]     // Catch: java.lang.Throwable -> L68
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L68
            r4 = r3 ^ 530(0x212, float:7.43E-43)
            r5 = r3 & 530(0x212, float:7.43E-43)
            r4 = r4 | r5
            short r4 = (short) r4     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = $$c(r2, r3, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = com.appsflyer.internal.AFa1hSDK.f6286w     // Catch: java.lang.Throwable -> L68
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3     // Catch: java.lang.Throwable -> L68
            r4 = 1
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch: java.lang.Throwable -> L68
            r3 = 13
            r3 = r1[r3]     // Catch: java.lang.Throwable -> L68
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L68
            r4 = 282(0x11a, float:3.95E-43)
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L68
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L68
            r4 = 594(0x252, float:8.32E-43)
            short r4 = (short) r4     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = $$c(r3, r1, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L68
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L68
            java.lang.reflect.Method r1 = r2.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r6 = r1.invoke(r0, r6)     // Catch: java.lang.Throwable -> L68
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L68
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L68
            int r0 = com.appsflyer.internal.AFa1hSDK.$11
            int r0 = r0 + 109
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r0
            return r6
        L68:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()
            if (r0 == 0) goto L70
            throw r0
        L70:
            throw r6
    }

    public static int getCurrencyIso4217Code(java.lang.Object r6) {
            int r0 = com.appsflyer.internal.AFa1hSDK.$10
            r1 = r0 & 69
            r0 = r0 | 69
            int r1 = r1 + r0
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r1
            java.lang.Object r0 = com.appsflyer.internal.AFa1hSDK.f6282d
            int r1 = r1 + 73
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r1
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L6f
            byte[] r1 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> L6f
            r2 = 200(0xc8, float:2.8E-43)
            r2 = r1[r2]     // Catch: java.lang.Throwable -> L6f
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L6f
            r3 = 175(0xaf, float:2.45E-43)
            r3 = r1[r3]     // Catch: java.lang.Throwable -> L6f
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L6f
            r4 = r3 ^ 530(0x212, float:7.43E-43)
            r5 = r3 & 530(0x212, float:7.43E-43)
            r4 = r4 | r5
            short r4 = (short) r4     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = $$c(r2, r3, r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r3 = com.appsflyer.internal.AFa1hSDK.f6286w     // Catch: java.lang.Throwable -> L6f
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3     // Catch: java.lang.Throwable -> L6f
            r4 = 1
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch: java.lang.Throwable -> L6f
            r3 = 188(0xbc, float:2.63E-43)
            r3 = r1[r3]     // Catch: java.lang.Throwable -> L6f
            int r3 = -r3
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L6f
            r5 = 43
            r1 = r1[r5]     // Catch: java.lang.Throwable -> L6f
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L6f
            r5 = 1152(0x480, float:1.614E-42)
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = $$c(r3, r1, r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L6f
            java.lang.reflect.Method r1 = r2.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r1.invoke(r0, r6)     // Catch: java.lang.Throwable -> L6f
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L6f
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L6f
            int r0 = com.appsflyer.internal.AFa1hSDK.$11
            r1 = r0 ^ 15
            r0 = r0 & 15
            int r0 = r0 << r4
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L6d
            return r6
        L6d:
            r6 = 0
            throw r6
        L6f:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()
            if (r0 == 0) goto L77
            throw r0
        L77:
            throw r6
    }

    public static java.lang.Object getMediationNetwork(int r9, char r10, int r11) {
            r0 = 145914257(0x8b27991, float:1.0741565E-33)
            r1 = r0 ^ r9
            r0 = r0 & r9
            r0 = r0 | r1
            int r0 = ~r0
            r1 = 323747904(0x134c0040, float:2.5748543E-27)
            r2 = r1 ^ r0
            r0 = r0 & r1
            r0 = r0 | r2
            int r1 = ~r9
            r2 = 467538112(0x1bde10c0, float:3.6737644E-22)
            r3 = r1 ^ r2
            r4 = r1 & r2
            r3 = r3 | r4
            r4 = -145914258(0xfffffffff74d866e, float:-4.1685446E33)
            r5 = r3 ^ r4
            r6 = r3 & r4
            r5 = r5 | r6
            int r5 = ~r5
            r6 = r0 ^ r5
            r0 = r0 & r5
            r0 = r0 | r6
            int r0 = r0 * 886
            int r0 = ~r0
            r5 = 301483897(0x11f84779, float:3.917155E-28)
            int r5 = r5 - r0
            int r0 = ~r9
            r4 = r4 | r0
            int r4 = ~r4
            r2 = r2 | r4
            int r2 = r2 * (-1772)
            int r2 = -r2
            int r2 = -r2
            r4 = r5 & r2
            r2 = r2 | r5
            int r4 = r4 + r2
            int r2 = ~r3
            int r2 = r2 * 886
            r3 = r4 & r2
            r2 = r2 | r4
            int r3 = r3 + r2
            r2 = -893855165(0xffffffffcab8da43, float:-6057249.5)
            r2 = r2 | r1
            int r2 = ~r2
            r4 = 620896644(0x25022184, float:1.1287058E-16)
            r5 = r4 ^ r2
            r2 = r2 & r4
            r2 = r2 | r5
            int r2 = r2 * (-1188)
            int r2 = -r2
            int r2 = -r2
            int r2 = ~r2
            r5 = 1986690504(0x766a7dc8, float:1.1890123E33)
            int r5 = r5 - r2
            r2 = 893855164(0x354725bc, float:7.418819E-7)
            r6 = r2 | r9
            int r6 = ~r6
            r4 = r4 | r6
            r6 = -444454522(0xffffffffe5822986, float:-7.68342E22)
            r7 = r1 | r6
            int r7 = ~r7
            r4 = r4 | r7
            int r4 = r4 * 594
            int r4 = -r4
            int r4 = -r4
            r7 = r5 | r4
            r8 = 1
            int r7 = r7 << r8
            r4 = r4 ^ r5
            int r7 = r7 - r4
            r4 = r2 ^ r0
            r0 = r0 & r2
            r0 = r0 | r4
            int r0 = ~r0
            r2 = 171496001(0xa38d241, float:8.898822E-33)
            r4 = r0 ^ r2
            r0 = r0 & r2
            r0 = r0 | r4
            r2 = r1 ^ r6
            r1 = r1 & r6
            r1 = r1 | r2
            int r1 = ~r1
            r2 = r0 ^ r1
            r0 = r0 & r1
            r0 = r0 | r2
            int r0 = r0 * 594
            int r7 = r7 + r0
            if (r3 <= r7) goto Lf8
            java.lang.Object r0 = com.appsflyer.internal.AFa1hSDK.f6282d
            int r1 = com.appsflyer.internal.AFa1hSDK.$10
            int r1 = r1 + 97
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r1
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lef
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lef
            r2 = 2
            r1[r2] = r11     // Catch: java.lang.Throwable -> Lef
            java.lang.Character r10 = java.lang.Character.valueOf(r10)     // Catch: java.lang.Throwable -> Lef
            r1[r8] = r10     // Catch: java.lang.Throwable -> Lef
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lef
            r10 = 0
            r1[r10] = r9     // Catch: java.lang.Throwable -> Lef
            byte[] r9 = com.appsflyer.internal.AFa1hSDK.$$a     // Catch: java.lang.Throwable -> Lef
            r10 = 200(0xc8, float:2.8E-43)
            r10 = r9[r10]     // Catch: java.lang.Throwable -> Lef
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> Lef
            r11 = 175(0xaf, float:2.45E-43)
            r11 = r9[r11]     // Catch: java.lang.Throwable -> Lef
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> Lef
            r2 = r11 ^ 530(0x212, float:7.43E-43)
            r3 = r11 & 530(0x212, float:7.43E-43)
            r2 = r2 | r3
            short r2 = (short) r2     // Catch: java.lang.Throwable -> Lef
            java.lang.String r10 = $$c(r10, r11, r2)     // Catch: java.lang.Throwable -> Lef
            java.lang.Object r11 = com.appsflyer.internal.AFa1hSDK.f6286w     // Catch: java.lang.Throwable -> Lef
            java.lang.ClassLoader r11 = (java.lang.ClassLoader) r11     // Catch: java.lang.Throwable -> Lef
            java.lang.Class r10 = java.lang.Class.forName(r10, r8, r11)     // Catch: java.lang.Throwable -> Lef
            r11 = 13
            r11 = r9[r11]     // Catch: java.lang.Throwable -> Lef
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> Lef
            r2 = 191(0xbf, float:2.68E-43)
            r9 = r9[r2]     // Catch: java.lang.Throwable -> Lef
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> Lef
            r2 = 1134(0x46e, float:1.589E-42)
            short r2 = (short) r2     // Catch: java.lang.Throwable -> Lef
            java.lang.String r9 = $$c(r11, r9, r2)     // Catch: java.lang.Throwable -> Lef
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lef
            java.lang.Class r2 = java.lang.Character.TYPE     // Catch: java.lang.Throwable -> Lef
            java.lang.Class[] r11 = new java.lang.Class[]{r11, r2, r11}     // Catch: java.lang.Throwable -> Lef
            java.lang.reflect.Method r9 = r10.getMethod(r9, r11)     // Catch: java.lang.Throwable -> Lef
            java.lang.Object r9 = r9.invoke(r0, r1)     // Catch: java.lang.Throwable -> Lef
            int r10 = com.appsflyer.internal.AFa1hSDK.$10
            int r10 = r10 + 39
            int r10 = r10 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r10
            return r9
        Lef:
            r9 = move-exception
            java.lang.Throwable r10 = r9.getCause()
            if (r10 == 0) goto Lf7
            throw r10
        Lf7:
            throw r9
        Lf8:
            r9 = 0
            throw r9
    }

    public static void init$0() {
            int r0 = com.appsflyer.internal.AFa1hSDK.$10
            int r0 = r0 + 121
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1hSDK.$11 = r0
            r0 = 1171(0x493, float:1.641E-42)
            byte[] r1 = new byte[r0]
            java.lang.String r2 = ".1*\u0095ò\tñ\u0002\u0005\u00045Æô\u0010ð\u0007þ\u0005ïDêÓ\u0002üü\f\u0000ó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0¶&\u000eø÷ÿó\u0001>Ìðÿü\fùò\u0013òò\tñ\u0002\u0005\u00045ÌðÿAìÝî\nò\fôú$ëõ\f\u0003üí\u0002ÿ\föù2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000ò\tñ\u0002\u0005\u00045ÌðÿAìÐÿ(Úü\f\u0000ôø\u0001ð*Ú\u0004ô\n\u0007ô*Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\u0001ð-Üü\u0006ñ.Úö\u0001ð0Ó\nþ!áýú\u0002 Úö\u0001ð0áýú\u0002 ÚöÊ\u0002ì\u00121Ê\u0002ì\u00121\bê\u00142Äù@çÜü\u0006\bê\u00142Äù@¹\u0006ü\u000búö\bê\u00142Á\nò\u00068ÚÙ\u0005þ\u000e÷\u0001ð#Ý\u0002þ\nòýúó\nþ\u0005û\u0001ýú\u0002ò\tñ\u0002\u0005\u00045¾ûDëÌ\u000bü\u0007?Í\u0010òþ\tù\u0000\u000eøë\u0015úù\u0001ò\u0016ä\bô\u000e\u0014ù\u0015÷\bê\u00142Äù@äù\tÌ\u0014ýôû\nù\u0000í\u0002ÿ\föù\u001fêû\u0007\u0017ãüÿ\u0002õ\bê\u00142Äù@çÜü\u0006\u0015Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003óöüû\r\u0014ü\u0012÷Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<Ëÿ/\u0000Î\u0000)\u0001ÿÏ/\u0002Ïþ.üÖ3\u0001ð!ìñ\u0003ù\u0002\u000eý\bê\u00142¿\bðEØ\u0002\u0005\u0001ð#îì\u000b\bê\u00142Äù@ëÌ\u000eÿ\u0000ò\f\u0000\u001aÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@äÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@éâì\u0012\u0017Úýú\u0000 Þ\u0001\f\u0003ó\f\u0003ü\u001dÐ\bÿò\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç/Úýú\u0000 Þ\u0001\f\u0003óó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúÚ9À\u001c\u000eøó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúã0¶&\u000eø÷ÿ\u0001ð0Í\u0002ÿ\fö\né/Õ\u0003:\u0001\u0000ùóÓ\nþ\u0007\u0001ø\f\u0003ü\rð!ì\u0003ü\u0014à\u0001ò\u0014û\u0013÷\u0004\bô\u000e\u0001ð-\u0001\bê\u00142Äù@çÜü\u0006 Þñ\u000fð\bøû\u0004üù\n\n\u0002ôõ\fý<ºù\u0005þ\u000e÷>éÞì1Üü\u0006ü\rü\u001fÞì\u0001ð2Þî\u0003\u0002ö\u0000\u000e\u0014îì\u000bþø\u0006ð\u000e\u0001ð0Ö\níÿ&Ü\rüþò\bê\u00142¸\u0000\nü=³\u0010øAÓðø&Úýú\u0000 Þ\u0001\f\u0003ó\u0001ð%èì\u0003.Öù\u0001ø\bê\u00142¸\u0000\nü=³\u0010øAÓðø*Öù\u0001ø\u0001ð éî\u0014\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç)Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003ó\u0004,È\u0004\u000e#Îÿ\u0010ç\bê\u00142Äù@êÖüû\r\u0003þõ\u0006\u0002ôõ\fý<ºù\u0005þ\u000e÷>äÚ ç÷ýüø4Þì4Ö\níÿ&Ü\rüþò\bê\u00142¿\u0004ù@ëÈ\u0004\u000e\"Ì\u000eÿ\u0000ò\bê\u00142Á\nò\u00068êÖ\níÿ&Ü\rüþò\u0004\u0010ð\u0002ôõ\fý<ºù\u0005þ\u000e÷>ëàí\r Þì4Ö\níÿ&Ü\rüþò\u000eì\u000b\u001bâõþ\fì\nò\u0010\u0018â\u0006ï\u0010îø4Úö\f\u0001î\u0004ü\b\u0003ñ\fì\nò\u0010\u0018â\u0006ï\u0010îø(îì\u000b\"Ø\u0006÷\u0007öù\u0000\u0001ð0Ó\u0001ü\u0000\u0000\böù\u001fÚ\b\n\u0014÷\u0017÷ü\rü Ö\níÿó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúä/È\u0014\u000eø&¯Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<ûÍ.Ð,Ö(Ö(\u0002Ï3Ïÿÿ.Ï4\u0014ø\u0016÷¹þN¹\u0004ôÿ\t\u0000ý÷÷R³\u0006þñJ\u0001ð&ç\u0000ú\u0007ì\nù\u0000\u001fèðü\u0007ü\u0006ú\u0004Ü\u0011ìî\u0010öø\u000f âì\u0012"
            java.lang.String r3 = "ISO-8859-1"
            byte[] r2 = r2.getBytes(r3)
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            com.appsflyer.internal.AFa1hSDK.$$a = r1
            r0 = 174(0xae, float:2.44E-43)
            com.appsflyer.internal.AFa1hSDK.$$b = r0
            int r0 = com.appsflyer.internal.AFa1hSDK.$11
            int r0 = r0 + 69
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1hSDK.$10 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L2b
            return
        L2b:
            r0 = 0
            throw r0
    }
}
