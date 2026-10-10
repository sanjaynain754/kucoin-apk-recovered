package com.kubi.tradingbotkit.business.strategyList.viewModel;

import com.kubi.event.api.C12572a;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import h50.C38114a;
import i50.UiStates;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import m50.RobotStrategyNumEvent;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: StrategyListViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$fetchStrategyList$1", m90122f = "StrategyListViewModel.kt", m90123i = {}, m90124l = {163}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nStrategyListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrategyListViewModel.kt\ncom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel$fetchStrategyList$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n49#2:288\n51#2:292\n46#3:289\n51#3:291\n105#4:290\n25#5:293\n26#5:295\n1#6:294\n*S KotlinDebug\n*F\n+ 1 StrategyListViewModel.kt\ncom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel$fetchStrategyList$1\n*L\n158#1:288\n158#1:292\n158#1:289\n158#1:291\n158#1:290\n209#1:293\n209#1:295\n209#1:294\n*E\n"})
public final class StrategyListViewModel$fetchStrategyList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $categories;
    int label;
    final /* synthetic */ StrategyListViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$fetchStrategyList$1$2 */
    /* JADX INFO: compiled from: StrategyListViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "strategies", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$fetchStrategyList$1$2", m90122f = "StrategyListViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nStrategyListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrategyListViewModel.kt\ncom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel$fetchStrategyList$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,287:1\n774#2:288\n865#2,2:289\n1208#2,2:291\n1236#2,4:293\n1869#2,2:297\n1491#2:299\n1516#2,3:300\n1519#2,3:310\n382#3,7:303\n*S KotlinDebug\n*F\n+ 1 StrategyListViewModel.kt\ncom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel$fetchStrategyList$1$2\n*L\n172#1:288\n172#1:289,2\n173#1:291,2\n173#1:293,4\n175#1:297,2\n182#1:299\n182#1:300,3\n182#1:310,3\n182#1:303,7\n*E\n"})
    public static final class C262022 extends SuspendLambda implements Function2<List<? extends StrategyItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ StrategyListViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends StrategyItemEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<StrategyItemEntity>) list, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C262022(StrategyListViewModel strategyListViewModel, Continuation<? super C262022> continuation) {
            super(2, continuation);
            this.this$0 = strategyListViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C262022 c262022 = new C262022(this.this$0, continuation);
            c262022.L$0 = obj;
            return c262022;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<StrategyItemEntity> list, Continuation<? super Unit> continuation) {
            return ((C262022) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x0131  */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map mapEmptyMap;
            Map<Integer, ? extends List<StrategyItemEntity>> map;
            List<StrategyItemEntity> list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String name = RobotStrategyNumEvent.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            C12572a.m23695d(name, new RobotStrategyNumEvent(Boxing.boxInt(list != null ? list.size() : 0), this.this$0.getF52436X()), 0L, 4, null);
            List<StrategyItemEntity> listM86702c = ((UiStates) this.this$0.f52442d0.getValue()).m86702c();
            if (listM86702c != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listM86702c) {
                    Integer type = ((StrategyItemEntity) obj2).getType();
                    if (type != null && type.intValue() == 4) {
                        arrayList.add(obj2);
                    }
                }
                mapEmptyMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
                for (Object obj3 : arrayList) {
                    mapEmptyMap.put(((StrategyItemEntity) obj3).getId(), obj3);
                }
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            if (list != null) {
                for (StrategyItemEntity strategyItemEntity : list) {
                    Integer type2 = strategyItemEntity.getType();
                    if (type2 != null && type2.intValue() == 4) {
                        StrategyItemEntity strategyItemEntity2 = (StrategyItemEntity) mapEmptyMap.get(strategyItemEntity.getId());
                        strategyItemEntity.setExpand(strategyItemEntity2 != null ? strategyItemEntity2.isExpand() : false);
                        StrategyItemEntity strategyItemEntity3 = (StrategyItemEntity) mapEmptyMap.get(strategyItemEntity.getId());
                        strategyItemEntity.setShowYearProfitRate(strategyItemEntity3 != null ? strategyItemEntity3.isShowYearProfitRate() : false);
                    }
                }
            }
            if (list != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : list) {
                    Integer type3 = ((StrategyItemEntity) obj4).getType();
                    Object arrayList2 = linkedHashMap.get(type3);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(type3, arrayList2);
                    }
                    ((List) arrayList2).add(obj4);
                }
                Map<Integer, ? extends List<StrategyItemEntity>> mutableMap = MapsKt.toMutableMap(linkedHashMap);
                if (mutableMap != null) {
                    mutableMap.put(Boxing.boxInt(0), list);
                    map = mutableMap;
                } else {
                    map = null;
                }
            } else {
                map = null;
            }
            StrategyListViewModel strategyListViewModel = this.this$0;
            List<StrategyItemEntity> listM64156y = strategyListViewModel.m64156y(map != null ? map.get(Boxing.boxInt(strategyListViewModel.getF52438Z())) : null);
            if (listM64156y == null || listM64156y.isEmpty()) {
                this.this$0.f52442d0.setValue(((UiStates) this.this$0.f52442d0.getValue()).m86701a(false, false, list, map, CollectionsKt.listOf(new StrategyItemEntity(this.this$0.m64143A(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, Boxing.boxInt(-99), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -524290, -1, -1, 255, null))));
            } else {
                this.this$0.f52442d0.setValue(((UiStates) this.this$0.f52442d0.getValue()).m86701a(false, false, list, map, listM64156y));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyListViewModel$fetchStrategyList$1(StrategyListViewModel strategyListViewModel, List<String> list, Continuation<? super StrategyListViewModel$fetchStrategyList$1> continuation) {
        super(2, continuation);
        this.this$0 = strategyListViewModel;
        this.$categories = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyListViewModel$fetchStrategyList$1(this.this$0, this.$categories, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((StrategyListViewModel$fetchStrategyList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (((UiStates) this.this$0.f52442d0.getValue()).m86702c() == null) {
                this.this$0.f52442d0.setValue(UiStates.m86700b((UiStates) this.this$0.f52442d0.getValue(), true, false, null, null, null, 30, null));
            }
            final InterfaceC41634e<List<StrategyItemEntity>> interfaceC41634eM82980c = this.this$0.m64146D().m82980c(this.this$0.m64157z(CollectionsKt.joinToString$default(this.$categories, ",", null, null, 0, null, null, 62, null)));
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(new InterfaceC41634e<List<? extends StrategyItemEntity>>() { // from class: com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$fetchStrategyList$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$fetchStrategyList$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 StrategyListViewModel.kt\ncom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel$fetchStrategyList$1\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n160#3:51\n161#3:54\n162#3:56\n774#4:52\n865#4:53\n866#4:55\n*S KotlinDebug\n*F\n+ 1 StrategyListViewModel.kt\ncom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel$fetchStrategyList$1\n*L\n160#1:52\n160#1:53\n160#1:55\n*E\n"})
                public static final class AnonymousClass2<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f52447b;

                    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$fetchStrategyList$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$fetchStrategyList$1$invokeSuspend$$inlined$map$1$2", m90122f = "StrategyListViewModel.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        this.f52447b = interfaceC41635f;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        ArrayList arrayList;
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
                            InterfaceC41635f interfaceC41635f = this.f52447b;
                            List list = (List) obj;
                            if (list != null) {
                                arrayList = new ArrayList();
                                for (T t11 : list) {
                                    if (C38114a.m86044a((StrategyItemEntity) t11)) {
                                        arrayList.add(t11);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(InterfaceC41635f<? super List<? extends StrategyItemEntity>> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41634eM82980c.collect(new AnonymousClass2(interfaceC41635f), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, C42911a.m94119a());
            C262022 c262022 = new C262022(this.this$0, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM90890N, false, c262022, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        StrategyListViewModel strategyListViewModel = this.this$0;
        if (((C19334f) obj).getThrowable() != null) {
            strategyListViewModel.f52442d0.setValue(UiStates.m86700b((UiStates) strategyListViewModel.f52442d0.getValue(), false, true, null, null, null, 24, null));
        }
        return Unit.INSTANCE;
    }
}
