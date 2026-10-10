package io.flutter.plugin.text;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.internal.AssetHelper;
import com.google.firebase.messaging.Constants;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.systemchannels.ProcessTextChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class ProcessTextPlugin implements FlutterPlugin, ActivityAware, PluginRegistry.ActivityResultListener, ProcessTextChannel.ProcessTextMethodHandler {
    private static final String TAG = "ProcessTextPlugin";

    @Nullable
    private ActivityPluginBinding activityBinding;

    @NonNull
    private final PackageManager packageManager;

    @NonNull
    private final ProcessTextChannel processTextChannel;

    @NonNull
    private Map<Integer, MethodChannel.Result> requestsByCode = new HashMap();
    private Map<String, ResolveInfo> resolveInfosById;

    private void cacheResolveInfos() {
        this.resolveInfosById = new HashMap();
        int i11 = Build.VERSION.SDK_INT;
        Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(AssetHelper.DEFAULT_MIME_TYPE);
        for (ResolveInfo resolveInfo : i11 >= 33 ? this.packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : this.packageManager.queryIntentActivities(type, 0)) {
            String str = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.packageManager).toString();
            this.resolveInfosById.put(str, resolveInfo);
        }
    }

    public void destroy() {
        this.processTextChannel.setMethodHandler(null);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    @RequiresApi(23)
    @TargetApi(23)
    public boolean onActivityResult(int i11, int i12, @Nullable Intent intent) {
        if (!this.requestsByCode.containsKey(Integer.valueOf(i11))) {
            return false;
        }
        this.requestsByCode.remove(Integer.valueOf(i11)).success(i12 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        this.activityBinding = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activityBinding.removeActivityResultListener(this);
        this.activityBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.activityBinding.removeActivityResultListener(this);
        this.activityBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        this.activityBinding = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler
    public void processTextAction(@NonNull String str, @NonNull String str2, @NonNull boolean z11, @NonNull MethodChannel.Result result) {
        if (this.activityBinding == null) {
            result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Plugin not bound to an Activity", null);
            return;
        }
        Map<String, ResolveInfo> map = this.resolveInfosById;
        if (map == null) {
            result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = map.get(str);
        if (resolveInfo == null) {
            result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Text processing activity not found", null);
            return;
        }
        int iHashCode = result.hashCode();
        this.requestsByCode.put(Integer.valueOf(iHashCode), result);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z11);
        this.activityBinding.getActivity().startActivityForResult(intent, iHashCode);
    }

    @Override // io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler
    public Map<String, String> queryTextActions() {
        if (this.resolveInfosById == null) {
            cacheResolveInfos();
        }
        HashMap map = new HashMap();
        for (String str : this.resolveInfosById.keySet()) {
            map.put(str, this.resolveInfosById.get(str).loadLabel(this.packageManager).toString());
        }
        return map;
    }

    public ProcessTextPlugin(@NonNull ProcessTextChannel processTextChannel) {
        this.processTextChannel = processTextChannel;
        this.packageManager = processTextChannel.packageManager;
        processTextChannel.setMethodHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }
}
