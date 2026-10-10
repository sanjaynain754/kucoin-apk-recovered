package com.kubi.payment.p2p.order.express;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.p2p.P2PServiceLocator;
import com.kubi.payment.p2p.P2PViewModelFactory;
import com.kubi.payment.p2p.data.entities.P2PExpress;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PExpressDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0001H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0002J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/express/P2PExpressDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "tvNewUnitPrice", "Lcom/kubi/resources/widget/BaseTextView;", "tvNewReceive", "tvQuoteError", "tvCountdown", "tvConfirm", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "viewModel", "Lcom/kubi/payment/p2p/order/express/P2PExpressVM;", "needRefresh", "", "orderId", "", "mContext", "Landroid/content/Context;", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "observeData", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "dismissDialog", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PExpressDialog extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: A0 */
    public static boolean f39806A0;

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public static final Companion f39807z0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public BaseTextView f39808q0;

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public BaseTextView f39809r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public BaseTextView f39810s0;

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public BaseTextView f39811t0;

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public KcPrimaryButton f39812u0;

    /* JADX INFO: renamed from: v0 */
    public P2PExpressVM f39813v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f39814w0;

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public String f39815x0 = "";

    /* JADX INFO: renamed from: y0 */
    public Context f39816y0;

    /* JADX INFO: compiled from: P2PExpressDialog.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/express/P2PExpressDialog$Companion;", "", "<init>", "()V", "isShowing", "", "ORDER_ID", "", "OLD_UNIT_PRICE", "OLD_RECEIVE", "CRYPTO_CURRENCY", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "orderId", "unitPrice", "receive", "cryptoCurrency", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager, @NotNull String orderId, @NotNull String unitPrice, @NotNull String receive, @NotNull String cryptoCurrency, @NotNull final Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(unitPrice, "unitPrice");
            Intrinsics.checkNotNullParameter(receive, "receive");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (P2PExpressDialog.f39806A0) {
                return;
            }
            P2PExpressDialog.f39806A0 = true;
            P2PExpressDialog p2PExpressDialog = new P2PExpressDialog();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.payment_dialog_p2p_express);
            bundle.putInt("type", 4);
            bundle.putBoolean("isBottomSheet", false);
            bundle.putString("orderId", orderId);
            bundle.putString("oldUnitPrice", unitPrice);
            bundle.putString("oldReceive", receive);
            bundle.putString("cryptoCurrency", cryptoCurrency);
            p2PExpressDialog.setArguments(bundle);
            p2PExpressDialog.m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.payment.p2p.order.express.i
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    P2PExpressDialog.Companion.m48894b(callback, dialogInterface);
                }
            });
            p2PExpressDialog.show(fragmentManager, "payment_p2p_express_dialog");
        }

        /* JADX INFO: renamed from: b */
        public static final void m48894b(Function0 function0, DialogInterface dialogInterface) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.order.express.P2PExpressDialog$a */
    /* JADX INFO: compiled from: P2PExpressDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21121a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39817b;

        public C21121a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39817b = function;
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
            return this.f39817b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39817b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m48889x4(P2PExpressDialog p2PExpressDialog, P2PExpress.HedgeResponse hedgeResponse) {
        p2PExpressDialog.f39814w0 = false;
        BaseTextView baseTextView = p2PExpressDialog.f39808q0;
        if (baseTextView != null) {
            baseTextView.setText(p2PExpressDialog.getString(R$string.payment_price, hedgeResponse.getPrice(), hedgeResponse.getHedgeMidCurrency()));
        }
        BaseTextView baseTextView2 = p2PExpressDialog.f39809r0;
        if (baseTextView2 != null) {
            baseTextView2.setText(p2PExpressDialog.getString(R$string.payment_price, hedgeResponse.getToAmount(), hedgeResponse.getToCurrency()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public final void m48892t4() {
        f39806A0 = false;
        dismiss();
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m48874B4(P2PExpressDialog p2PExpressDialog) {
        P2PExpressVM p2PExpressVM = null;
        if (p2PExpressDialog.f39814w0) {
            C43852m.m96591c("B7P2POrderDetails", "refreshPrice", null, null, 12, null);
            P2PExpressVM p2PExpressVM2 = p2PExpressDialog.f39813v0;
            if (p2PExpressVM2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                p2PExpressVM = p2PExpressVM2;
            }
            p2PExpressVM.m48911I(p2PExpressDialog.f39815x0);
        } else {
            C43852m.m96591c("B7P2POrderDetails", "continueConvert", null, null, 12, null);
            P2PExpressVM p2PExpressVM3 = p2PExpressDialog.f39813v0;
            if (p2PExpressVM3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                p2PExpressVM = p2PExpressVM3;
            }
            p2PExpressVM.m48905C(p2PExpressDialog.f39815x0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m48875C4(P2PExpressDialog p2PExpressDialog) {
        C43852m.m96591c("B7P2POrderDetails", "cancelReceive", null, null, 12, null);
        P2PExpressVM p2PExpressVM = p2PExpressDialog.f39813v0;
        if (p2PExpressVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            p2PExpressVM = null;
        }
        p2PExpressVM.m48904B(p2PExpressDialog.f39815x0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    private final void m48886u4() {
        P2PExpressVM p2PExpressVM = this.f39813v0;
        P2PExpressVM p2PExpressVM2 = null;
        if (p2PExpressVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            p2PExpressVM = null;
        }
        p2PExpressVM.m45656o().observe(getViewLifecycleOwner(), new C21121a(new Function1() { // from class: com.kubi.payment.p2p.order.express.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PExpressDialog.m48887v4((Throwable) obj);
            }
        }));
        P2PExpressVM p2PExpressVM3 = this.f39813v0;
        if (p2PExpressVM3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            p2PExpressVM3 = null;
        }
        p2PExpressVM3.m48910H().observe(getViewLifecycleOwner(), new C21121a(new Function1() { // from class: com.kubi.payment.p2p.order.express.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PExpressDialog.m48888w4(this.f39827b, (Boolean) obj);
            }
        }));
        P2PExpressVM p2PExpressVM4 = this.f39813v0;
        if (p2PExpressVM4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            p2PExpressVM4 = null;
        }
        p2PExpressVM4.m48907E().observe(getViewLifecycleOwner(), new C21121a(new Function1() { // from class: com.kubi.payment.p2p.order.express.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PExpressDialog.m48889x4(this.f39828b, (P2PExpress.HedgeResponse) obj);
            }
        }));
        P2PExpressVM p2PExpressVM5 = this.f39813v0;
        if (p2PExpressVM5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            p2PExpressVM5 = null;
        }
        p2PExpressVM5.m48909G().observe(getViewLifecycleOwner(), new C21121a(new Function1() { // from class: com.kubi.payment.p2p.order.express.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PExpressDialog.m48890y4(this.f39829b, (Boolean) obj);
            }
        }));
        P2PExpressVM p2PExpressVM6 = this.f39813v0;
        if (p2PExpressVM6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            p2PExpressVM6 = null;
        }
        p2PExpressVM6.m48906D().observe(getViewLifecycleOwner(), new C21121a(new Function1() { // from class: com.kubi.payment.p2p.order.express.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PExpressDialog.m48891z4(this.f39830b, (String) obj);
            }
        }));
        P2PExpressVM p2PExpressVM7 = this.f39813v0;
        if (p2PExpressVM7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            p2PExpressVM2 = p2PExpressVM7;
        }
        p2PExpressVM2.m48908F().observe(getViewLifecycleOwner(), new C21121a(new Function1() { // from class: com.kubi.payment.p2p.order.express.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PExpressDialog.m48873A4(this.f39831b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m48891z4(P2PExpressDialog p2PExpressDialog, String str) {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        if (Intrinsics.areEqual(str, "0")) {
            p2PExpressDialog.f39814w0 = true;
            KcPrimaryButton kcPrimaryButton3 = p2PExpressDialog.f39812u0;
            if (!C27025c.m66566d(kcPrimaryButton3 != null ? Boolean.valueOf(kcPrimaryButton3.getF44406k()) : null) && (kcPrimaryButton2 = p2PExpressDialog.f39812u0) != null) {
                kcPrimaryButton2.setText(p2PExpressDialog.getString(R$string.pay_fast_trade_confirm_refresh_price));
            }
        } else {
            p2PExpressDialog.f39814w0 = false;
            KcPrimaryButton kcPrimaryButton4 = p2PExpressDialog.f39812u0;
            if (!C27025c.m66566d(kcPrimaryButton4 != null ? Boolean.valueOf(kcPrimaryButton4.getF44406k()) : null) && (kcPrimaryButton = p2PExpressDialog.f39812u0) != null) {
                kcPrimaryButton.setText(p2PExpressDialog.getString(R$string.p2pexpress_confrim_continue));
            }
        }
        BaseTextView baseTextView = p2PExpressDialog.f39811t0;
        if (baseTextView != null) {
            baseTextView.setText(p2PExpressDialog.getString(R$string.payment_count_down_time, str));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        BaseTextView baseTextView = (BaseTextView) viewHolder.getView(R$id.tv_invalid_unit_price);
        Bundle arguments = getArguments();
        baseTextView.setText(C27041f.m66668h(arguments != null ? arguments.getString("oldUnitPrice") : null));
        BaseTextView baseTextView2 = (BaseTextView) viewHolder.getView(R$id.tv_invalid_receive);
        Bundle arguments2 = getArguments();
        baseTextView2.setText(C27041f.m66668h(arguments2 != null ? arguments2.getString("oldReceive") : null));
        this.f39808q0 = (BaseTextView) viewHolder.getView(R$id.tv_new_unit_price);
        this.f39809r0 = (BaseTextView) viewHolder.getView(R$id.tv_new_receive);
        BaseTextView baseTextView3 = (BaseTextView) viewHolder.getView(R$id.tv_error);
        this.f39810s0 = baseTextView3;
        if (baseTextView3 != null) {
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            Context context = this.f39816y0;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            highlightTextHelper.m54120f(baseTextView3, new Pair(textTagEnum, new ForegroundColorSpan(ContextCompat.getColor(context, R$color.brandRed))));
        }
        this.f39811t0 = (BaseTextView) viewHolder.getView(R$id.tv_count_down_time);
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) viewHolder.getView(R$id.tv_continue);
        this.f39812u0 = kcPrimaryButton;
        if (kcPrimaryButton != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.express.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PExpressDialog.m48874B4(this.f39832b);
                }
            }, 1, null);
        }
        TextView textView = (TextView) viewHolder.getView(R$id.tv_cancel);
        if (textView != null) {
            int i11 = R$string.p2pexpress_cancel_convert;
            Bundle arguments3 = getArguments();
            textView.setText(getString(i11, C27041f.m66668h(arguments3 != null ? arguments3.getString("cryptoCurrency") : null)));
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.express.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PExpressDialog.m48875C4(this.f39833b);
                }
            }, 1, null);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f39816y0 = context;
        Application application = BaseApplication.INSTANCE.get();
        this.f39813v0 = (P2PExpressVM) new ViewModelProvider(this, new P2PViewModelFactory(P2PServiceLocator.m48466d(application), application)).get(P2PExpressVM.class);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        f39806A0 = false;
        super.onDismiss(dialog);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m48886u4();
        P2PExpressVM p2PExpressVM = this.f39813v0;
        if (p2PExpressVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            p2PExpressVM = null;
        }
        p2PExpressVM.m48911I(this.f39815x0);
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m48873A4(P2PExpressDialog p2PExpressDialog, Boolean bool) {
        p2PExpressDialog.m48892t4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public static final Unit m48887v4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m48888w4(P2PExpressDialog p2PExpressDialog, Boolean bool) {
        if (bool.booleanValue()) {
            KcPrimaryButton kcPrimaryButton = p2PExpressDialog.f39812u0;
            if (kcPrimaryButton != null) {
                kcPrimaryButton.m55043o();
            }
        } else {
            KcPrimaryButton kcPrimaryButton2 = p2PExpressDialog.f39812u0;
            if (kcPrimaryButton2 != null) {
                kcPrimaryButton2.mo28851l();
            }
            if (p2PExpressDialog.f39814w0) {
                KcPrimaryButton kcPrimaryButton3 = p2PExpressDialog.f39812u0;
                if (kcPrimaryButton3 != null) {
                    kcPrimaryButton3.setText(p2PExpressDialog.getString(R$string.pay_fast_trade_confirm_refresh_price));
                }
            } else {
                KcPrimaryButton kcPrimaryButton4 = p2PExpressDialog.f39812u0;
                if (kcPrimaryButton4 != null) {
                    kcPrimaryButton4.setText(p2PExpressDialog.getString(R$string.p2pexpress_confrim_continue));
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m48890y4(P2PExpressDialog p2PExpressDialog, Boolean bool) {
        if (bool.booleanValue()) {
            p2PExpressDialog.f39814w0 = true;
            KcPrimaryButton kcPrimaryButton = p2PExpressDialog.f39812u0;
            if (kcPrimaryButton != null) {
                kcPrimaryButton.mo28851l();
            }
            KcPrimaryButton kcPrimaryButton2 = p2PExpressDialog.f39812u0;
            if (kcPrimaryButton2 != null) {
                kcPrimaryButton2.setText(p2PExpressDialog.getString(R$string.pay_fast_trade_confirm_refresh_price));
            }
            BaseTextView baseTextView = p2PExpressDialog.f39810s0;
            if (baseTextView != null) {
                C27046k.m66685H(baseTextView);
            }
            BaseTextView baseTextView2 = p2PExpressDialog.f39808q0;
            if (baseTextView2 != null) {
                baseTextView2.setText(C33820nf.f71144W);
            }
            BaseTextView baseTextView3 = p2PExpressDialog.f39809r0;
            if (baseTextView3 != null) {
                baseTextView3.setText(C33820nf.f71144W);
            }
        } else {
            p2PExpressDialog.f39814w0 = false;
            BaseTextView baseTextView4 = p2PExpressDialog.f39810s0;
            if (baseTextView4 != null) {
                C27046k.m66700o(baseTextView4);
            }
            KcPrimaryButton kcPrimaryButton3 = p2PExpressDialog.f39812u0;
            if (kcPrimaryButton3 != null) {
                kcPrimaryButton3.mo28851l();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m54236e4(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("orderId", "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this.f39815x0 = string;
        }
    }
}
