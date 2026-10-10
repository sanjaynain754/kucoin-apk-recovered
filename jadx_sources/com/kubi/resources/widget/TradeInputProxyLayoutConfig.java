package com.kubi.resources.widget;

import com.google.gson.reflect.TypeToken;
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

/* JADX INFO: renamed from: com.kubi.resources.widget.b3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeInputLayoutProxyUtils.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006¨\u0006\t"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeInputProxyLayoutConfig;", "", "<init>", "()V", "isNewBranchStyle", "", "()Z", "isNewBranchStyle$delegate", "Lkotlin/Lazy;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeInputLayoutProxyUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeInputLayoutProxyUtils.kt\ncom/kubi/resources/widget/TradeInputProxyLayoutConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,58:1\n35#2,4:59\n39#2:65\n44#3,2:63\n*S KotlinDebug\n*F\n+ 1 TradeInputLayoutProxyUtils.kt\ncom/kubi/resources/widget/TradeInputProxyLayoutConfig\n*L\n55#1:59,4\n55#1:65\n55#1:63,2\n*E\n"})
public final class TradeInputProxyLayoutConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TradeInputProxyLayoutConfig f44243a = new TradeInputProxyLayoutConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f44244b = LazyKt.lazy(new Function0() { // from class: com.kubi.resources.widget.a3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(TradeInputProxyLayoutConfig.m54945c());
        }
    });

    /* JADX INFO: renamed from: com.kubi.resources.widget.b3$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m54945c() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("trade_input_stepper_using_newversion", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m54946b() {
        return ((Boolean) f44244b.getValue()).booleanValue();
    }
}
