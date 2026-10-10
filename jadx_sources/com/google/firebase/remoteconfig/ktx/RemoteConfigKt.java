package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.FirebaseApp;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RemoteConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\t\u0010\n\u001a&\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m90084d2 = {"Lcom/google/firebase/ktx/Firebase;", "Lcom/google/firebase/FirebaseApp;", "app", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "remoteConfig", "(Lcom/google/firebase/ktx/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "", "key", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "get", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "Lkotlin/Function1;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings$Builder;", "", "Lkotlin/ExtensionFunctionType;", "init", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "remoteConfigSettings", "(Lkotlin/jvm/functions/Function1;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "getRemoteConfig", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "Lkotlinx/coroutines/flow/e;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "getConfigUpdates", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)Lkotlinx/coroutines/flow/e;", "getConfigUpdates$annotations", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "configUpdates", "com.google.firebase-firebase-config"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class RemoteConfigKt {
    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public static final FirebaseRemoteConfigValue get(@NotNull FirebaseRemoteConfig firebaseRemoteConfig, @NotNull String key) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        FirebaseRemoteConfigValue value = firebaseRemoteConfig.getValue(key);
        Intrinsics.checkNotNullExpressionValue(value, "this.getValue(key)");
        return value;
    }

    @NotNull
    public static final InterfaceC41634e<ConfigUpdate> getConfigUpdates(@NotNull FirebaseRemoteConfig firebaseRemoteConfig) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<this>");
        return C41636g.m90913f(new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null));
    }

    @NotNull
    public static final FirebaseRemoteConfig getRemoteConfig(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance()");
        return firebaseRemoteConfig;
    }

    @NotNull
    public static final FirebaseRemoteConfig remoteConfig(@NotNull Firebase firebase, @NotNull FirebaseApp app) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(app, "app");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance(app);
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance(app)");
        return firebaseRemoteConfig;
    }

    @NotNull
    public static final FirebaseRemoteConfigSettings remoteConfigSettings(@NotNull Function1<? super FirebaseRemoteConfigSettings.Builder, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        init.invoke(builder);
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfigSettingsBuild, "builder.build()");
        return firebaseRemoteConfigSettingsBuild;
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static /* synthetic */ void getConfigUpdates$annotations(FirebaseRemoteConfig firebaseRemoteConfig) {
    }
}
