package com.google.api.client.json;

import com.google.api.client.util.Beta;
import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sets;
import com.google.api.client.util.Types;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes56.dex */
public abstract class JsonParser implements Closeable {
    private static WeakHashMap<Class<?>, Field> cachedTypemapFields = new WeakHashMap<>();
    private static final Lock lock = new ReentrantLock();

    private static Field getCachedTypemapFieldFor(Class<?> cls) {
        Field field = null;
        if (cls == null) {
            return null;
        }
        Lock lock2 = lock;
        lock2.lock();
        try {
            if (cachedTypemapFields.containsKey(cls)) {
                Field field2 = cachedTypemapFields.get(cls);
                lock2.unlock();
                return field2;
            }
            Iterator<FieldInfo> it = ClassInfo.m13331of(cls).getFieldInfos().iterator();
            while (it.hasNext()) {
                Field field3 = it.next().getField();
                JsonPolymorphicTypeMap jsonPolymorphicTypeMap = (JsonPolymorphicTypeMap) field3.getAnnotation(JsonPolymorphicTypeMap.class);
                if (jsonPolymorphicTypeMap != null) {
                    boolean z11 = true;
                    Preconditions.checkArgument(field == null, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", cls);
                    Preconditions.checkArgument(Data.isPrimitive(field3.getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", cls, field3.getType());
                    JsonPolymorphicTypeMap.TypeDef[] typeDefArrTypeDefinitions = jsonPolymorphicTypeMap.typeDefinitions();
                    HashSet hashSetNewHashSet = Sets.newHashSet();
                    if (typeDefArrTypeDefinitions.length <= 0) {
                        z11 = false;
                    }
                    Preconditions.checkArgument(z11, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                    for (JsonPolymorphicTypeMap.TypeDef typeDef : typeDefArrTypeDefinitions) {
                        Preconditions.checkArgument(hashSetNewHashSet.add(typeDef.key()), "Class contains two @TypeDef annotations with identical key: %s", typeDef.key());
                    }
                    field = field3;
                }
            }
            cachedTypemapFields.put(cls, field);
            lock.unlock();
            return field;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public abstract BigInteger getBigIntegerValue() throws IOException;

    public abstract byte getByteValue() throws IOException;

    public abstract String getCurrentName() throws IOException;

    public abstract JsonToken getCurrentToken();

    public abstract BigDecimal getDecimalValue() throws IOException;

    public abstract double getDoubleValue() throws IOException;

    public abstract JsonFactory getFactory();

    public abstract float getFloatValue() throws IOException;

    public abstract int getIntValue() throws IOException;

    public abstract long getLongValue() throws IOException;

    public abstract short getShortValue() throws IOException;

    public abstract String getText() throws IOException;

    public abstract JsonToken nextToken() throws IOException;

    public final <T> T parse(Class<T> cls) throws IOException {
        return (T) parse((Class) cls, (CustomizeJsonParser) null);
    }

    public final <T> T parseAndClose(Class<T> cls) throws IOException {
        return (T) parseAndClose((Class) cls, (CustomizeJsonParser) null);
    }

    public final <T> Collection<T> parseArray(Class<?> cls, Class<T> cls2) throws IOException {
        return parseArray(cls, cls2, (CustomizeJsonParser) null);
    }

    public final <T> Collection<T> parseArrayAndClose(Class<?> cls, Class<T> cls2) throws IOException {
        return parseArrayAndClose(cls, cls2, (CustomizeJsonParser) null);
    }

    public abstract JsonParser skipChildren() throws IOException;

    public final void skipToKey(String str) throws IOException {
        skipToKey(Collections.singleton(str));
    }

    /* JADX INFO: renamed from: com.google.api.client.json.JsonParser$1 */
    public static /* synthetic */ class C79171 {
        static final /* synthetic */ int[] $SwitchMap$com$google$api$client$json$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$api$client$json$JsonToken = iArr;
            try {
                iArr[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.START_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.END_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.END_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private final Object parseValue(Field field, Type type, ArrayList<Type> arrayList, Object obj, CustomizeJsonParser customizeJsonParser, boolean z11) throws IOException {
        JsonParser jsonParser;
        Class<?> clsRef;
        Field field2 = field;
        Type typeResolveWildcardTypeOrTypeVariable = Data.resolveWildcardTypeOrTypeVariable(arrayList, type);
        Type iterableParameter = null;
        Class<?> rawClass = typeResolveWildcardTypeOrTypeVariable instanceof Class ? (Class) typeResolveWildcardTypeOrTypeVariable : null;
        if (typeResolveWildcardTypeOrTypeVariable instanceof ParameterizedType) {
            rawClass = Types.getRawClass((ParameterizedType) typeResolveWildcardTypeOrTypeVariable);
        }
        if (rawClass == Void.class) {
            skipChildren();
            return null;
        }
        JsonToken currentToken = getCurrentToken();
        try {
            int i11 = C79171.$SwitchMap$com$google$api$client$json$JsonToken[currentToken.ordinal()];
            Class<?> cls = Double.TYPE;
            Class<?> cls2 = Float.TYPE;
            try {
                switch (i11) {
                    case 1:
                    case 4:
                    case 5:
                        Preconditions.checkArgument(!Types.isArray(typeResolveWildcardTypeOrTypeVariable), "expected object or map type but got %s", typeResolveWildcardTypeOrTypeVariable);
                        Field cachedTypemapFieldFor = z11 ? getCachedTypemapFieldFor(rawClass) : null;
                        Object objNewInstanceForObject = (rawClass == null || customizeJsonParser == null) ? null : customizeJsonParser.newInstanceForObject(obj, rawClass);
                        boolean z12 = rawClass != null && Types.isAssignableToOrFrom(rawClass, Map.class);
                        if (cachedTypemapFieldFor != null) {
                            objNewInstanceForObject = new GenericJson();
                        } else if (objNewInstanceForObject == null) {
                            objNewInstanceForObject = (z12 || rawClass == null) ? Data.newMapInstance(rawClass) : Types.newInstance(rawClass);
                        }
                        int size = arrayList.size();
                        if (typeResolveWildcardTypeOrTypeVariable != null) {
                            arrayList.add(typeResolveWildcardTypeOrTypeVariable);
                        }
                        if (z12 && !GenericData.class.isAssignableFrom(rawClass)) {
                            Type mapValueParameter = Map.class.isAssignableFrom(rawClass) ? Types.getMapValueParameter(typeResolveWildcardTypeOrTypeVariable) : null;
                            if (mapValueParameter != null) {
                                parseMap(field, (Map) objNewInstanceForObject, mapValueParameter, arrayList, customizeJsonParser);
                                return objNewInstanceForObject;
                            }
                        }
                        jsonParser = this;
                        try {
                            jsonParser.parse(arrayList, objNewInstanceForObject, customizeJsonParser);
                            if (typeResolveWildcardTypeOrTypeVariable != null) {
                                arrayList.remove(size);
                            }
                            if (cachedTypemapFieldFor == null) {
                                return objNewInstanceForObject;
                            }
                            Object obj2 = ((GenericJson) objNewInstanceForObject).get(cachedTypemapFieldFor.getName());
                            Preconditions.checkArgument(obj2 != null, "No value specified for @JsonPolymorphicTypeMap field");
                            String string = obj2.toString();
                            JsonPolymorphicTypeMap.TypeDef[] typeDefArrTypeDefinitions = ((JsonPolymorphicTypeMap) cachedTypemapFieldFor.getAnnotation(JsonPolymorphicTypeMap.class)).typeDefinitions();
                            int length = typeDefArrTypeDefinitions.length;
                            int i12 = 0;
                            while (true) {
                                if (i12 < length) {
                                    JsonPolymorphicTypeMap.TypeDef typeDef = typeDefArrTypeDefinitions[i12];
                                    if (typeDef.key().equals(string)) {
                                        clsRef = typeDef.ref();
                                    } else {
                                        i12++;
                                    }
                                } else {
                                    clsRef = null;
                                }
                            }
                            Preconditions.checkArgument(clsRef != null, "No TypeDef annotation found with key: " + string);
                            JsonFactory factory = jsonParser.getFactory();
                            JsonParser jsonParserCreateJsonParser = factory.createJsonParser(factory.toString(objNewInstanceForObject));
                            jsonParserCreateJsonParser.startParsing();
                            try {
                                return jsonParserCreateJsonParser.parseValue(field, clsRef, arrayList, null, null, false);
                            } catch (IllegalArgumentException e11) {
                                e = e11;
                                field2 = field;
                            }
                        } catch (IllegalArgumentException e12) {
                            e = e12;
                            field2 = field;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        String currentName = jsonParser.getCurrentName();
                        if (currentName != null) {
                            sb2.append("key ");
                            sb2.append(currentName);
                        }
                        if (field2 != null) {
                            if (currentName != null) {
                                sb2.append(", ");
                            }
                            sb2.append("field ");
                            sb2.append(field2);
                        }
                        throw new IllegalArgumentException(sb2.toString(), e);
                    case 2:
                    case 3:
                        boolean zIsArray = Types.isArray(typeResolveWildcardTypeOrTypeVariable);
                        Preconditions.checkArgument(typeResolveWildcardTypeOrTypeVariable == null || zIsArray || (rawClass != null && Types.isAssignableToOrFrom(rawClass, Collection.class)), "expected collection or array type but got %s", typeResolveWildcardTypeOrTypeVariable);
                        Collection<Object> collectionNewInstanceForArray = (customizeJsonParser == null || field2 == null) ? null : customizeJsonParser.newInstanceForArray(obj, field2);
                        if (collectionNewInstanceForArray == null) {
                            collectionNewInstanceForArray = Data.newCollectionInstance(typeResolveWildcardTypeOrTypeVariable);
                        }
                        if (zIsArray) {
                            iterableParameter = Types.getArrayComponentType(typeResolveWildcardTypeOrTypeVariable);
                        } else if (rawClass != null && Iterable.class.isAssignableFrom(rawClass)) {
                            iterableParameter = Types.getIterableParameter(typeResolveWildcardTypeOrTypeVariable);
                        }
                        Type typeResolveWildcardTypeOrTypeVariable2 = Data.resolveWildcardTypeOrTypeVariable(arrayList, iterableParameter);
                        Collection<Object> collection = collectionNewInstanceForArray;
                        parseArray(field2, collection, typeResolveWildcardTypeOrTypeVariable2, arrayList, customizeJsonParser);
                        return zIsArray ? Types.toArray(collection, Types.getRawArrayComponentType(arrayList, typeResolveWildcardTypeOrTypeVariable2)) : collection;
                    case 6:
                    case 7:
                        Preconditions.checkArgument(typeResolveWildcardTypeOrTypeVariable == null || rawClass == Boolean.TYPE || (rawClass != null && rawClass.isAssignableFrom(Boolean.class)), "expected type Boolean or boolean but got %s", typeResolveWildcardTypeOrTypeVariable);
                        return currentToken == JsonToken.VALUE_TRUE ? Boolean.TRUE : Boolean.FALSE;
                    case 8:
                    case 9:
                        Preconditions.checkArgument(field2 == null || field2.getAnnotation(JsonString.class) == null, "number type formatted as a JSON number cannot use @JsonString annotation");
                        if (rawClass != null && !rawClass.isAssignableFrom(BigDecimal.class)) {
                            if (rawClass == BigInteger.class) {
                                return getBigIntegerValue();
                            }
                            if (rawClass != Double.class && rawClass != cls) {
                                if (rawClass != Long.class && rawClass != Long.TYPE) {
                                    if (rawClass != Float.class && rawClass != cls2) {
                                        if (rawClass != Integer.class && rawClass != Integer.TYPE) {
                                            if (rawClass != Short.class && rawClass != Short.TYPE) {
                                                if (rawClass != Byte.class && rawClass != Byte.TYPE) {
                                                    throw new IllegalArgumentException("expected numeric type but got " + typeResolveWildcardTypeOrTypeVariable);
                                                }
                                                return Byte.valueOf(getByteValue());
                                            }
                                            return Short.valueOf(getShortValue());
                                        }
                                        return Integer.valueOf(getIntValue());
                                    }
                                    return Float.valueOf(getFloatValue());
                                }
                                return Long.valueOf(getLongValue());
                            }
                            return Double.valueOf(getDoubleValue());
                        }
                        return getDecimalValue();
                    case 10:
                        String lowerCase = getText().trim().toLowerCase(Locale.US);
                        if ((rawClass != cls2 && rawClass != Float.class && rawClass != cls && rawClass != Double.class) || (!lowerCase.equals("nan") && !lowerCase.equals("infinity") && !lowerCase.equals("-infinity"))) {
                            Preconditions.checkArgument((rawClass != null && Number.class.isAssignableFrom(rawClass) && (field2 == null || field2.getAnnotation(JsonString.class) == null)) ? false : true, "number field formatted as a JSON string must use the @JsonString annotation");
                        }
                        return Data.parsePrimitiveValue(typeResolveWildcardTypeOrTypeVariable, getText());
                    case 11:
                        Preconditions.checkArgument(rawClass == null || !rawClass.isPrimitive(), "primitive number field but found a JSON null");
                        if (rawClass != null && (rawClass.getModifiers() & 1536) != 0) {
                            if (Types.isAssignableToOrFrom(rawClass, Collection.class)) {
                                return Data.nullOf(Data.newCollectionInstance(typeResolveWildcardTypeOrTypeVariable).getClass());
                            }
                            if (Types.isAssignableToOrFrom(rawClass, Map.class)) {
                                return Data.nullOf(Data.newMapInstance(rawClass).getClass());
                            }
                        }
                        return Data.nullOf(Types.getRawArrayComponentType(arrayList, typeResolveWildcardTypeOrTypeVariable));
                    default:
                        throw new IllegalArgumentException("unexpected JSON node type: " + currentToken);
                }
            } catch (IllegalArgumentException e13) {
                e = e13;
                jsonParser = this;
            }
        } catch (IllegalArgumentException e14) {
            e = e14;
            jsonParser = this;
        }
    }

    @Beta
    public final <T> T parse(Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        return (T) parse((Type) cls, false, customizeJsonParser);
    }

    @Beta
    public final <T> T parseAndClose(Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            return (T) parse((Class) cls, customizeJsonParser);
        } finally {
            close();
        }
    }

    @Beta
    public final <T> Collection<T> parseArray(Class<?> cls, Class<T> cls2, CustomizeJsonParser customizeJsonParser) throws IOException {
        Collection<T> collection = (Collection<T>) Data.newCollectionInstance(cls);
        parseArray(collection, cls2, customizeJsonParser);
        return collection;
    }

    @Beta
    public final <T> Collection<T> parseArrayAndClose(Class<?> cls, Class<T> cls2, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            return parseArray(cls, cls2, customizeJsonParser);
        } finally {
            close();
        }
    }

    public final String skipToKey(Set<String> set) throws IOException {
        JsonToken jsonTokenStartParsingObjectOrArray = startParsingObjectOrArray();
        while (jsonTokenStartParsingObjectOrArray == JsonToken.FIELD_NAME) {
            String text = getText();
            nextToken();
            if (set.contains(text)) {
                return text;
            }
            skipChildren();
            jsonTokenStartParsingObjectOrArray = nextToken();
        }
        return null;
    }

    private void parseMap(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, CustomizeJsonParser customizeJsonParser) throws IOException {
        JsonToken jsonTokenStartParsingObjectOrArray = startParsingObjectOrArray();
        while (jsonTokenStartParsingObjectOrArray == JsonToken.FIELD_NAME) {
            String text = getText();
            nextToken();
            if (customizeJsonParser == null || !customizeJsonParser.stopAt(map, text)) {
                Field field2 = field;
                map.put(text, parseValue(field2, type, arrayList, map, customizeJsonParser, true));
                jsonTokenStartParsingObjectOrArray = nextToken();
                field = field2;
            } else {
                return;
            }
        }
    }

    private JsonToken startParsing() throws IOException {
        boolean z11;
        JsonToken currentToken = getCurrentToken();
        if (currentToken == null) {
            currentToken = nextToken();
        }
        if (currentToken != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "no JSON input found");
        return currentToken;
    }

    private JsonToken startParsingObjectOrArray() throws IOException {
        JsonToken jsonTokenStartParsing = startParsing();
        int i11 = C79171.$SwitchMap$com$google$api$client$json$JsonToken[jsonTokenStartParsing.ordinal()];
        boolean z11 = true;
        if (i11 != 1) {
            if (i11 != 2) {
                return jsonTokenStartParsing;
            }
            return nextToken();
        }
        JsonToken jsonTokenNextToken = nextToken();
        if (jsonTokenNextToken != JsonToken.FIELD_NAME && jsonTokenNextToken != JsonToken.END_OBJECT) {
            z11 = false;
        }
        Preconditions.checkArgument(z11, jsonTokenNextToken);
        return jsonTokenNextToken;
    }

    public Object parse(Type type, boolean z11) throws IOException {
        return parse(type, z11, (CustomizeJsonParser) null);
    }

    @Beta
    public Object parse(Type type, boolean z11, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            if (!Void.class.equals(type)) {
                startParsing();
            }
            return parseValue(null, type, new ArrayList<>(), null, customizeJsonParser, true);
        } finally {
            if (z11) {
                close();
            }
        }
    }

    public final <T> void parseArray(Collection<? super T> collection, Class<T> cls) throws IOException {
        parseArray(collection, cls, (CustomizeJsonParser) null);
    }

    public final void parseAndClose(Object obj) throws IOException {
        parseAndClose(obj, (CustomizeJsonParser) null);
    }

    @Beta
    public final <T> void parseArray(Collection<? super T> collection, Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        parseArray(null, collection, cls, new ArrayList<>(), customizeJsonParser);
    }

    public final <T> void parseArrayAndClose(Collection<? super T> collection, Class<T> cls) throws IOException {
        parseArrayAndClose(collection, cls, (CustomizeJsonParser) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void parseArray(Field field, Collection<T> collection, Type type, ArrayList<Type> arrayList, CustomizeJsonParser customizeJsonParser) throws IOException {
        JsonToken jsonTokenStartParsingObjectOrArray = startParsingObjectOrArray();
        while (jsonTokenStartParsingObjectOrArray != JsonToken.END_ARRAY) {
            Field field2 = field;
            collection.add(parseValue(field2, type, arrayList, collection, customizeJsonParser, true));
            jsonTokenStartParsingObjectOrArray = nextToken();
            field = field2;
        }
    }

    @Beta
    public final void parseAndClose(Object obj, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            parse(obj, customizeJsonParser);
        } finally {
            close();
        }
    }

    @Beta
    public final <T> void parseArrayAndClose(Collection<? super T> collection, Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            parseArray(collection, cls, customizeJsonParser);
        } finally {
            close();
        }
    }

    public final void parse(Object obj) throws IOException {
        parse(obj, (CustomizeJsonParser) null);
    }

    @Beta
    public final void parse(Object obj, CustomizeJsonParser customizeJsonParser) throws IOException {
        ArrayList<Type> arrayList = new ArrayList<>();
        arrayList.add(obj.getClass());
        parse(arrayList, obj, customizeJsonParser);
    }

    private void parse(ArrayList<Type> arrayList, Object obj, CustomizeJsonParser customizeJsonParser) throws IOException {
        if (obj instanceof GenericJson) {
            ((GenericJson) obj).setFactory(getFactory());
        }
        JsonToken jsonTokenStartParsingObjectOrArray = startParsingObjectOrArray();
        Class<?> cls = obj.getClass();
        ClassInfo classInfoM13331of = ClassInfo.m13331of(cls);
        boolean zIsAssignableFrom = GenericData.class.isAssignableFrom(cls);
        if (!zIsAssignableFrom && Map.class.isAssignableFrom(cls)) {
            parseMap(null, (Map) obj, Types.getMapValueParameter(cls), arrayList, customizeJsonParser);
            return;
        }
        while (jsonTokenStartParsingObjectOrArray == JsonToken.FIELD_NAME) {
            String text = getText();
            nextToken();
            if (customizeJsonParser != null && customizeJsonParser.stopAt(obj, text)) {
                return;
            }
            FieldInfo fieldInfo = classInfoM13331of.getFieldInfo(text);
            if (fieldInfo != null) {
                if (fieldInfo.isFinal() && !fieldInfo.isPrimitive()) {
                    throw new IllegalArgumentException("final array/object fields are not supported");
                }
                Field field = fieldInfo.getField();
                int size = arrayList.size();
                arrayList.add(field.getGenericType());
                Object value = parseValue(field, fieldInfo.getGenericType(), arrayList, obj, customizeJsonParser, true);
                arrayList.remove(size);
                fieldInfo.setValue(obj, value);
            } else if (zIsAssignableFrom) {
                ((GenericData) obj).set(text, parseValue(null, null, arrayList, obj, customizeJsonParser, true));
            } else {
                if (customizeJsonParser != null) {
                    customizeJsonParser.handleUnrecognizedKey(obj, text);
                }
                skipChildren();
            }
            jsonTokenStartParsingObjectOrArray = nextToken();
        }
    }
}
