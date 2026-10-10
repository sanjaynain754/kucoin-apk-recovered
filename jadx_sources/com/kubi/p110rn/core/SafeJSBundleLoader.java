package com.kubi.p110rn.core;

import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactInstanceHelper.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/rn/core/SafeJSBundleLoader;", "Lcom/facebook/react/bridge/JSBundleLoader;", "bundleFilePath", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getBundleFilePath", "()Ljava/lang/String;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "loadScript", "delegate", "Lcom/facebook/react/bridge/JSBundleLoaderDelegate;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SafeJSBundleLoader extends JSBundleLoader {

    @NotNull
    private final String bundleFilePath;

    @NotNull
    private final Function1<Exception, Unit> callback;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeJSBundleLoader(@NotNull String bundleFilePath, @NotNull Function1<? super Exception, Unit> callback) {
        Intrinsics.checkNotNullParameter(bundleFilePath, "bundleFilePath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.bundleFilePath = bundleFilePath;
        this.callback = callback;
    }

    @NotNull
    public final String getBundleFilePath() {
        return this.bundleFilePath;
    }

    @NotNull
    public final Function1<Exception, Unit> getCallback() {
        return this.callback;
    }

    @Override // com.facebook.react.bridge.JSBundleLoader
    @NotNull
    public String loadScript(@Nullable JSBundleLoaderDelegate delegate) {
        if (delegate != null) {
            try {
                String str = this.bundleFilePath;
                delegate.loadScriptFromFile(str, str, false);
            } catch (Exception e11) {
                ReactInstanceHelperKt.logKrnBundleLoadError("ReactInstanceHelper", "KRN_BUNDLE_LOAD stage=base_load_failed basePath=" + this.bundleFilePath, e11);
                this.callback.invoke(e11);
                return "";
            }
        }
        return this.bundleFilePath;
    }
}
