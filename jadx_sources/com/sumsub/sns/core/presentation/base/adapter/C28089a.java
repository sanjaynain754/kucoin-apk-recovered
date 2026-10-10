package com.sumsub.sns.core.presentation.base.adapter;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.adapter.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28089a extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a */
    public final List f57290a;

    /* JADX INFO: renamed from: b */
    public final List f57291b;

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i11, int i12) {
        return Intrinsics.areEqual(this.f57290a.get(i11), this.f57291b.get(i12));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i11, int i12) {
        return Intrinsics.areEqual(this.f57290a.get(i11), this.f57291b.get(i12));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f57291b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f57290a.size();
    }

    public C28089a(List list, List list2) {
        this.f57290a = list;
        this.f57291b = list2;
    }
}
