package com.kubi.tradingbotkit.widget;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RobotWidgetRepository.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.widget.RobotWidgetRepository", m90122f = "RobotWidgetRepository.kt", m90123i = {}, m90124l = {24}, m90125m = "fetchRobotWidgetData", m90126n = {}, m90127s = {})
public final class RobotWidgetRepository$fetchRobotWidgetData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RobotWidgetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotWidgetRepository$fetchRobotWidgetData$1(RobotWidgetRepository robotWidgetRepository, Continuation<? super RobotWidgetRepository$fetchRobotWidgetData$1> continuation) {
        super(continuation);
        this.this$0 = robotWidgetRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m64353c(this);
    }
}
