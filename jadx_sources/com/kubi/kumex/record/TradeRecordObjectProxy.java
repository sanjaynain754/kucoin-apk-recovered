package com.kubi.kumex.record;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.resources.C22890g;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27092t0;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RecordObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/record/TradeRecordObjectProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/kumex/record/TradeRecordObject;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "createView", "Landroid/view/View;", "bindView", "", "d", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecordObjects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/TradeRecordObjectProxy\n+ 2 TradeRecordEntityEx.kt\ncom/kubi/kumex/extensions/TradeRecordEntityExKt\n*L\n1#1,1120:1\n12#2:1121\n*S KotlinDebug\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/TradeRecordObjectProxy\n*L\n1085#1:1121\n*E\n"})
public final class TradeRecordObjectProxy extends ViewHolderProxy<TradeRecordObject> {

    @Nullable
    private final ItemCallBack<TradeRecordObject> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<TradeRecordObject> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeRecordObjectProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<TradeRecordObject> itemCallBack, @Nullable ItemCallBack<TradeRecordObject> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @SuppressLint({"SetTextI18n"})
    public void bindView(@NotNull TradeRecordObject d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        ((AppCompatTextView) getHolder().itemView.findViewById(R$id.symbol)).setText(d11.getF30346c());
        AppCompatTextView appCompatTextView = (AppCompatTextView) getHolder().itemView.findViewById(R$id.side);
        appCompatTextView.setText(d11.getF30348e());
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(C22890g.m54281f(context, Intrinsics.areEqual(d11.getF30344a().getSide(), "buy")));
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) getHolder().itemView.findViewById(R$id.tradeType);
        appCompatTextView2.setText(d11.getF30347d());
        Intrinsics.checkNotNull(appCompatTextView2);
        C27046k.m66684G(appCompatTextView2, !TextUtils.isEmpty(d11.getF30347d()));
        ((AppCompatTextView) getHolder().itemView.findViewById(R$id.amountLabel)).setText(C27017c.f54310a.m66516f(R$string.deal_amount, new Object[0]) + '(' + FuturesDisplayNameUtils.f22525a.m24439d(d11.getF30345b()) + ')');
        ((AppCompatTextView) getHolder().itemView.findViewById(R$id.marginMode)).setText(d11.getF30349f());
        ((AppCompatTextView) getHolder().itemView.findViewById(R$id.time)).setText(d11.getF30350g());
        ((AppCompatTextView) getHolder().itemView.findViewById(R$id.amount)).setText(d11.m35825a());
        ((AppCompatTextView) getHolder().itemView.findViewById(R$id.price)).setText(d11.getF30359p());
        ((AppCompatTextView) getHolder().itemView.findViewById(R$id.type)).setText(d11.m35840p());
        boolean z11 = d11.getF30344a().getFillPnl() != null;
        View viewFindViewById = getHolder().itemView.findViewById(R$id.realisedPnlLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66684G(viewFindViewById, z11);
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) getHolder().itemView.findViewById(R$id.realisedPnl);
        Intrinsics.checkNotNull(appCompatTextView3);
        C27046k.m66684G(appCompatTextView3, z11);
        appCompatTextView3.setText(d11.getF30356m());
        Context context2 = appCompatTextView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        appCompatTextView3.setTextColor(C22890g.m54280e(context2, C41014a.m89922G(d11.getF30344a().getFillPnl(), null, 1, null), R$color.c_text));
        ((AppCompatTextView) getHolder().itemView.findViewById(R$id.fee)).setText(d11.getF30354k());
        boolean z12 = d11.getF30357n() != null;
        View viewFindViewById2 = getHolder().itemView.findViewById(R$id.roleLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        C27046k.m66684G(viewFindViewById2, z12);
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) getHolder().itemView.findViewById(R$id.role);
        Intrinsics.checkNotNull(appCompatTextView4);
        C27046k.m66684G(appCompatTextView4, z12);
        appCompatTextView4.setText(d11.getF30357n());
        AppCompatTextView appCompatTextView5 = (AppCompatTextView) getHolder().itemView.findViewById(R$id.trialTag);
        Intrinsics.checkNotNull(appCompatTextView5);
        C27046k.m66684G(appCompatTextView5, d11.getF30344a().isTrialFunds());
        appCompatTextView5.setText(C27092t0.m66896a(d11.getF30344a().getPrizeType()));
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<TradeRecordObject> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<TradeRecordObject> getShortCall() {
        return this.shortCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bkumex_item_trade, getParent(), false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
