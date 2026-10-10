package com.kubi.futures.trade.position;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36842t0;
import java.math.BigDecimal;
import li.C42227b;
import li.C42229d;
import li.C42230e;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p343ii.C38645a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: PositionQtyDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/futures/trade/position/PositionQtyDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogPositionQtyBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogPositionQtyBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getPosition", "()Lcom/kubi/kumex/data/trade/model/PositionEntity;", "position$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "isBottomSheet", "", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPositionQtyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionQtyDialog.kt\ncom/kubi/futures/trade/position/PositionQtyDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,89:1\n143#2,20:90\n*S KotlinDebug\n*F\n+ 1 PositionQtyDialog.kt\ncom/kubi/futures/trade/position/PositionQtyDialog\n*L\n41#1:90,20\n*E\n"})
public final class PositionQtyDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24096q0 = C45681e.m100799e(this, new Function1<PositionQtyDialog, C36842t0>() { // from class: com.kubi.futures.trade.position.PositionQtyDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36842t0 invoke(@NotNull PositionQtyDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36842t0.m82549a(fragment.requireView());
        }
    }, new Function1<C36842t0, Unit>() { // from class: com.kubi.futures.trade.position.PositionQtyDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36842t0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36842t0 c36842t0) {
            invoke(c36842t0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24097r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.c3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PositionQtyDialog.m27631m4(this.f24136b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f24095t0 = {Reflection.property1(new PropertyReference1Impl(PositionQtyDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogPositionQtyBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f24094s0 = new Companion(null);

    /* JADX INFO: compiled from: PositionQtyDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/position/PositionQtyDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "positionEntity", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull PositionEntity positionEntity) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(positionEntity, "positionEntity");
            PositionQtyDialog positionQtyDialog = new PositionQtyDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", positionEntity);
            positionQtyDialog.setArguments(bundle);
            positionQtyDialog.show(manager, "PositionQtyDialog");
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: l4 */
    private final PositionEntity m27630l4() {
        return (PositionEntity) this.f24097r0.getValue();
    }

    /* JADX INFO: renamed from: k4 */
    public final C36842t0 m27632k4() {
        return (C36842t0) this.f24096q0.getValue(this, f24095t0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_position_qty, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        PositionEntity positionEntityM27630l4 = m27630l4();
        C36842t0 c36842t0M27632k4 = m27632k4();
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(positionEntityM27630l4 != null ? positionEntityM27630l4.getSymbol() : null), false, 2, null);
        if (positionEntityM27630l4 == null || c36842t0M27632k4 == null || contractEntityM99529O == null) {
            dismissAllowingStateLoss();
            return;
        }
        BigDecimal latestPrice = positionEntityM27630l4.getLatestPrice();
        if (latestPrice == null) {
            latestPrice = positionEntityM27630l4.getMarkPrice();
        }
        C38645a c38645a = new C38645a(contractEntityM99529O);
        c36842t0M27632k4.f81060e.setText(new C42229d().mo90008b(c38645a, latestPrice, C27039d.m66656p(positionEntityM27630l4.getCurrentQty()), null));
        BaseTextView baseTextView = c36842t0M27632k4.f81058c;
        C42227b c42227b = new C42227b();
        baseTextView.setText(C42828b.m93906g(c42227b.mo90008b(c38645a, latestPrice, C27039d.m66656p(positionEntityM27630l4.getCurrentQty()), null).toString(), c42227b.mo90014h(c38645a), true, false, 4, null));
        BaseTextView baseTextView2 = c36842t0M27632k4.f81062g;
        C42230e c42230e = new C42230e();
        baseTextView2.setText(C42828b.m93906g(c42230e.mo90008b(c38645a, latestPrice, C27039d.m66656p(positionEntityM27630l4.getCurrentQty()), null).toString(), c42230e.mo90014h(c38645a), true, false, 4, null));
    }

    /* JADX INFO: renamed from: m4 */
    public static final PositionEntity m27631m4(PositionQtyDialog positionQtyDialog) {
        Bundle arguments = positionQtyDialog.getArguments();
        if (arguments != null) {
            return (PositionEntity) arguments.getParcelable("data");
        }
        return null;
    }
}
