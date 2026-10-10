package com.fasterxml.jackson.core.p062io;

import com.fasterxml.jackson.core.InterfaceC6306i;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes45.dex */
public class SerializedString implements InterfaceC6306i, Serializable {

    /* JADX INFO: renamed from: b */
    public static final C6311e f10066b = C6311e.m11000j();
    private static final long serialVersionUID = 1;
    protected transient String _jdkSerializeValue;
    protected char[] _quotedChars;
    protected byte[] _quotedUTF8Ref;
    protected byte[] _unquotedUTF8Ref;
    protected final String _value;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this._value);
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6306i
    public int appendQuoted(char[] cArr, int i11) {
        char[] cArrM11006k = this._quotedChars;
        if (cArrM11006k == null) {
            cArrM11006k = f10066b.m11006k(this._value);
            this._quotedChars = cArrM11006k;
        }
        int length = cArrM11006k.length;
        if (i11 + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArrM11006k, 0, cArr, i11, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6306i
    public int appendQuotedUTF8(byte[] bArr, int i11) {
        byte[] bArrM11007l = this._quotedUTF8Ref;
        if (bArrM11007l == null) {
            bArrM11007l = f10066b.m11007l(this._value);
            this._quotedUTF8Ref = bArrM11007l;
        }
        int length = bArrM11007l.length;
        if (i11 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrM11007l, 0, bArr, i11, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6306i
    public int appendUnquoted(char[] cArr, int i11) {
        String str = this._value;
        int length = str.length();
        if (i11 + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i11);
        return length;
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6306i
    public int appendUnquotedUTF8(byte[] bArr, int i11) {
        byte[] bArrM11005i = this._unquotedUTF8Ref;
        if (bArrM11005i == null) {
            bArrM11005i = f10066b.m11005i(this._value);
            this._unquotedUTF8Ref = bArrM11005i;
        }
        int length = bArrM11005i.length;
        if (i11 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrM11005i, 0, bArr, i11, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6306i
    public final char[] asQuotedChars() {
        char[] cArr = this._quotedChars;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrM11006k = f10066b.m11006k(this._value);
        this._quotedChars = cArrM11006k;
        return cArrM11006k;
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6306i
    public final byte[] asQuotedUTF8() {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrM11007l = f10066b.m11007l(this._value);
        this._quotedUTF8Ref = bArrM11007l;
        return bArrM11007l;
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6306i
    public final byte[] asUnquotedUTF8() {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrM11005i = f10066b.m11005i(this._value);
        this._unquotedUTF8Ref = bArrM11005i;
        return bArrM11005i;
    }

    public final int charLength() {
        return this._value.length();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._value.equals(((SerializedString) obj)._value);
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6306i
    public final String getValue() {
        return this._value;
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    public int putQuotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArrM11007l = this._quotedUTF8Ref;
        if (bArrM11007l == null) {
            bArrM11007l = f10066b.m11007l(this._value);
            this._quotedUTF8Ref = bArrM11007l;
        }
        int length = bArrM11007l.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrM11007l, 0, length);
        return length;
    }

    public int putUnquotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArrM11005i = this._unquotedUTF8Ref;
        if (bArrM11005i == null) {
            bArrM11005i = f10066b.m11005i(this._value);
            this._unquotedUTF8Ref = bArrM11005i;
        }
        int length = bArrM11005i.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrM11005i, 0, length);
        return length;
    }

    public Object readResolve() {
        return new SerializedString(this._jdkSerializeValue);
    }

    public final String toString() {
        return this._value;
    }

    public int writeQuotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArrM11007l = this._quotedUTF8Ref;
        if (bArrM11007l == null) {
            bArrM11007l = f10066b.m11007l(this._value);
            this._quotedUTF8Ref = bArrM11007l;
        }
        int length = bArrM11007l.length;
        outputStream.write(bArrM11007l, 0, length);
        return length;
    }

    public int writeUnquotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArrM11005i = this._unquotedUTF8Ref;
        if (bArrM11005i == null) {
            bArrM11005i = f10066b.m11005i(this._value);
            this._unquotedUTF8Ref = bArrM11005i;
        }
        int length = bArrM11005i.length;
        outputStream.write(bArrM11005i, 0, length);
        return length;
    }

    public SerializedString(String str) {
        if (str != null) {
            this._value = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this._jdkSerializeValue = objectInputStream.readUTF();
    }
}
