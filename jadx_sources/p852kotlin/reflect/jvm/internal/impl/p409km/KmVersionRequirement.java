package p852kotlin.reflect.jvm.internal.impl.p409km;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33612dh;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class KmVersionRequirement {

    @Nullable
    private Integer errorCode;
    public KmVersionRequirementVersionKind kind;
    public KmVersionRequirementLevel level;

    @Nullable
    private String message;
    public KmVersion version;

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final KmVersionRequirementVersionKind getKind() {
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind = this.kind;
        if (kmVersionRequirementVersionKind != null) {
            return kmVersionRequirementVersionKind;
        }
        Intrinsics.throwUninitializedPropertyAccessException(C33612dh.f69618m);
        return null;
    }

    @NotNull
    public final KmVersionRequirementLevel getLevel() {
        KmVersionRequirementLevel kmVersionRequirementLevel = this.level;
        if (kmVersionRequirementLevel != null) {
            return kmVersionRequirementLevel;
        }
        Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.LEVEL);
        return null;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final KmVersion getVersion() {
        KmVersion kmVersion = this.version;
        if (kmVersion != null) {
            return kmVersion;
        }
        Intrinsics.throwUninitializedPropertyAccessException("version");
        return null;
    }

    public final void setErrorCode(@Nullable Integer num) {
        this.errorCode = num;
    }

    public final void setKind(@NotNull KmVersionRequirementVersionKind kmVersionRequirementVersionKind) {
        Intrinsics.checkNotNullParameter(kmVersionRequirementVersionKind, "<set-?>");
        this.kind = kmVersionRequirementVersionKind;
    }

    public final void setLevel(@NotNull KmVersionRequirementLevel kmVersionRequirementLevel) {
        Intrinsics.checkNotNullParameter(kmVersionRequirementLevel, "<set-?>");
        this.level = kmVersionRequirementLevel;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setVersion(@NotNull KmVersion kmVersion) {
        Intrinsics.checkNotNullParameter(kmVersion, "<set-?>");
        this.version = kmVersion;
    }

    @NotNull
    public String toString() {
        return "KmVersionRequirement(kind=" + getKind() + ", level=" + getLevel() + ", version=" + getVersion() + ", errorCode=" + this.errorCode + ", message=" + this.message + ')';
    }
}
