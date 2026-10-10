package com.kubi.assets.bill;

import android.view.View;
import android.widget.ImageView;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.FinanceBillItemEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.DowngradeExKt;
import gf.C37885i;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountBillAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0014R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/assets/bill/FinanceAccountBillAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/FinanceBillItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "datas", "", "<init>", "(Ljava/util/List;)V", "onItemClickListener", "Lkotlin/Function1;", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "convert", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FinanceAccountBillAdapter extends BaseQuickAdapter<FinanceBillItemEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public Function1<? super FinanceBillItemEntity, Unit> f16698i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceAccountBillAdapter(@NotNull List<FinanceBillItemEntity> datas) {
        super(R$layout.asset_account_bill_common_item, datas);
        Intrinsics.checkNotNullParameter(datas, "datas");
    }

    /* JADX INFO: renamed from: i */
    public static final void m15743i(FinanceAccountBillAdapter financeAccountBillAdapter, FinanceBillItemEntity financeBillItemEntity, View view) {
        Function1<? super FinanceBillItemEntity, Unit> function1 = financeAccountBillAdapter.f16698i;
        if (function1 != null) {
            function1.invoke(financeBillItemEntity);
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull final FinanceBillItemEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(R$id.tvCoinName, item.getCurrency());
        helper.setText(R$id.tvOperationType, item.getBizTypeText());
        Integer side = item.getSide();
        if (side != null && side.intValue() == 1) {
            int i11 = R$id.tvAmount;
            ((BaseTextView) helper.getView(i11)).setTextColor(C27017c.f54310a.m66512a(R$color.brandGreen));
            helper.setText(i11, '+' + C37885i.m85563b(DowngradeExKt.m66535e(String.valueOf(item.getAmount()), null, 1, null), item.getCurrency(), 0, 2, null));
        } else {
            int i12 = R$id.tvAmount;
            ((BaseTextView) helper.getView(i12)).setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
            helper.setText(i12, '-' + C37885i.m85563b(DowngradeExKt.m66535e(String.valueOf(item.getAmount()), null, 1, null), item.getCurrency(), 0, 2, null));
        }
        int i13 = R$id.tvTime;
        Long createdAt = item.getCreatedAt();
        helper.setText(i13, createdAt != null ? C42179a.m92633f(createdAt.longValue(), null, false, false, null, 15, null) : null);
        C37890n c37890n = C37890n.f85269a;
        String currency = item.getCurrency();
        if (currency == null) {
            currency = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(currency);
        C24277v.m58542g((ImageView) helper.getView(R$id.ivCoinIcon), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null);
        helper.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FinanceAccountBillAdapter.m15743i(this.f16820b, item, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m15745j(@Nullable Function1<? super FinanceBillItemEntity, Unit> function1) {
        this.f16698i = function1;
    }
}
