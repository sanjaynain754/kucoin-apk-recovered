package org.tensorflow.lite.support.metadata;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.zip.ZipException;
import org.tensorflow.lite.support.metadata.schema.ModelMetadata;
import org.tensorflow.lite.support.metadata.schema.TensorMetadata;

/* JADX INFO: loaded from: classes61.dex */
public class MetadataExtractor {
    private final ModelMetadataInfo metadataInfo;
    private final ModelInfo modelInfo;
    private final ZipFile zipFile;

    public static class QuantizationParams {
        private final float scale;
        private final int zeroPoint;

        public float getScale() {
            return this.scale;
        }

        public int getZeroPoint() {
            return this.zeroPoint;
        }

        public QuantizationParams(float f11, int i11) {
            this.scale = f11;
            this.zeroPoint = i11;
        }
    }

    private void assertMetadataInfo() {
        if (this.metadataInfo == null) {
            throw new IllegalStateException("This model does not contain model metadata.");
        }
    }

    private void assertZipFile() {
        if (this.zipFile == null) {
            throw new IllegalStateException("This model does not contain associated files, and is not a Zip file.");
        }
    }

    private static int compareVersions(String str, String str2) {
        String[] strArrSplit = str.split("\\.", 0);
        String[] strArrSplit2 = str2.split("\\.", 0);
        int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
        int i11 = 0;
        while (i11 < iMax) {
            int iCompareTo = Integer.valueOf(i11 < strArrSplit.length ? Integer.parseInt(strArrSplit[i11]) : 0).compareTo(Integer.valueOf(i11 < strArrSplit2.length ? Integer.parseInt(strArrSplit2[i11]) : 0));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i11++;
        }
        return 0;
    }

    private static ZipFile createZipFile(ByteBuffer byteBuffer) throws IOException {
        try {
            return ZipFile.createFrom(new ByteBufferChannel(byteBuffer));
        } catch (ZipException unused) {
            return null;
        }
    }

    public int getInputTensorCount() {
        return this.modelInfo.getInputTensorCount();
    }

    public QuantizationParams getInputTensorQuantizationParams(int i11) {
        return this.modelInfo.getQuantizationParams(this.modelInfo.getInputTensor(i11));
    }

    public int[] getInputTensorShape(int i11) {
        return this.modelInfo.getInputTensorShape(i11);
    }

    public byte getInputTensorType(int i11) {
        return this.modelInfo.getInputTensorType(i11);
    }

    public int getOutputTensorCount() {
        return this.modelInfo.getOutputTensorCount();
    }

    public QuantizationParams getOutputTensorQuantizationParams(int i11) {
        return this.modelInfo.getQuantizationParams(this.modelInfo.getOutputTensor(i11));
    }

    public int[] getOutputTensorShape(int i11) {
        return this.modelInfo.getOutputTensorShape(i11);
    }

    public byte getOutputTensorType(int i11) {
        return this.modelInfo.getOutputTensorType(i11);
    }

    public boolean hasMetadata() {
        return this.metadataInfo != null;
    }

    public final boolean isMinimumParserVersionSatisfied() {
        String mininumParserVersion = this.metadataInfo.getMininumParserVersion();
        return mininumParserVersion == null || compareVersions(mininumParserVersion, MetadataParser.VERSION) <= 0;
    }

    public MetadataExtractor(ByteBuffer byteBuffer) throws IOException {
        boolean z11;
        ModelInfo modelInfo = new ModelInfo(byteBuffer);
        this.modelInfo = modelInfo;
        ByteBuffer metadataBuffer = modelInfo.getMetadataBuffer();
        if (metadataBuffer != null) {
            ModelMetadataInfo modelMetadataInfo = new ModelMetadataInfo(metadataBuffer);
            this.metadataInfo = modelMetadataInfo;
            if (!isMinimumParserVersionSatisfied()) {
                System.err.printf("<Warning> Some fields in the metadata belong to a future schema. The minimum parser version required is %s, but the version of the current metadata parser is %s", modelMetadataInfo.getMininumParserVersion(), MetadataParser.VERSION);
            }
            if (modelInfo.getInputTensorCount() == modelMetadataInfo.getInputTensorCount()) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11, String.format("The number of input tensors in the model is %d. The number of input tensors that recorded in the metadata is %d. These two values does not match.", Integer.valueOf(modelInfo.getInputTensorCount()), Integer.valueOf(modelMetadataInfo.getInputTensorCount())));
            Preconditions.checkArgument(modelInfo.getOutputTensorCount() == modelMetadataInfo.getOutputTensorCount(), String.format("The number of output tensors in the model is %d. The number of output tensors that recorded in the metadata is %d. These two values does not match.", Integer.valueOf(modelInfo.getOutputTensorCount()), Integer.valueOf(modelMetadataInfo.getOutputTensorCount())));
        } else {
            this.metadataInfo = null;
        }
        this.zipFile = createZipFile(byteBuffer);
    }

    public InputStream getAssociatedFile(String str) {
        assertZipFile();
        return this.zipFile.getRawInputStream(str);
    }

    public Set<String> getAssociatedFileNames() {
        assertZipFile();
        return this.zipFile.getFileNames();
    }

    public TensorMetadata getInputTensorMetadata(int i11) {
        assertMetadataInfo();
        return this.metadataInfo.getInputTensorMetadata(i11);
    }

    public ModelMetadata getModelMetadata() {
        assertMetadataInfo();
        return this.metadataInfo.getModelMetadata();
    }

    public TensorMetadata getOutputTensorMetadata(int i11) {
        assertMetadataInfo();
        return this.metadataInfo.getOutputTensorMetadata(i11);
    }
}
