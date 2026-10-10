package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.Identifier;
import androidx.core.util.Preconditions;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CameraIdentifier.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00068G¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Landroidx/camera/core/CameraIdentifier;", "", "cameraIds", "", "", "compatibilityId", "Landroidx/camera/core/impl/Identifier;", "<init>", "(Ljava/util/List;Landroidx/camera/core/impl/Identifier;)V", "getCameraIds", "()Ljava/util/List;", "getCompatibilityId", "()Landroidx/camera/core/impl/Identifier;", "internalId", "getInternalId", "()Ljava/lang/String;", "isOf", "", "camera", "Landroidx/camera/core/Camera;", "cameraInfo", "Landroidx/camera/core/CameraInfo;", "equals", "other", "hashCode", "", "toString", "Companion", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nCameraIdentifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraIdentifier.kt\nandroidx/camera/core/CameraIdentifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n1#2:251\n*E\n"})
public final class CameraIdentifier {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<String> cameraIds;

    @Nullable
    private final Identifier compatibilityId;

    /* JADX INFO: compiled from: CameraIdentifier.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0011"}, m90084d2 = {"Landroidx/camera/core/CameraIdentifier$Companion;", "", "<init>", "()V", "create", "Landroidx/camera/core/CameraIdentifier;", "cameraIds", "", "", "compatibilityId", "Landroidx/camera/core/impl/Identifier;", "primaryCameraId", "secondaryCameraId", "fromAdapterInfos", "primaryInfo", "Landroidx/camera/core/impl/AdapterCameraInfo;", "secondaryInfo", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @SourceDebugExtension({"SMAP\nCameraIdentifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraIdentifier.kt\nandroidx/camera/core/CameraIdentifier$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n1#2:251\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CameraIdentifier create$default(Companion companion, List list, Identifier identifier, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                identifier = null;
            }
            return companion.create((List<String>) list, identifier);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final CameraIdentifier create(@NotNull String primaryCameraId) {
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            return create$default(this, primaryCameraId, null, null, 6, null);
        }

        private Companion() {
        }

        public static /* synthetic */ CameraIdentifier create$default(Companion companion, String str, String str2, Identifier identifier, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                identifier = null;
            }
            return companion.create(str, str2, identifier);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final CameraIdentifier create(@NotNull String primaryCameraId, @Nullable String str) {
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            return create$default(this, primaryCameraId, str, null, 4, null);
        }

        @JvmStatic
        @VisibleForTesting
        @NotNull
        @JvmOverloads
        public final CameraIdentifier create(@NotNull List<String> cameraIds) {
            Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
            return create$default(this, cameraIds, null, 2, null);
        }

        @JvmStatic
        @NotNull
        public final CameraIdentifier fromAdapterInfos(@NotNull AdapterCameraInfo primaryInfo, @Nullable AdapterCameraInfo secondaryInfo) {
            String cameraId;
            Intrinsics.checkNotNullParameter(primaryInfo, "primaryInfo");
            if (secondaryInfo != null) {
                cameraId = secondaryInfo.getCameraId();
            } else {
                cameraId = null;
            }
            Identifier compatibilityId = primaryInfo.getCameraConfig().getCompatibilityId();
            Intrinsics.checkNotNullExpressionValue(compatibilityId, "getCompatibilityId(...)");
            String cameraId2 = primaryInfo.getCameraId();
            Intrinsics.checkNotNullExpressionValue(cameraId2, "getCameraId(...)");
            return create(cameraId2, cameraId, compatibilityId);
        }

        @JvmStatic
        @VisibleForTesting
        @NotNull
        @JvmOverloads
        public final CameraIdentifier create(@NotNull List<String> cameraIds, @Nullable Identifier compatibilityId) {
            Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
            return new CameraIdentifier(cameraIds, compatibilityId, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final CameraIdentifier create(@NotNull String primaryCameraId, @Nullable String secondaryCameraId, @Nullable Identifier compatibilityId) {
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            List<String> listMutableListOf = CollectionsKt.mutableListOf(primaryCameraId);
            if (secondaryCameraId != null) {
                listMutableListOf.add(secondaryCameraId);
            }
            return create(listMutableListOf, compatibilityId);
        }
    }

    public /* synthetic */ CameraIdentifier(List list, Identifier identifier, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, identifier);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final CameraIdentifier create(@NotNull String str) {
        return INSTANCE.create(str);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraIdentifier)) {
            return false;
        }
        CameraIdentifier cameraIdentifier = (CameraIdentifier) other;
        return Intrinsics.areEqual(this.cameraIds, cameraIdentifier.cameraIds) && Intrinsics.areEqual(this.compatibilityId, cameraIdentifier.compatibilityId);
    }

    public final boolean isOf(@NotNull Camera camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Preconditions.checkNotNull(camera);
        return Intrinsics.areEqual(this, camera.getCameraInfo().getCameraIdentifier());
    }

    private CameraIdentifier(List<String> list, Identifier identifier) {
        this.cameraIds = list;
        this.compatibilityId = identifier;
        Preconditions.checkArgument(!list.isEmpty(), "Camera ID set cannot be empty.");
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final CameraIdentifier create(@NotNull String str, @Nullable String str2) {
        return INSTANCE.create(str, str2);
    }

    @JvmStatic
    @NotNull
    public static final CameraIdentifier fromAdapterInfos(@NotNull AdapterCameraInfo adapterCameraInfo, @Nullable AdapterCameraInfo adapterCameraInfo2) {
        return INSTANCE.fromAdapterInfos(adapterCameraInfo, adapterCameraInfo2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final List<String> getCameraIds() {
        return this.cameraIds;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final Identifier getCompatibilityId() {
        return this.compatibilityId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final String getInternalId() {
        Preconditions.checkState(this.cameraIds.size() == 1, "getInternalId() is only available for single-camera identifiers.");
        return (String) CollectionsKt.first((List) this.cameraIds);
    }

    public int hashCode() {
        int iHashCode = this.cameraIds.hashCode() * 31;
        Identifier identifier = this.compatibilityId;
        return iHashCode + (identifier != null ? identifier.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0034  */
    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CameraIdentifier{cameraIds=");
        sb2.append(CollectionsKt.joinToString$default(this.cameraIds, ",", null, null, 0, null, null, 62, null));
        Identifier identifier = this.compatibilityId;
        if (identifier != null) {
            str = ", compatId=" + identifier;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final CameraIdentifier create(@NotNull String str, @Nullable String str2, @Nullable Identifier identifier) {
        return INSTANCE.create(str, str2, identifier);
    }

    public final boolean isOf(@NotNull CameraInfo cameraInfo) {
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
        Preconditions.checkNotNull(cameraInfo);
        return Intrinsics.areEqual(this, cameraInfo.getCameraIdentifier());
    }

    @JvmStatic
    @VisibleForTesting
    @NotNull
    @JvmOverloads
    public static final CameraIdentifier create(@NotNull List<String> list) {
        return INSTANCE.create(list);
    }

    @JvmStatic
    @VisibleForTesting
    @NotNull
    @JvmOverloads
    public static final CameraIdentifier create(@NotNull List<String> list, @Nullable Identifier identifier) {
        return INSTANCE.create(list, identifier);
    }
}
