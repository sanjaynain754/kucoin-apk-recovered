package org.tensorflow.lite.support.metadata;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.tensorflow.lite.schema.Metadata;
import org.tensorflow.lite.schema.Model;
import org.tensorflow.lite.schema.QuantizationParameters;
import org.tensorflow.lite.schema.SubGraph;
import org.tensorflow.lite.schema.Tensor;

/* JADX INFO: loaded from: classes61.dex */
final class ModelInfo {
    static final String METADATA_FIELD_NAME = "TFLITE_METADATA";
    private final List<Tensor> inputTensors;
    private final Model model;
    private final List<Tensor> outputTensors;

    private static List<Tensor> getInputTensors(Model model) {
        SubGraph subGraphSubgraphs = model.subgraphs(0);
        int iInputsLength = subGraphSubgraphs.inputsLength();
        ArrayList arrayList = new ArrayList(iInputsLength);
        for (int i11 = 0; i11 < iInputsLength; i11++) {
            arrayList.add(subGraphSubgraphs.tensors(subGraphSubgraphs.inputs(i11)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static List<Tensor> getOutputTensors(Model model) {
        SubGraph subGraphSubgraphs = model.subgraphs(0);
        int iOutputsLength = subGraphSubgraphs.outputsLength();
        ArrayList arrayList = new ArrayList(iOutputsLength);
        for (int i11 = 0; i11 < iOutputsLength; i11++) {
            arrayList.add(subGraphSubgraphs.tensors(subGraphSubgraphs.outputs(i11)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void assertTFLiteModel(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer, "Model flatbuffer cannot be null.");
        Preconditions.checkArgument(Model.ModelBufferHasIdentifier(byteBuffer), "The identifier of the model is invalid. The buffer may not be a valid TFLite model flatbuffer.");
    }

    private static int[] getShape(Tensor tensor) {
        Preconditions.checkNotNull(tensor, "Tensor cannot be null.");
        int iShapeLength = tensor.shapeLength();
        int[] iArr = new int[iShapeLength];
        for (int i11 = 0; i11 < iShapeLength; i11++) {
            iArr[i11] = tensor.shape(i11);
        }
        return iArr;
    }

    public Tensor getInputTensor(int i11) {
        Preconditions.checkArgument(i11 >= 0 && i11 < this.inputTensors.size(), "The inputIndex specified is invalid.");
        return this.inputTensors.get(i11);
    }

    public int getInputTensorCount() {
        return this.inputTensors.size();
    }

    public ByteBuffer getMetadataBuffer() {
        if (this.model.metadataLength() == 0) {
            return null;
        }
        for (int i11 = 0; i11 < this.model.metadataLength(); i11++) {
            Metadata metadata = this.model.metadata(i11);
            if (METADATA_FIELD_NAME.equals(metadata.name())) {
                return this.model.buffers((int) metadata.buffer()).dataAsByteBuffer();
            }
        }
        return null;
    }

    public Tensor getOutputTensor(int i11) {
        Preconditions.checkArgument(i11 >= 0 && i11 < this.outputTensors.size(), "The outputIndex specified is invalid.");
        return this.outputTensors.get(i11);
    }

    public int getOutputTensorCount() {
        return this.outputTensors.size();
    }

    public MetadataExtractor.QuantizationParams getQuantizationParams(Tensor tensor) {
        Preconditions.checkNotNull(tensor, "Tensor cannot be null.");
        QuantizationParameters quantizationParametersQuantization = tensor.quantization();
        if (quantizationParametersQuantization == null) {
            return new MetadataExtractor.QuantizationParams(0.0f, 0);
        }
        Preconditions.checkArgument(quantizationParametersQuantization.scaleLength() <= 1, "Input and output tensors do not support per-channel quantization.");
        Preconditions.checkArgument(quantizationParametersQuantization.zeroPointLength() <= 1, "Input and output tensors do not support per-channel quantization.");
        return new MetadataExtractor.QuantizationParams(quantizationParametersQuantization.scale(0), (int) quantizationParametersQuantization.zeroPoint(0));
    }

    public ModelInfo(ByteBuffer byteBuffer) {
        boolean z11;
        assertTFLiteModel(byteBuffer);
        Model rootAsModel = Model.getRootAsModel(byteBuffer);
        this.model = rootAsModel;
        if (rootAsModel.subgraphsLength() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "The model does not contain any subgraph.");
        this.inputTensors = getInputTensors(rootAsModel);
        this.outputTensors = getOutputTensors(rootAsModel);
    }

    public int[] getInputTensorShape(int i11) {
        return getShape(getInputTensor(i11));
    }

    public byte getInputTensorType(int i11) {
        return getInputTensor(i11).type();
    }

    public int[] getOutputTensorShape(int i11) {
        return getShape(getOutputTensor(i11));
    }

    public byte getOutputTensorType(int i11) {
        return getOutputTensor(i11).type();
    }
}
