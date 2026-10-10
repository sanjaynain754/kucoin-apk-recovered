package com.kubi.kucoin.home.cards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.ViewKt;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CardViewHolderProxy.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H&J\u001d\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/kucoin/home/cards/CardViewHolderProxy;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/kucoin/home/cards/BaseCardData;", "Lcom/kubi/sdk/ViewHolderProxy;", "card", "Lcom/kubi/kucoin/home/cards/BaseCard;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "", "longCall", "<init>", "(Lcom/kubi/kucoin/home/cards/BaseCard;Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "id", "", "Ljava/lang/Integer;", "init", "", "createView", "Landroid/view/View;", "onViewAttachedToWindow", "", "bindView", "d", "(Lcom/kubi/kucoin/home/cards/BaseCardData;)V", "onCardAddException", "throwable", "", "onCardExposure", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "data", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/kubi/kucoin/home/cards/BaseCardData;)V", "destroyCard", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class CardViewHolderProxy<T extends BaseCardData> extends ViewHolderProxy<T> {

    @NotNull
    private final BaseCard card;

    @Nullable
    private Integer id;
    private boolean init;

    @Nullable
    private final ItemCallBack<String> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<String> shortCall;

    /* JADX INFO: renamed from: com.kubi.kucoin.home.cards.CardViewHolderProxy$a */
    /* JADX INFO: compiled from: CardViewHolderProxy.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kucoin/home/cards/CardViewHolderProxy$bindView$1", "Lcom/kubi/kucoin/home/cards/IExposureCallback;", TIMPushProvider.f75062n, "", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15376a implements IExposureCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CardViewHolderProxy<T> f27855a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ T f27856b;

        public C15376a(CardViewHolderProxy<T> cardViewHolderProxy, T t11) {
            this.f27855a = cardViewHolderProxy;
            this.f27856b = t11;
        }

        @Override // com.kubi.kucoin.home.cards.IExposureCallback
        public void show() {
            CardViewHolderProxy<T> cardViewHolderProxy = this.f27855a;
            cardViewHolderProxy.onCardExposure(cardViewHolderProxy.getHolder(), this.f27856b);
        }
    }

    public abstract void onCardAddException(@NotNull Throwable throwable);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardViewHolderProxy(@NotNull BaseCard card, @NotNull ViewGroup parent, @Nullable ItemCallBack<String> itemCallBack, @Nullable ItemCallBack<String> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.card = card;
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull T d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        getHolder().itemView.setLayoutParams(new ViewGroup.LayoutParams(ExtensionKt.m32188n(d11.getWidth()), ExtensionKt.m32188n(d11.getHeight())));
        this.card.m32166d3(d11);
        View itemView = getHolder().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ExtensionKt.m32178d(itemView, new C15376a(this, d11), 0.0f, 0, 6, null);
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        Context context = getParent().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(View.generateViewId());
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
            View itemView = getHolder().itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ExtensionKt.m32187m(ViewKt.findFragment(itemView), view.getId(), this.card, null, 4, null);
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
}
