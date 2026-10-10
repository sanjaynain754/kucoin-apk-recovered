package io.trtc.tuikit.atomicxcore.impl.view.call;

import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.m */
/* JADX INFO: loaded from: classes61.dex */
public final class C40017m implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40040x f89014a;

    public C40017m(C40040x c40040x) {
        this.f89014a = c40040x;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        Integer num = (Integer) ((Map) obj).get(this.f89014a.f89079l.getId());
        if (num != null) {
            C40040x.m88415a(this.f89014a, num.intValue());
        }
        return Unit.INSTANCE;
    }
}
