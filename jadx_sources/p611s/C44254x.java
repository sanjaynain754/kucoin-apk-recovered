package p611s;

import ai.advance.common.camera.GuardianCameraViewV2;
import ai.advance.common.entity.BaseResultEntity;
import ai.advance.sdk.global.iqa.lib.C0358g;
import ai.advance.sdk.global.iqa.lib.GlobalIQAView;
import ai.advance.sdk.global.iqa.lib.JNI;
import ai.advance.sdk.global.iqa.lib.code.ErrorCode;
import ai.advance.sdk.global.iqa.lib.code.ImageWarnCode;
import ai.advance.sdk.global.iqa.lib.data.CropParams;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import com.facebook.react.uimanager.ViewProps;
import com.sensorsdata.abtest.entity.AppConstants;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import p277g.C37738d;
import p277g.InterfaceC37735a;
import p295h.C38063b;
import p387k.C40826a;
import p387k.C40828c;
import p387k.C40835j;
import p626t.C44603a;
import p626t.C44604b;
import p626t.C44605c;
import p647u.InterfaceC45081b;
import p647u.InterfaceC45082c;
import p647u.InterfaceC45083d;
import p647u.InterfaceC45084e;
import p647u.InterfaceC45085f;
import p647u.InterfaceC45086g;

/* JADX INFO: renamed from: s.x */
/* JADX INFO: loaded from: classes23.dex */
public class C44254x {

    /* JADX INFO: renamed from: c */
    public final C0358g f97775c;

    /* JADX INFO: renamed from: d */
    public final GlobalIQAView f97776d;

    /* JADX INFO: renamed from: e */
    public final Context f97777e;

    /* JADX INFO: renamed from: h */
    public int f97780h;

    /* JADX INFO: renamed from: i */
    public long f97781i;

    /* JADX INFO: renamed from: j */
    public boolean f97782j;

    /* JADX INFO: renamed from: n */
    public InterfaceC45085f f97786n;

    /* JADX INFO: renamed from: p */
    public volatile boolean f97788p;

    /* JADX INFO: renamed from: q */
    public Bitmap f97789q;

    /* JADX INFO: renamed from: r */
    public C44237o0 f97790r;

    /* JADX INFO: renamed from: a */
    public final String f97773a = AppConstants.AB_TEST_SUCCESS;

    /* JADX INFO: renamed from: b */
    public final String f97774b = "NO_IMAGE_CAPTURED";

    /* JADX INFO: renamed from: k */
    public int f97783k = 0;

    /* JADX INFO: renamed from: l */
    public C38063b f97784l = null;

    /* JADX INFO: renamed from: m */
    public int f97785m = 0;

    /* JADX INFO: renamed from: o */
    public byte[] f97787o = null;

    /* JADX INFO: renamed from: f */
    public final Handler f97778f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    public final ExecutorService f97779g = Executors.newFixedThreadPool(3);

    /* JADX INFO: renamed from: s.x$a */
    public class a implements GuardianCameraViewV2.InterfaceC0336g {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f97791b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC45082c f97792c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C44224i f97793d;

        public a(long j11, InterfaceC45082c interfaceC45082c, C44224i c44224i) {
            this.f97791b = j11;
            this.f97792c = interfaceC45082c;
            this.f97793d = c44224i;
        }

        /* JADX INFO: renamed from: e */
        private void m97665e() {
            if (C44254x.this.f97777e instanceof Activity) {
                int iM89331e = C40828c.m89331e(C44206b.m97446f(), (Activity) C44254x.this.f97777e);
                int cameraAngle = C44254x.this.f97775c.getCameraAngle();
                if (Math.abs(cameraAngle - iM89331e) == 180) {
                    C44254x.this.m97661w("startDetectionWithPhotoCapture", "Page rotation，from " + iM89331e + " to " + cameraAngle);
                    C44254x.this.m97645a0();
                }
            }
        }

        @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
        /* JADX INFO: renamed from: b */
        public void mo89b() {
            m97666f(AppConstants.AB_TEST_SUCCESS);
            this.f97792c.mo1342h(true);
        }

        @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
        /* JADX INFO: renamed from: c */
        public void mo90c(byte[] bArr, Camera.Size size) {
            this.f97793d.m97522a();
            m97665e();
            C44254x.this.f97790r.m97573o(new C44210c0(bArr, C44254x.this.f97775c.getCropParams(), C44254x.this.f97775c.getCameraAngle()));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C37738d m97667d(long j11, String str) {
            String str2;
            Camera.Size previewSize = C44254x.this.f97775c.getPreviewSize();
            C37738d.b bVarM85085b = new C37738d.b("camera_open_finished").m85086c((int) (System.currentTimeMillis() - j11)).m85085b(str);
            if (previewSize == null) {
                str2 = "-1*-1";
            } else {
                str2 = previewSize.width + ProxyConfig.MATCH_ALL_SCHEMES + previewSize.height;
            }
            return bVarM85085b.m85088e(str2).m85096m();
        }

        @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
        /* JADX INFO: renamed from: i */
        public void mo91i(Exception exc) {
            m97666f(exc == null ? "UNKNOWN" : exc.getMessage());
            C44203a.m97442o(ErrorCode.CAMERA_OPEN_FAILED);
            this.f97792c.mo1342h(false);
        }

        /* JADX INFO: renamed from: f */
        private void m97666f(final String str) {
            C44211c1 c44211c1M97482R = C44211c1.m97482R();
            final long j11 = this.f97791b;
            c44211c1M97482R.m83469L(new InterfaceC37735a() { // from class: s.w
                @Override // p277g.InterfaceC37735a
                /* JADX INFO: renamed from: a */
                public final Object mo92a() {
                    return this.f97768a.m97667d(j11, str);
                }
            });
        }

        @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: renamed from: s.x$b */
    public class b implements InterfaceC45081b {

        /* JADX INFO: renamed from: a */
        public volatile int f97795a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC45084e f97796b;

        public b(InterfaceC45084e interfaceC45084e) {
            this.f97796b = interfaceC45084e;
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ C37738d m97671j() {
            return new C37738d.b("capture_finished").m85085b("NO_YUV_DATA").m85096m();
        }

        /* JADX INFO: renamed from: k */
        public static /* synthetic */ C37738d m97672k() {
            return new C37738d.b("capture_finished").m85085b("YUV_TO_BITMAP_FAILED").m85096m();
        }

        /* JADX INFO: renamed from: l */
        public static /* synthetic */ C37738d m97673l() {
            return new C37738d.b("capture_finished").m85085b(AppConstants.AB_TEST_SUCCESS).m85096m();
        }

        @Override // p647u.InterfaceC45081b
        /* JADX INFO: renamed from: a */
        public void mo97674a(int i11) {
            if (i11 == this.f97795a) {
                return;
            }
            this.f97795a = i11;
            C44254x.this.m97661w("onRemainingSecondsChanged", String.valueOf(i11));
            this.f97796b.mo1275a(i11);
            if (i11 == 0) {
                C44254x.this.m97661w("onRemainingSecondsChanged", "Scan timeout");
                C44254x.this.m97646b0();
                ErrorCode errorCode = ErrorCode.SCAN_TIMEOUT;
                C44203a.m97442o(errorCode);
                this.f97796b.mo1278f(errorCode);
            }
        }

        @Override // p647u.InterfaceC45081b
        /* JADX INFO: renamed from: c */
        public void mo97676c() {
            C44254x.this.m97660v("onInitStart");
            this.f97796b.mo1276c();
        }

        @Override // p647u.InterfaceC45081b
        /* JADX INFO: renamed from: d */
        public void mo97677d() {
            C44254x.this.m97660v("onDetectionStart");
        }

        @Override // p647u.InterfaceC45081b
        /* JADX INFO: renamed from: e */
        public void mo97678e(ImageWarnCode imageWarnCode, C44209c c44209c) {
            C44254x c44254x = C44254x.this;
            if (c44254x.f97784l != null && imageWarnCode == ImageWarnCode.NO_CARD && c44254x.f97780h != 0) {
                C44254x c44254x2 = C44254x.this;
                c44254x2.f97784l.m85948f(c44254x2.f97780h, false, 0L);
            }
            if (c44209c.m97481b() || c44209c.f97582c) {
                C44254x.this.m97662x(c44209c.m97481b() ? "blur" : "card_not_exists", c44209c.f97580a);
            }
            Log.d("IQAViewController", "isCardGlossy onDetectionWarn: " + imageWarnCode.name());
            this.f97796b.mo1279g(imageWarnCode);
        }

        @Override // p647u.InterfaceC45081b
        /* JADX INFO: renamed from: b */
        public void mo97675b(boolean z11, String str, String str2) {
            if (!JNI.isOP() && JNI.isTestAccount()) {
                Toast.makeText(C44254x.this.f97777e, "This is a test account for development and debugging only!", 1).show();
            }
            ErrorCode errorCode = ErrorCode.MODEL_ERROR;
            if (errorCode.name().equals(str)) {
                C44203a.m97442o(errorCode);
                this.f97796b.mo1278f(errorCode);
            }
            this.f97796b.mo1277e(new C44603a(z11, str, str2));
        }

        @Override // p647u.InterfaceC45081b
        /* JADX INFO: renamed from: f */
        public void mo97679f() {
            C44211c1.m97482R().m83470M("capture_started");
            if (C44254x.this.f97790r == null) {
                return;
            }
            if (C44254x.this.f97790r.f97729r == null) {
                C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.y
                    @Override // p277g.InterfaceC37735a
                    /* JADX INFO: renamed from: a */
                    public final Object mo92a() {
                        return C44254x.b.m97671j();
                    }
                });
                ErrorCode errorCode = ErrorCode.NO_BEST_IMAGE;
                C44203a.m97442o(errorCode);
                this.f97796b.mo1278f(errorCode);
                return;
            }
            Bitmap bitmapM97629k = C44254x.m97629k(C44254x.this.f97790r.f97729r.m97502a(), C44254x.this.m97639N(), C44254x.this.f97775c.getCropParams(), C44254x.this.f97775c.mo1186Y(), C44254x.this.f97775c.m1185X(), C44254x.this.f97775c.getCameraAngle());
            if (bitmapM97629k == null) {
                C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.z
                    @Override // p277g.InterfaceC37735a
                    /* JADX INFO: renamed from: a */
                    public final Object mo92a() {
                        return C44254x.b.m97672k();
                    }
                });
                ErrorCode errorCode2 = ErrorCode.NO_BEST_IMAGE;
                C44203a.m97442o(errorCode2);
                this.f97796b.mo1278f(errorCode2);
                return;
            }
            C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.a0
                @Override // p277g.InterfaceC37735a
                /* JADX INFO: renamed from: a */
                public final Object mo92a() {
                    return C44254x.b.m97673l();
                }
            });
            C44254x.this.f97775c.mo1178O();
            if (C44254x.this.f97790r != null) {
                C44254x.this.f97790r.m97567N();
            }
            C44254x.this.m97658t(bitmapM97629k);
            C44254x.this.m97636F(bitmapM97629k, this.f97796b);
        }
    }

    /* JADX INFO: renamed from: s.x$c */
    public class c implements GuardianCameraViewV2.InterfaceC0336g {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f97798b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C44224i f97799c;

        public c(long j11, C44224i c44224i) {
            this.f97798b = j11;
            this.f97799c = c44224i;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ C37738d m97681d(long j11, String str, String str2) {
            return new C37738d.b("camera_open_finished").m85086c((int) (System.currentTimeMillis() - j11)).m85085b(str).m85088e(str2).m85096m();
        }

        /* JADX INFO: renamed from: e */
        private void m97682e() {
            if (C44254x.this.f97777e instanceof Activity) {
                int iM89331e = C40828c.m89331e(C44206b.m97446f(), (Activity) C44254x.this.f97777e);
                int cameraAngle = C44254x.this.f97775c.getCameraAngle();
                if (Math.abs(cameraAngle - iM89331e) == 180) {
                    C44254x.this.m97661w("startDetectionWithPhotoCapture", "Page rotation，from " + iM89331e + " to " + cameraAngle);
                    C44254x.this.f97775c.mo1189e0();
                }
            }
        }

        /* JADX INFO: renamed from: f */
        private void m97683f(final String str) {
            final String str2;
            Camera.Size previewSize = C44254x.this.f97775c.getPreviewSize();
            if (previewSize == null) {
                str2 = "-1*-1";
            } else {
                str2 = previewSize.width + ProxyConfig.MATCH_ALL_SCHEMES + previewSize.height;
            }
            C44211c1 c44211c1M97482R = C44211c1.m97482R();
            final long j11 = this.f97798b;
            c44211c1M97482R.m83469L(new InterfaceC37735a() { // from class: s.b0
                @Override // p277g.InterfaceC37735a
                /* JADX INFO: renamed from: a */
                public final Object mo92a() {
                    return C44254x.c.m97681d(j11, str, str2);
                }
            });
        }

        @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
        /* JADX INFO: renamed from: b */
        public void mo89b() {
            m97683f(AppConstants.AB_TEST_SUCCESS);
        }

        @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
        /* JADX INFO: renamed from: c */
        public void mo90c(byte[] bArr, Camera.Size size) {
            this.f97799c.m97522a();
            C44254x.this.f97787o = bArr;
            if (!C44254x.this.f97788p) {
                m97682e();
                C44254x.this.f97790r.m97573o(new C44210c0(bArr, C44254x.this.f97775c.getCropParams(), C44254x.this.f97775c.getCameraAngle()));
                return;
            }
            C44254x c44254x = C44254x.this;
            c44254x.f97789q = C44254x.m97629k(c44254x.f97787o, C44254x.this.m97639N(), C44254x.this.f97775c.getCropParams(), C44254x.this.f97775c.mo1186Y(), C44254x.this.f97775c.m1185X(), C44254x.this.f97775c.getCameraAngle());
            C44254x c44254x2 = C44254x.this;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Take photo from wait yuv finish,bitmap ");
            sb2.append(C44254x.this.f97789q == null ? "is null" : "exists");
            c44254x2.m97661w("onGetYuvData", sb2.toString());
            C44254x c44254x3 = C44254x.this;
            c44254x3.m97658t(c44254x3.f97789q);
            if (C44254x.this.f97786n != null) {
                C44254x.this.f97786n.mo1272a(new C44604b(C44254x.this.f97789q != null, C44254x.this.f97789q == null ? "NO_IMAGE_CAPTURED" : AppConstants.AB_TEST_SUCCESS));
            }
        }

        @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
        /* JADX INFO: renamed from: i */
        public void mo91i(Exception exc) {
            if (exc != null) {
                exc.printStackTrace();
            }
            m97683f(exc == null ? "UNKNOWN" : exc.getMessage());
        }

        @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: renamed from: s.x$d */
    public class d implements InterfaceC45081b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC45083d f97801a;

        public d(InterfaceC45083d interfaceC45083d) {
            this.f97801a = interfaceC45083d;
        }

        @Override // p647u.InterfaceC45081b
        /* JADX INFO: renamed from: c */
        public void mo97676c() {
            this.f97801a.mo1276c();
        }

        @Override // p647u.InterfaceC45081b
        /* JADX INFO: renamed from: b */
        public void mo97675b(boolean z11, String str, String str2) {
            if (!JNI.isOP() && JNI.isTestAccount()) {
                Toast.makeText(C44254x.this.f97777e, "This is a test account for development and debugging only!", 1).show();
            }
            ErrorCode errorCode = ErrorCode.MODEL_ERROR;
            if (errorCode.name().equals(str)) {
                C44203a.m97442o(errorCode);
            }
            this.f97801a.mo1277e(new C44603a(z11, str, str2));
        }

        @Override // p647u.InterfaceC45081b
        /* JADX INFO: renamed from: e */
        public void mo97678e(ImageWarnCode imageWarnCode, C44209c c44209c) {
            String str;
            if (!c44209c.m97481b() && !c44209c.f97582c) {
                return;
            }
            C44254x c44254x = C44254x.this;
            if (c44209c.m97481b()) {
                str = "blur";
            } else {
                str = "card_not_exists";
            }
            c44254x.m97662x(str, c44209c.f97580a);
        }

        @Override // p647u.InterfaceC45081b
        /* JADX INFO: renamed from: d */
        public void mo97677d() {
        }

        @Override // p647u.InterfaceC45081b
        /* JADX INFO: renamed from: f */
        public void mo97679f() {
        }

        @Override // p647u.InterfaceC45081b
        /* JADX INFO: renamed from: a */
        public void mo97674a(int i11) {
        }
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m97629k(byte[] bArr, int i11, CropParams cropParams, boolean z11, boolean z12, int i12) {
        if (bArr == null || cropParams == null) {
            return null;
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, cropParams.previewWidth, cropParams.previewHeight, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(cropParams.cropRect, JNI.getCompressQuality(), byteArrayOutputStream);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapM89318d = C40826a.m89318d(byteArrayOutputStream, options);
        if (Math.min(bitmapM89318d.getWidth(), bitmapM89318d.getHeight()) <= i11) {
            return C44234n.m97532a(bitmapM89318d, z11, z12, i12);
        }
        Matrix matrix = new Matrix();
        float fMin = i11 / Math.min(bitmapM89318d.getWidth(), bitmapM89318d.getHeight());
        matrix.setScale(fMin, fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM89318d, 0, 0, bitmapM89318d.getWidth(), bitmapM89318d.getHeight(), matrix, true);
        if (bitmapCreateBitmap != bitmapM89318d) {
            bitmapM89318d.recycle();
        }
        return C44234n.m97532a(bitmapCreateBitmap, z11, z12, i12);
    }

    /* JADX INFO: renamed from: v */
    public void m97660v(String str) {
        m97661w(str, null);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ C37738d m97606D(String str) {
        return new C37738d.b("upload_image_data_prepare_finished").m85085b("BITMAP_IS_NULL").m85088e(str).m85096m();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ C37738d m97609I(String str) {
        return new C37738d.b("upload_image_data_prepare_finished").m85085b("BITMAP_IS_RECYCLED").m85088e(str).m85096m();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ C37738d m97610K(String str) {
        return new C37738d.b("upload_image_data_prepare_finished").m85085b("DETECTOR_IS_NULL").m85088e(str).m85096m();
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ C37738d m97617X() {
        return new C37738d.b("upload_image_data_prepare_finished").m85085b(AppConstants.AB_TEST_SUCCESS).m85096m();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C37738d m97630l(JSONObject jSONObject, String str) {
        return new C37738d.b("auto_focus_called").m85093j(jSONObject).m85088e(str).m85096m();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C37738d m97631m(boolean z11) {
        return new C37738d.b("back_pressed").m85088e(Boolean.valueOf(z11)).m85096m();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m97632s(BaseResultEntity baseResultEntity, InterfaceC45086g interfaceC45086g, String str) {
        String string;
        if (baseResultEntity.success) {
            try {
                string = new JSONObject(baseResultEntity.data).getString("IDVID");
            } catch (Exception unused) {
                string = null;
            }
        } else {
            string = null;
        }
        interfaceC45086g.mo1273b(new C44605c(baseResultEntity.success, baseResultEntity.code, baseResultEntity.message, str, baseResultEntity.transactionId, string, "PAY".equals(baseResultEntity.pricingStrategy)));
    }

    /* JADX INFO: renamed from: A */
    public void m97634A(@NonNull InterfaceC45086g interfaceC45086g) {
        C44237o0 c44237o0 = this.f97790r;
        if (c44237o0 == null || c44237o0.m97576u().f97654d) {
            m97661w("usePhoto", "Use photo failed,scan mode");
        } else {
            m97636F(this.f97789q, interfaceC45086g);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m97635E() {
        m97660v("clearQueue");
        C44237o0 c44237o0 = this.f97790r;
        if (c44237o0 != null) {
            c44237o0.m97568j();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m97637J() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mCameraView is ");
        sb2.append(this.f97775c == null ? "null" : "not null");
        m97661w("closeCamera", sb2.toString());
        C0358g c0358g = this.f97775c;
        if (c0358g != null) {
            c0358g.mo1178O();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m97638M() {
        m97660v(TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC);
        m97646b0();
        this.f97778f.removeCallbacksAndMessages(null);
        C38063b c38063b = this.f97784l;
        if (c38063b != null) {
            c38063b.m85947e();
        }
    }

    /* JADX INFO: renamed from: N */
    public final int m97639N() {
        C44220g c44220gM97576u;
        int i11;
        C44237o0 c44237o0 = this.f97790r;
        return (c44237o0 == null || (c44220gM97576u = c44237o0.m97576u()) == null || (i11 = c44220gM97576u.f97661k) == 0) ? JNI.getOutputPictureMinSize() : i11;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m97640Q() {
        return this.f97790r != null;
    }

    /* JADX INFO: renamed from: S */
    public boolean m97641S() {
        C0358g c0358g = this.f97775c;
        if (c0358g != null) {
            return c0358g.m1185X();
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    public boolean m97642U() {
        C0358g c0358g = this.f97775c;
        if (c0358g != null) {
            return c0358g.m1407J0();
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public boolean m97643V() {
        C0358g c0358g = this.f97775c;
        if (c0358g != null) {
            return c0358g.m1408K0();
        }
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public void m97644Z() {
        C44237o0 c44237o0 = this.f97790r;
        if (c44237o0 == null || c44237o0.m97576u().f97654d) {
            m97661w("notUsePhoto", "Use photo failed,scan mode");
            return;
        }
        m97661w("notUsePhoto", "Not use photo");
        m97658t(null);
        C44237o0 c44237o1 = this.f97790r;
        if (c44237o1 != null) {
            c44237o1.m97566M();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m97645a0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mCameraView is ");
        sb2.append(this.f97775c == null ? "null" : "not null");
        m97661w("restartCamera", sb2.toString());
        C0358g c0358g = this.f97775c;
        if (c0358g != null) {
            c0358g.mo1189e0();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m97646b0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mDetector is ");
        sb2.append(this.f97790r == null ? "null" : "not null");
        m97661w("stopDetection", sb2.toString());
        m97637J();
        C44237o0 c44237o0 = this.f97790r;
        if (c44237o0 != null) {
            c44237o0.m97567N();
            this.f97790r.m97563J();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m97647c0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mCameraView is ");
        sb2.append(this.f97775c == null ? "null" : "not null");
        m97661w("toggleLight", sb2.toString());
        C0358g c0358g = this.f97775c;
        if (c0358g != null) {
            c0358g.m1411N0();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Toggle light ");
            sb3.append(m97642U() ? ViewProps.ON : "off");
            m97661w("toggleLight", sb3.toString());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m97650f0() {
        C0358g c0358g = this.f97775c;
        if (c0358g != null) {
            c0358g.mo1189e0();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m97651g0(int i11) {
        this.f97780h = i11;
    }

    /* JADX INFO: renamed from: n */
    public String m97653n(@NonNull C44212d c44212d, @NonNull InterfaceC45082c interfaceC45082c) {
        C44237o0 c44237o0M97656q;
        C44220g c44220gM97507b = new C44220g.a().m97508c(c44212d.f97610b).m97512g(true).m97514i(c44212d.f97609a).m97509d(c44212d.f97611c).m97513h(c44212d.f97613e).m97506a(c44212d.f97612d).m97515j(c44212d.f97615g).m97511f(this.f97775c.getCameraId() == 1).m97516k(C44234n.m97536e(this.f97777e)).m97510e(C40835j.m89369c()).m97507b();
        this.f97783k++;
        this.f97775c.setVisibility(0);
        m97658t(null);
        if (c44212d.f97614f) {
            this.f97784l = new C38063b(this.f97775c.getContext());
        }
        C44224i c44224i = new C44224i("camera");
        a aVar = new a(System.currentTimeMillis(), interfaceC45082c, c44224i);
        if (m97640Q()) {
            m97661w("startDetectionWithScan", "ScanCalledTimes: " + this.f97783k);
            this.f97790r.m97563J();
            this.f97775c.setCameraCallback(aVar);
            this.f97775c.mo1189e0();
            c44237o0M97656q = m97656q(interfaceC45082c, c44220gM97507b);
            this.f97790r = c44237o0M97656q;
        } else {
            this.f97790r = m97656q(interfaceC45082c, c44220gM97507b);
            m97661w("startDetectionWithScan", "First time Scan call");
            C44211c1.m97482R().m83470M("camera_open_started");
            C0358g c0358g = this.f97775c;
            c0358g.mo415b0(c0358g.getCameraId(), aVar);
            c44237o0M97656q = this.f97790r;
        }
        c44237o0M97656q.f97723l = c44224i;
        c44237o0M97656q.m97565L();
        return this.f97790r.m97576u().f97655e;
    }

    /* JADX INFO: renamed from: o */
    public String m97654o(@NonNull C44215e c44215e, @NonNull InterfaceC45083d interfaceC45083d) {
        C44220g c44220gM97507b = new C44220g.a().m97508c(c44215e.f97624b).m97512g(false).m97514i(c44215e.f97623a).m97509d(c44215e.f97625c).m97506a(c44215e.f97626d).m97513h(c44215e.f97627e).m97511f(this.f97775c.getCameraId() == 1).m97516k(C44234n.m97536e(this.f97777e)).m97510e(C40835j.m89369c()).m97507b();
        this.f97785m++;
        m97658t(null);
        C44224i c44224i = new C44224i("camera");
        c cVar = new c(System.currentTimeMillis(), c44224i);
        if (m97640Q()) {
            m97661w("startDetectionWithPhotoCapture", "PhotoCaptureTimes: " + this.f97785m);
            this.f97790r.m97563J();
            m97645a0();
            this.f97790r = m97655p(interfaceC45083d, c44220gM97507b);
            this.f97775c.setCameraCallback(cVar);
            C44237o0 c44237o0 = this.f97790r;
            c44237o0.f97723l = c44224i;
            c44237o0.m97565L();
            c44220gM97507b = this.f97790r.m97576u();
        } else {
            this.f97790r = m97655p(interfaceC45083d, c44220gM97507b);
            m97661w("startDetectionWithPhotoCapture", "First PhotoCapture call");
            this.f97790r.f97723l = c44224i;
            C44211c1.m97482R().m83470M("camera_open_started");
            C0358g c0358g = this.f97775c;
            c0358g.mo415b0(c0358g.getCameraId(), cVar);
            this.f97790r.m97565L();
        }
        return c44220gM97507b.f97655e;
    }

    /* JADX INFO: renamed from: p */
    public final C44237o0 m97655p(InterfaceC45083d interfaceC45083d, C44220g c44220g) {
        C44237o0 c44237o0 = new C44237o0(this.f97777e, c44220g.f97651a, c44220g);
        c44237o0.m97574q(new d(interfaceC45083d));
        return c44237o0;
    }

    /* JADX INFO: renamed from: q */
    public final C44237o0 m97656q(@NonNull InterfaceC45084e interfaceC45084e, C44220g c44220g) {
        C44237o0 c44237o0 = new C44237o0(this.f97777e, c44220g.f97651a, c44220g);
        c44237o0.m97574q(new b(interfaceC45084e));
        return c44237o0;
    }

    /* JADX INFO: renamed from: r */
    public void m97657r() {
        m97662x("by_user", null);
    }

    /* JADX INFO: renamed from: t */
    public final void m97658t(Bitmap bitmap) {
        m97661w("preview", bitmap == null ? "clear preview" : "preview bitmap");
        this.f97776d.f979c.setImageBitmap(bitmap);
    }

    /* JADX INFO: renamed from: w */
    public void m97661w(String str, String str2) {
        C44251v0.m97601f(str, "IQAViewController", str2);
    }

    /* JADX INFO: renamed from: x */
    public void m97662x(final String str, final JSONObject jSONObject) {
        if (this.f97775c == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0358g c0358g = this.f97775c;
            long j11 = jCurrentTimeMillis - c0358g.f1051J;
            if (c0358g.f1050I || j11 <= JNI.getAutoFocusInterval()) {
                return;
            }
            this.f97775c.f1050I = true;
            C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.o
                @Override // p277g.InterfaceC37735a
                /* JADX INFO: renamed from: a */
                public final Object mo92a() {
                    return C44254x.m97630l(jSONObject, str);
                }
            });
            this.f97775c.mo1173I();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: z */
    public void m97663z(InterfaceC45085f interfaceC45085f) {
        C44237o0 c44237o0 = this.f97790r;
        if (c44237o0 == null) {
            m97661w("takePhoto", "Detector is null");
            interfaceC45085f.mo1272a(new C44604b(false, "NOT_INIT_DETECTOR"));
            return;
        }
        if (c44237o0.m97576u().f97654d) {
            m97661w("takePhoto", "Take photo failed,current is scan mode");
            return;
        }
        m97661w("takePhoto", "Start take photo");
        this.f97786n = interfaceC45085f;
        this.f97790r.m97567N();
        if (this.f97778f == null) {
            m97661w("takePhoto", "Take photo MainHandler is null");
            return;
        }
        if (this.f97787o == null) {
            m97661w("takePhoto", "Last camera data is null,capture next yuv frame");
            this.f97788p = true;
            return;
        }
        m97661w("takePhoto", "Use last camera data to take photo");
        Bitmap bitmapM97629k = m97629k(this.f97787o, m97639N(), this.f97775c.getCropParams(), this.f97775c.mo1186Y(), this.f97775c.m1185X(), this.f97775c.getCameraAngle());
        this.f97789q = bitmapM97629k;
        m97658t(bitmapM97629k);
        if (this.f97786n != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Take photo finish,bitmap ");
            sb2.append(this.f97789q == null ? "is null" : "exists");
            m97661w("takePhoto", sb2.toString());
            InterfaceC45085f interfaceC45085f2 = this.f97786n;
            Bitmap bitmap = this.f97789q;
            interfaceC45085f2.mo1272a(new C44604b(bitmap != null, bitmap == null ? "NO_IMAGE_CAPTURED" : AppConstants.AB_TEST_SUCCESS));
        }
    }

    public C44254x(GlobalIQAView globalIQAView) {
        this.f97777e = globalIQAView.getContext();
        this.f97776d = globalIQAView;
        this.f97775c = globalIQAView.f978b;
    }

    /* JADX INFO: renamed from: F */
    public final void m97636F(final Bitmap bitmap, @NonNull final InterfaceC45086g interfaceC45086g) {
        C44211c1.m97482R().m83470M("upload_image_data_prepare_started");
        interfaceC45086g.mo1274d();
        if (bitmap == null) {
            final String str = "Bitmap is null";
            C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.p
                @Override // p277g.InterfaceC37735a
                /* JADX INFO: renamed from: a */
                public final Object mo92a() {
                    return C44254x.m97606D(str);
                }
            });
            interfaceC45086g.mo1273b(new C44605c(false, ErrorCode.NO_BEST_IMAGE.name(), "Bitmap is null", null, null, null, false));
        } else if (bitmap.isRecycled()) {
            final String str2 = "Bitmap is recycled";
            C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.q
                @Override // p277g.InterfaceC37735a
                /* JADX INFO: renamed from: a */
                public final Object mo92a() {
                    return C44254x.m97609I(str2);
                }
            });
            interfaceC45086g.mo1273b(new C44605c(false, ErrorCode.NO_BEST_IMAGE.name(), "Bitmap is recycled", null, null, null, false));
        } else {
            if (this.f97790r == null) {
                final String str3 = "Detector is not initialized";
                C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.r
                    @Override // p277g.InterfaceC37735a
                    /* JADX INFO: renamed from: a */
                    public final Object mo92a() {
                        return C44254x.m97610K(str3);
                    }
                });
                m97661w("requestUploadImageApi", "Detector is null");
                interfaceC45086g.mo1273b(new C44605c(false, "NOT_INIT_DETECTOR", "Detector is not initialized", null, null, null, false));
                return;
            }
            C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.s
                @Override // p277g.InterfaceC37735a
                /* JADX INFO: renamed from: a */
                public final Object mo92a() {
                    return C44254x.m97617X();
                }
            });
            this.f97779g.execute(new Runnable() { // from class: s.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97756b.m97659u(bitmap, interfaceC45086g);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m97648d0(final boolean z11) {
        C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.u
            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: a */
            public final Object mo92a() {
                return C44254x.m97631m(z11);
            }
        });
        C44203a.m97442o(ErrorCode.USER_GIVE_UP);
    }

    /* JADX INFO: renamed from: e0 */
    public void m97649e0() {
        m97660v("onRestart");
        C0358g c0358g = this.f97775c;
        if (c0358g != null && !c0358g.mo1176M()) {
            m97650f0();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m97652h0() {
        if (System.currentTimeMillis() - this.f97781i >= 500) {
            m97661w("transformCamera", "Transform camera");
            C0358g c0358g = this.f97775c;
            if (c0358g == null) {
                return;
            }
            this.f97782j = true;
            c0358g.f1047F = false;
            m97635E();
            this.f97775c.m1194k0();
            this.f97781i = System.currentTimeMillis();
            this.f97782j = false;
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m97659u(Bitmap bitmap, final InterfaceC45086g interfaceC45086g) {
        final String strM97533b = C44234n.m97533b(bitmap);
        final BaseResultEntity baseResultEntityM97575s = this.f97790r.m97575s(strM97533b);
        this.f97790r.m97563J();
        this.f97778f.post(new Runnable() { // from class: s.v
            @Override // java.lang.Runnable
            public final void run() {
                C44254x.m97632s(baseResultEntityM97575s, interfaceC45086g, strM97533b);
            }
        });
    }
}
