package com.kubi.futures.trade.welfare.airdrop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36757f;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
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
import p852kotlin.text.Typography;
import w00.C45681e;

/* JADX INFO: compiled from: AirdropPositionDetailsDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001e\u0010\u0017R\u001d\u0010 \u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b!\u0010\u0017R\u001d\u0010#\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b$\u0010\u0017¨\u0006)"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionDetailsDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogAirdropPositionDetailsBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogAirdropPositionDetailsBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "expireTimeStr", "", "getExpireTimeStr", "()Ljava/lang/String;", "expireTimeStr$delegate", "Lkotlin/Lazy;", "minTotalAmountStr", "getMinTotalAmountStr", "minTotalAmountStr$delegate", "minCloseRealisedPnlStr", "getMinCloseRealisedPnlStr", "minCloseRealisedPnlStr$delegate", "maxValueStr", "getMaxValueStr", "maxValueStr$delegate", "trialCode", "getTrialCode", "trialCode$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAirdropPositionDetailsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirdropPositionDetailsDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirdropPositionDetailsDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,93:1\n143#2,20:94\n*S KotlinDebug\n*F\n+ 1 AirdropPositionDetailsDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirdropPositionDetailsDialog\n*L\n33#1:94,20\n*E\n"})
public final class AirdropPositionDetailsDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f24562w0 = {Reflection.property1(new PropertyReference1Impl(AirdropPositionDetailsDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogAirdropPositionDetailsBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24563q0 = C45681e.m100799e(this, new Function1<AirdropPositionDetailsDialog, C36757f>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirdropPositionDetailsDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36757f invoke(@NotNull AirdropPositionDetailsDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36757f.m82365a(fragment.requireView());
        }
    }, new Function1<C36757f, Unit>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirdropPositionDetailsDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36757f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36757f c36757f) {
            invoke(c36757f);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24564r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirdropPositionDetailsDialog.m28365r4(this.f24641b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f24565s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirdropPositionDetailsDialog.m28352A4(this.f24642b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f24566t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirdropPositionDetailsDialog.m28368z4(this.f24643b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f24567u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirdropPositionDetailsDialog.m28367y4(this.f24644b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f24568v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirdropPositionDetailsDialog.m28356E4(this.f24645b);
        }
    });

    /* JADX INFO: renamed from: C4 */
    public static final Unit m28354C4(AirdropPositionDetailsDialog airdropPositionDetailsDialog) {
        AirdropRuleDialog.Companion companion = AirdropRuleDialog.f24579u0;
        FragmentManager childFragmentManager = airdropPositionDetailsDialog.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, C27041f.m66668h(airdropPositionDetailsDialog.m28366w4()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m28355D4(AirdropPositionDetailsDialog airdropPositionDetailsDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        airdropPositionDetailsDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    private final String m28366w4() {
        return (String) this.f24568v0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return -11;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_airdrop_position_details, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36757f c36757fM28373x4 = m28373x4();
        if (c36757fM28373x4 == null) {
            return;
        }
        C43852m.m96595g("B6futures", "AirDropPositionNotice", null, null, 12, null);
        AppCompatImageView close = c36757fM28373x4.f79975c;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AirdropPositionDetailsDialog.m28353B4(this.f24638b);
            }
        }, 1, null);
        c36757fM28373x4.f79981i.setText(m28369s4());
        c36757fM28373x4.f79974b.setText(getString(R$string.withdraw_confirm_detail) + Typography.greater);
        AppCompatTextView appCompatTextView = c36757fM28373x4.f79974b;
        appCompatTextView.setPaintFlags(appCompatTextView.getPaintFlags() | 8);
        AppCompatTextView check = c36757fM28373x4.f79974b;
        Intrinsics.checkNotNullExpressionValue(check, "check");
        C27046k.m66711z(check, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AirdropPositionDetailsDialog.m28354C4(this.f24639b);
            }
        }, 1, null);
        c36757fM28373x4.f79980h.setText(getString(R$string.kumex_airdrop_position_detail_dialog_total_pnl) + " ≥ " + m28372v4());
        c36757fM28373x4.f79984l.setText(getString(R$string.kumex_airdrop_position_detail_dialog_total_trade_amount) + " ≥ " + m28371u4());
        c36757fM28373x4.f79978f.setText(C42828b.m93915p(C42828b.m93902c(m28370t4())));
        KcPrimaryButton know = c36757fM28373x4.f79977e;
        Intrinsics.checkNotNullExpressionValue(know, "know");
        ViewExtKt.m66575f(know, new Function1() { // from class: com.kubi.futures.trade.welfare.airdrop.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AirdropPositionDetailsDialog.m28355D4(this.f24640b, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public final String m28369s4() {
        return (String) this.f24564r0.getValue();
    }

    /* JADX INFO: renamed from: t4 */
    public final String m28370t4() {
        return (String) this.f24567u0.getValue();
    }

    /* JADX INFO: renamed from: u4 */
    public final String m28371u4() {
        return (String) this.f24566t0.getValue();
    }

    /* JADX INFO: renamed from: v4 */
    public final String m28372v4() {
        return (String) this.f24565s0.getValue();
    }

    /* JADX INFO: renamed from: x4 */
    public final C36757f m28373x4() {
        return (C36757f) this.f24563q0.getValue(this, f24562w0[0]);
    }

    /* JADX INFO: renamed from: A4 */
    public static final String m28352A4(AirdropPositionDetailsDialog airdropPositionDetailsDialog) {
        Bundle arguments = airdropPositionDetailsDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("data_1");
        }
        return null;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m28353B4(AirdropPositionDetailsDialog airdropPositionDetailsDialog) {
        airdropPositionDetailsDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final String m28356E4(AirdropPositionDetailsDialog airdropPositionDetailsDialog) {
        Bundle arguments = airdropPositionDetailsDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("data_4");
        }
        return null;
    }

    /* JADX INFO: renamed from: r4 */
    public static final String m28365r4(AirdropPositionDetailsDialog airdropPositionDetailsDialog) {
        Bundle arguments = airdropPositionDetailsDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: y4 */
    public static final String m28367y4(AirdropPositionDetailsDialog airdropPositionDetailsDialog) {
        Bundle arguments = airdropPositionDetailsDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("data_3");
        }
        return null;
    }

    /* JADX INFO: renamed from: z4 */
    public static final String m28368z4(AirdropPositionDetailsDialog airdropPositionDetailsDialog) {
        Bundle arguments = airdropPositionDetailsDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("data_2");
        }
        return null;
    }
}
