package p809yu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.R$dimen;
import com.kubi.quotefacade.R$id;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.core.C27034h;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yu.x */
/* JADX INFO: compiled from: FavListItemView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/HomeRankFavListItemView;", "Lcom/kubi/quotefacade/adapter/NormalFavListItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/data/entity/TradeItemBean;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46591x extends C46568b0 {
    @Override // p809yu.C46568b0, p809yu.InterfaceC46593z
    /* JADX INFO: renamed from: a */
    public void mo102718a(@NotNull BaseViewHolder helper, @NotNull TradeItemBean item) {
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        super.mo102718a(helper, item);
        ViewGroup viewGroup = (ViewGroup) helper.getView(R$id.root_view);
        if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            layoutParams.height = C27034h.m66633d(context, R$dimen.trade_cell_height);
            viewGroup.setLayoutParams(layoutParams);
        }
        View view = helper.getView(R$id.tv_trade_pair_box);
        if (view != null) {
            ViewExtKt.m66585p(view, C27040e.m66658b(12), 0, 0, 0, 14, null);
        }
        TextView textView = (TextView) helper.getView(R$id.tv_change_rate);
        if (textView != null) {
            ViewExtKt.m66585p(textView, 0, 0, C27040e.m66658b(12), 0, 11, null);
        }
    }
}
