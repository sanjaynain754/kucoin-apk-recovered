package f50;

import android.text.SpannableString;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.sdk.ItemCallBack;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$drawable;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.model.StrategyListItemModel;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import g50.C37815a;
import java.math.BigDecimal;
import java.util.List;
import l50.C42090q0;
import o50.C42973g;
import o50.C42974h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: f50.t */
/* JADX INFO: compiled from: StrategyListStopReasonBinding.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/spot/strategyList/binding/StrategyListStopReasonBinding;", "", "<init>", "()V", "bind", "", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "model", "Lcom/kubi/tradingbotkit/model/StrategyListItemModel;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "getReturnBalanceDesc", "Landroid/text/SpannableString;", "showInvest", "btradingBotKitStrategyListItemStopReasonLayoutBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitStrategyListItemStopReasonLayoutBinding;", "showProfit", "clickShowDetail", "showSymbolName", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStrategyListStopReasonBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrategyListStopReasonBinding.kt\ncom/kubi/tradingbotkit/business/spot/strategyList/binding/StrategyListStopReasonBinding\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1869#2,2:178\n*S KotlinDebug\n*F\n+ 1 StrategyListStopReasonBinding.kt\ncom/kubi/tradingbotkit/business/spot/strategyList/binding/StrategyListStopReasonBinding\n*L\n68#1:178,2\n*E\n"})
public final class C37379t {
    /* JADX INFO: renamed from: d */
    public static final Unit m84036d(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m84037f(C42090q0 c42090q0, AppCompatTextView appCompatTextView, StrategyListItemModel strategyListItemModel) {
        Group groupDetail = c42090q0.f93237d;
        Intrinsics.checkNotNullExpressionValue(groupDetail, "groupDetail");
        if (groupDetail.getVisibility() == 0) {
            c42090q0.f93242i.setMaxLines(2);
            C27014a1.m66504d(appCompatTextView, R$drawable.ic2_arrow_down_20, GravityCompat.END);
            ViewExtKt.m66577h(groupDetail);
        } else {
            C27014a1.m66504d(appCompatTextView, R$drawable.ic2_arrow_up_20, GravityCompat.END);
            c42090q0.f93242i.setMaxLines(2);
            ViewExtKt.m66594y(groupDetail);
            c42090q0.f93247n.setVisibility(strategyListItemModel.getTotalInvestVisible());
            c42090q0.f93246m.setVisibility(strategyListItemModel.getTotalInvestVisible());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m84038c(@NotNull final RecyclerView.ViewHolder holder, @NotNull final StrategyListItemModel model, @Nullable final ItemCallBack<StrategyListItemModel> itemCallBack) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        C42090q0 c42090q0M92333a = C42090q0.m92333a(holder.itemView);
        Intrinsics.checkNotNullExpressionValue(c42090q0M92333a, "bind(...)");
        m84043j(c42090q0M92333a, model);
        c42090q0M92333a.f93241h.setText(model.getStopReason());
        c42090q0M92333a.f93244k.setText(model.getStopPriceText());
        c42090q0M92333a.f93243j.setText(model.getStopPriceNumber());
        c42090q0M92333a.f93242i.setText(m84040g(model));
        m84041h(c42090q0M92333a, model);
        m84042i(c42090q0M92333a, model);
        m84039e(c42090q0M92333a, model);
        AppCompatImageView ivClose = c42090q0M92333a.f93239f;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        ViewExtKt.m66575f(ivClose, new Function1() { // from class: f50.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37379t.m84036d(itemCallBack, holder, model, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m84039e(final C42090q0 c42090q0, final StrategyListItemModel strategyListItemModel) {
        final AppCompatTextView tvDetailText = c42090q0.f93240g;
        Intrinsics.checkNotNullExpressionValue(tvDetailText, "tvDetailText");
        C27046k.m66711z(tvDetailText, 0L, new Function0() { // from class: f50.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37379t.m84037f(c42090q0, tvDetailText, strategyListItemModel);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: g */
    public final SpannableString m84040g(StrategyListItemModel strategyListItemModel) {
        CharSequence charSequenceA;
        String strM92640e;
        StringBuilder sb2 = new StringBuilder();
        List<StrategyListItemModel.Transfer> transfers = strategyListItemModel.getTransfers();
        if (transfers != null) {
            for (StrategyListItemModel.Transfer transfer : transfers) {
                int iM85333b = Intrinsics.areEqual(transfer.getCurrency(), C27041f.m66668h(strategyListItemModel.getQuoteCode())) ? C37815a.m85333b(C27041f.m66668h(strategyListItemModel.getSymbolCode())) : C37815a.m85332a(C27041f.m66668h(strategyListItemModel.getSymbolCode()));
                String currency = transfer.getCurrency();
                if (currency != null) {
                    if (sb2.length() > 0) {
                        sb2.append("、");
                    }
                    BigDecimal size = transfer.getSize();
                    if (size == null || (strM92640e = C42180b.m92640e(size, null, iM85333b, false, false, false, 0, null, 125, null)) == null || (charSequenceA = t0.a(strM92640e, currency)) == null) {
                        charSequenceA = "";
                    }
                    sb2.append(charSequenceA);
                }
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        C27017c c27017c = C27017c.f54310a;
        return C42973g.m94370c(t0.a(t0.a(c27017c.m66516f(R$string.kc_tb_grid_back_to, new Object[0]), c27017c.m66516f(R$string.trade_account, new Object[0])), C42974h.m94372a(string)).toString(), string, c27017c.m66512a(R$color.primary));
    }

    /* JADX INFO: renamed from: h */
    public final void m84041h(C42090q0 c42090q0, StrategyListItemModel strategyListItemModel) {
        c42090q0.f93246m.setText(strategyListItemModel.getTotalInvestNumber());
    }

    /* JADX INFO: renamed from: i */
    public final void m84042i(C42090q0 c42090q0, StrategyListItemModel strategyListItemModel) {
        c42090q0.f93248o.setText(strategyListItemModel.getTotalProfit());
        c42090q0.f93248o.setTextColor(C27039d.m66650j(strategyListItemModel.getTotalProfitColor()));
        c42090q0.f93249p.setText(strategyListItemModel.getTotalProfitRate());
        c42090q0.f93249p.setTextColor(C27039d.m66650j(strategyListItemModel.getTotalProfitColor()));
    }

    /* JADX INFO: renamed from: j */
    public final void m84043j(C42090q0 c42090q0, StrategyListItemModel strategyListItemModel) {
        c42090q0.f93245l.setText(strategyListItemModel.getSymbolName());
    }
}
