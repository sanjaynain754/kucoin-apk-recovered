package com.kubi.assets.dialog.evm;

import com.kubi.assets.entity.EvmRepeatAddressResponseEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.List;
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

/* JADX INFO: compiled from: EvmRepeatChainVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmRepeatChainVM$loadRepeatAddressList$1", m90122f = "EvmRepeatChainVM.kt", m90123i = {3, 3, 3, 3, 3, 3}, m90124l = {53, 54, 55, 60}, m90125m = "invokeSuspend", m90126n = {"$this$onFail$iv", "it$iv", "it", "$i$f$onFail", "$i$a$-let-RetrofitFlowExKt$onFail$1$iv", "$i$a$-onFail-EvmRepeatChainVM$loadRepeatAddressList$1$2"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2"})
@SourceDebugExtension({"SMAP\nEvmRepeatChainVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvmRepeatChainVM.kt\ncom/kubi/assets/dialog/evm/EvmRepeatChainVM$loadRepeatAddressList$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n25#2:190\n26#2:192\n1#3:191\n*S KotlinDebug\n*F\n+ 1 EvmRepeatChainVM.kt\ncom/kubi/assets/dialog/evm/EvmRepeatChainVM$loadRepeatAddressList$1\n*L\n58#1:190\n58#1:192\n58#1:191\n*E\n"})
public final class EvmRepeatChainVM$loadRepeatAddressList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ String $memo;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ EvmRepeatChainVM this$0;

    /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.EvmRepeatChainVM$loadRepeatAddressList$1$1 */
    /* JADX INFO: compiled from: EvmRepeatChainVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "list", "", "Lcom/kubi/assets/entity/EvmRepeatAddressResponseEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmRepeatChainVM$loadRepeatAddressList$1$1", m90122f = "EvmRepeatChainVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C97561 extends SuspendLambda implements Function2<List<? extends EvmRepeatAddressResponseEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EvmRepeatChainVM this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends EvmRepeatAddressResponseEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<EvmRepeatAddressResponseEntity>) list, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97561(EvmRepeatChainVM evmRepeatChainVM, Continuation<? super C97561> continuation) {
            super(2, continuation);
            this.this$0 = evmRepeatChainVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C97561 c97561 = new C97561(this.this$0, continuation);
            c97561.L$0 = obj;
            return c97561;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<EvmRepeatAddressResponseEntity> list, Continuation<? super Unit> continuation) {
            return ((C97561) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m16273C(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvmRepeatChainVM$loadRepeatAddressList$1(EvmRepeatChainVM evmRepeatChainVM, String str, String str2, Continuation<? super EvmRepeatChainVM$loadRepeatAddressList$1> continuation) {
        super(2, continuation);
        this.this$0 = evmRepeatChainVM;
        this.$address = str;
        this.$memo = str2;
    }

    /* JADX INFO: renamed from: f */
    public static final EvmRepeatChainState m16278f(Throwable th2, EvmRepeatChainState evmRepeatChainState) {
        String message;
        if (th2 == null || (message = th2.getMessage()) == null) {
            message = "";
        }
        return EvmRepeatChainState.m16307b(evmRepeatChainState, false, message, null, 5, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EvmRepeatChainVM$loadRepeatAddressList$1(this.this$0, this.$address, this.$memo, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EvmRepeatChainVM$loadRepeatAddressList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077 A[PHI: r7 r11
      0x0077: PHI (r7v2 com.kubi.assets.dialog.evm.EvmRepeatChainVM$loadRepeatAddressList$1) = 
      (r7v1 com.kubi.assets.dialog.evm.EvmRepeatChainVM$loadRepeatAddressList$1)
      (r7v3 com.kubi.assets.dialog.evm.EvmRepeatChainVM$loadRepeatAddressList$1)
     binds: [B:21:0x0074, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r11v9 java.lang.Object) = (r11v8 java.lang.Object), (r11v0 java.lang.Object) binds: [B:21:0x0074, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (r1.m83045q(r4, r10) == r0) goto L27;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EvmRepeatChainVM$loadRepeatAddressList$1 evmRepeatChainVM$loadRepeatAddressList$1;
        C19334f c19334f;
        EvmRepeatChainVM evmRepeatChainVM;
        final Throwable throwable;
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
                        evmRepeatChainVM$loadRepeatAddressList$1 = this;
                        c19334f = (C19334f) obj;
                        evmRepeatChainVM = evmRepeatChainVM$loadRepeatAddressList$1.this$0;
                        throwable = c19334f.getThrowable();
                        if (throwable != null) {
                            evmRepeatChainVM.m83044p(new Function1() { // from class: com.kubi.assets.dialog.evm.x
                                @Override // p852kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return EvmRepeatChainVM$loadRepeatAddressList$1.m16278f(throwable, (EvmRepeatChainState) obj2);
                                }
                            });
                            EvmRepeatChainEffect.c cVar = EvmRepeatChainEffect.c.f17079a;
                            evmRepeatChainVM$loadRepeatAddressList$1.L$0 = c19334f;
                            evmRepeatChainVM$loadRepeatAddressList$1.L$1 = SpillingKt.nullOutSpilledVariable(throwable);
                            evmRepeatChainVM$loadRepeatAddressList$1.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
                            evmRepeatChainVM$loadRepeatAddressList$1.I$0 = 0;
                            evmRepeatChainVM$loadRepeatAddressList$1.I$1 = 0;
                            evmRepeatChainVM$loadRepeatAddressList$1.I$2 = 0;
                            evmRepeatChainVM$loadRepeatAddressList$1.label = 4;
                        }
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C97561 c97561 = new C97561(this.this$0, null);
                    this.label = 3;
                    evmRepeatChainVM$loadRepeatAddressList$1 = this;
                    obj = RetrofitFlowExKt.m42824e((InterfaceC41634e) obj, false, c97561, evmRepeatChainVM$loadRepeatAddressList$1, 1, null);
                    if (obj != coroutine_suspended) {
                        c19334f = (C19334f) obj;
                        evmRepeatChainVM = evmRepeatChainVM$loadRepeatAddressList$1.this$0;
                        throwable = c19334f.getThrowable();
                        if (throwable != null) {
                            evmRepeatChainVM.m83044p(new Function1() { // from class: com.kubi.assets.dialog.evm.x
                                @Override // p852kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return EvmRepeatChainVM$loadRepeatAddressList$1.m16278f(throwable, (EvmRepeatChainState) obj2);
                                }
                            });
                            EvmRepeatChainEffect.c cVar2 = EvmRepeatChainEffect.c.f17079a;
                            evmRepeatChainVM$loadRepeatAddressList$1.L$0 = c19334f;
                            evmRepeatChainVM$loadRepeatAddressList$1.L$1 = SpillingKt.nullOutSpilledVariable(throwable);
                            evmRepeatChainVM$loadRepeatAddressList$1.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
                            evmRepeatChainVM$loadRepeatAddressList$1.I$0 = 0;
                            evmRepeatChainVM$loadRepeatAddressList$1.I$1 = 0;
                            evmRepeatChainVM$loadRepeatAddressList$1.I$2 = 0;
                            evmRepeatChainVM$loadRepeatAddressList$1.label = 4;
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
        EvmRepeatChainVM evmRepeatChainVM2 = this.this$0;
        EvmRepeatChainEffect.d dVar = EvmRepeatChainEffect.d.f17080a;
        this.label = 1;
        if (evmRepeatChainVM2.m83045q(dVar, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        EvmRepo evmRepo = this.this$0.f17054Z;
        String str = this.$address;
        String str2 = this.$memo;
        this.label = 2;
        obj = evmRepo.m16287g(str, str2, this);
        if (obj != coroutine_suspended) {
            C97561 c97562 = new C97561(this.this$0, null);
            this.label = 3;
            evmRepeatChainVM$loadRepeatAddressList$1 = this;
            obj = RetrofitFlowExKt.m42824e((InterfaceC41634e) obj, false, c97562, evmRepeatChainVM$loadRepeatAddressList$1, 1, null);
            if (obj != coroutine_suspended) {
                c19334f = (C19334f) obj;
                evmRepeatChainVM = evmRepeatChainVM$loadRepeatAddressList$1.this$0;
                throwable = c19334f.getThrowable();
                if (throwable != null) {
                    evmRepeatChainVM.m83044p(new Function1() { // from class: com.kubi.assets.dialog.evm.x
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return EvmRepeatChainVM$loadRepeatAddressList$1.m16278f(throwable, (EvmRepeatChainState) obj2);
                        }
                    });
                    EvmRepeatChainEffect.c cVar3 = EvmRepeatChainEffect.c.f17079a;
                    evmRepeatChainVM$loadRepeatAddressList$1.L$0 = c19334f;
                    evmRepeatChainVM$loadRepeatAddressList$1.L$1 = SpillingKt.nullOutSpilledVariable(throwable);
                    evmRepeatChainVM$loadRepeatAddressList$1.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
                    evmRepeatChainVM$loadRepeatAddressList$1.I$0 = 0;
                    evmRepeatChainVM$loadRepeatAddressList$1.I$1 = 0;
                    evmRepeatChainVM$loadRepeatAddressList$1.I$2 = 0;
                    evmRepeatChainVM$loadRepeatAddressList$1.label = 4;
                }
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }
}
