package com.sumsub.sns.internal.features.presentation.camera;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28070L;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30388m extends AbstractC28070L {

    /* JADX INFO: renamed from: j */
    public final InterfaceC29984m f61132j;

    /* JADX INFO: renamed from: k */
    public final String f61133k;

    /* JADX INFO: renamed from: l */
    public final String f61134l;

    /* JADX INFO: renamed from: m */
    public final String f61135m;

    /* JADX INFO: renamed from: a */
    public final void m70263a(IdentitySide identitySide) {
        boolean z11 = ((IdentitySide) this.f57253a.get("CONTROLLER_CURRENT_SIDE")) != identitySide;
        this.f57253a.set("CONTROLLER_CURRENT_SIDE", identitySide);
        if (z11) {
            m69067a("setting current side to " + identitySide);
            C41696j.m91104d(this.f57255c, null, null, new C30384k(this, null), 3, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C30388m(final AbstractC28052C abstractC28052C, SavedStateHandle savedStateHandle, String str, InterfaceC29984m interfaceC29984m, C29070X c29070x, String str2, String str3) {
        InterfaceC41709m0 viewModelScope = ViewModelKt.getViewModelScope(abstractC28052C);
        super(savedStateHandle, str, c29070x, viewModelScope, new C30380i(abstractC28052C, null), new Function2() { // from class: com.sumsub.sns.internal.features.presentation.camera.u0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C30388m.m70262a(abstractC28052C, (AbstractC29149l0) obj, (String) obj2);
            }
        });
        this.f61132j = interfaceC29984m;
        this.f61133k = str2;
        this.f61134l = str3;
        this.f61135m = "CameraHelper";
        C41696j.m91104d(viewModelScope, null, null, new C30382j(this, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70262a(AbstractC28052C abstractC28052C, AbstractC29149l0 abstractC29149l0, String str) {
        AbstractC28052C.throwError$default(abstractC28052C, abstractC29149l0, str, false, null, 12, null);
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28070L
    /* JADX INFO: renamed from: a */
    public final String mo69066a() {
        return this.f61135m;
    }
}
