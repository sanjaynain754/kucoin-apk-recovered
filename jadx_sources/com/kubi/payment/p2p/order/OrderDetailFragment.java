package com.kubi.payment.p2p.order;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.helpcenter.api.local.IHelpCenterService;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$font;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.service.OtcDepend;
import com.kubi.p110rn.Constants;
import com.kubi.payment.chat.OrderChatHelper;
import com.kubi.payment.data.entities.BannerInfo;
import com.kubi.payment.flutter.FlutterNavigationHelper;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.kucard.helper.KuCardHelper;
import com.kubi.payment.p2p.P2PHelper;
import com.kubi.payment.p2p.base.BaseP2PFragment;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.payment.p2p.data.entities.ReleaseCrypto;
import com.kubi.payment.p2p.order.express.P2PExpressDialog;
import com.kubi.payment.p2p.order.transfer.OrderTransferFragment;
import com.kubi.payment.p2p.trade.MerchantQualificationDialog;
import com.kubi.payment.p2p.widget.P2PViewChatCardEntrance;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.payment.widget.StepsLayout;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.function.looper.KuCoinLooper;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.C27018c0;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27057k;
import com.kubi.utils.C27096v0;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33820nf;
import dz.C36993c;
import et.C37242d;
import eu.C37265w;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37766r;
import ht.C38301b1;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p026ay.C4400a;
import p270ft.C37678r1;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function7;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: OrderDetailFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001iB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0014J\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\bH\u0002J\b\u0010$\u001a\u00020 H\u0002J\u0012\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\b\u0010(\u001a\u00020 H\u0016J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0002J\b\u0010+\u001a\u00020 H\u0002J\b\u0010,\u001a\u00020 H\u0002J\b\u0010-\u001a\u00020 H\u0002J\b\u0010.\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020 H\u0002J\f\u00100\u001a\u00020 *\u00020\u0010H\u0002J\u0012\u00101\u001a\u00020 2\b\u00102\u001a\u0004\u0018\u000103H\u0002J\b\u00104\u001a\u00020\u000eH\u0002J\b\u00105\u001a\u00020 H\u0002J\b\u00106\u001a\u00020 H\u0002J\b\u00107\u001a\u00020 H\u0002J\b\u00108\u001a\u00020 H\u0002J\b\u00109\u001a\u00020 H\u0002J\b\u0010:\u001a\u00020 H\u0002J\b\u0010;\u001a\u00020 H\u0002J\b\u0010<\u001a\u00020 H\u0002J\b\u0010=\u001a\u00020 H\u0002J\b\u0010>\u001a\u00020 H\u0002J\b\u0010?\u001a\u00020 H\u0002J\b\u0010@\u001a\u00020 H\u0002J\b\u0010A\u001a\u00020 H\u0002J\b\u0010B\u001a\u00020 H\u0002J\b\u0010C\u001a\u00020 H\u0002J\b\u0010D\u001a\u00020 H\u0002J\b\u0010E\u001a\u00020 H\u0002J\b\u0010F\u001a\u00020 H\u0002J\b\u0010G\u001a\u00020 H\u0002J\b\u0010H\u001a\u00020 H\u0002J\b\u0010I\u001a\u00020 H\u0002J\b\u0010J\u001a\u00020 H\u0002J\b\u0010K\u001a\u00020 H\u0002J\b\u0010L\u001a\u00020 H\u0002J\b\u0010M\u001a\u00020 H\u0002J\b\u0010N\u001a\u00020 H\u0002J\b\u0010O\u001a\u00020 H\u0002J\b\u0010P\u001a\u00020 H\u0002J\b\u0010Q\u001a\u00020 H\u0002J\u0012\u0010R\u001a\u00020 2\b\b\u0002\u0010S\u001a\u00020\u000eH\u0002J\b\u0010T\u001a\u00020 H\u0002J\b\u0010U\u001a\u00020 H\u0002J\b\u0010V\u001a\u00020 H\u0002J\u0012\u0010W\u001a\u00020 2\b\b\u0002\u0010X\u001a\u00020\u000eH\u0002J.\u0010Y\u001a\u00020Z2\b\b\u0001\u0010[\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020\f2\b\b\u0002\u0010]\u001a\u00020\f2\b\b\u0003\u0010^\u001a\u00020\u001eH\u0002J\u0012\u0010_\u001a\u00020 2\b\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u0012\u0010b\u001a\u00020 2\b\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u0012\u0010c\u001a\u00020 2\b\u0010`\u001a\u0004\u0018\u00010aH\u0002J\b\u0010d\u001a\u00020\u000eH\u0002J\b\u0010e\u001a\u00020 H\u0002J\b\u0010f\u001a\u00020\u000eH\u0002J\b\u0010g\u001a\u00020 H\u0002J\b\u0010h\u001a\u00020 H\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006j"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/OrderDetailFragment;", "Lcom/kubi/payment/p2p/base/BaseP2PFragment;", "Lcom/kubi/payment/p2p/order/OrderDetailViewModel;", "Lcom/kubi/payment/p2p/order/OrderCountdownOwner;", "<init>", "()V", "autoCancelOrderTime", "Landroidx/lifecycle/LiveData;", "", "getAutoCancelOrderTime", "()Landroidx/lifecycle/LiveData;", "viewStatus", "", "needRefreshInfo", "", "vb", "Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderDetailBinding;", "getVb", "()Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderDetailBinding;", "vb$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "securityWidgetOpen", "getSecurityWidgetOpen", "()Z", "securityWidgetOpen$delegate", "Lkotlin/Lazy;", "checkedWarnDialog", "viewModelClass", "Lkotlin/reflect/KClass;", "getLayout", "", "initViews", "", "observeData", "checkAndShowOrderProcessDialog", "it", "checkAndClearWarnDialogStore", "handleOperationalActivity", "releaseCrypto", "Lcom/kubi/payment/p2p/data/entities/ReleaseCrypto;", "onResume", "initListener", "onGotoTransferClick", "goToTransfer", "refreshExpressHeaderUI", "refreshView", "refreshChatCardView", "refreshCommonView", "refreshStepsLayout", "showTaxInfo", "info", "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;", "isCanSwitchPayType", "refreshBuyStatusOrderCreatedView", "refreshSellStatusOrderCreatedView", "refreshBuyStatusOrderWaitCoinView", "refreshSellStatusOrderPayCoinView", "refreshStatusOrderAppealingOwnView", "initBuyStatusOrderAppealingAndConsultOtherView", "refreshStatusOrderAppealingOtherView", "refreshStatusOrderAppealingOwnConsult", "refreshStatusOrderAppealingOtherConsult", "initStatusOrderAppealingService", "refreshStatusOrderAppealingOwnService", "refreshStatusOrderAppealingOtherService", "refreshBuyStatusOrderCharged", "refreshSuccessfulUI", "refreshSellStatusOrderCharged", "refreshStatusOrderCanceled", "refreshStatusExpressOrderUnconfirmed", "refreshStatusExpressOrderProcessing", "refreshStatusExpressOrderSucceeded", "refreshStatusExpressOrderFailed", "refreshCommonExpressUI", "refreshStatusExpressOrderCanceled", "showPayTypeSelectView", "showPayCoinAlertView", "showCancelAppealAlertView", "showCancelOrderAlertView", "showConsentConfirmView", "showConsultSuccessConfirmInfoView", "showConsentSuccessConfirmView", "showConsentDisagreeConfirmView", "isDismiss", "refreshPayTypeView", "payCoinCheck", "payCoinCheckV2", "routerAppealHistory", "isProcessing", "getSpannableString", "Landroid/text/SpannableString;", "resId", "primaryStr", "secondStr", "color", "setTextColorDark", "textView", "Landroid/widget/TextView;", "registerSpanStyle", "registerMoreSpanStyle", "isDisplayOpTradeInfo", "startChatActivity", "isFinalStatus", "startOrderLooper", "stopLoopTaskIfNeed", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDetailFragment.kt\ncom/kubi/payment/p2p/order/OrderDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 6 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,1797:1\n147#2,16:1798\n158#3,2:1814\n35#4,4:1816\n39#4:1822\n44#5,2:1820\n44#6,2:1823\n*S KotlinDebug\n*F\n+ 1 OrderDetailFragment.kt\ncom/kubi/payment/p2p/order/OrderDetailFragment\n*L\n112#1:1798,16\n217#1:1814,2\n126#1:1816,4\n126#1:1822\n126#1:1820,2\n1614#1:1823,2\n*E\n"})
public final class OrderDetailFragment extends BaseP2PFragment<OrderDetailViewModel> implements OrderCountdownOwner {

    /* JADX INFO: renamed from: W */
    public boolean f39724W;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f39726Y;

    /* JADX INFO: renamed from: Z */
    public boolean f39727Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f39722b0 = {Reflection.property1(new PropertyReference1Impl(OrderDetailFragment.class, "vb", "getVb()Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderDetailBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f39721a0 = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public String f39723V = "";

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f39725X = C45681e.m100799e(this, new Function1<OrderDetailFragment, C37678r1>() { // from class: com.kubi.payment.p2p.order.OrderDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37678r1 invoke(@NotNull OrderDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37678r1.m84944a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37678r1, Unit>() { // from class: com.kubi.payment.p2p.order.OrderDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37678r1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37678r1 c37678r1) {
            invoke(c37678r1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: compiled from: OrderDetailFragment.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/OrderDetailFragment$Companion;", "", "<init>", "()V", "ORDER_INFO_REFRESH_TIME", "", "START_CHAT_VIEW_EVENT", "", "EXTRA_ID", "EXTRA_ORDER_IS_CREATE", "UNIQUE_ID", "newInstance", "Lcom/kubi/payment/p2p/order/OrderDetailFragment;", "orderId", "isRedRemind", "", "preSpmId", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/payment/p2p/order/OrderDetailFragment;", "toChat", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void toChat() {
            C12572a.m23695d("START_CHAT_VIEW_EVENT", null, 0L, 6, null);
        }

        public Companion() {
        }

        public static /* synthetic */ OrderDetailFragment newInstance$default(Companion companion, String str, Boolean bool, String str2, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bool = Boolean.FALSE;
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            return companion.newInstance(str, bool, str2);
        }

        @NotNull
        public final OrderDetailFragment newInstance(@NotNull String orderId, @Nullable Boolean isRedRemind, @Nullable String preSpmId) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            OrderDetailFragment orderDetailFragment = new OrderDetailFragment();
            orderDetailFragment.setArguments(new C27051h().m66724h("id", orderId).m66719c("isCreateOrder", C27025c.m66566d(isRedRemind)).m66724h("spm", preSpmId).m66717a());
            return orderDetailFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.order.OrderDetailFragment$a */
    /* JADX INFO: compiled from: OrderDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/p2p/order/OrderDetailFragment$refreshStatusExpressOrderFailed$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21093a extends ClickableSpan {
        public C21093a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            OrderDetailInfo.ExpressInfo expressInfo;
            OrderDetailInfo.ExpressInfo expressInfo2;
            Intrinsics.checkNotNullParameter(widget, "widget");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ConvertPage?from=");
            OrderDetailInfo f39744k0 = OrderDetailFragment.m48665w4(OrderDetailFragment.this).getF39744k0();
            String depositCurrency = null;
            sb2.append((f39744k0 == null || (expressInfo2 = f39744k0.getExpressInfo()) == null) ? null : expressInfo2.getFromCurrency());
            sb2.append("&to=");
            OrderDetailInfo f39744k1 = OrderDetailFragment.m48665w4(OrderDetailFragment.this).getF39744k0();
            if (f39744k1 != null && (expressInfo = f39744k1.getExpressInfo()) != null) {
                depositCurrency = expressInfo.getDepositCurrency();
            }
            sb2.append(depositCurrency);
            String strEncode = Uri.encode(sb2.toString());
            Router.f46192a.m56184f("krn/router?biz=convert&entry=main&component=kucoin_convert_rn&route=" + strEncode).m4048k();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setColor(ContextCompat.getColor(((OldBaseFragment) OrderDetailFragment.this).mContext, R$color.c_text60));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.order.OrderDetailFragment$b */
    /* JADX INFO: compiled from: OrderDetailFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21094b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39729b;

        public C21094b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39729b = function;
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
            return this.f39729b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39729b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.order.OrderDetailFragment$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C21095c extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: I4 */
    private final void m48575I4() {
        P2PViewChatCardEntrance p2PViewChatCardEntrance;
        BaseTextView baseTextView;
        KcPrimaryButton kcPrimaryButton;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        KcPrimaryButton kcPrimaryButton4;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        View view;
        KcSecondaryButton kcSecondaryButton;
        KcPrimaryButton kcPrimaryButton5;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        TextPaint paint;
        BaseTextView baseTextView8;
        TextPaint paint2;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        TextPaint paint3;
        BaseTextView baseTextView12;
        TextPaint paint4;
        P2PViewChatCardEntrance p2PViewChatCardEntrance2;
        View viewFindViewById;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (appCompatImageView3 = c37678r1M48680D4.f84555j) != null) {
            C27046k.m66711z(appCompatImageView3, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48577J4(this.f39786b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (appCompatImageView2 = c37678r1M48680D5.f84563n) != null) {
            C27046k.m66711z(appCompatImageView2, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48579K4(this.f39795b);
                }
            }, 1, null);
        }
        if (!C24129b.m58030b(SiteVisibleConfigKey.P2P)) {
            C37678r1 c37678r1M48680D6 = m48680D4();
            if (c37678r1M48680D6 != null && (appCompatImageView = c37678r1M48680D6.f84563n) != null) {
                C27046k.m66700o(appCompatImageView);
            }
            C37678r1 c37678r1M48680D7 = m48680D4();
            if (c37678r1M48680D7 != null && (p2PViewChatCardEntrance2 = c37678r1M48680D7.f84496F0) != null && (viewFindViewById = p2PViewChatCardEntrance2.findViewById(R$id.tvChat)) != null) {
                C27046k.m66700o(viewFindViewById);
            }
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (baseTextView12 = c37678r1M48680D8.f84505K) != null && (paint4 = baseTextView12.getPaint()) != null) {
            paint4.setFlags(8);
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (baseTextView11 = c37678r1M48680D9.f84505K) != null && (paint3 = baseTextView11.getPaint()) != null) {
            paint3.setAntiAlias(true);
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (baseTextView10 = c37678r1M48680D10.f84505K) != null) {
            C27046k.m66711z(baseTextView10, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48581L4();
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D11 = m48680D4();
        if (c37678r1M48680D11 != null && (baseTextView9 = c37678r1M48680D11.f84497G) != null) {
            C27046k.m66711z(baseTextView9, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48583M4(this.f39841b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D12 = m48680D4();
        if (c37678r1M48680D12 != null && (baseTextView8 = c37678r1M48680D12.f84499H) != null && (paint2 = baseTextView8.getPaint()) != null) {
            paint2.setFlags(8);
        }
        C37678r1 c37678r1M48680D13 = m48680D4();
        if (c37678r1M48680D13 != null && (baseTextView7 = c37678r1M48680D13.f84499H) != null && (paint = baseTextView7.getPaint()) != null) {
            paint.setAntiAlias(true);
        }
        C37678r1 c37678r1M48680D14 = m48680D4();
        if (c37678r1M48680D14 != null && (baseTextView6 = c37678r1M48680D14.f84499H) != null) {
            C27046k.m66711z(baseTextView6, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48585N4(this.f39845b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D15 = m48680D4();
        if (c37678r1M48680D15 != null && (baseTextView5 = c37678r1M48680D15.f84515P) != null) {
            TextPaint paint5 = baseTextView5.getPaint();
            if (paint5 != null) {
                paint5.setFlags(8);
            }
            TextPaint paint6 = baseTextView5.getPaint();
            if (paint6 != null) {
                paint6.setAntiAlias(true);
            }
            C27046k.m66711z(baseTextView5, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48588O4(this.f39848b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D16 = m48680D4();
        if (c37678r1M48680D16 != null && (kcPrimaryButton5 = c37678r1M48680D16.f84562m0) != null) {
            C27046k.m66711z(kcPrimaryButton5, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48590P4(this.f39851b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D17 = m48680D4();
        if (c37678r1M48680D17 != null && (kcSecondaryButton = c37678r1M48680D17.f84489C) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48592Q4(this.f39855b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D18 = m48680D4();
        if (c37678r1M48680D18 != null && (view = c37678r1M48680D18.f84488B0) != null) {
            C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48595R4(this.f39858b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D19 = m48680D4();
        if (c37678r1M48680D19 != null && (constraintLayout2 = c37678r1M48680D19.f84584x0) != null) {
            C27046k.m66711z(constraintLayout2, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48597S4(this.f39864b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D20 = m48680D4();
        if (c37678r1M48680D20 != null && (constraintLayout = c37678r1M48680D20.f84504J0) != null) {
            C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48599T4(this.f39861b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D21 = m48680D4();
        if (c37678r1M48680D21 != null && (kcPrimaryButton4 = c37678r1M48680D21.f84570q0) != null) {
            C27046k.m66711z(kcPrimaryButton4, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48601U4(this.f39958b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D22 = m48680D4();
        if (c37678r1M48680D22 != null && (kcPrimaryButton3 = c37678r1M48680D22.f84572r0) != null) {
            C27046k.m66711z(kcPrimaryButton3, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.i0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48603V4(this.f39849b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D23 = m48680D4();
        if (c37678r1M48680D23 != null && (kcPrimaryButton2 = c37678r1M48680D23.f84533Y) != null) {
            C27046k.m66711z(kcPrimaryButton2, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.t0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48605W4(this.f39882b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D24 = m48680D4();
        if (c37678r1M48680D24 != null && (baseTextView4 = c37678r1M48680D24.f84493E) != null) {
            C27046k.m66711z(baseTextView4, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.w0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48607X4(this.f39957b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D25 = m48680D4();
        if (c37678r1M48680D25 != null && (baseTextView3 = c37678r1M48680D25.f84503J) != null) {
            C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.x0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48609Y4(this.f39959b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D26 = m48680D4();
        if (c37678r1M48680D26 != null && (baseTextView2 = c37678r1M48680D26.f84527V) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.y0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48611Z4(this.f39962b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D27 = m48680D4();
        if (c37678r1M48680D27 != null && (kcPrimaryButton = c37678r1M48680D27.f84495F) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.z0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48613a5(this.f39965b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D28 = m48680D4();
        if (c37678r1M48680D28 != null && (baseTextView = c37678r1M48680D28.f84580v0) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.a1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48616b5(this.f39784b);
                }
            }, 1, null);
        }
        C37678r1 c37678r1M48680D29 = m48680D4();
        if (c37678r1M48680D29 != null) {
            BaseTextView tvTaxName = c37678r1M48680D29.f84566o0;
            Intrinsics.checkNotNullExpressionValue(tvTaxName, "tvTaxName");
            AppCompatImageView ivTaxQuestion = c37678r1M48680D29.f84573s;
            Intrinsics.checkNotNullExpressionValue(ivTaxQuestion, "ivTaxQuestion");
            C27046k.m66681D(new View[]{tvTaxName, ivTaxQuestion}, new Function0() { // from class: com.kubi.payment.p2p.order.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48618c5(this.f39790b);
                }
            });
        }
        C37678r1 c37678r1M48680D30 = m48680D4();
        if (c37678r1M48680D30 == null || (p2PViewChatCardEntrance = c37678r1M48680D30.f84496F0) == null) {
            return;
        }
        p2PViewChatCardEntrance.setOnChatClickListener(new Function0() { // from class: com.kubi.payment.p2p.order.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.m48620d5(this.f39799b);
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m48583M4(OrderDetailFragment orderDetailFragment) {
        orderDetailFragment.f39724W = true;
        orderDetailFragment.m48717j6();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public static final Unit m48585N4(OrderDetailFragment orderDetailFragment) {
        orderDetailFragment.f39724W = true;
        C4400a c4400aM56184f = Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/p2p/help", false, 2, null));
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        C4400a c4400aM4038a = c4400aM56184f.m4038a("orderId", C27041f.m66668h(f39744k0 != null ? f39744k0.getId() : null));
        OrderDetailInfo f39744k1 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        c4400aM4038a.m4038a("isSeller", Boolean.valueOf(!C27025c.m66566d(f39744k1 != null ? f39744k1.getBuyerRole() : null))).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w6 */
    public static final Unit m48667w6(OrderDetailFragment orderDetailFragment) {
        m48644o6(orderDetailFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B6 */
    public final void m48677B6(OrderDetailInfo orderDetailInfo) {
        AppCompatImageView appCompatImageView;
        Group group;
        Group group2;
        BaseTextView baseTextView;
        String strM66668h = C27041f.m66668h(orderDetailInfo != null ? orderDetailInfo.getFeeMessage() : null);
        if (strM66668h.length() > 0) {
            C37678r1 c37678r1M48680D4 = m48680D4();
            if (c37678r1M48680D4 != null && (baseTextView = c37678r1M48680D4.f84568p0) != null) {
                baseTextView.setText(strM66668h);
            }
            C37678r1 c37678r1M48680D5 = m48680D4();
            if (c37678r1M48680D5 != null && (group2 = c37678r1M48680D5.f84553i) != null) {
                C27046k.m66685H(group2);
            }
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new OrderDetailFragment$showTaxInfo$1(this, null));
            return;
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (group = c37678r1M48680D6.f84553i) != null) {
            C27046k.m66700o(group);
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 == null || (appCompatImageView = c37678r1M48680D7.f84573s) == null) {
            return;
        }
        C27046k.m66700o(appCompatImageView);
    }

    /* JADX INFO: renamed from: g5 */
    public final boolean m48713g5() {
        return true;
    }

    /* JADX INFO: renamed from: A4 */
    private final boolean m48561A4() {
        return ((Boolean) this.f39726Y.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ SpannableString m48565C4(OrderDetailFragment orderDetailFragment, int i11, String str, String str2, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = "";
        }
        if ((i13 & 8) != 0) {
            i12 = R$color.primary;
        }
        return orderDetailFragment.m48675B4(i11, str, str2, i12);
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m48579K4(OrderDetailFragment orderDetailFragment) {
        if (!C24129b.m58030b(SiteVisibleConfigKey.P2P)) {
            return Unit.INSTANCE;
        }
        OtcDepend.f38138a.m45471u(orderDetailFragment.getActivity(), "p2pOrder");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m48581L4() {
        IHelpCenterService.f25326a.get().mo1472a("360001278554");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public static final Unit m48588O4(OrderDetailFragment orderDetailFragment) {
        OrderPhoneNumberDialog.Companion companion = OrderPhoneNumberDialog.f39758u0;
        FragmentManager childFragmentManager = orderDetailFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        String nickName = f39744k0 != null ? f39744k0.getNickName() : null;
        OrderDetailInfo f39744k1 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        String areaCode = f39744k1 != null ? f39744k1.getAreaCode() : null;
        OrderDetailInfo f39744k2 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        String phone = f39744k2 != null ? f39744k2.getPhone() : null;
        OrderDetailInfo f39744k3 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        companion.show(childFragmentManager, nickName, areaCode, phone, f39744k3 != null ? f39744k3.getSecretPhone() : null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P4 */
    public static final Unit m48590P4(OrderDetailFragment orderDetailFragment) {
        C4400a c4400aM56184f = Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/p2p/appealSupplement", false, 2, null));
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        C4400a c4400aM4038a = c4400aM56184f.m4038a("orderId", C27041f.m66668h(f39744k0 != null ? f39744k0.getId() : null));
        OrderDetailInfo f39744k1 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        c4400aM4038a.m4038a("isSeller", Boolean.valueOf(!C27025c.m66566d(f39744k1 != null ? f39744k1.getBuyerRole() : null))).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: U4 */
    public static final Unit m48601U4(OrderDetailFragment orderDetailFragment) {
        String str = orderDetailFragment.f39723V;
        switch (str.hashCode()) {
            case -763423969:
                if (str.equals("BUY_STATUS_ORDER_APPEALING_OTHER")) {
                    orderDetailFragment.m48719n6(true);
                }
                break;
            case -602426708:
                if (str.equals("BUY_STATUS_ORDER_APPEALING_OTHER_CONSULT")) {
                    orderDetailFragment.m48719n6(true);
                }
                break;
            case 1930298803:
                if (str.equals("SELL_STATUS_ORDER_APPEALING_OTHER")) {
                    orderDetailFragment.m48719n6(true);
                }
                break;
            case 1998901568:
                if (str.equals("SELL_STATUS_ORDER_APPEALING_OTHER_CONSULT")) {
                    orderDetailFragment.m48719n6(true);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: V4 */
    public static final Unit m48603V4(OrderDetailFragment orderDetailFragment) {
        String str = orderDetailFragment.f39723V;
        switch (str.hashCode()) {
            case -763423969:
                if (str.equals("BUY_STATUS_ORDER_APPEALING_OTHER")) {
                    orderDetailFragment.m48718l6();
                }
                break;
            case -602426708:
                if (str.equals("BUY_STATUS_ORDER_APPEALING_OTHER_CONSULT")) {
                    orderDetailFragment.m48718l6();
                }
                break;
            case 1930298803:
                if (str.equals("SELL_STATUS_ORDER_APPEALING_OTHER")) {
                    orderDetailFragment.m48718l6();
                }
                break;
            case 1998901568:
                if (str.equals("SELL_STATUS_ORDER_APPEALING_OTHER_CONSULT")) {
                    orderDetailFragment.m48718l6();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W4 */
    public static final Unit m48605W4(OrderDetailFragment orderDetailFragment) {
        String str = orderDetailFragment.f39723V;
        int iHashCode = str.hashCode();
        if (iHashCode != -1013076637) {
            if (iHashCode != -152314122) {
                if (iHashCode == 477199513 && str.equals("SELL_STATUS_ORDER_PAY_COIN")) {
                    OrderDetailInfo f39744k0 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
                    Pair pairM90091to = TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(f39744k0 != null ? f39744k0.getLegalCurrency() : null));
                    OrderDetailInfo f39744k1 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
                    C43852m.m96590b("B7P2POrderDetails", "button", "1", pairM90091to, TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(f39744k1 != null ? f39744k1.getCurrency() : null)));
                    orderDetailFragment.m48725x6();
                }
            } else if (str.equals("BUY_STATUS_ORDER_WAIT_COIN")) {
                OrderDetailInfo f39744k2 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
                Pair pairM90091to2 = TuplesKt.m90091to("status", String.valueOf(f39744k2 != null ? f39744k2.getStatus() : null));
                OrderDetailInfo f39744k3 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
                Pair pairM90091to3 = TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(f39744k3 != null ? f39744k3.getLegalCurrency() : null));
                OrderDetailInfo f39744k4 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
                Pair pairM90091to4 = TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(f39744k4 != null ? f39744k4.getCurrency() : null));
                OrderDetailInfo f39744k5 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
                C43852m.m96590b("B7P2POrderDetails", "reminderSeller", "1", pairM90091to2, pairM90091to3, pairM90091to4, TuplesKt.m90091to("isP2PExpress", Boolean.valueOf(C27025c.m66566d(f39744k5 != null ? Boolean.valueOf(f39744k5.isP2PExpress()) : null))), TuplesKt.m90091to("norm_version", "1"));
                ((OrderDetailViewModel) orderDetailFragment.m45631m3()).m48795q0();
            }
        } else if (str.equals("BUY_STATUS_ORDER_CREATED")) {
            orderDetailFragment.m48720q5();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a5 */
    public static final Unit m48613a5(OrderDetailFragment orderDetailFragment) {
        if (Intrinsics.areEqual(orderDetailFragment.f39723V, "BUY_STATUS_ORDER_CHARGED") || Intrinsics.areEqual(orderDetailFragment.f39723V, "BUY_STATUS_EXPRESS_ORDER_FAILED") || Intrinsics.areEqual(orderDetailFragment.f39723V, "BUY_STATUS_EXPRESS_ORDER_SUCCEEDED")) {
            OrderDetailInfo f39744k0 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
            C43852m.m96590b("B7P2POrderDetails", "confirmDone", "1", TuplesKt.m90091to("isP2PExpress", Boolean.valueOf(C27025c.m66566d(f39744k0 != null ? Boolean.valueOf(f39744k0.isP2PExpress()) : null))));
            if (AppMode.INSTANCE.isLiteMode()) {
                Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, "convert").m4038a("entry", "main").m4038a(Constants.COMPONENT, "kucoin_convert_rn").m4038a("route", Uri.encode("ConvertPage")).m4048k();
            } else {
                InterfaceC37754f.a.m85140l(C37304a.f82764a, null, null, null, null, null, null, 63, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m48618c5(OrderDetailFragment orderDetailFragment) {
        P2PHelper p2PHelper = P2PHelper.f39683a;
        FragmentManager childFragmentManager = orderDetailFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        p2PHelper.m48412d(childFragmentManager, LifecycleOwnerKt.getLifecycleScope(orderDetailFragment));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d5 */
    public static final Unit m48620d5(OrderDetailFragment orderDetailFragment) {
        if (!C24129b.m58030b(SiteVisibleConfigKey.P2P)) {
            return Unit.INSTANCE;
        }
        orderDetailFragment.m48679C6();
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        C43852m.m96590b("B7P2POrderDetails", "contactUser", "1", TuplesKt.m90091to("isP2PExpress", Boolean.valueOf(C27025c.m66566d(f39744k0 != null ? Boolean.valueOf(f39744k0.isP2PExpress()) : null))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e6 */
    public static /* synthetic */ void m48622e6(OrderDetailFragment orderDetailFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        orderDetailFragment.m48709d6(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f6 */
    public static final boolean m48624f6() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C21095c().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_p2p_release", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k6 */
    public static final Unit m48634k6(OrderDetailFragment orderDetailFragment) {
        C4400a c4400aM56184f = Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/p2p/cancelOrder", false, 2, null));
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        C4400a c4400aM4038a = c4400aM56184f.m4038a("orderId", C27041f.m66668h(f39744k0 != null ? f39744k0.getId() : null));
        OrderDetailInfo f39744k1 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        C4400a c4400aM4038a2 = c4400aM4038a.m4038a("orderStatus", f39744k1 != null ? f39744k1.getStatus() : null);
        OrderDetailInfo f39744k2 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        C4400a c4400aM4038a3 = c4400aM4038a2.m4038a("fiatCurrency", C27041f.m66668h(f39744k2 != null ? f39744k2.getLegalCurrency() : null));
        OrderDetailInfo f39744k3 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        c4400aM4038a3.m4038a("cryptoCurrency", C27041f.m66668h(f39744k3 != null ? f39744k3.getCurrency() : null)).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m6 */
    public static final Unit m48639m6(OrderDetailFragment orderDetailFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((OrderDetailViewModel) orderDetailFragment.m45631m3()).m48769N(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n5 */
    public static final Unit m48641n5(OrderDetailFragment orderDetailFragment, Long l11) {
        C37678r1 c37678r1M48680D4;
        BaseTextView baseTextView;
        OrderDetailFragment orderDetailFragment2;
        BaseTextView baseTextView2;
        String str = orderDetailFragment.f39723V;
        if (Intrinsics.areEqual(str, "BUY_STATUS_ORDER_CREATED")) {
            C37678r1 c37678r1M48680D5 = orderDetailFragment.m48680D4();
            if (c37678r1M48680D5 == null || (baseTextView2 = c37678r1M48680D5.f84560l0) == null) {
                orderDetailFragment2 = orderDetailFragment;
            } else {
                int i11 = R$string.payment_p2p_order_created_subtitle_buyer;
                Intrinsics.checkNotNull(l11);
                String strM66417d = TimeUtils.m66417d(l11.longValue());
                Intrinsics.checkNotNullExpressionValue(strM66417d, "getCountdownMinSec(...)");
                orderDetailFragment2 = orderDetailFragment;
                baseTextView2.setText(m48565C4(orderDetailFragment, i11, strM66417d, null, 0, 12, null));
            }
            Intrinsics.checkNotNull(l11);
            orderDetailFragment2.m48727z4(l11.longValue());
        } else if (Intrinsics.areEqual(str, "SELL_STATUS_ORDER_CREATED") && (c37678r1M48680D4 = orderDetailFragment.m48680D4()) != null && (baseTextView = c37678r1M48680D4.f84560l0) != null) {
            int i12 = R$string.payment_detail_sell_create_sub_title;
            Intrinsics.checkNotNull(l11);
            String strM66417d2 = TimeUtils.m66417d(l11.longValue());
            Intrinsics.checkNotNullExpressionValue(strM66417d2, "getCountdownMinSec(...)");
            baseTextView.setText(m48565C4(orderDetailFragment, i12, strM66417d2, null, 0, 12, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o6 */
    public static /* synthetic */ void m48644o6(OrderDetailFragment orderDetailFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        orderDetailFragment.m48719n6(z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q6 */
    public static final Unit m48649q6(boolean z11, OrderDetailFragment orderDetailFragment) {
        if (z11) {
            return Unit.INSTANCE;
        }
        ((OrderDetailViewModel) orderDetailFragment.m45631m3()).m48763I0(false);
        orderDetailFragment.m48723u6();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r5 */
    public static final void m48651r5(OrderDetailFragment orderDetailFragment, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        TextView textView = (TextView) viewHolder.getView(R$id.text_view);
        textView.setText(orderDetailFragment.getStringRes(R$string.payment_p2p_price_alert, new Object[0]));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(textView);
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        highlightTextHelper.m54120f(textView, new Pair(textTagEnum, new UnderlineSpan()), new Pair(textTagEnum, new C27018c0(R$color.primary, new View.OnClickListener() { // from class: com.kubi.payment.p2p.order.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OrderDetailFragment.m48653s5(view);
            }
        })));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: s5 */
    public static final void m48653s5(View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C37242d.f82569a.m83348a(), null, null, null, null, null, null, 126, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y5 */
    public static final Unit m48671y5(OrderDetailFragment orderDetailFragment, int i11, String str, String str2, Boolean bool, Boolean bool2, String str3, Map map) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        if (i11 == 0 && str2 != null && str2.length() != 0) {
            ((OrderDetailViewModel) orderDetailFragment.m45631m3()).m48757B0("v3/otc/order/pay-coin", str2);
        } else if (i11 == 78858) {
            orderDetailFragment.m48722u5();
        } else {
            C43846g.m96568c(new OtcException(new Exception("safe validation fallback: " + str3 + ", serverErrorCode" + map), "payment_p2p_release", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public final SpannableString m48675B4(@StringRes int i11, String str, String str2, @ColorRes int i12) {
        SpannableString spannableString = new SpannableString(str2.length() > 0 ? getString(i11, str, str2) : getString(i11, str));
        spannableString.setSpan(new ForegroundColorSpan(getColorRes(i12)), StringsKt.indexOf$default((CharSequence) spannableString, str, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableString, str, 0, false, 6, (Object) null) + str.length(), 18);
        return spannableString;
    }

    /* JADX INFO: renamed from: D4 */
    public final C37678r1 m48680D4() {
        return (C37678r1) this.f39725X.getValue(this, f39722b0[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public final void m48682E4() {
        Intent intent = new Intent(this.mContext, (Class<?>) BaseActivity.class);
        intent.putExtra(BaseActivity.TITLE_BAR, CredentialEntry.FALSE_STRING);
        intent.putExtra("fragment", OrderTransferFragment.class.getName()).putExtra("data", ((OrderDetailViewModel) m45631m3()).m48788h0());
        intent.putExtra("spm", C43852m.m96602n("B7P2POrderDetails", "transferButton", null, 4, null));
        startActivityWithResult(intent, new Consumer() { // from class: com.kubi.payment.p2p.order.q0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderDetailFragment.m48570F4(this.f39874b, (Intent) obj);
            }
        });
        ((OrderDetailViewModel) m45631m3()).m48794p0();
    }

    /* JADX INFO: renamed from: G4 */
    public final void m48686G4(ReleaseCrypto releaseCrypto) {
        BannerInfo.Banner banner;
        KuCardHelper kuCardHelper = KuCardHelper.f39574a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        kuCardHelper.m48300f(childFragmentManager, (releaseCrypto == null || (banner = releaseCrypto.getBanner()) == null) ? null : banner.getLinkUrl(), FastQuoteModel.PAY_P2P);
    }

    /* JADX INFO: renamed from: H5 */
    public final void m48690H5() {
        P2PViewChatCardEntrance p2PViewChatCardEntrance;
        View viewFindViewById;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView5;
        ConstraintLayout constraintLayout3;
        AlertTipsTextView alertTipsTextView;
        P2PViewChatCardEntrance p2PViewChatCardEntrance2;
        View viewFindViewById2;
        if (C24129b.m58030b(SiteVisibleConfigKey.P2P)) {
            C37678r1 c37678r1M48680D4 = m48680D4();
            if (c37678r1M48680D4 != null && (p2PViewChatCardEntrance2 = c37678r1M48680D4.f84496F0) != null && (viewFindViewById2 = p2PViewChatCardEntrance2.findViewById(R$id.tvChat)) != null) {
                C27046k.m66685H(viewFindViewById2);
            }
        } else {
            C37678r1 c37678r1M48680D5 = m48680D4();
            if (c37678r1M48680D5 != null && (p2PViewChatCardEntrance = c37678r1M48680D5.f84496F0) != null && (viewFindViewById = p2PViewChatCardEntrance.findViewById(R$id.tvChat)) != null) {
                C27046k.m66700o(viewFindViewById);
            }
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (alertTipsTextView = c37678r1M48680D6.f84574s0) != null) {
            C27046k.m66700o(alertTipsTextView);
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (constraintLayout3 = c37678r1M48680D7.f84486A0) != null) {
            C27046k.m66700o(constraintLayout3);
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (baseTextView5 = c37678r1M48680D8.f84499H) != null) {
            C27046k.m66685H(baseTextView5);
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (constraintLayout2 = c37678r1M48680D9.f84536Z0) != null) {
            C27046k.m66700o(constraintLayout2);
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (baseTextView4 = c37678r1M48680D10.f84499H) != null) {
            C27046k.m66700o(baseTextView4);
        }
        C37678r1 c37678r1M48680D11 = m48680D4();
        if (c37678r1M48680D11 != null && (baseTextView3 = c37678r1M48680D11.f84505K) != null) {
            C27046k.m66685H(baseTextView3);
        }
        C37678r1 c37678r1M48680D12 = m48680D4();
        if (c37678r1M48680D12 != null && (constraintLayout = c37678r1M48680D12.f84494E0) != null) {
            C27046k.m66700o(constraintLayout);
        }
        C37678r1 c37678r1M48680D13 = m48680D4();
        if (c37678r1M48680D13 != null && (baseTextView2 = c37678r1M48680D13.f84576t0) != null) {
            baseTextView2.setText(getString(R$string.payment_detail_deal_complete));
        }
        C37678r1 c37678r1M48680D14 = m48680D4();
        if (c37678r1M48680D14 == null || (baseTextView = c37678r1M48680D14.f84560l0) == null) {
            return;
        }
        baseTextView.setText(getString(R$string.payment_detail_sell_payed_coin_sub_title));
    }

    /* JADX INFO: renamed from: b6 */
    public final void m48707b6(TextView textView) {
        if (textView != null) {
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            int i11 = R$color.c_text;
            highlightTextHelper.m54120f(textView, new Pair(textTagEnum, new ForegroundColorSpan(getColorRes(i11))), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new ForegroundColorSpan(getColorRes(i11))));
        }
    }

    /* JADX INFO: renamed from: c6 */
    public final void m48708c6(TextView textView) {
        if (textView != null) {
            HighlightTextHelper.f43497a.m54120f(textView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(getColorRes(R$color.c_text))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d6 */
    public final void m48709d6(boolean z11) {
        C4400a c4400aM56184f = Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/p2p/appealHistory", false, 2, null));
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        C4400a c4400aM4038a = c4400aM56184f.m4038a("orderId", C27041f.m66668h(f39744k0 != null ? f39744k0.getId() : null)).m4038a("isProcessing", Boolean.valueOf(z11));
        OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        c4400aM4038a.m4038a("hasAppealRecord", Boolean.valueOf(C27025c.m66566d(f39744k1 != null ? f39744k1.getHasRecord() : null))).m4048k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f5 */
    public final boolean m48712f5() {
        if (!CollectionsKt.listOf((Object[]) new String[]{"BUY_STATUS_ORDER_CREATED", "SELL_STATUS_ORDER_CREATED"}).contains(this.f39723V)) {
            return false;
        }
        List<AdPayType> listM48785e0 = ((OrderDetailViewModel) m45631m3()).m48785e0();
        return C27039d.m66650j(listM48785e0 != null ? Integer.valueOf(listM48785e0.size()) : null) > 1;
    }

    /* JADX INFO: renamed from: g6 */
    public final void m48714g6(TextView textView) {
        if (textView != null) {
            textView.setTextColor(getColorRes(R$color.c_text40));
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.payment_fragment_p2p_order_detail;
    }

    /* JADX INFO: renamed from: h6 */
    public final void m48716h6() {
        C37265w c37265w = C37265w.f82633a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        c37265w.m83408w(childFragmentManager, new Function0() { // from class: com.kubi.payment.p2p.order.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.m48629i6(this.f39852b);
            }
        });
    }

    /* JADX INFO: renamed from: l6 */
    public final void m48718l6() {
        C37265w c37265w = C37265w.f82633a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        c37265w.m83402D(childFragmentManager, new Function1() { // from class: com.kubi.payment.p2p.order.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailFragment.m48639m6(this.f39800b, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n6 */
    public final void m48719n6(final boolean z11) {
        C37265w c37265w = C37265w.f82633a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        c37265w.m83403I(childFragmentManager, new Function0() { // from class: com.kubi.payment.p2p.order.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.m48647p6(this.f39787b);
            }
        }, new Function0() { // from class: com.kubi.payment.p2p.order.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.m48649q6(z11, this);
            }
        });
    }

    /* JADX INFO: renamed from: r6 */
    public final void m48721r6() {
        C37265w c37265w = C37265w.f82633a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        c37265w.m83405S(childFragmentManager, new Function0() { // from class: com.kubi.payment.p2p.order.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.m48654s6(this.f39879b);
            }
        }, new Function0() { // from class: com.kubi.payment.p2p.order.u0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.m48657t6(this.f39951b);
            }
        });
    }

    @Override // com.kubi.payment.base.BaseFragment
    @NotNull
    /* JADX INFO: renamed from: s3 */
    public KClass<OrderDetailViewModel> mo45635s3() {
        return Reflection.getOrCreateKotlinClass(OrderDetailViewModel.class);
    }

    /* JADX INFO: renamed from: u5 */
    public final void m48722u5() {
        C38301b1.m86435H(this, ValidationBizEnum.OTC_SETTLE, null, new Consumer() { // from class: com.kubi.payment.p2p.order.o0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderDetailFragment.m48662v5(this.f39867b, obj);
            }
        }, new Consumer() { // from class: com.kubi.payment.p2p.order.p0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderDetailFragment.m48666w5(this.f39870b, (Throwable) obj);
            }
        }, null, 36, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x5 */
    public final void m48724x5() throws JSONException {
        ISafeService iSafeService = ISafeService.f46324a.get();
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        JSONObject jSONObject = new JSONObject();
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k0 != null) {
            jSONObject.put("adId", f39744k0.getAdId());
            jSONObject.put("legalCurrencyAmount", f39744k0.getLegalCurrencyAmount());
            jSONObject.put("currencyAmount", f39744k0.getCurrencyAmount());
            jSONObject.put("orderPrice", f39744k0.getPrice());
            jSONObject.put("legalCurrency", f39744k0.getLegalCurrency());
            jSONObject.put("cryptoCurrency", f39744k0.getCurrency());
            jSONObject.put("payTypeCode", f39744k0.getPayTypeCode());
            jSONObject.put("orderId", f39744k0.getId());
            OrderDetailInfo.AdInfo adInfo = f39744k0.getAdInfo();
            jSONObject.put("adSide", adInfo != null ? adInfo.getSide() : null);
        }
        Unit unit = Unit.INSTANCE;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ISafeService.m56306a(iSafeService, mContext, viewLifecycleOwner, "RV_P2P_TRADE_RELEASE", string, 0, true, new Function7() { // from class: com.kubi.payment.p2p.order.v0
            @Override // p852kotlin.jvm.functions.Function7
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return OrderDetailFragment.m48671y5(this.f39954b, ((Integer) obj).intValue(), (String) obj2, (String) obj3, (Boolean) obj4, (Boolean) obj5, (String) obj6, (Map) obj7);
            }
        }, 16, null);
    }

    /* JADX INFO: renamed from: x6 */
    public final void m48725x6() {
        C37265w c37265w = C37265w.f82633a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        c37265w.m83406X(childFragmentManager, new Function0() { // from class: com.kubi.payment.p2p.order.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.m48672y6(this.f39796b);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final void m48726y4() {
        if (this.f39723V.length() == 0) {
            return;
        }
        OrderProcessDialog.Companion companion = OrderProcessDialog.f39763s0;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        boolean zM66566d = C27025c.m66566d(f39744k0 != null ? f39744k0.getBuyerRole() : null);
        OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        companion.clearDialogStore(zM66566d, f39744k1 != null ? f39744k1.getId() : null, Intrinsics.areEqual(this.f39723V, "BUY_STATUS_ORDER_CREATED"), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final void m48727z4(long j11) {
        if (Intrinsics.areEqual(this.f39723V, "BUY_STATUS_ORDER_CREATED") && j11 <= 600000 && !this.f39727Z) {
            OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            String id2 = f39744k0 != null ? f39744k0.getId() : null;
            if (id2 == null || id2.length() == 0) {
                return;
            }
            if (!C46392a.m102322d(PaymentStorageId.f40364a.m49847y(id2, 2), false)) {
                OrderProcessDialog.f39763s0.show(this, id2, 2);
            }
            this.f39727Z = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z5 */
    public final void m48728z5() {
        P2PViewChatCardEntrance p2PViewChatCardEntrance;
        View viewFindViewById;
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        ConstraintLayout constraintLayout3;
        BaseTextView baseTextView6;
        ConstraintLayout constraintLayout4;
        AlertTipsTextView alertTipsTextView;
        P2PViewChatCardEntrance p2PViewChatCardEntrance2;
        View viewFindViewById2;
        if (C24129b.m58030b(SiteVisibleConfigKey.P2P)) {
            C37678r1 c37678r1M48680D4 = m48680D4();
            if (c37678r1M48680D4 != null && (p2PViewChatCardEntrance2 = c37678r1M48680D4.f84496F0) != null && (viewFindViewById2 = p2PViewChatCardEntrance2.findViewById(R$id.tvChat)) != null) {
                C27046k.m66685H(viewFindViewById2);
            }
        } else {
            C37678r1 c37678r1M48680D5 = m48680D4();
            if (c37678r1M48680D5 != null && (p2PViewChatCardEntrance = c37678r1M48680D5.f84496F0) != null && (viewFindViewById = p2PViewChatCardEntrance.findViewById(R$id.tvChat)) != null) {
                C27046k.m66700o(viewFindViewById);
            }
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (alertTipsTextView = c37678r1M48680D6.f84574s0) != null) {
            C27046k.m66700o(alertTipsTextView);
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (constraintLayout4 = c37678r1M48680D7.f84486A0) != null) {
            C27046k.m66700o(constraintLayout4);
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (baseTextView6 = c37678r1M48680D8.f84499H) != null) {
            C27046k.m66685H(baseTextView6);
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (constraintLayout3 = c37678r1M48680D9.f84536Z0) != null) {
            C27046k.m66700o(constraintLayout3);
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (baseTextView5 = c37678r1M48680D10.f84499H) != null) {
            C27046k.m66700o(baseTextView5);
        }
        C37678r1 c37678r1M48680D11 = m48680D4();
        if (c37678r1M48680D11 != null && (baseTextView4 = c37678r1M48680D11.f84505K) != null) {
            C27046k.m66685H(baseTextView4);
        }
        C37678r1 c37678r1M48680D12 = m48680D4();
        if (c37678r1M48680D12 != null && (baseTextView3 = c37678r1M48680D12.f84560l0) != null) {
            C27046k.m66700o(baseTextView3);
        }
        C37678r1 c37678r1M48680D13 = m48680D4();
        if (c37678r1M48680D13 != null && (baseTextView2 = c37678r1M48680D13.f84560l0) != null) {
            baseTextView2.setText(getString(R$string.payment_detail_buy_payed_coin_sub_title));
        }
        C37678r1 c37678r1M48680D14 = m48680D4();
        if (c37678r1M48680D14 != null && (constraintLayout2 = c37678r1M48680D14.f84508L0) != null) {
            C27046k.m66700o(constraintLayout2);
        }
        C37678r1 c37678r1M48680D15 = m48680D4();
        if (c37678r1M48680D15 != null && (constraintLayout = c37678r1M48680D15.f84530W0) != null) {
            C27046k.m66700o(constraintLayout);
        }
        C37678r1 c37678r1M48680D16 = m48680D4();
        if (c37678r1M48680D16 != null && (baseTextView = c37678r1M48680D16.f84576t0) != null) {
            baseTextView.setText(getString(R$string.payment_detail_deal_complete));
        }
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (C27025c.m66566d(f39744k0 != null ? Boolean.valueOf(f39744k0.isP2PExpress()) : null)) {
            return;
        }
        m48706Z5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z6 */
    public final void m48729z6() {
        C37265w c37265w = C37265w.f82633a;
        AdPayType f39746m0 = ((OrderDetailViewModel) m45631m3()).getF39746m0();
        String id2 = f39746m0 != null ? f39746m0.getId() : null;
        List<AdPayType> listM48785e0 = ((OrderDetailViewModel) m45631m3()).m48785e0();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        c37265w.m83407Y(id2, listM48785e0, childFragmentManager, new Function1() { // from class: com.kubi.payment.p2p.order.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailFragment.m48562A6(this.f39783b, (AdPayType) obj);
            }
        });
    }

    public OrderDetailFragment() {
        setPageId("B7P2POrderDetails");
        this.f39726Y = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.order.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(OrderDetailFragment.m48624f6());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A6 */
    public static final Unit m48562A6(OrderDetailFragment orderDetailFragment, AdPayType adPayType) {
        ((OrderDetailViewModel) orderDetailFragment.m45631m3()).m48762H0(adPayType);
        orderDetailFragment.m48687G5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D6 */
    public static final Unit m48567D6(OrderDetailFragment orderDetailFragment) {
        orderDetailFragment.hideDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F4 */
    public static final void m48570F4(OrderDetailFragment orderDetailFragment, Intent intent) {
        Boolean boolValueOf;
        OrderDetailViewModel.m48744b0((OrderDetailViewModel) orderDetailFragment.m45631m3(), false, 1, null);
        if (intent != null) {
            boolValueOf = Boolean.valueOf(RouteExKt.m56248g(intent, "data", false));
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            OrderDetailViewModel.m48754y0((OrderDetailViewModel) orderDetailFragment.m45631m3(), false, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F6 */
    public static final void m48571F6(OrderDetailFragment orderDetailFragment) {
        OrderDetailViewModel.m48744b0((OrderDetailViewModel) orderDetailFragment.m45631m3(), false, 1, null);
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m48577J4(OrderDetailFragment orderDetailFragment) {
        orderDetailFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N5 */
    public static final void m48586N5(OrderDetailFragment orderDetailFragment) {
        KcPrimaryButton kcPrimaryButton;
        C37678r1 c37678r1M48680D4 = orderDetailFragment.m48680D4();
        if (c37678r1M48680D4 != null && (kcPrimaryButton = c37678r1M48680D4.f84495F) != null) {
            kcPrimaryButton.m55043o();
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m48592Q4(OrderDetailFragment orderDetailFragment) {
        orderDetailFragment.m48716h6();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q5 */
    public static final Unit m48593Q5(OrderDetailFragment orderDetailFragment) {
        OrderDetailViewModel.m48744b0((OrderDetailViewModel) orderDetailFragment.m45631m3(), false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m48595R4(OrderDetailFragment orderDetailFragment) {
        View view;
        C37678r1 c37678r1M48680D4 = orderDetailFragment.m48680D4();
        if (c37678r1M48680D4 != null && (view = c37678r1M48680D4.f84582w0) != null) {
            C27046k.m66700o(view);
        }
        orderDetailFragment.m48709d6(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m48597S4(OrderDetailFragment orderDetailFragment) {
        View view;
        C37678r1 c37678r1M48680D4 = orderDetailFragment.m48680D4();
        if (c37678r1M48680D4 != null && (view = c37678r1M48680D4.f84586y0) != null) {
            C27046k.m66700o(view);
        }
        m48622e6(orderDetailFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m48599T4(OrderDetailFragment orderDetailFragment) {
        if (orderDetailFragment.m48712f5()) {
            orderDetailFragment.m48729z6();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X4 */
    public static final Unit m48607X4(OrderDetailFragment orderDetailFragment) {
        String strM66668h;
        String legalCurrencyAmount;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        if (f39744k0 != null && (legalCurrencyAmount = f39744k0.getLegalCurrencyAmount()) != null) {
            strM66668h = C27041f.m66668h(legalCurrencyAmount);
        } else {
            strM66668h = null;
        }
        C27057k.m66746b(strM66668h);
        ToastCompat.m66441G(orderDetailFragment.getString(R$string.copy_success), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y4 */
    public static final Unit m48609Y4(OrderDetailFragment orderDetailFragment) {
        String id2;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        if (f39744k0 != null) {
            id2 = f39744k0.getId();
        } else {
            id2 = null;
        }
        C27057k.m66746b(C27041f.m66668h(id2));
        ToastCompat.m66441G(orderDetailFragment.getString(R$string.copy_success), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z4 */
    public static final Unit m48611Z4(OrderDetailFragment orderDetailFragment) {
        Boolean displayOpTradeInfo;
        if (!orderDetailFragment.m48713g5()) {
            return Unit.INSTANCE;
        }
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        String adId = null;
        if (f39744k0 != null) {
            displayOpTradeInfo = f39744k0.getDisplayOpTradeInfo();
        } else {
            displayOpTradeInfo = null;
        }
        if (C27025c.m66566d(displayOpTradeInfo)) {
            C4400a c4400aM56184f = Router.f46192a.m56184f(FlutterUtils.f39512a.m48218a("/payment/p2p/op/user/info", false));
            OrderDetailInfo f39744k1 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
            if (f39744k1 != null) {
                adId = f39744k1.getId();
            }
            c4400aM56184f.m4038a("orderId", adId).m4048k();
        } else {
            FlutterNavigationHelper flutterNavigationHelper = FlutterNavigationHelper.f39477a;
            OrderDetailInfo f39744k2 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
            if (f39744k2 != null) {
                adId = f39744k2.getAdId();
            }
            flutterNavigationHelper.m48165d(C27041f.m66668h(adId));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a6 */
    private final void m48614a6() {
        Boolean buyerRole;
        String strM48916c;
        m48685F5();
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k0 != null) {
            buyerRole = f39744k0.getBuyerRole();
        } else {
            buyerRole = null;
        }
        if (C27025c.m66566d(buyerRole)) {
            strM48916c = P2POrderUIStatus.f39868a.m48914a(((OrderDetailViewModel) m45631m3()).getF39744k0());
        } else {
            strM48916c = P2POrderUIStatus.f39868a.m48916c(((OrderDetailViewModel) m45631m3()).getF39744k0());
        }
        this.f39723V = strM48916c;
        m48726y4();
        m48683E5();
        m48678C5();
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null) {
            m48705Y5(c37678r1M48680D4);
        }
        String str = this.f39723V;
        switch (str.hashCode()) {
            case -1969288990:
                if (!str.equals("BUY_STATUS_ORDER_APPEALING_OWN_CONSULT")) {
                }
                m48701U5();
                break;
            case -1757216939:
                if (!str.equals("BUY_STATUS_ORDER_APPEALING_OWN")) {
                }
                m48703W5();
                break;
            case -1303017751:
                if (!str.equals("SELL_STATUS_ORDER_APPEALING_OWN")) {
                }
                m48703W5();
                break;
            case -1302568277:
                if (str.equals("BUY_STATUS_ORDER_CHARGED")) {
                    m48728z5();
                    break;
                }
                break;
            case -1263428599:
                if (!str.equals("SELL_STATUS_ORDER_APPEALING_OTHER_SERVICE")) {
                }
                m48699S5();
                break;
            case -1045221046:
                if (!str.equals("SELL_STATUS_ORDER_CANCELED")) {
                }
                m48704X5();
                break;
            case -1013076637:
                if (str.equals("BUY_STATUS_ORDER_CREATED")) {
                    m48674A5();
                    break;
                }
                break;
            case -936651861:
                if (!str.equals("BUY_STATUS_ORDER_APPEALING_OWN_SERVICE")) {
                }
                m48702V5();
                break;
            case -763423969:
                if (!str.equals("BUY_STATUS_ORDER_APPEALING_OTHER")) {
                }
                m48700T5();
                break;
            case -602426708:
                if (!str.equals("BUY_STATUS_ORDER_APPEALING_OTHER_CONSULT")) {
                }
                m48698R5();
                break;
            case -152314122:
                if (str.equals("BUY_STATUS_ORDER_WAIT_COIN")) {
                    m48676B5();
                    break;
                }
                break;
            case 190011949:
                if (str.equals("BUY_STATUS_EXPRESS_ORDER_CANCELED")) {
                    m48693K5();
                    break;
                }
                break;
            case 293677375:
                if (str.equals("SELL_STATUS_ORDER_CHARGED")) {
                    m48690H5();
                    break;
                }
                break;
            case 345162449:
                if (str.equals("BUY_STATUS_EXPRESS_ORDER_FAILED")) {
                    m48694L5();
                    break;
                }
                break;
            case 430210421:
                if (!str.equals("BUY_STATUS_ORDER_APPEALING_OTHER_SERVICE")) {
                }
                m48699S5();
                break;
            case 477199513:
                if (str.equals("SELL_STATUS_ORDER_PAY_COIN")) {
                    m48692J5();
                    break;
                }
                break;
            case 583169015:
                if (str.equals("SELL_STATUS_ORDER_CREATED")) {
                    m48691I5();
                    break;
                }
                break;
            case 710043314:
                if (str.equals("BUY_STATUS_EXPRESS_ORDER_UNCONFIRMED")) {
                    m48697P5();
                    break;
                }
                break;
            case 745925543:
                if (str.equals("BUY_STATUS_EXPRESS_ORDER_PROCESSING")) {
                    m48695M5();
                    break;
                }
                break;
            case 1010771294:
                if (!str.equals("BUY_STATUS_ORDER_CANCELED")) {
                }
                m48704X5();
                break;
            case 1103805558:
                if (!str.equals("SELL_STATUS_ORDER_APPEALING_OWN_CONSULT")) {
                }
                m48701U5();
                break;
            case 1930298803:
                if (!str.equals("SELL_STATUS_ORDER_APPEALING_OTHER")) {
                }
                m48700T5();
                break;
            case 1998901568:
                if (!str.equals("SELL_STATUS_ORDER_APPEALING_OTHER_CONSULT")) {
                }
                m48698R5();
                break;
            case 2064555821:
                if (str.equals("BUY_STATUS_EXPRESS_ORDER_SUCCEEDED")) {
                    m48696O5();
                    break;
                }
                break;
            case 2136442687:
                if (!str.equals("SELL_STATUS_ORDER_APPEALING_OWN_SERVICE")) {
                }
                m48702V5();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b5 */
    public static final Unit m48616b5(OrderDetailFragment orderDetailFragment) {
        Boolean boolValueOf;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
        if (f39744k0 != null) {
            boolValueOf = Boolean.valueOf(f39744k0.isP2PExpress());
        } else {
            boolValueOf = null;
        }
        C43852m.m96590b("B7P2POrderDetails", "viewAssets", "1", TuplesKt.m90091to("isP2PExpress", Boolean.valueOf(C27025c.m66566d(boolValueOf))));
        InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i5 */
    public static final Unit m48628i5(OrderDetailFragment orderDetailFragment, Boolean bool) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        if (bool.booleanValue()) {
            C37678r1 c37678r1M48680D4 = orderDetailFragment.m48680D4();
            if (c37678r1M48680D4 != null && (baseTextView2 = c37678r1M48680D4.f84515P) != null) {
                C27046k.m66685H(baseTextView2);
            }
        } else {
            C37678r1 c37678r1M48680D5 = orderDetailFragment.m48680D4();
            if (c37678r1M48680D5 != null && (baseTextView = c37678r1M48680D5.f84515P) != null) {
                C27046k.m66700o(baseTextView);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i6 */
    public static final Unit m48629i6(OrderDetailFragment orderDetailFragment) {
        ((OrderDetailViewModel) orderDetailFragment.m45631m3()).m48767M();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j5 */
    public static final Unit m48631j5(OrderDetailFragment orderDetailFragment, Boolean bool) {
        if (bool.booleanValue()) {
            orderDetailFragment.showContentView();
            orderDetailFragment.m48614a6();
            orderDetailFragment.m48688G6();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k5 */
    public static final Unit m48633k5(OrderDetailFragment orderDetailFragment, Boolean bool) {
        Boolean buyerRole;
        String str;
        if (bool.booleanValue()) {
            orderDetailFragment.m48684E6();
            OrderDetailInfo f39744k0 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
            if (f39744k0 != null) {
                buyerRole = f39744k0.getBuyerRole();
            } else {
                buyerRole = null;
            }
            if (C27025c.m66566d(buyerRole)) {
                str = "Buy";
            } else {
                str = "Sell";
            }
            C43852m.m96594f("B7P2POrderDetails", "orderPage", "1", TuplesKt.m90091to("type", str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l5 */
    public static final Unit m48636l5(OrderDetailFragment orderDetailFragment, Boolean bool) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        if (bool.booleanValue()) {
            orderDetailFragment.m48687G5();
            if (orderDetailFragment.m48712f5()) {
                C37678r1 c37678r1M48680D4 = orderDetailFragment.m48680D4();
                if (c37678r1M48680D4 != null && (appCompatImageView2 = c37678r1M48680D4.f84559l) != null) {
                    C27046k.m66685H(appCompatImageView2);
                }
            } else {
                C37678r1 c37678r1M48680D5 = orderDetailFragment.m48680D4();
                if (c37678r1M48680D5 != null && (appCompatImageView = c37678r1M48680D5.f84559l) != null) {
                    C27046k.m66700o(appCompatImageView);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m5 */
    public static final Unit m48638m5(OrderDetailFragment orderDetailFragment, Boolean bool) {
        KcPrimaryButton kcPrimaryButton;
        if (bool.booleanValue()) {
            C37678r1 c37678r1M48680D4 = orderDetailFragment.m48680D4();
            if (c37678r1M48680D4 != null && (kcPrimaryButton = c37678r1M48680D4.f84533Y) != null) {
                kcPrimaryButton.setEnabled(false);
            }
            ToastCompat.m66437C(R$string.payment_p2p_order_call_coin_toast_new);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o5 */
    public static final Unit m48643o5(OrderDetailFragment orderDetailFragment, Long l11) {
        BaseTextView baseTextView;
        String currency;
        C37678r1 c37678r1M48680D4 = orderDetailFragment.m48680D4();
        if (c37678r1M48680D4 != null && (baseTextView = c37678r1M48680D4.f84560l0) != null) {
            int i11 = R$string.payment_p2p_order_payedMoney_subtitle_buyer;
            Intrinsics.checkNotNull(l11);
            String strM66417d = TimeUtils.m66417d(l11.longValue());
            Intrinsics.checkNotNullExpressionValue(strM66417d, "getCountdownMinSec(...)");
            OrderDetailInfo f39744k0 = ((OrderDetailViewModel) orderDetailFragment.m45631m3()).getF39744k0();
            if (f39744k0 != null) {
                currency = f39744k0.getCurrency();
            } else {
                currency = null;
            }
            baseTextView.setText(m48565C4(orderDetailFragment, i11, strM66417d, C27041f.m66668h(currency), 0, 8, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p5 */
    public static final Unit m48646p5(OrderDetailFragment orderDetailFragment, ReleaseCrypto releaseCrypto) {
        orderDetailFragment.m48686G4(releaseCrypto);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p6 */
    public static final Unit m48647p6(OrderDetailFragment orderDetailFragment) {
        ((OrderDetailViewModel) orderDetailFragment.m45631m3()).m48756A0();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s6 */
    public static final Unit m48654s6(OrderDetailFragment orderDetailFragment) {
        OrderDetailViewModel.m48743O((OrderDetailViewModel) orderDetailFragment.m45631m3(), null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t5 */
    public static final void m48656t5(OrderDetailFragment orderDetailFragment, DialogInterface dialogInterface, int i11) {
        orderDetailFragment.m48682E4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t6 */
    public static final Unit m48657t6(OrderDetailFragment orderDetailFragment) {
        ((OrderDetailViewModel) orderDetailFragment.m45631m3()).m48763I0(false);
        orderDetailFragment.m48723u6();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v5 */
    public static final void m48662v5(OrderDetailFragment orderDetailFragment, Object obj) {
        orderDetailFragment.hideDialogLoading();
        OrderDetailViewModel.m48733C0((OrderDetailViewModel) orderDetailFragment.m45631m3(), "v2/otc/order/pay-coin", null, 2, null);
    }

    /* JADX INFO: renamed from: v6 */
    public static final Unit m48663v6(OrderDetailFragment orderDetailFragment) {
        orderDetailFragment.m48721r6();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public static final /* synthetic */ OrderDetailViewModel m48665w4(OrderDetailFragment orderDetailFragment) {
        return (OrderDetailViewModel) orderDetailFragment.m45631m3();
    }

    /* JADX INFO: renamed from: w5 */
    public static final void m48666w5(OrderDetailFragment orderDetailFragment, Throwable th2) {
        orderDetailFragment.hideDialogLoading();
        if (th2 instanceof ApiException) {
            orderDetailFragment.showToast(((ApiException) th2).getMessage());
        }
    }

    /* JADX INFO: renamed from: y6 */
    public static final Unit m48672y6(OrderDetailFragment orderDetailFragment) throws JSONException {
        if (orderDetailFragment.m48561A4()) {
            orderDetailFragment.m48724x5();
        } else {
            orderDetailFragment.m48722u5();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A5 */
    public final void m48674A5() {
        KcPrimaryButton kcPrimaryButton;
        AlertTipsTextView alertTipsTextView;
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        AlertTipsTextView alertTipsTextView2;
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (alertTipsTextView2 = c37678r1M48680D4.f84574s0) != null) {
            C27046k.m66685H(alertTipsTextView2);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (constraintLayout3 = c37678r1M48680D5.f84536Z0) != null) {
            C27046k.m66685H(constraintLayout3);
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (constraintLayout2 = c37678r1M48680D6.f84494E0) != null) {
            C27046k.m66685H(constraintLayout2);
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (constraintLayout = c37678r1M48680D7.f84508L0) != null) {
            C27046k.m66685H(constraintLayout);
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (baseTextView = c37678r1M48680D8.f84576t0) != null) {
            baseTextView.setText(getString(R$string.payment_p2p_order_created_title));
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (alertTipsTextView = c37678r1M48680D9.f84574s0) != null) {
            alertTipsTextView.setText(getString(R$string.payment_p2p_order_created_desc_buyer));
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (kcPrimaryButton = c37678r1M48680D10.f84533Y) != null) {
            kcPrimaryButton.setText(getString(R$string.payment_p2p_order_go_transfer));
        }
        ((OrderDetailViewModel) m45631m3()).m48766L0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B5 */
    public final void m48676B5() {
        KcPrimaryButton kcPrimaryButton;
        Boolean enableNotifyPayCoin;
        KcPrimaryButton kcPrimaryButton2;
        AlertTipsTextView alertTipsTextView;
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        KcPrimaryButton kcPrimaryButton3;
        ConstraintLayout constraintLayout3;
        BaseTextView baseTextView2;
        ConstraintLayout constraintLayout4;
        BaseTextView baseTextView3;
        ConstraintLayout constraintLayout5;
        AlertTipsTextView alertTipsTextView2;
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (alertTipsTextView2 = c37678r1M48680D4.f84574s0) != null) {
            C27046k.m66685H(alertTipsTextView2);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (constraintLayout5 = c37678r1M48680D5.f84486A0) != null) {
            C27046k.m66700o(constraintLayout5);
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (baseTextView3 = c37678r1M48680D6.f84499H) != null) {
            C27046k.m66685H(baseTextView3);
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (constraintLayout4 = c37678r1M48680D7.f84536Z0) != null) {
            C27046k.m66685H(constraintLayout4);
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (baseTextView2 = c37678r1M48680D8.f84499H) != null) {
            C27046k.m66685H(baseTextView2);
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (constraintLayout3 = c37678r1M48680D9.f84494E0) != null) {
            C27046k.m66685H(constraintLayout3);
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (kcPrimaryButton3 = c37678r1M48680D10.f84495F) != null) {
            C27046k.m66700o(kcPrimaryButton3);
        }
        C37678r1 c37678r1M48680D11 = m48680D4();
        if (c37678r1M48680D11 != null && (constraintLayout2 = c37678r1M48680D11.f84508L0) != null) {
            C27046k.m66685H(constraintLayout2);
        }
        C37678r1 c37678r1M48680D12 = m48680D4();
        if (c37678r1M48680D12 != null && (constraintLayout = c37678r1M48680D12.f84530W0) != null) {
            C27046k.m66700o(constraintLayout);
        }
        C37678r1 c37678r1M48680D13 = m48680D4();
        if (c37678r1M48680D13 != null && (baseTextView = c37678r1M48680D13.f84576t0) != null) {
            baseTextView.setText(getString(R$string.payment_p2p_order_wait_seller_confirm));
        }
        C37678r1 c37678r1M48680D14 = m48680D4();
        if (c37678r1M48680D14 != null && (alertTipsTextView = c37678r1M48680D14.f84574s0) != null) {
            alertTipsTextView.setText(getString(R$string.payment_p2p_order_payedMoney_desc_buyer));
        }
        C37678r1 c37678r1M48680D15 = m48680D4();
        if (c37678r1M48680D15 != null && (kcPrimaryButton2 = c37678r1M48680D15.f84533Y) != null) {
            kcPrimaryButton2.setText(getString(R$string.payment_p2p_order_call_coin));
        }
        C37678r1 c37678r1M48680D16 = m48680D4();
        if (c37678r1M48680D16 != null && (kcPrimaryButton = c37678r1M48680D16.f84533Y) != null) {
            OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k0 != null) {
                enableNotifyPayCoin = f39744k0.getEnableNotifyPayCoin();
            } else {
                enableNotifyPayCoin = null;
            }
            kcPrimaryButton.setEnabled(C27025c.m66566d(enableNotifyPayCoin));
        }
        ((OrderDetailViewModel) m45631m3()).m48758D0();
        ((OrderDetailViewModel) m45631m3()).m48768M0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C5 */
    public final void m48678C5() {
        String letter;
        String nickName;
        Boolean boolIsMerchant;
        MerchantQualificationDialog.MerchantQualification merchantQualification;
        Integer numValueOf;
        P2PViewChatCardEntrance p2PViewChatCardEntrance;
        OrderDetailInfo.OpUserInfo opUserInfo;
        boolean z11;
        OrderDetailInfo.OpUserInfo opUserInfo2;
        Integer goldMerchant;
        OrderDetailInfo.OpUserInfo opUserInfo3;
        Integer foxKingMerchant;
        OrderDetailInfo.OpUserInfo opUserInfo4;
        OrderDetailInfo.OpUserInfo opUserInfo5;
        OrderDetailInfo.OpUserInfo opUserInfo6;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        Boolean online = null;
        if (f39744k0 != null && (opUserInfo6 = f39744k0.getOpUserInfo()) != null) {
            letter = opUserInfo6.getLetter();
        } else {
            letter = null;
        }
        if (f39744k0 != null && (opUserInfo5 = f39744k0.getOpUserInfo()) != null) {
            nickName = opUserInfo5.getNickName();
        } else {
            nickName = null;
        }
        if (f39744k0 != null && (opUserInfo4 = f39744k0.getOpUserInfo()) != null) {
            boolIsMerchant = opUserInfo4.isMerchant();
        } else {
            boolIsMerchant = null;
        }
        if (C27025c.m66566d(boolIsMerchant)) {
            boolean z12 = false;
            if (f39744k0 != null && (opUserInfo3 = f39744k0.getOpUserInfo()) != null && (foxKingMerchant = opUserInfo3.getFoxKingMerchant()) != null && foxKingMerchant.intValue() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z11);
            if (f39744k0 != null && (opUserInfo2 = f39744k0.getOpUserInfo()) != null && (goldMerchant = opUserInfo2.getGoldMerchant()) != null && goldMerchant.intValue() == 1) {
                z12 = true;
            }
            merchantQualification = new MerchantQualificationDialog.MerchantQualification(null, null, boolValueOf, Boolean.valueOf(z12), 3, null);
        } else {
            merchantQualification = null;
        }
        if (f39744k0 != null) {
            numValueOf = Integer.valueOf(f39744k0.getUnreadMsgCount());
        } else {
            numValueOf = null;
        }
        if (f39744k0 != null && (opUserInfo = f39744k0.getOpUserInfo()) != null) {
            online = opUserInfo.getOnline();
        }
        P2PViewChatCardEntrance.P2PChatCardEntranceInfo p2PChatCardEntranceInfo = new P2PViewChatCardEntrance.P2PChatCardEntranceInfo(letter, nickName, merchantQualification, numValueOf, online);
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (p2PViewChatCardEntrance = c37678r1M48680D4.f84496F0) != null) {
            p2PViewChatCardEntrance.m49414h(p2PChatCardEntranceInfo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C6 */
    public final void m48679C6() {
        Boolean canChat;
        Boolean displayOpTradeInfo;
        String adRemarks = null;
        OrderDetailViewModel.m48754y0((OrderDetailViewModel) m45631m3(), false, 1, null);
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k0 != null) {
            canChat = f39744k0.getCanChat();
        } else {
            canChat = null;
        }
        boolean z11 = !C27025c.m66567e(canChat, true);
        OrderChatHelper f39743j0 = ((OrderDetailViewModel) m45631m3()).getF39743j0();
        if (f39743j0 != null) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k1 != null) {
                displayOpTradeInfo = f39744k1.getDisplayOpTradeInfo();
            } else {
                displayOpTradeInfo = null;
            }
            boolean zM66566d = C27025c.m66566d(displayOpTradeInfo);
            OrderDetailInfo f39744k2 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k2 != null) {
                adRemarks = f39744k2.getAdRemarks();
            }
            f39743j0.m46074v(mContext, zM66566d, z11, C27041f.m66668h(adRemarks), new Function0() { // from class: com.kubi.payment.p2p.order.n0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailFragment.m48567D6(this.f39865b);
                }
            });
        }
        this.f39724W = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D5 */
    public final void m48681D5() {
        BaseTextView baseTextView;
        OrderDetailInfo.ExpressInfo expressInfo;
        OrderDetailInfo.ExpressInfo expressInfo2;
        BaseTextView baseTextView2;
        String referencePrice;
        OrderDetailInfo.ExpressInfo expressInfo3;
        String fromCurrency;
        OrderDetailInfo.ExpressInfo expressInfo4;
        BaseTextView baseTextView3;
        String depositCurrency;
        OrderDetailInfo.ExpressInfo expressInfo5;
        BaseTextView baseTextView4;
        String depositCurrency2;
        OrderDetailInfo.ExpressInfo expressInfo6;
        ConstraintLayout constraintLayout;
        Group group;
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (group = c37678r1M48680D4.f84551h) != null) {
            C27046k.m66685H(group);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (constraintLayout = c37678r1M48680D5.f84575t) != null) {
            C27046k.m66685H(constraintLayout);
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        String depositCurrency3 = null;
        if (c37678r1M48680D6 != null && (baseTextView4 = c37678r1M48680D6.f84556j0) != null) {
            int i11 = R$string.p2pexpress_covert_title;
            OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k0 != null && (expressInfo6 = f39744k0.getExpressInfo()) != null) {
                depositCurrency2 = expressInfo6.getDepositCurrency();
            } else {
                depositCurrency2 = null;
            }
            baseTextView4.setText(getStringRes(i11, depositCurrency2));
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (baseTextView3 = c37678r1M48680D7.f84544d0) != null) {
            int i12 = R$string.payment_crypto_price;
            OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k1 != null && (expressInfo5 = f39744k1.getExpressInfo()) != null) {
                depositCurrency = expressInfo5.getDepositCurrency();
            } else {
                depositCurrency = null;
            }
            baseTextView3.setText(getStringRes(i12, depositCurrency));
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        String depositAmount = C33820nf.f71144W;
        if (c37678r1M48680D8 != null && (baseTextView2 = c37678r1M48680D8.f84546e0) != null) {
            int i13 = R$string.payment_price;
            if (Intrinsics.areEqual(this.f39723V, "BUY_STATUS_EXPRESS_ORDER_CANCELED")) {
                referencePrice = C33820nf.f71144W;
            } else {
                OrderDetailInfo f39744k2 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
                if (f39744k2 != null && (expressInfo3 = f39744k2.getExpressInfo()) != null) {
                    referencePrice = expressInfo3.getReferencePrice();
                } else {
                    referencePrice = null;
                }
            }
            OrderDetailInfo f39744k3 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k3 != null && (expressInfo4 = f39744k3.getExpressInfo()) != null) {
                fromCurrency = expressInfo4.getFromCurrency();
            } else {
                fromCurrency = null;
            }
            baseTextView2.setText(getStringRes(i13, referencePrice, fromCurrency));
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (baseTextView = c37678r1M48680D9.f84550g0) != null) {
            int i14 = R$string.payment_price;
            if (!Intrinsics.areEqual(this.f39723V, "BUY_STATUS_EXPRESS_ORDER_CANCELED")) {
                OrderDetailInfo f39744k4 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
                if (f39744k4 != null && (expressInfo2 = f39744k4.getExpressInfo()) != null) {
                    depositAmount = expressInfo2.getDepositAmount();
                } else {
                    depositAmount = null;
                }
            }
            OrderDetailInfo f39744k5 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k5 != null && (expressInfo = f39744k5.getExpressInfo()) != null) {
                depositCurrency3 = expressInfo.getDepositCurrency();
            }
            baseTextView.setText(getStringRes(i14, depositAmount, depositCurrency3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0253  */
    /* JADX WARN: Code duplicated, block: B:239:0x0389  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E5 */
    public final void m48683E5() {
        String status;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        String opTraderNickName;
        String opTraderName;
        C37678r1 c37678r1M48680D4;
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView3;
        String strM66668h;
        String legalCurrency;
        String legalCurrencyAmount;
        ConstraintLayout constraintLayout2;
        String appealStatus;
        C37678r1 c37678r1M48680D5;
        ConstraintLayout constraintLayout3;
        AppCompatImageView appCompatImageView3;
        View view;
        View view2;
        View view3;
        View view4;
        AppCompatImageView appCompatImageView4;
        String appealBy;
        ConstraintLayout constraintLayout4;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        String strM66668h2;
        String legalCurrency2;
        String legalCurrencyAmount2;
        BaseTextView baseTextView11;
        ConstraintLayout constraintLayout5;
        String adRemarks;
        BaseTextView baseTextView12;
        BaseTextView baseTextView13;
        String adRemarks2;
        ConstraintLayout constraintLayout6;
        BaseTextView baseTextView14;
        Long createdAt;
        BaseTextView baseTextView15;
        String id2;
        BaseTextView baseTextView16;
        BaseTextView baseTextView17;
        String currencyAmount;
        String currency;
        BaseTextView baseTextView18;
        String plainString;
        String legalCurrency3;
        BigDecimal price;
        BaseTextView baseTextView19;
        BaseTextView baseTextView20;
        AppCompatImageView appCompatImageView5;
        AppCompatImageView appCompatImageView6;
        BaseTextView baseTextView21;
        String currency2;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        C37678r1 c37678r1M48680D6 = m48680D4();
        Boolean unread = null;
        if (c37678r1M48680D6 != null && (baseTextView21 = c37678r1M48680D6.f84491D) != null) {
            int i11 = R$string.p2pexpress_buycropty_title;
            OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k1 != null) {
                currency2 = f39744k1.getCurrency();
            } else {
                currency2 = null;
            }
            baseTextView21.setText(getStringRes(i11, currency2));
        }
        OrderDetailInfo f39744k2 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k2 != null) {
            status = f39744k2.getStatus();
        } else {
            status = null;
        }
        if (Intrinsics.areEqual(status, OrderDetailInfo.ORDER_STATUS_CHARGED)) {
            C37678r1 c37678r1M48680D7 = m48680D4();
            if (c37678r1M48680D7 != null && (appCompatImageView6 = c37678r1M48680D7.f84557k) != null) {
                appCompatImageView6.setImageResource(R$drawable.ic2_success_16);
            }
            C37678r1 c37678r1M48680D8 = m48680D4();
            if (c37678r1M48680D8 != null && (appCompatImageView5 = c37678r1M48680D8.f84557k) != null) {
                appCompatImageView5.setColorFilter(ContextCompat.getColor(this.mContext, R$color.brandGreen));
            }
            C37678r1 c37678r1M48680D9 = m48680D4();
            if (c37678r1M48680D9 != null && (baseTextView20 = c37678r1M48680D9.f84538a0) != null) {
                baseTextView20.setText(getStringRes(R$string.completed, new Object[0]));
            }
            C37678r1 c37678r1M48680D10 = m48680D4();
            if (c37678r1M48680D10 != null && (baseTextView19 = c37678r1M48680D10.f84538a0) != null) {
                baseTextView19.setTextColor(ContextCompat.getColor(this.mContext, R$color.brandGreen));
            }
        } else {
            C37678r1 c37678r1M48680D11 = m48680D4();
            if (c37678r1M48680D11 != null && (appCompatImageView2 = c37678r1M48680D11.f84557k) != null) {
                appCompatImageView2.setImageResource(R$drawable.ic2_fail_16);
            }
            C37678r1 c37678r1M48680D12 = m48680D4();
            if (c37678r1M48680D12 != null && (appCompatImageView = c37678r1M48680D12.f84557k) != null) {
                appCompatImageView.setColorFilter(ContextCompat.getColor(this.mContext, R$color.c_icon60), PorterDuff.Mode.SRC_IN);
            }
            C37678r1 c37678r1M48680D13 = m48680D4();
            if (c37678r1M48680D13 != null && (baseTextView2 = c37678r1M48680D13.f84538a0) != null) {
                baseTextView2.setText(getStringRes(R$string.order_cancelled, new Object[0]));
            }
            C37678r1 c37678r1M48680D14 = m48680D4();
            if (c37678r1M48680D14 != null && (baseTextView = c37678r1M48680D14.f84538a0) != null) {
                baseTextView.setTextColor(ContextCompat.getColor(this.mContext, R$color.c_text40));
            }
        }
        m48677B6(f39744k0);
        C37678r1 c37678r1M48680D15 = m48680D4();
        if (c37678r1M48680D15 != null && (baseTextView18 = c37678r1M48680D15.f84519R) != null) {
            StringBuilder sb2 = new StringBuilder();
            if (f39744k0 != null && (price = f39744k0.getPrice()) != null) {
                plainString = price.toPlainString();
            } else {
                plainString = null;
            }
            sb2.append(C27041f.m66668h(plainString));
            sb2.append(' ');
            if (f39744k0 != null) {
                legalCurrency3 = f39744k0.getLegalCurrency();
            } else {
                legalCurrency3 = null;
            }
            sb2.append(legalCurrency3);
            baseTextView18.setText(sb2.toString());
        }
        C37678r1 c37678r1M48680D16 = m48680D4();
        if (c37678r1M48680D16 != null && (baseTextView17 = c37678r1M48680D16.f84523T) != null) {
            StringBuilder sb3 = new StringBuilder();
            if (f39744k0 != null) {
                currencyAmount = f39744k0.getCurrencyAmount();
            } else {
                currencyAmount = null;
            }
            sb3.append(C27041f.m66668h(currencyAmount));
            sb3.append(' ');
            if (f39744k0 != null) {
                currency = f39744k0.getCurrency();
            } else {
                currency = null;
            }
            sb3.append(currency);
            baseTextView17.setText(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        if (f39744k0 != null) {
            opTraderNickName = f39744k0.getOpTraderNickName();
        } else {
            opTraderNickName = null;
        }
        sb4.append(C27041f.m66668h(opTraderNickName));
        sb4.append('(');
        if (f39744k0 != null) {
            opTraderName = f39744k0.getOpTraderName();
        } else {
            opTraderName = null;
        }
        sb4.append(opTraderName);
        sb4.append(')');
        CharSequence string = sb4.toString();
        C37678r1 c37678r1M48680D17 = m48680D4();
        if (c37678r1M48680D17 != null && (baseTextView16 = c37678r1M48680D17.f84527V) != null) {
            if (m48713g5()) {
                string = new C27096v0().m66908h(string);
            }
            baseTextView16.setText(string);
        }
        C37678r1 c37678r1M48680D18 = m48680D4();
        if (c37678r1M48680D18 != null && (baseTextView15 = c37678r1M48680D18.f84503J) != null) {
            OrderDetailInfo f39744k3 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k3 != null) {
                id2 = f39744k3.getId();
            } else {
                id2 = null;
            }
            baseTextView15.setText(C27041f.m66668h(id2));
        }
        C37678r1 c37678r1M48680D19 = m48680D4();
        if (c37678r1M48680D19 != null && (baseTextView14 = c37678r1M48680D19.f84509M) != null) {
            if (f39744k0 != null) {
                createdAt = f39744k0.getCreatedAt();
            } else {
                createdAt = null;
            }
            baseTextView14.setText(TimeUtils.m66424k(C27039d.m66652l(createdAt)));
        }
        boolean zContains = CollectionsKt.listOf((Object[]) new String[]{"BUY_STATUS_ORDER_CANCELED", "BUY_STATUS_ORDER_CHARGED", "BUY_STATUS_EXPRESS_ORDER_UNCONFIRMED", "BUY_STATUS_EXPRESS_ORDER_PROCESSING", "BUY_STATUS_EXPRESS_ORDER_SUCCEEDED", "BUY_STATUS_EXPRESS_ORDER_FAILED", "BUY_STATUS_EXPRESS_ORDER_CANCELED", "SELL_STATUS_ORDER_CANCELED", "SELL_STATUS_ORDER_CHARGED"}).contains(this.f39723V);
        if (!zContains) {
            if (f39744k0 != null) {
                adRemarks = f39744k0.getAdRemarks();
            } else {
                adRemarks = null;
            }
            if (adRemarks != null && adRemarks.length() != 0) {
                C37678r1 c37678r1M48680D20 = m48680D4();
                if (c37678r1M48680D20 != null && (constraintLayout6 = c37678r1M48680D20.f84506K0) != null) {
                    C27046k.m66685H(constraintLayout6);
                }
                C37678r1 c37678r1M48680D21 = m48680D4();
                if (c37678r1M48680D21 != null && (baseTextView13 = c37678r1M48680D21.f84529W) != null) {
                    if (f39744k0 != null) {
                        adRemarks2 = f39744k0.getAdRemarks();
                    } else {
                        adRemarks2 = null;
                    }
                    baseTextView13.setText(C27041f.m66668h(adRemarks2));
                }
                C37678r1 c37678r1M48680D22 = m48680D4();
                if (c37678r1M48680D22 != null && (baseTextView12 = c37678r1M48680D22.f84529W) != null) {
                    baseTextView12.setMovementMethod(LinkMovementMethod.getInstance());
                }
            } else {
                c37678r1M48680D4 = m48680D4();
                if (c37678r1M48680D4 != null) {
                    C27046k.m66700o(constraintLayout);
                }
            }
        } else {
            c37678r1M48680D4 = m48680D4();
            if (c37678r1M48680D4 != null && (constraintLayout = c37678r1M48680D4.f84506K0) != null) {
                C27046k.m66700o(constraintLayout);
            }
        }
        if (zContains) {
            C37678r1 c37678r1M48680D23 = m48680D4();
            if (c37678r1M48680D23 != null && (constraintLayout5 = c37678r1M48680D23.f84504J0) != null) {
                C27046k.m66700o(constraintLayout5);
            }
            C37678r1 c37678r1M48680D24 = m48680D4();
            if (c37678r1M48680D24 != null) {
                baseTextView4 = c37678r1M48680D24.f84519R;
            } else {
                baseTextView4 = null;
            }
            m48714g6(baseTextView4);
            C37678r1 c37678r1M48680D25 = m48680D4();
            if (c37678r1M48680D25 != null) {
                baseTextView5 = c37678r1M48680D25.f84523T;
            } else {
                baseTextView5 = null;
            }
            m48714g6(baseTextView5);
            C37678r1 c37678r1M48680D26 = m48680D4();
            if (c37678r1M48680D26 != null) {
                baseTextView6 = c37678r1M48680D26.f84527V;
            } else {
                baseTextView6 = null;
            }
            m48714g6(baseTextView6);
            C37678r1 c37678r1M48680D27 = m48680D4();
            if (c37678r1M48680D27 != null) {
                baseTextView7 = c37678r1M48680D27.f84503J;
            } else {
                baseTextView7 = null;
            }
            m48714g6(baseTextView7);
            C37678r1 c37678r1M48680D28 = m48680D4();
            if (c37678r1M48680D28 != null) {
                baseTextView8 = c37678r1M48680D28.f84509M;
            } else {
                baseTextView8 = null;
            }
            m48714g6(baseTextView8);
            C37678r1 c37678r1M48680D29 = m48680D4();
            if (c37678r1M48680D29 != null) {
                baseTextView9 = c37678r1M48680D29.f84493E;
            } else {
                baseTextView9 = null;
            }
            m48714g6(baseTextView9);
            C37678r1 c37678r1M48680D30 = m48680D4();
            if (c37678r1M48680D30 != null && (baseTextView11 = c37678r1M48680D30.f84493E) != null) {
                baseTextView11.setTypeface(ResourcesCompat.getFont(this.mContext, R$font.medium));
            }
            C37678r1 c37678r1M48680D31 = m48680D4();
            if (c37678r1M48680D31 != null && (baseTextView10 = c37678r1M48680D31.f84493E) != null) {
                C27096v0 c27096v0 = new C27096v0();
                if (f39744k0 != null && (legalCurrencyAmount2 = f39744k0.getLegalCurrencyAmount()) != null) {
                    strM66668h2 = C27041f.m66668h(legalCurrencyAmount2);
                } else {
                    strM66668h2 = null;
                }
                C27096v0 c27096v0Append = c27096v0.append(strM66668h2).append(C33627eb.f69716f);
                if (f39744k0 != null) {
                    legalCurrency2 = f39744k0.getLegalCurrency();
                } else {
                    legalCurrency2 = null;
                }
                baseTextView10.setText(c27096v0Append.append(legalCurrency2));
            }
        } else {
            C37678r1 c37678r1M48680D32 = m48680D4();
            if (c37678r1M48680D32 != null && (constraintLayout2 = c37678r1M48680D32.f84504J0) != null) {
                C27046k.m66685H(constraintLayout2);
            }
            C37678r1 c37678r1M48680D33 = m48680D4();
            if (c37678r1M48680D33 != null && (baseTextView3 = c37678r1M48680D33.f84493E) != null) {
                C27096v0 c27096v1 = new C27096v0();
                if (f39744k0 != null && (legalCurrencyAmount = f39744k0.getLegalCurrencyAmount()) != null) {
                    strM66668h = C27041f.m66668h(legalCurrencyAmount);
                } else {
                    strM66668h = null;
                }
                C27096v0 c27096v0Append2 = c27096v1.m66904d(strM66668h, 20).append(C33627eb.f69716f);
                if (f39744k0 != null) {
                    legalCurrency = f39744k0.getLegalCurrency();
                } else {
                    legalCurrency = null;
                }
                baseTextView3.setText(c27096v0Append2.append(legalCurrency));
            }
        }
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{OrderDetailInfo.APPEAL_STATUS_APPEALING, OrderDetailInfo.APPEAL_STATUS_CONSENT, OrderDetailInfo.APPEAL_STATUS_CS_PENDING, OrderDetailInfo.APPEAL_STATUS_CS_PROCESSING});
        if (f39744k0 != null) {
            appealStatus = f39744k0.getAppealStatus();
        } else {
            appealStatus = null;
        }
        if (!CollectionsKt.contains(listListOf, appealStatus)) {
            if (f39744k0 != null) {
                appealBy = f39744k0.getAppealBy();
            } else {
                appealBy = null;
            }
            if (appealBy != null && appealBy.length() != 0) {
                C37678r1 c37678r1M48680D34 = m48680D4();
                if (c37678r1M48680D34 != null && (constraintLayout4 = c37678r1M48680D34.f84584x0) != null) {
                    C27046k.m66685H(constraintLayout4);
                }
            } else {
                c37678r1M48680D5 = m48680D4();
                if (c37678r1M48680D5 != null) {
                    C27046k.m66700o(constraintLayout3);
                }
            }
        } else {
            c37678r1M48680D5 = m48680D4();
            if (c37678r1M48680D5 != null && (constraintLayout3 = c37678r1M48680D5.f84584x0) != null) {
                C27046k.m66700o(constraintLayout3);
            }
        }
        if (m48712f5()) {
            C37678r1 c37678r1M48680D35 = m48680D4();
            if (c37678r1M48680D35 != null && (appCompatImageView4 = c37678r1M48680D35.f84559l) != null) {
                C27046k.m66685H(appCompatImageView4);
            }
        } else {
            C37678r1 c37678r1M48680D36 = m48680D4();
            if (c37678r1M48680D36 != null && (appCompatImageView3 = c37678r1M48680D36.f84559l) != null) {
                C27046k.m66700o(appCompatImageView3);
            }
        }
        if (f39744k0 != null) {
            unread = f39744k0.getUnread();
        }
        if (C27025c.m66566d(unread)) {
            C37678r1 c37678r1M48680D37 = m48680D4();
            if (c37678r1M48680D37 != null && (view4 = c37678r1M48680D37.f84582w0) != null) {
                C27046k.m66685H(view4);
            }
            C37678r1 c37678r1M48680D38 = m48680D4();
            if (c37678r1M48680D38 != null && (view3 = c37678r1M48680D38.f84586y0) != null) {
                C27046k.m66685H(view3);
            }
        } else {
            C37678r1 c37678r1M48680D39 = m48680D4();
            if (c37678r1M48680D39 != null && (view2 = c37678r1M48680D39.f84582w0) != null) {
                C27046k.m66700o(view2);
            }
            C37678r1 c37678r1M48680D40 = m48680D4();
            if (c37678r1M48680D40 != null && (view = c37678r1M48680D40.f84586y0) != null) {
                C27046k.m66700o(view);
            }
        }
        if (!CollectionsKt.listOf((Object[]) new String[]{"BUY_STATUS_ORDER_CREATED", "SELL_STATUS_ORDER_CREATED"}).contains(this.f39723V)) {
            ((OrderDetailViewModel) m45631m3()).m48759E0(false);
            ((OrderDetailViewModel) m45631m3()).m48760F0(true);
        }
        if (!CollectionsKt.listOf((Object[]) new String[]{"BUY_STATUS_ORDER_WAIT_COIN", "SELL_STATUS_ORDER_PAY_COIN"}).contains(this.f39723V)) {
            ((OrderDetailViewModel) m45631m3()).m48765K0(false);
            ((OrderDetailViewModel) m45631m3()).m48761G0(true);
        }
    }

    /* JADX INFO: renamed from: E6 */
    public final void m48684E6() {
        if (m48715h5()) {
            return;
        }
        KuCoinLooper.INSTANCE.addTask(new C36993c.b("orderLooper").m82829i(4L).m82827g(this).m82826f(new Runnable() { // from class: com.kubi.payment.p2p.order.h0
            @Override // java.lang.Runnable
            public final void run() {
                OrderDetailFragment.m48571F6(this.f39846b);
            }
        }).m82828h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F5 */
    public final void m48685F5() {
        OrderDetailInfo.ExpressInfo expressInfo;
        Boolean boolValueOf;
        Group group;
        String status;
        Boolean buyerRole;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView3;
        AppCompatImageView appCompatImageView2;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        String fromCurrency;
        String depositCurrency;
        BaseTextView baseTextView6;
        String fromCurrency2;
        Group group2;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        String status2 = null;
        if (f39744k0 != null) {
            expressInfo = f39744k0.getExpressInfo();
        } else {
            expressInfo = null;
        }
        OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k1 != null) {
            boolValueOf = Boolean.valueOf(f39744k1.isP2PExpress());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            P2PExpressOrderStatus p2PExpressOrderStatus = P2PExpressOrderStatus.f39866a;
            if (expressInfo != null) {
                status = expressInfo.getStatus();
            } else {
                status = null;
            }
            if (!p2PExpressOrderStatus.m48913a(status)) {
                OrderDetailInfo f39744k2 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
                if (f39744k2 != null) {
                    buyerRole = f39744k2.getBuyerRole();
                } else {
                    buyerRole = null;
                }
                if (C27025c.m66566d(buyerRole)) {
                    C37678r1 c37678r1M48680D4 = m48680D4();
                    if (c37678r1M48680D4 != null && (group2 = c37678r1M48680D4.f84549g) != null) {
                        C27046k.m66685H(group2);
                    }
                    C37678r1 c37678r1M48680D5 = m48680D4();
                    if (c37678r1M48680D5 != null && (baseTextView6 = c37678r1M48680D5.f84540b0) != null) {
                        int i11 = R$string.p2pexpress_buycropty_title;
                        if (expressInfo != null) {
                            fromCurrency2 = expressInfo.getFromCurrency();
                        } else {
                            fromCurrency2 = null;
                        }
                        baseTextView6.setText(getStringRes(i11, fromCurrency2));
                    }
                    C37678r1 c37678r1M48680D6 = m48680D4();
                    if (c37678r1M48680D6 != null && (baseTextView5 = c37678r1M48680D6.f84558k0) != null) {
                        int i12 = R$string.p2pexpress_confirm_covert;
                        if (expressInfo != null) {
                            fromCurrency = expressInfo.getFromCurrency();
                        } else {
                            fromCurrency = null;
                        }
                        if (expressInfo != null) {
                            depositCurrency = expressInfo.getDepositCurrency();
                        } else {
                            depositCurrency = null;
                        }
                        baseTextView5.setText(getStringRes(i12, fromCurrency, depositCurrency));
                    }
                    if (expressInfo != null) {
                        status2 = expressInfo.getStatus();
                    }
                    if (C27041f.m66668h(status2).length() == 0) {
                        C37678r1 c37678r1M48680D7 = m48680D4();
                        if (c37678r1M48680D7 != null && (baseTextView4 = c37678r1M48680D7.f84535Z) != null) {
                            C27046k.m66685H(baseTextView4);
                        }
                        C37678r1 c37678r1M48680D8 = m48680D4();
                        if (c37678r1M48680D8 != null && (appCompatImageView2 = c37678r1M48680D8.f84567p) != null) {
                            C27046k.m66700o(appCompatImageView2);
                            return;
                        }
                        return;
                    }
                    C37678r1 c37678r1M48680D9 = m48680D4();
                    if (c37678r1M48680D9 != null && (baseTextView3 = c37678r1M48680D9.f84535Z) != null) {
                        C27046k.m66700o(baseTextView3);
                    }
                    C37678r1 c37678r1M48680D10 = m48680D4();
                    if (c37678r1M48680D10 != null && (appCompatImageView = c37678r1M48680D10.f84567p) != null) {
                        C27046k.m66685H(appCompatImageView);
                    }
                    C37678r1 c37678r1M48680D11 = m48680D4();
                    if (c37678r1M48680D11 != null && (baseTextView2 = c37678r1M48680D11.f84542c0) != null) {
                        baseTextView2.setBackgroundResource(R$drawable.shape_oval_emphasis);
                    }
                    C37678r1 c37678r1M48680D12 = m48680D4();
                    if (c37678r1M48680D12 != null && (baseTextView = c37678r1M48680D12.f84558k0) != null) {
                        baseTextView.setTextColor(ContextCompat.getColor(this.mContext, R$color.c_text));
                        return;
                    }
                    return;
                }
            }
        }
        C37678r1 c37678r1M48680D13 = m48680D4();
        if (c37678r1M48680D13 != null && (group = c37678r1M48680D13.f84549g) != null) {
            C27046k.m66700o(group);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G5 */
    public final void m48687G5() {
        BaseTextView baseTextView;
        String payTypeName;
        AdPayType f39746m0 = ((OrderDetailViewModel) m45631m3()).getF39746m0();
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (baseTextView = c37678r1M48680D4.f84513O) != null) {
            if (f39746m0 != null) {
                payTypeName = f39746m0.getPayTypeName();
            } else {
                payTypeName = null;
            }
            baseTextView.setText(C27041f.m66668h(payTypeName));
        }
    }

    /* JADX INFO: renamed from: G6 */
    public final void m48688G6() {
        if (!m48715h5()) {
            return;
        }
        KuCoinLooper.INSTANCE.removeTask("orderLooper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public final void m48689H4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        String csTimeLimit;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        BaseTextView baseTextView12;
        BaseTextView baseTextView13;
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView14;
        ConstraintLayout constraintLayout2;
        AlertTipsTextView alertTipsTextView;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (alertTipsTextView = c37678r1M48680D4.f84574s0) != null) {
            C27046k.m66700o(alertTipsTextView);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (constraintLayout2 = c37678r1M48680D5.f84486A0) != null) {
            C27046k.m66685H(constraintLayout2);
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (baseTextView14 = c37678r1M48680D6.f84499H) != null) {
            C27046k.m66700o(baseTextView14);
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (constraintLayout = c37678r1M48680D7.f84536Z0) != null) {
            C27046k.m66700o(constraintLayout);
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (baseTextView13 = c37678r1M48680D8.f84585y) != null) {
            C27046k.m66685H(baseTextView13);
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (baseTextView12 = c37678r1M48680D9.f84587z) != null) {
            C27046k.m66685H(baseTextView12);
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (baseTextView11 = c37678r1M48680D10.f84485A) != null) {
            C27046k.m66685H(baseTextView11);
        }
        C37678r1 c37678r1M48680D11 = m48680D4();
        if (c37678r1M48680D11 != null && (baseTextView10 = c37678r1M48680D11.f84487B) != null) {
            C27046k.m66685H(baseTextView10);
        }
        C37678r1 c37678r1M48680D12 = m48680D4();
        if (c37678r1M48680D12 != null && (baseTextView9 = c37678r1M48680D12.f84576t0) != null) {
            baseTextView9.setText(getString(R$string.payment_p2p_order_appeal_pending));
        }
        C37678r1 c37678r1M48680D13 = m48680D4();
        Boolean hasRecord = null;
        if (c37678r1M48680D13 != null && (baseTextView8 = c37678r1M48680D13.f84560l0) != null) {
            int i11 = R$string.payment_p2p_order_appealing_subtitle_appellee;
            int i12 = R$string.payment_detail_minutes;
            OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k1 != null) {
                csTimeLimit = f39744k1.getCsTimeLimit();
            } else {
                csTimeLimit = null;
            }
            String string = getString(i12, C27041f.m66668h(csTimeLimit));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            baseTextView8.setText(m48565C4(this, i11, string, null, 0, 12, null));
        }
        C37678r1 c37678r1M48680D14 = m48680D4();
        if (c37678r1M48680D14 != null && (baseTextView7 = c37678r1M48680D14.f84585y) != null) {
            baseTextView7.setText(getString(R$string.payment_p2p_order_appealing_appellee_desc1));
        }
        C37678r1 c37678r1M48680D15 = m48680D4();
        if (c37678r1M48680D15 != null && (baseTextView6 = c37678r1M48680D15.f84587z) != null) {
            baseTextView6.setText(getString(R$string.payment_p2p_order_appealing_appellee_desc2));
        }
        C37678r1 c37678r1M48680D16 = m48680D4();
        if (c37678r1M48680D16 != null && (baseTextView5 = c37678r1M48680D16.f84485A) != null) {
            baseTextView5.setText(getString(R$string.payment_p2p_order_appealing_appellee_desc3));
        }
        C37678r1 c37678r1M48680D17 = m48680D4();
        if (c37678r1M48680D17 != null && (baseTextView4 = c37678r1M48680D17.f84487B) != null) {
            baseTextView4.setText(getString(R$string.payment_p2p_order_appealing_appellee_desc4));
        }
        C37678r1 c37678r1M48680D18 = m48680D4();
        if (c37678r1M48680D18 != null) {
            baseTextView = c37678r1M48680D18.f84585y;
        } else {
            baseTextView = null;
        }
        m48708c6(baseTextView);
        C37678r1 c37678r1M48680D19 = m48680D4();
        if (c37678r1M48680D19 != null) {
            baseTextView2 = c37678r1M48680D19.f84587z;
        } else {
            baseTextView2 = null;
        }
        m48708c6(baseTextView2);
        C37678r1 c37678r1M48680D20 = m48680D4();
        if (c37678r1M48680D20 != null) {
            baseTextView3 = c37678r1M48680D20.f84487B;
        } else {
            baseTextView3 = null;
        }
        m48707b6(baseTextView3);
        if (f39744k0 != null) {
            hasRecord = f39744k0.getHasRecord();
        }
        if (C27025c.m66566d(hasRecord)) {
            C37678r1 c37678r1M48680D21 = m48680D4();
            if (c37678r1M48680D21 != null && (kcPrimaryButton2 = c37678r1M48680D21.f84562m0) != null) {
                kcPrimaryButton2.setText(getString(R$string.payment_detail_additional_remarks));
                return;
            }
            return;
        }
        C37678r1 c37678r1M48680D22 = m48680D4();
        if (c37678r1M48680D22 != null && (kcPrimaryButton = c37678r1M48680D22.f84562m0) != null) {
            kcPrimaryButton.setText(getString(R$string.payment_detail_submission_remarks));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I5 */
    public final void m48691I5() {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        AlertTipsTextView alertTipsTextView;
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        BaseTextView baseTextView2;
        AlertTipsTextView alertTipsTextView2;
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (alertTipsTextView2 = c37678r1M48680D4.f84574s0) != null) {
            C27046k.m66685H(alertTipsTextView2);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (baseTextView2 = c37678r1M48680D5.f84499H) != null) {
            C27046k.m66700o(baseTextView2);
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (constraintLayout3 = c37678r1M48680D6.f84536Z0) != null) {
            C27046k.m66700o(constraintLayout3);
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (constraintLayout2 = c37678r1M48680D7.f84494E0) != null) {
            C27046k.m66685H(constraintLayout2);
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (constraintLayout = c37678r1M48680D8.f84508L0) != null) {
            C27046k.m66685H(constraintLayout);
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (baseTextView = c37678r1M48680D9.f84576t0) != null) {
            baseTextView.setText(getString(R$string.payment_detail_wait_opposite_pay));
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (alertTipsTextView = c37678r1M48680D10.f84574s0) != null) {
            alertTipsTextView.setText(getString(R$string.payment_p2p_order_created_desc_seller));
        }
        C37678r1 c37678r1M48680D11 = m48680D4();
        if (c37678r1M48680D11 != null && (kcPrimaryButton2 = c37678r1M48680D11.f84533Y) != null) {
            kcPrimaryButton2.setText(getString(R$string.payment_detail_confirm_pay_coin));
        }
        C37678r1 c37678r1M48680D12 = m48680D4();
        if (c37678r1M48680D12 != null && (kcPrimaryButton = c37678r1M48680D12.f84533Y) != null) {
            kcPrimaryButton.setEnabled(false);
        }
        ((OrderDetailViewModel) m45631m3()).m48766L0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J5 */
    public final void m48692J5() {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        KcPrimaryButton kcPrimaryButton3;
        ConstraintLayout constraintLayout3;
        BaseTextView baseTextView3;
        ConstraintLayout constraintLayout4;
        BaseTextView baseTextView4;
        ConstraintLayout constraintLayout5;
        AlertTipsTextView alertTipsTextView;
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (alertTipsTextView = c37678r1M48680D4.f84574s0) != null) {
            C27046k.m66700o(alertTipsTextView);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (constraintLayout5 = c37678r1M48680D5.f84486A0) != null) {
            C27046k.m66700o(constraintLayout5);
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (baseTextView4 = c37678r1M48680D6.f84499H) != null) {
            C27046k.m66685H(baseTextView4);
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (constraintLayout4 = c37678r1M48680D7.f84536Z0) != null) {
            C27046k.m66700o(constraintLayout4);
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (baseTextView3 = c37678r1M48680D8.f84499H) != null) {
            C27046k.m66685H(baseTextView3);
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (constraintLayout3 = c37678r1M48680D9.f84494E0) != null) {
            C27046k.m66685H(constraintLayout3);
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (kcPrimaryButton3 = c37678r1M48680D10.f84495F) != null) {
            C27046k.m66700o(kcPrimaryButton3);
        }
        C37678r1 c37678r1M48680D11 = m48680D4();
        if (c37678r1M48680D11 != null && (constraintLayout2 = c37678r1M48680D11.f84508L0) != null) {
            C27046k.m66685H(constraintLayout2);
        }
        C37678r1 c37678r1M48680D12 = m48680D4();
        if (c37678r1M48680D12 != null && (constraintLayout = c37678r1M48680D12.f84530W0) != null) {
            C27046k.m66700o(constraintLayout);
        }
        C37678r1 c37678r1M48680D13 = m48680D4();
        if (c37678r1M48680D13 != null && (baseTextView2 = c37678r1M48680D13.f84576t0) != null) {
            baseTextView2.setText(getString(R$string.payment_p2p_order_wait_you_release));
        }
        C37678r1 c37678r1M48680D14 = m48680D4();
        if (c37678r1M48680D14 != null && (baseTextView = c37678r1M48680D14.f84560l0) != null) {
            baseTextView.setText(getString(R$string.payment_p2p_order_payedMoney_subtitle_seller));
        }
        C37678r1 c37678r1M48680D15 = m48680D4();
        if (c37678r1M48680D15 != null && (kcPrimaryButton2 = c37678r1M48680D15.f84533Y) != null) {
            kcPrimaryButton2.setText(getString(R$string.payment_detail_confirm_pay_coin));
        }
        C37678r1 c37678r1M48680D16 = m48680D4();
        if (c37678r1M48680D16 != null && (kcPrimaryButton = c37678r1M48680D16.f84533Y) != null) {
            kcPrimaryButton.setEnabled(true);
        }
        ((OrderDetailViewModel) m45631m3()).m48758D0();
    }

    /* JADX INFO: renamed from: K5 */
    public final void m48693K5() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        m48704X5();
        m48681D5();
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (appCompatImageView2 = c37678r1M48680D4.f84569q) != null) {
            appCompatImageView2.setImageResource(R$drawable.ic2_fail_16);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (appCompatImageView = c37678r1M48680D5.f84569q) != null) {
            appCompatImageView.setColorFilter(ContextCompat.getColor(this.mContext, R$color.c_icon60), PorterDuff.Mode.SRC_IN);
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (baseTextView2 = c37678r1M48680D6.f84552h0) != null) {
            baseTextView2.setText(getStringRes(R$string.order_cancelled, new Object[0]));
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (baseTextView = c37678r1M48680D7.f84552h0) != null) {
            baseTextView.setTextColor(ContextCompat.getColor(this.mContext, R$color.c_text40));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L5 */
    public final void m48694L5() {
        AlertTipsTextView alertTipsTextView;
        AlertTipsTextView alertTipsTextView2;
        AlertTipsTextView alertTipsTextView3;
        AlertTipsTextView alertTipsTextView4;
        String fromCurrency;
        OrderDetailInfo.ExpressInfo expressInfo;
        OrderDetailInfo.ExpressInfo expressInfo2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        m48728z5();
        m48681D5();
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (appCompatImageView2 = c37678r1M48680D4.f84569q) != null) {
            appCompatImageView2.setImageResource(R$drawable.ic2_fail_16);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (appCompatImageView = c37678r1M48680D5.f84569q) != null) {
            appCompatImageView.setColorFilter(ContextCompat.getColor(this.mContext, R$color.brandRed));
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (baseTextView2 = c37678r1M48680D6.f84552h0) != null) {
            baseTextView2.setText(getStringRes(R$string.failed, new Object[0]));
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (baseTextView = c37678r1M48680D7.f84552h0) != null) {
            baseTextView.setTextColor(ContextCompat.getColor(this.mContext, R$color.brandRed));
        }
        m48706Z5();
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (alertTipsTextView4 = c37678r1M48680D8.f84554i0) != null) {
            int i11 = R$string.p2pexpress_covertfaild_detail;
            OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            String depositCurrency = null;
            if (f39744k0 != null && (expressInfo2 = f39744k0.getExpressInfo()) != null) {
                fromCurrency = expressInfo2.getFromCurrency();
            } else {
                fromCurrency = null;
            }
            OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k1 != null && (expressInfo = f39744k1.getExpressInfo()) != null) {
                depositCurrency = expressInfo.getDepositCurrency();
            }
            alertTipsTextView4.setText(getStringRes(i11, fromCurrency, depositCurrency));
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (alertTipsTextView3 = c37678r1M48680D9.f84554i0) != null) {
            alertTipsTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (alertTipsTextView2 = c37678r1M48680D10.f84554i0) != null) {
            HighlightTextHelper.f43497a.m54120f(alertTipsTextView2, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new C21093a()));
        }
        C37678r1 c37678r1M48680D11 = m48680D4();
        if (c37678r1M48680D11 != null && (alertTipsTextView = c37678r1M48680D11.f84554i0) != null) {
            C27046k.m66685H(alertTipsTextView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M5 */
    public final void m48695M5() {
        KcPrimaryButton kcPrimaryButton;
        ConstraintLayout constraintLayout;
        KcPrimaryButton kcPrimaryButton2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        BaseTextView baseTextView3;
        String fromCurrency;
        OrderDetailInfo.ExpressInfo expressInfo;
        OrderDetailInfo.ExpressInfo expressInfo2;
        m48728z5();
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (baseTextView3 = c37678r1M48680D4.f84576t0) != null) {
            int i11 = R$string.p2pexpress_confirm_covert;
            OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            String depositCurrency = null;
            if (f39744k0 != null && (expressInfo2 = f39744k0.getExpressInfo()) != null) {
                fromCurrency = expressInfo2.getFromCurrency();
            } else {
                fromCurrency = null;
            }
            OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k1 != null && (expressInfo = f39744k1.getExpressInfo()) != null) {
                depositCurrency = expressInfo.getDepositCurrency();
            }
            baseTextView3.setText(getStringRes(i11, fromCurrency, depositCurrency));
        }
        m48681D5();
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (appCompatImageView2 = c37678r1M48680D5.f84569q) != null) {
            appCompatImageView2.setImageResource(R$drawable.ic2_loading_16);
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (appCompatImageView = c37678r1M48680D6.f84569q) != null) {
            appCompatImageView.setColorFilter(ContextCompat.getColor(this.mContext, R$color.complementary));
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (baseTextView2 = c37678r1M48680D7.f84552h0) != null) {
            baseTextView2.setText(getStringRes(R$string.in_progress, new Object[0]));
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (baseTextView = c37678r1M48680D8.f84552h0) != null) {
            baseTextView.setTextColor(ContextCompat.getColor(this.mContext, R$color.complementary));
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (kcPrimaryButton2 = c37678r1M48680D9.f84495F) != null) {
            C27046k.m66685H(kcPrimaryButton2);
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (constraintLayout = c37678r1M48680D10.f84494E0) != null) {
            C27046k.m66685H(constraintLayout);
        }
        C37678r1 c37678r1M48680D11 = m48680D4();
        if (c37678r1M48680D11 != null && (kcPrimaryButton = c37678r1M48680D11.f84495F) != null) {
            kcPrimaryButton.post(new Runnable() { // from class: com.kubi.payment.p2p.order.g0
                @Override // java.lang.Runnable
                public final void run() {
                    OrderDetailFragment.m48586N5(this.f39842b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O5 */
    public final void m48696O5() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        m48728z5();
        m48681D5();
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (appCompatImageView2 = c37678r1M48680D4.f84569q) != null) {
            appCompatImageView2.setImageResource(R$drawable.ic2_success_16);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (appCompatImageView = c37678r1M48680D5.f84569q) != null) {
            appCompatImageView.setColorFilter(ContextCompat.getColor(this.mContext, R$color.brandGreen));
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (baseTextView2 = c37678r1M48680D6.f84552h0) != null) {
            baseTextView2.setText(getStringRes(R$string.completed, new Object[0]));
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (baseTextView = c37678r1M48680D7.f84552h0) != null) {
            baseTextView.setTextColor(ContextCompat.getColor(this.mContext, R$color.brandGreen));
        }
        m48706Z5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P5 */
    public final void m48697P5() {
        String id2;
        String referencePrice;
        String fromCurrency;
        String depositAmount;
        String depositCurrency;
        OrderDetailInfo.ExpressInfo expressInfo;
        OrderDetailInfo.ExpressInfo expressInfo2;
        OrderDetailInfo.ExpressInfo expressInfo3;
        OrderDetailInfo.ExpressInfo expressInfo4;
        OrderDetailInfo.ExpressInfo expressInfo5;
        m48695M5();
        P2PExpressDialog.Companion companion = P2PExpressDialog.f39807z0;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        String fromCurrency2 = null;
        if (f39744k0 != null) {
            id2 = f39744k0.getId();
        } else {
            id2 = null;
        }
        String strM66668h = C27041f.m66668h(id2);
        int i11 = R$string.payment_price;
        OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k1 != null && (expressInfo5 = f39744k1.getExpressInfo()) != null) {
            referencePrice = expressInfo5.getReferencePrice();
        } else {
            referencePrice = null;
        }
        String strM66668h2 = C27041f.m66668h(referencePrice);
        OrderDetailInfo f39744k2 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k2 != null && (expressInfo4 = f39744k2.getExpressInfo()) != null) {
            fromCurrency = expressInfo4.getFromCurrency();
        } else {
            fromCurrency = null;
        }
        String stringRes = getStringRes(i11, strM66668h2, C27041f.m66668h(fromCurrency));
        OrderDetailInfo f39744k3 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k3 != null && (expressInfo3 = f39744k3.getExpressInfo()) != null) {
            depositAmount = expressInfo3.getDepositAmount();
        } else {
            depositAmount = null;
        }
        String strM66668h3 = C27041f.m66668h(depositAmount);
        OrderDetailInfo f39744k4 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k4 != null && (expressInfo2 = f39744k4.getExpressInfo()) != null) {
            depositCurrency = expressInfo2.getDepositCurrency();
        } else {
            depositCurrency = null;
        }
        String stringRes2 = getStringRes(i11, strM66668h3, C27041f.m66668h(depositCurrency));
        OrderDetailInfo f39744k5 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k5 != null && (expressInfo = f39744k5.getExpressInfo()) != null) {
            fromCurrency2 = expressInfo.getFromCurrency();
        }
        companion.show(childFragmentManager, strM66668h, stringRes, stringRes2, C27041f.m66668h(fromCurrency2), new Function0() { // from class: com.kubi.payment.p2p.order.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.m48593Q5(this.f39856b);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R5 */
    public final void m48698R5() {
        Boolean boolValueOf;
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        KcPrimaryButton kcPrimaryButton3;
        KcPrimaryButton kcPrimaryButton4;
        ConstraintLayout constraintLayout3;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k0 != null) {
            boolValueOf = Boolean.valueOf(f39744k0.isAppealAndConsultSame());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            m48700T5();
            return;
        }
        m48689H4();
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (constraintLayout3 = c37678r1M48680D4.f84494E0) != null) {
            C27046k.m66685H(constraintLayout3);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (kcPrimaryButton4 = c37678r1M48680D5.f84495F) != null) {
            kcPrimaryButton4.mo28851l();
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (kcPrimaryButton3 = c37678r1M48680D6.f84495F) != null) {
            C27046k.m66685H(kcPrimaryButton3);
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (constraintLayout2 = c37678r1M48680D7.f84508L0) != null) {
            C27046k.m66700o(constraintLayout2);
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (constraintLayout = c37678r1M48680D8.f84530W0) != null) {
            C27046k.m66700o(constraintLayout);
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (kcPrimaryButton2 = c37678r1M48680D9.f84495F) != null) {
            kcPrimaryButton2.setEnabled(false);
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (kcPrimaryButton = c37678r1M48680D10.f84495F) != null) {
            kcPrimaryButton.setText(getString(R$string.payment_p2p_order_confirmed_consensus));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S5 */
    public final void m48699S5() {
        Boolean hasRecord;
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        m48710e5();
        if (f39744k0 != null) {
            hasRecord = f39744k0.getHasRecord();
        } else {
            hasRecord = null;
        }
        if (C27025c.m66566d(hasRecord)) {
            C37678r1 c37678r1M48680D4 = m48680D4();
            if (c37678r1M48680D4 != null && (kcPrimaryButton2 = c37678r1M48680D4.f84562m0) != null) {
                kcPrimaryButton2.setText(getString(R$string.payment_detail_additional_remarks));
                return;
            }
            return;
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (kcPrimaryButton = c37678r1M48680D5.f84562m0) != null) {
            kcPrimaryButton.setText(getString(R$string.payment_detail_submission_remarks));
        }
    }

    /* JADX INFO: renamed from: T5 */
    public final void m48700T5() {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        KcPrimaryButton kcPrimaryButton3;
        ConstraintLayout constraintLayout3;
        m48689H4();
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (constraintLayout3 = c37678r1M48680D4.f84494E0) != null) {
            C27046k.m66685H(constraintLayout3);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (kcPrimaryButton3 = c37678r1M48680D5.f84495F) != null) {
            C27046k.m66700o(kcPrimaryButton3);
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (constraintLayout2 = c37678r1M48680D6.f84508L0) != null) {
            C27046k.m66700o(constraintLayout2);
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (constraintLayout = c37678r1M48680D7.f84530W0) != null) {
            C27046k.m66685H(constraintLayout);
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (kcPrimaryButton2 = c37678r1M48680D8.f84570q0) != null) {
            kcPrimaryButton2.setText(getString(R$string.payment_p2p_order_consensus_failed));
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (kcPrimaryButton = c37678r1M48680D9.f84572r0) != null) {
            kcPrimaryButton.setText(getString(R$string.payment_p2p_order_consensus_reached));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U5 */
    public final void m48701U5() {
        Boolean boolValueOf;
        m48703W5();
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k0 != null) {
            boolValueOf = Boolean.valueOf(f39744k0.isAppealAndConsultSame());
        } else {
            boolValueOf = null;
        }
        if (!C27025c.m66566d(boolValueOf)) {
            m48723u6();
        }
    }

    /* JADX INFO: renamed from: V5 */
    public final void m48702V5() {
        KcPrimaryButton kcPrimaryButton;
        KcSecondaryButton kcSecondaryButton;
        m48710e5();
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (kcSecondaryButton = c37678r1M48680D4.f84489C) != null) {
            C27046k.m66685H(kcSecondaryButton);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (kcPrimaryButton = c37678r1M48680D5.f84562m0) != null) {
            kcPrimaryButton.setText(getString(R$string.payment_detail_additional_remarks));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W5 */
    public final void m48703W5() {
        BaseTextView baseTextView;
        KcPrimaryButton kcPrimaryButton;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        String csTimeLimit;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView11;
        KcSecondaryButton kcSecondaryButton;
        ConstraintLayout constraintLayout3;
        AlertTipsTextView alertTipsTextView;
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (alertTipsTextView = c37678r1M48680D4.f84574s0) != null) {
            C27046k.m66700o(alertTipsTextView);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (constraintLayout3 = c37678r1M48680D5.f84486A0) != null) {
            C27046k.m66685H(constraintLayout3);
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (kcSecondaryButton = c37678r1M48680D6.f84489C) != null) {
            C27046k.m66685H(kcSecondaryButton);
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (baseTextView11 = c37678r1M48680D7.f84499H) != null) {
            C27046k.m66700o(baseTextView11);
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (constraintLayout2 = c37678r1M48680D8.f84536Z0) != null) {
            C27046k.m66700o(constraintLayout2);
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (constraintLayout = c37678r1M48680D9.f84494E0) != null) {
            C27046k.m66700o(constraintLayout);
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (baseTextView10 = c37678r1M48680D10.f84585y) != null) {
            C27046k.m66685H(baseTextView10);
        }
        C37678r1 c37678r1M48680D11 = m48680D4();
        if (c37678r1M48680D11 != null && (baseTextView9 = c37678r1M48680D11.f84587z) != null) {
            C27046k.m66685H(baseTextView9);
        }
        C37678r1 c37678r1M48680D12 = m48680D4();
        if (c37678r1M48680D12 != null && (baseTextView8 = c37678r1M48680D12.f84485A) != null) {
            C27046k.m66685H(baseTextView8);
        }
        C37678r1 c37678r1M48680D13 = m48680D4();
        if (c37678r1M48680D13 != null && (baseTextView7 = c37678r1M48680D13.f84487B) != null) {
            C27046k.m66700o(baseTextView7);
        }
        C37678r1 c37678r1M48680D14 = m48680D4();
        if (c37678r1M48680D14 != null && (baseTextView6 = c37678r1M48680D14.f84576t0) != null) {
            baseTextView6.setText(getString(R$string.payment_detail_deal_appeal));
        }
        C37678r1 c37678r1M48680D15 = m48680D4();
        BaseTextView baseTextView12 = null;
        if (c37678r1M48680D15 != null && (baseTextView5 = c37678r1M48680D15.f84560l0) != null) {
            int i11 = R$string.payment_p2p_order_appealing_subtitle;
            int i12 = R$string.payment_detail_minutes;
            OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k0 != null) {
                csTimeLimit = f39744k0.getCsTimeLimit();
            } else {
                csTimeLimit = null;
            }
            String string = getString(i12, C27041f.m66668h(csTimeLimit));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            baseTextView5.setText(m48565C4(this, i11, string, null, 0, 12, null));
        }
        C37678r1 c37678r1M48680D16 = m48680D4();
        if (c37678r1M48680D16 != null && (baseTextView4 = c37678r1M48680D16.f84585y) != null) {
            baseTextView4.setText(getString(R$string.payment_p2p_order_appealing_desc1));
        }
        C37678r1 c37678r1M48680D17 = m48680D4();
        if (c37678r1M48680D17 != null && (baseTextView3 = c37678r1M48680D17.f84587z) != null) {
            baseTextView3.setText(getString(R$string.payment_p2p_order_appealing_desc2));
        }
        C37678r1 c37678r1M48680D18 = m48680D4();
        if (c37678r1M48680D18 != null && (baseTextView2 = c37678r1M48680D18.f84485A) != null) {
            baseTextView2.setText(getString(R$string.payment_p2p_order_appealing_desc4));
        }
        C37678r1 c37678r1M48680D19 = m48680D4();
        if (c37678r1M48680D19 != null) {
            baseTextView = c37678r1M48680D19.f84585y;
        } else {
            baseTextView = null;
        }
        m48708c6(baseTextView);
        C37678r1 c37678r1M48680D20 = m48680D4();
        if (c37678r1M48680D20 != null) {
            baseTextView12 = c37678r1M48680D20.f84485A;
        }
        m48707b6(baseTextView12);
        C37678r1 c37678r1M48680D21 = m48680D4();
        if (c37678r1M48680D21 != null && (kcPrimaryButton = c37678r1M48680D21.f84562m0) != null) {
            kcPrimaryButton.setText(getString(R$string.payment_detail_additional_remarks));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X5 */
    public final void m48704X5() {
        P2PViewChatCardEntrance p2PViewChatCardEntrance;
        View viewFindViewById;
        String cancelRemark;
        AlertTipsTextView alertTipsTextView;
        AlertTipsTextView alertTipsTextView2;
        AlertTipsTextView alertTipsTextView3;
        BaseTextView baseTextView;
        Boolean buyerRole;
        String string;
        BaseTextView baseTextView2;
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        AlertTipsTextView alertTipsTextView4;
        P2PViewChatCardEntrance p2PViewChatCardEntrance2;
        View viewFindViewById2;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (C24129b.m58030b(SiteVisibleConfigKey.P2P)) {
            C37678r1 c37678r1M48680D4 = m48680D4();
            if (c37678r1M48680D4 != null && (p2PViewChatCardEntrance2 = c37678r1M48680D4.f84496F0) != null && (viewFindViewById2 = p2PViewChatCardEntrance2.findViewById(R$id.tvChat)) != null) {
                C27046k.m66685H(viewFindViewById2);
            }
        } else {
            C37678r1 c37678r1M48680D5 = m48680D4();
            if (c37678r1M48680D5 != null && (p2PViewChatCardEntrance = c37678r1M48680D5.f84496F0) != null && (viewFindViewById = p2PViewChatCardEntrance.findViewById(R$id.tvChat)) != null) {
                C27046k.m66700o(viewFindViewById);
            }
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (alertTipsTextView4 = c37678r1M48680D6.f84574s0) != null) {
            C27046k.m66700o(alertTipsTextView4);
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (constraintLayout3 = c37678r1M48680D7.f84486A0) != null) {
            C27046k.m66700o(constraintLayout3);
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (constraintLayout2 = c37678r1M48680D8.f84536Z0) != null) {
            C27046k.m66700o(constraintLayout2);
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (baseTextView4 = c37678r1M48680D9.f84499H) != null) {
            C27046k.m66700o(baseTextView4);
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (baseTextView3 = c37678r1M48680D10.f84505K) != null) {
            C27046k.m66685H(baseTextView3);
        }
        C37678r1 c37678r1M48680D11 = m48680D4();
        if (c37678r1M48680D11 != null && (constraintLayout = c37678r1M48680D11.f84494E0) != null) {
            C27046k.m66700o(constraintLayout);
        }
        C37678r1 c37678r1M48680D12 = m48680D4();
        if (c37678r1M48680D12 != null && (baseTextView2 = c37678r1M48680D12.f84576t0) != null) {
            baseTextView2.setText(getString(R$string.payment_detail_deal_cancel));
        }
        C37678r1 c37678r1M48680D13 = m48680D4();
        String cancelRemark2 = null;
        if (c37678r1M48680D13 != null && (baseTextView = c37678r1M48680D13.f84560l0) != null) {
            OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
            if (f39744k1 != null) {
                buyerRole = f39744k1.getBuyerRole();
            } else {
                buyerRole = null;
            }
            if (C27025c.m66566d(buyerRole)) {
                string = getString(R$string.payment_detail_buy_canceled_sub_title);
            } else {
                string = getString(R$string.payment_detail_sell_canceled_sub_title);
            }
            baseTextView.setText(string);
        }
        if (f39744k0 != null) {
            cancelRemark = f39744k0.getCancelRemark();
        } else {
            cancelRemark = null;
        }
        if (cancelRemark != null && cancelRemark.length() != 0) {
            C37678r1 c37678r1M48680D14 = m48680D4();
            if (c37678r1M48680D14 != null && (alertTipsTextView3 = c37678r1M48680D14.f84574s0) != null) {
                C27046k.m66685H(alertTipsTextView3);
            }
            C37678r1 c37678r1M48680D15 = m48680D4();
            if (c37678r1M48680D15 != null && (alertTipsTextView2 = c37678r1M48680D15.f84574s0) != null) {
                int i11 = R$string.payment_detail_cancel_reason;
                if (f39744k0 != null) {
                    cancelRemark2 = f39744k0.getCancelRemark();
                }
                alertTipsTextView2.setText(m48565C4(this, i11, C27041f.m66668h(cancelRemark2), null, R$color.c_text, 4, null));
                return;
            }
            return;
        }
        C37678r1 c37678r1M48680D16 = m48680D4();
        if (c37678r1M48680D16 != null && (alertTipsTextView = c37678r1M48680D16.f84574s0) != null) {
            C27046k.m66700o(alertTipsTextView);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r0.equals("SELL_STATUS_ORDER_PAY_COIN") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        if (r0.equals("SELL_STATUS_ORDER_CHARGED") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        if (r0.equals("BUY_STATUS_ORDER_WAIT_COIN") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        r0 = r7.f84579v;
        p852kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "stepsLayout");
        com.kubi.utils.extensions.core.ViewExtKt.m66594y(r0);
        com.kubi.payment.widget.StepsLayout.m49908b(r7.f84579v, 1, 0, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (r0.equals("BUY_STATUS_ORDER_CHARGED") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
    
        r0 = r7.f84579v;
        p852kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "stepsLayout");
        com.kubi.utils.extensions.core.ViewExtKt.m66594y(r0);
        com.kubi.payment.widget.StepsLayout.m49908b(r7.f84579v, 2, 0, 2, null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m48705Y5(C37678r1 c37678r1) {
        OrderDetailInfo.ExpressInfo expressInfo;
        Boolean boolValueOf;
        String status;
        Boolean buyerRole;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k0 != null) {
            expressInfo = f39744k0.getExpressInfo();
        } else {
            expressInfo = null;
        }
        OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k1 != null) {
            boolValueOf = Boolean.valueOf(f39744k1.isP2PExpress());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            P2PExpressOrderStatus p2PExpressOrderStatus = P2PExpressOrderStatus.f39866a;
            if (expressInfo != null) {
                status = expressInfo.getStatus();
            } else {
                status = null;
            }
            if (!p2PExpressOrderStatus.m48913a(status)) {
                OrderDetailInfo f39744k2 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
                if (f39744k2 != null) {
                    buyerRole = f39744k2.getBuyerRole();
                } else {
                    buyerRole = null;
                }
                if (C27025c.m66566d(buyerRole)) {
                    StepsLayout stepsLayout = c37678r1.f84579v;
                    Intrinsics.checkNotNullExpressionValue(stepsLayout, "stepsLayout");
                    ViewExtKt.m66577h(stepsLayout);
                }
            }
        }
        String str = this.f39723V;
        switch (str.hashCode()) {
            case -1302568277:
                break;
            case -152314122:
                break;
            case 293677375:
                break;
            case 477199513:
                break;
            case 583169015:
                if (str.equals("SELL_STATUS_ORDER_CREATED")) {
                    StepsLayout stepsLayout2 = c37678r1.f84579v;
                    Intrinsics.checkNotNullExpressionValue(stepsLayout2, "stepsLayout");
                    ViewExtKt.m66594y(stepsLayout2);
                    StepsLayout.m49908b(c37678r1.f84579v, 0, 0, 2, null);
                }
                StepsLayout stepsLayout3 = c37678r1.f84579v;
                Intrinsics.checkNotNullExpressionValue(stepsLayout3, "stepsLayout");
                ViewExtKt.m66577h(stepsLayout3);
                break;
            default:
                StepsLayout stepsLayout4 = c37678r1.f84579v;
                Intrinsics.checkNotNullExpressionValue(stepsLayout4, "stepsLayout");
                ViewExtKt.m66577h(stepsLayout4);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z5 */
    public final void m48706Z5() {
        BaseTextView baseTextView;
        String currencyAmount;
        KcPrimaryButton kcPrimaryButton;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        String depositAmount;
        OrderDetailInfo.ExpressInfo expressInfo;
        OrderDetailInfo.ExpressInfo expressInfo2;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView5;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        KcPrimaryButton kcPrimaryButton4;
        ConstraintLayout constraintLayout;
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (constraintLayout = c37678r1M48680D4.f84494E0) != null) {
            C27046k.m66685H(constraintLayout);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (kcPrimaryButton4 = c37678r1M48680D5.f84495F) != null) {
            kcPrimaryButton4.setEnabled(true);
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (kcPrimaryButton3 = c37678r1M48680D6.f84495F) != null) {
            kcPrimaryButton3.mo28851l();
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (kcPrimaryButton2 = c37678r1M48680D7.f84495F) != null) {
            C27046k.m66685H(kcPrimaryButton2);
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (baseTextView5 = c37678r1M48680D8.f84580v0) != null) {
            C27046k.m66685H(baseTextView5);
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (appCompatImageView = c37678r1M48680D9.f84571r) != null) {
            C27046k.m66685H(appCompatImageView);
        }
        String currency = null;
        if (Intrinsics.areEqual(this.f39723V, "BUY_STATUS_EXPRESS_ORDER_SUCCEEDED")) {
            C37678r1 c37678r1M48680D10 = m48680D4();
            if (c37678r1M48680D10 != null && (baseTextView4 = c37678r1M48680D10.f84564n0) != null) {
                int i11 = R$string.p2pexpress_ordersuccess_detail;
                OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
                if (f39744k0 != null && (expressInfo2 = f39744k0.getExpressInfo()) != null) {
                    depositAmount = expressInfo2.getDepositAmount();
                } else {
                    depositAmount = null;
                }
                OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
                if (f39744k1 != null && (expressInfo = f39744k1.getExpressInfo()) != null) {
                    currency = expressInfo.getDepositCurrency();
                }
                baseTextView4.setText(getStringRes(i11, depositAmount, currency));
            }
        } else {
            C37678r1 c37678r1M48680D11 = m48680D4();
            if (c37678r1M48680D11 != null && (baseTextView = c37678r1M48680D11.f84564n0) != null) {
                int i12 = R$string.p2pexpress_ordersuccess_detail;
                OrderDetailInfo f39744k2 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
                if (f39744k2 != null) {
                    currencyAmount = f39744k2.getCurrencyAmount();
                } else {
                    currencyAmount = null;
                }
                OrderDetailInfo f39744k3 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
                if (f39744k3 != null) {
                    currency = f39744k3.getCurrency();
                }
                baseTextView.setText(getStringRes(i12, currencyAmount, currency));
            }
        }
        C37678r1 c37678r1M48680D12 = m48680D4();
        if (c37678r1M48680D12 != null && (baseTextView3 = c37678r1M48680D12.f84564n0) != null) {
            HighlightTextHelper.f43497a.m54120f(baseTextView3, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(getColorRes(R$color.brandGreen))));
        }
        C37678r1 c37678r1M48680D13 = m48680D4();
        if (c37678r1M48680D13 != null && (baseTextView2 = c37678r1M48680D13.f84564n0) != null) {
            C27046k.m66685H(baseTextView2);
        }
        C37678r1 c37678r1M48680D14 = m48680D4();
        if (c37678r1M48680D14 != null && (kcPrimaryButton = c37678r1M48680D14.f84495F) != null) {
            kcPrimaryButton.setText(getStringRes(R$string.otc_trade_directly, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: e5 */
    public final void m48710e5() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView10;
        KcSecondaryButton kcSecondaryButton;
        BaseTextView baseTextView11;
        ConstraintLayout constraintLayout3;
        ConstraintLayout constraintLayout4;
        AlertTipsTextView alertTipsTextView;
        C37678r1 c37678r1M48680D4 = m48680D4();
        if (c37678r1M48680D4 != null && (alertTipsTextView = c37678r1M48680D4.f84574s0) != null) {
            C27046k.m66700o(alertTipsTextView);
        }
        C37678r1 c37678r1M48680D5 = m48680D4();
        if (c37678r1M48680D5 != null && (constraintLayout4 = c37678r1M48680D5.f84486A0) != null) {
            C27046k.m66685H(constraintLayout4);
        }
        C37678r1 c37678r1M48680D6 = m48680D4();
        if (c37678r1M48680D6 != null && (constraintLayout3 = c37678r1M48680D6.f84528V0) != null) {
            C27046k.m66685H(constraintLayout3);
        }
        C37678r1 c37678r1M48680D7 = m48680D4();
        if (c37678r1M48680D7 != null && (baseTextView11 = c37678r1M48680D7.f84522S0) != null) {
            C27046k.m66685H(baseTextView11);
        }
        C37678r1 c37678r1M48680D8 = m48680D4();
        if (c37678r1M48680D8 != null && (kcSecondaryButton = c37678r1M48680D8.f84489C) != null) {
            C27046k.m66700o(kcSecondaryButton);
        }
        C37678r1 c37678r1M48680D9 = m48680D4();
        if (c37678r1M48680D9 != null && (baseTextView10 = c37678r1M48680D9.f84499H) != null) {
            C27046k.m66700o(baseTextView10);
        }
        C37678r1 c37678r1M48680D10 = m48680D4();
        if (c37678r1M48680D10 != null && (constraintLayout2 = c37678r1M48680D10.f84536Z0) != null) {
            C27046k.m66700o(constraintLayout2);
        }
        C37678r1 c37678r1M48680D11 = m48680D4();
        if (c37678r1M48680D11 != null && (constraintLayout = c37678r1M48680D11.f84494E0) != null) {
            C27046k.m66700o(constraintLayout);
        }
        C37678r1 c37678r1M48680D12 = m48680D4();
        if (c37678r1M48680D12 != null && (baseTextView9 = c37678r1M48680D12.f84585y) != null) {
            C27046k.m66685H(baseTextView9);
        }
        C37678r1 c37678r1M48680D13 = m48680D4();
        if (c37678r1M48680D13 != null && (baseTextView8 = c37678r1M48680D13.f84587z) != null) {
            C27046k.m66685H(baseTextView8);
        }
        C37678r1 c37678r1M48680D14 = m48680D4();
        if (c37678r1M48680D14 != null && (baseTextView7 = c37678r1M48680D14.f84485A) != null) {
            C27046k.m66700o(baseTextView7);
        }
        C37678r1 c37678r1M48680D15 = m48680D4();
        if (c37678r1M48680D15 != null && (baseTextView6 = c37678r1M48680D15.f84487B) != null) {
            C27046k.m66700o(baseTextView6);
        }
        C37678r1 c37678r1M48680D16 = m48680D4();
        if (c37678r1M48680D16 != null && (baseTextView5 = c37678r1M48680D16.f84576t0) != null) {
            baseTextView5.setText(getString(R$string.payment_p2p_order_appeal_waiting_cs));
        }
        C37678r1 c37678r1M48680D17 = m48680D4();
        if (c37678r1M48680D17 != null && (baseTextView4 = c37678r1M48680D17.f84560l0) != null) {
            baseTextView4.setText(getString(R$string.payment_p2p_order_appealing_cs_subtitle));
        }
        C37678r1 c37678r1M48680D18 = m48680D4();
        if (c37678r1M48680D18 != null && (baseTextView3 = c37678r1M48680D18.f84585y) != null) {
            baseTextView3.setText(getString(R$string.payment_p2p_order_appealing_cs_desc1));
        }
        C37678r1 c37678r1M48680D19 = m48680D4();
        if (c37678r1M48680D19 != null && (baseTextView2 = c37678r1M48680D19.f84587z) != null) {
            baseTextView2.setText(getString(R$string.payment_p2p_order_appealing_cs_desc2));
        }
        C37678r1 c37678r1M48680D20 = m48680D4();
        BaseTextView baseTextView12 = null;
        if (c37678r1M48680D20 != null) {
            baseTextView = c37678r1M48680D20.f84585y;
        } else {
            baseTextView = null;
        }
        m48708c6(baseTextView);
        C37678r1 c37678r1M48680D21 = m48680D4();
        if (c37678r1M48680D21 != null) {
            baseTextView12 = c37678r1M48680D21.f84587z;
        }
        m48707b6(baseTextView12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.p2p.order.OrderCountdownOwner
    @NotNull
    /* JADX INFO: renamed from: f1 */
    public LiveData<Long> mo48711f1() {
        return ((OrderDetailViewModel) m45631m3()).m48771P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h5 */
    public final boolean m48715h5() {
        Boolean boolValueOf;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k0 != null) {
            boolValueOf = Boolean.valueOf(f39744k0.isP2PExpress());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            return CollectionsKt.listOf((Object[]) new String[]{"BUY_STATUS_ORDER_CANCELED", "BUY_STATUS_EXPRESS_ORDER_SUCCEEDED", "BUY_STATUS_EXPRESS_ORDER_FAILED", "BUY_STATUS_EXPRESS_ORDER_CANCELED", "SELL_STATUS_ORDER_CANCELED", "SELL_STATUS_ORDER_CHARGED"}).contains(this.f39723V);
        }
        return CollectionsKt.listOf((Object[]) new String[]{"BUY_STATUS_ORDER_CANCELED", "BUY_STATUS_ORDER_CHARGED", "SELL_STATUS_ORDER_CANCELED", "SELL_STATUS_ORDER_CHARGED"}).contains(this.f39723V);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j6 */
    public final void m48717j6() {
        String legalCurrency;
        String currency;
        String status;
        Boolean boolValueOf;
        Boolean buyerRole;
        String legalCurrency2;
        String currency2;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        String status2 = null;
        if (f39744k0 != null) {
            legalCurrency = f39744k0.getLegalCurrency();
        } else {
            legalCurrency = null;
        }
        Pair pairM90091to = TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(legalCurrency));
        OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k1 != null) {
            currency = f39744k1.getCurrency();
        } else {
            currency = null;
        }
        Pair pairM90091to2 = TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(currency));
        OrderDetailInfo f39744k2 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k2 != null) {
            status = f39744k2.getStatus();
        } else {
            status = null;
        }
        Pair pairM90091to3 = TuplesKt.m90091to("status", C27041f.m66668h(status));
        OrderDetailInfo f39744k3 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k3 != null) {
            boolValueOf = Boolean.valueOf(f39744k3.isP2PExpress());
        } else {
            boolValueOf = null;
        }
        Pair pairM90091to4 = TuplesKt.m90091to("isP2PExpress", Boolean.valueOf(C27025c.m66566d(boolValueOf)));
        OrderDetailInfo f39744k4 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k4 != null) {
            buyerRole = f39744k4.getBuyerRole();
        } else {
            buyerRole = null;
        }
        C43852m.m96590b("B7P2POrderDetails", "upCancelButton", "1", pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, TuplesKt.m90091to("pay_side", Boolean.valueOf(C27025c.m66566d(buyerRole))), TuplesKt.m90091to("norm_version", "1"));
        C37265w c37265w = C37265w.f82633a;
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        OrderDetailInfo f39744k5 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k5 != null) {
            legalCurrency2 = f39744k5.getLegalCurrency();
        } else {
            legalCurrency2 = null;
        }
        OrderDetailInfo f39744k6 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k6 != null) {
            currency2 = f39744k6.getCurrency();
        } else {
            currency2 = null;
        }
        OrderDetailInfo f39744k7 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k7 != null) {
            status2 = f39744k7.getStatus();
        }
        c37265w.m83409y(mContext, childFragmentManager, legalCurrency2, currency2, status2, new Function0() { // from class: com.kubi.payment.p2p.order.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.m48634k6(this.f39835b);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: n3 */
    public void mo45632n3() {
        String strM56284y;
        Boolean boolValueOf;
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.m54692c();
        }
        TitleBar titleBar = getTitleBar();
        if (titleBar != null) {
            titleBar.m58934f();
        }
        String strM56284y2 = null;
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        OrderDetailViewModel orderDetailViewModel = (OrderDetailViewModel) m45631m3();
        Bundle arguments = getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "id");
        } else {
            strM56284y = null;
        }
        String strM66668h = C27041f.m66668h(strM56284y);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            boolValueOf = Boolean.valueOf(RouteExKt.m56250h(arguments2, "isCreateOrder"));
        } else {
            boolValueOf = null;
        }
        boolean zM66566d = C27025c.m66566d(boolValueOf);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            strM56284y2 = RouteExKt.m56284y(arguments3, "spm");
        }
        orderDetailViewModel.m48790l0(this, strM66668h, zM66566d, strM56284y2);
        m48575I4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: o3 */
    public void mo45633o3() {
        super.mo45633o3();
        ((OrderDetailViewModel) m45631m3()).m48777V().observe(getViewLifecycleOwner(), new C21094b(new Function1() { // from class: com.kubi.payment.p2p.order.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailFragment.m48631j5(this.f39869b, (Boolean) obj);
            }
        }));
        ((OrderDetailViewModel) m45631m3()).m48778W().observe(getViewLifecycleOwner(), new C21094b(new Function1() { // from class: com.kubi.payment.p2p.order.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailFragment.m48633k5(this.f39873b, (Boolean) obj);
            }
        }));
        ((OrderDetailViewModel) m45631m3()).m48780Y().observe(getViewLifecycleOwner(), new C21094b(new Function1() { // from class: com.kubi.payment.p2p.order.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailFragment.m48636l5(this.f39876b, (Boolean) obj);
            }
        }));
        ((OrderDetailViewModel) m45631m3()).m48779X().observe(getViewLifecycleOwner(), new C21094b(new Function1() { // from class: com.kubi.payment.p2p.order.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailFragment.m48638m5(this.f39878b, (Boolean) obj);
            }
        }));
        ((OrderDetailViewModel) m45631m3()).m48771P().observe(getViewLifecycleOwner(), new C21094b(new Function1() { // from class: com.kubi.payment.p2p.order.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailFragment.m48641n5(this.f39881b, (Long) obj);
            }
        }));
        ((OrderDetailViewModel) m45631m3()).m48787g0().observe(getViewLifecycleOwner(), new C21094b(new Function1() { // from class: com.kubi.payment.p2p.order.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailFragment.m48643o5(this.f39950b, (Long) obj);
            }
        }));
        ((OrderDetailViewModel) m45631m3()).m48786f0().observe(getViewLifecycleOwner(), new C21094b(new Function1() { // from class: com.kubi.payment.p2p.order.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailFragment.m48646p5(this.f39953b, (ReleaseCrypto) obj);
            }
        }));
        if (C12573b.f21598a.m23696a()) {
            "START_CHAT_VIEW_EVENT".length();
        }
        C12572a.m23692a(this, false, new OrderDetailFragment$observeData$$inlined$bindFlowEvent$1("START_CHAT_VIEW_EVENT", null, this));
        ((OrderDetailViewModel) m45631m3()).m48775T().observe(getViewLifecycleOwner(), new C21094b(new Function1() { // from class: com.kubi.payment.p2p.order.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailFragment.m48628i5(this.f39956b, (Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f39724W) {
            this.f39724W = false;
            OrderDetailViewModel.m48744b0((OrderDetailViewModel) m45631m3(), false, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q5 */
    public final void m48720q5() {
        String legalCurrency;
        String currency;
        Boolean boolValueOf;
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        Boolean needPriceReminder = null;
        if (f39744k0 != null) {
            legalCurrency = f39744k0.getLegalCurrency();
        } else {
            legalCurrency = null;
        }
        Pair pairM90091to = TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(legalCurrency));
        OrderDetailInfo f39744k1 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k1 != null) {
            currency = f39744k1.getCurrency();
        } else {
            currency = null;
        }
        Pair pairM90091to2 = TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(currency));
        OrderDetailInfo f39744k2 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k2 != null) {
            boolValueOf = Boolean.valueOf(f39744k2.isP2PExpress());
        } else {
            boolValueOf = null;
        }
        C43852m.m96590b("B7P2POrderDetails", "transferButton", "1", pairM90091to, pairM90091to2, TuplesKt.m90091to("isP2PExpress", Boolean.valueOf(C27025c.m66566d(boolValueOf))));
        OrderDetailInfo f39744k3 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k3 != null) {
            needPriceReminder = f39744k3.getNeedPriceReminder();
        }
        if (C27025c.m66566d(needPriceReminder)) {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54169Z4(true).m54157N4(true).m54167X4(R$string.payment_please_be_alert).m54148E4(R$layout.payment_text_view, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.payment.p2p.order.l0
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    OrderDetailFragment.m48651r5(this.f39859b, baseViewHolder, dialogFragmentHelper);
                }
            }).m54162S4(R$string.payment_i_know, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.p2p.order.m0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    OrderDetailFragment.m48656t5(this.f39862b, dialogInterface, i11);
                }
            });
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            alertDialogFragmentHelperM54162S4.show(childFragmentManager, "payment_p2p_price_alert");
            return;
        }
        m48682E4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u6 */
    public final void m48723u6() {
        String userAppealConsentResult;
        if (((OrderDetailViewModel) m45631m3()).getF39750q0()) {
            return;
        }
        ((OrderDetailViewModel) m45631m3()).m48763I0(true);
        C37265w c37265w = C37265w.f82633a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        OrderDetailInfo f39744k0 = ((OrderDetailViewModel) m45631m3()).getF39744k0();
        if (f39744k0 != null) {
            userAppealConsentResult = f39744k0.getUserAppealConsentResult();
        } else {
            userAppealConsentResult = null;
        }
        c37265w.m83404N(childFragmentManager, C27041f.m66668h(userAppealConsentResult), new Function0() { // from class: com.kubi.payment.p2p.order.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.m48663v6(this.f39961b);
            }
        }, new Function0() { // from class: com.kubi.payment.p2p.order.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailFragment.m48667w6(this.f39964b);
            }
        });
    }
}
