package com.kubi.kucoin.home.p090v2.cards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.ViewKt;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.kucoin.home.cards.IExposureCallback;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: CardViewHolderProxyV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J'\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00028\u00002\u0010\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0016¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)H&J\u001d\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010.J\u0006\u0010/\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/kucoin/home/v2/cards/CardViewHolderProxyV2;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "Lcom/kubi/sdk/ViewHolderProxy;", "card", "Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "", "longCall", "<init>", "(Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "id", "", "Ljava/lang/Integer;", "init", "", "createView", "Landroid/view/View;", "onViewAttachedToWindow", "", "trackTimeCost", "code", "time", "", "bindView", "d", "(Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;)V", "payload", "", "", "(Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;Ljava/util/List;)V", "onCardAddException", "throwable", "", "onCardExposure", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "data", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;)V", "destroyCard", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class CardViewHolderProxyV2<T extends BaseCardDataV2> extends ViewHolderProxy<T> {

    @NotNull
    private final BaseCardV2 card;

    @Nullable
    private Integer id;
    private boolean init;

    @Nullable
    private final ItemCallBack<String> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<String> shortCall;

    /* JADX INFO: renamed from: com.kubi.kucoin.home.v2.cards.CardViewHolderProxyV2$a */
    /* JADX INFO: compiled from: CardViewHolderProxyV2.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kucoin/home/v2/cards/CardViewHolderProxyV2$bindView$1", "Lcom/kubi/kucoin/home/cards/IExposureCallback;", TIMPushProvider.f75062n, "", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15400a implements IExposureCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CardViewHolderProxyV2<T> f27913a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ T f27914b;

        public C15400a(CardViewHolderProxyV2<T> cardViewHolderProxyV2, T t11) {
            this.f27913a = cardViewHolderProxyV2;
            this.f27914b = t11;
        }

        @Override // com.kubi.kucoin.home.cards.IExposureCallback
        public void show() {
            CardViewHolderProxyV2<T> cardViewHolderProxyV2 = this.f27913a;
            cardViewHolderProxyV2.onCardExposure(cardViewHolderProxyV2.getHolder(), this.f27914b);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.home.v2.cards.CardViewHolderProxyV2$b */
    /* JADX INFO: compiled from: CardViewHolderProxyV2.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kucoin/home/v2/cards/CardViewHolderProxyV2$bindView$2", "Lcom/kubi/kucoin/home/cards/IExposureCallback;", TIMPushProvider.f75062n, "", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15401b implements IExposureCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CardViewHolderProxyV2<T> f27915a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ T f27916b;

        public C15401b(CardViewHolderProxyV2<T> cardViewHolderProxyV2, T t11) {
            this.f27915a = cardViewHolderProxyV2;
            this.f27916b = t11;
        }

        @Override // com.kubi.kucoin.home.cards.IExposureCallback
        public void show() {
            CardViewHolderProxyV2<T> cardViewHolderProxyV2 = this.f27915a;
            cardViewHolderProxyV2.onCardExposure(cardViewHolderProxyV2.getHolder(), this.f27916b);
        }
    }

    public abstract void onCardAddException(@NotNull Throwable throwable);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardViewHolderProxyV2(@NotNull BaseCardV2 card, @NotNull ViewGroup parent, @Nullable ItemCallBack<String> itemCallBack, @Nullable ItemCallBack<String> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.card = card;
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    private final void trackTimeCost(String code, long time) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "home_card_init_time_cost");
        jSONObject.put("Busi_Type", code);
        jSONObject.put(C33820nf.f71150f, "true-false");
        jSONObject.put("duration1", time);
        C43852m.m96605q("duration_event", jSONObject);
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public /* bridge */ /* synthetic */ void bindView(Object obj, List list) {
        bindView((BaseCardDataV2) obj, (List<? extends Object>) list);
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        Context context = getParent().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(View.generateViewId());
        fragmentContainerView.setClipChildren(false);
        return fragmentContainerView;
    }

    public final void destroyCard() {
        Fragment parentFragment = this.card.getParentFragment();
        if (parentFragment != null) {
            ExtensionKt.m32185k(parentFragment, this.card);
        }
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<String> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<String> getShortCall() {
        return this.shortCall;
    }

    public void onCardExposure(@NotNull RecyclerView.ViewHolder holder, @NotNull T data) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void onViewAttachedToWindow() {
        Object objM103844constructorimpl;
        if (this.init) {
            return;
        }
        this.init = true;
        View view = getHolder().itemView;
        try {
            Result.Companion companion = Result.INSTANCE;
            long jCurrentTimeMillis = System.currentTimeMillis();
            View itemView = getHolder().itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ExtensionKt.m32187m(ViewKt.findFragment(itemView), view.getId(), this.card, null, 4, null);
            BaseCardDataV2 f27909u = this.card.getF27909U();
            String code = f27909u != null ? f27909u.getCode() : null;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            trackTimeCost(code, jCurrentTimeMillis2);
            C44128b.m97259c("CardViewHolderProxyV2", "[onViewAttachedToWindow] timeCost:" + jCurrentTimeMillis2 + ", card:" + code);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            onCardAddException(thM103847exceptionOrNullimpl);
        }
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull T d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        BaseCardV2.m32238e3(this.card, d11, false, 2, null);
        View itemView = getHolder().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ExtensionKt.m32178d(itemView, new C15400a(this, d11), 0.0f, 0, 6, null);
    }

    public void bindView(@NotNull T d11, @Nullable List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(d11, "d");
        if (list != null && !list.isEmpty()) {
            this.card.m32239d3(d11, true);
            View itemView = getHolder().itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ExtensionKt.m32178d(itemView, new C15401b(this, d11), 0.0f, 0, 6, null);
            return;
        }
        bindView((BaseCardDataV2) d11);
    }
}
