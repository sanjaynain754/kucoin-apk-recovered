package jumio.core;

import com.jumio.core.data.UploadType;
import com.jumio.core.models.ScanPartModel;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.A3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40505A3 {
    /* JADX INFO: renamed from: a */
    public static final String m89147a(ScanPartModel scanPartModel) {
        Intrinsics.checkNotNullParameter(scanPartModel, "<this>");
        int i11 = AbstractC40761z3.f90514b[scanPartModel.getF14312a().ordinal()];
        if (i11 == 2) {
            return UploadType.FACE;
        }
        if (i11 == 3) {
            return UploadType.BACKSIDE;
        }
        if (i11 != 4) {
            return i11 != 5 ? UploadType.FRONTSIDE : UploadType.DOCUMENT;
        }
        int i12 = AbstractC40761z3.f90513a[scanPartModel.getF14313b().ordinal()];
        return (i12 == 1 || i12 == 2) ? UploadType.JUMIO_LIVENESS : UploadType.FACE;
    }
}
