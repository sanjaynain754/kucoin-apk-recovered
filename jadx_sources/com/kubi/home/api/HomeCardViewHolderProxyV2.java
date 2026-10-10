package com.kubi.home.api;

import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.home.api.exception.HomeApiException;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.BaseCardV2;
import com.kubi.kucoin.home.p090v2.cards.CardViewHolderProxyV2;
import com.kubi.sdk.ItemCallBack;
import com.kubi.utils.extensions.C27023a;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: HomeCardViewHolderProxyV2.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001d\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/home/api/HomeCardViewHolderProxyV2;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "Lcom/kubi/kucoin/home/v2/cards/CardViewHolderProxyV2;", "card", "Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "", "longCall", "<init>", "(Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "onCardAddException", "", "throwable", "", "onCardExposure", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "data", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;)V", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeCardViewHolderProxyV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCardViewHolderProxyV2.kt\ncom/kubi/home/api/HomeCardViewHolderProxyV2\n+ 2 HomeIssue.kt\ncom/kubi/home/api/exception/HomeIssueKt\n*L\n1#1,39:1\n44#2,2:40\n*S KotlinDebug\n*F\n+ 1 HomeCardViewHolderProxyV2.kt\ncom/kubi/home/api/HomeCardViewHolderProxyV2\n*L\n31#1:40,2\n*E\n"})
public abstract class HomeCardViewHolderProxyV2<T extends BaseCardDataV2> extends CardViewHolderProxyV2<T> {

    @NotNull
    private final BaseCardV2 card;

    @Nullable
    private final ItemCallBack<String> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<String> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeCardViewHolderProxyV2(@NotNull BaseCardV2 card, @NotNull ViewGroup parent, @Nullable ItemCallBack<String> itemCallBack, @Nullable ItemCallBack<String> itemCallBack2) {
        super(card, parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.card = card;
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.CardViewHolderProxyV2, com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<String> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.CardViewHolderProxyV2, com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.CardViewHolderProxyV2, com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<String> getShortCall() {
        return this.shortCall;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.CardViewHolderProxyV2
    public void onCardExposure(@NotNull RecyclerView.ViewHolder holder, @NotNull T data) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        String code = data.getCode();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject, 4, null);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.CardViewHolderProxyV2
    public void onCardAddException(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        C44128b.m97263g("home_card", throwable);
        C43846g.m96568c(new HomeApiException(throwable, "WidgetException", false, null, 8, null), null, 2, null);
    }
}
