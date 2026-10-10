package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.Identifier;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public interface CameraFilter {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Identifier DEFAULT_ID = Identifier.create(new Object());

    List<CameraInfo> filter(List<CameraInfo> list);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default Identifier getIdentifier() {
        return DEFAULT_ID;
    }
}
