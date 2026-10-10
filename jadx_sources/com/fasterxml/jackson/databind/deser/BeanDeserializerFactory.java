package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.InterfaceC6269a0;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.databind.AbstractC6339a;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.C6368c;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.UnsupportedTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.C6419p;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.jsontype.impl.C6440i;
import com.fasterxml.jackson.databind.util.C6487d;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.C6498o;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p450m7.InterfaceC42439e;

/* JADX INFO: loaded from: classes45.dex */
public class BeanDeserializerFactory extends BasicDeserializerFactory implements Serializable {

    /* JADX INFO: renamed from: h */
    public static final Class<?>[] f10241h = {Throwable.class};
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(new DeserializerFactoryConfig());
    private static final long serialVersionUID = 1;

    public AbstractC6390e<Object> buildBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b) throws DatabindException {
        try {
            ValueInstantiator valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, abstractC6340b);
            DeserializationConfig config = deserializationContext.getConfig();
            C6356a c6356aConstructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, abstractC6340b);
            c6356aConstructBeanDeserializerBuilder.m11218B(valueInstantiatorFindValueInstantiator);
            addBeanProps(deserializationContext, abstractC6340b, c6356aConstructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, abstractC6340b, c6356aConstructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, abstractC6340b, c6356aConstructBeanDeserializerBuilder);
            addInjectables(deserializationContext, abstractC6340b, c6356aConstructBeanDeserializerBuilder);
            InterfaceC42439e.a aVarMo11168n = abstractC6340b.mo11168n();
            String str = aVarMo11168n == null ? "build" : aVarMo11168n.f94063a;
            AnnotatedMethod annotatedMethodMo11166l = abstractC6340b.mo11166l(str, null);
            if (annotatedMethodMo11166l != null && config.canOverrideAccessModifiers()) {
                C6490g.m11936g(annotatedMethodMo11166l.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            c6356aConstructBeanDeserializerBuilder.m11217A(annotatedMethodMo11166l, aVarMo11168n);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<AbstractC6357b> it = this._factoryConfig.deserializerModifiers().iterator();
                while (it.hasNext()) {
                    c6356aConstructBeanDeserializerBuilder = it.next().m11254j(config, abstractC6340b, c6356aConstructBeanDeserializerBuilder);
                }
            }
            AbstractC6390e<?> abstractC6390eM11232n = c6356aConstructBeanDeserializerBuilder.m11232n(javaType, str);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<AbstractC6357b> it2 = this._factoryConfig.deserializerModifiers().iterator();
                while (it2.hasNext()) {
                    abstractC6390eM11232n = it2.next().m11248d(config, abstractC6340b, abstractC6390eM11232n);
                }
            }
            return abstractC6390eM11232n;
        } catch (IllegalArgumentException e11) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), C6490g.m11952o(e11), abstractC6340b, (AbstractC6414k) null);
        } catch (NoClassDefFoundError e12) {
            return new C6368c(e12);
        }
    }

    @Deprecated
    public List<AbstractC6414k> filterBeanProps(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, C6356a c6356a, List<AbstractC6414k> list, Set<String> set) throws JsonMappingException {
        return filterBeanProps(deserializationContext, abstractC6340b, c6356a, list, set, null);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    public void addBeanProps(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, C6356a c6356a) throws JsonMappingException {
        Set<String> setFindIgnoredForDeserialization;
        Set<String> included;
        SettableBeanProperty settableBeanPropertyConstructSetterlessProperty;
        CreatorProperty creatorProperty;
        SettableBeanProperty[] fromObjectArguments = !abstractC6340b.m11151A().isAbstract() ? c6356a.m11240v().getFromObjectArguments(deserializationContext.getConfig()) : null;
        boolean z11 = fromObjectArguments != null;
        JsonIgnoreProperties.Value defaultPropertyIgnorals = deserializationContext.getConfig().getDefaultPropertyIgnorals(abstractC6340b.m11172r(), abstractC6340b.mo11174t());
        if (defaultPropertyIgnorals != null) {
            c6356a.m11243y(defaultPropertyIgnorals.getIgnoreUnknown());
            setFindIgnoredForDeserialization = defaultPropertyIgnorals.findIgnoredForDeserialization();
            Iterator<String> it = setFindIgnoredForDeserialization.iterator();
            while (it.hasNext()) {
                c6356a.m11225g(it.next());
            }
        } else {
            setFindIgnoredForDeserialization = Collections.EMPTY_SET;
        }
        JsonIncludeProperties.Value defaultPropertyInclusions = deserializationContext.getConfig().getDefaultPropertyInclusions(abstractC6340b.m11172r(), abstractC6340b.mo11174t());
        if (defaultPropertyInclusions != null) {
            included = defaultPropertyInclusions.getIncluded();
            if (included != null) {
                Iterator<String> it2 = included.iterator();
                while (it2.hasNext()) {
                    c6356a.m11226h(it2.next());
                }
            }
        } else {
            included = null;
        }
        AnnotatedMember annotatedMemberMo11156b = abstractC6340b.mo11156b();
        if (annotatedMemberMo11156b != null) {
            c6356a.m11242x(constructAnySetter(deserializationContext, abstractC6340b, annotatedMemberMo11156b));
        } else {
            Set<String> setMo11179y = abstractC6340b.mo11179y();
            if (setMo11179y != null) {
                Iterator<String> it3 = setMo11179y.iterator();
                while (it3.hasNext()) {
                    c6356a.m11225g(it3.next());
                }
            }
        }
        boolean z12 = deserializationContext.isEnabled(MapperFeature.USE_GETTERS_AS_SETTERS) && deserializationContext.isEnabled(MapperFeature.AUTO_DETECT_GETTERS);
        List<AbstractC6414k> listFilterBeanProps = filterBeanProps(deserializationContext, abstractC6340b, c6356a, abstractC6340b.mo11169o(), setFindIgnoredForDeserialization, included);
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<AbstractC6357b> it4 = this._factoryConfig.deserializerModifiers().iterator();
            while (it4.hasNext()) {
                listFilterBeanProps = it4.next().m11255k(deserializationContext.getConfig(), abstractC6340b, listFilterBeanProps);
            }
        }
        for (AbstractC6414k abstractC6414k : listFilterBeanProps) {
            if (abstractC6414k.mo11549v()) {
                settableBeanPropertyConstructSetterlessProperty = constructSettableProperty(deserializationContext, abstractC6340b, abstractC6414k, abstractC6414k.mo11545r().getParameterType(0));
            } else if (abstractC6414k.mo11547t()) {
                settableBeanPropertyConstructSetterlessProperty = constructSettableProperty(deserializationContext, abstractC6340b, abstractC6414k, abstractC6414k.mo11538k().getType());
            } else {
                AnnotatedMethod annotatedMethodMo11539l = abstractC6414k.mo11539l();
                if (annotatedMethodMo11539l == null) {
                    settableBeanPropertyConstructSetterlessProperty = null;
                } else if (z12 && m11209f(annotatedMethodMo11539l.getRawType())) {
                    if (c6356a.m11241w(abstractC6414k.getName())) {
                        settableBeanPropertyConstructSetterlessProperty = null;
                    } else {
                        settableBeanPropertyConstructSetterlessProperty = constructSetterlessProperty(deserializationContext, abstractC6340b, abstractC6414k);
                    }
                } else if (abstractC6414k.mo11546s() || abstractC6414k.getMetadata().getMergeInfo() == null) {
                    settableBeanPropertyConstructSetterlessProperty = null;
                } else {
                    settableBeanPropertyConstructSetterlessProperty = constructSetterlessProperty(deserializationContext, abstractC6340b, abstractC6414k);
                }
            }
            if (z11 && abstractC6414k.mo11546s()) {
                String name = abstractC6414k.getName();
                int length = fromObjectArguments.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        creatorProperty = null;
                        break;
                    }
                    SettableBeanProperty settableBeanProperty = fromObjectArguments[i11];
                    if (name.equals(settableBeanProperty.getName()) && (settableBeanProperty instanceof CreatorProperty)) {
                        creatorProperty = (CreatorProperty) settableBeanProperty;
                        break;
                    }
                    i11++;
                }
                if (creatorProperty == null) {
                    ArrayList arrayList = new ArrayList();
                    for (SettableBeanProperty settableBeanProperty2 : fromObjectArguments) {
                        arrayList.add(settableBeanProperty2.getName());
                    }
                    deserializationContext.reportBadPropertyDefinition(abstractC6340b, abstractC6414k, "Could not find creator property with name %s (known Creator properties: %s)", C6490g.m11919V(name), arrayList);
                } else {
                    if (settableBeanPropertyConstructSetterlessProperty != null) {
                        creatorProperty.setFallbackSetter(settableBeanPropertyConstructSetterlessProperty);
                    }
                    Class<?>[] clsArrMo11534g = abstractC6414k.mo11534g();
                    if (clsArrMo11534g == null) {
                        clsArrMo11534g = abstractC6340b.mo11159e();
                    }
                    creatorProperty.setViews(clsArrMo11534g);
                    c6356a.m11224f(creatorProperty);
                }
            } else if (settableBeanPropertyConstructSetterlessProperty != null) {
                Class<?>[] clsArrMo11534g2 = abstractC6414k.mo11534g();
                if (clsArrMo11534g2 == null) {
                    clsArrMo11534g2 = abstractC6340b.mo11159e();
                }
                settableBeanPropertyConstructSetterlessProperty.setViews(clsArrMo11534g2);
                c6356a.m11229k(settableBeanPropertyConstructSetterlessProperty);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.fasterxml.jackson.databind.deser.BasicDeserializerFactory, com.fasterxml.jackson.databind.deser.BeanDeserializerFactory] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.fasterxml.jackson.databind.i] */
    public SettableAnyProperty constructAnySetter(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType keyType;
        JavaType contentType;
        AnnotatedMember annotatedMember2;
        BeanProperty.Std std;
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            keyType = annotatedMethod.getParameterType(0);
            contentType = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, annotatedMethod.getParameterType(1));
            annotatedMember2 = annotatedMember;
            std = new BeanProperty.Std(PropertyName.construct(annotatedMember.getName()), contentType, null, annotatedMember2, PropertyMetadata.STD_OPTIONAL);
        } else {
            if (!(annotatedMember instanceof AnnotatedField)) {
                return (SettableAnyProperty) deserializationContext.reportBadDefinition(abstractC6340b.m11151A(), String.format("Unrecognized mutator type for any setter: %s", annotatedMember.getClass()));
            }
            JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, ((AnnotatedField) annotatedMember).getType());
            keyType = javaTypeResolveMemberAndTypeAnnotations.getKeyType();
            contentType = javaTypeResolveMemberAndTypeAnnotations.getContentType();
            annotatedMember2 = annotatedMember;
            std = new BeanProperty.Std(PropertyName.construct(annotatedMember.getName()), javaTypeResolveMemberAndTypeAnnotations, null, annotatedMember, PropertyMetadata.STD_OPTIONAL);
        }
        JavaType javaType = contentType;
        Object objFindKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, annotatedMember2);
        if (objFindKeyDeserializerFromAnnotation == null) {
            objFindKeyDeserializerFromAnnotation = (AbstractC6394i) keyType.getValueHandler();
        }
        if (objFindKeyDeserializerFromAnnotation == null) {
            objFindKeyDeserializerFromAnnotation = deserializationContext.findKeyDeserializer(keyType, std);
        } else if (objFindKeyDeserializerFromAnnotation instanceof InterfaceC6359d) {
            objFindKeyDeserializerFromAnnotation = ((InterfaceC6359d) objFindKeyDeserializerFromAnnotation).createContextual(deserializationContext, std);
        }
        ?? r11 = objFindKeyDeserializerFromAnnotation;
        AbstractC6390e<?> abstractC6390eFindContentDeserializerFromAnnotation = findContentDeserializerFromAnnotation(deserializationContext, annotatedMember2);
        if (abstractC6390eFindContentDeserializerFromAnnotation == null) {
            abstractC6390eFindContentDeserializerFromAnnotation = (AbstractC6390e) javaType.getValueHandler();
        }
        if (abstractC6390eFindContentDeserializerFromAnnotation != null) {
            abstractC6390eFindContentDeserializerFromAnnotation = deserializationContext.handlePrimaryContextualization(abstractC6390eFindContentDeserializerFromAnnotation, std, javaType);
        }
        AnnotatedMember annotatedMember3 = annotatedMember2;
        return new SettableAnyProperty(std, annotatedMember3, javaType, r11, abstractC6390eFindContentDeserializerFromAnnotation, (AbstractC6428b) javaType.getTypeHandler());
    }

    public C6356a constructBeanDeserializerBuilder(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b) {
        return new C6356a(abstractC6340b, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public AbstractC6390e<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b, Class<?> cls) throws JsonMappingException {
        return buildBuilderBasedDeserializer(deserializationContext, javaType, deserializationContext.getConfig().introspectForBuilder(deserializationContext.isEnabled(MapperFeature.INFER_BUILDER_TYPE_BINDINGS) ? deserializationContext.getTypeFactory().constructParametricType(cls, javaType.getBindings()) : deserializationContext.constructType(cls), abstractC6340b));
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11209f(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    public List<AbstractC6414k> filterBeanProps(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, C6356a c6356a, List<AbstractC6414k> list, Set<String> set, Set<String> set2) {
        Class<?> clsMo11544q;
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap map = new HashMap();
        for (AbstractC6414k abstractC6414k : list) {
            String name = abstractC6414k.getName();
            if (!IgnorePropertiesUtil.m11868c(name, set, set2)) {
                if (abstractC6414k.mo11546s() || (clsMo11544q = abstractC6414k.mo11544q()) == null || !isIgnorableType(deserializationContext.getConfig(), abstractC6414k, clsMo11544q, map)) {
                    arrayList.add(abstractC6414k);
                } else {
                    c6356a.m11225g(name);
                }
            }
        }
        return arrayList;
    }

    public JavaType materializeAbstractType(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        Iterator<AbstractC6339a> it = this._factoryConfig.abstractTypeResolvers().iterator();
        while (it.hasNext()) {
            JavaType javaTypeM11149b = it.next().m11149b(deserializationContext.getConfig(), abstractC6340b);
            if (javaTypeM11149b != null) {
                return javaTypeM11149b;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.BasicDeserializerFactory
    public AbstractC6362g withConfig(DeserializerFactoryConfig deserializerFactoryConfig) {
        if (this._factoryConfig == deserializerFactoryConfig) {
            return this;
        }
        C6490g.m11951n0(BeanDeserializerFactory.class, this, "withConfig");
        return new BeanDeserializerFactory(deserializerFactoryConfig);
    }

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        super(deserializerFactoryConfig);
    }

    public AbstractC6390e<Object> _findUnsupportedTypeDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        String strM11894a = C6487d.m11894a(javaType);
        if (strM11894a != null && deserializationContext.getConfig().findMixInClassFor(javaType.getRawClass()) == null) {
            return new UnsupportedTypeDeserializer(javaType, strM11894a);
        }
        return null;
    }

    public void _validateSubType(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        C6440i.m11707a().m11708b(deserializationContext, javaType, abstractC6340b);
    }

    public void addBackReferenceProperties(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, C6356a c6356a) throws DatabindException {
        List<AbstractC6414k> listMo11157c = abstractC6340b.mo11157c();
        if (listMo11157c != null) {
            for (AbstractC6414k abstractC6414k : listMo11157c) {
                c6356a.m11223e(abstractC6414k.m11532e(), constructSettableProperty(deserializationContext, abstractC6340b, abstractC6414k, abstractC6414k.mo11543p()));
            }
        }
    }

    public void addInjectables(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, C6356a c6356a) throws DatabindException {
        Map<Object, AnnotatedMember> mapMo11162h = abstractC6340b.mo11162h();
        if (mapMo11162h != null) {
            for (Map.Entry<Object, AnnotatedMember> entry : mapMo11162h.entrySet()) {
                AnnotatedMember value = entry.getValue();
                c6356a.m11227i(PropertyName.construct(value.getName()), value.getType(), abstractC6340b.mo11173s(), value, entry.getKey());
            }
        }
    }

    public void addObjectIdReader(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, C6356a c6356a) throws JsonMappingException {
        SettableBeanProperty settableBeanPropertyM11234p;
        ObjectIdGenerator<?> objectIdGeneratorObjectIdGeneratorInstance;
        JavaType javaType;
        C6419p c6419pMo11180z = abstractC6340b.mo11180z();
        if (c6419pMo11180z == null) {
            return;
        }
        Class<? extends ObjectIdGenerator<?>> clsM11572c = c6419pMo11180z.m11572c();
        InterfaceC6269a0 interfaceC6269a0ObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(abstractC6340b.mo11174t(), c6419pMo11180z);
        if (clsM11572c == ObjectIdGenerators$PropertyGenerator.class) {
            PropertyName propertyNameM11573d = c6419pMo11180z.m11573d();
            settableBeanPropertyM11234p = c6356a.m11234p(propertyNameM11573d);
            if (settableBeanPropertyM11234p != null) {
                JavaType type = settableBeanPropertyM11234p.getType();
                javaType = type;
                objectIdGeneratorObjectIdGeneratorInstance = new PropertyBasedObjectIdGenerator(c6419pMo11180z.m11575f());
            } else {
                throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", C6490g.m11904G(abstractC6340b.m11151A()), C6490g.m11918U(propertyNameM11573d)));
            }
        } else {
            JavaType javaType2 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) clsM11572c), ObjectIdGenerator.class)[0];
            settableBeanPropertyM11234p = null;
            objectIdGeneratorObjectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(abstractC6340b.mo11174t(), c6419pMo11180z);
            javaType = javaType2;
        }
        SettableBeanProperty settableBeanProperty = settableBeanPropertyM11234p;
        c6356a.m11244z(ObjectIdReader.construct(javaType, c6419pMo11180z.m11573d(), objectIdGeneratorObjectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, interfaceC6269a0ObjectIdResolverInstance));
    }

    @Deprecated
    public void addReferenceProperties(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, C6356a c6356a) throws DatabindException {
        addBackReferenceProperties(deserializationContext, abstractC6340b, c6356a);
    }

    public AbstractC6390e<Object> buildBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b) throws DatabindException {
        AbstractC6390e<?> abstractC6390eM11230l;
        try {
            ValueInstantiator valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, abstractC6340b);
            C6356a c6356aConstructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, abstractC6340b);
            c6356aConstructBeanDeserializerBuilder.m11218B(valueInstantiatorFindValueInstantiator);
            addBeanProps(deserializationContext, abstractC6340b, c6356aConstructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, abstractC6340b, c6356aConstructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, abstractC6340b, c6356aConstructBeanDeserializerBuilder);
            addInjectables(deserializationContext, abstractC6340b, c6356aConstructBeanDeserializerBuilder);
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<AbstractC6357b> it = this._factoryConfig.deserializerModifiers().iterator();
                while (it.hasNext()) {
                    c6356aConstructBeanDeserializerBuilder = it.next().m11254j(config, abstractC6340b, c6356aConstructBeanDeserializerBuilder);
                }
            }
            if (javaType.isAbstract() && !valueInstantiatorFindValueInstantiator.canInstantiate()) {
                abstractC6390eM11230l = c6356aConstructBeanDeserializerBuilder.m11231m();
            } else {
                abstractC6390eM11230l = c6356aConstructBeanDeserializerBuilder.m11230l();
            }
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<AbstractC6357b> it2 = this._factoryConfig.deserializerModifiers().iterator();
                while (it2.hasNext()) {
                    abstractC6390eM11230l = it2.next().m11248d(config, abstractC6340b, abstractC6390eM11230l);
                }
            }
            return abstractC6390eM11230l;
        } catch (IllegalArgumentException e11) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), C6490g.m11952o(e11), abstractC6340b, (AbstractC6414k) null).withCause(e11);
        } catch (NoClassDefFoundError e12) {
            return new C6368c(e12);
        }
    }

    public AbstractC6390e<Object> buildThrowableDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b) throws DatabindException {
        SettableBeanProperty settableBeanPropertyConstructSettableProperty;
        DeserializationConfig config = deserializationContext.getConfig();
        C6356a c6356aConstructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, abstractC6340b);
        c6356aConstructBeanDeserializerBuilder.m11218B(findValueInstantiator(deserializationContext, abstractC6340b));
        addBeanProps(deserializationContext, abstractC6340b, c6356aConstructBeanDeserializerBuilder);
        Iterator<SettableBeanProperty> itM11239u = c6356aConstructBeanDeserializerBuilder.m11239u();
        while (itM11239u.hasNext()) {
            if ("setCause".equals(itM11239u.next().getMember().getName())) {
                itM11239u.remove();
                break;
            }
        }
        AnnotatedMethod annotatedMethodMo11166l = abstractC6340b.mo11166l("initCause", f10241h);
        if (annotatedMethodMo11166l != null && (settableBeanPropertyConstructSettableProperty = constructSettableProperty(deserializationContext, abstractC6340b, C6498o.m12001z(deserializationContext.getConfig(), annotatedMethodMo11166l, new PropertyName("cause")), annotatedMethodMo11166l.getParameterType(0))) != null) {
            c6356aConstructBeanDeserializerBuilder.m11228j(settableBeanPropertyConstructSettableProperty, true);
        }
        c6356aConstructBeanDeserializerBuilder.m11225g("localizedMessage");
        c6356aConstructBeanDeserializerBuilder.m11225g("suppressed");
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<AbstractC6357b> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                c6356aConstructBeanDeserializerBuilder = it.next().m11254j(config, abstractC6340b, c6356aConstructBeanDeserializerBuilder);
            }
        }
        AbstractC6390e<?> abstractC6390eM11230l = c6356aConstructBeanDeserializerBuilder.m11230l();
        if (abstractC6390eM11230l instanceof BeanDeserializer) {
            abstractC6390eM11230l = new ThrowableDeserializer((BeanDeserializer) abstractC6390eM11230l);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<AbstractC6357b> it2 = this._factoryConfig.deserializerModifiers().iterator();
            while (it2.hasNext()) {
                abstractC6390eM11230l = it2.next().m11248d(config, abstractC6340b, abstractC6390eM11230l);
            }
        }
        return abstractC6390eM11230l;
    }

    public SettableBeanProperty constructSettableProperty(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, AbstractC6414k abstractC6414k, JavaType javaType) throws JsonMappingException {
        AbstractC6414k abstractC6414k2;
        SettableBeanProperty fieldProperty;
        AnnotatedMember annotatedMemberM11541n = abstractC6414k.m11541n();
        if (annotatedMemberM11541n == null) {
            deserializationContext.reportBadPropertyDefinition(abstractC6340b, abstractC6414k, "No non-constructor mutator available", new Object[0]);
        }
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMemberM11541n, javaType);
        AbstractC6428b abstractC6428b = (AbstractC6428b) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler();
        if (annotatedMemberM11541n instanceof AnnotatedMethod) {
            abstractC6414k2 = abstractC6414k;
            fieldProperty = new MethodProperty(abstractC6414k2, javaTypeResolveMemberAndTypeAnnotations, abstractC6428b, abstractC6340b.mo11173s(), (AnnotatedMethod) annotatedMemberM11541n);
        } else {
            abstractC6414k2 = abstractC6414k;
            fieldProperty = new FieldProperty(abstractC6414k2, javaTypeResolveMemberAndTypeAnnotations, abstractC6428b, abstractC6340b.mo11173s(), (AnnotatedField) annotatedMemberM11541n);
        }
        AbstractC6390e<?> abstractC6390eFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedMemberM11541n);
        if (abstractC6390eFindDeserializerFromAnnotation == null) {
            abstractC6390eFindDeserializerFromAnnotation = (AbstractC6390e) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        if (abstractC6390eFindDeserializerFromAnnotation != null) {
            fieldProperty = fieldProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(abstractC6390eFindDeserializerFromAnnotation, fieldProperty, javaTypeResolveMemberAndTypeAnnotations));
        }
        AnnotationIntrospector.ReferenceProperty referencePropertyMo11533f = abstractC6414k2.mo11533f();
        if (referencePropertyMo11533f != null && referencePropertyMo11533f.m11130d()) {
            fieldProperty.setManagedReferenceName(referencePropertyMo11533f.m11128b());
        }
        C6419p c6419pMo11531d = abstractC6414k2.mo11531d();
        if (c6419pMo11531d != null) {
            fieldProperty.setObjectIdInfo(c6419pMo11531d);
        }
        return fieldProperty;
    }

    public SettableBeanProperty constructSetterlessProperty(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, AbstractC6414k abstractC6414k) throws JsonMappingException {
        AnnotatedMethod annotatedMethodMo11539l = abstractC6414k.mo11539l();
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMethodMo11539l, annotatedMethodMo11539l.getType());
        SetterlessProperty setterlessProperty = new SetterlessProperty(abstractC6414k, javaTypeResolveMemberAndTypeAnnotations, (AbstractC6428b) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler(), abstractC6340b.mo11173s(), annotatedMethodMo11539l);
        AbstractC6390e<?> abstractC6390eFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedMethodMo11539l);
        if (abstractC6390eFindDeserializerFromAnnotation == null) {
            abstractC6390eFindDeserializerFromAnnotation = (AbstractC6390e) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        if (abstractC6390eFindDeserializerFromAnnotation != null) {
            return setterlessProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(abstractC6390eFindDeserializerFromAnnotation, setterlessProperty, javaTypeResolveMemberAndTypeAnnotations));
        }
        return setterlessProperty;
    }

    @Override // com.fasterxml.jackson.databind.deser.AbstractC6362g
    public AbstractC6390e<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        JavaType javaTypeMaterializeAbstractType;
        DeserializationConfig config = deserializationContext.getConfig();
        AbstractC6390e<?> abstractC6390e_findCustomBeanDeserializer = _findCustomBeanDeserializer(javaType, config, abstractC6340b);
        if (abstractC6390e_findCustomBeanDeserializer != null) {
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<AbstractC6357b> it = this._factoryConfig.deserializerModifiers().iterator();
                while (it.hasNext()) {
                    abstractC6390e_findCustomBeanDeserializer = it.next().m11248d(deserializationContext.getConfig(), abstractC6340b, abstractC6390e_findCustomBeanDeserializer);
                }
            }
            return abstractC6390e_findCustomBeanDeserializer;
        }
        if (javaType.isThrowable()) {
            return buildThrowableDeserializer(deserializationContext, javaType, abstractC6340b);
        }
        if (javaType.isAbstract() && !javaType.isPrimitive() && !javaType.isEnumType() && (javaTypeMaterializeAbstractType = materializeAbstractType(deserializationContext, javaType, abstractC6340b)) != null) {
            return buildBeanDeserializer(deserializationContext, javaTypeMaterializeAbstractType, config.introspect(javaTypeMaterializeAbstractType));
        }
        AbstractC6390e<?> abstractC6390eFindStdDeserializer = findStdDeserializer(deserializationContext, javaType, abstractC6340b);
        if (abstractC6390eFindStdDeserializer != null) {
            return abstractC6390eFindStdDeserializer;
        }
        if (!isPotentialBeanType(javaType.getRawClass())) {
            return null;
        }
        _validateSubType(deserializationContext, javaType, abstractC6340b);
        AbstractC6390e<Object> abstractC6390e_findUnsupportedTypeDeserializer = _findUnsupportedTypeDeserializer(deserializationContext, javaType, abstractC6340b);
        if (abstractC6390e_findUnsupportedTypeDeserializer != null) {
            return abstractC6390e_findUnsupportedTypeDeserializer;
        }
        return buildBeanDeserializer(deserializationContext, javaType, abstractC6340b);
    }

    public AbstractC6390e<?> findStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC6340b abstractC6340b) throws JsonMappingException {
        AbstractC6390e<?> abstractC6390eFindDefaultDeserializer = findDefaultDeserializer(deserializationContext, javaType, abstractC6340b);
        if (abstractC6390eFindDefaultDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<AbstractC6357b> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC6390eFindDefaultDeserializer = it.next().m11248d(deserializationContext.getConfig(), abstractC6340b, abstractC6390eFindDefaultDeserializer);
            }
        }
        return abstractC6390eFindDefaultDeserializer;
    }

    public boolean isIgnorableType(DeserializationConfig deserializationConfig, AbstractC6414k abstractC6414k, Class<?> cls, Map<Class<?>, Boolean> map) {
        Boolean isIgnoredType;
        Boolean bool = map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (cls != String.class && !cls.isPrimitive()) {
            isIgnoredType = deserializationConfig.getConfigOverride(cls).getIsIgnoredType();
            if (isIgnoredType == null) {
                isIgnoredType = deserializationConfig.getAnnotationIntrospector().isIgnorableType(deserializationConfig.introspectClassAnnotations(cls).mo11174t());
                if (isIgnoredType == null) {
                    isIgnoredType = Boolean.FALSE;
                }
            }
        } else {
            isIgnoredType = Boolean.FALSE;
        }
        map.put(cls, isIgnoredType);
        return isIgnoredType.booleanValue();
    }

    public boolean isPotentialBeanType(Class<?> cls) {
        String strM11934f = C6490g.m11934f(cls);
        if (strM11934f == null) {
            if (!C6490g.m11916S(cls)) {
                String strM11913P = C6490g.m11913P(cls, true);
                if (strM11913P == null) {
                    return true;
                }
                throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + strM11913P + ") as a Bean");
            }
            throw new IllegalArgumentException("Cannot deserialize Proxy class " + cls.getName() + " as a Bean");
        }
        throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + strM11934f + ") as a Bean");
    }
}
