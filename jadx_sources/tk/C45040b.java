package tk;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.kmm.trade.KMMRoundingMode;
import com.kubi.otc.entity.OtcAd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p599rk.C44109a;
import p599rk.C44110b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import uk.C45256a;
import uk.C45257b;

/* JADX INFO: renamed from: tk.b */
/* JADX INFO: compiled from: HedgeIsolatedCalculator.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0087\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Ltk/b;", "", "<init>", "()V", "", "isInverse", "Lrk/b;", "multiplier", "availableBalance", "estimatedPrice", "leverage", "takerFeeRate", "taxRate", "b", "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "maxQty", "orderQty", "positionQty", "maintainMarginRate", "liquidationFeeRate", "posCost", "posMargin", "", "indexPricePrecision", "minPrice", "maxPrice", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;ILrk/b;Lrk/b;)Lrk/b;", "shared_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHedgeIsolatedCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HedgeIsolatedCalculator.kt\ncom/kubi/kmm/trade/futures/hedge/HedgeIsolatedCalculator\n+ 2 NumberEx.kt\ncom/kubi/kmm/trade/utils/NumberExKt\n*L\n1#1,158:1\n18#2:159\n38#2,2:160\n55#2,2:162\n41#2:164\n30#2,4:165\n38#2,2:169\n55#2,2:171\n41#2:173\n30#2,4:174\n38#2,2:178\n55#2,2:180\n41#2:182\n52#2:183\n52#2:184\n52#2:185\n30#2,4:186\n52#2:190\n30#2,4:191\n52#2:195\n30#2,4:196\n*S KotlinDebug\n*F\n+ 1 HedgeIsolatedCalculator.kt\ncom/kubi/kmm/trade/futures/hedge/HedgeIsolatedCalculator\n*L\n47#1:159\n55#1:160,2\n55#1:162,2\n55#1:164\n55#1:165,4\n58#1:169,2\n58#1:171,2\n58#1:173\n60#1:174,4\n105#1:178,2\n105#1:180,2\n105#1:182\n107#1:183\n110#1:184\n118#1:185\n121#1:186,4\n134#1:190\n137#1:191,4\n140#1:195\n143#1:196,4\n*E\n"})
public final class C45040b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45040b f101444a = new C45040b();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final C44110b m99611a(boolean isInverse, @NotNull C44110b multiplier, @NotNull C44110b maxQty, @NotNull C44110b orderQty, @NotNull C44110b positionQty, @NotNull C44110b estimatedPrice, @NotNull C44110b leverage, @NotNull C44110b maintainMarginRate, @NotNull C44110b liquidationFeeRate, @NotNull C44110b posCost, @NotNull C44110b posMargin, @NotNull C44110b taxRate, int indexPricePrecision, @NotNull C44110b minPrice, @NotNull C44110b maxPrice) throws Throwable {
        Object obj;
        C44110b c44110bM97183c;
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(maxQty, "maxQty");
        Intrinsics.checkNotNullParameter(orderQty, "orderQty");
        Intrinsics.checkNotNullParameter(positionQty, "positionQty");
        Intrinsics.checkNotNullParameter(estimatedPrice, "estimatedPrice");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(maintainMarginRate, "maintainMarginRate");
        Intrinsics.checkNotNullParameter(liquidationFeeRate, "liquidationFeeRate");
        Intrinsics.checkNotNullParameter(posCost, "posCost");
        Intrinsics.checkNotNullParameter(posMargin, "posMargin");
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        Intrinsics.checkNotNullParameter(minPrice, "minPrice");
        Intrinsics.checkNotNullParameter(maxPrice, "maxPrice");
        try {
            Result.Companion companion = Result.INSTANCE;
            obj = null;
            try {
                if ((orderQty.m97182b(C44109a.f97401a.m97180b()) >= 0 ? orderQty : orderQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))).m97182b(maxQty) <= 0 && estimatedPrice.m97182b(new C44110b("0")) != 0 && leverage.m97182b(new C44110b("0")) != 0) {
                    C44110b c44110bM97181a = positionQty.m97181a(orderQty);
                    if (c44110bM97181a.m97182b(new C44110b("0")) == 0) {
                        return null;
                    }
                    boolean z11 = c44110bM97181a.m97182b(new C44110b("0")) >= 0;
                    C44110b c44110bM100032b = C45256a.f101797a.m100032b(z11, isInverse);
                    C44110b c44110bM100039g = C45257b.f101798a.m100039g(isInverse, multiplier, estimatedPrice, orderQty);
                    if (c44110bM100039g == null) {
                        c44110bM100039g = new C44110b("0");
                    }
                    if (c44110bM100039g.m97182b(new C44110b("0")) == 0) {
                        return null;
                    }
                    C44110b c44110bM97181a2 = posCost.m97187g(posMargin).m97181a(c44110bM100039g);
                    C44110b c44110bM97185e = c44110bM100032b.m97185e(c44110bM100039g);
                    KMMRoundingMode kMMRoundingMode = KMMRoundingMode.HALF_UP;
                    C44110b c44110bM97187g = c44110bM97181a2.m97187g(c44110bM97185e.m97183c(leverage, 20, kMMRoundingMode));
                    C44110b c44110bM97185e2 = c44110bM97181a.m97185e(multiplier).m97185e(new C44110b("1").m97187g(c44110bM100032b.m97185e(maintainMarginRate)).m97187g(c44110bM100032b.m97185e(liquidationFeeRate).m97185e(new C44110b("1").m97181a(taxRate))));
                    if (isInverse) {
                        if (c44110bM97187g.m97182b(new C44110b("0")) == 0) {
                            return null;
                        }
                        c44110bM97183c = c44110bM97185e2.m97183c(c44110bM97187g, 20, kMMRoundingMode);
                    } else {
                        if (c44110bM97185e2.m97182b(new C44110b("0")) == 0) {
                            return null;
                        }
                        c44110bM97183c = c44110bM97187g.m97183c(c44110bM97185e2, 20, kMMRoundingMode);
                    }
                    if (c44110bM97183c.m97182b(new C44110b("0")) < 0) {
                        c44110bM97183c = z11 ? minPrice : maxPrice;
                    }
                    return c44110bM97183c.m97186f(indexPricePrecision, z11 ? KMMRoundingMode.UP : KMMRoundingMode.DOWN);
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? obj : objM103844constructorimpl);
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C44110b m99612b(boolean isInverse, @NotNull C44110b multiplier, @NotNull C44110b availableBalance, @NotNull C44110b estimatedPrice, @NotNull C44110b leverage, @NotNull C44110b takerFeeRate, @NotNull C44110b taxRate) throws Throwable {
        Object objM103844constructorimpl;
        C44110b c44110bM97185e;
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        Intrinsics.checkNotNullParameter(estimatedPrice, "estimatedPrice");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44110b c44110b = new C44110b("1");
            KMMRoundingMode kMMRoundingMode = KMMRoundingMode.HALF_UP;
            C44110b c44110bM97181a = c44110b.m97183c(leverage, 10, kMMRoundingMode).m97181a(takerFeeRate.m97185e(new C44110b("1").m97181a(taxRate)));
            C44110b c44110b2 = new C44110b("1");
            if (isInverse) {
                C44110b c44110bM97185e2 = c44110b2.m97185e(multiplier);
                if (c44110bM97185e2.m97182b(C44109a.f97401a.m97180b()) < 0) {
                    c44110bM97185e2 = c44110bM97185e2.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                }
                c44110bM97185e = c44110bM97185e2.m97183c(estimatedPrice, 20, kMMRoundingMode);
            } else {
                C44110b c44110bM97185e3 = c44110b2.m97185e(multiplier);
                if (c44110bM97185e3.m97182b(C44109a.f97401a.m97180b()) < 0) {
                    c44110bM97185e3 = c44110bM97185e3.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                }
                c44110bM97185e = estimatedPrice.m97185e(c44110bM97185e3);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(availableBalance.m97183c(c44110bM97185e.m97185e(c44110bM97181a), 20, kMMRoundingMode));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (C44110b) objM103844constructorimpl;
    }
}
