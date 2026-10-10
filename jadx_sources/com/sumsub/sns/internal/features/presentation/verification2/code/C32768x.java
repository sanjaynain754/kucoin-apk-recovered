package com.sumsub.sns.internal.features.presentation.verification2.code;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28945b;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30083Q;
import com.sumsub.sns.internal.features.domain.C30101b;
import p852kotlin.jvm.internal.Reflection;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32768x extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C32759o f67067a;

    /* JADX INFO: renamed from: b */
    public final C28945b f67068b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        AbstractC28052C viewModel$idensic_mobile_sdk_aar_defaultRelease = ((AbstractC28133l) this.f67067a.getParentFragment()).getViewModel$idensic_mobile_sdk_aar_defaultRelease();
        if (!(viewModel$idensic_mobile_sdk_aar_defaultRelease instanceof InterfaceC32769y)) {
            viewModel$idensic_mobile_sdk_aar_defaultRelease = null;
        }
        InterfaceC32769y interfaceC32769y = (InterfaceC32769y) viewModel$idensic_mobile_sdk_aar_defaultRelease;
        if (interfaceC32769y != null) {
            C28578h serviceLocator$idensic_mobile_sdk_aar_defaultRelease = this.f67067a.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease();
            C28945b c28945b = this.f67068b;
            return new C32767w(interfaceC32769y, c28945b.f58848a, c28945b.f58849b, new C30083Q((InterfaceC29921d) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58169g.getValue()), new C30101b((InterfaceC29921d) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58169g.getValue()), (InterfaceC29953a) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58168f.getValue(), (InterfaceC29984m) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58180r.getValue());
        }
        throw new IllegalStateException((Reflection.getOrCreateKotlinClass(C32759o.class).getSimpleName() + " requires parent VM to implement " + Reflection.getOrCreateKotlinClass(InterfaceC32769y.class).getSimpleName()).toString());
    }

    public C32768x(C32759o c32759o, C28945b c28945b) {
        super(c32759o, c32759o.getArguments());
        this.f67067a = c32759o;
        this.f67068b = c28945b;
    }
}
