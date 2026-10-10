package uk;

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

/* JADX INFO: renamed from: uk.c */
/* JADX INFO: compiled from: ModifyMarginCalculator.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0018J/\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0018J'\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m90084d2 = {"Luk/c;", "", "<init>", "()V", "", "isInverse", "Lrk/b;", "multiplier", "qty", "posCost", "posMargin", "maintainMarginRate", "liquidationFeeRate", "taxRate", "inputMarginWithSide", "c", "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "maxLeverage", "markPrice", "avgEntryPrice", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "markValue", "e", "(Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "inputLeverage", "d", "b", "posTotalMargin", "changeMarginWithSide", "f", "(Lrk/b;Lrk/b;Lrk/b;)Lrk/b;", "shared_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nModifyMarginCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifyMarginCalculator.kt\ncom/kubi/kmm/trade/futures/isolated/ModifyMarginCalculator\n+ 2 NumberEx.kt\ncom/kubi/kmm/trade/utils/NumberExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n30#2,4:196\n30#2,4:200\n38#2,2:205\n55#2,2:207\n41#2:209\n30#2,4:210\n38#2,2:214\n55#2,2:216\n41#2:218\n30#2,4:219\n38#2,2:223\n55#2,2:225\n41#2:227\n30#2,4:228\n38#2,2:232\n55#2,2:234\n41#2:236\n30#2,4:237\n1#3:204\n*S KotlinDebug\n*F\n+ 1 ModifyMarginCalculator.kt\ncom/kubi/kmm/trade/futures/isolated/ModifyMarginCalculator\n*L\n56#1:196,4\n58#1:200,4\n87#1:205,2\n87#1:207,2\n87#1:209\n87#1:210,4\n141#1:214,2\n141#1:216,2\n141#1:218\n141#1:219,4\n166#1:223,2\n166#1:225,2\n166#1:227\n166#1:228,4\n189#1:232,2\n189#1:234,2\n189#1:236\n189#1:237,4\n*E\n"})
public final class C45258c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45258c f101799a = new C45258c();

    @Nullable
    /* JADX INFO: renamed from: c */
    public final C44110b m100042c(boolean isInverse, @NotNull C44110b multiplier, @NotNull C44110b qty, @NotNull C44110b posCost, @NotNull C44110b posMargin, @NotNull C44110b maintainMarginRate, @NotNull C44110b liquidationFeeRate, @NotNull C44110b taxRate, @NotNull C44110b inputMarginWithSide) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(qty, "qty");
        Intrinsics.checkNotNullParameter(posCost, "posCost");
        Intrinsics.checkNotNullParameter(posMargin, "posMargin");
        Intrinsics.checkNotNullParameter(maintainMarginRate, "maintainMarginRate");
        Intrinsics.checkNotNullParameter(liquidationFeeRate, "liquidationFeeRate");
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        Intrinsics.checkNotNullParameter(inputMarginWithSide, "inputMarginWithSide");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44110b c44110bM100032b = C45256a.f101797a.m100032b(qty.m97182b(new C44110b("0")) >= 0, isInverse);
            C44110b c44110bM97187g = posCost.m97187g(posMargin).m97187g(inputMarginWithSide);
            C44110b c44110bM97187g2 = new C44110b("1").m97187g(c44110bM100032b.m97185e(maintainMarginRate)).m97187g(c44110bM100032b.m97185e(liquidationFeeRate).m97185e(new C44110b("1").m97181a(taxRate)));
            objM103844constructorimpl = Result.m103844constructorimpl(isInverse ? qty.m97185e(multiplier).m97185e(c44110bM97187g2).m97183c(c44110bM97187g, 20, KMMRoundingMode.HALF_UP) : c44110bM97187g.m97183c(qty.m97185e(multiplier).m97185e(c44110bM97187g2), 20, KMMRoundingMode.HALF_UP));
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
    /* JADX INFO: renamed from: a */
    public final C44110b m100040a(@NotNull C44110b maxLeverage, @NotNull C44110b posMargin, @NotNull C44110b posCost, @NotNull C44110b markPrice, @NotNull C44110b avgEntryPrice, @NotNull C44110b inputMarginWithSide) throws Throwable {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        Intrinsics.checkNotNullParameter(maxLeverage, "maxLeverage");
        Intrinsics.checkNotNullParameter(posMargin, "posMargin");
        Intrinsics.checkNotNullParameter(posCost, "posCost");
        Intrinsics.checkNotNullParameter(markPrice, "markPrice");
        Intrinsics.checkNotNullParameter(avgEntryPrice, "avgEntryPrice");
        Intrinsics.checkNotNullParameter(inputMarginWithSide, "inputMarginWithSide");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44110b c44110bM97181a = posMargin.m97181a(inputMarginWithSide);
            try {
                if (posCost.m97182b(C44109a.f97401a.m97180b()) < 0) {
                    posCost = posCost.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
                }
                objM103844constructorimpl2 = Result.m103844constructorimpl(posCost.m97183c(maxLeverage, 20, KMMRoundingMode.HALF_UP));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl2) != null) {
                objM103844constructorimpl2 = new C44110b("0");
            }
            if (c44110bM97181a.m97182b((C44110b) objM103844constructorimpl2) >= 0) {
                markPrice = avgEntryPrice;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(markPrice);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (C44110b) objM103844constructorimpl;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C44110b m100041b(@NotNull C44110b markValue, @NotNull C44110b posMargin, @NotNull C44110b posCost, @NotNull C44110b inputMarginWithSide) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(markValue, "markValue");
        Intrinsics.checkNotNullParameter(posMargin, "posMargin");
        Intrinsics.checkNotNullParameter(posCost, "posCost");
        Intrinsics.checkNotNullParameter(inputMarginWithSide, "inputMarginWithSide");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((markValue.m97182b(C44109a.f97401a.m97180b()) >= 0 ? markValue : markValue.m97185e(new C44110b(OtcAd.KYC_NOT_PASS))).m97183c(posMargin.m97181a(markValue).m97187g(posCost).m97181a(inputMarginWithSide), 20, KMMRoundingMode.HALF_UP).m97186f(2, KMMRoundingMode.UP));
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
    public final C44110b m100043d(@NotNull C44110b markValue, @NotNull C44110b posMargin, @NotNull C44110b posCost, @NotNull C44110b inputLeverage) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(markValue, "markValue");
        Intrinsics.checkNotNullParameter(posMargin, "posMargin");
        Intrinsics.checkNotNullParameter(posCost, "posCost");
        Intrinsics.checkNotNullParameter(inputLeverage, "inputLeverage");
        try {
            Result.Companion companion = Result.INSTANCE;
            C44110b c44110bM97187g = posMargin.m97181a(markValue).m97187g(posCost);
            if (markValue.m97182b(C44109a.f97401a.m97180b()) < 0) {
                markValue = markValue.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(c44110bM97187g.m97187g(markValue.m97183c(inputLeverage, 20, KMMRoundingMode.HALF_UP)));
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
    /* JADX INFO: renamed from: e */
    public final C44110b m100044e(@NotNull C44110b markValue, @NotNull C44110b posMargin, @NotNull C44110b posCost, @NotNull C44110b inputMarginWithSide) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(markValue, "markValue");
        Intrinsics.checkNotNullParameter(posMargin, "posMargin");
        Intrinsics.checkNotNullParameter(posCost, "posCost");
        Intrinsics.checkNotNullParameter(inputMarginWithSide, "inputMarginWithSide");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(posMargin.m97181a(markValue).m97187g(posCost).m97181a(inputMarginWithSide));
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
    /* JADX INFO: renamed from: f */
    public final C44110b m100045f(@NotNull C44110b markValue, @NotNull C44110b posTotalMargin, @NotNull C44110b changeMarginWithSide) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(markValue, "markValue");
        Intrinsics.checkNotNullParameter(posTotalMargin, "posTotalMargin");
        Intrinsics.checkNotNullParameter(changeMarginWithSide, "changeMarginWithSide");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (markValue.m97182b(C44109a.f97401a.m97180b()) < 0) {
                markValue = markValue.m97185e(new C44110b(OtcAd.KYC_NOT_PASS));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(markValue.m97183c(posTotalMargin.m97181a(changeMarginWithSide), 20, KMMRoundingMode.HALF_UP).m97186f(2, changeMarginWithSide.m97182b(new C44110b("0")) >= 0 ? KMMRoundingMode.UP : KMMRoundingMode.DOWN));
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
