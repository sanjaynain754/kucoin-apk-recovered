package com.kubi.tradingbotkit.business.asset.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.kubi.host.HostManager;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$mipmap;
import com.kubi.tradingbotkit.business.asset.adapter.BotAssetsItemAssetsStrategyProxy;
import com.kubi.tradingbotkit.model.assets.BotAssetsTotalItemModel;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.ViewExtKt;
import l50.C42095u;
import o50.C42970d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import rs.AbstractC44173c;
import rs.C44172b;

/* JADX INFO: compiled from: BotAssetsItemProxy.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/adapter/BotAssetsItemAssetsStrategyProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "btradingBotKitItemBotAssetsStrategyBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitItemBotAssetsStrategyBinding;", "createView", "Landroid/view/View;", "bindView", "", "model", "setStrategyLabelVisible", "setFirstSplitVisible", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BotAssetsItemAssetsStrategyProxy extends ViewHolderProxy<BotAssetsTotalItemModel> {

    @Nullable
    private C42095u btradingBotKitItemBotAssetsStrategyBinding;

    @Nullable
    private final ItemCallBack<BotAssetsTotalItemModel> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<BotAssetsTotalItemModel> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotAssetsItemAssetsStrategyProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<BotAssetsTotalItemModel> itemCallBack, @Nullable ItemCallBack<BotAssetsTotalItemModel> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$1(BotAssetsItemAssetsStrategyProxy botAssetsItemAssetsStrategyProxy, BotAssetsTotalItemModel botAssetsTotalItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ItemCallBack<BotAssetsTotalItemModel> shortCall = botAssetsItemAssetsStrategyProxy.getShortCall();
        if (shortCall != null) {
            shortCall.mo24515a(it, botAssetsItemAssetsStrategyProxy.getHolder().getAdapterPosition(), botAssetsTotalItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$2(BotAssetsItemAssetsStrategyProxy botAssetsItemAssetsStrategyProxy, BotAssetsTotalItemModel botAssetsTotalItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ItemCallBack<BotAssetsTotalItemModel> shortCall = botAssetsItemAssetsStrategyProxy.getShortCall();
        if (shortCall != null) {
            shortCall.mo24515a(it, botAssetsItemAssetsStrategyProxy.getHolder().getAdapterPosition(), botAssetsTotalItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$3(BotAssetsItemAssetsStrategyProxy botAssetsItemAssetsStrategyProxy, BotAssetsTotalItemModel botAssetsTotalItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ItemCallBack<BotAssetsTotalItemModel> shortCall = botAssetsItemAssetsStrategyProxy.getShortCall();
        if (shortCall != null) {
            shortCall.mo24515a(it, botAssetsItemAssetsStrategyProxy.getHolder().getAdapterPosition(), botAssetsTotalItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$4(BotAssetsItemAssetsStrategyProxy botAssetsItemAssetsStrategyProxy, BotAssetsTotalItemModel botAssetsTotalItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ItemCallBack<BotAssetsTotalItemModel> shortCall = botAssetsItemAssetsStrategyProxy.getShortCall();
        if (shortCall != null) {
            shortCall.mo24515a(it, botAssetsItemAssetsStrategyProxy.getHolder().getAdapterPosition(), botAssetsTotalItemModel);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull final BotAssetsTotalItemModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.bindView(model);
        String strC = HostManager.a.c();
        C42095u c42095u = this.btradingBotKitItemBotAssetsStrategyBinding;
        if (c42095u != null) {
            if (model.getExpand() || C27039d.m66650j(model.getSubListItemNumber()) <= 0) {
                c42095u.f93286n.setText(model.getName());
                Group groupStrategyAssets = c42095u.f93277e;
                Intrinsics.checkNotNullExpressionValue(groupStrategyAssets, "groupStrategyAssets");
                ViewExtKt.m66577h(groupStrategyAssets);
            } else {
                c42095u.f93286n.setText(model.getFoldName());
                Group groupStrategyAssets2 = c42095u.f93277e;
                Intrinsics.checkNotNullExpressionValue(groupStrategyAssets2, "groupStrategyAssets");
                ViewExtKt.m66594y(groupStrategyAssets2);
            }
            setStrategyLabelVisible(model);
            setFirstSplitVisible(model);
            c42095u.f93285m.setText(model.getDesc());
            ImageView ivGridIcon = c42095u.f93278f;
            Intrinsics.checkNotNullExpressionValue(ivGridIcon, "ivGridIcon");
            C42970d.m94364a(ivGridIcon, strC + model.getIcon(), R$mipmap.ic_placeholder);
            ShowHideTextView tvAssetsNumber = c42095u.f93283k;
            Intrinsics.checkNotNullExpressionValue(tvAssetsNumber, "tvAssetsNumber");
            C44172b.m97383c(tvAssetsNumber, new AbstractC44173c.a(0, false, 3, null), false, 2, null).setText(model.getTotalAssetsShow());
            c42095u.f93289q.setText(model.getTotalProfitShow());
            c42095u.f93287o.setText(model.getTodayProfitsShow());
            c42095u.f93284l.setText(model.getTotalAssetsText());
            c42095u.f93288p.setText(model.getTodayTotalProfitsText());
            ShowHideTextView.m54778d(getHolder().itemView, model.getHideNumber());
            LinearLayout llGridName = c42095u.f93280h;
            Intrinsics.checkNotNullExpressionValue(llGridName, "llGridName");
            ViewExtKt.m66575f(llGridName, new Function1() { // from class: k40.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BotAssetsItemAssetsStrategyProxy.bindView$lambda$5$lambda$1(this.f90974b, model, (View) obj);
                }
            });
            ImageView ivGridIcon2 = c42095u.f93278f;
            Intrinsics.checkNotNullExpressionValue(ivGridIcon2, "ivGridIcon");
            ViewExtKt.m66575f(ivGridIcon2, new Function1() { // from class: k40.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BotAssetsItemAssetsStrategyProxy.bindView$lambda$5$lambda$2(this.f90976b, model, (View) obj);
                }
            });
            KcSecondaryButton btCreate = c42095u.f93276d;
            Intrinsics.checkNotNullExpressionValue(btCreate, "btCreate");
            ViewExtKt.m66575f(btCreate, new Function1() { // from class: k40.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BotAssetsItemAssetsStrategyProxy.bindView$lambda$5$lambda$3(this.f90978b, model, (View) obj);
                }
            });
            ConstraintLayout aggregateAssets = c42095u.f93274b;
            Intrinsics.checkNotNullExpressionValue(aggregateAssets, "aggregateAssets");
            ViewExtKt.m66575f(aggregateAssets, new Function1() { // from class: k40.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BotAssetsItemAssetsStrategyProxy.bindView$lambda$5$lambda$4(this.f90980b, model, (View) obj);
                }
            });
        }
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<BotAssetsTotalItemModel> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<BotAssetsTotalItemModel> getShortCall() {
        return this.shortCall;
    }

    private final void setFirstSplitVisible(BotAssetsTotalItemModel model) {
        View view;
        View view2;
        if (getHolder().getAdapterPosition() == 0 && !model.getCanExpend()) {
            C42095u c42095u = this.btradingBotKitItemBotAssetsStrategyBinding;
            if (c42095u != null && (view2 = c42095u.f93282j) != null) {
                ViewExtKt.m66577h(view2);
                return;
            }
            return;
        }
        C42095u c42095u2 = this.btradingBotKitItemBotAssetsStrategyBinding;
        if (c42095u2 != null && (view = c42095u2.f93282j) != null) {
            ViewExtKt.m66594y(view);
        }
    }

    private final void setStrategyLabelVisible(BotAssetsTotalItemModel model) {
        TextView textView;
        TextView textView2;
        if (C27039d.m66650j(model.getSubListItemNumber()) > 0) {
            C42095u c42095u = this.btradingBotKitItemBotAssetsStrategyBinding;
            if (c42095u != null && (textView2 = c42095u.f93285m) != null) {
                ViewExtKt.m66577h(textView2);
                return;
            }
            return;
        }
        C42095u c42095u2 = this.btradingBotKitItemBotAssetsStrategyBinding;
        if (c42095u2 != null && (textView = c42095u2.f93285m) != null) {
            ViewExtKt.m66594y(textView);
        }
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.btrading_bot_kit_item_bot_assets_strategy, getParent(), false);
        this.btradingBotKitItemBotAssetsStrategyBinding = C42095u.m92345a(viewInflate);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
