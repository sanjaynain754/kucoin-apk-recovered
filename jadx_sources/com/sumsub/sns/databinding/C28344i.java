package com.sumsub.sns.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.widget.SNSBackgroundView;
import com.sumsub.sns.core.widget.SNSCaptionTextView;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSLivenessFaceView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSToolbarView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28344i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final SNSBackgroundView f57733a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f57734b;

    /* JADX INFO: renamed from: c */
    public final PreviewView f57735c;

    /* JADX INFO: renamed from: d */
    public final SNSImageView f57736d;

    /* JADX INFO: renamed from: e */
    public final SNSBackgroundView f57737e;

    /* JADX INFO: renamed from: f */
    public final ConstraintLayout f57738f;

    /* JADX INFO: renamed from: g */
    public final TextView f57739g;

    /* JADX INFO: renamed from: h */
    public final SNSLivenessFaceView f57740h;

    /* JADX INFO: renamed from: i */
    public final SNSH2TextView f57741i;

    /* JADX INFO: renamed from: j */
    public final SNSImageView f57742j;

    /* JADX INFO: renamed from: k */
    public final SNSSubtitle2TextView f57743k;

    /* JADX INFO: renamed from: l */
    public final SNSH2TextView f57744l;

    /* JADX INFO: renamed from: m */
    public final C28321A f57745m;

    /* JADX INFO: renamed from: n */
    public final SNSPrimaryButton f57746n;

    /* JADX INFO: renamed from: a */
    public static C28344i m69250a(View view) {
        View viewFindChildViewById;
        int i11 = R$id.sns_camera;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.sns_camera_preview;
            PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(view, i11);
            if (previewView != null) {
                i11 = R$id.sns_complete_icon;
                SNSImageView sNSImageView = (SNSImageView) ViewBindings.findChildViewById(view, i11);
                if (sNSImageView != null) {
                    i11 = R$id.sns_container;
                    SNSBackgroundView sNSBackgroundView = (SNSBackgroundView) ViewBindings.findChildViewById(view, i11);
                    if (sNSBackgroundView != null) {
                        i11 = R$id.sns_content;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout != null) {
                            i11 = R$id.sns_debug;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView != null) {
                                i11 = R$id.sns_face_view;
                                SNSLivenessFaceView sNSLivenessFaceView = (SNSLivenessFaceView) ViewBindings.findChildViewById(view, i11);
                                if (sNSLivenessFaceView != null) {
                                    i11 = R$id.sns_hint;
                                    SNSH2TextView sNSH2TextView = (SNSH2TextView) ViewBindings.findChildViewById(view, i11);
                                    if (sNSH2TextView != null) {
                                        i11 = R$id.sns_icon;
                                        SNSImageView sNSImageView2 = (SNSImageView) ViewBindings.findChildViewById(view, i11);
                                        if (sNSImageView2 != null) {
                                            i11 = R$id.sns_liveness_status_container;
                                            if (((LinearLayout) ViewBindings.findChildViewById(view, i11)) != null) {
                                                i11 = R$id.sns_liveness_status_subtitle;
                                                SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(view, i11);
                                                if (sNSSubtitle2TextView != null) {
                                                    i11 = R$id.sns_liveness_status_subtitle_scroll;
                                                    if (((ScrollView) ViewBindings.findChildViewById(view, i11)) != null) {
                                                        i11 = R$id.sns_liveness_status_title;
                                                        SNSH2TextView sNSH2TextView2 = (SNSH2TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (sNSH2TextView2 != null) {
                                                            i11 = R$id.sns_overlay;
                                                            if (((ConstraintLayout) ViewBindings.findChildViewById(view, i11)) != null) {
                                                                i11 = R$id.sns_placeholder;
                                                                if (ViewBindings.findChildViewById(view, i11) != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.sns_powered))) != null) {
                                                                    SNSCaptionTextView sNSCaptionTextView = (SNSCaptionTextView) viewFindChildViewById;
                                                                    C28321A c28321a = new C28321A(sNSCaptionTextView, sNSCaptionTextView);
                                                                    int i12 = R$id.sns_primary_button;
                                                                    SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(view, i12);
                                                                    if (sNSPrimaryButton != null) {
                                                                        i12 = R$id.sns_toolbar;
                                                                        if (((SNSToolbarView) ViewBindings.findChildViewById(view, i12)) != null) {
                                                                            return new C28344i((SNSBackgroundView) view, frameLayout, previewView, sNSImageView, sNSBackgroundView, constraintLayout, textView, sNSLivenessFaceView, sNSH2TextView, sNSImageView2, sNSSubtitle2TextView, sNSH2TextView2, c28321a, sNSPrimaryButton);
                                                                        }
                                                                    }
                                                                    i11 = i12;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57733a;
    }

    public C28344i(SNSBackgroundView sNSBackgroundView, FrameLayout frameLayout, PreviewView previewView, SNSImageView sNSImageView, SNSBackgroundView sNSBackgroundView2, ConstraintLayout constraintLayout, TextView textView, SNSLivenessFaceView sNSLivenessFaceView, SNSH2TextView sNSH2TextView, SNSImageView sNSImageView2, SNSSubtitle2TextView sNSSubtitle2TextView, SNSH2TextView sNSH2TextView2, C28321A c28321a, SNSPrimaryButton sNSPrimaryButton) {
        this.f57733a = sNSBackgroundView;
        this.f57734b = frameLayout;
        this.f57735c = previewView;
        this.f57736d = sNSImageView;
        this.f57737e = sNSBackgroundView2;
        this.f57738f = constraintLayout;
        this.f57739g = textView;
        this.f57740h = sNSLivenessFaceView;
        this.f57741i = sNSH2TextView;
        this.f57742j = sNSImageView2;
        this.f57743k = sNSSubtitle2TextView;
        this.f57744l = sNSH2TextView2;
        this.f57745m = c28321a;
        this.f57746n = sNSPrimaryButton;
    }
}
