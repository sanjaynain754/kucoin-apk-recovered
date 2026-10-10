package com.kubi.assets.finance.coin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.FinanceCoinEntity;
import com.kubi.assets.entity.ProductChildEntity;
import com.kubi.assets.finance.FinanceAnalyticsReporter;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import gf.C37885i;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import rs.AbstractC44173c;
import rs.C44172b;

/* JADX INFO: compiled from: FinanceCoinAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014J\u001c\u0010\u0010\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/finance/coin/FinanceCoinAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/FinanceCoinEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "convert", "", "helper", "item", "initSubRecyclerView", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FinanceCoinAdapter extends BaseQuickAdapter<FinanceCoinEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public boolean f17420i;

    public FinanceCoinAdapter() {
        super(R$layout.asset_item_finance_coin);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m16768i(FinanceCoinEntity financeCoinEntity, BaseViewHolder baseViewHolder, FinanceCoinAdapter financeCoinAdapter) {
        String investCurrency;
        if (financeCoinEntity != null) {
            financeCoinEntity.setExpanded(!C27025c.m66566d(Boolean.valueOf(financeCoinEntity.isExpanded())));
        }
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && bindingAdapterPosition < financeCoinAdapter.getData().size()) {
            financeCoinAdapter.notifyItemChanged(bindingAdapterPosition);
            FinanceAnalyticsReporter financeAnalyticsReporter = FinanceAnalyticsReporter.f17418a;
            String strValueOf = String.valueOf(baseViewHolder.getBindingAdapterPosition() + 1);
            if (financeCoinEntity == null || (investCurrency = financeCoinEntity.getInvestCurrency()) == null) {
                investCurrency = "";
            }
            financeAnalyticsReporter.m16756b(strValueOf, investCurrency);
        }
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable final BaseViewHolder baseViewHolder, @Nullable final FinanceCoinEntity financeCoinEntity) {
        View view;
        List<ProductChildEntity> list;
        String holdingAmount;
        BigDecimal bigDecimalM66535e;
        TextView textView;
        TextView textView2;
        if (baseViewHolder != null && (textView2 = (TextView) baseViewHolder.getView(R$id.tv_amount)) != null) {
            C44172b.m97383c(textView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        }
        if (baseViewHolder != null && (textView = (TextView) baseViewHolder.getView(R$id.tv_price)) != null) {
            C44172b.m97383c(textView, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        }
        String investCurrency = financeCoinEntity != null ? financeCoinEntity.getInvestCurrency() : null;
        C37890n c37890n = C37890n.f85269a;
        String investCurrency2 = financeCoinEntity != null ? financeCoinEntity.getInvestCurrency() : null;
        if (investCurrency2 == null) {
            investCurrency2 = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(investCurrency2);
        String currency = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null;
        C24277v.m58542g(baseViewHolder != null ? (ImageView) baseViewHolder.getView(R$id.iv_icon) : null, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null);
        if (baseViewHolder != null) {
            BaseViewHolder text = baseViewHolder.setText(R$id.tv_coin_name, currency != null ? currency : "");
            if (text != null) {
                BaseViewHolder text2 = text.setText(R$id.tv_amount, (financeCoinEntity == null || (holdingAmount = financeCoinEntity.getHoldingAmount()) == null || (bigDecimalM66535e = DowngradeExKt.m66535e(holdingAmount, null, 1, null)) == null) ? null : C37885i.m85563b(bigDecimalM66535e, investCurrency, 0, 2, null));
                if (text2 != null) {
                    int i11 = R$id.tv_holder;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string = this.mContext.getString(R$string.kc_earn_holds);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(C27039d.m66650j((financeCoinEntity == null || (list = financeCoinEntity.getList()) == null) ? null : Integer.valueOf(list.size())))}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    BaseViewHolder text3 = text2.setText(i11, str);
                    if (text3 != null) {
                        text3.setText(R$id.tv_price, C41014a.m89950x(C41014a.m89940n(DowngradeExKt.m66535e(financeCoinEntity != null ? financeCoinEntity.getHoldingAmount() : null, null, 1, null), financeCoinEntity != null ? financeCoinEntity.getInvestCurrency() : null), null, null, 0, false, false, false, true, 63, null));
                    }
                }
            }
        }
        ShowHideTextView.m54778d(baseViewHolder != null ? baseViewHolder.itemView : null, this.f17420i);
        m16770j(baseViewHolder, financeCoinEntity);
        if (baseViewHolder == null || (view = baseViewHolder.itemView) == null) {
            return;
        }
        C27046k.m66710y(view, 1100L, new Function0() { // from class: com.kubi.assets.finance.coin.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinanceCoinAdapter.m16768i(financeCoinEntity, baseViewHolder, this);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m16770j(BaseViewHolder baseViewHolder, FinanceCoinEntity financeCoinEntity) {
        RecyclerView recyclerView = baseViewHolder != null ? (RecyclerView) baseViewHolder.getView(R$id.recyclerView) : null;
        if (financeCoinEntity == null || !financeCoinEntity.isExpanded()) {
            if (recyclerView != null) {
                ViewExtKt.m66577h(recyclerView);
            }
        } else {
            if (recyclerView != null) {
                recyclerView.setAdapter(new FinanceCoinChildAdapter(financeCoinEntity.getList(), this.f17420i));
            }
            if (recyclerView != null) {
                ViewExtKt.m66594y(recyclerView);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m16771k(boolean z11) {
        this.f17420i = z11;
    }
}
