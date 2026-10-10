package com.kubi.unify;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.unify.entity.BorrowConfigEntity;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: UnifyGlobalDataManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1", m90122f = "UnifyGlobalDataManager.kt", m90123i = {}, m90124l = {225, 231}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nUnifyGlobalDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n25#2:337\n26#2:339\n1#3:338\n*S KotlinDebug\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1\n*L\n236#1:337\n236#1:339\n236#1:338\n*E\n"})
public final class UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: com.kubi.unify.UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1$1 */
    /* JADX INFO: compiled from: UnifyGlobalDataManager.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.unify.UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1$1", m90122f = "UnifyGlobalDataManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nUnifyGlobalDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n171#2,2:337\n1#3:339\n*S KotlinDebug\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1$1\n*L\n226#1:337,2\n*E\n"})
    public static final class C264541 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C264541(Continuation<? super C264541> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C264541(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C264541) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                List listM102325g = C46392a.m102325g(UnifyStoreIds.f53305a.m65249k(), CollectionsKt.emptyList());
                if (listM102325g.isEmpty()) {
                    listM102325g = null;
                }
                if (listM102325g == null) {
                    return null;
                }
                UnifyGlobalDataManager.f53088e.setValue(listM102325g);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.unify.UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1$2 */
    /* JADX INFO: compiled from: UnifyGlobalDataManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/unify/entity/BorrowConfigEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.unify.UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1$2", m90122f = "UnifyGlobalDataManager.kt", m90123i = {0}, m90124l = {233}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
    public static final class C264552 extends SuspendLambda implements Function2<List<? extends BorrowConfigEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.unify.UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: UnifyGlobalDataManager.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.unify.UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1$2$1", m90122f = "UnifyGlobalDataManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        @SourceDebugExtension({"SMAP\nUnifyGlobalDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1$2$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,336:1\n162#2,2:337\n*S KotlinDebug\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1$2$1\n*L\n234#1:337,2\n*E\n"})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<BorrowConfigEntity> $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<BorrowConfigEntity> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$it = list;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$it, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    C46392a.m102332o(UnifyStoreIds.f53305a.m65249k(), this.$it);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C264552(Continuation<? super C264552> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends BorrowConfigEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<BorrowConfigEntity>) list, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C264552 c264552 = new C264552(continuation);
            c264552.L$0 = obj;
            return c264552;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<BorrowConfigEntity> list, Continuation<? super Unit> continuation) {
            return ((C264552) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                UnifyGlobalDataManager.f53088e.setValue(list);
                AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(list, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(list);
                this.label = 1;
                if (C41686h.m91049g(abstractC41697j0M94120b, anonymousClass1, this) == coroutine_suspended) {
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

    public UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1(Continuation<? super UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifyGlobalDataManager$fetchUnifyLoanCurrencyConfig$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            Throwable throwable = ((C19334f) obj).getThrowable();
            if (throwable != null) {
                C44128b.m97264h(throwable);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
        C264541 c264541 = new C264541(null);
        this.label = 1;
        if (C41686h.m91049g(abstractC41697j0M94120b, c264541, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(UnifyGlobalDataManager.f53084a.m64882t().m86744k());
        C264552 c264552 = new C264552(null);
        this.label = 2;
        obj = RetrofitFlowExKt.m42823d(interfaceC41634eM90881E, false, c264552, this);
    }
}
