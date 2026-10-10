package com.kubi.kucoin.manager;

import com.kucoin.spot.call.auction.core.model.proto.CallAuctionLevel2Proto;
import com.spot.market.protobuf.Level2AggregationPb;
import com.spot.market.protobuf.MatchWsMsgPb;
import hr.InterfaceC38288a;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kucoin.manager.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SpotMarketPbWsApi.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&J\u001c\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&J\u001c\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&J\u001c\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&J\u001c\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/manager/ISpotMarketPbWsApi;", "", "matchPb", "Lkotlinx/coroutines/flow/Flow;", "Lcom/spot/market/protobuf/MatchWsMsgPb;", "topic", "", "candlePb", "Lcom/spot/kline/core/model/proto/CandleProtoApp;", "level2Depth50Pb", "Lcom/spot/market/protobuf/Level2AggregationPb;", "level2Depth50OneSecondPb", "callAuctionLevel2Pb", "Lcom/kucoin/spot/call/auction/core/model/proto/CallAuctionLevel2Proto;", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ISpotMarketPbWsApi {
    @Nullable
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<CallAuctionLevel2Proto> m32596a(@InterfaceC38288a @NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<Level2AggregationPb> m32597b(@InterfaceC38288a @NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<Level2AggregationPb> m32598c(@InterfaceC38288a @NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<MatchWsMsgPb> m32599d(@InterfaceC38288a @NotNull String str);
}
