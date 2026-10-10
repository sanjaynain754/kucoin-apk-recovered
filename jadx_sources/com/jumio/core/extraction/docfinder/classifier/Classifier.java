package com.jumio.core.extraction.docfinder.classifier;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.jumio.commons.log.Log;
import com.jumio.core.cdn.CDNDecryptException;
import com.jumio.core.cdn.CDNEncryptedEntry;
import com.jumio.core.extraction.docfinder.DocFinderPlugin;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.Interpreter;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 ,2\u00020\u0001:\u0004)*+,B-\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0004J\u0006\u0010!\u001a\u00020\u001eJ\u0006\u0010\"\u001a\u00020\u001eJ\r\u0010#\u001a\u00020\u001cH\u0000¢\u0006\u0002\b$J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u0005H\u0002J\b\u0010(\u001a\u00020\u001eH$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001c8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/classifier/Classifier;", "", "tfliteModel", "Ljava/nio/ByteBuffer;", "numThreads", "", "inputImageSizeX", "inputImageSizeY", "<init>", "(Ljava/nio/ByteBuffer;III)V", "intValues", "", "tfliteOptions", "Lorg/tensorflow/lite/Interpreter$Options;", "inferenceCancelled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tflite", "Lorg/tensorflow/lite/Interpreter;", "imgData", "getImgData", "()Ljava/nio/ByteBuffer;", "setImgData", "(Ljava/nio/ByteBuffer;)V", "currentModelType", "Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;", "getCurrentModelType", "()Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;", "normalizeImages", "", "convertBitmapToByteBuffer", "", "bitmap", "Landroid/graphics/Bitmap;", "cancel", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "isActive", "isActive$jumio_docfinder_release", "numBytesPerChannel", "addPixelValue", "pixelValue", "runInference", "ModelType", "Device", "Recognition", "Companion", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nClassifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Classifier.kt\ncom/jumio/core/extraction/docfinder/classifier/Classifier\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,239:1\n29#2,3:240\n*S KotlinDebug\n*F\n+ 1 Classifier.kt\ncom/jumio/core/extraction/docfinder/classifier/Classifier\n*L\n221#1:240,3\n*E\n"})
public abstract class Classifier {
    public static final long DEFAULT_MODEL_INIT_TIMEOUT = 5000;
    private static final int DIM_BATCH_SIZE = 1;
    private static final int DIM_PIXEL_SIZE = 3;

    @Nullable
    private ByteBuffer imgData;

    @NotNull
    private AtomicBoolean inferenceCancelled;
    private final int inputImageSizeX;
    private final int inputImageSizeY;

    @NotNull
    private int[] intValues;

    @JvmField
    protected boolean normalizeImages;
    private final int numBytesPerChannel;

    @JvmField
    @Nullable
    protected Interpreter tflite;

    @NotNull
    private ByteBuffer tfliteModel;

    @NotNull
    private final Interpreter.Options tfliteOptions;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static String TAG = "Classifier";

    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "DIM_BATCH_SIZE", "", "DIM_PIXEL_SIZE", "DEFAULT_MODEL_INIT_TIMEOUT", "", "create", "Lcom/jumio/core/extraction/docfinder/classifier/Classifier;", "context", "Landroid/content/Context;", "cdnEncryptedEntry", "Lcom/jumio/core/cdn/CDNEncryptedEntry;", "numThreads", "modelInitTimeoutInMs", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final Classifier create(@NotNull Context context, @NotNull CDNEncryptedEntry cdnEncryptedEntry, int numThreads, long modelInitTimeoutInMs) throws CDNDecryptException, IOException {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cdnEncryptedEntry, "cdnEncryptedEntry");
            String str = Classifier.TAG;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            Log.m14474i(str, "creating classifier with model " + cdnEncryptedEntry.getFile() + " for type " + cdnEncryptedEntry.getName());
            ByteBuffer byteBufferLoad = cdnEncryptedEntry.load(context, modelInitTimeoutInMs);
            String name = cdnEncryptedEntry.getName();
            if (Intrinsics.areEqual(name, DocFinderPlugin.CORNER_DETECTION_MODEL)) {
                return new CornerDetectionClassifier(byteBufferLoad, numThreads, 0, 0, 12, null);
            }
            if (Intrinsics.areEqual(name, DocFinderPlugin.CLASSIFIER_MODEL)) {
                return new DocumentClassifier(byteBufferLoad, numThreads, 0, 0, 12, null);
            }
            throw new IOException("Unknown model " + cdnEncryptedEntry.getFile());
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.jumio.core.extraction.docfinder.classifier.Classifier$Device[], still in use, count: 1, list:
      (r0v1 com.jumio.core.extraction.docfinder.classifier.Classifier$Device[]) from 0x000d: INVOKE (r0v1 com.jumio.core.extraction.docfinder.classifier.Classifier$Device[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:16)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Device;", "", "<init>", "(Ljava/lang/String;I)V", "CPU", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Device {
        CPU;


        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ EnumEntries f14030b;

        static {
            f14030b = EnumEntriesKt.enumEntries(deviceArr);
        }

        public Device() {
            super("CPU", 0);
        }

        @NotNull
        public static EnumEntries<Device> getEntries() {
            return f14030b;
        }

        public static Device valueOf(String str) {
            return (Device) Enum.valueOf(Device.class, str);
        }

        public static Device[] values() {
            return (Device[]) f14029a.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.jumio.core.extraction.docfinder.classifier.Classifier$ModelType[], still in use, count: 1, list:
      (r0v1 com.jumio.core.extraction.docfinder.classifier.Classifier$ModelType[]) from 0x001a: INVOKE (r0v1 com.jumio.core.extraction.docfinder.classifier.Classifier$ModelType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:29)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;", "", "<init>", "(Ljava/lang/String;I)V", "CORNER_DETECTION", "CLASSIFICATION", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ModelType {
        CORNER_DETECTION,
        CLASSIFICATION;


        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ EnumEntries f14032b;

        static {
            f14032b = EnumEntriesKt.enumEntries(modelTypeArr);
        }

        @NotNull
        public static EnumEntries<ModelType> getEntries() {
            return f14032b;
        }

        public static ModelType valueOf(String str) {
            return (ModelType) Enum.valueOf(ModelType.class, str);
        }

        public static ModelType[] values() {
            return (ModelType[]) f14031a.clone();
        }

        public ModelType() {
            super(str, i);
        }
    }

    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;", "", "id", "", "title", "confidence", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;F)V", "getId", "()Ljava/lang/String;", "getTitle", "getConfidence", "()F", "detected", "", "toString", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Recognition {

        /* JADX INFO: renamed from: a */
        public final String f14033a;

        /* JADX INFO: renamed from: b */
        public final String f14034b;

        /* JADX INFO: renamed from: c */
        public final float f14035c;

        public Recognition(@NotNull String id2, @NotNull String title, float f11) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f14033a = id2;
            this.f14034b = title;
            this.f14035c = f11;
        }

        public final boolean detected() {
            return this.f14035c > 0.0f;
        }

        /* JADX INFO: renamed from: getConfidence, reason: from getter */
        public final float getF14035c() {
            return this.f14035c;
        }

        @NotNull
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF14033a() {
            return this.f14033a;
        }

        @NotNull
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF14034b() {
            return this.f14034b;
        }

        @NotNull
        public String toString() {
            return "Recognition(id='" + this.f14033a + "', title='" + this.f14034b + "', confidence=" + this.f14035c + ')';
        }

        public /* synthetic */ Recognition(String str, String str2, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? "unknown" : str2, f11);
        }
    }

    public Classifier(@NotNull ByteBuffer tfliteModel, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(tfliteModel, "tfliteModel");
        this.tfliteModel = tfliteModel;
        this.inputImageSizeX = i12;
        this.inputImageSizeY = i13;
        int i14 = i12 * i13;
        this.intValues = new int[i14];
        Interpreter.Options options = new Interpreter.Options();
        this.tfliteOptions = options;
        this.inferenceCancelled = new AtomicBoolean(false);
        this.normalizeImages = true;
        this.numBytesPerChannel = 4;
        options.setNumThreads(i11);
        options.setCancellable(true);
        this.inferenceCancelled = new AtomicBoolean(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.tflite = new Interpreter(this.tfliteModel, options);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Log.m14463d(TAG2, "Initializing interpreter took " + jCurrentTimeMillis2 + "ms");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i14 * 12);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.imgData = byteBufferAllocateDirect;
        this.intValues = new int[i14];
    }

    public final synchronized void cancel() {
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Log.m14463d(TAG2, "Classifier cancel executed");
        this.inferenceCancelled.set(true);
        Interpreter interpreter = this.tflite;
        if (interpreter != null) {
            interpreter.setCancelled(true);
        }
    }

    public final synchronized void destroy() {
        try {
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            Log.m14463d(TAG2, "Classifier destroy executed");
            Interpreter interpreter = this.tflite;
            if (interpreter != null) {
                interpreter.close();
            }
            this.tflite = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getCurrentModelType */
    public abstract ModelType getF14038b();

    public abstract void runInference();

    public final void convertBitmapToByteBuffer(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ByteBuffer byteBuffer = this.imgData;
        if (byteBuffer != null) {
            byteBuffer.rewind();
        }
        bitmap.getPixels(this.intValues, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i11 = this.inputImageSizeX;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = this.inputImageSizeY;
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i12 + 1;
                int i17 = this.intValues[i12];
                float f11 = this.normalizeImages ? 255.0f : 1.0f;
                ByteBuffer byteBuffer2 = this.imgData;
                if (byteBuffer2 != null) {
                    byteBuffer2.putFloat(((i17 >> 16) & 255) / f11);
                    byteBuffer2.putFloat(((i17 >> 8) & 255) / f11);
                    byteBuffer2.putFloat((i17 & 255) / f11);
                }
                i15++;
                i12 = i16;
            }
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Log.m14479v(TAG2, "Timecost to put values into ByteBuffer: " + (jUptimeMillis2 - jUptimeMillis));
    }

    @Nullable
    public final ByteBuffer getImgData() {
        return this.imgData;
    }

    public final boolean isActive$jumio_docfinder_release() {
        return (this.tflite == null || this.inferenceCancelled.get()) ? false : true;
    }

    public final void setImgData(@Nullable ByteBuffer byteBuffer) {
        this.imgData = byteBuffer;
    }

    public /* synthetic */ Classifier(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }
}
