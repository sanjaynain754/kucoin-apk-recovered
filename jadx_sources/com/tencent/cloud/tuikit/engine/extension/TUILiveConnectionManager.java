package com.tencent.cloud.tuikit.engine.extension;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public abstract class TUILiveConnectionManager {

    public enum ConnectionCode {
        UNKNOWN(-1),
        SUCCESS(0),
        ROOM_NOT_EXISTS(1),
        CONNECTING(2),
        CONNECTING_OTHER_ROOM(3),
        CONNECTION_FULL(4),
        RETRY(5),
        ROOM_MISMATCH(6);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        ConnectionCode(int i11) {
            this.mValue = i11;
        }

        public static ConnectionCode fromInt(int i11) {
            for (ConnectionCode connectionCode : values()) {
                if (connectionCode.mValue == i11) {
                    return connectionCode;
                }
            }
            return UNKNOWN;
        }
    }

    public interface ConnectionRequestCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(Map<String, ConnectionCode> map);
    }

    public static class ConnectionUser {
        public String avatarUrl;
        public long joinConnectionTime;
        public String roomId;
        public String userId;
        public String userName;
    }

    public abstract void acceptConnection(String str, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void addObserver(Observer observer);

    public abstract void cancelConnectionRequest(List<String> list, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void disconnect(TUIRoomDefine.ActionCallback actionCallback);

    public abstract void rejectConnection(String str, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void removeObserver(Observer observer);

    public abstract void requestConnection(List<String> list, int i11, String str, ConnectionRequestCallback connectionRequestCallback);

    public static abstract class Observer {
        public void onConnectionRequestAccept(ConnectionUser connectionUser) {
        }

        public void onConnectionRequestCancelled(ConnectionUser connectionUser) {
        }

        public void onConnectionRequestReject(ConnectionUser connectionUser) {
        }

        public void onConnectionRequestTimeout(ConnectionUser connectionUser, ConnectionUser connectionUser2) {
        }

        public void onConnectionRequestReceived(ConnectionUser connectionUser, List<ConnectionUser> list, String str) {
        }

        public void onConnectionUserListChanged(List<ConnectionUser> list, List<ConnectionUser> list2, List<ConnectionUser> list3) {
        }
    }
}
