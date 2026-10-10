package com.kubi.route.config;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.route.config.client.LocalConfigClient;
import com.kubi.route.config.client.RemoteConfigClient;
import com.kubi.route.config.model.RouteConfigEntry;
import com.kubi.route.config.model.RouteEntry;
import com.kubi.route.config.model.RouteTechStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: RouteConfigManager.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/route/config/RouteConfigManager;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "d", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "versionName", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "externalUrl", "Lcom/kubi/route/config/model/RouteEntry;", "e", "(Ljava/lang/String;)Lcom/kubi/route/config/model/RouteEntry;", "Lcom/kubi/route/config/model/RouteTechStack;", "c", "(Ljava/lang/String;)Lcom/kubi/route/config/model/RouteTechStack;", "Lcom/kubi/route/config/client/LocalConfigClient;", "b", "Lcom/kubi/route/config/client/LocalConfigClient;", "localClient", "Lcom/kubi/route/config/client/RemoteConfigClient;", "Lcom/kubi/route/config/client/RemoteConfigClient;", "remoteClient", "Ly70/g;", "()Ly70/g;", "APP_VERSION_NAME", "route-config_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteConfigManager.kt\ncom/kubi/route/config/RouteConfigManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,69:1\n32#2:70\n32#2:71\n32#2:72\n23#2,2:73\n*S KotlinDebug\n*F\n+ 1 RouteConfigManager.kt\ncom/kubi/route/config/RouteConfigManager\n*L\n37#1:70\n40#1:71\n48#1:72\n49#1:73,2\n*E\n"})
public final class RouteConfigManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RouteConfigManager f46179a = new RouteConfigManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static LocalConfigClient localClient = new LocalConfigClient();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static RemoteConfigClient remoteClient = new RemoteConfigClient();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m56157a(@NotNull Context context, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        RouteConfigManager$fetchConfig$1 routeConfigManager$fetchConfig$1;
        RouteConfigEntry config;
        String version;
        if (continuation instanceof RouteConfigManager$fetchConfig$1) {
            routeConfigManager$fetchConfig$1 = (RouteConfigManager$fetchConfig$1) continuation;
            int i11 = routeConfigManager$fetchConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                routeConfigManager$fetchConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                routeConfigManager$fetchConfig$1 = new RouteConfigManager$fetchConfig$1(this, continuation);
            }
        } else {
            routeConfigManager$fetchConfig$1 = new RouteConfigManager$fetchConfig$1(this, continuation);
        }
        Object objM56175a = routeConfigManager$fetchConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = routeConfigManager$fetchConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM56175a);
            C44128b.m97266j("RouteConfigManager", "APP_VERSION_NAME = " + C46392a.m102326h(m56158b(), "") + ", versionName=" + str);
            String str2 = "0";
            if (Intrinsics.areEqual(str, C46392a.m102326h(m56158b(), "")) && (config = localClient.getConfig()) != null && (version = config.getVersion()) != null) {
                str2 = version;
            }
            RemoteConfigClient remoteConfigClient = remoteClient;
            routeConfigManager$fetchConfig$1.L$0 = context;
            routeConfigManager$fetchConfig$1.L$1 = str;
            routeConfigManager$fetchConfig$1.label = 1;
            objM56175a = remoteConfigClient.m56175a(str2, routeConfigManager$fetchConfig$1);
            if (objM56175a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) routeConfigManager$fetchConfig$1.L$1;
            context = (Context) routeConfigManager$fetchConfig$1.L$0;
            ResultKt.throwOnFailure(objM56175a);
        }
        RouteConfigEntry routeConfigEntry = (RouteConfigEntry) objM56175a;
        if (routeConfigEntry != null) {
            RouteConfigManager routeConfigManager = f46179a;
            if (!Intrinsics.areEqual(str, C46392a.m102326h(routeConfigManager.m56158b(), ""))) {
                C46392a.m102333p(routeConfigManager.m56158b(), str);
            }
            localClient.m56173i(context, routeConfigEntry);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final StorageId<String> m56158b() {
        return new StorageId<>("route_config_remote", "APP_VERSION_NAME", null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final RouteTechStack m56159c(@NotNull String externalUrl) {
        RouteTechStack routeTechStackM56163b;
        Intrinsics.checkNotNullParameter(externalUrl, "externalUrl");
        RouteEntry routeEntryM56161e = m56161e(externalUrl);
        return (routeEntryM56161e == null || (routeTechStackM56163b = C23629a.m56163b(routeEntryM56161e)) == null) ? C23629a.m56164c(externalUrl) : routeTechStackM56163b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m56160d(@NotNull Context context, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objM56169e = localClient.m56169e(context, continuation);
        return objM56169e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM56169e : Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final RouteEntry m56161e(@NotNull String externalUrl) {
        Intrinsics.checkNotNullParameter(externalUrl, "externalUrl");
        return localClient.m56172h(externalUrl);
    }
}
