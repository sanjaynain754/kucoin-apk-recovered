package com.kubi.mvi.state;

import android.os.Handler;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.mvi.common.C19243e;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: StateCostTime.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0012\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010(¨\u0006*"}, m90084d2 = {"Lcom/kubi/mvi/state/StateCostTime;", "", "", "stateName", TUIConstants.TUIChat.OWNER, "Landroid/os/Handler;", "handler", "Lcom/kubi/mvi/state/MviConfig;", "mviConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;Lcom/kubi/mvi/state/MviConfig;)V", "", "d", "()J", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "e", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getStateName", "()Ljava/lang/String;", "setStateName", "(Ljava/lang/String;)V", "getOwner", "setOwner", "c", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "Lcom/kubi/mvi/state/MviConfig;", "getMviConfig", "()Lcom/kubi/mvi/state/MviConfig;", "J", "getStartTime", "setStartTime", "(J)V", "startTime", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStateCostTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateCostTime.kt\ncom/kubi/mvi/state/StateCostTime\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,52:1\n17#2,6:53\n*S KotlinDebug\n*F\n+ 1 StateCostTime.kt\ncom/kubi/mvi/state/StateCostTime\n*L\n28#1:53,6\n*E\n"})
public final class StateCostTime {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String stateName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String owner;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final MviConfig mviConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long startTime;

    public StateCostTime(@NotNull String stateName, @NotNull String owner, @NotNull Handler handler, @NotNull MviConfig mviConfig) {
        Intrinsics.checkNotNullParameter(stateName, "stateName");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(mviConfig, "mviConfig");
        this.stateName = stateName;
        this.owner = owner;
        this.handler = handler;
        this.mviConfig = mviConfig;
        this.startTime = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: c */
    public static final void m42588c(StateCostTime this$0) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long jM42590d = this$0.m42590d();
        MVITracker.INSTANCE.trackEndRenderUI(this$0.owner, this$0.stateName, jM42590d);
        C19243e.m42541j(this$0.owner + "->invalidate ui time->" + this$0.stateName + "->" + jM42590d, this$0.owner);
    }

    /* JADX INFO: renamed from: b */
    public final void m42589b() {
        this.handler.removeCallbacksAndMessages(null);
        this.handler.post(new Runnable() { // from class: com.kubi.mvi.state.o
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                StateCostTime.m42588c(this.f35695b);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m42591e(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Continuation<? super Unit> continuation) throws JSONException {
        StateCostTime$measureTime$1 stateCostTime$measureTime$1;
        StateCostTime stateCostTime;
        long j11;
        if (continuation instanceof StateCostTime$measureTime$1) {
            stateCostTime$measureTime$1 = (StateCostTime$measureTime$1) continuation;
            int i11 = stateCostTime$measureTime$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                stateCostTime$measureTime$1.label = i11 - Integer.MIN_VALUE;
            } else {
                stateCostTime$measureTime$1 = new StateCostTime$measureTime$1(this, continuation);
            }
        } else {
            stateCostTime$measureTime$1 = new StateCostTime$measureTime$1(this, continuation);
        }
        Object obj = stateCostTime$measureTime$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = stateCostTime$measureTime$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            this.startTime = System.currentTimeMillis();
            long jCurrentTimeMillis = System.currentTimeMillis();
            MVITracker.INSTANCE.trackStartHandleState(this.owner, C27025c.m66566d(Boxing.boxBoolean(this.mviConfig.m42572l())), this.stateName);
            stateCostTime$measureTime$1.L$0 = this;
            stateCostTime$measureTime$1.J$0 = jCurrentTimeMillis;
            stateCostTime$measureTime$1.label = 1;
            if (function1.invoke(stateCostTime$measureTime$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            stateCostTime = this;
            j11 = jCurrentTimeMillis;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = stateCostTime$measureTime$1.J$0;
            stateCostTime = (StateCostTime) stateCostTime$measureTime$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j11;
        MVITracker.Companion.trackEndHandleState$default(MVITracker.INSTANCE, stateCostTime.owner, stateCostTime.stateName, jCurrentTimeMillis2, null, 8, null);
        C19243e.m42541j(stateCostTime.owner + "->bindState time->" + stateCostTime.stateName + "->" + jCurrentTimeMillis2, stateCostTime.owner);
        stateCostTime.m42589b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final long m42590d() {
        return System.currentTimeMillis() - this.startTime;
    }
}
