package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AbstractC6404a;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.C6406c;
import com.fasterxml.jackson.databind.introspect.C6419p;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p450m7.InterfaceC42439e;

/* JADX INFO: loaded from: classes45.dex */
public abstract class AnnotationIntrospector implements Serializable {

    public static class ReferenceProperty {

        /* JADX INFO: renamed from: a */
        public final Type f10183a;

        /* JADX INFO: renamed from: b */
        public final String f10184b;

        public enum Type {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        /* JADX INFO: renamed from: a */
        public static ReferenceProperty m11126a(String str) {
            return new ReferenceProperty(Type.BACK_REFERENCE, str);
        }

        /* JADX INFO: renamed from: e */
        public static ReferenceProperty m11127e(String str) {
            return new ReferenceProperty(Type.MANAGED_REFERENCE, str);
        }

        /* JADX INFO: renamed from: b */
        public String m11128b() {
            return this.f10184b;
        }

        /* JADX INFO: renamed from: c */
        public boolean m11129c() {
            return this.f10183a == Type.BACK_REFERENCE;
        }

        /* JADX INFO: renamed from: d */
        public boolean m11130d() {
            return this.f10183a == Type.MANAGED_REFERENCE;
        }

        public ReferenceProperty(Type type, String str) {
            this.f10183a = type;
            this.f10184b = str;
        }
    }

    public Collection<AnnotationIntrospector> allIntrospectors() {
        return Collections.singletonList(this);
    }

    public String findClassDescription(C6406c c6406c) {
        return null;
    }

    public Object findContentDeserializer(AbstractC6404a abstractC6404a) {
        return null;
    }

    public Object findContentSerializer(AbstractC6404a abstractC6404a) {
        return null;
    }

    @Deprecated
    public JsonCreator.Mode findCreatorBinding(AbstractC6404a abstractC6404a) {
        return null;
    }

    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return null;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationContentType(AbstractC6404a abstractC6404a, JavaType javaType) {
        return null;
    }

    public Object findDeserializationConverter(AbstractC6404a abstractC6404a) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationKeyType(AbstractC6404a abstractC6404a, JavaType javaType) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationType(AbstractC6404a abstractC6404a, JavaType javaType) {
        return null;
    }

    public Object findDeserializer(AbstractC6404a abstractC6404a) {
        return null;
    }

    public Object findFilterId(AbstractC6404a abstractC6404a) {
        return null;
    }

    @Deprecated
    public Boolean findIgnoreUnknownProperties(C6406c c6406c) {
        return null;
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findKeyDeserializer(AbstractC6404a abstractC6404a) {
        return null;
    }

    public Object findKeySerializer(AbstractC6404a abstractC6404a) {
        return null;
    }

    public Boolean findMergeInfo(AbstractC6404a abstractC6404a) {
        return null;
    }

    public PropertyName findNameForDeserialization(AbstractC6404a abstractC6404a) {
        return null;
    }

    public PropertyName findNameForSerialization(AbstractC6404a abstractC6404a) {
        return null;
    }

    public Object findNamingStrategy(C6406c c6406c) {
        return null;
    }

    public Object findNullSerializer(AbstractC6404a abstractC6404a) {
        return null;
    }

    public C6419p findObjectIdInfo(AbstractC6404a abstractC6404a) {
        return null;
    }

    public Class<?> findPOJOBuilder(C6406c c6406c) {
        return null;
    }

    public InterfaceC42439e.a findPOJOBuilderConfig(C6406c c6406c) {
        return null;
    }

    @Deprecated
    public String[] findPropertiesToIgnore(AbstractC6404a abstractC6404a, boolean z11) {
        return null;
    }

    public JsonProperty.Access findPropertyAccess(AbstractC6404a abstractC6404a) {
        return null;
    }

    public List<PropertyName> findPropertyAliases(AbstractC6404a abstractC6404a) {
        return null;
    }

    public InterfaceC6430d<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public String findPropertyDefaultValue(AbstractC6404a abstractC6404a) {
        return null;
    }

    public String findPropertyDescription(AbstractC6404a abstractC6404a) {
        return null;
    }

    public Integer findPropertyIndex(AbstractC6404a abstractC6404a) {
        return null;
    }

    public InterfaceC6430d<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        return null;
    }

    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        return null;
    }

    public PropertyName findRootName(C6406c c6406c) {
        return null;
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationContentType(AbstractC6404a abstractC6404a, JavaType javaType) {
        return null;
    }

    public Object findSerializationConverter(AbstractC6404a abstractC6404a) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationKeyType(AbstractC6404a abstractC6404a, JavaType javaType) {
        return null;
    }

    public String[] findSerializationPropertyOrder(C6406c c6406c) {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(AbstractC6404a abstractC6404a) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationType(AbstractC6404a abstractC6404a) {
        return null;
    }

    public JsonSerialize.Typing findSerializationTyping(AbstractC6404a abstractC6404a) {
        return null;
    }

    public Object findSerializer(AbstractC6404a abstractC6404a) {
        return null;
    }

    public List<NamedType> findSubtypes(AbstractC6404a abstractC6404a) {
        return null;
    }

    public String findTypeName(C6406c c6406c) {
        return null;
    }

    public InterfaceC6430d<?> findTypeResolver(MapperConfig<?> mapperConfig, C6406c c6406c, JavaType javaType) {
        return null;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findValueInstantiator(C6406c c6406c) {
        return null;
    }

    public Class<?>[] findViews(AbstractC6404a abstractC6404a) {
        return null;
    }

    public PropertyName findWrapperName(AbstractC6404a abstractC6404a) {
        return null;
    }

    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public Boolean hasAnySetter(AbstractC6404a abstractC6404a) {
        return null;
    }

    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public Boolean hasAsKey(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a) {
        return null;
    }

    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    @Deprecated
    public boolean hasCreatorAnnotation(AbstractC6404a abstractC6404a) {
        return false;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return false;
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        return null;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        return false;
    }

    public Boolean isIgnorableType(C6406c c6406c) {
        return null;
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return null;
    }

    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        return null;
    }

    public abstract Version version();

    public static AnnotationIntrospector nopInstance() {
        return NopAnnotationIntrospector.instance;
    }

    public static AnnotationIntrospector pair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        return new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        collection.add(this);
        return collection;
    }

    public Boolean hasAnyGetter(AbstractC6404a abstractC6404a) {
        if ((abstractC6404a instanceof AnnotatedMethod) && hasAnyGetterAnnotation((AnnotatedMethod) abstractC6404a)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public Boolean hasAsValue(AbstractC6404a abstractC6404a) {
        if ((abstractC6404a instanceof AnnotatedMethod) && hasAsValueAnnotation((AnnotatedMethod) abstractC6404a)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public <A extends Annotation> A _findAnnotation(AbstractC6404a abstractC6404a, Class<A> cls) {
        return (A) abstractC6404a.getAnnotation(cls);
    }

    public boolean _hasAnnotation(AbstractC6404a abstractC6404a, Class<? extends Annotation> cls) {
        return abstractC6404a.hasAnnotation(cls);
    }

    public boolean _hasOneOf(AbstractC6404a abstractC6404a, Class<? extends Annotation>[] clsArr) {
        return abstractC6404a.hasOneOf(clsArr);
    }

    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a) {
        if (hasCreatorAnnotation(abstractC6404a)) {
            JsonCreator.Mode modeFindCreatorBinding = findCreatorBinding(abstractC6404a);
            if (modeFindCreatorBinding == null) {
                return JsonCreator.Mode.DEFAULT;
            }
            return modeFindCreatorBinding;
        }
        return null;
    }

    @Deprecated
    public String findEnumValue(Enum<?> r11) {
        return r11.name();
    }

    public JsonFormat.Value findFormat(AbstractC6404a abstractC6404a) {
        return JsonFormat.Value.empty();
    }

    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        Object objFindInjectableValueId = findInjectableValueId(annotatedMember);
        if (objFindInjectableValueId != null) {
            return JacksonInject.Value.forId(objFindInjectableValueId);
        }
        return null;
    }

    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a) {
        return findPropertyIgnorals(abstractC6404a);
    }

    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(AbstractC6404a abstractC6404a) {
        return JsonIgnoreProperties.Value.empty();
    }

    public JsonInclude.Value findPropertyInclusion(AbstractC6404a abstractC6404a) {
        return JsonInclude.Value.empty();
    }

    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a) {
        return JsonIncludeProperties.Value.all();
    }

    public JsonSetter.Value findSetterInfo(AbstractC6404a abstractC6404a) {
        return JsonSetter.Value.empty();
    }

    public VisibilityChecker<?> findAutoDetectVisibility(C6406c c6406c, VisibilityChecker<?> visibilityChecker) {
        return visibilityChecker;
    }

    public C6419p findObjectReferenceInfo(AbstractC6404a abstractC6404a, C6419p c6419p) {
        return c6419p;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusion(AbstractC6404a abstractC6404a, JsonInclude.Include include) {
        return include;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusionForContent(AbstractC6404a abstractC6404a, JsonInclude.Include include) {
        return include;
    }

    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, C6406c c6406c, List<BeanPropertyWriter> list) {
    }

    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
    }

    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a, JavaType javaType) throws JsonMappingException {
        return javaType;
    }

    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a, JavaType javaType) throws JsonMappingException {
        return javaType;
    }
}
