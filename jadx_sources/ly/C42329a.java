package ly;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.kubi.sdk.util.C24267r0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ly.a */
/* JADX INFO: compiled from: ReactPromise.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/entity/ReactPromise;", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "<init>", "(Lcom/facebook/react/bridge/Promise;)V", "getPromise", "()Lcom/facebook/react/bridge/Promise;", "map", "Lcom/facebook/react/bridge/WritableMap;", "kotlin.jvm.PlatformType", "putBoolean", "key", "", "value", "", "putString", "sendToReact", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42329a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Promise f93841a;

    /* JADX INFO: renamed from: b */
    public final WritableMap f93842b;

    public C42329a(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.f93841a = promise;
        this.f93842b = Arguments.createMap();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C42329a m92876a(@NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f93842b.putBoolean(key, z11);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m92877b() {
        C24267r0.m58520d(this.f93842b);
        this.f93841a.resolve(this.f93842b);
    }
}
