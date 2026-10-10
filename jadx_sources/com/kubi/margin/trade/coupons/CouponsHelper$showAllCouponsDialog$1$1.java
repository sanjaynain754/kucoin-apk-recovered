package com.kubi.margin.trade.coupons;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.margin.R$color;
import com.kubi.margin.R$id;
import com.kubi.margin.R$string;
import com.kubi.margin.api.entity.MarginCouponConfig;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import gf.C37886j;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.List;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: CouponsHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/margin/trade/coupons/CouponsHelper$showAllCouponsDialog$1$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/margin/api/entity/MarginCouponConfig;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CouponsHelper$showAllCouponsDialog$1$1 extends BaseQuickAdapter<MarginCouponConfig, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ BaseFragment f33733i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponsHelper$showAllCouponsDialog$1$1(List<MarginCouponConfig> list, BaseFragment baseFragment, int i11) {
        super(i11, list);
        this.f33733i = baseFragment;
    }

    /* JADX INFO: renamed from: i */
    public static final void m40029i(BaseViewHolder baseViewHolder, BaseFragment baseFragment, MarginCouponConfig marginCouponConfig, View view) {
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) baseViewHolder.getView(R$id.tvUse);
        kcPrimaryButton.m55043o();
        LifecycleOwnerKt.getLifecycleScope(baseFragment).launchWhenStarted(new CouponsHelper$showAllCouponsDialog$1$1$convert$2$1(marginCouponConfig, kcPrimaryButton, baseFragment, null));
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder helper, final MarginCouponConfig item) {
        GradientDrawable gradientDrawable;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tvDesc;
        BaseFragment baseFragment = this.f33733i;
        int i12 = R$string.margin_coupons_amount;
        BigDecimal couponQuota = item.getCouponQuota();
        String strM85578b = null;
        if (couponQuota != null) {
            gradientDrawable = null;
            strM85578b = C37886j.m85578b(couponQuota, item.getCurrency(), null, false, false, false, 0, null, 0, 254, null);
        } else {
            gradientDrawable = null;
        }
        String currency = item.getCurrency();
        if (currency == null) {
            currency = "";
        }
        helper.setText(i11, baseFragment.getString(i12, strM85578b, currency)).setText(R$id.tvDate, this.f33733i.getString(R$string.margin_coupons_period_days, String.valueOf(item.getDeadline()))).setText(R$id.tvOutDate, this.f33733i.getString(R$string.margin_coupons_expired_date, C42179a.m92633f(C27039d.m66652l(item.getExpiredDate()), null, false, true, null, 11, null)));
        TextView textView = (TextView) helper.getView(R$id.tvDiscount);
        textView.setText(this.f33733i.getString(R$string.margin_coupons_discount, item.getDiscount()));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(textView);
        highlightTextHelper.m54120f(textView, new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new AbsoluteSizeSpan(36, true)), new Pair(HighlightTextHelper.TextTagEnum.SPAN2, new AbsoluteSizeSpan(36, true)), new Pair(HighlightTextHelper.TextTagEnum.SPAN3, new AbsoluteSizeSpan(12, true)));
        textView.setPaddingRelative(textView.getPaddingStart(), textView.getPaddingTop(), textView.getPaddingEnd(), StringsKt.endsWith$default(textView.getText().toString(), "%", false, 2, (Object) gradientDrawable) ? C5275i0.m6236a(18.0f) : 0);
        int i13 = R$id.tvUse;
        helper.setGone(i13, Intrinsics.areEqual(item.getState(), "UNUSE"));
        TextView textView2 = (TextView) helper.getView(R$id.tvState);
        Drawable background = textView2.getBackground();
        GradientDrawable gradientDrawable2 = background instanceof GradientDrawable ? (GradientDrawable) background : gradientDrawable;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setColor(this.f33733i.getColorRes(R$color.primary8));
        }
        textView2.setTextColor(this.f33733i.getColorRes(R$color.primary));
        Intrinsics.checkNotNull(textView2);
        ViewExtKt.m66594y(textView2);
        if (Intrinsics.areEqual(item.getState(), "USING")) {
            textView2.setText(R$string.margin_coupons_state_using);
        } else if (!Intrinsics.areEqual(item.getState(), "UNUSE") || C27039d.m66647g(item.getDiscountedAmount()) == 0.0d || C27039d.m66647g(item.getCouponQuota()) == C27039d.m66647g(item.getDiscountedAmount())) {
            textView2.setText("");
            C27046k.m66703r(textView2);
        } else {
            textView2.setText(R$string.margin_coupons_state_part_using);
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColor(this.f33733i.getColorRes(R$color.complementary8));
            }
            textView2.setTextColor(this.f33733i.getColorRes(R$color.complementary));
        }
        final BaseFragment baseFragment2 = this.f33733i;
        helper.setOnClickListener(i13, new View.OnClickListener() { // from class: com.kubi.margin.trade.coupons.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CouponsHelper$showAllCouponsDialog$1$1.m40029i(helper, baseFragment2, item, view);
            }
        });
    }
}
