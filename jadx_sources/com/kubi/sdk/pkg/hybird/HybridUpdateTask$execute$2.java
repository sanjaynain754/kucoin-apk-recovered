package com.kubi.sdk.pkg.hybird;

import com.kubi.sdk.pkg.task.TaskException;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.PackageException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HybridUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.hybird.HybridUpdateTask$execute$2", m90122f = "HybridUpdateTask.kt", m90123i = {}, m90124l = {56, 65}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nHybridUpdateTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridUpdateTask.kt\ncom/kubi/sdk/pkg/hybird/HybridUpdateTask$execute$2\n+ 2 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,233:1\n22#2,2:234\n*S KotlinDebug\n*F\n+ 1 HybridUpdateTask.kt\ncom/kubi/sdk/pkg/hybird/HybridUpdateTask$execute$2\n*L\n62#1:234,2\n*E\n"})
public final class HybridUpdateTask$execute$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ HybridUpdateTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HybridUpdateTask$execute$2(HybridUpdateTask hybridUpdateTask, Continuation<? super HybridUpdateTask$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = hybridUpdateTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HybridUpdateTask$execute$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((HybridUpdateTask$execute$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        HybridUpdateTask hybridUpdateTask;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        hybridUpdateTask = (HybridUpdateTask) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return hybridUpdateTask.m57740s((TaskStatus) obj);
            }
            ResultKt.throwOnFailure(obj);
            HybridUpdateTask hybridUpdateTask2 = this.this$0;
            this.label = 1;
            obj = hybridUpdateTask2.m57737p(this);
            if (obj == coroutine_suspended) {
            }
            return coroutine_suspended;
            HybridPackageInfo hybridPackageInfo = (HybridPackageInfo) obj;
            HybridUpdateTask hybridUpdateTask3 = this.this$0;
            this.L$0 = hybridUpdateTask3;
            this.label = 2;
            obj = hybridUpdateTask3.m57739r(hybridPackageInfo, this);
            if (obj != coroutine_suspended) {
                hybridUpdateTask = hybridUpdateTask3;
                return hybridUpdateTask.m57740s((TaskStatus) obj);
            }
            return coroutine_suspended;
        } catch (TaskException e11) {
            return this.this$0.m57740s(TaskStatus.INSTANCE.result(e11.getCode(), e11.getMessage()));
        } catch (CancellationException unused) {
            return this.this$0.m57740s(TaskStatus.INSTANCE.result(1303, "JSON拉取被取消"));
        } catch (Exception e12) {
            C43846g.m96568c(new PackageException(e12, "package_update", false, null, 8, null), null, 2, null);
            return this.this$0.m57740s(TaskStatus.INSTANCE.error(e12.getMessage()));
        }
    }
}
