package com.sumsub.sns.internal.p126ml.docdetector;

import android.content.Context;
import android.graphics.Bitmap;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p126ml.autocapture.C33307a;
import com.sumsub.sns.internal.p126ml.core.AbstractC33324c;
import com.sumsub.sns.internal.p126ml.core.AbstractC33329h;
import com.sumsub.sns.internal.p126ml.core.C33322b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.docdetector.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33353d extends AbstractC33329h {

    /* JADX INFO: renamed from: g */
    public final Context f67999g;

    /* JADX INFO: renamed from: h */
    public final C33307a f68000h;

    /* JADX INFO: renamed from: i */
    public final int[] f68001i;

    /* JADX INFO: renamed from: j */
    public final ByteBuffer f68002j;

    /* JADX INFO: renamed from: k */
    public final ByteBuffer f68003k;

    /* JADX INFO: renamed from: l */
    public final Lazy f68004l;

    /* JADX INFO: renamed from: m */
    public final int f68005m;

    /* JADX INFO: renamed from: n */
    public final C33322b f68006n;

    /* JADX INFO: renamed from: o */
    public final String f68007o;

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: a */
    public final Object mo71636a(Object obj, long j11) {
        this.f68003k.rewind();
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = this.f68005m;
            for (int i13 = 0; i13 < i12; i13++) {
                ((float[][][]) this.f68004l.getValue())[0][i13][i11] = this.f68003k.getFloat();
            }
            int i14 = this.f68005m;
            for (int i15 = 0; i15 < i14; i15++) {
                if (i11 < 4) {
                    if (i11 % 2 == 0) {
                        float[] fArr = ((float[][][]) this.f68004l.getValue())[0][i15];
                        fArr[i11] = fArr[i11] * this.f68000h.f67909d.getWidth();
                    } else {
                        float[] fArr2 = ((float[][][]) this.f68004l.getValue())[0][i15];
                        fArr2[i11] = fArr2[i11] * this.f68000h.f67909d.getHeight();
                    }
                }
            }
        }
        float[][] fArr3 = ((float[][][]) this.f68004l.getValue())[0];
        ArrayList arrayList = new ArrayList();
        for (float[] fArr4 : fArr3) {
            if (fArr4[4] > this.f68000h.f67907b) {
                arrayList.add(fArr4);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new C33351b());
        if (listSortedWith.isEmpty()) {
            return null;
        }
        float[] fArr5 = (float[]) CollectionsKt.first(listSortedWith);
        return new C33350a((int) fArr5[0], (int) fArr5[1], (int) fArr5[2], (int) fArr5[3], fArr5[4], j11, -1L);
    }

    public C33353d(Context context, OkHttpClient okHttpClient, String str, C33307a c33307a) {
        super("MlSolution.DocCapture");
        this.f67999g = context;
        this.f68000h = c33307a;
        this.f68001i = new int[0];
        this.f68002j = ByteBuffer.allocateDirect(0);
        this.f68003k = ByteBuffer.allocateDirect(0);
        this.f68004l = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.ml.docdetector.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33353d.m71662a(this.f68008b);
            }
        });
        this.f68007o = "Doc bounds detector";
        this.f68006n = new C33322b(context, okHttpClient, str, c33307a.f67908c, "MlSolution.DocCapture");
        this.f68001i = new int[c33307a.f67909d.getHeight() * c33307a.f67909d.getWidth()];
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(c33307a.f67909d.getHeight() * c33307a.f67909d.getWidth() * 12);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.f68002j = byteBufferAllocateDirect;
        int i11 = c33307a.f67910e;
        this.f68005m = i11;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i11 * 20);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        this.f68003k = byteBufferAllocateDirect2;
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: b */
    public final AbstractC33324c mo71638b() {
        return this.f68006n;
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: c */
    public final Map mo71639c() {
        HashMap map = new HashMap();
        this.f68003k.rewind();
        map.put(0, this.f68003k);
        return map;
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: d */
    public final String mo71640d() {
        return this.f68007o;
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33329h
    /* JADX INFO: renamed from: a */
    public final Object[] mo71637a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getPixels(this.f68001i, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.f68002j.rewind();
        int height = this.f68000h.f67909d.getHeight();
        for (int i11 = 0; i11 < height; i11++) {
            int width = this.f68000h.f67909d.getWidth();
            for (int i12 = 0; i12 < width; i12++) {
                int i13 = this.f68001i[(this.f68000h.f67909d.getWidth() * i11) + i12];
                this.f68002j.putFloat((((i13 >> 16) & 255) - 0.0f) / 255.0f);
                this.f68002j.putFloat((((i13 >> 8) & 255) - 0.0f) / 255.0f);
                this.f68002j.putFloat(((i13 & 255) - 0.0f) / 255.0f);
            }
        }
        return new Object[]{this.f68002j};
    }

    /* JADX INFO: renamed from: a */
    public static final float[][][] m71662a(C33353d c33353d) {
        int i11 = c33353d.f68005m;
        float[][] fArr = new float[i11][];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i12] = new float[5];
        }
        return new float[][][]{fArr};
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71663a(Bitmap bitmap, boolean z11, ContinuationImpl continuationImpl) throws IOException {
        C33352c c33352c;
        Bitmap bitmap2;
        long j11;
        C33350a c33350a;
        if (continuationImpl instanceof C33352c) {
            c33352c = (C33352c) continuationImpl;
            int i11 = c33352c.f67998e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c33352c.f67998e = i11 - Integer.MIN_VALUE;
            } else {
                c33352c = new C33352c(this, continuationImpl);
            }
        } else {
            c33352c = new C33352c(this, continuationImpl);
        }
        Object objM71657a = c33352c.f67996c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c33352c.f67998e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM71657a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.f68000h.f67909d.getWidth(), this.f68000h.f67909d.getHeight(), false);
            if (z11) {
                m71664a(bitmapCreateScaledBitmap);
            }
            c33352c.f67995b = bitmapCreateScaledBitmap;
            c33352c.f67994a = jCurrentTimeMillis;
            c33352c.f67998e = 1;
            objM71657a = m71657a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005c: INVOKE (r15v5 'objM71657a' java.lang.Object) = 
                  (r12v0 'this' com.sumsub.sns.internal.ml.docdetector.d A[IMMUTABLE_TYPE, THIS])
                  (wrap kotlin.jvm.functions.Function0:0x0002: CONSTRUCTOR 
                  (r12v0 'this' com.sumsub.sns.internal.ml.docdetector.d A[IMMUTABLE_TYPE, THIS])
                  (r13v1 'bitmapCreateScaledBitmap' android.graphics.Bitmap)
                 A[MD:(com.sumsub.sns.internal.ml.core.h, java.lang.Object):void (m), WRAPPED] (LINE:24) call: com.sumsub.sns.internal.ml.core.q.<init>(com.sumsub.sns.internal.ml.core.h, java.lang.Object):void type: CONSTRUCTOR)
                  (r0v2 'c33352c' com.sumsub.sns.internal.ml.docdetector.c)
                 VIRTUAL call: com.sumsub.sns.internal.ml.core.h.a(kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object A[MD:(kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object (m)] (LINE:24) in method: com.sumsub.sns.internal.ml.docdetector.d.a(android.graphics.Bitmap, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object, file: classes59.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.sumsub.sns.internal.ml.core.q, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 21 more
                */
            /*
                this = this;
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
                java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f67998e
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                long r13 = r0.f67994a
                android.graphics.Bitmap r0 = r0.f67995b
                p852kotlin.ResultKt.throwOnFailure(r15)
                goto L65
            L2d:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L35:
                p852kotlin.ResultKt.throwOnFailure(r15)
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
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.p126ml.docdetector.C33353d.m71663a(android.graphics.Bitmap, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }

        /* JADX INFO: renamed from: a */
        public final void m71664a(Bitmap bitmap) throws IOException {
            File externalFilesDir = this.f67999g.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                return;
            }
            File file = new File(externalFilesDir, "scaled_frame_" + System.currentTimeMillis() + ".jpg");
            C33272c c33272c = C33272c.f67812a;
            Logger.DefaultImpls.v$default(c33272c, "MlSolution.DocCapture", "saving to " + file.getAbsolutePath(), null, 4, null);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            if (zCompress) {
                Logger.DefaultImpls.v$default(c33272c, "MlSolution.DocCapture", "saved!", null, 4, null);
            }
        }
    }
