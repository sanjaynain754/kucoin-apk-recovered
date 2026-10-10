package com.kubi.mart.sidebar.spot.tablist;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SpotSidebarTabVM.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabVM", m90122f = "SpotSidebarTabVM.kt", m90123i = {0, 0, 0}, m90124l = {73}, m90125m = "fetchTabList", m90126n = {"sidebarType", "symbolCode", "menuModel"}, m90127s = {"L$0", "L$1", "L$2"})
public final class SpotSidebarTabVM$fetchTabList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SpotSidebarTabVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotSidebarTabVM$fetchTabList$1(SpotSidebarTabVM spotSidebarTabVM, Continuation<? super SpotSidebarTabVM$fetchTabList$1> continuation) {
        super(continuation);
        this.this$0 = spotSidebarTabVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m41598q(null, null, null, this);
    }
}
