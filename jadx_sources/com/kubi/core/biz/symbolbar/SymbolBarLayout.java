package com.kubi.core.biz.symbolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p757xd.C46148j;
import p757xd.InterfaceC46139a;
import p757xd.InterfaceC46140b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SymbolBarLayout.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0016\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbar/SymbolBarLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_viewHolder", "Lcom/kubi/core/biz/symbolbar/ISymbolBarViewHolder;", "viewHolder", "getViewHolder", "()Lcom/kubi/core/biz/symbolbar/ISymbolBarViewHolder;", "_uiDataBinder", "Lcom/kubi/core/biz/symbolbar/SymbolBarDataBinder;", "uiDataBinder", "getUiDataBinder", "()Lcom/kubi/core/biz/symbolbar/SymbolBarDataBinder;", "bindViewHolderBehavior", "clickListener", "Lcom/kubi/core/biz/symbolbar/ISymbolBarUIClickListener;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SymbolBarLayout extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC46140b f20880b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C46148j f20881c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SymbolBarLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SymbolBarLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final SymbolBarLayout m22751a(@NotNull InterfaceC46140b viewHolder, @NotNull InterfaceC46139a clickListener) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f20880b = viewHolder;
        this.f20881c = new C46148j(viewHolder, clickListener);
        addView(viewHolder.mo101698a());
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: getUiDataBinder, reason: from getter */
    public final C46148j getF20881c() {
        return this.f20881c;
    }

    @Nullable
    /* JADX INFO: renamed from: getViewHolder, reason: from getter */
    public final InterfaceC46140b getF20880b() {
        return this.f20880b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SymbolBarLayout(@NotNull Context context, @NotNull AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
