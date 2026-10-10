package com.kubi.payment.p2p.order;

/* JADX INFO: compiled from: OrderDetailViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 w2\u00020\u0001:\u0001wB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010Q\u001a\u00020R2\u0006\u0010&\u001a\u00020'2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\b2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\"J\u0010\u00100\u001a\u00020R2\b\b\u0002\u0010S\u001a\u00020\bJ \u0010T\u001a\u00020R2\u0006\u0010U\u001a\u00020\"2\u0006\u0010V\u001a\u00020\"2\u0006\u0010W\u001a\u00020/H\u0002J\u0018\u0010Z\u001a\u00020R2\u0006\u0010\\\u001a\u00020\"2\b\b\u0002\u0010]\u001a\u00020\"J\u0006\u0010^\u001a\u00020RJ\u0010\u0010_\u001a\u00020R2\b\b\u0002\u0010`\u001a\u00020\"J\u0006\u0010a\u001a\u00020RJ\u0006\u0010\u0017\u001a\u00020RJ\u0006\u0010b\u001a\u00020RJ\u0006\u0010\u001e\u001a\u00020RJ\u0006\u0010c\u001a\u00020dJ\b\u0010e\u001a\u00020RH\u0002J\b\u0010f\u001a\u00020RH\u0002J\u0006\u0010g\u001a\u00020RJ\u0010\u0010h\u001a\u00020R2\b\b\u0002\u0010i\u001a\u00020\bJ\u000e\u0010j\u001a\u00020RH\u0082@¢\u0006\u0002\u0010kJ\u0014\u0010l\u001a\b\u0012\u0004\u0012\u00020#0>H\u0082@¢\u0006\u0002\u0010kJ \u0010m\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0>0!H\u0082@¢\u0006\u0002\u0010kJ\u0006\u0010o\u001a\u00020RJ\b\u0010p\u001a\u00020RH\u0014J\u0010\u0010q\u001a\u00020R2\u0006\u0010r\u001a\u00020'H\u0007J\u0010\u0010s\u001a\u00020R2\u0006\u0010t\u001a\u00020\"H\u0007J\u001c\u0010u\u001a\u00020R2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\fR\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b6\u0010\fR\u001c\u00107\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010D\"\u0004\bH\u0010FR\u001a\u0010I\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010D\"\u0004\bK\u0010FR\u001a\u0010L\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010D\"\u0004\bM\u0010FR\u001a\u0010N\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010D\"\u0004\bO\u0010FR\u0010\u0010P\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\n8F¢\u0006\u0006\u001a\u0004\b[\u0010\f¨\u0006x"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/OrderDetailViewModel;", "Lcom/kubi/payment/base/BaseViewModel;", "repository", "Lcom/kubi/payment/p2p/data/source/IP2PRepository;", "<init>", "(Lcom/kubi/payment/p2p/data/source/IP2PRepository;)V", "_notifyDetailView", "Landroidx/lifecycle/MutableLiveData;", "", "notifyDetailView", "Landroidx/lifecycle/LiveData;", "getNotifyDetailView", "()Landroidx/lifecycle/LiveData;", "_notifyLooperInfo", "notifyLooperInfo", "getNotifyLooperInfo", "_notifyPayTypeView", "notifyPayTypeView", "getNotifyPayTypeView", "_notifyChatRedDot", "notifyChatRedDot", "getNotifyChatRedDot", "_notifyPayCoin", "notifyPayCoin", "getNotifyPayCoin", "_autoCancelOrderTime", "", "autoCancelOrderTime", "getAutoCancelOrderTime", "_startPayCoinLeftTime", "startPayCoinLeftTime", "getStartPayCoinLeftTime", "payTypeTemplateMap", "", "", "Lcom/kubi/otc/entity/PayTypeEntity;", "orderId", "isRedRemind", "iView", "Lcom/kubi/sdk/base/ui/IView;", "chatHelper", "Lcom/kubi/payment/chat/OrderChatHelper;", "getChatHelper", "()Lcom/kubi/payment/chat/OrderChatHelper;", "setChatHelper", "(Lcom/kubi/payment/chat/OrderChatHelper;)V", "orderInfo", "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;", "getOrderInfo", "()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;", "setOrderInfo", "(Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;)V", "_needRemind", "needRemind", "getNeedRemind", "currentPayType", "Lcom/kubi/otc/entity/AdPayType;", "getCurrentPayType", "()Lcom/kubi/otc/entity/AdPayType;", "setCurrentPayType", "(Lcom/kubi/otc/entity/AdPayType;)V", "payTypes", "", "getPayTypes", "()Ljava/util/List;", "setPayTypes", "(Ljava/util/List;)V", "isCancelAutoCancelOrderTime", "()Z", "setCancelAutoCancelOrderTime", "(Z)V", "isAutoCancelOrderTiming", "setAutoCancelOrderTiming", "hasConsultSuccessConfirmInfoView", "getHasConsultSuccessConfirmInfoView", "setHasConsultSuccessConfirmInfoView", "isCancelPayCoinLeftTime", "setCancelPayCoinLeftTime", "isPayCoinLeftTiming", "setPayCoinLeftTiming", "preSpmId", "initData", "", "isFirst", "trackOrderStatus", "newStatus", "newExpressStatus", "response", "_releaseCrypto", "Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;", "releaseCrypto", "getReleaseCrypto", "url", "validationToken", "cancelAppeal", "consentAppeal", "content", "rejectAppeal", "startAutoCancelOrderTime", "getTransferOrderInfo", "Lcom/kubi/payment/p2p/data/entities/TransferOrderInfo;", "initPayType", "initChat", "resetPayTypes", "notifyRedRemind", "isRemind", "refreshPayTypes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPayTypeList", "getPayTypeTemplateList", "Lcom/kubi/otc/entity/PayTemplate;", "markPaymentMethod", "onCleared", "setView", "view", "setOrderId", "id", "setPayTypeTemplateMap", "map", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nOrderDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDetailViewModel.kt\ncom/kubi/payment/p2p/order/OrderDetailViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,561:1\n1563#2:562\n1634#2,3:563\n*S KotlinDebug\n*F\n+ 1 OrderDetailViewModel.kt\ncom/kubi/payment/p2p/order/OrderDetailViewModel\n*L\n478#1:562\n478#1:563,3\n*E\n"})
public final class OrderDetailViewModel extends p477nt.C42874g {

    /* JADX INFO: renamed from: v0 */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.payment.p2p.order.OrderDetailViewModel.Companion f39730v0 = null;

    /* JADX INFO: renamed from: X */
    @org.jetbrains.annotations.NotNull
    public final com.kubi.payment.p2p.data.source.InterfaceC21080a f39731X;

    /* JADX INFO: renamed from: Y */
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> f39732Y;

    /* JADX INFO: renamed from: Z */
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> f39733Z;

    /* JADX INFO: renamed from: a0 */
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> f39734a0;

    /* JADX INFO: renamed from: b0 */
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> f39735b0;

    /* JADX INFO: renamed from: c0 */
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> f39736c0;

    /* JADX INFO: renamed from: d0 */
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> f39737d0;

    /* JADX INFO: renamed from: e0 */
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> f39738e0;

    /* JADX INFO: renamed from: f0 */
    @org.jetbrains.annotations.NotNull
    public java.util.Map<java.lang.String, com.kubi.otc.entity.PayTypeEntity> f39739f0;

    /* JADX INFO: renamed from: g0 */
    @org.jetbrains.annotations.NotNull
    public java.lang.String f39740g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f39741h0;

    /* JADX INFO: renamed from: i0 */
    @org.jetbrains.annotations.Nullable
    public com.kubi.sdk.base.p113ui.InterfaceC23686g f39742i0;

    /* JADX INFO: renamed from: j0 */
    @org.jetbrains.annotations.Nullable
    public com.kubi.payment.chat.OrderChatHelper f39743j0;

    /* JADX INFO: renamed from: k0 */
    @org.jetbrains.annotations.Nullable
    public com.kubi.payment.p2p.data.entities.OrderDetailInfo f39744k0;

    /* JADX INFO: renamed from: l0 */
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> f39745l0;

    /* JADX INFO: renamed from: m0 */
    @org.jetbrains.annotations.Nullable
    public com.kubi.otc.entity.AdPayType f39746m0;

    /* JADX INFO: renamed from: n0 */
    @org.jetbrains.annotations.Nullable
    public java.util.List<com.kubi.otc.entity.AdPayType> f39747n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f39748o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f39749p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f39750q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f39751r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f39752s0;

    /* JADX INFO: renamed from: t0 */
    @org.jetbrains.annotations.Nullable
    public java.lang.String f39753t0;

    /* JADX INFO: renamed from: u0 */
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.kubi.payment.p2p.data.entities.ReleaseCrypto> f39754u0;

    /* JADX INFO: compiled from: OrderDetailViewModel.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/OrderDetailViewModel$Companion;", "", "<init>", "()V", "TIME_ZERO", "", "TIME_MILLIS", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.kubi.payment.p2p.order.OrderDetailViewModel$Companion r0 = new com.kubi.payment.p2p.order.OrderDetailViewModel$Companion
            r1 = 0
            r0.<init>(r1)
            com.kubi.payment.p2p.order.OrderDetailViewModel.f39730v0 = r0
            return
    }

    public OrderDetailViewModel(@org.jetbrains.annotations.NotNull com.kubi.payment.p2p.data.source.InterfaceC21080a r2) {
            r1 = this;
            java.lang.String r0 = "repository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.f39731X = r2
            androidx.lifecycle.MutableLiveData r2 = new androidx.lifecycle.MutableLiveData
            r2.<init>()
            r1.f39732Y = r2
            androidx.lifecycle.MutableLiveData r2 = new androidx.lifecycle.MutableLiveData
            r2.<init>()
            r1.f39733Z = r2
            androidx.lifecycle.MutableLiveData r2 = new androidx.lifecycle.MutableLiveData
            r2.<init>()
            r1.f39734a0 = r2
            androidx.lifecycle.MutableLiveData r2 = new androidx.lifecycle.MutableLiveData
            r2.<init>()
            r1.f39735b0 = r2
            androidx.lifecycle.MutableLiveData r2 = new androidx.lifecycle.MutableLiveData
            r2.<init>()
            r1.f39736c0 = r2
            androidx.lifecycle.MutableLiveData r2 = new androidx.lifecycle.MutableLiveData
            r2.<init>()
            r1.f39737d0 = r2
            androidx.lifecycle.MutableLiveData r2 = new androidx.lifecycle.MutableLiveData
            r2.<init>()
            r1.f39738e0 = r2
            java.util.Map r2 = kotlin.collections.MapsKt.emptyMap()
            r1.f39739f0 = r2
            java.lang.String r2 = ""
            r1.f39740g0 = r2
            androidx.lifecycle.MutableLiveData r2 = new androidx.lifecycle.MutableLiveData
            r2.<init>()
            r1.f39745l0 = r2
            androidx.lifecycle.MutableLiveData r2 = new androidx.lifecycle.MutableLiveData
            r2.<init>()
            r1.f39754u0 = r2
            return
    }

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ androidx.lifecycle.MutableLiveData m48730A(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.f39732Y
            return r0
    }

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ androidx.lifecycle.MutableLiveData m48731B(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.f39733Z
            return r0
    }

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ androidx.lifecycle.MutableLiveData m48732C(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.f39736c0
            return r0
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m48733C0(com.kubi.payment.p2p.order.OrderDetailViewModel r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r0.m48757B0(r1, r2)
            return
    }

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ androidx.lifecycle.MutableLiveData m48734D(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.f39734a0
            return r0
    }

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ androidx.lifecycle.MutableLiveData m48735E(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            androidx.lifecycle.MutableLiveData<com.kubi.payment.p2p.data.entities.ReleaseCrypto> r0 = r0.f39754u0
            return r0
    }

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ androidx.lifecycle.MutableLiveData m48736F(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            androidx.lifecycle.MutableLiveData<java.lang.Long> r0 = r0.f39738e0
            return r0
    }

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ androidx.lifecycle.MutableLiveData m48737G(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            androidx.lifecycle.MutableLiveData r0 = r0.m94035p()
            return r0
    }

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ void m48738H(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            r0.m48789i0()
            return
    }

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ void m48739I(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            r0.m48791m0()
            return
    }

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ java.lang.Object m48740J(com.kubi.payment.p2p.order.OrderDetailViewModel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.m48797z0(r1)
            return r0
    }

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ void m48741K(com.kubi.payment.p2p.order.OrderDetailViewModel r0, java.util.Map r1) {
            r0.f39739f0 = r1
            return
    }

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ void m48742L(com.kubi.payment.p2p.order.OrderDetailViewModel r0, java.lang.String r1, java.lang.String r2, com.kubi.payment.p2p.data.entities.OrderDetailInfo r3) {
            r0.m48770N0(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m48743O(com.kubi.payment.p2p.order.OrderDetailViewModel r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r0.m48769N(r1)
            return
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m48744b0(com.kubi.payment.p2p.order.OrderDetailViewModel r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.m48782a0(r1)
            return
    }

    /* JADX INFO: renamed from: j0 */
    public static final kotlin.Unit m48745j0(com.kubi.payment.p2p.order.OrderDetailViewModel r2, boolean r3) {
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r2.f39735b0
            boolean r1 = r2.f39741h0
            if (r1 == 0) goto L18
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r2 = r2.f39744k0
            if (r2 == 0) goto Lf
            java.lang.String r2 = r2.getAdRemarks()
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L18
            int r2 = r2.length()
            if (r2 != 0) goto L22
        L18:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            boolean r2 = com.kubi.utils.extensions.C27025c.m66566d(r2)
            if (r2 == 0) goto L24
        L22:
            r2 = 1
            goto L25
        L24:
            r2 = 0
        L25:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.setValue(r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ kotlin.Unit m48746r(com.kubi.payment.p2p.order.OrderDetailViewModel r0, boolean r1) {
            kotlin.Unit r0 = m48745j0(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ com.kubi.sdk.base.p113ui.InterfaceC23686g m48747s(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            com.kubi.sdk.base.ui.g r0 = r0.f39742i0
            return r0
    }

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ java.lang.String m48748t(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            java.lang.String r0 = r0.f39740g0
            return r0
    }

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ java.lang.Object m48749u(com.kubi.payment.p2p.order.OrderDetailViewModel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.m48783c0(r1)
            return r0
    }

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ java.lang.Object m48750v(com.kubi.payment.p2p.order.OrderDetailViewModel r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.m48784d0(r1)
            return r0
    }

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ com.kubi.payment.p2p.data.source.InterfaceC21080a m48751w(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            com.kubi.payment.p2p.data.source.a r0 = r0.f39731X
            return r0
    }

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ androidx.lifecycle.MutableLiveData m48752x(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            androidx.lifecycle.MutableLiveData<java.lang.Long> r0 = r0.f39737d0
            return r0
    }

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ androidx.lifecycle.MutableLiveData m48753y(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            androidx.lifecycle.MutableLiveData r0 = r0.m94034o()
            return r0
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m48754y0(com.kubi.payment.p2p.order.OrderDetailViewModel r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.m48796x0(r1)
            return
    }

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ androidx.lifecycle.MutableLiveData m48755z(com.kubi.payment.p2p.order.OrderDetailViewModel r0) {
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.f39745l0
            return r0
    }

    /* JADX INFO: renamed from: A0 */
    public final void m48756A0() {
            r8 = this;
            androidx.lifecycle.MutableLiveData r0 = r8.m94034o()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            kotlinx.coroutines.m0 r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r8)
            com.kubi.payment.p2p.order.OrderDetailViewModel$rejectAppeal$1 r5 = new com.kubi.payment.p2p.order.OrderDetailViewModel$rejectAppeal$1
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.C41686h.m91046d(r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: B0 */
    public final void m48757B0(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "validationToken"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlinx.coroutines.m0 r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r7)
            com.kubi.payment.p2p.order.OrderDetailViewModel$releaseCrypto$1 r4 = new com.kubi.payment.p2p.order.OrderDetailViewModel$releaseCrypto$1
            r0 = 0
            r4.<init>(r7, r9, r8, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.C41686h.m91046d(r1, r2, r3, r4, r5, r6)
            return
    }

    /* JADX INFO: renamed from: D0 */
    public final void m48758D0() {
            r6 = this;
            kotlinx.coroutines.m0 r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            com.kubi.payment.p2p.order.OrderDetailViewModel$resetPayTypes$1 r3 = new com.kubi.payment.p2p.order.OrderDetailViewModel$resetPayTypes$1
            r1 = 0
            r3.<init>(r6, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.C41686h.m91046d(r0, r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: E0 */
    public final void m48759E0(boolean r1) {
            r0 = this;
            r0.f39749p0 = r1
            return
    }

    /* JADX INFO: renamed from: F0 */
    public final void m48760F0(boolean r1) {
            r0 = this;
            r0.f39748o0 = r1
            return
    }

    /* JADX INFO: renamed from: G0 */
    public final void m48761G0(boolean r1) {
            r0 = this;
            r0.f39751r0 = r1
            return
    }

    /* JADX INFO: renamed from: H0 */
    public final void m48762H0(@org.jetbrains.annotations.Nullable com.kubi.otc.entity.AdPayType r1) {
            r0 = this;
            r0.f39746m0 = r1
            return
    }

    /* JADX INFO: renamed from: I0 */
    public final void m48763I0(boolean r1) {
            r0 = this;
            r0.f39750q0 = r1
            return
    }

    /* JADX INFO: renamed from: J0 */
    public final void m48764J0(@org.jetbrains.annotations.Nullable com.kubi.payment.p2p.data.entities.OrderDetailInfo r1) {
            r0 = this;
            r0.f39744k0 = r1
            return
    }

    /* JADX INFO: renamed from: K0 */
    public final void m48765K0(boolean r1) {
            r0 = this;
            r0.f39752s0 = r1
            return
    }

    /* JADX INFO: renamed from: L0 */
    public final void m48766L0() {
            r8 = this;
            boolean r0 = r8.f39749p0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r8.f39749p0 = r0
            r0 = 0
            r8.f39748o0 = r0
            kotlin.jvm.internal.Ref$LongRef r0 = new kotlin.jvm.internal.Ref$LongRef
            r0.<init>()
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r1 = r8.f39744k0
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.Long r1 = r1.getAutoCancelOrderExpire()
            goto L1b
        L1a:
            r1 = r2
        L1b:
            long r3 = com.kubi.utils.extensions.C27039d.m66652l(r1)
            r0.element = r3
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L31
            androidx.lifecycle.MutableLiveData<java.lang.Long> r0 = r8.f39737d0
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0.setValue(r1)
            return
        L31:
            r1 = r2
            kotlinx.coroutines.m0 r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r8)
            com.kubi.payment.p2p.order.OrderDetailViewModel$startAutoCancelOrderTime$1 r5 = new com.kubi.payment.p2p.order.OrderDetailViewModel$startAutoCancelOrderTime$1
            r5.<init>(r0, r8, r1)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.C41686h.m91046d(r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: M */
    public final void m48767M() {
            r8 = this;
            androidx.lifecycle.MutableLiveData r0 = r8.m94034o()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            kotlinx.coroutines.m0 r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r8)
            com.kubi.payment.p2p.order.OrderDetailViewModel$cancelAppeal$1 r5 = new com.kubi.payment.p2p.order.OrderDetailViewModel$cancelAppeal$1
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.C41686h.m91046d(r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: M0 */
    public final void m48768M0() {
            r8 = this;
            boolean r0 = r8.f39752s0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r8.f39752s0 = r0
            r0 = 0
            r8.f39751r0 = r0
            kotlin.jvm.internal.Ref$LongRef r0 = new kotlin.jvm.internal.Ref$LongRef
            r0.<init>()
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r1 = r8.f39744k0
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.Long r1 = r1.getAvgPayCoinLeftTime()
            goto L1b
        L1a:
            r1 = r2
        L1b:
            long r3 = com.kubi.utils.extensions.C27039d.m66652l(r1)
            r0.element = r3
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L31
            androidx.lifecycle.MutableLiveData<java.lang.Long> r0 = r8.f39738e0
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0.setValue(r1)
            return
        L31:
            r1 = r2
            kotlinx.coroutines.m0 r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r8)
            com.kubi.payment.p2p.order.OrderDetailViewModel$startPayCoinLeftTime$1 r5 = new com.kubi.payment.p2p.order.OrderDetailViewModel$startPayCoinLeftTime$1
            r5.<init>(r0, r8, r1)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.C41686h.m91046d(r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: N */
    public final void m48769N(@org.jetbrains.annotations.NotNull java.lang.String r9) {
            r8 = this;
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            androidx.lifecycle.MutableLiveData r0 = r8.m94034o()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            kotlinx.coroutines.m0 r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r8)
            com.kubi.payment.p2p.order.OrderDetailViewModel$consentAppeal$1 r5 = new com.kubi.payment.p2p.order.OrderDetailViewModel$consentAppeal$1
            r0 = 0
            r5.<init>(r8, r9, r0)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.C41686h.m91046d(r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: N0 */
    public final void m48770N0(java.lang.String r11, java.lang.String r12, com.kubi.payment.p2p.data.entities.OrderDetailInfo r13) {
            r10 = this;
            int r0 = r11.length()
            r1 = 0
            if (r0 <= 0) goto L1b
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r0 = r10.f39744k0
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.getStatus()
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r0 = com.kubi.utils.extensions.C27041f.m66668h(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r0)
            if (r0 == 0) goto L3b
        L1b:
            int r12 = r12.length()
            if (r12 <= 0) goto Lc9
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r12 = r10.f39744k0
            if (r12 == 0) goto L30
            com.kubi.payment.p2p.data.entities.OrderDetailInfo$ExpressInfo r12 = r12.getExpressInfo()
            if (r12 == 0) goto L30
            java.lang.String r12 = r12.getStatus()
            goto L31
        L30:
            r12 = r1
        L31:
            java.lang.String r12 = com.kubi.utils.extensions.C27041f.m66668h(r12)
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r12)
            if (r11 != 0) goto Lc9
        L3b:
            java.lang.String r11 = r13.getLegalCurrency()
            java.lang.String r11 = com.kubi.utils.extensions.C27041f.m66668h(r11)
            java.lang.String r12 = "pay_fiat_currency"
            kotlin.Pair r2 = kotlin.TuplesKt.m90091to(r12, r11)
            java.lang.String r11 = r13.getCurrency()
            java.lang.String r11 = com.kubi.utils.extensions.C27041f.m66668h(r11)
            java.lang.String r12 = "pay_crypto_currency"
            kotlin.Pair r3 = kotlin.TuplesKt.m90091to(r12, r11)
            java.lang.String r11 = r13.getStatus()
            java.lang.String r11 = com.kubi.utils.extensions.C27041f.m66668h(r11)
            java.lang.String r12 = "status"
            kotlin.Pair r4 = kotlin.TuplesKt.m90091to(r12, r11)
            com.kubi.payment.p2p.data.entities.OrderDetailInfo$ExpressInfo r11 = r13.getExpressInfo()
            if (r11 == 0) goto L70
            java.lang.String r11 = r11.getStatus()
            goto L71
        L70:
            r11 = r1
        L71:
            java.lang.String r11 = com.kubi.utils.extensions.C27041f.m66668h(r11)
            java.lang.String r12 = "express_status"
            kotlin.Pair r5 = kotlin.TuplesKt.m90091to(r12, r11)
            java.lang.Boolean r11 = r13.getBuyerRole()
            boolean r11 = com.kubi.utils.extensions.C27025c.m66566d(r11)
            if (r11 == 0) goto L88
            java.lang.String r11 = "buy"
            goto L8a
        L88:
            java.lang.String r11 = "sell"
        L8a:
            java.lang.String r12 = "pay_side"
            kotlin.Pair r6 = kotlin.TuplesKt.m90091to(r12, r11)
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r11 = r10.f39744k0
            if (r11 == 0) goto L9c
            boolean r11 = r11.isP2PExpress()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
        L9c:
            boolean r11 = com.kubi.utils.extensions.C27025c.m66566d(r1)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            java.lang.String r12 = "isP2PExpress"
            kotlin.Pair r7 = kotlin.TuplesKt.m90091to(r12, r11)
            java.lang.String r11 = r10.f39753t0
            java.lang.String r11 = com.kubi.utils.extensions.C27041f.m66668h(r11)
            java.lang.String r12 = "pre_spm_id"
            kotlin.Pair r8 = kotlin.TuplesKt.m90091to(r12, r11)
            java.lang.String r11 = "norm_version"
            java.lang.String r12 = "1"
            kotlin.Pair r9 = kotlin.TuplesKt.m90091to(r11, r12)
            kotlin.Pair[] r11 = new kotlin.Pair[]{r2, r3, r4, r5, r6, r7, r8, r9}
            java.lang.String r13 = "B7P2POrderDetails"
            java.lang.String r0 = "page"
            p569qq.C43852m.m96594f(r13, r0, r12, r11)
        Lc9:
            return
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: P */
    public final androidx.lifecycle.LiveData<java.lang.Long> m48771P() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.Long> r0 = r1.f39737d0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: Q */
    public final com.kubi.payment.chat.OrderChatHelper m48772Q() {
            r1 = this;
            com.kubi.payment.chat.OrderChatHelper r0 = r1.f39743j0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: R */
    public final com.kubi.otc.entity.AdPayType m48773R() {
            r1 = this;
            com.kubi.otc.entity.AdPayType r0 = r1.f39746m0
            return r0
    }

    /* JADX INFO: renamed from: S */
    public final boolean m48774S() {
            r1 = this;
            boolean r0 = r1.f39750q0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: T */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> m48775T() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r1.f39745l0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: U */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> m48776U() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r1.f39735b0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: V */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> m48777V() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r1.f39732Y
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: W */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> m48778W() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r1.f39733Z
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: X */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> m48779X() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r1.f39736c0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: Y */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> m48780Y() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r1.f39734a0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: Z */
    public final com.kubi.payment.p2p.data.entities.OrderDetailInfo m48781Z() {
            r1 = this;
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r0 = r1.f39744k0
            return r0
    }

    /* JADX INFO: renamed from: a0 */
    public final void m48782a0(boolean r7) {
            r6 = this;
            kotlinx.coroutines.m0 r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            com.kubi.payment.p2p.order.OrderDetailViewModel$getOrderInfo$1 r3 = new com.kubi.payment.p2p.order.OrderDetailViewModel$getOrderInfo$1
            r1 = 0
            r3.<init>(r6, r7, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.C41686h.m91046d(r0, r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: c0 */
    public final java.lang.Object m48783c0(kotlin.coroutines.Continuation<? super java.util.List<com.kubi.otc.entity.PayTypeEntity>> r4) {
            r3 = this;
            kotlinx.coroutines.j0 r0 = o00.C42911a.m94120b()
            com.kubi.payment.p2p.order.OrderDetailViewModel$getPayTypeList$2 r1 = new com.kubi.payment.p2p.order.OrderDetailViewModel$getPayTypeList$2
            r2 = 0
            r1.<init>(r3, r2)
            java.lang.Object r4 = kotlinx.coroutines.C41686h.m91049g(r0, r1, r4)
            return r4
    }

    /* JADX INFO: renamed from: d0 */
    public final java.lang.Object m48784d0(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<com.kubi.otc.entity.PayTemplate>>> r4) {
            r3 = this;
            kotlinx.coroutines.j0 r0 = o00.C42911a.m94120b()
            com.kubi.payment.p2p.order.OrderDetailViewModel$getPayTypeTemplateList$2 r1 = new com.kubi.payment.p2p.order.OrderDetailViewModel$getPayTypeTemplateList$2
            r2 = 0
            r1.<init>(r3, r2)
            java.lang.Object r4 = kotlinx.coroutines.C41686h.m91049g(r0, r1, r4)
            return r4
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: e0 */
    public final java.util.List<com.kubi.otc.entity.AdPayType> m48785e0() {
            r1 = this;
            java.util.List<com.kubi.otc.entity.AdPayType> r0 = r1.f39747n0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: f0 */
    public final androidx.lifecycle.LiveData<com.kubi.payment.p2p.data.entities.ReleaseCrypto> m48786f0() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<com.kubi.payment.p2p.data.entities.ReleaseCrypto> r0 = r1.f39754u0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: g0 */
    public final androidx.lifecycle.LiveData<java.lang.Long> m48787g0() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.Long> r0 = r1.f39738e0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: h0 */
    public final com.kubi.payment.p2p.data.entities.TransferOrderInfo m48788h0() {
            r17 = this;
            r0 = r17
            com.kubi.payment.p2p.data.entities.TransferOrderInfo r1 = new com.kubi.payment.p2p.data.entities.TransferOrderInfo
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r2 = r0.f39744k0
            r3 = 0
            if (r2 == 0) goto Le
            java.lang.String r2 = r2.getId()
            goto Lf
        Le:
            r2 = r3
        Lf:
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r4 = r0.f39744k0
            if (r4 == 0) goto L18
            java.lang.String r4 = r4.getStatus()
            goto L19
        L18:
            r4 = r3
        L19:
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r5 = r0.f39744k0
            if (r5 == 0) goto L22
            java.lang.String r5 = r5.getLegalCurrency()
            goto L23
        L22:
            r5 = r3
        L23:
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r6 = r0.f39744k0
            if (r6 == 0) goto L2c
            java.lang.String r6 = r6.getLegalCurrencyAmount()
            goto L2d
        L2c:
            r6 = r3
        L2d:
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r7 = r0.f39744k0
            if (r7 == 0) goto L36
            java.lang.Boolean r7 = r7.getRequirePayVoucher()
            goto L37
        L36:
            r7 = r3
        L37:
            androidx.lifecycle.LiveData r8 = r0.m48776U()
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            androidx.lifecycle.LiveData r9 = r0.m48771P()
            java.lang.Object r9 = r9.getValue()
            java.lang.Long r9 = (java.lang.Long) r9
            r10 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            com.kubi.otc.entity.AdPayType r9 = r0.f39746m0
            java.util.Map<java.lang.String, com.kubi.otc.entity.PayTypeEntity> r11 = r0.f39739f0
            if (r9 == 0) goto L5d
            java.lang.String r12 = r9.getPayTypeCode()
            goto L5e
        L5d:
            r12 = r10
        L5e:
            java.lang.String r12 = com.kubi.utils.extensions.C27041f.m66668h(r12)
            java.lang.Object r11 = r11.get(r12)
            com.kubi.otc.entity.PayTypeEntity r11 = (com.kubi.otc.entity.PayTypeEntity) r11
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r12 = r0.f39744k0
            if (r12 == 0) goto L75
            boolean r12 = r12.isP2PExpress()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            goto L76
        L75:
            r12 = r10
        L76:
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r13 = r0.f39744k0
            if (r13 == 0) goto L85
            com.kubi.payment.p2p.data.entities.OrderDetailInfo$ExpressInfo r13 = r13.getExpressInfo()
            if (r13 == 0) goto L85
            java.lang.String r13 = r13.getFromCurrency()
            goto L86
        L85:
            r13 = r10
        L86:
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r14 = r0.f39744k0
            if (r14 == 0) goto L95
            com.kubi.payment.p2p.data.entities.OrderDetailInfo$ExpressInfo r14 = r14.getExpressInfo()
            if (r14 == 0) goto L95
            java.lang.String r14 = r14.getDepositCurrency()
            goto L96
        L95:
            r14 = r10
        L96:
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r15 = r0.f39744k0
            if (r15 == 0) goto La5
            java.lang.String r15 = r15.getOpTraderName()
            if (r15 == 0) goto La5
            java.lang.String r15 = com.kubi.utils.extensions.C27041f.m66668h(r15)
            goto La6
        La5:
            r15 = r10
        La6:
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r10 = r0.f39744k0
            if (r10 == 0) goto Lbe
            java.lang.String r10 = r10.getCurrency()
            if (r10 == 0) goto Lbe
            java.lang.String r10 = com.kubi.utils.extensions.C27041f.m66668h(r10)
            r16 = r15
            r15 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r16
            goto Lc4
        Lbe:
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = 0
        Lc4:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
    }

    /* JADX INFO: renamed from: i0 */
    public final void m48789i0() {
            r3 = this;
            com.kubi.payment.chat.OrderChatHelper r0 = new com.kubi.payment.chat.OrderChatHelper
            kotlinx.coroutines.m0 r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r3)
            java.lang.String r2 = r3.f39740g0
            r0.<init>(r1, r2)
            r3.f39743j0 = r0
            com.kubi.payment.p2p.order.b1 r1 = new com.kubi.payment.p2p.order.b1
            r1.<init>(r3)
            r0.m46071p(r1)
            return
    }

    /* JADX INFO: renamed from: l0 */
    public final void m48790l0(@org.jetbrains.annotations.NotNull com.kubi.sdk.base.p113ui.InterfaceC23686g r2, @org.jetbrains.annotations.NotNull java.lang.String r3, boolean r4, @org.jetbrains.annotations.Nullable java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "iView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "orderId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.f39740g0 = r3
            r1.f39741h0 = r4
            r1.f39742i0 = r2
            r1.f39753t0 = r5
            r2 = 1
            r1.m48782a0(r2)
            return
    }

    /* JADX INFO: renamed from: m0 */
    public final void m48791m0() {
            r6 = this;
            kotlinx.coroutines.m0 r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            com.kubi.payment.p2p.order.OrderDetailViewModel$initPayType$1 r3 = new com.kubi.payment.p2p.order.OrderDetailViewModel$initPayType$1
            r1 = 0
            r3.<init>(r6, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.C41686h.m91046d(r0, r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m48792n0() {
            r1 = this;
            boolean r0 = r1.f39748o0
            return r0
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m48793o0() {
            r1 = this;
            boolean r0 = r1.f39751r0
            return r0
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
            r1 = this;
            super.onCleared()
            com.kubi.payment.chat.OrderChatHelper r0 = r1.f39743j0
            if (r0 == 0) goto La
            r0.m46075x()
        La:
            return
    }

    /* JADX INFO: renamed from: p0 */
    public final void m48794p0() {
            r6 = this;
            kotlinx.coroutines.m0 r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            com.kubi.payment.p2p.order.OrderDetailViewModel$markPaymentMethod$1 r3 = new com.kubi.payment.p2p.order.OrderDetailViewModel$markPaymentMethod$1
            r1 = 0
            r3.<init>(r6, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.C41686h.m91046d(r0, r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: q0 */
    public final void m48795q0() {
            r8 = this;
            androidx.lifecycle.MutableLiveData r0 = r8.m94034o()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            kotlinx.coroutines.m0 r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r8)
            com.kubi.payment.p2p.order.OrderDetailViewModel$notifyPayCoin$1 r5 = new com.kubi.payment.p2p.order.OrderDetailViewModel$notifyPayCoin$1
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.C41686h.m91046d(r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: x0 */
    public final void m48796x0(boolean r2) {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r1.f39735b0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.setValue(r2)
            return
    }

    /* JADX INFO: renamed from: z0 */
    public final java.lang.Object m48797z0(kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof com.kubi.payment.p2p.order.OrderDetailViewModel$refreshPayTypes$1
            if (r2 == 0) goto L17
            r2 = r1
            com.kubi.payment.p2p.order.OrderDetailViewModel$refreshPayTypes$1 r2 = (com.kubi.payment.p2p.order.OrderDetailViewModel$refreshPayTypes$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.kubi.payment.p2p.order.OrderDetailViewModel$refreshPayTypes$1 r2 = new com.kubi.payment.p2p.order.OrderDetailViewModel$refreshPayTypes$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L5b
            if (r4 != r5) goto L53
            int r4 = r2.I$1
            int r8 = r2.I$0
            java.lang.Object r9 = r2.L$8
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r10 = r2.L$7
            com.kubi.payment.p2p.order.OrderDetailViewModel r10 = (com.kubi.payment.p2p.order.OrderDetailViewModel) r10
            java.lang.Object r11 = r2.L$6
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r2.L$5
            com.kubi.otc.entity.AdPayType r11 = (com.kubi.otc.entity.AdPayType) r11
            java.lang.Object r12 = r2.L$3
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r2.L$2
            java.util.Collection r13 = (java.util.Collection) r13
            java.lang.Object r14 = r2.L$1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object r15 = r2.L$0
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            kotlin.ResultKt.throwOnFailure(r1)
            goto Lca
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L5b:
            kotlin.ResultKt.throwOnFailure(r1)
            com.kubi.payment.p2p.data.entities.OrderDetailInfo r1 = r0.f39744k0
            if (r1 == 0) goto L126
            java.util.List r1 = r1.getPayTypes()
            if (r1 == 0) goto L126
            java.util.ArrayList r4 = new java.util.ArrayList
            r8 = 10
            int r8 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r8)
            r4.<init>(r8)
            java.util.Iterator r8 = r1.iterator()
            r10 = r0
            r14 = r1
            r15 = r14
            r9 = r4
            r4 = r6
            r12 = r8
            r8 = r4
        L7e:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L122
            java.lang.Object r1 = r12.next()
            r11 = r1
            com.kubi.otc.entity.AdPayType r11 = (com.kubi.otc.entity.AdPayType) r11
            java.lang.String r13 = r11.getReservedFields()
            if (r13 == 0) goto Lcd
            int r16 = r13.length()
            if (r16 != 0) goto L98
            goto Lcd
        L98:
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r2.L$0 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r2.L$1 = r7
            r2.L$2 = r9
            r2.L$3 = r12
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r2.L$4 = r1
            r2.L$5 = r11
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r2.L$6 = r1
            r2.L$7 = r10
            r2.L$8 = r9
            r2.I$0 = r8
            r2.I$1 = r4
            r2.I$2 = r6
            r2.label = r5
            java.lang.Object r1 = r11.getPayTypeFields(r2)
            if (r1 != r3) goto Lc9
            return r3
        Lc9:
            r13 = r9
        Lca:
            com.kubi.otc.entity.ReservedFileds r1 = (com.kubi.otc.entity.ReservedFileds) r1
            goto Lcf
        Lcd:
            r13 = r9
            r1 = 0
        Lcf:
            java.util.Map<java.lang.String, com.kubi.otc.entity.PayTypeEntity> r7 = r0.f39739f0
            java.lang.String r16 = r11.getPayTypeCode()
            java.lang.String r5 = com.kubi.utils.extensions.C27041f.m66668h(r16)
            java.lang.Object r5 = r7.get(r5)
            com.kubi.otc.entity.PayTypeEntity r5 = (com.kubi.otc.entity.PayTypeEntity) r5
            if (r5 == 0) goto Le6
            java.lang.String r7 = r5.getTypeCode()
            goto Le7
        Le6:
            r7 = 0
        Le7:
            java.lang.String r6 = "OTHER"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r6)
            if (r7 == 0) goto Lfc
            if (r1 == 0) goto Lf6
            java.lang.String r1 = r1.getPayTypeName()
            goto Lf7
        Lf6:
            r1 = 0
        Lf7:
            java.lang.String r1 = com.kubi.utils.extensions.C27041f.m66669i(r1, r6)
            goto L108
        Lfc:
            if (r5 == 0) goto L103
            java.lang.String r1 = r5.getShowTypeName()
            goto L104
        L103:
            r1 = 0
        L104:
            java.lang.String r1 = com.kubi.utils.extensions.C27041f.m66668h(r1)
        L108:
            r11.setPayTypeName(r1)
            if (r5 == 0) goto L112
            java.lang.String r1 = r5.getIcon()
            goto L113
        L112:
            r1 = 0
        L113:
            java.lang.String r1 = com.kubi.utils.extensions.C27041f.m66668h(r1)
            r11.setPayTypeIcon(r1)
            r9.add(r11)
            r9 = r13
            r5 = 1
            r6 = 0
            goto L7e
        L122:
            r7 = r9
            java.util.List r7 = (java.util.List) r7
            goto L128
        L126:
            r10 = r0
            r7 = 0
        L128:
            r10.f39747n0 = r7
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
