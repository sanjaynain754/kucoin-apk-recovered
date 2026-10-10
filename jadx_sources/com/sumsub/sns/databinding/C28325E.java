package com.sumsub.sns.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.widget.SNSBodyTextView;
import com.sumsub.sns.core.widget.SNSCardCheckBox;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28325E implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f57637a;

    /* JADX INFO: renamed from: b */
    public final SNSCardCheckBox f57638b;

    /* JADX INFO: renamed from: c */
    public final SNSSubtitle2TextView f57639c;

    /* JADX INFO: renamed from: d */
    public final SNSBodyTextView f57640d;

    /* JADX INFO: renamed from: a */
    public static C28325E m69248a(View view) {
        int i11 = R$id.sns_checkbox;
        SNSCardCheckBox sNSCardCheckBox = (SNSCardCheckBox) ViewBindings.findChildViewById(view, i11);
        if (sNSCardCheckBox != null) {
            i11 = R$id.sns_flag;
            if (((ImageView) ViewBindings.findChildViewById(view, i11)) != null) {
                i11 = R$id.sns_subtitle;
                SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(view, i11);
                if (sNSSubtitle2TextView != null) {
                    i11 = R$id.sns_title;
                    SNSBodyTextView sNSBodyTextView = (SNSBodyTextView) ViewBindings.findChildViewById(view, i11);
                    if (sNSBodyTextView != null) {
                        return new C28325E((ConstraintLayout) view, sNSCardCheckBox, sNSSubtitle2TextView, sNSBodyTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57637a;
    }

    public C28325E(ConstraintLayout constraintLayout, SNSCardCheckBox sNSCardCheckBox, SNSSubtitle2TextView sNSSubtitle2TextView, SNSBodyTextView sNSBodyTextView) {
        this.f57637a = constraintLayout;
        this.f57638b = sNSCardCheckBox;
        this.f57639c = sNSSubtitle2TextView;
        this.f57640d = sNSBodyTextView;
    }
}
