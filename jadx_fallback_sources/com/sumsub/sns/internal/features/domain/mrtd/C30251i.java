package com.sumsub.sns.internal.features.domain.mrtd;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30251i {

    /* JADX INFO: renamed from: a */
    public final com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m f60818a;

    /* JADX INFO: renamed from: b */
    public final com.sumsub.sns.internal.features.domain.mrtd.C30234G f60819b;

    public C30251i(com.sumsub.sns.internal.core.domain.C28578h r3) {
            r2 = this;
            kotlin.Lazy r0 = r3.f58180r
            java.lang.Object r0 = r0.getValue()
            com.sumsub.sns.internal.features.data.repository.dynamic.m r0 = (com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m) r0
            com.sumsub.sns.internal.features.domain.mrtd.G r1 = new com.sumsub.sns.internal.features.domain.mrtd.G
            r1.<init>(r3)
            r2.<init>()
            r2.f60818a = r0
            r2.f60819b = r1
            return
    }

    /* JADX INFO: renamed from: a */
    public static final java.lang.CharSequence m70154a(kotlin.Pair r0) {
            java.lang.Object r0 = r0.getFirst()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70155a(com.sumsub.sns.internal.features.data.model.common.Document r24, com.sumsub.sns.internal.features.data.model.common.C29154m r25, java.util.ArrayList r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r27
            boolean r3 = r2 instanceof com.sumsub.sns.internal.features.domain.mrtd.C30247g
            if (r3 == 0) goto L19
            r3 = r2
            com.sumsub.sns.internal.features.domain.mrtd.g r3 = (com.sumsub.sns.internal.features.domain.mrtd.C30247g) r3
            int r4 = r3.f60811i
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f60811i = r4
            goto L1e
        L19:
            com.sumsub.sns.internal.features.domain.mrtd.g r3 = new com.sumsub.sns.internal.features.domain.mrtd.g
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f60809g
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.f60811i
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L65
            if (r5 == r8) goto L4a
            if (r5 != r6) goto L42
            java.lang.Object r1 = r3.f60804b
            com.sumsub.sns.internal.features.data.model.common.A2 r1 = (com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2) r1
            java.lang.Object r3 = r3.f60803a
            java.util.List r3 = (java.util.List) r3
            kotlin.ResultKt.throwOnFailure(r2)
            kotlin.Result r2 = (kotlin.Result) r2
            r2.m103853unboximpl()
            goto L18a
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L4a:
            boolean r1 = r3.f60808f
            java.util.Iterator r5 = r3.f60807e
            java.util.Collection r10 = r3.f60806d
            java.util.List r11 = r3.f60805c
            java.lang.Object r12 = r3.f60804b
            com.sumsub.sns.internal.features.data.model.common.m r12 = (com.sumsub.sns.internal.features.data.model.common.C29154m) r12
            java.lang.Object r13 = r3.f60803a
            com.sumsub.sns.internal.features.data.model.common.Document r13 = (com.sumsub.sns.internal.features.data.model.common.Document) r13
            kotlin.ResultKt.throwOnFailure(r2)
            r15 = r3
            r3 = r11
            r11 = r10
            r10 = r5
            r5 = r1
            r1 = r13
            goto Lcc
        L65:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.String r2 = r1.f59145n
            if (r2 == 0) goto L73
            java.lang.String r5 = "disabled"
            boolean r2 = kotlin.text.StringsKt.equals(r2, r5, r8)
            goto L74
        L73:
            r2 = r7
        L74:
            if (r2 == 0) goto L87
            com.sumsub.sns.internal.log.c r10 = com.sumsub.sns.internal.log.C33272c.f67812a
            r14 = 4
            r15 = 0
            java.lang.String r11 = "SumSubNfc"
            java.lang.String r12 = "NFC disabled, skipping.."
            r13 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.d$default(r10, r11, r12, r13, r14, r15)
            java.lang.Object r1 = kotlin.Result.m103844constructorimpl(r9)
            return r1
        L87:
            java.lang.String r2 = r1.f59145n
            if (r2 == 0) goto L93
            java.lang.String r5 = "optional"
            boolean r2 = kotlin.text.StringsKt.equals(r2, r5, r8)
            goto L94
        L93:
            r2 = r8
        L94:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r10 = r26.iterator()
            r15 = r3
            r11 = r5
            r3 = r26
            r5 = r2
            r2 = r1
            r1 = r24
        La5:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Ld5
            java.lang.Object r12 = r10.next()
            com.sumsub.sns.internal.features.data.model.common.remote.Y0 r12 = (com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0) r12
            r15.f60803a = r1
            r15.f60804b = r2
            r15.f60805c = r3
            r15.f60806d = r11
            r15.f60807e = r10
            r15.f60808f = r5
            r15.f60811i = r8
            java.lang.Object r12 = r0.m70157a(r12, r1, r5, r15)
            if (r12 != r4) goto Lc7
            goto L188
        Lc7:
            r22 = r12
            r12 = r2
            r2 = r22
        Lcc:
            com.sumsub.sns.internal.features.data.model.common.A2 r2 = (com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2) r2
            if (r2 == 0) goto Ld3
            r11.add(r2)
        Ld3:
            r2 = r12
            goto La5
        Ld5:
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r5 = r11.iterator()
        Ldb:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto Led
            java.lang.Object r10 = r5.next()
            r12 = r10
            com.sumsub.sns.internal.features.data.model.common.A2 r12 = (com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2) r12
            boolean r12 = r12 instanceof com.sumsub.sns.internal.features.data.model.common.C28998E2
            if (r12 == 0) goto Ldb
            goto Lee
        Led:
            r10 = r9
        Lee:
            com.sumsub.sns.internal.features.data.model.common.A2 r10 = (com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2) r10
            if (r10 != 0) goto Lf9
            java.lang.Object r5 = kotlin.collections.CollectionsKt.firstOrNull(r11)
            com.sumsub.sns.internal.features.data.model.common.A2 r5 = (com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2) r5
            goto Lfa
        Lf9:
            r5 = r10
        Lfa:
            if (r5 != 0) goto L1bf
            com.sumsub.sns.internal.log.c r16 = com.sumsub.sns.internal.log.C33272c.f67812a
            java.lang.String r10 = r2.f59145n
            com.sumsub.sns.internal.features.data.model.common.X r11 = r1.getType()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Skipping NFC check - missing info, nfcMode="
            r12.append(r13)
            r12.append(r10)
            java.lang.String r10 = ", docType="
            r12.append(r10)
            r12.append(r11)
            java.lang.String r18 = r12.toString()
            r20 = 4
            r21 = 0
            java.lang.String r17 = "SumSubNfc"
            r19 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.d$default(r16, r17, r18, r19, r20, r21)
            java.lang.String r2 = r2.f59145n
            if (r2 == 0) goto L134
            java.lang.String r10 = "required"
            boolean r2 = kotlin.text.StringsKt.equals(r2, r10, r8)
            goto L135
        L134:
            r2 = r7
        L135:
            if (r2 == 0) goto L1bf
            com.sumsub.sns.internal.features.data.model.common.X r1 = r1.getType()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r10 = "NFC required but some values are missing, should be rejected in dashboard. docType="
            r2.append(r10)
            r2.append(r1)
            java.lang.String r18 = r2.toString()
            r20 = 4
            r21 = 0
            java.lang.String r17 = "SumSubNfc"
            r19 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.e$default(r16, r17, r18, r19, r20, r21)
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r3)
            com.sumsub.sns.internal.features.data.model.common.remote.Y0 r1 = (com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0) r1
            com.sumsub.sns.internal.features.domain.mrtd.G r10 = r0.f60819b
            if (r1 == 0) goto L165
            java.lang.String r2 = r1.f59320e
            r11 = r2
            goto L166
        L165:
            r11 = r9
        L166:
            if (r1 == 0) goto L16c
            java.lang.String r2 = r1.f59317b
            r12 = r2
            goto L16d
        L16c:
            r12 = r9
        L16d:
            if (r1 == 0) goto L173
            java.lang.String r1 = r1.f59316a
            r13 = r1
            goto L174
        L173:
            r13 = r9
        L174:
            com.sumsub.sns.internal.features.data.model.common.MRTDError r14 = com.sumsub.sns.internal.features.data.model.common.MRTDError.AccessDataMissing
            r15.f60803a = r3
            r15.f60804b = r5
            r15.f60805c = r9
            r15.f60806d = r9
            r15.f60807e = r9
            r15.f60811i = r6
            java.lang.Object r1 = r10.m70151a(r11, r12, r13, r14, r15)
            if (r1 != r4) goto L189
        L188:
            return r4
        L189:
            r1 = r5
        L18a:
            if (r3 == 0) goto L193
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L193
            goto L1ac
        L193:
            java.util.Iterator r2 = r3.iterator()
        L197:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1ac
            java.lang.Object r3 = r2.next()
            com.sumsub.sns.internal.features.data.model.common.remote.Y0 r3 = (com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0) r3
            if (r3 == 0) goto L197
            boolean r3 = r3.m69844d()
            if (r3 != r8) goto L197
            r7 = r8
        L1ac:
            if (r7 != 0) goto L1be
            com.sumsub.sns.core.data.model.SNSGeneralException r10 = new com.sumsub.sns.core.data.model.SNSGeneralException
            r14 = 4
            r15 = 0
            java.lang.String r11 = "NFC required but mrtdSeed=null, should have been rejected in dashboard."
            java.lang.String r12 = "mrtdAccessDataMissing"
            r13 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r5 = r1
            r9 = r10
            goto L1bf
        L1be:
            r5 = r1
        L1bf:
            if (r9 == 0) goto L1cc
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r1 = kotlin.Result.m103844constructorimpl(r1)
            return r1
        L1cc:
            java.lang.Object r1 = kotlin.Result.m103844constructorimpl(r5)
            return r1
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70156a(com.sumsub.sns.internal.features.data.model.common.Document r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, com.sumsub.sns.internal.features.data.model.common.remote.C29655v0 r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
            r24 = this;
            r0 = r24
            r1 = r31
            boolean r2 = r1 instanceof com.sumsub.sns.internal.features.domain.mrtd.C30245f
            if (r2 == 0) goto L17
            r2 = r1
            com.sumsub.sns.internal.features.domain.mrtd.f r2 = (com.sumsub.sns.internal.features.domain.mrtd.C30245f) r2
            int r3 = r2.f60801i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f60801i = r3
            goto L1c
        L17:
            com.sumsub.sns.internal.features.domain.mrtd.f r2 = new com.sumsub.sns.internal.features.domain.mrtd.f
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f60799g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f60801i
            r5 = 1
            if (r4 == 0) goto L45
            if (r4 != r5) goto L3d
            boolean r3 = r2.f60798f
            com.sumsub.sns.internal.features.data.model.common.remote.v0 r4 = r2.f60797e
            java.lang.String r6 = r2.f60796d
            java.lang.String r7 = r2.f60795c
            java.lang.String r8 = r2.f60794b
            com.sumsub.sns.internal.features.data.model.common.Document r2 = r2.f60793a
            kotlin.ResultKt.throwOnFailure(r1)
            r11 = r3
            r10 = r6
            r9 = r7
            r7 = r2
            goto L75
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L45:
            kotlin.ResultKt.throwOnFailure(r1)
            com.sumsub.sns.internal.features.data.repository.dynamic.m r1 = r0.f60818a
            r4 = r25
            r2.f60793a = r4
            r6 = r26
            r2.f60794b = r6
            r7 = r27
            r2.f60795c = r7
            r8 = r28
            r2.f60796d = r8
            r9 = r30
            r2.f60797e = r9
            r10 = r29
            r2.f60798f = r10
            r2.f60801i = r5
            com.sumsub.sns.internal.features.data.repository.dynamic.J r1 = (com.sumsub.sns.internal.features.data.repository.dynamic.C29967J) r1
            r11 = 0
            java.lang.Object r1 = r1.m70045b(r11, r2)
            if (r1 != r3) goto L6e
            return r3
        L6e:
            r11 = r7
            r7 = r4
            r4 = r9
            r9 = r11
            r11 = r10
            r10 = r8
            r8 = r6
        L75:
            com.sumsub.sns.internal.features.data.repository.dynamic.N r1 = (com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N) r1
            java.lang.Object r1 = r1.m70051c()
            com.sumsub.sns.internal.features.data.model.common.h r1 = (com.sumsub.sns.internal.features.data.model.common.C29124h) r1
            r2 = 0
            if (r1 == 0) goto L8e
            com.sumsub.sns.internal.features.data.model.common.remote.X r1 = r1.f59086s
            if (r1 == 0) goto L8e
            java.lang.String r3 = r1.f59311b
            java.lang.String r1 = r1.f59310a
            kotlin.Pair r1 = kotlin.TuplesKt.m90091to(r3, r1)
            if (r1 != 0) goto L93
        L8e:
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r2, r2)
        L93:
            java.lang.Object r3 = r1.component1()
            r18 = r3
            java.lang.String r18 = (java.lang.String) r18
            java.lang.Object r1 = r1.component2()
            r17 = r1
            java.lang.String r17 = (java.lang.String) r17
            java.lang.String r1 = r4.f59707c
            java.lang.String r3 = r4.f59708d
            java.lang.String r6 = r4.f59709e
            java.lang.String r12 = r4.f59711g
            if (r17 == 0) goto Lb7
            if (r18 == 0) goto Lb7
            if (r1 == 0) goto Lb7
            if (r3 == 0) goto Lb7
            if (r6 == 0) goto Lb7
            if (r12 != 0) goto Lc3
        Lb7:
            r25 = r2
            r4 = r3
            r5 = r6
            r6 = r12
            r3 = r18
            r2 = r1
            r1 = r17
            goto L12e
        Lc3:
            java.lang.Integer r13 = r4.f59713i
            if (r13 == 0) goto Lcc
            int r13 = r13.intValue()
            goto Lcd
        Lcc:
            r13 = r5
        Lcd:
            java.lang.Integer r14 = r4.f59714j
            if (r14 == 0) goto Le0
            int r15 = r14.intValue()
            if (r15 <= 0) goto Ld8
            goto Ld9
        Ld8:
            r14 = r2
        Ld9:
            if (r14 == 0) goto Le0
            int r14 = r14.intValue()
            goto Le3
        Le0:
            r14 = 2147483647(0x7fffffff, float:NaN)
        Le3:
            java.lang.String r15 = r4.f59715k
            if (r15 == 0) goto L114
            kotlin.enums.EnumEntries r16 = com.sumsub.sns.internal.features.data.model.common.MRTDInstructionType.getEntries()
            java.util.Iterator r16 = r16.iterator()
        Lef:
            boolean r19 = r16.hasNext()
            if (r19 == 0) goto L10f
            java.lang.Object r19 = r16.next()
            r20 = r19
            com.sumsub.sns.internal.features.data.model.common.MRTDInstructionType r20 = (com.sumsub.sns.internal.features.data.model.common.MRTDInstructionType) r20
            r25 = r2
            java.lang.String r2 = r20.getValue()
            boolean r2 = kotlin.text.StringsKt.equals(r2, r15, r5)
            if (r2 == 0) goto L10c
            r2 = r19
            goto L111
        L10c:
            r2 = r25
            goto Lef
        L10f:
            r25 = r2
        L111:
            com.sumsub.sns.internal.features.data.model.common.MRTDInstructionType r2 = (com.sumsub.sns.internal.features.data.model.common.MRTDInstructionType) r2
            goto L116
        L114:
            r25 = r2
        L116:
            java.lang.String r4 = r4.f59710f
            r23 = r6
            com.sumsub.sns.internal.features.data.model.common.E2 r6 = new com.sumsub.sns.internal.features.data.model.common.E2
            r16 = 0
            r15 = 0
            r21 = r1
            r22 = r3
            r19 = r4
            r20 = r12
            r12 = r13
            r13 = r14
            r14 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r6
        L12e:
            java.lang.String r7 = "clientUrl"
            kotlin.Pair r1 = kotlin.TuplesKt.m90091to(r7, r1)
            java.lang.String r7 = "clientId"
            kotlin.Pair r3 = kotlin.TuplesKt.m90091to(r7, r3)
            java.lang.String r7 = "documentNumber"
            kotlin.Pair r2 = kotlin.TuplesKt.m90091to(r7, r2)
            java.lang.String r7 = "birthDate"
            kotlin.Pair r4 = kotlin.TuplesKt.m90091to(r7, r4)
            java.lang.String r7 = "expirationDate"
            kotlin.Pair r5 = kotlin.TuplesKt.m90091to(r7, r5)
            java.lang.String r7 = "emrtdSessionId"
            kotlin.Pair r6 = kotlin.TuplesKt.m90091to(r7, r6)
            r26 = r1
            r28 = r2
            r27 = r3
            r29 = r4
            r30 = r5
            r31 = r6
            kotlin.Pair[] r1 = new kotlin.Pair[]{r26, r27, r28, r29, r30, r31}
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L16f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L186
            java.lang.Object r3 = r1.next()
            r4 = r3
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r4 = r4.getSecond()
            if (r4 != 0) goto L16f
            r2.add(r3)
            goto L16f
        L186:
            com.sumsub.sns.internal.features.domain.mrtd.a0 r8 = new com.sumsub.sns.internal.features.domain.mrtd.a0
            r8.<init>()
            r9 = 31
            r10 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r1 = kotlin.collections.CollectionsKt.joinToString$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.sumsub.sns.internal.log.c r2 = com.sumsub.sns.internal.log.C33272c.f67812a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Some values are missing: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 4
            r4 = 0
            java.lang.String r5 = "SumSubNfc"
            r6 = 0
            r28 = r1
            r26 = r2
            r30 = r3
            r31 = r4
            r27 = r5
            r29 = r6
            com.sumsub.log.logger.Logger.DefaultImpls.w$default(r26, r27, r28, r29, r30, r31)
            return r25
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70157a(com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0 r28, com.sumsub.sns.internal.features.data.model.common.Document r29, boolean r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
            r27 = this;
            r0 = r28
            r1 = r31
            boolean r2 = r1 instanceof com.sumsub.sns.internal.features.domain.mrtd.C30249h
            if (r2 == 0) goto L1a
            r2 = r1
            com.sumsub.sns.internal.features.domain.mrtd.h r2 = (com.sumsub.sns.internal.features.domain.mrtd.C30249h) r2
            int r3 = r2.f60816e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f60816e = r3
            r3 = r27
        L18:
            r10 = r2
            goto L22
        L1a:
            com.sumsub.sns.internal.features.domain.mrtd.h r2 = new com.sumsub.sns.internal.features.domain.mrtd.h
            r3 = r27
            r2.<init>(r3, r1)
            goto L18
        L22:
            java.lang.Object r1 = r10.f60814c
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r10.f60816e
            r11 = 1
            r12 = 0
            if (r4 == 0) goto L41
            if (r4 != r11) goto L39
            com.sumsub.sns.internal.features.data.model.common.C2 r0 = r10.f60813b
            com.sumsub.sns.internal.features.data.model.common.remote.v0 r2 = r10.f60812a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L113
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            kotlin.ResultKt.throwOnFailure(r1)
            com.sumsub.sns.internal.features.data.model.common.remote.v0 r9 = r0.f59321f
            if (r9 != 0) goto L49
            return r12
        L49:
            java.lang.String r1 = r0.f59316a
            if (r1 == 0) goto L13a
            java.lang.String r4 = r0.f59317b
            if (r4 == 0) goto L13a
            java.lang.String r4 = r0.f59320e
            if (r4 != 0) goto L57
            goto L13a
        L57:
            com.sumsub.sns.internal.log.c r13 = com.sumsub.sns.internal.log.C33272c.f67812a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "NfcSessionInfo: "
            r1.append(r4)
            r1.append(r9)
            java.lang.String r15 = r1.toString()
            r17 = 4
            r18 = 0
            java.lang.String r14 = "SumSubNfc"
            r16 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.d$default(r13, r14, r15, r16, r17, r18)
            java.lang.String r1 = r0.f59316a
            java.lang.String r4 = r0.f59317b
            java.lang.String r5 = r0.f59320e
            java.lang.String r6 = r9.f59706b
            if (r6 != 0) goto L8f
            r17 = 4
            r18 = 0
            java.lang.String r14 = "SumSubNfc"
            java.lang.String r15 = "MrtdSeed is null"
            r16 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.w$default(r13, r14, r15, r16, r17, r18)
            r14 = r12
            goto Lfa
        L8f:
            com.sumsub.sns.internal.features.data.model.common.C2 r14 = new com.sumsub.sns.internal.features.data.model.common.C2
            java.lang.Integer r7 = r9.f59713i
            if (r7 == 0) goto L9c
            int r7 = r7.intValue()
            r20 = r7
            goto L9e
        L9c:
            r20 = r11
        L9e:
            java.lang.Integer r7 = r9.f59714j
            if (r7 == 0) goto Lb3
            int r8 = r7.intValue()
            if (r8 <= 0) goto La9
            goto Laa
        La9:
            r7 = r12
        Laa:
            if (r7 == 0) goto Lb3
            int r7 = r7.intValue()
        Lb0:
            r21 = r7
            goto Lb7
        Lb3:
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto Lb0
        Lb7:
            java.lang.String r7 = r9.f59715k
            if (r7 == 0) goto Le1
            kotlin.enums.EnumEntries r8 = com.sumsub.sns.internal.features.data.model.common.MRTDInstructionType.getEntries()
            java.util.Iterator r8 = r8.iterator()
        Lc3:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto Ldb
            java.lang.Object r13 = r8.next()
            r15 = r13
            com.sumsub.sns.internal.features.data.model.common.MRTDInstructionType r15 = (com.sumsub.sns.internal.features.data.model.common.MRTDInstructionType) r15
            java.lang.String r15 = r15.getValue()
            boolean r15 = kotlin.text.StringsKt.equals(r15, r7, r11)
            if (r15 == 0) goto Lc3
            goto Ldc
        Ldb:
            r13 = r12
        Ldc:
            com.sumsub.sns.internal.features.data.model.common.MRTDInstructionType r13 = (com.sumsub.sns.internal.features.data.model.common.MRTDInstructionType) r13
            r22 = r13
            goto Le3
        Le1:
            r22 = r12
        Le3:
            java.lang.String r7 = r9.f59712h
            r24 = 0
            r23 = 0
            r15 = r29
            r19 = r30
            r16 = r1
            r17 = r4
            r18 = r5
            r25 = r6
            r26 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        Lfa:
            java.lang.String r5 = r0.f59316a
            java.lang.String r6 = r0.f59317b
            java.lang.String r7 = r0.f59320e
            r10.f60812a = r9
            r10.f60813b = r14
            r10.f60816e = r11
            r4 = r29
            r8 = r30
            java.lang.Object r1 = r3.m70156a(r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r2) goto L111
            return r2
        L111:
            r2 = r9
            r0 = r14
        L113:
            com.sumsub.sns.internal.features.data.model.common.E2 r1 = (com.sumsub.sns.internal.features.data.model.common.C28998E2) r1
            java.lang.String r3 = r2.f59705a
            java.lang.String r4 = "basic"
            boolean r3 = kotlin.text.StringsKt.equals(r3, r4, r11)
            r4 = 0
            if (r3 == 0) goto L128
            if (r0 == 0) goto L127
            com.sumsub.sns.internal.features.data.model.common.A2 r0 = r0.mo69716a(r1, r4)
            return r0
        L127:
            return r12
        L128:
            java.lang.String r2 = r2.f59705a
            java.lang.String r3 = "kinegram"
            boolean r2 = kotlin.text.StringsKt.equals(r2, r3, r11)
            if (r2 == 0) goto L139
            if (r1 == 0) goto L138
            com.sumsub.sns.internal.features.data.model.common.A2 r0 = r1.mo69716a(r0, r4)
        L138:
            return r0
        L139:
            return r12
        L13a:
            com.sumsub.sns.internal.log.c r2 = com.sumsub.sns.internal.log.C33272c.f67812a
            java.lang.String r3 = r0.f59317b
            java.lang.String r0 = r0.f59320e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "idDocType, country or imageId is null: idDocType="
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = ", country="
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = ", imageId="
            r4.append(r1)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
            r5 = 4
            r6 = 0
            r1 = r2
            java.lang.String r2 = "SumSubNfc"
            r4 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.e$default(r1, r2, r3, r4, r5, r6)
            return r12
    }
}
