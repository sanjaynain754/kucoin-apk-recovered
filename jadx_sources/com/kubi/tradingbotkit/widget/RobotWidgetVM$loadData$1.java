package com.kubi.tradingbotkit.widget;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RobotWidgetVM.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.widget.RobotWidgetVM", m90122f = "RobotWidgetVM.kt", m90123i = {0, 1, 1}, m90124l = {32, 39}, m90125m = "loadData", m90126n = {"forceRefresh", "forceRefresh", "startTime"}, m90127s = {"Z$0", "Z$0", "J$0"})
public final class RobotWidgetVM$loadData$1 extends ContinuationImpl {
    long J$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RobotWidgetVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotWidgetVM$loadData$1(RobotWidgetVM robotWidgetVM, Continuation<? super RobotWidgetVM$loadData$1> continuation) {
        super(continuation);
        this.this$0 = robotWidgetVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m64359o(false, this);
    }
}
