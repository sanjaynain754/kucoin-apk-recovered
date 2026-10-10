package com.sumsub.sns.internal.features.presentation.status;

import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.widget.SNSCaptionTextView;
import com.sumsub.sns.core.widget.SNSCommonBottomSheetView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32412a {

    /* JADX INFO: renamed from: a */
    public final SNSCommonBottomSheetView f66075a;

    /* JADX INFO: renamed from: b */
    public final Function0 f66076b;

    /* JADX INFO: renamed from: c */
    public final Function1 f66077c;

    /* JADX INFO: renamed from: d */
    public final C28367f f66078d = new C28367f(Screen.StatusScreen, "Status");

    /* JADX INFO: renamed from: a */
    public final void m71129a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z11) {
        C28955c c28955c;
        View viewInflate = this.f66075a.inflate(R$layout.sns_agreement_bottom_sheet);
        int i11 = R$id.sns_agreement_button;
        SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
        if (sNSPrimaryButton != null) {
            i11 = R$id.sns_agreement_handle;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                i11 = R$id.sns_agreement_powered;
                SNSCaptionTextView sNSCaptionTextView = (SNSCaptionTextView) ViewBindings.findChildViewById(viewInflate, i11);
                if (sNSCaptionTextView != null) {
                    i11 = R$id.sns_agreement_scroll;
                    if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                        i11 = R$id.sns_agreement_text;
                        SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                        if (sNSSubtitle2TextView != null) {
                            sNSSubtitle2TextView.setText(charSequence);
                            AbstractC28485q.m69381a(sNSSubtitle2TextView, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.status.c0
                                @Override // p852kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C32412a.m71127a(this.f66083b, (String) obj);
                                }
                            });
                            sNSPrimaryButton.setText(charSequence2);
                            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.status.d0
                                @Override // p852kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C32412a.m71126a(this.f66085b);
                                }
                            }, sNSPrimaryButton);
                            sNSCaptionTextView.setText(charSequence3);
                            sNSCaptionTextView.setVisibility(z11 ? 8 : 0);
                            SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
                            Integer num = null;
                            SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
                            C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
                            if (c28966p != null) {
                                SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
                                boolean zM69346a = AbstractC28458h.m69346a(sNSCaptionTextView.getResources().getConfiguration());
                                Map map = c28966p.f58877c;
                                if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                                    num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
                                }
                                if (num != null) {
                                    sNSCaptionTextView.setTextColor(num.intValue());
                                }
                            }
                            this.f66075a.setStateCallback(new Function1() { // from class: com.sumsub.sns.internal.features.presentation.status.e0
                                @Override // p852kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C32412a.m71128a(this.f66088b, ((Boolean) obj).booleanValue());
                                }
                            });
                            this.f66075a.setDismissOnTouchOutside(true);
                            this.f66075a.show();
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C32412a(SNSCommonBottomSheetView sNSCommonBottomSheetView, Function0 function0, Function1 function1) {
        this.f66075a = sNSCommonBottomSheetView;
        this.f66076b = function0;
        this.f66077c = function1;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71127a(C32412a c32412a, String str) {
        c32412a.f66077c.invoke(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71126a(C32412a c32412a) {
        C28367f.m69256a(c32412a.f66078d, Control.AcceptButton, (Map) null, Popup.AgreementsPopup, 2);
        c32412a.f66075a.hide();
        c32412a.f66076b.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71128a(C32412a c32412a, boolean z11) {
        if (z11) {
            C28367f c28367f = c32412a.f66078d;
            C28367f.m69261b(c28367f.f57840a, c28367f.f57841b, c28367f.f57842c, Popup.AgreementsPopup);
        } else {
            C28367f c28367f2 = c32412a.f66078d;
            C28367f.m69254a(c28367f2.f57840a, c28367f2.f57841b, c28367f2.f57842c, Popup.AgreementsPopup);
        }
        return Unit.INSTANCE;
    }
}
