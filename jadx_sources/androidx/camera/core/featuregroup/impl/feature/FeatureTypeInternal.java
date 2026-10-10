package androidx.camera.core.featuregroup.impl.feature;

import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: FeatureTypeInternal.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "", "<init>", "(Ljava/lang/String;I)V", "DYNAMIC_RANGE", "FPS_RANGE", "VIDEO_STABILIZATION", "IMAGE_FORMAT", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public enum FeatureTypeInternal {
    DYNAMIC_RANGE,
    FPS_RANGE,
    VIDEO_STABILIZATION,
    IMAGE_FORMAT;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<FeatureTypeInternal> getEntries() {
        return $ENTRIES;
    }
}
