package com.sumsub.sns.internal.features.presentation.camera;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28788u;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30794w extends AbstractC28787t {

    /* JADX INFO: renamed from: e */
    public final String f62219e;

    /* JADX INFO: renamed from: f */
    public final Lazy f62220f;

    public C30794w(C30751t c30751t) {
        super(c30751t.f58549a, c30751t);
        this.f62219e = "CameraSystemBars";
        new C28788u(this);
        this.f62220f = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.d1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C30794w.m70457a(this.f61094b));
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final int m70457a(C30794w c30794w) {
        C28955c c28955c;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.CAMERA_BACKGROUND;
            boolean zM69346a = AbstractC28458h.m69346a(c30794w.f58549a.requireContext().getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return ContextCompat.getColor(c30794w.f58549a.requireContext(), R$color.sns_cameraBackground);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f62219e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        C30755v c30755v;
        Window window = this.f58549a.requireActivity().getWindow();
        View decorView = window.getDecorView();
        int i11 = R$id.sns_system_bars_owner;
        Object tag = decorView.getTag(i11);
        C30753u c30753u = tag instanceof C30753u ? (C30753u) tag : null;
        String string = toString();
        if (c30753u != null) {
            c30755v = c30753u.f62134b;
        } else {
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
            int statusBarColor = window.getStatusBarColor();
            int navigationBarColor = window.getNavigationBarColor();
            Drawable background = window.getDecorView().getBackground();
            ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
            c30755v = new C30755v(statusBarColor, navigationBarColor, colorDrawable != null ? colorDrawable.getColor() : 0, windowInsetsControllerCompat.isAppearanceLightStatusBars(), windowInsetsControllerCompat.isAppearanceLightNavigationBars());
        }
        C30753u c30753u2 = new C30753u(string, c30755v);
        window.setStatusBarColor(((Number) this.f62220f.getValue()).intValue());
        window.setNavigationBarColor(((Number) this.f62220f.getValue()).intValue());
        window.getDecorView().setBackgroundColor(((Number) this.f62220f.getValue()).intValue());
        WindowInsetsControllerCompat windowInsetsControllerCompat2 = new WindowInsetsControllerCompat(window, window.getDecorView());
        windowInsetsControllerCompat2.setAppearanceLightStatusBars(false);
        windowInsetsControllerCompat2.setAppearanceLightNavigationBars(false);
        window.getDecorView().setTag(i11, c30753u2);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
        Window window = this.f58549a.requireActivity().getWindow();
        View decorView = window.getDecorView();
        int i11 = R$id.sns_system_bars_owner;
        Object tag = decorView.getTag(i11);
        C30753u c30753u = tag instanceof C30753u ? (C30753u) tag : null;
        if (c30753u != null && Intrinsics.areEqual(c30753u.f62133a, toString())) {
            window.getDecorView().setTag(i11, null);
            window.setStatusBarColor(c30753u.f62134b.f62136a);
            window.setNavigationBarColor(c30753u.f62134b.f62137b);
            window.getDecorView().setBackgroundColor(c30753u.f62134b.f62138c);
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
            windowInsetsControllerCompat.setAppearanceLightStatusBars(c30753u.f62134b.f62139d);
            windowInsetsControllerCompat.setAppearanceLightNavigationBars(c30753u.f62134b.f62140e);
        }
    }
}
