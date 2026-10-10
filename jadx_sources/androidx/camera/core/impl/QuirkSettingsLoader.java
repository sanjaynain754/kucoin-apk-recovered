package androidx.camera.core.impl;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import androidx.arch.core.util.Function;
import androidx.camera.core.Logger;
import com.tencent.bugly.proguard.C33556b3;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class QuirkSettingsLoader implements Function<Context, QuirkSettings> {
    public static final String KEY_DEFAULT_QUIRK_ENABLED = "androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED";
    public static final String KEY_QUIRK_FORCE_DISABLED = "androidx.camera.core.quirks.FORCE_DISABLED";
    public static final String KEY_QUIRK_FORCE_ENABLED = "androidx.camera.core.quirks.FORCE_ENABLED";
    private static final String TAG = "QuirkSettingsLoader";

    public static class MetadataHolderService extends Service {
        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }

        private MetadataHolderService() {
        }
    }

    private static QuirkSettings buildQuirkSettings(Context context, Bundle bundle) {
        boolean z11 = bundle.getBoolean(KEY_DEFAULT_QUIRK_ENABLED, true);
        String[] strArrLoadQuirks = loadQuirks(context, bundle, KEY_QUIRK_FORCE_ENABLED);
        String[] strArrLoadQuirks2 = loadQuirks(context, bundle, KEY_QUIRK_FORCE_DISABLED);
        Logger.m1866d(TAG, "Loaded quirk settings from metadata:");
        Logger.m1866d(TAG, "  KEY_DEFAULT_QUIRK_ENABLED = " + z11);
        Logger.m1866d(TAG, "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrLoadQuirks));
        Logger.m1866d(TAG, "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrLoadQuirks2));
        return new QuirkSettings.Builder().setEnabledWhenDeviceHasQuirk(z11).forceEnableQuirks(resolveQuirkNames(strArrLoadQuirks)).forceDisableQuirks(resolveQuirkNames(strArrLoadQuirks2)).build();
    }

    private static Class<? extends Quirk> resolveQuirkName(String str) {
        try {
            Class cls = Class.forName(str);
            if (Quirk.class.isAssignableFrom(cls)) {
                return cls;
            }
            Logger.m1872w(TAG, str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e11) {
            Logger.m1873w(TAG, "Class not found: " + str, e11);
            return null;
        }
    }

    private static Set<Class<? extends Quirk>> resolveQuirkNames(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<? extends Quirk> clsResolveQuirkName = resolveQuirkName(str);
            if (clsResolveQuirkName != null) {
                hashSet.add(clsResolveQuirkName);
            }
        }
        return hashSet;
    }

    @Override // androidx.arch.core.util.Function
    public QuirkSettings apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) MetadataHolderService.class), C33556b3.f69051i).metaData;
            if (bundle != null) {
                return buildQuirkSettings(context, bundle);
            }
            Logger.m1872w(TAG, "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.m1866d(TAG, "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }

    private static String[] loadQuirks(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i11 = bundle.getInt(str, -1);
        if (i11 == -1) {
            Logger.m1872w(TAG, "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i11);
        } catch (Resources.NotFoundException e11) {
            Logger.m1873w(TAG, "Quirk class names resource not found: " + i11, e11);
            return new String[0];
        }
    }
}
