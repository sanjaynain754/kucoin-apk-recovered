package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.p062io.ContentReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

/* JADX INFO: loaded from: classes45.dex */
public class JsonLocationInstantiator extends ValueInstantiator.Base {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromObjectWith() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) {
        return new JsonLocation(ContentReference.rawReference(objArr[0]), m11401b(objArr[1]), m11401b(objArr[2]), m11400a(objArr[3]), m11400a(objArr[4]));
    }

    public JsonLocationInstantiator() {
        super((Class<?>) JsonLocation.class);
    }

    /* JADX INFO: renamed from: a */
    public static final int m11400a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return ((Number) obj).intValue();
    }

    /* JADX INFO: renamed from: b */
    public static final long m11401b(Object obj) {
        if (obj == null) {
            return 0L;
        }
        return ((Number) obj).longValue();
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        JavaType javaTypeConstructType = deserializationConfig.constructType(Integer.TYPE);
        JavaType javaTypeConstructType2 = deserializationConfig.constructType(Long.TYPE);
        return new SettableBeanProperty[]{m11402c("sourceRef", deserializationConfig.constructType(Object.class), 0), m11402c("byteOffset", javaTypeConstructType2, 1), m11402c("charOffset", javaTypeConstructType2, 2), m11402c("lineNr", javaTypeConstructType, 3), m11402c("columnNr", javaTypeConstructType, 4)};
    }

    /* JADX INFO: renamed from: c */
    public static CreatorProperty m11402c(String str, JavaType javaType, int i11) {
        return CreatorProperty.construct(PropertyName.construct(str), javaType, null, null, null, null, i11, null, PropertyMetadata.STD_REQUIRED);
    }
}
