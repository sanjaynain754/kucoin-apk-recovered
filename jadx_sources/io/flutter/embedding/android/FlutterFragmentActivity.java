package io.flutter.embedding.android;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes60.dex */
public class FlutterFragmentActivity extends FragmentActivity implements FlutterEngineProvider, FlutterEngineConfigurator {
    public static final int FRAGMENT_CONTAINER_ID = View.generateViewId();
    private static final String TAG = "FlutterFragmentActivity";
    private static final String TAG_FLUTTER_FRAGMENT = "flutter_fragment";

    @Nullable
    private FlutterFragment flutterFragment;

    public static class CachedEngineIntentBuilder {
        private final Class<? extends FlutterFragmentActivity> activityClass;
        private final String cachedEngineId;
        private boolean destroyEngineWithActivity = false;
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        @NonNull
        public Intent build(@NonNull Context context) {
            return new Intent(context, this.activityClass).putExtra("cached_engine_id", this.cachedEngineId).putExtra("destroy_engine_with_activity", this.destroyEngineWithActivity).putExtra("background_mode", this.backgroundMode);
        }

        public CachedEngineIntentBuilder destroyEngineWithActivity(boolean z11) {
            this.destroyEngineWithActivity = z11;
            return this;
        }

        public CachedEngineIntentBuilder(@NonNull Class<? extends FlutterFragmentActivity> cls, @NonNull String str) {
            this.activityClass = cls;
            this.cachedEngineId = str;
        }

        @NonNull
        public CachedEngineIntentBuilder backgroundMode(@NonNull FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }
    }

    public static class NewEngineInGroupIntentBuilder {
        private final Class<? extends FlutterFragmentActivity> activityClass;
        private final String cachedEngineGroupId;
        private String dartEntrypoint = "main";
        private String initialRoute = "/";
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        @NonNull
        public Intent build(@NonNull Context context) {
            return new Intent(context, this.activityClass).putExtra("dart_entrypoint", this.dartEntrypoint).putExtra("route", this.initialRoute).putExtra("cached_engine_group_id", this.cachedEngineGroupId).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true);
        }

        @NonNull
        public NewEngineInGroupIntentBuilder dartEntrypoint(@NonNull String str) {
            this.dartEntrypoint = str;
            return this;
        }

        @NonNull
        public NewEngineInGroupIntentBuilder initialRoute(@NonNull String str) {
            this.initialRoute = str;
            return this;
        }

        public NewEngineInGroupIntentBuilder(@NonNull Class<? extends FlutterFragmentActivity> cls, @NonNull String str) {
            this.activityClass = cls;
            this.cachedEngineGroupId = str;
        }

        @NonNull
        public NewEngineInGroupIntentBuilder backgroundMode(@NonNull FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }
    }

    public static class NewEngineIntentBuilder {
        private final Class<? extends FlutterFragmentActivity> activityClass;

        @Nullable
        private List<String> dartEntrypointArgs;
        private String initialRoute = "/";
        private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        @NonNull
        public Intent build(@NonNull Context context) {
            Intent intentPutExtra = new Intent(context, this.activityClass).putExtra("route", this.initialRoute).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true);
            if (this.dartEntrypointArgs != null) {
                intentPutExtra.putExtra("dart_entrypoint_args", new ArrayList(this.dartEntrypointArgs));
            }
            return intentPutExtra;
        }

        @NonNull
        public NewEngineIntentBuilder dartEntrypointArgs(@Nullable List<String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        @NonNull
        public NewEngineIntentBuilder initialRoute(@NonNull String str) {
            this.initialRoute = str;
            return this;
        }

        public NewEngineIntentBuilder(@NonNull Class<? extends FlutterFragmentActivity> cls) {
            this.activityClass = cls;
        }

        @NonNull
        public NewEngineIntentBuilder backgroundMode(@NonNull FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }
    }

    @Nullable
    public String getDartEntrypointLibraryUri() {
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Nullable
    public FlutterEngine provideFlutterEngine(@NonNull Context context) {
        return null;
    }

    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    private void ensureFlutterFragmentCreated() {
        if (this.flutterFragment == null) {
            this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
        }
        if (this.flutterFragment == null) {
            this.flutterFragment = createFlutterFragment();
            getSupportFragmentManager().beginTransaction().add(FRAGMENT_CONTAINER_ID, this.flutterFragment, TAG_FLUTTER_FRAGMENT).commit();
        }
    }

    private void switchLaunchThemeForNormalTheme() {
        try {
            Bundle metaData = getMetaData();
            if (metaData == null) {
                Log.m87481v(TAG, "Using the launch theme as normal theme.");
                return;
            }
            int i11 = metaData.getInt("io.flutter.embedding.android.NormalTheme", -1);
            if (i11 != -1) {
                setTheme(i11);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.m87477e(TAG, "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
        }
    }

    @NonNull
    public static CachedEngineIntentBuilder withCachedEngine(@NonNull String str) {
        return new CachedEngineIntentBuilder(FlutterFragmentActivity.class, str);
    }

    @NonNull
    public static NewEngineIntentBuilder withNewEngine() {
        return new NewEngineIntentBuilder(FlutterFragmentActivity.class);
    }

    public static NewEngineInGroupIntentBuilder withNewEngineInGroup(@NonNull String str) {
        return new NewEngineInGroupIntentBuilder(FlutterFragmentActivity.class, str);
    }

    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
        FlutterFragment flutterFragment = this.flutterFragment;
        if (flutterFragment == null || !flutterFragment.isFlutterEngineInjected()) {
            GeneratedPluginRegister.registerGeneratedPlugins(flutterEngine);
        }
    }

    @NonNull
    public String getDartEntrypointFunctionName() {
        try {
            Bundle metaData = getMetaData();
            String string = metaData != null ? metaData.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Nullable
    public FlutterEngine getFlutterEngine() {
        return this.flutterFragment.getFlutterEngine();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.flutterFragment.onBackPressed();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NonNull Intent intent) {
        this.flutterFragment.onNewIntent(intent);
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        this.flutterFragment.onUserLeaveHint();
    }

    @NonNull
    public FrameLayout provideRootLayout(Context context) {
        return new FrameLayout(context);
    }

    private void configureStatusBarForFullscreenFlutterExperience() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void configureWindowForTransparency() {
        if (getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @NonNull
    public static Intent createDefaultIntent(@NonNull Context context) {
        return withNewEngine().build(context);
    }

    @NonNull
    private View createFragmentContainer() {
        FrameLayout frameLayoutProvideRootLayout = provideRootLayout(this);
        frameLayoutProvideRootLayout.setId(FRAGMENT_CONTAINER_ID);
        frameLayoutProvideRootLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayoutProvideRootLayout;
    }

    private boolean isDebuggable() {
        if ((getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    @NonNull
    public FlutterFragment createFlutterFragment() {
        TransparencyMode transparencyMode;
        boolean z11;
        String dartEntrypointLibraryUri;
        FlutterActivityLaunchConfigs.BackgroundMode backgroundMode = getBackgroundMode();
        RenderMode renderMode = getRenderMode();
        if (backgroundMode == FlutterActivityLaunchConfigs.BackgroundMode.opaque) {
            transparencyMode = TransparencyMode.opaque;
        } else {
            transparencyMode = TransparencyMode.transparent;
        }
        if (renderMode == RenderMode.surface) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (getCachedEngineId() != null) {
            Log.m87481v(TAG, "Creating FlutterFragment with cached engine:\nCached engine ID: " + getCachedEngineId() + "\nWill destroy engine when Activity is destroyed: " + shouldDestroyEngineWithHost() + "\nBackground transparency mode: " + backgroundMode + "\nWill attach FlutterEngine to Activity: " + shouldAttachEngineToActivity());
            return FlutterFragment.withCachedEngine(getCachedEngineId()).renderMode(renderMode).transparencyMode(transparencyMode).handleDeeplinking(Boolean.valueOf(shouldHandleDeeplinking())).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).destroyEngineWithFragment(shouldDestroyEngineWithHost()).shouldDelayFirstAndroidViewDraw(z11).shouldAutomaticallyHandleOnBackPressed(true).build();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Creating FlutterFragment with new engine:\nCached engine group ID: ");
        sb2.append(getCachedEngineGroupId());
        sb2.append("\nBackground transparency mode: ");
        sb2.append(backgroundMode);
        sb2.append("\nDart entrypoint: ");
        sb2.append(getDartEntrypointFunctionName());
        sb2.append("\nDart entrypoint library uri: ");
        if (getDartEntrypointLibraryUri() != null) {
            dartEntrypointLibraryUri = getDartEntrypointLibraryUri();
        } else {
            dartEntrypointLibraryUri = "\"\"";
        }
        sb2.append(dartEntrypointLibraryUri);
        sb2.append("\nInitial route: ");
        sb2.append(getInitialRoute());
        sb2.append("\nApp bundle path: ");
        sb2.append(getAppBundlePath());
        sb2.append("\nWill attach FlutterEngine to Activity: ");
        sb2.append(shouldAttachEngineToActivity());
        Log.m87481v(TAG, sb2.toString());
        if (getCachedEngineGroupId() != null) {
            return FlutterFragment.withNewEngineInGroup(getCachedEngineGroupId()).dartEntrypoint(getDartEntrypointFunctionName()).initialRoute(getInitialRoute()).handleDeeplinking(shouldHandleDeeplinking()).renderMode(renderMode).transparencyMode(transparencyMode).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).shouldDelayFirstAndroidViewDraw(z11).shouldAutomaticallyHandleOnBackPressed(true).build();
        }
        return FlutterFragment.withNewEngine().dartEntrypoint(getDartEntrypointFunctionName()).dartLibraryUri(getDartEntrypointLibraryUri()).dartEntrypointArgs(getDartEntrypointArgs()).initialRoute(getInitialRoute()).appBundlePath(getAppBundlePath()).flutterShellArgs(FlutterShellArgs.fromIntent(getIntent())).handleDeeplinking(Boolean.valueOf(shouldHandleDeeplinking())).renderMode(renderMode).transparencyMode(transparencyMode).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).shouldDelayFirstAndroidViewDraw(z11).shouldAutomaticallyHandleOnBackPressed(true).build();
    }

    @NonNull
    public String getAppBundlePath() {
        String dataString;
        if (isDebuggable() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @NonNull
    public FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
        if (getIntent().hasExtra("background_mode")) {
            return FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode"));
        }
        return FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    @Nullable
    public String getCachedEngineGroupId() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Nullable
    public String getCachedEngineId() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Nullable
    public List<String> getDartEntrypointArgs() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public String getInitialRoute() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle metaData = getMetaData();
            if (metaData == null) {
                return null;
            }
            return metaData.getString("io.flutter.InitialRoute");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Nullable
    public Bundle getMetaData() throws PackageManager.NameNotFoundException {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @NonNull
    public RenderMode getRenderMode() {
        if (getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque) {
            return RenderMode.surface;
        }
        return RenderMode.texture;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        this.flutterFragment.onActivityResult(i11, i12, intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        switchLaunchThemeForNormalTheme();
        this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
        super.onCreate(bundle);
        configureWindowForTransparency();
        setContentView(createFragmentContainer());
        configureStatusBarForFullscreenFlutterExperience();
        ensureFlutterFragmentCreated();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.flutterFragment.onPostResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) throws Throwable {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        this.flutterFragment.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        super.onTrimMemory(i11);
        this.flutterFragment.onTrimMemory(i11);
    }

    @VisibleForTesting
    public FlutterFragment retrieveExistingFlutterFragmentIfPossible() {
        return (FlutterFragment) getSupportFragmentManager().findFragmentByTag(TAG_FLUTTER_FRAGMENT);
    }

    public boolean shouldDestroyEngineWithHost() {
        return getIntent().getBooleanExtra("destroy_engine_with_activity", false);
    }

    @VisibleForTesting
    public boolean shouldHandleDeeplinking() {
        try {
            return FlutterActivityLaunchConfigs.deepLinkEnabled(getMetaData());
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(@NonNull FlutterEngine flutterEngine) {
    }
}
