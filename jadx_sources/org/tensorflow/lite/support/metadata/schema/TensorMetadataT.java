package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class TensorMetadataT {
    private String name = null;
    private String description = null;
    private String[] dimensionNames = null;
    private ContentT content = null;
    private ProcessUnitT[] processUnits = null;
    private StatsT stats = null;
    private AssociatedFileT[] associatedFiles = null;

    public AssociatedFileT[] getAssociatedFiles() {
        return this.associatedFiles;
    }

    public ContentT getContent() {
        return this.content;
    }

    public String getDescription() {
        return this.description;
    }

    public String[] getDimensionNames() {
        return this.dimensionNames;
    }

    public String getName() {
        return this.name;
    }

    public ProcessUnitT[] getProcessUnits() {
        return this.processUnits;
    }

    public StatsT getStats() {
        return this.stats;
    }

    public void setAssociatedFiles(AssociatedFileT[] associatedFileTArr) {
        this.associatedFiles = associatedFileTArr;
    }

    public void setContent(ContentT contentT) {
        this.content = contentT;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDimensionNames(String[] strArr) {
        this.dimensionNames = strArr;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProcessUnits(ProcessUnitT[] processUnitTArr) {
        this.processUnits = processUnitTArr;
    }

    public void setStats(StatsT statsT) {
        this.stats = statsT;
    }
}
