package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.core.p062io.SerializedString;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AbstractC6404a;
import com.fasterxml.jackson.databind.introspect.AbstractC6415l;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.C6406c;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.AbstractC6427a;
import com.fasterxml.jackson.databind.jsontype.DefaultBaseTypeLimitingValidator;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import p424l7.AbstractC42116b;

/* JADX INFO: loaded from: classes45.dex */
public abstract class MapperConfig<T extends MapperConfig<T>> implements AbstractC6415l.a, Serializable {
    private static final long serialVersionUID = 2;
    protected final BaseSettings _base;
    protected final long _mapperFeatures;
    protected static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();
    protected static final JsonFormat.Value EMPTY_FORMAT = JsonFormat.Value.empty();

    public MapperConfig(BaseSettings baseSettings, long j11) {
        this._base = baseSettings;
        this._mapperFeatures = j11;
    }

    public final JavaType constructType(Class<?> cls) {
        return getTypeFactory().constructType(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6415l.a
    public abstract /* synthetic */ AbstractC6415l.a copy();

    public abstract AbstractC6344b findConfigOverride(Class<?> cls);

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6415l.a
    public abstract /* synthetic */ Class findMixInClassFor(Class cls);

    public abstract PropertyName findRootName(JavaType javaType);

    public abstract PropertyName findRootName(Class<?> cls);

    public abstract Class<?> getActiveView();

    public abstract ContextAttributes getAttributes();

    public abstract AbstractC6344b getConfigOverride(Class<?> cls);

    public abstract JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2);

    public JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2, JsonInclude.Value value) {
        return JsonInclude.Value.mergeAll(value, getConfigOverride(cls).getInclude(), getConfigOverride(cls2).getIncludeAsProperty());
    }

    public abstract Boolean getDefaultMergeable();

    public abstract Boolean getDefaultMergeable(Class<?> cls);

    public abstract JsonFormat.Value getDefaultPropertyFormat(Class<?> cls);

    public abstract JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls);

    public abstract JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls, C6406c c6406c);

    public abstract JsonInclude.Value getDefaultPropertyInclusion();

    public abstract JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls);

    public JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls, JsonInclude.Value value) {
        JsonInclude.Value include = getConfigOverride(cls).getInclude();
        return include != null ? include : value;
    }

    public abstract JsonIncludeProperties.Value getDefaultPropertyInclusions(Class<?> cls, C6406c c6406c);

    public abstract JsonSetter.Value getDefaultSetterInfo();

    public abstract VisibilityChecker<?> getDefaultVisibilityChecker();

    public abstract VisibilityChecker<?> getDefaultVisibilityChecker(Class<?> cls, C6406c c6406c);

    public abstract AbstractC6427a getSubtypeResolver();

    public AbstractC6340b introspectClassAnnotations(Class<?> cls) {
        return introspectClassAnnotations(constructType(cls));
    }

    public AbstractC6340b introspectDirectClassAnnotations(Class<?> cls) {
        return introspectDirectClassAnnotations(constructType(cls));
    }

    public abstract boolean useRootWrapping();

    public abstract T with(MapperFeature mapperFeature, boolean z11);

    public abstract T with(MapperFeature... mapperFeatureArr);

    public abstract T without(MapperFeature... mapperFeatureArr);

    public final boolean canOverrideAccessModifiers() {
        return isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public InterfaceC6306i compileString(String str) {
        return new SerializedString(str);
    }

    public final JavaType constructType(AbstractC42116b<?> abstractC42116b) {
        getTypeFactory();
        throw null;
    }

    public final AccessorNamingStrategy.Provider getAccessorNaming() {
        return this._base.getAccessorNaming();
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS) ? this._base.getAnnotationIntrospector() : NopAnnotationIntrospector.instance;
    }

    public Base64Variant getBase64Variant() {
        return this._base.getBase64Variant();
    }

    public AbstractC6415l getClassIntrospector() {
        return this._base.getClassIntrospector();
    }

    public final DateFormat getDateFormat() {
        return this._base.getDateFormat();
    }

    public final InterfaceC6430d<?> getDefaultTyper(JavaType javaType) {
        return this._base.getTypeResolverBuilder();
    }

    public final AbstractC6345c getHandlerInstantiator() {
        this._base.getHandlerInstantiator();
        return null;
    }

    public final Locale getLocale() {
        return this._base.getLocale();
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        PolymorphicTypeValidator polymorphicTypeValidator = this._base.getPolymorphicTypeValidator();
        return (polymorphicTypeValidator == LaissezFaireSubTypeValidator.instance && isEnabled(MapperFeature.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES)) ? new DefaultBaseTypeLimitingValidator() : polymorphicTypeValidator;
    }

    public final PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._base.getPropertyNamingStrategy();
    }

    public final TimeZone getTimeZone() {
        return this._base.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._base.getTypeFactory();
    }

    public boolean hasExplicitTimeZone() {
        return this._base.hasExplicitTimeZone();
    }

    @Deprecated
    public final boolean hasMapperFeatures(int i11) {
        long j11 = i11;
        return (this._mapperFeatures & j11) == j11;
    }

    public AbstractC6340b introspectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forClassAnnotations(this, javaType, this);
    }

    public final AbstractC6340b introspectDirectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forDirectClassAnnotations(this, javaType, this);
    }

    public final boolean isAnnotationProcessingEnabled() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return mapperFeature.enabledIn(this._mapperFeatures);
    }

    public final boolean shouldSortPropertiesAlphabetically() {
        return isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public static <F extends Enum<F> & InterfaceC6343a> int collectFeatureDefaults(Class<F> cls) {
        int mask = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            InterfaceC6343a interfaceC6343a = (InterfaceC6343a) obj;
            if (interfaceC6343a.enabledByDefault()) {
                mask |= interfaceC6343a.getMask();
            }
        }
        return mask;
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        return getTypeFactory().constructSpecializedType(javaType, cls, true);
    }

    public InterfaceC6429c typeIdResolverInstance(AbstractC6404a abstractC6404a, Class<? extends InterfaceC6429c> cls) {
        getHandlerInstantiator();
        return (InterfaceC6429c) C6490g.m11946l(cls, canOverrideAccessModifiers());
    }

    public InterfaceC6430d<?> typeResolverBuilderInstance(AbstractC6404a abstractC6404a, Class<? extends InterfaceC6430d<?>> cls) {
        getHandlerInstantiator();
        return (InterfaceC6430d) C6490g.m11946l(cls, canOverrideAccessModifiers());
    }

    public MapperConfig(MapperConfig<T> mapperConfig, long j11) {
        this._base = mapperConfig._base;
        this._mapperFeatures = j11;
    }

    public MapperConfig(MapperConfig<T> mapperConfig, BaseSettings baseSettings) {
        this._base = baseSettings;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }

    public MapperConfig(MapperConfig<T> mapperConfig) {
        this._base = mapperConfig._base;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }
}
