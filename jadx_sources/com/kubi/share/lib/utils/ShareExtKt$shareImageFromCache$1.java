package com.kubi.share.lib.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: ShareExt.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.utils.ShareExtKt", m90122f = "ShareExt.kt", m90123i = {0, 0, 0}, m90124l = {292}, m90125m = "shareImageFromCache", m90126n = {"bitmap", "fileName", "context"}, m90127s = {"L$0", "L$1", "L$2"})
public final class ShareExtKt$shareImageFromCache$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ShareExtKt.m59834G(null, null, null, this);
    }

    public ShareExtKt$shareImageFromCache$1(Continuation<? super ShareExtKt$shareImageFromCache$1> continuation) {
        super(continuation);
    }
}
