package w40;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.sdk.ItemCallBack;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$mipmap;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.model.FuturesGridRunningItemModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27018c0;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.Locale;
import k50.C40911a;
import l50.C42087p;
import nf.C42828b;
import o50.C42974h;
import o50.C42975i;
import o50.C42976j;
import o50.C42978l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: w40.p */
/* JADX INFO: compiled from: RunningItemBinding.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\tH\u0002¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/futures/runningList/binding/RunningItemBinding;", "", "<init>", "()V", "bind", "", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "d", "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "closeBtInRunning", "btradingBotKitFuturesGridRunningItemBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitFuturesGridRunningItemBinding;", "closeBtInStopping", "changeBackgroundColor", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "color", "", "showCouponReward", "model", "generateRewardSizeShowing", "Lcom/kubi/utils/StyledText;", "openH5Detail", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45735p {
    /* JADX INFO: renamed from: k */
    public static final Unit m100944k(C45735p c45735p, FuturesGridRunningItemModel futuresGridRunningItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c45735p.m100958x(futuresGridRunningItemModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m100945l(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, FuturesGridRunningItemModel futuresGridRunningItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), futuresGridRunningItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final void m100946m(ItemCallBack itemCallBack, C42087p c42087p, RecyclerView.ViewHolder viewHolder, FuturesGridRunningItemModel futuresGridRunningItemModel, View view) {
        if (itemCallBack != null) {
            BaseTextView tvFuturesGridProtectionTip = c42087p.f93125B;
            Intrinsics.checkNotNullExpressionValue(tvFuturesGridProtectionTip, "tvFuturesGridProtectionTip");
            itemCallBack.mo24515a(tvFuturesGridProtectionTip, viewHolder.getAdapterPosition(), futuresGridRunningItemModel);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m100947n(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, FuturesGridRunningItemModel futuresGridRunningItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), futuresGridRunningItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m100948o(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, FuturesGridRunningItemModel futuresGridRunningItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), futuresGridRunningItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m100949p(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, FuturesGridRunningItemModel futuresGridRunningItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), futuresGridRunningItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m100950q(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, FuturesGridRunningItemModel futuresGridRunningItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), futuresGridRunningItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m100951r(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, FuturesGridRunningItemModel futuresGridRunningItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), futuresGridRunningItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m100952s(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, FuturesGridRunningItemModel futuresGridRunningItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), futuresGridRunningItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public final void m100953j(@NotNull final RecyclerView.ViewHolder holder, @NotNull final FuturesGridRunningItemModel d11, @Nullable final ItemCallBack<FuturesGridRunningItemModel> itemCallBack) {
        String upperCase;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(d11, "d");
        final C42087p c42087pM92327a = C42087p.m92327a(holder.itemView);
        Intrinsics.checkNotNullExpressionValue(c42087pM92327a, "bind(...)");
        c42087pM92327a.f93143T.setText(d11.getSymbolName());
        c42087pM92327a.f93140Q.setText(d11.getRunningTime());
        BaseTextView ivStrategyType = c42087pM92327a.f93161l;
        Intrinsics.checkNotNullExpressionValue(ivStrategyType, "ivStrategyType");
        m100954t(ivStrategyType, C27039d.m66650j(d11.getDirectionBgColor()));
        c42087pM92327a.f93161l.setText(d11.getDirection());
        c42087pM92327a.f93161l.setVisibility(d11.getDirectionVisible());
        c42087pM92327a.f93130G.setBackground(C22890g.m54288m(C27039d.m66650j(d11.getLeverageBgColor()), 0.0f, 2, null));
        c42087pM92327a.f93130G.setText(d11.getLeverage());
        c42087pM92327a.f93130G.setVisibility(d11.getLeverageVisible());
        c42087pM92327a.f93130G.setTextColor(C27039d.m66650j(d11.getLeverageTextColor()));
        BaseTextView tvLastPriceNumber = c42087pM92327a.f93129F;
        Intrinsics.checkNotNullExpressionValue(tvLastPriceNumber, "tvLastPriceNumber");
        tvLastPriceNumber.setTag(d11.getSymbolCode());
        tvLastPriceNumber.setVisibility(d11.getLastPriceVisible());
        if (Intrinsics.areEqual(tvLastPriceNumber.getTag(), d11.getSymbolCode())) {
            String string = tvLastPriceNumber.getText().toString();
            String strM66668h = C27041f.m66668h(d11.getLastPrice());
            int i11 = R$id.bind_num;
            Object tag = tvLastPriceNumber.getTag(i11);
            BigDecimal bigDecimalM89922G = C41014a.m89922G(tag instanceof BigDecimal ? (BigDecimal) tag : null, null, 1, null);
            if (string.length() <= 0 || strM66668h.length() <= 0) {
                tvLastPriceNumber.setTextColor(C22890g.m54291p(C27017c.f54310a.m66513b()));
            } else {
                BigDecimal bigDecimalSubtract = C41014a.m89922G(d11.getLastPriceValue(), null, 1, null).subtract(bigDecimalM89922G);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                tvLastPriceNumber.setTextColor(C22890g.m54279d(C27017c.f54310a.m66513b(), bigDecimalSubtract.doubleValue(), 0, 2, null));
            }
            tvLastPriceNumber.setText(d11.getLastPrice());
            tvLastPriceNumber.setTag(i11, d11.getLastPriceValue());
        }
        c42087pM92327a.f93131H.setText(d11.getLiquidationPrice());
        View viewCenterContentBg = c42087pM92327a.f93149Z;
        Intrinsics.checkNotNullExpressionValue(viewCenterContentBg, "viewCenterContentBg");
        m100954t(viewCenterContentBg, C27039d.m66650j(d11.getCenterContentBgColor()));
        c42087pM92327a.f93145V.setText(d11.getTotalInvestText());
        c42087pM92327a.f93144U.setText(d11.getTotalInvest());
        c42087pM92327a.f93148Y.setText(d11.getTotalProfitText());
        c42087pM92327a.f93146W.setText(C42828b.m93911l(d11.getTotalProfit()));
        c42087pM92327a.f93146W.setTextColor(C27039d.m66650j(d11.getTotalProfitColor()));
        c42087pM92327a.f93147X.setText(d11.getTotalProfitRate());
        c42087pM92327a.f93147X.setTextColor(C27039d.m66650j(d11.getTotalProfitColor()));
        c42087pM92327a.f93169t.setText(d11.getArbitrage());
        c42087pM92327a.f93126C.setText(d11.getGridProfit());
        c42087pM92327a.f93173x.setText(C42828b.m93911l(d11.getFloatAmount()));
        c42087pM92327a.f93175z.setText(d11.getFundingFee());
        c42087pM92327a.f93171v.setText(d11.getEntryPrice());
        c42087pM92327a.f93133J.setText(d11.getPriceRange());
        c42087pM92327a.f93133J.setTextColor(C27039d.m66650j(d11.getPriceRangeColor()));
        c42087pM92327a.f93166q.setVisibility(d11.getOutPriceRange());
        c42087pM92327a.f93135L.setText(d11.getBuyNumber());
        c42087pM92327a.f93136M.setText(d11.getSellNumber());
        c42087pM92327a.f93136M.setTextColor(d11.getPendingOrderNumberSellColor());
        c42087pM92327a.f93135L.setTextColor(d11.getPendingOrderNumberBuyColor());
        LinearLayout llDetail = c42087pM92327a.f93162m;
        Intrinsics.checkNotNullExpressionValue(llDetail, "llDetail");
        ViewExtKt.m66575f(llDetail, new Function1() { // from class: w40.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45735p.m100944k(this.f103111b, d11, (View) obj);
            }
        });
        m100959y(d11, c42087pM92327a);
        LinearLayout llShutdown = c42087pM92327a.f93164o;
        Intrinsics.checkNotNullExpressionValue(llShutdown, "llShutdown");
        ViewExtKt.m66575f(llShutdown, new Function1() { // from class: w40.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45735p.m100945l(itemCallBack, holder, d11, (View) obj);
            }
        });
        String runningStatus = d11.getRunningStatus();
        if (runningStatus != null) {
            upperCase = runningStatus.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (StringsKt.equals$default(upperCase, "STOPPING", false, 2, null)) {
            m100956v(c42087pM92327a);
        } else {
            m100955u(c42087pM92327a);
        }
        if (d11.getRiskLimitTimeValue() != null) {
            String strM66668h2 = C27041f.m66668h(d11.getFuturesGridProtectionTip());
            String strM66516f = C27017c.f54310a.m66516f(R$string.scan_detail, new Object[0]);
            int i12 = R$color.primary;
            C27096v0 c27096v0 = new C27096v0();
            c27096v0.append(t0.a(strM66668h2, strM66516f).toString());
            c27096v0.setSpan(new C27018c0(i12, new View.OnClickListener() { // from class: w40.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C45735p.m100946m(itemCallBack, c42087pM92327a, holder, d11, view);
                }
            }), StringsKt.indexOf$default((CharSequence) c27096v0, strM66516f, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) c27096v0, strM66516f, 0, false, 6, (Object) null) + strM66516f.length(), 18);
            c42087pM92327a.f93125B.setMovementMethod(LinkMovementMethod.getInstance());
            c42087pM92327a.f93125B.setText(c27096v0);
            BaseTextView tvFuturesGridProtectionTip = c42087pM92327a.f93125B;
            Intrinsics.checkNotNullExpressionValue(tvFuturesGridProtectionTip, "tvFuturesGridProtectionTip");
            ViewExtKt.m66594y(tvFuturesGridProtectionTip);
        } else {
            BaseTextView tvFuturesGridProtectionTip2 = c42087pM92327a.f93125B;
            Intrinsics.checkNotNullExpressionValue(tvFuturesGridProtectionTip2, "tvFuturesGridProtectionTip");
            ViewExtKt.m66577h(tvFuturesGridProtectionTip2);
        }
        DashTextView tvFloatAmountText = c42087pM92327a.f93174y;
        Intrinsics.checkNotNullExpressionValue(tvFloatAmountText, "tvFloatAmountText");
        ViewExtKt.m66575f(tvFloatAmountText, new Function1() { // from class: w40.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45735p.m100947n(itemCallBack, holder, d11, (View) obj);
            }
        });
        DashTextView tvIncomeText = c42087pM92327a.f93127D;
        Intrinsics.checkNotNullExpressionValue(tvIncomeText, "tvIncomeText");
        ViewExtKt.m66575f(tvIncomeText, new Function1() { // from class: w40.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45735p.m100948o(itemCallBack, holder, d11, (View) obj);
            }
        });
        DashTextView tvFundingRateText = c42087pM92327a.f93124A;
        Intrinsics.checkNotNullExpressionValue(tvFundingRateText, "tvFundingRateText");
        ViewExtKt.m66575f(tvFundingRateText, new Function1() { // from class: w40.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45735p.m100949p(itemCallBack, holder, d11, (View) obj);
            }
        });
        DashTextView tvOrderSectionText = c42087pM92327a.f93134K;
        Intrinsics.checkNotNullExpressionValue(tvOrderSectionText, "tvOrderSectionText");
        ViewExtKt.m66575f(tvOrderSectionText, new Function1() { // from class: w40.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45735p.m100950q(itemCallBack, holder, d11, (View) obj);
            }
        });
        ViewExtKt.m66575f(tvLastPriceNumber, new Function1() { // from class: w40.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45735p.m100951r(itemCallBack, holder, d11, (View) obj);
            }
        });
        BaseTextView tvIncrement = c42087pM92327a.f93128E;
        Intrinsics.checkNotNullExpressionValue(tvIncrement, "tvIncrement");
        ViewExtKt.m66575f(tvIncrement, new Function1() { // from class: w40.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45735p.m100952s(itemCallBack, holder, d11, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m100955u(C42087p c42087p) {
        BaseTextView baseTextView = c42087p.f93142S;
        C27017c c27017c = C27017c.f54310a;
        baseTextView.setText(C42974h.m94378g(c27017c.m66513b(), R$string.close, null, 2, null));
        c42087p.f93142S.setTextColor(c27017c.m66512a(R$color.c_text60));
        ImageView ivShutdown = c42087p.f93159j;
        Intrinsics.checkNotNullExpressionValue(ivShutdown, "ivShutdown");
        ViewExtKt.m66577h(ivShutdown);
        C27046k.m66701p(ivShutdown, c27017c.m66512a(R$color.c_text40));
        int i11 = R$mipmap.kucoin_icon_strategy_shutdown;
        ivShutdown.setImageResource(i11);
        ivShutdown.setTag(Integer.valueOf(i11));
        C42978l.m94385a(ivShutdown);
    }

    /* JADX INFO: renamed from: v */
    public final void m100956v(C42087p c42087p) {
        c42087p.f93164o.setClickable(false);
        C27017c c27017c = C27017c.f54310a;
        int iM66512a = c27017c.m66512a(R$color.c_text60);
        c42087p.f93142S.setText(c27017c.m66516f(R$string.kc_tb_grid_action_close, new Object[0]));
        c42087p.f93142S.setTextColor(iM66512a);
        ImageView ivShutdown = c42087p.f93159j;
        Intrinsics.checkNotNullExpressionValue(ivShutdown, "ivShutdown");
        ViewExtKt.m66594y(ivShutdown);
        ivShutdown.clearColorFilter();
        int i11 = R$mipmap.kucoin_icon_strategy_stopping;
        ivShutdown.setImageResource(i11);
        ivShutdown.setTag(Integer.valueOf(i11));
        C42978l.m94386b(ivShutdown, -1, 500L, new LinearInterpolator());
    }

    /* JADX INFO: renamed from: x */
    public final void m100958x(FuturesGridRunningItemModel futuresGridRunningItemModel) {
        C40911a.m89599c("/running/detail/" + futuresGridRunningItemModel.getTaskId(), "&symbol=" + futuresGridRunningItemModel.getSymbolCode() + "&mode=" + futuresGridRunningItemModel.getRunningStatus() + "&type=3", false, 4, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m100954t(View view, int i11) {
        Drawable background = view.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setColor(i11);
        view.setBackground(gradientDrawable);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    /* JADX INFO: renamed from: w */
    public final C27096v0 m100957w(FuturesGridRunningItemModel futuresGridRunningItemModel) {
        BigDecimal maxReward;
        String str;
        BigDecimal rewardSize;
        int iM66651k = C27039d.m66651k(futuresGridRunningItemModel.getProfitPrecision(), 8);
        FuturesGridRunningItemModel.CouponReward couponReward = futuresGridRunningItemModel.getCouponReward();
        String currency = null;
        if (couponReward != null) {
            maxReward = couponReward.getMaxReward();
        } else {
            maxReward = null;
        }
        if (maxReward != null) {
            BigDecimal bigDecimalM89921F = C41014a.m89921F(couponReward.getMaxReward(), "0");
            if (bigDecimalM89921F.compareTo(BigDecimal.ZERO) != 0) {
                str = " / " + C42180b.m92640e(bigDecimalM89921F, null, iM66651k, false, false, false, 0, null, 125, null);
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        String str2 = str;
        if (couponReward != null) {
            rewardSize = couponReward.getRewardSize();
        } else {
            rewardSize = null;
        }
        CharSequence charSequenceA = t0.a(C42180b.m92640e(C41014a.m89922G(rewardSize, null, 1, null), null, iM66651k, false, false, false, 0, null, 125, null), str2);
        FuturesGridRunningItemModel.CouponReward couponReward2 = futuresGridRunningItemModel.getCouponReward();
        if (couponReward2 != null) {
            currency = couponReward2.getCurrency();
        }
        String string = t0.a(charSequenceA, C27041f.m66668h(currency)).toString();
        String strM66516f = C27017c.f54310a.m66516f(R$string.kc_tb_coupon_economize, string);
        C27096v0 c27096v0 = new C27096v0();
        c27096v0.append(strM66516f);
        C42975i.m94380a(c27096v0, string, R$color.primary);
        return c27096v0;
    }

    /* JADX INFO: renamed from: y */
    public final void m100959y(FuturesGridRunningItemModel futuresGridRunningItemModel, C42087p c42087p) {
        String strM94383b;
        Long expiredTime;
        if (futuresGridRunningItemModel.getCouponReward() != null) {
            Group groupCoupons = c42087p.f93156g;
            Intrinsics.checkNotNullExpressionValue(groupCoupons, "groupCoupons");
            ViewExtKt.m66594y(groupCoupons);
        } else {
            Group groupCoupons2 = c42087p.f93156g;
            Intrinsics.checkNotNullExpressionValue(groupCoupons2, "groupCoupons");
            ViewExtKt.m66577h(groupCoupons2);
        }
        c42087p.f93141R.setText(m100957w(futuresGridRunningItemModel));
        BaseTextView baseTextView = c42087p.f93139P;
        FuturesGridRunningItemModel.CouponReward couponReward = futuresGridRunningItemModel.getCouponReward();
        if (couponReward != null && (expiredTime = couponReward.getExpiredTime()) != null) {
            strM94383b = C42976j.m94383b(expiredTime.longValue());
        } else {
            strM94383b = null;
        }
        baseTextView.setText(strM94383b);
    }
}
