package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.lib.kucoin.biz.control.internal.loader.c */
/* JADX INFO: compiled from: BizControlRemoteConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/c;", "", "<init>", "()V", "", "b", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;", "setRemoteConfig", "(Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;)V", "remoteConfig", "biz-control-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBizControlRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizControlRemoteConfig.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizControlRemoteConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n*L\n1#1,33:1\n33#2:34\n*S KotlinDebug\n*F\n+ 1 BizControlRemoteConfig.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizControlRemoteConfig\n*L\n19#1:34\n*E\n"})
public final class C23859c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23859c f46906a = new C23859c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static BizControlRemoteConfigEntity remoteConfig = new BizControlRemoteConfigEntity(false, 0, 0, 7, null);

    /* JADX INFO: renamed from: com.kubi.sdk.lib.kucoin.biz.control.internal.loader.c$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/lib/kucoin/biz/control/internal/loader/c$a", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,101:1\n*E\n"})
    public static final class a extends TypeToken<BizControlRemoteConfigEntity> {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final BizControlRemoteConfigEntity m57102a() {
        return remoteConfig;
    }

    /* JADX INFO: renamed from: b */
    public final void m57103b() {
        try {
            Result.Companion companion = Result.INSTANCE;
            RemoteConfig remoteConfig2 = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            BizControlRemoteConfigEntity bizControlRemoteConfigEntity = (BizControlRemoteConfigEntity) RemoteConfig.m20457a("android_biz_control", type);
            if (bizControlRemoteConfigEntity == null) {
                bizControlRemoteConfigEntity = new BizControlRemoteConfigEntity(false, 0L, 0L, 7, null);
            }
            remoteConfig = bizControlRemoteConfigEntity;
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        C44128b.m97259c("BizControl::BizControlRemoteConfig", "initSDK: remoteConfig=" + remoteConfig);
    }
}
