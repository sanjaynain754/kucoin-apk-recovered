package com.jumio.sdk.preload;

import android.content.Context;
import androidx.annotation.Keep;
import com.jumio.commons.log.Log;
import com.jumio.core.ServiceLocator;
import com.jumio.core.ServiceLocatorInterface;
import com.jumio.core.cdn.CDNCache;
import com.jumio.core.cdn.CDNDownloadListener;
import com.jumio.core.environment.Environment;
import com.jumio.core.plugins.PluginRegistryInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import jumio.core.C40541I;
import jumio.core.C40665g2;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.FilesKt;

/* JADX INFO: loaded from: classes56.dex */
@Keep
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\bJ\u0006\u0010\u001b\u001a\u00020\u0016J\u0006\u0010\u001c\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/jumio/sdk/preload/JumioPreloader;", "", "<init>", "()V", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", TUIConstants.TUIChat.CALL_BACK, "Ljava/lang/ref/WeakReference;", "Lcom/jumio/sdk/preload/JumioPreloadCallback;", "isInitialized", "", "preloadingJob", "Lkotlinx/coroutines/Job;", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "pluginRegistry", "Lcom/jumio/core/plugins/PluginRegistryInterface;", "cdnCache", "Lcom/jumio/core/cdn/CDNCache;", "cdnModelLoader", "Lcom/jumio/core/preload/CDNModelPreloader;", "init", "", "context", "Landroid/content/Context;", "init$jumio_core_release", "setCallback", "preloadIfNeeded", "cancel", "clean", "dispose", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioPreloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioPreloader.kt\ncom/jumio/sdk/preload/JumioPreloader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
public final class JumioPreloader {

    @Nullable
    private static WeakReference<JumioPreloadCallback> callback;
    private static CDNCache cdnCache;
    private static C40541I cdnModelLoader;
    private static boolean isInitialized;
    private static PluginRegistryInterface pluginRegistry;

    @Nullable
    private static InterfaceC41775x1 preloadingJob;

    @NotNull
    public static final JumioPreloader INSTANCE = new JumioPreloader();

    @NotNull
    private static final InterfaceC41709m0 mainScope = C41713n0.m91133i(C41713n0.m91125a(C41782z0.m91393c()), C41727q2.m91192b(null, 1, null));

    @NotNull
    private static AtomicInteger counter = new AtomicInteger(0);

    public final void dispose() {
        isInitialized = false;
        callback = null;
        JobKt__JobKt.m90365i(mainScope.getF15154b(), null, 1, null);
    }

    public final void cancel() throws IllegalStateException {
        JumioPreloadCallback jumioPreloadCallback;
        if (!isInitialized) {
            throw new IllegalStateException("init(context) must be called before using this function");
        }
        InterfaceC41775x1 interfaceC41775x1 = preloadingJob;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        preloadingJob = null;
        WeakReference<JumioPreloadCallback> weakReference = callback;
        if (weakReference == null || (jumioPreloadCallback = weakReference.get()) == null) {
            return;
        }
        jumioPreloadCallback.preloadFinished();
    }

    public final void clean() throws IllegalStateException {
        if (!isInitialized) {
            throw new IllegalStateException("init(context) must be called before using this function");
        }
        CDNCache cDNCache = cdnCache;
        if (cDNCache == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cdnCache");
            cDNCache = null;
        }
        FilesKt.deleteRecursively(cDNCache.getF13737b());
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CDNCache cDNCache = new CDNCache(true);
        cDNCache.setDirectory(Environment.INSTANCE.getDataDirectory(context));
        cDNCache.setCdnDownloadListener(new CDNDownloadListener() { // from class: com.jumio.sdk.preload.JumioPreloader$init$cdnCache$1$1
            @Override // com.jumio.core.cdn.CDNDownloadListener, com.jumio.core.network.DownloadTask.ProgressListener
            public boolean isRateLimitExceeded() {
                if (JumioPreloader.counter.getAndIncrement() >= 300) {
                    return true;
                }
                return false;
            }
        });
        init$jumio_core_release(context, cDNCache, new C40541I(cDNCache));
    }

    public final void init$jumio_core_release(@NotNull Context context, @NotNull CDNCache cdnCache2, @NotNull C40541I cdnModelLoader2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cdnCache2, "cdnCache");
        Intrinsics.checkNotNullParameter(cdnModelLoader2, "cdnModelLoader");
        ServiceLocator serviceLocator = ServiceLocator.INSTANCE;
        serviceLocator.init(context);
        pluginRegistry = (PluginRegistryInterface) ServiceLocatorInterface.getServiceImplementation$default(serviceLocator, PluginRegistryInterface.class, null, 2, null);
        cdnCache = cdnCache2;
        cdnModelLoader = cdnModelLoader2;
        isInitialized = true;
    }

    public final void preloadIfNeeded() throws IllegalStateException {
        if (!isInitialized) {
            throw new IllegalStateException("init(context) must be called before using this function");
        }
        InterfaceC41775x1 interfaceC41775x1 = preloadingJob;
        if (interfaceC41775x1 == null || !interfaceC41775x1.isActive()) {
            WeakReference<JumioPreloadCallback> weakReference = callback;
            if ((weakReference != null ? weakReference.get() : null) == null) {
                Log.m14484w("JumioPreloader", "Preload started without callback attached!");
            }
            preloadingJob = C41696j.m91104d(mainScope, null, null, new C40665g2(null), 3, null);
        }
    }

    public final void setCallback(@NotNull JumioPreloadCallback callback2) {
        Intrinsics.checkNotNullParameter(callback2, "callback");
        callback = new WeakReference<>(callback2);
    }

    private JumioPreloader() {
    }
}
