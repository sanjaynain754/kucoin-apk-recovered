package io.trtc.tuikit.atomicxcore.impl.view.call.p851float;

import android.widget.FrameLayout;
import android.widget.ImageView;
import io.trtc.tuikit.atomicxcore.api.call.CallInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantStatus;
import io.trtc.tuikit.atomicxcore.api.call.CallStore;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39399b;
import io.trtc.tuikit.atomicxcore.impl.view.call.C40040x;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.float.g */
/* JADX INFO: loaded from: classes61.dex */
public final class C39996g implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40002m f88947a;

    public C39996g(C40002m c40002m) {
        this.f88947a = c40002m;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C40002m c40002m;
        C40040x c40040x;
        CallParticipantInfo callParticipantInfo = (CallParticipantInfo) obj;
        CallParticipantStatus status = callParticipantInfo.getStatus();
        CallParticipantStatus callParticipantStatus = CallParticipantStatus.Accept;
        if (status == callParticipantStatus && (c40040x = (c40002m = this.f88947a).f88961d) != null) {
            c40040x.m88423a(true, c40002m.m88391a(80.0f), this.f88947a.m88391a(80.0f), 12.0f);
        }
        if (((CallInfo) AbstractC39399b.m88230a(CallStore.INSTANCE)).getMediaType() == CallMediaType.Audio) {
            return Unit.INSTANCE;
        }
        if (callParticipantInfo.getStatus() == callParticipantStatus) {
            FrameLayout frameLayout = this.f88947a.f88967j;
            ImageView imageView = null;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smallVideoContainer");
                frameLayout = null;
            }
            if (frameLayout.getVisibility() == 8) {
                this.f88947a.m88394a(false);
                this.f88947a.m88396c();
                this.f88947a.m88398e();
                this.f88947a.m88397d();
                ImageView imageView2 = this.f88947a.f88970m;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageBackground");
                } else {
                    imageView = imageView2;
                }
                imageView.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }
}
