package com.revolut.revolutpay.p123ui.picker;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.DiffUtil;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import xa0.InterfaceC46118d;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui.picker.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C27565b extends DiffUtil.ItemCallback<InterfaceC46118d> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27565b f56305a = new C27565b();

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    @SuppressLint({"DiffUtilEquals"})
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull InterfaceC46118d oldItem, @NotNull InterfaceC46118d newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull InterfaceC46118d oldItem, @NotNull InterfaceC46118d newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.mo68503a(), newItem.mo68503a());
    }
}
