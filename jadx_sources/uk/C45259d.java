package uk;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.kmm.trade.KMMRoundingMode;
import com.kubi.otc.entity.OtcAd;
import com.tencent.bugly.proguard.C33556b3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p599rk.C44109a;
import p599rk.C44110b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: uk.d */
/* JADX INFO: compiled from: TpSlCalculator.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\f¨\u0006\u0019"}, m90084d2 = {"Luk/d;", "", "<init>", "()V", "", "isInverse", "Lrk/b;", "multiplier", "qty", "openPrice", "posInit", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "isBuy", "leverage", "pnlRate", "maxPrice", "c", "(ZZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "pnlPrice", "d", "(ZZLrk/b;Lrk/b;Lrk/b;)Lrk/b;", "closePrice", "closeQty", "b", "shared_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTpSlCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TpSlCalculator.kt\ncom/kubi/kmm/trade/futures/isolated/TpSlCalculator\n+ 2 NumberEx.kt\ncom/kubi/kmm/trade/utils/NumberExKt\n*L\n1#1,150:1\n52#2:151\n52#2:152\n52#2:153\n30#2,4:154\n18#2:158\n30#2,4:159\n30#2,4:163\n38#2,2:167\n55#2,2:169\n41#2:171\n52#2:172\n52#2:173\n30#2,4:174\n52#2:178\n30#2,4:179\n30#2,4:183\n52#2:187\n52#2:188\n52#2:189\n18#2:190\n30#2,4:191\n52#2:195\n52#2:196\n52#2:197\n18#2:198\n*S KotlinDebug\n*F\n+ 1 TpSlCalculator.kt\ncom/kubi/kmm/trade/futures/isolated/TpSlCalculator\n*L\n38#1:151\n39#1:152\n40#1:153\n42#1:154,4\n42#1:158\n43#1:159,4\n45#1:163,4\n46#1:167,2\n46#1:169,2\n46#1:171\n71#1:172\n72#1:173\n75#1:174,4\n76#1:178\n79#1:179,4\n82#1:183,4\n107#1:187\n108#1:188\n109#1:189\n112#1:190\n115#1:191,4\n140#1:195\n141#1:196\n142#1:197\n144#1:198\n*E\n"})
public final class C45259d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45259d f101800a = new C45259d();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final C44110b m100046a(boolean isInverse, @NotNull C44110b multiplier, @Nullable C44110b qty, @Nullable C44110b openPrice, @Nullable C44110b posInit) throws Throwable {
        Object objM103844constructorimpl;
        C44110b c44110bM97183c;
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (qty != null && qty.m97182b(new C44110b("0")) != 0 && posInit != null && posInit.m97182b(new C44110b("0")) != 0 && openPrice != null && openPrice.m97182b(new C44110b("0")) != 0) {
                if (isInverse) {
                    C44110b c44110bM97185e = multiplier.m97185e(qty);
                    KMMRoundingMode kMMRoundingMode = KMMRoundingMode.HALF_UP;
                    c44110bM97183c = new C44110b("1").m97183c(posInit.m97183c(c44110bM97185e, 20, kMMRoundingMode), 10, kMMRoundingMode).m97183c(openPrice, 20, kMMRoundingMode);
                } else {
                    c44110bM97183c = openPrice.m97185e(multiplier).m97185e(qty).m97183c(posInit, 20, KMMRoundingMode.HALF_UP);
                }
                if (c44110bM97183c.m97182b(C44109a.f97401a.m97180b()) < 0) {
                    c44110bM97183c = c44110bM97183c.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                }
                objM103844constructorimpl = Result.m103844constructorimpl(c44110bM97183c.m97186f(2, KMMRoundingMode.DOWN));
                return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
            }
            return null;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C44110b m100047b(boolean isInverse, @NotNull C44110b multiplier, @Nullable C44110b openPrice, @Nullable C44110b closePrice, @Nullable C44110b closeQty) throws Throwable {
        Object objM103844constructorimpl;
        C44110b c44110bM97187g;
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (closePrice != null && closePrice.m97182b(new C44110b("0")) != 0 && closeQty != null && closeQty.m97182b(new C44110b("0")) != 0 && openPrice != null && openPrice.m97182b(new C44110b("0")) != 0) {
                if (isInverse) {
                    C44110b c44110b = new C44110b("1");
                    KMMRoundingMode kMMRoundingMode = KMMRoundingMode.HALF_UP;
                    c44110bM97187g = c44110b.m97183c(closePrice, 10, kMMRoundingMode).m97187g(new C44110b("1").m97183c(openPrice, 10, kMMRoundingMode));
                } else {
                    c44110bM97187g = closePrice.m97187g(openPrice);
                }
                objM103844constructorimpl = Result.m103844constructorimpl(c44110bM97187g.m97185e(closeQty.m97185e(multiplier)));
                return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
            }
            return null;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final C44110b m100048c(boolean isInverse, boolean isBuy, @Nullable C44110b openPrice, @Nullable C44110b leverage, @NotNull C44110b pnlRate, @NotNull C44110b maxPrice) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(pnlRate, "pnlRate");
        Intrinsics.checkNotNullParameter(maxPrice, "maxPrice");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (leverage != null && leverage.m97182b(new C44110b("0")) != 0 && openPrice != null && openPrice.m97182b(new C44110b("0")) != 0) {
                C44110b c44110bM97185e = pnlRate.m97185e(C45256a.f101797a.m100032b(isBuy, isInverse));
                if (isInverse) {
                    C44110b c44110b = new C44110b("1");
                    KMMRoundingMode kMMRoundingMode = KMMRoundingMode.HALF_UP;
                    C44110b c44110bM97181a = c44110b.m97181a(c44110bM97185e.m97183c(leverage, 20, kMMRoundingMode));
                    if (c44110bM97181a.m97182b(new C44110b("0")) != 0) {
                        maxPrice = openPrice.m97183c(c44110bM97181a, 20, kMMRoundingMode);
                    }
                } else {
                    maxPrice = openPrice.m97185e(c44110bM97185e).m97183c(leverage, 20, KMMRoundingMode.HALF_UP).m97181a(openPrice);
                }
                objM103844constructorimpl = Result.m103844constructorimpl(maxPrice);
                return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
            }
            return null;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final C44110b m100049d(boolean isInverse, boolean isBuy, @Nullable C44110b openPrice, @Nullable C44110b leverage, @Nullable C44110b pnlPrice) throws Throwable {
        Object objM103844constructorimpl;
        C44110b c44110bM97183c;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (leverage != null && leverage.m97182b(new C44110b("0")) != 0 && openPrice != null && openPrice.m97182b(new C44110b("0")) != 0 && pnlPrice != null && pnlPrice.m97182b(new C44110b("0")) != 0) {
                C44110b c44110bM97185e = leverage.m97185e(C45256a.f101797a.m100032b(isBuy, isInverse));
                if (isInverse) {
                    C44110b c44110b = new C44110b("1");
                    KMMRoundingMode kMMRoundingMode = KMMRoundingMode.HALF_UP;
                    c44110bM97183c = c44110b.m97183c(pnlPrice, 10, kMMRoundingMode).m97187g(new C44110b("1").m97183c(openPrice, 10, kMMRoundingMode)).m97185e(c44110bM97185e).m97185e(openPrice);
                } else {
                    c44110bM97183c = pnlPrice.m97187g(openPrice).m97185e(c44110bM97185e).m97183c(openPrice, 20, KMMRoundingMode.HALF_UP);
                }
                objM103844constructorimpl = Result.m103844constructorimpl(c44110bM97183c.m97185e(new C44110b(C33556b3.f68995S)));
                return (C44110b) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
            }
            return null;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
