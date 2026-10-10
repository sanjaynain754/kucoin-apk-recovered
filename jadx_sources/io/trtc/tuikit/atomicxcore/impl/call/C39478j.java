package io.trtc.tuikit.atomicxcore.impl.call;

import androidx.core.app.FrameMetricsAggregator;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.call.CallInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;
import io.trtc.tuikit.atomicxcore.api.call.CallParams;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceFocusOwner;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.j */
/* JADX INFO: loaded from: classes61.dex */
public final class C39478j implements TUICommonDefine.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39491w f87644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87645b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f87646c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CallMediaType f87647d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CallParams f87648e;

    public C39478j(C39491w c39491w, CompletionHandler completionHandler, List list, CallMediaType callMediaType, CallParams callParams) {
        this.f87644a = c39491w;
        this.f87645b = completionHandler;
        this.f87646c = list;
        this.f87647d = callMediaType;
        this.f87648e = callParams;
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Callback
    public final void onError(int i11, String str) {
        C39491w.m88240a(this.f87644a);
        CompletionHandler completionHandler = this.f87645b;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Callback
    public final void onSuccess() {
        Object value;
        CallParticipantStatus callParticipantStatus;
        DeviceStore.INSTANCE.shared().setFocus$atomicxcore_release(DeviceFocusOwner.CALL);
        String id2 = ((CallParticipantInfo) this.f87644a.f87673f.getValue()).getId();
        InterfaceC41669n interfaceC41669n = this.f87644a.f87671d;
        CallInfo callInfo = new CallInfo(null, null, null, null, null, null, null, 0L, 0L, FrameMetricsAggregator.EVERY_DURATION, null);
        List list = this.f87646c;
        CallMediaType callMediaType = this.f87647d;
        CallParams callParams = this.f87648e;
        callInfo.setInviteeIds(new LinkedHashSet<>(list));
        callInfo.setMediaType(callMediaType);
        callInfo.setInviterId(id2);
        if ((callParams != null ? callParams.getRoomId() : null) != null) {
            callInfo.setRoomId(callParams.getRoomId());
        }
        if ((callParams != null ? callParams.getChatGroupId() : null) != null) {
            callInfo.setChatGroupId(callParams.getChatGroupId());
        }
        interfaceC41669n.setValue(callInfo);
        InterfaceC41669n interfaceC41669n2 = this.f87644a.f87673f;
        do {
            value = interfaceC41669n2.getValue();
            callParticipantStatus = CallParticipantStatus.Waiting;
        } while (!interfaceC41669n2.compareAndSet(value, CallParticipantInfo.copy$default((CallParticipantInfo) value, null, null, null, null, callParticipantStatus, false, false, 111, null)));
        C39491w c39491w = this.f87644a;
        C39491w.m88242a(c39491w, ((CallParticipantInfo) c39491w.f87673f.getValue()).getId(), callParticipantStatus);
        this.f87644a.f87674g.m88249a((Function1) new C39477i(this.f87647d));
        CompletionHandler completionHandler = this.f87645b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
