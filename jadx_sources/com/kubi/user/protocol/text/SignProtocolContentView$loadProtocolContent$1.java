package com.kubi.user.protocol.text;

import com.kubi.widget.web.ui.KWebContainer;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SignProtocolContentView.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.protocol.text.SignProtocolContentView$loadProtocolContent$1", m90122f = "SignProtocolContentView.kt", m90123i = {}, m90124l = {357}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SignProtocolContentView$loadProtocolContent$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ SignProtocolContentView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignProtocolContentView$loadProtocolContent$1(SignProtocolContentView signProtocolContentView, String str, Continuation<? super SignProtocolContentView$loadProtocolContent$1> continuation) {
        super(2, continuation);
        this.this$0 = signProtocolContentView;
        this.$url = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignProtocolContentView$loadProtocolContent$1(this.this$0, this.$url, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SignProtocolContentView$loadProtocolContent$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            KWebContainer kWebContainer = this.this$0.f53756e.f5169g;
            String str = this.$url;
            this.label = 1;
            if (kWebContainer.m67478D(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
