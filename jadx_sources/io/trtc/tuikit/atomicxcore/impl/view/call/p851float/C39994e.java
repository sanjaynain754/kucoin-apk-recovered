package io.trtc.tuikit.atomicxcore.impl.view.call.p851float;

import android.widget.TextView;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import io.trtc.tuikit.atomicxcore.impl.view.call.C40040x;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.float.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C39994e implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40002m f88943a;

    public C39994e(C40002m c40002m) {
        this.f88943a = c40002m;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C40002m c40002m = this.f88943a;
        for (CallParticipantInfo callParticipantInfo : (LinkedHashSet) obj) {
            C40040x c40040x = c40002m.f88960c;
            TextView textView = null;
            if (Intrinsics.areEqual(callParticipantInfo.getId(), c40040x != null ? c40040x.getParticipantId() : null)) {
                TextView textView2 = c40002m.f88969l;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textUserName");
                } else {
                    textView = textView2;
                }
                textView.setText(callParticipantInfo.getName());
            }
        }
        return Unit.INSTANCE;
    }
}
