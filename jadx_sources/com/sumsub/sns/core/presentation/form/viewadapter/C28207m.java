package com.sumsub.sns.core.presentation.form.viewadapter;

import androidx.recyclerview.widget.DiffUtil;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28845g0;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28207m extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f57488a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f57489b;

    public C28207m(List list, List list2) {
        this.f57488a = list;
        this.f57489b = list2;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i11, int i12) {
        AbstractC28841e0 abstractC28841e0 = (AbstractC28841e0) this.f57488a.get(i11);
        AbstractC28841e0 abstractC28841e1 = (AbstractC28841e0) this.f57489b.get(i12);
        return abstractC28841e0.mo69641b() != null ? Intrinsics.areEqual(AbstractC28845g0.m69657a(abstractC28841e0, null), AbstractC28845g0.m69657a(abstractC28841e1, null)) : Intrinsics.areEqual(abstractC28841e0, abstractC28841e1);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i11, int i12) {
        AbstractC28841e0 abstractC28841e0 = (AbstractC28841e0) this.f57488a.get(i11);
        AbstractC28841e0 abstractC28841e1 = (AbstractC28841e0) this.f57489b.get(i12);
        return Intrinsics.areEqual(abstractC28841e0.mo69642c().f59466a, abstractC28841e1.mo69642c().f59466a) && Intrinsics.areEqual(abstractC28841e0.mo69643d(), abstractC28841e1.mo69643d());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f57489b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f57488a.size();
    }
}
