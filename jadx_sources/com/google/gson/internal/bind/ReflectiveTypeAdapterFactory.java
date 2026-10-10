package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final FieldNamingStrategy fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    private final List<ReflectionAccessFilter> reflectionFilters;

    public static final class Adapter<T> extends TypeAdapter<T> {
        private final Map<String, BoundField> boundFields;
        private final ObjectConstructor<T> constructor;

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t11) throws IOException {
            if (t11 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator<BoundField> it = this.boundFields.values().iterator();
                while (it.hasNext()) {
                    it.next().write(jsonWriter, t11);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e11) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e11);
            }
        }

        public Adapter(ObjectConstructor<T> objectConstructor, Map<String, BoundField> map) {
            this.constructor = objectConstructor;
            this.boundFields = map;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public T read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T tConstruct = this.constructor.construct();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    BoundField boundField = this.boundFields.get(jsonReader.nextName());
                    if (boundField != null && boundField.deserialized) {
                        boundField.read(jsonReader, tConstruct);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return tConstruct;
            } catch (IllegalAccessException e11) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e11);
            } catch (IllegalStateException e12) {
                throw new JsonSyntaxException(e12);
            }
        }
    }

    public static abstract class BoundField {
        final boolean deserialized;
        final String name;
        final boolean serialized;

        public abstract void read(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException;

        public abstract void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;

        public BoundField(String str, boolean z11, boolean z12) {
            this.name = str;
            this.serialized = z11;
            this.deserialized = z12;
        }
    }

    private BoundField createBoundField(final Gson gson, final Field field, String str, final TypeToken<?> typeToken, boolean z11, boolean z12, final boolean z13) {
        final boolean zIsPrimitive = Primitives.isPrimitive(typeToken.getRawType());
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        TypeAdapter<?> typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter) : null;
        final boolean z14 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = gson.getAdapter(typeToken);
        }
        final TypeAdapter<?> typeAdapter2 = typeAdapter;
        return new BoundField(str, z11, z12) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void read(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
                Object obj2 = typeAdapter2.read2(jsonReader);
                if (obj2 == null && zIsPrimitive) {
                    return;
                }
                if (z13) {
                    ReflectiveTypeAdapterFactory.checkAccessible(obj, field);
                }
                field.set(obj, obj2);
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
                if (this.serialized) {
                    if (z13) {
                        ReflectiveTypeAdapterFactory.checkAccessible(obj, field);
                    }
                    Object obj2 = field.get(obj);
                    if (obj2 == obj) {
                        return;
                    }
                    jsonWriter.name(this.name);
                    (z14 ? typeAdapter2 : new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, typeToken.getType())).write(jsonWriter, obj2);
                }
            }
        };
    }

    private Map<String, BoundField> getBoundFields(Gson gson, TypeToken<?> typeToken, Class<?> cls, boolean z11) {
        int i11;
        int i12;
        Class<?> cls2 = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls2.isInterface()) {
            Type type = typeToken.getType();
            TypeToken<?> typeToken2 = typeToken;
            boolean z12 = z11;
            Class<?> rawType = cls2;
            while (rawType != Object.class) {
                Field[] declaredFields = rawType.getDeclaredFields();
                boolean z13 = true;
                boolean z14 = false;
                if (rawType != cls2 && declaredFields.length > 0) {
                    ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
                    if (filterResult == ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
                        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + " (supertype of " + cls2 + "). Register a TypeAdapter for this type or adjust the access filter.");
                    }
                    z12 = filterResult == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
                }
                boolean z15 = z12;
                int length = declaredFields.length;
                int i13 = 0;
                while (i13 < length) {
                    int i14 = i13;
                    Field field = declaredFields[i14];
                    boolean zIncludeField = this.includeField(field, z13);
                    boolean zIncludeField2 = this.includeField(field, z14);
                    if (zIncludeField || zIncludeField2) {
                        if (!z15) {
                            ReflectionHelper.makeAccessible(field);
                        }
                        Type typeResolve = C$Gson$Types.resolve(typeToken2.getType(), rawType, field.getGenericType());
                        List<String> fieldNames = this.getFieldNames(field);
                        int size = fieldNames.size();
                        BoundField boundField = null;
                        int i15 = 0;
                        while (i15 < size) {
                            String str = fieldNames.get(i15);
                            if (i15 != 0) {
                                zIncludeField = false;
                            }
                            List<String> list = fieldNames;
                            boolean z16 = zIncludeField;
                            int i16 = i14;
                            int i17 = length;
                            BoundField boundField2 = (BoundField) linkedHashMap.put(str, this.createBoundField(gson, field, str, TypeToken.get(typeResolve), z16, zIncludeField2, z15));
                            if (boundField == null) {
                                boundField = boundField2;
                            }
                            i15++;
                            this = this;
                            zIncludeField = z16;
                            length = i17;
                            i14 = i16;
                            fieldNames = list;
                        }
                        i11 = length;
                        i12 = i14;
                        if (boundField != null) {
                            throw new IllegalArgumentException(type + " declares multiple JSON fields named " + boundField.name);
                        }
                    } else {
                        i11 = length;
                        i12 = i14;
                    }
                    i13 = i12 + 1;
                    this = this;
                    typeToken2 = typeToken2;
                    length = i11;
                    z13 = true;
                    z14 = false;
                }
                typeToken2 = TypeToken.get(C$Gson$Types.resolve(typeToken2.getType(), rawType, rawType.getGenericSuperclass()));
                rawType = typeToken2.getRawType();
                cls2 = cls;
                z12 = z15;
            }
        }
        return linkedHashMap;
    }

    private List<String> getFieldNames(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.fieldNamingPolicy.translateName(field));
        }
        String strValue = serializedName.value();
        String[] strArrAlternate = serializedName.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private boolean includeField(Field field, boolean z11) {
        return (this.excluder.excludeClass(field.getType(), z11) || this.excluder.excludeField(field, z11)) ? false : true;
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<ReflectionAccessFilter> list) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = fieldNamingStrategy;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        this.reflectionFilters = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkAccessible(Object obj, Field field) {
        if (Modifier.isStatic(field.getModifiers())) {
            obj = null;
        }
        if (ReflectionAccessFilterHelper.canAccess(field, obj)) {
            return;
        }
        throw new JsonIOException("Field '" + field.getDeclaringClass().getName() + RunnableC33958ua.f72251f + field.getName() + "' is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type or adjust the access filter.");
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        boolean z11;
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        if (filterResult != ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
            if (filterResult == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE) {
                z11 = true;
            } else {
                z11 = false;
            }
            return new Adapter(this.constructorConstructor.get(typeToken), getBoundFields(gson, typeToken, rawType, z11));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
