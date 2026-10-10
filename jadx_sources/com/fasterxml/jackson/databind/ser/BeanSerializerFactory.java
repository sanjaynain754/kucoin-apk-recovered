package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TokenStreamFactory;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6341c;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.C6419p;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import com.fasterxml.jackson.databind.ser.impl.C6463a;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.C6487d;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class BeanSerializerFactory extends BasicSerializerFactory implements Serializable {
    public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);
    private static final long serialVersionUID = 1;

    public AbstractC6393h<Object> constructBeanOrAddOnSerializer(AbstractC6446m abstractC6446m, JavaType javaType, AbstractC6340b abstractC6340b, boolean z11) throws JsonMappingException {
        if (abstractC6340b.m11172r() == Object.class) {
            return abstractC6446m.getUnknownTypeSerializer(Object.class);
        }
        AbstractC6393h<?> abstractC6393h_findUnsupportedTypeSerializer = _findUnsupportedTypeSerializer(abstractC6446m, javaType, abstractC6340b);
        if (abstractC6393h_findUnsupportedTypeSerializer != null) {
            return abstractC6393h_findUnsupportedTypeSerializer;
        }
        if (_isUnserializableJacksonType(abstractC6446m, javaType)) {
            return new ToEmptyObjectSerializer(javaType);
        }
        SerializationConfig config = abstractC6446m.getConfig();
        C6453b c6453bConstructBeanSerializerBuilder = constructBeanSerializerBuilder(abstractC6340b);
        c6453bConstructBeanSerializerBuilder.m11753j(config);
        List<BeanPropertyWriter> listFindBeanProperties = findBeanProperties(abstractC6446m, abstractC6340b, c6453bConstructBeanSerializerBuilder);
        List<BeanPropertyWriter> arrayList = listFindBeanProperties == null ? new ArrayList<>() : removeOverlappingTypeIds(abstractC6446m, abstractC6340b, c6453bConstructBeanSerializerBuilder, listFindBeanProperties);
        abstractC6446m.getAnnotationIntrospector().findAndAddVirtualProperties(config, abstractC6340b.mo11174t(), arrayList);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<AbstractC6454c> it = this._factoryConfig.serializerModifiers().iterator();
            while (it.hasNext()) {
                arrayList = it.next().m11759a(config, abstractC6340b, arrayList);
            }
        }
        List<BeanPropertyWriter> listFilterBeanProperties = filterBeanProperties(config, abstractC6340b, filterUnwantedJDKProperties(config, abstractC6340b, arrayList));
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<AbstractC6454c> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                listFilterBeanProperties = it2.next().m11768j(config, abstractC6340b, listFilterBeanProperties);
            }
        }
        c6453bConstructBeanSerializerBuilder.m11756m(constructObjectIdHandler(abstractC6446m, abstractC6340b, listFilterBeanProperties));
        c6453bConstructBeanSerializerBuilder.m11757n(listFilterBeanProperties);
        c6453bConstructBeanSerializerBuilder.m11754k(findFilterId(config, abstractC6340b));
        AnnotatedMember annotatedMemberMo11155a = abstractC6340b.mo11155a();
        if (annotatedMemberMo11155a != null) {
            JavaType type = annotatedMemberMo11155a.getType();
            JavaType contentType = type.getContentType();
            AbstractC6431e abstractC6431eCreateTypeSerializer = createTypeSerializer(config, contentType);
            AbstractC6393h<Object> abstractC6393hFindSerializerFromAnnotation = findSerializerFromAnnotation(abstractC6446m, annotatedMemberMo11155a);
            if (abstractC6393hFindSerializerFromAnnotation == null) {
                abstractC6393hFindSerializerFromAnnotation = MapSerializer.construct((Set<String>) null, type, config.isEnabled(MapperFeature.USE_STATIC_TYPING), abstractC6431eCreateTypeSerializer, (AbstractC6393h<Object>) null, (AbstractC6393h<Object>) null, (Object) null);
            }
            c6453bConstructBeanSerializerBuilder.m11752i(new C6452a(new BeanProperty.Std(PropertyName.construct(annotatedMemberMo11155a.getName()), contentType, null, annotatedMemberMo11155a, PropertyMetadata.STD_OPTIONAL), annotatedMemberMo11155a, abstractC6393hFindSerializerFromAnnotation));
        }
        processViews(config, c6453bConstructBeanSerializerBuilder);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<AbstractC6454c> it3 = this._factoryConfig.serializerModifiers().iterator();
            while (it3.hasNext()) {
                c6453bConstructBeanSerializerBuilder = it3.next().m11769k(config, abstractC6340b, c6453bConstructBeanSerializerBuilder);
            }
        }
        try {
            AbstractC6393h<?> abstractC6393hM11744a = c6453bConstructBeanSerializerBuilder.m11744a();
            if (abstractC6393hM11744a != null) {
                return abstractC6393hM11744a;
            }
            if (javaType.isRecordType()) {
                return c6453bConstructBeanSerializerBuilder.m11745b();
            }
            AbstractC6393h<?> abstractC6393hFindSerializerByAddonType = findSerializerByAddonType(config, javaType, abstractC6340b, z11);
            return (abstractC6393hFindSerializerByAddonType == null && abstractC6340b.mo11152B()) ? c6453bConstructBeanSerializerBuilder.m11745b() : abstractC6393hFindSerializerByAddonType;
        } catch (RuntimeException e11) {
            return (AbstractC6393h) abstractC6446m.reportBadTypeDefinition(abstractC6340b, "Failed to construct BeanSerializer for %s: (%s) %s", abstractC6340b.m11151A(), e11.getClass().getName(), e11.getMessage());
        }
    }

    public C6453b constructBeanSerializerBuilder(AbstractC6340b abstractC6340b) {
        return new C6453b(abstractC6340b);
    }

    public C6457f constructPropertyBuilder(SerializationConfig serializationConfig, AbstractC6340b abstractC6340b) {
        return new C6457f(serializationConfig, abstractC6340b);
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public Iterable<InterfaceC6469k> customSerializers() {
        return this._factoryConfig.serializers();
    }

    @Deprecated
    public AbstractC6393h<Object> findBeanSerializer(AbstractC6446m abstractC6446m, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        return findBeanOrAddOnSerializer(abstractC6446m, javaType, abstractC6340b, abstractC6446m.isEnabled(MapperFeature.USE_STATIC_TYPING));
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public AbstractC6468j withConfig(SerializerFactoryConfig serializerFactoryConfig) {
        if (this._factoryConfig == serializerFactoryConfig) {
            return this;
        }
        if (getClass() == BeanSerializerFactory.class) {
            return new BeanSerializerFactory(serializerFactoryConfig);
        }
        throw new IllegalStateException("Subtype of BeanSerializerFactory (" + getClass().getName() + ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions");
    }

    public BeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super(serializerFactoryConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeanPropertyWriter _constructWriter(AbstractC6446m abstractC6446m, AbstractC6414k abstractC6414k, C6457f c6457f, boolean z11, AnnotatedMember annotatedMember) throws JsonMappingException {
        AbstractC6431e abstractC6431eFindPropertyContentTypeSerializer;
        PropertyName fullName = abstractC6414k.getFullName();
        JavaType type = annotatedMember.getType();
        BeanProperty.Std std = new BeanProperty.Std(fullName, type, abstractC6414k.getWrapperName(), annotatedMember, abstractC6414k.getMetadata());
        AbstractC6393h<Object> abstractC6393hFindSerializerFromAnnotation = findSerializerFromAnnotation(abstractC6446m, annotatedMember);
        if (abstractC6393hFindSerializerFromAnnotation instanceof InterfaceC6459h) {
            ((InterfaceC6459h) abstractC6393hFindSerializerFromAnnotation).resolve(abstractC6446m);
        }
        AbstractC6393h<?> abstractC6393hHandlePrimaryContextualization = abstractC6446m.handlePrimaryContextualization(abstractC6393hFindSerializerFromAnnotation, std);
        if (!type.isContainerType() && !type.isReferenceType()) {
            abstractC6431eFindPropertyContentTypeSerializer = null;
        } else {
            abstractC6431eFindPropertyContentTypeSerializer = findPropertyContentTypeSerializer(type, abstractC6446m.getConfig(), annotatedMember);
        }
        return c6457f.m11772c(abstractC6446m, abstractC6414k, type, abstractC6393hHandlePrimaryContextualization, findPropertyTypeSerializer(type, abstractC6446m.getConfig(), annotatedMember), abstractC6431eFindPropertyContentTypeSerializer, annotatedMember, z11);
    }

    public AbstractC6393h<?> _createSerializer2(AbstractC6446m abstractC6446m, JavaType javaType, AbstractC6340b abstractC6340b, boolean z11) throws JsonMappingException {
        AbstractC6393h<?> abstractC6393hFindSerializerByAnnotations;
        SerializationConfig config = abstractC6446m.getConfig();
        AbstractC6393h<?> abstractC6393hM11824b = null;
        if (javaType.isContainerType()) {
            if (!z11) {
                z11 = usesStaticTyping(config, abstractC6340b, null);
            }
            abstractC6393hFindSerializerByAnnotations = buildContainerSerializer(abstractC6446m, javaType, abstractC6340b, z11);
            if (abstractC6393hFindSerializerByAnnotations != null) {
                return abstractC6393hFindSerializerByAnnotations;
            }
        } else {
            if (javaType.isReferenceType()) {
                abstractC6393hFindSerializerByAnnotations = findReferenceSerializer(abstractC6446m, (ReferenceType) javaType, abstractC6340b, z11);
            } else {
                Iterator<InterfaceC6469k> it = customSerializers().iterator();
                while (it.hasNext() && (abstractC6393hM11824b = it.next().m11824b(config, javaType, abstractC6340b)) == null) {
                }
                abstractC6393hFindSerializerByAnnotations = abstractC6393hM11824b;
            }
            if (abstractC6393hFindSerializerByAnnotations == null) {
                abstractC6393hFindSerializerByAnnotations = findSerializerByAnnotations(abstractC6446m, javaType, abstractC6340b);
            }
        }
        if (abstractC6393hFindSerializerByAnnotations == null && (abstractC6393hFindSerializerByAnnotations = findSerializerByLookup(javaType, config, abstractC6340b, z11)) == null && (abstractC6393hFindSerializerByAnnotations = findSerializerByPrimaryType(abstractC6446m, javaType, abstractC6340b, z11)) == null && (abstractC6393hFindSerializerByAnnotations = findBeanOrAddOnSerializer(abstractC6446m, javaType, abstractC6340b, z11)) == null) {
            abstractC6393hFindSerializerByAnnotations = abstractC6446m.getUnknownTypeSerializer(abstractC6340b.m11172r());
        }
        if (abstractC6393hFindSerializerByAnnotations != null && this._factoryConfig.hasSerializerModifiers()) {
            Iterator<AbstractC6454c> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                abstractC6393hFindSerializerByAnnotations = it2.next().m11767i(config, abstractC6340b, abstractC6393hFindSerializerByAnnotations);
            }
        }
        return abstractC6393hFindSerializerByAnnotations;
    }

    public AbstractC6393h<?> _findUnsupportedTypeSerializer(AbstractC6446m abstractC6446m, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        String strM11894a = C6487d.m11894a(javaType);
        if (strM11894a != null && abstractC6446m.getConfig().findMixInClassFor(javaType.getRawClass()) == null) {
            return new UnsupportedTypeSerializer(javaType, strM11894a);
        }
        return null;
    }

    public boolean _isUnserializableJacksonType(AbstractC6446m abstractC6446m, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        if (!ObjectMapper.class.isAssignableFrom(rawClass) && !ObjectReader.class.isAssignableFrom(rawClass) && !ObjectWriter.class.isAssignableFrom(rawClass) && !AbstractC6341c.class.isAssignableFrom(rawClass) && !TokenStreamFactory.class.isAssignableFrom(rawClass) && !JsonParser.class.isAssignableFrom(rawClass) && !JsonGenerator.class.isAssignableFrom(rawClass)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public AbstractC6393h<Object> constructBeanSerializer(AbstractC6446m abstractC6446m, AbstractC6340b abstractC6340b) throws JsonMappingException {
        return constructBeanOrAddOnSerializer(abstractC6446m, abstractC6340b.m11151A(), abstractC6340b, abstractC6446m.isEnabled(MapperFeature.USE_STATIC_TYPING));
    }

    public BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        return FilteredBeanPropertyWriter.m11790a(beanPropertyWriter, clsArr);
    }

    public C6463a constructObjectIdHandler(AbstractC6446m abstractC6446m, AbstractC6340b abstractC6340b, List<BeanPropertyWriter> list) throws JsonMappingException {
        C6419p c6419pMo11180z = abstractC6340b.mo11180z();
        if (c6419pMo11180z == null) {
            return null;
        }
        Class<? extends ObjectIdGenerator<?>> clsM11572c = c6419pMo11180z.m11572c();
        if (clsM11572c == ObjectIdGenerators$PropertyGenerator.class) {
            String simpleName = c6419pMo11180z.m11573d().getSimpleName();
            int size = list.size();
            for (int i11 = 0; i11 != size; i11++) {
                BeanPropertyWriter beanPropertyWriter = list.get(i11);
                if (simpleName.equals(beanPropertyWriter.getName())) {
                    if (i11 > 0) {
                        list.remove(i11);
                        list.add(0, beanPropertyWriter);
                    }
                    return C6463a.m11795a(beanPropertyWriter.getType(), null, new PropertyBasedObjectIdGenerator(c6419pMo11180z, beanPropertyWriter), c6419pMo11180z.m11571b());
                }
            }
            throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", C6490g.m11904G(abstractC6340b.m11151A()), C6490g.m11919V(simpleName)));
        }
        return C6463a.m11795a(abstractC6446m.getTypeFactory().findTypeParameters(abstractC6446m.constructType(clsM11572c), ObjectIdGenerator.class)[0], c6419pMo11180z.m11573d(), abstractC6446m.objectIdGeneratorInstance(abstractC6340b.mo11174t(), c6419pMo11180z), c6419pMo11180z.m11571b());
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory, com.fasterxml.jackson.databind.ser.AbstractC6468j
    public AbstractC6393h<Object> createSerializer(AbstractC6446m abstractC6446m, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeRefineSerializationType;
        SerializationConfig config = abstractC6446m.getConfig();
        AbstractC6340b abstractC6340bIntrospect = config.introspect(javaType);
        AbstractC6393h<?> abstractC6393hFindSerializerFromAnnotation = findSerializerFromAnnotation(abstractC6446m, abstractC6340bIntrospect.mo11174t());
        if (abstractC6393hFindSerializerFromAnnotation != null) {
            return abstractC6393hFindSerializerFromAnnotation;
        }
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        boolean z11 = false;
        if (annotationIntrospector == null) {
            javaTypeRefineSerializationType = javaType;
        } else {
            try {
                javaTypeRefineSerializationType = annotationIntrospector.refineSerializationType(config, abstractC6340bIntrospect.mo11174t(), javaType);
            } catch (JsonMappingException e11) {
                return (AbstractC6393h) abstractC6446m.reportBadTypeDefinition(abstractC6340bIntrospect, e11.getMessage(), new Object[0]);
            }
        }
        if (javaTypeRefineSerializationType != javaType) {
            if (!javaTypeRefineSerializationType.hasRawClass(javaType.getRawClass())) {
                abstractC6340bIntrospect = config.introspect(javaTypeRefineSerializationType);
            }
            z11 = true;
        }
        InterfaceC6491h<Object, Object> interfaceC6491hMo11171q = abstractC6340bIntrospect.mo11171q();
        if (interfaceC6491hMo11171q == null) {
            return _createSerializer2(abstractC6446m, javaTypeRefineSerializationType, abstractC6340bIntrospect, z11);
        }
        JavaType javaTypeMo11361b = interfaceC6491hMo11171q.mo11361b(abstractC6446m.getTypeFactory());
        if (!javaTypeMo11361b.hasRawClass(javaTypeRefineSerializationType.getRawClass())) {
            abstractC6340bIntrospect = config.introspect(javaTypeMo11361b);
            abstractC6393hFindSerializerFromAnnotation = findSerializerFromAnnotation(abstractC6446m, abstractC6340bIntrospect.mo11174t());
        }
        if (abstractC6393hFindSerializerFromAnnotation == null && !javaTypeMo11361b.isJavaLangObject()) {
            abstractC6393hFindSerializerFromAnnotation = _createSerializer2(abstractC6446m, javaTypeMo11361b, abstractC6340bIntrospect, true);
        }
        return new StdDelegatingSerializer(interfaceC6491hMo11171q, javaTypeMo11361b, abstractC6393hFindSerializerFromAnnotation);
    }

    public List<BeanPropertyWriter> filterBeanProperties(SerializationConfig serializationConfig, AbstractC6340b abstractC6340b, List<BeanPropertyWriter> list) {
        Set<String> setFindIgnoredForSerialization;
        JsonIgnoreProperties.Value defaultPropertyIgnorals = serializationConfig.getDefaultPropertyIgnorals(abstractC6340b.m11172r(), abstractC6340b.mo11174t());
        Set<String> included = null;
        if (defaultPropertyIgnorals != null) {
            setFindIgnoredForSerialization = defaultPropertyIgnorals.findIgnoredForSerialization();
        } else {
            setFindIgnoredForSerialization = null;
        }
        JsonIncludeProperties.Value defaultPropertyInclusions = serializationConfig.getDefaultPropertyInclusions(abstractC6340b.m11172r(), abstractC6340b.mo11174t());
        if (defaultPropertyInclusions != null) {
            included = defaultPropertyInclusions.getIncluded();
        }
        if (included != null || (setFindIgnoredForSerialization != null && !setFindIgnoredForSerialization.isEmpty())) {
            Iterator<BeanPropertyWriter> it = list.iterator();
            while (it.hasNext()) {
                if (IgnorePropertiesUtil.m11868c(it.next().getName(), setFindIgnoredForSerialization, included)) {
                    it.remove();
                }
            }
        }
        return list;
    }

    public List<BeanPropertyWriter> filterUnwantedJDKProperties(SerializationConfig serializationConfig, AbstractC6340b abstractC6340b, List<BeanPropertyWriter> list) {
        if (abstractC6340b.m11151A().isTypeOrSubTypeOf(CharSequence.class) && list.size() == 1) {
            AnnotatedMember member = list.get(0).getMember();
            if ((member instanceof AnnotatedMethod) && "isEmpty".equals(member.getName()) && member.getDeclaringClass() == CharSequence.class) {
                list.remove(0);
            }
        }
        return list;
    }

    public AbstractC6393h<Object> findBeanOrAddOnSerializer(AbstractC6446m abstractC6446m, JavaType javaType, AbstractC6340b abstractC6340b, boolean z11) throws JsonMappingException {
        if (!isPotentialBeanType(javaType.getRawClass()) && !C6490g.m11909L(javaType.getRawClass())) {
            return null;
        }
        return constructBeanOrAddOnSerializer(abstractC6446m, javaType, abstractC6340b, z11);
    }

    public List<BeanPropertyWriter> findBeanProperties(AbstractC6446m abstractC6446m, AbstractC6340b abstractC6340b, C6453b c6453b) throws JsonMappingException {
        AbstractC6446m abstractC6446m2;
        List<AbstractC6414k> listMo11169o = abstractC6340b.mo11169o();
        SerializationConfig config = abstractC6446m.getConfig();
        removeIgnorableTypes(config, abstractC6340b, listMo11169o);
        if (config.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS)) {
            removeSetterlessGetters(config, abstractC6340b, listMo11169o);
        }
        if (listMo11169o.isEmpty()) {
            return null;
        }
        boolean zUsesStaticTyping = usesStaticTyping(config, abstractC6340b, null);
        C6457f c6457fConstructPropertyBuilder = constructPropertyBuilder(config, abstractC6340b);
        ArrayList arrayList = new ArrayList(listMo11169o.size());
        for (AbstractC6414k abstractC6414k : listMo11169o) {
            AnnotatedMember annotatedMemberM11535h = abstractC6414k.m11535h();
            if (abstractC6414k.mo11552y()) {
                if (annotatedMemberM11535h != null) {
                    c6453b.m11758o(annotatedMemberM11535h);
                }
            } else {
                AnnotationIntrospector.ReferenceProperty referencePropertyMo11533f = abstractC6414k.mo11533f();
                if (referencePropertyMo11533f == null || !referencePropertyMo11533f.m11129c()) {
                    if (annotatedMemberM11535h instanceof AnnotatedMethod) {
                        abstractC6446m2 = abstractC6446m;
                        arrayList.add(_constructWriter(abstractC6446m2, abstractC6414k, c6457fConstructPropertyBuilder, zUsesStaticTyping, (AnnotatedMethod) annotatedMemberM11535h));
                    } else {
                        abstractC6446m2 = abstractC6446m;
                        arrayList.add(_constructWriter(abstractC6446m2, abstractC6414k, c6457fConstructPropertyBuilder, zUsesStaticTyping, (AnnotatedField) annotatedMemberM11535h));
                    }
                    abstractC6446m = abstractC6446m2;
                }
            }
        }
        return arrayList;
    }

    public AbstractC6431e findPropertyContentTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType contentType = javaType.getContentType();
        InterfaceC6430d<?> interfaceC6430dFindPropertyContentTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(serializationConfig, annotatedMember, javaType);
        if (interfaceC6430dFindPropertyContentTypeResolver == null) {
            return createTypeSerializer(serializationConfig, contentType);
        }
        return interfaceC6430dFindPropertyContentTypeResolver.buildTypeSerializer(serializationConfig, contentType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, contentType));
    }

    public AbstractC6431e findPropertyTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        InterfaceC6430d<?> interfaceC6430dFindPropertyTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(serializationConfig, annotatedMember, javaType);
        if (interfaceC6430dFindPropertyTypeResolver == null) {
            return createTypeSerializer(serializationConfig, javaType);
        }
        return interfaceC6430dFindPropertyTypeResolver.buildTypeSerializer(serializationConfig, javaType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, javaType));
    }

    public boolean isPotentialBeanType(Class<?> cls) {
        if (C6490g.m11934f(cls) == null && !C6490g.m11916S(cls)) {
            return true;
        }
        return false;
    }

    public void processViews(SerializationConfig serializationConfig, C6453b c6453b) {
        List<BeanPropertyWriter> listM11750g = c6453b.m11750g();
        boolean zIsEnabled = serializationConfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        int size = listM11750g.size();
        BeanPropertyWriter[] beanPropertyWriterArr = new BeanPropertyWriter[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            BeanPropertyWriter beanPropertyWriter = listM11750g.get(i12);
            Class<?>[] views = beanPropertyWriter.getViews();
            if (views != null && views.length != 0) {
                i11++;
                beanPropertyWriterArr[i12] = constructFilteredBeanWriter(beanPropertyWriter, views);
            } else if (zIsEnabled) {
                beanPropertyWriterArr[i12] = beanPropertyWriter;
            }
        }
        if (zIsEnabled && i11 == 0) {
            return;
        }
        c6453b.m11755l(beanPropertyWriterArr);
    }

    public void removeIgnorableTypes(SerializationConfig serializationConfig, AbstractC6340b abstractC6340b, List<AbstractC6414k> list) {
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        HashMap map = new HashMap();
        Iterator<AbstractC6414k> it = list.iterator();
        while (it.hasNext()) {
            AbstractC6414k next = it.next();
            if (next.m11535h() == null) {
                it.remove();
            } else {
                Class<?> clsMo11544q = next.mo11544q();
                Boolean isIgnoredType = (Boolean) map.get(clsMo11544q);
                if (isIgnoredType == null) {
                    isIgnoredType = serializationConfig.getConfigOverride(clsMo11544q).getIsIgnoredType();
                    if (isIgnoredType == null && (isIgnoredType = annotationIntrospector.isIgnorableType(serializationConfig.introspectClassAnnotations(clsMo11544q).mo11174t())) == null) {
                        isIgnoredType = Boolean.FALSE;
                    }
                    map.put(clsMo11544q, isIgnoredType);
                }
                if (isIgnoredType.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    public List<BeanPropertyWriter> removeOverlappingTypeIds(AbstractC6446m abstractC6446m, AbstractC6340b abstractC6340b, C6453b c6453b, List<BeanPropertyWriter> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            BeanPropertyWriter beanPropertyWriter = list.get(i11);
            AbstractC6431e typeSerializer = beanPropertyWriter.getTypeSerializer();
            if (typeSerializer != null && typeSerializer.mo11691c() == JsonTypeInfo.EnumC6265As.EXTERNAL_PROPERTY) {
                PropertyName propertyNameConstruct = PropertyName.construct(typeSerializer.mo11690b());
                for (BeanPropertyWriter beanPropertyWriter2 : list) {
                    if (beanPropertyWriter2 != beanPropertyWriter && beanPropertyWriter2.wouldConflictWithName(propertyNameConstruct)) {
                        beanPropertyWriter.assignTypeSerializer(null);
                        break;
                    }
                }
            }
        }
        return list;
    }

    public void removeSetterlessGetters(SerializationConfig serializationConfig, AbstractC6340b abstractC6340b, List<AbstractC6414k> list) {
        Iterator<AbstractC6414k> it = list.iterator();
        while (it.hasNext()) {
            AbstractC6414k next = it.next();
            if (!next.mo11528a() && !next.mo11550w()) {
                it.remove();
            }
        }
    }
}
