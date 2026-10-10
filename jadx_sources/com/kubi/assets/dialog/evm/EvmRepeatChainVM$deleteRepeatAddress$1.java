package com.kubi.assets.dialog.evm;

import com.kubi.assets.R$string;
import com.kubi.assets.entity.EvmRepeatEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
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

/* JADX INFO: compiled from: EvmRepeatChainVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmRepeatChainVM$deleteRepeatAddress$1", m90122f = "EvmRepeatChainVM.kt", m90123i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5}, m90124l = {129, 133, 134, 135, 144, 150}, m90125m = "invokeSuspend", m90126n = {"currentList", "deleteList", "currentList", "deleteList", "currentList", "deleteList", "currentList", "deleteList", "currentList", "deleteList", "$this$onFail$iv", "it$iv", "it", "$i$f$onFail", "$i$a$-let-RetrofitFlowExKt$onFail$1$iv", "$i$a$-onFail-EvmRepeatChainVM$deleteRepeatAddress$1$2", "currentList", "deleteList", "$this$onFail$iv", "it$iv", "it", "$i$f$onFail", "$i$a$-let-RetrofitFlowExKt$onFail$1$iv", "$i$a$-onFail-EvmRepeatChainVM$deleteRepeatAddress$1$2"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2"})
@SourceDebugExtension({"SMAP\nEvmRepeatChainVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvmRepeatChainVM.kt\ncom/kubi/assets/dialog/evm/EvmRepeatChainVM$deleteRepeatAddress$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1563#2:190\n1634#2,3:191\n25#3:194\n26#3:196\n1#4:195\n*S KotlinDebug\n*F\n+ 1 EvmRepeatChainVM.kt\ncom/kubi/assets/dialog/evm/EvmRepeatChainVM$deleteRepeatAddress$1\n*L\n121#1:190\n121#1:191,3\n143#1:194\n143#1:196\n143#1:195\n*E\n"})
public final class EvmRepeatChainVM$deleteRepeatAddress$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ EvmRepeatChainVM this$0;

    /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.EvmRepeatChainVM$deleteRepeatAddress$1$1 */
    /* JADX INFO: compiled from: EvmRepeatChainVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmRepeatChainVM$deleteRepeatAddress$1$1", m90122f = "EvmRepeatChainVM.kt", m90123i = {}, m90124l = {136, 141}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C97551 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ EvmRepeatChainVM this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97551(EvmRepeatChainVM evmRepeatChainVM, Continuation<? super C97551> continuation) {
            super(2, continuation);
            this.this$0 = evmRepeatChainVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C97551(this.this$0, continuation);
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C97551) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r8.m83045q(r1, r7) == r0) goto L15;
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
            EvmRepeatChainVM evmRepeatChainVM = this.this$0;
            EvmRepeatChainEffect.ShowToast showToast = new EvmRepeatChainEffect.ShowToast(C27017c.f54310a.m66516f(R$string.kc_withdaraw_evm_repeat_dialog_add_succ, new Object[0]));
            this.label = 1;
            if (evmRepeatChainVM.m83045q(showToast, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
            EvmRepeatChainVM evmRepeatChainVM2 = this.this$0;
            EvmRepeatChainEffect.a aVar = EvmRepeatChainEffect.a.f17077a;
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvmRepeatChainVM$deleteRepeatAddress$1(EvmRepeatChainVM evmRepeatChainVM, Continuation<? super EvmRepeatChainVM$deleteRepeatAddress$1> continuation) {
        super(2, continuation);
        this.this$0 = evmRepeatChainVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EvmRepeatChainVM$deleteRepeatAddress$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EvmRepeatChainVM$deleteRepeatAddress$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0124 A[PHI: r1 r3 r14
      0x0124: PHI (r1v5 java.util.List<com.kubi.assets.entity.EvmRepeatEntity>) = 
      (r1v2 java.util.List<com.kubi.assets.entity.EvmRepeatEntity>)
      (r1v7 java.util.List<com.kubi.assets.entity.EvmRepeatEntity>)
     binds: [B:32:0x0121, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r3v11 java.util.List<com.kubi.assets.dialog.evm.t>) = (r3v8 java.util.List<com.kubi.assets.dialog.evm.t>), (r3v13 java.util.List<com.kubi.assets.dialog.evm.t>) binds: [B:32:0x0121, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r14v16 java.lang.Object) = (r14v15 java.lang.Object), (r14v0 java.lang.Object) binds: [B:32:0x0121, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0154  */
    /* JADX WARN: Code duplicated, block: B:42:0x0198  */
    /* JADX WARN: Code duplicated, block: B:9:0x005d A[PHI: r1 r3 r7 r14
      0x005d: PHI (r1v8 java.util.List<com.kubi.assets.entity.EvmRepeatEntity>) = 
      (r1v5 java.util.List<com.kubi.assets.entity.EvmRepeatEntity>)
      (r1v13 java.util.List<com.kubi.assets.entity.EvmRepeatEntity>)
     binds: [B:35:0x0145, B:8:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r3v14 java.util.List<com.kubi.assets.dialog.evm.t>) = (r3v11 java.util.List<com.kubi.assets.dialog.evm.t>), (r3v24 java.util.List<com.kubi.assets.dialog.evm.t>) binds: [B:35:0x0145, B:8:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r7v2 com.kubi.assets.dialog.evm.EvmRepeatChainVM$deleteRepeatAddress$1) = 
      (r7v1 com.kubi.assets.dialog.evm.EvmRepeatChainVM$deleteRepeatAddress$1)
      (r7v3 com.kubi.assets.dialog.evm.EvmRepeatChainVM$deleteRepeatAddress$1)
     binds: [B:35:0x0145, B:8:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r14v22 java.lang.Object) = (r14v21 java.lang.Object), (r14v0 java.lang.Object) binds: [B:35:0x0145, B:8:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
    
        if (r2.m83045q(r3, r13) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c7, code lost:
    
        if (r14.m83045q(r11, r13) == r0) goto L45;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<EvmRepeatEntity> arrayList;
        List<EvmRepeatChainItem> list;
        EvmRepeatChainVM$deleteRepeatAddress$1 evmRepeatChainVM$deleteRepeatAddress$1;
        List<EvmRepeatEntity> list2;
        List<EvmRepeatChainItem> list3;
        C19334f c19334f;
        EvmRepeatChainVM evmRepeatChainVM;
        Throwable throwable;
        EvmRepeatChainEffect.ShowToast showToast;
        Throwable th2;
        int i11;
        int i12;
        int i13;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                List<EvmRepeatChainItem> listM16309c = this.this$0.m83043o().getValue().m16309c();
                if (listM16309c == null) {
                    listM16309c = CollectionsKt.emptyList();
                }
                arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(listM16309c, 10));
                for (EvmRepeatChainItem evmRepeatChainItem : listM16309c) {
                    arrayList.add(new EvmRepeatEntity(evmRepeatChainItem.getAddress(), evmRepeatChainItem.getMemo()));
                }
                if (arrayList.isEmpty()) {
                    EvmRepeatChainVM evmRepeatChainVM2 = this.this$0;
                    EvmRepeatChainEffect.a aVar = EvmRepeatChainEffect.a.f17077a;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(listM16309c);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(arrayList);
                    this.label = 1;
                    break;
                } else {
                    EvmRepeatChainVM evmRepeatChainVM3 = this.this$0;
                    EvmRepeatChainEffect.d dVar = EvmRepeatChainEffect.d.f17080a;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(listM16309c);
                    this.L$1 = arrayList;
                    this.label = 2;
                    if (evmRepeatChainVM3.m83045q(dVar, this) != coroutine_suspended) {
                        list = listM16309c;
                        EvmRepo evmRepo = this.this$0.f17054Z;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(list);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(arrayList);
                        this.label = 3;
                        obj = evmRepo.m16284c(arrayList, this);
                        if (obj == coroutine_suspended) {
                            C97551 c97551 = new C97551(this.this$0, null);
                            this.L$0 = SpillingKt.nullOutSpilledVariable(list);
                            this.L$1 = SpillingKt.nullOutSpilledVariable(arrayList);
                            this.label = 4;
                            evmRepeatChainVM$deleteRepeatAddress$1 = this;
                            obj = RetrofitFlowExKt.m42824e((InterfaceC41634e) obj, false, c97551, evmRepeatChainVM$deleteRepeatAddress$1, 1, null);
                            if (obj != coroutine_suspended) {
                                list2 = arrayList;
                                list3 = list;
                                c19334f = (C19334f) obj;
                                evmRepeatChainVM = evmRepeatChainVM$deleteRepeatAddress$1.this$0;
                                throwable = c19334f.getThrowable();
                                if (throwable != null) {
                                    showToast = new EvmRepeatChainEffect.ShowToast(C27041f.m66669i(throwable.getMessage(), C27017c.f54310a.m66516f(R$string.kc_withdaraw_evm_repeat_dialog_add_succ, new Object[0])));
                                    evmRepeatChainVM$deleteRepeatAddress$1.L$0 = SpillingKt.nullOutSpilledVariable(list3);
                                    evmRepeatChainVM$deleteRepeatAddress$1.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                                    evmRepeatChainVM$deleteRepeatAddress$1.L$2 = c19334f;
                                    evmRepeatChainVM$deleteRepeatAddress$1.L$3 = evmRepeatChainVM;
                                    evmRepeatChainVM$deleteRepeatAddress$1.L$4 = SpillingKt.nullOutSpilledVariable(throwable);
                                    evmRepeatChainVM$deleteRepeatAddress$1.L$5 = SpillingKt.nullOutSpilledVariable(throwable);
                                    evmRepeatChainVM$deleteRepeatAddress$1.I$0 = 0;
                                    evmRepeatChainVM$deleteRepeatAddress$1.I$1 = 0;
                                    evmRepeatChainVM$deleteRepeatAddress$1.I$2 = 0;
                                    evmRepeatChainVM$deleteRepeatAddress$1.label = 5;
                                    if (evmRepeatChainVM.m83045q(showToast, this) != coroutine_suspended) {
                                        th2 = throwable;
                                        i11 = 0;
                                        i12 = 0;
                                        i13 = 0;
                                        EvmRepeatChainEffect.a aVar2 = EvmRepeatChainEffect.a.f17077a;
                                        evmRepeatChainVM$deleteRepeatAddress$1.L$0 = SpillingKt.nullOutSpilledVariable(list3);
                                        evmRepeatChainVM$deleteRepeatAddress$1.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                                        evmRepeatChainVM$deleteRepeatAddress$1.L$2 = c19334f;
                                        evmRepeatChainVM$deleteRepeatAddress$1.L$3 = SpillingKt.nullOutSpilledVariable(th2);
                                        evmRepeatChainVM$deleteRepeatAddress$1.L$4 = SpillingKt.nullOutSpilledVariable(throwable);
                                        evmRepeatChainVM$deleteRepeatAddress$1.L$5 = null;
                                        evmRepeatChainVM$deleteRepeatAddress$1.I$0 = i13;
                                        evmRepeatChainVM$deleteRepeatAddress$1.I$1 = i12;
                                        evmRepeatChainVM$deleteRepeatAddress$1.I$2 = i11;
                                        evmRepeatChainVM$deleteRepeatAddress$1.label = 6;
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                return coroutine_suspended;
            case 1:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 2:
                arrayList = (List) this.L$1;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                EvmRepo evmRepo2 = this.this$0.f17054Z;
                this.L$0 = SpillingKt.nullOutSpilledVariable(list);
                this.L$1 = SpillingKt.nullOutSpilledVariable(arrayList);
                this.label = 3;
                obj = evmRepo2.m16284c(arrayList, this);
                if (obj == coroutine_suspended) {
                    C97551 c97552 = new C97551(this.this$0, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(list);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(arrayList);
                    this.label = 4;
                    evmRepeatChainVM$deleteRepeatAddress$1 = this;
                    obj = RetrofitFlowExKt.m42824e((InterfaceC41634e) obj, false, c97552, evmRepeatChainVM$deleteRepeatAddress$1, 1, null);
                    if (obj != coroutine_suspended) {
                        list2 = arrayList;
                        list3 = list;
                        c19334f = (C19334f) obj;
                        evmRepeatChainVM = evmRepeatChainVM$deleteRepeatAddress$1.this$0;
                        throwable = c19334f.getThrowable();
                        if (throwable != null) {
                            showToast = new EvmRepeatChainEffect.ShowToast(C27041f.m66669i(throwable.getMessage(), C27017c.f54310a.m66516f(R$string.kc_withdaraw_evm_repeat_dialog_add_succ, new Object[0])));
                            evmRepeatChainVM$deleteRepeatAddress$1.L$0 = SpillingKt.nullOutSpilledVariable(list3);
                            evmRepeatChainVM$deleteRepeatAddress$1.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                            evmRepeatChainVM$deleteRepeatAddress$1.L$2 = c19334f;
                            evmRepeatChainVM$deleteRepeatAddress$1.L$3 = evmRepeatChainVM;
                            evmRepeatChainVM$deleteRepeatAddress$1.L$4 = SpillingKt.nullOutSpilledVariable(throwable);
                            evmRepeatChainVM$deleteRepeatAddress$1.L$5 = SpillingKt.nullOutSpilledVariable(throwable);
                            evmRepeatChainVM$deleteRepeatAddress$1.I$0 = 0;
                            evmRepeatChainVM$deleteRepeatAddress$1.I$1 = 0;
                            evmRepeatChainVM$deleteRepeatAddress$1.I$2 = 0;
                            evmRepeatChainVM$deleteRepeatAddress$1.label = 5;
                            if (evmRepeatChainVM.m83045q(showToast, this) != coroutine_suspended) {
                                th2 = throwable;
                                i11 = 0;
                                i12 = 0;
                                i13 = 0;
                                EvmRepeatChainEffect.a aVar3 = EvmRepeatChainEffect.a.f17077a;
                                evmRepeatChainVM$deleteRepeatAddress$1.L$0 = SpillingKt.nullOutSpilledVariable(list3);
                                evmRepeatChainVM$deleteRepeatAddress$1.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                                evmRepeatChainVM$deleteRepeatAddress$1.L$2 = c19334f;
                                evmRepeatChainVM$deleteRepeatAddress$1.L$3 = SpillingKt.nullOutSpilledVariable(th2);
                                evmRepeatChainVM$deleteRepeatAddress$1.L$4 = SpillingKt.nullOutSpilledVariable(throwable);
                                evmRepeatChainVM$deleteRepeatAddress$1.L$5 = null;
                                evmRepeatChainVM$deleteRepeatAddress$1.I$0 = i13;
                                evmRepeatChainVM$deleteRepeatAddress$1.I$1 = i12;
                                evmRepeatChainVM$deleteRepeatAddress$1.I$2 = i11;
                                evmRepeatChainVM$deleteRepeatAddress$1.label = 6;
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 3:
                arrayList = (List) this.L$1;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                C97551 c97553 = new C97551(this.this$0, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(list);
                this.L$1 = SpillingKt.nullOutSpilledVariable(arrayList);
                this.label = 4;
                evmRepeatChainVM$deleteRepeatAddress$1 = this;
                obj = RetrofitFlowExKt.m42824e((InterfaceC41634e) obj, false, c97553, evmRepeatChainVM$deleteRepeatAddress$1, 1, null);
                if (obj != coroutine_suspended) {
                    list2 = arrayList;
                    list3 = list;
                    c19334f = (C19334f) obj;
                    evmRepeatChainVM = evmRepeatChainVM$deleteRepeatAddress$1.this$0;
                    throwable = c19334f.getThrowable();
                    if (throwable != null) {
                        showToast = new EvmRepeatChainEffect.ShowToast(C27041f.m66669i(throwable.getMessage(), C27017c.f54310a.m66516f(R$string.kc_withdaraw_evm_repeat_dialog_add_succ, new Object[0])));
                        evmRepeatChainVM$deleteRepeatAddress$1.L$0 = SpillingKt.nullOutSpilledVariable(list3);
                        evmRepeatChainVM$deleteRepeatAddress$1.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                        evmRepeatChainVM$deleteRepeatAddress$1.L$2 = c19334f;
                        evmRepeatChainVM$deleteRepeatAddress$1.L$3 = evmRepeatChainVM;
                        evmRepeatChainVM$deleteRepeatAddress$1.L$4 = SpillingKt.nullOutSpilledVariable(throwable);
                        evmRepeatChainVM$deleteRepeatAddress$1.L$5 = SpillingKt.nullOutSpilledVariable(throwable);
                        evmRepeatChainVM$deleteRepeatAddress$1.I$0 = 0;
                        evmRepeatChainVM$deleteRepeatAddress$1.I$1 = 0;
                        evmRepeatChainVM$deleteRepeatAddress$1.I$2 = 0;
                        evmRepeatChainVM$deleteRepeatAddress$1.label = 5;
                        if (evmRepeatChainVM.m83045q(showToast, this) != coroutine_suspended) {
                            th2 = throwable;
                            i11 = 0;
                            i12 = 0;
                            i13 = 0;
                            EvmRepeatChainEffect.a aVar4 = EvmRepeatChainEffect.a.f17077a;
                            evmRepeatChainVM$deleteRepeatAddress$1.L$0 = SpillingKt.nullOutSpilledVariable(list3);
                            evmRepeatChainVM$deleteRepeatAddress$1.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                            evmRepeatChainVM$deleteRepeatAddress$1.L$2 = c19334f;
                            evmRepeatChainVM$deleteRepeatAddress$1.L$3 = SpillingKt.nullOutSpilledVariable(th2);
                            evmRepeatChainVM$deleteRepeatAddress$1.L$4 = SpillingKt.nullOutSpilledVariable(throwable);
                            evmRepeatChainVM$deleteRepeatAddress$1.L$5 = null;
                            evmRepeatChainVM$deleteRepeatAddress$1.I$0 = i13;
                            evmRepeatChainVM$deleteRepeatAddress$1.I$1 = i12;
                            evmRepeatChainVM$deleteRepeatAddress$1.I$2 = i11;
                            evmRepeatChainVM$deleteRepeatAddress$1.label = 6;
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 4:
                arrayList = (List) this.L$1;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                evmRepeatChainVM$deleteRepeatAddress$1 = this;
                list2 = arrayList;
                list3 = list;
                c19334f = (C19334f) obj;
                evmRepeatChainVM = evmRepeatChainVM$deleteRepeatAddress$1.this$0;
                throwable = c19334f.getThrowable();
                if (throwable != null) {
                    showToast = new EvmRepeatChainEffect.ShowToast(C27041f.m66669i(throwable.getMessage(), C27017c.f54310a.m66516f(R$string.kc_withdaraw_evm_repeat_dialog_add_succ, new Object[0])));
                    evmRepeatChainVM$deleteRepeatAddress$1.L$0 = SpillingKt.nullOutSpilledVariable(list3);
                    evmRepeatChainVM$deleteRepeatAddress$1.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                    evmRepeatChainVM$deleteRepeatAddress$1.L$2 = c19334f;
                    evmRepeatChainVM$deleteRepeatAddress$1.L$3 = evmRepeatChainVM;
                    evmRepeatChainVM$deleteRepeatAddress$1.L$4 = SpillingKt.nullOutSpilledVariable(throwable);
                    evmRepeatChainVM$deleteRepeatAddress$1.L$5 = SpillingKt.nullOutSpilledVariable(throwable);
                    evmRepeatChainVM$deleteRepeatAddress$1.I$0 = 0;
                    evmRepeatChainVM$deleteRepeatAddress$1.I$1 = 0;
                    evmRepeatChainVM$deleteRepeatAddress$1.I$2 = 0;
                    evmRepeatChainVM$deleteRepeatAddress$1.label = 5;
                    if (evmRepeatChainVM.m83045q(showToast, this) != coroutine_suspended) {
                        th2 = throwable;
                        i11 = 0;
                        i12 = 0;
                        i13 = 0;
                        EvmRepeatChainEffect.a aVar5 = EvmRepeatChainEffect.a.f17077a;
                        evmRepeatChainVM$deleteRepeatAddress$1.L$0 = SpillingKt.nullOutSpilledVariable(list3);
                        evmRepeatChainVM$deleteRepeatAddress$1.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                        evmRepeatChainVM$deleteRepeatAddress$1.L$2 = c19334f;
                        evmRepeatChainVM$deleteRepeatAddress$1.L$3 = SpillingKt.nullOutSpilledVariable(th2);
                        evmRepeatChainVM$deleteRepeatAddress$1.L$4 = SpillingKt.nullOutSpilledVariable(throwable);
                        evmRepeatChainVM$deleteRepeatAddress$1.L$5 = null;
                        evmRepeatChainVM$deleteRepeatAddress$1.I$0 = i13;
                        evmRepeatChainVM$deleteRepeatAddress$1.I$1 = i12;
                        evmRepeatChainVM$deleteRepeatAddress$1.I$2 = i11;
                        evmRepeatChainVM$deleteRepeatAddress$1.label = 6;
                        break;
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 5:
                i11 = this.I$2;
                i12 = this.I$1;
                i13 = this.I$0;
                throwable = (Throwable) this.L$5;
                th2 = (Throwable) this.L$4;
                EvmRepeatChainVM evmRepeatChainVM4 = (EvmRepeatChainVM) this.L$3;
                c19334f = (C19334f) this.L$2;
                list2 = (List) this.L$1;
                list3 = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                evmRepeatChainVM = evmRepeatChainVM4;
                evmRepeatChainVM$deleteRepeatAddress$1 = this;
                EvmRepeatChainEffect.a aVar6 = EvmRepeatChainEffect.a.f17077a;
                evmRepeatChainVM$deleteRepeatAddress$1.L$0 = SpillingKt.nullOutSpilledVariable(list3);
                evmRepeatChainVM$deleteRepeatAddress$1.L$1 = SpillingKt.nullOutSpilledVariable(list2);
                evmRepeatChainVM$deleteRepeatAddress$1.L$2 = c19334f;
                evmRepeatChainVM$deleteRepeatAddress$1.L$3 = SpillingKt.nullOutSpilledVariable(th2);
                evmRepeatChainVM$deleteRepeatAddress$1.L$4 = SpillingKt.nullOutSpilledVariable(throwable);
                evmRepeatChainVM$deleteRepeatAddress$1.L$5 = null;
                evmRepeatChainVM$deleteRepeatAddress$1.I$0 = i13;
                evmRepeatChainVM$deleteRepeatAddress$1.I$1 = i12;
                evmRepeatChainVM$deleteRepeatAddress$1.I$2 = i11;
                evmRepeatChainVM$deleteRepeatAddress$1.label = 6;
                break;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
