package com.sumsub.sns.internal.features.presentation.error;

import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.presentation.screen.base.C28917a;
import com.sumsub.sns.internal.core.presentation.screen.base.ErrorClosure$Outcome;
import com.sumsub.sns.internal.core.presentation.screen.base.InterfaceC28918b;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29119g0;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.presentation.main.C31252d;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.error.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30941t extends AbstractC28142p0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC29149l0 f62492a;

    /* JADX INFO: renamed from: b */
    public final String f62493b;

    /* JADX INFO: renamed from: c */
    public final String f62494c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC28918b f62495d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC30000a f62496e;

    /* JADX INFO: renamed from: f */
    public final Screen f62497f;

    /* JADX INFO: renamed from: g */
    public ErrorClosure$Outcome f62498g;

    public C30941t(AbstractC29149l0 abstractC29149l0, String str, String str2, C31252d c31252d, C28547d c28547d, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(1));
        this.f62492a = abstractC29149l0;
        this.f62493b = str;
        this.f62494c = str2;
        this.f62495d = c31252d;
        this.f62496e = c28547d;
        this.f62497f = abstractC29149l0 instanceof C29107e0 ? Screen.OopsFatalScreen : abstractC29149l0 instanceof C29131i0 ? Screen.OopsNetworkScreen : abstractC29149l0 instanceof C29119g0 ? Screen.OopsActionScreen : Screen.Other;
        this.f62498g = ErrorClosure$Outcome.CANCELLED;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        return C41636g.m90887K(new C30940s(c28075o, this, null));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        ((C31252d) this.f62495d).m70660a(new C28917a(this.f62492a, abstractC28503w, this.f62498g, this.f62494c));
        return false;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(AbstractC29149l0 abstractC29149l0) {
    }
}
