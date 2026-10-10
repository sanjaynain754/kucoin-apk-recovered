package jumio.liveness;

import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.FileUtil;
import com.jumio.core.MobileContext;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.core.constants.ConstantsKt;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.scan.FileData;
import com.jumio.core.environment.Environment;
import com.jumio.core.models.LivenessSettingsModel;
import com.jumio.core.sensors.LightSensorKt;
import com.jumio.liveness.DaClient2;
import com.jumio.liveness.PhotinusConfigurations;
import com.jumio.liveness.PoseCheckConfigurations;
import com.jumio.liveness.PremiumLivenessConfigurations;
import com.jumio.liveness.StandardLivenessConfigurations;
import com.jumio.liveness.image.LivenessImageData;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jumio.liveness.p */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40799p {
    /* JADX INFO: renamed from: a */
    public static final StandardLivenessConfigurations m89297a(C40773B c40773b) {
        String str;
        if (c40773b.f90573f != ScanMode.JUMIO_PREMIUM || (str = c40773b.f90574g) == null) {
            LivenessSettingsModel livenessSettingsModel = c40773b.f90569b;
            boolean z11 = c40773b.f90571d;
            return new StandardLivenessConfigurations((float) (z11 ? livenessSettingsModel.getPortrait() : livenessSettingsModel.getLandscape()).getF14283a(), (float) livenessSettingsModel.getRequiredDistanceMovementRatio(), (float) (z11 ? livenessSettingsModel.getPortrait() : livenessSettingsModel.getLandscape()).getF14284b(), (float) (z11 ? livenessSettingsModel.getPortrait() : livenessSettingsModel.getLandscape()).getF14285c(), -1.0f, (int) livenessSettingsModel.getDelayBetweenDistanceInMs(), new PoseCheckConfigurations(livenessSettingsModel.getMinimumPitch(), livenessSettingsModel.getMaximumPitch(), livenessSettingsModel.getMinimumYaw(), livenessSettingsModel.getMaximumYaw(), (float) livenessSettingsModel.getMaxFaceCenterDifference()));
        }
        LivenessSettingsModel livenessSettingsModel2 = c40773b.f90569b;
        boolean z12 = c40773b.f90571d;
        return new PremiumLivenessConfigurations((float) (z12 ? livenessSettingsModel2.getPortrait() : livenessSettingsModel2.getLandscape()).getF14283a(), (float) livenessSettingsModel2.getRequiredDistanceMovementRatio(), (float) (z12 ? livenessSettingsModel2.getPortrait() : livenessSettingsModel2.getLandscape()).getF14284b(), (float) (z12 ? livenessSettingsModel2.getPortrait() : livenessSettingsModel2.getLandscape()).getF14285c(), -1.0f, (int) livenessSettingsModel2.getDelayBetweenDistanceInMs(), new PoseCheckConfigurations(livenessSettingsModel2.getMinimumPitch(), livenessSettingsModel2.getMaximumPitch(), livenessSettingsModel2.getMinimumYaw(), livenessSettingsModel2.getMaximumYaw(), (float) livenessSettingsModel2.getMaxFaceCenterDifference()), new PhotinusConfigurations(str, livenessSettingsModel2.getHardwareLatency()));
    }

    /* JADX INFO: renamed from: a */
    public static final ImageData[] m89298a(DaClient2.Event event, MobileContext context, ConcurrentHashMap concurrentHashMap) {
        String str;
        Intrinsics.checkNotNullParameter(event, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        Object obj = event.get("best_image");
        String str2 = obj instanceof String ? (String) obj : null;
        Pair<String, Object>[] attributes = event.getAttributes();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, Object> pair : attributes) {
            if (new Regex("^liveness_[0-9]+$").matches(pair.getFirst())) {
                arrayList2.add(pair);
            }
        }
        for (Pair pair2 : CollectionsKt.sortedWith(arrayList2, new C40798o())) {
            Object obj2 = event.get(((String) pair2.getFirst()) + "_type");
            String str3 = obj2 instanceof String ? (String) obj2 : null;
            if (str3 != null) {
                Object second = pair2.getSecond();
                ByteBuffer byteBuffer = second instanceof ByteBuffer ? (ByteBuffer) second : null;
                if (byteBuffer != null) {
                    try {
                        Log.m14477v("Adding " + ((String) pair2.getFirst()));
                        Object obj3 = event.get(((String) pair2.getFirst()) + "_timestamp");
                        String str4 = obj3 instanceof String ? (String) obj3 : null;
                        long j11 = str4 != null ? Long.parseLong(str4) : System.currentTimeMillis();
                        File file = new File(Environment.INSTANCE.getDataDirectory(context), ConstantsKt.TEMP_FILE_PREFIX + j11 + StringsKt.removePrefix((String) pair2.getFirst(), (CharSequence) "liveness"));
                        FileUtil.INSTANCE.saveToFile(byteBuffer, file, context.getSessionKey());
                        LivenessImageData livenessImageData = new LivenessImageData();
                        String absolutePath = file.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                        livenessImageData.setData(absolutePath);
                        livenessImageData.setMimeType(str3);
                        if (Intrinsics.areEqual(str3, "image/webp")) {
                            str = ConstantsKt.FILE_TYPE_WEBP;
                        } else {
                            str = Intrinsics.areEqual(str3, "image/jpeg") ? ConstantsKt.FILE_TYPE_JPEG : "";
                        }
                        livenessImageData.setFileType(str);
                        livenessImageData.setBestSelfie(Intrinsics.areEqual(pair2.getFirst(), str2));
                        livenessImageData.setTimestamp(Long.valueOf(j11));
                        livenessImageData.setCameraConnectionData(concurrentHashMap != null ? (CameraConnectionData) concurrentHashMap.get(Long.valueOf(j11)) : null);
                        arrayList.add(livenessImageData);
                    } catch (Exception e11) {
                        Log.printStackTrace(e11);
                    }
                }
            }
        }
        return (ImageData[]) arrayList.toArray(new ImageData[0]);
    }

    /* JADX INFO: renamed from: a */
    public static final FileData m89296a(DaClient2.Event event, MobileContext context) {
        Intrinsics.checkNotNullParameter(event, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object obj = event.get("liveness_blob");
        ByteBuffer byteBuffer = obj instanceof ByteBuffer ? (ByteBuffer) obj : null;
        if (byteBuffer == null) {
            return null;
        }
        File file = new File(Environment.INSTANCE.getDataDirectory(context), ConstantsKt.TEMP_FILE_PREFIX + jCurrentTimeMillis);
        FileUtil.INSTANCE.saveToFile(byteBuffer, file, context.getSessionKey());
        FileData fileData = new FileData();
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        fileData.setData(absolutePath);
        fileData.setMimeType(ConstantsKt.MIME_TYPE_OCTET_STREAM);
        fileData.setFileType(ConstantsKt.FILE_TYPE_DAT);
        fileData.setTimestamp(Long.valueOf(jCurrentTimeMillis));
        return fileData;
    }

    /* JADX INFO: renamed from: a */
    public static final Pair[] m89299a(Frame.Metadata metadata, float f11) {
        ArrayList arrayList = new ArrayList();
        if (metadata.getIso() != 0) {
            arrayList.add(TuplesKt.m90091to("iso", String.valueOf(metadata.getIso())));
        }
        if (metadata.getShutterSpeed() != 0) {
            arrayList.add(TuplesKt.m90091to("exposure_time", String.valueOf(metadata.getShutterSpeed() / 1.0E9f)));
        }
        if (metadata.getAperture() != 0.0f) {
            arrayList.add(TuplesKt.m90091to("f_number", String.valueOf(metadata.getAperture())));
        }
        if (f11 != LightSensorKt.getLIGHT_SENSOR_DEFAULT_VALUE()[0]) {
            arrayList.add(TuplesKt.m90091to("lux", String.valueOf(f11)));
        }
        return (Pair[]) arrayList.toArray(new Pair[0]);
    }
}
