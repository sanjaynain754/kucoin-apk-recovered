package uk;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: renamed from: uk.b */
/* JADX INFO: compiled from: IsolatedCalculator.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012JW\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016Jy\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\"\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J-\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b%\u0010&JG\u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J/\u00100\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006¢\u0006\u0004\b0\u00101¨\u00062"}, m90084d2 = {"Luk/b;", "", "<init>", "()V", "", "isInverse", "Lrk/b;", "multiplier", "isOrderBuy", "availableBalance", "maxClosePositionSize", "positionQty", "percent", "estimatedPrice", "leverage", "takerFeeRate", "taxRate", "c", "(ZLrk/b;ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "isBuy", "orderQty", "d", "(ZLrk/b;ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "maxOrderQty", "positionLiqPrice", "maintainMarginRate", "liquidationFeeRate", "posCost", "posMargin", "b", "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "markPrice", "aggRate", "positionTotalMargin", "f", "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "markValue", "e", "(Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "isLimit", "inputDelegationPrice", "bestBid", "bestAsk", "spread", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ZZZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", FirebaseAnalytics.Param.PRICE, "qty", "g", "(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;", "shared_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIsolatedCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedCalculator.kt\ncom/kubi/kmm/trade/futures/isolated/IsolatedCalculator\n+ 2 NumberEx.kt\ncom/kubi/kmm/trade/utils/NumberExKt\n*L\n1#1,456:1\n30#2,4:457\n52#2:461\n38#2,2:462\n55#2,2:464\n41#2:466\n18#2:467\n38#2,2:468\n55#2,2:470\n41#2:472\n30#2,4:473\n38#2,2:477\n55#2,2:479\n41#2:481\n38#2,2:482\n55#2,2:484\n41#2:486\n52#2:487\n52#2:488\n52#2:489\n38#2,2:490\n55#2,2:492\n41#2:494\n38#2,2:495\n55#2,2:497\n41#2:499\n38#2,2:500\n55#2,2:502\n41#2:504\n38#2,2:505\n55#2,2:507\n41#2:509\n18#2:510\n30#2,4:511\n30#2,4:515\n52#2:519\n30#2,4:520\n30#2,4:524\n30#2,4:528\n30#2,4:532\n33#2:536\n38#2,2:537\n55#2,2:539\n41#2:541\n30#2,4:542\n52#2:546\n46#2:547\n49#2:548\n30#2,4:549\n*S KotlinDebug\n*F\n+ 1 IsolatedCalculator.kt\ncom/kubi/kmm/trade/futures/isolated/IsolatedCalculator\n*L\n72#1:457,4\n77#1:461\n78#1:462,2\n78#1:464,2\n78#1:466\n128#1:467\n135#1:468,2\n135#1:470,2\n135#1:472\n135#1:473,4\n138#1:477,2\n138#1:479,2\n138#1:481\n212#1:482,2\n212#1:484,2\n212#1:486\n220#1:487\n222#1:488\n224#1:489\n226#1:490,2\n226#1:492,2\n226#1:494\n226#1:495,2\n226#1:497,2\n226#1:499\n230#1:500,2\n230#1:502,2\n230#1:504\n230#1:505,2\n230#1:507,2\n230#1:509\n240#1:510\n242#1:511,4\n244#1:515,4\n249#1:519\n261#1:520,4\n274#1:524,4\n277#1:528,4\n316#1:532,4\n321#1:536\n348#1:537,2\n348#1:539,2\n348#1:541\n348#1:542,4\n378#1:546\n392#1:547\n417#1:548\n449#1:549,4\n*E\n"})
public final class C45257b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45257b f101798a = new C45257b();

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C44110b m100034b(boolean isInverse, @NotNull C44110b multiplier, @NotNull C44110b maxOrderQty, @NotNull C44110b orderQty, @NotNull C44110b positionQty, @Nullable C44110b positionLiqPrice, @NotNull C44110b estimatedPrice, @NotNull C44110b leverage, @NotNull C44110b maintainMarginRate, @NotNull C44110b liquidationFeeRate, @NotNull C44110b posCost, @NotNull C44110b posMargin, @NotNull C44110b taxRate) throws Throwable {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(maxOrderQty, "maxOrderQty");
        Intrinsics.checkNotNullParameter(orderQty, "orderQty");
        Intrinsics.checkNotNullParameter(positionQty, "positionQty");
        Intrinsics.checkNotNullParameter(estimatedPrice, "estimatedPrice");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(maintainMarginRate, "maintainMarginRate");
        Intrinsics.checkNotNullParameter(liquidationFeeRate, "liquidationFeeRate");
        Intrinsics.checkNotNullParameter(posCost, "posCost");
        Intrinsics.checkNotNullParameter(posMargin, "posMargin");
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        C44109a c44109a = C44109a.f97401a;
        if ((orderQty.m97182b(c44109a.m97180b()) >= 0 ? orderQty : orderQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))).m97182b(maxOrderQty) > 0) {
            return null;
        }
        boolean z11 = positionQty.m97182b(new C44110b("0")) >= 0;
        boolean z12 = orderQty.m97182b(new C44110b("0")) >= 0;
        C44110b c44110bM100032b = C45256a.f101797a.m100032b(positionQty.m97181a(orderQty).m97182b(new C44110b("0")) >= 0, isInverse);
        if (orderQty.m97182b(new C44110b("0")) == 0 || estimatedPrice.m97182b(new C44110b("0")) == 0 || orderQty.m97181a(positionQty).m97182b(new C44110b("0")) == 0) {
            return null;
        }
        if ((orderQty.m97182b(c44109a.m97180b()) >= 0 ? orderQty : orderQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))).m97182b(positionQty.m97182b(c44109a.m97180b()) >= 0 ? positionQty : positionQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))) < 0 && positionQty.m97182b(new C44110b("0")) != 0 && z11 != z12) {
            return positionLiqPrice;
        }
        if ((orderQty.m97182b(c44109a.m97180b()) >= 0 ? orderQty : orderQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))).m97182b(positionQty.m97182b(c44109a.m97180b()) >= 0 ? positionQty : positionQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))) > 0 && positionQty.m97182b(new C44110b("0")) != 0 && z11 != z12) {
            try {
                Result.Companion companion = Result.INSTANCE;
                C44110b c44110bM97187g = new C44110b("1").m97187g(c44110bM100032b.m97185e(maintainMarginRate)).m97187g(c44110bM100032b.m97185e(liquidationFeeRate).m97185e(new C44110b("1").m97181a(taxRate)));
                C44110b c44110b = new C44110b("1");
                C44110b c44110b2 = new C44110b("1");
                KMMRoundingMode kMMRoundingMode = KMMRoundingMode.HALF_UP;
                C44110b c44110bM97187g2 = c44110b.m97187g(c44110bM100032b.m97185e(c44110b2.m97183c(leverage, 10, kMMRoundingMode)));
                objM103844constructorimpl2 = Result.m103844constructorimpl((isInverse ? c44110bM97187g.m97183c(c44110bM97187g2, 20, kMMRoundingMode) : c44110bM97187g2.m97183c(c44110bM97187g, 20, kMMRoundingMode)).m97185e(estimatedPrice));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl2) ? null : objM103844constructorimpl2);
        }
        if (z11 != z12 && positionQty.m97182b(new C44110b("0")) != 0) {
            return null;
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            C44110b c44110bM100039g = f101798a.m100039g(isInverse, multiplier, estimatedPrice, orderQty);
            if (c44110bM100039g == null) {
                c44110bM100039g = new C44110b("0");
            }
            C44110b c44110bM97181a = posCost.m97187g(posMargin).m97181a(c44110bM100039g);
            C44110b c44110bM97185e = c44110bM100032b.m97185e(c44110bM100039g);
            KMMRoundingMode kMMRoundingMode2 = KMMRoundingMode.HALF_UP;
            C44110b c44110bM97187g3 = c44110bM97181a.m97187g(c44110bM97185e.m97183c(leverage, 20, kMMRoundingMode2));
            C44110b c44110bM97185e2 = positionQty.m97181a(orderQty).m97185e(multiplier);
            C44110b c44110bM97187g4 = new C44110b("1").m97187g(c44110bM100032b.m97185e(maintainMarginRate)).m97187g(c44110bM100032b.m97185e(liquidationFeeRate).m97185e(new C44110b("1").m97181a(taxRate)));
            objM103844constructorimpl = Result.m103844constructorimpl(isInverse ? c44110bM97185e2.m97185e(c44110bM97187g4).m97183c(c44110bM97187g3, 20, kMMRoundingMode2) : c44110bM97187g3.m97183c(c44110bM97185e2.m97185e(c44110bM97187g4), 20, kMMRoundingMode2));
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final C44110b m100035c(boolean isInverse, @NotNull C44110b multiplier, boolean isOrderBuy, @NotNull C44110b availableBalance, @NotNull C44110b maxClosePositionSize, @NotNull C44110b positionQty, @NotNull C44110b percent, @NotNull C44110b estimatedPrice, @NotNull C44110b leverage, @NotNull C44110b takerFeeRate, @NotNull C44110b taxRate) throws Throwable {
        Object objM103844constructorimpl;
        C44110b maxClosePositionSize2 = maxClosePositionSize;
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        Intrinsics.checkNotNullParameter(maxClosePositionSize2, "maxClosePositionSize");
        Intrinsics.checkNotNullParameter(positionQty, "positionQty");
        Intrinsics.checkNotNullParameter(percent, "percent");
        Intrinsics.checkNotNullParameter(estimatedPrice, "estimatedPrice");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44110b c44110bM100036d = f101798a.m100036d(isInverse, multiplier, isOrderBuy, estimatedPrice, leverage, new C44110b("1"), new C44110b("0"), takerFeeRate, taxRate);
            if (c44110bM100036d == null) {
                c44110bM100036d = new C44110b("0");
            }
            C44110b c44110bM97183c = availableBalance.m97183c(c44110bM100036d, 20, KMMRoundingMode.HALF_UP);
            if (positionQty.m97182b(new C44110b("0")) != 0) {
                if ((positionQty.m97182b(new C44110b("0")) > 0) != isOrderBuy) {
                    if (maxClosePositionSize2.m97182b(C44109a.f97401a.m97180b()) < 0) {
                        maxClosePositionSize2 = maxClosePositionSize2.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                    }
                    c44110bM97183c = c44110bM97183c.m97181a(maxClosePositionSize2);
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(c44110bM97183c.m97185e(percent));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (C44110b) objM103844constructorimpl;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final C44110b m100036d(boolean isInverse, @NotNull C44110b multiplier, boolean isBuy, @NotNull C44110b estimatedPrice, @NotNull C44110b leverage, @NotNull C44110b orderQty, @NotNull C44110b positionQty, @NotNull C44110b takerFeeRate, @NotNull C44110b taxRate) throws Throwable {
        Object objM103844constructorimpl;
        C44110b c44110bM97185e;
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(estimatedPrice, "estimatedPrice");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(orderQty, "orderQty");
        Intrinsics.checkNotNullParameter(positionQty, "positionQty");
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        try {
            Result.Companion companion = Result.INSTANCE;
            C45256a c45256a = C45256a.f101797a;
            if (!isBuy) {
                orderQty = orderQty.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            C44110b c44110bM100031a = c45256a.m100031a(orderQty, positionQty);
            C44110b c44110b = new C44110b("1");
            KMMRoundingMode kMMRoundingMode = KMMRoundingMode.HALF_UP;
            C44110b c44110bM97181a = c44110b.m97183c(leverage, 10, kMMRoundingMode).m97181a(takerFeeRate.m97185e(new C44110b("1").m97181a(taxRate)));
            if (isInverse) {
                C44110b c44110bM97185e2 = c44110bM100031a.m97185e(multiplier);
                if (c44110bM97185e2.m97182b(C44109a.f97401a.m97180b()) < 0) {
                    c44110bM97185e2 = c44110bM97185e2.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                }
                c44110bM97185e = c44110bM97185e2.m97183c(estimatedPrice, 20, kMMRoundingMode);
            } else {
                C44110b c44110bM97185e3 = c44110bM100031a.m97185e(multiplier);
                if (c44110bM97185e3.m97182b(C44109a.f97401a.m97180b()) < 0) {
                    c44110bM97185e3 = c44110bM97185e3.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                }
                c44110bM97185e = estimatedPrice.m97185e(c44110bM97185e3);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(c44110bM97185e.m97185e(c44110bM97181a));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (C44110b) objM103844constructorimpl;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0001, B:5:0x0005, B:12:0x0024, B:15:0x002c, B:18:0x0034, B:21:0x003f, B:23:0x0049, B:25:0x0052, B:20:0x003a, B:8:0x0013), top: B:34:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    @Nullable
    /* JADX INFO: renamed from: e */
    public final C44110b m100037e(@Nullable C44110b markValue, @Nullable C44110b posMargin, @Nullable C44110b posCost) throws Throwable {
        Object objM103844constructorimpl;
        C44110b c44110bM97186f;
        C44110b c44110b;
        C44110b c44110bM97181a;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (markValue == null) {
                c44110bM97186f = null;
            } else {
                C44110b c44110bM97185e = markValue.m97182b(C44109a.f97401a.m97180b()) >= 0 ? markValue : markValue.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                if (c44110bM97185e == null) {
                    c44110bM97186f = null;
                } else {
                    if (posMargin == null || (c44110bM97181a = posMargin.m97181a(markValue)) == null) {
                        c44110b = new C44110b("0");
                    } else {
                        if (posCost == null) {
                            posCost = new C44110b("0");
                        }
                        c44110b = c44110bM97181a.m97187g(posCost);
                        if (c44110b == null) {
                            c44110b = new C44110b("0");
                        }
                    }
                    C44110b c44110bM97183c = c44110bM97185e.m97183c(c44110b, 20, KMMRoundingMode.HALF_UP);
                    if (c44110bM97183c != null) {
                        c44110bM97186f = c44110bM97183c.m97186f(2, KMMRoundingMode.UP);
                    } else {
                        c44110bM97186f = null;
                    }
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(c44110bM97186f);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C44110b m100033a(boolean isInverse, boolean isLimit, boolean isBuy, @NotNull C44110b inputDelegationPrice, @NotNull C44110b bestBid, @NotNull C44110b bestAsk, @NotNull C44110b spread) throws Throwable {
        Intrinsics.checkNotNullParameter(inputDelegationPrice, "inputDelegationPrice");
        Intrinsics.checkNotNullParameter(bestBid, "bestBid");
        Intrinsics.checkNotNullParameter(bestAsk, "bestAsk");
        Intrinsics.checkNotNullParameter(spread, "spread");
        if (isLimit && inputDelegationPrice.m97182b(new C44110b("0")) == 0) {
            return C44109a.f97401a.m97180b();
        }
        if (inputDelegationPrice.m97182b(new C44110b("1000000")) > 0) {
            inputDelegationPrice = new C44110b("1000000");
        }
        C44109a c44109a = C44109a.f97401a;
        C44110b c44110bM97187g = c44109a.m97179a().m97187g(spread);
        C44110b c44110bM97181a = c44109a.m97179a().m97181a(spread);
        if (isInverse) {
            if (!isLimit) {
                return isBuy ? bestAsk.m97185e(c44110bM97187g) : bestBid.m97185e(c44110bM97187g);
            }
            if (isBuy) {
                if (bestAsk.m97182b(new C44110b("0")) <= 0 || inputDelegationPrice.m97182b(bestAsk) < 0) {
                    bestAsk = inputDelegationPrice;
                }
                return bestAsk.m97185e(c44110bM97187g);
            }
        } else {
            if (!isLimit) {
                return isBuy ? bestAsk.m97185e(c44110bM97181a) : bestBid.m97185e(c44110bM97181a);
            }
            if (!isBuy) {
                if (bestBid.m97182b(inputDelegationPrice) <= 0) {
                    bestBid = inputDelegationPrice;
                }
                return bestBid.m97185e(c44110bM97181a);
            }
        }
        return inputDelegationPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final C44110b m100038f(boolean isInverse, @NotNull C44110b markPrice, @NotNull C44110b positionQty, @NotNull C44110b multiplier, @NotNull C44110b aggRate, @NotNull C44110b positionTotalMargin) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(markPrice, "markPrice");
        Intrinsics.checkNotNullParameter(positionQty, "positionQty");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(aggRate, "aggRate");
        Intrinsics.checkNotNullParameter(positionTotalMargin, "positionTotalMargin");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44110b c44110bM100032b = C45256a.f101797a.m100032b(positionQty.m97182b(new C44110b("0")) >= 0, isInverse);
            objM103844constructorimpl = Result.m103844constructorimpl((isInverse ? positionQty.m97185e(multiplier).m97185e(c44110bM100032b).m97185e(aggRate).m97183c(markPrice, 20, KMMRoundingMode.HALF_UP) : markPrice.m97185e(positionQty).m97185e(multiplier).m97185e(c44110bM100032b).m97185e(aggRate)).m97183c(positionTotalMargin, 4, KMMRoundingMode.UP));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            objM103844constructorimpl = null;
        }
        C44110b c44110b = (C44110b) objM103844constructorimpl;
        if (c44110b == null) {
            return null;
        }
        if (c44110b.m97182b(new C44110b("0")) < 0) {
            c44110b = new C44110b("1");
        }
        return c44110b;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final C44110b m100039g(boolean isInverse, @NotNull C44110b multiplier, @NotNull C44110b price, @NotNull C44110b qty) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(qty, "qty");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(isInverse ? qty.m97185e(multiplier).m97183c(price, 20, KMMRoundingMode.HALF_UP) : price.m97185e(qty).m97185e(multiplier));
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
