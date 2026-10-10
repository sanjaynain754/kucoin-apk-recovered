package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.webkit.internal.AssetHelper;
import com.google.firebase.messaging.Constants;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class PlatformChannel {
    private static final String TAG = "PlatformChannel";

    @NonNull
    public final MethodChannel channel;

    @NonNull
    @VisibleForTesting
    final MethodChannel.MethodCallHandler parsingMethodCallHandler;

    @Nullable
    private PlatformMessageHandler platformMessageHandler;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0053 A[RETURN] */
    public int decodeOrientations(@NonNull JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < jSONArray.length(); i13++) {
            int i14 = C387782.f86781x92f09090[DeviceOrientation.fromValue(jSONArray.getString(i13)).ordinal()];
            if (i14 == 1) {
                i11 |= 1;
            } else if (i14 == 2) {
                i11 |= 4;
            } else if (i14 == 3) {
                i11 |= 2;
            } else if (i14 == 4) {
                i11 |= 8;
            }
            if (i12 == 0) {
                i12 = i11;
            }
        }
        if (i11 == 0) {
            return -1;
        }
        switch (i11) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i12 != 2) {
                    if (i12 == 4) {
                        return 9;
                    }
                    if (i12 != 8) {
                        return 1;
                    }
                    return 8;
                }
                return 0;
            case 4:
                return 9;
            case 5:
                return 12;
            case 8:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
            default:
                return 1;
        }
    }

    /* JADX INFO: renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$2 */
    /* JADX INFO: loaded from: classes60.dex */
    public static /* synthetic */ class C387782 {

        /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation */
        static final /* synthetic */ int[] f86781x92f09090;

        /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode */
        static final /* synthetic */ int[] f86782xf03f4cb0;

        /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay */
        static final /* synthetic */ int[] f86783x4c113a23;

        static {
            int[] iArr = new int[SystemUiMode.values().length];
            f86782xf03f4cb0 = iArr;
            try {
                iArr[SystemUiMode.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86782xf03f4cb0[SystemUiMode.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f86782xf03f4cb0[SystemUiMode.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f86782xf03f4cb0[SystemUiMode.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[SystemUiOverlay.values().length];
            f86783x4c113a23 = iArr2;
            try {
                iArr2[SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f86783x4c113a23[SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[DeviceOrientation.values().length];
            f86781x92f09090 = iArr3;
            try {
                iArr3[DeviceOrientation.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f86781x92f09090[DeviceOrientation.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f86781x92f09090[DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f86781x92f09090[DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static class AppSwitcherDescription {
        public final int color;

        @NonNull
        public final String label;

        public AppSwitcherDescription(int i11, @NonNull String str) {
            this.color = i11;
            this.label = str;
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public enum Brightness {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        @NonNull
        private String encodedName;

        Brightness(String str) {
            this.encodedName = str;
        }

        @NonNull
        public static Brightness fromValue(@NonNull String str) throws NoSuchFieldException {
            for (Brightness brightness : values()) {
                if (brightness.encodedName.equals(str)) {
                    return brightness;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public enum ClipboardContentFormat {
        PLAIN_TEXT(AssetHelper.DEFAULT_MIME_TYPE);


        @NonNull
        private String encodedName;

        ClipboardContentFormat(String str) {
            this.encodedName = str;
        }

        @NonNull
        public static ClipboardContentFormat fromValue(@NonNull String str) throws NoSuchFieldException {
            for (ClipboardContentFormat clipboardContentFormat : values()) {
                if (clipboardContentFormat.encodedName.equals(str)) {
                    return clipboardContentFormat;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public enum DeviceOrientation {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        @NonNull
        private String encodedName;

        DeviceOrientation(String str) {
            this.encodedName = str;
        }

        @NonNull
        public static DeviceOrientation fromValue(@NonNull String str) throws NoSuchFieldException {
            for (DeviceOrientation deviceOrientation : values()) {
                if (deviceOrientation.encodedName.equals(str)) {
                    return deviceOrientation;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public enum HapticFeedbackType {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        @Nullable
        private final String encodedName;

        HapticFeedbackType(String str) {
            this.encodedName = str;
        }

        @NonNull
        public static HapticFeedbackType fromValue(@Nullable String str) throws NoSuchFieldException {
            for (HapticFeedbackType hapticFeedbackType : values()) {
                String str2 = hapticFeedbackType.encodedName;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return hapticFeedbackType;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public enum SoundType {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");


        @NonNull
        private final String encodedName;

        SoundType(String str) {
            this.encodedName = str;
        }

        @NonNull
        public static SoundType fromValue(@NonNull String str) throws NoSuchFieldException {
            for (SoundType soundType : values()) {
                if (soundType.encodedName.equals(str)) {
                    return soundType;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static class SystemChromeStyle {

        @Nullable
        public final Integer statusBarColor;

        @Nullable
        public final Brightness statusBarIconBrightness;

        @Nullable
        public final Integer systemNavigationBarColor;

        @Nullable
        public final Boolean systemNavigationBarContrastEnforced;

        @Nullable
        public final Integer systemNavigationBarDividerColor;

        @Nullable
        public final Brightness systemNavigationBarIconBrightness;

        @Nullable
        public final Boolean systemStatusBarContrastEnforced;

        public SystemChromeStyle(@Nullable Integer num, @Nullable Brightness brightness, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Brightness brightness2, @Nullable Integer num3, @Nullable Boolean bool2) {
            this.statusBarColor = num;
            this.statusBarIconBrightness = brightness;
            this.systemStatusBarContrastEnforced = bool;
            this.systemNavigationBarColor = num2;
            this.systemNavigationBarIconBrightness = brightness2;
            this.systemNavigationBarDividerColor = num3;
            this.systemNavigationBarContrastEnforced = bool2;
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public enum SystemUiMode {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        @NonNull
        private String encodedName;

        SystemUiMode(String str) {
            this.encodedName = str;
        }

        @NonNull
        public static SystemUiMode fromValue(@NonNull String str) throws NoSuchFieldException {
            for (SystemUiMode systemUiMode : values()) {
                if (systemUiMode.encodedName.equals(str)) {
                    return systemUiMode;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public enum SystemUiOverlay {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        @NonNull
        private String encodedName;

        SystemUiOverlay(String str) {
            this.encodedName = str;
        }

        @NonNull
        public static SystemUiOverlay fromValue(@NonNull String str) throws NoSuchFieldException {
            for (SystemUiOverlay systemUiOverlay : values()) {
                if (systemUiOverlay.encodedName.equals(str)) {
                    return systemUiOverlay;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public List<SystemUiOverlay> decodeSystemUiOverlays(@NonNull JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            int i12 = C387782.f86783x4c113a23[SystemUiOverlay.fromValue(jSONArray.getString(i11)).ordinal()];
            if (i12 == 1) {
                arrayList.add(SystemUiOverlay.TOP_OVERLAYS);
            } else if (i12 == 2) {
                arrayList.add(SystemUiOverlay.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public void setPlatformMessageHandler(@Nullable PlatformMessageHandler platformMessageHandler) {
        this.platformMessageHandler = platformMessageHandler;
    }

    public void systemChromeChanged(boolean z11) {
        Log.m87481v(TAG, "Sending 'systemUIChange' message.");
        this.channel.invokeMethod("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z11)));
    }

    public PlatformChannel(@NonNull DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.PlatformChannel.1
            /* JADX WARN: Code duplicated, block: B:56:0x00da  */
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                ClipboardContentFormat clipboardContentFormatFromValue;
                if (PlatformChannel.this.platformMessageHandler == null) {
                    return;
                }
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                Log.m87481v(PlatformChannel.TAG, "Received '" + str + "' message.");
                try {
                    switch (str) {
                        case "SystemSound.play":
                            try {
                                PlatformChannel.this.platformMessageHandler.playSystemSound(SoundType.fromValue((String) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException e11) {
                                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e11.getMessage(), null);
                                return;
                            }
                        case "HapticFeedback.vibrate":
                            try {
                                PlatformChannel.this.platformMessageHandler.vibrateHapticFeedback(HapticFeedbackType.fromValue((String) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException e12) {
                                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e12.getMessage(), null);
                                return;
                            }
                        case "SystemChrome.setPreferredOrientations":
                            try {
                                PlatformChannel.this.platformMessageHandler.setPreferredOrientations(PlatformChannel.this.decodeOrientations((JSONArray) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e13) {
                                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e13.getMessage(), null);
                                return;
                            }
                        case "SystemChrome.setApplicationSwitcherDescription":
                            try {
                                PlatformChannel.this.platformMessageHandler.setApplicationSwitcherDescription(PlatformChannel.this.decodeAppSwitcherDescription((JSONObject) obj));
                                result.success(null);
                                return;
                            } catch (JSONException e14) {
                                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e14.getMessage(), null);
                                return;
                            }
                        case "SystemChrome.setEnabledSystemUIOverlays":
                            try {
                                PlatformChannel.this.platformMessageHandler.showSystemOverlays(PlatformChannel.this.decodeSystemUiOverlays((JSONArray) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e15) {
                                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e15.getMessage(), null);
                                return;
                            }
                        case "SystemChrome.setEnabledSystemUIMode":
                            try {
                                PlatformChannel.this.platformMessageHandler.showSystemUiMode(PlatformChannel.this.decodeSystemUiMode((String) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e16) {
                                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e16.getMessage(), null);
                                return;
                            }
                        case "SystemChrome.setSystemUIChangeListener":
                            PlatformChannel.this.platformMessageHandler.setSystemUiChangeListener();
                            result.success(null);
                            return;
                        case "SystemChrome.restoreSystemUIOverlays":
                            PlatformChannel.this.platformMessageHandler.restoreSystemUiOverlays();
                            result.success(null);
                            return;
                        case "SystemChrome.setSystemUIOverlayStyle":
                            try {
                                PlatformChannel.this.platformMessageHandler.setSystemUiOverlayStyle(PlatformChannel.this.decodeSystemChromeStyle((JSONObject) obj));
                                result.success(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e17) {
                                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e17.getMessage(), null);
                                return;
                            }
                        case "SystemNavigator.setFrameworkHandlesBack":
                            PlatformChannel.this.platformMessageHandler.setFrameworkHandlesBack(((Boolean) obj).booleanValue());
                            result.success(null);
                            return;
                        case "SystemNavigator.pop":
                            PlatformChannel.this.platformMessageHandler.popSystemNavigator();
                            result.success(null);
                            return;
                        case "Clipboard.getData":
                            String str2 = (String) obj;
                            if (str2 != null) {
                                try {
                                    clipboardContentFormatFromValue = ClipboardContentFormat.fromValue(str2);
                                } catch (NoSuchFieldException unused) {
                                    result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "No such clipboard content format: " + str2, null);
                                    clipboardContentFormatFromValue = null;
                                }
                                break;
                            } else {
                                clipboardContentFormatFromValue = null;
                            }
                            CharSequence clipboardData = PlatformChannel.this.platformMessageHandler.getClipboardData(clipboardContentFormatFromValue);
                            if (clipboardData == null) {
                                result.success(null);
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("text", clipboardData);
                            result.success(jSONObject);
                            return;
                        case "Clipboard.setData":
                            PlatformChannel.this.platformMessageHandler.setClipboardData(((JSONObject) obj).getString("text"));
                            result.success(null);
                            return;
                        case "Clipboard.hasStrings":
                            boolean zClipboardHasStrings = PlatformChannel.this.platformMessageHandler.clipboardHasStrings();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("value", zClipboardHasStrings);
                            result.success(jSONObject2);
                            return;
                        case "Share.invoke":
                            PlatformChannel.this.platformMessageHandler.share((String) obj);
                            result.success(null);
                            return;
                        default:
                            result.notImplemented();
                            return;
                    }
                } catch (JSONException e18) {
                    result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "JSON error: " + e18.getMessage(), null);
                }
                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "JSON error: " + e18.getMessage(), null);
            }
        };
        this.parsingMethodCallHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public AppSwitcherDescription decodeAppSwitcherDescription(@NonNull JSONObject jSONObject) throws JSONException {
        int i11 = jSONObject.getInt("primaryColor");
        if (i11 != 0) {
            i11 |= ViewCompat.MEASURED_STATE_MASK;
        }
        return new AppSwitcherDescription(i11, jSONObject.getString(Constants.ScionAnalytics.PARAM_LABEL));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public SystemChromeStyle decodeSystemChromeStyle(@NonNull JSONObject jSONObject) throws JSONException, NoSuchFieldException {
        Integer numValueOf;
        Brightness brightnessFromValue;
        Boolean boolValueOf;
        Integer numValueOf2;
        Brightness brightnessFromValue2;
        Integer numValueOf3;
        Boolean boolValueOf2 = null;
        if (!jSONObject.isNull("statusBarColor")) {
            numValueOf = Integer.valueOf(jSONObject.getInt("statusBarColor"));
        } else {
            numValueOf = null;
        }
        if (!jSONObject.isNull("statusBarIconBrightness")) {
            brightnessFromValue = Brightness.fromValue(jSONObject.getString("statusBarIconBrightness"));
        } else {
            brightnessFromValue = null;
        }
        if (!jSONObject.isNull("systemStatusBarContrastEnforced")) {
            boolValueOf = Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced"));
        } else {
            boolValueOf = null;
        }
        if (!jSONObject.isNull("systemNavigationBarColor")) {
            numValueOf2 = Integer.valueOf(jSONObject.getInt("systemNavigationBarColor"));
        } else {
            numValueOf2 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarIconBrightness")) {
            brightnessFromValue2 = Brightness.fromValue(jSONObject.getString("systemNavigationBarIconBrightness"));
        } else {
            brightnessFromValue2 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarDividerColor")) {
            numValueOf3 = Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor"));
        } else {
            numValueOf3 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            boolValueOf2 = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new SystemChromeStyle(numValueOf, brightnessFromValue, boolValueOf, numValueOf2, brightnessFromValue2, numValueOf3, boolValueOf2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public SystemUiMode decodeSystemUiMode(@NonNull String str) throws JSONException, NoSuchFieldException {
        int i11 = C387782.f86782xf03f4cb0[SystemUiMode.fromValue(str).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return SystemUiMode.EDGE_TO_EDGE;
                    }
                    return SystemUiMode.EDGE_TO_EDGE;
                }
                return SystemUiMode.IMMERSIVE_STICKY;
            }
            return SystemUiMode.IMMERSIVE;
        }
        return SystemUiMode.LEAN_BACK;
    }

    /* JADX INFO: loaded from: classes60.dex */
    public interface PlatformMessageHandler {
        boolean clipboardHasStrings();

        @Nullable
        CharSequence getClipboardData(@Nullable ClipboardContentFormat clipboardContentFormat);

        void playSystemSound(@NonNull SoundType soundType);

        void popSystemNavigator();

        void restoreSystemUiOverlays();

        void setApplicationSwitcherDescription(@NonNull AppSwitcherDescription appSwitcherDescription);

        void setClipboardData(@NonNull String str);

        void setPreferredOrientations(int i11);

        void setSystemUiChangeListener();

        void setSystemUiOverlayStyle(@NonNull SystemChromeStyle systemChromeStyle);

        void share(@NonNull String str);

        void showSystemOverlays(@NonNull List<SystemUiOverlay> list);

        void showSystemUiMode(@NonNull SystemUiMode systemUiMode);

        void vibrateHapticFeedback(@NonNull HapticFeedbackType hapticFeedbackType);

        default void setFrameworkHandlesBack(boolean z11) {
        }
    }
}
