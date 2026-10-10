package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CaptureBundles {

    public static final class CaptureBundleImpl implements CaptureBundle {
        final List<CaptureStage> mCaptureStageList;

        @Override // androidx.camera.core.impl.CaptureBundle
        public List<CaptureStage> getCaptureStages() {
            return this.mCaptureStageList;
        }

        public CaptureBundleImpl(List<CaptureStage> list) {
            if (list != null && !list.isEmpty()) {
                this.mCaptureStageList = Collections.unmodifiableList(new ArrayList(list));
                return;
            }
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }
    }

    public static CaptureBundle createCaptureBundle(CaptureStage... captureStageArr) {
        return new CaptureBundleImpl(Arrays.asList(captureStageArr));
    }

    public static CaptureBundle createCaptureBundle(List<CaptureStage> list) {
        return new CaptureBundleImpl(list);
    }

    public static CaptureBundle singleDefaultCaptureBundle() {
        return createCaptureBundle(new CaptureStage.DefaultCaptureStage());
    }

    private CaptureBundles() {
    }
}
