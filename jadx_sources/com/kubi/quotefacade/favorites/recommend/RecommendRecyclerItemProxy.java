package com.kubi.quotefacade.favorites.recommend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import bv.C4671h0;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.RecommendItemBean;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
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
import p852kotlin.text.StringsKt;
import rs.C44172b;

/* JADX INFO: compiled from: RecommendRecyclerItemProxy.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/recommend/RecommendRecyclerItemProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/quotefacade/entity/RecommendItemBean;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "binding", "Lcom/kubi/quotefacade/databinding/QuoteItemCommonRecommendBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/QuoteItemCommonRecommendBinding;", "binding$delegate", "Lkotlin/Lazy;", "createView", "Landroid/view/View;", "bindView", "", "itemBean", "configTradePair", "isSpotType", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class RecommendRecyclerItemProxy extends ViewHolderProxy<RecommendItemBean> {

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
    public RecommendRecyclerItemProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<RecommendItemBean> itemCallBack, @Nullable ItemCallBack<RecommendItemBean> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
        this.binding = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.recommend.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendRecyclerItemProxy.binding_delegate$lambda$0(this.f41891b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(RecommendRecyclerItemProxy recommendRecyclerItemProxy, RecommendItemBean recommendItemBean, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ItemCallBack<RecommendItemBean> shortCall = recommendRecyclerItemProxy.getShortCall();
        if (shortCall != null) {
            shortCall.mo24515a(it, recommendRecyclerItemProxy.getHolder().getAdapterPosition(), recommendItemBean);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull final RecommendItemBean itemBean) {
        Intrinsics.checkNotNullParameter(itemBean, "itemBean");
        View itemView = getHolder().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewExtKt.m66575f(itemView, new Function1() { // from class: com.kubi.quotefacade.favorites.recommend.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendRecyclerItemProxy.bindView$lambda$1(this.f41865b, itemBean, (View) obj);
            }
        });
        Integer collectType = itemBean.getCollectType();
        configTradePair(collectType == null || collectType.intValue() != 2, itemBean);
        Object adapterExtraData = getAdapterExtraData();
        C24277v.m58543h(adapterExtraData instanceof Fragment ? (Fragment) adapterExtraData : null, getBinding().f4359c, itemBean.getIconUrl());
        getBinding().f4366j.setChecked(C27025c.m66567e(itemBean.isSelected(), true));
        BaseTextView price = getBinding().f4363g;
        Intrinsics.checkNotNullExpressionValue(price, "price");
        C44172b.m97383c(price, null, false, 3, null).setText(itemBean.lastDealPriceShow());
        getBinding().f4369m.setText(itemBean.changeRateShow());
        getBinding().f4369m.setTextColor(itemBean.changeRateColor());
    }

    @NotNull
    public final C4671h0 getBinding() {
        return (C4671h0) this.binding.getValue();
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
    public static final C4671h0 binding_delegate$lambda$0(RecommendRecyclerItemProxy recommendRecyclerItemProxy) {
        return C4671h0.m4654a(recommendRecyclerItemProxy.getHolder().itemView);
    }

    private final void configTradePair(boolean isSpotType, RecommendItemBean itemBean) {
        String strMo33264M;
        boolean z11;
        int i11;
        boolean zIsForeverContract;
        String quoteCurrencyName;
        BaseTextView baseTextView = getBinding().f4365i;
        if (isSpotType) {
            strMo33264M = itemBean.getBaseCurrencyName();
        } else {
            getBinding().f4367k.setText(StringsKt.trim((CharSequence) C27017c.f54310a.m66516f(R$string.perpetual_contract, "")).toString());
            strMo33264M = IKuMexService.f28731a.get().mo33264M(C27041f.m66668h(itemBean.getSymbolCode()));
        }
        baseTextView.setText(strMo33264M);
        int i12 = 0;
        if (isSpotType && (quoteCurrencyName = itemBean.getQuoteCurrencyName()) != null && quoteCurrencyName.length() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        BaseTextView baseTextView2 = getBinding().f4370n;
        int i13 = 8;
        if (z11) {
            getBinding().f4370n.setText('/' + itemBean.getQuoteCurrencyName());
            i11 = 0;
        } else {
            i11 = 8;
        }
        baseTextView2.setVisibility(i11);
        if (isSpotType) {
            zIsForeverContract = false;
        } else {
            zIsForeverContract = BQuoteFacadeDepend.f42592a.m53023c().mo33295y(C27041f.m66668h(itemBean.getSymbolName())).isForeverContract();
        }
        Group group = getBinding().f4360d;
        if (zIsForeverContract) {
            i13 = 0;
        }
        group.setVisibility(i13);
        ConstraintLayout constraintLayout = getBinding().f4361e;
        if (!z11) {
            i12 = 3;
        }
        constraintLayout.setLayoutDirection(i12);
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.quote_item_common_recommend, getParent(), false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
