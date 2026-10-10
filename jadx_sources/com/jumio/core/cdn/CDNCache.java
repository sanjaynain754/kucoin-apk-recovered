package com.jumio.core.cdn;

import android.content.res.AssetManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.FileUtil;
import com.jumio.core.cdn.CDNCache;
import com.jumio.core.util.StringUtilKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import jumio.core.AbstractC40742w;
import jumio.core.C40722s;
import jumio.core.C40737v;
import jumio.core.InterfaceC40516D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.FilesKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001HB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(J\u0010\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010'\u001a\u00020(J$\u0010+\u001a\u00020,2\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010-\u001a\u00020\u001f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0014J\u0018\u0010/\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010-\u001a\u00020\u001fJ \u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u00072\u0006\u0010'\u001a\u00020(2\b\b\u0002\u00102\u001a\u00020\u0003J\u000e\u00103\u001a\u00020,2\u0006\u0010'\u001a\u00020(J\u000e\u00104\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(J\u000e\u00105\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(J\u000e\u00106\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(J\u0010\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\"H\u0002J \u00109\u001a\u00020,2\u0006\u00108\u001a\u00020\"2\u0006\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020,H\u0002J\u0010\u0010>\u001a\u00020,2\u0006\u0010:\u001a\u00020\"H\u0002J\u0010\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020AH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010B\u001a\u00020\u0007*\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010E\u001a\u0004\u0018\u00010\"*\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, m90084d2 = {"Lcom/jumio/core/cdn/CDNCache;", "Ljava/io/Serializable;", "isPreloadCache", "", "<init>", "(Z)V", "value", "Ljava/io/File;", "directory", "getDirectory", "()Ljava/io/File;", "setDirectory", "(Ljava/io/File;)V", "Landroid/content/res/AssetManager;", "assetManager", "getAssetManager", "()Landroid/content/res/AssetManager;", "setAssetManager", "(Landroid/content/res/AssetManager;)V", "cdnDownloadListener", "Lcom/jumio/core/cdn/CDNDownloadListener;", "getCdnDownloadListener", "()Lcom/jumio/core/cdn/CDNDownloadListener;", "setCdnDownloadListener", "(Lcom/jumio/core/cdn/CDNDownloadListener;)V", "executors", "Ljava/util/concurrent/ExecutorService;", "loadingLock", "", "assetLookupLock", "threadCount", "", "entriesInProgress", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/jumio/core/cdn/CDNDownload;", "assetLookup", "", "has", "entry", "Lcom/jumio/core/cdn/CDNEntry;", "get", "Ljava/io/InputStream;", "load", "", "timeout", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "loadSync", "store", "file", "override", "remove", "isDownloadedFile", "isAssetFile", "isPreloadedFile", "getFilePathInAssets", "name", "getFilePathInAssetsRecursively", "folder", "assetResult", "Lcom/jumio/core/cdn/CDNCache$AssetResult;", "preloadAssets", "addFilesToLookupRecursively", "readObject", "stream", "Ljava/io/ObjectInputStream;", "storageFile", "getStorageFile", "(Lcom/jumio/core/cdn/CDNEntry;)Ljava/io/File;", "actualFilePath", "getActualFilePath", "(Lcom/jumio/core/cdn/CDNEntry;)Ljava/lang/String;", "AssetResult", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCDNCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CDNCache.kt\ncom/jumio/core/cdn/CDNCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,357:1\n1#2:358\n13402#3,2:359\n13402#3,2:361\n13402#3,2:363\n13402#3,2:365\n*S KotlinDebug\n*F\n+ 1 CDNCache.kt\ncom/jumio/core/cdn/CDNCache\n*L\n233#1:359,2\n263#1:361,2\n301#1:363,2\n281#1:365,2\n*E\n"})
public final class CDNCache implements Serializable {

    /* JADX INFO: renamed from: a */
    public final boolean f13736a;

    /* JADX INFO: renamed from: b */
    public transient File f13737b;

    /* JADX INFO: renamed from: c */
    public transient AssetManager f13738c;

    /* JADX INFO: renamed from: d */
    public transient CDNDownloadListener f13739d;

    /* JADX INFO: renamed from: e */
    public transient ExecutorService f13740e;

    /* JADX INFO: renamed from: f */
    public transient Object f13741f;

    /* JADX INFO: renamed from: g */
    public transient Object f13742g;

    /* JADX INFO: renamed from: h */
    public transient int f13743h;

    /* JADX INFO: renamed from: i */
    public transient ConcurrentHashMap f13744i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f13745j;

    public CDNCache() {
        this(false, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public static final void m14508a(CDNCache cDNCache, String str, String str2, C40722s c40722s) {
        Intrinsics.checkNotNull(str2);
        cDNCache.m14514a(str, str2, c40722s);
    }

    /* JADX INFO: renamed from: b */
    public final String m14516b(final String str) {
        final C40722s c40722s;
        String[] list;
        synchronized (this.f13742g) {
            try {
                String str2 = (String) this.f13745j.get(str);
                if (str2 == null) {
                    str2 = "";
                }
                c40722s = new C40722s(str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c40722s.f90391a.length() > 0) {
            return c40722s.f90391a;
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(this.f13743h);
        AssetManager assetManager = this.f13738c;
        if (assetManager != null && (list = assetManager.list("")) != null && list.length != 0) {
            for (final String str3 : list) {
                executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: k9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        CDNCache.m14508a(this.f91049b, str, str3, c40722s);
                    }
                });
            }
        }
        executorServiceNewFixedThreadPool.shutdown();
        try {
            executorServiceNewFixedThreadPool.awaitTermination(10L, TimeUnit.SECONDS);
        } catch (InterruptedException e11) {
            Log.printStackTrace(e11);
        }
        this.f13740e = executorServiceNewFixedThreadPool;
        return c40722s.f90391a;
    }

    @Nullable
    public final synchronized InputStream get(@NotNull InterfaceC40516D entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (entry.getFile().length() == 0) {
            return null;
        }
        if (isDownloadedFile(entry)) {
            return new FileInputStream(m14511a(entry));
        }
        if (!isAssetFile(entry)) {
            return null;
        }
        AssetManager assetManager = this.f13738c;
        if (assetManager == null) {
            return null;
        }
        return assetManager.open(m14516b(StringsKt.substringAfterLast$default(StringUtilKt.sanitize(entry.getFile(), true), "/", (String) null, 2, (Object) null)));
    }

    public final synchronized boolean has(@NotNull InterfaceC40516D entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (entry.getFile().length() == 0) {
            return false;
        }
        String checksum = entry.getChecksum();
        if (checksum != null && checksum.length() != 0) {
            InputStream inputStream = get(entry);
            if (inputStream != null) {
                return Intrinsics.areEqual(FileUtil.INSTANCE.checksumFromInputStream(inputStream), entry.getChecksum());
            }
            return false;
        }
        return isDownloadedFile(entry) || isAssetFile(entry);
    }

    public final synchronized boolean isAssetFile(@NotNull InterfaceC40516D entry) {
        boolean z11;
        ExecutorService executorService;
        Intrinsics.checkNotNullParameter(entry, "entry");
        synchronized (this.f13742g) {
            try {
                ExecutorService executorService2 = this.f13740e;
                if (executorService2 != null && !executorService2.isTerminated() && (executorService = this.f13740e) != null) {
                    executorService.awaitTermination(10L, TimeUnit.SECONDS);
                }
            } catch (InterruptedException e11) {
                Log.printStackTrace(e11);
            }
            z11 = this.f13745j.get(StringsKt.substringAfterLast$default(StringUtilKt.sanitize(entry.getFile(), true), "/", (String) null, 2, (Object) null)) != null;
        }
        return z11;
    }

    public final synchronized boolean isDownloadedFile(@NotNull InterfaceC40516D entry) {
        String strM14511a;
        Intrinsics.checkNotNullParameter(entry, "entry");
        strM14511a = m14511a(entry);
        return !(strM14511a == null || strM14511a.length() == 0);
    }

    public final synchronized boolean isPreloadedFile(@NotNull InterfaceC40516D entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        String strM14511a = m14511a(entry);
        if (strM14511a != null) {
            return StringsKt.contains$default((CharSequence) strM14511a, (CharSequence) "preload", false, 2, (Object) null);
        }
        return false;
    }

    public final synchronized void remove(@NotNull InterfaceC40516D entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        File file = new File(this.f13737b, StringUtilKt.sanitize(entry.getName(), false));
        if (file.exists()) {
            FilesKt.deleteRecursively(file);
        }
    }

    public final synchronized void store(@NotNull File file, @NotNull InterfaceC40516D entry, boolean z11) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(entry, "entry");
        FilesKt.copyTo$default(file, m14515b(entry), z11, 0, 4, null);
    }

    public CDNCache(boolean z11) {
        this.f13736a = z11;
        this.f13737b = new File("");
        this.f13741f = new Object();
        this.f13742g = new Object();
        this.f13743h = RangesKt.coerceAtLeast(Runtime.getRuntime().availableProcessors() / 2, 2);
        this.f13744i = new ConcurrentHashMap();
        this.f13745j = new LinkedHashMap();
    }

    public static /* synthetic */ void load$default(CDNCache cDNCache, InterfaceC40516D interfaceC40516D, int i11, CDNDownloadListener cDNDownloadListener, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 30000;
        }
        if ((i12 & 4) != 0) {
            cDNDownloadListener = null;
        }
        cDNCache.load(interfaceC40516D, i11, cDNDownloadListener);
    }

    public static /* synthetic */ boolean loadSync$default(CDNCache cDNCache, InterfaceC40516D interfaceC40516D, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 30000;
        }
        return cDNCache.loadSync(interfaceC40516D, i11);
    }

    public static /* synthetic */ void store$default(CDNCache cDNCache, File file, InterfaceC40516D interfaceC40516D, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        cDNCache.store(file, interfaceC40516D, z11);
    }

    /* JADX INFO: renamed from: a */
    public final void m14512a() {
        synchronized (this.f13742g) {
            this.f13745j.clear();
            final ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(this.f13743h);
            executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: k9.a
                @Override // java.lang.Runnable
                public final void run() {
                    CDNCache.m14509a(this.f91047b, executorServiceNewFixedThreadPool);
                }
            });
            this.f13740e = executorServiceNewFixedThreadPool;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getAssetManager, reason: from getter */
    public final AssetManager getF13738c() {
        return this.f13738c;
    }

    @Nullable
    /* JADX INFO: renamed from: getCdnDownloadListener, reason: from getter */
    public final CDNDownloadListener getF13739d() {
        return this.f13739d;
    }

    @NotNull
    /* JADX INFO: renamed from: getDirectory, reason: from getter */
    public final File getF13737b() {
        return this.f13737b;
    }

    public final void load(@NotNull InterfaceC40516D entry, int i11, @Nullable CDNDownloadListener cDNDownloadListener) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        synchronized (this.f13741f) {
            try {
                String strSanitize = StringUtilKt.sanitize(entry.getName(), false);
                CDNDownload cDNDownload = (CDNDownload) this.f13744i.get(strSanitize);
                if (cDNDownload != null) {
                    if (cDNDownloadListener != null) {
                        cDNDownload.addListener(cDNDownloadListener);
                    }
                    Log.m14461d(strSanitize + " is currently being downloaded. Ignoring request to download again.");
                } else if (has(entry)) {
                    Log.m14461d(strSanitize + " already available locally!");
                } else {
                    Log.m14461d("Downloading " + strSanitize + " from CDN");
                    C40737v c40737v = new C40737v(this, strSanitize);
                    CDNDownload cDNDownload2 = new CDNDownload(StringUtilKt.sanitize(entry.getFile(), true), m14515b(entry), entry.getChecksum(), i11, null, 16, null);
                    cDNDownload2.addListener(c40737v);
                    CDNDownloadListener cDNDownloadListener2 = this.f13739d;
                    if (cDNDownloadListener2 != null) {
                        cDNDownload2.addListener(cDNDownloadListener2);
                    }
                    if (cDNDownloadListener != null) {
                        cDNDownload2.addListener(cDNDownloadListener);
                    }
                    this.f13744i.put(strSanitize, cDNDownload2);
                    cDNDownload2.start();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean loadSync(@NotNull InterfaceC40516D entry, int i11) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        String strSanitize = StringUtilKt.sanitize(entry.getName(), false);
        synchronized (this.f13741f) {
            if (this.f13744i.contains(strSanitize)) {
                Log.m14461d(strSanitize + " is currently being downloaded. Ignoring request to download again.");
                return false;
            }
            if (has(entry)) {
                Log.m14461d(strSanitize + " already available locally!");
                this.f13744i.remove(strSanitize);
                return true;
            }
            Log.m14461d("Downloading " + strSanitize + " from CDN");
            CDNDownload cDNDownload = new CDNDownload(StringUtilKt.sanitize(entry.getFile(), true), m14515b(entry), entry.getChecksum(), i11, this.f13739d);
            this.f13744i.put(strSanitize, cDNDownload);
            boolean zStartSync = cDNDownload.startSync();
            synchronized (this.f13741f) {
            }
            return zStartSync;
        }
    }

    public final void setAssetManager(@Nullable AssetManager assetManager) {
        this.f13738c = assetManager;
        m14512a();
    }

    public final void setCdnDownloadListener(@Nullable CDNDownloadListener cDNDownloadListener) {
        this.f13739d = cDNDownloadListener;
    }

    public final void setDirectory(@NotNull File value) {
        Intrinsics.checkNotNullParameter(value, "value");
        File file = new File(value, "cdn");
        this.f13737b = file;
        if (file.exists()) {
            return;
        }
        this.f13737b.mkdirs();
    }

    private final void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        this.f13741f = new Object();
        this.f13742g = new Object();
        this.f13743h = RangesKt.coerceAtLeast(Runtime.getRuntime().availableProcessors() / 2, 2);
        this.f13744i = new ConcurrentHashMap();
    }

    public /* synthetic */ CDNCache(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }

    /* JADX INFO: renamed from: a */
    public static final void m14509a(final CDNCache cDNCache, ExecutorService executorService) {
        String[] list;
        AssetManager assetManager = cDNCache.f13738c;
        if (assetManager != null && (list = assetManager.list("")) != null && list.length != 0) {
            for (final String str : list) {
                executorService.submit(new Runnable() { // from class: k9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        CDNCache.m14507a(this.f91053b, str);
                    }
                });
            }
        }
        executorService.shutdown();
    }

    /* JADX INFO: renamed from: a */
    public static final void m14507a(CDNCache cDNCache, String str) {
        Intrinsics.checkNotNull(str);
        cDNCache.m14513a(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m14513a(String str) {
        String[] list;
        AssetManager assetManager = this.f13738c;
        if (assetManager == null || (list = assetManager.list(str)) == null) {
            return;
        }
        if (list.length == 0 && StringsKt.endsWith$default(str, ".enc", false, 2, (Object) null)) {
            this.f13745j.put(StringsKt.substringAfterLast$default(str, "/", (String) null, 2, (Object) null), str);
            return;
        }
        if (list.length == 0) {
            return;
        }
        for (String str2 : list) {
            m14513a(AbstractC40742w.m89268a(str) + str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final File m14515b(InterfaceC40516D interfaceC40516D) {
        String strM89268a;
        if (this.f13736a) {
            strM89268a = AbstractC40742w.m89268a("preload");
        } else {
            strM89268a = "";
        }
        return new File(this.f13737b, AbstractC40742w.m89268a(StringUtilKt.sanitize(interfaceC40516D.getName(), false)) + strM89268a + StringsKt.substringAfterLast$default(StringUtilKt.sanitize(interfaceC40516D.getFile(), true), "/", (String) null, 2, (Object) null));
    }

    /* JADX INFO: renamed from: a */
    public final String m14511a(final InterfaceC40516D interfaceC40516D) {
        Object obj = null;
        Sequence sequenceFilter = SequencesKt.filter(SequencesKt.map(FilesKt.walk$default(new File(this.f13737b, StringUtilKt.sanitize(interfaceC40516D.getName(), false)), null, 1, null), new Function1() { // from class: k9.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CDNCache.m14506a((File) obj2);
            }
        }), new Function1() { // from class: k9.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(CDNCache.m14510a(interfaceC40516D, (String) obj2));
            }
        });
        for (Object obj2 : sequenceFilter) {
            String str = (String) obj2;
            Intrinsics.checkNotNull(str);
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "preload", false, 2, (Object) null)) {
                obj = obj2;
                break;
            }
        }
        String str2 = (String) obj;
        return str2 == null ? (String) SequencesKt.firstOrNull(sequenceFilter) : str2;
    }

    /* JADX INFO: renamed from: a */
    public static final String m14506a(File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAbsolutePath();
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m14510a(InterfaceC40516D interfaceC40516D, String str) {
        Intrinsics.checkNotNull(str);
        return StringsKt.endsWith$default(str, StringsKt.substringAfterLast$default(StringUtilKt.sanitize(interfaceC40516D.getFile(), true), "/", (String) null, 2, (Object) null), false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m14514a(String str, String str2, C40722s c40722s) {
        AssetManager assetManager;
        String[] list;
        if (c40722s.f90392b.get() || (assetManager = this.f13738c) == null || (list = assetManager.list(str2)) == null) {
            return;
        }
        if (list.length == 0 && Intrinsics.areEqual(str, StringsKt.substringAfterLast$default(str2, "/", (String) null, 2, (Object) null))) {
            c40722s.f90392b.set(true);
            Intrinsics.checkNotNullParameter(str2, "<set-?>");
            c40722s.f90391a = str2;
        } else {
            if (list.length == 0) {
                return;
            }
            for (String str3 : list) {
                m14514a(str, AbstractC40742w.m89268a(str2) + str3, c40722s);
            }
        }
    }
}
