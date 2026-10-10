package com.kubi.copytrading.futures;

import com.kubi.copytrading.entity.CopyTradingContractEntity;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p659uc.C45151a;
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
import y70.C46392a;

/* JADX INFO: compiled from: FutureCopyTradingConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.copytrading.futures.FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1", m90122f = "FutureCopyTradingConfig.kt", m90123i = {}, m90124l = {82, 90}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: com.kubi.copytrading.futures.FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1$1 */
    /* JADX INFO: compiled from: FutureCopyTradingConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/copytrading/entity/CopyTradingContractEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.futures.FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1$1", m90122f = "FutureCopyTradingConfig.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nFutureCopyTradingConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FutureCopyTradingConfig.kt\ncom/kubi/copytrading/futures/FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,108:1\n172#2:109\n*S KotlinDebug\n*F\n+ 1 FutureCopyTradingConfig.kt\ncom/kubi/copytrading/futures/FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1$1\n*L\n84#1:109\n*E\n"})
    public static final class C115201 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends CopyTradingContractEntity>>, Object> {
        int label;

        public C115201(Continuation<? super C115201> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends CopyTradingContractEntity>> continuation) {
            return invoke2(interfaceC41709m0, (Continuation<? super List<CopyTradingContractEntity>>) continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C115201(continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<CopyTradingContractEntity>> continuation) {
            return ((C115201) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                List listM102325g = C46392a.m102325g(C45151a.f101594a.m99797c(), CollectionsKt.emptyList());
                FutureCopyTradingConfig.f19904c.clear();
                FutureCopyTradingConfig.f19904c.addAll(listM102325g);
                return listM102325g;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.futures.FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1$2 */
    /* JADX INFO: compiled from: FutureCopyTradingConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/copytrading/entity/CopyTradingContractEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.futures.FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1$2", m90122f = "FutureCopyTradingConfig.kt", m90123i = {0}, m90124l = {93}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
    public static final class C115212 extends SuspendLambda implements Function2<List<? extends CopyTradingContractEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.copytrading.futures.FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: FutureCopyTradingConfig.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.copytrading.futures.FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1$2$1", m90122f = "FutureCopyTradingConfig.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        @SourceDebugExtension({"SMAP\nFutureCopyTradingConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FutureCopyTradingConfig.kt\ncom/kubi/copytrading/futures/FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1$2$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,108:1\n162#2,2:109\n*S KotlinDebug\n*F\n+ 1 FutureCopyTradingConfig.kt\ncom/kubi/copytrading/futures/FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1$2$1\n*L\n94#1:109,2\n*E\n"})
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
                    C46392a.m102332o(C45151a.f101594a.m99797c(), FutureCopyTradingConfig.f19904c);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C115212(Continuation<? super C115212> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends CopyTradingContractEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<CopyTradingContractEntity>) list, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C115212 c115212 = new C115212(continuation);
            c115212.L$0 = obj;
            return c115212;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<CopyTradingContractEntity> list, Continuation<? super Unit> continuation) {
            return ((C115212) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                FutureCopyTradingConfig.f19904c.clear();
                FutureCopyTradingConfig.f19904c.addAll(list);
                AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
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

    public FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1(Continuation<? super FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FutureCopyTradingConfig$fetchAllSymbolSupportCopyTrading$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42823d(r6, false, r1, r5) == r0) goto L15;
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
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
        C115201 c115201 = new C115201(null);
        this.label = 1;
        if (C41686h.m91049g(abstractC41697j0M94120b, c115201, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        InterfaceC41634e<List<CopyTradingContractEntity>> interfaceC41634eM20828g = FutureCopyTradingConfig.f19902a.m20874i().m20828g();
        C115212 c115212 = new C115212(null);
        this.label = 2;
    }
}
