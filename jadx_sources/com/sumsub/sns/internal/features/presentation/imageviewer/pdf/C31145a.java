package com.sumsub.sns.internal.features.presentation.imageviewer.pdf;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.widget.SNSRotationZoomableImageView;
import com.sumsub.sns.internal.core.presentation.util.C28971e;
import java.io.File;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.imageviewer.pdf.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31145a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    public final File f62978a;

    /* JADX INFO: renamed from: b */
    public final int f62979b;

    /* JADX INFO: renamed from: c */
    public final int f62980c = 1920;

    /* JADX INFO: renamed from: d */
    public final C28971e f62981d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f62979b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i11) {
        C31146b c31146b = (C31146b) viewHolder;
        c31146b.f62984c.m69712a((SNSRotationZoomableImageView) c31146b.itemView.findViewById(R$id.sns_photo), c31146b.f62982a, c31146b.f62983b, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
        return new C31146b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_carousel_photo_item, viewGroup, false), this.f62978a, this.f62980c, this.f62981d);
    }

    public C31145a(File file, int i11, C28971e c28971e) {
        this.f62978a = file;
        this.f62979b = i11;
        this.f62981d = c28971e;
    }
}
