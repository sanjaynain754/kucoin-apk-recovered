package com.sumsub.sns.internal.features.presentation.result;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.result.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32377q extends AbstractC28142p0 {

    /* JADX INFO: renamed from: a */
    public final SavedStateHandle f65961a;

    public C32377q(SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(2));
        this.f65961a = savedStateHandle;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32372l(this, null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        return C41636g.m90887K(new C32376p(this, null));
    }

    /* JADX INFO: renamed from: e */
    public final C32363c m71105e() {
        C32363c c32363c = (C32363c) this.f65961a.get("arg_result");
        return c32363c == null ? new C32363c(SNSFinishResultType.SUCCESS, Screen.Other, "unknown", null) : c32363c;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        if (abstractC28503w instanceof C28497u) {
            return false;
        }
        return super.onFinishCalled(abstractC28503w);
    }
}
