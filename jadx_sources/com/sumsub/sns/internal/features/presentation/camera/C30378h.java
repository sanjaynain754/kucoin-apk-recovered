package com.sumsub.sns.internal.features.presentation.camera;

import android.os.Bundle;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.view.PreviewView;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.camera.C28746l;
import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28776i;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30378h extends AbstractC28787t {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ KProperty[] f61107n = {AbstractC28118g.m69077a(C30378h.class, "previewView", "getPreviewView()Landroidx/camera/view/PreviewView;", 0), AbstractC28118g.m69077a(C30378h.class, "cornersOverlay", "getCornersOverlay()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30378h.class, "cameraInitAllowed", "getCameraInitAllowed()Z", 0), AbstractC28639a.m69485a(C30378h.class, "isFlashEnabled", "isFlashEnabled()Z", 0)};

    /* JADX INFO: renamed from: e */
    public final Function0 f61108e;

    /* JADX INFO: renamed from: f */
    public final Function1 f61109f;

    /* JADX INFO: renamed from: g */
    public final SuspendLambda f61110g;

    /* JADX INFO: renamed from: h */
    public final String f61111h;

    /* JADX INFO: renamed from: i */
    public final C28778k f61112i;

    /* JADX INFO: renamed from: j */
    public final C28778k f61113j;

    /* JADX INFO: renamed from: k */
    public final C28776i f61114k;

    /* JADX INFO: renamed from: l */
    public final C28776i f61115l;

    /* JADX INFO: renamed from: m */
    public C28746l f61116m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30378h(C30751t c30751t, Function0 function0, Function1 function1, Function2 function2) {
        super(c30751t.f58549a, c30751t);
        int i11 = R$id.sns_camera_preview;
        int i12 = R$id.sns_corners_overlay;
        this.f61108e = function0;
        this.f61109f = function1;
        this.f61110g = (SuspendLambda) function2;
        this.f61111h = "Camera";
        this.f61112i = m69602a(i11);
        this.f61113j = m69602a(i12);
        this.f61114k = new C28776i("CAMERA_INIT_ALLOWED", !C33048a.f67453P.m71434a());
        this.f61115l = new C28776i("IS_FLASH_ENABLED", false);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f61111h;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: j */
    public final void mo69481j() {
        CameraControl cameraControl;
        C28776i c28776i = this.f61115l;
        KProperty[] kPropertyArr = f61107n;
        KProperty kProperty = kPropertyArr[3];
        if (c28776i.m69599a(this)) {
            C28746l c28746l = this.f61116m;
            if (c28746l != null) {
                C33272c.f67816e.f67810a.mo68955d("CameraX", "Enable flash", null);
                Camera camera = c28746l.f58469n;
                if (camera != null && (cameraControl = camera.getCameraControl()) != null) {
                    cameraControl.enableTorch(true);
                }
                ImageCapture imageCapture = c28746l.f58466k;
                if (imageCapture != null) {
                    imageCapture.setFlashMode(1);
                }
            }
            C28776i c28776i2 = this.f61115l;
            KProperty kProperty2 = kPropertyArr[3];
            c28776i2.getClass();
            Bundle arguments = this.f58549a.getArguments();
            if (arguments != null) {
                arguments.putBoolean(m69603a(c28776i2.f58526a), true);
            }
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
        C28746l c28746l = this.f61116m;
        if (c28746l != null) {
            c28746l.m69572e();
        }
        this.f61116m = null;
    }

    /* JADX INFO: renamed from: n */
    public final void m70261n() {
        C28746l c28746l;
        C28746l c28746l2 = this.f61116m;
        if (c28746l2 != null) {
            c28746l2.m69572e();
        }
        this.f61116m = null;
        C30372e c30372e = (C30372e) this.f61108e.invoke();
        CameraX$Mode cameraX$Mode = c30372e.f61096b;
        String str = this.f61111h;
        C28776i c28776i = this.f61114k;
        KProperty[] kPropertyArr = f61107n;
        KProperty kProperty = kPropertyArr[2];
        C33272c.f67816e.f67810a.mo68955d(str, "initCamera: mode=" + cameraX$Mode + ", cameraInitAllowed=" + c28776i.m69599a(this), null);
        this.f61116m = new C28746l(cameraX$Mode, c30372e.f61097c, 0, c30372e.f61098d, c30372e.f61095a ? CameraSelector.DEFAULT_FRONT_CAMERA : CameraSelector.DEFAULT_BACK_CAMERA, null, new C30376g(this));
        C28776i c28776i2 = this.f61114k;
        KProperty kProperty2 = kPropertyArr[2];
        if (!c28776i2.m69599a(this) || (c28746l = this.f61116m) == null) {
            return;
        }
        c28746l.m69566a(this.f58549a.getViewLifecycleOwner(), (PreviewView) this.f61112i.getValue(this, kPropertyArr[0]), (Function0) null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        m70261n();
    }
}
