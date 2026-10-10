package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.sdk.lib.kucoin.bizcontrol.api.BizControlConfigState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p276fz.C37733a;
import p276fz.C37734b;
import p569qq.C43840a;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: ConfigCacheClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000  2\u00020\u0001:\u00010B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, m90084d2 = {"Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigCacheClient;", "", "Landroid/content/Context;", "context", "", "siteType", "", "isShared", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient;", "configHttpClient", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient;)V", "key", "defaultValue", "k", "(Ljava/lang/String;Z)Z", "", "j", "()Ljava/util/Map;", "", "m", "()V", "updateMemCache", CmcdData.Factory.STREAMING_FORMAT_HLS, "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uid", "n", "(Ljava/lang/String;)V", "", CmcdData.Factory.STREAM_TYPE_LIVE, "()J", "cacheTime", "g", "(J)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Z", "d", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigHttpClient;", "e", "configFileName", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;", "f", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;", "bizConfigContainer", "Companion", "biz-control-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConfigCacheClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigCacheClient.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigCacheClient\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,160:1\n48#2,4:161\n*S KotlinDebug\n*F\n+ 1 ConfigCacheClient.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigCacheClient\n*L\n85#1:161,4\n*E\n"})
public final class ConfigCacheClient {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String siteType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean isShared;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ConfigHttpClient configHttpClient;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public String configFileName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public volatile C23857a bizConfigContainer;

    /* JADX INFO: renamed from: com.kubi.sdk.lib.kucoin.biz.control.internal.loader.ConfigCacheClient$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"com/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigCacheClient$a", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 ConfigCacheClient.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigCacheClient\n*L\n1#1,110:1\n86#2,4:111\n*E\n"})
    public static final class C23855a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            C37734b.f85015a.m85049e(1);
            C23861e.f46911a.m57111e(BizControlConfigState.FAILED);
            C37733a.m85043a(exception, "loadConfigImmediately failed", "BizControl::ConfigCacheClient");
        }

        public C23855a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    public ConfigCacheClient(@NotNull Context context, @NotNull String siteType, boolean z11, @NotNull ConfigHttpClient configHttpClient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(configHttpClient, "configHttpClient");
        this.context = context;
        this.siteType = siteType;
        this.isShared = z11;
        this.configHttpClient = configHttpClient;
        this.configFileName = "";
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m57078i(ConfigCacheClient configCacheClient, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return configCacheClient.m57080h(z11, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final Map<String, Object> m57081j() {
        try {
            C23857a c23857a = this.bizConfigContainer;
            if (c23857a == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("config", c23857a.m57095a());
            linkedHashMap.put("source", c23857a.m57097c());
            return linkedHashMap;
        } catch (Exception e11) {
            C37733a.m85043a(e11, "getBizRaw failed, config is null", "BizControl::ConfigCacheClient");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: h */
    public final Object m57080h(boolean z11, @NotNull Continuation<? super Boolean> continuation) {
        ConfigCacheClient$fetchConfig$1 configCacheClient$fetchConfig$1;
        ConfigCacheClient configCacheClient;
        if (continuation instanceof ConfigCacheClient$fetchConfig$1) {
            configCacheClient$fetchConfig$1 = (ConfigCacheClient$fetchConfig$1) continuation;
            int i11 = configCacheClient$fetchConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                configCacheClient$fetchConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                configCacheClient$fetchConfig$1 = new ConfigCacheClient$fetchConfig$1(this, continuation);
            }
        } else {
            configCacheClient$fetchConfig$1 = new ConfigCacheClient$fetchConfig$1(this, continuation);
        }
        Object objM57087b = configCacheClient$fetchConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = configCacheClient$fetchConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM57087b);
            C44128b.m97259c("BizControl::ConfigCacheClient", "loadConfigImmediately: fileName=" + this.configFileName);
            ConfigHttpClient configHttpClient = this.configHttpClient;
            configCacheClient$fetchConfig$1.L$0 = this;
            configCacheClient$fetchConfig$1.Z$0 = z11;
            configCacheClient$fetchConfig$1.label = 1;
            objM57087b = configHttpClient.m57087b(z11, configCacheClient$fetchConfig$1);
            if (objM57087b == coroutine_suspended) {
                return coroutine_suspended;
            }
            configCacheClient = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = configCacheClient$fetchConfig$1.Z$0;
            configCacheClient = (ConfigCacheClient) configCacheClient$fetchConfig$1.L$0;
            ResultKt.throwOnFailure(objM57087b);
        }
        BizResponseEntity bizResponseEntity = (BizResponseEntity) objM57087b;
        if (bizResponseEntity == null) {
            return Boxing.boxBoolean(false);
        }
        C43840a.m96551e("load BizControl config from network, key " + bizResponseEntity.getSource(), null, 2, null);
        C23857a c23857aM57099a = new C23857a.a().m57099a(bizResponseEntity);
        if (z11) {
            configCacheClient.bizConfigContainer = c23857aM57099a;
        }
        ConfigStorageClient.INSTANCE.getInstance(configCacheClient.context, configCacheClient.configFileName).m57093d(c23857aM57099a);
        C37734b.f85015a.m85049e(0);
        C23861e.f46911a.m57111e(BizControlConfigState.SUCCESS);
        return Boxing.boxBoolean(true);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m57082k(@NotNull String key, boolean defaultValue) {
        Map<String, Object> mapM57095a;
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        C23857a c23857a = this.bizConfigContainer;
        if (c23857a == null || (mapM57095a = c23857a.m57095a()) == null || (obj = mapM57095a.get(key)) == null) {
            return defaultValue;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(key + " config type error, expect Boolean, but get " + obj.getClass().getSimpleName());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(key);
        sb2.append(" config type error, expect Boolean");
        C37733a.m85043a(illegalArgumentException, sb2.toString(), "BizControl::ConfigCacheClient");
        C43847h.m96575d(KunlunTechEventEnum.BIZ_CONTROL_TYPE_ERROR, 1);
        return defaultValue;
    }

    /* JADX INFO: renamed from: l */
    public final long m57083l() {
        C23857a c23857a = this.bizConfigContainer;
        if (c23857a != null) {
            return c23857a.m57096b();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: m */
    public final void m57084m() {
        C23861e c23861e = C23861e.f46911a;
        BizControlConfigState bizControlConfigStateM57108b = c23861e.m57108b();
        BizControlConfigState bizControlConfigState = BizControlConfigState.INITIALIZING;
        if (bizControlConfigStateM57108b == bizControlConfigState) {
            return;
        }
        C37734b.f85015a.m85050f();
        c23861e.m57111e(bizControlConfigState);
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("BizControl::ConfigCacheClient").plus(C42911a.m94120b()).plus(new C23855a(CoroutineExceptionHandler.INSTANCE))), null, null, new ConfigCacheClient$loadConfig$2(this, null), 3, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m57085n(@NotNull String uid) {
        String str;
        Intrinsics.checkNotNullParameter(uid, "uid");
        if (this.isShared) {
            str = uid + "_biz_control_config.site_" + this.siteType + ".json";
        } else {
            str = uid + "_biz_control_config.json";
        }
        this.configFileName = str;
        C44128b.m97259c("BizControl::ConfigCacheClient", "loadConfigImmediately: fileName=" + this.configFileName);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m57079g(long cacheTime) {
        if (System.currentTimeMillis() - cacheTime < C23859c.f46906a.m57102a().getCacheTime() * ((long) 60) * 1000) {
            return true;
        }
        return false;
    }

    public /* synthetic */ ConfigCacheClient(Context context, String str, boolean z11, ConfigHttpClient configHttpClient, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, z11, (i11 & 8) != 0 ? new ConfigHttpClient() : configHttpClient);
    }
}
