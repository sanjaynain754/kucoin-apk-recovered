package com.sumsub.sns.internal.features.presentation.imageviewer.pdf;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.widget.SNSRotationZoomableImageView;
import com.sumsub.sns.internal.core.presentation.util.C28971e;
import java.io.File;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.imageviewer.pdf.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31146b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a */
    public final File f62982a;

    /* JADX INFO: renamed from: b */
    public final int f62983b;

    /* JADX INFO: renamed from: c */
    public final C28971e f62984c;

    public C31146b(View view, File file, int i11, C28971e c28971e) {
        super(view);
        this.f62982a = file;
        this.f62983b = i11;
        this.f62984c = c28971e;
        SNSRotationZoomableImageView sNSRotationZoomableImageView = (SNSRotationZoomableImageView) this.itemView.findViewById(R$id.sns_photo);
        if (sNSRotationZoomableImageView != null) {
            sNSRotationZoomableImageView.setZoomEnabled(true);
        }
    }
}
