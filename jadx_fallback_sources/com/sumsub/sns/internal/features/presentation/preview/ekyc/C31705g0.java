package com.sumsub.sns.internal.features.presentation.preview.ekyc;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.g0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31705g0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public java.util.List f64339a;

    /* JADX INFO: renamed from: b */
    public java.lang.Object f64340b;

    /* JADX INFO: renamed from: c */
    public java.lang.Object f64341c;

    /* JADX INFO: renamed from: d */
    public kotlin.jvm.internal.Ref.ObjectRef f64342d;

    /* JADX INFO: renamed from: e */
    public java.lang.Object f64343e;

    /* JADX INFO: renamed from: f */
    public java.lang.Object f64344f;

    /* JADX INFO: renamed from: g */
    public java.lang.Object f64345g;

    /* JADX INFO: renamed from: h */
    public com.sumsub.sns.internal.features.data.model.common.C28999F f64346h;

    /* JADX INFO: renamed from: i */
    public java.lang.String f64347i;

    /* JADX INFO: renamed from: j */
    public java.lang.String f64348j;

    /* JADX INFO: renamed from: k */
    public java.util.Collection f64349k;

    /* JADX INFO: renamed from: l */
    public int f64350l;

    /* JADX INFO: renamed from: m */
    public int f64351m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ java.lang.Object f64352n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0 f64353o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ java.lang.String f64354p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ java.util.List f64355q;

    public C31705g0(com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0 r1, java.lang.String r2, java.util.List r3, kotlin.coroutines.Continuation r4) {
            r0 = this;
            r0.f64353o = r1
            r0.f64354p = r2
            r0.f64355q = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
            r4 = this;
            com.sumsub.sns.internal.features.presentation.preview.ekyc.g0 r0 = new com.sumsub.sns.internal.features.presentation.preview.ekyc.g0
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r1 = r4.f64353o
            java.lang.String r2 = r4.f64354p
            java.util.List r3 = r4.f64355q
            r0.<init>(r1, r2, r3, r6)
            r0.f64352n = r5
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.sumsub.sns.internal.features.presentation.preview.ekyc.g0 r1 = (com.sumsub.sns.internal.features.presentation.preview.ekyc.C31705g0) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
            r32 = this;
            r0 = r32
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f64351m
            java.lang.String r4 = ""
            java.lang.String r6 = "source_id"
            java.lang.String r7 = "country"
            switch(r2) {
                case 0: goto L132;
                case 1: goto L11c;
                case 2: goto Lec;
                case 3: goto Lcf;
                case 4: goto L8d;
                case 5: goto L6a;
                case 6: goto L43;
                case 7: goto L1a;
                default: goto L12;
            }
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1a:
            java.lang.Object r1 = r0.f64345g
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r2 = r0.f64344f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r4 = r0.f64343e
            java.util.List r4 = (java.util.List) r4
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f64342d
            java.lang.Object r11 = r0.f64341c
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref.ObjectRef) r11
            java.lang.Object r12 = r0.f64340b
            com.sumsub.sns.internal.features.data.repository.dynamic.l r12 = (com.sumsub.sns.internal.features.data.repository.dynamic.C29983l) r12
            java.util.List r13 = r0.f64339a
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r14 = r0.f64352n
            com.sumsub.sns.internal.features.domain.appdata.b r14 = (com.sumsub.sns.internal.features.domain.appdata.C30095b) r14
            kotlin.ResultKt.throwOnFailure(r33)
            r5 = r33
            r20 = r7
            r16 = 0
            goto L515
        L43:
            java.lang.Object r2 = r0.f64344f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f64343e
            java.util.List r4 = (java.util.List) r4
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f64342d
            java.lang.Object r11 = r0.f64341c
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref.ObjectRef) r11
            java.lang.Object r12 = r0.f64340b
            com.sumsub.sns.internal.features.data.repository.dynamic.l r12 = (com.sumsub.sns.internal.features.data.repository.dynamic.C29983l) r12
            java.util.List r13 = r0.f64339a
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r14 = r0.f64352n
            com.sumsub.sns.internal.features.domain.appdata.b r14 = (com.sumsub.sns.internal.features.domain.appdata.C30095b) r14
            kotlin.ResultKt.throwOnFailure(r33)
            r20 = r7
            r3 = r13
            r16 = 0
            r13 = r2
            r2 = r33
            goto L4eb
        L6a:
            int r2 = r0.f64350l
            java.lang.Object r4 = r0.f64343e
            java.util.List r4 = (java.util.List) r4
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f64342d
            java.lang.Object r11 = r0.f64341c
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref.ObjectRef) r11
            java.lang.Object r12 = r0.f64340b
            com.sumsub.sns.internal.features.data.repository.dynamic.l r12 = (com.sumsub.sns.internal.features.data.repository.dynamic.C29983l) r12
            java.util.List r13 = r0.f64339a
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r14 = r0.f64352n
            com.sumsub.sns.internal.features.domain.appdata.b r14 = (com.sumsub.sns.internal.features.domain.appdata.C30095b) r14
            kotlin.ResultKt.throwOnFailure(r33)
            r3 = r33
            r20 = r7
            r16 = 0
            goto L496
        L8d:
            int r2 = r0.f64350l
            java.util.Collection r11 = r0.f64349k
            java.lang.String r12 = r0.f64348j
            java.lang.String r13 = r0.f64347i
            com.sumsub.sns.internal.features.data.model.common.F r14 = r0.f64346h
            java.lang.Object r15 = r0.f64345g
            java.util.Iterator r15 = (java.util.Iterator) r15
            r16 = 0
            java.lang.Object r8 = r0.f64344f
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r3 = r0.f64343e
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r3 = (com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0) r3
            kotlin.jvm.internal.Ref$ObjectRef r5 = r0.f64342d
            java.lang.Object r10 = r0.f64341c
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r9 = r0.f64340b
            com.sumsub.sns.internal.features.data.repository.dynamic.l r9 = (com.sumsub.sns.internal.features.data.repository.dynamic.C29983l) r9
            r19 = r2
            java.util.List r2 = r0.f64339a
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r20 = r2
            java.lang.Object r2 = r0.f64352n
            com.sumsub.sns.internal.features.domain.appdata.b r2 = (com.sumsub.sns.internal.features.domain.appdata.C30095b) r2
            kotlin.ResultKt.throwOnFailure(r33)
            r22 = r3
            r21 = r6
            r6 = r14
            r14 = r19
            r3 = r33
            r19 = r4
            r4 = r20
            r20 = r7
            goto L3c8
        Lcf:
            r16 = 0
            java.lang.Object r2 = r0.f64343e
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            kotlin.jvm.internal.Ref$ObjectRef r3 = r0.f64342d
            java.lang.Object r5 = r0.f64341c
            com.sumsub.sns.internal.features.data.repository.dynamic.l r5 = (com.sumsub.sns.internal.features.data.repository.dynamic.C29983l) r5
            java.lang.Object r8 = r0.f64340b
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.List r9 = r0.f64339a
            java.lang.Object r10 = r0.f64352n
            com.sumsub.sns.internal.features.domain.appdata.b r10 = (com.sumsub.sns.internal.features.domain.appdata.C30095b) r10
            kotlin.ResultKt.throwOnFailure(r33)
            r11 = r33
            goto L332
        Lec:
            r16 = 0
            int r2 = r0.f64350l
            java.lang.Object r3 = r0.f64345g
            com.sumsub.sns.internal.features.data.model.common.d2 r3 = (com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2) r3
            java.lang.Object r5 = r0.f64344f
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r8 = r0.f64343e
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            kotlin.jvm.internal.Ref$ObjectRef r9 = r0.f64342d
            java.lang.Object r10 = r0.f64341c
            com.sumsub.sns.internal.features.data.repository.dynamic.l r10 = (com.sumsub.sns.internal.features.data.repository.dynamic.C29983l) r10
            java.lang.Object r11 = r0.f64340b
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.util.List r12 = r0.f64339a
            java.lang.Object r13 = r0.f64352n
            com.sumsub.sns.internal.features.domain.appdata.b r13 = (com.sumsub.sns.internal.features.domain.appdata.C30095b) r13
            kotlin.ResultKt.throwOnFailure(r33)
            r14 = r9
            r9 = r3
            r3 = r8
            r8 = r2
            r2 = r33
        L115:
            r15 = r10
            r29 = r12
            r22 = r13
            goto L25b
        L11c:
            r16 = 0
            java.lang.Object r2 = r0.f64340b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.List r3 = r0.f64339a
            java.lang.Object r5 = r0.f64352n
            com.sumsub.sns.internal.features.domain.appdata.b r5 = (com.sumsub.sns.internal.features.domain.appdata.C30095b) r5
            kotlin.ResultKt.throwOnFailure(r33)
            r8 = r33
            r11 = r2
            r13 = r5
        L12f:
            r12 = r3
            goto L1fc
        L132:
            r16 = 0
            kotlin.ResultKt.throwOnFailure(r33)
            java.lang.Object r2 = r0.f64352n
            kotlinx.coroutines.m0 r2 = (kotlinx.coroutines.InterfaceC41709m0) r2
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r8 = r0.f64353o
            com.sumsub.sns.internal.features.domain.appdata.b r2 = r8.f64374t
            if (r2 != 0) goto L15a
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r1 = "resources is null"
            r9.<init>(r1)
            com.sumsub.sns.internal.features.data.model.common.Document r1 = r8.f64476a
            com.sumsub.sns.internal.features.data.model.common.X r1 = r1.getType()
            java.lang.String r10 = r1.f59014a
            r12 = 4
            r13 = 0
            r11 = 0
            com.sumsub.sns.core.presentation.base.AbstractC28052C.throwError$default(r8, r9, r10, r11, r12, r13)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L15a:
            com.sumsub.sns.internal.log.c r8 = com.sumsub.sns.internal.log.C33272c.f67812a
            java.lang.String r3 = r0.f64354p
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "Update source, sourceId="
            r5.append(r9)
            r5.append(r3)
            java.lang.String r10 = r5.toString()
            r12 = 4
            r13 = 0
            java.lang.String r9 = "EKyc"
            r11 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.i$default(r8, r9, r10, r11, r12, r13)
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r3 = r0.f64353o
            java.lang.String r3 = r3.m70823f()
            if (r3 == 0) goto L1a7
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r5 = r0.f64353o
            com.sumsub.sns.internal.features.domain.ekyc.b r9 = r5.f64366l
            com.sumsub.sns.internal.features.domain.appdata.b r10 = r5.f64374t
            if (r10 == 0) goto L18e
            com.sumsub.sns.internal.features.data.model.common.h r10 = r10.f60491b
            if (r10 == 0) goto L18e
            java.util.Map r10 = r10.f59078k
            goto L18f
        L18e:
            r10 = 0
        L18f:
            com.sumsub.sns.internal.features.data.model.common.Document r5 = r5.f64476a
            com.sumsub.sns.internal.features.data.model.common.X r5 = r5.getType()
            java.lang.String r5 = r5.f59014a
            r9.getClass()
            java.util.Map r5 = com.sumsub.sns.internal.features.domain.ekyc.C30159b.m70123a(r5, r10)
            if (r5 == 0) goto L1a7
            java.lang.Object r3 = r5.get(r3)
            java.util.List r3 = (java.util.List) r3
            goto L1a8
        L1a7:
            r3 = 0
        L1a8:
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r5 = r0.f64353o
            java.lang.String r5 = r5.m70823f()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Update source, country="
            r9.append(r10)
            r9.append(r5)
            java.lang.String r5 = ", sources="
            r9.append(r5)
            r9.append(r3)
            java.lang.String r10 = r9.toString()
            r12 = 4
            r13 = 0
            java.lang.String r9 = "EKyc"
            r11 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.i$default(r8, r9, r10, r11, r12, r13)
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r5 = r0.f64353o
            java.lang.String r8 = r0.f64354p
            com.sumsub.sns.internal.core.presentation.screen.base.t r5 = r5.f64375u
            kotlin.reflect.KProperty[] r9 = com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0.f64357D
            r9 = r9[r16]
            androidx.lifecycle.SavedStateHandle r9 = r5.f58834a
            java.lang.String r5 = r5.f58835b
            r9.set(r5, r8)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r8 = r0.f64353o
            r0.f64352n = r2
            r0.f64339a = r3
            r0.f64340b = r5
            r9 = 1
            r0.f64351m = r9
            java.lang.Object r8 = r8.getStrings(r0)
            if (r8 != r1) goto L1f8
            goto L512
        L1f8:
            r13 = r2
            r11 = r5
            goto L12f
        L1fc:
            r10 = r8
            com.sumsub.sns.internal.features.data.repository.dynamic.l r10 = (com.sumsub.sns.internal.features.data.repository.dynamic.C29983l) r10
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r9.element = r2
            java.lang.String r3 = r0.f64354p
            if (r3 == 0) goto L214
            r2.put(r6, r3)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L214:
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r2 = r0.f64353o
            kotlin.reflect.KProperty[] r3 = com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0.f64357D
            java.lang.String r2 = r2.m70823f()
            if (r2 == 0) goto L227
            T r3 = r9.element
            java.util.Map r3 = (java.util.Map) r3
            r3.put(r7, r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L227:
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r2 = r0.f64353o
            com.sumsub.sns.internal.features.presentation.preview.ekyc.t r3 = r2.f64362h
            if (r3 != 0) goto L2eb
            com.sumsub.sns.internal.features.data.model.common.U0 r3 = com.sumsub.sns.internal.features.data.model.common.C29059U0.f59007b
            r0.f64352n = r13
            r0.f64339a = r12
            r0.f64340b = r11
            r0.f64341c = r10
            r0.f64342d = r9
            r0.f64343e = r5
            r0.f64344f = r5
            r0.f64345g = r3
            r8 = 1
            r0.f64350l = r8
            r8 = 2
            r0.f64351m = r8
            java.lang.String r8 = "sns_ekyc_country_placeholder"
            java.lang.Object r2 = r2.getString(r8, r0)
            if (r2 != r1) goto L255
            goto L512
        L255:
            r14 = r9
            r8 = 1
            r9 = r3
            r3 = r5
            goto L115
        L25b:
            java.lang.String r2 = (java.lang.String) r2
            r10 = r8
            com.sumsub.sns.internal.features.data.model.common.y r8 = new com.sumsub.sns.internal.features.data.model.common.y
            if (r10 == 0) goto L264
            r10 = 1
            goto L266
        L264:
            r10 = r16
        L266:
            r12 = 0
            r13 = 444(0x1bc, float:6.22E-43)
            r31 = r11
            r11 = r2
            r2 = r31
            r8.<init>(r9, r10, r11, r12, r13)
            r5.element = r8
            T r5 = r3.element
            r19 = r5
            com.sumsub.sns.internal.features.data.model.common.y r19 = (com.sumsub.sns.internal.features.data.model.common.C29719y) r19
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r5 = r0.f64353o
            kotlin.reflect.KProperty[] r8 = com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0.f64357D
            java.lang.String r20 = r5.m70823f()
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r5 = r0.f64353o
            com.sumsub.sns.internal.features.data.model.common.h r21 = r5.getConfig()
            java.lang.String r5 = r0.f64354p
            if (r5 == 0) goto L298
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r8 = r0.f64353o
            java.lang.String r9 = r8.m70823f()
            kotlin.jvm.functions.Function2 r5 = r8.m70810a(r15, r9, r5)
            r24 = r5
            goto L29a
        L298:
            r24 = 0
        L29a:
            java.util.List r5 = r0.f64355q
            com.sumsub.sns.internal.features.data.model.common.U0 r8 = com.sumsub.sns.internal.features.data.model.common.C29059U0.f59007b
            java.util.Iterator r5 = r5.iterator()
        L2a2:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L2c0
            java.lang.Object r9 = r5.next()
            r10 = r9
            com.sumsub.sns.internal.features.domain.appdata.a r10 = (com.sumsub.sns.internal.features.domain.appdata.C30094a) r10
            com.sumsub.sns.internal.features.data.model.common.D r10 = r10.f60488a
            boolean r11 = r10 instanceof com.sumsub.sns.internal.features.data.model.common.C29719y
            if (r11 == 0) goto L2a2
            com.sumsub.sns.internal.features.data.model.common.y r10 = (com.sumsub.sns.internal.features.data.model.common.C29719y) r10
            com.sumsub.sns.internal.features.data.model.common.d2 r10 = r10.f59781b
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r8)
            if (r10 == 0) goto L2a2
            goto L2c1
        L2c0:
            r9 = 0
        L2c1:
            com.sumsub.sns.internal.features.domain.appdata.a r9 = (com.sumsub.sns.internal.features.domain.appdata.C30094a) r9
            if (r9 == 0) goto L2ca
            java.lang.CharSequence r5 = r9.f60489b
            r25 = r5
            goto L2cc
        L2ca:
            r25 = 0
        L2cc:
            T r5 = r14.element
            r26 = r5
            java.util.Map r26 = (java.util.Map) r26
            java.util.Map r27 = kotlin.collections.MapsKt.emptyMap()
            r28 = 192(0xc0, float:2.69E-43)
            r23 = r15
            com.sumsub.sns.internal.core.presentation.form.model.e0 r5 = com.sumsub.sns.internal.features.presentation.utils.AbstractC32651f.m71268a(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r2.add(r5)
            r8 = r2
            r2 = r3
            r3 = r14
            r10 = r22
            r5 = r23
            r9 = r29
            goto L2f1
        L2eb:
            r2 = r5
            r3 = r9
            r5 = r10
            r8 = r11
            r9 = r12
            r10 = r13
        L2f1:
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r11 = r0.f64353o
            com.sumsub.sns.internal.features.presentation.preview.ekyc.t r11 = r11.f64362h
            if (r11 != 0) goto L425
            if (r9 == 0) goto L425
            int r11 = r9.size()
            r12 = 1
            if (r11 <= r12) goto L425
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r11 = r0.f64353o
            kotlin.jvm.internal.StringCompanionObject r13 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.String r13 = "source"
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r12)
            java.lang.String r12 = "sns_ekyc_%s_title"
            java.lang.String r12 = java.lang.String.format(r12, r13)
            r0.f64352n = r10
            r0.f64339a = r9
            r0.f64340b = r8
            r0.f64341c = r5
            r0.f64342d = r3
            r0.f64343e = r2
            r13 = 0
            r0.f64344f = r13
            r0.f64345g = r13
            r13 = 3
            r0.f64351m = r13
            java.lang.Object r11 = r11.getString(r12, r0)
            if (r11 != r1) goto L332
            goto L512
        L332:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r0.f64354p
            java.util.Iterator r13 = r9.iterator()
            r14 = r16
        L33c:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L356
            java.lang.Object r15 = r13.next()
            com.sumsub.sns.internal.features.data.model.common.F r15 = (com.sumsub.sns.internal.features.data.model.common.C28999F) r15
            java.lang.String r15 = r15.f58940a
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r12)
            if (r15 == 0) goto L351
            goto L357
        L351:
            r18 = 1
            int r14 = r14 + 1
            goto L33c
        L356:
            r14 = -1
        L357:
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r12 = r0.f64353o
            java.util.ArrayList r13 = new java.util.ArrayList
            r33 = r2
            r15 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r15)
            r13.<init>(r2)
            java.util.Iterator r2 = r9.iterator()
            r15 = r2
            r9 = r5
            r2 = r8
            r5 = r33
            r8 = r3
            r3 = r12
            r12 = r11
            r11 = r13
        L373:
            boolean r13 = r15.hasNext()
            if (r13 == 0) goto L408
            java.lang.Object r13 = r15.next()
            com.sumsub.sns.internal.features.data.model.common.F r13 = (com.sumsub.sns.internal.features.data.model.common.C28999F) r13
            r19 = r4
            java.lang.String r4 = r13.f58940a
            if (r4 != 0) goto L38a
            r20 = r7
            r7 = r19
            goto L38d
        L38a:
            r20 = r7
            r7 = r4
        L38d:
            if (r4 == 0) goto L3df
            r21 = r6
            com.sumsub.sns.internal.features.domain.ekyc.d r6 = r3.f64365k
            r0.f64352n = r10
            r0.f64339a = r2
            r0.f64340b = r9
            r0.f64341c = r8
            r0.f64342d = r5
            r0.f64343e = r3
            r0.f64344f = r11
            r0.f64345g = r15
            r0.f64346h = r13
            r0.f64347i = r7
            r0.f64348j = r12
            r0.f64349k = r11
            r0.f64350l = r14
            r22 = r3
            r3 = 4
            r0.f64351m = r3
            java.lang.String r3 = "name"
            r23 = r5
            r5 = 0
            java.lang.Object r3 = r6.m70124a(r3, r4, r5, r0)
            if (r3 != r1) goto L3c0
            goto L512
        L3c0:
            r4 = r2
            r2 = r10
            r6 = r13
            r5 = r23
            r13 = r7
            r10 = r8
            r8 = r11
        L3c8:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L3d7
            r3 = r10
            r10 = r2
            r2 = r4
            r4 = r11
            r11 = r8
            r8 = r3
            r7 = r13
            r13 = r6
            r3 = r22
            goto L3e6
        L3d7:
            r31 = r10
            r10 = r2
            r2 = r4
            r4 = r8
            r8 = r31
            goto L3f5
        L3df:
            r22 = r3
            r23 = r5
            r21 = r6
            r4 = r11
        L3e6:
            java.lang.String r6 = r13.f58940a
            r13 = r11
            r11 = r4
            r4 = r13
            r22 = r3
            if (r6 != 0) goto L3f3
            r13 = r7
            r3 = r19
            goto L3f5
        L3f3:
            r3 = r6
            r13 = r7
        L3f5:
            com.sumsub.sns.internal.features.data.model.common.z r6 = new com.sumsub.sns.internal.features.data.model.common.z
            r6.<init>(r13, r3)
            r11.add(r6)
            r11 = r4
            r4 = r19
            r7 = r20
            r6 = r21
            r3 = r22
            goto L373
        L408:
            r23 = r5
            r21 = r6
            r20 = r7
            java.util.List r11 = (java.util.List) r11
            com.sumsub.sns.internal.features.data.model.common.A r3 = new com.sumsub.sns.internal.features.data.model.common.A
            r3.<init>(r14, r12, r11)
            r4 = r21
            com.sumsub.sns.internal.core.presentation.form.model.e0 r3 = com.sumsub.sns.internal.features.presentation.utils.AbstractC32655h.m71277a(r3, r4)
            r2.add(r3)
            r13 = r2
            r11 = r8
            r12 = r9
            r6 = r23
        L423:
            r14 = r10
            goto L42c
        L425:
            r20 = r7
            r6 = r2
            r11 = r3
            r12 = r5
            r13 = r8
            goto L423
        L42c:
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r2 = r0.f64353o
            kotlin.reflect.KProperty[] r3 = com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0.f64357D
            com.sumsub.sns.internal.features.data.model.common.F r2 = r2.m70824g()
            if (r2 == 0) goto L43a
            java.util.List r3 = r2.f58943d
            r4 = r3
            goto L43b
        L43a:
            r4 = 0
        L43b:
            if (r2 == 0) goto L440
            com.sumsub.sns.internal.features.data.model.common.remote.response.ConfirmationType r2 = r2.f58942c
            goto L441
        L440:
            r2 = 0
        L441:
            com.sumsub.sns.internal.features.data.model.common.remote.response.ConfirmationType r3 = com.sumsub.sns.internal.features.data.model.common.remote.response.ConfirmationType.OAUTH
            if (r2 != r3) goto L464
            com.sumsub.sns.internal.ff.core.a r2 = com.sumsub.sns.internal.p125ff.C33048a.f67459V
            boolean r2 = r2.m71434a()
            if (r2 != 0) goto L464
            com.sumsub.sns.internal.features.data.model.common.h r2 = r14.f60491b
            if (r2 == 0) goto L45e
            java.lang.Boolean r2 = r2.f59079l
            r18 = 1
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r18)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            goto L460
        L45e:
            r2 = r16
        L460:
            if (r2 != 0) goto L464
            r2 = 1
            goto L466
        L464:
            r2 = r16
        L466:
            java.lang.String r3 = r0.f64354p
            if (r3 == 0) goto L4a6
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r5 = r0.f64353o
            com.sumsub.sns.internal.features.domain.ekyc.d r5 = r5.f64365k
            r0.f64352n = r14
            r0.f64339a = r13
            r0.f64340b = r12
            r0.f64341c = r11
            r0.f64342d = r6
            r0.f64343e = r4
            r7 = 0
            r0.f64344f = r7
            r0.f64345g = r7
            r0.f64346h = r7
            r0.f64347i = r7
            r0.f64348j = r7
            r0.f64349k = r7
            r0.f64350l = r2
            r8 = 5
            r0.f64351m = r8
            java.lang.String r8 = "instructions"
            java.lang.Object r3 = r5.m70124a(r8, r3, r7, r0)
            if (r3 != r1) goto L496
            goto L512
        L496:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L4a6
            boolean r5 = kotlin.text.StringsKt.isBlank(r3)
            if (r5 != 0) goto L4a6
            r31 = r13
            r13 = r3
            r3 = r31
            goto L4a8
        L4a6:
            r3 = r13
            r13 = 0
        L4a8:
            if (r2 != 0) goto L4b9
            if (r13 == 0) goto L4b9
            com.sumsub.sns.internal.features.data.model.common.B r5 = new com.sumsub.sns.internal.features.data.model.common.B
            r5.<init>(r13)
            r7 = 0
            com.sumsub.sns.internal.core.presentation.form.model.e0 r5 = com.sumsub.sns.internal.features.presentation.utils.AbstractC32655h.m71277a(r5, r7)
            r3.add(r5)
        L4b9:
            if (r2 == 0) goto L522
            java.lang.String r2 = r0.f64354p
            if (r2 == 0) goto L522
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r5 = r0.f64353o
            com.sumsub.sns.internal.features.domain.ekyc.d r5 = r5.f64365k
            r0.f64352n = r14
            r0.f64339a = r3
            r0.f64340b = r12
            r0.f64341c = r11
            r0.f64342d = r6
            r0.f64343e = r4
            r0.f64344f = r13
            r7 = 0
            r0.f64345g = r7
            r0.f64346h = r7
            r0.f64347i = r7
            r0.f64348j = r7
            r0.f64349k = r7
            r7 = 6
            r0.f64351m = r7
            java.lang.String r7 = "instructionsTitle"
            java.lang.String r8 = "sns_ekyc_instructions_oauth_title"
            java.lang.Object r2 = r5.m70124a(r7, r2, r8, r0)
            if (r2 != r1) goto L4eb
            goto L512
        L4eb:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r5 = r0.f64353o
            com.sumsub.sns.internal.features.domain.ekyc.d r5 = r5.f64365k
            java.lang.String r7 = r0.f64354p
            r0.f64352n = r14
            r0.f64339a = r3
            r0.f64340b = r12
            r0.f64341c = r11
            r0.f64342d = r6
            r0.f64343e = r4
            r0.f64344f = r2
            r0.f64345g = r13
            r8 = 7
            r0.f64351m = r8
            java.lang.String r8 = "submitData"
            java.lang.String r9 = "sns_ekyc_action_continue"
            java.lang.Object r5 = r5.m70124a(r8, r7, r9, r0)
            if (r5 != r1) goto L513
        L512:
            return r1
        L513:
            r1 = r13
            r13 = r3
        L515:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            com.sumsub.sns.internal.features.presentation.preview.ekyc.b r3 = new com.sumsub.sns.internal.features.presentation.preview.ekyc.b
            r3.<init>(r2, r1, r5)
            r31 = r13
            r13 = r3
            r3 = r31
            goto L523
        L522:
            r13 = 0
        L523:
            if (r4 != 0) goto L52a
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            goto L52b
        L52a:
            r1 = r4
        L52b:
            T r2 = r6.element
            if (r2 == 0) goto L537
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            java.util.List r1 = kotlin.collections.CollectionsKt.plus(r2, r1)
        L537:
            T r2 = r11.element
            java.util.Map r2 = (java.util.Map) r2
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r5 = r0.f64353o
            kotlin.reflect.KProperty[] r6 = com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0.f64357D
            java.lang.String r5 = r5.m70823f()
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r6.putAll(r2)
            com.sumsub.sns.internal.features.data.model.common.p r2 = r14.f60490a
            java.util.Map r7 = r14.f60493d
            r8 = r20
            java.lang.Object r9 = r6.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L566
            boolean r10 = r7.containsKey(r9)
            if (r10 == 0) goto L560
            goto L561
        L560:
            r9 = 0
        L561:
            if (r9 != 0) goto L564
            goto L566
        L564:
            r5 = r9
            goto L570
        L566:
            if (r5 == 0) goto L56f
            boolean r7 = r7.containsKey(r5)
            if (r7 == 0) goto L56f
            goto L570
        L56f:
            r5 = 0
        L570:
            r6.put(r8, r5)
            java.lang.String r7 = "msdk_local_tin_validation_country"
            r6.put(r7, r5)
            com.sumsub.sns.internal.features.data.model.common.K1 r5 = com.sumsub.sns.internal.features.data.model.common.C29021K1.f58964b
            boolean r5 = com.sumsub.sns.internal.features.presentation.utils.AbstractC32651f.m71275a(r1, r5)
            if (r5 == 0) goto L5a0
            com.sumsub.sns.internal.features.data.model.common.W0 r5 = com.sumsub.sns.internal.features.data.model.common.C29067W0.f59009b
            boolean r1 = com.sumsub.sns.internal.features.presentation.utils.AbstractC32651f.m71275a(r1, r5)
            if (r1 != 0) goto L5a0
            java.lang.String r1 = "countryOfBirth"
            java.lang.Object r7 = r6.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L59c
            if (r2 == 0) goto L59a
            java.lang.String r2 = com.sumsub.sns.internal.features.presentation.utils.AbstractC32659j.m71281a(r2, r5)
            goto L59d
        L59a:
            r2 = 0
            goto L59d
        L59c:
            r2 = r7
        L59d:
            r6.put(r1, r2)
        L5a0:
            java.util.LinkedHashMap r1 = com.sumsub.sns.internal.core.common.AbstractC28458h.m69336a(r6)
            java.util.Map r1 = kotlin.collections.MapsKt.toMutableMap(r1)
            r11.element = r1
            if (r4 == 0) goto L675
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r1 = r0.f64353o
            java.util.List r2 = r0.f64355q
            java.util.ArrayList r5 = new java.util.ArrayList
            r15 = 10
            int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r15)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L5bf:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L66e
            java.lang.Object r6 = r4.next()
            com.sumsub.sns.internal.features.data.model.common.y r6 = (com.sumsub.sns.internal.features.data.model.common.C29719y) r6
            com.sumsub.sns.internal.features.data.model.common.d2 r7 = r6.f59781b
            if (r7 == 0) goto L5fb
            java.util.Iterator r8 = r2.iterator()
        L5d3:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L5f1
            java.lang.Object r9 = r8.next()
            r10 = r9
            com.sumsub.sns.internal.features.domain.appdata.a r10 = (com.sumsub.sns.internal.features.domain.appdata.C30094a) r10
            com.sumsub.sns.internal.features.data.model.common.D r10 = r10.f60488a
            boolean r15 = r10 instanceof com.sumsub.sns.internal.features.data.model.common.C29719y
            if (r15 == 0) goto L5d3
            com.sumsub.sns.internal.features.data.model.common.y r10 = (com.sumsub.sns.internal.features.data.model.common.C29719y) r10
            com.sumsub.sns.internal.features.data.model.common.d2 r10 = r10.f59781b
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r7)
            if (r10 == 0) goto L5d3
            goto L5f2
        L5f1:
            r9 = 0
        L5f2:
            com.sumsub.sns.internal.features.domain.appdata.a r9 = (com.sumsub.sns.internal.features.domain.appdata.C30094a) r9
            if (r9 == 0) goto L5fb
            java.lang.CharSequence r7 = r9.f60489b
            r27 = r7
            goto L5fd
        L5fb:
            r27 = 0
        L5fd:
            java.util.Map r7 = r1.m70825h()
            com.sumsub.sns.internal.features.data.model.common.d2 r8 = r6.f59781b
            if (r8 == 0) goto L60a
            java.lang.String r8 = r8.mo69715b()
            goto L60b
        L60a:
            r8 = 0
        L60b:
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L61f
            com.sumsub.sns.internal.features.data.model.common.p r7 = r1.f64368n
            if (r7 == 0) goto L61e
            com.sumsub.sns.internal.features.data.model.common.d2 r8 = r6.f59781b
            java.lang.String r7 = com.sumsub.sns.internal.features.presentation.utils.AbstractC32659j.m71281a(r7, r8)
            goto L61f
        L61e:
            r7 = 0
        L61f:
            com.sumsub.sns.internal.features.data.model.common.d2 r8 = r6.f59781b
            if (r8 == 0) goto L630
            if (r7 == 0) goto L630
            T r9 = r11.element
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r8 = r8.mo69715b()
            r9.put(r8, r7)
        L630:
            java.lang.String r22 = r1.m70823f()
            com.sumsub.sns.internal.features.data.model.common.h r23 = r1.getConfig()
            com.sumsub.sns.internal.core.presentation.screen.base.t r7 = r1.f64375u
            kotlin.reflect.KProperty[] r8 = com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0.f64357D
            r8 = r8[r16]
            java.lang.Object r7 = r7.m69705a()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L651
            java.lang.String r8 = r1.m70823f()
            kotlin.jvm.functions.Function2 r7 = r1.m70810a(r12, r8, r7)
            r26 = r7
            goto L653
        L651:
            r26 = 0
        L653:
            T r7 = r11.element
            r28 = r7
            java.util.Map r28 = (java.util.Map) r28
            java.util.Map r29 = kotlin.collections.MapsKt.emptyMap()
            r30 = 192(0xc0, float:2.69E-43)
            r21 = r6
            r25 = r12
            r24 = r14
            com.sumsub.sns.internal.core.presentation.form.model.e0 r6 = com.sumsub.sns.internal.features.presentation.utils.AbstractC32651f.m71268a(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5.add(r6)
            goto L5bf
        L66e:
            boolean r1 = r3.addAll(r5)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
        L675:
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r1 = r0.f64353o
            T r2 = r11.element
            java.util.Map r2 = (java.util.Map) r2
            com.sumsub.sns.internal.core.presentation.screen.base.t r1 = r1.f64360C
            kotlin.reflect.KProperty[] r4 = com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0.f64357D
            r17 = 6
            r4 = r4[r17]
            androidx.lifecycle.SavedStateHandle r4 = r1.f58834a
            java.lang.String r1 = r1.f58835b
            r4.set(r1, r2)
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r1 = r0.f64353o
            com.sumsub.sns.internal.features.presentation.preview.ekyc.f0 r21 = new com.sumsub.sns.internal.features.presentation.preview.ekyc.f0
            java.lang.String r2 = r0.f64354p
            r26 = 0
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r13
            r21.<init>(r22, r23, r24, r25, r26)
            r1 = r16
            r3 = r21
            r2 = r22
            r7 = 0
            r8 = 1
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r2, r1, r3, r8, r7)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
