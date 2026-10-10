package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.C6406c;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.impl.AbstractC6464b;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public abstract class VirtualBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    private static final long serialVersionUID = 1;

    public VirtualBeanPropertyWriter(AbstractC6414k abstractC6414k, InterfaceC6484a interfaceC6484a, JavaType javaType) {
        this(abstractC6414k, interfaceC6484a, javaType, null, null, null, abstractC6414k.mo11530c());
    }

    public static boolean _suppressNulls(JsonInclude.Value value) {
        JsonInclude.Include valueInclusion;
        return (value == null || (valueInclusion = value.getValueInclusion()) == JsonInclude.Include.ALWAYS || valueInclusion == JsonInclude.Include.USE_DEFAULTS) ? false : true;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase
    public boolean isVirtual() {
        return true;
    }

    public abstract Object value(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception;

    public abstract VirtualBeanPropertyWriter withConfig(MapperConfig<?> mapperConfig, C6406c c6406c, AbstractC6414k abstractC6414k, JavaType javaType);

    public static Object _suppressableValue(JsonInclude.Value value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        JsonInclude.Include valueInclusion = value.getValueInclusion();
        if (valueInclusion == JsonInclude.Include.ALWAYS || valueInclusion == JsonInclude.Include.NON_NULL || valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
            return null;
        }
        return BeanPropertyWriter.MARKER_FOR_EMPTY;
    }

    public VirtualBeanPropertyWriter() {
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
        Object objValue = value(obj, jsonGenerator, abstractC6446m);
        if (objValue == null) {
            AbstractC6393h<Object> abstractC6393h = this._nullSerializer;
            if (abstractC6393h != null) {
                abstractC6393h.serialize(null, jsonGenerator, abstractC6446m);
                return;
            } else {
                jsonGenerator.mo10812b0();
                return;
            }
        }
        AbstractC6393h<?> abstractC6393h_findAndAddDynamic = this._serializer;
        if (abstractC6393h_findAndAddDynamic == null) {
            Class<?> cls = objValue.getClass();
            AbstractC6464b abstractC6464b = this._dynamicSerializers;
            AbstractC6393h<?> abstractC6393hMo11808k = abstractC6464b.mo11808k(cls);
            if (abstractC6393hMo11808k == null) {
                abstractC6393h_findAndAddDynamic = _findAndAddDynamic(abstractC6464b, cls, abstractC6446m);
            } else {
                abstractC6393h_findAndAddDynamic = abstractC6393hMo11808k;
            }
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj2) {
                if (abstractC6393h_findAndAddDynamic.isEmpty(abstractC6446m, objValue)) {
                    serializeAsPlaceholder(obj, jsonGenerator, abstractC6446m);
                    return;
                }
            } else if (obj2.equals(objValue)) {
                serializeAsPlaceholder(obj, jsonGenerator, abstractC6446m);
                return;
            }
        }
        if (objValue == obj && _handleSelfReference(obj, jsonGenerator, abstractC6446m, abstractC6393h_findAndAddDynamic)) {
            return;
        }
        AbstractC6431e abstractC6431e = this._typeSerializer;
        if (abstractC6431e == null) {
            abstractC6393h_findAndAddDynamic.serialize(objValue, jsonGenerator, abstractC6446m);
        } else {
            abstractC6393h_findAndAddDynamic.serializeWithType(objValue, jsonGenerator, abstractC6446m, abstractC6431e);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
        Object objValue = value(obj, jsonGenerator, abstractC6446m);
        if (objValue == null) {
            if (this._nullSerializer != null) {
                jsonGenerator.mo10808Z(this._name);
                this._nullSerializer.serialize(null, jsonGenerator, abstractC6446m);
                return;
            }
            return;
        }
        AbstractC6393h<?> abstractC6393h_findAndAddDynamic = this._serializer;
        if (abstractC6393h_findAndAddDynamic == null) {
            Class<?> cls = objValue.getClass();
            AbstractC6464b abstractC6464b = this._dynamicSerializers;
            AbstractC6393h<?> abstractC6393hMo11808k = abstractC6464b.mo11808k(cls);
            if (abstractC6393hMo11808k == null) {
                abstractC6393h_findAndAddDynamic = _findAndAddDynamic(abstractC6464b, cls, abstractC6446m);
            } else {
                abstractC6393h_findAndAddDynamic = abstractC6393hMo11808k;
            }
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj2) {
                if (abstractC6393h_findAndAddDynamic.isEmpty(abstractC6446m, objValue)) {
                    return;
                }
            } else if (obj2.equals(objValue)) {
                return;
            }
        }
        if (objValue == obj && _handleSelfReference(obj, jsonGenerator, abstractC6446m, abstractC6393h_findAndAddDynamic)) {
            return;
        }
        jsonGenerator.mo10808Z(this._name);
        AbstractC6431e abstractC6431e = this._typeSerializer;
        if (abstractC6431e == null) {
            abstractC6393h_findAndAddDynamic.serialize(objValue, jsonGenerator, abstractC6446m);
        } else {
            abstractC6393h_findAndAddDynamic.serializeWithType(objValue, jsonGenerator, abstractC6446m, abstractC6431e);
        }
    }

    public VirtualBeanPropertyWriter(AbstractC6414k abstractC6414k, InterfaceC6484a interfaceC6484a, JavaType javaType, AbstractC6393h<?> abstractC6393h, AbstractC6431e abstractC6431e, JavaType javaType2, JsonInclude.Value value, Class<?>[] clsArr) {
        super(abstractC6414k, abstractC6414k.mo11542o(), interfaceC6484a, javaType, abstractC6393h, abstractC6431e, javaType2, _suppressNulls(value), _suppressableValue(value), clsArr);
    }

    @Deprecated
    public VirtualBeanPropertyWriter(AbstractC6414k abstractC6414k, InterfaceC6484a interfaceC6484a, JavaType javaType, AbstractC6393h<?> abstractC6393h, AbstractC6431e abstractC6431e, JavaType javaType2, JsonInclude.Value value) {
        this(abstractC6414k, interfaceC6484a, javaType, abstractC6393h, abstractC6431e, javaType2, value, null);
    }

    public VirtualBeanPropertyWriter(VirtualBeanPropertyWriter virtualBeanPropertyWriter) {
        super(virtualBeanPropertyWriter);
    }

    public VirtualBeanPropertyWriter(VirtualBeanPropertyWriter virtualBeanPropertyWriter, PropertyName propertyName) {
        super(virtualBeanPropertyWriter, propertyName);
    }
}
