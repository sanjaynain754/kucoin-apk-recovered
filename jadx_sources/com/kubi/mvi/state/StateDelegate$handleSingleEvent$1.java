package com.kubi.mvi.state;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.kubi.mvi.common.C19243e;
import com.kubi.mvi.event.SingleEvent;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: StateDelegate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mvi.state.StateDelegate$handleSingleEvent$1", m90122f = "StateDelegate.kt", m90123i = {}, m90124l = {94}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class StateDelegate$handleSingleEvent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<InterfaceC36952a, Unit> $singleIntentHandler;
    int label;
    final /* synthetic */ StateDelegate<I, S, VM> this$0;

    /* JADX INFO: renamed from: com.kubi.mvi.state.StateDelegate$handleSingleEvent$1$a */
    /* JADX INFO: compiled from: StateDelegate.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19273a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StateDelegate<I, S, VM> f35665b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1<InterfaceC36952a, Unit> f35666c;

        /* JADX WARN: Multi-variable type inference failed */
        public C19273a(StateDelegate<I, S, VM> stateDelegate, Function1<? super InterfaceC36952a, Unit> function1) {
            this.f35665b = stateDelegate;
            this.f35666c = function1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC36952a interfaceC36952a, Continuation<? super Unit> continuation) {
            FragmentActivity activity;
            C19243e.m42536e("handleSingleEvent->" + interfaceC36952a, this.f35665b.getF35660a().m42567g());
            if (interfaceC36952a instanceof SingleEvent.C19246b) {
                this.f35665b.m42636y();
            } else if (interfaceC36952a instanceof SingleEvent.C19252h) {
                this.f35665b.m42623O();
            } else if (interfaceC36952a instanceof SingleEvent.C19253i) {
                this.f35665b.m42624P();
            } else if (interfaceC36952a instanceof SingleEvent.C19248d) {
                this.f35665b.m42619I();
            } else if (interfaceC36952a instanceof SingleEvent.C19254j) {
                this.f35665b.m42625Q(((SingleEvent.C19254j) interfaceC36952a).getMsg());
            } else if (interfaceC36952a instanceof SingleEvent.C19250f) {
                this.f35665b.m42621K(((SingleEvent.C19250f) interfaceC36952a).m42543a());
            } else if (interfaceC36952a instanceof SingleEvent.C19251g) {
                this.f35665b.m42622M(((SingleEvent.C19251g) interfaceC36952a).m42544a());
            } else if (interfaceC36952a instanceof SingleEvent.C19249e) {
                this.f35665b.m42620J();
            } else if (interfaceC36952a instanceof SingleEvent.C19245a) {
                Fragment f35662c = this.f35665b.getF35662c();
                if (f35662c != null && (activity = f35662c.getActivity()) != null) {
                    activity.finish();
                }
            } else {
                Function1<InterfaceC36952a, Unit> function1 = this.f35666c;
                if (function1 != null) {
                    function1.invoke(interfaceC36952a);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StateDelegate$handleSingleEvent$1(StateDelegate<I, S, VM> stateDelegate, Function1<? super InterfaceC36952a, Unit> function1, Continuation<? super StateDelegate$handleSingleEvent$1> continuation) {
        super(1, continuation);
        this.this$0 = stateDelegate;
        this.$singleIntentHandler = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new StateDelegate$handleSingleEvent$1(this.this$0, this.$singleIntentHandler, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((StateDelegate$handleSingleEvent$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<InterfaceC36952a> singleEventFlow = this.this$0.m42634w().getSingleEventFlow();
            C19273a c19273a = new C19273a(this.this$0, this.$singleIntentHandler);
            this.label = 1;
            if (singleEventFlow.collect(c19273a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
