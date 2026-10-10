package pe;

import com.kubi.core.spot.business.holder.AdvancedLimitOrderHolder;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import id.C38519a;
import java.math.BigDecimal;
import ne.LimitTradeInputData;
import org.jetbrains.annotations.NotNull;
import p311hf.C38190h;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: pe.d */
/* JADX INFO: compiled from: PriceProtectInterceptorRule.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\f\u001a\u00020\u0005*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u001c\u0010\u0011\u001a\u00020\u0005*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u001c\u0010\u0015\u001a\u00020\u0005*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/input/PriceProtectInterceptorRule;", "", "<init>", "()V", "isMatchOrderType", "", "data", "Lcom/kubi/core/spot/business/holder/intercept/data/LimitTradeInputData;", "isMatchSymbolTrade", "isMatchConfigEnable", "isExpirationRecordOrNull", "isHitPriceRiskRule", "isGapOverTargetHours", "", "gapHours", "", "oldTimeMillis", "isLessThanLatestPriceRate", "Ljava/math/BigDecimal;", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "rate", "isMoreThanLatestPriceRate", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPriceProtectInterceptorRule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PriceProtectInterceptorRule.kt\ncom/kubi/core/spot/business/holder/intercept/input/PriceProtectInterceptorRule\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,109:1\n84#2:110\n*S KotlinDebug\n*F\n+ 1 PriceProtectInterceptorRule.kt\ncom/kubi/core/spot/business/holder/intercept/input/PriceProtectInterceptorRule\n*L\n51#1:110\n*E\n"})
public final class C43448d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43448d f95977a = new C43448d();

    /* JADX INFO: renamed from: b */
    public final boolean m95657b(long j11, int i11, long j12) {
        return j11 - j12 > ((long) (i11 * 3600000));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95656a() {
        C38519a c38519a = C38519a.f86479a;
        if (!C46392a.m102320b(c38519a.m87133h())) {
            return true;
        }
        long jM102324f = C46392a.m102324f(c38519a.m87133h(), 0L);
        return jM102324f == 0 || m95657b(System.currentTimeMillis(), 24, jM102324f);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m95658c(@NotNull LimitTradeInputData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        BigDecimal priceProtectionRate = data.getPriceProtectionRate();
        if (C41014a.m89919D(priceProtectionRate)) {
            return false;
        }
        BigDecimal inputLimitPrice = data.getInputLimitPrice();
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(data.getParentBehavior().mo22356G().getPrice()));
        if (C41014a.m89919D(bigDecimal)) {
            return false;
        }
        return data.getIsBuy() ? m95663h(inputLimitPrice, priceProtectionRate, bigDecimal) : m95659d(inputLimitPrice, bigDecimal, priceProtectionRate);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m95660e() {
        return C38190h.f85888a.m86165j();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m95661f(@NotNull LimitTradeInputData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return (data.getOrderHolderType() instanceof AdvancedLimitOrderHolder) || !data.getOrderHolderType().getF21030c();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m95662g(@NotNull LimitTradeInputData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return !data.getParentBehavior().mo22365N().getEnableAuctionTrade().booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m95659d(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        BigDecimal bigDecimalMultiply = bigDecimal3.multiply(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimalMultiply);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        if (bigDecimal.compareTo(bigDecimalSubtract) < 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m95663h(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        BigDecimal bigDecimalMultiply = bigDecimal2.multiply(bigDecimal3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalAdd = bigDecimal3.add(bigDecimalMultiply);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        if (bigDecimal.compareTo(bigDecimalAdd) > 0) {
            return true;
        }
        return false;
    }
}
