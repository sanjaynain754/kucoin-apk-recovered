package jumio.core;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.core.processor.ImageProcessorInterface;
import com.jumio.core.processor.ProcessorParameterInterface;
import com.jumio.core.processor.ProcessorState;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.o2 */
/* JADX INFO: loaded from: classes61.dex */
public interface InterfaceC40705o2 extends ImageProcessorInterface {
    @Override // com.jumio.core.processor.ImageProcessorInterface, com.jumio.core.processor.CornerPointImageProcessorInterface
    default ProcessorState process(Bitmap bitmap, CameraSettings cameraSettings, Rect extractionArea, Frame.Metadata metadata, ProcessorParameterInterface parameterInterface) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(parameterInterface, "parameterInterface");
        C40710p2 c40710p2 = parameterInterface instanceof C40710p2 ? (C40710p2) parameterInterface : null;
        return process(bitmap, cameraSettings, extractionArea, metadata, c40710p2 != null ? c40710p2.f90354a : false);
    }

    ProcessorState process(Bitmap bitmap, CameraSettings cameraSettings, Rect rect, Frame.Metadata metadata, boolean z11);
}
