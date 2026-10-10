package com.kubi.futures.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.app.FrameMetricsAggregator;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.BrokerConfig;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.guide.OpenFuturesGuide;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36865x;
import f00.C37304a;
import fm.C37567b;
import g00.InterfaceC37754f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38057a;
import p569qq.C43852m;
import p801yl.C46527h0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: OpenFuturesTradingSuccessDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\"\u001a\u00020 H\u0002J\u0012\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020\u000bH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m90084d2 = {"Lcom/kubi/futures/dialog/OpenFuturesTradingSuccessDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogFutureOpenFuturesSuccessBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogFutureOpenFuturesSuccessBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "superPageId", "", "getSuperPageId", "()Ljava/lang/String;", "superPageId$delegate", "Lkotlin/Lazy;", "fromContract", "", "getFromContract", "()Z", "fromContract$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "goTradePage", "goTransferPage", "locationId", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOpenFuturesTradingSuccessDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenFuturesTradingSuccessDialog.kt\ncom/kubi/futures/dialog/OpenFuturesTradingSuccessDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,99:1\n143#2,20:100\n256#3,2:120\n*S KotlinDebug\n*F\n+ 1 OpenFuturesTradingSuccessDialog.kt\ncom/kubi/futures/dialog/OpenFuturesTradingSuccessDialog\n*L\n34#1:100,20\n68#1:120,2\n*E\n"})
public final class OpenFuturesTradingSuccessDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f22793t0 = {Reflection.property1(new PropertyReference1Impl(OpenFuturesTradingSuccessDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogFutureOpenFuturesSuccessBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f22794q0 = C45681e.m100799e(this, new Function1<OpenFuturesTradingSuccessDialog, C36865x>() { // from class: com.kubi.futures.dialog.OpenFuturesTradingSuccessDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36865x invoke(@NotNull OpenFuturesTradingSuccessDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36865x.m82596a(fragment.requireView());
        }
    }, new Function1<C36865x, Unit>() { // from class: com.kubi.futures.dialog.OpenFuturesTradingSuccessDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36865x it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36865x c36865x) {
            invoke(c36865x);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f22795r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.a1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OpenFuturesTradingSuccessDialog.m25192w4(this.f22821b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f22796s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.b1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(OpenFuturesTradingSuccessDialog.m25188n4(this.f22824b));
        }
    });

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ void m25189t4(OpenFuturesTradingSuccessDialog openFuturesTradingSuccessDialog, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "1";
        }
        openFuturesTradingSuccessDialog.m25197s4(str);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    /* JADX INFO: renamed from: o4 */
    public final C36865x m25193o4() {
        return (C36865x) this.f22794q0.getValue(this, f22793t0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_future_open_futures_success, container);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m54191p3();
        C43852m.m96595g(m25195q4(), "ContractOpenTrade", "1", null, 8, null);
        C36865x c36865xM25193o4 = m25193o4();
        if (c36865xM25193o4 != null && (imageView = c36865xM25193o4.f81298c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.futures.dialog.y0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OpenFuturesTradingSuccessDialog.m25190u4(this.f22995b);
                }
            }, 1, null);
        }
        C36865x c36865xM25193o5 = m25193o4();
        if (c36865xM25193o5 != null && (baseTextView2 = c36865xM25193o5.f81301f) != null) {
            baseTextView2.setText(getString(R$string.kumex_trial_dialog_open_contract_trade_desc, String.valueOf(C46527h0.f104291a.m102675K())));
        }
        C36865x c36865xM25193o6 = m25193o4();
        if (c36865xM25193o6 != null && (baseTextView = c36865xM25193o6.f81301f) != null) {
            baseTextView.setVisibility(C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.futures.maxLeverage", true) ? 0 : 8);
        }
        C36865x c36865xM25193o7 = m25193o4();
        if (c36865xM25193o7 != null && (kcPrimaryButton2 = c36865xM25193o7.f81297b) != null) {
            kcPrimaryButton2.setText(getString(m25194p4() ? R$string.welfare_transfer_in_assets : R$string.start_trade));
        }
        C36865x c36865xM25193o8 = m25193o4();
        if (c36865xM25193o8 == null || (kcPrimaryButton = c36865xM25193o8.f81297b) == null) {
            return;
        }
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.futures.dialog.z0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OpenFuturesTradingSuccessDialog.m25191v4(this.f22999b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: p4 */
    public final boolean m25194p4() {
        return ((Boolean) this.f22796s0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: q4 */
    public final String m25195q4() {
        return (String) this.f22795r0.getValue();
    }

    /* JADX INFO: renamed from: n4 */
    public static final boolean m25188n4(OpenFuturesTradingSuccessDialog openFuturesTradingSuccessDialog) {
        Boolean boolValueOf;
        Bundle arguments = openFuturesTradingSuccessDialog.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(RouteExKt.m56250h(arguments, "fromFuturesPage"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m25190u4(OpenFuturesTradingSuccessDialog openFuturesTradingSuccessDialog) {
        if (!openFuturesTradingSuccessDialog.m25194p4()) {
            C43852m.m96591c(openFuturesTradingSuccessDialog.m25195q4(), "ContractOpenTrade", "5", null, 8, null);
        }
        openFuturesTradingSuccessDialog.dismiss();
        OpenFuturesGuide.f29111e.sendNextStep();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m25191v4(OpenFuturesTradingSuccessDialog openFuturesTradingSuccessDialog) {
        if (openFuturesTradingSuccessDialog.m25194p4()) {
            m25189t4(openFuturesTradingSuccessDialog, null, 1, null);
        } else {
            openFuturesTradingSuccessDialog.m25196r4();
            OpenFuturesGuide.f29111e.sendNextStep();
        }
        openFuturesTradingSuccessDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final String m25192w4(OpenFuturesTradingSuccessDialog openFuturesTradingSuccessDialog) {
        String string;
        Bundle arguments = openFuturesTradingSuccessDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("superPageId", C17060n0.m36552b());
        } else {
            string = null;
        }
        return C27041f.m66669i(string, C17060n0.m36552b());
    }

    /* JADX INFO: renamed from: r4 */
    public final void m25196r4() {
        C43852m.m96591c(C17060n0.m36552b(), "ContractOpenTrade", "4", null, 8, null);
        InterfaceC37754f.a.m85131c(C37304a.f82764a, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX INFO: renamed from: s4 */
    public final void m25197s4(String str) {
        C43852m.m96591c(m25195q4(), "ContractOpenTransfer", null, null, 12, null);
        BrokerConfig.f19211a.m20201d().mo20245y0(C37567b.m84620j(C46527h0.f104291a.m102673I()), "ContractOpenTrade", str);
    }
}
