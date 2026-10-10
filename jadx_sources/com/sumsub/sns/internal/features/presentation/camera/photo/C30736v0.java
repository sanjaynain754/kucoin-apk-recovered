package com.sumsub.sns.internal.features.presentation.camera.photo;

import androidx.lifecycle.ViewModelKt;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.common.AbstractC28398I;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.C28388D;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30332x;
import com.sumsub.sns.internal.features.domain.ekyc.C30159b;
import com.sumsub.sns.internal.features.domain.ekyc.C30161d;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.v0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30736v0 extends AbstractC28142p0 {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f62087V = 0;

    /* JADX INFO: renamed from: a */
    public final String f62088a;

    /* JADX INFO: renamed from: b */
    public final String f62089b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29984m f62090c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC30000a f62091d;

    /* JADX INFO: renamed from: e */
    public final C30156e f62092e;

    /* JADX INFO: renamed from: f */
    public final C30332x f62093f;

    /* JADX INFO: renamed from: g */
    public final C30159b f62094g;

    /* JADX INFO: renamed from: h */
    public final C30161d f62095h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41678w f62096i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC41678w f62097j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC41669n f62098k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC41669n f62099l;

    /* JADX INFO: renamed from: m */
    public final C30686o0 f62100m;

    /* JADX INFO: renamed from: n */
    public final C30692r0 f62101n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC41668m f62102o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC41678w f62103p;

    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a7 -> B:42:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c5 -> B:37:0x00c8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70440a(java.lang.String r12, p852kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.features.presentation.camera.photo.C30736v0.m70440a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public C30736v0(String str, String str2, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C28547d c28547d, C30156e c30156e, C30332x c30332x, C30159b c30159b, C30161d c30161d) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f62088a = str;
        this.f62089b = str2;
        this.f62090c = interfaceC29984m;
        this.f62091d = c28547d;
        this.f62092e = c30156e;
        this.f62093f = c30332x;
        this.f62094g = c30159b;
        this.f62095h = c30161d;
        InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C30406K(this, null)), C41782z0.m91392b());
        InterfaceC41709m0 viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        InterfaceC41678w interfaceC41678wM90916g0 = C41636g.m90916g0(interfaceC41634eM90890N, viewModelScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), null);
        this.f62096i = interfaceC41678wM90916g0;
        InterfaceC41678w interfaceC41678wM90916g1 = C41636g.m90916g0(new C30674i0(interfaceC41678wM90916g0), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), CollectionsKt.emptyList());
        this.f62097j = interfaceC41678wM90916g1;
        this.f62098k = C41679x.m91009a(Boolean.FALSE);
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(null);
        this.f62099l = interfaceC41669nM91009a;
        InterfaceC41678w interfaceC41678wM90916g2 = C41636g.m90916g0(C41636g.m90890N(C41636g.m90896T(C41636g.m90917h(new C30680l0(interfaceC41669nM91009a, this), new C30413S(this, null)), new C30414T(this, null)), C41782z0.m91392b()), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), null);
        C30686o0 c30686o0 = new C30686o0(interfaceC41678wM90916g2, this);
        this.f62100m = c30686o0;
        this.f62101n = new C30692r0(interfaceC41678wM90916g2, this);
        InterfaceC41668m interfaceC41668mM91001b = C41674s.m91001b(0, 0, null, 7, null);
        this.f62102o = interfaceC41668mM91001b;
        InterfaceC41678w interfaceC41678wM90916g3 = C41636g.m90916g0(C41636g.m90894R(new C30734u0(interfaceC41669nM91009a), interfaceC41668mM91001b), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), null);
        this.f62103p = interfaceC41678wM90916g3;
        AbstractC28421U.m69306b(interfaceC41678wM90916g1, ViewModelKt.getViewModelScope(this), new C30673i(this, null));
        AbstractC28421U.m69306b(interfaceC41678wM90916g3, ViewModelKt.getViewModelScope(this), new C30675j(this, null));
        AbstractC28421U.m69306b(c30686o0, ViewModelKt.getViewModelScope(this), new C30677k(this, null));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        return C41636g.m90897U(C41636g.m90933p(C41636g.m90927m(new C30409N(this.f62097j), this.f62098k, new C30410O(null)), C41636g.m90887K(new C28388D(new C30403H(this, c28075o, null), null)), C41636g.m90887K(new C30431d0(this, c28075o.f57271c, null)), C41636g.m90887K(new C30412Q(this, c28075o.f57271c, null)), C41636g.m90887K(new C30418X(this, c28075o.f57271c, null)), new C30404I(null)), new C30405J(this, null));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(InterfaceC28077Q interfaceC28077Q) {
        if (interfaceC28077Q instanceof C30739x) {
            C30877b c30877b = ((C30739x) interfaceC28077Q).f62108a;
            if (c30877b == null || Intrinsics.areEqual(this.f62099l.getValue(), c30877b)) {
                return;
            }
            this.f62099l.setValue(c30877b);
            SNSEventHandler eventHandler = C28468k0.f57983a.getEventHandler();
            if (eventHandler != null) {
                eventHandler.onEvent(new SNSEvent.CountrySelected(c30877b.f62373a, true));
                return;
            }
            return;
        }
        if (interfaceC28077Q instanceof C30743z) {
            m70442a(((C30743z) interfaceC28077Q).f62114a);
            return;
        }
        if (interfaceC28077Q instanceof C30737w) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30665e0(this, null), 3, null);
            return;
        }
        if (!(interfaceC28077Q instanceof C30396A)) {
            if ((interfaceC28077Q instanceof C30741y) && ((Boolean) this.f62098k.getValue()).booleanValue()) {
                this.f62098k.setValue(Boolean.FALSE);
                return;
            }
            return;
        }
        if (((List) this.f62097j.getValue()).isEmpty()) {
            return;
        }
        if (((Boolean) this.f62098k.getValue()).booleanValue()) {
            Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "onSelectCountryClick: dialog already shown", null, 4, null);
        } else {
            this.f62098k.setValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0084 -> B:21:0x0089). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70439a(com.sumsub.sns.internal.features.domain.C30318v r11, java.lang.String r12, p852kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
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
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            p852kotlin.ResultKt.throwOnFailure(r13)
            goto L89
        L39:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L41:
            p852kotlin.ResultKt.throwOnFailure(r13)
            java.util.List r11 = r11.f60950b
            java.util.ArrayList r13 = new java.util.ArrayList
            r2 = 10
            int r2 = p852kotlin.collections.CollectionsKt.collectionSizeOrDefault(r11, r2)
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
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.features.presentation.camera.photo.C30736v0.m70439a(com.sumsub.sns.internal.features.domain.v, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    public final void m70442a(C30400E c30400e) {
        Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "onItemSelected: " + c30400e, null, 4, null);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30667f0(this, c30400e, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public static final String m70438a(C30736v0 c30736v0, C29983l c29983l) {
        String[] strArr = {"sns_step_%s_selector_country_prompt_short", "sns_step_%s_selector_country_prompt"};
        ArrayList arrayList = new ArrayList(2);
        for (int i11 = 0; i11 < 2; i11++) {
            String str = strArr[i11];
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            arrayList.add(String.format(str, Arrays.copyOf(new Object[]{c30736v0.f62088a}, 1)));
        }
        ArrayList arrayList2 = new ArrayList(2);
        for (int i12 = 0; i12 < 2; i12++) {
            String str2 = strArr[i12];
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            arrayList2.add(String.format(str2, Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME}, 1)));
        }
        String[] strArr2 = (String[]) CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2).toArray(new String[0]);
        if (c29983l != null) {
            return AbstractC28398I.m69284a(c29983l, (String[]) Arrays.copyOf(strArr2, strArr2.length));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m70441a(C29983l c29983l, String str) {
        if (c29983l == null) {
            return null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return AbstractC28398I.m69284a(c29983l, String.format(str, Arrays.copyOf(new Object[]{this.f62088a}, 1)), String.format(str, Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME}, 1)));
    }
}
