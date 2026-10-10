package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p450m7.InterfaceC42439e;

/* JADX INFO: loaded from: classes45.dex */
public class AnnotationIntrospectorPair extends AnnotationIntrospector implements Serializable {
    private static final long serialVersionUID = 1;
    protected final AnnotationIntrospector _primary;
    protected final AnnotationIntrospector _secondary;

    public Object _explicitClassOrOb(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return null;
        }
        if ((obj instanceof Class) && C6490g.m11907J((Class) obj)) {
            return null;
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Collection<AnnotationIntrospector> allIntrospectors() {
        return allIntrospectors(new ArrayList());
    }

    public static AnnotationIntrospector create(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        if (annotationIntrospector == null) {
            return annotationIntrospector2;
        }
        return annotationIntrospector2 == null ? annotationIntrospector : new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    public boolean _isExplicitClassOrOb(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return false;
        }
        if (obj instanceof Class) {
            return !C6490g.m11907J((Class) obj);
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        this._primary.allIntrospectors(collection);
        this._secondary.allIntrospectors(collection);
        return collection;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, C6406c c6406c, List<BeanPropertyWriter> list) {
        this._primary.findAndAddVirtualProperties(mapperConfig, c6406c, list);
        this._secondary.findAndAddVirtualProperties(mapperConfig, c6406c, list);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public VisibilityChecker<?> findAutoDetectVisibility(C6406c c6406c, VisibilityChecker<?> visibilityChecker) {
        return this._primary.findAutoDetectVisibility(c6406c, this._secondary.findAutoDetectVisibility(c6406c, visibilityChecker));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findClassDescription(C6406c c6406c) {
        String strFindClassDescription = this._primary.findClassDescription(c6406c);
        return (strFindClassDescription == null || strFindClassDescription.isEmpty()) ? this._secondary.findClassDescription(c6406c) : strFindClassDescription;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentDeserializer(AbstractC6404a abstractC6404a) {
        Object objFindContentDeserializer = this._primary.findContentDeserializer(abstractC6404a);
        return _isExplicitClassOrOb(objFindContentDeserializer, AbstractC6390e.a.class) ? objFindContentDeserializer : _explicitClassOrOb(this._secondary.findContentDeserializer(abstractC6404a), AbstractC6390e.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentSerializer(AbstractC6404a abstractC6404a) {
        Object objFindContentSerializer = this._primary.findContentSerializer(abstractC6404a);
        return _isExplicitClassOrOb(objFindContentSerializer, AbstractC6393h.a.class) ? objFindContentSerializer : _explicitClassOrOb(this._secondary.findContentSerializer(abstractC6404a), AbstractC6393h.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a) {
        JsonCreator.Mode modeFindCreatorAnnotation = this._primary.findCreatorAnnotation(mapperConfig, abstractC6404a);
        return modeFindCreatorAnnotation == null ? this._secondary.findCreatorAnnotation(mapperConfig, abstractC6404a) : modeFindCreatorAnnotation;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonCreator.Mode findCreatorBinding(AbstractC6404a abstractC6404a) {
        JsonCreator.Mode modeFindCreatorBinding = this._primary.findCreatorBinding(abstractC6404a);
        return modeFindCreatorBinding != null ? modeFindCreatorBinding : this._secondary.findCreatorBinding(abstractC6404a);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        Enum<?> enumFindDefaultEnumValue = this._primary.findDefaultEnumValue(cls);
        return enumFindDefaultEnumValue == null ? this._secondary.findDefaultEnumValue(cls) : enumFindDefaultEnumValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        Object objFindDeserializationContentConverter = this._primary.findDeserializationContentConverter(annotatedMember);
        return objFindDeserializationContentConverter == null ? this._secondary.findDeserializationContentConverter(annotatedMember) : objFindDeserializationContentConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationContentType(AbstractC6404a abstractC6404a, JavaType javaType) {
        Class<?> clsFindDeserializationContentType = this._primary.findDeserializationContentType(abstractC6404a, javaType);
        return clsFindDeserializationContentType == null ? this._secondary.findDeserializationContentType(abstractC6404a, javaType) : clsFindDeserializationContentType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationConverter(AbstractC6404a abstractC6404a) {
        Object objFindDeserializationConverter = this._primary.findDeserializationConverter(abstractC6404a);
        return objFindDeserializationConverter == null ? this._secondary.findDeserializationConverter(abstractC6404a) : objFindDeserializationConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationKeyType(AbstractC6404a abstractC6404a, JavaType javaType) {
        Class<?> clsFindDeserializationKeyType = this._primary.findDeserializationKeyType(abstractC6404a, javaType);
        return clsFindDeserializationKeyType == null ? this._secondary.findDeserializationKeyType(abstractC6404a, javaType) : clsFindDeserializationKeyType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationType(AbstractC6404a abstractC6404a, JavaType javaType) {
        Class<?> clsFindDeserializationType = this._primary.findDeserializationType(abstractC6404a, javaType);
        return clsFindDeserializationType != null ? clsFindDeserializationType : this._secondary.findDeserializationType(abstractC6404a, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializer(AbstractC6404a abstractC6404a) {
        Object objFindDeserializer = this._primary.findDeserializer(abstractC6404a);
        return _isExplicitClassOrOb(objFindDeserializer, AbstractC6390e.a.class) ? objFindDeserializer : _explicitClassOrOb(this._secondary.findDeserializer(abstractC6404a), AbstractC6390e.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        this._secondary.findEnumAliases(cls, enumArr, strArr);
        this._primary.findEnumAliases(cls, enumArr, strArr);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String findEnumValue(Enum<?> r11) {
        String strFindEnumValue = this._primary.findEnumValue(r11);
        return strFindEnumValue == null ? this._secondary.findEnumValue(r11) : strFindEnumValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return this._primary.findEnumValues(cls, enumArr, this._secondary.findEnumValues(cls, enumArr, strArr));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findFilterId(AbstractC6404a abstractC6404a) {
        Object objFindFilterId = this._primary.findFilterId(abstractC6404a);
        return objFindFilterId == null ? this._secondary.findFilterId(abstractC6404a) : objFindFilterId;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonFormat.Value findFormat(AbstractC6404a abstractC6404a) {
        JsonFormat.Value valueFindFormat = this._primary.findFormat(abstractC6404a);
        JsonFormat.Value valueFindFormat2 = this._secondary.findFormat(abstractC6404a);
        return valueFindFormat2 == null ? valueFindFormat : valueFindFormat2.withOverrides(valueFindFormat);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Boolean findIgnoreUnknownProperties(C6406c c6406c) {
        Boolean boolFindIgnoreUnknownProperties = this._primary.findIgnoreUnknownProperties(c6406c);
        return boolFindIgnoreUnknownProperties == null ? this._secondary.findIgnoreUnknownProperties(c6406c) : boolFindIgnoreUnknownProperties;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        String strFindImplicitPropertyName = this._primary.findImplicitPropertyName(annotatedMember);
        return strFindImplicitPropertyName == null ? this._secondary.findImplicitPropertyName(annotatedMember) : strFindImplicitPropertyName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        JacksonInject.Value valueFindInjectableValue;
        JacksonInject.Value valueFindInjectableValue2 = this._primary.findInjectableValue(annotatedMember);
        if ((valueFindInjectableValue2 == null || valueFindInjectableValue2.getUseInput() == null) && (valueFindInjectableValue = this._secondary.findInjectableValue(annotatedMember)) != null) {
            return valueFindInjectableValue2 == null ? valueFindInjectableValue : valueFindInjectableValue2.withUseInput(valueFindInjectableValue.getUseInput());
        }
        return valueFindInjectableValue2;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        Object objFindInjectableValueId = this._primary.findInjectableValueId(annotatedMember);
        return objFindInjectableValueId == null ? this._secondary.findInjectableValueId(annotatedMember) : objFindInjectableValueId;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeyDeserializer(AbstractC6404a abstractC6404a) {
        Object objFindKeyDeserializer = this._primary.findKeyDeserializer(abstractC6404a);
        return _isExplicitClassOrOb(objFindKeyDeserializer, AbstractC6394i.a.class) ? objFindKeyDeserializer : _explicitClassOrOb(this._secondary.findKeyDeserializer(abstractC6404a), AbstractC6394i.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeySerializer(AbstractC6404a abstractC6404a) {
        Object objFindKeySerializer = this._primary.findKeySerializer(abstractC6404a);
        return _isExplicitClassOrOb(objFindKeySerializer, AbstractC6393h.a.class) ? objFindKeySerializer : _explicitClassOrOb(this._secondary.findKeySerializer(abstractC6404a), AbstractC6393h.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findMergeInfo(AbstractC6404a abstractC6404a) {
        Boolean boolFindMergeInfo = this._primary.findMergeInfo(abstractC6404a);
        return boolFindMergeInfo == null ? this._secondary.findMergeInfo(abstractC6404a) : boolFindMergeInfo;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForDeserialization(AbstractC6404a abstractC6404a) {
        PropertyName propertyNameFindNameForDeserialization;
        PropertyName propertyNameFindNameForDeserialization2 = this._primary.findNameForDeserialization(abstractC6404a);
        if (propertyNameFindNameForDeserialization2 == null) {
            return this._secondary.findNameForDeserialization(abstractC6404a);
        }
        return (propertyNameFindNameForDeserialization2 != PropertyName.USE_DEFAULT || (propertyNameFindNameForDeserialization = this._secondary.findNameForDeserialization(abstractC6404a)) == null) ? propertyNameFindNameForDeserialization2 : propertyNameFindNameForDeserialization;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForSerialization(AbstractC6404a abstractC6404a) {
        PropertyName propertyNameFindNameForSerialization;
        PropertyName propertyNameFindNameForSerialization2 = this._primary.findNameForSerialization(abstractC6404a);
        if (propertyNameFindNameForSerialization2 == null) {
            return this._secondary.findNameForSerialization(abstractC6404a);
        }
        return (propertyNameFindNameForSerialization2 != PropertyName.USE_DEFAULT || (propertyNameFindNameForSerialization = this._secondary.findNameForSerialization(abstractC6404a)) == null) ? propertyNameFindNameForSerialization2 : propertyNameFindNameForSerialization;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNamingStrategy(C6406c c6406c) {
        Object objFindNamingStrategy = this._primary.findNamingStrategy(c6406c);
        return objFindNamingStrategy == null ? this._secondary.findNamingStrategy(c6406c) : objFindNamingStrategy;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNullSerializer(AbstractC6404a abstractC6404a) {
        Object objFindNullSerializer = this._primary.findNullSerializer(abstractC6404a);
        return _isExplicitClassOrOb(objFindNullSerializer, AbstractC6393h.a.class) ? objFindNullSerializer : _explicitClassOrOb(this._secondary.findNullSerializer(abstractC6404a), AbstractC6393h.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public C6419p findObjectIdInfo(AbstractC6404a abstractC6404a) {
        C6419p c6419pFindObjectIdInfo = this._primary.findObjectIdInfo(abstractC6404a);
        return c6419pFindObjectIdInfo == null ? this._secondary.findObjectIdInfo(abstractC6404a) : c6419pFindObjectIdInfo;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public C6419p findObjectReferenceInfo(AbstractC6404a abstractC6404a, C6419p c6419p) {
        return this._primary.findObjectReferenceInfo(abstractC6404a, this._secondary.findObjectReferenceInfo(abstractC6404a, c6419p));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?> findPOJOBuilder(C6406c c6406c) {
        Class<?> clsFindPOJOBuilder = this._primary.findPOJOBuilder(c6406c);
        return clsFindPOJOBuilder == null ? this._secondary.findPOJOBuilder(c6406c) : clsFindPOJOBuilder;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC42439e.a findPOJOBuilderConfig(C6406c c6406c) {
        InterfaceC42439e.a aVarFindPOJOBuilderConfig = this._primary.findPOJOBuilderConfig(c6406c);
        return aVarFindPOJOBuilderConfig == null ? this._secondary.findPOJOBuilderConfig(c6406c) : aVarFindPOJOBuilderConfig;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String[] findPropertiesToIgnore(AbstractC6404a abstractC6404a, boolean z11) {
        String[] strArrFindPropertiesToIgnore = this._primary.findPropertiesToIgnore(abstractC6404a, z11);
        return strArrFindPropertiesToIgnore == null ? this._secondary.findPropertiesToIgnore(abstractC6404a, z11) : strArrFindPropertiesToIgnore;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonProperty.Access findPropertyAccess(AbstractC6404a abstractC6404a) {
        JsonProperty.Access accessFindPropertyAccess = this._primary.findPropertyAccess(abstractC6404a);
        if (accessFindPropertyAccess != null && accessFindPropertyAccess != JsonProperty.Access.AUTO) {
            return accessFindPropertyAccess;
        }
        JsonProperty.Access accessFindPropertyAccess2 = this._secondary.findPropertyAccess(abstractC6404a);
        return accessFindPropertyAccess2 != null ? accessFindPropertyAccess2 : JsonProperty.Access.AUTO;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<PropertyName> findPropertyAliases(AbstractC6404a abstractC6404a) {
        List<PropertyName> listFindPropertyAliases = this._primary.findPropertyAliases(abstractC6404a);
        return listFindPropertyAliases == null ? this._secondary.findPropertyAliases(abstractC6404a) : listFindPropertyAliases;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC6430d<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        InterfaceC6430d<?> interfaceC6430dFindPropertyContentTypeResolver = this._primary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType);
        return interfaceC6430dFindPropertyContentTypeResolver == null ? this._secondary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType) : interfaceC6430dFindPropertyContentTypeResolver;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDefaultValue(AbstractC6404a abstractC6404a) {
        String strFindPropertyDefaultValue = this._primary.findPropertyDefaultValue(abstractC6404a);
        return (strFindPropertyDefaultValue == null || strFindPropertyDefaultValue.isEmpty()) ? this._secondary.findPropertyDefaultValue(abstractC6404a) : strFindPropertyDefaultValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDescription(AbstractC6404a abstractC6404a) {
        String strFindPropertyDescription = this._primary.findPropertyDescription(abstractC6404a);
        return strFindPropertyDescription == null ? this._secondary.findPropertyDescription(abstractC6404a) : strFindPropertyDescription;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a) {
        JsonIgnoreProperties.Value valueFindPropertyIgnoralByName = this._secondary.findPropertyIgnoralByName(mapperConfig, abstractC6404a);
        JsonIgnoreProperties.Value valueFindPropertyIgnoralByName2 = this._primary.findPropertyIgnoralByName(mapperConfig, abstractC6404a);
        return valueFindPropertyIgnoralByName == null ? valueFindPropertyIgnoralByName2 : valueFindPropertyIgnoralByName.withOverrides(valueFindPropertyIgnoralByName2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(AbstractC6404a abstractC6404a) {
        JsonIgnoreProperties.Value valueFindPropertyIgnorals = this._secondary.findPropertyIgnorals(abstractC6404a);
        JsonIgnoreProperties.Value valueFindPropertyIgnorals2 = this._primary.findPropertyIgnorals(abstractC6404a);
        return valueFindPropertyIgnorals == null ? valueFindPropertyIgnorals2 : valueFindPropertyIgnorals.withOverrides(valueFindPropertyIgnorals2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonInclude.Value findPropertyInclusion(AbstractC6404a abstractC6404a) {
        JsonInclude.Value valueFindPropertyInclusion = this._secondary.findPropertyInclusion(abstractC6404a);
        JsonInclude.Value valueFindPropertyInclusion2 = this._primary.findPropertyInclusion(abstractC6404a);
        return valueFindPropertyInclusion == null ? valueFindPropertyInclusion2 : valueFindPropertyInclusion.withOverrides(valueFindPropertyInclusion2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a) {
        JsonIncludeProperties.Value valueFindPropertyInclusionByName = this._secondary.findPropertyInclusionByName(mapperConfig, abstractC6404a);
        JsonIncludeProperties.Value valueFindPropertyInclusionByName2 = this._primary.findPropertyInclusionByName(mapperConfig, abstractC6404a);
        return valueFindPropertyInclusionByName == null ? valueFindPropertyInclusionByName2 : valueFindPropertyInclusionByName.withOverrides(valueFindPropertyInclusionByName2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Integer findPropertyIndex(AbstractC6404a abstractC6404a) {
        Integer numFindPropertyIndex = this._primary.findPropertyIndex(abstractC6404a);
        return numFindPropertyIndex == null ? this._secondary.findPropertyIndex(abstractC6404a) : numFindPropertyIndex;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC6430d<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        InterfaceC6430d<?> interfaceC6430dFindPropertyTypeResolver = this._primary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType);
        return interfaceC6430dFindPropertyTypeResolver == null ? this._secondary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType) : interfaceC6430dFindPropertyTypeResolver;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        AnnotationIntrospector.ReferenceProperty referencePropertyFindReferenceType = this._primary.findReferenceType(annotatedMember);
        return referencePropertyFindReferenceType == null ? this._secondary.findReferenceType(annotatedMember) : referencePropertyFindReferenceType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        PropertyName propertyNameFindRenameByField = this._secondary.findRenameByField(mapperConfig, annotatedField, propertyName);
        return propertyNameFindRenameByField == null ? this._primary.findRenameByField(mapperConfig, annotatedField, propertyName) : propertyNameFindRenameByField;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRootName(C6406c c6406c) {
        PropertyName propertyNameFindRootName;
        PropertyName propertyNameFindRootName2 = this._primary.findRootName(c6406c);
        if (propertyNameFindRootName2 == null) {
            return this._secondary.findRootName(c6406c);
        }
        return (propertyNameFindRootName2.hasSimpleName() || (propertyNameFindRootName = this._secondary.findRootName(c6406c)) == null) ? propertyNameFindRootName2 : propertyNameFindRootName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        Object objFindSerializationContentConverter = this._primary.findSerializationContentConverter(annotatedMember);
        return objFindSerializationContentConverter == null ? this._secondary.findSerializationContentConverter(annotatedMember) : objFindSerializationContentConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationContentType(AbstractC6404a abstractC6404a, JavaType javaType) {
        Class<?> clsFindSerializationContentType = this._primary.findSerializationContentType(abstractC6404a, javaType);
        return clsFindSerializationContentType == null ? this._secondary.findSerializationContentType(abstractC6404a, javaType) : clsFindSerializationContentType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationConverter(AbstractC6404a abstractC6404a) {
        Object objFindSerializationConverter = this._primary.findSerializationConverter(abstractC6404a);
        return objFindSerializationConverter == null ? this._secondary.findSerializationConverter(abstractC6404a) : objFindSerializationConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonInclude.Include findSerializationInclusion(AbstractC6404a abstractC6404a, JsonInclude.Include include) {
        return this._primary.findSerializationInclusion(abstractC6404a, this._secondary.findSerializationInclusion(abstractC6404a, include));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonInclude.Include findSerializationInclusionForContent(AbstractC6404a abstractC6404a, JsonInclude.Include include) {
        return this._primary.findSerializationInclusionForContent(abstractC6404a, this._secondary.findSerializationInclusionForContent(abstractC6404a, include));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationKeyType(AbstractC6404a abstractC6404a, JavaType javaType) {
        Class<?> clsFindSerializationKeyType = this._primary.findSerializationKeyType(abstractC6404a, javaType);
        return clsFindSerializationKeyType == null ? this._secondary.findSerializationKeyType(abstractC6404a, javaType) : clsFindSerializationKeyType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findSerializationPropertyOrder(C6406c c6406c) {
        String[] strArrFindSerializationPropertyOrder = this._primary.findSerializationPropertyOrder(c6406c);
        return strArrFindSerializationPropertyOrder == null ? this._secondary.findSerializationPropertyOrder(c6406c) : strArrFindSerializationPropertyOrder;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findSerializationSortAlphabetically(AbstractC6404a abstractC6404a) {
        Boolean boolFindSerializationSortAlphabetically = this._primary.findSerializationSortAlphabetically(abstractC6404a);
        return boolFindSerializationSortAlphabetically == null ? this._secondary.findSerializationSortAlphabetically(abstractC6404a) : boolFindSerializationSortAlphabetically;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationType(AbstractC6404a abstractC6404a) {
        Class<?> clsFindSerializationType = this._primary.findSerializationType(abstractC6404a);
        return clsFindSerializationType == null ? this._secondary.findSerializationType(abstractC6404a) : clsFindSerializationType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSerialize.Typing findSerializationTyping(AbstractC6404a abstractC6404a) {
        JsonSerialize.Typing typingFindSerializationTyping = this._primary.findSerializationTyping(abstractC6404a);
        return typingFindSerializationTyping == null ? this._secondary.findSerializationTyping(abstractC6404a) : typingFindSerializationTyping;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializer(AbstractC6404a abstractC6404a) {
        Object objFindSerializer = this._primary.findSerializer(abstractC6404a);
        return _isExplicitClassOrOb(objFindSerializer, AbstractC6393h.a.class) ? objFindSerializer : _explicitClassOrOb(this._secondary.findSerializer(abstractC6404a), AbstractC6393h.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSetter.Value findSetterInfo(AbstractC6404a abstractC6404a) {
        JsonSetter.Value valueFindSetterInfo = this._secondary.findSetterInfo(abstractC6404a);
        JsonSetter.Value valueFindSetterInfo2 = this._primary.findSetterInfo(abstractC6404a);
        return valueFindSetterInfo == null ? valueFindSetterInfo2 : valueFindSetterInfo.withOverrides(valueFindSetterInfo2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<NamedType> findSubtypes(AbstractC6404a abstractC6404a) {
        List<NamedType> listFindSubtypes = this._primary.findSubtypes(abstractC6404a);
        List<NamedType> listFindSubtypes2 = this._secondary.findSubtypes(abstractC6404a);
        if (listFindSubtypes == null || listFindSubtypes.isEmpty()) {
            return listFindSubtypes2;
        }
        if (listFindSubtypes2 == null || listFindSubtypes2.isEmpty()) {
            return listFindSubtypes;
        }
        ArrayList arrayList = new ArrayList(listFindSubtypes.size() + listFindSubtypes2.size());
        arrayList.addAll(listFindSubtypes);
        arrayList.addAll(listFindSubtypes2);
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findTypeName(C6406c c6406c) {
        String strFindTypeName = this._primary.findTypeName(c6406c);
        return (strFindTypeName == null || strFindTypeName.isEmpty()) ? this._secondary.findTypeName(c6406c) : strFindTypeName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public InterfaceC6430d<?> findTypeResolver(MapperConfig<?> mapperConfig, C6406c c6406c, JavaType javaType) {
        InterfaceC6430d<?> interfaceC6430dFindTypeResolver = this._primary.findTypeResolver(mapperConfig, c6406c, javaType);
        return interfaceC6430dFindTypeResolver == null ? this._secondary.findTypeResolver(mapperConfig, c6406c, javaType) : interfaceC6430dFindTypeResolver;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        NameTransformer nameTransformerFindUnwrappingNameTransformer = this._primary.findUnwrappingNameTransformer(annotatedMember);
        return nameTransformerFindUnwrappingNameTransformer == null ? this._secondary.findUnwrappingNameTransformer(annotatedMember) : nameTransformerFindUnwrappingNameTransformer;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findValueInstantiator(C6406c c6406c) {
        Object objFindValueInstantiator = this._primary.findValueInstantiator(c6406c);
        return objFindValueInstantiator == null ? this._secondary.findValueInstantiator(c6406c) : objFindValueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?>[] findViews(AbstractC6404a abstractC6404a) {
        Class<?>[] clsArrFindViews = this._primary.findViews(abstractC6404a);
        return clsArrFindViews == null ? this._secondary.findViews(abstractC6404a) : clsArrFindViews;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findWrapperName(AbstractC6404a abstractC6404a) {
        PropertyName propertyNameFindWrapperName;
        PropertyName propertyNameFindWrapperName2 = this._primary.findWrapperName(abstractC6404a);
        if (propertyNameFindWrapperName2 == null) {
            return this._secondary.findWrapperName(abstractC6404a);
        }
        return (propertyNameFindWrapperName2 != PropertyName.USE_DEFAULT || (propertyNameFindWrapperName = this._secondary.findWrapperName(abstractC6404a)) == null) ? propertyNameFindWrapperName2 : propertyNameFindWrapperName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnyGetter(AbstractC6404a abstractC6404a) {
        Boolean boolHasAnyGetter = this._primary.hasAnyGetter(abstractC6404a);
        return boolHasAnyGetter == null ? this._secondary.hasAnyGetter(abstractC6404a) : boolHasAnyGetter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAnyGetterAnnotation(annotatedMethod) || this._secondary.hasAnyGetterAnnotation(annotatedMethod);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnySetter(AbstractC6404a abstractC6404a) {
        Boolean boolHasAnySetter = this._primary.hasAnySetter(abstractC6404a);
        return boolHasAnySetter == null ? this._secondary.hasAnySetter(abstractC6404a) : boolHasAnySetter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAnySetterAnnotation(annotatedMethod) || this._secondary.hasAnySetterAnnotation(annotatedMethod);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsKey(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a) {
        Boolean boolHasAsKey = this._primary.hasAsKey(mapperConfig, abstractC6404a);
        return boolHasAsKey == null ? this._secondary.hasAsKey(mapperConfig, abstractC6404a) : boolHasAsKey;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsValue(AbstractC6404a abstractC6404a) {
        Boolean boolHasAsValue = this._primary.hasAsValue(abstractC6404a);
        return boolHasAsValue == null ? this._secondary.hasAsValue(abstractC6404a) : boolHasAsValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAsValueAnnotation(annotatedMethod) || this._secondary.hasAsValueAnnotation(annotatedMethod);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasCreatorAnnotation(AbstractC6404a abstractC6404a) {
        return this._primary.hasCreatorAnnotation(abstractC6404a) || this._secondary.hasCreatorAnnotation(abstractC6404a);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return this._primary.hasIgnoreMarker(annotatedMember) || this._secondary.hasIgnoreMarker(annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        Boolean boolHasRequiredMarker = this._primary.hasRequiredMarker(annotatedMember);
        return boolHasRequiredMarker == null ? this._secondary.hasRequiredMarker(annotatedMember) : boolHasRequiredMarker;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean isAnnotationBundle(Annotation annotation) {
        return this._primary.isAnnotationBundle(annotation) || this._secondary.isAnnotationBundle(annotation);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isIgnorableType(C6406c c6406c) {
        Boolean boolIsIgnorableType = this._primary.isIgnorableType(c6406c);
        return boolIsIgnorableType == null ? this._secondary.isIgnorableType(c6406c) : boolIsIgnorableType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        Boolean boolIsTypeId = this._primary.isTypeId(annotatedMember);
        return boolIsTypeId == null ? this._secondary.isTypeId(annotatedMember) : boolIsTypeId;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a, JavaType javaType) throws JsonMappingException {
        return this._primary.refineDeserializationType(mapperConfig, abstractC6404a, this._secondary.refineDeserializationType(mapperConfig, abstractC6404a, javaType));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, AbstractC6404a abstractC6404a, JavaType javaType) throws JsonMappingException {
        return this._primary.refineSerializationType(mapperConfig, abstractC6404a, this._secondary.refineSerializationType(mapperConfig, abstractC6404a, javaType));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        AnnotatedMethod annotatedMethodResolveSetterConflict = this._primary.resolveSetterConflict(mapperConfig, annotatedMethod, annotatedMethod2);
        return annotatedMethodResolveSetterConflict == null ? this._secondary.resolveSetterConflict(mapperConfig, annotatedMethod, annotatedMethod2) : annotatedMethodResolveSetterConflict;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Version version() {
        return this._primary.version();
    }

    public AnnotationIntrospectorPair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._primary = annotationIntrospector;
        this._secondary = annotationIntrospector2;
    }
}
