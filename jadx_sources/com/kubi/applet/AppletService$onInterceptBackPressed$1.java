package com.kubi.applet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AppletService.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.applet.AppletService", m90122f = "AppletService.kt", m90123i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m90124l = {329, 346, 367}, m90125m = "onInterceptBackPressed", m90126n = {"url", "shortcutId", "url", "shortcutId", "allNavigations", "lastMatch", "isRuleMatching", "url", "shortcutId", "allNavigations", "navigationItem", "isRuleMatching"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
public final class AppletService$onInterceptBackPressed$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppletService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppletService$onInterceptBackPressed$1(AppletService appletService, Continuation<? super AppletService$onInterceptBackPressed$1> continuation) {
        super(continuation);
        this.this$0 = appletService;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m15059A(null, null, this);
    }
}
