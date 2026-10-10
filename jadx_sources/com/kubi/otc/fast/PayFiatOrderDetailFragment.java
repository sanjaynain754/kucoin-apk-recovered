package com.kubi.otc.fast;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$color;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FiatBankCardOrder;
import com.kubi.otc.entity.MultiFee;
import com.kubi.otc.entity.RechargeOrderDetail;
import com.kubi.otc.view.FeeListLayout;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27096v0;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import et.InterfaceC37240b;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37641k;
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
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: PayFiatOrderDetailFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u0017\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m90084d2 = {"Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", "orderId", "", "getOrderId", "()Ljava/lang/String;", "orderId$delegate", "binding", "Lcom/kubi/otc/databinding/BotcFragmentFastFiatDetailBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentFastFiatDetailBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getTradeOrderDetails", "showOrderStatus", "orderStatus", "(Ljava/lang/Integer;)V", "refreshRefOrderStatus", "orderDetail", "Lcom/kubi/otc/entity/FiatBankCardOrder;", "exposeOrderStatus", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPayFiatOrderDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayFiatOrderDetailFragment.kt\ncom/kubi/otc/fast/PayFiatOrderDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,195:1\n147#2,16:196\n*S KotlinDebug\n*F\n+ 1 PayFiatOrderDetailFragment.kt\ncom/kubi/otc/fast/PayFiatOrderDetailFragment\n*L\n48#1:196,16\n*E\n"})
public final class PayFiatOrderDetailFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37260U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fast.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayFiatOrderDetailFragment.m44006q3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37261V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fast.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayFiatOrderDetailFragment.m44010x3(this.f37281b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f37262W = C45681e.m100799e(this, new Function1<PayFiatOrderDetailFragment, C37641k>() { // from class: com.kubi.otc.fast.PayFiatOrderDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37641k invoke(@NotNull PayFiatOrderDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37641k.m84865a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37641k, Unit>() { // from class: com.kubi.otc.fast.PayFiatOrderDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37641k it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37641k c37641k) {
            invoke(c37641k);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f37259Y = {Reflection.property1(new PropertyReference1Impl(PayFiatOrderDetailFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFastFiatDetailBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f37258X = new Companion(null);

    /* JADX INFO: compiled from: PayFiatOrderDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$Companion;", "", "<init>", "()V", "startFragment", "", "context", "Landroid/content/Context;", "orderId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void startFragment(@NotNull Context context, @Nullable String orderId) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseFragmentActivity.m56574n0(context, context.getString(R$string.otc_text_order_detail), PayFiatOrderDetailFragment.class.getName(), new C27051h().m66724h("data", C27041f.m66668h(orderId)).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.fast.PayFiatOrderDetailFragment$a */
    /* JADX INFO: compiled from: PayFiatOrderDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/fast/PayFiatOrderDetailFragment$getTradeOrderDetails$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19653a extends C24223c1 {
        public C19653a() {
            super(PayFiatOrderDetailFragment.this);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            PayFiatOrderDetailFragment.this.showNetWorkError();
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m44007u3(PayFiatOrderDetailFragment payFiatOrderDetailFragment, Disposable disposable) {
        BaseFragment.showLoadingView$default(payFiatOrderDetailFragment, 0, 0, 3, null);
        return Unit.INSTANCE;
    }

    private final String getOrderId() {
        return (String) this.f37261V.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fast_fiat_detail;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m44014t3();
    }

    /* JADX INFO: renamed from: r3 */
    public final C37641k m44012r3() {
        return (C37641k) this.f37262W.getValue(this, f37259Y[0]);
    }

    /* JADX INFO: renamed from: s3 */
    public final InterfaceC37240b m44013s3() {
        return (InterfaceC37240b) this.f37260U.getValue();
    }

    public PayFiatOrderDetailFragment() {
        setPageId("B7FastBuyOrderDetail");
    }

    /* JADX INFO: renamed from: q3 */
    public static final InterfaceC37240b m44006q3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    /* JADX INFO: renamed from: v3 */
    public static final void m44008v3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w3 */
    public static final void m44009w3(PayFiatOrderDetailFragment payFiatOrderDetailFragment, FiatBankCardOrder fiatBankCardOrder) throws JSONException {
        FeeListLayout feeListLayout;
        BaseTextView baseTextView;
        FeeListLayout feeListLayout2;
        FeeListLayout feeListLayout3;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        View view;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        View view2;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        BaseTextView baseTextView12;
        BaseTextView baseTextView13;
        String strM89945s;
        BaseTextView baseTextView14;
        BaseTextView baseTextView15;
        int i11;
        BaseTextView baseTextView16;
        int i12;
        payFiatOrderDetailFragment.showContent();
        C37641k c37641kM44012r3 = payFiatOrderDetailFragment.m44012r3();
        if (c37641kM44012r3 != null && (baseTextView16 = c37641kM44012r3.f84125w) != null) {
            if (fiatBankCardOrder.isBuyType()) {
                i12 = R$string.pay_fast_detail_bought;
            } else {
                i12 = R$string.pay_fast_detail_sold;
            }
            baseTextView16.setText(payFiatOrderDetailFragment.getString(i12));
        }
        C37641k c37641kM44012r4 = payFiatOrderDetailFragment.m44012r3();
        if (c37641kM44012r4 != null && (baseTextView15 = c37641kM44012r4.f84123u) != null) {
            if (fiatBankCardOrder.isBuyType()) {
                i11 = R$string.buy_qty;
            } else {
                i11 = R$string.sell_qty;
            }
            baseTextView15.setText(payFiatOrderDetailFragment.getString(i11));
        }
        C37641k c37641kM44012r5 = payFiatOrderDetailFragment.m44012r3();
        if (c37641kM44012r5 != null && (baseTextView14 = c37641kM44012r5.f84119q) != null) {
            baseTextView14.setText(payFiatOrderDetailFragment.getString(R$string.visa_payment_method));
        }
        C37641k c37641kM44012r6 = payFiatOrderDetailFragment.m44012r3();
        if (c37641kM44012r6 != null && (baseTextView13 = c37641kM44012r6.f84111i) != null) {
            StringBuilder sb2 = new StringBuilder();
            String fiatAmount = fiatBankCardOrder.getFiatAmount();
            if (fiatAmount != null) {
                strM89945s = C41014a.m89945s(fiatAmount, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null);
            } else {
                strM89945s = null;
            }
            sb2.append(strM89945s);
            sb2.append(' ');
            sb2.append(fiatBankCardOrder.getFiatCurrency());
            baseTextView13.setText(sb2.toString());
        }
        payFiatOrderDetailFragment.m44016z3(fiatBankCardOrder.getOrderStatus());
        Intrinsics.checkNotNull(fiatBankCardOrder);
        payFiatOrderDetailFragment.m44015y3(fiatBankCardOrder);
        C37641k c37641kM44012r7 = payFiatOrderDetailFragment.m44012r3();
        if (c37641kM44012r7 != null && (baseTextView12 = c37641kM44012r7.f84122t) != null) {
            baseTextView12.setText(new C27096v0().append(fiatBankCardOrder.getCryptoQuantity()).append(C33627eb.f69716f).m66905e(fiatBankCardOrder.getCryptoCurrency(), payFiatOrderDetailFragment.getColorRes(R$color.emphasis60)));
        }
        C37641k c37641kM44012r8 = payFiatOrderDetailFragment.m44012r3();
        if (c37641kM44012r8 != null && (baseTextView11 = c37641kM44012r8.f84121s) != null) {
            baseTextView11.setText(fiatBankCardOrder.getCryptoCurrency() + ' ' + payFiatOrderDetailFragment.getString(R$string.single_price));
        }
        C37641k c37641kM44012r9 = payFiatOrderDetailFragment.m44012r3();
        if (c37641kM44012r9 != null && (baseTextView10 = c37641kM44012r9.f84120r) != null) {
            baseTextView10.setText(new C27096v0().append(C27041f.m66669i(fiatBankCardOrder.getPrice(), "--")).append(C33627eb.f69716f).m66905e(fiatBankCardOrder.getFiatCurrency(), payFiatOrderDetailFragment.getColorRes(R$color.emphasis60)));
        }
        C37641k c37641kM44012r10 = payFiatOrderDetailFragment.m44012r3();
        if (c37641kM44012r10 != null && (baseTextView9 = c37641kM44012r10.f84112j) != null) {
            baseTextView9.setText(new C27096v0().append(C27041f.m66669i(fiatBankCardOrder.getFee(), "--")).append(C33627eb.f69716f).m66905e(fiatBankCardOrder.getFiatCurrency(), payFiatOrderDetailFragment.getColorRes(R$color.emphasis60)));
        }
        String fee = fiatBankCardOrder.getFee();
        if (fee == null || fee.length() == 0) {
            List<MultiFee> listM66560c = C27024b.m66560c(fiatBankCardOrder.getFeeMsgList());
            if (!listM66560c.isEmpty()) {
                C37641k c37641kM44012r11 = payFiatOrderDetailFragment.m44012r3();
                if (c37641kM44012r11 != null && (baseTextView2 = c37641kM44012r11.f84112j) != null) {
                    C27046k.m66700o(baseTextView2);
                }
                C37641k c37641kM44012r12 = payFiatOrderDetailFragment.m44012r3();
                if (c37641kM44012r12 != null && (feeListLayout3 = c37641kM44012r12.f84110h) != null) {
                    C27046k.m66685H(feeListLayout3);
                }
                C37641k c37641kM44012r13 = payFiatOrderDetailFragment.m44012r3();
                if (c37641kM44012r13 != null && (feeListLayout2 = c37641kM44012r13.f84110h) != null) {
                    feeListLayout2.m45500a(listM66560c);
                }
            } else {
                C37641k c37641kM44012r14 = payFiatOrderDetailFragment.m44012r3();
                if (c37641kM44012r14 != null && (baseTextView = c37641kM44012r14.f84112j) != null) {
                    C27046k.m66685H(baseTextView);
                }
                C37641k c37641kM44012r15 = payFiatOrderDetailFragment.m44012r3();
                if (c37641kM44012r15 != null && (feeListLayout = c37641kM44012r15.f84110h) != null) {
                    C27046k.m66700o(feeListLayout);
                }
            }
        }
        C37641k c37641kM44012r16 = payFiatOrderDetailFragment.m44012r3();
        if (c37641kM44012r16 != null && (baseTextView8 = c37641kM44012r16.f84118p) != null) {
            baseTextView8.setText(C27041f.m66668h(fiatBankCardOrder.getPaymentName()));
        }
        C37641k c37641kM44012r17 = payFiatOrderDetailFragment.m44012r3();
        if (c37641kM44012r17 != null && (baseTextView7 = c37641kM44012r17.f84114l) != null) {
            baseTextView7.setText(C27041f.m66668h(fiatBankCardOrder.getOrderId()));
        }
        C37641k c37641kM44012r18 = payFiatOrderDetailFragment.m44012r3();
        if (c37641kM44012r18 != null && (baseTextView6 = c37641kM44012r18.f84116n) != null) {
            baseTextView6.setText(TimeUtils.m66424k(C27039d.m66652l(fiatBankCardOrder.getCreatedAt())));
        }
        Integer orderStatus = fiatBankCardOrder.getOrderStatus();
        if (orderStatus != null && orderStatus.intValue() == 4) {
            C37641k c37641kM44012r19 = payFiatOrderDetailFragment.m44012r3();
            if (c37641kM44012r19 != null && (view2 = c37641kM44012r19.f84109g) != null) {
                C27046k.m66685H(view2);
            }
            C37641k c37641kM44012r20 = payFiatOrderDetailFragment.m44012r3();
            if (c37641kM44012r20 != null && (baseTextView5 = c37641kM44012r20.f84126x) != null) {
                baseTextView5.setText(C27041f.m66668h(fiatBankCardOrder.getDisplayErrorMsg()));
            }
            C37641k c37641kM44012r21 = payFiatOrderDetailFragment.m44012r3();
            if (c37641kM44012r21 != null && (baseTextView4 = c37641kM44012r21.f84126x) != null) {
                C27046k.m66685H(baseTextView4);
            }
        } else {
            C37641k c37641kM44012r22 = payFiatOrderDetailFragment.m44012r3();
            if (c37641kM44012r22 != null && (view = c37641kM44012r22.f84109g) != null) {
                C27046k.m66700o(view);
            }
            C37641k c37641kM44012r23 = payFiatOrderDetailFragment.m44012r3();
            if (c37641kM44012r23 != null && (baseTextView3 = c37641kM44012r23.f84126x) != null) {
                C27046k.m66700o(baseTextView3);
            }
        }
        payFiatOrderDetailFragment.m44011p3(fiatBankCardOrder);
    }

    /* JADX INFO: renamed from: x3 */
    public static final String m44010x3(PayFiatOrderDetailFragment payFiatOrderDetailFragment) {
        String strM56284y;
        Bundle arguments = payFiatOrderDetailFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "data");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    /* JADX INFO: renamed from: p3 */
    public final void m44011p3(FiatBankCardOrder fiatBankCardOrder) throws JSONException {
        String strM66668h = C27041f.m66668h(getF18762X());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paymentMethodCode", fiatBankCardOrder.getPaymentMethodCode());
        jSONObject.put("channelId", fiatBankCardOrder.getChannelId());
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e(strM66668h, "page", "failure", jSONObject);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m44014t3() {
        Observable<R> observableCompose = m44013s3().m83289a(getOrderId()).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fast.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PayFiatOrderDetailFragment.m44007u3(this.f37278b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fast.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayFiatOrderDetailFragment.m44008v3(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.otc.fast.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                PayFiatOrderDetailFragment.m44009w3(this.f37280b, (FiatBankCardOrder) obj);
            }
        }, new C19653a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: y3 */
    public final void m44015y3(FiatBankCardOrder fiatBankCardOrder) {
        RechargeOrderDetail rechargeOrderDetail;
        AlertTipsTextView alertTipsTextView;
        AlertTipsTextView alertTipsTextView2;
        AlertTipsTextView alertTipsTextView3;
        AlertTipsTextView alertTipsTextView4;
        BaseTextView baseTextView;
        Integer orderStatus = fiatBankCardOrder.getOrderStatus();
        if (orderStatus != null && orderStatus.intValue() == 2 && (rechargeOrderDetail = fiatBankCardOrder.getRechargeOrderDetail()) != null) {
            Integer rechargeOrderStatus = rechargeOrderDetail.getRechargeOrderStatus();
            if (rechargeOrderStatus != null && rechargeOrderStatus.intValue() == 1) {
                C37641k c37641kM44012r3 = m44012r3();
                if (c37641kM44012r3 != null && (baseTextView = c37641kM44012r3.f84124v) != null) {
                    baseTextView.setText(getStringRes(R$string.fast_result_failure, new Object[0]));
                    baseTextView.setTextColor(getColorRes(R$color.complementary));
                }
                C37641k c37641kM44012r4 = m44012r3();
                if (c37641kM44012r4 != null && (alertTipsTextView4 = c37641kM44012r4.f84105c) != null) {
                    alertTipsTextView4.setText(rechargeOrderDetail.getErrorReason());
                }
                C37641k c37641kM44012r5 = m44012r3();
                if (c37641kM44012r5 != null && (alertTipsTextView3 = c37641kM44012r5.f84105c) != null) {
                    C27046k.m66685H(alertTipsTextView3);
                    return;
                }
                return;
            }
            if (!StringsKt.isBlank(C27041f.m66668h(rechargeOrderDetail.getErrorReason()))) {
                C37641k c37641kM44012r6 = m44012r3();
                if (c37641kM44012r6 != null && (alertTipsTextView2 = c37641kM44012r6.f84104b) != null) {
                    alertTipsTextView2.setText(rechargeOrderDetail.getErrorReason());
                }
                C37641k c37641kM44012r7 = m44012r3();
                if (c37641kM44012r7 != null && (alertTipsTextView = c37641kM44012r7.f84104b) != null) {
                    C27046k.m66685H(alertTipsTextView);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final void m44016z3(Integer num) {
        BaseTextView baseTextView;
        C37641k c37641kM44012r3 = m44012r3();
        if (c37641kM44012r3 != null && (baseTextView = c37641kM44012r3.f84124v) != null) {
            if (num != null && num.intValue() == 1) {
                baseTextView.setText(getStringRes(R$string.fast_result_success, new Object[0]));
                baseTextView.setTextColor(ContextCompat.getColor(this.mContext, R$color.c_text));
                return;
            }
            if (num != null && num.intValue() == 2) {
                baseTextView.setText(getStringRes(R$string.fast_result_failure, new Object[0]));
                baseTextView.setTextColor(ContextCompat.getColor(this.mContext, R$color.brandRed));
                return;
            }
            if (num != null && num.intValue() == 4) {
                baseTextView.setText(getStringRes(R$string.payment_status_refunding, new Object[0]));
                baseTextView.setTextColor(ContextCompat.getColor(this.mContext, R$color.brandRed));
            } else if (num != null && num.intValue() == 5) {
                baseTextView.setText(getStringRes(R$string.payment_status_refunded, new Object[0]));
                baseTextView.setTextColor(ContextCompat.getColor(this.mContext, R$color.brandRed));
            } else {
                baseTextView.setText(getStringRes(R$string.fast_result_pending, new Object[0]));
                baseTextView.setTextColor(ContextCompat.getColor(this.mContext, R$color.c_text));
            }
        }
    }
}
