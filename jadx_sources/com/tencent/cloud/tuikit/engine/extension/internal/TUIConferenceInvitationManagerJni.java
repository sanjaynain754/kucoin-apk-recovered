package com.tencent.cloud.tuikit.engine.extension.internal;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.internal.TUIDefineConvert;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::extension")
public class TUIConferenceInvitationManagerJni {
    private static final String INVITEE = "invitee";
    private static final String INVITER = "inviter";
    private static final String TAG = "TUIConferenceInvitationManagerJni";
    private long mNativeTUIConferenceInvitationManagerJni;
    private final List<TUIConferenceInvitationManager.Observer> mObserverList = new CopyOnWriteArrayList();

    public static class ActionCallback {
        private TUIRoomDefine.ActionCallback mCallback;

        @CalledByNative("ActionCallback")
        public void onError(int i11, String str) {
            TUIRoomDefine.ActionCallback actionCallback = this.mCallback;
            if (actionCallback != null) {
                actionCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("ActionCallback")
        public void onSuccess() {
            TUIRoomDefine.ActionCallback actionCallback = this.mCallback;
            if (actionCallback != null) {
                actionCallback.onSuccess();
            }
        }

        public ActionCallback(TUIRoomDefine.ActionCallback actionCallback) {
            this.mCallback = actionCallback;
        }
    }

    public static class GetInvitationListCallback {
        private TUIConferenceInvitationManager.GetInvitationListCallback mCallback;

        @CalledByNative("GetInvitationListCallback")
        public void onError(int i11, String str) {
            TUIConferenceInvitationManager.GetInvitationListCallback getInvitationListCallback = this.mCallback;
            if (getInvitationListCallback != null) {
                getInvitationListCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("GetInvitationListCallback")
        public void onSuccess(TUIConferenceInvitationManager.InvitationListResult invitationListResult) {
            TUIConferenceInvitationManager.GetInvitationListCallback getInvitationListCallback = this.mCallback;
            if (getInvitationListCallback != null) {
                getInvitationListCallback.onSuccess(invitationListResult);
            }
        }

        public GetInvitationListCallback(TUIConferenceInvitationManager.GetInvitationListCallback getInvitationListCallback) {
            this.mCallback = getInvitationListCallback;
        }
    }

    public static class InviteUsersCallback {
        private TUIConferenceInvitationManager.InviteUsersCallback mCallback;

        @CalledByNative("InviteUsersCallback")
        public void onError(int i11, String str) {
            TUIConferenceInvitationManager.InviteUsersCallback inviteUsersCallback = this.mCallback;
            if (inviteUsersCallback != null) {
                inviteUsersCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("InviteUsersCallback")
        public void onSuccess(String str) {
            if (this.mCallback != null) {
                HashMap map = new HashMap();
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i11);
                        map.put(jSONObject.getString("userId"), TUIConferenceInvitationManager.InvitationCode.fromInt(jSONObject.getInt("errorCode")));
                    }
                } catch (JSONException e11) {
                    LiteavLog.m76083e(TUIConferenceInvitationManagerJni.TAG, "createInvitationCodeMap error:" + e11.getMessage());
                }
                this.mCallback.onSuccess(map);
            }
        }

        public InviteUsersCallback(TUIConferenceInvitationManager.InviteUsersCallback inviteUsersCallback) {
            this.mCallback = inviteUsersCallback;
        }
    }

    private static native void nativeAccept(long j11, String str, ActionCallback actionCallback);

    private static native void nativeCancelInvitation(long j11, String str, String[] strArr, ActionCallback actionCallback);

    private static native void nativeGetInvitationList(long j11, String str, String str2, int i11, GetInvitationListCallback getInvitationListCallback);

    private static native void nativeInviteUsers(long j11, String str, String[] strArr, int i11, String str2, InviteUsersCallback inviteUsersCallback);

    private static native void nativeReject(long j11, String str, int i11, ActionCallback actionCallback);

    private static native void nativeSetObserver(long j11, Object obj);

    private static TUIConferenceInvitationManager.Invitation convertStringToInvitation(String str) {
        TUIConferenceInvitationManager.Invitation invitation = new TUIConferenceInvitationManager.Invitation();
        try {
            JSONObject jSONObject = new JSONObject(str);
            invitation.status = TUIConferenceInvitationManager.InvitationStatus.fromInt(jSONObject.getInt("status"));
            invitation.invitee = TUIDefineConvert.convertStringToUserInfo(jSONObject.getString(INVITEE));
            invitation.inviter = TUIDefineConvert.convertStringToUserInfo(jSONObject.getString(INVITER));
            return invitation;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, "convertStringToInvitation error:" + e11.getMessage());
            return invitation;
        }
    }

    private static List<TUIConferenceInvitationManager.Invitation> convertStringToInvitationList(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                arrayList.add(convertStringToInvitation(jSONArray.getString(i11)));
            }
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, "convertStringToInvitationList error:" + e11.getMessage());
        }
        return arrayList;
    }

    private List<TUIConferenceInvitationManager.Observer> copyOnReadListeners() {
        return new CopyOnWriteArrayList(this.mObserverList);
    }

    @CalledByNative
    public static TUIConferenceInvitationManager.InvitationListResult createInvitationListResult(String str, String str2) {
        TUIConferenceInvitationManager.InvitationListResult invitationListResult = new TUIConferenceInvitationManager.InvitationListResult();
        invitationListResult.cursor = str;
        invitationListResult.invitationList = convertStringToInvitationList(str2);
        return invitationListResult;
    }

    private boolean isInvitationManagerJniNull(TUIRoomDefine.ActionCallback actionCallback) {
        if (this.mNativeTUIConferenceInvitationManagerJni != 0) {
            return false;
        }
        if (actionCallback == null) {
            return true;
        }
        actionCallback.onError(TUICommonDefine.Error.FAILED, "conferenceListManager is null");
        return true;
    }

    public void addObserver(TUIConferenceInvitationManager.Observer observer) {
        if (observer == null || this.mObserverList.contains(observer)) {
            return;
        }
        this.mObserverList.add(observer);
    }

    public void getInvitationList(String str, String str2, int i11, TUIConferenceInvitationManager.GetInvitationListCallback getInvitationListCallback) {
        long j11 = this.mNativeTUIConferenceInvitationManagerJni;
        if (j11 != 0) {
            nativeGetInvitationList(j11, str, str2, i11, new GetInvitationListCallback(getInvitationListCallback));
        } else if (getInvitationListCallback != null) {
            getInvitationListCallback.onError(TUICommonDefine.Error.FAILED, "conferenceListManager is null");
        }
    }

    public void inviteUsers(String str, List<String> list, int i11, String str2, TUIConferenceInvitationManager.InviteUsersCallback inviteUsersCallback) {
        long j11 = this.mNativeTUIConferenceInvitationManagerJni;
        if (j11 != 0) {
            nativeInviteUsers(j11, str, (String[]) list.toArray(new String[0]), i11, str2, new InviteUsersCallback(inviteUsersCallback));
        } else if (inviteUsersCallback != null) {
            inviteUsersCallback.onError(TUICommonDefine.Error.FAILED, "conferenceListManager is null");
        }
    }

    public void removeObserver(TUIConferenceInvitationManager.Observer observer) {
        if (observer == null) {
            return;
        }
        this.mObserverList.remove(observer);
    }

    public TUIConferenceInvitationManagerJni(long j11) {
        this.mNativeTUIConferenceInvitationManagerJni = j11;
        if (j11 != 0) {
            nativeSetObserver(j11, this);
        }
    }

    public void accept(String str, TUIRoomDefine.ActionCallback actionCallback) {
        if (isInvitationManagerJniNull(actionCallback)) {
            return;
        }
        nativeAccept(this.mNativeTUIConferenceInvitationManagerJni, str, new ActionCallback(actionCallback));
    }

    public void cancelInvitation(String str, List<String> list, TUIRoomDefine.ActionCallback actionCallback) {
        if (isInvitationManagerJniNull(actionCallback)) {
            return;
        }
        nativeCancelInvitation(this.mNativeTUIConferenceInvitationManagerJni, str, (String[]) list.toArray(new String[0]), new ActionCallback(actionCallback));
    }

    @CalledByNative
    public void onInvitationAccepted(String str, String str2) {
        TUIRoomDefine.RoomInfo roomInfoConvertStringToRoomInfo = TUIDefineConvert.convertStringToRoomInfo(str);
        TUIConferenceInvitationManager.Invitation invitationConvertStringToInvitation = convertStringToInvitation(str2);
        Iterator<TUIConferenceInvitationManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onInvitationAccepted(roomInfoConvertStringToRoomInfo, invitationConvertStringToInvitation);
        }
    }

    @CalledByNative
    public void onInvitationAdded(String str, String str2) {
        TUIConferenceInvitationManager.Invitation invitationConvertStringToInvitation = convertStringToInvitation(str2);
        Iterator<TUIConferenceInvitationManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onInvitationAdded(str, invitationConvertStringToInvitation);
        }
    }

    @CalledByNative
    public void onInvitationCancelled(String str, String str2) {
        TUIRoomDefine.RoomInfo roomInfoConvertStringToRoomInfo = TUIDefineConvert.convertStringToRoomInfo(str);
        TUIConferenceInvitationManager.Invitation invitationConvertStringToInvitation = convertStringToInvitation(str2);
        Iterator<TUIConferenceInvitationManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onInvitationCancelled(roomInfoConvertStringToRoomInfo, invitationConvertStringToInvitation);
        }
    }

    @CalledByNative
    public void onInvitationHandledByOtherDevice(String str, boolean z11) {
        TUIRoomDefine.RoomInfo roomInfoConvertStringToRoomInfo = TUIDefineConvert.convertStringToRoomInfo(str);
        Iterator<TUIConferenceInvitationManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onInvitationHandledByOtherDevice(roomInfoConvertStringToRoomInfo, z11);
        }
    }

    @CalledByNative
    public void onInvitationRejected(String str, String str2, int i11) {
        TUIRoomDefine.RoomInfo roomInfoConvertStringToRoomInfo = TUIDefineConvert.convertStringToRoomInfo(str);
        TUIConferenceInvitationManager.Invitation invitationConvertStringToInvitation = convertStringToInvitation(str2);
        Iterator<TUIConferenceInvitationManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onInvitationRejected(roomInfoConvertStringToRoomInfo, invitationConvertStringToInvitation, TUIConferenceInvitationManager.RejectedReason.fromInt(i11));
        }
    }

    @CalledByNative
    public void onInvitationRemoved(String str, String str2) {
        TUIConferenceInvitationManager.Invitation invitationConvertStringToInvitation = convertStringToInvitation(str2);
        Iterator<TUIConferenceInvitationManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onInvitationRemoved(str, invitationConvertStringToInvitation);
        }
    }

    @CalledByNative
    public void onInvitationRevokedByAdmin(String str, String str2, String str3) {
        TUIRoomDefine.RoomInfo roomInfoConvertStringToRoomInfo = TUIDefineConvert.convertStringToRoomInfo(str);
        TUIConferenceInvitationManager.Invitation invitationConvertStringToInvitation = convertStringToInvitation(str2);
        TUIRoomDefine.UserInfo userInfoConvertStringToUserInfo = TUIDefineConvert.convertStringToUserInfo(str3);
        Iterator<TUIConferenceInvitationManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onInvitationRevokedByAdmin(roomInfoConvertStringToRoomInfo, invitationConvertStringToInvitation, userInfoConvertStringToUserInfo);
        }
    }

    @CalledByNative
    public void onInvitationStatusChanged(String str, String str2) {
        TUIConferenceInvitationManager.Invitation invitationConvertStringToInvitation = convertStringToInvitation(str2);
        Iterator<TUIConferenceInvitationManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onInvitationStatusChanged(str, invitationConvertStringToInvitation);
        }
    }

    @CalledByNative
    public void onInvitationTimeout(String str, String str2) {
        TUIRoomDefine.RoomInfo roomInfoConvertStringToRoomInfo = TUIDefineConvert.convertStringToRoomInfo(str);
        TUIConferenceInvitationManager.Invitation invitationConvertStringToInvitation = convertStringToInvitation(str2);
        Iterator<TUIConferenceInvitationManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onInvitationTimeout(roomInfoConvertStringToRoomInfo, invitationConvertStringToInvitation);
        }
    }

    @CalledByNative
    public void onReceiveInvitation(String str, String str2, String str3) {
        TUIRoomDefine.RoomInfo roomInfoConvertStringToRoomInfo = TUIDefineConvert.convertStringToRoomInfo(str);
        TUIConferenceInvitationManager.Invitation invitationConvertStringToInvitation = convertStringToInvitation(str2);
        Iterator<TUIConferenceInvitationManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onReceiveInvitation(roomInfoConvertStringToRoomInfo, invitationConvertStringToInvitation, str3);
        }
    }

    public void reject(String str, TUIConferenceInvitationManager.RejectedReason rejectedReason, TUIRoomDefine.ActionCallback actionCallback) {
        if (isInvitationManagerJniNull(actionCallback)) {
            return;
        }
        nativeReject(this.mNativeTUIConferenceInvitationManagerJni, str, rejectedReason.getValue(), new ActionCallback(actionCallback));
    }
}
