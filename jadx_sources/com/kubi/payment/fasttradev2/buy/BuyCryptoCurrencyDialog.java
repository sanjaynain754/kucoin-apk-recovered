package com.kubi.payment.fasttradev2.buy;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.kucoin.view.IndexBar;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.fast.data.entities.FastTradeCryptoCurrency;
import com.kubi.payment.fasttradev2.FastTradeCryptoCurrencyAdapter;
import com.kubi.payment.fasttradev2.FastTradeViewModel;
import com.kubi.payment.fasttradev2.HistoryCurrencyHelper;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37632i0;
import p270ft.C37692u0;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import tt.C45070a;
import tt.C45071b;
import w00.C45681e;

/* JADX INFO: compiled from: BuyCryptoCurrencyDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\u0016\u0010 \u001a\u00020\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002J\b\u0010$\u001a\u00020%H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentDialogFastBuyCryptoCurrencyBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentDialogFastBuyCryptoCurrencyBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mContext", "Landroid/content/Context;", "fastTradeViewModel", "Lcom/kubi/payment/fasttradev2/FastTradeViewModel;", "cryptoCurrencyAdapter", "Lcom/kubi/payment/fasttradev2/FastTradeCryptoCurrencyAdapter;", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "observeData", "listenSideBar", "itemList", "", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;", "isBottomSheet", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyCryptoCurrencyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n143#2,20:183\n58#3,23:203\n93#3,3:226\n1#4:229\n1#4:243\n774#5:230\n865#5,2:231\n1617#5,9:233\n1869#5:242\n1870#5:244\n1626#5:245\n*S KotlinDebug\n*F\n+ 1 BuyCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog\n*L\n38#1:183,20\n115#1:203,23\n115#1:226,3\n136#1:243\n134#1:230\n134#1:231,2\n136#1:233,9\n136#1:242\n136#1:244\n136#1:245\n*E\n"})
public final class BuyCryptoCurrencyDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f39015q0 = C45681e.m100799e(this, new Function1<BuyCryptoCurrencyDialog, C37692u0>() { // from class: com.kubi.payment.fasttradev2.buy.BuyCryptoCurrencyDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37692u0 invoke(@NotNull BuyCryptoCurrencyDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37692u0.m84975a(fragment.requireView());
        }
    }, new Function1<C37692u0, Unit>() { // from class: com.kubi.payment.fasttradev2.buy.BuyCryptoCurrencyDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C37692u0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37692u0 c37692u0) {
            invoke(c37692u0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    public Context f39016r0;

    /* JADX INFO: renamed from: s0 */
    public FastTradeViewModel f39017s0;

    /* JADX INFO: renamed from: t0 */
    public FastTradeCryptoCurrencyAdapter f39018t0;

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f39014v0 = {Reflection.property1(new PropertyReference1Impl(BuyCryptoCurrencyDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentDialogFastBuyCryptoCurrencyBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f39013u0 = new Companion(null);

    /* JADX INFO: compiled from: BuyCryptoCurrencyDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            new BuyCryptoCurrencyDialog().show(fragmentManager, "payment_fast_buy_select_crypto_currency");
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.BuyCryptoCurrencyDialog$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 BuyCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n116#2,7:98\n71#3:105\n77#4:106\n*E\n"})
    public static final class C20703a implements TextWatcher {
        public C20703a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            C37632i0 c37632i0;
            ConstraintLayout root;
            FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter = BuyCryptoCurrencyDialog.this.f39018t0;
            FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter2 = null;
            if (fastTradeCryptoCurrencyAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
                fastTradeCryptoCurrencyAdapter = null;
            }
            boolean z11 = true;
            if (!fastTradeCryptoCurrencyAdapter.getIsEmptyViewEnable()) {
                FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter3 = BuyCryptoCurrencyDialog.this.f39018t0;
                if (fastTradeCryptoCurrencyAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
                    fastTradeCryptoCurrencyAdapter3 = null;
                }
                fastTradeCryptoCurrencyAdapter3.setEmptyViewEnable(true);
            }
            FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter4 = BuyCryptoCurrencyDialog.this.f39018t0;
            if (fastTradeCryptoCurrencyAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
            } else {
                fastTradeCryptoCurrencyAdapter2 = fastTradeCryptoCurrencyAdapter4;
            }
            fastTradeCryptoCurrencyAdapter2.getFilter().filter(String.valueOf(s11));
            C37692u0 c37692u0M47335t4 = BuyCryptoCurrencyDialog.this.m47335t4();
            if (c37692u0M47335t4 == null || (c37632i0 = c37692u0M47335t4.f84693c) == null || (root = c37632i0.getRoot()) == null) {
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

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.BuyCryptoCurrencyDialog$b */
    /* JADX INFO: compiled from: BuyCryptoCurrencyDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog$listenSideBar$1", "Lcom/kubi/kucoin/view/IndexBar$OnIndexPressListener;", "onIndexChange", "", "index", "", "text", "", "onMotionEventEnd", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBuyCryptoCurrencyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog$listenSideBar$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n360#2,7:183\n*S KotlinDebug\n*F\n+ 1 BuyCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog$listenSideBar$1\n*L\n163#1:183,7\n*E\n"})
    public static final class C20704b implements IndexBar.InterfaceC15757a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<FastTradeCryptoCurrency.Response> f39020a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LinearLayoutManager f39021b;

        public C20704b(List<FastTradeCryptoCurrency.Response> list, LinearLayoutManager linearLayoutManager) {
            this.f39020a = list;
            this.f39021b = linearLayoutManager;
        }

        @Override // com.kubi.kucoin.view.IndexBar.InterfaceC15757a
        /* JADX INFO: renamed from: a */
        public void mo19005a(int i11, String text) {
            LinearLayoutManager linearLayoutManager;
            String title;
            Intrinsics.checkNotNullParameter(text, "text");
            Iterator<FastTradeCryptoCurrency.Response> it = this.f39020a.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                FastTradeCryptoCurrency.Response next = it.next();
                if (Intrinsics.areEqual(next.getCanIndex(), Boolean.TRUE) && (title = next.getTitle()) != null && StringsKt.first(title) == StringsKt.first(text)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 < 0 || (linearLayoutManager = this.f39021b) == null) {
                return;
            }
            linearLayoutManager.scrollToPositionWithOffset(i12, 0);
        }

        @Override // com.kubi.kucoin.view.IndexBar.InterfaceC15757a
        /* JADX INFO: renamed from: b */
        public void mo19006b() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.BuyCryptoCurrencyDialog$c */
    /* JADX INFO: compiled from: BuyCryptoCurrencyDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20705c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39022b;

        public C20705c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39022b = function;
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
            return this.f39022b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39022b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: A4 */
    public static final String m47320A4(FastTradeCryptoCurrency.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getTitle();
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m47321B4(BuyCryptoCurrencyDialog buyCryptoCurrencyDialog, FastTradeCryptoCurrency.Response item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FastTradeViewModel fastTradeViewModel = buyCryptoCurrencyDialog.f39017s0;
        FastTradeViewModel fastTradeViewModel2 = null;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47295U0(item, true);
        FastTradeViewModel fastTradeViewModel3 = buyCryptoCurrencyDialog.f39017s0;
        if (fastTradeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
        } else {
            fastTradeViewModel2 = fastTradeViewModel3;
        }
        fastTradeViewModel2.m47294U(item);
        buyCryptoCurrencyDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m47322C4(BuyCryptoCurrencyDialog buyCryptoCurrencyDialog) {
        FastTradeViewModel fastTradeViewModel = buyCryptoCurrencyDialog.f39017s0;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47303c0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m47324E4(BuyCryptoCurrencyDialog buyCryptoCurrencyDialog, List list) {
        IndexBar indexBar;
        String upperCase;
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter = buyCryptoCurrencyDialog.f39018t0;
        if (fastTradeCryptoCurrencyAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
            fastTradeCryptoCurrencyAdapter = null;
        }
        fastTradeCryptoCurrencyAdapter.m47211x(list);
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((FastTradeCryptoCurrency.Response) obj).getCanIndex(), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        C37692u0 c37692u0M47335t4 = buyCryptoCurrencyDialog.m47335t4();
        if (c37692u0M47335t4 != null && (indexBar = c37692u0M47335t4.f84696f) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String title = ((FastTradeCryptoCurrency.Response) it.next()).getTitle();
                if (title != null) {
                    String strValueOf = String.valueOf(StringsKt.first(title));
                    Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                } else {
                    upperCase = null;
                }
                if (upperCase != null) {
                    arrayList2.add(upperCase);
                }
            }
            indexBar.setSourceDataList(CollectionsKt.distinct(arrayList2));
        }
        buyCryptoCurrencyDialog.m47338w4(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public final C37692u0 m47335t4() {
        return (C37692u0) this.f39015q0.getValue(this, f39014v0[0]);
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m47337v4(BuyCryptoCurrencyDialog buyCryptoCurrencyDialog, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter = buyCryptoCurrencyDialog.f39018t0;
        if (fastTradeCryptoCurrencyAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
            fastTradeCryptoCurrencyAdapter = null;
        }
        FastTradeCryptoCurrency.Response item = fastTradeCryptoCurrencyAdapter.getItem(i11);
        FastTradeViewModel fastTradeViewModel = buyCryptoCurrencyDialog.f39017s0;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47295U0(item, true);
        if (item != null) {
            FastTradeViewModel fastTradeViewModel2 = buyCryptoCurrencyDialog.f39017s0;
            if (fastTradeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
                fastTradeViewModel2 = null;
            }
            fastTradeViewModel2.m47294U(item);
        }
        C43852m.m96590b(C27041f.m66668h(buyCryptoCurrencyDialog.getF34288V()), "cryptoSelector", "1", TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(item != null ? item.getTitle() : null)));
        buyCryptoCurrencyDialog.dismiss();
    }

    /* JADX INFO: renamed from: x4 */
    private final void m47339x4() {
        FastTradeViewModel fastTradeViewModel = this.f39017s0;
        FastTradeViewModel fastTradeViewModel2 = null;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47312m0().observe(getViewLifecycleOwner(), new C20705c(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyCryptoCurrencyDialog.m47324E4(this.f39052b, (List) obj);
            }
        }));
        FastTradeViewModel fastTradeViewModel3 = this.f39017s0;
        if (fastTradeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
        } else {
            fastTradeViewModel2 = fastTradeViewModel3;
        }
        fastTradeViewModel2.m47313n0().observe(getViewLifecycleOwner(), new C20705c(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyCryptoCurrencyDialog.m47340y4(this.f39057b, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m47340y4(final BuyCryptoCurrencyDialog buyCryptoCurrencyDialog, final List list) {
        C37632i0 c37632i0;
        Function0 function0 = new Function0() { // from class: com.kubi.payment.fasttradev2.buy.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(BuyCryptoCurrencyDialog.m47323D4(list));
            }
        };
        C37692u0 c37692u0M47335t4 = buyCryptoCurrencyDialog.m47335t4();
        C21457l.m49858f(function0, new View[]{(c37692u0M47335t4 == null || (c37632i0 = c37692u0M47335t4.f84693c) == null) ? null : c37632i0.getRoot()}, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyCryptoCurrencyDialog.m47341z4(this.f39236b, list);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m47341z4(final BuyCryptoCurrencyDialog buyCryptoCurrencyDialog, List list) {
        C37632i0 c37632i0;
        HistoryCurrencyHelper historyCurrencyHelper = HistoryCurrencyHelper.f39384a;
        C37692u0 c37692u0M47335t4 = buyCryptoCurrencyDialog.m47335t4();
        if (c37692u0M47335t4 != null && (c37632i0 = c37692u0M47335t4.f84693c) != null) {
            Intrinsics.checkNotNull(list);
            historyCurrencyHelper.m47934c(c37632i0, list, new Function1() { // from class: com.kubi.payment.fasttradev2.buy.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BuyCryptoCurrencyDialog.m47320A4((FastTradeCryptoCurrency.Response) obj);
                }
            }, new Function1() { // from class: com.kubi.payment.fasttradev2.buy.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BuyCryptoCurrencyDialog.m47321B4(this.f39245b, (FastTradeCryptoCurrency.Response) obj);
                }
            }, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BuyCryptoCurrencyDialog.m47322C4(this.f39250b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f39016r0 = context;
        C45071b c45071b = new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f39017s0 = (FastTradeViewModel) new ViewModelProvider(fragmentActivityRequireActivity, c45071b).get(FastTradeViewModel.class);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.payment_dialog_fast_buy_crypto_currency, container, false);
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
        m47336u4();
        m47339x4();
        FastTradeViewModel fastTradeViewModel = this.f39017s0;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeViewModel");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47286K0();
    }

    public BuyCryptoCurrencyDialog() {
        setPageId("B7FastBuyCryptoList");
    }

    /* JADX INFO: renamed from: D4 */
    public static final boolean m47323D4(List list) {
        Intrinsics.checkNotNull(list);
        return !list.isEmpty();
    }

    /* JADX INFO: renamed from: u4 */
    private final void m47336u4() {
        C37692u0 c37692u0M47335t4 = m47335t4();
        if (c37692u0M47335t4 == null) {
            return;
        }
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter = new FastTradeCryptoCurrencyAdapter();
        this.f39018t0 = fastTradeCryptoCurrencyAdapter;
        Context context = this.f39016r0;
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        fastTradeCryptoCurrencyAdapter.setEmptyViewLayout(context, R$layout.view_empty);
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter3 = this.f39018t0;
        if (fastTradeCryptoCurrencyAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
            fastTradeCryptoCurrencyAdapter3 = null;
        }
        fastTradeCryptoCurrencyAdapter3.setEmptyViewEnable(false);
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter4 = this.f39018t0;
        if (fastTradeCryptoCurrencyAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
            fastTradeCryptoCurrencyAdapter4 = null;
        }
        fastTradeCryptoCurrencyAdapter4.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.payment.fasttradev2.buy.a
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                BuyCryptoCurrencyDialog.m47337v4(this.f39050a, baseQuickAdapter, view, i11);
            }
        });
        ClearEditText searchView = c37692u0M47335t4.f84695e;
        Intrinsics.checkNotNullExpressionValue(searchView, "searchView");
        searchView.addTextChangedListener(new C20703a());
        RecyclerView recyclerView = c37692u0M47335t4.f84694d;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        FastTradeCryptoCurrencyAdapter fastTradeCryptoCurrencyAdapter5 = this.f39018t0;
        if (fastTradeCryptoCurrencyAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoCurrencyAdapter");
        } else {
            fastTradeCryptoCurrencyAdapter2 = fastTradeCryptoCurrencyAdapter5;
        }
        recyclerView.setAdapter(fastTradeCryptoCurrencyAdapter2);
    }

    /* JADX INFO: renamed from: w4 */
    private final void m47338w4(List<FastTradeCryptoCurrency.Response> list) {
        RecyclerView.LayoutManager layoutManager;
        IndexBar indexBar;
        RecyclerView recyclerView;
        C37692u0 c37692u0M47335t4 = m47335t4();
        LinearLayoutManager linearLayoutManager = null;
        if (c37692u0M47335t4 != null && (recyclerView = c37692u0M47335t4.f84694d) != null) {
            layoutManager = recyclerView.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        }
        C37692u0 c37692u0M47335t5 = m47335t4();
        if (c37692u0M47335t5 != null && (indexBar = c37692u0M47335t5.f84696f) != null) {
            indexBar.setOnIndexPressListener(new C20704b(list, linearLayoutManager));
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
