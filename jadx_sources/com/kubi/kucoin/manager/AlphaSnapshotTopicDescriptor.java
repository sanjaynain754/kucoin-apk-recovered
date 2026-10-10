package com.kubi.kucoin.manager;

import com.facebook.react.animated.InterpolationAnimatedNode;
import com.kubi.data.entity.WsAlphaSnapshotEntity;
import com.kucoin.discover.alpha.AlphaTickerOuterClass$AlphaTicker;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: MarketSnapshotTopicDescriptors.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kucoin/manager/AlphaSnapshotTopicDescriptor;", "Lcom/kubi/kucoin/manager/KCSocketTopicDescriptor;", "Lcom/kubi/data/entity/WsAlphaSnapshotEntity;", "wsApi", "Lcom/kubi/kucoin/manager/IWsApi;", "pbWsApi", "Lcom/kubi/kucoin/manager/IMarketAlphaTickerPbWsApi;", "alphaSpan", "", "<init>", "(Lcom/kubi/kucoin/manager/IWsApi;Lcom/kubi/kucoin/manager/IMarketAlphaTickerPbWsApi;Ljava/lang/String;)V", "getAlphaSpan", "()Ljava/lang/String;", "setAlphaSpan", "(Ljava/lang/String;)V", "topicPrefix", "getTopicPrefix", "topicParams", "getTopicParams", "setTopicParams", "protobufTopicPrefix", "getProtobufTopicPrefix", "wsClientType", "Lcom/kubi/kucoin/manager/WsClientType;", "getWsClientType", "()Lcom/kubi/kucoin/manager/WsClientType;", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, TUIConstants.TIMPush.NOTIFICATION.ENTITY, "createFlow", "Lkotlinx/coroutines/flow/Flow;", "topic", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketSnapshotTopicDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketSnapshotTopicDescriptors.kt\ncom/kubi/kucoin/manager/AlphaSnapshotTopicDescriptor\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,184:1\n56#2:185\n59#2:189\n49#2:196\n51#2:200\n46#3:186\n51#3:188\n46#3:197\n51#3:199\n105#4:187\n105#4:198\n774#5:190\n865#5,2:191\n1563#5:193\n1634#5,2:194\n1636#5:201\n*S KotlinDebug\n*F\n+ 1 MarketSnapshotTopicDescriptors.kt\ncom/kubi/kucoin/manager/AlphaSnapshotTopicDescriptor\n*L\n168#1:185\n168#1:189\n179#1:196\n179#1:200\n168#1:186\n168#1:188\n179#1:197\n179#1:199\n168#1:187\n179#1:198\n172#1:190\n172#1:191,2\n175#1:193\n175#1:194,2\n175#1:201\n*E\n"})
public final class AlphaSnapshotTopicDescriptor implements KCSocketTopicDescriptor<WsAlphaSnapshotEntity> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IWsApi f28054a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final IMarketAlphaTickerPbWsApi f28055b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public String f28056c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f28057d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f28058e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final WsClientType f28059f;

    public AlphaSnapshotTopicDescriptor(@NotNull IWsApi wsApi, @Nullable IMarketAlphaTickerPbWsApi iMarketAlphaTickerPbWsApi, @NotNull String alphaSpan) {
        Intrinsics.checkNotNullParameter(wsApi, "wsApi");
        Intrinsics.checkNotNullParameter(alphaSpan, "alphaSpan");
        this.f28054a = wsApi;
        this.f28055b = iMarketAlphaTickerPbWsApi;
        this.f28056c = alphaSpan;
        this.f28057d = "/alpha/snapshot_market:";
        this.f28059f = WsClientType.SPOT;
    }

    @Override // com.kubi.kucoin.manager.KCSocketTopicDescriptor
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF28058e() {
        return this.f28058e;
    }

    @Override // com.kubi.kucoin.manager.KCSocketTopicDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC41634e<WsAlphaSnapshotEntity> mo32500b(@NotNull String topic) {
        final InterfaceC41634e interfaceC41634eM90881E;
        Intrinsics.checkNotNullParameter(topic, "topic");
        if (!C15506i.m32607c() || this.f28055b == null) {
            final InterfaceC41634e<AlphaWSEntity> interfaceC41634eM32602c = this.f28054a.m32602c(topic);
            return new InterfaceC41634e<WsAlphaSnapshotEntity>() { // from class: com.kubi.kucoin.manager.AlphaSnapshotTopicDescriptor$createFlow$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: com.kubi.kucoin.manager.AlphaSnapshotTopicDescriptor$createFlow$$inlined$mapNotNull$1$2 */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MarketSnapshotTopicDescriptors.kt\ncom/kubi/kucoin/manager/AlphaSnapshotTopicDescriptor\n*L\n1#1,49:1\n57#2:50\n58#2:52\n168#3:51\n*E\n"})
                public static final class C154712<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f28061b;

                    /* JADX INFO: renamed from: com.kubi.kucoin.manager.AlphaSnapshotTopicDescriptor$createFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.kucoin.manager.AlphaSnapshotTopicDescriptor$createFlow$$inlined$mapNotNull$1$2", m90122f = "MarketSnapshotTopicDescriptors.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {52}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$mapNotNull_u24lambda_u246", "transformed", "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
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
                            return C154712.this.emit(null, this);
                        }
                    }

                    public C154712(InterfaceC41635f interfaceC41635f) {
                        this.f28061b = interfaceC41635f;
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
                            InterfaceC41635f interfaceC41635f = this.f28061b;
                            AlphaWSEntity alphaWSEntity = (AlphaWSEntity) obj;
                            WsAlphaSnapshotEntity data = alphaWSEntity != null ? alphaWSEntity.getData() : null;
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
                public Object collect(InterfaceC41635f<? super WsAlphaSnapshotEntity> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41634eM32602c.collect(new C154712(interfaceC41635f), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
        List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.removePrefix(topic, (CharSequence) getF28057d()), new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return C41636g.m90879C();
        }
        String strM32608d = C15506i.m32608d(this.f28056c);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC41634e<AlphaTickerOuterClass$AlphaTicker> interfaceC41634eM32567a = this.f28055b.m32567a("/alpha/ticker:" + strM32608d + '_' + ((String) it.next()));
            arrayList2.add((interfaceC41634eM32567a == null || (interfaceC41634eM90881E = C41636g.m90881E(interfaceC41634eM32567a)) == null) ? C41636g.m90879C() : new InterfaceC41634e<WsAlphaSnapshotEntity>() { // from class: com.kubi.kucoin.manager.AlphaSnapshotTopicDescriptor$createFlow$lambda$3$$inlined$map$1

                /* JADX INFO: renamed from: com.kubi.kucoin.manager.AlphaSnapshotTopicDescriptor$createFlow$lambda$3$$inlined$map$1$2 */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MarketSnapshotTopicDescriptors.kt\ncom/kubi/kucoin/manager/AlphaSnapshotTopicDescriptor\n*L\n1#1,49:1\n50#2:50\n179#3:51\n*E\n"})
                public static final class C154722<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f28063b;

                    /* JADX INFO: renamed from: com.kubi.kucoin.manager.AlphaSnapshotTopicDescriptor$createFlow$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.kucoin.manager.AlphaSnapshotTopicDescriptor$createFlow$lambda$3$$inlined$map$1$2", m90122f = "MarketSnapshotTopicDescriptors.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C154722.this.emit(null, this);
                        }
                    }

                    public C154722(InterfaceC41635f interfaceC41635f) {
                        this.f28063b = interfaceC41635f;
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
                            InterfaceC41635f interfaceC41635f = this.f28063b;
                            WsAlphaSnapshotEntity wsAlphaSnapshotEntityM32609e = C15506i.m32609e((AlphaTickerOuterClass$AlphaTicker) obj);
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(wsAlphaSnapshotEntityM32609e, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
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
                public Object collect(InterfaceC41635f<? super WsAlphaSnapshotEntity> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41634eM90881E.collect(new C154722(interfaceC41635f), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
        }
        return C41636g.m90893Q(arrayList2);
    }

    @Override // com.kubi.kucoin.manager.KCSocketTopicDescriptor
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getF28057d() {
        return this.f28057d;
    }

    @Override // com.kubi.kucoin.manager.KCSocketTopicDescriptor
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String mo32501d(@NotNull WsAlphaSnapshotEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return entity.getTokenBridgeId();
    }

    /* JADX INFO: renamed from: h */
    public final void m32504h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f28056c = str;
    }

    /* JADX INFO: renamed from: i */
    public void m32505i(@Nullable String str) {
        this.f28058e = str;
    }

    public /* synthetic */ AlphaSnapshotTopicDescriptor(IWsApi iWsApi, IMarketAlphaTickerPbWsApi iMarketAlphaTickerPbWsApi, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iWsApi, (i11 & 2) != 0 ? null : iMarketAlphaTickerPbWsApi, (i11 & 4) != 0 ? "24h" : str);
    }
}
