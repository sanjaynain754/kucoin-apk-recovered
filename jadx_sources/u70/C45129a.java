package u70;

import com.kubi.core.base.order.data.MakeOrderData$Request;
import com.kubi.utaspotlib.repo.order.data.UtaAdvancedLimit;
import com.kubi.utaspotlib.repo.order.data.UtaLimit;
import com.kubi.utaspotlib.repo.order.data.UtaLimitStop;
import com.kubi.utaspotlib.repo.order.data.UtaMarket;
import com.kubi.utaspotlib.repo.order.data.UtaMarketStop;
import com.kubi.utaspotlib.repo.order.data.UtaOrderRequest;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: u70.a */
/* JADX INFO: compiled from: MapRequestOrderEntity.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m90084d2 = {"mapRequestOrderToUtaEntity", "Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;", "req", "Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "UtaSpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45129a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final UtaOrderRequest m99755a(@NotNull MakeOrderData$Request req) {
        Intrinsics.checkNotNullParameter(req, "req");
        if (req instanceof MakeOrderData$Request.Limit) {
            UtaLimit utaLimit = new UtaLimit();
            MakeOrderData$Request.Limit limit = (MakeOrderData$Request.Limit) req;
            utaLimit.setSymbol(limit.getSymbol());
            utaLimit.setSide(limit.getSide());
            utaLimit.setPrice(limit.getPrice());
            utaLimit.setSize(limit.getSize());
            utaLimit.setFullPercent(limit.isFullPercent());
            return utaLimit;
        }
        if (req instanceof MakeOrderData$Request.Market) {
            UtaMarket utaMarket = new UtaMarket();
            MakeOrderData$Request.Market market = (MakeOrderData$Request.Market) req;
            utaMarket.setSymbol(market.getSymbol());
            utaMarket.setSide(market.getSide());
            utaMarket.setSize(market.getSize());
            utaMarket.setFunds(market.getFunds());
            utaMarket.setFullPercent(market.isFullPercent());
            return utaMarket;
        }
        if (req instanceof MakeOrderData$Request.AdvancedLimit) {
            UtaAdvancedLimit utaAdvancedLimit = new UtaAdvancedLimit();
            MakeOrderData$Request.AdvancedLimit advancedLimit = (MakeOrderData$Request.AdvancedLimit) req;
            utaAdvancedLimit.setSymbol(advancedLimit.getSymbol());
            utaAdvancedLimit.setSide(advancedLimit.getSide());
            utaAdvancedLimit.setSize(advancedLimit.getSize());
            utaAdvancedLimit.setPrice(advancedLimit.getPrice());
            utaAdvancedLimit.setPostOnly(advancedLimit.getPostOnly());
            utaAdvancedLimit.setTimeInForce(advancedLimit.getTimeInForce().getParam());
            utaAdvancedLimit.setFullPercent(advancedLimit.isFullPercent());
            return utaAdvancedLimit;
        }
        if (req instanceof MakeOrderData$Request.LimitStop) {
            UtaLimitStop utaLimitStop = new UtaLimitStop();
            MakeOrderData$Request.LimitStop limitStop = (MakeOrderData$Request.LimitStop) req;
            utaLimitStop.setSymbol(limitStop.getSymbol());
            utaLimitStop.setSide(limitStop.getSide());
            utaLimitStop.setPrice(limitStop.getPrice());
            utaLimitStop.setSize(limitStop.getSize());
            utaLimitStop.setTriggerPrice(limitStop.getTriggerPrice());
            utaLimitStop.setTriggerDirection(limitStop.getTriggerDirection().getParam());
            return utaLimitStop;
        }
        if (!(req instanceof MakeOrderData$Request.MarketStop)) {
            if (req instanceof MakeOrderData$Request.Segment) {
                throw new IllegalStateException("Segment orders must use requestScaledOrder API");
            }
            throw new NoWhenBranchMatchedException();
        }
        UtaMarketStop utaMarketStop = new UtaMarketStop();
        MakeOrderData$Request.MarketStop marketStop = (MakeOrderData$Request.MarketStop) req;
        utaMarketStop.setSymbol(marketStop.getSymbol());
        utaMarketStop.setSide(marketStop.getSide());
        utaMarketStop.setSize(marketStop.getSize());
        utaMarketStop.setFunds(marketStop.getFunds());
        utaMarketStop.setTriggerPrice(marketStop.getTriggerPrice());
        utaMarketStop.setTriggerDirection(marketStop.getTriggerDirection().getParam());
        utaMarketStop.setTriggerPriceType(marketStop.getTriggerPriceType());
        return utaMarketStop;
    }
}
