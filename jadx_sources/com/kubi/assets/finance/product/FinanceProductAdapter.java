package com.kubi.assets.finance.product;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.FinanceProductEntity;
import com.kubi.assets.entity.ProductChildEntity;
import com.kubi.assets.finance.FinanceAnalyticsReporter;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import rs.AbstractC44173c;
import rs.C44172b;

/* JADX INFO: compiled from: FinanceProductAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014J\u001c\u0010\u0010\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/finance/product/FinanceProductAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/FinanceProductEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "convert", "", "helper", "item", "initSubRecyclerView", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FinanceProductAdapter extends BaseQuickAdapter<FinanceProductEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public boolean f17460i;

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable final BaseViewHolder baseViewHolder, @Nullable final FinanceProductEntity financeProductEntity) {
        View view;
        String strM85563b;
        List<ProductChildEntity> list;
        BigDecimal totalAmount;
        TextView textView;
        TextView textView2;
        if (baseViewHolder != null && (textView2 = (TextView) baseViewHolder.getView(R$id.tv_amount)) != null) {
            C44172b.m97383c(textView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        }
        if (baseViewHolder != null && (textView = (TextView) baseViewHolder.getView(R$id.tv_price)) != null) {
            C44172b.m97383c(textView, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        }
        if (baseViewHolder != null) {
            int i11 = R$id.tv_coin_name;
            String categoryGroupText = financeProductEntity != null ? financeProductEntity.getCategoryGroupText() : null;
            if (categoryGroupText == null) {
                categoryGroupText = "";
            }
            BaseViewHolder text = baseViewHolder.setText(i11, categoryGroupText);
            if (text != null) {
                int i12 = R$id.tv_amount;
                if (financeProductEntity == null || (totalAmount = financeProductEntity.getTotalAmount()) == null || (strM85563b = C37885i.m85563b(totalAmount, AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency(), 0, 2, null)) == null) {
                    strM85563b = "--";
                }
                BaseViewHolder text2 = text.setText(i12, strM85563b);
                if (text2 != null) {
                    int i13 = R$id.tv_holder;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string = this.mContext.getString(R$string.kc_earn_holds);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(C27039d.m66650j((financeProductEntity == null || (list = financeProductEntity.getList()) == null) ? null : Integer.valueOf(list.size())))}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    BaseViewHolder text3 = text2.setText(i13, str);
                    if (text3 != null) {
                        text3.setText(R$id.tv_price, C27041f.m66669i(financeProductEntity != null ? financeProductEntity.getTotalPrice() : null, "--"));
                    }
                }
            }
        }
        ShowHideTextView.m54778d(baseViewHolder != null ? baseViewHolder.itemView : null, this.f17460i);
        m16797j(baseViewHolder, financeProductEntity);
        if (baseViewHolder == null || (view = baseViewHolder.itemView) == null) {
            return;
        }
        C27046k.m66710y(view, 1100L, new Function0() { // from class: com.kubi.assets.finance.product.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinanceProductAdapter.m16795i(financeProductEntity, baseViewHolder, this);
            }
        });
    }

    public FinanceProductAdapter() {
        super(R$layout.asset_item_finance_product);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m16795i(FinanceProductEntity financeProductEntity, BaseViewHolder baseViewHolder, FinanceProductAdapter financeProductAdapter) {
        if (financeProductEntity != null) {
            financeProductEntity.setExpanded(!C27025c.m66566d(Boolean.valueOf(financeProductEntity.isExpanded())));
        }
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && bindingAdapterPosition < financeProductAdapter.getData().size()) {
            financeProductAdapter.notifyItemChanged(bindingAdapterPosition);
            FinanceAnalyticsReporter.f17418a.m16761g(String.valueOf(baseViewHolder.getBindingAdapterPosition() + 1), C27041f.m66668h(financeProductEntity != null ? financeProductEntity.getCategoryGroup() : null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public final void m16797j(BaseViewHolder baseViewHolder, FinanceProductEntity financeProductEntity) {
        RecyclerView recyclerView = baseViewHolder != null ? (RecyclerView) baseViewHolder.getView(R$id.recyclerView) : null;
        if (financeProductEntity == null || !financeProductEntity.isExpanded()) {
            if (recyclerView != null) {
                ViewExtKt.m66577h(recyclerView);
            }
        } else {
            if (recyclerView != null) {
                recyclerView.setAdapter(new FinanceProductChildAdapter(financeProductEntity.getList(), financeProductEntity.isShowCategory(), this.f17460i));
            }
            if (recyclerView != null) {
                ViewExtKt.m66594y(recyclerView);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m16798k(boolean z11) {
        this.f17460i = z11;
    }
}
