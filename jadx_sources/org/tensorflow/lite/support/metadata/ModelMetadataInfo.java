package org.tensorflow.lite.support.metadata;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.tensorflow.lite.support.metadata.schema.ModelMetadata;
import org.tensorflow.lite.support.metadata.schema.SubGraphMetadata;
import org.tensorflow.lite.support.metadata.schema.TensorMetadata;

/* JADX INFO: loaded from: classes61.dex */
final class ModelMetadataInfo {
    private final List<TensorMetadata> inputsMetadata;
    private final String minVersion;
    private final ModelMetadata modelMetadata;
    private final List<TensorMetadata> outputsMetadata;

    private static List<TensorMetadata> getInputsMetadata(ModelMetadata modelMetadata) {
        SubGraphMetadata subgraphMetadata = modelMetadata.subgraphMetadata(0);
        int iInputTensorMetadataLength = subgraphMetadata.inputTensorMetadataLength();
        ArrayList arrayList = new ArrayList(iInputTensorMetadataLength);
        for (int i11 = 0; i11 < iInputTensorMetadataLength; i11++) {
            arrayList.add(subgraphMetadata.inputTensorMetadata(i11));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static List<TensorMetadata> getOutputsMetadata(ModelMetadata modelMetadata) {
        SubGraphMetadata subgraphMetadata = modelMetadata.subgraphMetadata(0);
        int iOutputTensorMetadataLength = subgraphMetadata.outputTensorMetadataLength();
        ArrayList arrayList = new ArrayList(iOutputTensorMetadataLength);
        for (int i11 = 0; i11 < iOutputTensorMetadataLength; i11++) {
            arrayList.add(subgraphMetadata.outputTensorMetadata(i11));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void assertTFLiteMetadata(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer, "Metadata flatbuffer cannot be null.");
        Preconditions.checkArgument(ModelMetadata.ModelMetadataBufferHasIdentifier(byteBuffer), "The identifier of the metadata is invalid. The buffer may not be a valid TFLite metadata flatbuffer.");
    }

    public int getInputTensorCount() {
        return this.inputsMetadata.size();
    }

    public TensorMetadata getInputTensorMetadata(int i11) {
        Preconditions.checkArgument(i11 >= 0 && i11 < this.inputsMetadata.size(), "The inputIndex specified is invalid.");
        return this.inputsMetadata.get(i11);
    }

    public String getMininumParserVersion() {
        return this.minVersion;
    }

    public ModelMetadata getModelMetadata() {
        return this.modelMetadata;
    }

    public int getOutputTensorCount() {
        return this.outputsMetadata.size();
    }

    public TensorMetadata getOutputTensorMetadata(int i11) {
        Preconditions.checkArgument(i11 >= 0 && i11 < this.outputsMetadata.size(), "The outputIndex specified is invalid.");
        return this.outputsMetadata.get(i11);
    }

    public ModelMetadataInfo(ByteBuffer byteBuffer) {
        boolean z11;
        assertTFLiteMetadata(byteBuffer);
        ModelMetadata rootAsModelMetadata = ModelMetadata.getRootAsModelMetadata(byteBuffer);
        this.modelMetadata = rootAsModelMetadata;
        if (rootAsModelMetadata.subgraphMetadataLength() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "The metadata flatbuffer does not contain any subgraph metadata.");
        this.inputsMetadata = getInputsMetadata(rootAsModelMetadata);
        this.outputsMetadata = getOutputsMetadata(rootAsModelMetadata);
        this.minVersion = rootAsModelMetadata.minParserVersion();
    }
}
