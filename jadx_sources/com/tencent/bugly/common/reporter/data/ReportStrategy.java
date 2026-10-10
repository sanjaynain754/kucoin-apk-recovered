package com.tencent.bugly.common.reporter.data;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0003)*+B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010'\u001a\u00020(H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006,"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/data/ReportStrategy;", "", "()V", "alreadyRetryTimes", "", "getAlreadyRetryTimes", "()I", "setAlreadyRetryTimes", "(I)V", "connectTimeout", "getConnectTimeout", "setConnectTimeout", "needCache", "", "getNeedCache", "()Z", "setNeedCache", "(Z)V", "priority", "getPriority", "setPriority", "readTimeout", "getReadTimeout", "setReadTimeout", "retryStrategy", "Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;", "getRetryStrategy", "()Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;", "setRetryStrategy", "(Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;)V", "retryTimes", "getRetryTimes", "setRetryTimes", "uploadStrategy", "Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;", "getUploadStrategy", "()Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;", "setUploadStrategy", "(Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;)V", "toString", "", "Companion", "RetryStrategy", "UploadStrategy", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ReportStrategy {
    public static final int DEFAULT_BACKOFF_RETRY_DURATION = 60000;
    public static final int DEFAULT_CONNECT_TIMEOUT = 30000;
    public static final int DEFAULT_READ_TIMEOUT = 30000;
    public static final int DEFAULT_RETRY_TIMES = 3;
    private int alreadyRetryTimes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HashSet<String> emergencyPluginSet = new HashSet<>();
    private boolean needCache = true;

    @IntRange(from = 0, m1553to = 4)
    private int priority = 2;
    private int connectTimeout = 30000;
    private int readTimeout = 30000;
    private int retryTimes = 3;

    @NotNull
    private RetryStrategy retryStrategy = RetryStrategy.RETRY_BACKOFF;

    @NotNull
    private UploadStrategy uploadStrategy = UploadStrategy.UPLOAD_WIFI;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/data/ReportStrategy$Companion;", "", "()V", "DEFAULT_BACKOFF_RETRY_DURATION", "", "DEFAULT_CONNECT_TIMEOUT", "DEFAULT_READ_TIMEOUT", "DEFAULT_RETRY_TIMES", "emergencyPluginSet", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "addEmergencyPlugin", "", "pluginName", "isEmergencyPlugin", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void addEmergencyPlugin(@NotNull String pluginName) {
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            if (!TextUtils.isEmpty(pluginName) && !ReportStrategy.emergencyPluginSet.contains(pluginName)) {
                ReportStrategy.emergencyPluginSet.add(pluginName);
            }
        }

        public final boolean isEmergencyPlugin(@NotNull String pluginName) {
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            if (!TextUtils.isEmpty(pluginName) && ReportStrategy.emergencyPluginSet.contains(pluginName)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;", "", "(Ljava/lang/String;I)V", "RETRY_IMMEDIATELY", "RETRY_BACKOFF", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public enum RetryStrategy {
        RETRY_IMMEDIATELY,
        RETRY_BACKOFF
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;", "", "(Ljava/lang/String;I)V", "UPLOAD_WIFI", "UPLOAD_ANY", "UPLOAD_NEXT_LAUNCH", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public enum UploadStrategy {
        UPLOAD_WIFI,
        UPLOAD_ANY,
        UPLOAD_NEXT_LAUNCH
    }

    public final int getAlreadyRetryTimes() {
        return this.alreadyRetryTimes;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final boolean getNeedCache() {
        return this.needCache;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    @NotNull
    public final RetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    public final int getRetryTimes() {
        return this.retryTimes;
    }

    @NotNull
    public final UploadStrategy getUploadStrategy() {
        return this.uploadStrategy;
    }

    public final void setAlreadyRetryTimes(int i11) {
        this.alreadyRetryTimes = i11;
    }

    public final void setConnectTimeout(int i11) {
        this.connectTimeout = i11;
    }

    public final void setNeedCache(boolean z11) {
        this.needCache = z11;
    }

    public final void setPriority(int i11) {
        this.priority = i11;
    }

    public final void setReadTimeout(int i11) {
        this.readTimeout = i11;
    }

    public final void setRetryStrategy(@NotNull RetryStrategy retryStrategy) {
        Intrinsics.checkNotNullParameter(retryStrategy, "<set-?>");
        this.retryStrategy = retryStrategy;
    }

    public final void setRetryTimes(int i11) {
        this.retryTimes = i11;
    }

    public final void setUploadStrategy(@NotNull UploadStrategy uploadStrategy) {
        Intrinsics.checkNotNullParameter(uploadStrategy, "<set-?>");
        this.uploadStrategy = uploadStrategy;
    }

    @NotNull
    public String toString() {
        return "ReportStrategy(needCache=" + this.needCache + ", priority=" + this.priority + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", retryTimes=" + this.retryTimes + ", retryStrategy=" + this.retryStrategy + ", uploadStrategy=" + this.uploadStrategy + ", alreadyRetryTimes=" + this.alreadyRetryTimes + ')';
    }
}
