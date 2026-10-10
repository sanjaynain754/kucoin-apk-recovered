package com.jumio.core.extraction.docfinder.classifier;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.jumio.commons.log.Log;
import com.tencent.bugly.proguard.C33820nf;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.Tensor;
import org.tensorflow.lite.support.metadata.MetadataExtractor;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.ByteStreamsKt;
import p852kotlin.text.Charsets;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Keep
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000eH\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u000eH\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020\u000eH\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0002R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;", "Lcom/jumio/core/extraction/docfinder/classifier/Classifier;", "tfliteModel", "Ljava/nio/ByteBuffer;", "numThreads", "", "inputImageSizeX", "inputImageSizeY", "<init>", "(Ljava/nio/ByteBuffer;III)V", "classificationResultMap", "", "", "labelsMap", "", "", "thresholdMap", "", "currentModelType", "Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;", "getCurrentModelType", "()Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;", "runInference", "", "recognizeMultiHeadOutput", "Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult;", "bitmap", "Landroid/graphics/Bitmap;", "getResultEntries", "", "Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult$Entry;", "getOutputMapFor", "", "type", "getHighestConfidenceValueFor", "isConfidenceValueAboveThresholdFor", "", "getHighestConfidenceLabelFor", "Companion", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDocumentClassifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentClassifier.kt\ncom/jumio/core/extraction/docfinder/classifier/DocumentClassifier\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 Timing.kt\nkotlin/system/TimingKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,207:1\n11158#2:208\n11493#2,3:209\n1742#2,6:250\n1863#3:212\n295#3,2:213\n1864#3:216\n1863#3:217\n295#3,2:218\n1864#3:224\n295#3,2:225\n1863#3,2:227\n1863#3,2:233\n346#3,8:242\n1#4:215\n37#5:220\n36#5,3:221\n37#5:229\n36#5,3:230\n29#6,3:235\n126#7:238\n153#7,3:239\n*S KotlinDebug\n*F\n+ 1 DocumentClassifier.kt\ncom/jumio/core/extraction/docfinder/classifier/DocumentClassifier\n*L\n48#1:208\n48#1:209,3\n160#1:250,6\n64#1:212\n65#1:213,2\n64#1:216\n74#1:217\n75#1:218,2\n74#1:224\n81#1:225,2\n86#1:227,2\n102#1:233,2\n144#1:242,8\n78#1:220\n78#1:221,3\n93#1:229\n93#1:230,3\n124#1:235,3\n133#1:238\n133#1:239,3\n*E\n"})
public final class DocumentClassifier extends Classifier {
    public static final int IMAGE_SIZE_X = 224;
    public static final int IMAGE_SIZE_Y = 224;

    @NotNull
    public static final String KEY_COUNTRY = "country";

    @NotNull
    public static final String KEY_SIDE = "classifier";

    @NotNull
    public static final String KEY_TYPE = "idtype";

    @NotNull
    private Map<Integer, Object> classificationResultMap;

    @NotNull
    private final Classifier.ModelType currentModelType;

    @NotNull
    private final Map<String, String[]> labelsMap;

    @NotNull
    private final Map<String, Float> thresholdMap;

    @NotNull
    private static final float[] CONFIDENCE_VALUE_FALLBACK = new float[0];

    public /* synthetic */ DocumentClassifier(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, i11, (i14 & 4) != 0 ? 224 : i12, (i14 & 8) != 0 ? 224 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentClassifier(@NotNull ByteBuffer tfliteModel, int i11, int i12, int i13) throws JSONException {
        Object next;
        String str;
        String str2;
        Object next2;
        String str3;
        Object next3;
        String strName;
        Tensor tensor;
        super(tfliteModel, i11, i12, i13);
        Intrinsics.checkNotNullParameter(tfliteModel, "tfliteModel");
        this.classificationResultMap = new LinkedHashMap();
        this.labelsMap = new LinkedHashMap();
        this.thresholdMap = new LinkedHashMap();
        this.currentModelType = Classifier.ModelType.CLASSIFICATION;
        Interpreter interpreter = this.tflite;
        String[] signatureOutputs = (interpreter == null || (signatureOutputs = interpreter.getSignatureOutputs("serving_default")) == null) ? new String[0] : signatureOutputs;
        ArrayList arrayList = new ArrayList(signatureOutputs.length);
        int length = signatureOutputs.length;
        int i14 = 0;
        while (true) {
            Tensor outputTensorFromSignature = null;
            if (i14 >= length) {
                break;
            }
            String str4 = signatureOutputs[i14];
            Interpreter interpreter2 = this.tflite;
            if (interpreter2 != null) {
                outputTensorFromSignature = interpreter2.getOutputTensorFromSignature(str4, "serving_default");
            }
            arrayList.add(outputTensorFromSignature);
            i14++;
        }
        List listZip = ArraysKt.zip(signatureOutputs, arrayList);
        ArrayList<Tensor> arrayList2 = new ArrayList();
        Interpreter interpreter3 = this.tflite;
        int outputTensorCount = interpreter3 != null ? interpreter3.getOutputTensorCount() : 0;
        for (int i15 = 0; i15 < outputTensorCount; i15++) {
            Interpreter interpreter4 = this.tflite;
            arrayList2.add(interpreter4 != null ? interpreter4.getOutputTensor(i15) : null);
        }
        ArrayList<String> arrayList3 = new ArrayList();
        for (Tensor tensor2 : arrayList2) {
            Iterator it = listZip.iterator();
            do {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
                Pair pair = (Pair) next3;
                strName = tensor2 != null ? tensor2.name() : null;
                tensor = (Tensor) pair.getSecond();
            } while (!Intrinsics.areEqual(strName, tensor != null ? tensor.name() : null));
            Pair pair2 = (Pair) next3;
            String str5 = pair2 != null ? (String) pair2.getFirst() : null;
            if (str5 != null) {
                arrayList3.add(str5);
            }
        }
        MetadataExtractor metadataExtractor = new MetadataExtractor(tfliteModel);
        if (metadataExtractor.hasMetadata()) {
            for (String str6 : arrayList3) {
                Set<String> associatedFileNames = metadataExtractor.getAssociatedFileNames();
                Intrinsics.checkNotNullExpressionValue(associatedFileNames, "getAssociatedFileNames(...)");
                Iterator<T> it2 = associatedFileNames.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it2.next();
                        str3 = (String) next2;
                        Intrinsics.checkNotNull(str3);
                    }
                } while (!StringsKt.contains$default((CharSequence) str3, (CharSequence) str6, false, 2, (Object) null));
                String str7 = (String) next2;
                if (str7 != null && str7.length() != 0) {
                    InputStream associatedFile = metadataExtractor.getAssociatedFile(str7);
                    Intrinsics.checkNotNullExpressionValue(associatedFile, "getAssociatedFile(...)");
                    this.labelsMap.put(str6, (String[]) new Regex("[\r\n]+").split(StringsKt.trim((CharSequence) new String(ByteStreamsKt.readBytes(associatedFile), Charsets.UTF_8)).toString(), 0).toArray(new String[0]));
                }
            }
            Set<String> associatedFileNames2 = metadataExtractor.getAssociatedFileNames();
            Intrinsics.checkNotNullExpressionValue(associatedFileNames2, "getAssociatedFileNames(...)");
            Iterator<T> it3 = associatedFileNames2.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it3.next();
                    str2 = (String) next;
                    Intrinsics.checkNotNull(str2);
                }
            } while (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "threshold", false, 2, (Object) null));
            String str8 = (String) next;
            if (str8 == null || str8.length() == 0) {
                str = "";
            } else {
                InputStream associatedFile2 = metadataExtractor.getAssociatedFile(str8);
                Intrinsics.checkNotNullExpressionValue(associatedFile2, "getAssociatedFile(...)");
                str = new String(ByteStreamsKt.readBytes(associatedFile2), Charsets.UTF_8);
            }
            Object obj = new JSONObject(str).get("sdk");
            JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
            jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
            for (String str9 : this.labelsMap.keySet()) {
                Map<String, Float> map = this.thresholdMap;
                Double d11 = (Double) jSONObject.get(str9 + "_op_threshold");
                map.put(str9, Float.valueOf(d11 != null ? (float) d11.doubleValue() : 0.0f));
            }
        } else {
            Log.m14463d("DocumentClassifier", "Extractor doesn't have metadata");
        }
        String[][] strArr = (String[][]) this.labelsMap.values().toArray(new String[0][]);
        int length2 = strArr.length;
        for (int i16 = 0; i16 < length2; i16++) {
            this.classificationResultMap.put(Integer.valueOf(i16), new float[][]{new float[strArr[i16].length]});
        }
    }

    private final float[] getOutputMapFor(String type) {
        float[] fArr;
        Iterator<T> it = this.labelsMap.keySet().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            Object next = it.next();
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual((String) next, type)) {
                break;
            }
            i11++;
        }
        Integer numValueOf = Integer.valueOf(i11);
        if (i11 < 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return CONFIDENCE_VALUE_FALLBACK;
        }
        if (this.classificationResultMap.size() <= numValueOf.intValue()) {
            return CONFIDENCE_VALUE_FALLBACK;
        }
        Object obj = this.classificationResultMap.get(numValueOf);
        float[][] fArr2 = obj instanceof float[][] ? (float[][]) obj : null;
        return (fArr2 == null || (fArr = (float[]) ArraysKt.firstOrNull(fArr2)) == null) ? CONFIDENCE_VALUE_FALLBACK : fArr;
    }

    private final List<DocumentClassifierResult.Entry> getResultEntries() {
        Map<String, String[]> map = this.labelsMap;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            arrayList.add(new DocumentClassifierResult.Entry(entry.getKey(), getHighestConfidenceLabelFor(entry.getKey()), getHighestConfidenceValueFor(entry.getKey()), isConfidenceValueAboveThresholdFor(entry.getKey())));
        }
        return arrayList;
    }

    @Override // com.jumio.core.extraction.docfinder.classifier.Classifier
    @NotNull
    /* JADX INFO: renamed from: getCurrentModelType, reason: from getter */
    public Classifier.ModelType getF14038b() {
        return this.currentModelType;
    }

    @NotNull
    public final DocumentClassifierResult recognizeMultiHeadOutput(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        convertBitmapToByteBuffer(bitmap);
        long jCurrentTimeMillis = System.currentTimeMillis();
        runInference();
        Log.m14479v("DocumentClassifier", "Running inference took " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        return new DocumentClassifierResult(getResultEntries());
    }

    @Override // com.jumio.core.extraction.docfinder.classifier.Classifier
    public void runInference() {
        try {
            Interpreter interpreter = this.tflite;
            if (interpreter != null) {
                interpreter.runForMultipleInputsOutputs(new ByteBuffer[]{getImgData()}, this.classificationResultMap);
            }
            for (String str : this.labelsMap.keySet()) {
                Log.m14484w("DocumentClassifier", str + ": " + getHighestConfidenceLabelFor(str) + "; conf: " + getHighestConfidenceValueFor(str));
            }
        } catch (IllegalArgumentException e11) {
            Log.m14485w("DocumentClassifier", "Error on running inference", e11);
        }
    }

    private final String getHighestConfidenceLabelFor(String type) {
        String str;
        float[] outputMapFor = getOutputMapFor(type);
        int length = outputMapFor.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                if (outputMapFor[i11] == getHighestConfidenceValueFor(type)) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i11);
        if (i11 < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            String[] strArr = this.labelsMap.get(type);
            if (strArr != null && (str = strArr[iIntValue]) != null) {
                return str;
            }
        }
        return C33820nf.f71144W;
    }

    private final float getHighestConfidenceValueFor(String type) {
        return ArraysKt.maxOrThrow(getOutputMapFor(type));
    }

    private final boolean isConfidenceValueAboveThresholdFor(String type) {
        float fFloatValue;
        float highestConfidenceValueFor = getHighestConfidenceValueFor(type);
        Float f11 = this.thresholdMap.get(type);
        if (f11 != null) {
            fFloatValue = f11.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        if (highestConfidenceValueFor > fFloatValue) {
            return true;
        }
        return false;
    }
}
