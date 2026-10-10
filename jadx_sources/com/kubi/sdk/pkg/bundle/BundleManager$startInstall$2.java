package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.C23985b;
import kotlinx.coroutines.InterfaceC41709m0;
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
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: BundleManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Z"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleManager$startInstall$2", m90122f = "BundleManager.kt", m90123i = {0, 1}, m90124l = {897, 364}, m90125m = "invokeSuspend", m90126n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$0"})
@SourceDebugExtension({"SMAP\nBundleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$startInstall$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,891:1\n108#2,10:892\n*S KotlinDebug\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$startInstall$2\n*L\n362#1:892,10\n*E\n"})
public final class BundleManager$startInstall$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleManager$startInstall$2(Context context, Continuation<? super BundleManager$startInstall$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BundleManager$startInstall$2(this.$context, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Boolean> continuation) {
        return ((BundleManager$startInstall$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c A[Catch: all -> 0x0018, TRY_ENTER, TryCatch #1 {all -> 0x0018, blocks: (B:7:0x0014, B:23:0x0062, B:26:0x006c, B:28:0x00bc, B:32:0x00c6, B:27:0x0093), top: B:39:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0093 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:7:0x0014, B:23:0x0062, B:26:0x006c, B:28:0x00bc, B:32:0x00c6, B:27:0x0093), top: B:39:0x0014 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x006c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0093, please report this as an issue */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        InterfaceC44082a interfaceC44082a;
        Context context;
        InterfaceC44082a interfaceC44082a2;
        TaskStatus taskStatus;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        boolean z11 = true;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        interfaceC44082a2 = (InterfaceC44082a) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            taskStatus = (TaskStatus) obj;
                            if (taskStatus.m57807h()) {
                                C23985b.f47489a.m57877e("bundleInit", "startInstall assets bundle success result: " + taskStatus.getCode() + ", " + taskStatus.getMessage());
                            } else {
                                C23985b.m57873d(C23985b.f47489a, "bundleInit", "startInstall assets bundle error result: " + taskStatus.getCode() + ", " + taskStatus.getMessage(), null, 4, null);
                            }
                            BundleManager.hasInstalled = true;
                            Boolean boolBoxBoolean = Boxing.boxBoolean(z11);
                            interfaceC44082a2.mo91345e(null);
                            return boolBoxBoolean;
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            interfaceC44082a2.mo91345e(null);
                            throw th3;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) this.L$1;
                InterfaceC44082a interfaceC44082a3 = (InterfaceC44082a) this.L$0;
                ResultKt.throwOnFailure(obj);
                interfaceC44082a = interfaceC44082a3;
            } else {
                ResultKt.throwOnFailure(obj);
                interfaceC44082a = BundleManager.installLock;
                context = this.$context;
                this.L$0 = interfaceC44082a;
                this.L$1 = context;
                this.label = 1;
                if (interfaceC44082a.mo91344d(null, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (!BundleManager.hasInstalled) {
                BundleInstallTask bundleInstallTask = new BundleInstallTask(context);
                this.L$0 = interfaceC44082a;
                this.L$1 = null;
                this.label = 2;
                Object objM57432f = bundleInstallTask.m57432f(this);
                if (objM57432f != coroutine_suspended) {
                    interfaceC44082a2 = interfaceC44082a;
                    obj = objM57432f;
                    taskStatus = (TaskStatus) obj;
                    if (taskStatus.m57807h()) {
                        C23985b.f47489a.m57877e("bundleInit", "startInstall assets bundle success result: " + taskStatus.getCode() + ", " + taskStatus.getMessage());
                    } else {
                        C23985b.m57873d(C23985b.f47489a, "bundleInit", "startInstall assets bundle error result: " + taskStatus.getCode() + ", " + taskStatus.getMessage(), null, 4, null);
                    }
                    BundleManager.hasInstalled = true;
                }
                return coroutine_suspended;
            }
            z11 = false;
            interfaceC44082a2 = interfaceC44082a;
            Boolean boolBoxBoolean2 = Boxing.boxBoolean(z11);
            interfaceC44082a2.mo91345e(null);
            return boolBoxBoolean2;
        } catch (Throwable th4) {
            th = th4;
            interfaceC44082a2 = interfaceC44082a;
            Throwable th5 = th;
            interfaceC44082a2.mo91345e(null);
            throw th5;
        }
    }
}
