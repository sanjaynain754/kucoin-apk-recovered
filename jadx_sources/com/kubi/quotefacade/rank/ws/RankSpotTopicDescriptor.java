package com.kubi.quotefacade.rank.ws;

import com.facebook.react.animated.InterpolationAnimatedNode;
import com.kubi.data.entity.WsRankMarketSnapshotEntity;
import com.kubi.kucoin.manager.KCSocketTopicDescriptor;
import com.kubi.kucoin.manager.WsClientType;
import com.kucoin.discover.rankings.CryptoRankingListApp;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
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

/* JADX INFO: compiled from: RankTopicDescriptors.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u001e\u001a\u00020\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020!2\u0006\u0010\"\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000eR(\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/ws/RankSpotTopicDescriptor;", "Lcom/kubi/kucoin/manager/KCSocketTopicDescriptor;", "", "Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;", "wsApi", "Lcom/kubi/quotefacade/rank/ws/IRankWsApi;", "pbWsApi", "Lcom/kubi/quotefacade/rank/ws/IRankPbWsApi;", "fullTopic", "", "<init>", "(Lcom/kubi/quotefacade/rank/ws/IRankWsApi;Lcom/kubi/quotefacade/rank/ws/IRankPbWsApi;Ljava/lang/String;)V", "topicPrefix", "getTopicPrefix", "()Ljava/lang/String;", "topicParams", "getTopicParams", "setTopicParams", "(Ljava/lang/String;)V", "_pbParam", "protobufTopicPrefix", "getProtobufTopicPrefix", "_", "protobufTopicParams", "getProtobufTopicParams", "setProtobufTopicParams", "wsClientType", "Lcom/kubi/kucoin/manager/WsClientType;", "getWsClientType", "()Lcom/kubi/kucoin/manager/WsClientType;", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, TUIConstants.TIMPush.NOTIFICATION.ENTITY, "createFlow", "Lkotlinx/coroutines/flow/Flow;", "topic", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankTopicDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankTopicDescriptors.kt\ncom/kubi/quotefacade/rank/ws/RankSpotTopicDescriptor\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,175:1\n49#2:176\n51#2:180\n46#3:177\n51#3:179\n105#4:178\n*S KotlinDebug\n*F\n+ 1 RankTopicDescriptors.kt\ncom/kubi/quotefacade/rank/ws/RankSpotTopicDescriptor\n*L\n59#1:176\n59#1:180\n59#1:177\n59#1:179\n59#1:178\n*E\n"})
public final class RankSpotTopicDescriptor implements KCSocketTopicDescriptor<List<? extends WsRankMarketSnapshotEntity>> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IRankWsApi f42565a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final IRankPbWsApi f42566b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f42567c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f42568d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String f42569e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final WsClientType f42570f;

    public RankSpotTopicDescriptor(@NotNull IRankWsApi wsApi, @NotNull IRankPbWsApi pbWsApi, @NotNull String fullTopic) {
        Intrinsics.checkNotNullParameter(wsApi, "wsApi");
        Intrinsics.checkNotNullParameter(pbWsApi, "pbWsApi");
        Intrinsics.checkNotNullParameter(fullTopic, "fullTopic");
        this.f42565a = wsApi;
        this.f42566b = pbWsApi;
        this.f42567c = fullTopic;
        this.f42569e = C22515e.m52956e(fullTopic);
        this.f42570f = WsClientType.SPOT;
    }

    @Override // com.kubi.kucoin.manager.KCSocketTopicDescriptor
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF42568d() {
        return this.f42568d;
    }

    @Override // com.kubi.kucoin.manager.KCSocketTopicDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC41634e<List<? extends WsRankMarketSnapshotEntity>> mo32500b(@NotNull String topic) {
        final InterfaceC41634e interfaceC41634eM90881E;
        Intrinsics.checkNotNullParameter(topic, "topic");
        if (!C22515e.m52955d() || this.f42569e == null) {
            InterfaceC41634e<List<WsRankMarketSnapshotEntity>> interfaceC41634eM52949a = this.f42565a.m52949a(topic);
            return interfaceC41634eM52949a == null ? C41636g.m90879C() : interfaceC41634eM52949a;
        }
        InterfaceC41634e<CryptoRankingListApp> interfaceC41634eM52948a = this.f42566b.m52948a("/app/rank:" + this.f42569e);
        return (interfaceC41634eM52948a == null || (interfaceC41634eM90881E = C41636g.m90881E(interfaceC41634eM52948a)) == null) ? C41636g.m90879C() : new InterfaceC41634e<List<? extends WsRankMarketSnapshotEntity>>() { // from class: com.kubi.quotefacade.rank.ws.RankSpotTopicDescriptor$createFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.quotefacade.rank.ws.RankSpotTopicDescriptor$createFlow$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 RankTopicDescriptors.kt\ncom/kubi/quotefacade/rank/ws/RankSpotTopicDescriptor\n*L\n1#1,49:1\n50#2:50\n59#3:51\n*E\n"})
            public static final class C225102<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f42572b;

                /* JADX INFO: renamed from: com.kubi.quotefacade.rank.ws.RankSpotTopicDescriptor$createFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.quotefacade.rank.ws.RankSpotTopicDescriptor$createFlow$$inlined$map$1$2", m90122f = "RankTopicDescriptors.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C225102.this.emit(null, this);
                    }
                }

                public C225102(InterfaceC41635f interfaceC41635f) {
                    this.f42572b = interfaceC41635f;
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
                        InterfaceC41635f interfaceC41635f = this.f42572b;
                        List<WsRankMarketSnapshotEntity> listM52959h = C22515e.m52959h((CryptoRankingListApp) obj);
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(listM52959h, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(InterfaceC41635f<? super List<? extends WsRankMarketSnapshotEntity>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90881E.collect(new C225102(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.kubi.kucoin.manager.KCSocketTopicDescriptor
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getF42567c() {
        return this.f42567c;
    }

    @Override // com.kubi.kucoin.manager.KCSocketTopicDescriptor
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String mo32501d(@NotNull List<WsRankMarketSnapshotEntity> entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return "rank_spot";
    }
}
