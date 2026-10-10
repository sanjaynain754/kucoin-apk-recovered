package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30093a0;
import com.sumsub.sns.internal.features.domain.C30156e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModelFactory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "fragment", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment;", "<init>", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "key", "", "modelClass", "Ljava/lang/Class;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class EnterPhoneViewModelFactory extends AbstractSavedStateViewModelFactory {

    @NotNull
    private final EnterPhoneFragment fragment;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    @NotNull
    public <T extends ViewModel> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull SavedStateHandle handle) {
        C28578h serviceLocator$idensic_mobile_sdk_aar_defaultRelease = this.fragment.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease();
        return new EnterPhoneViewModel(new C30156e((InterfaceC29953a) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58168f.getValue(), (InterfaceC29984m) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58180r.getValue()), new C30093a0((InterfaceC29953a) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58168f.getValue(), (InterfaceC29921d) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58169g.getValue()), (InterfaceC29953a) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58168f.getValue(), (InterfaceC29984m) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58180r.getValue(), handle, serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58179q);
    }

    public EnterPhoneViewModelFactory(@NotNull EnterPhoneFragment enterPhoneFragment) {
        super(enterPhoneFragment, enterPhoneFragment.getArguments());
        this.fragment = enterPhoneFragment;
    }
}
