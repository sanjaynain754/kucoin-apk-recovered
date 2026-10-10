package a3d20260409;

import aai.liveness.Detector$DetectionFailedType;
import aai.liveness.Detector$DetectionType;
import aai.liveness.Detector$WarnCode;
import aai.liveness.http.entity.ResultEntity;
import ai.advance.common.camera.GuardianCameraViewV2;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.TUIConstants;
import intl.o0oOOOOOooooo;
import p216e.InterfaceC36994a;
import p216e.InterfaceC36995b;
import p277g.C37737c;
import p277g.C37739e;
import p277g.InterfaceC37735a;
import we0.C45819f;
import we0.InterfaceC45814a;
import we0.InterfaceC45821h;
import we0.InterfaceC45823j;

/* JADX INFO: loaded from: classes23.dex */
public class oOOOOOooooOo extends FrameLayout implements InterfaceC45821h {

    /* JADX INFO: renamed from: b */
    public o0o00 f390b;

    /* JADX INFO: renamed from: c */
    public a20260409View f391c;

    /* JADX INFO: renamed from: d */
    public OOOoooooo f392d;

    /* JADX INFO: renamed from: e */
    public final Object f393e;

    /* JADX INFO: renamed from: a3d20260409.oOOOOOooooOo$a */
    public class C0100a implements InterfaceC36994a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC36994a f394b;

        /* JADX INFO: renamed from: a3d20260409.oOOOOOooooOo$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                oOOOOOooooOo.this.m452e();
            }
        }

        public C0100a(InterfaceC36994a interfaceC36994a) {
            this.f394b = interfaceC36994a;
        }

        @Override // p045c.InterfaceC4752b
        /* JADX INFO: renamed from: d */
        public void mo418d(boolean z11, String str, String str2) {
            this.f394b.mo418d(z11, str, str2);
        }

        @Override // p216e.InterfaceC36994a
        /* JADX INFO: renamed from: e */
        public void mo465e() {
            this.f394b.mo465e();
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 100L);
        }

        @Override // p216e.InterfaceC36994a
        /* JADX INFO: renamed from: h */
        public void mo466h(Detector$WarnCode detector$WarnCode) {
            this.f394b.mo466h(detector$WarnCode);
        }

        @Override // p045c.InterfaceC4752b
        /* JADX INFO: renamed from: j */
        public void mo428j() {
            this.f394b.mo428j();
        }

        @Override // p216e.InterfaceC36994a
        /* JADX INFO: renamed from: k */
        public void mo467k(long j11) {
            this.f394b.mo467k(j11);
        }

        @Override // p216e.InterfaceC36994a
        /* JADX INFO: renamed from: r */
        public void mo468r() {
            this.f394b.mo468r();
        }

        @Override // p216e.InterfaceC36994a
        /* JADX INFO: renamed from: y */
        public void mo469y(Detector$DetectionFailedType detector$DetectionFailedType, Detector$DetectionType detector$DetectionType) {
            this.f394b.mo469y(detector$DetectionFailedType, detector$DetectionType);
        }
    }

    /* JADX INFO: renamed from: a3d20260409.oOOOOOooooOo$b */
    public class C0101b implements OOOoooooo.InterfaceC0061a {
        public C0101b() {
        }

        @Override // a3d20260409.OOOoooooo.InterfaceC0061a
        /* JADX INFO: renamed from: a */
        public void mo87a(boolean z11) {
            oOOOOOooooOo.this.m456i(z11 ? "capture_done" : "capture_failed");
        }
    }

    /* JADX INFO: renamed from: a3d20260409.oOOOOOooooOo$c */
    public class C0102c implements InterfaceC36995b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC36995b f398a;

        public C0102c(InterfaceC36995b interfaceC36995b) {
            this.f398a = interfaceC36995b;
        }

        @Override // p216e.InterfaceC36995b
        /* JADX INFO: renamed from: a */
        public void mo470a(ResultEntity resultEntity) {
            this.f398a.mo470a(resultEntity);
        }

        @Override // p216e.InterfaceC36995b
        /* JADX INFO: renamed from: b */
        public void mo471b() {
            this.f398a.mo471b();
        }

        @Override // p216e.InterfaceC36995b
        /* JADX INFO: renamed from: c */
        public void mo472c(ResultEntity resultEntity, String str) {
            this.f398a.mo472c(resultEntity, str);
        }
    }

    public oOOOOOooooOo(@NonNull Context context) {
        this(context, null);
    }

    public oOOOOOooooOo(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f393e = new Object();
        setBackgroundColor(-1);
        o0o00 o0o00Var = new o0o00(context);
        this.f390b = o0o00Var;
        addView(o0o00Var);
        a20260409View a20260409view = new a20260409View(context);
        this.f391c = a20260409view;
        addView(a20260409view);
        this.f390b.setFaceCaptureCallback(this);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C37737c m451d(String str) {
        return new C37737c.b("close_bk_cam").m85075c("source", str).m85076d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m452e() {
        if (C0109v.m544r(intl.oOooooooo0000000000.COLLECT_BACK_IMAGE)) {
            try {
                this.f392d = new OOOoooooo(getContext());
                this.f392d.setLayoutParams(new FrameLayout.LayoutParams(1, 1));
                addView(this.f392d);
                this.f392d.m85H0(C37739e.m85098b(this.f390b.getSessionData()), new C0101b());
            } catch (Exception e11) {
                C45819f.m101227J().m83492H(e11);
            }
        }
    }

    @Override // we0.InterfaceC45821h
    /* JADX INFO: renamed from: a */
    public void mo412a(o0oOOOOOooooo o0ooooooooooo) {
        this.f391c.m100e(o0ooooooooooo);
    }

    public Detector$DetectionType getCurrentDetectionType() {
        return this.f390b.getCurrentDetectionType();
    }

    /* JADX INFO: renamed from: i */
    public final void m456i(final String str) {
        try {
            synchronized (this.f393e) {
                try {
                    final OOOoooooo oOOoooooo = this.f392d;
                    if (oOOoooooo != null) {
                        this.f392d = null;
                        oOOoooooo.mo1179P(new GuardianCameraViewV2.InterfaceC0337h() { // from class: a3d20260409.q
                            @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0337h
                            /* JADX INFO: renamed from: a */
                            public final void mo366a() {
                                this.f420a.m455f(oOOoooooo, str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public void m457j(InterfaceC36995b interfaceC36995b) {
        this.f390b.m424f1(new C0102c(interfaceC36995b));
    }

    /* JADX INFO: renamed from: k */
    public boolean m458k() {
        return this.f390b.m407T0();
    }

    /* JADX INFO: renamed from: l */
    public boolean m459l() {
        return this.f390b.m1187Z();
    }

    /* JADX INFO: renamed from: m */
    public boolean m460m() {
        return this.f390b.m432l1();
    }

    /* JADX INFO: renamed from: n */
    public void m461n() {
        this.f390b.mo413a0();
        m456i(TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC);
    }

    @Override // we0.InterfaceC45821h
    /* JADX INFO: renamed from: o */
    public void mo436o(String str) {
        this.f391c.m101f(str);
    }

    /* JADX INFO: renamed from: p */
    public void m462p() {
        this.f390b.m400D1();
        this.f391c.m102h();
        m456i("pause");
    }

    /* JADX INFO: renamed from: r */
    public void m464r(int i11, boolean z11, long j11) {
        this.f390b.m1188c0(i11, z11, j11);
    }

    public void setFrameCallback(InterfaceC45814a interfaceC45814a) {
        this.f390b.setFrameCallback(interfaceC45814a);
    }

    public void setLivenssCallback(InterfaceC36994a interfaceC36994a) {
        this.f390b.setLivenssCallback(new C0100a(interfaceC36994a));
    }

    public void setMaskColor(int i11) {
        this.f391c.m98c(i11);
    }

    public void setOvalColor(int i11) {
        this.f391c.O0OOOoOooo(i11);
    }

    public void setOvalNormalColor(int i11) {
        this.f391c.OOOoooooo(i11);
    }

    public void setPrepareMillSeconds(long j11) {
        this.f390b.setPrepareMillSeconds(j11);
    }

    public void setSoundPlayEnable(boolean z11) {
        this.f390b.setSoundPlayEnable(z11);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        if (i11 != 0) {
            this.f390b.setVisibility(i11);
            this.f391c.setVisibility(i11);
        }
        super.setVisibility(0);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m455f(OOOoooooo oOOoooooo, final String str) {
        try {
            removeView(oOOoooooo);
            if (this.f390b != null) {
                C45819f.m101227J().m83490F(new InterfaceC37735a() { // from class: a3d20260409.r
                    @Override // p277g.InterfaceC37735a
                    /* JADX INFO: renamed from: a */
                    public final Object mo92a() {
                        return oOOOOOooooOo.m451d(str);
                    }
                }, this.f390b.getSessionData());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    public void m463q() {
        if (m458k()) {
            this.f390b.m401E1();
        }
    }

    public void setModelResultCallback(InterfaceC45823j interfaceC45823j) {
    }
}
