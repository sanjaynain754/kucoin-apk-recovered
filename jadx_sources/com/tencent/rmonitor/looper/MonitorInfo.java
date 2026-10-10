package com.tencent.rmonitor.looper;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.bugly.common.utils.RecyclablePool;
import com.tencent.bugly.proguard.C33878qa;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\bI\u0010JJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0006\u0010\u0010\u001a\u00020\u0000J\u0006\u0010\u0011\u001a\u00020\u0002J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0004J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\"\u0010\u001b\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010$\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\"\u00100\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010(\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R$\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<\"\u0004\b=\u0010>R\u0017\u0010@\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010D\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010;\u001a\u0004\bD\u0010<\"\u0004\bE\u0010>R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0016\u0010F\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010;¨\u0006L"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/MonitorInfo;", "Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;", "", "getQuickTraceFlag", "", "delay", "", "setCollectStackMsgDelayInMs", "cost", "setCollectStackMsgCostInUs", "", "count", "setCollectStackMsgCount", "flag", "setQuickTraceFlag", "reset", "copy", "checkUseFileToTransStacks", "collectStackMsgDelayInMs", "collectStackMsgCostInUs", "addCollectStackMsgSample", "getCollectStackMsgCount", "", "getAvgCollectStackMsgCost", "getAvgCollectStackMsgDelay", "", "toString", "threadId", "Ljava/lang/String;", "getThreadId", "()Ljava/lang/String;", "setThreadId", "(Ljava/lang/String;)V", "threadName", "getThreadName", "setThreadName", DropFrameTable.COLUMN_SCENE, "getScene", "setScene", "lastStackRequestTime", "J", "getLastStackRequestTime", "()J", "setLastStackRequestTime", "(J)V", "cacheRealStackTime", "getCacheRealStackTime", "setCacheRealStackTime", TypedValues.TransitionType.S_DURATION, "getDuration", "setDuration", "Lorg/json/JSONObject;", "fullStack", "Lorg/json/JSONObject;", "getFullStack", "()Lorg/json/JSONObject;", "setFullStack", "(Lorg/json/JSONObject;)V", "isAppInForeground", "Z", "()Z", "setAppInForeground", "(Z)V", "Lcom/tencent/bugly/proguard/qa;", "lagParam", "Lcom/tencent/bugly/proguard/qa;", "getLagParam", "()Lcom/tencent/bugly/proguard/qa;", "isDetectedLongLag", "setDetectedLongLag", "collectStackMsgCount", "I", "quickTraceFlag", "<init>", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class MonitorInfo extends RecyclablePool.Recyclable {
    public static final int MAX_STACK_LENGTH = 524288;
    public static final int POOL_CAPACITY = 10;

    @NotNull
    public static final String TAG = "RMonitor_looper_MonitorInfo";
    private volatile long cacheRealStackTime;
    private long collectStackMsgCostInUs;
    private int collectStackMsgCount;
    private long collectStackMsgDelayInMs;
    private volatile long duration;

    @Nullable
    private volatile JSONObject fullStack;
    private volatile boolean isAppInForeground;
    private boolean isDetectedLongLag;
    private volatile long lastStackRequestTime;
    private boolean quickTraceFlag;

    @Nullable
    private volatile String scene;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ThreadLocal<RecyclablePool> recyclablePool = new ThreadLocal<>();

    @NotNull
    private volatile String threadId = "";

    @NotNull
    private volatile String threadName = "";

    @NotNull
    private final C33878qa lagParam = new C33878qa();

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/MonitorInfo$Companion;", "", "()V", "MAX_STACK_LENGTH", "", "POOL_CAPACITY", "TAG", "", "recyclablePool", "Ljava/lang/ThreadLocal;", "Lcom/tencent/bugly/common/utils/RecyclablePool;", "getRecyclablePool", "obtain", "Lcom/tencent/rmonitor/looper/MonitorInfo;", "recycle", "", "monitorInfo", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void recycle(@NotNull MonitorInfo monitorInfo) {
            Intrinsics.checkNotNullParameter(monitorInfo, "monitorInfo");
            getRecyclablePool().recycle(monitorInfo);
        }

        private final RecyclablePool getRecyclablePool() {
            RecyclablePool recyclablePool = (RecyclablePool) MonitorInfo.recyclablePool.get();
            if (recyclablePool == null) {
                RecyclablePool recyclablePool2 = new RecyclablePool(MonitorInfo.class, 10);
                MonitorInfo.recyclablePool.set(recyclablePool2);
                return recyclablePool2;
            }
            return recyclablePool;
        }

        @Nullable
        public final MonitorInfo obtain() {
            RecyclablePool.Recyclable recyclableObtain = getRecyclablePool().obtain(MonitorInfo.class);
            if (recyclableObtain != null) {
                return (MonitorInfo) recyclableObtain;
            }
            return null;
        }
    }

    public final boolean checkUseFileToTransStacks() {
        try {
            String strValueOf = this.fullStack != null ? String.valueOf(this.fullStack) : null;
            return strValueOf != null && strValueOf.length() > 524288;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void addCollectStackMsgSample(long collectStackMsgDelayInMs, long collectStackMsgCostInUs) {
        if (collectStackMsgDelayInMs > 0) {
            this.collectStackMsgDelayInMs += collectStackMsgDelayInMs;
        }
        if (collectStackMsgCostInUs > 0) {
            this.collectStackMsgCostInUs += collectStackMsgCostInUs;
        }
        this.collectStackMsgCount++;
    }

    @NotNull
    public final MonitorInfo copy() {
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.threadId = this.threadId;
        monitorInfo.threadName = this.threadName;
        monitorInfo.scene = this.scene;
        monitorInfo.lastStackRequestTime = this.lastStackRequestTime;
        monitorInfo.cacheRealStackTime = this.cacheRealStackTime;
        monitorInfo.duration = this.duration;
        monitorInfo.fullStack = this.fullStack;
        monitorInfo.isAppInForeground = this.isAppInForeground;
        monitorInfo.lagParam.m74679a(this.lagParam);
        monitorInfo.collectStackMsgDelayInMs = this.collectStackMsgDelayInMs;
        monitorInfo.collectStackMsgCostInUs = this.collectStackMsgCostInUs;
        monitorInfo.collectStackMsgCount = this.collectStackMsgCount;
        monitorInfo.quickTraceFlag = this.quickTraceFlag;
        monitorInfo.isDetectedLongLag = this.isDetectedLongLag;
        return monitorInfo;
    }

    public final double getAvgCollectStackMsgCost() {
        int i11 = this.collectStackMsgCount;
        if (i11 > 0) {
            return (this.collectStackMsgCostInUs * 1.0d) / ((double) i11);
        }
        return 0.0d;
    }

    public final long getAvgCollectStackMsgDelay() {
        int i11 = this.collectStackMsgCount;
        if (i11 > 0) {
            return this.collectStackMsgDelayInMs / ((long) i11);
        }
        return 0L;
    }

    public final long getCacheRealStackTime() {
        return this.cacheRealStackTime;
    }

    public final int getCollectStackMsgCount() {
        return this.collectStackMsgCount;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final JSONObject getFullStack() {
        return this.fullStack;
    }

    @NotNull
    public final C33878qa getLagParam() {
        return this.lagParam;
    }

    public final long getLastStackRequestTime() {
        return this.lastStackRequestTime;
    }

    public final boolean getQuickTraceFlag() {
        return this.quickTraceFlag;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    @NotNull
    public final String getThreadId() {
        return this.threadId;
    }

    @NotNull
    public final String getThreadName() {
        return this.threadName;
    }

    /* JADX INFO: renamed from: isAppInForeground, reason: from getter */
    public final boolean getIsAppInForeground() {
        return this.isAppInForeground;
    }

    /* JADX INFO: renamed from: isDetectedLongLag, reason: from getter */
    public final boolean getIsDetectedLongLag() {
        return this.isDetectedLongLag;
    }

    @Override // com.tencent.bugly.common.utils.RecyclablePool.Recyclable
    public void reset() {
        this.threadId = "";
        this.threadName = "";
        this.scene = null;
        this.lastStackRequestTime = 0L;
        this.cacheRealStackTime = 0L;
        this.duration = 0L;
        this.fullStack = null;
        this.isAppInForeground = false;
        this.lagParam.m74678a();
        this.collectStackMsgDelayInMs = 0L;
        this.collectStackMsgCostInUs = 0L;
        this.collectStackMsgCount = 0;
        this.quickTraceFlag = false;
        this.isDetectedLongLag = false;
    }

    public final void setAppInForeground(boolean z11) {
        this.isAppInForeground = z11;
    }

    public final void setCacheRealStackTime(long j11) {
        this.cacheRealStackTime = j11;
    }

    public final void setCollectStackMsgCostInUs(long cost) {
        this.collectStackMsgCostInUs = cost;
    }

    public final void setCollectStackMsgCount(int count) {
        this.collectStackMsgCount = count;
    }

    public final void setCollectStackMsgDelayInMs(long delay) {
        this.collectStackMsgDelayInMs = delay;
    }

    public final void setDetectedLongLag(boolean z11) {
        this.isDetectedLongLag = z11;
    }

    public final void setDuration(long j11) {
        this.duration = j11;
    }

    public final void setFullStack(@Nullable JSONObject jSONObject) {
        this.fullStack = jSONObject;
    }

    public final void setLastStackRequestTime(long j11) {
        this.lastStackRequestTime = j11;
    }

    public final void setQuickTraceFlag(boolean flag) {
        this.quickTraceFlag = flag;
    }

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }

    public final void setThreadId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.threadId = str;
    }

    public final void setThreadName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.threadName = str;
    }

    @NotNull
    public String toString() {
        return "MonitorInfo(threadId=" + this.threadId + ", threadName=" + this.threadName + ", scene=" + this.scene + ", lastStackRequestTime=" + this.lastStackRequestTime + ", cacheRealStackTime=" + this.cacheRealStackTime + ", duration=" + this.duration + ", isAppInForeground=" + this.isAppInForeground + ", lagParam=" + this.lagParam + ", collectStackMsgDelayInMs=" + this.collectStackMsgDelayInMs + ", collectStackMsgCostInUs=" + this.collectStackMsgCostInUs + ", collectStackMsgCount=" + this.collectStackMsgCount + ", quickTraceFlag=" + this.quickTraceFlag + ", isDetectedLongLag=" + this.isDetectedLongLag;
    }
}
