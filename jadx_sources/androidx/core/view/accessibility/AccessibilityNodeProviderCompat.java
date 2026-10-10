package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class AccessibilityNodeProviderCompat {
    public static final int HOST_VIEW_ID = -1;

    @Nullable
    private final Object mProvider;

    public static class AccessibilityNodeProviderApi19 extends AccessibilityNodeProvider {
        final AccessibilityNodeProviderCompat mCompat;

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i11) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateAccessibilityNodeInfo = this.mCompat.createAccessibilityNodeInfo(i11);
            if (accessibilityNodeInfoCompatCreateAccessibilityNodeInfo == null) {
                return null;
            }
            return accessibilityNodeInfoCompatCreateAccessibilityNodeInfo.unwrap();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i11) {
            List<AccessibilityNodeInfoCompat> listFindAccessibilityNodeInfosByText = this.mCompat.findAccessibilityNodeInfosByText(str, i11);
            if (listFindAccessibilityNodeInfosByText == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listFindAccessibilityNodeInfosByText.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(listFindAccessibilityNodeInfosByText.get(i12).unwrap());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i11) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatFindFocus = this.mCompat.findFocus(i11);
            if (accessibilityNodeInfoCompatFindFocus == null) {
                return null;
            }
            return accessibilityNodeInfoCompatFindFocus.unwrap();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i11, int i12, Bundle bundle) {
            return this.mCompat.performAction(i11, i12, bundle);
        }

        public AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.mCompat = accessibilityNodeProviderCompat;
        }
    }

    @RequiresApi(26)
    public static class AccessibilityNodeProviderApi26 extends AccessibilityNodeProviderApi19 {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.mCompat.addExtraDataToAccessibilityNodeInfo(i11, AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo), str, bundle);
        }

        public AccessibilityNodeProviderApi26(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }
    }

    public AccessibilityNodeProviderCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mProvider = new AccessibilityNodeProviderApi26(this);
        } else {
            this.mProvider = new AccessibilityNodeProviderApi19(this);
        }
    }

    @Nullable
    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i11) {
        return null;
    }

    @Nullable
    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(@NonNull String str, int i11) {
        return null;
    }

    @Nullable
    public AccessibilityNodeInfoCompat findFocus(int i11) {
        return null;
    }

    public boolean performAction(int i11, int i12, @Nullable Bundle bundle) {
        return false;
    }

    @Nullable
    public Object getProvider() {
        return this.mProvider;
    }

    public AccessibilityNodeProviderCompat(@Nullable Object obj) {
        this.mProvider = obj;
    }

    public void addExtraDataToAccessibilityNodeInfo(int i11, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @NonNull String str, @Nullable Bundle bundle) {
    }
}
