package com.kubi.widget.web.startup;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [WhitePage] */
/* JADX INFO: compiled from: KWebParallelPrepareRunner.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lkotlin/Result;", "WhitePage", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.startup.KWebParallelPrepareRunner$run$1$1$whitePage$1", m90122f = "KWebParallelPrepareRunner.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KWebParallelPrepareRunner$run$1$1$whitePage$1<WhitePage> extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Result<? extends WhitePage>>, Object> {
    final /* synthetic */ Function0<WhitePage> $prepareWhitePage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KWebParallelPrepareRunner$run$1$1$whitePage$1(Function0<? extends WhitePage> function0, Continuation<? super KWebParallelPrepareRunner$run$1$1$whitePage$1> continuation) {
        super(2, continuation);
        this.$prepareWhitePage = function0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KWebParallelPrepareRunner$run$1$1$whitePage$1(this.$prepareWhitePage, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Result<? extends WhitePage>> continuation) {
        return ((KWebParallelPrepareRunner$run$1$1$whitePage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Function0<WhitePage> function0 = this.$prepareWhitePage;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(function0.invoke());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            return Result.m103843boximpl(objM103844constructorimpl);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
