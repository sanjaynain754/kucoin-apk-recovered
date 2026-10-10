package androidx.camera.core;

import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.LensFacingCameraFilter;
import androidx.core.util.Preconditions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public final class CameraSelector {
    public static final int LENS_FACING_BACK = 1;

    @ExperimentalLensFacing
    public static final int LENS_FACING_EXTERNAL = 2;
    public static final int LENS_FACING_FRONT = 0;
    public static final int LENS_FACING_UNKNOWN = -1;
    private final LinkedHashSet<CameraFilter> mCameraFilterSet;
    private final String mPhysicalCameraId;
    public static final CameraSelector DEFAULT_FRONT_CAMERA = new Builder().requireLensFacing(0).build();
    public static final CameraSelector DEFAULT_BACK_CAMERA = new Builder().requireLensFacing(1).build();

    public static final class Builder {
        private final LinkedHashSet<CameraFilter> mCameraFilterSet;
        private String mPhysicalCameraId;

        public Builder() {
            this.mCameraFilterSet = new LinkedHashSet<>();
        }

        public Builder requireLensFacing(int i11) {
            Preconditions.checkState(i11 != -1, "The specified lens facing is invalid.");
            this.mCameraFilterSet.add(new LensFacingCameraFilter(i11));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Builder fromSelector(CameraSelector cameraSelector) {
            return new Builder(cameraSelector.getCameraFilterSet());
        }

        public Builder addCameraFilter(CameraFilter cameraFilter) {
            this.mCameraFilterSet.add(cameraFilter);
            return this;
        }

        public CameraSelector build() {
            return new CameraSelector(this.mCameraFilterSet, this.mPhysicalCameraId);
        }

        public Builder setPhysicalCameraId(String str) {
            this.mPhysicalCameraId = str;
            return this;
        }

        private Builder(LinkedHashSet<CameraFilter> linkedHashSet) {
            this.mCameraFilterSet = new LinkedHashSet<>(linkedHashSet);
        }
    }

    @Target({ElementType.TYPE, ElementType.TYPE_USE, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @OptIn(markerClass = {ExperimentalLensFacing.class})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LensFacing {
    }

    public List<CameraInfo> filter(List<CameraInfo> list) {
        List<CameraInfo> arrayList = new ArrayList<>(list);
        Iterator<CameraFilter> it = this.mCameraFilterSet.iterator();
        while (it.hasNext()) {
            arrayList = it.next().filter(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m1843a(CameraIdentifier[] cameraIdentifierArr, List list) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (CameraIdentifier cameraIdentifier : cameraIdentifierArr) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CameraInfo cameraInfo = (CameraInfo) it.next();
                if (Objects.equals(cameraInfo.getCameraIdentifier(), cameraIdentifier) && !hashSet.contains(cameraIdentifier)) {
                    arrayList.add(cameraInfo);
                    hashSet.add(cameraIdentifier);
                    break;
                }
            }
        }
        return arrayList;
    }

    private String logCameras(Set<CameraInternal> set) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cams:");
        sb2.append(set.size());
        Iterator<CameraInternal> it = set.iterator();
        while (it.hasNext()) {
            CameraInfoInternal cameraInfoInternal = it.next().getCameraInfoInternal();
            sb2.append(String.format(" Id:%s  Lens:%s", cameraInfoInternal.getCameraId(), Integer.valueOf(cameraInfoInternal.getLensFacing())));
        }
        return sb2.toString();
    }

    private String logSelector() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("PhyId:%s  Filters:%s", this.mPhysicalCameraId, Integer.valueOf(this.mCameraFilterSet.size())));
        for (CameraFilter cameraFilter : this.mCameraFilterSet) {
            sb2.append(" Id:");
            sb2.append(cameraFilter.getIdentifier());
            if (cameraFilter instanceof LensFacingCameraFilter) {
                sb2.append(" LensFilter:");
                sb2.append(((LensFacingCameraFilter) cameraFilter).getLensFacing());
            }
        }
        return sb2.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: of */
    public static CameraSelector m1844of(final CameraIdentifier... cameraIdentifierArr) {
        if (cameraIdentifierArr == null || cameraIdentifierArr.length == 0) {
            throw new IllegalArgumentException("At least one CameraIdentifier must be provided.");
        }
        Builder builder = new Builder();
        builder.addCameraFilter(new CameraFilter() { // from class: androidx.camera.core.e
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                return CameraSelector.m1843a(cameraIdentifierArr, list);
            }
        });
        return builder.build();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public LinkedHashSet<CameraFilter> getCameraFilterSet() {
        return this.mCameraFilterSet;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Integer getLensFacing() {
        Integer num = null;
        for (CameraFilter cameraFilter : this.mCameraFilterSet) {
            if (cameraFilter instanceof LensFacingCameraFilter) {
                Integer numValueOf = Integer.valueOf(((LensFacingCameraFilter) cameraFilter).getLensFacing());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public String getPhysicalCameraId() {
        return this.mPhysicalCameraId;
    }

    public CameraSelector(LinkedHashSet<CameraFilter> linkedHashSet, String str) {
        this.mCameraFilterSet = linkedHashSet;
        this.mPhysicalCameraId = str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraInternal select(LinkedHashSet<CameraInternal> linkedHashSet) {
        Iterator<CameraInternal> it = filter(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException(String.format("No available camera can be found. %s %s", logCameras(linkedHashSet), logSelector()));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public LinkedHashSet<CameraInternal> filter(LinkedHashSet<CameraInternal> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<CameraInternal> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCameraInfo());
        }
        List<CameraInfo> listFilter = filter(arrayList);
        LinkedHashSet<CameraInternal> linkedHashSet2 = new LinkedHashSet<>();
        for (CameraInternal cameraInternal : linkedHashSet) {
            if (listFilter.contains(cameraInternal.getCameraInfo())) {
                linkedHashSet2.add(cameraInternal);
            }
        }
        return linkedHashSet2;
    }
}
