package com.kubi.payment.flutter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import b00.InterfaceC4435r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.chat.service.ChatClient;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.otc.PaymentWebActivity;
import com.kubi.otc.R$string;
import com.kubi.otc.otc.paytype.PayTypeWayFragment;
import com.kubi.otc.service.OtcDepend;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.payment.chat.ChatConfig;
import com.kubi.payment.chat.entity.ChatInfo;
import com.kubi.payment.chat.p105ui.ChatFragment;
import com.kubi.payment.fast.buy.recurring.RecurringFrequency;
import com.kubi.payment.kucard.helper.KuCardHelper;
import com.kubi.payment.p2p.trade.ContainerBaseFragment;
import com.kubi.payment.p2p.trade.MerchantQualificationDialog;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgePaymentRecurringFrequencyInfo;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import cy.InterfaceC36555b;
import f00.C37304a;
import g00.InterfaceC37759k;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p638tb.AbstractC44914a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCFlutterBridgePaymentCallIMpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J6\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J.\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J@\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J6\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\t2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J>\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J6\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\t2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J.\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J>\u0010 \u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J[\u0010#\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00142\b\u0010%\u001a\u0004\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\u00142\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016¢\u0006\u0002\u0010(J^\u0010)\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00142\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016JM\u00100\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u0001022\b\u00103\u001a\u0004\u0018\u00010\u00142\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016¢\u0006\u0002\u00104J>\u00105\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u0001022\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J.\u00106\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J.\u00107\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J.\u00108\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J.\u00109\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J.\u0010:\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J.\u0010;\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J.\u0010<\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u000fH\u0016¨\u0006="}, m90084d2 = {"Lcom/kubi/payment/flutter/KCFlutterBridgePaymentCallIMpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgePaymentCall;", "<init>", "()V", "selectRecurringFrequency", "", "ctx", "Landroid/content/Context;", "frequency", "", "dayOfMonth", "dayOfWeek", "timeOfDay", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgePaymentRecurringFrequencyInfo;", "Lcom/kubi/sdk/protocol/ProtocolException;", "checkSafeVerify", "bizType", "", "needShowKucardGuide", "openWebUrlByIgnoreWhiteList", "url", "title", "showKuCardGuide", BridgeParamKeyKt.SHARE_KEY_LINKURL, "checkSafeVerifyWhileWithdraw", "fiatAmount", "fiatCurrency", "onSelectFiatCurrency", "onCheckTradePwd", "onShowTradeToastNotice", "code", "msg", "showP2PMerchantIdentityInfo", "foxKingMerchants", "foxKingMarginAmount", "foxKingMarginCurrency", "goldMerchants", "(Landroid/content/Context;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "jumpP2PChatPage", "orderId", "from", "fromName", TypedValues.TransitionType.S_TO, "toName", "canChat", "isSupportApplePay", "allowedCardNetworks", "", "isRecurring", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "isSupportGooglePay", "jumpP2PAddPaymentMethod", "goToUpgrade", "jumpAdManagerPage", "jumpPaymentMethodPage", "showP2PExpressNoMatchAdDialog", "showP2PExpressPriceDetailDialog", "verifyKycDialog", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgePaymentCallIMpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgePaymentCallIMpl.kt\ncom/kubi/payment/flutter/KCFlutterBridgePaymentCallIMpl\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,415:1\n19#2,2:416\n19#2,2:425\n19#2,2:427\n19#2,2:429\n19#2,2:431\n76#3,7:418\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgePaymentCallIMpl.kt\ncom/kubi/payment/flutter/KCFlutterBridgePaymentCallIMpl\n*L\n174#1:416,2\n236#1:425,2\n261#1:427,2\n316#1:429,2\n164#1:431,2\n191#1:418,7\n*E\n"})
public final class KCFlutterBridgePaymentCallIMpl implements InterfaceC4435r {

    /* JADX INFO: renamed from: com.kubi.payment.flutter.KCFlutterBridgePaymentCallIMpl$a */
    /* JADX INFO: compiled from: KCFlutterBridgePaymentCallIMpl.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/payment/flutter/KCFlutterBridgePaymentCallIMpl$jumpP2PChatPage$1$1", "Lcom/kubi/chat/service/AbsChatUIListener;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20976a extends AbstractC44914a {
    }

    /* JADX INFO: renamed from: D */
    public static final void m48141D(Function2 function2, int i11, Intent intent) {
        if (i11 == -1) {
            function2.invoke(Boolean.TRUE, null);
        } else {
            function2.invoke(Boolean.FALSE, null);
        }
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m48142E(final Function2 function2) {
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.payment.flutter.n
            @Override // java.lang.Runnable
            public final void run() {
                KCFlutterBridgePaymentCallIMpl.m48143F(function2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final void m48143F(Function2 function2) {
        function2.invoke(Boolean.TRUE, null);
    }

    /* JADX INFO: renamed from: G */
    public static final void m48144G(Context context) {
        BaseFragmentActivity.m56573m0(context, context.getString(R$string.payment_p2p_menu_payment), PayTypeWayFragment.class.getName());
    }

    /* JADX INFO: renamed from: H */
    public static final void m48145H(String str, String str2, String str3, Context context, Function2 function2, boolean z11, String str4, String str5) {
        ChatClient.Companion companion = ChatClient.INSTANCE;
        companion.init(new ChatConfig(str));
        ChatClient chatClient = companion.get();
        if (chatClient != null) {
            chatClient.m20390e(str2);
        }
        ChatClient chatClient2 = companion.get();
        if (chatClient2 != null) {
            chatClient2.m20395j(C27041f.m66668h(str3), new C20976a());
        }
        BaseActivity.Companion companion2 = BaseActivity.INSTANCE;
        Bundle bundle = new Bundle();
        bundle.putString("oId", str3);
        bundle.putBoolean("isForbid", !z11);
        bundle.putParcelable("info", new ChatInfo(str, str4, str2, str5));
        Unit unit = Unit.INSTANCE;
        companion2.launch(context, ChatFragment.class, bundle);
        function2.invoke(Boolean.TRUE, null);
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m48146I(ContainerBaseFragment containerBaseFragment, FragmentTransaction fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "$this$fragmentManager");
        fragmentManager.add(containerBaseFragment, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final void m48147J(Function2 function2) {
        function2.invoke(Boolean.TRUE, null);
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m48148K(ContainerBaseFragment containerBaseFragment, FragmentTransaction fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "$this$fragmentManager");
        fragmentManager.add(containerBaseFragment, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final void m48149L(Context context, String str, String str2, Boolean bool, Boolean bool2, Function2 function2) {
        MerchantQualificationDialog.Companion companion = MerchantQualificationDialog.f39972t0;
        FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        companion.showMerchantQualificationDialog(supportFragmentManager, new MerchantQualificationDialog.MerchantQualification(str, str2, bool, bool2));
        function2.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: a */
    public void mo4194a(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(KuCardHelper.f39574a.m48299e()), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: b */
    public void mo4195b(@NotNull Context ctx, @NotNull String frequency, @NotNull String dayOfMonth, @NotNull String dayOfWeek, @NotNull String timeOfDay, @NotNull String timeZone, @NotNull Function2<? super KCFlutterBridgePaymentRecurringFrequencyInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(dayOfMonth, "dayOfMonth");
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof FragmentActivity)) {
            callback.invoke(null, null);
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) ctx), null, null, new KCFlutterBridgePaymentCallIMpl$selectRecurringFrequency$1(ctx, new RecurringFrequency(frequency, timeOfDay, (String) null, timeZone, (String) null, dayOfWeek, (String) null, dayOfMonth, (String) null, 340, (DefaultConstructorMarker) null), callback, null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: c */
    public void mo4196c(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof FragmentActivity)) {
            callback.invoke(Boolean.FALSE, null);
            return;
        }
        final ContainerBaseFragment containerBaseFragment = new ContainerBaseFragment();
        Bundle bundle = new Bundle();
        bundle.putString("CMD", "CHECK_TRADE_PWD");
        containerBaseFragment.setArguments(bundle);
        C27032f.m66614e((FragmentActivity) ctx, new Function1() { // from class: com.kubi.payment.flutter.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCFlutterBridgePaymentCallIMpl.m48146I(containerBaseFragment, (FragmentTransaction) obj);
            }
        });
        LifecycleOwner lifecycleOwner = (LifecycleOwner) ctx;
        if (C12573b.f21598a.m23696a()) {
            "RESULT".length();
        }
        C12572a.m23692a(lifecycleOwner, false, new C20977xf8471c2b("RESULT", null, callback));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: d */
    public void mo4197d(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof FragmentActivity)) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) ctx), null, null, new KCFlutterBridgePaymentCallIMpl$verifyKycDialog$1(ctx, null), 3, null);
            callback.invoke(Boolean.TRUE, null);
        }
    }

    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: e */
    public void mo4198e(@NotNull Context ctx, @NotNull String fiatAmount, @NotNull String fiatCurrency, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(callback, "callback");
        OtcDepend otcDepend = OtcDepend.f38138a;
        HashMap map = new HashMap();
        map.put("validation", "FIAT_WITHDRAW");
        map.put(FirebaseAnalytics.Param.CURRENCY, fiatCurrency);
        map.put("amount", fiatAmount);
        otcDepend.m45456e(map, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.payment.flutter.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCFlutterBridgePaymentCallIMpl.m48142E(callback);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: f */
    public void mo4199f(@NotNull Context ctx, @NotNull String linkUrl, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (ctx instanceof FragmentActivity) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) ctx), null, null, new KCFlutterBridgePaymentCallIMpl$showKuCardGuide$1(ctx, linkUrl, callback, null), 3, null);
        } else {
            callback.invoke(Boolean.FALSE, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: g */
    public void mo4200g(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof FragmentActivity)) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) ctx), null, null, new KCFlutterBridgePaymentCallIMpl$jumpAdManagerPage$1(ctx, null), 3, null);
            callback.invoke(Boolean.TRUE, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: h */
    public void mo4201h(@NotNull Context ctx, @Nullable List<String> list, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (ctx instanceof FragmentActivity) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) ctx), null, null, new KCFlutterBridgePaymentCallIMpl$isSupportGooglePay$1(ctx, list, callback, null), 3, null);
        } else {
            callback.invoke(Boolean.FALSE, null);
        }
    }

    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: i */
    public void mo4202i(@NotNull Context ctx, @NotNull String url, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callback, "callback");
        PaymentWebActivity.Companion.openUrl$default(PaymentWebActivity.f37079t, ctx, url, str, null, false, true, 24, null);
        callback.invoke(Boolean.TRUE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: j */
    public void mo4203j(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof FragmentActivity)) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) ctx), null, null, new KCFlutterBridgePaymentCallIMpl$jumpPaymentMethodPage$1(ctx, null), 3, null);
            callback.invoke(Boolean.TRUE, null);
        }
    }

    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: k */
    public void mo4204k(@NotNull Context ctx, @NotNull String code, @NotNull String msg, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof FragmentActivity)) {
            callback.invoke(Boolean.FALSE, null);
            return;
        }
        final ContainerBaseFragment containerBaseFragment = new ContainerBaseFragment();
        Bundle bundle = new Bundle();
        bundle.putString("CMD", "SHOW_TRADE_NOTICE");
        bundle.putString("code", code);
        bundle.putString("msg", msg);
        containerBaseFragment.setArguments(bundle);
        C27032f.m66614e((FragmentActivity) ctx, new Function1() { // from class: com.kubi.payment.flutter.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCFlutterBridgePaymentCallIMpl.m48148K(containerBaseFragment, (FragmentTransaction) obj);
            }
        });
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: l */
    public void mo4205l(@NotNull Context ctx, @Nullable List<String> list, @Nullable Boolean bool, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.FALSE, null);
    }

    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: m */
    public void mo4206m(@NotNull Context ctx, @NotNull String fiatCurrency, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C12572a.m23695d("PAYMENT_EVENT_SELECT_FIAT_CURRENCY", fiatCurrency, 0L, 4, null);
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.payment.flutter.i
            @Override // java.lang.Runnable
            public final void run() {
                KCFlutterBridgePaymentCallIMpl.m48147J(callback);
            }
        });
    }

    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: n */
    public void mo4207n(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        OtcDepend.f38138a.m45462k().mo41621d();
    }

    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: o */
    public void mo4208o(@NotNull Context ctx, @NotNull String bizType, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        ValidationBizEnum validationBizEnum;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ValidationBizEnum[] validationBizEnumArrValues = ValidationBizEnum.values();
        int length = validationBizEnumArrValues.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                validationBizEnum = null;
                break;
            }
            validationBizEnum = validationBizEnumArrValues[i11];
            if (Intrinsics.areEqual(validationBizEnum.name(), bizType)) {
                break;
            } else {
                i11++;
            }
        }
        if (validationBizEnum == null) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            InterfaceC37759k.a.m85171e(C37304a.f82764a, validationBizEnum.name(), null, null, null, new InterfaceC36555b() { // from class: com.kubi.payment.flutter.j
                @Override // cy.InterfaceC36555b
                /* JADX INFO: renamed from: a */
                public final void mo4404a(int i12, Intent intent) {
                    KCFlutterBridgePaymentCallIMpl.m48141D(callback, i12, intent);
                }
            }, 14, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: p */
    public void mo4209p(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof FragmentActivity)) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) ctx), null, null, new KCFlutterBridgePaymentCallIMpl$showP2PExpressNoMatchAdDialog$1(ctx, null), 3, null);
            callback.invoke(Boolean.TRUE, null);
        }
    }

    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: q */
    public void mo4210q(@NotNull final Context ctx, @Nullable final Boolean bool, @Nullable final String str, @Nullable final String str2, @Nullable final Boolean bool2, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof FragmentActivity)) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.payment.flutter.g
                @Override // java.lang.Runnable
                public final void run() {
                    KCFlutterBridgePaymentCallIMpl.m48149L(ctx, str, str2, bool, bool2, callback);
                }
            });
        }
    }

    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: r */
    public void mo4211r(@NotNull final Context ctx, @NotNull final String orderId, @NotNull final String from, @NotNull final String fromName, @NotNull final String to2, @NotNull final String toName, final boolean z11, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(fromName, "fromName");
        Intrinsics.checkNotNullParameter(to2, "to");
        Intrinsics.checkNotNullParameter(toName, "toName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.payment.flutter.k
            @Override // java.lang.Runnable
            public final void run() {
                KCFlutterBridgePaymentCallIMpl.m48145H(from, to2, orderId, ctx, callback, z11, fromName, toName);
            }
        });
    }

    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: s */
    public void mo4212s(@NotNull final Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.payment.flutter.l
                @Override // java.lang.Runnable
                public final void run() {
                    KCFlutterBridgePaymentCallIMpl.m48144G(ctx);
                }
            });
            callback.invoke(Boolean.TRUE, null);
        } catch (Exception e11) {
            e11.printStackTrace();
            callback.invoke(Boolean.FALSE, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4435r
    /* JADX INFO: renamed from: t */
    public void mo4213t(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof FragmentActivity)) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) ctx), null, null, new KCFlutterBridgePaymentCallIMpl$showP2PExpressPriceDetailDialog$1(ctx, null), 3, null);
            callback.invoke(Boolean.TRUE, null);
        }
    }
}
