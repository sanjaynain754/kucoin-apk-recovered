package com.kubi.quotefacade.alpha.list;

import com.kubi.otc.entity.OtcAd;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.resources.C22890g;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.alpha.list.w0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IAlphaListItemView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaTradeCountItemView;", "Lcom/kubi/quotefacade/alpha/list/IAlphaListItemView;", "<init>", "()V", "render", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AlphaTradeCountItemView implements IAlphaListItemView {
    @Override // com.kubi.quotefacade.alpha.list.IAlphaListItemView
    /* JADX INFO: renamed from: a */
    public void mo50661a(@NotNull BaseViewHolder helper, @NotNull AlphaItemEntity item) {
        BigDecimal bigDecimalValueOf;
        String strM89929c;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tvTradeCount;
        BaseViewHolder gone = helper.setGone(i11, true);
        Integer txCount = item.getTxCount();
        if (txCount != null && txCount.intValue() == -1) {
            strM89929c = "--";
        } else {
            Integer txCount2 = item.getTxCount();
            if (txCount2 != null) {
                bigDecimalValueOf = BigDecimal.valueOf(txCount2.intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            } else {
                bigDecimalValueOf = null;
            }
            strM89929c = C41014a.m89929c(bigDecimalValueOf, false, false, 3, null);
        }
        gone.setText(i11, strM89929c);
        Integer buySideCount = item.getBuySideCount();
        String strM66668h = C27041f.m66668h(buySideCount != null ? buySideCount.toString() : null);
        Integer sellSideCount = item.getSellSideCount();
        String strM66668h2 = C27041f.m66668h(sellSideCount != null ? sellSideCount.toString() : null);
        helper.setGone(R$id.layoutCount, true);
        if (strM66668h.length() == 0 || Intrinsics.areEqual(strM66668h, OtcAd.KYC_NOT_PASS)) {
            helper.setText(R$id.tvBuyCount, "--");
        } else {
            int i12 = R$id.tvBuyCount;
            helper.setText(i12, C41014a.m89929c(new BigDecimal(strM66668h), false, false, 3, null));
            if (Intrinsics.areEqual(strM66668h, "0")) {
                helper.setTextColor(i12, C27017c.f54310a.m66512a(R$color.c_text));
            } else {
                helper.setTextColor(i12, C22890g.m54291p(C27017c.f54310a.m66513b()));
            }
        }
        if (strM66668h2.length() == 0 || Intrinsics.areEqual(strM66668h2, OtcAd.KYC_NOT_PASS)) {
            helper.setText(R$id.tvSellCount, "--");
        } else {
            int i13 = R$id.tvSellCount;
            helper.setText(i13, C41014a.m89929c(new BigDecimal(strM66668h2), false, false, 3, null));
            if (Intrinsics.areEqual(strM66668h2, "0")) {
                helper.setTextColor(i13, C27017c.f54310a.m66512a(R$color.c_text));
            } else {
                helper.setTextColor(i13, C22890g.m54289n(C27017c.f54310a.m66513b()));
            }
        }
        if (strM66668h.length() == 0 && strM66668h2.length() == 0) {
            helper.setGone(R$id.tvSplit, false);
        } else {
            helper.setGone(R$id.tvSplit, true);
        }
    }
}
