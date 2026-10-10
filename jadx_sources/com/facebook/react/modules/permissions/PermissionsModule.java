package com.facebook.react.modules.permissions;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PermissionsModule.kt */
/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = "PermissionsAndroid")
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J+\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016¢\u0006\u0002\u0010\u001fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m90084d2 = {"Lcom/facebook/react/modules/permissions/PermissionsModule;", "Lcom/facebook/fbreact/specs/NativePermissionsAndroidSpec;", "Lcom/facebook/react/modules/core/PermissionListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "callbacks", "Landroid/util/SparseArray;", "Lcom/facebook/react/bridge/Callback;", "requestCode", "", "GRANTED", "", "DENIED", "NEVER_ASK_AGAIN", "checkPermission", "", "permission", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "shouldShowRequestPermissionRationale", "requestPermission", "requestMultiplePermissions", "permissions", "Lcom/facebook/react/bridge/ReadableArray;", "onRequestPermissionsResult", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)Z", "permissionAwareActivity", "Lcom/facebook/react/modules/core/PermissionAwareActivity;", "getPermissionAwareActivity", "()Lcom/facebook/react/modules/core/PermissionAwareActivity;", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPermissionsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionsModule.kt\ncom/facebook/react/modules/permissions/PermissionsModule\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n37#2,2:192\n1#3:194\n*S KotlinDebug\n*F\n+ 1 PermissionsModule.kt\ncom/facebook/react/modules/permissions/PermissionsModule\n*L\n146#1:192,2\n*E\n"})
public final class PermissionsModule extends NativePermissionsAndroidSpec implements PermissionListener {

    @NotNull
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";

    @NotNull
    public static final String NAME = "PermissionsAndroid";

    @NotNull
    private final String DENIED;

    @NotNull
    private final String GRANTED;

    @NotNull
    private final String NEVER_ASK_AGAIN;

    @NotNull
    private final SparseArray<Callback> callbacks;
    private int requestCode;

    @Override // com.facebook.react.modules.core.PermissionListener
    public boolean onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        try {
            Callback callback = this.callbacks.get(requestCode);
            if (callback != null) {
                callback.invoke(grantResults, getPermissionAwareActivity());
                this.callbacks.remove(requestCode);
            } else {
                C45999a.m101490K("PermissionsModule", "Unable to find callback with requestCode %d", Integer.valueOf(requestCode));
            }
            return this.callbacks.size() == 0;
        } catch (IllegalStateException e11) {
            C45999a.m101510p("PermissionsModule", e11, "Unexpected invocation of `onRequestPermissionsResult` with invalid current activity", new Object[0]);
            return false;
        }
    }

    public PermissionsModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.callbacks = new SparseArray<>();
        this.GRANTED = "granted";
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
    }

    private final PermissionAwareActivity getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if (currentActivity instanceof PermissionAwareActivity) {
                return (PermissionAwareActivity) currentActivity;
            }
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void checkPermission(@NotNull String permission, @NotNull Promise promise) {
        boolean z11;
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (getReactApplicationContext().getBaseContext().checkSelfPermission(permission) == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        promise.resolve(Boolean.valueOf(z11));
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestMultiplePermissions(@NotNull ReadableArray permissions, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(promise, "promise");
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        final ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int size = permissions.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            String string = permissions.getString(i12);
            if (string != null) {
                if (baseContext.checkSelfPermission(string) == 0) {
                    writableNativeMap.putString(string, this.GRANTED);
                    i11++;
                } else {
                    arrayList.add(string);
                }
            }
        }
        if (permissions.size() == i11) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            PermissionAwareActivity permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new Callback() { // from class: com.facebook.react.modules.permissions.PermissionsModule.requestMultiplePermissions.1
                @Override // com.facebook.react.bridge.Callback
                public void invoke(Object... args) {
                    Intrinsics.checkNotNullParameter(args, "args");
                    Object obj = args[0];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
                    int[] iArr = (int[]) obj;
                    Object obj2 = args[1];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
                    PermissionAwareActivity permissionAwareActivity2 = (PermissionAwareActivity) obj2;
                    int size2 = arrayList.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        String str = arrayList.get(i13);
                        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                        String str2 = str;
                        if (iArr.length > i13 && iArr[i13] == 0) {
                            writableNativeMap.putString(str2, this.GRANTED);
                        } else if (permissionAwareActivity2.shouldShowRequestPermissionRationale(str2)) {
                            writableNativeMap.putString(str2, this.DENIED);
                        } else {
                            writableNativeMap.putString(str2, this.NEVER_ASK_AGAIN);
                        }
                    }
                    promise.resolve(writableNativeMap);
                }
            });
            permissionAwareActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), this.requestCode, this);
            this.requestCode++;
        } catch (IllegalStateException e11) {
            promise.reject(ERROR_INVALID_ACTIVITY, e11);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestPermission(@NotNull final String permission, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (getReactApplicationContext().getBaseContext().checkSelfPermission(permission) == 0) {
            promise.resolve(this.GRANTED);
            return;
        }
        try {
            PermissionAwareActivity permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new Callback() { // from class: com.facebook.react.modules.permissions.PermissionsModule.requestPermission.1
                @Override // com.facebook.react.bridge.Callback
                public void invoke(Object... args) {
                    Intrinsics.checkNotNullParameter(args, "args");
                    Object obj = args[0];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
                    int[] iArr = (int[]) obj;
                    if (iArr.length > 0 && iArr[0] == 0) {
                        promise.resolve(this.GRANTED);
                        return;
                    }
                    Object obj2 = args[1];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
                    if (((PermissionAwareActivity) obj2).shouldShowRequestPermissionRationale(permission)) {
                        promise.resolve(this.DENIED);
                    } else {
                        promise.resolve(this.NEVER_ASK_AGAIN);
                    }
                }
            });
            permissionAwareActivity.requestPermissions(new String[]{permission}, this.requestCode, this);
            this.requestCode++;
        } catch (IllegalStateException e11) {
            promise.reject(ERROR_INVALID_ACTIVITY, e11);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void shouldShowRequestPermissionRationale(@NotNull String permission, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(permission)));
        } catch (IllegalStateException e11) {
            promise.reject(ERROR_INVALID_ACTIVITY, e11);
        }
    }
}
