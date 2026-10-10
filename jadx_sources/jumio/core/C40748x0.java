package jumio.core;

import com.jumio.core.Controller;
import com.jumio.core.cdn.CDNDownload;
import com.jumio.core.cdn.CDNDownloadListener;
import com.jumio.core.models.BackendModel;
import com.jumio.core.models.SettingsModel;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;

/* JADX INFO: renamed from: jumio.core.x0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40748x0 extends CDNDownloadListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Controller f90468a;

    public C40748x0(Controller controller) {
        this.f90468a = controller;
    }

    @Override // com.jumio.core.cdn.CDNDownloadListener, com.jumio.core.network.DownloadTask.ProgressListener
    public final boolean isRateLimitExceeded() {
        return ((BackendModel) this.f90468a.getF13603d().get(BackendModel.class)).checkAndIncreaseCounter(CDNDownload.class, ((SettingsModel) this.f90468a.getF13603d().get(SettingsModel.class)).getThrottlingLimit());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.jumio.core.cdn.CDNDownloadListener, com.jumio.core.network.DownloadTask.ProgressListener
    public final Object onProgressDone(Boolean bool, Continuation continuation) {
        C40738v0 c40738v0;
        if (continuation instanceof C40738v0) {
            c40738v0 = (C40738v0) continuation;
            int i11 = c40738v0.f90452d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40738v0.f90452d = i11 - Integer.MIN_VALUE;
            } else {
                c40738v0 = new C40738v0(this, continuation);
            }
        } else {
            c40738v0 = new C40738v0(this, continuation);
        }
        Object obj = c40738v0.f90450b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40738v0.f90452d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c40738v0.f90449a = SpillingKt.nullOutSpilledVariable(bool);
            c40738v0.f90452d = 1;
            if (super.onProgressDone2(bool, (Continuation<? super Unit>) c40738v0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC41775x1 interfaceC41775x1 = this.f90468a.f13611l;
        if (interfaceC41775x1 != null && !interfaceC41775x1.isCompleted() && Controller.access$isModelPreloaded(this.f90468a)) {
            InterfaceC41775x1 interfaceC41775x2 = this.f90468a.f13611l;
            if (interfaceC41775x2 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
            }
            this.f90468a.m14488a();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.jumio.core.cdn.CDNDownloadListener, com.jumio.core.network.DownloadTask.ProgressListener
    public final Object onProgressException(Exception exc, Continuation continuation) {
        C40743w0 c40743w0;
        if (continuation instanceof C40743w0) {
            c40743w0 = (C40743w0) continuation;
            int i11 = c40743w0.f90461d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40743w0.f90461d = i11 - Integer.MIN_VALUE;
            } else {
                c40743w0 = new C40743w0(this, continuation);
            }
        } else {
            c40743w0 = new C40743w0(this, continuation);
        }
        Object obj = c40743w0.f90459b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40743w0.f90461d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c40743w0.f90458a = SpillingKt.nullOutSpilledVariable(exc);
            c40743w0.f90461d = 1;
            if (super.onProgressException(exc, c40743w0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC41775x1 interfaceC41775x1 = this.f90468a.f13611l;
        if (interfaceC41775x1 != null && !interfaceC41775x1.isCompleted()) {
            InterfaceC41775x1 interfaceC41775x2 = this.f90468a.f13611l;
            if (interfaceC41775x2 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
            }
            this.f90468a.m14488a();
        }
        return Unit.INSTANCE;
    }
}
