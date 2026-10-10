package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.ReactConstants;
import org.jetbrains.annotations.NotNull;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactPackageHelper.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/react/ReactPackageHelper;", "", "<init>", "()V", "getNativeModuleIterator", "", "Lcom/facebook/react/bridge/ModuleHolder;", "reactPackage", "Lcom/facebook/react/ReactPackage;", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ReactPackageHelper {

    @NotNull
    public static final ReactPackageHelper INSTANCE = new ReactPackageHelper();

    private ReactPackageHelper() {
    }

    @NotNull
    public final Iterable<ModuleHolder> getNativeModuleIterator(@NotNull ReactPackage reactPackage, @NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactPackage, "reactPackage");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        C45999a.m101496b(ReactConstants.TAG, reactPackage.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        return new ReactPackageHelper$getNativeModuleIterator$$inlined$Iterable$1(reactPackage.createNativeModules(reactApplicationContext));
    }
}
