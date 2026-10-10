package com.kubi.mart.sidebar.spot.helper;

import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.mart.exception.MartException;
import com.kubi.utils.extensions.C27024b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SpotWsHelper.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1", m90122f = "SpotWsHelper.kt", m90123i = {0}, m90124l = {77}, m90125m = "invokeSuspend", m90126n = {"cacheMap"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nSpotWsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotWsHelper.kt\ncom/kubi/mart/sidebar/spot/helper/SpotWsHelper$subscribe$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,98:1\n1563#2:99\n1634#2,3:100\n49#3:103\n51#3:107\n17#3:108\n19#3:112\n46#4:104\n51#4:106\n46#4:109\n51#4:111\n105#5:105\n105#5:110\n*S KotlinDebug\n*F\n+ 1 SpotWsHelper.kt\ncom/kubi/mart/sidebar/spot/helper/SpotWsHelper$subscribe$1\n*L\n68#1:99\n68#1:100,3\n73#1:103\n73#1:107\n77#1:108\n77#1:112\n73#1:104\n73#1:106\n77#1:109\n77#1:111\n73#1:105\n77#1:110\n*E\n"})
public final class SpotWsHelper$subscribe$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<List<String>> $batched;
    final /* synthetic */ Function1<List<WsMarketSnapshotEntity>, Unit> $onWsData;
    Object L$0;
    int label;
    final /* synthetic */ SpotWsHelper this$0;

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1$2 */
    /* JADX INFO: compiled from: SpotWsHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/mart/sidebar/spot/helper/SpotWSEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1$2", m90122f = "SpotWsHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nSpotWsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotWsHelper.kt\ncom/kubi/mart/sidebar/spot/helper/SpotWsHelper$subscribe$1$2\n+ 2 MartIssue.kt\ncom/kubi/mart/exception/MartIssueKt\n*L\n1#1,98:1\n38#2,2:99\n*S KotlinDebug\n*F\n+ 1 SpotWsHelper.kt\ncom/kubi/mart/sidebar/spot/helper/SpotWsHelper$subscribe$1$2\n*L\n71#1:99,2\n*E\n"})
    public static final class C188572 extends SuspendLambda implements Function3<InterfaceC41635f<? super SpotWSEntity>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C188572(Continuation<? super C188572> continuation) {
            super(3, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super SpotWSEntity> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            C188572 c188572 = new C188572(continuation);
            c188572.L$0 = th2;
            return c188572.invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C43846g.m96568c(new MartException(th2, "SpotWsHelper", false, null, 8, null), null, 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1$3 */
    /* JADX INFO: compiled from: SpotWsHelper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/mart/sidebar/spot/helper/SpotWSEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1$3", m90122f = "SpotWsHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nSpotWsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotWsHelper.kt\ncom/kubi/mart/sidebar/spot/helper/SpotWsHelper$subscribe$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
    public static final class C188583 extends SuspendLambda implements Function2<SpotWSEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ ConcurrentHashMap<String, WsMarketSnapshotEntity> $cacheMap;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SpotWSEntity spotWSEntity, Continuation<? super Unit> continuation) {
            return ((C188583) create(spotWSEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188583(ConcurrentHashMap<String, WsMarketSnapshotEntity> concurrentHashMap, Continuation<? super C188583> continuation) {
            super(2, continuation);
            this.$cacheMap = concurrentHashMap;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C188583 c188583 = new C188583(this.$cacheMap, continuation);
            c188583.L$0 = obj;
            return c188583;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SpotWSEntity spotWSEntity = (SpotWSEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WsMarketSnapshotEntity data = spotWSEntity.getData();
            if (data != null) {
                this.$cacheMap.put(data.getSymbolCode(), data);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1$a */
    /* JADX INFO: compiled from: SpotWsHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18859a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SpotWsHelper f34749b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1<List<WsMarketSnapshotEntity>, Unit> f34750c;

        /* JADX WARN: Multi-variable type inference failed */
        public C18859a(SpotWsHelper spotWsHelper, Function1<? super List<WsMarketSnapshotEntity>, Unit> function1) {
            this.f34749b = spotWsHelper;
            this.f34750c = function1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<WsMarketSnapshotEntity> list, Continuation<? super Unit> continuation) {
            if (!C41713n0.m91132h(this.f34749b.f34747a)) {
                return Unit.INSTANCE;
            }
            this.f34750c.invoke(CollectionsKt.filterNotNull(list));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpotWsHelper$subscribe$1(List<? extends List<String>> list, SpotWsHelper spotWsHelper, Function1<? super List<WsMarketSnapshotEntity>, Unit> function1, Continuation<? super SpotWsHelper$subscribe$1> continuation) {
        super(2, continuation);
        this.$batched = list;
        this.this$0 = spotWsHelper;
        this.$onWsData = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotWsHelper$subscribe$1(this.$batched, this.this$0, this.$onWsData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SpotWsHelper$subscribe$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            List<List<String>> list = this.$batched;
            SpotWsHelper spotWsHelper = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String str = String.format("/market/snapshot_app:%s", Arrays.copyOf(new Object[]{CollectionsKt.joinToString$default((List) it.next(), ",", null, null, 0, null, null, 62, null)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                arrayList.add(spotWsHelper.m41496e().m41500a(str));
            }
            final InterfaceC41634e interfaceC41634eM90937t = C41636g.m90937t(C41636g.m90896T(C41636g.m90917h(C41636g.m90893Q(arrayList), new C188572(null)), new C188583(concurrentHashMap, null)), 1200L);
            final InterfaceC41634e<List<? extends WsMarketSnapshotEntity>> interfaceC41634e = new InterfaceC41634e<List<? extends WsMarketSnapshotEntity>>() { // from class: com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1$invokeSuspend$$inlined$map$1$2 */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SpotWsHelper.kt\ncom/kubi/mart/sidebar/spot/helper/SpotWsHelper$subscribe$1\n*L\n1#1,49:1\n50#2:50\n74#3,3:51\n*E\n"})
                public static final class C188612<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f34755b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ ConcurrentHashMap f34756c;

                    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1$invokeSuspend$$inlined$map$1$2", m90122f = "SpotWsHelper.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                            return C188612.this.emit(null, this);
                        }
                    }

                    public C188612(InterfaceC41635f interfaceC41635f, ConcurrentHashMap concurrentHashMap) {
                        this.f34755b = interfaceC41635f;
                        this.f34756c = concurrentHashMap;
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
                            InterfaceC41635f interfaceC41635f = this.f34755b;
                            Collection collectionValues = this.f34756c.values();
                            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                            List listM66558a = C27024b.m66558a(CollectionsKt.toList(collectionValues));
                            this.f34756c.clear();
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(listM66558a, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(InterfaceC41635f<? super List<? extends WsMarketSnapshotEntity>> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41634eM90937t.collect(new C188612(interfaceC41635f, concurrentHashMap), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            InterfaceC41634e<List<? extends WsMarketSnapshotEntity>> interfaceC41634e2 = new InterfaceC41634e<List<? extends WsMarketSnapshotEntity>>() { // from class: com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1$invokeSuspend$$inlined$filter$1$2 */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SpotWsHelper.kt\ncom/kubi/mart/sidebar/spot/helper/SpotWsHelper$subscribe$1\n*L\n1#1,49:1\n18#2:50\n19#2:52\n77#3:51\n*E\n"})
                public static final class C188602<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f34752b;

                    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.helper.SpotWsHelper$subscribe$1$invokeSuspend$$inlined$filter$1$2", m90122f = "SpotWsHelper.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                            return C188602.this.emit(null, this);
                        }
                    }

                    public C188602(InterfaceC41635f interfaceC41635f) {
                        this.f34752b = interfaceC41635f;
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
                            InterfaceC41635f interfaceC41635f = this.f34752b;
                            if (!((List) obj).isEmpty()) {
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
                public Object collect(InterfaceC41635f<? super List<? extends WsMarketSnapshotEntity>> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41634e.collect(new C188602(interfaceC41635f), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            C18859a c18859a = new C18859a(this.this$0, this.$onWsData);
            this.L$0 = SpillingKt.nullOutSpilledVariable(concurrentHashMap);
            this.label = 1;
            if (interfaceC41634e2.collect(c18859a, this) == coroutine_suspended) {
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
}
