package com.kubi.margin.trade.dialog;

import android.view.View;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.margin.trade.dialog.q, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CurrencyContentLayoutStatusWrapper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CurrencyContentLayoutStatusWrapper;", "", "loadingView", "Landroid/view/View;", "errorView", "contentView", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "showLoading", "", "showContent", "showError", "errorClick", "Landroid/view/View$OnClickListener;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CurrencyContentLayoutStatusWrapper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final View f33836a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final View f33837b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final View f33838c;

    public CurrencyContentLayoutStatusWrapper(@NotNull View loadingView, @NotNull View errorView, @NotNull View contentView) {
        Intrinsics.checkNotNullParameter(loadingView, "loadingView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.f33836a = loadingView;
        this.f33837b = errorView;
        this.f33838c = contentView;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m40274c(View.OnClickListener onClickListener, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (onClickListener != null) {
            onClickListener.onClick(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m40275b() {
        this.f33836a.setVisibility(8);
        this.f33837b.setVisibility(8);
        this.f33838c.setVisibility(0);
    }

    /* JADX INFO: renamed from: d */
    public final void m40276d() {
        this.f33836a.setVisibility(0);
        this.f33837b.setVisibility(8);
        this.f33838c.setVisibility(8);
    }

    public final void showError(@Nullable final View.OnClickListener errorClick) {
        this.f33836a.setVisibility(8);
        this.f33837b.setVisibility(0);
        this.f33838c.setVisibility(8);
        ViewExtKt.m66575f(this.f33837b, new Function1() { // from class: com.kubi.margin.trade.dialog.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CurrencyContentLayoutStatusWrapper.m40274c(errorClick, (View) obj);
            }
        });
    }
}
