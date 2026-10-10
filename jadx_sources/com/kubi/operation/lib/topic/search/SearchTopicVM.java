package com.kubi.operation.lib.topic.search;

import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.utils.extensions.DowngradeExKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: SearchTopicVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0094@¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0014\u0010\r\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/operation/lib/topic/search/SearchTopicVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/operation/lib/topic/search/SearchTopicIS$SearchTopicState;", "<init>", "()V", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeWS", "symbol", "", "initState", "getInitState", "()Lcom/kubi/operation/lib/topic/search/SearchTopicIS$SearchTopicState;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchTopicVM extends AbstractC19291m<SearchTopicState> {
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        if (interfaceC19282d instanceof SubscribeWS) {
            m43594o(((SubscribeWS) interfaceC19282d).getSymbol());
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public SearchTopicState getInitState() {
        return new SearchTopicState(null, 1, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m43594o(String str) {
        if (str.length() == 0) {
            return;
        }
        ExtensionKt.m32184j(this, new SearchTopicVM$subscribeWS$1(DowngradeExKt.m66551u("/market/snapshot_app:%s", new Object[]{str}, null, 2, null), this, str, null));
    }
}
