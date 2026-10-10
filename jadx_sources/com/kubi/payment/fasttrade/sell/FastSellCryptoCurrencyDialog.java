package com.kubi.payment.fasttrade.sell;

import android.app.Dialog;
import android.content.Context;
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
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
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
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.exception.OtcException;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37714z0;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Deprecated;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
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

/* JADX INFO: compiled from: FastSellCryptoCurrencyDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010 \u001a\u00020\u0013H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020#H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentDialogFastSellCryptoCurrencyBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentDialogFastSellCryptoCurrencyBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mContext", "Landroid/content/Context;", "cryptoCurrency", "", "fastSellVM", "Lcom/kubi/payment/fasttrade/sell/FastSellVM;", "sellCryptoCurrencyAdapter", "Lcom/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyAdapter;", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "observeData", "isBottomSheet", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastSellCryptoCurrencyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastSellCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,173:1\n143#2,20:174\n44#3,2:194\n58#4,23:196\n93#4,3:219\n*S KotlinDebug\n*F\n+ 1 FastSellCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyDialog\n*L\n41#1:174,20\n63#1:194,2\n141#1:196,23\n141#1:219,3\n*E\n"})
public final class FastSellCryptoCurrencyDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f38788q0 = C45681e.m100799e(this, new Function1<FastSellCryptoCurrencyDialog, C37714z0>() { // from class: com.kubi.payment.fasttrade.sell.FastSellCryptoCurrencyDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37714z0 invoke(@NotNull FastSellCryptoCurrencyDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37714z0.m85013a(fragment.requireView());
        }
    }, new Function1<C37714z0, Unit>() { // from class: com.kubi.payment.fasttrade.sell.FastSellCryptoCurrencyDialog$special$$inlined$viewBindingFragment$default$1
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
    public Context f38789r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public String f38790s0;

    /* JADX INFO: renamed from: t0 */
    public FastSellVM f38791t0;

    /* JADX INFO: renamed from: u0 */
    public FastSellCryptoCurrencyAdapter f38792u0;

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f38787w0 = {Reflection.property1(new PropertyReference1Impl(FastSellCryptoCurrencyDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentDialogFastSellCryptoCurrencyBinding;", 0))};

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f38786v0 = new Companion(null);

    /* JADX INFO: compiled from: FastSellCryptoCurrencyDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyDialog$Companion;", "", "<init>", "()V", "CRYPTO_CURRENCY", "", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "cryptoCurrency", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFastSellCryptoCurrencyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastSellCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager, @NotNull String cryptoCurrency) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            FastSellCryptoCurrencyDialog fastSellCryptoCurrencyDialog = new FastSellCryptoCurrencyDialog();
            Bundle bundle = new Bundle();
            bundle.putString("CRYPTO_CURRENCY", cryptoCurrency);
            fastSellCryptoCurrencyDialog.setArguments(bundle);
            fastSellCryptoCurrencyDialog.show(fragmentManager, "payment_fast_sell_select_crypto_currency");
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.FastSellCryptoCurrencyDialog$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 FastSellCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n142#2,5:98\n71#3:103\n77#4:104\n*E\n"})
    public static final class C20585a implements TextWatcher {
        public C20585a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            FastSellCryptoCurrencyAdapter fastSellCryptoCurrencyAdapter = FastSellCryptoCurrencyDialog.this.f38792u0;
            FastSellCryptoCurrencyAdapter fastSellCryptoCurrencyAdapter2 = null;
            if (fastSellCryptoCurrencyAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sellCryptoCurrencyAdapter");
                fastSellCryptoCurrencyAdapter = null;
            }
            if (!fastSellCryptoCurrencyAdapter.getIsEmptyViewEnable()) {
                FastSellCryptoCurrencyAdapter fastSellCryptoCurrencyAdapter3 = FastSellCryptoCurrencyDialog.this.f38792u0;
                if (fastSellCryptoCurrencyAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sellCryptoCurrencyAdapter");
                    fastSellCryptoCurrencyAdapter3 = null;
                }
                fastSellCryptoCurrencyAdapter3.setEmptyViewEnable(true);
            }
            FastSellCryptoCurrencyAdapter fastSellCryptoCurrencyAdapter4 = FastSellCryptoCurrencyDialog.this.f38792u0;
            if (fastSellCryptoCurrencyAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sellCryptoCurrencyAdapter");
            } else {
                fastSellCryptoCurrencyAdapter2 = fastSellCryptoCurrencyAdapter4;
            }
            fastSellCryptoCurrencyAdapter2.getFilter().filter(String.valueOf(s11));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.FastSellCryptoCurrencyDialog$b */
    /* JADX INFO: compiled from: FastSellCryptoCurrencyDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttrade/sell/FastSellCryptoCurrencyDialog$initViews$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20586b extends ClickableSpan {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BaseTextView f38795c;

        public C20586b(BaseTextView baseTextView) {
            this.f38795c = baseTextView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            C43852m.m96591c("B7FastSell", "button", "2", null, 8, null);
            C37304a c37304a = C37304a.f82764a;
            FastSellVM fastSellVM = FastSellCryptoCurrencyDialog.this.f38791t0;
            if (fastSellVM == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fastSellVM");
                fastSellVM = null;
            }
            InterfaceC37749a.a.m85117l(c37304a, C27041f.m66668h(fastSellVM.m46919V().getValue()), "TRADE", "MAIN", null, C43852m.m96602n("B7FastSell", "button", null, 4, null), null, null, 104, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(this.f38795c.getContext(), R$color.c_text40));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.FastSellCryptoCurrencyDialog$c */
    /* JADX INFO: compiled from: FastSellCryptoCurrencyDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20587c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38796b;

        public C20587c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38796b = function;
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
            return this.f38796b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38796b.invoke(obj);
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

    /* JADX INFO: renamed from: p4 */
    public static final void m46832p4(FastSellCryptoCurrencyDialog fastSellCryptoCurrencyDialog, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        FastSellCryptoCurrencyAdapter fastSellCryptoCurrencyAdapter = fastSellCryptoCurrencyDialog.f38792u0;
        if (fastSellCryptoCurrencyAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sellCryptoCurrencyAdapter");
            fastSellCryptoCurrencyAdapter = null;
        }
        FastSellCryptoCurrency item = fastSellCryptoCurrencyAdapter.getItem(i11);
        FastSellVM fastSellVM = fastSellCryptoCurrencyDialog.f38791t0;
        if (fastSellVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastSellVM");
            fastSellVM = null;
        }
        fastSellVM.m46932i0(C27041f.m66668h(item != null ? item.getTitle() : null));
        C43852m.m96590b("B7FastTrade", "cryptoSelector", "1", TuplesKt.m90091to("crypto", C27041f.m66668h(item != null ? item.getTitle() : null)), TuplesKt.m90091to("type", "sell"));
        fastSellCryptoCurrencyDialog.dismiss();
    }

    /* JADX INFO: renamed from: q4 */
    private final void m46833q4() {
        FastSellVM fastSellVM = this.f38791t0;
        if (fastSellVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastSellVM");
            fastSellVM = null;
        }
        fastSellVM.m46916S().observe(getViewLifecycleOwner(), new C20587c(new Function1() { // from class: com.kubi.payment.fasttrade.sell.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastSellCryptoCurrencyDialog.m46834r4(this.f38922b, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m46834r4(FastSellCryptoCurrencyDialog fastSellCryptoCurrencyDialog, List list) {
        FastSellCryptoCurrencyAdapter fastSellCryptoCurrencyAdapter = fastSellCryptoCurrencyDialog.f38792u0;
        if (fastSellCryptoCurrencyAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sellCryptoCurrencyAdapter");
            fastSellCryptoCurrencyAdapter = null;
        }
        fastSellCryptoCurrencyAdapter.m46826p(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public final C37714z0 m46835n4() {
        return (C37714z0) this.f38788q0.getValue(this, f38787w0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f38789r0 = context;
        C45071b c45071b = new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get());
        try {
            Fragment fragmentRequireParentFragment = requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            this.f38791t0 = (FastSellVM) new ViewModelProvider(fragmentRequireParentFragment, c45071b).get(FastSellVM.class);
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
        m46831o4();
        m46833q4();
    }

    /* JADX INFO: renamed from: o4 */
    private final void m46831o4() {
        C37714z0 c37714z0M46835n4 = m46835n4();
        if (c37714z0M46835n4 == null) {
            return;
        }
        BaseTextView baseTextView = c37714z0M46835n4.f84966g;
        baseTextView.setText(getString(R$string.payment_fast_sell_select_crypto_des));
        baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(baseTextView);
        highlightTextHelper.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new C20586b(baseTextView)));
        FastSellCryptoCurrencyAdapter fastSellCryptoCurrencyAdapter = new FastSellCryptoCurrencyAdapter();
        this.f38792u0 = fastSellCryptoCurrencyAdapter;
        Context context = this.f38789r0;
        FastSellCryptoCurrencyAdapter fastSellCryptoCurrencyAdapter2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        fastSellCryptoCurrencyAdapter.setEmptyViewLayout(context, R$layout.view_empty);
        FastSellCryptoCurrencyAdapter fastSellCryptoCurrencyAdapter3 = this.f38792u0;
        if (fastSellCryptoCurrencyAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sellCryptoCurrencyAdapter");
            fastSellCryptoCurrencyAdapter3 = null;
        }
        fastSellCryptoCurrencyAdapter3.setEmptyViewEnable(false);
        FastSellCryptoCurrencyAdapter fastSellCryptoCurrencyAdapter4 = this.f38792u0;
        if (fastSellCryptoCurrencyAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sellCryptoCurrencyAdapter");
            fastSellCryptoCurrencyAdapter4 = null;
        }
        fastSellCryptoCurrencyAdapter4.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.payment.fasttrade.sell.c
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                FastSellCryptoCurrencyDialog.m46832p4(this.f38823a, baseQuickAdapter, view, i11);
            }
        });
        ClearEditText searchView = c37714z0M46835n4.f84964e;
        Intrinsics.checkNotNullExpressionValue(searchView, "searchView");
        searchView.addTextChangedListener(new C20585a());
        RecyclerView recyclerView = c37714z0M46835n4.f84963d;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        FastSellCryptoCurrencyAdapter fastSellCryptoCurrencyAdapter5 = this.f38792u0;
        if (fastSellCryptoCurrencyAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sellCryptoCurrencyAdapter");
        } else {
            fastSellCryptoCurrencyAdapter2 = fastSellCryptoCurrencyAdapter5;
        }
        recyclerView.setAdapter(fastSellCryptoCurrencyAdapter2);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f38790s0 = RouteExKt.m56284y(arguments, "CRYPTO_CURRENCY");
        }
    }
}
