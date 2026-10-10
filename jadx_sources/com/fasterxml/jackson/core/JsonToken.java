package com.fasterxml.jackson.core;

import androidx.credentials.provider.CredentialEntry;

/* JADX INFO: loaded from: classes45.dex */
public enum JsonToken {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE(CredentialEntry.TRUE_STRING, 9),
    VALUE_FALSE(CredentialEntry.FALSE_STRING, 10),
    VALUE_NULL("null", 11);

    final int _id;
    final boolean _isBoolean;
    final boolean _isNumber;
    final boolean _isScalar;
    final boolean _isStructEnd;
    final boolean _isStructStart;
    final String _serialized;
    final byte[] _serializedBytes;
    final char[] _serializedChars;

    public final byte[] asByteArray() {
        return this._serializedBytes;
    }

    public final char[] asCharArray() {
        return this._serializedChars;
    }

    public final String asString() {
        return this._serialized;
    }

    /* JADX INFO: renamed from: id */
    public final int m10917id() {
        return this._id;
    }

    public final boolean isBoolean() {
        return this._isBoolean;
    }

    public final boolean isNumeric() {
        return this._isNumber;
    }

    public final boolean isScalarValue() {
        return this._isScalar;
    }

    public final boolean isStructEnd() {
        return this._isStructEnd;
    }

    public final boolean isStructStart() {
        return this._isStructStart;
    }

    JsonToken(String str, int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
        } else {
            this._serialized = str;
            char[] charArray = str.toCharArray();
            this._serializedChars = charArray;
            int length = charArray.length;
            this._serializedBytes = new byte[length];
            for (int i12 = 0; i12 < length; i12++) {
                this._serializedBytes[i12] = (byte) this._serializedChars[i12];
            }
        }
        this._id = i11;
        if (i11 != 10 && i11 != 9) {
            z11 = false;
        } else {
            z11 = true;
        }
        this._isBoolean = z11;
        if (i11 != 7 && i11 != 8) {
            z12 = false;
        } else {
            z12 = true;
        }
        this._isNumber = z12;
        if (i11 != 1 && i11 != 3) {
            z13 = false;
        } else {
            z13 = true;
        }
        this._isStructStart = z13;
        if (i11 != 2 && i11 != 4) {
            z14 = false;
        } else {
            z14 = true;
        }
        this._isStructEnd = z14;
        if (!z13 && !z14 && i11 != 5 && i11 != -1) {
            z15 = true;
        }
        this._isScalar = z15;
    }
}
