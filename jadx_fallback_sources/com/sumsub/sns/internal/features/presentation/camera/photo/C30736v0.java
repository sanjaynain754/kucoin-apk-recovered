package com.sumsub.sns.internal.features.presentation.camera.photo;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.v0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30736v0 extends com.sumsub.sns.core.presentation.base.AbstractC28142p0 {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f62087V = 0;

    /* JADX INFO: renamed from: a */
    public final java.lang.String f62088a;

    /* JADX INFO: renamed from: b */
    public final java.lang.String f62089b;

    /* JADX INFO: renamed from: c */
    public final com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m f62090c;

    /* JADX INFO: renamed from: d */
    public final com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a f62091d;

    /* JADX INFO: renamed from: e */
    public final com.sumsub.sns.internal.features.domain.C30156e f62092e;

    /* JADX INFO: renamed from: f */
    public final com.sumsub.sns.internal.features.domain.C30332x f62093f;

    /* JADX INFO: renamed from: g */
    public final com.sumsub.sns.internal.features.domain.ekyc.C30159b f62094g;

    /* JADX INFO: renamed from: h */
    public final com.sumsub.sns.internal.features.domain.ekyc.C30161d f62095h;

    /* JADX INFO: renamed from: i */
    public final kotlinx.coroutines.flow.InterfaceC41678w f62096i;

    /* JADX INFO: renamed from: j */
    public final kotlinx.coroutines.flow.InterfaceC41678w f62097j;

    /* JADX INFO: renamed from: k */
    public final kotlinx.coroutines.flow.InterfaceC41669n f62098k;

    /* JADX INFO: renamed from: l */
    public final kotlinx.coroutines.flow.InterfaceC41669n f62099l;

    /* JADX INFO: renamed from: m */
    public final com.sumsub.sns.internal.features.presentation.camera.photo.C30686o0 f62100m;

    /* JADX INFO: renamed from: n */
    public final com.sumsub.sns.internal.features.presentation.camera.photo.C30692r0 f62101n;

    /* JADX INFO: renamed from: o */
    public final kotlinx.coroutines.flow.InterfaceC41668m f62102o;

    /* JADX INFO: renamed from: p */
    public final kotlinx.coroutines.flow.InterfaceC41678w f62103p;

    public C30736v0(java.lang.String r10, java.lang.String r11, com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a r12, com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m r13, com.sumsub.sns.internal.core.domain.C28547d r14, com.sumsub.sns.internal.features.domain.C30156e r15, com.sumsub.sns.internal.features.domain.C30332x r16, com.sumsub.sns.internal.features.domain.ekyc.C30159b r17, com.sumsub.sns.internal.features.domain.ekyc.C30161d r18) {
            r9 = this;
            com.sumsub.sns.core.presentation.base.P r1 = new com.sumsub.sns.core.presentation.base.P
            r2 = 3
            r1.<init>(r2)
            r9.<init>(r12, r13, r1)
            r9.f62088a = r10
            r9.f62089b = r11
            r9.f62090c = r13
            r9.f62091d = r14
            r9.f62092e = r15
            r10 = r16
            r9.f62093f = r10
            r10 = r17
            r9.f62094g = r10
            r10 = r18
            r9.f62095h = r10
            com.sumsub.sns.internal.features.presentation.camera.photo.K r10 = new com.sumsub.sns.internal.features.presentation.camera.photo.K
            r11 = 0
            r10.<init>(r9, r11)
            kotlinx.coroutines.flow.e r10 = kotlinx.coroutines.flow.C41636g.m90887K(r10)
            kotlinx.coroutines.j0 r12 = kotlinx.coroutines.C41782z0.m91392b()
            kotlinx.coroutines.flow.e r10 = kotlinx.coroutines.flow.C41636g.m90890N(r10, r12)
            kotlinx.coroutines.m0 r12 = androidx.lifecycle.ViewModelKt.getViewModelScope(r9)
            kotlinx.coroutines.flow.SharingStarted$Companion r0 = kotlinx.coroutines.flow.SharingStarted.f91641a
            r5 = 3
            r6 = 0
            r1 = 0
            r3 = 0
            kotlinx.coroutines.flow.SharingStarted r1 = kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(r0, r1, r3, r5, r6)
            kotlinx.coroutines.flow.w r10 = kotlinx.coroutines.flow.C41636g.m90916g0(r10, r12, r1, r11)
            r9.f62096i = r10
            com.sumsub.sns.internal.features.presentation.camera.photo.i0 r12 = new com.sumsub.sns.internal.features.presentation.camera.photo.i0
            r12.<init>(r10)
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
            kotlinx.coroutines.m0 r7 = androidx.lifecycle.ViewModelKt.getViewModelScope(r9)
            r1 = 0
            kotlinx.coroutines.flow.SharingStarted r1 = kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(r0, r1, r3, r5, r6)
            kotlinx.coroutines.flow.w r10 = kotlinx.coroutines.flow.C41636g.m90916g0(r12, r7, r1, r10)
            r9.f62097j = r10
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            kotlinx.coroutines.flow.n r12 = kotlinx.coroutines.flow.C41679x.m91009a(r12)
            r9.f62098k = r12
            kotlinx.coroutines.flow.n r12 = kotlinx.coroutines.flow.C41679x.m91009a(r11)
            r9.f62099l = r12
            com.sumsub.sns.internal.features.presentation.camera.photo.l0 r1 = new com.sumsub.sns.internal.features.presentation.camera.photo.l0
            r1.<init>(r12, r9)
            com.sumsub.sns.internal.features.presentation.camera.photo.S r2 = new com.sumsub.sns.internal.features.presentation.camera.photo.S
            r2.<init>(r9, r11)
            kotlinx.coroutines.flow.e r1 = kotlinx.coroutines.flow.C41636g.m90917h(r1, r2)
            com.sumsub.sns.internal.features.presentation.camera.photo.T r2 = new com.sumsub.sns.internal.features.presentation.camera.photo.T
            r2.<init>(r9, r11)
            kotlinx.coroutines.flow.e r1 = kotlinx.coroutines.flow.C41636g.m90896T(r1, r2)
            kotlinx.coroutines.j0 r2 = kotlinx.coroutines.C41782z0.m91392b()
            kotlinx.coroutines.flow.e r7 = kotlinx.coroutines.flow.C41636g.m90890N(r1, r2)
            kotlinx.coroutines.m0 r8 = androidx.lifecycle.ViewModelKt.getViewModelScope(r9)
            r1 = 0
            kotlinx.coroutines.flow.SharingStarted r1 = kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(r0, r1, r3, r5, r6)
            kotlinx.coroutines.flow.w r1 = kotlinx.coroutines.flow.C41636g.m90916g0(r7, r8, r1, r11)
            com.sumsub.sns.internal.features.presentation.camera.photo.o0 r7 = new com.sumsub.sns.internal.features.presentation.camera.photo.o0
            r7.<init>(r1, r9)
            r9.f62100m = r7
            com.sumsub.sns.internal.features.presentation.camera.photo.r0 r2 = new com.sumsub.sns.internal.features.presentation.camera.photo.r0
            r2.<init>(r1, r9)
            r9.f62101n = r2
            r1 = 0
            r2 = 7
            kotlinx.coroutines.flow.m r2 = kotlinx.coroutines.flow.C41674s.m91001b(r1, r1, r11, r2, r11)
            r9.f62102o = r2
            com.sumsub.sns.internal.features.presentation.camera.photo.u0 r3 = new com.sumsub.sns.internal.features.presentation.camera.photo.u0
            r3.<init>(r12)
            r12 = 2
            kotlinx.coroutines.flow.e[] r12 = new kotlinx.coroutines.flow.InterfaceC41634e[r12]
            r12[r1] = r3
            r1 = 1
            r12[r1] = r2
            kotlinx.coroutines.flow.e r12 = kotlinx.coroutines.flow.C41636g.m90894R(r12)
            kotlinx.coroutines.m0 r8 = androidx.lifecycle.ViewModelKt.getViewModelScope(r9)
            r1 = 0
            r3 = 0
            kotlinx.coroutines.flow.SharingStarted r0 = kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(r0, r1, r3, r5, r6)
            kotlinx.coroutines.flow.w r12 = kotlinx.coroutines.flow.C41636g.m90916g0(r12, r8, r0, r11)
            r9.f62103p = r12
            kotlinx.coroutines.m0 r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r9)
            com.sumsub.sns.internal.features.presentation.camera.photo.i r1 = new com.sumsub.sns.internal.features.presentation.camera.photo.i
            r1.<init>(r9, r11)
            com.sumsub.sns.internal.core.common.AbstractC28421U.m69306b(r10, r0, r1)
            kotlinx.coroutines.m0 r10 = androidx.lifecycle.ViewModelKt.getViewModelScope(r9)
            com.sumsub.sns.internal.features.presentation.camera.photo.j r0 = new com.sumsub.sns.internal.features.presentation.camera.photo.j
            r0.<init>(r9, r11)
            com.sumsub.sns.internal.core.common.AbstractC28421U.m69306b(r12, r10, r0)
            kotlinx.coroutines.m0 r10 = androidx.lifecycle.ViewModelKt.getViewModelScope(r9)
            com.sumsub.sns.internal.features.presentation.camera.photo.k r12 = new com.sumsub.sns.internal.features.presentation.camera.photo.k
            r12.<init>(r9, r11)
            com.sumsub.sns.internal.core.common.AbstractC28421U.m69306b(r7, r10, r12)
            return
    }

    /* JADX INFO: renamed from: a */
    public static final java.lang.String m70438a(com.sumsub.sns.internal.features.presentation.camera.photo.C30736v0 r8, com.sumsub.sns.internal.features.data.repository.dynamic.C29983l r9) {
            r0 = 1
            java.lang.String r1 = "sns_step_%s_selector_country_prompt_short"
            java.lang.String r2 = "sns_step_%s_selector_country_prompt"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 2
            r2.<init>(r3)
            r4 = 0
            r5 = r4
        L13:
            if (r5 >= r3) goto L2c
            r6 = r1[r5]
            kotlin.jvm.internal.StringCompanionObject r7 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.String r7 = r8.f62088a
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r2.add(r6)
            int r5 = r5 + r0
            goto L13
        L2c:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r3)
            r5 = r4
        L32:
            if (r5 >= r3) goto L4b
            r6 = r1[r5]
            kotlin.jvm.internal.StringCompanionObject r7 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.String r7 = "defaults"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r8.add(r6)
            int r5 = r5 + r0
            goto L32
        L4b:
            java.util.List r8 = kotlin.collections.CollectionsKt.plus(r2, r8)
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r8 = r8.toArray(r0)
            java.lang.String[] r8 = (java.lang.String[]) r8
            if (r9 == 0) goto L65
            int r0 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r0)
            java.lang.String[] r8 = (java.lang.String[]) r8
            java.lang.String r8 = com.sumsub.sns.internal.core.common.AbstractC28398I.m69284a(r9, r8)
            return r8
        L65:
            r8 = 0
            return r8
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70439a(com.sumsub.sns.internal.features.domain.C30318v r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
            r10 = this;
            boolean r0 = r13 instanceof com.sumsub.sns.internal.features.presentation.camera.photo.C30419Y
            if (r0 == 0) goto L13
            r0 = r13
            com.sumsub.sns.internal.features.presentation.camera.photo.Y r0 = (com.sumsub.sns.internal.features.presentation.camera.photo.C30419Y) r0
            int r1 = r0.f61226k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61226k = r1
            goto L18
        L13:
            com.sumsub.sns.internal.features.presentation.camera.photo.Y r0 = new com.sumsub.sns.internal.features.presentation.camera.photo.Y
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f61224i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f61226k
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.util.Collection r11 = r0.f61223h
            com.sumsub.sns.internal.features.presentation.camera.photo.p r12 = r0.f61222g
            com.sumsub.sns.internal.features.data.repository.extensions.a r2 = r0.f61221f
            com.sumsub.sns.internal.features.data.model.common.q2 r4 = r0.f61220e
            com.sumsub.sns.internal.features.data.model.common.q2 r5 = r0.f61219d
            java.util.Iterator r6 = r0.f61218c
            java.util.Collection r7 = r0.f61217b
            java.lang.String r8 = r0.f61216a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L89
        L39:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L41:
            kotlin.ResultKt.throwOnFailure(r13)
            java.util.List r11 = r11.f60950b
            java.util.ArrayList r13 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r11, r2)
            r13.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
            r6 = r11
            r11 = r13
        L57:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto Lb8
            java.lang.Object r13 = r6.next()
            r4 = r13
            com.sumsub.sns.internal.features.data.model.common.q2 r4 = (com.sumsub.sns.internal.features.data.model.common.AbstractC29180q2) r4
            com.sumsub.sns.internal.features.presentation.camera.photo.p r13 = new com.sumsub.sns.internal.features.presentation.camera.photo.p
            r13.<init>(r12, r4)
            com.sumsub.sns.internal.features.data.repository.extensions.a r2 = r10.f62091d
            r0.f61216a = r12
            r0.f61217b = r11
            r0.f61218c = r6
            r0.f61219d = r4
            r0.f61220e = r4
            r0.f61221f = r2
            r0.f61222g = r13
            r0.f61223h = r11
            r0.f61226k = r3
            java.lang.Object r5 = r10.getStrings(r0)
            if (r5 != r1) goto L84
            return r1
        L84:
            r7 = r11
            r8 = r12
            r12 = r13
            r13 = r5
            r5 = r4
        L89:
            com.sumsub.sns.internal.features.data.repository.dynamic.l r13 = (com.sumsub.sns.internal.features.data.repository.dynamic.C29983l) r13
            r9 = 0
            java.lang.CharSequence r13 = r4.m69801a(r13, r9)
            com.sumsub.sns.internal.core.domain.d r2 = (com.sumsub.sns.internal.core.domain.C28547d) r2
            com.sumsub.sns.internal.core.domain.h r2 = r2.f58099a
            android.content.Context r2 = r2.f58163a
            android.text.Spanned r13 = com.sumsub.sns.internal.core.common.AbstractC28462i0.m69364a(r13, r2)
            java.lang.String r2 = r5.f59177b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "IdentityType/"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.sumsub.sns.internal.features.presentation.camera.photo.E r4 = new com.sumsub.sns.internal.features.presentation.camera.photo.E
            r4.<init>(r12, r13, r2)
            r11.add(r4)
            r11 = r7
            r12 = r8
            goto L57
        Lb8:
            java.util.List r11 = (java.util.List) r11
            return r11
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70440a(java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
            r11 = this;
            boolean r0 = r13 instanceof com.sumsub.sns.internal.features.presentation.camera.photo.C30420Z
            if (r0 == 0) goto L13
            r0 = r13
            com.sumsub.sns.internal.features.presentation.camera.photo.Z r0 = (com.sumsub.sns.internal.features.presentation.camera.photo.C30420Z) r0
            int r1 = r0.f61235i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61235i = r1
            goto L18
        L13:
            com.sumsub.sns.internal.features.presentation.camera.photo.Z r0 = new com.sumsub.sns.internal.features.presentation.camera.photo.Z
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f61233g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f61235i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            com.sumsub.sns.internal.features.presentation.camera.photo.u r12 = r0.f61232f
            java.lang.String r2 = r0.f61231e
            com.sumsub.sns.internal.features.data.model.common.F r4 = r0.f61230d
            java.util.Iterator r6 = r0.f61229c
            java.lang.Object r7 = r0.f61228b
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.String r8 = r0.f61227a
            kotlin.ResultKt.throwOnFailure(r13)
            goto Lc8
        L3c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L44:
            java.lang.Object r12 = r0.f61228b
            com.sumsub.sns.internal.features.domain.ekyc.b r12 = (com.sumsub.sns.internal.features.domain.ekyc.C30159b) r12
            java.lang.String r2 = r0.f61227a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L6a
        L4e:
            kotlin.ResultKt.throwOnFailure(r13)
            com.sumsub.sns.internal.features.domain.ekyc.b r13 = r11.f62094g
            com.sumsub.sns.internal.features.data.repository.dynamic.m r2 = r11.f62090c
            r0.f61227a = r12
            r0.f61228b = r13
            r0.f61235i = r4
            com.sumsub.sns.internal.features.data.repository.dynamic.J r2 = (com.sumsub.sns.internal.features.data.repository.dynamic.C29967J) r2
            r4 = 0
            java.lang.Object r2 = r2.m70047c(r4, r0)
            if (r2 != r1) goto L66
            goto Lc7
        L66:
            r10 = r2
            r2 = r12
            r12 = r13
            r13 = r10
        L6a:
            com.sumsub.sns.internal.features.data.model.common.h r13 = (com.sumsub.sns.internal.features.data.model.common.C29124h) r13
            java.util.Map r13 = r13.f59078k
            java.lang.String r4 = r11.f62088a
            r12.getClass()
            java.util.Map r12 = com.sumsub.sns.internal.features.domain.ekyc.C30159b.m70123a(r4, r13)
            if (r12 == 0) goto L80
            java.lang.Object r12 = r12.get(r2)
            java.util.List r12 = (java.util.List) r12
            goto L81
        L80:
            r12 = r5
        L81:
            if (r12 == 0) goto Lef
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L8a
            goto Lef
        L8a:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
            r6 = r12
            r7 = r13
            r8 = r2
        L96:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto Lec
            java.lang.Object r12 = r6.next()
            r4 = r12
            com.sumsub.sns.internal.features.data.model.common.F r4 = (com.sumsub.sns.internal.features.data.model.common.C28999F) r4
            java.lang.String r2 = r4.f58940a
            if (r2 != 0) goto La9
            r4 = r5
            goto Le6
        La9:
            com.sumsub.sns.internal.features.presentation.camera.photo.u r12 = new com.sumsub.sns.internal.features.presentation.camera.photo.u
            r12.<init>(r8, r2)
            com.sumsub.sns.internal.features.domain.ekyc.d r13 = r11.f62095h
            r0.f61227a = r8
            r0.f61228b = r7
            r0.f61229c = r6
            r0.f61230d = r4
            r0.f61231e = r2
            r0.f61232f = r12
            r0.f61235i = r3
            java.lang.String r9 = "name"
            java.lang.Object r13 = r13.m70124a(r9, r2, r5, r0)
            if (r13 != r1) goto Lc8
        Lc7:
            return r1
        Lc8:
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto Lcd
            goto Lce
        Lcd:
            r2 = r13
        Lce:
            java.lang.String r13 = r4.f58941b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "IdentityType/"
            r4.append(r9)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            com.sumsub.sns.internal.features.presentation.camera.photo.E r4 = new com.sumsub.sns.internal.features.presentation.camera.photo.E
            r4.<init>(r12, r2, r13)
        Le6:
            if (r4 == 0) goto L96
            r7.add(r4)
            goto L96
        Lec:
            java.util.List r7 = (java.util.List) r7
            return r7
        Lef:
            java.util.List r12 = kotlin.collections.CollectionsKt.emptyList()
            return r12
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.String m70441a(com.sumsub.sns.internal.features.data.repository.dynamic.C29983l r4, java.lang.String r5) {
            r3 = this;
            if (r4 == 0) goto L2a
            kotlin.jvm.internal.StringCompanionObject r0 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.String r0 = r3.f62088a
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = java.lang.String.format(r5, r0)
            java.lang.String r2 = "defaults"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r5 = java.lang.String.format(r5, r1)
            java.lang.String[] r5 = new java.lang.String[]{r0, r5}
            java.lang.String r4 = com.sumsub.sns.internal.core.common.AbstractC28398I.m69284a(r4, r5)
            return r4
        L2a:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: a */
    public final void m70442a(com.sumsub.sns.internal.features.presentation.camera.photo.C30400E r13) {
            r12 = this;
            com.sumsub.sns.internal.log.c r0 = com.sumsub.sns.internal.log.C33272c.f67812a
            java.lang.String r1 = com.sumsub.sns.internal.log.AbstractC33294e.m71624a(r12)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onItemSelected: "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r4 = 4
            r5 = 0
            r3 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.d$default(r0, r1, r2, r3, r4, r5)
            kotlinx.coroutines.m0 r6 = androidx.lifecycle.ViewModelKt.getViewModelScope(r12)
            com.sumsub.sns.internal.features.presentation.camera.photo.f0 r9 = new com.sumsub.sns.internal.features.presentation.camera.photo.f0
            r0 = 0
            r9.<init>(r12, r13, r0)
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            kotlinx.coroutines.C41686h.m91046d(r6, r7, r8, r9, r10, r11)
            return
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final kotlinx.coroutines.flow.InterfaceC41634e buildViewStateFlow(com.sumsub.sns.core.presentation.base.C28075O r11) {
            r10 = this;
            kotlinx.coroutines.flow.w r0 = r10.f62097j
            com.sumsub.sns.internal.features.presentation.camera.photo.N r1 = new com.sumsub.sns.internal.features.presentation.camera.photo.N
            r1.<init>(r0)
            kotlinx.coroutines.flow.n r0 = r10.f62098k
            com.sumsub.sns.internal.features.presentation.camera.photo.O r2 = new com.sumsub.sns.internal.features.presentation.camera.photo.O
            r3 = 0
            r2.<init>(r3)
            kotlinx.coroutines.flow.e r4 = kotlinx.coroutines.flow.C41636g.m90927m(r1, r0, r2)
            com.sumsub.sns.internal.features.presentation.camera.photo.H r0 = new com.sumsub.sns.internal.features.presentation.camera.photo.H
            r0.<init>(r10, r11, r3)
            com.sumsub.sns.internal.core.common.D r1 = new com.sumsub.sns.internal.core.common.D
            r1.<init>(r0, r3)
            kotlinx.coroutines.flow.e r5 = kotlinx.coroutines.flow.C41636g.m90887K(r1)
            com.sumsub.sns.internal.features.data.repository.dynamic.l r0 = r11.f57271c
            com.sumsub.sns.internal.features.presentation.camera.photo.d0 r1 = new com.sumsub.sns.internal.features.presentation.camera.photo.d0
            r1.<init>(r10, r0, r3)
            kotlinx.coroutines.flow.e r6 = kotlinx.coroutines.flow.C41636g.m90887K(r1)
            com.sumsub.sns.internal.features.data.repository.dynamic.l r0 = r11.f57271c
            com.sumsub.sns.internal.features.presentation.camera.photo.Q r1 = new com.sumsub.sns.internal.features.presentation.camera.photo.Q
            r1.<init>(r10, r0, r3)
            kotlinx.coroutines.flow.e r7 = kotlinx.coroutines.flow.C41636g.m90887K(r1)
            com.sumsub.sns.internal.features.data.repository.dynamic.l r11 = r11.f57271c
            com.sumsub.sns.internal.features.presentation.camera.photo.X r0 = new com.sumsub.sns.internal.features.presentation.camera.photo.X
            r0.<init>(r10, r11, r3)
            kotlinx.coroutines.flow.e r8 = kotlinx.coroutines.flow.C41636g.m90887K(r0)
            com.sumsub.sns.internal.features.presentation.camera.photo.I r9 = new com.sumsub.sns.internal.features.presentation.camera.photo.I
            r9.<init>(r3)
            kotlinx.coroutines.flow.e r11 = kotlinx.coroutines.flow.C41636g.m90933p(r4, r5, r6, r7, r8, r9)
            com.sumsub.sns.internal.features.presentation.camera.photo.J r0 = new com.sumsub.sns.internal.features.presentation.camera.photo.J
            r0.<init>(r10, r3)
            kotlinx.coroutines.flow.e r11 = kotlinx.coroutines.flow.C41636g.m90897U(r11, r0)
            return r11
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(com.sumsub.sns.core.presentation.base.InterfaceC28077Q r8) {
            r7 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.features.presentation.camera.photo.C30739x
            if (r0 == 0) goto L31
            com.sumsub.sns.internal.features.presentation.camera.photo.x r8 = (com.sumsub.sns.internal.features.presentation.camera.photo.C30739x) r8
            com.sumsub.sns.internal.features.presentation.country.b r8 = r8.f62108a
            if (r8 == 0) goto La5
            kotlinx.coroutines.flow.n r0 = r7.f62099l
            java.lang.Object r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
            if (r0 == 0) goto L18
            goto La5
        L18:
            kotlinx.coroutines.flow.n r0 = r7.f62099l
            r0.setValue(r8)
            com.sumsub.sns.internal.core.common.k0 r0 = com.sumsub.sns.internal.core.common.C28468k0.f57983a
            com.sumsub.sns.core.data.listener.SNSEventHandler r0 = r0.getEventHandler()
            if (r0 == 0) goto La5
            com.sumsub.sns.core.data.listener.SNSEvent$CountrySelected r1 = new com.sumsub.sns.core.data.listener.SNSEvent$CountrySelected
            java.lang.String r8 = r8.f62373a
            r2 = 1
            r1.<init>(r8, r2)
            r0.onEvent(r1)
            return
        L31:
            boolean r0 = r8 instanceof com.sumsub.sns.internal.features.presentation.camera.photo.C30743z
            if (r0 == 0) goto L3d
            com.sumsub.sns.internal.features.presentation.camera.photo.z r8 = (com.sumsub.sns.internal.features.presentation.camera.photo.C30743z) r8
            com.sumsub.sns.internal.features.presentation.camera.photo.E r8 = r8.f62114a
            r7.m70442a(r8)
            return
        L3d:
            boolean r0 = r8 instanceof com.sumsub.sns.internal.features.presentation.camera.photo.C30737w
            if (r0 == 0) goto L53
            kotlinx.coroutines.m0 r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r7)
            com.sumsub.sns.internal.features.presentation.camera.photo.e0 r4 = new com.sumsub.sns.internal.features.presentation.camera.photo.e0
            r8 = 0
            r4.<init>(r7, r8)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.C41686h.m91046d(r1, r2, r3, r4, r5, r6)
            return
        L53:
            boolean r0 = r8 instanceof com.sumsub.sns.internal.features.presentation.camera.photo.C30396A
            if (r0 == 0) goto L8c
            kotlinx.coroutines.flow.w r8 = r7.f62097j
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L66
            goto La5
        L66:
            kotlinx.coroutines.flow.n r8 = r7.f62098k
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L84
            com.sumsub.sns.internal.log.c r0 = com.sumsub.sns.internal.log.C33272c.f67812a
            java.lang.String r1 = com.sumsub.sns.internal.log.AbstractC33294e.m71624a(r7)
            r4 = 4
            r5 = 0
            java.lang.String r2 = "onSelectCountryClick: dialog already shown"
            r3 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.d$default(r0, r1, r2, r3, r4, r5)
            return
        L84:
            kotlinx.coroutines.flow.n r8 = r7.f62098k
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.setValue(r0)
            return
        L8c:
            boolean r8 = r8 instanceof com.sumsub.sns.internal.features.presentation.camera.photo.C30741y
            if (r8 == 0) goto La5
            kotlinx.coroutines.flow.n r8 = r7.f62098k
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto La5
            kotlinx.coroutines.flow.n r8 = r7.f62098k
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.setValue(r0)
        La5:
            return
    }
}
