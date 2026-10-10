package com.kubi.sdk.protocol.jsapi;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.reflect.TypeToken;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiCommonAppCpsInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiCommonAppInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiCommonOpenScanResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiFileFileActionResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiFilePickFileResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiHomeFeedFeedTabItem;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiKrnSocketConfig;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiMarketVisitorFavoriteEntity;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentBlackGroupResponse;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentFastTradeGooglePayPayload;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentFastTradeGooglePayRequest;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentNativeFilePickerResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentProtocolUrls;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentRecurringFrequencyInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiQrScanScanQrCodeResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSafeValidationSafeValidationMap;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiShareGalleryDataEntity;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSiteSupportSiteItem;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsHybridSocketHttpTaskParams;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsPlainSocketTaskParams;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsPollingSocketTaskParams;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinFuturesCoinInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinFuturesDisplayInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinFuturesSymbolInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinSpotCoinInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinSpotSymbolInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeAlphaCurrencyInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeIsolatedMarginConfig;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginConfig;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginCurrency;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeSymbolOfflineInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiUserCenterUserInfo;
import com.kubi.utils.C27099x;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import d00.InterfaceC36560a;
import d00.InterfaceC36561a0;
import d00.InterfaceC36562b;
import d00.InterfaceC36563b0;
import d00.InterfaceC36564c;
import d00.InterfaceC36565c0;
import d00.InterfaceC36566d;
import d00.InterfaceC36567d0;
import d00.InterfaceC36568e;
import d00.InterfaceC36569e0;
import d00.InterfaceC36570f;
import d00.InterfaceC36571f0;
import d00.InterfaceC36572g;
import d00.InterfaceC36573h;
import d00.InterfaceC36574i;
import d00.InterfaceC36575j;
import d00.InterfaceC36576k;
import d00.InterfaceC36577l;
import d00.InterfaceC36578m;
import d00.InterfaceC36579n;
import d00.InterfaceC36580o;
import d00.InterfaceC36581p;
import d00.InterfaceC36582q;
import d00.InterfaceC36583r;
import d00.InterfaceC36584s;
import d00.InterfaceC36585t;
import d00.InterfaceC36586u;
import d00.InterfaceC36587v;
import d00.InterfaceC36588w;
import d00.InterfaceC36589x;
import d00.InterfaceC36590y;
import d00.InterfaceC36591z;
import h00.C38070a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCJSApiProtocolManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J_\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011Je\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013Jo\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "", "source", "module", FirebaseAnalytics.Param.METHOD, "", "param", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "c", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;)V", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/Object;", "obj", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJSApiProtocolManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSApiProtocolManager.kt\ncom/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,5421:1\n1549#2:5422\n1620#2,3:5423\n*S KotlinDebug\n*F\n+ 1 KCJSApiProtocolManager.kt\ncom/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager\n*L\n3156#1:5422\n3156#1:5423,3\n*E\n"})
public final class KCJSApiProtocolManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KCJSApiProtocolManager f47500a = new KCJSApiProtocolManager();

    /* JADX WARN: Code duplicated, block: B:1082:0x24f0  */
    /* JADX WARN: Code duplicated, block: B:1084:0x251b  */
    /* JADX WARN: Code duplicated, block: B:1662:0x3798  */
    /* JADX WARN: Code duplicated, block: B:1664:0x37c2  */
    /* JADX WARN: Code duplicated, block: B:2732:0x5b88  */
    /* JADX WARN: Code duplicated, block: B:2734:0x5bb4  */
    /* JADX WARN: Code duplicated, block: B:2748:0x5c27  */
    /* JADX WARN: Code duplicated, block: B:2750:0x5c53  */
    /* JADX WARN: Code duplicated, block: B:2764:0x5cc5  */
    /* JADX WARN: Code duplicated, block: B:2766:0x5cf1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Instruction removed from duplicated block: B:1082:0x24f0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:1662:0x3798, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:2732:0x5b88, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:2748:0x5c27, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:2764:0x5cc5, please report this as an issue */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m57893a(@NotNull Context context, @Nullable Object obj, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, ? extends Object> map, @NotNull Function2<Object, ? super ProtocolException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        KCJSApiProtocolManager$_exec$2 kCJSApiProtocolManager$_exec$2;
        InterfaceC36562b interfaceC36562b;
        String str4;
        InterfaceC36562b interfaceC36562b2;
        String str5;
        InterfaceC36564c interfaceC36564c;
        Map<String, ? extends Object> mapM57899d;
        InterfaceC36566d interfaceC36566d;
        String str6;
        InterfaceC36566d interfaceC36566d2;
        String str7;
        InterfaceC36566d interfaceC36566d3;
        String str8;
        InterfaceC36566d interfaceC36566d4;
        String str9;
        InterfaceC36566d interfaceC36566d5;
        String str10;
        InterfaceC36566d interfaceC36566d6;
        String str11;
        Object obj2;
        InterfaceC36573h interfaceC36573h;
        Map<String, ? extends Object> mapM57899d2;
        Context context2;
        InterfaceC36575j interfaceC36575j;
        String str12;
        InterfaceC36575j interfaceC36575j2;
        String str13;
        InterfaceC36576k interfaceC36576k;
        String str14;
        InterfaceC36578m interfaceC36578m;
        String str15;
        InterfaceC36578m interfaceC36578m2;
        String str16;
        InterfaceC36578m interfaceC36578m3;
        String str17;
        InterfaceC36579n interfaceC36579n;
        String str18;
        InterfaceC36579n interfaceC36579n2;
        String str19;
        InterfaceC36579n interfaceC36579n3;
        Map<String, ? extends Object> mapM57899d3;
        Map<String, ? extends Object> map2;
        Map<String, ? extends Object> mapM57899d4;
        InterfaceC36579n interfaceC36579n4;
        Map<String, ? extends Object> mapM57899d5;
        InterfaceC36581p interfaceC36581p;
        Object obj3;
        Context context3;
        String str20;
        InterfaceC36581p interfaceC36581p2;
        String str21;
        ArrayList arrayList;
        InterfaceC36587v interfaceC36587v;
        String str22;
        InterfaceC36589x interfaceC36589x;
        Map<String, ? extends Object> mapM57899d6;
        InterfaceC36590y interfaceC36590y;
        String str23;
        String str24;
        Boolean bool;
        Boolean bool2;
        String str25;
        Context context4;
        String str26;
        String str27;
        String str28;
        Object obj4;
        String str29;
        String str30;
        String str31;
        Map<String, ? extends Object> map3;
        InterfaceC36561a0 interfaceC36561a0;
        Context context5;
        Object obj5;
        String str32;
        InterfaceC36561a0 interfaceC36561a1;
        Context context6;
        Object obj6;
        String str33;
        InterfaceC36561a0 interfaceC36561a2;
        Context context7;
        Object obj7;
        String str34;
        InterfaceC36569e0 interfaceC36569e0;
        String str35;
        InterfaceC36569e0 interfaceC36569e1;
        String str36;
        InterfaceC36569e0 interfaceC36569e2;
        String str37;
        KCJSApiKrnSocketConfig kCJSApiKrnSocketConfig;
        KCJSApiPaymentFastTradeGooglePayRequest kCJSApiPaymentFastTradeGooglePayRequest;
        KCJSApiShareGalleryDataEntity kCJSApiShareGalleryDataEntity;
        KCJSApiSocketJsPlainSocketTaskParams kCJSApiSocketJsPlainSocketTaskParams;
        KCJSApiSocketJsPollingSocketTaskParams kCJSApiSocketJsPollingSocketTaskParams;
        KCJSApiSocketJsHybridSocketHttpTaskParams kCJSApiSocketJsHybridSocketHttpTaskParams;
        String str38 = str3;
        final Function2<Object, ? super ProtocolException, Unit> function3 = function2;
        if (continuation instanceof KCJSApiProtocolManager$_exec$2) {
            kCJSApiProtocolManager$_exec$2 = (KCJSApiProtocolManager$_exec$2) continuation;
            int i11 = kCJSApiProtocolManager$_exec$2.label;
            if ((Integer.MIN_VALUE & i11) != 0) {
                kCJSApiProtocolManager$_exec$2.label = i11 - Integer.MIN_VALUE;
            } else {
                kCJSApiProtocolManager$_exec$2 = new KCJSApiProtocolManager$_exec$2(this, continuation);
            }
        } else {
            kCJSApiProtocolManager$_exec$2 = new KCJSApiProtocolManager$_exec$2(this, continuation);
        }
        Object objM91049g = kCJSApiProtocolManager$_exec$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (kCJSApiProtocolManager$_exec$2.label) {
            case 0:
                ResultKt.throwOnFailure(objM91049g);
                if (TextUtils.isEmpty(str38)) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException("协议标准化: 顶层报文风格不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str38, "jumpMultiAddFundsDialog")) {
                    try {
                        InterfaceC36562b interfaceC36562b3 = (InterfaceC36562b) Router.f46192a.m56192n(InterfaceC36562b.class);
                        Object obj8 = map.get("sceneCode");
                        String str39 = obj8 instanceof String ? (String) obj8 : null;
                        if (str39 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": sceneCode参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj9 = map.get(FirebaseAnalytics.Param.CURRENCY);
                        String str40 = obj9 instanceof String ? (String) obj9 : null;
                        if (str40 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": currency参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj10 = map.get("fiatMoney");
                        String str41 = obj10 instanceof String ? (String) obj10 : null;
                        if (str41 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": fiatMoney参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj11 = map.get("defaultAccount");
                        String str42 = obj11 instanceof String ? (String) obj11 : null;
                        if (str42 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": defaultAccount参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj12 = map.get("defaultAccountAmount");
                        String str43 = obj12 instanceof String ? (String) obj12 : null;
                        if (str43 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": defaultAccountAmount参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj13 = map.get("toAccountTag");
                        String str44 = obj13 instanceof String ? (String) obj13 : null;
                        Object obj14 = map.get("toAccountTag");
                        if (str44 != null || obj14 == null || Intrinsics.areEqual(obj14, JSONObject.NULL)) {
                            interfaceC36562b3.mo4420h(context, obj, str, str39, str40, str41, str42, str43, str44, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$3
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool3, ProtocolException protocolException) {
                                    invoke2(bool3, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool3, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool3, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": toAccountTag参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e11) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e11), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "jumpMultiAccountUseDialog")) {
                    try {
                        InterfaceC36562b interfaceC36562b4 = (InterfaceC36562b) Router.f46192a.m56192n(InterfaceC36562b.class);
                        Object obj15 = map.get("sceneCode");
                        String str45 = obj15 instanceof String ? (String) obj15 : null;
                        if (str45 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": sceneCode参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj16 = map.get(FirebaseAnalytics.Param.CURRENCY);
                        String str46 = obj16 instanceof String ? (String) obj16 : null;
                        if (str46 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": currency参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj17 = map.get("fiatMoney");
                        String str47 = obj17 instanceof String ? (String) obj17 : null;
                        if (str47 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": fiatMoney参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj18 = map.get("defaultAccountAmount");
                        String str48 = obj18 instanceof String ? (String) obj18 : null;
                        if (str48 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": defaultAccountAmount参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj19 = map.get("toAccountTag");
                        String str49 = obj19 instanceof String ? (String) obj19 : null;
                        Object obj20 = map.get("toAccountTag");
                        if (str49 != null || obj20 == null || Intrinsics.areEqual(obj20, JSONObject.NULL)) {
                            interfaceC36562b4.mo4424l(context, obj, str, str45, str46, str47, str48, str49, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$4
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool3, ProtocolException protocolException) {
                                    invoke2(bool3, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool3, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool3, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": toAccountTag参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e12) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e12), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "jumpHoldEarnDialog")) {
                    try {
                        ((InterfaceC36562b) Router.f46192a.m56192n(InterfaceC36562b.class)).mo4413a(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$5
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool3, ProtocolException protocolException) {
                                invoke2(bool3, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool3, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool3, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e13) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e13), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "jumpMultiAccountSelectDialog")) {
                    try {
                        InterfaceC36562b interfaceC36562b5 = (InterfaceC36562b) Router.f46192a.m56192n(InterfaceC36562b.class);
                        Object obj21 = map.get("sceneCode");
                        String str50 = obj21 instanceof String ? (String) obj21 : null;
                        if (str50 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": sceneCode参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj22 = map.get(FirebaseAnalytics.Param.CURRENCY);
                        String str51 = obj22 instanceof String ? (String) obj22 : null;
                        if (str51 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": currency参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj23 = map.get("toAccountTag");
                        String str52 = obj23 instanceof String ? (String) obj23 : null;
                        Object obj24 = map.get("toAccountTag");
                        if (str52 != null || obj24 == null || Intrinsics.areEqual(obj24, JSONObject.NULL)) {
                            interfaceC36562b5.mo4418f(context, obj, str, str50, str51, str52, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$6
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool3, ProtocolException protocolException) {
                                    invoke2(bool3, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool3, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool3, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": toAccountTag参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e14) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e14), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getHideAssetsEyeStatus")) {
                    try {
                        ((InterfaceC36562b) Router.f46192a.m56192n(InterfaceC36562b.class)).mo4417e(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$7
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool3, ProtocolException protocolException) {
                                invoke2(bool3, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool3, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool3, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e15) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e15), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "setHideAssetsEyeStatus")) {
                    try {
                        InterfaceC36562b interfaceC36562b6 = (InterfaceC36562b) Router.f46192a.m56192n(InterfaceC36562b.class);
                        Object obj25 = map.get("isHide");
                        Boolean bool3 = obj25 instanceof Boolean ? (Boolean) obj25 : null;
                        if (bool3 != null) {
                            interfaceC36562b6.mo4421i(context, obj, str, bool3.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$8
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool4, ProtocolException protocolException) {
                                    invoke2(bool4, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool4, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool4, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": isHide参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e16) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e16), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getPnlCalcMethod")) {
                    try {
                        ((InterfaceC36562b) Router.f46192a.m56192n(InterfaceC36562b.class)).mo4422j(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$9
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool4, ProtocolException protocolException) {
                                invoke2(bool4, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool4, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool4, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e17) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e17), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "setPnlCalcMethod")) {
                    try {
                        InterfaceC36562b interfaceC36562b7 = (InterfaceC36562b) Router.f46192a.m56192n(InterfaceC36562b.class);
                        Object obj26 = map.get("methodName");
                        if (obj26 instanceof String) {
                            str4 = (String) obj26;
                            interfaceC36562b = interfaceC36562b7;
                        } else {
                            interfaceC36562b = interfaceC36562b7;
                            str4 = null;
                        }
                        if (str4 != null) {
                            interfaceC36562b.mo4416d(context, obj, str, str4, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$10
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool4, ProtocolException protocolException) {
                                    invoke2(bool4, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool4, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool4, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": methodName参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e18) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e18), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getPnlDaysRange")) {
                    try {
                        ((InterfaceC36562b) Router.f46192a.m56192n(InterfaceC36562b.class)).mo4415c(context, obj, str, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$11
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(String str53, ProtocolException protocolException) {
                                invoke2(str53, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable String str53, @Nullable ProtocolException protocolException) {
                                function3.invoke(str53, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e19) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e19), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "setPnlDaysRange")) {
                    try {
                        InterfaceC36562b interfaceC36562b8 = (InterfaceC36562b) Router.f46192a.m56192n(InterfaceC36562b.class);
                        Object obj27 = map.get("daysRange");
                        if (obj27 instanceof String) {
                            str5 = (String) obj27;
                            interfaceC36562b2 = interfaceC36562b8;
                        } else {
                            interfaceC36562b2 = interfaceC36562b8;
                            str5 = null;
                        }
                        if (str5 != null) {
                            interfaceC36562b2.mo4419g(context, obj, str, str5, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$12
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool4, ProtocolException protocolException) {
                                    invoke2(bool4, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool4, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool4, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": daysRange参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e21) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e21), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "setPricingCurrency")) {
                    try {
                        InterfaceC36562b interfaceC36562b9 = (InterfaceC36562b) Router.f46192a.m56192n(InterfaceC36562b.class);
                        Object obj28 = map.get("pricingCrypto");
                        String str53 = obj28 instanceof String ? (String) obj28 : null;
                        Object obj29 = map.get("pricingCrypto");
                        if (str53 == null && obj29 != null && !Intrinsics.areEqual(obj29, JSONObject.NULL)) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": pricingCrypto参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj30 = map.get("pricingFiat");
                        String str54 = obj30 instanceof String ? (String) obj30 : null;
                        Object obj31 = map.get("pricingFiat");
                        if (str54 != null || obj31 == null || Intrinsics.areEqual(obj31, JSONObject.NULL)) {
                            interfaceC36562b9.mo4423k(context, obj, str, str53, str54, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$13
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool4, ProtocolException protocolException) {
                                    invoke2(bool4, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool4, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool4, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": pricingFiat参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e22) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e22), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "openPnlDietalDialog")) {
                    try {
                        ((InterfaceC36562b) Router.f46192a.m56192n(InterfaceC36562b.class)).mo4414b(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$14
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool4, ProtocolException protocolException) {
                                invoke2(bool4, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool4, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool4, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e23) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e23), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getPermission")) {
                    try {
                        ((InterfaceC36564c) Router.f46192a.m56192n(InterfaceC36564c.class)).mo31537a(context, obj, str, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$15
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(String str55, ProtocolException protocolException) {
                                invoke2(str55, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable String str55, @Nullable ProtocolException protocolException) {
                                function3.invoke(str55, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e24) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e24), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "requestPermission")) {
                    try {
                        ((InterfaceC36564c) Router.f46192a.m56192n(InterfaceC36564c.class)).mo31541e(context, obj, str, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$16
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(String str55, ProtocolException protocolException) {
                                invoke2(str55, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable String str55, @Nullable ProtocolException protocolException) {
                                function3.invoke(str55, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e25) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e25), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "queryCalendar")) {
                    try {
                        InterfaceC36564c interfaceC36564c2 = (InterfaceC36564c) Router.f46192a.m56192n(InterfaceC36564c.class);
                        Object obj32 = map.get("data");
                        Map map4 = obj32 instanceof Map ? (Map) obj32 : null;
                        if (map4 != null) {
                            mapM57899d = C24053a.m57899d(map4);
                            interfaceC36564c = interfaceC36564c2;
                        } else {
                            interfaceC36564c = interfaceC36564c2;
                            mapM57899d = null;
                        }
                        if (mapM57899d != null) {
                            interfaceC36564c.mo31538b(context, obj, str, mapM57899d, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$17
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map5, ProtocolException protocolException) {
                                    invoke2(map5, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Map<String, ? extends Object> map5, @Nullable ProtocolException protocolException) {
                                    function3.invoke(map5, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": data参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e26) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e26), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "updateCalendarItem")) {
                    try {
                        InterfaceC36564c interfaceC36564c3 = (InterfaceC36564c) Router.f46192a.m56192n(InterfaceC36564c.class);
                        Object obj33 = map.get("eventType");
                        String str55 = obj33 instanceof String ? (String) obj33 : null;
                        if (str55 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": eventType参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj34 = map.get("data");
                        Map map5 = obj34 instanceof Map ? (Map) obj34 : null;
                        Map<String, ? extends Object> mapM57899d7 = map5 != null ? C24053a.m57899d(map5) : null;
                        if (mapM57899d7 != null) {
                            interfaceC36564c3.mo31540d(context, obj, str, str55, mapM57899d7, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$18
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map6, ProtocolException protocolException) {
                                    invoke2(map6, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Map<String, ? extends Object> map6, @Nullable ProtocolException protocolException) {
                                    function3.invoke(map6, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": data参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e27) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e27), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "deleteCalendarItem")) {
                    try {
                        InterfaceC36564c interfaceC36564c4 = (InterfaceC36564c) Router.f46192a.m56192n(InterfaceC36564c.class);
                        Object obj35 = map.get("data");
                        Map map6 = obj35 instanceof Map ? (Map) obj35 : null;
                        Map<String, ? extends Object> mapM57899d8 = map6 != null ? C24053a.m57899d(map6) : null;
                        if (mapM57899d8 != null) {
                            interfaceC36564c4.mo31539c(context, obj, str, mapM57899d8, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$19
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map7, ProtocolException protocolException) {
                                    invoke2(map7, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Map<String, ? extends Object> map7, @Nullable ProtocolException protocolException) {
                                    function3.invoke(map7, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": data参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e28) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e28), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getAppInfo")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31669b(context, obj, str, new Function2<KCJSApiCommonAppInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$20

                            /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$20$a */
                            /* JADX INFO: compiled from: GsonUtils.kt */
                            @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$20$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                            @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                            public static final class C24029a extends TypeToken<Map<String, ? extends Object>> {
                            }

                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(KCJSApiCommonAppInfo kCJSApiCommonAppInfo, ProtocolException protocolException) {
                                invoke2(kCJSApiCommonAppInfo, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable KCJSApiCommonAppInfo kCJSApiCommonAppInfo, @Nullable ProtocolException protocolException) {
                                if (protocolException != null || kCJSApiCommonAppInfo == null) {
                                    function3.invoke(null, protocolException);
                                    return;
                                }
                                String strM66919i = C27099x.m66919i(kCJSApiCommonAppInfo, false, 2, null);
                                if (strM66919i == null) {
                                    strM66919i = "";
                                }
                                function3.invoke((Map) C27099x.m66914d(strM66919i, new C24029a().getType()), null);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e29) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e29), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "refreshAppSession")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31682o(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$21
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool4, ProtocolException protocolException) {
                                invoke2(bool4, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool4, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool4, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e31) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e31), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getAppVersion")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31678k(context, obj, str, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$22
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(String str56, ProtocolException protocolException) {
                                invoke2(str56, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable String str56, @Nullable ProtocolException protocolException) {
                                function3.invoke(str56, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e32) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e32), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "showToast")) {
                    try {
                        InterfaceC36566d interfaceC36566d7 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj36 = map.get("content");
                        if (obj36 instanceof String) {
                            str6 = (String) obj36;
                            interfaceC36566d = interfaceC36566d7;
                        } else {
                            interfaceC36566d = interfaceC36566d7;
                            str6 = null;
                        }
                        if (str6 != null) {
                            interfaceC36566d.mo31688u(context, obj, str, str6, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$23
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool4, ProtocolException protocolException) {
                                    invoke2(bool4, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool4, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool4, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": content参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e33) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e33), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "close")) {
                    try {
                        InterfaceC36566d interfaceC36566d8 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj37 = map.get("animated");
                        Boolean bool4 = obj37 instanceof Boolean ? (Boolean) obj37 : null;
                        if (bool4 != null) {
                            interfaceC36566d8.mo31663B(context, obj, str, bool4.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$24
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                    invoke2(bool5, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool5, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": animated参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e34) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e34), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "canIUse")) {
                    try {
                        InterfaceC36566d interfaceC36566d9 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj38 = map.get("apiName");
                        String str56 = obj38 instanceof String ? (String) obj38 : null;
                        if (str56 != null) {
                            interfaceC36566d9.mo31664C(context, obj, str, str56, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$25
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                    invoke2(bool5, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool5, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": apiName参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e35) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e35), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "openFlutterDialog")) {
                    try {
                        InterfaceC36566d interfaceC36566d10 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj39 = map.get("route");
                        String str57 = obj39 instanceof String ? (String) obj39 : null;
                        if (str57 != null) {
                            interfaceC36566d10.mo31679l(context, obj, str, str57, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$26
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map7, ProtocolException protocolException) {
                                    invoke2(map7, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Map<String, ? extends Object> map7, @Nullable ProtocolException protocolException) {
                                    function3.invoke(map7, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": route参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e36) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e36), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getAppNotificationPermissionEnabled")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31672e(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$27
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                invoke2(bool5, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e37) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e37), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "openAppNotificationSettings")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31686s(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$28
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                invoke2(bool5, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e38) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e38), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "showAppUpgradeAlert")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31684q(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$29
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                invoke2(bool5, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e39) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e39), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "openSupportTicketPage")) {
                    try {
                        InterfaceC36566d interfaceC36566d11 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj40 = map.get("formId");
                        String str58 = obj40 instanceof String ? (String) obj40 : null;
                        Object obj41 = map.get("formId");
                        if (str58 != null || obj41 == null || Intrinsics.areEqual(obj41, JSONObject.NULL)) {
                            interfaceC36566d11.mo31692y(context, obj, str, str58, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$30
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                    invoke2(bool5, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool5, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": formId参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e41) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e41), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "refreshAppUserInfo")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31666E(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$31
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                invoke2(bool5, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e42) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e42), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "reload")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31680m(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$32
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                invoke2(bool5, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e43) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e43), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "sharePageView")) {
                    try {
                        InterfaceC36566d interfaceC36566d12 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj42 = map.get("qrCodeUrl");
                        String str59 = obj42 instanceof String ? (String) obj42 : null;
                        Object obj43 = map.get("qrCodeUrl");
                        if (str59 != null || obj43 == null || Intrinsics.areEqual(obj43, JSONObject.NULL)) {
                            interfaceC36566d12.mo31674g(context, obj, str, str59, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$33
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                    invoke2(bool5, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool5, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": qrCodeUrl参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e44) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e44), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "vibrate")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31665D(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$34
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                invoke2(bool5, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e45) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e45), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "showAddHomePageDialog")) {
                    try {
                        InterfaceC36566d interfaceC36566d13 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj44 = map.get("shortcutId");
                        String str60 = obj44 instanceof String ? (String) obj44 : null;
                        Object obj45 = map.get("shortcutId");
                        if (str60 != null || obj45 == null || Intrinsics.areEqual(obj45, JSONObject.NULL)) {
                            interfaceC36566d13.mo31676i(context, obj, str, str60, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$35
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                    invoke2(bool5, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool5, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": shortcutId参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e46) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e46), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getPasteBoardContent")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31673f(context, obj, str, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$36
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(String str61, ProtocolException protocolException) {
                                invoke2(str61, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable String str61, @Nullable ProtocolException protocolException) {
                                function3.invoke(str61, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e47) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e47), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "copyToClipboard")) {
                    try {
                        InterfaceC36566d interfaceC36566d14 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj46 = map.get("content");
                        if (obj46 instanceof String) {
                            str7 = (String) obj46;
                            interfaceC36566d2 = interfaceC36566d14;
                        } else {
                            interfaceC36566d2 = interfaceC36566d14;
                            str7 = null;
                        }
                        if (str7 != null) {
                            interfaceC36566d2.mo31683p(context, obj, str, str7, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$37
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                    invoke2(bool5, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool5, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": content参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e48) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e48), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getAllBizControlConfig")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31690w(context, obj, str, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$38
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map7, ProtocolException protocolException) {
                                invoke2(map7, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Map<String, ? extends Object> map7, @Nullable ProtocolException protocolException) {
                                function3.invoke(map7, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e49) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e49), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "queryBizControlConfig")) {
                    try {
                        InterfaceC36566d interfaceC36566d15 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj47 = map.get("uiSpmId");
                        if (obj47 instanceof String) {
                            str8 = (String) obj47;
                            interfaceC36566d3 = interfaceC36566d15;
                        } else {
                            interfaceC36566d3 = interfaceC36566d15;
                            str8 = null;
                        }
                        if (str8 != null) {
                            interfaceC36566d3.mo31681n(context, obj, str, str8, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$39
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                    invoke2(bool5, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool5, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": uiSpmId参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e51) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e51), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "forwardUrl")) {
                    try {
                        InterfaceC36566d interfaceC36566d16 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj48 = map.get("sourceUrl");
                        String str61 = obj48 instanceof String ? (String) obj48 : null;
                        if (str61 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": sourceUrl参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj49 = map.get("destinationUrl");
                        String str62 = obj49 instanceof String ? (String) obj49 : null;
                        if (str62 != null) {
                            interfaceC36566d16.mo31675h(context, obj, str, str61, str62, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$40
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                    invoke2(bool5, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool5, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": destinationUrl参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e52) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e52), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "syncCpsFromApp")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31668a(context, obj, str, new Function2<KCJSApiCommonAppCpsInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$41

                            /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$41$a */
                            /* JADX INFO: compiled from: GsonUtils.kt */
                            @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$41$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                            @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                            public static final class C24030a extends TypeToken<Map<String, ? extends Object>> {
                            }

                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(KCJSApiCommonAppCpsInfo kCJSApiCommonAppCpsInfo, ProtocolException protocolException) {
                                invoke2(kCJSApiCommonAppCpsInfo, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable KCJSApiCommonAppCpsInfo kCJSApiCommonAppCpsInfo, @Nullable ProtocolException protocolException) {
                                if (protocolException != null || kCJSApiCommonAppCpsInfo == null) {
                                    function3.invoke(null, protocolException);
                                    return;
                                }
                                String strM66919i = C27099x.m66919i(kCJSApiCommonAppCpsInfo, false, 2, null);
                                if (strM66919i == null) {
                                    strM66919i = "";
                                }
                                function3.invoke((Map) C27099x.m66914d(strM66919i, new C24030a().getType()), null);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e53) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e53), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "isClipboardReadAccessOpen")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31667F(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$42
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                invoke2(bool5, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e54) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e54), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "clearClipboardContent")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31677j(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$43
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                invoke2(bool5, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e55) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e55), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "playVideo")) {
                    try {
                        InterfaceC36566d interfaceC36566d17 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj50 = map.get("url");
                        if (obj50 instanceof String) {
                            str9 = (String) obj50;
                            interfaceC36566d4 = interfaceC36566d17;
                        } else {
                            interfaceC36566d4 = interfaceC36566d17;
                            str9 = null;
                        }
                        if (str9 != null) {
                            interfaceC36566d4.mo31685r(context, obj, str, str9, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$44
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                    invoke2(bool5, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool5, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": url参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e56) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e56), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getLegalPriceRate")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31670c(context, obj, str, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$45
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map7, ProtocolException protocolException) {
                                invoke2(map7, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Map<String, ? extends Object> map7, @Nullable ProtocolException protocolException) {
                                function3.invoke(map7, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e57) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e57), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "showBottomSheetDialog")) {
                    try {
                        InterfaceC36566d interfaceC36566d18 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj51 = map.get("datas");
                        List<String> list = obj51 instanceof List ? (List) obj51 : null;
                        if (list == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": datas参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj52 = map.get("selectedIndex");
                        Number number = obj52 instanceof Number ? (Number) obj52 : null;
                        Long lBoxLong = number != null ? Boxing.boxLong(number.longValue()) : null;
                        if (lBoxLong != null) {
                            interfaceC36566d18.mo31687t(context, obj, str, list, lBoxLong.longValue(), new Function2<Long, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$46
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Long l11, ProtocolException protocolException) {
                                    invoke2(l11, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Long l11, @Nullable ProtocolException protocolException) {
                                    function3.invoke(l11, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": selectedIndex参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e58) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e58), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getFingerToken")) {
                    try {
                        InterfaceC36566d interfaceC36566d19 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj53 = map.get("event");
                        String str63 = obj53 instanceof String ? (String) obj53 : null;
                        Object obj54 = map.get("event");
                        if (str63 != null || obj54 == null || Intrinsics.areEqual(obj54, JSONObject.NULL)) {
                            interfaceC36566d19.mo31689v(context, obj, str, str63, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$47
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(String str64, ProtocolException protocolException) {
                                    invoke2(str64, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable String str64, @Nullable ProtocolException protocolException) {
                                    function3.invoke(str64, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": event参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e59) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e59), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "openScan")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31691x(context, obj, str, new Function2<KCJSApiCommonOpenScanResult, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$48

                            /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$48$a */
                            /* JADX INFO: compiled from: GsonUtils.kt */
                            @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$48$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                            @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                            public static final class C24031a extends TypeToken<Map<String, ? extends Object>> {
                            }

                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(KCJSApiCommonOpenScanResult kCJSApiCommonOpenScanResult, ProtocolException protocolException) {
                                invoke2(kCJSApiCommonOpenScanResult, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable KCJSApiCommonOpenScanResult kCJSApiCommonOpenScanResult, @Nullable ProtocolException protocolException) {
                                if (protocolException != null || kCJSApiCommonOpenScanResult == null) {
                                    function3.invoke(null, protocolException);
                                    return;
                                }
                                String strM66919i = C27099x.m66919i(kCJSApiCommonOpenScanResult, false, 2, null);
                                if (strM66919i == null) {
                                    strM66919i = "";
                                }
                                function3.invoke((Map) C27099x.m66914d(strM66919i, new C24031a().getType()), null);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e61) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e61), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "isUtaTrading")) {
                    try {
                        ((InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class)).mo31662A(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$49
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                invoke2(bool5, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e62) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e62), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getFormatSymbol")) {
                    try {
                        InterfaceC36566d interfaceC36566d20 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj55 = map.get("symbol");
                        if (obj55 instanceof String) {
                            str10 = (String) obj55;
                            interfaceC36566d5 = interfaceC36566d20;
                        } else {
                            interfaceC36566d5 = interfaceC36566d20;
                            str10 = null;
                        }
                        if (str10 != null) {
                            interfaceC36566d5.mo31693z(context, obj, str, str10, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$50
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(String str64, ProtocolException protocolException) {
                                    invoke2(str64, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable String str64, @Nullable ProtocolException protocolException) {
                                    function3.invoke(str64, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e63) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e63), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getContract")) {
                    try {
                        InterfaceC36566d interfaceC36566d21 = (InterfaceC36566d) Router.f46192a.m56192n(InterfaceC36566d.class);
                        Object obj56 = map.get("symbol");
                        if (obj56 instanceof String) {
                            str11 = (String) obj56;
                            interfaceC36566d6 = interfaceC36566d21;
                        } else {
                            interfaceC36566d6 = interfaceC36566d21;
                            str11 = null;
                        }
                        if (str11 != null) {
                            interfaceC36566d6.mo31671d(context, obj, str, str11, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$51
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(String str64, ProtocolException protocolException) {
                                    invoke2(str64, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable String str64, @Nullable ProtocolException protocolException) {
                                    function3.invoke(str64, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e64) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e64), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getExperimentResult")) {
                    try {
                        InterfaceC36568e interfaceC36568e = (InterfaceC36568e) Router.f46192a.m56192n(InterfaceC36568e.class);
                        Object obj57 = map.get("code");
                        String str64 = obj57 instanceof String ? (String) obj57 : null;
                        if (str64 != null) {
                            interfaceC36568e.mo81858a(context, obj, str, str64, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$52
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool5, ProtocolException protocolException) {
                                    invoke2(bool5, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool5, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool5, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": code参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e65) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e65), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "pickFile")) {
                    try {
                        InterfaceC36570f interfaceC36570f = (InterfaceC36570f) Router.f46192a.m56192n(InterfaceC36570f.class);
                        Object obj58 = map.get("fileTypes");
                        String str65 = obj58 instanceof String ? (String) obj58 : null;
                        Object obj59 = map.get("fileTypes");
                        if (str65 == null && obj59 != null && !Intrinsics.areEqual(obj59, JSONObject.NULL)) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": fileTypes参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj60 = map.get(BridgeParamKeyKt.MAX_COUNT);
                        Number number2 = obj60 instanceof Number ? (Number) obj60 : null;
                        Long lBoxLong2 = number2 != null ? Boxing.boxLong(number2.longValue()) : null;
                        Object obj61 = map.get(BridgeParamKeyKt.MAX_COUNT);
                        if (lBoxLong2 == null && obj61 != null && !Intrinsics.areEqual(obj61, JSONObject.NULL)) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": maxCount参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj62 = map.get("maxSize");
                        Number number3 = obj62 instanceof Number ? (Number) obj62 : null;
                        Long lBoxLong3 = number3 != null ? Boxing.boxLong(number3.longValue()) : null;
                        Object obj63 = map.get("maxSize");
                        if (lBoxLong3 != null || obj63 == null || Intrinsics.areEqual(obj63, JSONObject.NULL)) {
                            interfaceC36570f.mo31713a(context, obj, str, str65, lBoxLong2, lBoxLong3, new Function2<KCJSApiFilePickFileResult, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$53

                                /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$53$a */
                                /* JADX INFO: compiled from: GsonUtils.kt */
                                @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$53$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                public static final class C24032a extends TypeToken<Map<String, ? extends Object>> {
                                }

                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(KCJSApiFilePickFileResult kCJSApiFilePickFileResult, ProtocolException protocolException) {
                                    invoke2(kCJSApiFilePickFileResult, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable KCJSApiFilePickFileResult kCJSApiFilePickFileResult, @Nullable ProtocolException protocolException) {
                                    if (protocolException != null || kCJSApiFilePickFileResult == null) {
                                        function3.invoke(null, protocolException);
                                        return;
                                    }
                                    String strM66919i = C27099x.m66919i(kCJSApiFilePickFileResult, false, 2, null);
                                    if (strM66919i == null) {
                                        strM66919i = "";
                                    }
                                    function3.invoke((Map) C27099x.m66914d(strM66919i, new C24032a().getType()), null);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": maxSize参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e66) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e66), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "previewFile")) {
                    try {
                        InterfaceC36570f interfaceC36570f2 = (InterfaceC36570f) Router.f46192a.m56192n(InterfaceC36570f.class);
                        Object obj64 = map.get("isRemoteUrl");
                        Boolean bool5 = obj64 instanceof Boolean ? (Boolean) obj64 : null;
                        if (bool5 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": isRemoteUrl参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj65 = map.get("fileUrl");
                        String str66 = obj65 instanceof String ? (String) obj65 : null;
                        if (str66 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": fileUrl参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj66 = map.get("fileName");
                        String str67 = obj66 instanceof String ? (String) obj66 : null;
                        Object obj67 = map.get("fileName");
                        if (str67 == null && obj67 != null && !Intrinsics.areEqual(obj67, JSONObject.NULL)) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": fileName参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj68 = map.get("headers");
                        Map map7 = obj68 instanceof Map ? (Map) obj68 : null;
                        Map<String, ? extends Object> mapM57899d9 = map7 != null ? C24053a.m57899d(map7) : null;
                        Object obj69 = map.get("headers");
                        if (mapM57899d9 == null && obj69 != null && !Intrinsics.areEqual(obj69, JSONObject.NULL)) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": headers参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj70 = map.get("allowShare");
                        Boolean bool6 = obj70 instanceof Boolean ? (Boolean) obj70 : null;
                        Object obj71 = map.get("allowShare");
                        if (bool6 != null || obj71 == null || Intrinsics.areEqual(obj71, JSONObject.NULL)) {
                            interfaceC36570f2.mo31714b(context, obj, str, bool5.booleanValue(), str66, str67, mapM57899d9, bool6, new Function2<KCJSApiFileFileActionResult, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$54

                                /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$54$a */
                                /* JADX INFO: compiled from: GsonUtils.kt */
                                @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$54$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                public static final class C24033a extends TypeToken<Map<String, ? extends Object>> {
                                }

                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(KCJSApiFileFileActionResult kCJSApiFileFileActionResult, ProtocolException protocolException) {
                                    invoke2(kCJSApiFileFileActionResult, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable KCJSApiFileFileActionResult kCJSApiFileFileActionResult, @Nullable ProtocolException protocolException) {
                                    if (protocolException != null || kCJSApiFileFileActionResult == null) {
                                        function3.invoke(null, protocolException);
                                        return;
                                    }
                                    String strM66919i = C27099x.m66919i(kCJSApiFileFileActionResult, false, 2, null);
                                    if (strM66919i == null) {
                                        strM66919i = "";
                                    }
                                    function3.invoke((Map) C27099x.m66914d(strM66919i, new C24033a().getType()), null);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": allowShare参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e67) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e67), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "downloadFile")) {
                    try {
                        InterfaceC36570f interfaceC36570f3 = (InterfaceC36570f) Router.f46192a.m56192n(InterfaceC36570f.class);
                        Object obj72 = map.get("url");
                        String str68 = obj72 instanceof String ? (String) obj72 : null;
                        if (str68 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": url参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj73 = map.get("fileName");
                        String str69 = obj73 instanceof String ? (String) obj73 : null;
                        Object obj74 = map.get("fileName");
                        if (str69 == null && obj74 != null && !Intrinsics.areEqual(obj74, JSONObject.NULL)) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": fileName参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj75 = map.get("headers");
                        Map map8 = obj75 instanceof Map ? (Map) obj75 : null;
                        Map<String, ? extends Object> mapM57899d10 = map8 != null ? C24053a.m57899d(map8) : null;
                        Object obj76 = map.get("headers");
                        if (mapM57899d10 == null && obj76 != null && !Intrinsics.areEqual(obj76, JSONObject.NULL)) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": headers参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj77 = map.get("target");
                        String str70 = obj77 instanceof String ? (String) obj77 : null;
                        Object obj78 = map.get("target");
                        if (str70 != null || obj78 == null || Intrinsics.areEqual(obj78, JSONObject.NULL)) {
                            interfaceC36570f3.mo31715c(context, obj, str, str68, str69, mapM57899d10, str70, new Function2<KCJSApiFileFileActionResult, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$55

                                /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$55$a */
                                /* JADX INFO: compiled from: GsonUtils.kt */
                                @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$55$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                public static final class C24034a extends TypeToken<Map<String, ? extends Object>> {
                                }

                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(KCJSApiFileFileActionResult kCJSApiFileFileActionResult, ProtocolException protocolException) {
                                    invoke2(kCJSApiFileFileActionResult, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable KCJSApiFileFileActionResult kCJSApiFileFileActionResult, @Nullable ProtocolException protocolException) {
                                    if (protocolException != null || kCJSApiFileFileActionResult == null) {
                                        function3.invoke(null, protocolException);
                                        return;
                                    }
                                    String strM66919i = C27099x.m66919i(kCJSApiFileFileActionResult, false, 2, null);
                                    if (strM66919i == null) {
                                        strM66919i = "";
                                    }
                                    function3.invoke((Map) C27099x.m66914d(strM66919i, new C24034a().getType()), null);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": target参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e68) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e68), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getFeaturesConfig")) {
                    try {
                        InterfaceC36572g interfaceC36572g = (InterfaceC36572g) Router.f46192a.m56192n(InterfaceC36572g.class);
                        Object obj79 = map.get("tabType");
                        String str71 = obj79 instanceof String ? (String) obj79 : null;
                        if (str71 != null) {
                            interfaceC36572g.mo81863f(context, obj, str, str71, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$56
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map9, ProtocolException protocolException) {
                                    invoke2(map9, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Map<String, ? extends Object> map9, @Nullable ProtocolException protocolException) {
                                    function3.invoke(map9, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": tabType参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e69) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e69), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "handleMenuAction")) {
                    try {
                        InterfaceC36572g interfaceC36572g2 = (InterfaceC36572g) Router.f46192a.m56192n(InterfaceC36572g.class);
                        Object obj80 = map.get(TUIConstants.TUIChat.INPUT_MORE_ACTION_ID);
                        String str72 = obj80 instanceof String ? (String) obj80 : null;
                        if (str72 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": actionId参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj81 = map.get(ReportDataTable.COLUMN_PARAMS);
                        Map map9 = obj81 instanceof Map ? (Map) obj81 : null;
                        Map<String, ? extends Object> mapM57899d11 = map9 != null ? C24053a.m57899d(map9) : null;
                        if (mapM57899d11 != null) {
                            interfaceC36572g2.mo81862a(context, obj, str, str72, mapM57899d11, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$57
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                    invoke2(bool7, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool7, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": params参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e71) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e71), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "launchLiteMainActivity")) {
                    try {
                        ((InterfaceC36574i) Router.f46192a.m56192n(InterfaceC36574i.class)).mo31248a(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$58
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                invoke2(bool7, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool7, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e72) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e72), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getHomeFeedTabs")) {
                    try {
                        ((InterfaceC36573h) Router.f46192a.m56192n(InterfaceC36573h.class)).mo81864a(context, obj, str, new Function2<List<? extends KCJSApiHomeFeedFeedTabItem>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$59

                            /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$59$a */
                            /* JADX INFO: compiled from: GsonUtils.kt */
                            @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$59$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                            @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                            public static final class C24035a extends TypeToken<Map<String, ? extends Object>> {
                            }

                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCJSApiHomeFeedFeedTabItem> list2, ProtocolException protocolException) {
                                invoke2((List<KCJSApiHomeFeedFeedTabItem>) list2, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable List<KCJSApiHomeFeedFeedTabItem> list2, @Nullable ProtocolException protocolException) {
                                String strM66919i;
                                if (protocolException != null || list2 == null) {
                                    function3.invoke(null, protocolException);
                                    return;
                                }
                                Function2<Object, ProtocolException, Unit> function4 = function3;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                                for (KCJSApiHomeFeedFeedTabItem kCJSApiHomeFeedFeedTabItem : list2) {
                                    String str73 = "";
                                    if (kCJSApiHomeFeedFeedTabItem != null && (strM66919i = C27099x.m66919i(kCJSApiHomeFeedFeedTabItem, false, 2, null)) != null) {
                                        str73 = strM66919i;
                                    }
                                    C27099x c27099x = C27099x.f54458a;
                                    arrayList2.add((Map) C27099x.m66914d(str73, new C24035a().getType()));
                                }
                                function4.invoke(CollectionsKt.toList(arrayList2), null);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e73) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e73), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "updateHomeFeedTabs")) {
                    try {
                        InterfaceC36573h interfaceC36573h2 = (InterfaceC36573h) Router.f46192a.m56192n(InterfaceC36573h.class);
                        Object obj82 = map.get("updatedTabsJson");
                        String str73 = obj82 instanceof String ? (String) obj82 : null;
                        if (str73 == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": updatedTabsJson参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj83 = map.get("selectedIndex");
                        Number number4 = obj83 instanceof Number ? (Number) obj83 : null;
                        Long lBoxLong4 = number4 != null ? Boxing.boxLong(number4.longValue()) : null;
                        if (lBoxLong4 != null) {
                            interfaceC36573h2.mo81869f(context, obj, str, str73, lBoxLong4.longValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$60
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                    invoke2(bool7, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool7, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": selectedIndex参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e74) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e74), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "getNativeFeedVisibleHeight")) {
                    try {
                        ((InterfaceC36573h) Router.f46192a.m56192n(InterfaceC36573h.class)).mo81868e(context, obj, str, new Function2<Long, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$61
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Long l11, ProtocolException protocolException) {
                                invoke2(l11, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Long l11, @Nullable ProtocolException protocolException) {
                                function3.invoke(l11, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e75) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e75), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "onClickHomeFeedTab")) {
                    try {
                        InterfaceC36573h interfaceC36573h3 = (InterfaceC36573h) Router.f46192a.m56192n(InterfaceC36573h.class);
                        Object obj84 = map.get(ViewProps.POSITION);
                        Number number5 = obj84 instanceof Number ? (Number) obj84 : null;
                        Long lBoxLong5 = number5 != null ? Boxing.boxLong(number5.longValue()) : null;
                        if (lBoxLong5 != null) {
                            interfaceC36573h3.mo81870g(context, obj, str, lBoxLong5.longValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$62
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                    invoke2(bool7, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool7, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": position参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e76) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e76), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "scrollWithVelocity")) {
                    try {
                        InterfaceC36573h interfaceC36573h4 = (InterfaceC36573h) Router.f46192a.m56192n(InterfaceC36573h.class);
                        Object obj85 = map.get("velocity");
                        Number number6 = obj85 instanceof Number ? (Number) obj85 : null;
                        Double dBoxDouble = number6 != null ? Boxing.boxDouble(number6.doubleValue()) : null;
                        if (dBoxDouble != null) {
                            interfaceC36573h4.mo81866c(context, obj, str, dBoxDouble.doubleValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$63
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                    invoke2(bool7, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool7, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": velocity参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e77) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e77), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                obj2 = obj;
                if (Intrinsics.areEqual(str38, "getFeedTabPos")) {
                    try {
                        ((InterfaceC36573h) Router.f46192a.m56192n(InterfaceC36573h.class)).mo81865b(context, obj2, str, new Function2<Long, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$64
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Long l11, ProtocolException protocolException) {
                                invoke2(l11, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Long l11, @Nullable ProtocolException protocolException) {
                                function3.invoke(l11, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e78) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e78), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "isFeedLiveTabRemoteConfigOpen")) {
                    try {
                        ((InterfaceC36573h) Router.f46192a.m56192n(InterfaceC36573h.class)).mo81871h(context, obj2, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$65
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                invoke2(bool7, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                function3.invoke(bool7, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    } catch (Exception e79) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e79), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "sendFeedEvent")) {
                    try {
                        InterfaceC36573h interfaceC36573h5 = (InterfaceC36573h) Router.f46192a.m56192n(InterfaceC36573h.class);
                        Object obj86 = map.get(ReportDataTable.COLUMN_PARAMS);
                        Map map10 = obj86 instanceof Map ? (Map) obj86 : null;
                        if (map10 != null) {
                            mapM57899d2 = C24053a.m57899d(map10);
                            interfaceC36573h = interfaceC36573h5;
                        } else {
                            interfaceC36573h = interfaceC36573h5;
                            mapM57899d2 = null;
                        }
                        if (mapM57899d2 != null) {
                            interfaceC36573h.mo81867d(context, obj2, str, mapM57899d2, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$66
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                    invoke2(bool7, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool7, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": params参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    } catch (Exception e81) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e81), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                if (Intrinsics.areEqual(str38, "startSocketTask")) {
                    try {
                        InterfaceC36575j interfaceC36575j3 = (InterfaceC36575j) Router.f46192a.m56192n(InterfaceC36575j.class);
                        AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                        KCJSApiProtocolManager$_exec$config$1 kCJSApiProtocolManager$_exec$config$1 = new KCJSApiProtocolManager$_exec$config$1(map, null);
                        kCJSApiProtocolManager$_exec$2.L$0 = context;
                        kCJSApiProtocolManager$_exec$2.L$1 = obj2;
                        kCJSApiProtocolManager$_exec$2.L$2 = str;
                        kCJSApiProtocolManager$_exec$2.L$3 = str38;
                        kCJSApiProtocolManager$_exec$2.L$4 = function3;
                        kCJSApiProtocolManager$_exec$2.L$5 = interfaceC36575j3;
                        kCJSApiProtocolManager$_exec$2.label = 1;
                        Object objM91049g2 = C41686h.m91049g(abstractC41697j0M94120b, kCJSApiProtocolManager$_exec$config$1, kCJSApiProtocolManager$_exec$2);
                        if (objM91049g2 != coroutine_suspended) {
                            context2 = context;
                            interfaceC36575j = interfaceC36575j3;
                            str12 = str;
                            objM91049g = objM91049g2;
                            kCJSApiKrnSocketConfig = (KCJSApiKrnSocketConfig) objM91049g;
                            if (kCJSApiKrnSocketConfig == null) {
                                interfaceC36575j.mo31720b(context2, obj2, str12, kCJSApiKrnSocketConfig, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$67
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(String str74, ProtocolException protocolException) {
                                        invoke2(str74, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable String str74, @Nullable ProtocolException protocolException) {
                                        function3.invoke(str74, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": config参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    } catch (Exception e82) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e82), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (Intrinsics.areEqual(str38, "endSocketTask")) {
                        try {
                            InterfaceC36575j interfaceC36575j4 = (InterfaceC36575j) Router.f46192a.m56192n(InterfaceC36575j.class);
                            Object obj87 = map.get("taskId");
                            if (obj87 instanceof String) {
                                str13 = (String) obj87;
                                interfaceC36575j2 = interfaceC36575j4;
                            } else {
                                interfaceC36575j2 = interfaceC36575j4;
                                str13 = null;
                            }
                            if (str13 != null) {
                                interfaceC36575j2.mo31719a(context, obj2, str, str13, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$68
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                        invoke2(bool7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool7, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": taskId参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e83) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e83), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "gotoBindEmail")) {
                        try {
                            ((InterfaceC36576k) Router.f46192a.m56192n(InterfaceC36576k.class)).mo81874c(context, obj2, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$69
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                    invoke2(bool7, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool7, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        } catch (Exception e84) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e84), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "gotoBindPhone")) {
                        try {
                            ((InterfaceC36576k) Router.f46192a.m56192n(InterfaceC36576k.class)).mo81873b(context, obj2, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$70
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                    invoke2(bool7, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool7, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        } catch (Exception e85) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e85), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "openAdvancedCertification")) {
                        try {
                            InterfaceC36576k interfaceC36576k2 = (InterfaceC36576k) Router.f46192a.m56192n(InterfaceC36576k.class);
                            Object obj88 = map.get(AppsFlyerProperties.CHANNEL);
                            String str74 = obj88 instanceof String ? (String) obj88 : null;
                            if (str74 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": channel参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj89 = map.get("data");
                            if (obj89 instanceof String) {
                                str14 = (String) obj89;
                                interfaceC36576k = interfaceC36576k2;
                            } else {
                                interfaceC36576k = interfaceC36576k2;
                                str14 = null;
                            }
                            if (str14 != null) {
                                interfaceC36576k.mo81872a(context, obj2, str, str74, str14, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$71
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map11, ProtocolException protocolException) {
                                        invoke2(map11, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Map<String, ? extends Object> map11, @Nullable ProtocolException protocolException) {
                                        function3.invoke(map11, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": data参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e86) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e86), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "pageDidMount")) {
                        try {
                            InterfaceC36577l interfaceC36577l = (InterfaceC36577l) Router.f46192a.m56192n(InterfaceC36577l.class);
                            Object obj90 = map.get("pageType");
                            String str75 = obj90 instanceof String ? (String) obj90 : null;
                            Object obj91 = map.get("pageType");
                            if (str75 == null && obj91 != null && !Intrinsics.areEqual(obj91, JSONObject.NULL)) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": pageType参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj92 = map.get("dclTime");
                            Number number7 = obj92 instanceof Number ? (Number) obj92 : null;
                            Double dBoxDouble2 = number7 != null ? Boxing.boxDouble(number7.doubleValue()) : null;
                            Object obj93 = map.get("dclTime");
                            if (dBoxDouble2 == null && obj93 != null && !Intrinsics.areEqual(obj93, JSONObject.NULL)) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": dclTime参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj94 = map.get("subPath");
                            String str76 = obj94 instanceof String ? (String) obj94 : null;
                            Object obj95 = map.get("subPath");
                            if (str76 != null || obj95 == null || Intrinsics.areEqual(obj95, JSONObject.NULL)) {
                                interfaceC36577l.mo31854a(context, obj, str, str75, dBoxDouble2, str76, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$72
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                        invoke2(bool7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool7, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": subPath参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e87) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e87), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "getAlphaFavoriteList")) {
                        try {
                            ((InterfaceC36578m) Router.f46192a.m56192n(InterfaceC36578m.class)).mo52143i(context, obj, str, new Function2<List<? extends KCJSApiMarketVisitorFavoriteEntity>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$73

                                /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$73$a */
                                /* JADX INFO: compiled from: GsonUtils.kt */
                                @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$73$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                public static final class C24036a extends TypeToken<Map<String, ? extends Object>> {
                                }

                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCJSApiMarketVisitorFavoriteEntity> list2, ProtocolException protocolException) {
                                    invoke2((List<KCJSApiMarketVisitorFavoriteEntity>) list2, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable List<KCJSApiMarketVisitorFavoriteEntity> list2, @Nullable ProtocolException protocolException) {
                                    String strM66919i;
                                    if (protocolException != null || list2 == null) {
                                        function3.invoke(null, protocolException);
                                        return;
                                    }
                                    Function2<Object, ProtocolException, Unit> function4 = function3;
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                                    for (KCJSApiMarketVisitorFavoriteEntity kCJSApiMarketVisitorFavoriteEntity : list2) {
                                        String str77 = "";
                                        if (kCJSApiMarketVisitorFavoriteEntity != null && (strM66919i = C27099x.m66919i(kCJSApiMarketVisitorFavoriteEntity, false, 2, null)) != null) {
                                            str77 = strM66919i;
                                        }
                                        C27099x c27099x = C27099x.f54458a;
                                        arrayList2.add((Map) C27099x.m66914d(str77, new C24036a().getType()));
                                    }
                                    function4.invoke(CollectionsKt.toList(arrayList2), null);
                                }
                            });
                            return Unit.INSTANCE;
                        } catch (Exception e88) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e88), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "isAlphaFavorite")) {
                        try {
                            InterfaceC36578m interfaceC36578m4 = (InterfaceC36578m) Router.f46192a.m56192n(InterfaceC36578m.class);
                            Object obj96 = map.get("tokenChain");
                            if (obj96 instanceof String) {
                                str15 = (String) obj96;
                                interfaceC36578m = interfaceC36578m4;
                            } else {
                                interfaceC36578m = interfaceC36578m4;
                                str15 = null;
                            }
                            if (str15 != null) {
                                interfaceC36578m.mo52140f(context, obj, str, str15, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$74
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                        invoke2(bool7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool7, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": tokenChain参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e89) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e89), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "changeAlphaFavorite")) {
                        try {
                            InterfaceC36578m interfaceC36578m5 = (InterfaceC36578m) Router.f46192a.m56192n(InterfaceC36578m.class);
                            Object obj97 = map.get("tokenChain");
                            String str77 = obj97 instanceof String ? (String) obj97 : null;
                            if (str77 != null) {
                                interfaceC36578m5.mo52144j(context, obj, str, str77, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$75
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                        invoke2(bool7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool7, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": tokenChain参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e91) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e91), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "getSpotFavoriteList")) {
                        try {
                            ((InterfaceC36578m) Router.f46192a.m56192n(InterfaceC36578m.class)).mo52142h(context, obj, str, new Function2<List<? extends KCJSApiMarketVisitorFavoriteEntity>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$76

                                /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$76$a */
                                /* JADX INFO: compiled from: GsonUtils.kt */
                                @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$76$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                public static final class C24037a extends TypeToken<Map<String, ? extends Object>> {
                                }

                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCJSApiMarketVisitorFavoriteEntity> list2, ProtocolException protocolException) {
                                    invoke2((List<KCJSApiMarketVisitorFavoriteEntity>) list2, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable List<KCJSApiMarketVisitorFavoriteEntity> list2, @Nullable ProtocolException protocolException) {
                                    String strM66919i;
                                    if (protocolException != null || list2 == null) {
                                        function3.invoke(null, protocolException);
                                        return;
                                    }
                                    Function2<Object, ProtocolException, Unit> function4 = function3;
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                                    for (KCJSApiMarketVisitorFavoriteEntity kCJSApiMarketVisitorFavoriteEntity : list2) {
                                        String str78 = "";
                                        if (kCJSApiMarketVisitorFavoriteEntity != null && (strM66919i = C27099x.m66919i(kCJSApiMarketVisitorFavoriteEntity, false, 2, null)) != null) {
                                            str78 = strM66919i;
                                        }
                                        C27099x c27099x = C27099x.f54458a;
                                        arrayList2.add((Map) C27099x.m66914d(str78, new C24037a().getType()));
                                    }
                                    function4.invoke(CollectionsKt.toList(arrayList2), null);
                                }
                            });
                            return Unit.INSTANCE;
                        } catch (Exception e92) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e92), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "isSpotFavorite")) {
                        try {
                            InterfaceC36578m interfaceC36578m6 = (InterfaceC36578m) Router.f46192a.m56192n(InterfaceC36578m.class);
                            Object obj98 = map.get("symbol");
                            if (obj98 instanceof String) {
                                str16 = (String) obj98;
                                interfaceC36578m2 = interfaceC36578m6;
                            } else {
                                interfaceC36578m2 = interfaceC36578m6;
                                str16 = null;
                            }
                            if (str16 != null) {
                                interfaceC36578m2.mo52139e(context, obj, str, str16, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$77
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                        invoke2(bool7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool7, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e93) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e93), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "changeSpotFavorite")) {
                        try {
                            InterfaceC36578m interfaceC36578m7 = (InterfaceC36578m) Router.f46192a.m56192n(InterfaceC36578m.class);
                            Object obj99 = map.get("symbol");
                            String str78 = obj99 instanceof String ? (String) obj99 : null;
                            if (str78 != null) {
                                interfaceC36578m7.mo52136b(context, obj, str, str78, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$78
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                        invoke2(bool7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool7, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e94) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e94), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "getFutureFavoriteList")) {
                        try {
                            ((InterfaceC36578m) Router.f46192a.m56192n(InterfaceC36578m.class)).mo52137c(context, obj, str, new Function2<List<? extends KCJSApiMarketVisitorFavoriteEntity>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$79

                                /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$79$a */
                                /* JADX INFO: compiled from: GsonUtils.kt */
                                @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$79$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                public static final class C24038a extends TypeToken<Map<String, ? extends Object>> {
                                }

                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCJSApiMarketVisitorFavoriteEntity> list2, ProtocolException protocolException) {
                                    invoke2((List<KCJSApiMarketVisitorFavoriteEntity>) list2, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable List<KCJSApiMarketVisitorFavoriteEntity> list2, @Nullable ProtocolException protocolException) {
                                    String strM66919i;
                                    if (protocolException != null || list2 == null) {
                                        function3.invoke(null, protocolException);
                                        return;
                                    }
                                    Function2<Object, ProtocolException, Unit> function4 = function3;
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                                    for (KCJSApiMarketVisitorFavoriteEntity kCJSApiMarketVisitorFavoriteEntity : list2) {
                                        String str79 = "";
                                        if (kCJSApiMarketVisitorFavoriteEntity != null && (strM66919i = C27099x.m66919i(kCJSApiMarketVisitorFavoriteEntity, false, 2, null)) != null) {
                                            str79 = strM66919i;
                                        }
                                        C27099x c27099x = C27099x.f54458a;
                                        arrayList2.add((Map) C27099x.m66914d(str79, new C24038a().getType()));
                                    }
                                    function4.invoke(CollectionsKt.toList(arrayList2), null);
                                }
                            });
                            return Unit.INSTANCE;
                        } catch (Exception e95) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e95), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "isFutureFavorite")) {
                        try {
                            InterfaceC36578m interfaceC36578m8 = (InterfaceC36578m) Router.f46192a.m56192n(InterfaceC36578m.class);
                            Object obj100 = map.get("symbol");
                            if (obj100 instanceof String) {
                                str17 = (String) obj100;
                                interfaceC36578m3 = interfaceC36578m8;
                            } else {
                                interfaceC36578m3 = interfaceC36578m8;
                                str17 = null;
                            }
                            if (str17 != null) {
                                interfaceC36578m3.mo52141g(context, obj, str, str17, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$80
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                        invoke2(bool7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool7, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e96) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e96), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "changeFutureFavorite")) {
                        try {
                            InterfaceC36578m interfaceC36578m9 = (InterfaceC36578m) Router.f46192a.m56192n(InterfaceC36578m.class);
                            Object obj101 = map.get("symbol");
                            String str79 = obj101 instanceof String ? (String) obj101 : null;
                            if (str79 != null) {
                                interfaceC36578m9.mo52145k(context, obj, str, str79, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$81
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                        invoke2(bool7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool7, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e97) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e97), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "getFutureTag")) {
                        try {
                            InterfaceC36578m interfaceC36578m10 = (InterfaceC36578m) Router.f46192a.m56192n(InterfaceC36578m.class);
                            Object obj102 = map.get("symbol");
                            List<String> list2 = obj102 instanceof List ? (List) obj102 : null;
                            if (list2 != null) {
                                interfaceC36578m10.mo52138d(context, obj, str, list2, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$82
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map11, ProtocolException protocolException) {
                                        invoke2(map11, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Map<String, ? extends Object> map11, @Nullable ProtocolException protocolException) {
                                        function3.invoke(map11, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e98) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e98), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "getUsStockExcludes")) {
                        try {
                            ((InterfaceC36578m) Router.f46192a.m56192n(InterfaceC36578m.class)).mo52135a(context, obj, str, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$83
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(String str80, ProtocolException protocolException) {
                                    invoke2(str80, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable String str80, @Nullable ProtocolException protocolException) {
                                    function3.invoke(str80, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        } catch (Exception e99) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e99), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "request")) {
                        try {
                            InterfaceC36579n interfaceC36579n5 = (InterfaceC36579n) Router.f46192a.m56192n(InterfaceC36579n.class);
                            Object obj103 = map.get("url");
                            String str80 = obj103 instanceof String ? (String) obj103 : null;
                            if (str80 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": url参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj104 = map.get(FirebaseAnalytics.Param.METHOD);
                            if (obj104 instanceof String) {
                                str18 = (String) obj104;
                                interfaceC36579n = interfaceC36579n5;
                            } else {
                                interfaceC36579n = interfaceC36579n5;
                                str18 = null;
                            }
                            if (str18 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str18 + ": method参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj105 = map.get("data");
                            Map map11 = obj105 instanceof Map ? (Map) obj105 : null;
                            Map<String, ? extends Object> mapM57899d12 = map11 != null ? C24053a.m57899d(map11) : null;
                            Object obj106 = map.get("data");
                            if (mapM57899d12 == null && obj106 != null && !Intrinsics.areEqual(obj106, JSONObject.NULL)) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str18 + ": data参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj107 = map.get("headers");
                            Map map12 = obj107 instanceof Map ? (Map) obj107 : null;
                            Map<String, ? extends Object> mapM57899d13 = map12 != null ? C24053a.m57899d(map12) : null;
                            Object obj108 = map.get("headers");
                            if (mapM57899d13 != null || obj108 == null || Intrinsics.areEqual(obj108, JSONObject.NULL)) {
                                interfaceC36579n.mo31780b(context, obj, str, str80, str18, mapM57899d12, mapM57899d13, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$84
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map13, ProtocolException protocolException) {
                                        invoke2(map13, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Map<String, ? extends Object> map13, @Nullable ProtocolException protocolException) {
                                        function3.invoke(map13, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str18 + ": headers参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e100) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e100), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "httpRequest")) {
                        try {
                            InterfaceC36579n interfaceC36579n6 = (InterfaceC36579n) Router.f46192a.m56192n(InterfaceC36579n.class);
                            Object obj109 = map.get("url");
                            String str81 = obj109 instanceof String ? (String) obj109 : null;
                            if (str81 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": url参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj110 = map.get(FirebaseAnalytics.Param.METHOD);
                            if (obj110 instanceof String) {
                                str19 = (String) obj110;
                                interfaceC36579n2 = interfaceC36579n6;
                            } else {
                                interfaceC36579n2 = interfaceC36579n6;
                                str19 = null;
                            }
                            if (str19 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str19 + ": method参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj111 = map.get("config");
                            Map map13 = obj111 instanceof Map ? (Map) obj111 : null;
                            Map<String, ? extends Object> mapM57899d14 = map13 != null ? C24053a.m57899d(map13) : null;
                            if (mapM57899d14 != null) {
                                interfaceC36579n2.mo31786e(context, obj, str, str81, str19, mapM57899d14, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$85
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map14, ProtocolException protocolException) {
                                        invoke2(map14, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Map<String, ? extends Object> map14, @Nullable ProtocolException protocolException) {
                                        function3.invoke(map14, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str19 + ": config参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e101) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e101), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "getClientNetworkConfig")) {
                        try {
                            ((InterfaceC36579n) Router.f46192a.m56192n(InterfaceC36579n.class)).mo31782c(context, obj, str, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$86
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map14, ProtocolException protocolException) {
                                    invoke2(map14, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Map<String, ? extends Object> map14, @Nullable ProtocolException protocolException) {
                                    function3.invoke(map14, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        } catch (Exception e102) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e102), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "uploadFile")) {
                        try {
                            InterfaceC36579n interfaceC36579n7 = (InterfaceC36579n) Router.f46192a.m56192n(InterfaceC36579n.class);
                            Object obj112 = map.get("url");
                            String str82 = obj112 instanceof String ? (String) obj112 : null;
                            if (str82 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": url参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj113 = map.get("file");
                            Map map14 = obj113 instanceof Map ? (Map) obj113 : null;
                            if (map14 != null) {
                                mapM57899d3 = C24053a.m57899d(map14);
                                interfaceC36579n3 = interfaceC36579n7;
                            } else {
                                interfaceC36579n3 = interfaceC36579n7;
                                mapM57899d3 = null;
                            }
                            if (mapM57899d3 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": file参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj114 = map.get(ReportDataTable.COLUMN_PARAMS);
                            Map map15 = obj114 instanceof Map ? (Map) obj114 : null;
                            Map<String, ? extends Object> mapM57899d15 = map15 != null ? C24053a.m57899d(map15) : null;
                            Object obj115 = map.get(ReportDataTable.COLUMN_PARAMS);
                            if (mapM57899d15 == null && obj115 != null && !Intrinsics.areEqual(obj115, JSONObject.NULL)) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": params参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj116 = map.get("headers");
                            Map map16 = obj116 instanceof Map ? (Map) obj116 : null;
                            if (map16 != null) {
                                Map<String, ? extends Object> map17 = mapM57899d15;
                                mapM57899d4 = C24053a.m57899d(map16);
                                map2 = map17;
                            } else {
                                map2 = mapM57899d15;
                                mapM57899d4 = null;
                            }
                            Object obj117 = map.get("headers");
                            if (mapM57899d4 != null || obj117 == null || Intrinsics.areEqual(obj117, JSONObject.NULL)) {
                                interfaceC36579n3.mo31784d(context, obj, str, str82, mapM57899d3, map2, mapM57899d4, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$87
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map18, ProtocolException protocolException) {
                                        invoke2(map18, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Map<String, ? extends Object> map18, @Nullable ProtocolException protocolException) {
                                        function3.invoke(map18, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": headers参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e103) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e103), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "uploadFileV2")) {
                        try {
                            InterfaceC36579n interfaceC36579n8 = (InterfaceC36579n) Router.f46192a.m56192n(InterfaceC36579n.class);
                            Object obj118 = map.get("url");
                            String str83 = obj118 instanceof String ? (String) obj118 : null;
                            if (str83 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": url参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj119 = map.get("file");
                            Map map18 = obj119 instanceof Map ? (Map) obj119 : null;
                            if (map18 != null) {
                                mapM57899d5 = C24053a.m57899d(map18);
                                interfaceC36579n4 = interfaceC36579n8;
                            } else {
                                interfaceC36579n4 = interfaceC36579n8;
                                mapM57899d5 = null;
                            }
                            if (mapM57899d5 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": file参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj120 = map.get(FirebaseAnalytics.Param.METHOD);
                            String str84 = obj120 instanceof String ? (String) obj120 : null;
                            Object obj121 = map.get(FirebaseAnalytics.Param.METHOD);
                            if (str84 == null && obj121 != null && !Intrinsics.areEqual(obj121, JSONObject.NULL)) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str84 + ": method参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj122 = map.get("config");
                            Map map19 = obj122 instanceof Map ? (Map) obj122 : null;
                            Map<String, ? extends Object> mapM57899d16 = map19 != null ? C24053a.m57899d(map19) : null;
                            Object obj123 = map.get("config");
                            if (mapM57899d16 != null || obj123 == null || Intrinsics.areEqual(obj123, JSONObject.NULL)) {
                                interfaceC36579n4.mo31778a(context, obj, str, str83, mapM57899d5, str84, mapM57899d16, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$88
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map20, ProtocolException protocolException) {
                                        invoke2(map20, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Map<String, ? extends Object> map20, @Nullable ProtocolException protocolException) {
                                        function3.invoke(map20, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str84 + ": config参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e104) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e104), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "updatePackageVersion")) {
                        try {
                            InterfaceC36580o interfaceC36580o = (InterfaceC36580o) Router.f46192a.m56192n(InterfaceC36580o.class);
                            Object obj124 = map.get(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
                            String str85 = obj124 instanceof String ? (String) obj124 : null;
                            if (str85 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": packageName参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj125 = map.get("version");
                            String str86 = obj125 instanceof String ? (String) obj125 : null;
                            if (str86 != null) {
                                interfaceC36580o.mo81875a(context, obj, str, str85, str86, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$89
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                        invoke2(bool7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool7, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": version参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e105) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e105), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "paymentJumpScanQrcode")) {
                        try {
                            ((InterfaceC36582q) Router.f46192a.m56192n(InterfaceC36582q.class)).mo49517c(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$90
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool7, ProtocolException protocolException) {
                                    invoke2(bool7, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Boolean bool7, @Nullable ProtocolException protocolException) {
                                    function3.invoke(bool7, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        } catch (Exception e106) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e106), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "paymentPickContactPhone")) {
                        try {
                            ((InterfaceC36582q) Router.f46192a.m56192n(InterfaceC36582q.class)).mo49516b(context, obj, str, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$91
                                @Override // p852kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(String str87, ProtocolException protocolException) {
                                    invoke2(str87, protocolException);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable String str87, @Nullable ProtocolException protocolException) {
                                    function3.invoke(str87, protocolException);
                                }
                            });
                            return Unit.INSTANCE;
                        } catch (Exception e107) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e107), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "selectRecurringFrequency")) {
                        try {
                            InterfaceC36581p interfaceC36581p3 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                            Object obj126 = map.get("update");
                            Boolean bool7 = obj126 instanceof Boolean ? (Boolean) obj126 : null;
                            if (bool7 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": update参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj127 = map.get("frequency");
                            String str87 = obj127 instanceof String ? (String) obj127 : null;
                            if (str87 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": frequency参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj128 = map.get("dayOfMonth");
                            String str88 = obj128 instanceof String ? (String) obj128 : null;
                            if (str88 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": dayOfMonth参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj129 = map.get("dayOfWeek");
                            String str89 = obj129 instanceof String ? (String) obj129 : null;
                            if (str89 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": dayOfWeek参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj130 = map.get("timeOfDay");
                            String str90 = obj130 instanceof String ? (String) obj130 : null;
                            if (str90 == null) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": timeOfDay参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj131 = map.get(RemoteConfigConstants.RequestFieldKey.TIME_ZONE);
                            String str91 = obj131 instanceof String ? (String) obj131 : null;
                            if (str91 != null) {
                                interfaceC36581p3.mo49473F(context, obj, str, bool7.booleanValue(), str87, str88, str89, str90, str91, new Function2<KCJSApiPaymentRecurringFrequencyInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$92

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$92$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$92$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24039a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(KCJSApiPaymentRecurringFrequencyInfo kCJSApiPaymentRecurringFrequencyInfo, ProtocolException protocolException) {
                                        invoke2(kCJSApiPaymentRecurringFrequencyInfo, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable KCJSApiPaymentRecurringFrequencyInfo kCJSApiPaymentRecurringFrequencyInfo, @Nullable ProtocolException protocolException) {
                                        if (protocolException != null || kCJSApiPaymentRecurringFrequencyInfo == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        String strM66919i = C27099x.m66919i(kCJSApiPaymentRecurringFrequencyInfo, false, 2, null);
                                        if (strM66919i == null) {
                                            strM66919i = "";
                                        }
                                        function3.invoke((Map) C27099x.m66914d(strM66919i, new C24039a().getType()), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": timeZone参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e108) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e108), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "isSupportGooglePay")) {
                        try {
                            InterfaceC36581p interfaceC36581p4 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                            Object obj132 = map.get("allowedCardNetworks");
                            List<String> list3 = obj132 instanceof List ? (List) obj132 : null;
                            Object obj133 = map.get("allowedCardNetworks");
                            if (list3 != null || obj133 == null || Intrinsics.areEqual(obj133, JSONObject.NULL)) {
                                interfaceC36581p4.mo49475M(context, obj, str, list3, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$93
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool8, ProtocolException protocolException) {
                                        invoke2(bool8, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool8, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool8, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": allowedCardNetworks参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e109) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e109), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (Intrinsics.areEqual(str38, "isSupportApplePay")) {
                        try {
                            InterfaceC36581p interfaceC36581p5 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                            Object obj134 = map.get("allowedCardNetworks");
                            List<String> list4 = obj134 instanceof List ? (List) obj134 : null;
                            Object obj135 = map.get("allowedCardNetworks");
                            if (list4 == null && obj135 != null && !Intrinsics.areEqual(obj135, JSONObject.NULL)) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": allowedCardNetworks参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj136 = map.get("isRecurring");
                            Boolean bool8 = obj136 instanceof Boolean ? (Boolean) obj136 : null;
                            Object obj137 = map.get("isRecurring");
                            if (bool8 != null || obj137 == null || Intrinsics.areEqual(obj137, JSONObject.NULL)) {
                                interfaceC36581p5.mo49474K(context, obj, str, list4, bool8, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$94
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool9, ProtocolException protocolException) {
                                        invoke2(bool9, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool9, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool9, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": isRecurring参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e110) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e110), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    if (!Intrinsics.areEqual(str38, "showFastTradeGooglePay")) {
                        if (Intrinsics.areEqual(str38, "getForterMobileUid")) {
                            try {
                                ((InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class)).mo49493t(context, obj, str, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$96
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(String str92, ProtocolException protocolException) {
                                        invoke2(str92, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable String str92, @Nullable ProtocolException protocolException) {
                                        function3.invoke(str92, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e111) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e111), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getRiskSessionId")) {
                            try {
                                InterfaceC36581p interfaceC36581p6 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                                Object obj138 = map.get("bizType");
                                String str92 = obj138 instanceof String ? (String) obj138 : null;
                                if (str92 != null) {
                                    interfaceC36581p6.mo49469A(context, obj, str, str92, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$97
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str93, ProtocolException protocolException) {
                                            invoke2(str93, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable String str93, @Nullable ProtocolException protocolException) {
                                            function3.invoke(str93, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e112) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e112), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "showCouponPopup")) {
                            try {
                                InterfaceC36581p interfaceC36581p7 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                                Object obj139 = map.get("data");
                                String str93 = obj139 instanceof String ? (String) obj139 : null;
                                if (str93 != null) {
                                    interfaceC36581p7.mo49476N(context, obj, str, str93, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$98
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool9, ProtocolException protocolException) {
                                            invoke2(bool9, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool9, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool9, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": data参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e113) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e113), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "goToUpgrade")) {
                            try {
                                ((InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class)).mo49482g(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$99
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool9, ProtocolException protocolException) {
                                        invoke2(bool9, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool9, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool9, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e114) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e114), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "jumpPaymentMethodPage")) {
                            try {
                                ((InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class)).mo49488n(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$100
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool9, ProtocolException protocolException) {
                                        invoke2(bool9, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool9, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool9, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e115) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e115), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "investmentCheckSafeVerify")) {
                            try {
                                InterfaceC36581p interfaceC36581p8 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                                Object obj140 = map.get("bizType");
                                String str94 = obj140 instanceof String ? (String) obj140 : null;
                                if (str94 != null) {
                                    interfaceC36581p8.mo49494u(context, obj, str, str94, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$101
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool9, ProtocolException protocolException) {
                                            invoke2(bool9, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool9, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool9, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e116) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e116), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "jumpP2PChatPage")) {
                            try {
                                InterfaceC36581p interfaceC36581p9 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                                Object obj141 = map.get("orderId");
                                String str95 = obj141 instanceof String ? (String) obj141 : null;
                                if (str95 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": orderId参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj142 = map.get("from");
                                String str96 = obj142 instanceof String ? (String) obj142 : null;
                                if (str96 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": from参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj143 = map.get("fromName");
                                String str97 = obj143 instanceof String ? (String) obj143 : null;
                                if (str97 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": fromName参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj144 = map.get(TypedValues.TransitionType.S_TO);
                                String str98 = obj144 instanceof String ? (String) obj144 : null;
                                if (str98 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": to参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj145 = map.get("toName");
                                String str99 = obj145 instanceof String ? (String) obj145 : null;
                                if (str99 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": toName参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj146 = map.get("canChat");
                                Boolean bool9 = obj146 instanceof Boolean ? (Boolean) obj146 : null;
                                if (bool9 != null) {
                                    interfaceC36581p9.mo49486l(context, obj, str, str95, str96, str97, str98, str99, bool9.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$102
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool10, ProtocolException protocolException) {
                                            invoke2(bool10, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool10, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool10, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": canChat参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e117) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e117), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "openThirdPurchaseOrderChannel")) {
                            try {
                                InterfaceC36581p interfaceC36581p10 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                                Object obj147 = map.get("orderJson");
                                String str100 = obj147 instanceof String ? (String) obj147 : null;
                                if (str100 != null) {
                                    interfaceC36581p10.mo49491q(context, obj, str, str100, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$103
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool10, ProtocolException protocolException) {
                                            invoke2(bool10, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool10, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool10, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": orderJson参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e118) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e118), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "uploadThirdPurchaseKycImage")) {
                            try {
                                InterfaceC36581p interfaceC36581p11 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                                Object obj148 = map.get("imageUri");
                                String str101 = obj148 instanceof String ? (String) obj148 : null;
                                if (str101 != null) {
                                    interfaceC36581p11.mo49480d(context, obj, str, str101, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$104
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str102, ProtocolException protocolException) {
                                            invoke2(str102, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable String str102, @Nullable ProtocolException protocolException) {
                                            function3.invoke(str102, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": imageUri参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e119) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e119), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "chatLoginout")) {
                            try {
                                ((InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class)).mo49485k(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$105
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool10, ProtocolException protocolException) {
                                        invoke2(bool10, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool10, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool10, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e120) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e120), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "openWebUrlByIgnoreWhiteList")) {
                            try {
                                InterfaceC36581p interfaceC36581p12 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                                Object obj149 = map.get("url");
                                String str102 = obj149 instanceof String ? (String) obj149 : null;
                                if (str102 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": url参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj150 = map.get("title");
                                if (obj150 instanceof String) {
                                    str21 = (String) obj150;
                                    interfaceC36581p2 = interfaceC36581p12;
                                } else {
                                    interfaceC36581p2 = interfaceC36581p12;
                                    str21 = null;
                                }
                                Object obj151 = map.get("title");
                                if (str21 != null || obj151 == null || Intrinsics.areEqual(obj151, JSONObject.NULL)) {
                                    interfaceC36581p2.mo49471C(context, obj, str, str102, str21, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$106
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool10, ProtocolException protocolException) {
                                            invoke2(bool10, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool10, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool10, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": title参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e121) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e121), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "paymentPickImageAndVideoAndFile")) {
                            try {
                                InterfaceC36581p interfaceC36581p13 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                                Object obj152 = map.get("type");
                                Number number8 = obj152 instanceof Number ? (Number) obj152 : null;
                                Long lBoxLong6 = number8 != null ? Boxing.boxLong(number8.longValue()) : null;
                                Object obj153 = map.get("type");
                                if (lBoxLong6 != null || obj153 == null || Intrinsics.areEqual(obj153, JSONObject.NULL)) {
                                    interfaceC36581p13.mo49490o(context, obj, str, lBoxLong6, new Function2<KCJSApiPaymentNativeFilePickerResult, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$107

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$107$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$107$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24003a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiPaymentNativeFilePickerResult kCJSApiPaymentNativeFilePickerResult, ProtocolException protocolException) {
                                            invoke2(kCJSApiPaymentNativeFilePickerResult, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCJSApiPaymentNativeFilePickerResult kCJSApiPaymentNativeFilePickerResult, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCJSApiPaymentNativeFilePickerResult == null) {
                                                function3.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCJSApiPaymentNativeFilePickerResult, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24003a().getType()), null);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": type参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e122) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e122), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "paymentUploadFileList")) {
                            try {
                                InterfaceC36581p interfaceC36581p14 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                                Object obj154 = map.get("pathList");
                                List<String> list5 = obj154 instanceof List ? (List) obj154 : null;
                                if (list5 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": pathList参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj155 = map.get("businessType");
                                String str103 = obj155 instanceof String ? (String) obj155 : null;
                                if (str103 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": businessType参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj156 = map.get("isPdf");
                                Boolean bool10 = obj156 instanceof Boolean ? (Boolean) obj156 : null;
                                if (bool10 != null) {
                                    interfaceC36581p14.mo49481f(context, obj, str, list5, str103, bool10.booleanValue(), new Function2<List<? extends String>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$108
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list6, ProtocolException protocolException) {
                                            invoke2((List<String>) list6, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable List<String> list6, @Nullable ProtocolException protocolException) {
                                            function3.invoke(list6, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": isPdf参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e123) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e123), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "paymentViewVideo")) {
                            try {
                                InterfaceC36581p interfaceC36581p15 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                                Object obj157 = map.get("isRemoteUrl");
                                Boolean bool11 = obj157 instanceof Boolean ? (Boolean) obj157 : null;
                                if (bool11 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": isRemoteUrl参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj158 = map.get("fileUrl");
                                String str104 = obj158 instanceof String ? (String) obj158 : null;
                                if (str104 != null) {
                                    interfaceC36581p15.mo49483h(context, obj, str, bool11.booleanValue(), str104, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$109
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool12, ProtocolException protocolException) {
                                            invoke2(bool12, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool12, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool12, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": fileUrl参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e124) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e124), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "paymentViewPdf")) {
                            try {
                                InterfaceC36581p interfaceC36581p16 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                                Object obj159 = map.get("isRemoteUrl");
                                Boolean bool12 = obj159 instanceof Boolean ? (Boolean) obj159 : null;
                                if (bool12 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": isRemoteUrl参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj160 = map.get("fileUrl");
                                String str105 = obj160 instanceof String ? (String) obj160 : null;
                                if (str105 != null) {
                                    interfaceC36581p16.mo49492s(context, obj, str, bool12.booleanValue(), str105, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$110
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool13, ProtocolException protocolException) {
                                            invoke2(bool13, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool13, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool13, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": fileUrl参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e125) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e125), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "paymentGetVideoThumbnail")) {
                            try {
                                InterfaceC36581p interfaceC36581p17 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                                Object obj161 = map.get("isRemoteUrl");
                                Boolean bool13 = obj161 instanceof Boolean ? (Boolean) obj161 : null;
                                if (bool13 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": isRemoteUrl参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj162 = map.get("fileUrl");
                                String str106 = obj162 instanceof String ? (String) obj162 : null;
                                if (str106 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": fileUrl参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj163 = map.get(C33757kf.f70665k);
                                Number number9 = obj163 instanceof Number ? (Number) obj163 : null;
                                Long lBoxLong7 = number9 != null ? Boxing.boxLong(number9.longValue()) : null;
                                Object obj164 = map.get(C33757kf.f70665k);
                                if (lBoxLong7 != null || obj164 == null || Intrinsics.areEqual(obj164, JSONObject.NULL)) {
                                    interfaceC36581p17.mo49478b(context, obj, str, bool13.booleanValue(), str106, lBoxLong7, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$111
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str107, ProtocolException protocolException) {
                                            invoke2(str107, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable String str107, @Nullable ProtocolException protocolException) {
                                            function3.invoke(str107, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": quality参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e126) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e126), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getTotalBalance")) {
                            try {
                                InterfaceC36581p interfaceC36581p18 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                                Object obj165 = map.get("balanceCurrency");
                                String str107 = obj165 instanceof String ? (String) obj165 : null;
                                if (str107 != null) {
                                    interfaceC36581p18.mo49479c(context, obj, str, str107, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$112
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str108, ProtocolException protocolException) {
                                            invoke2(str108, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable String str108, @Nullable ProtocolException protocolException) {
                                            function3.invoke(str108, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": balanceCurrency参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e127) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e127), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "checkWithdrawLimit")) {
                            try {
                                ((InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class)).mo49477O(context, obj, str, new Function2<KCJSApiPaymentBlackGroupResponse, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$113

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$113$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$113$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24004a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(KCJSApiPaymentBlackGroupResponse kCJSApiPaymentBlackGroupResponse, ProtocolException protocolException) {
                                        invoke2(kCJSApiPaymentBlackGroupResponse, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable KCJSApiPaymentBlackGroupResponse kCJSApiPaymentBlackGroupResponse, @Nullable ProtocolException protocolException) {
                                        if (protocolException != null || kCJSApiPaymentBlackGroupResponse == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        String strM66919i = C27099x.m66919i(kCJSApiPaymentBlackGroupResponse, false, 2, null);
                                        if (strM66919i == null) {
                                            strM66919i = "";
                                        }
                                        function3.invoke((Map) C27099x.m66914d(strM66919i, new C24004a().getType()), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e128) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e128), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "toAdaChatDirectly")) {
                            try {
                                ((InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class)).mo49470B(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$114
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool14, ProtocolException protocolException) {
                                        invoke2(bool14, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool14, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool14, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e129) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e129), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "playCancelOrderAudio")) {
                            try {
                                ((InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class)).mo49495y(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$115
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool14, ProtocolException protocolException) {
                                        invoke2(bool14, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool14, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool14, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e130) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e130), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getP2PProtocalUrls")) {
                            try {
                                ((InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class)).mo49472D(context, obj, str, new Function2<KCJSApiPaymentProtocolUrls, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$116

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$116$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$116$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24005a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(KCJSApiPaymentProtocolUrls kCJSApiPaymentProtocolUrls, ProtocolException protocolException) {
                                        invoke2(kCJSApiPaymentProtocolUrls, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable KCJSApiPaymentProtocolUrls kCJSApiPaymentProtocolUrls, @Nullable ProtocolException protocolException) {
                                        if (protocolException != null || kCJSApiPaymentProtocolUrls == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        String strM66919i = C27099x.m66919i(kCJSApiPaymentProtocolUrls, false, 2, null);
                                        if (strM66919i == null) {
                                            strM66919i = "";
                                        }
                                        function3.invoke((Map) C27099x.m66914d(strM66919i, new C24005a().getType()), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e131) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e131), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "takePicture")) {
                            try {
                                InterfaceC36583r interfaceC36583r = (InterfaceC36583r) Router.f46192a.m56192n(InterfaceC36583r.class);
                                Object obj166 = map.get(BridgeParamKeyKt.CAPTURE);
                                Boolean bool14 = obj166 instanceof Boolean ? (Boolean) obj166 : null;
                                if (bool14 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": capture参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj167 = map.get(BridgeParamKeyKt.MAX_COUNT);
                                Number number10 = obj167 instanceof Number ? (Number) obj167 : null;
                                Long lBoxLong8 = number10 != null ? Boxing.boxLong(number10.longValue()) : null;
                                if (lBoxLong8 != null) {
                                    interfaceC36583r.mo31565b(context, obj, str, bool14.booleanValue(), lBoxLong8.longValue(), new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$117
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map20, ProtocolException protocolException) {
                                            invoke2(map20, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Map<String, ? extends Object> map20, @Nullable ProtocolException protocolException) {
                                            function3.invoke(map20, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": maxCount参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e132) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e132), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "appAlbumSelect")) {
                            try {
                                InterfaceC36583r interfaceC36583r2 = (InterfaceC36583r) Router.f46192a.m56192n(InterfaceC36583r.class);
                                Object obj168 = map.get(BridgeParamKeyKt.MAX_COUNT);
                                Number number11 = obj168 instanceof Number ? (Number) obj168 : null;
                                Long lBoxLong9 = number11 != null ? Boxing.boxLong(number11.longValue()) : null;
                                if (lBoxLong9 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": maxCount参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj169 = map.get("mediaType");
                                String str108 = obj169 instanceof String ? (String) obj169 : null;
                                if (str108 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": mediaType参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj170 = map.get(BridgeParamKeyKt.CAPTURE);
                                Boolean bool15 = obj170 instanceof Boolean ? (Boolean) obj170 : null;
                                if (bool15 != null) {
                                    interfaceC36583r2.mo31564a(context, obj, str, lBoxLong9.longValue(), str108, bool15.booleanValue(), new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$118
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map20, ProtocolException protocolException) {
                                            invoke2(map20, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Map<String, ? extends Object> map20, @Nullable ProtocolException protocolException) {
                                            function3.invoke(map20, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": capture参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e133) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e133), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "openQrScan")) {
                            try {
                                InterfaceC36584s interfaceC36584s = (InterfaceC36584s) Router.f46192a.m56192n(InterfaceC36584s.class);
                                Object obj171 = map.get("bizType");
                                String str109 = obj171 instanceof String ? (String) obj171 : null;
                                Object obj172 = map.get("bizType");
                                if (str109 != null || obj172 == null || Intrinsics.areEqual(obj172, JSONObject.NULL)) {
                                    interfaceC36584s.mo81877b(context, obj, str, str109, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$119
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str110, ProtocolException protocolException) {
                                            invoke2(str110, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable String str110, @Nullable ProtocolException protocolException) {
                                            function3.invoke(str110, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": bizType参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e134) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e134), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "scanQrCode")) {
                            try {
                                InterfaceC36584s interfaceC36584s2 = (InterfaceC36584s) Router.f46192a.m56192n(InterfaceC36584s.class);
                                Object obj173 = map.get("supportedTypes");
                                List list6 = obj173 instanceof List ? (List) obj173 : null;
                                if (list6 != null) {
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                                    Iterator it = list6.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(Boxing.boxLong(((Number) it.next()).longValue()));
                                    }
                                    arrayList = arrayList2;
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": supportedTypes参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj174 = map.get("callerHandlesUnknownCode");
                                Boolean bool16 = obj174 instanceof Boolean ? (Boolean) obj174 : null;
                                if (bool16 != null) {
                                    interfaceC36584s2.mo81876a(context, obj, str, arrayList, bool16.booleanValue(), new Function2<KCJSApiQrScanScanQrCodeResult, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$120

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$120$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$120$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24006a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiQrScanScanQrCodeResult kCJSApiQrScanScanQrCodeResult, ProtocolException protocolException) {
                                            invoke2(kCJSApiQrScanScanQrCodeResult, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCJSApiQrScanScanQrCodeResult kCJSApiQrScanScanQrCodeResult, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCJSApiQrScanScanQrCodeResult == null) {
                                                function3.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCJSApiQrScanScanQrCodeResult, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24006a().getType()), null);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": callerHandlesUnknownCode参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e135) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e135), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "checkRedpacketCodeValid")) {
                            try {
                                InterfaceC36585t interfaceC36585t = (InterfaceC36585t) Router.f46192a.m56192n(InterfaceC36585t.class);
                                Object obj175 = map.get("redpacketCode");
                                String str110 = obj175 instanceof String ? (String) obj175 : null;
                                if (str110 != null) {
                                    interfaceC36585t.mo53751a(context, obj, str, str110, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$121
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool17, ProtocolException protocolException) {
                                            invoke2(bool17, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool17, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool17, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": redpacketCode参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e136) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e136), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "requestRedpacketInfoByCode")) {
                            try {
                                InterfaceC36585t interfaceC36585t2 = (InterfaceC36585t) Router.f46192a.m56192n(InterfaceC36585t.class);
                                Object obj176 = map.get("redpacketCode");
                                String str111 = obj176 instanceof String ? (String) obj176 : null;
                                if (str111 != null) {
                                    interfaceC36585t2.mo53752b(context, obj, str, str111, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$122
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool17, ProtocolException protocolException) {
                                            invoke2(bool17, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool17, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool17, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": redpacketCode参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e137) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e137), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "fastFetchAbTest")) {
                            try {
                                InterfaceC36586u interfaceC36586u = (InterfaceC36586u) Router.f46192a.m56192n(InterfaceC36586u.class);
                                Object obj177 = map.get("paramName");
                                String str112 = obj177 instanceof String ? (String) obj177 : null;
                                if (str112 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": paramName参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj178 = map.get("defaultValue");
                                String str113 = obj178 instanceof String ? (String) obj178 : null;
                                if (str113 != null) {
                                    interfaceC36586u.mo31566a(context, obj, str, str112, str113, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$123
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str114, ProtocolException protocolException) {
                                            invoke2(str114, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable String str114, @Nullable ProtocolException protocolException) {
                                            function3.invoke(str114, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": defaultValue参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e138) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e138), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getRemoteConfig")) {
                            try {
                                InterfaceC36586u interfaceC36586u2 = (InterfaceC36586u) Router.f46192a.m56192n(InterfaceC36586u.class);
                                Object obj179 = map.get("key");
                                String str114 = obj179 instanceof String ? (String) obj179 : null;
                                if (str114 != null) {
                                    interfaceC36586u2.mo31567b(context, obj, str, str114, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$124
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str115, ProtocolException protocolException) {
                                            invoke2(str115, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable String str115, @Nullable ProtocolException protocolException) {
                                            function3.invoke(str115, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": key参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e139) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e139), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "navigateTo")) {
                            try {
                                InterfaceC36587v interfaceC36587v2 = (InterfaceC36587v) Router.f46192a.m56192n(InterfaceC36587v.class);
                                Object obj180 = map.get("url");
                                if (obj180 instanceof String) {
                                    str22 = (String) obj180;
                                    interfaceC36587v = interfaceC36587v2;
                                } else {
                                    interfaceC36587v = interfaceC36587v2;
                                    str22 = null;
                                }
                                if (str22 != null) {
                                    interfaceC36587v.mo81878a(context, obj, str, str22, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$125
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool17, ProtocolException protocolException) {
                                            invoke2(bool17, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool17, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool17, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": url参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e140) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e140), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "openSafeValidation")) {
                            try {
                                InterfaceC36588w interfaceC36588w = (InterfaceC36588w) Router.f46192a.m56192n(InterfaceC36588w.class);
                                Object obj181 = map.get("bizType");
                                String str115 = obj181 instanceof String ? (String) obj181 : null;
                                if (str115 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj182 = map.get("businessData");
                                String str116 = obj182 instanceof String ? (String) obj182 : null;
                                if (str116 != null) {
                                    interfaceC36588w.m81879a(context, obj, str, str115, str116, new Function2<KCJSApiSafeValidationSafeValidationMap, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$126

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$126$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$126$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24007a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiSafeValidationSafeValidationMap kCJSApiSafeValidationSafeValidationMap, ProtocolException protocolException) {
                                            invoke2(kCJSApiSafeValidationSafeValidationMap, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCJSApiSafeValidationSafeValidationMap kCJSApiSafeValidationSafeValidationMap, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCJSApiSafeValidationSafeValidationMap == null) {
                                                function3.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCJSApiSafeValidationSafeValidationMap, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24007a().getType()), null);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": businessData参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e141) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e141), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "startScreenShare")) {
                            try {
                                ((InterfaceC36560a) Router.f46192a.m56192n(InterfaceC36560a.class)).mo14942c(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$127
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool17, ProtocolException protocolException) {
                                        invoke2(bool17, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool17, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool17, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e142) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e142), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "stopScreenShare")) {
                            try {
                                ((InterfaceC36560a) Router.f46192a.m56192n(InterfaceC36560a.class)).mo14940a(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$128
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool17, ProtocolException protocolException) {
                                        invoke2(bool17, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool17, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool17, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e143) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e143), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "isScreenShareEnable")) {
                            try {
                                ((InterfaceC36560a) Router.f46192a.m56192n(InterfaceC36560a.class)).mo14943d(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$129
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool17, ProtocolException protocolException) {
                                        invoke2(bool17, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool17, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool17, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e144) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e144), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "startToFloating")) {
                            try {
                                ((InterfaceC36560a) Router.f46192a.m56192n(InterfaceC36560a.class)).mo14941b(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$130
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool17, ProtocolException protocolException) {
                                        invoke2(bool17, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool17, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool17, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e145) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e145), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "fastFetchJsonTest")) {
                            try {
                                InterfaceC36589x interfaceC36589x2 = (InterfaceC36589x) Router.f46192a.m56192n(InterfaceC36589x.class);
                                Object obj183 = map.get("keyName");
                                String str117 = obj183 instanceof String ? (String) obj183 : null;
                                if (str117 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": keyName参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj184 = map.get("defaultValue");
                                Map map20 = obj184 instanceof Map ? (Map) obj184 : null;
                                if (map20 != null) {
                                    mapM57899d6 = C24053a.m57899d(map20);
                                    interfaceC36589x = interfaceC36589x2;
                                } else {
                                    interfaceC36589x = interfaceC36589x2;
                                    mapM57899d6 = null;
                                }
                                if (mapM57899d6 != null) {
                                    interfaceC36589x.mo31561f(context, obj, str, str117, mapM57899d6, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$131
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map21, ProtocolException protocolException) {
                                            invoke2(map21, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Map<String, ? extends Object> map21, @Nullable ProtocolException protocolException) {
                                            function3.invoke(map21, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": defaultValue参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e146) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e146), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "fastFetchIntegerTest")) {
                            try {
                                InterfaceC36589x interfaceC36589x3 = (InterfaceC36589x) Router.f46192a.m56192n(InterfaceC36589x.class);
                                Object obj185 = map.get("keyName");
                                String str118 = obj185 instanceof String ? (String) obj185 : null;
                                if (str118 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": keyName参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj186 = map.get("defaultValue");
                                Number number12 = obj186 instanceof Number ? (Number) obj186 : null;
                                Long lBoxLong10 = number12 != null ? Boxing.boxLong(number12.longValue()) : null;
                                if (lBoxLong10 != null) {
                                    interfaceC36589x3.mo31559d(context, obj, str, str118, lBoxLong10.longValue(), new Function2<Long, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$132
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Long l11, ProtocolException protocolException) {
                                            invoke2(l11, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Long l11, @Nullable ProtocolException protocolException) {
                                            function3.invoke(l11, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": defaultValue参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e147) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e147), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "fastFetchStringTest")) {
                            try {
                                InterfaceC36589x interfaceC36589x4 = (InterfaceC36589x) Router.f46192a.m56192n(InterfaceC36589x.class);
                                Object obj187 = map.get("keyName");
                                String str119 = obj187 instanceof String ? (String) obj187 : null;
                                if (str119 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": keyName参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj188 = map.get("defaultValue");
                                String str120 = obj188 instanceof String ? (String) obj188 : null;
                                if (str120 != null) {
                                    interfaceC36589x4.mo31557b(context, obj, str, str119, str120, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$133
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str121, ProtocolException protocolException) {
                                            invoke2(str121, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable String str121, @Nullable ProtocolException protocolException) {
                                            function3.invoke(str121, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": defaultValue参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e148) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e148), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "fastFetchBoolTest")) {
                            try {
                                InterfaceC36589x interfaceC36589x5 = (InterfaceC36589x) Router.f46192a.m56192n(InterfaceC36589x.class);
                                Object obj189 = map.get("keyName");
                                String str121 = obj189 instanceof String ? (String) obj189 : null;
                                if (str121 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": keyName参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj190 = map.get("defaultValue");
                                Boolean bool17 = obj190 instanceof Boolean ? (Boolean) obj190 : null;
                                if (bool17 != null) {
                                    interfaceC36589x5.mo31558c(context, obj, str, str121, bool17.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$134
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool18, ProtocolException protocolException) {
                                            invoke2(bool18, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool18, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool18, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": defaultValue参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e149) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e149), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "sensorsTrackTurbo")) {
                            try {
                                InterfaceC36589x interfaceC36589x6 = (InterfaceC36589x) Router.f46192a.m56192n(InterfaceC36589x.class);
                                Object obj191 = map.get("eventId");
                                String str122 = obj191 instanceof String ? (String) obj191 : null;
                                if (str122 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": eventId参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj192 = map.get("properties");
                                Map map21 = obj192 instanceof Map ? (Map) obj192 : null;
                                Map<String, ? extends Object> mapM57899d17 = map21 != null ? C24053a.m57899d(map21) : null;
                                Object obj193 = map.get("properties");
                                if (mapM57899d17 != null || obj193 == null || Intrinsics.areEqual(obj193, JSONObject.NULL)) {
                                    interfaceC36589x6.mo31560e(context, obj, str, str122, mapM57899d17, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$135
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool18, ProtocolException protocolException) {
                                            invoke2(bool18, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool18, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool18, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": properties参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e150) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e150), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "sensorsExpose")) {
                            try {
                                InterfaceC36589x interfaceC36589x7 = (InterfaceC36589x) Router.f46192a.m56192n(InterfaceC36589x.class);
                                Object obj194 = map.get("pageId");
                                String str123 = obj194 instanceof String ? (String) obj194 : null;
                                if (str123 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": pageId参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj195 = map.get("blockId");
                                String str124 = obj195 instanceof String ? (String) obj195 : null;
                                if (str124 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": blockId参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj196 = map.get("locationId");
                                String str125 = obj196 instanceof String ? (String) obj196 : null;
                                if (str125 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": locationId参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj197 = map.get("siteId");
                                String str126 = obj197 instanceof String ? (String) obj197 : null;
                                Object obj198 = map.get("siteId");
                                if (str126 == null && obj198 != null && !Intrinsics.areEqual(obj198, JSONObject.NULL)) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": siteId参数类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj199 = map.get("properties");
                                Map map22 = obj199 instanceof Map ? (Map) obj199 : null;
                                Map<String, ? extends Object> mapM57899d18 = map22 != null ? C24053a.m57899d(map22) : null;
                                Object obj200 = map.get("properties");
                                if (mapM57899d18 != null || obj200 == null || Intrinsics.areEqual(obj200, JSONObject.NULL)) {
                                    interfaceC36589x7.mo31556a(context, obj, str, str123, str124, str125, str126, mapM57899d18, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$136
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool18, ProtocolException protocolException) {
                                            invoke2(bool18, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool18, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool18, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": properties参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e151) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e151), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "fetchKcAbTest")) {
                            try {
                                InterfaceC36589x interfaceC36589x8 = (InterfaceC36589x) Router.f46192a.m56192n(InterfaceC36589x.class);
                                Object obj201 = map.get("experimentKey");
                                String str127 = obj201 instanceof String ? (String) obj201 : null;
                                if (str127 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": experimentKey参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj202 = map.get("defaultValue");
                                String str128 = obj202 instanceof String ? (String) obj202 : null;
                                if (str128 != null) {
                                    interfaceC36589x8.mo31562g(context, obj, str, str127, str128, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$137
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str129, ProtocolException protocolException) {
                                            invoke2(str129, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable String str129, @Nullable ProtocolException protocolException) {
                                            function3.invoke(str129, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": defaultValue参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e152) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e152), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, FirebaseAnalytics.Event.SHARE)) {
                            try {
                                interfaceC36590y = (InterfaceC36590y) Router.f46192a.m56192n(InterfaceC36590y.class);
                                Object obj203 = map.get("category");
                                str23 = obj203 instanceof String ? (String) obj203 : null;
                                if (str23 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": category参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj204 = map.get("utmSource");
                                str24 = obj204 instanceof String ? (String) obj204 : null;
                                if (str24 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": utmSource参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj205 = map.get("rcode");
                                String str129 = obj205 instanceof String ? (String) obj205 : null;
                                if (str129 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": rcode参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj206 = map.get(BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE);
                                bool = obj206 instanceof Boolean ? (Boolean) obj206 : null;
                                if (bool == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": needQrCode参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj207 = map.get("onlyDarkMode");
                                bool2 = obj207 instanceof Boolean ? (Boolean) obj207 : null;
                                if (bool2 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": onlyDarkMode参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj208 = map.get(BridgeParamKeyKt.SHARE_KEY_PIC);
                                String str130 = obj208 instanceof String ? (String) obj208 : null;
                                Object obj209 = map.get(BridgeParamKeyKt.SHARE_KEY_PIC);
                                if (str130 == null && obj209 != null) {
                                    if (!Intrinsics.areEqual(obj209, JSONObject.NULL)) {
                                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": pic参数类型不正确"), null, false, 12, null));
                                        return Unit.INSTANCE;
                                    }
                                }
                                Object obj210 = map.get("qrCodeUrl");
                                String str131 = obj210 instanceof String ? (String) obj210 : null;
                                Object obj211 = map.get("qrCodeUrl");
                                if (str131 == null && obj211 != null) {
                                    if (!Intrinsics.areEqual(obj211, JSONObject.NULL)) {
                                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": qrCodeUrl参数类型不正确"), null, false, 12, null));
                                        return Unit.INSTANCE;
                                    }
                                }
                                Object obj212 = map.get("title");
                                String str132 = obj212 instanceof String ? (String) obj212 : null;
                                Object obj213 = map.get("title");
                                if (str132 == null && obj213 != null) {
                                    if (!Intrinsics.areEqual(obj213, JSONObject.NULL)) {
                                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": title参数类型不正确"), null, false, 12, null));
                                        return Unit.INSTANCE;
                                    }
                                }
                                Object obj214 = map.get("content");
                                String str133 = obj214 instanceof String ? (String) obj214 : null;
                                Object obj215 = map.get("content");
                                if (str133 == null && obj215 != null) {
                                    if (!Intrinsics.areEqual(obj215, JSONObject.NULL)) {
                                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": content参数类型不正确"), null, false, 12, null));
                                        return Unit.INSTANCE;
                                    }
                                }
                                Object obj216 = map.get(BridgeParamKeyKt.SHARE_KEY_LINKURL);
                                String str134 = obj216 instanceof String ? (String) obj216 : null;
                                Object obj217 = map.get(BridgeParamKeyKt.SHARE_KEY_LINKURL);
                                if (str134 == null && obj217 != null) {
                                    if (!Intrinsics.areEqual(obj217, JSONObject.NULL)) {
                                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": linkUrl参数类型不正确"), null, false, 12, null));
                                        return Unit.INSTANCE;
                                    }
                                }
                                AbstractC41697j0 abstractC41697j0M94120b2 = C42911a.m94120b();
                                KCJSApiProtocolManager$_exec$data$1 kCJSApiProtocolManager$_exec$data$1 = new KCJSApiProtocolManager$_exec$data$1(map, null);
                                kCJSApiProtocolManager$_exec$2.L$0 = context;
                                kCJSApiProtocolManager$_exec$2.L$1 = obj;
                                kCJSApiProtocolManager$_exec$2.L$2 = str;
                                kCJSApiProtocolManager$_exec$2.L$3 = str38;
                                kCJSApiProtocolManager$_exec$2.L$4 = function3;
                                kCJSApiProtocolManager$_exec$2.L$5 = map;
                                kCJSApiProtocolManager$_exec$2.L$6 = interfaceC36590y;
                                kCJSApiProtocolManager$_exec$2.L$7 = str23;
                                kCJSApiProtocolManager$_exec$2.L$8 = str24;
                                kCJSApiProtocolManager$_exec$2.L$9 = str129;
                                kCJSApiProtocolManager$_exec$2.L$10 = bool;
                                kCJSApiProtocolManager$_exec$2.L$11 = bool2;
                                kCJSApiProtocolManager$_exec$2.L$12 = str130;
                                str25 = str131;
                                kCJSApiProtocolManager$_exec$2.L$13 = str25;
                                kCJSApiProtocolManager$_exec$2.L$14 = str132;
                                kCJSApiProtocolManager$_exec$2.L$15 = str133;
                                kCJSApiProtocolManager$_exec$2.L$16 = str134;
                                kCJSApiProtocolManager$_exec$2.label = 3;
                                objM91049g = C41686h.m91049g(abstractC41697j0M94120b2, kCJSApiProtocolManager$_exec$data$1, kCJSApiProtocolManager$_exec$2);
                                if (objM91049g == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                context4 = context;
                                str26 = str129;
                                str27 = str130;
                                str28 = str;
                                obj4 = obj;
                                str29 = str132;
                                str30 = str133;
                                str31 = str134;
                                map3 = map;
                                String str135 = str25;
                                String str136 = str24;
                                String str137 = str23;
                                InterfaceC36590y interfaceC36590y2 = interfaceC36590y;
                                kCJSApiShareGalleryDataEntity = (KCJSApiShareGalleryDataEntity) objM91049g;
                                Object obj218 = map3.get("data");
                                if (kCJSApiShareGalleryDataEntity == null || obj218 == null || Intrinsics.areEqual(obj218, JSONObject.NULL)) {
                                    interfaceC36590y2.mo59670c(context4, obj4, str28, str137, str136, str26, bool.booleanValue(), bool2.booleanValue(), str27, str135, str29, str30, str31, kCJSApiShareGalleryDataEntity, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$138
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool18, ProtocolException protocolException) {
                                            invoke2(bool18, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool18, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool18, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": data参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e153) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e153), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "saveShareImage")) {
                            try {
                                InterfaceC36590y interfaceC36590y3 = (InterfaceC36590y) Router.f46192a.m56192n(InterfaceC36590y.class);
                                Object obj219 = map.get("imgData");
                                String str138 = obj219 instanceof String ? (String) obj219 : null;
                                if (str138 != null) {
                                    interfaceC36590y3.mo59668a(context, obj, str, str138, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$139
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool18, ProtocolException protocolException) {
                                            invoke2(bool18, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool18, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool18, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": imgData参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e154) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e154), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "shareWithOptions")) {
                            try {
                                InterfaceC36590y interfaceC36590y4 = (InterfaceC36590y) Router.f46192a.m56192n(InterfaceC36590y.class);
                                Object obj220 = map.get("options");
                                Map map23 = obj220 instanceof Map ? (Map) obj220 : null;
                                Map<String, ? extends Object> mapM57899d19 = map23 != null ? C24053a.m57899d(map23) : null;
                                if (mapM57899d19 != null) {
                                    interfaceC36590y4.mo59669b(context, obj, str, mapM57899d19, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$140
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool18, ProtocolException protocolException) {
                                            invoke2(bool18, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool18, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool18, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": options参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e155) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e155), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "startChangeSite")) {
                            try {
                                InterfaceC36591z interfaceC36591z = (InterfaceC36591z) Router.f46192a.m56192n(InterfaceC36591z.class);
                                Object obj221 = map.get("siteType");
                                String str139 = obj221 instanceof String ? (String) obj221 : null;
                                if (str139 != null) {
                                    interfaceC36591z.mo58121e(context, obj, str, str139, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$141
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool18, ProtocolException protocolException) {
                                            invoke2(bool18, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool18, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool18, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": siteType参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e156) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e156), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "startChangeSiteDirectly")) {
                            try {
                                InterfaceC36591z interfaceC36591z2 = (InterfaceC36591z) Router.f46192a.m56192n(InterfaceC36591z.class);
                                Object obj222 = map.get("siteType");
                                String str140 = obj222 instanceof String ? (String) obj222 : null;
                                if (str140 != null) {
                                    interfaceC36591z2.mo58119c(context, obj, str, str140, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$142
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool18, ProtocolException protocolException) {
                                            invoke2(bool18, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool18, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool18, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": siteType参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e157) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e157), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "isSiteTypeSupport")) {
                            try {
                                InterfaceC36591z interfaceC36591z3 = (InterfaceC36591z) Router.f46192a.m56192n(InterfaceC36591z.class);
                                Object obj223 = map.get("siteType");
                                String str141 = obj223 instanceof String ? (String) obj223 : null;
                                if (str141 != null) {
                                    interfaceC36591z3.mo58118b(context, obj, str, str141, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$143
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool18, ProtocolException protocolException) {
                                            invoke2(bool18, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool18, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool18, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": siteType参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e158) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e158), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getSupportSiteList")) {
                            try {
                                ((InterfaceC36591z) Router.f46192a.m56192n(InterfaceC36591z.class)).mo58123g(context, obj, str, new Function2<List<? extends KCJSApiSiteSupportSiteItem>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$144

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$144$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$144$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24008a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCJSApiSiteSupportSiteItem> list7, ProtocolException protocolException) {
                                        invoke2((List<KCJSApiSiteSupportSiteItem>) list7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable List<KCJSApiSiteSupportSiteItem> list7, @Nullable ProtocolException protocolException) {
                                        String strM66919i;
                                        if (protocolException != null || list7 == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        Function2<Object, ProtocolException, Unit> function4 = function3;
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
                                        for (KCJSApiSiteSupportSiteItem kCJSApiSiteSupportSiteItem : list7) {
                                            String str142 = "";
                                            if (kCJSApiSiteSupportSiteItem != null && (strM66919i = C27099x.m66919i(kCJSApiSiteSupportSiteItem, false, 2, null)) != null) {
                                                str142 = strM66919i;
                                            }
                                            C27099x c27099x = C27099x.f54458a;
                                            arrayList3.add((Map) C27099x.m66914d(str142, new C24008a().getType()));
                                        }
                                        function4.invoke(CollectionsKt.toList(arrayList3), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e159) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e159), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "querySiteVisibleConfig")) {
                            try {
                                InterfaceC36591z interfaceC36591z4 = (InterfaceC36591z) Router.f46192a.m56192n(InterfaceC36591z.class);
                                Object obj224 = map.get("configKey");
                                String str142 = obj224 instanceof String ? (String) obj224 : null;
                                if (str142 != null) {
                                    interfaceC36591z4.mo58120d(context, obj, str, str142, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$145
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool18, ProtocolException protocolException) {
                                            invoke2(bool18, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool18, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool18, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": configKey参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e160) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e160), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "querySiteBizConfig")) {
                            try {
                                InterfaceC36591z interfaceC36591z5 = (InterfaceC36591z) Router.f46192a.m56192n(InterfaceC36591z.class);
                                Object obj225 = map.get("configKey");
                                String str143 = obj225 instanceof String ? (String) obj225 : null;
                                if (str143 != null) {
                                    interfaceC36591z5.mo58117a(context, obj, str, str143, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$146
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str144, ProtocolException protocolException) {
                                            invoke2(str144, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable String str144, @Nullable ProtocolException protocolException) {
                                            function3.invoke(str144, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": configKey参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e161) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e161), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "querySiteExtConfig")) {
                            try {
                                InterfaceC36591z interfaceC36591z6 = (InterfaceC36591z) Router.f46192a.m56192n(InterfaceC36591z.class);
                                Object obj226 = map.get("configType");
                                String str144 = obj226 instanceof String ? (String) obj226 : null;
                                if (str144 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": configType参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj227 = map.get("configKey");
                                String str145 = obj227 instanceof String ? (String) obj227 : null;
                                if (str145 != null) {
                                    interfaceC36591z6.mo58122f(context, obj, str, str144, str145, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$147
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str146, ProtocolException protocolException) {
                                            invoke2(str146, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable String str146, @Nullable ProtocolException protocolException) {
                                            function3.invoke(str146, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": configKey参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e162) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e162), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "createPlainSocketTask")) {
                            try {
                                InterfaceC36561a0 interfaceC36561a3 = (InterfaceC36561a0) Router.f46192a.m56192n(InterfaceC36561a0.class);
                                AbstractC41697j0 abstractC41697j0M94120b3 = C42911a.m94120b();
                                KCJSApiProtocolManager$_exec$task$1 kCJSApiProtocolManager$_exec$task$1 = new KCJSApiProtocolManager$_exec$task$1(map, null);
                                kCJSApiProtocolManager$_exec$2.L$0 = context;
                                kCJSApiProtocolManager$_exec$2.L$1 = obj;
                                kCJSApiProtocolManager$_exec$2.L$2 = str;
                                kCJSApiProtocolManager$_exec$2.L$3 = str38;
                                kCJSApiProtocolManager$_exec$2.L$4 = function3;
                                kCJSApiProtocolManager$_exec$2.L$5 = interfaceC36561a3;
                                kCJSApiProtocolManager$_exec$2.label = 4;
                                Object objM91049g3 = C41686h.m91049g(abstractC41697j0M94120b3, kCJSApiProtocolManager$_exec$task$1, kCJSApiProtocolManager$_exec$2);
                                if (objM91049g3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                interfaceC36561a0 = interfaceC36561a3;
                                context5 = context;
                                obj5 = obj;
                                str32 = str;
                                objM91049g = objM91049g3;
                                kCJSApiSocketJsPlainSocketTaskParams = (KCJSApiSocketJsPlainSocketTaskParams) objM91049g;
                                if (kCJSApiSocketJsPlainSocketTaskParams == null) {
                                    interfaceC36561a0.mo31604c(context5, obj5, str32, kCJSApiSocketJsPlainSocketTaskParams, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$148
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map24, ProtocolException protocolException) {
                                            invoke2(map24, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Map<String, ? extends Object> map24, @Nullable ProtocolException protocolException) {
                                            function3.invoke(map24, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": task参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e163) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e163), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "createPollingSocketTask")) {
                            try {
                                InterfaceC36561a0 interfaceC36561a4 = (InterfaceC36561a0) Router.f46192a.m56192n(InterfaceC36561a0.class);
                                AbstractC41697j0 abstractC41697j0M94120b4 = C42911a.m94120b();
                                KCJSApiProtocolManager$_exec$task$2 kCJSApiProtocolManager$_exec$task$2 = new KCJSApiProtocolManager$_exec$task$2(map, null);
                                kCJSApiProtocolManager$_exec$2.L$0 = context;
                                kCJSApiProtocolManager$_exec$2.L$1 = obj;
                                kCJSApiProtocolManager$_exec$2.L$2 = str;
                                kCJSApiProtocolManager$_exec$2.L$3 = str38;
                                kCJSApiProtocolManager$_exec$2.L$4 = function3;
                                kCJSApiProtocolManager$_exec$2.L$5 = interfaceC36561a4;
                                kCJSApiProtocolManager$_exec$2.label = 5;
                                Object objM91049g4 = C41686h.m91049g(abstractC41697j0M94120b4, kCJSApiProtocolManager$_exec$task$2, kCJSApiProtocolManager$_exec$2);
                                if (objM91049g4 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                interfaceC36561a1 = interfaceC36561a4;
                                context6 = context;
                                obj6 = obj;
                                str33 = str;
                                objM91049g = objM91049g4;
                                kCJSApiSocketJsPollingSocketTaskParams = (KCJSApiSocketJsPollingSocketTaskParams) objM91049g;
                                if (kCJSApiSocketJsPollingSocketTaskParams == null) {
                                    interfaceC36561a1.mo31605d(context6, obj6, str33, kCJSApiSocketJsPollingSocketTaskParams, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$149
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map24, ProtocolException protocolException) {
                                            invoke2(map24, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Map<String, ? extends Object> map24, @Nullable ProtocolException protocolException) {
                                            function3.invoke(map24, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": task参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e164) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e164), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "createHybridSocketHttpTask")) {
                            try {
                                InterfaceC36561a0 interfaceC36561a5 = (InterfaceC36561a0) Router.f46192a.m56192n(InterfaceC36561a0.class);
                                AbstractC41697j0 abstractC41697j0M94120b5 = C42911a.m94120b();
                                KCJSApiProtocolManager$_exec$task$3 kCJSApiProtocolManager$_exec$task$3 = new KCJSApiProtocolManager$_exec$task$3(map, null);
                                kCJSApiProtocolManager$_exec$2.L$0 = context;
                                kCJSApiProtocolManager$_exec$2.L$1 = obj;
                                kCJSApiProtocolManager$_exec$2.L$2 = str;
                                kCJSApiProtocolManager$_exec$2.L$3 = str38;
                                kCJSApiProtocolManager$_exec$2.L$4 = function3;
                                kCJSApiProtocolManager$_exec$2.L$5 = interfaceC36561a5;
                                kCJSApiProtocolManager$_exec$2.label = 6;
                                Object objM91049g5 = C41686h.m91049g(abstractC41697j0M94120b5, kCJSApiProtocolManager$_exec$task$3, kCJSApiProtocolManager$_exec$2);
                                if (objM91049g5 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                interfaceC36561a2 = interfaceC36561a5;
                                context7 = context;
                                obj7 = obj;
                                str34 = str;
                                objM91049g = objM91049g5;
                                kCJSApiSocketJsHybridSocketHttpTaskParams = (KCJSApiSocketJsHybridSocketHttpTaskParams) objM91049g;
                                if (kCJSApiSocketJsHybridSocketHttpTaskParams == null) {
                                    interfaceC36561a2.mo31606e(context7, obj7, str34, kCJSApiSocketJsHybridSocketHttpTaskParams, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$150
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map24, ProtocolException protocolException) {
                                            invoke2(map24, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Map<String, ? extends Object> map24, @Nullable ProtocolException protocolException) {
                                            function3.invoke(map24, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": task参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e165) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e165), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "startTask")) {
                            try {
                                InterfaceC36561a0 interfaceC36561a6 = (InterfaceC36561a0) Router.f46192a.m56192n(InterfaceC36561a0.class);
                                Object obj228 = map.get("pollImmediate");
                                Boolean bool18 = obj228 instanceof Boolean ? (Boolean) obj228 : null;
                                Object obj229 = map.get("pollImmediate");
                                if (bool18 != null || obj229 == null || Intrinsics.areEqual(obj229, JSONObject.NULL)) {
                                    interfaceC36561a6.mo31603b(context, obj, str, bool18, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$151
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map24, ProtocolException protocolException) {
                                            invoke2(map24, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Map<String, ? extends Object> map24, @Nullable ProtocolException protocolException) {
                                            function3.invoke(map24, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": pollImmediate参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e166) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e166), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "pauseTask")) {
                            try {
                                ((InterfaceC36561a0) Router.f46192a.m56192n(InterfaceC36561a0.class)).mo31602a(context, obj, str, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$152
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map24, ProtocolException protocolException) {
                                        invoke2(map24, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Map<String, ? extends Object> map24, @Nullable ProtocolException protocolException) {
                                        function3.invoke(map24, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e167) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e167), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "setItem")) {
                            try {
                                InterfaceC36563b0 interfaceC36563b0 = (InterfaceC36563b0) Router.f46192a.m56192n(InterfaceC36563b0.class);
                                Object obj230 = map.get("key");
                                String str146 = obj230 instanceof String ? (String) obj230 : null;
                                if (str146 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": key参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj231 = map.get("value");
                                if (!C24053a.m57898c(obj231) || obj231 == null) {
                                    obj231 = null;
                                }
                                if (obj231 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": value参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj232 = map.get(Constants.BIZ);
                                String str147 = obj232 instanceof String ? (String) obj232 : null;
                                Object obj233 = map.get(Constants.BIZ);
                                if (str147 != null || obj233 == null || Intrinsics.areEqual(obj233, JSONObject.NULL)) {
                                    interfaceC36563b0.mo31832b(context, obj, str, str146, obj231, str147, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$153
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": biz参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e168) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e168), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getItem")) {
                            try {
                                InterfaceC36563b0 interfaceC36563b1 = (InterfaceC36563b0) Router.f46192a.m56192n(InterfaceC36563b0.class);
                                Object obj234 = map.get("key");
                                String str148 = obj234 instanceof String ? (String) obj234 : null;
                                if (str148 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": key参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj235 = map.get(Constants.BIZ);
                                String str149 = obj235 instanceof String ? (String) obj235 : null;
                                Object obj236 = map.get(Constants.BIZ);
                                if (str149 != null || obj236 == null || Intrinsics.areEqual(obj236, JSONObject.NULL)) {
                                    interfaceC36563b1.mo31834d(context, obj, str, str148, str149, new Function2<Object, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$154
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Object obj237, ProtocolException protocolException) {
                                            invoke2(obj237, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Object obj237, @Nullable ProtocolException protocolException) {
                                            function3.invoke(obj237, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": biz参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e169) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e169), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "removeItem")) {
                            try {
                                InterfaceC36563b0 interfaceC36563b2 = (InterfaceC36563b0) Router.f46192a.m56192n(InterfaceC36563b0.class);
                                Object obj237 = map.get("key");
                                String str150 = obj237 instanceof String ? (String) obj237 : null;
                                if (str150 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": key参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj238 = map.get(Constants.BIZ);
                                String str151 = obj238 instanceof String ? (String) obj238 : null;
                                Object obj239 = map.get(Constants.BIZ);
                                if (str151 != null || obj239 == null || Intrinsics.areEqual(obj239, JSONObject.NULL)) {
                                    interfaceC36563b2.mo31835e(context, obj, str, str150, str151, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$155
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": biz参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e170) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e170), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "containsKey")) {
                            try {
                                InterfaceC36563b0 interfaceC36563b3 = (InterfaceC36563b0) Router.f46192a.m56192n(InterfaceC36563b0.class);
                                Object obj240 = map.get("key");
                                String str152 = obj240 instanceof String ? (String) obj240 : null;
                                if (str152 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": key参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj241 = map.get(Constants.BIZ);
                                String str153 = obj241 instanceof String ? (String) obj241 : null;
                                Object obj242 = map.get(Constants.BIZ);
                                if (str153 != null || obj242 == null || Intrinsics.areEqual(obj242, JSONObject.NULL)) {
                                    interfaceC36563b3.mo31833c(context, obj, str, str152, str153, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$156
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": biz参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e171) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e171), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getAllKeys")) {
                            try {
                                InterfaceC36563b0 interfaceC36563b4 = (InterfaceC36563b0) Router.f46192a.m56192n(InterfaceC36563b0.class);
                                Object obj243 = map.get(Constants.BIZ);
                                String str154 = obj243 instanceof String ? (String) obj243 : null;
                                Object obj244 = map.get(Constants.BIZ);
                                if (str154 != null || obj244 == null || Intrinsics.areEqual(obj244, JSONObject.NULL)) {
                                    interfaceC36563b4.mo31831a(context, obj, str, str154, new Function2<List<? extends String>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$157
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list7, ProtocolException protocolException) {
                                            invoke2((List<String>) list7, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable List<String> list7, @Nullable ProtocolException protocolException) {
                                            function3.invoke(list7, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": biz参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e172) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e172), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "clear")) {
                            try {
                                InterfaceC36563b0 interfaceC36563b5 = (InterfaceC36563b0) Router.f46192a.m56192n(InterfaceC36563b0.class);
                                Object obj245 = map.get(Constants.BIZ);
                                String str155 = obj245 instanceof String ? (String) obj245 : null;
                                Object obj246 = map.get(Constants.BIZ);
                                if (str155 != null || obj246 == null || Intrinsics.areEqual(obj246, JSONObject.NULL)) {
                                    interfaceC36563b5.mo31836f(context, obj, str, str155, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$158
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": biz参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e173) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e173), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getSpotCoinInfo")) {
                            try {
                                InterfaceC36565c0 interfaceC36565c0 = (InterfaceC36565c0) Router.f46192a.m56192n(InterfaceC36565c0.class);
                                Object obj247 = map.get("code");
                                String str156 = obj247 instanceof String ? (String) obj247 : null;
                                if (str156 != null) {
                                    interfaceC36565c0.mo81844g(context, obj, str, str156, new Function2<KCJSApiSymbolsCoinSpotCoinInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$159

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$159$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$159$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24009a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiSymbolsCoinSpotCoinInfo kCJSApiSymbolsCoinSpotCoinInfo, ProtocolException protocolException) {
                                            invoke2(kCJSApiSymbolsCoinSpotCoinInfo, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCJSApiSymbolsCoinSpotCoinInfo kCJSApiSymbolsCoinSpotCoinInfo, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCJSApiSymbolsCoinSpotCoinInfo == null) {
                                                function3.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCJSApiSymbolsCoinSpotCoinInfo, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24009a().getType()), null);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": code参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e174) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e174), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getSpotCoinInfoBatch")) {
                            try {
                                ((InterfaceC36565c0) Router.f46192a.m56192n(InterfaceC36565c0.class)).mo81838a(context, obj, str, new Function2<List<? extends KCJSApiSymbolsCoinSpotCoinInfo>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$160

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$160$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$160$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24010a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCJSApiSymbolsCoinSpotCoinInfo> list7, ProtocolException protocolException) {
                                        invoke2((List<KCJSApiSymbolsCoinSpotCoinInfo>) list7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable List<KCJSApiSymbolsCoinSpotCoinInfo> list7, @Nullable ProtocolException protocolException) {
                                        String strM66919i;
                                        if (protocolException != null || list7 == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        Function2<Object, ProtocolException, Unit> function4 = function3;
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
                                        for (KCJSApiSymbolsCoinSpotCoinInfo kCJSApiSymbolsCoinSpotCoinInfo : list7) {
                                            String str157 = "";
                                            if (kCJSApiSymbolsCoinSpotCoinInfo != null && (strM66919i = C27099x.m66919i(kCJSApiSymbolsCoinSpotCoinInfo, false, 2, null)) != null) {
                                                str157 = strM66919i;
                                            }
                                            C27099x c27099x = C27099x.f54458a;
                                            arrayList3.add((Map) C27099x.m66914d(str157, new C24010a().getType()));
                                        }
                                        function4.invoke(CollectionsKt.toList(arrayList3), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e175) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e175), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getSpotSymbol")) {
                            try {
                                InterfaceC36565c0 interfaceC36565c1 = (InterfaceC36565c0) Router.f46192a.m56192n(InterfaceC36565c0.class);
                                Object obj248 = map.get("code");
                                String str157 = obj248 instanceof String ? (String) obj248 : null;
                                if (str157 != null) {
                                    interfaceC36565c1.mo81843f(context, obj, str, str157, new Function2<KCJSApiSymbolsCoinSpotSymbolInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$161

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$161$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$161$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24011a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiSymbolsCoinSpotSymbolInfo kCJSApiSymbolsCoinSpotSymbolInfo, ProtocolException protocolException) {
                                            invoke2(kCJSApiSymbolsCoinSpotSymbolInfo, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCJSApiSymbolsCoinSpotSymbolInfo kCJSApiSymbolsCoinSpotSymbolInfo, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCJSApiSymbolsCoinSpotSymbolInfo == null) {
                                                function3.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCJSApiSymbolsCoinSpotSymbolInfo, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24011a().getType()), null);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": code参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e176) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e176), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getSpotSymbolBatch")) {
                            try {
                                ((InterfaceC36565c0) Router.f46192a.m56192n(InterfaceC36565c0.class)).mo81839b(context, obj, str, new Function2<List<? extends KCJSApiSymbolsCoinSpotSymbolInfo>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$162

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$162$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$162$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24012a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCJSApiSymbolsCoinSpotSymbolInfo> list7, ProtocolException protocolException) {
                                        invoke2((List<KCJSApiSymbolsCoinSpotSymbolInfo>) list7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable List<KCJSApiSymbolsCoinSpotSymbolInfo> list7, @Nullable ProtocolException protocolException) {
                                        String strM66919i;
                                        if (protocolException != null || list7 == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        Function2<Object, ProtocolException, Unit> function4 = function3;
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
                                        for (KCJSApiSymbolsCoinSpotSymbolInfo kCJSApiSymbolsCoinSpotSymbolInfo : list7) {
                                            String str158 = "";
                                            if (kCJSApiSymbolsCoinSpotSymbolInfo != null && (strM66919i = C27099x.m66919i(kCJSApiSymbolsCoinSpotSymbolInfo, false, 2, null)) != null) {
                                                str158 = strM66919i;
                                            }
                                            C27099x c27099x = C27099x.f54458a;
                                            arrayList3.add((Map) C27099x.m66914d(str158, new C24012a().getType()));
                                        }
                                        function4.invoke(CollectionsKt.toList(arrayList3), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e177) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e177), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getFuturesCoinInfo")) {
                            try {
                                InterfaceC36565c0 interfaceC36565c2 = (InterfaceC36565c0) Router.f46192a.m56192n(InterfaceC36565c0.class);
                                Object obj249 = map.get("code");
                                String str158 = obj249 instanceof String ? (String) obj249 : null;
                                if (str158 != null) {
                                    interfaceC36565c2.mo81840c(context, obj, str, str158, new Function2<KCJSApiSymbolsCoinFuturesCoinInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$163

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$163$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$163$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24013a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiSymbolsCoinFuturesCoinInfo kCJSApiSymbolsCoinFuturesCoinInfo, ProtocolException protocolException) {
                                            invoke2(kCJSApiSymbolsCoinFuturesCoinInfo, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCJSApiSymbolsCoinFuturesCoinInfo kCJSApiSymbolsCoinFuturesCoinInfo, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCJSApiSymbolsCoinFuturesCoinInfo == null) {
                                                function3.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCJSApiSymbolsCoinFuturesCoinInfo, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24013a().getType()), null);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": code参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e178) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e178), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getFuturesCoinInfoBatch")) {
                            try {
                                ((InterfaceC36565c0) Router.f46192a.m56192n(InterfaceC36565c0.class)).mo81846i(context, obj, str, new Function2<List<? extends KCJSApiSymbolsCoinFuturesCoinInfo>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$164

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$164$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$164$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24014a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCJSApiSymbolsCoinFuturesCoinInfo> list7, ProtocolException protocolException) {
                                        invoke2((List<KCJSApiSymbolsCoinFuturesCoinInfo>) list7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable List<KCJSApiSymbolsCoinFuturesCoinInfo> list7, @Nullable ProtocolException protocolException) {
                                        String strM66919i;
                                        if (protocolException != null || list7 == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        Function2<Object, ProtocolException, Unit> function4 = function3;
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
                                        for (KCJSApiSymbolsCoinFuturesCoinInfo kCJSApiSymbolsCoinFuturesCoinInfo : list7) {
                                            String str159 = "";
                                            if (kCJSApiSymbolsCoinFuturesCoinInfo != null && (strM66919i = C27099x.m66919i(kCJSApiSymbolsCoinFuturesCoinInfo, false, 2, null)) != null) {
                                                str159 = strM66919i;
                                            }
                                            C27099x c27099x = C27099x.f54458a;
                                            arrayList3.add((Map) C27099x.m66914d(str159, new C24014a().getType()));
                                        }
                                        function4.invoke(CollectionsKt.toList(arrayList3), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e179) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e179), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getFuturesSymbolInfo")) {
                            try {
                                InterfaceC36565c0 interfaceC36565c3 = (InterfaceC36565c0) Router.f46192a.m56192n(InterfaceC36565c0.class);
                                Object obj250 = map.get("code");
                                String str159 = obj250 instanceof String ? (String) obj250 : null;
                                if (str159 != null) {
                                    interfaceC36565c3.mo81841d(context, obj, str, str159, new Function2<KCJSApiSymbolsCoinFuturesSymbolInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$165

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$165$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$165$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24015a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiSymbolsCoinFuturesSymbolInfo kCJSApiSymbolsCoinFuturesSymbolInfo, ProtocolException protocolException) {
                                            invoke2(kCJSApiSymbolsCoinFuturesSymbolInfo, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCJSApiSymbolsCoinFuturesSymbolInfo kCJSApiSymbolsCoinFuturesSymbolInfo, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCJSApiSymbolsCoinFuturesSymbolInfo == null) {
                                                function3.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCJSApiSymbolsCoinFuturesSymbolInfo, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24015a().getType()), null);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": code参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e180) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e180), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getFuturesDisplayInfo")) {
                            try {
                                InterfaceC36565c0 interfaceC36565c4 = (InterfaceC36565c0) Router.f46192a.m56192n(InterfaceC36565c0.class);
                                Object obj251 = map.get("symbol");
                                String str160 = obj251 instanceof String ? (String) obj251 : null;
                                if (str160 != null) {
                                    interfaceC36565c4.mo81845h(context, obj, str, str160, new Function2<KCJSApiSymbolsCoinFuturesDisplayInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$166

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$166$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$166$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24016a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiSymbolsCoinFuturesDisplayInfo kCJSApiSymbolsCoinFuturesDisplayInfo, ProtocolException protocolException) {
                                            invoke2(kCJSApiSymbolsCoinFuturesDisplayInfo, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCJSApiSymbolsCoinFuturesDisplayInfo kCJSApiSymbolsCoinFuturesDisplayInfo, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCJSApiSymbolsCoinFuturesDisplayInfo == null) {
                                                function3.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCJSApiSymbolsCoinFuturesDisplayInfo, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24016a().getType()), null);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e181) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e181), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getFuturesSymbolInfoBatch")) {
                            try {
                                ((InterfaceC36565c0) Router.f46192a.m56192n(InterfaceC36565c0.class)).mo81842e(context, obj, str, new Function2<List<? extends KCJSApiSymbolsCoinFuturesSymbolInfo>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$167

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$167$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$167$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24017a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCJSApiSymbolsCoinFuturesSymbolInfo> list7, ProtocolException protocolException) {
                                        invoke2((List<KCJSApiSymbolsCoinFuturesSymbolInfo>) list7, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable List<KCJSApiSymbolsCoinFuturesSymbolInfo> list7, @Nullable ProtocolException protocolException) {
                                        String strM66919i;
                                        if (protocolException != null || list7 == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        Function2<Object, ProtocolException, Unit> function4 = function3;
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
                                        for (KCJSApiSymbolsCoinFuturesSymbolInfo kCJSApiSymbolsCoinFuturesSymbolInfo : list7) {
                                            String str161 = "";
                                            if (kCJSApiSymbolsCoinFuturesSymbolInfo != null && (strM66919i = C27099x.m66919i(kCJSApiSymbolsCoinFuturesSymbolInfo, false, 2, null)) != null) {
                                                str161 = strM66919i;
                                            }
                                            C27099x c27099x = C27099x.f54458a;
                                            arrayList3.add((Map) C27099x.m66914d(str161, new C24017a().getType()));
                                        }
                                        function4.invoke(CollectionsKt.toList(arrayList3), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e182) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e182), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "afTrack")) {
                            try {
                                InterfaceC36567d0 interfaceC36567d0 = (InterfaceC36567d0) Router.f46192a.m56192n(InterfaceC36567d0.class);
                                Object obj252 = map.get("eventId");
                                String str161 = obj252 instanceof String ? (String) obj252 : null;
                                if (str161 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": eventId参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj253 = map.get(ReportDataTable.COLUMN_PARAMS);
                                String str162 = obj253 instanceof String ? (String) obj253 : null;
                                Object obj254 = map.get(ReportDataTable.COLUMN_PARAMS);
                                if (str162 != null || obj254 == null || Intrinsics.areEqual(obj254, JSONObject.NULL)) {
                                    interfaceC36567d0.mo81849c(context, obj, str, str161, str162, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$168
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": params参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e183) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e183), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "kunlunTrack")) {
                            try {
                                InterfaceC36567d0 interfaceC36567d1 = (InterfaceC36567d0) Router.f46192a.m56192n(InterfaceC36567d0.class);
                                Object obj255 = map.get("eventName");
                                String str163 = obj255 instanceof String ? (String) obj255 : null;
                                if (str163 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": eventName参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj256 = map.get("dimensions");
                                Map map24 = obj256 instanceof Map ? (Map) obj256 : null;
                                Map<String, ? extends Object> mapM57899d20 = map24 != null ? C24053a.m57899d(map24) : null;
                                Object obj257 = map.get("dimensions");
                                if (mapM57899d20 == null && obj257 != null && !Intrinsics.areEqual(obj257, JSONObject.NULL)) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": dimensions参数类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj258 = map.get(C33675gh.f70007m);
                                Map map25 = obj258 instanceof Map ? (Map) obj258 : null;
                                Map<String, ? extends Object> mapM57899d21 = map25 != null ? C24053a.m57899d(map25) : null;
                                Object obj259 = map.get(C33675gh.f70007m);
                                if (mapM57899d21 != null || obj259 == null || Intrinsics.areEqual(obj259, JSONObject.NULL)) {
                                    interfaceC36567d1.mo81850d(context, obj, str, str163, mapM57899d20, mapM57899d21, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$169
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": metrics参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e184) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e184), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "kunlunEventTrack")) {
                            try {
                                InterfaceC36567d0 interfaceC36567d2 = (InterfaceC36567d0) Router.f46192a.m56192n(InterfaceC36567d0.class);
                                Object obj260 = map.get("eventName");
                                String str164 = obj260 instanceof String ? (String) obj260 : null;
                                if (str164 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": eventName参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj261 = map.get("category");
                                String str165 = obj261 instanceof String ? (String) obj261 : null;
                                if (str165 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": category参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj262 = map.get("code");
                                Number number13 = obj262 instanceof Number ? (Number) obj262 : null;
                                Long lBoxLong11 = number13 != null ? Boxing.boxLong(number13.longValue()) : null;
                                if (lBoxLong11 != null) {
                                    interfaceC36567d2.mo81847a(context, obj, str, str164, str165, lBoxLong11.longValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$170
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": code参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e185) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e185), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "kunlunBizTrack")) {
                            try {
                                InterfaceC36567d0 interfaceC36567d3 = (InterfaceC36567d0) Router.f46192a.m56192n(InterfaceC36567d0.class);
                                Object obj263 = map.get("category");
                                String str166 = obj263 instanceof String ? (String) obj263 : null;
                                if (str166 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": category参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj264 = map.get("code");
                                Number number14 = obj264 instanceof Number ? (Number) obj264 : null;
                                Long lBoxLong12 = number14 != null ? Boxing.boxLong(number14.longValue()) : null;
                                if (lBoxLong12 != null) {
                                    interfaceC36567d3.mo81855i(context, obj, str, str166, lBoxLong12.longValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$171
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": code参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e186) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e186), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "kunlunTechTrack")) {
                            try {
                                InterfaceC36567d0 interfaceC36567d4 = (InterfaceC36567d0) Router.f46192a.m56192n(InterfaceC36567d0.class);
                                Object obj265 = map.get("category");
                                String str167 = obj265 instanceof String ? (String) obj265 : null;
                                if (str167 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": category参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj266 = map.get("code");
                                Number number15 = obj266 instanceof Number ? (Number) obj266 : null;
                                Long lBoxLong13 = number15 != null ? Boxing.boxLong(number15.longValue()) : null;
                                if (lBoxLong13 != null) {
                                    interfaceC36567d4.mo81851e(context, obj, str, str167, lBoxLong13.longValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$172
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": code参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e187) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e187), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "setKunlunMonitorApis")) {
                            try {
                                InterfaceC36567d0 interfaceC36567d5 = (InterfaceC36567d0) Router.f46192a.m56192n(InterfaceC36567d0.class);
                                Object obj267 = map.get("apiList");
                                List<String> list7 = obj267 instanceof List ? (List) obj267 : null;
                                if (list7 != null) {
                                    interfaceC36567d5.mo81853g(context, obj, str, list7, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$173
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": apiList参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e188) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e188), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "kunlunLog")) {
                            try {
                                InterfaceC36567d0 interfaceC36567d6 = (InterfaceC36567d0) Router.f46192a.m56192n(InterfaceC36567d0.class);
                                Object obj268 = map.get("message");
                                String str168 = obj268 instanceof String ? (String) obj268 : null;
                                if (str168 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": message参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj269 = map.get(FirebaseAnalytics.Param.LEVEL);
                                String str169 = obj269 instanceof String ? (String) obj269 : null;
                                Object obj270 = map.get(FirebaseAnalytics.Param.LEVEL);
                                if (str169 == null && obj270 != null && !Intrinsics.areEqual(obj270, JSONObject.NULL)) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": level参数类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj271 = map.get("tag");
                                String str170 = obj271 instanceof String ? (String) obj271 : null;
                                Object obj272 = map.get("tag");
                                if (str170 != null || obj272 == null || Intrinsics.areEqual(obj272, JSONObject.NULL)) {
                                    interfaceC36567d6.mo81856j(context, obj, str, str168, str169, str170, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$174
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": tag参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e189) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e189), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "clsTrack")) {
                            try {
                                InterfaceC36567d0 interfaceC36567d7 = (InterfaceC36567d0) Router.f46192a.m56192n(InterfaceC36567d0.class);
                                Object obj273 = map.get("content");
                                String str171 = obj273 instanceof String ? (String) obj273 : null;
                                if (str171 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": content参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj274 = map.get("dimensions");
                                Map map26 = obj274 instanceof Map ? (Map) obj274 : null;
                                Map<String, ? extends Object> mapM57899d22 = map26 != null ? C24053a.m57899d(map26) : null;
                                Object obj275 = map.get("dimensions");
                                if (mapM57899d22 != null || obj275 == null || Intrinsics.areEqual(obj275, JSONObject.NULL)) {
                                    interfaceC36567d7.mo81857k(context, obj, str, str171, mapM57899d22, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$175
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": dimensions参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e190) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e190), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "fbTrack")) {
                            try {
                                InterfaceC36567d0 interfaceC36567d8 = (InterfaceC36567d0) Router.f46192a.m56192n(InterfaceC36567d0.class);
                                Object obj276 = map.get("eventName");
                                String str172 = obj276 instanceof String ? (String) obj276 : null;
                                if (str172 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": eventName参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj277 = map.get(ReportDataTable.COLUMN_PARAMS);
                                Map map27 = obj277 instanceof Map ? (Map) obj277 : null;
                                Map<String, ? extends Object> mapM57899d23 = map27 != null ? C24053a.m57899d(map27) : null;
                                Object obj278 = map.get(ReportDataTable.COLUMN_PARAMS);
                                if (mapM57899d23 != null || obj278 == null || Intrinsics.areEqual(obj278, JSONObject.NULL)) {
                                    interfaceC36567d8.mo81852f(context, obj, str, str172, mapM57899d23, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$176
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": params参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e191) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e191), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "firebaseTrack")) {
                            try {
                                InterfaceC36567d0 interfaceC36567d9 = (InterfaceC36567d0) Router.f46192a.m56192n(InterfaceC36567d0.class);
                                Object obj279 = map.get("eventName");
                                String str173 = obj279 instanceof String ? (String) obj279 : null;
                                if (str173 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": eventName参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj280 = map.get(ReportDataTable.COLUMN_PARAMS);
                                Map map28 = obj280 instanceof Map ? (Map) obj280 : null;
                                Map<String, ? extends Object> mapM57899d24 = map28 != null ? C24053a.m57899d(map28) : null;
                                Object obj281 = map.get(ReportDataTable.COLUMN_PARAMS);
                                if (mapM57899d24 != null || obj281 == null || Intrinsics.areEqual(obj281, JSONObject.NULL)) {
                                    interfaceC36567d9.mo81854h(context, obj, str, str173, mapM57899d24, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$177
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": params参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e192) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e192), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "firebaseAddBreadcrumb")) {
                            try {
                                InterfaceC36567d0 interfaceC36567d10 = (InterfaceC36567d0) Router.f46192a.m56192n(InterfaceC36567d0.class);
                                Object obj282 = map.get("message");
                                String str174 = obj282 instanceof String ? (String) obj282 : null;
                                if (str174 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": message参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj283 = map.get("category");
                                String str175 = obj283 instanceof String ? (String) obj283 : null;
                                Object obj284 = map.get("category");
                                if (str175 != null || obj284 == null || Intrinsics.areEqual(obj284, JSONObject.NULL)) {
                                    interfaceC36567d10.mo81848b(context, obj, str, str174, str175, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$178
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": category参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e193) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e193), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "isUtaGray")) {
                            try {
                                ((InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class)).mo31588h(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$179
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                        invoke2(bool19, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool19, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e194) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e194), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "isUtaHasOpend")) {
                            try {
                                ((InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class)).mo31585e(context, obj, str, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$180
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                        invoke2(bool19, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                        function3.invoke(bool19, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e195) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e195), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "openOrderDetail")) {
                            try {
                                InterfaceC36569e0 interfaceC36569e3 = (InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class);
                                Object obj285 = map.get("orderId");
                                String str176 = obj285 instanceof String ? (String) obj285 : null;
                                if (str176 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": orderId参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj286 = map.get("symbol");
                                String str177 = obj286 instanceof String ? (String) obj286 : null;
                                if (str177 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj287 = map.get("bussinesType");
                                String str178 = obj287 instanceof String ? (String) obj287 : null;
                                if (str178 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": bussinesType参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj288 = map.get("content");
                                String str179 = obj288 instanceof String ? (String) obj288 : null;
                                if (str179 != null) {
                                    interfaceC36569e3.mo31587g(context, obj, str, str176, str177, str178, str179, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$181
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool19, ProtocolException protocolException) {
                                            invoke2(bool19, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool19, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool19, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": content参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e196) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e196), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "openNativeMarketsSymbolDialog")) {
                            try {
                                InterfaceC36569e0 interfaceC36569e4 = (InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class);
                                Object obj289 = map.get("level1");
                                String str180 = obj289 instanceof String ? (String) obj289 : null;
                                Object obj290 = map.get("level1");
                                if (str180 == null && obj290 != null && !Intrinsics.areEqual(obj290, JSONObject.NULL)) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": level1参数类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj291 = map.get("level2");
                                String str181 = obj291 instanceof String ? (String) obj291 : null;
                                Object obj292 = map.get("level2");
                                if (str181 == null && obj292 != null && !Intrinsics.areEqual(obj292, JSONObject.NULL)) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": level2参数类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj293 = map.get("level3");
                                String str182 = obj293 instanceof String ? (String) obj293 : null;
                                Object obj294 = map.get("level3");
                                if (str182 == null && obj294 != null && !Intrinsics.areEqual(obj294, JSONObject.NULL)) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": level3参数类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj295 = map.get("data");
                                Map map29 = obj295 instanceof Map ? (Map) obj295 : null;
                                Map<String, ? extends Object> mapM57899d25 = map29 != null ? C24053a.m57899d(map29) : null;
                                Object obj296 = map.get("data");
                                if (mapM57899d25 != null || obj296 == null || Intrinsics.areEqual(obj296, JSONObject.NULL)) {
                                    interfaceC36569e4.mo31590j(context, obj, str, str180, str181, str182, mapM57899d25, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$182
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str183, ProtocolException protocolException) {
                                            invoke2(str183, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable String str183, @Nullable ProtocolException protocolException) {
                                            function3.invoke(str183, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": data参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e197) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e197), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getContractTradeUnit")) {
                            try {
                                ((InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class)).mo31591k(context, obj, str, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$183
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(String str183, ProtocolException protocolException) {
                                        invoke2(str183, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable String str183, @Nullable ProtocolException protocolException) {
                                        function3.invoke(str183, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e198) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e198), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getAlphaCurrencyInfo")) {
                            try {
                                InterfaceC36569e0 interfaceC36569e5 = (InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class);
                                Object obj297 = map.get("currencySeq");
                                Number number16 = obj297 instanceof Number ? (Number) obj297 : null;
                                Long lBoxLong14 = number16 != null ? Boxing.boxLong(number16.longValue()) : null;
                                if (lBoxLong14 == null) {
                                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": currencySeq参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj298 = map.get("quoteCurrency");
                                Boolean bool19 = obj298 instanceof Boolean ? (Boolean) obj298 : null;
                                if (bool19 != null) {
                                    interfaceC36569e5.mo31594n(context, obj, str, lBoxLong14.longValue(), bool19.booleanValue(), new Function2<KCJSApiTradeAlphaCurrencyInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$184

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$184$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$184$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24018a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiTradeAlphaCurrencyInfo kCJSApiTradeAlphaCurrencyInfo, ProtocolException protocolException) {
                                            invoke2(kCJSApiTradeAlphaCurrencyInfo, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCJSApiTradeAlphaCurrencyInfo kCJSApiTradeAlphaCurrencyInfo, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCJSApiTradeAlphaCurrencyInfo == null) {
                                                function3.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCJSApiTradeAlphaCurrencyInfo, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24018a().getType()), null);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": quoteCurrency参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e199) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e199), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getAlphaCurrencyInfoBatch")) {
                            try {
                                ((InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class)).mo31582b(context, obj, str, new Function2<List<? extends KCJSApiTradeAlphaCurrencyInfo>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$185

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$185$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$185$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24019a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCJSApiTradeAlphaCurrencyInfo> list8, ProtocolException protocolException) {
                                        invoke2((List<KCJSApiTradeAlphaCurrencyInfo>) list8, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable List<KCJSApiTradeAlphaCurrencyInfo> list8, @Nullable ProtocolException protocolException) {
                                        String strM66919i;
                                        if (protocolException != null || list8 == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        Function2<Object, ProtocolException, Unit> function4 = function3;
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list8, 10));
                                        for (KCJSApiTradeAlphaCurrencyInfo kCJSApiTradeAlphaCurrencyInfo : list8) {
                                            String str183 = "";
                                            if (kCJSApiTradeAlphaCurrencyInfo != null && (strM66919i = C27099x.m66919i(kCJSApiTradeAlphaCurrencyInfo, false, 2, null)) != null) {
                                                str183 = strM66919i;
                                            }
                                            C27099x c27099x = C27099x.f54458a;
                                            arrayList3.add((Map) C27099x.m66914d(str183, new C24019a().getType()));
                                        }
                                        function4.invoke(CollectionsKt.toList(arrayList3), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e200) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e200), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getIsolatedMarginConfig")) {
                            try {
                                InterfaceC36569e0 interfaceC36569e6 = (InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class);
                                Object obj299 = map.get("symbol");
                                if (obj299 instanceof String) {
                                    str35 = (String) obj299;
                                    interfaceC36569e0 = interfaceC36569e6;
                                } else {
                                    interfaceC36569e0 = interfaceC36569e6;
                                    str35 = null;
                                }
                                if (str35 != null) {
                                    interfaceC36569e0.mo31583c(context, obj, str, str35, new Function2<KCJSApiTradeIsolatedMarginConfig, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$186

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$186$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$186$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24020a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiTradeIsolatedMarginConfig kCJSApiTradeIsolatedMarginConfig, ProtocolException protocolException) {
                                            invoke2(kCJSApiTradeIsolatedMarginConfig, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCJSApiTradeIsolatedMarginConfig kCJSApiTradeIsolatedMarginConfig, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCJSApiTradeIsolatedMarginConfig == null) {
                                                function3.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCJSApiTradeIsolatedMarginConfig, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24020a().getType()), null);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e201) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e201), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getIsolatedMarginConfigBatch")) {
                            try {
                                ((InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class)).mo31581a(context, obj, str, new Function2<List<? extends KCJSApiTradeIsolatedMarginConfig>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$187

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$187$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$187$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24021a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCJSApiTradeIsolatedMarginConfig> list8, ProtocolException protocolException) {
                                        invoke2((List<KCJSApiTradeIsolatedMarginConfig>) list8, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable List<KCJSApiTradeIsolatedMarginConfig> list8, @Nullable ProtocolException protocolException) {
                                        String strM66919i;
                                        if (protocolException != null || list8 == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        Function2<Object, ProtocolException, Unit> function4 = function3;
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list8, 10));
                                        for (KCJSApiTradeIsolatedMarginConfig kCJSApiTradeIsolatedMarginConfig : list8) {
                                            String str183 = "";
                                            if (kCJSApiTradeIsolatedMarginConfig != null && (strM66919i = C27099x.m66919i(kCJSApiTradeIsolatedMarginConfig, false, 2, null)) != null) {
                                                str183 = strM66919i;
                                            }
                                            C27099x c27099x = C27099x.f54458a;
                                            arrayList3.add((Map) C27099x.m66914d(str183, new C24021a().getType()));
                                        }
                                        function4.invoke(CollectionsKt.toList(arrayList3), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e202) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e202), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getMarginCurrencyList")) {
                            try {
                                ((InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class)).mo31592l(context, obj, str, new Function2<List<? extends KCJSApiTradeMarginCurrency>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$188

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$188$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$188$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24022a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCJSApiTradeMarginCurrency> list8, ProtocolException protocolException) {
                                        invoke2((List<KCJSApiTradeMarginCurrency>) list8, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable List<KCJSApiTradeMarginCurrency> list8, @Nullable ProtocolException protocolException) {
                                        String strM66919i;
                                        if (protocolException != null || list8 == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        Function2<Object, ProtocolException, Unit> function4 = function3;
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list8, 10));
                                        for (KCJSApiTradeMarginCurrency kCJSApiTradeMarginCurrency : list8) {
                                            String str183 = "";
                                            if (kCJSApiTradeMarginCurrency != null && (strM66919i = C27099x.m66919i(kCJSApiTradeMarginCurrency, false, 2, null)) != null) {
                                                str183 = strM66919i;
                                            }
                                            C27099x c27099x = C27099x.f54458a;
                                            arrayList3.add((Map) C27099x.m66914d(str183, new C24022a().getType()));
                                        }
                                        function4.invoke(CollectionsKt.toList(arrayList3), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e203) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e203), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getMarginConfig")) {
                            try {
                                ((InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class)).mo31593m(context, obj, str, new Function2<KCJSApiTradeMarginConfig, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$189

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$189$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$189$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24023a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(KCJSApiTradeMarginConfig kCJSApiTradeMarginConfig, ProtocolException protocolException) {
                                        invoke2(kCJSApiTradeMarginConfig, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable KCJSApiTradeMarginConfig kCJSApiTradeMarginConfig, @Nullable ProtocolException protocolException) {
                                        if (protocolException != null || kCJSApiTradeMarginConfig == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        String strM66919i = C27099x.m66919i(kCJSApiTradeMarginConfig, false, 2, null);
                                        if (strM66919i == null) {
                                            strM66919i = "";
                                        }
                                        function3.invoke((Map) C27099x.m66914d(strM66919i, new C24023a().getType()), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e204) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e204), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getMarginCurrency")) {
                            try {
                                InterfaceC36569e0 interfaceC36569e7 = (InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class);
                                Object obj300 = map.get(FirebaseAnalytics.Param.CURRENCY);
                                if (obj300 instanceof String) {
                                    str36 = (String) obj300;
                                    interfaceC36569e1 = interfaceC36569e7;
                                } else {
                                    interfaceC36569e1 = interfaceC36569e7;
                                    str36 = null;
                                }
                                if (str36 != null) {
                                    interfaceC36569e1.mo31595o(context, obj, str, str36, new Function2<KCJSApiTradeMarginCurrency, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$190

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$190$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$190$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24024a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiTradeMarginCurrency kCJSApiTradeMarginCurrency, ProtocolException protocolException) {
                                            invoke2(kCJSApiTradeMarginCurrency, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCJSApiTradeMarginCurrency kCJSApiTradeMarginCurrency, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCJSApiTradeMarginCurrency == null) {
                                                function3.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCJSApiTradeMarginCurrency, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24024a().getType()), null);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": currency参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e205) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e205), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "fetchMarginCurrency")) {
                            try {
                                InterfaceC36569e0 interfaceC36569e8 = (InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class);
                                Object obj301 = map.get(FirebaseAnalytics.Param.CURRENCY);
                                String str183 = obj301 instanceof String ? (String) obj301 : null;
                                if (str183 != null) {
                                    interfaceC36569e8.mo31586f(context, obj, str, str183, new Function2<KCJSApiTradeMarginCurrency, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$191

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$191$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$191$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24025a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiTradeMarginCurrency kCJSApiTradeMarginCurrency, ProtocolException protocolException) {
                                            invoke2(kCJSApiTradeMarginCurrency, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCJSApiTradeMarginCurrency kCJSApiTradeMarginCurrency, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCJSApiTradeMarginCurrency == null) {
                                                function3.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCJSApiTradeMarginCurrency, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24025a().getType()), null);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": currency参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e206) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e206), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "fetchSymbolOfflineInfoList")) {
                            try {
                                ((InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class)).mo31589i(context, obj, str, new Function2<List<? extends KCJSApiTradeSymbolOfflineInfo>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$192

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$192$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$192$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24026a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCJSApiTradeSymbolOfflineInfo> list8, ProtocolException protocolException) {
                                        invoke2((List<KCJSApiTradeSymbolOfflineInfo>) list8, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable List<KCJSApiTradeSymbolOfflineInfo> list8, @Nullable ProtocolException protocolException) {
                                        String strM66919i;
                                        if (protocolException != null || list8 == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        Function2<Object, ProtocolException, Unit> function4 = function3;
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list8, 10));
                                        for (KCJSApiTradeSymbolOfflineInfo kCJSApiTradeSymbolOfflineInfo : list8) {
                                            String str184 = "";
                                            if (kCJSApiTradeSymbolOfflineInfo != null && (strM66919i = C27099x.m66919i(kCJSApiTradeSymbolOfflineInfo, false, 2, null)) != null) {
                                                str184 = strM66919i;
                                            }
                                            C27099x c27099x = C27099x.f54458a;
                                            arrayList3.add((Map) C27099x.m66914d(str184, new C24026a().getType()));
                                        }
                                        function4.invoke(CollectionsKt.toList(arrayList3), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e207) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e207), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getSymbolOfflineInfo")) {
                            try {
                                InterfaceC36569e0 interfaceC36569e9 = (InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class);
                                Object obj302 = map.get("symbol");
                                if (obj302 instanceof String) {
                                    str37 = (String) obj302;
                                    interfaceC36569e2 = interfaceC36569e9;
                                } else {
                                    interfaceC36569e2 = interfaceC36569e9;
                                    str37 = null;
                                }
                                if (str37 != null) {
                                    interfaceC36569e2.mo31584d(context, obj, str, str37, new Function2<KCJSApiTradeSymbolOfflineInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$193

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$193$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$193$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24027a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiTradeSymbolOfflineInfo kCJSApiTradeSymbolOfflineInfo, ProtocolException protocolException) {
                                            invoke2(kCJSApiTradeSymbolOfflineInfo, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCJSApiTradeSymbolOfflineInfo kCJSApiTradeSymbolOfflineInfo, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCJSApiTradeSymbolOfflineInfo == null) {
                                                function3.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCJSApiTradeSymbolOfflineInfo, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24027a().getType()), null);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e208) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e208), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "getUserInfo")) {
                            try {
                                ((InterfaceC36571f0) Router.f46192a.m56192n(InterfaceC36571f0.class)).mo65552c(context, obj, str, new Function2<KCJSApiUserCenterUserInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$194

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$194$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$194$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24028a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(KCJSApiUserCenterUserInfo kCJSApiUserCenterUserInfo, ProtocolException protocolException) {
                                        invoke2(kCJSApiUserCenterUserInfo, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable KCJSApiUserCenterUserInfo kCJSApiUserCenterUserInfo, @Nullable ProtocolException protocolException) {
                                        if (protocolException != null || kCJSApiUserCenterUserInfo == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        String strM66919i = C27099x.m66919i(kCJSApiUserCenterUserInfo, false, 2, null);
                                        if (strM66919i == null) {
                                            strM66919i = "";
                                        }
                                        function3.invoke((Map) C27099x.m66914d(strM66919i, new C24028a().getType()), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            } catch (Exception e209) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e209), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (Intrinsics.areEqual(str38, "gotoCheckLoginPage")) {
                            try {
                                InterfaceC36571f0 interfaceC36571f0 = (InterfaceC36571f0) Router.f46192a.m56192n(InterfaceC36571f0.class);
                                Object obj303 = map.get("spmId");
                                String str184 = obj303 instanceof String ? (String) obj303 : null;
                                Object obj304 = map.get("spmId");
                                if (str184 != null || obj304 == null || Intrinsics.areEqual(obj304, JSONObject.NULL)) {
                                    interfaceC36571f0.mo65550a(context, obj, str, str184, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$195
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool20, ProtocolException protocolException) {
                                            invoke2(bool20, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Boolean bool20, @Nullable ProtocolException protocolException) {
                                            function3.invoke(bool20, protocolException);
                                        }
                                    });
                                    return Unit.INSTANCE;
                                }
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": spmId参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            } catch (Exception e210) {
                                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e210), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        if (!Intrinsics.areEqual(str38, "getTradePwd")) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 该协议方法在端上不存在实现"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        try {
                            InterfaceC36571f0 interfaceC36571f1 = (InterfaceC36571f0) Router.f46192a.m56192n(InterfaceC36571f0.class);
                            Object obj305 = map.get("url");
                            String str185 = obj305 instanceof String ? (String) obj305 : null;
                            Object obj306 = map.get("url");
                            if (str185 == null && obj306 != null && !Intrinsics.areEqual(obj306, JSONObject.NULL)) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": url参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj307 = map.get("bizType");
                            String str186 = obj307 instanceof String ? (String) obj307 : null;
                            Object obj308 = map.get("bizType");
                            if (str186 == null && obj308 != null && !Intrinsics.areEqual(obj308, JSONObject.NULL)) {
                                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": bizType参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj309 = map.get("h5Type");
                            String str187 = obj309 instanceof String ? (String) obj309 : null;
                            Object obj310 = map.get("h5Type");
                            if (str187 != null || obj310 == null || Intrinsics.areEqual(obj310, JSONObject.NULL)) {
                                interfaceC36571f1.mo65551b(context, obj, str, str185, str186, str187, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$196
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(String str188, ProtocolException protocolException) {
                                        invoke2(str188, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable String str188, @Nullable ProtocolException protocolException) {
                                        function3.invoke(str188, protocolException);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": h5Type参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        } catch (Exception e211) {
                            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e211), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                    try {
                        InterfaceC36581p interfaceC36581p19 = (InterfaceC36581p) Router.f46192a.m56192n(InterfaceC36581p.class);
                        AbstractC41697j0 abstractC41697j0M94120b6 = C42911a.m94120b();
                        KCJSApiProtocolManager$_exec$request$1 kCJSApiProtocolManager$_exec$request$1 = new KCJSApiProtocolManager$_exec$request$1(map, null);
                        kCJSApiProtocolManager$_exec$2.L$0 = context;
                        kCJSApiProtocolManager$_exec$2.L$1 = obj;
                        kCJSApiProtocolManager$_exec$2.L$2 = str;
                        kCJSApiProtocolManager$_exec$2.L$3 = str38;
                        kCJSApiProtocolManager$_exec$2.L$4 = function3;
                        kCJSApiProtocolManager$_exec$2.L$5 = interfaceC36581p19;
                        kCJSApiProtocolManager$_exec$2.label = 2;
                        Object objM91049g6 = C41686h.m91049g(abstractC41697j0M94120b6, kCJSApiProtocolManager$_exec$request$1, kCJSApiProtocolManager$_exec$2);
                        if (objM91049g6 != coroutine_suspended) {
                            interfaceC36581p = interfaceC36581p19;
                            obj3 = obj;
                            context3 = context;
                            str20 = str;
                            objM91049g = objM91049g6;
                            kCJSApiPaymentFastTradeGooglePayRequest = (KCJSApiPaymentFastTradeGooglePayRequest) objM91049g;
                            if (kCJSApiPaymentFastTradeGooglePayRequest == null) {
                                interfaceC36581p.mo49487m(context3, obj3, str20, kCJSApiPaymentFastTradeGooglePayRequest, new Function2<KCJSApiPaymentFastTradeGooglePayPayload, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$95

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$95$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$95$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24040a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(KCJSApiPaymentFastTradeGooglePayPayload kCJSApiPaymentFastTradeGooglePayPayload, ProtocolException protocolException) {
                                        invoke2(kCJSApiPaymentFastTradeGooglePayPayload, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable KCJSApiPaymentFastTradeGooglePayPayload kCJSApiPaymentFastTradeGooglePayPayload, @Nullable ProtocolException protocolException) {
                                        if (protocolException != null || kCJSApiPaymentFastTradeGooglePayPayload == null) {
                                            function3.invoke(null, protocolException);
                                            return;
                                        }
                                        String strM66919i = C27099x.m66919i(kCJSApiPaymentFastTradeGooglePayPayload, false, 2, null);
                                        if (strM66919i == null) {
                                            strM66919i = "";
                                        }
                                        function3.invoke((Map) C27099x.m66914d(strM66919i, new C24040a().getType()), null);
                                    }
                                });
                                return Unit.INSTANCE;
                            }
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": request参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    } catch (Exception e212) {
                        function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str38 + ": 没有找到对应实现, " + e212), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 1:
                InterfaceC36575j interfaceC36575j5 = (InterfaceC36575j) kCJSApiProtocolManager$_exec$2.L$5;
                Function2<Object, ? super ProtocolException, Unit> function4 = (Function2) kCJSApiProtocolManager$_exec$2.L$4;
                String str188 = (String) kCJSApiProtocolManager$_exec$2.L$3;
                String str189 = (String) kCJSApiProtocolManager$_exec$2.L$2;
                Object obj311 = kCJSApiProtocolManager$_exec$2.L$1;
                Context context8 = (Context) kCJSApiProtocolManager$_exec$2.L$0;
                ResultKt.throwOnFailure(objM91049g);
                function3 = function4;
                str38 = str188;
                interfaceC36575j = interfaceC36575j5;
                context2 = context8;
                str12 = str189;
                obj2 = obj311;
                kCJSApiKrnSocketConfig = (KCJSApiKrnSocketConfig) objM91049g;
                if (kCJSApiKrnSocketConfig == null) {
                    interfaceC36575j.mo31720b(context2, obj2, str12, kCJSApiKrnSocketConfig, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$67
                        @Override // p852kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(String str710, ProtocolException protocolException) {
                            invoke2(str710, protocolException);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@Nullable String str710, @Nullable ProtocolException protocolException) {
                            function3.invoke(str710, protocolException);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": config参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            case 2:
                InterfaceC36581p interfaceC36581p20 = (InterfaceC36581p) kCJSApiProtocolManager$_exec$2.L$5;
                Function2<Object, ? super ProtocolException, Unit> function5 = (Function2) kCJSApiProtocolManager$_exec$2.L$4;
                String str190 = (String) kCJSApiProtocolManager$_exec$2.L$3;
                String str191 = (String) kCJSApiProtocolManager$_exec$2.L$2;
                Object obj312 = kCJSApiProtocolManager$_exec$2.L$1;
                Context context9 = (Context) kCJSApiProtocolManager$_exec$2.L$0;
                ResultKt.throwOnFailure(objM91049g);
                function3 = function5;
                str38 = str190;
                context3 = context9;
                str20 = str191;
                obj3 = obj312;
                interfaceC36581p = interfaceC36581p20;
                kCJSApiPaymentFastTradeGooglePayRequest = (KCJSApiPaymentFastTradeGooglePayRequest) objM91049g;
                if (kCJSApiPaymentFastTradeGooglePayRequest == null) {
                    interfaceC36581p.mo49487m(context3, obj3, str20, kCJSApiPaymentFastTradeGooglePayRequest, new Function2<KCJSApiPaymentFastTradeGooglePayPayload, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$95

                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$95$a */
                        /* JADX INFO: compiled from: GsonUtils.kt */
                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$95$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                        public static final class C24040a extends TypeToken<Map<String, ? extends Object>> {
                        }

                        @Override // p852kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(KCJSApiPaymentFastTradeGooglePayPayload kCJSApiPaymentFastTradeGooglePayPayload, ProtocolException protocolException) {
                            invoke2(kCJSApiPaymentFastTradeGooglePayPayload, protocolException);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@Nullable KCJSApiPaymentFastTradeGooglePayPayload kCJSApiPaymentFastTradeGooglePayPayload, @Nullable ProtocolException protocolException) {
                            if (protocolException != null || kCJSApiPaymentFastTradeGooglePayPayload == null) {
                                function3.invoke(null, protocolException);
                                return;
                            }
                            String strM66919i = C27099x.m66919i(kCJSApiPaymentFastTradeGooglePayPayload, false, 2, null);
                            if (strM66919i == null) {
                                strM66919i = "";
                            }
                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C24040a().getType()), null);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": request参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            case 3:
                String str192 = (String) kCJSApiProtocolManager$_exec$2.L$16;
                String str193 = (String) kCJSApiProtocolManager$_exec$2.L$15;
                String str194 = (String) kCJSApiProtocolManager$_exec$2.L$14;
                str25 = (String) kCJSApiProtocolManager$_exec$2.L$13;
                String str195 = (String) kCJSApiProtocolManager$_exec$2.L$12;
                bool2 = (Boolean) kCJSApiProtocolManager$_exec$2.L$11;
                bool = (Boolean) kCJSApiProtocolManager$_exec$2.L$10;
                String str196 = (String) kCJSApiProtocolManager$_exec$2.L$9;
                str24 = (String) kCJSApiProtocolManager$_exec$2.L$8;
                str23 = (String) kCJSApiProtocolManager$_exec$2.L$7;
                interfaceC36590y = (InterfaceC36590y) kCJSApiProtocolManager$_exec$2.L$6;
                map3 = (Map) kCJSApiProtocolManager$_exec$2.L$5;
                Function2<Object, ? super ProtocolException, Unit> function6 = (Function2) kCJSApiProtocolManager$_exec$2.L$4;
                String str197 = (String) kCJSApiProtocolManager$_exec$2.L$3;
                String str198 = (String) kCJSApiProtocolManager$_exec$2.L$2;
                Object obj313 = kCJSApiProtocolManager$_exec$2.L$1;
                Context context10 = (Context) kCJSApiProtocolManager$_exec$2.L$0;
                ResultKt.throwOnFailure(objM91049g);
                str30 = str193;
                str28 = str198;
                str31 = str192;
                obj4 = obj313;
                str29 = str194;
                context4 = context10;
                str27 = str195;
                str26 = str196;
                function3 = function6;
                str38 = str197;
                String str1310 = str25;
                String str1311 = str24;
                String str1312 = str23;
                InterfaceC36590y interfaceC36590y5 = interfaceC36590y;
                kCJSApiShareGalleryDataEntity = (KCJSApiShareGalleryDataEntity) objM91049g;
                Object obj2110 = map3.get("data");
                if (kCJSApiShareGalleryDataEntity == null) {
                }
                interfaceC36590y5.mo59670c(context4, obj4, str28, str1312, str1311, str26, bool.booleanValue(), bool2.booleanValue(), str27, str1310, str29, str30, str31, kCJSApiShareGalleryDataEntity, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$138
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool110, ProtocolException protocolException) {
                        invoke2(bool110, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool110, @Nullable ProtocolException protocolException) {
                        function3.invoke(bool110, protocolException);
                    }
                });
                return Unit.INSTANCE;
            case 4:
                InterfaceC36561a0 interfaceC36561a7 = (InterfaceC36561a0) kCJSApiProtocolManager$_exec$2.L$5;
                Function2<Object, ? super ProtocolException, Unit> function7 = (Function2) kCJSApiProtocolManager$_exec$2.L$4;
                String str199 = (String) kCJSApiProtocolManager$_exec$2.L$3;
                String str200 = (String) kCJSApiProtocolManager$_exec$2.L$2;
                Object obj314 = kCJSApiProtocolManager$_exec$2.L$1;
                Context context11 = (Context) kCJSApiProtocolManager$_exec$2.L$0;
                ResultKt.throwOnFailure(objM91049g);
                function3 = function7;
                str38 = str199;
                interfaceC36561a0 = interfaceC36561a7;
                context5 = context11;
                str32 = str200;
                obj5 = obj314;
                kCJSApiSocketJsPlainSocketTaskParams = (KCJSApiSocketJsPlainSocketTaskParams) objM91049g;
                if (kCJSApiSocketJsPlainSocketTaskParams == null) {
                    interfaceC36561a0.mo31604c(context5, obj5, str32, kCJSApiSocketJsPlainSocketTaskParams, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$148
                        @Override // p852kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map210, ProtocolException protocolException) {
                            invoke2(map210, protocolException);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@Nullable Map<String, ? extends Object> map210, @Nullable ProtocolException protocolException) {
                            function3.invoke(map210, protocolException);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": task参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            case 5:
                InterfaceC36561a0 interfaceC36561a8 = (InterfaceC36561a0) kCJSApiProtocolManager$_exec$2.L$5;
                Function2<Object, ? super ProtocolException, Unit> function8 = (Function2) kCJSApiProtocolManager$_exec$2.L$4;
                String str201 = (String) kCJSApiProtocolManager$_exec$2.L$3;
                String str202 = (String) kCJSApiProtocolManager$_exec$2.L$2;
                Object obj315 = kCJSApiProtocolManager$_exec$2.L$1;
                Context context12 = (Context) kCJSApiProtocolManager$_exec$2.L$0;
                ResultKt.throwOnFailure(objM91049g);
                function3 = function8;
                str38 = str201;
                interfaceC36561a1 = interfaceC36561a8;
                context6 = context12;
                str33 = str202;
                obj6 = obj315;
                kCJSApiSocketJsPollingSocketTaskParams = (KCJSApiSocketJsPollingSocketTaskParams) objM91049g;
                if (kCJSApiSocketJsPollingSocketTaskParams == null) {
                    interfaceC36561a1.mo31605d(context6, obj6, str33, kCJSApiSocketJsPollingSocketTaskParams, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$149
                        @Override // p852kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map210, ProtocolException protocolException) {
                            invoke2(map210, protocolException);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@Nullable Map<String, ? extends Object> map210, @Nullable ProtocolException protocolException) {
                            function3.invoke(map210, protocolException);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": task参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            case 6:
                InterfaceC36561a0 interfaceC36561a9 = (InterfaceC36561a0) kCJSApiProtocolManager$_exec$2.L$5;
                Function2<Object, ? super ProtocolException, Unit> function9 = (Function2) kCJSApiProtocolManager$_exec$2.L$4;
                String str203 = (String) kCJSApiProtocolManager$_exec$2.L$3;
                String str204 = (String) kCJSApiProtocolManager$_exec$2.L$2;
                Object obj316 = kCJSApiProtocolManager$_exec$2.L$1;
                Context context13 = (Context) kCJSApiProtocolManager$_exec$2.L$0;
                ResultKt.throwOnFailure(objM91049g);
                function3 = function9;
                str38 = str203;
                interfaceC36561a2 = interfaceC36561a9;
                context7 = context13;
                str34 = str204;
                obj7 = obj316;
                kCJSApiSocketJsHybridSocketHttpTaskParams = (KCJSApiSocketJsHybridSocketHttpTaskParams) objM91049g;
                if (kCJSApiSocketJsHybridSocketHttpTaskParams == null) {
                    interfaceC36561a2.mo31606e(context7, obj7, str34, kCJSApiSocketJsHybridSocketHttpTaskParams, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$150
                        @Override // p852kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map210, ProtocolException protocolException) {
                            invoke2(map210, protocolException);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@Nullable Map<String, ? extends Object> map210, @Nullable ProtocolException protocolException) {
                            function3.invoke(map210, protocolException);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str38 + ": task参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m57894b(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, ? extends Object> map, @NotNull Function2<Object, ? super ProtocolException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objM57893a = m57893a(context, null, str, str2, str3, map, function2, continuation);
        return objM57893a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM57893a : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m57895c(@NotNull Context ctx, @NotNull String source, @NotNull String module, @NotNull String method, @NotNull Map<String, ? extends Object> param, @NotNull Function2<Object, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C41696j.m91104d(new C38070a(C42911a.m94121c()), null, null, new KCJSApiProtocolManager$exec$1(ctx, source, module, method, param, callback, null), 3, null);
    }
}
