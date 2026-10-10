package com.kubi.spot.dialog.order;

import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.kucoin.manager.SpotMatchPushEntity;
import com.kubi.spot.SpotRemoteConfig;
import com.kubi.spot.entity.LatestPriceWsEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: AmendOrderViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.dialog.order.AmendOrderViewModel$subscribeLatestPrice$1", m90122f = "AmendOrderViewModel.kt", m90123i = {0}, m90124l = {103}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nAmendOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmendOrderViewModel.kt\ncom/kubi/spot/dialog/order/AmendOrderViewModel$subscribeLatestPrice$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,123:1\n49#2:124\n51#2:128\n46#3:125\n51#3:127\n105#4:126\n*S KotlinDebug\n*F\n+ 1 AmendOrderViewModel.kt\ncom/kubi/spot/dialog/order/AmendOrderViewModel$subscribeLatestPrice$1\n*L\n86#1:124\n86#1:128\n86#1:125\n86#1:127\n86#1:126\n*E\n"})
public final class AmendOrderViewModel$subscribeLatestPrice$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AmendOrderViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.spot.dialog.order.AmendOrderViewModel$subscribeLatestPrice$1$2 */
    /* JADX INFO: compiled from: AmendOrderViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/kucoin/manager/SpotMatchPushEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.dialog.order.AmendOrderViewModel$subscribeLatestPrice$1$2", m90122f = "AmendOrderViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C252772 extends SuspendLambda implements Function3<InterfaceC41635f<? super SpotMatchPushEntity>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C252772(Continuation<? super C252772> continuation) {
            super(3, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super SpotMatchPushEntity> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            C252772 c252772 = new C252772(continuation);
            c252772.L$0 = th2;
            return c252772.invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97258b("catch--->" + th2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.dialog.order.AmendOrderViewModel$subscribeLatestPrice$1$a */
    /* JADX INFO: compiled from: AmendOrderViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25278a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41709m0 f50513b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AmendOrderViewModel f50514c;

        public C25278a(InterfaceC41709m0 interfaceC41709m0, AmendOrderViewModel amendOrderViewModel) {
            this.f50513b = interfaceC41709m0;
            this.f50514c = amendOrderViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(SpotMatchPushEntity spotMatchPushEntity, Continuation<? super Unit> continuation) {
            long sequence = spotMatchPushEntity.getSequence();
            if (C41713n0.m91132h(this.f50513b) && sequence > this.f50514c.f50512c0) {
                this.f50514c.f50512c0 = sequence;
                C44128b.m97265i("collect 更新，sequence=" + sequence);
                this.f50514c.f50510a0.postValue(spotMatchPushEntity.getPrice());
            } else {
                C44128b.m97265i("忽略推送，sequence=" + sequence + " <= latestSequence=" + this.f50514c.f50512c0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmendOrderViewModel$subscribeLatestPrice$1(String str, AmendOrderViewModel amendOrderViewModel, Continuation<? super AmendOrderViewModel$subscribeLatestPrice$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.this$0 = amendOrderViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AmendOrderViewModel$subscribeLatestPrice$1 amendOrderViewModel$subscribeLatestPrice$1 = new AmendOrderViewModel$subscribeLatestPrice$1(this.$symbol, this.this$0, continuation);
        amendOrderViewModel$subscribeLatestPrice$1.L$0 = obj;
        return amendOrderViewModel$subscribeLatestPrice$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AmendOrderViewModel$subscribeLatestPrice$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            SpotMarketSocketAdapter spotMarketSocketAdapter = SpotMarketSocketAdapter.f28144a;
            String strM66668h = C27041f.m66668h(this.$symbol);
            final AmendOrderViewModel amendOrderViewModel = this.this$0;
            final String str = this.$symbol;
            InterfaceC41634e interfaceC41634eM90937t = C41636g.m90937t(C41636g.m90917h(SpotMarketSocketAdapter.m32626N(spotMarketSocketAdapter, strM66668h, false, new Function0() { // from class: com.kubi.spot.dialog.order.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AmendOrderViewModel$subscribeLatestPrice$1.m61719f(amendOrderViewModel, str);
                }
            }, 2, null), new C252772(null)), SpotRemoteConfig.f49637a.m59947l());
            C25278a c25278a = new C25278a(interfaceC41709m0, this.this$0);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.label = 1;
            if (interfaceC41634eM90937t.collect(c25278a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC41634e m61719f(AmendOrderViewModel amendOrderViewModel, String str) {
        final InterfaceC41634e<LatestPriceWsEntity> interfaceC41634eM82906b = amendOrderViewModel.m61713B().m82906b(DowngradeExKt.m66551u("/market/match:%s", new Object[]{str}, null, 2, null));
        return new InterfaceC41634e<SpotMatchPushEntity>() { // from class: com.kubi.spot.dialog.order.AmendOrderViewModel$subscribeLatestPrice$1$invokeSuspend$lambda$1$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.spot.dialog.order.AmendOrderViewModel$subscribeLatestPrice$1$invokeSuspend$lambda$1$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AmendOrderViewModel.kt\ncom/kubi/spot/dialog/order/AmendOrderViewModel$subscribeLatestPrice$1\n*L\n1#1,49:1\n50#2:50\n87#3,12:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f50516b;

                /* JADX INFO: renamed from: com.kubi.spot.dialog.order.AmendOrderViewModel$subscribeLatestPrice$1$invokeSuspend$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.spot.dialog.order.AmendOrderViewModel$subscribeLatestPrice$1$invokeSuspend$lambda$1$$inlined$map$1$2", m90122f = "AmendOrderViewModel.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f50516b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Long longOrNull;
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
                        InterfaceC41635f interfaceC41635f = this.f50516b;
                        LatestPriceWsEntity latestPriceWsEntity = (LatestPriceWsEntity) obj;
                        long jM66652l = C27039d.m66652l(latestPriceWsEntity.getSequence());
                        String strM66668h = C27041f.m66668h(latestPriceWsEntity.getType());
                        String strM66668h2 = C27041f.m66668h(latestPriceWsEntity.getSymbol());
                        String strM66668h3 = C27041f.m66668h(latestPriceWsEntity.getSide());
                        String strM66668h4 = C27041f.m66668h(latestPriceWsEntity.getPrice());
                        String strM66668h5 = C27041f.m66668h(latestPriceWsEntity.getSize());
                        String strM66668h6 = C27041f.m66668h(latestPriceWsEntity.getTradeId());
                        String strM66668h7 = C27041f.m66668h(latestPriceWsEntity.getTakerOrderId());
                        String strM66668h8 = C27041f.m66668h(latestPriceWsEntity.getMakerOrderId());
                        String time = latestPriceWsEntity.getTime();
                        SpotMatchPushEntity spotMatchPushEntity = new SpotMatchPushEntity(jM66652l, strM66668h, strM66668h2, strM66668h3, strM66668h4, strM66668h5, strM66668h6, strM66668h7, strM66668h8, (time == null || (longOrNull = StringsKt.toLongOrNull(time)) == null) ? 0L : longOrNull.longValue());
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(spotMatchPushEntity, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(InterfaceC41635f<? super SpotMatchPushEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM82906b.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
