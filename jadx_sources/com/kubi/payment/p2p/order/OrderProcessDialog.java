package com.kubi.payment.p2p.order;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.utils.C27017c;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: OrderProcessDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J0\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0002J0\u0010%\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020!H\u0002J\b\u0010'\u001a\u00020\u0014H\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0014H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006-"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/OrderProcessDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "sceneType", "", "getSceneType", "()I", "sceneType$delegate", "Lkotlin/Lazy;", "orderId", "", "getOrderId", "()Ljava/lang/String;", "orderId$delegate", "countdownOwner", "Lcom/kubi/payment/p2p/order/OrderCountdownOwner;", "getCountdownOwner", "()Lcom/kubi/payment/p2p/order/OrderCountdownOwner;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleSceneTimeout", "iconV", "Landroidx/appcompat/widget/AppCompatImageView;", "titleTextV", "Lcom/kubi/resources/widget/BaseTextView;", "descTextV", "paymentCountdownText", "buttonV", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "renderCountdownText", "countdown", "", "handleSceneLeave", "button", "dismiss", "onCancel", "dialog", "Landroid/content/DialogInterface;", "alreadyShow", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OrderProcessDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f39763s0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f39764q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.order.l1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(OrderProcessDialog.m48825y4(this.f39860b));
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f39765r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.order.m1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderProcessDialog.m48824w4(this.f39863b);
        }
    });

    /* JADX INFO: compiled from: OrderProcessDialog.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J(\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/OrderProcessDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragment", "Landroidx/fragment/app/Fragment;", "orderId", "", "sceneType", "", "clearDialogStore", "isBuy", "", "isWaitingForPay", "SCENE_ORDER_PROCESS_DIALOG_LEAVE", "SCENE_ORDER_PROCESS_DIALOG_TIMEOUT", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void clearDialogStore(boolean isBuy, @Nullable String orderId, boolean isWaitingForPay, int sceneType) {
            if (!isBuy || orderId == null || orderId.length() == 0 || isWaitingForPay) {
                return;
            }
            StorageId<Boolean> storageIdM49847y = PaymentStorageId.f40364a.m49847y(orderId, sceneType);
            if (C46392a.m102320b(storageIdM49847y)) {
                C44128b.m97265i("roc clearDialogStore: orderId=" + orderId + ", sceneType=" + sceneType + ", remove cache");
                C46392a.m102335r(storageIdM49847y);
            }
        }

        @JvmStatic
        public final void show(@NotNull Fragment fragment, @NotNull String orderId, int sceneType) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            OrderProcessDialog orderProcessDialog = new OrderProcessDialog();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.order_processing_layout);
            bundle.putInt("type", 4);
            bundle.putBoolean("isAnimationEnabled", true);
            bundle.putInt("sceneType", sceneType);
            bundle.putString("orderId", orderId);
            orderProcessDialog.setArguments(bundle);
            orderProcessDialog.m54193s3(fragment, "OrderProcessDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.order.OrderProcessDialog$a */
    /* JADX INFO: compiled from: OrderProcessDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21098a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39766b;

        public C21098a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39766b = function;
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
            return this.f39766b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39766b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    private final String getOrderId() {
        return (String) this.f39765r0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        m48826o4();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R$id.payment_process_warn_icon);
        BaseTextView baseTextView = (BaseTextView) view.findViewById(R$id.payment_process_warn_title);
        BaseTextView baseTextView2 = (BaseTextView) view.findViewById(R$id.payment_countdown_text);
        BaseTextView baseTextView3 = (BaseTextView) view.findViewById(R$id.payment_process_warn_desc);
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) view.findViewById(R$id.leave_button);
        if (m48828q4() == 1) {
            Intrinsics.checkNotNull(appCompatImageView);
            Intrinsics.checkNotNull(baseTextView);
            Intrinsics.checkNotNull(baseTextView3);
            Intrinsics.checkNotNull(baseTextView2);
            Intrinsics.checkNotNull(kcPrimaryButton);
            m48829r4(appCompatImageView, baseTextView, baseTextView3, baseTextView2, kcPrimaryButton);
            return;
        }
        if (m48828q4() == 2) {
            Intrinsics.checkNotNull(appCompatImageView);
            Intrinsics.checkNotNull(baseTextView);
            Intrinsics.checkNotNull(baseTextView3);
            Intrinsics.checkNotNull(baseTextView2);
            Intrinsics.checkNotNull(kcPrimaryButton);
            m48830t4(appCompatImageView, baseTextView, baseTextView3, baseTextView2, kcPrimaryButton);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final int m48828q4() {
        return ((Number) this.f39764q0.getValue()).intValue();
    }

    /* JADX INFO: renamed from: r4 */
    public final void m48829r4(AppCompatImageView appCompatImageView, BaseTextView baseTextView, BaseTextView baseTextView2, BaseTextView baseTextView3, KcPrimaryButton kcPrimaryButton) {
        appCompatImageView.setImageResource(R$drawable.ic2_common_warning);
        baseTextView.setText(getString(R$string.payment_p2p_pay_timeout_title));
        baseTextView2.setText(getString(R$string.payment_p2p_pay_timeout_des));
        kcPrimaryButton.setText(getString(R$string.payment_p2p_pay_leave_confirm));
        baseTextView3.setVisibility(8);
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.i1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderProcessDialog.m48821s4(this.f39850b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: t4 */
    public final void m48830t4(AppCompatImageView appCompatImageView, BaseTextView baseTextView, BaseTextView baseTextView2, final BaseTextView baseTextView3, KcPrimaryButton kcPrimaryButton) {
        LiveData<Long> liveDataMo48711f1;
        appCompatImageView.setImageResource(R$drawable.ic2_common_processing);
        baseTextView.setText(getString(R$string.payment_p2p_pay_leave_title));
        baseTextView2.setText(getString(R$string.payment_p2p_pay_leave_warn));
        kcPrimaryButton.setText(getString(R$string.payment_i_know));
        baseTextView3.setVisibility(0);
        OrderCountdownOwner orderCountdownOwnerM48827p4 = m48827p4();
        if (orderCountdownOwnerM48827p4 != null && (liveDataMo48711f1 = orderCountdownOwnerM48827p4.mo48711f1()) != null) {
            liveDataMo48711f1.observe(getViewLifecycleOwner(), new C21098a(new Function1() { // from class: com.kubi.payment.p2p.order.j1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderProcessDialog.m48822u4(this.f39853b, baseTextView3, (Long) obj);
                }
            }));
        }
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.k1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderProcessDialog.m48823v4(this.f39857b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m48821s4(OrderProcessDialog orderProcessDialog) {
        orderProcessDialog.dismiss();
        FragmentActivity activity = orderProcessDialog.getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        FragmentActivity activity2 = orderProcessDialog.getActivity();
        if (activity2 != null) {
            activity2.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m48822u4(OrderProcessDialog orderProcessDialog, BaseTextView baseTextView, Long l11) {
        Intrinsics.checkNotNull(l11);
        orderProcessDialog.m48831x4(baseTextView, l11.longValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m48823v4(OrderProcessDialog orderProcessDialog) {
        orderProcessDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final String m48824w4(OrderProcessDialog orderProcessDialog) {
        String string;
        Bundle arguments = orderProcessDialog.getArguments();
        if (arguments != null && (string = arguments.getString("orderId")) != null) {
            return string;
        }
        return "";
    }

    /* JADX INFO: renamed from: y4 */
    public static final int m48825y4(OrderProcessDialog orderProcessDialog) {
        Bundle arguments = orderProcessDialog.getArguments();
        if (arguments != null) {
            return arguments.getInt("sceneType");
        }
        return 1;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
        m48826o4();
    }

    /* JADX INFO: renamed from: o4 */
    public final void m48826o4() {
        String orderId = getOrderId();
        if (orderId != null && orderId.length() != 0) {
            StorageId<Boolean> storageIdM49847y = PaymentStorageId.f40364a.m49847y(getOrderId(), m48828q4());
            C44128b.m97265i("roc alreadyShow: orderId=" + getOrderId() + ", sceneType=" + m48828q4() + ", put cache");
            C46392a.m102328k(storageIdM49847y, true);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final OrderCountdownOwner m48827p4() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof OrderCountdownOwner) {
            return (OrderCountdownOwner) parentFragment;
        }
        return null;
    }

    /* JADX INFO: renamed from: x4 */
    public final void m48831x4(BaseTextView baseTextView, long j11) {
        baseTextView.setText(new SpannableString(getString(R$string.payment_p2p_pay_leave_desc, TimeUtils.m66417d(j11))));
        HighlightTextHelper.f43497a.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.primary))));
    }
}
