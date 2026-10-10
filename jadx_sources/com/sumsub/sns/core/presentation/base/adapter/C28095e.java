package com.sumsub.sns.core.presentation.base.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.adapter.holders.C28096a;
import com.sumsub.sns.core.presentation.base.adapter.holders.C28097b;
import com.sumsub.sns.core.presentation.base.adapter.holders.C28098c;
import com.sumsub.sns.core.presentation.base.adapter.holders.C28100e;
import com.sumsub.sns.core.presentation.base.adapter.holders.C28101f;
import com.sumsub.sns.core.presentation.base.adapter.holders.C28102g;
import com.sumsub.sns.internal.core.presentation.base.adapter.AbstractC28712a;
import com.sumsub.sns.internal.features.presentation.status.C32418d;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.adapter.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28095e extends AbstractC28090b {

    /* JADX INFO: renamed from: b */
    public final C32418d f57297b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
        switch (i11) {
            case 1:
                int i12 = C28096a.f57298g;
                return new C28096a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_layout_status_document_item, viewGroup, false));
            case 2:
                int i13 = C28100e.f57302g;
                return new C28100e(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_layout_moderator_comment_item, viewGroup, false), new C28092d(this.f57297b));
            case 3:
                int i14 = C28098c.f57300g;
                return new C28098c(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_layout_status_image_item, viewGroup, false));
            case 4:
                int i15 = C28102g.f57307g;
                return new C28102g(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_layout_status_title_item, viewGroup, false));
            case 5:
                int i16 = C28101f.f57306g;
                return new C28101f(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_layout_status_text_item, viewGroup, false));
            case 6:
                int i17 = C28097b.f57299g;
                return new C28097b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_layout_status_documents_moderator_comment_item, viewGroup, false));
            default:
                throw new IllegalStateException("Cannot create view holder for SNSDocumentListAdapter");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        return ((AbstractC28712a) this.f57292a.get(i11)).f58392a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i11) {
        ((AbstractC28091c) viewHolder).mo69072a((AbstractC28712a) this.f57292a.get(i11), this.f57292a.size());
    }

    public C28095e(C32418d c32418d) {
        this.f57297b = c32418d;
    }
}
