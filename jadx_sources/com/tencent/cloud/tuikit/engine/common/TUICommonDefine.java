package com.tencent.cloud.tuikit.engine.common;

import com.tencent.liteav.TXLiteAVCode;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr;

/* JADX INFO: loaded from: classes59.dex */
public class TUICommonDefine {

    public enum AudioPlaybackDevice {
        Speakerphone(0),
        Earpiece(1);

        final int mValue;

        public int getValue() {
            return this.mValue;
        }

        AudioPlaybackDevice(int i11) {
            this.mValue = i11;
        }

        public static AudioPlaybackDevice fromInt(int i11) {
            for (AudioPlaybackDevice audioPlaybackDevice : values()) {
                if (audioPlaybackDevice.mValue == i11) {
                    return audioPlaybackDevice;
                }
            }
            return Speakerphone;
        }
    }

    public interface Callback {
        void onError(int i11, String str);

        void onSuccess();
    }

    public enum Camera {
        Front(0),
        Back(1);

        final int mValue;

        public int getValue() {
            return this.mValue;
        }

        Camera(int i11) {
            this.mValue = i11;
        }

        public static Camera fromInt(int i11) {
            for (Camera camera : values()) {
                if (camera.mValue == i11) {
                    return camera;
                }
            }
            return Front;
        }
    }

    public enum Error {
        SUCCESS(0),
        FAILED(-1),
        FREQ_LIMIT(-2),
        REPEAT_OPERATION(-3),
        ROOM_MISMATCH(-4),
        SDKAPPID_NOT_FOUND(-1000),
        INVALID_PARAMETER(-1001),
        SDK_NOT_INITIALIZED(-1002),
        PERMISSION_DENIED(-1003),
        REQUIRE_PAYMENT(-1004),
        INVALID_LICENSE(TUIConstants.TUICalling.ERROR_REQUEST_AUDIO_FOCUS_FAILED),
        CAMERA_START_FAIL(-1100),
        CAMERA_NOT_AUTHORIZED(-1101),
        CAMERA_OCCUPIED(-1102),
        CAMERA_DEVICE_EMPTY(-1103),
        MICROPHONE_START_FAIL(-1104),
        MICROPHONE_NOT_AUTHORIZED(-1105),
        MICROPHONE_OCCUPIED(-1106),
        MICROPHONE_DEVICE_EMPTY(-1107),
        GET_SCREEN_SHARING_TARGET_FAILED(-1108),
        START_SCREEN_SHARING_FAILED(-1109),
        AUDIO_CAPTURE_DEVICE_UNAVAILABLE(-1110),
        OPERATION_INVALID_BEFORE_ENTER_ROOM(-2101),
        EXIT_NOT_SUPPORTED_FOR_ROOM_OWNER(-2102),
        OPERATION_NOT_SUPPORTED_IN_CURRENT_ROOM_TYPE(-2103),
        ROOM_ID_INVALID(-2105),
        ROOM_NAME_INVALID(-2107),
        ALREADY_IN_OTHER_ROOM(-2108),
        USER_NOT_EXIST(-2200),
        NEED_OWNER_PERMISSION(-2300),
        NEED_ADMIN_PERMISSION(-2301),
        REQUEST_NO_PERMISSION(-2310),
        REQUEST_ID_INVALID(-2311),
        REQUEST_ID_REPEAT(-2312),
        MAX_SEAT_COUNT_LIMIT(-2340),
        SEAT_INDEX_NOT_EXIST(-2344),
        OPEN_MICROPHONE_NEED_SEAT_UNLOCK(-2360),
        OPEN_MICROPHONE_NEED_PERMISSION_FROM_ADMIN(-2361),
        OPEN_CAMERA_NEED_SEAT_UNLOCK(-2370),
        OPEN_CAMERA_NEED_PERMISSION_FROM_ADMIN(-2371),
        OPEN_SCREEN_SHARE_NEED_SEAT_UNLOCK(-2372),
        OPEN_SCREEN_SHARE_NEED_PERMISSION_FROM_ADMIN(-2373),
        SEND_MESSAGE_DISABLED_FOR_ALL(-2380),
        SEND_MESSAGE_DISABLED_FOR_CURRENT(-2381),
        ROOM_NOT_SUPPORT_PRELOADING(TXLiteAVCode.ERR_BGM_OPEN_FAILED),
        CALL_IN_PROGRESS(TXVodConstants.VOD_PLAY_ERR_UNKNOW),
        SERVER_SYSTEM_ERROR(TPPlayerMgr.EVENT_ID_APP_ENTER_BACKGROUND),
        SERVER_INVALID_PARAMETER(TPPlayerMgr.EVENT_ID_APP_ENTER_FOREGROUND),
        ROOM_ID_OCCUPIED(100003),
        ROOM_ID_NOT_EXIST(100004),
        USER_NOT_ENTERED(100005),
        ROOM_USER_FULL(100008),
        NEED_PASSWORD(100018),
        WRONG_PASSWORD(100019),
        REQUEST_ID_CONFLICT(100102),
        SEAT_LOCKED(100200),
        SEAT_OCCUPIED(100210),
        ALREADY_IN_SEAT(100203),
        ALL_SEAT_OCCUPIED(100205),
        USER_NOT_IN_SEAT(100206),
        SEAT_NOT_SUPPORT_LINK_MIC(100211),
        ROOM_ALREADY_CONNECTED(100401),
        ROOM_CONNECTED_IN_OTHER(100403),
        MAX_CONNECTED_COUNT_LIMIT(100404),
        ROOM_METADATA_EXCEED_KEY_COUNT_LIMIT(100500),
        ROOM_METADATA_EXCEED_VALUE_SIZE_LIMIT(100501),
        GIFT_ABILITY_NOT_ENABLED(102001),
        GIFT_NOT_EXIST(102002),
        GIFT_SERVER_PRE_VERIFICATION_FAILED(102004);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        Error(int i11) {
            this.mValue = i11;
        }

        public static Error fromInt(int i11) {
            for (Error error : values()) {
                if (error.mValue == i11) {
                    return error;
                }
            }
            Error error2 = FAILED;
            error2.mValue = i11;
            return error2;
        }
    }

    public enum ExtensionType {
        DEVICE_MANAGER(1),
        LIVE_LIST_MANAGER(2),
        CONFERENCE_LIST_MANAGER(3),
        CONFERENCE_INVITATION_MANAGER(4),
        LIVE_LAYOUT_MANAGER(5),
        LIVE_GIFT_MANAGER(6),
        SONG_LIST_MANAGER(7);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        ExtensionType(int i11) {
            this.mValue = i11;
        }

        public static ExtensionType fromInt(int i11) {
            for (ExtensionType extensionType : values()) {
                if (extensionType.mValue == i11) {
                    return extensionType;
                }
            }
            return DEVICE_MANAGER;
        }
    }

    public static class NetworkInfo {
        public int delay;
        public int downLoss;
        public NetworkQuality quality;
        public int upLoss;
        public String userId;
    }

    public enum NetworkQuality {
        UNKNOWN(0),
        EXCELLENT(1),
        GOOD(2),
        POOR(3),
        BAD(4),
        VERY_BAD(5),
        DOWN(6);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        NetworkQuality(int i11) {
            this.mValue = i11;
        }

        public static NetworkQuality fromInt(int i11) {
            for (NetworkQuality networkQuality : values()) {
                if (networkQuality.mValue == i11) {
                    return networkQuality;
                }
            }
            return UNKNOWN;
        }
    }

    @Deprecated
    public static class NetworkQualityInfo {
        public NetworkQuality quality;
        public String userId;

        public String toString() {
            return "NetworkQualityInfo{userId=" + this.userId + ", quality=" + this.quality + '}';
        }
    }

    public interface PlayCallback {
        void onError(String str, int i11, String str2);

        void onLoading(String str);

        void onPlaying(String str);
    }

    public static class RoomId {
        public int intRoomId;
        public String strRoomId;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.intRoomId == ((RoomId) obj).intRoomId;
        }

        public String toString() {
            return "RoomId{intRoomId=" + this.intRoomId + ", strRoomId=" + this.strRoomId + '}';
        }
    }

    public interface ValueCallback<T> {
        void onError(int i11, String str);

        void onSuccess(T t11);
    }

    public static class VideoEncoderParams {
        public Resolution resolution;
        public ResolutionMode resolutionMode;

        public enum Resolution {
            Resolution_640_360(1),
            Resolution_960_540(2),
            Resolution_1280_720(3),
            Resolution_1920_1080(4);

            final int mValue;

            public int getValue() {
                return this.mValue;
            }

            Resolution(int i11) {
                this.mValue = i11;
            }

            public static Resolution fromInt(int i11) {
                for (Resolution resolution : values()) {
                    if (resolution.mValue == i11) {
                        return resolution;
                    }
                }
                return Resolution_960_540;
            }
        }

        public enum ResolutionMode {
            Landscape(0),
            Portrait(1);

            final int mValue;

            public int getValue() {
                return this.mValue;
            }

            ResolutionMode(int i11) {
                this.mValue = i11;
            }

            public static ResolutionMode fromInt(int i11) {
                for (ResolutionMode resolutionMode : values()) {
                    if (resolutionMode.mValue == i11) {
                        return resolutionMode;
                    }
                }
                return Portrait;
            }
        }
    }

    public static class VideoRenderParams {
        public FillMode fillMode;
        public Rotation rotation;

        public enum FillMode {
            Fill(0),
            Fit(1);

            final int mValue;

            public int getValue() {
                return this.mValue;
            }

            FillMode(int i11) {
                this.mValue = i11;
            }

            public static FillMode fromInt(int i11) {
                for (FillMode fillMode : values()) {
                    if (fillMode.mValue == i11) {
                        return fillMode;
                    }
                }
                return Fill;
            }
        }

        public enum Rotation {
            Rotation_0(0),
            Rotation_90(1),
            Rotation_180(2),
            Rotation_270(3);

            final int mValue;

            public int getValue() {
                return this.mValue;
            }

            Rotation(int i11) {
                this.mValue = i11;
            }

            public static Rotation fromInt(int i11) {
                for (Rotation rotation : values()) {
                    if (rotation.mValue == i11) {
                        return rotation;
                    }
                }
                return Rotation_0;
            }
        }
    }
}
