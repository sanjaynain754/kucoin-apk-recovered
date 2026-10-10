package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.sumsub.sns.R$color;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30584l extends AbstractC28787t {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ KProperty[] f61763l = {AbstractC28118g.m69077a(C30584l.class, "frameHintContainer", "getFrameHintContainer()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C30584l.class, "frameHintText", "getFrameHintText()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C30584l.class, "frameHintIcon", "getFrameHintIcon()Landroid/widget/ImageView;", 0), AbstractC28118g.m69077a(C30584l.class, "frameHintAnimation", "getFrameHintAnimation()Lcom/airbnb/lottie/LottieAnimationView;", 0)};

    /* JADX INFO: renamed from: e */
    public final String f61764e;

    /* JADX INFO: renamed from: f */
    public final Lazy f61765f;

    /* JADX INFO: renamed from: g */
    public final Lazy f61766g;

    /* JADX INFO: renamed from: h */
    public final C28778k f61767h;

    /* JADX INFO: renamed from: i */
    public final C28778k f61768i;

    /* JADX INFO: renamed from: j */
    public final C28778k f61769j;

    /* JADX INFO: renamed from: k */
    public final C28778k f61770k;

    public C30584l(C30572j c30572j, C30578k c30578k) {
        super(c30572j.f58549a, c30572j);
        this.f61764e = "PopUpHint";
        this.f61765f = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.o4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C30584l.m70410a(this.f61836b));
            }
        });
        this.f61766g = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.p4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C30584l.m70411b(this.f61851b));
            }
        });
        this.f61767h = m69602a(c30578k.f61753a);
        this.f61768i = m69602a(c30578k.f61754b);
        this.f61769j = m69602a(c30578k.f61755c);
        this.f61770k = m69602a(c30578k.f61756d);
    }

    /* JADX INFO: renamed from: a */
    public static final int m70410a(C30584l c30584l) {
        C28955c c28955c;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.CAMERA_CONTENT;
            boolean zM69346a = AbstractC28458h.m69346a(c30584l.f58549a.requireContext().getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return ContextCompat.getColor(c30584l.f58549a.requireContext(), R$color.sns_cameraContent);
    }

    /* JADX INFO: renamed from: b */
    public static final int m70411b(C30584l c30584l) {
        C28955c c28955c;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.CAMERA_BACKGROUND_OVERLAY;
            boolean zM69346a = AbstractC28458h.m69346a(c30584l.f58549a.requireContext().getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return ContextCompat.getColor(c30584l.f58549a.requireContext(), R$color.sns_cameraBackgroundOverlay);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f61764e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        C28778k c28778k = this.f61767h;
        KProperty[] kPropertyArr = f61763l;
        ViewGroup viewGroup = (ViewGroup) c28778k.getValue(this, kPropertyArr[0]);
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(((Number) this.f61766g.getValue()).intValue());
        }
        TextView textView = (TextView) this.f61768i.getValue(this, kPropertyArr[1]);
        if (textView != null) {
            textView.setTextColor(((Number) this.f61765f.getValue()).intValue());
        }
        ImageView imageView = (ImageView) this.f61769j.getValue(this, kPropertyArr[2]);
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(((Number) this.f61765f.getValue()).intValue()));
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f61770k.getValue(this, f61763l[3]);
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
    }
}
