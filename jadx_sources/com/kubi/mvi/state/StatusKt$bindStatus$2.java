package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.mvi.common.C19243e;
import com.kubi.mvi.common.MviExKt;
import com.kubi.utils.extensions.C27025c;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p734wq.C45916a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: Status.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m90084d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/mvi/state/MVIStatus;"}, m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mvi.state.StatusKt$bindStatus$2", m90122f = "Status.kt", m90123i = {0, 0}, m90124l = {221}, m90125m = "invokeSuspend", m90126n = {"bizType$iv", "reportName$iv"}, m90127s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Status.kt\ncom/kubi/mvi/state/StatusKt$bindStatus$2\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,289:1\n50#2,17:290\n*S KotlinDebug\n*F\n+ 1 Status.kt\ncom/kubi/mvi/state/StatusKt$bindStatus$2\n*L\n217#1:290,17\n*E\n"})
public final class StatusKt$bindStatus$2 extends SuspendLambda implements Function2<MVIStatus, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<MVIStatus, Continuation<? super Unit>, Object> $action;
    final /* synthetic */ MviConfig $mviConfig;
    final /* synthetic */ String $stateName;
    final /* synthetic */ String $tag;
    /* synthetic */ Object L$0;
    Object L$1;
    boolean Z$0;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull MVIStatus mVIStatus, @Nullable Continuation<? super Unit> continuation) {
        return ((StatusKt$bindStatus$2) create(mVIStatus, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StatusKt$bindStatus$2(MviConfig mviConfig, String str, String str2, Function2<? super MVIStatus, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super StatusKt$bindStatus$2> continuation) {
        super(2, continuation);
        this.$mviConfig = mviConfig;
        this.$tag = str;
        this.$stateName = str2;
        this.$action = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        StatusKt$bindStatus$2 statusKt$bindStatus$2 = new StatusKt$bindStatus$2(this.$mviConfig, this.$tag, this.$stateName, this.$action, continuation);
        statusKt$bindStatus$2.L$0 = obj;
        return statusKt$bindStatus$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        boolean zM42564d;
        final String str;
        Throwable th2;
        String str2;
        Object objM103844constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                zM42564d = this.Z$0;
                str2 = (String) this.L$1;
                str = (String) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th3) {
                    th2 = th3;
                    Result.Companion companion = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            MVIStatus mVIStatus = (MVIStatus) this.L$0;
            zM42564d = this.$mviConfig.m42564d();
            str = this.$tag;
            MviConfig mviConfig = this.$mviConfig;
            final String str3 = this.$stateName;
            Function2<MVIStatus, Continuation<? super Unit>, Object> function2 = this.$action;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                MviExKt.m42509e(C27025c.m66566d(Boxing.boxBoolean(mviConfig.m42572l())), new Function0<Unit>() { // from class: com.kubi.mvi.state.StatusKt$bindStatus$2$1$1
                    @Override // p852kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        C19243e.m42540i(str3 + " 更新", str);
                    }
                });
                this.L$0 = str;
                this.L$1 = "crash_issue";
                this.Z$0 = zM42564d;
                this.label = 1;
                if (StateExKt.m42640b(str3, mviConfig, function2, mVIStatus, this) != coroutine_suspended) {
                    str2 = "crash_issue";
                } else {
                    return coroutine_suspended;
                }
            } catch (Throwable th4) {
                th2 = th4;
                str2 = "crash_issue";
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }
        objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (zM42564d && !(thM103847exceptionOrNullimpl instanceof CancellationException)) {
                C44128b.m97262f(str2, str2 + "->【" + str + " 发生错误:needCatch->" + zM42564d + (char) 12305, thM103847exceptionOrNullimpl);
            } else {
                throw thM103847exceptionOrNullimpl;
            }
        }
        MviConfig mviConfig2 = this.$mviConfig;
        String str4 = this.$stateName;
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C45916a.m101366a(thM103847exceptionOrNullimpl2, "Status");
            MVITracker.INSTANCE.trackEndHandleState(mviConfig2.m42567g(), str4, 0L, thM103847exceptionOrNullimpl2);
        }
        return Unit.INSTANCE;
    }
}
