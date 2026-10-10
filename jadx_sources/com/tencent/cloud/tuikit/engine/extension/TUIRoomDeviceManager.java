package com.tencent.cloud.tuikit.engine.extension;

/* JADX INFO: loaded from: classes59.dex */
public abstract class TUIRoomDeviceManager {

    public enum AudioRoute {
        SPEAKERPHONE(0),
        EARPIECE(1);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        AudioRoute(int i11) {
            this.mValue = i11;
        }

        public static AudioRoute fromInt(int i11) {
            for (AudioRoute audioRoute : values()) {
                if (audioRoute.mValue == i11) {
                    return audioRoute;
                }
            }
            return SPEAKERPHONE;
        }
    }

    public abstract void enableCameraAutoFocus(boolean z11);

    public abstract void enableCameraTorch(boolean z11);

    public abstract boolean isAutoFocusEnabled();

    public abstract boolean isFrontCamera();

    public abstract void setAudioRoute(AudioRoute audioRoute);

    public abstract void switchCamera(boolean z11);
}
