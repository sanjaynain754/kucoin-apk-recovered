package com.kubi.futures.trade.position.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import cm.UnifyChangeMarginResult;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.trade.position.PositionRenderInfo;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import fm.C37567b;
import fm.C37569d;
import fm.C37570e;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import o00.C42911a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37213a;
import p402kf.C41014a;
import p429lf.C42180b;
import p599rk.C44110b;
import p599rk.C44111c;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import th.InterfaceC44980d;
import ug.InterfaceC45233b;
import ug.InterfaceC45234c;
import uk.C45257b;
import uk.C45258c;

/* JADX INFO: compiled from: ReduceMarginViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J \u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00112\b\b\u0001\u0010!\u001a\u00020\u001bJ(\u0010\"\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010#\u001a\u00020\t2\b\b\u0001\u0010!\u001a\u00020\u001bJ\u0006\u0010$\u001a\u00020\u0016J\u0016\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010'R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR%\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00100\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;", "Lcom/kubi/futures/trade/position/vm/ModifyMarginViewModel;", "<init>", "()V", "unifyCalFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/kubi/futures/trade/position/vm/FetchUnifyCalculateParams;", "reduceMargin", "Landroidx/lifecycle/MutableLiveData;", "Ljava/math/BigDecimal;", "getReduceMargin", "()Landroidx/lifecycle/MutableLiveData;", "afterPositionRender", "Lcom/kubi/futures/trade/position/PositionRenderInfo;", "getAfterPositionRender", "submitResult", "Lkotlin/Pair;", "", "", "getSubmitResult", "inputValue", "handleReduceMargin", "", "input", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getEntryPrice", "", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "fetchMaxReduceMargin", "symbol", "isTrial", "positionSide", "submitReduceMargin", ViewProps.MARGIN, "fetchSymbolConfig", "fetchUnifyCalculateResult", "value", "(Lcom/kubi/futures/trade/position/vm/FetchUnifyCalculateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReduceMarginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReduceMarginViewModel.kt\ncom/kubi/futures/trade/position/vm/ReduceMarginViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,296:1\n1#2:297\n*E\n"})
public final class ReduceMarginViewModel extends ModifyMarginViewModel {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC41669n<FetchUnifyCalculateParams> f24312Z = C41679x.m91009a(new FetchUnifyCalculateParams(null, null, null, null, null, 31, null));

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<BigDecimal> f24313a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<PositionRenderInfo> f24314b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Pair<Boolean, Throwable>> f24315c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public BigDecimal f24316d0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.ReduceMarginViewModel$1 */
    /* JADX INFO: compiled from: ReduceMarginViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.ReduceMarginViewModel$1", m90122f = "ReduceMarginViewModel.kt", m90123i = {}, m90124l = {75}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nReduceMarginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReduceMarginViewModel.kt\ncom/kubi/futures/trade/position/vm/ReduceMarginViewModel$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,296:1\n17#2:297\n19#2:301\n46#3:298\n51#3:300\n105#4:299\n*S KotlinDebug\n*F\n+ 1 ReduceMarginViewModel.kt\ncom/kubi/futures/trade/position/vm/ReduceMarginViewModel$1\n*L\n65#1:297\n65#1:301\n65#1:298\n65#1:300\n65#1:299\n*E\n"})
    public static final class C140401 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.ReduceMarginViewModel$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: ReduceMarginViewModel.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/futures/trade/position/vm/FetchUnifyCalculateParams;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.ReduceMarginViewModel$1$2", m90122f = "ReduceMarginViewModel.kt", m90123i = {}, m90124l = {70}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<FetchUnifyCalculateParams, Continuation<? super Unit>, Object> {
            int label;

            public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(FetchUnifyCalculateParams fetchUnifyCalculateParams, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(fetchUnifyCalculateParams, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
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
                    this.label = 1;
                    if (DelayKt.m90350b(300L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.ReduceMarginViewModel$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: ReduceMarginViewModel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class AnonymousClass4<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReduceMarginViewModel f24317b;

            public AnonymousClass4(ReduceMarginViewModel reduceMarginViewModel) {
                this.f24317b = reduceMarginViewModel;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FetchUnifyCalculateParams fetchUnifyCalculateParams, Continuation<? super Unit> continuation) {
                ReduceMarginViewModel$1$4$emit$1 reduceMarginViewModel$1$4$emit$1;
                MutableLiveData mutableLiveData;
                if (continuation instanceof ReduceMarginViewModel$1$4$emit$1) {
                    reduceMarginViewModel$1$4$emit$1 = (ReduceMarginViewModel$1$4$emit$1) continuation;
                    int i11 = reduceMarginViewModel$1$4$emit$1.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        reduceMarginViewModel$1$4$emit$1.label = i11 - Integer.MIN_VALUE;
                    } else {
                        reduceMarginViewModel$1$4$emit$1 = new ReduceMarginViewModel$1$4$emit$1(this, continuation);
                    }
                } else {
                    reduceMarginViewModel$1$4$emit$1 = new ReduceMarginViewModel$1$4$emit$1(this, continuation);
                }
                Object obj = reduceMarginViewModel$1$4$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = reduceMarginViewModel$1$4$emit$1.label;
                if (i12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableLiveData<PositionRenderInfo> mutableLiveDataM27945a0 = this.f24317b.m27945a0();
                    ReduceMarginViewModel reduceMarginViewModel = this.f24317b;
                    reduceMarginViewModel$1$4$emit$1.L$0 = SpillingKt.nullOutSpilledVariable(fetchUnifyCalculateParams);
                    reduceMarginViewModel$1$4$emit$1.L$1 = mutableLiveDataM27945a0;
                    reduceMarginViewModel$1$4$emit$1.label = 1;
                    Object objM27941Y = reduceMarginViewModel.m27941Y(fetchUnifyCalculateParams, reduceMarginViewModel$1$4$emit$1);
                    if (objM27941Y == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objM27941Y;
                    mutableLiveData = mutableLiveDataM27945a0;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    MutableLiveData mutableLiveData2 = (MutableLiveData) reduceMarginViewModel$1$4$emit$1.L$1;
                    ResultKt.throwOnFailure(obj);
                    mutableLiveData = mutableLiveData2;
                }
                mutableLiveData.postValue(obj);
                return Unit.INSTANCE;
            }
        }

        public C140401(Continuation<? super C140401> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReduceMarginViewModel.this.new C140401(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C140401) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final boolean m27952f(FetchUnifyCalculateParams fetchUnifyCalculateParams, FetchUnifyCalculateParams fetchUnifyCalculateParams2) {
            return Intrinsics.areEqual(fetchUnifyCalculateParams, fetchUnifyCalculateParams2);
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
                final InterfaceC41678w interfaceC41678wM90907c = C41636g.m90907c(ReduceMarginViewModel.this.f24312Z);
                InterfaceC41634e interfaceC41634eM90940w = C41636g.m90940w(C41636g.m90896T(C41636g.m90935r(new InterfaceC41634e<FetchUnifyCalculateParams>() { // from class: com.kubi.futures.trade.position.vm.ReduceMarginViewModel$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.ReduceMarginViewModel$1$invokeSuspend$$inlined$filter$1$2 */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ReduceMarginViewModel.kt\ncom/kubi/futures/trade/position/vm/ReduceMarginViewModel$1\n*L\n1#1,49:1\n18#2:50\n19#2:52\n66#3:51\n*E\n"})
                    public static final class C140412<T> implements InterfaceC41635f {

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ InterfaceC41635f f24319b;

                        /* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.ReduceMarginViewModel$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.ReduceMarginViewModel$1$invokeSuspend$$inlined$filter$1$2", m90122f = "ReduceMarginViewModel.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                                return C140412.this.emit(null, this);
                            }
                        }

                        public C140412(InterfaceC41635f interfaceC41635f) {
                            this.f24319b = interfaceC41635f;
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
                                InterfaceC41635f interfaceC41635f = this.f24319b;
                                String symbol = ((FetchUnifyCalculateParams) obj).getSymbol();
                                if (!(symbol == null || symbol.length() == 0)) {
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
                    public Object collect(InterfaceC41635f<? super FetchUnifyCalculateParams> interfaceC41635f, Continuation continuation) {
                        Object objCollect = interfaceC41678wM90907c.collect(new C140412(interfaceC41635f), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }), new AnonymousClass2(null)), new Function2() { // from class: com.kubi.futures.trade.position.vm.k2
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Boolean.valueOf(ReduceMarginViewModel.C140401.m27952f((FetchUnifyCalculateParams) obj2, (FetchUnifyCalculateParams) obj3));
                    }
                });
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(ReduceMarginViewModel.this);
                this.label = 1;
                if (interfaceC41634eM90940w.collect(anonymousClass4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: W */
    public static final void m27939W() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.futures.trade.position.vm.j2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReduceMarginViewModel.m27940X();
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m27940X() {
        InterfaceC44980d.m99527B(RepositoryServiceLocator.f19236a.m20288g(), null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: Y */
    public final Object m27941Y(FetchUnifyCalculateParams fetchUnifyCalculateParams, Continuation<? super PositionRenderInfo> continuation) {
        ReduceMarginViewModel$fetchUnifyCalculateResult$1 reduceMarginViewModel$fetchUnifyCalculateResult$1;
        String strM92640e;
        final FetchUnifyCalculateParams fetchUnifyCalculateParams2 = fetchUnifyCalculateParams;
        if (continuation instanceof ReduceMarginViewModel$fetchUnifyCalculateResult$1) {
            reduceMarginViewModel$fetchUnifyCalculateResult$1 = (ReduceMarginViewModel$fetchUnifyCalculateResult$1) continuation;
            int i11 = reduceMarginViewModel$fetchUnifyCalculateResult$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                reduceMarginViewModel$fetchUnifyCalculateResult$1.label = i11 - Integer.MIN_VALUE;
            } else {
                reduceMarginViewModel$fetchUnifyCalculateResult$1 = new ReduceMarginViewModel$fetchUnifyCalculateResult$1(this, continuation);
            }
        } else {
            reduceMarginViewModel$fetchUnifyCalculateResult$1 = new ReduceMarginViewModel$fetchUnifyCalculateResult$1(this, continuation);
        }
        ReduceMarginViewModel$fetchUnifyCalculateResult$1 reduceMarginViewModel$fetchUnifyCalculateResult$2 = reduceMarginViewModel$fetchUnifyCalculateResult$1;
        Object objM36474d = reduceMarginViewModel$fetchUnifyCalculateResult$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = reduceMarginViewModel$fetchUnifyCalculateResult$2.label;
        String strM36540n = null;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM36474d);
            if (C41014a.m89922G(fetchUnifyCalculateParams2.getMargin(), null, 1, null).compareTo(BigDecimal.ZERO) <= 0) {
                return new PositionRenderInfo(null, null, null, null, 15, null);
            }
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            Function0 function0 = new Function0() { // from class: com.kubi.futures.trade.position.vm.i2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReduceMarginViewModel.m27942Z(fetchUnifyCalculateParams2);
                }
            };
            reduceMarginViewModel$fetchUnifyCalculateResult$2.L$0 = fetchUnifyCalculateParams2;
            reduceMarginViewModel$fetchUnifyCalculateResult$2.label = 1;
            objM36474d = CoroutineExKt.m36474d(abstractC41697j0M94120b, null, function0, reduceMarginViewModel$fetchUnifyCalculateResult$2, 2, null);
            if (objM36474d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fetchUnifyCalculateParams2 = (FetchUnifyCalculateParams) reduceMarginViewModel$fetchUnifyCalculateResult$2.L$0;
            ResultKt.throwOnFailure(objM36474d);
        }
        UnifyChangeMarginResult unifyChangeMarginResult = (UnifyChangeMarginResult) objM36474d;
        if (unifyChangeMarginResult == null) {
            unifyChangeMarginResult = new UnifyChangeMarginResult(null, 1, null);
        }
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(fetchUnifyCalculateParams2.getSymbol()), false, 2, null);
        BigDecimal lastMargin = fetchUnifyCalculateParams2.getLastMargin();
        BigDecimal bigDecimalSubtract = lastMargin != null ? lastMargin.subtract(C41014a.m89922G(fetchUnifyCalculateParams2.getMargin(), null, 1, null)) : null;
        if (bigDecimalSubtract != null) {
            strM92640e = C42180b.m92640e(bigDecimalSubtract, RoundingMode.DOWN, C27039d.m66651k(contractEntityM99529O != null ? Boxing.boxInt(C37567b.m84613c(contractEntityM99529O)) : null, 4), true, true, true, 0, null, 96, null);
        } else {
            strM92640e = null;
        }
        String strM92647l = C42180b.m92647l(strM92640e);
        BigDecimal liquidationPrice = unifyChangeMarginResult.getLiquidationPrice();
        if (liquidationPrice != null) {
            BigDecimal bigDecimal = liquidationPrice.compareTo(BigDecimal.ZERO) > 0 ? liquidationPrice : null;
            if (bigDecimal != null) {
                strM36540n = C17054k0.m36540n(bigDecimal, contractEntityM99529O, C27041f.m66669i(fetchUnifyCalculateParams2.getSide(), "buy"), false, false, 12, null);
            }
        }
        return new PositionRenderInfo(strM92647l, null, C42180b.m92647l(strM36540n), null, 10, null);
    }

    /* JADX INFO: renamed from: Z */
    public static final UnifyChangeMarginResult m27942Z(FetchUnifyCalculateParams fetchUnifyCalculateParams) {
        InterfaceC45233b interfaceC45233bM20259p = MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null);
        String strM66668h = C27041f.m66668h(fetchUnifyCalculateParams.getSymbol());
        BigDecimal margin = fetchUnifyCalculateParams.getMargin();
        return InterfaceC45234c.m99947R(interfaceC45233bM20259p, strM66668h, C27041f.m66669i(margin != null ? margin.toPlainString() : null, "0"), C27041f.m66669i(fetchUnifyCalculateParams.getPositionSide(), "BOTH"), null, 8, null);
    }

    /* JADX INFO: renamed from: U */
    public final void m27943U(@NotNull String symbol, boolean z11, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83254d()), null, new ReduceMarginViewModel$fetchMaxReduceMargin$1(z11, symbol, positionSide, this, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final MutableLiveData<PositionRenderInfo> m27945a0() {
        return this.f24314b0;
    }

    /* JADX INFO: renamed from: b0 */
    public final String m27946b0(BigDecimal bigDecimal, PositionEntity positionEntity, ContractEntity contractEntity) {
        BigDecimal bigDecimalM84687b = C37570e.m84687b(RepositoryServiceLocator.f19236a.m20288g().mo24996X(C27041f.m66668h(positionEntity.getSymbol())));
        C45258c c45258c = C45258c.f101799a;
        C44110b c44110bM97192c = C44111c.m97192c(bigDecimal);
        C44110b c44110bM97192c2 = C44111c.m97192c(bigDecimalM84687b);
        BigDecimal posMargin = positionEntity.getPosMargin();
        C44110b c44110bM97191b = C44111c.m97191b(posMargin != null ? C44111c.m97192c(posMargin) : null, null, 1, null);
        BigDecimal posCost = positionEntity.getPosCost();
        C44110b c44110bM97191b2 = C44111c.m97191b(posCost != null ? C44111c.m97192c(posCost) : null, null, 1, null);
        BigDecimal markPrice = positionEntity.getMarkPrice();
        C44110b c44110bM97191b3 = C44111c.m97191b(markPrice != null ? C44111c.m97192c(markPrice) : null, null, 1, null);
        BigDecimal avgEntryPrice = positionEntity.getAvgEntryPrice();
        return C42180b.m92640e(C44111c.m97191b(c45258c.m100040a(c44110bM97192c2, c44110bM97191b, c44110bM97191b2, c44110bM97191b3, C44111c.m97191b(avgEntryPrice != null ? C44111c.m97192c(avgEntryPrice) : null, null, 1, null), c44110bM97192c), null, 1, null).getDecimal(), RoundingMode.DOWN, C27039d.m66651k(Integer.valueOf(C37567b.m84618h(contractEntity)), 2), true, true, true, 0, null, 96, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final MutableLiveData<BigDecimal> m27947c0() {
        return this.f24313a0;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final MutableLiveData<Pair<Boolean, Throwable>> m27948d0() {
        return this.f24315c0;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m27949e0(@Nullable BigDecimal bigDecimal, @Nullable PositionEntity positionEntity) throws Throwable {
        BigDecimal decimal;
        if (BrokerConfig.f19211a.m20201d().mo4515x() == MultiBizType.UNIFIED) {
            this.f24312Z.mo90855d(new FetchUnifyCalculateParams(C27041f.m66668h(positionEntity != null ? positionEntity.getSymbol() : null), positionEntity != null ? positionEntity.getPosMargin() : null, bigDecimal, C27041f.m66669i(positionEntity != null ? positionEntity.getPositionSide() : null, "BOTH"), null, 16, null));
            return;
        }
        if (this.f24316d0 == null && bigDecimal == null) {
            return;
        }
        BigDecimal bigDecimalMultiply = bigDecimal != null ? bigDecimal.multiply(new BigDecimal(-1)) : null;
        this.f24316d0 = bigDecimalMultiply;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(positionEntity != null ? positionEntity.getSymbol() : null), false, 2, null);
        String strM66516f = C27017c.f54310a.m66516f(R$string.stub, new Object[0]);
        if (bigDecimalMultiply == null || bigDecimalMultiply.compareTo(BigDecimal.ZERO) == 0 || positionEntity == null || contractEntityM99529O == null) {
            this.f24314b0.setValue(new PositionRenderInfo(strM66516f, strM66516f, strM66516f, strM66516f));
            return;
        }
        C45257b c45257b = C45257b.f101798a;
        boolean zM66566d = C27025c.m66566d(Boolean.valueOf(contractEntityM99529O.isInverse()));
        BigDecimal multiplier = contractEntityM99529O.getMultiplier();
        C44110b c44110bM97191b = C44111c.m97191b(multiplier != null ? C44111c.m97192c(multiplier) : null, null, 1, null);
        BigDecimal markPrice = positionEntity.getMarkPrice();
        C44110b c44110bM97191b2 = C44111c.m97191b(markPrice != null ? C44111c.m97192c(markPrice) : null, null, 1, null);
        BigDecimal currentQty = positionEntity.getCurrentQty();
        BigDecimal decimal2 = C44111c.m97191b(c45257b.m100039g(zM66566d, c44110bM97191b, c44110bM97191b2, C44111c.m97191b(currentQty != null ? C44111c.m97192c(currentQty) : null, null, 1, null)), null, 1, null).getDecimal();
        C45258c c45258c = C45258c.f101799a;
        C44110b c44110bM97192c = C44111c.m97192c(decimal2);
        BigDecimal posMargin = positionEntity.getPosMargin();
        C44110b c44110bM97191b3 = C44111c.m97191b(posMargin != null ? C44111c.m97192c(posMargin) : null, null, 1, null);
        BigDecimal posCost = positionEntity.getPosCost();
        BigDecimal decimal3 = C44111c.m97191b(c45258c.m100044e(c44110bM97192c, c44110bM97191b3, C44111c.m97191b(posCost != null ? C44111c.m97192c(posCost) : null, null, 1, null), C44111c.m97192c(bigDecimalMultiply)), null, 1, null).getDecimal();
        C44110b c44110bM97192c2 = C44111c.m97192c(decimal2);
        BigDecimal posMargin2 = positionEntity.getPosMargin();
        C44110b c44110bM97191b4 = C44111c.m97191b(posMargin2 != null ? C44111c.m97192c(posMargin2) : null, null, 1, null);
        BigDecimal posCost2 = positionEntity.getPosCost();
        C44110b c44110bM100041b = c45258c.m100041b(c44110bM97192c2, c44110bM97191b4, C44111c.m97191b(posCost2 != null ? C44111c.m97192c(posCost2) : null, null, 1, null), C44111c.m97192c(bigDecimalMultiply));
        String strM66669i = C27041f.m66669i((c44110bM100041b == null || (decimal = c44110bM100041b.getDecimal()) == null) ? null : C17054k0.m36530d(decimal, false, 1, null), strM66516f);
        boolean zM66566d2 = C27025c.m66566d(Boolean.valueOf(contractEntityM99529O.isInverse()));
        BigDecimal multiplier2 = contractEntityM99529O.getMultiplier();
        C44110b c44110bM97191b5 = C44111c.m97191b(multiplier2 != null ? C44111c.m97192c(multiplier2) : null, null, 1, null);
        BigDecimal currentQty2 = positionEntity.getCurrentQty();
        C44110b c44110bM97191b6 = C44111c.m97191b(currentQty2 != null ? C44111c.m97192c(currentQty2) : null, null, 1, null);
        BigDecimal posCost3 = positionEntity.getPosCost();
        C44110b c44110bM97191b7 = C44111c.m97191b(posCost3 != null ? C44111c.m97192c(posCost3) : null, null, 1, null);
        BigDecimal posMargin3 = positionEntity.getPosMargin();
        C44110b c44110bM97191b8 = C44111c.m97191b(posMargin3 != null ? C44111c.m97192c(posMargin3) : null, null, 1, null);
        C44110b c44110bM97192c3 = C44111c.m97192c(m28027H(positionEntity));
        BigDecimal takerFeeRate = contractEntityM99529O.getTakerFeeRate();
        C44110b c44110bM100042c = c45258c.m100042c(zM66566d2, c44110bM97191b5, c44110bM97191b6, c44110bM97191b7, c44110bM97191b8, c44110bM97192c3, C44111c.m97191b(takerFeeRate != null ? C44111c.m97192c(takerFeeRate) : null, null, 1, null), C44111c.m97192c(m28026G(positionEntity.isTrialFunds())), C44111c.m97192c(bigDecimalMultiply));
        BigDecimal decimal4 = c44110bM100042c != null ? c44110bM100042c.getDecimal() : null;
        this.f24314b0.setValue(new PositionRenderInfo(C27041f.m66669i(C42180b.m92640e(decimal3, RoundingMode.DOWN, C37567b.m84613c(contractEntityM99529O), true, true, true, 0, null, 96, null), strM66516f), strM66669i, C42180b.m92647l(decimal4 != null ? C17054k0.m36540n(decimal4, contractEntityM99529O, C37569d.m84683x(positionEntity), false, false, 12, null) : null), m27946b0(bigDecimalMultiply, positionEntity, contractEntityM99529O)));
    }

    /* JADX INFO: renamed from: f0 */
    public final void m27950f0(@NotNull String symbol, boolean z11, @NotNull BigDecimal margin, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83254d()), null, new ReduceMarginViewModel$submitReduceMargin$1(z11, symbol, margin, positionSide, this, null), 2, null);
    }

    public ReduceMarginViewModel() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94119a(), null, new C140401(null), 2, null);
        this.f24313a0 = new MutableLiveData<>();
        this.f24314b0 = new MutableLiveData<>();
        this.f24315c0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: V */
    public final void m27944V() {
        getF46845W().add(C42916f.m94127f().scheduleDirect(new Runnable() { // from class: com.kubi.futures.trade.position.vm.h2
            @Override // java.lang.Runnable
            public final void run() {
                ReduceMarginViewModel.m27939W();
            }
        }));
    }
}
