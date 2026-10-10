package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes61.dex */
public class ModelMetadataT {
    private String name = null;
    private String description = null;
    private String version = null;
    private SubGraphMetadataT[] subgraphMetadata = null;
    private String author = null;
    private String license = null;
    private AssociatedFileT[] associatedFiles = null;
    private String minParserVersion = null;

    public AssociatedFileT[] getAssociatedFiles() {
        return this.associatedFiles;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getDescription() {
        return this.description;
    }

    public String getLicense() {
        return this.license;
    }

    public String getMinParserVersion() {
        return this.minParserVersion;
    }

    public String getName() {
        return this.name;
    }

    public SubGraphMetadataT[] getSubgraphMetadata() {
        return this.subgraphMetadata;
    }

    public String getVersion() {
        return this.version;
    }

    public byte[] serializeToBinary() {
        FlatBufferBuilder flatBufferBuilder = new FlatBufferBuilder();
        ModelMetadata.finishModelMetadataBuffer(flatBufferBuilder, ModelMetadata.pack(flatBufferBuilder, this));
        return flatBufferBuilder.sizedByteArray();
    }

    public void setAssociatedFiles(AssociatedFileT[] associatedFileTArr) {
        this.associatedFiles = associatedFileTArr;
    }

    public void setAuthor(String str) {
        this.author = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setLicense(String str) {
        this.license = str;
    }

    public void setMinParserVersion(String str) {
        this.minParserVersion = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSubgraphMetadata(SubGraphMetadataT[] subGraphMetadataTArr) {
        this.subgraphMetadata = subGraphMetadataTArr;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public static ModelMetadataT deserializeFromBinary(byte[] bArr) {
        return ModelMetadata.getRootAsModelMetadata(ByteBuffer.wrap(bArr)).unpack();
    }
}
