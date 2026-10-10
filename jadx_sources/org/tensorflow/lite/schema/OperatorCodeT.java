package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class OperatorCodeT {
    private byte deprecatedBuiltinCode = 0;
    private String customCode = null;
    private int version = 1;
    private int builtinCode = 0;

    public int getBuiltinCode() {
        return this.builtinCode;
    }

    public String getCustomCode() {
        return this.customCode;
    }

    public byte getDeprecatedBuiltinCode() {
        return this.deprecatedBuiltinCode;
    }

    public int getVersion() {
        return this.version;
    }

    public void setBuiltinCode(int i11) {
        this.builtinCode = i11;
    }

    public void setCustomCode(String str) {
        this.customCode = str;
    }

    public void setDeprecatedBuiltinCode(byte b11) {
        this.deprecatedBuiltinCode = b11;
    }

    public void setVersion(int i11) {
        this.version = i11;
    }
}
