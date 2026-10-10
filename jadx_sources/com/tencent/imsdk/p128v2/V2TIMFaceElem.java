package com.tencent.imsdk.p128v2;

import androidx.credentials.provider.CredentialEntry;
import com.tencent.imsdk.message.FaceElement;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMFaceElem extends V2TIMElem {
    private byte[] data;
    private int index = 0;

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("V2TIMFaceElem--->");
        sb2.append("index:");
        sb2.append(getIndex());
        sb2.append(", has data:");
        sb2.append(getData() == null ? CredentialEntry.FALSE_STRING : CredentialEntry.TRUE_STRING);
        return sb2.toString();
    }

    public byte[] getData() {
        if (getElement() == null) {
            return this.data;
        }
        return ((FaceElement) getElement()).getFaceData();
    }

    public int getIndex() {
        if (getElement() == null) {
            return this.index;
        }
        return ((FaceElement) getElement()).getFaceIndex();
    }

    public void setData(byte[] bArr) {
        if (getElement() == null) {
            this.data = bArr;
        } else {
            ((FaceElement) getElement()).setFaceData(bArr);
        }
    }

    public void setIndex(int i11) {
        if (getElement() == null) {
            this.index = i11;
        } else {
            ((FaceElement) getElement()).setFaceIndex(i11);
        }
    }
}
