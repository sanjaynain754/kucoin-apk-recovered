package com.kubi.sdk.protocol.hybrid;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import c00.InterfaceC4754a;
import c00.InterfaceC4755b;
import c00.InterfaceC4756c;
import c00.InterfaceC4757d;
import c00.InterfaceC4758e;
import c00.InterfaceC4759f;
import c00.InterfaceC4760g;
import c00.InterfaceC4761h;
import c00.InterfaceC4762i;
import c00.InterfaceC4763j;
import c00.InterfaceC4764k;
import c00.InterfaceC4765l;
import c00.InterfaceC4766m;
import c00.InterfaceC4767n;
import c00.InterfaceC4768o;
import c00.InterfaceC4769p;
import c00.InterfaceC4770q;
import c00.InterfaceC4771r;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.reflect.TypeToken;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeCommonAppCpsInfo;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeCommonAppInfo;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeCommonPermissionInfo;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeFaceSdkFaceInfo;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeOperationLocationInfo;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeRedPackCoverData;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeSafeSafeGuardStatusMap;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeSafeValidationSafeValidationMap;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeShareGalleryDataEntity;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeUserCenterUserInfo;
import com.kubi.utils.C27099x;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCHybridProtocolManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J_\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\n2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/protocol/hybrid/KCHybridProtocolManager;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", FirebaseAnalytics.Param.METHOD, "", "param", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class KCHybridProtocolManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KCHybridProtocolManager f47498a = new KCHybridProtocolManager();

    /* JADX WARN: Code duplicated, block: B:355:0x0c2f  */
    /* JADX WARN: Code duplicated, block: B:357:0x0c58  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Instruction removed from duplicated block: B:355:0x0c2f, please report this as an issue */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m57892a(@NotNull Context context, @Nullable Object obj, @NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull Function2<Object, ? super ProtocolException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        KCHybridProtocolManager$_exec$2 kCHybridProtocolManager$_exec$2;
        Context context2;
        Object obj2;
        InterfaceC4763j interfaceC4763j;
        String str2;
        String str3;
        Context context3;
        Object obj3;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        String str7;
        String str8;
        String str9;
        InterfaceC4766m interfaceC4766m;
        Map<String, ? extends Object> map2;
        Boolean bool2;
        Boolean bool3;
        String str10;
        Boolean bool4;
        String str11;
        Boolean bool5;
        String str12;
        Boolean bool6;
        String str13;
        KCHybridBridgeRedPackCoverData kCHybridBridgeRedPackCoverData;
        KCHybridBridgeShareGalleryDataEntity kCHybridBridgeShareGalleryDataEntity;
        String str14 = str;
        final Function2<Object, ? super ProtocolException, Unit> function3 = function2;
        if (continuation instanceof KCHybridProtocolManager$_exec$2) {
            kCHybridProtocolManager$_exec$2 = (KCHybridProtocolManager$_exec$2) continuation;
            int i11 = kCHybridProtocolManager$_exec$2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kCHybridProtocolManager$_exec$2.label = i11 - Integer.MIN_VALUE;
            } else {
                kCHybridProtocolManager$_exec$2 = new KCHybridProtocolManager$_exec$2(this, continuation);
            }
        } else {
            kCHybridProtocolManager$_exec$2 = new KCHybridProtocolManager$_exec$2(this, continuation);
        }
        Object objM91049g = kCHybridProtocolManager$_exec$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kCHybridProtocolManager$_exec$2.label;
        if (i12 != 0) {
            if (i12 == 1) {
                interfaceC4763j = (InterfaceC4763j) kCHybridProtocolManager$_exec$2.L$4;
                Function2<Object, ? super ProtocolException, Unit> function4 = (Function2) kCHybridProtocolManager$_exec$2.L$3;
                String str15 = (String) kCHybridProtocolManager$_exec$2.L$2;
                Object obj4 = kCHybridProtocolManager$_exec$2.L$1;
                Context context4 = (Context) kCHybridProtocolManager$_exec$2.L$0;
                ResultKt.throwOnFailure(objM91049g);
                function3 = function4;
                context2 = context4;
                str14 = str15;
                obj2 = obj4;
                kCHybridBridgeRedPackCoverData = (KCHybridBridgeRedPackCoverData) objM91049g;
                if (kCHybridBridgeRedPackCoverData == null) {
                    interfaceC4763j.mo4813a(context2, obj2, kCHybridBridgeRedPackCoverData, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$28
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": coverData参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str16 = (String) kCHybridProtocolManager$_exec$2.L$15;
            String str17 = (String) kCHybridProtocolManager$_exec$2.L$14;
            String str18 = (String) kCHybridProtocolManager$_exec$2.L$13;
            String str19 = (String) kCHybridProtocolManager$_exec$2.L$12;
            String str20 = (String) kCHybridProtocolManager$_exec$2.L$11;
            bool2 = (Boolean) kCHybridProtocolManager$_exec$2.L$10;
            bool = (Boolean) kCHybridProtocolManager$_exec$2.L$9;
            str3 = (String) kCHybridProtocolManager$_exec$2.L$8;
            str2 = (String) kCHybridProtocolManager$_exec$2.L$7;
            String str21 = (String) kCHybridProtocolManager$_exec$2.L$6;
            InterfaceC4766m interfaceC4766m2 = (InterfaceC4766m) kCHybridProtocolManager$_exec$2.L$5;
            map2 = (Map) kCHybridProtocolManager$_exec$2.L$4;
            Function2<Object, ? super ProtocolException, Unit> function5 = (Function2) kCHybridProtocolManager$_exec$2.L$3;
            String str22 = (String) kCHybridProtocolManager$_exec$2.L$2;
            Object obj5 = kCHybridProtocolManager$_exec$2.L$1;
            Context context5 = (Context) kCHybridProtocolManager$_exec$2.L$0;
            ResultKt.throwOnFailure(objM91049g);
            str9 = str16;
            obj3 = obj5;
            str8 = str17;
            str4 = str18;
            str6 = str19;
            str7 = str20;
            context3 = context5;
            str5 = str21;
            interfaceC4766m = interfaceC4766m2;
            function3 = function5;
            str14 = str22;
            String str23 = str3;
            String str24 = str2;
            kCHybridBridgeShareGalleryDataEntity = (KCHybridBridgeShareGalleryDataEntity) objM91049g;
            Object obj6 = map2.get("data");
            if (kCHybridBridgeShareGalleryDataEntity == null || obj6 == null || Intrinsics.areEqual(obj6, JSONObject.NULL)) {
                interfaceC4766m.mo4819b(context3, obj3, str5, str24, str23, bool.booleanValue(), bool2.booleanValue(), str7, str6, str4, str8, str9, kCHybridBridgeShareGalleryDataEntity, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$33
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
            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": data参数类型不正确"), null, false, 12, null));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM91049g);
        if (TextUtils.isEmpty(str14)) {
            function3.invoke(null, new ProtocolException("-9001", new RuntimeException("协议标准化: 顶层报文风格不正确"), null, false, 12, null));
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(str14, "getHideAssetsEyeStatus")) {
            try {
                ((InterfaceC4754a) Router.f46192a.m56192n(InterfaceC4754a.class)).mo4790b(context, obj, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$3
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
            } catch (Exception e11) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e11), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "setHideAssetsEyeStatus")) {
            try {
                InterfaceC4754a interfaceC4754a = (InterfaceC4754a) Router.f46192a.m56192n(InterfaceC4754a.class);
                Object obj7 = map.get("isHide");
                Boolean bool7 = obj7 instanceof Boolean ? (Boolean) obj7 : null;
                if (bool7 != null) {
                    interfaceC4754a.mo4789a(context, obj, bool7.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$4
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": isHide参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e12) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e12), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "refreshAppSession")) {
            try {
                ((InterfaceC4755b) Router.f46192a.m56192n(InterfaceC4755b.class)).mo4792b(context, obj, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$5
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
            } catch (Exception e13) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e13), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "getAppVersion")) {
            try {
                ((InterfaceC4755b) Router.f46192a.m56192n(InterfaceC4755b.class)).mo4798h(context, obj, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$6
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str25, ProtocolException protocolException) {
                        invoke2(str25, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str25, @Nullable ProtocolException protocolException) {
                        function3.invoke(str25, protocolException);
                    }
                });
                return Unit.INSTANCE;
            } catch (Exception e14) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e14), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "getAppInfo")) {
            try {
                ((InterfaceC4755b) Router.f46192a.m56192n(InterfaceC4755b.class)).mo4794d(context, obj, new Function2<KCHybridBridgeCommonAppInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$7

                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$7$a */
                    /* JADX INFO: compiled from: GsonUtils.kt */
                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/hybrid/KCHybridProtocolManager$_exec$7$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                    public static final class C23997a extends TypeToken<Map<String, ? extends Object>> {
                    }

                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCHybridBridgeCommonAppInfo kCHybridBridgeCommonAppInfo, ProtocolException protocolException) {
                        invoke2(kCHybridBridgeCommonAppInfo, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCHybridBridgeCommonAppInfo kCHybridBridgeCommonAppInfo, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCHybridBridgeCommonAppInfo == null) {
                            function3.invoke(null, protocolException);
                            return;
                        }
                        String strM66919i = C27099x.m66919i(kCHybridBridgeCommonAppInfo, false, 2, null);
                        if (strM66919i == null) {
                            strM66919i = "";
                        }
                        function3.invoke((Map) C27099x.m66914d(strM66919i, new C23997a().getType()), null);
                    }
                });
                return Unit.INSTANCE;
            } catch (Exception e15) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e15), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "syncCpsFromApp")) {
            try {
                ((InterfaceC4755b) Router.f46192a.m56192n(InterfaceC4755b.class)).mo4799i(context, obj, new Function2<KCHybridBridgeCommonAppCpsInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$8

                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$8$a */
                    /* JADX INFO: compiled from: GsonUtils.kt */
                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/hybrid/KCHybridProtocolManager$_exec$8$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                    public static final class C23998a extends TypeToken<Map<String, ? extends Object>> {
                    }

                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCHybridBridgeCommonAppCpsInfo kCHybridBridgeCommonAppCpsInfo, ProtocolException protocolException) {
                        invoke2(kCHybridBridgeCommonAppCpsInfo, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCHybridBridgeCommonAppCpsInfo kCHybridBridgeCommonAppCpsInfo, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCHybridBridgeCommonAppCpsInfo == null) {
                            function3.invoke(null, protocolException);
                            return;
                        }
                        String strM66919i = C27099x.m66919i(kCHybridBridgeCommonAppCpsInfo, false, 2, null);
                        if (strM66919i == null) {
                            strM66919i = "";
                        }
                        function3.invoke((Map) C27099x.m66914d(strM66919i, new C23998a().getType()), null);
                    }
                });
                return Unit.INSTANCE;
            } catch (Exception e16) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e16), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "exitApp")) {
            try {
                ((InterfaceC4755b) Router.f46192a.m56192n(InterfaceC4755b.class)).mo4800j(context, obj, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$9
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
            } catch (Exception e17) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e17), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "showToast")) {
            try {
                InterfaceC4755b interfaceC4755b = (InterfaceC4755b) Router.f46192a.m56192n(InterfaceC4755b.class);
                Object obj8 = map.get("value");
                String str25 = obj8 instanceof String ? (String) obj8 : null;
                if (str25 != null) {
                    interfaceC4755b.mo4793c(context, obj, str25, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$10
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": value参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e18) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e18), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "getFingerToken")) {
            try {
                InterfaceC4755b interfaceC4755b2 = (InterfaceC4755b) Router.f46192a.m56192n(InterfaceC4755b.class);
                Object obj9 = map.get("event");
                String str26 = obj9 instanceof String ? (String) obj9 : null;
                Object obj10 = map.get("event");
                if (str26 != null || obj10 == null || Intrinsics.areEqual(obj10, JSONObject.NULL)) {
                    interfaceC4755b2.mo4796f(context, obj, str26, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$11
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
                            function3.invoke(str27, protocolException);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": event参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e19) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e19), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "getPasteBoardContent")) {
            try {
                ((InterfaceC4755b) Router.f46192a.m56192n(InterfaceC4755b.class)).mo4795e(context, obj, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$12
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
                        function3.invoke(str27, protocolException);
                    }
                });
                return Unit.INSTANCE;
            } catch (Exception e21) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e21), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "getPermission")) {
            try {
                InterfaceC4755b interfaceC4755b3 = (InterfaceC4755b) Router.f46192a.m56192n(InterfaceC4755b.class);
                Object obj11 = map.get("permissionType");
                String str27 = obj11 instanceof String ? (String) obj11 : null;
                if (str27 != null) {
                    interfaceC4755b3.mo4791a(context, obj, str27, new Function2<KCHybridBridgeCommonPermissionInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$13

                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$13$a */
                        /* JADX INFO: compiled from: GsonUtils.kt */
                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/hybrid/KCHybridProtocolManager$_exec$13$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                        public static final class C23991a extends TypeToken<Map<String, ? extends Object>> {
                        }

                        @Override // p852kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(KCHybridBridgeCommonPermissionInfo kCHybridBridgeCommonPermissionInfo, ProtocolException protocolException) {
                            invoke2(kCHybridBridgeCommonPermissionInfo, protocolException);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@Nullable KCHybridBridgeCommonPermissionInfo kCHybridBridgeCommonPermissionInfo, @Nullable ProtocolException protocolException) {
                            if (protocolException != null || kCHybridBridgeCommonPermissionInfo == null) {
                                function3.invoke(null, protocolException);
                                return;
                            }
                            String strM66919i = C27099x.m66919i(kCHybridBridgeCommonPermissionInfo, false, 2, null);
                            if (strM66919i == null) {
                                strM66919i = "";
                            }
                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C23991a().getType()), null);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": permissionType参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e22) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e22), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "vibrate")) {
            try {
                ((InterfaceC4755b) Router.f46192a.m56192n(InterfaceC4755b.class)).mo4797g(context, obj, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$14
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
            } catch (Exception e23) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e23), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "showAddHomePageDialog")) {
            try {
                InterfaceC4755b interfaceC4755b4 = (InterfaceC4755b) Router.f46192a.m56192n(InterfaceC4755b.class);
                Object obj12 = map.get("shortcutId");
                String str28 = obj12 instanceof String ? (String) obj12 : null;
                Object obj13 = map.get("shortcutId");
                if (str28 != null || obj13 == null || Intrinsics.areEqual(obj13, JSONObject.NULL)) {
                    interfaceC4755b4.showAddHomePageDialog(context, obj, str28, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$15
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": shortcutId参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e24) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e24), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "faceRecognition")) {
            try {
                InterfaceC4756c interfaceC4756c = (InterfaceC4756c) Router.f46192a.m56192n(InterfaceC4756c.class);
                Object obj14 = map.get(AppsFlyerProperties.CHANNEL);
                String str29 = obj14 instanceof String ? (String) obj14 : null;
                if (str29 != null) {
                    Object obj15 = map.get("advanceToken");
                    String str30 = obj15 instanceof String ? (String) obj15 : null;
                    interfaceC4756c.mo4802b(context, obj, str29, str30 != null ? str30 : "", new Function2<KCHybridBridgeFaceSdkFaceInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$16

                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$16$a */
                        /* JADX INFO: compiled from: GsonUtils.kt */
                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/hybrid/KCHybridProtocolManager$_exec$16$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                        public static final class C23992a extends TypeToken<Map<String, ? extends Object>> {
                        }

                        @Override // p852kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(KCHybridBridgeFaceSdkFaceInfo kCHybridBridgeFaceSdkFaceInfo, ProtocolException protocolException) {
                            invoke2(kCHybridBridgeFaceSdkFaceInfo, protocolException);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@Nullable KCHybridBridgeFaceSdkFaceInfo kCHybridBridgeFaceSdkFaceInfo, @Nullable ProtocolException protocolException) {
                            if (protocolException != null || kCHybridBridgeFaceSdkFaceInfo == null) {
                                function3.invoke(null, protocolException);
                                return;
                            }
                            String strM66919i = C27099x.m66919i(kCHybridBridgeFaceSdkFaceInfo, false, 2, null);
                            if (strM66919i == null) {
                                strM66919i = "";
                            }
                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C23992a().getType()), null);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": channel参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e25) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e25), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "openAdvancedCertification")) {
            try {
                InterfaceC4756c interfaceC4756c2 = (InterfaceC4756c) Router.f46192a.m56192n(InterfaceC4756c.class);
                Object obj16 = map.get(AppsFlyerProperties.CHANNEL);
                String str31 = obj16 instanceof String ? (String) obj16 : null;
                if (str31 == null) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": channel参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj17 = map.get("data");
                String str32 = obj17 instanceof String ? (String) obj17 : null;
                if (str32 != null) {
                    interfaceC4756c2.mo4801a(context, obj, str31, str32, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$17
                        @Override // p852kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map3, ProtocolException protocolException) {
                            invoke2(map3, protocolException);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@Nullable Map<String, ? extends Object> map3, @Nullable ProtocolException protocolException) {
                            function3.invoke(map3, protocolException);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": data参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e26) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e26), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "staffService")) {
            try {
                InterfaceC4757d interfaceC4757d = (InterfaceC4757d) Router.f46192a.m56192n(InterfaceC4757d.class);
                Object obj18 = map.get(AppsFlyerProperties.CHANNEL);
                String str33 = obj18 instanceof String ? (String) obj18 : null;
                if (str33 == null) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": channel参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj19 = map.get("source");
                String str34 = obj19 instanceof String ? (String) obj19 : null;
                Object obj20 = map.get("source");
                if (str34 != null || obj20 == null || Intrinsics.areEqual(obj20, JSONObject.NULL)) {
                    interfaceC4757d.mo4803a(context, obj, str33, str34, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$18
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": source参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e27) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e27), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        context2 = context;
        obj2 = obj;
        if (Intrinsics.areEqual(str14, "jumpToSystemNoticeSetting")) {
            try {
                ((InterfaceC4758e) Router.f46192a.m56192n(InterfaceC4758e.class)).mo4804a(context2, obj2, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$19
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
            } catch (Exception e28) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e28), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "getCurrentLocation")) {
            try {
                ((InterfaceC4759f) Router.f46192a.m56192n(InterfaceC4759f.class)).mo4806b(context2, obj2, new Function2<KCHybridBridgeOperationLocationInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$20

                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$20$a */
                    /* JADX INFO: compiled from: GsonUtils.kt */
                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/hybrid/KCHybridProtocolManager$_exec$20$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                    public static final class C23993a extends TypeToken<Map<String, ? extends Object>> {
                    }

                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCHybridBridgeOperationLocationInfo kCHybridBridgeOperationLocationInfo, ProtocolException protocolException) {
                        invoke2(kCHybridBridgeOperationLocationInfo, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCHybridBridgeOperationLocationInfo kCHybridBridgeOperationLocationInfo, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCHybridBridgeOperationLocationInfo == null) {
                            function3.invoke(null, protocolException);
                            return;
                        }
                        String strM66919i = C27099x.m66919i(kCHybridBridgeOperationLocationInfo, false, 2, null);
                        if (strM66919i == null) {
                            strM66919i = "";
                        }
                        function3.invoke((Map) C27099x.m66914d(strM66919i, new C23993a().getType()), null);
                    }
                });
                return Unit.INSTANCE;
            } catch (Exception e29) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e29), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "goAppSystemSettings")) {
            try {
                ((InterfaceC4759f) Router.f46192a.m56192n(InterfaceC4759f.class)).mo4805a(context2, obj2, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$21
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
            } catch (Exception e31) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e31), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "updatePackageVersion")) {
            try {
                InterfaceC4760g interfaceC4760g = (InterfaceC4760g) Router.f46192a.m56192n(InterfaceC4760g.class);
                Object obj21 = map.get(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
                String str35 = obj21 instanceof String ? (String) obj21 : null;
                Object obj22 = map.get(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
                if (str35 == null && obj22 != null && !Intrinsics.areEqual(obj22, JSONObject.NULL)) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": packageName参数类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj23 = map.get("version");
                String str36 = obj23 instanceof String ? (String) obj23 : null;
                Object obj24 = map.get("version");
                if (str36 != null || obj24 == null || Intrinsics.areEqual(obj24, JSONObject.NULL)) {
                    interfaceC4760g.mo4807a(context2, obj2, str35, str36, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$22
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": version参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e32) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e32), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "paymentJumpScanQrcode")) {
            try {
                ((InterfaceC4761h) Router.f46192a.m56192n(InterfaceC4761h.class)).mo4809c(context2, obj2, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$23
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
            } catch (Exception e33) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e33), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "paymentPickContactPhone")) {
            try {
                ((InterfaceC4761h) Router.f46192a.m56192n(InterfaceC4761h.class)).mo4808b(context2, obj2, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$24
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str37, ProtocolException protocolException) {
                        invoke2(str37, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str37, @Nullable ProtocolException protocolException) {
                        function3.invoke(str37, protocolException);
                    }
                });
                return Unit.INSTANCE;
            } catch (Exception e34) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e34), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "bindService")) {
            try {
                InterfaceC4762i interfaceC4762i = (InterfaceC4762i) Router.f46192a.m56192n(InterfaceC4762i.class);
                Object obj25 = map.get(NotificationCompat.CATEGORY_SERVICE);
                String str37 = obj25 instanceof String ? (String) obj25 : null;
                if (str37 != null) {
                    interfaceC4762i.mo4811b(context2, obj2, str37, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$25
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": service参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e35) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e35), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "unbindService")) {
            try {
                InterfaceC4762i interfaceC4762i2 = (InterfaceC4762i) Router.f46192a.m56192n(InterfaceC4762i.class);
                Object obj26 = map.get(NotificationCompat.CATEGORY_SERVICE);
                String str38 = obj26 instanceof String ? (String) obj26 : null;
                if (str38 != null) {
                    interfaceC4762i2.mo4812c(context2, obj2, str38, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$26
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": service参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e36) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e36), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "isSupportNfc")) {
            try {
                ((InterfaceC4762i) Router.f46192a.m56192n(InterfaceC4762i.class)).mo4810a(context2, obj2, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$27
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
            } catch (Exception e37) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e37), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "selectCover")) {
            try {
                InterfaceC4763j interfaceC4763j2 = (InterfaceC4763j) Router.f46192a.m56192n(InterfaceC4763j.class);
                AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                KCHybridProtocolManager$_exec$coverData$1 kCHybridProtocolManager$_exec$coverData$1 = new KCHybridProtocolManager$_exec$coverData$1(map, null);
                kCHybridProtocolManager$_exec$2.L$0 = context2;
                kCHybridProtocolManager$_exec$2.L$1 = obj2;
                kCHybridProtocolManager$_exec$2.L$2 = str14;
                kCHybridProtocolManager$_exec$2.L$3 = function3;
                kCHybridProtocolManager$_exec$2.L$4 = interfaceC4763j2;
                kCHybridProtocolManager$_exec$2.label = 1;
                Object objM91049g2 = C41686h.m91049g(abstractC41697j0M94120b, kCHybridProtocolManager$_exec$coverData$1, kCHybridProtocolManager$_exec$2);
                if (objM91049g2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objM91049g = objM91049g2;
                interfaceC4763j = interfaceC4763j2;
                kCHybridBridgeRedPackCoverData = (KCHybridBridgeRedPackCoverData) objM91049g;
                if (kCHybridBridgeRedPackCoverData == null) {
                    interfaceC4763j.mo4813a(context2, obj2, kCHybridBridgeRedPackCoverData, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$28
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": coverData参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e38) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e38), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "openRedpacketAlert")) {
            try {
                InterfaceC4763j interfaceC4763j3 = (InterfaceC4763j) Router.f46192a.m56192n(InterfaceC4763j.class);
                Object obj27 = map.get("code");
                String str39 = obj27 instanceof String ? (String) obj27 : null;
                if (str39 != null) {
                    interfaceC4763j3.mo4814b(context2, obj2, str39, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$29
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": code参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e39) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e39), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "getSafeGuardStatus")) {
            try {
                ((InterfaceC4764k) Router.f46192a.m56192n(InterfaceC4764k.class)).m4815a(context2, obj2, new Function2<KCHybridBridgeSafeSafeGuardStatusMap, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$30

                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$30$a */
                    /* JADX INFO: compiled from: GsonUtils.kt */
                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/hybrid/KCHybridProtocolManager$_exec$30$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                    public static final class C23994a extends TypeToken<Map<String, ? extends Object>> {
                    }

                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCHybridBridgeSafeSafeGuardStatusMap kCHybridBridgeSafeSafeGuardStatusMap, ProtocolException protocolException) {
                        invoke2(kCHybridBridgeSafeSafeGuardStatusMap, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCHybridBridgeSafeSafeGuardStatusMap kCHybridBridgeSafeSafeGuardStatusMap, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCHybridBridgeSafeSafeGuardStatusMap == null) {
                            function3.invoke(null, protocolException);
                            return;
                        }
                        String strM66919i = C27099x.m66919i(kCHybridBridgeSafeSafeGuardStatusMap, false, 2, null);
                        if (strM66919i == null) {
                            strM66919i = "";
                        }
                        function3.invoke((Map) C27099x.m66914d(strM66919i, new C23994a().getType()), null);
                    }
                });
                return Unit.INSTANCE;
            } catch (Exception e41) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e41), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "fetchSafeGuardData")) {
            try {
                ((InterfaceC4764k) Router.f46192a.m56192n(InterfaceC4764k.class)).m4816b(context2, obj2, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$31
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map3, ProtocolException protocolException) {
                        invoke2(map3, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Map<String, ? extends Object> map3, @Nullable ProtocolException protocolException) {
                        function3.invoke(map3, protocolException);
                    }
                });
                return Unit.INSTANCE;
            } catch (Exception e42) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e42), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "openSafeValidation")) {
            try {
                InterfaceC4765l interfaceC4765l = (InterfaceC4765l) Router.f46192a.m56192n(InterfaceC4765l.class);
                Object obj28 = map.get("bizType");
                String str40 = obj28 instanceof String ? (String) obj28 : null;
                if (str40 == null) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj29 = map.get("businessData");
                String str41 = obj29 instanceof String ? (String) obj29 : null;
                if (str41 != null) {
                    interfaceC4765l.m4817a(context2, obj2, str40, str41, new Function2<KCHybridBridgeSafeValidationSafeValidationMap, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$32

                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$32$a */
                        /* JADX INFO: compiled from: GsonUtils.kt */
                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/hybrid/KCHybridProtocolManager$_exec$32$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                        public static final class C23995a extends TypeToken<Map<String, ? extends Object>> {
                        }

                        @Override // p852kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(KCHybridBridgeSafeValidationSafeValidationMap kCHybridBridgeSafeValidationSafeValidationMap, ProtocolException protocolException) {
                            invoke2(kCHybridBridgeSafeValidationSafeValidationMap, protocolException);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@Nullable KCHybridBridgeSafeValidationSafeValidationMap kCHybridBridgeSafeValidationSafeValidationMap, @Nullable ProtocolException protocolException) {
                            if (protocolException != null || kCHybridBridgeSafeValidationSafeValidationMap == null) {
                                function3.invoke(null, protocolException);
                                return;
                            }
                            String strM66919i = C27099x.m66919i(kCHybridBridgeSafeValidationSafeValidationMap, false, 2, null);
                            if (strM66919i == null) {
                                strM66919i = "";
                            }
                            function3.invoke((Map) C27099x.m66914d(strM66919i, new C23995a().getType()), null);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": businessData参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e43) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e43), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, FirebaseAnalytics.Event.SHARE)) {
            try {
                InterfaceC4766m interfaceC4766m3 = (InterfaceC4766m) Router.f46192a.m56192n(InterfaceC4766m.class);
                Object obj30 = map.get("category");
                String str42 = obj30 instanceof String ? (String) obj30 : null;
                if (str42 == null) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": category参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj31 = map.get("utmSource");
                str2 = obj31 instanceof String ? (String) obj31 : null;
                if (str2 == null) {
                    str2 = "";
                }
                Object obj32 = map.get("rcode");
                str3 = obj32 instanceof String ? (String) obj32 : null;
                if (str3 == null) {
                    str3 = "";
                }
                Object obj33 = map.get(BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE);
                Boolean boolBoxBoolean = obj33 instanceof Boolean ? (Boolean) obj33 : null;
                if (boolBoxBoolean == null) {
                    boolBoxBoolean = Boxing.boxBoolean(false);
                }
                Object obj34 = map.get("onlyDarkMode");
                Boolean boolBoxBoolean2 = obj34 instanceof Boolean ? (Boolean) obj34 : null;
                if (boolBoxBoolean2 == null) {
                    boolBoxBoolean2 = Boxing.boxBoolean(false);
                }
                Object obj35 = map.get(BridgeParamKeyKt.SHARE_KEY_PIC);
                String str43 = obj35 instanceof String ? (String) obj35 : null;
                Object obj36 = map.get(BridgeParamKeyKt.SHARE_KEY_PIC);
                if (str43 == null && obj36 != null) {
                    if (!Intrinsics.areEqual(obj36, JSONObject.NULL)) {
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": pic参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                Object obj37 = map.get("qrCodeUrl");
                String str44 = obj37 instanceof String ? (String) obj37 : null;
                Object obj38 = map.get("qrCodeUrl");
                if (str44 == null && obj38 != null) {
                    if (!Intrinsics.areEqual(obj38, JSONObject.NULL)) {
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": qrCodeUrl参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                Object obj39 = map.get("title");
                String str45 = obj39 instanceof String ? (String) obj39 : null;
                Object obj40 = map.get("title");
                if (str45 == null && obj40 != null && !Intrinsics.areEqual(obj40, JSONObject.NULL)) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": title参数类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj41 = map.get("content");
                String str46 = obj41 instanceof String ? (String) obj41 : null;
                Object obj42 = map.get("content");
                if (str46 == null && obj42 != null) {
                    if (!Intrinsics.areEqual(obj42, JSONObject.NULL)) {
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": content参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                Object obj43 = map.get(BridgeParamKeyKt.SHARE_KEY_LINKURL);
                String str47 = obj43 instanceof String ? (String) obj43 : null;
                Object obj44 = map.get(BridgeParamKeyKt.SHARE_KEY_LINKURL);
                if (str47 == null && obj44 != null) {
                    if (!Intrinsics.areEqual(obj44, JSONObject.NULL)) {
                        function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": linkUrl参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                AbstractC41697j0 abstractC41697j0M94120b2 = C42911a.m94120b();
                KCHybridProtocolManager$_exec$data$1 kCHybridProtocolManager$_exec$data$1 = new KCHybridProtocolManager$_exec$data$1(map, null);
                kCHybridProtocolManager$_exec$2.L$0 = context2;
                kCHybridProtocolManager$_exec$2.L$1 = obj2;
                kCHybridProtocolManager$_exec$2.L$2 = str14;
                kCHybridProtocolManager$_exec$2.L$3 = function3;
                kCHybridProtocolManager$_exec$2.L$4 = map;
                kCHybridProtocolManager$_exec$2.L$5 = interfaceC4766m3;
                kCHybridProtocolManager$_exec$2.L$6 = str42;
                kCHybridProtocolManager$_exec$2.L$7 = str2;
                kCHybridProtocolManager$_exec$2.L$8 = str3;
                kCHybridProtocolManager$_exec$2.L$9 = boolBoxBoolean;
                kCHybridProtocolManager$_exec$2.L$10 = boolBoxBoolean2;
                kCHybridProtocolManager$_exec$2.L$11 = str43;
                String str48 = str44;
                kCHybridProtocolManager$_exec$2.L$12 = str48;
                kCHybridProtocolManager$_exec$2.L$13 = str45;
                kCHybridProtocolManager$_exec$2.L$14 = str46;
                kCHybridProtocolManager$_exec$2.L$15 = str47;
                kCHybridProtocolManager$_exec$2.label = 2;
                objM91049g = C41686h.m91049g(abstractC41697j0M94120b2, kCHybridProtocolManager$_exec$data$1, kCHybridProtocolManager$_exec$2);
                if (objM91049g == coroutine_suspended) {
                    return coroutine_suspended;
                }
                context3 = context2;
                obj3 = obj2;
                str4 = str45;
                str5 = str42;
                str6 = str48;
                bool = boolBoxBoolean;
                str7 = str43;
                str8 = str46;
                str9 = str47;
                interfaceC4766m = interfaceC4766m3;
                map2 = map;
                bool2 = boolBoxBoolean2;
                String str210 = str3;
                String str211 = str2;
                kCHybridBridgeShareGalleryDataEntity = (KCHybridBridgeShareGalleryDataEntity) objM91049g;
                Object obj45 = map2.get("data");
                if (kCHybridBridgeShareGalleryDataEntity == null) {
                }
                interfaceC4766m.mo4819b(context3, obj3, str5, str211, str210, bool.booleanValue(), bool2.booleanValue(), str7, str6, str4, str8, str9, kCHybridBridgeShareGalleryDataEntity, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$33
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
            } catch (Exception e44) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e44), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "saveShareImage")) {
            try {
                InterfaceC4766m interfaceC4766m4 = (InterfaceC4766m) Router.f46192a.m56192n(InterfaceC4766m.class);
                Object obj46 = map.get("imgData");
                String str49 = obj46 instanceof String ? (String) obj46 : null;
                if (str49 != null) {
                    interfaceC4766m4.mo4818a(context2, obj2, str49, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$34
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": imgData参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e45) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e45), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "startChangeSite")) {
            try {
                InterfaceC4767n interfaceC4767n = (InterfaceC4767n) Router.f46192a.m56192n(InterfaceC4767n.class);
                Object obj47 = map.get("siteType");
                String str50 = obj47 instanceof String ? (String) obj47 : null;
                if (str50 != null) {
                    interfaceC4767n.mo4820a(context2, obj2, str50, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$35
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": siteType参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e46) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e46), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "getSiteConfig")) {
            try {
                ((InterfaceC4768o) Router.f46192a.m56192n(InterfaceC4768o.class)).mo4821a(context2, obj2, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$36
                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str51, ProtocolException protocolException) {
                        invoke2(str51, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable String str51, @Nullable ProtocolException protocolException) {
                        function3.invoke(str51, protocolException);
                    }
                });
                return Unit.INSTANCE;
            } catch (Exception e47) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e47), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "afTrack")) {
            try {
                InterfaceC4769p interfaceC4769p = (InterfaceC4769p) Router.f46192a.m56192n(InterfaceC4769p.class);
                Object obj48 = map.get("eventId");
                String str51 = obj48 instanceof String ? (String) obj48 : null;
                if (str51 == null) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": eventId参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj49 = map.get(ReportDataTable.COLUMN_PARAMS);
                String str52 = obj49 instanceof String ? (String) obj49 : null;
                Object obj50 = map.get(ReportDataTable.COLUMN_PARAMS);
                if (str52 != null || obj50 == null || Intrinsics.areEqual(obj50, JSONObject.NULL)) {
                    interfaceC4769p.mo4822a(context2, obj2, str51, str52, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$37
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": params参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e48) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e48), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "getTradePwd")) {
            try {
                InterfaceC4770q interfaceC4770q = (InterfaceC4770q) Router.f46192a.m56192n(InterfaceC4770q.class);
                Object obj51 = map.get("url");
                String str53 = obj51 instanceof String ? (String) obj51 : null;
                Object obj52 = map.get("url");
                if (str53 == null && obj52 != null && !Intrinsics.areEqual(obj52, JSONObject.NULL)) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": url参数类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj53 = map.get("bizType");
                String str54 = obj53 instanceof String ? (String) obj53 : null;
                Object obj54 = map.get("bizType");
                if (str54 == null && obj54 != null && !Intrinsics.areEqual(obj54, JSONObject.NULL)) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": bizType参数类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj55 = map.get("h5Type");
                String str55 = obj55 instanceof String ? (String) obj55 : null;
                Object obj56 = map.get("h5Type");
                if (str55 != null || obj56 == null || Intrinsics.areEqual(obj56, JSONObject.NULL)) {
                    interfaceC4770q.m4826d(context, obj, str53, str54, str55, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$38
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
                }
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": h5Type参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e49) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e49), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "refreshAppUser")) {
            try {
                ((InterfaceC4770q) Router.f46192a.m56192n(InterfaceC4770q.class)).m4824b(context, obj, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$39
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
            } catch (Exception e51) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e51), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "logout")) {
            try {
                ((InterfaceC4770q) Router.f46192a.m56192n(InterfaceC4770q.class)).m4833k(context, obj, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$40
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
            } catch (Exception e52) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e52), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "updateSettings")) {
            try {
                InterfaceC4770q interfaceC4770q2 = (InterfaceC4770q) Router.f46192a.m56192n(InterfaceC4770q.class);
                Object obj57 = map.get(FirebaseAnalytics.Param.CURRENCY);
                String str56 = obj57 instanceof String ? (String) obj57 : null;
                Object obj58 = map.get(FirebaseAnalytics.Param.CURRENCY);
                if (str56 == null && obj58 != null && !Intrinsics.areEqual(obj58, JSONObject.NULL)) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": currency参数类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj59 = map.get("language");
                String str57 = obj59 instanceof String ? (String) obj59 : null;
                Object obj60 = map.get("language");
                if (str57 != null || obj60 == null || Intrinsics.areEqual(obj60, JSONObject.NULL)) {
                    interfaceC4770q2.m4834l(context, obj, str56, str57, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$41
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": language参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e53) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e53), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "getUserInfo")) {
            try {
                ((InterfaceC4770q) Router.f46192a.m56192n(InterfaceC4770q.class)).m4828f(context, obj, new Function2<KCHybridBridgeUserCenterUserInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$42

                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$42$a */
                    /* JADX INFO: compiled from: GsonUtils.kt */
                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/hybrid/KCHybridProtocolManager$_exec$42$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                    public static final class C23996a extends TypeToken<Map<String, ? extends Object>> {
                    }

                    @Override // p852kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(KCHybridBridgeUserCenterUserInfo kCHybridBridgeUserCenterUserInfo, ProtocolException protocolException) {
                        invoke2(kCHybridBridgeUserCenterUserInfo, protocolException);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable KCHybridBridgeUserCenterUserInfo kCHybridBridgeUserCenterUserInfo, @Nullable ProtocolException protocolException) {
                        if (protocolException != null || kCHybridBridgeUserCenterUserInfo == null) {
                            function3.invoke(null, protocolException);
                            return;
                        }
                        String strM66919i = C27099x.m66919i(kCHybridBridgeUserCenterUserInfo, false, 2, null);
                        if (strM66919i == null) {
                            strM66919i = "";
                        }
                        function3.invoke((Map) C27099x.m66914d(strM66919i, new C23996a().getType()), null);
                    }
                });
                return Unit.INSTANCE;
            } catch (Exception e54) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e54), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "gotoCheckLoginPage")) {
            try {
                InterfaceC4770q interfaceC4770q3 = (InterfaceC4770q) Router.f46192a.m56192n(InterfaceC4770q.class);
                Object obj61 = map.get("spmId");
                String str58 = obj61 instanceof String ? (String) obj61 : null;
                Object obj62 = map.get("spmId");
                if (str58 != null || obj62 == null || Intrinsics.areEqual(obj62, JSONObject.NULL)) {
                    interfaceC4770q3.m4825c(context, obj, str58, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$43
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": spmId参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e55) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e55), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "createPasskey")) {
            try {
                InterfaceC4770q interfaceC4770q4 = (InterfaceC4770q) Router.f46192a.m56192n(InterfaceC4770q.class);
                Object obj63 = map.get("bizType");
                String str59 = obj63 instanceof String ? (String) obj63 : null;
                if (str59 == null) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj64 = map.get("businessData");
                String str60 = obj64 instanceof String ? (String) obj64 : null;
                if (str60 != null) {
                    interfaceC4770q4.m4832j(context, obj, str59, str60, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$44
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": businessData参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e56) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e56), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "localLogout")) {
            try {
                ((InterfaceC4770q) Router.f46192a.m56192n(InterfaceC4770q.class)).m4829g(context, obj, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$45
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
            } catch (Exception e57) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e57), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "asyncRefreshAppUser")) {
            try {
                ((InterfaceC4770q) Router.f46192a.m56192n(InterfaceC4770q.class)).m4830h(context, obj, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$46
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
            } catch (Exception e58) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e58), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "updateSafeSetting")) {
            try {
                InterfaceC4770q interfaceC4770q5 = (InterfaceC4770q) Router.f46192a.m56192n(InterfaceC4770q.class);
                Object obj65 = map.get("jumpToLogin");
                Boolean bool8 = obj65 instanceof Boolean ? (Boolean) obj65 : null;
                Object obj66 = map.get("jumpToLogin");
                if (bool8 != null || obj66 == null || Intrinsics.areEqual(obj66, JSONObject.NULL)) {
                    interfaceC4770q5.m4831i(context, obj, bool8, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$47
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": jumpToLogin参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e59) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e59), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "isDeviceSupportPasskey")) {
            try {
                ((InterfaceC4770q) Router.f46192a.m56192n(InterfaceC4770q.class)).m4823a(context, obj, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$48
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
            } catch (Exception e61) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e61), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (Intrinsics.areEqual(str14, "jumpToHomePage")) {
            try {
                ((InterfaceC4770q) Router.f46192a.m56192n(InterfaceC4770q.class)).m4827e(context, obj, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$49
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
            } catch (Exception e62) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e62), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        if (!Intrinsics.areEqual(str14, "updateHeader")) {
            if (Intrinsics.areEqual(str14, "exit")) {
                try {
                    InterfaceC4771r interfaceC4771r = (InterfaceC4771r) Router.f46192a.m56192n(InterfaceC4771r.class);
                    Object obj67 = map.get("appPopAnimated");
                    Boolean boolBoxBoolean3 = obj67 instanceof Boolean ? (Boolean) obj67 : null;
                    if (boolBoxBoolean3 == null) {
                        boolBoxBoolean3 = Boxing.boxBoolean(true);
                    }
                    interfaceC4771r.exit(context, obj, boolBoxBoolean3.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$51
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
                } catch (Exception e63) {
                    function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e63), null, false, 12, null));
                    return Unit.INSTANCE;
                }
            }
            if (Intrinsics.areEqual(str14, "setWebViewScrollBarVisible")) {
                try {
                    InterfaceC4771r interfaceC4771r2 = (InterfaceC4771r) Router.f46192a.m56192n(InterfaceC4771r.class);
                    Object obj68 = map.get(BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE);
                    Boolean bool9 = obj68 instanceof Boolean ? (Boolean) obj68 : null;
                    if (bool9 != null) {
                        interfaceC4771r2.mo4836b(context, obj, bool9.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$52
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
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": enable参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                } catch (Exception e64) {
                    function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e64), null, false, 12, null));
                    return Unit.INSTANCE;
                }
            }
            if (!Intrinsics.areEqual(str14, RNConstantKt.SEND_PAGE_MOUNT)) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 该协议方法在端上不存在实现"), null, false, 12, null));
                return Unit.INSTANCE;
            }
            try {
                InterfaceC4771r interfaceC4771r3 = (InterfaceC4771r) Router.f46192a.m56192n(InterfaceC4771r.class);
                Object obj69 = map.get("pageType");
                String str61 = obj69 instanceof String ? (String) obj69 : null;
                Object obj70 = map.get("pageType");
                if (str61 == null && obj70 != null && !Intrinsics.areEqual(obj70, JSONObject.NULL)) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": pageType参数类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj71 = map.get("dclTime");
                Number number = obj71 instanceof Number ? (Number) obj71 : null;
                Double dBoxDouble = number != null ? Boxing.boxDouble(number.doubleValue()) : null;
                Object obj72 = map.get("dclTime");
                if (dBoxDouble == null && obj72 != null && !Intrinsics.areEqual(obj72, JSONObject.NULL)) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": dclTime参数类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj73 = map.get("currentProjectName");
                String str62 = obj73 instanceof String ? (String) obj73 : null;
                Object obj74 = map.get("currentProjectName");
                if (str62 == null && obj74 != null && !Intrinsics.areEqual(obj74, JSONObject.NULL)) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": currentProjectName参数类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj75 = map.get("currentProjectVersion");
                String str63 = obj75 instanceof String ? (String) obj75 : null;
                Object obj76 = map.get("currentProjectVersion");
                if (str63 != null || obj76 == null || Intrinsics.areEqual(obj76, JSONObject.NULL)) {
                    interfaceC4771r3.mo4837c(context, obj, str61, dBoxDouble, str62, str63, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$53
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
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": currentProjectVersion参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Exception e65) {
                function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e65), null, false, 12, null));
                return Unit.INSTANCE;
            }
        }
        try {
            InterfaceC4771r interfaceC4771r4 = (InterfaceC4771r) Router.f46192a.m56192n(InterfaceC4771r.class);
            Object obj77 = map.get(ViewProps.VISIBLE);
            Boolean boolBoxBoolean4 = obj77 instanceof Boolean ? (Boolean) obj77 : null;
            if (boolBoxBoolean4 == null) {
                boolBoxBoolean4 = Boxing.boxBoolean(true);
            }
            Object obj78 = map.get("statusBarTransparent");
            Boolean boolBoxBoolean5 = obj78 instanceof Boolean ? (Boolean) obj78 : null;
            if (boolBoxBoolean5 == null) {
                boolBoxBoolean5 = Boxing.boxBoolean(false);
            }
            Object obj79 = map.get("leftVisible");
            Boolean boolBoxBoolean6 = obj79 instanceof Boolean ? (Boolean) obj79 : null;
            if (boolBoxBoolean6 == null) {
                boolBoxBoolean6 = Boxing.boxBoolean(true);
            }
            Object obj80 = map.get("rightVisible");
            Boolean boolBoxBoolean7 = obj80 instanceof Boolean ? (Boolean) obj80 : null;
            if (boolBoxBoolean7 == null) {
                boolBoxBoolean7 = Boxing.boxBoolean(true);
            }
            Object obj81 = map.get("title");
            String str64 = obj81 instanceof String ? (String) obj81 : null;
            Object obj82 = map.get("title");
            if (str64 == null && obj82 != null && !Intrinsics.areEqual(obj82, JSONObject.NULL)) {
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": title参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            }
            Object obj83 = map.get("titleColor");
            String str65 = obj83 instanceof String ? (String) obj83 : null;
            Object obj84 = map.get("titleColor");
            if (str65 == null && obj84 != null && !Intrinsics.areEqual(obj84, JSONObject.NULL)) {
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": titleColor参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            }
            Object obj85 = map.get("background");
            String str66 = obj85 instanceof String ? (String) obj85 : null;
            Object obj86 = map.get("background");
            if (str66 == null && obj86 != null && !Intrinsics.areEqual(obj86, JSONObject.NULL)) {
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": background参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            }
            Object obj87 = map.get("statusBarIsLightMode");
            Boolean bool10 = obj87 instanceof Boolean ? (Boolean) obj87 : null;
            Object obj88 = map.get("statusBarIsLightMode");
            if (bool10 == null && obj88 != null && !Intrinsics.areEqual(obj88, JSONObject.NULL)) {
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": statusBarIsLightMode参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            }
            Object obj89 = map.get("leftIcon");
            String str67 = obj89 instanceof String ? (String) obj89 : null;
            Object obj90 = map.get("leftIcon");
            if (str67 == null && obj90 != null && !Intrinsics.areEqual(obj90, JSONObject.NULL)) {
                function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": leftIcon参数类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            }
            Object obj91 = map.get("leftTint");
            if (obj91 instanceof String) {
                str10 = (String) obj91;
                bool3 = boolBoxBoolean7;
            } else {
                bool3 = boolBoxBoolean7;
                str10 = null;
            }
            Object obj92 = map.get("leftTint");
            if (str10 == null && obj92 != null) {
                if (!Intrinsics.areEqual(obj92, JSONObject.NULL)) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": leftTint参数类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
            }
            Object obj93 = map.get("leadIcon");
            if (obj93 instanceof String) {
                str11 = (String) obj93;
                bool4 = boolBoxBoolean5;
            } else {
                bool4 = boolBoxBoolean5;
                str11 = null;
            }
            Object obj94 = map.get("leadIcon");
            if (str11 == null && obj94 != null) {
                if (!Intrinsics.areEqual(obj94, JSONObject.NULL)) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": leadIcon参数类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
            }
            Object obj95 = map.get("trailIcon");
            if (obj95 instanceof String) {
                str12 = (String) obj95;
                bool5 = boolBoxBoolean6;
            } else {
                bool5 = boolBoxBoolean6;
                str12 = null;
            }
            Object obj96 = map.get("trailIcon");
            if (str12 == null && obj96 != null) {
                if (!Intrinsics.areEqual(obj96, JSONObject.NULL)) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": trailIcon参数类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
            }
            Object obj97 = map.get("rightIcon");
            String str68 = obj97 instanceof String ? (String) obj97 : null;
            Object obj98 = map.get("rightIcon");
            if (str68 == null && obj98 != null) {
                if (!Intrinsics.areEqual(obj98, JSONObject.NULL)) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": rightIcon参数类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
            }
            Object obj99 = map.get("rightTint");
            if (obj99 instanceof String) {
                str13 = (String) obj99;
                bool6 = bool3;
            } else {
                bool6 = bool3;
                str13 = null;
            }
            Object obj100 = map.get("rightTint");
            if (str13 != null || obj100 == null || Intrinsics.areEqual(obj100, JSONObject.NULL)) {
                interfaceC4771r4.mo4835a(context, obj, boolBoxBoolean4.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), str64, str65, str66, bool10, str67, str10, str11, str12, str68, str13, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$50
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
                        function3.invoke(bool11, protocolException);
                    }
                });
                return Unit.INSTANCE;
            }
            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": rightTint参数类型不正确"), null, false, 12, null));
            return Unit.INSTANCE;
        } catch (Exception e66) {
            function3.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现, " + e66), null, false, 12, null));
            return Unit.INSTANCE;
        }
    }
}
