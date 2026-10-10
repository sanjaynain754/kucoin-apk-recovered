package com.kubi.payment.p2p.order;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.PayTemplate;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.payment.chat.OrderChatHelper;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.payment.p2p.data.entities.ReleaseCrypto;
import com.kubi.payment.p2p.data.entities.TransferOrderInfo;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.C42874g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OrderDetailViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 w2\u00020\u0001:\u0001wB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010Q\u001a\u00020R2\u0006\u0010&\u001a\u00020'2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\b2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\"J\u0010\u00100\u001a\u00020R2\b\b\u0002\u0010S\u001a\u00020\bJ \u0010T\u001a\u00020R2\u0006\u0010U\u001a\u00020\"2\u0006\u0010V\u001a\u00020\"2\u0006\u0010W\u001a\u00020/H\u0002J\u0018\u0010Z\u001a\u00020R2\u0006\u0010\\\u001a\u00020\"2\b\b\u0002\u0010]\u001a\u00020\"J\u0006\u0010^\u001a\u00020RJ\u0010\u0010_\u001a\u00020R2\b\b\u0002\u0010`\u001a\u00020\"J\u0006\u0010a\u001a\u00020RJ\u0006\u0010\u0017\u001a\u00020RJ\u0006\u0010b\u001a\u00020RJ\u0006\u0010\u001e\u001a\u00020RJ\u0006\u0010c\u001a\u00020dJ\b\u0010e\u001a\u00020RH\u0002J\b\u0010f\u001a\u00020RH\u0002J\u0006\u0010g\u001a\u00020RJ\u0010\u0010h\u001a\u00020R2\b\b\u0002\u0010i\u001a\u00020\bJ\u000e\u0010j\u001a\u00020RH\u0082@¢\u0006\u0002\u0010kJ\u0014\u0010l\u001a\b\u0012\u0004\u0012\u00020#0>H\u0082@¢\u0006\u0002\u0010kJ \u0010m\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0>0!H\u0082@¢\u0006\u0002\u0010kJ\u0006\u0010o\u001a\u00020RJ\b\u0010p\u001a\u00020RH\u0014J\u0010\u0010q\u001a\u00020R2\u0006\u0010r\u001a\u00020'H\u0007J\u0010\u0010s\u001a\u00020R2\u0006\u0010t\u001a\u00020\"H\u0007J\u001c\u0010u\u001a\u00020R2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\fR\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b6\u0010\fR\u001c\u00107\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010D\"\u0004\bH\u0010FR\u001a\u0010I\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010D\"\u0004\bK\u0010FR\u001a\u0010L\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010D\"\u0004\bM\u0010FR\u001a\u0010N\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010D\"\u0004\bO\u0010FR\u0010\u0010P\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\n8F¢\u0006\u0006\u001a\u0004\b[\u0010\f¨\u0006x"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/OrderDetailViewModel;", "Lcom/kubi/payment/base/BaseViewModel;", "repository", "Lcom/kubi/payment/p2p/data/source/IP2PRepository;", "<init>", "(Lcom/kubi/payment/p2p/data/source/IP2PRepository;)V", "_notifyDetailView", "Landroidx/lifecycle/MutableLiveData;", "", "notifyDetailView", "Landroidx/lifecycle/LiveData;", "getNotifyDetailView", "()Landroidx/lifecycle/LiveData;", "_notifyLooperInfo", "notifyLooperInfo", "getNotifyLooperInfo", "_notifyPayTypeView", "notifyPayTypeView", "getNotifyPayTypeView", "_notifyChatRedDot", "notifyChatRedDot", "getNotifyChatRedDot", "_notifyPayCoin", "notifyPayCoin", "getNotifyPayCoin", "_autoCancelOrderTime", "", "autoCancelOrderTime", "getAutoCancelOrderTime", "_startPayCoinLeftTime", "startPayCoinLeftTime", "getStartPayCoinLeftTime", "payTypeTemplateMap", "", "", "Lcom/kubi/otc/entity/PayTypeEntity;", "orderId", "isRedRemind", "iView", "Lcom/kubi/sdk/base/ui/IView;", "chatHelper", "Lcom/kubi/payment/chat/OrderChatHelper;", "getChatHelper", "()Lcom/kubi/payment/chat/OrderChatHelper;", "setChatHelper", "(Lcom/kubi/payment/chat/OrderChatHelper;)V", "orderInfo", "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;", "getOrderInfo", "()Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;", "setOrderInfo", "(Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;)V", "_needRemind", "needRemind", "getNeedRemind", "currentPayType", "Lcom/kubi/otc/entity/AdPayType;", "getCurrentPayType", "()Lcom/kubi/otc/entity/AdPayType;", "setCurrentPayType", "(Lcom/kubi/otc/entity/AdPayType;)V", "payTypes", "", "getPayTypes", "()Ljava/util/List;", "setPayTypes", "(Ljava/util/List;)V", "isCancelAutoCancelOrderTime", "()Z", "setCancelAutoCancelOrderTime", "(Z)V", "isAutoCancelOrderTiming", "setAutoCancelOrderTiming", "hasConsultSuccessConfirmInfoView", "getHasConsultSuccessConfirmInfoView", "setHasConsultSuccessConfirmInfoView", "isCancelPayCoinLeftTime", "setCancelPayCoinLeftTime", "isPayCoinLeftTiming", "setPayCoinLeftTiming", "preSpmId", "initData", "", "isFirst", "trackOrderStatus", "newStatus", "newExpressStatus", "response", "_releaseCrypto", "Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;", "releaseCrypto", "getReleaseCrypto", "url", "validationToken", "cancelAppeal", "consentAppeal", "content", "rejectAppeal", "startAutoCancelOrderTime", "getTransferOrderInfo", "Lcom/kubi/payment/p2p/data/entities/TransferOrderInfo;", "initPayType", "initChat", "resetPayTypes", "notifyRedRemind", "isRemind", "refreshPayTypes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPayTypeList", "getPayTypeTemplateList", "Lcom/kubi/otc/entity/PayTemplate;", "markPaymentMethod", "onCleared", "setView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setOrderId", "id", "setPayTypeTemplateMap", "map", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDetailViewModel.kt\ncom/kubi/payment/p2p/order/OrderDetailViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,561:1\n1563#2:562\n1634#2,3:563\n*S KotlinDebug\n*F\n+ 1 OrderDetailViewModel.kt\ncom/kubi/payment/p2p/order/OrderDetailViewModel\n*L\n478#1:562\n478#1:563,3\n*E\n"})
public final class OrderDetailViewModel extends C42874g {

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f39730v0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final IP2PRepository f39731X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f39732Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Boolean> f39733Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<Boolean> f39734a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Boolean> f39735b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Boolean> f39736c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Long> f39737d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<Long> f39738e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public Map<String, PayTypeEntity> f39739f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public String f39740g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f39741h0;

    /* JADX INFO: renamed from: i0 */
    @Nullable
    public InterfaceC23686g f39742i0;

    /* JADX INFO: renamed from: j0 */
    @Nullable
    public OrderChatHelper f39743j0;

    /* JADX INFO: renamed from: k0 */
    @Nullable
    public OrderDetailInfo f39744k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final MutableLiveData<Boolean> f39745l0;

    /* JADX INFO: renamed from: m0 */
    @Nullable
    public AdPayType f39746m0;

    /* JADX INFO: renamed from: n0 */
    @Nullable
    public List<AdPayType> f39747n0;

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
    @Nullable
    public String f39753t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final MutableLiveData<ReleaseCrypto> f39754u0;

    /* JADX INFO: compiled from: OrderDetailViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/OrderDetailViewModel$Companion;", "", "<init>", "()V", "TIME_ZERO", "", "TIME_MILLIS", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public OrderDetailViewModel(@NotNull IP2PRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39731X = repository;
        this.f39732Y = new MutableLiveData<>();
        this.f39733Z = new MutableLiveData<>();
        this.f39734a0 = new MutableLiveData<>();
        this.f39735b0 = new MutableLiveData<>();
        this.f39736c0 = new MutableLiveData<>();
        this.f39737d0 = new MutableLiveData<>();
        this.f39738e0 = new MutableLiveData<>();
        this.f39739f0 = MapsKt.emptyMap();
        this.f39740g0 = "";
        this.f39745l0 = new MutableLiveData<>();
        this.f39754u0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m48733C0(OrderDetailViewModel orderDetailViewModel, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        orderDetailViewModel.m48757B0(str, str2);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m48743O(OrderDetailViewModel orderDetailViewModel, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        orderDetailViewModel.m48769N(str);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m48744b0(OrderDetailViewModel orderDetailViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        orderDetailViewModel.m48782a0(z11);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX INFO: renamed from: j0 */
    public static final Unit m48745j0(OrderDetailViewModel orderDetailViewModel, boolean z11) {
        boolean z12;
        MutableLiveData<Boolean> mutableLiveData = orderDetailViewModel.f39735b0;
        if (orderDetailViewModel.f39741h0) {
            OrderDetailInfo orderDetailInfo = orderDetailViewModel.f39744k0;
            String adRemarks = orderDetailInfo != null ? orderDetailInfo.getAdRemarks() : null;
            if (adRemarks != null && adRemarks.length() != 0) {
                z12 = true;
            } else if (C27025c.m66566d(Boolean.valueOf(z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else if (C27025c.m66566d(Boolean.valueOf(z11))) {
            z12 = true;
        } else {
            z12 = false;
        }
        mutableLiveData.setValue(Boolean.valueOf(z12));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m48754y0(OrderDetailViewModel orderDetailViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        orderDetailViewModel.m48796x0(z11);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m48757B0(@NotNull String url, @NotNull String validationToken) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(validationToken, "validationToken");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderDetailViewModel$releaseCrypto$1(this, validationToken, url, null), 3, null);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m48759E0(boolean z11) {
        this.f39749p0 = z11;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m48760F0(boolean z11) {
        this.f39748o0 = z11;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m48761G0(boolean z11) {
        this.f39751r0 = z11;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m48762H0(@Nullable AdPayType adPayType) {
        this.f39746m0 = adPayType;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m48763I0(boolean z11) {
        this.f39750q0 = z11;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m48764J0(@Nullable OrderDetailInfo orderDetailInfo) {
        this.f39744k0 = orderDetailInfo;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m48765K0(boolean z11) {
        this.f39752s0 = z11;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m48766L0() {
        if (this.f39749p0) {
            return;
        }
        this.f39749p0 = true;
        this.f39748o0 = false;
        Ref.LongRef longRef = new Ref.LongRef();
        OrderDetailInfo orderDetailInfo = this.f39744k0;
        long jM66652l = C27039d.m66652l(orderDetailInfo != null ? orderDetailInfo.getAutoCancelOrderExpire() : null);
        longRef.element = jM66652l;
        if (jM66652l <= 0) {
            this.f39737d0.setValue(0L);
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderDetailViewModel$startAutoCancelOrderTime$1(longRef, this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m48768M0() {
        if (this.f39752s0) {
            return;
        }
        this.f39752s0 = true;
        this.f39751r0 = false;
        Ref.LongRef longRef = new Ref.LongRef();
        OrderDetailInfo orderDetailInfo = this.f39744k0;
        long jM66652l = C27039d.m66652l(orderDetailInfo != null ? orderDetailInfo.getAvgPayCoinLeftTime() : null);
        longRef.element = jM66652l;
        if (jM66652l <= 0) {
            this.f39738e0.setValue(0L);
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderDetailViewModel$startPayCoinLeftTime$1(longRef, this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m48769N(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        m94034o().setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderDetailViewModel$consentAppeal$1(this, content, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final LiveData<Long> m48771P() {
        return this.f39737d0;
    }

    @Nullable
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final OrderChatHelper getF39743j0() {
        return this.f39743j0;
    }

    @Nullable
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AdPayType getF39746m0() {
        return this.f39746m0;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final boolean getF39750q0() {
        return this.f39750q0;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final LiveData<Boolean> m48775T() {
        return this.f39745l0;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final LiveData<Boolean> m48776U() {
        return this.f39735b0;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final LiveData<Boolean> m48777V() {
        return this.f39732Y;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final LiveData<Boolean> m48778W() {
        return this.f39733Z;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final LiveData<Boolean> m48779X() {
        return this.f39736c0;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final LiveData<Boolean> m48780Y() {
        return this.f39734a0;
    }

    @Nullable
    /* JADX INFO: renamed from: Z, reason: from getter */
    public final OrderDetailInfo getF39744k0() {
        return this.f39744k0;
    }

    @Nullable
    /* JADX INFO: renamed from: e0 */
    public final List<AdPayType> m48785e0() {
        return this.f39747n0;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final LiveData<ReleaseCrypto> m48786f0() {
        return this.f39754u0;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final LiveData<Long> m48787g0() {
        return this.f39738e0;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final TransferOrderInfo m48788h0() {
        String str;
        String strM66668h;
        String currency;
        String opTraderName;
        OrderDetailInfo.ExpressInfo expressInfo;
        OrderDetailInfo.ExpressInfo expressInfo2;
        OrderDetailInfo orderDetailInfo = this.f39744k0;
        String id2 = orderDetailInfo != null ? orderDetailInfo.getId() : null;
        OrderDetailInfo orderDetailInfo2 = this.f39744k0;
        String status = orderDetailInfo2 != null ? orderDetailInfo2.getStatus() : null;
        OrderDetailInfo orderDetailInfo3 = this.f39744k0;
        String legalCurrency = orderDetailInfo3 != null ? orderDetailInfo3.getLegalCurrency() : null;
        OrderDetailInfo orderDetailInfo4 = this.f39744k0;
        String legalCurrencyAmount = orderDetailInfo4 != null ? orderDetailInfo4.getLegalCurrencyAmount() : null;
        OrderDetailInfo orderDetailInfo5 = this.f39744k0;
        Boolean requirePayVoucher = orderDetailInfo5 != null ? orderDetailInfo5.getRequirePayVoucher() : null;
        Boolean value = m48776U().getValue();
        Long value2 = m48771P().getValue();
        String str2 = status;
        String str3 = legalCurrency;
        String str4 = legalCurrencyAmount;
        Boolean bool = requirePayVoucher;
        AdPayType adPayType = this.f39746m0;
        PayTypeEntity payTypeEntity = this.f39739f0.get(C27041f.m66668h(adPayType != null ? adPayType.getPayTypeCode() : null));
        OrderDetailInfo orderDetailInfo6 = this.f39744k0;
        Boolean boolValueOf = orderDetailInfo6 != null ? Boolean.valueOf(orderDetailInfo6.isP2PExpress()) : null;
        OrderDetailInfo orderDetailInfo7 = this.f39744k0;
        String fromCurrency = (orderDetailInfo7 == null || (expressInfo2 = orderDetailInfo7.getExpressInfo()) == null) ? null : expressInfo2.getFromCurrency();
        OrderDetailInfo orderDetailInfo8 = this.f39744k0;
        String depositCurrency = (orderDetailInfo8 == null || (expressInfo = orderDetailInfo8.getExpressInfo()) == null) ? null : expressInfo.getDepositCurrency();
        OrderDetailInfo orderDetailInfo9 = this.f39744k0;
        String strM66668h2 = (orderDetailInfo9 == null || (opTraderName = orderDetailInfo9.getOpTraderName()) == null) ? null : C27041f.m66668h(opTraderName);
        OrderDetailInfo orderDetailInfo10 = this.f39744k0;
        if (orderDetailInfo10 == null || (currency = orderDetailInfo10.getCurrency()) == null) {
            str = strM66668h2;
            strM66668h = null;
        } else {
            String str5 = strM66668h2;
            strM66668h = C27041f.m66668h(currency);
            str = str5;
        }
        return new TransferOrderInfo(id2, str2, str3, str4, bool, value, value2, adPayType, payTypeEntity, boolValueOf, fromCurrency, depositCurrency, str, strM66668h);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m48789i0() {
        OrderChatHelper orderChatHelper = new OrderChatHelper(ViewModelKt.getViewModelScope(this), this.f39740g0);
        this.f39743j0 = orderChatHelper;
        orderChatHelper.m46071p(new Function1() { // from class: com.kubi.payment.p2p.order.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailViewModel.m48745j0(this.f39788b, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final void m48790l0(@NotNull InterfaceC23686g iView, @NotNull String orderId, boolean z11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(iView, "iView");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f39740g0 = orderId;
        this.f39741h0 = z11;
        this.f39742i0 = iView;
        this.f39753t0 = str;
        m48782a0(true);
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final boolean getF39748o0() {
        return this.f39748o0;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final boolean getF39751r0() {
        return this.f39751r0;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m48796x0(boolean z11) {
        this.f39735b0.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c9 -> B:30:0x00ca). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:49:0x0112
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: z0 */
    public final java.lang.Object m48797z0(p852kotlin.coroutines.Continuation<? super p852kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.payment.p2p.order.OrderDetailViewModel.m48797z0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: A0 */
    public final void m48756A0() {
        m94034o().setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderDetailViewModel$rejectAppeal$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m48758D0() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderDetailViewModel$resetPayTypes$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: M */
    public final void m48767M() {
        m94034o().setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderDetailViewModel$cancelAppeal$1(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: N0 */
    public final void m48770N0(String str, String str2, OrderDetailInfo orderDetailInfo) {
        OrderDetailInfo orderDetailInfo2;
        String status;
        OrderDetailInfo.ExpressInfo expressInfo;
        String status2;
        String str3;
        String status3;
        Boolean boolValueOf = null;
        if (str.length() > 0) {
            OrderDetailInfo orderDetailInfo3 = this.f39744k0;
            if (orderDetailInfo3 != null) {
                status3 = orderDetailInfo3.getStatus();
            } else {
                status3 = null;
            }
            if (Intrinsics.areEqual(str, C27041f.m66668h(status3))) {
                if (str2.length() > 0) {
                    orderDetailInfo2 = this.f39744k0;
                    if (orderDetailInfo2 == null) {
                        status = null;
                    } else {
                        status = null;
                    }
                    if (Intrinsics.areEqual(str, C27041f.m66668h(status))) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (str2.length() > 0) {
            orderDetailInfo2 = this.f39744k0;
            if (orderDetailInfo2 == null && (expressInfo = orderDetailInfo2.getExpressInfo()) != null) {
                status = expressInfo.getStatus();
            } else {
                status = null;
            }
            if (Intrinsics.areEqual(str, C27041f.m66668h(status))) {
                return;
            }
        } else {
            return;
        }
        Pair pairM90091to = TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(orderDetailInfo.getLegalCurrency()));
        Pair pairM90091to2 = TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(orderDetailInfo.getCurrency()));
        Pair pairM90091to3 = TuplesKt.m90091to("status", C27041f.m66668h(orderDetailInfo.getStatus()));
        OrderDetailInfo.ExpressInfo expressInfo2 = orderDetailInfo.getExpressInfo();
        if (expressInfo2 != null) {
            status2 = expressInfo2.getStatus();
        } else {
            status2 = null;
        }
        Pair pairM90091to4 = TuplesKt.m90091to("express_status", C27041f.m66668h(status2));
        if (C27025c.m66566d(orderDetailInfo.getBuyerRole())) {
            str3 = "buy";
        } else {
            str3 = "sell";
        }
        Pair pairM90091to5 = TuplesKt.m90091to("pay_side", str3);
        OrderDetailInfo orderDetailInfo4 = this.f39744k0;
        if (orderDetailInfo4 != null) {
            boolValueOf = Boolean.valueOf(orderDetailInfo4.isP2PExpress());
        }
        C43852m.m96594f("B7P2POrderDetails", "page", "1", pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, pairM90091to5, TuplesKt.m90091to("isP2PExpress", Boolean.valueOf(C27025c.m66566d(boolValueOf))), TuplesKt.m90091to("pre_spm_id", C27041f.m66668h(this.f39753t0)), TuplesKt.m90091to("norm_version", "1"));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m48782a0(boolean z11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderDetailViewModel$getOrderInfo$1(this, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: c0 */
    public final Object m48783c0(Continuation<? super List<PayTypeEntity>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new OrderDetailViewModel$getPayTypeList$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: d0 */
    public final Object m48784d0(Continuation<? super Map<String, ? extends List<PayTemplate>>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new OrderDetailViewModel$getPayTypeTemplateList$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m48791m0() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderDetailViewModel$initPayType$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        OrderChatHelper orderChatHelper = this.f39743j0;
        if (orderChatHelper != null) {
            orderChatHelper.m46075x();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m48794p0() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderDetailViewModel$markPaymentMethod$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m48795q0() {
        m94034o().setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderDetailViewModel$notifyPayCoin$1(this, null), 3, null);
    }
}
