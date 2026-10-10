package com.kubi.payment.fasttrade.sell;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.Balance;
import com.kubi.payment.helper.PrecisionHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37706x0;
import p429lf.C42180b;
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

/* JADX INFO: compiled from: FastSellBalanceExplainDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/FastSellBalanceExplainDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentDialogFastSellAvailableBalanceBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentDialogFastSellAvailableBalanceBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mContext", "Landroid/content/Context;", "balance", "Lcom/kubi/payment/fast/data/entities/Balance$Response;", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "isBottomSheet", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastSellBalanceExplainDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastSellBalanceExplainDialog.kt\ncom/kubi/payment/fasttrade/sell/FastSellBalanceExplainDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,112:1\n143#2,20:113\n*S KotlinDebug\n*F\n+ 1 FastSellBalanceExplainDialog.kt\ncom/kubi/payment/fasttrade/sell/FastSellBalanceExplainDialog\n*L\n27#1:113,20\n*E\n"})
public final class FastSellBalanceExplainDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f38781q0 = C45681e.m100799e(this, new Function1<FastSellBalanceExplainDialog, C37706x0>() { // from class: com.kubi.payment.fasttrade.sell.FastSellBalanceExplainDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37706x0 invoke(@NotNull FastSellBalanceExplainDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37706x0.m84999a(fragment.requireView());
        }
    }, new Function1<C37706x0, Unit>() { // from class: com.kubi.payment.fasttrade.sell.FastSellBalanceExplainDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C37706x0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37706x0 c37706x0) {
            invoke(c37706x0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    public Context f38782r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public Balance.Response f38783s0;

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ KProperty<Object>[] f38780u0 = {Reflection.property1(new PropertyReference1Impl(FastSellBalanceExplainDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentDialogFastSellAvailableBalanceBinding;", 0))};

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public static final Companion f38779t0 = new Companion(null);

    /* JADX INFO: compiled from: FastSellBalanceExplainDialog.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/FastSellBalanceExplainDialog$Companion;", "", "<init>", "()V", "KEY_BALANCE", "", TIMPushProvider.f75062n, "", "balance", "Lcom/kubi/payment/fast/data/entities/Balance$Response;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull Balance.Response balance, @NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            FastSellBalanceExplainDialog fastSellBalanceExplainDialog = new FastSellBalanceExplainDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_balance", balance);
            fastSellBalanceExplainDialog.setArguments(bundle);
            fastSellBalanceExplainDialog.show(fragmentManager, "payment_fast_sell_balance_explain");
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: l4 */
    public final C37706x0 m46821l4() {
        return (C37706x0) this.f38781q0.getValue(this, f38780u0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f38782r0 = context;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.payment_dialog_fast_sell_available_balance, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m46818m4();
    }

    /* JADX INFO: renamed from: m4 */
    private final void m46818m4() {
        String currency;
        String availableBalance;
        String strM92640e;
        String canWithdrawBalance;
        C37706x0 c37706x0M46821l4 = m46821l4();
        if (c37706x0M46821l4 == null) {
            return;
        }
        AppCompatImageView ivClose = c37706x0M46821l4.f84852b;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.sell.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastSellBalanceExplainDialog.m46819n4(this.f38821b);
            }
        }, 1, null);
        Balance.Response response = this.f38783s0;
        String strM92640e2 = null;
        if (response != null) {
            currency = response.getCurrency();
        } else {
            currency = null;
        }
        String strM66668h = C27041f.m66668h(currency);
        int iM48247a = PrecisionHelper.f39545a.m48247a(strM66668h);
        TextView textView = c37706x0M46821l4.f84853c;
        int i11 = R$string.payment_price;
        Balance.Response response2 = this.f38783s0;
        if (response2 != null) {
            availableBalance = response2.getAvailableBalance();
        } else {
            availableBalance = null;
        }
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(availableBalance);
        if (bigDecimalM66536f != null) {
            strM92640e = C42180b.m92640e(bigDecimalM66536f, null, iM48247a, false, true, true, 0, null, 101, null);
        } else {
            strM92640e = null;
        }
        textView.setText(getString(i11, C42180b.m92647l(strM92640e), strM66668h));
        TextView textView2 = c37706x0M46821l4.f84855e;
        Balance.Response response3 = this.f38783s0;
        if (response3 != null) {
            canWithdrawBalance = response3.getCanWithdrawBalance();
        } else {
            canWithdrawBalance = null;
        }
        BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(canWithdrawBalance);
        if (bigDecimalM66536f2 != null) {
            strM92640e2 = C42180b.m92640e(bigDecimalM66536f2, null, iM48247a, false, true, true, 0, null, 101, null);
        }
        textView2.setText(getString(i11, C42180b.m92647l(strM92640e2), strM66668h));
        KcPrimaryButton tvConfirm = c37706x0M46821l4.f84857g;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.sell.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastSellBalanceExplainDialog.m46820o4(this.f38822b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m46819n4(FastSellBalanceExplainDialog fastSellBalanceExplainDialog) {
        fastSellBalanceExplainDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m46820o4(FastSellBalanceExplainDialog fastSellBalanceExplainDialog) {
        fastSellBalanceExplainDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f38783s0 = (Balance.Response) RouteExKt.m56274t(arguments, "key_balance");
        }
    }
}
