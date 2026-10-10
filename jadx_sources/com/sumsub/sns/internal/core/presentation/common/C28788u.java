package com.sumsub.sns.internal.core.presentation.common;

import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.firebase.perf.util.Constants;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K;
import com.sumsub.sns.internal.features.presentation.camera.C30794w;
import com.sumsub.sns.internal.p125ff.C33048a;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28788u extends AbstractC28787t {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ KProperty[] f58553g = {AbstractC28118g.m69077a(C28788u.class, Constants.ENABLE_DISABLE, "isEnabled()Z", 0)};

    /* JADX INFO: renamed from: e */
    public final String f58554e;

    /* JADX INFO: renamed from: f */
    public final C28776i f58555f;

    public C28788u(AbstractC30348K abstractC30348K) {
        super(abstractC30348K, null);
        this.f58554e = "TransparentStatusBar";
        this.f58555f = new C28776i("CAMERA_FULL_SCREEN", C33048a.f67478k.m71434a());
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f58554e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        C28776i c28776i = this.f58555f;
        KProperty kProperty = f58553g[0];
        if (c28776i.m69599a(this)) {
            Window window = this.f58549a.requireActivity().getWindow();
            WindowCompat.setDecorFitsSystemWindows(window, false);
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, this.f58549a.requireView());
            windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.systemBars());
            windowInsetsControllerCompat.setSystemBarsBehavior(2);
            window.getDecorView().setTag(R$id.sns_fullscreen_owner, toString());
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
        C28776i c28776i = this.f58555f;
        KProperty kProperty = f58553g[0];
        if (c28776i.m69599a(this)) {
            Window window = this.f58549a.requireActivity().getWindow();
            View decorView = window.getDecorView();
            int i11 = R$id.sns_fullscreen_owner;
            if (Intrinsics.areEqual(decorView.getTag(i11), toString())) {
                window.getDecorView().setTag(i11, null);
                WindowCompat.setDecorFitsSystemWindows(window, true);
                new WindowInsetsControllerCompat(window, this.f58549a.requireView()).show(WindowInsetsCompat.Type.systemBars());
            }
        }
    }

    public C28788u(C30794w c30794w) {
        super(c30794w.f58549a, c30794w);
        this.f58554e = "TransparentStatusBar";
        this.f58555f = new C28776i("CAMERA_FULL_SCREEN", C33048a.f67478k.m71434a());
    }
}
