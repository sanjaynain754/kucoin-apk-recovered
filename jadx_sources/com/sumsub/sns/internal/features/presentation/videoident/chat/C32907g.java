package com.sumsub.sns.internal.features.presentation.videoident.chat;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.chat.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32907g implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32917q f67312a;

    public C32907g(C32917q c32917q) {
        this.f67312a = c32917q;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32905e c32905e = (C32905e) obj;
        C32917q c32917q = this.f67312a;
        if ((((SNSVideoChatState) c32917q.f67342n.getValue()) instanceof C32924y) && c32905e.f67309a) {
            c32917q.f67342n.setValue(new C32924y(false, c32905e.f67310b, c32905e.f67311c, false));
        }
        return Unit.INSTANCE;
    }
}
