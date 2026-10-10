package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.InterfaceC6343a;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.AbstractC6415l;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.C6406c;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.AbstractC6427a;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes45.dex */
public abstract class MapperConfigBase<CFG extends InterfaceC6343a, T extends MapperConfigBase<CFG, T>> extends MapperConfig<T> implements Serializable {
    protected static final AbstractC6344b EMPTY_OVERRIDE = AbstractC6344b.empty();

    /* JADX INFO: renamed from: b */
    public static final long f10211b = MapperFeature.collectLongDefaults();

    /* JADX INFO: renamed from: c */
    public static final long f10212c = (((MapperFeature.AUTO_DETECT_FIELDS.getLongMask() | MapperFeature.AUTO_DETECT_GETTERS.getLongMask()) | MapperFeature.AUTO_DETECT_IS_GETTERS.getLongMask()) | MapperFeature.AUTO_DETECT_SETTERS.getLongMask()) | MapperFeature.AUTO_DETECT_CREATORS.getLongMask();
    protected final ContextAttributes _attributes;
    protected final ConfigOverrides _configOverrides;
    protected final SimpleMixInResolver _mixIns;
    protected final PropertyName _rootName;
    protected final RootNameLookup _rootNames;
    protected final AbstractC6427a _subtypeResolver;
    protected final Class<?> _view;

    public MapperConfigBase(BaseSettings baseSettings, AbstractC6427a abstractC6427a, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, f10211b);
        this._mixIns = simpleMixInResolver;
        this._subtypeResolver = abstractC6427a;
        this._rootNames = rootNameLookup;
        this._rootName = null;
        this._view = null;
        this._attributes = ContextAttributes.getEmpty();
        this._configOverrides = configOverrides;
    }

    public abstract T _withBase(BaseSettings baseSettings);

    public abstract T _withMapperFeatures(long j11);

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public PropertyName findRootName(JavaType javaType) {
        PropertyName propertyName = this._rootName;
        return propertyName != null ? propertyName : this._rootNames.findRootName(javaType, this);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public Boolean getDefaultMergeable() {
        return this._configOverrides.getDefaultMergeable();
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls) {
        JsonIgnoreProperties.Value ignorals;
        AbstractC6344b abstractC6344bFindOverride = this._configOverrides.findOverride(cls);
        if (abstractC6344bFindOverride == null || (ignorals = abstractC6344bFindOverride.getIgnorals()) == null) {
            return null;
        }
        return ignorals;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.Value getDefaultPropertyInclusion() {
        return this._configOverrides.getDefaultInclusion();
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final VisibilityChecker<?> getDefaultVisibilityChecker() {
        VisibilityChecker<?> defaultVisibility = this._configOverrides.getDefaultVisibility();
        long j11 = this._mapperFeatures;
        long j12 = f10212c;
        if ((j11 & j12) == j12) {
            return defaultVisibility;
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_FIELDS)) {
            defaultVisibility = defaultVisibility.withFieldVisibility(JsonAutoDetect.Visibility.NONE);
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_GETTERS)) {
            defaultVisibility = defaultVisibility.withGetterVisibility(JsonAutoDetect.Visibility.NONE);
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_IS_GETTERS)) {
            defaultVisibility = defaultVisibility.withIsGetterVisibility(JsonAutoDetect.Visibility.NONE);
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_SETTERS)) {
            defaultVisibility = defaultVisibility.withSetterVisibility(JsonAutoDetect.Visibility.NONE);
        }
        return !isEnabled(MapperFeature.AUTO_DETECT_CREATORS) ? defaultVisibility.withCreatorVisibility(JsonAutoDetect.Visibility.NONE) : defaultVisibility;
    }

    public abstract T with(ContextAttributes contextAttributes);

    public abstract T with(AbstractC6427a abstractC6427a);

    public abstract T withRootName(PropertyName propertyName);

    public T withRootName(String str) {
        return str == null ? (T) withRootName((PropertyName) null) : (T) withRootName(PropertyName.construct(str));
    }

    public abstract T withView(Class<?> cls);

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AbstractC6415l.a
    public AbstractC6415l.a copy() {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final AbstractC6344b findConfigOverride(Class<?> cls) {
        return this._configOverrides.findOverride(cls);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AbstractC6415l.a
    public final Class<?> findMixInClassFor(Class<?> cls) {
        return this._mixIns.findMixInClassFor(cls);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final Class<?> getActiveView() {
        return this._view;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final ContextAttributes getAttributes() {
        return this._attributes;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final AbstractC6344b getConfigOverride(Class<?> cls) {
        AbstractC6344b abstractC6344bFindOverride = this._configOverrides.findOverride(cls);
        return abstractC6344bFindOverride == null ? EMPTY_OVERRIDE : abstractC6344bFindOverride;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public Boolean getDefaultMergeable(Class<?> cls) {
        Boolean mergeable;
        AbstractC6344b abstractC6344bFindOverride = this._configOverrides.findOverride(cls);
        return (abstractC6344bFindOverride == null || (mergeable = abstractC6344bFindOverride.getMergeable()) == null) ? this._configOverrides.getDefaultMergeable() : mergeable;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._configOverrides.findFormatDefaults(cls);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls) {
        JsonInclude.Value include = getConfigOverride(cls).getInclude();
        JsonInclude.Value defaultPropertyInclusion = getDefaultPropertyInclusion();
        return defaultPropertyInclusion == null ? include : defaultPropertyInclusion.withOverrides(include);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonSetter.Value getDefaultSetterInfo() {
        return this._configOverrides.getDefaultSetterInfo();
    }

    public final PropertyName getFullRootName() {
        return this._rootName;
    }

    @Deprecated
    public final String getRootName() {
        PropertyName propertyName = this._rootName;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final AbstractC6427a getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public final int mixInCount() {
        return this._mixIns.localSize();
    }

    public final T withAppendedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return (T) _withBase(this._base.withAppendedAnnotationIntrospector(annotationIntrospector));
    }

    public final T withInsertedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return (T) _withBase(this._base.withInsertedAnnotationIntrospector(annotationIntrospector));
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final T without(MapperFeature... mapperFeatureArr) {
        long j11 = this._mapperFeatures;
        for (MapperFeature mapperFeature : mapperFeatureArr) {
            j11 &= ~mapperFeature.getLongMask();
        }
        return j11 == this._mapperFeatures ? this : (T) _withMapperFeatures(j11);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public PropertyName findRootName(Class<?> cls) {
        PropertyName propertyName = this._rootName;
        return propertyName != null ? propertyName : this._rootNames.findRootName(cls, this);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2) {
        JsonInclude.Value includeAsProperty = getConfigOverride(cls2).getIncludeAsProperty();
        JsonInclude.Value defaultPropertyInclusion = getDefaultPropertyInclusion(cls);
        if (defaultPropertyInclusion == null) {
            return includeAsProperty;
        }
        return defaultPropertyInclusion.withOverrides(includeAsProperty);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls, C6406c c6406c) {
        AnnotationIntrospector annotationIntrospector = getAnnotationIntrospector();
        return JsonIgnoreProperties.Value.merge(annotationIntrospector == null ? null : annotationIntrospector.findPropertyIgnoralByName(this, c6406c), getDefaultPropertyIgnorals(cls));
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonIncludeProperties.Value getDefaultPropertyInclusions(Class<?> cls, C6406c c6406c) {
        AnnotationIntrospector annotationIntrospector = getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPropertyInclusionByName(this, c6406c);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final T with(MapperFeature... mapperFeatureArr) {
        long longMask = this._mapperFeatures;
        for (MapperFeature mapperFeature : mapperFeatureArr) {
            longMask |= mapperFeature.getLongMask();
        }
        return longMask == this._mapperFeatures ? this : (T) _withMapperFeatures(longMask);
    }

    public T withAttribute(Object obj, Object obj2) {
        return (T) with(getAttributes().withSharedAttribute(obj, obj2));
    }

    public T withAttributes(Map<?, ?> map) {
        return (T) with(getAttributes().withSharedAttributes(map));
    }

    public T withoutAttribute(Object obj) {
        return (T) with(getAttributes().withoutSharedAttribute(obj));
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final T with(MapperFeature mapperFeature, boolean z11) {
        long longMask;
        if (z11) {
            longMask = mapperFeature.getLongMask() | this._mapperFeatures;
        } else {
            longMask = (~mapperFeature.getLongMask()) & this._mapperFeatures;
        }
        return longMask == this._mapperFeatures ? this : (T) _withMapperFeatures(longMask);
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, AbstractC6427a abstractC6427a, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(mapperConfigBase, mapperConfigBase._base.copy());
        this._mixIns = simpleMixInResolver;
        this._subtypeResolver = abstractC6427a;
        this._rootNames = rootNameLookup;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = configOverrides;
    }

    public final T with(AnnotationIntrospector annotationIntrospector) {
        return (T) _withBase(this._base.withAnnotationIntrospector(annotationIntrospector));
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final VisibilityChecker<?> getDefaultVisibilityChecker(Class<?> cls, C6406c c6406c) {
        VisibilityChecker<?> defaultVisibilityChecker;
        if (C6490g.m11910M(cls)) {
            defaultVisibilityChecker = VisibilityChecker.Std.allPublicInstance();
        } else {
            defaultVisibilityChecker = getDefaultVisibilityChecker();
        }
        AnnotationIntrospector annotationIntrospector = getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            defaultVisibilityChecker = annotationIntrospector.findAutoDetectVisibility(c6406c, defaultVisibilityChecker);
        }
        AbstractC6344b abstractC6344bFindOverride = this._configOverrides.findOverride(cls);
        return abstractC6344bFindOverride != null ? defaultVisibilityChecker.withOverrides(abstractC6344bFindOverride.getVisibility()) : defaultVisibilityChecker;
    }

    public final T with(AbstractC6415l abstractC6415l) {
        return (T) _withBase(this._base.withClassIntrospector(abstractC6415l));
    }

    public final T with(TypeFactory typeFactory) {
        return (T) _withBase(this._base.withTypeFactory(typeFactory));
    }

    public final T with(InterfaceC6430d<?> interfaceC6430d) {
        return (T) _withBase(this._base.withTypeResolverBuilder(interfaceC6430d));
    }

    public final T with(PropertyNamingStrategy propertyNamingStrategy) {
        return (T) _withBase(this._base.withPropertyNamingStrategy(propertyNamingStrategy));
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    public final T with(AccessorNamingStrategy.Provider provider) {
        return (T) _withBase(this._base.withAccessorNaming(provider));
    }

    public final T with(AbstractC6345c abstractC6345c) {
        return (T) _withBase(this._base.withHandlerInstantiator(abstractC6345c));
    }

    public final T with(Base64Variant base64Variant) {
        return (T) _withBase(this._base.with(base64Variant));
    }

    public T with(DateFormat dateFormat) {
        return (T) _withBase(this._base.withDateFormat(dateFormat));
    }

    public final T with(Locale locale) {
        return (T) _withBase(this._base.with(locale));
    }

    public final T with(TimeZone timeZone) {
        return (T) _withBase(this._base.with(timeZone));
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, BaseSettings baseSettings) {
        super(mapperConfigBase, baseSettings);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, long j11) {
        super(mapperConfigBase, j11);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, AbstractC6427a abstractC6427a) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = abstractC6427a;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, PropertyName propertyName) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = propertyName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, Class<?> cls) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = cls;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, SimpleMixInResolver simpleMixInResolver) {
        super(mapperConfigBase);
        this._mixIns = simpleMixInResolver;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, ContextAttributes contextAttributes) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = contextAttributes;
        this._configOverrides = mapperConfigBase._configOverrides;
    }
}
