package com.kubi.sdk.mode.config;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: LiteConfigManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.mode.config.LiteConfigManager", m90122f = "LiteConfigManager.kt", m90123i = {0, 0}, m90124l = {31}, m90125m = "fetchLiteConfig-IoAF18A", m90126n = {"$this$fetchLiteConfig_IoAF18A_u24lambda_u242", "$i$a$-runCatching-LiteConfigManager$fetchLiteConfig$2"}, m90127s = {"L$0", "I$0"})
public final class LiteConfigManager$fetchLiteConfig$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LiteConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiteConfigManager$fetchLiteConfig$1(LiteConfigManager liteConfigManager, Continuation<? super LiteConfigManager$fetchLiteConfig$1> continuation) {
        super(continuation);
        this.this$0 = liteConfigManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM57259c = this.this$0.m57259c(this);
        return objM57259c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM57259c : Result.m103843boximpl(objM57259c);
    }
}
