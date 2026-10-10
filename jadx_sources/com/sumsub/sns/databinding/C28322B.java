package com.sumsub.sns.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSRotationZoomableImageView;
import com.sumsub.sns.core.widget.SNSSecondaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSToolbarView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28322B implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f57622a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f57623b;

    /* JADX INFO: renamed from: c */
    public final SNSRotationZoomableImageView f57624c;

    /* JADX INFO: renamed from: d */
    public final SNSPrimaryButton f57625d;

    /* JADX INFO: renamed from: e */
    public final SNSSecondaryButton f57626e;

    /* JADX INFO: renamed from: f */
    public final SNSToolbarView f57627f;

    /* JADX INFO: renamed from: g */
    public final ImageView f57628g;

    /* JADX INFO: renamed from: h */
    public final SNSSubtitle2TextView f57629h;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57622a;
    }

    public C28322B(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, SNSRotationZoomableImageView sNSRotationZoomableImageView, SNSPrimaryButton sNSPrimaryButton, SNSSecondaryButton sNSSecondaryButton, SNSToolbarView sNSToolbarView, ImageView imageView, SNSSubtitle2TextView sNSSubtitle2TextView) {
        this.f57622a = constraintLayout;
        this.f57623b = constraintLayout2;
        this.f57624c = sNSRotationZoomableImageView;
        this.f57625d = sNSPrimaryButton;
        this.f57626e = sNSSecondaryButton;
        this.f57627f = sNSToolbarView;
        this.f57628g = imageView;
        this.f57629h = sNSSubtitle2TextView;
    }
}
