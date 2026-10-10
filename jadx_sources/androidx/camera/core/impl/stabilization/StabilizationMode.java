package androidx.camera.core.impl.stabilization;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StabilizationMode {
    public static final int OFF = 1;

    /* JADX INFO: renamed from: ON */
    public static final int f1691ON = 2;
    public static final int UNSPECIFIED = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Mode {
    }

    private StabilizationMode() {
    }
}
