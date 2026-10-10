package com.sumsub.sns.internal.features.presentation.verification2.phone;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.domain.C30069C;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32814J;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32847F extends AbstractC28142p0 {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f67204V = 0;

    /* JADX INFO: renamed from: a */
    public final InterfaceC32867l f67205a;

    /* JADX INFO: renamed from: b */
    public final C30156e f67206b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC30000a f67207c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f67208d;

    /* JADX INFO: renamed from: e */
    public final C32853c f67209e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f67210f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41634e f67211g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41634e f67212h;

    public C32847F(InterfaceC32867l interfaceC32867l, C30156e c30156e, InterfaceC30000a interfaceC30000a, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, SavedStateHandle savedStateHandle) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f67205a = interfaceC32867l;
        this.f67206b = c30156e;
        this.f67207c = interfaceC30000a;
        this.f67208d = C41679x.m91009a(null);
        C29070X.Companion.getClass();
        C32853c c32853c = new C32853c(this, savedStateHandle, C29062V.m69739a("PHONE_VERIFICATION"), "PhoneVerificationViewModel", new C30069C());
        this.f67209e = c32853c;
        this.f67210f = C41679x.m91009a(null);
        this.f67211g = C41636g.m90930n0(c32853c.f67225k, new C32842A(this, null));
        this.f67212h = C41636g.m90930n0(c32853c.f67225k, new C32843B(this, null));
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32875t(this, null), 3, null);
        AbstractC28421U.m69303a(c32853c.f67225k, ViewModelKt.getViewModelScope(this), new C32868m(this, null));
        AbstractC28421U.m69303a(C41636g.m90881E(new C32846E(new C32881z(new C32878w(C41636g.m90881E(((C32814J) interfaceC32867l).f67152h.f67175b), this)))), ViewModelKt.getViewModelScope(this), new C32869n(this, null));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        AbstractC29172p abstractC29172p = c28075o.f57269a;
        if (abstractC29172p == null) {
            return C41636g.m90889M(new C32873r());
        }
        C29983l c29983l = c28075o.f57271c;
        return c29983l == null ? C41636g.m90889M(new C32873r()) : C41636g.m90933p(this.f67209e.f67225k, this.f67211g, this.f67208d, this.f67212h, this.f67210f, new C32874s(this, abstractC29172p, c29983l, null));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final String getDocumentType() {
        return "PHONE_VERIFICATION";
    }
}
