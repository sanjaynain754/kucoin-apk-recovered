package f50;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.DashTextView;
import com.kubi.sdk.ItemCallBack;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$mipmap;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.model.StrategyListItemModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import g50.C37815a;
import java.math.BigDecimal;
import java.util.Locale;
import l50.C42088p0;
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

/* JADX INFO: renamed from: f50.q */
/* JADX INFO: compiled from: StrategyListRunningBinding.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/spot/strategyList/binding/StrategyListRunningBinding;", "", "<init>", "()V", "bind", "", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "model", "Lcom/kubi/tradingbotkit/model/StrategyListItemModel;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "changeBackgroundColor", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "color", "", "closeBtInRunning", "btradingBotKitStrategyListItemRunningLayoutBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitStrategyListItemRunningLayoutBinding;", "closeBtInStopping", "showCouponReward", "generateRewardSizeShowingText", "Lcom/kubi/utils/StyledText;", "showInvest", "showProfit", "showSymbolName", "showOutPriceRange", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37376q {
    /* JADX INFO: renamed from: n */
    public static final Unit m84012n(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m84013o(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m84014p(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m84015q(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m84016r(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m84017s(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m84018t(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m84019u(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m84020v(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m84021w(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m84022x(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m84023y(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m84024A(C42088p0 c42088p0) {
        AppCompatTextView appCompatTextView = c42088p0.f93190O;
        C27017c c27017c = C27017c.f54310a;
        appCompatTextView.setText(C42974h.m94378g(c27017c.m66513b(), R$string.close, null, 2, null));
        c42088p0.f93190O.setTextColor(c27017c.m66512a(R$color.c_text60));
        AppCompatImageView ivShutdown = c42088p0.f93208k;
        Intrinsics.checkNotNullExpressionValue(ivShutdown, "ivShutdown");
        ViewExtKt.m66577h(ivShutdown);
        C27046k.m66701p(ivShutdown, c27017c.m66512a(R$color.c_text40));
        int i11 = R$mipmap.kucoin_icon_strategy_shutdown;
        ivShutdown.setImageResource(i11);
        ivShutdown.setTag(Integer.valueOf(i11));
        C42978l.m94385a(ivShutdown);
    }

    /* JADX INFO: renamed from: B */
    public final void m84025B(C42088p0 c42088p0) {
        c42088p0.f93213p.setClickable(false);
        C27017c c27017c = C27017c.f54310a;
        int iM66512a = c27017c.m66512a(R$color.c_text60);
        c42088p0.f93190O.setText(c27017c.m66516f(R$string.kc_tb_grid_action_close, new Object[0]));
        c42088p0.f93190O.setTextColor(iM66512a);
        AppCompatImageView ivShutdown = c42088p0.f93208k;
        Intrinsics.checkNotNullExpressionValue(ivShutdown, "ivShutdown");
        ViewExtKt.m66594y(ivShutdown);
        ivShutdown.clearColorFilter();
        int i11 = R$mipmap.kucoin_icon_strategy_stopping;
        ivShutdown.setImageResource(i11);
        ivShutdown.setTag(Integer.valueOf(i11));
        C42978l.m94386b(ivShutdown, -1, 500L, new LinearInterpolator());
    }

    /* JADX INFO: renamed from: E */
    public final void m84028E(C42088p0 c42088p0, StrategyListItemModel strategyListItemModel) {
        c42088p0.f93193R.setText(strategyListItemModel.getTotalInvestString());
        c42088p0.f93192Q.setText(strategyListItemModel.getTotalInvestNumber());
    }

    /* JADX INFO: renamed from: F */
    public final void m84029F(C42088p0 c42088p0, StrategyListItemModel strategyListItemModel) {
        c42088p0.f93215r.setVisibility(strategyListItemModel.getOutPriceRangeVisible());
        c42088p0.f93181F.setTextColor(C27039d.m66650j(strategyListItemModel.getPriceRangeTextColor()));
    }

    /* JADX INFO: renamed from: G */
    public final void m84030G(C42088p0 c42088p0, StrategyListItemModel strategyListItemModel) {
        c42088p0.f93196U.setText(strategyListItemModel.getTotalProfitString());
        c42088p0.f93194S.setText(C42828b.m93911l(strategyListItemModel.getTotalProfit()));
        c42088p0.f93194S.setTextColor(C27039d.m66650j(strategyListItemModel.getTotalProfitColor()));
        c42088p0.f93195T.setText(strategyListItemModel.getTotalProfitRate());
        c42088p0.f93195T.setTextColor(C27039d.m66650j(strategyListItemModel.getTotalProfitColor()));
    }

    /* JADX INFO: renamed from: H */
    public final void m84031H(C42088p0 c42088p0, StrategyListItemModel strategyListItemModel) {
        c42088p0.f93191P.setText(strategyListItemModel.getSymbolName());
    }

    /* JADX INFO: renamed from: m */
    public final void m84032m(@NotNull final RecyclerView.ViewHolder holder, @NotNull final StrategyListItemModel model, @Nullable final ItemCallBack<StrategyListItemModel> itemCallBack) {
        String upperCase;
        String upperCase2;
        String upperCase3;
        String breakEvenPriceValue;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        C42088p0 c42088p0M92329a = C42088p0.m92329a(holder.itemView);
        Intrinsics.checkNotNullExpressionValue(c42088p0M92329a, "bind(...)");
        m84031H(c42088p0M92329a, model);
        c42088p0M92329a.f93188M.setText(model.getRunningTime());
        c42088p0M92329a.f93217t.setText(model.getArbitrage());
        c42088p0M92329a.f93178C.setText(model.getStrategyProfit());
        c42088p0M92329a.f93181F.setText(model.getOrderPriceRange());
        c42088p0M92329a.f93184I.setTextColor(model.getPendingOrderNumberSellColor());
        c42088p0M92329a.f93183H.setTextColor(model.getPendingOrderNumberBuyColor());
        c42088p0M92329a.f93184I.setText(model.getSellNum());
        c42088p0M92329a.f93183H.setText(model.getBuyNum());
        c42088p0M92329a.f93222y.setText(C42828b.m93911l(model.getFloatingAmount()));
        c42088p0M92329a.f93218u.setText(model.getBreakEvenPriceShow());
        if (!Intrinsics.areEqual(C27041f.m66669i(model.getBreakEvenPriceShow(), "- -"), "- -") || (breakEvenPriceValue = model.getBreakEvenPriceValue()) == null || breakEvenPriceValue.length() == 0) {
            AppCompatTextView tvBreakevenNumber = c42088p0M92329a.f93218u;
            Intrinsics.checkNotNullExpressionValue(tvBreakevenNumber, "tvBreakevenNumber");
            ViewExtKt.m66575f(tvBreakevenNumber, new Function1() { // from class: f50.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C37376q.m84013o((View) obj);
                }
            });
            AppCompatTextView tvBreakevenNumber2 = c42088p0M92329a.f93218u;
            Intrinsics.checkNotNullExpressionValue(tvBreakevenNumber2, "tvBreakevenNumber");
            C27046k.m66694i(tvBreakevenNumber2, 0, 0, GravityCompat.START, 2, null);
        } else {
            AppCompatTextView tvBreakevenNumber3 = c42088p0M92329a.f93218u;
            Intrinsics.checkNotNullExpressionValue(tvBreakevenNumber3, "tvBreakevenNumber");
            C27046k.m66693h(tvBreakevenNumber3, R$mipmap.kucoin_icon_info, C5275i0.m6236a(5.0f), GravityCompat.START);
            AppCompatTextView tvBreakevenNumber4 = c42088p0M92329a.f93218u;
            Intrinsics.checkNotNullExpressionValue(tvBreakevenNumber4, "tvBreakevenNumber");
            ViewExtKt.m66575f(tvBreakevenNumber4, new Function1() { // from class: f50.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C37376q.m84012n(itemCallBack, holder, model, (View) obj);
                }
            });
        }
        AppCompatTextView tvLastPriceNumber = c42088p0M92329a.f93180E;
        Intrinsics.checkNotNullExpressionValue(tvLastPriceNumber, "tvLastPriceNumber");
        tvLastPriceNumber.setTag(model.getSymbolCode());
        tvLastPriceNumber.setVisibility(model.getLastPriceVisible());
        if (Intrinsics.areEqual(tvLastPriceNumber.getTag(), model.getSymbolCode())) {
            String string = tvLastPriceNumber.getText().toString();
            String strM66668h = C27041f.m66668h(model.getLastPrice());
            int i11 = R$id.bind_num;
            Object tag = tvLastPriceNumber.getTag(i11);
            BigDecimal bigDecimalM89922G = C41014a.m89922G(tag instanceof BigDecimal ? (BigDecimal) tag : null, null, 1, null);
            if (string.length() <= 0 || strM66668h.length() <= 0) {
                tvLastPriceNumber.setTextColor(C22890g.m54291p(C27017c.f54310a.m66513b()));
            } else {
                BigDecimal bigDecimalSubtract = C41014a.m89922G(model.getLastPriceValue(), null, 1, null).subtract(bigDecimalM89922G);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                tvLastPriceNumber.setTextColor(C22890g.m54279d(C27017c.f54310a.m66513b(), bigDecimalSubtract.doubleValue(), 0, 2, null));
            }
            BigDecimal lastPriceValue = model.getLastPriceValue();
            if (lastPriceValue == null || lastPriceValue.compareTo(BigDecimal.ZERO) != 0) {
                tvLastPriceNumber.setText(model.getLastPrice());
            } else {
                tvLastPriceNumber.setText(string);
            }
            tvLastPriceNumber.setTag(i11, model.getLastPriceValue());
        }
        c42088p0M92329a.f93176A.setText(model.getYearProfitRate());
        View viewCenterContentBg = c42088p0M92329a.f93197V;
        Intrinsics.checkNotNullExpressionValue(viewCenterContentBg, "viewCenterContentBg");
        m84033z(viewCenterContentBg, C27039d.m66650j(model.getCenterContentBgColor()));
        m84030G(c42088p0M92329a, model);
        m84028E(c42088p0M92329a, model);
        m84029F(c42088p0M92329a, model);
        m84027D(model, c42088p0M92329a);
        String runningStatus = model.getRunningStatus();
        if (runningStatus != null) {
            upperCase = runningStatus.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (StringsKt.equals$default(upperCase, "STOPPING", false, 2, null)) {
            m84025B(c42088p0M92329a);
        } else {
            m84024A(c42088p0M92329a);
        }
        LinearLayout llDetail = c42088p0M92329a.f93210m;
        Intrinsics.checkNotNullExpressionValue(llDetail, "llDetail");
        ViewExtKt.m66575f(llDetail, new Function1() { // from class: f50.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37376q.m84016r(itemCallBack, holder, model, (View) obj);
            }
        });
        DashTextView tvIncomeText = c42088p0M92329a.f93179D;
        Intrinsics.checkNotNullExpressionValue(tvIncomeText, "tvIncomeText");
        ViewExtKt.m66575f(tvIncomeText, new Function1() { // from class: f50.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37376q.m84017s(itemCallBack, holder, model, (View) obj);
            }
        });
        DashTextView tvFloatAmountText = c42088p0M92329a.f93223z;
        Intrinsics.checkNotNullExpressionValue(tvFloatAmountText, "tvFloatAmountText");
        ViewExtKt.m66575f(tvFloatAmountText, new Function1() { // from class: f50.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37376q.m84018t(itemCallBack, holder, model, (View) obj);
            }
        });
        ViewExtKt.m66575f(tvLastPriceNumber, new Function1() { // from class: f50.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37376q.m84019u(itemCallBack, holder, model, (View) obj);
            }
        });
        DashTextView tvOrderSectionText = c42088p0M92329a.f93182G;
        Intrinsics.checkNotNullExpressionValue(tvOrderSectionText, "tvOrderSectionText");
        ViewExtKt.m66575f(tvOrderSectionText, new Function1() { // from class: f50.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37376q.m84020v(itemCallBack, holder, model, (View) obj);
            }
        });
        AppCompatImageView outPriceRange = c42088p0M92329a.f93215r;
        Intrinsics.checkNotNullExpressionValue(outPriceRange, "outPriceRange");
        ViewExtKt.m66575f(outPriceRange, new Function1() { // from class: f50.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37376q.m84021w(itemCallBack, holder, model, (View) obj);
            }
        });
        ImageView ivStrategyCoupons = c42088p0M92329a.f93209l;
        Intrinsics.checkNotNullExpressionValue(ivStrategyCoupons, "ivStrategyCoupons");
        ViewExtKt.m66575f(ivStrategyCoupons, new Function1() { // from class: f50.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37376q.m84022x(itemCallBack, holder, model, (View) obj);
            }
        });
        LinearLayout llShutdown = c42088p0M92329a.f93213p;
        Intrinsics.checkNotNullExpressionValue(llShutdown, "llShutdown");
        ViewExtKt.m66575f(llShutdown, new Function1() { // from class: f50.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37376q.m84023y(itemCallBack, holder, model, (View) obj);
            }
        });
        LinearLayout llEditPriceRange = c42088p0M92329a.f93211n;
        Intrinsics.checkNotNullExpressionValue(llEditPriceRange, "llEditPriceRange");
        ViewExtKt.m66575f(llEditPriceRange, new Function1() { // from class: f50.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37376q.m84014p(itemCallBack, holder, model, (View) obj);
            }
        });
        DashTextView tvBreakevenText = c42088p0M92329a.f93219v;
        Intrinsics.checkNotNullExpressionValue(tvBreakevenText, "tvBreakevenText");
        ViewExtKt.m66575f(tvBreakevenText, new Function1() { // from class: f50.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37376q.m84015q(itemCallBack, holder, model, (View) obj);
            }
        });
        LinearLayout linearLayout = c42088p0M92329a.f93211n;
        String runningStatus2 = model.getRunningStatus();
        if (runningStatus2 != null) {
            upperCase2 = runningStatus2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        } else {
            upperCase2 = null;
        }
        linearLayout.setClickable(!StringsKt.equals$default(upperCase2, "STOPPING", false, 2, null));
        LinearLayout linearLayout2 = c42088p0M92329a.f93213p;
        String runningStatus3 = model.getRunningStatus();
        if (runningStatus3 != null) {
            upperCase3 = runningStatus3.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
        } else {
            upperCase3 = null;
        }
        linearLayout2.setClickable(!StringsKt.equals$default(upperCase3, "STOPPING", false, 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004b  */
    /* JADX INFO: renamed from: C */
    public final C27096v0 m84026C(StrategyListItemModel strategyListItemModel) {
        BigDecimal maxReward;
        String str;
        String strM92640e;
        BigDecimal rewardSize;
        StrategyListItemModel.CouponReward couponReward = strategyListItemModel.getCouponReward();
        String currency = null;
        if (couponReward != null) {
            maxReward = couponReward.getMaxReward();
        } else {
            maxReward = null;
        }
        if (maxReward != null) {
            BigDecimal bigDecimalM89922G = C41014a.m89922G(couponReward.getMaxReward(), null, 1, null);
            if (bigDecimalM89922G.compareTo(BigDecimal.ZERO) != 0) {
                str = " / " + C42180b.m92640e(bigDecimalM89922G, null, C37815a.m85333b(C27041f.m66668h(strategyListItemModel.getSymbolCode())), false, false, false, 0, null, 125, null);
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        StrategyListItemModel.CouponReward couponReward2 = strategyListItemModel.getCouponReward();
        if (couponReward2 != null && (rewardSize = couponReward2.getRewardSize()) != null) {
            strM92640e = C42180b.m92640e(rewardSize, null, C37815a.m85333b(C27041f.m66668h(strategyListItemModel.getSymbolCode())), false, false, false, 0, null, 125, null);
        } else {
            strM92640e = null;
        }
        sb2.append(C42180b.m92647l(strM92640e));
        sb2.append(str);
        StrategyListItemModel.CouponReward couponReward3 = strategyListItemModel.getCouponReward();
        if (couponReward3 != null) {
            currency = couponReward3.getCurrency();
        }
        sb2.append(C27041f.m66668h(currency));
        String string = sb2.toString();
        String strM66516f = C27017c.f54310a.m66516f(R$string.kc_tb_coupon_economize, string);
        C27096v0 c27096v0 = new C27096v0();
        c27096v0.append(strM66516f);
        C42975i.m94380a(c27096v0, string, R$color.primary);
        return c27096v0;
    }

    /* JADX INFO: renamed from: D */
    public final void m84027D(StrategyListItemModel strategyListItemModel, C42088p0 c42088p0) {
        String strM94383b;
        Long expiredTime;
        if (strategyListItemModel.getCouponReward() != null) {
            Group groupCoupons = c42088p0.f93203f;
            Intrinsics.checkNotNullExpressionValue(groupCoupons, "groupCoupons");
            ViewExtKt.m66594y(groupCoupons);
        } else {
            Group groupCoupons2 = c42088p0.f93203f;
            Intrinsics.checkNotNullExpressionValue(groupCoupons2, "groupCoupons");
            ViewExtKt.m66577h(groupCoupons2);
        }
        c42088p0.f93189N.setText(m84026C(strategyListItemModel));
        TextView textView = c42088p0.f93187L;
        StrategyListItemModel.CouponReward couponReward = strategyListItemModel.getCouponReward();
        if (couponReward != null && (expiredTime = couponReward.getExpiredTime()) != null) {
            strM94383b = C42976j.m94383b(expiredTime.longValue());
        } else {
            strM94383b = null;
        }
        textView.setText(strM94383b);
    }

    /* JADX INFO: renamed from: z */
    public final void m84033z(View view, int i11) {
        Drawable background = view.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setColor(i11);
        view.setBackground(gradientDrawable);
    }
}
