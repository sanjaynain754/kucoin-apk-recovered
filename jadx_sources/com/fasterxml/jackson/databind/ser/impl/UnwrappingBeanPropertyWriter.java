package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p062io.SerializedString;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import p528p7.InterfaceC43399e;
import p528p7.InterfaceC43404j;

/* JADX INFO: loaded from: classes45.dex */
public class UnwrappingBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    private static final long serialVersionUID = 1;
    protected final NameTransformer _nameTransformer;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$a */
    public class C6462a extends InterfaceC43399e.a {
        @Override // p528p7.InterfaceC43399e
        /* JADX INFO: renamed from: d */
        public InterfaceC43404j mo11794d(JavaType javaType) throws JsonMappingException {
            return null;
        }

        public C6462a(AbstractC6446m abstractC6446m, InterfaceC43404j interfaceC43404j) {
            super(abstractC6446m);
        }
    }

    public UnwrappingBeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, NameTransformer nameTransformer) {
        super(beanPropertyWriter);
        this._nameTransformer = nameTransformer;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public boolean isUnwrapping() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public AbstractC6393h<Object> _findAndAddDynamic(AbstractC6464b abstractC6464b, Class<?> cls, AbstractC6446m abstractC6446m) throws JsonMappingException {
        JavaType javaType = this._nonTrivialBaseType;
        AbstractC6393h<Object> abstractC6393hFindValueSerializer = javaType != null ? abstractC6446m.findValueSerializer(abstractC6446m.constructSpecializedType(javaType, cls), this) : abstractC6446m.findValueSerializer(cls, this);
        NameTransformer nameTransformerChainedTransformer = this._nameTransformer;
        if (abstractC6393hFindValueSerializer.isUnwrappingSerializer() && (abstractC6393hFindValueSerializer instanceof UnwrappingBeanSerializer)) {
            nameTransformerChainedTransformer = NameTransformer.chainedTransformer(nameTransformerChainedTransformer, ((UnwrappingBeanSerializer) abstractC6393hFindValueSerializer)._nameTransformer);
        }
        AbstractC6393h<Object> abstractC6393hUnwrappingSerializer = abstractC6393hFindValueSerializer.unwrappingSerializer(nameTransformerChainedTransformer);
        this._dynamicSerializers = this._dynamicSerializers.mo11807j(cls, abstractC6393hUnwrappingSerializer);
        return abstractC6393hUnwrappingSerializer;
    }

    public UnwrappingBeanPropertyWriter _new(NameTransformer nameTransformer, SerializedString serializedString) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer, serializedString);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void assignSerializer(AbstractC6393h<Object> abstractC6393h) {
        if (abstractC6393h != null) {
            NameTransformer nameTransformerChainedTransformer = this._nameTransformer;
            if (abstractC6393h.isUnwrappingSerializer() && (abstractC6393h instanceof UnwrappingBeanSerializer)) {
                nameTransformerChainedTransformer = NameTransformer.chainedTransformer(nameTransformerChainedTransformer, ((UnwrappingBeanSerializer) abstractC6393h)._nameTransformer);
            }
            abstractC6393h = abstractC6393h.unwrappingSerializer(nameTransformerChainedTransformer);
        }
        super.assignSerializer(abstractC6393h);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public UnwrappingBeanPropertyWriter rename(NameTransformer nameTransformer) {
        return _new(NameTransformer.chainedTransformer(nameTransformer, this._nameTransformer), new SerializedString(nameTransformer.transform(this._name.getValue())));
    }

    public UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter, NameTransformer nameTransformer, SerializedString serializedString) {
        super(unwrappingBeanPropertyWriter, serializedString);
        this._nameTransformer = nameTransformer;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void _depositSchemaProperty(ObjectNode objectNode, AbstractC6391f abstractC6391f) {
        AbstractC6391f abstractC6391f2 = abstractC6391f.get("properties");
        if (abstractC6391f2 != null) {
            Iterator<Map.Entry<String, AbstractC6391f>> itFields = abstractC6391f2.fields();
            while (itFields.hasNext()) {
                Map.Entry<String, AbstractC6391f> next = itFields.next();
                String key = next.getKey();
                NameTransformer nameTransformer = this._nameTransformer;
                if (nameTransformer != null) {
                    key = nameTransformer.transform(key);
                }
                objectNode.set(key, next.getValue());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(InterfaceC43404j interfaceC43404j, AbstractC6446m abstractC6446m) throws JsonMappingException {
        AbstractC6393h<Object> abstractC6393hUnwrappingSerializer = abstractC6446m.findValueSerializer(getType(), this).unwrappingSerializer(this._nameTransformer);
        if (abstractC6393hUnwrappingSerializer.isUnwrappingSerializer()) {
            abstractC6393hUnwrappingSerializer.acceptJsonFormatVisitor(new C6462a(abstractC6446m, interfaceC43404j), getType());
        } else {
            super.depositSchemaProperty(interfaceC43404j, abstractC6446m);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
        Object obj2 = get(obj);
        if (obj2 != null) {
            AbstractC6393h<?> abstractC6393h_findAndAddDynamic = this._serializer;
            if (abstractC6393h_findAndAddDynamic == null) {
                Class<?> cls = obj2.getClass();
                AbstractC6464b abstractC6464b = this._dynamicSerializers;
                AbstractC6393h<?> abstractC6393hMo11808k = abstractC6464b.mo11808k(cls);
                if (abstractC6393hMo11808k == null) {
                    abstractC6393h_findAndAddDynamic = _findAndAddDynamic(abstractC6464b, cls, abstractC6446m);
                } else {
                    abstractC6393h_findAndAddDynamic = abstractC6393hMo11808k;
                }
            }
            Object obj3 = this._suppressableValue;
            if (obj3 != null) {
                if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj3) {
                    if (abstractC6393h_findAndAddDynamic.isEmpty(abstractC6446m, obj2)) {
                        return;
                    }
                } else if (obj3.equals(obj2)) {
                    return;
                }
            }
            if (obj2 == obj && _handleSelfReference(obj, jsonGenerator, abstractC6446m, abstractC6393h_findAndAddDynamic)) {
                return;
            }
            if (!abstractC6393h_findAndAddDynamic.isUnwrappingSerializer()) {
                jsonGenerator.mo10808Z(this._name);
            }
            AbstractC6431e abstractC6431e = this._typeSerializer;
            if (abstractC6431e == null) {
                abstractC6393h_findAndAddDynamic.serialize(obj2, jsonGenerator, abstractC6446m);
            } else {
                abstractC6393h_findAndAddDynamic.serializeWithType(obj2, jsonGenerator, abstractC6446m, abstractC6431e);
            }
        }
    }
}
