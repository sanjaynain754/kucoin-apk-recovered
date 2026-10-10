package de;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p764xk.InterfaceC46259g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: de.a */
/* JADX INFO: compiled from: WsTopicReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096\u0002¨\u0006\t"}, m90084d2 = {"Lcom/kubi/core/receiver/WsTopicReceiver;", "Lcom/kubi/kucoin/callback/IWebSocketTopicReceiver;", "<init>", "()V", "invoke", "", "topicList", "", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36663a implements InterfaceC46259g {
    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m82030a((List) obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void m82030a(@NotNull List<String> topicList) {
        Intrinsics.checkNotNullParameter(topicList, "topicList");
        topicList.addAll(CollectionsKt.mutableListOf("/margin-fund/nav:%s", "/spotMarket/tradeOrders", "/spotMarket/advancedOrders", "/spotCallAuction/orderChanges", "/notice/center", "/margin/position", "/margin/isolatedPosition:%s", "/account/balance", "/account/transferBalance"));
    }
}
