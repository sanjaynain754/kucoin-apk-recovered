package com.kubi.core.biz.margininfo.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.material.C7090R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import v30.C45404r;
import w00.C45681e;

/* JADX INFO: compiled from: UnifyLoanCurrencySelectDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005*\u0001(\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J*\u0010\u0018\u001a\u00020\u00002\"\u0010\n\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bJ\b\u0010\u0019\u001a\u00020\u000fH\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010$\u001a\u00020\u000fH\u0002J\b\u0010%\u001a\u00020\u000fH\u0002J\b\u0010&\u001a\u00020\u000fH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0004\n\u0002\u0010)¨\u0006,"}, m90084d2 = {"Lcom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/tradecorebiz/databinding/DialogUnifyLoanCurrencySelectBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/DialogUnifyLoanCurrencySelectBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "callBack", "Lkotlin/Function1;", "Lkotlin/Pair;", "", "Ljava/math/BigDecimal;", "", "coinListFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog$LoanCurrencyItem;", "filterFlow", "originalCoinList", "isBottomSheet", "", "setCallBack", "onStart", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "initObservers", "loadLoanCurrencyData", "adapter", "com/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog$adapter$1", "Lcom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog$adapter$1;", "Companion", "LoanCurrencyItem", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyLoanCurrencySelectDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyLoanCurrencySelectDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,250:1\n143#2,20:251\n65#3,16:271\n93#3,3:287\n*S KotlinDebug\n*F\n+ 1 UnifyLoanCurrencySelectDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog\n*L\n82#1:251,20\n133#1:271,16\n133#1:287,3\n*E\n"})
public final class UnifyLoanCurrencySelectDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function1<? super Pair<String, ? extends BigDecimal>, Unit> f20452r0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f20450x0 = {Reflection.property1(new PropertyReference1Impl(UnifyLoanCurrencySelectDialog.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/DialogUnifyLoanCurrencySelectBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f20449w0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f20451q0 = C45681e.m100799e(this, new Function1<UnifyLoanCurrencySelectDialog, C45404r>() { // from class: com.kubi.core.biz.margininfo.dialog.UnifyLoanCurrencySelectDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45404r invoke(@NotNull UnifyLoanCurrencySelectDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45404r.m100345a(fragment.requireView());
        }
    }, new Function1<C45404r, Unit>() { // from class: com.kubi.core.biz.margininfo.dialog.UnifyLoanCurrencySelectDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C45404r it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45404r c45404r) {
            invoke(c45404r);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final InterfaceC41669n<List<LoanCurrencyItem>> f20453s0 = C41679x.m91009a(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC41669n<String> f20454t0 = C41679x.m91009a(null);

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public List<LoanCurrencyItem> f20455u0 = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final UnifyLoanCurrencySelectDialog$adapter$1 f20456v0 = new UnifyLoanCurrencySelectDialog$adapter$1(this, R$layout.item_unify_loan_currency);

    /* JADX INFO: compiled from: UnifyLoanCurrencySelectDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog$Companion;", "", "<init>", "()V", "ARG_SELECTED_CURRENCY", "", "ARG_BASE_CURRENCY", "ARG_QUOTE_CURRENCY", "create", "Lcom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog;", "selectedCurrency", "baseCurrency", "quoteCurrency", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nUnifyLoanCurrencySelectDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyLoanCurrencySelectDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n1#2:251\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ UnifyLoanCurrencySelectDialog create$default(Companion companion, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            return companion.create(str, str2, str3);
        }

        @NotNull
        public final UnifyLoanCurrencySelectDialog create(@Nullable String selectedCurrency, @Nullable String baseCurrency, @Nullable String quoteCurrency) {
            UnifyLoanCurrencySelectDialog unifyLoanCurrencySelectDialog = new UnifyLoanCurrencySelectDialog();
            Bundle bundle = new Bundle();
            if (selectedCurrency != null) {
                bundle.putString("selectedCurrency", selectedCurrency);
            }
            if (baseCurrency != null) {
                bundle.putString("baseCurrency", baseCurrency);
            }
            if (quoteCurrency != null) {
                bundle.putString("quoteCurrency", quoteCurrency);
            }
            unifyLoanCurrencySelectDialog.setArguments(bundle);
            return unifyLoanCurrencySelectDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UnifyLoanCurrencySelectDialog$a, reason: from toString */
    /* JADX INFO: compiled from: UnifyLoanCurrencySelectDialog.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog$LoanCurrencyItem;", "", FirebaseAnalytics.Param.CURRENCY, "", "originalCurrency", "name", "iconUrl", "leverage", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "getOriginalCurrency", "getName", "getIconUrl", "getLeverage", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LoanCurrencyItem {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String currency;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String originalCurrency;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String iconUrl;

        /* JADX INFO: renamed from: e, reason: from toString */
        @NotNull
        public final BigDecimal leverage;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoanCurrencyItem)) {
                return false;
            }
            LoanCurrencyItem loanCurrencyItem = (LoanCurrencyItem) other;
            return Intrinsics.areEqual(this.currency, loanCurrencyItem.currency) && Intrinsics.areEqual(this.originalCurrency, loanCurrencyItem.originalCurrency) && Intrinsics.areEqual(this.name, loanCurrencyItem.name) && Intrinsics.areEqual(this.iconUrl, loanCurrencyItem.iconUrl) && Intrinsics.areEqual(this.leverage, loanCurrencyItem.leverage);
        }

        public LoanCurrencyItem(@Nullable String str, @NotNull String originalCurrency, @NotNull String name, @Nullable String str2, @NotNull BigDecimal leverage) {
            Intrinsics.checkNotNullParameter(originalCurrency, "originalCurrency");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(leverage, "leverage");
            this.currency = str;
            this.originalCurrency = originalCurrency;
            this.name = name;
            this.iconUrl = str2;
            this.leverage = leverage;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getLeverage() {
            return this.leverage;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getOriginalCurrency() {
            return this.originalCurrency;
        }

        public int hashCode() {
            String str = this.currency;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.originalCurrency.hashCode()) * 31) + this.name.hashCode()) * 31;
            String str2 = this.iconUrl;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.leverage.hashCode();
        }

        @NotNull
        public String toString() {
            return "LoanCurrencyItem(currency=" + this.currency + ", originalCurrency=" + this.originalCurrency + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", leverage=" + this.leverage + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UnifyLoanCurrencySelectDialog$b */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 UnifyLoanCurrencySelectDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n134#2,2:98\n71#3:100\n77#4:101\n*E\n"})
    public static final class C11931b implements TextWatcher {
        public C11931b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            String string;
            UnifyLoanCurrencySelectDialog.this.f20454t0.setValue((s11 == null || (string = s11.toString()) == null) ? null : StringsKt.trim((CharSequence) string).toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m21882u4(UnifyLoanCurrencySelectDialog unifyLoanCurrencySelectDialog) {
        Function1<? super Pair<String, ? extends BigDecimal>, Unit> function1 = unifyLoanCurrencySelectDialog.f20452r0;
        if (function1 != null) {
            function1.invoke(null);
        }
        unifyLoanCurrencySelectDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.dialog_unify_loan_currency_select, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m21881t4();
        m21880s4();
        m21884v4();
    }

    /* JADX INFO: renamed from: r4 */
    public final C45404r m21883r4() {
        return (C45404r) this.f20451q0.getValue(this, f20450x0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: w4 */
    public final UnifyLoanCurrencySelectDialog m21885w4(@Nullable Function1<? super Pair<String, ? extends BigDecimal>, Unit> function1) {
        this.f20452r0 = function1;
        return this;
    }

    /* JADX INFO: renamed from: s4 */
    private final void m21880s4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UnifyLoanCurrencySelectDialog$initObservers$1(this, null), 3, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UnifyLoanCurrencySelectDialog$initObservers$2(this, null), 3, null);
    }

    /* JADX INFO: renamed from: t4 */
    private final void m21881t4() {
        C45404r c45404rM21883r4 = m21883r4();
        if (c45404rM21883r4 != null) {
            ClearEditText etSearchBar = c45404rM21883r4.f102310b;
            Intrinsics.checkNotNullExpressionValue(etSearchBar, "etSearchBar");
            etSearchBar.addTextChangedListener(new C11931b());
            ImageView ivClose = c45404rM21883r4.f102311c;
            Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
            C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.core.biz.margininfo.dialog.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyLoanCurrencySelectDialog.m21882u4(this.f20481b);
                }
            }, 1, null);
            this.f20456v0.bindToRecyclerView(c45404rM21883r4.f102313e);
            c45404rM21883r4.f102313e.setAdapter(this.f20456v0);
            this.f20456v0.setEmptyView(R$layout.view_loading);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        BottomSheetDialog bottomSheetDialog;
        View viewFindViewById;
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 instanceof BottomSheetDialog) {
            bottomSheetDialog = (BottomSheetDialog) dialog2;
        } else {
            bottomSheetDialog = null;
        }
        if (bottomSheetDialog == null || (viewFindViewById = bottomSheetDialog.findViewById(C7090R.id.design_bottom_sheet)) == null) {
            return;
        }
        int i11 = (requireContext().getResources().getDisplayMetrics().heightPixels * 2) / 3;
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, i11);
        }
        layoutParams.height = i11;
        viewFindViewById.setLayoutParams(layoutParams);
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
        behavior.setPeekHeight(i11);
        behavior.setState(3);
        behavior.setSkipCollapsed(true);
    }

    /* JADX INFO: renamed from: v4 */
    public final void m21884v4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new UnifyLoanCurrencySelectDialog$loadLoanCurrencyData$1(this, null), 2, null);
    }
}
