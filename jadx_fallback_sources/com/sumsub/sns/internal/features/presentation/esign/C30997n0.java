package com.sumsub.sns.internal.features.presentation.esign;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.n0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30997n0 extends com.sumsub.sns.core.presentation.base.AbstractC28073M0 implements com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ kotlin.reflect.KProperty[] f62640t = null;

    /* JADX INFO: renamed from: a */
    public final android.os.Bundle f62641a;

    /* JADX INFO: renamed from: b */
    public final com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d f62642b;

    /* JADX INFO: renamed from: c */
    public final java.io.File f62643c;

    /* JADX INFO: renamed from: d */
    public final com.sumsub.sns.internal.features.domain.esign.C30170g f62644d;

    /* JADX INFO: renamed from: e */
    public final com.sumsub.sns.internal.features.domain.esign.C30172i f62645e;

    /* JADX INFO: renamed from: f */
    public final com.sumsub.sns.internal.features.domain.esign.C30174k f62646f;

    /* JADX INFO: renamed from: g */
    public final com.sumsub.sns.internal.features.domain.esign.C30168e f62647g;

    /* JADX INFO: renamed from: h */
    public final com.sumsub.sns.internal.features.domain.esign.C30165b f62648h;

    /* JADX INFO: renamed from: i */
    public final kotlinx.coroutines.flow.InterfaceC41669n f62649i;

    /* JADX INFO: renamed from: j */
    public final com.sumsub.sns.internal.features.presentation.esign.C30968X f62650j;

    /* JADX INFO: renamed from: k */
    public final com.sumsub.sns.internal.core.presentation.screen.base.C28936t f62651k;

    /* JADX INFO: renamed from: l */
    public final com.sumsub.sns.internal.core.presentation.screen.base.C28936t f62652l;

    /* JADX INFO: renamed from: m */
    public com.sumsub.sns.internal.features.data.model.esign.C29752Y f62653m;

    /* JADX INFO: renamed from: n */
    public final com.sumsub.sns.internal.core.presentation.screen.base.C28936t f62654n;

    /* JADX INFO: renamed from: o */
    public final com.sumsub.sns.internal.core.presentation.screen.base.C28936t f62655o;

    /* JADX INFO: renamed from: p */
    public final com.sumsub.sns.internal.core.presentation.screen.base.C28936t f62656p;

    /* JADX INFO: renamed from: q */
    public final java.util.LinkedHashMap f62657q;

    /* JADX INFO: renamed from: r */
    public final com.sumsub.sns.internal.core.presentation.screen.base.C28936t f62658r;

    /* JADX INFO: renamed from: s */
    public kotlinx.coroutines.InterfaceC41775x1 f62659s;

    static {
            java.lang.Class<com.sumsub.sns.internal.features.presentation.esign.n0> r0 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.class
            java.lang.String r1 = "fieldValueCache"
            java.lang.String r2 = "getFieldValueCache()Ljava/util/Map;"
            r3 = 0
            kotlin.reflect.KMutableProperty1 r1 = com.sumsub.sns.internal.core.presentation.android.AbstractC28639a.m69485a(r0, r1, r2, r3)
            java.lang.String r2 = "initialFieldValueCache"
            java.lang.String r4 = "getInitialFieldValueCache()Ljava/util/Map;"
            kotlin.reflect.KMutableProperty1 r2 = com.sumsub.sns.internal.core.presentation.android.AbstractC28639a.m69485a(r0, r2, r4, r3)
            java.lang.String r4 = "eOtpSentAtMs"
            java.lang.String r5 = "getEOtpSentAtMs()J"
            kotlin.reflect.KMutableProperty1 r4 = com.sumsub.sns.internal.core.presentation.android.AbstractC28639a.m69485a(r0, r4, r5, r3)
            java.lang.String r5 = "agreementsAccepted"
            java.lang.String r6 = "getAgreementsAccepted()Z"
            kotlin.reflect.KMutableProperty1 r5 = com.sumsub.sns.internal.core.presentation.android.AbstractC28639a.m69485a(r0, r5, r6, r3)
            java.lang.String r6 = "acceptedAgreementIds"
            java.lang.String r7 = "getAcceptedAgreementIds()Ljava/util/Set;"
            kotlin.reflect.KMutableProperty1 r6 = com.sumsub.sns.internal.core.presentation.android.AbstractC28639a.m69485a(r0, r6, r7, r3)
            java.lang.String r7 = "isLastAgreementItemVisible"
            java.lang.String r8 = "isLastAgreementItemVisible()Z"
            kotlin.reflect.KMutableProperty1 r0 = com.sumsub.sns.internal.core.presentation.android.AbstractC28639a.m69485a(r0, r7, r8, r3)
            r7 = 6
            kotlin.reflect.KProperty[] r7 = new kotlin.reflect.KProperty[r7]
            r7[r3] = r1
            r1 = 1
            r7[r1] = r2
            r1 = 2
            r7[r1] = r4
            r1 = 3
            r7[r1] = r5
            r1 = 4
            r7[r1] = r6
            r1 = 5
            r7[r1] = r0
            com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t = r7
            return
    }

    public C30997n0(android.os.Bundle r1, androidx.lifecycle.SavedStateHandle r2, com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a r3, com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m r4, com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d r5, java.io.File r6, com.sumsub.sns.internal.features.domain.esign.C30170g r7, com.sumsub.sns.internal.features.domain.esign.C30172i r8, com.sumsub.sns.internal.features.domain.esign.C30174k r9, com.sumsub.sns.internal.features.domain.esign.C30168e r10, com.sumsub.sns.internal.features.domain.esign.C30165b r11) {
            r0 = this;
            r0.<init>(r3, r4)
            r0.f62641a = r1
            r0.f62642b = r5
            r0.f62643c = r6
            r0.f62644d = r7
            r0.f62645e = r8
            r0.f62646f = r9
            r0.f62647g = r10
            r0.f62648h = r11
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            com.sumsub.sns.internal.core.presentation.form.j r3 = new com.sumsub.sns.internal.core.presentation.form.j
            r3.<init>()
            com.sumsub.sns.internal.core.presentation.form.f r4 = new com.sumsub.sns.internal.core.presentation.form.f
            r5 = 0
            r6 = 0
            r4.<init>(r6, r1, r5, r3)
            kotlinx.coroutines.flow.n r1 = kotlinx.coroutines.flow.C41679x.m91009a(r4)
            r0.f62649i = r1
            com.sumsub.sns.internal.features.presentation.esign.X r1 = new com.sumsub.sns.internal.features.presentation.esign.X
            r1.<init>(r0)
            r0.f62650j = r1
            com.sumsub.sns.internal.core.presentation.screen.base.t r1 = new com.sumsub.sns.internal.core.presentation.screen.base.t
            java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
            java.lang.String r4 = "KEY_FIELD_CACHE"
            r1.<init>(r2, r4, r3, r6)
            r0.f62651k = r1
            com.sumsub.sns.internal.core.presentation.screen.base.t r1 = new com.sumsub.sns.internal.core.presentation.screen.base.t
            java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
            java.lang.String r4 = "KEY_INITIAL_FIELD_CACHE"
            r1.<init>(r2, r4, r3, r6)
            r0.f62652l = r1
            com.sumsub.sns.internal.core.presentation.screen.base.t r1 = new com.sumsub.sns.internal.core.presentation.screen.base.t
            r3 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "eOtpSentAtMs"
            r1.<init>(r2, r4, r3, r6)
            r0.f62654n = r1
            com.sumsub.sns.internal.core.presentation.screen.base.t r1 = new com.sumsub.sns.internal.core.presentation.screen.base.t
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.String r4 = "agreementsAccepted"
            r1.<init>(r2, r4, r3, r6)
            r0.f62655o = r1
            com.sumsub.sns.internal.core.presentation.screen.base.t r1 = new com.sumsub.sns.internal.core.presentation.screen.base.t
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.lang.String r5 = "acceptedAgreementIds"
            r1.<init>(r2, r5, r4, r6)
            r0.f62656p = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.f62657q = r1
            com.sumsub.sns.internal.core.presentation.screen.base.t r1 = new com.sumsub.sns.internal.core.presentation.screen.base.t
            java.lang.String r4 = "isLastAgreementItemVisible"
            r1.<init>(r2, r4, r3, r6)
            r0.f62658r = r1
            return
    }

    /* JADX INFO: renamed from: a */
    public static final com.sumsub.sns.internal.core.presentation.form.C28799f m70537a(com.sumsub.sns.internal.core.presentation.form.C28801h r9, java.util.List r10, com.sumsub.sns.internal.core.presentation.form.C28799f r11) {
            int r0 = r9.f58570a
            java.lang.String r1 = r9.f58571b
            java.lang.String r9 = r9.f58572c
            com.sumsub.sns.internal.core.presentation.form.h r2 = new com.sumsub.sns.internal.core.presentation.form.h
            r2.<init>(r0, r1, r9, r10)
            java.util.List r5 = kotlin.collections.CollectionsKt.listOf(r2)
            r7 = 0
            r8 = 13
            r4 = 0
            r6 = 0
            r3 = r11
            com.sumsub.sns.internal.core.presentation.form.f r9 = com.sumsub.sns.internal.core.presentation.form.C28799f.m69615a(r3, r4, r5, r6, r7, r8)
            return r9
    }

    /* JADX INFO: renamed from: a */
    public static final java.lang.String m70538a(com.sumsub.sns.internal.features.presentation.esign.C30997n0 r3, java.lang.String r4, java.lang.String r5) {
            com.sumsub.sns.internal.features.data.repository.dynamic.l r0 = r3.getStrings()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "sns_esign_"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = "_"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.m70061a(r1)
            if (r0 != 0) goto L37
            com.sumsub.sns.internal.features.data.repository.dynamic.l r3 = r3.getStrings()
            kotlin.jvm.internal.StringCompanionObject r0 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            r5 = 2
            java.lang.String r0 = "sns_data_%s_%s"
            java.lang.String r3 = com.sumsub.sns.internal.core.presentation.intro.AbstractC28892d.m69671a(r4, r5, r0, r3)
            return r3
        L37:
            return r0
    }

    /* JADX INFO: renamed from: a */
    public static void m70539a(java.util.ArrayList r22, com.sumsub.sns.internal.features.data.model.esign.C29752Y r23) {
            r0 = r22
            r1 = r23
            com.sumsub.sns.internal.features.data.model.esign.c r1 = r1.f59829e
            if (r1 == 0) goto L160
            com.sumsub.sns.internal.features.data.model.esign.i r1 = r1.f59831a
            if (r1 == 0) goto L160
            java.util.List r1 = r1.f59844b
            if (r1 == 0) goto L160
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        L16:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L160
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L27
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L27:
            com.sumsub.sns.internal.features.data.model.esign.f r4 = (com.sumsub.sns.internal.features.data.model.esign.C29763f) r4
            com.sumsub.sns.internal.core.presentation.form.model.Q r6 = new com.sumsub.sns.internal.core.presentation.form.model.Q
            com.sumsub.sns.internal.features.data.model.common.remote.response.F r7 = new com.sumsub.sns.internal.features.data.model.common.remote.response.F
            java.lang.String r8 = r4.f59836a
            r16 = 0
            r17 = 1022(0x3fe, float:1.432E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "agreement_"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            r6.<init>(r7, r8)
            r0.add(r6)
            java.lang.String r6 = r4.f59837b
            if (r6 == 0) goto L9d
            com.sumsub.sns.internal.core.presentation.form.model.Z r7 = new com.sumsub.sns.internal.core.presentation.form.model.Z
            com.sumsub.sns.internal.features.data.model.common.remote.response.F r8 = new com.sumsub.sns.internal.features.data.model.common.remote.response.F
            java.lang.String r9 = r4.f59837b
            if (r9 == 0) goto L70
            r13 = 4
            r14 = 0
            java.lang.String r10 = "<br>"
            java.lang.String r11 = ""
            r12 = 0
            java.lang.String r6 = kotlin.text.StringsKt.replace$default(r9, r10, r11, r12, r13, r14)
            if (r6 != 0) goto L6e
            goto L70
        L6e:
            r11 = r6
            goto L73
        L70:
            java.lang.String r6 = ""
            goto L6e
        L73:
            r17 = 0
            r18 = 1018(0x3fa, float:1.427E-42)
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "text_agreement_"
            r6.append(r9)
            r6.append(r3)
            java.lang.String r9 = r6.toString()
            r15 = 184(0xb8, float:2.58E-43)
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.add(r7)
        L9d:
            java.util.List r4 = r4.f59839d
            if (r4 == 0) goto L15d
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        Laa:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Ld1
            java.lang.Object r7 = r4.next()
            r8 = r7
            com.sumsub.sns.internal.features.data.model.esign.l r8 = (com.sumsub.sns.internal.features.data.model.esign.C29775l) r8
            java.lang.String r9 = r8.f59847b
            if (r9 == 0) goto Laa
            int r9 = r9.length()
            if (r9 != 0) goto Lc2
            goto Laa
        Lc2:
            java.lang.String r8 = r8.f59846a
            if (r8 == 0) goto Laa
            int r8 = r8.length()
            if (r8 != 0) goto Lcd
            goto Laa
        Lcd:
            r6.add(r7)
            goto Laa
        Ld1:
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto Ld8
            goto Ld9
        Ld8:
            r6 = 0
        Ld9:
            if (r6 == 0) goto L15d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "links_agreement_"
            r4.append(r7)
            r4.append(r3)
            java.lang.String r10 = r4.toString()
            com.sumsub.sns.internal.core.presentation.form.model.Q r3 = new com.sumsub.sns.internal.core.presentation.form.model.Q
            com.sumsub.sns.internal.features.data.model.common.remote.response.F r11 = new com.sumsub.sns.internal.features.data.model.common.remote.response.F
            r20 = 0
            r21 = 1022(0x3fe, float:1.432E-42)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3.<init>(r11, r10)
            r0.add(r3)
            int r3 = r6.size()
            r4 = r2
        L10e:
            if (r4 >= r3) goto L15d
            java.lang.Object r7 = r6.get(r4)
            int r4 = r4 + 1
            com.sumsub.sns.internal.features.data.model.esign.l r7 = (com.sumsub.sns.internal.features.data.model.esign.C29775l) r7
            com.sumsub.sns.internal.core.presentation.form.model.Z r8 = new com.sumsub.sns.internal.core.presentation.form.model.Z
            com.sumsub.sns.internal.features.data.model.common.remote.response.F r9 = new com.sumsub.sns.internal.features.data.model.common.remote.response.F
            java.lang.String r11 = r7.f59847b
            java.lang.String r7 = r7.f59846a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "- ["
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = "]("
            r12.append(r11)
            r12.append(r7)
            java.lang.String r7 = ")"
            r12.append(r7)
            java.lang.String r14 = r12.toString()
            r20 = 0
            r21 = 1018(0x3fa, float:1.427E-42)
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r11 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r16 = 184(0xb8, float:2.58E-43)
            r11 = 0
            r12 = 0
            r14 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.add(r8)
            goto L10e
        L15d:
            r3 = r5
            goto L16
        L160:
            return
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m70540a(com.sumsub.sns.internal.features.presentation.esign.C30997n0 r11) {
            com.sumsub.sns.internal.features.data.model.esign.Y r0 = r11.f62653m
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L12
            java.util.List r0 = r0.f59828d
            if (r0 == 0) goto L12
            boolean r0 = r0.isEmpty()
            if (r0 != r2) goto L12
            r0 = r2
            goto L13
        L12:
            r0 = r1
        L13:
            com.sumsub.sns.internal.features.data.model.esign.Y r3 = r11.f62653m
            if (r3 == 0) goto L89
            java.util.List r3 = r3.f59828d
            if (r3 == 0) goto L89
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L22
            goto L87
        L22:
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L87
            java.lang.Object r4 = r3.next()
            com.sumsub.sns.internal.features.data.model.esign.U r4 = (com.sumsub.sns.internal.features.data.model.esign.C29748U) r4
            java.util.List r5 = r4.f59822e
            if (r5 == 0) goto L89
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L3d
            goto L26
        L3d:
            java.util.Iterator r5 = r5.iterator()
        L41:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L26
            java.lang.Object r6 = r5.next()
            com.sumsub.sns.internal.features.data.model.esign.f r6 = (com.sumsub.sns.internal.features.data.model.esign.C29763f) r6
            java.util.LinkedHashMap r7 = r11.f62657q
            java.lang.String r8 = r4.f59818a
            if (r8 != 0) goto L55
            java.lang.String r8 = ""
        L55:
            java.lang.Object r7 = r7.get(r8)
            com.sumsub.sns.internal.features.data.model.esign.A r7 = (com.sumsub.sns.internal.features.data.model.esign.C29729A) r7
            if (r7 == 0) goto L89
            java.util.List r7 = r7.f59799b
            if (r7 == 0) goto L89
            java.util.Iterator r7 = r7.iterator()
        L65:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7d
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.sumsub.sns.internal.features.data.model.esign.w r9 = (com.sumsub.sns.internal.features.data.model.esign.C29787w) r9
            java.lang.String r9 = r9.f59858a
            java.lang.String r10 = r6.f59836a
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L65
            goto L7e
        L7d:
            r8 = 0
        L7e:
            com.sumsub.sns.internal.features.data.model.esign.w r8 = (com.sumsub.sns.internal.features.data.model.esign.C29787w) r8
            if (r8 == 0) goto L89
            boolean r6 = r8.f59859b
            if (r6 != r2) goto L89
            goto L41
        L87:
            r11 = r2
            goto L8a
        L89:
            r11 = r1
        L8a:
            if (r0 != 0) goto L90
            if (r11 == 0) goto L8f
            goto L90
        L8f:
            return r1
        L90:
            return r2
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70541a(com.sumsub.sns.internal.features.data.model.esign.C29752Y r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
            r6 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.features.presentation.esign.C30946A
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.features.presentation.esign.A r0 = (com.sumsub.sns.internal.features.presentation.esign.C30946A) r0
            int r1 = r0.f62511f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62511f = r1
            goto L18
        L13:
            com.sumsub.sns.internal.features.presentation.esign.A r0 = new com.sumsub.sns.internal.features.presentation.esign.A
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f62509d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f62511f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            int r7 = r0.f62508c
            java.lang.String r1 = r0.f62507b
            java.util.List r0 = r0.f62506a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L78
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            int r7 = r0.f62508c
            java.util.List r2 = r0.f62506a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L61
        L42:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            m70539a(r8, r7)
            r0.f62506a = r8
            r7 = 0
            r0.f62508c = r7
            r0.f62511f = r4
            java.lang.String r2 = "sns_esign_agreement_title"
            java.lang.Object r2 = r6.getString(r2, r0)
            if (r2 != r1) goto L5e
            goto L74
        L5e:
            r5 = r2
            r2 = r8
            r8 = r5
        L61:
            java.lang.String r8 = (java.lang.String) r8
            r0.f62506a = r2
            r0.f62507b = r8
            r0.f62508c = r7
            r0.f62511f = r3
            java.lang.String r3 = "sns_esign_agreement_subtitle"
            java.lang.Object r0 = r6.getString(r3, r0)
            if (r0 != r1) goto L75
        L74:
            return r1
        L75:
            r1 = r8
            r8 = r0
            r0 = r2
        L78:
            java.lang.String r8 = (java.lang.String) r8
            com.sumsub.sns.internal.core.presentation.form.h r2 = new com.sumsub.sns.internal.core.presentation.form.h
            r2.<init>(r7, r1, r8, r0)
            return r2
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70542a(com.sumsub.sns.internal.features.data.model.esign.C29779o r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof com.sumsub.sns.internal.features.presentation.esign.C30948C
            if (r2 == 0) goto L17
            r2 = r1
            com.sumsub.sns.internal.features.presentation.esign.C r2 = (com.sumsub.sns.internal.features.presentation.esign.C30948C) r2
            int r3 = r2.f62523f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f62523f = r3
            goto L1c
        L17:
            com.sumsub.sns.internal.features.presentation.esign.C r2 = new com.sumsub.sns.internal.features.presentation.esign.C
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f62521d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f62523f
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L48
            if (r4 == r6) goto L3f
            if (r4 != r5) goto L37
            int r3 = r2.f62520c
            java.lang.String r4 = r2.f62519b
            java.util.List r2 = r2.f62518a
            kotlin.ResultKt.throwOnFailure(r1)
            goto Lf3
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3f:
            int r4 = r2.f62520c
            java.util.List r6 = r2.f62518a
            kotlin.ResultKt.throwOnFailure(r1)
            goto Lda
        L48:
            kotlin.ResultKt.throwOnFailure(r1)
            com.sumsub.sns.internal.features.domain.appdata.b r7 = new com.sumsub.sns.internal.features.domain.appdata.b
            r11 = 0
            r12 = 63
            r8 = 0
            r9 = 0
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r1 = r19
            java.util.List r1 = r1.f59850a
            r4 = 0
            if (r1 == 0) goto L73
            java.util.Map r8 = r0.m70557f()
            r9 = 0
            java.util.LinkedHashMap r8 = com.sumsub.sns.internal.features.presentation.utils.AbstractC32651f.m71274a(r1, r8, r9, r7)
            com.sumsub.sns.internal.core.presentation.screen.base.t r9 = r0.f62651k
            kotlin.reflect.KProperty[] r10 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r10 = r10[r4]
            androidx.lifecycle.SavedStateHandle r10 = r9.f58834a
            java.lang.String r9 = r9.f58835b
            r10.set(r9, r8)
        L73:
            if (r1 == 0) goto Lc5
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r9)
            r8.<init>(r9)
            java.util.Iterator r1 = r1.iterator()
        L84:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto Lc3
            java.lang.Object r9 = r1.next()
            com.sumsub.sns.internal.features.data.model.common.y r9 = (com.sumsub.sns.internal.features.data.model.common.C29719y) r9
            r10 = r7
            r7 = r9
            com.sumsub.sns.internal.features.data.model.common.h r9 = r0.getConfig()
            com.sumsub.sns.internal.features.data.repository.dynamic.l r11 = r0.getStrings()
            java.util.Map r14 = r0.m70557f()
            com.sumsub.sns.internal.core.presentation.screen.base.t r12 = r0.f62652l
            kotlin.reflect.KProperty[] r13 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r13 = r13[r6]
            java.lang.Object r12 = r12.m69705a()
            r15 = r12
            java.util.Map r15 = (java.util.Map) r15
            com.sumsub.sns.internal.features.presentation.esign.u0 r12 = new com.sumsub.sns.internal.features.presentation.esign.u0
            r12.<init>(r0)
            r13 = 0
            r16 = 224(0xe0, float:3.14E-43)
            r17 = r8
            r8 = 0
            r5 = r17
            com.sumsub.sns.internal.core.presentation.form.model.e0 r7 = com.sumsub.sns.internal.features.presentation.utils.AbstractC32651f.m71268a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5.add(r7)
            r8 = r5
            r7 = r10
            r5 = 2
            goto L84
        Lc3:
            r5 = r8
            goto Lc9
        Lc5:
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
        Lc9:
            r2.f62518a = r8
            r2.f62520c = r4
            r2.f62523f = r6
            java.lang.String r1 = "sns_esign_provided_data_title"
            java.lang.Object r1 = r0.getString(r1, r2)
            if (r1 != r3) goto Ld9
            goto Lee
        Ld9:
            r6 = r8
        Lda:
            java.lang.String r1 = (java.lang.String) r1
            r2.f62518a = r6
            r2.f62519b = r1
            r2.f62520c = r4
            r5 = 2
            r2.f62523f = r5
            java.lang.String r5 = "sns_esign_provided_data_subtitle"
            java.lang.Object r2 = r0.getString(r5, r2)
            if (r2 != r3) goto Lef
        Lee:
            return r3
        Lef:
            r3 = r4
            r4 = r1
            r1 = r2
            r2 = r6
        Lf3:
            java.lang.String r1 = (java.lang.String) r1
            com.sumsub.sns.internal.core.presentation.form.h r5 = new com.sumsub.sns.internal.core.presentation.form.h
            r5.<init>(r3, r4, r1, r2)
            return r5
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70543a(java.lang.String r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r2 instanceof com.sumsub.sns.internal.features.presentation.esign.C30949D
            if (r3 == 0) goto L19
            r3 = r2
            com.sumsub.sns.internal.features.presentation.esign.D r3 = (com.sumsub.sns.internal.features.presentation.esign.C30949D) r3
            int r4 = r3.f62527d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f62527d = r4
            goto L1e
        L19:
            com.sumsub.sns.internal.features.presentation.esign.D r3 = new com.sumsub.sns.internal.features.presentation.esign.D
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f62525b
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.f62527d
            java.lang.String r6 = "SNSESignViewModel"
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L43
            if (r5 != r7) goto L3b
            java.lang.String r1 = r3.f62524a
            kotlin.ResultKt.throwOnFailure(r2)
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.m103853unboximpl()
            goto Lc4
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L43:
            kotlin.ResultKt.throwOnFailure(r2)
            com.sumsub.sns.internal.log.a r2 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r2 = r2.f67810a
            java.lang.String r5 = "confirmOtp"
            r2.mo68955d(r6, r5, r8)
            com.sumsub.sns.internal.features.domain.esign.b r2 = r0.f62648h
            com.sumsub.sns.internal.features.data.repository.applicant.d r5 = r0.f62642b
            com.sumsub.sns.internal.features.data.model.esign.D r9 = new com.sumsub.sns.internal.features.data.model.esign.D
            r9.<init>(r1)
            java.util.LinkedHashMap r10 = r0.f62657q
            java.util.Collection r10 = r10.values()
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r13 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r10, r12)
            r11.<init>(r13)
            java.util.Iterator r10 = r10.iterator()
        L6d:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto Lb3
            java.lang.Object r13 = r10.next()
            com.sumsub.sns.internal.features.data.model.esign.A r13 = (com.sumsub.sns.internal.features.data.model.esign.C29729A) r13
            java.lang.String r14 = r13.f59798a
            java.util.List r13 = r13.f59799b
            java.util.ArrayList r15 = new java.util.ArrayList
            int r8 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r13, r12)
            r15.<init>(r8)
            java.util.Iterator r8 = r13.iterator()
        L8a:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto La6
            java.lang.Object r13 = r8.next()
            com.sumsub.sns.internal.features.data.model.esign.w r13 = (com.sumsub.sns.internal.features.data.model.esign.C29787w) r13
            com.sumsub.sns.internal.features.data.model.esign.w r12 = new com.sumsub.sns.internal.features.data.model.esign.w
            java.lang.String r7 = r13.f59858a
            boolean r13 = r13.f59859b
            r12.<init>(r7, r13)
            r15.add(r12)
            r7 = 1
            r12 = 10
            goto L8a
        La6:
            com.sumsub.sns.internal.features.data.model.esign.A r7 = new com.sumsub.sns.internal.features.data.model.esign.A
            r7.<init>(r14, r15)
            r11.add(r7)
            r7 = 1
            r8 = 0
            r12 = 10
            goto L6d
        Lb3:
            com.sumsub.sns.internal.features.data.model.esign.E r7 = new com.sumsub.sns.internal.features.data.model.esign.E
            r7.<init>(r9, r11)
            r3.f62524a = r1
            r8 = 1
            r3.f62527d = r8
            java.lang.Object r2 = r2.m70126a(r5, r7, r3)
            if (r2 != r4) goto Lc4
            return r4
        Lc4:
            boolean r3 = kotlin.Result.m103851isSuccessimpl(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "confirmOtp: success="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.sumsub.sns.internal.log.a r4 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r4 = r4.f67810a
            r5 = 0
            r4.mo68955d(r6, r3, r5)
            boolean r3 = kotlin.Result.m103851isSuccessimpl(r2)
            if (r3 == 0) goto Led
            r3 = r2
            com.sumsub.sns.internal.features.data.model.esign.Y r3 = (com.sumsub.sns.internal.features.data.model.esign.C29752Y) r3
            r0.m70549a(r3)
        Led:
            java.lang.Throwable r2 = kotlin.Result.m103847exceptionOrNullimpl(r2)
            if (r2 == 0) goto L110
            java.lang.String r3 = r0.getIdDocSetType()
            com.sumsub.sns.internal.features.presentation.esign.l r4 = new com.sumsub.sns.internal.features.presentation.esign.l
            r4.<init>(r1)
            r0.throwError(r2, r3, r4)
            kotlinx.coroutines.m0 r5 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
            com.sumsub.sns.internal.features.presentation.esign.J r8 = new com.sumsub.sns.internal.features.presentation.esign.J
            r1 = 0
            r8.<init>(r0, r1)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.C41686h.m91046d(r5, r6, r7, r8, r9, r10)
        L110:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70544a(java.util.ArrayList r30, com.sumsub.sns.internal.features.data.model.esign.C29752Y r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
            r29 = this;
            r0 = r29
            r1 = r32
            boolean r2 = r1 instanceof com.sumsub.sns.internal.features.presentation.esign.C31016z
            if (r2 == 0) goto L17
            r2 = r1
            com.sumsub.sns.internal.features.presentation.esign.z r2 = (com.sumsub.sns.internal.features.presentation.esign.C31016z) r2
            int r3 = r2.f62696m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f62696m = r3
            goto L1c
        L17:
            com.sumsub.sns.internal.features.presentation.esign.z r2 = new com.sumsub.sns.internal.features.presentation.esign.z
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f62694k
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f62696m
            r5 = 10
            r6 = 1
            if (r4 == 0) goto L5b
            if (r4 != r6) goto L53
            java.lang.String r4 = r2.f62693j
            java.util.Collection r8 = r2.f62692i
            com.sumsub.sns.internal.features.data.model.esign.f r9 = r2.f62691h
            java.util.Iterator r10 = r2.f62690g
            java.util.Collection r11 = r2.f62689f
            java.lang.String r12 = r2.f62688e
            java.lang.String r13 = r2.f62687d
            com.sumsub.sns.internal.features.data.model.esign.U r14 = r2.f62686c
            java.util.Iterator r15 = r2.f62685b
            java.util.List r7 = r2.f62684a
            kotlin.ResultKt.throwOnFailure(r1)
            r16 = r11
            r18 = r13
            r13 = r8
        L47:
            r17 = r12
            r19 = r14
            r20 = r15
            r14 = r9
            r15 = r10
            r9 = r4
            r4 = r7
            goto L141
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L5b:
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r31
            java.util.List r1 = r1.f59828d
            if (r1 == 0) goto L22d
            java.util.Iterator r1 = r1.iterator()
            r4 = r2
            r2 = r1
            r1 = r30
        L6c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L22d
            java.lang.Object r7 = r2.next()
            com.sumsub.sns.internal.features.data.model.esign.U r7 = (com.sumsub.sns.internal.features.data.model.esign.C29748U) r7
            java.lang.Integer r8 = r7.f59819b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "esign_doc_section_"
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = r7.f59820c
            if (r9 == 0) goto L9b
            r13 = 4
            r14 = 0
            java.lang.String r10 = ".pdf"
            java.lang.String r11 = ""
            r12 = 0
            java.lang.String r9 = kotlin.text.StringsKt.replace$default(r9, r10, r11, r12, r13, r14)
            goto L9c
        L9b:
            r9 = 0
        L9c:
            com.sumsub.sns.internal.core.presentation.form.model.Q r10 = new com.sumsub.sns.internal.core.presentation.form.model.Q
            com.sumsub.sns.internal.features.data.model.common.remote.response.F r11 = new com.sumsub.sns.internal.features.data.model.common.remote.response.F
            r20 = 0
            r21 = 1020(0x3fc, float:1.43E-42)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r10.<init>(r11, r8)
            r1.add(r10)
            java.util.List r10 = r7.f59822e
            if (r10 == 0) goto L194
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r10, r5)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
            r15 = r2
            r2 = r4
            r14 = r7
            r13 = r8
            r12 = r9
            r8 = r11
            r7 = r1
        Ld1:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L188
            java.lang.Object r1 = r10.next()
            r9 = r1
            com.sumsub.sns.internal.features.data.model.esign.f r9 = (com.sumsub.sns.internal.features.data.model.esign.C29763f) r9
            java.util.List r1 = r9.f59840e
            if (r1 == 0) goto L162
            java.util.ArrayList r4 = new java.util.ArrayList
            int r11 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r5)
            r4.<init>(r11)
            java.util.Iterator r1 = r1.iterator()
        Lef:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L101
            java.lang.Object r11 = r1.next()
            com.sumsub.sns.internal.features.data.model.esign.K r11 = (com.sumsub.sns.internal.features.data.model.esign.C29739K) r11
            java.lang.Integer r11 = r11.f59810b
            r4.add(r11)
            goto Lef
        L101:
            r23 = 62
            r24 = 0
            java.lang.String r17 = ", "
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r16 = r4
            java.lang.String r4 = kotlin.collections.CollectionsKt.joinToString$default(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            if (r4 == 0) goto L162
            r2.f62684a = r7
            r2.f62685b = r15
            r2.f62686c = r14
            r2.f62687d = r13
            r2.f62688e = r12
            r2.f62689f = r8
            r2.f62690g = r10
            r2.f62691h = r9
            r2.f62692i = r8
            r2.f62693j = r4
            r2.f62696m = r6
            java.lang.String r1 = "sns_esign_documents_pages"
            java.lang.Object r1 = r0.getString(r1, r2)
            if (r1 != r3) goto L139
            return r3
        L139:
            r16 = r8
            r18 = r13
            r13 = r16
            goto L47
        L141:
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L154
            r11 = 4
            r12 = 0
            java.lang.String r8 = "{pages}"
            r10 = 0
            java.lang.String r1 = kotlin.text.StringsKt.replace$default(r7, r8, r9, r10, r11, r12)
            if (r1 != 0) goto L153
            goto L154
        L153:
            r9 = r1
        L154:
            r7 = r4
            r1 = r9
            r8 = r13
            r9 = r14
            r10 = r15
            r12 = r17
            r13 = r18
            r14 = r19
            r15 = r20
            goto L165
        L162:
            r16 = r8
            r1 = 0
        L165:
            java.lang.String r4 = r9.f59837b
            java.lang.String r9 = r9.f59836a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r6 = "sns_agr_"
            r11.append(r6)
            r11.append(r9)
            java.lang.String r6 = r11.toString()
            com.sumsub.sns.internal.features.data.model.common.remote.response.N r9 = new com.sumsub.sns.internal.features.data.model.common.remote.response.N
            r9.<init>(r6, r4, r1)
            r8.add(r9)
            r8 = r16
            r6 = 1
            goto Ld1
        L188:
            java.util.List r8 = (java.util.List) r8
            r4 = r2
            r1 = r7
            r27 = r8
            r20 = r12
            r10 = r13
            r7 = r14
            r2 = r15
            goto L199
        L194:
            r10 = r8
            r20 = r9
            r27 = 0
        L199:
            java.lang.String r6 = r7.f59818a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "sns_doc_"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r19 = r8.toString()
            com.sumsub.sns.internal.features.data.model.common.remote.response.F r18 = new com.sumsub.sns.internal.features.data.model.common.remote.response.F
            r26 = 0
            r28 = 764(0x2fc, float:1.07E-42)
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            com.sumsub.sns.internal.core.presentation.form.model.M r8 = new com.sumsub.sns.internal.core.presentation.form.model.M
            java.util.List r11 = kotlin.collections.CollectionsKt.emptyList()
            com.sumsub.sns.core.data.listener.SNSIconHandler$SNSCommonIcons r6 = com.sumsub.sns.core.data.listener.SNSIconHandler.SNSCommonIcons.ICON_LAUNCH
            java.lang.String r12 = r6.getImageName()
            r13 = 24
            r9 = r18
            r8.<init>(r9, r10, r11, r12, r13)
            r1.add(r8)
            java.util.List r6 = r7.f59822e
            java.lang.String r8 = ""
            if (r6 == 0) goto L216
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r5)
            r9.<init>(r10)
            java.util.Iterator r6 = r6.iterator()
        L1e9:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L21a
            java.lang.Object r10 = r6.next()
            com.sumsub.sns.internal.features.data.model.esign.f r10 = (com.sumsub.sns.internal.features.data.model.esign.C29763f) r10
            com.sumsub.sns.internal.features.data.model.esign.w r11 = new com.sumsub.sns.internal.features.data.model.esign.w
            java.lang.String r12 = r10.f59836a
            if (r12 != 0) goto L1fc
            r12 = r8
        L1fc:
            com.sumsub.sns.internal.core.presentation.screen.base.t r13 = r0.f62656p
            kotlin.reflect.KProperty[] r14 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r15 = 4
            r14 = r14[r15]
            java.lang.Object r13 = r13.m69705a()
            java.util.Set r13 = (java.util.Set) r13
            java.lang.String r10 = r10.f59836a
            boolean r10 = kotlin.collections.CollectionsKt.contains(r13, r10)
            r11.<init>(r12, r10)
            r9.add(r11)
            goto L1e9
        L216:
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
        L21a:
            java.lang.String r6 = r7.f59818a
            if (r6 != 0) goto L21f
            goto L220
        L21f:
            r8 = r6
        L220:
            com.sumsub.sns.internal.features.data.model.esign.A r6 = new com.sumsub.sns.internal.features.data.model.esign.A
            r6.<init>(r8, r9)
            java.util.LinkedHashMap r7 = r0.f62657q
            r7.put(r8, r6)
            r6 = 1
            goto L6c
        L22d:
            com.sumsub.sns.internal.features.presentation.esign.m0 r1 = new com.sumsub.sns.internal.features.presentation.esign.m0
            r2 = 0
            r1.<init>(r0, r2)
            r3 = 0
            r4 = 1
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r0, r3, r1, r4, r2)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70545a(kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
            r13 = this;
            boolean r0 = r14 instanceof com.sumsub.sns.internal.features.presentation.esign.C30950E
            if (r0 == 0) goto L13
            r0 = r14
            com.sumsub.sns.internal.features.presentation.esign.E r0 = (com.sumsub.sns.internal.features.presentation.esign.C30950E) r0
            int r1 = r0.f62532e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62532e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.features.presentation.esign.E r0 = new com.sumsub.sns.internal.features.presentation.esign.E
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f62530c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f62532e
            java.lang.String r3 = "SNSESignViewModel"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r0 = r0.f62528a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L8f
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L39:
            kotlin.ResultKt.throwOnFailure(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.m103853unboximpl()
            goto L5c
        L43:
            kotlin.ResultKt.throwOnFailure(r14)
            com.sumsub.sns.internal.log.a r14 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r14 = r14.f67810a
            java.lang.String r2 = "loading ..."
            r14.mo68955d(r3, r2, r6)
            com.sumsub.sns.internal.features.domain.esign.g r14 = r13.f62644d
            com.sumsub.sns.internal.features.data.repository.applicant.d r2 = r13.f62642b
            r0.f62532e = r5
            java.lang.Object r14 = r14.m70128a(r2, r0)
            if (r14 != r1) goto L5c
            goto L8d
        L5c:
            boolean r2 = kotlin.Result.m103851isSuccessimpl(r14)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "init esign: ok="
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            com.sumsub.sns.internal.log.a r7 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r7 = r7.f67810a
            r7.mo68955d(r3, r2, r6)
            boolean r2 = kotlin.Result.m103851isSuccessimpl(r14)
            if (r2 == 0) goto L8e
            r2 = r14
            com.sumsub.sns.internal.features.data.model.esign.Y r2 = (com.sumsub.sns.internal.features.data.model.esign.C29752Y) r2
            r0.f62528a = r14
            r0.f62529b = r14
            r0.f62532e = r4
            java.lang.Object r0 = r13.m70555d(r2, r0)
            if (r0 != r1) goto L8e
        L8d:
            return r1
        L8e:
            r0 = r14
        L8f:
            java.lang.Throwable r14 = kotlin.Result.m103847exceptionOrNullimpl(r0)
            if (r14 == 0) goto Lb9
            java.lang.Throwable r14 = kotlin.Result.m103847exceptionOrNullimpl(r0)
            com.sumsub.sns.internal.features.presentation.esign.Q r0 = new com.sumsub.sns.internal.features.presentation.esign.Q
            r0.<init>(r6)
            r1 = 0
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r13, r1, r0, r5, r6)
            if (r14 != 0) goto Lb0
            com.sumsub.sns.core.data.model.SNSGeneralException r7 = new com.sumsub.sns.core.data.model.SNSGeneralException
            r11 = 6
            r12 = 0
            java.lang.String r8 = "Init failure"
            r9 = 0
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r14 = r7
        Lb0:
            java.lang.String r0 = r13.getIdDocSetType()
            com.sumsub.sns.internal.features.presentation.esign.r r1 = com.sumsub.sns.internal.features.presentation.esign.C31004r.f62665a
            r13.throwError(r14, r0, r1)
        Lb9:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70546a(boolean r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
            r10 = this;
            boolean r0 = r12 instanceof com.sumsub.sns.internal.features.presentation.esign.C30991k0
            if (r0 == 0) goto L13
            r0 = r12
            com.sumsub.sns.internal.features.presentation.esign.k0 r0 = (com.sumsub.sns.internal.features.presentation.esign.C30991k0) r0
            int r1 = r0.f62628f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62628f = r1
            goto L18
        L13:
            com.sumsub.sns.internal.features.presentation.esign.k0 r0 = new com.sumsub.sns.internal.features.presentation.esign.k0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f62626d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f62628f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r11 = r0.f62624b
            kotlin.ResultKt.throwOnFailure(r12)
            goto Lab
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            boolean r11 = r0.f62623a
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.m103853unboximpl()
        L43:
            r9 = r12
            r12 = r11
            r11 = r9
            goto L59
        L47:
            kotlin.ResultKt.throwOnFailure(r12)
            com.sumsub.sns.internal.features.domain.esign.k r12 = r10.f62646f
            com.sumsub.sns.internal.features.data.repository.applicant.d r2 = r10.f62642b
            r0.f62623a = r11
            r0.f62628f = r5
            java.lang.Object r12 = r12.m70130a(r2, r0)
            if (r12 != r1) goto L43
            goto Laa
        L59:
            boolean r2 = kotlin.Result.m103851isSuccessimpl(r11)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "requestOtp: ok="
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.sumsub.sns.internal.log.a r6 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r6 = r6.f67810a
            java.lang.String r7 = "SNSESignViewModel"
            r6.mo68955d(r7, r2, r3)
            boolean r2 = kotlin.Result.m103851isSuccessimpl(r11)
            if (r2 == 0) goto Lab
            r2 = r11
            com.sumsub.sns.internal.features.data.model.esign.Y r2 = (com.sumsub.sns.internal.features.data.model.esign.C29752Y) r2
            r10.f62653m = r2
            long r6 = java.lang.System.currentTimeMillis()
            com.sumsub.sns.internal.core.presentation.screen.base.t r2 = r10.f62654n
            kotlin.reflect.KProperty[] r8 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r8 = r8[r4]
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            androidx.lifecycle.SavedStateHandle r7 = r2.f58834a
            java.lang.String r2 = r2.f58835b
            r7.set(r2, r6)
            if (r12 == 0) goto L9e
            r10.m70558g()
            goto Lab
        L9e:
            r0.f62624b = r11
            r0.f62625c = r11
            r0.f62628f = r4
            java.lang.Object r12 = r10.m70553b(r0)
            if (r12 != r1) goto Lab
        Laa:
            return r1
        Lab:
            java.lang.Throwable r11 = kotlin.Result.m103847exceptionOrNullimpl(r11)
            if (r11 == 0) goto Lc3
            com.sumsub.sns.internal.features.presentation.esign.W r12 = new com.sumsub.sns.internal.features.presentation.esign.W
            r12.<init>(r3)
            r0 = 0
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r10, r0, r12, r5, r3)
            java.lang.String r12 = r10.getIdDocSetType()
            com.sumsub.sns.internal.features.presentation.esign.w r0 = com.sumsub.sns.internal.features.presentation.esign.C31013w.f62677a
            r10.throwError(r11, r12, r0)
        Lc3:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69616a() {
            r4 = this;
            com.sumsub.sns.internal.core.presentation.screen.base.t r0 = r4.f62658r
            kotlin.reflect.KProperty[] r1 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r2 = 5
            r1 = r1[r2]
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            androidx.lifecycle.SavedStateHandle r2 = r0.f58834a
            java.lang.String r0 = r0.f58835b
            r2.set(r0, r1)
            com.sumsub.sns.internal.features.presentation.esign.f0 r0 = new com.sumsub.sns.internal.features.presentation.esign.f0
            r1 = 0
            r0.<init>(r1)
            r2 = 0
            r3 = 1
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r4, r2, r0, r3, r1)
            return
    }

    /* JADX INFO: renamed from: a */
    public final void m70547a(int r5, java.io.File r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleFileDownloadSuccess: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " to "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.sumsub.sns.internal.log.a r1 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r1 = r1.f67810a
            java.lang.String r2 = "SNSESignViewModel"
            r3 = 0
            r1.mo68955d(r2, r0, r3)
            com.sumsub.sns.core.presentation.base.s r0 = r4.currentState()
            com.sumsub.sns.internal.features.presentation.esign.x r0 = (com.sumsub.sns.internal.features.presentation.esign.C31014x) r0
            com.sumsub.sns.internal.features.presentation.esign.p r0 = r0.f62678a
            boolean r1 = r0 instanceof com.sumsub.sns.internal.features.presentation.esign.C30998o
            if (r1 != 0) goto L30
            goto L80
        L30:
            com.sumsub.sns.internal.features.presentation.esign.o r0 = (com.sumsub.sns.internal.features.presentation.esign.C30998o) r0
            com.sumsub.sns.internal.features.presentation.esign.n r0 = r0.f62660b
            if (r0 == 0) goto L80
            boolean r0 = r0.f62638c
            r1 = 1
            if (r0 != r1) goto L80
            com.sumsub.sns.internal.features.presentation.esign.P r0 = new com.sumsub.sns.internal.features.presentation.esign.P
            r0.<init>(r3)
            r2 = 0
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r4, r2, r0, r1, r3)
            if (r6 != 0) goto L47
            goto L80
        L47:
            com.sumsub.sns.internal.features.data.model.esign.Y r0 = r4.f62653m
            if (r0 == 0) goto L74
            java.util.List r0 = r0.f59828d
            if (r0 == 0) goto L74
            java.util.Iterator r0 = r0.iterator()
        L53:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.sumsub.sns.internal.features.data.model.esign.U r2 = (com.sumsub.sns.internal.features.data.model.esign.C29748U) r2
            java.lang.Integer r2 = r2.f59819b
            if (r2 != 0) goto L65
            goto L53
        L65:
            int r2 = r2.intValue()
            if (r2 != r5) goto L53
            r3 = r1
        L6c:
            com.sumsub.sns.internal.features.data.model.esign.U r3 = (com.sumsub.sns.internal.features.data.model.esign.C29748U) r3
            if (r3 == 0) goto L74
            java.lang.String r5 = r3.f59820c
            if (r5 != 0) goto L78
        L74:
            java.lang.String r5 = r6.getName()
        L78:
            com.sumsub.sns.internal.features.presentation.esign.t r0 = new com.sumsub.sns.internal.features.presentation.esign.t
            r0.<init>(r6, r5)
            r4.fireEvent(r0)
        L80:
            return
    }

    /* JADX INFO: renamed from: a */
    public final void m70548a(int r3, java.lang.Throwable r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleFileDownloadFailed: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.sumsub.sns.internal.log.a r0 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r0 = r0.f67810a
            java.lang.String r1 = "SNSESignViewModel"
            r0.mo68955d(r1, r3, r4)
            com.sumsub.sns.internal.features.presentation.esign.O r3 = new com.sumsub.sns.internal.features.presentation.esign.O
            r4 = 0
            r3.<init>(r2, r4)
            r0 = 0
            r1 = 1
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r2, r0, r3, r1, r4)
            return
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69617a(com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0 r15) {
            r14 = this;
            com.sumsub.sns.core.presentation.base.s r0 = r14.currentState()
            com.sumsub.sns.internal.features.presentation.esign.x r0 = (com.sumsub.sns.internal.features.presentation.esign.C31014x) r0
            com.sumsub.sns.internal.features.presentation.esign.p r0 = r0.f62678a
            boolean r0 = r0 instanceof com.sumsub.sns.internal.features.presentation.esign.C30994m
            if (r0 != 0) goto Lc7
            boolean r0 = r15 instanceof com.sumsub.sns.internal.core.presentation.form.model.C28819M
            if (r0 != 0) goto L12
            goto Lc7
        L12:
            com.sumsub.sns.internal.core.presentation.form.model.M r15 = (com.sumsub.sns.internal.core.presentation.form.model.C28819M) r15
            com.sumsub.sns.internal.features.data.model.common.remote.response.F r15 = r15.f58608d
            java.lang.String r15 = r15.f59466a
            if (r15 != 0) goto L1c
            java.lang.String r15 = ""
        L1c:
            r0 = r15
            java.lang.String r15 = "sns_doc_"
            r1 = 2
            r6 = 0
            r7 = 0
            boolean r15 = kotlin.text.StringsKt.startsWith$default(r0, r15, r6, r1, r7)
            if (r15 != 0) goto L2b
            goto Lc7
        L2b:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "sns_doc_"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.String r15 = kotlin.text.StringsKt.replace$default(r0, r1, r2, r3, r4, r5)
            int r0 = r15.length()
            if (r0 != 0) goto L3f
            goto Lc7
        L3f:
            com.sumsub.sns.internal.features.data.model.esign.Y r0 = r14.f62653m
            if (r0 == 0) goto L65
            java.util.List r0 = r0.f59828d
            if (r0 == 0) goto L65
            java.util.Iterator r0 = r0.iterator()
        L4b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.sumsub.sns.internal.features.data.model.esign.U r2 = (com.sumsub.sns.internal.features.data.model.esign.C29748U) r2
            java.lang.String r2 = r2.f59818a
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r15)
            if (r2 == 0) goto L4b
            goto L62
        L61:
            r1 = r7
        L62:
            com.sumsub.sns.internal.features.data.model.esign.U r1 = (com.sumsub.sns.internal.features.data.model.esign.C29748U) r1
            goto L66
        L65:
            r1 = r7
        L66:
            com.sumsub.sns.internal.core.analytics.f r8 = new com.sumsub.sns.internal.core.analytics.f
            com.sumsub.sns.internal.core.analytics.Screen r0 = r14.m70556e()
            java.lang.String r2 = r14.getIdDocSetType()
            java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
            r8.<init>(r0, r2, r3)
            com.sumsub.sns.internal.core.analytics.Screen r9 = r14.m70556e()
            java.lang.String r10 = r14.getIdDocSetType()
            com.sumsub.sns.internal.core.analytics.Control r11 = com.sumsub.sns.internal.core.analytics.Control.ListItem
            if (r1 == 0) goto L89
            java.lang.String r0 = r1.f59820c
            if (r0 != 0) goto L88
            goto L89
        L88:
            r15 = r0
        L89:
            java.lang.String r0 = "docName"
            kotlin.Pair r15 = kotlin.TuplesKt.m90091to(r0, r15)
            java.util.Map r12 = kotlin.collections.MapsKt.mapOf(r15)
            r13 = 16
            com.sumsub.sns.internal.core.analytics.C28367f.m69257a(r8, r9, r10, r11, r12, r13)
            if (r1 == 0) goto Lc7
            java.lang.Integer r15 = r1.f59819b
            if (r15 == 0) goto Lc7
            int r15 = r15.intValue()
            kotlinx.coroutines.x1 r0 = r14.f62659s
            r1 = 1
            if (r0 == 0) goto Laa
            kotlinx.coroutines.InterfaceC41775x1.a.m91377a(r0, r7, r1, r7)
        Laa:
            r14.f62659s = r7
            com.sumsub.sns.internal.features.presentation.esign.d0 r0 = new com.sumsub.sns.internal.features.presentation.esign.d0
            r0.<init>(r14, r7)
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r14, r6, r0, r1, r7)
            kotlinx.coroutines.m0 r8 = androidx.lifecycle.ViewModelKt.getViewModelScope(r14)
            com.sumsub.sns.internal.features.presentation.esign.e0 r11 = new com.sumsub.sns.internal.features.presentation.esign.e0
            r11.<init>(r15, r14, r7)
            r12 = 3
            r13 = 0
            r9 = 0
            r10 = 0
            kotlinx.coroutines.x1 r15 = kotlinx.coroutines.C41686h.m91046d(r8, r9, r10, r11, r12, r13)
            r14.f62659s = r15
        Lc7:
            return
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69618a(com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0 r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69619a(com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0 r12, java.util.List r13) {
            r11 = this;
            com.sumsub.sns.core.presentation.base.s r0 = r11.currentState()
            com.sumsub.sns.internal.features.presentation.esign.x r0 = (com.sumsub.sns.internal.features.presentation.esign.C31014x) r0
            com.sumsub.sns.internal.features.presentation.esign.p r0 = r0.f62678a
            com.sumsub.sns.internal.core.presentation.form.FieldId r1 = com.sumsub.sns.core.presentation.form.model.AbstractC28178b.m69118a(r12)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onFieldValuesChanged: state="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " -> "
            r2.append(r0)
            r2.append(r13)
            java.lang.String r0 = r2.toString()
            com.sumsub.sns.internal.log.a r1 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r1 = r1.f67810a
            java.lang.String r2 = "SNSESignViewModel"
            r3 = 0
            r1.mo68955d(r2, r0, r3)
            com.sumsub.sns.core.presentation.base.s r0 = r11.currentState()
            com.sumsub.sns.internal.features.presentation.esign.x r0 = (com.sumsub.sns.internal.features.presentation.esign.C31014x) r0
            com.sumsub.sns.internal.features.presentation.esign.p r0 = r0.f62678a
            boolean r0 = r0 instanceof com.sumsub.sns.internal.features.presentation.esign.C30994m
            if (r0 == 0) goto L45
            goto L69
        L45:
            com.sumsub.sns.internal.features.data.model.common.remote.response.F r12 = r12.mo69642c()
            java.lang.String r4 = r12.f59466a
            if (r4 == 0) goto L5a
            r8 = 4
            r9 = 0
            java.lang.String r5 = "sns_doc_"
            java.lang.String r6 = ""
            r7 = 0
            java.lang.String r12 = kotlin.text.StringsKt.replace$default(r4, r5, r6, r7, r8, r9)
            goto L5b
        L5a:
            r12 = r3
        L5b:
            if (r12 != 0) goto L5f
            java.lang.String r12 = ""
        L5f:
            java.util.LinkedHashMap r0 = r11.f62657q
            java.lang.Object r0 = r0.get(r12)
            com.sumsub.sns.internal.features.data.model.esign.A r0 = (com.sumsub.sns.internal.features.data.model.esign.C29729A) r0
            if (r0 != 0) goto L6a
        L69:
            return
        L6a:
            java.util.List r1 = r0.f59799b
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r4)
            r2.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L7b:
            boolean r5 = r1.hasNext()
            r6 = 0
            r7 = 1
            if (r5 == 0) goto Lb1
            java.lang.Object r5 = r1.next()
            com.sumsub.sns.internal.features.data.model.esign.w r5 = (com.sumsub.sns.internal.features.data.model.esign.C29787w) r5
            if (r13 == 0) goto La6
            java.lang.String r8 = r5.f59858a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "sns_agr_"
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            boolean r8 = r13.contains(r8)
            if (r8 != r7) goto La6
            r6 = r7
        La6:
            java.lang.String r5 = r5.f59858a
            com.sumsub.sns.internal.features.data.model.esign.w r7 = new com.sumsub.sns.internal.features.data.model.esign.w
            r7.<init>(r5, r6)
            r2.add(r7)
            goto L7b
        Lb1:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r5 = r2.size()
            r8 = r6
        Lc0:
            if (r8 >= r5) goto Ld7
            java.lang.Object r9 = r2.get(r8)
            int r8 = r8 + 1
            r10 = r9
            com.sumsub.sns.internal.features.data.model.esign.w r10 = (com.sumsub.sns.internal.features.data.model.esign.C29787w) r10
            boolean r10 = r10.f59859b
            if (r10 == 0) goto Ld3
            r13.add(r9)
            goto Lc0
        Ld3:
            r1.add(r9)
            goto Lc0
        Ld7:
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r13, r1)
            java.lang.Object r13 = r5.component1()
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r1 = r5.component2()
            java.util.List r1 = (java.util.List) r1
            com.sumsub.sns.internal.core.presentation.screen.base.t r5 = r11.f62656p
            kotlin.reflect.KProperty[] r8 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r9 = 4
            r8 = r8[r9]
            java.lang.Object r5 = r5.m69705a()
            java.util.Set r5 = (java.util.Set) r5
            java.util.Set r5 = kotlin.collections.CollectionsKt.toMutableSet(r5)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r13, r4)
            r8.<init>(r10)
            java.util.Iterator r13 = r13.iterator()
        L106:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L118
            java.lang.Object r10 = r13.next()
            com.sumsub.sns.internal.features.data.model.esign.w r10 = (com.sumsub.sns.internal.features.data.model.esign.C29787w) r10
            java.lang.String r10 = r10.f59858a
            r8.add(r10)
            goto L106
        L118:
            r5.addAll(r8)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r4)
            r13.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L128:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L13a
            java.lang.Object r4 = r1.next()
            com.sumsub.sns.internal.features.data.model.esign.w r4 = (com.sumsub.sns.internal.features.data.model.esign.C29787w) r4
            java.lang.String r4 = r4.f59858a
            r13.add(r4)
            goto L128
        L13a:
            r5.removeAll(r13)
            com.sumsub.sns.internal.core.presentation.screen.base.t r13 = r11.f62656p
            kotlin.reflect.KProperty[] r1 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r1 = r1[r9]
            androidx.lifecycle.SavedStateHandle r1 = r13.f58834a
            java.lang.String r13 = r13.f58835b
            r1.set(r13, r5)
            java.util.LinkedHashMap r13 = r11.f62657q
            java.lang.String r0 = r0.f59798a
            com.sumsub.sns.internal.features.data.model.esign.A r1 = new com.sumsub.sns.internal.features.data.model.esign.A
            r1.<init>(r0, r2)
            r13.put(r12, r1)
            com.sumsub.sns.internal.features.presentation.esign.m0 r12 = new com.sumsub.sns.internal.features.presentation.esign.m0
            r12.<init>(r11, r3)
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r11, r6, r12, r7, r3)
            return
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69620a(com.sumsub.sns.internal.core.presentation.form.model.C28850j r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: a */
    public final void m70549a(com.sumsub.sns.internal.features.data.model.esign.C29752Y r14) {
            r13 = this;
            com.sumsub.sns.internal.features.data.model.esign.c r0 = r14.f59829e
            r1 = 0
            if (r0 == 0) goto L12
            com.sumsub.sns.internal.features.data.model.esign.s r0 = r0.f59832b
            if (r0 == 0) goto L12
            java.lang.Boolean r0 = r0.f59855d
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            goto L13
        L12:
            r0 = r1
        L13:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "confirmOtp: confirmed="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.sumsub.sns.internal.log.a r3 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r3 = r3.f67810a
            java.lang.String r4 = "SNSESignViewModel"
            r5 = 0
            r3.mo68955d(r4, r2, r5)
            r13.f62653m = r14
            r14 = 1
            if (r0 == 0) goto L4c
            com.sumsub.sns.internal.core.common.t r7 = new com.sumsub.sns.internal.core.common.t
            r7.<init>(r14)
            com.sumsub.sns.internal.features.presentation.result.SNSFinishResultType r14 = com.sumsub.sns.internal.features.presentation.result.SNSFinishResultType.SUBMITTED
            com.sumsub.sns.internal.core.analytics.Screen r0 = com.sumsub.sns.internal.core.analytics.Screen.ESignFinishScreen
            com.sumsub.sns.internal.features.presentation.result.c r10 = new com.sumsub.sns.internal.features.presentation.result.c
            java.lang.String r1 = "esign"
            r10.<init>(r14, r0, r1, r5)
            r11 = 6
            r12 = 0
            r8 = 0
            r9 = 0
            r6 = r13
            com.sumsub.sns.core.presentation.base.AbstractC28052C.finish$default(r6, r7, r8, r9, r10, r11, r12)
            return
        L4c:
            r6 = r13
            com.sumsub.sns.internal.features.presentation.esign.K r0 = new com.sumsub.sns.internal.features.presentation.esign.K
            r0.<init>(r13, r5)
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r13, r1, r0, r14, r5)
            return
    }

    /* JADX INFO: renamed from: a */
    public final void m70550a(java.util.List r15) {
            r14 = this;
            kotlinx.coroutines.flow.n r0 = r14.f62649i
            java.lang.Object r0 = r0.getValue()
            com.sumsub.sns.internal.core.presentation.form.f r0 = (com.sumsub.sns.internal.core.presentation.form.C28799f) r0
            java.util.List r0 = r0.f58567b
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            com.sumsub.sns.internal.core.presentation.form.h r0 = (com.sumsub.sns.internal.core.presentation.form.C28801h) r0
            if (r0 != 0) goto L13
            return
        L13:
            java.util.List r1 = r0.f58573d
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
            r4 = r3
        L26:
            boolean r5 = r1.hasNext()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L94
            java.lang.Object r5 = r1.next()
            com.sumsub.sns.internal.core.presentation.form.model.e0 r5 = (com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0) r5
            java.util.Iterator r8 = r15.iterator()
        L38:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L5c
            java.lang.Object r9 = r8.next()
            r10 = r9
            com.sumsub.sns.internal.features.data.model.common.y r10 = (com.sumsub.sns.internal.features.data.model.common.C29719y) r10
            com.sumsub.sns.internal.features.data.model.common.d2 r10 = r10.f59781b
            if (r10 == 0) goto L4e
            java.lang.String r10 = r10.mo69715b()
            goto L4f
        L4e:
            r10 = r7
        L4f:
            com.sumsub.sns.internal.features.data.model.common.remote.response.F r11 = r5.mo69642c()
            java.lang.String r11 = r11.f59466a
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r11)
            if (r10 == 0) goto L38
            goto L5d
        L5c:
            r9 = r7
        L5d:
            com.sumsub.sns.internal.features.data.model.common.y r9 = (com.sumsub.sns.internal.features.data.model.common.C29719y) r9
            if (r9 != 0) goto L62
            goto L90
        L62:
            java.util.Map r8 = r14.m70557f()
            com.sumsub.sns.internal.features.data.model.common.d2 r10 = r9.f59781b
            if (r10 == 0) goto L6f
            java.lang.String r10 = r10.mo69715b()
            goto L70
        L6f:
            r10 = r7
        L70:
            java.lang.Object r8 = r8.get(r10)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L7a
            java.lang.String r8 = ""
        L7a:
            com.sumsub.sns.internal.features.data.repository.dynamic.l r10 = r14.getStrings()
            java.lang.String r7 = com.sumsub.sns.internal.features.presentation.utils.AbstractC32657i.m71280a(r9, r8, r10, r7)
            if (r7 == 0) goto L8c
            int r8 = r7.length()
            if (r8 != 0) goto L8b
            goto L8c
        L8b:
            r4 = r6
        L8c:
            com.sumsub.sns.internal.core.presentation.form.model.e0 r5 = com.sumsub.sns.internal.core.presentation.form.model.AbstractC28845g0.m69657a(r5, r7)
        L90:
            r2.add(r5)
            goto L26
        L94:
            if (r4 == 0) goto La9
            kotlinx.coroutines.flow.n r15 = r14.f62649i
            com.sumsub.sns.internal.features.presentation.esign.t0 r1 = new com.sumsub.sns.internal.features.presentation.esign.t0
            r1.<init>(r0, r2)
            java.lang.Object r0 = r15.getValue()
            java.lang.Object r0 = r1.invoke(r0)
            r15.setValue(r0)
            return
        La9:
            com.sumsub.sns.internal.features.presentation.esign.U r15 = new com.sumsub.sns.internal.features.presentation.esign.U
            r15.<init>(r7)
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r14, r3, r15, r6, r7)
            kotlinx.coroutines.m0 r8 = androidx.lifecycle.ViewModelKt.getViewModelScope(r14)
            com.sumsub.sns.internal.features.presentation.esign.V r11 = new com.sumsub.sns.internal.features.presentation.esign.V
            r11.<init>(r14, r7)
            r12 = 3
            r13 = 0
            r9 = 0
            r10 = 0
            kotlinx.coroutines.C41686h.m91046d(r8, r9, r10, r11, r12, r13)
            return
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final boolean mo69621a(java.lang.String r11) {
            r10 = this;
            java.lang.String r0 = "esign_doc_section_"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r11, r0, r1, r2, r3)
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r8 = 4
            r9 = 0
            java.lang.String r5 = "esign_doc_section_"
            java.lang.String r6 = ""
            r7 = 0
            r4 = r11
            java.lang.String r11 = kotlin.text.StringsKt.replace$default(r4, r5, r6, r7, r8, r9)
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.NumberFormatException -> L21
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.NumberFormatException -> L21
            goto L2d
        L21:
            r0 = move-exception
            r11 = r0
            com.sumsub.sns.internal.log.logger.k r0 = com.sumsub.sns.internal.log.C33272c.f67814c
            java.lang.String r2 = "String.toIntSafe"
            java.lang.String r4 = "invalid number"
            r0.mo68959w(r2, r4, r11)
            r11 = r3
        L2d:
            if (r11 == 0) goto L59
            int r11 = r11.intValue()
            kotlinx.coroutines.x1 r0 = r10.f62659s
            r2 = 1
            if (r0 == 0) goto L3b
            kotlinx.coroutines.InterfaceC41775x1.a.m91377a(r0, r3, r2, r3)
        L3b:
            r10.f62659s = r3
            com.sumsub.sns.internal.features.presentation.esign.d0 r0 = new com.sumsub.sns.internal.features.presentation.esign.d0
            r0.<init>(r10, r3)
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r10, r1, r0, r2, r3)
            kotlinx.coroutines.m0 r4 = androidx.lifecycle.ViewModelKt.getViewModelScope(r10)
            com.sumsub.sns.internal.features.presentation.esign.e0 r7 = new com.sumsub.sns.internal.features.presentation.esign.e0
            r7.<init>(r11, r10, r3)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            kotlinx.coroutines.x1 r11 = kotlinx.coroutines.C41686h.m91046d(r4, r5, r6, r7, r8, r9)
            r10.f62659s = r11
            return r2
        L59:
            return r1
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l mo69622b() {
            r1 = this;
            com.sumsub.sns.internal.features.presentation.esign.X r0 = r1.f62650j
            return r0
    }

    /* JADX INFO: renamed from: b */
    public final java.lang.Object m70551b(com.sumsub.sns.internal.features.data.model.esign.C29752Y r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
            r7 = this;
            boolean r0 = r9 instanceof com.sumsub.sns.internal.features.presentation.esign.C30947B
            if (r0 == 0) goto L13
            r0 = r9
            com.sumsub.sns.internal.features.presentation.esign.B r0 = (com.sumsub.sns.internal.features.presentation.esign.C30947B) r0
            int r1 = r0.f62517f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62517f = r1
            goto L18
        L13:
            com.sumsub.sns.internal.features.presentation.esign.B r0 = new com.sumsub.sns.internal.features.presentation.esign.B
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f62515d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f62517f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            int r8 = r0.f62514c
            java.lang.String r1 = r0.f62513b
            java.util.List r0 = r0.f62512a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L8b
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            int r8 = r0.f62514c
            java.util.List r2 = r0.f62512a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L74
        L45:
            java.util.List r8 = r0.f62512a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5f
        L4b:
            kotlin.ResultKt.throwOnFailure(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0.f62512a = r9
            r0.f62517f = r5
            java.lang.Object r8 = r7.m70544a(r9, r8, r0)
            if (r8 != r1) goto L5e
            goto L87
        L5e:
            r8 = r9
        L5f:
            r0.f62512a = r8
            r9 = 0
            r0.f62514c = r9
            r0.f62517f = r4
            java.lang.String r2 = "sns_esign_documents_title"
            java.lang.Object r2 = r7.getString(r2, r0)
            if (r2 != r1) goto L70
            goto L87
        L70:
            r6 = r2
            r2 = r8
            r8 = r9
            r9 = r6
        L74:
            java.lang.String r9 = (java.lang.String) r9
            r0.f62512a = r2
            r0.f62513b = r9
            r0.f62514c = r8
            r0.f62517f = r3
            java.lang.String r3 = "sns_esign_documents_subtitle"
            java.lang.Object r0 = r7.getString(r3, r0)
            if (r0 != r1) goto L88
        L87:
            return r1
        L88:
            r1 = r9
            r9 = r0
            r0 = r2
        L8b:
            java.lang.String r9 = (java.lang.String) r9
            com.sumsub.sns.internal.core.presentation.form.h r2 = new com.sumsub.sns.internal.core.presentation.form.h
            r2.<init>(r8, r1, r9, r0)
            return r2
    }

    /* JADX INFO: renamed from: b */
    public final java.lang.Object m70552b(com.sumsub.sns.internal.features.data.model.esign.C29779o r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
            r9 = this;
            boolean r0 = r11 instanceof com.sumsub.sns.internal.features.presentation.esign.C30957L
            if (r0 == 0) goto L13
            r0 = r11
            com.sumsub.sns.internal.features.presentation.esign.L r0 = (com.sumsub.sns.internal.features.presentation.esign.C30957L) r0
            int r1 = r0.f62553d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62553d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.features.presentation.esign.L r0 = new com.sumsub.sns.internal.features.presentation.esign.L
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f62551b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f62553d
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlinx.coroutines.flow.n r10 = r0.f62550a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L95
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.ResultKt.throwOnFailure(r11)
            com.sumsub.sns.internal.features.presentation.esign.M r11 = new com.sumsub.sns.internal.features.presentation.esign.M
            r11.<init>(r10, r9, r5)
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r9, r3, r11, r4, r5)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.List r2 = r10.f59850a
            if (r2 == 0) goto L6d
            java.util.Iterator r2 = r2.iterator()
        L4d:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L6d
            java.lang.Object r6 = r2.next()
            com.sumsub.sns.internal.features.data.model.common.y r6 = (com.sumsub.sns.internal.features.data.model.common.C29719y) r6
            java.lang.String r7 = r6.f59787h
            if (r7 == 0) goto L4d
            com.sumsub.sns.internal.features.data.model.common.d2 r6 = r6.f59781b
            if (r6 == 0) goto L66
            java.lang.String r6 = r6.mo69715b()
            goto L67
        L66:
            r6 = r5
        L67:
            if (r6 == 0) goto L4d
            r11.put(r6, r7)
            goto L4d
        L6d:
            com.sumsub.sns.internal.core.presentation.screen.base.t r2 = r9.f62651k
            kotlin.reflect.KProperty[] r6 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r7 = r6[r3]
            androidx.lifecycle.SavedStateHandle r7 = r2.f58834a
            java.lang.String r2 = r2.f58835b
            r7.set(r2, r11)
            com.sumsub.sns.internal.core.presentation.screen.base.t r2 = r9.f62652l
            r6 = r6[r4]
            androidx.lifecycle.SavedStateHandle r6 = r2.f58834a
            java.lang.String r2 = r2.f58835b
            r6.set(r2, r11)
            kotlinx.coroutines.flow.n r11 = r9.f62649i
            r0.f62550a = r11
            r0.f62553d = r4
            java.lang.Object r10 = r9.m70542a(r10, r0)
            if (r10 != r1) goto L92
            return r1
        L92:
            r8 = r11
            r11 = r10
            r10 = r8
        L95:
            java.util.List r11 = kotlin.collections.CollectionsKt.listOf(r11)
            com.sumsub.sns.internal.core.presentation.form.f r0 = new com.sumsub.sns.internal.core.presentation.form.f
            r0.<init>(r3, r11, r5, r5)
            r10.setValue(r0)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
    }

    /* JADX INFO: renamed from: b */
    public final java.lang.Object m70553b(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.features.presentation.esign.C30959N
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.features.presentation.esign.N r0 = (com.sumsub.sns.internal.features.presentation.esign.C30959N) r0
            int r1 = r0.f62561d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62561d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.features.presentation.esign.N r0 = new com.sumsub.sns.internal.features.presentation.esign.N
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f62559b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f62561d
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlinx.coroutines.flow.n r0 = r0.f62558a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L55
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r7)
            com.sumsub.sns.internal.features.data.model.esign.Y r7 = r6.f62653m
            if (r7 != 0) goto L3f
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L3f:
            com.sumsub.sns.internal.features.presentation.esign.l0 r2 = new com.sumsub.sns.internal.features.presentation.esign.l0
            r2.<init>(r6, r5)
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r6, r3, r2, r4, r5)
            kotlinx.coroutines.flow.n r2 = r6.f62649i
            r0.f62558a = r2
            r0.f62561d = r4
            java.lang.Object r7 = r6.m70551b(r7, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r2
        L55:
            java.util.List r7 = kotlin.collections.CollectionsKt.listOf(r7)
            com.sumsub.sns.internal.core.presentation.form.f r1 = new com.sumsub.sns.internal.core.presentation.form.f
            r1.<init>(r3, r7, r5, r5)
            r0.setValue(r1)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final void mo69623b(com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0 r3, java.lang.String r4) {
            r2 = this;
            com.sumsub.sns.internal.features.data.model.common.remote.response.F r3 = r3.mo69642c()
            java.lang.String r3 = r3.f59466a
            if (r3 == 0) goto L1e
            java.util.Map r0 = r2.m70557f()
            java.util.Map r3 = com.sumsub.sns.internal.core.common.AbstractC28458h.m69338a(r0, r3, r4)
            com.sumsub.sns.internal.core.presentation.screen.base.t r4 = r2.f62651k
            kotlin.reflect.KProperty[] r0 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r1 = 0
            r0 = r0[r1]
            androidx.lifecycle.SavedStateHandle r0 = r4.f58834a
            java.lang.String r4 = r4.f58835b
            r0.set(r4, r3)
        L1e:
            return
    }

    /* JADX INFO: renamed from: c */
    public final java.lang.Object m70554c(com.sumsub.sns.internal.features.data.model.esign.C29752Y r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
            r7 = this;
            boolean r0 = r9 instanceof com.sumsub.sns.internal.features.presentation.esign.C30951F
            if (r0 == 0) goto L13
            r0 = r9
            com.sumsub.sns.internal.features.presentation.esign.F r0 = (com.sumsub.sns.internal.features.presentation.esign.C30951F) r0
            int r1 = r0.f62536d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62536d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.features.presentation.esign.F r0 = new com.sumsub.sns.internal.features.presentation.esign.F
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f62534b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f62536d
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlinx.coroutines.flow.n r8 = r0.f62533a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L74
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.throwOnFailure(r9)
            com.sumsub.sns.internal.features.data.model.esign.c r9 = r8.f59829e
            if (r9 == 0) goto L57
            com.sumsub.sns.internal.features.data.model.esign.i r9 = r9.f59831a
            if (r9 == 0) goto L57
            java.util.List r9 = r9.f59844b
            if (r9 == 0) goto L57
            java.util.Iterator r9 = r9.iterator()
        L48:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r9.next()
            com.sumsub.sns.internal.features.data.model.esign.f r2 = (com.sumsub.sns.internal.features.data.model.esign.C29763f) r2
            java.lang.String r2 = r2.f59837b
            goto L48
        L57:
            com.sumsub.sns.internal.features.presentation.esign.G r9 = new com.sumsub.sns.internal.features.presentation.esign.G
            r9.<init>(r7, r5)
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r7, r3, r9, r4, r5)
            java.util.LinkedHashMap r9 = r7.f62657q
            r9.clear()
            kotlinx.coroutines.flow.n r9 = r7.f62649i
            r0.f62533a = r9
            r0.f62536d = r4
            java.lang.Object r8 = r7.m70541a(r8, r0)
            if (r8 != r1) goto L71
            return r1
        L71:
            r6 = r9
            r9 = r8
            r8 = r6
        L74:
            java.util.List r9 = kotlin.collections.CollectionsKt.listOf(r9)
            com.sumsub.sns.internal.core.presentation.form.f r0 = new com.sumsub.sns.internal.core.presentation.form.f
            r0.<init>(r3, r9, r5, r5)
            r8.setValue(r0)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }

    /* JADX INFO: renamed from: d */
    public final java.lang.Object m70555d(com.sumsub.sns.internal.features.data.model.esign.C29752Y r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
            r13 = this;
            com.sumsub.sns.internal.features.data.model.esign.ESignSubmissionResponse$Status r3 = r14.f59826b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "initStatus: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.sumsub.sns.internal.log.a r4 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r4 = r4.f67810a
            java.lang.String r5 = "SNSESignViewModel"
            r6 = 0
            r4.mo68955d(r5, r3, r6)
            r13.f62653m = r14
            com.sumsub.sns.internal.features.data.model.esign.ESignSubmissionResponse$Status r3 = r14.f59826b
            if (r3 != 0) goto L25
            r3 = -1
            goto L2d
        L25:
            int[] r4 = com.sumsub.sns.internal.features.presentation.esign.AbstractC31015y.f62683a
            int r3 = r3.ordinal()
            r3 = r4[r3]
        L2d:
            r4 = 3
            r5 = 1
            if (r3 == r5) goto L85
            r1 = 2
            if (r3 == r1) goto L6a
            if (r3 == r4) goto L5e
            com.sumsub.sns.internal.features.presentation.esign.S r1 = new com.sumsub.sns.internal.features.presentation.esign.S
            r1.<init>(r6)
            r2 = 0
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r13, r2, r1, r5, r6)
            com.sumsub.sns.internal.features.data.model.common.e0 r1 = new com.sumsub.sns.internal.features.data.model.common.e0
            com.sumsub.sns.core.data.model.SNSGeneralException r7 = new com.sumsub.sns.core.data.model.SNSGeneralException
            r11 = 6
            r12 = 0
            java.lang.String r8 = "Unknown submission status"
            r9 = 0
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r2 = 6
            r1.<init>(r7, r6, r6, r2)
            java.lang.String r2 = r13.getIdDocSetType()
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r13
            com.sumsub.sns.core.presentation.base.AbstractC28052C.throwError$default(r0, r1, r2, r3, r4, r5, r6)
            goto L82
        L5e:
            r5 = 15
            r6 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r13
            com.sumsub.sns.core.presentation.base.AbstractC28052C.finish$default(r0, r1, r2, r3, r4, r5, r6)
            goto L82
        L6a:
            com.sumsub.sns.internal.core.common.t r1 = new com.sumsub.sns.internal.core.common.t
            r1.<init>(r5)
            com.sumsub.sns.internal.features.presentation.result.SNSFinishResultType r0 = com.sumsub.sns.internal.features.presentation.result.SNSFinishResultType.SUBMITTED
            com.sumsub.sns.internal.core.analytics.Screen r2 = com.sumsub.sns.internal.core.analytics.Screen.ESignFinishScreen
            com.sumsub.sns.internal.features.presentation.result.c r4 = new com.sumsub.sns.internal.features.presentation.result.c
            java.lang.String r3 = "esign"
            r4.<init>(r0, r2, r3, r6)
            r5 = 6
            r6 = 0
            r2 = 0
            r3 = 0
            r0 = r13
            com.sumsub.sns.core.presentation.base.AbstractC28052C.finish$default(r0, r1, r2, r3, r4, r5, r6)
        L82:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L85:
            com.sumsub.sns.internal.features.data.model.esign.c r3 = r14.f59829e
            if (r3 == 0) goto L8f
            com.sumsub.sns.internal.features.data.model.esign.Q r7 = r3.f59833c
            if (r7 == 0) goto L8f
            com.sumsub.sns.internal.features.data.model.esign.o r6 = r7.f59815a
        L8f:
            if (r6 == 0) goto La3
            com.sumsub.sns.internal.features.data.model.esign.Q r1 = r3.f59833c
            com.sumsub.sns.internal.features.data.model.esign.o r1 = r1.f59815a
            java.lang.Object r1 = r13.m70552b(r1, r15)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto La0
            goto Ldd
        La0:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto Ldd
        La3:
            com.sumsub.sns.internal.core.presentation.screen.base.t r3 = r13.f62655o
            kotlin.reflect.KProperty[] r6 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r4 = r6[r4]
            java.lang.Object r3 = r3.m69705a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto Ld0
            com.sumsub.sns.internal.features.data.model.esign.c r3 = r14.f59829e
            if (r3 == 0) goto Lc2
            com.sumsub.sns.internal.features.data.model.esign.i r3 = r3.f59831a
            if (r3 == 0) goto Lc2
            boolean r3 = r3.f59843a
            if (r3 != r5) goto Lc2
            goto Ld0
        Lc2:
            java.lang.Object r1 = r13.m70554c(r14, r15)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto Lcd
            goto Ldd
        Lcd:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto Ldd
        Ld0:
            java.lang.Object r1 = r13.m70553b(r15)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto Ldb
            goto Ldd
        Ldb:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        Ldd:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto Le4
            return r1
        Le4:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: d */
    public final kotlinx.coroutines.flow.InterfaceC41678w mo69624d() {
            r1 = this;
            kotlinx.coroutines.flow.n r0 = r1.f62649i
            return r0
    }

    /* JADX INFO: renamed from: e */
    public final com.sumsub.sns.internal.core.analytics.Screen m70556e() {
            r2 = this;
            com.sumsub.sns.core.presentation.base.s r0 = r2.currentState()
            com.sumsub.sns.internal.features.presentation.esign.x r0 = (com.sumsub.sns.internal.features.presentation.esign.C31014x) r0
            com.sumsub.sns.internal.features.presentation.esign.p r0 = r0.f62678a
            boolean r1 = r0 instanceof com.sumsub.sns.internal.features.presentation.esign.C31010u
            if (r1 == 0) goto Lf
            com.sumsub.sns.internal.core.analytics.Screen r0 = com.sumsub.sns.internal.core.analytics.Screen.ESignOtpConfirmationScreen
            return r0
        Lf:
            boolean r0 = r0 instanceof com.sumsub.sns.internal.features.presentation.esign.C30998o
            if (r0 == 0) goto L16
            com.sumsub.sns.internal.core.analytics.Screen r0 = com.sumsub.sns.internal.core.analytics.Screen.ESignDocumentsScreen
            return r0
        L16:
            com.sumsub.sns.internal.core.analytics.Screen r0 = com.sumsub.sns.internal.core.analytics.Screen.ESignAgreementScreen
            return r0
    }

    /* JADX INFO: renamed from: f */
    public final java.util.Map m70557f() {
            r3 = this;
            com.sumsub.sns.internal.core.presentation.screen.base.t r0 = r3.f62651k
            kotlin.reflect.KProperty[] r1 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = r0.m69705a()
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    /* JADX INFO: renamed from: g */
    public final void m70558g() {
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.sumsub.sns.internal.core.presentation.screen.base.t r2 = r8.f62654n
            kotlin.reflect.KProperty[] r3 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r4 = 2
            r3 = r3[r4]
            java.lang.Object r2 = r2.m69705a()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            long r0 = r0 - r2
            r2 = 0
            long r0 = kotlin.ranges.RangesKt.coerceAtLeast(r0, r2)
            com.sumsub.sns.internal.features.data.model.esign.Y r4 = r8.f62653m
            r5 = 0
            if (r4 == 0) goto L32
            com.sumsub.sns.internal.features.data.model.esign.c r4 = r4.f59829e
            if (r4 == 0) goto L32
            com.sumsub.sns.internal.features.data.model.esign.s r4 = r4.f59832b
            if (r4 == 0) goto L32
            java.lang.Integer r4 = r4.f59854c
            if (r4 == 0) goto L32
            int r4 = r4.intValue()
            goto L33
        L32:
            r4 = r5
        L33:
            long r6 = (long) r4
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r4.toSeconds(r0)
            long r6 = r6 - r0
            long r0 = kotlin.ranges.RangesKt.coerceAtLeast(r6, r2)
            int r0 = (int) r0
            com.sumsub.sns.internal.features.presentation.esign.T r1 = new com.sumsub.sns.internal.features.presentation.esign.T
            r2 = 0
            r1.<init>(r0, r8, r2)
            r0 = 1
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r8, r5, r1, r0, r2)
            return
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final com.sumsub.sns.core.presentation.base.InterfaceC28147s getDefaultState() {
            r6 = this;
            com.sumsub.sns.internal.features.presentation.esign.x r0 = new com.sumsub.sns.internal.features.presentation.esign.x
            com.sumsub.sns.internal.features.presentation.esign.s r1 = com.sumsub.sns.internal.features.presentation.esign.C31006s.f62667b
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final java.lang.String getIdDocSetType() {
            r4 = this;
            android.os.Bundle r0 = r4.f62641a
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r2 = "ARG_DOCUMENT"
            java.lang.Class<com.sumsub.sns.internal.features.data.model.common.Document> r3 = com.sumsub.sns.internal.features.data.model.common.Document.class
            android.os.Parcelable r0 = com.sumsub.sns.internal.core.common.AbstractC28437b.m69320a(r0, r2, r3, r1)
            r1 = r0
            com.sumsub.sns.internal.features.data.model.common.Document r1 = (com.sumsub.sns.internal.features.data.model.common.Document) r1
        L10:
            if (r1 == 0) goto L1e
            com.sumsub.sns.internal.features.data.model.common.X r0 = r1.getType()
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.f59014a
            if (r0 != 0) goto L1d
            goto L1e
        L1d:
            return r0
        L1e:
            java.lang.String r0 = "TYPE_UNKNOWN"
            return r0
    }

    /* JADX INFO: renamed from: h */
    public final void m70559h() {
            r11 = this;
            com.sumsub.sns.core.presentation.base.s r0 = r11.currentState()
            com.sumsub.sns.internal.features.presentation.esign.x r0 = (com.sumsub.sns.internal.features.presentation.esign.C31014x) r0
            com.sumsub.sns.internal.features.presentation.esign.p r0 = r0.f62678a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onButtonClick: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.sumsub.sns.internal.log.a r2 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r2 = r2.f67810a
            java.lang.String r3 = "SNSESignViewModel"
            r4 = 0
            r2.mo68955d(r3, r1, r4)
            boolean r1 = r0 instanceof com.sumsub.sns.internal.features.presentation.esign.C30994m
            if (r1 == 0) goto L30
            com.sumsub.sns.internal.features.presentation.esign.m r0 = (com.sumsub.sns.internal.features.presentation.esign.C30994m) r0
            java.util.List r0 = r0.f62633b
            r11.m70550a(r0)
            return
        L30:
            boolean r1 = r0 instanceof com.sumsub.sns.internal.features.presentation.esign.C30986i
            if (r1 == 0) goto L5f
            com.sumsub.sns.internal.core.presentation.screen.base.t r0 = r11.f62655o
            kotlin.reflect.KProperty[] r1 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r2 = 3
            r1 = r1[r2]
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            androidx.lifecycle.SavedStateHandle r2 = r0.f58834a
            java.lang.String r0 = r0.f58835b
            r2.set(r0, r1)
            com.sumsub.sns.internal.features.presentation.esign.H r0 = new com.sumsub.sns.internal.features.presentation.esign.H
            r0.<init>(r4)
            r1 = 0
            r2 = 1
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r11, r1, r0, r2, r4)
            kotlinx.coroutines.m0 r5 = androidx.lifecycle.ViewModelKt.getViewModelScope(r11)
            com.sumsub.sns.internal.features.presentation.esign.I r8 = new com.sumsub.sns.internal.features.presentation.esign.I
            r8.<init>(r11, r4)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.C41686h.m91046d(r5, r6, r7, r8, r9, r10)
            return
        L5f:
            boolean r0 = r0 instanceof com.sumsub.sns.internal.features.presentation.esign.C30998o
            if (r0 == 0) goto L66
            r11.m70558g()
        L66:
            return
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, androidx.lifecycle.ViewModel
    public final void onCleared() {
            r3 = this;
            super.onCleared()
            kotlinx.coroutines.x1 r0 = r3.f62659s
            r1 = 0
            if (r0 == 0) goto Lc
            r2 = 1
            kotlinx.coroutines.InterfaceC41775x1.a.m91377a(r0, r1, r2, r1)
        Lc:
            r3.f62659s = r1
            return
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onErrorCancelled(com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0 r11) {
            r10 = this;
            android.os.Parcelable r0 = r11.mo69766d()
            com.sumsub.sns.internal.features.presentation.esign.r r1 = com.sumsub.sns.internal.features.presentation.esign.C31004r.f62665a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L27
            java.lang.Throwable r11 = r11.mo69765c()
            com.sumsub.sns.internal.log.a r0 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r0 = r0.f67810a
            java.lang.String r1 = "SNSESignViewModel"
            java.lang.String r2 = "onErrorCancelled: error"
            r0.mo68956e(r1, r2, r11)
            r8 = 15
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r10
            com.sumsub.sns.core.presentation.base.AbstractC28052C.finish$default(r3, r4, r5, r6, r7, r8, r9)
        L27:
            return
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0 r12) {
            r11 = this;
            android.os.Parcelable r0 = r12.mo69766d()
            com.sumsub.sns.internal.features.presentation.esign.w r1 = com.sumsub.sns.internal.features.presentation.esign.C31013w.f62677a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L38
            com.sumsub.sns.internal.core.presentation.screen.base.t r12 = r11.f62655o
            kotlin.reflect.KProperty[] r0 = com.sumsub.sns.internal.features.presentation.esign.C30997n0.f62640t
            r1 = 3
            r0 = r0[r1]
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            androidx.lifecycle.SavedStateHandle r1 = r12.f58834a
            java.lang.String r12 = r12.f58835b
            r1.set(r12, r0)
            com.sumsub.sns.internal.features.presentation.esign.H r12 = new com.sumsub.sns.internal.features.presentation.esign.H
            r12.<init>(r4)
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r11, r3, r12, r2, r4)
            kotlinx.coroutines.m0 r5 = androidx.lifecycle.ViewModelKt.getViewModelScope(r11)
            com.sumsub.sns.internal.features.presentation.esign.I r8 = new com.sumsub.sns.internal.features.presentation.esign.I
            r8.<init>(r11, r4)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.C41686h.m91046d(r5, r6, r7, r8, r9, r10)
            return
        L38:
            boolean r1 = r0 instanceof com.sumsub.sns.internal.features.presentation.esign.C30992l
            if (r1 == 0) goto L65
            com.sumsub.sns.internal.features.presentation.esign.l r0 = (com.sumsub.sns.internal.features.presentation.esign.C30992l) r0
            java.lang.String r12 = r0.f62629a
            com.sumsub.sns.internal.log.a r0 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r0 = r0.f67810a
            java.lang.String r1 = "SNSESignViewModel"
            java.lang.String r5 = "onCheckCode"
            r0.mo68955d(r1, r5, r4)
            com.sumsub.sns.internal.features.presentation.esign.b0 r0 = new com.sumsub.sns.internal.features.presentation.esign.b0
            r0.<init>(r4)
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r11, r3, r0, r2, r4)
            kotlinx.coroutines.m0 r5 = androidx.lifecycle.ViewModelKt.getViewModelScope(r11)
            com.sumsub.sns.internal.features.presentation.esign.c0 r8 = new com.sumsub.sns.internal.features.presentation.esign.c0
            r8.<init>(r11, r12, r4)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.C41686h.m91046d(r5, r6, r7, r8, r9, r10)
            return
        L65:
            boolean r0 = r0 instanceof com.sumsub.sns.internal.features.presentation.esign.C31004r
            if (r0 == 0) goto L79
            boolean r0 = r12 instanceof com.sumsub.sns.internal.features.data.model.common.C29131i0
            if (r0 != 0) goto L79
            r6 = 15
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r11
            com.sumsub.sns.core.presentation.base.AbstractC28052C.finish$default(r1, r2, r3, r4, r5, r6, r7)
            return
        L79:
            super.onHandleError(r12)
            return
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onLoad() {
            r10 = this;
            com.sumsub.sns.internal.features.presentation.esign.g0 r0 = new com.sumsub.sns.internal.features.presentation.esign.g0
            r1 = 0
            r0.<init>(r1)
            r2 = 0
            r3 = 1
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.updateState$default(r10, r2, r0, r3, r1)
            kotlinx.coroutines.m0 r4 = androidx.lifecycle.ViewModelKt.getViewModelScope(r10)
            com.sumsub.sns.internal.features.presentation.esign.h0 r7 = new com.sumsub.sns.internal.features.presentation.esign.h0
            r7.<init>(r10, r1)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            kotlinx.coroutines.C41686h.m91046d(r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final java.lang.Object onPrepare(kotlin.coroutines.Continuation r1) {
            r0 = this;
            r0.onLoad()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
