package f50;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.sdk.ItemCallBack;
import com.kubi.tradingbotkit.model.StrategyListItemModel;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import l50.C42082m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: f50.d */
/* JADX INFO: compiled from: StrategyListFailedBinding.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/spot/strategyList/binding/StrategyListFailedBinding;", "", "<init>", "()V", "bind", "", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "model", "Lcom/kubi/tradingbotkit/model/StrategyListItemModel;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "showSymbolName", "btradingBotKitStrategyListItemFailedLayoutBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitStrategyListItemFailedLayoutBinding;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37363d {
    /* JADX INFO: renamed from: c */
    public static final Unit m83997c(ItemCallBack itemCallBack, RecyclerView.ViewHolder viewHolder, StrategyListItemModel strategyListItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (itemCallBack != null) {
            itemCallBack.mo24515a(it, viewHolder.getAdapterPosition(), strategyListItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m83998b(@NotNull final RecyclerView.ViewHolder holder, @NotNull final StrategyListItemModel model, @Nullable final ItemCallBack<StrategyListItemModel> itemCallBack) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        C42082m0 c42082m0M92317a = C42082m0.m92317a(holder.itemView);
        Intrinsics.checkNotNullExpressionValue(c42082m0M92317a, "bind(...)");
        m83999d(c42082m0M92317a, model);
        c42082m0M92317a.f93063f.setText(model.getStopReason());
        if (Intrinsics.areEqual(model.getRunningStatus(), "TRANSFER_FAIL") || Intrinsics.areEqual(model.getRunningStatus(), "START_FAILED")) {
            TextView tvStartFailedReasonText = c42082m0M92317a.f93062e;
            Intrinsics.checkNotNullExpressionValue(tvStartFailedReasonText, "tvStartFailedReasonText");
            ViewExtKt.m66577h(tvStartFailedReasonText);
        } else {
            c42082m0M92317a.f93062e.setText(model.getStopReasonDetail());
            TextView tvStartFailedReasonText2 = c42082m0M92317a.f93062e;
            Intrinsics.checkNotNullExpressionValue(tvStartFailedReasonText2, "tvStartFailedReasonText");
            ViewExtKt.m66594y(tvStartFailedReasonText2);
        }
        AppCompatImageView ivClose = c42082m0M92317a.f93061d;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        ViewExtKt.m66575f(ivClose, new Function1() { // from class: f50.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37363d.m83997c(itemCallBack, holder, model, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m83999d(C42082m0 c42082m0, StrategyListItemModel strategyListItemModel) {
        c42082m0.f93064g.setText(strategyListItemModel.getSymbolName());
    }
}
