package com.sumsub.sns.internal.features.presentation.camera;

import androidx.camera.view.PreviewView;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.widget.camera.SNSCornersOverlayView;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30369d extends AbstractC28787t {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty[] f61089h = {AbstractC28118g.m69077a(C30369d.class, "cornersOverlay", "getCornersOverlay()Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;", 0), AbstractC28118g.m69077a(C30369d.class, "previewView", "getPreviewView()Landroidx/camera/view/PreviewView;", 0)};

    /* JADX INFO: renamed from: e */
    public final String f61090e;

    /* JADX INFO: renamed from: f */
    public final C28778k f61091f;

    /* JADX INFO: renamed from: g */
    public final C28778k f61092g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30369d(C30751t c30751t) {
        super(c30751t.f58549a, c30751t);
        int i11 = R$id.sns_corners_overlay;
        int i12 = R$id.sns_camera_preview;
        this.f61090e = "CameraFrame";
        this.f61091f = m69602a(i11);
        this.f61092g = m69602a(i12);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f61090e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        SNSCornersOverlayView sNSCornersOverlayView;
        C28778k c28778k = this.f61092g;
        KProperty[] kPropertyArr = f61089h;
        PreviewView previewView = (PreviewView) c28778k.getValue(this, kPropertyArr[1]);
        if (previewView != null && (sNSCornersOverlayView = (SNSCornersOverlayView) this.f61091f.getValue(this, kPropertyArr[0])) != null) {
            sNSCornersOverlayView.bind(previewView);
        }
        SNSCornersOverlayView.State state = SNSCornersOverlayView.State.DEFAULT;
        SNSCornersOverlayView sNSCornersOverlayView2 = (SNSCornersOverlayView) this.f61091f.getValue(this, kPropertyArr[0]);
        if (sNSCornersOverlayView2 != null) {
            sNSCornersOverlayView2.setState(state);
        }
    }
}
