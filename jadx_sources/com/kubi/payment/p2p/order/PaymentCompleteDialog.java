package com.kubi.payment.p2p.order;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.otc.paytype.C20143e;
import com.kubi.payment.flutter.choosefile.PreviewImageFragment;
import com.kubi.payment.p2p.P2PServiceLocator;
import com.kubi.payment.p2p.data.entities.FileSelect;
import com.kubi.payment.p2p.data.entities.TransferOrderInfo;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.payment.p2p.order.transfer.OrderTransferViewModel;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PaymentCompleteDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\f\u0010\u001b\u001a\u00020\u0016*\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m90084d2 = {"Lcom/kubi/payment/p2p/order/PaymentCompleteDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "uploadFileTips", "Lcom/kubi/resources/widget/BaseTextView;", "viewUploadEvidence", "Landroid/widget/LinearLayout;", "uploadLimitTip", "confirmPayMoney", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "cbTerms", "Lcom/kubi/resources/widget/KuCheckBox;", "uploadFileSuccess", "", "viewModel", "Lcom/kubi/payment/p2p/order/transfer/OrderTransferViewModel;", "getViewModel", "()Lcom/kubi/payment/p2p/order/transfer/OrderTransferViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initView", "observeData", "refreshSelectPicture", "checkConfirmBtnEnable", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentCompleteDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentCompleteDialog.kt\ncom/kubi/payment/p2p/order/PaymentCompleteDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n106#2,15:236\n1869#3,2:251\n1617#3,9:254\n1869#3:263\n1870#3:265\n1626#3:266\n1#4:253\n1#4:264\n*S KotlinDebug\n*F\n+ 1 PaymentCompleteDialog.kt\ncom/kubi/payment/p2p/order/PaymentCompleteDialog\n*L\n55#1:236,15\n151#1:251,2\n117#1:254,9\n117#1:263\n117#1:265\n117#1:266\n117#1:264\n*E\n"})
public final class PaymentCompleteDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public static final Companion f39769x0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    public BaseTextView f39770q0;

    /* JADX INFO: renamed from: r0 */
    public LinearLayout f39771r0;

    /* JADX INFO: renamed from: s0 */
    public BaseTextView f39772s0;

    /* JADX INFO: renamed from: t0 */
    public KcPrimaryButton f39773t0;

    /* JADX INFO: renamed from: u0 */
    public KuCheckBox f39774u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f39775v0;

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f39776w0;

    /* JADX INFO: compiled from: PaymentCompleteDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/PaymentCompleteDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragment", "Landroidx/fragment/app/Fragment;", "MAX_SELECT_PICTURE_NUM", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            PaymentCompleteDialog paymentCompleteDialog = new PaymentCompleteDialog();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.payment_complete_layout);
            bundle.putInt("type", 0);
            bundle.putBoolean("isAnimationEnabled", true);
            paymentCompleteDialog.setArguments(bundle);
            paymentCompleteDialog.m54193s3(fragment, "PaymentCompleteDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.order.PaymentCompleteDialog$a */
    /* JADX INFO: compiled from: PaymentCompleteDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21099a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39777b;

        public C21099a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39777b = function;
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
            return this.f39777b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39777b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.order.PaymentCompleteDialog$b */
    /* JADX INFO: compiled from: PaymentCompleteDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/payment/p2p/order/PaymentCompleteDialog$viewModel$3$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21100b implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            T tNewInstance = modelClass.getConstructor(IP2PRepository.class).newInstance(P2PServiceLocator.m48466d(BaseApplication.INSTANCE.get()));
            Intrinsics.checkNotNullExpressionValue(tNewInstance, "newInstance(...)");
            return tNewInstance;
        }
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m48833A4(PaymentCompleteDialog paymentCompleteDialog) {
        KuCheckBox kuCheckBox = paymentCompleteDialog.f39774u0;
        KuCheckBox kuCheckBox2 = null;
        if (kuCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cbTerms");
            kuCheckBox = null;
        }
        KuCheckBox kuCheckBox3 = paymentCompleteDialog.f39774u0;
        if (kuCheckBox3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cbTerms");
        } else {
            kuCheckBox2 = kuCheckBox3;
        }
        kuCheckBox.setChecked(!kuCheckBox2.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m48835C4(PaymentCompleteDialog paymentCompleteDialog) {
        AdPayType currentPayType;
        KcPrimaryButton kcPrimaryButton = paymentCompleteDialog.f39773t0;
        if (kcPrimaryButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmPayMoney");
            kcPrimaryButton = null;
        }
        kcPrimaryButton.m55043o();
        TransferOrderInfo f39904i0 = paymentCompleteDialog.m48863x4().getF39904i0();
        if (C27025c.m66566d(f39904i0 != null ? f39904i0.getRequirePayVoucher() : null)) {
            OrderTransferViewModel orderTransferViewModelM48863x4 = paymentCompleteDialog.m48863x4();
            List<FileSelect> listM49015J = paymentCompleteDialog.m48863x4().m49015J();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listM49015J.iterator();
            while (it.hasNext()) {
                String path = ((FileSelect) it.next()).getPath();
                if (path != null) {
                    arrayList.add(path);
                }
            }
            orderTransferViewModelM48863x4.m49034e0(arrayList);
        } else {
            OrderTransferViewModel orderTransferViewModelM48863x5 = paymentCompleteDialog.m48863x4();
            TransferOrderInfo f39904i1 = paymentCompleteDialog.m48863x4().getF39904i0();
            OrderTransferViewModel.m48999G(orderTransferViewModelM48863x5, C27041f.m66668h((f39904i1 == null || (currentPayType = f39904i1.getCurrentPayType()) == null) ? null : currentPayType.getId()), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m48840H4(PaymentCompleteDialog paymentCompleteDialog, String str) {
        BaseTextView baseTextView = paymentCompleteDialog.f39770q0;
        BaseTextView baseTextView2 = null;
        if (baseTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadFileTips");
            baseTextView = null;
        }
        baseTextView.setText(paymentCompleteDialog.getString(R$string.payment_p2p_order_upload_certificate_desc, str));
        BaseTextView baseTextView3 = paymentCompleteDialog.f39772s0;
        if (baseTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadLimitTip");
        } else {
            baseTextView2 = baseTextView3;
        }
        baseTextView2.setText(paymentCompleteDialog.getString(R$string.payment_p2p_upload_single_error, str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m48841J4(Context context, FileSelect fileSelect) {
        PreviewImageFragment.f39492V.launch(context, C27041f.m66668h(fileSelect.getPath()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final ViewModelProvider.Factory m48845N4() {
        return new C21100b();
    }

    /* JADX INFO: renamed from: y4 */
    private final void m48859y4(View view) {
        KcPrimaryButton kcPrimaryButton;
        AdPayType currentPayType;
        View viewFindViewById = view.findViewById(R$id.upload_file_tips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f39770q0 = (BaseTextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.upload_limit_tip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f39772s0 = (BaseTextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.view_upload_evidence);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f39771r0 = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.iv_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        C27046k.m66711z(viewFindViewById4, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.b2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentCompleteDialog.m48860z4(this.f39789b);
            }
        }, 1, null);
        Group group = (Group) view.findViewById(R$id.view_evidence);
        TransferOrderInfo f39904i0 = m48863x4().getF39904i0();
        group.setVisibility(C21457l.m49860h(C27025c.m66566d(f39904i0 != null ? f39904i0.getRequirePayVoucher() : null)));
        View viewFindViewById5 = view.findViewById(R$id.cb_terms);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f39774u0 = (KuCheckBox) viewFindViewById5;
        BaseTextView baseTextView = (BaseTextView) view.findViewById(R$id.text_terms);
        int i11 = R$string.payment_pay_finish_tip;
        TransferOrderInfo f39904i1 = m48863x4().getF39904i0();
        String strM66668h = C27041f.m66668h((f39904i1 == null || (currentPayType = f39904i1.getCurrentPayType()) == null) ? null : currentPayType.getPayTypeName());
        TransferOrderInfo f39904i2 = m48863x4().getF39904i0();
        String strM66668h2 = C27041f.m66668h(f39904i2 != null ? f39904i2.getLegalCurrencyAmount() : null);
        TransferOrderInfo f39904i3 = m48863x4().getF39904i0();
        baseTextView.setText(getString(i11, strM66668h, strM66668h2, C27041f.m66668h(f39904i3 != null ? f39904i3.getLegalCurrency() : null)));
        Intrinsics.checkNotNull(baseTextView);
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.q1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentCompleteDialog.m48833A4(this.f39875b);
            }
        }, 1, null);
        KuCheckBox kuCheckBox = this.f39774u0;
        if (kuCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cbTerms");
            kuCheckBox = null;
        }
        kuCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.payment.p2p.order.r1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                PaymentCompleteDialog.m48834B4(this.f39877b, compoundButton, z11);
            }
        });
        BaseTextView baseTextView2 = (BaseTextView) view.findViewById(R$id.sub_title);
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(baseTextView2);
        highlightTextHelper.m54120f(baseTextView2, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(view.getContext(), R$color.secondary))));
        View viewFindViewById6 = view.findViewById(R$id.tv_confirm_pay_money);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) viewFindViewById6;
        this.f39773t0 = kcPrimaryButton2;
        if (kcPrimaryButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmPayMoney");
            kcPrimaryButton = null;
        } else {
            kcPrimaryButton = kcPrimaryButton2;
        }
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.s1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentCompleteDialog.m48835C4(this.f39880b);
            }
        }, 1, null);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m48859y4(view);
        Dialog dialog = getDialog();
        if (dialog != null && (frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet)) != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            bottomSheetBehaviorFrom.setState(3);
        }
        m48836D4();
        m48861I4();
        m48862w4();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX INFO: renamed from: w4 */
    public final void m48862w4() {
        boolean z11;
        KcPrimaryButton kcPrimaryButton = this.f39773t0;
        KuCheckBox kuCheckBox = null;
        if (kcPrimaryButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmPayMoney");
            kcPrimaryButton = null;
        }
        if (this.f39775v0) {
            KuCheckBox kuCheckBox2 = this.f39774u0;
            if (kuCheckBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cbTerms");
            } else {
                kuCheckBox = kuCheckBox2;
            }
            if (kuCheckBox.isChecked()) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        kcPrimaryButton.setEnabled(z11);
    }

    /* JADX INFO: renamed from: x4 */
    public final OrderTransferViewModel m48863x4() {
        return (OrderTransferViewModel) this.f39776w0.getValue();
    }

    public PaymentCompleteDialog() {
        final Function0 function0 = new Function0() { // from class: com.kubi.payment.p2p.order.v1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentCompleteDialog.m48844M4(this.f39955b);
            }
        };
        Function0 function1 = new Function0() { // from class: com.kubi.payment.p2p.order.w1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentCompleteDialog.m48845N4();
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.payment.p2p.order.PaymentCompleteDialog$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function2 = null;
        this.f39776w0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(OrderTransferViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.payment.p2p.order.PaymentCompleteDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.payment.p2p.order.PaymentCompleteDialog$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function3 = function2;
                if (function3 != null && (creationExtras = (CreationExtras) function3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function1);
    }

    /* JADX INFO: renamed from: B4 */
    public static final void m48834B4(PaymentCompleteDialog paymentCompleteDialog, CompoundButton compoundButton, boolean z11) {
        paymentCompleteDialog.m48862w4();
    }

    /* JADX INFO: renamed from: D4 */
    private final void m48836D4() {
        m48863x4().m49025U().observe(getViewLifecycleOwner(), new C21099a(new Function1() { // from class: com.kubi.payment.p2p.order.x1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentCompleteDialog.m48840H4(this.f39960b, (String) obj);
            }
        }));
        m48863x4().m49018M().observe(getViewLifecycleOwner(), new C21099a(new Function1() { // from class: com.kubi.payment.p2p.order.y1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentCompleteDialog.m48837E4(this.f39963b, (Boolean) obj);
            }
        }));
        m48863x4().m49016K().observe(getViewLifecycleOwner(), new C21099a(new Function1() { // from class: com.kubi.payment.p2p.order.z1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentCompleteDialog.m48838F4(this.f39966b, (Boolean) obj);
            }
        }));
        m48863x4().m94036q().observe(getViewLifecycleOwner(), new C21099a(new Function1() { // from class: com.kubi.payment.p2p.order.a2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentCompleteDialog.m48839G4(this.f39785b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m48837E4(PaymentCompleteDialog paymentCompleteDialog, Boolean bool) {
        if (bool.booleanValue()) {
            paymentCompleteDialog.m48861I4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m48838F4(PaymentCompleteDialog paymentCompleteDialog, Boolean bool) {
        paymentCompleteDialog.dismiss();
        KcPrimaryButton kcPrimaryButton = paymentCompleteDialog.f39773t0;
        if (kcPrimaryButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmPayMoney");
            kcPrimaryButton = null;
        }
        kcPrimaryButton.mo28851l();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m48839G4(PaymentCompleteDialog paymentCompleteDialog, Boolean bool) {
        if (!bool.booleanValue()) {
            KcPrimaryButton kcPrimaryButton = paymentCompleteDialog.f39773t0;
            if (kcPrimaryButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("confirmPayMoney");
                kcPrimaryButton = null;
            }
            kcPrimaryButton.mo28851l();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m48842K4(PaymentCompleteDialog paymentCompleteDialog, FileSelect fileSelect) {
        paymentCompleteDialog.m48863x4().m49015J().remove(fileSelect);
        paymentCompleteDialog.m48861I4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m48843L4(PaymentCompleteDialog paymentCompleteDialog) {
        String legalCurrency;
        String cryptoCurrency;
        paymentCompleteDialog.m48863x4().m49030Z();
        TransferOrderInfo f39904i0 = paymentCompleteDialog.m48863x4().getF39904i0();
        Boolean boolIsP2PExpress = null;
        if (f39904i0 != null) {
            legalCurrency = f39904i0.getLegalCurrency();
        } else {
            legalCurrency = null;
        }
        Pair pairM90091to = TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(legalCurrency));
        TransferOrderInfo f39904i1 = paymentCompleteDialog.m48863x4().getF39904i0();
        if (f39904i1 != null) {
            cryptoCurrency = f39904i1.getCryptoCurrency();
        } else {
            cryptoCurrency = null;
        }
        Pair pairM90091to2 = TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(cryptoCurrency));
        TransferOrderInfo f39904i2 = paymentCompleteDialog.m48863x4().getF39904i0();
        if (f39904i2 != null) {
            boolIsP2PExpress = f39904i2.isP2PExpress();
        }
        C43852m.m96590b("B7P2POrderPaymentDetail", "uploadProof", "1", pairM90091to, pairM90091to2, TuplesKt.m90091to("isP2PExpress", Boolean.valueOf(C27025c.m66566d(boolIsP2PExpress))), TuplesKt.m90091to("pay_side", "buy"), TuplesKt.m90091to("norm_version", "1"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final ViewModelStoreOwner m48844M4(PaymentCompleteDialog paymentCompleteDialog) {
        Fragment parentFragment = paymentCompleteDialog.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return paymentCompleteDialog;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m48860z4(PaymentCompleteDialog paymentCompleteDialog) {
        paymentCompleteDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public final void m48861I4() {
        Boolean requirePayVoucher;
        Object next;
        final Context context = getContext();
        if (context != null) {
            LinearLayout linearLayout = this.f39771r0;
            BaseTextView baseTextView = null;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewUploadEvidence");
                linearLayout = null;
            }
            linearLayout.removeAllViews();
            for (final FileSelect fileSelect : m48863x4().m49015J()) {
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
                int i11 = R$layout.payment_view_order_transfer_image;
                LinearLayout linearLayout2 = this.f39771r0;
                if (linearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewUploadEvidence");
                    linearLayout2 = null;
                }
                View viewInflate = layoutInflaterFrom.inflate(i11, (ViewGroup) linearLayout2, false);
                BaseViewHolder baseViewHolder = new BaseViewHolder(viewInflate);
                ImageView imageView = (ImageView) baseViewHolder.getView(R$id.iv_pic);
                Intrinsics.checkNotNull(imageView);
                C20143e.m45237c(imageView, context, fileSelect.getPath());
                C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.p1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentCompleteDialog.m48841J4(context, fileSelect);
                    }
                }, 1, null);
                View view = baseViewHolder.getView(R$id.iv_del_pic);
                Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
                C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.t1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentCompleteDialog.m48842K4(this.f39883b, fileSelect);
                    }
                }, 1, null);
                LinearLayout linearLayout3 = this.f39771r0;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewUploadEvidence");
                    linearLayout3 = null;
                }
                linearLayout3.addView(viewInflate);
            }
            if (m48863x4().m49015J().size() < 2) {
                View viewInflate2 = LayoutInflater.from(getContext()).inflate(R$layout.payment_view_order_transfer_add_image, (ViewGroup) null);
                View view2 = new BaseViewHolder(viewInflate2).getView(R$id.view_add_bg);
                Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
                C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.u1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentCompleteDialog.m48843L4(this.f39952b);
                    }
                }, 1, null);
                LinearLayout linearLayout4 = this.f39771r0;
                if (linearLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewUploadEvidence");
                    linearLayout4 = null;
                }
                linearLayout4.addView(viewInflate2);
            }
            TransferOrderInfo f39904i0 = m48863x4().getF39904i0();
            if (f39904i0 != null) {
                requirePayVoucher = f39904i0.getRequirePayVoucher();
            } else {
                requirePayVoucher = null;
            }
            if (C27025c.m66566d(requirePayVoucher)) {
                if (!m48863x4().m49015J().isEmpty()) {
                    Iterator<T> it = m48863x4().m49015J().iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                            break;
                        }
                    } while (!C27025c.m66566d(((FileSelect) next).isLimit()));
                    if (next == null) {
                        BaseTextView baseTextView2 = this.f39770q0;
                        if (baseTextView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("uploadFileTips");
                            baseTextView2 = null;
                        }
                        C27046k.m66685H(baseTextView2);
                        BaseTextView baseTextView3 = this.f39772s0;
                        if (baseTextView3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("uploadLimitTip");
                        } else {
                            baseTextView = baseTextView3;
                        }
                        C27046k.m66700o(baseTextView);
                        this.f39775v0 = true;
                    } else {
                        BaseTextView baseTextView4 = this.f39770q0;
                        if (baseTextView4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("uploadFileTips");
                            baseTextView4 = null;
                        }
                        C27046k.m66700o(baseTextView4);
                        BaseTextView baseTextView5 = this.f39772s0;
                        if (baseTextView5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("uploadLimitTip");
                        } else {
                            baseTextView = baseTextView5;
                        }
                        C27046k.m66685H(baseTextView);
                        this.f39775v0 = false;
                    }
                } else {
                    BaseTextView baseTextView6 = this.f39770q0;
                    if (baseTextView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("uploadFileTips");
                        baseTextView6 = null;
                    }
                    C27046k.m66685H(baseTextView6);
                    BaseTextView baseTextView7 = this.f39772s0;
                    if (baseTextView7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("uploadLimitTip");
                    } else {
                        baseTextView = baseTextView7;
                    }
                    C27046k.m66700o(baseTextView);
                    this.f39775v0 = false;
                }
            } else {
                this.f39775v0 = true;
            }
            m48862w4();
        }
    }
}
