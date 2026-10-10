package com.kubi.sdk.pkg.bundle;

import com.kubi.sdk.pkg.task.TaskException;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.PackageException;
import com.tencent.liteav.TXLiteAVCode;
import java.util.List;
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

/* JADX INFO: compiled from: BundleUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleUpdateTask$execute$2", m90122f = "BundleUpdateTask.kt", m90123i = {}, m90124l = {43, 59}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nBundleUpdateTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/BundleUpdateTask$execute$2\n+ 2 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,233:1\n22#2,2:234\n*S KotlinDebug\n*F\n+ 1 BundleUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/BundleUpdateTask$execute$2\n*L\n51#1:234,2\n*E\n"})
public final class BundleUpdateTask$execute$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    int label;
    final /* synthetic */ BundleUpdateTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdateTask$execute$2(BundleUpdateTask bundleUpdateTask, Continuation<? super BundleUpdateTask$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = bundleUpdateTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BundleUpdateTask$execute$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((BundleUpdateTask$execute$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r12 == r0) goto L30;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        TaskStatus taskStatusM57503o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                taskStatusM57503o = (TaskStatus) obj;
                return taskStatusM57503o;
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.startTime = System.currentTimeMillis();
            BundleUpdateTask bundleUpdateTask = this.this$0;
            String str = bundleUpdateTask.jsonUrl;
            this.label = 1;
            obj = bundleUpdateTask.m57506l(str, this);
            if (obj == coroutine_suspended) {
            }
            return coroutine_suspended;
            List list = (List) obj;
            if (list.isEmpty()) {
                taskStatusM57503o = BundleUpdateTask.m57503o(this.this$0, TaskStatus.INSTANCE.result(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, "不需要更新"), C23935a.m57546c(this.this$0.jsonUrl), null, 2, null);
            } else {
                BundleUpdateTask bundleUpdateTask2 = this.this$0;
                this.label = 2;
                obj = bundleUpdateTask2.m57507m(list, this);
            }
        } catch (CancellationException unused) {
            taskStatusM57503o = BundleUpdateTask.m57503o(this.this$0, TaskStatus.INSTANCE.result(1303, "JSON拉取被取消"), C23935a.m57546c(this.this$0.jsonUrl), null, 2, null);
        } catch (TaskException e11) {
            taskStatusM57503o = BundleUpdateTask.m57503o(this.this$0, TaskStatus.INSTANCE.result(e11.getCode(), e11.getMessage()), C23935a.m57546c(this.this$0.jsonUrl), null, 2, null);
        } catch (Exception e12) {
            C43846g.m96568c(new PackageException(e12, "package_update", false, null, 8, null), null, 2, null);
            taskStatusM57503o = BundleUpdateTask.m57503o(this.this$0, TaskStatus.INSTANCE.result(1501, "JSON拉取失败"), C23935a.m57546c(this.this$0.jsonUrl), null, 2, null);
        } finally {
            this.this$0.m57505k();
        }
        return taskStatusM57503o;
    }
}
