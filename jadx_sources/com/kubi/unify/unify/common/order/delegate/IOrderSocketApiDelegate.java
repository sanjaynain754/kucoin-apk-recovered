package com.kubi.unify.unify.common.order.delegate;

import com.kubi.kumex.data.trade.model.OrdersPageEntity;
import com.kubi.network.api.subscribe.utils.C19319e;
import com.kubi.network.restful.C19321b;
import com.kubi.unify.entity.UnifyOrderEntity;
import com.kubi.unify.entity.UnifyPageEntity;
import com.kubi.unify.entity.UtaActiveOrdersCountDataResponse;
import com.kubi.utils.extensions.C27039d;
import er.C37237b;
import gr.C38000b;
import hr.C38290c;
import hr.C38293f;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.rx2.RxConvertKt;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import r60.InterfaceC43932a;
import r60.InterfaceC43933b;

/* JADX INFO: compiled from: IOrderSocketApiDelegate.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001fH\u0002J\u0018\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!0\u001fJ\u0010\u0010#\u001a\u00020\u0015*\u0006\u0012\u0002\b\u00030\u001cH\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\b¨\u0006$"}, m90084d2 = {"Lcom/kubi/unify/unify/common/order/delegate/IOrderSocketApiDelegate;", "", "<init>", "()V", "periodApi", "Lcom/kubi/unify/unify/common/order/api/IOrderSocketApi;", "kotlin.jvm.PlatformType", "getPeriodApi", "()Lcom/kubi/unify/unify/common/order/api/IOrderSocketApi;", "periodApi$delegate", "Lkotlin/Lazy;", "flowApi", "Lcom/kubi/unify/unify/common/order/api/IOrderApi;", "getFlowApi", "()Lcom/kubi/unify/unify/common/order/api/IOrderApi;", "flowApi$delegate", "socketApi", "getSocketApi", "socketApi$delegate", "observeActiveOrdersZip", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;", "symbol", "", "observeAdvanceOrdersZip", "map2OrderEntityObs", "periodFlow", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "Lcom/kubi/unify/entity/UnifyPageEntity;", "Lcom/kubi/unify/entity/UnifyOrderEntity;", "wsFlow", "Lkotlinx/coroutines/flow/Flow;", "refreshOrderCounts", "Lkotlin/Pair;", "", "map2OrderPage", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIOrderSocketApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IOrderSocketApiDelegate.kt\ncom/kubi/unify/unify/common/order/delegate/IOrderSocketApiDelegate\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n49#2:144\n51#2:148\n17#2:149\n19#2:153\n49#2:154\n51#2:158\n46#3:145\n51#3:147\n46#3:150\n51#3:152\n46#3:155\n51#3:157\n105#4:146\n105#4:151\n105#4:156\n1563#5:159\n1634#5,3:160\n*S KotlinDebug\n*F\n+ 1 IOrderSocketApiDelegate.kt\ncom/kubi/unify/unify/common/order/delegate/IOrderSocketApiDelegate\n*L\n117#1:144\n117#1:148\n118#1:149\n118#1:153\n128#1:154\n128#1:158\n117#1:145\n117#1:147\n118#1:150\n118#1:152\n128#1:155\n128#1:157\n117#1:146\n118#1:151\n128#1:156\n137#1:159\n137#1:160,3\n*E\n"})
public final class IOrderSocketApiDelegate {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f53461a = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.unify.common.order.delegate.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IOrderSocketApiDelegate.m65416m();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f53462b = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.unify.common.order.delegate.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IOrderSocketApiDelegate.m65415e();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f53463c = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.unify.common.order.delegate.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IOrderSocketApiDelegate.m65417o();
        }
    });

    /* JADX INFO: renamed from: i */
    public final Observable<OrdersPageEntity> m65421i(C38293f<UnifyPageEntity<UnifyOrderEntity>> c38293f, InterfaceC41634e<UnifyOrderEntity> interfaceC41634e) {
        final InterfaceC41634e interfaceC41634eM90904a0 = C41636g.m90904a0(C41636g.m90897U(C41636g.m90894R(c38293f, interfaceC41634e), new IOrderSocketApiDelegate$map2OrderEntityObs$1(null)), new IOrderSocketApiDelegate$map2OrderEntityObs$2(this, null));
        final InterfaceC41634e<OrdersPageEntity> interfaceC41634e2 = new InterfaceC41634e<OrdersPageEntity>() { // from class: com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$map2OrderEntityObs$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$map2OrderEntityObs$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 IOrderSocketApiDelegate.kt\ncom/kubi/unify/unify/common/order/delegate/IOrderSocketApiDelegate\n*L\n1#1,49:1\n50#2:50\n117#3:51\n*E\n"})
            public static final class C266762<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53467b;

                /* JADX INFO: renamed from: com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$map2OrderEntityObs$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$map2OrderEntityObs$$inlined$map$1$2", m90122f = "IOrderSocketApiDelegate.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C266762.this.emit(null, this);
                    }
                }

                public C266762(InterfaceC41635f interfaceC41635f) {
                    this.f53467b = interfaceC41635f;
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
                        InterfaceC41635f interfaceC41635f = this.f53467b;
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.kubi.kumex.data.trade.model.OrdersPageEntity");
                        OrdersPageEntity ordersPageEntity = (OrdersPageEntity) obj;
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(ordersPageEntity, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(InterfaceC41635f<? super OrdersPageEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90904a0.collect(new C266762(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return RxConvertKt.m91207d(C41636g.m90890N(new InterfaceC41634e<OrdersPageEntity>() { // from class: com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$map2OrderEntityObs$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$map2OrderEntityObs$$inlined$filter$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 IOrderSocketApiDelegate.kt\ncom/kubi/unify/unify/common/order/delegate/IOrderSocketApiDelegate\n*L\n1#1,49:1\n18#2:50\n19#2:52\n118#3:51\n*E\n"})
            public static final class C266752<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53465b;

                /* JADX INFO: renamed from: com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$map2OrderEntityObs$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$map2OrderEntityObs$$inlined$filter$1$2", m90122f = "IOrderSocketApiDelegate.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C266752.this.emit(null, this);
                    }
                }

                public C266752(InterfaceC41635f interfaceC41635f) {
                    this.f53465b = interfaceC41635f;
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
                        InterfaceC41635f interfaceC41635f = this.f53465b;
                        if (((OrdersPageEntity) obj).getTotalNum() != -1) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(InterfaceC41635f<? super OrdersPageEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634e2.collect(new C266752(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, C19319e.m42764c()), null, 1, null);
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC43933b m65416m() {
        return (InterfaceC43933b) C38290c.m86420a(C42597a.f94305a).create(InterfaceC43933b.class);
    }

    /* JADX INFO: renamed from: o */
    public static final InterfaceC43933b m65417o() {
        return (InterfaceC43933b) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_unified"))).m42776a().m42772b(InterfaceC43933b.class);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC43932a m65418f() {
        return (InterfaceC43932a) this.f53462b.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC43933b m65419g() {
        return (InterfaceC43933b) this.f53461a.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC43933b m65420h() {
        return (InterfaceC43933b) this.f53463c.getValue();
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC43932a m65415e() {
        return (InterfaceC43932a) C42597a.m93388d().create(InterfaceC43932a.class);
    }

    /* JADX INFO: renamed from: j */
    public final OrdersPageEntity m65422j(UnifyPageEntity<?> unifyPageEntity) {
        List<?> items = unifyPageEntity.getItems();
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        for (Object obj : items) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.kubi.unify.entity.UnifyOrderEntity");
            arrayList.add(((UnifyOrderEntity) obj).toOrderEntity());
        }
        return new OrdersPageEntity(arrayList, C27039d.m66652l(unifyPageEntity.getTotalNum()));
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Observable<OrdersPageEntity> m65423k(@Nullable String str) throws Throwable {
        C38293f<UnifyPageEntity<UnifyOrderEntity>> c38293fM96875h = InterfaceC43933b.m96875h(m65419g(), null, null, str, 0, 0, 27, null);
        return m65421i(c38293fM96875h, InterfaceC43933b.m96872c(m65420h(), c38293fM96875h, null, 2, null));
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Observable<OrdersPageEntity> m65424l(@Nullable String str) throws Throwable {
        C38293f<UnifyPageEntity<UnifyOrderEntity>> c38293fM96874e = InterfaceC43933b.m96874e(m65419g(), null, null, str, 0, 0, 27, null);
        return m65421i(c38293fM96874e, InterfaceC43933b.m96873d(m65420h(), c38293fM96874e, null, 2, null));
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final InterfaceC41634e<Pair<Long, Long>> m65425n() throws Throwable {
        final InterfaceC41634e interfaceC41634eM96856t = InterfaceC43932a.m96856t(m65418f(), null, 1, null);
        return new InterfaceC41634e<Pair<? extends Long, ? extends Long>>() { // from class: com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$refreshOrderCounts$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$refreshOrderCounts$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 IOrderSocketApiDelegate.kt\ncom/kubi/unify/unify/common/order/delegate/IOrderSocketApiDelegate\n*L\n1#1,49:1\n50#2:50\n129#3,3:51\n*E\n"})
            public static final class C266772<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53469b;

                /* JADX INFO: renamed from: com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$refreshOrderCounts$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$refreshOrderCounts$$inlined$map$1$2", m90122f = "IOrderSocketApiDelegate.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C266772.this.emit(null, this);
                    }
                }

                public C266772(InterfaceC41635f interfaceC41635f) {
                    this.f53469b = interfaceC41635f;
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
                        InterfaceC41635f interfaceC41635f = this.f53469b;
                        UtaActiveOrdersCountDataResponse utaActiveOrdersCountDataResponse = (UtaActiveOrdersCountDataResponse) obj;
                        Integer activeOrderCount = utaActiveOrdersCountDataResponse.getActiveOrderCount();
                        long jIntValue = activeOrderCount != null ? activeOrderCount.intValue() : 0L;
                        Integer activeAdvancedOrderCount = utaActiveOrdersCountDataResponse.getActiveAdvancedOrderCount();
                        Pair pair = new Pair(Boxing.boxLong(jIntValue), Boxing.boxLong(activeAdvancedOrderCount != null ? activeAdvancedOrderCount.intValue() : 0L));
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(pair, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(InterfaceC41635f<? super Pair<? extends Long, ? extends Long>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM96856t.collect(new C266772(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
