package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class NullsAsEmptyProvider implements InterfaceC6375j, Serializable {
    private static final long serialVersionUID = 1;
    protected final AbstractC6390e<?> _deserializer;

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getEmptyValue(deserializationContext);
    }

    public NullsAsEmptyProvider(AbstractC6390e<?> abstractC6390e) {
        this._deserializer = abstractC6390e;
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public /* bridge */ /* synthetic */ Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return super.getAbsentValue(deserializationContext);
    }
}
