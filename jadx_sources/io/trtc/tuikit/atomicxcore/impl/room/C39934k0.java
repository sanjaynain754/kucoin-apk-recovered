package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.ListResultCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import io.trtc.tuikit.atomicxcore.api.room.DeviceRequestInfo;
import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipant;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantListener;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantState;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore;
import io.trtc.tuikit.atomicxcore.impl.common.C39495c;
import io.trtc.tuikit.atomicxcore.impl.common.C39509q;
import io.trtc.tuikit.atomicxcore.impl.room.log.C39937a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.k0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39934k0 extends RoomParticipantStore implements InterfaceC39917c {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ int f88764C = 0;

    /* JADX INFO: renamed from: A */
    public final TUIConferenceInvitationManager f88765A;

    /* JADX INFO: renamed from: B */
    public final RoomParticipantState f88766B;

    /* JADX INFO: renamed from: a */
    public final TUIRoomEngine f88767a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f88768b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f88769c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f88770d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f88771e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f88772f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n f88773g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f88774h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41669n f88775i;

    /* JADX INFO: renamed from: j */
    public final C39937a f88776j;

    /* JADX INFO: renamed from: k */
    public final int f88777k;

    /* JADX INFO: renamed from: l */
    public final int f88778l;

    /* JADX INFO: renamed from: m */
    public boolean f88779m;

    /* JADX INFO: renamed from: n */
    public boolean f88780n;

    /* JADX INFO: renamed from: o */
    public final LinkedHashMap f88781o;

    /* JADX INFO: renamed from: p */
    public final LinkedHashMap f88782p;

    /* JADX INFO: renamed from: q */
    public final LinkedHashMap f88783q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC41709m0 f88784r;

    /* JADX INFO: renamed from: s */
    public RoomInfo f88785s;

    /* JADX INFO: renamed from: t */
    public final C39921e f88786t;

    /* JADX INFO: renamed from: u */
    public final C39509q f88787u;

    /* JADX INFO: renamed from: v */
    public final C39874E f88788v;

    /* JADX INFO: renamed from: w */
    public final C39927h f88789w;

    /* JADX INFO: renamed from: x */
    public final C39923f f88790x;

    /* JADX INFO: renamed from: y */
    public final C39915b f88791y;

    /* JADX INFO: renamed from: z */
    public final TUIConferenceListManager f88792z;

    /* JADX WARN: Code duplicated, block: B:18:0x007e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b A[LOOP:0: B:23:0x0095->B:25:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0084 -> B:12:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m88348a(io.trtc.tuikit.atomicxcore.impl.room.C39934k0 r9, java.lang.String r10, p852kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.trtc.tuikit.atomicxcore.impl.room.C39934k0.m88348a(io.trtc.tuikit.atomicxcore.impl.room.k0, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098 A[LOOP:0: B:23:0x0092->B:25:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0081 -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public static final java.lang.Object m88351b(io.trtc.tuikit.atomicxcore.impl.room.C39934k0 r9, java.lang.String r10, p852kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.trtc.tuikit.atomicxcore.impl.room.C39934k0.m88351b(io.trtc.tuikit.atomicxcore.impl.room.k0, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public C39934k0(String roomID) {
        TUIRoomEngine roomEngine = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(roomEngine, "sharedInstance(...)");
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(roomEngine, "roomEngine");
        this.f88767a = roomEngine;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88768b = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a("");
        this.f88769c = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88770d = interfaceC41669nM91009a3;
        InterfaceC41669n interfaceC41669nM91009a4 = C41679x.m91009a(null);
        this.f88771e = interfaceC41669nM91009a4;
        InterfaceC41669n interfaceC41669nM91009a5 = C41679x.m91009a(CollectionsKt.emptyList());
        InterfaceC41669n interfaceC41669nM91009a6 = C41679x.m91009a(CollectionsKt.emptyList());
        InterfaceC41669n interfaceC41669nM91009a7 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88772f = interfaceC41669nM91009a7;
        InterfaceC41669n interfaceC41669nM91009a8 = C41679x.m91009a(new LinkedHashMap());
        this.f88773g = interfaceC41669nM91009a8;
        InterfaceC41669n interfaceC41669nM91009a9 = C41679x.m91009a(new LinkedHashMap());
        this.f88774h = interfaceC41669nM91009a9;
        InterfaceC41669n interfaceC41669nM91009a10 = C41679x.m91009a(new RoomParticipant(null, null, null, null, null, null, null, null, null, false, null, 2047, null));
        this.f88775i = interfaceC41669nM91009a10;
        Intrinsics.checkNotNullParameter("RoomParticipantStoreImpl", "file");
        this.f88776j = new C39937a("RoomParticipantStoreImpl");
        this.f88777k = 300;
        this.f88778l = 50;
        this.f88781o = new LinkedHashMap();
        this.f88782p = new LinkedHashMap();
        this.f88783q = new LinkedHashMap();
        this.f88784r = C41713n0.m91125a(C41782z0.m91393c());
        this.f88786t = new C39921e();
        this.f88787u = new C39509q();
        this.f88788v = new C39874E(this);
        this.f88789w = new C39927h(this, roomID);
        this.f88790x = new C39923f(this, roomID);
        this.f88791y = new C39915b(interfaceC41669nM91009a5, interfaceC41669nM91009a6);
        Object extension = roomEngine.getExtension(TUICommonDefine.ExtensionType.CONFERENCE_LIST_MANAGER);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager");
        this.f88792z = (TUIConferenceListManager) extension;
        Object extension2 = roomEngine.getExtension(TUICommonDefine.ExtensionType.CONFERENCE_INVITATION_MANAGER);
        Intrinsics.checkNotNull(extension2, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager");
        this.f88765A = (TUIConferenceInvitationManager) extension2;
        this.f88766B = new RoomParticipantState(C41636g.m90907c(interfaceC41669nM91009a), C41636g.m90907c(interfaceC41669nM91009a2), C41636g.m90907c(interfaceC41669nM91009a3), C41636g.m90907c(interfaceC41669nM91009a4), C41636g.m90907c(interfaceC41669nM91009a5), C41636g.m90907c(interfaceC41669nM91009a6), C41636g.m90907c(interfaceC41669nM91009a8), C41636g.m90907c(interfaceC41669nM91009a9), C41636g.m90907c(interfaceC41669nM91009a7), C41636g.m90907c(interfaceC41669nM91009a10));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void addRoomParticipantListener(RoomParticipantListener roomParticipantListener) {
        this.f88787u.m88248a(roomParticipantListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void approveOpenDeviceRequest(DeviceType device, String userID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(userID, "userID");
        m88353a(device, userID, true, completionHandler);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void cancelOpenDeviceRequest(DeviceType device, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(device, "device");
        C39915b c39915b = this.f88791y;
        c39915b.getClass();
        Intrinsics.checkNotNullParameter(device, "device");
        TUIRoomDefine.Request request = (TUIRoomDefine.Request) c39915b.f88729c.get(device);
        if (request != null) {
            this.f88767a.cancelRequest(request.requestId, new C39495c(completionHandler, new C39888L(this, device), null, 4));
            return;
        }
        C39937a c39937a = this.f88776j;
        c39937a.getClass();
        Intrinsics.checkNotNullParameter("No device application is requesting", "message");
        c39937a.m88357a(1, "No device application is requesting");
        if (completionHandler != null) {
            completionHandler.onFailure(TUICommonDefine.Error.FAILED.getValue(), "No device application is requesting");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void disableAllDevices(DeviceType device, boolean z11, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f88767a.disableDeviceForAllUserByAdmin(AbstractC39939m0.m88359a(device), z11, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void disableAllMessages(boolean z11, CompletionHandler completionHandler) {
        this.f88767a.disableSendingMessageForAllUser(z11, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void getParticipantList(String str, ListResultCompletionHandler listResultCompletionHandler) {
        RoomInfo roomInfo = this.f88785s;
        String roomID = roomInfo != null ? roomInfo.getRoomID() : null;
        if (roomID == null || roomID.length() == 0) {
            C39937a c39937a = this.f88776j;
            c39937a.getClass();
            Intrinsics.checkNotNullParameter("getParticipantList failed, not in room", "message");
            c39937a.m88357a(2, "getParticipantList failed, not in room");
            if (listResultCompletionHandler != null) {
                listResultCompletionHandler.onFailure(TUICommonDefine.Error.OPERATION_INVALID_BEFORE_ENTER_ROOM.getValue(), "not in room");
                return;
            }
            return;
        }
        if (!this.f88779m) {
            C41696j.m91104d(this.f88784r, null, null, new C39905U(this, str, roomID, listResultCompletionHandler, null), 3, null);
            return;
        }
        C39937a c39937a2 = this.f88776j;
        c39937a2.getClass();
        Intrinsics.checkNotNullParameter("getParticipantList failed, request limit", "message");
        c39937a2.m88357a(2, "getParticipantList failed, request limit");
        if (listResultCompletionHandler != null) {
            listResultCompletionHandler.onFailure(TUICommonDefine.Error.FREQ_LIMIT.getValue(), "request limit");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final RoomParticipantState getState() {
        return this.f88766B;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void muteMicrophone() {
        this.f88767a.muteLocalAudio();
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void rejectOpenDeviceRequest(DeviceType device, String userID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(userID, "userID");
        m88353a(device, userID, false, completionHandler);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void removeRoomParticipantListener(RoomParticipantListener roomParticipantListener) {
        this.f88787u.m88250b(roomParticipantListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void requestToOpenDevice(DeviceType device, int i11, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(device, "device");
        TUIRoomDefine.Request request = this.f88767a.applyToAdminToOpenLocalDevice(AbstractC39939m0.m88359a(device), i11, new C39926g0(this, device, completionHandler));
        C39915b c39915b = this.f88791y;
        Intrinsics.checkNotNull(request);
        c39915b.getClass();
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(request, "request");
        c39915b.f88729c.put(device, request);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void unmuteMicrophone(CompletionHandler completionHandler) {
        this.f88767a.unmuteLocalAudio(new C39495c(completionHandler, null, null, 6));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:54:0x0145  */
    /* JADX WARN: Code duplicated, block: B:67:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0096 -> B:12:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m88352c(io.trtc.tuikit.atomicxcore.impl.room.C39934k0 r13, java.lang.String r14, p852kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.trtc.tuikit.atomicxcore.impl.room.C39934k0.m88352c(io.trtc.tuikit.atomicxcore.impl.room.k0, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void acceptOpenDeviceInvitation(String userID, DeviceType device, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(device, "device");
        m88355a(userID, device, true, completionHandler);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void cancelOpenDeviceInvitation(String userID, DeviceType device, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(device, "device");
        TUIRoomDefine.Request requestM88343a = this.f88791y.m88343a(userID, device);
        if (requestM88343a == null) {
            C39937a c39937a = this.f88776j;
            c39937a.getClass();
            Intrinsics.checkNotNullParameter("No invitation is sent", "message");
            c39937a.m88357a(1, "No invitation is sent");
            if (completionHandler != null) {
                completionHandler.onFailure(TUICommonDefine.Error.FAILED.getValue(), "No invitation is sent");
                return;
            }
            return;
        }
        this.f88767a.cancelRequest(requestM88343a.requestId, new C39495c(completionHandler, new C39886K(this, userID, device), null, 4));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void closeParticipantDevice(String userID, DeviceType device, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(device, "device");
        this.f88767a.closeRemoteDeviceByAdmin(userID, AbstractC39939m0.m88359a(device), new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void declineOpenDeviceInvitation(String userID, DeviceType device, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(device, "device");
        m88355a(userID, device, false, completionHandler);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void disableUserMessage(String userID, boolean z11, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.f88767a.disableSendingMessageByAdmin(userID, z11, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void inviteToOpenDevice(String userID, DeviceType deviceType, int i11, CompletionHandler completionHandler) {
        Object value;
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(deviceType, "device");
        TUIRoomDefine.Request request = this.f88767a.openRemoteDeviceByAdmin(userID, AbstractC39939m0.m88359a(deviceType), i11, new C39912Z(this, deviceType, completionHandler, userID));
        C39915b c39915b = this.f88791y;
        Intrinsics.checkNotNull(request);
        c39915b.getClass();
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(deviceType, "device");
        Intrinsics.checkNotNullParameter(request, "request");
        C39908V0 c39908v0 = (C39908V0) c39915b.f88731e.get(userID);
        if (c39908v0 == null) {
            c39908v0 = new C39908V0(userID, MapsKt.emptyMap());
        }
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(request, "request");
        Map deviceRequests = MapsKt.toMutableMap(c39908v0.f88718b);
        deviceRequests.put(deviceType, request);
        String userId = c39908v0.f88717a;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(deviceRequests, "deviceRequests");
        c39915b.f88731e.put(userID, new C39908V0(userId, deviceRequests));
        InterfaceC41669n interfaceC41669n = c39915b.f88728b;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, CollectionsKt.plus((Collection<? extends DeviceRequestInfo>) value, AbstractC39939m0.m88361a(request))));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void kickUser(String userID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.f88767a.kickRemoteUserOutOfRoom(userID, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void revokeAdmin(String userID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.f88767a.changeUserRole(userID, TUIRoomDefine.Role.GENERAL_USER, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void setAdmin(String userID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.f88767a.changeUserRole(userID, TUIRoomDefine.Role.MANAGER, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void transferOwner(String userID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.f88767a.changeUserRole(userID, TUIRoomDefine.Role.ROOM_OWNER, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void updateParticipantMetaData(String userID, HashMap metaData, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        this.f88767a.setCustomInfoForUser(userID, metaData, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void updateParticipantNameCard(String userID, String nameCard, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(nameCard, "nameCard");
        this.f88767a.changeUserNameCard(userID, nameCard, new C39495c(completionHandler, null, null, 6));
    }

    /* JADX INFO: renamed from: b */
    public final void m88356b(RoomParticipant roomParticipant) {
        Object next;
        if (roomParticipant.getUserID().length() == 0) {
            return;
        }
        Iterator it = ((Iterable) this.f88770d.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((RoomParticipant) next).getUserID(), roomParticipant.getUserID()));
        RoomParticipant roomParticipant2 = (RoomParticipant) next;
        if (Intrinsics.areEqual(roomParticipant2 != null ? roomParticipant2.getUserID() : null, roomParticipant.getUserID())) {
            AbstractC39913a.m88342b(this.f88770d, roomParticipant, C39932j0.f88761a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m88349a(C39934k0 c39934k0) {
        List list = (List) c39934k0.f88768b.getValue();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((RoomParticipant) it.next()).getUserID());
        }
        for (Map.Entry entry : c39934k0.f88782p.entrySet()) {
            if (linkedHashSet.add(entry.getKey())) {
                listCreateListBuilder.add(entry.getValue());
            }
        }
        for (Map.Entry entry2 : c39934k0.f88783q.entrySet()) {
            if (linkedHashSet.add(entry2.getKey())) {
                listCreateListBuilder.add(entry2.getValue());
            }
        }
        c39934k0.f88772f.setValue(CollectionsKt.build(listCreateListBuilder));
    }

    /* JADX INFO: renamed from: a */
    public final void m88353a(DeviceType deviceType, String userID, boolean z11, CompletionHandler completionHandler) {
        TUIRoomDefine.Request request;
        C39915b c39915b = this.f88791y;
        c39915b.getClass();
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(deviceType, "device");
        C39908V0 c39908v0 = (C39908V0) c39915b.f88730d.get(userID);
        if (c39908v0 != null) {
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            request = (TUIRoomDefine.Request) c39908v0.f88718b.get(deviceType);
        } else {
            request = null;
        }
        if (request == null) {
            C39937a c39937a = this.f88776j;
            c39937a.getClass();
            Intrinsics.checkNotNullParameter("Not receiving requests", "message");
            c39937a.m88357a(1, "Not receiving requests");
            if (completionHandler != null) {
                completionHandler.onFailure(TUICommonDefine.Error.FAILED.getValue(), "Not receiving requests");
                return;
            }
            return;
        }
        this.f88767a.responseRemoteRequest(request.requestId, z11, "", new C39495c(completionHandler, new C39928h0(this, deviceType, userID), null, 4));
    }

    /* JADX INFO: renamed from: a */
    public final void m88355a(String userID, DeviceType deviceType, boolean z11, CompletionHandler completionHandler) {
        TUIRoomDefine.Request request;
        C39915b c39915b = this.f88791y;
        c39915b.getClass();
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(deviceType, "device");
        C39908V0 c39908v0 = (C39908V0) c39915b.f88732f.get(userID);
        if (c39908v0 != null) {
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            request = (TUIRoomDefine.Request) c39908v0.f88718b.get(deviceType);
        } else {
            request = null;
        }
        if (request == null) {
            C39937a c39937a = this.f88776j;
            c39937a.getClass();
            Intrinsics.checkNotNullParameter("Not receiving invitations", "message");
            c39937a.m88357a(1, "Not receiving invitations");
            if (completionHandler != null) {
                completionHandler.onFailure(TUICommonDefine.Error.FAILED.getValue(), "Not receiving invitations");
                return;
            }
            return;
        }
        this.f88767a.responseRemoteRequest(request.requestId, z11, "", new C39495c(completionHandler, new C39930i0(this, userID, deviceType), null, 4));
    }

    /* JADX INFO: renamed from: a */
    public final void m88354a(RoomParticipant participant) {
        C39934k0 c39934k0;
        Object value;
        Object value2;
        ArrayList arrayList;
        Object value3;
        ArrayList arrayList2;
        Object value4;
        Intrinsics.checkNotNullParameter(participant, "participant");
        this.f88781o.put(participant.getUserID(), participant);
        AbstractC39913a.m88341a(this.f88768b, participant, C39882I.f88637a);
        if (Intrinsics.areEqual(TUIRoomEngine.getSelfInfo().userId, participant.getUserID())) {
            InterfaceC41669n interfaceC41669n = this.f88775i;
            do {
                value4 = interfaceC41669n.getValue();
            } while (!interfaceC41669n.compareAndSet(value4, RoomParticipant.copy$default(participant, null, null, null, null, null, null, null, null, null, false, null, 2047, null)));
        }
        m88356b(participant);
        if (participant.getUserID().length() == 0) {
            c39934k0 = this;
        } else {
            c39934k0 = this;
            RoomParticipant roomParticipant = (RoomParticipant) c39934k0.f88771e.getValue();
            if (Intrinsics.areEqual(roomParticipant != null ? roomParticipant.getUserID() : null, participant.getUserID())) {
                InterfaceC41669n interfaceC41669n2 = c39934k0.f88771e;
                do {
                    value = interfaceC41669n2.getValue();
                } while (!interfaceC41669n2.compareAndSet(value, participant));
            }
        }
        String userID = participant.getUserID();
        Intrinsics.checkNotNullParameter(userID, "userID");
        c39934k0.f88782p.remove(userID);
        InterfaceC41669n interfaceC41669n3 = c39934k0.f88772f;
        do {
            value2 = interfaceC41669n3.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value2) {
                if (!Intrinsics.areEqual(((RoomParticipant) obj).getUserID(), userID)) {
                    arrayList.add(obj);
                }
            }
        } while (!interfaceC41669n3.compareAndSet(value2, arrayList));
        String userID2 = participant.getUserID();
        Intrinsics.checkNotNullParameter(userID2, "userID");
        c39934k0.f88783q.remove(userID2);
        InterfaceC41669n interfaceC41669n4 = c39934k0.f88772f;
        do {
            value3 = interfaceC41669n4.getValue();
            arrayList2 = new ArrayList();
            for (Object obj2 : (List) value3) {
                if (!Intrinsics.areEqual(((RoomParticipant) obj2).getUserID(), userID2)) {
                    arrayList2.add(obj2);
                }
            }
        } while (!interfaceC41669n4.compareAndSet(value3, arrayList2));
    }

    /* JADX INFO: renamed from: a */
    public static final void m88350a(C39934k0 c39934k0, String str, EnumC39906U0 enumC39906U0, boolean z11) {
        RoomParticipant roomParticipantCopy$default;
        Object value;
        ArrayList arrayList;
        Object value2;
        Object value3;
        RoomParticipant roomParticipant = (RoomParticipant) c39934k0.f88781o.get(str);
        if (roomParticipant == null) {
            if (!z11) {
                C39937a c39937a = c39934k0.f88776j;
                String message = "Ignore participant without stream userID: " + str;
                c39937a.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                c39937a.m88357a(0, message);
                return;
            }
            roomParticipantCopy$default = new RoomParticipant(str, null, null, null, null, null, null, null, null, false, null, 2046, null);
        } else {
            roomParticipantCopy$default = RoomParticipant.copy$default(roomParticipant, null, null, null, null, null, null, null, null, null, false, null, 2047, null);
        }
        DeviceStatus deviceStatusM88360a = AbstractC39939m0.m88360a(z11);
        int iOrdinal = enumC39906U0.ordinal();
        if (iOrdinal == 0) {
            roomParticipantCopy$default.setMicrophoneStatus(deviceStatusM88360a);
        } else if (iOrdinal == 1) {
            roomParticipantCopy$default.setCameraStatus(deviceStatusM88360a);
            if (deviceStatusM88360a == DeviceStatus.ON) {
                AbstractC39913a.m88341a(c39934k0.f88770d, roomParticipantCopy$default, C39918c0.f88734a);
            } else {
                InterfaceC41669n interfaceC41669n = c39934k0.f88770d;
                do {
                    value = interfaceC41669n.getValue();
                    arrayList = new ArrayList();
                    for (Object obj : (List) value) {
                        if (!Intrinsics.areEqual(((RoomParticipant) obj).getUserID(), str)) {
                            arrayList.add(obj);
                        }
                    }
                } while (!interfaceC41669n.compareAndSet(value, arrayList));
            }
        } else if (iOrdinal == 2) {
            roomParticipantCopy$default.setScreenShareStatus(deviceStatusM88360a);
            if (deviceStatusM88360a == DeviceStatus.ON) {
                InterfaceC41669n interfaceC41669n2 = c39934k0.f88771e;
                do {
                    value3 = interfaceC41669n2.getValue();
                } while (!interfaceC41669n2.compareAndSet(value3, roomParticipantCopy$default));
            } else {
                InterfaceC41669n interfaceC41669n3 = c39934k0.f88771e;
                do {
                    value2 = interfaceC41669n3.getValue();
                } while (!interfaceC41669n3.compareAndSet(value2, null));
            }
        }
        c39934k0.m88354a(roomParticipantCopy$default);
    }
}
