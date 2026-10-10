package com.kubi.transfer.search.symbol;

import androidx.core.content.ContextCompat;
import com.kubi.transfer.entity.Base;
import com.kubi.transfer.entity.Quote;
import com.kubi.transfer.entity.SearchSymbolEntity;
import com.kubi.transfer.lib.R$color;
import com.kubi.transfer.lib.R$id;
import com.kubi.transfer.lib.R$layout;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33820nf;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SearchSymbolAdapter.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/transfer/search/symbol/SearchSymbolAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/transfer/entity/SearchSymbolEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchSymbolAdapter extends BaseQuickAdapter<SearchSymbolEntity, BaseViewHolder> {
    public SearchSymbolAdapter() {
        super(R$layout.btransfer_item_search_symbol);
        setHasStableIds(true);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable SearchSymbolEntity searchSymbolEntity) {
        if (searchSymbolEntity == null) {
            return;
        }
        Base base = searchSymbolEntity.getBase();
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(base != null ? base.getAvailableBalance() : null, null, 1, null);
        Quote quote = searchSymbolEntity.getQuote();
        BigDecimal bigDecimalM66535e2 = DowngradeExKt.m66535e(quote != null ? quote.getAvailableBalance() : null, null, 1, null);
        int i11 = bigDecimalM66535e.add(bigDecimalM66535e2).compareTo(BigDecimal.ZERO) > 0 ? R$color.c_text : R$color.c_text40;
        if (baseViewHolder != null) {
            int i12 = R$id.tv_symbol_name;
            String symbolName = searchSymbolEntity.getSymbolName();
            baseViewHolder.setText(i12, C27041f.m66668h(symbolName != null ? StringsKt.replace$default(symbolName, C33820nf.f71144W, "/", false, 4, (Object) null) : null));
            int i13 = R$id.tv_balance;
            StringBuilder sb2 = new StringBuilder();
            Base base2 = searchSymbolEntity.getBase();
            sb2.append(C37885i.m85563b(bigDecimalM66535e, base2 != null ? base2.getCurrency() : null, 0, 2, null));
            sb2.append('/');
            Quote quote2 = searchSymbolEntity.getQuote();
            sb2.append(C37885i.m85563b(bigDecimalM66535e2, quote2 != null ? quote2.getCurrency() : null, 0, 2, null));
            baseViewHolder.setText(i13, sb2.toString());
            baseViewHolder.setTextColor(i13, ContextCompat.getColor(this.mContext, i11));
        }
    }
}
