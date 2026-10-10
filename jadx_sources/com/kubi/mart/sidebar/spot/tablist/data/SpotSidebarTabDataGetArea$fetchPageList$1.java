package com.kubi.mart.sidebar.spot.tablist.data;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SpotSidebarTabDataGetArea.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.tablist.data.SpotSidebarTabDataGetArea", m90122f = "SpotSidebarTabDataGetArea.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m90124l = {48, 53}, m90125m = "fetchPageList", m90126n = {"dataList", "dynamicMenuKeyword", "pageNum", "pageSize", "dataList", "dynamicMenuKeyword", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "pageNum", "pageSize", "currentPage"}, m90127s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2"})
public final class SpotSidebarTabDataGetArea$fetchPageList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SpotSidebarTabDataGetArea this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotSidebarTabDataGetArea$fetchPageList$1(SpotSidebarTabDataGetArea spotSidebarTabDataGetArea, Continuation<? super SpotSidebarTabDataGetArea$fetchPageList$1> continuation) {
        super(continuation);
        this.this$0 = spotSidebarTabDataGetArea;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m41611c(null, 0, 0, this);
    }
}
