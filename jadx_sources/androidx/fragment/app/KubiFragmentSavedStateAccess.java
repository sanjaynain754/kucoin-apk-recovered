package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import p569qq.C43840a;

/* JADX INFO: loaded from: classes34.dex */
@Keep
public class KubiFragmentSavedStateAccess {
    private static final String SAVED_STATE_REGISTRY_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private static final String SUPPORT_FRAGMENTS_KEY = "android:support:fragments";
    private static final String TAG = "rn-screens";

    public static boolean removeChildFragmentManagerState(Fragment fragment) {
        if (fragment == null) {
            safeBreadcrumbsWarn("ReactRootFragment remove childFragmentManager skipped: fragment=null", TAG);
            return false;
        }
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            safeBreadcrumbsWarn("ReactRootFragment remove childFragmentManager skipped: mSavedFragmentState=null", TAG);
            return false;
        }
        boolean zContainsKey = bundle.containsKey("childFragmentManager");
        if (zContainsKey) {
            bundle.remove("childFragmentManager");
        }
        Bundle bundle2 = getBundle(bundle, "registryState");
        if (bundle2 != null && bundle2.containsKey(SUPPORT_FRAGMENTS_KEY)) {
            safeBreadcrumbsWarn("ReactRootFragment registry android:support:fragments contains= true", TAG);
        }
        Bundle bundle3 = getBundle(bundle2, SAVED_STATE_REGISTRY_KEY);
        if (bundle3 != null && bundle3.containsKey(SUPPORT_FRAGMENTS_KEY)) {
            safeBreadcrumbsWarn("ReactRootFragment nested registry android:support:fragments contains= true", TAG);
        }
        safeBreadcrumbsInfo("ReactRootFragment remove childFragmentManager removed=" + zContainsKey + ", after contains=" + bundle.containsKey("childFragmentManager"), TAG);
        return zContainsKey;
    }

    private static Bundle getBundle(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getBundle(str);
    }

    private KubiFragmentSavedStateAccess() {
    }

    private static void safeBreadcrumbsInfo(String str, String str2) {
        try {
            C43840a.m96550d(str, str2);
        } catch (Exception e11) {
            Log.e(TAG, "safeBreadcrumbs err " + e11.getMessage());
        }
    }

    private static void safeBreadcrumbsWarn(String str, String str2) {
        try {
            C43840a.m96552g(str, str2);
        } catch (Exception e11) {
            Log.e(TAG, "safeBreadcrumbs err " + e11.getMessage());
        }
    }
}
