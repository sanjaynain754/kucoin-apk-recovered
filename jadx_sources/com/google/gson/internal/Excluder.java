package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private static final double IGNORE_VERSIONS = -1.0d;
    private List<ExclusionStrategy> deserializationStrategies;
    private boolean requireExpose;
    private List<ExclusionStrategy> serializationStrategies;
    private double version = -1.0d;
    private int modifiers = 136;
    private boolean serializeInnerClasses = true;

    private boolean excludeClassChecks(Class<?> cls) {
        if (this.version == -1.0d || isValidVersion((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return (!this.serializeInnerClasses && isInnerClass(cls)) || isAnonymousOrNonStaticLocal(cls);
        }
        return true;
    }

    private boolean excludeClassInStrategy(Class<?> cls, boolean z11) {
        Iterator<ExclusionStrategy> it = (z11 ? this.serializationStrategies : this.deserializationStrategies).iterator();
        while (it.hasNext()) {
            if (it.next().shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean isAnonymousOrNonStaticLocal(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls) || isStatic(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    private boolean isValidSince(Since since) {
        return since == null || since.value() <= this.version;
    }

    private boolean isValidUntil(Until until) {
        return until == null || until.value() > this.version;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Excluder m103760clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    public boolean excludeField(Field field, boolean z11) {
        Expose expose;
        if ((this.modifiers & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.version != -1.0d && !isValidVersion((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.requireExpose && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z11 ? expose.deserialize() : expose.serialize()))) {
            return true;
        }
        if ((!this.serializeInnerClasses && isInnerClass(field.getType())) || isAnonymousOrNonStaticLocal(field.getType())) {
            return true;
        }
        List<ExclusionStrategy> list = z11 ? this.serializationStrategies : this.deserializationStrategies;
        if (list.isEmpty()) {
            return false;
        }
        FieldAttributes fieldAttributes = new FieldAttributes(field);
        Iterator<ExclusionStrategy> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().shouldSkipField(fieldAttributes)) {
                return true;
            }
        }
        return false;
    }

    public Excluder() {
        List<ExclusionStrategy> list = Collections.EMPTY_LIST;
        this.serializationStrategies = list;
        this.deserializationStrategies = list;
    }

    private boolean isInnerClass(Class<?> cls) {
        if (cls.isMemberClass() && !isStatic(cls)) {
            return true;
        }
        return false;
    }

    private boolean isStatic(Class<?> cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    private boolean isValidVersion(Since since, Until until) {
        if (isValidSince(since) && isValidUntil(until)) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        final boolean z11;
        final boolean z12;
        Class<? super T> rawType = typeToken.getRawType();
        boolean zExcludeClassChecks = excludeClassChecks(rawType);
        if (!zExcludeClassChecks && !excludeClassInStrategy(rawType, true)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!zExcludeClassChecks && !excludeClassInStrategy(rawType, false)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z11 && !z12) {
            return null;
        }
        return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
            private TypeAdapter<T> delegate;

            private TypeAdapter<T> delegate() {
                TypeAdapter<T> typeAdapter = this.delegate;
                if (typeAdapter != null) {
                    return typeAdapter;
                }
                TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(Excluder.this, typeToken);
                this.delegate = delegateAdapter;
                return delegateAdapter;
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: read */
            public T read2(JsonReader jsonReader) throws IOException {
                if (!z12) {
                    return delegate().read2(jsonReader);
                }
                jsonReader.skipValue();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T t11) throws IOException {
                if (z11) {
                    jsonWriter.nullValue();
                } else {
                    delegate().write(jsonWriter, t11);
                }
            }
        };
    }

    public Excluder disableInnerClassSerialization() {
        Excluder excluderM103760clone = m103760clone();
        excluderM103760clone.serializeInnerClasses = false;
        return excluderM103760clone;
    }

    public boolean excludeClass(Class<?> cls, boolean z11) {
        if (!excludeClassChecks(cls) && !excludeClassInStrategy(cls, z11)) {
            return false;
        }
        return true;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluderM103760clone = m103760clone();
        excluderM103760clone.requireExpose = true;
        return excluderM103760clone;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean z11, boolean z12) {
        Excluder excluderM103760clone = m103760clone();
        if (z11) {
            ArrayList arrayList = new ArrayList(this.serializationStrategies);
            excluderM103760clone.serializationStrategies = arrayList;
            arrayList.add(exclusionStrategy);
        }
        if (z12) {
            ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
            excluderM103760clone.deserializationStrategies = arrayList2;
            arrayList2.add(exclusionStrategy);
        }
        return excluderM103760clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder excluderM103760clone = m103760clone();
        excluderM103760clone.modifiers = 0;
        for (int i11 : iArr) {
            excluderM103760clone.modifiers = i11 | excluderM103760clone.modifiers;
        }
        return excluderM103760clone;
    }

    public Excluder withVersion(double d11) {
        Excluder excluderM103760clone = m103760clone();
        excluderM103760clone.version = d11;
        return excluderM103760clone;
    }
}
