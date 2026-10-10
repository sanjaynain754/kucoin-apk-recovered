package com.sumsub.sns.internal.features.presentation.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.widget.SNSBottomSheetHandleView;
import com.sumsub.sns.core.widget.SNSCommonBottomSheetView;
import com.sumsub.sns.core.widget.SNSSecondaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30810I {

    /* JADX INFO: renamed from: a */
    public final SNSCommonBottomSheetView f62240a;

    /* JADX INFO: renamed from: b */
    public final Function0 f62241b;

    /* JADX INFO: renamed from: a */
    public final void m70477a(CharSequence charSequence, CharSequence charSequence2) {
        C28955c c28955c;
        View viewInflate = this.f62240a.inflate(R$layout.sns_warning_bottom_sheet);
        int i11 = R$id.sns_handle;
        if (((SNSBottomSheetHandleView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
            i11 = R$id.sns_warning_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i11);
            if (imageView != null) {
                i11 = R$id.sns_warning_message;
                SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i11);
                if (sNSSubtitle2TextView != null) {
                    i11 = R$id.sns_warning_primary_button;
                    SNSSecondaryButton sNSSecondaryButton = (SNSSecondaryButton) ViewBindings.findChildViewById(viewInflate, i11);
                    if (sNSSecondaryButton != null) {
                        Context context = this.f62240a.getContext();
                        String imageName = SNSIconHandler.SNSCommonIcons.WARNING_OUTLINE.getImageName();
                        C28468k0 c28468k0 = C28468k0.f57983a;
                        imageView.setImageDrawable(c28468k0.getIconHandler().onResolveIcon(context, imageName));
                        SNSJsonCustomization customization = c28468k0.getCustomization();
                        Integer num = null;
                        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
                        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
                        if (c28966p != null) {
                            SNSColorElement sNSColorElement = SNSColorElement.CONTENT_CRITICAL;
                            boolean zM69346a = AbstractC28458h.m69346a(this.f62240a.getResources().getConfiguration());
                            Map map = c28966p.f58877c;
                            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
                            }
                            if (num != null) {
                                imageView.setImageTintList(ColorStateList.valueOf(num.intValue()));
                            }
                        }
                        sNSSubtitle2TextView.setText(charSequence);
                        sNSSecondaryButton.setText(charSequence2);
                        AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.common.b0
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C30810I.m70475a(this.f62249b);
                            }
                        }, sNSSecondaryButton);
                        this.f62240a.setStateCallback(new Function1() { // from class: com.sumsub.sns.internal.features.presentation.common.c0
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C30810I.m70476a(this.f62251b, ((Boolean) obj).booleanValue());
                            }
                        });
                        this.f62240a.setDismissOnTouchOutside(false);
                        this.f62240a.show();
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C30810I(SNSCommonBottomSheetView sNSCommonBottomSheetView, Function0 function0) {
        this.f62240a = sNSCommonBottomSheetView;
        this.f62241b = function0;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70475a(C30810I c30810i) {
        c30810i.f62240a.hide();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70476a(C30810I c30810i, boolean z11) {
        if (!z11) {
            c30810i.f62241b.invoke();
        }
        return Unit.INSTANCE;
    }
}
