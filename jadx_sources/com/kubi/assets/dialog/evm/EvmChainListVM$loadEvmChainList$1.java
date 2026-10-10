package com.kubi.assets.dialog.evm;

import com.kubi.assets.entity.EvmChainEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.ArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: EvmChainListVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmChainListVM$loadEvmChainList$1", m90122f = "EvmChainListVM.kt", m90123i = {3, 3, 3, 3, 3, 3}, m90124l = {24, 25, 26, 35}, m90125m = "invokeSuspend", m90126n = {"$this$onFail$iv", "it$iv", "it", "$i$f$onFail", "$i$a$-let-RetrofitFlowExKt$onFail$1$iv", "$i$a$-onFail-EvmChainListVM$loadEvmChainList$1$2"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2"})
@SourceDebugExtension({"SMAP\nEvmChainListVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvmChainListVM.kt\ncom/kubi/assets/dialog/evm/EvmChainListVM$loadEvmChainList$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n25#2:57\n26#2:59\n1#3:58\n*S KotlinDebug\n*F\n+ 1 EvmChainListVM.kt\ncom/kubi/assets/dialog/evm/EvmChainListVM$loadEvmChainList$1\n*L\n34#1:57\n34#1:59\n34#1:58\n*E\n"})
public final class EvmChainListVM$loadEvmChainList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ EvmChainListVM this$0;

    /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.EvmChainListVM$loadEvmChainList$1$1 */
    /* JADX INFO: compiled from: EvmChainListVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "chainList", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/EvmChainEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmChainListVM$loadEvmChainList$1$1", m90122f = "EvmChainListVM.kt", m90123i = {0, 1}, m90124l = {28, 30}, m90125m = "invokeSuspend", m90126n = {"chainList", "chainList"}, m90127s = {"L$0", "L$0"})
    public static final class C97501 extends SuspendLambda implements Function2<ArrayList<EvmChainEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EvmChainListVM this$0;

        /* JADX INFO: renamed from: f */
        public static final EvmChainListState m16221f(ArrayList arrayList, EvmChainListState evmChainListState) {
            return EvmChainListState.m16292b(evmChainListState, false, null, arrayList, 3, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97501(EvmChainListVM evmChainListVM, Continuation<? super C97501> continuation) {
            super(2, continuation);
            this.this$0 = evmChainListVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C97501 c97501 = new C97501(this.this$0, continuation);
            c97501.L$0 = obj;
            return c97501;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<EvmChainEntity> arrayList, Continuation<? super Unit> continuation) {
            return ((C97501) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r6.m83045q(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r6.m83045q(r2, r5) == r1) goto L17;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            final ArrayList arrayList = (ArrayList) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                if (arrayList.isEmpty()) {
                    EvmChainListVM evmChainListVM = this.this$0;
                    EvmChainListEffect.b bVar = EvmChainListEffect.b.f17059a;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(arrayList);
                    this.label = 1;
                } else {
                    EvmChainListVM evmChainListVM2 = this.this$0;
                    EvmChainListEffect.a aVar = EvmChainListEffect.a.f17058a;
                    this.L$0 = arrayList;
                    this.label = 2;
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.m83044p(new Function1() { // from class: com.kubi.assets.dialog.evm.g
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EvmChainListVM$loadEvmChainList$1.C97501.m16221f(arrayList, (EvmChainListState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvmChainListVM$loadEvmChainList$1(EvmChainListVM evmChainListVM, Continuation<? super EvmChainListVM$loadEvmChainList$1> continuation) {
        super(2, continuation);
        this.this$0 = evmChainListVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EvmChainListVM$loadEvmChainList$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EvmChainListVM$loadEvmChainList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0073 A[PHI: r7 r11
      0x0073: PHI (r7v2 com.kubi.assets.dialog.evm.EvmChainListVM$loadEvmChainList$1) = 
      (r7v1 com.kubi.assets.dialog.evm.EvmChainListVM$loadEvmChainList$1)
      (r7v3 com.kubi.assets.dialog.evm.EvmChainListVM$loadEvmChainList$1)
     binds: [B:21:0x0070, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r11v9 java.lang.Object) = (r11v8 java.lang.Object), (r11v0 java.lang.Object) binds: [B:21:0x0070, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r1.m83045q(r4, r10) == r0) goto L27;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EvmChainListVM$loadEvmChainList$1 evmChainListVM$loadEvmChainList$1;
        C19334f c19334f;
        Throwable throwable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        evmChainListVM$loadEvmChainList$1 = this;
                        c19334f = (C19334f) obj;
                        EvmChainListVM evmChainListVM = evmChainListVM$loadEvmChainList$1.this$0;
                        throwable = c19334f.getThrowable();
                        if (throwable != null) {
                            EvmChainListEffect.b bVar = EvmChainListEffect.b.f17059a;
                            evmChainListVM$loadEvmChainList$1.L$0 = c19334f;
                            evmChainListVM$loadEvmChainList$1.L$1 = SpillingKt.nullOutSpilledVariable(throwable);
                            evmChainListVM$loadEvmChainList$1.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
                            evmChainListVM$loadEvmChainList$1.I$0 = 0;
                            evmChainListVM$loadEvmChainList$1.I$1 = 0;
                            evmChainListVM$loadEvmChainList$1.I$2 = 0;
                            evmChainListVM$loadEvmChainList$1.label = 4;
                        }
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C97501 c97501 = new C97501(this.this$0, null);
                    this.label = 3;
                    evmChainListVM$loadEvmChainList$1 = this;
                    obj = RetrofitFlowExKt.m42824e((InterfaceC41634e) obj, false, c97501, evmChainListVM$loadEvmChainList$1, 1, null);
                    if (obj != coroutine_suspended) {
                        c19334f = (C19334f) obj;
                        EvmChainListVM evmChainListVM2 = evmChainListVM$loadEvmChainList$1.this$0;
                        throwable = c19334f.getThrowable();
                        if (throwable != null) {
                            EvmChainListEffect.b bVar2 = EvmChainListEffect.b.f17059a;
                            evmChainListVM$loadEvmChainList$1.L$0 = c19334f;
                            evmChainListVM$loadEvmChainList$1.L$1 = SpillingKt.nullOutSpilledVariable(throwable);
                            evmChainListVM$loadEvmChainList$1.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
                            evmChainListVM$loadEvmChainList$1.I$0 = 0;
                            evmChainListVM$loadEvmChainList$1.I$1 = 0;
                            evmChainListVM$loadEvmChainList$1.I$2 = 0;
                            evmChainListVM$loadEvmChainList$1.label = 4;
                        }
                    }
                    return coroutine_suspended;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        EvmChainListVM evmChainListVM3 = this.this$0;
        EvmChainListEffect.c cVar = EvmChainListEffect.c.f17060a;
        this.label = 1;
        if (evmChainListVM3.m83045q(cVar, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        EvmRepo evmRepo = this.this$0.f17041Z;
        this.label = 2;
        obj = evmRepo.m16286f(this);
        if (obj != coroutine_suspended) {
            C97501 c97502 = new C97501(this.this$0, null);
            this.label = 3;
            evmChainListVM$loadEvmChainList$1 = this;
            obj = RetrofitFlowExKt.m42824e((InterfaceC41634e) obj, false, c97502, evmChainListVM$loadEvmChainList$1, 1, null);
            if (obj != coroutine_suspended) {
                c19334f = (C19334f) obj;
                EvmChainListVM evmChainListVM4 = evmChainListVM$loadEvmChainList$1.this$0;
                throwable = c19334f.getThrowable();
                if (throwable != null) {
                    EvmChainListEffect.b bVar3 = EvmChainListEffect.b.f17059a;
                    evmChainListVM$loadEvmChainList$1.L$0 = c19334f;
                    evmChainListVM$loadEvmChainList$1.L$1 = SpillingKt.nullOutSpilledVariable(throwable);
                    evmChainListVM$loadEvmChainList$1.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
                    evmChainListVM$loadEvmChainList$1.I$0 = 0;
                    evmChainListVM$loadEvmChainList$1.I$1 = 0;
                    evmChainListVM$loadEvmChainList$1.I$2 = 0;
                    evmChainListVM$loadEvmChainList$1.label = 4;
                }
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }
}
