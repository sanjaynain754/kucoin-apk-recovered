package jumio.camerax;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.RggbChannelVector;
import android.util.Range;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.SurfaceOrientedMeteringPointFactory;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import com.jumio.commons.camera.CaptureSettings;
import com.jumio.commons.camera.ExposureLevel;
import com.jumio.commons.camera.LensDistance;
import com.jumio.commons.camera.MeteringConfig;
import com.jumio.commons.camera.WhiteBalance;
import com.jumio.commons.log.Log;
import com.jumio.core.enums.FlashState;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import jumio.camerax.C40494t;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Triple;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.camerax.t */
/* JADX INFO: loaded from: classes61.dex */
public final class C40494t implements InterfaceC40480f {

    /* JADX INFO: renamed from: a */
    public final Camera f89885a;

    /* JADX INFO: renamed from: b */
    public int f89886b;

    /* JADX INFO: renamed from: c */
    public C40492r f89887c = new C40492r(0, 0, 0.0f, 4, 0.0f, null, null, FlashState.UNAVAILABLE);

    /* JADX INFO: renamed from: d */
    public CaptureSettings f89888d = new CaptureSettings(null, null, null, 7, null);

    /* JADX INFO: renamed from: e */
    public boolean f89889e;

    /* JADX INFO: renamed from: a */
    public final void m89140a(boolean z11, Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        CameraInfo cameraInfo = this.f89885a.getCameraInfo();
        if (!(cameraInfo != null ? cameraInfo.hasFlashUnit() : false)) {
            this.f89889e = false;
            return;
        }
        CameraControl cameraControl = this.f89885a.getCameraControl();
        final ListenableFuture<Void> listenableFutureEnableTorch = cameraControl != null ? cameraControl.enableTorch(z11) : null;
        if (listenableFutureEnableTorch != null) {
            listenableFutureEnableTorch.addListener(new Runnable() { // from class: kg0.e
                @Override // java.lang.Runnable
                public final void run() {
                    C40494t.m89131a(listenableFutureEnableTorch, this);
                }
            }, executor);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89142c() {
        CameraInfo cameraInfo;
        Camera2CameraInfo camera2CameraInfoFrom;
        try {
            Camera camera = this.f89885a;
            if (camera != null && (cameraInfo = camera.getCameraInfo()) != null && (camera2CameraInfoFrom = Camera2CameraInfo.from(cameraInfo)) != null) {
                Boolean bool = (Boolean) camera2CameraInfoFrom.getCameraCharacteristic(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Boolean bool2 = (Boolean) camera2CameraInfoFrom.getCameraCharacteristic(CameraCharacteristics.CONTROL_AWB_LOCK_AVAILABLE);
                return zBooleanValue && (bool2 != null ? bool2.booleanValue() : false);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String[] m89141b() {
        CameraInfo cameraInfo;
        Camera camera = this.f89885a;
        if (camera != null && (cameraInfo = camera.getCameraInfo()) != null) {
            ArrayList arrayList = new ArrayList();
            int[] iArr = (int[]) Camera2CameraInfo.from(cameraInfo).getCameraCharacteristic(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr != null) {
                for (int i11 : iArr) {
                    switch (i11) {
                        case 2:
                            arrayList.add("incandescent");
                            break;
                        case 3:
                            arrayList.add("fluorescent");
                            break;
                        case 4:
                            arrayList.add("warm-fluorescent");
                            break;
                        case 5:
                            arrayList.add("daylight");
                            break;
                        case 6:
                            arrayList.add("cloudy-daylight");
                            break;
                        case 7:
                            arrayList.add("twilight");
                            break;
                        case 8:
                            arrayList.add("shade");
                            break;
                    }
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (strArr != null) {
                return strArr;
            }
        }
        return new String[0];
    }

    /* JADX INFO: renamed from: d */
    public final boolean m89143d() {
        CameraControl cameraControl;
        Camera camera = this.f89885a;
        if (camera != null && (cameraControl = camera.getCameraControl()) != null) {
            try {
                Camera2CameraControl camera2CameraControlFrom = Camera2CameraControl.from(cameraControl);
                Intrinsics.checkNotNullExpressionValue(camera2CameraControlFrom, "from(...)");
                Boolean bool = (Boolean) camera2CameraControlFrom.getCaptureRequestOptions().getCaptureRequestOption(CaptureRequest.CONTROL_AE_LOCK);
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Boolean bool2 = (Boolean) camera2CameraControlFrom.getCaptureRequestOptions().getCaptureRequestOption(CaptureRequest.CONTROL_AWB_LOCK);
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                if (zBooleanValue && zBooleanValue2) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public C40494t(Camera camera) {
        this.f89885a = camera;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX INFO: renamed from: e */
    public final boolean m89144e() {
        boolean zBooleanValue;
        CameraInfo cameraInfo;
        Boolean boolValueOf;
        boolean z11;
        if (!AbstractC40496v.m89145a().contains(Integer.valueOf(m89132a()))) {
            Camera camera = this.f89885a;
            if (camera != null && (cameraInfo = camera.getCameraInfo()) != null) {
                int[] iArr = (int[]) Camera2CameraInfo.from(cameraInfo).getCameraCharacteristic(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
                if (iArr != null) {
                    if (iArr.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolValueOf = Boolean.valueOf(!z11);
                } else {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    zBooleanValue = boolValueOf.booleanValue();
                } else {
                    zBooleanValue = false;
                }
            } else {
                zBooleanValue = false;
            }
            if (!zBooleanValue) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final int m89132a() {
        CameraInfo cameraInfo;
        Integer num;
        Camera camera = this.f89885a;
        if (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (num = (Integer) Camera2CameraInfo.from(cameraInfo).getCameraCharacteristic(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX INFO: renamed from: a */
    public static final void m89131a(ListenableFuture listenableFuture, C40494t c40494t) {
        boolean z11;
        CameraInfo cameraInfo;
        LiveData<Integer> torchState;
        try {
            listenableFuture.get();
        } catch (Exception e11) {
            Log.m14466d("DefaultCameraX", e11);
        }
        Camera camera = c40494t.f89885a;
        Integer value = (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (torchState = cameraInfo.getTorchState()) == null) ? null : torchState.getValue();
        if (value != null) {
            z11 = value.intValue() == 1;
        }
        c40494t.f89889e = z11;
    }

    /* JADX INFO: renamed from: a */
    public final void m89138a(MeteringConfig meteringConfig) {
        CameraControl cameraControl;
        Intrinsics.checkNotNullParameter(meteringConfig, "meteringConfig");
        try {
            Camera camera = this.f89885a;
            if (camera == null || (cameraControl = camera.getCameraControl()) == null) {
                return;
            }
            Triple triple = AbstractC40496v.f89891a;
            MeteringPoint meteringPointCreatePoint = new SurfaceOrientedMeteringPointFactory(meteringConfig.getMeteringPoint().getWidth(), meteringConfig.getMeteringPoint().getHeight()).createPoint(meteringConfig.getMeteringPoint().getX(), meteringConfig.getMeteringPoint().getY());
            Intrinsics.checkNotNullExpressionValue(meteringPointCreatePoint, "createPoint(...)");
            int i11 = meteringConfig.getMeteringMode().getAe() ? 2 : 0;
            if (meteringConfig.getMeteringMode().getAf()) {
                i11 |= 1;
            }
            if (meteringConfig.getMeteringMode().getAwb()) {
                i11 |= 4;
            }
            FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(meteringPointCreatePoint, i11);
            builder.disableAutoCancel();
            cameraControl.startFocusAndMetering(builder.build());
        } catch (CameraInfoUnavailableException e11) {
            Log.m14485w("DefaultCameraX", "Cannot access camera", e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m89139a(boolean z11) {
        CameraControl cameraControl;
        Camera camera = this.f89885a;
        if (camera == null || (cameraControl = camera.getCameraControl()) == null) {
            return;
        }
        Camera2CameraControl camera2CameraControlFrom = Camera2CameraControl.from(cameraControl);
        Intrinsics.checkNotNullExpressionValue(camera2CameraControlFrom, "from(...)");
        CaptureRequestOptions captureRequestOptionsBuild = new CaptureRequestOptions.Builder().setCaptureRequestOption(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(z11)).setCaptureRequestOption(CaptureRequest.CONTROL_AWB_LOCK, Boolean.valueOf(z11)).build();
        Intrinsics.checkNotNullExpressionValue(captureRequestOptionsBuild, "build(...)");
        camera2CameraControlFrom.setCaptureRequestOptions(captureRequestOptionsBuild);
    }

    /* JADX INFO: renamed from: a */
    public final void m89137a(CaptureSettings settings, C40492r captureData) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(captureData, "captureData");
        Camera camera = this.f89885a;
        if (settings.getF13525d()) {
            this.f89886b = camera.getCameraInfo().getExposureState().getExposureCompensationIndex();
            this.f89887c = captureData;
        }
        if (Intrinsics.areEqual(this.f89888d, settings)) {
            return;
        }
        this.f89888d = settings;
        try {
            Camera2CameraInfo camera2CameraInfoFrom = Camera2CameraInfo.from(camera.getCameraInfo());
            Intrinsics.checkNotNullExpressionValue(camera2CameraInfoFrom, "from(...)");
            Camera2CameraControl camera2CameraControlFrom = Camera2CameraControl.from(camera.getCameraControl());
            Intrinsics.checkNotNullExpressionValue(camera2CameraControlFrom, "from(...)");
            CaptureRequestOptions.Builder builder = new CaptureRequestOptions.Builder();
            Integer num = (Integer) camera2CameraInfoFrom.getCameraCharacteristic(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (AbstractC40496v.m89145a().contains(Integer.valueOf(num != null ? num.intValue() : 0))) {
                m89133a(camera2CameraInfoFrom, builder, settings.getLevel());
                m89135a(builder, settings.getWhiteBalance());
                m89134a(camera2CameraInfoFrom, builder, settings.getDistance());
            } else {
                m89136a(camera, settings.getLevel());
                m89130a(camera2CameraInfoFrom, builder, settings.getWhiteBalance());
            }
            Intrinsics.checkNotNull(camera2CameraControlFrom.setCaptureRequestOptions(builder.build()));
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m89136a(Camera camera, ExposureLevel exposureLevel) {
        Integer numValueOf;
        if (camera.getCameraInfo().getExposureState().isExposureCompensationSupported()) {
            Range<Integer> exposureCompensationRange = camera.getCameraInfo().getExposureState().getExposureCompensationRange();
            Intrinsics.checkNotNullExpressionValue(exposureCompensationRange, "getExposureCompensationRange(...)");
            int i11 = AbstractC40493s.f89882a[exposureLevel.ordinal()];
            if (i11 == 1 || i11 == 2) {
                numValueOf = Integer.valueOf(this.f89886b);
            } else if (i11 == 3) {
                numValueOf = (Integer) exposureCompensationRange.getLower();
            } else if (i11 == 4) {
                numValueOf = (Integer) exposureCompensationRange.getUpper();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (exposureCompensationRange.contains(numValueOf)) {
                CameraControl cameraControl = camera.getCameraControl();
                Intrinsics.checkNotNull(numValueOf);
                cameraControl.setExposureCompensationIndex(numValueOf.intValue());
                Log.m14463d("DefaultCameraX", "Exposure Value: " + (camera.getCameraInfo().getExposureState().getExposureCompensationStep().floatValue() * numValueOf.intValue()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m89133a(Camera2CameraInfo camera2CameraInfo, CaptureRequestOptions.Builder builder, ExposureLevel exposureLevel) {
        int i11;
        Number number;
        Long lValueOf;
        Range range = (Range) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        int i12 = AbstractC40493s.f89882a[exposureLevel.ordinal()];
        Number numberValueOf = null;
        if (i12 != 1) {
            i11 = 0;
            if (i12 == 2) {
                numberValueOf = Integer.valueOf(this.f89887c.f89875b);
                lValueOf = Long.valueOf(this.f89887c.f89874a);
            } else if (i12 == 3) {
                numberValueOf = range != null ? (Integer) range.getLower() : null;
                lValueOf = Long.valueOf((long) (this.f89887c.f89874a * 0.01f));
            } else if (i12 == 4) {
                numberValueOf = range != null ? (Integer) range.getUpper() : null;
                lValueOf = Long.valueOf((long) (this.f89887c.f89874a * 3.0f));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Number number2 = numberValueOf;
            numberValueOf = lValueOf;
            number = number2;
        } else {
            i11 = 1;
            number = null;
        }
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(i11));
        if (numberValueOf != null) {
            builder.setCaptureRequestOption(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(numberValueOf.longValue()));
        }
        if (number != null) {
            builder.setCaptureRequestOption(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf(number.intValue()));
        }
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m89135a(CaptureRequestOptions.Builder builder, WhiteBalance whiteBalance) {
        Triple triple;
        int i11 = AbstractC40493s.f89883b[whiteBalance.ordinal()];
        if (i11 == 1) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AWB_MODE, 1);
            return;
        }
        if (i11 != 2) {
            Triple triple2 = AbstractC40496v.f89891a;
            switch (AbstractC40495u.f89890a[whiteBalance.ordinal()]) {
                case 1:
                    triple = AbstractC40496v.f89892b;
                    break;
                case 2:
                    triple = AbstractC40496v.f89893c;
                    break;
                case 3:
                    triple = AbstractC40496v.f89894d;
                    break;
                case 4:
                    triple = AbstractC40496v.f89895e;
                    break;
                case 5:
                    triple = AbstractC40496v.f89896f;
                    break;
                case 6:
                    triple = AbstractC40496v.f89897g;
                    break;
                default:
                    triple = AbstractC40496v.f89891a;
                    break;
            }
            float f11 = 256;
            float fFloatValue = ((Number) triple.getFirst()).floatValue() * f11;
            float fFloatValue2 = ((Number) triple.getSecond()).floatValue() * f11;
            float fFloatValue3 = ((Number) triple.getThird()).floatValue() * f11;
            int[] iArr = {256, 256, 0, 256, 0, 256, 0, 256, 256, 256, 0, 256, 0, 256, 0, 256, 256, 256};
            iArr[0] = (int) fFloatValue;
            iArr[8] = (int) fFloatValue2;
            iArr[16] = (int) fFloatValue3;
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AWB_MODE, 0).setCaptureRequestOption(CaptureRequest.COLOR_CORRECTION_MODE, 0).setCaptureRequestOption(CaptureRequest.COLOR_CORRECTION_TRANSFORM, new ColorSpaceTransform(iArr));
            return;
        }
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AWB_MODE, 0).setCaptureRequestOption(CaptureRequest.COLOR_CORRECTION_MODE, 0);
        RggbChannelVector rggbChannelVector = this.f89887c.f89880g;
        if (rggbChannelVector != null) {
            builder.setCaptureRequestOption(CaptureRequest.COLOR_CORRECTION_GAINS, rggbChannelVector);
        }
        ColorSpaceTransform colorSpaceTransform = this.f89887c.f89879f;
        if (colorSpaceTransform != null) {
            builder.setCaptureRequestOption(CaptureRequest.COLOR_CORRECTION_TRANSFORM, colorSpaceTransform);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public static void m89130a(Camera2CameraInfo camera2CameraInfo, CaptureRequestOptions.Builder builder, WhiteBalance whiteBalance) {
        ?? ListOf;
        int iIntValue = 1;
        Object obj = 1;
        int[] iArr = (int[]) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
            ListOf = new ArrayList();
            for (int i11 : iArr) {
                if (i11 != 1 && i11 != 0) {
                    ListOf.add(Integer.valueOf(i11));
                }
            }
        } else {
            ListOf = CollectionsKt.listOf(obj);
        }
        switch (AbstractC40493s.f89883b[whiteBalance.ordinal()]) {
            case 1:
            case 2:
                break;
            case 3:
                iIntValue = ((Number) (ListOf.size() > 0 ? ListOf.get(0) : 1)).intValue();
                break;
            case 4:
                int size = 1 % ListOf.size();
                if (size >= 0 && size < ListOf.size()) {
                    obj = ListOf.get(size);
                }
                iIntValue = ((Number) obj).intValue();
                break;
            case 5:
                int size2 = 2 % ListOf.size();
                if (size2 >= 0 && size2 < ListOf.size()) {
                    obj = ListOf.get(size2);
                }
                iIntValue = ((Number) obj).intValue();
                break;
            case 6:
                int size3 = 3 % ListOf.size();
                if (size3 >= 0 && size3 < ListOf.size()) {
                    obj = ListOf.get(size3);
                }
                iIntValue = ((Number) obj).intValue();
                break;
            case 7:
                int size4 = 4 % ListOf.size();
                if (size4 >= 0 && size4 < ListOf.size()) {
                    obj = ListOf.get(size4);
                }
                iIntValue = ((Number) obj).intValue();
                break;
            case 8:
                int size5 = 5 % ListOf.size();
                if (size5 >= 0 && size5 < ListOf.size()) {
                    obj = ListOf.get(size5);
                }
                iIntValue = ((Number) obj).intValue();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(iIntValue));
    }

    /* JADX INFO: renamed from: a */
    public final void m89134a(Camera2CameraInfo camera2CameraInfo, CaptureRequestOptions.Builder builder, LensDistance lensDistance) {
        Float fValueOf;
        float f11;
        int[] iArr = (int[]) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        int i11 = 0;
        if (iArr == null) {
            iArr = new int[0];
        }
        int[] iArr2 = AbstractC40493s.f89884c;
        int i12 = iArr2[lensDistance.ordinal()];
        if (i12 == 3) {
            int i13 = this.f89887c.f89877d;
            if (ArraysKt.contains(iArr, i13)) {
                i11 = i13;
            } else if (ArraysKt.contains(iArr, 4)) {
                i11 = 4;
            } else if (ArraysKt.contains(iArr, 3)) {
                i11 = 3;
            } else if (ArraysKt.contains(iArr, 1)) {
                i11 = 1;
            }
            fValueOf = null;
        } else if (i12 != 4) {
            int i14 = iArr2[lensDistance.ordinal()];
            if (i14 != 1) {
                f11 = i14 != 2 ? 1.0f : 4.0f;
            } else {
                f11 = 2.0f;
            }
            fValueOf = Float.valueOf(f11 * this.f89887c.f89878e);
        } else {
            fValueOf = Float.valueOf(this.f89887c.f89878e);
        }
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i11));
        if (fValueOf != null) {
            builder.setCaptureRequestOption(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(fValueOf.floatValue()));
        }
        if (i11 == 1) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        }
    }
}
