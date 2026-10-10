package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import com.fasterxml.jackson.databind.util.InterfaceC6494k;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;
import p528p7.InterfaceC43404j;

/* JADX INFO: loaded from: classes45.dex */
public interface BeanProperty extends InterfaceC6494k {

    /* JADX INFO: renamed from: J0 */
    public static final JsonFormat.Value f10186J0 = new JsonFormat.Value();

    /* JADX INFO: renamed from: L0 */
    public static final JsonInclude.Value f10187L0 = JsonInclude.Value.empty();

    public static class Std implements BeanProperty, Serializable {
        private static final long serialVersionUID = 1;
        protected final AnnotatedMember _member;
        protected final PropertyMetadata _metadata;
        protected final PropertyName _name;
        protected final JavaType _type;
        protected final PropertyName _wrapperName;

        public Std(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AnnotatedMember annotatedMember, PropertyMetadata propertyMetadata) {
            this._name = propertyName;
            this._type = javaType;
            this._wrapperName = propertyName2;
            this._metadata = propertyMetadata;
            this._member = annotatedMember;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
            return null;
        }

        public boolean isVirtual() {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public void depositSchemaProperty(InterfaceC43404j interfaceC43404j, AbstractC6446m abstractC6446m) {
            throw new UnsupportedOperationException("Instances of " + getClass().getName() + " should not get visited");
        }

        public List<PropertyName> findAliases(MapperConfig<?> mapperConfig) {
            return Collections.EMPTY_LIST;
        }

        @Deprecated
        public JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationIntrospector) {
            JsonFormat.Value valueFindFormat;
            AnnotatedMember annotatedMember = this._member;
            return (annotatedMember == null || annotationIntrospector == null || (valueFindFormat = annotationIntrospector.findFormat(annotatedMember)) == null) ? BeanProperty.f10186J0 : valueFindFormat;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonInclude.Value valueFindPropertyInclusion;
            JsonInclude.Value defaultInclusion = mapperConfig.getDefaultInclusion(cls, this._type.getRawClass());
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            return (annotationIntrospector == null || (annotatedMember = this._member) == null || (valueFindPropertyInclusion = annotationIntrospector.findPropertyInclusion(annotatedMember)) == null) ? defaultInclusion : defaultInclusion.withOverrides(valueFindPropertyInclusion);
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            AnnotatedMember annotatedMember = this._member;
            if (annotatedMember == null) {
                return null;
            }
            return (A) annotatedMember.getAnnotation(cls);
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyName getFullName() {
            return this._name;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public AnnotatedMember getMember() {
            return this._member;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyMetadata getMetadata() {
            return this._metadata;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.InterfaceC6494k
        public String getName() {
            return this._name.getSimpleName();
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JavaType getType() {
            return this._type;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyName getWrapperName() {
            return this._wrapperName;
        }

        public boolean isRequired() {
            return this._metadata.isRequired();
        }

        public Std withType(JavaType javaType) {
            return new Std(this, javaType);
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonFormat.Value valueFindFormat;
            JsonFormat.Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector != null && (annotatedMember = this._member) != null && (valueFindFormat = annotationIntrospector.findFormat(annotatedMember)) != null) {
                return defaultPropertyFormat.withOverrides(valueFindFormat);
            }
            return defaultPropertyFormat;
        }

        @Deprecated
        public Std(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, InterfaceC6484a interfaceC6484a, AnnotatedMember annotatedMember, PropertyMetadata propertyMetadata) {
            this(propertyName, javaType, propertyName2, annotatedMember, propertyMetadata);
        }

        public Std(Std std, JavaType javaType) {
            this(std._name, javaType, std._wrapperName, std._member, std._metadata);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.BeanProperty$a */
    public static class C6333a implements BeanProperty {
        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public AnnotatedMember getMember() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyName getWrapperName() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyName getFullName() {
            return PropertyName.NO_NAME;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public PropertyMetadata getMetadata() {
            return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.InterfaceC6494k
        public String getName() {
            return "";
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            return JsonFormat.Value.empty();
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JavaType getType() {
            return TypeFactory.unknownType();
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public void depositSchemaProperty(InterfaceC43404j interfaceC43404j, AbstractC6446m abstractC6446m) throws JsonMappingException {
        }
    }

    void depositSchemaProperty(InterfaceC43404j interfaceC43404j, AbstractC6446m abstractC6446m) throws JsonMappingException;

    JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls);

    JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls);

    <A extends Annotation> A getAnnotation(Class<A> cls);

    <A extends Annotation> A getContextAnnotation(Class<A> cls);

    PropertyName getFullName();

    AnnotatedMember getMember();

    PropertyMetadata getMetadata();

    @Override // com.fasterxml.jackson.databind.util.InterfaceC6494k
    String getName();

    JavaType getType();

    PropertyName getWrapperName();
}
