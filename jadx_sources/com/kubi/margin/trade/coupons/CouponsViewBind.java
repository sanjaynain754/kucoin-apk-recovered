package com.kubi.margin.trade.coupons;

import android.text.style.AbsoluteSizeSpan;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.margin.R$id;
import com.kubi.margin.R$string;
import com.kubi.margin.api.entity.CouponsOverview;
import com.kubi.margin.api.entity.MarginCouponConfig;
import com.kubi.margin.trade.IMarginParentBehavior;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33627eb;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import mp.C42579a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.margin.trade.coupons.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CouponsViewBind.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ.\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/margin/trade/coupons/CouponsViewBind;", "", "<init>", "()V", "initView", "", "parentBehavior", "Lcom/kubi/margin/trade/IMarginParentBehavior;", "isBuyHolder", "", "llCoupons", "Landroid/widget/LinearLayout;", "refreshCouponsStatus", "isHorizontal", "supportLever", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CouponsViewBind {
    /* JADX INFO: renamed from: c */
    public static final Unit m40032c(boolean z11, IMarginParentBehavior iMarginParentBehavior) {
        CouponsHelper.f33730a.m40027k(iMarginParentBehavior.mo39715H(), (z11 ? iMarginParentBehavior.getF33652Z() : iMarginParentBehavior.getF33651Y()).getCurrency(), iMarginParentBehavior.m40039S0() ? SharedPositionInfo.MARGIN_MODE_ISOLATED : "MARGIN", iMarginParentBehavior.mo39717J().getSymbol());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m40033b(@NotNull final IMarginParentBehavior parentBehavior, final boolean z11, @NotNull LinearLayout llCoupons) {
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(llCoupons, "llCoupons");
        C27046k.m66711z(llCoupons, 0L, new Function0() { // from class: com.kubi.margin.trade.coupons.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CouponsViewBind.m40032c(z11, parentBehavior);
            }
        }, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX INFO: renamed from: d */
    public final void m40034d(@NotNull IMarginParentBehavior parentBehavior, @NotNull LinearLayout llCoupons, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        CouponsOverview first;
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(llCoupons, "llCoupons");
        ViewExtKt.m66577h(llCoupons);
        if (z13 && C42579a.f94275a.m93347g().c()) {
            TextView textView = (TextView) llCoupons.findViewById(R$id.tvCoupons);
            if (parentBehavior.mo39736b1() == null) {
                return;
            }
            Pair<CouponsOverview, CouponsOverview> pairMo39736b1 = parentBehavior.mo39736b1();
            Intrinsics.checkNotNull(pairMo39736b1);
            if (pairMo39736b1.getFirst().hasCoupons()) {
                z14 = true;
            } else {
                Pair<CouponsOverview, CouponsOverview> pairMo39736b2 = parentBehavior.mo39736b1();
                Intrinsics.checkNotNull(pairMo39736b2);
                if (pairMo39736b2.getSecond().hasCoupons()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if (z11) {
                Pair<CouponsOverview, CouponsOverview> pairMo39736b3 = parentBehavior.mo39736b1();
                Intrinsics.checkNotNull(pairMo39736b3);
                first = pairMo39736b3.getSecond();
            } else {
                Pair<CouponsOverview, CouponsOverview> pairMo39736b4 = parentBehavior.mo39736b1();
                Intrinsics.checkNotNull(pairMo39736b4);
                first = pairMo39736b4.getFirst();
            }
            CouponsOverview couponsOverview = first;
            if (!couponsOverview.hasCoupons()) {
                if (z12 && z14) {
                    C27046k.m66703r(llCoupons);
                    return;
                } else {
                    ViewExtKt.m66577h(llCoupons);
                    return;
                }
            }
            ViewExtKt.m66594y(llCoupons);
            if (couponsOverview.getUsingCoupon() == null) {
                textView.setText(parentBehavior.mo39715H().getString(R$string.kumex_welfare_trial_lot, String.valueOf(C27039d.m66650j(couponsOverview.getCouponNotUseNum()))));
                return;
            }
            BaseFragment baseFragmentMo39715H = parentBehavior.mo39715H();
            int i11 = R$string.margin_coupons_discount;
            MarginCouponConfig usingCoupon = couponsOverview.getUsingCoupon();
            Intrinsics.checkNotNull(usingCoupon);
            String string = baseFragmentMo39715H.getString(i11, usingCoupon.getDiscount());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            textView.setText(StringsKt.replace$default(string, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, C33627eb.f69716f, false, 4, (Object) null));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            Intrinsics.checkNotNull(textView);
            highlightTextHelper.m54120f(textView, new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new AbsoluteSizeSpan(12, true)), new Pair(HighlightTextHelper.TextTagEnum.SPAN2, new AbsoluteSizeSpan(12, true)), new Pair(HighlightTextHelper.TextTagEnum.SPAN3, new AbsoluteSizeSpan(12, true)));
        }
    }
}
