package com.kubi.margin.trade.dialog;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.util.SparseArrayKt;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.KeyboardUtils;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.margin.R$color;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FixAutoSizeTextView;
import com.kubi.resources.widget.LeverSeekBar;
import com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.utils.C27056j0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p206dp.C36915h;
import p429lf.C42180b;
import p698vp.C45612b;
import p752x8.AbstractC46099a;
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
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: MarginLeverSettingsDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020!H\u0002J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002J\b\u0010(\u001a\u00020!H\u0002J\u000e\u0010)\u001a\u00020\u0011*\u0004\u0018\u00010*H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0016\u0010\u0013¨\u0006-"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/MarginLeverSettingsDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "<init>", "()V", "bmarginDialogMarginLeverSettingsBinding", "Lcom/kubi/margin/databinding/BmarginDialogMarginLeverSettingsBinding;", "getBmarginDialogMarginLeverSettingsBinding", "()Lcom/kubi/margin/databinding/BmarginDialogMarginLeverSettingsBinding;", "bmarginDialogMarginLeverSettingsBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "config", "Lcom/kubi/margin/trade/dialog/MarginLeverSettingsDialog$LeverDialogConfig;", "getConfig", "()Lcom/kubi/margin/trade/dialog/MarginLeverSettingsDialog$LeverDialogConfig;", "config$delegate", "Lkotlin/Lazy;", "maxLever", "", "getMaxLever", "()D", "maxLever$delegate", "currentLever", "getCurrentLever", "currentLever$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "dismiss", "initListener", "calculateSectionText", "Landroid/util/SparseArray;", "", "bindPromptStatus", "nonNullDouble", "", "LeverDialogConfig", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginLeverSettingsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginLeverSettingsDialog.kt\ncom/kubi/margin/trade/dialog/MarginLeverSettingsDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n143#2,20:269\n1#3:289\n*S KotlinDebug\n*F\n+ 1 MarginLeverSettingsDialog.kt\ncom/kubi/margin/trade/dialog/MarginLeverSettingsDialog\n*L\n46#1:269,20\n*E\n"})
public final class MarginLeverSettingsDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC24293a f33777c0 = C45681e.m100799e(this, new Function1<MarginLeverSettingsDialog, C36915h>() { // from class: com.kubi.margin.trade.dialog.MarginLeverSettingsDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36915h invoke(@NotNull MarginLeverSettingsDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36915h.m82699a(fragment.requireView());
        }
    }, new Function1<C36915h, Unit>() { // from class: com.kubi.margin.trade.dialog.MarginLeverSettingsDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36915h it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36915h c36915h) {
            invoke(c36915h);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f33778d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.dialog.m1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginLeverSettingsDialog.m40229L3(this.f33830b);
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f33779e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.dialog.n1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Double.valueOf(MarginLeverSettingsDialog.m40239Z3(this.f33831b));
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f33780f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.dialog.o1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Double.valueOf(MarginLeverSettingsDialog.m40230M3(this.f33833b));
        }
    });

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ KProperty<Object>[] f33776h0 = {Reflection.property1(new PropertyReference1Impl(MarginLeverSettingsDialog.class, "bmarginDialogMarginLeverSettingsBinding", "getBmarginDialogMarginLeverSettingsBinding()Lcom/kubi/margin/databinding/BmarginDialogMarginLeverSettingsBinding;", 0))};

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public static final Companion f33775g0 = new Companion(null);

    /* JADX INFO: compiled from: MarginLeverSettingsDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/MarginLeverSettingsDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/trade/dialog/MarginLeverSettingsDialog;", "config", "Lcom/kubi/margin/trade/dialog/MarginLeverSettingsDialog$LeverDialogConfig;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarginLeverSettingsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginLeverSettingsDialog.kt\ncom/kubi/margin/trade/dialog/MarginLeverSettingsDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n1#2:269\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginLeverSettingsDialog newInstance(@NotNull LeverDialogConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            MarginLeverSettingsDialog marginLeverSettingsDialog = new MarginLeverSettingsDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", config);
            marginLeverSettingsDialog.setArguments(bundle);
            return marginLeverSettingsDialog;
        }
    }

    /* JADX INFO: compiled from: MarginLeverSettingsDialog.kt */
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003Jn\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\nHÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0007\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u00062"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/MarginLeverSettingsDialog$LeverDialogConfig;", "Landroid/os/Parcelable;", "warningLever", "Ljava/math/BigDecimal;", "positionLever", "currentLever", "maxLever", "isIsolate", "", "symbol", "", "baseAsset", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "quoteAsset", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/tradebase/entity/CurrencyBalance;Lcom/kubi/tradebase/entity/CurrencyBalance;)V", "getWarningLever", "()Ljava/math/BigDecimal;", "getPositionLever", "getCurrentLever", "getMaxLever", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSymbol", "()Ljava/lang/String;", "getBaseAsset", "()Lcom/kubi/tradebase/entity/CurrencyBalance;", "getQuoteAsset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/tradebase/entity/CurrencyBalance;Lcom/kubi/tradebase/entity/CurrencyBalance;)Lcom/kubi/margin/trade/dialog/MarginLeverSettingsDialog$LeverDialogConfig;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LeverDialogConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LeverDialogConfig> CREATOR = new C18223a();

        @Nullable
        private final CurrencyBalance baseAsset;

        @Nullable
        private final BigDecimal currentLever;

        @Nullable
        private final Boolean isIsolate;

        @Nullable
        private final BigDecimal maxLever;

        @Nullable
        private final BigDecimal positionLever;

        @Nullable
        private final CurrencyBalance quoteAsset;

        @Nullable
        private final String symbol;

        @Nullable
        private final BigDecimal warningLever;

        /* JADX INFO: renamed from: com.kubi.margin.trade.dialog.MarginLeverSettingsDialog$LeverDialogConfig$a */
        /* JADX INFO: compiled from: MarginLeverSettingsDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C18223a implements Parcelable.Creator<LeverDialogConfig> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LeverDialogConfig createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new LeverDialogConfig(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, boolValueOf, parcel.readString(), (CurrencyBalance) parcel.readParcelable(LeverDialogConfig.class.getClassLoader()), (CurrencyBalance) parcel.readParcelable(LeverDialogConfig.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LeverDialogConfig[] newArray(int i11) {
                return new LeverDialogConfig[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeverDialogConfig)) {
                return false;
            }
            LeverDialogConfig leverDialogConfig = (LeverDialogConfig) other;
            return Intrinsics.areEqual(this.warningLever, leverDialogConfig.warningLever) && Intrinsics.areEqual(this.positionLever, leverDialogConfig.positionLever) && Intrinsics.areEqual(this.currentLever, leverDialogConfig.currentLever) && Intrinsics.areEqual(this.maxLever, leverDialogConfig.maxLever) && Intrinsics.areEqual(this.isIsolate, leverDialogConfig.isIsolate) && Intrinsics.areEqual(this.symbol, leverDialogConfig.symbol) && Intrinsics.areEqual(this.baseAsset, leverDialogConfig.baseAsset) && Intrinsics.areEqual(this.quoteAsset, leverDialogConfig.quoteAsset);
        }

        public static /* synthetic */ LeverDialogConfig copy$default(LeverDialogConfig leverDialogConfig, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Boolean bool, String str, CurrencyBalance currencyBalance, CurrencyBalance currencyBalance2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bigDecimal = leverDialogConfig.warningLever;
            }
            if ((i11 & 2) != 0) {
                bigDecimal2 = leverDialogConfig.positionLever;
            }
            if ((i11 & 4) != 0) {
                bigDecimal3 = leverDialogConfig.currentLever;
            }
            if ((i11 & 8) != 0) {
                bigDecimal4 = leverDialogConfig.maxLever;
            }
            if ((i11 & 16) != 0) {
                bool = leverDialogConfig.isIsolate;
            }
            if ((i11 & 32) != 0) {
                str = leverDialogConfig.symbol;
            }
            if ((i11 & 64) != 0) {
                currencyBalance = leverDialogConfig.baseAsset;
            }
            if ((i11 & 128) != 0) {
                currencyBalance2 = leverDialogConfig.quoteAsset;
            }
            CurrencyBalance currencyBalance3 = currencyBalance;
            CurrencyBalance currencyBalance4 = currencyBalance2;
            Boolean bool2 = bool;
            String str2 = str;
            return leverDialogConfig.copy(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bool2, str2, currencyBalance3, currencyBalance4);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BigDecimal getWarningLever() {
            return this.warningLever;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final BigDecimal getPositionLever() {
            return this.positionLever;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final BigDecimal getCurrentLever() {
            return this.currentLever;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final BigDecimal getMaxLever() {
            return this.maxLever;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getIsIsolate() {
            return this.isIsolate;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final CurrencyBalance getBaseAsset() {
            return this.baseAsset;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final CurrencyBalance getQuoteAsset() {
            return this.quoteAsset;
        }

        @NotNull
        public final LeverDialogConfig copy(@Nullable BigDecimal warningLever, @Nullable BigDecimal positionLever, @Nullable BigDecimal currentLever, @Nullable BigDecimal maxLever, @Nullable Boolean isIsolate, @Nullable String symbol, @Nullable CurrencyBalance baseAsset, @Nullable CurrencyBalance quoteAsset) {
            return new LeverDialogConfig(warningLever, positionLever, currentLever, maxLever, isIsolate, symbol, baseAsset, quoteAsset);
        }

        @Nullable
        public final CurrencyBalance getBaseAsset() {
            return this.baseAsset;
        }

        @Nullable
        public final BigDecimal getCurrentLever() {
            return this.currentLever;
        }

        @Nullable
        public final BigDecimal getMaxLever() {
            return this.maxLever;
        }

        @Nullable
        public final BigDecimal getPositionLever() {
            return this.positionLever;
        }

        @Nullable
        public final CurrencyBalance getQuoteAsset() {
            return this.quoteAsset;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        public final BigDecimal getWarningLever() {
            return this.warningLever;
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.warningLever;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            BigDecimal bigDecimal2 = this.positionLever;
            int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.currentLever;
            int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.maxLever;
            int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
            Boolean bool = this.isIsolate;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.symbol;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            CurrencyBalance currencyBalance = this.baseAsset;
            int iHashCode7 = (iHashCode6 + (currencyBalance == null ? 0 : currencyBalance.hashCode())) * 31;
            CurrencyBalance currencyBalance2 = this.quoteAsset;
            return iHashCode7 + (currencyBalance2 != null ? currencyBalance2.hashCode() : 0);
        }

        @Nullable
        public final Boolean isIsolate() {
            return this.isIsolate;
        }

        @NotNull
        public String toString() {
            return "LeverDialogConfig(warningLever=" + this.warningLever + ", positionLever=" + this.positionLever + ", currentLever=" + this.currentLever + ", maxLever=" + this.maxLever + ", isIsolate=" + this.isIsolate + ", symbol=" + this.symbol + ", baseAsset=" + this.baseAsset + ", quoteAsset=" + this.quoteAsset + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel, java.lang.Object] */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            ?? BooleanValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.warningLever);
            dest.writeSerializable(this.positionLever);
            dest.writeSerializable(this.currentLever);
            dest.writeSerializable(this.maxLever);
            Boolean bool = this.isIsolate;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                dest.writeInt(1);
                BooleanValue = bool.booleanValue();
            }
            dest.writeInt(BooleanValue);
            dest.writeString(this.symbol);
            dest.writeParcelable(this.baseAsset, flags);
            dest.writeParcelable(this.quoteAsset, flags);
        }

        public LeverDialogConfig(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable Boolean bool, @Nullable String str, @Nullable CurrencyBalance currencyBalance, @Nullable CurrencyBalance currencyBalance2) {
            this.warningLever = bigDecimal;
            this.positionLever = bigDecimal2;
            this.currentLever = bigDecimal3;
            this.maxLever = bigDecimal4;
            this.isIsolate = bool;
            this.symbol = str;
            this.baseAsset = currencyBalance;
            this.quoteAsset = currencyBalance2;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.dialog.MarginLeverSettingsDialog$a */
    /* JADX INFO: compiled from: MarginLeverSettingsDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/margin/trade/dialog/MarginLeverSettingsDialog$initListener$1$7", "Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$OnProgressChangedListenerAdapter;", "getProgressOnActionUp", "", "bubbleSeekBar", "Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;", "progress", "", "progressFloat", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18224a extends BubbleSeekBar.AbstractC23000l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C36915h f33781a;

        public C18224a(C36915h c36915h) {
            this.f33781a = c36915h;
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar.AbstractC23000l, com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar.InterfaceC22999k
        /* JADX INFO: renamed from: b */
        public void mo37833b(BubbleSeekBar bubbleSeekBar, int i11, float f11) {
            super.mo37833b(bubbleSeekBar, i11, f11);
            if (this.f33781a.f81724i.getTag() != null) {
                return;
            }
            this.f33781a.f81719d.getEditText().setText(C6447a.m11724a(new BigDecimal(String.valueOf(f11)).setScale(1, RoundingMode.DOWN)).toPlainString());
            EditText editText = this.f33781a.f81719d.getEditText();
            Intrinsics.checkNotNullExpressionValue(editText, "getEditText(...)");
            C27046k.m66707v(editText);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a2  */
    /* JADX INFO: renamed from: J3 */
    private final void m40227J3() {
        String string;
        String strM85578b;
        String strM85578b2;
        CurrencyBalance quoteAsset;
        CurrencyBalance quoteAsset2;
        CurrencyBalance quoteAsset3;
        CurrencyBalance baseAsset;
        CurrencyBalance baseAsset2;
        CurrencyBalance baseAsset3;
        BigDecimal positionLever;
        C36915h c36915hM40242N3 = m40242N3();
        if (c36915hM40242N3 != null) {
            double value = c36915hM40242N3.f81719d.getValue();
            if (value < 1.0d) {
                value = 1.0d;
            }
            c36915hM40242N3.f81718c.setEnabled(true);
            AppCompatTextView appCompatTextView = c36915hM40242N3.f81723h;
            LeverDialogConfig leverDialogConfigM40243O3 = m40243O3();
            String currencyName = null;
            if (value < C27039d.m66647g(leverDialogConfigM40243O3 != null ? leverDialogConfigM40243O3.getPositionLever() : null)) {
                c36915hM40242N3.f81718c.setEnabled(false);
                c36915hM40242N3.f81723h.setTextColor(getResources().getColor(R$color.secondary));
                int i11 = R$string.margin_lever_min_tips;
                StringBuilder sb2 = new StringBuilder();
                LeverDialogConfig leverDialogConfigM40243O4 = m40243O3();
                sb2.append(C27041f.m66669i((leverDialogConfigM40243O4 == null || (positionLever = leverDialogConfigM40243O4.getPositionLever()) == null) ? null : C42180b.m92640e(positionLever, null, 4, false, false, false, 0, null, 125, null), C33820nf.f71144W));
                sb2.append('x');
                string = getString(i11, sb2.toString());
            } else {
                LeverDialogConfig leverDialogConfigM40243O5 = m40243O3();
                if (value > C27039d.m66647g(leverDialogConfigM40243O5 != null ? leverDialogConfigM40243O5.getWarningLever() : null)) {
                    c36915hM40242N3.f81723h.setTextColor(getResources().getColor(R$color.complementary));
                    string = getString(R$string.high_lever_risk_tip);
                } else {
                    string = "";
                }
            }
            appCompatTextView.setText(string);
            StringBuilder sb3 = new StringBuilder();
            LeverDialogConfig leverDialogConfigM40243O6 = m40243O3();
            if (leverDialogConfigM40243O6 == null || (baseAsset2 = leverDialogConfigM40243O6.getBaseAsset()) == null) {
                strM85578b = null;
            } else {
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(value));
                LeverDialogConfig leverDialogConfigM40243O7 = m40243O3();
                Boolean boolIsIsolate = leverDialogConfigM40243O7 != null ? leverDialogConfigM40243O7.isIsolate() : null;
                LeverDialogConfig leverDialogConfigM40243O8 = m40243O3();
                BigDecimal bigDecimalM100695a = C45612b.m100695a(baseAsset2, true, bigDecimal, boolIsIsolate, leverDialogConfigM40243O8 != null ? leverDialogConfigM40243O8.getSymbol() : null);
                if (bigDecimalM100695a != null) {
                    LeverDialogConfig leverDialogConfigM40243O9 = m40243O3();
                    strM85578b = C37886j.m85578b(bigDecimalM100695a, (leverDialogConfigM40243O9 == null || (baseAsset3 = leverDialogConfigM40243O9.getBaseAsset()) == null) ? null : baseAsset3.getCurrency(), null, false, false, false, 0, null, 0, 254, null);
                } else {
                    strM85578b = null;
                }
            }
            sb3.append(C27041f.m66669i(strM85578b, C33820nf.f71144W));
            sb3.append(' ');
            LeverDialogConfig leverDialogConfigM40243O10 = m40243O3();
            sb3.append(C27041f.m66669i((leverDialogConfigM40243O10 == null || (baseAsset = leverDialogConfigM40243O10.getBaseAsset()) == null) ? null : baseAsset.getCurrencyName(), C33820nf.f71144W));
            String string2 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            LeverDialogConfig leverDialogConfigM40243O11 = m40243O3();
            if (leverDialogConfigM40243O11 == null || (quoteAsset2 = leverDialogConfigM40243O11.getQuoteAsset()) == null) {
                strM85578b2 = null;
            } else {
                BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(value));
                LeverDialogConfig leverDialogConfigM40243O12 = m40243O3();
                Boolean boolIsIsolate2 = leverDialogConfigM40243O12 != null ? leverDialogConfigM40243O12.isIsolate() : null;
                LeverDialogConfig leverDialogConfigM40243O13 = m40243O3();
                BigDecimal bigDecimalM100695a2 = C45612b.m100695a(quoteAsset2, true, bigDecimal2, boolIsIsolate2, leverDialogConfigM40243O13 != null ? leverDialogConfigM40243O13.getSymbol() : null);
                if (bigDecimalM100695a2 != null) {
                    LeverDialogConfig leverDialogConfigM40243O14 = m40243O3();
                    strM85578b2 = C37886j.m85578b(bigDecimalM100695a2, (leverDialogConfigM40243O14 == null || (quoteAsset3 = leverDialogConfigM40243O14.getQuoteAsset()) == null) ? null : quoteAsset3.getCurrency(), null, false, false, false, 0, null, 0, 254, null);
                } else {
                    strM85578b2 = null;
                }
            }
            sb4.append(C27041f.m66669i(strM85578b2, C33820nf.f71144W));
            sb4.append(' ');
            LeverDialogConfig leverDialogConfigM40243O15 = m40243O3();
            if (leverDialogConfigM40243O15 != null && (quoteAsset = leverDialogConfigM40243O15.getQuoteAsset()) != null) {
                currencyName = quoteAsset.getCurrencyName();
            }
            sb4.append(C27041f.m66669i(currencyName, C33820nf.f71144W));
            c36915hM40242N3.f81722g.setText(getString(R$string.margin_or_placeholder, string2, sb4.toString()));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            FixAutoSizeTextView prompt = c36915hM40242N3.f81722g;
            Intrinsics.checkNotNullExpressionValue(prompt, "prompt");
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN1;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            int i12 = R$color.primary;
            Pair pair = new Pair(textTagEnum, new ForegroundColorSpan(C27046k.m66699n(contextRequireContext, i12)));
            HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN2;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            highlightTextHelper.m54120f(prompt, pair, new Pair(textTagEnum2, new ForegroundColorSpan(C27046k.m66699n(contextRequireContext2, i12))));
        }
    }

    /* JADX INFO: renamed from: K3 */
    private final SparseArray<String> m40228K3() {
        SparseArray<String> sparseArray = new SparseArray<>();
        if (m40245Q3() > 0.0d) {
            int i11 = 0;
            if (m40245Q3() < 5.0d) {
                int iM40245Q3 = (int) m40245Q3();
                while (i11 < iM40245Q3) {
                    StringBuilder sb2 = new StringBuilder();
                    int i12 = i11 + 1;
                    sb2.append(i12);
                    sb2.append('x');
                    sparseArray.put(i11, sb2.toString());
                    i11 = i12;
                }
            } else {
                double dM40245Q3 = (m40245Q3() - ((double) 1.0f)) / ((double) 4);
                for (int i13 = 0; i13 < 5; i13++) {
                    if (i13 == 0) {
                        sparseArray.put(0, "1x");
                    } else if (i13 != 4) {
                        int i14 = (int) (((double) 1) + (((double) i13) * dM40245Q3));
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i14);
                        sb3.append('x');
                        sparseArray.put(i14 - 1, sb3.toString());
                    } else {
                        int iM40245Q4 = (int) (m40245Q3() - ((double) 1));
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append((int) m40245Q3());
                        sb4.append('x');
                        sparseArray.put(iM40245Q4, sb4.toString());
                    }
                }
            }
        }
        return sparseArray;
    }

    /* JADX INFO: renamed from: S3 */
    public static final String m40232S3(MarginLeverSettingsDialog marginLeverSettingsDialog, String str) {
        String strM92640e;
        StringBuilder sb2 = new StringBuilder();
        if (marginLeverSettingsDialog.m40240a4(str) <= 1.0d) {
            strM92640e = "1";
        } else {
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(str);
            strM92640e = bigDecimalM66536f != null ? C42180b.m92640e(bigDecimalM66536f, null, 4, false, false, false, 0, null, 125, null) : null;
        }
        sb2.append(strM92640e);
        sb2.append('x');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: T3 */
    public static final SparseArray m40233T3(MarginLeverSettingsDialog marginLeverSettingsDialog, int i11, SparseArray result) {
        Intrinsics.checkNotNullParameter(result, "result");
        result.clear();
        SparseArrayKt.putAll(result, marginLeverSettingsDialog.m40228K3());
        return result;
    }

    /* JADX INFO: renamed from: a4 */
    private final double m40240a4(CharSequence charSequence) {
        try {
            return DowngradeExKt.m66538h(String.valueOf(charSequence), 0.0d, 1, null);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final C36915h m40242N3() {
        return (C36915h) this.f33777c0.getValue(this, f33776h0[0]);
    }

    /* JADX INFO: renamed from: O3 */
    public final LeverDialogConfig m40243O3() {
        return (LeverDialogConfig) this.f33778d0.getValue();
    }

    /* JADX INFO: renamed from: P3 */
    public final double m40244P3() {
        return ((Number) this.f33780f0.getValue()).doubleValue();
    }

    /* JADX INFO: renamed from: Q3 */
    public final double m40245Q3() {
        return ((Number) this.f33779e0.getValue()).doubleValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bmargin_dialog_margin_lever_settings, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36915h c36915hM40242N3 = m40242N3();
        if (c36915hM40242N3 != null && (baseTextView = c36915hM40242N3.f81720e) != null) {
            baseTextView.setText(getString(R$string.margin_max_available, ""));
        }
        m40231R3();
    }

    /* JADX INFO: renamed from: L3 */
    public static final LeverDialogConfig m40229L3(MarginLeverSettingsDialog marginLeverSettingsDialog) {
        Bundle arguments = marginLeverSettingsDialog.getArguments();
        if (arguments != null) {
            return (LeverDialogConfig) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: M3 */
    public static final double m40230M3(MarginLeverSettingsDialog marginLeverSettingsDialog) {
        BigDecimal currentLever;
        LeverDialogConfig leverDialogConfigM40243O3 = marginLeverSettingsDialog.m40243O3();
        if (leverDialogConfigM40243O3 != null && (currentLever = leverDialogConfigM40243O3.getCurrentLever()) != null) {
            return currentLever.doubleValue();
        }
        return 5.0d;
    }

    /* JADX INFO: renamed from: R3 */
    private final void m40231R3() {
        final C36915h c36915hM40242N3 = m40242N3();
        if (c36915hM40242N3 != null) {
            AppCompatImageView close = c36915hM40242N3.f81717b;
            Intrinsics.checkNotNullExpressionValue(close, "close");
            C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.p1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginLeverSettingsDialog.m40235V3(this.f33835b);
                }
            }, 1, null);
            KcPrimaryButton confirm = c36915hM40242N3.f81718c;
            Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
            C27046k.m66711z(confirm, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.q1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginLeverSettingsDialog.m40236W3(this.f33840b, c36915hM40242N3);
                }
            }, 1, null);
            c36915hM40242N3.f81719d.m54821l(0.1d, 1);
            c36915hM40242N3.f81719d.getEditText().setFilters(new C27056j0[]{new C27056j0(1)});
            c36915hM40242N3.f81719d.setValue(m40244P3());
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(c36915hM40242N3.f81719d.getEditText());
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.dialog.r1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginLeverSettingsDialog.m40237X3(c36915hM40242N3, this, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe = abstractC46099aM784d.subscribe(new Consumer() { // from class: com.kubi.margin.trade.dialog.s1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginLeverSettingsDialog.m40238Y3(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getF43550U());
            float f11 = 1.0f;
            c36915hM40242N3.f81724i.getConfigBuilder().m55026d(1.0f).m55025c((float) m40245Q3()).m55028f((int) (m40245Q3() - ((double) 1))).m55027e(1).m55024b(true).m55023a();
            LeverSeekBar leverSeekBar = c36915hM40242N3.f81724i;
            float fM40244P3 = (float) m40244P3();
            if (fM40244P3 > 1.0f) {
                f11 = fM40244P3;
            }
            leverSeekBar.setProgress(Float.valueOf(f11).floatValue());
            c36915hM40242N3.f81724i.setProgressFormatCallback(new BubbleSeekBar.InterfaceC22998j() { // from class: com.kubi.margin.trade.dialog.t1
                @Override // com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar.InterfaceC22998j
                /* JADX INFO: renamed from: a */
                public final String mo40277a(String str) {
                    return MarginLeverSettingsDialog.m40232S3(this.f33850a, str);
                }
            });
            c36915hM40242N3.f81724i.setCustomSectionTextArray(new BubbleSeekBar.InterfaceC22997i() { // from class: com.kubi.margin.trade.dialog.u1
                @Override // com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar.InterfaceC22997i
                /* JADX INFO: renamed from: a */
                public final SparseArray mo40278a(int i11, SparseArray sparseArray) {
                    return MarginLeverSettingsDialog.m40233T3(this.f33853a, i11, sparseArray);
                }
            });
            c36915hM40242N3.f81724i.setOnProgressChangedListener(new C18224a(c36915hM40242N3));
            c36915hM40242N3.f81724i.setWindowProvider(new LeverSeekBar.InterfaceC22927a() { // from class: com.kubi.margin.trade.dialog.v1
                @Override // com.kubi.resources.widget.LeverSeekBar.InterfaceC22927a
                /* JADX INFO: renamed from: a */
                public final void mo40279a(int[] iArr) {
                    MarginLeverSettingsDialog.m40234U3(this.f33856a, iArr);
                }
            });
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m40234U3(MarginLeverSettingsDialog marginLeverSettingsDialog, int[] iArr) {
        View view = marginLeverSettingsDialog.getView();
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m40235V3(MarginLeverSettingsDialog marginLeverSettingsDialog) {
        marginLeverSettingsDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m40236W3(MarginLeverSettingsDialog marginLeverSettingsDialog, C36915h c36915h) {
        BaseActivity baseActivity;
        Boolean boolIsIsolate;
        FragmentActivity activity = marginLeverSettingsDialog.getActivity();
        BigDecimal maxLever = null;
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(MarginLeverSettingsDialog.class.getName());
            LeverDialogConfig leverDialogConfigM40243O3 = marginLeverSettingsDialog.m40243O3();
            if (leverDialogConfigM40243O3 != null) {
                boolIsIsolate = leverDialogConfigM40243O3.isIsolate();
            } else {
                boolIsIsolate = null;
            }
            sb2.append(C27025c.m66566d(boolIsIsolate));
            String string = sb2.toString();
            Bundle bundle = new Bundle();
            double dM40240a4 = marginLeverSettingsDialog.m40240a4(c36915h.f81719d.getEditText().getText());
            LeverDialogConfig leverDialogConfigM40243O4 = marginLeverSettingsDialog.m40243O3();
            if (leverDialogConfigM40243O4 != null) {
                maxLever = leverDialogConfigM40243O4.getMaxLever();
            }
            bundle.putDouble("data", RangesKt.coerceAtMost(dM40240a4, C27039d.m66647g(maxLever)));
            Unit unit = Unit.INSTANCE;
            baseActivity.setFragmentResult(string, bundle);
        }
        marginLeverSettingsDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m40237X3(C36915h c36915h, MarginLeverSettingsDialog marginLeverSettingsDialog, CharSequence charSequence) {
        double dM40245Q3;
        float f11 = 1.0f;
        if (TextUtils.isEmpty(charSequence)) {
            c36915h.f81724i.setProgress(1.0f);
            marginLeverSettingsDialog.m40227J3();
            return Unit.INSTANCE;
        }
        double dM40240a4 = marginLeverSettingsDialog.m40240a4(charSequence);
        if (dM40240a4 < 1.0d) {
            dM40245Q3 = 1.0d;
        } else if (dM40240a4 > marginLeverSettingsDialog.m40245Q3()) {
            dM40245Q3 = marginLeverSettingsDialog.m40245Q3();
        } else {
            dM40245Q3 = dM40240a4;
        }
        if (dM40245Q3 != dM40240a4) {
            c36915h.f81719d.setValue(dM40245Q3);
        }
        c36915h.f81724i.setTag(Boolean.TRUE);
        if (dM40245Q3 > 1.0d) {
            f11 = (float) dM40245Q3;
        }
        c36915h.f81724i.setProgress(f11);
        c36915h.f81724i.setTag(null);
        marginLeverSettingsDialog.m40227J3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final void m40238Y3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final double m40239Z3(MarginLeverSettingsDialog marginLeverSettingsDialog) {
        BigDecimal maxLever;
        LeverDialogConfig leverDialogConfigM40243O3 = marginLeverSettingsDialog.m40243O3();
        if (leverDialogConfigM40243O3 != null && (maxLever = leverDialogConfigM40243O3.getMaxLever()) != null) {
            return maxLever.doubleValue();
        }
        return 10.0d;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            KeyboardUtils.m6033e(activity);
        }
    }
}
