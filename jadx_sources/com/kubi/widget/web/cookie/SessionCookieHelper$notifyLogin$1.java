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
@DebugMetadata(m90121c = "com.kubi.widget.web.cookie.SessionCookieHelper", m90122f = "SessionCookieHelper.kt", m90123i = {}, m90124l = {198}, m90125m = "notifyLogin", m90126n = {}, m90127s = {})
public final class SessionCookieHelper$notifyLogin$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionCookieHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCookieHelper$notifyLogin$1(SessionCookieHelper sessionCookieHelper, Continuation<? super SessionCookieHelper$notifyLogin$1> continuation) {
        super(continuation);
        this.this$0 = sessionCookieHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m67129t(this);
    }
}
