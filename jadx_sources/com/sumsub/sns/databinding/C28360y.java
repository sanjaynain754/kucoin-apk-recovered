package com.sumsub.sns.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.sumsub.sns.core.widget.SNSImageButton;
import com.sumsub.sns.core.widget.SNSRotationZoomableImageView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28360y implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f57818a;

    /* JADX INFO: renamed from: b */
    public final SNSRotationZoomableImageView f57819b;

    /* JADX INFO: renamed from: c */
    public final ViewPager2 f57820c;

    /* JADX INFO: renamed from: d */
    public final SNSImageButton f57821d;

    /* JADX INFO: renamed from: e */
    public final SNSImageButton f57822e;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57818a;
    }

    public C28360y(ConstraintLayout constraintLayout, SNSRotationZoomableImageView sNSRotationZoomableImageView, ViewPager2 viewPager2, SNSImageButton sNSImageButton, SNSImageButton sNSImageButton2) {
        this.f57818a = constraintLayout;
        this.f57819b = sNSRotationZoomableImageView;
        this.f57820c = viewPager2;
        this.f57821d = sNSImageButton;
        this.f57822e = sNSImageButton2;
    }
}
