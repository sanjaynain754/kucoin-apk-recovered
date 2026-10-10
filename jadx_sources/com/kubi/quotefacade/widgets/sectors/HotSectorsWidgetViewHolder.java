package com.kubi.quotefacade.widgets.sectors;

import android.view.ViewGroup;
import com.kubi.home.api.HomeCardViewHolderProxyV2;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.sdk.ItemCallBack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeHotSectors.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/sectors/HotSectorsWidgetViewHolder;", "Lcom/kubi/home/api/HomeCardViewHolderProxyV2;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HotSectorsWidgetViewHolder extends HomeCardViewHolderProxyV2<BaseCardDataV2> {

    @Nullable
    private final ItemCallBack<String> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<String> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotSectorsWidgetViewHolder(@NotNull ViewGroup parent, @Nullable ItemCallBack<String> itemCallBack, @Nullable ItemCallBack<String> itemCallBack2) {
        super(new HotSectorsWidget(), parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    @Override // com.kubi.home.api.HomeCardViewHolderProxyV2, com.kubi.kucoin.home.p090v2.cards.CardViewHolderProxyV2, com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<String> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.home.api.HomeCardViewHolderProxyV2, com.kubi.kucoin.home.p090v2.cards.CardViewHolderProxyV2, com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.home.api.HomeCardViewHolderProxyV2, com.kubi.kucoin.home.p090v2.cards.CardViewHolderProxyV2, com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<String> getShortCall() {
        return this.shortCall;
    }
}
