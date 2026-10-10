package com.kubi.quotefacade.favorites.recommend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv.C4675j0;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.chain.C21781i;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.entity.RecommendItemBean;
import com.kubi.quotefacade.helper.C22212u1;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ChainCoinLogoView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import rs.C44172b;

/* JADX INFO: compiled from: RecommendRecyclerAlphaItemProxy.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/recommend/RecommendRecyclerAlphaItemProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/quotefacade/entity/RecommendItemBean;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "binding", "Lcom/kubi/quotefacade/databinding/QuoteItemRecommendAlphaBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/QuoteItemRecommendAlphaBinding;", "binding$delegate", "Lkotlin/Lazy;", "createView", "Landroid/view/View;", "bindView", "", "d", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class RecommendRecyclerAlphaItemProxy extends ViewHolderProxy<RecommendItemBean> {

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy binding;

    @Nullable
    private final ItemCallBack<RecommendItemBean> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<RecommendItemBean> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendRecyclerAlphaItemProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<RecommendItemBean> itemCallBack, @Nullable ItemCallBack<RecommendItemBean> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
        this.binding = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.recommend.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendRecyclerAlphaItemProxy.binding_delegate$lambda$0(this.f41888b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(RecommendRecyclerAlphaItemProxy recommendRecyclerAlphaItemProxy, RecommendItemBean recommendItemBean, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ItemCallBack<RecommendItemBean> shortCall = recommendRecyclerAlphaItemProxy.getShortCall();
        if (shortCall != null) {
            shortCall.mo24515a(it, recommendRecyclerAlphaItemProxy.getHolder().getBindingAdapterPosition(), recommendItemBean);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull final RecommendItemBean d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        AlphaItemEntity alphaItemEntity = d11.getAlphaItemEntity();
        if (alphaItemEntity == null) {
            return;
        }
        View itemView = getHolder().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewExtKt.m66575f(itemView, new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendRecyclerAlphaItemProxy.bindView$lambda$1(this.f41889b, d11, (View) obj);
            }
        });
        ChainCoinLogoView.m54460h(getBinding().f4382d, C27041f.m66668h(alphaItemEntity.getTokenIcon()), C27041f.m66668h(alphaItemEntity.getChainIcon()), C27041f.m66668h(alphaItemEntity.getDisplayToken()), 20, null, null, 48, null);
        getBinding().f4385g.setText(C27041f.m66669i(alphaItemEntity.getDisplayToken(), "--"));
        BaseTextView price = getBinding().f4383e;
        Intrinsics.checkNotNullExpressionValue(price, "price");
        C44172b.m97383c(price, null, false, 3, null).setText(C22212u1.m52119a(alphaItemEntity.getPrice()));
        getBinding().f4386h.setText(C21781i.m50835a(alphaItemEntity.getPriceRate(), false));
        ShowHideTextView showHideTextView = getBinding().f4386h;
        Context context = getParent().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        showHideTextView.setTextColor(C22890g.m54278c(context, C27039d.m66647g(alphaItemEntity.getPriceRate()), R$color.c_text40));
        getBinding().f4384f.setChecked(C27025c.m66567e(d11.isSelected(), true));
    }

    @NotNull
    public final C4675j0 getBinding() {
        return (C4675j0) this.binding.getValue();
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<RecommendItemBean> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<RecommendItemBean> getShortCall() {
        return this.shortCall;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4675j0 binding_delegate$lambda$0(RecommendRecyclerAlphaItemProxy recommendRecyclerAlphaItemProxy) {
        return C4675j0.m4662a(recommendRecyclerAlphaItemProxy.getHolder().itemView);
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.quote_item_recommend_alpha, getParent(), false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
