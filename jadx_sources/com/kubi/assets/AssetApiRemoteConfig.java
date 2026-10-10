package com.kubi.assets;

import com.google.gson.reflect.TypeToken;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetApiRemoteConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/AssetApiRemoteConfig;", "", "<init>", "()V", "costEnable", "", "getCostEnable", "()Z", "costEnable$delegate", "Lkotlin/Lazy;", "isCostEnable", "isCostEditEnable", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetApiRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetApiRemoteConfig.kt\ncom/kubi/assets/AssetApiRemoteConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,30:1\n35#2,4:31\n39#2:37\n44#3,2:35\n*S KotlinDebug\n*F\n+ 1 AssetApiRemoteConfig.kt\ncom/kubi/assets/AssetApiRemoteConfig\n*L\n15#1:31,4\n15#1:37\n15#1:35,2\n*E\n"})
public final class AssetApiRemoteConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetApiRemoteConfig f17838a = new AssetApiRemoteConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f17839b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(AssetApiRemoteConfig.m17473b());
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.k$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m17473b() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_all_cost_price", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17474c() {
        return ((Boolean) f17839b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17475d() {
        if (m17476e() && IAssetsCenterService.f16464a.get().mo15335E()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m17476e() {
        return m17474c();
    }
}
