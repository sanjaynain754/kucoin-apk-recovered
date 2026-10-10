package com.sumsub.sns.internal.features.presentation.country.picker;

import androidx.recyclerview.widget.DiffUtil;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30885a extends DiffUtil.ItemCallback {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        return Intrinsics.areEqual((C30877b) obj, (C30877b) obj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        return Intrinsics.areEqual(((C30877b) obj).f62373a, ((C30877b) obj2).f62373a);
    }
}
