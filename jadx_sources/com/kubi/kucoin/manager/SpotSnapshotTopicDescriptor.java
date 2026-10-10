package com.kubi.kucoin.manager;

import com.facebook.react.animated.InterpolationAnimatedNode;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kucoin.discover.tickers.TickerItemApp;
import com.kucoin.discover.tickers.TickerItemsApp;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: MarketSnapshotTopicDescriptors.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kucoin/manager/SpotSnapshotTopicDescriptor;", "Lcom/kubi/kucoin/manager/KCSocketTopicDescriptor;", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "wsApi", "Lcom/kubi/kucoin/manager/IWsApi;", "pbWsApi", "Lcom/kubi/kucoin/manager/IMarketTickerPbWsApi;", "<init>", "(Lcom/kubi/kucoin/manager/IWsApi;Lcom/kubi/kucoin/manager/IMarketTickerPbWsApi;)V", "topicPrefix", "", "getTopicPrefix", "()Ljava/lang/String;", "topicParams", "getTopicParams", "setTopicParams", "(Ljava/lang/String;)V", "protobufTopicPrefix", "getProtobufTopicPrefix", "wsClientType", "Lcom/kubi/kucoin/manager/WsClientType;", "getWsClientType", "()Lcom/kubi/kucoin/manager/WsClientType;", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, TUIConstants.TIMPush.NOTIFICATION.ENTITY, "createFlow", "Lkotlinx/coroutines/flow/Flow;", "topic", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketSnapshotTopicDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketSnapshotTopicDescriptors.kt\ncom/kubi/kucoin/manager/SpotSnapshotTopicDescriptor\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,184:1\n56#2:185\n59#2:189\n46#3:186\n51#3:188\n35#3,6:190\n35#3,6:196\n105#4:187\n*S KotlinDebug\n*F\n+ 1 MarketSnapshotTopicDescriptors.kt\ncom/kubi/kucoin/manager/SpotSnapshotTopicDescriptor\n*L\n59#1:185\n59#1:189\n59#1:186\n59#1:188\n68#1:190,6\n77#1:196,6\n59#1:187\n*E\n"})
public final class SpotSnapshotTopicDescriptor implements KCSocketTopicDescriptor<WsMarketSnapshotEntity> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IWsApi f28103a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final IMarketTickerPbWsApi f28104b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f28105c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f28106d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final WsClientType f28107e;

    public SpotSnapshotTopicDescriptor(@NotNull IWsApi wsApi, @Nullable IMarketTickerPbWsApi iMarketTickerPbWsApi) {
        Intrinsics.checkNotNullParameter(wsApi, "wsApi");
        this.f28103a = wsApi;
        this.f28104b = iMarketTickerPbWsApi;
        this.f28105c = "/market/snapshot_app:";
        this.f28107e = WsClientType.SPOT;
    }

    @Override // com.kubi.kucoin.manager.KCSocketTopicDescriptor
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF28106d() {
        return this.f28106d;
    }

    @Override // com.kubi.kucoin.manager.KCSocketTopicDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC41634e<WsMarketSnapshotEntity> mo32500b(@NotNull String topic) {
        InterfaceC41634e interfaceC41634eM90881E;
        InterfaceC41634e<WsMarketSnapshotEntity> interfaceC41634eM90887K;
        InterfaceC41634e interfaceC41634eM90881E2;
        InterfaceC41634e<WsMarketSnapshotEntity> interfaceC41634eM90887K2;
        Intrinsics.checkNotNullParameter(topic, "topic");
        if (!C15510k.m32613b() || this.f28104b == null) {
            final InterfaceC41634e<SpotWSEntity> interfaceC41634eM32600a = this.f28103a.m32600a(topic);
            return new InterfaceC41634e<WsMarketSnapshotEntity>() { // from class: com.kubi.kucoin.manager.SpotSnapshotTopicDescriptor$createFlow$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: com.kubi.kucoin.manager.SpotSnapshotTopicDescriptor$createFlow$$inlined$mapNotNull$1$2 */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MarketSnapshotTopicDescriptors.kt\ncom/kubi/kucoin/manager/SpotSnapshotTopicDescriptor\n*L\n1#1,49:1\n57#2:50\n58#2:52\n59#3:51\n*E\n"})
                public static final class C154832<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f28109b;

                    /* JADX INFO: renamed from: com.kubi.kucoin.manager.SpotSnapshotTopicDescriptor$createFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.kucoin.manager.SpotSnapshotTopicDescriptor$createFlow$$inlined$mapNotNull$1$2", m90122f = "MarketSnapshotTopicDescriptors.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {52}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$mapNotNull_u24lambda_u246", "transformed", "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C154832.this.emit(null, this);
                        }
                    }

                    public C154832(InterfaceC41635f interfaceC41635f) {
                        this.f28109b = interfaceC41635f;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i11 = anonymousClass1.label;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = anonymousClass1.label;
                        if (i12 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC41635f interfaceC41635f = this.f28109b;
                            SpotWSEntity spotWSEntity = (SpotWSEntity) obj;
                            WsMarketSnapshotEntity data = spotWSEntity != null ? spotWSEntity.getData() : null;
                            if (data != null) {
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                                anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(data);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(data, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC41634e
                public Object collect(InterfaceC41635f<? super WsMarketSnapshotEntity> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41634eM32600a.collect(new C154832(interfaceC41635f), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
        String strRemovePrefix = StringsKt.removePrefix(topic, (CharSequence) getF28105c());
        if (StringsKt.contains$default((CharSequence) strRemovePrefix, (CharSequence) C33820nf.f71144W, false, 2, (Object) null)) {
            InterfaceC41634e<TickerItemApp> interfaceC41634eM32570b = this.f28104b.m32570b("/app/ticker:" + strRemovePrefix);
            return (interfaceC41634eM32570b == null || (interfaceC41634eM90881E2 = C41636g.m90881E(interfaceC41634eM32570b)) == null || (interfaceC41634eM90887K2 = C41636g.m90887K(new SpotSnapshotTopicDescriptor$createFlow$$inlined$transform$1(interfaceC41634eM90881E2, null))) == null) ? C41636g.m90879C() : interfaceC41634eM90887K2;
        }
        InterfaceC41634e<TickerItemsApp> interfaceC41634eM32569a = this.f28104b.m32569a("/app/tickers:" + strRemovePrefix);
        return (interfaceC41634eM32569a == null || (interfaceC41634eM90881E = C41636g.m90881E(interfaceC41634eM32569a)) == null || (interfaceC41634eM90887K = C41636g.m90887K(new SpotSnapshotTopicDescriptor$createFlow$$inlined$transform$2(interfaceC41634eM90881E, null))) == null) ? C41636g.m90879C() : interfaceC41634eM90887K;
    }

    @Override // com.kubi.kucoin.manager.KCSocketTopicDescriptor
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getF28105c() {
        return this.f28105c;
    }

    @Override // com.kubi.kucoin.manager.KCSocketTopicDescriptor
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String mo32501d(@NotNull WsMarketSnapshotEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return entity.getSymbolCode();
    }

    /* JADX INFO: renamed from: h */
    public void m32564h(@Nullable String str) {
        this.f28106d = str;
    }
}
