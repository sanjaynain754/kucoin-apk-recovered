package com.kubi.futures.trade.position.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import cm.UnifyChangeMarginResult;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.trade.position.PositionRenderInfo;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.kumex.utils.Log;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import fm.C37567b;
import fm.C37569d;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
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
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import th.InterfaceC44980d;
import ug.InterfaceC45233b;
import ug.InterfaceC45234c;
import uk.C45257b;
import uk.C45258c;

/* JADX INFO: compiled from: AddMarginViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0001\u0010 \u001a\u00020\bJ\u0016\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u001cJ\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\bJ\u0016\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010(R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR%\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;", "Lcom/kubi/futures/trade/position/vm/ModifyMarginViewModel;", "<init>", "()V", "unifyCalFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/kubi/futures/trade/position/vm/FetchUnifyCalculateParams;", "tag", "", "afterPositionRender", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/futures/trade/position/PositionRenderInfo;", "getAfterPositionRender", "()Landroidx/lifecycle/MutableLiveData;", "submitResult", "Lkotlin/Pair;", "", "", "getSubmitResult", "submitAutoMargin", "getSubmitAutoMargin", "isolatedAvailableBalance", "Ljava/math/BigDecimal;", "getIsolatedAvailableBalance", "inputValue", "handleAddMargin", "", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "submitMargin", "symbol", "isTrial", "positionSide", "submitAutoDepositMargin", "isOpen", "display", "observeIsolatedAvailableBalance", FirebaseAnalytics.Param.CURRENCY, "fetchUnifyCalculateResult", "value", "(Lcom/kubi/futures/trade/position/vm/FetchUnifyCalculateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAddMarginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddMarginViewModel.kt\ncom/kubi/futures/trade/position/vm/AddMarginViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,356:1\n1#2:357\n*E\n"})
public final class AddMarginViewModel extends ModifyMarginViewModel {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC41669n<FetchUnifyCalculateParams> f24264Z = C41679x.m91009a(new FetchUnifyCalculateParams(null, null, null, null, null, 31, null));

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final String f24265a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<PositionRenderInfo> f24266b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Pair<Boolean, Throwable>> f24267c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Pair<Boolean, Throwable>> f24268d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<BigDecimal> f24269e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public BigDecimal f24270f0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.AddMarginViewModel$1 */
    /* JADX INFO: compiled from: AddMarginViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.AddMarginViewModel$1", m90122f = "AddMarginViewModel.kt", m90123i = {}, m90124l = {81}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAddMarginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddMarginViewModel.kt\ncom/kubi/futures/trade/position/vm/AddMarginViewModel$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,356:1\n17#2:357\n19#2:361\n46#3:358\n51#3:360\n105#4:359\n*S KotlinDebug\n*F\n+ 1 AddMarginViewModel.kt\ncom/kubi/futures/trade/position/vm/AddMarginViewModel$1\n*L\n71#1:357\n71#1:361\n71#1:358\n71#1:360\n71#1:359\n*E\n"})
    public static final class C140341 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.AddMarginViewModel$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: AddMarginViewModel.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/futures/trade/position/vm/FetchUnifyCalculateParams;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.AddMarginViewModel$1$2", m90122f = "AddMarginViewModel.kt", m90123i = {}, m90124l = {76}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
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

        /* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.AddMarginViewModel$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: AddMarginViewModel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class AnonymousClass4<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AddMarginViewModel f24271b;

            public AnonymousClass4(AddMarginViewModel addMarginViewModel) {
                this.f24271b = addMarginViewModel;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FetchUnifyCalculateParams fetchUnifyCalculateParams, Continuation<? super Unit> continuation) {
                AddMarginViewModel$1$4$emit$1 addMarginViewModel$1$4$emit$1;
                MutableLiveData mutableLiveData;
                if (continuation instanceof AddMarginViewModel$1$4$emit$1) {
                    addMarginViewModel$1$4$emit$1 = (AddMarginViewModel$1$4$emit$1) continuation;
                    int i11 = addMarginViewModel$1$4$emit$1.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        addMarginViewModel$1$4$emit$1.label = i11 - Integer.MIN_VALUE;
                    } else {
                        addMarginViewModel$1$4$emit$1 = new AddMarginViewModel$1$4$emit$1(this, continuation);
                    }
                } else {
                    addMarginViewModel$1$4$emit$1 = new AddMarginViewModel$1$4$emit$1(this, continuation);
                }
                Object obj = addMarginViewModel$1$4$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = addMarginViewModel$1$4$emit$1.label;
                if (i12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableLiveData<PositionRenderInfo> mutableLiveDataM27789Z = this.f24271b.m27789Z();
                    AddMarginViewModel addMarginViewModel = this.f24271b;
                    addMarginViewModel$1$4$emit$1.L$0 = SpillingKt.nullOutSpilledVariable(fetchUnifyCalculateParams);
                    addMarginViewModel$1$4$emit$1.L$1 = mutableLiveDataM27789Z;
                    addMarginViewModel$1$4$emit$1.label = 1;
                    Object objM27788X = addMarginViewModel.m27788X(fetchUnifyCalculateParams, addMarginViewModel$1$4$emit$1);
                    if (objM27788X == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objM27788X;
                    mutableLiveData = mutableLiveDataM27789Z;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    MutableLiveData mutableLiveData2 = (MutableLiveData) addMarginViewModel$1$4$emit$1.L$1;
                    ResultKt.throwOnFailure(obj);
                    mutableLiveData = mutableLiveData2;
                }
                mutableLiveData.postValue(obj);
                return Unit.INSTANCE;
            }
        }

        public C140341(Continuation<? super C140341> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AddMarginViewModel.this.new C140341(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C140341) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: f */
        public static final boolean m27798f(FetchUnifyCalculateParams fetchUnifyCalculateParams, FetchUnifyCalculateParams fetchUnifyCalculateParams2) {
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
                final InterfaceC41678w interfaceC41678wM90907c = C41636g.m90907c(AddMarginViewModel.this.f24264Z);
                InterfaceC41634e interfaceC41634eM90940w = C41636g.m90940w(C41636g.m90896T(C41636g.m90935r(new InterfaceC41634e<FetchUnifyCalculateParams>() { // from class: com.kubi.futures.trade.position.vm.AddMarginViewModel$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.AddMarginViewModel$1$invokeSuspend$$inlined$filter$1$2 */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AddMarginViewModel.kt\ncom/kubi/futures/trade/position/vm/AddMarginViewModel$1\n*L\n1#1,49:1\n18#2:50\n19#2:52\n72#3:51\n*E\n"})
                    public static final class C140352<T> implements InterfaceC41635f {

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ InterfaceC41635f f24273b;

                        /* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.AddMarginViewModel$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.AddMarginViewModel$1$invokeSuspend$$inlined$filter$1$2", m90122f = "AddMarginViewModel.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                                return C140352.this.emit(null, this);
                            }
                        }

                        public C140352(InterfaceC41635f interfaceC41635f) {
                            this.f24273b = interfaceC41635f;
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
                                InterfaceC41635f interfaceC41635f = this.f24273b;
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
                        Object objCollect = interfaceC41678wM90907c.collect(new C140352(interfaceC41635f), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }), new AnonymousClass2(null)), new Function2() { // from class: com.kubi.futures.trade.position.vm.f
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Boolean.valueOf(AddMarginViewModel.C140341.m27798f((FetchUnifyCalculateParams) obj2, (FetchUnifyCalculateParams) obj3));
                    }
                });
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(AddMarginViewModel.this);
                this.label = 1;
                if (interfaceC41634eM90940w.collect(anonymousClass4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final UnifyChangeMarginResult m27783Y(FetchUnifyCalculateParams fetchUnifyCalculateParams) {
        InterfaceC45233b interfaceC45233bM20259p = MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null);
        String strM66668h = C27041f.m66668h(fetchUnifyCalculateParams.getSymbol());
        BigDecimal margin = fetchUnifyCalculateParams.getMargin();
        return InterfaceC45234c.m99948h1(interfaceC45233bM20259p, strM66668h, C27041f.m66669i(margin != null ? margin.toPlainString() : null, "0"), C27041f.m66669i(fetchUnifyCalculateParams.getPositionSide(), "BOTH"), null, 8, null);
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m27786h0(AddMarginViewModel addMarginViewModel, Throwable th2) {
        Log.f30813a.m36615a(addMarginViewModel.f24265a0, "observeIsolatedAvailableBalance ws error: " + th2.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: X */
    public final Object m27788X(FetchUnifyCalculateParams fetchUnifyCalculateParams, Continuation<? super PositionRenderInfo> continuation) {
        AddMarginViewModel$fetchUnifyCalculateResult$1 addMarginViewModel$fetchUnifyCalculateResult$1;
        String strM92640e;
        final FetchUnifyCalculateParams fetchUnifyCalculateParams2 = fetchUnifyCalculateParams;
        if (continuation instanceof AddMarginViewModel$fetchUnifyCalculateResult$1) {
            addMarginViewModel$fetchUnifyCalculateResult$1 = (AddMarginViewModel$fetchUnifyCalculateResult$1) continuation;
            int i11 = addMarginViewModel$fetchUnifyCalculateResult$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                addMarginViewModel$fetchUnifyCalculateResult$1.label = i11 - Integer.MIN_VALUE;
            } else {
                addMarginViewModel$fetchUnifyCalculateResult$1 = new AddMarginViewModel$fetchUnifyCalculateResult$1(this, continuation);
            }
        } else {
            addMarginViewModel$fetchUnifyCalculateResult$1 = new AddMarginViewModel$fetchUnifyCalculateResult$1(this, continuation);
        }
        AddMarginViewModel$fetchUnifyCalculateResult$1 addMarginViewModel$fetchUnifyCalculateResult$2 = addMarginViewModel$fetchUnifyCalculateResult$1;
        Object objM36474d = addMarginViewModel$fetchUnifyCalculateResult$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = addMarginViewModel$fetchUnifyCalculateResult$2.label;
        String strM36540n = null;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM36474d);
            if (C41014a.m89922G(fetchUnifyCalculateParams2.getMargin(), null, 1, null).compareTo(BigDecimal.ZERO) <= 0) {
                return new PositionRenderInfo(null, null, null, null, 15, null);
            }
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            Function0 function0 = new Function0() { // from class: com.kubi.futures.trade.position.vm.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AddMarginViewModel.m27783Y(fetchUnifyCalculateParams2);
                }
            };
            addMarginViewModel$fetchUnifyCalculateResult$2.L$0 = fetchUnifyCalculateParams2;
            addMarginViewModel$fetchUnifyCalculateResult$2.label = 1;
            objM36474d = CoroutineExKt.m36474d(abstractC41697j0M94120b, null, function0, addMarginViewModel$fetchUnifyCalculateResult$2, 2, null);
            if (objM36474d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fetchUnifyCalculateParams2 = (FetchUnifyCalculateParams) addMarginViewModel$fetchUnifyCalculateResult$2.L$0;
            ResultKt.throwOnFailure(objM36474d);
        }
        UnifyChangeMarginResult unifyChangeMarginResult = (UnifyChangeMarginResult) objM36474d;
        if (unifyChangeMarginResult == null) {
            unifyChangeMarginResult = new UnifyChangeMarginResult(null, 1, null);
        }
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(fetchUnifyCalculateParams2.getSymbol()), false, 2, null);
        BigDecimal lastMargin = fetchUnifyCalculateParams2.getLastMargin();
        BigDecimal bigDecimalAdd = lastMargin != null ? lastMargin.add(C41014a.m89922G(fetchUnifyCalculateParams2.getMargin(), null, 1, null)) : null;
        if (bigDecimalAdd != null) {
            strM92640e = C42180b.m92640e(bigDecimalAdd, RoundingMode.DOWN, C27039d.m66651k(contractEntityM99529O != null ? Boxing.boxInt(C37567b.m84613c(contractEntityM99529O)) : null, 4), true, true, true, 0, null, 96, null);
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

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final MutableLiveData<PositionRenderInfo> m27789Z() {
        return this.f24266b0;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final MutableLiveData<BigDecimal> m27790a0() {
        return this.f24269e0;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final MutableLiveData<Pair<Boolean, Throwable>> m27791b0() {
        return this.f24268d0;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final MutableLiveData<Pair<Boolean, Throwable>> m27792c0() {
        return this.f24267c0;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m27793d0(@Nullable BigDecimal bigDecimal, @Nullable PositionEntity positionEntity) throws Throwable {
        BigDecimal decimal;
        if (BrokerConfig.f19211a.m20201d().mo4515x() == MultiBizType.UNIFIED) {
            this.f24264Z.mo90855d(new FetchUnifyCalculateParams(C27041f.m66668h(positionEntity != null ? positionEntity.getSymbol() : null), positionEntity != null ? positionEntity.getPosMargin() : null, bigDecimal, C27041f.m66669i(positionEntity != null ? positionEntity.getPositionSide() : null, "BOTH"), null, 16, null));
            return;
        }
        if (this.f24270f0 == null && bigDecimal == null) {
            return;
        }
        this.f24270f0 = bigDecimal;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(positionEntity != null ? positionEntity.getSymbol() : null), false, 2, null);
        String strM66516f = C27017c.f54310a.m66516f(R$string.stub, new Object[0]);
        if (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) == 0 || positionEntity == null || contractEntityM99529O == null) {
            this.f24266b0.setValue(new PositionRenderInfo(strM66516f, strM66516f, strM66516f, strM66516f));
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
        BigDecimal decimal3 = C44111c.m97191b(c45258c.m100044e(c44110bM97192c, c44110bM97191b3, C44111c.m97191b(posCost != null ? C44111c.m97192c(posCost) : null, null, 1, null), C44111c.m97192c(bigDecimal)), null, 1, null).getDecimal();
        C44110b c44110bM97192c2 = C44111c.m97192c(decimal2);
        BigDecimal posMargin2 = positionEntity.getPosMargin();
        C44110b c44110bM97191b4 = C44111c.m97191b(posMargin2 != null ? C44111c.m97192c(posMargin2) : null, null, 1, null);
        BigDecimal posCost2 = positionEntity.getPosCost();
        C44110b c44110bM100041b = c45258c.m100041b(c44110bM97192c2, c44110bM97191b4, C44111c.m97191b(posCost2 != null ? C44111c.m97192c(posCost2) : null, null, 1, null), C44111c.m97192c(bigDecimal));
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
        C44110b c44110bM100042c = c45258c.m100042c(zM66566d2, c44110bM97191b5, c44110bM97191b6, c44110bM97191b7, c44110bM97191b8, c44110bM97192c3, C44111c.m97191b(takerFeeRate != null ? C44111c.m97192c(takerFeeRate) : null, null, 1, null), C44111c.m97192c(m28026G(positionEntity.isTrialFunds())), C44111c.m97192c(bigDecimal));
        BigDecimal decimal4 = c44110bM100042c != null ? c44110bM100042c.getDecimal() : null;
        MutableLiveData<PositionRenderInfo> mutableLiveData = this.f24266b0;
        int iM84613c = C37567b.m84613c(contractEntityM99529O);
        RoundingMode roundingMode = RoundingMode.DOWN;
        mutableLiveData.setValue(new PositionRenderInfo(C42180b.m92640e(decimal3, roundingMode, iM84613c, true, true, true, 0, null, 96, null), strM66669i, C42180b.m92647l(decimal4 != null ? C17054k0.m36540n(decimal4, contractEntityM99529O, C37569d.m84683x(positionEntity), false, false, 12, null) : null), C42180b.m92640e(C27039d.m66656p(positionEntity.getAvgEntryPrice()), roundingMode, C27039d.m66651k(Integer.valueOf(C37567b.m84618h(contractEntityM99529O)), 2), true, true, true, 0, null, 96, null)));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m27794e0(@NotNull final String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new AddMarginViewModel$observeIsolatedAvailableBalance$1(currency, this, null), 2, null);
        Observable observableSubscribeOn = MultiBizFacadeManager.m20249F(MultiBizFacadeManager.f19232a, currency, false, null, 4, null).subscribeOn(C42916f.m94127f());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.vm.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddMarginViewModel.m27784f0(this.f24320b, currency, (SimpleBalanceEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.position.vm.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AddMarginViewModel.m27785g0(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.position.vm.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddMarginViewModel.m27786h0(this.f24335b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.position.vm.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AddMarginViewModel.m27787i0(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF46845W());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m27795j0(boolean z11, @NotNull PositionEntity display) {
        Intrinsics.checkNotNullParameter(display, "display");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new AddMarginViewModel$submitAutoDepositMargin$1(display, z11, this, null), 2, null);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m27796l0(@NotNull String symbol, boolean z11, @NotNull BigDecimal inputValue, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83254d()), null, new AddMarginViewModel$submitMargin$1(z11, symbol, inputValue, positionSide, this, null), 2, null);
    }

    public AddMarginViewModel() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94119a(), null, new C140341(null), 2, null);
        this.f24265a0 = "AddMarginViewModel";
        this.f24266b0 = new MutableLiveData<>();
        this.f24267c0 = new MutableLiveData<>();
        this.f24268d0 = new MutableLiveData<>();
        this.f24269e0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m27784f0(AddMarginViewModel addMarginViewModel, String str, SimpleBalanceEntity simpleBalanceEntity) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(addMarginViewModel), C42911a.m94120b(), null, new AddMarginViewModel$observeIsolatedAvailableBalance$2$1(str, addMarginViewModel, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m27785g0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m27787i0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
