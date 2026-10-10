package com.kubi.home.widgets.grid;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: GridNavigationWidgetVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.widgets.grid.GridNavigationWidgetVM", m90122f = "GridNavigationWidgetVM.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 1, 1}, m90124l = {47, 58}, m90125m = "loadData", m90126n = {"cacheTime", "forceRefresh", "startTime", "cacheTime", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "iconResponse", "showList", "forceRefresh", "startTime"}, m90127s = {"L$0", "Z$0", "J$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "J$0"})
public final class GridNavigationWidgetVM$loadData$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GridNavigationWidgetVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridNavigationWidgetVM$loadData$1(GridNavigationWidgetVM gridNavigationWidgetVM, Continuation<? super GridNavigationWidgetVM$loadData$1> continuation) {
        super(continuation);
        this.this$0 = gridNavigationWidgetVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m31199o(false, this);
    }
}
