package com.kubi.sdk;

import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import k10.InterfaceC40863a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.p2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BasePageFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J$\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010\u0016\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0016J$\u0010\u0016\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/sdk/InitLoadView;", "Lcom/kubi/sdk/widget/loading/ILoadingView;", "loadingView", "<init>", "(Lcom/kubi/sdk/widget/loading/ILoadingView;)V", "count", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCount", "()Ljava/util/concurrent/atomic/AtomicInteger;", "getStatus", "", "showLoading", "", "gravity", "color", "showContent", "showEmpty", "res1", "res2", "onClickListener", "Landroid/view/View$OnClickListener;", "", "showError", "res", "errorClick", "tips", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class InitLoadView implements InterfaceC40863a {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC40863a f47190b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AtomicInteger f47191c;

    @Override // k10.InterfaceC40863a
    public void showEmpty(int res1, int res2, @Nullable View.OnClickListener onClickListener) {
        this.f47190b.showEmpty(res1, res2, onClickListener);
    }

    public InitLoadView(@NotNull InterfaceC40863a loadingView) {
        Intrinsics.checkNotNullParameter(loadingView, "loadingView");
        this.f47190b = loadingView;
        this.f47191c = new AtomicInteger();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AtomicInteger getF47191c() {
        return this.f47191c;
    }

    @Override // k10.InterfaceC40863a
    public void showContent() {
        this.f47190b.showContent();
    }

    @Override // k10.InterfaceC40863a
    public void showEmpty(@Nullable CharSequence res1, int res2, @Nullable View.OnClickListener onClickListener) {
        this.f47190b.showEmpty(res1, res2, onClickListener);
    }

    @Override // k10.InterfaceC40863a
    public void showError(int res, @Nullable View.OnClickListener errorClick) {
        this.f47190b.showError(res, errorClick);
    }

    @Override // k10.InterfaceC40863a
    public void showLoading() {
        if (this.f47191c.incrementAndGet() == 1) {
            this.f47190b.showLoading();
        }
    }
}
