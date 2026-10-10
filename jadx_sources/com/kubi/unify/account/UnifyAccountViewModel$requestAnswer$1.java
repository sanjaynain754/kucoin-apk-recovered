package com.kubi.unify.account;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.unify.UnifyGlobalDataManager;
import io.reactivex.functions.Action;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UnifyAccountViewModel.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.account.UnifyAccountViewModel$requestAnswer$1", m90122f = "UnifyAccountViewModel.kt", m90123i = {}, m90124l = {111}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nUnifyAccountViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyAccountViewModel.kt\ncom/kubi/unify/account/UnifyAccountViewModel$requestAnswer$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n25#2:121\n26#2:123\n1#3:122\n*S KotlinDebug\n*F\n+ 1 UnifyAccountViewModel.kt\ncom/kubi/unify/account/UnifyAccountViewModel$requestAnswer$1\n*L\n115#1:121\n115#1:123\n115#1:122\n*E\n"})
public final class UnifyAccountViewModel$requestAnswer$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Action $action;
    int label;
    final /* synthetic */ UnifyAccountViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.unify.account.UnifyAccountViewModel$requestAnswer$1$1 */
    /* JADX INFO: compiled from: UnifyAccountViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.unify.account.UnifyAccountViewModel$requestAnswer$1$1", m90122f = "UnifyAccountViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C264711 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        final /* synthetic */ Action $action;
        int label;
        final /* synthetic */ UnifyAccountViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C264711(Action action, UnifyAccountViewModel unifyAccountViewModel, Continuation<? super C264711> continuation) {
            super(2, continuation);
            this.$action = action;
            this.this$0 = unifyAccountViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C264711(this.$action, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C264711) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                UnifyGlobalDataManager.m64868l(UnifyGlobalDataManager.f53084a, null, Boxing.boxBoolean(true), null, 5, null);
                Action action = this.$action;
                if (action != null) {
                    action.run();
                }
                this.this$0.f53108W.setValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyAccountViewModel$requestAnswer$1(UnifyAccountViewModel unifyAccountViewModel, Action action, Continuation<? super UnifyAccountViewModel$requestAnswer$1> continuation) {
        super(2, continuation);
        this.this$0 = unifyAccountViewModel;
        this.$action = action;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifyAccountViewModel$requestAnswer$1(this.this$0, this.$action, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifyAccountViewModel$requestAnswer$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UnifyAccountViewModel$requestAnswer$1 unifyAccountViewModel$requestAnswer$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                unifyAccountViewModel$requestAnswer$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<Object> interfaceC41634eM86742i = this.this$0.m64946w().m86742i();
            C264711 c264711 = new C264711(this.$action, this.this$0, null);
            this.label = 1;
            unifyAccountViewModel$requestAnswer$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM86742i, false, c264711, unifyAccountViewModel$requestAnswer$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        UnifyAccountViewModel unifyAccountViewModel = unifyAccountViewModel$requestAnswer$1.this$0;
        if (((C19334f) obj).getThrowable() != null) {
            unifyAccountViewModel.f53108W.setValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
