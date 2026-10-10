package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class ImagePropertiesT {
    private byte colorSpace = 0;
    private ImageSizeT defaultSize = null;

    public byte getColorSpace() {
        return this.colorSpace;
    }

    public ImageSizeT getDefaultSize() {
        return this.defaultSize;
    }

    public void setColorSpace(byte b11) {
        this.colorSpace = b11;
    }

    public void setDefaultSize(ImageSizeT imageSizeT) {
        this.defaultSize = imageSizeT;
    }
}
