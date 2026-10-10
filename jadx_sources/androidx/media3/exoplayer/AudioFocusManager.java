package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes34.dex */
final class AudioFocusManager {
    private static final int AUDIOFOCUS_GAIN = 1;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    private static final int AUDIOFOCUS_NONE = 0;
    private static final int AUDIO_FOCUS_STATE_HAVE_FOCUS = 2;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT = 3;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT_DUCK = 4;
    private static final int AUDIO_FOCUS_STATE_NOT_REQUESTED = 0;
    private static final int AUDIO_FOCUS_STATE_NO_FOCUS = 1;
    public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
    public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
    public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;
    private static final String TAG = "AudioFocusManager";
    private static final float VOLUME_MULTIPLIER_DEFAULT = 1.0f;
    private static final float VOLUME_MULTIPLIER_DUCK = 0.2f;

    @Nullable
    private AudioAttributes audioAttributes;
    private AudioFocusRequest audioFocusRequest;
    private final Supplier<AudioManager> audioManager;
    private int focusGainToRequest;
    private final AudioFocusListener focusListener;

    @Nullable
    private PlayerControl playerControl;
    private boolean rebuildAudioFocusRequest;
    private float volumeMultiplier = 1.0f;
    private int audioFocusState = 0;

    public class AudioFocusListener implements AudioManager.OnAudioFocusChangeListener {
        private final Handler eventHandler;

        public AudioFocusListener(Handler handler) {
            this.eventHandler = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i11) {
            this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.k
                @Override // java.lang.Runnable
                public final void run() {
                    AudioFocusManager.this.handlePlatformAudioFocusChange(i11);
                }
            });
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    public interface PlayerControl {
        void executePlayerCommand(int i11);

        void setVolumeMultiplier(float f11);
    }

    private static int convertAudioAttributesToFocusGain(@Nullable AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        switch (audioAttributes.usage) {
            case 0:
                Log.m2961w(TAG, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (audioAttributes.contentType == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                Log.m2961w(TAG, "Unidentified audio usage: " + audioAttributes.usage);
                return 0;
            case 16:
                return 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlatformAudioFocusChange(int i11) {
        if (i11 == -3 || i11 == -2) {
            if (i11 != -2 && !willPauseWhenDucked()) {
                setAudioFocusState(4);
                return;
            } else {
                executePlayerCommand(0);
                setAudioFocusState(3);
                return;
            }
        }
        if (i11 == -1) {
            executePlayerCommand(-1);
            abandonAudioFocusIfHeld();
            setAudioFocusState(1);
        } else if (i11 == 1) {
            setAudioFocusState(2);
            executePlayerCommand(1);
        } else {
            Log.m2961w(TAG, "Unknown focus change type: " + i11);
        }
    }

    private boolean shouldHandleAudioFocus(int i11) {
        return i11 != 1 && this.focusGainToRequest == 1;
    }

    public void release() {
        this.playerControl = null;
        abandonAudioFocusIfHeld();
        setAudioFocusState(0);
    }

    private void abandonAudioFocusDefault() {
        this.audioManager.get().abandonAudioFocus(this.focusListener);
    }

    private void abandonAudioFocusIfHeld() {
        int i11 = this.audioFocusState;
        if (i11 == 1 || i11 == 0) {
            return;
        }
        if (Util.SDK_INT >= 26) {
            abandonAudioFocusV26();
        } else {
            abandonAudioFocusDefault();
        }
    }

    @RequiresApi(26)
    private void abandonAudioFocusV26() {
        if (this.audioFocusRequest != null) {
            this.audioManager.get().abandonAudioFocusRequest(this.audioFocusRequest);
        }
    }

    private void executePlayerCommand(int i11) {
        PlayerControl playerControl = this.playerControl;
        if (playerControl != null) {
            playerControl.executePlayerCommand(i11);
        }
    }

    private int requestAudioFocus() {
        if (this.audioFocusState == 2) {
            return 1;
        }
        if ((Util.SDK_INT >= 26 ? requestAudioFocusV26() : requestAudioFocusDefault()) == 1) {
            setAudioFocusState(2);
            return 1;
        }
        setAudioFocusState(1);
        return -1;
    }

    private int requestAudioFocusDefault() {
        return this.audioManager.get().requestAudioFocus(this.focusListener, Util.getStreamTypeForAudioUsage(((AudioAttributes) Assertions.checkNotNull(this.audioAttributes)).usage), this.focusGainToRequest);
    }

    @RequiresApi(26)
    private int requestAudioFocusV26() {
        AudioFocusRequest.Builder builderM3307a;
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest == null || this.rebuildAudioFocusRequest) {
            if (audioFocusRequest == null) {
                C3189i.m3321a();
                builderM3307a = C3154g.m3306a(this.focusGainToRequest);
            } else {
                C3189i.m3321a();
                builderM3307a = C3159h.m3307a(this.audioFocusRequest);
            }
            this.audioFocusRequest = builderM3307a.setAudioAttributes(((AudioAttributes) Assertions.checkNotNull(this.audioAttributes)).getAudioAttributesV21().audioAttributes).setWillPauseWhenDucked(willPauseWhenDucked()).setOnAudioFocusChangeListener(this.focusListener).build();
            this.rebuildAudioFocusRequest = false;
        }
        return this.audioManager.get().requestAudioFocus(this.audioFocusRequest);
    }

    private void setAudioFocusState(int i11) {
        if (this.audioFocusState == i11) {
            return;
        }
        this.audioFocusState = i11;
        float f11 = i11 == 4 ? 0.2f : 1.0f;
        if (this.volumeMultiplier == f11) {
            return;
        }
        this.volumeMultiplier = f11;
        PlayerControl playerControl = this.playerControl;
        if (playerControl != null) {
            playerControl.setVolumeMultiplier(f11);
        }
    }

    private boolean willPauseWhenDucked() {
        AudioAttributes audioAttributes = this.audioAttributes;
        return audioAttributes != null && audioAttributes.contentType == 1;
    }

    @VisibleForTesting
    public AudioManager.OnAudioFocusChangeListener getFocusListener() {
        return this.focusListener;
    }

    public float getVolumeMultiplier() {
        return this.volumeMultiplier;
    }

    public void setAudioAttributes(@Nullable AudioAttributes audioAttributes) {
        if (Util.areEqual(this.audioAttributes, audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        int iConvertAudioAttributesToFocusGain = convertAudioAttributesToFocusGain(audioAttributes);
        this.focusGainToRequest = iConvertAudioAttributesToFocusGain;
        boolean z11 = true;
        if (iConvertAudioAttributesToFocusGain != 1 && iConvertAudioAttributesToFocusGain != 0) {
            z11 = false;
        }
        Assertions.checkArgument(z11, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public AudioFocusManager(final Context context, Handler handler, PlayerControl playerControl) {
        this.audioManager = Suppliers.memoize(new Supplier() { // from class: androidx.media3.exoplayer.j
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return AudioFocusManager.m3020a(context);
            }
        });
        this.playerControl = playerControl;
        this.focusListener = new AudioFocusListener(handler);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ AudioManager m3020a(Context context) {
        return (AudioManager) Assertions.checkNotNull((AudioManager) context.getApplicationContext().getSystemService("audio"));
    }

    public int updateAudioFocus(boolean z11, int i11) {
        if (!shouldHandleAudioFocus(i11)) {
            abandonAudioFocusIfHeld();
            setAudioFocusState(0);
            return 1;
        }
        if (z11) {
            return requestAudioFocus();
        }
        int i12 = this.audioFocusState;
        if (i12 != 1) {
            if (i12 == 3) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
}
