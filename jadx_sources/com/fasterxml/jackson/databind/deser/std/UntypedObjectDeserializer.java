package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.InterfaceC6376k;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.C6495l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class UntypedObjectDeserializer extends StdDeserializer<Object> implements InterfaceC6376k, InterfaceC6358c {
    protected static final Object[] NO_OBJECTS = new Object[0];
    private static final long serialVersionUID = 1;
    protected AbstractC6390e<Object> _listDeserializer;
    protected JavaType _listType;
    protected AbstractC6390e<Object> _mapDeserializer;
    protected JavaType _mapType;
    protected final boolean _nonMerging;
    protected AbstractC6390e<Object> _numberDeserializer;
    protected AbstractC6390e<Object> _stringDeserializer;

    @InterfaceC42435a
    public static class Vanilla extends StdDeserializer<Object> {
        private static final long serialVersionUID = 1;
        public static final Vanilla std = new Vanilla();
        protected final boolean _nonMerging;

        public Vanilla() {
            this(false);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return m11422b(jsonParser, deserializationContext, 0);
        }

        @Deprecated
        public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return mapArray(jsonParser, deserializationContext, 0);
        }

        @Deprecated
        public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return mapArrayToArray(jsonParser, deserializationContext, 0);
        }

        @Deprecated
        public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return mapObject(jsonParser, deserializationContext, 0);
        }

        public Vanilla(boolean z11) {
            super((Class<?>) Object.class);
            this._nonMerging = z11;
        }

        /* JADX INFO: renamed from: a */
        private void m11421a(Map<String, Object> map, String str, Object obj, Object obj2) {
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                map.put(str, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                arrayList.add(obj2);
                map.put(str, arrayList);
            }
        }

        public static Vanilla instance(boolean z11) {
            return z11 ? new Vanilla(true) : std;
        }

        public Object _mapObjectWithDups(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
            boolean zIsEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
            if (zIsEnabled) {
                m11421a(map, str, obj, obj2);
            }
            while (str2 != null) {
                jsonParser.mo10905t0();
                Object objDeserialize = deserialize(jsonParser, deserializationContext);
                Object objPut = map.put(str2, objDeserialize);
                if (objPut != null && zIsEnabled) {
                    m11421a(map, str2, objPut, objDeserialize);
                }
                str2 = jsonParser.mo10903r0();
            }
            return map;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
        
            if (r5.mo10905t0() == com.fasterxml.jackson.core.JsonToken.END_OBJECT) goto L28;
         */
        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            if (this._nonMerging) {
                return deserialize(jsonParser, deserializationContext);
            }
            int iMo10891l = jsonParser.mo10891l();
            if (iMo10891l != 1) {
                if (iMo10891l != 2) {
                    if (iMo10891l != 3) {
                        if (iMo10891l != 4) {
                            if (iMo10891l == 5) {
                                if (obj instanceof Map) {
                                    Map map = (Map) obj;
                                    String strMo10887j = jsonParser.mo10887j();
                                    do {
                                        jsonParser.mo10905t0();
                                        Object obj2 = map.get(strMo10887j);
                                        Object objDeserialize = obj2 != null ? deserialize(jsonParser, deserializationContext, obj2) : deserialize(jsonParser, deserializationContext);
                                        if (objDeserialize != obj2) {
                                            map.put(strMo10887j, objDeserialize);
                                        }
                                        strMo10887j = jsonParser.mo10903r0();
                                    } while (strMo10887j != null);
                                    return obj;
                                }
                            }
                        }
                    } else if (jsonParser.mo10905t0() != JsonToken.END_ARRAY) {
                        if (obj instanceof Collection) {
                            Collection collection = (Collection) obj;
                            do {
                                collection.add(deserialize(jsonParser, deserializationContext));
                            } while (jsonParser.mo10905t0() != JsonToken.END_ARRAY);
                            return obj;
                        }
                    }
                }
                return obj;
            }
            return deserialize(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public LogicalType logicalType() {
            return LogicalType.Untyped;
        }

        public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext, int i11) throws IOException {
            int i12 = i11 + 1;
            Object objM11422b = m11422b(jsonParser, deserializationContext, i12);
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            int i13 = 2;
            if (jsonTokenMo10905t0 == jsonToken) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(objM11422b);
                return arrayList;
            }
            Object objM11422b2 = m11422b(jsonParser, deserializationContext, i12);
            if (jsonParser.mo10905t0() == jsonToken) {
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(objM11422b);
                arrayList2.add(objM11422b2);
                return arrayList2;
            }
            C6495l c6495lLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] objArrM11986i = c6495lLeaseObjectBuffer.m11986i();
            objArrM11986i[0] = objM11422b;
            objArrM11986i[1] = objM11422b2;
            int i14 = 2;
            while (true) {
                Object objM11422b3 = m11422b(jsonParser, deserializationContext, i12);
                i13++;
                if (i14 >= objArrM11986i.length) {
                    objArrM11986i = c6495lLeaseObjectBuffer.m11980c(objArrM11986i);
                    i14 = 0;
                }
                int i15 = i14 + 1;
                objArrM11986i[i14] = objM11422b3;
                if (jsonParser.mo10905t0() == JsonToken.END_ARRAY) {
                    ArrayList arrayList3 = new ArrayList(i13);
                    c6495lLeaseObjectBuffer.m11982e(objArrM11986i, i15, arrayList3);
                    return arrayList3;
                }
                i14 = i15;
            }
        }

        public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext, int i11) throws IOException {
            int i12 = i11 + 1;
            C6495l c6495lLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] objArrM11986i = c6495lLeaseObjectBuffer.m11986i();
            int i13 = 0;
            while (true) {
                Object objM11422b = m11422b(jsonParser, deserializationContext, i12);
                if (i13 >= objArrM11986i.length) {
                    objArrM11986i = c6495lLeaseObjectBuffer.m11980c(objArrM11986i);
                    i13 = 0;
                }
                int i14 = i13 + 1;
                objArrM11986i[i13] = objM11422b;
                if (jsonParser.mo10905t0() == JsonToken.END_ARRAY) {
                    return c6495lLeaseObjectBuffer.m11983f(objArrM11986i, i14);
                }
                i13 = i14;
            }
        }

        public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext, int i11) throws IOException {
            int i12 = i11 + 1;
            String strMo10887j = jsonParser.mo10887j();
            jsonParser.mo10905t0();
            Object objM11422b = m11422b(jsonParser, deserializationContext, i12);
            String strMo10903r0 = jsonParser.mo10903r0();
            if (strMo10903r0 == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(strMo10887j, objM11422b);
                return linkedHashMap;
            }
            jsonParser.mo10905t0();
            Object objM11422b2 = m11422b(jsonParser, deserializationContext, i12);
            String strMo10903r1 = jsonParser.mo10903r0();
            if (strMo10903r1 == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
                linkedHashMap2.put(strMo10887j, objM11422b);
                return linkedHashMap2.put(strMo10903r0, objM11422b2) != null ? _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap2, strMo10887j, objM11422b, objM11422b2, strMo10903r1) : linkedHashMap2;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put(strMo10887j, objM11422b);
            if (linkedHashMap3.put(strMo10903r0, objM11422b2) != null) {
                return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, strMo10887j, objM11422b, objM11422b2, strMo10903r1);
            }
            String strMo10903r2 = strMo10903r1;
            do {
                jsonParser.mo10905t0();
                Object objM11422b3 = m11422b(jsonParser, deserializationContext, i12);
                Object objPut = linkedHashMap3.put(strMo10903r2, objM11422b3);
                if (objPut != null) {
                    return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, strMo10903r2, objPut, objM11422b3, jsonParser.mo10903r0());
                }
                strMo10903r2 = jsonParser.mo10903r0();
            } while (strMo10903r2 != null);
            return linkedHashMap3;
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
            if (this._nonMerging) {
                return Boolean.FALSE;
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final Object m11422b(JsonParser jsonParser, DeserializationContext deserializationContext, int i11) throws IOException {
            switch (jsonParser.mo10891l()) {
                case 1:
                    if (jsonParser.mo10905t0() == JsonToken.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    if (jsonParser.mo10905t0() == JsonToken.END_ARRAY) {
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                            return UntypedObjectDeserializer.NO_OBJECTS;
                        }
                        return new ArrayList(2);
                    }
                    if (i11 <= 1000) {
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                            return mapArrayToArray(jsonParser, deserializationContext, i11);
                        }
                        return mapArray(jsonParser, deserializationContext, i11);
                    }
                    throw new JsonParseException(jsonParser, "JSON is too deeply nested.");
                case 4:
                default:
                    return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
                case 5:
                    break;
                case 6:
                    return jsonParser.mo10869W();
                case 7:
                    if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                        return _coerceIntegral(jsonParser, deserializationContext);
                    }
                    return jsonParser.mo10863Q();
                case 8:
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.mo10855C();
                    }
                    return jsonParser.mo10863Q();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.mo10858J();
            }
            if (i11 <= 1000) {
                return mapObject(jsonParser, deserializationContext, i11);
            }
            throw new JsonParseException(jsonParser, "JSON is too deeply nested.");
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
            int iMo10891l = jsonParser.mo10891l();
            if (iMo10891l != 1 && iMo10891l != 3) {
                switch (iMo10891l) {
                    case 5:
                        break;
                    case 6:
                        return jsonParser.mo10869W();
                    case 7:
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                            return jsonParser.mo10895n();
                        }
                        return jsonParser.mo10863Q();
                    case 8:
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                            return jsonParser.mo10855C();
                        }
                        return jsonParser.mo10863Q();
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return jsonParser.mo10858J();
                    default:
                        return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
                }
            }
            return abstractC6428b.deserializeTypedFromAny(jsonParser, deserializationContext);
        }
    }

    @Deprecated
    public UntypedObjectDeserializer() {
        this((JavaType) null, (JavaType) null);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.mo10891l()) {
            case 1:
            case 2:
            case 5:
                AbstractC6390e<Object> abstractC6390e = this._mapDeserializer;
                return abstractC6390e != null ? abstractC6390e.deserialize(jsonParser, deserializationContext) : mapObject(jsonParser, deserializationContext);
            case 3:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return mapArrayToArray(jsonParser, deserializationContext);
                }
                AbstractC6390e<Object> abstractC6390e2 = this._listDeserializer;
                return abstractC6390e2 != null ? abstractC6390e2.deserialize(jsonParser, deserializationContext) : mapArray(jsonParser, deserializationContext);
            case 4:
            default:
                return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
            case 6:
                AbstractC6390e<Object> abstractC6390e3 = this._stringDeserializer;
                return abstractC6390e3 != null ? abstractC6390e3.deserialize(jsonParser, deserializationContext) : jsonParser.mo10869W();
            case 7:
                AbstractC6390e<Object> abstractC6390e4 = this._numberDeserializer;
                if (abstractC6390e4 != null) {
                    return abstractC6390e4.deserialize(jsonParser, deserializationContext);
                }
                return deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.mo10863Q();
            case 8:
                AbstractC6390e<Object> abstractC6390e5 = this._numberDeserializer;
                if (abstractC6390e5 != null) {
                    return abstractC6390e5.deserialize(jsonParser, deserializationContext);
                }
                return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.mo10855C() : jsonParser.mo10863Q();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.mo10858J();
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public boolean isCachable() {
        return true;
    }

    public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
        JsonToken jsonToken = JsonToken.END_ARRAY;
        int i11 = 2;
        if (jsonTokenMo10905t0 == jsonToken) {
            return new ArrayList(2);
        }
        Object objDeserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.mo10905t0() == jsonToken) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(objDeserialize);
            return arrayList;
        }
        Object objDeserialize2 = deserialize(jsonParser, deserializationContext);
        if (jsonParser.mo10905t0() == jsonToken) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(objDeserialize);
            arrayList2.add(objDeserialize2);
            return arrayList2;
        }
        C6495l c6495lLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrM11986i = c6495lLeaseObjectBuffer.m11986i();
        objArrM11986i[0] = objDeserialize;
        objArrM11986i[1] = objDeserialize2;
        int i12 = 2;
        while (true) {
            Object objDeserialize3 = deserialize(jsonParser, deserializationContext);
            i11++;
            if (i12 >= objArrM11986i.length) {
                objArrM11986i = c6495lLeaseObjectBuffer.m11980c(objArrM11986i);
                i12 = 0;
            }
            int i13 = i12 + 1;
            objArrM11986i[i12] = objDeserialize3;
            if (jsonParser.mo10905t0() == JsonToken.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i11);
                c6495lLeaseObjectBuffer.m11982e(objArrM11986i, i13, arrayList3);
                return arrayList3;
            }
            i12 = i13;
        }
    }

    public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strMo10887j;
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k == JsonToken.START_OBJECT) {
            strMo10887j = jsonParser.mo10903r0();
        } else if (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            strMo10887j = jsonParser.mo10887j();
        } else {
            if (jsonTokenMo10889k != JsonToken.END_OBJECT) {
                return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            }
            strMo10887j = null;
        }
        String str = strMo10887j;
        if (str == null) {
            return new LinkedHashMap(2);
        }
        jsonParser.mo10905t0();
        Object objDeserialize = deserialize(jsonParser, deserializationContext);
        String strMo10903r0 = jsonParser.mo10903r0();
        if (strMo10903r0 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(str, objDeserialize);
            return linkedHashMap;
        }
        jsonParser.mo10905t0();
        Object objDeserialize2 = deserialize(jsonParser, deserializationContext);
        String strMo10903r1 = jsonParser.mo10903r0();
        if (strMo10903r1 == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(str, objDeserialize);
            return linkedHashMap2.put(strMo10903r0, objDeserialize2) != null ? _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap2, str, objDeserialize, objDeserialize2, strMo10903r1) : linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(str, objDeserialize);
        if (linkedHashMap3.put(strMo10903r0, objDeserialize2) != null) {
            return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, str, objDeserialize, objDeserialize2, strMo10903r1);
        }
        do {
            jsonParser.mo10905t0();
            Object objDeserialize3 = deserialize(jsonParser, deserializationContext);
            Object objPut = linkedHashMap3.put(strMo10903r1, objDeserialize3);
            if (objPut != null) {
                return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, strMo10903r1, objPut, objDeserialize3, jsonParser.mo10903r0());
            }
            strMo10903r1 = jsonParser.mo10903r0();
        } while (strMo10903r1 != null);
        return linkedHashMap3;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    public UntypedObjectDeserializer(JavaType javaType, JavaType javaType2) {
        super((Class<?>) Object.class);
        this._listType = javaType;
        this._mapType = javaType2;
        this._nonMerging = false;
    }

    public Object _mapObjectWithDups(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
        boolean zIsEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
        if (zIsEnabled) {
            m11420a(map, str, obj, obj2);
        }
        while (str2 != null) {
            jsonParser.mo10905t0();
            Object objDeserialize = deserialize(jsonParser, deserializationContext);
            Object objPut = map.put(str2, objDeserialize);
            if (objPut != null && zIsEnabled) {
                m11420a(map, str, objPut, objDeserialize);
            }
            str2 = jsonParser.mo10903r0();
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public final void m11420a(Map<String, Object> map, String str, Object obj, Object obj2) {
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            map.put(str, obj);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            map.put(str, arrayList);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        boolean z11 = beanProperty == null && Boolean.FALSE.equals(deserializationContext.getConfig().getDefaultMergeable(Object.class));
        if (this._stringDeserializer == null && this._numberDeserializer == null && this._mapDeserializer == null && this._listDeserializer == null && getClass() == UntypedObjectDeserializer.class) {
            return Vanilla.instance(z11);
        }
        return z11 != this._nonMerging ? new UntypedObjectDeserializer(this, z11) : this;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6376k
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        JavaType javaTypeConstructType = deserializationContext.constructType(Object.class);
        JavaType javaTypeConstructType2 = deserializationContext.constructType(String.class);
        TypeFactory typeFactory = deserializationContext.getTypeFactory();
        JavaType javaType = this._listType;
        if (javaType == null) {
            this._listDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructCollectionType(List.class, javaTypeConstructType)));
        } else {
            this._listDeserializer = _findCustomDeser(deserializationContext, javaType);
        }
        JavaType javaType2 = this._mapType;
        if (javaType2 == null) {
            this._mapDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructMapType(Map.class, javaTypeConstructType2, javaTypeConstructType)));
        } else {
            this._mapDeserializer = _findCustomDeser(deserializationContext, javaType2);
        }
        this._stringDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, javaTypeConstructType2));
        this._numberDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructType(Number.class)));
        JavaType javaTypeUnknownType = TypeFactory.unknownType();
        this._mapDeserializer = deserializationContext.handleSecondaryContextualization(this._mapDeserializer, null, javaTypeUnknownType);
        this._listDeserializer = deserializationContext.handleSecondaryContextualization(this._listDeserializer, null, javaTypeUnknownType);
        this._stringDeserializer = deserializationContext.handleSecondaryContextualization(this._stringDeserializer, null, javaTypeUnknownType);
        this._numberDeserializer = deserializationContext.handleSecondaryContextualization(this._numberDeserializer, null, javaTypeUnknownType);
    }

    public AbstractC6390e<Object> _clearIfStdImpl(AbstractC6390e<Object> abstractC6390e) {
        if (C6490g.m11912O(abstractC6390e)) {
            return null;
        }
        return abstractC6390e;
    }

    public AbstractC6390e<Object> _findCustomDeser(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        return deserializationContext.findNonContextualValueDeserializer(javaType);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        int iMo10891l = jsonParser.mo10891l();
        if (iMo10891l != 1 && iMo10891l != 3) {
            switch (iMo10891l) {
                case 5:
                    break;
                case 6:
                    AbstractC6390e<Object> abstractC6390e = this._stringDeserializer;
                    if (abstractC6390e != null) {
                        return abstractC6390e.deserialize(jsonParser, deserializationContext);
                    }
                    return jsonParser.mo10869W();
                case 7:
                    AbstractC6390e<Object> abstractC6390e2 = this._numberDeserializer;
                    if (abstractC6390e2 != null) {
                        return abstractC6390e2.deserialize(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                        return _coerceIntegral(jsonParser, deserializationContext);
                    }
                    return jsonParser.mo10863Q();
                case 8:
                    AbstractC6390e<Object> abstractC6390e3 = this._numberDeserializer;
                    if (abstractC6390e3 != null) {
                        return abstractC6390e3.deserialize(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.mo10855C();
                    }
                    return jsonParser.mo10863Q();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.mo10858J();
                default:
                    return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
            }
        }
        return abstractC6428b.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo10905t0() == JsonToken.END_ARRAY) {
            return NO_OBJECTS;
        }
        C6495l c6495lLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrM11986i = c6495lLeaseObjectBuffer.m11986i();
        int i11 = 0;
        while (true) {
            Object objDeserialize = deserialize(jsonParser, deserializationContext);
            if (i11 >= objArrM11986i.length) {
                objArrM11986i = c6495lLeaseObjectBuffer.m11980c(objArrM11986i);
                i11 = 0;
            }
            int i12 = i11 + 1;
            objArrM11986i[i11] = objDeserialize;
            if (jsonParser.mo10905t0() == JsonToken.END_ARRAY) {
                return c6495lLeaseObjectBuffer.m11983f(objArrM11986i, i12);
            }
            i11 = i12;
        }
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, AbstractC6390e<?> abstractC6390e, AbstractC6390e<?> abstractC6390e2, AbstractC6390e<?> abstractC6390e3, AbstractC6390e<?> abstractC6390e4) {
        super((Class<?>) Object.class);
        this._mapDeserializer = abstractC6390e;
        this._listDeserializer = abstractC6390e2;
        this._stringDeserializer = abstractC6390e3;
        this._numberDeserializer = abstractC6390e4;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = untypedObjectDeserializer._nonMerging;
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, boolean z11) {
        super((Class<?>) Object.class);
        this._mapDeserializer = untypedObjectDeserializer._mapDeserializer;
        this._listDeserializer = untypedObjectDeserializer._listDeserializer;
        this._stringDeserializer = untypedObjectDeserializer._stringDeserializer;
        this._numberDeserializer = untypedObjectDeserializer._numberDeserializer;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = z11;
    }

    public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        while (jsonParser.mo10905t0() != JsonToken.END_ARRAY) {
            collection.add(deserialize(jsonParser, deserializationContext));
        }
        return collection;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this._nonMerging) {
            return deserialize(jsonParser, deserializationContext);
        }
        switch (jsonParser.mo10891l()) {
            case 1:
            case 2:
            case 5:
                AbstractC6390e<Object> abstractC6390e = this._mapDeserializer;
                if (abstractC6390e != null) {
                    return abstractC6390e.deserialize(jsonParser, deserializationContext, obj);
                }
                if (obj instanceof Map) {
                    return mapObject(jsonParser, deserializationContext, (Map) obj);
                }
                return mapObject(jsonParser, deserializationContext);
            case 3:
                AbstractC6390e<Object> abstractC6390e2 = this._listDeserializer;
                if (abstractC6390e2 != null) {
                    return abstractC6390e2.deserialize(jsonParser, deserializationContext, obj);
                }
                if (obj instanceof Collection) {
                    return mapArray(jsonParser, deserializationContext, (Collection) obj);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return mapArrayToArray(jsonParser, deserializationContext);
                }
                return mapArray(jsonParser, deserializationContext);
            case 4:
            default:
                return deserialize(jsonParser, deserializationContext);
            case 6:
                AbstractC6390e<Object> abstractC6390e3 = this._stringDeserializer;
                if (abstractC6390e3 != null) {
                    return abstractC6390e3.deserialize(jsonParser, deserializationContext, obj);
                }
                return jsonParser.mo10869W();
            case 7:
                AbstractC6390e<Object> abstractC6390e4 = this._numberDeserializer;
                if (abstractC6390e4 != null) {
                    return abstractC6390e4.deserialize(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                    return _coerceIntegral(jsonParser, deserializationContext);
                }
                return jsonParser.mo10863Q();
            case 8:
                AbstractC6390e<Object> abstractC6390e5 = this._numberDeserializer;
                if (abstractC6390e5 != null) {
                    return abstractC6390e5.deserialize(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.mo10855C();
                }
                return jsonParser.mo10863Q();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.mo10858J();
        }
    }

    public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        Object objDeserialize;
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k == JsonToken.START_OBJECT) {
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        if (jsonTokenMo10889k == JsonToken.END_OBJECT) {
            return map;
        }
        String strMo10887j = jsonParser.mo10887j();
        do {
            jsonParser.mo10905t0();
            Object obj = map.get(strMo10887j);
            if (obj != null) {
                objDeserialize = deserialize(jsonParser, deserializationContext, obj);
            } else {
                objDeserialize = deserialize(jsonParser, deserializationContext);
            }
            if (objDeserialize != obj) {
                map.put(strMo10887j, objDeserialize);
            }
            strMo10887j = jsonParser.mo10903r0();
        } while (strMo10887j != null);
        return map;
    }
}
