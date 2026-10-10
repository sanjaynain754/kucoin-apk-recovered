package com.kubi.payment.kucoinpay.qrscan;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.journeyapps.barcodescanner.BarcodeView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.math.MathKt;

/* JADX INFO: compiled from: PaymentBarcodeView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR,\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00100\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/qrscan/PaymentBarcodeView;", "Lcom/journeyapps/barcodescanner/BarcodeView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "intersectionTop", "Lkotlin/Function0;", "", "getIntersectionTop", "()Lkotlin/jvm/functions/Function0;", "setIntersectionTop", "(Lkotlin/jvm/functions/Function0;)V", "measureSize", "Lkotlin/Pair;", "getMeasureSize", "setMeasureSize", "onFramingRectGet", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "", "getOnFramingRectGet", "()Lkotlin/jvm/functions/Function1;", "setOnFramingRectGet", "(Lkotlin/jvm/functions/Function1;)V", "calculateFramingRect", TtmlNode.RUBY_CONTAINER, "surface", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PaymentBarcodeView extends BarcodeView {

    /* JADX INFO: renamed from: I */
    @NotNull
    public Function0<Integer> f39596I;

    /* JADX INFO: renamed from: J */
    @NotNull
    public Function0<Pair<Integer, Integer>> f39597J;

    /* JADX INFO: renamed from: K */
    @Nullable
    public Function1<? super Rect, Unit> f39598K;

    /* JADX INFO: renamed from: P */
    public static final int m48327P() {
        return 0;
    }

    /* JADX INFO: renamed from: Q */
    public static final Pair m48328Q() {
        return TuplesKt.m90091to(0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentBarcodeView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.f39596I = new Function0() { // from class: com.kubi.payment.kucoinpay.qrscan.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(PaymentBarcodeView.m48327P());
            }
        };
        this.f39597J = new Function0() { // from class: com.kubi.payment.kucoinpay.qrscan.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentBarcodeView.m48328Q();
            }
        };
    }

    @NotNull
    public final Function0<Integer> getIntersectionTop() {
        return this.f39596I;
    }

    @NotNull
    public final Function0<Pair<Integer, Integer>> getMeasureSize() {
        return this.f39597J;
    }

    @Nullable
    public final Function1<Rect, Unit> getOnFramingRectGet() {
        return this.f39598K;
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview
    @NotNull
    /* JADX INFO: renamed from: k */
    public Rect mo14328k(@NotNull Rect container, @Nullable Rect rect) {
        Intrinsics.checkNotNullParameter(container, "container");
        Rect rect2 = new Rect();
        Pair<Integer, Integer> pairInvoke = this.f39597J.invoke();
        int iIntValue = pairInvoke.component1().intValue();
        int iIntValue2 = pairInvoke.component2().intValue();
        int iIntValue3 = this.f39596I.invoke().intValue();
        if (iIntValue3 <= 0 || iIntValue <= 0 || iIntValue2 <= 0) {
            Rect rectMo14328k = super.mo14328k(container, rect);
            Intrinsics.checkNotNullExpressionValue(rectMo14328k, "calculateFramingRect(...)");
            return rectMo14328k;
        }
        int iRoundToInt = MathKt.roundToInt((container.width() - iIntValue) / 2.0f);
        rect2.left = iRoundToInt;
        rect2.top = iIntValue3;
        rect2.right = iIntValue + iRoundToInt;
        rect2.bottom = iIntValue2 + iIntValue3;
        Function1<? super Rect, Unit> function1 = this.f39598K;
        if (function1 != null) {
            function1.invoke(rect2);
        }
        return rect2;
    }

    public final void setIntersectionTop(@NotNull Function0<Integer> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f39596I = function0;
    }

    public final void setMeasureSize(@NotNull Function0<Pair<Integer, Integer>> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f39597J = function0;
    }

    public final void setOnFramingRectGet(@Nullable Function1<? super Rect, Unit> function1) {
        this.f39598K = function1;
    }
}
