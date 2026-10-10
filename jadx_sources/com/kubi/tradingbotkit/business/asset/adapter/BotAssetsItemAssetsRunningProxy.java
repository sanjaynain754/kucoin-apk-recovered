package com.kubi.tradingbotkit.business.asset.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.business.asset.adapter.BotAssetsItemAssetsRunningProxy;
import com.kubi.tradingbotkit.model.assets.BotAssetsTotalItemModel;
import com.kubi.utils.extensions.core.ViewExtKt;
import k40.C40902i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BotAssetsItemProxy.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/adapter/BotAssetsItemAssetsRunningProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "createView", "Landroid/view/View;", "bindView", "", "model", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BotAssetsItemAssetsRunningProxy extends ViewHolderProxy<BotAssetsTotalItemModel> {

    @Nullable
    private final ItemCallBack<BotAssetsTotalItemModel> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<BotAssetsTotalItemModel> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotAssetsItemAssetsRunningProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<BotAssetsTotalItemModel> itemCallBack, @Nullable ItemCallBack<BotAssetsTotalItemModel> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$0(BotAssetsItemAssetsRunningProxy botAssetsItemAssetsRunningProxy, BotAssetsTotalItemModel botAssetsTotalItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ItemCallBack<BotAssetsTotalItemModel> shortCall = botAssetsItemAssetsRunningProxy.getShortCall();
        if (shortCall != null) {
            shortCall.mo24515a(it, botAssetsItemAssetsRunningProxy.getHolder().getAdapterPosition(), botAssetsTotalItemModel);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull final BotAssetsTotalItemModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.bindView(model);
        new C40902i().m89590i(getHolder(), model);
        View itemView = getHolder().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewExtKt.m66575f(itemView, new Function1() { // from class: k40.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BotAssetsItemAssetsRunningProxy.bindView$lambda$0(this.f90972b, model, (View) obj);
            }
        });
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

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.btrading_bot_kit_item_bot_assets_running, getParent(), false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
