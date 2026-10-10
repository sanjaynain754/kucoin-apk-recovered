package jumio.core;

import com.jumio.core.cdn.CDNDownloadListener;
import java.util.ArrayList;
import java.util.Iterator;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.B */
/* JADX INFO: loaded from: classes61.dex */
public final class C40506B extends CDNDownloadListener {

    /* JADX INFO: renamed from: a */
    public final ArrayList f89913a;

    public C40506B(CDNDownloadListener... listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f89913a = new ArrayList();
        for (CDNDownloadListener cdnDownloadListener : listener) {
            Intrinsics.checkNotNullParameter(cdnDownloadListener, "cdnDownloadListener");
            if (!this.f89913a.contains(cdnDownloadListener)) {
                this.f89913a.add(cdnDownloadListener);
            }
        }
    }

    @Override // com.jumio.core.cdn.CDNDownloadListener, com.jumio.core.network.DownloadTask.ProgressListener
    public final boolean isRateLimitExceeded() {
        ArrayList arrayList = this.f89913a;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((CDNDownloadListener) it.next()).isRateLimitExceeded()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.jumio.core.cdn.CDNDownloadListener, com.jumio.core.network.DownloadTask.ProgressListener
    public final Object onProgressDone(Boolean bool, Continuation continuation) {
        C40752y c40752y;
        Iterator it;
        int i11;
        Iterable iterable;
        if (continuation instanceof C40752y) {
            c40752y = (C40752y) continuation;
            int i12 = c40752y.f90481i;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c40752y.f90481i = i12 - Integer.MIN_VALUE;
            } else {
                c40752y = new C40752y(this, continuation);
            }
        } else {
            c40752y = new C40752y(this, continuation);
        }
        Object obj = c40752y.f90479g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c40752y.f90481i;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = this.f89913a;
            it = arrayList.iterator();
            i11 = 0;
            iterable = arrayList;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = c40752y.f90478f;
            it = c40752y.f90475c;
            Iterable iterable2 = (Iterable) c40752y.f90474b;
            Boolean bool2 = c40752y.f90473a;
            ResultKt.throwOnFailure(obj);
            i11 = i14;
            bool = bool2;
            iterable = iterable2;
        }
        while (it.hasNext()) {
            Object next = it.next();
            CDNDownloadListener cDNDownloadListener = (CDNDownloadListener) next;
            c40752y.f90473a = bool;
            c40752y.f90474b = SpillingKt.nullOutSpilledVariable(iterable);
            c40752y.f90475c = it;
            c40752y.f90476d = SpillingKt.nullOutSpilledVariable(next);
            c40752y.f90477e = SpillingKt.nullOutSpilledVariable(cDNDownloadListener);
            c40752y.f90478f = i11;
            c40752y.f90481i = 1;
            if (cDNDownloadListener.onProgressDone2(bool, (Continuation<? super Unit>) c40752y) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.jumio.core.cdn.CDNDownloadListener, com.jumio.core.network.DownloadTask.ProgressListener
    public final Object onProgressException(Exception exc, Continuation continuation) {
        C40757z c40757z;
        Iterator it;
        int i11;
        Iterable iterable;
        if (continuation instanceof C40757z) {
            c40757z = (C40757z) continuation;
            int i12 = c40757z.f90495i;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c40757z.f90495i = i12 - Integer.MIN_VALUE;
            } else {
                c40757z = new C40757z(this, continuation);
            }
        } else {
            c40757z = new C40757z(this, continuation);
        }
        Object obj = c40757z.f90493g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c40757z.f90495i;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = this.f89913a;
            it = arrayList.iterator();
            i11 = 0;
            iterable = arrayList;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = c40757z.f90492f;
            it = c40757z.f90489c;
            Iterable iterable2 = (Iterable) c40757z.f90488b;
            Exception exc2 = c40757z.f90487a;
            ResultKt.throwOnFailure(obj);
            i11 = i14;
            exc = exc2;
            iterable = iterable2;
        }
        while (it.hasNext()) {
            Object next = it.next();
            CDNDownloadListener cDNDownloadListener = (CDNDownloadListener) next;
            c40757z.f90487a = exc;
            c40757z.f90488b = SpillingKt.nullOutSpilledVariable(iterable);
            c40757z.f90489c = it;
            c40757z.f90490d = SpillingKt.nullOutSpilledVariable(next);
            c40757z.f90491e = SpillingKt.nullOutSpilledVariable(cDNDownloadListener);
            c40757z.f90492f = i11;
            c40757z.f90495i = 1;
            if (cDNDownloadListener.onProgressException(exc, c40757z) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.jumio.core.cdn.CDNDownloadListener, com.jumio.core.network.DownloadTask.ProgressListener
    public final Object onProgressUpdate(float f11, Continuation continuation) {
        C40501A c40501a;
        Iterator it;
        int i11;
        Iterable iterable;
        if (continuation instanceof C40501A) {
            c40501a = (C40501A) continuation;
            int i12 = c40501a.f89912i;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c40501a.f89912i = i12 - Integer.MIN_VALUE;
            } else {
                c40501a = new C40501A(this, continuation);
            }
        } else {
            c40501a = new C40501A(this, continuation);
        }
        Object obj = c40501a.f89910g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c40501a.f89912i;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = this.f89913a;
            it = arrayList.iterator();
            i11 = 0;
            iterable = arrayList;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = c40501a.f89909f;
            float f12 = c40501a.f89904a;
            it = c40501a.f89906c;
            Iterable iterable2 = (Iterable) c40501a.f89905b;
            ResultKt.throwOnFailure(obj);
            i11 = i14;
            f11 = f12;
            iterable = iterable2;
        }
        while (it.hasNext()) {
            Object next = it.next();
            CDNDownloadListener cDNDownloadListener = (CDNDownloadListener) next;
            c40501a.f89905b = SpillingKt.nullOutSpilledVariable(iterable);
            c40501a.f89906c = it;
            c40501a.f89907d = SpillingKt.nullOutSpilledVariable(next);
            c40501a.f89908e = SpillingKt.nullOutSpilledVariable(cDNDownloadListener);
            c40501a.f89904a = f11;
            c40501a.f89909f = i11;
            c40501a.f89912i = 1;
            if (cDNDownloadListener.onProgressUpdate(f11, c40501a) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
