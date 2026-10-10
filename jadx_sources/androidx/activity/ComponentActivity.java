package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.DoNotInline;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.tracing.Trace;
import dh0.C36686b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.C43179b;
import p514ou.C43330a;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ContextAware, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, MenuHost, FullyDrawnReporterOwner {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;
    private final ActivityResultRegistry mActivityResultRegistry;

    @LayoutRes
    private int mContentLayoutId;
    final ContextAwareHelper mContextAwareHelper;
    private ViewModelProvider.Factory mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @NonNull
    final FullyDrawnReporter mFullyDrawnReporter;
    private final LifecycleRegistry mLifecycleRegistry;
    private final MenuHostHelper mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<Consumer<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Integer>> mOnTrimMemoryListeners;
    final ReportFullyDrawnExecutor mReportFullyDrawnExecutor;
    final SavedStateRegistryController mSavedStateRegistryController;
    private ViewModelStore mViewModelStore;

    public static final class NonConfigurationInstances {
        Object custom;
        ViewModelStore viewModelStore;
    }

    public interface ReportFullyDrawnExecutor extends Executor {
        void activityDestroyed();

        void viewCreated(@NonNull View view);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class ReportFullyDrawnExecutorApi1 implements ReportFullyDrawnExecutor {
        final Handler mHandler = createHandler();

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.mHandler.postAtFrontOfQueue(runnable);
        }

        @NonNull
        private Handler createHandler() {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            return new Handler(looperMyLooper);
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void activityDestroyed() {
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void viewCreated(@NonNull View view) {
        }
    }

    @RequiresApi(16)
    public class ReportFullyDrawnExecutorApi16Impl implements ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {
        final long mEndWatchTimeMillis = SystemClock.uptimeMillis() + 10000;
        boolean mOnDrawScheduled = false;
        Runnable mRunnable;

        public ReportFullyDrawnExecutorApi16Impl() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m1541a(ReportFullyDrawnExecutorApi16Impl reportFullyDrawnExecutorApi16Impl) {
            Runnable runnable = reportFullyDrawnExecutorApi16Impl.mRunnable;
            if (runnable != null) {
                runnable.run();
                reportFullyDrawnExecutorApi16Impl.mRunnable = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void activityDestroyed() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.mRunnable = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.mOnDrawScheduled) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.ReportFullyDrawnExecutorApi16Impl.m1541a(this.f1157b);
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.mRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.mEndWatchTimeMillis) {
                    this.mOnDrawScheduled = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.mRunnable = null;
            if (ComponentActivity.this.mFullyDrawnReporter.isFullyDrawnReported()) {
                this.mOnDrawScheduled = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void viewCreated(@NonNull View view) {
            if (this.mOnDrawScheduled) {
                return;
            }
            this.mOnDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new ContextAwareHelper();
        this.mMenuHostHelper = new MenuHostHelper(new Runnable() { // from class: androidx.activity.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f1153b.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        SavedStateRegistryController savedStateRegistryControllerCreate = SavedStateRegistryController.create(this);
        this.mSavedStateRegistryController = savedStateRegistryControllerCreate;
        this.mOnBackPressedDispatcher = null;
        ReportFullyDrawnExecutor reportFullyDrawnExecutorCreateFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = reportFullyDrawnExecutorCreateFullyDrawnExecutor;
        this.mFullyDrawnReporter = new FullyDrawnReporter(reportFullyDrawnExecutorCreateFullyDrawnExecutor, new Function0() { // from class: androidx.activity.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComponentActivity.m1539B(this.f1154b);
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new ActivityResultRegistry() { // from class: androidx.activity.ComponentActivity.1
            @Override // androidx.activity.result.ActivityResultRegistry
            public <I, O> void onLaunch(final int i11, @NonNull ActivityResultContract<I, O> activityResultContract, I i12, @Nullable ActivityOptionsCompat activityOptionsCompat) {
                Bundle bundle;
                final int i13;
                ComponentActivity componentActivity = ComponentActivity.this;
                final ActivityResultContract.SynchronousResult<O> synchronousResult = activityResultContract.getSynchronousResult(componentActivity, i12);
                if (synchronousResult != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.ComponentActivity.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            dispatchResult(i11, synchronousResult.getValue());
                        }
                    });
                    return;
                }
                Intent intentCreateIntent = activityResultContract.createIntent(componentActivity, i12);
                if (intentCreateIntent.getExtras() != null && intentCreateIntent.getExtras().getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
                }
                if (intentCreateIntent.hasExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) {
                    bundle = intentCreateIntent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                    intentCreateIntent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                } else {
                    bundle = activityOptionsCompat != null ? activityOptionsCompat.toBundle() : null;
                }
                Bundle bundle2 = bundle;
                if (ActivityResultContracts.RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS.equals(intentCreateIntent.getAction())) {
                    String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS);
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, i11);
                    return;
                }
                if (!ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST.equals(intentCreateIntent.getAction())) {
                    ActivityCompat.startActivityForResult(componentActivity, intentCreateIntent, i11, bundle2);
                    return;
                }
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST);
                try {
                    i13 = i11;
                    try {
                        ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.getIntentSender(), i13, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle2);
                    } catch (IntentSender.SendIntentException e11) {
                        e = e11;
                        final IntentSender.SendIntentException sendIntentException = e;
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.ComponentActivity.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                dispatchResult(i13, 0, new Intent().setAction(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, sendIntentException));
                            }
                        });
                    }
                } catch (IntentSender.SendIntentException e12) {
                    e = e12;
                    i13 = i11;
                }
            }
        };
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        Api19Impl.cancelPendingInputEvents(viewPeekDecorView);
                    }
                }
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.clearAvailableContext();
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getMViewModelStore().clear();
                    }
                    ComponentActivity.this.mReportFullyDrawnExecutor.activityDestroyed();
                }
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().removeObserver(this);
            }
        });
        savedStateRegistryControllerCreate.performAttach();
        SavedStateHandleSupport.enableSavedStateHandles(this);
        getSavedStateRegistry().registerSavedStateProvider(ACTIVITY_RESULT_TAG, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.activity.c
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return ComponentActivity.m1538A(this.f1155a);
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.activity.d
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context context) {
                ComponentActivity.m1540z(this.f1156a, context);
            }
        });
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(@NonNull MenuProvider menuProvider) {
        this.mMenuHostHelper.addMenuProvider(menuProvider);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onMultiWindowModeChanged(boolean z11) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(z11));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z11) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(z11));
        }
    }

    @Nullable
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @NonNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultRegistry activityResultRegistry, @NonNull ActivityResultCallback<O> activityResultCallback) {
        return activityResultRegistry.register("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, activityResultContract, activityResultCallback);
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int i11) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.setContentView(i11);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i11) {
        super.startActivityForResult(intent, i11);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i11, @Nullable Intent intent, int i12, int i13, int i14) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14);
    }

    @RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
        }

        public static void cancelPendingInputEvents(View view) {
            view.cancelPendingInputEvents();
        }
    }

    @RequiresApi(33)
    public static class Api33Impl {
        private Api33Impl() {
        }

        @DoNotInline
        public static OnBackInvokedDispatcher getOnBackInvokedDispatcher(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("ComponentActivity.java", ComponentActivity.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("1", "onRequestPermissionsResult", "androidx.activity.ComponentActivity", "int:[Ljava.lang.String;:[I", "requestCode:permissions:grantResults", "", "void"), 870);
    }

    private ReportFullyDrawnExecutor createFullyDrawnExecutor() {
        return new ReportFullyDrawnExecutorApi16Impl();
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(@NonNull Consumer<Configuration> consumer) {
        this.mOnConfigurationChangedListeners.add(consumer);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(@NonNull OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.addOnContextAvailableListener(onContextAvailableListener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> consumer) {
        this.mOnMultiWindowModeChangedListeners.add(consumer);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(@NonNull Consumer<Intent> consumer) {
        this.mOnNewIntentListeners.add(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> consumer) {
        this.mOnPictureInPictureModeChangedListeners.add(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(@NonNull Consumer<Integer> consumer) {
        this.mOnTrimMemoryListeners.add(consumer);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                this.mViewModelStore = nonConfigurationInstances.viewModelStore;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    @NonNull
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    @CallSuper
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (getApplication() != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, getApplication());
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, getIntent().getExtras());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new SavedStateViewModelFactory(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.activity.FullyDrawnReporterOwner
    @NonNull
    public FullyDrawnReporter getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    @NonNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.ComponentActivity.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ComponentActivity.super.onBackPressed();
                    } catch (IllegalStateException e11) {
                        if (!TextUtils.equals(e11.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                            throw e11;
                        }
                    } catch (NullPointerException e12) {
                        if (!TextUtils.equals(e12.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                            throw e12;
                        }
                    }
                }
            });
            getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.6
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                    if (event != Lifecycle.Event.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    ComponentActivity.this.mOnBackPressedDispatcher.setOnBackInvokedDispatcher(Api33Impl.getOnBackInvokedDispatcher((ComponentActivity) lifecycleOwner));
                }
            });
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @NonNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onActivityResult(int i11, int i12, @Nullable Intent intent) {
        if (this.mActivityResultRegistry.dispatchResult(i11, i12, intent)) {
            return;
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        this.mSavedStateRegistryController.performRestore(bundle);
        this.mContextAwareHelper.dispatchOnContextAvailable(this);
        super.onCreate(bundle);
        ReportFragment.injectIfNeededIn(this);
        int i11 = this.mContentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i11, @NonNull Menu menu) {
        if (i11 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i11, menu);
        this.mMenuHostHelper.onCreateMenu(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i11, @NonNull Menu menu) {
        this.mMenuHostHelper.onMenuClosed(menu);
        super.onPanelClosed(i11, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i11, @Nullable View view, @NonNull Menu menu) {
        if (i11 != 0) {
            return true;
        }
        super.onPreparePanel(i11, view, menu);
        this.mMenuHostHelper.onPrepareMenu(menu);
        return true;
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    @CallSuper
    @Deprecated
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) throws Throwable {
        C43330a.m95368b().m95370d(C36686b.m82125e(ajc$tjp_0, this, this, new Object[]{C43179b.m94790c(i11), strArr, iArr}));
        if (this.mActivityResultRegistry.dispatchResult(i11, -1, new Intent().putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS, strArr).putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS, iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // androidx.activity.contextaware.ContextAware
    @Nullable
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.getContext();
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
        this.mMenuHostHelper.removeMenuProvider(menuProvider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(@NonNull Consumer<Configuration> consumer) {
        this.mOnConfigurationChangedListeners.remove(consumer);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(@NonNull OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.removeOnContextAvailableListener(onContextAvailableListener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> consumer) {
        this.mOnMultiWindowModeChangedListeners.remove(consumer);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(@NonNull Consumer<Intent> consumer) {
        this.mOnNewIntentListeners.remove(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> consumer) {
        this.mOnPictureInPictureModeChangedListeners.remove(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(@NonNull Consumer<Integer> consumer) {
        this.mOnTrimMemoryListeners.remove(consumer);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i11, @Nullable Bundle bundle) {
        super.startActivityForResult(intent, i11, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i11, @Nullable Intent intent, int i12, int i13, int i14, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
    }

    static {
        ajc$preClinit();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Bundle m1538A(ComponentActivity componentActivity) {
        componentActivity.getClass();
        Bundle bundle = new Bundle();
        componentActivity.mActivityResultRegistry.onSaveInstanceState(bundle);
        return bundle;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Unit m1539B(ComponentActivity componentActivity) {
        componentActivity.reportFullyDrawn();
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m1540z(ComponentActivity componentActivity, Context context) {
        Bundle bundleConsumeRestoredStateForKey = componentActivity.getSavedStateRegistry().consumeRestoredStateForKey(ACTIVITY_RESULT_TAG);
        if (bundleConsumeRestoredStateForKey != null) {
            componentActivity.mActivityResultRegistry.onRestoreInstanceState(bundleConsumeRestoredStateForKey);
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.State state) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner, state);
    }

    @Nullable
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.custom;
        }
        return null;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    /* JADX INFO: renamed from: getViewModelStore */
    public ViewModelStore getMViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.set(getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.set(getWindow().getDecorView(), this);
        ViewTreeFullyDrawnReporterOwner.set(getWindow().getDecorView(), this);
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @CallSuper
    @MainThread
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<Consumer<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i11, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        if (i11 == 0) {
            return this.mMenuHostHelper.onMenuItemSelected(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.viewModelStore;
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        NonConfigurationInstances nonConfigurationInstances2 = new NonConfigurationInstances();
        nonConfigurationInstances2.custom = objOnRetainCustomNonConfigurationInstance;
        nonConfigurationInstances2.viewModelStore = viewModelStore;
        return nonConfigurationInstances2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof LifecycleRegistry) {
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.performSave(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int i11) {
        super.onTrimMemory(i11);
        Iterator<Consumer<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i11));
        }
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.fullyDrawnReported();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onMultiWindowModeChanged(boolean z11, @NonNull Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z11, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(z11, configuration));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z11, @NonNull Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z11, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(z11, configuration));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @NonNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultCallback<O> activityResultCallback) {
        return registerForActivityResult(activityResultContract, this.mActivityResultRegistry, activityResultCallback);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @ContentView
    public ComponentActivity(@LayoutRes int i11) {
        this();
        this.mContentLayoutId = i11;
    }
}
