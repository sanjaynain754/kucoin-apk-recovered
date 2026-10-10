package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.camera2.internal.Camera2EncoderProfilesProvider;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.quirk.CameraQuirks;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.internal.utils.SizeUtil;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: EncoderProfilesProviderFallback.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BA\u00128\b\u0002\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\f\u0010\u0016\u001a\u00020\u0011*\u00020\u0013H\u0002J\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u0013H\u0002R>\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Landroidx/camera/camera2/internal/compat/workaround/EncoderProfilesProviderFallback;", "", "providerFactory", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "cameraId", "Landroidx/camera/core/impl/Quirks;", "quirks", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "resolveProvider", "cameraManager", "Landroidx/camera/camera2/internal/compat/CameraManagerCompat;", "needFallback", "", "characteristics", "Landroidx/camera/camera2/internal/compat/CameraCharacteristicsCompat;", "provider", "findProviderWithLargestSize", "isExternalCamera", "getPrivateFormatSizes", "", "Landroid/util/Size;", "camera-camera2_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEncoderProfilesProviderFallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EncoderProfilesProviderFallback.kt\nandroidx/camera/camera2/internal/compat/workaround/EncoderProfilesProviderFallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
public final class EncoderProfilesProviderFallback {

    @NotNull
    private final Function2<String, Quirks, EncoderProfilesProvider> providerFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public EncoderProfilesProviderFallback() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final EncoderProfilesProvider findProviderWithLargestSize(CameraManagerCompat cameraManager) throws CameraAccessExceptionCompat {
        Object objM103844constructorimpl;
        List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(cameraManager.getCameraIdList());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        EncoderProfilesProvider encoderProfilesProvider = null;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String[] strArr = (String[]) objM103844constructorimpl;
        if (strArr == null) {
            return null;
        }
        int i11 = 0;
        for (String str : strArr) {
            CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManager.getCameraCharacteristicsCompat(str);
            Intrinsics.checkNotNullExpressionValue(cameraCharacteristicsCompat, "getCameraCharacteristicsCompat(...)");
            Quirks quirks = CameraQuirks.get(str, cameraCharacteristicsCompat);
            Intrinsics.checkNotNullExpressionValue(quirks, "get(...)");
            Function2<String, Quirks, EncoderProfilesProvider> function2 = this.providerFactory;
            Intrinsics.checkNotNull(str);
            EncoderProfilesProvider encoderProfilesProviderInvoke = function2.invoke(str, quirks);
            EncoderProfilesProxy all = encoderProfilesProviderInvoke.getAll(1);
            int area = (all == null || (videoProfiles = all.getVideoProfiles()) == null || (videoProfileProxy = (EncoderProfilesProxy.VideoProfileProxy) CollectionsKt.firstOrNull((List) videoProfiles)) == null) ? 0 : SizeUtil.getArea(videoProfileProxy.getWidth(), videoProfileProxy.getHeight());
            if (area > i11) {
                encoderProfilesProvider = encoderProfilesProviderInvoke;
                i11 = area;
            }
        }
        return encoderProfilesProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EncoderProfilesProviderFallback(@NotNull Function2<? super String, ? super Quirks, ? extends EncoderProfilesProvider> providerFactory) {
        Intrinsics.checkNotNullParameter(providerFactory, "providerFactory");
        this.providerFactory = providerFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Camera2EncoderProfilesProvider _init_$lambda$0(String cameraId, Quirks quirks) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(quirks, "quirks");
        return new Camera2EncoderProfilesProvider(cameraId, quirks);
    }

    private final boolean isExternalCamera(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING);
        return num != null && num.intValue() == 2;
    }

    @NotNull
    public final EncoderProfilesProvider resolveProvider(@NotNull String cameraId, @NotNull Quirks quirks, @NotNull CameraManagerCompat cameraManager) throws CameraAccessExceptionCompat {
        EncoderProfilesProvider encoderProfilesProviderFindProviderWithLargestSize;
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(quirks, "quirks");
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManager.getCameraCharacteristicsCompat(cameraId);
        Intrinsics.checkNotNullExpressionValue(cameraCharacteristicsCompat, "getCameraCharacteristicsCompat(...)");
        EncoderProfilesProvider encoderProfilesProviderInvoke = this.providerFactory.invoke(cameraId, quirks);
        if (needFallback(cameraCharacteristicsCompat, encoderProfilesProviderInvoke)) {
            encoderProfilesProviderFindProviderWithLargestSize = findProviderWithLargestSize(cameraManager);
            if (encoderProfilesProviderFindProviderWithLargestSize != null) {
                encoderProfilesProviderFindProviderWithLargestSize = new SizeFilteredEncoderProfilesProvider(encoderProfilesProviderFindProviderWithLargestSize, getPrivateFormatSizes(cameraCharacteristicsCompat));
            }
        } else {
            encoderProfilesProviderFindProviderWithLargestSize = null;
        }
        return encoderProfilesProviderFindProviderWithLargestSize == null ? encoderProfilesProviderInvoke : encoderProfilesProviderFindProviderWithLargestSize;
    }

    private final List<Size> getPrivateFormatSizes(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        List<Size> list;
        Size[] outputSizes = cameraCharacteristicsCompat.getStreamConfigurationMapCompat().getOutputSizes(34);
        if (outputSizes != null && (list = ArraysKt.toList(outputSizes)) != null) {
            return list;
        }
        return CollectionsKt.emptyList();
    }

    private final boolean needFallback(CameraCharacteristicsCompat characteristics, EncoderProfilesProvider provider) {
        if (isExternalCamera(characteristics) && !provider.hasProfile(1)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ EncoderProfilesProviderFallback(Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Function2() { // from class: androidx.camera.camera2.internal.compat.workaround.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EncoderProfilesProviderFallback._init_$lambda$0((String) obj, (Quirks) obj2);
            }
        } : function2);
    }
}
