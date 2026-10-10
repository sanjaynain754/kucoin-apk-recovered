package com.kubi.unify;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.unify.entity.UnifyConfig;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
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
@DebugMetadata(m90121c = "com.kubi.unify.UnifyGlobalDataManager$fetchUnifyConfig$1", m90122f = "UnifyGlobalDataManager.kt", m90123i = {}, m90124l = {184, 190}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nUnifyGlobalDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyConfig$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n25#2:337\n26#2:339\n1#3:338\n*S KotlinDebug\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyConfig$1\n*L\n195#1:337\n195#1:339\n195#1:338\n*E\n"})
public final class UnifyGlobalDataManager$fetchUnifyConfig$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: com.kubi.unify.UnifyGlobalDataManager$fetchUnifyConfig$1$1 */
    /* JADX INFO: compiled from: UnifyGlobalDataManager.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.unify.UnifyGlobalDataManager$fetchUnifyConfig$1$1", m90122f = "UnifyGlobalDataManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nUnifyGlobalDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyConfig$1$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,336:1\n153#2,2:337\n178#3:339\n*S KotlinDebug\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyConfig$1$1\n*L\n185#1:337,2\n185#1:339\n*E\n"})
    public static final class C264511 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C264511(Continuation<? super C264511> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C264511(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C264511) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                UnifyConfig unifyConfig = (UnifyConfig) C46392a.f104043a.m102336j(UnifyStoreIds.f53305a.m65252n(), UnifyConfig.class, null);
                if (unifyConfig == null) {
                    return null;
                }
                UnifyGlobalDataManager.f53090g.setValue(unifyConfig);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.unify.UnifyGlobalDataManager$fetchUnifyConfig$1$2 */
    /* JADX INFO: compiled from: UnifyGlobalDataManager.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/unify/entity/UnifyConfig;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.unify.UnifyGlobalDataManager$fetchUnifyConfig$1$2", m90122f = "UnifyGlobalDataManager.kt", m90123i = {0}, m90124l = {192}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
    public static final class C264522 extends SuspendLambda implements Function2<UnifyConfig, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.unify.UnifyGlobalDataManager$fetchUnifyConfig$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: UnifyGlobalDataManager.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.unify.UnifyGlobalDataManager$fetchUnifyConfig$1$2$1", m90122f = "UnifyGlobalDataManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        @SourceDebugExtension({"SMAP\nUnifyGlobalDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyConfig$1$2$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,336:1\n144#2,2:337\n*S KotlinDebug\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyConfig$1$2$1\n*L\n193#1:337,2\n*E\n"})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
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
                    C46392a.m102331n(UnifyStoreIds.f53305a.m65252n(), UnifyGlobalDataManager.f53084a.m64884v().getValue());
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C264522(Continuation<? super C264522> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UnifyConfig unifyConfig, Continuation<? super Unit> continuation) {
            return ((C264522) create(unifyConfig, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C264522 c264522 = new C264522(continuation);
            c264522.L$0 = obj;
            return c264522;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnifyConfig unifyConfig = (UnifyConfig) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                UnifyGlobalDataManager.f53090g.setValue(unifyConfig);
                AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(unifyConfig);
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

    public UnifyGlobalDataManager$fetchUnifyConfig$1(Continuation<? super UnifyGlobalDataManager$fetchUnifyConfig$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifyGlobalDataManager$fetchUnifyConfig$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifyGlobalDataManager$fetchUnifyConfig$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        C264511 c264511 = new C264511(null);
        this.label = 1;
        if (C41686h.m91049g(abstractC41697j0M94120b, c264511, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(UnifyGlobalDataManager.f53084a.m64882t().m86743j());
        C264522 c264522 = new C264522(null);
        this.label = 2;
        obj = RetrofitFlowExKt.m42823d(interfaceC41634eM90881E, false, c264522, this);
    }
}
