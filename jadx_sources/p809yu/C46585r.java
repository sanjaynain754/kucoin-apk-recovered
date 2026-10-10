package p809yu;

import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.resources.C22890g;
import com.kubi.utils.C27017c;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yu.r */
/* JADX INFO: compiled from: ChainListItemView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/ChainTradeCountItemView;", "Lcom/kubi/quotefacade/adapter/IChainListItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46585r implements InterfaceC46592y {
    @Override // p809yu.InterfaceC46592y
    /* JADX INFO: renamed from: a */
    public void mo102729a(@NotNull BaseViewHolder helper, @NotNull ChainItemEntity item) {
        BigDecimal bigDecimalValueOf;
        String strM89929c;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tv_trade_count;
        BaseViewHolder gone = helper.setGone(i11, true);
        if (item.getTokenTxCount() == null) {
            strM89929c = "--";
        } else {
            Integer tokenTxCount = item.getTokenTxCount();
            if (tokenTxCount != null) {
                bigDecimalValueOf = BigDecimal.valueOf(tokenTxCount.intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            } else {
                bigDecimalValueOf = null;
            }
            strM89929c = C41014a.m89929c(bigDecimalValueOf, false, false, 3, null);
        }
        gone.setText(i11, strM89929c);
        String strValueOf = item.getTokenBuyTxCount() == null ? "" : String.valueOf(item.getTokenBuyTxCount());
        String strValueOf2 = item.getTokenSellTxCount() != null ? String.valueOf(item.getTokenSellTxCount()) : "";
        helper.setGone(R$id.layout_count, true);
        if (strValueOf.length() == 0) {
            helper.setText(R$id.tv_buy_count, "--");
        } else {
            int i12 = R$id.tv_buy_count;
            helper.setText(i12, C41014a.m89929c(new BigDecimal(strValueOf), false, false, 3, null));
            if (Intrinsics.areEqual(strValueOf, "0")) {
                helper.setTextColor(i12, C27017c.f54310a.m66512a(R$color.c_text));
            } else {
                helper.setTextColor(i12, C22890g.m54291p(C27017c.f54310a.m66513b()));
            }
        }
        if (strValueOf2.length() == 0) {
            helper.setText(R$id.tv_sell_count, "--");
        } else {
            int i13 = R$id.tv_sell_count;
            helper.setText(i13, C41014a.m89929c(new BigDecimal(strValueOf2), false, false, 3, null));
            if (Intrinsics.areEqual(strValueOf2, "0")) {
                helper.setTextColor(i13, C27017c.f54310a.m66512a(R$color.c_text));
            } else {
                helper.setTextColor(i13, C22890g.m54289n(C27017c.f54310a.m66513b()));
            }
        }
        if (strValueOf.length() == 0 && strValueOf2.length() == 0) {
            helper.setGone(R$id.tv_split, false);
        } else {
            helper.setGone(R$id.tv_split, true);
        }
    }
}
