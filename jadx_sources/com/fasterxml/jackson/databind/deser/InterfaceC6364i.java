package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.i */
/* JADX INFO: compiled from: KeyDeserializers.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC6364i {
    AbstractC6394i findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b) throws JsonMappingException;
}
