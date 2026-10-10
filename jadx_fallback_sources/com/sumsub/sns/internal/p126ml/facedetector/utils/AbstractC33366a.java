package com.sumsub.sns.internal.p126ml.facedetector.utils;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.facedetector.utils.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33366a {
    /* JADX INFO: renamed from: a */
    public static java.util.ArrayList m71667a(com.sumsub.sns.internal.p126ml.facedetector.models.C33358b r23) {
            r0 = r23
            int r1 = r0.f68021a
            if (r1 <= 0) goto L1e7
            java.util.List r2 = r0.f68031k
            java.util.Objects.requireNonNull(r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            if (r1 != r2) goto L1df
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
        L19:
            int r4 = r0.f68021a
            if (r3 >= r4) goto L1de
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = r3
        L32:
            java.util.List r9 = r0.f68031k
            int r9 = r9.size()
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r8 >= r9) goto Le0
            java.util.List r9 = r0.f68031k
            java.lang.Object r9 = r9.get(r8)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.util.List r12 = r0.f68031k
            java.lang.Object r12 = r12.get(r3)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            if (r9 != r12) goto Le0
            double r12 = r0.f68022b
            double r14 = r0.f68023c
            java.util.List r9 = r0.f68031k
            int r9 = r9.size()
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2 = 1
            if (r9 != r2) goto L6d
            double r12 = r12 + r14
            double r12 = r12 * r17
            r19 = r10
            goto L79
        L6d:
            double r14 = r14 - r12
            double r14 = r14 * r10
            r19 = r10
            double r10 = (double) r8
            double r14 = r14 * r10
            float r9 = (float) r9
            float r9 = r9 - r16
            double r9 = (double) r9
            double r14 = r14 / r9
            double r12 = r12 + r14
        L79:
            java.util.List r9 = r0.f68032l
            int r9 = r9.size()
            r10 = 0
        L80:
            if (r10 >= r9) goto L95
            java.util.List r11 = r0.f68032l
            java.lang.Object r11 = r11.get(r10)
            r6.add(r11)
            java.lang.Double r11 = java.lang.Double.valueOf(r12)
            r7.add(r11)
            int r10 = r10 + 1
            goto L80
        L95:
            double r9 = r0.f68028h
            r14 = 0
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 <= 0) goto Ldc
            java.util.List r9 = r0.f68031k
            int r9 = r9.size()
            int r9 = r9 - r2
            if (r8 != r9) goto La9
            r10 = r19
            goto Lc7
        La9:
            double r9 = r0.f68022b
            double r14 = r0.f68023c
            java.util.List r11 = r0.f68031k
            int r11 = r11.size()
            if (r11 != r2) goto Lb9
            double r9 = r9 + r14
            double r10 = r9 * r17
            goto Lc7
        Lb9:
            double r14 = r14 - r9
            double r14 = r14 * r19
            r17 = r9
            double r9 = (double) r8
            double r14 = r14 * r9
            float r2 = (float) r11
            float r2 = r2 - r16
            double r9 = (double) r2
            double r14 = r14 / r9
            double r10 = r14 + r17
        Lc7:
            double r12 = r12 * r10
            double r9 = java.lang.Math.sqrt(r12)
            java.lang.Double r2 = java.lang.Double.valueOf(r9)
            r7.add(r2)
            double r9 = r0.f68028h
            java.lang.Double r2 = java.lang.Double.valueOf(r9)
            r6.add(r2)
        Ldc:
            int r8 = r8 + 1
            goto L32
        Le0:
            r19 = r10
            int r2 = r6.size()
            r9 = 0
        Le7:
            if (r9 >= r2) goto L11e
            java.lang.Object r10 = r6.get(r9)
            java.lang.Number r10 = (java.lang.Number) r10
            double r10 = r10.doubleValue()
            double r10 = java.lang.Math.sqrt(r10)
            java.lang.Object r12 = r7.get(r9)
            java.lang.Number r12 = (java.lang.Number) r12
            double r12 = r12.doubleValue()
            double r12 = r12 / r10
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            r4.add(r12)
            java.lang.Object r12 = r7.get(r9)
            java.lang.Number r12 = (java.lang.Number) r12
            double r12 = r12.doubleValue()
            double r12 = r12 * r10
            java.lang.Double r10 = java.lang.Double.valueOf(r12)
            r5.add(r10)
            int r9 = r9 + 1
            goto Le7
        L11e:
            java.util.List r2 = r0.f68030j
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L13f
            java.util.List r2 = r0.f68030j
            java.lang.Object r2 = r2.get(r3)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.util.List r6 = r0.f68029i
            java.lang.Object r3 = r6.get(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            goto L163
        L13f:
            java.util.List r2 = r0.f68031k
            java.lang.Object r2 = r2.get(r3)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r3 = r0.f68024d
            double r6 = (double) r3
            double r6 = r6 * r19
            double r2 = (double) r2
            double r6 = r6 / r2
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r7 = r0.f68025e
            double r9 = (double) r7
            double r9 = r9 * r19
            double r9 = r9 / r2
            double r2 = java.lang.Math.ceil(r9)
            int r3 = (int) r2
            r2 = r6
        L163:
            r6 = 0
        L164:
            if (r6 >= r2) goto L1d9
            r7 = 0
        L167:
            if (r7 >= r3) goto L1cf
            int r9 = r4.size()
            r10 = 0
        L16e:
            if (r10 >= r9) goto L1c3
            double r11 = (double) r7
            double r13 = r0.f68026f
            double r11 = r11 + r13
            double r11 = r11 * r19
            double r13 = (double) r3
            double r11 = r11 / r13
            double r13 = (double) r6
            r15 = r6
            r16 = r7
            double r6 = r0.f68027g
            double r13 = r13 + r6
            double r13 = r13 * r19
            double r6 = (double) r2
            double r13 = r13 / r6
            boolean r6 = r0.f68033m
            if (r6 == 0) goto L18f
            r17 = r2
            r18 = r3
            r2 = r19
            r6 = r2
            goto L1ab
        L18f:
            java.lang.Object r6 = r5.get(r10)
            java.lang.Number r6 = (java.lang.Number) r6
            double r6 = r6.doubleValue()
            java.lang.Object r17 = r4.get(r10)
            java.lang.Number r17 = (java.lang.Number) r17
            double r17 = r17.doubleValue()
            r21 = r17
            r17 = r2
            r18 = r3
            r2 = r21
        L1ab:
            com.sumsub.sns.internal.ml.facedetector.models.a r0 = new com.sumsub.sns.internal.ml.facedetector.models.a
            float r11 = (float) r11
            float r12 = (float) r13
            float r6 = (float) r6
            float r2 = (float) r2
            r0.<init>(r11, r12, r6, r2)
            r1.add(r0)
            int r10 = r10 + 1
            r0 = r23
            r6 = r15
            r7 = r16
            r2 = r17
            r3 = r18
            goto L16e
        L1c3:
            r17 = r2
            r18 = r3
            r15 = r6
            r16 = r7
            int r7 = r16 + 1
            r0 = r23
            goto L167
        L1cf:
            r17 = r2
            r18 = r3
            r15 = r6
            int r6 = r15 + 1
            r0 = r23
            goto L164
        L1d9:
            r0 = r23
            r3 = r8
            goto L19
        L1de:
            return r1
        L1df:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Strides size must equal to NumLayers"
            r0.<init>(r1)
            throw r0
        L1e7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "NumLayers must be greater than 0, numLayers: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }
}
