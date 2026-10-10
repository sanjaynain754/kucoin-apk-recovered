package jumio.core;

import com.jumio.core.cdn.CDNCache;
import com.jumio.core.cdn.CDNDownloadListener;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;

/* JADX INFO: renamed from: jumio.core.v */
/* JADX INFO: loaded from: classes61.dex */
public final class C40737v extends CDNDownloadListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CDNCache f90447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f90448b;

    public C40737v(CDNCache cDNCache, String str) {
        this.f90447a = cDNCache;
        this.f90448b = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.jumio.core.cdn.CDNDownloadListener, com.jumio.core.network.DownloadTask.ProgressListener
    public final Object onProgressDone(Boolean bool, Continuation continuation) {
        C40732u c40732u;
        if (continuation instanceof C40732u) {
            c40732u = (C40732u) continuation;
            int i11 = c40732u.f90438d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40732u.f90438d = i11 - Integer.MIN_VALUE;
            } else {
                c40732u = new C40732u(this, continuation);
            }
        } else {
            c40732u = new C40732u(this, continuation);
        }
        Object obj = c40732u.f90436b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40732u.f90438d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c40732u.f90435a = SpillingKt.nullOutSpilledVariable(bool);
            c40732u.f90438d = 1;
            if (super.onProgressDone2(bool, (Continuation<? super Unit>) c40732u) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Object obj2 = this.f90447a.f13741f;
        CDNCache cDNCache = this.f90447a;
        String str = this.f90448b;
        synchronized (obj2) {
        }
        return Unit.INSTANCE;
    }
}
