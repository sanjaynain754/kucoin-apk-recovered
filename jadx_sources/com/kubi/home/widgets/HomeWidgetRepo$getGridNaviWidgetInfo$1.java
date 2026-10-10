package com.kubi.home.widgets;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: HomeWidgetRepo.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.widgets.HomeWidgetRepo", m90122f = "HomeWidgetRepo.kt", m90123i = {0}, m90124l = {64}, m90125m = "getGridNaviWidgetInfo", m90126n = {"cacheTime"}, m90127s = {"L$0"})
public final class HomeWidgetRepo$getGridNaviWidgetInfo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeWidgetRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeWidgetRepo$getGridNaviWidgetInfo$1(HomeWidgetRepo homeWidgetRepo, Continuation<? super HomeWidgetRepo$getGridNaviWidgetInfo$1> continuation) {
        super(continuation);
        this.this$0 = homeWidgetRepo;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m31074h(null, this);
    }
}
