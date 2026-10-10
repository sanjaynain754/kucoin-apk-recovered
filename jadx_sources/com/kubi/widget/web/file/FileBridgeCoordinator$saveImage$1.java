package com.kubi.widget.web.file;

import androidx.fragment.app.FragmentActivity;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: FileBridgeCoordinator.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.file.FileBridgeCoordinator$saveImage$1", m90122f = "FileBridgeCoordinator.kt", m90123i = {0, 0, 1}, m90124l = {267, 239}, m90125m = "invokeSuspend", m90126n = {"$this$withLock_u24default$iv", "$i$f$withLock", DbParams.KEY_CHANNEL_RESULT}, m90127s = {"L$0", "I$0", "L$0"})
@SourceDebugExtension({"SMAP\nFileBridgeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileBridgeCoordinator.kt\ncom/kubi/widget/web/file/FileBridgeCoordinator$saveImage$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,261:1\n116#2,11:262\n*S KotlinDebug\n*F\n+ 1 FileBridgeCoordinator.kt\ncom/kubi/widget/web/file/FileBridgeCoordinator$saveImage$1\n*L\n236#1:262,11\n*E\n"})
public final class FileBridgeCoordinator$saveImage$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function1<FileActionResult, Unit> $callback;
    final /* synthetic */ FileDownloadResult $downloaded;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: renamed from: com.kubi.widget.web.file.FileBridgeCoordinator$saveImage$1$1 */
    /* JADX INFO: compiled from: FileBridgeCoordinator.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.widget.web.file.FileBridgeCoordinator$saveImage$1$1", m90122f = "FileBridgeCoordinator.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C271381 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ Function1<FileActionResult, Unit> $callback;
        final /* synthetic */ FileDownloadResult $downloaded;
        final /* synthetic */ FileActionResult $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C271381(FileActionResult fileActionResult, FragmentActivity fragmentActivity, Function1<? super FileActionResult, Unit> function1, FileDownloadResult fileDownloadResult, Continuation<? super C271381> continuation) {
            super(2, continuation);
            this.$result = fileActionResult;
            this.$activity = fragmentActivity;
            this.$callback = function1;
            this.$downloaded = fileDownloadResult;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C271381(this.$result, this.$activity, this.$callback, this.$downloaded, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C271381) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (Intrinsics.areEqual(this.$result.getErrorCode(), "PERMISSION_DENIED")) {
                    if (!this.$activity.isFinishing() && !this.$activity.isDestroyed() && !this.$activity.getSupportFragmentManager().isDestroyed()) {
                        FileActionFragment.f55077Z.save(this.$activity, this.$downloaded.getFile(), this.$downloaded.getMetadata(), this.$callback);
                    } else {
                        this.$callback.invoke(new FileActionResult(false, "SAVE_FAILED"));
                        return Unit.INSTANCE;
                    }
                } else {
                    this.$callback.invoke(this.$result);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileBridgeCoordinator$saveImage$1(FragmentActivity fragmentActivity, FileDownloadResult fileDownloadResult, Function1<? super FileActionResult, Unit> function1, Continuation<? super FileBridgeCoordinator$saveImage$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$downloaded = fileDownloadResult;
        this.$callback = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileBridgeCoordinator$saveImage$1(this.$activity, this.$downloaded, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FileBridgeCoordinator$saveImage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r14, r7, r13) == r0) goto L17;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC44082a interfaceC44082a;
        FileDownloadResult fileDownloadResult;
        FragmentActivity fragmentActivity;
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
                    fileDownloadResult = (FileDownloadResult) this.L$2;
                    fragmentActivity = (FragmentActivity) this.L$1;
                    interfaceC44082a = (InterfaceC44082a) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            interfaceC44082a = FileBridgeCoordinator.f55088c;
            FragmentActivity fragmentActivity2 = this.$activity;
            fileDownloadResult = this.$downloaded;
            this.L$0 = interfaceC44082a;
            this.L$1 = fragmentActivity2;
            this.L$2 = fileDownloadResult;
            this.I$0 = 0;
            this.label = 1;
            if (interfaceC44082a.mo91344d(null, this) != coroutine_suspended) {
                fragmentActivity = fragmentActivity2;
            }
            return coroutine_suspended;
            FileActionResult fileActionResultM67210a = FilePublicSaver.f55132a.m67210a(fragmentActivity, fileDownloadResult.getFile(), fileDownloadResult.getMetadata());
            interfaceC44082a.mo91345e(null);
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            C271381 c271381 = new C271381(fileActionResultM67210a, this.$activity, this.$callback, this.$downloaded, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(fileActionResultM67210a);
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        } catch (Throwable th2) {
            interfaceC44082a.mo91345e(null);
            throw th2;
        }
    }
}
