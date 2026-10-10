package com.tencent.qcloud.tuicore;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public class TUIRouter {
    private static final String TAG = "TUIRouter";

    @SuppressLint({"StaticFieldLeak"})
    private static Context context;
    private static final TUIRouter router = new TUIRouter();
    private static final Map<String, String> routerMap = new HashMap();
    private static boolean initialized = false;
    private static boolean enableStartActivityForResult = true;

    public static class LauncherViewModel extends ViewModel {
        private ActivityResultLauncher<Pair<Intent, ActivityResultCallback<ActivityResult>>> launcher;

        private void clearLauncher() {
            ActivityResultLauncher<Pair<Intent, ActivityResultCallback<ActivityResult>>> activityResultLauncher = this.launcher;
            if (activityResultLauncher != null) {
                try {
                    activityResultLauncher.unregister();
                } catch (Exception e11) {
                    Log.e(TUIRouter.TAG, "LauncherViewModel onCleared error: " + e11.getMessage());
                } finally {
                    this.launcher = null;
                }
            }
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            clearLauncher();
        }

        public void setLauncher(ActivityResultLauncher<Pair<Intent, ActivityResultCallback<ActivityResult>>> activityResultLauncher) {
            clearLauncher();
            this.launcher = activityResultLauncher;
        }
    }

    public static class Navigation {
        String destination;
        Intent intent = new Intent();
        Bundle options;

        public void navigate() {
            navigate((Context) null);
        }

        public Navigation putExtra(String str, boolean z11) {
            this.intent.putExtra(str, z11);
            return this;
        }

        public Navigation putExtras(Bundle bundle) {
            if (bundle != null) {
                this.intent.putExtras(bundle);
            }
            return this;
        }

        public Navigation setDestination(String str) {
            String str2 = (String) TUIRouter.routerMap.get(str);
            this.destination = str2;
            if (str2 == null) {
                Log.e(TUIRouter.TAG, "destination is null.");
                return this;
            }
            this.intent.setComponent(new ComponentName(TUIRouter.context, this.destination));
            return this;
        }

        private void startActivity(Context context, int i11) {
            if (context == null) {
                Log.e(TUIRouter.TAG, "StartActivity failed, context is null.Please init");
                return;
            }
            try {
                if ((context instanceof Activity) && i11 >= 0) {
                    ActivityCompat.startActivityForResult((Activity) context, this.intent, i11, this.options);
                    return;
                }
                if (!(context instanceof Activity)) {
                    this.intent.addFlags(268435456);
                }
                ContextCompat.startActivity(context, this.intent, this.options);
            } catch (ActivityNotFoundException e11) {
                e11.printStackTrace();
            }
        }

        public Intent getIntent() {
            return this.intent;
        }

        public void navigate(Context context) {
            navigate(context, -1);
        }

        public Navigation putExtra(String str, byte b11) {
            this.intent.putExtra(str, b11);
            return this;
        }

        public Navigation putExtras(Intent intent) {
            if (intent != null) {
                this.intent.putExtras(intent);
            }
            return this;
        }

        public Navigation setIntent(Intent intent) {
            this.intent = intent;
            return this;
        }

        public Navigation setOptions(Bundle bundle) {
            this.options = bundle;
            return this;
        }

        public void navigate(Fragment fragment) {
            navigate(fragment, -1);
        }

        public Navigation putExtra(String str, char c11) {
            this.intent.putExtra(str, c11);
            return this;
        }

        @Deprecated
        public void navigate(Fragment fragment, int i11) {
            if (!TUIRouter.initialized) {
                Log.e(TUIRouter.TAG, "have not initialized.");
                return;
            }
            Intent intent = this.intent;
            if (intent == null) {
                Log.e(TUIRouter.TAG, "intent is null.");
                return;
            }
            try {
                if (fragment == null) {
                    startActivity(null, i11);
                } else if (i11 >= 0) {
                    fragment.startActivityForResult(intent, i11);
                } else {
                    fragment.startActivity(intent, this.options);
                }
            } catch (ActivityNotFoundException e11) {
                e11.printStackTrace();
            }
        }

        public Navigation putExtra(String str, short s11) {
            this.intent.putExtra(str, s11);
            return this;
        }

        public Navigation setDestination(Class<? extends Activity> cls) {
            this.intent.setComponent(new ComponentName(TUIRouter.context, cls));
            return this;
        }

        public Navigation putExtra(String str, int i11) {
            this.intent.putExtra(str, i11);
            return this;
        }

        public Navigation putExtra(String str, long j11) {
            this.intent.putExtra(str, j11);
            return this;
        }

        public Navigation putExtra(String str, float f11) {
            this.intent.putExtra(str, f11);
            return this;
        }

        public Navigation putExtra(String str, double d11) {
            this.intent.putExtra(str, d11);
            return this;
        }

        public Navigation putExtra(String str, String str2) {
            if (str2 != null) {
                this.intent.putExtra(str, str2);
            }
            return this;
        }

        public Navigation putExtra(String str, CharSequence charSequence) {
            if (charSequence != null) {
                this.intent.putExtra(str, charSequence);
            }
            return this;
        }

        public Navigation putExtra(String str, Parcelable parcelable) {
            if (parcelable != null) {
                this.intent.putExtra(str, parcelable);
            }
            return this;
        }

        public void navigate(ActivityResultCaller activityResultCaller, ActivityResultCallback<ActivityResult> activityResultCallback) {
            if (!TUIRouter.initialized) {
                Log.e(TUIRouter.TAG, "have not initialized.");
                return;
            }
            if (this.intent == null) {
                Log.e(TUIRouter.TAG, "intent is null.");
                return;
            }
            try {
                if (activityResultCaller instanceof ComponentActivity) {
                    ComponentActivity componentActivity = (ComponentActivity) activityResultCaller;
                    if (!componentActivity.isFinishing()) {
                        if (componentActivity.isDestroyed()) {
                        }
                    }
                    Log.e(TUIRouter.TAG, "Activity is finishing or destroyed");
                    if (activityResultCallback != null) {
                        activityResultCallback.onActivityResult(new ActivityResult(0, null));
                        return;
                    }
                    return;
                }
                if (activityResultCaller instanceof Fragment) {
                    Fragment fragment = (Fragment) activityResultCaller;
                    if (!fragment.isAdded() || fragment.isDetached()) {
                        Log.e(TUIRouter.TAG, "Fragment is not added or detached");
                        if (activityResultCallback != null) {
                            activityResultCallback.onActivityResult(new ActivityResult(0, null));
                            return;
                        }
                        return;
                    }
                }
                LauncherViewModel launcherViewModel = activityResultCaller instanceof ViewModelStoreOwner ? (LauncherViewModel) new ViewModelProvider((ViewModelStoreOwner) activityResultCaller).get(LauncherViewModel.class) : null;
                ActivityResultLauncher activityResultLauncher = launcherViewModel != null ? launcherViewModel.launcher : null;
                if (activityResultLauncher == null) {
                    Log.e(TUIRouter.TAG, "launcher is null, ActivityResultLauncher not registered");
                    if (activityResultCallback != null) {
                        activityResultCallback.onActivityResult(new ActivityResult(0, null));
                        return;
                    }
                    return;
                }
                activityResultLauncher.launch(Pair.create(this.intent, activityResultCallback));
            } catch (Exception e11) {
                Log.e(TUIRouter.TAG, "start activity failed, " + e11.getLocalizedMessage());
                if (activityResultCallback != null) {
                    activityResultCallback.onActivityResult(new ActivityResult(0, null));
                }
            }
        }

        public Navigation putExtra(String str, Parcelable[] parcelableArr) {
            if (parcelableArr != null) {
                this.intent.putExtra(str, parcelableArr);
            }
            return this;
        }

        public Navigation putExtra(String str, Serializable serializable) {
            if (serializable != null) {
                this.intent.putExtra(str, serializable);
            }
            return this;
        }

        public Navigation putExtra(String str, boolean[] zArr) {
            if (zArr != null) {
                this.intent.putExtra(str, zArr);
            }
            return this;
        }

        public Navigation putExtra(String str, byte[] bArr) {
            if (bArr != null) {
                this.intent.putExtra(str, bArr);
            }
            return this;
        }

        public Navigation putExtra(String str, short[] sArr) {
            if (sArr != null) {
                this.intent.putExtra(str, sArr);
            }
            return this;
        }

        public Navigation putExtra(String str, char[] cArr) {
            if (cArr != null) {
                this.intent.putExtra(str, cArr);
            }
            return this;
        }

        public Navigation putExtra(String str, int[] iArr) {
            if (iArr != null) {
                this.intent.putExtra(str, iArr);
            }
            return this;
        }

        public Navigation putExtra(String str, long[] jArr) {
            if (jArr != null) {
                this.intent.putExtra(str, jArr);
            }
            return this;
        }

        public Navigation putExtra(String str, float[] fArr) {
            if (fArr != null) {
                this.intent.putExtra(str, fArr);
            }
            return this;
        }

        public Navigation putExtra(String str, double[] dArr) {
            if (dArr != null) {
                this.intent.putExtra(str, dArr);
            }
            return this;
        }

        public Navigation putExtra(String str, String[] strArr) {
            if (strArr != null) {
                this.intent.putExtra(str, strArr);
            }
            return this;
        }

        public Navigation putExtra(String str, CharSequence[] charSequenceArr) {
            if (charSequenceArr != null) {
                this.intent.putExtra(str, charSequenceArr);
            }
            return this;
        }

        public Navigation putExtra(String str, Bundle bundle) {
            if (bundle != null) {
                this.intent.putExtra(str, bundle);
            }
            return this;
        }

        @Deprecated
        public void navigate(Context context, int i11) {
            if (!TUIRouter.initialized) {
                Log.e(TUIRouter.TAG, "have not initialized.");
            } else {
                if (this.intent == null) {
                    Log.e(TUIRouter.TAG, "intent is null.");
                    return;
                }
                if (context == null) {
                    context = TUIRouter.context;
                }
                startActivity(context, i11);
            }
        }
    }

    public static class RouterActivityResultCallback implements ActivityResultCallback<Pair<ActivityResult, ActivityResultCallback<ActivityResult>>> {
        @Override // androidx.activity.result.ActivityResultCallback
        public void onActivityResult(Pair<ActivityResult, ActivityResultCallback<ActivityResult>> pair) {
            Object obj = pair.second;
            if (obj != null) {
                ((ActivityResultCallback) obj).onActivityResult(pair.first);
            }
        }
    }

    public static class RouterActivityResultContract extends ActivityResultContract<Pair<Intent, ActivityResultCallback<ActivityResult>>, Pair<ActivityResult, ActivityResultCallback<ActivityResult>>> {
        private ActivityResultCallback<ActivityResult> callback;

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Intent createIntent(@NonNull Context context, Pair<Intent, ActivityResultCallback<ActivityResult>> pair) {
            this.callback = (ActivityResultCallback) pair.second;
            return (Intent) pair.first;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Pair<ActivityResult, ActivityResultCallback<ActivityResult>> parseResult(int i11, @Nullable Intent intent) {
            Pair<ActivityResult, ActivityResultCallback<ActivityResult>> pairCreate = Pair.create(new ActivityResult(i11, intent), this.callback);
            this.callback = null;
            return pairCreate;
        }
    }

    public static void disableStartActivityForResult() {
        enableStartActivityForResult = false;
    }

    public static void startActivityForResult(@Nullable ActivityResultCaller activityResultCaller, String str, Bundle bundle, ActivityResultCallback<ActivityResult> activityResultCallback) {
        getInstance().setDestination(str).putExtras(bundle).navigate(activityResultCaller, activityResultCallback);
    }

    public Navigation setDestination(String str) {
        Navigation navigation = new Navigation();
        navigation.setDestination(str);
        return navigation;
    }

    public static Context getContext() {
        return context;
    }

    public static TUIRouter getInstance() {
        return router;
    }

    public static synchronized void init(Context context2) {
        if (initialized) {
            return;
        }
        context = context2;
        if (context2 == null) {
            Log.e(TAG, "init failed, context is null.");
            return;
        }
        initRouter(context2);
        if (enableStartActivityForResult) {
            initActivityResultLauncher(context2);
        }
        initialized = true;
    }

    private static void initActivityResultLauncher(Context context2) {
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.tencent.qcloud.tuicore.TUIRouter.1
                final FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks = new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.tencent.qcloud.tuicore.TUIRouter.1.1
                    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                    public void onFragmentCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
                        if (fragment != null) {
                            registerForActivityResult(fragment);
                        } else {
                            Log.e(TUIRouter.TAG, "initActivityResultLauncher onFragmentCreated error: fragment not instance of ActivityResultCaller");
                        }
                    }
                };

                /* JADX INFO: Access modifiers changed from: private */
                public void registerForActivityResult(ActivityResultCaller activityResultCaller) {
                    ActivityResultLauncher<Pair<Intent, ActivityResultCallback<ActivityResult>>> activityResultLauncherRegisterForActivityResult = activityResultCaller.registerForActivityResult(new RouterActivityResultContract(), new RouterActivityResultCallback());
                    LauncherViewModel launcherViewModel = activityResultCaller instanceof ViewModelStoreOwner ? (LauncherViewModel) new ViewModelProvider((ViewModelStoreOwner) activityResultCaller).get(LauncherViewModel.class) : null;
                    if (launcherViewModel != null) {
                        launcherViewModel.setLauncher(activityResultLauncherRegisterForActivityResult);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
                    if (activity instanceof ActivityResultCaller) {
                        registerForActivityResult((ActivityResultCaller) activity);
                        if (activity instanceof FragmentActivity) {
                            ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.fragmentLifecycleCallbacks, true);
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(@NonNull Activity activity) {
                    if (activity instanceof FragmentActivity) {
                        ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.fragmentLifecycleCallbacks);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(@NonNull Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(@NonNull Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(@NonNull Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(@NonNull Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
                }
            });
        }
    }

    public static void initRouter(Context context2) {
        ActivityInfo[] activityInfoArr;
        ArrayList<String> arrayList = new ArrayList();
        try {
            activityInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 1).activities;
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            activityInfoArr = null;
        }
        if (activityInfoArr != null) {
            for (ActivityInfo activityInfo : activityInfoArr) {
                arrayList.add(activityInfo.name);
            }
        }
        for (String str : arrayList) {
            String[] strArrSplit = str.split("\\.");
            routerMap.put(strArrSplit[strArrSplit.length - 1], str);
        }
    }

    private TUIRouter() {
    }

    @Deprecated
    public static void startActivity(@Nullable Object obj, String str, Bundle bundle, int i11) {
        Navigation navigationPutExtras = getInstance().setDestination(str).putExtras(bundle);
        if (obj instanceof Fragment) {
            navigationPutExtras.navigate((Fragment) obj, i11);
        } else if (obj instanceof Context) {
            navigationPutExtras.navigate((Context) obj, i11);
        } else {
            navigationPutExtras.navigate((Context) null, i11);
        }
    }

    public static void startActivityForResult(@Nullable ActivityResultCaller activityResultCaller, Class<? extends Activity> cls, Bundle bundle, ActivityResultCallback<ActivityResult> activityResultCallback) {
        getInstance().setDestination(cls).putExtras(bundle).navigate(activityResultCaller, activityResultCallback);
    }

    public Navigation setDestination(Class<? extends Activity> cls) {
        Navigation navigation = new Navigation();
        navigation.setDestination(cls);
        return navigation;
    }

    public static void startActivityForResult(@Nullable ActivityResultCaller activityResultCaller, Intent intent, ActivityResultCallback<ActivityResult> activityResultCallback) {
        Navigation navigation = new Navigation();
        navigation.setIntent(intent);
        navigation.navigate(activityResultCaller, activityResultCallback);
    }
}
