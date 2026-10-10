package com.kubi.widget.web.cookie;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: CookieHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.cookie.CookieHelper", m90122f = "CookieHelper.kt", m90123i = {0, 0, 0, 0}, m90124l = {216}, m90125m = "waitUntilSessionCookiesVisible", m90126n = {"url", "timeoutMs", "intervalMs", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_DEADLINE}, m90127s = {"L$0", "J$0", "J$1", "J$2"})
public final class CookieHelper$waitUntilSessionCookiesVisible$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CookieHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CookieHelper$waitUntilSessionCookiesVisible$1(CookieHelper cookieHelper, Continuation<? super CookieHelper$waitUntilSessionCookiesVisible$1> continuation) {
        super(continuation);
        this.this$0 = cookieHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m67101r(null, 0L, 0L, this);
    }
}
