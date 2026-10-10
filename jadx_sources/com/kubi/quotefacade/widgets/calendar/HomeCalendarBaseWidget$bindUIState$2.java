package com.kubi.quotefacade.widgets.calendar;

import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventEntity;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: HomeCalendarBaseWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.calendar.HomeCalendarBaseWidget$bindUIState$2", m90122f = "HomeCalendarBaseWidget.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class HomeCalendarBaseWidget$bindUIState$2 extends SuspendLambda implements Function2<List<? extends HomeCalendarEventEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeCalendarBaseWidget this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends HomeCalendarEventEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<HomeCalendarEventEntity>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeCalendarBaseWidget$bindUIState$2(HomeCalendarBaseWidget homeCalendarBaseWidget, Continuation<? super HomeCalendarBaseWidget$bindUIState$2> continuation) {
        super(2, continuation);
        this.this$0 = homeCalendarBaseWidget;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeCalendarBaseWidget$bindUIState$2 homeCalendarBaseWidget$bindUIState$2 = new HomeCalendarBaseWidget$bindUIState$2(this.this$0, continuation);
        homeCalendarBaseWidget$bindUIState$2.L$0 = obj;
        return homeCalendarBaseWidget$bindUIState$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<HomeCalendarEventEntity> list, Continuation<? super Unit> continuation) {
        return ((HomeCalendarBaseWidget$bindUIState$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<HomeCalendarEventEntity> list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (list == null) {
            return Unit.INSTANCE;
        }
        this.this$0.onEventDataUpdate(list);
        return Unit.INSTANCE;
    }
}
