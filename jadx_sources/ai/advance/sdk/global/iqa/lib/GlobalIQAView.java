package ai.advance.sdk.global.iqa.lib;

import ai.advance.sdk.global.iqa.lib.code.ErrorCode;
import ai.advance.sdk.global.iqa.lib.code.ImageWarnCode;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import p387k.C40835j;
import p611s.C44212d;
import p611s.C44215e;
import p611s.C44251v0;
import p611s.C44254x;
import p626t.C44603a;
import p626t.C44605c;
import p647u.InterfaceC45082c;
import p647u.InterfaceC45083d;
import p647u.InterfaceC45084e;
import p647u.InterfaceC45085f;
import p647u.InterfaceC45086g;

/* JADX INFO: loaded from: classes23.dex */
public class GlobalIQAView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public final C0358g f978b;

    /* JADX INFO: renamed from: c */
    public final ImageView f979c;

    /* JADX INFO: renamed from: d */
    public final C44254x f980d;

    /* JADX INFO: renamed from: e */
    public String f981e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0351c f982f;

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.lib.GlobalIQAView$a */
    public class ViewOnClickListenerC0349a implements View.OnClickListener {
        public ViewOnClickListenerC0349a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GlobalIQAView.this.f980d.m97657r();
        }
    }

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.lib.GlobalIQAView$b */
    public class C0350b implements InterfaceC45082c {

        /* JADX INFO: renamed from: a */
        public volatile boolean f984a = false;

        /* JADX INFO: renamed from: b */
        public volatile boolean f985b = false;

        /* JADX INFO: renamed from: c */
        public volatile boolean f986c = false;

        /* JADX INFO: renamed from: d */
        public C44603a f987d = null;

        /* JADX INFO: renamed from: e */
        public volatile boolean f988e = false;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC45084e f989f;

        @Override // p647u.InterfaceC45080a
        /* JADX INFO: renamed from: e */
        public void mo1277e(C44603a c44603a) {
            this.f986c = true;
            this.f987d = c44603a;
            m1343i();
        }

        @Override // p647u.InterfaceC45082c
        /* JADX INFO: renamed from: h */
        public void mo1342h(boolean z11) {
            this.f984a = true;
            this.f985b = z11;
            m1343i();
        }

        /* JADX INFO: renamed from: i */
        public final synchronized void m1343i() {
            try {
                if (!this.f988e && (this.f984a & this.f986c)) {
                    this.f988e = true;
                    if (this.f985b) {
                        this.f989f.mo1277e(this.f987d);
                    } else {
                        InterfaceC45084e interfaceC45084e = this.f989f;
                        ErrorCode errorCode = ErrorCode.CAMERA_OPEN_FAILED;
                        interfaceC45084e.mo1277e(new C44603a(false, errorCode.name(), "Camera open failed"));
                        this.f989f.mo1278f(errorCode);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public C0350b(InterfaceC45084e interfaceC45084e) {
            this.f989f = interfaceC45084e;
        }

        @Override // p647u.InterfaceC45084e
        /* JADX INFO: renamed from: a */
        public void mo1275a(int i11) {
            this.f989f.mo1275a(i11);
        }

        @Override // p647u.InterfaceC45086g
        /* JADX INFO: renamed from: b */
        public void mo1273b(C44605c c44605c) {
            this.f989f.mo1273b(c44605c);
        }

        @Override // p647u.InterfaceC45080a
        /* JADX INFO: renamed from: c */
        public void mo1276c() {
            this.f989f.mo1276c();
        }

        @Override // p647u.InterfaceC45086g
        /* JADX INFO: renamed from: d */
        public void mo1274d() {
            this.f989f.mo1274d();
        }

        @Override // p647u.InterfaceC45084e
        /* JADX INFO: renamed from: f */
        public void mo1278f(ErrorCode errorCode) {
            this.f989f.mo1278f(errorCode);
        }

        @Override // p647u.InterfaceC45084e
        /* JADX INFO: renamed from: g */
        public void mo1279g(ImageWarnCode imageWarnCode) {
            this.f989f.mo1279g(imageWarnCode);
        }
    }

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.lib.GlobalIQAView$c */
    public interface InterfaceC0351c {
        void onSizeChanged(int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: renamed from: b */
    public void m1322b(String str) {
        m1323c(str, null);
    }

    /* JADX INFO: renamed from: p */
    public synchronized String m1336p(@NonNull C44215e c44215e, @NonNull InterfaceC45083d interfaceC45083d) {
        setVisibility(0);
        c44215e.f97626d = this.f981e;
        m1322b("startDetectionWithPhotoCapture");
        return this.f980d.m97654o(c44215e, interfaceC45083d);
    }

    /* JADX INFO: renamed from: q */
    public synchronized String m1337q(@NonNull C44212d c44212d, @NonNull InterfaceC45084e interfaceC45084e) {
        setVisibility(0);
        c44212d.f97612d = this.f981e;
        m1322b("startDetectionWithScan");
        return this.f980d.m97653n(c44212d, new C0350b(interfaceC45084e));
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m1339s() {
        this.f980d.m97647c0();
    }

    /* JADX INFO: renamed from: c */
    public void m1323c(String str, String str2) {
        C44251v0.m97601f(str, "GlobalIQAView", str2);
    }

    /* JADX INFO: renamed from: d */
    public void m1324d() {
        this.f980d.m97657r();
    }

    /* JADX INFO: renamed from: e */
    public void m1325e() {
        this.f980d.m97638M();
    }

    /* JADX INFO: renamed from: f */
    public boolean m1326f() {
        return this.f980d.m97641S();
    }

    /* JADX INFO: renamed from: g */
    public boolean m1327g() {
        return this.f980d.m97642U();
    }

    public String getPageId() {
        return this.f981e;
    }

    /* JADX INFO: renamed from: h */
    public boolean m1328h() {
        return this.f980d.m97643V();
    }

    /* JADX INFO: renamed from: j */
    public void m1330j(boolean z11) {
        this.f980d.m97648d0(z11);
    }

    public void setOnSizeChangedListener(InterfaceC0351c interfaceC0351c) {
        this.f982f = interfaceC0351c;
    }

    public void setPageId(String str) {
        this.f981e = str;
    }

    public void setVoiceRawId(int i11) {
        this.f980d.m97651g0(i11);
    }

    /* JADX INFO: renamed from: t */
    public void m1340t() {
        this.f980d.m97652h0();
    }

    public GlobalIQAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0358g c0358g = new C0358g(context);
        this.f978b = c0358g;
        addView(c0358g);
        setVisibility(4);
        ImageView imageView = new ImageView(context);
        this.f979c = imageView;
        addView(imageView);
        this.f981e = C40835j.m89369c();
        this.f980d = new C44254x(this);
        setOnClickListener(new ViewOnClickListenerC0349a());
    }

    /* JADX INFO: renamed from: i */
    public void m1329i() {
        m1322b("notUsePhoto");
        this.f980d.m97644Z();
    }

    /* JADX INFO: renamed from: k */
    public void m1331k() {
        m1322b("onFinish");
    }

    /* JADX INFO: renamed from: l */
    public void m1332l() {
        m1322b("onPause");
    }

    /* JADX INFO: renamed from: m */
    public void m1333m() {
        m1322b("onRestart");
        this.f980d.m97649e0();
    }

    /* JADX INFO: renamed from: n */
    public void m1334n() {
        m1322b("onResume");
    }

    /* JADX INFO: renamed from: o */
    public void m1335o() {
        m1322b("onSaveBundle");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof C0358g) {
                int iM1360e = (int) (JNI.m1360e() * ((double) (i13 - i11)));
                int iM1361f = (int) (JNI.m1361f() * ((double) (i14 - i12)));
                ((C0358g) childAt).layout(-iM1360e, -iM1361f, getMeasuredWidth() + iM1360e, getMeasuredHeight() + iM1361f);
            }
            if (childAt instanceof ImageView) {
                int iM1360e2 = (int) (JNI.m1360e() * ((double) (i13 - i11)));
                int iM1361f2 = (int) (JNI.m1361f() * ((double) (i14 - i12)));
                ((ImageView) childAt).layout(-iM1360e2, -iM1361f2, getMeasuredWidth() + iM1360e2, getMeasuredHeight() + iM1361f2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt instanceof C0358g) {
                ((C0358g) childAt).measure(View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i11)) * ((JNI.m1360e() * 2.0d) + 1.0d)), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i12)) * ((JNI.m1361f() * 2.0d) + 1.0d)), 1073741824));
            }
            if (childAt instanceof ImageView) {
                ((ImageView) childAt).measure(View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i11)) * ((JNI.m1360e() * 2.0d) + 1.0d)), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i12)) * ((JNI.m1361f() * 2.0d) + 1.0d)), 1073741824));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        InterfaceC0351c interfaceC0351c = this.f982f;
        if (interfaceC0351c != null) {
            interfaceC0351c.onSizeChanged(i11, i12, i13, i14);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m1338r(InterfaceC45085f interfaceC45085f) {
        m1322b("takePhoto");
        this.f980d.m97663z(interfaceC45085f);
    }

    /* JADX INFO: renamed from: u */
    public void m1341u(InterfaceC45086g interfaceC45086g) {
        m1322b("usePhoto");
        this.f980d.m97634A(interfaceC45086g);
    }
}
