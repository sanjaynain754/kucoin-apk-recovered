package com.kubi.kyc.ui.kycv2;

import com.kubi.mvi.state.BaseStateVM;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ImagePreviewViewModel.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/ImagePreviewViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/kyc/ui/kycv2/ImagePreviewContract$UiIntent;", "Lcom/kubi/kyc/ui/kycv2/ImagePreviewContract$UIState;", "<init>", "()V", "initState", "getInitState", "()Lcom/kubi/kyc/ui/kycv2/ImagePreviewContract$UIState;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ImagePreviewViewModel extends BaseStateVM<Object, UIState> {
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 1, null);
    }
}
