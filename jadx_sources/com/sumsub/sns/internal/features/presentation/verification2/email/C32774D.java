package com.sumsub.sns.internal.features.presentation.verification2.email;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32814J;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32774D extends AbstractC28142p0 {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f67075V = 0;

    /* JADX INFO: renamed from: a */
    public final InterfaceC32786h f67076a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC30000a f67077b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f67078c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f67079d;

    public C32774D(InterfaceC32786h interfaceC32786h, InterfaceC30000a interfaceC30000a, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f67076a = interfaceC32786h;
        this.f67077b = interfaceC30000a;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(null);
        this.f67078c = interfaceC41669nM91009a;
        this.f67079d = C41679x.m91009a(null);
        AbstractC28421U.m69303a(interfaceC41669nM91009a, ViewModelKt.getViewModelScope(this), new C32787i(this, null));
        AbstractC28421U.m69303a(C41636g.m90881E(new C32773C(new C32804z(new C32801w(C41636g.m90881E(((C32814J) interfaceC32786h).f67152h.f67175b), this)))), ViewModelKt.getViewModelScope(this), new C32788j(this, null));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        AbstractC29172p abstractC29172p = c28075o.f57269a;
        if (abstractC29172p == null) {
            return C41636g.m90889M(new C32794p());
        }
        C29983l c29983l = c28075o.f57271c;
        if (c29983l == null) {
            return C41636g.m90889M(new C32794p());
        }
        return C41636g.m90931o(this.f67078c, C41636g.m90930n0(this.f67078c, new C32795q(this, null)), C41636g.m90930n0(this.f67078c, new C32796r(this, null)), this.f67079d, new C32797s(this, abstractC29172p, c29983l, null));
    }
}
