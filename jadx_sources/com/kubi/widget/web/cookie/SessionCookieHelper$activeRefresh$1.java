package com.kubi.widget.web.cookie;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SessionCookieHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.cookie.SessionCookieHelper", m90122f = "SessionCookieHelper.kt", m90123i = {0, 0}, m90124l = {276}, m90125m = "activeRefresh", m90126n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, m90127s = {"L$0", "I$0"})
public final class SessionCookieHelper$activeRefresh$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionCookieHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCookieHelper$activeRefresh$1(SessionCookieHelper sessionCookieHelper, Continuation<? super SessionCookieHelper$activeRefresh$1> continuation) {
        super(continuation);
        this.this$0 = sessionCookieHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m67123m(this);
    }
}
