package com.sumsub.sns.core.presentation.intro;

import android.content.Context;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$TextAlignment;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.core.widget.SNSIntroItemView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28960h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import java.util.Map;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.intro.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28235a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30000a f57528a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC28498u0 f57529b;

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX INFO: renamed from: a */
    public final SNSH2TextView m69180a(Context context, String str) {
        String value;
        SNSH2TextView sNSH2TextView = new SNSH2TextView(context, null, 0, 0, 14, null);
        sNSH2TextView.setText(AbstractC28462i0.m69364a(str, ((C28547d) this.f57528a).f58099a.f58163a));
        AbstractC28485q.m69381a(sNSH2TextView, new Function1() { // from class: com.sumsub.sns.core.presentation.intro.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28235a.m69178a(this.f57533b, (String) obj);
            }
        });
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSMetricElement.SCREEN_HEADER_ALIGNMENT;
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            C28960h c28960h = abstractC28962j instanceof C28960h ? (C28960h) abstractC28962j : null;
            value = c28960h != null ? c28960h.f58868a : null;
            if (value == null) {
                value = SNSThemeMetric$TextAlignment.CENTER.getValue();
            }
        } else {
            value = SNSThemeMetric$TextAlignment.CENTER.getValue();
        }
        AbstractC28234b.m69177a(sNSH2TextView, value);
        return sNSH2TextView;
    }

    /* JADX INFO: renamed from: b */
    public final SNSSubtitle2TextView m69182b(Context context, String str) {
        SNSSubtitle2TextView sNSSubtitle2TextView = new SNSSubtitle2TextView(context, null, 0, 0, 14, null);
        sNSSubtitle2TextView.setText(str != null ? AbstractC28462i0.m69364a(str, ((C28547d) this.f57528a).f58099a.f58163a) : null);
        AbstractC28485q.m69381a(sNSSubtitle2TextView, new Function1() { // from class: com.sumsub.sns.core.presentation.intro.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28235a.m69179b(this.f57534b, (String) obj);
            }
        });
        return sNSSubtitle2TextView;
    }

    public C28235a(InterfaceC30000a interfaceC30000a, InterfaceC28498u0 interfaceC28498u0) {
        this.f57528a = interfaceC30000a;
        this.f57529b = interfaceC28498u0;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m69179b(C28235a c28235a, String str) {
        InterfaceC28498u0 interfaceC28498u0 = c28235a.f57529b;
        if (interfaceC28498u0 != null) {
            ((SNSAppActivity) interfaceC28498u0).m70610a(str, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69178a(C28235a c28235a, String str) {
        InterfaceC28498u0 interfaceC28498u0 = c28235a.f57529b;
        if (interfaceC28498u0 != null) {
            ((SNSAppActivity) interfaceC28498u0).m70610a(str, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final SNSIntroItemView m69181a(Context context, String str, String str2, String str3, SNSStepState sNSStepState) {
        SNSIntroItemView sNSIntroItemView = new SNSIntroItemView(context, null, 0, 0, 14, null);
        sNSIntroItemView.setTitle(str2 != null ? AbstractC28462i0.m69364a(str2, ((C28547d) this.f57528a).f58099a.f58163a) : null);
        sNSIntroItemView.setSubtitle(str3 != null ? AbstractC28462i0.m69364a(str3, ((C28547d) this.f57528a).f58099a.f58163a) : null);
        sNSIntroItemView.setIconStart(C28468k0.f57983a.getIconHandler().onResolveIcon(context, str));
        SNSStepViewExtensionsKt.setSnsStepState(sNSIntroItemView, sNSStepState);
        return sNSIntroItemView;
    }
}
