package com.kubi.sdk.pkg.bundle.pkgplatform;

import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.C23985b;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: PkgPlatformUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$startUpdate$2$startBatch$1$1", m90122f = "PkgPlatformUpdateTask.kt", m90123i = {1, 2}, m90124l = {472, 636, 472}, m90125m = "invokeSuspend", m90126n = {"$this$withPermit$iv$iv", "$this$withPermit$iv$iv"}, m90127s = {"L$3", "L$0"})
@SourceDebugExtension({"SMAP\nPkgPlatformUpdateTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$startUpdate$2$startBatch$1$1\n+ 2 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 3 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n*L\n1#1,627:1\n173#2,4:628\n177#2:639\n180#2:641\n81#3,7:632\n89#3:640\n*S KotlinDebug\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$startUpdate$2$startBatch$1$1\n*L\n470#1:628,4\n470#1:639\n470#1:641\n470#1:632,7\n470#1:640\n*E\n"})
public final class PkgPlatformUpdateTask$startUpdate$2$startBatch$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ InterfaceC44088g $concurrencySemaphore;
    final /* synthetic */ PkgPlatformUpdateTask.WorkItem $item;
    final /* synthetic */ InterfaceC41769w<Unit> $scheduledSignal;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PkgPlatformUpdateTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkgPlatformUpdateTask$startUpdate$2$startBatch$1$1(InterfaceC44088g interfaceC44088g, PkgPlatformUpdateTask.WorkItem workItem, InterfaceC41769w<Unit> interfaceC41769w, PkgPlatformUpdateTask pkgPlatformUpdateTask, Continuation<? super PkgPlatformUpdateTask$startUpdate$2$startBatch$1$1> continuation) {
        super(2, continuation);
        this.$concurrencySemaphore = interfaceC44088g;
        this.$item = workItem;
        this.$scheduledSignal = interfaceC41769w;
        this.this$0 = pkgPlatformUpdateTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PkgPlatformUpdateTask$startUpdate$2$startBatch$1$1(this.$concurrencySemaphore, this.$item, this.$scheduledSignal, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((PkgPlatformUpdateTask$startUpdate$2$startBatch$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC44088g interfaceC44088g;
        InterfaceC41769w<Unit> interfaceC41769w;
        PkgPlatformUpdateTask pkgPlatformUpdateTask;
        PkgPlatformUpdateTask.WorkItem workItem;
        TaskStatus taskStatus;
        InterfaceC44088g interfaceC44088g2;
        Throwable th2;
        Object objM57657w;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            interfaceC44088g2 = (InterfaceC44088g) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                taskStatus = (TaskStatus) obj;
                                interfaceC44088g2.release();
                            } catch (Throwable th3) {
                                th2 = th3;
                                interfaceC44088g2.release();
                                throw th2;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        InterfaceC44088g interfaceC44088g3 = (InterfaceC44088g) this.L$3;
                        workItem = (PkgPlatformUpdateTask.WorkItem) this.L$2;
                        pkgPlatformUpdateTask = (PkgPlatformUpdateTask) this.L$1;
                        interfaceC41769w = (InterfaceC41769w) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        interfaceC44088g = interfaceC44088g3;
                        if (interfaceC41769w != null) {
                            try {
                                Boxing.boxBoolean(interfaceC41769w.mo91370n(Unit.INSTANCE));
                            } catch (Throwable th4) {
                                interfaceC44088g2 = interfaceC44088g;
                                th2 = th4;
                                interfaceC44088g2.release();
                                throw th2;
                            }
                        }
                        this.L$0 = interfaceC44088g;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        objM57657w = pkgPlatformUpdateTask.m57657w(workItem, this);
                        if (objM57657w != coroutine_suspended) {
                            interfaceC44088g2 = interfaceC44088g;
                            obj = objM57657w;
                            taskStatus = (TaskStatus) obj;
                            interfaceC44088g2.release();
                        }
                        return coroutine_suspended;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    taskStatus = (TaskStatus) obj;
                }
            } else {
                ResultKt.throwOnFailure(obj);
                interfaceC44088g = this.$concurrencySemaphore;
                interfaceC41769w = this.$scheduledSignal;
                PkgPlatformUpdateTask pkgPlatformUpdateTask2 = this.this$0;
                PkgPlatformUpdateTask.WorkItem workItem2 = this.$item;
                if (interfaceC44088g == null) {
                    if (interfaceC41769w != null) {
                        Boxing.boxBoolean(interfaceC41769w.mo91370n(Unit.INSTANCE));
                    }
                    this.label = 1;
                    obj = pkgPlatformUpdateTask2.m57657w(workItem2, this);
                    if (obj == coroutine_suspended) {
                    }
                    taskStatus = (TaskStatus) obj;
                } else {
                    this.L$0 = interfaceC41769w;
                    this.L$1 = pkgPlatformUpdateTask2;
                    this.L$2 = workItem2;
                    this.L$3 = interfaceC44088g;
                    this.label = 2;
                    if (interfaceC44088g.m97146c(this) != coroutine_suspended) {
                        pkgPlatformUpdateTask = pkgPlatformUpdateTask2;
                        workItem = workItem2;
                        if (interfaceC41769w != null) {
                            Boxing.boxBoolean(interfaceC41769w.mo91370n(Unit.INSTANCE));
                        }
                        this.L$0 = interfaceC44088g;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        objM57657w = pkgPlatformUpdateTask.m57657w(workItem, this);
                        if (objM57657w != coroutine_suspended) {
                            interfaceC44088g2 = interfaceC44088g;
                            obj = objM57657w;
                            taskStatus = (TaskStatus) obj;
                            interfaceC44088g2.release();
                        }
                    }
                }
                return coroutine_suspended;
            }
            InterfaceC41769w<Unit> interfaceC41769w2 = this.$scheduledSignal;
            if (interfaceC41769w2 != null) {
                Boxing.boxBoolean(interfaceC41769w2.mo91370n(Unit.INSTANCE));
            }
            return taskStatus;
        } catch (CancellationException unused) {
            C23985b.f47489a.m57877e("pkgPlatform", "startUpdate " + this.$item.getBundleInfo().getName() + ' ' + this.$item.getBundleInfo().getVersion() + " 被取消");
            return TaskStatus.INSTANCE.result(1303, "包管理平台下载被取消");
        } finally {
            InterfaceC41769w<Unit> interfaceC41769w3 = this.$scheduledSignal;
            if (interfaceC41769w3 != null) {
                Boxing.boxBoolean(interfaceC41769w3.mo91370n(Unit.INSTANCE));
            }
        }
    }
}
