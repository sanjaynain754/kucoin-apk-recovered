package androidx.constraintlayout.core.parser;

import androidx.credentials.provider.CredentialEntry;

/* JADX INFO: loaded from: classes23.dex */
public class CLToken extends CLElement {
    int mIndex;
    char[] mTokenFalse;
    char[] mTokenNull;
    char[] mTokenTrue;
    Type mType;

    public enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public static CLElement allocate(char[] cArr) {
        return new CLToken(cArr);
    }

    public boolean getBoolean() throws CLParsingException {
        Type type = this.mType;
        if (type == Type.TRUE) {
            return true;
        }
        if (type == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + content() + ">", this);
    }

    public Type getType() {
        return this.mType;
    }

    public boolean isNull() throws CLParsingException {
        if (this.mType == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + content() + ">", this);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        addIndent(sb2, i11);
        sb2.append(content());
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        if (!CLParser.sDebug) {
            return content();
        }
        return "<" + content() + ">";
    }

    public boolean validate(char c11, long j11) {
        int iOrdinal = this.mType.ordinal();
        boolean z11 = false;
        if (iOrdinal == 0) {
            char[] cArr = this.mTokenTrue;
            int i11 = this.mIndex;
            if (cArr[i11] == c11) {
                this.mType = Type.TRUE;
            } else if (this.mTokenFalse[i11] == c11) {
                this.mType = Type.FALSE;
            } else if (this.mTokenNull[i11] == c11) {
                this.mType = Type.NULL;
            }
            z11 = true;
        } else if (iOrdinal == 1) {
            char[] cArr2 = this.mTokenTrue;
            int i12 = this.mIndex;
            z11 = cArr2[i12] == c11;
            if (z11 && i12 + 1 == cArr2.length) {
                setEnd(j11);
            }
        } else if (iOrdinal == 2) {
            char[] cArr3 = this.mTokenFalse;
            int i13 = this.mIndex;
            z11 = cArr3[i13] == c11;
            if (z11 && i13 + 1 == cArr3.length) {
                setEnd(j11);
            }
        } else if (iOrdinal == 3) {
            char[] cArr4 = this.mTokenNull;
            int i14 = this.mIndex;
            z11 = cArr4[i14] == c11;
            if (z11 && i14 + 1 == cArr4.length) {
                setEnd(j11);
            }
        }
        this.mIndex++;
        return z11;
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.mIndex = 0;
        this.mType = Type.UNKNOWN;
        this.mTokenTrue = CredentialEntry.TRUE_STRING.toCharArray();
        this.mTokenFalse = CredentialEntry.FALSE_STRING.toCharArray();
        this.mTokenNull = "null".toCharArray();
    }
}
