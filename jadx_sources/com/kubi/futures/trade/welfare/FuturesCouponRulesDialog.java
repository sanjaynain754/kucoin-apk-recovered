package com.kubi.futures.trade.welfare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5303w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareCouponAttributes;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36871y;
import java.math.BigDecimal;
import java.math.RoundingMode;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p429lf.C42180b;
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
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: FuturesCouponRulesDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogFuturesCouponRulesBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogFuturesCouponRulesBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", FirebaseAnalytics.Param.COUPON, "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;", "getCoupon", "()Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;", "coupon$delegate", "Lkotlin/Lazy;", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "isBottomSheet", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesCouponRulesDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesCouponRulesDialog.kt\ncom/kubi/futures/trade/welfare/FuturesCouponRulesDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,81:1\n157#2,6:82\n20#3:88\n*S KotlinDebug\n*F\n+ 1 FuturesCouponRulesDialog.kt\ncom/kubi/futures/trade/welfare/FuturesCouponRulesDialog\n*L\n36#1:82,6\n61#1:88\n*E\n"})
public final class FuturesCouponRulesDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ KProperty<Object>[] f24469s0 = {Reflection.property1(new PropertyReference1Impl(FuturesCouponRulesDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogFuturesCouponRulesBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24470q0 = C45681e.m100799e(this, new Function1<FuturesCouponRulesDialog, C36871y>() { // from class: com.kubi.futures.trade.welfare.FuturesCouponRulesDialog$special$$inlined$viewBindingFragmentWithCallbacks$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36871y invoke(@NotNull FuturesCouponRulesDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36871y.m82610a(fragment.requireView());
        }
    }, new Function1<C36871y, Unit>() { // from class: com.kubi.futures.trade.welfare.FuturesCouponRulesDialog$special$$inlined$viewBindingFragmentWithCallbacks$default$1
        public final void invoke(@NotNull C36871y it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36871y c36871y) {
            invoke(c36871y);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24471r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesCouponRulesDialog.m28046l4(this.f24535b);
        }
    });

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 10;
    }

    /* JADX INFO: renamed from: m4 */
    public final FuturesWelfareCouponAttributes m28048m4() {
        return (FuturesWelfareCouponAttributes) this.f24471r0.getValue();
    }

    /* JADX INFO: renamed from: n4 */
    public final C36871y m28049n4() {
        return (C36871y) this.f24470q0.getValue(this, f24469s0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m54235d4(0.7f);
        return inflater.inflate(R$layout.bkumex_dialog_futures_coupon_rules, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        PropertyEntity properties;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FuturesWelfareCouponAttributes futuresWelfareCouponAttributesM28048m4 = m28048m4();
        C36871y c36871yM28049n4 = m28049n4();
        if (futuresWelfareCouponAttributesM28048m4 == null || c36871yM28049n4 == null) {
            dismissAllowingStateLoss();
            return;
        }
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(futuresWelfareCouponAttributesM28048m4.getCurrency()), false, 2, null);
        int iM66651k = C27039d.m66651k((coinEntityM99528E == null || (properties = coinEntityM99528E.getProperties()) == null) ? null : properties.getShortDisplayPrecision(), 4);
        c36871yM28049n4.f81345d.setGravity(!C5303w0.m6511a() ? 5 : 3);
        BaseTextView baseTextView = c36871yM28049n4.f81348g;
        BigDecimal bigDecimalDivide = C27039d.m66656p(futuresWelfareCouponAttributesM28048m4.getDeductionRatio()).divide(new BigDecimal(100), RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        baseTextView.setText(C42180b.m92642g(bigDecimalDivide, null, null, 0, false, false, false, 31, null));
        BaseTextView baseTextView2 = c36871yM28049n4.f81345d;
        BigDecimal faceValue = futuresWelfareCouponAttributesM28048m4.getFaceValue();
        baseTextView2.setText(C42828b.m93906g(faceValue != null ? C42180b.m92640e(faceValue, null, iM66651k, true, false, true, 0, null, 105, null) : null, C27041f.m66668h(C27041f.m66677q(futuresWelfareCouponAttributesM28048m4.getCurrency())), true, false, 4, null));
        BaseTextView ruleUrl = c36871yM28049n4.f81355n;
        Intrinsics.checkNotNullExpressionValue(ruleUrl, "ruleUrl");
        ViewExtKt.m66577h(ruleUrl);
        BaseTextView baseTextView3 = c36871yM28049n4.f81351j;
        Long validPeriod = futuresWelfareCouponAttributesM28048m4.getValidPeriod();
        baseTextView3.setText(validPeriod != null ? C42179a.m92633f(validPeriod.longValue(), null, false, true, null, 11, null) : null);
        KcPrimaryButton tvConfirm = c36871yM28049n4.f81356o;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesCouponRulesDialog.m28047o4(this.f24658b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: l4 */
    public static final FuturesWelfareCouponAttributes m28046l4(FuturesCouponRulesDialog futuresCouponRulesDialog) {
        Bundle arguments = futuresCouponRulesDialog.getArguments();
        if (arguments != null) {
            return (FuturesWelfareCouponAttributes) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m28047o4(FuturesCouponRulesDialog futuresCouponRulesDialog) {
        futuresCouponRulesDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
