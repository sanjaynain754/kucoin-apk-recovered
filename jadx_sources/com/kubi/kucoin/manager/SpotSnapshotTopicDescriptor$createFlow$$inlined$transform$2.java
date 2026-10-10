package com.kubi.kucoin.manager;

import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kucoin.discover.tickers.TickerItemApp;
import com.kucoin.discover.tickers.TickerItemsApp;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¨\u0006\u0004"}, m90084d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.manager.SpotSnapshotTopicDescriptor$createFlow$$inlined$transform$2", m90122f = "MarketSnapshotTopicDescriptors.kt", m90123i = {0}, m90124l = {36}, m90125m = "invokeSuspend", m90126n = {"$this$flow"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,40:1\n*E\n"})
public final class SpotSnapshotTopicDescriptor$createFlow$$inlined$transform$2 extends SuspendLambda implements Function2<InterfaceC41635f<? super WsMarketSnapshotEntity>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41634e $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.kucoin.manager.SpotSnapshotTopicDescriptor$createFlow$$inlined$transform$2$1 */
    /* JADX INFO: compiled from: Emitters.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n+ 2 MarketSnapshotTopicDescriptors.kt\ncom/kubi/kucoin/manager/SpotSnapshotTopicDescriptor\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n78#2:39\n79#2:42\n1869#3,2:40\n*S KotlinDebug\n*F\n+ 1 MarketSnapshotTopicDescriptors.kt\ncom/kubi/kucoin/manager/SpotSnapshotTopicDescriptor\n*L\n78#1:40,2\n*E\n"})
    public static final class C154851<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41635f<WsMarketSnapshotEntity> f28111b;

        /* JADX INFO: renamed from: com.kubi.kucoin.manager.SpotSnapshotTopicDescriptor$createFlow$$inlined$transform$2$1$1, reason: invalid class name */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.kucoin.manager.SpotSnapshotTopicDescriptor$createFlow$$inlined$transform$2$1", m90122f = "MarketSnapshotTopicDescriptors.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m90124l = {39}, m90125m = "emit", m90126n = {"value", "$completion", "tickerItems", "$this$createFlow_u24lambda_u243", "$this$forEach$iv", "element$iv", "it", "$i$a$-transform-SpotSnapshotTopicDescriptor$createFlow$3", "$i$f$forEach", "$i$a$-forEach-SpotSnapshotTopicDescriptor$createFlow$3$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "I$0", "I$1", "I$2"})
        public static final class AnonymousClass1 extends ContinuationImpl {
            int I$0;
            int I$1;
            int I$2;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            Object L$6;
            Object L$7;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C154851.this.emit(null, this);
            }
        }

        public C154851(InterfaceC41635f interfaceC41635f) {
            this.f28111b = interfaceC41635f;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public final Object emit(T t11, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1;
            InterfaceC41635f<WsMarketSnapshotEntity> interfaceC41635f;
            TickerItemsApp tickerItemsApp;
            Iterable iterable;
            Iterator<T> it;
            Object obj;
            Continuation continuation2;
            int i11;
            int i12;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i13 = anonymousClass1.label;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i13 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
            Object obj2 = anonymousClass1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i14 = anonymousClass1.label;
            if (i14 == 0) {
                ResultKt.throwOnFailure(obj2);
                InterfaceC41635f<WsMarketSnapshotEntity> interfaceC41635f2 = this.f28111b;
                TickerItemsApp tickerItemsApp2 = (TickerItemsApp) t11;
                List<TickerItemApp> itemsList = tickerItemsApp2.getItemsList();
                Intrinsics.checkNotNullExpressionValue(itemsList, "getItemsList(...)");
                interfaceC41635f = interfaceC41635f2;
                tickerItemsApp = tickerItemsApp2;
                iterable = itemsList;
                it = itemsList.iterator();
                obj = t11;
                continuation2 = anonymousClass1;
                i11 = 0;
                i12 = 0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = anonymousClass1.I$1;
                int i16 = anonymousClass1.I$0;
                Iterator<T> it2 = (Iterator) anonymousClass1.L$5;
                Iterable iterable2 = (Iterable) anonymousClass1.L$4;
                InterfaceC41635f<WsMarketSnapshotEntity> interfaceC41635f3 = (InterfaceC41635f) anonymousClass1.L$3;
                TickerItemsApp tickerItemsApp3 = (TickerItemsApp) anonymousClass1.L$2;
                Continuation continuation3 = (Continuation) anonymousClass1.L$1;
                Object obj3 = anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj2);
                i11 = i15;
                continuation2 = continuation3;
                tickerItemsApp = tickerItemsApp3;
                interfaceC41635f = interfaceC41635f3;
                iterable = iterable2;
                it = it2;
                i12 = i16;
                obj = obj3;
            }
            while (it.hasNext()) {
                T next = it.next();
                TickerItemApp tickerItemApp = (TickerItemApp) next;
                Intrinsics.checkNotNull(tickerItemApp);
                WsMarketSnapshotEntity wsMarketSnapshotEntityM32614c = C15510k.m32614c(tickerItemApp);
                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(continuation2);
                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(tickerItemsApp);
                anonymousClass1.L$3 = interfaceC41635f;
                anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(iterable);
                anonymousClass1.L$5 = it;
                anonymousClass1.L$6 = SpillingKt.nullOutSpilledVariable(next);
                anonymousClass1.L$7 = SpillingKt.nullOutSpilledVariable(tickerItemApp);
                anonymousClass1.I$0 = i12;
                anonymousClass1.I$1 = i11;
                anonymousClass1.I$2 = 0;
                anonymousClass1.label = 1;
                if (interfaceC41635f.emit(wsMarketSnapshotEntityM32614c, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotSnapshotTopicDescriptor$createFlow$$inlined$transform$2(InterfaceC41634e interfaceC41634e, Continuation continuation) {
        super(2, continuation);
        this.$this_transform = interfaceC41634e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotSnapshotTopicDescriptor$createFlow$$inlined$transform$2 spotSnapshotTopicDescriptor$createFlow$$inlined$transform$2 = new SpotSnapshotTopicDescriptor$createFlow$$inlined$transform$2(this.$this_transform, continuation);
        spotSnapshotTopicDescriptor$createFlow$$inlined$transform$2.L$0 = obj;
        return spotSnapshotTopicDescriptor$createFlow$$inlined$transform$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41635f<? super WsMarketSnapshotEntity> interfaceC41635f, Continuation<? super Unit> continuation) {
        return ((SpotSnapshotTopicDescriptor$createFlow$$inlined$transform$2) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
            InterfaceC41634e interfaceC41634e = this.$this_transform;
            C154851 c154851 = new C154851(interfaceC41635f);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
            this.label = 1;
            if (interfaceC41634e.collect(c154851, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
