package com.kubi.operation.lib.cards.topic;

import androidx.lifecycle.MutableLiveData;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.utils.extensions.DowngradeExKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HotTopicCardVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/topic/HotTopicCardVM;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "coinRateLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getCoinRateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "registerWsData", "", "symbol", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HotTopicCardVM extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<String> f36721V = new MutableLiveData<>();

    @NotNull
    /* JADX INFO: renamed from: n */
    public final MutableLiveData<String> m43400n() {
        return this.f36721V;
    }

    /* JADX INFO: renamed from: o */
    public final void m43401o(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        ExtensionKt.m32184j(this, new HotTopicCardVM$registerWsData$1(DowngradeExKt.m66551u("/market/snapshot_app:%s", new Object[]{symbol}, null, 2, null), this, symbol, null));
    }
}
