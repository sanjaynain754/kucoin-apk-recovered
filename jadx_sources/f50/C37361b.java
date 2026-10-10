package f50;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.resources.C22890g;
import com.kubi.sdk.ItemCallBack;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.model.StrategyListItemModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import l50.C42084n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: f50.b */
/* JADX INFO: compiled from: NotTradingOrderBinding.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/spot/strategyList/binding/NotTradingOrderBinding;", "", "<init>", "()V", "bind", "", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "model", "Lcom/kubi/tradingbotkit/model/StrategyListItemModel;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "changeBackgroundColor", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "color", "", "showInvest", "btradingBotKitStrategyListItemNotTradingOrderLayoutBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitStrategyListItemNotTradingOrderLayoutBinding;", "showProfit", "showSymbolName", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37361b {
    /* JADX INFO: renamed from: c */
    public static final Unit m83990c(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m83991b(@NotNull final RecyclerView.ViewHolder holder, @NotNull final StrategyListItemModel model, @Nullable final ItemCallBack<StrategyListItemModel> itemCallBack) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        C42084n0 c42084n0M92321a = C42084n0.m92321a(holder.itemView);
        Intrinsics.checkNotNullExpressionValue(c42084n0M92321a, "bind(...)");
        m83995g(c42084n0M92321a, model);
        c42084n0M92321a.f93094s.setText(model.getNotTradingOrderPrice());
        c42084n0M92321a.f93086k.setText(model.getRunningTime());
        View viewCenterContentBg = c42084n0M92321a.f93095t;
        Intrinsics.checkNotNullExpressionValue(viewCenterContentBg, "viewCenterContentBg");
        m83992d(viewCenterContentBg, C27039d.m66650j(model.getCenterContentBgColor()));
        m83994f(c42084n0M92321a, model);
        m83993e(c42084n0M92321a, model);
        AppCompatTextView tvLastPriceNumber = c42084n0M92321a.f93084i;
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
        LinearLayout llShutdown = c42084n0M92321a.f93082g;
        Intrinsics.checkNotNullExpressionValue(llShutdown, "llShutdown");
        ViewExtKt.m66575f(llShutdown, new Function1() { // from class: f50.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37361b.m83990c(itemCallBack, holder, model, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m83993e(C42084n0 c42084n0, StrategyListItemModel strategyListItemModel) {
        c42084n0.f93090o.setText(strategyListItemModel.getTotalInvestString());
        c42084n0.f93089n.setText(strategyListItemModel.getTotalInvestNumber());
    }

    /* JADX INFO: renamed from: f */
    public final void m83994f(C42084n0 c42084n0, StrategyListItemModel strategyListItemModel) {
        c42084n0.f93093r.setText(strategyListItemModel.getTotalProfitString());
        c42084n0.f93091p.setText(strategyListItemModel.getTotalProfit());
        c42084n0.f93091p.setTextColor(C27039d.m66650j(strategyListItemModel.getTotalProfitColor()));
        c42084n0.f93092q.setText(strategyListItemModel.getTotalProfitRate());
        c42084n0.f93092q.setTextColor(C27039d.m66650j(strategyListItemModel.getTotalProfitColor()));
    }

    /* JADX INFO: renamed from: g */
    public final void m83995g(C42084n0 c42084n0, StrategyListItemModel strategyListItemModel) {
        c42084n0.f93088m.setText(strategyListItemModel.getSymbolName());
    }

    /* JADX INFO: renamed from: d */
    public final void m83992d(View view, int i11) {
        Drawable background = view.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setColor(i11);
        view.setBackground(gradientDrawable);
    }
}
