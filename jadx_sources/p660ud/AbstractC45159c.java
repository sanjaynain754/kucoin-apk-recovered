package p660ud;

import android.content.Context;
import android.view.View;
import com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradecorebiz.R$id;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p690vd.C45500c;
import p690vd.C45503f;
import p690vd.C45507j;
import p690vd.C45510m;
import p690vd.C45513p;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import v30.C45387i0;

/* JADX INFO: renamed from: ud.c */
/* JADX INFO: compiled from: BaseDelegationHistoryBaseItemViewCore.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J\u001a\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/history/BaseDelegationHistoryBaseItemViewCore;", "Lcom/kubi/core/biz/order/record/history/ICoreDelegateHistoryTradeTypeItemView;", "<init>", "()V", "jumpToDetailPage", "", "context", "Landroid/content/Context;", "item", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "jumpToTradePage", "bindItemView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "isUpGreen", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbstractC45159c {
    /* JADX INFO: renamed from: f */
    public abstract void mo66121f(@Nullable Context context, @NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity);

    /* JADX INFO: renamed from: g */
    public abstract void mo66122g(@Nullable Context context, @NotNull HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity);

    /* JADX INFO: renamed from: c */
    public void m99817c(@NotNull BaseViewHolder helper, @NotNull final HistoryOrdersUiData$ItemEntity item, boolean z11, @NotNull final BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        helper.itemView.setOnClickListener(new View.OnClickListener() { // from class: ud.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC45159c.m99815d(this.f101609b, fragment, item, view);
            }
        });
        View view = helper.getView(R$id.tv_trade_pair);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: ud.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC45159c.m99816e(this.f101614b, fragment, item);
            }
        }, 1, null);
        C45387i0 c45387i0M100308a = C45387i0.m100308a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c45387i0M100308a, "bind(...)");
        if (item instanceof HistoryOrdersUiData$ItemEntity.Limit) {
            C45503f.f102534a.m100477c(fragment, c45387i0M100308a, (HistoryOrdersUiData$ItemEntity.Limit) item, z11);
            return;
        }
        if (item instanceof HistoryOrdersUiData$ItemEntity.StopLimit) {
            C45510m.f102538a.m100490c(fragment, c45387i0M100308a, (HistoryOrdersUiData$ItemEntity.StopLimit) item, z11);
            return;
        }
        if (item instanceof HistoryOrdersUiData$ItemEntity.AdvancedLimit) {
            C45500c.f102532a.m100472c(fragment, c45387i0M100308a, (HistoryOrdersUiData$ItemEntity.AdvancedLimit) item, z11);
        } else if (item instanceof HistoryOrdersUiData$ItemEntity.Market) {
            C45507j.f102536a.m100485d(fragment, c45387i0M100308a, (HistoryOrdersUiData$ItemEntity.Market) item, z11);
        } else {
            if (!(item instanceof HistoryOrdersUiData$ItemEntity.StopMarket)) {
                throw new NoWhenBranchMatchedException();
            }
            C45513p.f102540a.m100495c(fragment, c45387i0M100308a, (HistoryOrdersUiData$ItemEntity.StopMarket) item, z11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m99815d(AbstractC45159c abstractC45159c, BaseFragment baseFragment, HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity, View view) {
        abstractC45159c.mo66121f(baseFragment.getContext(), historyOrdersUiData$ItemEntity);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m99816e(AbstractC45159c abstractC45159c, BaseFragment baseFragment, HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        abstractC45159c.mo66122g(baseFragment.getContext(), historyOrdersUiData$ItemEntity);
        return Unit.INSTANCE;
    }
}
