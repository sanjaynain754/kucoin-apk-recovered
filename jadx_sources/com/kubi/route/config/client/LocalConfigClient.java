package com.kubi.route.config.client;

import android.content.Context;
import android.util.AtomicFile;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.route.config.issue.RouteConfigMessage;
import com.kubi.route.config.model.RouteConfigEntry;
import com.kubi.route.config.model.RouteEntry;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27101y;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p677ux.C45323a;
import p677ux.C45324b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.Charsets;
import ro.C44128b;

/* JADX INFO: compiled from: LocalConfigClient.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m90084d2 = {"Lcom/kubi/route/config/client/LocalConfigClient;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "e", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/route/config/model/RouteConfigEntry;", "config", "i", "(Landroid/content/Context;Lcom/kubi/route/config/model/RouteConfigEntry;)V", "", "externalUrl", "Lcom/kubi/route/config/model/RouteEntry;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)Lcom/kubi/route/config/model/RouteEntry;", "d", "()Lcom/kubi/route/config/model/RouteConfigEntry;", "Ljava/io/File;", "file", "g", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileName", "f", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", "(Lcom/kubi/route/config/model/RouteConfigEntry;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/route/config/model/RouteConfigEntry;", "b", "Companion", "route-config_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLocalConfigClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalConfigClient.kt\ncom/kubi/route/config/client/LocalConfigClient\n+ 2 RouteConfigIssue.kt\ncom/kubi/route/config/issue/RouteConfigIssueKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,136:1\n48#2,2:137\n48#2,2:139\n48#2,2:147\n196#3,3:141\n196#3,3:144\n*S KotlinDebug\n*F\n+ 1 LocalConfigClient.kt\ncom/kubi/route/config/client/LocalConfigClient\n*L\n35#1:137,2\n49#1:139,2\n89#1:147,2\n64#1:141,3\n79#1:144,3\n*E\n"})
public final class LocalConfigClient {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public volatile RouteConfigEntry config;

    /* JADX INFO: renamed from: c */
    public final boolean m56167c(RouteConfigEntry config) {
        if (config == null) {
            C43840a.m96550d("checkConfigAvailable config is null", "RouteConfig::LocalConfigClient");
            return false;
        }
        Map<String, RouteEntry> routes = config.getRoutes();
        if (routes != null && !routes.isEmpty()) {
            return true;
        }
        C43840a.m96550d("checkConfigAvailable routes is null or empty", "RouteConfig::LocalConfigClient");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x00ad, please report this as an issue */
    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m56169e(@NotNull Context context, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        LocalConfigClient$loadConfig$1 localConfigClient$loadConfig$1;
        File fileStreamPath;
        LocalConfigClient localConfigClient;
        Object objM56171g;
        LocalConfigClient localConfigClient2;
        RouteConfigEntry routeConfigEntry;
        Context context2 = context;
        if (continuation instanceof LocalConfigClient$loadConfig$1) {
            localConfigClient$loadConfig$1 = (LocalConfigClient$loadConfig$1) continuation;
            int i11 = localConfigClient$loadConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localConfigClient$loadConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                localConfigClient$loadConfig$1 = new LocalConfigClient$loadConfig$1(this, continuation);
            }
        } else {
            localConfigClient$loadConfig$1 = new LocalConfigClient$loadConfig$1(this, continuation);
        }
        Object objM56170f = localConfigClient$loadConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = localConfigClient$loadConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM56170f);
            C44128b.m97259c("RouteConfig::LocalConfigClient", "load config start");
            fileStreamPath = context2.getFileStreamPath("route_config.json");
            if (fileStreamPath.exists()) {
                C44128b.m97266j("RouteConfig::LocalConfigClient", "load config from file: " + fileStreamPath.getAbsolutePath());
                Intrinsics.checkNotNull(fileStreamPath);
                localConfigClient$loadConfig$1.L$0 = this;
                localConfigClient$loadConfig$1.L$1 = context2;
                localConfigClient$loadConfig$1.L$2 = fileStreamPath;
                localConfigClient$loadConfig$1.label = 1;
                objM56171g = m56171g(fileStreamPath, localConfigClient$loadConfig$1);
                if (objM56171g != coroutine_suspended) {
                    localConfigClient2 = this;
                    routeConfigEntry = (RouteConfigEntry) objM56171g;
                    if (!localConfigClient2.m56167c(routeConfigEntry)) {
                        C43846g.m96568c(new RouteConfigMessage("config is invalid,config: " + routeConfigEntry, "RouteConfig::LocalConfigClient", false, 4, null), null, 2, null);
                        C44128b.m97270n("RouteConfig::LocalConfigClient", "load file config error: config is null");
                        fileStreamPath.delete();
                        localConfigClient$loadConfig$1.L$0 = localConfigClient2;
                        localConfigClient$loadConfig$1.L$1 = null;
                        localConfigClient$loadConfig$1.L$2 = null;
                        localConfigClient$loadConfig$1.label = 2;
                        objM56170f = localConfigClient2.m56170f(context2, "route_config.json", localConfigClient$loadConfig$1);
                        if (objM56170f != coroutine_suspended) {
                            localConfigClient = localConfigClient2;
                            routeConfigEntry = (RouteConfigEntry) objM56170f;
                            localConfigClient2 = localConfigClient;
                        }
                    }
                }
            } else {
                C44128b.m97266j("RouteConfig::LocalConfigClient", "load config from assets: route_config.json");
                localConfigClient$loadConfig$1.L$0 = this;
                localConfigClient$loadConfig$1.label = 3;
                objM56170f = m56170f(context2, "route_config.json", localConfigClient$loadConfig$1);
                if (objM56170f != coroutine_suspended) {
                    localConfigClient = this;
                    routeConfigEntry = (RouteConfigEntry) objM56170f;
                    localConfigClient2 = localConfigClient;
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            File file = (File) localConfigClient$loadConfig$1.L$2;
            Context context3 = (Context) localConfigClient$loadConfig$1.L$1;
            localConfigClient2 = (LocalConfigClient) localConfigClient$loadConfig$1.L$0;
            ResultKt.throwOnFailure(objM56170f);
            fileStreamPath = file;
            context2 = context3;
            objM56171g = objM56170f;
            routeConfigEntry = (RouteConfigEntry) objM56171g;
            if (!localConfigClient2.m56167c(routeConfigEntry)) {
                C43846g.m96568c(new RouteConfigMessage("config is invalid,config: " + routeConfigEntry, "RouteConfig::LocalConfigClient", false, 4, null), null, 2, null);
                C44128b.m97270n("RouteConfig::LocalConfigClient", "load file config error: config is null");
                fileStreamPath.delete();
                localConfigClient$loadConfig$1.L$0 = localConfigClient2;
                localConfigClient$loadConfig$1.L$1 = null;
                localConfigClient$loadConfig$1.L$2 = null;
                localConfigClient$loadConfig$1.label = 2;
                objM56170f = localConfigClient2.m56170f(context2, "route_config.json", localConfigClient$loadConfig$1);
                if (objM56170f != coroutine_suspended) {
                    localConfigClient = localConfigClient2;
                }
                return coroutine_suspended;
            }
        } else if (i12 == 2) {
            localConfigClient = (LocalConfigClient) localConfigClient$loadConfig$1.L$0;
            ResultKt.throwOnFailure(objM56170f);
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            localConfigClient = (LocalConfigClient) localConfigClient$loadConfig$1.L$0;
            ResultKt.throwOnFailure(objM56170f);
            routeConfigEntry = (RouteConfigEntry) objM56170f;
            localConfigClient2 = localConfigClient;
        }
        routeConfigEntry = (RouteConfigEntry) objM56170f;
        localConfigClient2 = localConfigClient;
        if (localConfigClient2.m56167c(routeConfigEntry)) {
            localConfigClient2.config = routeConfigEntry;
            C44128b.m97266j("RouteConfig::LocalConfigClient", "load config success: " + routeConfigEntry);
            return Unit.INSTANCE;
        }
        C44128b.m97270n("RouteConfig::LocalConfigClient", "load config error: config is null");
        C43846g.m96568c(new RouteConfigMessage("config is invalid,config: " + routeConfigEntry, "RouteConfig::LocalConfigClient", false, 4, null), null, 2, null);
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final RouteConfigEntry getConfig() {
        return this.config;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m56170f(Context context, String str, Continuation<? super RouteConfigEntry> continuation) {
        LocalConfigClient$loadFromAssetsFile$1 localConfigClient$loadFromAssetsFile$1;
        if (continuation instanceof LocalConfigClient$loadFromAssetsFile$1) {
            localConfigClient$loadFromAssetsFile$1 = (LocalConfigClient$loadFromAssetsFile$1) continuation;
            int i11 = localConfigClient$loadFromAssetsFile$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localConfigClient$loadFromAssetsFile$1.label = i11 - Integer.MIN_VALUE;
            } else {
                localConfigClient$loadFromAssetsFile$1 = new LocalConfigClient$loadFromAssetsFile$1(this, continuation);
            }
        } else {
            localConfigClient$loadFromAssetsFile$1 = new LocalConfigClient$loadFromAssetsFile$1(this, continuation);
        }
        Object obj = localConfigClient$loadFromAssetsFile$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = localConfigClient$loadFromAssetsFile$1.label;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            String strM66925a = C27101y.m66925a(context, str);
            if (strM66925a != null && strM66925a.length() != 0) {
                C27099x c27099x = C27099x.f54458a;
                Intrinsics.checkNotNull(strM66925a);
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new LocalConfigClient$loadFromAssetsFile$$inlined$fromJsonOrNull$1(strM66925a, null)), C42911a.m94120b());
                localConfigClient$loadFromAssetsFile$1.label = 1;
                Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, localConfigClient$loadFromAssetsFile$1);
                return objM90914f0 == coroutine_suspended ? coroutine_suspended : objM90914f0;
            }
            C44128b.m97270n("RouteConfig::LocalConfigClient", "load config error: configString is null");
            return null;
        } catch (Exception e11) {
            C44128b.m97261e("RouteConfig::LocalConfigClient", "load config from assets error: " + e11.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m56171g(File file, Continuation<? super RouteConfigEntry> continuation) throws Throwable {
        LocalConfigClient$loadFromCacheFile$1 localConfigClient$loadFromCacheFile$1;
        if (continuation instanceof LocalConfigClient$loadFromCacheFile$1) {
            localConfigClient$loadFromCacheFile$1 = (LocalConfigClient$loadFromCacheFile$1) continuation;
            int i11 = localConfigClient$loadFromCacheFile$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localConfigClient$loadFromCacheFile$1.label = i11 - Integer.MIN_VALUE;
            } else {
                localConfigClient$loadFromCacheFile$1 = new LocalConfigClient$loadFromCacheFile$1(this, continuation);
            }
        } else {
            localConfigClient$loadFromCacheFile$1 = new LocalConfigClient$loadFromCacheFile$1(this, continuation);
        }
        Object obj = localConfigClient$loadFromCacheFile$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = localConfigClient$loadFromCacheFile$1.label;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            String strM66927c = C27101y.m66927c(file.getAbsolutePath());
            if (strM66927c != null && strM66927c.length() != 0) {
                C27099x c27099x = C27099x.f54458a;
                Intrinsics.checkNotNull(strM66927c);
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new LocalConfigClient$loadFromCacheFile$$inlined$fromJsonOrNull$1(strM66927c, null)), C42911a.m94120b());
                localConfigClient$loadFromCacheFile$1.label = 1;
                Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, localConfigClient$loadFromCacheFile$1);
                return objM90914f0 == coroutine_suspended ? coroutine_suspended : objM90914f0;
            }
            C44128b.m97270n("RouteConfig::LocalConfigClient", "load config error: configString is null");
            return null;
        } catch (Exception e11) {
            C44128b.m97261e("RouteConfig::LocalConfigClient", "load config from cache error: " + e11.getMessage());
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final RouteEntry m56172h(@NotNull String externalUrl) {
        Intrinsics.checkNotNullParameter(externalUrl, "externalUrl");
        C45323a c45323a = new C45323a(externalUrl);
        c45323a.m100191b();
        C45324b c45324b = C45324b.f101918a;
        RouteConfigEntry routeConfigEntry = this.config;
        RouteEntry routeEntryM100202i = c45324b.m100202i(externalUrl, routeConfigEntry != null ? routeConfigEntry.getRoutes() : null);
        c45323a.m100190a(routeEntryM100202i);
        return routeEntryM100202i;
    }

    /* JADX INFO: renamed from: i */
    public final void m56173i(@NotNull Context context, @NotNull RouteConfigEntry config) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!m56167c(config)) {
            C43846g.m96568c(new RouteConfigMessage("saveConfig config is invalid", "RouteConfig::LocalConfigClient", false, 4, null), null, 2, null);
            C44128b.m97270n("RouteConfig::LocalConfigClient", "config is invalid,config: " + config);
            return;
        }
        this.config = config;
        try {
            Result.Companion companion = Result.INSTANCE;
            AtomicFile atomicFile = new AtomicFile(context.getFileStreamPath("route_config.json"));
            String strM66919i = C27099x.m66919i(config, false, 2, null);
            FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                byte[] bytes = strM66919i.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                fileOutputStreamStartWrite.write(bytes);
                atomicFile.finishWrite(fileOutputStreamStartWrite);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStreamStartWrite, null);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileOutputStreamStartWrite, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97270n("RouteConfig::LocalConfigClient", "save config error: " + thM103847exceptionOrNullimpl.getMessage());
        }
    }
}
