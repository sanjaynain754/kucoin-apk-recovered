package com.kubi.assets.exchange.p075ui.adapter;

import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.exchange.model.AccountItem;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p754xa.C46109a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ConvertAccountSelectAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/adapter/ConvertAccountSelectAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/exchange/model/AccountItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "data", "", "isUnifiedAccount", "", "<init>", "(Ljava/util/List;Z)V", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ConvertAccountSelectAdapter extends BaseQuickAdapter<AccountItem, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final boolean f17281i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertAccountSelectAdapter(@NotNull List<AccountItem> data, boolean z11) {
        super(R$layout.asset_item_convert_account_select, data);
        Intrinsics.checkNotNullParameter(data, "data");
        this.f17281i = z11;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull AccountItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(R$id.tvAccount, C46109a.m101610a(item.getAccountType(), this.f17281i)).setGone(R$id.ivCheck, item.getChecked());
        helper.itemView.setSelected(item.getChecked());
    }
}
