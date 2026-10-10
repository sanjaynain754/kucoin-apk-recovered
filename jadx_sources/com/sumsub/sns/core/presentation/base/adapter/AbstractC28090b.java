package com.sumsub.sns.core.presentation.base.adapter;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.adapter.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28090b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    public final ArrayList f57292a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public DiffUtil.Callback mo69071a(ArrayList arrayList, List list) {
        return new C28089a(arrayList, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f57292a.size();
    }
}
