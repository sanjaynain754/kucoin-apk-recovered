package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.InterfaceC6281l;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes45.dex */
public class JsonMappingException extends DatabindException {
    static final int MAX_REFS_TO_LIST = 1000;
    private static final long serialVersionUID = 3;
    protected LinkedList<Reference> _path;
    protected transient Closeable _processor;

    public static class Reference implements Serializable {
        private static final long serialVersionUID = 2;
        protected String _desc;
        protected String _fieldName;
        protected transient Object _from;
        protected int _index;

        public Reference() {
            this._index = -1;
        }

        public String getDescription() {
            if (this._desc == null) {
                StringBuilder sb2 = new StringBuilder();
                Object obj = this._from;
                if (obj != null) {
                    Class<?> componentType = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i11 = 0;
                    while (componentType.isArray()) {
                        componentType = componentType.getComponentType();
                        i11++;
                    }
                    sb2.append(componentType.getName());
                    while (true) {
                        i11--;
                        if (i11 < 0) {
                            break;
                        }
                        sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                    }
                } else {
                    sb2.append("UNKNOWN");
                }
                sb2.append('[');
                if (this._fieldName != null) {
                    sb2.append('\"');
                    sb2.append(this._fieldName);
                    sb2.append('\"');
                } else {
                    int i12 = this._index;
                    if (i12 >= 0) {
                        sb2.append(i12);
                    } else {
                        sb2.append('?');
                    }
                }
                sb2.append(']');
                this._desc = sb2.toString();
            }
            return this._desc;
        }

        public String getFieldName() {
            return this._fieldName;
        }

        @InterfaceC6281l
        public Object getFrom() {
            return this._from;
        }

        public int getIndex() {
            return this._index;
        }

        public void setDescription(String str) {
            this._desc = str;
        }

        public void setFieldName(String str) {
            this._fieldName = str;
        }

        public void setIndex(int i11) {
            this._index = i11;
        }

        public Reference(Object obj) {
            this._index = -1;
            this._from = obj;
        }

        public String toString() {
            return getDescription();
        }

        public Object writeReplace() {
            getDescription();
            return this;
        }

        public Reference(Object obj, String str) {
            this._index = -1;
            this._from = obj;
            if (str != null) {
                this._fieldName = str;
                return;
            }
            throw new NullPointerException("Cannot pass null fieldName");
        }

        public Reference(Object obj, int i11) {
            this._from = obj;
            this._index = i11;
        }
    }

    @Deprecated
    public JsonMappingException(String str) {
        super(str);
    }

    public static JsonMappingException from(JsonParser jsonParser, String str) {
        return new JsonMappingException(jsonParser, str);
    }

    public static JsonMappingException wrapWithPath(Throwable th2, Object obj, String str) {
        return wrapWithPath(th2, new Reference(obj, str));
    }

    public String getPathReference() {
        return getPathReference(new StringBuilder()).toString();
    }

    @Override // com.fasterxml.jackson.databind.DatabindException
    public void prependPath(Object obj, String str) {
        prependPath(new Reference(obj, str));
    }

    @Deprecated
    public JsonMappingException(String str, Throwable th2) {
        super(str, th2);
    }

    public static JsonMappingException from(JsonParser jsonParser, String str, Throwable th2) {
        return new JsonMappingException(jsonParser, str, th2);
    }

    public static JsonMappingException fromUnexpectedIOE(IOException iOException) {
        return new JsonMappingException((Closeable) null, String.format("Unexpected IOException (of type %s): %s", iOException.getClass().getName(), C6490g.m11952o(iOException)));
    }

    public static JsonMappingException wrapWithPath(Throwable th2, Object obj, int i11) {
        return wrapWithPath(th2, new Reference(obj, i11));
    }

    public void _appendPathDesc(StringBuilder sb2) {
        LinkedList<Reference> linkedList = this._path;
        if (linkedList == null) {
            return;
        }
        Iterator<Reference> it = linkedList.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append("->");
            }
        }
    }

    public List<Reference> getPath() {
        LinkedList<Reference> linkedList = this._path;
        return linkedList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(linkedList);
    }

    public StringBuilder getPathReference(StringBuilder sb2) {
        _appendPathDesc(sb2);
        return sb2;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    @InterfaceC6281l
    public Object getProcessor() {
        return this._processor;
    }

    @Override // com.fasterxml.jackson.databind.DatabindException
    public void prependPath(Object obj, int i11) {
        prependPath(new Reference(obj, i11));
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    @Deprecated
    public JsonMappingException(String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str) {
        return new JsonMappingException(jsonGenerator, str, (Throwable) null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    public static JsonMappingException wrapWithPath(Throwable th2, Reference reference) {
        Closeable closeable;
        JsonMappingException jsonMappingException;
        if (th2 instanceof JsonMappingException) {
            jsonMappingException = (JsonMappingException) th2;
        } else {
            String strM11952o = C6490g.m11952o(th2);
            if (strM11952o == null || strM11952o.isEmpty()) {
                strM11952o = "(was " + th2.getClass().getName() + ")";
            }
            if (th2 instanceof JacksonException) {
                Object processor = ((JacksonException) th2).getProcessor();
                if (processor instanceof Closeable) {
                    closeable = (Closeable) processor;
                } else {
                    closeable = null;
                }
            } else {
                closeable = null;
            }
            jsonMappingException = new JsonMappingException(closeable, strM11952o, th2);
        }
        jsonMappingException.prependPath(reference);
        return jsonMappingException;
    }

    public String _buildMessage() {
        StringBuilder sb2;
        String message = super.getMessage();
        if (this._path == null) {
            return message;
        }
        if (message == null) {
            sb2 = new StringBuilder();
        } else {
            sb2 = new StringBuilder(message);
        }
        sb2.append(" (through reference chain: ");
        StringBuilder pathReference = getPathReference(sb2);
        pathReference.append(')');
        return pathReference.toString();
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return _buildMessage();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return _buildMessage();
    }

    public void prependPath(Reference reference) {
        if (this._path == null) {
            this._path = new LinkedList<>();
        }
        if (this._path.size() < 1000) {
            this._path.addFirst(reference);
        }
    }

    public JsonMappingException withCause(Throwable th2) {
        initCause(th2);
        return this;
    }

    @Deprecated
    public JsonMappingException(String str, JsonLocation jsonLocation, Throwable th2) {
        super(str, jsonLocation, th2);
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str, Throwable th2) {
        return new JsonMappingException(jsonGenerator, str, th2);
    }

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this._processor = closeable;
        if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).mo10874a0();
        }
    }

    public static JsonMappingException from(DeserializationContext deserializationContext, String str) {
        return new JsonMappingException(deserializationContext.getParser(), str);
    }

    public static JsonMappingException from(DeserializationContext deserializationContext, String str, Throwable th2) {
        return new JsonMappingException(deserializationContext.getParser(), str, th2);
    }

    public static JsonMappingException from(AbstractC6446m abstractC6446m, String str) {
        return new JsonMappingException(abstractC6446m.getGenerator(), str);
    }

    public static JsonMappingException from(AbstractC6446m abstractC6446m, String str, Throwable th2) {
        return new JsonMappingException(abstractC6446m.getGenerator(), str, th2);
    }

    public JsonMappingException(Closeable closeable, String str, Throwable th2) {
        super(str, th2);
        this._processor = closeable;
        if (th2 instanceof JacksonException) {
            this._location = ((JacksonException) th2).getLocation();
        } else if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).mo10874a0();
        }
    }

    public JsonMappingException(Closeable closeable, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
        this._processor = closeable;
    }
}
