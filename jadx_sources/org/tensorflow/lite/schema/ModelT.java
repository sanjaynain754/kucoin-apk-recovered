package org.tensorflow.lite.schema;

import com.google.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes61.dex */
public class ModelT {
    private long version = 0;
    private OperatorCodeT[] operatorCodes = null;
    private SubGraphT[] subgraphs = null;
    private String description = null;
    private BufferT[] buffers = null;
    private int[] metadataBuffer = null;
    private MetadataT[] metadata = null;
    private SignatureDefT[] signatureDefs = null;

    public BufferT[] getBuffers() {
        return this.buffers;
    }

    public String getDescription() {
        return this.description;
    }

    public MetadataT[] getMetadata() {
        return this.metadata;
    }

    public int[] getMetadataBuffer() {
        return this.metadataBuffer;
    }

    public OperatorCodeT[] getOperatorCodes() {
        return this.operatorCodes;
    }

    public SignatureDefT[] getSignatureDefs() {
        return this.signatureDefs;
    }

    public SubGraphT[] getSubgraphs() {
        return this.subgraphs;
    }

    public long getVersion() {
        return this.version;
    }

    public byte[] serializeToBinary() {
        FlatBufferBuilder flatBufferBuilder = new FlatBufferBuilder();
        Model.finishModelBuffer(flatBufferBuilder, Model.pack(flatBufferBuilder, this));
        return flatBufferBuilder.sizedByteArray();
    }

    public void setBuffers(BufferT[] bufferTArr) {
        this.buffers = bufferTArr;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setMetadata(MetadataT[] metadataTArr) {
        this.metadata = metadataTArr;
    }

    public void setMetadataBuffer(int[] iArr) {
        this.metadataBuffer = iArr;
    }

    public void setOperatorCodes(OperatorCodeT[] operatorCodeTArr) {
        this.operatorCodes = operatorCodeTArr;
    }

    public void setSignatureDefs(SignatureDefT[] signatureDefTArr) {
        this.signatureDefs = signatureDefTArr;
    }

    public void setSubgraphs(SubGraphT[] subGraphTArr) {
        this.subgraphs = subGraphTArr;
    }

    public void setVersion(long j11) {
        this.version = j11;
    }

    public static ModelT deserializeFromBinary(byte[] bArr) {
        return Model.getRootAsModel(ByteBuffer.wrap(bArr)).unpack();
    }
}
