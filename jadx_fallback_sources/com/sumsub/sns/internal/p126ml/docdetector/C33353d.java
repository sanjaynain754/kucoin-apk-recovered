package com.sumsub.sns.internal.p126ml.docdetector;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.docdetector.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33353d extends com.sumsub.sns.internal.p126ml.core.AbstractC33329h {

    /* JADX INFO: renamed from: g */
    public final android.content.Context f67999g;

    /* JADX INFO: renamed from: h */
    public final com.sumsub.sns.internal.p126ml.autocapture.C33307a f68000h;

    /* JADX INFO: renamed from: i */
    public final int[] f68001i;

    /* JADX INFO: renamed from: j */
    public final java.nio.ByteBuffer f68002j;

    /* JADX INFO: renamed from: k */
    public final java.nio.ByteBuffer f68003k;

    /* JADX INFO: renamed from: l */
    public final kotlin.Lazy f68004l;

    /* JADX INFO: renamed from: m */
    public final int f68005m;

    /* JADX INFO: renamed from: n */
    public final com.sumsub.sns.internal.p126ml.core.C33322b f68006n;

    /* JADX INFO: renamed from: o */
    public final java.lang.String f68007o;

    public C33353d(android.content.Context r8, okhttp3.OkHttpClient r9, java.lang.String r10, com.sumsub.sns.internal.p126ml.autocapture.C33307a r11) {
            r7 = this;
            java.lang.String r0 = "MlSolution.DocCapture"
            r7.<init>(r0)
            r7.f67999g = r8
            r7.f68000h = r11
            r0 = 0
            int[] r1 = new int[r0]
            r7.f68001i = r1
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r0)
            r7.f68002j = r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r7.f68003k = r0
            com.sumsub.sns.internal.ml.docdetector.e r0 = new com.sumsub.sns.internal.ml.docdetector.e
            r0.<init>(r7)
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r7.f68004l = r0
            java.lang.String r0 = "Doc bounds detector"
            r7.f68007o = r0
            com.sumsub.sns.internal.ml.core.b r1 = new com.sumsub.sns.internal.ml.core.b
            boolean r5 = r11.f67908c
            java.lang.String r6 = "MlSolution.DocCapture"
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f68006n = r1
            android.util.Size r8 = r11.f67909d
            int r8 = r8.getWidth()
            android.util.Size r9 = r11.f67909d
            int r9 = r9.getHeight()
            int r9 = r9 * r8
            int[] r8 = new int[r9]
            r7.f68001i = r8
            android.util.Size r8 = r11.f67909d
            int r8 = r8.getWidth()
            android.util.Size r9 = r11.f67909d
            int r9 = r9.getHeight()
            int r9 = r9 * r8
            int r9 = r9 * 12
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocateDirect(r9)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.nativeOrder()
            r8.order(r9)
            r7.f68002j = r8
            int r8 = r11.f67910e
            r7.f68005m = r8
            int r8 = r8 * 20
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocateDirect(r8)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.nativeOrder()
            r8.order(r9)
            r7.f68003k = r8
            return
    }

    /* JADX INFO: renamed from: a */
    public static final float[][][] m71662a(com.sumsub.sns.internal.p126ml.docdetector.C33353d r3) {
            int r3 = r3.f68005m
            float[][] r0 = new float[r3][]
            r1 = 0
        L5:
            if (r1 >= r3) goto Lf
            r2 = 5
            float[] r2 = new float[r2]
            r0[r1] = r2
            int r1 = r1 + 1
            goto L5
        Lf:
            float[][][] r3 = new float[][][]{r0}
            return r3
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m71663a(android.graphics.Bitmap r13, boolean r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
            r12 = this;
            boolean r0 = r15 instanceof com.sumsub.sns.internal.p126ml.docdetector.C33352c
            if (r0 == 0) goto L13
            r0 = r15
            com.sumsub.sns.internal.ml.docdetector.c r0 = (com.sumsub.sns.internal.p126ml.docdetector.C33352c) r0
            int r1 = r0.f67998e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67998e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.ml.docdetector.c r0 = new com.sumsub.sns.internal.ml.docdetector.c
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f67996c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f67998e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r13 = r0.f67994a
            android.graphics.Bitmap r0 = r0.f67995b
            kotlin.ResultKt.throwOnFailure(r15)
            goto L65
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            kotlin.ResultKt.throwOnFailure(r15)
            long r4 = java.lang.System.currentTimeMillis()
            com.sumsub.sns.internal.ml.autocapture.a r15 = r12.f68000h
            android.util.Size r15 = r15.f67909d
            int r15 = r15.getWidth()
            com.sumsub.sns.internal.ml.autocapture.a r2 = r12.f68000h
            android.util.Size r2 = r2.f67909d
            int r2 = r2.getHeight()
            r6 = 0
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createScaledBitmap(r13, r15, r2, r6)
            if (r14 == 0) goto L56
            r12.m71664a(r13)
        L56:
            r0.f67995b = r13
            r0.f67994a = r4
            r0.f67998e = r3
            java.lang.Object r15 = com.sumsub.sns.internal.p126ml.core.AbstractC33329h.m71647a(r12, r13, r0)
            if (r15 != r1) goto L63
            return r1
        L63:
            r0 = r13
            r13 = r4
        L65:
            com.sumsub.sns.internal.ml.core.n r15 = (com.sumsub.sns.internal.p126ml.core.AbstractC33335n) r15
            r0.recycle()
            boolean r0 = r15 instanceof com.sumsub.sns.internal.p126ml.core.C33333l
            r1 = 0
            if (r0 == 0) goto L8f
            com.sumsub.sns.internal.ml.core.l r15 = (com.sumsub.sns.internal.p126ml.core.C33333l) r15
            java.lang.Object r15 = r15.f67967a
            com.sumsub.sns.internal.ml.docdetector.a r15 = (com.sumsub.sns.internal.p126ml.docdetector.C33350a) r15
            if (r15 == 0) goto L8f
            long r0 = java.lang.System.currentTimeMillis()
            long r10 = r0 - r13
            int r3 = r15.f67987a
            int r4 = r15.f67988b
            int r5 = r15.f67989c
            int r6 = r15.f67990d
            float r7 = r15.f67991e
            long r8 = r15.f67992f
            com.sumsub.sns.internal.ml.docdetector.a r2 = new com.sumsub.sns.internal.ml.docdetector.a
            r2.<init>(r3, r4, r5, r6, r7, r8, r10)
            return r2
        L8f:
            return r1
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: a */
    public final java.lang.Object mo71636a(java.lang.Object r14, long r15) {
            r13 = this;
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            java.nio.ByteBuffer r14 = r13.f68003k
            r14.rewind()
            r14 = 0
            r0 = r14
        L9:
            r1 = 5
            r2 = 4
            if (r0 >= r1) goto L6f
            int r1 = r13.f68005m
            r3 = r14
        L10:
            if (r3 >= r1) goto L29
            kotlin.Lazy r4 = r13.f68004l
            java.lang.Object r4 = r4.getValue()
            float[][][] r4 = (float[][][]) r4
            r4 = r4[r14]
            r4 = r4[r3]
            java.nio.ByteBuffer r5 = r13.f68003k
            float r5 = r5.getFloat()
            r4[r0] = r5
            int r3 = r3 + 1
            goto L10
        L29:
            int r1 = r13.f68005m
            r3 = r14
        L2c:
            if (r3 >= r1) goto L6c
            if (r0 >= r2) goto L69
            int r4 = r0 % 2
            if (r4 != 0) goto L4f
            kotlin.Lazy r4 = r13.f68004l
            java.lang.Object r4 = r4.getValue()
            float[][][] r4 = (float[][][]) r4
            r4 = r4[r14]
            r4 = r4[r3]
            r5 = r4[r0]
            com.sumsub.sns.internal.ml.autocapture.a r6 = r13.f68000h
            android.util.Size r6 = r6.f67909d
            int r6 = r6.getWidth()
            float r6 = (float) r6
            float r5 = r5 * r6
            r4[r0] = r5
            goto L69
        L4f:
            kotlin.Lazy r4 = r13.f68004l
            java.lang.Object r4 = r4.getValue()
            float[][][] r4 = (float[][][]) r4
            r4 = r4[r14]
            r4 = r4[r3]
            r5 = r4[r0]
            com.sumsub.sns.internal.ml.autocapture.a r6 = r13.f68000h
            android.util.Size r6 = r6.f67909d
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r5 = r5 * r6
            r4[r0] = r5
        L69:
            int r3 = r3 + 1
            goto L2c
        L6c:
            int r0 = r0 + 1
            goto L9
        L6f:
            kotlin.Lazy r0 = r13.f68004l
            java.lang.Object r0 = r0.getValue()
            float[][][] r0 = (float[][][]) r0
            r0 = r0[r14]
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r0.length
            r4 = r14
        L80:
            if (r4 >= r3) goto L94
            r5 = r0[r4]
            r6 = r5[r2]
            com.sumsub.sns.internal.ml.autocapture.a r7 = r13.f68000h
            float r7 = r7.f67907b
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L91
            r1.add(r5)
        L91:
            int r4 = r4 + 1
            goto L80
        L94:
            com.sumsub.sns.internal.ml.docdetector.b r0 = new com.sumsub.sns.internal.ml.docdetector.b
            r0.<init>()
            java.util.List r0 = kotlin.collections.CollectionsKt.sortedWith(r1, r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La5
            r14 = 0
            return r14
        La5:
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r0)
            float[] r0 = (float[]) r0
            com.sumsub.sns.internal.ml.docdetector.a r3 = new com.sumsub.sns.internal.ml.docdetector.a
            r14 = r0[r14]
            int r4 = (int) r14
            r14 = 1
            r14 = r0[r14]
            int r5 = (int) r14
            r14 = 2
            r14 = r0[r14]
            int r6 = (int) r14
            r14 = 3
            r14 = r0[r14]
            int r7 = (int) r14
            r8 = r0[r2]
            r11 = -1
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            return r3
    }

    /* JADX INFO: renamed from: a */
    public final void m71664a(android.graphics.Bitmap r10) {
            r9 = this;
            android.content.Context r0 = r9.f67999g
            r1 = 0
            java.io.File r0 = r0.getExternalFilesDir(r1)
            if (r0 != 0) goto La
            goto L6a
        La:
            java.io.File r1 = new java.io.File
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "scaled_frame_"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ".jpg"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r0, r2)
            com.sumsub.sns.internal.log.c r3 = com.sumsub.sns.internal.log.C33272c.f67812a
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "saving to "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            r7 = 4
            r8 = 0
            java.lang.String r4 = "MlSolution.DocCapture"
            r6 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.v$default(r3, r4, r5, r6, r7, r8)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 90
            boolean r10 = r10.compress(r1, r2, r0)
            r0.flush()
            r0.close()
            if (r10 == 0) goto L6a
            r7 = 4
            r8 = 0
            java.lang.String r4 = "MlSolution.DocCapture"
            java.lang.String r5 = "saved!"
            r6 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.v$default(r3, r4, r5, r6, r7, r8)
        L6a:
            return
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: a */
    public final java.lang.Object[] mo71637a(java.lang.Object r10) {
            r9 = this;
            r0 = r10
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int[] r1 = r9.f68001i
            int r3 = r0.getWidth()
            int r6 = r0.getWidth()
            int r7 = r0.getHeight()
            r4 = 0
            r5 = 0
            r2 = 0
            r0.getPixels(r1, r2, r3, r4, r5, r6, r7)
            java.nio.ByteBuffer r10 = r9.f68002j
            r10.rewind()
            com.sumsub.sns.internal.ml.autocapture.a r10 = r9.f68000h
            android.util.Size r10 = r10.f67909d
            int r10 = r10.getHeight()
            r0 = 0
            r1 = r0
        L26:
            if (r1 >= r10) goto L6c
            com.sumsub.sns.internal.ml.autocapture.a r2 = r9.f68000h
            android.util.Size r2 = r2.f67909d
            int r2 = r2.getWidth()
            r3 = r0
        L31:
            if (r3 >= r2) goto L69
            int[] r4 = r9.f68001i
            com.sumsub.sns.internal.ml.autocapture.a r5 = r9.f68000h
            android.util.Size r5 = r5.f67909d
            int r5 = r5.getWidth()
            int r5 = r5 * r1
            int r5 = r5 + r3
            r4 = r4[r5]
            java.nio.ByteBuffer r5 = r9.f68002j
            int r6 = r4 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            r7 = 0
            float r6 = r6 - r7
            r8 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 / r8
            r5.putFloat(r6)
            java.nio.ByteBuffer r5 = r9.f68002j
            int r6 = r4 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r6 = r6 - r7
            float r6 = r6 / r8
            r5.putFloat(r6)
            java.nio.ByteBuffer r5 = r9.f68002j
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 - r7
            float r4 = r4 / r8
            r5.putFloat(r4)
            int r3 = r3 + 1
            goto L31
        L69:
            int r1 = r1 + 1
            goto L26
        L6c:
            java.nio.ByteBuffer r10 = r9.f68002j
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            return r10
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: b */
    public final com.sumsub.sns.internal.p126ml.core.AbstractC33324c mo71638b() {
            r1 = this;
            com.sumsub.sns.internal.ml.core.b r0 = r1.f68006n
            return r0
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: c */
    public final java.util.Map mo71639c() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.nio.ByteBuffer r1 = r3.f68003k
            r1.rewind()
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.nio.ByteBuffer r2 = r3.f68003k
            r0.put(r1, r2)
            return r0
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: d */
    public final java.lang.String mo71640d() {
            r1 = this;
            java.lang.String r0 = r1.f68007o
            return r0
    }
}
