package com.kubi.futures.trade.position;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.kubi.futures.trade.config.positions.PnlCalculatePriceType;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36836s0;
import fm.C37569d;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p371ji.C40410a;
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

/* JADX INFO: compiled from: PositionUnRealisedPnlDetailsDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006%"}, m90084d2 = {"Lcom/kubi/futures/trade/position/PositionUnRealisedPnlDetailsDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogPositionPnlDetailsBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogPositionPnlDetailsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getPosition", "()Lcom/kubi/kumex/data/trade/model/PositionEntity;", "position$delegate", "Lkotlin/Lazy;", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onResume", "updateUnrealised", "updateUnrealisedPnl", "curCheckedPriceType", "Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;", "isBottomSheet", "", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPositionUnRealisedPnlDetailsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionUnRealisedPnlDetailsDialog.kt\ncom/kubi/futures/trade/position/PositionUnRealisedPnlDetailsDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,124:1\n143#2,20:125\n*S KotlinDebug\n*F\n+ 1 PositionUnRealisedPnlDetailsDialog.kt\ncom/kubi/futures/trade/position/PositionUnRealisedPnlDetailsDialog\n*L\n40#1:125,20\n*E\n"})
public final class PositionUnRealisedPnlDetailsDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24113q0 = C45681e.m100799e(this, new Function1<PositionUnRealisedPnlDetailsDialog, C36836s0>() { // from class: com.kubi.futures.trade.position.PositionUnRealisedPnlDetailsDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36836s0 invoke(@NotNull PositionUnRealisedPnlDetailsDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36836s0.m82536a(fragment.requireView());
        }
    }, new Function1<C36836s0, Unit>() { // from class: com.kubi.futures.trade.position.PositionUnRealisedPnlDetailsDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36836s0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36836s0 c36836s0) {
            invoke(c36836s0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24114r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.u3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PositionUnRealisedPnlDetailsDialog.m27680r4(this.f24255b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f24112t0 = {Reflection.property1(new PropertyReference1Impl(PositionUnRealisedPnlDetailsDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogPositionPnlDetailsBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f24111s0 = new Companion(null);

    /* JADX INFO: compiled from: PositionUnRealisedPnlDetailsDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/position/PositionUnRealisedPnlDetailsDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "positionEntity", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull PositionEntity positionEntity) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(positionEntity, "positionEntity");
            PositionUnRealisedPnlDetailsDialog positionUnRealisedPnlDetailsDialog = new PositionUnRealisedPnlDetailsDialog();
            positionUnRealisedPnlDetailsDialog.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("data", positionEntity)));
            positionUnRealisedPnlDetailsDialog.show(manager, "PositionPnlDetailsDialog");
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: o4 */
    private final PositionEntity m27677o4() {
        return (PositionEntity) this.f24114r0.getValue();
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m27679q4(C36836s0 c36836s0, PositionUnRealisedPnlDetailsDialog positionUnRealisedPnlDetailsDialog) {
        C40410a.f89722a.m89057f(c36836s0.f81024c.isChecked() ? PnlCalculatePriceType.MarkPrice : PnlCalculatePriceType.LatestPrice);
        positionUnRealisedPnlDetailsDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 10;
    }

    /* JADX INFO: renamed from: n4 */
    public final C36836s0 m27682n4() {
        return (C36836s0) this.f24113q0.getValue(this, f24112t0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_position_pnl_details, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BottomSheetBehavior<FrameLayout> behavior;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36836s0 c36836s0M27682n4 = m27682n4();
        if (c36836s0M27682n4 == null) {
            return;
        }
        m54235d4(0.85f);
        Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null && (behavior = bottomSheetDialog.getBehavior()) != null) {
            behavior.setPeekHeight((int) (C5267e0.m6182d() * 0.85f));
        }
        RadioButton radioButton = c36836s0M27682n4.f81024c;
        C40410a c40410a = C40410a.f89722a;
        radioButton.setChecked(c40410a.m89055d());
        c36836s0M27682n4.f81023b.setChecked(c40410a.m89054c());
        m27683s4();
        c36836s0M27682n4.f81026e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.futures.trade.position.v3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                PositionUnRealisedPnlDetailsDialog.m27678p4(this.f24263b, radioGroup, i11);
            }
        });
        KcPrimaryButton tvOk = c36836s0M27682n4.f81028g;
        Intrinsics.checkNotNullExpressionValue(tvOk, "tvOk");
        C27046k.m66711z(tvOk, 0L, new Function0() { // from class: com.kubi.futures.trade.position.w3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionUnRealisedPnlDetailsDialog.m27679q4(c36836s0M27682n4, this);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m27678p4(PositionUnRealisedPnlDetailsDialog positionUnRealisedPnlDetailsDialog, RadioGroup radioGroup, int i11) {
        positionUnRealisedPnlDetailsDialog.m27683s4();
    }

    /* JADX INFO: renamed from: r4 */
    public static final PositionEntity m27680r4(PositionUnRealisedPnlDetailsDialog positionUnRealisedPnlDetailsDialog) {
        Bundle arguments = positionUnRealisedPnlDetailsDialog.getArguments();
        if (arguments != null) {
            return (PositionEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: m4 */
    public final PnlCalculatePriceType m27681m4() {
        RadioButton radioButton;
        C36836s0 c36836s0M27682n4 = m27682n4();
        if (c36836s0M27682n4 != null && (radioButton = c36836s0M27682n4.f81023b) != null && radioButton.isChecked()) {
            return PnlCalculatePriceType.LatestPrice;
        }
        return PnlCalculatePriceType.MarkPrice;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LinearLayout root;
        super.onResume();
        C36836s0 c36836s0M27682n4 = m27682n4();
        if (c36836s0M27682n4 != null && (root = c36836s0M27682n4.getRoot()) != null) {
            root.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final void m27683s4() {
        C36836s0 c36836s0M27682n4 = m27682n4();
        if (c36836s0M27682n4 == null) {
            return;
        }
        if (m27681m4() == PnlCalculatePriceType.LatestPrice) {
            m27684t4();
            c36836s0M27682n4.f81029h.setText(getString(R$string.kumex_position_unpnl_lastprice_desc));
        } else {
            m27684t4();
            c36836s0M27682n4.f81029h.setText(getString(R$string.kumex_position_unpnl_markprice_desc));
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final void m27684t4() {
        PositionEntity positionEntityM27677o4;
        BigDecimal unrealisedPnl;
        C36836s0 c36836s0M27682n4 = m27682n4();
        if (c36836s0M27682n4 != null && (positionEntityM27677o4 = m27677o4()) != null) {
            if (!c36836s0M27682n4.f81023b.isChecked() || positionEntityM27677o4.getLatestUnrealisedPnl() == null) {
                unrealisedPnl = positionEntityM27677o4.getUnrealisedPnl();
            } else {
                unrealisedPnl = positionEntityM27677o4.getLatestUnrealisedPnl();
            }
            c36836s0M27682n4.f81031j.setText(C37569d.m84681v(positionEntityM27677o4, unrealisedPnl, true));
            Context context = getContext();
            if (context != null) {
                c36836s0M27682n4.f81031j.setTextColor(C22890g.m54282g(context, C27039d.m66656p(unrealisedPnl), 0, 2, null));
            }
        }
    }
}
