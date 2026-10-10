package com.kubi.transfer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c60.C4855i;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.transfer.lib.R$layout;
import com.kubi.transfer.view.TransferCoinPairView;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: TransferCoinPairView.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0 J\u001a\u0010\"\u001a\u00020\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%J\u0010\u0010'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010)\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010\u000fR\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013¨\u0006*"}, m90084d2 = {"Lcom/kubi/transfer/view/TransferCoinPairView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/transfer/lib/databinding/BtransferViewTransferCoinPairBinding;", "getBinding", "()Lcom/kubi/transfer/lib/databinding/BtransferViewTransferCoinPairBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "baseCurrency", "", "getBaseCurrency", "()Ljava/lang/String;", "setBaseCurrency", "(Ljava/lang/String;)V", "quoteCurrency", "getQuoteCurrency", "setQuoteCurrency", "baseBalance", "getBaseBalance", "setBaseBalance", "quoteBalance", "getQuoteBalance", "setQuoteBalance", "bindEvent", "", "baseAction", "Lkotlin/Function0;", "quoteAction", "setCoin", "setBaseCoinSelected", "isSelected", "", "setQuoteCoinSelected", "setBaseAvailableBalance", "balance", "setQuoteAvailableBalance", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransferCoinPairView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferCoinPairView.kt\ncom/kubi/transfer/view/TransferCoinPairView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,84:1\n41#2:85\n65#2:86\n80#2,7:87\n*S KotlinDebug\n*F\n+ 1 TransferCoinPairView.kt\ncom/kubi/transfer/view/TransferCoinPairView\n*L\n24#1:85\n24#1:86\n24#1:87,7\n*E\n"})
public final class TransferCoinPairView extends ConstraintLayout {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ KProperty<Object>[] f52965s = {Reflection.property1(new PropertyReference1Impl(TransferCoinPairView.class, "binding", "getBinding()Lcom/kubi/transfer/lib/databinding/BtransferViewTransferCoinPairBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f52966n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public String f52967o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public String f52968p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public String f52969q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public String f52970r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferCoinPairView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52966n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4855i>() { // from class: com.kubi.transfer.view.TransferCoinPairView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4855i invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4855i.m4985a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.btransfer_view_transfer_coin_pair, this);
        setQuoteCoinSelected(true);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m64819d(C4855i c4855i, TransferCoinPairView transferCoinPairView, Function0 function0) {
        if (!c4855i.f5003d.isSelected()) {
            transferCoinPairView.setBaseCoinSelected(true);
            transferCoinPairView.setQuoteCoinSelected(false);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m64820e(C4855i c4855i, TransferCoinPairView transferCoinPairView, Function0 function0) {
        if (!c4855i.f5004e.isSelected()) {
            transferCoinPairView.setBaseCoinSelected(false);
            transferCoinPairView.setQuoteCoinSelected(true);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final C4855i getBinding() {
        return (C4855i) this.f52966n.getValue(this, f52965s[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m64821c(@NotNull final Function0<Unit> baseAction, @NotNull final Function0<Unit> quoteAction) {
        Intrinsics.checkNotNullParameter(baseAction, "baseAction");
        Intrinsics.checkNotNullParameter(quoteAction, "quoteAction");
        final C4855i binding = getBinding();
        if (binding != null) {
            ShapeConstraintLayout layoutBaseCoin = binding.f5003d;
            Intrinsics.checkNotNullExpressionValue(layoutBaseCoin, "layoutBaseCoin");
            C27046k.m66711z(layoutBaseCoin, 0L, new Function0() { // from class: h60.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferCoinPairView.m64819d(binding, this, baseAction);
                }
            }, 1, null);
            ShapeConstraintLayout layoutQuoteCoin = binding.f5004e;
            Intrinsics.checkNotNullExpressionValue(layoutQuoteCoin, "layoutQuoteCoin");
            C27046k.m66711z(layoutQuoteCoin, 0L, new Function0() { // from class: h60.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferCoinPairView.m64820e(binding, this, quoteAction);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m64822f(@Nullable String str, @Nullable String str2) {
        this.f52967o = str;
        this.f52968p = str2;
        C37890n c37890n = C37890n.f85269a;
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(C27041f.m66668h(str));
        C4855i binding = getBinding();
        if (binding != null) {
            C24277v.m58542g(binding.f5001b, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null);
            binding.f5007h.setText(C27041f.m66677q(C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null)));
            CoinInfoEntity coinInfoEntityM85613u2 = c37890n.m85613u(C27041f.m66668h(str2));
            C24277v.m58542g(binding.f5002c, coinInfoEntityM85613u2 != null ? coinInfoEntityM85613u2.getIconUrl() : null);
            binding.f5009j.setText(C27041f.m66677q(C27041f.m66668h(coinInfoEntityM85613u2 != null ? coinInfoEntityM85613u2.getCurrency() : null)));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getBaseBalance, reason: from getter */
    public final String getF52969q() {
        return this.f52969q;
    }

    @Nullable
    /* JADX INFO: renamed from: getBaseCurrency, reason: from getter */
    public final String getF52967o() {
        return this.f52967o;
    }

    @Nullable
    /* JADX INFO: renamed from: getQuoteBalance, reason: from getter */
    public final String getF52970r() {
        return this.f52970r;
    }

    @Nullable
    /* JADX INFO: renamed from: getQuoteCurrency, reason: from getter */
    public final String getF52968p() {
        return this.f52968p;
    }

    public final void setBaseAvailableBalance(@Nullable String balance) {
        TextView textView;
        this.f52969q = C27041f.m66669i(balance, "--");
        C4855i binding = getBinding();
        if (binding == null || (textView = binding.f5006g) == null) {
            return;
        }
        textView.setText(this.f52969q);
    }

    public final void setBaseBalance(@Nullable String str) {
        this.f52969q = str;
    }

    public final void setBaseCurrency(@Nullable String str) {
        this.f52967o = str;
    }

    public final void setQuoteAvailableBalance(@Nullable String balance) {
        TextView textView;
        this.f52970r = C27041f.m66669i(balance, "--");
        C4855i binding = getBinding();
        if (binding == null || (textView = binding.f5008i) == null) {
            return;
        }
        textView.setText(this.f52970r);
    }

    public final void setQuoteBalance(@Nullable String str) {
        this.f52970r = str;
    }

    public final void setQuoteCurrency(@Nullable String str) {
        this.f52968p = str;
    }

    public final void setBaseCoinSelected(boolean isSelected) {
        ShapeConstraintLayout shapeConstraintLayout;
        C4855i binding = getBinding();
        if (binding != null && (shapeConstraintLayout = binding.f5003d) != null) {
            shapeConstraintLayout.setSelected(isSelected);
        }
    }

    public final void setQuoteCoinSelected(boolean isSelected) {
        ShapeConstraintLayout shapeConstraintLayout;
        C4855i binding = getBinding();
        if (binding != null && (shapeConstraintLayout = binding.f5004e) != null) {
            shapeConstraintLayout.setSelected(isSelected);
        }
    }
}
