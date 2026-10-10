package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
public class FileSerializer extends StdScalarSerializer<File> {
    public FileSerializer() {
        super(File.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(File file, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10787C0(file.getAbsolutePath());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        visitStringFormat(interfaceC43399e, javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
        return createSchemaNode(TypedValues.Custom.S_STRING, true);
    }
}
