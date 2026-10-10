package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import com.kubi.sdk.pkg.task.DownloadPriority;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.C23985b;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: BundleManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1", m90122f = "BundleManager.kt", m90123i = {0, 1, 2, 2}, m90124l = {536, 900, 536}, m90125m = "invokeSuspend", m90126n = {"startTime", "$this$withPermit$iv$iv", "$this$withPermit$iv$iv", "startTime"}, m90127s = {"J$0", "L$3", "L$1", "J$0"})
@SourceDebugExtension({"SMAP\nBundleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1\n+ 2 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 3 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n*L\n1#1,891:1\n173#2,4:892\n177#2:903\n180#2:905\n81#3,7:896\n89#3:904\n*S KotlinDebug\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1\n*L\n527#1:892,4\n527#1:903\n527#1:905\n527#1:896,7\n527#1:904\n*E\n"})
public final class BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $jsonUrl;
    final /* synthetic */ InterfaceC41769w<Unit> $scheduledSignal;
    final /* synthetic */ InterfaceC44088g $semaphore;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1(InterfaceC44088g interfaceC44088g, InterfaceC41769w<Unit> interfaceC41769w, Context context, String str, Continuation<? super BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1> continuation) {
        super(2, continuation);
        this.$semaphore = interfaceC44088g;
        this.$scheduledSignal = interfaceC41769w;
        this.$context = context;
        this.$jsonUrl = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1(this.$semaphore, this.$scheduledSignal, this.$context, this.$jsonUrl, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:62:0x01c5, B:68:0x01d7, B:69:0x01da, B:15:0x004d, B:21:0x005d, B:34:0x0093, B:38:0x009d, B:40:0x00ac, B:41:0x00de, B:24:0x0066, B:26:0x0070, B:28:0x0078, B:30:0x007f, B:42:0x0110, B:8:0x002a, B:54:0x014e, B:58:0x0158, B:60:0x0167, B:61:0x0198, B:46:0x0124, B:48:0x012c, B:50:0x0133), top: B:74:0x0017, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00de A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:62:0x01c5, B:68:0x01d7, B:69:0x01da, B:15:0x004d, B:21:0x005d, B:34:0x0093, B:38:0x009d, B:40:0x00ac, B:41:0x00de, B:24:0x0066, B:26:0x0070, B:28:0x0078, B:30:0x007f, B:42:0x0110, B:8:0x002a, B:54:0x014e, B:58:0x0158, B:60:0x0167, B:61:0x0198, B:46:0x0124, B:48:0x012c, B:50:0x0133), top: B:74:0x0017, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x012c A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:8:0x002a, B:54:0x014e, B:58:0x0158, B:60:0x0167, B:61:0x0198, B:46:0x0124, B:48:0x012c, B:50:0x0133), top: B:74:0x0017, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0132  */
    /* JADX WARN: Code duplicated, block: B:53:0x014d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0156  */
    /* JADX WARN: Code duplicated, block: B:57:0x0157  */
    /* JADX WARN: Code duplicated, block: B:60:0x0167 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:8:0x002a, B:54:0x014e, B:58:0x0158, B:60:0x0167, B:61:0x0198, B:46:0x0124, B:48:0x012c, B:50:0x0133), top: B:74:0x0017, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0198 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:8:0x002a, B:54:0x014e, B:58:0x0158, B:60:0x0167, B:61:0x0198, B:46:0x0124, B:48:0x012c, B:50:0x0133), top: B:74:0x0017, outer: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00ac, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00de, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x0167, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0198, please report this as an issue */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, rg0.g] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC44088g interfaceC44088g;
        Context context;
        String str;
        final InterfaceC41769w<Unit> interfaceC41769w;
        long jCurrentTimeMillis;
        Object objM57504j;
        String str2;
        TaskStatus taskStatus;
        String strM57545b;
        BundleManager bundleManager;
        long jCurrentTimeMillis2;
        Function0<Unit> function0;
        Object objM57504j2;
        String str3;
        TaskStatus taskStatus2;
        String strM57545b2;
        BundleManager bundleManager2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r11 = this.label;
        String str4 = "unknown";
        try {
            try {
                if (r11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    interfaceC44088g = this.$semaphore;
                    context = this.$context;
                    str = this.$jsonUrl;
                    final InterfaceC41769w<Unit> interfaceC41769w2 = this.$scheduledSignal;
                    if (interfaceC44088g == null) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        BundleUpdateTask bundleUpdateTask = new BundleUpdateTask(context, str, DownloadPriority.NORMAL, interfaceC41769w2 != null ? new Function0<Unit>() { // from class: com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1$1$result$1$1
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
                                interfaceC41769w2.mo91370n(Unit.INSTANCE);
                            }
                        } : null);
                        this.L$0 = str;
                        this.J$0 = jCurrentTimeMillis;
                        this.label = 1;
                        objM57504j = bundleUpdateTask.m57504j(this);
                        if (objM57504j != coroutine_suspended) {
                            str2 = str;
                            taskStatus = (TaskStatus) objM57504j;
                            strM57545b = C23935a.m57545b(str2);
                            if (strM57545b == null) {
                                str4 = strM57545b;
                            }
                            bundleManager = BundleManager.f47277a;
                            bundleManager.m57481U(str4, taskStatus.getCode());
                            if (taskStatus.m57807h()) {
                                C23985b.f47489a.m57877e("loadBundle", "startUpdateAll success code: " + taskStatus.getCode() + ", message: " + taskStatus.getMessage() + ", jsonUrl:" + str2);
                                bundleManager.m57482V(str4, System.currentTimeMillis() - jCurrentTimeMillis);
                            } else {
                                C23985b.m57873d(C23985b.f47489a, "loadBundle", "startUpdateAll error code: " + taskStatus.getCode() + ", message: " + taskStatus.getMessage() + ", jsonUrl:" + str2, null, 4, null);
                            }
                        }
                    } else {
                        this.L$0 = context;
                        this.L$1 = str;
                        this.L$2 = interfaceC41769w2;
                        this.L$3 = interfaceC44088g;
                        this.label = 2;
                        if (interfaceC44088g.m97146c(this) != coroutine_suspended) {
                            interfaceC41769w = interfaceC41769w2;
                            Context context2 = context;
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                            DownloadPriority downloadPriority = DownloadPriority.NORMAL;
                            if (interfaceC41769w != null) {
                                function0 = new Function0<Unit>() { // from class: com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1$1$result$1$1
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
                                        interfaceC41769w.mo91370n(Unit.INSTANCE);
                                    }
                                };
                            } else {
                                function0 = null;
                            }
                            BundleUpdateTask bundleUpdateTask2 = new BundleUpdateTask(context2, str, downloadPriority, function0);
                            this.L$0 = str;
                            this.L$1 = interfaceC44088g;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.J$0 = jCurrentTimeMillis2;
                            this.label = 3;
                            objM57504j2 = bundleUpdateTask2.m57504j(this);
                            if (objM57504j2 != coroutine_suspended) {
                                str3 = str;
                                taskStatus2 = (TaskStatus) objM57504j2;
                                strM57545b2 = C23935a.m57545b(str3);
                                if (strM57545b2 == null) {
                                    str4 = strM57545b2;
                                }
                                bundleManager2 = BundleManager.f47277a;
                                bundleManager2.m57481U(str4, taskStatus2.getCode());
                                if (taskStatus2.m57807h()) {
                                    C23985b.f47489a.m57877e("loadBundle", "startUpdateAll success code: " + taskStatus2.getCode() + ", message: " + taskStatus2.getMessage() + ", jsonUrl:" + str3);
                                    bundleManager2.m57482V(str4, System.currentTimeMillis() - jCurrentTimeMillis2);
                                } else {
                                    C23985b.m57873d(C23985b.f47489a, "loadBundle", "startUpdateAll error code: " + taskStatus2.getCode() + ", message: " + taskStatus2.getMessage() + ", jsonUrl:" + str3, null, 4, null);
                                }
                                interfaceC44088g.release();
                                taskStatus = taskStatus2;
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (r11 != 1) {
                    if (r11 == 2) {
                        interfaceC44088g = (InterfaceC44088g) this.L$3;
                        interfaceC41769w = (InterfaceC41769w) this.L$2;
                        String str5 = (String) this.L$1;
                        context = (Context) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        str = str5;
                        Context context3 = context;
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                        DownloadPriority downloadPriority2 = DownloadPriority.NORMAL;
                        if (interfaceC41769w != null) {
                            function0 = new Function0<Unit>() { // from class: com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1$1$result$1$1
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
                                    interfaceC41769w.mo91370n(Unit.INSTANCE);
                                }
                            };
                        } else {
                            function0 = null;
                        }
                        BundleUpdateTask bundleUpdateTask3 = new BundleUpdateTask(context3, str, downloadPriority2, function0);
                        this.L$0 = str;
                        this.L$1 = interfaceC44088g;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.J$0 = jCurrentTimeMillis2;
                        this.label = 3;
                        objM57504j2 = bundleUpdateTask3.m57504j(this);
                        if (objM57504j2 != coroutine_suspended) {
                            str3 = str;
                        }
                        return coroutine_suspended;
                    }
                    if (r11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j11 = this.J$0;
                    interfaceC44088g = (InterfaceC44088g) this.L$1;
                    str3 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    jCurrentTimeMillis2 = j11;
                    objM57504j2 = obj;
                    taskStatus2 = (TaskStatus) objM57504j2;
                    strM57545b2 = C23935a.m57545b(str3);
                    if (strM57545b2 == null) {
                        str4 = strM57545b2;
                    }
                    bundleManager2 = BundleManager.f47277a;
                    bundleManager2.m57481U(str4, taskStatus2.getCode());
                    if (taskStatus2.m57807h()) {
                        C23985b.f47489a.m57877e("loadBundle", "startUpdateAll success code: " + taskStatus2.getCode() + ", message: " + taskStatus2.getMessage() + ", jsonUrl:" + str3);
                        bundleManager2.m57482V(str4, System.currentTimeMillis() - jCurrentTimeMillis2);
                    } else {
                        C23985b.m57873d(C23985b.f47489a, "loadBundle", "startUpdateAll error code: " + taskStatus2.getCode() + ", message: " + taskStatus2.getMessage() + ", jsonUrl:" + str3, null, 4, null);
                    }
                    interfaceC44088g.release();
                    taskStatus = taskStatus2;
                } else {
                    jCurrentTimeMillis = this.J$0;
                    str2 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objM57504j = obj;
                    taskStatus = (TaskStatus) objM57504j;
                    strM57545b = C23935a.m57545b(str2);
                    if (strM57545b == null) {
                        str4 = strM57545b;
                    }
                    bundleManager = BundleManager.f47277a;
                    bundleManager.m57481U(str4, taskStatus.getCode());
                    if (taskStatus.m57807h()) {
                        C23985b.f47489a.m57877e("loadBundle", "startUpdateAll success code: " + taskStatus.getCode() + ", message: " + taskStatus.getMessage() + ", jsonUrl:" + str2);
                        bundleManager.m57482V(str4, System.currentTimeMillis() - jCurrentTimeMillis);
                    } else {
                        C23985b.m57873d(C23985b.f47489a, "loadBundle", "startUpdateAll error code: " + taskStatus.getCode() + ", message: " + taskStatus.getMessage() + ", jsonUrl:" + str2, null, 4, null);
                    }
                }
                InterfaceC41769w<Unit> interfaceC41769w3 = this.$scheduledSignal;
                if (interfaceC41769w3 != null) {
                    Boxing.boxBoolean(interfaceC41769w3.mo91370n(Unit.INSTANCE));
                }
                return taskStatus;
            } catch (Throwable th2) {
                r11.release();
                throw th2;
            }
        } catch (Throwable th3) {
            InterfaceC41769w<Unit> interfaceC41769w4 = this.$scheduledSignal;
            if (interfaceC41769w4 != null) {
                Boxing.boxBoolean(interfaceC41769w4.mo91370n(Unit.INSTANCE));
            }
            throw th3;
        }
    }
}
