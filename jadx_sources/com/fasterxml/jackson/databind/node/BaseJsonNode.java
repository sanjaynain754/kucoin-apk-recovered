package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public abstract class BaseJsonNode extends AbstractC6391f implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract JsonToken asToken();

    public abstract int hashCode();

    @Override // com.fasterxml.jackson.core.InterfaceC6320l
    public JsonParser.NumberType numberType() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f required(String str) {
        return (AbstractC6391f) _reportRequiredViolation("Node of type `%s` has no fields", getClass().getSimpleName());
    }

    @Override // com.fasterxml.jackson.databind.InterfaceC6392g
    public abstract void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException;

    @Override // com.fasterxml.jackson.databind.InterfaceC6392g
    public abstract void serializeWithType(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException;

    public JsonParser traverse() {
        return new C6450d(this);
    }

    public JsonParser traverse(AbstractC6304g abstractC6304g) {
        return new C6450d(this, abstractC6304g);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final AbstractC6391f findPath(String str) {
        AbstractC6391f abstractC6391fFindValue = findValue(str);
        if (abstractC6391fFindValue == null) {
            return MissingNode.getInstance();
        }
        return abstractC6391fFindValue;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f required(int i11) {
        return (AbstractC6391f) _reportRequiredViolation("Node of type `%s` has no indexed values", getClass().getSimpleName());
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public String toPrettyString() {
        return C6448b.m11726b(this);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public String toString() {
        return C6448b.m11727c(this);
    }

    public Object writeReplace() {
        return NodeSerialization.from(this);
    }
}
