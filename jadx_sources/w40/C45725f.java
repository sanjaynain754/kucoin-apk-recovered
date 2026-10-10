package w40;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.resources.C22890g;
import com.kubi.sdk.ItemCallBack;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$mipmap;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.model.FuturesGridRunningItemModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.Locale;
import l50.C42085o;
import o50.C42974h;
import o50.C42978l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: w40.f */
/* JADX INFO: compiled from: NotTradingOrderItemBinding.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/futures/runningList/binding/NotTradingOrderItemBinding;", "", "<init>", "()V", "bind", "", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "d", "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "closeBtInRunning", "btradingBotKitFuturesGridNotTradingOrderBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitFuturesGridNotTradingOrderBinding;", "closeBtInStopping", "changeBackgroundColor", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "color", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45725f {
    /* JADX INFO: renamed from: e */
    public static final Unit m100928e(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, FuturesGridRunningItemModel futuresGridRunningItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), futuresGridRunningItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m100929f(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, FuturesGridRunningItemModel futuresGridRunningItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), futuresGridRunningItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m100930g(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, FuturesGridRunningItemModel futuresGridRunningItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), futuresGridRunningItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m100931d(@NotNull final RecyclerView.ViewHolder holder, @NotNull final FuturesGridRunningItemModel d11, @Nullable final ItemCallBack<FuturesGridRunningItemModel> itemCallBack) {
        String upperCase;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(d11, "d");
        C42085o c42085oM92323a = C42085o.m92323a(holder.itemView);
        Intrinsics.checkNotNullExpressionValue(c42085oM92323a, "bind(...)");
        c42085oM92323a.f93113r.setText(d11.getSymbolName());
        c42085oM92323a.f93111p.setText(d11.getRunningTime());
        TextView ivStrategyType = c42085oM92323a.f93104i;
        Intrinsics.checkNotNullExpressionValue(ivStrategyType, "ivStrategyType");
        m100932h(ivStrategyType, C27039d.m66650j(d11.getDirectionBgColor()));
        c42085oM92323a.f93104i.setText(d11.getDirection());
        c42085oM92323a.f93104i.setVisibility(d11.getDirectionVisible());
        c42085oM92323a.f93109n.setBackground(C22890g.m54288m(C27039d.m66650j(d11.getLeverageBgColor()), 0.0f, 2, null));
        c42085oM92323a.f93109n.setText(d11.getLeverage());
        c42085oM92323a.f93109n.setVisibility(d11.getLeverageVisible());
        c42085oM92323a.f93109n.setTextColor(C27039d.m66650j(d11.getLeverageTextColor()));
        AppCompatTextView tvLastPriceNumber = c42085oM92323a.f93108m;
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
                tvLastPriceNumber.setTextColor(C22890g.m54279d(C27017c.f54310a.m66513b(), C41014a.m89922G(d11.getLastPriceValue(), null, 1, null).subtract(bigDecimalM89922G).doubleValue(), 0, 2, null));
            }
            tvLastPriceNumber.setText(d11.getLastPrice());
            tvLastPriceNumber.setTag(i11, d11.getLastPriceValue());
        }
        View viewCenterContentBg = c42085oM92323a.f93119x;
        Intrinsics.checkNotNullExpressionValue(viewCenterContentBg, "viewCenterContentBg");
        m100932h(viewCenterContentBg, C27039d.m66650j(d11.getCenterContentBgColor()));
        c42085oM92323a.f93114s.setText(d11.getTotalInvest());
        c42085oM92323a.f93115t.setText(d11.getTotalInvestText());
        c42085oM92323a.f93117v.setText(d11.getTotalProfitText());
        c42085oM92323a.f93116u.setText(d11.getTotalProfit());
        LinearLayout llShutdown = c42085oM92323a.f93105j;
        Intrinsics.checkNotNullExpressionValue(llShutdown, "llShutdown");
        ViewExtKt.m66575f(llShutdown, new Function1() { // from class: w40.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45725f.m100928e(itemCallBack, holder, d11, (View) obj);
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
            m100934j(c42085oM92323a);
        } else {
            m100933i(c42085oM92323a);
        }
        c42085oM92323a.f93118w.setText(d11.getNotTradingOrderPrice());
        LinearLayout llShutdown2 = c42085oM92323a.f93105j;
        Intrinsics.checkNotNullExpressionValue(llShutdown2, "llShutdown");
        ViewExtKt.m66575f(llShutdown2, new Function1() { // from class: w40.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45725f.m100929f(itemCallBack, holder, d11, (View) obj);
            }
        });
        ViewExtKt.m66575f(tvLastPriceNumber, new Function1() { // from class: w40.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45725f.m100930g(itemCallBack, holder, d11, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m100933i(C42085o c42085o) {
        AppCompatTextView appCompatTextView = c42085o.f93112q;
        C27017c c27017c = C27017c.f54310a;
        appCompatTextView.setText(C42974h.m94378g(c27017c.m66513b(), R$string.close, null, 2, null));
        c42085o.f93112q.setTextColor(c27017c.m66512a(R$color.c_text60));
        ImageView ivShutdown = c42085o.f93103h;
        Intrinsics.checkNotNullExpressionValue(ivShutdown, "ivShutdown");
        C27046k.m66701p(ivShutdown, c27017c.m66512a(R$color.c_text40));
        int i11 = R$mipmap.kucoin_icon_strategy_shutdown;
        ivShutdown.setImageResource(i11);
        ivShutdown.setTag(Integer.valueOf(i11));
        C42978l.m94385a(ivShutdown);
    }

    /* JADX INFO: renamed from: j */
    public final void m100934j(C42085o c42085o) {
        c42085o.f93105j.setClickable(false);
        C27017c c27017c = C27017c.f54310a;
        int iM66512a = c27017c.m66512a(R$color.c_text60);
        c42085o.f93112q.setText(c27017c.m66516f(R$string.kc_tb_grid_action_close, new Object[0]));
        c42085o.f93112q.setTextColor(iM66512a);
        ImageView ivShutdown = c42085o.f93103h;
        Intrinsics.checkNotNullExpressionValue(ivShutdown, "ivShutdown");
        ivShutdown.clearColorFilter();
        int i11 = R$mipmap.kucoin_icon_strategy_stopping;
        ivShutdown.setImageResource(i11);
        ivShutdown.setTag(Integer.valueOf(i11));
        C42978l.m94386b(ivShutdown, -1, 500L, new LinearInterpolator());
    }

    /* JADX INFO: renamed from: h */
    public final void m100932h(View view, int i11) {
        Drawable background = view.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setColor(i11);
        view.setBackground(gradientDrawable);
    }
}
