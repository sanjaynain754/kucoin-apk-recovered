package com.kubi.quotefacade.alpha.list;

import android.content.Context;
import android.widget.TextView;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.chain.C21781i;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.resources.C22890g;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.alpha.list.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IAlphaListItemView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaChangeRateItemView;", "Lcom/kubi/quotefacade/alpha/list/IAlphaListItemView;", "<init>", "()V", "render", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AlphaChangeRateItemView implements IAlphaListItemView {
    @Override // com.kubi.quotefacade.alpha.list.IAlphaListItemView
    /* JADX INFO: renamed from: a */
    public void mo50661a(@NotNull BaseViewHolder helper, @NotNull AlphaItemEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) helper.getView(R$id.tvRate);
        if (textView != null) {
            C27046k.m66685H(textView);
            textView.setText(C21781i.m50835a(item.getPriceRate(), false));
            double dDoubleValue = C27039d.m66654n(C41014a.m89922G(item.getPriceRate(), null, 1, null)).doubleValue();
            Context context = helper.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setBackground(C22890g.m54286k(dDoubleValue, context));
        }
    }
}
