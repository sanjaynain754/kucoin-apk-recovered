package com.kubi.sdk.protocol.flutter;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import b00.InterfaceC4410a;
import b00.InterfaceC4411a0;
import b00.InterfaceC4412b;
import b00.InterfaceC4413b0;
import b00.InterfaceC4414c;
import b00.InterfaceC4415c0;
import b00.InterfaceC4416d;
import b00.InterfaceC4417d0;
import b00.InterfaceC4418e;
import b00.InterfaceC4419e0;
import b00.InterfaceC4420f;
import b00.InterfaceC4421f0;
import b00.InterfaceC4422g;
import b00.InterfaceC4423g0;
import b00.InterfaceC4424h;
import b00.InterfaceC4425h0;
import b00.InterfaceC4426i;
import b00.InterfaceC4427j;
import b00.InterfaceC4428k;
import b00.InterfaceC4429l;
import b00.InterfaceC4430m;
import b00.InterfaceC4431n;
import b00.InterfaceC4432o;
import b00.InterfaceC4433p;
import b00.InterfaceC4434q;
import b00.InterfaceC4435r;
import b00.InterfaceC4436s;
import b00.InterfaceC4437t;
import b00.InterfaceC4438u;
import b00.InterfaceC4439v;
import b00.InterfaceC4440w;
import b00.InterfaceC4441x;
import b00.InterfaceC4442y;
import b00.InterfaceC4443z;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.p110rn.modules.command.impl.CheckIsFavorCommand;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAlphaAlphaCurrencyInfo;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsCoinInfo;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexAddress;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexAsset;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexChain;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeAssetsWalletCexWithdrawResult;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreApiInfo;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreAppInfo;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreHttpHeader;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreInitConfig;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreUserInfo;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeHomeFeedFeedTabItem;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKLineKLineConfig;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKLineKlineContractConfig;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKLineKlineThemeConfig;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKycKycAdvanceResult;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgePaymentRecurringFrequencyInfo;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgePermissionPermissionResult;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgePostPostCoin;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeQrScanScanQrCodeResult;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeSafeFaceResultInfo;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeUserCenterUserPoliciesInfo;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCFlutterProtocolManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/KCFlutterProtocolManager;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "", FirebaseAnalytics.Param.METHOD, "", "arguments", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;)V", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterProtocolManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterProtocolManager.kt\ncom/kubi/sdk/protocol/flutter/KCFlutterProtocolManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4803:1\n1549#2:4804\n1620#2,3:4805\n*S KotlinDebug\n*F\n+ 1 KCFlutterProtocolManager.kt\ncom/kubi/sdk/protocol/flutter/KCFlutterProtocolManager\n*L\n3813#1:4804\n3813#1:4805,3\n*E\n"})
public final class KCFlutterProtocolManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KCFlutterProtocolManager f47495a = new KCFlutterProtocolManager();

    /* JADX INFO: renamed from: a */
    public final void m57889a(@NotNull Context ctx, @NotNull String method, @Nullable Map<String, ? extends Object> arguments, @NotNull final Function2<Object, ? super ProtocolException, Unit> callback) {
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (Intrinsics.areEqual(method, "knb#alert#alertContent")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj = arguments.get("content");
            Map map = obj instanceof Map ? (Map) obj : null;
            Map<String, ? extends Object> mapM57891b = map != null ? C23990a.m57891b(map) : null;
            if (mapM57891b == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": content参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4410a) Router.f46192a.m56192n(InterfaceC4410a.class)).mo4082a(ctx, mapM57891b, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$1
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, ProtocolException protocolException) {
                        invoke2(bool, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool, protocolException);
                    }
                });
                return;
            } catch (Exception e11) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e11), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#alpha#getAlphaCurrencyInfo")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj2 = arguments.get("currencySeq");
            Number number = obj2 instanceof Number ? (Number) obj2 : null;
            Long lValueOf = number != null ? Long.valueOf(number.longValue()) : null;
            if (lValueOf == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": currencySeq参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj3 = arguments.get("quoteCurrency");
            Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
            if (bool == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": quoteCurrency参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4412b) Router.f46192a.m56192n(InterfaceC4412b.class)).mo4088b(ctx, lValueOf.longValue(), bool.booleanValue(), new Function2<KCFlutterBridgeAlphaAlphaCurrencyInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$2
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgeAlphaAlphaCurrencyInfo kCFlutterBridgeAlphaAlphaCurrencyInfo, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgeAlphaAlphaCurrencyInfo, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgeAlphaAlphaCurrencyInfo kCFlutterBridgeAlphaAlphaCurrencyInfo, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgeAlphaAlphaCurrencyInfo == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgeAlphaAlphaCurrencyInfo.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e12) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e12), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#alpha#setTopBarHidden")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj4 = arguments.get(ViewProps.HIDDEN);
            Boolean bool2 = obj4 instanceof Boolean ? (Boolean) obj4 : null;
            if (bool2 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": hidden参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4412b) Router.f46192a.m56192n(InterfaceC4412b.class)).mo4087a(ctx, bool2.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$3
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e13) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e13), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#alpha#processKyc")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj5 = arguments.get("message");
            String str11 = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = arguments.get("message");
            if (str11 == null && obj6 != null && !Intrinsics.areEqual(obj6, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": message参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4412b) Router.f46192a.m56192n(InterfaceC4412b.class)).mo4089c(ctx, str11, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$4
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e14) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e14), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#assets#getAddress")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj7 = arguments.get("coinName");
            String str12 = obj7 instanceof String ? (String) obj7 : null;
            if (str12 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": coinName参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj8 = arguments.get("chainName");
            String str13 = obj8 instanceof String ? (String) obj8 : null;
            if (str13 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": chainName参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4414c) Router.f46192a.m56192n(InterfaceC4414c.class)).mo4096e(ctx, str12, str13, new Function2<List<? extends KCFlutterBridgeAssetsWalletCexAddress>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$5
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCFlutterBridgeAssetsWalletCexAddress> list, ProtocolException protocolException) {
                        invoke2((List<KCFlutterBridgeAssetsWalletCexAddress>) list, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable List<KCFlutterBridgeAssetsWalletCexAddress> list, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || list == null) {
                            callback.invoke(null, protocolException);
                            return;
                        }
                        Function2<Object, ProtocolException, Unit> function2 = callback;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (KCFlutterBridgeAssetsWalletCexAddress kCFlutterBridgeAssetsWalletCexAddress : list) {
                            Map<String, Object> map2 = kCFlutterBridgeAssetsWalletCexAddress != null ? kCFlutterBridgeAssetsWalletCexAddress.toMap() : null;
                            if (map2 == null) {
                                map2 = MapsKt.emptyMap();
                            }
                            arrayList2.add(map2);
                        }
                        function2.invoke(CollectionsKt.toList(arrayList2), null);
                    }
                });
                return;
            } catch (Exception e15) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e15), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#assets#getAssets")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4414c) Router.f46192a.m56192n(InterfaceC4414c.class)).mo4093b(ctx, new Function2<List<? extends KCFlutterBridgeAssetsWalletCexAsset>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$6
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCFlutterBridgeAssetsWalletCexAsset> list, ProtocolException protocolException) {
                        invoke2((List<KCFlutterBridgeAssetsWalletCexAsset>) list, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable List<KCFlutterBridgeAssetsWalletCexAsset> list, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || list == null) {
                            callback.invoke(null, protocolException);
                            return;
                        }
                        Function2<Object, ProtocolException, Unit> function2 = callback;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (KCFlutterBridgeAssetsWalletCexAsset kCFlutterBridgeAssetsWalletCexAsset : list) {
                            Map<String, Object> map2 = kCFlutterBridgeAssetsWalletCexAsset != null ? kCFlutterBridgeAssetsWalletCexAsset.toMap() : null;
                            if (map2 == null) {
                                map2 = MapsKt.emptyMap();
                            }
                            arrayList2.add(map2);
                        }
                        function2.invoke(CollectionsKt.toList(arrayList2), null);
                    }
                });
                return;
            } catch (Exception e16) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e16), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#assets#getChains")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj9 = arguments.get("coinName");
            String str14 = obj9 instanceof String ? (String) obj9 : null;
            if (str14 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": coinName参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4414c) Router.f46192a.m56192n(InterfaceC4414c.class)).mo4095d(ctx, str14, new Function2<List<? extends KCFlutterBridgeAssetsWalletCexChain>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$7
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCFlutterBridgeAssetsWalletCexChain> list, ProtocolException protocolException) {
                        invoke2((List<KCFlutterBridgeAssetsWalletCexChain>) list, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable List<KCFlutterBridgeAssetsWalletCexChain> list, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || list == null) {
                            callback.invoke(null, protocolException);
                            return;
                        }
                        Function2<Object, ProtocolException, Unit> function2 = callback;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (KCFlutterBridgeAssetsWalletCexChain kCFlutterBridgeAssetsWalletCexChain : list) {
                            Map<String, Object> map2 = kCFlutterBridgeAssetsWalletCexChain != null ? kCFlutterBridgeAssetsWalletCexChain.toMap() : null;
                            if (map2 == null) {
                                map2 = MapsKt.emptyMap();
                            }
                            arrayList2.add(map2);
                        }
                        function2.invoke(CollectionsKt.toList(arrayList2), null);
                    }
                });
                return;
            } catch (Exception e17) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e17), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#assets#requestWithdraw")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj10 = arguments.get("coinName");
            String str15 = obj10 instanceof String ? (String) obj10 : null;
            if (str15 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": coinName参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj11 = arguments.get("chainName");
            String str16 = obj11 instanceof String ? (String) obj11 : null;
            if (str16 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": chainName参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj12 = arguments.get("address");
            String str17 = obj12 instanceof String ? (String) obj12 : null;
            if (str17 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": address参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4414c) Router.f46192a.m56192n(InterfaceC4414c.class)).mo4094c(ctx, str15, str16, str17, new Function2<KCFlutterBridgeAssetsWalletCexWithdrawResult, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$8
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgeAssetsWalletCexWithdrawResult kCFlutterBridgeAssetsWalletCexWithdrawResult, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgeAssetsWalletCexWithdrawResult, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgeAssetsWalletCexWithdrawResult kCFlutterBridgeAssetsWalletCexWithdrawResult, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgeAssetsWalletCexWithdrawResult == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgeAssetsWalletCexWithdrawResult.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e18) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e18), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#assets#checkLogin")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4414c) Router.f46192a.m56192n(InterfaceC4414c.class)).mo4097f(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$9
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e19) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e19), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#assets#getCoinInfo")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj13 = arguments.get("code");
            String str18 = obj13 instanceof String ? (String) obj13 : null;
            if (str18 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": code参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4414c) Router.f46192a.m56192n(InterfaceC4414c.class)).mo4092a(ctx, str18, new Function2<KCFlutterBridgeAssetsCoinInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$10
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgeAssetsCoinInfo kCFlutterBridgeAssetsCoinInfo, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgeAssetsCoinInfo, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgeAssetsCoinInfo kCFlutterBridgeAssetsCoinInfo, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgeAssetsCoinInfo == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgeAssetsCoinInfo.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e21) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e21), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#basic#isClipboardReadAccessOpen")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4416d) Router.f46192a.m56192n(InterfaceC4416d.class)).mo4108j(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$11
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e22) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e22), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#basic#launchQrScan")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj14 = arguments.get("bizType");
            String str19 = obj14 instanceof String ? (String) obj14 : null;
            Object obj15 = arguments.get("bizType");
            if (str19 == null && obj15 != null && !Intrinsics.areEqual(obj15, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4416d) Router.f46192a.m56192n(InterfaceC4416d.class)).mo4102d(ctx, str19, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$12
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str20, ProtocolException protocolException) {
                        invoke2(str20, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str20, @Nullable ProtocolException protocolException) {
                        callback.invoke(str20, protocolException);
                    }
                });
                return;
            } catch (Exception e23) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e23), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#basic#queryBizControlConfig")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj16 = arguments.get("uiSpmId");
            String str20 = obj16 instanceof String ? (String) obj16 : null;
            if (str20 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": uiSpmId参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4416d) Router.f46192a.m56192n(InterfaceC4416d.class)).mo4103e(ctx, str20, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$13
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e24) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e24), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#basic#playAudio")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj17 = arguments.get("type");
            String str21 = obj17 instanceof String ? (String) obj17 : null;
            if (str21 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": type参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4416d) Router.f46192a.m56192n(InterfaceC4416d.class)).mo4101c(ctx, str21, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$14
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e25) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e25), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#basic#playVideo")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj18 = arguments.get("url");
            String str22 = obj18 instanceof String ? (String) obj18 : null;
            if (str22 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": url参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4416d) Router.f46192a.m56192n(InterfaceC4416d.class)).mo4107i(ctx, str22, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$15
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e26) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e26), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#basic#showToast")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj19 = arguments.get("msg");
            String str23 = obj19 instanceof String ? (String) obj19 : null;
            if (str23 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": msg参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4416d) Router.f46192a.m56192n(InterfaceC4416d.class)).mo4106h(ctx, str23, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$16
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e27) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e27), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#basic#showBottomSheetDialog")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj20 = arguments.get("datas");
            List<String> list = obj20 instanceof List ? (List) obj20 : null;
            if (list == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": datas参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj21 = arguments.get("selectedIndex");
            Number number2 = obj21 instanceof Number ? (Number) obj21 : null;
            Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
            if (lValueOf2 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": selectedIndex参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4416d) Router.f46192a.m56192n(InterfaceC4416d.class)).mo4104f(ctx, list, lValueOf2.longValue(), new Function2<Long, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$17
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
                        callback.invoke(l11, protocolException);
                    }
                });
                return;
            } catch (Exception e28) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e28), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#basic#sendFlutterEvent")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj22 = arguments.get(ReportDataTable.COLUMN_PARAMS);
            Map map2 = obj22 instanceof Map ? (Map) obj22 : null;
            Map<String, ? extends Object> mapM57891b2 = map2 != null ? C23990a.m57891b(map2) : null;
            if (mapM57891b2 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": params参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4416d) Router.f46192a.m56192n(InterfaceC4416d.class)).mo4105g(ctx, mapM57891b2, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$18
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e29) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e29), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#basic#showAddHomePageDialog")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj23 = arguments.get("shortcutId");
            String str24 = obj23 instanceof String ? (String) obj23 : null;
            Object obj24 = arguments.get("shortcutId");
            if (str24 == null && obj24 != null && !Intrinsics.areEqual(obj24, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": shortcutId参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4416d) Router.f46192a.m56192n(InterfaceC4416d.class)).showAddHomePageDialog(ctx, str24, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$19
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e31) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e31), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#basic#appFlyerTrack")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj25 = arguments.get("eventId");
            String str25 = obj25 instanceof String ? (String) obj25 : null;
            if (str25 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": eventId参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj26 = arguments.get(ReportDataTable.COLUMN_PARAMS);
            String str26 = obj26 instanceof String ? (String) obj26 : null;
            if (str26 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": params参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4416d) Router.f46192a.m56192n(InterfaceC4416d.class)).mo4099a(ctx, str25, str26, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$20
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e32) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e32), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#basic#getTokenSm")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4416d) Router.f46192a.m56192n(InterfaceC4416d.class)).mo4100b(ctx, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$21
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str27, ProtocolException protocolException) {
                        invoke2(str27, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str27, @Nullable ProtocolException protocolException) {
                        callback.invoke(str27, protocolException);
                    }
                });
                return;
            } catch (Exception e33) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e33), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#container#pop")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj27 = arguments.get("data");
            Map map3 = obj27 instanceof Map ? (Map) obj27 : null;
            Map<String, ? extends Object> mapM57891b3 = map3 != null ? C23990a.m57891b(map3) : null;
            Object obj28 = arguments.get("data");
            if (mapM57891b3 == null && obj28 != null && !Intrinsics.areEqual(obj28, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": data参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4418e) Router.f46192a.m56192n(InterfaceC4418e.class)).mo4113b(ctx, mapM57891b3, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$22
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e34) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e34), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#container#openFlutterDialog")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj29 = arguments.get("route");
            String str27 = obj29 instanceof String ? (String) obj29 : null;
            if (str27 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": route参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4418e) Router.f46192a.m56192n(InterfaceC4418e.class)).mo4115d(ctx, str27, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$23
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map4, ProtocolException protocolException) {
                        invoke2(map4, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Map<String, ? extends Object> map4, @Nullable ProtocolException protocolException) {
                        callback.invoke(map4, protocolException);
                    }
                });
                return;
            } catch (Exception e35) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e35), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#container#openFlutter")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj30 = arguments.get("route");
            String str28 = obj30 instanceof String ? (String) obj30 : null;
            if (str28 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": route参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4418e) Router.f46192a.m56192n(InterfaceC4418e.class)).mo4112a(ctx, str28, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$24
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map4, ProtocolException protocolException) {
                        invoke2(map4, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Map<String, ? extends Object> map4, @Nullable ProtocolException protocolException) {
                        callback.invoke(map4, protocolException);
                    }
                });
                return;
            } catch (Exception e36) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e36), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#container#popWithoutPushAndPresent")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj31 = arguments.get("data");
            Map map4 = obj31 instanceof Map ? (Map) obj31 : null;
            Map<String, ? extends Object> mapM57891b4 = map4 != null ? C23990a.m57891b(map4) : null;
            Object obj32 = arguments.get("data");
            if (mapM57891b4 == null && obj32 != null && !Intrinsics.areEqual(obj32, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": data参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4418e) Router.f46192a.m56192n(InterfaceC4418e.class)).mo4114c(ctx, mapM57891b4, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$25
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e37) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e37), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#core#getInitConfig")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj33 = arguments.get("types");
            List<String> list2 = obj33 instanceof List ? (List) obj33 : null;
            if (list2 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": types参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4420f) Router.f46192a.m56192n(InterfaceC4420f.class)).mo4122d(ctx, list2, new Function2<KCFlutterBridgeCoreInitConfig, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$26
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgeCoreInitConfig kCFlutterBridgeCoreInitConfig, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgeCoreInitConfig, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgeCoreInitConfig kCFlutterBridgeCoreInitConfig, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgeCoreInitConfig == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgeCoreInitConfig.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e38) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e38), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#core#getApiInfo")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4420f) Router.f46192a.m56192n(InterfaceC4420f.class)).mo4121c(ctx, new Function2<KCFlutterBridgeCoreApiInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$27
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgeCoreApiInfo kCFlutterBridgeCoreApiInfo, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgeCoreApiInfo, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgeCoreApiInfo kCFlutterBridgeCoreApiInfo, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgeCoreApiInfo == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgeCoreApiInfo.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e39) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e39), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#core#getAppInfo")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4420f) Router.f46192a.m56192n(InterfaceC4420f.class)).mo4123e(ctx, new Function2<KCFlutterBridgeCoreAppInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$28
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgeCoreAppInfo kCFlutterBridgeCoreAppInfo, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgeCoreAppInfo, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgeCoreAppInfo kCFlutterBridgeCoreAppInfo, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgeCoreAppInfo == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgeCoreAppInfo.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e41) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e41), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#core#hasLogin")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4420f) Router.f46192a.m56192n(InterfaceC4420f.class)).mo4124f(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$29
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e42) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e42), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#core#getUserInfo")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4420f) Router.f46192a.m56192n(InterfaceC4420f.class)).mo4119a(ctx, new Function2<KCFlutterBridgeCoreUserInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$30
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgeCoreUserInfo kCFlutterBridgeCoreUserInfo, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgeCoreUserInfo, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgeCoreUserInfo kCFlutterBridgeCoreUserInfo, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgeCoreUserInfo == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgeCoreUserInfo.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e43) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e43), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#core#requestHeader")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4420f) Router.f46192a.m56192n(InterfaceC4420f.class)).mo4120b(ctx, new Function2<List<? extends KCFlutterBridgeCoreHttpHeader>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$31
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCFlutterBridgeCoreHttpHeader> list3, ProtocolException protocolException) {
                        invoke2((List<KCFlutterBridgeCoreHttpHeader>) list3, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable List<KCFlutterBridgeCoreHttpHeader> list3, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || list3 == null) {
                            callback.invoke(null, protocolException);
                            return;
                        }
                        Function2<Object, ProtocolException, Unit> function2 = callback;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                        for (KCFlutterBridgeCoreHttpHeader kCFlutterBridgeCoreHttpHeader : list3) {
                            Map<String, Object> map5 = kCFlutterBridgeCoreHttpHeader != null ? kCFlutterBridgeCoreHttpHeader.toMap() : null;
                            if (map5 == null) {
                                map5 = MapsKt.emptyMap();
                            }
                            arrayList2.add(map5);
                        }
                        function2.invoke(CollectionsKt.toList(arrayList2), null);
                    }
                });
                return;
            } catch (Exception e44) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e44), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#debug#getMockUrl")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj34 = arguments.get("path");
            String str29 = obj34 instanceof String ? (String) obj34 : null;
            if (str29 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": path参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj35 = arguments.get("queries");
            String str30 = obj35 instanceof String ? (String) obj35 : null;
            if (str30 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": queries参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4422g) Router.f46192a.m56192n(InterfaceC4422g.class)).mo4126a(ctx, str29, str30, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$32
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str31, ProtocolException protocolException) {
                        invoke2(str31, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str31, @Nullable ProtocolException protocolException) {
                        callback.invoke(str31, protocolException);
                    }
                });
                return;
            } catch (Exception e45) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e45), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#experiment#getExperimentResult")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj36 = arguments.get("code");
            String str31 = obj36 instanceof String ? (String) obj36 : null;
            if (str31 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": code参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4424h) Router.f46192a.m56192n(InterfaceC4424h.class)).mo4131a(ctx, str31, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$33
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e46) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e46), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#gesture#syncGestureRecognizerToNative")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj37 = arguments.get("state");
            String str32 = obj37 instanceof String ? (String) obj37 : null;
            if (str32 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": state参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4426i) Router.f46192a.m56192n(InterfaceC4426i.class)).mo4135a(ctx, str32, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$34
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e47) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e47), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#homeFeed#getHomeFeedTabs")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4427j) Router.f46192a.m56192n(InterfaceC4427j.class)).mo4141f(ctx, new Function2<List<? extends KCFlutterBridgeHomeFeedFeedTabItem>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$35
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCFlutterBridgeHomeFeedFeedTabItem> list3, ProtocolException protocolException) {
                        invoke2((List<KCFlutterBridgeHomeFeedFeedTabItem>) list3, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable List<KCFlutterBridgeHomeFeedFeedTabItem> list3, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || list3 == null) {
                            callback.invoke(null, protocolException);
                            return;
                        }
                        Function2<Object, ProtocolException, Unit> function2 = callback;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                        for (KCFlutterBridgeHomeFeedFeedTabItem kCFlutterBridgeHomeFeedFeedTabItem : list3) {
                            Map<String, Object> map5 = kCFlutterBridgeHomeFeedFeedTabItem != null ? kCFlutterBridgeHomeFeedFeedTabItem.toMap() : null;
                            if (map5 == null) {
                                map5 = MapsKt.emptyMap();
                            }
                            arrayList2.add(map5);
                        }
                        function2.invoke(CollectionsKt.toList(arrayList2), null);
                    }
                });
                return;
            } catch (Exception e48) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e48), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#homeFeed#updateHomeFeedTabs")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj38 = arguments.get("updatedTabsJson");
            String str33 = obj38 instanceof String ? (String) obj38 : null;
            if (str33 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": updatedTabsJson参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj39 = arguments.get("selectedIndex");
            Number number3 = obj39 instanceof Number ? (Number) obj39 : null;
            Long lValueOf3 = number3 != null ? Long.valueOf(number3.longValue()) : null;
            if (lValueOf3 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": selectedIndex参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4427j) Router.f46192a.m56192n(InterfaceC4427j.class)).mo4144i(ctx, str33, lValueOf3.longValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$36
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e49) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e49), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#homeFeed#getNativeFeedVisibleHeight")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4427j) Router.f46192a.m56192n(InterfaceC4427j.class)).mo4139d(ctx, new Function2<Long, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$37
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
                        callback.invoke(l11, protocolException);
                    }
                });
                return;
            } catch (Exception e51) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e51), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#homeFeed#onClickHomeFeedTab")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj40 = arguments.get(ViewProps.POSITION);
            Number number4 = obj40 instanceof Number ? (Number) obj40 : null;
            Long lValueOf4 = number4 != null ? Long.valueOf(number4.longValue()) : null;
            if (lValueOf4 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": position参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4427j) Router.f46192a.m56192n(InterfaceC4427j.class)).mo4140e(ctx, lValueOf4.longValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$38
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e52) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e52), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#homeFeed#scrollWithVelocity")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj41 = arguments.get("velocity");
            Number number5 = obj41 instanceof Number ? (Number) obj41 : null;
            Double dValueOf = number5 != null ? Double.valueOf(number5.doubleValue()) : null;
            if (dValueOf == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": velocity参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4427j) Router.f46192a.m56192n(InterfaceC4427j.class)).mo4138c(ctx, dValueOf.doubleValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$39
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e53) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e53), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#homeFeed#getFeedTabPos")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4427j) Router.f46192a.m56192n(InterfaceC4427j.class)).mo4143h(ctx, new Function2<Long, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$40
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
                        callback.invoke(l11, protocolException);
                    }
                });
                return;
            } catch (Exception e54) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e54), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#homeFeed#nativeVibrate")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4427j) Router.f46192a.m56192n(InterfaceC4427j.class)).mo4137b(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$41
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e55) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e55), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#homeFeed#sendFeedTabOffsetX")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj42 = arguments.get(TypedValues.CycleType.S_WAVE_OFFSET);
            Number number6 = obj42 instanceof Number ? (Number) obj42 : null;
            Double dValueOf2 = number6 != null ? Double.valueOf(number6.doubleValue()) : null;
            if (dValueOf2 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": offset参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4427j) Router.f46192a.m56192n(InterfaceC4427j.class)).mo4142g(ctx, dValueOf2.doubleValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$42
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e56) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e56), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#homeFeed#isFeedLiveTabRemoteConfigOpen")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4427j) Router.f46192a.m56192n(InterfaceC4427j.class)).mo4145j(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$43
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e57) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e57), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#homeFeed#sendLiveStartAlpha")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj43 = arguments.get("alpha");
            Number number7 = obj43 instanceof Number ? (Number) obj43 : null;
            Double dValueOf3 = number7 != null ? Double.valueOf(number7.doubleValue()) : null;
            if (dValueOf3 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": alpha参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4427j) Router.f46192a.m56192n(InterfaceC4427j.class)).mo4136a(ctx, dValueOf3.doubleValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$44
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e58) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e58), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#getContract")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj44 = arguments.get("symbol");
            String str34 = obj44 instanceof String ? (String) obj44 : null;
            if (str34 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4149d(ctx, str34, new Function2<KCFlutterBridgeKLineKlineContractConfig, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$45
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgeKLineKlineContractConfig kCFlutterBridgeKLineKlineContractConfig, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgeKLineKlineContractConfig, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgeKLineKlineContractConfig kCFlutterBridgeKLineKlineContractConfig, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgeKLineKlineContractConfig == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgeKLineKlineContractConfig.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e59) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e59), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#getKlineConfig")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj45 = arguments.get("symbol");
            String str35 = obj45 instanceof String ? (String) obj45 : null;
            if (str35 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj46 = arguments.get("klineType");
            String str36 = obj46 instanceof String ? (String) obj46 : null;
            if (str36 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": klineType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4167v(ctx, str35, str36, new Function2<KCFlutterBridgeKLineKLineConfig, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$46
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgeKLineKLineConfig kCFlutterBridgeKLineKLineConfig, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgeKLineKLineConfig, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgeKLineKLineConfig kCFlutterBridgeKLineKLineConfig, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgeKLineKLineConfig == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgeKLineKLineConfig.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e61) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e61), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#updateKlineScrollOffset")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj47 = arguments.get(TypedValues.CycleType.S_WAVE_OFFSET);
            Number number8 = obj47 instanceof Number ? (Number) obj47 : null;
            Double dValueOf4 = number8 != null ? Double.valueOf(number8.doubleValue()) : null;
            if (dValueOf4 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": offset参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj48 = arguments.get("symbol");
            String str37 = obj48 instanceof String ? (String) obj48 : null;
            if (str37 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4152g(ctx, dValueOf4.doubleValue(), str37, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$47
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
                        callback.invoke(bool3, protocolException);
                    }
                });
                return;
            } catch (Exception e62) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e62), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#updateKlinePrice")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj49 = arguments.get(FirebaseAnalytics.Param.PRICE);
            String str38 = obj49 instanceof String ? (String) obj49 : null;
            if (str38 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": price参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj50 = arguments.get("symbol");
            String str39 = obj50 instanceof String ? (String) obj50 : null;
            if (str39 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj51 = arguments.get("isUp");
            Boolean bool3 = obj51 instanceof Boolean ? (Boolean) obj51 : null;
            if (bool3 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": isUp参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4158m(ctx, str38, str39, bool3.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$48
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
                        callback.invoke(bool4, protocolException);
                    }
                });
                return;
            } catch (Exception e63) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e63), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#jump2HorizontalKlinePage")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj52 = arguments.get("symbol");
            String str40 = obj52 instanceof String ? (String) obj52 : null;
            if (str40 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj53 = arguments.get("klineType");
            String str41 = obj53 instanceof String ? (String) obj53 : null;
            if (str41 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": klineType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj54 = arguments.get("showHistoryOrder");
            Boolean bool4 = obj54 instanceof Boolean ? (Boolean) obj54 : null;
            if (bool4 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": showHistoryOrder参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj55 = arguments.get("showActivityOrder");
            Boolean bool5 = obj55 instanceof Boolean ? (Boolean) obj55 : null;
            if (bool5 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": showActivityOrder参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj56 = arguments.get("isFrom");
            Boolean bool6 = obj56 instanceof Boolean ? (Boolean) obj56 : null;
            if (bool6 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": isFrom参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4165t(ctx, str40, str41, bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$49
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
                        callback.invoke(bool7, protocolException);
                    }
                });
                return;
            } catch (Exception e64) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e64), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#updateKlineThemeConfig")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj57 = arguments.get(BaseActivity.THEME);
            Number number9 = obj57 instanceof Number ? (Number) obj57 : null;
            Long lValueOf5 = number9 != null ? Long.valueOf(number9.longValue()) : null;
            Object obj58 = arguments.get(BaseActivity.THEME);
            if (lValueOf5 == null && obj58 != null && !Intrinsics.areEqual(obj58, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": theme参数类型不正确"), null, false, 12, null));
                return;
            }
            Object obj59 = arguments.get("klineColorType");
            Number number10 = obj59 instanceof Number ? (Number) obj59 : null;
            Long lValueOf6 = number10 != null ? Long.valueOf(number10.longValue()) : null;
            Object obj60 = arguments.get("klineColorType");
            if (lValueOf6 == null && obj60 != null && !Intrinsics.areEqual(obj60, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": klineColorType参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4163r(ctx, lValueOf5, lValueOf6, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$50
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
                        callback.invoke(bool7, protocolException);
                    }
                });
                return;
            } catch (Exception e65) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e65), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#requestKlineThemeConfig")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4156k(ctx, new Function2<KCFlutterBridgeKLineKlineThemeConfig, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$51
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgeKLineKlineThemeConfig kCFlutterBridgeKLineKlineThemeConfig, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgeKLineKlineThemeConfig, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgeKLineKlineThemeConfig kCFlutterBridgeKLineKlineThemeConfig, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgeKLineKlineThemeConfig == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgeKLineKlineThemeConfig.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e66) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e66), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#klineContainsCoinInfoTab")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj61 = arguments.get("symbol");
            String str42 = obj61 instanceof String ? (String) obj61 : null;
            if (str42 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4166u(ctx, str42, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$52
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
                        callback.invoke(bool7, protocolException);
                    }
                });
                return;
            } catch (Exception e67) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e67), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#klineScrollToCoinInfoTab")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj62 = arguments.get("symbol");
            String str43 = obj62 instanceof String ? (String) obj62 : null;
            if (str43 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4161p(ctx, str43, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$53
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
                        callback.invoke(bool7, protocolException);
                    }
                });
                return;
            } catch (Exception e68) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e68), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#klineUpdateMetrics")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj63 = arguments.get("mainMetrics");
            Number number11 = obj63 instanceof Number ? (Number) obj63 : null;
            Long lValueOf7 = number11 != null ? Long.valueOf(number11.longValue()) : null;
            Object obj64 = arguments.get("mainMetrics");
            if (lValueOf7 == null && obj64 != null && !Intrinsics.areEqual(obj64, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": mainMetrics参数类型不正确"), null, false, 12, null));
                return;
            }
            Object obj65 = arguments.get("subMetrics");
            Number number12 = obj65 instanceof Number ? (Number) obj65 : null;
            Long lValueOf8 = number12 != null ? Long.valueOf(number12.longValue()) : null;
            Object obj66 = arguments.get("subMetrics");
            if (lValueOf8 == null && obj66 != null && !Intrinsics.areEqual(obj66, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": subMetrics参数类型不正确"), null, false, 12, null));
                return;
            }
            Object obj67 = arguments.get("selectTime");
            String str44 = obj67 instanceof String ? (String) obj67 : null;
            Object obj68 = arguments.get("selectTime");
            if (str44 == null && obj68 != null && !Intrinsics.areEqual(obj68, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": selectTime参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4148c(ctx, lValueOf7, lValueOf8, str44, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$54
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
                        callback.invoke(bool7, protocolException);
                    }
                });
                return;
            } catch (Exception e69) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e69), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#jumpBsOrder")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj69 = arguments.get("symbol");
            String str45 = obj69 instanceof String ? (String) obj69 : null;
            if (str45 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj70 = arguments.get("klineType");
            String str46 = obj70 instanceof String ? (String) obj70 : null;
            if (str46 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": klineType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj71 = arguments.get("parameters");
            Map map5 = obj71 instanceof Map ? (Map) obj71 : null;
            Map<String, ? extends Object> mapM57891b5 = map5 != null ? C23990a.m57891b(map5) : null;
            if (mapM57891b5 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": parameters参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4153h(ctx, str45, str46, mapM57891b5, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$55
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
                        callback.invoke(bool7, protocolException);
                    }
                });
                return;
            } catch (Exception e71) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e71), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#showQuickOrderDialog")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj72 = arguments.get("bizType");
            String str47 = obj72 instanceof String ? (String) obj72 : null;
            if (str47 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj73 = arguments.get("symbol");
            String str48 = obj73 instanceof String ? (String) obj73 : null;
            if (str48 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj74 = arguments.get("side");
            String str49 = obj74 instanceof String ? (String) obj74 : null;
            if (str49 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": side参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj75 = arguments.get("quickOrderPrice");
            String str50 = obj75 instanceof String ? (String) obj75 : null;
            if (str50 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": quickOrderPrice参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj76 = arguments.get("showPriceLine");
            Boolean bool7 = obj76 instanceof Boolean ? (Boolean) obj76 : null;
            Object obj77 = arguments.get("showPriceLine");
            if (bool7 == null && obj77 != null && !Intrinsics.areEqual(obj77, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": showPriceLine参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4155j(ctx, str47, str48, str49, str50, bool7, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$56
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e72) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e72), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#updateQuickOrderPrice")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj78 = arguments.get("bizType");
            String str51 = obj78 instanceof String ? (String) obj78 : null;
            if (str51 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj79 = arguments.get("symbol");
            String str52 = obj79 instanceof String ? (String) obj79 : null;
            if (str52 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj80 = arguments.get(FirebaseAnalytics.Param.PRICE);
            String str53 = obj80 instanceof String ? (String) obj80 : null;
            if (str53 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": price参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4157l(ctx, str51, str52, str53, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$57
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e73) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e73), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#isQuickOrderEnabled")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj81 = arguments.get("symbol");
            String str54 = obj81 instanceof String ? (String) obj81 : null;
            if (str54 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj82 = arguments.get("klineType");
            String str55 = obj82 instanceof String ? (String) obj82 : null;
            if (str55 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": klineType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4154i(ctx, str54, str55, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$58
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e74) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e74), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#getAccountType")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj83 = arguments.get("bizType");
            String str56 = obj83 instanceof String ? (String) obj83 : null;
            if (str56 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj84 = arguments.get("accountQuery");
            String str57 = obj84 instanceof String ? (String) obj84 : null;
            if (str57 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": accountQuery参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4162q(ctx, str56, str57, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$59
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str58, ProtocolException protocolException) {
                        invoke2(str58, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str58, @Nullable ProtocolException protocolException) {
                        callback.invoke(str58, protocolException);
                    }
                });
                return;
            } catch (Exception e75) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e75), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#calculateDragPnl")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj85 = arguments.get("targetPrice");
            String str58 = obj85 instanceof String ? (String) obj85 : null;
            if (str58 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": targetPrice参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj86 = arguments.get("bizType");
            String str59 = obj86 instanceof String ? (String) obj86 : null;
            if (str59 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj87 = arguments.get("positionInfo");
            String str60 = obj87 instanceof String ? (String) obj87 : null;
            if (str60 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": positionInfo参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4147b(ctx, str58, str59, str60, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$60
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
                        callback.invoke(str61, protocolException);
                    }
                });
                return;
            } catch (Exception e76) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e76), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#showClosePositionPanel")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj88 = arguments.get("bizType");
            String str61 = obj88 instanceof String ? (String) obj88 : null;
            if (str61 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj89 = arguments.get("positionInfo");
            String str62 = obj89 instanceof String ? (String) obj89 : null;
            if (str62 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": positionInfo参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4160o(ctx, str61, str62, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$61
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e77) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e77), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#showReversePositionPanel")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj90 = arguments.get("bizType");
            String str63 = obj90 instanceof String ? (String) obj90 : null;
            if (str63 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj91 = arguments.get("positionInfo");
            String str64 = obj91 instanceof String ? (String) obj91 : null;
            if (str64 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": positionInfo参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4159n(ctx, str63, str64, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$62
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e78) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e78), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#showSetTpslPanel")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj92 = arguments.get("bizType");
            String str65 = obj92 instanceof String ? (String) obj92 : null;
            if (str65 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj93 = arguments.get("positionInfo");
            if (obj93 instanceof String) {
                String str66 = str65;
                str10 = (String) obj93;
                str9 = str66;
            } else {
                str9 = str65;
                str10 = null;
            }
            if (str10 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": positionInfo参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj94 = arguments.get("targetPrice");
            String str67 = obj94 instanceof String ? (String) obj94 : null;
            if (str67 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": targetPrice参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4150e(ctx, str9, str10, str67, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$63
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e79) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e79), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#showModifyTpslPanel")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj95 = arguments.get("modifyTpSlOrderInfo");
            String str68 = obj95 instanceof String ? (String) obj95 : null;
            if (str68 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": modifyTpSlOrderInfo参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj96 = arguments.get("positionInfo");
            String str69 = obj96 instanceof String ? (String) obj96 : null;
            if (str69 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": positionInfo参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4169x(ctx, str68, str69, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$64
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e81) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e81), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#submitKlineModifyTpSlOrder")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj97 = arguments.get("bizType");
            String str70 = obj97 instanceof String ? (String) obj97 : null;
            if (str70 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj98 = arguments.get("modifyTpSlOrderInfo");
            if (obj98 instanceof String) {
                String str71 = str70;
                str8 = (String) obj98;
                str7 = str71;
            } else {
                str7 = str70;
                str8 = null;
            }
            if (str8 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": modifyTpSlOrderInfo参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj99 = arguments.get("positionInfo");
            String str72 = obj99 instanceof String ? (String) obj99 : null;
            if (str72 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": positionInfo参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj100 = arguments.get("targetPrice");
            String str73 = obj100 instanceof String ? (String) obj100 : null;
            if (str73 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": targetPrice参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4151f(ctx, str7, str8, str72, str73, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$65
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e82) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e82), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#startKlinePositionTask")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4164s(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$66
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e83) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e83), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#stopKlinePositionTask")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4146a(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$67
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e84) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e84), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kLine#showClassicSetTpslPanel")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj101 = arguments.get("bizType");
            String str74 = obj101 instanceof String ? (String) obj101 : null;
            if (str74 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj102 = arguments.get("positionInfo");
            if (obj102 instanceof String) {
                String str75 = str74;
                str6 = (String) obj102;
                str5 = str75;
            } else {
                str5 = str74;
                str6 = null;
            }
            if (str6 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": positionInfo参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj103 = arguments.get("targetPrice");
            String str76 = obj103 instanceof String ? (String) obj103 : null;
            if (str76 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": targetPrice参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4428k) Router.f46192a.m56192n(InterfaceC4428k.class)).mo4168w(ctx, str5, str6, str76, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$68
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e85) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e85), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kumex#getMaxLeverage")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4429l) Router.f46192a.m56192n(InterfaceC4429l.class)).mo4176g(ctx, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$69
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str77, ProtocolException protocolException) {
                        invoke2(str77, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str77, @Nullable ProtocolException protocolException) {
                        callback.invoke(str77, protocolException);
                    }
                });
                return;
            } catch (Exception e86) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e86), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kumex#getQtyUnit")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4429l) Router.f46192a.m56192n(InterfaceC4429l.class)).mo4174e(ctx, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$70
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str77, ProtocolException protocolException) {
                        invoke2(str77, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str77, @Nullable ProtocolException protocolException) {
                        callback.invoke(str77, protocolException);
                    }
                });
                return;
            } catch (Exception e87) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e87), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kumex#modifyTwapOrder")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj104 = arguments.get("orderInfo");
            String str77 = obj104 instanceof String ? (String) obj104 : null;
            if (str77 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": orderInfo参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4429l) Router.f46192a.m56192n(InterfaceC4429l.class)).mo4170a(ctx, str77, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$71
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str78, ProtocolException protocolException) {
                        invoke2(str78, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str78, @Nullable ProtocolException protocolException) {
                        callback.invoke(str78, protocolException);
                    }
                });
                return;
            } catch (Exception e88) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e88), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kumex#cancelTwapOrder")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj105 = arguments.get("orderId");
            String str78 = obj105 instanceof String ? (String) obj105 : null;
            if (str78 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": orderId参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4429l) Router.f46192a.m56192n(InterfaceC4429l.class)).mo4172c(ctx, str78, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$72
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e89) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e89), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kumex#switchTwapOrderStatus")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj106 = arguments.get("orderId");
            String str79 = obj106 instanceof String ? (String) obj106 : null;
            if (str79 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": orderId参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj107 = arguments.get("status");
            String str80 = obj107 instanceof String ? (String) obj107 : null;
            if (str80 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": status参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4429l) Router.f46192a.m56192n(InterfaceC4429l.class)).mo4171b(ctx, str79, str80, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$73
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e91) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e91), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kumex#getLeaderUserId")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4429l) Router.f46192a.m56192n(InterfaceC4429l.class)).mo4173d(ctx, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$74
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str81, ProtocolException protocolException) {
                        invoke2(str81, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str81, @Nullable ProtocolException protocolException) {
                        callback.invoke(str81, protocolException);
                    }
                });
                return;
            } catch (Exception e92) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e92), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kumex#getFormatSymbol")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj108 = arguments.get("symbol");
            String str81 = obj108 instanceof String ? (String) obj108 : null;
            if (str81 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4429l) Router.f46192a.m56192n(InterfaceC4429l.class)).mo4175f(ctx, str81, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$75
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str82, ProtocolException protocolException) {
                        invoke2(str82, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str82, @Nullable ProtocolException protocolException) {
                        callback.invoke(str82, protocolException);
                    }
                });
                return;
            } catch (Exception e93) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e93), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kyc#checkSumsubPermission")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4430m) Router.f46192a.m56192n(InterfaceC4430m.class)).mo4178b(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$76
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e94) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e94), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#kyc#advancebyChannel")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj109 = arguments.get(AppsFlyerProperties.CHANNEL);
            String str82 = obj109 instanceof String ? (String) obj109 : null;
            if (str82 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": channel参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj110 = arguments.get("data");
            String str83 = obj110 instanceof String ? (String) obj110 : null;
            if (str83 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": data参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4430m) Router.f46192a.m56192n(InterfaceC4430m.class)).mo4177a(ctx, str82, str83, new Function2<KCFlutterBridgeKycKycAdvanceResult, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$77
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgeKycKycAdvanceResult kCFlutterBridgeKycKycAdvanceResult, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgeKycKycAdvanceResult, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgeKycKycAdvanceResult kCFlutterBridgeKycKycAdvanceResult, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgeKycKycAdvanceResult == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgeKycKycAdvanceResult.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e95) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e95), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#log#uploadLogFile")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4431n) Router.f46192a.m56192n(InterfaceC4431n.class)).mo4179a(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$78
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e96) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e96), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#market#getChainFavList")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4432o) Router.f46192a.m56192n(InterfaceC4432o.class)).mo4189j(ctx, new Function2<List<? extends String>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$79
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list3, ProtocolException protocolException) {
                        invoke2((List<String>) list3, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable List<String> list3, @Nullable ProtocolException protocolException) {
                        callback.invoke(list3, protocolException);
                    }
                });
                return;
            } catch (Exception e97) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e97), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#market#jumpToWeb3Wallet")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj111 = arguments.get(InterfaceC33826o0.f71244p);
            String str84 = obj111 instanceof String ? (String) obj111 : null;
            if (str84 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": token参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj112 = arguments.get("chain");
            String str85 = obj112 instanceof String ? (String) obj112 : null;
            if (str85 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": chain参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj113 = arguments.get("redirectType");
            String str86 = obj113 instanceof String ? (String) obj113 : null;
            if (str86 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": redirectType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4432o) Router.f46192a.m56192n(InterfaceC4432o.class)).mo4188i(ctx, str84, str85, str86, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$80
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e98) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e98), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#market#isWalletAvailable")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4432o) Router.f46192a.m56192n(InterfaceC4432o.class)).mo4187h(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$81
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e99) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e99), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#market#isAlphaFavorite")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj114 = arguments.get(InterfaceC33826o0.f71244p);
            String str87 = obj114 instanceof String ? (String) obj114 : null;
            if (str87 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": token参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj115 = arguments.get("chain");
            String str88 = obj115 instanceof String ? (String) obj115 : null;
            if (str88 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": chain参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4432o) Router.f46192a.m56192n(InterfaceC4432o.class)).mo4191l(ctx, str87, str88, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$82
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
                        callback.invoke(bool8, protocolException);
                    }
                });
                return;
            } catch (Exception e100) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e100), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#market#changeAlphaFavorite")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj116 = arguments.get(InterfaceC33826o0.f71244p);
            String str89 = obj116 instanceof String ? (String) obj116 : null;
            if (str89 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": token参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj117 = arguments.get("chain");
            String str90 = obj117 instanceof String ? (String) obj117 : null;
            if (str90 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": chain参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj118 = arguments.get(CheckIsFavorCommand.KEY_IS_FAV);
            Boolean bool8 = obj118 instanceof Boolean ? (Boolean) obj118 : null;
            Object obj119 = arguments.get(CheckIsFavorCommand.KEY_IS_FAV);
            if (bool8 == null && obj119 != null && !Intrinsics.areEqual(obj119, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": isFav参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4432o) Router.f46192a.m56192n(InterfaceC4432o.class)).mo4186g(ctx, str89, str90, bool8, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$83
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
                        callback.invoke(bool9, protocolException);
                    }
                });
                return;
            } catch (Exception e101) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e101), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#market#isSpotFavorite")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj120 = arguments.get("symbol");
            String str91 = obj120 instanceof String ? (String) obj120 : null;
            if (str91 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4432o) Router.f46192a.m56192n(InterfaceC4432o.class)).mo4183d(ctx, str91, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$84
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
                        callback.invoke(bool9, protocolException);
                    }
                });
                return;
            } catch (Exception e102) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e102), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#market#changeSpotFavorite")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj121 = arguments.get("symbol");
            String str92 = obj121 instanceof String ? (String) obj121 : null;
            if (str92 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4432o) Router.f46192a.m56192n(InterfaceC4432o.class)).mo4181b(ctx, str92, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$85
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
                        callback.invoke(bool9, protocolException);
                    }
                });
                return;
            } catch (Exception e103) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e103), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#market#isFutureFavorite")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj122 = arguments.get("symbol");
            String str93 = obj122 instanceof String ? (String) obj122 : null;
            if (str93 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4432o) Router.f46192a.m56192n(InterfaceC4432o.class)).mo4182c(ctx, str93, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$86
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
                        callback.invoke(bool9, protocolException);
                    }
                });
                return;
            } catch (Exception e104) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e104), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#market#changeFutureFavorite")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj123 = arguments.get("symbol");
            String str94 = obj123 instanceof String ? (String) obj123 : null;
            if (str94 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4432o) Router.f46192a.m56192n(InterfaceC4432o.class)).mo4180a(ctx, str94, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$87
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
                        callback.invoke(bool9, protocolException);
                    }
                });
                return;
            } catch (Exception e105) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e105), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#market#getFutureTag")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj124 = arguments.get("symbol");
            List<String> list3 = obj124 instanceof List ? (List) obj124 : null;
            Object obj125 = arguments.get("symbol");
            if (list3 == null && obj125 != null && !Intrinsics.areEqual(obj125, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4432o) Router.f46192a.m56192n(InterfaceC4432o.class)).mo4184e(ctx, list3, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$88
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
                        callback.invoke(map6, protocolException);
                    }
                });
                return;
            } catch (Exception e106) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e106), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#market#openMarketFeedNewsTab")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj126 = arguments.get("coin");
            String str95 = obj126 instanceof String ? (String) obj126 : null;
            Object obj127 = arguments.get("coin");
            if (str95 == null && obj127 != null && !Intrinsics.areEqual(obj127, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": coin参数类型不正确"), null, false, 12, null));
                return;
            }
            Object obj128 = arguments.get("klineType");
            String str96 = obj128 instanceof String ? (String) obj128 : null;
            Object obj129 = arguments.get("klineType");
            if (str96 == null && obj129 != null && !Intrinsics.areEqual(obj129, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": klineType参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4432o) Router.f46192a.m56192n(InterfaceC4432o.class)).mo4190k(ctx, str95, str96, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$89
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
                        callback.invoke(bool9, protocolException);
                    }
                });
                return;
            } catch (Exception e107) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e107), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#market#getFutureIncludes")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4432o) Router.f46192a.m56192n(InterfaceC4432o.class)).mo4185f(ctx, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$90
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str97, ProtocolException protocolException) {
                        invoke2(str97, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str97, @Nullable ProtocolException protocolException) {
                        callback.invoke(str97, protocolException);
                    }
                });
                return;
            } catch (Exception e108) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e108), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#mode#switchMode")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj130 = arguments.get("toMode");
            String str97 = obj130 instanceof String ? (String) obj130 : null;
            if (str97 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": toMode参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj131 = arguments.get("animate");
            Boolean bool9 = obj131 instanceof Boolean ? (Boolean) obj131 : null;
            Object obj132 = arguments.get("animate");
            if (bool9 == null && obj132 != null && !Intrinsics.areEqual(obj132, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": animate参数类型不正确"), null, false, 12, null));
                return;
            }
            Object obj133 = arguments.get("route");
            String str98 = obj133 instanceof String ? (String) obj133 : null;
            Object obj134 = arguments.get("route");
            if (str98 == null && obj134 != null && !Intrinsics.areEqual(obj134, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": route参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4433p) Router.f46192a.m56192n(InterfaceC4433p.class)).mo4192a(ctx, str97, bool9, str98, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$91
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
                        callback.invoke(bool10, protocolException);
                    }
                });
                return;
            } catch (Exception e109) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e109), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#notice#jumpToSystemNoticeSetting")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4434q) Router.f46192a.m56192n(InterfaceC4434q.class)).mo4193a(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$92
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
                        callback.invoke(bool10, protocolException);
                    }
                });
                return;
            } catch (Exception e110) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e110), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#selectRecurringFrequency")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj135 = arguments.get("frequency");
            String str99 = obj135 instanceof String ? (String) obj135 : null;
            if (str99 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": frequency参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj136 = arguments.get("dayOfMonth");
            String str100 = obj136 instanceof String ? (String) obj136 : null;
            if (str100 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": dayOfMonth参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj137 = arguments.get("dayOfWeek");
            String str101 = obj137 instanceof String ? (String) obj137 : null;
            if (str101 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": dayOfWeek参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj138 = arguments.get("timeOfDay");
            String str102 = obj138 instanceof String ? (String) obj138 : null;
            if (str102 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": timeOfDay参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj139 = arguments.get(RemoteConfigConstants.RequestFieldKey.TIME_ZONE);
            String str103 = obj139 instanceof String ? (String) obj139 : null;
            if (str103 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": timeZone参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4195b(ctx, str99, str100, str101, str102, str103, new Function2<KCFlutterBridgePaymentRecurringFrequencyInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$93
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgePaymentRecurringFrequencyInfo kCFlutterBridgePaymentRecurringFrequencyInfo, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgePaymentRecurringFrequencyInfo, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgePaymentRecurringFrequencyInfo kCFlutterBridgePaymentRecurringFrequencyInfo, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgePaymentRecurringFrequencyInfo == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgePaymentRecurringFrequencyInfo.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e111) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e111), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#checkSafeVerify")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj140 = arguments.get("bizType");
            String str104 = obj140 instanceof String ? (String) obj140 : null;
            if (str104 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4208o(ctx, str104, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$94
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
                        callback.invoke(bool10, protocolException);
                    }
                });
                return;
            } catch (Exception e112) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e112), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#needShowKucardGuide")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4194a(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$95
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
                        callback.invoke(bool10, protocolException);
                    }
                });
                return;
            } catch (Exception e113) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e113), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#showKuCardGuide")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj141 = arguments.get(BridgeParamKeyKt.SHARE_KEY_LINKURL);
            String str105 = obj141 instanceof String ? (String) obj141 : null;
            if (str105 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": linkUrl参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4199f(ctx, str105, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$96
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
                        callback.invoke(bool10, protocolException);
                    }
                });
                return;
            } catch (Exception e114) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e114), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#openWebUrlByIgnoreWhiteList")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj142 = arguments.get("url");
            String str106 = obj142 instanceof String ? (String) obj142 : null;
            if (str106 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": url参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj143 = arguments.get("title");
            String str107 = obj143 instanceof String ? (String) obj143 : null;
            Object obj144 = arguments.get("title");
            if (str107 == null && obj144 != null && !Intrinsics.areEqual(obj144, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": title参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4202i(ctx, str106, str107, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$97
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
                        callback.invoke(bool10, protocolException);
                    }
                });
                return;
            } catch (Exception e115) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e115), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#checkSafeVerifyWhileWithdraw")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj145 = arguments.get("fiatAmount");
            String str108 = obj145 instanceof String ? (String) obj145 : null;
            if (str108 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": fiatAmount参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj146 = arguments.get("fiatCurrency");
            String str109 = obj146 instanceof String ? (String) obj146 : null;
            if (str109 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": fiatCurrency参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4198e(ctx, str108, str109, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$98
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
                        callback.invoke(bool10, protocolException);
                    }
                });
                return;
            } catch (Exception e116) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e116), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#onSelectFiatCurrency")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj147 = arguments.get("fiatCurrency");
            String str110 = obj147 instanceof String ? (String) obj147 : null;
            if (str110 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": fiatCurrency参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4206m(ctx, str110, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$99
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
                        callback.invoke(bool10, protocolException);
                    }
                });
                return;
            } catch (Exception e117) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e117), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#isSupportGooglePay")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj148 = arguments.get("allowedCardNetworks");
            List<String> list4 = obj148 instanceof List ? (List) obj148 : null;
            Object obj149 = arguments.get("allowedCardNetworks");
            if (list4 == null && obj149 != null && !Intrinsics.areEqual(obj149, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": allowedCardNetworks参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4201h(ctx, list4, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$100
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
                        callback.invoke(bool10, protocolException);
                    }
                });
                return;
            } catch (Exception e118) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e118), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#isSupportApplePay")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj150 = arguments.get("allowedCardNetworks");
            List<String> list5 = obj150 instanceof List ? (List) obj150 : null;
            Object obj151 = arguments.get("allowedCardNetworks");
            if (list5 == null && obj151 != null && !Intrinsics.areEqual(obj151, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": allowedCardNetworks参数类型不正确"), null, false, 12, null));
                return;
            }
            Object obj152 = arguments.get("isRecurring");
            Boolean bool10 = obj152 instanceof Boolean ? (Boolean) obj152 : null;
            Object obj153 = arguments.get("isRecurring");
            if (bool10 == null && obj153 != null && !Intrinsics.areEqual(obj153, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": isRecurring参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4205l(ctx, list5, bool10, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$101
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool11, ProtocolException protocolException) {
                        invoke2(bool11, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool11, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool11, protocolException);
                    }
                });
                return;
            } catch (Exception e119) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e119), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#jumpP2PAddPaymentMethod")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4212s(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$102
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool11, ProtocolException protocolException) {
                        invoke2(bool11, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool11, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool11, protocolException);
                    }
                });
                return;
            } catch (Exception e120) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e120), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#showP2PMerchantIdentityInfo")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj154 = arguments.get("foxKingMerchants");
            Boolean bool11 = obj154 instanceof Boolean ? (Boolean) obj154 : null;
            Object obj155 = arguments.get("foxKingMerchants");
            if (bool11 == null && obj155 != null && !Intrinsics.areEqual(obj155, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": foxKingMerchants参数类型不正确"), null, false, 12, null));
                return;
            }
            Object obj156 = arguments.get("foxKingMarginAmount");
            String str111 = obj156 instanceof String ? (String) obj156 : null;
            Object obj157 = arguments.get("foxKingMarginAmount");
            if (str111 == null && obj157 != null && !Intrinsics.areEqual(obj157, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": foxKingMarginAmount参数类型不正确"), null, false, 12, null));
                return;
            }
            Object obj158 = arguments.get("foxKingMarginCurrency");
            String str112 = obj158 instanceof String ? (String) obj158 : null;
            Object obj159 = arguments.get("foxKingMarginCurrency");
            if (str112 == null && obj159 != null && !Intrinsics.areEqual(obj159, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": foxKingMarginCurrency参数类型不正确"), null, false, 12, null));
                return;
            }
            Object obj160 = arguments.get("goldMerchants");
            Boolean bool12 = obj160 instanceof Boolean ? (Boolean) obj160 : null;
            Object obj161 = arguments.get("goldMerchants");
            if (bool12 == null && obj161 != null && !Intrinsics.areEqual(obj161, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": goldMerchants参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4210q(ctx, bool11, str111, str112, bool12, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$103
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
                        callback.invoke(bool13, protocolException);
                    }
                });
                return;
            } catch (Exception e121) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e121), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#jumpP2PChatPage")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj162 = arguments.get("orderId");
            String str113 = obj162 instanceof String ? (String) obj162 : null;
            if (str113 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": orderId参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj163 = arguments.get("from");
            String str114 = obj163 instanceof String ? (String) obj163 : null;
            if (str114 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": from参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj164 = arguments.get("fromName");
            String str115 = obj164 instanceof String ? (String) obj164 : null;
            if (str115 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": fromName参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj165 = arguments.get(TypedValues.TransitionType.S_TO);
            String str116 = obj165 instanceof String ? (String) obj165 : null;
            if (str116 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": to参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj166 = arguments.get("toName");
            String str117 = obj166 instanceof String ? (String) obj166 : null;
            if (str117 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": toName参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj167 = arguments.get("canChat");
            Boolean bool13 = obj167 instanceof Boolean ? (Boolean) obj167 : null;
            if (bool13 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": canChat参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4211r(ctx, str113, str114, str115, str116, str117, bool13.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$104
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
                        callback.invoke(bool14, protocolException);
                    }
                });
                return;
            } catch (Exception e122) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e122), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#goToUpgrade")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4207n(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$105
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
                        callback.invoke(bool14, protocolException);
                    }
                });
                return;
            } catch (Exception e123) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e123), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#jumpPaymentMethodPage")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4203j(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$106
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
                        callback.invoke(bool14, protocolException);
                    }
                });
                return;
            } catch (Exception e124) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e124), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#jumpAdManagerPage")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4200g(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$107
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
                        callback.invoke(bool14, protocolException);
                    }
                });
                return;
            } catch (Exception e125) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e125), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#onCheckTradePwd")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4196c(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$108
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
                        callback.invoke(bool14, protocolException);
                    }
                });
                return;
            } catch (Exception e126) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e126), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#onShowTradeToastNotice")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj168 = arguments.get("code");
            String str118 = obj168 instanceof String ? (String) obj168 : null;
            if (str118 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": code参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj169 = arguments.get("msg");
            String str119 = obj169 instanceof String ? (String) obj169 : null;
            if (str119 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": msg参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4204k(ctx, str118, str119, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$109
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
                        callback.invoke(bool14, protocolException);
                    }
                });
                return;
            } catch (Exception e127) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e127), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#showP2PExpressPriceDetailDialog")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4213t(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$110
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
                        callback.invoke(bool14, protocolException);
                    }
                });
                return;
            } catch (Exception e128) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e128), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#showP2PExpressNoMatchAdDialog")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4209p(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$111
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
                        callback.invoke(bool14, protocolException);
                    }
                });
                return;
            } catch (Exception e129) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e129), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#payment#verifyKycDialog")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4435r) Router.f46192a.m56192n(InterfaceC4435r.class)).mo4197d(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$112
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
                        callback.invoke(bool14, protocolException);
                    }
                });
                return;
            } catch (Exception e130) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e130), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#permission#getPermission")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj170 = arguments.get("permissionType");
            String str120 = obj170 instanceof String ? (String) obj170 : null;
            if (str120 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": permissionType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4436s) Router.f46192a.m56192n(InterfaceC4436s.class)).mo4214a(ctx, str120, new Function2<KCFlutterBridgePermissionPermissionResult, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$113
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgePermissionPermissionResult kCFlutterBridgePermissionPermissionResult, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgePermissionPermissionResult, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgePermissionPermissionResult kCFlutterBridgePermissionPermissionResult, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgePermissionPermissionResult == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgePermissionPermissionResult.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e131) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e131), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#post#searchPostCoins")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj171 = arguments.get("keyword");
            String str121 = obj171 instanceof String ? (String) obj171 : null;
            if (str121 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": keyword参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj172 = arguments.get(BridgeParamKeyKt.MAX_COUNT);
            Number number13 = obj172 instanceof Number ? (Number) obj172 : null;
            Long lValueOf9 = number13 != null ? Long.valueOf(number13.longValue()) : null;
            if (lValueOf9 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": maxCount参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4437t) Router.f46192a.m56192n(InterfaceC4437t.class)).mo4216b(ctx, str121, lValueOf9.longValue(), new Function2<List<? extends KCFlutterBridgePostPostCoin>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$114
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCFlutterBridgePostPostCoin> list6, ProtocolException protocolException) {
                        invoke2((List<KCFlutterBridgePostPostCoin>) list6, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable List<KCFlutterBridgePostPostCoin> list6, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || list6 == null) {
                            callback.invoke(null, protocolException);
                            return;
                        }
                        Function2<Object, ProtocolException, Unit> function2 = callback;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                        for (KCFlutterBridgePostPostCoin kCFlutterBridgePostPostCoin : list6) {
                            Map<String, Object> map6 = kCFlutterBridgePostPostCoin != null ? kCFlutterBridgePostPostCoin.toMap() : null;
                            if (map6 == null) {
                                map6 = MapsKt.emptyMap();
                            }
                            arrayList2.add(map6);
                        }
                        function2.invoke(CollectionsKt.toList(arrayList2), null);
                    }
                });
                return;
            } catch (Exception e132) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e132), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#post#getFlutterViewDistanceToBottom")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj173 = arguments.get("sence");
            String str122 = obj173 instanceof String ? (String) obj173 : null;
            if (str122 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": sence参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4437t) Router.f46192a.m56192n(InterfaceC4437t.class)).mo4217c(ctx, str122, new Function2<Long, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$115
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
                        callback.invoke(l11, protocolException);
                    }
                });
                return;
            } catch (Exception e133) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e133), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#post#getCountPictureArray")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj174 = arguments.get(BridgeParamKeyKt.MAX_COUNT);
            Number number14 = obj174 instanceof Number ? (Number) obj174 : null;
            Long lValueOf10 = number14 != null ? Long.valueOf(number14.longValue()) : null;
            if (lValueOf10 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": maxCount参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4437t) Router.f46192a.m56192n(InterfaceC4437t.class)).mo4218d(ctx, lValueOf10.longValue(), new Function2<List<? extends String>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$116
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
                        callback.invoke(list6, protocolException);
                    }
                });
                return;
            } catch (Exception e134) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e134), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#post#getCoinsDisplayNames")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj175 = arguments.get("coins");
            List<String> list6 = obj175 instanceof List ? (List) obj175 : null;
            if (list6 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": coins参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4437t) Router.f46192a.m56192n(InterfaceC4437t.class)).mo4215a(ctx, list6, new Function2<List<? extends String>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$117
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
                        callback.invoke(list7, protocolException);
                    }
                });
                return;
            } catch (Exception e135) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e135), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#qrScan#openQrScan")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj176 = arguments.get("bizType");
            String str123 = obj176 instanceof String ? (String) obj176 : null;
            Object obj177 = arguments.get("bizType");
            if (str123 == null && obj177 != null && !Intrinsics.areEqual(obj177, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4438u) Router.f46192a.m56192n(InterfaceC4438u.class)).mo4220b(ctx, str123, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$118
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str124, ProtocolException protocolException) {
                        invoke2(str124, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str124, @Nullable ProtocolException protocolException) {
                        callback.invoke(str124, protocolException);
                    }
                });
                return;
            } catch (Exception e136) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e136), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#qrScan#scanQrCode")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj178 = arguments.get("supportedTypes");
            List list7 = obj178 instanceof List ? (List) obj178 : null;
            if (list7 != null) {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
                Iterator it = list7.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) it.next()).longValue()));
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": supportedTypes参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj179 = arguments.get("callerHandlesUnknownCode");
            Boolean bool14 = obj179 instanceof Boolean ? (Boolean) obj179 : null;
            if (bool14 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": callerHandlesUnknownCode参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4438u) Router.f46192a.m56192n(InterfaceC4438u.class)).mo4219a(ctx, arrayList, bool14.booleanValue(), new Function2<KCFlutterBridgeQrScanScanQrCodeResult, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$119
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgeQrScanScanQrCodeResult kCFlutterBridgeQrScanScanQrCodeResult, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgeQrScanScanQrCodeResult, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgeQrScanScanQrCodeResult kCFlutterBridgeQrScanScanQrCodeResult, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgeQrScanScanQrCodeResult == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgeQrScanScanQrCodeResult.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e137) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e137), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#redpacket#checkRedpacketCodeValid")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj180 = arguments.get("redpacketCode");
            String str124 = obj180 instanceof String ? (String) obj180 : null;
            if (str124 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": redpacketCode参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4439v) Router.f46192a.m56192n(InterfaceC4439v.class)).mo4221a(ctx, str124, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$120
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool15, ProtocolException protocolException) {
                        invoke2(bool15, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool15, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool15, protocolException);
                    }
                });
                return;
            } catch (Exception e138) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e138), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#redpacket#requestRedpacketInfoByCode")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj181 = arguments.get("redpacketCode");
            String str125 = obj181 instanceof String ? (String) obj181 : null;
            if (str125 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": redpacketCode参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4439v) Router.f46192a.m56192n(InterfaceC4439v.class)).mo4222b(ctx, str125, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$121
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool15, ProtocolException protocolException) {
                        invoke2(bool15, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool15, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool15, protocolException);
                    }
                });
                return;
            } catch (Exception e139) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e139), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#remoteConfig#fastFetchAbTest")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj182 = arguments.get("paramName");
            String str126 = obj182 instanceof String ? (String) obj182 : null;
            if (str126 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": paramName参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj183 = arguments.get("defaultValue");
            String str127 = obj183 instanceof String ? (String) obj183 : null;
            if (str127 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": defaultValue参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4440w) Router.f46192a.m56192n(InterfaceC4440w.class)).mo4223a(ctx, str126, str127, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$122
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str128, ProtocolException protocolException) {
                        invoke2(str128, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str128, @Nullable ProtocolException protocolException) {
                        callback.invoke(str128, protocolException);
                    }
                });
                return;
            } catch (Exception e140) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e140), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#remoteConfig#getRemoteConfig")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj184 = arguments.get("key");
            String str128 = obj184 instanceof String ? (String) obj184 : null;
            if (str128 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": key参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4440w) Router.f46192a.m56192n(InterfaceC4440w.class)).mo4224b(ctx, str128, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$123
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
                        callback.invoke(str129, protocolException);
                    }
                });
                return;
            } catch (Exception e141) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e141), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#router#jump2Native")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj185 = arguments.get("url");
            String str129 = obj185 instanceof String ? (String) obj185 : null;
            if (str129 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": url参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4441x) Router.f46192a.m56192n(InterfaceC4441x.class)).mo4225a(ctx, str129, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$124
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool15, ProtocolException protocolException) {
                        invoke2(bool15, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool15, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool15, protocolException);
                    }
                });
                return;
            } catch (Exception e142) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e142), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#safe#getFingerprint")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj186 = arguments.get("event");
            String str130 = obj186 instanceof String ? (String) obj186 : null;
            if (str130 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": event参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4442y) Router.f46192a.m56192n(InterfaceC4442y.class)).m4226a(ctx, str130, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$125
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str131, ProtocolException protocolException) {
                        invoke2(str131, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str131, @Nullable ProtocolException protocolException) {
                        callback.invoke(str131, protocolException);
                    }
                });
                return;
            } catch (Exception e143) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e143), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#safe#isSafeValidationSupportPk")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4442y) Router.f46192a.m56192n(InterfaceC4442y.class)).m4227b(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$126
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool15, ProtocolException protocolException) {
                        invoke2(bool15, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool15, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool15, protocolException);
                    }
                });
                return;
            } catch (Exception e144) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e144), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#safe#advanceLivenessRecognition")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj187 = arguments.get(AppsFlyerProperties.CHANNEL);
            String str131 = obj187 instanceof String ? (String) obj187 : null;
            if (str131 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": channel参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj188 = arguments.get("advanceToken");
            String str132 = obj188 instanceof String ? (String) obj188 : null;
            if (str132 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": advanceToken参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj189 = arguments.get("bizType");
            if (obj189 instanceof String) {
                str4 = (String) obj189;
                str3 = str131;
            } else {
                str3 = str131;
                str4 = null;
            }
            if (str4 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4442y) Router.f46192a.m56192n(InterfaceC4442y.class)).m4228c(ctx, str3, str132, str4, new Function2<KCFlutterBridgeSafeFaceResultInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$127
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCFlutterBridgeSafeFaceResultInfo kCFlutterBridgeSafeFaceResultInfo, ProtocolException protocolException) {
                        invoke2(kCFlutterBridgeSafeFaceResultInfo, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCFlutterBridgeSafeFaceResultInfo kCFlutterBridgeSafeFaceResultInfo, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCFlutterBridgeSafeFaceResultInfo == null) {
                            callback.invoke(null, protocolException);
                        } else {
                            callback.invoke(kCFlutterBridgeSafeFaceResultInfo.toMap(), null);
                        }
                    }
                });
                return;
            } catch (Exception e145) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e145), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#safeValidation#checkSupportVoiceByMobileCode")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj190 = arguments.get(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            String str133 = obj190 instanceof String ? (String) obj190 : null;
            if (str133 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": countryCode参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4411a0) Router.f46192a.m56192n(InterfaceC4411a0.class)).m4084b(ctx, str133, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$128
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool15, ProtocolException protocolException) {
                        invoke2(bool15, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool15, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool15, protocolException);
                    }
                });
                return;
            } catch (Exception e146) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e146), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#safeValidation#safeValidationDialogStatue")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj191 = arguments.get("isDialogShow");
            Boolean bool15 = obj191 instanceof Boolean ? (Boolean) obj191 : null;
            if (bool15 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": isDialogShow参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4411a0) Router.f46192a.m56192n(InterfaceC4411a0.class)).m4083a(ctx, bool15.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$129
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool16, ProtocolException protocolException) {
                        invoke2(bool16, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool16, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool16, protocolException);
                    }
                });
                return;
            } catch (Exception e147) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e147), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#safeValidation#refreshTokenByManual")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj192 = arguments.get("refreshTimeLimit");
            Number number15 = obj192 instanceof Number ? (Number) obj192 : null;
            Long lValueOf11 = number15 != null ? Long.valueOf(number15.longValue()) : null;
            if (lValueOf11 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": refreshTimeLimit参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4411a0) Router.f46192a.m56192n(InterfaceC4411a0.class)).m4086d(ctx, lValueOf11.longValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$130
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool16, ProtocolException protocolException) {
                        invoke2(bool16, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool16, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool16, protocolException);
                    }
                });
                return;
            } catch (Exception e148) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e148), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#safeValidation#openHumanVerifySdk")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj193 = arguments.get("bizType");
            String str134 = obj193 instanceof String ? (String) obj193 : null;
            if (str134 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4411a0) Router.f46192a.m56192n(InterfaceC4411a0.class)).m4085c(ctx, str134, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$131
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool16, ProtocolException protocolException) {
                        invoke2(bool16, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool16, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool16, protocolException);
                    }
                });
                return;
            } catch (Exception e149) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e149), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#safeSetting#checkAndGotoBindEmail")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4443z) Router.f46192a.m56192n(InterfaceC4443z.class)).m4230b(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$132
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool16, ProtocolException protocolException) {
                        invoke2(bool16, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool16, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool16, protocolException);
                    }
                });
                return;
            } catch (Exception e150) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e150), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#safeSetting#checkAndGotoBindPhone")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4443z) Router.f46192a.m56192n(InterfaceC4443z.class)).m4229a(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$133
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool16, ProtocolException protocolException) {
                        invoke2(bool16, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool16, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool16, protocolException);
                    }
                });
                return;
            } catch (Exception e151) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e151), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#search#getMexSymbolShow")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj194 = arguments.get("symbol");
            List<String> list8 = obj194 instanceof List ? (List) obj194 : null;
            if (list8 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4413b0) Router.f46192a.m56192n(InterfaceC4413b0.class)).mo4090a(ctx, list8, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$134
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
                        callback.invoke(map6, protocolException);
                    }
                });
                return;
            } catch (Exception e152) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e152), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#search#getSymbolLevel")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj195 = arguments.get("symbol");
            List<String> list9 = obj195 instanceof List ? (List) obj195 : null;
            if (list9 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj196 = arguments.get("type");
            Number number16 = obj196 instanceof Number ? (Number) obj196 : null;
            Long lValueOf12 = number16 != null ? Long.valueOf(number16.longValue()) : null;
            Object obj197 = arguments.get("type");
            if (lValueOf12 == null && obj197 != null && !Intrinsics.areEqual(obj197, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": type参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4413b0) Router.f46192a.m56192n(InterfaceC4413b0.class)).mo4091b(ctx, list9, lValueOf12, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$135
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
                        callback.invoke(map6, protocolException);
                    }
                });
                return;
            } catch (Exception e153) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e153), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#setting#checkAppVersion")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4415c0) Router.f46192a.m56192n(InterfaceC4415c0.class)).mo4098a(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$136
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool16, ProtocolException protocolException) {
                        invoke2(bool16, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Boolean bool16, @Nullable ProtocolException protocolException) {
                        callback.invoke(bool16, protocolException);
                    }
                });
                return;
            } catch (Exception e154) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e154), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#share#getShareUrl")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj198 = arguments.get("utmSource");
            String str135 = obj198 instanceof String ? (String) obj198 : null;
            if (str135 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": utmSource参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4417d0) Router.f46192a.m56192n(InterfaceC4417d0.class)).mo4111c(ctx, str135, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$137
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str136, ProtocolException protocolException) {
                        invoke2(str136, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str136, @Nullable ProtocolException protocolException) {
                        callback.invoke(str136, protocolException);
                    }
                });
                return;
            } catch (Exception e155) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e155), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#share#shareImg")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj199 = arguments.get("imageData");
            String str136 = obj199 instanceof String ? (String) obj199 : null;
            if (str136 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": imageData参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj200 = arguments.get("utmSource");
            String str137 = obj200 instanceof String ? (String) obj200 : null;
            if (str137 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": utmSource参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj201 = arguments.get(BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE);
            Boolean bool16 = obj201 instanceof Boolean ? (Boolean) obj201 : null;
            if (bool16 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": needQrCode参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj202 = arguments.get("onlyDarkMode");
            Boolean bool17 = obj202 instanceof Boolean ? (Boolean) obj202 : null;
            if (bool17 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": onlyDarkMode参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj203 = arguments.get("shareLink");
            String str138 = obj203 instanceof String ? (String) obj203 : null;
            Object obj204 = arguments.get("shareLink");
            if (str138 == null && obj204 != null && !Intrinsics.areEqual(obj204, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": shareLink参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4417d0) Router.f46192a.m56192n(InterfaceC4417d0.class)).mo4110b(ctx, str136, str137, bool16.booleanValue(), bool17.booleanValue(), str138, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$138
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
                        callback.invoke(bool18, protocolException);
                    }
                });
                return;
            } catch (Exception e156) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e156), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#share#savePhoto")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj205 = arguments.get("imageData");
            String str139 = obj205 instanceof String ? (String) obj205 : null;
            if (str139 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": imageData参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4417d0) Router.f46192a.m56192n(InterfaceC4417d0.class)).mo4109a(ctx, str139, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$139
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
                        callback.invoke(bool18, protocolException);
                    }
                });
                return;
            } catch (Exception e157) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e157), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#site#querySiteVisibleConfig")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj206 = arguments.get("configKey");
            String str140 = obj206 instanceof String ? (String) obj206 : null;
            if (str140 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": configKey参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4419e0) Router.f46192a.m56192n(InterfaceC4419e0.class)).mo4117b(ctx, str140, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$140
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
                        callback.invoke(bool18, protocolException);
                    }
                });
                return;
            } catch (Exception e158) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e158), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#site#querySiteBizConfig")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj207 = arguments.get("configKey");
            String str141 = obj207 instanceof String ? (String) obj207 : null;
            if (str141 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": configKey参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4419e0) Router.f46192a.m56192n(InterfaceC4419e0.class)).mo4116a(ctx, str141, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$141
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str142, ProtocolException protocolException) {
                        invoke2(str142, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str142, @Nullable ProtocolException protocolException) {
                        callback.invoke(str142, protocolException);
                    }
                });
                return;
            } catch (Exception e159) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e159), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#site#querySiteExtConfig")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj208 = arguments.get("configType");
            String str142 = obj208 instanceof String ? (String) obj208 : null;
            if (str142 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": configType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj209 = arguments.get("configKey");
            String str143 = obj209 instanceof String ? (String) obj209 : null;
            if (str143 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": configKey参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4419e0) Router.f46192a.m56192n(InterfaceC4419e0.class)).mo4118c(ctx, str142, str143, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$142
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
                        callback.invoke(str144, protocolException);
                    }
                });
                return;
            } catch (Exception e160) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e160), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#symbol#getCoinIconUrl")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj210 = arguments.get("symbol");
            List<String> list10 = obj210 instanceof List ? (List) obj210 : null;
            if (list10 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4421f0) Router.f46192a.m56192n(InterfaceC4421f0.class)).mo4125a(ctx, list10, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$143
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
                        callback.invoke(map6, protocolException);
                    }
                });
                return;
            } catch (Exception e161) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e161), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#trade#modifyKlineOrder")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj211 = arguments.get("bizType");
            String str144 = obj211 instanceof String ? (String) obj211 : null;
            if (str144 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj212 = arguments.get("orderInfo");
            if (obj212 instanceof String) {
                String str145 = str144;
                str2 = (String) obj212;
                str = str145;
            } else {
                str = str144;
                str2 = null;
            }
            if (str2 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": orderInfo参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj213 = arguments.get("targetPrice");
            String str146 = obj213 instanceof String ? (String) obj213 : null;
            Object obj214 = arguments.get("targetPrice");
            if (str146 == null && obj214 != null && !Intrinsics.areEqual(obj214, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": targetPrice参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4423g0) Router.f46192a.m56192n(InterfaceC4423g0.class)).mo4127a(ctx, str, str2, str146, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$144
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
                        callback.invoke(bool18, protocolException);
                    }
                });
                return;
            } catch (Exception e162) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e162), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#trade#cancelKlineOrder")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj215 = arguments.get("bizType");
            String str147 = obj215 instanceof String ? (String) obj215 : null;
            if (str147 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj216 = arguments.get("orderId");
            String str148 = obj216 instanceof String ? (String) obj216 : null;
            if (str148 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": orderId参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj217 = arguments.get("symbol");
            String str149 = obj217 instanceof String ? (String) obj217 : null;
            if (str149 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            Object obj218 = arguments.get("orderInfo");
            String str150 = obj218 instanceof String ? (String) obj218 : null;
            Object obj219 = arguments.get("orderInfo");
            if (str150 == null && obj219 != null && !Intrinsics.areEqual(obj219, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": orderInfo参数类型不正确"), null, false, 12, null));
                return;
            }
            Object obj220 = arguments.get("tpslOrderInfo");
            String str151 = obj220 instanceof String ? (String) obj220 : null;
            Object obj221 = arguments.get("tpslOrderInfo");
            if (str151 == null && obj221 != null && !Intrinsics.areEqual(obj221, JSONObject.NULL)) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": tpslOrderInfo参数类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4423g0) Router.f46192a.m56192n(InterfaceC4423g0.class)).mo4128b(ctx, str147, str148, str149, str150, str151, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$145
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
                        callback.invoke(bool18, protocolException);
                    }
                });
                return;
            } catch (Exception e163) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e163), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#trade#refreshCardInfo")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            Object obj222 = arguments.get("isRefresh");
            Boolean bool18 = obj222 instanceof Boolean ? (Boolean) obj222 : null;
            if (bool18 == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": isRefresh参数不能为空或类型不正确"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4423g0) Router.f46192a.m56192n(InterfaceC4423g0.class)).mo4130d(ctx, bool18.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$146
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
                        callback.invoke(bool19, protocolException);
                    }
                });
                return;
            } catch (Exception e164) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e164), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#trade#isUtaTrading")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4423g0) Router.f46192a.m56192n(InterfaceC4423g0.class)).mo4129c(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$147
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
                        callback.invoke(bool19, protocolException);
                    }
                });
                return;
            } catch (Exception e165) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e165), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#userCenter#getUserPoliciesInfo")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4425h0) Router.f46192a.m56192n(InterfaceC4425h0.class)).mo4134d(ctx, new Function2<List<? extends KCFlutterBridgeUserCenterUserPoliciesInfo>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$148
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCFlutterBridgeUserCenterUserPoliciesInfo> list11, ProtocolException protocolException) {
                        invoke2((List<KCFlutterBridgeUserCenterUserPoliciesInfo>) list11, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable List<KCFlutterBridgeUserCenterUserPoliciesInfo> list11, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || list11 == null) {
                            callback.invoke(null, protocolException);
                            return;
                        }
                        Function2<Object, ProtocolException, Unit> function2 = callback;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11, 10));
                        for (KCFlutterBridgeUserCenterUserPoliciesInfo kCFlutterBridgeUserCenterUserPoliciesInfo : list11) {
                            Map<String, Object> map6 = kCFlutterBridgeUserCenterUserPoliciesInfo != null ? kCFlutterBridgeUserCenterUserPoliciesInfo.toMap() : null;
                            if (map6 == null) {
                                map6 = MapsKt.emptyMap();
                            }
                            arrayList2.add(map6);
                        }
                        function2.invoke(CollectionsKt.toList(arrayList2), null);
                    }
                });
                return;
            } catch (Exception e166) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e166), null, false, 12, null));
                return;
            }
        }
        if (Intrinsics.areEqual(method, "knb#userCenter#isBackLogin")) {
            if (arguments == null) {
                callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
                return;
            }
            try {
                ((InterfaceC4425h0) Router.f46192a.m56192n(InterfaceC4425h0.class)).mo4133c(ctx, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$149
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
                        callback.invoke(bool19, protocolException);
                    }
                });
                return;
            } catch (Exception e167) {
                callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e167), null, false, 12, null));
                return;
            }
        }
        if (!Intrinsics.areEqual(method, "knb#userCenter#gotoCheckLoginPage")) {
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 该协议方法在端上不存在实现"), null, false, 12, null));
            return;
        }
        if (arguments == null) {
            callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": arguments参数不能为空"), null, false, 12, null));
            return;
        }
        Object obj223 = arguments.get("spmId");
        String str152 = obj223 instanceof String ? (String) obj223 : null;
        Object obj224 = arguments.get("spmId");
        if (str152 == null && obj224 != null && !Intrinsics.areEqual(obj224, JSONObject.NULL)) {
            callback.invoke(null, new ProtocolException("-9001", new RuntimeException(method + ": spmId参数类型不正确"), null, false, 12, null));
            return;
        }
        try {
            ((InterfaceC4425h0) Router.f46192a.m56192n(InterfaceC4425h0.class)).mo4132b(ctx, str152, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.flutter.KCFlutterProtocolManager$_exec$150
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
                    callback.invoke(bool19, protocolException);
                }
            });
        } catch (Exception e168) {
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException(method + ": 没有找到对应实现或者实现有多个, " + e168), null, false, 12, null));
        }
    }
}
