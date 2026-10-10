package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.lib.kucoin.bizcontrol.api.BizControlConfigState;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p276fz.C37733a;
import p276fz.C37734b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.HttpException;
import ro.C44128b;

/* JADX INFO: compiled from: ConfigHttpClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient;", "", "<init>", "()V", "", "isBlock", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;", "b", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/b;", "kotlin.jvm.PlatformType", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/Lazy;", "c", "()Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/b;", "api", "Companion", "biz-control-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConfigHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigHttpClient.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n27#2:74\n28#2:76\n1#3:75\n*S KotlinDebug\n*F\n+ 1 ConfigHttpClient.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient\n*L\n49#1:74\n49#1:76\n49#1:75\n*E\n"})
public final class ConfigHttpClient {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy api = LazyKt.lazy(new Function0<InterfaceC23858b>() { // from class: com.kubi.sdk.lib.kucoin.biz.control.internal.loader.ConfigHttpClient$api$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        public final InterfaceC23858b invoke() {
            return (InterfaceC23858b) C42597a.m93387c().create(InterfaceC23858b.class);
        }
    });

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m57087b(boolean z11, @NotNull Continuation<? super BizResponseEntity> continuation) {
        ConfigHttpClient$fetchConfig$1 configHttpClient$fetchConfig$1;
        if (continuation instanceof ConfigHttpClient$fetchConfig$1) {
            configHttpClient$fetchConfig$1 = (ConfigHttpClient$fetchConfig$1) continuation;
            int i11 = configHttpClient$fetchConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                configHttpClient$fetchConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                configHttpClient$fetchConfig$1 = new ConfigHttpClient$fetchConfig$1(this, continuation);
            }
        } else {
            configHttpClient$fetchConfig$1 = new ConfigHttpClient$fetchConfig$1(this, continuation);
        }
        Object objM90468c = configHttpClient$fetchConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = configHttpClient$fetchConfig$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM90468c);
                long loadTimeLimit = C23859c.f46906a.m57102a().getLoadTimeLimit();
                ConfigHttpClient$fetchConfig$2 configHttpClient$fetchConfig$2 = new ConfigHttpClient$fetchConfig$2(this, z11, null);
                configHttpClient$fetchConfig$1.Z$0 = z11;
                configHttpClient$fetchConfig$1.label = 1;
                objM90468c = TimeoutKt.m90468c(loadTimeLimit, configHttpClient$fetchConfig$2, configHttpClient$fetchConfig$1);
                if (objM90468c == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = configHttpClient$fetchConfig$1.Z$0;
                ResultKt.throwOnFailure(objM90468c);
            }
            return (BizResponseEntity) objM90468c;
        } catch (Exception e11) {
            C37734b c37734b = C37734b.f85015a;
            c37734b.m85049e(2);
            if (z11) {
                C23861e.f46911a.m57111e(BizControlConfigState.FAILED);
            }
            C44128b.m97270n("BizControl::ConfigHttpClient", "fetchConfig: timeout " + e11);
            c37734b.m85046a("timeout");
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC23858b m57088c() {
        return (InterfaceC23858b) this.api.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m57089d(boolean z11, Continuation<? super BizResponseEntity> continuation) {
        ConfigHttpClient$loadConfig$1 configHttpClient$loadConfig$1;
        ConfigHttpClient configHttpClient;
        C19334f c19334f;
        ConfigHttpClient configHttpClient2;
        C19334f c19334f2;
        if (continuation instanceof ConfigHttpClient$loadConfig$1) {
            configHttpClient$loadConfig$1 = (ConfigHttpClient$loadConfig$1) continuation;
            int i11 = configHttpClient$loadConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                configHttpClient$loadConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                configHttpClient$loadConfig$1 = new ConfigHttpClient$loadConfig$1(this, continuation);
            }
        } else {
            configHttpClient$loadConfig$1 = new ConfigHttpClient$loadConfig$1(this, continuation);
        }
        Object objM42823d = configHttpClient$loadConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = configHttpClient$loadConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            InterfaceC41634e<BizResponseEntity> interfaceC41634eM57101a = m57088c().m57101a();
            ConfigHttpClient$loadConfig$2 configHttpClient$loadConfig$2 = new ConfigHttpClient$loadConfig$2(null);
            configHttpClient$loadConfig$1.L$0 = this;
            configHttpClient$loadConfig$1.Z$0 = z11;
            configHttpClient$loadConfig$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM57101a, false, configHttpClient$loadConfig$2, configHttpClient$loadConfig$1);
            if (objM42823d != coroutine_suspended) {
                configHttpClient = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            z11 = configHttpClient$loadConfig$1.Z$0;
            configHttpClient = (ConfigHttpClient) configHttpClient$loadConfig$1.L$0;
            ResultKt.throwOnFailure(objM42823d);
        } else {
            if (i12 == 2) {
                z11 = configHttpClient$loadConfig$1.Z$0;
                C19334f c19334f3 = (C19334f) configHttpClient$loadConfig$1.L$1;
                configHttpClient2 = (ConfigHttpClient) configHttpClient$loadConfig$1.L$0;
                ResultKt.throwOnFailure(objM42823d);
                c19334f = c19334f3;
                configHttpClient$loadConfig$1.L$0 = c19334f;
                configHttpClient$loadConfig$1.L$1 = null;
                configHttpClient$loadConfig$1.label = 3;
                if (configHttpClient2.m57087b(z11, configHttpClient$loadConfig$1) != coroutine_suspended) {
                    c19334f2 = c19334f;
                }
                return coroutine_suspended;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c19334f2 = (C19334f) configHttpClient$loadConfig$1.L$0;
            ResultKt.throwOnFailure(objM42823d);
        }
        c19334f = c19334f2;
        return RetrofitFlowExKt.m42829j(c19334f);
        c19334f = (C19334f) objM42823d;
        Throwable throwable = c19334f.getThrowable();
        if (throwable != null) {
            C37733a.m85043a(throwable, "fetchConfig failed", "BizControl::ConfigHttpClient");
            C37734b c37734b = C37734b.f85015a;
            c37734b.m85046a("fetch_failed");
            C44128b.m97270n("BizControl::ConfigHttpClient", "fetchConfig: failed " + throwable);
            if (((throwable instanceof HttpException) && ((HttpException) throwable).code() == 429) || ((throwable instanceof ApiException) && Intrinsics.areEqual(((ApiException) throwable).code, "429"))) {
                configHttpClient$loadConfig$1.L$0 = configHttpClient;
                configHttpClient$loadConfig$1.L$1 = c19334f;
                configHttpClient$loadConfig$1.Z$0 = z11;
                configHttpClient$loadConfig$1.label = 2;
                if (DelayKt.m90350b(500L, configHttpClient$loadConfig$1) != coroutine_suspended) {
                    configHttpClient2 = configHttpClient;
                    configHttpClient$loadConfig$1.L$0 = c19334f;
                    configHttpClient$loadConfig$1.L$1 = null;
                    configHttpClient$loadConfig$1.label = 3;
                    if (configHttpClient2.m57087b(z11, configHttpClient$loadConfig$1) != coroutine_suspended) {
                        c19334f2 = c19334f;
                        c19334f = c19334f2;
                    }
                }
                return coroutine_suspended;
            }
            if (z11) {
                C23861e.f46911a.m57111e(BizControlConfigState.FAILED);
            }
            c37734b.m85049e(1);
        }
        return RetrofitFlowExKt.m42829j(c19334f);
    }
}
