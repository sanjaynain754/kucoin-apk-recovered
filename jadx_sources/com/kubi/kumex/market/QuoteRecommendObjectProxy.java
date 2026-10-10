package com.kubi.kumex.market;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.C22890g;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.sdk.util.C24256n1;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33978va;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import rs.C44172b;

/* JADX INFO: compiled from: MarketObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/market/QuoteRecommendObjectProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/kumex/market/RecommendObject;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "createView", "Landroid/view/View;", "bindView", "", "d", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QuoteRecommendObjectProxy extends ViewHolderProxy<RecommendObject> {

    @Nullable
    private final ItemCallBack<RecommendObject> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<RecommendObject> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteRecommendObjectProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<RecommendObject> itemCallBack, @Nullable ItemCallBack<RecommendObject> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createView$lambda$2$lambda$0(QuoteRecommendObjectProxy quoteRecommendObjectProxy, View view, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ItemCallBack<RecommendObject> shortCall = quoteRecommendObjectProxy.getShortCall();
        if (shortCall != null) {
            Intrinsics.checkNotNull(view);
            int adapterPosition = quoteRecommendObjectProxy.getHolder().getAdapterPosition();
            RecommendObject data = quoteRecommendObjectProxy.getData();
            Intrinsics.checkNotNull(data);
            shortCall.mo24515a(view, adapterPosition, data);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createView$lambda$2$lambda$1(QuoteRecommendObjectProxy quoteRecommendObjectProxy, View view, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ItemCallBack<RecommendObject> shortCall = quoteRecommendObjectProxy.getShortCall();
        if (shortCall != null) {
            Intrinsics.checkNotNull(view);
            int adapterPosition = quoteRecommendObjectProxy.getHolder().getAdapterPosition();
            RecommendObject data = quoteRecommendObjectProxy.getData();
            Intrinsics.checkNotNull(data);
            shortCall.mo24515a(view, adapterPosition, data);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @SuppressLint({"SetTextI18n"})
    public void bindView(@NotNull RecommendObject d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        View viewFindViewById = getHolder().itemView.findViewById(R$id.recommendPrice);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textViewM97383c = C44172b.m97383c((TextView) viewFindViewById, null, false, 3, null);
        ((CheckBox) getHolder().itemView.findViewById(R$id.toggle)).setChecked(d11.getF29452a());
        View view = getHolder().itemView;
        int i11 = R$id.recommendSymbol;
        ((TextView) view.findViewById(i11)).setText(d11.getF29455d());
        View viewFindViewById2 = getHolder().itemView.findViewById(i11);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        C24256n1.m58512b((TextView) viewFindViewById2);
        textViewM97383c.setText(d11.getF29456e());
        if (StringsKt.substringAfterLast$default(textViewM97383c.getText().toString(), C33978va.f72339h, (String) null, 2, (Object) null).length() > 10) {
            textViewM97383c.setTextSize(13.0f);
        } else {
            textViewM97383c.setTextSize(18.0f);
        }
        View view2 = getHolder().itemView;
        int i12 = R$id.recommendRate;
        ((TextView) view2.findViewById(i12)).setText(d11.getF29457f());
        TextView textView = (TextView) getHolder().itemView.findViewById(i12);
        Context context = getParent().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(C22890g.m54282g(context, C27039d.m66656p(d11.getF29453b().getPriceChgPct()), 0, 2, null));
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<RecommendObject> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<RecommendObject> getShortCall() {
        return this.shortCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        final View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bkumex_item_quotes_recommend, getParent(), false);
        Intrinsics.checkNotNull(viewInflate);
        ViewExtKt.m66575f(viewInflate, new Function1() { // from class: com.kubi.kumex.market.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteRecommendObjectProxy.createView$lambda$2$lambda$0(this.f29458b, viewInflate, (View) obj);
            }
        });
        View viewFindViewById = viewInflate.findViewById(R$id.toggle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExtKt.m66575f(viewFindViewById, new Function1() { // from class: com.kubi.kumex.market.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteRecommendObjectProxy.createView$lambda$2$lambda$1(this.f29460b, viewInflate, (View) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
