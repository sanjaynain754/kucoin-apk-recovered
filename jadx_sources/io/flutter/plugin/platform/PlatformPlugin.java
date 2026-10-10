package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.webkit.internal.AssetHelper;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes60.dex */
public class PlatformPlugin {
    public static final int DEFAULT_SYSTEM_UI = 1280;
    private static final String TAG = "PlatformPlugin";
    private final Activity activity;
    private PlatformChannel.SystemChromeStyle currentTheme;
    private int mEnabledOverlays;

    @VisibleForTesting
    final PlatformChannel.PlatformMessageHandler mPlatformMessageHandler;
    private final PlatformChannel platformChannel;

    @Nullable
    private final PlatformPluginDelegate platformPluginDelegate;

    /* JADX INFO: renamed from: io.flutter.plugin.platform.PlatformPlugin$2 */
    public class ViewOnSystemUiVisibilityChangeListenerC388322 implements View.OnSystemUiVisibilityChangeListener {
        final /* synthetic */ View val$decorView;

        public ViewOnSystemUiVisibilityChangeListenerC388322(View view) {
            this.val$decorView = view;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m87550a(ViewOnSystemUiVisibilityChangeListenerC388322 viewOnSystemUiVisibilityChangeListenerC388322, int i11) {
            if ((i11 & 4) == 0) {
                PlatformPlugin.this.platformChannel.systemChromeChanged(true);
            } else {
                PlatformPlugin.this.platformChannel.systemChromeChanged(false);
            }
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i11) {
            this.val$decorView.post(new Runnable() { // from class: io.flutter.plugin.platform.d
                @Override // java.lang.Runnable
                public final void run() {
                    PlatformPlugin.ViewOnSystemUiVisibilityChangeListenerC388322.m87550a(this.f86790b, i11);
                }
            });
        }
    }

    public PlatformPlugin(@NonNull Activity activity, @NonNull PlatformChannel platformChannel) {
        this(activity, platformChannel, null);
    }

    /* JADX INFO: renamed from: io.flutter.plugin.platform.PlatformPlugin$3 */
    public static /* synthetic */ class C388333 {

        /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness */
        static final /* synthetic */ int[] f86787xfa6fb21b;

        /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType */
        static final /* synthetic */ int[] f86788x98e77c60;

        /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay */
        static final /* synthetic */ int[] f86789x4c113a23;

        static {
            int[] iArr = new int[PlatformChannel.Brightness.values().length];
            f86787xfa6fb21b = iArr;
            try {
                iArr[PlatformChannel.Brightness.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86787xfa6fb21b[PlatformChannel.Brightness.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PlatformChannel.SystemUiOverlay.values().length];
            f86789x4c113a23 = iArr2;
            try {
                iArr2[PlatformChannel.SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f86789x4c113a23[PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[PlatformChannel.HapticFeedbackType.values().length];
            f86788x98e77c60 = iArr3;
            try {
                iArr3[PlatformChannel.HapticFeedbackType.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f86788x98e77c60[PlatformChannel.HapticFeedbackType.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f86788x98e77c60[PlatformChannel.HapticFeedbackType.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f86788x98e77c60[PlatformChannel.HapticFeedbackType.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f86788x98e77c60[PlatformChannel.HapticFeedbackType.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public PlatformPlugin(@NonNull Activity activity, @NonNull PlatformChannel platformChannel, @Nullable PlatformPluginDelegate platformPluginDelegate) {
        PlatformChannel.PlatformMessageHandler platformMessageHandler = new PlatformChannel.PlatformMessageHandler() { // from class: io.flutter.plugin.platform.PlatformPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public boolean clipboardHasStrings() {
                return PlatformPlugin.this.clipboardHasStrings();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public CharSequence getClipboardData(@Nullable PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
                return PlatformPlugin.this.getClipboardData(clipboardContentFormat);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void playSystemSound(@NonNull PlatformChannel.SoundType soundType) {
                PlatformPlugin.this.playSystemSound(soundType);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void popSystemNavigator() {
                PlatformPlugin.this.popSystemNavigator();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void restoreSystemUiOverlays() {
                PlatformPlugin.this.restoreSystemChromeSystemUIOverlays();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setApplicationSwitcherDescription(@NonNull PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
                PlatformPlugin.this.setSystemChromeApplicationSwitcherDescription(appSwitcherDescription);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setClipboardData(@NonNull String str) {
                PlatformPlugin.this.setClipboardData(str);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setFrameworkHandlesBack(boolean z11) {
                PlatformPlugin.this.setFrameworkHandlesBack(z11);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setPreferredOrientations(int i11) {
                PlatformPlugin.this.setSystemChromePreferredOrientations(i11);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setSystemUiChangeListener() {
                PlatformPlugin.this.setSystemChromeChangeListener();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setSystemUiOverlayStyle(@NonNull PlatformChannel.SystemChromeStyle systemChromeStyle) {
                PlatformPlugin.this.setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void share(@NonNull String str) {
                PlatformPlugin.this.share(str);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void showSystemOverlays(@NonNull List<PlatformChannel.SystemUiOverlay> list) {
                PlatformPlugin.this.setSystemChromeEnabledSystemUIOverlays(list);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void showSystemUiMode(@NonNull PlatformChannel.SystemUiMode systemUiMode) {
                PlatformPlugin.this.setSystemChromeEnabledSystemUIMode(systemUiMode);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void vibrateHapticFeedback(@NonNull PlatformChannel.HapticFeedbackType hapticFeedbackType) {
                PlatformPlugin.this.vibrateHapticFeedback(hapticFeedbackType);
            }
        };
        this.mPlatformMessageHandler = platformMessageHandler;
        this.activity = activity;
        this.platformChannel = platformChannel;
        platformChannel.setPlatformMessageHandler(platformMessageHandler);
        this.platformPluginDelegate = platformPluginDelegate;
        this.mEnabledOverlays = 1280;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean clipboardHasStrings() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
        ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (clipboardContentFormat != null && clipboardContentFormat != PlatformChannel.ClipboardContentFormat.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        Log.m87483w(TAG, "Clipboard item contained no textual content nor a URI to retrieve it from.");
                        return null;
                    }
                    String scheme = uri.getScheme();
                    if (!scheme.equals("content")) {
                        Log.m87483w(TAG, "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        return null;
                    }
                    AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = this.activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                    CharSequence charSequenceCoerceToText = itemAt.coerceToText(this.activity);
                    if (assetFileDescriptorOpenTypedAssetFileDescriptor == null) {
                        return charSequenceCoerceToText;
                    }
                    try {
                        assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                        return charSequenceCoerceToText;
                    } catch (IOException e11) {
                        charSequence = charSequenceCoerceToText;
                        e = e11;
                    }
                } catch (IOException e12) {
                    e = e12;
                    charSequence = text;
                }
            } catch (IOException e13) {
                e = e13;
            }
        } catch (FileNotFoundException unused) {
            Log.m87483w(TAG, "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e14) {
            Log.m87484w(TAG, "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e14);
            return null;
        }
        Log.m87484w(TAG, "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playSystemSound(@NonNull PlatformChannel.SoundType soundType) {
        if (soundType == PlatformChannel.SoundType.CLICK) {
            this.activity.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void popSystemNavigator() {
        PlatformPluginDelegate platformPluginDelegate = this.platformPluginDelegate;
        if (platformPluginDelegate == null || !platformPluginDelegate.popSystemNavigator()) {
            Activity activity = this.activity;
            if (activity instanceof OnBackPressedDispatcherOwner) {
                ((OnBackPressedDispatcherOwner) activity).getOnBackPressedDispatcher().onBackPressed();
            } else {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipboardData(String str) {
        ((ClipboardManager) this.activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameworkHandlesBack(boolean z11) {
        PlatformPluginDelegate platformPluginDelegate = this.platformPluginDelegate;
        if (platformPluginDelegate != null) {
            platformPluginDelegate.setFrameworkHandlesBack(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
        if (Build.VERSION.SDK_INT < 28) {
            this.activity.setTaskDescription(new ActivityManager.TaskDescription(appSwitcherDescription.label, (Bitmap) null, appSwitcherDescription.color));
            return;
        }
        C38845c.m87561a();
        this.activity.setTaskDescription(C38843b.m87559a(appSwitcherDescription.label, 0, appSwitcherDescription.color));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeChangeListener() {
        View decorView = this.activity.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC388322(decorView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeEnabledSystemUIMode(PlatformChannel.SystemUiMode systemUiMode) {
        int i11;
        if (systemUiMode == PlatformChannel.SystemUiMode.LEAN_BACK) {
            i11 = 1798;
        } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE) {
            i11 = 3846;
        } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE_STICKY) {
            i11 = 5894;
        } else if (systemUiMode != PlatformChannel.SystemUiMode.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i11 = 1792;
        }
        this.mEnabledOverlays = i11;
        updateSystemUiOverlays();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromePreferredOrientations(int i11) {
        this.activity.setRequestedOrientation(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeSystemUIOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
        Window window = this.activity.getWindow();
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        PlatformChannel.Brightness brightness = systemChromeStyle.statusBarIconBrightness;
        if (brightness != null) {
            int i12 = C388333.f86787xfa6fb21b[brightness.ordinal()];
            if (i12 == 1) {
                windowInsetsControllerCompat.setAppearanceLightStatusBars(true);
            } else if (i12 == 2) {
                windowInsetsControllerCompat.setAppearanceLightStatusBars(false);
            }
        }
        Integer num = systemChromeStyle.statusBarColor;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = systemChromeStyle.systemStatusBarContrastEnforced;
        if (bool != null && i11 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i11 >= 26) {
            PlatformChannel.Brightness brightness2 = systemChromeStyle.systemNavigationBarIconBrightness;
            if (brightness2 != null) {
                int i13 = C388333.f86787xfa6fb21b[brightness2.ordinal()];
                if (i13 == 1) {
                    windowInsetsControllerCompat.setAppearanceLightNavigationBars(true);
                } else if (i13 == 2) {
                    windowInsetsControllerCompat.setAppearanceLightNavigationBars(false);
                }
            }
            Integer num2 = systemChromeStyle.systemNavigationBarColor;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = systemChromeStyle.systemNavigationBarDividerColor;
        if (num3 != null && i11 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = systemChromeStyle.systemNavigationBarContrastEnforced;
        if (bool2 != null && i11 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.currentTheme = systemChromeStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void share(@NonNull String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", str);
        this.activity.startActivity(Intent.createChooser(intent, null));
    }

    public void destroy() {
        this.platformChannel.setPlatformMessageHandler(null);
    }

    public void updateSystemUiOverlays() {
        this.activity.getWindow().getDecorView().setSystemUiVisibility(this.mEnabledOverlays);
        PlatformChannel.SystemChromeStyle systemChromeStyle = this.currentTheme;
        if (systemChromeStyle != null) {
            setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
        }
    }

    @VisibleForTesting
    public void vibrateHapticFeedback(@NonNull PlatformChannel.HapticFeedbackType hapticFeedbackType) {
        View decorView = this.activity.getWindow().getDecorView();
        int i11 = C388333.f86788x98e77c60[hapticFeedbackType.ordinal()];
        if (i11 == 1) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (i11 == 2) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (i11 == 3) {
            decorView.performHapticFeedback(3);
        } else if (i11 == 4) {
            decorView.performHapticFeedback(6);
        } else {
            if (i11 != 5) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreSystemChromeSystemUIOverlays() {
        updateSystemUiOverlays();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeEnabledSystemUIOverlays(List<PlatformChannel.SystemUiOverlay> list) {
        int i11;
        if (list.size() == 0) {
            i11 = 5894;
        } else {
            i11 = 1798;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            int i13 = C388333.f86789x4c113a23[list.get(i12).ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    i11 &= -515;
                }
            } else {
                i11 &= -5;
            }
        }
        this.mEnabledOverlays = i11;
        updateSystemUiOverlays();
    }

    public interface PlatformPluginDelegate {
        boolean popSystemNavigator();

        default void setFrameworkHandlesBack(boolean z11) {
        }
    }
}
