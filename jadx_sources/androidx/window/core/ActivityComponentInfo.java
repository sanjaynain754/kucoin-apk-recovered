package androidx.window.core;

import android.content.ComponentName;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ActivityComponentInfo.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0012"}, m90084d2 = {"Landroidx/window/core/ActivityComponentInfo;", "", "componentName", "Landroid/content/ComponentName;", "(Landroid/content/ComponentName;)V", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "className", "(Ljava/lang/String;Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "getPackageName", "equals", "", "other", "hashCode", "", "toString", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ActivityComponentInfo {

    @NotNull
    private final String className;

    @NotNull
    private final String packageName;

    public ActivityComponentInfo(@NotNull String packageName, @NotNull String className) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(className, "className");
        this.packageName = packageName;
        this.className = className;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(ActivityComponentInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.window.core.ActivityComponentInfo");
        ActivityComponentInfo activityComponentInfo = (ActivityComponentInfo) other;
        return Intrinsics.areEqual(this.packageName, activityComponentInfo.packageName) && Intrinsics.areEqual(this.className, activityComponentInfo.className);
    }

    @NotNull
    public final String getClassName() {
        return this.className;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (this.packageName.hashCode() * 31) + this.className.hashCode();
    }

    @NotNull
    public String toString() {
        return "ClassInfo { packageName: " + this.packageName + ", className: " + this.className + " }";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityComponentInfo(@NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        String packageName = componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "componentName.className");
        this(packageName, className);
    }
}
