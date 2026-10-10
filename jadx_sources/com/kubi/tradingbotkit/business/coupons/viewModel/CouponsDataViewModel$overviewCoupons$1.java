package com.kubi.tradingbotkit.business.coupons.viewModel;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.tradingbotkit.bean.params.coupons.CouponsOverviewBean;
import com.kubi.tradingbotkit.business.coupons.CouponsSelectUIState;
import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.entity.coupons.AllCouponsEntity;
import com.kubi.tradingbotkit.entity.coupons.AllCouponsItemEntity;
import com.kubi.tradingbotkit.model.AllCouponsItemModel;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import o00.C42911a;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: CouponsDataViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.coupons.viewModel.CouponsDataViewModel$overviewCoupons$1", m90122f = "CouponsDataViewModel.kt", m90123i = {}, m90124l = {125}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCouponsDataViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsDataViewModel.kt\ncom/kubi/tradingbotkit/business/coupons/viewModel/CouponsDataViewModel$overviewCoupons$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n49#2:246\n51#2:250\n46#3:247\n51#3:249\n105#4:248\n25#5:251\n26#5:253\n1#6:252\n*S KotlinDebug\n*F\n+ 1 CouponsDataViewModel.kt\ncom/kubi/tradingbotkit/business/coupons/viewModel/CouponsDataViewModel$overviewCoupons$1\n*L\n110#1:246\n110#1:250\n110#1:247\n110#1:249\n110#1:248\n128#1:251\n128#1:253\n128#1:252\n*E\n"})
public final class CouponsDataViewModel$overviewCoupons$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $checkCouponsId;
    final /* synthetic */ CouponsOverviewBean $params;
    int label;
    final /* synthetic */ CouponsDataViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.coupons.viewModel.CouponsDataViewModel$overviewCoupons$1$2 */
    /* JADX INFO: compiled from: CouponsDataViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/tradingbotkit/business/coupons/CouponsSelectUIState;", "", "Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.coupons.viewModel.CouponsDataViewModel$overviewCoupons$1$2", m90122f = "CouponsDataViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C261242 extends SuspendLambda implements Function2<CouponsSelectUIState<List<? extends AllCouponsItemModel>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CouponsDataViewModel this$0;

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CouponsSelectUIState<List<AllCouponsItemModel>> couponsSelectUIState, Continuation<? super Unit> continuation) {
            return ((C261242) create(couponsSelectUIState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C261242(CouponsDataViewModel couponsDataViewModel, Continuation<? super C261242> continuation) {
            super(2, continuation);
            this.this$0 = couponsDataViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C261242 c261242 = new C261242(this.this$0, continuation);
            c261242.L$0 = obj;
            return c261242;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CouponsSelectUIState<List<? extends AllCouponsItemModel>> couponsSelectUIState, Continuation<? super Unit> continuation) {
            return invoke2((CouponsSelectUIState<List<AllCouponsItemModel>>) couponsSelectUIState, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CouponsSelectUIState couponsSelectUIState = (CouponsSelectUIState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            t0.d(this.this$0.m63936A(), couponsSelectUIState);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponsDataViewModel$overviewCoupons$1(CouponsDataViewModel couponsDataViewModel, CouponsOverviewBean couponsOverviewBean, String str, Continuation<? super CouponsDataViewModel$overviewCoupons$1> continuation) {
        super(2, continuation);
        this.this$0 = couponsDataViewModel;
        this.$params = couponsOverviewBean;
        this.$checkCouponsId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CouponsDataViewModel$overviewCoupons$1(this.this$0, this.$params, this.$checkCouponsId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CouponsDataViewModel$overviewCoupons$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            final InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(this.this$0.f52324V.m97770d(this.$params), C42911a.m94119a());
            final CouponsDataViewModel couponsDataViewModel = this.this$0;
            final String str = this.$checkCouponsId;
            InterfaceC41634e<CouponsSelectUIState<List<? extends AllCouponsItemModel>>> interfaceC41634e = new InterfaceC41634e<CouponsSelectUIState<List<? extends AllCouponsItemModel>>>() { // from class: com.kubi.tradingbotkit.business.coupons.viewModel.CouponsDataViewModel$overviewCoupons$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.coupons.viewModel.CouponsDataViewModel$overviewCoupons$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CouponsDataViewModel.kt\ncom/kubi/tradingbotkit/business/coupons/viewModel/CouponsDataViewModel$overviewCoupons$1\n*L\n1#1,49:1\n50#2:50\n111#3,14:51\n*E\n"})
                public static final class AnonymousClass2<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f52335b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ CouponsDataViewModel f52336c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ String f52337d;

                    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.coupons.viewModel.CouponsDataViewModel$overviewCoupons$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.coupons.viewModel.CouponsDataViewModel$overviewCoupons$1$invokeSuspend$$inlined$map$1$2", m90122f = "CouponsDataViewModel.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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

                    public AnonymousClass2(InterfaceC41635f interfaceC41635f, CouponsDataViewModel couponsDataViewModel, String str) {
                        this.f52335b = interfaceC41635f;
                        this.f52336c = couponsDataViewModel;
                        this.f52337d = str;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        List<AllCouponsItemEntity> unusable;
                        List<AllCouponsItemEntity> usable;
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
                            InterfaceC41635f interfaceC41635f = this.f52335b;
                            AllCouponsEntity allCouponsEntity = (AllCouponsEntity) obj;
                            Integer numBoxInt = null;
                            t0.d(this.f52336c.m63938C(), C41014a.m89922G(allCouponsEntity != null ? allCouponsEntity.getMaxRewardPercent() : null, null, 1, null));
                            t0.d(this.f52336c.m63940E(), Boxing.boxBoolean(C27025c.m66567e(allCouponsEntity != null ? allCouponsEntity.getInBlackList() : null, false)));
                            CouponsSelectUIState couponsSelectUIState = new CouponsSelectUIState();
                            ArrayList arrayList = new ArrayList();
                            couponsSelectUIState.m63917e(Boxing.boxInt(C27039d.m66650j((allCouponsEntity == null || (usable = allCouponsEntity.getUsable()) == null) ? null : Boxing.boxInt(usable.size()))));
                            this.f52336c.m63944z(allCouponsEntity, arrayList, this.f52337d);
                            if (allCouponsEntity != null && (unusable = allCouponsEntity.getUnusable()) != null) {
                                numBoxInt = Boxing.boxInt(unusable.size());
                            }
                            couponsSelectUIState.m63919g(Boxing.boxInt(C27039d.m66650j(numBoxInt)));
                            this.f52336c.m63943y(allCouponsEntity, arrayList);
                            couponsSelectUIState.m63920h(arrayList);
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(couponsSelectUIState, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(InterfaceC41635f<? super CouponsSelectUIState<List<? extends AllCouponsItemModel>>> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41634eM90890N.collect(new AnonymousClass2(interfaceC41635f, couponsDataViewModel, str), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            C261242 c261242 = new C261242(this.this$0, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634e, false, c261242, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        CouponsDataViewModel couponsDataViewModel2 = this.this$0;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            CouponsSelectUIState couponsSelectUIState = new CouponsSelectUIState();
            couponsSelectUIState.m63917e(Boxing.boxInt(0));
            couponsSelectUIState.m63919g(Boxing.boxInt(0));
            couponsSelectUIState.m63918f(throwable.getMessage());
            t0.d(couponsDataViewModel2.m63936A(), couponsSelectUIState);
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }
}
