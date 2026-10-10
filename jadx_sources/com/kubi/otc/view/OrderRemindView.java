package com.kubi.otc.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.view.OrderRemindView;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.payment.p2p.data.entities.TradeInfo;
import com.kubi.utils.C27096v0;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import f00.C37304a;
import g00.InterfaceC37758j;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p419l2.C42032f;
import p778xy.C46338a;
import p778xy.C46341d;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: OrderRemindView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\fJ\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\tJ\u0017\u0010\"\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u001eH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u000f\u001a\u00060\u0010R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\u0018¨\u0006)"}, m90084d2 = {"Lcom/kubi/otc/view/OrderRemindView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mIsInAnim", "", "mIsInScroll", "mData", "Lcom/kubi/payment/p2p/data/entities/TradeInfo;", "mDisposable", "Lio/reactivex/disposables/Disposable;", "mAnimHandler", "Lcom/kubi/otc/view/OrderRemindView$AnimHandler;", "getMAnimHandler", "()Lcom/kubi/otc/view/OrderRemindView$AnimHandler;", "mAnimHandler$delegate", "Lkotlin/Lazy;", "mAnimIn", "Landroid/animation/ObjectAnimator;", "getMAnimIn", "()Landroid/animation/ObjectAnimator;", "mAnimIn$delegate", "mAnimOut", "getMAnimOut", "mAnimOut$delegate", "initView", "", "data", "startTranslationAnim", ViewProps.SCROLL, "startCountDown", "expireTime", "", "(Ljava/lang/Long;)V", "endCountDown", "Companion", "AnimHandler", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderRemindView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderRemindView.kt\ncom/kubi/otc/view/OrderRemindView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,229:1\n1#2:230\n*E\n"})
public final class OrderRemindView extends FrameLayout {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Companion f38160i = new Companion(null);

    /* JADX INFO: renamed from: b */
    public boolean f38161b;

    /* JADX INFO: renamed from: c */
    public boolean f38162c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public TradeInfo f38163d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Disposable f38164e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Lazy f38165f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f38166g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Lazy f38167h;

    /* JADX INFO: compiled from: OrderRemindView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/otc/view/OrderRemindView$Companion;", "", "<init>", "()V", "ANIM_IN_MSG", "", "ANIM_OUT_MSG", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.view.OrderRemindView$a */
    /* JADX INFO: compiled from: OrderRemindView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/otc/view/OrderRemindView$AnimHandler;", "Landroid/os/Handler;", "<init>", "(Lcom/kubi/otc/view/OrderRemindView;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SuppressLint({"HandlerLeak"})
    public final class HandlerC20288a extends Handler {
        public HandlerC20288a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            super.handleMessage(msg);
            int i11 = msg.what;
            if (i11 == 1000) {
                OrderRemindView.this.getMAnimIn().start();
            } else {
                if (i11 != 2000) {
                    return;
                }
                if (OrderRemindView.this.f38162c) {
                    sendEmptyMessageDelayed(2000, 1000L);
                } else {
                    OrderRemindView.this.getMAnimOut().start();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.view.OrderRemindView$b */
    /* JADX INFO: compiled from: OrderRemindView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/view/OrderRemindView$mAnimIn$2$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20289b extends AnimatorListenerAdapter {
        public C20289b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationEnd(animation);
            HandlerC20288a mAnimHandler = OrderRemindView.this.getMAnimHandler();
            mAnimHandler.removeMessages(2000);
            mAnimHandler.sendEmptyMessageDelayed(2000, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.view.OrderRemindView$c */
    /* JADX INFO: compiled from: OrderRemindView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/view/OrderRemindView$mAnimOut$2$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20290c extends AnimatorListenerAdapter {
        public C20290c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationEnd(animation);
            OrderRemindView.this.f38161b = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderRemindView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f38165f = LazyKt.lazy(new Function0() { // from class: mt.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderRemindView.m45544t(this.f94354b);
            }
        });
        this.f38166g = LazyKt.lazy(new Function0() { // from class: mt.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderRemindView.m45545u(this.f94362b);
            }
        });
        this.f38167h = LazyKt.lazy(new Function0() { // from class: mt.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderRemindView.m45546v(this.f94364b);
            }
        });
        LayoutInflater.from(context).inflate(R$layout.botc_view_remind, this);
        C27046k.m66711z(this, 0L, new Function0() { // from class: mt.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderRemindView.m45538l(this.f94368b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: C */
    public static final Long m45525C(Long l11, Long t11) {
        Intrinsics.checkNotNullParameter(t11, "t");
        if (l11 != null) {
            return Long.valueOf(l11.longValue() - (t11.longValue() * ((long) 1000)));
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static final Long m45526D(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Long) function1.invoke(p11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HandlerC20288a getMAnimHandler() {
        return (HandlerC20288a) this.f38165f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ObjectAnimator getMAnimIn() {
        return (ObjectAnimator) this.f38166g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ObjectAnimator getMAnimOut() {
        return (ObjectAnimator) this.f38167h.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX INFO: renamed from: l */
    public static final Unit m45538l(OrderRemindView orderRemindView) {
        TradeInfo tradeInfo = orderRemindView.f38163d;
        if (C27039d.m66650j(tradeInfo != null ? tradeInfo.getOrderNumber() : null) == 1) {
            C37304a c37304a = C37304a.f82764a;
            TradeInfo tradeInfo2 = orderRemindView.f38163d;
            String strM66668h = C27041f.m66668h(tradeInfo2 != null ? tradeInfo2.getOrderId() : null);
            TradeInfo tradeInfo3 = orderRemindView.f38163d;
            long j11 = 1;
            if (C27025c.m66566d(tradeInfo3 != null ? tradeInfo3.isMerchant() : null)) {
                TradeInfo tradeInfo4 = orderRemindView.f38163d;
                if (C27025c.m66566d(tradeInfo4 != null ? Boolean.valueOf(tradeInfo4.isBuy()) : null)) {
                    j11 = 0;
                }
            } else {
                TradeInfo tradeInfo5 = orderRemindView.f38163d;
                if (!C27025c.m66566d(tradeInfo5 != null ? Boolean.valueOf(tradeInfo5.isBuy()) : null)) {
                    j11 = 0;
                }
            }
            InterfaceC37758j.a.m85164m(c37304a, j11, strM66668h, null, null, null, null, 60, null);
        } else {
            InterfaceC37758j.a.m85165n(C37304a.f82764a, 1L, null, null, null, null, 30, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final HandlerC20288a m45544t(OrderRemindView orderRemindView) {
        return orderRemindView.new HandlerC20288a();
    }

    /* JADX INFO: renamed from: u */
    public static final ObjectAnimator m45545u(OrderRemindView orderRemindView) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(orderRemindView.findViewById(R$id.view_remind), "translationX", orderRemindView.getMeasuredWidth() - C27029c.m66601d(orderRemindView, 42)).setDuration(500L);
        duration.addListener(orderRemindView.new C20289b());
        return duration;
    }

    /* JADX INFO: renamed from: v */
    public static final ObjectAnimator m45546v(OrderRemindView orderRemindView) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(orderRemindView.findViewById(R$id.view_remind), "translationX", 0.0f).setDuration(500L);
        duration.addListener(orderRemindView.new C20290c());
        return duration;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m45547x(OrderRemindView orderRemindView, Long l11) {
        TextView textView = (TextView) orderRemindView.findViewById(R$id.tv_order_time);
        if (textView != null) {
            textView.setText("(" + TimeUtils.m66417d(C27039d.m66652l(l11)) + ")");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public final void m45550E(boolean z11) {
        this.f38162c = z11;
        if (!z11 || getMeasuredWidth() == 0) {
            return;
        }
        if (!this.f38161b) {
            this.f38161b = true;
            getMAnimHandler().sendEmptyMessage(1000);
            return;
        }
        HandlerC20288a mAnimHandler = getMAnimHandler();
        if (mAnimHandler.hasMessages(2000)) {
            mAnimHandler.removeMessages(2000);
            mAnimHandler.sendEmptyMessageDelayed(2000, 1000L);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m45551r() {
        Disposable disposable = this.f38164e;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m45552s(@NotNull TradeInfo data) {
        Context context;
        int i11;
        String string;
        Context context2;
        int i12;
        Intrinsics.checkNotNullParameter(data, "data");
        this.f38163d = data;
        if (C27039d.m66650j(data.getOrderNumber()) <= 0) {
            C27046k.m66700o(this);
            return;
        }
        C46341d c46341dM102152b = C46338a.m102152b(this);
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(data.getDigitalCurrency()));
        c46341dM102152b.mo6634v(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null).mo92186a0(200, 200).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(R$mipmap.kucoin_icon_default_icon)).m6594E0((ImageView) findViewById(R$id.iv_order_icon));
        int i13 = R$id.tv_order_time;
        View viewFindViewById = findViewById(i13);
        if (viewFindViewById != null) {
            C27046k.m66700o(viewFindViewById);
        }
        m45551r();
        if (C27039d.m66650j(data.getOrderNumber()) > 1) {
            C27046k.m66685H(this);
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            int iM66650j = C27039d.m66650j(data.getOrderNumber());
            sb2.append(iM66650j <= 9 ? String.valueOf(iM66650j) : "9+");
            sb2.append(')');
            String string2 = sb2.toString();
            TextView textView = (TextView) findViewById(R$id.tv_order_name);
            if (textView != null) {
                C27096v0 c27096v0Append = new C27096v0().append(getContext().getString(R$string.order));
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                textView.setText(c27096v0Append.m66905e(string2, C27046k.m66699n(context3, R$color.primary)));
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(data.getAppealingStatus(), OrderDetailInfo.APPEAL_STATUS_APPEALING)) {
            C27046k.m66685H(this);
            TextView textView2 = (TextView) findViewById(R$id.tv_order_name);
            if (textView2 != null) {
                textView2.setText(getContext().getString(R$string.appealing));
                return;
            }
            return;
        }
        String orderStatus = data.getOrderStatus();
        if (!Intrinsics.areEqual(orderStatus, "CREATED")) {
            if (!Intrinsics.areEqual(orderStatus, OrderDetailInfo.ORDER_STATUS_PAYED_MONEY)) {
                C27046k.m66700o(this);
                return;
            }
            C27046k.m66685H(this);
            TextView textView3 = (TextView) findViewById(R$id.tv_order_name);
            if (textView3 != null) {
                textView3.setText(getContext().getString(R$string.otc_float_wait_release));
                return;
            }
            return;
        }
        C27046k.m66685H(this);
        TextView textView4 = (TextView) findViewById(i13);
        if (textView4 != null) {
            C27046k.m66685H(textView4);
        }
        m45553w(data.getAutoCancelOrderExpire());
        if (textView4 != null) {
            TradeInfo tradeInfo = this.f38163d;
            if (C27025c.m66566d(tradeInfo != null ? tradeInfo.isMerchant() : null)) {
                if (data.isBuy()) {
                    context2 = getContext();
                    i12 = R$string.otc_float_wait_gather;
                } else {
                    context2 = getContext();
                    i12 = R$string.otc_float_wait_pay;
                }
                string = context2.getString(i12);
            } else {
                if (data.isBuy()) {
                    context = getContext();
                    i11 = R$string.otc_float_wait_pay;
                } else {
                    context = getContext();
                    i11 = R$string.otc_float_wait_gather;
                }
                string = context.getString(i11);
            }
            textView4.setText(string);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final void m45523A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B */
    public static final void m45524B(OrderRemindView orderRemindView) {
        C27046k.m66700o(orderRemindView);
    }

    /* JADX INFO: renamed from: y */
    public static final void m45548y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m45549z(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public final void m45553w(final Long l11) {
        if (C27039d.m66652l(l11) <= 0) {
            C27046k.m66700o(this);
            return;
        }
        Disposable disposable = this.f38164e;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable<Long> observableTake = Observable.interval(0L, 1000L, TimeUnit.MILLISECONDS).take((C27039d.m66652l(l11) / ((long) 1000)) + 1);
        final Function1 function1 = new Function1() { // from class: mt.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderRemindView.m45525C(l11, (Long) obj);
            }
        };
        Observable observableObserveOn = observableTake.map(new Function() { // from class: mt.o
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OrderRemindView.m45526D(function1, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function2 = new Function1() { // from class: mt.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderRemindView.m45547x(this.f94375b, (Long) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: mt.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderRemindView.m45548y(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: mt.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderRemindView.m45549z((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: mt.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderRemindView.m45523A(function3, obj);
            }
        }, new Action() { // from class: mt.j
            @Override // io.reactivex.functions.Action
            public final void run() {
                OrderRemindView.m45524B(this.f94358b);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        this.f38164e = DisposableKt.addTo(disposableSubscribe, C27046k.m66696k(this));
    }
}
