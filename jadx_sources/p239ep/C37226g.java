package p239ep;

import com.kubi.kucoin.manager.SpotMatchPushEntity;
import com.kubi.margin.entity.WsRecentDealEntity;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: ep.g */
/* JADX INFO: compiled from: WsBean.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"toMarginWsRecentDealEntity", "Lcom/kubi/margin/entity/WsRecentDealEntity;", "Lcom/kubi/kucoin/manager/SpotMatchPushEntity;", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37226g {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final WsRecentDealEntity m83276a(@NotNull SpotMatchPushEntity spotMatchPushEntity) {
        Intrinsics.checkNotNullParameter(spotMatchPushEntity, "<this>");
        long sequence = spotMatchPushEntity.getSequence();
        String symbol = spotMatchPushEntity.getSymbol();
        String side = spotMatchPushEntity.getSide();
        BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(spotMatchPushEntity.getSize());
        if (bigDecimalOrNull == null) {
            bigDecimalOrNull = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = bigDecimalOrNull;
        Intrinsics.checkNotNull(bigDecimal);
        BigDecimal bigDecimalOrNull2 = StringsKt.toBigDecimalOrNull(spotMatchPushEntity.getPrice());
        if (bigDecimalOrNull2 == null) {
            bigDecimalOrNull2 = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = bigDecimalOrNull2;
        Intrinsics.checkNotNull(bigDecimal2);
        return new WsRecentDealEntity(sequence, symbol, side, bigDecimal, bigDecimal2, spotMatchPushEntity.getTakerOrderId(), spotMatchPushEntity.getTime(), spotMatchPushEntity.getType(), spotMatchPushEntity.getMakerOrderId(), spotMatchPushEntity.getTradeId());
    }
}
