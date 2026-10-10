package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import kotlinx.coroutines.InterfaceC41709m0;
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

/* JADX INFO: compiled from: ConfigHttpClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.lib.kucoin.biz.control.internal.loader.ConfigHttpClient$fetchConfig$2", m90122f = "ConfigHttpClient.kt", m90123i = {}, m90124l = {31}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ConfigHttpClient$fetchConfig$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BizResponseEntity>, Object> {
    final /* synthetic */ boolean $isBlock;
    int label;
    final /* synthetic */ ConfigHttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigHttpClient$fetchConfig$2(ConfigHttpClient configHttpClient, boolean z11, Continuation<? super ConfigHttpClient$fetchConfig$2> continuation) {
        super(2, continuation);
        this.this$0 = configHttpClient;
        this.$isBlock = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ConfigHttpClient$fetchConfig$2(this.this$0, this.$isBlock, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super BizResponseEntity> continuation) {
        return ((ConfigHttpClient$fetchConfig$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ConfigHttpClient configHttpClient = this.this$0;
        boolean z11 = this.$isBlock;
        this.label = 1;
        Object objM57089d = configHttpClient.m57089d(z11, this);
        if (objM57089d == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM57089d;
    }
}
