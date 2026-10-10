package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import com.kubi.sdk.lib.kucoin.bizcontrol.api.BizControlConfigState;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p276fz.C37734b;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ConfigCacheClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.lib.kucoin.biz.control.internal.loader.ConfigCacheClient$loadConfig$2", m90122f = "ConfigCacheClient.kt", m90123i = {}, m90124l = {97, 111, 115}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ConfigCacheClient$loadConfig$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConfigCacheClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigCacheClient$loadConfig$2(ConfigCacheClient configCacheClient, Continuation<? super ConfigCacheClient$loadConfig$2> continuation) {
        super(2, continuation);
        this.this$0 = configCacheClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ConfigCacheClient$loadConfig$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
        return ((ConfigCacheClient$loadConfig$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (com.kubi.sdk.lib.kucoin.biz.control.internal.loader.ConfigCacheClient.m57078i(r11, false, r10, 1, null) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        if (r11.m57080h(false, r10) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        if (com.kubi.sdk.lib.kucoin.biz.control.internal.loader.ConfigCacheClient.m57078i(r11, false, r10, 1, null) == r0) goto L32;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        String strM57097c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        ConfigCacheClient configCacheClient = this.this$0;
        ConfigStorageClient.Companion companion = ConfigStorageClient.INSTANCE;
        if (!configCacheClient.m57079g(companion.getInstance(configCacheClient.context, this.this$0.configFileName).m57091b())) {
            C37734b.f85015a.m85051g("remote");
            ConfigCacheClient configCacheClient2 = this.this$0;
            this.label = 1;
        } else {
            ConfigCacheClient configCacheClient3 = this.this$0;
            configCacheClient3.bizConfigContainer = companion.getInstance(configCacheClient3.context, this.this$0.configFileName).m57092c();
            if (this.this$0.bizConfigContainer != null) {
                ConfigCacheClient configCacheClient4 = this.this$0;
                if (configCacheClient4.m57079g(configCacheClient4.m57083l())) {
                    C37734b c37734b = C37734b.f85015a;
                    c37734b.m85049e(0);
                    C23861e.f46911a.m57111e(BizControlConfigState.SUCCESS);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("load BizControl config from cache, key ");
                    C23857a c23857a = this.this$0.bizConfigContainer;
                    if (c23857a != null) {
                        strM57097c = c23857a.m57097c();
                    } else {
                        strM57097c = null;
                    }
                    sb2.append(strM57097c);
                    C43840a.m96551e(sb2.toString(), null, 2, null);
                    c37734b.m85050f();
                    c37734b.m85051g("silence");
                    ConfigCacheClient configCacheClient5 = this.this$0;
                    this.label = 2;
                }
            }
            C37734b.f85015a.m85051g("remote");
            ConfigCacheClient configCacheClient6 = this.this$0;
            this.label = 3;
        }
        return coroutine_suspended;
    }
}
