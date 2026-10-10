package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class CameraFilters {
    public static final CameraFilter ANY = new CameraFilter() { // from class: androidx.camera.core.impl.e
        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            return CameraFilters.m1938a(list);
        }
    };
    public static final CameraFilter NONE = new CameraFilter() { // from class: androidx.camera.core.impl.f
        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            return Collections.EMPTY_LIST;
        }
    };

    private CameraFilters() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m1938a(List list) {
        return list;
    }
}
