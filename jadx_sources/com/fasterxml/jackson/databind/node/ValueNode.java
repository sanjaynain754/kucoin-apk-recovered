package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.C6301e;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ValueNode extends BaseJsonNode {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public AbstractC6391f _at(C6301e c6301e) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.InterfaceC6320l
    public abstract JsonToken asToken();

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final ObjectNode findParent(String str) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final AbstractC6391f findValue(String str) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final AbstractC6391f get(int i11) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final boolean has(int i11) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final boolean hasNonNull(int i11) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public boolean isEmpty() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final AbstractC6391f get(String str) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final boolean has(String str) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final boolean hasNonNull(String str) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final AbstractC6391f path(int i11) {
        return MissingNode.getInstance();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.InterfaceC6392g
    public void serializeWithType(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        WritableTypeId writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(this, asToken()));
        serialize(jsonGenerator, abstractC6446m);
        abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final AbstractC6391f path(String str) {
        return MissingNode.getInstance();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public <T extends AbstractC6391f> T deepCopy() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final List<AbstractC6391f> findParents(String str, List<AbstractC6391f> list) {
        return list;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final List<AbstractC6391f> findValues(String str, List<AbstractC6391f> list) {
        return list;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6391f
    public final List<String> findValuesAsText(String str, List<String> list) {
        return list;
    }
}
