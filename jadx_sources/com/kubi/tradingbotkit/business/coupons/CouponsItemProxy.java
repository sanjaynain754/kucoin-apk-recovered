package com.kubi.tradingbotkit.business.coupons;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.model.AllCouponsItemModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33556b3;
import java.math.BigDecimal;
import l50.C42096v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CouponsItemProxy.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coupons/CouponsItemProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "btradingBotKitItemCouponsBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitItemCouponsBinding;", "createView", "Landroid/view/View;", "bindView", "", "model", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CouponsItemProxy extends ViewHolderProxy<AllCouponsItemModel> {

    @Nullable
    private C42096v btradingBotKitItemCouponsBinding;

    @Nullable
    private final ItemCallBack<AllCouponsItemModel> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<AllCouponsItemModel> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponsItemProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<AllCouponsItemModel> itemCallBack, @Nullable ItemCallBack<AllCouponsItemModel> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$3(CouponsItemProxy couponsItemProxy, AllCouponsItemModel allCouponsItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ItemCallBack<AllCouponsItemModel> shortCall = couponsItemProxy.getShortCall();
        if (shortCall != null) {
            shortCall.mo24515a(it, couponsItemProxy.getHolder().getAdapterPosition(), allCouponsItemModel);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull final AllCouponsItemModel model) {
        BigDecimal bigDecimalMultiply;
        Intrinsics.checkNotNullParameter(model, "model");
        super.bindView(model);
        C42096v c42096v = this.btradingBotKitItemCouponsBinding;
        if (c42096v != null) {
            AppCompatTextView appCompatTextView = c42096v.f93295f;
            BigDecimal discountPercentageShowBd = model.getDiscountPercentageShowBd();
            appCompatTextView.setText(C42180b.m92647l((discountPercentageShowBd == null || (bigDecimalMultiply = discountPercentageShowBd.multiply(new BigDecimal(C33556b3.f68995S))) == null) ? null : C42180b.m92640e(bigDecimalMultiply, null, 0, false, false, false, 0, null, 125, null)));
            c42096v.f93297h.setText(model.getDiscountTitle());
            c42096v.f93294e.setText(model.getDiscountExpireDate());
            c42096v.f93291b.setText(C27017c.f54310a.m66516f(R$string.kc_tb_coupon_receive_title, new Object[0]));
            c42096v.f93296g.setText(model.getShowTypeName());
            AppCompatTextView btUseCoupons = c42096v.f93291b;
            Intrinsics.checkNotNullExpressionValue(btUseCoupons, "btUseCoupons");
            ViewExtKt.m66575f(btUseCoupons, new Function1() { // from class: com.kubi.tradingbotkit.business.coupons.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CouponsItemProxy.bindView$lambda$4$lambda$3(this.f52302b, model, (View) obj);
                }
            });
        }
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<AllCouponsItemModel> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<AllCouponsItemModel> getShortCall() {
        return this.shortCall;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createView$lambda$1$lambda$0(CouponsItemProxy couponsItemProxy, View view) {
        ItemCallBack<AllCouponsItemModel> shortCall = couponsItemProxy.getShortCall();
        if (shortCall != null) {
            Intrinsics.checkNotNull(view);
            int adapterPosition = couponsItemProxy.getHolder().getAdapterPosition();
            AllCouponsItemModel data = couponsItemProxy.getData();
            Intrinsics.checkNotNull(data);
            shortCall.mo24515a(view, adapterPosition, data);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        final View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.btrading_bot_kit_item_coupons, getParent(), false);
        Intrinsics.checkNotNull(viewInflate);
        C27046k.m66711z(viewInflate, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CouponsItemProxy.createView$lambda$1$lambda$0(this.f52304b, viewInflate);
            }
        }, 1, null);
        this.btradingBotKitItemCouponsBinding = C42096v.m92347a(viewInflate);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
