package com.sumsub.sns.internal.features.domain;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.s0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30311s0 extends com.sumsub.sns.internal.features.domain.AbstractC30223k0 {

    /* JADX INFO: renamed from: d */
    public com.sumsub.sns.internal.features.domain.InterfaceC30271n0 f60936d;

    /* JADX INFO: renamed from: e */
    public final java.util.concurrent.ConcurrentHashMap f60937e;

    public C30311s0(com.sumsub.sns.internal.core.domain.C28578h r4) {
            r3 = this;
            kotlin.Lazy r0 = r4.f58168f
            java.lang.Object r0 = r0.getValue()
            com.sumsub.sns.internal.features.data.repository.common.a r0 = (com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a) r0
            kotlin.Lazy r1 = r4.f58169g
            java.lang.Object r1 = r1.getValue()
            com.sumsub.sns.internal.features.data.repository.applicant.d r1 = (com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d) r1
            kotlin.Lazy r2 = r4.f58167e
            java.lang.Object r2 = r2.getValue()
            com.sumsub.sns.internal.features.data.repository.settings.c r2 = (com.sumsub.sns.internal.features.data.repository.settings.C30034c) r2
            kotlin.Lazy r4 = r4.f58180r
            java.lang.Object r4 = r4.getValue()
            com.sumsub.sns.internal.features.data.repository.dynamic.m r4 = (com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m) r4
            r3.<init>(r0, r1, r4)
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>()
            r3.f60937e = r4
            return
    }

    /* JADX INFO: renamed from: a */
    public final int m70178a() {
            r5 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r5.f60937e
            java.util.Collection r0 = r0.values()
            int r0 = kotlin.collections.CollectionsKt.sumOfInt(r0)
            java.util.concurrent.ConcurrentHashMap r1 = r5.f60937e
            int r1 = r1.size()
            int r0 = r0 / r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "total upload progress="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.sumsub.sns.internal.log.a r2 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r2 = r2.f67810a
            java.lang.String r3 = "DocCapture"
            r4 = 0
            r2.mo68955d(r3, r1, r4)
            return r0
    }

    @Override // com.sumsub.sns.internal.features.domain.AbstractC30223k0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ java.lang.Object mo70147a(com.sumsub.sns.internal.features.domain.AbstractC30176f0 r1, com.sumsub.sns.internal.features.data.model.common.AbstractC29172p r2, java.lang.String r3, com.sumsub.sns.internal.features.domain.C30221j0 r4) {
            r0 = this;
            com.sumsub.sns.internal.features.domain.m0 r1 = (com.sumsub.sns.internal.features.domain.C30227m0) r1
            java.lang.Object r1 = r0.m70179a(r1, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70179a(com.sumsub.sns.internal.features.domain.C30227m0 r20, java.lang.String r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            boolean r3 = r2 instanceof com.sumsub.sns.internal.features.domain.C30305p0
            if (r3 == 0) goto L19
            r3 = r2
            com.sumsub.sns.internal.features.domain.p0 r3 = (com.sumsub.sns.internal.features.domain.C30305p0) r3
            int r4 = r3.f60916h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f60916h = r4
            goto L1e
        L19:
            com.sumsub.sns.internal.features.domain.p0 r3 = new com.sumsub.sns.internal.features.domain.p0
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f60914f
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.f60916h
            java.lang.String r6 = "DocCapture"
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L45
            if (r5 != r7) goto L3d
            com.sumsub.sns.internal.features.data.model.common.T r1 = r3.f60913e
            java.util.Iterator r5 = r3.f60912d
            java.util.ArrayList r9 = r3.f60911c
            java.lang.String r10 = r3.f60910b
            com.sumsub.sns.internal.features.domain.m0 r11 = r3.f60909a
            kotlin.ResultKt.throwOnFailure(r2)
            goto L156
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L45:
            kotlin.ResultKt.throwOnFailure(r2)
            java.util.concurrent.ConcurrentHashMap r2 = r0.f60937e
            r2.clear()
            java.util.List r2 = r1.f60759d
            java.util.Iterator r2 = r2.iterator()
        L53:
            boolean r5 = r2.hasNext()
            r9 = 0
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r2.next()
            com.sumsub.sns.internal.features.data.model.common.T r5 = (com.sumsub.sns.internal.features.data.model.common.C29054T) r5
            java.util.concurrent.ConcurrentHashMap r10 = r0.f60937e
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            r10.put(r5, r9)
            goto L53
        L6a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r5 = r1.f60759d
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r5 = r5.iterator()
        L7a:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L8f
            java.lang.Object r11 = r5.next()
            r12 = r11
            com.sumsub.sns.internal.features.data.model.common.T r12 = (com.sumsub.sns.internal.features.data.model.common.C29054T) r12
            boolean r12 = r12.f58999f
            if (r12 != 0) goto L7a
            r10.add(r11)
            goto L7a
        L8f:
            int r5 = r10.size()
            r11 = r9
        L94:
            if (r11 >= r5) goto Lab
            java.lang.Object r12 = r10.get(r11)
            int r11 = r11 + 1
            com.sumsub.sns.internal.features.data.model.common.T r12 = (com.sumsub.sns.internal.features.data.model.common.C29054T) r12
            com.sumsub.sns.internal.features.domain.n0 r13 = r0.f60936d
            if (r13 == 0) goto L94
            com.sumsub.sns.internal.features.domain.documents.S r14 = new com.sumsub.sns.internal.features.domain.documents.S
            r14.<init>(r9)
            r13.mo70170a(r12, r14, r9)
            goto L94
        Lab:
            java.util.List r5 = r1.f60759d
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lb6:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto Lcb
            java.lang.Object r10 = r5.next()
            r11 = r10
            com.sumsub.sns.internal.features.data.model.common.T r11 = (com.sumsub.sns.internal.features.data.model.common.C29054T) r11
            boolean r11 = r11.f58999f
            if (r11 != 0) goto Lb6
            r9.add(r10)
            goto Lb6
        Lcb:
            java.util.Iterator r5 = r9.iterator()
            r10 = r21
        Ld1:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L1d8
            java.lang.Object r9 = r5.next()
            com.sumsub.sns.internal.features.data.model.common.T r9 = (com.sumsub.sns.internal.features.data.model.common.C29054T) r9
            java.lang.String r11 = r9.f58997d
            com.sumsub.sns.internal.features.data.model.common.IdentitySide r12 = r9.f58998e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "uploading "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = ", side="
            r13.append(r11)
            r13.append(r12)
            java.lang.String r11 = " ..."
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            com.sumsub.sns.internal.log.a r12 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r12 = r12.f67810a
            r12.mo68955d(r6, r11, r8)
            com.sumsub.sns.internal.features.data.model.common.Document r11 = r1.f60638a
            com.sumsub.sns.internal.features.data.model.common.X r11 = r11.getType()
            java.lang.String r12 = r11.f59014a
            java.lang.String r13 = "IDENTITY_VIDEO"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r13)
            if (r12 != 0) goto L118
            goto L119
        L118:
            r11 = r8
        L119:
            if (r11 != 0) goto L120
            com.sumsub.sns.internal.features.data.model.common.X r11 = new com.sumsub.sns.internal.features.data.model.common.X
            r11.<init>(r13)
        L120:
            r15 = r11
            com.sumsub.sns.internal.features.data.repository.applicant.d r11 = r0.f60754b
            r12 = r11
            java.io.File r11 = r9.f58995b
            r13 = r12
            java.lang.String r12 = r9.f58997d
            r14 = r13
            com.sumsub.sns.internal.features.data.model.common.IdentitySide r13 = r9.f58998e
            com.sumsub.sns.internal.features.domain.o0 r8 = new com.sumsub.sns.internal.features.domain.o0
            r8.<init>(r9, r0)
            r3.f60909a = r1
            r3.f60910b = r10
            r3.f60911c = r2
            r3.f60912d = r5
            r3.f60913e = r9
            r3.f60916h = r7
            r16 = r9
            r9 = r14
            r14 = 0
            r18 = 16
            r17 = r3
            r3 = r16
            r16 = r8
            java.lang.Object r8 = com.sumsub.sns.internal.features.data.repository.applicant.AbstractC29920c.m70003a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r8 != r4) goto L150
            return r4
        L150:
            r11 = r1
            r9 = r2
            r1 = r3
            r2 = r8
            r3 = r17
        L156:
            com.sumsub.sns.internal.features.data.model.common.remote.Y0 r2 = (com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0) r2
            if (r2 == 0) goto L15d
            java.lang.String r8 = r2.f59320e
            goto L15e
        L15d:
            r8 = 0
        L15e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "uploaded doc="
            r12.append(r13)
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            com.sumsub.sns.internal.log.a r12 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r13 = r12.f67810a
            r14 = 0
            r13.mo68955d(r6, r8, r14)
            com.sumsub.sns.internal.features.domain.h0 r8 = new com.sumsub.sns.internal.features.domain.h0
            com.sumsub.sns.internal.features.presentation.utils.s r13 = com.sumsub.sns.internal.features.presentation.utils.C32635M.f66606w
            r13.getClass()
            java.lang.String r13 = com.sumsub.sns.internal.features.presentation.utils.C32668s.m71291a(r1)
            r8.<init>(r13, r2)
            r9.add(r8)
            com.sumsub.sns.internal.features.domain.n0 r8 = r0.f60936d
            if (r8 == 0) goto L196
            com.sumsub.sns.internal.features.domain.documents.Q r13 = com.sumsub.sns.internal.features.domain.documents.C30123Q.f60563a
            int r14 = r0.m70178a()
            r8.mo70170a(r1, r13, r14)
        L196:
            if (r2 == 0) goto L1d2
            boolean r8 = r2.m69844d()
            if (r8 != r7) goto L1d2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Fast-fail for "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ". Stopping upload ..."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.sumsub.sns.internal.log.logger.b r3 = r12.f67810a
            r14 = 0
            r3.mo68955d(r6, r1, r14)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "response: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sumsub.sns.internal.log.logger.b r2 = r12.f67810a
            r2.mo68955d(r6, r1, r14)
            return r9
        L1d2:
            r14 = 0
            r2 = r9
            r1 = r11
            r8 = r14
            goto Ld1
        L1d8:
            return r2
    }

    @Override // com.sumsub.sns.internal.features.domain.AbstractC30223k0
    /* JADX INFO: renamed from: a */
    public final java.lang.Object mo70148a(java.util.List r2, com.sumsub.sns.internal.features.domain.AbstractC30176f0 r3, com.sumsub.sns.internal.features.domain.C30221j0 r4) {
            r1 = this;
            com.sumsub.sns.internal.features.domain.m0 r3 = (com.sumsub.sns.internal.features.domain.C30227m0) r3
            boolean r0 = r3.f60760e
            if (r0 != 0) goto L14
            java.lang.Object r2 = com.sumsub.sns.internal.features.domain.AbstractC30223k0.m70146a(r1, r2, r3, r4)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L11
            return r2
        L11:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L14:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    @Override // com.sumsub.sns.internal.features.domain.AbstractC30223k0
    /* JADX INFO: renamed from: b */
    public final java.lang.Object mo70149b(com.sumsub.sns.internal.features.domain.AbstractC30176f0 r4, com.sumsub.sns.internal.features.data.model.common.AbstractC29172p r5, java.lang.String r6, com.sumsub.sns.internal.features.domain.C30221j0 r7) {
            r3 = this;
            com.sumsub.sns.internal.features.domain.m0 r4 = (com.sumsub.sns.internal.features.domain.C30227m0) r4
            java.util.concurrent.ConcurrentHashMap r5 = r3.f60937e
            r5.clear()
            java.util.List r5 = r4.f60759d
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r5.next()
            com.sumsub.sns.internal.features.data.model.common.T r0 = (com.sumsub.sns.internal.features.data.model.common.C29054T) r0
            java.util.concurrent.ConcurrentHashMap r1 = r3.f60937e
            r2 = 0
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            r1.put(r0, r2)
            goto Ld
        L24:
            com.sumsub.sns.internal.features.domain.r0 r5 = new com.sumsub.sns.internal.features.domain.r0
            r0 = 0
            r5.<init>(r4, r3, r6, r0)
            java.lang.Object r4 = kotlinx.coroutines.C41713n0.m91130f(r5, r7)
            return r4
    }
}
