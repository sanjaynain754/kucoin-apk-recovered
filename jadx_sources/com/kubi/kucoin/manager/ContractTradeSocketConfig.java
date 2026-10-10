package com.kubi.kucoin.manager;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p830zf.InterfaceC46817p0;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kucoin.manager.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ContractTradeSocketConfig.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kucoin/manager/ContractTradeSocketConfig;", "", "<init>", "()V", "ENABLE_SOCKET_PROTOBUF_SPOT_FUTURES_V1", "", "isProtobufEnabled", "", "defaultPbV1OpenEnable", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nContractTradeSocketConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContractTradeSocketConfig.kt\ncom/kubi/kucoin/manager/ContractTradeSocketConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 ContractTradeSocketConfig.kt\ncom/kubi/kucoin/manager/ContractTradeSocketConfigKt\n*L\n1#1,25:1\n35#2,4:26\n39#2:32\n44#3,2:30\n22#4,2:33\n*S KotlinDebug\n*F\n+ 1 ContractTradeSocketConfig.kt\ncom/kubi/kucoin/manager/ContractTradeSocketConfig\n*L\n12#1:26,4\n12#1:32\n12#1:30,2\n18#1:33,2\n*E\n"})
public final class ContractTradeSocketConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ContractTradeSocketConfig f28114a = new ContractTradeSocketConfig();

    /* JADX INFO: renamed from: b */
    public static final boolean f28115b;

    /* JADX INFO: renamed from: com.kubi.kucoin.manager.a$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    static {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46817p0.class, SiteInfoManager.f47913a.m58109c());
        f28115b = objM56186h != null ? ((InterfaceC46817p0) objM56186h).mo102971a() : false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m32566a() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("enable_socket_protobuf_spot_futures_v1", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return Intrinsics.areEqual(objM20457a, Boolean.TRUE) && f28115b;
    }
}
