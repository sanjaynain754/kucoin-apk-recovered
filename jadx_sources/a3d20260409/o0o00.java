package a3d20260409;

import aai.liveness.Detector$DetectionFailedType;
import aai.liveness.Detector$DetectionType;
import aai.liveness.Detector$WarnCode;
import aai.liveness.http.entity.ResultEntity;
import aai.telemetry.enums.PluginPlatform;
import ai.advance.common.camera.GuardianCameraViewV2;
import ai.advance.common.camera.GuardianCameraViewV3;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.webkit.ProxyConfig;
import com.sensorsdata.abtest.entity.AppConstants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33820nf;
import intl.OoOOoOoO;
import intl.OoooOOOoooooo;
import intl.o0oOOOOOooooo;
import intl.oOooooooooooooo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import p045c.InterfaceC4751a;
import p045c.InterfaceC4752b;
import p216e.InterfaceC36994a;
import p216e.InterfaceC36995b;
import p246f.C37287i;
import p277g.C37736b;
import p277g.C37737c;
import p277g.C37739e;
import p277g.InterfaceC37735a;
import p387k.C40826a;
import p387k.C40828c;
import p387k.C40830e;
import p387k.C40833h;
import p387k.C40835j;
import p442m.C42334d;
import p579r.C43890a;
import we0.C45815b;
import we0.C45817d;
import we0.C45818e;
import we0.C45819f;
import we0.C45822i;
import we0.InterfaceC45814a;
import we0.InterfaceC45821h;
import we0.InterfaceC45823j;

/* JADX INFO: loaded from: classes23.dex */
public class o0o00 extends GuardianCameraViewV3 implements GuardianCameraViewV2.InterfaceC0336g, InterfaceC4751a, InterfaceC4752b, InterfaceC45821h, C45822i.a {

    /* JADX INFO: renamed from: F */
    public C45818e f320F;

    /* JADX INFO: renamed from: G */
    public C45822i f321G;

    /* JADX INFO: renamed from: H */
    public List<C45817d> f322H;

    /* JADX INFO: renamed from: I */
    public long f323I;

    /* JADX INFO: renamed from: J */
    public boolean f324J;

    /* JADX INFO: renamed from: K */
    public C0071h f325K;

    /* JADX INFO: renamed from: L */
    public Context f326L;

    /* JADX INFO: renamed from: M */
    public int f327M;

    /* JADX INFO: renamed from: N */
    public C40830e f328N;

    /* JADX INFO: renamed from: O */
    public Detector$DetectionType f329O;

    /* JADX INFO: renamed from: P */
    public InterfaceC36994a f330P;

    /* JADX INFO: renamed from: Q */
    public Handler f331Q;

    /* JADX INFO: renamed from: R */
    public ArrayList<Detector$DetectionType> f332R;

    /* JADX INFO: renamed from: S */
    public JSONArray f333S;

    /* JADX INFO: renamed from: T */
    public String f334T;

    /* JADX INFO: renamed from: U */
    public C37739e f335U;

    /* JADX INFO: renamed from: V */
    public boolean f336V;

    /* JADX INFO: renamed from: W */
    public long f337W;

    /* JADX INFO: renamed from: a0 */
    public long f338a0;

    /* JADX INFO: renamed from: b0 */
    public InterfaceC45821h f339b0;

    /* JADX INFO: renamed from: c0 */
    public Detector$WarnCode f340c0;

    /* JADX INFO: renamed from: d0 */
    public Detector$WarnCode f341d0;

    /* JADX INFO: renamed from: e0 */
    public int f342e0;

    /* JADX INFO: renamed from: f0 */
    public long f343f0;

    /* JADX INFO: renamed from: g0 */
    public String f344g0;

    /* JADX INFO: renamed from: h0 */
    public o0oOOOOOooooo f345h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f346i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f347j0;

    /* JADX INFO: renamed from: a3d20260409.o0o00$a */
    public class C0079a implements InterfaceC37735a<C37737c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f348a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f349b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f350c;

        public C0079a(String str, String str2, boolean z11) {
            this.f348a = str;
            this.f349b = str2;
            this.f350c = z11;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37737c mo92a() {
            return new C37737c.b("init_complete").m85075c("errorCode", this.f348a).m85075c("message", this.f349b).m85075c(DbParams.KEY_CHANNEL_RESULT, Boolean.valueOf(this.f350c)).m85075c("callbackEnable", Boolean.valueOf(o0o00.this.m405N0())).m85076d();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$b */
    public class RunnableC0080b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f352b;

        public RunnableC0080b(long j11) {
            this.f352b = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0o00.this.f330P.mo467k(this.f352b);
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$c */
    public class RunnableC0081c implements Runnable {
        public RunnableC0081c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o0o00.this.m405N0()) {
                o0o00.this.f330P.mo465e();
            }
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$d */
    public class RunnableC0082d implements Runnable {
        public RunnableC0082d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o0o00.this.m405N0()) {
                o0o00.this.f330P.mo465e();
            }
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$e */
    public class RunnableC0083e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Detector$DetectionFailedType f356b;

        public RunnableC0083e(Detector$DetectionFailedType detector$DetectionFailedType) {
            this.f356b = detector$DetectionFailedType;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0o00.this.f330P.mo469y(this.f356b, o0o00.this.f329O);
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$f */
    public class C0084f implements InterfaceC37735a<C37737c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Detector$WarnCode f358a;

        public C0084f(Detector$WarnCode detector$WarnCode) {
            this.f358a = detector$WarnCode;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37737c mo92a() {
            return new C37737c.b("ui_changed").m85075c("code", this.f358a).m85075c("lastCode", o0o00.this.f341d0).m85075c("counter", Integer.valueOf(o0o00.this.f342e0)).m85076d();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$g */
    public class RunnableC0085g implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f360b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f361c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f362d;

        public RunnableC0085g(boolean z11, String str, String str2) {
            this.f360b = z11;
            this.f361c = str;
            this.f362d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0109v.m513B()) {
                Toast.makeText(o0o00.this.getContext(), "This is a test account for development and debugging only!", 1).show();
            }
            o0o00.this.f330P.mo418d(this.f360b, this.f361c, this.f362d);
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$h */
    public class C0086h implements InterfaceC37735a<C37737c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Detector$DetectionType[] f364a;

        public C0086h(Detector$DetectionType[] detector$DetectionTypeArr) {
            this.f364a = detector$DetectionTypeArr;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37737c mo92a() {
            return new C37737c.b("NOT_SUPPORTED_DETECTION_TYPE").m85075c("detectionTypes", this.f364a).m85076d();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$i */
    public class RunnableC0087i implements Runnable {
        public RunnableC0087i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0o00.this.f330P.mo468r();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$j */
    public class RunnableC0088j implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Detector$WarnCode f367b;

        public RunnableC0088j(Detector$WarnCode detector$WarnCode) {
            this.f367b = detector$WarnCode;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0o00.this.f343f0 = System.currentTimeMillis();
            InterfaceC36994a interfaceC36994a = o0o00.this.f330P;
            Detector$WarnCode detector$WarnCode = this.f367b;
            if (detector$WarnCode == Detector$WarnCode.WARN_MOUTH_OCCLUSION_IN_MOTION) {
                detector$WarnCode = Detector$WarnCode.WARN_MOUTH_OCCLUSION;
            }
            interfaceC36994a.mo466h(detector$WarnCode);
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$k */
    public class C0089k implements InterfaceC37735a<C37736b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f369a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Exception f370b;

        public C0089k(int i11, Exception exc) {
            this.f369a = i11;
            this.f370b = exc;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37736b mo92a() {
            String str;
            C37736b.b bVarM85058a = new C37736b.b(OoooOOOoooooo.CAMERA_OPEN_FINISH).m85058a(this.f369a);
            bVarM85058a.m85062e(false);
            if (o0o00.this.f864g == null) {
                str = null;
            } else {
                str = o0o00.this.f864g.width + ProxyConfig.MATCH_ALL_SCHEMES + o0o00.this.f864g.height;
            }
            bVarM85058a.m85061d("camera_preview_size", str);
            bVarM85058a.m85061d("camera_preview_size_list", o0o00.this.f333S);
            bVarM85058a.m85061d("preview_size_select_from", o0o00.this.f334T);
            bVarM85058a.m85061d("front_camera_id", Integer.valueOf(o0o00.this.f868k));
            bVarM85058a.m85061d("back_camera_id", Integer.valueOf(o0o00.this.f867j));
            bVarM85058a.m85061d("camera_numbers", Integer.valueOf(C40828c.m89333g()));
            bVarM85058a.m85061d("camera_angle", Integer.valueOf(o0o00.this.f869l));
            bVarM85058a.m85059b(this.f370b);
            return bVarM85058a.m85063f();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$l */
    public class C0090l implements InterfaceC37735a<C37737c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f372a;

        public C0090l(String str) {
            this.f372a = str;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37737c mo92a() {
            return new C37737c.b("ellipse_config_changed").m85075c("ellipse_config", this.f372a).m85076d();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$n */
    public class RunnableC0092n implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f375b;

        public RunnableC0092n(String str) {
            this.f375b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0o00.this.f339b0.mo436o(this.f375b);
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$o */
    public class C0093o implements InterfaceC37735a<C37736b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f377a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f378b;

        public C0093o(int i11, boolean z11) {
            this.f377a = i11;
            this.f378b = z11;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37736b mo92a() {
            C37736b.b bVarM85058a = new C37736b.b(OoooOOOoooooo.DEVICE_SUPPORT_CHECK_FINISH).m85058a(this.f377a);
            bVarM85058a.m85062e(this.f378b);
            if (!this.f378b) {
                if (o0o00.this.f325K.f204k == -1) {
                    e = "camera angle -1";
                } else if (j3d20260409.O0OOOoOooo()) {
                    try {
                        Camera.getCameraInfo(C0106s.m483i(), new Camera.CameraInfo());
                    } catch (Exception e11) {
                        e = e11;
                        bVarM85058a.m85060c(e);
                    }
                } else {
                    e = "JNI disable";
                }
                bVarM85058a.m85060c(e);
            }
            return bVarM85058a.m85063f();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$p */
    public class RunnableC0094p implements Runnable {
        public RunnableC0094p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o0o00.this.m405N0()) {
                o0o00.this.f330P.mo468r();
            }
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$q */
    public class RunnableC0095q implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC36995b f381b;

        /* JADX INFO: renamed from: a3d20260409.o0o00$q$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o0o00.this.f325K.m251L(C0108u.m510j());
                ResultEntity resultEntity = new ResultEntity();
                resultEntity.transactionId = C0108u.m508h();
                if (C0108u.m510j()) {
                    resultEntity.success = true;
                    resultEntity.code = AppConstants.AB_TEST_SUCCESS;
                    resultEntity.pricingStrategy = "PAY";
                    RunnableC0095q.this.f381b.mo472c(resultEntity, C0108u.m507g());
                    return;
                }
                resultEntity.success = false;
                resultEntity.code = C0108u.m505e();
                resultEntity.message = C0108u.m506f();
                resultEntity.pricingStrategy = "FREE";
                RunnableC0095q.this.f381b.mo470a(resultEntity);
            }
        }

        public RunnableC0095q(InterfaceC36995b interfaceC36995b) {
            this.f381b = interfaceC36995b;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0o00.this.m435n1();
            o0o00.this.f325K.m270p();
            if (!o0o00.this.m405N0() || this.f381b == null) {
                return;
            }
            o0o00.this.f331Q.post(new a());
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$r */
    public class RunnableC0096r implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ o0oOOOOOooooo f384b;

        public RunnableC0096r(o0oOOOOOooooo o0ooooooooooo) {
            this.f384b = o0ooooooooooo;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0o00.this.f339b0.mo412a(o0o00.this.f345h0);
            if (!o0o00.this.f346i0 && this.f384b == o0oOOOOOooooo.DISTANT_FACE_CAPTURE) {
                o0o00.this.f346i0 = true;
                o0o00.this.m439t1();
            }
            if (o0o00.this.f347j0 || this.f384b != o0oOOOOOooooo.NEAR_FACE_CAPTURE) {
                return;
            }
            o0o00.this.f347j0 = true;
            o0o00.this.m439t1();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$s */
    public class RunnableC0097s implements Runnable {
        public RunnableC0097s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o0o00.this.f330P != null) {
                o0o00.this.f330P.mo428j();
            }
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$t */
    public class C0098t implements InterfaceC37735a<C37736b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f387a;

        public C0098t(int i11) {
            this.f387a = i11;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37736b mo92a() {
            C37736b.b bVarM85058a = new C37736b.b(OoooOOOoooooo.CAMERA_OPEN_FINISH).m85058a(this.f387a);
            bVarM85058a.m85062e(true);
            bVarM85058a.m85061d("camera_preview_size", o0o00.this.f864g.width + ProxyConfig.MATCH_ALL_SCHEMES + o0o00.this.f864g.height);
            bVarM85058a.m85061d("camera_preview_size_list", o0o00.this.f333S);
            bVarM85058a.m85061d("preview_size_select_from", o0o00.this.f334T);
            bVarM85058a.m85061d("front_camera_id", Integer.valueOf(o0o00.this.f868k));
            bVarM85058a.m85061d("back_camera_id", Integer.valueOf(o0o00.this.f867j));
            bVarM85058a.m85061d("camera_numbers", Integer.valueOf(C40828c.m89333g()));
            bVarM85058a.m85061d("camera_angle", Integer.valueOf(o0o00.this.f869l));
            return bVarM85058a.m85063f();
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$u */
    public class C0099u implements InterfaceC37735a<C37737c> {
        public C0099u() {
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37737c mo92a() {
            return new C37737c.b("EMPTY_DETECTION_TYPE_LIST").m85076d();
        }
    }

    public o0o00(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: E1 */
    public void m401E1() {
        this.f324J = false;
        ArrayList<Detector$DetectionType> arrayList = this.f332R;
        if (arrayList == null) {
            m420d1(this.f330P);
            return;
        }
        Detector$DetectionType[] detector$DetectionTypeArr = new Detector$DetectionType[arrayList.size()];
        this.f332R.toArray(detector$DetectionTypeArr);
        m421e1(this.f330P, false, detector$DetectionTypeArr);
    }

    /* JADX INFO: renamed from: H1 */
    public synchronized void m402H1() {
        m1181R();
        m1180Q(new GuardianCameraViewV2.InterfaceC0337h() { // from class: a3d20260409.m
            @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0337h
            /* JADX INFO: renamed from: a */
            public final void mo366a() {
                this.f317a.m406R0();
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public final void m416b1(Detector$WarnCode detector$WarnCode) {
        this.f342e0 = 0;
        if (detector$WarnCode == this.f341d0) {
            return;
        }
        C45819f.m101227J().m83490F(new C0084f(detector$WarnCode), this.f335U);
        this.f341d0 = detector$WarnCode;
        if (detector$WarnCode == Detector$WarnCode.FACECAPTURE) {
            this.f325K.f203j.m191v0();
            this.f325K.m254Q();
        }
        if (m405N0()) {
            this.f331Q.post(new RunnableC0088j(detector$WarnCode));
        }
    }

    /* JADX INFO: renamed from: d1 */
    public synchronized void m420d1(InterfaceC36994a interfaceC36994a) {
        try {
            List<Detector$DetectionType> list = C0106s.f426f;
            if (list == null || list.isEmpty()) {
                m421e1(interfaceC36994a, false, Detector$DetectionType.BLINK, Detector$DetectionType.POS_YAW);
            } else {
                Detector$DetectionType[] detector$DetectionTypeArr = new Detector$DetectionType[C0106s.f426f.size()];
                for (int i11 = 0; i11 < C0106s.f426f.size(); i11++) {
                    detector$DetectionTypeArr[i11] = C0106s.f426f.get(i11);
                }
                m421e1(interfaceC36994a, C0106s.f427g, detector$DetectionTypeArr);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public synchronized void m421e1(InterfaceC36994a interfaceC36994a, boolean z11, Detector$DetectionType... detector$DetectionTypeArr) {
        String str;
        String str2;
        try {
            C0108u.m504d();
            String strM403K1 = m403K1();
            j3d20260409.O0ooE(strM403K1);
            j3d20260409.O0ooEoo0Co00o(m403K1());
            this.f335U = C45819f.m101227J().mo83499v(new C37287i.a().m83530k(j3d20260409.oOoOoOo0000()).m83524e(C0109v.m533g(oOooooooooooooo.CRASH.name())).m83526g(C0109v.m533g(oOooooooooooooo.SHENCE.name())).m83527h(C0109v.m533g(oOooooooooooooo.LOG.name())).m83532m(strM403K1).m83529j(PluginPlatform.Standard).m83521b(C42334d.m92896d(getContext())).m83522c("LIVENESS_DETECTION").m83523d(C0106s.m487m()).m83525f(j3d20260409.O0ooEoo0Co00o0()).m83531l(C43890a.m96662c()).m83520a());
            if (TextUtils.isEmpty(C43890a.m96662c()) && !C0109v.m526O()) {
                C40833h.m89365i("You haven't called the LivenessDetectionSDK.bindUser() method, we strongly recommend that you call this method to bind the user id so that we can debug the log together when something goes wrong.");
            }
            if (C0106s.m483i() == C40826a.m89321g()) {
                setAutoFocusEnable(1000L);
            }
            this.f330P = interfaceC36994a;
            if (detector$DetectionTypeArr.length == 0) {
                C45819f.m101227J().m83490F(new C0099u(), this.f335U);
                str = "EMPTY_DETECTION_TYPE_LIST";
                str2 = "Detection Types need at least one term";
            } else if (m429j1(detector$DetectionTypeArr)) {
                this.f331Q = new Handler(Looper.getMainLooper());
                ArrayList<Detector$DetectionType> arrayList = new ArrayList<>(Arrays.asList(detector$DetectionTypeArr));
                this.f332R = arrayList;
                if (z11) {
                    Collections.shuffle(arrayList);
                }
                m399C1();
                if (this.f325K.f204k == -1) {
                    intl.OOOoooooo oOOoooooo = intl.OOOoooooo.DEVICE_NOT_SUPPORT;
                    C0108u.m502b(oOOoooooo);
                    interfaceC36994a.mo418d(false, oOOoooooo.toString(), "camera error");
                    m427h1(false, 0);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    boolean zM491q = C0106s.m491q();
                    m427h1(zM491q, (int) (System.currentTimeMillis() - jCurrentTimeMillis));
                    if (zM491q) {
                        mo415b0(C0106s.m483i(), this);
                    } else {
                        mo91i(new Exception("The device does not support liveness detection"));
                    }
                }
            } else {
                C45819f.m101227J().m83490F(new C0086h(detector$DetectionTypeArr), this.f335U);
                str = "NOT_SUPPORTED_DETECTION_TYPE";
                str2 = "Type of detection not supported\n detectionType must in (POS_PAW,BLINK,MOUTH)";
            }
            m426g1(str, str2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final boolean m429j1(Detector$DetectionType... detector$DetectionTypeArr) {
        for (Detector$DetectionType detector$DetectionType : detector$DetectionTypeArr) {
            int i11 = C0091m.f374a[detector$DetectionType.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m432l1() {
        return true;
    }

    /* JADX INFO: renamed from: v1 */
    public synchronized void m440v1() {
        try {
            this.f330P = null;
            m402H1();
            m438p1();
            Handler handler = this.f331Q;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f331Q = null;
            }
            List<C45817d> list = this.f322H;
            if (list != null && !list.isEmpty()) {
                Iterator<C45817d> it = this.f322H.iterator();
                while (it.hasNext()) {
                    it.next().m101225g();
                }
            }
            ArrayList<Detector$DetectionType> arrayList = this.f332R;
            if (arrayList != null) {
                arrayList.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a3d20260409.o0o00$m */
    public static /* synthetic */ class C0091m {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f374a;

        static {
            int[] iArr = new int[Detector$DetectionType.values().length];
            f374a = iArr;
            try {
                iArr[Detector$DetectionType.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f374a[Detector$DetectionType.AIMLESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f374a[Detector$DetectionType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public o0o00(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f323I = 0L;
        this.f334T = null;
        this.f342e0 = 0;
        this.f328N = new C40830e();
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ int m384V0(Camera.Size size, Camera.Size size2) {
        return Integer.compare(size2.width * size2.height, size.width * size.height);
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: L */
    public Camera.Size mo86L(Camera.Parameters parameters) {
        Camera.Size next;
        this.f333S = new JSONArray();
        List<Camera.Size> listM410Y0 = m410Y0(parameters);
        Collections.sort(listM410Y0, new Comparator() { // from class: a3d20260409.o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o0o00.m384V0((Camera.Size) obj, (Camera.Size) obj2);
            }
        });
        for (Camera.Size size : listM410Y0) {
            this.f333S.put(size.width + ProxyConfig.MATCH_ALL_SCHEMES + size.height);
            C40833h.m89364h("calBestPreviewSize:" + size.width + ProxyConfig.MATCH_ALL_SCHEMES + size.height);
        }
        Iterator<Camera.Size> it = listM410Y0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i11 = next.width;
            int i12 = next.height;
            if (i11 >= i12 && i12 >= C0106s.m486l() && Math.abs((next.width / next.height) - 1.3f) <= 0.1f) {
                this.f334T = "ratio_1.3";
                break;
            }
        }
        if (next == null) {
            for (Camera.Size size2 : listM410Y0) {
                int i13 = size2.width;
                int i14 = size2.height;
                if (i13 >= i14 && i14 >= C0106s.m486l() && Math.abs((size2.width / size2.height) - 1.0f) < 0.2f) {
                    this.f334T = "ratio_1";
                    next = size2;
                    break;
                }
            }
        }
        if (next == null) {
            next = listM410Y0.get(0);
            this.f334T = "default0";
        }
        mo419d0(next);
        return next;
    }

    /* JADX INFO: renamed from: L0 */
    public final int m404L0(Detector$WarnCode detector$WarnCode) {
        if (detector$WarnCode == Detector$WarnCode.WARN_MOUTH_OCCLUSION_IN_MOTION) {
            return 5;
        }
        return detector$WarnCode == Detector$WarnCode.WARN_EYE_OCCLUSION ? 3 : 0;
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m405N0() {
        return (this.f331Q == null || this.f330P == null) ? false : true;
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m406R0() {
        C0071h c0071h = this.f325K;
        if (c0071h != null) {
            c0071h.m268m0();
        }
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m407T0() {
        C0071h c0071h = this.f325K;
        return c0071h == null || !c0071h.f190I;
    }

    @Override // we0.InterfaceC45821h
    /* JADX INFO: renamed from: a */
    public void mo412a(o0oOOOOOooooo o0ooooooooooo) {
        if (this.f339b0 == null || this.f345h0 == o0ooooooooooo) {
            return;
        }
        this.f345h0 = o0ooooooooooo;
        this.f331Q.post(new RunnableC0096r(o0ooooooooooo));
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV3, ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: b0 */
    public void mo415b0(int i11, GuardianCameraViewV2.InterfaceC0336g interfaceC0336g) {
        C0071h c0071h = this.f325K;
        if (c0071h != null) {
            c0071h.m246G(OoOOoOoO.open_camera_start);
        }
        C45819f.m101227J().m83502z(OoooOOOoooooo.CAMERA_OPEN_START.name(), this.f335U);
        this.f338a0 = System.currentTimeMillis();
        super.mo415b0(i11, interfaceC0336g);
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
    /* JADX INFO: renamed from: c */
    public void mo90c(byte[] bArr, Camera.Size size) {
        this.f325K.m261e0(bArr, size);
        j3d20260409.oo000o0();
        this.f328N.m89342d();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m417c1(Camera.Size size) {
        if (size != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int viewWidth = getViewWidth();
            int viewHeight = getViewHeight();
            int i11 = (int) (viewWidth * (size.width / size.height));
            if (i11 != viewHeight) {
                marginLayoutParams.width = viewWidth;
                marginLayoutParams.height = i11;
                marginLayoutParams.topMargin = (-(i11 - viewWidth)) / 2;
                setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: d0 */
    public void mo419d0(final Camera.Size size) {
        this.f331Q.post(new Runnable() { // from class: a3d20260409.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f318b.m417c1(size);
            }
        });
    }

    @Override // p045c.InterfaceC4751a
    /* JADX INFO: renamed from: f */
    public Detector$DetectionType mo422f(C0073j c0073j) {
        Detector$DetectionType detector$DetectionType = Detector$DetectionType.DONE;
        try {
            if (this.f325K.m276w0()) {
                m402H1();
                this.f331Q.post(new RunnableC0081c());
                this.f329O = detector$DetectionType;
                return detector$DetectionType;
            }
            int i11 = this.f327M + 1;
            this.f327M = i11;
            if (i11 >= this.f332R.size()) {
                m402H1();
                this.f331Q.post(new RunnableC0082d());
                return detector$DetectionType;
            }
            Detector$DetectionType detector$DetectionType2 = this.f332R.get(this.f327M);
            try {
                this.f329O = detector$DetectionType2;
                this.f331Q.post(new RunnableC0094p());
                return detector$DetectionType2;
            } catch (Exception e11) {
                e = e11;
                detector$DetectionType = detector$DetectionType2;
                C0071h c0071h = this.f325K;
                if (c0071h != null) {
                    c0071h.m250K(e);
                }
                return detector$DetectionType;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m426g1(String str, String str2) {
        InterfaceC36994a interfaceC36994a = this.f330P;
        if (interfaceC36994a != null) {
            interfaceC36994a.mo418d(false, str, str2);
        } else {
            C40833h.m89363g(str2);
        }
    }

    public Detector$DetectionType getCurrentDetectionType() {
        return this.f329O;
    }

    public C37739e getSessionData() {
        return this.f335U;
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: l0 */
    public void mo431l0() {
        Camera.Size size = this.f864g;
        if (size != null) {
            float f11 = size.height;
            float f12 = size.width;
            RectF rectF = new RectF(0.0f, 0.0f, f11, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, f11, f12);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            setTransform(matrix);
            this.f881x = 1.0f;
            this.f882y = 1.0f;
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m435n1() {
        if (this.f336V) {
            return;
        }
        this.f336V = true;
        if (this.f325K.f203j != null) {
            try {
                for (C45817d c45817d : this.f322H) {
                    if (c45817d instanceof C45822i) {
                        ((C45822i) c45817d).m101234h();
                    }
                    this.f325K.f203j.m92886k("sensor_values_" + c45817d.f103288b, c45817d.m101224f());
                }
            } catch (Exception e11) {
                C0071h c0071h = this.f325K;
                if (c0071h != null) {
                    c0071h.m250K(e11);
                }
            }
        }
    }

    @Override // we0.InterfaceC45821h
    /* JADX INFO: renamed from: o */
    public void mo436o(String str) {
        C0069f c0069f;
        if (this.f339b0 == null || TextUtils.equals(this.f344g0, str)) {
            return;
        }
        C0071h c0071h = this.f325K;
        if (c0071h != null && (c0069f = c0071h.f203j) != null) {
            c0069f.m171g0(str);
        }
        C0071h c0071h2 = this.f325K;
        if (c0071h2 != null) {
            c0071h2.m259c();
        }
        if (m405N0()) {
            C45819f.m101227J().m83490F(new C0090l(str), this.f335U);
        }
        this.f344g0 = str;
        if (m405N0()) {
            this.f331Q.post(new RunnableC0092n(str));
        }
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2, android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.Size size;
        GuardianCameraViewV2.InterfaceC0336g interfaceC0336g = this.f862e;
        if (interfaceC0336g != null && this.f863f != null && (size = this.f864g) != null) {
            interfaceC0336g.mo90c(bArr, size);
        }
        m1177N(bArr);
        j3d20260409.oo0o0o0();
    }

    /* JADX INFO: renamed from: p1 */
    public final void m438p1() {
        C0071h c0071h = this.f325K;
        if (c0071h != null) {
            c0071h.m241A0(null);
            this.f325K.m278z0();
        }
    }

    public void setFaceCaptureCallback(InterfaceC45821h interfaceC45821h) {
        this.f339b0 = interfaceC45821h;
    }

    public void setLivenssCallback(InterfaceC36994a interfaceC36994a) {
        this.f330P = interfaceC36994a;
    }

    public void setPrepareMillSeconds(long j11) {
        this.f337W = j11;
    }

    /* JADX INFO: renamed from: C1 */
    public final void m399C1() {
        this.f326L = getContext();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f323I = jCurrentTimeMillis;
        ArrayList arrayList = new ArrayList();
        this.f322H = arrayList;
        arrayList.add(new C45815b(this.f326L, 5, "light", jCurrentTimeMillis));
        this.f322H.add(new C45815b(this.f326L, 6, "pressure", jCurrentTimeMillis));
        this.f322H.add(new C45815b(this.f326L, 8, "proximity", jCurrentTimeMillis));
        this.f322H.add(new C45815b(this.f326L, 12, "humidity", jCurrentTimeMillis));
        C45818e c45818e = new C45818e(this.f326L, jCurrentTimeMillis);
        this.f320F = c45818e;
        this.f322H.add(c45818e);
        C45822i c45822i = new C45822i(this.f326L, 10, "acceleration", jCurrentTimeMillis);
        this.f321G = c45822i;
        c45822i.m101235i(this);
        this.f322H.add(this.f321G);
        this.f322H.add(new C45822i(this.f326L, 4, "gyroscope", jCurrentTimeMillis));
        C0071h c0071h = new C0071h((Activity) this.f326L, C37739e.m85098b(this.f335U));
        this.f325K = c0071h;
        c0071h.m242C(this);
        this.f325K.m273u(this.f337W);
        this.f325K.m241A0(this);
        C0069f c0069f = this.f325K.f203j;
        long j11 = this.f323I;
        c0069f.f169q = j11;
        c0069f.m92886k("sensor_epoch_timestamp", Long.valueOf(j11));
        for (C45817d c45817d : this.f322H) {
            this.f325K.f203j.m92886k("sensor_info_" + c45817d.f103288b, c45817d.m101219a());
            if (c45817d instanceof C45822i) {
                ((C45822i) c45817d).mo101226j();
            }
        }
        this.f325K.f203j.m92886k("sensor_values_start_timestamp", Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: D1 */
    public void m400D1() {
        m402H1();
        C0071h c0071h = this.f325K;
        if (c0071h != null) {
            C0069f c0069f = c0071h.f203j;
            if (c0069f != null) {
                c0069f.m192w(this.f328N.m89339a());
                this.f325K.f203j.m163Y(this.f333S);
                this.f325K.f203j.m159U(getMeasuredWidth() + ProxyConfig.MATCH_ALL_SCHEMES + getMeasuredHeight());
            }
            m435n1();
            m438p1();
        }
        Handler handler = this.f331Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: K1 */
    public final String m403K1() {
        return C40835j.m89369c();
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: U */
    public int mo408U(Camera.Size size) {
        if (mo1186Y()) {
            return size.width;
        }
        return size.height;
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: V */
    public int mo409V(Camera.Size size) {
        if (mo1186Y()) {
            return size.height;
        }
        return size.width;
    }

    /* JADX INFO: renamed from: Y0 */
    public final List<Camera.Size> m410Y0(Camera.Parameters parameters) {
        List<Camera.Size> supportedVideoSizes;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (C0106s.f432l && (supportedVideoSizes = parameters.getSupportedVideoSizes()) != null && !supportedVideoSizes.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Camera.Size size : supportedPreviewSizes) {
                if (supportedVideoSizes.contains(size)) {
                    arrayList.add(size);
                }
            }
            if (arrayList.isEmpty()) {
                return supportedPreviewSizes;
            }
            return arrayList;
        }
        return supportedPreviewSizes;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m411Z0(int i11) {
        C45819f.m101227J().m83501y(new C0098t(i11), this.f335U);
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: a0 */
    public void mo413a0() {
        m440v1();
        super.mo413a0();
    }

    /* JADX INFO: renamed from: a1 */
    public final void m414a1(int i11, Exception exc) {
        C45819f.m101227J().m83501y(new C0089k(i11, exc), this.f335U);
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
    /* JADX INFO: renamed from: b */
    public void mo89b() {
        m411Z0((int) (System.currentTimeMillis() - this.f338a0));
        C0071h c0071h = this.f325K;
        if (c0071h != null) {
            c0071h.m246G(OoOOoOoO.open_camera_success);
        }
    }

    @Override // p045c.InterfaceC4752b
    /* JADX INFO: renamed from: d */
    public void mo418d(boolean z11, String str, String str2) {
        C45819f.m101227J().m83490F(new C0079a(str, str2, z11), this.f335U);
        if (m405N0()) {
            this.f331Q.post(new RunnableC0085g(z11, str, str2));
        }
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: f0 */
    public void mo423f0(int i11) {
        try {
            super.mo423f0(i11);
        } catch (Exception e11) {
            if (this.f325K != null) {
                this.f325K.m250K(e11);
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m424f1(InterfaceC36995b interfaceC36995b) {
        if (m405N0()) {
            if (interfaceC36995b != null) {
                interfaceC36995b.mo471b();
            }
            new Thread(new RunnableC0095q(interfaceC36995b)).start();
        }
    }

    @Override // p045c.InterfaceC4751a
    /* JADX INFO: renamed from: g */
    public void mo425g(Detector$DetectionFailedType detector$DetectionFailedType) {
        if (m405N0()) {
            this.f331Q.post(new RunnableC0083e(detector$DetectionFailedType));
        }
        C0071h c0071h = this.f325K;
        if (c0071h != null) {
            c0071h.m241A0(null);
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final void m427h1(boolean z11, int i11) {
        C45819f.m101227J().m83501y(new C0093o(i11, z11), this.f335U);
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
    /* JADX INFO: renamed from: i */
    public void mo91i(Exception exc) {
        m414a1((int) (System.currentTimeMillis() - this.f338a0), exc);
        C0071h c0071h = this.f325K;
        if (c0071h != null) {
            c0071h.m246G(OoOOoOoO.open_camera_failed);
            this.f325K.m250K(exc);
        }
        intl.OOOoooooo oOOoooooo = intl.OOOoooooo.DEVICE_NOT_SUPPORT;
        C0108u.m502b(oOOoooooo);
        if (m405N0()) {
            this.f330P.mo418d(false, oOOoooooo.toString(), "The device does not support liveness detection");
        }
    }

    @Override // p045c.InterfaceC4752b
    /* JADX INFO: renamed from: j */
    public void mo428j() {
        if (m405N0()) {
            this.f331Q.post(new RunnableC0097s());
        }
    }

    @Override // p045c.InterfaceC4751a
    /* JADX INFO: renamed from: l */
    public void mo430l(long j11) {
        if (m405N0()) {
            this.f331Q.post(new RunnableC0080b(j11));
        }
    }

    @Override // p045c.InterfaceC4751a
    /* JADX INFO: renamed from: m */
    public void mo433m(C0073j c0073j) {
        int i11;
        Detector$WarnCode detector$WarnCodeM340a = c0073j.m340a();
        Detector$WarnCode detector$WarnCode = this.f340c0;
        if (detector$WarnCode == null) {
            this.f340c0 = detector$WarnCodeM340a;
            m416b1(detector$WarnCodeM340a);
            return;
        }
        if (detector$WarnCodeM340a == detector$WarnCode) {
            i11 = this.f342e0 + 1;
        } else {
            i11 = 0;
        }
        this.f342e0 = i11;
        this.f340c0 = detector$WarnCodeM340a;
        if (c0073j.f307b) {
            m416b1(detector$WarnCodeM340a);
            return;
        }
        int iM404L0 = m404L0(detector$WarnCodeM340a);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f343f0;
        if (this.f342e0 > iM404L0 && jCurrentTimeMillis >= 300) {
            m416b1(detector$WarnCodeM340a);
        }
    }

    @Override // we0.C45822i.a
    /* JADX INFO: renamed from: n */
    public void mo434n() {
        if (System.currentTimeMillis() - this.f343f0 > 300) {
            m416b1(Detector$WarnCode.MOVE_TOO_FAST);
        }
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C0069f c0069f;
        if (m432l1() && !this.f324J) {
            this.f324J = true;
            this.f327M = 0;
            this.f329O = this.f332R.get(0);
            C0071h c0071h = this.f325K;
            if (c0071h != null && (c0069f = c0071h.f203j) != null) {
                c0069f.m162X(this.f332R);
                this.f325K.m262f0(this.f329O, this);
            }
        }
    }

    @Override // p045c.InterfaceC4751a
    /* JADX INFO: renamed from: p */
    public void mo437p() {
        if (m405N0() && !this.f325K.m276w0()) {
            this.f331Q.post(new RunnableC0087i());
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final void m439t1() {
        String str;
        if (j3d20260409.oooo000o()) {
            Context context = getContext();
            if (context instanceof Activity) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    View decorView = ((Activity) context).getWindow().getDecorView();
                    decorView.setDrawingCacheEnabled(true);
                    decorView.buildDrawingCache();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(decorView.getDrawingCache());
                    decorView.setDrawingCacheEnabled(false);
                    decorView.destroyDrawingCache();
                    Bitmap bitmapM89325k = C40826a.m89325k(bitmapCreateBitmap, 600);
                    byte[] bArrM89315a = C40826a.m89315a(bitmapM89325k, C0109v.m545s(), 20);
                    bitmapM89325k.recycle();
                    String str2 = "null";
                    if (this.f345h0 == null) {
                        str = "null";
                    } else {
                        str = this.f345h0.name() + C33820nf.f71144W + ((int) (System.currentTimeMillis() - jCurrentTimeMillis));
                    }
                    j3d20260409.O0oooo0o(bArrM89315a, str);
                    Bitmap bitmap = getBitmap();
                    if (bitmap != null) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        Bitmap bitmapM89325k2 = C40826a.m89325k(bitmap, 600);
                        byte[] bArrM89315a2 = C40826a.m89315a(bitmapM89325k2, C0109v.m545s(), 20);
                        bitmapM89325k2.recycle();
                        if (this.f345h0 != null) {
                            str2 = this.f345h0.name() + C33820nf.f71144W + ((int) (System.currentTimeMillis() - jCurrentTimeMillis2)) + "-texture";
                        }
                        j3d20260409.O0oooo0o(bArrM89315a2, str2);
                        C45819f.m101227J().m83491G("screen_shot_" + str2, this.f335U);
                    }
                } catch (Exception e11) {
                    C0071h c0071h = this.f325K;
                    if (c0071h != null) {
                        c0071h.m250K(e11);
                    }
                }
            }
        }
    }

    public void setFrameCallback(InterfaceC45814a interfaceC45814a) {
    }

    public void setModelResultCallback(InterfaceC45823j interfaceC45823j) {
    }
}
