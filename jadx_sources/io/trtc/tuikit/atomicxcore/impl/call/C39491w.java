package io.trtc.tuikit.atomicxcore.impl.call;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.app.FrameMetricsAggregator;
import com.tencent.cloud.tuikit.engine.call.TUICallDefine;
import com.tencent.cloud.tuikit.engine.call.TUICallEngine;
import com.tencent.cloud.tuikit.engine.common.ContextProvider;
import com.tencent.imsdk.p128v2.V2TIMManager;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.call.CallDirection;
import io.trtc.tuikit.atomicxcore.api.call.CallInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallListener;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;
import io.trtc.tuikit.atomicxcore.api.call.CallParams;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantStatus;
import io.trtc.tuikit.atomicxcore.api.call.CallState;
import io.trtc.tuikit.atomicxcore.api.call.CallStore;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.impl.common.C39509q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.w */
/* JADX INFO: loaded from: classes61.dex */
public final class C39491w extends CallStore {

    /* JADX INFO: renamed from: l */
    public static final Lazy f87667l = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39471c.f87629a);

    /* JADX INFO: renamed from: a */
    public final Context f87668a;

    /* JADX INFO: renamed from: b */
    public HandlerThread f87669b;

    /* JADX INFO: renamed from: c */
    public Handler f87670c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f87671d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f87672e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f87673f;

    /* JADX INFO: renamed from: g */
    public final C39509q f87674g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f87675h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41669n f87676i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC41669n f87677j;

    /* JADX INFO: renamed from: k */
    public final CallState f87678k;

    /* JADX INFO: renamed from: a */
    public static final void m88242a(C39491w c39491w, String str, CallParticipantStatus callParticipantStatus) {
        Object next;
        Object value;
        ArrayList arrayList;
        c39491w.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        Iterator it = ((Iterable) c39491w.f87675h.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((CallParticipantInfo) next).getId(), str));
        if (((CallParticipantInfo) next) == null) {
            CallParticipantInfo callParticipantInfo = new CallParticipantInfo(null, null, null, null, null, false, false, 127, null);
            callParticipantInfo.setId(str);
            callParticipantInfo.setStatus(callParticipantStatus);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(callParticipantInfo.getId());
            V2TIMManager.getFriendshipManager().getFriendsInfo(arrayList2, new C39480l(new C39490v(c39491w, callParticipantInfo)));
            return;
        }
        InterfaceC41669n interfaceC41669n = c39491w.f87675h;
        do {
            value = interfaceC41669n.getValue();
            LinkedHashSet<CallParticipantInfo> linkedHashSet = (LinkedHashSet) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet, 10));
            for (CallParticipantInfo callParticipantInfoCopy$default : linkedHashSet) {
                if (Intrinsics.areEqual(callParticipantInfoCopy$default.getId(), str)) {
                    callParticipantInfoCopy$default = CallParticipantInfo.copy$default(callParticipantInfoCopy$default, null, null, null, null, callParticipantStatus, false, false, 111, null);
                }
                arrayList.add(callParticipantInfoCopy$default);
                callParticipantStatus = callParticipantStatus;
            }
        } while (!interfaceC41669n.compareAndSet(value, (LinkedHashSet) CollectionsKt.toCollection(arrayList, new LinkedHashSet())));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.call.CallStore
    public final void accept(CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter("accept", "message");
        AbstractC39492x.m88243a(0, "accept");
        TUICallEngine.createInstance(this.f87668a).accept(new C39472d(completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.call.CallStore
    public final void addListener(CallListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f87674g.m88248a(listener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.call.CallStore
    public final void deleteRecentCalls(List callIdList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(callIdList, "callIdList");
        String message = "deleteRecentCalls, callIdList: " + callIdList;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        TUICallEngine.createInstance(this.f87668a).deleteRecordCalls(callIdList, new C39479k(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.call.CallStore
    public final CallState getObserverState() {
        return this.f87678k;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.call.CallStore
    public final void hangup(CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter("hangup", "message");
        AbstractC39492x.m88243a(0, "hangup");
        TUICallEngine.createInstance(this.f87668a).hangup(new C39481m(completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.call.CallStore
    public final void invite(List participantIds, CallParams callParams, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(participantIds, "participantIds");
        String message = "invite, participantIds: " + participantIds + " params: " + callParams;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        TUICallEngine.createInstance(this.f87668a).inviteUser(participantIds, AbstractC39470b.m88237a(callParams), new C39482n(completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.call.CallStore
    public final void join(String callId, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        String message = "join, callId: " + callId;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        TUICallEngine.createInstance(this.f87668a).join(callId, new C39484p(this, completionHandler, callId));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.call.CallStore
    public final void queryRecentCalls(String cursor, int i11, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        String message = "queryRecentCalls, cursor: " + cursor + " count " + i11;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        TUICallEngine.createInstance(this.f87668a).queryRecentCalls(null, new C39485q(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.call.CallStore
    public final void reject(CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter("reject", "message");
        AbstractC39492x.m88243a(0, "reject");
        TUICallEngine.createInstance(this.f87668a).reject(new C39488t(completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.call.CallStore
    public final void removeListener(CallListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f87674g.m88250b(listener);
    }

    public C39491w() {
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(new CallInfo("", "", "", new LinkedHashSet(), "", null, CallDirection.Unknown, 0L, 0L));
        this.f87671d = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(new LinkedHashSet());
        this.f87672e = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a("");
        InterfaceC41669n interfaceC41669nM91009a4 = C41679x.m91009a(new CallParticipantInfo("", "", "", "", CallParticipantStatus.None, false, false));
        this.f87673f = interfaceC41669nM91009a4;
        this.f87674g = new C39509q();
        InterfaceC41669n interfaceC41669nM91009a5 = C41679x.m91009a(new LinkedHashSet());
        this.f87675h = interfaceC41669nM91009a5;
        InterfaceC41669n interfaceC41669nM91009a6 = C41679x.m91009a(new LinkedHashMap());
        this.f87676i = interfaceC41669nM91009a6;
        InterfaceC41669n interfaceC41669nM91009a7 = C41679x.m91009a(new LinkedHashMap());
        this.f87677j = interfaceC41669nM91009a7;
        this.f87678k = new CallState(C41636g.m90907c(interfaceC41669nM91009a), C41636g.m90907c(interfaceC41669nM91009a2), C41636g.m90907c(interfaceC41669nM91009a3), C41636g.m90907c(interfaceC41669nM91009a4), C41636g.m90907c(interfaceC41669nM91009a5), C41636g.m90907c(interfaceC41669nM91009a6), C41636g.m90907c(interfaceC41669nM91009a7));
        C39476h c39476h = new C39476h(this);
        Context applicationContext = ContextProvider.getApplicationContext();
        this.f87668a = applicationContext;
        TUICallEngine.createInstance(applicationContext).addObserver(c39476h);
        C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C39487s(this, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.call.CallStore
    public final void calls(List userIdList, CallMediaType mediaType, CallParams callParams, CompletionHandler completionHandler) {
        int i11;
        TUICallDefine.MediaType mediaType2;
        Intrinsics.checkNotNullParameter(userIdList, "userIdList");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        String message = "calls, userIdList: " + userIdList + " mediaType: " + mediaType + " params: " + callParams;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        String id2 = ((CallParticipantInfo) this.f87673f.getValue()).getId();
        if (id2.length() == 0) {
            Intrinsics.checkNotNullParameter("calls failed, selfId is empty", "message");
            AbstractC39492x.m88243a(2, "calls failed, selfId is empty");
            if (completionHandler != null) {
                completionHandler.onFailure(TUICallDefine.ERROR_PARAM_INVALID, "calls failed, selfId is empty");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : userIdList) {
            if (!Intrinsics.areEqual((String) obj, id2)) {
                arrayList.add(obj);
            }
        }
        List<String> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.toHashSet(arrayList));
        if (mutableList.isEmpty()) {
            Intrinsics.checkNotNullParameter("calls failed, userIdList is empty", "message");
            AbstractC39492x.m88243a(2, "calls failed, userIdList is empty");
            if (completionHandler != null) {
                completionHandler.onFailure(TUICallDefine.ERROR_PARAM_INVALID, "calls failed, userIdList is empty");
                return;
            }
            return;
        }
        if (mutableList.size() >= 9) {
            Intrinsics.checkNotNullParameter("calls failed, exceeding max user number: 9", "message");
            AbstractC39492x.m88243a(2, "calls failed, exceeding max user number: 9");
            if (completionHandler != null) {
                completionHandler.onFailure(TUICallDefine.ERROR_PARAM_INVALID, "calls failed, exceeding max user number");
                return;
            }
            return;
        }
        TUICallEngine tUICallEngineCreateInstance = TUICallEngine.createInstance(this.f87668a);
        if (mediaType == null) {
            i11 = -1;
        } else {
            i11 = AbstractC39469a.f87625a[mediaType.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                mediaType2 = TUICallDefine.MediaType.Unknown;
            } else {
                mediaType2 = TUICallDefine.MediaType.Video;
            }
        } else {
            mediaType2 = TUICallDefine.MediaType.Audio;
        }
        tUICallEngineCreateInstance.calls(mutableList, mediaType2, AbstractC39470b.m88237a(callParams), new C39478j(this, completionHandler, mutableList, mediaType, callParams));
    }

    /* JADX INFO: renamed from: a */
    public static final void m88241a(C39491w c39491w, String str) {
        c39491w.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        Iterable iterable = (Iterable) c39491w.f87675h.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((CallParticipantInfo) obj).getId(), str)) {
                arrayList.add(obj);
            }
        }
        c39491w.f87675h.setValue(new LinkedHashSet(arrayList));
    }

    /* JADX INFO: renamed from: a */
    public static final void m88240a(C39491w c39491w) {
        Object value;
        Object value2;
        Handler handler = c39491w.f87670c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            c39491w.f87670c = null;
        }
        HandlerThread handlerThread = c39491w.f87669b;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            c39491w.f87669b = null;
        }
        InterfaceC41669n interfaceC41669n = c39491w.f87671d;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, CallInfo.copy$default((CallInfo) value, null, null, null, null, null, null, null, 0L, 0L, 255, null)));
        DeviceStore.Companion companion = DeviceStore.INSTANCE;
        DeviceStatus value3 = companion.shared().getDeviceState().getCameraStatus().getValue();
        DeviceStatus deviceStatus = DeviceStatus.ON;
        if (value3 == deviceStatus) {
            companion.shared().closeLocalCamera();
        }
        if (companion.shared().getDeviceState().getMicrophoneStatus().getValue() == deviceStatus) {
            companion.shared().closeLocalMicrophone();
        }
        c39491w.f87671d.setValue(new CallInfo(null, null, null, null, null, null, null, 0L, 0L, FrameMetricsAggregator.EVERY_DURATION, null));
        InterfaceC41669n interfaceC41669n2 = c39491w.f87673f;
        do {
            value2 = interfaceC41669n2.getValue();
        } while (!interfaceC41669n2.compareAndSet(value2, CallParticipantInfo.copy$default((CallParticipantInfo) value2, null, null, null, null, CallParticipantStatus.None, false, false, 15, null)));
        c39491w.f87675h.setValue(new LinkedHashSet());
        c39491w.f87676i.setValue(new LinkedHashMap());
        c39491w.f87677j.setValue(new LinkedHashMap());
    }
}
