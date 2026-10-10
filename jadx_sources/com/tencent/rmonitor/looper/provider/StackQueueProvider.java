package com.tencent.rmonitor.looper.provider;

import android.os.Handler;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.bugly.proguard.C33789m5;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.looper.MonitorInfo;
import com.tencent.rmonitor.looper.meta.StackFrame;
import com.tencent.rmonitor.looper.meta.StackQueue;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J#\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\u000bJ\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/provider/StackQueueProvider;", "Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;", "()V", "realRecycleStackQueueCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "stackQueueMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/tencent/rmonitor/looper/meta/StackQueue;", "tryRecycleStackQueueCount", "beginTrace", "", "monitorInfo", "Lcom/tencent/rmonitor/looper/MonitorInfo;", "checkStackTraceNormal", "dealStackFrameQueue", "Lorg/json/JSONObject;", "stackFrameQueue", "", "Lcom/tencent/rmonitor/looper/meta/StackFrame;", "dealStackTrace", "", "buffer", "Ljava/lang/StringBuffer;", "stackTrace", "", "Ljava/lang/StackTraceElement;", "(Ljava/lang/StringBuffer;[Ljava/lang/StackTraceElement;)Ljava/lang/String;", "endTrace", "isOverThreshold", "", "onTrace", "(Lcom/tencent/rmonitor/looper/MonitorInfo;[Ljava/lang/StackTraceElement;)V", "recycleRemainStackQueue", "recycleStackQueue", "stackQueue", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public class StackQueueProvider extends MultiStackProvider {
    public static final int MAX_COUNT_OF_NOT_RECYCLE_STACK_QUEUE = 100;
    public static final int MAX_COUNT_OF_STACK_QUEUE_MAP = 20;

    @NotNull
    public static final String TAG = "RMonitor_looper_StackProvider";

    @NotNull
    private final ConcurrentHashMap<Long, StackQueue> stackQueueMap = new ConcurrentHashMap<>();

    @NotNull
    private final AtomicInteger tryRecycleStackQueueCount = new AtomicInteger();

    @NotNull
    private final AtomicInteger realRecycleStackQueueCount = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject dealStackFrameQueue(List<StackFrame> stackFrameQueue) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        StringBuffer stringBuffer = new StringBuffer(2048);
        int size = stackFrameQueue.size();
        for (int i11 = 0; i11 < size; i11++) {
            StackFrame stackFrame = stackFrameQueue.get(i11);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", C33789m5.f70921k);
            jSONObject.put("thread_name", getLooperThreadName());
            jSONObject.put("thread_id", getLooperThreadId());
            jSONObject.put("index", stackFrame.getFrameIndex());
            jSONObject.put("repeat_count", stackFrame.getFrameCount());
            jSONObject.put("timestamp", stackFrame.getStartTime());
            jSONObject.put(C33675gh.f70010p, stackFrame.getEndTime());
            jSONObject.put("call_stack", dealStackTrace(stringBuffer, stackFrame.getStack()));
            jSONArray.put(jSONObject);
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("stacks", jSONArray);
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: endTrace$lambda-1, reason: not valid java name */
    public static final void m103831endTrace$lambda1(StackQueueProvider this$0, StackQueue stackQueue) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(stackQueue, "$stackQueue");
        this$0.recycleStackQueue(stackQueue);
    }

    private final void recycleStackQueue(StackQueue stackQueue) {
        StackQueue.INSTANCE.recycle(stackQueue);
        this.realRecycleStackQueueCount.incrementAndGet();
        recycleRemainStackQueue();
        checkStackTraceNormal();
    }

    @Override // com.tencent.rmonitor.looper.provider.MultiStackProvider
    public void beginTrace(@NotNull MonitorInfo monitorInfo) {
        Intrinsics.checkNotNullParameter(monitorInfo, "monitorInfo");
    }

    @Override // com.tencent.rmonitor.looper.provider.BaseStackProvider
    public void checkStackTraceNormal() {
        int size = this.stackQueueMap.size();
        int i11 = this.tryRecycleStackQueueCount.get() - this.realRecycleStackQueueCount.get();
        if (size > 20 || i11 > 100) {
            markStackTrace(false);
        } else {
            if (size >= 10 || i11 >= 50) {
                return;
            }
            markStackTrace(true);
        }
    }

    @Override // com.tencent.rmonitor.looper.provider.MultiStackProvider
    public void endTrace(@NotNull final MonitorInfo monitorInfo, boolean isOverThreshold) {
        Handler stackThreadHandler;
        Intrinsics.checkNotNullParameter(monitorInfo, "monitorInfo");
        boolean isDetectedLongLag = monitorInfo.getIsDetectedLongLag();
        final StackQueue stackQueueRemove = isDetectedLongLag ? this.stackQueueMap.get(Long.valueOf(monitorInfo.getLastStackRequestTime())) : this.stackQueueMap.remove(Long.valueOf(monitorInfo.getLastStackRequestTime()));
        if (stackQueueRemove == null) {
            return;
        }
        if (isOverThreshold) {
            stackQueueRemove.dealStackTrace(new Function1<List<StackFrame>, Unit>() { // from class: com.tencent.rmonitor.looper.provider.StackQueueProvider.endTrace.1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<StackFrame> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull List<StackFrame> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    try {
                        monitorInfo.setFullStack(this.dealStackFrameQueue(it));
                    } catch (Throwable unused) {
                        monitorInfo.setFullStack(null);
                    }
                }
            });
        }
        if (!isDetectedLongLag && (stackThreadHandler = getStackThreadHandler()) != null) {
            this.tryRecycleStackQueueCount.incrementAndGet();
            stackThreadHandler.post(new Runnable() { // from class: com.tencent.rmonitor.looper.provider.a
                @Override // java.lang.Runnable
                public final void run() {
                    StackQueueProvider.m103831endTrace$lambda1(this.f75272b, stackQueueRemove);
                }
            });
        }
        checkStackTraceNormal();
    }

    @Override // com.tencent.rmonitor.looper.provider.MultiStackProvider
    public void onTrace(@NotNull MonitorInfo monitorInfo, @NotNull StackTraceElement[] stackTrace) {
        Intrinsics.checkNotNullParameter(monitorInfo, "monitorInfo");
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        StackQueue stackQueueObtain = this.stackQueueMap.get(Long.valueOf(monitorInfo.getLastStackRequestTime()));
        if (stackQueueObtain == null && isCurrentMsg(monitorInfo)) {
            stackQueueObtain = StackQueue.INSTANCE.obtain();
            if (stackQueueObtain != null) {
                this.stackQueueMap.put(Long.valueOf(monitorInfo.getLastStackRequestTime()), stackQueueObtain);
            }
        } else if (stackQueueObtain == null) {
            Logger.INSTANCE.mo77130d("RMonitor_looper_StackProvider", "deal msg not latest msg on trace, deal: " + monitorInfo.getLastStackRequestTime());
        }
        if (stackQueueObtain != null) {
            stackQueueObtain.addStackTrace(stackTrace);
        }
    }

    public final void recycleRemainStackQueue() {
        StackQueue stackQueueRemove;
        if (this.stackQueueMap.size() > 20) {
            Enumeration<Long> enumerationKeys = this.stackQueueMap.keys();
            Intrinsics.checkNotNullExpressionValue(enumerationKeys, "stackQueueMap.keys()");
            Iterator it = CollectionsKt.iterator(enumerationKeys);
            while (it.hasNext()) {
                Long l11 = (Long) it.next();
                if (l11 != null && (stackQueueRemove = this.stackQueueMap.remove(l11)) != null) {
                    this.tryRecycleStackQueueCount.incrementAndGet();
                    StackQueue.INSTANCE.recycle(stackQueueRemove);
                    this.realRecycleStackQueueCount.incrementAndGet();
                }
            }
        }
    }

    private final String dealStackTrace(StringBuffer buffer, StackTraceElement[] stackTrace) {
        buffer.delete(0, buffer.length());
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                buffer.append(stackTraceElement.toString());
                buffer.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
        }
        String string = buffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }
}
