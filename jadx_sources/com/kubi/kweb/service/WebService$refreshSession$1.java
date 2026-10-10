package com.kubi.kweb.service;

import com.kubi.widget.web.service.IKWebService;
import io.reactivex.functions.BiConsumer;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: WebService.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kweb.service.WebService$refreshSession$1", m90122f = "WebService.kt", m90123i = {}, m90124l = {28}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WebService$refreshSession$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BiConsumer<Boolean, String> $callback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebService$refreshSession$1(BiConsumer<Boolean, String> biConsumer, Continuation<? super WebService$refreshSession$1> continuation) {
        super(2, continuation);
        this.$callback = biConsumer;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebService$refreshSession$1(this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((WebService$refreshSession$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
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
            IKWebService iKWebService = IKWebService.f55226a.get();
            this.label = 1;
            obj = iKWebService.mo67362j(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        IKWebService.C27196a c27196a = (IKWebService.C27196a) obj;
        BiConsumer<Boolean, String> biConsumer = this.$callback;
        if (biConsumer != null) {
            biConsumer.accept(Boxing.boxBoolean(c27196a.getF55233a()), c27196a.getF55234b());
        }
        return Unit.INSTANCE;
    }
}
