package com.facebook.react;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.kubi.sdk.util.PermissionAspect;
import dh0.C36686b;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.C43179b;
import p514ou.C43330a;

/* JADX INFO: loaded from: classes45.dex */
public class ReactFragment extends Fragment implements PermissionAwareActivity {
    protected static final String ARG_COMPONENT_NAME = "arg_component_name";

    @Deprecated
    protected static final String ARG_DISABLE_HOST_LIFECYCLE_EVENTS = "arg_disable_host_lifecycle_events";
    protected static final String ARG_FABRIC_ENABLED = "arg_fabric_enabled";
    protected static final String ARG_LAUNCH_OPTIONS = "arg_launch_options";
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_1;
    private boolean mDisableHostLifecycleEvents;

    @Nullable
    private PermissionListener mPermissionListener;
    protected ReactDelegate mReactDelegate;

    public static class Builder {

        @Nullable
        String mComponentName = null;

        @Nullable
        Bundle mLaunchOptions = null;

        @Nullable
        Boolean mFabricEnabled = Boolean.FALSE;

        public ReactFragment build() {
            return ReactFragment.newInstance(this.mComponentName, this.mLaunchOptions, this.mFabricEnabled);
        }

        public Builder setComponentName(String str) {
            this.mComponentName = str;
            return this;
        }

        public Builder setLaunchOptions(Bundle bundle) {
            this.mLaunchOptions = bundle;
            return this;
        }

        public Builder setFabricEnabled(boolean z11) {
            this.mFabricEnabled = Boolean.valueOf(z11);
            return this;
        }
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("ReactFragment.java", ReactFragment.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("1", "onRequestPermissionsResult", "com.facebook.react.ReactFragment", "int:[Ljava.lang.String;:[I", "requestCode:permissions:grantResults", "", "void"), 202);
        ajc$tjp_1 = c36686b.m82128h("method-call", c36686b.m82127g("11", "requestPermissions", "com.facebook.react.ReactFragment", "[Ljava.lang.String;:int", "permissions:requestCode", "", "void"), 223);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ReactFragment newInstance(String str, Bundle bundle, Boolean bool) {
        ReactFragment reactFragment = new ReactFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString(ARG_COMPONENT_NAME, str);
        bundle2.putBundle(ARG_LAUNCH_OPTIONS, bundle);
        bundle2.putBoolean(ARG_FABRIC_ENABLED, bool.booleanValue());
        reactFragment.setArguments(bundle2);
        return reactFragment;
    }

    public ReactDelegate getReactDelegate() {
        return this.mReactDelegate;
    }

    public boolean onBackPressed() {
        return this.mReactDelegate.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mReactDelegate.loadApp();
        return this.mReactDelegate.getReactRootView();
    }

    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        return this.mReactDelegate.shouldShowDevMenuOrReload(i11, keyEvent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) throws Throwable {
        InterfaceC43175a interfaceC43175aM82125e = C36686b.m82125e(ajc$tjp_0, this, this, new Object[]{C43179b.m94790c(i11), strArr, iArr});
        PermissionAspect.m58339c().m58340d(interfaceC43175aM82125e);
        C43330a.m95368b().m95370d(interfaceC43175aM82125e);
        super.onRequestPermissionsResult(i11, strArr, iArr);
        PermissionListener permissionListener = this.mPermissionListener;
        if (permissionListener == null || !permissionListener.onRequestPermissionsResult(i11, strArr, iArr)) {
            return;
        }
        this.mPermissionListener = null;
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public void requestPermissions(String[] strArr, int i11, PermissionListener permissionListener) throws Throwable {
        this.mPermissionListener = permissionListener;
        C43330a.m95368b().m95371e(C36686b.m82124d(ajc$tjp_1, this, this, strArr, C43179b.m94790c(i11)));
        requestPermissions(strArr, i11);
    }

    static {
        ajc$preClinit();
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public int checkPermission(String str, int i11, int i12) {
        return getActivity().checkPermission(str, i11, i12);
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public int checkSelfPermission(String str) {
        return getActivity().checkSelfPermission(str);
    }

    @Nullable
    public ReactHost getReactHost() {
        ReactApplication reactApplication = (ReactApplication) getActivity().getApplication();
        if (reactApplication != null) {
            return reactApplication.getReactHost();
        }
        return null;
    }

    @Nullable
    public ReactNativeHost getReactNativeHost() {
        ReactApplication reactApplication = (ReactApplication) getActivity().getApplication();
        if (reactApplication != null) {
            return reactApplication.getReactNativeHost();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        this.mReactDelegate.onActivityResult(i11, i12, intent, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Boolean boolValueOf;
        String str;
        Bundle bundle2;
        super.onCreate(bundle);
        if (getArguments() != null) {
            String string = getArguments().getString(ARG_COMPONENT_NAME);
            Bundle bundle3 = getArguments().getBundle(ARG_LAUNCH_OPTIONS);
            boolValueOf = Boolean.valueOf(getArguments().getBoolean(ARG_FABRIC_ENABLED));
            this.mDisableHostLifecycleEvents = getArguments().getBoolean(ARG_DISABLE_HOST_LIFECYCLE_EVENTS);
            str = string;
            bundle2 = bundle3;
        } else {
            boolValueOf = null;
            str = null;
            bundle2 = null;
        }
        if (str != null) {
            if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
                this.mReactDelegate = new ReactDelegate(getActivity(), getReactHost(), str, bundle2);
                return;
            } else {
                this.mReactDelegate = new ReactDelegate(getActivity(), getReactNativeHost(), str, bundle2, boolValueOf.booleanValue());
                return;
            }
        }
        throw new IllegalStateException("Cannot loadApp if component name is null");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (!this.mDisableHostLifecycleEvents) {
            this.mReactDelegate.onHostDestroy();
        } else {
            this.mReactDelegate.unloadApp();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (!this.mDisableHostLifecycleEvents) {
            this.mReactDelegate.onHostPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.mDisableHostLifecycleEvents) {
            this.mReactDelegate.onHostResume();
        }
    }
}
