package com.tencent.rmonitor.looper.meta;

import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import com.tencent.bugly.common.utils.RecyclablePool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b¨\u0006'"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/meta/StackFrame;", "Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;", "()V", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "frameCount", "", "getFrameCount", "()I", "setFrameCount", "(I)V", "frameIndex", "getFrameIndex", "setFrameIndex", StackTraceHelper.STACK_KEY, "", "Ljava/lang/StackTraceElement;", "getStack", "()[Ljava/lang/StackTraceElement;", "setStack", "([Ljava/lang/StackTraceElement;)V", "[Ljava/lang/StackTraceElement;", "startTime", "getStartTime", "setStartTime", "init", "", "stackTrace", "(I[Ljava/lang/StackTraceElement;)V", "isSameStackTrace", "", "fromStack", "([Ljava/lang/StackTraceElement;)Z", "reset", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class StackFrame extends RecyclablePool.Recyclable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final PoolProvider poolProvider = new PoolProvider(StackFrame.class, 50);
    private long endTime;
    private int frameCount;
    private int frameIndex;

    @Nullable
    private StackTraceElement[] stack;
    private long startTime;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/meta/StackFrame$Companion;", "", "()V", "poolProvider", "Lcom/tencent/rmonitor/looper/meta/PoolProvider;", "obtain", "Lcom/tencent/rmonitor/looper/meta/StackFrame;", "recycle", "", "stackFrame", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void recycle(@NotNull StackFrame stackFrame) {
            Intrinsics.checkNotNullParameter(stackFrame, "stackFrame");
            RecyclablePool pool = StackFrame.poolProvider.getPool();
            Intrinsics.checkNotNullExpressionValue(pool, "poolProvider.pool");
            pool.recycle(stackFrame);
        }

        @Nullable
        public final StackFrame obtain() {
            RecyclablePool pool = StackFrame.poolProvider.getPool();
            Intrinsics.checkNotNullExpressionValue(pool, "poolProvider.pool");
            RecyclablePool.Recyclable recyclableObtain = pool.obtain(StackFrame.class);
            if (recyclableObtain != null) {
                return (StackFrame) recyclableObtain;
            }
            return null;
        }
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getFrameCount() {
        return this.frameCount;
    }

    public final int getFrameIndex() {
        return this.frameIndex;
    }

    @Nullable
    public final StackTraceElement[] getStack() {
        return this.stack;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void init(int frameIndex, @NotNull StackTraceElement[] stackTrace) {
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        this.frameIndex = frameIndex;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.startTime = jCurrentTimeMillis;
        this.endTime = jCurrentTimeMillis;
        this.frameCount = 1;
        this.stack = stackTrace;
    }

    public final boolean isSameStackTrace(@NotNull StackTraceElement[] fromStack) {
        Intrinsics.checkNotNullParameter(fromStack, "fromStack");
        StackTraceElement[] stackTraceElementArr = this.stack;
        if (stackTraceElementArr == null || stackTraceElementArr.length != fromStack.length) {
            return false;
        }
        int length = stackTraceElementArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (!Intrinsics.areEqual(stackTraceElementArr[i11], fromStack[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.bugly.common.utils.RecyclablePool.Recyclable
    public void reset() {
        this.startTime = 0L;
        this.endTime = 0L;
        this.frameCount = 0;
        this.frameIndex = 0;
        this.stack = null;
    }

    public final void setEndTime(long j11) {
        this.endTime = j11;
    }

    public final void setFrameCount(int i11) {
        this.frameCount = i11;
    }

    public final void setFrameIndex(int i11) {
        this.frameIndex = i11;
    }

    public final void setStack(@Nullable StackTraceElement[] stackTraceElementArr) {
        this.stack = stackTraceElementArr;
    }

    public final void setStartTime(long j11) {
        this.startTime = j11;
    }
}
