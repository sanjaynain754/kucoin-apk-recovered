package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.core.widget.SNSLivenessFaceView;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32094h implements SNSLivenessFaceView.SNSFaceStateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SNSDefaultLiveness3dFaceFragment f65312a;

    public C32094h(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment) {
        this.f65312a = sNSDefaultLiveness3dFaceFragment;
    }

    @Override // com.sumsub.sns.core.widget.SNSLivenessFaceView.SNSFaceStateListener
    public final void onState(SNSLivenessFaceView.SNSFaceViewState sNSFaceViewState) {
        ((C32109k0) this.f65312a.f65152a.getValue()).f65349F = sNSFaceViewState == SNSLivenessFaceView.SNSFaceViewState.Recognized;
        if (sNSFaceViewState == SNSLivenessFaceView.SNSFaceViewState.Complete) {
            SNSDefaultLiveness3dFaceFragment.m70976a(this.f65312a);
        }
    }
}
