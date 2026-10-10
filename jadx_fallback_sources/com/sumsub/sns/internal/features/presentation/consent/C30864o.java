package com.sumsub.sns.internal.features.presentation.consent;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30864o extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public java.lang.Object f62333a;

    /* JADX INFO: renamed from: b */
    public java.lang.Object f62334b;

    /* JADX INFO: renamed from: c */
    public java.util.Iterator f62335c;

    /* JADX INFO: renamed from: d */
    public com.sumsub.sns.internal.features.data.model.common.remote.C29380i f62336d;

    /* JADX INFO: renamed from: e */
    public java.lang.String f62337e;

    /* JADX INFO: renamed from: f */
    public int f62338f;

    /* JADX INFO: renamed from: g */
    public int f62339g;

    /* JADX INFO: renamed from: h */
    public int f62340h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ java.lang.Object f62341i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ com.sumsub.sns.internal.features.presentation.consent.C30870u f62342j;

    public C30864o(com.sumsub.sns.internal.features.presentation.consent.C30870u r1, kotlin.coroutines.Continuation r2) {
            r0 = this;
            r0.f62342j = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r3, kotlin.coroutines.Continuation r4) {
            r2 = this;
            com.sumsub.sns.internal.features.presentation.consent.o r0 = new com.sumsub.sns.internal.features.presentation.consent.o
            com.sumsub.sns.internal.features.presentation.consent.u r1 = r2.f62342j
            r0.<init>(r1, r4)
            r0.f62341i = r3
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            kotlinx.coroutines.flow.f r3 = (kotlinx.coroutines.flow.InterfaceC41635f) r3
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            com.sumsub.sns.internal.features.presentation.consent.o r0 = new com.sumsub.sns.internal.features.presentation.consent.o
            com.sumsub.sns.internal.features.presentation.consent.u r1 = r2.f62342j
            r0.<init>(r1, r4)
            r0.f62341i = r3
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = r0.invokeSuspend(r3)
            return r3
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            r26 = this;
            r0 = r26
            r1 = 1
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.f62340h
            java.lang.String r4 = ""
            r5 = 4
            r6 = 3
            r7 = 2
            r9 = 0
            if (r3 == 0) goto L69
            if (r3 == r1) goto L5d
            if (r3 == r7) goto L3e
            if (r3 == r6) goto L26
            if (r3 != r5) goto L1e
            kotlin.ResultKt.throwOnFailure(r27)
            goto L19f
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L26:
            java.lang.Object r3 = r0.f62334b
            com.sumsub.sns.core.presentation.base.C r3 = (com.sumsub.sns.core.presentation.base.AbstractC28052C) r3
            java.lang.Object r4 = r0.f62333a
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r6 = r0.f62341i
            kotlinx.coroutines.flow.f r6 = (kotlinx.coroutines.flow.InterfaceC41635f) r6
            kotlin.ResultKt.throwOnFailure(r27)
            r18 = r3
            r3 = r6
            r16 = 0
            r6 = r27
            goto L15f
        L3e:
            int r3 = r0.f62339g
            int r10 = r0.f62338f
            java.lang.String r11 = r0.f62337e
            com.sumsub.sns.internal.features.data.model.common.remote.i r12 = r0.f62336d
            java.util.Iterator r13 = r0.f62335c
            java.lang.Object r14 = r0.f62334b
            java.util.Collection r14 = (java.util.Collection) r14
            java.lang.Object r15 = r0.f62333a
            com.sumsub.sns.internal.features.presentation.consent.u r15 = (com.sumsub.sns.internal.features.presentation.consent.C30870u) r15
            r16 = 0
            java.lang.Object r8 = r0.f62341i
            kotlinx.coroutines.flow.f r8 = (kotlinx.coroutines.flow.InterfaceC41635f) r8
            kotlin.ResultKt.throwOnFailure(r27)
            r7 = r27
            goto Le0
        L5d:
            r16 = 0
            java.lang.Object r3 = r0.f62341i
            kotlinx.coroutines.flow.f r3 = (kotlinx.coroutines.flow.InterfaceC41635f) r3
            kotlin.ResultKt.throwOnFailure(r27)
            r8 = r27
            goto L80
        L69:
            r16 = 0
            kotlin.ResultKt.throwOnFailure(r27)
            java.lang.Object r3 = r0.f62341i
            kotlinx.coroutines.flow.f r3 = (kotlinx.coroutines.flow.InterfaceC41635f) r3
            com.sumsub.sns.internal.features.presentation.consent.u r8 = r0.f62342j
            r0.f62341i = r3
            r0.f62340h = r1
            java.lang.Object r8 = r8.getStrings(r0)
            if (r8 != r2) goto L80
            goto L19e
        L80:
            com.sumsub.sns.internal.features.data.repository.dynamic.l r8 = (com.sumsub.sns.internal.features.data.repository.dynamic.C29983l) r8
            java.util.List r8 = r8.f60249b
            if (r8 == 0) goto L116
            com.sumsub.sns.internal.features.presentation.consent.u r10 = r0.f62342j
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r8 = r8.iterator()
            r13 = r8
            r15 = r10
            r14 = r11
            r8 = r3
            r3 = r16
        L97:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L10e
            java.lang.Object r10 = r13.next()
            int r11 = r3 + 1
            if (r3 >= 0) goto La8
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        La8:
            r12 = r10
            com.sumsub.sns.internal.features.data.model.common.remote.i r12 = (com.sumsub.sns.internal.features.data.model.common.remote.C29380i) r12
            com.sumsub.sns.internal.features.presentation.utils.a r10 = com.sumsub.sns.internal.features.presentation.utils.C32649e.f66642b
            boolean r10 = com.sumsub.sns.internal.features.presentation.utils.C32641a.m71262a(r12)
            if (r10 == 0) goto Lb6
            r12 = r9
            r3 = r11
            goto L106
        Lb6:
            com.sumsub.sns.internal.features.data.model.common.remote.f r10 = r12.f59389a
            if (r10 == 0) goto Lbe
            java.lang.String r10 = r10.f59373a
            if (r10 != 0) goto Lbf
        Lbe:
            r10 = r4
        Lbf:
            r0.f62341i = r8
            r0.f62333a = r15
            r0.f62334b = r14
            r0.f62335c = r13
            r0.f62336d = r12
            r0.f62337e = r10
            r0.f62338f = r11
            r0.f62339g = r3
            r0.f62340h = r7
            kotlin.reflect.KProperty[] r17 = com.sumsub.sns.internal.features.presentation.consent.C30870u.f62359h
            java.lang.Object r7 = r15.getData(r0)
            if (r7 != r2) goto Ldb
            goto L19e
        Ldb:
            r25 = r11
            r11 = r10
            r10 = r25
        Le0:
            com.sumsub.sns.core.presentation.base.O r7 = (com.sumsub.sns.core.presentation.base.C28075O) r7
            if (r7 == 0) goto Lf7
            com.sumsub.sns.internal.features.data.model.common.h r7 = r7.f57270b
            if (r7 == 0) goto Lf7
            com.sumsub.sns.internal.features.data.model.common.remote.c r12 = r12.f59390b
            if (r12 == 0) goto Lef
            java.lang.String r12 = r12.f59348f
            goto Lf0
        Lef:
            r12 = r9
        Lf0:
            java.util.Map r7 = r7.f59071d
            java.lang.String r7 = com.sumsub.sns.internal.features.data.model.common.AbstractC29130i.m69770a(r12, r7)
            goto Lf8
        Lf7:
            r7 = r9
        Lf8:
            if (r7 != 0) goto Lfb
            r7 = r4
        Lfb:
            com.sumsub.sns.internal.features.presentation.consent.h r12 = new com.sumsub.sns.internal.features.presentation.consent.h
            com.sumsub.sns.internal.features.presentation.country.b r5 = new com.sumsub.sns.internal.features.presentation.country.b
            r5.<init>(r11, r7)
            r12.<init>(r3, r5)
            r3 = r10
        L106:
            if (r12 == 0) goto L10b
            r14.add(r12)
        L10b:
            r5 = 4
            r7 = 2
            goto L97
        L10e:
            java.util.List r14 = (java.util.List) r14
            r3 = r8
            if (r14 != 0) goto L114
            goto L116
        L114:
            r4 = r14
            goto L11b
        L116:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L11b:
            int r5 = r4.size()
            if (r5 != r1) goto L13e
            com.sumsub.sns.internal.features.presentation.consent.u r5 = r0.f62342j
            java.lang.Object r7 = kotlin.collections.CollectionsKt.first(r4)
            com.sumsub.sns.internal.features.presentation.consent.h r7 = (com.sumsub.sns.internal.features.presentation.consent.C30857h) r7
            int r7 = r7.f62320a
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            kotlin.reflect.KProperty[] r8 = com.sumsub.sns.internal.features.presentation.consent.C30870u.f62359h
            com.sumsub.sns.internal.core.presentation.screen.base.t r5 = r5.f62364e
            kotlin.reflect.KProperty[] r8 = com.sumsub.sns.internal.features.presentation.consent.C30870u.f62359h
            r8 = r8[r16]
            androidx.lifecycle.SavedStateHandle r8 = r5.f58834a
            java.lang.String r5 = r5.f58835b
            r8.set(r5, r7)
        L13e:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L189
            com.sumsub.sns.internal.features.presentation.consent.u r5 = r0.f62342j
            r0.f62341i = r3
            r0.f62333a = r4
            r0.f62334b = r5
            r0.f62335c = r9
            r0.f62336d = r9
            r0.f62337e = r9
            r0.f62340h = r6
            kotlin.reflect.KProperty[] r6 = com.sumsub.sns.internal.features.presentation.consent.C30870u.f62359h
            java.lang.Object r6 = r5.getData(r0)
            if (r6 != r2) goto L15d
            goto L19e
        L15d:
            r18 = r5
        L15f:
            com.sumsub.sns.core.presentation.base.O r6 = (com.sumsub.sns.core.presentation.base.C28075O) r6
            if (r6 == 0) goto L16a
            com.sumsub.sns.internal.features.data.model.common.h r5 = r6.f57270b
            if (r5 == 0) goto L16a
            com.sumsub.sns.core.data.model.FlowType r5 = r5.f59069b
            goto L16b
        L16a:
            r5 = r9
        L16b:
            com.sumsub.sns.core.data.model.FlowType r6 = com.sumsub.sns.core.data.model.FlowType.Standalone
            if (r5 == r6) goto L171
            r8 = r1
            goto L173
        L171:
            r8 = r16
        L173:
            com.sumsub.sns.internal.core.common.t r5 = new com.sumsub.sns.internal.core.common.t
            r5.<init>(r8)
            java.lang.Boolean r20 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            r23 = 12
            r24 = 0
            r21 = 0
            r22 = 0
            r19 = r5
            com.sumsub.sns.core.presentation.base.AbstractC28052C.finish$default(r18, r19, r20, r21, r22, r23, r24)
        L189:
            r0.f62341i = r9
            r0.f62333a = r9
            r0.f62334b = r9
            r0.f62335c = r9
            r0.f62336d = r9
            r0.f62337e = r9
            r1 = 4
            r0.f62340h = r1
            java.lang.Object r1 = r3.emit(r4, r0)
            if (r1 != r2) goto L19f
        L19e:
            return r2
        L19f:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
