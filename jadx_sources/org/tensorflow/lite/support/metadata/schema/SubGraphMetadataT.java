package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class SubGraphMetadataT {
    private String name = null;
    private String description = null;
    private TensorMetadataT[] inputTensorMetadata = null;
    private TensorMetadataT[] outputTensorMetadata = null;
    private AssociatedFileT[] associatedFiles = null;
    private ProcessUnitT[] inputProcessUnits = null;
    private ProcessUnitT[] outputProcessUnits = null;
    private TensorGroupT[] inputTensorGroups = null;
    private TensorGroupT[] outputTensorGroups = null;
    private CustomMetadataT[] customMetadata = null;

    public AssociatedFileT[] getAssociatedFiles() {
        return this.associatedFiles;
    }

    public CustomMetadataT[] getCustomMetadata() {
        return this.customMetadata;
    }

    public String getDescription() {
        return this.description;
    }

    public ProcessUnitT[] getInputProcessUnits() {
        return this.inputProcessUnits;
    }

    public TensorGroupT[] getInputTensorGroups() {
        return this.inputTensorGroups;
    }

    public TensorMetadataT[] getInputTensorMetadata() {
        return this.inputTensorMetadata;
    }

    public String getName() {
        return this.name;
    }

    public ProcessUnitT[] getOutputProcessUnits() {
        return this.outputProcessUnits;
    }

    public TensorGroupT[] getOutputTensorGroups() {
        return this.outputTensorGroups;
    }

    public TensorMetadataT[] getOutputTensorMetadata() {
        return this.outputTensorMetadata;
    }

    public void setAssociatedFiles(AssociatedFileT[] associatedFileTArr) {
        this.associatedFiles = associatedFileTArr;
    }

    public void setCustomMetadata(CustomMetadataT[] customMetadataTArr) {
        this.customMetadata = customMetadataTArr;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setInputProcessUnits(ProcessUnitT[] processUnitTArr) {
        this.inputProcessUnits = processUnitTArr;
    }

    public void setInputTensorGroups(TensorGroupT[] tensorGroupTArr) {
        this.inputTensorGroups = tensorGroupTArr;
    }

    public void setInputTensorMetadata(TensorMetadataT[] tensorMetadataTArr) {
        this.inputTensorMetadata = tensorMetadataTArr;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOutputProcessUnits(ProcessUnitT[] processUnitTArr) {
        this.outputProcessUnits = processUnitTArr;
    }

    public void setOutputTensorGroups(TensorGroupT[] tensorGroupTArr) {
        this.outputTensorGroups = tensorGroupTArr;
    }

    public void setOutputTensorMetadata(TensorMetadataT[] tensorMetadataTArr) {
        this.outputTensorMetadata = tensorMetadataTArr;
    }
}
