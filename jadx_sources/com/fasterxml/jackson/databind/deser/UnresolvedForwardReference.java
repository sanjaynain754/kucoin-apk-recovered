package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.C6373h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class UnresolvedForwardReference extends JsonMappingException {
    private static final long serialVersionUID = 1;
    private C6373h _roid;
    private List<C6377l> _unresolvedIds;

    public UnresolvedForwardReference(JsonParser jsonParser, String str, JsonLocation jsonLocation, C6373h c6373h) {
        super(jsonParser, str, jsonLocation);
        this._roid = c6373h;
    }

    public void addUnresolvedId(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this._unresolvedIds.add(new C6377l(obj, cls, jsonLocation));
    }

    @Override // java.lang.Throwable
    public synchronized UnresolvedForwardReference fillInStackTrace() {
        return this;
    }

    public C6373h getRoid() {
        return this._roid;
    }

    public Object getUnresolvedId() {
        return this._roid.m11375c().key;
    }

    public List<C6377l> getUnresolvedIds() {
        return this._unresolvedIds;
    }

    public UnresolvedForwardReference(JsonParser jsonParser, String str) {
        super(jsonParser, str);
        this._unresolvedIds = new ArrayList();
    }

    @Override // com.fasterxml.jackson.databind.JsonMappingException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this._unresolvedIds == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(message);
        Iterator<C6377l> it = this._unresolvedIds.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append('.');
        return sb2.toString();
    }

    public UnresolvedForwardReference withStackTrace() {
        super.fillInStackTrace();
        return this;
    }

    @Deprecated
    public UnresolvedForwardReference(String str, JsonLocation jsonLocation, C6373h c6373h) {
        super(str, jsonLocation);
        this._roid = c6373h;
    }

    @Deprecated
    public UnresolvedForwardReference(String str) {
        super(str);
        this._unresolvedIds = new ArrayList();
    }
}
