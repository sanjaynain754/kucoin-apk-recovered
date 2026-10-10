package com.kubi.futures.compliance;

import com.kubi.futures.data.compliance.IComplianceService;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import o00.C42911a;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sh.EuropeComplianceLangEntity;

/* JADX INFO: compiled from: EuropeComplianceLangDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.compliance.EuropeComplianceLangViewModel$fetchEuropeLang$1", m90122f = "EuropeComplianceLangDialog.kt", m90123i = {}, m90124l = {BuiltinOperator.RANDOM_UNIFORM}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nEuropeComplianceLangDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EuropeComplianceLangDialog.kt\ncom/kubi/futures/compliance/EuropeComplianceLangViewModel$fetchEuropeLang$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n49#2:157\n51#2:161\n46#3:158\n51#3:160\n105#4:159\n25#5:162\n26#5:164\n1#6:163\n*S KotlinDebug\n*F\n+ 1 EuropeComplianceLangDialog.kt\ncom/kubi/futures/compliance/EuropeComplianceLangViewModel$fetchEuropeLang$1\n*L\n138#1:157\n138#1:161\n138#1:158\n138#1:160\n138#1:159\n151#1:162\n151#1:164\n151#1:163\n*E\n"})
public final class EuropeComplianceLangViewModel$fetchEuropeLang$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EuropeComplianceLangViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.compliance.EuropeComplianceLangViewModel$fetchEuropeLang$1$2 */
    /* JADX INFO: compiled from: EuropeComplianceLangDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceLangEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.compliance.EuropeComplianceLangViewModel$fetchEuropeLang$1$2", m90122f = "EuropeComplianceLangDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C128552 extends SuspendLambda implements Function2<List<? extends EuropeComplianceLangEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EuropeComplianceLangViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends EuropeComplianceLangEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<EuropeComplianceLangEntity>) list, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128552(EuropeComplianceLangViewModel europeComplianceLangViewModel, Continuation<? super C128552> continuation) {
            super(2, continuation);
            this.this$0 = europeComplianceLangViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C128552 c128552 = new C128552(this.this$0, continuation);
            c128552.L$0 = obj;
            return c128552;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<EuropeComplianceLangEntity> list, Continuation<? super Unit> continuation) {
            return ((C128552) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m24541q().postValue(new Pair<>(list, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EuropeComplianceLangViewModel$fetchEuropeLang$1(EuropeComplianceLangViewModel europeComplianceLangViewModel, Continuation<? super EuropeComplianceLangViewModel$fetchEuropeLang$1> continuation) {
        super(2, continuation);
        this.this$0 = europeComplianceLangViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EuropeComplianceLangViewModel$fetchEuropeLang$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EuropeComplianceLangViewModel$fetchEuropeLang$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EuropeComplianceLangViewModel$fetchEuropeLang$1 europeComplianceLangViewModel$fetchEuropeLang$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                europeComplianceLangViewModel$fetchEuropeLang$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final InterfaceC41634e interfaceC41634eM90915g = C41636g.m90915g(IComplianceService.f22675a.get().mo97159b());
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(new InterfaceC41634e<List<? extends EuropeComplianceLangEntity>>() { // from class: com.kubi.futures.compliance.EuropeComplianceLangViewModel$fetchEuropeLang$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: com.kubi.futures.compliance.EuropeComplianceLangViewModel$fetchEuropeLang$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 EuropeComplianceLangDialog.kt\ncom/kubi/futures/compliance/EuropeComplianceLangViewModel$fetchEuropeLang$1\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,49:1\n50#2:50\n139#3:51\n140#3,5:55\n145#3:61\n126#4:52\n153#4,2:53\n155#4:60\n*S KotlinDebug\n*F\n+ 1 EuropeComplianceLangDialog.kt\ncom/kubi/futures/compliance/EuropeComplianceLangViewModel$fetchEuropeLang$1\n*L\n139#1:52\n139#1:53,2\n139#1:60\n*E\n"})
                public static final class AnonymousClass2<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f22575b;

                    /* JADX INFO: renamed from: com.kubi.futures.compliance.EuropeComplianceLangViewModel$fetchEuropeLang$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.futures.compliance.EuropeComplianceLangViewModel$fetchEuropeLang$1$invokeSuspend$$inlined$map$1$2", m90122f = "EuropeComplianceLangDialog.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        this.f22575b = interfaceC41635f;
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
                            InterfaceC41635f interfaceC41635f = this.f22575b;
                            HashMap map = (HashMap) obj;
                            ArrayList arrayList = new ArrayList(map.size());
                            for (Map.Entry entry : map.entrySet()) {
                                arrayList.add(new EuropeComplianceLangEntity((String) entry.getKey(), (String) entry.getValue(), false));
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
                public Object collect(InterfaceC41635f<? super List<? extends EuropeComplianceLangEntity>> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41634eM90915g.collect(new AnonymousClass2(interfaceC41635f), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, C42911a.m94120b());
            C128552 c128552 = new C128552(this.this$0, null);
            this.label = 1;
            europeComplianceLangViewModel$fetchEuropeLang$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM90890N, false, c128552, europeComplianceLangViewModel$fetchEuropeLang$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        EuropeComplianceLangViewModel europeComplianceLangViewModel = europeComplianceLangViewModel$fetchEuropeLang$1.this$0;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            europeComplianceLangViewModel.m24541q().postValue(new Pair<>(CollectionsKt.emptyList(), throwable));
        }
        return Unit.INSTANCE;
    }
}
