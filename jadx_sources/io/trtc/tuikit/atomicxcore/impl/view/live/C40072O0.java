package io.trtc.tuikit.atomicxcore.impl.view.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.O0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40072O0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40085V0 f89139a;

    public C40072O0(C40085V0 c40085v0) {
        this.f89139a = c40085v0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        LiveData<Boolean> liveData = this.f89139a.f89156a.mediaState.isMirrorEnabled;
        Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Boolean>");
        ((MutableLiveData) liveData).setValue(Boxing.boxBoolean(zBooleanValue));
        return Unit.INSTANCE;
    }
}
