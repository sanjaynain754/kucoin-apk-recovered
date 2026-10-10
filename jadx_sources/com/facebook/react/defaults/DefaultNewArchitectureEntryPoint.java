package com.facebook.react.defaults;

import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlagsDefaults;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: DefaultNewArchitectureEntryPoint.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\rR\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0017\u0010\r¨\u0006\u001b"}, m90084d2 = {"Lcom/facebook/react/defaults/DefaultNewArchitectureEntryPoint;", "", "<init>", "()V", "load", "", "turboModulesEnabled", "", "fabricEnabled", "bridgelessEnabled", "privateFabricEnabled", "getFabricEnabled$annotations", "getFabricEnabled", "()Z", "privateTurboModulesEnabled", "getTurboModulesEnabled$annotations", "getTurboModulesEnabled", "privateConcurrentReactEnabled", "concurrentReactEnabled", "getConcurrentReactEnabled$annotations", "getConcurrentReactEnabled", "privateBridgelessEnabled", "getBridgelessEnabled$annotations", "getBridgelessEnabled", "isConfigurationValid", "Lkotlin/Pair;", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class DefaultNewArchitectureEntryPoint {

    @NotNull
    public static final DefaultNewArchitectureEntryPoint INSTANCE = new DefaultNewArchitectureEntryPoint();
    private static boolean privateBridgelessEnabled;
    private static boolean privateConcurrentReactEnabled;
    private static boolean privateFabricEnabled;
    private static boolean privateTurboModulesEnabled;

    @JvmStatic
    @JvmOverloads
    public static final void load() {
        load$default(false, false, false, 7, null);
    }

    public static final boolean getBridgelessEnabled() {
        return privateBridgelessEnabled;
    }

    public static final boolean getConcurrentReactEnabled() {
        return privateConcurrentReactEnabled;
    }

    public static final boolean getFabricEnabled() {
        return privateFabricEnabled;
    }

    public static final boolean getTurboModulesEnabled() {
        return privateTurboModulesEnabled;
    }

    @JvmStatic
    @JvmOverloads
    public static final void load(boolean z11) {
        load$default(z11, false, false, 6, null);
    }

    public static /* synthetic */ void load$default(boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            z13 = true;
        }
        load(z11, z12, z13);
    }

    @VisibleForTesting
    @NotNull
    public final Pair<Boolean, String> isConfigurationValid(boolean turboModulesEnabled, boolean fabricEnabled, boolean bridgelessEnabled) {
        if (!fabricEnabled || turboModulesEnabled) {
            return (!bridgelessEnabled || (turboModulesEnabled && fabricEnabled)) ? TuplesKt.m90091to(Boolean.TRUE, "") : TuplesKt.m90091to(Boolean.FALSE, "bridgelessEnabled=true requires (turboModulesEnabled=true AND fabricEnabled=true) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.");
        }
        return TuplesKt.m90091to(Boolean.FALSE, "fabricEnabled=true requires turboModulesEnabled=true (is now false) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.");
    }

    private DefaultNewArchitectureEntryPoint() {
    }

    @JvmStatic
    @JvmOverloads
    public static final void load(boolean z11, boolean z12) {
        load$default(z11, z12, false, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void load(boolean turboModulesEnabled, boolean fabricEnabled, boolean bridgelessEnabled) {
        Pair<Boolean, String> pairIsConfigurationValid = INSTANCE.isConfigurationValid(turboModulesEnabled, fabricEnabled, bridgelessEnabled);
        boolean zBooleanValue = pairIsConfigurationValid.component1().booleanValue();
        String strComponent2 = pairIsConfigurationValid.component2();
        if (zBooleanValue) {
            ReactNativeFeatureFlags.override(new ReactNativeNewArchitectureFeatureFlagsDefaults(bridgelessEnabled, fabricEnabled, turboModulesEnabled) { // from class: com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.load.1
                final /* synthetic */ boolean $bridgelessEnabled;
                final /* synthetic */ boolean $fabricEnabled;
                final /* synthetic */ boolean $turboModulesEnabled;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(bridgelessEnabled);
                    this.$bridgelessEnabled = bridgelessEnabled;
                    this.$fabricEnabled = fabricEnabled;
                    this.$turboModulesEnabled = turboModulesEnabled;
                }

                @Override // com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
                public boolean enableEventEmitterRetentionDuringGesturesOnAndroid() {
                    return this.$bridgelessEnabled || this.$fabricEnabled;
                }

                @Override // com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
                public boolean enableFabricRenderer() {
                    return this.$bridgelessEnabled || this.$fabricEnabled;
                }

                @Override // com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
                public boolean useFabricInterop() {
                    return this.$bridgelessEnabled || this.$fabricEnabled;
                }

                @Override // com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
                public boolean useTurboModules() {
                    return this.$bridgelessEnabled || this.$turboModulesEnabled;
                }
            });
            privateFabricEnabled = fabricEnabled;
            privateTurboModulesEnabled = turboModulesEnabled;
            privateConcurrentReactEnabled = fabricEnabled;
            privateBridgelessEnabled = bridgelessEnabled;
            DefaultSoLoader.INSTANCE.maybeLoadSoLibrary();
            return;
        }
        throw new IllegalStateException(strComponent2.toString());
    }

    @JvmStatic
    public static /* synthetic */ void getBridgelessEnabled$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getConcurrentReactEnabled$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getFabricEnabled$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getTurboModulesEnabled$annotations() {
    }
}
