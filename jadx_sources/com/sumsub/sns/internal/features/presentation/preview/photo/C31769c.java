package com.sumsub.sns.internal.features.presentation.preview.photo;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.R$layout;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31769c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    public List f64555a = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: b */
    public Function2 f64556b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f64555a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i11) {
        ((C31785d) viewHolder).m70876a(i11, (C31767b) this.f64555a.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
        C31785d c31785d = new C31785d(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_carousel_photo_item, viewGroup, false));
        c31785d.f64590a = this.f64556b;
        return c31785d;
    }
}
