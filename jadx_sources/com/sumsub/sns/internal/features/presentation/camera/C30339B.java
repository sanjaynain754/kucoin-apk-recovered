package com.sumsub.sns.internal.features.presentation.camera;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.sumsub.sns.R$color;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28776i;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30339B extends AbstractC28787t {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ KProperty[] f61004n = {AbstractC28118g.m69077a(C30339B.class, "toolbar", "getToolbar()Lcom/sumsub/sns/core/widget/SNSToolbarView;", 0), AbstractC28639a.m69485a(C30339B.class, "_isFlashOn", "get_isFlashOn()Z", 0)};

    /* JADX INFO: renamed from: e */
    public final Function0 f61005e;

    /* JADX INFO: renamed from: f */
    public final Function1 f61006f;

    /* JADX INFO: renamed from: g */
    public final C30338A f61007g;

    /* JADX INFO: renamed from: h */
    public final String f61008h;

    /* JADX INFO: renamed from: i */
    public final Lazy f61009i;

    /* JADX INFO: renamed from: j */
    public final C28778k f61010j;

    /* JADX INFO: renamed from: k */
    public final Lazy f61011k;

    /* JADX INFO: renamed from: l */
    public boolean f61012l;

    /* JADX INFO: renamed from: m */
    public final C28776i f61013m;

    /* JADX INFO: renamed from: a */
    public static final int m70194a(C30339B c30339b) {
        C28955c c28955c;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.CAMERA_CONTENT;
            boolean zM69346a = AbstractC28458h.m69346a(c30339b.f58549a.requireContext().getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return ContextCompat.getColor(c30339b.f58549a.requireContext(), R$color.sns_cameraContent);
    }

    public C30339B(C30751t c30751t, final Function0 function0, Function0 function1, Function1 function2, C30338A c30338a) {
        super(c30751t.f58549a, c30751t);
        this.f61005e = function1;
        this.f61006f = function2;
        this.f61007g = c30338a;
        this.f61008h = "CameraToolbar";
        this.f61009i = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30339B.m70195a(function0);
            }
        });
        this.f61010j = m69602a(c30338a.f61002a);
        this.f61011k = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C30339B.m70194a(this.f61087b));
            }
        });
        this.f61013m = new C28776i("FLASH_IS_ON", false);
    }

    /* JADX INFO: renamed from: b */
    public static final void m70198b(C30339B c30339b, View view) {
        C28776i c28776i = c30339b.f61013m;
        KProperty[] kPropertyArr = f61004n;
        KProperty kProperty = kPropertyArr[1];
        boolean z11 = !c28776i.m69599a(c30339b);
        C28776i c28776i2 = c30339b.f61013m;
        KProperty kProperty2 = kPropertyArr[1];
        c28776i2.getClass();
        Bundle arguments = c30339b.f58549a.getArguments();
        if (arguments != null) {
            arguments.putBoolean(c30339b.m69603a(c28776i2.f58526a), z11);
        }
        c30339b.m70200o();
        Function1 function1 = c30339b.f61006f;
        C28776i c28776i3 = c30339b.f61013m;
        KProperty kProperty3 = kPropertyArr[1];
        function1.invoke(Boolean.valueOf(c28776i3.m69599a(c30339b)));
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f61008h;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: i */
    public final void mo69531i() {
        this.f61012l = ((C30800z) this.f61005e.invoke()).f62225a;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        m69605a((InterfaceC30798y) this.f61009i.getValue(), new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C30339B.m70196a(this.f61066b, (C30796x) obj);
            }
        });
        m70199n();
    }

    /* JADX INFO: renamed from: n */
    public final void m70199n() {
        SNSToolbarView sNSToolbarView = (SNSToolbarView) this.f61010j.getValue(this, f61004n[0]);
        if (sNSToolbarView != null) {
            sNSToolbarView.initTitle(this.f61007g.f61003b);
            TextView titleView = sNSToolbarView.getTitleView();
            if (titleView != null) {
                titleView.setTextColor(((Number) this.f61011k.getValue()).intValue());
            }
            sNSToolbarView.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.camera.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C30339B.m70197a(this.f61093b, view);
                }
            });
            sNSToolbarView.setOnOptionButtonClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.camera.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C30339B.m70198b(this.f61099b, view);
                }
            });
            sNSToolbarView.setIconTintList(ColorStateList.valueOf(((Number) this.f61011k.getValue()).intValue()));
        }
        m70200o();
    }

    /* JADX INFO: renamed from: o */
    public final void m70200o() {
        C28778k c28778k = this.f61010j;
        KProperty[] kPropertyArr = f61004n;
        SNSToolbarView sNSToolbarView = (SNSToolbarView) c28778k.getValue(this, kPropertyArr[0]);
        if (sNSToolbarView != null) {
            sNSToolbarView.setOptionButtonVisible(this.f61012l);
        }
        if (this.f61012l) {
            SNSIconHandler iconHandler = C28468k0.f57983a.getIconHandler();
            Context contextRequireContext = this.f58549a.requireContext();
            C28776i c28776i = this.f61013m;
            KProperty kProperty = kPropertyArr[1];
            Drawable drawableOnResolveIcon = iconHandler.onResolveIcon(contextRequireContext, (c28776i.m69599a(this) ? SNSIconHandler.SNSCommonIcons.TORCH_ON : SNSIconHandler.SNSCommonIcons.TORCH_OFF).getImageName());
            SNSToolbarView sNSToolbarView2 = (SNSToolbarView) this.f61010j.getValue(this, kPropertyArr[0]);
            if (sNSToolbarView2 != null) {
                sNSToolbarView2.setOptionButtonDrawable(drawableOnResolveIcon);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC30798y m70195a(Function0 function0) {
        return (InterfaceC30798y) function0.invoke();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70196a(C30339B c30339b, C30796x c30796x) {
        TextView titleView;
        SNSToolbarView sNSToolbarView = (SNSToolbarView) c30339b.f61010j.getValue(c30339b, f61004n[0]);
        if (sNSToolbarView != null && (titleView = sNSToolbarView.getTitleView()) != null) {
            titleView.setText(c30796x.f62222a);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70197a(C30339B c30339b, View view) {
        AbstractC28052C.finish$default(c30339b.f58549a.getViewModel$idensic_mobile_sdk_aar_defaultRelease(), null, null, null, null, 15, null);
    }
}
