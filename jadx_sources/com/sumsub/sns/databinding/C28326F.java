package com.sumsub.sns.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.widget.SNSBodyTextView;
import com.sumsub.sns.core.widget.SNSCardRadioButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28326F implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f57641a;

    /* JADX INFO: renamed from: b */
    public final ImageView f57642b;

    /* JADX INFO: renamed from: c */
    public final SNSCardRadioButton f57643c;

    /* JADX INFO: renamed from: d */
    public final SNSSubtitle2TextView f57644d;

    /* JADX INFO: renamed from: e */
    public final SNSBodyTextView f57645e;

    /* JADX INFO: renamed from: a */
    public static C28326F m69249a(View view) {
        int i11 = R$id.sns_flag;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.sns_image;
            if (((ShapeableImageView) ViewBindings.findChildViewById(view, i11)) != null) {
                i11 = R$id.sns_radio_button;
                SNSCardRadioButton sNSCardRadioButton = (SNSCardRadioButton) ViewBindings.findChildViewById(view, i11);
                if (sNSCardRadioButton != null) {
                    i11 = R$id.sns_subtitle;
                    SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(view, i11);
                    if (sNSSubtitle2TextView != null) {
                        i11 = R$id.sns_title;
                        SNSBodyTextView sNSBodyTextView = (SNSBodyTextView) ViewBindings.findChildViewById(view, i11);
                        if (sNSBodyTextView != null) {
                            return new C28326F((ConstraintLayout) view, imageView, sNSCardRadioButton, sNSSubtitle2TextView, sNSBodyTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57641a;
    }

    public C28326F(ConstraintLayout constraintLayout, ImageView imageView, SNSCardRadioButton sNSCardRadioButton, SNSSubtitle2TextView sNSSubtitle2TextView, SNSBodyTextView sNSBodyTextView) {
        this.f57641a = constraintLayout;
        this.f57642b = imageView;
        this.f57643c = sNSCardRadioButton;
        this.f57644d = sNSSubtitle2TextView;
        this.f57645e = sNSBodyTextView;
    }
}
