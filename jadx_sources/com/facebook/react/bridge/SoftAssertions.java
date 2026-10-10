package com.facebook.react.bridge;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SoftAssertions.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001f\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f2\b\u0010\r\u001a\u0004\u0018\u0001H\fH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/facebook/react/bridge/SoftAssertions;", "", "<init>", "()V", "assertUnreachable", "", "message", "", "assertCondition", "condition", "", "assertNotNull", ExifInterface.GPS_DIRECTION_TRUE, "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SoftAssertions {

    @NotNull
    public static final SoftAssertions INSTANCE = new SoftAssertions();

    @JvmStatic
    public static final void assertCondition(boolean condition, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (condition) {
            return;
        }
        ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(message));
    }

    @JvmStatic
    @Nullable
    public static final <T> T assertNotNull(@Nullable T instance) {
        if (instance == null) {
            ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException("Expected object to not be null!"));
        }
        return instance;
    }

    @JvmStatic
    public static final void assertUnreachable(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(message));
    }

    private SoftAssertions() {
    }
}
