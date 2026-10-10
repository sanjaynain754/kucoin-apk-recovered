package com.sumsub.sns.internal.features.presentation.simplepicker;

import androidx.recyclerview.widget.DiffUtil;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.simplepicker.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32385f extends DiffUtil.ItemCallback {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        return Intrinsics.areEqual((C32387h) obj, (C32387h) obj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        return Intrinsics.areEqual(((C32387h) obj).f65972a, ((C32387h) obj2).f65972a);
    }
}
