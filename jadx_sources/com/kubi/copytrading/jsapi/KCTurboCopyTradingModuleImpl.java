package com.kubi.copytrading.jsapi;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.kubi.mvi.common.MviExKt;
import com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleAbs;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTraderTotalPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTradingEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingLeadTraderTotalPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingLeadTradingEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingOptionShareInfo;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingShareFooterInfo;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p555qc.C43693b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCTurboCopyTradingModuleImpl.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00070\fH\u0016J.\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00070\fH\u0016J.\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00070\fH\u0016J.\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00070\fH\u0016J.\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00070\fH\u0016J.\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00070\fH\u0016J.\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00070\fH\u0016J.\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00070\fH\u0016J\u000f\u0010\u001d\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010 *\u0004\u0018\u00010\tH\u0002J\u0010\u0010!\u001a\u0004\u0018\u00010\"*\u0004\u0018\u00010\tH\u0002J\u0010\u0010#\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010\tH\u0002J\u0010\u0010%\u001a\u0004\u0018\u00010&*\u0004\u0018\u00010\tH\u0002J\u0010\u0010'\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010\tH\u0002J\u0010\u0010)\u001a\u0004\u0018\u00010**\u0004\u0018\u00010\tH\u0002J\u0010\u0010+\u001a\u0004\u0018\u00010,*\u0004\u0018\u00010\tH\u0002¨\u0006-"}, m90084d2 = {"Lcom/kubi/copytrading/jsapi/KCTurboCopyTradingModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeCopyTradingTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "shareOptionPosition", "", "optionShareInfo", "Lcom/facebook/react/bridge/ReadableMap;", "footerInfo", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "shareCopyTradingPosition", "copyTradingData", "shareLeadTraderTotalPnl", "leadTraderTotalPnlData", "shareCopyTraderTotalPnl", "copyTraderTotalPnlData", "shareCopyTraderFollowOneTraderPnl", "copyTraderFollowOneTraderPnlData", "shareLeadUserInfo", "leadTradingUserInfo", "requestFutureMarketClosePosition", "subUid", "", "positionJson", "requestFuturePositionTpSl", "requestRefreshCopyTradingAccountInfo", "()Ljava/lang/Boolean;", "toKCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;", "toKCBridgeCopyTradingShareFooterInfo", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;", "toKCBridgeCopyTradingCopyTraderTotalPnlEntity", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderTotalPnlEntity;", "toKCBridgeCopyTradingCopyTradingEntity", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTradingEntity;", "toKCBridgeCopyTradingLeadTraderTotalPnlEntity", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingLeadTraderTotalPnlEntity;", "toKCBridgeCopyTradingLeadTradingEntity", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingLeadTradingEntity;", "toKCBridgeCopyTradingOptionShareInfo", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingOptionShareInfo;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeCopyTradingTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboCopyTradingModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboCopyTradingModuleImpl.kt\ncom/kubi/copytrading/jsapi/KCTurboCopyTradingModuleImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,352:1\n808#2,11:353\n808#2,11:364\n808#2,11:375\n808#2,11:386\n*S KotlinDebug\n*F\n+ 1 KCTurboCopyTradingModuleImpl.kt\ncom/kubi/copytrading/jsapi/KCTurboCopyTradingModuleImpl\n*L\n283#1:353,11\n288#1:364,11\n319#1:375,11\n331#1:386,11\n*E\n"})
public final class KCTurboCopyTradingModuleImpl extends NativeCopyTradingTurboModuleAbs {

    /* JADX INFO: renamed from: com.kubi.copytrading.jsapi.KCTurboCopyTradingModuleImpl$shareCopyTraderFollowOneTraderPnl$1 */
    /* JADX INFO: compiled from: KCTurboCopyTradingModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.jsapi.KCTurboCopyTradingModuleImpl$shareCopyTraderFollowOneTraderPnl$1", m90122f = "KCTurboCopyTradingModuleImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C115371 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ KCBridgeCopyTradingShareFooterInfo $footer;
        final /* synthetic */ KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity $pnlEntity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115371(KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, Function1<? super Boolean, Unit> function1, Continuation<? super C115371> continuation) {
            super(2, continuation);
            this.$pnlEntity = kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;
            this.$footer = kCBridgeCopyTradingShareFooterInfo;
            this.$callback = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KCTurboCopyTradingModuleImpl.this.new C115371(this.$pnlEntity, this.$footer, this.$callback, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C115371) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m20893f(Function1 function1, Boolean bool, ProtocolException protocolException) {
            function1.invoke(bool);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C43693b c43693b = new C43693b();
                ReactApplicationContext reactApplicationContext = KCTurboCopyTradingModuleImpl.this.getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "access$getReactApplicationContext(...)");
                KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity = this.$pnlEntity;
                KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo = this.$footer;
                final Function1<Boolean, Unit> function1 = this.$callback;
                c43693b.mo82839c(reactApplicationContext, kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity, kCBridgeCopyTradingShareFooterInfo, new Function2() { // from class: com.kubi.copytrading.jsapi.e
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return KCTurboCopyTradingModuleImpl.C115371.m20893f(function1, (Boolean) obj2, (ProtocolException) obj3);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.jsapi.KCTurboCopyTradingModuleImpl$shareCopyTraderTotalPnl$1 */
    /* JADX INFO: compiled from: KCTurboCopyTradingModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.jsapi.KCTurboCopyTradingModuleImpl$shareCopyTraderTotalPnl$1", m90122f = "KCTurboCopyTradingModuleImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C115381 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ KCBridgeCopyTradingShareFooterInfo $footer;
        final /* synthetic */ KCBridgeCopyTradingCopyTraderTotalPnlEntity $totalPnlEntity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115381(KCBridgeCopyTradingCopyTraderTotalPnlEntity kCBridgeCopyTradingCopyTraderTotalPnlEntity, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, Function1<? super Boolean, Unit> function1, Continuation<? super C115381> continuation) {
            super(2, continuation);
            this.$totalPnlEntity = kCBridgeCopyTradingCopyTraderTotalPnlEntity;
            this.$footer = kCBridgeCopyTradingShareFooterInfo;
            this.$callback = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KCTurboCopyTradingModuleImpl.this.new C115381(this.$totalPnlEntity, this.$footer, this.$callback, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C115381) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final Unit m20895f(Function1 function1, Boolean bool, ProtocolException protocolException) {
            function1.invoke(bool);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C43693b c43693b = new C43693b();
                ReactApplicationContext reactApplicationContext = KCTurboCopyTradingModuleImpl.this.getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "access$getReactApplicationContext(...)");
                KCBridgeCopyTradingCopyTraderTotalPnlEntity kCBridgeCopyTradingCopyTraderTotalPnlEntity = this.$totalPnlEntity;
                KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo = this.$footer;
                final Function1<Boolean, Unit> function1 = this.$callback;
                c43693b.mo82837a(reactApplicationContext, kCBridgeCopyTradingCopyTraderTotalPnlEntity, kCBridgeCopyTradingShareFooterInfo, new Function2() { // from class: com.kubi.copytrading.jsapi.f
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return KCTurboCopyTradingModuleImpl.C115381.m20895f(function1, (Boolean) obj2, (ProtocolException) obj3);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.jsapi.KCTurboCopyTradingModuleImpl$shareCopyTradingPosition$1 */
    /* JADX INFO: compiled from: KCTurboCopyTradingModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.jsapi.KCTurboCopyTradingModuleImpl$shareCopyTradingPosition$1", m90122f = "KCTurboCopyTradingModuleImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C115391 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ KCBridgeCopyTradingCopyTradingEntity $copyTradingEntity;
        final /* synthetic */ KCBridgeCopyTradingShareFooterInfo $footer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115391(KCBridgeCopyTradingCopyTradingEntity kCBridgeCopyTradingCopyTradingEntity, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, Function1<? super Boolean, Unit> function1, Continuation<? super C115391> continuation) {
            super(2, continuation);
            this.$copyTradingEntity = kCBridgeCopyTradingCopyTradingEntity;
            this.$footer = kCBridgeCopyTradingShareFooterInfo;
            this.$callback = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KCTurboCopyTradingModuleImpl.this.new C115391(this.$copyTradingEntity, this.$footer, this.$callback, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C115391) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final Unit m20897f(Function1 function1, Boolean bool, ProtocolException protocolException) {
            function1.invoke(bool);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C43693b c43693b = new C43693b();
                ReactApplicationContext reactApplicationContext = KCTurboCopyTradingModuleImpl.this.getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "access$getReactApplicationContext(...)");
                KCBridgeCopyTradingCopyTradingEntity kCBridgeCopyTradingCopyTradingEntity = this.$copyTradingEntity;
                KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo = this.$footer;
                final Function1<Boolean, Unit> function1 = this.$callback;
                c43693b.mo82844h(reactApplicationContext, kCBridgeCopyTradingCopyTradingEntity, kCBridgeCopyTradingShareFooterInfo, new Function2() { // from class: com.kubi.copytrading.jsapi.g
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return KCTurboCopyTradingModuleImpl.C115391.m20897f(function1, (Boolean) obj2, (ProtocolException) obj3);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.jsapi.KCTurboCopyTradingModuleImpl$shareLeadTraderTotalPnl$1 */
    /* JADX INFO: compiled from: KCTurboCopyTradingModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.jsapi.KCTurboCopyTradingModuleImpl$shareLeadTraderTotalPnl$1", m90122f = "KCTurboCopyTradingModuleImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C115401 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ KCBridgeCopyTradingShareFooterInfo $footer;
        final /* synthetic */ KCBridgeCopyTradingLeadTraderTotalPnlEntity $totalPnlEntity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115401(KCBridgeCopyTradingLeadTraderTotalPnlEntity kCBridgeCopyTradingLeadTraderTotalPnlEntity, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, Function1<? super Boolean, Unit> function1, Continuation<? super C115401> continuation) {
            super(2, continuation);
            this.$totalPnlEntity = kCBridgeCopyTradingLeadTraderTotalPnlEntity;
            this.$footer = kCBridgeCopyTradingShareFooterInfo;
            this.$callback = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KCTurboCopyTradingModuleImpl.this.new C115401(this.$totalPnlEntity, this.$footer, this.$callback, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C115401) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final Unit m20899f(Function1 function1, Boolean bool, ProtocolException protocolException) {
            function1.invoke(bool);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C43693b c43693b = new C43693b();
                ReactApplicationContext reactApplicationContext = KCTurboCopyTradingModuleImpl.this.getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "access$getReactApplicationContext(...)");
                KCBridgeCopyTradingLeadTraderTotalPnlEntity kCBridgeCopyTradingLeadTraderTotalPnlEntity = this.$totalPnlEntity;
                KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo = this.$footer;
                final Function1<Boolean, Unit> function1 = this.$callback;
                c43693b.mo82838b(reactApplicationContext, kCBridgeCopyTradingLeadTraderTotalPnlEntity, kCBridgeCopyTradingShareFooterInfo, new Function2() { // from class: com.kubi.copytrading.jsapi.h
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return KCTurboCopyTradingModuleImpl.C115401.m20899f(function1, (Boolean) obj2, (ProtocolException) obj3);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.jsapi.KCTurboCopyTradingModuleImpl$shareLeadUserInfo$1 */
    /* JADX INFO: compiled from: KCTurboCopyTradingModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.jsapi.KCTurboCopyTradingModuleImpl$shareLeadUserInfo$1", m90122f = "KCTurboCopyTradingModuleImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C115411 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ KCBridgeCopyTradingShareFooterInfo $footer;
        final /* synthetic */ KCBridgeCopyTradingLeadTradingEntity $leadTradingEntity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115411(KCBridgeCopyTradingLeadTradingEntity kCBridgeCopyTradingLeadTradingEntity, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, Function1<? super Boolean, Unit> function1, Continuation<? super C115411> continuation) {
            super(2, continuation);
            this.$leadTradingEntity = kCBridgeCopyTradingLeadTradingEntity;
            this.$footer = kCBridgeCopyTradingShareFooterInfo;
            this.$callback = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KCTurboCopyTradingModuleImpl.this.new C115411(this.$leadTradingEntity, this.$footer, this.$callback, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C115411) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final Unit m20901f(Function1 function1, Boolean bool, ProtocolException protocolException) {
            function1.invoke(bool);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C43693b c43693b = new C43693b();
                ReactApplicationContext reactApplicationContext = KCTurboCopyTradingModuleImpl.this.getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "access$getReactApplicationContext(...)");
                KCBridgeCopyTradingLeadTradingEntity kCBridgeCopyTradingLeadTradingEntity = this.$leadTradingEntity;
                KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo = this.$footer;
                final Function1<Boolean, Unit> function1 = this.$callback;
                c43693b.mo82841e(reactApplicationContext, kCBridgeCopyTradingLeadTradingEntity, kCBridgeCopyTradingShareFooterInfo, new Function2() { // from class: com.kubi.copytrading.jsapi.i
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return KCTurboCopyTradingModuleImpl.C115411.m20901f(function1, (Boolean) obj2, (ProtocolException) obj3);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.jsapi.KCTurboCopyTradingModuleImpl$shareOptionPosition$1 */
    /* JADX INFO: compiled from: KCTurboCopyTradingModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.jsapi.KCTurboCopyTradingModuleImpl$shareOptionPosition$1", m90122f = "KCTurboCopyTradingModuleImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C115421 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ KCBridgeCopyTradingShareFooterInfo $footer;
        final /* synthetic */ KCBridgeCopyTradingOptionShareInfo $optionShareInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115421(KCBridgeCopyTradingOptionShareInfo kCBridgeCopyTradingOptionShareInfo, KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo, Function1<? super Boolean, Unit> function1, Continuation<? super C115421> continuation) {
            super(2, continuation);
            this.$optionShareInfo = kCBridgeCopyTradingOptionShareInfo;
            this.$footer = kCBridgeCopyTradingShareFooterInfo;
            this.$callback = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KCTurboCopyTradingModuleImpl.this.new C115421(this.$optionShareInfo, this.$footer, this.$callback, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C115421) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final Unit m20903f(Function1 function1, Boolean bool, ProtocolException protocolException) {
            function1.invoke(bool);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C43693b c43693b = new C43693b();
                ReactApplicationContext reactApplicationContext = KCTurboCopyTradingModuleImpl.this.getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "access$getReactApplicationContext(...)");
                KCBridgeCopyTradingOptionShareInfo kCBridgeCopyTradingOptionShareInfo = this.$optionShareInfo;
                KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo = this.$footer;
                final Function1<Boolean, Unit> function1 = this.$callback;
                c43693b.mo82843g(reactApplicationContext, kCBridgeCopyTradingOptionShareInfo, kCBridgeCopyTradingShareFooterInfo, new Function2() { // from class: com.kubi.copytrading.jsapi.j
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return KCTurboCopyTradingModuleImpl.C115421.m20903f(function1, (Boolean) obj2, (ProtocolException) obj3);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboCopyTradingModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestRefreshCopyTradingAccountInfo$lambda$14(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    private final KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity toKCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity(ReadableMap readableMap) {
        String str;
        String str2;
        if (readableMap == null) {
            return null;
        }
        String string = readableMap.getString("copyTraderName");
        if (string == null) {
            string = "";
        }
        String string2 = readableMap.getString("pnlPercent");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = readableMap.getString("pnlValue");
        if (string3 == null) {
            string3 = "";
        }
        long j11 = (long) readableMap.getDouble("tradePnlSide");
        String string4 = readableMap.getString("leadTraderName");
        if (string4 == null) {
            string4 = "";
        }
        String string5 = readableMap.getString("tradeSettleCurrency");
        if (string5 == null) {
            string5 = "";
        }
        String string6 = readableMap.getString("copyTraderAvatarUrl");
        if (string6 == null) {
            String str3 = string5;
            str2 = "";
            str = str3;
        } else {
            str = string5;
            str2 = string6;
        }
        return new KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity(string, string2, string3, j11, string4, str, str2);
    }

    private final KCBridgeCopyTradingCopyTraderTotalPnlEntity toKCBridgeCopyTradingCopyTraderTotalPnlEntity(ReadableMap readableMap) {
        List listEmptyList;
        List listEmptyList2;
        ArrayList<Object> arrayList;
        ArrayList<Object> arrayList2;
        if (readableMap == null) {
            return null;
        }
        String string = readableMap.getString(TUIConstantDefine.USER_NAME);
        String str = string == null ? "" : string;
        ReadableArray array = readableMap.getArray("totalPnlData");
        if (array == null || (arrayList2 = array.toArrayList()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof String) {
                    listEmptyList.add(obj);
                }
            }
        }
        List list = listEmptyList;
        String string2 = readableMap.getString("totalPnlValue");
        String str2 = string2 == null ? "" : string2;
        long j11 = (long) readableMap.getDouble("tradePnlSide");
        ReadableArray array2 = readableMap.getArray("leadTradersNameData");
        if (array2 == null || (arrayList = array2.toArrayList()) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        } else {
            listEmptyList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 instanceof String) {
                    listEmptyList2.add(obj2);
                }
            }
        }
        List list2 = listEmptyList2;
        String string3 = readableMap.getString("tradeSettleCurrency");
        String str3 = string3 == null ? "" : string3;
        String string4 = readableMap.getString("userAvatarUrl");
        return new KCBridgeCopyTradingCopyTraderTotalPnlEntity(str, list, str2, j11, list2, str3, string4 == null ? "" : string4);
    }

    private final KCBridgeCopyTradingCopyTradingEntity toKCBridgeCopyTradingCopyTradingEntity(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        String string = readableMap.getString(TUIConstantDefine.USER_NAME);
        String str = string == null ? "" : string;
        String string2 = readableMap.getString("tradeDisplaySymbol");
        String str2 = string2 == null ? "" : string2;
        boolean z11 = readableMap.getBoolean("tradeIsLong");
        String string3 = readableMap.getString("tradeLeverage");
        String str3 = string3 == null ? "" : string3;
        String string4 = readableMap.getString("tradePnlValue");
        String str4 = string4 == null ? "" : string4;
        String string5 = readableMap.getString("tradePnlAmountValue");
        String str5 = string5 == null ? "" : string5;
        Long lValueOf = Long.valueOf((long) readableMap.getDouble("tradePnlSide"));
        String string6 = readableMap.getString("tradeAveragePrice");
        String str6 = string6 == null ? "" : string6;
        String string7 = readableMap.getString("tradeExitPrice");
        String str7 = string7 == null ? "" : string7;
        String string8 = readableMap.getString("tradeSettleCurrency");
        String str8 = string8 == null ? "" : string8;
        String string9 = readableMap.getString("userAvatarUrl");
        String str9 = string9 == null ? "" : string9;
        String string10 = readableMap.getString("userDesc");
        return new KCBridgeCopyTradingCopyTradingEntity(str, str2, z11, str3, str4, str6, str7, str8, str9, string10 == null ? "" : string10, str5, lValueOf);
    }

    private final KCBridgeCopyTradingLeadTraderTotalPnlEntity toKCBridgeCopyTradingLeadTraderTotalPnlEntity(ReadableMap readableMap) {
        List listEmptyList;
        ArrayList<Object> arrayList;
        if (readableMap == null) {
            return null;
        }
        String string = readableMap.getString(TUIConstantDefine.USER_NAME);
        String str = string == null ? "" : string;
        ReadableArray array = readableMap.getArray("leadTotalPnlData");
        if (array == null || (arrayList = array.toArrayList()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof String) {
                    listEmptyList.add(obj);
                }
            }
        }
        List list = listEmptyList;
        String string2 = readableMap.getString("leadTotalPnlValue");
        String str2 = string2 == null ? "" : string2;
        long j11 = (long) readableMap.getDouble("tradePnlSide");
        String string3 = readableMap.getString("tradeSettleCurrency");
        String str3 = string3 == null ? "" : string3;
        String string4 = readableMap.getString("userAvatarUrl");
        return new KCBridgeCopyTradingLeadTraderTotalPnlEntity(str, list, str2, j11, str3, string4 == null ? "" : string4);
    }

    private final KCBridgeCopyTradingLeadTradingEntity toKCBridgeCopyTradingLeadTradingEntity(ReadableMap readableMap) {
        List listEmptyList;
        ArrayList<Object> arrayList;
        if (readableMap == null) {
            return null;
        }
        String string = readableMap.getString(TUIConstantDefine.USER_NAME);
        String str = string == null ? "" : string;
        ReadableArray array = readableMap.getArray("lead30DayData");
        if (array == null || (arrayList = array.toArrayList()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof String) {
                    listEmptyList.add(obj);
                }
            }
        }
        List list = listEmptyList;
        String string2 = readableMap.getString("lead30DayPnl");
        String str2 = string2 == null ? "" : string2;
        String string3 = readableMap.getString("lead30DayValue");
        String str3 = string3 == null ? "" : string3;
        Long lValueOf = Long.valueOf((long) readableMap.getDouble("tradePnlSide"));
        String string4 = readableMap.getString("tradeSettleCurrency");
        String str4 = string4 == null ? "" : string4;
        String string5 = readableMap.getString("userAvatarUrl");
        return new KCBridgeCopyTradingLeadTradingEntity(str, list, str2, str3, str4, string5 == null ? "" : string5, lValueOf);
    }

    private final KCBridgeCopyTradingOptionShareInfo toKCBridgeCopyTradingOptionShareInfo(ReadableMap readableMap) {
        String str;
        String str2;
        if (readableMap == null) {
            return null;
        }
        String string = readableMap.getString("tradeDisplaySymbol");
        if (string == null) {
            string = "";
        }
        String string2 = readableMap.getString("tradePnlValue");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = readableMap.getString("tradeAveragePrice");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = readableMap.getString("tradeExitPrice");
        if (string4 == null) {
            string4 = "";
        }
        String string5 = readableMap.getString("tradeSettleCurrency");
        if (string5 == null) {
            String str3 = string4;
            str2 = "";
            str = str3;
        } else {
            str = string4;
            str2 = string5;
        }
        return new KCBridgeCopyTradingOptionShareInfo(string, string2, string3, str, str2);
    }

    private final KCBridgeCopyTradingShareFooterInfo toKCBridgeCopyTradingShareFooterInfo(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        String string = readableMap.getString("footerTitle");
        if (string == null) {
            string = "";
        }
        String string2 = readableMap.getString("footerDesc");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = readableMap.getString("qrCodeUrl");
        return new KCBridgeCopyTradingShareFooterInfo(string, string2, string3 != null ? string3 : "");
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleAbs
    public void requestFutureMarketClosePosition(@NotNull String subUid, @NotNull String positionJson, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C43693b c43693b = new C43693b();
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            c43693b.mo82845j(reactApplicationContext, subUid, positionJson, new Function2() { // from class: com.kubi.copytrading.jsapi.d
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KCTurboCopyTradingModuleImpl.requestFutureMarketClosePosition$lambda$12(callback, (Boolean) obj, (ProtocolException) obj2);
                }
            });
        } catch (Exception unused) {
            callback.invoke(Boolean.FALSE);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleAbs
    public void requestFuturePositionTpSl(@NotNull String subUid, @NotNull String positionJson, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C43693b c43693b = new C43693b();
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            c43693b.mo82840d(reactApplicationContext, subUid, positionJson, new Function2() { // from class: com.kubi.copytrading.jsapi.c
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KCTurboCopyTradingModuleImpl.requestFuturePositionTpSl$lambda$13(callback, (Boolean) obj, (ProtocolException) obj2);
                }
            });
        } catch (Exception unused) {
            callback.invoke(Boolean.FALSE);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleAbs
    @Nullable
    public Boolean requestRefreshCopyTradingAccountInfo() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        C43693b c43693b = new C43693b();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        c43693b.mo82842f(reactApplicationContext, new Function2() { // from class: com.kubi.copytrading.jsapi.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCopyTradingModuleImpl.requestRefreshCopyTradingAccountInfo$lambda$14(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleAbs
    public void shareCopyTraderFollowOneTraderPnl(@NotNull ReadableMap copyTraderFollowOneTraderPnlData, @NotNull ReadableMap footerInfo, @NotNull Function1<? super Boolean, Unit> callback) {
        Function1<? super Boolean, Unit> function1;
        Intrinsics.checkNotNullParameter(copyTraderFollowOneTraderPnlData, "copyTraderFollowOneTraderPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity = toKCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity(copyTraderFollowOneTraderPnlData);
            if (kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity == null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo = toKCBridgeCopyTradingShareFooterInfo(footerInfo);
            if (kCBridgeCopyTradingShareFooterInfo == null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            function1 = callback;
            try {
                MviExKt.m42518n(new C115371(kCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity, kCBridgeCopyTradingShareFooterInfo, function1, null));
            } catch (Exception unused) {
                function1.invoke(Boolean.FALSE);
            }
        } catch (Exception unused2) {
            function1 = callback;
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleAbs
    public void shareCopyTraderTotalPnl(@NotNull ReadableMap copyTraderTotalPnlData, @NotNull ReadableMap footerInfo, @NotNull Function1<? super Boolean, Unit> callback) {
        Function1<? super Boolean, Unit> function1;
        Intrinsics.checkNotNullParameter(copyTraderTotalPnlData, "copyTraderTotalPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            KCBridgeCopyTradingCopyTraderTotalPnlEntity kCBridgeCopyTradingCopyTraderTotalPnlEntity = toKCBridgeCopyTradingCopyTraderTotalPnlEntity(copyTraderTotalPnlData);
            if (kCBridgeCopyTradingCopyTraderTotalPnlEntity == null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo = toKCBridgeCopyTradingShareFooterInfo(footerInfo);
            if (kCBridgeCopyTradingShareFooterInfo == null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            function1 = callback;
            try {
                MviExKt.m42518n(new C115381(kCBridgeCopyTradingCopyTraderTotalPnlEntity, kCBridgeCopyTradingShareFooterInfo, function1, null));
            } catch (Exception unused) {
                function1.invoke(Boolean.FALSE);
            }
        } catch (Exception unused2) {
            function1 = callback;
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleAbs
    public void shareCopyTradingPosition(@NotNull ReadableMap copyTradingData, @NotNull ReadableMap footerInfo, @NotNull Function1<? super Boolean, Unit> callback) {
        Function1<? super Boolean, Unit> function1;
        Intrinsics.checkNotNullParameter(copyTradingData, "copyTradingData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            KCBridgeCopyTradingCopyTradingEntity kCBridgeCopyTradingCopyTradingEntity = toKCBridgeCopyTradingCopyTradingEntity(copyTradingData);
            if (kCBridgeCopyTradingCopyTradingEntity == null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo = toKCBridgeCopyTradingShareFooterInfo(footerInfo);
            if (kCBridgeCopyTradingShareFooterInfo == null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            function1 = callback;
            try {
                MviExKt.m42518n(new C115391(kCBridgeCopyTradingCopyTradingEntity, kCBridgeCopyTradingShareFooterInfo, function1, null));
            } catch (Exception unused) {
                function1.invoke(Boolean.FALSE);
            }
        } catch (Exception unused2) {
            function1 = callback;
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleAbs
    public void shareLeadTraderTotalPnl(@NotNull ReadableMap leadTraderTotalPnlData, @NotNull ReadableMap footerInfo, @NotNull Function1<? super Boolean, Unit> callback) {
        Function1<? super Boolean, Unit> function1;
        Intrinsics.checkNotNullParameter(leadTraderTotalPnlData, "leadTraderTotalPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            KCBridgeCopyTradingLeadTraderTotalPnlEntity kCBridgeCopyTradingLeadTraderTotalPnlEntity = toKCBridgeCopyTradingLeadTraderTotalPnlEntity(leadTraderTotalPnlData);
            if (kCBridgeCopyTradingLeadTraderTotalPnlEntity == null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo = toKCBridgeCopyTradingShareFooterInfo(footerInfo);
            if (kCBridgeCopyTradingShareFooterInfo == null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            function1 = callback;
            try {
                MviExKt.m42518n(new C115401(kCBridgeCopyTradingLeadTraderTotalPnlEntity, kCBridgeCopyTradingShareFooterInfo, function1, null));
            } catch (Exception unused) {
                function1.invoke(Boolean.FALSE);
            }
        } catch (Exception unused2) {
            function1 = callback;
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleAbs
    public void shareLeadUserInfo(@NotNull ReadableMap leadTradingUserInfo, @NotNull ReadableMap footerInfo, @NotNull Function1<? super Boolean, Unit> callback) {
        Function1<? super Boolean, Unit> function1;
        Intrinsics.checkNotNullParameter(leadTradingUserInfo, "leadTradingUserInfo");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            KCBridgeCopyTradingLeadTradingEntity kCBridgeCopyTradingLeadTradingEntity = toKCBridgeCopyTradingLeadTradingEntity(leadTradingUserInfo);
            if (kCBridgeCopyTradingLeadTradingEntity == null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo = toKCBridgeCopyTradingShareFooterInfo(footerInfo);
            if (kCBridgeCopyTradingShareFooterInfo == null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            function1 = callback;
            try {
                MviExKt.m42518n(new C115411(kCBridgeCopyTradingLeadTradingEntity, kCBridgeCopyTradingShareFooterInfo, function1, null));
            } catch (Exception unused) {
                function1.invoke(Boolean.FALSE);
            }
        } catch (Exception unused2) {
            function1 = callback;
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleAbs
    public void shareOptionPosition(@NotNull ReadableMap optionShareInfo, @NotNull ReadableMap footerInfo, @NotNull Function1<? super Boolean, Unit> callback) {
        Function1<? super Boolean, Unit> function1;
        Intrinsics.checkNotNullParameter(optionShareInfo, "optionShareInfo");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            KCBridgeCopyTradingOptionShareInfo kCBridgeCopyTradingOptionShareInfo = toKCBridgeCopyTradingOptionShareInfo(optionShareInfo);
            if (kCBridgeCopyTradingOptionShareInfo == null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            KCBridgeCopyTradingShareFooterInfo kCBridgeCopyTradingShareFooterInfo = toKCBridgeCopyTradingShareFooterInfo(footerInfo);
            if (kCBridgeCopyTradingShareFooterInfo == null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            function1 = callback;
            try {
                MviExKt.m42518n(new C115421(kCBridgeCopyTradingOptionShareInfo, kCBridgeCopyTradingShareFooterInfo, function1, null));
            } catch (Exception unused) {
                function1.invoke(Boolean.FALSE);
            }
        } catch (Exception unused2) {
            function1 = callback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestFutureMarketClosePosition$lambda$12(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestFuturePositionTpSl$lambda$13(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }
}
