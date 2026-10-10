package com.kubi.operation.lib.widgets.newuser;

import com.kubi.operation.lib.entity.WidgetNewUserEntity;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: NewUserWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/operation/lib/entity/WidgetNewUserEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.widgets.newuser.NewUserWidget$bindUIState$2", m90122f = "NewUserWidget.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class NewUserWidget$bindUIState$2 extends SuspendLambda implements Function2<WidgetNewUserEntity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NewUserWidget this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(WidgetNewUserEntity widgetNewUserEntity, Continuation<? super Unit> continuation) {
        return ((NewUserWidget$bindUIState$2) create(widgetNewUserEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewUserWidget$bindUIState$2(NewUserWidget newUserWidget, Continuation<? super NewUserWidget$bindUIState$2> continuation) {
        super(2, continuation);
        this.this$0 = newUserWidget;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NewUserWidget$bindUIState$2 newUserWidget$bindUIState$2 = new NewUserWidget$bindUIState$2(this.this$0, continuation);
        newUserWidget$bindUIState$2.L$0 = obj;
        return newUserWidget$bindUIState$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WidgetNewUserEntity widgetNewUserEntity = (WidgetNewUserEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m43736A3(widgetNewUserEntity);
        return Unit.INSTANCE;
    }
}
