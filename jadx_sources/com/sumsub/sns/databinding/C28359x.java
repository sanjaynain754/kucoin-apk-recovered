package com.sumsub.sns.databinding;

import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSProgressBarView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28359x implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final SNSBackgroundConstraintLayout f57815a;

    /* JADX INFO: renamed from: b */
    public final SNSSubtitle2TextView f57816b;

    /* JADX INFO: renamed from: c */
    public final SNSH1TextView f57817c;

    /* JADX INFO: renamed from: a */
    public static C28359x m69251a(View view) {
        SNSBackgroundConstraintLayout sNSBackgroundConstraintLayout = (SNSBackgroundConstraintLayout) view;
        int i11 = R$id.sns_guideline_end;
        if (((Guideline) ViewBindings.findChildViewById(view, i11)) != null) {
            i11 = R$id.sns_guideline_start;
            if (((Guideline) ViewBindings.findChildViewById(view, i11)) != null) {
                i11 = R$id.sns_progress_bar;
                if (((SNSProgressBarView) ViewBindings.findChildViewById(view, i11)) != null) {
                    i11 = R$id.sns_reviewing_content_subtitle;
                    SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(view, i11);
                    if (sNSSubtitle2TextView != null) {
                        i11 = R$id.sns_reviewing_content_title;
                        SNSH1TextView sNSH1TextView = (SNSH1TextView) ViewBindings.findChildViewById(view, i11);
                        if (sNSH1TextView != null) {
                            return new C28359x(sNSBackgroundConstraintLayout, sNSSubtitle2TextView, sNSH1TextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57815a;
    }

    public C28359x(SNSBackgroundConstraintLayout sNSBackgroundConstraintLayout, SNSSubtitle2TextView sNSSubtitle2TextView, SNSH1TextView sNSH1TextView) {
        this.f57815a = sNSBackgroundConstraintLayout;
        this.f57816b = sNSSubtitle2TextView;
        this.f57817c = sNSH1TextView;
    }
}
