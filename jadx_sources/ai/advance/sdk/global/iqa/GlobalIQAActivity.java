package ai.advance.sdk.global.iqa;

import ai.advance.sdk.global.iqa.lib.GlobalIQAView;
import ai.advance.sdk.global.iqa.lib.UIExtras;
import ai.advance.sdk.global.iqa.lib.code.ErrorCode;
import ai.advance.sdk.global.iqa.lib.code.ImageWarnCode;
import ai.advance.sdk.global.iqa.lib.enums.Mode;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import p611s.C44203a;
import p611s.C44212d;
import p611s.C44215e;
import p626t.C44603a;
import p626t.C44604b;
import p626t.C44605c;
import p647u.InterfaceC45083d;
import p647u.InterfaceC45084e;
import p647u.InterfaceC45085f;
import p647u.InterfaceC45086g;

/* JADX INFO: loaded from: classes23.dex */
public class GlobalIQAActivity extends AbstractActivityC0347d implements InterfaceC0348e {

    /* JADX INFO: renamed from: l */
    public ViewOnClickListenerC0346c f937l;

    /* JADX INFO: renamed from: m */
    public GlobalIQAView f938m;

    /* JADX INFO: renamed from: n */
    @SuppressLint({"HandlerLeak"})
    public final Handler f939n = new HandlerC0339a();

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.GlobalIQAActivity$a */
    public class HandlerC0339a extends Handler {
        public HandlerC0339a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    return;
                }
                GlobalIQAActivity.this.f937l.m1311t();
                GlobalIQAActivity.this.m1320P();
                GlobalIQAActivity.this.m1263V();
                return;
            }
            int iIntValue = ((Integer) message.obj).intValue();
            GlobalIQAActivity.this.f937l.m1306o(iIntValue);
            if (iIntValue == 0) {
                GlobalIQAActivity.this.m1262U();
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = Integer.valueOf(iIntValue - 1);
            GlobalIQAActivity.this.f939n.sendMessageDelayed(messageObtain, 1000L);
        }
    }

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.GlobalIQAActivity$b */
    public class C0340b implements InterfaceC45085f {
        public C0340b() {
        }

        @Override // p647u.InterfaceC45085f
        /* JADX INFO: renamed from: a */
        public void mo1272a(C44604b c44604b) {
            if (c44604b.f98891a) {
                GlobalIQAActivity.this.f937l.m1291G();
            }
        }
    }

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.GlobalIQAActivity$c */
    public class C0341c implements InterfaceC45086g {
        public C0341c() {
        }

        @Override // p647u.InterfaceC45086g
        /* JADX INFO: renamed from: b */
        public void mo1273b(C44605c c44605c) {
            GlobalIQAActivity.this.f937l.m1307p();
            GlobalIQAActivity.this.finish();
        }

        @Override // p647u.InterfaceC45086g
        /* JADX INFO: renamed from: d */
        public void mo1274d() {
            GlobalIQAActivity.this.f937l.m1292H();
        }
    }

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.GlobalIQAActivity$d */
    public class C0342d implements InterfaceC45084e {
        public C0342d() {
        }

        @Override // p647u.InterfaceC45084e
        /* JADX INFO: renamed from: a */
        public void mo1275a(int i11) {
            GlobalIQAActivity.this.f937l.m1299g(i11);
        }

        @Override // p647u.InterfaceC45086g
        /* JADX INFO: renamed from: b */
        public void mo1273b(C44605c c44605c) {
            GlobalIQAActivity.this.f937l.m1307p();
            GlobalIQAActivity.this.finish();
        }

        @Override // p647u.InterfaceC45080a
        /* JADX INFO: renamed from: c */
        public void mo1276c() {
            GlobalIQAActivity.this.f937l.m1292H();
        }

        @Override // p647u.InterfaceC45086g
        /* JADX INFO: renamed from: d */
        public void mo1274d() {
            GlobalIQAActivity.this.f937l.m1292H();
            GlobalIQAActivity.this.f937l.m1296L();
            GlobalIQAActivity.this.m1319N();
            GlobalIQAActivity.this.f937l.m1293I();
        }

        @Override // p647u.InterfaceC45080a
        /* JADX INFO: renamed from: e */
        public void mo1277e(C44603a c44603a) {
            GlobalIQAActivity.this.f937l.m1307p();
            if (c44603a.f98888a) {
                GlobalIQAActivity.this.f937l.m1295K();
            } else {
                GlobalIQAActivity.this.finish();
            }
        }

        @Override // p647u.InterfaceC45084e
        /* JADX INFO: renamed from: f */
        public void mo1278f(ErrorCode errorCode) {
            if (errorCode != ErrorCode.SCAN_TIMEOUT) {
                GlobalIQAActivity.this.finish();
                return;
            }
            GlobalIQAActivity.this.f973i.costOneTime();
            GlobalIQAActivity.this.f937l.m1285A();
            GlobalIQAActivity.this.m1319N();
            if (GlobalIQAActivity.this.f973i.canRetry()) {
                GlobalIQAActivity.this.f939n.sendEmptyMessageDelayed(2, 1000L);
                return;
            }
            if (GlobalIQAActivity.this.f973i.getGivenMode() == Mode.SCAN) {
                GlobalIQAActivity.this.finish();
                return;
            }
            UIExtras uIExtras = GlobalIQAActivity.this.f973i.uiExtras;
            int iIntValue = uIExtras != null ? uIExtras.getTakePhotoTipDialogShowSeconds().intValue() : 0;
            if (iIntValue == 0) {
                GlobalIQAActivity.this.f937l.m1306o(0);
                GlobalIQAActivity.this.m1262U();
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = Integer.valueOf(iIntValue);
            GlobalIQAActivity.this.f939n.sendMessage(messageObtain);
            GlobalIQAActivity.this.f937l.m1305n();
        }

        @Override // p647u.InterfaceC45084e
        /* JADX INFO: renamed from: g */
        public void mo1279g(ImageWarnCode imageWarnCode) {
            GlobalIQAActivity.this.f937l.m1302k(imageWarnCode);
        }
    }

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.GlobalIQAActivity$e */
    public class C0343e implements InterfaceC45083d {
        public C0343e() {
        }

        @Override // p647u.InterfaceC45080a
        /* JADX INFO: renamed from: c */
        public void mo1276c() {
            GlobalIQAActivity.this.f937l.m1292H();
        }

        @Override // p647u.InterfaceC45080a
        /* JADX INFO: renamed from: e */
        public void mo1277e(C44603a c44603a) {
            GlobalIQAActivity.this.f937l.m1307p();
            if (c44603a.f98888a) {
                return;
            }
            GlobalIQAActivity.this.finish();
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public void m1263V() {
        this.f937l.m1289E();
        this.f938m.m1337q(new C44212d.a().m97484b(this.f973i.getInputCardSide()).m97485c(this.f973i.getInputCardType()).m97486d(this.f973i.getRegion()).m97488f(this.f973i.mSoundPlayEnable).m97487e(this.f973i.getTimeoutSeconds()).m97483a(), new C0342d());
    }

    /* JADX INFO: renamed from: W */
    private void m1264W() {
        if (this.f973i.mIqaExtras.getMode() == Mode.TAKE_PHOTO) {
            m1267X();
        } else {
            m1263V();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m1267X() {
        C44215e c44215eM97491a = new C44215e.b().m97492b(this.f973i.getInputCardSide()).m97493c(this.f973i.getInputCardType()).m97494d(this.f973i.getRegion()).m97491a();
        this.f937l.m1290F();
        this.f938m.m1336p(c44215eM97491a, new C0343e());
    }

    @Override // ai.advance.sdk.global.iqa.InterfaceC0348e
    /* JADX INFO: renamed from: b */
    public void mo1269b() {
        this.f938m.m1329i();
    }

    @Override // ai.advance.sdk.global.iqa.InterfaceC0348e
    /* JADX INFO: renamed from: c */
    public void mo1270c() {
        this.f938m.m1341u(new C0341c());
    }

    @Override // ai.advance.sdk.global.iqa.InterfaceC0348e
    /* JADX INFO: renamed from: d */
    public void mo1271d() {
        this.f938m.m1338r(new C0340b());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f938m.m1330j(true);
        super.onBackPressed();
    }

    @Override // ai.advance.sdk.global.iqa.AbstractActivityC0347d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f939n.removeCallbacksAndMessages(null);
        this.f937l.m1317z();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public void m1262U() {
        m1320P();
        m1267X();
    }

    @Override // ai.advance.sdk.global.iqa.AbstractActivityC0347d, ai.advance.core.PermissionActivity
    /* JADX INFO: renamed from: K */
    public /* bridge */ /* synthetic */ void mo1255K() {
        super.mo1255K();
    }

    @Override // ai.advance.sdk.global.iqa.AbstractActivityC0347d
    /* JADX INFO: renamed from: M */
    public /* bridge */ /* synthetic */ int mo1265M() {
        return super.mo1265M();
    }

    @Override // ai.advance.sdk.global.iqa.AbstractActivityC0347d
    /* JADX INFO: renamed from: O */
    public void mo1266O() {
        m1264W();
    }

    @Override // ai.advance.sdk.global.iqa.InterfaceC0348e
    /* JADX INFO: renamed from: a */
    public void mo1268a() {
        onBackPressed();
    }

    @Override // ai.advance.sdk.global.iqa.AbstractActivityC0347d, android.app.Activity
    public void finish() {
        super.finish();
        this.f938m.m1331k();
    }

    @Override // ai.advance.sdk.global.iqa.AbstractActivityC0347d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_global_iqa);
        C44203a.m97430c();
        ViewOnClickListenerC0346c viewOnClickListenerC0346c = new ViewOnClickListenerC0346c(this);
        this.f937l = viewOnClickListenerC0346c;
        this.f938m = viewOnClickListenerC0346c.f950c;
        mo1255K();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f938m.m1332l();
    }

    @Override // ai.advance.sdk.global.iqa.AbstractActivityC0347d, ai.advance.core.PermissionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) throws Throwable {
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        if (m1254G()) {
            this.f938m.m1333m();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f938m.m1334n();
    }

    @Override // ai.advance.sdk.global.iqa.AbstractActivityC0347d, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f938m.m1335o();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f937l.m1296L();
    }
}
