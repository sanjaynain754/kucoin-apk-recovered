package com.tencent.cloud.tuikit.engine.extension;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public abstract class TUILiveBattleManager {

    public enum BattleCode {
        UNKNOWN(-1),
        SUCCESS(0),
        ROOM_NOT_EXISTS(1),
        BATTLING(2),
        BATTLING_OTHER_ROOM(3),
        ROOM_EXIT(4),
        RETRY(5);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        BattleCode(int i11) {
            this.mValue = i11;
        }

        public static BattleCode fromInt(int i11) {
            for (BattleCode battleCode : values()) {
                if (battleCode.mValue == i11) {
                    return battleCode;
                }
            }
            return UNKNOWN;
        }
    }

    public static class BattleConfig {
        public int duration;
        public String extensionInfo;
        public boolean needResponse;
    }

    public static class BattleInfo {
        public String battleId;
        public BattleConfig config;
        public long endTime;
        public List<BattleUser> inviteeList;
        public BattleUser inviter;
        public long startTime;
    }

    public interface BattleRequestCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(BattleInfo battleInfo, Map<String, BattleCode> map);
    }

    public enum BattleStoppedReason {
        TIME_OVER(0),
        OTHER_EXIT(1);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        BattleStoppedReason(int i11) {
            this.mValue = i11;
        }

        public static BattleStoppedReason fromInt(int i11) {
            for (BattleStoppedReason battleStoppedReason : values()) {
                if (battleStoppedReason.mValue == i11) {
                    return battleStoppedReason;
                }
            }
            return TIME_OVER;
        }
    }

    public static class BattleUser {
        public String avatarUrl;
        public String roomId;
        public int score;
        public String userId;
        public String userName;
    }

    public abstract void acceptBattle(String str, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void addObserver(Observer observer);

    public abstract void cancelBattleRequest(String str, List<String> list, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void exitBattle(String str, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void rejectBattle(String str, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void removeObserver(Observer observer);

    public abstract void requestBattle(BattleConfig battleConfig, List<String> list, int i11, BattleRequestCallback battleRequestCallback);

    public static abstract class Observer {
        public void onBattleStarted(BattleInfo battleInfo) {
        }

        public void onBattleEnded(BattleInfo battleInfo, BattleStoppedReason battleStoppedReason) {
        }

        public void onBattleScoreChanged(String str, List<BattleUser> list) {
        }

        public void onUserExitBattle(String str, BattleUser battleUser) {
        }

        public void onUserJoinBattle(String str, BattleUser battleUser) {
        }

        public void onBattleRequestAccept(BattleInfo battleInfo, BattleUser battleUser, BattleUser battleUser2) {
        }

        public void onBattleRequestCancelled(BattleInfo battleInfo, BattleUser battleUser, BattleUser battleUser2) {
        }

        public void onBattleRequestReceived(BattleInfo battleInfo, BattleUser battleUser, BattleUser battleUser2) {
        }

        public void onBattleRequestReject(BattleInfo battleInfo, BattleUser battleUser, BattleUser battleUser2) {
        }

        public void onBattleRequestTimeout(BattleInfo battleInfo, BattleUser battleUser, BattleUser battleUser2) {
        }
    }
}
