package com.kubi.margin.trade.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.R$color;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.trade.MarginConfigManager;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.tradebase.marketamount.MarketAmountUnit;
import com.kubi.utils.C27080p0;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import mp.C42579a;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36913g;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: MarginConfirmDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0017J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006 "}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "<init>", "()V", "bmarginDialogMarginDelegationConfirmBinding", "Lcom/kubi/margin/databinding/BmarginDialogMarginDelegationConfirmBinding;", "getBmarginDialogMarginDelegationConfirmBinding", "()Lcom/kubi/margin/databinding/BmarginDialogMarginDelegationConfirmBinding;", "bmarginDialogMarginDelegationConfirmBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "config", "Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;", "getConfig", "()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;", "config$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "showRateTipsDialog", "showBorrowFixDialog", "fetchDayRate", "ConfirmDialogConfig", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginConfirmDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginConfirmDialog.kt\ncom/kubi/margin/trade/dialog/MarginConfirmDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,283:1\n143#2,20:284\n*S KotlinDebug\n*F\n+ 1 MarginConfirmDialog.kt\ncom/kubi/margin/trade/dialog/MarginConfirmDialog\n*L\n45#1:284,20\n*E\n"})
public final class MarginConfirmDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC24293a f33769c0 = C45681e.m100799e(this, new Function1<MarginConfirmDialog, C36913g>() { // from class: com.kubi.margin.trade.dialog.MarginConfirmDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36913g invoke(@NotNull MarginConfirmDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36913g.m82695a(fragment.requireView());
        }
    }, new Function1<C36913g, Unit>() { // from class: com.kubi.margin.trade.dialog.MarginConfirmDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36913g it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36913g c36913g) {
            invoke(c36913g);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f33770d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.dialog.k0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginConfirmDialog.m40146K3(this.f33822b);
        }
    });

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ KProperty<Object>[] f33768f0 = {Reflection.property1(new PropertyReference1Impl(MarginConfirmDialog.class, "bmarginDialogMarginDelegationConfirmBinding", "getBmarginDialogMarginDelegationConfirmBinding()Lcom/kubi/margin/databinding/BmarginDialogMarginDelegationConfirmBinding;", 0))};

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f33767e0 = new Companion(null);

    /* JADX INFO: compiled from: MarginConfirmDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;", "config", "Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarginConfirmDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginConfirmDialog.kt\ncom/kubi/margin/trade/dialog/MarginConfirmDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n1#2:284\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginConfirmDialog newInstance(@NotNull ConfirmDialogConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            MarginConfirmDialog marginConfirmDialog = new MarginConfirmDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", config);
            marginConfirmDialog.setArguments(bundle);
            return marginConfirmDialog;
        }
    }

    /* JADX INFO: compiled from: MarginConfirmDialog.kt */
    @Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010=\u001a\u00020\nHÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010@\u001a\u00020\u0014HÆ\u0003J\t\u0010A\u001a\u00020\u0014HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0019HÆ\u0003JÐ\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010FJ\u0006\u0010G\u001a\u00020HJ\u0013\u0010I\u001a\u00020\u00032\b\u0010J\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010L\u001a\u00020HHÖ\u0001J\t\u0010M\u001a\u00020\u0006HÖ\u0001J\u0016\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020HR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u0002\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006S"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;", "Landroid/os/Parcelable;", "isReverse", "", "isBuy", "tradeTypeString", "", "symbol", "Lcom/kubi/data/entity/SymbolInfoEntity;", "realAvailable", "Ljava/math/BigDecimal;", "borrowSize", "isBorrowFix", FirebaseAnalytics.Param.CURRENCY, "borrowMinAmount", "borrowMinUnit", "orderAmount", "feeAmount", "taxAmount", "feeAsset", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "thisAsset", "callBackKey", "marketDisplayAmount", "marketAmountUnit", "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "<init>", "(Ljava/lang/Boolean;ZLjava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/tradebase/entity/CurrencyBalance;Lcom/kubi/tradebase/entity/CurrencyBalance;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/tradebase/marketamount/MarketAmountUnit;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getTradeTypeString", "()Ljava/lang/String;", "getSymbol", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getRealAvailable", "()Ljava/math/BigDecimal;", "getBorrowSize", "getCurrency", "getBorrowMinAmount", "getBorrowMinUnit", "getOrderAmount", "getFeeAmount", "getTaxAmount", "getFeeAsset", "()Lcom/kubi/tradebase/entity/CurrencyBalance;", "getThisAsset", "getCallBackKey", "getMarketDisplayAmount", "getMarketAmountUnit", "()Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/Boolean;ZLjava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/tradebase/entity/CurrencyBalance;Lcom/kubi/tradebase/entity/CurrencyBalance;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/tradebase/marketamount/MarketAmountUnit;)Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ConfirmDialogConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ConfirmDialogConfig> CREATOR = new C18220a();

        @Nullable
        private final BigDecimal borrowMinAmount;

        @Nullable
        private final BigDecimal borrowMinUnit;

        @NotNull
        private final BigDecimal borrowSize;

        @NotNull
        private final String callBackKey;

        @Nullable
        private final String currency;

        @NotNull
        private final BigDecimal feeAmount;

        @NotNull
        private final CurrencyBalance feeAsset;
        private final boolean isBorrowFix;
        private final boolean isBuy;

        @Nullable
        private final Boolean isReverse;

        @Nullable
        private final MarketAmountUnit marketAmountUnit;

        @Nullable
        private final BigDecimal marketDisplayAmount;

        @NotNull
        private final BigDecimal orderAmount;

        @NotNull
        private final BigDecimal realAvailable;

        @NotNull
        private final SymbolInfoEntity symbol;

        @Nullable
        private final BigDecimal taxAmount;

        @NotNull
        private final CurrencyBalance thisAsset;

        @NotNull
        private final String tradeTypeString;

        /* JADX INFO: renamed from: com.kubi.margin.trade.dialog.MarginConfirmDialog$ConfirmDialogConfig$a */
        /* JADX INFO: compiled from: MarginConfirmDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C18220a implements Parcelable.Creator<ConfirmDialogConfig> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ConfirmDialogConfig createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                boolean z11;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z12 = false;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    z12 = true;
                    z11 = true;
                } else {
                    z11 = true;
                }
                return new ConfirmDialogConfig(boolValueOf, z12, parcel.readString(), (SymbolInfoEntity) parcel.readParcelable(ConfirmDialogConfig.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? z11 : false, parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (CurrencyBalance) parcel.readParcelable(ConfirmDialogConfig.class.getClassLoader()), (CurrencyBalance) parcel.readParcelable(ConfirmDialogConfig.class.getClassLoader()), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : MarketAmountUnit.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ConfirmDialogConfig[] newArray(int i11) {
                return new ConfirmDialogConfig[i11];
            }
        }

        public ConfirmDialogConfig(@Nullable Boolean bool, boolean z11, @NotNull String tradeTypeString, @NotNull SymbolInfoEntity symbol, @NotNull BigDecimal realAvailable, @NotNull BigDecimal borrowSize, boolean z12, @Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @NotNull BigDecimal orderAmount, @NotNull BigDecimal feeAmount, @Nullable BigDecimal bigDecimal3, @NotNull CurrencyBalance feeAsset, @NotNull CurrencyBalance thisAsset, @NotNull String callBackKey, @Nullable BigDecimal bigDecimal4, @Nullable MarketAmountUnit marketAmountUnit) {
            Intrinsics.checkNotNullParameter(tradeTypeString, "tradeTypeString");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(realAvailable, "realAvailable");
            Intrinsics.checkNotNullParameter(borrowSize, "borrowSize");
            Intrinsics.checkNotNullParameter(orderAmount, "orderAmount");
            Intrinsics.checkNotNullParameter(feeAmount, "feeAmount");
            Intrinsics.checkNotNullParameter(feeAsset, "feeAsset");
            Intrinsics.checkNotNullParameter(thisAsset, "thisAsset");
            Intrinsics.checkNotNullParameter(callBackKey, "callBackKey");
            this.isReverse = bool;
            this.isBuy = z11;
            this.tradeTypeString = tradeTypeString;
            this.symbol = symbol;
            this.realAvailable = realAvailable;
            this.borrowSize = borrowSize;
            this.isBorrowFix = z12;
            this.currency = str;
            this.borrowMinAmount = bigDecimal;
            this.borrowMinUnit = bigDecimal2;
            this.orderAmount = orderAmount;
            this.feeAmount = feeAmount;
            this.taxAmount = bigDecimal3;
            this.feeAsset = feeAsset;
            this.thisAsset = thisAsset;
            this.callBackKey = callBackKey;
            this.marketDisplayAmount = bigDecimal4;
            this.marketAmountUnit = marketAmountUnit;
        }

        public static /* synthetic */ ConfirmDialogConfig copy$default(ConfirmDialogConfig confirmDialogConfig, Boolean bool, boolean z11, String str, SymbolInfoEntity symbolInfoEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z12, String str2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, CurrencyBalance currencyBalance, CurrencyBalance currencyBalance2, String str3, BigDecimal bigDecimal8, MarketAmountUnit marketAmountUnit, int i11, Object obj) {
            MarketAmountUnit marketAmountUnit2;
            BigDecimal bigDecimal9;
            Boolean bool2 = (i11 & 1) != 0 ? confirmDialogConfig.isReverse : bool;
            boolean z13 = (i11 & 2) != 0 ? confirmDialogConfig.isBuy : z11;
            String str4 = (i11 & 4) != 0 ? confirmDialogConfig.tradeTypeString : str;
            SymbolInfoEntity symbolInfoEntity2 = (i11 & 8) != 0 ? confirmDialogConfig.symbol : symbolInfoEntity;
            BigDecimal bigDecimal10 = (i11 & 16) != 0 ? confirmDialogConfig.realAvailable : bigDecimal;
            BigDecimal bigDecimal11 = (i11 & 32) != 0 ? confirmDialogConfig.borrowSize : bigDecimal2;
            boolean z14 = (i11 & 64) != 0 ? confirmDialogConfig.isBorrowFix : z12;
            String str5 = (i11 & 128) != 0 ? confirmDialogConfig.currency : str2;
            BigDecimal bigDecimal12 = (i11 & 256) != 0 ? confirmDialogConfig.borrowMinAmount : bigDecimal3;
            BigDecimal bigDecimal13 = (i11 & 512) != 0 ? confirmDialogConfig.borrowMinUnit : bigDecimal4;
            BigDecimal bigDecimal14 = (i11 & 1024) != 0 ? confirmDialogConfig.orderAmount : bigDecimal5;
            BigDecimal bigDecimal15 = (i11 & 2048) != 0 ? confirmDialogConfig.feeAmount : bigDecimal6;
            BigDecimal bigDecimal16 = (i11 & 4096) != 0 ? confirmDialogConfig.taxAmount : bigDecimal7;
            CurrencyBalance currencyBalance3 = (i11 & 8192) != 0 ? confirmDialogConfig.feeAsset : currencyBalance;
            Boolean bool3 = bool2;
            CurrencyBalance currencyBalance4 = (i11 & 16384) != 0 ? confirmDialogConfig.thisAsset : currencyBalance2;
            String str6 = (i11 & 32768) != 0 ? confirmDialogConfig.callBackKey : str3;
            BigDecimal bigDecimal17 = (i11 & 65536) != 0 ? confirmDialogConfig.marketDisplayAmount : bigDecimal8;
            if ((i11 & 131072) != 0) {
                bigDecimal9 = bigDecimal17;
                marketAmountUnit2 = confirmDialogConfig.marketAmountUnit;
            } else {
                marketAmountUnit2 = marketAmountUnit;
                bigDecimal9 = bigDecimal17;
            }
            return confirmDialogConfig.copy(bool3, z13, str4, symbolInfoEntity2, bigDecimal10, bigDecimal11, z14, str5, bigDecimal12, bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16, currencyBalance3, currencyBalance4, str6, bigDecimal9, marketAmountUnit2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfirmDialogConfig)) {
                return false;
            }
            ConfirmDialogConfig confirmDialogConfig = (ConfirmDialogConfig) other;
            return Intrinsics.areEqual(this.isReverse, confirmDialogConfig.isReverse) && this.isBuy == confirmDialogConfig.isBuy && Intrinsics.areEqual(this.tradeTypeString, confirmDialogConfig.tradeTypeString) && Intrinsics.areEqual(this.symbol, confirmDialogConfig.symbol) && Intrinsics.areEqual(this.realAvailable, confirmDialogConfig.realAvailable) && Intrinsics.areEqual(this.borrowSize, confirmDialogConfig.borrowSize) && this.isBorrowFix == confirmDialogConfig.isBorrowFix && Intrinsics.areEqual(this.currency, confirmDialogConfig.currency) && Intrinsics.areEqual(this.borrowMinAmount, confirmDialogConfig.borrowMinAmount) && Intrinsics.areEqual(this.borrowMinUnit, confirmDialogConfig.borrowMinUnit) && Intrinsics.areEqual(this.orderAmount, confirmDialogConfig.orderAmount) && Intrinsics.areEqual(this.feeAmount, confirmDialogConfig.feeAmount) && Intrinsics.areEqual(this.taxAmount, confirmDialogConfig.taxAmount) && Intrinsics.areEqual(this.feeAsset, confirmDialogConfig.feeAsset) && Intrinsics.areEqual(this.thisAsset, confirmDialogConfig.thisAsset) && Intrinsics.areEqual(this.callBackKey, confirmDialogConfig.callBackKey) && Intrinsics.areEqual(this.marketDisplayAmount, confirmDialogConfig.marketDisplayAmount) && this.marketAmountUnit == confirmDialogConfig.marketAmountUnit;
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsReverse() {
            return this.isReverse;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final BigDecimal getBorrowMinUnit() {
            return this.borrowMinUnit;
        }

        @NotNull
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final BigDecimal getOrderAmount() {
            return this.orderAmount;
        }

        @NotNull
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final BigDecimal getFeeAmount() {
            return this.feeAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final BigDecimal getTaxAmount() {
            return this.taxAmount;
        }

        @NotNull
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final CurrencyBalance getFeeAsset() {
            return this.feeAsset;
        }

        @NotNull
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final CurrencyBalance getThisAsset() {
            return this.thisAsset;
        }

        @NotNull
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getCallBackKey() {
            return this.callBackKey;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final BigDecimal getMarketDisplayAmount() {
            return this.marketDisplayAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final MarketAmountUnit getMarketAmountUnit() {
            return this.marketAmountUnit;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsBuy() {
            return this.isBuy;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTradeTypeString() {
            return this.tradeTypeString;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final SymbolInfoEntity getSymbol() {
            return this.symbol;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final BigDecimal getRealAvailable() {
            return this.realAvailable;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final BigDecimal getBorrowSize() {
            return this.borrowSize;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsBorrowFix() {
            return this.isBorrowFix;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final BigDecimal getBorrowMinAmount() {
            return this.borrowMinAmount;
        }

        @NotNull
        public final ConfirmDialogConfig copy(@Nullable Boolean isReverse, boolean isBuy, @NotNull String tradeTypeString, @NotNull SymbolInfoEntity symbol, @NotNull BigDecimal realAvailable, @NotNull BigDecimal borrowSize, boolean isBorrowFix, @Nullable String currency, @Nullable BigDecimal borrowMinAmount, @Nullable BigDecimal borrowMinUnit, @NotNull BigDecimal orderAmount, @NotNull BigDecimal feeAmount, @Nullable BigDecimal taxAmount, @NotNull CurrencyBalance feeAsset, @NotNull CurrencyBalance thisAsset, @NotNull String callBackKey, @Nullable BigDecimal marketDisplayAmount, @Nullable MarketAmountUnit marketAmountUnit) {
            Intrinsics.checkNotNullParameter(tradeTypeString, "tradeTypeString");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(realAvailable, "realAvailable");
            Intrinsics.checkNotNullParameter(borrowSize, "borrowSize");
            Intrinsics.checkNotNullParameter(orderAmount, "orderAmount");
            Intrinsics.checkNotNullParameter(feeAmount, "feeAmount");
            Intrinsics.checkNotNullParameter(feeAsset, "feeAsset");
            Intrinsics.checkNotNullParameter(thisAsset, "thisAsset");
            Intrinsics.checkNotNullParameter(callBackKey, "callBackKey");
            return new ConfirmDialogConfig(isReverse, isBuy, tradeTypeString, symbol, realAvailable, borrowSize, isBorrowFix, currency, borrowMinAmount, borrowMinUnit, orderAmount, feeAmount, taxAmount, feeAsset, thisAsset, callBackKey, marketDisplayAmount, marketAmountUnit);
        }

        @Nullable
        public final BigDecimal getBorrowMinAmount() {
            return this.borrowMinAmount;
        }

        @Nullable
        public final BigDecimal getBorrowMinUnit() {
            return this.borrowMinUnit;
        }

        @NotNull
        public final BigDecimal getBorrowSize() {
            return this.borrowSize;
        }

        @NotNull
        public final String getCallBackKey() {
            return this.callBackKey;
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @NotNull
        public final BigDecimal getFeeAmount() {
            return this.feeAmount;
        }

        @NotNull
        public final CurrencyBalance getFeeAsset() {
            return this.feeAsset;
        }

        @Nullable
        public final MarketAmountUnit getMarketAmountUnit() {
            return this.marketAmountUnit;
        }

        @Nullable
        public final BigDecimal getMarketDisplayAmount() {
            return this.marketDisplayAmount;
        }

        @NotNull
        public final BigDecimal getOrderAmount() {
            return this.orderAmount;
        }

        @NotNull
        public final BigDecimal getRealAvailable() {
            return this.realAvailable;
        }

        @NotNull
        public final SymbolInfoEntity getSymbol() {
            return this.symbol;
        }

        @Nullable
        public final BigDecimal getTaxAmount() {
            return this.taxAmount;
        }

        @NotNull
        public final CurrencyBalance getThisAsset() {
            return this.thisAsset;
        }

        @NotNull
        public final String getTradeTypeString() {
            return this.tradeTypeString;
        }

        public int hashCode() {
            Boolean bool = this.isReverse;
            int iHashCode = (((((((((((((bool == null ? 0 : bool.hashCode()) * 31) + Boolean.hashCode(this.isBuy)) * 31) + this.tradeTypeString.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.realAvailable.hashCode()) * 31) + this.borrowSize.hashCode()) * 31) + Boolean.hashCode(this.isBorrowFix)) * 31;
            String str = this.currency;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            BigDecimal bigDecimal = this.borrowMinAmount;
            int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.borrowMinUnit;
            int iHashCode4 = (((((iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + this.orderAmount.hashCode()) * 31) + this.feeAmount.hashCode()) * 31;
            BigDecimal bigDecimal3 = this.taxAmount;
            int iHashCode5 = (((((((iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31) + this.feeAsset.hashCode()) * 31) + this.thisAsset.hashCode()) * 31) + this.callBackKey.hashCode()) * 31;
            BigDecimal bigDecimal4 = this.marketDisplayAmount;
            int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
            MarketAmountUnit marketAmountUnit = this.marketAmountUnit;
            return iHashCode6 + (marketAmountUnit != null ? marketAmountUnit.hashCode() : 0);
        }

        public final boolean isBorrowFix() {
            return this.isBorrowFix;
        }

        public final boolean isBuy() {
            return this.isBuy;
        }

        @Nullable
        public final Boolean isReverse() {
            return this.isReverse;
        }

        @NotNull
        public String toString() {
            return "ConfirmDialogConfig(isReverse=" + this.isReverse + ", isBuy=" + this.isBuy + ", tradeTypeString=" + this.tradeTypeString + ", symbol=" + this.symbol + ", realAvailable=" + this.realAvailable + ", borrowSize=" + this.borrowSize + ", isBorrowFix=" + this.isBorrowFix + ", currency=" + this.currency + ", borrowMinAmount=" + this.borrowMinAmount + ", borrowMinUnit=" + this.borrowMinUnit + ", orderAmount=" + this.orderAmount + ", feeAmount=" + this.feeAmount + ", taxAmount=" + this.taxAmount + ", feeAsset=" + this.feeAsset + ", thisAsset=" + this.thisAsset + ", callBackKey=" + this.callBackKey + ", marketDisplayAmount=" + this.marketDisplayAmount + ", marketAmountUnit=" + this.marketAmountUnit + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.isReverse;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            dest.writeInt(this.isBuy ? 1 : 0);
            dest.writeString(this.tradeTypeString);
            dest.writeParcelable(this.symbol, flags);
            dest.writeSerializable(this.realAvailable);
            dest.writeSerializable(this.borrowSize);
            dest.writeInt(this.isBorrowFix ? 1 : 0);
            dest.writeString(this.currency);
            dest.writeSerializable(this.borrowMinAmount);
            dest.writeSerializable(this.borrowMinUnit);
            dest.writeSerializable(this.orderAmount);
            dest.writeSerializable(this.feeAmount);
            dest.writeSerializable(this.taxAmount);
            dest.writeParcelable(this.feeAsset, flags);
            dest.writeParcelable(this.thisAsset, flags);
            dest.writeString(this.callBackKey);
            dest.writeSerializable(this.marketDisplayAmount);
            MarketAmountUnit marketAmountUnit = this.marketAmountUnit;
            if (marketAmountUnit == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(marketAmountUnit.name());
            }
        }

        public /* synthetic */ ConfirmDialogConfig(Boolean bool, boolean z11, String str, SymbolInfoEntity symbolInfoEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z12, String str2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, CurrencyBalance currencyBalance, CurrencyBalance currencyBalance2, String str3, BigDecimal bigDecimal8, MarketAmountUnit marketAmountUnit, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, (i11 & 2) != 0 ? true : z11, str, symbolInfoEntity, bigDecimal, bigDecimal2, (i11 & 64) != 0 ? false : z12, str2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, currencyBalance, currencyBalance2, str3, (i11 & 65536) != 0 ? null : bigDecimal8, (i11 & 131072) != 0 ? null : marketAmountUnit);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m40154V3(final MarginConfirmDialog marginConfirmDialog) throws Exception {
        MarginConfigManager.f33681a.m39887d1("SPOT_TAX_TIPS", new Consumer() { // from class: com.kubi.margin.trade.dialog.f0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfirmDialog.m40155W3(this.f33809b, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m40155W3(MarginConfirmDialog marginConfirmDialog, String str) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kc_trade_india_tax_title);
        String string = marginConfirmDialog.getString(R$string.common_tax_tips);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        AlertDialogFragmentHelper alertDialogFragmentHelperM54163T4 = alertDialogFragmentHelperM54167X4.m54156M4(C27041f.m66669i(str, string)).m54163T4(marginConfirmDialog.getString(R$string.i_already_know), null);
        FragmentManager childFragmentManager = marginConfirmDialog.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54163T4.show(childFragmentManager, "tax_tip");
    }

    /* JADX INFO: renamed from: L3 */
    public final void m40158L3() {
        Observable<R> observableCompose = C42579a.f94275a.m93343c().mo37706e(m40160R3().getBorrowSize(), m40160R3().getThisAsset().getCurrency()).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.dialog.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfirmDialog.m40147M3(this.f33825b, (BigDecimal) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.dialog.m0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfirmDialog.m40148N3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.dialog.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfirmDialog.m40149O3((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.dialog.o0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfirmDialog.m40150P3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF43550U());
    }

    /* JADX INFO: renamed from: Q3 */
    public final C36913g m40159Q3() {
        return (C36913g) this.f33769c0.getValue(this, f33768f0[0]);
    }

    /* JADX INFO: renamed from: R3 */
    public final ConfirmDialogConfig m40160R3() {
        return (ConfirmDialogConfig) this.f33770d0.getValue();
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m40161Y3() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt);
        StringBuilder sb2 = new StringBuilder();
        int i11 = R$string.margin_borrow_min_amount;
        String currency = m40160R3().getCurrency();
        String strM66668h = C27041f.m66668h(currency != null ? C42828b.m93913n(currency) : null);
        BigDecimal borrowMinAmount = m40160R3().getBorrowMinAmount();
        sb2.append(getString(i11, strM66668h, C27041f.m66668h(borrowMinAmount != null ? C37886j.m85578b(borrowMinAmount, m40160R3().getCurrency(), null, false, false, false, 0, null, 0, 254, null) : null)));
        sb2.append(", ");
        int i12 = R$string.margin_borrow_min_unit;
        String currency2 = m40160R3().getCurrency();
        String strM66668h2 = C27041f.m66668h(currency2 != null ? C42828b.m93913n(currency2) : null);
        BigDecimal borrowMinUnit = m40160R3().getBorrowMinUnit();
        sb2.append(getString(i12, strM66668h2, borrowMinUnit != null ? C37886j.m85578b(borrowMinUnit, m40160R3().getCurrency(), null, false, false, false, 0, null, 0, 254, null) : null));
        alertDialogFragmentHelperM54167X4.m54156M4(sb2.toString()).m54163T4(getString(R$string.i_know), null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m40162Z3() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54156M4(getString(R$string.margin_about_daily_rate_tips)).m54163T4(getString(R$string.i_know), null).m54172c5(getChildFragmentManager());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bmargin_dialog_margin_delegation_confirm, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n", "KCCyclomaticComplexityCheck"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        int iM54289n;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36913g c36913gM40159Q3 = m40159Q3();
        if (c36913gM40159Q3 != null) {
            AppCompatImageView close = c36913gM40159Q3.f81694b;
            Intrinsics.checkNotNullExpressionValue(close, "close");
            C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.e0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginConfirmDialog.m40151S3(this.f33804b);
                }
            }, 1, null);
            c36913gM40159Q3.f81695c.setText(m40160R3().isBuy() ? getString(R$string.buy_more_rich, m40160R3().getSymbol().getBaseCurrencyName()) : getString(R$string.sell_less_rich, m40160R3().getSymbol().getBaseCurrencyName()));
            KcPrimaryButton kcPrimaryButton = c36913gM40159Q3.f81695c;
            if (m40160R3().isBuy()) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                iM54289n = C22890g.m54291p(contextRequireContext);
            } else {
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                iM54289n = C22890g.m54289n(contextRequireContext2);
            }
            kcPrimaryButton.setBackground(C22890g.m54287l(iM54289n, 24.0f));
            KcPrimaryButton confirm = c36913gM40159Q3.f81695c;
            Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
            C27046k.m66711z(confirm, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.g0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginConfirmDialog.m40152T3(this.f33812b);
                }
            }, 1, null);
            c36913gM40159Q3.f81704l.setNeedDash(true);
            DashTextView tvDayRageLabel = c36913gM40159Q3.f81704l;
            Intrinsics.checkNotNullExpressionValue(tvDayRageLabel, "tvDayRageLabel");
            C27046k.m66711z(tvDayRageLabel, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.h0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginConfirmDialog.m40153U3(this.f33815b);
                }
            }, 1, null);
            AppCompatTextView appCompatTextView = c36913gM40159Q3.f81697e;
            String string = getString(m40160R3().isBuy() ? R$string.buy_in : R$string.sell_out);
            Context context = getContext();
            String str = m40160R3().getTradeTypeString() + ' ' + m40160R3().getSymbol().getShowSymbol() + "  " + string;
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            appCompatTextView.setText(C27080p0.m66827d(context, str, string, C22890g.m54281f(contextRequireContext3, m40160R3().isBuy())));
            MarginOrderAmountDisplay marginOrderAmountDisplayM40272a = C18275p0.m40272a(m40160R3().isBuy(), m40160R3().getSymbol(), m40160R3().getOrderAmount(), m40160R3().getThisAsset().getCurrency(), m40160R3().getThisAsset().getCurrencyName(), m40160R3().getMarketDisplayAmount(), m40160R3().getMarketAmountUnit());
            c36913gM40159Q3.f81700h.setText(marginOrderAmountDisplayM40272a.getLabelRes());
            AppCompatTextView appCompatTextView2 = c36913gM40159Q3.f81699g;
            C27096v0 c27096v0Append = new C27096v0().append(C27041f.m66668h(C37886j.m85578b(marginOrderAmountDisplayM40272a.getValue(), marginOrderAmountDisplayM40272a.getCurrency(), null, false, false, false, 0, null, 0, 254, null))).append(C33627eb.f69716f);
            String strM66668h = C27041f.m66668h(marginOrderAmountDisplayM40272a.getCurrencyName());
            Resources resources = getResources();
            int i11 = R$color.c_text40;
            appCompatTextView2.setText(c27096v0Append.m66905e(strM66668h, resources.getColor(i11)));
            c36913gM40159Q3.f81705m.setText(new C27096v0().append(C27041f.m66668h(C37886j.m85578b(m40160R3().getFeeAmount(), m40160R3().getFeeAsset().getCurrency(), null, false, false, false, 0, null, 0, 254, null))).append(C33627eb.f69716f).m66905e(m40160R3().getFeeAsset().getCurrencyName(), getResources().getColor(i11)));
            if (C27039d.m66647g(m40160R3().getTaxAmount()) > 0.0d) {
                MarginConfigManager.m39812e1(MarginConfigManager.f33681a, "SPOT_TAX_TIPS", null, 2, null);
                c36913gM40159Q3.f81708p.setNeedDash(true);
                DashTextView tvTaxUnit = c36913gM40159Q3.f81708p;
                Intrinsics.checkNotNullExpressionValue(tvTaxUnit, "tvTaxUnit");
                ViewExtKt.m66594y(tvTaxUnit);
                DashTextView tvTaxUnit2 = c36913gM40159Q3.f81708p;
                Intrinsics.checkNotNullExpressionValue(tvTaxUnit2, "tvTaxUnit");
                C27046k.m66711z(tvTaxUnit2, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.i0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginConfirmDialog.m40154V3(this.f33817b);
                    }
                }, 1, null);
                AppCompatTextView tvTax = c36913gM40159Q3.f81707o;
                Intrinsics.checkNotNullExpressionValue(tvTax, "tvTax");
                ViewExtKt.m66594y(tvTax);
                AppCompatTextView appCompatTextView3 = c36913gM40159Q3.f81707o;
                C27096v0 c27096v0 = new C27096v0();
                BigDecimal taxAmount = m40160R3().getTaxAmount();
                appCompatTextView3.setText(c27096v0.append(C27041f.m66668h(taxAmount != null ? C37886j.m85578b(taxAmount, m40160R3().getFeeAsset().getCurrency(), null, false, false, false, 0, null, 0, 254, null) : null)).append(C33627eb.f69716f).m66905e(m40160R3().getFeeAsset().getCurrencyName(), getResources().getColor(R$color.emphasis40)));
            }
            c36913gM40159Q3.f81710r.setText(new C27096v0().append(C27041f.m66668h(C37886j.m85578b(m40160R3().getRealAvailable(), m40160R3().getThisAsset().getCurrency(), null, false, false, false, 0, null, 0, 254, null))).append(C33627eb.f69716f).m66905e(m40160R3().getThisAsset().getCurrencyName(), getResources().getColor(i11)));
            c36913gM40159Q3.f81702j.setNeedDash(m40160R3().isBorrowFix());
            DashTextView tvAutoBorrowLabel = c36913gM40159Q3.f81702j;
            Intrinsics.checkNotNullExpressionValue(tvAutoBorrowLabel, "tvAutoBorrowLabel");
            C27046k.m66711z(tvAutoBorrowLabel, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.j0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginConfirmDialog.m40156X3(this.f33819b);
                }
            }, 1, null);
            c36913gM40159Q3.f81701i.setText(new C27096v0().append(C37886j.m85578b(m40160R3().getBorrowSize(), m40160R3().getThisAsset().getCurrency(), null, false, false, false, 0, null, 0, 254, null)).append(C33627eb.f69716f).m66905e(m40160R3().getThisAsset().getCurrencyName(), getResources().getColor(i11)));
            m40158L3();
            AppCompatTextView tvTips = c36913gM40159Q3.f81709q;
            Intrinsics.checkNotNullExpressionValue(tvTips, "tvTips");
            ViewExtKt.m66577h(tvTips);
            Boolean boolIsReverse = m40160R3().isReverse();
            if (boolIsReverse == null || !boolIsReverse.booleanValue()) {
                return;
            }
            AppCompatTextView tvTips2 = c36913gM40159Q3.f81709q;
            Intrinsics.checkNotNullExpressionValue(tvTips2, "tvTips");
            ViewExtKt.m66594y(tvTips2);
            c36913gM40159Q3.f81709q.setText(getString(R$string.margin_trade_make_revert_order_tip));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            AppCompatTextView tvTips3 = c36913gM40159Q3.f81709q;
            Intrinsics.checkNotNullExpressionValue(tvTips3, "tvTips");
            highlightTextHelper.m54120f(tvTips3, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(getResources().getColor(R$color.complementary))));
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static final ConfirmDialogConfig m40146K3(MarginConfirmDialog marginConfirmDialog) {
        Parcelable parcelable = marginConfirmDialog.requireArguments().getParcelable("data");
        Intrinsics.checkNotNull(parcelable);
        return (ConfirmDialogConfig) parcelable;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m40147M3(MarginConfirmDialog marginConfirmDialog, BigDecimal bigDecimal) {
        AppCompatTextView appCompatTextView;
        C36913g c36913gM40159Q3 = marginConfirmDialog.m40159Q3();
        if (c36913gM40159Q3 != null && (appCompatTextView = c36913gM40159Q3.f81703k) != null) {
            Intrinsics.checkNotNull(bigDecimal);
            appCompatTextView.setText(C42180b.m92642g(bigDecimal, null, null, 20, false, false, false, 27, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m40148N3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m40149O3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m40150P3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m40151S3(MarginConfirmDialog marginConfirmDialog) {
        marginConfirmDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m40152T3(MarginConfirmDialog marginConfirmDialog) {
        BaseActivity baseActivity;
        FragmentActivity activity = marginConfirmDialog.getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            BaseActivity.setFragmentResult$default(baseActivity, marginConfirmDialog.m40160R3().getCallBackKey(), null, 2, null);
        }
        marginConfirmDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m40153U3(MarginConfirmDialog marginConfirmDialog) {
        marginConfirmDialog.m40162Z3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m40156X3(MarginConfirmDialog marginConfirmDialog) {
        if (!marginConfirmDialog.m40160R3().isBorrowFix()) {
            return Unit.INSTANCE;
        }
        marginConfirmDialog.m40161Y3();
        return Unit.INSTANCE;
    }
}
