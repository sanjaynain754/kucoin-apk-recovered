package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public class AFi1jSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final java.util.Map AFInAppEventParameterName = null;
    private static long afDebugLog;
    private static int afErrorLog;
    private static byte afErrorLogForExcManagerOnly;
    private static long afInfoLog;

    /* JADX INFO: renamed from: d */
    public static final java.util.Map f6302d = null;

    /* JADX INFO: renamed from: e */
    private static java.lang.Object f6303e;
    private static long force;

    /* JADX INFO: renamed from: i */
    private static java.lang.Object f6304i;
    private static byte[] unregisterClient;

    /* JADX INFO: renamed from: v */
    private static int f6305v;

    /* JADX INFO: renamed from: w */
    private static byte[] f6306w;

    private static java.lang.String $$c(int r6, int r7, short r8) {
            int r0 = com.appsflyer.internal.AFi1jSDK.$12
            int r0 = r0 + 89
            int r1 = r0 % 128
            com.appsflyer.internal.AFi1jSDK.$13 = r1
            int r0 = r0 % 2
            r2 = -1
            if (r0 != 0) goto L1c
            int r8 = r8 + 48
            byte[] r0 = com.appsflyer.internal.AFi1jSDK.$$a
            int r3 = r6 + 83
            int r7 = r7 + 41
            byte[] r3 = new byte[r3]
            int r6 = r6 + 110
            if (r0 != 0) goto L39
            goto L28
        L1c:
            int r8 = r8 + 33
            byte[] r0 = com.appsflyer.internal.AFi1jSDK.$$a
            int r3 = r6 + 1
            int r7 = r7 + 4
            byte[] r3 = new byte[r3]
            if (r0 != 0) goto L39
        L28:
            int r1 = r1 + 37
            int r4 = r1 % 128
            com.appsflyer.internal.AFi1jSDK.$12 = r4
            int r1 = r1 % 2
            if (r1 != 0) goto L37
            r1 = r0
            r0 = r8
            r8 = r7
            r7 = r6
            goto L4f
        L37:
            r6 = 0
            throw r6
        L39:
            int r2 = r2 + 1
            byte r1 = (byte) r8
            r3[r2] = r1
            if (r2 != r6) goto L47
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r3, r7)
            return r6
        L47:
            r1 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r8
            r8 = r5
        L4f:
            int r6 = -r6
            int r0 = r0 + r6
            int r6 = r0 + (-3)
            int r8 = r8 + 1
            r0 = r8
            r8 = r6
            r6 = r7
            r7 = r0
            r0 = r1
            goto L39
    }

    static {
            r6 = 324(0x144, float:4.54E-43)
            r7 = 0
            r14 = 9
            r15 = 1
            r16 = 609(0x261, float:8.53E-43)
            r17 = -5
            java.lang.Class<byte[]> r2 = byte[].class
            init$0()
            r18 = 85
            r3 = 3
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2140
            r19 = 189(0xbd, float:2.65E-43)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)     // Catch: java.lang.Throwable -> L2140
            r20 = 39
            r4 = 2
            r0[r4] = r19     // Catch: java.lang.Throwable -> L2140
            r19 = 251(0xfb, float:3.52E-43)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)     // Catch: java.lang.Throwable -> L2140
            r0[r15] = r19     // Catch: java.lang.Throwable -> L2140
            r19 = 64
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)     // Catch: java.lang.Throwable -> L2140
            r0[r7] = r19     // Catch: java.lang.Throwable -> L2140
            byte[] r19 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L2140
            r21 = 287(0x11f, float:4.02E-43)
            r5 = r19[r6]     // Catch: java.lang.Throwable -> L2140
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L2140
            r22 = r6
            r6 = 7
            r23 = 20
            r8 = r19[r6]     // Catch: java.lang.Throwable -> L2140
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L2140
            r24 = 8
            r9 = r19[r20]     // Catch: java.lang.Throwable -> L2140
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L2140
            java.lang.String r5 = $$c(r5, r8, r9)     // Catch: java.lang.Throwable -> L2140
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L2140
            r8 = r19[r14]     // Catch: java.lang.Throwable -> L2140
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L2140
            r9 = r19[r22]     // Catch: java.lang.Throwable -> L2140
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L2140
            r25 = 1141(0x475, float:1.599E-42)
            r26 = 91
            r13 = r19[r25]     // Catch: java.lang.Throwable -> L2140
            r27 = r2
            r25 = 4
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2140
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L2140
            int r2 = r13 * 85
            r28 = r18 | r2
            int r28 = r28 << 1
            r2 = r18 ^ r2
            int r28 = r28 - r2
            int r2 = ~r13     // Catch: java.lang.Throwable -> L2140
            r29 = -2
            r30 = 16
            r10 = r29 | r2
            int r10 = ~r10     // Catch: java.lang.Throwable -> L2140
            r31 = r3
            int r3 = ~r1     // Catch: java.lang.Throwable -> L2140
            r32 = r15
            r15 = r29 | r3
            int r15 = ~r15     // Catch: java.lang.Throwable -> L2140
            r33 = r10 ^ r15
            r10 = r10 & r15
            r10 = r33 | r10
            int r15 = ~r1     // Catch: java.lang.Throwable -> L2140
            r33 = r2 ^ r15
            r34 = r2 & r15
            r11 = r33 | r34
            int r11 = ~r11     // Catch: java.lang.Throwable -> L2140
            r10 = r10 | r11
            r11 = r13 ^ 1
            r33 = r13 & 1
            r11 = r11 | r33
            r33 = r11 ^ r1
            r34 = r11 & r1
            r12 = r33 | r34
            int r12 = ~r12     // Catch: java.lang.Throwable -> L2140
            r33 = r10 ^ r12
            r10 = r10 & r12
            r10 = r33 | r10
            int r10 = r10 * (-84)
            int r10 = -r10
            int r10 = -r10
            int r10 = ~r10     // Catch: java.lang.Throwable -> L2140
            int r28 = r28 - r10
            int r28 = r28 + (-1)
            r10 = r2 ^ r1
            r1 = r1 & r2
            r1 = r1 | r10
            int r1 = ~r1     // Catch: java.lang.Throwable -> L2140
            r1 = r1 | 1
            r2 = r3 ^ r13
            r3 = r3 & r13
            r2 = r2 | r3
            int r2 = ~r2     // Catch: java.lang.Throwable -> L2140
            r1 = r1 | r2
            int r1 = r1 * (-84)
            int r1 = ~r1     // Catch: java.lang.Throwable -> L2140
            int r28 = r28 - r1
            int r28 = r28 + (-1)
            r1 = r15 ^ r13
            r2 = r15 & r13
            r1 = r1 | r2
            int r1 = ~r1     // Catch: java.lang.Throwable -> L2140
            int r2 = ~r11     // Catch: java.lang.Throwable -> L2140
            r1 = r1 | r2
            int r1 = r1 * 84
            r2 = r28 ^ r1
            r1 = r28 & r1
            int r1 = r1 << 1
            int r2 = r2 + r1
            byte r1 = (byte) r2     // Catch: java.lang.Throwable -> L2140
            java.lang.String r1 = $$c(r8, r9, r1)     // Catch: java.lang.Throwable -> L2140
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L2140
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r2, r2}     // Catch: java.lang.Throwable -> L2140
            java.lang.reflect.Method r1 = r5.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L2140
            r2 = 0
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch: java.lang.Throwable -> L2140
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L2140
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L2140
            r1 = 2104950267(0x7d76fdfb, float:2.0519302E37)
            r1 = r1 | r0
            int r1 = r1 * (-627)
            r3 = 1281319200(0x4c5f6120, float:5.855757E7)
            r5 = r3 | r1
            int r5 = r5 << 1
            r1 = r1 ^ r3
            int r5 = r5 - r1
            r1 = -291523812(0xffffffffee9fb31c, float:-2.4712323E28)
            r3 = r1 ^ r0
            r1 = r1 & r0
            r1 = r1 | r3
            int r1 = ~r1
            r3 = -2088172027(0xffffffff83890605, float:-8.053518E-37)
            r8 = r3 ^ r1
            r1 = r1 & r3
            r1 = r1 | r8
            int r1 = r1 * (-627)
            int r5 = r5 + r1
            int r1 = ~r0
            r8 = 291523811(0x11604ce3, float:1.7694177E-28)
            r1 = r1 | r8
            int r1 = ~r1
            r8 = r3 ^ r0
            r0 = r0 & r3
            r0 = r0 | r8
            int r0 = ~r0
            r0 = r0 | r1
            int r0 = r0 * 627
            r1 = r5 | r0
            int r1 = r1 << 1
            r0 = r0 ^ r5
            int r1 = r1 - r0
            if (r1 != 0) goto L11b
            goto L211d
        L11b:
            r0 = -4812845759188874554(0xbd35564814cd4ac6, double:-7.580438453908188E-14)
            com.appsflyer.internal.AFi1jSDK.afDebugLog = r0
            r0 = 74
            com.appsflyer.internal.AFi1jSDK.afErrorLogForExcManagerOnly = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.appsflyer.internal.AFi1jSDK.AFInAppEventParameterName = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.appsflyer.internal.AFi1jSDK.f6302d = r0
            r0 = 904(0x388, float:1.267E-42)
            r0 = r19[r0]     // Catch: java.lang.Exception -> L2139
            byte r0 = (byte) r0     // Catch: java.lang.Exception -> L2139
            r1 = r19[r26]     // Catch: java.lang.Exception -> L2139
            int r1 = -r1
            short r1 = (short) r1     // Catch: java.lang.Exception -> L2139
            int r3 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Exception -> L2139
            byte r5 = (byte) r3     // Catch: java.lang.Exception -> L2139
            java.lang.String r1 = $$c(r0, r1, r5)     // Catch: java.lang.Exception -> L2139
            java.lang.Object r0 = com.appsflyer.internal.AFi1jSDK.f6303e     // Catch: java.lang.Exception -> L2139
            if (r0 != 0) goto L158
            r0 = 43
            r0 = r19[r0]     // Catch: java.lang.Exception -> L2139
            byte r0 = (byte) r0     // Catch: java.lang.Exception -> L2139
            r5 = 570(0x23a, float:7.99E-43)
            r5 = r19[r5]     // Catch: java.lang.Exception -> L2139
            short r5 = (short) r5     // Catch: java.lang.Exception -> L2139
            byte r8 = (byte) r3     // Catch: java.lang.Exception -> L2139
            java.lang.String r0 = $$c(r0, r5, r8)     // Catch: java.lang.Exception -> L2139
            goto L159
        L158:
            r0 = r2
        L159:
            r5 = 967(0x3c7, float:1.355E-42)
            r8 = 426(0x1aa, float:5.97E-43)
            r5 = r19[r5]     // Catch: java.lang.Exception -> L188
            byte r5 = (byte) r5     // Catch: java.lang.Exception -> L188
            r9 = r19[r8]     // Catch: java.lang.Exception -> L188
            short r9 = (short) r9     // Catch: java.lang.Exception -> L188
            r10 = r19[r20]     // Catch: java.lang.Exception -> L188
            byte r10 = (byte) r10     // Catch: java.lang.Exception -> L188
            java.lang.String r5 = $$c(r5, r9, r10)     // Catch: java.lang.Exception -> L188
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L188
            r9 = 37
            r9 = r19[r9]     // Catch: java.lang.Exception -> L188
            byte r9 = (byte) r9     // Catch: java.lang.Exception -> L188
            r10 = 92
            short r10 = (short) r10     // Catch: java.lang.Exception -> L188
            byte r3 = (byte) r3     // Catch: java.lang.Exception -> L188
            java.lang.String r3 = $$c(r9, r10, r3)     // Catch: java.lang.Exception -> L188
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L188
            java.lang.reflect.Method r3 = r5.getMethod(r3, r9)     // Catch: java.lang.Exception -> L188
            java.lang.Object r3 = r3.invoke(r2, r2)     // Catch: java.lang.Exception -> L188
            if (r3 == 0) goto L189
            goto L1f0
        L188:
            r3 = r2
        L189:
            byte[] r5 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Exception -> L1f0
            r9 = r5[r22]     // Catch: java.lang.Exception -> L1f0
            byte r9 = (byte) r9     // Catch: java.lang.Exception -> L1f0
            r10 = 109(0x6d, float:1.53E-43)
            short r10 = (short) r10     // Catch: java.lang.Exception -> L1f0
            r11 = r5[r20]     // Catch: java.lang.Exception -> L1f0
            byte r11 = (byte) r11     // Catch: java.lang.Exception -> L1f0
            java.lang.String r9 = $$c(r9, r10, r11)     // Catch: java.lang.Exception -> L1f0
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Exception -> L1f0
            r5 = r5[r21]     // Catch: java.lang.Exception -> L1f0
            byte r5 = (byte) r5     // Catch: java.lang.Exception -> L1f0
            r10 = 130(0x82, float:1.82E-43)
            short r10 = (short) r10     // Catch: java.lang.Exception -> L1f0
            int r11 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Exception -> L1f0
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1f0
            int r12 = (int) r12     // Catch: java.lang.Exception -> L1f0
            int r13 = r11 * (-929)
            r15 = -1856(0xfffffffffffff8c0, float:NaN)
            int r15 = r15 + r13
            r13 = r11 ^ r12
            r19 = r11 & r12
            r13 = r13 | r19
            int r8 = ~r13     // Catch: java.lang.Exception -> L1f0
            r28 = r17 ^ r8
            r8 = r17 & r8
            r8 = r28 | r8
            int r8 = r8 * (-465)
            int r15 = r15 + r8
            r8 = r17 ^ r12
            r12 = r17 & r12
            r8 = r8 | r12
            int r8 = ~r8     // Catch: java.lang.Exception -> L1f0
            r12 = r11 ^ r8
            r8 = r8 & r11
            r8 = r8 | r12
            int r8 = r8 * 930
            int r8 = -r8
            int r8 = -r8
            r11 = r15 | r8
            int r11 = r11 << 1
            r8 = r8 ^ r15
            int r11 = r11 - r8
            r8 = r13 ^ (-5)
            r12 = r13 & (-5)
            r8 = r8 | r12
            int r8 = r8 * 465
            int r8 = -r8
            int r8 = -r8
            r12 = r11 ^ r8
            r8 = r8 & r11
            int r8 = r8 << 1
            int r12 = r12 + r8
            byte r8 = (byte) r12     // Catch: java.lang.Exception -> L1f0
            java.lang.String r5 = $$c(r5, r10, r8)     // Catch: java.lang.Exception -> L1f0
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L1f0
            java.lang.reflect.Method r5 = r9.getMethod(r5, r8)     // Catch: java.lang.Exception -> L1f0
            java.lang.Object r3 = r5.invoke(r2, r2)     // Catch: java.lang.Exception -> L1f0
        L1f0:
            r5 = 34
            if (r3 == 0) goto L262
            java.lang.Class r8 = r3.getClass()     // Catch: java.lang.Exception -> L262
            byte[] r9 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Exception -> L262
            r9 = r9[r5]     // Catch: java.lang.Exception -> L262
            byte r9 = (byte) r9     // Catch: java.lang.Exception -> L262
            r10 = 150(0x96, float:2.1E-43)
            short r10 = (short) r10     // Catch: java.lang.Exception -> L262
            int r11 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Exception -> L262
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L262
            int r12 = (int) r12
            int r13 = r11 * 565
            int r13 = ~r13
            int r13 = (-2253) - r13
            int r15 = ~r11
            r28 = r7
            int r7 = ~r12
            r33 = r15 ^ r7
            r7 = r7 & r15
            r7 = r33 | r7
            int r7 = ~r7
            r15 = r17 ^ r7
            r7 = r17 & r7
            r7 = r7 | r15
            r15 = r11 ^ r12
            r33 = r11 & r12
            r15 = r15 | r33
            int r15 = ~r15
            r33 = r7 ^ r15
            r7 = r7 & r15
            r7 = r33 | r7
            int r7 = r7 * (-564)
            int r7 = -r7
            int r7 = -r7
            int r7 = ~r7
            int r13 = r13 - r7
            int r13 = r13 + (-1)
            r7 = r17 | r11
            r15 = r7 ^ r12
            r7 = r7 & r12
            r7 = r7 | r15
            int r7 = ~r7
            int r7 = r7 * 1128
            int r7 = ~r7
            int r13 = r13 - r7
            int r13 = r13 + (-1)
            int r7 = ~r12
            r12 = r17 ^ r7
            r7 = r17 & r7
            r7 = r7 | r12
            int r7 = ~r7
            r12 = r11 ^ 4
            r11 = r11 & 4
            r11 = r11 | r12
            int r11 = ~r11
            r7 = r7 | r11
            int r7 = r7 * 564
            r11 = r13 ^ r7
            r7 = r7 & r13
            int r7 = r7 << 1
            int r11 = r11 + r7
            byte r7 = (byte) r11
            java.lang.String r7 = $$c(r9, r10, r7)     // Catch: java.lang.Exception -> L260
            java.lang.reflect.Method r7 = r8.getMethod(r7, r2)     // Catch: java.lang.Exception -> L260
            java.lang.Object r7 = r7.invoke(r3, r2)     // Catch: java.lang.Exception -> L260
            goto L265
        L260:
            r7 = r2
            goto L265
        L262:
            r28 = r7
            goto L260
        L265:
            r8 = 13
            if (r3 == 0) goto L2e6
            int r9 = com.appsflyer.internal.AFi1jSDK.$10
            r10 = r9 & 45
            r9 = r9 | 45
            int r10 = r10 + r9
            int r10 = r10 % 128
            com.appsflyer.internal.AFi1jSDK.$11 = r10
            java.lang.Class r9 = r3.getClass()     // Catch: java.lang.Exception -> L2e6
            byte[] r10 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Exception -> L2e6
            r10 = r10[r8]     // Catch: java.lang.Exception -> L2e6
            byte r10 = (byte) r10     // Catch: java.lang.Exception -> L2e6
            r11 = 160(0xa0, float:2.24E-43)
            short r11 = (short) r11     // Catch: java.lang.Exception -> L2e6
            int r12 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Exception -> L2e6
            long r14 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2e6
            int r14 = (int) r14     // Catch: java.lang.Exception -> L2e6
            int r15 = r12 * 382
            r33 = -1520(0xfffffffffffffa10, float:NaN)
            r34 = r33 | r15
            int r34 = r34 << 1
            r15 = r33 ^ r15
            int r34 = r34 - r15
            r15 = r12 | r14
            r33 = r15 ^ (-5)
            r15 = r15 & (-5)
            r15 = r33 | r15
            int r15 = r15 * (-381)
            int r15 = -r15
            int r15 = -r15
            r33 = r34 & r15
            r15 = r34 | r15
            int r33 = r33 + r15
            int r15 = ~r12     // Catch: java.lang.Exception -> L2e6
            r34 = r17 ^ r15
            r15 = r17 & r15
            r15 = r34 | r15
            int r15 = ~r15     // Catch: java.lang.Exception -> L2e6
            int r14 = ~r14     // Catch: java.lang.Exception -> L2e6
            r34 = r14 ^ r12
            r14 = r14 & r12
            r14 = r34 | r14
            int r14 = ~r14     // Catch: java.lang.Exception -> L2e6
            r34 = r15 ^ r14
            r14 = r14 & r15
            r14 = r34 | r14
            r15 = r12 ^ 4
            r34 = r12 & 4
            r15 = r15 | r34
            int r15 = ~r15     // Catch: java.lang.Exception -> L2e6
            r14 = r14 | r15
            int r14 = r14 * 381
            int r14 = -r14
            int r14 = -r14
            r15 = r33 | r14
            int r15 = r15 << 1
            r14 = r33 ^ r14
            int r15 = r15 - r14
            r14 = r17 ^ r12
            r12 = r17 & r12
            r12 = r12 | r14
            int r12 = ~r12     // Catch: java.lang.Exception -> L2e6
            int r12 = r12 * 381
            int r12 = ~r12     // Catch: java.lang.Exception -> L2e6
            int r15 = r15 - r12
            int r15 = r15 + (-1)
            byte r12 = (byte) r15     // Catch: java.lang.Exception -> L2e6
            java.lang.String r10 = $$c(r10, r11, r12)     // Catch: java.lang.Exception -> L2e6
            java.lang.reflect.Method r9 = r9.getMethod(r10, r2)     // Catch: java.lang.Exception -> L2e6
            java.lang.Object r9 = r9.invoke(r3, r2)     // Catch: java.lang.Exception -> L2e6
            goto L2e7
        L2e6:
            r9 = r2
        L2e7:
            if (r3 == 0) goto L31a
            int r10 = com.appsflyer.internal.AFi1jSDK.$11
            r11 = r10 | 43
            int r11 = r11 << 1
            r10 = r10 ^ 43
            int r11 = r11 - r10
            int r11 = r11 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r11
            java.lang.Class r10 = r3.getClass()     // Catch: java.lang.Exception -> L31a
            byte[] r11 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Exception -> L31a
            r11 = r11[r5]     // Catch: java.lang.Exception -> L31a
            byte r11 = (byte) r11     // Catch: java.lang.Exception -> L31a
            r12 = r11 ^ 164(0xa4, float:2.3E-43)
            r14 = r11 & 164(0xa4, float:2.3E-43)
            r12 = r12 | r14
            short r12 = (short) r12     // Catch: java.lang.Exception -> L31a
            int r14 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Exception -> L31a
            r15 = r14 & 4
            r14 = r14 | 4
            int r15 = r15 + r14
            byte r14 = (byte) r15     // Catch: java.lang.Exception -> L31a
            java.lang.String r11 = $$c(r11, r12, r14)     // Catch: java.lang.Exception -> L31a
            java.lang.reflect.Method r10 = r10.getMethod(r11, r2)     // Catch: java.lang.Exception -> L31a
            java.lang.Object r3 = r10.invoke(r3, r2)     // Catch: java.lang.Exception -> L31a
            goto L31b
        L31a:
            r3 = r2
        L31b:
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r11 = 216(0xd8, float:3.03E-43)
            if (r7 == 0) goto L32a
            java.lang.System.currentTimeMillis()
            java.lang.System.currentTimeMillis()
        L327:
            r33 = r8
            goto L375
        L32a:
            if (r0 != 0) goto L32e
            r7 = r2
            goto L327
        L32e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2139
            r7.<init>()     // Catch: java.lang.Exception -> L2139
            byte[] r12 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Exception -> L2139
            r14 = r12[r5]     // Catch: java.lang.Exception -> L2139
            byte r14 = (byte) r14     // Catch: java.lang.Exception -> L2139
            r15 = 184(0xb8, float:2.58E-43)
            short r15 = (short) r15     // Catch: java.lang.Exception -> L2139
            r33 = r8
            r8 = r12[r33]     // Catch: java.lang.Exception -> L2139
            byte r8 = (byte) r8     // Catch: java.lang.Exception -> L2139
            java.lang.String r8 = $$c(r14, r15, r8)     // Catch: java.lang.Exception -> L2139
            r7.append(r8)     // Catch: java.lang.Exception -> L2139
            r7.append(r0)     // Catch: java.lang.Exception -> L2139
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Exception -> L2139
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L2130
            r7 = r12[r32]     // Catch: java.lang.Throwable -> L2130
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L2130
            int r8 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L2130
            r14 = r8 ^ 128(0x80, float:1.8E-43)
            r8 = r8 & 128(0x80, float:1.8E-43)
            r8 = r8 | r14
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L2130
            r12 = r12[r11]     // Catch: java.lang.Throwable -> L2130
            int r12 = -r12
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L2130
            java.lang.String r7 = $$c(r7, r8, r12)     // Catch: java.lang.Throwable -> L2130
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L2130
            java.lang.Class[] r8 = new java.lang.Class[]{r10}     // Catch: java.lang.Throwable -> L2130
            java.lang.reflect.Constructor r7 = r7.getDeclaredConstructor(r8)     // Catch: java.lang.Throwable -> L2130
            java.lang.Object r7 = r7.newInstance(r0)     // Catch: java.lang.Throwable -> L2130
        L375:
            if (r3 == 0) goto L391
            int r0 = com.appsflyer.internal.AFi1jSDK.$11
            r8 = r0 | 29
            int r8 = r8 << 1
            r0 = r0 ^ 29
            int r8 = r8 - r0
            int r0 = r8 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r0
            int r8 = r8 % r4
            if (r8 == 0) goto L38d
            r0 = 3
            int r0 = r0 / 0
            goto L38d
        L38b:
            r0 = move-exception
            throw r0
        L38d:
            r36 = r11
            goto L411
        L391:
            byte[] r0 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Exception -> L2139
            r3 = 670(0x29e, float:9.39E-43)
            r3 = r0[r3]     // Catch: java.lang.Exception -> L2139
            byte r3 = (byte) r3     // Catch: java.lang.Exception -> L2139
            r8 = r3 | 192(0xc0, float:2.69E-43)
            short r8 = (short) r8     // Catch: java.lang.Exception -> L2139
            r12 = r0[r11]     // Catch: java.lang.Exception -> L2139
            int r12 = -r12
            byte r12 = (byte) r12     // Catch: java.lang.Exception -> L2139
            java.lang.String r3 = $$c(r3, r8, r12)     // Catch: java.lang.Exception -> L2139
            int r8 = com.appsflyer.internal.AFi1jSDK.$10
            r12 = r8 | 81
            int r12 = r12 << 1
            r8 = r8 ^ 81
            int r12 = r12 - r8
            int r12 = r12 % 128
            com.appsflyer.internal.AFi1jSDK.$11 = r12
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L2127
            r8 = 1150(0x47e, float:1.611E-42)
            r8 = r0[r8]     // Catch: java.lang.Throwable -> L2127
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L2127
            int r12 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L2127
            r14 = r12 ^ 152(0x98, float:2.13E-43)
            r15 = r12 & 152(0x98, float:2.13E-43)
            r14 = r14 | r15
            short r14 = (short) r14     // Catch: java.lang.Throwable -> L2127
            r15 = r0[r11]     // Catch: java.lang.Throwable -> L2127
            int r15 = -r15
            byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L2127
            java.lang.String r8 = $$c(r8, r14, r15)     // Catch: java.lang.Throwable -> L2127
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L2127
            r14 = r0[r5]     // Catch: java.lang.Throwable -> L2127
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L2127
            r15 = 233(0xe9, float:3.27E-43)
            short r15 = (short) r15     // Catch: java.lang.Throwable -> L2127
            r34 = r12 & 4
            r35 = r12 | 4
            r36 = r11
            int r11 = r34 + r35
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L2127
            java.lang.String r11 = $$c(r14, r15, r11)     // Catch: java.lang.Throwable -> L2127
            java.lang.Class[] r14 = new java.lang.Class[]{r10}     // Catch: java.lang.Throwable -> L2127
            java.lang.reflect.Method r8 = r8.getMethod(r11, r14)     // Catch: java.lang.Throwable -> L2127
            java.lang.Object r3 = r8.invoke(r2, r3)     // Catch: java.lang.Throwable -> L2127
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L211e
            r8 = r0[r32]     // Catch: java.lang.Throwable -> L211e
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L211e
            r11 = r12 ^ 128(0x80, float:1.8E-43)
            r12 = r12 & 128(0x80, float:1.8E-43)
            r11 = r11 | r12
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L211e
            r0 = r0[r36]     // Catch: java.lang.Throwable -> L211e
            int r0 = -r0
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L211e
            java.lang.String r0 = $$c(r8, r11, r0)     // Catch: java.lang.Throwable -> L211e
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L211e
            java.lang.Class[] r8 = new java.lang.Class[]{r10}     // Catch: java.lang.Throwable -> L211e
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r8)     // Catch: java.lang.Throwable -> L211e
            java.lang.Object r3 = r0.newInstance(r3)     // Catch: java.lang.Throwable -> L211e
        L411:
            if (r9 != 0) goto L474
            if (r7 == 0) goto L474
            byte[] r0 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Exception -> L2139
            r8 = 219(0xdb, float:3.07E-43)
            r8 = r0[r8]     // Catch: java.lang.Exception -> L2139
            byte r8 = (byte) r8     // Catch: java.lang.Exception -> L2139
            int r9 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Exception -> L2139
            r11 = r9 ^ 177(0xb1, float:2.48E-43)
            r12 = r9 & 177(0xb1, float:2.48E-43)
            r11 = r11 | r12
            short r11 = (short) r11     // Catch: java.lang.Exception -> L2139
            byte r12 = (byte) r9     // Catch: java.lang.Exception -> L2139
            java.lang.String r8 = $$c(r8, r11, r12)     // Catch: java.lang.Exception -> L2139
            int r11 = com.appsflyer.internal.AFi1jSDK.$10
            int r11 = r11 + 15
            int r11 = r11 % 128
            com.appsflyer.internal.AFi1jSDK.$11 = r11
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L46b
            r11[r32] = r8     // Catch: java.lang.Throwable -> L46b
            r11[r28] = r7     // Catch: java.lang.Throwable -> L46b
            r8 = r0[r32]     // Catch: java.lang.Throwable -> L46b
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L46b
            r12 = r9 | 128(0x80, float:1.8E-43)
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L46b
            r14 = r0[r36]     // Catch: java.lang.Throwable -> L46b
            int r14 = -r14
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L46b
            java.lang.String r8 = $$c(r8, r12, r14)     // Catch: java.lang.Throwable -> L46b
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L46b
            r12 = r0[r32]     // Catch: java.lang.Throwable -> L46b
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L46b
            r14 = r9 ^ 128(0x80, float:1.8E-43)
            r9 = r9 & 128(0x80, float:1.8E-43)
            r9 = r9 | r14
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L46b
            r0 = r0[r36]     // Catch: java.lang.Throwable -> L46b
            int r0 = -r0
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L46b
            java.lang.String r0 = $$c(r12, r9, r0)     // Catch: java.lang.Throwable -> L46b
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L46b
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r10}     // Catch: java.lang.Throwable -> L46b
            java.lang.reflect.Constructor r0 = r8.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L46b
            java.lang.Object r9 = r0.newInstance(r11)     // Catch: java.lang.Throwable -> L46b
            goto L474
        L46b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L2139
            if (r1 == 0) goto L473
            throw r1     // Catch: java.lang.Exception -> L2139
        L473:
            throw r0     // Catch: java.lang.Exception -> L2139
        L474:
            byte[] r0 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Exception -> L2139
            r8 = r0[r32]     // Catch: java.lang.Exception -> L2139
            byte r8 = (byte) r8     // Catch: java.lang.Exception -> L2139
            int r11 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Exception -> L2139
            r12 = r11 ^ 128(0x80, float:1.8E-43)
            r11 = r11 & 128(0x80, float:1.8E-43)
            r11 = r11 | r12
            short r11 = (short) r11     // Catch: java.lang.Exception -> L2139
            r12 = r0[r36]     // Catch: java.lang.Exception -> L2139
            int r12 = -r12
            byte r12 = (byte) r12     // Catch: java.lang.Exception -> L2139
            java.lang.String r8 = $$c(r8, r11, r12)     // Catch: java.lang.Exception -> L2139
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Exception -> L2139
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r6)     // Catch: java.lang.Exception -> L2139
            java.lang.Object[] r8 = (java.lang.Object[]) r8     // Catch: java.lang.Exception -> L2139
            r8[r28] = r2     // Catch: java.lang.Exception -> L2139
            r8[r32] = r9     // Catch: java.lang.Exception -> L2139
            r8[r4] = r7     // Catch: java.lang.Exception -> L2139
            r8[r31] = r3     // Catch: java.lang.Exception -> L2139
            r8[r25] = r9     // Catch: java.lang.Exception -> L2139
            r9 = 5
            r8[r9] = r7     // Catch: java.lang.Exception -> L2139
            r7 = 6
            r8[r7] = r3     // Catch: java.lang.Exception -> L2139
            r3 = 7
            boolean[] r3 = new boolean[r3]     // Catch: java.lang.Exception -> L2139
            r3 = {x214a: FILL_ARRAY_DATA , data: [0, 1, 1, 1, 1, 1, 1} // fill-array     // Catch: java.lang.Exception -> L2139
            r7 = 7
            boolean[] r7 = new boolean[r7]     // Catch: java.lang.Exception -> L2139
            r7 = {x2152: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 1, 1, 1} // fill-array     // Catch: java.lang.Exception -> L2139
            boolean[] r11 = new boolean[r6]     // Catch: java.lang.Exception -> L2139
            r11[r28] = r28     // Catch: java.lang.Exception -> L2139
            r11[r32] = r28     // Catch: java.lang.Exception -> L2139
            r11[r4] = r32     // Catch: java.lang.Exception -> L2139
            r11[r31] = r32     // Catch: java.lang.Exception -> L2139
            r11[r25] = r28     // Catch: java.lang.Exception -> L2139
            r11[r9] = r32     // Catch: java.lang.Exception -> L2139
            r12 = 6
            r11[r12] = r32     // Catch: java.lang.Exception -> L2139
            r12 = r0[r26]     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            int r12 = -r12
            byte r12 = (byte) r12     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            r14 = 252(0xfc, float:3.53E-43)
            short r14 = (short) r14     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            r15 = r0[r20]     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            byte r15 = (byte) r15     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            java.lang.String r12 = $$c(r12, r14, r15)     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            r14 = 198(0xc6, float:2.77E-43)
            r14 = r0[r14]     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            byte r14 = (byte) r14     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            r15 = 275(0x113, float:3.85E-43)
            short r15 = (short) r15     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            r34 = 400(0x190, float:5.6E-43)
            r0 = r0[r34]     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            byte r0 = (byte) r0     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            java.lang.String r0 = $$c(r14, r15, r0)     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            java.lang.reflect.Field r0 = r12.getDeclaredField(r0)     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            int r0 = r0.getInt(r12)     // Catch: java.lang.ClassNotFoundException -> L531 java.lang.Exception -> L2139
            if (r0 < r5) goto L4f0
            r12 = r32
            goto L4f2
        L4f0:
            r12 = r28
        L4f2:
            r14 = 29
            if (r0 != r14) goto L4f7
            goto L4fe
        L4f7:
            r14 = 26
            if (r0 < r14) goto L4fe
            r14 = r32
            goto L500
        L4fe:
            r14 = r28
        L500:
            r11[r28] = r14     // Catch: java.lang.ClassNotFoundException -> L533 java.lang.Exception -> L2139
            r14 = 21
            if (r0 < r14) goto L514
            int r14 = com.appsflyer.internal.AFi1jSDK.$10
            r15 = r14 & 73
            r14 = r14 | 73
            int r15 = r15 + r14
            int r15 = r15 % 128
            com.appsflyer.internal.AFi1jSDK.$11 = r15
            r14 = r32
            goto L516
        L514:
            r14 = r28
        L516:
            r11[r32] = r14     // Catch: java.lang.ClassNotFoundException -> L533 java.lang.Exception -> L2139
            r14 = 21
            if (r0 < r14) goto L52c
            int r0 = com.appsflyer.internal.AFi1jSDK.$10
            r14 = r0 | 59
            int r14 = r14 << 1
            r0 = r0 ^ 59
            int r14 = r14 - r0
            int r14 = r14 % 128
            com.appsflyer.internal.AFi1jSDK.$11 = r14
            r0 = r32
            goto L52e
        L52c:
            r0 = r28
        L52e:
            r11[r25] = r0     // Catch: java.lang.ClassNotFoundException -> L533 java.lang.Exception -> L2139
            goto L533
        L531:
            r12 = r28
        L533:
            r14 = r28
            r15 = r14
        L536:
            if (r14 != 0) goto L211d
            int r0 = com.appsflyer.internal.AFi1jSDK.$11
            r34 = r0 | 55
            int r34 = r34 << 1
            r35 = r0 ^ 55
            r37 = r5
            int r5 = r34 - r35
            int r5 = r5 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r5
            r13 = 9
            if (r15 >= r13) goto L211d
            boolean r5 = r11[r15]     // Catch: java.lang.Exception -> L2139
            if (r5 == 0) goto L20d5
            r34 = 200(0xc8, float:2.8E-43)
            boolean r35 = r3[r15]     // Catch: java.lang.Throwable -> L2020
            r38 = 616(0x268, float:8.63E-43)
            r5 = r8[r15]     // Catch: java.lang.Throwable -> L2012
            boolean r39 = r7[r15]     // Catch: java.lang.Throwable -> L2012
            r40 = 25
            r41 = 159(0x9f, float:2.23E-43)
            if (r35 == 0) goto L656
            r42 = r0 ^ 85
            r0 = r0 & 85
            int r0 = r0 << 1
            int r0 = r42 + r0
            int r13 = r0 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r13
            int r0 = r0 % r4
            if (r0 == 0) goto L59a
            r0 = 74
            int r0 = r0 / 0
            if (r5 == 0) goto L576
            goto L59c
        L576:
            r45 = r4
            r43 = r6
            r44 = r9
            goto L5f8
        L57e:
            r0 = move-exception
            r50 = r1
            r48 = r3
            r43 = r6
            r52 = r7
            r51 = r8
            r44 = r9
        L58b:
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            goto L203e
        L59a:
            if (r5 == 0) goto L576
        L59c:
            byte[] r0 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L5e0
            r13 = r0[r32]     // Catch: java.lang.Throwable -> L5e0
            byte r13 = (byte) r13
            r43 = r6
            int r6 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L5da
            r44 = r9
            r9 = r6 ^ 128(0x80, float:1.8E-43)
            r45 = r4
            r4 = r6 & 128(0x80, float:1.8E-43)
            r4 = r4 | r9
            short r4 = (short) r4
            r9 = r0[r36]     // Catch: java.lang.Throwable -> L5d8
            int r9 = -r9
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L5d8
            java.lang.String r4 = $$c(r13, r4, r9)     // Catch: java.lang.Throwable -> L5d8
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L5d8
            r0 = r0[r44]     // Catch: java.lang.Throwable -> L5d8
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L5d8
            r9 = 281(0x119, float:3.94E-43)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L5d8
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L5d8
            java.lang.String r0 = $$c(r0, r9, r6)     // Catch: java.lang.Throwable -> L5d8
            java.lang.reflect.Method r0 = r4.getMethod(r0, r2)     // Catch: java.lang.Throwable -> L5d8
            java.lang.Object r0 = r0.invoke(r5, r2)     // Catch: java.lang.Throwable -> L5d8
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L5d8
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L5d8
            if (r0 == 0) goto L5f8
            goto L65c
        L5d8:
            r0 = move-exception
            goto L5e6
        L5da:
            r0 = move-exception
            r45 = r4
        L5dd:
            r44 = r9
            goto L5e6
        L5e0:
            r0 = move-exception
            r45 = r4
            r43 = r6
            goto L5dd
        L5e6:
            java.lang.Throwable r4 = r0.getCause()     // Catch: java.lang.Throwable -> L5ed
            if (r4 == 0) goto L5f7
            throw r4     // Catch: java.lang.Throwable -> L5ed
        L5ed:
            r0 = move-exception
            r50 = r1
            r48 = r3
        L5f2:
            r52 = r7
            r51 = r8
            goto L58b
        L5f7:
            throw r0     // Catch: java.lang.Throwable -> L5ed
        L5f8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5ed
            r0.<init>()     // Catch: java.lang.Throwable -> L5ed
            byte[] r4 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L5ed
            r6 = r4[r41]     // Catch: java.lang.Throwable -> L5ed
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L5ed
            r9 = 288(0x120, float:4.04E-43)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L5ed
            r13 = r4[r16]     // Catch: java.lang.Throwable -> L5ed
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L5ed
            java.lang.String r6 = $$c(r6, r9, r13)     // Catch: java.lang.Throwable -> L5ed
            r0.append(r6)     // Catch: java.lang.Throwable -> L5ed
            r0.append(r5)     // Catch: java.lang.Throwable -> L5ed
            r5 = r4[r43]     // Catch: java.lang.Throwable -> L5ed
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L5ed
            r6 = 292(0x124, float:4.09E-43)
            r9 = r5 | 292(0x124, float:4.09E-43)
            short r6 = (short) r9     // Catch: java.lang.Throwable -> L5ed
            r9 = r4[r40]     // Catch: java.lang.Throwable -> L5ed
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L5ed
            java.lang.String r5 = $$c(r5, r6, r9)     // Catch: java.lang.Throwable -> L5ed
            r0.append(r5)     // Catch: java.lang.Throwable -> L5ed
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5ed
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L64d
            r5 = r4[r34]     // Catch: java.lang.Throwable -> L64d
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L64d
            r6 = 292(0x124, float:4.09E-43)
            short r9 = (short) r6     // Catch: java.lang.Throwable -> L64d
            r4 = r4[r36]     // Catch: java.lang.Throwable -> L64d
            int r4 = -r4
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L64d
            java.lang.String r4 = $$c(r5, r9, r4)     // Catch: java.lang.Throwable -> L64d
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L64d
            java.lang.Class[] r5 = new java.lang.Class[]{r10}     // Catch: java.lang.Throwable -> L64d
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r5)     // Catch: java.lang.Throwable -> L64d
            java.lang.Object r0 = r4.newInstance(r0)     // Catch: java.lang.Throwable -> L64d
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L64d
            throw r0     // Catch: java.lang.Throwable -> L64d
        L64d:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch: java.lang.Throwable -> L5ed
            if (r4 == 0) goto L655
            throw r4     // Catch: java.lang.Throwable -> L5ed
        L655:
            throw r0     // Catch: java.lang.Throwable -> L5ed
        L656:
            r45 = r4
            r43 = r6
            r44 = r9
        L65c:
            if (r35 == 0) goto La1c
            java.util.Random r0 = new java.util.Random     // Catch: java.lang.Throwable -> L5ed
            r0.<init>()     // Catch: java.lang.Throwable -> L5ed
            byte[] r4 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> La0f
            r6 = 1150(0x47e, float:1.611E-42)
            r6 = r4[r6]     // Catch: java.lang.Throwable -> La0f
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> La0f
            int r9 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> La0f
            r13 = r9 ^ 152(0x98, float:2.13E-43)
            r2 = r9 & 152(0x98, float:2.13E-43)
            r2 = r2 | r13
            short r2 = (short) r2     // Catch: java.lang.Throwable -> La0f
            r13 = r4[r36]     // Catch: java.lang.Throwable -> La0f
            int r13 = -r13
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> La0f
            java.lang.String r2 = $$c(r6, r2, r13)     // Catch: java.lang.Throwable -> La0f
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> La0f
            r6 = 191(0xbf, float:2.68E-43)
            r4 = r4[r6]     // Catch: java.lang.Throwable -> La0f
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> La0f
            r6 = r4 | 294(0x126, float:4.12E-43)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> La0f
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> La0f
            java.lang.String r4 = $$c(r4, r6, r9)     // Catch: java.lang.Throwable -> La0f
            r6 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r4, r6)     // Catch: java.lang.Throwable -> La0f
            java.lang.Object r2 = r2.invoke(r6, r6)     // Catch: java.lang.Throwable -> La0f
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> La0f
            long r47 = r2.longValue()     // Catch: java.lang.Throwable -> La0f
            r49 = -1388459616(0xffffffffad3dc9a0, double:NaN)
            r4 = r1
            long r1 = r47 ^ r49
            r0.setSeed(r1)     // Catch: java.lang.Throwable -> L9ff
            r1 = 0
            r2 = 0
            r6 = 0
            r9 = 0
        L6a7:
            if (r1 != 0) goto La04
            if (r2 != 0) goto L6af
            r13 = 6
            r47 = r1
            goto L6bd
        L6af:
            r47 = r1
            if (r6 != 0) goto L6b6
            r13 = r44
            goto L6bd
        L6b6:
            if (r9 != 0) goto L6bb
            r13 = r25
            goto L6bd
        L6bb:
            r13 = r31
        L6bd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9ff
            r49 = r2
            r48 = r3
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L775
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L775
            int r3 = r13 * (-756)
            r50 = 758(0x2f6, float:1.062E-42)
            int r50 = r50 + r3
            int r3 = ~r2     // Catch: java.lang.Throwable -> L775
            r51 = r3 ^ 1
            r3 = r3 & 1
            r3 = r51 | r3
            int r3 = r3 * (-757)
            int r3 = -r3
            int r3 = -r3
            r51 = r50 & r3
            r3 = r50 | r3
            int r51 = r51 + r3
            int r3 = ~r13     // Catch: java.lang.Throwable -> L775
            r50 = r3 ^ 1
            r3 = r3 & 1
            r3 = r50 | r3
            r50 = r3 ^ r2
            r3 = r3 & r2
            r3 = r50 | r3
            int r3 = ~r3     // Catch: java.lang.Throwable -> L775
            int r3 = r3 * 1514
            r50 = r51 | r3
            int r50 = r50 << 1
            r3 = r51 ^ r3
            int r50 = r50 - r3
            int r3 = ~r13     // Catch: java.lang.Throwable -> L775
            r51 = -2
            r52 = r51 ^ r3
            r51 = r51 & r3
            r53 = r3
            r3 = r52 | r51
            int r3 = ~r3     // Catch: java.lang.Throwable -> L775
            r51 = r3
            int r3 = ~r2     // Catch: java.lang.Throwable -> L775
            r52 = r53 ^ r3
            r3 = r53 & r3
            r3 = r52 | r3
            int r3 = ~r3     // Catch: java.lang.Throwable -> L775
            r3 = r51 | r3
            r51 = r13 ^ 1
            r52 = r13 & 1
            r51 = r51 | r52
            r52 = r51 ^ r2
            r2 = r51 & r2
            r2 = r52 | r2
            int r2 = ~r2     // Catch: java.lang.Throwable -> L775
            r2 = r2 | r3
            int r2 = r2 * 757
            int r2 = r50 + r2
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L775
            r2 = 46
            r1.append(r2)     // Catch: java.lang.Throwable -> L775
            r2 = r28
        L72a:
            if (r2 >= r13) goto L7a0
            if (r39 == 0) goto L77a
            r3 = 26
            int r3 = r0.nextInt(r3)     // Catch: java.lang.Throwable -> L775
            boolean r50 = r0.nextBoolean()     // Catch: java.lang.Throwable -> L775
            if (r50 != 0) goto L749
            int r3 = -r3
            int r3 = -r3
            r50 = r3 & 96
            r3 = r3 | 96
            int r50 = r50 + r3
            r52 = r2
            r2 = r50
            r50 = r4
            goto L770
        L749:
            int r50 = com.appsflyer.internal.AFi1jSDK.$11
            r51 = r50 | 33
            int r51 = r51 << 1
            r50 = r50 ^ 33
            r52 = r2
            int r2 = r51 - r50
            r50 = r4
            int r4 = r2 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r4
            int r2 = r2 % 2
            if (r2 == 0) goto L766
            r2 = 70
            int r2 = r2 / r3
            goto L770
        L763:
            r0 = move-exception
            goto L5f2
        L766:
            int r2 = -r3
            int r2 = -r2
            r3 = r2 | 65
            int r3 = r3 << 1
            r2 = r2 ^ 65
            int r2 = r3 - r2
        L770:
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L763
            r1.append(r2)     // Catch: java.lang.Throwable -> L763
            goto L791
        L775:
            r0 = move-exception
        L776:
            r50 = r4
            goto L5f2
        L77a:
            r52 = r2
            r50 = r4
            r2 = 12
            int r2 = r0.nextInt(r2)     // Catch: java.lang.Throwable -> L763
            int r2 = -r2
            int r2 = -r2
            r3 = r2 ^ 8192(0x2000, float:1.148E-41)
            r2 = r2 & 8192(0x2000, float:1.148E-41)
            int r2 = r2 << 1
            int r3 = r3 + r2
            char r2 = (char) r3     // Catch: java.lang.Throwable -> L763
            r1.append(r2)     // Catch: java.lang.Throwable -> L763
        L791:
            r2 = r52 & 66
            r3 = r52 | 66
            int r2 = r2 + r3
            r3 = r2 ^ (-65)
            r2 = r2 & (-65)
            int r2 = r2 << 1
            int r2 = r2 + r3
            r4 = r50
            goto L72a
        L7a0:
            r50 = r4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L763
            if (r49 != 0) goto L80a
            int r2 = com.appsflyer.internal.AFi1jSDK.$11
            int r2 = r2 + 71
            int r2 = r2 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r2
            r2 = r45
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L801
            r3[r32] = r1     // Catch: java.lang.Throwable -> L801
            r3[r28] = r5     // Catch: java.lang.Throwable -> L801
            byte[] r1 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L801
            r2 = r1[r32]     // Catch: java.lang.Throwable -> L801
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L801
            int r4 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L801
            r13 = r4 ^ 128(0x80, float:1.8E-43)
            r49 = r1
            r1 = r4 & 128(0x80, float:1.8E-43)
            r1 = r1 | r13
            short r1 = (short) r1     // Catch: java.lang.Throwable -> L801
            r13 = r49[r36]     // Catch: java.lang.Throwable -> L801
            int r13 = -r13
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L801
            java.lang.String r1 = $$c(r2, r1, r13)     // Catch: java.lang.Throwable -> L801
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L801
            r2 = r49[r32]     // Catch: java.lang.Throwable -> L801
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L801
            r13 = r4 ^ 128(0x80, float:1.8E-43)
            r4 = r4 & 128(0x80, float:1.8E-43)
            r4 = r4 | r13
            short r4 = (short) r4     // Catch: java.lang.Throwable -> L801
            r13 = r49[r36]     // Catch: java.lang.Throwable -> L801
            int r13 = -r13
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L801
            java.lang.String r2 = $$c(r2, r4, r13)     // Catch: java.lang.Throwable -> L801
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L801
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r10}     // Catch: java.lang.Throwable -> L801
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L801
            java.lang.Object r1 = r1.newInstance(r3)     // Catch: java.lang.Throwable -> L801
            java.lang.System.currentTimeMillis()
            java.lang.System.currentTimeMillis()
            r2 = r1
            r51 = r5
            r1 = r47
            goto L975
        L801:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L763
            if (r1 == 0) goto L809
            throw r1     // Catch: java.lang.Throwable -> L763
        L809:
            throw r0     // Catch: java.lang.Throwable -> L763
        L80a:
            if (r6 != 0) goto L85c
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L853
            r3[r32] = r1     // Catch: java.lang.Throwable -> L853
            r3[r28] = r5     // Catch: java.lang.Throwable -> L853
            byte[] r1 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L853
            r2 = r1[r32]     // Catch: java.lang.Throwable -> L853
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L853
            int r4 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L853
            r6 = r4 ^ 128(0x80, float:1.8E-43)
            r13 = r4 & 128(0x80, float:1.8E-43)
            r6 = r6 | r13
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L853
            r13 = r1[r36]     // Catch: java.lang.Throwable -> L853
            int r13 = -r13
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L853
            java.lang.String r2 = $$c(r2, r6, r13)     // Catch: java.lang.Throwable -> L853
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L853
            r6 = r1[r32]     // Catch: java.lang.Throwable -> L853
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L853
            r4 = r4 | 128(0x80, float:1.8E-43)
            short r4 = (short) r4     // Catch: java.lang.Throwable -> L853
            r1 = r1[r36]     // Catch: java.lang.Throwable -> L853
            int r1 = -r1
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L853
            java.lang.String r1 = $$c(r6, r4, r1)     // Catch: java.lang.Throwable -> L853
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L853
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r10}     // Catch: java.lang.Throwable -> L853
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L853
            java.lang.Object r1 = r1.newInstance(r3)     // Catch: java.lang.Throwable -> L853
            r6 = r1
        L84b:
            r51 = r5
            r1 = r47
            r2 = r49
            goto L975
        L853:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L763
            if (r1 == 0) goto L85b
            throw r1     // Catch: java.lang.Throwable -> L763
        L85b:
            throw r0     // Catch: java.lang.Throwable -> L763
        L85c:
            if (r9 != 0) goto L8b9
            int r2 = com.appsflyer.internal.AFi1jSDK.$11
            int r2 = r2 + 41
            int r3 = r2 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r3
            r3 = 2
            int r2 = r2 % r3
            if (r2 == 0) goto L86e
            r2 = 53
            int r2 = r2 / 0
        L86e:
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L8b0
            r2[r32] = r1     // Catch: java.lang.Throwable -> L8b0
            r2[r28] = r5     // Catch: java.lang.Throwable -> L8b0
            byte[] r1 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L8b0
            r3 = r1[r32]     // Catch: java.lang.Throwable -> L8b0
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L8b0
            int r4 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L8b0
            r9 = r4 ^ 128(0x80, float:1.8E-43)
            r13 = r4 & 128(0x80, float:1.8E-43)
            r9 = r9 | r13
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L8b0
            r13 = r1[r36]     // Catch: java.lang.Throwable -> L8b0
            int r13 = -r13
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L8b0
            java.lang.String r3 = $$c(r3, r9, r13)     // Catch: java.lang.Throwable -> L8b0
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L8b0
            r9 = r1[r32]     // Catch: java.lang.Throwable -> L8b0
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L8b0
            r13 = r4 ^ 128(0x80, float:1.8E-43)
            r4 = r4 & 128(0x80, float:1.8E-43)
            r4 = r4 | r13
            short r4 = (short) r4     // Catch: java.lang.Throwable -> L8b0
            r1 = r1[r36]     // Catch: java.lang.Throwable -> L8b0
            int r1 = -r1
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L8b0
            java.lang.String r1 = $$c(r9, r4, r1)     // Catch: java.lang.Throwable -> L8b0
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L8b0
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r10}     // Catch: java.lang.Throwable -> L8b0
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L8b0
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L8b0
            r9 = r1
            goto L84b
        L8b0:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L763
            if (r1 == 0) goto L8b8
            throw r1     // Catch: java.lang.Throwable -> L763
        L8b8:
            throw r0     // Catch: java.lang.Throwable -> L763
        L8b9:
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L9f6
            r3[r32] = r1     // Catch: java.lang.Throwable -> L9f6
            r3[r28] = r5     // Catch: java.lang.Throwable -> L9f6
            byte[] r1 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L9f6
            r2 = r1[r32]     // Catch: java.lang.Throwable -> L9f6
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L9f6
            int r4 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L9f6
            r13 = r4 ^ 128(0x80, float:1.8E-43)
            r47 = r1
            r1 = r4 & 128(0x80, float:1.8E-43)
            r1 = r1 | r13
            short r1 = (short) r1     // Catch: java.lang.Throwable -> L9f6
            r13 = r47[r36]     // Catch: java.lang.Throwable -> L9f6
            int r13 = -r13
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L9f6
            java.lang.String r1 = $$c(r2, r1, r13)     // Catch: java.lang.Throwable -> L9f6
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L9f6
            r2 = r47[r32]     // Catch: java.lang.Throwable -> L9f6
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L9f6
            r13 = r4 ^ 128(0x80, float:1.8E-43)
            r51 = r5
            r5 = r4 & 128(0x80, float:1.8E-43)
            r5 = r5 | r13
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L9f6
            r13 = r47[r36]     // Catch: java.lang.Throwable -> L9f6
            int r13 = -r13
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L9f6
            java.lang.String r2 = $$c(r2, r5, r13)     // Catch: java.lang.Throwable -> L9f6
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L9f6
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r10}     // Catch: java.lang.Throwable -> L9f6
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L9f6
            java.lang.Object r1 = r1.newInstance(r3)     // Catch: java.lang.Throwable -> L9f6
            int r2 = com.appsflyer.internal.AFi1jSDK.$10
            r3 = r2 ^ 73
            r2 = r2 & 73
            int r2 = r2 << 1
            int r3 = r3 + r2
            int r3 = r3 % 128
            com.appsflyer.internal.AFi1jSDK.$11 = r3
            java.lang.Object[] r2 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L98a
            r3 = r47[r26]     // Catch: java.lang.Throwable -> L98a
            int r3 = -r3
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L98a
            r5 = r4 | 260(0x104, float:3.64E-43)
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L98a
            r13 = r47[r36]     // Catch: java.lang.Throwable -> L98a
            int r13 = -r13
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L98a
            java.lang.String r3 = $$c(r3, r5, r13)     // Catch: java.lang.Throwable -> L98a
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L98a
            r5 = r47[r32]     // Catch: java.lang.Throwable -> L98a
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L98a
            r13 = r4 ^ 128(0x80, float:1.8E-43)
            r52 = r6
            r6 = r4 & 128(0x80, float:1.8E-43)
            r6 = r6 | r13
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L98a
            r13 = r47[r36]     // Catch: java.lang.Throwable -> L98a
            int r13 = -r13
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L98a
            java.lang.String r5 = $$c(r5, r6, r13)     // Catch: java.lang.Throwable -> L98a
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L98a
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Throwable -> L98a
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r5)     // Catch: java.lang.Throwable -> L98a
            java.lang.Object r2 = r3.newInstance(r2)     // Catch: java.lang.Throwable -> L98a
            r3 = r47[r26]     // Catch: java.lang.Throwable -> L97f
            int r3 = -r3
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L97f
            r5 = r4 ^ 260(0x104, float:3.64E-43)
            r6 = r4 & 260(0x104, float:3.64E-43)
            r5 = r5 | r6
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L97f
            r6 = r47[r36]     // Catch: java.lang.Throwable -> L97f
            int r6 = -r6
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L97f
            java.lang.String r3 = $$c(r3, r5, r6)     // Catch: java.lang.Throwable -> L97f
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L97f
            r5 = r47[r41]     // Catch: java.lang.Throwable -> L97f
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L97f
            r6 = r5 ^ 345(0x159, float:4.83E-43)
            r13 = r5 & 345(0x159, float:4.83E-43)
            r6 = r6 | r13
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L97f
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L97f
            java.lang.String r4 = $$c(r5, r6, r4)     // Catch: java.lang.Throwable -> L97f
            r6 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.Throwable -> L97f
            r3.invoke(r2, r6)     // Catch: java.lang.Throwable -> L97f
            r2 = r49
            r6 = r52
        L975:
            r3 = r48
            r4 = r50
            r5 = r51
            r45 = 2
            goto L6a7
        L97f:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L763 java.lang.Exception -> L987
            if (r2 == 0) goto L989
            throw r2     // Catch: java.lang.Throwable -> L763 java.lang.Exception -> L987
        L987:
            r0 = move-exception
            goto L993
        L989:
            throw r0     // Catch: java.lang.Throwable -> L763 java.lang.Exception -> L987
        L98a:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L763 java.lang.Exception -> L987
            if (r2 == 0) goto L992
            throw r2     // Catch: java.lang.Throwable -> L763 java.lang.Exception -> L987
        L992:
            throw r0     // Catch: java.lang.Throwable -> L763 java.lang.Exception -> L987
        L993:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L763
            r2.<init>()     // Catch: java.lang.Throwable -> L763
            byte[] r3 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L763
            r4 = r3[r41]     // Catch: java.lang.Throwable -> L763
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L763
            r5 = 353(0x161, float:4.95E-43)
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L763
            r6 = r3[r16]     // Catch: java.lang.Throwable -> L763
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L763
            java.lang.String r4 = $$c(r4, r5, r6)     // Catch: java.lang.Throwable -> L763
            r2.append(r4)     // Catch: java.lang.Throwable -> L763
            r2.append(r1)     // Catch: java.lang.Throwable -> L763
            r1 = r3[r43]     // Catch: java.lang.Throwable -> L763
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L763
            r6 = 292(0x124, float:4.09E-43)
            r4 = r1 | 292(0x124, float:4.09E-43)
            short r4 = (short) r4     // Catch: java.lang.Throwable -> L763
            r5 = r3[r40]     // Catch: java.lang.Throwable -> L763
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L763
            java.lang.String r1 = $$c(r1, r4, r5)     // Catch: java.lang.Throwable -> L763
            r2.append(r1)     // Catch: java.lang.Throwable -> L763
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L763
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L9ed
            r4[r32] = r0     // Catch: java.lang.Throwable -> L9ed
            r4[r28] = r1     // Catch: java.lang.Throwable -> L9ed
            r0 = r3[r34]     // Catch: java.lang.Throwable -> L9ed
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L9ed
            r6 = 292(0x124, float:4.09E-43)
            short r1 = (short) r6     // Catch: java.lang.Throwable -> L9ed
            r2 = r3[r36]     // Catch: java.lang.Throwable -> L9ed
            int r2 = -r2
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L9ed
            java.lang.String r0 = $$c(r0, r1, r2)     // Catch: java.lang.Throwable -> L9ed
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L9ed
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.Class[] r1 = new java.lang.Class[]{r10, r1}     // Catch: java.lang.Throwable -> L9ed
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L9ed
            java.lang.Object r0 = r0.newInstance(r4)     // Catch: java.lang.Throwable -> L9ed
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L9ed
            throw r0     // Catch: java.lang.Throwable -> L9ed
        L9ed:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L763
            if (r1 == 0) goto L9f5
            throw r1     // Catch: java.lang.Throwable -> L763
        L9f5:
            throw r0     // Catch: java.lang.Throwable -> L763
        L9f6:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L763
            if (r1 == 0) goto L9fe
            throw r1     // Catch: java.lang.Throwable -> L763
        L9fe:
            throw r0     // Catch: java.lang.Throwable -> L763
        L9ff:
            r0 = move-exception
            r48 = r3
            goto L776
        La04:
            r47 = r1
            r49 = r2
            r50 = r4
            r52 = r6
        La0c:
            r48 = r3
            goto La25
        La0f:
            r0 = move-exception
            r50 = r1
            r48 = r3
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L763
            if (r1 == 0) goto La1b
            throw r1     // Catch: java.lang.Throwable -> L763
        La1b:
            throw r0     // Catch: java.lang.Throwable -> L763
        La1c:
            r50 = r1
            r6 = 0
            r9 = 0
            r47 = 0
            r49 = 0
            goto La0c
        La25:
            byte[] r0 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L200c
            r1 = 102(0x66, float:1.43E-43)
            r1 = r0[r1]     // Catch: java.lang.Throwable -> L200c
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L200c
            r2 = 357(0x165, float:5.0E-43)
            short r2 = (short) r2     // Catch: java.lang.Throwable -> L200c
            r3 = r0[r33]     // Catch: java.lang.Throwable -> L200c
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L200c
            java.lang.String r1 = $$c(r1, r2, r3)     // Catch: java.lang.Throwable -> L200c
            java.lang.Class<com.appsflyer.internal.AFi1jSDK> r2 = com.appsflyer.internal.AFi1jSDK.class
            java.lang.Object[] r3 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L1ffe
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r5 = r0[r37]     // Catch: java.lang.Throwable -> L1ffe
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1ffe
            r13 = 405(0x195, float:5.68E-43)
            short r13 = (short) r13     // Catch: java.lang.Throwable -> L1ffe
            r39 = r6
            int r6 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L1ffe
            r52 = r7
            r51 = r8
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1fef
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L1fef
            int r8 = r6 * (-112)
            int r8 = -r8
            int r8 = -r8
            int r8 = ~r8     // Catch: java.lang.Throwable -> L1fef
            int r8 = (-449) - r8
            r53 = r8
            int r8 = ~r6     // Catch: java.lang.Throwable -> L1fef
            r54 = r8
            int r8 = ~r7     // Catch: java.lang.Throwable -> L1fef
            r55 = r7
            r7 = r54 | r8
            int r7 = ~r7     // Catch: java.lang.Throwable -> L1fef
            r56 = r7 ^ 4
            r7 = r7 & 4
            r7 = r56 | r7
            int r7 = r7 * 226
            r56 = r53 ^ r7
            r7 = r53 & r7
            int r7 = r7 << 1
            int r56 = r56 + r7
            r7 = r17 ^ r6
            r53 = r17 & r6
            r7 = r7 | r53
            int r7 = ~r7     // Catch: java.lang.Throwable -> L1fef
            r53 = r17 ^ r55
            r57 = r17 & r55
            r58 = r7
            r7 = r53 | r57
            int r7 = ~r7     // Catch: java.lang.Throwable -> L1fef
            r53 = r58 ^ r7
            r7 = r58 & r7
            r7 = r53 | r7
            r53 = r54 ^ r8
            r8 = r54 & r8
            r8 = r53 | r8
            r53 = r8 ^ 4
            r8 = r8 & 4
            r8 = r53 | r8
            int r8 = ~r8     // Catch: java.lang.Throwable -> L1fef
            r7 = r7 | r8
            int r7 = r7 * (-113)
            int r7 = -r7
            int r7 = -r7
            r8 = r56 ^ r7
            r7 = r56 & r7
            int r7 = r7 << 1
            int r8 = r8 + r7
            int r7 = ~r6     // Catch: java.lang.Throwable -> L1fef
            r53 = r7 ^ r55
            r7 = r7 & r55
            r7 = r53 | r7
            int r7 = ~r7     // Catch: java.lang.Throwable -> L1fef
            int r7 = r7 * 113
            int r7 = -r7
            int r7 = -r7
            r53 = r8 ^ r7
            r7 = r7 & r8
            int r7 = r7 << 1
            int r7 = r53 + r7
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1fef
            java.lang.String r5 = $$c(r5, r13, r7)     // Catch: java.lang.Throwable -> L1fef
            java.lang.Class[] r7 = new java.lang.Class[]{r10}     // Catch: java.lang.Throwable -> L1fef
            java.lang.reflect.Method r4 = r4.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L1fef
            java.lang.Object r2 = r4.invoke(r2, r3)     // Catch: java.lang.Throwable -> L1fef
            r3 = r0[r32]     // Catch: java.lang.Throwable -> L1fd9
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1fd9
            r4 = r3 | 404(0x194, float:5.66E-43)
            short r4 = (short) r4     // Catch: java.lang.Throwable -> L1fd9
            r5 = r0[r36]     // Catch: java.lang.Throwable -> L1fd9
            int r5 = -r5
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1fd9
            java.lang.String r3 = $$c(r3, r4, r5)     // Catch: java.lang.Throwable -> L1fd9
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L1fd9
            r4 = 198(0xc6, float:2.77E-43)
            r4 = r0[r4]     // Catch: java.lang.Throwable -> L1fd9
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L1fd9
            r5 = 426(0x1aa, float:5.97E-43)
            short r7 = (short) r5     // Catch: java.lang.Throwable -> L1fd9
            r5 = r9
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1fd9
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L1fd9
            int r9 = r6 * 370
            r13 = 1480(0x5c8, float:2.074E-42)
            int r13 = r13 + r9
            r9 = r6 ^ 4
            r53 = r6 & 4
            r9 = r9 | r53
            r53 = r5
            int r5 = ~r8     // Catch: java.lang.Throwable -> L1fd9
            r54 = r9 ^ r5
            r5 = r5 & r9
            r5 = r54 | r5
            int r5 = r5 * (-369)
            int r5 = -r5
            int r5 = -r5
            r9 = r13 | r5
            int r9 = r9 << 1
            r5 = r5 ^ r13
            int r9 = r9 - r5
            int r5 = ~r8     // Catch: java.lang.Throwable -> L1fd9
            r13 = r17 ^ r5
            r54 = r17 & r5
            r13 = r13 | r54
            int r13 = ~r13     // Catch: java.lang.Throwable -> L1fd9
            r13 = r13 | r6
            int r13 = r13 * (-369)
            int r9 = r9 + r13
            int r13 = ~r6     // Catch: java.lang.Throwable -> L1fd9
            r13 = r13 | 4
            int r13 = ~r13     // Catch: java.lang.Throwable -> L1fd9
            r8 = r8 | 4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L1fd9
            r54 = r13 ^ r8
            r8 = r8 & r13
            r8 = r54 | r8
            r13 = r17 ^ r5
            r5 = r17 & r5
            r5 = r5 | r13
            r13 = r5 ^ r6
            r5 = r5 & r6
            r5 = r5 | r13
            int r5 = ~r5     // Catch: java.lang.Throwable -> L1fd9
            r5 = r5 | r8
            int r5 = r5 * 369
            int r5 = -r5
            int r5 = -r5
            r8 = r9 ^ r5
            r5 = r5 & r9
            int r5 = r5 << 1
            int r8 = r8 + r5
            byte r5 = (byte) r8     // Catch: java.lang.Throwable -> L1fd9
            java.lang.String r4 = $$c(r4, r7, r5)     // Catch: java.lang.Throwable -> L1fd9
            r5 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L1fd9
            java.lang.Object r2 = r3.invoke(r2, r5)     // Catch: java.lang.Throwable -> L1fd9
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1fd9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fd7
            r3.<init>()     // Catch: java.lang.Throwable -> L1fd7
            r4 = r0[r43]     // Catch: java.lang.Throwable -> L1fd7
            byte r5 = (byte) r4     // Catch: java.lang.Throwable -> L1fd7
            r7 = 432(0x1b0, float:6.05E-43)
            r8 = r5 ^ 432(0x1b0, float:6.05E-43)
            r9 = r5 & 432(0x1b0, float:6.05E-43)
            r7 = r8 | r9
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L1fd7
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L1fd7
            java.lang.String r4 = $$c(r5, r7, r4)     // Catch: java.lang.Throwable -> L1fd7
            r3.append(r4)     // Catch: java.lang.Throwable -> L1fd7
            r3.append(r1)     // Catch: java.lang.Throwable -> L1fd7
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1fd7
            int r3 = r2.lastIndexOf(r3)     // Catch: java.lang.Throwable -> L1fd7
            r4 = r44
            java.lang.String r2 = r2.substring(r4, r3)     // Catch: java.lang.Throwable -> L1fc5
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L1fb3
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1fb3
            r2 = 7142(0x1be6, float:1.0008E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L1f35
            r4 = r32
            java.lang.String r1 = r1.substring(r4)     // Catch: java.lang.Throwable -> L1f35
            java.util.zip.ZipEntry r1 = r3.getEntry(r1)     // Catch: java.lang.Throwable -> L1f35
            java.io.InputStream r1 = r3.getInputStream(r1)     // Catch: java.lang.Throwable -> L1f35
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L1f91
            r4 = 622(0x26e, float:8.72E-43)
            r4 = r0[r4]     // Catch: java.lang.Throwable -> L1f91
            int r4 = -r4
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L1f91
            r7 = 432(0x1b0, float:6.05E-43)
            short r5 = (short) r7     // Catch: java.lang.Throwable -> L1f91
            r7 = r0[r36]     // Catch: java.lang.Throwable -> L1f91
            int r7 = -r7
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1f91
            java.lang.String r4 = $$c(r4, r5, r7)     // Catch: java.lang.Throwable -> L1f91
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L1f91
            r5 = r0[r34]     // Catch: java.lang.Throwable -> L1f91
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1f91
            r7 = r6 | 392(0x188, float:5.5E-43)
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L1f91
            r8 = r0[r36]     // Catch: java.lang.Throwable -> L1f91
            int r8 = -r8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1f91
            java.lang.String r5 = $$c(r5, r7, r8)     // Catch: java.lang.Throwable -> L1f91
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L1f91
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Throwable -> L1f91
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r5)     // Catch: java.lang.Throwable -> L1f91
            java.lang.Object r1 = r4.newInstance(r1)     // Catch: java.lang.Throwable -> L1f91
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L1f78
            r4 = r0[r38]     // Catch: java.lang.Throwable -> L1f78
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L1f78
            r5 = 476(0x1dc, float:6.67E-43)
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L1f78
            r7 = r0[r36]     // Catch: java.lang.Throwable -> L1f78
            int r7 = -r7
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1f78
            java.lang.String r4 = $$c(r4, r5, r7)     // Catch: java.lang.Throwable -> L1f78
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L1f78
            r7 = r0[r34]     // Catch: java.lang.Throwable -> L1f78
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1f78
            r8 = r6 ^ 392(0x188, float:5.5E-43)
            r9 = r6 & 392(0x188, float:5.5E-43)
            r8 = r8 | r9
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L1f78
            r9 = r0[r36]     // Catch: java.lang.Throwable -> L1f78
            int r9 = -r9
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1f78
            java.lang.String r7 = $$c(r7, r8, r9)     // Catch: java.lang.Throwable -> L1f78
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L1f78
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L1f78
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r7)     // Catch: java.lang.Throwable -> L1f78
            java.lang.Object r1 = r4.newInstance(r1)     // Catch: java.lang.Throwable -> L1f78
            java.lang.Object[] r4 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L1f5f
            r7 = r0[r38]     // Catch: java.lang.Throwable -> L1f5f
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1f5f
            r8 = r0[r36]     // Catch: java.lang.Throwable -> L1f5f
            int r8 = -r8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1f5f
            java.lang.String r7 = $$c(r7, r5, r8)     // Catch: java.lang.Throwable -> L1f5f
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L1f5f
            r8 = r0[r40]     // Catch: java.lang.Throwable -> L1f5f
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1f5f
            r9 = 432(0x1b0, float:6.05E-43)
            r13 = r6 | 432(0x1b0, float:6.05E-43)
            short r9 = (short) r13     // Catch: java.lang.Throwable -> L1f5f
            r13 = 1141(0x475, float:1.599E-42)
            r13 = r0[r13]     // Catch: java.lang.Throwable -> L1f5f
            int r13 = r13 + 1
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1f5f
            java.lang.String r8 = $$c(r8, r9, r13)     // Catch: java.lang.Throwable -> L1f5f
            java.lang.Class[] r9 = new java.lang.Class[]{r27}     // Catch: java.lang.Throwable -> L1f5f
            java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L1f5f
            r7.invoke(r1, r4)     // Catch: java.lang.Throwable -> L1f5f
            r4 = r0[r38]     // Catch: java.lang.Throwable -> L1f46
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L1f46
            r7 = r0[r36]     // Catch: java.lang.Throwable -> L1f46
            int r7 = -r7
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1f46
            java.lang.String r4 = $$c(r4, r5, r7)     // Catch: java.lang.Throwable -> L1f46
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L1f46
            r0 = r0[r41]     // Catch: java.lang.Throwable -> L1f46
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1f46
            r5 = r0 ^ 345(0x159, float:4.83E-43)
            r7 = r0 & 345(0x159, float:4.83E-43)
            r5 = r5 | r7
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L1f46
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1f46
            java.lang.String r0 = $$c(r0, r5, r6)     // Catch: java.lang.Throwable -> L1f46
            r6 = 0
            java.lang.reflect.Method r0 = r4.getMethod(r0, r6)     // Catch: java.lang.Throwable -> L1f46
            r0.invoke(r1, r6)     // Catch: java.lang.Throwable -> L1f46
            r0 = 22
            r1 = 7086(0x1bae, float:9.93E-42)
            r4 = r1
            r1 = r0
            r0 = r4
            r4 = r50
            r6 = 0
        Lc4f:
            r5 = 1
            long r7 = (long) r5
            int r5 = r2.length     // Catch: java.lang.Throwable -> L1f35
            r9 = r28
        Lc54:
            if (r9 >= r5) goto Lc7d
            r13 = r2[r9]     // Catch: java.lang.Throwable -> Lc69
            r54 = r7
            long r7 = (long) r13
            r13 = 6
            long r56 = r54 << r13
            long r7 = r7 + r56
            long r56 = r54 << r30
            long r7 = r7 + r56
            long r7 = r7 - r54
            int r9 = r9 + 1
            goto Lc54
        Lc69:
            r0 = move-exception
            r1 = r0
            r8 = r3
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
        Lc79:
            r44 = 5
            goto L1faa
        Lc7d:
            r54 = r7
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1f35
            int r5 = (int) r7     // Catch: java.lang.Throwable -> L1f35
            int r7 = r1 * (-301)
            int r7 = -r7
            int r7 = -r7
            r8 = 149076(0x24654, float:2.089E-40)
            r9 = r8 & r7
            r7 = r7 | r8
            int r9 = r9 + r7
            int r7 = ~r5     // Catch: java.lang.Throwable -> L1f35
            r8 = -493(0xfffffffffffffe13, float:NaN)
            r13 = r8 ^ r7
            r7 = r7 & r8
            r7 = r7 | r13
            r7 = r7 | r1
            int r7 = ~r7     // Catch: java.lang.Throwable -> L1f35
            r8 = r1 ^ 492(0x1ec, float:6.9E-43)
            r13 = r1 & 492(0x1ec, float:6.9E-43)
            r8 = r8 | r13
            r13 = r8 ^ r5
            r8 = r8 & r5
            r8 = r8 | r13
            int r8 = ~r8     // Catch: java.lang.Throwable -> L1f35
            r7 = r7 | r8
            int r7 = r7 * (-302)
            int r7 = ~r7     // Catch: java.lang.Throwable -> L1f35
            int r9 = r9 - r7
            r32 = 1
            int r9 = r9 + (-1)
            r7 = -493(0xfffffffffffffe13, float:NaN)
            r8 = r7 ^ r1
            r7 = r7 & r1
            r7 = r7 | r8
            r8 = r7 ^ r5
            r7 = r7 & r5
            r7 = r7 | r8
            int r7 = ~r7     // Catch: java.lang.Throwable -> L1f35
            int r7 = r7 * (-604)
            int r9 = r9 + r7
            int r7 = ~r1     // Catch: java.lang.Throwable -> L1f35
            r8 = r7 ^ 492(0x1ec, float:6.9E-43)
            r13 = r7 & 492(0x1ec, float:6.9E-43)
            r8 = r8 | r13
            int r8 = ~r8     // Catch: java.lang.Throwable -> L1f35
            r5 = r5 | r1
            int r5 = ~r5     // Catch: java.lang.Throwable -> L1f35
            r13 = r8 ^ r5
            r5 = r5 & r8
            r5 = r5 | r13
            int r5 = r5 * 302
            int r5 = ~r5     // Catch: java.lang.Throwable -> L1f35
            int r9 = r9 - r5
            r32 = 1
            int r9 = r9 + (-1)
            r5 = r7
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1f35
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L1f35
            int r8 = r1 * 85
            r13 = 265115(0x40b9b, float:3.71505E-40)
            int r13 = r13 + r8
            r8 = -3120(0xfffffffffffff3d0, float:NaN)
            r5 = r5 | r8
            int r5 = ~r5     // Catch: java.lang.Throwable -> L1f35
            r56 = -3120(0xfffffffffffff3d0, float:NaN)
            int r8 = ~r7     // Catch: java.lang.Throwable -> L1f35
            r8 = r56 | r8
            int r8 = ~r8     // Catch: java.lang.Throwable -> L1f35
            r56 = r5 ^ r8
            r5 = r5 & r8
            r5 = r56 | r5
            int r8 = ~r1     // Catch: java.lang.Throwable -> L1f35
            r56 = r5
            int r5 = ~r7     // Catch: java.lang.Throwable -> L1f35
            r57 = r8 ^ r5
            r58 = r8 & r5
            r59 = r5
            r5 = r57 | r58
            int r5 = ~r5     // Catch: java.lang.Throwable -> L1f35
            r57 = r56 ^ r5
            r5 = r56 & r5
            r5 = r57 | r5
            r56 = r5
            r5 = r1 ^ 3119(0xc2f, float:4.37E-42)
            r57 = r5
            r5 = r1 & 3119(0xc2f, float:4.37E-42)
            r5 = r57 | r5
            r57 = r5 ^ r7
            r5 = r5 & r7
            r5 = r57 | r5
            int r5 = ~r5     // Catch: java.lang.Throwable -> L1f35
            r57 = r56 ^ r5
            r5 = r56 & r5
            r5 = r57 | r5
            int r5 = r5 * (-84)
            r56 = r13 ^ r5
            r5 = r5 & r13
            r32 = 1
            int r5 = r5 << 1
            int r56 = r56 + r5
            r5 = r8 ^ r7
            r7 = r7 & r8
            r5 = r5 | r7
            int r5 = ~r5     // Catch: java.lang.Throwable -> L1f35
            r7 = r5 ^ 3119(0xc2f, float:4.37E-42)
            r5 = r5 & 3119(0xc2f, float:4.37E-42)
            r5 = r5 | r7
            r7 = r59 ^ r1
            r8 = r59 & r1
            r7 = r7 | r8
            int r8 = ~r7     // Catch: java.lang.Throwable -> L1f35
            r13 = r5 ^ r8
            r5 = r5 & r8
            r5 = r5 | r13
            int r5 = r5 * (-84)
            r8 = r56 & r5
            r5 = r56 | r5
            int r8 = r8 + r5
            int r5 = ~r7     // Catch: java.lang.Throwable -> L1f35
            r7 = r1 | 3119(0xc2f, float:4.37E-42)
            int r7 = ~r7     // Catch: java.lang.Throwable -> L1f35
            r5 = r5 | r7
            int r5 = r5 * 84
            int r5 = ~r5     // Catch: java.lang.Throwable -> L1f35
            int r8 = r8 - r5
            r32 = 1
            int r8 = r8 + (-1)
            r5 = r2[r8]     // Catch: java.lang.Throwable -> L1f35
            r7 = r5 | (-90)
            int r7 = r7 << 1
            r5 = r5 ^ (-90)
            int r7 = r7 - r5
            byte r5 = (byte) r7     // Catch: java.lang.Throwable -> L1f35
            r2[r9] = r5     // Catch: java.lang.Throwable -> L1f35
            int r5 = r2.length     // Catch: java.lang.Throwable -> L1f35
            int r7 = -r1
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1f35
            int r8 = (int) r8
            int r9 = r7 * 960
            int r13 = r5 * (-1917)
            int r13 = -r13
            int r13 = -r13
            int r13 = ~r13
            int r9 = r9 - r13
            r32 = 1
            int r9 = r9 + (-1)
            int r5 = ~r5
            int r13 = ~r8
            r56 = r5 ^ r13
            r13 = r13 & r5
            r13 = r56 | r13
            int r13 = ~r13
            r56 = r1
            r1 = r7 | r8
            int r1 = ~r1
            r57 = r13 ^ r1
            r1 = r1 & r13
            r1 = r57 | r1
            int r1 = r1 * 959
            int r9 = r9 + r1
            int r1 = r5 * (-959)
            int r1 = -r1
            int r1 = -r1
            r13 = r9 & r1
            r1 = r1 | r9
            int r13 = r13 + r1
            r1 = r5 ^ r8
            r5 = r5 & r8
            r1 = r1 | r5
            int r1 = ~r1
            int r5 = ~r8
            r5 = r5 | r7
            int r5 = ~r5
            r7 = r1 ^ r5
            r1 = r1 & r5
            r1 = r1 | r7
            int r1 = r1 * 959
            int r13 = r13 + r1
            r1 = r31
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1f1b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L1f0d
            r45 = 2
            r5[r45] = r1     // Catch: java.lang.Throwable -> L1f0d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r56)     // Catch: java.lang.Throwable -> L1f0d
            r32 = 1
            r5[r32] = r1     // Catch: java.lang.Throwable -> L1f0d
            r5[r28] = r2     // Catch: java.lang.Throwable -> L1f0d
            byte[] r1 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L1f0d
            r2 = 505(0x1f9, float:7.08E-43)
            r2 = r1[r2]     // Catch: java.lang.Throwable -> L1f0d
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1f0d
            int r7 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L1f0d
            r8 = r7 ^ 440(0x1b8, float:6.17E-43)
            r9 = r7 & 440(0x1b8, float:6.17E-43)
            r8 = r8 | r9
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L1f0d
            r9 = r1[r36]     // Catch: java.lang.Throwable -> L1f0d
            int r9 = -r9
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1f0d
            java.lang.String r2 = $$c(r2, r8, r9)     // Catch: java.lang.Throwable -> L1f0d
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1f0d
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1f0d
            r9 = r27
            java.lang.Class[] r13 = new java.lang.Class[]{r9, r8, r8}     // Catch: java.lang.Throwable -> L1ef9
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r13)     // Catch: java.lang.Throwable -> L1ef9
            java.lang.Object r2 = r2.newInstance(r5)     // Catch: java.lang.Throwable -> L1ef9
            java.lang.Object r5 = com.appsflyer.internal.AFi1jSDK.f6303e     // Catch: java.lang.Throwable -> L1ee9
            if (r5 != 0) goto Lf1f
            com.appsflyer.internal.AFi1jSDK.afInfoLog = r54     // Catch: java.lang.Throwable -> Lf19
            long r57 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()     // Catch: java.lang.Throwable -> Lf19
            r5 = 32
            long r57 = r57 >> r5
            r59 = 8520447881168363794(0x763eb63464452112, double:3.777640560570502E261)
            long r59 = r59 - r57
            r27 = r1
            r13 = r2
            long r1 = r54 ^ r59
            int r1 = (int) r1     // Catch: java.lang.Throwable -> Lf19
            long r54 = com.appsflyer.internal.AFi1jSDK.afInfoLog     // Catch: java.lang.Throwable -> Lf19
            long r57 = android.os.SystemClock.currentThreadTimeMillis()     // Catch: java.lang.Throwable -> Lf19
            r2 = 48
            long r57 = r57 >> r2
            r59 = 8520447881543722594(0x763eb6347aa4a662, double:3.7776407246004187E261)
            long r57 = r57 + r59
            r5 = r1
            long r1 = r54 ^ r57
            int r1 = (int) r1     // Catch: java.lang.Throwable -> Lf19
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> Lf19
            r54 = r1
            r2 = r30
            byte[] r1 = new byte[r2]     // Catch: java.lang.Throwable -> Lf19
            r1 = {x215a: FILL_ARRAY_DATA , data: [84, 118, 77, -92, 5, -41, -128, 81, 75, -16, 45, -96, 89, 91, -102, 18} // fill-array     // Catch: java.lang.Throwable -> Lf19
            r55 = r1
            byte[] r1 = new byte[r2]     // Catch: java.lang.Throwable -> Lf19
            r2 = 0
            r57 = r5
            r5 = 0
            float r2 = android.graphics.PointF.length(r2, r5)     // Catch: java.lang.Throwable -> Lf19
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            long r58 = com.appsflyer.internal.AFi1jSDK.afInfoLog     // Catch: java.lang.Throwable -> Lf19
            long r60 = android.os.SystemClock.currentThreadTimeMillis()     // Catch: java.lang.Throwable -> Lf19
            r5 = 48
            long r60 = r60 >> r5
            r62 = 8520447881543722602(0x763eb6347aa4a66a, double:3.777640724600422E261)
            long r62 = r62 - r60
            r60 = r11
            r61 = r12
            long r11 = r58 ^ r62
            int r5 = (int) r11
            int r11 = com.appsflyer.internal.AFi1jSDK.$11
            r12 = r11 | 13
            r32 = 1
            int r12 = r12 << 1
            r11 = r11 ^ 13
            int r12 = r12 - r11
            int r12 = r12 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r12
            r11 = 5
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> Lf10
            r30 = 16
            java.lang.Integer r11 = java.lang.Integer.valueOf(r30)     // Catch: java.lang.Throwable -> Lf10
            r12[r25] = r11     // Catch: java.lang.Throwable -> Lf10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lf10
            r31 = 3
            r12[r31] = r5     // Catch: java.lang.Throwable -> Lf10
            r45 = 2
            r12[r45] = r1     // Catch: java.lang.Throwable -> Lf10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lf10
            r32 = 1
            r12[r32] = r2     // Catch: java.lang.Throwable -> Lf10
            r12[r28] = r55     // Catch: java.lang.Throwable -> Lf10
            r2 = 1150(0x47e, float:1.611E-42)
            r2 = r27[r2]     // Catch: java.lang.Throwable -> Lf10
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> Lf10
            r5 = r7 ^ 152(0x98, float:2.13E-43)
            r11 = r7 & 152(0x98, float:2.13E-43)
            r5 = r5 | r11
            short r5 = (short) r5     // Catch: java.lang.Throwable -> Lf10
            r11 = r27[r36]     // Catch: java.lang.Throwable -> Lf10
            int r11 = -r11
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> Lf10
            java.lang.String r2 = $$c(r2, r5, r11)     // Catch: java.lang.Throwable -> Lf10
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lf10
            r5 = r27[r40]     // Catch: java.lang.Throwable -> Lf10
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> Lf10
            r11 = 533(0x215, float:7.47E-43)
            short r11 = (short) r11     // Catch: java.lang.Throwable -> Lf10
            r58 = r13
            r13 = r27[r20]     // Catch: java.lang.Throwable -> Lf10
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> Lf10
            java.lang.String r5 = $$c(r5, r11, r13)     // Catch: java.lang.Throwable -> Lf10
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            java.lang.Class[] r11 = new java.lang.Class[]{r11, r8, r13, r8, r8}     // Catch: java.lang.Throwable -> Lf10
            java.lang.reflect.Method r2 = r2.getMethod(r5, r11)     // Catch: java.lang.Throwable -> Lf10
            r5 = 0
            r2.invoke(r5, r12)     // Catch: java.lang.Throwable -> Lf10
            byte r2 = com.appsflyer.internal.AFi1jSDK.afErrorLogForExcManagerOnly     // Catch: java.lang.Throwable -> Lefb
            long r11 = com.appsflyer.internal.AFi1jSDK.afDebugLog     // Catch: java.lang.Throwable -> Lefb
            com.appsflyer.internal.AFk1oSDK.AFAdRevenueData(r1, r2, r11)     // Catch: java.lang.Throwable -> Lefb
            byte[][] r2 = com.appsflyer.internal.AFk1vSDK.getMonetizationNetwork(r57)     // Catch: java.lang.Throwable -> Lefb
            r5 = r25
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lef3
            r31 = 3
            r11[r31] = r2     // Catch: java.lang.Throwable -> Lef3
            r45 = 2
            r11[r45] = r1     // Catch: java.lang.Throwable -> Lef3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r54)     // Catch: java.lang.Throwable -> Lef3
            r32 = 1
            r11[r32] = r1     // Catch: java.lang.Throwable -> Lef3
            r11[r28] = r58     // Catch: java.lang.Throwable -> Lef3
            r1 = 175(0xaf, float:2.45E-43)
            r1 = r27[r1]     // Catch: java.lang.Throwable -> Lef3
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> Lef3
            r2 = 541(0x21d, float:7.58E-43)
            short r2 = (short) r2     // Catch: java.lang.Throwable -> Lef3
            byte r5 = (byte) r7     // Catch: java.lang.Throwable -> Lef3
            java.lang.String r1 = $$c(r1, r2, r5)     // Catch: java.lang.Throwable -> Lef3
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Lef3
            r2 = r27[r34]     // Catch: java.lang.Throwable -> Lef3
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> Lef3
            r5 = r7 ^ 392(0x188, float:5.5E-43)
            r12 = r7 & 392(0x188, float:5.5E-43)
            r5 = r5 | r12
            short r5 = (short) r5     // Catch: java.lang.Throwable -> Lef3
            r12 = r27[r36]     // Catch: java.lang.Throwable -> Lef3
            int r12 = -r12
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> Lef3
            java.lang.String r2 = $$c(r2, r5, r12)     // Catch: java.lang.Throwable -> Lef3
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lef3
            java.lang.Class<byte[][]> r5 = byte[][].class
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r8, r9, r5}     // Catch: java.lang.Throwable -> Lef3
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> Lef3
            java.lang.Object r1 = r1.newInstance(r11)     // Catch: java.lang.Throwable -> Lef3
            r54 = r14
            r31 = 3
            goto L1017
        Lef3:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> Lefb
            if (r1 == 0) goto Lf0f
            throw r1     // Catch: java.lang.Throwable -> Lefb
        Lefb:
            r0 = move-exception
        Lefc:
            r1 = r0
            r8 = r3
            r59 = r9
            r7 = r10
            r54 = r14
            r55 = r15
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            r30 = 16
            r31 = 3
            goto Lc79
        Lf0f:
            throw r0     // Catch: java.lang.Throwable -> Lefb
        Lf10:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> Lefb
            if (r1 == 0) goto Lf18
            throw r1     // Catch: java.lang.Throwable -> Lefb
        Lf18:
            throw r0     // Catch: java.lang.Throwable -> Lefb
        Lf19:
            r0 = move-exception
            r60 = r11
            r61 = r12
            goto Lefc
        Lf1f:
            r27 = r1
            r58 = r2
            r60 = r11
            r61 = r12
            com.appsflyer.internal.AFi1jSDK.force = r54     // Catch: java.lang.Throwable -> L1ebf
            r2 = 16
            byte[] r1 = new byte[r2]     // Catch: java.lang.Throwable -> L1ee5
            r1 = {x2166: FILL_ARRAY_DATA , data: [-57, 74, 97, -120, 94, 19, 58, 33, -64, 87, -122, -70, 72, 36, -119, -44} // fill-array     // Catch: java.lang.Throwable -> L1ed2
            r2 = r28
            int r11 = android.view.View.resolveSizeAndState(r2, r2, r2)     // Catch: java.lang.Throwable -> L1ebf
            int r2 = -r11
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1ebf
            int r11 = (int) r11     // Catch: java.lang.Throwable -> L1ebf
            int r12 = r2 * (-661)
            r13 = r12 ^ (-5288(0xffffffffffffeb58, float:NaN))
            r12 = r12 & (-5288(0xffffffffffffeb58, float:NaN))
            r32 = 1
            int r12 = r12 << 1
            int r13 = r13 + r12
            int r12 = ~r11     // Catch: java.lang.Throwable -> L1ebf
            r54 = r1
            int r1 = ~r2     // Catch: java.lang.Throwable -> L1ebf
            r1 = r1 | (-9)
            int r1 = ~r1     // Catch: java.lang.Throwable -> L1ebf
            r55 = r12 ^ r1
            r1 = r1 & r12
            r1 = r55 | r1
            int r1 = r1 * 1324
            int r1 = -r1
            int r1 = -r1
            r12 = r13 ^ r1
            r1 = r1 & r13
            r32 = 1
            int r1 = r1 << 1
            int r12 = r12 + r1
            r1 = r2 ^ r11
            r13 = r2 & r11
            r1 = r1 | r13
            int r1 = ~r1     // Catch: java.lang.Throwable -> L1ebf
            r11 = r11 | 8
            int r11 = ~r11     // Catch: java.lang.Throwable -> L1ebf
            r13 = r1 ^ r11
            r1 = r1 & r11
            r1 = r1 | r13
            int r1 = r1 * (-1324)
            r11 = r12 & r1
            r1 = r1 | r12
            int r11 = r11 + r1
            int r1 = ~r2     // Catch: java.lang.Throwable -> L1ebf
            r12 = r1 ^ 8
            r1 = r1 & 8
            r1 = r1 | r12
            int r1 = ~r1     // Catch: java.lang.Throwable -> L1ebf
            r12 = -9
            r13 = r12 ^ r2
            r2 = r2 & r12
            r2 = r2 | r13
            int r2 = ~r2     // Catch: java.lang.Throwable -> L1ebf
            r12 = r1 ^ r2
            r1 = r1 & r2
            r1 = r1 | r12
            int r1 = r1 * 662
            int r11 = r11 + r1
            byte r1 = (byte) r11     // Catch: java.lang.Throwable -> L1ebf
            long r11 = com.appsflyer.internal.AFi1jSDK.force     // Catch: java.lang.Throwable -> L1ebf
            long r62 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L1ebf
            r2 = 48
            long r62 = r62 >> r2
            r64 = -145202235486838143(0xfdfc23560d36e281, double:-7.360874818362942E298)
            long r62 = r62 + r64
            long r11 = r11 ^ r62
            int r2 = (int) r11
            int r11 = com.appsflyer.internal.AFi1jSDK.$10
            r12 = r11 | 59
            r32 = 1
            int r12 = r12 << 1
            r11 = r11 ^ 59
            int r12 = r12 - r11
            int r12 = r12 % 128
            com.appsflyer.internal.AFi1jSDK.$11 = r12
            r11 = 4
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L1ea9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1e97
            r31 = 3
            r12[r31] = r2     // Catch: java.lang.Throwable -> L1e8f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1e8f
            r45 = 2
            r12[r45] = r1     // Catch: java.lang.Throwable -> L1e8f
            r32 = 1
            r12[r32] = r54     // Catch: java.lang.Throwable -> L1e8f
            r28 = 0
            r12[r28] = r58     // Catch: java.lang.Throwable -> L1e8f
            r1 = 904(0x388, float:1.267E-42)
            r1 = r27[r1]     // Catch: java.lang.Throwable -> L1e8f
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L1e8f
            r2 = r1 | 539(0x21b, float:7.55E-43)
            short r2 = (short) r2     // Catch: java.lang.Throwable -> L1e8f
            byte r11 = (byte) r7     // Catch: java.lang.Throwable -> L1e8f
            java.lang.String r1 = $$c(r1, r2, r11)     // Catch: java.lang.Throwable -> L1e8f
            java.lang.Object r2 = com.appsflyer.internal.AFi1jSDK.f6304i     // Catch: java.lang.Throwable -> L1e8f
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2     // Catch: java.lang.Throwable -> L1e8f
            r11 = 1
            java.lang.Class r1 = java.lang.Class.forName(r1, r11, r2)     // Catch: java.lang.Throwable -> L1e8f
            r2 = r27[r22]     // Catch: java.lang.Throwable -> L1e8f
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1e8f
            r13 = r7 | 537(0x219, float:7.52E-43)
            short r13 = (short) r13     // Catch: java.lang.Throwable -> L1e8f
            r25 = 4
            r32 = r7 | 4
            int r54 = r32 << 1
            r11 = r7 ^ 4
            int r11 = r54 - r11
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1e8f
            java.lang.String r2 = $$c(r2, r13, r11)     // Catch: java.lang.Throwable -> L1e8f
            r11 = r27[r34]     // Catch: java.lang.Throwable -> L1e8f
            byte r11 = (byte) r11
            r13 = r7 ^ 392(0x188, float:5.5E-43)
            r54 = r13
            r13 = r7 & 392(0x188, float:5.5E-43)
            r13 = r54 | r13
            short r13 = (short) r13
            r54 = r14
            r14 = r27[r36]     // Catch: java.lang.Throwable -> L1e7f
            int r14 = -r14
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1e7f
            java.lang.String r11 = $$c(r11, r13, r14)     // Catch: java.lang.Throwable -> L1e7f
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L1e7f
            java.lang.Class[] r11 = new java.lang.Class[]{r11, r9, r8, r8}     // Catch: java.lang.Throwable -> L1e7f
            java.lang.reflect.Method r1 = r1.getMethod(r2, r11)     // Catch: java.lang.Throwable -> L1e7f
            java.lang.Object r1 = r1.invoke(r5, r12)     // Catch: java.lang.Throwable -> L1e7f
        L1017:
            r2 = r27[r34]     // Catch: java.lang.Throwable -> L1e70
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1e70
            r5 = r7 | 392(0x188, float:5.5E-43)
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L1e70
            r11 = r27[r36]     // Catch: java.lang.Throwable -> L1e70
            int r11 = -r11
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1e70
            java.lang.String r2 = $$c(r2, r5, r11)     // Catch: java.lang.Throwable -> L1e70
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1e70
            r5 = r27[r24]     // Catch: java.lang.Throwable -> L1e70
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1e70
            r11 = 624(0x270, float:8.74E-43)
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L1e70
            r30 = 16
            r12 = r7 ^ 16
            r13 = r7 & 16
            r12 = r12 | r13
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1e70
            java.lang.String r5 = $$c(r5, r11, r12)     // Catch: java.lang.Throwable -> L1e70
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L1e70
            java.lang.Class[] r11 = new java.lang.Class[]{r11}     // Catch: java.lang.Throwable -> L1e70
            java.lang.reflect.Method r2 = r2.getMethod(r5, r11)     // Catch: java.lang.Throwable -> L1e70
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)     // Catch: java.lang.Throwable -> L1e70
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L1e70
            r2.invoke(r1, r5)     // Catch: java.lang.Throwable -> L1e70
            if (r35 == 0) goto L1579
            long r11 = java.lang.System.currentTimeMillis()
            int r2 = (int) r11
            r5 = -1733974192(0xffffffff98a5a750, float:-4.2820443E-24)
            r11 = r5 ^ r2
            r12 = r5 & r2
            r11 = r11 | r12
            r12 = -1692771711(0xffffffff9b1a5a81, float:-1.2767825E-22)
            r13 = r11 ^ r12
            r11 = r11 & r12
            r11 = r11 | r13
            int r11 = r11 * (-676)
            int r11 = ~r11
            r13 = -1534059691(0xffffffffa4901b55, float:-6.249635E-17)
            int r13 = r13 - r11
            int r11 = ~r2
            r14 = r11 ^ r5
            r5 = r5 & r11
            r5 = r5 | r14
            int r5 = ~r5
            r11 = 1681915950(0x6440002e, float:1.4167151E22)
            r5 = r5 | r11
            int r5 = r5 * 676
            r11 = r13 & r5
            r5 = r5 | r13
            int r11 = r11 + r5
            int r5 = ~r2
            r5 = r5 | r12
            int r5 = ~r5
            r12 = 10855760(0xa5a550, float:1.521216E-38)
            r13 = r12 ^ r5
            r5 = r5 & r12
            r5 = r5 | r13
            r12 = -52058242(0xfffffffffce5a77e, float:-9.539465E36)
            r13 = r12 ^ r2
            r2 = r2 & r12
            r2 = r2 | r13
            int r2 = ~r2
            r2 = r2 | r5
            int r2 = r2 * 676
            int r2 = -r2
            int r2 = -r2
            r5 = r11 | r2
            r32 = 1
            int r5 = r5 << 1
            r2 = r2 ^ r11
            int r5 = r5 - r2
            long r11 = java.lang.System.currentTimeMillis()
            int r2 = (int) r11
            int r2 = ~r2
            r11 = -1973330709(0xffffffff8a615ceb, float:-1.0850832E-32)
            r12 = r2 ^ r11
            r13 = r2 & r11
            r12 = r12 | r13
            int r12 = ~r12
            r13 = -1975446357(0xffffffff8a4114ab, float:-9.296499E-33)
            r14 = r13 ^ r12
            r12 = r12 & r13
            r12 = r12 | r14
            int r12 = r12 * (-970)
            r13 = -1647435443(0xffffffff9dce214d, float:-5.456218E-21)
            int r13 = r13 + r12
            r12 = 1358574160(0x50fa3250, float:3.358081E10)
            r14 = r13 & r12
            r12 = r12 | r13
            int r14 = r14 + r12
            r12 = r2 ^ r11
            r2 = r2 & r11
            r2 = r2 | r12
            int r2 = ~r2
            r11 = 2115648(0x204840, float:2.964654E-39)
            r2 = r2 | r11
            int r2 = r2 * 970
            int r2 = -r2
            int r2 = -r2
            r11 = r14 | r2
            r32 = 1
            int r11 = r11 << 1
            r2 = r2 ^ r14
            int r11 = r11 - r2
            if (r5 <= r11) goto L1570
            java.lang.Object r2 = com.appsflyer.internal.AFi1jSDK.f6303e     // Catch: java.lang.Throwable -> L1567
            if (r2 != 0) goto L10dd
            r5 = r49
            goto L10df
        L10dd:
            r5 = r39
        L10df:
            if (r2 != 0) goto L10e4
            r2 = r53
            goto L10e6
        L10e4:
            r2 = r47
        L10e6:
            r11 = r27[r34]     // Catch: java.lang.Throwable -> L1567
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1567
            r12 = r7 ^ 392(0x188, float:5.5E-43)
            r13 = r7 & 392(0x188, float:5.5E-43)
            r12 = r12 | r13
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L1567
            r13 = r27[r36]     // Catch: java.lang.Throwable -> L1567
            int r13 = -r13
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1567
            java.lang.String r11 = $$c(r11, r12, r13)     // Catch: java.lang.Throwable -> L1567
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L1567
            r12 = r27[r24]     // Catch: java.lang.Throwable -> L1567
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1567
            r13 = r12 ^ 624(0x270, float:8.74E-43)
            r14 = r12 & 624(0x270, float:8.74E-43)
            r13 = r13 | r14
            short r13 = (short) r13     // Catch: java.lang.Throwable -> L1567
            r14 = r13 & 477(0x1dd, float:6.68E-43)
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1567
            java.lang.String r12 = $$c(r12, r13, r14)     // Catch: java.lang.Throwable -> L1567
            java.lang.Class[] r13 = new java.lang.Class[]{r9, r8, r8}     // Catch: java.lang.Throwable -> L1567
            java.lang.reflect.Method r11 = r11.getMethod(r12, r13)     // Catch: java.lang.Throwable -> L1567
            r12 = r27[r26]     // Catch: java.lang.Throwable -> L1567
            int r12 = -r12
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1567
            r13 = r7 ^ 260(0x104, float:3.64E-43)
            r14 = r7 & 260(0x104, float:3.64E-43)
            r13 = r13 | r14
            short r13 = (short) r13     // Catch: java.lang.Throwable -> L1567
            r14 = r27[r36]     // Catch: java.lang.Throwable -> L1567
            int r14 = -r14
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1567
            java.lang.String r12 = $$c(r12, r13, r14)     // Catch: java.lang.Throwable -> L1567
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L1567
            r32 = 1
            r13 = r27[r32]     // Catch: java.lang.Throwable -> L1467 java.lang.Exception -> L146e
            byte r13 = (byte) r13
            r14 = r7 | 128(0x80, float:1.8E-43)
            short r14 = (short) r14
            r55 = r15
            r15 = r27[r36]     // Catch: java.lang.Throwable -> L145d java.lang.Exception -> L1462
            int r15 = -r15
            byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L145d java.lang.Exception -> L1462
            java.lang.String r13 = $$c(r13, r14, r15)     // Catch: java.lang.Throwable -> L145d java.lang.Exception -> L1462
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch: java.lang.Throwable -> L145d java.lang.Exception -> L1462
            java.lang.Class[] r13 = new java.lang.Class[]{r13}     // Catch: java.lang.Throwable -> L145d java.lang.Exception -> L1462
            java.lang.reflect.Constructor r13 = r12.getConstructor(r13)     // Catch: java.lang.Throwable -> L145d java.lang.Exception -> L1462
            java.lang.Object[] r14 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L145d java.lang.Exception -> L1462
            java.lang.Object r13 = r13.newInstance(r14)     // Catch: java.lang.Throwable -> L145d java.lang.Exception -> L1462
            if (r61 == 0) goto L11a8
            r32 = 1
            r14 = r27[r32]     // Catch: java.lang.Throwable -> L1193
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1193
            r15 = r7 ^ 128(0x80, float:1.8E-43)
            r57 = r15
            r15 = r7 & 128(0x80, float:1.8E-43)
            r15 = r57 | r15
            short r15 = (short) r15     // Catch: java.lang.Throwable -> L1193
            r57 = r6
            r6 = r27[r36]     // Catch: java.lang.Throwable -> L1193
            int r6 = -r6
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1193
            java.lang.String r6 = $$c(r14, r15, r6)     // Catch: java.lang.Throwable -> L1193
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L1193
            r14 = r27[r37]     // Catch: java.lang.Throwable -> L1193
            byte r14 = (byte) r14
            r15 = r7 ^ 564(0x234, float:7.9E-43)
            r58 = r15
            r15 = r7 & 564(0x234, float:7.9E-43)
            r15 = r58 | r15
            short r15 = (short) r15
            r58 = r3
            r3 = r15 & 475(0x1db, float:6.66E-43)
            byte r3 = (byte) r3
            java.lang.String r3 = $$c(r14, r15, r3)     // Catch: java.lang.Throwable -> L1191
            r14 = 0
            java.lang.reflect.Method r3 = r6.getMethod(r3, r14)     // Catch: java.lang.Throwable -> L1191
            java.lang.Object r3 = r3.invoke(r5, r14)     // Catch: java.lang.Throwable -> L1191
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L1191
            r3.getClass()     // Catch: java.lang.Throwable -> L1191
            goto L11ac
        L1191:
            r0 = move-exception
            goto L1196
        L1193:
            r0 = move-exception
            r58 = r3
        L1196:
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L119d java.lang.Exception -> L11a2
            if (r1 == 0) goto L11a7
            throw r1     // Catch: java.lang.Throwable -> L119d java.lang.Exception -> L11a2
        L119d:
            r0 = move-exception
        L119e:
            r30 = 16
            goto L14e0
        L11a2:
            r0 = move-exception
        L11a3:
            r30 = 16
            goto L1475
        L11a7:
            throw r0     // Catch: java.lang.Throwable -> L119d java.lang.Exception -> L11a2
        L11a8:
            r58 = r3
            r57 = r6
        L11ac:
            int r3 = com.appsflyer.internal.AFi1jSDK.$10
            int r3 = r3 + 3
            int r3 = r3 % 128
            com.appsflyer.internal.AFi1jSDK.$11 = r3
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r3]     // Catch: java.lang.Throwable -> L119d
            r14 = r27[r41]     // Catch: java.lang.Throwable -> L119d
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L119d
            r15 = r14 ^ 640(0x280, float:8.97E-43)
            r3 = r14 & 640(0x280, float:8.97E-43)
            r3 = r3 | r15
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L119d
            r15 = r7 ^ 20
            r7 = r7 & 20
            r7 = r7 | r15
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L119d
            java.lang.String r3 = $$c(r14, r3, r7)     // Catch: java.lang.Throwable -> L119d
            java.lang.Class[] r7 = new java.lang.Class[]{r9, r8, r8}     // Catch: java.lang.Throwable -> L119d
            java.lang.reflect.Method r3 = r12.getMethod(r3, r7)     // Catch: java.lang.Throwable -> L119d
        L11d3:
            if (r0 <= 0) goto L1287
            r28 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r28)     // Catch: java.lang.Throwable -> L119d
            r8 = 1024(0x400, float:1.435E-42)
            int r14 = java.lang.Math.min(r8, r0)     // Catch: java.lang.Throwable -> L119d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L119d
            java.lang.Object[] r7 = new java.lang.Object[]{r6, r7, r14}     // Catch: java.lang.Throwable -> L119d
            java.lang.Object r7 = r11.invoke(r1, r7)     // Catch: java.lang.Throwable -> L119d
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L119d
            int r14 = r7.intValue()     // Catch: java.lang.Throwable -> L119d
            r15 = -1
            if (r14 == r15) goto L1287
            int r15 = com.appsflyer.internal.AFi1jSDK.$10
            r27 = r15 ^ 109(0x6d, float:1.53E-43)
            r15 = r15 & 109(0x6d, float:1.53E-43)
            r32 = 1
            int r15 = r15 << 1
            int r15 = r27 + r15
            int r15 = r15 % 128
            com.appsflyer.internal.AFi1jSDK.$11 = r15
            r28 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r28)     // Catch: java.lang.Throwable -> L119d
            java.lang.Object[] r7 = new java.lang.Object[]{r6, r15, r7}     // Catch: java.lang.Throwable -> L119d
            r3.invoke(r13, r7)     // Catch: java.lang.Throwable -> L119d
            int r7 = -r14
            long r14 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L119d
            int r14 = (int) r14     // Catch: java.lang.Throwable -> L119d
            int r15 = r7 * (-183)
            int r8 = r0 * (-183)
            r27 = r15 | r8
            r32 = 1
            int r27 = r27 << 1
            r8 = r8 ^ r15
            int r27 = r27 - r8
            int r8 = ~r7     // Catch: java.lang.Throwable -> L119d
            int r15 = ~r14     // Catch: java.lang.Throwable -> L119d
            r62 = r8 ^ r15
            r63 = r8 & r15
            r62 = r62 | r63
            r63 = r1
            r1 = r62 | r0
            int r1 = ~r1     // Catch: java.lang.Throwable -> L119d
            r62 = r1
            int r1 = ~r0     // Catch: java.lang.Throwable -> L119d
            int r14 = ~r14     // Catch: java.lang.Throwable -> L119d
            r64 = r1 ^ r14
            r65 = r1 & r14
            r64 = r64 | r65
            r65 = r64 ^ r7
            r64 = r64 & r7
            r66 = r1
            r1 = r65 | r64
            int r1 = ~r1     // Catch: java.lang.Throwable -> L119d
            r1 = r62 | r1
            int r1 = r1 * (-184)
            r62 = r27 ^ r1
            r1 = r27 & r1
            r32 = 1
            int r1 = r1 << 1
            int r62 = r62 + r1
            r1 = r8 ^ r66
            r8 = r8 & r66
            r1 = r1 | r8
            int r1 = ~r1     // Catch: java.lang.Throwable -> L119d
            int r8 = ~r7     // Catch: java.lang.Throwable -> L119d
            r27 = r8 ^ r14
            r8 = r8 & r14
            r8 = r27 | r8
            int r8 = ~r8     // Catch: java.lang.Throwable -> L119d
            r1 = r1 | r8
            r8 = r66 ^ r15
            r14 = r66 & r15
            r8 = r8 | r14
            int r8 = ~r8     // Catch: java.lang.Throwable -> L119d
            r14 = r1 ^ r8
            r1 = r1 & r8
            r1 = r1 | r14
            int r1 = r1 * 184
            r8 = r62 | r1
            r32 = 1
            int r8 = r8 << 1
            r1 = r62 ^ r1
            int r8 = r8 - r1
            r1 = r7 ^ r0
            r0 = r0 & r7
            r0 = r0 | r1
            int r0 = r0 * 184
            int r0 = -r0
            int r0 = -r0
            r1 = r8 & r0
            r0 = r0 | r8
            int r0 = r0 + r1
            r1 = r63
            goto L11d3
        L1287:
            byte[] r0 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L119d
            r1 = r0[r41]     // Catch: java.lang.Throwable -> L119d
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L119d
            r3 = 648(0x288, float:9.08E-43)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L119d
            int r6 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L119d
            r25 = 4
            r7 = r6 & 4
            r8 = r6 | 4
            int r7 = r7 + r8
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L119d
            java.lang.String r1 = $$c(r1, r3, r7)     // Catch: java.lang.Throwable -> L119d
            r3 = 0
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L119d
            java.lang.reflect.Method r1 = r12.getMethod(r1, r7)     // Catch: java.lang.Throwable -> L119d
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L119d
            java.lang.Object r1 = r1.invoke(r13, r7)     // Catch: java.lang.Throwable -> L119d
            r3 = r0[r22]     // Catch: java.lang.Throwable -> L119d
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L119d
            r7 = 652(0x28c, float:9.14E-43)
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L119d
            r8 = r0[r36]     // Catch: java.lang.Throwable -> L119d
            int r8 = -r8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L119d
            java.lang.String r3 = $$c(r3, r7, r8)     // Catch: java.lang.Throwable -> L119d
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L119d
            r7 = r0[r24]     // Catch: java.lang.Throwable -> L119d
            byte r7 = (byte) r7
            r8 = 673(0x2a1, float:9.43E-43)
            short r8 = (short) r8
            r30 = 16
            r11 = r6 | 16
            byte r11 = (byte) r11
            java.lang.String r7 = $$c(r7, r8, r11)     // Catch: java.lang.Throwable -> L1448
            r8 = 0
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L1448
            java.lang.reflect.Method r3 = r3.getMethod(r7, r11)     // Catch: java.lang.Throwable -> L1448
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L1448
            r3.invoke(r1, r7)     // Catch: java.lang.Throwable -> L1448
            r1 = r0[r41]     // Catch: java.lang.Throwable -> L1448
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L1448
            r3 = r1 | 345(0x159, float:4.83E-43)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L1448
            byte r7 = (byte) r6     // Catch: java.lang.Throwable -> L1448
            java.lang.String r1 = $$c(r1, r3, r7)     // Catch: java.lang.Throwable -> L1448
            r3 = 0
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L1448
            java.lang.reflect.Method r1 = r12.getMethod(r1, r7)     // Catch: java.lang.Throwable -> L1448
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1448
            r1.invoke(r13, r7)     // Catch: java.lang.Throwable -> L1448
            r1 = r0[r21]     // Catch: java.lang.Throwable -> L1448
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L1448
            r3 = 676(0x2a4, float:9.47E-43)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L1448
            r19 = 426(0x1aa, float:5.97E-43)
            r7 = r0[r19]     // Catch: java.lang.Throwable -> L1448
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1448
            java.lang.String r1 = $$c(r1, r3, r7)     // Catch: java.lang.Throwable -> L1448
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1448
            r3 = 198(0xc6, float:2.77E-43)
            r3 = r0[r3]     // Catch: java.lang.Throwable -> L1448
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1448
            r7 = 696(0x2b8, float:9.75E-43)
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L1448
            r13 = 9
            r8 = r6 ^ 9
            r11 = r6 & 9
            r8 = r8 | r11
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1448
            java.lang.String r3 = $$c(r3, r7, r8)     // Catch: java.lang.Throwable -> L1448
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1448
            java.lang.Class[] r7 = new java.lang.Class[]{r10, r10, r7}     // Catch: java.lang.Throwable -> L1448
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r7)     // Catch: java.lang.Throwable -> L1448
            r32 = 1
            r3 = r0[r32]     // Catch: java.lang.Throwable -> L1454
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1454
            r7 = r6 ^ 128(0x80, float:1.8E-43)
            r8 = r6 & 128(0x80, float:1.8E-43)
            r7 = r7 | r8
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L1454
            r8 = r0[r36]     // Catch: java.lang.Throwable -> L1454
            int r8 = -r8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1454
            java.lang.String r3 = $$c(r3, r7, r8)     // Catch: java.lang.Throwable -> L1454
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L1454
            r7 = r0[r33]     // Catch: java.lang.Throwable -> L1454
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1454
            r8 = r7 ^ 688(0x2b0, float:9.64E-43)
            r11 = r7 & 688(0x2b0, float:9.64E-43)
            r8 = r8 | r11
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L1454
            r25 = 4
            r11 = r6 & 4
            r12 = r6 | 4
            int r11 = r11 + r12
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1454
            java.lang.String r7 = $$c(r7, r8, r11)     // Catch: java.lang.Throwable -> L1454
            r14 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r7, r14)     // Catch: java.lang.Throwable -> L1454
            java.lang.Object r3 = r3.invoke(r5, r14)     // Catch: java.lang.Throwable -> L1454
            r32 = 1
            r7 = r0[r32]     // Catch: java.lang.Throwable -> L144b
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L144b
            r8 = r6 ^ 128(0x80, float:1.8E-43)
            r11 = r6 & 128(0x80, float:1.8E-43)
            r8 = r8 | r11
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L144b
            r11 = r0[r36]     // Catch: java.lang.Throwable -> L144b
            int r11 = -r11
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L144b
            java.lang.String r7 = $$c(r7, r8, r11)     // Catch: java.lang.Throwable -> L144b
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L144b
            r8 = r0[r33]     // Catch: java.lang.Throwable -> L144b
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L144b
            r11 = r8 ^ 688(0x2b0, float:9.64E-43)
            r12 = r8 & 688(0x2b0, float:9.64E-43)
            r11 = r11 | r12
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L144b
            int r12 = r6 + 4
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L144b
            java.lang.String r8 = $$c(r8, r11, r12)     // Catch: java.lang.Throwable -> L144b
            r14 = 0
            java.lang.reflect.Method r7 = r7.getMethod(r8, r14)     // Catch: java.lang.Throwable -> L144b
            java.lang.Object r7 = r7.invoke(r2, r14)     // Catch: java.lang.Throwable -> L144b
            r28 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r28)     // Catch: java.lang.Throwable -> L1448
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r7, r8}     // Catch: java.lang.Throwable -> L1448
            java.lang.Object r1 = r1.invoke(r14, r3)     // Catch: java.lang.Throwable -> L1448
            r32 = 1
            r3 = r0[r32]     // Catch: java.lang.Throwable -> L143f
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L143f
            r7 = r6 | 128(0x80, float:1.8E-43)
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L143f
            r8 = r0[r36]     // Catch: java.lang.Throwable -> L143f
            int r8 = -r8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L143f
            java.lang.String r3 = $$c(r3, r7, r8)     // Catch: java.lang.Throwable -> L143f
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L143f
            r7 = 15
            r7 = r0[r7]     // Catch: java.lang.Throwable -> L143f
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L143f
            r8 = 716(0x2cc, float:1.003E-42)
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L143f
            r19 = 426(0x1aa, float:5.97E-43)
            r11 = r0[r19]     // Catch: java.lang.Throwable -> L143f
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L143f
            java.lang.String r7 = $$c(r7, r8, r11)     // Catch: java.lang.Throwable -> L143f
            r14 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r7, r14)     // Catch: java.lang.Throwable -> L143f
            java.lang.Object r3 = r3.invoke(r5, r14)     // Catch: java.lang.Throwable -> L143f
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L143f
            r3.getClass()     // Catch: java.lang.Throwable -> L143f
            r32 = 1
            r3 = r0[r32]     // Catch: java.lang.Throwable -> L1436
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1436
            r5 = r6 | 128(0x80, float:1.8E-43)
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L1436
            r7 = r0[r36]     // Catch: java.lang.Throwable -> L1436
            int r7 = -r7
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1436
            java.lang.String r3 = $$c(r3, r5, r7)     // Catch: java.lang.Throwable -> L1436
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L1436
            r5 = 15
            r5 = r0[r5]     // Catch: java.lang.Throwable -> L1436
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1436
            r19 = 426(0x1aa, float:5.97E-43)
            r7 = r0[r19]     // Catch: java.lang.Throwable -> L1436
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1436
            java.lang.String r5 = $$c(r5, r8, r7)     // Catch: java.lang.Throwable -> L1436
            r14 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r5, r14)     // Catch: java.lang.Throwable -> L1436
            java.lang.Object r2 = r3.invoke(r2, r14)     // Catch: java.lang.Throwable -> L1436
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L1436
            r2.getClass()     // Catch: java.lang.Throwable -> L1436
            java.lang.Object r2 = com.appsflyer.internal.AFi1jSDK.f6304i     // Catch: java.lang.Throwable -> L1418
            if (r2 != 0) goto L142e
            java.lang.Class<com.appsflyer.internal.AFi1jSDK> r2 = com.appsflyer.internal.AFi1jSDK.class
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            r5 = 670(0x29e, float:9.39E-43)
            r0 = r0[r5]     // Catch: java.lang.Throwable -> L1425
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1425
            r5 = 721(0x2d1, float:1.01E-42)
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L1425
            int r6 = r6 + 4
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1425
            java.lang.String r0 = $$c(r0, r5, r6)     // Catch: java.lang.Throwable -> L1425
            r14 = 0
            java.lang.reflect.Method r0 = r3.getMethod(r0, r14)     // Catch: java.lang.Throwable -> L1425
            java.lang.Object r0 = r0.invoke(r2, r14)     // Catch: java.lang.Throwable -> L1425
            com.appsflyer.internal.AFi1jSDK.f6304i = r0     // Catch: java.lang.Throwable -> L1418
            goto L142e
        L1418:
            r0 = move-exception
        L1419:
            r1 = r0
            r59 = r9
            r7 = r10
        L141d:
            r8 = r58
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            goto Lc79
        L1425:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1418
            if (r1 == 0) goto L142d
            throw r1     // Catch: java.lang.Throwable -> L1418
        L142d:
            throw r0     // Catch: java.lang.Throwable -> L1418
        L142e:
            r59 = r9
            r27 = r10
            r44 = 5
            goto L1a8b
        L1436:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1418
            if (r1 == 0) goto L143e
            throw r1     // Catch: java.lang.Throwable -> L1418
        L143e:
            throw r0     // Catch: java.lang.Throwable -> L1418
        L143f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1418
            if (r1 == 0) goto L1447
            throw r1     // Catch: java.lang.Throwable -> L1418
        L1447:
            throw r0     // Catch: java.lang.Throwable -> L1418
        L1448:
            r0 = move-exception
            goto L14e0
        L144b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1448
            if (r1 == 0) goto L1453
            throw r1     // Catch: java.lang.Throwable -> L1448
        L1453:
            throw r0     // Catch: java.lang.Throwable -> L1448
        L1454:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1448
            if (r1 == 0) goto L145c
            throw r1     // Catch: java.lang.Throwable -> L1448
        L145c:
            throw r0     // Catch: java.lang.Throwable -> L1448
        L145d:
            r0 = move-exception
            r58 = r3
            goto L119e
        L1462:
            r0 = move-exception
            r58 = r3
            goto L11a3
        L1467:
            r0 = move-exception
            r58 = r3
            r55 = r15
            goto L119e
        L146e:
            r0 = move-exception
            r58 = r3
            r55 = r15
            goto L11a3
        L1475:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1448
            r1.<init>()     // Catch: java.lang.Throwable -> L1448
            byte[] r3 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L1448
            r4 = r3[r41]     // Catch: java.lang.Throwable -> L1448
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L1448
            r6 = 640(0x280, float:8.97E-43)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L1448
            r7 = r3[r16]     // Catch: java.lang.Throwable -> L1448
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1448
            java.lang.String r4 = $$c(r4, r6, r7)     // Catch: java.lang.Throwable -> L1448
            r1.append(r4)     // Catch: java.lang.Throwable -> L1448
            r1.append(r5)     // Catch: java.lang.Throwable -> L1448
            r4 = r3[r43]     // Catch: java.lang.Throwable -> L1448
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L1448
            r6 = 292(0x124, float:4.09E-43)
            r7 = r4 ^ 292(0x124, float:4.09E-43)
            r8 = r4 & 292(0x124, float:4.09E-43)
            r6 = r7 | r8
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L1448
            r7 = r3[r40]     // Catch: java.lang.Throwable -> L1448
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1448
            java.lang.String r4 = $$c(r4, r6, r7)     // Catch: java.lang.Throwable -> L1448
            r1.append(r4)     // Catch: java.lang.Throwable -> L1448
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1448
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L14d7
            r32 = 1
            r6[r32] = r0     // Catch: java.lang.Throwable -> L14d7
            r28 = 0
            r6[r28] = r1     // Catch: java.lang.Throwable -> L14d7
            r0 = r3[r34]     // Catch: java.lang.Throwable -> L14d7
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L14d7
            r1 = 292(0x124, float:4.09E-43)
            short r4 = (short) r1     // Catch: java.lang.Throwable -> L14d7
            r1 = r3[r36]     // Catch: java.lang.Throwable -> L14d7
            int r1 = -r1
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L14d7
            java.lang.String r0 = $$c(r0, r4, r1)     // Catch: java.lang.Throwable -> L14d7
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L14d7
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.Class[] r1 = new java.lang.Class[]{r10, r1}     // Catch: java.lang.Throwable -> L14d7
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L14d7
            java.lang.Object r0 = r0.newInstance(r6)     // Catch: java.lang.Throwable -> L14d7
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L14d7
            throw r0     // Catch: java.lang.Throwable -> L14d7
        L14d7:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1448
            if (r1 == 0) goto L14df
            throw r1     // Catch: java.lang.Throwable -> L1448
        L14df:
            throw r0     // Catch: java.lang.Throwable -> L1448
        L14e0:
            byte[] r1 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L155e
            r32 = 1
            r3 = r1[r32]     // Catch: java.lang.Throwable -> L155e
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L155e
            int r4 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L155e
            r6 = r4 | 128(0x80, float:1.8E-43)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L155e
            r7 = r1[r36]     // Catch: java.lang.Throwable -> L155e
            int r7 = -r7
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L155e
            java.lang.String r3 = $$c(r3, r6, r7)     // Catch: java.lang.Throwable -> L155e
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L155e
            r6 = 15
            r6 = r1[r6]     // Catch: java.lang.Throwable -> L155e
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L155e
            r7 = 716(0x2cc, float:1.003E-42)
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L155e
            r19 = 426(0x1aa, float:5.97E-43)
            r8 = r1[r19]     // Catch: java.lang.Throwable -> L155e
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L155e
            java.lang.String r6 = $$c(r6, r7, r8)     // Catch: java.lang.Throwable -> L155e
            r14 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r6, r14)     // Catch: java.lang.Throwable -> L155e
            java.lang.Object r3 = r3.invoke(r5, r14)     // Catch: java.lang.Throwable -> L155e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L155e
            r3.getClass()     // Catch: java.lang.Throwable -> L155e
            int r3 = com.appsflyer.internal.AFi1jSDK.$11
            r5 = r3 | 103(0x67, float:1.44E-43)
            r32 = 1
            int r5 = r5 << 1
            r3 = r3 ^ 103(0x67, float:1.44E-43)
            int r5 = r5 - r3
            int r5 = r5 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r5
            r3 = r1[r32]     // Catch: java.lang.Throwable -> L1555
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1555
            r4 = r4 | 128(0x80, float:1.8E-43)
            short r4 = (short) r4     // Catch: java.lang.Throwable -> L1555
            r5 = r1[r36]     // Catch: java.lang.Throwable -> L1555
            int r5 = -r5
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1555
            java.lang.String r3 = $$c(r3, r4, r5)     // Catch: java.lang.Throwable -> L1555
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L1555
            r4 = 15
            r4 = r1[r4]     // Catch: java.lang.Throwable -> L1555
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L1555
            r19 = 426(0x1aa, float:5.97E-43)
            r1 = r1[r19]     // Catch: java.lang.Throwable -> L1555
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L1555
            java.lang.String r1 = $$c(r4, r7, r1)     // Catch: java.lang.Throwable -> L1555
            r14 = 0
            java.lang.reflect.Method r1 = r3.getMethod(r1, r14)     // Catch: java.lang.Throwable -> L1555
            java.lang.Object r1 = r1.invoke(r2, r14)     // Catch: java.lang.Throwable -> L1555
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L1555
            r1.getClass()     // Catch: java.lang.Throwable -> L1555
            throw r0     // Catch: java.lang.Throwable -> L1418
        L1555:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1418
            if (r1 == 0) goto L155d
            throw r1     // Catch: java.lang.Throwable -> L1418
        L155d:
            throw r0     // Catch: java.lang.Throwable -> L1418
        L155e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1418
            if (r1 == 0) goto L1566
            throw r1     // Catch: java.lang.Throwable -> L1418
        L1566:
            throw r0     // Catch: java.lang.Throwable -> L1418
        L1567:
            r0 = move-exception
            r58 = r3
            r55 = r15
            r30 = 16
            goto L1419
        L1570:
            r58 = r3
            r55 = r15
            r30 = 16
            r46 = 0
            throw r46     // Catch: java.lang.Throwable -> L1418
        L1579:
            r63 = r1
            r58 = r3
            r57 = r6
            r55 = r15
            r30 = 16
            r0 = 505(0x1f9, float:7.08E-43)
            r0 = r27[r0]     // Catch: java.lang.Throwable -> L1e42
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1e42
            r1 = r7 ^ 668(0x29c, float:9.36E-43)
            r2 = r7 & 668(0x29c, float:9.36E-43)
            r1 = r1 | r2
            short r1 = (short) r1     // Catch: java.lang.Throwable -> L1e42
            r2 = r27[r36]     // Catch: java.lang.Throwable -> L1e42
            int r2 = -r2
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1e42
            java.lang.String r0 = $$c(r0, r1, r2)     // Catch: java.lang.Throwable -> L1e42
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1e42
            r1 = r27[r34]     // Catch: java.lang.Throwable -> L1e42
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L1e42
            r2 = r7 ^ 392(0x188, float:5.5E-43)
            r3 = r7 & 392(0x188, float:5.5E-43)
            r2 = r2 | r3
            short r2 = (short) r2     // Catch: java.lang.Throwable -> L1e42
            r3 = r27[r36]     // Catch: java.lang.Throwable -> L1e42
            int r3 = -r3
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1e42
            java.lang.String r1 = $$c(r1, r2, r3)     // Catch: java.lang.Throwable -> L1e42
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1e42
            java.lang.Class[] r2 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> L1e42
            java.lang.reflect.Constructor r2 = r0.getConstructor(r2)     // Catch: java.lang.Throwable -> L1e42
            java.lang.Object[] r3 = new java.lang.Object[]{r63}     // Catch: java.lang.Throwable -> L1e42
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L1e42
            r32 = 1
            r3 = r27[r32]     // Catch: java.lang.Throwable -> L1e42
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1e42
            r5 = 761(0x2f9, float:1.066E-42)
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L1e42
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1e42
            int r6 = (int) r11     // Catch: java.lang.Throwable -> L1e42
            int r11 = r7 * (-159)
            r12 = -636(0xfffffffffffffd84, float:NaN)
            int r12 = r12 + r11
            r11 = r7 ^ (-5)
            r14 = r7 & (-5)
            r11 = r11 | r14
            int r11 = r11 * 160
            r14 = r12 | r11
            r32 = 1
            int r14 = r14 << 1
            r11 = r11 ^ r12
            int r14 = r14 - r11
            int r6 = ~r6     // Catch: java.lang.Throwable -> L1e42
            r25 = 4
            r11 = r6 ^ 4
            r12 = r6 & 4
            r11 = r11 | r12
            int r11 = ~r11     // Catch: java.lang.Throwable -> L1e42
            r12 = r7 ^ 4
            r15 = r7 & 4
            r12 = r12 | r15
            int r12 = ~r12     // Catch: java.lang.Throwable -> L1e42
            r15 = r11 ^ r12
            r11 = r11 & r12
            r11 = r11 | r15
            int r11 = r11 * (-160)
            int r11 = ~r11     // Catch: java.lang.Throwable -> L1e42
            int r14 = r14 - r11
            r32 = 1
            int r14 = r14 + (-1)
            int r11 = ~r7     // Catch: java.lang.Throwable -> L1e42
            r6 = r6 | r11
            int r6 = ~r6     // Catch: java.lang.Throwable -> L1e42
            r25 = 4
            r11 = r6 ^ 4
            r6 = r6 & 4
            r6 = r6 | r11
            int r6 = r6 * 160
            r11 = r14 ^ r6
            r6 = r6 & r14
            int r6 = r6 << 1
            int r11 = r11 + r6
            byte r6 = (byte) r11     // Catch: java.lang.Throwable -> L1e42
            java.lang.String r3 = $$c(r3, r5, r6)     // Catch: java.lang.Throwable -> L1e42
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L1e42
            java.lang.reflect.Method r0 = r0.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L1e42
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L1e42
            java.lang.Object r0 = r0.invoke(r2, r3)     // Catch: java.lang.Throwable -> L1e42
            r3 = r27[r22]     // Catch: java.lang.Throwable -> L1e42
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1e42
            r5 = 772(0x304, float:1.082E-42)
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L1e42
            r6 = r27[r36]     // Catch: java.lang.Throwable -> L1e42
            int r6 = -r6
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1e42
            java.lang.String r3 = $$c(r3, r5, r6)     // Catch: java.lang.Throwable -> L1e42
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L1e42
            r5 = 198(0xc6, float:2.77E-43)
            r5 = r27[r5]     // Catch: java.lang.Throwable -> L1e42
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1e42
            r6 = 793(0x319, float:1.111E-42)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L1e42
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1e42
            int r11 = (int) r11     // Catch: java.lang.Throwable -> L1e42
            int r12 = r7 * 408
            r14 = -3252(0xfffffffffffff34c, float:NaN)
            int r14 = r14 + r12
            int r12 = ~r7     // Catch: java.lang.Throwable -> L1e42
            r25 = 4
            r15 = r12 ^ 4
            r42 = r12 & 4
            r15 = r15 | r42
            int r15 = ~r15     // Catch: java.lang.Throwable -> L1e42
            r13 = r11 | 4
            int r13 = ~r13     // Catch: java.lang.Throwable -> L1e42
            r59 = r15 ^ r13
            r13 = r13 & r15
            r13 = r59 | r13
            int r13 = r13 * (-814)
            int r13 = -r13
            int r13 = -r13
            r15 = r14 ^ r13
            r13 = r13 & r14
            r32 = 1
            int r13 = r13 << 1
            int r15 = r15 + r13
            int r13 = ~r11     // Catch: java.lang.Throwable -> L1e42
            r12 = r12 | r13
            int r12 = ~r12     // Catch: java.lang.Throwable -> L1e42
            r13 = r17 ^ r7
            r14 = r17 & r7
            r13 = r13 | r14
            int r13 = ~r13     // Catch: java.lang.Throwable -> L1e42
            r12 = r12 | r13
            r25 = 4
            r14 = r11 ^ 4
            r59 = r11 & 4
            r14 = r14 | r59
            int r14 = ~r14     // Catch: java.lang.Throwable -> L1e42
            r12 = r12 | r14
            int r12 = r12 * 407
            int r12 = -r12
            int r12 = -r12
            r14 = r15 & r12
            r12 = r12 | r15
            int r14 = r14 + r12
            r12 = r17 | r11
            int r12 = ~r12     // Catch: java.lang.Throwable -> L1e42
            r12 = r12 | r13
            r13 = r7 ^ r11
            r11 = r11 & r7
            r11 = r11 | r13
            int r11 = ~r11     // Catch: java.lang.Throwable -> L1e42
            r13 = r12 ^ r11
            r11 = r11 & r12
            r11 = r11 | r13
            int r11 = r11 * 407
            int r11 = -r11
            int r11 = -r11
            r12 = r14 | r11
            r32 = 1
            int r12 = r12 << 1
            r11 = r11 ^ r14
            int r12 = r12 - r11
            byte r11 = (byte) r12     // Catch: java.lang.Throwable -> L1e42
            java.lang.String r5 = $$c(r5, r6, r11)     // Catch: java.lang.Throwable -> L1e42
            r6 = 0
            java.lang.Class[] r11 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L1e42
            java.lang.reflect.Method r3 = r3.getMethod(r5, r11)     // Catch: java.lang.Throwable -> L1e42
            r5 = r27[r24]     // Catch: java.lang.Throwable -> L1e42
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1e42
            r6 = r5 ^ 624(0x270, float:8.74E-43)
            r11 = r5 & 624(0x270, float:8.74E-43)
            r6 = r6 | r11
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L1e42
            r11 = r6 & 477(0x1dd, float:6.68E-43)
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1e42
            java.lang.String r5 = $$c(r5, r6, r11)     // Catch: java.lang.Throwable -> L1e42
            java.lang.Class[] r6 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L1e42
            java.lang.reflect.Method r1 = r1.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L1e42
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L1e5c
            r5 = 622(0x26e, float:8.72E-43)
            r5 = r27[r5]     // Catch: java.lang.Throwable -> L1e5c
            int r5 = -r5
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1e5c
            r6 = 432(0x1b0, float:6.05E-43)
            short r11 = (short) r6     // Catch: java.lang.Throwable -> L1e5c
            r6 = r27[r36]     // Catch: java.lang.Throwable -> L1e5c
            int r6 = -r6
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1e5c
            java.lang.String r5 = $$c(r5, r11, r6)     // Catch: java.lang.Throwable -> L1e5c
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L1e5c
            r6 = r27[r34]     // Catch: java.lang.Throwable -> L1e5c
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1e5c
            r11 = r7 ^ 392(0x188, float:5.5E-43)
            r12 = r7 & 392(0x188, float:5.5E-43)
            r11 = r11 | r12
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L1e5c
            r12 = r27[r36]     // Catch: java.lang.Throwable -> L1e5c
            int r12 = -r12
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1e5c
            java.lang.String r6 = $$c(r6, r11, r12)     // Catch: java.lang.Throwable -> L1e5c
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L1e5c
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch: java.lang.Throwable -> L1e5c
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r6)     // Catch: java.lang.Throwable -> L1e5c
            java.lang.Object r2 = r5.newInstance(r2)     // Catch: java.lang.Throwable -> L1e5c
            java.lang.Class<com.appsflyer.internal.AFi1jSDK> r5 = com.appsflyer.internal.AFi1jSDK.class
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r11 = 670(0x29e, float:9.39E-43)
            r11 = r27[r11]     // Catch: java.lang.Throwable -> L1e48
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1e48
            r12 = 721(0x2d1, float:1.01E-42)
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L1e48
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1e48
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L1e48
            int r14 = r7 * (-919)
            int r14 = -r14
            int r14 = -r14
            int r14 = ~r14     // Catch: java.lang.Throwable -> L1e48
            int r14 = (-3677) - r14
            int r15 = ~r7     // Catch: java.lang.Throwable -> L1e48
            r59 = r17 ^ r15
            r62 = r17 & r15
            r63 = r14
            r14 = r59 | r62
            r59 = r15
            r15 = r14 | r13
            int r15 = ~r15     // Catch: java.lang.Throwable -> L1e48
            r62 = r15
            int r15 = ~r13     // Catch: java.lang.Throwable -> L1e48
            r64 = r59 | r15
            r65 = r13
            r25 = 4
            r13 = r64 | 4
            int r13 = ~r13     // Catch: java.lang.Throwable -> L1e48
            r64 = r62 ^ r13
            r13 = r62 & r13
            r13 = r64 | r13
            int r13 = r13 * 920
            int r13 = r63 + r13
            int r14 = ~r14     // Catch: java.lang.Throwable -> L1e48
            r62 = r13
            r13 = r17 | r15
            int r13 = ~r13     // Catch: java.lang.Throwable -> L1e48
            r63 = r14 ^ r13
            r13 = r13 & r14
            r13 = r63 | r13
            int r13 = r13 * 920
            r14 = r62 | r13
            r32 = 1
            int r14 = r14 << 1
            r13 = r62 ^ r13
            int r14 = r14 - r13
            r13 = r17 ^ r59
            r59 = r17 & r59
            r13 = r13 | r59
            r59 = r13 ^ r15
            r13 = r13 & r15
            r13 = r59 | r13
            int r13 = ~r13     // Catch: java.lang.Throwable -> L1e48
            r15 = r17 ^ r7
            r59 = r17 & r7
            r15 = r15 | r59
            r59 = r15 ^ r65
            r15 = r15 & r65
            r15 = r59 | r15
            int r15 = ~r15     // Catch: java.lang.Throwable -> L1e48
            r13 = r13 | r15
            int r15 = ~r7     // Catch: java.lang.Throwable -> L1e48
            r25 = 4
            r59 = r15 ^ 4
            r15 = r15 & 4
            r15 = r59 | r15
            r15 = r15 | r65
            int r15 = ~r15     // Catch: java.lang.Throwable -> L1e48
            r59 = r13 ^ r15
            r13 = r13 & r15
            r13 = r59 | r13
            int r13 = r13 * 920
            r15 = r14 & r13
            r13 = r13 | r14
            int r15 = r15 + r13
            byte r13 = (byte) r15     // Catch: java.lang.Throwable -> L1e48
            java.lang.String r11 = $$c(r11, r12, r13)     // Catch: java.lang.Throwable -> L1e48
            r14 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r11, r14)     // Catch: java.lang.Throwable -> L1e48
            java.lang.Object r5 = r6.invoke(r5, r14)     // Catch: java.lang.Throwable -> L1e48
            r45 = 2
            r6 = r27[r45]     // Catch: java.lang.Throwable -> L1e42
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1e42
            r11 = r6 ^ 771(0x303, float:1.08E-42)
            r12 = r6 & 771(0x303, float:1.08E-42)
            r11 = r11 | r12
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L1e42
            r12 = r27[r36]     // Catch: java.lang.Throwable -> L1e42
            int r12 = -r12
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1e42
            java.lang.String r6 = $$c(r6, r11, r12)     // Catch: java.lang.Throwable -> L1e42
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L1e42
            r11 = 0
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch: java.lang.Throwable -> L1e42
            java.lang.reflect.Constructor r12 = r6.getConstructor(r12)     // Catch: java.lang.Throwable -> L1e42
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L1e42
            java.lang.Object r11 = r12.newInstance(r13)     // Catch: java.lang.Throwable -> L1e42
            r12 = r27[r41]     // Catch: java.lang.Throwable -> L1e42
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1e42
            r13 = r12 ^ 640(0x280, float:8.97E-43)
            r14 = r12 & 640(0x280, float:8.97E-43)
            r13 = r13 | r14
            short r13 = (short) r13     // Catch: java.lang.Throwable -> L1e42
            r14 = r7 ^ 20
            r15 = r7 & 20
            r14 = r14 | r15
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1e42
            java.lang.String r12 = $$c(r12, r13, r14)     // Catch: java.lang.Throwable -> L1e42
            java.lang.Class[] r8 = new java.lang.Class[]{r9, r8, r8}     // Catch: java.lang.Throwable -> L1e42
            java.lang.reflect.Method r8 = r6.getMethod(r12, r8)     // Catch: java.lang.Throwable -> L1e42
            r12 = r27[r37]     // Catch: java.lang.Throwable -> L1e42
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1e42
            r13 = r12 ^ 817(0x331, float:1.145E-42)
            r14 = r12 & 817(0x331, float:1.145E-42)
            r13 = r13 | r14
            short r13 = (short) r13     // Catch: java.lang.Throwable -> L1e42
            r14 = r7 ^ 17
            r15 = r7 & 17
            r14 = r14 | r15
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1e42
            java.lang.String r12 = $$c(r12, r13, r14)     // Catch: java.lang.Throwable -> L1e42
            r13 = 0
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch: java.lang.Throwable -> L1e42
            java.lang.reflect.Method r6 = r6.getMethod(r12, r14)     // Catch: java.lang.Throwable -> L1e42
            r12 = 191(0xbf, float:2.68E-43)
            r12 = r27[r12]     // Catch: java.lang.Throwable -> L1e42
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1e42
            r13 = 837(0x345, float:1.173E-42)
            short r13 = (short) r13     // Catch: java.lang.Throwable -> L1e42
            r14 = r27[r36]     // Catch: java.lang.Throwable -> L1e42
            int r14 = -r14
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1e42
            java.lang.String r12 = $$c(r12, r13, r14)     // Catch: java.lang.Throwable -> L1e42
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L1e42
            r13 = r27[r41]     // Catch: java.lang.Throwable -> L1e42
            byte r13 = (byte) r13     // Catch: java.lang.Throwable -> L1e42
            r14 = r13 ^ 345(0x159, float:4.83E-43)
            r15 = r13 & 345(0x159, float:4.83E-43)
            r14 = r14 | r15
            short r14 = (short) r14     // Catch: java.lang.Throwable -> L1e42
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1e42
            java.lang.String r7 = $$c(r13, r14, r7)     // Catch: java.lang.Throwable -> L1e42
            r13 = 0
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch: java.lang.Throwable -> L1e42
            java.lang.reflect.Method r7 = r12.getMethod(r7, r14)     // Catch: java.lang.Throwable -> L1e42
            r12 = 1024(0x400, float:1.435E-42)
            byte[] r12 = new byte[r12]     // Catch: java.lang.Throwable -> L1e42
            r13 = 0
        L180c:
            java.lang.Object[] r14 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L1e42
            java.lang.Object r14 = r1.invoke(r2, r14)     // Catch: java.lang.Throwable -> L1e42
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch: java.lang.Throwable -> L1e42
            int r15 = r14.intValue()     // Catch: java.lang.Throwable -> L1e42
            if (r15 <= 0) goto L18b1
            r59 = r9
            r27 = r10
            long r9 = (long) r13
            r62 = r1
            r63 = r9
            r1 = 0
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18a9
            java.lang.Object r1 = r3.invoke(r0, r9)     // Catch: java.lang.Throwable -> L18a9
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L18a9
            long r9 = r1.longValue()     // Catch: java.lang.Throwable -> L18a9
            int r1 = (r63 > r9 ? 1 : (r63 == r9 ? 0 : -1))
            if (r1 >= 0) goto L18af
            int r1 = com.appsflyer.internal.AFi1jSDK.$11
            int r1 = r1 + 57
            int r1 = r1 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r1
            r28 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch: java.lang.Throwable -> L18a9
            java.lang.Object[] r1 = new java.lang.Object[]{r12, r1, r14}     // Catch: java.lang.Throwable -> L18a9
            r8.invoke(r11, r1)     // Catch: java.lang.Throwable -> L18a9
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L18a9
            int r1 = (int) r9
            int r9 = r15 * 236
            int r10 = r13 * 471
            int r10 = -r10
            int r10 = -r10
            r14 = r9 | r10
            r32 = 1
            int r14 = r14 << 1
            r9 = r9 ^ r10
            int r14 = r14 - r9
            int r9 = ~r15
            int r10 = ~r1
            r10 = r10 | r9
            int r10 = ~r10
            r63 = r13 ^ r10
            r10 = r10 & r13
            r10 = r63 | r10
            int r10 = r10 * (-235)
            int r10 = -r10
            int r10 = -r10
            r63 = r14 & r10
            r10 = r10 | r14
            int r63 = r63 + r10
            r10 = r9 ^ r1
            r14 = r9 & r1
            r10 = r10 | r14
            int r10 = ~r10
            r14 = r13 ^ r10
            r10 = r10 & r13
            r10 = r10 | r14
            int r10 = r10 * (-470)
            r14 = r63 ^ r10
            r10 = r63 & r10
            r32 = 1
            int r10 = r10 << 1
            int r14 = r14 + r10
            int r10 = ~r13
            r63 = r10 ^ r15
            r10 = r10 & r15
            r10 = r63 | r10
            int r10 = ~r10
            r9 = r9 | r13
            r13 = r9 ^ r1
            r1 = r1 & r9
            r1 = r1 | r13
            int r1 = ~r1
            r9 = r10 ^ r1
            r1 = r1 & r10
            r1 = r1 | r9
            int r1 = r1 * 235
            r9 = r14 | r1
            r32 = 1
            int r9 = r9 << 1
            r1 = r1 ^ r14
            int r13 = r9 - r1
            r10 = r27
            r9 = r59
            r1 = r62
            goto L180c
        L18a9:
            r0 = move-exception
            r1 = r0
            r7 = r27
            goto L141d
        L18af:
            r3 = 0
            goto L18b6
        L18b1:
            r59 = r9
            r27 = r10
            goto L18af
        L18b6:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1da0
            java.lang.Object r0 = r6.invoke(r11, r0)     // Catch: java.lang.Throwable -> L1da0
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L1da0
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L18a9 java.lang.Exception -> L18c8
            r7.invoke(r2, r1)     // Catch: java.lang.Throwable -> L18a9 java.lang.Exception -> L18c8
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L18a9 java.lang.Exception -> L18c8
            r7.invoke(r11, r1)     // Catch: java.lang.Throwable -> L18a9 java.lang.Exception -> L18c8
        L18c8:
            byte[] r1 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L1da0
            r2 = 767(0x2ff, float:1.075E-42)
            r2 = r1[r2]     // Catch: java.lang.Throwable -> L1da0
            byte r2 = (byte) r2
            r3 = 853(0x355, float:1.195E-42)
            short r3 = (short) r3
            r19 = 426(0x1aa, float:5.97E-43)
            r6 = r1[r19]     // Catch: java.lang.Throwable -> L1db9
            byte r6 = (byte) r6
            java.lang.String r2 = $$c(r2, r3, r6)     // Catch: java.lang.Throwable -> L1da0
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1da0
            r3 = r1[r34]     // Catch: java.lang.Throwable -> L1da0
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1da0
            r6 = 888(0x378, float:1.244E-42)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L1da0
            r7 = r1[r36]     // Catch: java.lang.Throwable -> L1da0
            int r7 = -r7
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1da0
            java.lang.String r3 = $$c(r3, r6, r7)     // Catch: java.lang.Throwable -> L1da0
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L1da0
            r7 = r1[r21]     // Catch: java.lang.Throwable -> L1da0
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1da0
            r8 = 906(0x38a, float:1.27E-42)
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L1da0
            r9 = r1[r36]     // Catch: java.lang.Throwable -> L1da0
            int r9 = -r9
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1da0
            java.lang.String r7 = $$c(r7, r8, r9)     // Catch: java.lang.Throwable -> L1da0
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L1da0
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r7}     // Catch: java.lang.Throwable -> L1da0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L1da0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L1e2f
            r3 = r1[r34]     // Catch: java.lang.Throwable -> L1e2f
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1e2f
            r7 = r1[r36]     // Catch: java.lang.Throwable -> L1e2f
            int r7 = -r7
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1e2f
            java.lang.String r3 = $$c(r3, r6, r7)     // Catch: java.lang.Throwable -> L1e2f
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L1e2f
            r6 = r1[r24]     // Catch: java.lang.Throwable -> L1e2f
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1e2f
            r7 = 926(0x39e, float:1.298E-42)
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L1e2f
            int r8 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L1e2f
            r9 = r8 ^ 20
            r10 = r8 & 20
            r9 = r9 | r10
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1e2f
            java.lang.String r6 = $$c(r6, r7, r9)     // Catch: java.lang.Throwable -> L1e2f
            java.lang.Class[] r7 = new java.lang.Class[]{r59}     // Catch: java.lang.Throwable -> L1e2f
            java.lang.reflect.Method r3 = r3.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L1e2f
            r14 = 0
            java.lang.Object r0 = r3.invoke(r14, r0)     // Catch: java.lang.Throwable -> L1e2f
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r5}     // Catch: java.lang.Throwable -> L1da0
            java.lang.Object r0 = r2.newInstance(r0)     // Catch: java.lang.Throwable -> L1da0
            r2 = 170(0xaa, float:2.38E-43)
            r2 = r1[r2]     // Catch: java.lang.Throwable -> L1da0 java.lang.Exception -> L1dad
            byte r2 = (byte) r2
            r3 = 929(0x3a1, float:1.302E-42)
            short r3 = (short) r3
            r19 = 426(0x1aa, float:5.97E-43)
            r6 = r1[r19]     // Catch: java.lang.Throwable -> L1db9 java.lang.Exception -> L1dbf
            byte r6 = (byte) r6
            java.lang.String r2 = $$c(r2, r3, r6)     // Catch: java.lang.Throwable -> L1da0 java.lang.Exception -> L1dad
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1da0 java.lang.Exception -> L1dad
            r44 = 5
            r3 = r1[r44]     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            byte r3 = (byte) r3     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r6 = 960(0x3c0, float:1.345E-42)
            short r6 = (short) r6     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r7 = 747(0x2eb, float:1.047E-42)
            r7 = r1[r7]     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            int r7 = -r7
            byte r7 = (byte) r7     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.String r3 = $$c(r3, r6, r7)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r11 = 1
            r2.setAccessible(r11)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.Object r3 = r2.get(r5)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r7 = r1[r26]     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            int r7 = -r7
            byte r7 = (byte) r7     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r9 = r8 ^ 901(0x385, float:1.263E-42)
            r10 = r8 & 901(0x385, float:1.263E-42)
            r9 = r9 | r10
            short r9 = (short) r9     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r10 = 1131(0x46b, float:1.585E-42)
            r10 = r1[r10]     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            int r11 = (int) r11     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            int r12 = r10 * (-69)
            r13 = 71
            int r13 = r13 + r12
            r12 = r29 | r10
            int r12 = ~r12     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r14 = r10 | r11
            int r14 = ~r14     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r15 = r12 ^ r14
            r12 = r12 & r14
            r12 = r12 | r15
            int r12 = r12 * (-140)
            int r12 = -r12
            int r12 = -r12
            r14 = r13 ^ r12
            r12 = r12 & r13
            r32 = 1
            int r12 = r12 << 1
            int r14 = r14 + r12
            r12 = r10 ^ 1
            r13 = r10 & 1
            r12 = r12 | r13
            r13 = r12 ^ r11
            r12 = r12 & r11
            r12 = r12 | r13
            int r12 = ~r12     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            int r12 = r12 * 70
            r13 = r14 | r12
            int r13 = r13 << 1
            r12 = r12 ^ r14
            int r13 = r13 - r12
            r12 = -2
            r14 = r12 ^ r10
            r12 = r12 & r10
            r12 = r12 | r14
            int r12 = ~r12     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            int r10 = ~r10     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r10 = r10 | 1
            int r10 = ~r10     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r14 = r12 ^ r10
            r10 = r10 & r12
            r10 = r10 | r14
            r12 = r11 ^ 1
            r11 = r11 & 1
            r11 = r11 | r12
            int r11 = ~r11     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r12 = r10 ^ r11
            r10 = r10 & r11
            r10 = r10 | r12
            int r10 = r10 * 70
            int r10 = -r10
            int r10 = -r10
            int r10 = ~r10     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            int r13 = r13 - r10
            r11 = 1
            int r13 = r13 - r11
            byte r10 = (byte) r13     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.String r7 = $$c(r7, r9, r10)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.reflect.Field r7 = r6.getDeclaredField(r7)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r7.setAccessible(r11)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r9 = 451(0x1c3, float:6.32E-43)
            r9 = r1[r9]     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            byte r9 = (byte) r9     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r10 = r9 ^ 966(0x3c6, float:1.354E-42)
            r11 = r9 & 966(0x3c6, float:1.354E-42)
            r10 = r10 | r11
            short r10 = (short) r10     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r11 = 1131(0x46b, float:1.585E-42)
            r11 = r1[r11]     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r12 = 1
            int r11 = r11 + r12
            byte r11 = (byte) r11     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.String r9 = $$c(r9, r10, r11)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.reflect.Field r6 = r6.getDeclaredField(r9)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r6.setAccessible(r12)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.Object r9 = r7.get(r3)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r10.<init>(r9)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.Class r9 = r3.getClass()     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            int r11 = com.appsflyer.internal.AFi1jSDK.$11
            r12 = r11 & 7
            r11 = r11 | 7
            int r12 = r12 + r11
            int r12 = r12 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r12
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r12 = 1150(0x47e, float:1.611E-42)
            r1 = r1[r12]     // Catch: java.lang.Throwable -> L1d8d
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L1d8d
            r12 = r8 ^ 948(0x3b4, float:1.328E-42)
            r8 = r8 & 948(0x3b4, float:1.328E-42)
            r8 = r8 | r12
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L1d8d
            r12 = r8 & 79
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1d8d
            java.lang.String r1 = $$c(r1, r8, r12)     // Catch: java.lang.Throwable -> L1d8d
            r14 = 0
            java.lang.reflect.Method r1 = r11.getMethod(r1, r14)     // Catch: java.lang.Throwable -> L1d8d
            java.lang.Object r1 = r1.invoke(r9, r14)     // Catch: java.lang.Throwable -> L1d8d
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L1d8d
            int r8 = java.lang.reflect.Array.getLength(r3)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r8)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r9 = 0
        L1a4f:
            if (r9 >= r8) goto L1a7e
            java.lang.Object r11 = java.lang.reflect.Array.get(r3, r9)     // Catch: java.lang.Throwable -> L1a67 java.lang.Exception -> L1a73
            java.lang.reflect.Array.set(r1, r9, r11)     // Catch: java.lang.Throwable -> L1a67 java.lang.Exception -> L1a73
            r11 = r9 | 125(0x7d, float:1.75E-43)
            r32 = 1
            int r11 = r11 << 1
            r9 = r9 ^ 125(0x7d, float:1.75E-43)
            int r11 = r11 - r9
            r9 = r11 & (-124(0xffffffffffffff84, float:NaN))
            r11 = r11 | (-124(0xffffffffffffff84, float:NaN))
            int r9 = r9 + r11
            goto L1a4f
        L1a67:
            r0 = move-exception
            r1 = r0
            r7 = r27
            r8 = r58
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            goto L1faa
        L1a73:
            r0 = move-exception
            r7 = r27
            r8 = r58
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            goto L1dc5
        L1a7e:
            r7.set(r2, r10)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            r6.set(r2, r1)     // Catch: java.lang.Exception -> L1a73 java.lang.Throwable -> L1d83
            java.lang.Object r1 = com.appsflyer.internal.AFi1jSDK.f6304i     // Catch: java.lang.Throwable -> L1d83
            if (r1 != 0) goto L1a8a
            com.appsflyer.internal.AFi1jSDK.f6304i = r0     // Catch: java.lang.Throwable -> L1a67
        L1a8a:
            r1 = r0
        L1a8b:
            if (r35 == 0) goto L1b48
            byte[] r0 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L1b42
            r2 = r0[r21]     // Catch: java.lang.Throwable -> L1b42
            byte r2 = (byte) r2
            r3 = 676(0x2a4, float:9.47E-43)
            short r3 = (short) r3
            r19 = 426(0x1aa, float:5.97E-43)
            r5 = r0[r19]     // Catch: java.lang.Throwable -> L1b3e
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1b3e
            java.lang.String r2 = $$c(r2, r3, r5)     // Catch: java.lang.Throwable -> L1b3e
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1b3e
            r3 = r0[r40]     // Catch: java.lang.Throwable -> L1b3e
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1b3e
            r5 = r3 ^ 1025(0x401, float:1.436E-42)
            r6 = r3 & 1025(0x401, float:1.436E-42)
            r5 = r5 | r6
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L1b3e
            int r6 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L1b3e
            r13 = 9
            r7 = r6 ^ 9
            r8 = r6 & 9
            r7 = r7 | r8
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1b3e
            java.lang.String r3 = $$c(r3, r5, r7)     // Catch: java.lang.Throwable -> L1b3e
            r5 = r0[r21]     // Catch: java.lang.Throwable -> L1b3e
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1b3e
            r7 = 906(0x38a, float:1.27E-42)
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L1b3e
            r8 = r0[r36]     // Catch: java.lang.Throwable -> L1b3e
            int r8 = -r8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1b3e
            java.lang.String r5 = $$c(r5, r7, r8)     // Catch: java.lang.Throwable -> L1b3e
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L1b3e
            r7 = r27
            java.lang.Class[] r5 = new java.lang.Class[]{r7, r5}     // Catch: java.lang.Throwable -> L1b3a
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L1b3a
            r11 = 1
            r3.setAccessible(r11)     // Catch: java.lang.Throwable -> L1b3a
            java.lang.Class<com.appsflyer.internal.AFi1jSDK> r5 = com.appsflyer.internal.AFi1jSDK.class
            java.lang.Class<java.lang.Class> r8 = java.lang.Class.class
            r9 = 670(0x29e, float:9.39E-43)
            r9 = r0[r9]     // Catch: java.lang.Throwable -> L1b2f
            byte r9 = (byte) r9
            r10 = 721(0x2d1, float:1.01E-42)
            short r10 = (short) r10
            r25 = 4
            r11 = r6 ^ 4
            r12 = r6 & 4
            r32 = 1
            int r12 = r12 << 1
            int r11 = r11 + r12
            byte r11 = (byte) r11
            java.lang.String r9 = $$c(r9, r10, r11)     // Catch: java.lang.Throwable -> L1b2d
            r14 = 0
            java.lang.reflect.Method r8 = r8.getMethod(r9, r14)     // Catch: java.lang.Throwable -> L1b2d
            java.lang.Object r5 = r8.invoke(r5, r14)     // Catch: java.lang.Throwable -> L1b2d
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.Throwable -> L1b23
            java.lang.Object r3 = r3.invoke(r1, r4)     // Catch: java.lang.Throwable -> L1b23
            if (r3 == 0) goto L1b29
            r0 = r0[r41]     // Catch: java.lang.Throwable -> L1b23
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1b23
            r4 = r0 ^ 345(0x159, float:4.83E-43)
            r5 = r0 & 345(0x159, float:4.83E-43)
            r4 = r4 | r5
            short r4 = (short) r4     // Catch: java.lang.Throwable -> L1b23
            byte r5 = (byte) r6     // Catch: java.lang.Throwable -> L1b23
            java.lang.String r0 = $$c(r0, r4, r5)     // Catch: java.lang.Throwable -> L1b23
            r5 = 0
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L1b23
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r4)     // Catch: java.lang.Throwable -> L1b23
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L1b23
            r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L1b23
            goto L1b29
        L1b23:
            r0 = move-exception
        L1b24:
            r1 = r0
            r8 = r58
            goto L1faa
        L1b29:
            r0 = r3
            r13 = 9
            goto L1b93
        L1b2d:
            r0 = move-exception
            goto L1b32
        L1b2f:
            r0 = move-exception
            r25 = 4
        L1b32:
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1b23
            if (r1 == 0) goto L1b39
            throw r1     // Catch: java.lang.Throwable -> L1b23
        L1b39:
            throw r0     // Catch: java.lang.Throwable -> L1b23
        L1b3a:
            r0 = move-exception
        L1b3b:
            r25 = 4
            goto L1b24
        L1b3e:
            r0 = move-exception
            r7 = r27
            goto L1b3b
        L1b42:
            r0 = move-exception
            r7 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            goto L1b3b
        L1b48:
            r7 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            byte[] r0 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L1d47
            r2 = r0[r21]     // Catch: java.lang.Throwable -> L1d47
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1d47
            r3 = 906(0x38a, float:1.27E-42)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L1d47
            r5 = r0[r36]     // Catch: java.lang.Throwable -> L1d47
            int r5 = -r5
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1d47
            java.lang.String r2 = $$c(r2, r3, r5)     // Catch: java.lang.Throwable -> L1d47
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1d47
            r0 = r0[r40]     // Catch: java.lang.Throwable -> L1d47
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1d47
            r3 = r0 | 1025(0x401, float:1.436E-42)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L1d47
            int r5 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L1d47
            r13 = 9
            r6 = r5 ^ 9
            r5 = r5 & r13
            r5 = r5 | r6
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1d47
            java.lang.String r0 = $$c(r0, r3, r5)     // Catch: java.lang.Throwable -> L1d47
            java.lang.Class[] r3 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L1d47
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r3)     // Catch: java.lang.Throwable -> L1d47
            r11 = 1
            r0.setAccessible(r11)     // Catch: java.lang.Throwable -> L1b23 java.lang.reflect.InvocationTargetException -> L1b8a
            java.lang.Object[] r2 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L1b23 java.lang.reflect.InvocationTargetException -> L1b8a
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L1b23 java.lang.reflect.InvocationTargetException -> L1b8a
            goto L1b93
        L1b8a:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L1b23 java.lang.ClassNotFoundException -> L1b92
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch: java.lang.Throwable -> L1b23 java.lang.ClassNotFoundException -> L1b92
            throw r0     // Catch: java.lang.Throwable -> L1b23 java.lang.ClassNotFoundException -> L1b92
        L1b92:
            r0 = 0
        L1b93:
            if (r0 == 0) goto L1d4b
            r6 = r0
            java.lang.Class r6 = (java.lang.Class) r6     // Catch: java.lang.Throwable -> L1d47
            byte[] r0 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L1d47
            r2 = 904(0x388, float:1.267E-42)
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L1d47
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1d47
            r3 = 1041(0x411, float:1.459E-42)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L1d47
            int r4 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L1d47
            byte r5 = (byte) r4     // Catch: java.lang.Throwable -> L1d47
            java.lang.String r2 = $$c(r2, r3, r5)     // Catch: java.lang.Throwable -> L1d47
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L1d47
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r5}     // Catch: java.lang.Throwable -> L1d47
            java.lang.reflect.Constructor r3 = r6.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L1d47
            r11 = 1
            r3.setAccessible(r11)     // Catch: java.lang.Throwable -> L1d47
            r5 = r35 ^ 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L1d47
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5}     // Catch: java.lang.Throwable -> L1d47
            java.lang.Object r1 = r3.newInstance(r1)     // Catch: java.lang.Throwable -> L1d47
            com.appsflyer.internal.AFi1jSDK.f6303e = r1     // Catch: java.lang.Throwable -> L1d47
            r1 = 3142(0xc46, float:4.403E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L1d47
            r3 = 102(0x66, float:1.43E-43)
            r3 = r0[r3]     // Catch: java.lang.Throwable -> L1d47
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1d47
            r5 = r3 ^ 1025(0x401, float:1.436E-42)
            r8 = r3 & 1025(0x401, float:1.436E-42)
            r5 = r5 | r8
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L1d47
            r8 = r0[r33]     // Catch: java.lang.Throwable -> L1d47
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1d47
            java.lang.String r3 = $$c(r3, r5, r8)     // Catch: java.lang.Throwable -> L1d47
            r11 = 1
            java.lang.String r3 = r3.substring(r11)     // Catch: java.lang.Throwable -> L1d47
            r8 = r58
            java.util.zip.ZipEntry r3 = r8.getEntry(r3)     // Catch: java.lang.Throwable -> L1d1f
            java.io.InputStream r3 = r8.getInputStream(r3)     // Catch: java.lang.Throwable -> L1d1f
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L1d3e
            r5 = 622(0x26e, float:8.72E-43)
            r5 = r0[r5]     // Catch: java.lang.Throwable -> L1d3e
            int r5 = -r5
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1d3e
            r9 = 432(0x1b0, float:6.05E-43)
            short r10 = (short) r9     // Catch: java.lang.Throwable -> L1d3e
            r9 = r0[r36]     // Catch: java.lang.Throwable -> L1d3e
            int r9 = -r9
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1d3e
            java.lang.String r5 = $$c(r5, r10, r9)     // Catch: java.lang.Throwable -> L1d3e
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L1d3e
            r9 = r0[r34]     // Catch: java.lang.Throwable -> L1d3e
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1d3e
            r10 = r4 ^ 392(0x188, float:5.5E-43)
            r11 = r4 & 392(0x188, float:5.5E-43)
            r10 = r10 | r11
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L1d3e
            r11 = r0[r36]     // Catch: java.lang.Throwable -> L1d3e
            int r11 = -r11
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1d3e
            java.lang.String r9 = $$c(r9, r10, r11)     // Catch: java.lang.Throwable -> L1d3e
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L1d3e
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L1d3e
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r9)     // Catch: java.lang.Throwable -> L1d3e
            java.lang.Object r3 = r5.newInstance(r3)     // Catch: java.lang.Throwable -> L1d3e
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L1d35
            r5 = r0[r38]     // Catch: java.lang.Throwable -> L1d35
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1d35
            r9 = 476(0x1dc, float:6.67E-43)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L1d35
            r10 = r0[r36]     // Catch: java.lang.Throwable -> L1d35
            int r10 = -r10
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1d35
            java.lang.String r5 = $$c(r5, r9, r10)     // Catch: java.lang.Throwable -> L1d35
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L1d35
            r10 = r0[r34]     // Catch: java.lang.Throwable -> L1d35
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1d35
            r11 = r4 ^ 392(0x188, float:5.5E-43)
            r12 = r4 & 392(0x188, float:5.5E-43)
            r11 = r11 | r12
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L1d35
            r12 = r0[r36]     // Catch: java.lang.Throwable -> L1d35
            int r12 = -r12
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1d35
            java.lang.String r10 = $$c(r10, r11, r12)     // Catch: java.lang.Throwable -> L1d35
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L1d35
            java.lang.Class[] r10 = new java.lang.Class[]{r10}     // Catch: java.lang.Throwable -> L1d35
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r10)     // Catch: java.lang.Throwable -> L1d35
            java.lang.Object r3 = r5.newInstance(r3)     // Catch: java.lang.Throwable -> L1d35
            java.lang.Object[] r5 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L1d2c
            r10 = r0[r38]     // Catch: java.lang.Throwable -> L1d2c
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1d2c
            r11 = r0[r36]     // Catch: java.lang.Throwable -> L1d2c
            int r11 = -r11
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1d2c
            java.lang.String r10 = $$c(r10, r9, r11)     // Catch: java.lang.Throwable -> L1d2c
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L1d2c
            r11 = r0[r40]     // Catch: java.lang.Throwable -> L1d2c
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1d2c
            r12 = 432(0x1b0, float:6.05E-43)
            r14 = r4 | 432(0x1b0, float:6.05E-43)
            short r14 = (short) r14     // Catch: java.lang.Throwable -> L1d2c
            r15 = 1141(0x475, float:1.599E-42)
            r15 = r0[r15]     // Catch: java.lang.Throwable -> L1d2c
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1d2c
            int r12 = (int) r12     // Catch: java.lang.Throwable -> L1d2c
            int r13 = r15 * 371
            int r13 = -r13
            int r13 = -r13
            r27 = 371(0x173, float:5.2E-43)
            r57 = r27 ^ r13
            r13 = r27 & r13
            r32 = 1
            int r13 = r13 << 1
            int r57 = r57 + r13
            int r13 = ~r15     // Catch: java.lang.Throwable -> L1d2c
            r27 = r1
            int r1 = ~r12     // Catch: java.lang.Throwable -> L1d2c
            r58 = r13 ^ r1
            r1 = r1 & r13
            r1 = r58 | r1
            int r1 = ~r1     // Catch: java.lang.Throwable -> L1d2c
            r58 = -2
            r13 = r58 | r12
            int r13 = ~r13     // Catch: java.lang.Throwable -> L1d2c
            r1 = r1 | r13
            int r1 = r1 * (-370)
            int r57 = r57 + r1
            int r1 = ~r12     // Catch: java.lang.Throwable -> L1d2c
            r13 = r58 ^ r1
            r1 = r58 & r1
            r1 = r1 | r13
            int r1 = ~r1     // Catch: java.lang.Throwable -> L1d2c
            int r13 = ~r15     // Catch: java.lang.Throwable -> L1d2c
            r58 = r13 ^ r12
            r12 = r12 & r13
            r12 = r58 | r12
            int r12 = ~r12     // Catch: java.lang.Throwable -> L1d2c
            r1 = r1 | r12
            r32 = 1
            r12 = r15 ^ 1
            r13 = r15 & 1
            r12 = r12 | r13
            int r13 = ~r12     // Catch: java.lang.Throwable -> L1d2c
            r1 = r1 | r13
            int r1 = r1 * (-370)
            r13 = r57 ^ r1
            r1 = r57 & r1
            int r1 = r1 << 1
            int r13 = r13 + r1
            int r1 = ~r12     // Catch: java.lang.Throwable -> L1d2c
            int r1 = r1 * 370
            int r1 = -r1
            int r1 = -r1
            r12 = r13 & r1
            r1 = r1 | r13
            int r12 = r12 + r1
            byte r1 = (byte) r12     // Catch: java.lang.Throwable -> L1d2c
            java.lang.String r1 = $$c(r11, r14, r1)     // Catch: java.lang.Throwable -> L1d2c
            java.lang.Class[] r11 = new java.lang.Class[]{r59}     // Catch: java.lang.Throwable -> L1d2c
            java.lang.reflect.Method r1 = r10.getMethod(r1, r11)     // Catch: java.lang.Throwable -> L1d2c
            r1.invoke(r3, r5)     // Catch: java.lang.Throwable -> L1d2c
            r1 = r0[r38]     // Catch: java.lang.Throwable -> L1d23
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L1d23
            r5 = r0[r36]     // Catch: java.lang.Throwable -> L1d23
            int r5 = -r5
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1d23
            java.lang.String r1 = $$c(r1, r9, r5)     // Catch: java.lang.Throwable -> L1d23
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1d23
            r0 = r0[r41]     // Catch: java.lang.Throwable -> L1d23
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1d23
            r5 = r0 ^ 345(0x159, float:4.83E-43)
            r9 = r0 & 345(0x159, float:4.83E-43)
            r5 = r5 | r9
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L1d23
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L1d23
            java.lang.String r0 = $$c(r0, r5, r4)     // Catch: java.lang.Throwable -> L1d23
            r14 = 0
            java.lang.reflect.Method r0 = r1.getMethod(r0, r14)     // Catch: java.lang.Throwable -> L1d23
            r0.invoke(r3, r14)     // Catch: java.lang.Throwable -> L1d23
            int r1 = java.lang.Math.abs(r56)     // Catch: java.lang.Throwable -> L1d1f
            r0 = 3086(0xc0e, float:4.324E-42)
            r4 = r2
            r10 = r7
            r3 = r8
            r2 = r27
            r14 = r54
            r15 = r55
            r27 = r59
            r11 = r60
            r12 = r61
            r28 = 0
            goto Lc4f
        L1d1f:
            r0 = move-exception
        L1d20:
            r1 = r0
            goto L1faa
        L1d23:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1d2b
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1d2b:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1d2c:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1d34
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1d34:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1d35:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1d3d
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1d3d:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1d3e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1d46
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1d46:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1d47:
            r0 = move-exception
            r8 = r58
            goto L1d20
        L1d4b:
            r8 = r58
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L1d1f
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r2}     // Catch: java.lang.Throwable -> L1d1f
            r6 = r57
            java.lang.reflect.Constructor r0 = r6.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L1d1f
            r11 = 1
            r0.setAccessible(r11)     // Catch: java.lang.Throwable -> L1d1f
            r2 = r35 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L1d1f
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Throwable -> L1d1f
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L1d1f
            com.appsflyer.internal.AFi1jSDK.f6303e = r0     // Catch: java.lang.Throwable -> L1d1f
            r8.close()     // Catch: java.lang.Throwable -> L1d7e
            r2 = r43
            r3 = 2
            r6 = 292(0x124, float:4.09E-43)
            r14 = 1
            r28 = 0
            r46 = 0
            goto L20f3
        L1d7e:
            r0 = move-exception
        L1d7f:
            r32 = 1
            goto L203e
        L1d83:
            r0 = move-exception
            r7 = r27
            r8 = r58
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            goto L1d20
        L1d8d:
            r0 = move-exception
            r7 = r27
            r8 = r58
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f java.lang.Exception -> L1d9d
            if (r1 == 0) goto L1d9f
            throw r1     // Catch: java.lang.Throwable -> L1d1f java.lang.Exception -> L1d9d
        L1d9d:
            r0 = move-exception
            goto L1dc5
        L1d9f:
            throw r0     // Catch: java.lang.Throwable -> L1d1f java.lang.Exception -> L1d9d
        L1da0:
            r0 = move-exception
            r7 = r27
        L1da3:
            r8 = r58
            r19 = 426(0x1aa, float:5.97E-43)
        L1da7:
            r25 = 4
        L1da9:
            r44 = 5
            goto L1d20
        L1dad:
            r0 = move-exception
            r7 = r27
            r8 = r58
            r19 = 426(0x1aa, float:5.97E-43)
        L1db4:
            r25 = 4
            r44 = 5
            goto L1dc5
        L1db9:
            r0 = move-exception
            r7 = r27
            r8 = r58
            goto L1da7
        L1dbf:
            r0 = move-exception
            r7 = r27
            r8 = r58
            goto L1db4
        L1dc5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1d1f
            byte[] r2 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L1d1f
            r3 = r2[r41]     // Catch: java.lang.Throwable -> L1d1f
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1d1f
            r4 = r3 | 1025(0x401, float:1.436E-42)
            short r4 = (short) r4     // Catch: java.lang.Throwable -> L1d1f
            r6 = r2[r16]     // Catch: java.lang.Throwable -> L1d1f
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1d1f
            java.lang.String r3 = $$c(r3, r4, r6)     // Catch: java.lang.Throwable -> L1d1f
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d1f
            r1.append(r5)     // Catch: java.lang.Throwable -> L1d1f
            r3 = r2[r43]     // Catch: java.lang.Throwable -> L1d1f
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1d1f
            r6 = 292(0x124, float:4.09E-43)
            r4 = r3 ^ 292(0x124, float:4.09E-43)
            r5 = r3 & 292(0x124, float:4.09E-43)
            r4 = r4 | r5
            short r4 = (short) r4     // Catch: java.lang.Throwable -> L1d1f
            r5 = r2[r40]     // Catch: java.lang.Throwable -> L1d1f
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1d1f
            java.lang.String r3 = $$c(r3, r4, r5)     // Catch: java.lang.Throwable -> L1d1f
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d1f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d1f
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1e26
            r32 = 1
            r4[r32] = r0     // Catch: java.lang.Throwable -> L1e26
            r28 = 0
            r4[r28] = r1     // Catch: java.lang.Throwable -> L1e26
            r0 = r2[r34]     // Catch: java.lang.Throwable -> L1e26
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1e26
            r6 = 292(0x124, float:4.09E-43)
            short r1 = (short) r6     // Catch: java.lang.Throwable -> L1e26
            r2 = r2[r36]     // Catch: java.lang.Throwable -> L1e26
            int r2 = -r2
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1e26
            java.lang.String r0 = $$c(r0, r1, r2)     // Catch: java.lang.Throwable -> L1e26
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1e26
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.Class[] r1 = new java.lang.Class[]{r7, r1}     // Catch: java.lang.Throwable -> L1e26
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L1e26
            java.lang.Object r0 = r0.newInstance(r4)     // Catch: java.lang.Throwable -> L1e26
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L1e26
            throw r0     // Catch: java.lang.Throwable -> L1e26
        L1e26:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1e2e
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1e2e:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1e2f:
            r0 = move-exception
            r7 = r27
            r8 = r58
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            r44 = 5
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1e41
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1e41:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1e42:
            r0 = move-exception
            r59 = r9
            r7 = r10
            goto L1da3
        L1e48:
            r0 = move-exception
            r59 = r9
            r7 = r10
            r8 = r58
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            r44 = 5
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1e5b
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1e5b:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1e5c:
            r0 = move-exception
            r59 = r9
            r7 = r10
            r8 = r58
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            r44 = 5
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1e6f
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1e6f:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1e70:
            r0 = move-exception
            r8 = r3
            r59 = r9
            r7 = r10
            r55 = r15
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            r30 = 16
            goto L1da9
        L1e7f:
            r0 = move-exception
            r8 = r3
            r59 = r9
            r7 = r10
        L1e84:
            r55 = r15
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            r30 = 16
        L1e8c:
            r44 = 5
            goto L1eb7
        L1e8f:
            r0 = move-exception
            r8 = r3
            r59 = r9
            r7 = r10
            r54 = r14
            goto L1e84
        L1e97:
            r0 = move-exception
            r8 = r3
            r59 = r9
            r7 = r10
            r54 = r14
            r55 = r15
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
        L1ea4:
            r30 = 16
            r31 = 3
            goto L1e8c
        L1ea9:
            r0 = move-exception
            r8 = r3
            r59 = r9
            r7 = r10
            r25 = r11
            r54 = r14
            r55 = r15
            r19 = 426(0x1aa, float:5.97E-43)
            goto L1ea4
        L1eb7:
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1ebe
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1ebe:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1ebf:
            r0 = move-exception
            r8 = r3
            r59 = r9
            r7 = r10
            r54 = r14
            r55 = r15
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            r30 = 16
        L1ece:
            r31 = 3
            goto L1da9
        L1ed2:
            r0 = move-exception
            r30 = 16
        L1ed5:
            r8 = r3
            r59 = r9
            r7 = r10
            r54 = r14
            r55 = r15
            r19 = 426(0x1aa, float:5.97E-43)
            r25 = 4
            r31 = 3
            goto L1da9
        L1ee5:
            r0 = move-exception
            r30 = r2
            goto L1ed5
        L1ee9:
            r0 = move-exception
            r8 = r3
            r59 = r9
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r19 = 426(0x1aa, float:5.97E-43)
            goto L1ece
        L1ef9:
            r0 = move-exception
            r8 = r3
            r59 = r9
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
        L1f06:
            r19 = 426(0x1aa, float:5.97E-43)
            r31 = 3
        L1f0a:
            r44 = 5
            goto L1f2d
        L1f0d:
            r0 = move-exception
            r8 = r3
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            goto L1f06
        L1f1b:
            r0 = move-exception
            r31 = r1
            r8 = r3
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            goto L1f0a
        L1f2d:
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1f34
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1f34:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1f35:
            r0 = move-exception
            r8 = r3
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            goto L1da9
        L1f46:
            r0 = move-exception
            r8 = r3
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            r44 = 5
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1f5e
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1f5e:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1f5f:
            r0 = move-exception
            r8 = r3
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            r44 = 5
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1f77
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1f77:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1f78:
            r0 = move-exception
            r8 = r3
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            r44 = 5
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1f90
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1f90:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1f91:
            r0 = move-exception
            r8 = r3
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            r44 = 5
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d1f
            if (r1 == 0) goto L1fa9
            throw r1     // Catch: java.lang.Throwable -> L1d1f
        L1fa9:
            throw r0     // Catch: java.lang.Throwable -> L1d1f
        L1faa:
            r8.close()     // Catch: java.lang.Throwable -> L1fae
            goto L1fb2
        L1fae:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L1d7e
        L1fb2:
            throw r1     // Catch: java.lang.Throwable -> L1d7e
        L1fb3:
            r0 = move-exception
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            r44 = 5
            goto L1d7f
        L1fc5:
            r0 = move-exception
            r44 = r4
        L1fc8:
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            goto L1d7f
        L1fd7:
            r0 = move-exception
            goto L1fc8
        L1fd9:
            r0 = move-exception
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d7e
            if (r1 == 0) goto L1fee
            throw r1     // Catch: java.lang.Throwable -> L1d7e
        L1fee:
            throw r0     // Catch: java.lang.Throwable -> L1d7e
        L1fef:
            r0 = move-exception
        L1ff0:
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            goto L2004
        L1ffe:
            r0 = move-exception
            r52 = r7
            r51 = r8
            goto L1ff0
        L2004:
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1d7e
            if (r1 == 0) goto L200b
            throw r1     // Catch: java.lang.Throwable -> L1d7e
        L200b:
            throw r0     // Catch: java.lang.Throwable -> L1d7e
        L200c:
            r0 = move-exception
            r52 = r7
            r51 = r8
            goto L1fc8
        L2012:
            r0 = move-exception
            r50 = r1
            r48 = r3
            r43 = r6
            r52 = r7
            r51 = r8
            r44 = r9
            goto L1fc8
        L2020:
            r0 = move-exception
            r50 = r1
            r48 = r3
            r43 = r6
            r52 = r7
            r51 = r8
            r44 = r9
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            r38 = 616(0x268, float:8.63E-43)
            goto L1d7f
        L203e:
            r1 = r55 ^ 1
            r2 = r55 & 1
            int r2 = r2 << 1
            int r1 = r1 + r2
            r2 = r43
        L2047:
            if (r1 >= r2) goto L2079
            int r3 = com.appsflyer.internal.AFi1jSDK.$10
            r4 = r3 ^ 99
            r3 = r3 & 99
            int r3 = r3 << 1
            int r4 = r4 + r3
            int r3 = r4 % 128
            com.appsflyer.internal.AFi1jSDK.$11 = r3
            r45 = 2
            int r4 = r4 % 2
            if (r4 == 0) goto L2072
            boolean r3 = r60[r1]     // Catch: java.lang.Exception -> L2139
            if (r3 == 0) goto L2064
            r1 = 1
        L2061:
            r46 = 0
            goto L207b
        L2064:
            r3 = r1 ^ (-13)
            r1 = r1 & (-13)
            r32 = 1
            int r1 = r1 << 1
            int r3 = r3 + r1
            int r1 = r3 + 14
            r32 = 1
            goto L2047
        L2072:
            boolean r0 = r60[r1]     // Catch: java.lang.Exception -> L2139
            r46 = 0
            throw r46     // Catch: java.lang.Throwable -> L2077 java.lang.Exception -> L2139
        L2077:
            r0 = move-exception
            throw r0
        L2079:
            r1 = 0
            goto L2061
        L207b:
            if (r1 == 0) goto L208f
            com.appsflyer.internal.AFi1jSDK.f6303e = r46     // Catch: java.lang.Exception -> L2139
            com.appsflyer.internal.AFi1jSDK.f6304i = r46     // Catch: java.lang.Exception -> L2139
            int r0 = com.appsflyer.internal.AFi1jSDK.$10
            int r0 = r0 + 31
            int r0 = r0 % 128
            com.appsflyer.internal.AFi1jSDK.$11 = r0
            r3 = 2
            r28 = 0
        L208c:
            r6 = 292(0x124, float:4.09E-43)
            goto L20f1
        L208f:
            byte[] r1 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Exception -> L2139
            r2 = r1[r38]     // Catch: java.lang.Exception -> L2139
            byte r2 = (byte) r2     // Catch: java.lang.Exception -> L2139
            r3 = 1121(0x461, float:1.571E-42)
            short r3 = (short) r3     // Catch: java.lang.Exception -> L2139
            r4 = r1[r16]     // Catch: java.lang.Exception -> L2139
            byte r4 = (byte) r4     // Catch: java.lang.Exception -> L2139
            java.lang.String r2 = $$c(r2, r3, r4)     // Catch: java.lang.Exception -> L2139
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L20cc
            r32 = 1
            r3[r32] = r0     // Catch: java.lang.Throwable -> L20cc
            r28 = 0
            r3[r28] = r2     // Catch: java.lang.Throwable -> L20cc
            r0 = r1[r34]     // Catch: java.lang.Throwable -> L20cc
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L20cc
            r6 = 292(0x124, float:4.09E-43)
            short r2 = (short) r6     // Catch: java.lang.Throwable -> L20cc
            r1 = r1[r36]     // Catch: java.lang.Throwable -> L20cc
            int r1 = -r1
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L20cc
            java.lang.String r0 = $$c(r0, r2, r1)     // Catch: java.lang.Throwable -> L20cc
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L20cc
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.Class[] r1 = new java.lang.Class[]{r7, r1}     // Catch: java.lang.Throwable -> L20cc
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L20cc
            java.lang.Object r0 = r0.newInstance(r3)     // Catch: java.lang.Throwable -> L20cc
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L20cc
            throw r0     // Catch: java.lang.Throwable -> L20cc
        L20cc:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L2139
            if (r1 == 0) goto L20d4
            throw r1     // Catch: java.lang.Exception -> L2139
        L20d4:
            throw r0     // Catch: java.lang.Exception -> L2139
        L20d5:
            r50 = r1
            r46 = r2
            r48 = r3
            r3 = r4
            r2 = r6
            r52 = r7
            r51 = r8
            r44 = r9
            r7 = r10
            r60 = r11
            r61 = r12
            r54 = r14
            r55 = r15
            r59 = r27
            r19 = 426(0x1aa, float:5.97E-43)
            goto L208c
        L20f1:
            r14 = r54
        L20f3:
            r0 = r55 ^ (-79)
            r1 = r55 & (-79)
            r32 = 1
            int r1 = r1 << 1
            int r0 = r0 + r1
            r1 = r0 ^ 80
            r0 = r0 & 80
            int r0 = r0 << 1
            int r15 = r1 + r0
            r6 = r2
            r4 = r3
            r10 = r7
            r5 = r37
            r9 = r44
            r2 = r46
            r3 = r48
            r1 = r50
            r8 = r51
            r7 = r52
            r27 = r59
            r11 = r60
            r12 = r61
            goto L536
        L211d:
            return
        L211e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L2139
            if (r1 == 0) goto L2126
            throw r1     // Catch: java.lang.Exception -> L2139
        L2126:
            throw r0     // Catch: java.lang.Exception -> L2139
        L2127:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L2139
            if (r1 == 0) goto L212f
            throw r1     // Catch: java.lang.Exception -> L2139
        L212f:
            throw r0     // Catch: java.lang.Exception -> L2139
        L2130:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L2139
            if (r1 == 0) goto L2138
            throw r1     // Catch: java.lang.Exception -> L2139
        L2138:
            throw r0     // Catch: java.lang.Exception -> L2139
        L2139:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L2140:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L2148
            throw r1
        L2148:
            throw r0
    }

    private AFi1jSDK() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object getMediationNetwork(char r6, int r7, int r8) {
            int r0 = com.appsflyer.internal.AFi1jSDK.$11
            r1 = r0 & 91
            r2 = r0 | 91
            int r1 = r1 + r2
            int r2 = r1 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r2
            r2 = 2
            int r1 = r1 % r2
            if (r1 != 0) goto L78
            java.lang.Object r1 = com.appsflyer.internal.AFi1jSDK.f6303e
            int r0 = r0 + 93
            int r0 = r0 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r0
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L6f
            r0[r2] = r8     // Catch: java.lang.Throwable -> L6f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L6f
            r8 = 1
            r0[r8] = r7     // Catch: java.lang.Throwable -> L6f
            java.lang.Character r6 = java.lang.Character.valueOf(r6)     // Catch: java.lang.Throwable -> L6f
            r7 = 0
            r0[r7] = r6     // Catch: java.lang.Throwable -> L6f
            byte[] r6 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L6f
            r7 = 904(0x388, float:1.267E-42)
            r2 = r6[r7]     // Catch: java.lang.Throwable -> L6f
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L6f
            r3 = r2 | 539(0x21b, float:7.55E-43)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L6f
            int r4 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L6f
            byte r5 = (byte) r4     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = $$c(r2, r3, r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r3 = com.appsflyer.internal.AFi1jSDK.f6304i     // Catch: java.lang.Throwable -> L6f
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r8 = java.lang.Class.forName(r2, r8, r3)     // Catch: java.lang.Throwable -> L6f
            r2 = 13
            r2 = r6[r2]     // Catch: java.lang.Throwable -> L6f
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L6f
            r3 = r4 | 1077(0x435, float:1.509E-42)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L6f
            r6 = r6[r7]     // Catch: java.lang.Throwable -> L6f
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = $$c(r2, r3, r6)     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r7 = java.lang.Character.TYPE     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L6f
            java.lang.Class[] r7 = new java.lang.Class[]{r7, r2, r2}     // Catch: java.lang.Throwable -> L6f
            java.lang.reflect.Method r6 = r8.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r6.invoke(r1, r0)     // Catch: java.lang.Throwable -> L6f
            int r7 = com.appsflyer.internal.AFi1jSDK.$11
            int r7 = r7 + 49
            int r7 = r7 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r7
            return r6
        L6f:
            r6 = move-exception
            java.lang.Throwable r7 = r6.getCause()
            if (r7 == 0) goto L77
            throw r7
        L77:
            throw r6
        L78:
            r6 = 0
            throw r6
    }

    public static int getMonetizationNetwork(int r6) {
            int r0 = com.appsflyer.internal.AFi1jSDK.$11
            int r1 = r0 + 15
            int r2 = r1 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L63
            java.lang.Object r1 = com.appsflyer.internal.AFi1jSDK.f6303e
            int r0 = r0 + 37
            int r0 = r0 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L5a
            byte[] r0 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L5a
            r2 = 904(0x388, float:1.267E-42)
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L5a
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L5a
            r3 = r2 | 539(0x21b, float:7.55E-43)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L5a
            int r4 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L5a
            byte r5 = (byte) r4     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = $$c(r2, r3, r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r3 = com.appsflyer.internal.AFi1jSDK.f6304i     // Catch: java.lang.Throwable -> L5a
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3     // Catch: java.lang.Throwable -> L5a
            r5 = 1
            java.lang.Class r2 = java.lang.Class.forName(r2, r5, r3)     // Catch: java.lang.Throwable -> L5a
            r3 = 324(0x144, float:4.54E-43)
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L5a
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L5a
            r3 = 1166(0x48e, float:1.634E-42)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L5a
            int r4 = r4 + 4
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = $$c(r0, r3, r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L5a
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L5a
            java.lang.reflect.Method r0 = r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r6 = r0.invoke(r1, r6)     // Catch: java.lang.Throwable -> L5a
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L5a
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L5a
            return r6
        L5a:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()
            if (r0 == 0) goto L62
            throw r0
        L62:
            throw r6
        L63:
            r6 = 0
            throw r6
    }

    public static int getMonetizationNetwork(java.lang.Object r7) {
            int r0 = com.appsflyer.internal.AFi1jSDK.$11
            java.lang.Object r1 = com.appsflyer.internal.AFi1jSDK.f6303e
            int r0 = r0 + 11
            int r0 = r0 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r0
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L5f
            byte[] r0 = com.appsflyer.internal.AFi1jSDK.$$a     // Catch: java.lang.Throwable -> L5f
            r2 = 904(0x388, float:1.267E-42)
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L5f
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L5f
            r3 = r2 ^ 539(0x21b, float:7.55E-43)
            r4 = r2 & 539(0x21b, float:7.55E-43)
            r3 = r3 | r4
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L5f
            int r4 = com.appsflyer.internal.AFi1jSDK.$$b     // Catch: java.lang.Throwable -> L5f
            byte r5 = (byte) r4     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = $$c(r2, r3, r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r3 = com.appsflyer.internal.AFi1jSDK.f6304i     // Catch: java.lang.Throwable -> L5f
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3     // Catch: java.lang.Throwable -> L5f
            r5 = 1
            java.lang.Class r2 = java.lang.Class.forName(r2, r5, r3)     // Catch: java.lang.Throwable -> L5f
            r3 = 219(0xdb, float:3.07E-43)
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L5f
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L5f
            r3 = 1157(0x485, float:1.621E-42)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L5f
            r6 = r4 | 4
            int r5 = r6 << 1
            r4 = r4 ^ 4
            int r5 = r5 - r4
            byte r4 = (byte) r5     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = $$c(r0, r3, r4)     // Catch: java.lang.Throwable -> L5f
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L5f
            java.lang.reflect.Method r0 = r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r7 = r0.invoke(r1, r7)     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L5f
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L5f
            int r0 = com.appsflyer.internal.AFi1jSDK.$11
            r1 = r0 & 77
            r0 = r0 | 77
            int r1 = r1 + r0
            int r1 = r1 % 128
            com.appsflyer.internal.AFi1jSDK.$10 = r1
            return r7
        L5f:
            r7 = move-exception
            java.lang.Throwable r0 = r7.getCause()
            if (r0 == 0) goto L67
            throw r0
        L67:
            throw r7
    }

    private static void getMonetizationNetwork(int r0, int r1) {
            int r0 = com.appsflyer.internal.AFi1jSDK.$10
            r1 = r0 ^ 25
            r0 = r0 & 25
            int r0 = r0 << 1
            int r1 = r1 + r0
            int r1 = r1 % 128
            com.appsflyer.internal.AFi1jSDK.$11 = r1
            return
    }

    public static void init$0() {
            int r0 = com.appsflyer.internal.AFi1jSDK.$10
            int r0 = r0 + 121
            int r1 = r0 % 128
            com.appsflyer.internal.AFi1jSDK.$11 = r1
            int r0 = r0 % 2
            java.lang.String r1 = "ISO-8859-1"
            java.lang.String r2 = "~\u000b\u001ctð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBèÑ\u0000úú\b\u0002ñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5Í\u000b\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ûÍ'Ï*\u0005ûüÊ2úúÑÿûÿû3ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñìý\u000eå\u0013ñüôñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøØ7½\u001b\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÚ5Í\u000b\föõýÿî$Ûþ\u0006î\bì\u0016ê\b÷þ\u001dæîú\u0005ú\u0004\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5Ä\u0014\fö$¸Ëëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Éú1Í*üþ\u0000ýýÊþ\u0000úýüþ4\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010ÿî\u001fêì\u000eôö\rÿî.Ë\u0000ý\nô\bç-Ó\u00018ÿþ÷ñÑ\bü"
            r3 = 0
            r4 = 1191(0x4a7, float:1.669E-42)
            if (r0 != 0) goto L24
            byte[] r0 = new byte[r4]
            byte[] r1 = r2.getBytes(r1)
            java.lang.System.arraycopy(r1, r3, r0, r3, r4)
            com.appsflyer.internal.AFi1jSDK.$$a = r0
            r0 = 97
        L21:
            com.appsflyer.internal.AFi1jSDK.$$b = r0
            return
        L24:
            byte[] r0 = new byte[r4]
            byte[] r1 = r2.getBytes(r1)
            java.lang.System.arraycopy(r1, r3, r0, r3, r4)
            com.appsflyer.internal.AFi1jSDK.$$a = r0
            r0 = 66
            goto L21
    }
}
