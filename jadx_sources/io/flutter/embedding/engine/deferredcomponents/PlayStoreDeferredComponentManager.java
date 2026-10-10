package io.flutter.embedding.engine.deferredcomponents;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33844oi;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.loader.ApplicationInfoLoader;
import io.flutter.embedding.engine.loader.FlutterApplicationInfo;
import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes60.dex */
public class PlayStoreDeferredComponentManager implements DeferredComponentManager {
    public static final String MAPPING_KEY = DeferredComponentManager.class.getName() + ".loadingUnitMapping";
    private static final String TAG = "PlayStoreDeferredComponentManager";

    @Nullable
    private DeferredComponentChannel channel;

    @NonNull
    private Context context;

    @NonNull
    private FlutterApplicationInfo flutterApplicationInfo;

    @Nullable
    private FlutterJNI flutterJNI;
    private FeatureInstallStateUpdatedListener listener;

    @NonNull
    protected SparseArray<String> loadingUnitIdToComponentNames;

    @NonNull
    protected SparseArray<String> loadingUnitIdToSharedLibraryNames;

    @NonNull
    private Map<String, Integer> nameToSessionId;

    @NonNull
    private SparseIntArray sessionIdToLoadingUnitId;

    @NonNull
    private SparseArray<String> sessionIdToName;

    @NonNull
    private SparseArray<String> sessionIdToState;

    @NonNull
    private SplitInstallManager splitInstallManager;

    public class FeatureInstallStateUpdatedListener implements SplitInstallStateUpdatedListener {
        private FeatureInstallStateUpdatedListener() {
        }

        @SuppressLint({"DefaultLocale"})
        public void onStateUpdate(@NonNull SplitInstallSessionState splitInstallSessionState) {
            int iSessionId = splitInstallSessionState.sessionId();
            if (PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId) != null) {
                switch (splitInstallSessionState.status()) {
                    case 1:
                        Log.m87475d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install pending.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "pending");
                        break;
                    case 2:
                        Log.m87475d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) downloading.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "downloading");
                        break;
                    case 3:
                        Log.m87475d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) downloaded.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "downloaded");
                        break;
                    case 4:
                        Log.m87475d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) installing.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "installing");
                        break;
                    case 5:
                        Log.m87475d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install successfully.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
                        PlayStoreDeferredComponentManager playStoreDeferredComponentManager = PlayStoreDeferredComponentManager.this;
                        playStoreDeferredComponentManager.loadAssets(playStoreDeferredComponentManager.sessionIdToLoadingUnitId.get(iSessionId), (String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId));
                        if (PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.get(iSessionId) > 0) {
                            PlayStoreDeferredComponentManager playStoreDeferredComponentManager2 = PlayStoreDeferredComponentManager.this;
                            playStoreDeferredComponentManager2.loadDartLibrary(playStoreDeferredComponentManager2.sessionIdToLoadingUnitId.get(iSessionId), (String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId));
                        }
                        if (PlayStoreDeferredComponentManager.this.channel != null) {
                            PlayStoreDeferredComponentManager.this.channel.completeInstallSuccess((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId));
                        }
                        PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iSessionId);
                        PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iSessionId);
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "installed");
                        break;
                    case 6:
                        Log.m87477e(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install failed with: %s", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId), Integer.valueOf(splitInstallSessionState.errorCode())));
                        PlayStoreDeferredComponentManager.this.flutterJNI.deferredComponentInstallFailure(PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.get(iSessionId), "Module install failed with " + splitInstallSessionState.errorCode(), true);
                        if (PlayStoreDeferredComponentManager.this.channel != null) {
                            PlayStoreDeferredComponentManager.this.channel.completeInstallError((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), "Android Deferred Component failed to install.");
                        }
                        PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iSessionId);
                        PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iSessionId);
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "failed");
                        break;
                    case 7:
                        Log.m87475d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install canceled.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
                        if (PlayStoreDeferredComponentManager.this.channel != null) {
                            PlayStoreDeferredComponentManager.this.channel.completeInstallError((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), "Android Deferred Component installation canceled.");
                        }
                        PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iSessionId);
                        PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iSessionId);
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "cancelled");
                        break;
                    case 8:
                        Log.m87475d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install requires user confirmation.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "requiresUserConfirmation");
                        break;
                    case 9:
                        Log.m87475d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install canceling.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "canceling");
                        break;
                    default:
                        Log.m87475d(PlayStoreDeferredComponentManager.TAG, "Unknown status: " + splitInstallSessionState.status());
                        break;
                }
            }
        }
    }

    @NonNull
    private ApplicationInfo getApplicationInfo() {
        try {
            return this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e11) {
            throw new RuntimeException(e11);
        }
    }

    private /* synthetic */ void lambda$installDeferredComponent$0(String str, int i11, Integer num) {
        this.sessionIdToName.put(num.intValue(), str);
        this.sessionIdToLoadingUnitId.put(num.intValue(), i11);
        if (this.nameToSessionId.containsKey(str)) {
            this.sessionIdToState.remove(this.nameToSessionId.get(str).intValue());
        }
        this.nameToSessionId.put(str, num);
        this.sessionIdToState.put(num.intValue(), "Requested");
    }

    private /* synthetic */ void lambda$installDeferredComponent$1(int i11, String str, Exception exc) {
        SplitInstallException splitInstallException = (SplitInstallException) exc;
        int errorCode = splitInstallException.getErrorCode();
        if (errorCode == -6) {
            this.flutterJNI.deferredComponentInstallFailure(i11, "Install of deferred component module \"" + str + "\" failed with a network error", true);
            return;
        }
        if (errorCode != -2) {
            this.flutterJNI.deferredComponentInstallFailure(i11, String.format("Install of deferred component module \"%s\" failed with error %d: %s", str, Integer.valueOf(splitInstallException.getErrorCode()), splitInstallException.getMessage()), false);
            return;
        }
        this.flutterJNI.deferredComponentInstallFailure(i11, "Install of deferred component module \"" + str + "\" failed as it is unavailable", false);
    }

    private boolean verifyJNI() {
        if (this.flutterJNI != null) {
            return true;
        }
        Log.m87477e(TAG, "No FlutterJNI provided. `setJNI` must be called on the DeferredComponentManager before attempting to load dart libraries or invoking with platform channels.");
        return false;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void destroy() {
        this.splitInstallManager.unregisterListener(this.listener);
        this.channel = null;
        this.flutterJNI = null;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    @NonNull
    public String getDeferredComponentInstallState(int i11, @Nullable String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i11);
        }
        if (str == null) {
            Log.m87477e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return "unknown";
        }
        if (this.nameToSessionId.containsKey(str)) {
            return this.sessionIdToState.get(this.nameToSessionId.get(str).intValue());
        }
        return this.splitInstallManager.getInstalledModules().contains(str) ? "installedPendingLoad" : "unknown";
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void installDeferredComponent(final int i11, @Nullable final String str) {
        final String str2 = str != null ? str : this.loadingUnitIdToComponentNames.get(i11);
        if (str2 == null) {
            Log.m87477e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
        } else if (!str2.equals("") || i11 <= 0) {
            this.splitInstallManager.startInstall(SplitInstallRequest.newBuilder().addModule(str2).build()).addOnSuccessListener(new OnSuccessListener() { // from class: io.flutter.embedding.engine.deferredcomponents.a
            }).addOnFailureListener(new OnFailureListener() { // from class: io.flutter.embedding.engine.deferredcomponents.b
            });
        } else {
            loadDartLibrary(i11, str2);
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void setDeferredComponentChannel(@NonNull DeferredComponentChannel deferredComponentChannel) {
        this.channel = deferredComponentChannel;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void setJNI(@NonNull FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public boolean uninstallDeferredComponent(int i11, @Nullable String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i11);
        }
        if (str == null) {
            Log.m87477e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        this.splitInstallManager.deferredUninstall(arrayList);
        if (this.nameToSessionId.get(str) == null) {
            return true;
        }
        this.sessionIdToState.delete(this.nameToSessionId.get(str).intValue());
        return true;
    }

    public PlayStoreDeferredComponentManager(@NonNull Context context, @Nullable FlutterJNI flutterJNI) {
        this.context = context;
        this.flutterJNI = flutterJNI;
        this.flutterApplicationInfo = ApplicationInfoLoader.load(context);
        this.splitInstallManager = SplitInstallManagerFactory.create(context);
        FeatureInstallStateUpdatedListener featureInstallStateUpdatedListener = new FeatureInstallStateUpdatedListener();
        this.listener = featureInstallStateUpdatedListener;
        this.splitInstallManager.registerListener(featureInstallStateUpdatedListener);
        this.sessionIdToName = new SparseArray<>();
        this.sessionIdToLoadingUnitId = new SparseIntArray();
        this.sessionIdToState = new SparseArray<>();
        this.nameToSessionId = new HashMap();
        this.loadingUnitIdToComponentNames = new SparseArray<>();
        this.loadingUnitIdToSharedLibraryNames = new SparseArray<>();
        initLoadingUnitMappingToComponentNames();
    }

    private void initLoadingUnitMappingToComponentNames() {
        Bundle bundle;
        ApplicationInfo applicationInfo = getApplicationInfo();
        if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
            String str = MAPPING_KEY;
            String string = bundle.getString(str, null);
            if (string == null) {
                Log.m87477e(TAG, "No loading unit to dynamic feature module name found. Ensure '" + str + "' is defined in the base module's AndroidManifest.");
                return;
            }
            if (!string.equals("")) {
                for (String str2 : string.split(",")) {
                    String[] strArrSplit = str2.split(C33844oi.f71346o, -1);
                    int i11 = Integer.parseInt(strArrSplit[0]);
                    this.loadingUnitIdToComponentNames.put(i11, strArrSplit[1]);
                    if (strArrSplit.length > 2) {
                        this.loadingUnitIdToSharedLibraryNames.put(i11, strArrSplit[2]);
                    }
                }
            }
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void loadAssets(int i11, @NonNull String str) {
        if (!verifyJNI()) {
            return;
        }
        try {
            Context context = this.context;
            Context contextCreatePackageContext = context.createPackageContext(context.getPackageName(), 0);
            this.context = contextCreatePackageContext;
            this.flutterJNI.updateJavaAssetManager(contextCreatePackageContext.getAssets(), this.flutterApplicationInfo.flutterAssetsDir);
        } catch (PackageManager.NameNotFoundException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void loadDartLibrary(int i11, @NonNull String str) {
        if (!verifyJNI() || i11 < 0) {
            return;
        }
        String str2 = this.loadingUnitIdToSharedLibraryNames.get(i11);
        if (str2 == null) {
            str2 = this.flutterApplicationInfo.aotSharedLibraryName + C33820nf.f71144W + i11 + ".part.so";
        }
        String str3 = Build.SUPPORTED_ABIS[0];
        String strReplace = str3.replace(C33820nf.f71144W, "_");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.context.getFilesDir());
        for (String str4 : this.context.getApplicationInfo().splitSourceDirs) {
            linkedList.add(new File(str4));
        }
        while (!linkedList.isEmpty()) {
            File file = (File) linkedList.remove();
            if (file != null && file.isDirectory() && file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    linkedList.add(file2);
                }
            } else {
                String name = file.getName();
                if (name.endsWith(".apk") && ((name.startsWith(str) || name.startsWith("split_config")) && name.contains(strReplace))) {
                    arrayList.add(file.getAbsolutePath());
                } else if (name.equals(str2)) {
                    arrayList2.add(file.getAbsolutePath());
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((String) it.next()) + "!lib/" + str3 + "/" + str2);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((String) it2.next());
        }
        this.flutterJNI.loadDartDeferredLibrary(i11, (String[]) arrayList3.toArray(new String[arrayList3.size()]));
    }
}
