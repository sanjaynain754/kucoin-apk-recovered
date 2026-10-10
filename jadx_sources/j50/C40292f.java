package j50;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.style.StyleSpan;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ViewKt;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.strategyList.entity.CouponReward;
import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import com.kubi.tradingbotkit.service.TradingBotKitDepend;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.Locale;
import k50.C40917g;
import l50.C42099y;
import o50.C42976j;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j50.f */
/* JADX INFO: compiled from: FuturesGridBinder.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\"\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0002H\u0002\u001a\n\u0010\u0013\u001a\u00020\u0014*\u00020\u0002\u001a\n\u0010\u0015\u001a\u00020\u0014*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u0002\u001a\n\u0010\u0018\u001a\u00020\u0017*\u00020\u0002\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\u001a\u001a\n\u0010\u001b\u001a\u00020\u0001*\u00020\u001a\u001a\u0016\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0014\u001a\u0012\u0010\u001f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010 \u001a\u00020\t¨\u0006!"}, m90084d2 = {"bindFuturesGrid", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "bindCouponInfo", "couponLl", "Landroidx/appcompat/widget/LinearLayoutCompat;", "couponDescTv", "Lcom/kubi/resources/widget/BaseTextView;", "couponTimeTv", "bindNotTrigger", "viewBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitStrategyItemGridBinding;", "ctx", "Landroid/content/Context;", "bindOther", "getPriceRangeStr", "", "getPricePrecision", "", "getProfitPrecision", "isNotTrigger", "", "isPriceOutRange", "startRotatingAnimation", "Landroid/view/View;", "stopRotatingAnimation", "changeBackgroundColor", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "color", "bindFuturesSideAndLeverage", "sideTv", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40292f {
    /* JADX INFO: renamed from: c */
    public static final void m88768c(@NotNull StrategyItemEntity strategyItemEntity, @NotNull LinearLayoutCompat couponLl, @NotNull BaseTextView couponDescTv, @NotNull BaseTextView couponTimeTv) {
        BigDecimal maxReward;
        Long expiredTime;
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(couponLl, "couponLl");
        Intrinsics.checkNotNullParameter(couponDescTv, "couponDescTv");
        Intrinsics.checkNotNullParameter(couponTimeTv, "couponTimeTv");
        if (strategyItemEntity.getTrialCoupon() == null) {
            C27046k.m66700o(couponLl);
            return;
        }
        C27046k.m66685H(couponLl);
        int iM88779n = m88779n(strategyItemEntity);
        Context context = couponLl.getContext();
        int i11 = R$string.kc_tb_grid_spot_position_remaining_time;
        CouponReward trialCoupon = strategyItemEntity.getTrialCoupon();
        couponTimeTv.setText(context.getString(i11, (trialCoupon == null || (expiredTime = trialCoupon.getExpiredTime()) == null) ? null : C42976j.m94382a(expiredTime.longValue())));
        Context context2 = couponLl.getContext();
        int i12 = R$string.kc_tb_grid_coupon_amount_tips;
        CouponReward trialCoupon2 = strategyItemEntity.getTrialCoupon();
        String strM92647l = C42180b.m92647l((trialCoupon2 == null || (maxReward = trialCoupon2.getMaxReward()) == null) ? null : C42180b.m92640e(maxReward, null, iM88779n, false, false, false, 0, null, 125, null));
        CouponReward trialCoupon3 = strategyItemEntity.getTrialCoupon();
        couponDescTv.setText(context2.getString(i12, strM92647l, trialCoupon3 != null ? trialCoupon3.getCurrency() : null));
        HighlightTextHelper.f43497a.m54120f(couponDescTv, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new StyleSpan(1)));
    }

    /* JADX INFO: renamed from: d */
    public static final void m88769d(@NotNull StrategyItemEntity strategyItemEntity, @NotNull BaseViewHolder helper) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        C42099y c42099yM92353a = C42099y.m92353a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c42099yM92353a, "bind(...)");
        Context context = helper.itemView.getContext();
        c42099yM92353a.f93335a0.setText(IKuMexService.m33249T(TradingBotKitDepend.f52488a.m64276c(), C27041f.m66668h(strategyItemEntity.getSymbolCode()), false, 2, null).toString());
        c42099yM92353a.f93354o.setText(C42976j.m94383b(C27039d.m66652l(strategyItemEntity.getStartTimeDifference())));
        c42099yM92353a.f93333Z.setText(context.getString(R$string.kc_tb_futures_grid));
        int i11 = DayNightThemeManager.f28592a.m33187l() ? R$color.c_cover4 : R$color.c_cover8;
        BaseTextView strategyNameTv = c42099yM92353a.f93333Z;
        Intrinsics.checkNotNullExpressionValue(strategyNameTv, "strategyNameTv");
        m88776k(strategyNameTv, context.getColor(i11));
        BaseTextView sideTv = c42099yM92353a.f93331X;
        Intrinsics.checkNotNullExpressionValue(sideTv, "sideTv");
        m88770e(strategyItemEntity, sideTv);
        c42099yM92353a.f93319L.setVisibility(8);
        AppCompatImageView loadingIv = c42099yM92353a.f93314G;
        Intrinsics.checkNotNullExpressionValue(loadingIv, "loadingIv");
        m88783r(loadingIv);
        c42099yM92353a.f93314G.setVisibility(8);
        c42099yM92353a.f93339c0.setText(context.getString(R$string.kc_tb_terminate_title));
        c42099yM92353a.f93339c0.setEnabled(!Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING"));
        KcSecondaryButton terminalTv = c42099yM92353a.f93339c0;
        Intrinsics.checkNotNullExpressionValue(terminalTv, "terminalTv");
        C40285b1.m88725H(terminalTv);
        c42099yM92353a.f93332Y.setTextColor(context.getColor(R$color.c_text));
        KcSecondaryButton detailTv = c42099yM92353a.f93351l;
        Intrinsics.checkNotNullExpressionValue(detailTv, "detailTv");
        C40285b1.m88723F(detailTv, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        ConstraintLayout rootCl = c42099yM92353a.f93330W;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        C40285b1.m88723F(rootCl, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        if (Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING")) {
            BaseTextView baseTextView = c42099yM92353a.f93332Y;
            int i12 = R$string.kc_tb_grid_action_close;
            baseTextView.setText(context.getString(i12));
            c42099yM92353a.f93314G.setVisibility(0);
            AppCompatImageView loadingIv2 = c42099yM92353a.f93314G;
            Intrinsics.checkNotNullExpressionValue(loadingIv2, "loadingIv");
            m88782q(loadingIv2);
            c42099yM92353a.f93339c0.setText(context.getString(i12));
        } else if (m88781p(strategyItemEntity)) {
            c42099yM92353a.f93332Y.setText(context.getString(R$string.kc_tb_grid_status_out_range));
            c42099yM92353a.f93319L.setVisibility(0);
            if (C41014a.m89922G(strategyItemEntity.getPrice(), null, 1, null).compareTo(C41014a.m89922G(strategyItemEntity.getDown(), null, 1, null)) < 0) {
                c42099yM92353a.f93319L.setText(context.getString(R$string.kc_tb_grid_status_range_low_tips));
            } else if (C41014a.m89922G(strategyItemEntity.getPrice(), null, 1, null).compareTo(C41014a.m89922G(strategyItemEntity.getUp(), null, 1, null)) > 0) {
                c42099yM92353a.f93319L.setText(context.getString(R$string.kc_tb_grid_status_range_high_tips));
            }
        } else if (m88780o(strategyItemEntity)) {
            c42099yM92353a.f93332Y.setText(context.getString(R$string.kc_tb_grid_status_not_trigger));
        } else {
            c42099yM92353a.f93332Y.setText(context.getString(R$string.kc_tb_grid_status_running));
            c42099yM92353a.f93332Y.setTextColor(context.getColor(R$color.brandGreen));
        }
        LinearLayoutCompat couponLl = c42099yM92353a.f93349j;
        Intrinsics.checkNotNullExpressionValue(couponLl, "couponLl");
        BaseTextView couponDescTv = c42099yM92353a.f93348i;
        Intrinsics.checkNotNullExpressionValue(couponDescTv, "couponDescTv");
        BaseTextView couponTimeTv = c42099yM92353a.f93350k;
        Intrinsics.checkNotNullExpressionValue(couponTimeTv, "couponTimeTv");
        m88768c(strategyItemEntity, couponLl, couponDescTv, couponTimeTv);
        BaseTextView baseTextView2 = c42099yM92353a.f93322O;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R$string.kc_tb_grid_total_profit) + " (");
        sb2.append(C42180b.m92647l(strategyItemEntity.getQuote()));
        sb2.append(")");
        baseTextView2.setText(sb2.toString());
        BaseTextView baseTextView3 = c42099yM92353a.f93323P;
        BigDecimal totalProfit = strategyItemEntity.getTotalProfit();
        baseTextView3.setText(C42180b.m92647l(totalProfit != null ? C42180b.m92640e(totalProfit, null, 2, false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView4 = c42099yM92353a.f93323P;
        Intrinsics.checkNotNull(context);
        BigDecimal totalProfit2 = strategyItemEntity.getTotalProfit();
        if (totalProfit2 == null) {
            totalProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfit2);
        baseTextView4.setTextColor(C22890g.m54282g(context, totalProfit2, 0, 2, null));
        BaseTextView baseTextView5 = c42099yM92353a.f93321N;
        BigDecimal totalProfitRate = strategyItemEntity.getTotalProfitRate();
        baseTextView5.setText(C42180b.m92649n(totalProfitRate != null ? C42180b.m92642g(totalProfitRate, null, null, 0, true, false, false, 55, null) : null));
        BaseTextView baseTextView6 = c42099yM92353a.f93321N;
        BigDecimal totalProfitRate2 = strategyItemEntity.getTotalProfitRate();
        if (totalProfitRate2 == null) {
            totalProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfitRate2);
        baseTextView6.setTextColor(C22890g.m54282g(context, totalProfitRate2, 0, 2, null));
        BaseTextView baseTextView7 = c42099yM92353a.f93316I;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getString(R$string.kc_tb_grid_total_margin) + " (");
        sb3.append(C42180b.m92647l(strategyItemEntity.getQuote()));
        sb3.append(")");
        baseTextView7.setText(sb3.toString());
        BaseTextView baseTextView8 = c42099yM92353a.f93317J;
        BigDecimal totalCost = strategyItemEntity.getTotalCost();
        baseTextView8.setText(totalCost != null ? C42180b.m92640e(totalCost, null, m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null);
        if (m88780o(strategyItemEntity)) {
            m88771f(strategyItemEntity, c42099yM92353a, context);
        } else {
            m88772g(strategyItemEntity, c42099yM92353a, context);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m88770e(@NotNull StrategyItemEntity strategyItemEntity, @NotNull BaseTextView sideTv) {
        String lowerCase;
        String lowerCase2;
        String strM66516f;
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(sideTv, "sideTv");
        String direction = strategyItemEntity.getDirection();
        sideTv.setVisibility((direction == null || direction.length() != 0) ? 0 : 8);
        String direction2 = strategyItemEntity.getDirection();
        String strM92640e = null;
        if (direction2 != null) {
            lowerCase = direction2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        boolean zAreEqual = Intrinsics.areEqual(lowerCase, "neutral");
        if (zAreEqual) {
            sideTv.setTextColor(sideTv.getContext().getColor(R$color.c_text));
            m88776k(sideTv, sideTv.getContext().getColor(DayNightThemeManager.f28592a.m33187l() ? R$color.c_cover4 : R$color.c_cover8));
        } else {
            int iM54281f = C22890g.m54281f(C27017c.f54310a.m66513b(), !Intrinsics.areEqual(strategyItemEntity.getDirection(), "short"));
            m88776k(sideTv, ColorUtils.setAlphaComponent(iM54281f, 20));
            sideTv.setTextColor(iM54281f);
        }
        String direction3 = strategyItemEntity.getDirection();
        if (direction3 != null) {
            lowerCase2 = direction3.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        } else {
            lowerCase2 = null;
        }
        if (Intrinsics.areEqual(lowerCase2, "short")) {
            strM66516f = C27017c.f54310a.m66516f(R$string.contract_short, new Object[0]);
        } else {
            strM66516f = zAreEqual ? C27017c.f54310a.m66516f(R$string.platform_market_emotion_neutral, new Object[0]) : C27017c.f54310a.m66516f(R$string.contract_long, new Object[0]);
        }
        Long leverage = strategyItemEntity.getLeverage();
        if (leverage != null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(leverage.longValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            if (bigDecimalValueOf != null) {
                strM92640e = C42180b.m92640e(bigDecimalValueOf, null, 2, false, false, false, 0, null, 125, null);
            }
        }
        sideTv.setText(strM66516f + C33627eb.f69716f + com.kubi.tradingbotkit.business.spot.viewmodel.t0.a(C42180b.m92647l(strM92640e), "x").toString());
    }

    /* JADX INFO: renamed from: f */
    public static final void m88771f(StrategyItemEntity strategyItemEntity, C42099y c42099y, Context context) {
        Group notTriggerInVisibleGroup = c42099y.f93318K;
        Intrinsics.checkNotNullExpressionValue(notTriggerInVisibleGroup, "notTriggerInVisibleGroup");
        C27046k.m66700o(notTriggerInVisibleGroup);
        int iM66651k = C27039d.m66651k(strategyItemEntity.getPricePrecision(), 8);
        c42099y.f93332Y.setText(context.getString(R$string.kc_tb_grid_status_not_trigger));
        c42099y.f93328U.setText(context.getString(R$string.kc_tb_grid_order_section));
        c42099y.f93329V.setText(m88778m(strategyItemEntity));
        c42099y.f93359t.setNeedDash(false);
        c42099y.f93359t.setText(context.getString(R$string.kc_latest_price));
        BaseTextView baseTextView = c42099y.f93360u;
        BigDecimal price = strategyItemEntity.getPrice();
        baseTextView.setText(C42180b.m92647l(price != null ? C42180b.m92640e(price, null, iM66651k, false, false, false, 0, null, 125, null) : null));
        c42099y.f93344f.setText(context.getString(R$string.trigger_price_tips));
        BaseTextView baseTextView2 = c42099y.f93346g;
        BigDecimal openUnitPrice = strategyItemEntity.getOpenUnitPrice();
        baseTextView2.setText(C42180b.m92647l(openUnitPrice != null ? C42180b.m92640e(openUnitPrice, null, iM66651k, false, false, false, 0, null, 125, null) : null));
    }

    /* JADX INFO: renamed from: g */
    public static final void m88772g(StrategyItemEntity strategyItemEntity, final C42099y c42099y, final Context context) {
        String lowerCase;
        String str;
        StringBuilder sb2;
        String strM92640e;
        int i11;
        String strM92640e2;
        Group notTriggerInVisibleGroup = c42099y.f93318K;
        Intrinsics.checkNotNullExpressionValue(notTriggerInVisibleGroup, "notTriggerInVisibleGroup");
        C27046k.m66685H(notTriggerInVisibleGroup);
        int iM88777l = m88777l(strategyItemEntity);
        int iM88779n = m88779n(strategyItemEntity);
        DashTextView liqTitleTv = c42099y.f93308A;
        Intrinsics.checkNotNullExpressionValue(liqTitleTv, "liqTitleTv");
        C40285b1.m88727J(liqTitleTv);
        String direction = strategyItemEntity.getDirection();
        if (direction != null) {
            lowerCase = direction.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (Intrinsics.areEqual(lowerCase, "neutral")) {
            BigDecimal longBlowUpPrice = strategyItemEntity.getLongBlowUpPrice();
            if (longBlowUpPrice == null) {
                longBlowUpPrice = BigDecimal.ZERO;
            }
            BigDecimal shortBlowUpPrice = strategyItemEntity.getShortBlowUpPrice();
            if (shortBlowUpPrice == null) {
                shortBlowUpPrice = BigDecimal.ZERO;
            }
            BigDecimal longBlowUpPrice2 = longBlowUpPrice.compareTo(shortBlowUpPrice) <= 0 ? strategyItemEntity.getLongBlowUpPrice() : strategyItemEntity.getShortBlowUpPrice();
            BigDecimal longBlowUpPrice3 = strategyItemEntity.getLongBlowUpPrice();
            if (longBlowUpPrice3 == null) {
                longBlowUpPrice3 = BigDecimal.ZERO;
            }
            BigDecimal shortBlowUpPrice2 = strategyItemEntity.getShortBlowUpPrice();
            if (shortBlowUpPrice2 == null) {
                shortBlowUpPrice2 = BigDecimal.ZERO;
            }
            BigDecimal shortBlowUpPrice3 = longBlowUpPrice3.compareTo(shortBlowUpPrice2) <= 0 ? strategyItemEntity.getShortBlowUpPrice() : strategyItemEntity.getLongBlowUpPrice();
            c42099y.f93309B.setText(m88773h(longBlowUpPrice2, iM88777l) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + m88773h(shortBlowUpPrice3, iM88777l));
        } else {
            c42099y.f93309B.setText((strategyItemEntity.getBlowUpPrice() == null || strategyItemEntity.getBlowUpPrice().compareTo(BigDecimal.ZERO) <= 0) ? "--" : C42180b.m92640e(strategyItemEntity.getBlowUpPrice(), null, iM88777l, false, false, false, 0, null, 125, null));
        }
        c42099y.f93356q.setText(context.getString(R$string.kc_tb_grid_enter_price) + "/" + context.getString(R$string.kc_latest_price));
        BaseTextView baseTextView = c42099y.f93357r;
        StringBuilder sb3 = new StringBuilder();
        BigDecimal entryPrice = strategyItemEntity.getEntryPrice();
        if (entryPrice != null) {
            str = "/";
            sb2 = sb3;
            strM92640e = C42180b.m92640e(entryPrice, null, iM88777l, false, false, false, 0, null, 125, null);
        } else {
            str = "/";
            sb2 = sb3;
            strM92640e = null;
        }
        sb2.append(C42180b.m92647l(strM92640e));
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        BigDecimal price = strategyItemEntity.getPrice();
        sb2.append(C42180b.m92647l(price != null ? C42180b.m92640e(price, null, iM88777l, false, false, false, 0, null, 125, null) : null));
        baseTextView.setText(sb2.toString());
        c42099y.f93328U.setText(context.getString(R$string.kc_tb_grid_reserved_margin));
        BaseTextView baseTextView2 = c42099y.f93329V;
        BigDecimal reservedMargin = strategyItemEntity.getReservedMargin();
        baseTextView2.setText(C42180b.m92647l(reservedMargin != null ? C42180b.m92640e(reservedMargin, null, iM88777l, false, false, false, 0, null, 125, null) : null));
        c42099y.f93359t.setNeedDash(true);
        DashTextView fundsFeeTitleTv = c42099y.f93359t;
        Intrinsics.checkNotNullExpressionValue(fundsFeeTitleTv, "fundsFeeTitleTv");
        C27046k.m66711z(fundsFeeTitleTv, 0L, new Function0() { // from class: j50.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40292f.m88774i(c42099y, context);
            }
        }, 1, null);
        c42099y.f93360u.setText(C42180b.m92647l(C42180b.m92640e(C41014a.m89922G(strategyItemEntity.getFundingFee(), null, 1, null), null, iM88779n, false, false, false, 0, null, 125, null)));
        BaseTextView baseTextView3 = c42099y.f93346g;
        StringBuilder sb4 = new StringBuilder();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getDayArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        sb4.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf, null, 0, false, false, false, 0, null, 127, null)));
        sb4.append(str);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getTotalArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        sb4.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf2, null, 0, false, false, false, 0, null, 127, null)));
        baseTextView3.setText(sb4.toString());
        BaseTextView baseTextView4 = c42099y.f93326S;
        StringBuilder sb5 = new StringBuilder();
        BigDecimal down = strategyItemEntity.getDown();
        sb5.append(C42180b.m92647l(down != null ? C42180b.m92640e(down, null, iM88777l, false, false, false, 0, null, 125, null) : null));
        sb5.append(" - ");
        BigDecimal up2 = strategyItemEntity.getUp();
        sb5.append(C42180b.m92647l(up2 != null ? C42180b.m92640e(up2, null, iM88777l, false, false, false, 0, null, 125, null) : null));
        baseTextView4.setText(sb5.toString());
        BaseTextView baseTextView5 = c42099y.f93340d;
        BigDecimal yearProfitRate = strategyItemEntity.getYearProfitRate();
        baseTextView5.setText(C42180b.m92649n(yearProfitRate != null ? C42180b.m92642g(yearProfitRate, null, null, 0, false, false, false, 63, null) : null));
        BaseTextView baseTextView6 = c42099y.f93340d;
        BigDecimal yearProfitRate2 = strategyItemEntity.getYearProfitRate();
        if (yearProfitRate2 == null) {
            yearProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(yearProfitRate2);
        baseTextView6.setTextColor(C22890g.m54282g(context, yearProfitRate2, 0, 2, null));
        DashTextView unPnlTitleTv = c42099y.f93343e0;
        Intrinsics.checkNotNullExpressionValue(unPnlTitleTv, "unPnlTitleTv");
        C40285b1.m88751t(unPnlTitleTv);
        BaseTextView baseTextView7 = c42099y.f93345f0;
        BigDecimal floatingAmount = strategyItemEntity.getFloatingAmount();
        if (floatingAmount != null) {
            i11 = iM88779n;
            strM92640e2 = C42180b.m92640e(floatingAmount, null, i11, false, true, false, 0, null, 117, null);
        } else {
            i11 = iM88779n;
            strM92640e2 = null;
        }
        baseTextView7.setText(C42180b.m92647l(strM92640e2));
        BaseTextView baseTextView8 = c42099y.f93345f0;
        BigDecimal floatingAmount2 = strategyItemEntity.getFloatingAmount();
        if (floatingAmount2 == null) {
            floatingAmount2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(floatingAmount2);
        baseTextView8.setTextColor(C22890g.m54282g(context, floatingAmount2, 0, 2, null));
        DashTextView gridProfitTitleTv = c42099y.f93362w;
        Intrinsics.checkNotNullExpressionValue(gridProfitTitleTv, "gridProfitTitleTv");
        C40285b1.m88754w(gridProfitTitleTv);
        BaseTextView baseTextView9 = c42099y.f93363x;
        BigDecimal strategyProfit = strategyItemEntity.getStrategyProfit();
        baseTextView9.setText(C42180b.m92647l(strategyProfit != null ? C42180b.m92640e(strategyProfit, null, i11, false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView10 = c42099y.f93363x;
        BigDecimal strategyProfit2 = strategyItemEntity.getStrategyProfit();
        if (strategyProfit2 == null) {
            strategyProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(strategyProfit2);
        baseTextView10.setTextColor(C22890g.m54282g(context, strategyProfit2, 0, 2, null));
    }

    /* JADX INFO: renamed from: h */
    public static final String m88773h(BigDecimal bigDecimal, int i11) {
        return (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) <= 0) ? "--" : C42180b.m92640e(bigDecimal, null, i11, false, false, false, 0, null, 125, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m88774i(C42099y c42099y, Context context) {
        DashTextView fundsFeeTitleTv = c42099y.f93359t;
        Intrinsics.checkNotNullExpressionValue(fundsFeeTitleTv, "fundsFeeTitleTv");
        FragmentManager childFragmentManager = ViewKt.findFragment(fundsFeeTitleTv).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(c42099y.f93359t.getContext().getString(R$string.funds_fee)).m54156M4(context.getString(R$string.kc_futures_grid_funding)).m54159P4(R$string.i_already_know, null).m54161R4(0).m54162S4(R$string.passkey_list_more, new DialogInterface.OnClickListener() { // from class: j50.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40292f.m88775j(dialogInterface, i11);
            }
        }).show(childFragmentManager, "FundingFee");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final void m88776k(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "view");
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i11);
        }
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: l */
    public static final int m88777l(@NotNull StrategyItemEntity strategyItemEntity) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        return C27039d.m66651k(strategyItemEntity.getPricePrecision(), 8);
    }

    /* JADX INFO: renamed from: m */
    public static final String m88778m(StrategyItemEntity strategyItemEntity) {
        StringBuilder sb2 = new StringBuilder();
        BigDecimal down = strategyItemEntity.getDown();
        sb2.append(C42180b.m92647l(down != null ? C42180b.m92640e(down, null, m88777l(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        sb2.append(" - ");
        BigDecimal up2 = strategyItemEntity.getUp();
        sb2.append(C42180b.m92647l(up2 != null ? C42180b.m92640e(up2, null, m88777l(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: n */
    public static final int m88779n(@NotNull StrategyItemEntity strategyItemEntity) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        return C27039d.m66651k(strategyItemEntity.getProfitPrecision(), 8);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m88780o(@NotNull StrategyItemEntity strategyItemEntity) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        return Intrinsics.areEqual(strategyItemEntity.getStatus(), "WAIT_OPEN_UNIT_PRICE") || (C41014a.m89922G(strategyItemEntity.getOpenUnitPrice(), null, 1, null).compareTo(BigDecimal.ZERO) != 0 && Intrinsics.areEqual(strategyItemEntity.isOpenUnit(), Boolean.FALSE) && Intrinsics.areEqual(strategyItemEntity.getStatus(), "RUNNING"));
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m88781p(@NotNull StrategyItemEntity strategyItemEntity) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        return C41014a.m89922G(strategyItemEntity.getDown(), null, 1, null).compareTo(C41014a.m89922G(strategyItemEntity.getPrice(), null, 1, null)) > 0 || (strategyItemEntity.getUp() != null && strategyItemEntity.getUp().compareTo(C41014a.m89922G(strategyItemEntity.getPrice(), null, 1, null)) < 0);
    }

    /* JADX INFO: renamed from: q */
    public static final void m88782q(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i11 = R$id.tag_rotate_animation;
        if (view.getTag(i11) != null) {
            Object tag = view.getTag(i11);
            ObjectAnimator objectAnimator = tag instanceof ObjectAnimator ? (ObjectAnimator) tag : null;
            if (objectAnimator != null) {
                objectAnimator.start();
                return;
            }
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ROTATION, 0.0f, 360.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        view.setTag(i11, objectAnimatorOfFloat);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: r */
    public static final void m88783r(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(R$id.tag_rotate_animation);
        ObjectAnimator objectAnimator = tag instanceof ObjectAnimator ? (ObjectAnimator) tag : null;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m88775j(DialogInterface dialogInterface, int i11) {
        if (MultiLanguageManager.m56979h()) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C40917g.m89613n(), null, null, null, null, null, null, 126, null);
        } else {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C40917g.m89612m(), null, null, null, null, null, null, 126, null);
        }
    }
}
