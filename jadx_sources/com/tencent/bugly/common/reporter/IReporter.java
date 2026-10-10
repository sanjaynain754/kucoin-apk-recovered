package com.tencent.bugly.common.reporter;

import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\t"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/IReporter;", "", "reportNow", "", "reportData", "Lcom/tencent/bugly/common/reporter/data/ReportData;", TUIConstants.TUIChat.CALL_BACK, "Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;", "ReportCallback", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface IReporter {

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean reportNow$default(IReporter iReporter, ReportData reportData, ReportCallback reportCallback, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportNow");
            }
            if ((i11 & 2) != 0) {
                reportCallback = null;
            }
            return iReporter.reportNow(reportData, reportCallback);
        }
    }

    boolean reportNow(@NotNull ReportData reportData, @Nullable ReportCallback callback);

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J(\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H&¨\u0006\r"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;", "", "onBlocked", "", "dbId", "", "onCached", "onFailure", "errorCode", "errorMsg", "", "contentLength", "onSuccess", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public interface ReportCallback {
        void onBlocked(int dbId);

        void onCached();

        void onFailure(int errorCode, @NotNull String errorMsg, int dbId, int contentLength);

        void onSuccess(int dbId, int contentLength);

        /* JADX INFO: compiled from: BUGLY */
        @Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
        public static final class DefaultImpls {
            public static void onCached(@NotNull ReportCallback reportCallback) {
            }

            public static void onBlocked(@NotNull ReportCallback reportCallback, int i11) {
            }
        }
    }
}
