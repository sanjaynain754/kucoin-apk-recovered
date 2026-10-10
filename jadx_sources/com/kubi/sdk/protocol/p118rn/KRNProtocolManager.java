package com.kubi.sdk.protocol.p118rn;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCommonAppCpsInfo;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTraderTotalPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTradingEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingLeadTraderTotalPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingLeadTradingEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingOptionShareInfo;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingShareFooterInfo;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeMarketVisitorFavoriteEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeShareGalleryDataEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeUserCenterUserInfo;
import com.kubi.utils.C27099x;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import e00.InterfaceC37009a;
import e00.InterfaceC37010b;
import e00.InterfaceC37011c;
import e00.InterfaceC37012d;
import e00.InterfaceC37013e;
import e00.InterfaceC37014f;
import e00.InterfaceC37015g;
import e00.InterfaceC37016h;
import e00.InterfaceC37017i;
import e00.InterfaceC37018j;
import e00.InterfaceC37019k;
import e00.InterfaceC37020l;
import h00.C38070a;
import java.util.ArrayList;
import java.util.HashMap;
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

/* JADX INFO: compiled from: KRNProtocolManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJM\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/protocol/rn/KRNProtocolManager;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "Ljava/util/HashMap;", "", "param", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "b", "(Landroid/content/Context;Ljava/util/HashMap;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/util/HashMap;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class KRNProtocolManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KRNProtocolManager f47506a = new KRNProtocolManager();

    /* JADX WARN: Code duplicated, block: B:1107:0x12d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1113:0x14fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1129:0x13e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1141:0x0f9e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1173:0x11c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1185:0x10b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x0f23  */
    /* JADX WARN: Code duplicated, block: B:399:0x0f4f  */
    /* JADX WARN: Code duplicated, block: B:402:0x0f6b  */
    /* JADX WARN: Code duplicated, block: B:405:0x0f75  */
    /* JADX WARN: Code duplicated, block: B:424:0x1034  */
    /* JADX WARN: Code duplicated, block: B:426:0x1060  */
    /* JADX WARN: Code duplicated, block: B:429:0x107d  */
    /* JADX WARN: Code duplicated, block: B:432:0x1087  */
    /* JADX WARN: Code duplicated, block: B:451:0x1146  */
    /* JADX WARN: Code duplicated, block: B:453:0x1172  */
    /* JADX WARN: Code duplicated, block: B:456:0x118f  */
    /* JADX WARN: Code duplicated, block: B:459:0x1199  */
    /* JADX WARN: Code duplicated, block: B:478:0x1258  */
    /* JADX WARN: Code duplicated, block: B:480:0x1284  */
    /* JADX WARN: Code duplicated, block: B:483:0x12a2  */
    /* JADX WARN: Code duplicated, block: B:486:0x12ac  */
    /* JADX WARN: Code duplicated, block: B:505:0x136c  */
    /* JADX WARN: Code duplicated, block: B:507:0x1398  */
    /* JADX WARN: Code duplicated, block: B:510:0x13b6  */
    /* JADX WARN: Code duplicated, block: B:513:0x13c0  */
    /* JADX WARN: Code duplicated, block: B:532:0x1480  */
    /* JADX WARN: Code duplicated, block: B:534:0x14ac  */
    /* JADX WARN: Code duplicated, block: B:537:0x14ca  */
    /* JADX WARN: Code duplicated, block: B:540:0x14d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Instruction removed from duplicated block: B:397:0x0f23, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:405:0x0f75, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:424:0x1034, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:432:0x1087, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:451:0x1146, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:459:0x1199, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:478:0x1258, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:486:0x12ac, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:505:0x136c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:513:0x13c0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:532:0x1480, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:540:0x14d4, please report this as an issue */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m57901a(@NotNull Context context, @NotNull HashMap<String, Object> map, @NotNull Function2<Object, ? super ProtocolException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        KRNProtocolManager$_exec$1 kRNProtocolManager$_exec$1;
        String str;
        HashMap map2;
        String str2;
        String str3;
        Boolean bool;
        Boolean bool2;
        Context context2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Function2<Object, ? super ProtocolException, Unit> function3;
        Function2<Object, ? super ProtocolException, Unit> function4;
        Function2<Object, ? super ProtocolException, Unit> function5;
        Function2<Object, ? super ProtocolException, Unit> function6;
        Function2<Object, ? super ProtocolException, Unit> function7;
        Function2<Object, ? super ProtocolException, Unit> function8;
        KCBridgeCopyTradingOptionShareInfo kCBridgeCopyTradingOptionShareInfo;
        Object objM91049g;
        KCBridgeCopyTradingOptionShareInfo kCBridgeCopyTradingOptionShareInfo2;
        Context context3;
        final Function2<Object, ? super ProtocolException, Unit> function9;
        String str10;
        KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo;
        KCBridgeCopyTradingCopyTradingEntity kCBridgeCopyTradingCopyTradingEntity;
        Object objM91049g2;
        KCBridgeCopyTradingCopyTradingEntity kCBridgeCopyTradingCopyTradingEntity2;
        Context context4;
        final Function2<Object, ? super ProtocolException, Unit> function10;
        String str11;
        KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo2;
        KCBridgeCopyTradingLeadTraderTotalPnlEntity kCBridgeCopyTradingLeadTraderTotalPnlEntity;
        Object objM91049g3;
        KCBridgeCopyTradingLeadTraderTotalPnlEntity kCBridgeCopyTradingLeadTraderTotalPnlEntity2;
        Context context5;
        final Function2<Object, ? super ProtocolException, Unit> function11;
        String str12;
        KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo3;
        KCBridgeCopyTradingCopyTraderTotalPnlEntity kCBridgeCopyTradingCopyTraderTotalPnlEntity;
        Object objM91049g4;
        KCBridgeCopyTradingCopyTraderTotalPnlEntity kCBridgeCopyTradingCopyTraderTotalPnlEntity2;
        Context context6;
        final Function2<Object, ? super ProtocolException, Unit> function12;
        String str13;
        KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo4;
        KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;
        Object objM91049g5;
        KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity2;
        Context context7;
        final Function2<Object, ? super ProtocolException, Unit> function13;
        String str14;
        KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo5;
        KCBridgeCopyTradingLeadTradingEntity kCBridgeCopyTradingLeadTradingEntity;
        Object objM91049g6;
        KCBridgeCopyTradingLeadTradingEntity kCBridgeCopyTradingLeadTradingEntity2;
        Context context8;
        final Function2<Object, ? super ProtocolException, Unit> function14;
        String str15;
        KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo6;
        KCBridgeShareGalleryDataEntity kCBridgeShareGalleryDataEntity;
        Context context9 = context;
        final Function2<Object, ? super ProtocolException, Unit> function15 = function2;
        if (continuation instanceof KRNProtocolManager$_exec$1) {
            kRNProtocolManager$_exec$1 = (KRNProtocolManager$_exec$1) continuation;
            int i11 = kRNProtocolManager$_exec$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kRNProtocolManager$_exec$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kRNProtocolManager$_exec$1 = new KRNProtocolManager$_exec$1(this, continuation);
            }
        } else {
            kRNProtocolManager$_exec$1 = new KRNProtocolManager$_exec$1(this, continuation);
        }
        Object objM91049g7 = kRNProtocolManager$_exec$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        String str16 = "data";
        String str17 = ": 没有找到对应实现或者实现有多个, ";
        switch (kRNProtocolManager$_exec$1.label) {
            case 0:
                ResultKt.throwOnFailure(objM91049g7);
                Object obj = map.get(FirebaseAnalytics.Param.METHOD);
                str = obj instanceof String ? (String) obj : null;
                if (TextUtils.isEmpty(str)) {
                    function15.invoke(null, new ProtocolException("-9001", new RuntimeException("协议标准化: method不能为空"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                Object obj2 = map.get("arguments");
                map2 = obj2 instanceof HashMap ? (HashMap) obj2 : null;
                if (Intrinsics.areEqual(str, "knb#assets#getHideAssetsEyeStatus")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37009a) Router.f46192a.m56192n(InterfaceC37009a.class)).mo82831b(context9, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$2
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
                                function15.invoke(bool3, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e11) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e11), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#assets#setHideAssetsEyeStatus")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    Object obj3 = map2.get("isHide");
                    Boolean bool3 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                    if (bool3 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": isHide参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37009a) Router.f46192a.m56192n(InterfaceC37009a.class)).mo82834e(context9, bool3.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$3
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e12) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e12), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#assets#getPnlCalcMethod")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37009a) Router.f46192a.m56192n(InterfaceC37009a.class)).mo82835f(context9, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$4
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e13) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e13), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#assets#getPnlClaudeConfigOpen")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37009a) Router.f46192a.m56192n(InterfaceC37009a.class)).mo82832c(context9, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$5
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e14) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e14), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#assets#setPnlCalcMethod")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    Object obj4 = map2.get(FirebaseAnalytics.Param.METHOD);
                    String str18 = obj4 instanceof String ? (String) obj4 : null;
                    if (str18 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str18 + ": method参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37009a) Router.f46192a.m56192n(InterfaceC37009a.class)).mo82830a(context9, str18, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$6
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e15) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str18 + ": 没有找到对应实现或者实现有多个, " + e15), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#assets#getPnlMethodNewTipDismissed")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37009a) Router.f46192a.m56192n(InterfaceC37009a.class)).mo82833d(context9, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$7
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e16) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e16), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#assets#setPnlMethodNewTipDismissed")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37009a) Router.f46192a.m56192n(InterfaceC37009a.class)).mo82836g(context9, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$8
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e17) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e17), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#calendar#getPermission")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37010b) Router.f46192a.m56192n(InterfaceC37010b.class)).getPermission(context9, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$9
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(String str19, ProtocolException protocolException) {
                                invoke2(str19, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable String str19, @Nullable ProtocolException protocolException) {
                                function15.invoke(str19, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e18) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e18), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#calendar#requestPermission")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37010b) Router.f46192a.m56192n(InterfaceC37010b.class)).requestPermission(context9, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$10
                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(String str19, ProtocolException protocolException) {
                                invoke2(str19, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable String str19, @Nullable ProtocolException protocolException) {
                                function15.invoke(str19, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e19) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e19), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#calendar#queryCalendar")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    Object obj5 = map2.get("data");
                    Map map3 = obj5 instanceof Map ? (Map) obj5 : null;
                    Map<String, ? extends Object> mapM57904b = map3 != null ? C24086a.m57904b(map3) : null;
                    if (mapM57904b == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": data参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37010b) Router.f46192a.m56192n(InterfaceC37010b.class)).queryCalendar(context9, mapM57904b, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$11
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
                                function15.invoke(map4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e21) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e21), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#calendar#updateCalendarItem")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    Object obj6 = map2.get("eventType");
                    String str19 = obj6 instanceof String ? (String) obj6 : null;
                    if (str19 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": eventType参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    Object obj7 = map2.get("data");
                    Map map4 = obj7 instanceof Map ? (Map) obj7 : null;
                    Map<String, ? extends Object> mapM57904b2 = map4 != null ? C24086a.m57904b(map4) : null;
                    if (mapM57904b2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": data参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37010b) Router.f46192a.m56192n(InterfaceC37010b.class)).updateCalendarItem(context9, str19, mapM57904b2, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$12
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
                                function15.invoke(map5, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e22) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e22), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#calendar#deleteCalendarItem")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    Object obj8 = map2.get("data");
                    Map map5 = obj8 instanceof Map ? (Map) obj8 : null;
                    Map<String, ? extends Object> mapM57904b3 = map5 != null ? C24086a.m57904b(map5) : null;
                    if (mapM57904b3 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": data参数不能为空或类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37010b) Router.f46192a.m56192n(InterfaceC37010b.class)).deleteCalendarItem(context9, mapM57904b3, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$13
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
                                function15.invoke(map6, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e23) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e23), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#common#refreshAppUserInfo")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37011c) Router.f46192a.m56192n(InterfaceC37011c.class)).refreshAppUserInfo(context9, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$14
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e24) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e24), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#common#reload")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37011c) Router.f46192a.m56192n(InterfaceC37011c.class)).reload(context9, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$15
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e25) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e25), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#common#sharePageView")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    Object obj9 = map2.get("qrCodeUrl");
                    String str20 = obj9 instanceof String ? (String) obj9 : null;
                    Object obj10 = map2.get("qrCodeUrl");
                    if (str20 == null && obj10 != null && !Intrinsics.areEqual(obj10, JSONObject.NULL)) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": qrCodeUrl参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37011c) Router.f46192a.m56192n(InterfaceC37011c.class)).sharePageView(context9, str20, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$16
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e26) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e26), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#common#vibrate")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37011c) Router.f46192a.m56192n(InterfaceC37011c.class)).vibrate(context9, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$17
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e27) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e27), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#common#onPageMount")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    Object obj11 = map2.get("subPath");
                    String str21 = obj11 instanceof String ? (String) obj11 : null;
                    Object obj12 = map2.get("subPath");
                    if (str21 == null && obj12 != null && !Intrinsics.areEqual(obj12, JSONObject.NULL)) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": subPath参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37011c) Router.f46192a.m56192n(InterfaceC37011c.class)).onPageMount(context9, str21, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$18
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e28) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e28), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#common#showAddHomePageDialog")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    Object obj13 = map2.get("shortcutId");
                    String str22 = obj13 instanceof String ? (String) obj13 : null;
                    Object obj14 = map2.get("shortcutId");
                    if (str22 == null && obj14 != null && !Intrinsics.areEqual(obj14, JSONObject.NULL)) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": shortcutId参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37011c) Router.f46192a.m56192n(InterfaceC37011c.class)).showAddHomePageDialog(context9, str22, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$19
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e29) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e29), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#common#syncCpsFromApp")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37011c) Router.f46192a.m56192n(InterfaceC37011c.class)).syncCpsFromApp(context9, new Function2<KCBridgeCommonAppCpsInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$20

                            /* JADX INFO: renamed from: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$20$a */
                            /* JADX INFO: compiled from: GsonUtils.kt */
                            @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/rn/KRNProtocolManager$_exec$20$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                            @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                            public static final class C24055a extends TypeToken<Map<String, ? extends Object>> {
                            }

                            @Override // p852kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(KCBridgeCommonAppCpsInfo kCBridgeCommonAppCpsInfo, ProtocolException protocolException) {
                                invoke2(kCBridgeCommonAppCpsInfo, protocolException);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable KCBridgeCommonAppCpsInfo kCBridgeCommonAppCpsInfo, @Nullable ProtocolException protocolException) {
                                if (protocolException != null || kCBridgeCommonAppCpsInfo == null) {
                                    function15.invoke(null, protocolException);
                                    return;
                                }
                                String strM66919i = C27099x.m66919i(kCBridgeCommonAppCpsInfo, false, 2, null);
                                if (strM66919i == null) {
                                    strM66919i = "";
                                }
                                function15.invoke((Map) C27099x.m66914d(strM66919i, new C24055a().getType()), null);
                            }
                        });
                        break;
                    } catch (Exception e31) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e31), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#common#closeDialog")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    Object obj15 = map2.get("dialogId");
                    String str23 = obj15 instanceof String ? (String) obj15 : null;
                    Object obj16 = map2.get("dialogId");
                    if (str23 == null && obj16 != null && !Intrinsics.areEqual(obj16, JSONObject.NULL)) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": dialogId参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37011c) Router.f46192a.m56192n(InterfaceC37011c.class)).closeDialog(context9, str23, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$21
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e32) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e32), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#common#submitData")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    Object obj17 = map2.get("dialogId");
                    String str24 = obj17 instanceof String ? (String) obj17 : null;
                    Object obj18 = map2.get("dialogId");
                    if (str24 == null && obj18 != null && !Intrinsics.areEqual(obj18, JSONObject.NULL)) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": dialogId参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    Object obj19 = map2.get("data");
                    String str25 = obj19 instanceof String ? (String) obj19 : null;
                    Object obj20 = map2.get("data");
                    if (str25 == null && obj20 != null && !Intrinsics.areEqual(obj20, JSONObject.NULL)) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": data参数类型不正确"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    try {
                        ((InterfaceC37011c) Router.f46192a.m56192n(InterfaceC37011c.class)).submitData(context9, str24, str25, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$22
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
                                function15.invoke(bool4, protocolException);
                            }
                        });
                        break;
                    } catch (Exception e33) {
                        function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e33), null, false, 12, null));
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(str, "knb#copyTrading#shareOptionPosition")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                    KRNProtocolManager$_exec$optionShareInfo$1 kRNProtocolManager$_exec$optionShareInfo$1 = new KRNProtocolManager$_exec$optionShareInfo$1(map2, null);
                    kRNProtocolManager$_exec$1.L$0 = context9;
                    kRNProtocolManager$_exec$1.L$1 = function15;
                    kRNProtocolManager$_exec$1.L$2 = str;
                    kRNProtocolManager$_exec$1.L$3 = map2;
                    kRNProtocolManager$_exec$1.label = 1;
                    objM91049g7 = C41686h.m91049g(abstractC41697j0M94120b, kRNProtocolManager$_exec$optionShareInfo$1, kRNProtocolManager$_exec$1);
                    if (objM91049g7 != coroutine_suspended) {
                        function8 = function15;
                        kCBridgeCopyTradingOptionShareInfo = (KCBridgeCopyTradingOptionShareInfo) objM91049g7;
                        if (kCBridgeCopyTradingOptionShareInfo == null) {
                            function8.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": optionShareInfo参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        AbstractC41697j0 abstractC41697j0M94120b2 = C42911a.m94120b();
                        KRNProtocolManager$_exec$footerInfo$1 kRNProtocolManager$_exec$footerInfo$1 = new KRNProtocolManager$_exec$footerInfo$1(map2, null);
                        kRNProtocolManager$_exec$1.L$0 = context9;
                        kRNProtocolManager$_exec$1.L$1 = function8;
                        kRNProtocolManager$_exec$1.L$2 = str;
                        kRNProtocolManager$_exec$1.L$3 = kCBridgeCopyTradingOptionShareInfo;
                        kRNProtocolManager$_exec$1.label = 2;
                        objM91049g = C41686h.m91049g(abstractC41697j0M94120b2, kRNProtocolManager$_exec$footerInfo$1, kRNProtocolManager$_exec$1);
                        if (objM91049g != coroutine_suspended) {
                            objM91049g7 = objM91049g;
                            kCBridgeCopyTradingOptionShareInfo2 = kCBridgeCopyTradingOptionShareInfo;
                            context3 = context9;
                            function9 = function8;
                            str10 = str;
                            kCBridgeCopyTradingShareFooterInfo = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                            if (kCBridgeCopyTradingShareFooterInfo == null) {
                                function9.invoke(null, new ProtocolException("-9001", new RuntimeException(str10 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82843g(context3, kCBridgeCopyTradingOptionShareInfo2, kCBridgeCopyTradingShareFooterInfo, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$23
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
                                        function9.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e34) {
                                function9.invoke(null, new ProtocolException("-9003", new RuntimeException(str10 + ": 没有找到对应实现或者实现有多个, " + e34), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else if (Intrinsics.areEqual(str, "knb#copyTrading#shareCopyTradingPosition")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    AbstractC41697j0 abstractC41697j0M94120b3 = C42911a.m94120b();
                    KRNProtocolManager$_exec$copyTradingData$1 kRNProtocolManager$_exec$copyTradingData$1 = new KRNProtocolManager$_exec$copyTradingData$1(map2, null);
                    kRNProtocolManager$_exec$1.L$0 = context9;
                    kRNProtocolManager$_exec$1.L$1 = function15;
                    kRNProtocolManager$_exec$1.L$2 = str;
                    kRNProtocolManager$_exec$1.L$3 = map2;
                    kRNProtocolManager$_exec$1.label = 3;
                    objM91049g7 = C41686h.m91049g(abstractC41697j0M94120b3, kRNProtocolManager$_exec$copyTradingData$1, kRNProtocolManager$_exec$1);
                    if (objM91049g7 != coroutine_suspended) {
                        function7 = function15;
                        kCBridgeCopyTradingCopyTradingEntity = (KCBridgeCopyTradingCopyTradingEntity) objM91049g7;
                        if (kCBridgeCopyTradingCopyTradingEntity == null) {
                            function7.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": copyTradingData参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        AbstractC41697j0 abstractC41697j0M94120b4 = C42911a.m94120b();
                        KRNProtocolManager$_exec$footerInfo$2 kRNProtocolManager$_exec$footerInfo$2 = new KRNProtocolManager$_exec$footerInfo$2(map2, null);
                        kRNProtocolManager$_exec$1.L$0 = context9;
                        kRNProtocolManager$_exec$1.L$1 = function7;
                        kRNProtocolManager$_exec$1.L$2 = str;
                        kRNProtocolManager$_exec$1.L$3 = kCBridgeCopyTradingCopyTradingEntity;
                        kRNProtocolManager$_exec$1.label = 4;
                        objM91049g2 = C41686h.m91049g(abstractC41697j0M94120b4, kRNProtocolManager$_exec$footerInfo$2, kRNProtocolManager$_exec$1);
                        if (objM91049g2 != coroutine_suspended) {
                            objM91049g7 = objM91049g2;
                            kCBridgeCopyTradingCopyTradingEntity2 = kCBridgeCopyTradingCopyTradingEntity;
                            context4 = context9;
                            function10 = function7;
                            str11 = str;
                            kCBridgeCopyTradingShareFooterInfo2 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                            if (kCBridgeCopyTradingShareFooterInfo2 == null) {
                                function10.invoke(null, new ProtocolException("-9001", new RuntimeException(str11 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82844h(context4, kCBridgeCopyTradingCopyTradingEntity2, kCBridgeCopyTradingShareFooterInfo2, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$24
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
                                        function10.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e35) {
                                function10.invoke(null, new ProtocolException("-9003", new RuntimeException(str11 + ": 没有找到对应实现或者实现有多个, " + e35), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else if (Intrinsics.areEqual(str, "knb#copyTrading#shareLeadTraderTotalPnl")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    AbstractC41697j0 abstractC41697j0M94120b5 = C42911a.m94120b();
                    KRNProtocolManager$_exec$leadTraderTotalPnlData$1 kRNProtocolManager$_exec$leadTraderTotalPnlData$1 = new KRNProtocolManager$_exec$leadTraderTotalPnlData$1(map2, null);
                    kRNProtocolManager$_exec$1.L$0 = context9;
                    kRNProtocolManager$_exec$1.L$1 = function15;
                    kRNProtocolManager$_exec$1.L$2 = str;
                    kRNProtocolManager$_exec$1.L$3 = map2;
                    kRNProtocolManager$_exec$1.label = 5;
                    objM91049g7 = C41686h.m91049g(abstractC41697j0M94120b5, kRNProtocolManager$_exec$leadTraderTotalPnlData$1, kRNProtocolManager$_exec$1);
                    if (objM91049g7 != coroutine_suspended) {
                        function6 = function15;
                        kCBridgeCopyTradingLeadTraderTotalPnlEntity = (KCBridgeCopyTradingLeadTraderTotalPnlEntity) objM91049g7;
                        if (kCBridgeCopyTradingLeadTraderTotalPnlEntity == null) {
                            function6.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": leadTraderTotalPnlData参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        AbstractC41697j0 abstractC41697j0M94120b6 = C42911a.m94120b();
                        KRNProtocolManager$_exec$footerInfo$3 kRNProtocolManager$_exec$footerInfo$3 = new KRNProtocolManager$_exec$footerInfo$3(map2, null);
                        kRNProtocolManager$_exec$1.L$0 = context9;
                        kRNProtocolManager$_exec$1.L$1 = function6;
                        kRNProtocolManager$_exec$1.L$2 = str;
                        kRNProtocolManager$_exec$1.L$3 = kCBridgeCopyTradingLeadTraderTotalPnlEntity;
                        kRNProtocolManager$_exec$1.label = 6;
                        objM91049g3 = C41686h.m91049g(abstractC41697j0M94120b6, kRNProtocolManager$_exec$footerInfo$3, kRNProtocolManager$_exec$1);
                        if (objM91049g3 != coroutine_suspended) {
                            objM91049g7 = objM91049g3;
                            kCBridgeCopyTradingLeadTraderTotalPnlEntity2 = kCBridgeCopyTradingLeadTraderTotalPnlEntity;
                            context5 = context9;
                            function11 = function6;
                            str12 = str;
                            kCBridgeCopyTradingShareFooterInfo3 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                            if (kCBridgeCopyTradingShareFooterInfo3 == null) {
                                function11.invoke(null, new ProtocolException("-9001", new RuntimeException(str12 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82838b(context5, kCBridgeCopyTradingLeadTraderTotalPnlEntity2, kCBridgeCopyTradingShareFooterInfo3, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$25
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
                                        function11.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e36) {
                                function11.invoke(null, new ProtocolException("-9003", new RuntimeException(str12 + ": 没有找到对应实现或者实现有多个, " + e36), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else if (Intrinsics.areEqual(str, "knb#copyTrading#shareCopyTraderTotalPnl")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    AbstractC41697j0 abstractC41697j0M94120b7 = C42911a.m94120b();
                    KRNProtocolManager$_exec$copyTraderTotalPnlData$1 kRNProtocolManager$_exec$copyTraderTotalPnlData$1 = new KRNProtocolManager$_exec$copyTraderTotalPnlData$1(map2, null);
                    kRNProtocolManager$_exec$1.L$0 = context9;
                    kRNProtocolManager$_exec$1.L$1 = function15;
                    kRNProtocolManager$_exec$1.L$2 = str;
                    kRNProtocolManager$_exec$1.L$3 = map2;
                    kRNProtocolManager$_exec$1.label = 7;
                    objM91049g7 = C41686h.m91049g(abstractC41697j0M94120b7, kRNProtocolManager$_exec$copyTraderTotalPnlData$1, kRNProtocolManager$_exec$1);
                    if (objM91049g7 != coroutine_suspended) {
                        function5 = function15;
                        kCBridgeCopyTradingCopyTraderTotalPnlEntity = (KCBridgeCopyTradingCopyTraderTotalPnlEntity) objM91049g7;
                        if (kCBridgeCopyTradingCopyTraderTotalPnlEntity == null) {
                            function5.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": copyTraderTotalPnlData参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        AbstractC41697j0 abstractC41697j0M94120b8 = C42911a.m94120b();
                        KRNProtocolManager$_exec$footerInfo$4 kRNProtocolManager$_exec$footerInfo$4 = new KRNProtocolManager$_exec$footerInfo$4(map2, null);
                        kRNProtocolManager$_exec$1.L$0 = context9;
                        kRNProtocolManager$_exec$1.L$1 = function5;
                        kRNProtocolManager$_exec$1.L$2 = str;
                        kRNProtocolManager$_exec$1.L$3 = kCBridgeCopyTradingCopyTraderTotalPnlEntity;
                        kRNProtocolManager$_exec$1.label = 8;
                        objM91049g4 = C41686h.m91049g(abstractC41697j0M94120b8, kRNProtocolManager$_exec$footerInfo$4, kRNProtocolManager$_exec$1);
                        if (objM91049g4 != coroutine_suspended) {
                            objM91049g7 = objM91049g4;
                            kCBridgeCopyTradingCopyTraderTotalPnlEntity2 = kCBridgeCopyTradingCopyTraderTotalPnlEntity;
                            context6 = context9;
                            function12 = function5;
                            str13 = str;
                            kCBridgeCopyTradingShareFooterInfo4 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                            if (kCBridgeCopyTradingShareFooterInfo4 == null) {
                                function12.invoke(null, new ProtocolException("-9001", new RuntimeException(str13 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82837a(context6, kCBridgeCopyTradingCopyTraderTotalPnlEntity2, kCBridgeCopyTradingShareFooterInfo4, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$26
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
                                        function12.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e37) {
                                function12.invoke(null, new ProtocolException("-9003", new RuntimeException(str13 + ": 没有找到对应实现或者实现有多个, " + e37), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else if (Intrinsics.areEqual(str, "knb#copyTrading#shareCopyTraderFollowOneTraderPnl")) {
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    AbstractC41697j0 abstractC41697j0M94120b9 = C42911a.m94120b();
                    KRNProtocolManager$_exec$copyTraderFollowOneTraderPnlData$1 kRNProtocolManager$_exec$copyTraderFollowOneTraderPnlData$1 = new KRNProtocolManager$_exec$copyTraderFollowOneTraderPnlData$1(map2, null);
                    kRNProtocolManager$_exec$1.L$0 = context9;
                    kRNProtocolManager$_exec$1.L$1 = function15;
                    kRNProtocolManager$_exec$1.L$2 = str;
                    kRNProtocolManager$_exec$1.L$3 = map2;
                    kRNProtocolManager$_exec$1.label = 9;
                    objM91049g7 = C41686h.m91049g(abstractC41697j0M94120b9, kRNProtocolManager$_exec$copyTraderFollowOneTraderPnlData$1, kRNProtocolManager$_exec$1);
                    if (objM91049g7 != coroutine_suspended) {
                        function4 = function15;
                        kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity = (KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity) objM91049g7;
                        if (kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity == null) {
                            function4.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": copyTraderFollowOneTraderPnlData参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        AbstractC41697j0 abstractC41697j0M94120b10 = C42911a.m94120b();
                        KRNProtocolManager$_exec$footerInfo$5 kRNProtocolManager$_exec$footerInfo$5 = new KRNProtocolManager$_exec$footerInfo$5(map2, null);
                        kRNProtocolManager$_exec$1.L$0 = context9;
                        kRNProtocolManager$_exec$1.L$1 = function4;
                        kRNProtocolManager$_exec$1.L$2 = str;
                        kRNProtocolManager$_exec$1.L$3 = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;
                        kRNProtocolManager$_exec$1.label = 10;
                        objM91049g5 = C41686h.m91049g(abstractC41697j0M94120b10, kRNProtocolManager$_exec$footerInfo$5, kRNProtocolManager$_exec$1);
                        if (objM91049g5 != coroutine_suspended) {
                            objM91049g7 = objM91049g5;
                            kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity2 = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;
                            context7 = context9;
                            function13 = function4;
                            str14 = str;
                            kCBridgeCopyTradingShareFooterInfo5 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                            if (kCBridgeCopyTradingShareFooterInfo5 == null) {
                                function13.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82839c(context7, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity2, kCBridgeCopyTradingShareFooterInfo5, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$27
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
                                        function13.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e38) {
                                function13.invoke(null, new ProtocolException("-9003", new RuntimeException(str14 + ": 没有找到对应实现或者实现有多个, " + e38), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    if (!Intrinsics.areEqual(str, "knb#copyTrading#shareLeadUserInfo")) {
                        if (Intrinsics.areEqual(str, "knb#copyTrading#requestFutureMarketClosePosition")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj21 = map2.get("subUid");
                            String str26 = obj21 instanceof String ? (String) obj21 : null;
                            if (str26 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": subUid参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj22 = map2.get("positionJson");
                            String str27 = obj22 instanceof String ? (String) obj22 : null;
                            if (str27 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": positionJson参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82845j(context9, str26, str27, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$29
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
                                        function15.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e39) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e39), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#copyTrading#requestFuturePositionTpSl")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj23 = map2.get("subUid");
                            String str28 = obj23 instanceof String ? (String) obj23 : null;
                            if (str28 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": subUid参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj24 = map2.get("positionJson");
                            String str29 = obj24 instanceof String ? (String) obj24 : null;
                            if (str29 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": positionJson参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82840d(context9, str28, str29, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$30
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
                                        function15.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e41) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e41), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#copyTrading#requestRefreshCopyTradingAccountInfo")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82842f(context9, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$31
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
                                        function15.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e42) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e42), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#market#getAlphaFavoriteList")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37013e) Router.f46192a.m56192n(InterfaceC37013e.class)).mo52226f(context9, new Function2<List<? extends KCBridgeMarketVisitorFavoriteEntity>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$32

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$32$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/rn/KRNProtocolManager$_exec$32$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24056a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCBridgeMarketVisitorFavoriteEntity> list, ProtocolException protocolException) {
                                        invoke2((List<KCBridgeMarketVisitorFavoriteEntity>) list, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable List<KCBridgeMarketVisitorFavoriteEntity> list, @Nullable ProtocolException protocolException) {
                                        String strM66919i;
                                        if (protocolException != null || list == null) {
                                            function15.invoke(null, protocolException);
                                            return;
                                        }
                                        Function2<Object, ProtocolException, Unit> function16 = function15;
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                        for (KCBridgeMarketVisitorFavoriteEntity kCBridgeMarketVisitorFavoriteEntity : list) {
                                            String str30 = "";
                                            if (kCBridgeMarketVisitorFavoriteEntity != null && (strM66919i = C27099x.m66919i(kCBridgeMarketVisitorFavoriteEntity, false, 2, null)) != null) {
                                                str30 = strM66919i;
                                            }
                                            C27099x c27099x = C27099x.f54458a;
                                            arrayList.add((Map) C27099x.m66914d(str30, new C24056a().getType()));
                                        }
                                        function16.invoke(CollectionsKt.toList(arrayList), null);
                                    }
                                });
                                break;
                            } catch (Exception e43) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e43), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#market#isAlphaFavorite")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj25 = map2.get("tokenChain");
                            String str30 = obj25 instanceof String ? (String) obj25 : null;
                            if (str30 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": tokenChain参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37013e) Router.f46192a.m56192n(InterfaceC37013e.class)).mo52229i(context9, str30, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$33
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
                                        function15.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e44) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e44), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#market#changeAlphaFavorite")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj26 = map2.get("tokenChain");
                            String str31 = obj26 instanceof String ? (String) obj26 : null;
                            if (str31 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": tokenChain参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37013e) Router.f46192a.m56192n(InterfaceC37013e.class)).mo52228h(context9, str31, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$34
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
                                        function15.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e45) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e45), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#market#getSpotFavoriteList")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37013e) Router.f46192a.m56192n(InterfaceC37013e.class)).mo52225e(context9, new Function2<List<? extends KCBridgeMarketVisitorFavoriteEntity>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$35

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$35$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/rn/KRNProtocolManager$_exec$35$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24057a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCBridgeMarketVisitorFavoriteEntity> list, ProtocolException protocolException) {
                                        invoke2((List<KCBridgeMarketVisitorFavoriteEntity>) list, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable List<KCBridgeMarketVisitorFavoriteEntity> list, @Nullable ProtocolException protocolException) {
                                        String strM66919i;
                                        if (protocolException != null || list == null) {
                                            function15.invoke(null, protocolException);
                                            return;
                                        }
                                        Function2<Object, ProtocolException, Unit> function16 = function15;
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                        for (KCBridgeMarketVisitorFavoriteEntity kCBridgeMarketVisitorFavoriteEntity : list) {
                                            String str32 = "";
                                            if (kCBridgeMarketVisitorFavoriteEntity != null && (strM66919i = C27099x.m66919i(kCBridgeMarketVisitorFavoriteEntity, false, 2, null)) != null) {
                                                str32 = strM66919i;
                                            }
                                            C27099x c27099x = C27099x.f54458a;
                                            arrayList.add((Map) C27099x.m66914d(str32, new C24057a().getType()));
                                        }
                                        function16.invoke(CollectionsKt.toList(arrayList), null);
                                    }
                                });
                                break;
                            } catch (Exception e46) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e46), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#market#isSpotFavorite")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj27 = map2.get("symbol");
                            String str32 = obj27 instanceof String ? (String) obj27 : null;
                            if (str32 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37013e) Router.f46192a.m56192n(InterfaceC37013e.class)).mo52224d(context9, str32, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$36
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
                                        function15.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e47) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e47), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#market#changeSpotFavorite")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj28 = map2.get("symbol");
                            String str33 = obj28 instanceof String ? (String) obj28 : null;
                            if (str33 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37013e) Router.f46192a.m56192n(InterfaceC37013e.class)).mo52222b(context9, str33, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$37
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
                                        function15.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e48) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e48), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#market#getFutureFavoriteList")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37013e) Router.f46192a.m56192n(InterfaceC37013e.class)).mo52227g(context9, new Function2<List<? extends KCBridgeMarketVisitorFavoriteEntity>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$38

                                    /* JADX INFO: renamed from: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$38$a */
                                    /* JADX INFO: compiled from: GsonUtils.kt */
                                    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/rn/KRNProtocolManager$_exec$38$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                    public static final class C24058a extends TypeToken<Map<String, ? extends Object>> {
                                    }

                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends KCBridgeMarketVisitorFavoriteEntity> list, ProtocolException protocolException) {
                                        invoke2((List<KCBridgeMarketVisitorFavoriteEntity>) list, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable List<KCBridgeMarketVisitorFavoriteEntity> list, @Nullable ProtocolException protocolException) {
                                        String strM66919i;
                                        if (protocolException != null || list == null) {
                                            function15.invoke(null, protocolException);
                                            return;
                                        }
                                        Function2<Object, ProtocolException, Unit> function16 = function15;
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                        for (KCBridgeMarketVisitorFavoriteEntity kCBridgeMarketVisitorFavoriteEntity : list) {
                                            String str34 = "";
                                            if (kCBridgeMarketVisitorFavoriteEntity != null && (strM66919i = C27099x.m66919i(kCBridgeMarketVisitorFavoriteEntity, false, 2, null)) != null) {
                                                str34 = strM66919i;
                                            }
                                            C27099x c27099x = C27099x.f54458a;
                                            arrayList.add((Map) C27099x.m66914d(str34, new C24058a().getType()));
                                        }
                                        function16.invoke(CollectionsKt.toList(arrayList), null);
                                    }
                                });
                                break;
                            } catch (Exception e49) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e49), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#market#isFutureFavorite")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj29 = map2.get("symbol");
                            String str34 = obj29 instanceof String ? (String) obj29 : null;
                            if (str34 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37013e) Router.f46192a.m56192n(InterfaceC37013e.class)).mo52223c(context9, str34, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$39
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
                                        function15.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e51) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e51), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#market#changeFutureFavorite")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj30 = map2.get("symbol");
                            String str35 = obj30 instanceof String ? (String) obj30 : null;
                            if (str35 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": symbol参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37013e) Router.f46192a.m56192n(InterfaceC37013e.class)).mo52221a(context9, str35, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$40
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
                                        function15.invoke(bool4, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e52) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e52), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#safeValidation#openSafeValidation")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj31 = map2.get("bizType");
                            String str36 = obj31 instanceof String ? (String) obj31 : null;
                            if (str36 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": bizType参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj32 = map2.get("businessData");
                            String str37 = obj32 instanceof String ? (String) obj32 : null;
                            if (str37 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": businessData参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37014f) Router.f46192a.m56192n(InterfaceC37014f.class)).m82846a(context9, str36, str37, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$41
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
                                        function15.invoke(map6, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e53) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e53), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#sensor#fastFetchJsonTest")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj33 = map2.get("keyName");
                            String str38 = obj33 instanceof String ? (String) obj33 : null;
                            if (str38 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": keyName参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj34 = map2.get("defaultValue");
                            Map map6 = obj34 instanceof Map ? (Map) obj34 : null;
                            Map<String, ? extends Object> mapM57904b4 = map6 != null ? C24086a.m57904b(map6) : null;
                            if (mapM57904b4 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": defaultValue参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37015g) Router.f46192a.m56192n(InterfaceC37015g.class)).fastFetchJsonTest(context9, str38, mapM57904b4, new Function2<Map<String, ? extends Object>, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$42
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
                                        function15.invoke(map7, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e54) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e54), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#sensor#fastFetchIntegerTest")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj35 = map2.get("keyName");
                            String str39 = obj35 instanceof String ? (String) obj35 : null;
                            if (str39 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": keyName参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj36 = map2.get("defaultValue");
                            Number number = obj36 instanceof Number ? (Number) obj36 : null;
                            Long lBoxLong = number != null ? Boxing.boxLong(number.longValue()) : null;
                            if (lBoxLong == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": defaultValue参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37015g) Router.f46192a.m56192n(InterfaceC37015g.class)).fastFetchIntegerTest(context, str39, lBoxLong.longValue(), new Function2<Long, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$43
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
                                        function15.invoke(l11, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e55) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e55), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#sensor#fastFetchStringTest")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj37 = map2.get("keyName");
                            String str40 = obj37 instanceof String ? (String) obj37 : null;
                            if (str40 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": keyName参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj38 = map2.get("defaultValue");
                            String str41 = obj38 instanceof String ? (String) obj38 : null;
                            if (str41 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": defaultValue参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37015g) Router.f46192a.m56192n(InterfaceC37015g.class)).fastFetchStringTest(context, str40, str41, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$44
                                    @Override // p852kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(String str42, ProtocolException protocolException) {
                                        invoke2(str42, protocolException);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable String str42, @Nullable ProtocolException protocolException) {
                                        function15.invoke(str42, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e56) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e56), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(str, "knb#sensor#fastFetchBoolTest")) {
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj39 = map2.get("keyName");
                            String str42 = obj39 instanceof String ? (String) obj39 : null;
                            if (str42 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": keyName参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj40 = map2.get("defaultValue");
                            Boolean bool4 = obj40 instanceof Boolean ? (Boolean) obj40 : null;
                            if (bool4 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": defaultValue参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37015g) Router.f46192a.m56192n(InterfaceC37015g.class)).fastFetchBoolTest(context, str42, bool4.booleanValue(), new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$45
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
                                        function15.invoke(bool5, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e57) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e57), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (!Intrinsics.areEqual(str, "knb#share#share")) {
                            if (Intrinsics.areEqual(str, "knb#site#startChangeSite")) {
                                if (map2 == null) {
                                    function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj41 = map2.get("siteType");
                                String str43 = obj41 instanceof String ? (String) obj41 : null;
                                if (str43 == null) {
                                    function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": siteType参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                try {
                                    ((InterfaceC37017i) Router.f46192a.m56192n(InterfaceC37017i.class)).mo58128a(context, str43, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$47
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
                                            function15.invoke(bool5, protocolException);
                                        }
                                    });
                                    break;
                                } catch (Exception e58) {
                                    function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e58), null, false, 12, null));
                                }
                                return Unit.INSTANCE;
                            }
                            if (Intrinsics.areEqual(str, "knb#siteConfig#getSiteConfig")) {
                                if (map2 == null) {
                                    function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                try {
                                    ((InterfaceC37018j) Router.f46192a.m56192n(InterfaceC37018j.class)).mo58129a(context, new Function2<String, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$48
                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str44, ProtocolException protocolException) {
                                            invoke2(str44, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable String str44, @Nullable ProtocolException protocolException) {
                                            function15.invoke(str44, protocolException);
                                        }
                                    });
                                    break;
                                } catch (Exception e59) {
                                    function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e59), null, false, 12, null));
                                }
                                return Unit.INSTANCE;
                            }
                            if (Intrinsics.areEqual(str, "knb#track#afTrack")) {
                                if (map2 == null) {
                                    function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj42 = map2.get("eventId");
                                String str44 = obj42 instanceof String ? (String) obj42 : null;
                                if (str44 == null) {
                                    function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": eventId参数不能为空或类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                Object obj43 = map2.get(ReportDataTable.COLUMN_PARAMS);
                                String str45 = obj43 instanceof String ? (String) obj43 : null;
                                Object obj44 = map2.get(ReportDataTable.COLUMN_PARAMS);
                                if (str45 == null && obj44 != null && !Intrinsics.areEqual(obj44, JSONObject.NULL)) {
                                    function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": params参数类型不正确"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                try {
                                    ((InterfaceC37019k) Router.f46192a.m56192n(InterfaceC37019k.class)).mo82847a(context, str44, str45, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$49
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
                                            function15.invoke(bool5, protocolException);
                                        }
                                    });
                                    break;
                                } catch (Exception e61) {
                                    function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e61), null, false, 12, null));
                                }
                                return Unit.INSTANCE;
                            }
                            if (Intrinsics.areEqual(str, "knb#userCenter#getUserInfo")) {
                                if (map2 == null) {
                                    function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                                try {
                                    ((InterfaceC37020l) Router.f46192a.m56192n(InterfaceC37020l.class)).m82848a(context, new Function2<KCBridgeUserCenterUserInfo, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$50

                                        /* JADX INFO: renamed from: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$50$a */
                                        /* JADX INFO: compiled from: GsonUtils.kt */
                                        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/protocol/rn/KRNProtocolManager$_exec$50$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
                                        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
                                        public static final class C24059a extends TypeToken<Map<String, ? extends Object>> {
                                        }

                                        @Override // p852kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(KCBridgeUserCenterUserInfo kCBridgeUserCenterUserInfo, ProtocolException protocolException) {
                                            invoke2(kCBridgeUserCenterUserInfo, protocolException);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable KCBridgeUserCenterUserInfo kCBridgeUserCenterUserInfo, @Nullable ProtocolException protocolException) {
                                            if (protocolException != null || kCBridgeUserCenterUserInfo == null) {
                                                function15.invoke(null, protocolException);
                                                return;
                                            }
                                            String strM66919i = C27099x.m66919i(kCBridgeUserCenterUserInfo, false, 2, null);
                                            if (strM66919i == null) {
                                                strM66919i = "";
                                            }
                                            function15.invoke((Map) C27099x.m66914d(strM66919i, new C24059a().getType()), null);
                                        }
                                    });
                                    break;
                                } catch (Exception e62) {
                                    function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e62), null, false, 12, null));
                                }
                                return Unit.INSTANCE;
                            }
                            if (!Intrinsics.areEqual(str, "knb#userCenter#gotoCheckLoginPage")) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 该协议方法在端上不存在实现"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            if (map2 == null) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            Object obj45 = map2.get("spmId");
                            String str46 = obj45 instanceof String ? (String) obj45 : null;
                            Object obj46 = map2.get("spmId");
                            if (str46 == null && obj46 != null && !Intrinsics.areEqual(obj46, JSONObject.NULL)) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": spmId参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37020l) Router.f46192a.m56192n(InterfaceC37020l.class)).m82849b(context, str46, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$51
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
                                        function15.invoke(bool5, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e63) {
                                function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + ": 没有找到对应实现或者实现有多个, " + e63), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                        if (map2 == null) {
                            function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj47 = map2.get("category");
                        str2 = obj47 instanceof String ? (String) obj47 : null;
                        if (str2 == null) {
                            function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": category参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj48 = map2.get("utmSource");
                        String str47 = obj48 instanceof String ? (String) obj48 : null;
                        if (str47 == null) {
                            str47 = "";
                        }
                        str3 = str47;
                        Object obj49 = map2.get("rcode");
                        String str48 = obj49 instanceof String ? (String) obj49 : null;
                        if (str48 == null) {
                            str48 = "";
                        }
                        Object obj50 = map2.get(BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE);
                        Boolean boolBoxBoolean = obj50 instanceof Boolean ? (Boolean) obj50 : null;
                        if (boolBoxBoolean == null) {
                            boolBoxBoolean = Boxing.boxBoolean(false);
                        }
                        bool = boolBoxBoolean;
                        Object obj51 = map2.get("onlyDarkMode");
                        Boolean boolBoxBoolean2 = obj51 instanceof Boolean ? (Boolean) obj51 : null;
                        if (boolBoxBoolean2 == null) {
                            boolBoxBoolean2 = Boxing.boxBoolean(false);
                        }
                        bool2 = boolBoxBoolean2;
                        Object obj52 = map2.get(BridgeParamKeyKt.SHARE_KEY_PIC);
                        String str49 = obj52 instanceof String ? (String) obj52 : null;
                        Object obj53 = map2.get(BridgeParamKeyKt.SHARE_KEY_PIC);
                        if (str49 == null && obj53 != null) {
                            if (!Intrinsics.areEqual(obj53, JSONObject.NULL)) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": pic参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        Object obj54 = map2.get("qrCodeUrl");
                        String str50 = obj54 instanceof String ? (String) obj54 : null;
                        Object obj55 = map2.get("qrCodeUrl");
                        if (str50 == null && obj55 != null && !Intrinsics.areEqual(obj55, JSONObject.NULL)) {
                            function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": qrCodeUrl参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        Object obj56 = map2.get("title");
                        String str51 = obj56 instanceof String ? (String) obj56 : null;
                        Object obj57 = map2.get("title");
                        if (str51 == null && obj57 != null) {
                            if (!Intrinsics.areEqual(obj57, JSONObject.NULL)) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": title参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        Object obj58 = map2.get("content");
                        String str52 = obj58 instanceof String ? (String) obj58 : null;
                        Object obj59 = map2.get("content");
                        if (str52 == null && obj59 != null) {
                            if (!Intrinsics.areEqual(obj59, JSONObject.NULL)) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": content参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        Object obj60 = map2.get(BridgeParamKeyKt.SHARE_KEY_LINKURL);
                        String str53 = obj60 instanceof String ? (String) obj60 : null;
                        Object obj61 = map2.get(BridgeParamKeyKt.SHARE_KEY_LINKURL);
                        if (str53 == null && obj61 != null) {
                            if (!Intrinsics.areEqual(obj61, JSONObject.NULL)) {
                                function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": linkUrl参数类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                        AbstractC41697j0 abstractC41697j0M94120b11 = C42911a.m94120b();
                        KRNProtocolManager$_exec$data$1 kRNProtocolManager$_exec$data$1 = new KRNProtocolManager$_exec$data$1(map2, null);
                        kRNProtocolManager$_exec$1.L$0 = context;
                        kRNProtocolManager$_exec$1.L$1 = function15;
                        kRNProtocolManager$_exec$1.L$2 = str;
                        kRNProtocolManager$_exec$1.L$3 = map2;
                        kRNProtocolManager$_exec$1.L$4 = str2;
                        kRNProtocolManager$_exec$1.L$5 = str3;
                        kRNProtocolManager$_exec$1.L$6 = str48;
                        kRNProtocolManager$_exec$1.L$7 = bool;
                        kRNProtocolManager$_exec$1.L$8 = bool2;
                        kRNProtocolManager$_exec$1.L$9 = str49;
                        kRNProtocolManager$_exec$1.L$10 = str50;
                        kRNProtocolManager$_exec$1.L$11 = str51;
                        kRNProtocolManager$_exec$1.L$12 = str52;
                        String str54 = str53;
                        kRNProtocolManager$_exec$1.L$13 = str54;
                        String str55 = str48;
                        kRNProtocolManager$_exec$1.label = 13;
                        objM91049g7 = C41686h.m91049g(abstractC41697j0M94120b11, kRNProtocolManager$_exec$data$1, kRNProtocolManager$_exec$1);
                        if (objM91049g7 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        context2 = context;
                        str4 = str54;
                        str5 = str49;
                        str6 = str50;
                        str7 = str52;
                        str8 = str51;
                        str9 = str55;
                        String str56 = str3;
                        String str57 = str2;
                        kCBridgeShareGalleryDataEntity = (KCBridgeShareGalleryDataEntity) objM91049g7;
                        Object obj62 = map2.get(str16);
                        if (kCBridgeShareGalleryDataEntity != null && obj62 != null && !Intrinsics.areEqual(obj62, JSONObject.NULL)) {
                            function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": data参数类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        try {
                            ((InterfaceC37016h) Router.f46192a.m56192n(InterfaceC37016h.class)).mo59708a(context2, str57, str56, str9, bool.booleanValue(), bool2.booleanValue(), str5, str6, str8, str7, str4, kCBridgeShareGalleryDataEntity, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$46
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
                                    function15.invoke(bool5, protocolException);
                                }
                            });
                            break;
                        } catch (Exception e64) {
                            function15.invoke(null, new ProtocolException("-9003", new RuntimeException(str + str17 + e64), null, false, 12, null));
                        }
                        return Unit.INSTANCE;
                    }
                    if (map2 == null) {
                        function15.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": arguments参数不能为空"), null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                    AbstractC41697j0 abstractC41697j0M94120b12 = C42911a.m94120b();
                    KRNProtocolManager$_exec$leadTradingUserInfo$1 kRNProtocolManager$_exec$leadTradingUserInfo$1 = new KRNProtocolManager$_exec$leadTradingUserInfo$1(map2, null);
                    kRNProtocolManager$_exec$1.L$0 = context9;
                    kRNProtocolManager$_exec$1.L$1 = function15;
                    kRNProtocolManager$_exec$1.L$2 = str;
                    kRNProtocolManager$_exec$1.L$3 = map2;
                    kRNProtocolManager$_exec$1.label = 11;
                    objM91049g7 = C41686h.m91049g(abstractC41697j0M94120b12, kRNProtocolManager$_exec$leadTradingUserInfo$1, kRNProtocolManager$_exec$1);
                    if (objM91049g7 != coroutine_suspended) {
                        function3 = function15;
                        kCBridgeCopyTradingLeadTradingEntity = (KCBridgeCopyTradingLeadTradingEntity) objM91049g7;
                        if (kCBridgeCopyTradingLeadTradingEntity == null) {
                            function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": leadTradingUserInfo参数不能为空或类型不正确"), null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        AbstractC41697j0 abstractC41697j0M94120b13 = C42911a.m94120b();
                        KRNProtocolManager$_exec$footerInfo$6 kRNProtocolManager$_exec$footerInfo$6 = new KRNProtocolManager$_exec$footerInfo$6(map2, null);
                        kRNProtocolManager$_exec$1.L$0 = context9;
                        kRNProtocolManager$_exec$1.L$1 = function3;
                        kRNProtocolManager$_exec$1.L$2 = str;
                        kRNProtocolManager$_exec$1.L$3 = kCBridgeCopyTradingLeadTradingEntity;
                        kRNProtocolManager$_exec$1.label = 12;
                        objM91049g6 = C41686h.m91049g(abstractC41697j0M94120b13, kRNProtocolManager$_exec$footerInfo$6, kRNProtocolManager$_exec$1);
                        if (objM91049g6 != coroutine_suspended) {
                            objM91049g7 = objM91049g6;
                            kCBridgeCopyTradingLeadTradingEntity2 = kCBridgeCopyTradingLeadTradingEntity;
                            context8 = context9;
                            function14 = function3;
                            str15 = str;
                            kCBridgeCopyTradingShareFooterInfo6 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                            if (kCBridgeCopyTradingShareFooterInfo6 == null) {
                                function14.invoke(null, new ProtocolException("-9001", new RuntimeException(str15 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82841e(context8, kCBridgeCopyTradingLeadTradingEntity2, kCBridgeCopyTradingShareFooterInfo6, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$28
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
                                        function14.invoke(bool5, protocolException);
                                    }
                                });
                                break;
                            } catch (Exception e65) {
                                function14.invoke(null, new ProtocolException("-9003", new RuntimeException(str15 + ": 没有找到对应实现或者实现有多个, " + e65), null, false, 12, null));
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                map2 = (HashMap) kRNProtocolManager$_exec$1.L$3;
                String str58 = (String) kRNProtocolManager$_exec$1.L$2;
                function8 = (Function2) kRNProtocolManager$_exec$1.L$1;
                Context context10 = (Context) kRNProtocolManager$_exec$1.L$0;
                ResultKt.throwOnFailure(objM91049g7);
                str = str58;
                context9 = context10;
                kCBridgeCopyTradingOptionShareInfo = (KCBridgeCopyTradingOptionShareInfo) objM91049g7;
                if (kCBridgeCopyTradingOptionShareInfo == null) {
                    function8.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": optionShareInfo参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                AbstractC41697j0 abstractC41697j0M94120b14 = C42911a.m94120b();
                KRNProtocolManager$_exec$footerInfo$1 kRNProtocolManager$_exec$footerInfo$7 = new KRNProtocolManager$_exec$footerInfo$1(map2, null);
                kRNProtocolManager$_exec$1.L$0 = context9;
                kRNProtocolManager$_exec$1.L$1 = function8;
                kRNProtocolManager$_exec$1.L$2 = str;
                kRNProtocolManager$_exec$1.L$3 = kCBridgeCopyTradingOptionShareInfo;
                kRNProtocolManager$_exec$1.label = 2;
                objM91049g = C41686h.m91049g(abstractC41697j0M94120b14, kRNProtocolManager$_exec$footerInfo$7, kRNProtocolManager$_exec$1);
                if (objM91049g != coroutine_suspended) {
                    objM91049g7 = objM91049g;
                    kCBridgeCopyTradingOptionShareInfo2 = kCBridgeCopyTradingOptionShareInfo;
                    context3 = context9;
                    function9 = function8;
                    str10 = str;
                    kCBridgeCopyTradingShareFooterInfo = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                    if (kCBridgeCopyTradingShareFooterInfo == null) {
                        ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82843g(context3, kCBridgeCopyTradingOptionShareInfo2, kCBridgeCopyTradingShareFooterInfo, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$23
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
                                function9.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                    function9.invoke(null, new ProtocolException("-9001", new RuntimeException(str10 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 2:
                kCBridgeCopyTradingOptionShareInfo2 = (KCBridgeCopyTradingOptionShareInfo) kRNProtocolManager$_exec$1.L$3;
                str10 = (String) kRNProtocolManager$_exec$1.L$2;
                function9 = (Function2) kRNProtocolManager$_exec$1.L$1;
                context3 = (Context) kRNProtocolManager$_exec$1.L$0;
                ResultKt.throwOnFailure(objM91049g7);
                kCBridgeCopyTradingShareFooterInfo = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                if (kCBridgeCopyTradingShareFooterInfo == null) {
                    ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82843g(context3, kCBridgeCopyTradingOptionShareInfo2, kCBridgeCopyTradingShareFooterInfo, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$23
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
                            function9.invoke(bool5, protocolException);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function9.invoke(null, new ProtocolException("-9001", new RuntimeException(str10 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            case 3:
                map2 = (HashMap) kRNProtocolManager$_exec$1.L$3;
                String str59 = (String) kRNProtocolManager$_exec$1.L$2;
                function7 = (Function2) kRNProtocolManager$_exec$1.L$1;
                Context context11 = (Context) kRNProtocolManager$_exec$1.L$0;
                ResultKt.throwOnFailure(objM91049g7);
                str = str59;
                context9 = context11;
                kCBridgeCopyTradingCopyTradingEntity = (KCBridgeCopyTradingCopyTradingEntity) objM91049g7;
                if (kCBridgeCopyTradingCopyTradingEntity == null) {
                    function7.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": copyTradingData参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                AbstractC41697j0 abstractC41697j0M94120b15 = C42911a.m94120b();
                KRNProtocolManager$_exec$footerInfo$2 kRNProtocolManager$_exec$footerInfo$8 = new KRNProtocolManager$_exec$footerInfo$2(map2, null);
                kRNProtocolManager$_exec$1.L$0 = context9;
                kRNProtocolManager$_exec$1.L$1 = function7;
                kRNProtocolManager$_exec$1.L$2 = str;
                kRNProtocolManager$_exec$1.L$3 = kCBridgeCopyTradingCopyTradingEntity;
                kRNProtocolManager$_exec$1.label = 4;
                objM91049g2 = C41686h.m91049g(abstractC41697j0M94120b15, kRNProtocolManager$_exec$footerInfo$8, kRNProtocolManager$_exec$1);
                if (objM91049g2 != coroutine_suspended) {
                    objM91049g7 = objM91049g2;
                    kCBridgeCopyTradingCopyTradingEntity2 = kCBridgeCopyTradingCopyTradingEntity;
                    context4 = context9;
                    function10 = function7;
                    str11 = str;
                    kCBridgeCopyTradingShareFooterInfo2 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                    if (kCBridgeCopyTradingShareFooterInfo2 == null) {
                        ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82844h(context4, kCBridgeCopyTradingCopyTradingEntity2, kCBridgeCopyTradingShareFooterInfo2, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$24
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
                                function10.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                    function10.invoke(null, new ProtocolException("-9001", new RuntimeException(str11 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 4:
                kCBridgeCopyTradingCopyTradingEntity2 = (KCBridgeCopyTradingCopyTradingEntity) kRNProtocolManager$_exec$1.L$3;
                str11 = (String) kRNProtocolManager$_exec$1.L$2;
                function10 = (Function2) kRNProtocolManager$_exec$1.L$1;
                context4 = (Context) kRNProtocolManager$_exec$1.L$0;
                ResultKt.throwOnFailure(objM91049g7);
                kCBridgeCopyTradingShareFooterInfo2 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                if (kCBridgeCopyTradingShareFooterInfo2 == null) {
                    ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82844h(context4, kCBridgeCopyTradingCopyTradingEntity2, kCBridgeCopyTradingShareFooterInfo2, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$24
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
                            function10.invoke(bool5, protocolException);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function10.invoke(null, new ProtocolException("-9001", new RuntimeException(str11 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            case 5:
                map2 = (HashMap) kRNProtocolManager$_exec$1.L$3;
                String str60 = (String) kRNProtocolManager$_exec$1.L$2;
                function6 = (Function2) kRNProtocolManager$_exec$1.L$1;
                Context context12 = (Context) kRNProtocolManager$_exec$1.L$0;
                ResultKt.throwOnFailure(objM91049g7);
                str = str60;
                context9 = context12;
                kCBridgeCopyTradingLeadTraderTotalPnlEntity = (KCBridgeCopyTradingLeadTraderTotalPnlEntity) objM91049g7;
                if (kCBridgeCopyTradingLeadTraderTotalPnlEntity == null) {
                    function6.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": leadTraderTotalPnlData参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                AbstractC41697j0 abstractC41697j0M94120b16 = C42911a.m94120b();
                KRNProtocolManager$_exec$footerInfo$3 kRNProtocolManager$_exec$footerInfo$9 = new KRNProtocolManager$_exec$footerInfo$3(map2, null);
                kRNProtocolManager$_exec$1.L$0 = context9;
                kRNProtocolManager$_exec$1.L$1 = function6;
                kRNProtocolManager$_exec$1.L$2 = str;
                kRNProtocolManager$_exec$1.L$3 = kCBridgeCopyTradingLeadTraderTotalPnlEntity;
                kRNProtocolManager$_exec$1.label = 6;
                objM91049g3 = C41686h.m91049g(abstractC41697j0M94120b16, kRNProtocolManager$_exec$footerInfo$9, kRNProtocolManager$_exec$1);
                if (objM91049g3 != coroutine_suspended) {
                    objM91049g7 = objM91049g3;
                    kCBridgeCopyTradingLeadTraderTotalPnlEntity2 = kCBridgeCopyTradingLeadTraderTotalPnlEntity;
                    context5 = context9;
                    function11 = function6;
                    str12 = str;
                    kCBridgeCopyTradingShareFooterInfo3 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                    if (kCBridgeCopyTradingShareFooterInfo3 == null) {
                        ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82838b(context5, kCBridgeCopyTradingLeadTraderTotalPnlEntity2, kCBridgeCopyTradingShareFooterInfo3, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$25
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
                                function11.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                    function11.invoke(null, new ProtocolException("-9001", new RuntimeException(str12 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 6:
                kCBridgeCopyTradingLeadTraderTotalPnlEntity2 = (KCBridgeCopyTradingLeadTraderTotalPnlEntity) kRNProtocolManager$_exec$1.L$3;
                str12 = (String) kRNProtocolManager$_exec$1.L$2;
                function11 = (Function2) kRNProtocolManager$_exec$1.L$1;
                context5 = (Context) kRNProtocolManager$_exec$1.L$0;
                ResultKt.throwOnFailure(objM91049g7);
                kCBridgeCopyTradingShareFooterInfo3 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                if (kCBridgeCopyTradingShareFooterInfo3 == null) {
                    ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82838b(context5, kCBridgeCopyTradingLeadTraderTotalPnlEntity2, kCBridgeCopyTradingShareFooterInfo3, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$25
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
                            function11.invoke(bool5, protocolException);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function11.invoke(null, new ProtocolException("-9001", new RuntimeException(str12 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            case 7:
                map2 = (HashMap) kRNProtocolManager$_exec$1.L$3;
                String str61 = (String) kRNProtocolManager$_exec$1.L$2;
                function5 = (Function2) kRNProtocolManager$_exec$1.L$1;
                Context context13 = (Context) kRNProtocolManager$_exec$1.L$0;
                ResultKt.throwOnFailure(objM91049g7);
                str = str61;
                context9 = context13;
                kCBridgeCopyTradingCopyTraderTotalPnlEntity = (KCBridgeCopyTradingCopyTraderTotalPnlEntity) objM91049g7;
                if (kCBridgeCopyTradingCopyTraderTotalPnlEntity == null) {
                    function5.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": copyTraderTotalPnlData参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                AbstractC41697j0 abstractC41697j0M94120b17 = C42911a.m94120b();
                KRNProtocolManager$_exec$footerInfo$4 kRNProtocolManager$_exec$footerInfo$10 = new KRNProtocolManager$_exec$footerInfo$4(map2, null);
                kRNProtocolManager$_exec$1.L$0 = context9;
                kRNProtocolManager$_exec$1.L$1 = function5;
                kRNProtocolManager$_exec$1.L$2 = str;
                kRNProtocolManager$_exec$1.L$3 = kCBridgeCopyTradingCopyTraderTotalPnlEntity;
                kRNProtocolManager$_exec$1.label = 8;
                objM91049g4 = C41686h.m91049g(abstractC41697j0M94120b17, kRNProtocolManager$_exec$footerInfo$10, kRNProtocolManager$_exec$1);
                if (objM91049g4 != coroutine_suspended) {
                    objM91049g7 = objM91049g4;
                    kCBridgeCopyTradingCopyTraderTotalPnlEntity2 = kCBridgeCopyTradingCopyTraderTotalPnlEntity;
                    context6 = context9;
                    function12 = function5;
                    str13 = str;
                    kCBridgeCopyTradingShareFooterInfo4 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                    if (kCBridgeCopyTradingShareFooterInfo4 == null) {
                        ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82837a(context6, kCBridgeCopyTradingCopyTraderTotalPnlEntity2, kCBridgeCopyTradingShareFooterInfo4, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$26
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
                                function12.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                    function12.invoke(null, new ProtocolException("-9001", new RuntimeException(str13 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 8:
                kCBridgeCopyTradingCopyTraderTotalPnlEntity2 = (KCBridgeCopyTradingCopyTraderTotalPnlEntity) kRNProtocolManager$_exec$1.L$3;
                str13 = (String) kRNProtocolManager$_exec$1.L$2;
                function12 = (Function2) kRNProtocolManager$_exec$1.L$1;
                context6 = (Context) kRNProtocolManager$_exec$1.L$0;
                ResultKt.throwOnFailure(objM91049g7);
                kCBridgeCopyTradingShareFooterInfo4 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                if (kCBridgeCopyTradingShareFooterInfo4 == null) {
                    ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82837a(context6, kCBridgeCopyTradingCopyTraderTotalPnlEntity2, kCBridgeCopyTradingShareFooterInfo4, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$26
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
                            function12.invoke(bool5, protocolException);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function12.invoke(null, new ProtocolException("-9001", new RuntimeException(str13 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            case 9:
                map2 = (HashMap) kRNProtocolManager$_exec$1.L$3;
                String str62 = (String) kRNProtocolManager$_exec$1.L$2;
                function4 = (Function2) kRNProtocolManager$_exec$1.L$1;
                Context context14 = (Context) kRNProtocolManager$_exec$1.L$0;
                ResultKt.throwOnFailure(objM91049g7);
                str = str62;
                context9 = context14;
                kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity = (KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity) objM91049g7;
                if (kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity == null) {
                    function4.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": copyTraderFollowOneTraderPnlData参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                AbstractC41697j0 abstractC41697j0M94120b18 = C42911a.m94120b();
                KRNProtocolManager$_exec$footerInfo$5 kRNProtocolManager$_exec$footerInfo$11 = new KRNProtocolManager$_exec$footerInfo$5(map2, null);
                kRNProtocolManager$_exec$1.L$0 = context9;
                kRNProtocolManager$_exec$1.L$1 = function4;
                kRNProtocolManager$_exec$1.L$2 = str;
                kRNProtocolManager$_exec$1.L$3 = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;
                kRNProtocolManager$_exec$1.label = 10;
                objM91049g5 = C41686h.m91049g(abstractC41697j0M94120b18, kRNProtocolManager$_exec$footerInfo$11, kRNProtocolManager$_exec$1);
                if (objM91049g5 != coroutine_suspended) {
                    objM91049g7 = objM91049g5;
                    kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity2 = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;
                    context7 = context9;
                    function13 = function4;
                    str14 = str;
                    kCBridgeCopyTradingShareFooterInfo5 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                    if (kCBridgeCopyTradingShareFooterInfo5 == null) {
                        ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82839c(context7, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity2, kCBridgeCopyTradingShareFooterInfo5, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$27
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
                                function13.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                    function13.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 10:
                kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity2 = (KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity) kRNProtocolManager$_exec$1.L$3;
                str14 = (String) kRNProtocolManager$_exec$1.L$2;
                function13 = (Function2) kRNProtocolManager$_exec$1.L$1;
                context7 = (Context) kRNProtocolManager$_exec$1.L$0;
                ResultKt.throwOnFailure(objM91049g7);
                kCBridgeCopyTradingShareFooterInfo5 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                if (kCBridgeCopyTradingShareFooterInfo5 == null) {
                    ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82839c(context7, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity2, kCBridgeCopyTradingShareFooterInfo5, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$27
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
                            function13.invoke(bool5, protocolException);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function13.invoke(null, new ProtocolException("-9001", new RuntimeException(str14 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            case 11:
                map2 = (HashMap) kRNProtocolManager$_exec$1.L$3;
                String str63 = (String) kRNProtocolManager$_exec$1.L$2;
                function3 = (Function2) kRNProtocolManager$_exec$1.L$1;
                Context context15 = (Context) kRNProtocolManager$_exec$1.L$0;
                ResultKt.throwOnFailure(objM91049g7);
                str = str63;
                context9 = context15;
                kCBridgeCopyTradingLeadTradingEntity = (KCBridgeCopyTradingLeadTradingEntity) objM91049g7;
                if (kCBridgeCopyTradingLeadTradingEntity == null) {
                    function3.invoke(null, new ProtocolException("-9001", new RuntimeException(str + ": leadTradingUserInfo参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                AbstractC41697j0 abstractC41697j0M94120b19 = C42911a.m94120b();
                KRNProtocolManager$_exec$footerInfo$6 kRNProtocolManager$_exec$footerInfo$12 = new KRNProtocolManager$_exec$footerInfo$6(map2, null);
                kRNProtocolManager$_exec$1.L$0 = context9;
                kRNProtocolManager$_exec$1.L$1 = function3;
                kRNProtocolManager$_exec$1.L$2 = str;
                kRNProtocolManager$_exec$1.L$3 = kCBridgeCopyTradingLeadTradingEntity;
                kRNProtocolManager$_exec$1.label = 12;
                objM91049g6 = C41686h.m91049g(abstractC41697j0M94120b19, kRNProtocolManager$_exec$footerInfo$12, kRNProtocolManager$_exec$1);
                if (objM91049g6 != coroutine_suspended) {
                    objM91049g7 = objM91049g6;
                    kCBridgeCopyTradingLeadTradingEntity2 = kCBridgeCopyTradingLeadTradingEntity;
                    context8 = context9;
                    function14 = function3;
                    str15 = str;
                    kCBridgeCopyTradingShareFooterInfo6 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                    if (kCBridgeCopyTradingShareFooterInfo6 == null) {
                        ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82841e(context8, kCBridgeCopyTradingLeadTradingEntity2, kCBridgeCopyTradingShareFooterInfo6, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$28
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
                                function14.invoke(bool5, protocolException);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                    function14.invoke(null, new ProtocolException("-9001", new RuntimeException(str15 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 12:
                kCBridgeCopyTradingLeadTradingEntity2 = (KCBridgeCopyTradingLeadTradingEntity) kRNProtocolManager$_exec$1.L$3;
                str15 = (String) kRNProtocolManager$_exec$1.L$2;
                function14 = (Function2) kRNProtocolManager$_exec$1.L$1;
                context8 = (Context) kRNProtocolManager$_exec$1.L$0;
                ResultKt.throwOnFailure(objM91049g7);
                kCBridgeCopyTradingShareFooterInfo6 = (KCBridgeCopyTradingShareFooterInfo) objM91049g7;
                if (kCBridgeCopyTradingShareFooterInfo6 == null) {
                    ((InterfaceC37012d) Router.f46192a.m56192n(InterfaceC37012d.class)).mo82841e(context8, kCBridgeCopyTradingLeadTradingEntity2, kCBridgeCopyTradingShareFooterInfo6, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$28
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
                            function14.invoke(bool5, protocolException);
                        }
                    });
                    return Unit.INSTANCE;
                }
                function14.invoke(null, new ProtocolException("-9001", new RuntimeException(str15 + ": footerInfo参数不能为空或类型不正确"), null, false, 12, null));
                return Unit.INSTANCE;
            case 13:
                String str64 = (String) kRNProtocolManager$_exec$1.L$13;
                String str65 = (String) kRNProtocolManager$_exec$1.L$12;
                String str66 = (String) kRNProtocolManager$_exec$1.L$11;
                String str67 = (String) kRNProtocolManager$_exec$1.L$10;
                String str68 = (String) kRNProtocolManager$_exec$1.L$9;
                bool2 = (Boolean) kRNProtocolManager$_exec$1.L$8;
                bool = (Boolean) kRNProtocolManager$_exec$1.L$7;
                String str69 = (String) kRNProtocolManager$_exec$1.L$6;
                str3 = (String) kRNProtocolManager$_exec$1.L$5;
                str2 = (String) kRNProtocolManager$_exec$1.L$4;
                HashMap map7 = (HashMap) kRNProtocolManager$_exec$1.L$3;
                String str70 = (String) kRNProtocolManager$_exec$1.L$2;
                Function2<Object, ? super ProtocolException, Unit> function16 = (Function2) kRNProtocolManager$_exec$1.L$1;
                Context context16 = (Context) kRNProtocolManager$_exec$1.L$0;
                ResultKt.throwOnFailure(objM91049g7);
                str4 = str64;
                str7 = str65;
                context2 = context16;
                str8 = str66;
                str6 = str67;
                str5 = str68;
                str16 = "data";
                str17 = ": 没有找到对应实现或者实现有多个, ";
                str9 = str69;
                function15 = function16;
                map2 = map7;
                str = str70;
                String str510 = str3;
                String str511 = str2;
                kCBridgeShareGalleryDataEntity = (KCBridgeShareGalleryDataEntity) objM91049g7;
                Object obj63 = map2.get(str16);
                if (kCBridgeShareGalleryDataEntity != null) {
                }
                ((InterfaceC37016h) Router.f46192a.m56192n(InterfaceC37016h.class)).mo59708a(context2, str511, str510, str9, bool.booleanValue(), bool2.booleanValue(), str5, str6, str8, str7, str4, kCBridgeShareGalleryDataEntity, new Function2<Boolean, ProtocolException, Unit>() { // from class: com.kubi.sdk.protocol.rn.KRNProtocolManager$_exec$46
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
                        function15.invoke(bool5, protocolException);
                    }
                });
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m57902b(@NotNull Context ctx, @NotNull HashMap<String, Object> param, @NotNull Function2<Object, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C41696j.m91104d(new C38070a(C42911a.m94121c()), null, null, new KRNProtocolManager$exec$1(ctx, param, callback, null), 3, null);
    }
}
