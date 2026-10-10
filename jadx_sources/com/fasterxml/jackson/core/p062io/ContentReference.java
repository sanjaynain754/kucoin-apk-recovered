package com.fasterxml.jackson.core.p062io;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes45.dex */
public class ContentReference implements Serializable {
    public static final int DEFAULT_MAX_CONTENT_SNIPPET = 500;
    protected static final ContentReference UNKNOWN_CONTENT = new ContentReference(false, null);
    private static final long serialVersionUID = 1;
    protected final boolean _isContentTextual;
    protected final int _length;
    protected final int _offset;
    protected final transient Object _rawContent;

    public ContentReference(boolean z11, Object obj) {
        this(z11, obj, -1, -1);
    }

    public static ContentReference construct(boolean z11, Object obj) {
        return new ContentReference(z11, obj);
    }

    public static ContentReference rawReference(boolean z11, Object obj) {
        return obj instanceof ContentReference ? (ContentReference) obj : new ContentReference(z11, obj);
    }

    public String _truncate(CharSequence charSequence, int[] iArr, int i11) {
        _truncateOffsets(iArr, charSequence.length());
        int i12 = iArr[0];
        return charSequence.subSequence(i12, Math.min(iArr[1], i11) + i12).toString();
    }

    public void _truncateOffsets(int[] iArr, int i11) {
        int i12 = iArr[0];
        if (i12 < 0) {
            i12 = 0;
        } else if (i12 >= i11) {
            i12 = i11;
        }
        iArr[0] = i12;
        int i13 = iArr[1];
        int i14 = i11 - i12;
        if (i13 < 0 || i13 > i14) {
            iArr[1] = i14;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ContentReference)) {
            return false;
        }
        ContentReference contentReference = (ContentReference) obj;
        if (this._offset != contentReference._offset || this._length != contentReference._length) {
            return false;
        }
        Object obj2 = contentReference._rawContent;
        Object obj3 = this._rawContent;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        if ((obj3 instanceof File) || (obj3 instanceof URL) || (obj3 instanceof URI)) {
            return obj3.equals(obj2);
        }
        return obj3 == obj2;
    }

    public ContentReference(boolean z11, Object obj, int i11, int i12) {
        this._isContentTextual = z11;
        this._rawContent = obj;
        this._offset = i11;
        this._length = i12;
    }

    public static ContentReference construct(boolean z11, Object obj, int i11, int i12) {
        return new ContentReference(z11, obj, i11, i12);
    }

    public static ContentReference unknown() {
        return UNKNOWN_CONTENT;
    }

    public int _append(StringBuilder sb2, String str) {
        sb2.append('\"');
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (!Character.isISOControl(cCharAt) || !_appendEscaped(sb2, cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        sb2.append('\"');
        return str.length();
    }

    public boolean _appendEscaped(StringBuilder sb2, int i11) {
        if (i11 == 13 || i11 == 10) {
            return false;
        }
        sb2.append('\\');
        sb2.append('u');
        sb2.append(C6308b.m10972l((i11 >> 12) & 15));
        sb2.append(C6308b.m10972l((i11 >> 8) & 15));
        sb2.append(C6308b.m10972l((i11 >> 4) & 15));
        sb2.append(C6308b.m10972l(i11 & 15));
        return true;
    }

    public String buildSourceDescription() {
        return appendSourceDescription(new StringBuilder(200)).toString();
    }

    public int contentLength() {
        return this._length;
    }

    public int contentOffset() {
        return this._offset;
    }

    public Object getRawContent() {
        return this._rawContent;
    }

    public boolean hasTextualContent() {
        return this._isContentTextual;
    }

    public int hashCode() {
        return Objects.hashCode(this._rawContent);
    }

    public int maxContentSnippetLength() {
        return 500;
    }

    public Object readResolve() {
        return UNKNOWN_CONTENT;
    }

    public StringBuilder appendSourceDescription(StringBuilder sb2) {
        Class<?> cls;
        String str_truncate;
        Object rawContent = getRawContent();
        if (rawContent == null) {
            sb2.append("UNKNOWN");
            return sb2;
        }
        if (rawContent instanceof Class) {
            cls = (Class) rawContent;
        } else {
            cls = rawContent.getClass();
        }
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (rawContent instanceof byte[]) {
            name = "byte[]";
        } else if (rawContent instanceof char[]) {
            name = "char[]";
        }
        sb2.append('(');
        sb2.append(name);
        sb2.append(')');
        if (hasTextualContent()) {
            int iMaxContentSnippetLength = maxContentSnippetLength();
            int[] iArr = {contentOffset(), contentLength()};
            String str = " chars";
            if (rawContent instanceof CharSequence) {
                str_truncate = _truncate((CharSequence) rawContent, iArr, iMaxContentSnippetLength);
            } else if (rawContent instanceof char[]) {
                str_truncate = _truncate((char[]) rawContent, iArr, iMaxContentSnippetLength);
            } else if (rawContent instanceof byte[]) {
                str_truncate = _truncate((byte[]) rawContent, iArr, iMaxContentSnippetLength);
                str = " bytes";
            } else {
                str_truncate = null;
            }
            if (str_truncate != null) {
                _append(sb2, str_truncate);
                if (iArr[1] > iMaxContentSnippetLength) {
                    sb2.append("[truncated ");
                    sb2.append(iArr[1] - iMaxContentSnippetLength);
                    sb2.append(str);
                    sb2.append(']');
                    return sb2;
                }
            }
        } else if (rawContent instanceof byte[]) {
            int iContentLength = contentLength();
            if (iContentLength < 0) {
                iContentLength = ((byte[]) rawContent).length;
            }
            sb2.append('[');
            sb2.append(iContentLength);
            sb2.append(" bytes]");
        }
        return sb2;
    }

    public static ContentReference rawReference(Object obj) {
        return rawReference(false, obj);
    }

    public String _truncate(char[] cArr, int[] iArr, int i11) {
        _truncateOffsets(iArr, cArr.length);
        return new String(cArr, iArr[0], Math.min(iArr[1], i11));
    }

    public String _truncate(byte[] bArr, int[] iArr, int i11) {
        _truncateOffsets(iArr, bArr.length);
        return new String(bArr, iArr[0], Math.min(iArr[1], i11), Charset.forName("UTF-8"));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }
}
