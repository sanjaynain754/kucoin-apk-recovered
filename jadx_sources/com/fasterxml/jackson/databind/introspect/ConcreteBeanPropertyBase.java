package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;
import p528p7.InterfaceC43404j;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ConcreteBeanPropertyBase implements BeanProperty, Serializable {
    private static final long serialVersionUID = 1;
    protected transient List<PropertyName> _aliases;
    protected final PropertyMetadata _metadata;

    public ConcreteBeanPropertyBase(PropertyMetadata propertyMetadata) {
        this._metadata = propertyMetadata == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : propertyMetadata;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ void depositSchemaProperty(InterfaceC43404j interfaceC43404j, AbstractC6446m abstractC6446m) throws JsonMappingException;

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ Annotation getAnnotation(Class cls);

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ Annotation getContextAnnotation(Class cls);

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ PropertyName getFullName();

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ AnnotatedMember getMember();

    @Override // com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.InterfaceC6494k
    public abstract /* synthetic */ String getName();

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ JavaType getType();

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ PropertyName getWrapperName();

    public boolean isVirtual() {
        return false;
    }

    public List<PropertyName> findAliases(MapperConfig<?> mapperConfig) {
        AnnotatedMember member;
        List<PropertyName> listFindPropertyAliases = this._aliases;
        if (listFindPropertyAliases == null) {
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector != null && (member = getMember()) != null) {
                listFindPropertyAliases = annotationIntrospector.findPropertyAliases(member);
            }
            if (listFindPropertyAliases == null) {
                listFindPropertyAliases = Collections.EMPTY_LIST;
            }
            this._aliases = listFindPropertyAliases;
        }
        return listFindPropertyAliases;
    }

    @Deprecated
    public final JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationIntrospector) {
        AnnotatedMember member;
        JsonFormat.Value valueFindFormat = (annotationIntrospector == null || (member = getMember()) == null) ? null : annotationIntrospector.findFormat(member);
        return valueFindFormat == null ? BeanProperty.f10186J0 : valueFindFormat;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyMetadata getMetadata() {
        return this._metadata;
    }

    public boolean isRequired() {
        return this._metadata.isRequired();
    }

    public ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concreteBeanPropertyBase) {
        this._metadata = concreteBeanPropertyBase._metadata;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
        JsonFormat.Value valueFindFormat;
        AnnotatedMember member;
        JsonFormat.Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        if (annotationIntrospector != null && (member = getMember()) != null) {
            valueFindFormat = annotationIntrospector.findFormat(member);
        } else {
            valueFindFormat = null;
        }
        if (defaultPropertyFormat == null) {
            if (valueFindFormat == null) {
                return BeanProperty.f10186J0;
            }
            return valueFindFormat;
        }
        if (valueFindFormat == null) {
            return defaultPropertyFormat;
        }
        return defaultPropertyFormat.withOverrides(valueFindFormat);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        AnnotatedMember member = getMember();
        if (member == null) {
            return mapperConfig.getDefaultPropertyInclusion(cls);
        }
        JsonInclude.Value defaultInclusion = mapperConfig.getDefaultInclusion(cls, member.getRawType());
        if (annotationIntrospector == null) {
            return defaultInclusion;
        }
        JsonInclude.Value valueFindPropertyInclusion = annotationIntrospector.findPropertyInclusion(member);
        if (defaultInclusion == null) {
            return valueFindPropertyInclusion;
        }
        return defaultInclusion.withOverrides(valueFindPropertyInclusion);
    }
}
