package com.kubi.quotefacade.widgets.calendar;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: HomeCalendarRepo.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.calendar.HomeCalendarRepo", m90122f = "HomeCalendarRepo.kt", m90123i = {0, 0}, m90124l = {26}, m90125m = "getEventList", m90126n = {"startSecond", "endSecond"}, m90127s = {"J$0", "J$1"})
public final class HomeCalendarRepo$getEventList$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeCalendarRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeCalendarRepo$getEventList$1(HomeCalendarRepo homeCalendarRepo, Continuation<? super HomeCalendarRepo$getEventList$1> continuation) {
        super(continuation);
        this.this$0 = homeCalendarRepo;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m53382d(0L, 0L, this);
    }
}
