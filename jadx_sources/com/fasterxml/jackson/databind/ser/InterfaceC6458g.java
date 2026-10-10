package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.ObjectNode;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.g */
/* JADX INFO: compiled from: PropertyFilter.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC6458g {
    /* JADX INFO: renamed from: a */
    void m11775a(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, PropertyWriter propertyWriter) throws Exception;

    @Deprecated
    /* JADX INFO: renamed from: b */
    void m11776b(PropertyWriter propertyWriter, ObjectNode objectNode, AbstractC6446m abstractC6446m) throws JsonMappingException;
}
