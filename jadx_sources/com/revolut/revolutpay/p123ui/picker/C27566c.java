package com.revolut.revolutpay.p123ui.picker;

import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.revolutpay.ui_kit.delegate.C27591a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import xa0.InterfaceC46118d;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui.picker.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C27566c extends ListAdapter<InterfaceC46118d, RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final C27591a f56306i;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C27591a c27591a = this.f56306i;
        Intrinsics.checkNotNull(c27591a, "null cannot be cast to non-null type com.revolut.revolutpay.ui_kit.arch.RecyclerViewDelegate<com.revolut.revolutpay.ui_kit.model.ListItem, androidx.recyclerview.widget.RecyclerView.ViewHolder>");
        InterfaceC46118d item = getItem(i11);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(position)");
        c27591a.mo68498a(holder, item, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27566c(@NotNull C27591a rowWidgetDelegate) {
        super(C27565b.f56305a);
        Intrinsics.checkNotNullParameter(rowWidgetDelegate, "rowWidgetDelegate");
        this.f56306i = rowWidgetDelegate;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i11) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return this.f56306i.m68501f(viewGroup);
    }
}
