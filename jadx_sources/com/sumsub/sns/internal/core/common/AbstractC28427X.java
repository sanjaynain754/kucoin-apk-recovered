package com.sumsub.sns.internal.core.common;

import android.graphics.Typeface;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.C5112t0;
import com.airbnb.lottie.InterfaceC5089l0;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieAnimationView;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.presentation.theme.C28961i;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p297h1.C38074d;
import p522p1.C43349b;
import p522p1.InterfaceC43352e;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28427X {
    /* JADX INFO: renamed from: a */
    public static final void m69311a(final LottieAnimationView lottieAnimationView, final Float f11) {
        int i11 = R$id.sns_lottie_speed_listener;
        Object tag = lottieAnimationView.getTag(i11);
        InterfaceC5089l0 interfaceC5089l0 = tag instanceof InterfaceC5089l0 ? (InterfaceC5089l0) tag : null;
        if (interfaceC5089l0 != null) {
            lottieAnimationView.removeLottieOnCompositionLoadedListener(interfaceC5089l0);
        }
        final Function2 function2 = new Function2() { // from class: com.sumsub.sns.internal.core.common.n1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(AbstractC28427X.m69309a(((Float) obj).floatValue(), (Float) obj2));
            }
        };
        InterfaceC5089l0 interfaceC5089l1 = new InterfaceC5089l0() { // from class: com.sumsub.sns.internal.core.common.o1
            @Override // com.airbnb.lottie.InterfaceC5089l0
            /* JADX INFO: renamed from: a */
            public final void mo5522a(C5080h c5080h) {
                AbstractC28427X.m69314a(lottieAnimationView, function2, f11, c5080h);
            }
        };
        lottieAnimationView.setTag(i11, interfaceC5089l1);
        lottieAnimationView.addLottieOnCompositionLoadedListener(interfaceC5089l1);
        C5080h composition = lottieAnimationView.getComposition();
        if (composition != null) {
            lottieAnimationView.setSpeed(((Number) function2.invoke(Float.valueOf(composition.m5653d()), f11)).floatValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: a */
    public static final float m69309a(float f11, Float f12) {
        if (f12 != null) {
            float fFloatValue = f12.floatValue();
            if (Math.abs(fFloatValue) > Float.MAX_VALUE || fFloatValue <= 0.0f) {
                f12 = null;
            }
        } else {
            f12 = null;
        }
        if (f12 == null || f11 <= 0.0f) {
            return 1.0f;
        }
        return (f11 / TimeUnit.SECONDS.toMillis(1L)) / f12.floatValue();
    }

    /* JADX INFO: renamed from: a */
    public static final void m69314a(LottieAnimationView lottieAnimationView, Function2 function2, Float f11, C5080h c5080h) {
        lottieAnimationView.setSpeed(((Number) function2.invoke(Float.valueOf(c5080h.m5653d()), f11)).floatValue());
    }

    /* JADX INFO: renamed from: a */
    public static void m69313a(LottieAnimationView lottieAnimationView, String str, CharSequence charSequence) {
        Typeface typeface;
        Map map;
        C28961i c28961i;
        SNSTypographyElement sNSTypographyElement = SNSTypographyElement.CAPTION;
        int i11 = R$id.sns_lottie_text_delegate;
        Object tag = lottieAnimationView.getTag(i11);
        C5112t0 c5112t0 = tag instanceof C5112t0 ? (C5112t0) tag : null;
        if (c5112t0 == null) {
            c5112t0 = new C5112t0(lottieAnimationView);
            lottieAnimationView.setTag(i11, c5112t0);
            lottieAnimationView.setTextDelegate(c5112t0);
            SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
            SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
            C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
            if (c28966p == null || (map = c28966p.f58876b) == null || (c28961i = (C28961i) map.get(sNSTypographyElement.getValue())) == null || (typeface = c28961i.f58872d) == null) {
                typeface = Typeface.SANS_SERIF;
            }
            lottieAnimationView.setFontAssetDelegate(new C28425W(typeface));
        }
        c5112t0.m5907e(str.toString(), charSequence.toString());
    }

    /* JADX INFO: renamed from: a */
    public static final void m69312a(LottieAnimationView lottieAnimationView, String str, final int i11) {
        lottieAnimationView.addValueCallback(new C38074d("**", str), InterfaceC5091m0.f6007a, (InterfaceC43352e<Integer>) new InterfaceC43352e() { // from class: com.sumsub.sns.internal.core.common.p1
            @Override // p522p1.InterfaceC43352e
            /* JADX INFO: renamed from: a */
            public final Object mo69378a(C43349b c43349b) {
                return AbstractC28427X.m69310a(i11, c43349b);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final Integer m69310a(int i11, C43349b c43349b) {
        return Integer.valueOf(i11);
    }
}
