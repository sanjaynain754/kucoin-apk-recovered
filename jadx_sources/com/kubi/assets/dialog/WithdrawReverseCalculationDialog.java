package com.kubi.assets.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.WithdrawalAmountEntity;
import com.kubi.resources.dialog.BaseBottomDialog;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p637ta.C44769g0;
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
import w00.C45681e;

/* JADX INFO: compiled from: WithdrawReverseCalculationDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawReverseCalculationDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetDialogWithdrawReverseCalculationBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogWithdrawReverseCalculationBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCloseCallback", "Lkotlin/Function1;", "Lcom/kubi/assets/entity/WithdrawalAmountEntity;", "", "getOnCloseCallback", "()Lkotlin/jvm/functions/Function1;", "setOnCloseCallback", "(Lkotlin/jvm/functions/Function1;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "isBottomSheet", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawReverseCalculationDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawReverseCalculationDialog.kt\ncom/kubi/assets/dialog/WithdrawReverseCalculationDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,85:1\n143#2,20:86\n*S KotlinDebug\n*F\n+ 1 WithdrawReverseCalculationDialog.kt\ncom/kubi/assets/dialog/WithdrawReverseCalculationDialog\n*L\n29#1:86,20\n*E\n"})
public final class WithdrawReverseCalculationDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final InterfaceC24293a f17003s0 = C45681e.m100799e(this, new Function1<WithdrawReverseCalculationDialog, C44769g0>() { // from class: com.kubi.assets.dialog.WithdrawReverseCalculationDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44769g0 invoke(@NotNull WithdrawReverseCalculationDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44769g0.m99053a(fragment.requireView());
        }
    }, new Function1<C44769g0, Unit>() { // from class: com.kubi.assets.dialog.WithdrawReverseCalculationDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44769g0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44769g0 c44769g0) {
            invoke(c44769g0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public Function1<? super WithdrawalAmountEntity, Unit> f17004t0;

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f17002v0 = {Reflection.property1(new PropertyReference1Impl(WithdrawReverseCalculationDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogWithdrawReverseCalculationBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f17001u0 = new Companion(null);

    /* JADX INFO: compiled from: WithdrawReverseCalculationDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawReverseCalculationDialog$Companion;", "", "<init>", "()V", "TAG", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: n4 */
    public final C44769g0 m16172n4() {
        return (C44769g0) this.f17003s0.getValue(this, f17002v0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_withdraw_reverse_calculation, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        String beforeDiscountFee;
        BigDecimal bigDecimalM66536f;
        BigDecimal scale;
        String fee;
        BigDecimal bigDecimalM66536f2;
        BigDecimal scale2;
        String receivedAmount;
        BigDecimal bigDecimalM66536f3;
        String amount;
        BigDecimal bigDecimalM66536f4;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        String plainString = null;
        final WithdrawalAmountEntity withdrawalAmountEntity = arguments != null ? (WithdrawalAmountEntity) RouteExKt.m56274t(arguments, "data") : null;
        Bundle arguments2 = getArguments();
        final int iM66651k = C27039d.m66651k(arguments2 != null ? Integer.valueOf(RouteExKt.m56260m(arguments2, "precision")) : null, 8);
        Bundle arguments3 = getArguments();
        String strM56284y = arguments3 != null ? RouteExKt.m56284y(arguments3, "coin") : null;
        String strM92640e = (withdrawalAmountEntity == null || (amount = withdrawalAmountEntity.getAmount()) == null || (bigDecimalM66536f4 = DowngradeExKt.m66536f(amount)) == null) ? null : C42180b.m92640e(bigDecimalM66536f4, null, iM66651k, false, false, false, 0, null, 125, null);
        String strM92640e2 = (withdrawalAmountEntity == null || (receivedAmount = withdrawalAmountEntity.getReceivedAmount()) == null || (bigDecimalM66536f3 = DowngradeExKt.m66536f(receivedAmount)) == null) ? null : C42180b.m92640e(bigDecimalM66536f3, null, iM66651k, false, false, false, 0, null, 125, null);
        final String plainString2 = (withdrawalAmountEntity == null || (fee = withdrawalAmountEntity.getFee()) == null || (bigDecimalM66536f2 = DowngradeExKt.m66536f(fee)) == null || (scale2 = bigDecimalM66536f2.setScale(iM66651k, RoundingMode.DOWN)) == null) ? null : scale2.toPlainString();
        if (withdrawalAmountEntity != null && (beforeDiscountFee = withdrawalAmountEntity.getBeforeDiscountFee()) != null && (bigDecimalM66536f = DowngradeExKt.m66536f(beforeDiscountFee)) != null && (scale = bigDecimalM66536f.setScale(iM66651k, RoundingMode.DOWN)) != null) {
            plainString = scale.toPlainString();
        }
        C44769g0 c44769g0M16172n4 = m16172n4();
        if (c44769g0M16172n4 != null && (baseTextView2 = c44769g0M16172n4.f99953h) != null) {
            baseTextView2.setText(strM92640e + ' ' + strM56284y);
        }
        C44769g0 c44769g0M16172n5 = m16172n4();
        if (c44769g0M16172n5 != null && (baseTextView = c44769g0M16172n5.f99950e) != null) {
            baseTextView.setText(strM92640e2 + ' ' + strM56284y);
        }
        C44769g0 c44769g0M16172n6 = m16172n4();
        if (c44769g0M16172n6 == null || (kcPrimaryButton = c44769g0M16172n6.f99948c) == null) {
            return;
        }
        final String str = plainString;
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.dialog.l1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WithdrawReverseCalculationDialog.m16171o4(this.f17130b, withdrawalAmountEntity, iM66651k, plainString2, str);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m16173p4(@Nullable Function1<? super WithdrawalAmountEntity, Unit> function1) {
        this.f17004t0 = function1;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m16171o4(WithdrawReverseCalculationDialog withdrawReverseCalculationDialog, WithdrawalAmountEntity withdrawalAmountEntity, int i11, String str, String str2) {
        String amount;
        String plainString;
        String receivedAmount;
        BigDecimal scale;
        BigDecimal scale2;
        withdrawReverseCalculationDialog.dismissAllowingStateLoss();
        Function1<? super WithdrawalAmountEntity, Unit> function1 = withdrawReverseCalculationDialog.f17004t0;
        if (function1 != null) {
            String plainString2 = null;
            if (withdrawalAmountEntity != null) {
                amount = withdrawalAmountEntity.getAmount();
            } else {
                amount = null;
            }
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(amount);
            if (bigDecimalM66536f != null && (scale2 = bigDecimalM66536f.setScale(i11, RoundingMode.DOWN)) != null) {
                plainString = scale2.toPlainString();
            } else {
                plainString = null;
            }
            if (withdrawalAmountEntity != null) {
                receivedAmount = withdrawalAmountEntity.getReceivedAmount();
            } else {
                receivedAmount = null;
            }
            BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(receivedAmount);
            if (bigDecimalM66536f2 != null && (scale = bigDecimalM66536f2.setScale(i11, RoundingMode.DOWN)) != null) {
                plainString2 = scale.toPlainString();
            }
            function1.invoke(new WithdrawalAmountEntity(plainString, str, plainString2, str2));
        }
        return Unit.INSTANCE;
    }
}
