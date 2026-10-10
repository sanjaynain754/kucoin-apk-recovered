package com.kubi.payment.p106rn;

import af0.AbstractC0306f;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5258a;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.assets.entity.BlackGroupResponse;
import com.kubi.chat.service.ChatClient;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.kucoin.widget.upload.RxUpload;
import com.kubi.otc.PaymentWebActivity;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.chat.ChatConfig;
import com.kubi.payment.chat.entity.ChatInfo;
import com.kubi.payment.chat.p105ui.ChatFragment;
import com.kubi.payment.fast.buy.popularpay.googlepay.h;
import com.kubi.payment.util.ForterUtils;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentBlackGroupResponse;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentFastTradeGooglePayBillingAddress;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentFastTradeGooglePayPayload;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentFastTradeGooglePayRequest;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentNativeFileItem;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentNativeFilePickerResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentProtocolUrls;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentRecurringFrequencyInfo;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import cy.InterfaceC36555b;
import d00.InterfaceC36581p;
import f00.C37304a;
import g00.InterfaceC37759k;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p569qq.C43846g;
import p638tb.AbstractC44914a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Charsets;
import ro.C44128b;

/* JADX INFO: compiled from: KCRNBridgePaymentCallImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002*\u0001\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J@\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016J@\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016JH\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016J@\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016J_\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016¢\u0006\u0002\u0010\u001fJP\u0010 \u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001d2\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016Jp\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00152\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016J@\u0010(\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016JH\u0010)\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016JR\u0010+\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016JO\u0010.\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u0001002\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016¢\u0006\u0002\u00102Jd\u00103\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u0006\u00105\u001a\u00020\u00122\u0006\u00106\u001a\u00020\u00152\"\u0010\u0013\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016J@\u00107\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016Jp\u00108\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010?\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016JH\u0010@\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016JH\u0010B\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010C\u001a\u00020D2\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010E\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016J@\u0010F\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016JH\u0010G\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0017J\u0010\u0010I\u001a\u00020E2\u0006\u0010J\u001a\u00020KH\u0002JH\u0010L\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016J@\u0010M\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010N\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0017JH\u0010O\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016J@\u0010Q\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010R\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016J_\u0010S\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00122\b\u0010V\u001a\u0004\u0018\u0001002\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016¢\u0006\u0002\u0010WJP\u0010X\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016JP\u0010Y\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0014H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006Z²\u0006\n\u0010[\u001a\u00020\\X\u008a\u0084\u0002"}, m90084d2 = {"Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentModule;", "Lcom/kubi/payment/rn/IUnifyPaymentBridge;", "<init>", "()V", "uiProgress", "com/kubi/payment/rn/KCRNBridgePaymentCallImpl$uiProgress$2$1", "getUiProgress", "()Lcom/kubi/payment/rn/KCRNBridgePaymentCallImpl$uiProgress$2$1;", "uiProgress$delegate", "Lkotlin/Lazy;", "chatLoginout", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "getForterMobileUid", "getRiskSessionId", "bizType", "goToUpgrade", "isSupportApplePay", "allowedCardNetworks", "", "isRecurring", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "isSupportGooglePay", "jumpP2PChatPage", "orderId", "from", "fromName", TypedValues.TransitionType.S_TO, "toName", "canChat", "jumpPaymentMethodPage", "openThirdPurchaseOrderChannel", "orderJson", "openWebUrlByIgnoreWhiteList", "url", "title", "paymentPickImageAndVideoAndFile", "type", "", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentNativeFilePickerResult;", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "paymentUploadFileList", "pathList", "businessType", "isPdf", "playCancelOrderAudio", "selectRecurringFrequency", "update", "frequency", "dayOfMonth", "dayOfWeek", "timeOfDay", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentRecurringFrequencyInfo;", "showCouponPopup", "data", "showFastTradeGooglePay", "request", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeGooglePayRequest;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentFastTradeGooglePayPayload;", "toAdaChatDirectly", "uploadThirdPurchaseKycImage", "imageUri", "parseGooglePaymentData", "paymentData", "Lcom/google/android/gms/wallet/PaymentData;", "investmentCheckSafeVerify", "checkWithdrawLimit", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentBlackGroupResponse;", "getTotalBalance", "balanceCurrency", "getP2PProtocalUrls", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentProtocolUrls;", "paymentGetVideoThumbnail", "isRemoteUrl", "fileUrl", C33757kf.f70665k, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "paymentViewPdf", "paymentViewVideo", "PaymentLib_googleRelease", "viewModel", "Lcom/kubi/payment/fasttradev2/FastTradeViewModel;"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCRNBridgePaymentCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCRNBridgePaymentCallImpl.kt\ncom/kubi/payment/rn/KCRNBridgePaymentCallImpl\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,620:1\n19#2,2:621\n44#3,2:623\n1#4:625\n*S KotlinDebug\n*F\n+ 1 KCRNBridgePaymentCallImpl.kt\ncom/kubi/payment/rn/KCRNBridgePaymentCallImpl\n*L\n199#1:621,2\n434#1:623,2\n*E\n"})
public final class KCRNBridgePaymentCallImpl implements InterfaceC36581p, IUnifyPaymentBridge {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f40172a = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.rn.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KCRNBridgePaymentCallImpl.m49466t0();
        }
    });

    /* JADX INFO: renamed from: com.kubi.payment.rn.KCRNBridgePaymentCallImpl$a */
    /* JADX INFO: compiled from: KCRNBridgePaymentCallImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/payment/rn/KCRNBridgePaymentCallImpl$jumpP2PChatPage$1$1", "Lcom/kubi/chat/service/AbsChatUIListener;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21351a extends AbstractC44914a {
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m49458k0(Function2 function2, int i11, Intent intent) {
        if (i11 == -1) {
            function2.invoke(Boolean.TRUE, null);
        } else {
            function2.invoke(Boolean.FALSE, null);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m49461o0(Function2 function2, String str) {
        function2.invoke(str, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m49462p0(Function2 function2, String str, String str2, String str3) {
        if (str == null || str.length() == 0) {
            function2.invoke(null, new ProtocolException("No file selected", null, null, false, 14, null));
        } else {
            function2.invoke(new KCJSApiPaymentNativeFilePickerResult(CollectionsKt.listOf(new KCJSApiPaymentNativeFileItem(str, C27041f.m66668h(str2), str3 != null ? Long.valueOf(Long.parseLong(str3)) : null))), null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m49463q0(Function2 function2, List list) {
        function2.invoke(list, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m49464r0(Function2 function2, Boolean bool) {
        function2.invoke(bool, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m49465s0(Function2 function2, Boolean bool) {
        function2.invoke(bool, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v0 */
    public static final void m49468v0(Function2 function2, String str) {
        function2.invoke(str, null);
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m49454f0() {
        ChatClient chatClient = ChatClient.INSTANCE.get();
        if (chatClient != null) {
            chatClient.m20392g();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m49455g0(Function2 function2, BlackGroupResponse blackGroupResponse) {
        function2.invoke(new KCJSApiPaymentBlackGroupResponse(Long.valueOf(blackGroupResponse.getTime()), blackGroupResponse.getChannel(), blackGroupResponse.getGroupCode(), blackGroupResponse.getFreezeContent(), blackGroupResponse.getFreezeHelpUrl()), null);
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m49456h0(Function2 function2, Throwable th2) {
        String message = th2.getMessage();
        if (message == null) {
            message = "checkWithdrawLimit error";
        }
        function2.invoke(null, new ProtocolException(message, null, null, false, 14, null));
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m49457i0(Function2 function2, String privacyUserTerm, String agreementTerm) {
        Intrinsics.checkNotNullParameter(privacyUserTerm, "privacyUserTerm");
        Intrinsics.checkNotNullParameter(agreementTerm, "agreementTerm");
        function2.invoke(new KCJSApiPaymentProtocolUrls(privacyUserTerm, agreementTerm), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m49460m0(Function2 function2, Boolean bool, String str) {
        function2.invoke(bool, str != null ? new ProtocolException(str, null, null, false, 14, null) : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t0 */
    public static final C21352b m49466t0() {
        return new C21352b();
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m49467u0(Function2 function2, Throwable th2) {
        String message = th2.getMessage();
        if (message == null) {
            message = "Upload error";
        }
        function2.invoke(null, new ProtocolException(message, null, null, false, 14, null));
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: A */
    public void mo49469A(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String bizType, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97265i("KCRNBridgePaymentCallIMpl getRiskSessionId source:" + source + ", bizType:" + bizType);
        ComponentCallbacks2 componentCallbacks2M6125h = C5258a.m6125h();
        if (componentCallbacks2M6125h instanceof FragmentActivity) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) componentCallbacks2M6125h), null, null, new KCRNBridgePaymentCallImpl$getRiskSessionId$1(bizType, callback, null), 3, null);
        } else {
            callback.invoke(null, new ProtocolException("Top activity is not FragmentActivity", null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: B */
    public void mo49470B(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m49436w();
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: C */
    public void mo49471C(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String url, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        if (!(activityM6125h instanceof FragmentActivity)) {
            callback.invoke(Boolean.FALSE, new ProtocolException("Top activity is not FragmentActivity", null, null, false, 14, null));
            return;
        }
        C44128b.m97265i("KCRNBridgePaymentCallIMpl openWebUrlByIgnoreWhiteList");
        PaymentWebActivity.Companion.openUrl$default(PaymentWebActivity.f37079t, activityM6125h, url, str, null, false, true, 24, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: D */
    public void mo49472D(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull final Function2<? super KCJSApiPaymentProtocolUrls, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m49429H(new Function2() { // from class: com.kubi.payment.rn.r
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return KCRNBridgePaymentCallImpl.m49457i0(callback, (String) obj2, (String) obj3);
            }
        });
        C44128b.m97265i("KCRNBridgePaymentCallIMpl getP2PProtocalUrls invoked");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: F */
    public void mo49473F(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, boolean z11, @NotNull String frequency, @NotNull String dayOfMonth, @NotNull String dayOfWeek, @NotNull String timeOfDay, @NotNull String timeZone, @NotNull Function2<? super KCJSApiPaymentRecurringFrequencyInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(dayOfMonth, "dayOfMonth");
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof FragmentActivity) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activityM6125h), null, null, new KCRNBridgePaymentCallImpl$selectRecurringFrequency$1(frequency, timeOfDay, timeZone, dayOfWeek, dayOfMonth, activityM6125h, z11, callback, null), 3, null);
        } else {
            callback.invoke(null, new ProtocolException("Top activity is not FragmentActivity", null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: K */
    public void mo49474K(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable List<String> list, @Nullable Boolean bool, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.FALSE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: M */
    public void mo49475M(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable List<String> list, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof FragmentActivity) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activityM6125h), null, null, new KCRNBridgePaymentCallImpl$isSupportGooglePay$1(activityM6125h, list, callback, null), 3, null);
        } else {
            callback.invoke(Boolean.FALSE, new ProtocolException("Top activity is not FragmentActivity", null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: N */
    public void mo49476N(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String data, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        if (!(activityM6125h instanceof FragmentActivity)) {
            callback.invoke(Boolean.FALSE, new ProtocolException("Top activity is not FragmentActivity", null, null, false, 14, null));
        } else {
            FragmentActivity fragmentActivity = (FragmentActivity) activityM6125h;
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new KCRNBridgePaymentCallImpl$showCouponPopup$1$1(fragmentActivity, data, activityM6125h, callback, null), 3, null);
        }
    }

    @Override // d00.InterfaceC36581p
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: O */
    public void mo49477O(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull final Function2<? super KCJSApiPaymentBlackGroupResponse, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        OtcDepend.f38138a.m45457f().mo15342g().compose(C24217a1.m58390n()).subscribe(new Consumer() { // from class: com.kubi.payment.rn.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                KCRNBridgePaymentCallImpl.m49455g0(callback, (BlackGroupResponse) obj2);
            }
        }, new Consumer() { // from class: com.kubi.payment.rn.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                KCRNBridgePaymentCallImpl.m49456h0(callback, (Throwable) obj2);
            }
        });
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: b */
    public void mo49478b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, boolean z11, @NotNull String fileUrl, @Nullable Long l11, @NotNull final Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97265i("KCRNBridgePaymentCallIMpl paymentGetVideoThumbnail invoked isRemoteUrl:" + z11 + ", fileUrl:" + fileUrl + ", quality:" + l11);
        m49430J(z11, fileUrl, l11, new Function1() { // from class: com.kubi.payment.rn.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCRNBridgePaymentCallImpl.m49461o0(callback, (String) obj2);
            }
        });
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: c */
    public void mo49479c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String balanceCurrency, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(balanceCurrency, "balanceCurrency");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ComponentCallbacks2 componentCallbacks2M6125h = C5258a.m6125h();
        if (componentCallbacks2M6125h instanceof FragmentActivity) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) componentCallbacks2M6125h), null, null, new KCRNBridgePaymentCallImpl$getTotalBalance$1(balanceCurrency, callback, null), 3, null);
        } else {
            callback.invoke(null, new ProtocolException("Top activity is not FragmentActivity", null, null, false, 14, null));
        }
    }

    @Override // d00.InterfaceC36581p
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: d */
    public void mo49480d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String imageUri, @NotNull final Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (imageUri.length() == 0) {
            callback.invoke(null, new ProtocolException("Invalid image URI", null, null, false, 14, null));
        } else {
            Observable.create(RxUpload.k(imageUri, m49484j0())).compose(C24217a1.m58387k()).subscribe(new Consumer() { // from class: com.kubi.payment.rn.n
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    KCRNBridgePaymentCallImpl.m49468v0(callback, (String) obj2);
                }
            }, new Consumer() { // from class: com.kubi.payment.rn.o
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    KCRNBridgePaymentCallImpl.m49467u0(callback, (Throwable) obj2);
                }
            });
        }
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: f */
    public void mo49481f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull List<String> pathList, @NotNull String businessType, boolean z11, @NotNull final Function2<? super List<String>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(pathList, "pathList");
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m49427E(pathList, businessType, z11, new Function1() { // from class: com.kubi.payment.rn.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCRNBridgePaymentCallImpl.m49463q0(callback, (List) obj2);
            }
        });
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: g */
    public void mo49482g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        OtcDepend.f38138a.m45465n();
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: h */
    public void mo49483h(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, boolean z11, @NotNull String fileUrl, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97265i("KCRNBridgePaymentCallIMpl paymentViewVideo invoked isRemoteUrl:" + z11 + ", fileUrl:" + fileUrl);
        m49433p(z11, fileUrl, new Function1() { // from class: com.kubi.payment.rn.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCRNBridgePaymentCallImpl.m49465s0(callback, (Boolean) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final C21352b m49484j0() {
        return (C21352b) this.f40172a.getValue();
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: k */
    public void mo49485k(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C27100x0.m66924e(new Function0() { // from class: com.kubi.payment.rn.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCRNBridgePaymentCallImpl.m49454f0();
            }
        });
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: l */
    public void mo49486l(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull final String orderId, @NotNull final String from, @NotNull final String fromName, @NotNull final String to2, @NotNull final String toName, final boolean z11, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(fromName, "fromName");
        Intrinsics.checkNotNullParameter(to2, "to");
        Intrinsics.checkNotNullParameter(toName, "toName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97265i("KCRNBridgePaymentCallIMpl jumpP2PChatPage orderId:" + orderId + ", from:" + from + ", fromName:" + fromName + ", to:" + to2 + ", toName:" + toName + ", canChat:" + z11);
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.payment.rn.m
            @Override // java.lang.Runnable
            public final void run() {
                KCRNBridgePaymentCallImpl.m49459l0(callback, from, to2, orderId, z11, fromName, toName);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: m */
    public void mo49487m(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull KCJSApiPaymentFastTradeGooglePayRequest request, @NotNull Function2<? super KCJSApiPaymentFastTradeGooglePayPayload, ? super ProtocolException, Unit> callback) {
        Function2<? super KCJSApiPaymentFastTradeGooglePayPayload, ? super ProtocolException, Unit> function2;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        if (!(activityM6125h instanceof FragmentActivity)) {
            callback.invoke(null, new ProtocolException("Top activity is not FragmentActivity", null, null, false, 14, null));
            return;
        }
        try {
            PaymentDataRequest paymentDataRequestFromJson = PaymentDataRequest.fromJson(h.a.d(request.getAllowedCardNetworks(), request.getPrice(), request.getPublicKey(), request.getMerchantName(), request.getCurrencyCode(), request.getCountryCode()).toString());
            Intrinsics.checkNotNullExpressionValue(paymentDataRequestFromJson, "fromJson(...)");
            try {
                function2 = callback;
                try {
                    C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activityM6125h), null, null, new KCRNBridgePaymentCallImpl$showFastTradeGooglePay$1(activityM6125h, paymentDataRequestFromJson, callback, this, null), 3, null);
                } catch (Exception e11) {
                    e = e11;
                    Exception exc = e;
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "GooglePay error";
                    }
                    function2.invoke(null, new ProtocolException(message, null, null, false, 14, null));
                    C43846g.m96568c(new OtcException(new Throwable("Google Pay load payment data error1: " + exc.getMessage()), "payment", false, null, 8, null), null, 2, null);
                }
            } catch (Exception e12) {
                e = e12;
                function2 = callback;
            }
        } catch (Exception e13) {
            e = e13;
            function2 = callback;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: n */
    public void mo49488n(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        if (!(activityM6125h instanceof FragmentActivity)) {
            callback.invoke(Boolean.FALSE, new ProtocolException("Top activity is not FragmentActivity", null, null, false, 14, null));
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activityM6125h), null, null, new KCRNBridgePaymentCallImpl$jumpPaymentMethodPage$1(activityM6125h, null), 3, null);
            callback.invoke(Boolean.TRUE, null);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final KCJSApiPaymentFastTradeGooglePayPayload m49489n0(PaymentData paymentData) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3 = new JSONObject(paymentData.toJson()).optJSONObject("paymentMethodData");
        byte[] bytes = C27041f.m66668h((jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject3.optJSONObject("tokenizationData")) == null) ? null : jSONObjectOptJSONObject2.optString(InterfaceC33826o0.f71244p)).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        JSONObject jSONObjectOptJSONObject4 = (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("info")) == null) ? null : jSONObjectOptJSONObject.optJSONObject("billingAddress");
        KCJSApiPaymentFastTradeGooglePayBillingAddress kCJSApiPaymentFastTradeGooglePayBillingAddress = new KCJSApiPaymentFastTradeGooglePayBillingAddress(C27041f.m66668h(jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("name") : null), C27041f.m66668h(jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString(HintConstants.AUTOFILL_HINT_POSTAL_CODE) : null), C27041f.m66668h(jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE) : null), C27041f.m66668h(jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("locality") : null), C27041f.m66668h(jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("administrativeArea") : null), C27041f.m66668h(jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("sortingCode") : null), C27041f.m66668h(jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("address1") : null), C27041f.m66668h(jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("address2") : null), C27041f.m66668h(jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("address3") : null));
        Intrinsics.checkNotNull(strEncodeToString);
        return new KCJSApiPaymentFastTradeGooglePayPayload(strEncodeToString, kCJSApiPaymentFastTradeGooglePayBillingAddress);
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: o */
    public void mo49490o(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable Long l11, @NotNull final Function2<? super KCJSApiPaymentNativeFilePickerResult, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Integer numValueOf = l11 != null ? Integer.valueOf((int) l11.longValue()) : null;
        m49435v(numValueOf != null ? numValueOf.intValue() : 0, new Function3() { // from class: com.kubi.payment.rn.p
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return KCRNBridgePaymentCallImpl.m49462p0(callback, (String) obj2, (String) obj3, (String) obj4);
            }
        });
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: q */
    public void mo49491q(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String orderJson, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(orderJson, "orderJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m49428G(orderJson, new Function2() { // from class: com.kubi.payment.rn.i
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return KCRNBridgePaymentCallImpl.m49460m0(callback, (Boolean) obj2, (String) obj3);
            }
        });
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: s */
    public void mo49492s(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, boolean z11, @NotNull String fileUrl, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97265i("KCRNBridgePaymentCallIMpl paymentViewPdf invoked isRemoteUrl:" + z11 + ", fileUrl:" + fileUrl);
        m49434r(z11, fileUrl, new Function1() { // from class: com.kubi.payment.rn.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCRNBridgePaymentCallImpl.m49464r0(callback, (Boolean) obj2);
            }
        });
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: t */
    public void mo49493t(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strC = ForterUtils.a.c(BaseApplication.INSTANCE.get());
        C44128b.m97265i("KCRNBridgePaymentCallIMpl getForterMobileUid source:" + source);
        callback.invoke(strC, null);
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: u */
    public void mo49494u(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String bizType, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        ValidationBizEnum validationBizEnum;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
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
            InterfaceC37759k.a.m85171e(C37304a.f82764a, validationBizEnum.name(), null, null, null, new InterfaceC36555b() { // from class: com.kubi.payment.rn.l
                @Override // cy.InterfaceC36555b
                /* JADX INFO: renamed from: a */
                public final void mo4404a(int i12, Intent intent) {
                    KCRNBridgePaymentCallImpl.m49458k0(callback, i12, intent);
                }
            }, 14, null);
        }
    }

    @Override // d00.InterfaceC36581p
    /* JADX INFO: renamed from: y */
    public void mo49495y(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m49432e();
        callback.invoke(Boolean.TRUE, null);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m49459l0(Function2 function2, String str, String str2, String str3, boolean z11, String str4, String str5) {
        Activity activityM6125h = C5258a.m6125h();
        if (!(activityM6125h instanceof FragmentActivity)) {
            function2.invoke(Boolean.FALSE, new ProtocolException("Top activity is not FragmentActivity", null, null, false, 14, null));
            return;
        }
        ChatClient.Companion companion = ChatClient.INSTANCE;
        companion.init(new ChatConfig(str));
        ChatClient chatClient = companion.get();
        if (chatClient != null) {
            chatClient.m20390e(str2);
        }
        ChatClient chatClient2 = companion.get();
        if (chatClient2 != null) {
            chatClient2.m20395j(C27041f.m66668h(str3), new C21351a());
        }
        BaseActivity.Companion companion2 = BaseActivity.INSTANCE;
        Bundle bundle = new Bundle();
        bundle.putString("oId", str3);
        bundle.putBoolean("isForbid", !z11);
        bundle.putParcelable("info", new ChatInfo(str, str4, str2, str5));
        Unit unit = Unit.INSTANCE;
        companion2.launch(activityM6125h, ChatFragment.class, bundle);
        function2.invoke(Boolean.TRUE, null);
    }

    /* JADX INFO: renamed from: com.kubi.payment.rn.KCRNBridgePaymentCallImpl$b */
    /* JADX INFO: compiled from: KCRNBridgePaymentCallImpl.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/payment/rn/KCRNBridgePaymentCallImpl$uiProgress$2$1", "Lio/github/lizhangqu/coreprogress/ProgressUIListener;", "onUIProgressStart", "", "totalBytes", "", "onUIProgressChanged", "numBytes", "percent", "", "speed", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21352b extends AbstractC0306f {
        @Override // af0.AbstractC0306f
        /* JADX INFO: renamed from: h */
        public void mo1057h(long j11) {
        }

        @Override // af0.AbstractC0306f
        /* JADX INFO: renamed from: f */
        public void mo1055f(long j11, long j12, float f11, float f12) {
        }
    }
}
