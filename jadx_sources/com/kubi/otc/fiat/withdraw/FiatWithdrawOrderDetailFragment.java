package com.kubi.otc.fiat.withdraw;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.otc.R$color;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FeeAmount;
import com.kubi.otc.entity.FiatWithdrawOrderInfo;
import com.kubi.otc.entity.TaxAmount;
import com.kubi.otc.entity.WithdrawAmount;
import com.kubi.payment.channel.data.entities.ErrorInfoEntity;
import com.kubi.payment.flutter.FlutterNavigationHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27096v0;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import et.InterfaceC37240b;
import f00.C37304a;
import g00.InterfaceC37758j;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37595a3;
import p270ft.C37709y;
import p402kf.C41014a;
import p569qq.C43852m;
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
import w00.C45681e;

/* JADX INFO: compiled from: FiatWithdrawOrderDetailFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u001a\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/FiatWithdrawOrderDetailFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", "orderId", "", "getOrderId", "()Ljava/lang/String;", "orderId$delegate", "vb", "Lcom/kubi/otc/databinding/BotcFragmentFiatWithdrawOrderDetailBinding;", "getVb", "()Lcom/kubi/otc/databinding/BotcFragmentFiatWithdrawOrderDetailBinding;", "vb$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getWithdrawOrderDetails", "handleEdd", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;", "errorInfo", "Lcom/kubi/payment/channel/data/entities/ErrorInfoEntity;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatWithdrawOrderDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatWithdrawOrderDetailFragment.kt\ncom/kubi/otc/fiat/withdraw/FiatWithdrawOrderDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,125:1\n147#2,16:126\n*S KotlinDebug\n*F\n+ 1 FiatWithdrawOrderDetailFragment.kt\ncom/kubi/otc/fiat/withdraw/FiatWithdrawOrderDetailFragment\n*L\n41#1:126,16\n*E\n"})
public final class FiatWithdrawOrderDetailFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37458U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.a1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatWithdrawOrderDetailFragment.m44472r3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37459V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.b1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatWithdrawOrderDetailFragment.m44464B3(this.f37493b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f37460W = C45681e.m100799e(this, new Function1<FiatWithdrawOrderDetailFragment, C37709y>() { // from class: com.kubi.otc.fiat.withdraw.FiatWithdrawOrderDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37709y invoke(@NotNull FiatWithdrawOrderDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37709y.m85004a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37709y, Unit>() { // from class: com.kubi.otc.fiat.withdraw.FiatWithdrawOrderDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37709y it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37709y c37709y) {
            invoke(c37709y);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f37457Y = {Reflection.property1(new PropertyReference1Impl(FiatWithdrawOrderDetailFragment.class, "vb", "getVb()Lcom/kubi/otc/databinding/BotcFragmentFiatWithdrawOrderDetailBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f37456X = new Companion(null);

    /* JADX INFO: compiled from: FiatWithdrawOrderDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/FiatWithdrawOrderDetailFragment$Companion;", "", "<init>", "()V", "EXTAR_ORDER_ID", "", "startFragment", "", "orderId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void startFragment(@Nullable String orderId) {
            InterfaceC37758j.a.m85160i(C37304a.f82764a, C27041f.m66668h(orderId), null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m44474v3(FiatWithdrawOrderDetailFragment fiatWithdrawOrderDetailFragment, Disposable disposable) {
        BaseFragment.showLoadingView$default(fiatWithdrawOrderDetailFragment, 0, 0, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u3 */
    public final void m44479u3() {
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        Observable<R> observableCompose = m44473s3().m83291d(getOrderId()).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.c1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatWithdrawOrderDetailFragment.m44474v3(this.f37503b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.d1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatWithdrawOrderDetailFragment.m44475w3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatWithdrawOrderDetailFragment.m44476x3(this.f37582b, (FiatWithdrawOrderInfo) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.f1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatWithdrawOrderDetailFragment.m44477y3(function2, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: z3 */
    public final void m44480z3(final FiatWithdrawOrderInfo fiatWithdrawOrderInfo, ErrorInfoEntity errorInfoEntity) {
        C37595a3 c37595a3;
        ConstraintLayout root;
        C37595a3 c37595a4;
        ConstraintLayout root2;
        C37595a3 c37595a5;
        if (!C27025c.m66566d(errorInfoEntity != null ? Boolean.valueOf(errorInfoEntity.needEdd()) : null)) {
            C37709y c37709yM44478t3 = m44478t3();
            if (c37709yM44478t3 == null || (c37595a3 = c37709yM44478t3.f84889c) == null || (root = c37595a3.getRoot()) == null) {
                return;
            }
            C27046k.m66700o(root);
            return;
        }
        C37709y c37709yM44478t4 = m44478t3();
        if (c37709yM44478t4 != null && (c37595a5 = c37709yM44478t4.f84889c) != null) {
            c37595a5.f83610c.setText(C27041f.m66668h(errorInfoEntity != null ? errorInfoEntity.getMessage() : null));
            BaseTextView tvSubmitInfo = c37595a5.f83611d;
            Intrinsics.checkNotNullExpressionValue(tvSubmitInfo, "tvSubmitInfo");
            C27046k.m66711z(tvSubmitInfo, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.g1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatWithdrawOrderDetailFragment.m44463A3(fiatWithdrawOrderInfo, this);
                }
            }, 1, null);
        }
        C37709y c37709yM44478t5 = m44478t3();
        if (c37709yM44478t5 == null || (c37595a4 = c37709yM44478t5.f84889c) == null || (root2 = c37595a4.getRoot()) == null) {
            return;
        }
        C27046k.m66685H(root2);
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m44463A3(FiatWithdrawOrderInfo fiatWithdrawOrderInfo, FiatWithdrawOrderDetailFragment fiatWithdrawOrderDetailFragment) {
        FlutterNavigationHelper.f39477a.m48163b("WITHDRAW", C27041f.m66668h(fiatWithdrawOrderInfo.getPaymentMethodCode()), C27041f.m66668h(fiatWithdrawOrderInfo.getChannelId()));
        C43852m.m96591c(C27041f.m66668h(fiatWithdrawOrderDetailFragment.getF18762X()), "EddSubmission", null, null, 12, null);
        return Unit.INSTANCE;
    }

    private final String getOrderId() {
        return (String) this.f37459V.getValue();
    }

    /* JADX INFO: renamed from: s3 */
    private final InterfaceC37240b m44473s3() {
        return (InterfaceC37240b) this.f37458U.getValue();
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m44476x3(FiatWithdrawOrderDetailFragment fiatWithdrawOrderDetailFragment, FiatWithdrawOrderInfo fiatWithdrawOrderInfo) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        String amount;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        String amount2;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        BaseTextView baseTextView12;
        String amount3;
        BaseTextView baseTextView13;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        fiatWithdrawOrderDetailFragment.showContentView();
        C37709y c37709yM44478t3 = fiatWithdrawOrderDetailFragment.m44478t3();
        if (c37709yM44478t3 != null && (constraintLayout2 = c37709yM44478t3.f84912z) != null) {
            C27046k.m66700o(constraintLayout2);
        }
        C37709y c37709yM44478t4 = fiatWithdrawOrderDetailFragment.m44478t3();
        if (c37709yM44478t4 != null && (constraintLayout = c37709yM44478t4.f84909w) != null) {
            C27046k.m66700o(constraintLayout);
        }
        C37709y c37709yM44478t5 = fiatWithdrawOrderDetailFragment.m44478t3();
        if (c37709yM44478t5 != null && (baseTextView13 = c37709yM44478t5.f84898l) != null) {
            baseTextView13.setText(C27041f.m66668h(fiatWithdrawOrderInfo.getStatusMessage()));
        }
        C37709y c37709yM44478t6 = fiatWithdrawOrderDetailFragment.m44478t3();
        if (c37709yM44478t6 != null && (baseTextView12 = c37709yM44478t6.f84890d) != null) {
            StringBuilder sb2 = new StringBuilder();
            WithdrawAmount withdrawAmount = fiatWithdrawOrderInfo.getWithdrawAmount();
            sb2.append(C27041f.m66669i((withdrawAmount == null || (amount3 = withdrawAmount.getAmount()) == null) ? null : C41014a.m89945s(amount3, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null), "--"));
            sb2.append(' ');
            WithdrawAmount withdrawAmount2 = fiatWithdrawOrderInfo.getWithdrawAmount();
            sb2.append(C27041f.m66668h(withdrawAmount2 != null ? withdrawAmount2.getCurrency() : null));
            baseTextView12.setText(sb2.toString());
        }
        C37709y c37709yM44478t7 = fiatWithdrawOrderDetailFragment.m44478t3();
        if (c37709yM44478t7 != null && (baseTextView11 = c37709yM44478t7.f84898l) != null) {
            baseTextView11.setTextColor(fiatWithdrawOrderDetailFragment.getColorRes(fiatWithdrawOrderInfo.getStatusColor()));
        }
        C37709y c37709yM44478t8 = fiatWithdrawOrderDetailFragment.m44478t3();
        if (c37709yM44478t8 != null && (baseTextView10 = c37709yM44478t8.f84893g) != null) {
            baseTextView10.setText(C27041f.m66669i(fiatWithdrawOrderInfo.getPayoutTrxnId(), "--"));
        }
        C37709y c37709yM44478t9 = fiatWithdrawOrderDetailFragment.m44478t3();
        if (c37709yM44478t9 != null && (baseTextView9 = c37709yM44478t9.f84902p) != null) {
            baseTextView9.setText(TimeUtils.m66424k(C27039d.m66652l(fiatWithdrawOrderInfo.getCreated())));
        }
        C37709y c37709yM44478t10 = fiatWithdrawOrderDetailFragment.m44478t3();
        if (c37709yM44478t10 != null && (baseTextView8 = c37709yM44478t10.f84891e) != null) {
            C27096v0 c27096v0 = new C27096v0();
            FeeAmount feeAmount = fiatWithdrawOrderInfo.getFeeAmount();
            C27096v0 c27096v0Append = c27096v0.append(C27041f.m66669i((feeAmount == null || (amount2 = feeAmount.getAmount()) == null) ? null : C41014a.m89945s(amount2, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null), "--"));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            FeeAmount feeAmount2 = fiatWithdrawOrderInfo.getFeeAmount();
            sb3.append(C27041f.m66668h(feeAmount2 != null ? feeAmount2.getCurrency() : null));
            baseTextView8.setText(c27096v0Append.m66905e(sb3.toString(), fiatWithdrawOrderDetailFragment.getColorRes(R$color.c_text40)));
        }
        if (fiatWithdrawOrderInfo.getTaxAmount() == null) {
            C37709y c37709yM44478t11 = fiatWithdrawOrderDetailFragment.m44478t3();
            if (c37709yM44478t11 != null && (baseTextView7 = c37709yM44478t11.f84900n) != null) {
                C27046k.m66700o(baseTextView7);
            }
            C37709y c37709yM44478t12 = fiatWithdrawOrderDetailFragment.m44478t3();
            if (c37709yM44478t12 != null && (baseTextView6 = c37709yM44478t12.f84901o) != null) {
                C27046k.m66700o(baseTextView6);
            }
        } else {
            C37709y c37709yM44478t13 = fiatWithdrawOrderDetailFragment.m44478t3();
            if (c37709yM44478t13 != null && (baseTextView3 = c37709yM44478t13.f84901o) != null) {
                C27096v0 c27096v1 = new C27096v0();
                TaxAmount taxAmount = fiatWithdrawOrderInfo.getTaxAmount();
                C27096v0 c27096v0Append2 = c27096v1.append(C27041f.m66669i((taxAmount == null || (amount = taxAmount.getAmount()) == null) ? null : C41014a.m89945s(amount, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null), "--"));
                StringBuilder sb4 = new StringBuilder();
                sb4.append(' ');
                TaxAmount taxAmount2 = fiatWithdrawOrderInfo.getTaxAmount();
                sb4.append(C27041f.m66668h(taxAmount2 != null ? taxAmount2.getCurrency() : null));
                baseTextView3.setText(c27096v0Append2.m66905e(sb4.toString(), fiatWithdrawOrderDetailFragment.getColorRes(R$color.c_text40)));
            }
            C37709y c37709yM44478t14 = fiatWithdrawOrderDetailFragment.m44478t3();
            if (c37709yM44478t14 != null && (baseTextView2 = c37709yM44478t14.f84900n) != null) {
                C27046k.m66685H(baseTextView2);
            }
            C37709y c37709yM44478t15 = fiatWithdrawOrderDetailFragment.m44478t3();
            if (c37709yM44478t15 != null && (baseTextView = c37709yM44478t15.f84901o) != null) {
                C27046k.m66685H(baseTextView);
            }
        }
        C37709y c37709yM44478t16 = fiatWithdrawOrderDetailFragment.m44478t3();
        if (c37709yM44478t16 != null && (baseTextView5 = c37709yM44478t16.f84907u) != null) {
            baseTextView5.setText(C27041f.m66668h(fiatWithdrawOrderInfo.getWithdrawType()));
        }
        C37709y c37709yM44478t17 = fiatWithdrawOrderDetailFragment.m44478t3();
        if (c37709yM44478t17 != null && (baseTextView4 = c37709yM44478t17.f84905s) != null) {
            baseTextView4.setText(C27041f.m66668h(fiatWithdrawOrderInfo.getPayoutAccountInfo()));
        }
        Intrinsics.checkNotNull(fiatWithdrawOrderInfo);
        fiatWithdrawOrderDetailFragment.m44480z3(fiatWithdrawOrderInfo, fiatWithdrawOrderInfo.getErrorInfo());
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_withdraw_order_detail;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.setMainTitle(getString(R$string.otc_text_order_detail));
        } else {
            getTitleBar().setTitle(getString(R$string.otc_text_order_detail));
        }
        m44479u3();
    }

    /* JADX INFO: renamed from: t3 */
    public final C37709y m44478t3() {
        return (C37709y) this.f37460W.getValue(this, f37457Y[0]);
    }

    public FiatWithdrawOrderDetailFragment() {
        setPageId("B7WithdrawOrderDetail");
    }

    /* JADX INFO: renamed from: B3 */
    public static final String m44464B3(FiatWithdrawOrderDetailFragment fiatWithdrawOrderDetailFragment) {
        String strM56284y;
        Bundle arguments = fiatWithdrawOrderDetailFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "orderId");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public static final InterfaceC37240b m44472r3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    /* JADX INFO: renamed from: w3 */
    public static final void m44475w3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m44477y3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
