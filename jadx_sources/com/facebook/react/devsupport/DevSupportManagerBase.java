package com.facebook.react.devsupport;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.core.util.Supplier;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.C5771R;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.ShakeDetector;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.ErrorCustomizer;
import com.facebook.react.devsupport.interfaces.ErrorType;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.packagerconnection.Responder;
import com.tencent.bugly.proguard.C33844oi;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public abstract class DevSupportManagerBase implements DevSupportManager {
    private static final String EXOPACKAGE_LOCATION_FORMAT = "/data/local/tmp/exopackage/%s//secondary-dex";
    private static final int JAVA_ERROR_COOKIE = -1;
    private static final int JSEXCEPTION_ERROR_COOKIE = -1;
    private static final String RELOAD_APP_ACTION_SUFFIX = ".RELOAD_APP_ACTION";
    private final Context mApplicationContext;

    @Nullable
    private final DevBundleDownloadListener mBundleDownloadListener;

    @Nullable
    private ReactContext mCurrentReactContext;

    @Nullable
    private final Map<String, RequestHandler> mCustomPackagerCommandHandlers;

    @Nullable
    private DebugOverlayController mDebugOverlayController;
    private final DefaultJSExceptionHandler mDefaultJSExceptionHandler;
    private final DevLoadingViewManager mDevLoadingViewManager;

    @Nullable
    private AlertDialog mDevOptionsDialog;
    private final DevServerHelper mDevServerHelper;
    private final DeveloperSettings mDevSettings;

    @Nullable
    private List<ErrorCustomizer> mErrorCustomizers;
    private boolean mIsPackagerConnected;

    @Nullable
    private final String mJSAppBundleName;
    private final File mJSBundleDownloadedFile;
    private final File mJSSplitBundlesDir;

    @Nullable
    private StackFrame[] mLastErrorStack;

    @Nullable
    private String mLastErrorTitle;

    @Nullable
    private ErrorType mLastErrorType;

    @Nullable
    private DevSupportManager.PackagerLocationCustomizer mPackagerLocationCustomizer;
    private final PausedInDebuggerOverlayManager mPausedInDebuggerOverlayManager;
    protected final ReactInstanceDevHelper mReactInstanceDevHelper;

    @Nullable
    private final RedBoxHandler mRedBoxHandler;

    @Nullable
    private SurfaceDelegate mRedBoxSurfaceDelegate;
    private final BroadcastReceiver mReloadAppBroadcastReceiver;
    private final ShakeDetector mShakeDetector;

    @Nullable
    private final SurfaceDelegateFactory mSurfaceDelegateFactory;
    private final LinkedHashMap<String, DevOptionHandler> mCustomDevOptions = new LinkedHashMap<>();
    private boolean mDevLoadingViewVisible = false;
    private int mPendingJSSplitBundleRequests = 0;
    private boolean mIsReceiverRegistered = false;
    private boolean mIsShakeDetectorStarted = false;
    private boolean mIsDevSupportEnabled = false;
    private int mLastErrorCookie = 0;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.DevSupportManagerBase$6 */
    public class C58876 implements DevBundleDownloadListener {
        final /* synthetic */ File val$bundleFile;
        final /* synthetic */ String val$bundleUrl;
        final /* synthetic */ CallbackWithBundleLoader val$callback;

        public C58876(String str, File file, CallbackWithBundleLoader callbackWithBundleLoader) {
            this.val$bundleUrl = str;
            this.val$bundleFile = file;
            this.val$callback = callbackWithBundleLoader;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSuccess$0() {
            DevSupportManagerBase.this.hideSplitBundleDevLoadingView();
        }

        @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
        public void onFailure(Exception exc) {
            final DevSupportManagerBase devSupportManagerBase = DevSupportManagerBase.this;
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.a0
                @Override // java.lang.Runnable
                public final void run() {
                    devSupportManagerBase.hideSplitBundleDevLoadingView();
                }
            });
            this.val$callback.onError(this.val$bundleUrl, exc);
        }

        @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
        public void onProgress(@Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
            DevSupportManagerBase.this.mDevLoadingViewManager.updateProgress(str, num, num2);
        }

        @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
        public void onSuccess() {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9768b.lambda$onSuccess$0();
                }
            });
            ReactContext reactContext = DevSupportManagerBase.this.mCurrentReactContext;
            if (reactContext == null || !reactContext.hasActiveReactInstance()) {
                return;
            }
            this.val$callback.onSuccess(JSBundleLoader.createCachedSplitBundleFromNetworkLoader(this.val$bundleUrl, this.val$bundleFile.getAbsolutePath()));
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.DevSupportManagerBase$9 */
    public class C58909 implements DevServerHelper.PackagerCommandListener {
        public C58909() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureHeapCommand$2(Responder responder) {
            DevSupportManagerBase.this.handleCaptureHeap(responder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPackagerDevMenuCommand$1() {
            DevSupportManagerBase.this.showDevOptionsDialog();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPackagerReloadCommand$0() {
            DevSupportManagerBase.this.handleReloadJS();
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        @Nullable
        public Map<String, RequestHandler> customCommandHandlers() {
            return DevSupportManagerBase.this.mCustomPackagerCommandHandlers;
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onCaptureHeapCommand(final Responder responder) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9711b.lambda$onCaptureHeapCommand$2(responder);
                }
            });
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerConnected() {
            DevSupportManagerBase.this.mIsPackagerConnected = true;
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerDevMenuCommand() {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9715b.lambda$onPackagerDevMenuCommand$1();
                }
            });
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerDisconnected() {
            DevSupportManagerBase.this.mIsPackagerConnected = false;
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerReloadCommand() {
            if (!InspectorFlags.getFuseboxEnabled()) {
                DevSupportManagerBase.this.mDevServerHelper.disableDebugger();
            }
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9713b.lambda$onPackagerReloadCommand$0();
                }
            });
        }
    }

    public interface CallbackWithBundleLoader {
        void onError(String str, Throwable th2);

        void onSuccess(JSBundleLoader jSBundleLoader);
    }

    public DevSupportManagerBase(Context context, ReactInstanceDevHelper reactInstanceDevHelper, @Nullable String str, boolean z11, @Nullable RedBoxHandler redBoxHandler, @Nullable DevBundleDownloadListener devBundleDownloadListener, int i11, @Nullable Map<String, RequestHandler> map, @Nullable SurfaceDelegateFactory surfaceDelegateFactory, @Nullable DevLoadingViewManager devLoadingViewManager, @Nullable PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) {
        this.mReactInstanceDevHelper = reactInstanceDevHelper;
        this.mApplicationContext = context;
        this.mJSAppBundleName = str;
        DevInternalSettings devInternalSettings = new DevInternalSettings(context, new DevInternalSettings.Listener() { // from class: com.facebook.react.devsupport.k
            @Override // com.facebook.react.devsupport.DevInternalSettings.Listener
            public final void onInternalSettingsChanged() {
                this.f9738a.reloadSettings();
            }
        });
        this.mDevSettings = devInternalSettings;
        this.mDevServerHelper = new DevServerHelper(devInternalSettings, context, devInternalSettings.getPackagerConnectionSettings());
        this.mBundleDownloadListener = devBundleDownloadListener;
        this.mShakeDetector = new ShakeDetector(new ShakeDetector.ShakeListener() { // from class: com.facebook.react.devsupport.l
            @Override // com.facebook.react.common.ShakeDetector.ShakeListener
            public final void onShake() {
                this.f9740a.showDevOptionsDialog();
            }
        }, i11);
        this.mCustomPackagerCommandHandlers = map;
        this.mReloadAppBroadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (DevSupportManagerBase.getReloadAppAction(context2).equals(intent.getAction())) {
                    if (intent.getBooleanExtra(DevServerHelper.RELOAD_APP_EXTRA_JS_PROXY, false)) {
                        DevSupportManagerBase.this.mDevSettings.setRemoteJSDebugEnabled(true);
                        DevSupportManagerBase.this.mDevServerHelper.launchJSDevtools();
                    } else {
                        DevSupportManagerBase.this.mDevSettings.setRemoteJSDebugEnabled(false);
                    }
                    DevSupportManagerBase.this.handleReloadJS();
                }
            }
        };
        String uniqueTag = getUniqueTag();
        this.mJSBundleDownloadedFile = new File(context.getFilesDir(), uniqueTag + "ReactNativeDevBundle.js");
        this.mJSSplitBundlesDir = context.getDir(uniqueTag.toLowerCase(Locale.ROOT) + "_dev_js_split_bundles", 0);
        this.mDefaultJSExceptionHandler = new DefaultJSExceptionHandler();
        setDevSupportEnabled(z11);
        this.mRedBoxHandler = redBoxHandler;
        this.mDevLoadingViewManager = devLoadingViewManager == null ? new DefaultDevLoadingViewImplementation(reactInstanceDevHelper) : devLoadingViewManager;
        this.mSurfaceDelegateFactory = surfaceDelegateFactory;
        this.mPausedInDebuggerOverlayManager = pausedInDebuggerOverlayManager == null ? new PausedInDebuggerOverlayDialogManager(new Supplier() { // from class: com.facebook.react.devsupport.m
            @Override // androidx.core.util.Supplier
            public final Object get() {
                return this.f9744a.lambda$new$0();
            }
        }) : pausedInDebuggerOverlayManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDevOptionsDialog$8(DialogInterface dialogInterface) {
        this.mDevOptionsDialog = null;
    }

    public abstract String getUniqueTag();

    private void compatRegisterReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z11) {
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, z11 ? 2 : 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getReloadAppAction(Context context) {
        return context.getPackageName() + RELOAD_APP_ACTION_SUFFIX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCaptureHeap(final Responder responder) {
        JSCHeapCapture jSCHeapCapture;
        ReactContext reactContext = this.mCurrentReactContext;
        if (reactContext == null || (jSCHeapCapture = (JSCHeapCapture) reactContext.getNativeModule(JSCHeapCapture.class)) == null) {
            return;
        }
        jSCHeapCapture.captureHeap(this.mApplicationContext.getCacheDir().getPath(), new JSCHeapCapture.CaptureCallback() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.7
            @Override // com.facebook.react.devsupport.JSCHeapCapture.CaptureCallback
            public void onFailure(JSCHeapCapture.CaptureException captureException) {
                responder.error(captureException.toString());
            }

            @Override // com.facebook.react.devsupport.JSCHeapCapture.CaptureCallback
            public void onSuccess(File file) {
                responder.respond(file.toString());
            }
        });
    }

    private void hideDevOptionsDialog() {
        AlertDialog alertDialog = this.mDevOptionsDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.mDevOptionsDialog = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void hideSplitBundleDevLoadingView() {
        int i11 = this.mPendingJSSplitBundleRequests - 1;
        this.mPendingJSSplitBundleRequests = i11;
        if (i11 == 0) {
            hideDevLoadingView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isPackagerRunning$10(PackagerStatusCallback packagerStatusCallback) {
        this.mDevServerHelper.isPackagerRunning(packagerStatusCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Context lambda$new$0() {
        Activity currentActivity = this.mReactInstanceDevHelper.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return null;
        }
        return currentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reportBundleLoadingFailure$11(Exception exc) {
        if (exc instanceof DebugServerException) {
            showNewJavaError(((DebugServerException) exc).getMessage(), exc);
        } else {
            showNewJavaError(this.mApplicationContext.getString(C5771R.string.catalyst_reload_error), exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFpsDebugEnabled$14(boolean z11) {
        this.mDevSettings.setFpsDebugEnabled(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setHotModuleReplacementEnabled$12(boolean z11) {
        this.mDevSettings.setHotModuleReplacementEnabled(z11);
        handleReloadJS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRemoteJSDebugEnabled$13(boolean z11) {
        this.mDevSettings.setRemoteJSDebugEnabled(z11);
        handleReloadJS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDevOptionsDialog$3() {
        Activity currentActivity = this.mReactInstanceDevHelper.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            C45999a.m101507m(ReactConstants.TAG, "Unable to launch change bundle location because react activity is not available");
            return;
        }
        final EditText editText = new EditText(currentActivity);
        editText.setHint("localhost:8081");
        new AlertDialog.Builder(currentActivity).setTitle(this.mApplicationContext.getString(C5771R.string.catalyst_change_bundle_location)).setView(editText).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                DevSupportManagerBase.this.mDevSettings.getPackagerConnectionSettings().setDebugServerHost(editText.getText().toString());
                DevSupportManagerBase.this.handleReloadJS();
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDevOptionsDialog$4() {
        boolean zIsHotModuleReplacementEnabled = this.mDevSettings.isHotModuleReplacementEnabled();
        this.mDevSettings.setHotModuleReplacementEnabled(!zIsHotModuleReplacementEnabled);
        ReactContext reactContext = this.mCurrentReactContext;
        if (reactContext != null) {
            if (zIsHotModuleReplacementEnabled) {
                ((HMRClient) reactContext.getJSModule(HMRClient.class)).disable();
            } else {
                ((HMRClient) reactContext.getJSModule(HMRClient.class)).enable();
            }
        }
        if (zIsHotModuleReplacementEnabled || this.mDevSettings.isJSDevModeEnabled()) {
            return;
        }
        Context context = this.mApplicationContext;
        Toast.makeText(context, context.getString(C5771R.string.catalyst_hot_reloading_auto_enable), 1).show();
        this.mDevSettings.setJSDevModeEnabled(true);
        handleReloadJS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDevOptionsDialog$5() {
        if (!this.mDevSettings.isFpsDebugEnabled()) {
            Activity currentActivity = this.mReactInstanceDevHelper.getCurrentActivity();
            if (currentActivity == null) {
                C45999a.m101507m(ReactConstants.TAG, "Unable to get reference to react activity");
            } else {
                DebugOverlayController.requestPermission(currentActivity);
            }
        }
        DeveloperSettings developerSettings = this.mDevSettings;
        developerSettings.setFpsDebugEnabled(!developerSettings.isFpsDebugEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDevOptionsDialog$6() {
        Intent intent = new Intent(this.mApplicationContext, (Class<?>) DevSettingsActivity.class);
        intent.setFlags(268435456);
        this.mApplicationContext.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDevOptionsDialog$7(DevOptionHandler[] devOptionHandlerArr, DialogInterface dialogInterface, int i11) {
        devOptionHandlerArr[i11].onOptionSelected();
        this.mDevOptionsDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleElementInspector$15() {
        DeveloperSettings developerSettings = this.mDevSettings;
        developerSettings.setElementInspectorEnabled(!developerSettings.isElementInspectorEnabled());
        this.mReactInstanceDevHelper.toggleElementInspector();
    }

    private void logJSException(Exception exc) {
        StringBuilder sb2 = new StringBuilder(exc.getMessage() == null ? "Exception in native call from JS" : exc.getMessage());
        for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
            sb2.append("\n\n");
            sb2.append(cause.getMessage());
        }
        if (!(exc instanceof JavascriptException)) {
            showNewJavaError(sb2.toString(), exc);
        } else {
            C45999a.m101508n(ReactConstants.TAG, "Exception in native call from JS", exc);
            showNewError(exc.getMessage().toString(), new StackFrame[0], -1, ErrorType.JS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportBundleLoadingFailure(final Exception exc) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f9753b.lambda$reportBundleLoadingFailure$11(exc);
            }
        });
    }

    private void resetCurrentContext(@Nullable ReactContext reactContext) {
        if (this.mCurrentReactContext == reactContext) {
            return;
        }
        this.mCurrentReactContext = reactContext;
        DebugOverlayController debugOverlayController = this.mDebugOverlayController;
        if (debugOverlayController != null) {
            debugOverlayController.setFpsDebugViewVisible(false);
        }
        if (reactContext != null) {
            this.mDebugOverlayController = new DebugOverlayController(reactContext);
        }
        if (this.mCurrentReactContext != null) {
            try {
                URL url = new URL(getSourceUrl());
                ((HMRClient) this.mCurrentReactContext.getJSModule(HMRClient.class)).setup("android", url.getPath().substring(1), url.getHost(), url.getPort() != -1 ? url.getPort() : url.getDefaultPort(), this.mDevSettings.isHotModuleReplacementEnabled());
            } catch (MalformedURLException e11) {
                showNewJavaError(e11.getMessage(), e11);
            }
        }
        reloadSettings();
    }

    @UiThread
    private void showDevLoadingViewForUrl(String str) {
        if (this.mApplicationContext == null) {
            return;
        }
        try {
            URL url = new URL(str);
            int port = url.getPort() != -1 ? url.getPort() : url.getDefaultPort();
            this.mDevLoadingViewManager.showMessage(this.mApplicationContext.getString(C5771R.string.catalyst_loading_from_url, url.getHost() + C33844oi.f71346o + port));
            this.mDevLoadingViewVisible = true;
        } catch (MalformedURLException e11) {
            C45999a.m101507m(ReactConstants.TAG, "Bundle url format is invalid. \n\n" + e11.toString());
        }
    }

    private void showNewError(@Nullable final String str, final StackFrame[] stackFrameArr, final int i11, final ErrorType errorType) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f9756b.lambda$showNewError$1(str, stackFrameArr, i11, errorType);
            }
        });
    }

    private void updateLastErrorInfo(@Nullable String str, StackFrame[] stackFrameArr, int i11, ErrorType errorType) {
        this.mLastErrorTitle = str;
        this.mLastErrorStack = stackFrameArr;
        this.mLastErrorCookie = i11;
        this.mLastErrorType = errorType;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void addCustomDevOption(String str, DevOptionHandler devOptionHandler) {
        this.mCustomDevOptions.put(str, devOptionHandler);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public View createRootView(String str) {
        return this.mReactInstanceDevHelper.createRootView(str);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public SurfaceDelegate createSurfaceDelegate(String str) {
        SurfaceDelegateFactory surfaceDelegateFactory = this.mSurfaceDelegateFactory;
        if (surfaceDelegateFactory == null) {
            return null;
        }
        return surfaceDelegateFactory.createSurfaceDelegate(str);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void destroyRootView(View view) {
        this.mReactInstanceDevHelper.destroyRootView(view);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public File downloadBundleResourceFromUrlSync(String str, File file) {
        return this.mDevServerHelper.downloadBundleResourceFromUrlSync(str, file);
    }

    public void fetchSplitBundleAndCreateBundleLoader(String str, final CallbackWithBundleLoader callbackWithBundleLoader) {
        final String devServerSplitBundleURL = this.mDevServerHelper.getDevServerSplitBundleURL(str);
        final File file = new File(this.mJSSplitBundlesDir, str.replaceAll("/", "_") + ".jsbundle");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f9724b.lambda$fetchSplitBundleAndCreateBundleLoader$9(devServerSplitBundleURL, file, callbackWithBundleLoader);
            }
        });
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public Activity getCurrentActivity() {
        return this.mReactInstanceDevHelper.getCurrentActivity();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public ReactContext getCurrentReactContext() {
        return this.mCurrentReactContext;
    }

    public DevLoadingViewManager getDevLoadingViewManager() {
        return this.mDevLoadingViewManager;
    }

    public DevServerHelper getDevServerHelper() {
        return this.mDevServerHelper;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public DeveloperSettings getDevSettings() {
        return this.mDevSettings;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean getDevSupportEnabled() {
        return this.mIsDevSupportEnabled;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getDownloadedJSBundleFile() {
        return this.mJSBundleDownloadedFile.getAbsolutePath();
    }

    @Nullable
    public String getJSAppBundleName() {
        return this.mJSAppBundleName;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getJSBundleURLForRemoteDebugging() {
        return this.mDevServerHelper.getJSBundleURLForRemoteDebugging((String) C38115a.m86047c(this.mJSAppBundleName));
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public int getLastErrorCookie() {
        return this.mLastErrorCookie;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public StackFrame[] getLastErrorStack() {
        return this.mLastErrorStack;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public String getLastErrorTitle() {
        return this.mLastErrorTitle;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public ErrorType getLastErrorType() {
        return this.mLastErrorType;
    }

    public ReactInstanceDevHelper getReactInstanceDevHelper() {
        return this.mReactInstanceDevHelper;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public RedBoxHandler getRedBoxHandler() {
        return this.mRedBoxHandler;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceMapUrl() {
        String str = this.mJSAppBundleName;
        return str == null ? "" : this.mDevServerHelper.getSourceMapUrl((String) C38115a.m86047c(str));
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceUrl() {
        String str = this.mJSAppBundleName;
        return str == null ? "" : this.mDevServerHelper.getSourceUrl((String) C38115a.m86047c(str));
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception exc) {
        if (this.mIsDevSupportEnabled) {
            logJSException(exc);
        } else {
            this.mDefaultJSExceptionHandler.handleException(exc);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean hasUpToDateJSBundleInCache() {
        if (this.mIsDevSupportEnabled && this.mJSBundleDownloadedFile.exists()) {
            try {
                String packageName = this.mApplicationContext.getPackageName();
                if (this.mJSBundleDownloadedFile.lastModified() > this.mApplicationContext.getPackageManager().getPackageInfo(packageName, 0).lastUpdateTime) {
                    File file = new File(String.format(Locale.US, EXOPACKAGE_LOCATION_FORMAT, packageName));
                    return !file.exists() || this.mJSBundleDownloadedFile.lastModified() > file.lastModified();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                C45999a.m101507m(ReactConstants.TAG, "DevSupport is unable to get current app info");
            }
        }
        return false;
    }

    @UiThread
    public void hideDevLoadingView() {
        this.mDevLoadingViewManager.hide();
        this.mDevLoadingViewVisible = false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hidePausedInDebuggerOverlay() {
        this.mPausedInDebuggerOverlayManager.hidePausedInDebuggerOverlay();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hideRedboxDialog() {
        SurfaceDelegate surfaceDelegate = this.mRedBoxSurfaceDelegate;
        if (surfaceDelegate == null) {
            return;
        }
        surfaceDelegate.hide();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void isPackagerRunning(final PackagerStatusCallback packagerStatusCallback) {
        Runnable runnable = new Runnable() { // from class: com.facebook.react.devsupport.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f9746b.lambda$isPackagerRunning$10(packagerStatusCallback);
            }
        };
        DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer = this.mPackagerLocationCustomizer;
        if (packagerLocationCustomizer != null) {
            packagerLocationCustomizer.run(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onReactInstanceDestroyed(ReactContext reactContext) {
        if (reactContext == this.mCurrentReactContext) {
            resetCurrentContext(null);
        }
        System.gc();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    /* JADX INFO: renamed from: openDebugger, reason: merged with bridge method [inline-methods] */
    public void lambda$showDevOptionsDialog$2() {
        this.mDevServerHelper.openDebugger(this.mCurrentReactContext, this.mApplicationContext.getString(C5771R.string.catalyst_open_debugger_error));
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public Pair<String, StackFrame[]> processErrorCustomizers(Pair<String, StackFrame[]> pair) {
        List<ErrorCustomizer> list = this.mErrorCustomizers;
        if (list != null) {
            Iterator<ErrorCustomizer> it = list.iterator();
            while (it.hasNext()) {
                Pair<String, StackFrame[]> pairCustomizeErrorInfo = it.next().customizeErrorInfo(pair);
                if (pairCustomizeErrorInfo != null) {
                    pair = pairCustomizeErrorInfo;
                }
            }
        }
        return pair;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void registerErrorCustomizer(ErrorCustomizer errorCustomizer) {
        if (this.mErrorCustomizers == null) {
            this.mErrorCustomizers = new ArrayList();
        }
        this.mErrorCustomizers.add(errorCustomizer);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadJSFromServer(String str, final BundleLoadCallback bundleLoadCallback) {
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        showDevLoadingViewForUrl(str);
        final BundleDownloader.BundleInfo bundleInfo = new BundleDownloader.BundleInfo();
        this.mDevServerHelper.downloadBundleFromURL(new DevBundleDownloadListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.8
            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onFailure(Exception exc) {
                DevSupportManagerBase.this.hideDevLoadingView();
                if (DevSupportManagerBase.this.mBundleDownloadListener != null) {
                    DevSupportManagerBase.this.mBundleDownloadListener.onFailure(exc);
                }
                C45999a.m101508n(ReactConstants.TAG, "Unable to download JS bundle", exc);
                DevSupportManagerBase.this.reportBundleLoadingFailure(exc);
                bundleLoadCallback.onError(exc);
            }

            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onProgress(@Nullable String str2, @Nullable Integer num, @Nullable Integer num2) {
                DevSupportManagerBase.this.mDevLoadingViewManager.updateProgress(str2, num, num2);
                if (DevSupportManagerBase.this.mBundleDownloadListener != null) {
                    DevSupportManagerBase.this.mBundleDownloadListener.onProgress(str2, num, num2);
                }
            }

            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onSuccess() {
                DevSupportManagerBase.this.hideDevLoadingView();
                if (DevSupportManagerBase.this.mBundleDownloadListener != null) {
                    DevSupportManagerBase.this.mBundleDownloadListener.onSuccess();
                }
                ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, bundleInfo.toJSONString());
                bundleLoadCallback.onSuccess();
            }
        }, this.mJSBundleDownloadedFile, str, bundleInfo);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setAdditionalOptionForPackager(String str, String str2) {
        this.mDevSettings.getPackagerConnectionSettings().setAdditionalOptionForPackager(str, str2);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setDevSupportEnabled(boolean z11) {
        this.mIsDevSupportEnabled = z11;
        reloadSettings();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setFpsDebugEnabled(final boolean z11) {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9735b.lambda$setFpsDebugEnabled$14(z11);
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setHotModuleReplacementEnabled(final boolean z11) {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9748b.lambda$setHotModuleReplacementEnabled$12(z11);
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setPackagerLocationCustomizer(DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer) {
        this.mPackagerLocationCustomizer = packagerLocationCustomizer;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setRemoteJSDebugEnabled(final boolean z11) {
        if (this.mIsDevSupportEnabled && this.mDevSettings.isRemoteJSDebugEnabled() != z11) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9761b.lambda$setRemoteJSDebugEnabled$13(z11);
                }
            });
        }
    }

    @UiThread
    public void showDevLoadingViewForRemoteJSEnabled() {
        Context context = this.mApplicationContext;
        if (context == null) {
            return;
        }
        this.mDevLoadingViewManager.showMessage(context.getString(C5771R.string.catalyst_debug_connecting));
        this.mDevLoadingViewVisible = true;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showDevOptionsDialog() {
        if (this.mDevOptionsDialog == null && this.mIsDevSupportEnabled && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            final HashSet hashSet = new HashSet();
            linkedHashMap.put(this.mApplicationContext.getString(C5771R.string.catalyst_reload), new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.2
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    if (!DevSupportManagerBase.this.mDevSettings.isJSDevModeEnabled() && DevSupportManagerBase.this.mDevSettings.isHotModuleReplacementEnabled()) {
                        Toast.makeText(DevSupportManagerBase.this.mApplicationContext, DevSupportManagerBase.this.mApplicationContext.getString(C5771R.string.catalyst_hot_reloading_auto_disable), 1).show();
                        DevSupportManagerBase.this.mDevSettings.setHotModuleReplacementEnabled(false);
                    }
                    DevSupportManagerBase.this.handleReloadJS();
                }
            });
            if (this.mDevSettings.isRemoteJSDebugEnabled()) {
                this.mDevSettings.setRemoteJSDebugEnabled(false);
                handleReloadJS();
            }
            if (this.mDevSettings.getIsDeviceDebugEnabled() && !this.mDevSettings.isRemoteJSDebugEnabled()) {
                boolean z11 = this.mIsPackagerConnected;
                String string = this.mApplicationContext.getString(z11 ? C5771R.string.catalyst_debug_open : C5771R.string.catalyst_debug_open_disabled);
                if (!z11) {
                    hashSet.add(string);
                }
                linkedHashMap.put(string, new DevOptionHandler() { // from class: com.facebook.react.devsupport.u
                    @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                    public final void onOptionSelected() {
                        this.f9763a.lambda$showDevOptionsDialog$2();
                    }
                });
            }
            linkedHashMap.put(this.mApplicationContext.getString(C5771R.string.catalyst_change_bundle_location), new DevOptionHandler() { // from class: com.facebook.react.devsupport.v
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    this.f9764a.lambda$showDevOptionsDialog$3();
                }
            });
            linkedHashMap.put(this.mApplicationContext.getString(C5771R.string.catalyst_inspector_toggle), new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.4
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    DevSupportManagerBase.this.mDevSettings.setElementInspectorEnabled(!DevSupportManagerBase.this.mDevSettings.isElementInspectorEnabled());
                    DevSupportManagerBase.this.mReactInstanceDevHelper.toggleElementInspector();
                }
            });
            linkedHashMap.put(this.mDevSettings.isHotModuleReplacementEnabled() ? this.mApplicationContext.getString(C5771R.string.catalyst_hot_reloading_stop) : this.mApplicationContext.getString(C5771R.string.catalyst_hot_reloading), new DevOptionHandler() { // from class: com.facebook.react.devsupport.w
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    this.f9765a.lambda$showDevOptionsDialog$4();
                }
            });
            linkedHashMap.put(this.mDevSettings.isFpsDebugEnabled() ? this.mApplicationContext.getString(C5771R.string.catalyst_perf_monitor_stop) : this.mApplicationContext.getString(C5771R.string.catalyst_perf_monitor), new DevOptionHandler() { // from class: com.facebook.react.devsupport.x
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    this.f9766a.lambda$showDevOptionsDialog$5();
                }
            });
            linkedHashMap.put(this.mApplicationContext.getString(C5771R.string.catalyst_settings), new DevOptionHandler() { // from class: com.facebook.react.devsupport.y
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    this.f9767a.lambda$showDevOptionsDialog$6();
                }
            });
            if (this.mCustomDevOptions.size() > 0) {
                linkedHashMap.putAll(this.mCustomDevOptions);
            }
            final DevOptionHandler[] devOptionHandlerArr = (DevOptionHandler[]) linkedHashMap.values().toArray(new DevOptionHandler[0]);
            Activity currentActivity = this.mReactInstanceDevHelper.getCurrentActivity();
            if (currentActivity == null || currentActivity.isFinishing()) {
                C45999a.m101507m(ReactConstants.TAG, "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            LinearLayout linearLayout = new LinearLayout(currentActivity);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(currentActivity);
            textView.setText(currentActivity.getString(C5771R.string.catalyst_dev_menu_header, getUniqueTag()));
            textView.setPadding(0, 50, 0, 0);
            textView.setGravity(17);
            textView.setTextSize(16.0f);
            textView.setTypeface(textView.getTypeface(), 1);
            linearLayout.addView(textView);
            String jSExecutorDescription = getJSExecutorDescription();
            if (jSExecutorDescription != null) {
                TextView textView2 = new TextView(currentActivity);
                textView2.setText(currentActivity.getString(C5771R.string.catalyst_dev_menu_sub_header, jSExecutorDescription));
                textView2.setPadding(0, 20, 0, 0);
                textView2.setGravity(17);
                textView2.setTextSize(14.0f);
                linearLayout.addView(textView2);
            }
            AlertDialog alertDialogCreate = new AlertDialog.Builder(currentActivity).setCustomTitle(linearLayout).setAdapter(new ArrayAdapter<String>(currentActivity, R.layout.simple_list_item_1, (String[]) linkedHashMap.keySet().toArray(new String[0])) { // from class: com.facebook.react.devsupport.DevSupportManagerBase.5
                @Override // android.widget.BaseAdapter, android.widget.ListAdapter
                public boolean areAllItemsEnabled() {
                    return false;
                }

                @Override // android.widget.BaseAdapter, android.widget.ListAdapter
                public boolean isEnabled(int i11) {
                    return !hashSet.contains(getItem(i11));
                }

                @Override // android.widget.ArrayAdapter, android.widget.Adapter
                public View getView(int i11, @Nullable View view, ViewGroup viewGroup) {
                    View view2 = super.getView(i11, view, viewGroup);
                    view2.setEnabled(isEnabled(i11));
                    return view2;
                }
            }, new DialogInterface.OnClickListener() { // from class: com.facebook.react.devsupport.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    this.f9729b.lambda$showDevOptionsDialog$7(devOptionHandlerArr, dialogInterface, i11);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.react.devsupport.i
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f9732b.lambda$showDevOptionsDialog$8(dialogInterface);
                }
            }).create();
            this.mDevOptionsDialog = alertDialogCreate;
            alertDialogCreate.show();
            ReactContext reactContext = this.mCurrentReactContext;
            if (reactContext != null) {
                ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit("RCTDevMenuShown", null);
            }
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJavaError(@Nullable String str, Throwable th2) {
        C45999a.m101508n(ReactConstants.TAG, "Exception in native call", th2);
        showNewError(str, StackTraceHelper.convertJavaStackTrace(th2), -1, ErrorType.NATIVE);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showPausedInDebuggerOverlay(String str, DevSupportManager.PausedInDebuggerOverlayCommandListener pausedInDebuggerOverlayCommandListener) {
        this.mPausedInDebuggerOverlayManager.showPausedInDebuggerOverlay(str, pausedInDebuggerOverlayCommandListener);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void startInspector() {
        if (this.mIsDevSupportEnabled) {
            this.mDevServerHelper.openInspectorConnection();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void stopInspector() {
        this.mDevServerHelper.closeInspectorConnection();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void toggleElementInspector() {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9751b.lambda$toggleElementInspector$15();
                }
            });
        }
    }

    private String getJSExecutorDescription() {
        try {
            return getReactInstanceDevHelper().getJavaScriptExecutorFactory().toString();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchSplitBundleAndCreateBundleLoader$9(String str, File file, CallbackWithBundleLoader callbackWithBundleLoader) {
        showSplitBundleDevLoadingView(str);
        this.mDevServerHelper.downloadBundleFromURL(new C58876(str, file, callbackWithBundleLoader), file, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNewError$1(String str, StackFrame[] stackFrameArr, int i11, ErrorType errorType) {
        updateLastErrorInfo(str, stackFrameArr, i11, errorType);
        if (this.mRedBoxSurfaceDelegate == null) {
            SurfaceDelegate surfaceDelegateCreateSurfaceDelegate = createSurfaceDelegate(NativeRedBoxSpec.NAME);
            if (surfaceDelegateCreateSurfaceDelegate != null) {
                this.mRedBoxSurfaceDelegate = surfaceDelegateCreateSurfaceDelegate;
            } else {
                this.mRedBoxSurfaceDelegate = new RedBoxDialogSurfaceDelegate(this);
            }
            this.mRedBoxSurfaceDelegate.createContentView(NativeRedBoxSpec.NAME);
        }
        if (this.mRedBoxSurfaceDelegate.isShowing()) {
            return;
        }
        this.mRedBoxSurfaceDelegate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reload() {
        UiThreadUtil.assertOnUiThread();
        if (this.mIsDevSupportEnabled) {
            DebugOverlayController debugOverlayController = this.mDebugOverlayController;
            if (debugOverlayController != null) {
                debugOverlayController.setFpsDebugViewVisible(this.mDevSettings.isFpsDebugEnabled());
            }
            if (!this.mIsShakeDetectorStarted) {
                this.mShakeDetector.start((SensorManager) this.mApplicationContext.getSystemService("sensor"));
                this.mIsShakeDetectorStarted = true;
            }
            if (!this.mIsReceiverRegistered) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(getReloadAppAction(this.mApplicationContext));
                compatRegisterReceiver(this.mApplicationContext, this.mReloadAppBroadcastReceiver, intentFilter, true);
                this.mIsReceiverRegistered = true;
            }
            if (this.mDevLoadingViewVisible) {
                this.mDevLoadingViewManager.showMessage("Reloading...");
            }
            this.mDevServerHelper.openPackagerConnection(getClass().getSimpleName(), new C58909());
            return;
        }
        DebugOverlayController debugOverlayController2 = this.mDebugOverlayController;
        if (debugOverlayController2 != null) {
            debugOverlayController2.setFpsDebugViewVisible(false);
        }
        if (this.mIsShakeDetectorStarted) {
            this.mShakeDetector.stop();
            this.mIsShakeDetectorStarted = false;
        }
        if (this.mIsReceiverRegistered) {
            this.mApplicationContext.unregisterReceiver(this.mReloadAppBroadcastReceiver);
            this.mIsReceiverRegistered = false;
        }
        hideRedboxDialog();
        hideDevOptionsDialog();
        this.mDevLoadingViewManager.hide();
        this.mDevServerHelper.closePackagerConnection();
    }

    @UiThread
    private void showSplitBundleDevLoadingView(String str) {
        showDevLoadingViewForUrl(str);
        this.mPendingJSSplitBundleRequests++;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onNewReactContextCreated(ReactContext reactContext) {
        resetCurrentContext(reactContext);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadSettings() {
        if (UiThreadUtil.isOnUiThread()) {
            reload();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9755b.reload();
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJSError(String str, ReadableArray readableArray, int i11) {
        showNewError(str, StackTraceHelper.convertJsStackTrace(readableArray), i11, ErrorType.JS);
    }
}
