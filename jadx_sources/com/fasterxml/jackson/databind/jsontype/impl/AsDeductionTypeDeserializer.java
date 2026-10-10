package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.C6499p;
import java.io.IOException;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public class AsDeductionTypeDeserializer extends AsPropertyTypeDeserializer {

    /* JADX INFO: renamed from: b */
    public static final BitSet f10529b = new BitSet(0);
    private static final long serialVersionUID = 1;
    private final Map<String, Integer> fieldBitIndex;
    private final Map<BitSet, String> subtypeFingerprints;

    public AsDeductionTypeDeserializer(JavaType javaType, InterfaceC6429c interfaceC6429c, JavaType javaType2, DeserializationConfig deserializationConfig, Collection<NamedType> collection) {
        super(javaType, interfaceC6429c, null, false, javaType2, null);
        this.fieldBitIndex = new HashMap();
        this.subtypeFingerprints = buildFingerprints(deserializationConfig, collection);
    }

    public Map<BitSet, String> buildFingerprints(DeserializationConfig deserializationConfig, Collection<NamedType> collection) {
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        HashMap map = new HashMap();
        int i11 = 0;
        for (NamedType namedType : collection) {
            List<AbstractC6414k> listMo11169o = deserializationConfig.introspect(deserializationConfig.getTypeFactory().constructType(namedType.getType())).mo11169o();
            BitSet bitSet = new BitSet(listMo11169o.size() + i11);
            Iterator<AbstractC6414k> it = listMo11169o.iterator();
            while (it.hasNext()) {
                String name = it.next().getName();
                if (zIsEnabled) {
                    name = name.toLowerCase();
                }
                Integer numValueOf = this.fieldBitIndex.get(name);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i11);
                    this.fieldBitIndex.put(name, Integer.valueOf(i11));
                    i11++;
                }
                bitSet.set(numValueOf.intValue());
            }
            String str = (String) map.put(bitSet, namedType.getType().getName());
            if (str != null) {
                throw new IllegalStateException(String.format("Subtypes %s and %s have the same signature and cannot be uniquely deduced.", str, namedType.getType().getName()));
            }
        }
        return map;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public AbstractC6428b forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsDeductionTypeDeserializer(this, beanProperty);
    }

    /* JADX INFO: renamed from: a */
    public static void m11697a(List<BitSet> list, int i11) {
        Iterator<BitSet> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().get(i11)) {
                it.remove();
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k == JsonToken.START_OBJECT) {
            jsonTokenMo10889k = jsonParser.mo10905t0();
        } else if (jsonTokenMo10889k != JsonToken.FIELD_NAME) {
            return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, null, "Unexpected input");
        }
        if (jsonTokenMo10889k == JsonToken.END_OBJECT && (str = this.subtypeFingerprints.get(f10529b)) != null) {
            return _deserializeTypedForId(jsonParser, deserializationContext, null, str);
        }
        LinkedList linkedList = new LinkedList(this.subtypeFingerprints.keySet());
        C6499p c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        boolean zIsEnabled = deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            if (zIsEnabled) {
                strMo10887j = strMo10887j.toLowerCase();
            }
            c6499pBufferForInputBuffering.m12017X0(jsonParser);
            Integer num = this.fieldBitIndex.get(strMo10887j);
            if (num != null) {
                m11697a(linkedList, num.intValue());
                if (linkedList.size() == 1) {
                    return _deserializeTypedForId(jsonParser, deserializationContext, c6499pBufferForInputBuffering, this.subtypeFingerprints.get(linkedList.get(0)));
                }
            }
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, c6499pBufferForInputBuffering, String.format("Cannot deduce unique subtype of %s (%d candidates match)", C6490g.m11904G(this._baseType), Integer.valueOf(linkedList.size())));
    }

    public AsDeductionTypeDeserializer(AsDeductionTypeDeserializer asDeductionTypeDeserializer, BeanProperty beanProperty) {
        super(asDeductionTypeDeserializer, beanProperty);
        this.fieldBitIndex = asDeductionTypeDeserializer.fieldBitIndex;
        this.subtypeFingerprints = asDeductionTypeDeserializer.subtypeFingerprints;
    }
}
