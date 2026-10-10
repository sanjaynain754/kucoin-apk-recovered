package com.kubi.mart.sidebar.spot;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SpotSidebarVM.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.SpotSidebarVM", m90122f = "SpotSidebarVM.kt", m90123i = {0, 0}, m90124l = {80}, m90125m = FirebaseAnalytics.Event.SEARCH, m90126n = {"sidebarType", "keyWord"}, m90127s = {"L$0", "L$1"})
public final class SpotSidebarVM$search$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SpotSidebarVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotSidebarVM$search$1(SpotSidebarVM spotSidebarVM, Continuation<? super SpotSidebarVM$search$1> continuation) {
        super(continuation);
        this.this$0 = spotSidebarVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m41442p(null, null, this);
    }
}
