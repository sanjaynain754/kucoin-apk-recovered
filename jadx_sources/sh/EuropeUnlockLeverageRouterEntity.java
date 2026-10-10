package sh;

import com.kubi.futures.compliance.leverage.EuropeUnlockLeverageFillOrderEvent;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sh.e, reason: from toString */
/* JADX INFO: compiled from: EuropeUnlockLeverageRouterEntity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016JV\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\nHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0007\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016¨\u0006'"}, m90084d2 = {"Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageRouterEntity;", "", "side", "", "tradeType", "leverage", "Ljava/math/BigDecimal;", "isTPSL", "", "finishCount", "", "totalCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSide", "()Ljava/lang/String;", "getTradeType", "getLeverage", "()Ljava/math/BigDecimal;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFinishCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalCount", "toEvent", "Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageFillOrderEvent;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageRouterEntity;", "equals", "other", "hashCode", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EuropeUnlockLeverageRouterEntity {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String side;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String tradeType;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final BigDecimal leverage;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Boolean isTPSL;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final Integer finishCount;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final Integer totalCount;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EuropeUnlockLeverageRouterEntity)) {
            return false;
        }
        EuropeUnlockLeverageRouterEntity europeUnlockLeverageRouterEntity = (EuropeUnlockLeverageRouterEntity) other;
        return Intrinsics.areEqual(this.side, europeUnlockLeverageRouterEntity.side) && Intrinsics.areEqual(this.tradeType, europeUnlockLeverageRouterEntity.tradeType) && Intrinsics.areEqual(this.leverage, europeUnlockLeverageRouterEntity.leverage) && Intrinsics.areEqual(this.isTPSL, europeUnlockLeverageRouterEntity.isTPSL) && Intrinsics.areEqual(this.finishCount, europeUnlockLeverageRouterEntity.finishCount) && Intrinsics.areEqual(this.totalCount, europeUnlockLeverageRouterEntity.totalCount);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getFinishCount() {
        return this.finishCount;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final EuropeUnlockLeverageFillOrderEvent m97964c() {
        BigDecimal bigDecimal = this.leverage;
        if (bigDecimal == null) {
            bigDecimal = new BigDecimal(3);
        }
        BigDecimal bigDecimal2 = bigDecimal;
        String str = this.side;
        if (str == null) {
            str = "buy";
        }
        String str2 = str;
        OrderTradeType orderTradeType = Intrinsics.areEqual(this.tradeType, TUIConstants.TUIContact.LIMIT) ? OrderTradeType.Limit : OrderTradeType.Market;
        Boolean bool = this.isTPSL;
        return new EuropeUnlockLeverageFillOrderEvent(bigDecimal2, orderTradeType, str2, true, bool != null ? bool.booleanValue() : false);
    }

    public int hashCode() {
        String str = this.side;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tradeType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.leverage;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Boolean bool = this.isTPSL;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.finishCount;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCount;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EuropeUnlockLeverageRouterEntity(side=" + this.side + ", tradeType=" + this.tradeType + ", leverage=" + this.leverage + ", isTPSL=" + this.isTPSL + ", finishCount=" + this.finishCount + ", totalCount=" + this.totalCount + ')';
    }
}
