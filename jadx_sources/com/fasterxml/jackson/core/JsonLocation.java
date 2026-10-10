package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p062io.ContentReference;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class JsonLocation implements Serializable {

    @Deprecated
    public static final int MAX_CONTENT_SNIPPET = 500;

    /* JADX INFO: renamed from: NA */
    public static final JsonLocation f10025NA = new JsonLocation(ContentReference.unknown(), -1L, -1L, -1, -1);
    private static final long serialVersionUID = 2;
    protected final int _columnNr;
    protected final ContentReference _contentReference;
    protected final int _lineNr;
    protected transient String _sourceDescription;
    protected final long _totalBytes;
    protected final long _totalChars;

    public JsonLocation(ContentReference contentReference, long j11, int i11, int i12) {
        this(contentReference, -1L, j11, i11, i12);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        JsonLocation jsonLocation = (JsonLocation) obj;
        ContentReference contentReference = this._contentReference;
        if (contentReference == null) {
            if (jsonLocation._contentReference != null) {
                return false;
            }
        } else if (!contentReference.equals(jsonLocation._contentReference)) {
            return false;
        }
        return this._lineNr == jsonLocation._lineNr && this._columnNr == jsonLocation._columnNr && this._totalChars == jsonLocation._totalChars && this._totalBytes == jsonLocation._totalBytes;
    }

    public JsonLocation(ContentReference contentReference, long j11, long j12, int i11, int i12) {
        this._contentReference = contentReference == null ? ContentReference.unknown() : contentReference;
        this._totalBytes = j11;
        this._totalChars = j12;
        this._lineNr = i11;
        this._columnNr = i12;
    }

    public static ContentReference _wrap(Object obj) {
        return obj instanceof ContentReference ? (ContentReference) obj : ContentReference.construct(false, obj);
    }

    public StringBuilder appendOffsetDescription(StringBuilder sb2) {
        if (this._contentReference.hasTextualContent()) {
            sb2.append("line: ");
            int i11 = this._lineNr;
            if (i11 >= 0) {
                sb2.append(i11);
            } else {
                sb2.append("UNKNOWN");
            }
            sb2.append(", column: ");
            int i12 = this._columnNr;
            if (i12 >= 0) {
                sb2.append(i12);
                return sb2;
            }
            sb2.append("UNKNOWN");
            return sb2;
        }
        if (this._lineNr > 0) {
            sb2.append("line: ");
            sb2.append(this._lineNr);
            if (this._columnNr > 0) {
                sb2.append(", column: ");
                sb2.append(this._columnNr);
            }
            return sb2;
        }
        sb2.append("byte offset: #");
        long j11 = this._totalBytes;
        if (j11 >= 0) {
            sb2.append(j11);
            return sb2;
        }
        sb2.append("UNKNOWN");
        return sb2;
    }

    public ContentReference contentReference() {
        return this._contentReference;
    }

    public long getByteOffset() {
        return this._totalBytes;
    }

    public long getCharOffset() {
        return this._totalChars;
    }

    public int getColumnNr() {
        return this._columnNr;
    }

    public int getLineNr() {
        return this._lineNr;
    }

    @Deprecated
    public Object getSourceRef() {
        return this._contentReference.getRawContent();
    }

    public int hashCode() {
        return ((((this._contentReference == null ? 1 : 2) ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    public String offsetDescription() {
        return appendOffsetDescription(new StringBuilder(40)).toString();
    }

    public String sourceDescription() {
        if (this._sourceDescription == null) {
            this._sourceDescription = this._contentReference.buildSourceDescription();
        }
        return this._sourceDescription;
    }

    public String toString() {
        String strSourceDescription = sourceDescription();
        StringBuilder sb2 = new StringBuilder(strSourceDescription.length() + 40);
        sb2.append("[Source: ");
        sb2.append(strSourceDescription);
        sb2.append("; ");
        StringBuilder sbAppendOffsetDescription = appendOffsetDescription(sb2);
        sbAppendOffsetDescription.append(']');
        return sbAppendOffsetDescription.toString();
    }

    @Deprecated
    public JsonLocation(Object obj, long j11, int i11, int i12) {
        this(_wrap(obj), j11, i11, i12);
    }

    @Deprecated
    public JsonLocation(Object obj, long j11, long j12, int i11, int i12) {
        this(_wrap(obj), j11, j12, i11, i12);
    }
}
