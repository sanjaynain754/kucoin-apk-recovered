package io.trtc.tuikit.atomicxcore.impl.call;

import androidx.core.app.FrameMetricsAggregator;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.call.CallInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceFocusOwner;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.p */
/* JADX INFO: loaded from: classes61.dex */
public final class C39484p implements TUICommonDefine.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39491w f87655a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87656b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f87657c;

    public C39484p(C39491w c39491w, CompletionHandler completionHandler, String str) {
        this.f87655a = c39491w;
        this.f87656b = completionHandler;
        this.f87657c = str;
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Callback
    public final void onError(int i11, String str) {
        C39491w.m88240a(this.f87655a);
        CompletionHandler completionHandler = this.f87656b;
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
        InterfaceC41669n interfaceC41669n = this.f87655a.f87671d;
        CallInfo callInfo = new CallInfo(null, null, null, null, null, null, null, 0L, 0L, FrameMetricsAggregator.EVERY_DURATION, null);
        callInfo.setCallId(this.f87657c);
        callInfo.setMediaType(CallMediaType.Audio);
        interfaceC41669n.setValue(callInfo);
        InterfaceC41669n interfaceC41669n2 = this.f87655a.f87673f;
        do {
            value = interfaceC41669n2.getValue();
            callParticipantStatus = CallParticipantStatus.Accept;
        } while (!interfaceC41669n2.compareAndSet(value, CallParticipantInfo.copy$default((CallParticipantInfo) value, null, null, null, null, callParticipantStatus, false, false, 111, null)));
        C39491w c39491w = this.f87655a;
        C39491w.m88242a(c39491w, ((CallParticipantInfo) c39491w.f87673f.getValue()).getId(), callParticipantStatus);
        this.f87655a.f87674g.m88249a((Function1) new C39483o(this.f87657c));
        CompletionHandler completionHandler = this.f87656b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
