package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.AbstractC28443c1;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30530c extends AbstractC28787t {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty[] f61648i = {AbstractC28118g.m69077a(C30530c.class, "autoCaptureHint", "getAutoCaptureHint()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C30530c.class, "autoCaptureHintText", "getAutoCaptureHintText()Landroid/widget/TextView;", 0)};

    /* JADX INFO: renamed from: e */
    public final String f61649e;

    /* JADX INFO: renamed from: f */
    public final Lazy f61650f;

    /* JADX INFO: renamed from: g */
    public final C28778k f61651g;

    /* JADX INFO: renamed from: h */
    public final C28778k f61652h;

    /* JADX INFO: renamed from: a */
    public static final int m70405a(C30530c c30530c) {
        C28955c c28955c;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.CAMERA_BACKGROUND;
            boolean zM69346a = AbstractC28458h.m69346a(c30530c.f58549a.requireContext().getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return ContextCompat.getColor(c30530c.f58549a.requireContext(), R$color.sns_cameraBackground);
    }

    public C30530c(C30572j c30572j, C30524b c30524b) {
        super(c30572j.f58549a, c30572j);
        this.f61649e = "AutocaptureHint";
        this.f61650f = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.n4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C30530c.m70405a(this.f61815b));
            }
        });
        this.f61651g = m69602a(c30524b.f61638a);
        this.f61652h = m69602a(c30524b.f61639b);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f61649e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        ViewGroup viewGroup = (ViewGroup) this.f61651g.getValue(this, f61648i[0]);
        if (viewGroup != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            SNSMetricElement sNSMetricElement = SNSMetricElement.DOCUMENT_FRAME_CORNER_RADIUS;
            SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
            Float f11 = null;
            SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
            C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
            if (c28966p != null) {
                Map map = c28966p.f58878d;
                AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
                C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
                if (c28956d != null) {
                    f11 = c28956d.f58860a;
                }
            }
            gradientDrawable.setCornerRadius(f11 != null ? f11.floatValue() : this.f58549a.requireContext().getResources().getDimensionPixelSize(R$dimen.sns_state_frame_radius));
            gradientDrawable.setColor(((Number) this.f61650f.getValue()).intValue());
            viewGroup.setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70406a(String str, boolean z11) {
        TextView textView;
        C28778k c28778k = this.f61651g;
        KProperty[] kPropertyArr = f61648i;
        ViewGroup viewGroup = (ViewGroup) c28778k.getValue(this, kPropertyArr[0]);
        if (viewGroup == null) {
            return;
        }
        boolean z12 = str == null || StringsKt.isBlank(str);
        boolean z13 = !z12 && z11;
        if (!z12 && (textView = (TextView) this.f61652h.getValue(this, kPropertyArr[1])) != null) {
            textView.setText(str);
        }
        boolean z14 = viewGroup.getVisibility() == 0 && viewGroup.getAlpha() == 1.0f;
        boolean z15 = viewGroup.getVisibility() == 0;
        if (z13 && !z14) {
            AbstractC28443c1.m69322a(viewGroup);
        } else {
            if (z13 || !z15) {
                return;
            }
            AbstractC28443c1.m69323b(viewGroup);
        }
    }
}
