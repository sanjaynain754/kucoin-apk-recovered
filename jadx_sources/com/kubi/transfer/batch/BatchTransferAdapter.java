package com.kubi.transfer.batch;

import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.transfer.entity.AccountCoin;
import com.kubi.transfer.entity.Currency;
import com.kubi.transfer.lib.R$color;
import com.kubi.transfer.lib.R$id;
import com.kubi.transfer.lib.R$layout;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.StringEx;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: BatchTransferAdapter.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012 \u0010\u0004\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\bR(\u0010\u0004\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/transfer/batch/BatchTransferAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/transfer/entity/AccountCoin;", "Lio/chad/library/adapter/base/BaseViewHolder;", "itemClickListener", "Lkotlin/Function1;", "", "", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "selectedMap", "convert", "helper", "item", "getSelectedItems", "", "Lcom/kubi/transfer/entity/Currency;", "sortByAmount", "ascending", "selectAll", "isSelectAll", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBatchTransferAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchTransferAdapter.kt\ncom/kubi/transfer/batch/BatchTransferAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1011#2,2:139\n*S KotlinDebug\n*F\n+ 1 BatchTransferAdapter.kt\ncom/kubi/transfer/batch/BatchTransferAdapter\n*L\n110#1:139,2\n*E\n"})
public final class BatchTransferAdapter extends BaseQuickAdapter<AccountCoin, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Function1<Map<String, Boolean>, Unit> f52622i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Map<String, Boolean> f52623j;

    /* JADX INFO: renamed from: com.kubi.transfer.batch.BatchTransferAdapter$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 BatchTransferAdapter.kt\ncom/kubi/transfer/batch/BatchTransferAdapter\n*L\n1#1,328:1\n110#2:329\n*E\n"})
    public static final class C26272a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((AccountCoin) t11).getAvailableBaseLegalCurrency(), ((AccountCoin) t12).getAvailableBaseLegalCurrency());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BatchTransferAdapter(@NotNull Function1<? super Map<String, Boolean>, Unit> itemClickListener) {
        super(R$layout.btransfer_item_batch_transfer);
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        this.f52622i = itemClickListener;
        this.f52623j = new LinkedHashMap();
        setHasStableIds(true);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m64517i(BatchTransferAdapter batchTransferAdapter, AccountCoin accountCoin, BaseViewHolder baseViewHolder) {
        int size = batchTransferAdapter.f52623j.size();
        if (accountCoin.isSelected()) {
            batchTransferAdapter.f52623j.remove(accountCoin.getCurrency());
            accountCoin.setSelected(false);
        } else if (size >= 20) {
            accountCoin.setSelected(false);
        } else {
            batchTransferAdapter.f52623j.put(accountCoin.getCurrency(), Boolean.TRUE);
            accountCoin.setSelected(true);
        }
        batchTransferAdapter.f52622i.invoke(batchTransferAdapter.f52623j);
        if (baseViewHolder.getBindingAdapterPosition() >= 0) {
            batchTransferAdapter.notifyItemChanged(baseViewHolder.getBindingAdapterPosition());
        }
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable final BaseViewHolder baseViewHolder, @NotNull final AccountCoin item) {
        View view;
        Intrinsics.checkNotNullParameter(item, "item");
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(item.getAvailableBalance(), null, 1, null);
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_coin_name, StringEx.INSTANCE.xbt2btc4Java(C27041f.m66668h(item.getCurrencyName())));
            baseViewHolder.setText(R$id.tv_coin_name_full, C27041f.m66668h(item.getCurrencyFullName()));
            int i11 = R$id.tv_balance;
            baseViewHolder.setText(i11, C37885i.m85563b(bigDecimalM66535e, C27041f.m66668h(item.getCurrency()), 0, 2, null));
            int i12 = R$id.tv_legal_symbol_price;
            baseViewHolder.setText(i12, C41014a.m89950x(DowngradeExKt.m66538h(item.getAvailableBaseLegalCurrency(), 0.0d, 1, null), null, null, 0, false, false, false, false, 127, null));
            Context context = this.mContext;
            BigDecimal bigDecimal = BigDecimal.ZERO;
            baseViewHolder.setTextColor(i11, ContextCompat.getColor(context, bigDecimalM66535e.compareTo(bigDecimal) > 0 ? R$color.c_text : R$color.c_text40));
            int i13 = R$id.ivCheck;
            ((KuCheckBox) baseViewHolder.getView(i13)).setChecked(item.isSelected());
            ((KuCheckBox) baseViewHolder.getView(i13)).setClickable(false);
            baseViewHolder.setGone(i12, bigDecimalM66535e.compareTo(bigDecimal) > 0);
        }
        if (baseViewHolder == null || (view = baseViewHolder.itemView) == null) {
            return;
        }
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.transfer.batch.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BatchTransferAdapter.m64517i(this.f52636b, item, baseViewHolder);
            }
        }, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<Currency> m64519j() {
        ArrayList arrayList = new ArrayList();
        for (AccountCoin accountCoin : getData()) {
            if (Intrinsics.areEqual(this.f52623j.get(accountCoin.getCurrency()), Boolean.TRUE)) {
                arrayList.add(new Currency(accountCoin.getCurrency(), C41014a.m89946t(DowngradeExKt.m66535e(accountCoin.getAvailableBalance(), null, 1, null), null, C27039d.m66650j(accountCoin.getPrecision()), false, false, false, false, false, null, 0, 509, null)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final void m64520k(boolean z11) {
        this.f52623j.clear();
        int i11 = 0;
        if (z11) {
            int iCoerceAtMost = RangesKt.coerceAtMost(getData().size(), 20);
            for (AccountCoin accountCoin : getData()) {
                int i12 = i11 + 1;
                if (i11 >= iCoerceAtMost) {
                    break;
                }
                accountCoin.setSelected(true);
                this.f52623j.put(accountCoin.getCurrency(), Boolean.TRUE);
                i11 = i12;
            }
        } else {
            for (AccountCoin accountCoin2 : getData()) {
                accountCoin2.setSelected(false);
                this.f52623j.remove(accountCoin2.getCurrency());
            }
        }
        this.f52622i.invoke(this.f52623j);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: l */
    public final void m64521l(boolean z11) {
        List<AccountCoin> data = getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        if (data.size() > 1) {
            CollectionsKt.sortWith(data, new C26272a());
        }
        if (!z11) {
            List<AccountCoin> data2 = getData();
            Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
            CollectionsKt.reverse(data2);
        }
        notifyDataSetChanged();
    }
}
