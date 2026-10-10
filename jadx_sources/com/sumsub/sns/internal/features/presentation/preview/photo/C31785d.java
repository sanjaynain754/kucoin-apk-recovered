package com.sumsub.sns.internal.features.presentation.preview.photo;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.widget.SNSRotationZoomableImageView;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31785d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a */
    public Function2 f64590a;

    /* JADX INFO: renamed from: a */
    public final void m70876a(final int i11, final C31767b c31767b) {
        View view = this.itemView;
        int i12 = R$id.sns_photo;
        SNSRotationZoomableImageView sNSRotationZoomableImageView = (SNSRotationZoomableImageView) view.findViewById(i12);
        if (sNSRotationZoomableImageView != null) {
            sNSRotationZoomableImageView.setImageBitmapWithRotation(c31767b.f64550a, c31767b.f64552c);
        }
        SNSRotationZoomableImageView sNSRotationZoomableImageView2 = (SNSRotationZoomableImageView) this.itemView.findViewById(i12);
        if (sNSRotationZoomableImageView2 != null) {
            sNSRotationZoomableImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31785d.m70875a(this.f64591b, i11, c31767b, view2);
                }
            });
        }
    }

    public C31785d(View view) {
        super(view);
    }

    /* JADX INFO: renamed from: a */
    public static final void m70875a(C31785d c31785d, int i11, C31767b c31767b, View view) {
        Function2 function2 = c31785d.f64590a;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i11), c31767b);
        }
    }
}
