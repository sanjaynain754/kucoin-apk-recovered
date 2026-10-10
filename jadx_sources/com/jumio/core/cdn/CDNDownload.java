package com.jumio.core.cdn;

import android.os.SystemClock;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.utils.FileUtil;
import com.jumio.core.ServiceLocator;
import com.jumio.core.cdn.CDNDownload;
import com.jumio.core.network.DownloadTask;
import java.io.File;
import jumio.core.C40506B;
import jumio.core.C40704o1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000bJ\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\u0018\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0096@¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u000fH\u0002J\u0010\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000fH\u0002J\b\u0010,\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/jumio/core/cdn/CDNDownload;", "Lcom/jumio/core/network/DownloadTask$ProgressListener;", "", "file", "", "output", "Ljava/io/File;", "checksum", "timeout", "", "progressListener", "Lcom/jumio/core/cdn/CDNDownloadListener;", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;ILcom/jumio/core/cdn/CDNDownloadListener;)V", "startTimeInMs", "", "Ljava/lang/Long;", "durationLock", "Ljava/lang/Object;", "cdnDownloadTask", "Lcom/jumio/core/network/FileDownloadTask;", "retriedOnce", "Lcom/jumio/core/cdn/CDNDownloadListenerProxy;", "addListener", "", "cdnDownloadListener", "removeListener", "start", "startSync", "isRateLimitExceeded", "onProgressDone", "data", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onProgressUpdate", "percent", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onProgressException", "e", "Ljava/lang/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildAndSendAnalyticsEvent", "endTimeMs", "getDurationInMs", "validateChecksum", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CDNDownload implements DownloadTask.ProgressListener<Boolean> {
    public static final int DEFAULT_TIMEOUT = 30000;

    /* JADX INFO: renamed from: a */
    public final String f13746a;

    /* JADX INFO: renamed from: b */
    public final File f13747b;

    /* JADX INFO: renamed from: c */
    public final String f13748c;

    /* JADX INFO: renamed from: d */
    public Long f13749d;

    /* JADX INFO: renamed from: e */
    public final Object f13750e;

    /* JADX INFO: renamed from: f */
    public final C40704o1 f13751f;

    /* JADX INFO: renamed from: g */
    public boolean f13752g;

    /* JADX INFO: renamed from: h */
    public final C40506B f13753h;

    public CDNDownload(@NotNull String file, @NotNull File output, @Nullable String str, int i11, @Nullable CDNDownloadListener cdnDownloadListener) {
        File parentFile;
        File parentFile2;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(output, "output");
        this.f13746a = file;
        this.f13747b = output;
        this.f13748c = str;
        this.f13750e = new Object();
        C40506B c40506b = new C40506B(new CDNDownloadListener[0]);
        this.f13753h = c40506b;
        C40704o1 c40704o1 = new C40704o1(((CDNConfigInterface) ServiceLocator.INSTANCE.getServiceImplementation(CDNConfigInterface.class, new Function0() { // from class: k9.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CDNDownload.m14517a();
            }
        })).getF13762a() + file, output, i11);
        this.f13751f = c40704o1;
        if (file.length() > 0 && (parentFile = output.getParentFile()) != null && !parentFile.exists() && (parentFile2 = output.getParentFile()) != null) {
            parentFile2.mkdirs();
        }
        if (cdnDownloadListener != null) {
            Intrinsics.checkNotNullParameter(cdnDownloadListener, "cdnDownloadListener");
            if (!c40506b.f89913a.contains(cdnDownloadListener)) {
                c40506b.f89913a.add(cdnDownloadListener);
            }
        }
        c40704o1.setListener(this);
    }

    /* JADX INFO: renamed from: a */
    public static final CDNConfigInterface m14517a() {
        return new DefaultCDNConfig();
    }

    @Override // com.jumio.core.network.DownloadTask.ProgressListener
    public /* bridge */ /* synthetic */ Object onProgressDone(Boolean bool, Continuation continuation) {
        return onProgressDone2(bool, (Continuation<? super Unit>) continuation);
    }

    /* JADX INFO: renamed from: a */
    public final long m14518a(long j11) {
        long jLongValue;
        synchronized (this.f13750e) {
            Long l11 = this.f13749d;
            jLongValue = l11 != null ? j11 - l11.longValue() : -1L;
        }
        return jLongValue;
    }

    public final void addListener(@NotNull CDNDownloadListener cdnDownloadListener) {
        Intrinsics.checkNotNullParameter(cdnDownloadListener, "cdnDownloadListener");
        C40506B c40506b = this.f13753h;
        c40506b.getClass();
        Intrinsics.checkNotNullParameter(cdnDownloadListener, "cdnDownloadListener");
        if (c40506b.f89913a.contains(cdnDownloadListener)) {
            return;
        }
        c40506b.f89913a.add(cdnDownloadListener);
    }

    @Override // com.jumio.core.network.DownloadTask.ProgressListener
    public boolean isRateLimitExceeded() {
        return this.f13753h.isRateLimitExceeded();
    }

    @Nullable
    /* JADX INFO: renamed from: onProgressDone, reason: avoid collision after fix types in other method */
    public Object onProgressDone2(@Nullable Boolean bool, @NotNull Continuation<? super Unit> continuation) {
        Unit unit;
        boolean zAreEqual;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.f13750e) {
            long jM14518a = m14518a(jElapsedRealtime);
            MetaInfo metaInfo = new MetaInfo();
            metaInfo.put("model", StringsKt.substringAfterLast$default(this.f13746a, "/", (String) null, 2, (Object) null));
            metaInfo.put("modelDownloadTime", Long.valueOf(jM14518a));
            Analytics.INSTANCE.add(MobileEvents.performance("CDN Download", metaInfo));
            unit = Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
            if (this.f13748c == null) {
                zAreEqual = true;
            } else {
                zAreEqual = Intrinsics.areEqual(this.f13748c, FileUtil.INSTANCE.checksumFromFile(this.f13747b));
            }
            if (!zAreEqual) {
                this.f13747b.delete();
                if (!this.f13752g) {
                    this.f13752g = true;
                    start();
                    return unit;
                }
            }
        }
        Object objOnProgressDone = this.f13753h.onProgressDone(bool, (Continuation) continuation);
        return objOnProgressDone == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnProgressDone : unit;
    }

    @Override // com.jumio.core.network.DownloadTask.ProgressListener
    @Nullable
    public Object onProgressException(@NotNull Exception exc, @NotNull Continuation<? super Unit> continuation) {
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put("file", this.f13746a);
        Analytics.INSTANCE.add(MobileEvents.misc("cdnDownloadFailed", metaInfo));
        Object objOnProgressException = this.f13753h.onProgressException(exc, continuation);
        return objOnProgressException == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnProgressException : Unit.INSTANCE;
    }

    @Override // com.jumio.core.network.DownloadTask.ProgressListener
    @Nullable
    public Object onProgressUpdate(float f11, @NotNull Continuation<? super Unit> continuation) {
        Object objOnProgressUpdate = this.f13753h.onProgressUpdate(f11, continuation);
        return objOnProgressUpdate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnProgressUpdate : Unit.INSTANCE;
    }

    public final void removeListener(@NotNull CDNDownloadListener cdnDownloadListener) {
        Intrinsics.checkNotNullParameter(cdnDownloadListener, "cdnDownloadListener");
        C40506B c40506b = this.f13753h;
        c40506b.getClass();
        Intrinsics.checkNotNullParameter(cdnDownloadListener, "cdnDownloadListener");
        if (c40506b.f89913a.contains(cdnDownloadListener)) {
            c40506b.f89913a.remove(cdnDownloadListener);
        }
    }

    public final void start() {
        synchronized (this.f13750e) {
            this.f13749d = Long.valueOf(SystemClock.elapsedRealtime());
            Unit unit = Unit.INSTANCE;
        }
        DownloadTask.start$default(this.f13751f, null, 1, null);
    }

    public final boolean startSync() {
        boolean zAreEqual;
        synchronized (this.f13750e) {
            this.f13749d = Long.valueOf(SystemClock.elapsedRealtime());
            Unit unit = Unit.INSTANCE;
        }
        boolean zAreEqual2 = Intrinsics.areEqual(this.f13751f.startSync(), Boolean.TRUE);
        if (!zAreEqual2) {
            return zAreEqual2;
        }
        if (this.f13748c == null) {
            zAreEqual = true;
        } else {
            zAreEqual = Intrinsics.areEqual(this.f13748c, FileUtil.INSTANCE.checksumFromFile(this.f13747b));
        }
        if (zAreEqual) {
            return zAreEqual2;
        }
        this.f13747b.delete();
        if (this.f13752g) {
            return zAreEqual2;
        }
        this.f13752g = true;
        return startSync();
    }

    public /* synthetic */ CDNDownload(String str, File file, String str2, int i11, CDNDownloadListener cDNDownloadListener, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, file, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? 30000 : i11, (i12 & 16) != 0 ? null : cDNDownloadListener);
    }
}
