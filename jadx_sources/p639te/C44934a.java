package p639te;

import com.kubi.core.spot.entity.WsRecentDealEntity;
import com.kubi.kucoin.manager.SpotMatchPushEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: te.a */
/* JADX INFO: compiled from: WsRecentDealEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"toTradeCoreWsRecentDealEntity", "Lcom/kubi/core/spot/entity/WsRecentDealEntity;", "Lcom/kubi/kucoin/manager/SpotMatchPushEntity;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44934a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final WsRecentDealEntity m99365a(@NotNull SpotMatchPushEntity spotMatchPushEntity) {
        Intrinsics.checkNotNullParameter(spotMatchPushEntity, "<this>");
        long sequence = spotMatchPushEntity.getSequence();
        String symbol = spotMatchPushEntity.getSymbol();
        String side = spotMatchPushEntity.getSide();
        Double doubleOrNull = StringsKt.toDoubleOrNull(spotMatchPushEntity.getSize());
        double dDoubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        Double doubleOrNull2 = StringsKt.toDoubleOrNull(spotMatchPushEntity.getPrice());
        return new WsRecentDealEntity(sequence, symbol, side, dDoubleValue, doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d, spotMatchPushEntity.getTakerOrderId(), spotMatchPushEntity.getTime(), spotMatchPushEntity.getType(), spotMatchPushEntity.getMakerOrderId(), spotMatchPushEntity.getTradeId());
    }
}
