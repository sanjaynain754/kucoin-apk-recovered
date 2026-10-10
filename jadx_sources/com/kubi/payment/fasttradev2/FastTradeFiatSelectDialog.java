package com.kubi.payment.fasttradev2;

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
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.router.utils.RouteExKt;
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
import p270ft.C37702w0;
import p569qq.C43846g;
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

/* JADX INFO: compiled from: FastTradeFiatSelectDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010 \u001a\u00020\u0013H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0016\u0010$\u001a\u00020\u00132\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0&H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/FastTradeFiatSelectDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentDialogFastFiatSelectBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentDialogFastFiatSelectBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mContext", "Landroid/content/Context;", "tradeSide", "", "fastTradeVM", "Lcom/kubi/payment/fasttradev2/FastTradeViewModel;", "fastTradeFiatCurrencySelectAdapter", "Lcom/kubi/payment/fasttradev2/FastTradeFiatCurrencySelectAdapter;", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "observeData", "isBottomSheet", "", "listenSideBar", "titleList", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastTradeFiatSelectDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeFiatSelectDialog.kt\ncom/kubi/payment/fasttradev2/FastTradeFiatSelectDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n143#2,20:202\n44#3,2:222\n58#4,23:224\n93#4,3:247\n1761#5,3:250\n774#5:254\n865#5,2:255\n1617#5,9:257\n1869#5:266\n1870#5:268\n1626#5:269\n1563#5:270\n1634#5,3:271\n1#6:253\n1#6:267\n*S KotlinDebug\n*F\n+ 1 FastTradeFiatSelectDialog.kt\ncom/kubi/payment/fasttradev2/FastTradeFiatSelectDialog\n*L\n38#1:202,20\n64#1:222,2\n130#1:224,23\n130#1:247,3\n179#1:250,3\n150#1:254\n150#1:255,2\n151#1:257,9\n151#1:266\n151#1:268\n151#1:269\n156#1:270\n156#1:271,3\n151#1:267\n*E\n"})
public final class FastTradeFiatSelectDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    public Context f38985r0;

    /* JADX INFO: renamed from: t0 */
    public FastTradeViewModel f38987t0;

    /* JADX INFO: renamed from: u0 */
    public FastTradeFiatCurrencySelectAdapter f38988u0;

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f38983w0 = {Reflection.property1(new PropertyReference1Impl(FastTradeFiatSelectDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentDialogFastFiatSelectBinding;", 0))};

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f38982v0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f38984q0 = C45681e.m100799e(this, new Function1<FastTradeFiatSelectDialog, C37702w0>() { // from class: com.kubi.payment.fasttradev2.FastTradeFiatSelectDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37702w0 invoke(@NotNull FastTradeFiatSelectDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37702w0.m84992a(fragment.requireView());
        }
    }, new Function1<C37702w0, Unit>() { // from class: com.kubi.payment.fasttradev2.FastTradeFiatSelectDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C37702w0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37702w0 c37702w0) {
            invoke(c37702w0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public String f38986s0 = "BUY";

    /* JADX INFO: compiled from: FastTradeFiatSelectDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/FastTradeFiatSelectDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "tradeSide", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFastTradeFiatSelectDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeFiatSelectDialog.kt\ncom/kubi/payment/fasttradev2/FastTradeFiatSelectDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager, @NotNull String tradeSide) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            FastTradeFiatSelectDialog fastTradeFiatSelectDialog = new FastTradeFiatSelectDialog();
            Bundle bundle = new Bundle();
            bundle.putString("side", tradeSide);
            fastTradeFiatSelectDialog.setArguments(bundle);
            fastTradeFiatSelectDialog.show(fragmentManager, "payment_fast_trade_select_fiat_currency");
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeFiatSelectDialog$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 FastTradeFiatSelectDialog.kt\ncom/kubi/payment/fasttradev2/FastTradeFiatSelectDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n131#2,7:98\n71#3:105\n77#4:106\n*E\n"})
    public static final class C20687a implements TextWatcher {
        public C20687a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            C37632i0 c37632i0;
            ConstraintLayout root;
            FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter = FastTradeFiatSelectDialog.this.f38988u0;
            FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter2 = null;
            if (fastTradeFiatCurrencySelectAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fastTradeFiatCurrencySelectAdapter");
                fastTradeFiatCurrencySelectAdapter = null;
            }
            boolean z11 = true;
            if (!fastTradeFiatCurrencySelectAdapter.getIsEmptyViewEnable()) {
                FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter3 = FastTradeFiatSelectDialog.this.f38988u0;
                if (fastTradeFiatCurrencySelectAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fastTradeFiatCurrencySelectAdapter");
                    fastTradeFiatCurrencySelectAdapter3 = null;
                }
                fastTradeFiatCurrencySelectAdapter3.setEmptyViewEnable(true);
            }
            FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter4 = FastTradeFiatSelectDialog.this.f38988u0;
            if (fastTradeFiatCurrencySelectAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fastTradeFiatCurrencySelectAdapter");
            } else {
                fastTradeFiatCurrencySelectAdapter2 = fastTradeFiatCurrencySelectAdapter4;
            }
            fastTradeFiatCurrencySelectAdapter2.getFilter().filter(String.valueOf(s11));
            C37702w0 c37702w0M47242t4 = FastTradeFiatSelectDialog.this.m47242t4();
            if (c37702w0M47242t4 == null || (c37632i0 = c37702w0M47242t4.f84808b) == null || (root = c37632i0.getRoot()) == null) {
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

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeFiatSelectDialog$b */
    /* JADX INFO: compiled from: FastTradeFiatSelectDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttradev2/FastTradeFiatSelectDialog$listenSideBar$1", "Lcom/kubi/kucoin/view/IndexBar$OnIndexPressListener;", "onIndexChange", "", "index", "", "text", "", "onMotionEventEnd", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFastTradeFiatSelectDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeFiatSelectDialog.kt\ncom/kubi/payment/fasttradev2/FastTradeFiatSelectDialog$listenSideBar$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,201:1\n360#2,7:202\n*S KotlinDebug\n*F\n+ 1 FastTradeFiatSelectDialog.kt\ncom/kubi/payment/fasttradev2/FastTradeFiatSelectDialog$listenSideBar$1\n*L\n184#1:202,7\n*E\n"})
    public static final class C20688b implements IndexBar.InterfaceC15757a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<String> f38990a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f38991b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LinearLayoutManager f38992c;

        public C20688b(List<String> list, boolean z11, LinearLayoutManager linearLayoutManager) {
            this.f38990a = list;
            this.f38991b = z11;
            this.f38992c = linearLayoutManager;
        }

        @Override // com.kubi.kucoin.view.IndexBar.InterfaceC15757a
        /* JADX INFO: renamed from: a */
        public void mo19005a(int i11, String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            Iterator<String> it = this.f38990a.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                } else if (StringsKt.first(it.next()) == StringsKt.first(text)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 >= 0) {
                if (this.f38991b) {
                    i12++;
                }
                LinearLayoutManager linearLayoutManager = this.f38992c;
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(i12, 0);
                }
            }
        }

        @Override // com.kubi.kucoin.view.IndexBar.InterfaceC15757a
        /* JADX INFO: renamed from: b */
        public void mo19006b() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeFiatSelectDialog$c */
    /* JADX INFO: compiled from: FastTradeFiatSelectDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20689c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38993b;

        public C20689c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38993b = function;
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
            return this.f38993b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38993b.invoke(obj);
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

    /* JADX INFO: renamed from: B4 */
    public static final Unit m47223B4(final FastTradeFiatSelectDialog fastTradeFiatSelectDialog, List list) {
        C37632i0 c37632i0;
        HistoryCurrencyHelper historyCurrencyHelper = HistoryCurrencyHelper.f39384a;
        C37702w0 c37702w0M47242t4 = fastTradeFiatSelectDialog.m47242t4();
        if (c37702w0M47242t4 != null && (c37632i0 = c37702w0M47242t4.f84808b) != null) {
            Intrinsics.checkNotNull(list);
            historyCurrencyHelper.m47934c(c37632i0, list, new Function1() { // from class: com.kubi.payment.fasttradev2.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FastTradeFiatSelectDialog.m47224C4((FastTradeFiatCurrency.Response) obj);
                }
            }, new Function1() { // from class: com.kubi.payment.fasttradev2.c0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FastTradeFiatSelectDialog.m47225D4(this.f39324b, (FastTradeFiatCurrency.Response) obj);
                }
            }, new Function0() { // from class: com.kubi.payment.fasttradev2.d0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FastTradeFiatSelectDialog.m47226E4(this.f39370b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final String m47224C4(FastTradeFiatCurrency.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getTitle();
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m47225D4(FastTradeFiatSelectDialog fastTradeFiatSelectDialog, FastTradeFiatCurrency.Response item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FastTradeViewModel fastTradeViewModel = fastTradeFiatSelectDialog.f38987t0;
        FastTradeViewModel fastTradeViewModel2 = null;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeVM");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47296V0(item, true);
        FastTradeViewModel fastTradeViewModel3 = fastTradeFiatSelectDialog.f38987t0;
        if (fastTradeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeVM");
        } else {
            fastTradeViewModel2 = fastTradeViewModel3;
        }
        fastTradeViewModel2.m47297W(item);
        fastTradeFiatSelectDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m47226E4(FastTradeFiatSelectDialog fastTradeFiatSelectDialog) {
        FastTradeViewModel fastTradeViewModel = fastTradeFiatSelectDialog.f38987t0;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeVM");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47304d0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m47238v4(FastTradeFiatSelectDialog fastTradeFiatSelectDialog, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        FastTradeFiatCurrency.Response fiatCurrency;
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter = fastTradeFiatSelectDialog.f38988u0;
        String title = null;
        if (fastTradeFiatCurrencySelectAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeFiatCurrencySelectAdapter");
            fastTradeFiatCurrencySelectAdapter = null;
        }
        ItemFiatCurrency item = fastTradeFiatCurrencySelectAdapter.getItem(i11);
        FastTradeViewModel fastTradeViewModel = fastTradeFiatSelectDialog.f38987t0;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeVM");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47296V0(item != null ? item.getFiatCurrency() : null, true);
        if (item != null) {
            FastTradeViewModel fastTradeViewModel2 = fastTradeFiatSelectDialog.f38987t0;
            if (fastTradeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fastTradeVM");
                fastTradeViewModel2 = null;
            }
            fastTradeViewModel2.m47297W(item.getFiatCurrency());
        }
        String strM66668h = C27041f.m66668h(fastTradeFiatSelectDialog.getF34288V());
        if (item != null && (fiatCurrency = item.getFiatCurrency()) != null) {
            title = fiatCurrency.getTitle();
        }
        C43852m.m96590b(strM66668h, "fiatSelector", "1", TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(title)), TuplesKt.m90091to("type", Intrinsics.areEqual(fastTradeFiatSelectDialog.f38986s0, "BUY") ? "buy" : "sell"));
        fastTradeFiatSelectDialog.dismiss();
    }

    /* JADX INFO: renamed from: x4 */
    private final void m47239x4() {
        FastTradeViewModel fastTradeViewModel = this.f38987t0;
        FastTradeViewModel fastTradeViewModel2 = null;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeVM");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47315p0().observe(getViewLifecycleOwner(), new C20689c(new Function1() { // from class: com.kubi.payment.fasttradev2.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastTradeFiatSelectDialog.m47240y4(this.f39472b, (List) obj);
            }
        }));
        FastTradeViewModel fastTradeViewModel3 = this.f38987t0;
        if (fastTradeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeVM");
        } else {
            fastTradeViewModel2 = fastTradeViewModel3;
        }
        fastTradeViewModel2.m47316q0().observe(getViewLifecycleOwner(), new C20689c(new Function1() { // from class: com.kubi.payment.fasttradev2.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastTradeFiatSelectDialog.m47241z4(this.f39473b, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m47240y4(FastTradeFiatSelectDialog fastTradeFiatSelectDialog, List list) {
        IndexBar indexBar;
        String upperCase;
        FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter = fastTradeFiatSelectDialog.f38988u0;
        if (fastTradeFiatCurrencySelectAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeFiatCurrencySelectAdapter");
            fastTradeFiatCurrencySelectAdapter = null;
        }
        fastTradeFiatCurrencySelectAdapter.m47221w(list);
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ItemFiatCurrency) obj).getF38450c() == 1) {
                arrayList.add(obj);
            }
        }
        C37702w0 c37702w0M47242t4 = fastTradeFiatSelectDialog.m47242t4();
        if (c37702w0M47242t4 != null && (indexBar = c37702w0M47242t4.f84811e) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String title = ((ItemFiatCurrency) it.next()).getFiatCurrency().getTitle();
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
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(C27041f.m66668h(((ItemFiatCurrency) it2.next()).getFiatCurrency().getTitle()));
        }
        fastTradeFiatSelectDialog.m47243w4(arrayList3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m47241z4(final FastTradeFiatSelectDialog fastTradeFiatSelectDialog, final List list) {
        C37632i0 c37632i0;
        Function0 function0 = new Function0() { // from class: com.kubi.payment.fasttradev2.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(FastTradeFiatSelectDialog.m47222A4(list));
            }
        };
        C37702w0 c37702w0M47242t4 = fastTradeFiatSelectDialog.m47242t4();
        C21457l.m49858f(function0, new View[]{(c37702w0M47242t4 == null || (c37632i0 = c37702w0M47242t4.f84808b) == null) ? null : c37632i0.getRoot()}, new Function0() { // from class: com.kubi.payment.fasttradev2.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeFiatSelectDialog.m47223B4(this.f39010b, list);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f38985r0 = context;
        C45071b c45071b = new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get());
        try {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            this.f38987t0 = (FastTradeViewModel) new ViewModelProvider(fragmentActivityRequireActivity, c45071b).get(FastTradeViewModel.class);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "FastTradeFiatSelectDialog init FastTradeViewModel", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.payment_dialog_fast_fiat_select, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        int iM6182d = (C5267e0.m6182d() * 4) / 5;
        view.getLayoutParams().height = iM6182d;
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
                bottomSheetBehaviorFrom.setState(3);
            }
        }
        m47237u4();
        m47239x4();
        FastTradeViewModel fastTradeViewModel = this.f38987t0;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeVM");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47288N0();
    }

    /* JADX INFO: renamed from: t4 */
    public final C37702w0 m47242t4() {
        return (C37702w0) this.f38984q0.getValue(this, f38983w0[0]);
    }

    /* JADX INFO: renamed from: w4 */
    public final void m47243w4(List<String> list) {
        IndexBar indexBar;
        RecyclerView recyclerView;
        FastTradeViewModel fastTradeViewModel = this.f38987t0;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeVM");
            fastTradeViewModel = null;
        }
        List<ItemFiatCurrency> value = fastTradeViewModel.m47315p0().getValue();
        boolean z11 = false;
        if (value != null && !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((ItemFiatCurrency) it.next()).getF38450c() == 0) {
                    z11 = true;
                    break;
                }
            }
        }
        C37702w0 c37702w0M47242t4 = m47242t4();
        RecyclerView.LayoutManager layoutManager = (c37702w0M47242t4 == null || (recyclerView = c37702w0M47242t4.f84809c) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        C37702w0 c37702w0M47242t5 = m47242t4();
        if (c37702w0M47242t5 == null || (indexBar = c37702w0M47242t5.f84811e) == null) {
            return;
        }
        indexBar.setOnIndexPressListener(new C20688b(list, z11, linearLayoutManager));
    }

    public FastTradeFiatSelectDialog() {
        setPageId("B7FastTradeFiatList");
    }

    /* JADX INFO: renamed from: A4 */
    public static final boolean m47222A4(List list) {
        Intrinsics.checkNotNull(list);
        return !list.isEmpty();
    }

    /* JADX INFO: renamed from: u4 */
    private final void m47237u4() {
        C37702w0 c37702w0M47242t4 = m47242t4();
        if (c37702w0M47242t4 == null) {
            return;
        }
        FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter = new FastTradeFiatCurrencySelectAdapter();
        this.f38988u0 = fastTradeFiatCurrencySelectAdapter;
        Context context = this.f38985r0;
        FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        fastTradeFiatCurrencySelectAdapter.setEmptyViewLayout(context, R$layout.view_empty);
        FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter3 = this.f38988u0;
        if (fastTradeFiatCurrencySelectAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeFiatCurrencySelectAdapter");
            fastTradeFiatCurrencySelectAdapter3 = null;
        }
        fastTradeFiatCurrencySelectAdapter3.setEmptyViewEnable(false);
        FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter4 = this.f38988u0;
        if (fastTradeFiatCurrencySelectAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeFiatCurrencySelectAdapter");
            fastTradeFiatCurrencySelectAdapter4 = null;
        }
        fastTradeFiatCurrencySelectAdapter4.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.payment.fasttradev2.y
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                FastTradeFiatSelectDialog.m47238v4(this.f39474a, baseQuickAdapter, view, i11);
            }
        });
        ClearEditText searchView = c37702w0M47242t4.f84810d;
        Intrinsics.checkNotNullExpressionValue(searchView, "searchView");
        searchView.addTextChangedListener(new C20687a());
        RecyclerView recyclerView = c37702w0M47242t4.f84809c;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        FastTradeFiatCurrencySelectAdapter fastTradeFiatCurrencySelectAdapter5 = this.f38988u0;
        if (fastTradeFiatCurrencySelectAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastTradeFiatCurrencySelectAdapter");
        } else {
            fastTradeFiatCurrencySelectAdapter2 = fastTradeFiatCurrencySelectAdapter5;
        }
        recyclerView.setAdapter(fastTradeFiatCurrencySelectAdapter2);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String strM56285z = RouteExKt.m56285z(arguments, "side", "BUY");
            Intrinsics.checkNotNullExpressionValue(strM56285z, "compatString(...)");
            this.f38986s0 = strM56285z;
        }
    }
}
