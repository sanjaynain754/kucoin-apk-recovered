package com.tencent.rmonitor.looper.meta;

import androidx.annotation.Keep;
import com.tencent.bugly.common.utils.RecyclablePool;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0019\u0010\f\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010J%\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u0012J \u0010\u0013\u001a\u00020\n2\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0004\u0012\u00020\n0\u0015J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/meta/StackQueue;", "Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;", "()V", "curStackFrame", "Lcom/tencent/rmonitor/looper/meta/StackFrame;", "sliceIndex", "", "stackFrameQueue", "", "addStackFrameToQueue", "", "stackFrame", "addStackTrace", "stackTrace", "", "Ljava/lang/StackTraceElement;", "([Ljava/lang/StackTraceElement;)V", "buildNewFrame", "(I[Ljava/lang/StackTraceElement;)Lcom/tencent/rmonitor/looper/meta/StackFrame;", "dealStackTrace", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "reset", "resetCurStackFrame", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class StackQueue extends RecyclablePool.Recyclable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final PoolProvider poolProvider = new PoolProvider(StackQueue.class, 35);

    @Nullable
    private StackFrame curStackFrame;
    private int sliceIndex;

    @NotNull
    private final List<StackFrame> stackFrameQueue = new ArrayList();

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/meta/StackQueue$Companion;", "", "()V", "poolProvider", "Lcom/tencent/rmonitor/looper/meta/PoolProvider;", "obtain", "Lcom/tencent/rmonitor/looper/meta/StackQueue;", "recycle", "", "stackQueue", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void recycle(@NotNull StackQueue stackQueue) {
            Intrinsics.checkNotNullParameter(stackQueue, "stackQueue");
            RecyclablePool pool = StackQueue.poolProvider.getPool();
            Intrinsics.checkNotNullExpressionValue(pool, "poolProvider.pool");
            pool.recycle(stackQueue);
        }

        @Nullable
        public final StackQueue obtain() {
            RecyclablePool pool = StackQueue.poolProvider.getPool();
            Intrinsics.checkNotNullExpressionValue(pool, "poolProvider.pool");
            RecyclablePool.Recyclable recyclableObtain = pool.obtain(StackQueue.class);
            if (recyclableObtain != null) {
                return (StackQueue) recyclableObtain;
            }
            return null;
        }
    }

    private final void resetCurStackFrame() {
        this.curStackFrame = null;
    }

    private final void addStackFrameToQueue(StackFrame stackFrame) {
        if (stackFrame != null) {
            stackFrame.setEndTime(System.currentTimeMillis());
            this.stackFrameQueue.add(stackFrame);
        }
    }

    private final StackFrame buildNewFrame(int sliceIndex, StackTraceElement[] stackTrace) {
        StackFrame stackFrameObtain = StackFrame.INSTANCE.obtain();
        if (stackFrameObtain != null) {
            stackFrameObtain.init(sliceIndex, stackTrace);
        }
        return stackFrameObtain;
    }

    public final void addStackTrace(@NotNull StackTraceElement[] stackTrace) {
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        StackFrame stackFrame = this.curStackFrame;
        if (stackFrame == null) {
            this.curStackFrame = buildNewFrame(this.sliceIndex, stackTrace);
        } else if (stackFrame.isSameStackTrace(stackTrace)) {
            stackFrame.setFrameCount(stackFrame.getFrameCount() + 1);
        } else {
            addStackFrameToQueue(stackFrame);
            this.curStackFrame = buildNewFrame(this.sliceIndex, stackTrace);
        }
        this.sliceIndex++;
    }

    public final void dealStackTrace(@NotNull Function1<? super List<StackFrame>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        addStackFrameToQueue(this.curStackFrame);
        resetCurStackFrame();
        callback.invoke(this.stackFrameQueue);
    }

    @Override // com.tencent.bugly.common.utils.RecyclablePool.Recyclable
    public void reset() {
        StackFrame stackFrame = this.curStackFrame;
        if (stackFrame != null) {
            StackFrame.INSTANCE.recycle(stackFrame);
        }
        resetCurStackFrame();
        int size = this.stackFrameQueue.size();
        for (int i11 = 0; i11 < size; i11++) {
            StackFrame.INSTANCE.recycle(this.stackFrameQueue.get(i11));
        }
        this.stackFrameQueue.clear();
        this.sliceIndex = 0;
    }
}
