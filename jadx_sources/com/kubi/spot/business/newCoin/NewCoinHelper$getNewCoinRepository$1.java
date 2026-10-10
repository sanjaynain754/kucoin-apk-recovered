package com.kubi.spot.business.newCoin;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.spot.business.newCoin.entity.NewCoinActivityEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: NewCoinHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.newCoin.NewCoinHelper$getNewCoinRepository$1", m90122f = "NewCoinHelper.kt", m90123i = {}, m90124l = {41}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nNewCoinHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCoinHelper.kt\ncom/kubi/spot/business/newCoin/NewCoinHelper$getNewCoinRepository$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n25#2:73\n26#2:75\n1#3:74\n*S KotlinDebug\n*F\n+ 1 NewCoinHelper.kt\ncom/kubi/spot/business/newCoin/NewCoinHelper$getNewCoinRepository$1\n*L\n43#1:73\n43#1:75\n43#1:74\n*E\n"})
public final class NewCoinHelper$getNewCoinRepository$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $completion;
    final /* synthetic */ String $currency;
    final /* synthetic */ Function1<NewCoinActivityEntity, Unit> $onSuccess;
    final /* synthetic */ boolean $showToast;
    final /* synthetic */ Function0<Unit> $start;
    int label;

    /* JADX INFO: renamed from: com.kubi.spot.business.newCoin.NewCoinHelper$getNewCoinRepository$1$1 */
    /* JADX INFO: compiled from: NewCoinHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/spot/business/newCoin/entity/NewCoinActivityEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.newCoin.NewCoinHelper$getNewCoinRepository$1$1", m90122f = "NewCoinHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C250651 extends SuspendLambda implements Function2<InterfaceC41635f<? super NewCoinActivityEntity>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $start;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C250651(Function0<Unit> function0, Continuation<? super C250651> continuation) {
            super(2, continuation);
            this.$start = function0;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C250651(this.$start, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41635f<? super NewCoinActivityEntity> interfaceC41635f, Continuation<? super Unit> continuation) {
            return ((C250651) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Function0<Unit> function0 = this.$start;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.newCoin.NewCoinHelper$getNewCoinRepository$1$2 */
    /* JADX INFO: compiled from: NewCoinHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/spot/business/newCoin/entity/NewCoinActivityEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.newCoin.NewCoinHelper$getNewCoinRepository$1$2", m90122f = "NewCoinHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C250662 extends SuspendLambda implements Function3<InterfaceC41635f<? super NewCoinActivityEntity>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $completion;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C250662(Function0<Unit> function0, Continuation<? super C250662> continuation) {
            super(3, continuation);
            this.$completion = function0;
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super NewCoinActivityEntity> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            return new C250662(this.$completion, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Function0<Unit> function0 = this.$completion;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.newCoin.NewCoinHelper$getNewCoinRepository$1$3 */
    /* JADX INFO: compiled from: NewCoinHelper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/spot/business/newCoin/entity/NewCoinActivityEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.newCoin.NewCoinHelper$getNewCoinRepository$1$3", m90122f = "NewCoinHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C250673 extends SuspendLambda implements Function2<NewCoinActivityEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<NewCoinActivityEntity, Unit> $onSuccess;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(NewCoinActivityEntity newCoinActivityEntity, Continuation<? super Unit> continuation) {
            return ((C250673) create(newCoinActivityEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C250673(Function1<? super NewCoinActivityEntity, Unit> function1, Continuation<? super C250673> continuation) {
            super(2, continuation);
            this.$onSuccess = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250673 c250673 = new C250673(this.$onSuccess, continuation);
            c250673.L$0 = obj;
            return c250673;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NewCoinActivityEntity newCoinActivityEntity = (NewCoinActivityEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$onSuccess.invoke(newCoinActivityEntity);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NewCoinHelper$getNewCoinRepository$1(String str, boolean z11, Function0<Unit> function0, Function0<Unit> function1, Function1<? super NewCoinActivityEntity, Unit> function2, Continuation<? super NewCoinHelper$getNewCoinRepository$1> continuation) {
        super(2, continuation);
        this.$currency = str;
        this.$showToast = z11;
        this.$start = function0;
        this.$completion = function1;
        this.$onSuccess = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewCoinHelper$getNewCoinRepository$1(this.$currency, this.$showToast, this.$start, this.$completion, this.$onSuccess, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((NewCoinHelper$getNewCoinRepository$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM90895S = C41636g.m90895S(C41636g.m90897U(NewCoinHelper.f50280b.m61286d(this.$currency), new C250651(this.$start, null)), new C250662(this.$completion, null));
            boolean z11 = this.$showToast;
            C250673 c250673 = new C250673(this.$onSuccess, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM90895S, z11, c250673, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }
}
