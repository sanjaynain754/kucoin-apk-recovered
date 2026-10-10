package com.facebook.react.modules.core;

import android.view.Choreographer;
import androidx.annotation.GuardedBy;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.ChoreographerProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayDeque;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p302h6.C38115a;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ReactChoreographer.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fJ\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\b\bR\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/facebook/react/modules/core/ReactChoreographer;", "", "choreographerProvider", "Lcom/facebook/react/internal/ChoreographerProvider;", "<init>", "(Lcom/facebook/react/internal/ChoreographerProvider;)V", "choreographer", "Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;", "choreographer$1", "callbackQueues", "", "Ljava/util/ArrayDeque;", "Landroid/view/Choreographer$FrameCallback;", "[Ljava/util/ArrayDeque;", "totalCallbacks", "", "hasPostedCallback", "", "frameCallback", "postFrameCallback", "", "type", "Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;", TUIConstants.TUIChat.CALL_BACK, "removeFrameCallback", "postFrameCallbackOnChoreographer", "maybeRemoveFrameCallback", "CallbackType", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReactChoreographer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactChoreographer.kt\ncom/facebook/react/modules/core/ReactChoreographer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
public final class ReactChoreographer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static ReactChoreographer choreographer;

    @NotNull
    private final ArrayDeque<Choreographer.FrameCallback>[] callbackQueues;

    /* JADX INFO: renamed from: choreographer$1, reason: from kotlin metadata */
    @Nullable
    private ChoreographerProvider.Choreographer choreographer;

    @NotNull
    private final Choreographer.FrameCallback frameCallback;

    @GuardedBy("callbackQueues")
    private boolean hasPostedCallback;
    private int totalCallbacks;

    /* JADX INFO: compiled from: ReactChoreographer.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m90084d2 = {"Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;", "", "order", "", "<init>", "(Ljava/lang/String;II)V", "getOrder$ReactAndroid_release", "()I", "PERF_MARKERS", "DISPATCH_UI", "NATIVE_ANIMATED_MODULE", "TIMERS_EVENTS", "IDLE_EVENT", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public enum CallbackType {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final int order;

        @NotNull
        public static EnumEntries<CallbackType> getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getOrder$ReactAndroid_release, reason: from getter */
        public final int getOrder() {
            return this.order;
        }

        CallbackType(int i11) {
            this.order = i11;
        }
    }

    /* JADX INFO: compiled from: ReactChoreographer.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u0005H\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\b\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/facebook/react/modules/core/ReactChoreographer$Companion;", "", "<init>", "()V", "choreographer", "Lcom/facebook/react/modules/core/ReactChoreographer;", "initialize", "", "choreographerProvider", "Lcom/facebook/react/internal/ChoreographerProvider;", "getInstance", "overrideInstanceForTest", "instance", "overrideInstanceForTest$ReactAndroid_release", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nReactChoreographer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactChoreographer.kt\ncom/facebook/react/modules/core/ReactChoreographer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void initialize(@NotNull ChoreographerProvider choreographerProvider) {
            Intrinsics.checkNotNullParameter(choreographerProvider, "choreographerProvider");
            if (ReactChoreographer.choreographer == null) {
                ReactChoreographer.choreographer = new ReactChoreographer(choreographerProvider, null);
            }
        }

        @JvmStatic
        @NotNull
        public final ReactChoreographer getInstance() {
            ReactChoreographer reactChoreographer = ReactChoreographer.choreographer;
            if (reactChoreographer != null) {
                return reactChoreographer;
            }
            throw new IllegalStateException("ReactChoreographer needs to be initialized.");
        }

        @VisibleForTesting
        @Nullable
        public final ReactChoreographer overrideInstanceForTest$ReactAndroid_release(@Nullable ReactChoreographer instance) {
            ReactChoreographer reactChoreographer = ReactChoreographer.choreographer;
            ReactChoreographer.choreographer = instance;
            return reactChoreographer;
        }
    }

    public /* synthetic */ ReactChoreographer(ChoreographerProvider choreographerProvider, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographerProvider);
    }

    private ReactChoreographer(final ChoreographerProvider choreographerProvider) {
        int size = CallbackType.getEntries().size();
        ArrayDeque<Choreographer.FrameCallback>[] arrayDequeArr = new ArrayDeque[size];
        for (int i11 = 0; i11 < size; i11++) {
            arrayDequeArr[i11] = new ArrayDeque<>();
        }
        this.callbackQueues = arrayDequeArr;
        this.frameCallback = new Choreographer.FrameCallback() { // from class: com.facebook.react.modules.core.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                ReactChoreographer.frameCallback$lambda$1(this.f9795b, j11);
            }
        };
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.core.f
            @Override // java.lang.Runnable
            public final void run() {
                ReactChoreographer._init_$lambda$2(this.f9796b, choreographerProvider);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void frameCallback$lambda$1(ReactChoreographer reactChoreographer, long j11) {
        synchronized (reactChoreographer.callbackQueues) {
            try {
                reactChoreographer.hasPostedCallback = false;
                int length = reactChoreographer.callbackQueues.length;
                for (int i11 = 0; i11 < length; i11++) {
                    ArrayDeque<Choreographer.FrameCallback> arrayDeque = reactChoreographer.callbackQueues[i11];
                    int size = arrayDeque.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        Choreographer.FrameCallback frameCallbackPollFirst = arrayDeque.pollFirst();
                        if (frameCallbackPollFirst != null) {
                            frameCallbackPollFirst.doFrame(j11);
                            reactChoreographer.totalCallbacks--;
                        } else {
                            C45999a.m101507m(ReactConstants.TAG, "Tried to execute non-existent frame callback");
                        }
                    }
                }
                reactChoreographer.maybeRemoveFrameCallback();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final ReactChoreographer getInstance() {
        return INSTANCE.getInstance();
    }

    @JvmStatic
    public static final void initialize(@NotNull ChoreographerProvider choreographerProvider) {
        INSTANCE.initialize(choreographerProvider);
    }

    private final void maybeRemoveFrameCallback() {
        C38115a.m86045a(this.totalCallbacks >= 0);
        if (this.totalCallbacks == 0 && this.hasPostedCallback) {
            ChoreographerProvider.Choreographer choreographer2 = this.choreographer;
            if (choreographer2 != null) {
                choreographer2.removeFrameCallback(this.frameCallback);
            }
            this.hasPostedCallback = false;
        }
    }

    private final void postFrameCallbackOnChoreographer() {
        if (this.hasPostedCallback) {
            return;
        }
        ChoreographerProvider.Choreographer choreographer2 = this.choreographer;
        if (choreographer2 == null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.core.g
                @Override // java.lang.Runnable
                public final void run() {
                    ReactChoreographer.postFrameCallbackOnChoreographer$lambda$6(this.f9798b);
                }
            });
        } else {
            choreographer2.postFrameCallback(this.frameCallback);
            this.hasPostedCallback = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallbackOnChoreographer$lambda$6(ReactChoreographer reactChoreographer) {
        synchronized (reactChoreographer.callbackQueues) {
            reactChoreographer.postFrameCallbackOnChoreographer();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ReactChoreographer reactChoreographer, ChoreographerProvider choreographerProvider) {
        reactChoreographer.choreographer = choreographerProvider.getChoreographer();
    }

    public final void postFrameCallback(@NotNull CallbackType type, @NotNull Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.callbackQueues) {
            this.callbackQueues[type.getOrder()].addLast(callback);
            boolean z11 = true;
            int i11 = this.totalCallbacks + 1;
            this.totalCallbacks = i11;
            if (i11 <= 0) {
                z11 = false;
            }
            C38115a.m86045a(z11);
            postFrameCallbackOnChoreographer();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeFrameCallback(@NotNull CallbackType type, @Nullable Choreographer.FrameCallback frameCallback) {
        Intrinsics.checkNotNullParameter(type, "type");
        synchronized (this.callbackQueues) {
            try {
                if (this.callbackQueues[type.getOrder()].removeFirstOccurrence(frameCallback)) {
                    this.totalCallbacks--;
                    maybeRemoveFrameCallback();
                } else {
                    C45999a.m101507m(ReactConstants.TAG, "Tried to remove non-existent frame callback");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
