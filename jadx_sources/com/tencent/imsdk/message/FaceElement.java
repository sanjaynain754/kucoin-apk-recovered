package com.tencent.imsdk.message;

/* JADX INFO: loaded from: classes59.dex */
public class FaceElement extends MessageBaseElement {
    private byte[] faceData;
    private int faceIndex;

    public byte[] getFaceData() {
        return this.faceData;
    }

    public int getFaceIndex() {
        return this.faceIndex;
    }

    public void setFaceData(byte[] bArr) {
        this.faceData = bArr;
    }

    public void setFaceIndex(int i11) {
        this.faceIndex = i11;
    }

    public FaceElement() {
        setElementType(8);
    }
}
