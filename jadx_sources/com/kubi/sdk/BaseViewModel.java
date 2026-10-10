package com.kubi.sdk;

import androidx.lifecycle.ViewModel;
import io.reactivex.disposables.CompositeDisposable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.sdk.h2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BaseViewModel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014R\u0019\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "onCleared", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    public final String f46844V = getClass().getSimpleName();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final CompositeDisposable f46845W = new CompositeDisposable();

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final CompositeDisposable getF46845W() {
        return this.f46845W;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getF46844V() {
        return this.f46844V;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f46845W.clear();
    }
}
