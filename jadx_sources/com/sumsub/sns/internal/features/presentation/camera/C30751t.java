package com.sumsub.sns.internal.features.presentation.camera;

import android.os.Bundle;
import android.view.View;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ImageCapture;
import androidx.camera.view.PreviewView;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.android.C28626A;
import com.sumsub.sns.internal.core.presentation.android.C28707v;
import com.sumsub.sns.internal.core.presentation.camera.C28746l;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28776i;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.Unit;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30751t extends AbstractC28787t {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ KProperty[] f62122m = {AbstractC28639a.m69485a(C30751t.class, "isPermissionChecked", "isPermissionChecked()Z", 0)};

    /* JADX INFO: renamed from: e */
    public final Function0 f62123e;

    /* JADX INFO: renamed from: f */
    public final String f62124f;

    /* JADX INFO: renamed from: g */
    public final C30378h f62125g;

    /* JADX INFO: renamed from: h */
    public final C30369d f62126h;

    /* JADX INFO: renamed from: i */
    public final C28707v f62127i;

    /* JADX INFO: renamed from: j */
    public final C30340C f62128j;

    /* JADX INFO: renamed from: k */
    public final C30366c f62129k;

    /* JADX INFO: renamed from: l */
    public final C28776i f62130l;

    public C30751t(AbstractC28133l abstractC28133l, Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function2 function4, Function0 function5, Function0 function6, Function1 function7) {
        super(abstractC28133l, null);
        this.f62123e = function2;
        this.f62124f = "FullCamera";
        this.f62125g = new C30378h(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.z0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30751t.m70445b(this.f62226b);
            }
        }, function3, function4);
        this.f62126h = new C30369d(this);
        this.f62127i = new C28707v(this, SetsKt.setOf(C28626A.f58259e), function1, new C30749s(abstractC28133l));
        this.f62128j = new C30340C(this);
        this.f62129k = new C30366c(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.a1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30751t.m70443a(this.f61067b);
            }
        }, function7, function5, function6, new C30363b());
        new C30339B(this, function0, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.b1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30751t.m70446c(this.f61074b);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.c1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C30751t.m70444a(this.f61088b, ((Boolean) obj).booleanValue());
            }
        }, new C30338A());
        new C30794w(this);
        this.f62130l = new C28776i("PERMISSION_CHECKED", false);
    }

    /* JADX INFO: renamed from: a */
    public static final C30360a m70443a(C30751t c30751t) {
        return ((C30747r) c30751t.f62123e.invoke()).f62118b;
    }

    /* JADX INFO: renamed from: b */
    public static final C30372e m70445b(C30751t c30751t) {
        return ((C30747r) c30751t.f62123e.invoke()).f62117a;
    }

    /* JADX INFO: renamed from: c */
    public static final C30800z m70446c(C30751t c30751t) {
        return ((C30747r) c30751t.f62123e.invoke()).f62119c;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f62124f;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        C28776i c28776i = this.f62130l;
        KProperty[] kPropertyArr = f62122m;
        KProperty kProperty = kPropertyArr[0];
        if (c28776i.m69599a(this)) {
            return;
        }
        C28776i c28776i2 = this.f62130l;
        KProperty kProperty2 = kPropertyArr[0];
        c28776i2.getClass();
        Bundle arguments = this.f58549a.getArguments();
        if (arguments != null) {
            arguments.putBoolean(m69603a(c28776i2.f58526a), true);
        }
        this.f62127i.m69523s();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70444a(C30751t c30751t, boolean z11) {
        CameraControl cameraControl;
        C30378h c30378h = c30751t.f62125g;
        C28746l c28746l = c30378h.f61116m;
        if (c28746l != null) {
            C33272c.f67816e.f67810a.mo68955d("CameraX", "Enable flash", null);
            Camera camera = c28746l.f58469n;
            if (camera != null && (cameraControl = camera.getCameraControl()) != null) {
                cameraControl.enableTorch(z11);
            }
            ImageCapture imageCapture = c28746l.f58466k;
            if (imageCapture != null) {
                imageCapture.setFlashMode(z11 ? 1 : 2);
            }
        }
        C28776i c28776i = c30378h.f61115l;
        KProperty kProperty = C30378h.f61107n[3];
        c28776i.getClass();
        Bundle arguments = c30378h.f58549a.getArguments();
        if (arguments != null) {
            arguments.putBoolean(c30378h.m69603a(c28776i.f58526a), z11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70447a(boolean z11) {
        C30378h c30378h = this.f62125g;
        C28778k c28778k = c30378h.f61112i;
        KProperty[] kPropertyArr = C30378h.f61107n;
        PreviewView previewView = (PreviewView) c28778k.getValue(c30378h, kPropertyArr[0]);
        if (previewView != null) {
            previewView.setVisibility(0);
        }
        View view = (View) c30378h.f61113j.getValue(c30378h, kPropertyArr[1]);
        if (view != null) {
            view.setVisibility(0);
        }
        this.f62129k.m70257a(z11);
    }
}
