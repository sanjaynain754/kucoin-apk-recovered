package com.tencent.rmonitor.base.reporter;

import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.network.NetworkWatcher;
import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.data.ReportStrategy;
import com.tencent.bugly.common.reporter.upload.UploadProxy;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.proguard.C33588ce;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33868q0;
import com.tencent.bugly.proguard.InterfaceC34017x9;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.p144db.DBDataStatus;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.base.reporter.batch.ReportCacheImpl;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.JsonUtil;
import com.tencent.rmonitor.sla.AttaEvent;
import com.tencent.rmonitor.sla.AttaEventReporter;
import com.tencent.rmonitor.sla.StatisticsReporter;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001QB\t\b\u0002¢\u0006\u0004\bO\u0010PJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002J\u001a\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J0\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J(\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u001a\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010 \u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0016J\u0006\u0010!\u001a\u00020\u000fJ\u0006\u0010\"\u001a\u00020\u0004J6\u0010$\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016R\u0014\u0010&\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010F\u001a\b\u0012\u0004\u0012\u00020\n0E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006R"}, m90084d2 = {"Lcom/tencent/rmonitor/base/reporter/ReporterMachine;", "Lcom/tencent/bugly/common/reporter/IReporter;", "Lcom/tencent/bugly/common/reporter/data/ReportData;", "reportData", "", "whetherBlock", "", "priority", "Ljava/lang/Runnable;", "runnable", "Lcom/tencent/rmonitor/base/reporter/ReporterMachine$ReportTask;", "getRunnableTask", "getReporter", "Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;", TUIConstants.TUIChat.CALL_BACK, "", "reportInternal", "checkNetStrategy", "errorCode", "handleRetryStrategy", "isSuccess", "contentLength", "", "costInMs", "recordUpload", "Lcom/tencent/rmonitor/base/reporter/DiscardReason;", "discardReason", "recordDiscard", "reportErrorCode", "reportNow", "post", "delay", "postDelayed", "start", "isStart", "hasRetry", "recordUploadResult", "", "TAG", "Ljava/lang/String;", "isStarted", "Z", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "uploadProxy", "Lcom/tencent/bugly/common/reporter/IReporter;", "getUploadProxy", "()Lcom/tencent/bugly/common/reporter/IReporter;", "setUploadProxy", "(Lcom/tencent/bugly/common/reporter/IReporter;)V", "Lcom/tencent/rmonitor/base/reporter/IReportCache;", "reportCache", "Lcom/tencent/rmonitor/base/reporter/IReportCache;", "getReportCache", "()Lcom/tencent/rmonitor/base/reporter/IReportCache;", "setReportCache", "(Lcom/tencent/rmonitor/base/reporter/IReportCache;)V", "Lcom/tencent/bugly/proguard/x9;", "reportListener", "Lcom/tencent/bugly/proguard/x9;", "getReportListener", "()Lcom/tencent/bugly/proguard/x9;", "setReportListener", "(Lcom/tencent/bugly/proguard/x9;)V", "Ljava/util/concurrent/PriorityBlockingQueue;", "reportQueue", "Ljava/util/concurrent/PriorityBlockingQueue;", "getReportQueue", "()Ljava/util/concurrent/PriorityBlockingQueue;", "setReportQueue", "(Ljava/util/concurrent/PriorityBlockingQueue;)V", "Ljava/lang/Thread;", "reportThread", "Ljava/lang/Thread;", "<init>", "()V", "ReportTask", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ReporterMachine implements IReporter {

    @NotNull
    private static final String TAG = "RMonitor_report";
    private static volatile boolean isStarted;

    @Nullable
    private static InterfaceC34017x9 reportListener;

    @Nullable
    private static IReporter uploadProxy;

    @NotNull
    public static final ReporterMachine INSTANCE = new ReporterMachine();

    @NotNull
    private static Handler handler = new Handler(ThreadManager.INSTANCE.getMonitorThreadLooper());

    @NotNull
    private static IReportCache reportCache = new ReportCacheImpl();

    @NotNull
    private static PriorityBlockingQueue<ReportTask> reportQueue = new PriorityBlockingQueue<>();

    @NotNull
    private static final Thread reportThread = new Thread(new Runnable() { // from class: com.tencent.rmonitor.base.reporter.c
        @Override // java.lang.Runnable
        public final void run() throws InterruptedException {
            ReporterMachine.m103822reportThread$lambda2();
        }
    });

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0011\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m90084d2 = {"Lcom/tencent/rmonitor/base/reporter/ReporterMachine$ReportTask;", "", "priority", "", "reportData", "Lcom/tencent/bugly/common/reporter/data/ReportData;", TUIConstants.TUIChat.CALL_BACK, "Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;", "(ILcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)V", "getCallback", "()Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;", "index", "getPriority", "()I", "getReportData", "()Lcom/tencent/bugly/common/reporter/data/ReportData;", "runnable", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "compareIndex", "otherIndex", "compareTo", "other", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class ReportTask implements Comparable<ReportTask> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static AtomicInteger GLOBAL_INDEX = new AtomicInteger(0);

        @Nullable
        private final IReporter.ReportCallback callback;
        private final int index = GLOBAL_INDEX.getAndIncrement();
        private final int priority;

        @Nullable
        private final ReportData reportData;

        @Nullable
        private Runnable runnable;

        /* JADX INFO: compiled from: BUGLY */
        @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/tencent/rmonitor/base/reporter/ReporterMachine$ReportTask$Companion;", "", "()V", "GLOBAL_INDEX", "Ljava/util/concurrent/atomic/AtomicInteger;", "getGLOBAL_INDEX", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setGLOBAL_INDEX", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final void setGLOBAL_INDEX(@NotNull AtomicInteger atomicInteger) {
                Intrinsics.checkNotNullParameter(atomicInteger, "<set-?>");
                ReportTask.GLOBAL_INDEX = atomicInteger;
            }

            @NotNull
            public final AtomicInteger getGLOBAL_INDEX() {
                return ReportTask.GLOBAL_INDEX;
            }
        }

        private final int compareIndex(int otherIndex) {
            if (this.index > otherIndex) {
                return 1;
            }
            return this.priority < otherIndex ? -1 : 0;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull ReportTask other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i11 = this.priority;
            int i12 = other.priority;
            if (i11 < i12) {
                return 1;
            }
            if (i11 > i12) {
                return -1;
            }
            return compareIndex(other.index);
        }

        @Nullable
        public final IReporter.ReportCallback getCallback() {
            return this.callback;
        }

        public final int getPriority() {
            return this.priority;
        }

        @Nullable
        public final ReportData getReportData() {
            return this.reportData;
        }

        @Nullable
        public final Runnable getRunnable() {
            return this.runnable;
        }

        public final void setRunnable(@Nullable Runnable runnable) {
            this.runnable = runnable;
        }

        public ReportTask(@IntRange(from = 0, m1553to = 4) int i11, @Nullable ReportData reportData, @Nullable IReporter.ReportCallback reportCallback) {
            this.priority = i11;
            this.reportData = reportData;
            this.callback = reportCallback;
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReportStrategy.RetryStrategy.values().length];
            iArr[ReportStrategy.RetryStrategy.RETRY_IMMEDIATELY.ordinal()] = 1;
            iArr[ReportStrategy.RetryStrategy.RETRY_BACKOFF.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final IReporter getReporter() {
        UserMeta userMeta = BaseInfo.userMeta;
        if (TextUtils.isEmpty(userMeta.appId)) {
            Logger.INSTANCE.mo77131e("RMonitor_report", "appid is empty.");
        }
        if (BaseInfo.app == null) {
            Logger.INSTANCE.mo77131e("RMonitor_report", "app is null.");
        }
        if (uploadProxy == null && !TextUtils.isEmpty(userMeta.appId)) {
            uploadProxy = new UploadProxy(BaseInfo.app, userMeta.appId);
        }
        if (uploadProxy == null) {
            Logger.INSTANCE.mo77131e("RMonitor_report", "IReporter is null.");
        }
        return uploadProxy;
    }

    private final ReportTask getRunnableTask(int priority, Runnable runnable) {
        ReportTask reportTask = new ReportTask(priority, null, null);
        reportTask.setRunnable(runnable);
        return reportTask;
    }

    public static /* synthetic */ ReportTask getRunnableTask$default(ReporterMachine reporterMachine, int i11, Runnable runnable, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 2;
        }
        return reporterMachine.getRunnableTask(i11, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleRetryStrategy$lambda-6, reason: not valid java name */
    public static final void m103819handleRetryStrategy$lambda6(ReportData reportData, IReporter.ReportCallback reportCallback) {
        Intrinsics.checkNotNullParameter(reportData, "$reportData");
        reportQueue.offer(new ReportTask(reportData.getReportStrategy().getPriority(), reportData, reportCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postDelayed$lambda-4, reason: not valid java name */
    public static final void m103820postDelayed$lambda4(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        reportQueue.offer(INSTANCE.getRunnableTask(2, runnable));
    }

    private final void reportInternal(final ReportData reportData, final IReporter.ReportCallback callback) {
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v("RMonitor_report", "reportInternal: " + reportData.getParams());
        }
        if (reportData.getReportStrategy().getNeedCache() && reportData.getDbId() <= 0) {
            reportCache.cacheReportDataSync(reportData);
        }
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v("RMonitor_report", "reportInternal with " + reportData);
        }
        final long jUptimeMillis = SystemClock.uptimeMillis();
        IReporter reporter = getReporter();
        if (reporter != null) {
            reporter.reportNow(reportData, new IReporter.ReportCallback() { // from class: com.tencent.rmonitor.base.reporter.ReporterMachine.reportInternal.1
                @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
                public void onBlocked(int dbId) {
                    if (Logger.verbos) {
                        Logger.INSTANCE.mo77133v("RMonitor_report", "reportInternal-onBlocked with " + reportData);
                    }
                    ReporterMachine.INSTANCE.getReportCache().updateCacheDataStatus(dbId, DBDataStatus.SENT);
                    IReporter.ReportCallback reportCallback = callback;
                    if (reportCallback != null) {
                        reportCallback.onBlocked(dbId);
                    }
                }

                @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
                public void onFailure(int errorCode, @NotNull String errorMsg, int dbId, int contentLength) {
                    Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    if (Logger.debug) {
                        Logger.INSTANCE.mo77130d("RMonitor_report", "reportInternal-onFailure with {errorCode: " + errorCode + ", errorMsg: " + errorMsg + ", reportData: " + reportData + '}');
                    }
                    ReporterMachine reporterMachine = ReporterMachine.INSTANCE;
                    reporterMachine.getReportCache().updateCacheDataStatus(dbId, DBDataStatus.SENT_FAIL);
                    if (reporterMachine.handleRetryStrategy(errorCode, reportData, callback)) {
                        reporterMachine.recordUploadResult(reportData, false, true, errorCode, contentLength, jUptimeMillis2);
                        return;
                    }
                    reporterMachine.recordUploadResult(reportData, false, false, errorCode, contentLength, jUptimeMillis2);
                    IReporter.ReportCallback reportCallback = callback;
                    if (reportCallback != null) {
                        reportCallback.onFailure(errorCode, errorMsg, dbId, contentLength);
                    }
                }

                @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
                public void onCached() {
                    IReporter.ReportCallback.DefaultImpls.onCached(this);
                }

                @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
                public void onSuccess(int dbId, int contentLength) {
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    if (Logger.verbos) {
                        Logger.INSTANCE.mo77133v("RMonitor_report", "reportInternal-onSuccess with " + reportData);
                    }
                    ReporterMachine reporterMachine = ReporterMachine.INSTANCE;
                    reporterMachine.getReportCache().updateCacheDataStatus(dbId, DBDataStatus.SENT);
                    reporterMachine.recordUploadResult(reportData, true, true, 0, contentLength, jUptimeMillis2);
                    IReporter.ReportCallback reportCallback = callback;
                    if (reportCallback != null) {
                        reportCallback.onSuccess(dbId, contentLength);
                    }
                }
            });
        }
        InterfaceC34017x9 interfaceC34017x9 = reportListener;
        if (interfaceC34017x9 != null) {
            interfaceC34017x9.m75451a(C33820nf.m74310d(reportData.getParams()), reportData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reportNow$lambda-3, reason: not valid java name */
    public static final void m103821reportNow$lambda3(ReportData reportData) {
        Intrinsics.checkNotNullParameter(reportData, "$reportData");
        reportCache.cacheReportDataSync(reportData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Infinite loop detected, blocks: 17, insns: 0 */
    /* JADX INFO: renamed from: reportThread$lambda-2, reason: not valid java name */
    public static final void m103822reportThread$lambda2() throws InterruptedException {
        while (true) {
            ReportTask reportTaskTake = reportQueue.take();
            try {
                Runnable runnable = reportTaskTake.getRunnable();
                if (runnable != null) {
                    runnable.run();
                }
                ReportData reportData = reportTaskTake.getReportData();
                if (reportData != null) {
                    INSTANCE.reportInternal(reportData, reportTaskTake.getCallback());
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.exception("RMonitor_report", th2);
            }
        }
    }

    @NotNull
    public final Handler getHandler() {
        return handler;
    }

    @NotNull
    public final IReportCache getReportCache() {
        return reportCache;
    }

    @Nullable
    public final InterfaceC34017x9 getReportListener() {
        return reportListener;
    }

    @NotNull
    public final PriorityBlockingQueue<ReportTask> getReportQueue() {
        return reportQueue;
    }

    @Nullable
    public final IReporter getUploadProxy() {
        return uploadProxy;
    }

    public final boolean isStart() {
        return isStarted;
    }

    public final void post(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        reportQueue.offer(getRunnableTask(2, runnable));
    }

    public final void postDelayed(@NotNull final Runnable runnable, long delay) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        handler.postDelayed(new Runnable() { // from class: com.tencent.rmonitor.base.reporter.d
            @Override // java.lang.Runnable
            public final void run() {
                ReporterMachine.m103820postDelayed$lambda4(runnable);
            }
        }, delay);
    }

    public final void recordUploadResult(@NotNull ReportData reportData, boolean isSuccess, boolean hasRetry, int errorCode, int contentLength, long costInMs) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        boolean z11 = reportData.getDbId() > 0;
        if (isSuccess) {
            recordUpload(reportData, true, errorCode, contentLength, costInMs);
            return;
        }
        if (hasRetry) {
            recordUpload(reportData, false, errorCode, contentLength, costInMs);
        } else if (z11) {
            recordUpload(reportData, false, errorCode, contentLength, costInMs);
        } else {
            recordDiscard(reportData, DiscardReason.RETRY_EXCEEDED);
            recordUpload(reportData, false, errorCode, contentLength, costInMs);
        }
    }

    @Override // com.tencent.bugly.common.reporter.IReporter
    public boolean reportNow(@NotNull final ReportData reportData, @Nullable IReporter.ReportCallback callback) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v("RMonitor_report", "reportNow with " + reportData);
        }
        ReportStrategy.UploadStrategy uploadStrategy = reportData.getReportStrategy().getUploadStrategy();
        ReportStrategy.UploadStrategy uploadStrategy2 = ReportStrategy.UploadStrategy.UPLOAD_ANY;
        if (uploadStrategy != uploadStrategy2 && ReportStrategy.INSTANCE.isEmergencyPlugin(reportData.getPluginName())) {
            reportData.getReportStrategy().setUploadStrategy(uploadStrategy2);
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v("RMonitor_report", "adjust uploadStrategy to UPLOAD_ANY with " + reportData);
            }
        }
        if (whetherBlock(reportData)) {
            if (callback != null) {
                callback.onBlocked(reportData.getDbId());
            }
            return true;
        }
        if (reportData.getShouldRecordLinkData()) {
            C33588ce.m72684b().mo72364a(reportData.getParams());
            reportData.setShouldRecordLinkData(false);
        }
        if (checkNetStrategy(reportData)) {
            reportQueue.offer(new ReportTask(reportData.getReportStrategy().getPriority(), reportData, callback));
        } else {
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v("RMonitor_report", "not meet net strategy and cache report data with " + reportData);
            }
            reportQueue.offer(getRunnableTask(2, new Runnable() { // from class: com.tencent.rmonitor.base.reporter.a
                @Override // java.lang.Runnable
                public final void run() {
                    ReporterMachine.m103821reportNow$lambda3(reportData);
                }
            }));
            if (callback != null) {
                callback.onCached();
            }
        }
        return true;
    }

    public final void setHandler(@NotNull Handler handler2) {
        Intrinsics.checkNotNullParameter(handler2, "<set-?>");
        handler = handler2;
    }

    public final void setReportCache(@NotNull IReportCache iReportCache) {
        Intrinsics.checkNotNullParameter(iReportCache, "<set-?>");
        reportCache = iReportCache;
    }

    public final void setReportListener(@Nullable InterfaceC34017x9 interfaceC34017x9) {
        reportListener = interfaceC34017x9;
    }

    public final void setReportQueue(@NotNull PriorityBlockingQueue<ReportTask> priorityBlockingQueue) {
        Intrinsics.checkNotNullParameter(priorityBlockingQueue, "<set-?>");
        reportQueue = priorityBlockingQueue;
    }

    public final void setUploadProxy(@Nullable IReporter iReporter) {
        uploadProxy = iReporter;
    }

    public final void start() {
        if (isStarted) {
            return;
        }
        Logger.INSTANCE.mo77132i("RMonitor_report", "start");
        synchronized (this) {
            try {
                if (!isStarted) {
                    reportCache.reportCacheData();
                    reportThread.start();
                    isStarted = true;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private ReporterMachine() {
    }

    private final boolean checkNetStrategy(ReportData reportData) {
        if (reportData.getReportStrategy().getUploadStrategy() != ReportStrategy.UploadStrategy.UPLOAD_ANY) {
            if (reportData.getReportStrategy().getUploadStrategy() == ReportStrategy.UploadStrategy.UPLOAD_WIFI && NetworkWatcher.INSTANCE.isWiFiConnectedRealtime()) {
                return true;
            }
            reportData.getReportStrategy().getUploadStrategy();
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleRetryStrategy(int errorCode, final ReportData reportData, final IReporter.ReportCallback callback) {
        ReportStrategy reportStrategy = reportData.getReportStrategy();
        if (errorCode == 600 || errorCode == 700) {
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v("RMonitor_report", "oom or other error happen, do not retry with " + reportData);
            }
            reportStrategy.setAlreadyRetryTimes(reportStrategy.getRetryTimes());
        }
        int retryTimes = reportStrategy.getRetryTimes() - reportStrategy.getAlreadyRetryTimes();
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v("RMonitor_report", "can retry " + retryTimes + " times with " + reportData);
        }
        if (retryTimes <= 0) {
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v("RMonitor_report", "no chance to retry with " + reportData);
                return false;
            }
            return false;
        }
        reportStrategy.setAlreadyRetryTimes(reportStrategy.getAlreadyRetryTimes() + 1);
        int i11 = WhenMappings.$EnumSwitchMapping$0[reportStrategy.getRetryStrategy().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                long jPow = (long) (Math.pow(2.0d, reportStrategy.getAlreadyRetryTimes() - 1) * ((double) 60000));
                if (Logger.verbos) {
                    Logger.INSTANCE.mo77133v("RMonitor_report", "retry backoff with " + reportData + ' ' + jPow + "ms later");
                }
                handler.postDelayed(new Runnable() { // from class: com.tencent.rmonitor.base.reporter.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ReporterMachine.m103819handleRetryStrategy$lambda6(reportData, callback);
                    }
                }, jPow);
            }
        } else {
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v("RMonitor_report", "retry immediately with " + reportData);
            }
            reportQueue.offer(new ReportTask(reportData.getReportStrategy().getPriority(), reportData, callback));
        }
        return true;
    }

    private final void recordDiscard(ReportData reportData, DiscardReason discardReason) {
        if (reportData.getReportType() == 1) {
            JsonUtil jsonUtil = JsonUtil.INSTANCE;
            String strSafeGetJsonValue = jsonUtil.safeGetJsonValue(reportData.getParams(), C33820nf.f71149e);
            String strSafeGetJsonValue2 = jsonUtil.safeGetJsonValue(reportData.getParams(), C33820nf.f71150f);
            if (!TextUtils.isEmpty(strSafeGetJsonValue) && !TextUtils.isEmpty(strSafeGetJsonValue2)) {
                StatisticsReporter.INSTANCE.getInstance().recordDiscard(strSafeGetJsonValue, strSafeGetJsonValue2, discardReason);
            }
        }
    }

    private final void recordUpload(ReportData reportData, boolean isSuccess, int errorCode, int contentLength, long costInMs) {
        if (reportData.getReportType() == 1) {
            JsonUtil jsonUtil = JsonUtil.INSTANCE;
            String strSafeGetJsonValue = jsonUtil.safeGetJsonValue(reportData.getParams(), C33820nf.f71149e);
            String strSafeGetJsonValue2 = jsonUtil.safeGetJsonValue(reportData.getParams(), C33820nf.f71150f);
            if (!TextUtils.isEmpty(strSafeGetJsonValue) && !TextUtils.isEmpty(strSafeGetJsonValue2)) {
                StatisticsReporter.INSTANCE.getInstance().recordUpload(strSafeGetJsonValue, strSafeGetJsonValue2, isSuccess, contentLength, (int) costInMs);
                if (!isSuccess) {
                    reportErrorCode(reportData, errorCode, contentLength, costInMs);
                }
            }
        }
    }

    private final void reportErrorCode(ReportData reportData, int errorCode, int contentLength, long costInMs) {
        if (!C33868q0.a.f71513a.m74637a(AttaEvent.EventCode.RM_REPORT_ERROR_CODE)) {
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v("RMonitor_report", "reportErrorCode miss hit sampling, eventName: " + reportData.getEventName() + ", errorCode: " + errorCode);
                return;
            }
            return;
        }
        AttaEvent attaEvent = new AttaEvent(null, 1, null);
        attaEvent.setEventCode(AttaEvent.EventCode.RM_REPORT_ERROR_CODE);
        attaEvent.setEventResult(0);
        attaEvent.setErrorCode(errorCode);
        attaEvent.setEventCost((int) costInMs);
        JsonUtil jsonUtil = JsonUtil.INSTANCE;
        attaEvent.setParam0(jsonUtil.safeGetJsonValue(reportData.getParams(), C33820nf.f71149e));
        attaEvent.setParam1(jsonUtil.safeGetJsonValue(reportData.getParams(), C33820nf.f71150f));
        attaEvent.setParam2(String.valueOf(contentLength));
        attaEvent.setParam3(jsonUtil.safeGetJsonValue(reportData.getParams(), C33820nf.f71156l));
        AttaEventReporter.INSTANCE.getInstance().addEvent(attaEvent);
    }

    private final boolean whetherBlock(ReportData reportData) {
        String pluginName = reportData.getPluginName();
        PluginController pluginController = PluginController.INSTANCE;
        if (!pluginController.whetherPluginSampling(pluginName)) {
            Logger.INSTANCE.mo77130d("RMonitor_report", "block report for not hit sampling with " + reportData);
            return true;
        }
        if (reportData.getDbId() <= 0 && !pluginController.canCollect(pluginName)) {
            Logger.INSTANCE.mo77130d("RMonitor_report", "block report for exceed limit with " + reportData);
            return true;
        }
        return false;
    }
}
