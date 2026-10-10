package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class ContentT {
    private ContentPropertiesUnion contentProperties = null;
    private ValueRangeT range = null;

    public ContentPropertiesUnion getContentProperties() {
        return this.contentProperties;
    }

    public ValueRangeT getRange() {
        return this.range;
    }

    public void setContentProperties(ContentPropertiesUnion contentPropertiesUnion) {
        this.contentProperties = contentPropertiesUnion;
    }

    public void setRange(ValueRangeT valueRangeT) {
        this.range = valueRangeT;
    }
}
