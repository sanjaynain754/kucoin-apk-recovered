package com.kubi.route.config;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RouteConfigManager.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.route.config.RouteConfigManager", m90122f = "RouteConfigManager.kt", m90123i = {0, 0}, m90124l = {45}, m90125m = "fetchConfig", m90126n = {"context", "versionName"}, m90127s = {"L$0", "L$1"})
public final class RouteConfigManager$fetchConfig$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RouteConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteConfigManager$fetchConfig$1(RouteConfigManager routeConfigManager, Continuation<? super RouteConfigManager$fetchConfig$1> continuation) {
        super(continuation);
        this.this$0 = routeConfigManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m56157a(null, null, this);
    }
}
