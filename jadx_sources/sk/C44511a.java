package sk;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.kmm.trade.KMMRoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p599rk.C44110b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: sk.a */
/* JADX INFO: compiled from: OneWayCrossCalculator.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJq\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, m90084d2 = {"Lsk/a;", "", "<init>", "()V", "", "isInverse", "Lrk/b;", "crossRiskLimit", "markPrice", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ZLrk/b;Lrk/b;)Lrk/b;", "k", "leverage", "totalMargin", "occupiedMargin", "estimatedPrice", "takerFee", "sameSidePositionQty", "totalSameSideOrderQty", "reverseSidePositionQty", "taxRate", "calcCrossRiskLimit", "b", "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "Lrk/b;", "ZERO", "c", "ONE", "shared_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOneWayCrossCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneWayCrossCalculator.kt\ncom/kubi/kmm/trade/futures/cross/OneWayCrossCalculator\n+ 2 NumberEx.kt\ncom/kubi/kmm/trade/utils/NumberExKt\n*L\n1#1,112:1\n30#2,4:113\n49#2:117\n30#2,4:118\n30#2,4:122\n30#2,4:126\n46#2:130\n49#2:131\n*S KotlinDebug\n*F\n+ 1 OneWayCrossCalculator.kt\ncom/kubi/kmm/trade/futures/cross/OneWayCrossCalculator\n*L\n40#1:113,4\n81#1:117\n92#1:118,4\n96#1:122,4\n100#1:126,4\n105#1:130\n106#1:131\n*E\n"})
public final class C44511a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44511a f98577a = new C44511a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final C44110b ZERO = new C44110b("0");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final C44110b ONE = new C44110b("1");

    @Nullable
    /* JADX INFO: renamed from: a */
    public final C44110b m98482a(boolean isInverse, @Nullable C44110b crossRiskLimit, @Nullable C44110b markPrice) throws Throwable {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (crossRiskLimit == null || markPrice == null) {
                return null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(isInverse ? crossRiskLimit.m97185e(markPrice) : crossRiskLimit.m97183c(markPrice, 20, KMMRoundingMode.HALF_UP));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C44110b m98483b(boolean isInverse, @NotNull C44110b k11, @NotNull C44110b leverage, @NotNull C44110b totalMargin, @NotNull C44110b occupiedMargin, @NotNull C44110b estimatedPrice, @NotNull C44110b takerFee, @NotNull C44110b sameSidePositionQty, @NotNull C44110b totalSameSideOrderQty, @NotNull C44110b reverseSidePositionQty, @NotNull C44110b taxRate, @Nullable C44110b calcCrossRiskLimit) throws Throwable {
        C44110b c44110bM97183c;
        Intrinsics.checkNotNullParameter(k11, "k");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(totalMargin, "totalMargin");
        Intrinsics.checkNotNullParameter(occupiedMargin, "occupiedMargin");
        Intrinsics.checkNotNullParameter(estimatedPrice, "estimatedPrice");
        Intrinsics.checkNotNullParameter(takerFee, "takerFee");
        Intrinsics.checkNotNullParameter(sameSidePositionQty, "sameSidePositionQty");
        Intrinsics.checkNotNullParameter(totalSameSideOrderQty, "totalSameSideOrderQty");
        Intrinsics.checkNotNullParameter(reverseSidePositionQty, "reverseSidePositionQty");
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44110b c44110bM97187g = totalMargin.m97187g(occupiedMargin);
            C44110b c44110b = ZERO;
            if (c44110bM97187g.m97182b(c44110b) <= 0) {
                c44110bM97187g = c44110b;
            }
            C44110b c44110bM97185e = c44110bM97187g.m97185e(leverage);
            if (!isInverse) {
                C44110b c44110b2 = ONE;
                c44110bM97183c = k11.m97185e(estimatedPrice.m97185e(c44110b2.m97181a(takerFee.m97185e(c44110b2.m97181a(taxRate)).m97185e(leverage))));
            } else {
                if (estimatedPrice.m97182b(c44110b) < 0) {
                    return null;
                }
                C44110b c44110b3 = ONE;
                C44110b c44110bM97181a = c44110b3.m97181a(takerFee.m97185e(c44110b3.m97181a(taxRate)).m97185e(leverage));
                KMMRoundingMode kMMRoundingMode = KMMRoundingMode.HALF_UP;
                c44110bM97183c = estimatedPrice.m97183c(c44110bM97181a, 20, kMMRoundingMode).m97183c(k11, 20, kMMRoundingMode);
            }
            C44110b c44110bM97185e2 = k11.m97185e(new C44110b(String.valueOf(Math.log(!isInverse ? c44110bM97185e.m97183c(c44110bM97183c, 20, KMMRoundingMode.HALF_UP).m97181a(ONE).m97188h() : c44110bM97185e.m97185e(c44110bM97183c).m97181a(ONE).m97188h()))));
            if (calcCrossRiskLimit != null) {
                if (calcCrossRiskLimit.m97182b(c44110bM97185e2) >= 0) {
                    calcCrossRiskLimit = c44110bM97185e2;
                }
                if (calcCrossRiskLimit != null) {
                    c44110bM97185e2 = calcCrossRiskLimit;
                }
            }
            C44110b c44110bM97181a2 = c44110bM97185e2.m97187g(sameSidePositionQty.m97181a(totalSameSideOrderQty)).m97181a(reverseSidePositionQty);
            return c44110b.m97182b(c44110bM97181a2) > 0 ? c44110b : c44110bM97181a2;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        }
    }
}
