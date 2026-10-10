package com.kubi.p110rn.modules.command.impl;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.rn.modules.command.impl.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TakePictureCommand.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J0\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/rn/modules/command/impl/NoOpPromise;", "Lcom/facebook/react/bridge/Promise;", "<init>", "()V", "resolve", "", "value", "", "reject", "code", "", "message", "throwable", "", "userInfo", "Lcom/facebook/react/bridge/WritableMap;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NoOpPromise implements Promise {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NoOpPromise f46099a = new NoOpPromise();

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String code, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String code, @Nullable String message) {
        Intrinsics.checkNotNullParameter(code, "code");
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String code, @Nullable String message, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String code, @Nullable String message, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(code, "code");
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@Nullable String code, @Nullable String message, @Nullable Throwable throwable, @Nullable WritableMap userInfo) {
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String code, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(code, "code");
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String code, @Nullable Throwable throwable, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull Throwable throwable, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
    }

    @Override // com.facebook.react.bridge.Promise
    public void resolve(@Nullable Object value) {
    }
}
