package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.util.C6324c;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
class NodeSerialization implements Serializable, Externalizable {
    protected static final int LONGEST_EAGER_ALLOC = 100000;
    private static final long serialVersionUID = 1;
    public byte[] json;

    public NodeSerialization() {
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m11723a(ObjectInput objectInput, int i11) throws IOException {
        if (i11 <= 100000) {
            byte[] bArr = new byte[i11];
            objectInput.readFully(bArr, 0, i11);
            return bArr;
        }
        C6324c c6324c = new C6324c(100000);
        try {
            byte[] bArrM11077o = c6324c.m11077o();
            while (true) {
                int i12 = 0;
                do {
                    int iMin = Math.min(bArrM11077o.length - i12, i11);
                    objectInput.readFully(bArrM11077o, 0, iMin);
                    i11 -= iMin;
                    i12 += iMin;
                    if (i11 == 0) {
                        byte[] bArrM11072i = c6324c.m11072i(i12);
                        c6324c.close();
                        return bArrM11072i;
                    }
                } while (i12 != bArrM11077o.length);
                bArrM11077o = c6324c.m11073j();
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    c6324c.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public NodeSerialization(byte[] bArr) {
        this.json = bArr;
    }

    public static NodeSerialization from(Object obj) {
        try {
            return new NodeSerialization(C6448b.m11728d(obj));
        } catch (IOException e11) {
            throw new IllegalArgumentException("Failed to JDK serialize `" + obj.getClass().getSimpleName() + "` value: " + e11.getMessage(), e11);
        }
    }

    public Object readResolve() {
        try {
            return C6448b.m11725a(this.json);
        } catch (IOException e11) {
            throw new IllegalArgumentException("Failed to JDK deserialize `JsonNode` value: " + e11.getMessage(), e11);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.json.length);
        objectOutput.write(this.json);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        this.json = m11723a(objectInput, objectInput.readInt());
    }
}
