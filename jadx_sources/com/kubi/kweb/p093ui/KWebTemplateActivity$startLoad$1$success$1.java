package com.kubi.kweb.p093ui;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: KWebTemplateActivity.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kweb.ui.KWebTemplateActivity$startLoad$1$success$1", m90122f = "KWebTemplateActivity.kt", m90123i = {}, m90124l = {54}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KWebTemplateActivity$startLoad$1$success$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ KWebTemplateActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWebTemplateActivity$startLoad$1$success$1(KWebTemplateActivity kWebTemplateActivity, String str, Continuation<? super KWebTemplateActivity$startLoad$1$success$1> continuation) {
        super(1, continuation);
        this.this$0 = kWebTemplateActivity;
        this.$path = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new KWebTemplateActivity$startLoad$1$success$1(this.this$0, this.$path, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((KWebTemplateActivity$startLoad$1$success$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        KWebTemplateActivity kWebTemplateActivity = this.this$0;
        String str = this.$path;
        this.label = 1;
        Object objM36753X0 = kWebTemplateActivity.m36753X0(str, this);
        if (objM36753X0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM36753X0;
    }
}
