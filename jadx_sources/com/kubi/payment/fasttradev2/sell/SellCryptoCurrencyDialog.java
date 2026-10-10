package com.kubi.payment.fasttradev2.sell;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.data.entities.Balance;
import com.kubi.payment.fast.data.entities.FastTradeCryptoCurrency;
import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import com.kubi.payment.fasttradev2.FastTradeCryptoCurrencyAdapter;
import com.kubi.payment.fasttradev2.FastTradeViewModel;
import com.kubi.payment.fasttradev2.HistoryCurrencyHelper;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import cy.InterfaceC36555b;
import f00.C37304a;
import g00.InterfaceC37749a;
import java.lang.reflect.Type;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37632i0;
import p270ft.C37714z0;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import tt.C45070a;
import tt.C45071b;
import w00.C45681e;

/* JADX INFO: compiled from: SellCryptoCurrencyDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010)\u001a\u00020\u001cH\u0002J\b\u0010*\u001a\u00020\u001cH\u0002J\b\u0010+\u001a\u00020\u0017H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019¨\u0006-"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/sell/SellCryptoCurrencyDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentDialogFastSellCryptoCurrencyBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentDialogFastSellCryptoCurrencyBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mContext", "Landroid/content/Context;", "fastTradeViewModel", "Lcom/kubi/payment/fasttradev2/FastTradeViewModel;", "cryptoCurrencyAdapter", "Lcom/kubi/payment/fasttradev2/FastTradeCryptoCurrencyAdapter;", "sellViewModel", "Lcom/kubi/payment/fasttradev2/sell/SellVM;", "getSellViewModel", "()Lcom/kubi/payment/fasttradev2/sell/SellVM;", "sellViewModel$delegate", "Lkotlin/Lazy;", "useMultiAccountWidget", "", "getUseMultiAccountWidget", "()Z", "useMultiAccountWidget$delegate", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "observeData", "isBottomSheet", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSellCryptoCurrencyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttradev2/sell/SellCryptoCurrencyDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 7 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,231:1\n143#2,20:232\n106#3,15:252\n44#4,2:267\n58#5,23:269\n93#5,3:292\n35#6,4:295\n39#6:301\n44#7,2:299\n1#8:302\n*S KotlinDebug\n*F\n+ 1 SellCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttradev2/sell/SellCryptoCurrencyDialog\n*L\n49#1:232,20\n63#1:252,15\n82#1:267,2\n141#1:269,23\n141#1:292,3\n69#1:295,4\n69#1:301\n69#1:299,2\n*E\n"})
public final class SellCryptoCurrencyDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f39397q0 = C45681e.m100799e(this, new Function1<SellCryptoCurrencyDialog, C37714z0>() { // from class: com.kubi.payment.fasttradev2.sell.SellCryptoCurrencyDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37714z0 invoke(@NotNull SellCryptoCurrencyDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37714z0.m85013a(fragment.requireView());
        }
    }, new Function1<C37714z0, Unit>() { // from class: com.kubi.payment.fasttradev2.sell.SellCryptoCurrencyDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C37714z0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37714z0 c37714z0) {
            invoke(c37714z0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    public Context f39398r0;

    /* JADX INFO: renamed from: s0 */
    public FastTradeViewModel f39399s0;

    /* JADX INFO: renamed from: t0 */
    public FastTradeCryptoCurrencyAdapter f39400t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f39401u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f39402v0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f39396x0 = {Reflection.property1(new PropertyReference1Impl(SellCryptoCurrencyDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentDialogFastSellCryptoCurrencyBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f39395w0 = new Companion(null);

    /* JADX INFO: compiled from: SellCryptoCurrencyDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/sell/SellCryptoCurrencyDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            new SellCryptoCurrencyDialog().show(fragmentManager, "payment_fast_sell_select_crypto_currency");
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.sell.SellCryptoCurrencyDialog$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SellCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttradev2/sell/SellCryptoCurrencyDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n142#2,7:98\n71#3:105\n77#4:106\n*E\n"})
    public static final class C20918a implements TextWatcher {
        public C20918a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            C37632i0 c37632i0;
            ConstraintLayout root;
            FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter = SellCryptoCurrencyDialog.this.f39400t0;
            FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter2 = null;
            if (fastTradeCryptoCurrencyAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
                fastTradeCryptoCurrencyAdapter = null;
            }
            boolean z11 = true;
            if (!fastTradeCryptoCurrencyAdapter.getIsEmptyViewEnable()) {
                FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter3 = SellCryptoCurrencyDialog.this.f39400t0;
                if (fastTradeCryptoCurrencyAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
                    fastTradeCryptoCurrencyAdapter3 = null;
                }
                fastTradeCryptoCurrencyAdapter3.setEmptyViewEnable(true);
            }
            FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter4 = SellCryptoCurrencyDialog.this.f39400t0;
            if (fastTradeCryptoCurrencyAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
            } else {
                fastTradeCryptoCurrencyAdapter2 = fastTradeCryptoCurrencyAdapter4;
            }
            fastTradeCryptoCurrencyAdapter2.getFilter().filter(String.valueOf(s11));
            C37714z0 c37714z0M47941B4 = SellCryptoCurrencyDialog.this.m47941B4();
            if (c37714z0M47941B4 == null || (c37632i0 = c37714z0M47941B4.f84962c) == null || (root = c37632i0.getRoot()) == null) {
                return;
            }
            if (s11 != null && s11.length() != 0) {
                z11 = false;
            }
            root.setVisibility(C21457l.m49860h(z11));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.sell.SellCryptoCurrencyDialog$b */
    /* JADX INFO: compiled from: SellCryptoCurrencyDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttradev2/sell/SellCryptoCurrencyDialog$observeData$3$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20919b extends ClickableSpan {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BaseTextView f39405c;

        public C20919b(BaseTextView baseTextView) {
            this.f39405c = baseTextView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            C43852m.m96591c("B7FastSell", "button", "2", null, 8, null);
            if (!SellCryptoCurrencyDialog.this.m47940A4()) {
                C37304a c37304a = C37304a.f82764a;
                FastTradeViewModel fastTradeViewModel = SellCryptoCurrencyDialog.this.f39399s0;
                if (fastTradeViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
                    fastTradeViewModel = null;
                }
                FastTradeCryptoCurrency.Response value = fastTradeViewModel.m47318y0().getValue();
                InterfaceC37749a.a.m85117l(c37304a, C27041f.m66668h(value != null ? value.getTitle() : null), "TRADE", "MAIN", null, C43852m.m96602n("B7FastSell", "button", null, 4, null), null, null, 104, null);
                return;
            }
            SellCryptoCurrencyDialog.this.dismiss();
            C37304a c37304a2 = C37304a.f82764a;
            FastTradeViewModel fastTradeViewModel2 = SellCryptoCurrencyDialog.this.f39399s0;
            if (fastTradeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
                fastTradeViewModel2 = null;
            }
            FastTradeCryptoCurrency.Response value2 = fastTradeViewModel2.m47318y0().getValue();
            String strM66668h = C27041f.m66668h(value2 != null ? value2.getTitle() : null);
            FastTradeViewModel fastTradeViewModel3 = SellCryptoCurrencyDialog.this.f39399s0;
            if (fastTradeViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
                fastTradeViewModel3 = null;
            }
            FastTradeFiatCurrency.Response value3 = fastTradeViewModel3.m47319z0().getValue();
            String strM66668h2 = C27041f.m66668h(value3 != null ? value3.getTitle() : null);
            String strM48066P = SellCryptoCurrencyDialog.this.m47971z4().m48066P();
            final SellCryptoCurrencyDialog sellCryptoCurrencyDialog = SellCryptoCurrencyDialog.this;
            InterfaceC37749a.a.m85116k(c37304a2, "fast_sell", strM66668h, strM66668h2, "MAIN", strM48066P, null, null, null, new InterfaceC36555b() { // from class: com.kubi.payment.fasttradev2.sell.l
                @Override // cy.InterfaceC36555b
                /* JADX INFO: renamed from: a */
                public final void mo4404a(int i11, Intent intent) {
                    SellCryptoCurrencyDialog.C20919b.m47973b(sellCryptoCurrencyDialog, i11, intent);
                }
            }, 224, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(this.f39405c.getContext(), R$color.brandGreen));
        }

        /* JADX INFO: renamed from: b */
        public static final void m47973b(SellCryptoCurrencyDialog sellCryptoCurrencyDialog, int i11, Intent intent) {
            FastTradeViewModel fastTradeViewModel = sellCryptoCurrencyDialog.f39399s0;
            if (fastTradeViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
                fastTradeViewModel = null;
            }
            fastTradeViewModel.m47289P0();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.sell.SellCryptoCurrencyDialog$c */
    /* JADX INFO: compiled from: SellCryptoCurrencyDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20920c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39406b;

        public C20920c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39406b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f39406b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39406b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.sell.SellCryptoCurrencyDialog$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C20921d extends TypeToken<Boolean> {
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public final boolean m47940A4() {
        return ((Boolean) this.f39402v0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public final C37714z0 m47941B4() {
        return (C37714z0) this.f39397q0.getValue(this, f39396x0[0]);
    }

    /* JADX INFO: renamed from: D4 */
    public static final void m47943D4(SellCryptoCurrencyDialog sellCryptoCurrencyDialog, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter = sellCryptoCurrencyDialog.f39400t0;
        if (fastTradeCryptoCurrencyAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
            fastTradeCryptoCurrencyAdapter = null;
        }
        FastTradeCryptoCurrency.Response item = fastTradeCryptoCurrencyAdapter.getItem(i11);
        FastTradeViewModel fastTradeViewModel = sellCryptoCurrencyDialog.f39399s0;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47295U0(item, true);
        if (item != null) {
            FastTradeViewModel fastTradeViewModel2 = sellCryptoCurrencyDialog.f39399s0;
            if (fastTradeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
                fastTradeViewModel2 = null;
            }
            fastTradeViewModel2.m47294U(item);
        }
        C43852m.m96590b(C27041f.m66668h(sellCryptoCurrencyDialog.getF34288V()), "cryptoSelector", "1", TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(item != null ? item.getTitle() : null)));
        sellCryptoCurrencyDialog.dismiss();
    }

    /* JADX INFO: renamed from: E4 */
    private final void m47944E4() {
        FastTradeViewModel fastTradeViewModel = this.f39399s0;
        FastTradeViewModel fastTradeViewModel2 = null;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47277A0().observe(getViewLifecycleOwner(), new C20920c(new Function1() { // from class: com.kubi.payment.fasttradev2.sell.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellCryptoCurrencyDialog.m47952M4(this.f39440b, (List) obj);
            }
        }));
        FastTradeViewModel fastTradeViewModel3 = this.f39399s0;
        if (fastTradeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
        } else {
            fastTradeViewModel2 = fastTradeViewModel3;
        }
        fastTradeViewModel2.m47313n0().observe(getViewLifecycleOwner(), new C20920c(new Function1() { // from class: com.kubi.payment.fasttradev2.sell.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellCryptoCurrencyDialog.m47945F4(this.f39441b, (List) obj);
            }
        }));
        m47971z4().m48068S().observe(getViewLifecycleOwner(), new C20920c(new Function1() { // from class: com.kubi.payment.fasttradev2.sell.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellCryptoCurrencyDialog.m47951L4(this.f39442b, (Balance.Response) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m47945F4(final SellCryptoCurrencyDialog sellCryptoCurrencyDialog, final List list) {
        C37632i0 c37632i0;
        Function0 function0 = new Function0() { // from class: com.kubi.payment.fasttradev2.sell.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SellCryptoCurrencyDialog.m47950K4(list));
            }
        };
        C37714z0 c37714z0M47941B4 = sellCryptoCurrencyDialog.m47941B4();
        C21457l.m49858f(function0, new View[]{(c37714z0M47941B4 == null || (c37632i0 = c37714z0M47941B4.f84962c) == null) ? null : c37632i0.getRoot()}, new Function0() { // from class: com.kubi.payment.fasttradev2.sell.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SellCryptoCurrencyDialog.m47946G4(this.f39445b, list);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m47946G4(final SellCryptoCurrencyDialog sellCryptoCurrencyDialog, List list) {
        C37632i0 c37632i0;
        HistoryCurrencyHelper historyCurrencyHelper = HistoryCurrencyHelper.f39384a;
        C37714z0 c37714z0M47941B4 = sellCryptoCurrencyDialog.m47941B4();
        if (c37714z0M47941B4 != null && (c37632i0 = c37714z0M47941B4.f84962c) != null) {
            Intrinsics.checkNotNull(list);
            historyCurrencyHelper.m47934c(c37632i0, list, new Function1() { // from class: com.kubi.payment.fasttradev2.sell.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SellCryptoCurrencyDialog.m47947H4((FastTradeCryptoCurrency.Response) obj);
                }
            }, new Function1() { // from class: com.kubi.payment.fasttradev2.sell.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SellCryptoCurrencyDialog.m47948I4(this.f39447b, (FastTradeCryptoCurrency.Response) obj);
                }
            }, new Function0() { // from class: com.kubi.payment.fasttradev2.sell.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SellCryptoCurrencyDialog.m47949J4(this.f39434b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public static final String m47947H4(FastTradeCryptoCurrency.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getTitle();
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m47948I4(SellCryptoCurrencyDialog sellCryptoCurrencyDialog, FastTradeCryptoCurrency.Response item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FastTradeViewModel fastTradeViewModel = sellCryptoCurrencyDialog.f39399s0;
        FastTradeViewModel fastTradeViewModel2 = null;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47295U0(item, true);
        FastTradeViewModel fastTradeViewModel3 = sellCryptoCurrencyDialog.f39399s0;
        if (fastTradeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
        } else {
            fastTradeViewModel2 = fastTradeViewModel3;
        }
        fastTradeViewModel2.m47294U(item);
        sellCryptoCurrencyDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m47949J4(SellCryptoCurrencyDialog sellCryptoCurrencyDialog) {
        FastTradeViewModel fastTradeViewModel = sellCryptoCurrencyDialog.f39399s0;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47303c0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m47952M4(SellCryptoCurrencyDialog sellCryptoCurrencyDialog, List list) {
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter = sellCryptoCurrencyDialog.f39400t0;
        if (fastTradeCryptoCurrencyAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
            fastTradeCryptoCurrencyAdapter = null;
        }
        fastTradeCryptoCurrencyAdapter.m47211x(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public static final boolean m47954O4() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C20921d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_use_fund_component_key", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f39398r0 = context;
        C45071b c45071b = new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get());
        try {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            this.f39399s0 = (FastTradeViewModel) new ViewModelProvider(fragmentActivityRequireActivity, c45071b).get(FastTradeViewModel.class);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "FastSellCryptoCurrencyDialog init FastSellVM", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.payment_dialog_fast_sell_crypto_currency, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        int iM6182d = (C5267e0.m6182d() * 4) / 5;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iM6182d;
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, iM6182d);
            }
            FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet);
            if (frameLayout != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
                bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
            }
        }
        m47942C4();
        m47944E4();
        FastTradeViewModel fastTradeViewModel = this.f39399s0;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47286K0();
    }

    /* JADX INFO: renamed from: z4 */
    public final SellVM m47971z4() {
        return (SellVM) this.f39401u0.getValue();
    }

    public SellCryptoCurrencyDialog() {
        setPageId("B7FastSellCryptoList");
        final Function0 function0 = new Function0() { // from class: com.kubi.payment.fasttradev2.sell.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SellCryptoCurrencyDialog.m47953N4(this.f39432b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.payment.fasttradev2.sell.SellCryptoCurrencyDialog$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f39401u0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SellVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.payment.fasttradev2.sell.SellCryptoCurrencyDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.payment.fasttradev2.sell.SellCryptoCurrencyDialog$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.payment.fasttradev2.sell.SellCryptoCurrencyDialog$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f39402v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fasttradev2.sell.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SellCryptoCurrencyDialog.m47954O4());
            }
        });
    }

    /* JADX INFO: renamed from: C4 */
    private final void m47942C4() {
        C37714z0 c37714z0M47941B4 = m47941B4();
        if (c37714z0M47941B4 == null) {
            return;
        }
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter = new FastTradeCryptoCurrencyAdapter();
        this.f39400t0 = fastTradeCryptoCurrencyAdapter;
        Context context = this.f39398r0;
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        fastTradeCryptoCurrencyAdapter.setEmptyViewLayout(context, R$layout.view_empty);
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter3 = this.f39400t0;
        if (fastTradeCryptoCurrencyAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
            fastTradeCryptoCurrencyAdapter3 = null;
        }
        fastTradeCryptoCurrencyAdapter3.setEmptyViewEnable(false);
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter4 = this.f39400t0;
        if (fastTradeCryptoCurrencyAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
            fastTradeCryptoCurrencyAdapter4 = null;
        }
        fastTradeCryptoCurrencyAdapter4.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.payment.fasttradev2.sell.g
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SellCryptoCurrencyDialog.m47943D4(this.f39443a, baseQuickAdapter, view, i11);
            }
        });
        ClearEditText searchView = c37714z0M47941B4.f84964e;
        Intrinsics.checkNotNullExpressionValue(searchView, "searchView");
        searchView.addTextChangedListener(new C20918a());
        RecyclerView recyclerView = c37714z0M47941B4.f84963d;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter5 = this.f39400t0;
        if (fastTradeCryptoCurrencyAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
        } else {
            fastTradeCryptoCurrencyAdapter2 = fastTradeCryptoCurrencyAdapter5;
        }
        recyclerView.setAdapter(fastTradeCryptoCurrencyAdapter2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public static final boolean m47950K4(List list) {
        Intrinsics.checkNotNull(list);
        return !list.isEmpty();
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m47951L4(SellCryptoCurrencyDialog sellCryptoCurrencyDialog, Balance.Response response) {
        BaseTextView baseTextView;
        String string;
        C37714z0 c37714z0M47941B4 = sellCryptoCurrencyDialog.m47941B4();
        if (c37714z0M47941B4 != null && (baseTextView = c37714z0M47941B4.f84966g) != null) {
            if (sellCryptoCurrencyDialog.m47940A4()) {
                if (Intrinsics.areEqual(response.getMultiAccount(), Boolean.TRUE)) {
                    string = sellCryptoCurrencyDialog.getString(R$string.payment_fast_sell_select_crypto_selected_des);
                } else {
                    string = sellCryptoCurrencyDialog.getString(R$string.payment_fast_sell_select_crypto_fund_des);
                }
            } else {
                string = sellCryptoCurrencyDialog.getString(R$string.payment_fast_sell_select_crypto_des);
            }
            baseTextView.setText(string);
            baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper.f43497a.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, sellCryptoCurrencyDialog.new C20919b(baseTextView)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final ViewModelStoreOwner m47953N4(SellCryptoCurrencyDialog sellCryptoCurrencyDialog) {
        Fragment fragmentRequireParentFragment = sellCryptoCurrencyDialog.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
