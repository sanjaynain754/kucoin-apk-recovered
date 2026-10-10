package com.facebook.react;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.kubi.sdk.util.PermissionAspect;
import dh0.C36686b;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.C43179b;
import org.jetbrains.annotations.NotNull;
import p514ou.C43330a;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ReactActivity extends AppCompatActivity implements DefaultHardwareBackBtnHandler, PermissionAwareActivity {
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;
    private final ReactActivityDelegate mDelegate = createReactActivityDelegate();

    @Nullable
    public String getMainComponentName() {
        return null;
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("ReactActivity.java", ReactActivity.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("1", "onRequestPermissionsResult", "com.facebook.react.ReactActivity", "int:[Ljava.lang.String;:[I", "requestCode:permissions:grantResults", "", "void"), 131);
    }

    public ReactActivityDelegate createReactActivityDelegate() {
        return new ReactActivityDelegate(this, getMainComponentName());
    }

    public ReactActivityDelegate getReactActivityDelegate() {
        return this.mDelegate;
    }

    @Nullable
    public ReactDelegate getReactDelegate() {
        return this.mDelegate.getReactDelegate();
    }

    public ReactHost getReactHost() {
        return this.mDelegate.getReactHost();
    }

    public final ReactInstanceManager getReactInstanceManager() {
        return this.mDelegate.getReactInstanceManager();
    }

    public final ReactNativeHost getReactNativeHost() {
        return this.mDelegate.getReactNativeHost();
    }

    public final void loadApp(String str) {
        this.mDelegate.loadApp(str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mDelegate.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        return this.mDelegate.onKeyDown(i11, keyEvent) || super.onKeyDown(i11, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i11, KeyEvent keyEvent) {
        return this.mDelegate.onKeyLongPress(i11, keyEvent) || super.onKeyLongPress(i11, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        return this.mDelegate.onKeyUp(i11, keyEvent) || super.onKeyUp(i11, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.mDelegate.onNewIntent(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i11, @NotNull String[] strArr, @NotNull int[] iArr) throws Throwable {
        InterfaceC43175a interfaceC43175aM82125e = C36686b.m82125e(ajc$tjp_0, this, this, new Object[]{C43179b.m94790c(i11), strArr, iArr});
        PermissionAspect.m58339c().m58340d(interfaceC43175aM82125e);
        C43330a.m95368b().m95370d(interfaceC43175aM82125e);
        super.onRequestPermissionsResult(i11, strArr, iArr);
        this.mDelegate.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public void requestPermissions(String[] strArr, int i11, PermissionListener permissionListener) throws Throwable {
        this.mDelegate.requestPermissions(strArr, i11, permissionListener);
    }

    static {
        ajc$preClinit();
    }

    @Override // com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        this.mDelegate.onActivityResult(i11, i12, intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mDelegate.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mDelegate.onCreate(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mDelegate.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mDelegate.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mDelegate.onResume();
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.mDelegate.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z11) {
        super.onWindowFocusChanged(z11);
        this.mDelegate.onWindowFocusChanged(z11);
    }
}
