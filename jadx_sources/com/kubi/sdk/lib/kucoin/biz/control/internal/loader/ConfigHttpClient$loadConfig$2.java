package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: ConfigHttpClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.lib.kucoin.biz.control.internal.loader.ConfigHttpClient$loadConfig$2", m90122f = "ConfigHttpClient.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ConfigHttpClient$loadConfig$2 extends SuspendLambda implements Function2<BizResponseEntity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public ConfigHttpClient$loadConfig$2(Continuation<? super ConfigHttpClient$loadConfig$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull BizResponseEntity bizResponseEntity, @Nullable Continuation<? super Unit> continuation) {
        return ((ConfigHttpClient$loadConfig$2) create(bizResponseEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ConfigHttpClient$loadConfig$2 configHttpClient$loadConfig$2 = new ConfigHttpClient$loadConfig$2(continuation);
        configHttpClient$loadConfig$2.L$0 = obj;
        return configHttpClient$loadConfig$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            C44128b.m97259c("BizControl::ConfigHttpClient", "fetchConfig success " + ((BizResponseEntity) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
