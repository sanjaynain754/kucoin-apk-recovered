package com.facebook.react.modules.appearance;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppearanceModule.kt */
/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = "Appearance")
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\tR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/facebook/react/modules/appearance/AppearanceModule;", "Lcom/facebook/fbreact/specs/NativeAppearanceSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "overrideColorScheme", "Lcom/facebook/react/modules/appearance/AppearanceModule$OverrideColorScheme;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/modules/appearance/AppearanceModule$OverrideColorScheme;)V", "lastEmittedColorScheme", "", "colorSchemeForCurrentConfiguration", "context", "Landroid/content/Context;", "getColorScheme", "setColorScheme", "", TtmlNode.TAG_STYLE, "addListener", "eventName", "removeListeners", "count", "", "onConfigurationChanged", "currentContext", "emitAppearanceChanged", "colorScheme", "OverrideColorScheme", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class AppearanceModule extends NativeAppearanceSpec {

    @NotNull
    private static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";

    @NotNull
    public static final String NAME = "Appearance";

    @Nullable
    private String lastEmittedColorScheme;

    @Nullable
    private final OverrideColorScheme overrideColorScheme;

    /* JADX INFO: compiled from: AppearanceModule.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m90084d2 = {"Lcom/facebook/react/modules/appearance/AppearanceModule$OverrideColorScheme;", "", "getScheme", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public interface OverrideColorScheme {
        @NotNull
        String getScheme();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AppearanceModule(@NotNull ReactApplicationContext reactContext) {
        this(reactContext, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    public /* synthetic */ AppearanceModule(ReactApplicationContext reactApplicationContext, OverrideColorScheme overrideColorScheme, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i11 & 2) != 0 ? null : overrideColorScheme);
    }

    private final String colorSchemeForCurrentConfiguration(Context context) {
        OverrideColorScheme overrideColorScheme = this.overrideColorScheme;
        if (overrideColorScheme != null) {
            return overrideColorScheme.getScheme();
        }
        int i11 = context.getResources().getConfiguration().uiMode & 48;
        return (i11 == 16 || i11 != 32) ? "light" : "dark";
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void addListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    public final void emitAppearanceChanged(@NotNull String colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("colorScheme", colorScheme);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent(APPEARANCE_CHANGED_EVENT_NAME, writableMapCreateMap);
        }
    }

    public final void onConfigurationChanged(@NotNull Context currentContext) {
        Intrinsics.checkNotNullParameter(currentContext, "currentContext");
        String strColorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(currentContext);
        if (Intrinsics.areEqual(this.lastEmittedColorScheme, strColorSchemeForCurrentConfiguration)) {
            return;
        }
        this.lastEmittedColorScheme = strColorSchemeForCurrentConfiguration;
        emitAppearanceChanged(strColorSchemeForCurrentConfiguration);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AppearanceModule(@NotNull ReactApplicationContext reactContext, @Nullable OverrideColorScheme overrideColorScheme) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.overrideColorScheme = overrideColorScheme;
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    @NotNull
    public String getColorScheme() {
        Context currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = getReactApplicationContext();
        }
        Intrinsics.checkNotNull(currentActivity);
        return colorSchemeForCurrentConfiguration(currentActivity);
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void setColorScheme(@NotNull String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int iHashCode = style.hashCode();
        if (iHashCode != -1626174665) {
            if (iHashCode != 3075958) {
                if (iHashCode == 102970646 && style.equals("light")) {
                    AppCompatDelegate.setDefaultNightMode(1);
                    return;
                }
                return;
            }
            if (style.equals("dark")) {
                AppCompatDelegate.setDefaultNightMode(2);
                return;
            }
            return;
        }
        if (!style.equals("unspecified")) {
            return;
        }
        AppCompatDelegate.setDefaultNightMode(-1);
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void removeListeners(double count) {
    }
}
