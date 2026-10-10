package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.C6419p;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.C6452a;
import com.fasterxml.jackson.databind.ser.C6453b;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.fasterxml.jackson.databind.ser.InterfaceC6458g;
import com.fasterxml.jackson.databind.ser.InterfaceC6459h;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.C6463a;
import com.fasterxml.jackson.databind.ser.impl.C6467e;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.util.C6485b;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p528p7.InterfaceC43399e;
import p551q7.InterfaceC43652b;
import p551q7.InterfaceC43653c;

/* JADX INFO: loaded from: classes45.dex */
public abstract class BeanSerializerBase extends StdSerializer<Object> implements InterfaceC6455d, InterfaceC6459h, InterfaceC43653c {
    protected static final PropertyName NAME_FOR_OBJECT_REF = new PropertyName("#object-ref");
    protected static final BeanPropertyWriter[] NO_PROPS = new BeanPropertyWriter[0];
    protected final C6452a _anyGetterWriter;
    protected final JavaType _beanType;
    protected final BeanPropertyWriter[] _filteredProps;
    protected final C6463a _objectIdWriter;
    protected final Object _propertyFilterId;
    protected final BeanPropertyWriter[] _props;
    protected final JsonFormat.Shape _serializationShape;
    protected final AnnotatedMember _typeId;

    public BeanSerializerBase(JavaType javaType, C6453b c6453b, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType);
        this._beanType = javaType;
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        if (c6453b == null) {
            this._typeId = null;
            this._anyGetterWriter = null;
            this._propertyFilterId = null;
            this._objectIdWriter = null;
            this._serializationShape = null;
            return;
        }
        this._typeId = c6453b.m11751h();
        this._anyGetterWriter = c6453b.m11746c();
        this._propertyFilterId = c6453b.m11748e();
        this._objectIdWriter = c6453b.m11749f();
        this._serializationShape = c6453b.m11747d().mo11161g(null).getShape();
    }

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, boolean z11) throws IOException {
        C6463a c6463a = this._objectIdWriter;
        C6467e c6467eFindObjectId = abstractC6446m.findObjectId(obj, c6463a.f10620c);
        if (c6467eFindObjectId.m11822c(jsonGenerator, abstractC6446m, c6463a)) {
            return;
        }
        Object objM11820a = c6467eFindObjectId.m11820a(obj);
        if (c6463a.f10622e) {
            c6463a.f10621d.serialize(objM11820a, jsonGenerator, abstractC6446m);
            return;
        }
        if (z11) {
            jsonGenerator.mo10852z0(obj);
        }
        c6467eFindObjectId.m11821b(jsonGenerator, abstractC6446m, c6463a);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, abstractC6446m);
        } else {
            serializeFields(obj, jsonGenerator, abstractC6446m);
        }
        if (z11) {
            jsonGenerator.mo10806X();
        }
    }

    public abstract BeanSerializerBase asArraySerializer();

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public abstract void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException;

    public abstract BeanSerializerBase withByNameInclusion(Set<String> set, Set<String> set2);

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public abstract BeanSerializerBase withFilterId(Object obj);

    @Deprecated
    public BeanSerializerBase withIgnorals(Set<String> set) {
        return withByNameInclusion(set, null);
    }

    public abstract BeanSerializerBase withObjectIdWriter(C6463a c6463a);

    public abstract BeanSerializerBase withProperties(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2);

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase$a */
    public static /* synthetic */ class C6470a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10650a;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            f10650a = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10650a[JsonFormat.Shape.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10650a[JsonFormat.Shape.NUMBER_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final BeanPropertyWriter[] m11830a(BeanPropertyWriter[] beanPropertyWriterArr, NameTransformer nameTransformer) {
        if (beanPropertyWriterArr == null || beanPropertyWriterArr.length == 0 || nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return beanPropertyWriterArr;
        }
        int length = beanPropertyWriterArr.length;
        BeanPropertyWriter[] beanPropertyWriterArr2 = new BeanPropertyWriter[length];
        for (int i11 = 0; i11 < length; i11++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i11];
            if (beanPropertyWriter != null) {
                beanPropertyWriterArr2[i11] = beanPropertyWriter.rename(nameTransformer);
            }
        }
        return beanPropertyWriterArr2;
    }

    @Deprecated
    public final String _customTypeId(Object obj) {
        Object value = this._typeId.getValue(obj);
        if (value == null) {
            return "";
        }
        return value instanceof String ? (String) value : value.toString();
    }

    public void _serializeObjectId(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e, C6467e c6467e) throws IOException {
        C6463a c6463a = this._objectIdWriter;
        WritableTypeId writableTypeId_typeIdDef = _typeIdDef(abstractC6431e, obj, JsonToken.START_OBJECT);
        abstractC6431e.mo11695g(jsonGenerator, writableTypeId_typeIdDef);
        jsonGenerator.mo10848x(obj);
        c6467e.m11821b(jsonGenerator, abstractC6446m, c6463a);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, abstractC6446m);
        } else {
            serializeFields(obj, jsonGenerator, abstractC6446m);
        }
        abstractC6431e.mo11696h(jsonGenerator, writableTypeId_typeIdDef);
    }

    public final WritableTypeId _typeIdDef(AbstractC6431e abstractC6431e, Object obj, JsonToken jsonToken) {
        AnnotatedMember annotatedMember = this._typeId;
        if (annotatedMember == null) {
            return abstractC6431e.m11692d(obj, jsonToken);
        }
        Object value = annotatedMember.getValue(obj);
        if (value == null) {
            value = "";
        }
        return abstractC6431e.m11693e(obj, jsonToken, value);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        if (interfaceC43399e == null) {
            return;
        }
        interfaceC43399e.mo11794d(javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Shape shape;
        Object objFindFilterId;
        Set<String> included;
        Set<String> setFindIgnoredForSerialization;
        int i11;
        BeanSerializerBase beanSerializerBaseWithFilterId;
        C6463a c6463aM11797c;
        BeanPropertyWriter beanPropertyWriter;
        Object obj;
        C6419p c6419pFindObjectReferenceInfo;
        AnnotationIntrospector annotationIntrospector = abstractC6446m.getAnnotationIntrospector();
        BeanPropertyWriter[] beanPropertyWriterArr = null;
        AnnotatedMember member = (beanProperty == null || annotationIntrospector == null) ? null : beanProperty.getMember();
        SerializationConfig config = abstractC6446m.getConfig();
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, this._handledType);
        if (valueFindFormatOverrides == null || !valueFindFormatOverrides.hasShape()) {
            shape = null;
        } else {
            shape = valueFindFormatOverrides.getShape();
            if (shape != JsonFormat.Shape.ANY && shape != this._serializationShape) {
                if (this._beanType.isEnumType()) {
                    int i12 = C6470a.f10650a[shape.ordinal()];
                    if (i12 == 1 || i12 == 2 || i12 == 3) {
                        return abstractC6446m.handlePrimaryContextualization(EnumSerializer.construct(this._beanType.getRawClass(), abstractC6446m.getConfig(), config.introspectClassAnnotations(this._beanType), valueFindFormatOverrides), beanProperty);
                    }
                } else if (shape == JsonFormat.Shape.NATURAL && ((!this._beanType.isMapLikeType() || !Map.class.isAssignableFrom(this._handledType)) && Map.Entry.class.isAssignableFrom(this._handledType))) {
                    JavaType javaTypeFindSuperType = this._beanType.findSuperType(Map.Entry.class);
                    return abstractC6446m.handlePrimaryContextualization(new MapEntrySerializer(this._beanType, javaTypeFindSuperType.containedTypeOrUnknown(0), javaTypeFindSuperType.containedTypeOrUnknown(1), false, null, beanProperty), beanProperty);
                }
            }
        }
        C6463a c6463aM11795a = this._objectIdWriter;
        if (member != null) {
            setFindIgnoredForSerialization = annotationIntrospector.findPropertyIgnoralByName(config, member).findIgnoredForSerialization();
            included = annotationIntrospector.findPropertyInclusionByName(config, member).getIncluded();
            C6419p c6419pFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member);
            if (c6419pFindObjectIdInfo == null) {
                if (c6463aM11795a != null && (c6419pFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, null)) != null) {
                    c6463aM11795a = this._objectIdWriter.m11796b(c6419pFindObjectReferenceInfo.m11571b());
                }
                i11 = 0;
            } else {
                C6419p c6419pFindObjectReferenceInfo2 = annotationIntrospector.findObjectReferenceInfo(member, c6419pFindObjectIdInfo);
                Class<? extends ObjectIdGenerator<?>> clsM11572c = c6419pFindObjectReferenceInfo2.m11572c();
                JavaType javaType = abstractC6446m.getTypeFactory().findTypeParameters(abstractC6446m.constructType(clsM11572c), ObjectIdGenerator.class)[0];
                if (clsM11572c == ObjectIdGenerators$PropertyGenerator.class) {
                    String simpleName = c6419pFindObjectReferenceInfo2.m11573d().getSimpleName();
                    int length = this._props.length;
                    i11 = 0;
                    while (true) {
                        if (i11 == length) {
                            abstractC6446m.reportBadDefinition(this._beanType, String.format("Invalid Object Id definition for %s: cannot find property with name %s", C6490g.m11921X(handledType()), C6490g.m11919V(simpleName)));
                        }
                        beanPropertyWriter = this._props[i11];
                        if (simpleName.equals(beanPropertyWriter.getName())) {
                            break;
                        }
                        i11++;
                    }
                    c6463aM11795a = C6463a.m11795a(beanPropertyWriter.getType(), null, new PropertyBasedObjectIdGenerator(c6419pFindObjectReferenceInfo2, beanPropertyWriter), c6419pFindObjectReferenceInfo2.m11571b());
                } else {
                    c6463aM11795a = C6463a.m11795a(javaType, c6419pFindObjectReferenceInfo2.m11573d(), abstractC6446m.objectIdGeneratorInstance(member, c6419pFindObjectReferenceInfo2), c6419pFindObjectReferenceInfo2.m11571b());
                    i11 = 0;
                }
            }
            objFindFilterId = annotationIntrospector.findFilterId(member);
            if (objFindFilterId == null || ((obj = this._propertyFilterId) != null && objFindFilterId.equals(obj))) {
                objFindFilterId = null;
            }
        } else {
            objFindFilterId = null;
            included = null;
            setFindIgnoredForSerialization = null;
            i11 = 0;
        }
        if (i11 > 0) {
            BeanPropertyWriter[] beanPropertyWriterArr2 = this._props;
            BeanPropertyWriter[] beanPropertyWriterArr3 = (BeanPropertyWriter[]) Arrays.copyOf(beanPropertyWriterArr2, beanPropertyWriterArr2.length);
            BeanPropertyWriter beanPropertyWriter2 = beanPropertyWriterArr3[i11];
            System.arraycopy(beanPropertyWriterArr3, 0, beanPropertyWriterArr3, 1, i11);
            beanPropertyWriterArr3[0] = beanPropertyWriter2;
            BeanPropertyWriter[] beanPropertyWriterArr4 = this._filteredProps;
            if (beanPropertyWriterArr4 != null) {
                beanPropertyWriterArr = (BeanPropertyWriter[]) Arrays.copyOf(beanPropertyWriterArr4, beanPropertyWriterArr4.length);
                BeanPropertyWriter beanPropertyWriter3 = beanPropertyWriterArr[i11];
                System.arraycopy(beanPropertyWriterArr, 0, beanPropertyWriterArr, 1, i11);
                beanPropertyWriterArr[0] = beanPropertyWriter3;
            }
            beanSerializerBaseWithFilterId = withProperties(beanPropertyWriterArr3, beanPropertyWriterArr);
        } else {
            beanSerializerBaseWithFilterId = this;
        }
        if (c6463aM11795a != null && (c6463aM11797c = c6463aM11795a.m11797c(abstractC6446m.findValueSerializer(c6463aM11795a.f10618a, beanProperty))) != this._objectIdWriter) {
            beanSerializerBaseWithFilterId = beanSerializerBaseWithFilterId.withObjectIdWriter(c6463aM11797c);
        }
        if ((setFindIgnoredForSerialization != null && !setFindIgnoredForSerialization.isEmpty()) || included != null) {
            beanSerializerBaseWithFilterId = beanSerializerBaseWithFilterId.withByNameInclusion(setFindIgnoredForSerialization, included);
        }
        if (objFindFilterId != null) {
            beanSerializerBaseWithFilterId = beanSerializerBaseWithFilterId.withFilterId(objFindFilterId);
        }
        if (shape == null) {
            shape = this._serializationShape;
        }
        return shape == JsonFormat.Shape.ARRAY ? beanSerializerBaseWithFilterId.asArraySerializer() : beanSerializerBaseWithFilterId;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    @Deprecated
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) throws JsonMappingException {
        String strM96067id;
        ObjectNode objectNodeCreateSchemaNode = createSchemaNode("object", true);
        InterfaceC43652b interfaceC43652b = (InterfaceC43652b) this._handledType.getAnnotation(InterfaceC43652b.class);
        if (interfaceC43652b != null && (strM96067id = interfaceC43652b.m96067id()) != null && !strM96067id.isEmpty()) {
            objectNodeCreateSchemaNode.put("id", strM96067id);
        }
        ObjectNode objectNode = objectNodeCreateSchemaNode.objectNode();
        Object obj = this._propertyFilterId;
        InterfaceC6458g interfaceC6458gFindPropertyFilter = obj != null ? findPropertyFilter(abstractC6446m, obj, null) : null;
        int i11 = 0;
        while (true) {
            BeanPropertyWriter[] beanPropertyWriterArr = this._props;
            if (i11 >= beanPropertyWriterArr.length) {
                objectNodeCreateSchemaNode.set("properties", objectNode);
                return objectNodeCreateSchemaNode;
            }
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i11];
            if (interfaceC6458gFindPropertyFilter == null) {
                beanPropertyWriter.depositSchemaProperty(objectNode, abstractC6446m);
            } else {
                interfaceC6458gFindPropertyFilter.m11776b(beanPropertyWriter, objectNode, abstractC6446m);
            }
            i11++;
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public Iterator<PropertyWriter> properties() {
        return Arrays.asList(this._props).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6459h
    public void resolve(AbstractC6446m abstractC6446m) throws JsonMappingException {
        BeanPropertyWriter beanPropertyWriter;
        AbstractC6431e abstractC6431e;
        AbstractC6393h<Object> abstractC6393hFindNullValueSerializer;
        BeanPropertyWriter beanPropertyWriter2;
        BeanPropertyWriter[] beanPropertyWriterArr = this._filteredProps;
        int length = beanPropertyWriterArr == null ? 0 : beanPropertyWriterArr.length;
        int length2 = this._props.length;
        for (int i11 = 0; i11 < length2; i11++) {
            BeanPropertyWriter beanPropertyWriter3 = this._props[i11];
            if (!beanPropertyWriter3.willSuppressNulls() && !beanPropertyWriter3.hasNullSerializer() && (abstractC6393hFindNullValueSerializer = abstractC6446m.findNullValueSerializer(beanPropertyWriter3)) != null) {
                beanPropertyWriter3.assignNullSerializer(abstractC6393hFindNullValueSerializer);
                if (i11 < length && (beanPropertyWriter2 = this._filteredProps[i11]) != null) {
                    beanPropertyWriter2.assignNullSerializer(abstractC6393hFindNullValueSerializer);
                }
            }
            if (!beanPropertyWriter3.hasSerializer()) {
                AbstractC6393h<Object> abstractC6393hFindConvertingSerializer = findConvertingSerializer(abstractC6446m, beanPropertyWriter3);
                if (abstractC6393hFindConvertingSerializer == null) {
                    JavaType serializationType = beanPropertyWriter3.getSerializationType();
                    if (serializationType == null) {
                        serializationType = beanPropertyWriter3.getType();
                        if (!serializationType.isFinal()) {
                            if (serializationType.isContainerType() || serializationType.containedTypeCount() > 0) {
                                beanPropertyWriter3.setNonTrivialBaseType(serializationType);
                            }
                        }
                    }
                    AbstractC6393h<Object> abstractC6393hFindValueSerializer = abstractC6446m.findValueSerializer(serializationType, beanPropertyWriter3);
                    abstractC6393hFindConvertingSerializer = (serializationType.isContainerType() && (abstractC6431e = (AbstractC6431e) serializationType.getContentType().getTypeHandler()) != null && (abstractC6393hFindValueSerializer instanceof ContainerSerializer)) ? ((ContainerSerializer) abstractC6393hFindValueSerializer).withValueTypeSerializer(abstractC6431e) : abstractC6393hFindValueSerializer;
                    if (i11 < length) {
                        beanPropertyWriter3.assignSerializer(abstractC6393hFindConvertingSerializer);
                    } else {
                        beanPropertyWriter3.assignSerializer(abstractC6393hFindConvertingSerializer);
                    }
                } else if (i11 < length || (beanPropertyWriter = this._filteredProps[i11]) == null) {
                    beanPropertyWriter3.assignSerializer(abstractC6393hFindConvertingSerializer);
                } else {
                    beanPropertyWriter.assignSerializer(abstractC6393hFindConvertingSerializer);
                }
            }
        }
        C6452a c6452a = this._anyGetterWriter;
        if (c6452a != null) {
            c6452a.m11743d(abstractC6446m);
        }
    }

    public void serializeFields(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        BeanPropertyWriter[] beanPropertyWriterArr = (this._filteredProps == null || abstractC6446m.getActiveView() == null) ? this._props : this._filteredProps;
        int i11 = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i11 < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i11];
                if (beanPropertyWriter != null) {
                    beanPropertyWriter.serializeAsField(obj, jsonGenerator, abstractC6446m);
                }
                i11++;
            }
            C6452a c6452a = this._anyGetterWriter;
            if (c6452a != null) {
                c6452a.m11742c(obj, jsonGenerator, abstractC6446m);
            }
        } catch (Exception e11) {
            wrapAndThrow(abstractC6446m, e11, obj, i11 != beanPropertyWriterArr.length ? beanPropertyWriterArr[i11].getName() : "[anySetter]");
        } catch (StackOverflowError e12) {
            JsonMappingException jsonMappingException = new JsonMappingException(jsonGenerator, "Infinite recursion (StackOverflowError)", e12);
            jsonMappingException.prependPath(obj, i11 != beanPropertyWriterArr.length ? beanPropertyWriterArr[i11].getName() : "[anySetter]");
            throw jsonMappingException;
        }
    }

    public void serializeFieldsFiltered(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        BeanPropertyWriter[] beanPropertyWriterArr = (this._filteredProps == null || abstractC6446m.getActiveView() == null) ? this._props : this._filteredProps;
        InterfaceC6458g interfaceC6458gFindPropertyFilter = findPropertyFilter(abstractC6446m, this._propertyFilterId, obj);
        if (interfaceC6458gFindPropertyFilter == null) {
            serializeFields(obj, jsonGenerator, abstractC6446m);
            return;
        }
        int i11 = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i11 < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i11];
                if (beanPropertyWriter != null) {
                    interfaceC6458gFindPropertyFilter.m11775a(obj, jsonGenerator, abstractC6446m, beanPropertyWriter);
                }
                i11++;
            }
            C6452a c6452a = this._anyGetterWriter;
            if (c6452a != null) {
                c6452a.m11741b(obj, jsonGenerator, abstractC6446m, interfaceC6458gFindPropertyFilter);
            }
        } catch (Exception e11) {
            wrapAndThrow(abstractC6446m, e11, obj, i11 != beanPropertyWriterArr.length ? beanPropertyWriterArr[i11].getName() : "[anySetter]");
        } catch (StackOverflowError e12) {
            JsonMappingException jsonMappingException = new JsonMappingException(jsonGenerator, "Infinite recursion (StackOverflowError)", e12);
            jsonMappingException.prependPath(obj, i11 != beanPropertyWriterArr.length ? beanPropertyWriterArr[i11].getName() : "[anySetter]");
            throw jsonMappingException;
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, abstractC6446m, abstractC6431e);
            return;
        }
        WritableTypeId writableTypeId_typeIdDef = _typeIdDef(abstractC6431e, obj, JsonToken.START_OBJECT);
        abstractC6431e.mo11695g(jsonGenerator, writableTypeId_typeIdDef);
        jsonGenerator.mo10848x(obj);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, abstractC6446m);
        } else {
            serializeFields(obj, jsonGenerator, abstractC6446m);
        }
        abstractC6431e.mo11696h(jsonGenerator, writableTypeId_typeIdDef);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean usesObjectId() {
        return this._objectIdWriter != null;
    }

    @Deprecated
    public BeanSerializerBase withIgnorals(String[] strArr) {
        return withIgnorals(C6485b.m11876a(strArr));
    }

    public AbstractC6393h<Object> findConvertingSerializer(AbstractC6446m abstractC6446m, BeanPropertyWriter beanPropertyWriter) throws JsonMappingException {
        AnnotatedMember member;
        Object objFindSerializationConverter;
        AnnotationIntrospector annotationIntrospector = abstractC6446m.getAnnotationIntrospector();
        AbstractC6393h<Object> abstractC6393hFindValueSerializer = null;
        if (annotationIntrospector == null || (member = beanPropertyWriter.getMember()) == null || (objFindSerializationConverter = annotationIntrospector.findSerializationConverter(member)) == null) {
            return null;
        }
        InterfaceC6491h<Object, Object> interfaceC6491hConverterInstance = abstractC6446m.converterInstance(beanPropertyWriter.getMember(), objFindSerializationConverter);
        JavaType javaTypeMo11361b = interfaceC6491hConverterInstance.mo11361b(abstractC6446m.getTypeFactory());
        if (!javaTypeMo11361b.isJavaLangObject()) {
            abstractC6393hFindValueSerializer = abstractC6446m.findValueSerializer(javaTypeMo11361b, beanPropertyWriter);
        }
        return new StdDelegatingSerializer(interfaceC6491hConverterInstance, javaTypeMo11361b, abstractC6393hFindValueSerializer);
    }

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        C6463a c6463a = this._objectIdWriter;
        C6467e c6467eFindObjectId = abstractC6446m.findObjectId(obj, c6463a.f10620c);
        if (c6467eFindObjectId.m11822c(jsonGenerator, abstractC6446m, c6463a)) {
            return;
        }
        Object objM11820a = c6467eFindObjectId.m11820a(obj);
        if (c6463a.f10622e) {
            c6463a.f10621d.serialize(objM11820a, jsonGenerator, abstractC6446m);
        } else {
            _serializeObjectId(obj, jsonGenerator, abstractC6446m, abstractC6431e, c6467eFindObjectId);
        }
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, C6463a c6463a) {
        this(beanSerializerBase, c6463a, beanSerializerBase._propertyFilterId);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, C6463a c6463a, Object obj) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanSerializerBase._props;
        this._filteredProps = beanSerializerBase._filteredProps;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = c6463a;
        this._propertyFilterId = obj;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    @Deprecated
    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, String[] strArr) {
        this(beanSerializerBase, C6485b.m11876a(strArr), (Set<String>) null);
    }

    @Deprecated
    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set<String> set) {
        this(beanSerializerBase, set, (Set<String>) null);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        BeanPropertyWriter[] beanPropertyWriterArr = beanSerializerBase._props;
        BeanPropertyWriter[] beanPropertyWriterArr2 = beanSerializerBase._filteredProps;
        int length = beanPropertyWriterArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = beanPropertyWriterArr2 == null ? null : new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i11];
            if (!IgnorePropertiesUtil.m11868c(beanPropertyWriter.getName(), set, set2)) {
                arrayList.add(beanPropertyWriter);
                if (beanPropertyWriterArr2 != null) {
                    arrayList2.add(beanPropertyWriterArr2[i11]);
                }
            }
        }
        this._props = (BeanPropertyWriter[]) arrayList.toArray(new BeanPropertyWriter[arrayList.size()]);
        this._filteredProps = arrayList2 != null ? (BeanPropertyWriter[]) arrayList2.toArray(new BeanPropertyWriter[arrayList2.size()]) : null;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase) {
        this(beanSerializerBase, beanSerializerBase._props, beanSerializerBase._filteredProps);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        this(beanSerializerBase, m11830a(beanSerializerBase._props, nameTransformer), m11830a(beanSerializerBase._filteredProps, nameTransformer));
    }
}
