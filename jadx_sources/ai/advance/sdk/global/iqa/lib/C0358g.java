package ai.advance.sdk.global.iqa.lib;

import ai.advance.common.camera.GuardianCameraViewV2;
import ai.advance.common.camera.GuardianCameraViewV3;
import ai.advance.sdk.global.iqa.lib.data.CropParams;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import androidx.webkit.ProxyConfig;
import java.util.List;
import org.json.JSONArray;
import p277g.C37738d;
import p277g.InterfaceC37735a;
import p611s.C44211c1;

/* JADX INFO: renamed from: ai.advance.sdk.global.iqa.lib.g */
/* JADX INFO: loaded from: classes23.dex */
public class C0358g extends GuardianCameraViewV3 {

    /* JADX INFO: renamed from: F */
    public boolean f1047F;

    /* JADX INFO: renamed from: G */
    public JSONArray f1048G;

    /* JADX INFO: renamed from: H */
    public CropParams f1049H;

    /* JADX INFO: renamed from: I */
    public boolean f1050I;

    /* JADX INFO: renamed from: J */
    public long f1051J;

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.lib.g$a */
    public class a implements Camera.AutoFocusCallback {
        public a() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z11, Camera camera) {
            C0358g c0358g = C0358g.this;
            c0358g.f1050I = false;
            c0358g.f1051J = System.currentTimeMillis();
        }
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV3, ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: O */
    public void mo1178O() {
        try {
            this.f1050I = false;
            super.mo1178O();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ C37738d m1406I0(Camera.Size size, List list) {
        String str;
        C37738d.b bVar = new C37738d.b("preview_size_select_finished");
        if (size == null) {
            str = "-1*-1";
        } else {
            str = size.width + ProxyConfig.MATCH_ALL_SCHEMES + size.height;
        }
        return bVar.m85089f(str).m85094k("support_preview_size_list", m1410M0(list)).m85096m();
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m1407J0() {
        return this.f1047F;
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: L */
    public Camera.Size mo86L(Camera.Parameters parameters) {
        this.f1048G = new JSONArray();
        final List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        float viewWidth = getViewWidth() / getViewHeight();
        final Camera.Size size = null;
        int i11 = 0;
        for (Camera.Size size2 : supportedPreviewSizes) {
            if (size == null) {
                i11 = size2.height;
                size = size2;
            } else if (!mo1186Y() || size2.height / size2.width <= viewWidth) {
                int i12 = size2.height;
                if (i12 > i11) {
                    size = size2;
                    i11 = i12;
                }
                this.f1048G.put(size2.width + ProxyConfig.MATCH_ALL_SCHEMES + size2.height);
            }
        }
        C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.k
            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: a */
            public final Object mo92a() {
                return this.f97695a.m1406I0(size, supportedPreviewSizes);
            }
        });
        return size;
    }

    /* JADX INFO: renamed from: L0 */
    public CropParams m1409L0() {
        Rect rect;
        Camera.Size size = this.f864g;
        if (size == null) {
            return new CropParams();
        }
        int i11 = size.width;
        int i12 = size.height;
        CropParams cropParams = new CropParams();
        Camera.Size size2 = this.f864g;
        cropParams.previewWidth = size2.width;
        cropParams.previewHeight = size2.height;
        int i13 = this.f869l;
        if (i13 == 270 || i13 == 180) {
            if (mo1186Y()) {
                rect = m1185X() ? new Rect(0, 0, (int) (this.f882y * i11), i12) : new Rect((int) ((1.0f - this.f882y) * i11), 0, i11, i12);
            } else {
                Camera.Size size3 = this.f864g;
                rect = ((float) size3.width) / ((float) size3.height) > ((float) getViewWidth()) / ((float) getViewHeight()) ? new Rect((int) (i11 * (1.0f - this.f881x)), 0, i11, i12) : new Rect(0, (int) (i12 * (1.0f - this.f882y)), i11, i12);
            }
        } else if (mo1186Y()) {
            rect = m1185X() ? new Rect((int) ((1.0f - this.f882y) * i11), 0, i11, i12) : new Rect(0, 0, (int) (this.f882y * i11), i12);
        } else {
            Camera.Size size4 = this.f864g;
            rect = ((float) size4.width) / ((float) size4.height) > ((float) getViewWidth()) / ((float) getViewHeight()) ? new Rect(0, 0, (int) (i11 * this.f881x), i12) : new Rect(0, 0, i11, (int) (i12 * this.f882y));
        }
        cropParams.cropRect = rect;
        return cropParams;
    }

    /* JADX INFO: renamed from: M0 */
    public JSONArray m1410M0(List<Camera.Size> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (Camera.Size size : list) {
                jSONArray.put(size.width + ProxyConfig.MATCH_ALL_SCHEMES + size.height);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: N0 */
    public void m1411N0() {
        synchronized (this.f897C) {
            try {
                if (this.f863f != null && m1408K0() && !m1185X()) {
                    Camera.Parameters parameters = this.f863f.getParameters();
                    parameters.setFlashMode(this.f1047F ? "off" : "torch");
                    this.f863f.setParameters(parameters);
                    this.f1047F = !this.f1047F;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    public Camera.AutoFocusCallback getAutoFocusCallback() {
        if (this.f874q == null) {
            this.f874q = new a();
        }
        return this.f874q;
    }

    public int getCameraAngle() {
        return this.f869l;
    }

    public int getCameraId() {
        return this.f866i;
    }

    public CropParams getCropParams() {
        if (this.f1049H == null) {
            this.f1049H = m1409L0();
        }
        return this.f1049H;
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: l0 */
    public void mo431l0() {
        RectF rectF;
        RectF rectF2;
        if (this.f864g != null) {
            float viewWidth = getViewWidth();
            float viewHeight = getViewHeight();
            Matrix matrix = new Matrix();
            if (mo1186Y()) {
                rectF = new RectF(0.0f, 0.0f, viewHeight, m1184W(this.f864g) * viewHeight);
                rectF2 = new RectF(0.0f, 0.0f, viewHeight, viewWidth);
            } else {
                rectF = new RectF(0.0f, 0.0f, viewWidth, viewHeight);
                rectF2 = new RectF(0.0f, 0.0f, viewWidth, viewHeight);
            }
            this.f881x = 1.0f;
            this.f882y = rectF.height() / rectF2.height();
            matrix.setRectToRect(rectF, rectF2, mo1186Y() ? Matrix.ScaleToFit.FILL : Matrix.ScaleToFit.START);
            setTransform(matrix);
            this.f1049H = m1409L0();
        }
    }

    public void setCameraCallback(GuardianCameraViewV2.InterfaceC0336g interfaceC0336g) {
        this.f862e = interfaceC0336g;
    }

    public C0358g(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m1408K0() {
        for (FeatureInfo featureInfo : getContext().getPackageManager().getSystemAvailableFeatures()) {
            if ("android.hardware.camera.flash".equals(featureInfo.name)) {
                return true;
            }
        }
        return false;
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: Y */
    public boolean mo1186Y() {
        return super.mo1186Y();
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: e0 */
    public void mo1189e0() {
        try {
            super.mo1189e0();
        } catch (Exception unused) {
        }
    }
}
