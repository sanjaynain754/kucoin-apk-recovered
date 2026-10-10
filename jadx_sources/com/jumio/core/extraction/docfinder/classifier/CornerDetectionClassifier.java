package com.jumio.core.extraction.docfinder.classifier;

import android.graphics.Bitmap;
import com.jumio.commons.log.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.Interpreter;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0014R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;", "Lcom/jumio/core/extraction/docfinder/classifier/Classifier;", "tfliteModel", "Ljava/nio/ByteBuffer;", "numThreads", "", "inputImageSizeX", "inputImageSizeY", "<init>", "(Ljava/nio/ByteBuffer;III)V", "labelProbArray", "", "", "[[F", "currentModelType", "Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;", "getCurrentModelType", "()Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;", "getNormalizedProbability", "", "labelIndex", "recognizeImage", "", "Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;", "bitmap", "Landroid/graphics/Bitmap;", "runInference", "", "Companion", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCornerDetectionClassifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerDetectionClassifier.kt\ncom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,96:1\n29#2,3:97\n*S KotlinDebug\n*F\n+ 1 CornerDetectionClassifier.kt\ncom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier\n*L\n44#1:97,3\n*E\n"})
public final class CornerDetectionClassifier extends Classifier {
    public static final int IMAGE_SIZE_X = 224;
    public static final int IMAGE_SIZE_Y = 224;

    /* JADX INFO: renamed from: a */
    public final float[][] f14037a;

    /* JADX INFO: renamed from: b */
    public final Classifier.ModelType f14038b;

    /* JADX INFO: renamed from: c */
    public static final IntRange f14036c = new IntRange(0, 7);

    public /* synthetic */ CornerDetectionClassifier(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, i11, (i14 & 4) != 0 ? 224 : i12, (i14 & 8) != 0 ? 224 : i13);
    }

    @NotNull
    public final synchronized List<Classifier.Recognition> recognizeImage(@NotNull Bitmap bitmap) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        arrayList = new ArrayList();
        if (isActive$jumio_docfinder_release()) {
            convertBitmapToByteBuffer(bitmap);
            long jCurrentTimeMillis = System.currentTimeMillis();
            runInference();
            Log.m14479v("CornerDetectionClassifier", "Running inference took " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            IntRange intRange = f14036c;
            int first = intRange.getFirst();
            int last = intRange.getLast();
            if (first <= last) {
                while (true) {
                    arrayList.add(new Classifier.Recognition(String.valueOf(first), null, this.f14037a[0][first], 2, null));
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CornerDetectionClassifier(@NotNull ByteBuffer tfliteModel, int i11, int i12, int i13) {
        super(tfliteModel, i11, i12, i13);
        Intrinsics.checkNotNullParameter(tfliteModel, "tfliteModel");
        this.f14037a = new float[][]{new float[8]};
        this.f14038b = Classifier.ModelType.CORNER_DETECTION;
    }

    @Override // com.jumio.core.extraction.docfinder.classifier.Classifier
    @NotNull
    /* JADX INFO: renamed from: getCurrentModelType, reason: from getter */
    public Classifier.ModelType getF14038b() {
        return this.f14038b;
    }

    @Override // com.jumio.core.extraction.docfinder.classifier.Classifier
    public void runInference() {
        try {
            Interpreter interpreter = this.tflite;
            if (interpreter != null) {
                interpreter.run(getImgData(), this.f14037a);
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "TL(%f, %f), TR(%f, %f), BR(%f, %f), BL(%f, %f)", Arrays.copyOf(new Object[]{Float.valueOf(this.f14037a[0][0]), Float.valueOf(this.f14037a[0][1]), Float.valueOf(this.f14037a[0][2]), Float.valueOf(this.f14037a[0][3]), Float.valueOf(this.f14037a[0][4]), Float.valueOf(this.f14037a[0][5]), Float.valueOf(this.f14037a[0][6]), Float.valueOf(this.f14037a[0][7])}, 8));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            Log.m14479v("CornerDetectionClassifier", str);
        } catch (IllegalArgumentException e11) {
            Log.m14485w("CornerDetectionClassifier", "Error on running inference", e11);
        }
    }
}
