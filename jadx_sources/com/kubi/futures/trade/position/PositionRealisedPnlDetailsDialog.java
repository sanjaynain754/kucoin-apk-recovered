package com.kubi.futures.trade.position;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FixAutoSizeTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36848u0;
import fm.C37567b;
import fm.C37569d;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: PositionRealisedPnlDetailsDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J.\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010(\u001a\u00020 H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006*"}, m90084d2 = {"Lcom/kubi/futures/trade/position/PositionRealisedPnlDetailsDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogPositionRealisedPnlDetailsBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogPositionRealisedPnlDetailsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getPosition", "()Lcom/kubi/kumex/data/trade/model/PositionEntity;", "position$delegate", "Lkotlin/Lazy;", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onResume", "initPnlDetailsInfo", "isBottomSheet", "", "formatPnlDetails", "", "targetNum", "Ljava/math/BigDecimal;", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "settleCurrency", "withCurrency", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPositionRealisedPnlDetailsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionRealisedPnlDetailsDialog.kt\ncom/kubi/futures/trade/position/PositionRealisedPnlDetailsDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,152:1\n143#2,20:153\n*S KotlinDebug\n*F\n+ 1 PositionRealisedPnlDetailsDialog.kt\ncom/kubi/futures/trade/position/PositionRealisedPnlDetailsDialog\n*L\n53#1:153,20\n*E\n"})
public final class PositionRealisedPnlDetailsDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24100q0 = C45681e.m100799e(this, new Function1<PositionRealisedPnlDetailsDialog, C36848u0>() { // from class: com.kubi.futures.trade.position.PositionRealisedPnlDetailsDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36848u0 invoke(@NotNull PositionRealisedPnlDetailsDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36848u0.m82561a(fragment.requireView());
        }
    }, new Function1<C36848u0, Unit>() { // from class: com.kubi.futures.trade.position.PositionRealisedPnlDetailsDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36848u0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36848u0 c36848u0) {
            invoke(c36848u0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24101r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.d3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PositionRealisedPnlDetailsDialog.m27638r4(this.f24146b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f24099t0 = {Reflection.property1(new PropertyReference1Impl(PositionRealisedPnlDetailsDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogPositionRealisedPnlDetailsBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f24098s0 = new Companion(null);

    /* JADX INFO: compiled from: PositionRealisedPnlDetailsDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/position/PositionRealisedPnlDetailsDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "positionEntity", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull PositionEntity positionEntity) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(positionEntity, "positionEntity");
            PositionRealisedPnlDetailsDialog positionRealisedPnlDetailsDialog = new PositionRealisedPnlDetailsDialog();
            positionRealisedPnlDetailsDialog.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("data", positionEntity)));
            positionRealisedPnlDetailsDialog.show(manager, "PositionPnlDetailsDialog");
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ String m27635m4(PositionRealisedPnlDetailsDialog positionRealisedPnlDetailsDialog, BigDecimal bigDecimal, ContractEntity contractEntity, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        return positionRealisedPnlDetailsDialog.m27639l4(bigDecimal, contractEntity, str, z11);
    }

    /* JADX INFO: renamed from: o4 */
    private final PositionEntity m27636o4() {
        return (PositionEntity) this.f24101r0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 10;
    }

    /* JADX INFO: renamed from: n4 */
    public final C36848u0 m27640n4() {
        return (C36848u0) this.f24100q0.getValue(this, f24099t0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_position_realised_pnl_details, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        PositionEntity positionEntityM27636o4;
        BottomSheetBehavior<FrameLayout> behavior;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36848u0 c36848u0M27640n4 = m27640n4();
        if (c36848u0M27640n4 == null || (positionEntityM27636o4 = m27636o4()) == null) {
            return;
        }
        m54235d4(0.85f);
        Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null && (behavior = bottomSheetDialog.getBehavior()) != null) {
            behavior.setPeekHeight((int) (C5267e0.m6182d() * 0.85f));
        }
        c36848u0M27640n4.f81108k.setText(C37569d.m84671l(positionEntityM27636o4, true));
        Context context = getContext();
        if (context != null) {
            c36848u0M27640n4.f81108k.setTextColor(C22890g.m54282g(context, C27039d.m66656p(positionEntityM27636o4.getRealisedPnl()), 0, 2, null));
        }
        KcPrimaryButton tvOk = c36848u0M27640n4.f81113p;
        Intrinsics.checkNotNullExpressionValue(tvOk, "tvOk");
        C27046k.m66711z(tvOk, 0L, new Function0() { // from class: com.kubi.futures.trade.position.e3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionRealisedPnlDetailsDialog.m27637q4(this.f24155b);
            }
        }, 1, null);
        m27641p4();
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m27637q4(PositionRealisedPnlDetailsDialog positionRealisedPnlDetailsDialog) {
        positionRealisedPnlDetailsDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final PositionEntity m27638r4(PositionRealisedPnlDetailsDialog positionRealisedPnlDetailsDialog) {
        Bundle arguments = positionRealisedPnlDetailsDialog.getArguments();
        if (arguments != null) {
            return (PositionEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: l4 */
    public final String m27639l4(BigDecimal bigDecimal, ContractEntity contractEntity, String str, boolean z11) {
        String strM66668h = C27041f.m66668h(C42828b.m93902c(C27041f.m66669i(C42180b.m92640e(bigDecimal, null, C37567b.m84613c(contractEntity), true, true, true, 0, null, 97, null), C37569d.m84684y())));
        if (z11) {
            return C42828b.m93906g(strM66668h, C27041f.m66668h(C27041f.m66677q(str)), true, false, 4, null);
        }
        return strM66668h;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LinearLayout root;
        super.onResume();
        C36848u0 c36848u0M27640n4 = m27640n4();
        if (c36848u0M27640n4 != null && (root = c36848u0M27640n4.getRoot()) != null) {
            root.requestLayout();
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m27641p4() {
        C36848u0 c36848u0M27640n4;
        Context context;
        PositionEntity positionEntityM27636o4 = m27636o4();
        if (positionEntityM27636o4 == null || (c36848u0M27640n4 = m27640n4()) == null || (context = getContext()) == null) {
            return;
        }
        if (positionEntityM27636o4.getFundingFee() == null) {
            ConstraintLayout pnlDetailsCl = c36848u0M27640n4.f81104g;
            Intrinsics.checkNotNullExpressionValue(pnlDetailsCl, "pnlDetailsCl");
            C27046k.m66700o(pnlDetailsCl);
            return;
        }
        c36848u0M27640n4.f81100c.setText(m27635m4(this, C41014a.m89922G(positionEntityM27636o4.getRealisedGrossPnl(), null, 1, null), C37569d.m84661b(positionEntityM27636o4), positionEntityM27636o4.getSettleCurrency(), false, 8, null));
        c36848u0M27640n4.f81100c.setTextColor(C22890g.m54282g(context, C27039d.m66656p(positionEntityM27636o4.getRealisedGrossPnl()), 0, 2, null));
        c36848u0M27640n4.f81102e.setText(m27635m4(this, C41014a.m89922G(positionEntityM27636o4.getFundingFee(), null, 1, null), C37569d.m84661b(positionEntityM27636o4), positionEntityM27636o4.getSettleCurrency(), false, 8, null));
        c36848u0M27640n4.f81102e.setTextColor(C22890g.m54282g(context, C27039d.m66656p(positionEntityM27636o4.getFundingFee()), 0, 2, null));
        c36848u0M27640n4.f81112o.setText(m27635m4(this, C41014a.m89922G(positionEntityM27636o4.getDealComm(), null, 1, null), C37569d.m84661b(positionEntityM27636o4), positionEntityM27636o4.getSettleCurrency(), false, 8, null));
        c36848u0M27640n4.f81112o.setTextColor(C22890g.m54282g(context, C27039d.m66656p(positionEntityM27636o4.getDealComm()), 0, 2, null));
        if (positionEntityM27636o4.getTax() != null && C41014a.m89922G(positionEntityM27636o4.getTax(), null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
            BaseTextView taxTv = c36848u0M27640n4.f81109l;
            Intrinsics.checkNotNullExpressionValue(taxTv, "taxTv");
            C27046k.m66685H(taxTv);
            FixAutoSizeTextView taxValueTv = c36848u0M27640n4.f81110m;
            Intrinsics.checkNotNullExpressionValue(taxValueTv, "taxValueTv");
            C27046k.m66685H(taxValueTv);
            BigDecimal bigDecimalM89922G = C41014a.m89922G(positionEntityM27636o4.getTax(), null, 1, null);
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            BigDecimal bigDecimalNegate = ONE.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
            BigDecimal bigDecimalMultiply = bigDecimalM89922G.multiply(bigDecimalNegate);
            FixAutoSizeTextView fixAutoSizeTextView = c36848u0M27640n4.f81110m;
            Intrinsics.checkNotNull(bigDecimalMultiply);
            fixAutoSizeTextView.setText(m27635m4(this, bigDecimalMultiply, C37569d.m84661b(positionEntityM27636o4), positionEntityM27636o4.getSettleCurrency(), false, 8, null));
            c36848u0M27640n4.f81110m.setTextColor(C22890g.m54282g(context, C27039d.m66656p(bigDecimalMultiply), 0, 2, null));
        } else {
            BaseTextView taxTv2 = c36848u0M27640n4.f81109l;
            Intrinsics.checkNotNullExpressionValue(taxTv2, "taxTv");
            C27046k.m66700o(taxTv2);
            FixAutoSizeTextView taxValueTv2 = c36848u0M27640n4.f81110m;
            Intrinsics.checkNotNullExpressionValue(taxValueTv2, "taxValueTv");
            C27046k.m66700o(taxValueTv2);
        }
        if (!C37569d.m84649A(positionEntityM27636o4) && positionEntityM27636o4.getWithdrawPnl() != null) {
            BaseTextView withdrawTv = c36848u0M27640n4.f81114q;
            Intrinsics.checkNotNullExpressionValue(withdrawTv, "withdrawTv");
            C27046k.m66685H(withdrawTv);
            FixAutoSizeTextView withdrawValueTv = c36848u0M27640n4.f81115r;
            Intrinsics.checkNotNullExpressionValue(withdrawValueTv, "withdrawValueTv");
            C27046k.m66685H(withdrawValueTv);
            c36848u0M27640n4.f81115r.setText(m27635m4(this, C41014a.m89922G(positionEntityM27636o4.getWithdrawPnl(), null, 1, null), C37569d.m84661b(positionEntityM27636o4), positionEntityM27636o4.getSettleCurrency(), false, 8, null));
            c36848u0M27640n4.f81115r.setTextColor(C22890g.m54282g(context, C27039d.m66656p(positionEntityM27636o4.getWithdrawPnl()), 0, 2, null));
            return;
        }
        BaseTextView withdrawTv2 = c36848u0M27640n4.f81114q;
        Intrinsics.checkNotNullExpressionValue(withdrawTv2, "withdrawTv");
        C27046k.m66700o(withdrawTv2);
        FixAutoSizeTextView withdrawValueTv2 = c36848u0M27640n4.f81115r;
        Intrinsics.checkNotNullExpressionValue(withdrawValueTv2, "withdrawValueTv");
        C27046k.m66700o(withdrawValueTv2);
    }
}
