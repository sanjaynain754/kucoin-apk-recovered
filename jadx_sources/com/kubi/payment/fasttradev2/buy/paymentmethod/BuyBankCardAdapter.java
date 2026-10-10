package com.kubi.payment.fasttradev2.buy.paymentmethod;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.AsyncDifferConfig;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.adapter.KcBaseDifferAdapter;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37614e2;
import p275fy.C37728a;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BuyBankCardAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J(\u0010\u0015\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyBankCardAdapter;", "Lcom/kubi/sdk/adapter/KcBaseDifferAdapter;", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyBankCard;", "Lcom/kubi/sdk/adapter/BaseQuickVH;", "Lcom/kubi/otc/databinding/PaymentItemFastBuyBankcardBinding;", "<init>", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyBankCardListener;", "setListener", "", "removeBankCard", "cardId", "", "onCreateViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "item", "bindData", "binding", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyBankCardAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyBankCardAdapter.kt\ncom/kubi/payment/fasttradev2/buy/paymentmethod/BuyBankCardAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
public final class BuyBankCardAdapter extends KcBaseDifferAdapter<BuyBankCard, C37728a<C37614e2>> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public BuyBankCardListener f39271i;

    /* JADX WARN: Illegal instructions before constructor call */
    public BuyBankCardAdapter() {
        AsyncDifferConfig asyncDifferConfigBuild = new AsyncDifferConfig.Builder(new BuyBankCardItemCallback()).build();
        Intrinsics.checkNotNullExpressionValue(asyncDifferConfigBuild, "build(...)");
        super(asyncDifferConfigBuild, CollectionsKt.emptyList());
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m47804n(BuyBankCardAdapter buyBankCardAdapter, BuyBankCard buyBankCard) {
        BuyBankCardListener buyBankCardListener = buyBankCardAdapter.f39271i;
        if (buyBankCardListener != null) {
            buyBankCardListener.mo47859a(buyBankCard != null ? buyBankCard.getCardId() : null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C37728a<C37614e2> holder, int i11, @Nullable BuyBankCard buyBankCard) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        m47805m((C37614e2) holder.m85032b(), buyBankCard);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C37728a<C37614e2> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        C37614e2 c37614e2M84810c = C37614e2.m84810c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(c37614e2M84810c, "inflate(...)");
        return new C37728a<>(c37614e2M84810c);
    }

    /* JADX INFO: renamed from: q */
    public final void m47808q(@NotNull String cardId) {
        Object next;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Iterator<T> it = getItems().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((BuyBankCard) next).getCardId(), cardId));
        BuyBankCard buyBankCard = (BuyBankCard) next;
        if (buyBankCard == null) {
            return;
        }
        remove(buyBankCard);
    }

    /* JADX INFO: renamed from: r */
    public final void m47809r(@NotNull BuyBankCardListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f39271i = listener;
    }

    /* JADX INFO: renamed from: m */
    public final void m47805m(C37614e2 c37614e2, final BuyBankCard buyBankCard) {
        String iconUrl;
        Context context = c37614e2.getRoot().getContext();
        String title = null;
        if (buyBankCard != null) {
            iconUrl = buyBankCard.getIconUrl();
        } else {
            iconUrl = null;
        }
        C24277v.m58540e(context, C45148b.m99794d(iconUrl), c37614e2.f83841c);
        BaseTextView baseTextView = c37614e2.f83842d;
        if (buyBankCard != null) {
            title = buyBankCard.getTitle();
        }
        baseTextView.setText(C45148b.m99794d(title));
        AppCompatImageView ivDelete = c37614e2.f83840b;
        Intrinsics.checkNotNullExpressionValue(ivDelete, "ivDelete");
        C27046k.m66711z(ivDelete, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyBankCardAdapter.m47804n(this.f39290b, buyBankCard);
            }
        }, 1, null);
    }
}
