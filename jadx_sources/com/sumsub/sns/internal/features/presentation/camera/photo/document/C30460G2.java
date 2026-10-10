package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.material.progressindicator.LinearProgressIndicator;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.G2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30460G2 extends AbstractC28787t {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty[] f61409k = {AbstractC28118g.m69077a(C30460G2.class, TtmlNode.RUBY_CONTAINER, "getContainer()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C30460G2.class, "text", "getText()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C30460G2.class, "progress", "getProgress()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", 0)};

    /* JADX INFO: renamed from: e */
    public final String f61410e;

    /* JADX INFO: renamed from: f */
    public final Lazy f61411f;

    /* JADX INFO: renamed from: g */
    public final Lazy f61412g;

    /* JADX INFO: renamed from: h */
    public final C28778k f61413h;

    /* JADX INFO: renamed from: i */
    public final C28778k f61414i;

    /* JADX INFO: renamed from: j */
    public final C28778k f61415j;

    public C30460G2(C30572j c30572j, C30456F2 c30456f2) {
        super(c30572j.f58549a, c30572j);
        this.f61410e = "UploadProgress";
        this.f61411f = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.n3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C30460G2.m70357a(this.f61814b));
            }
        });
        this.f61412g = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.o3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C30460G2.m70358b(this.f61835b));
            }
        });
        this.f61413h = m69602a(c30456f2.f61399a);
        this.f61414i = m69602a(c30456f2.f61400b);
        this.f61415j = m69602a(c30456f2.f61401c);
    }

    /* JADX INFO: renamed from: a */
    public static final int m70357a(C30460G2 c30460g2) {
        C28955c c28955c;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.CAMERA_CONTENT;
            boolean zM69346a = AbstractC28458h.m69346a(c30460g2.f58549a.requireContext().getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return ContextCompat.getColor(c30460g2.f58549a.requireContext(), R$color.sns_cameraContent);
    }

    /* JADX INFO: renamed from: b */
    public static final int m70358b(C30460G2 c30460g2) {
        C28955c c28955c;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.CAMERA_BACKGROUND_OVERLAY;
            boolean zM69346a = AbstractC28458h.m69346a(c30460g2.f58549a.requireContext().getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return ContextCompat.getColor(c30460g2.f58549a.requireContext(), R$color.sns_cameraBackgroundOverlay);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f61410e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        C28778k c28778k = this.f61413h;
        KProperty[] kPropertyArr = f61409k;
        ViewGroup viewGroup = (ViewGroup) c28778k.getValue(this, kPropertyArr[0]);
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(((Number) this.f61412g.getValue()).intValue());
        }
        TextView textView = (TextView) this.f61414i.getValue(this, kPropertyArr[1]);
        if (textView != null) {
            textView.setTextColor(((Number) this.f61411f.getValue()).intValue());
        }
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) this.f61415j.getValue(this, kPropertyArr[2]);
        if (linearProgressIndicator != null) {
            linearProgressIndicator.setIndicatorColor(((Number) this.f61411f.getValue()).intValue());
            linearProgressIndicator.setTrackColor(ColorUtils.setAlphaComponent(((Number) this.f61411f.getValue()).intValue(), 61));
        }
    }
}
