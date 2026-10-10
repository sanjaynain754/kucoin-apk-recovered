package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.InterfaceC6298b;
import com.fasterxml.jackson.core.InterfaceC6299c;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.deser.AbstractC6361f;
import com.fasterxml.jackson.databind.introspect.C6406c;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.AbstractC6427a;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C6492i;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes45.dex */
public final class DeserializationConfig extends MapperConfigBase<DeserializationFeature, DeserializationConfig> implements Serializable {

    /* JADX INFO: renamed from: d */
    public static final int f10188d = MapperConfig.collectFeatureDefaults(DeserializationFeature.class);
    private static final long serialVersionUID = 2;
    protected final CoercionConfigs _coercionConfigs;
    protected final ConstructorDetector _ctorDetector;
    protected final int _deserFeatures;
    protected final int _formatReadFeatures;
    protected final int _formatReadFeaturesToChange;
    protected final JsonNodeFactory _nodeFactory;
    protected final int _parserFeatures;
    protected final int _parserFeaturesToChange;
    protected final C6492i<AbstractC6361f> _problemHandlers;

    public DeserializationConfig(BaseSettings baseSettings, AbstractC6427a abstractC6427a, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, CoercionConfigs coercionConfigs) {
        super(baseSettings, abstractC6427a, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = f10188d;
        this._problemHandlers = null;
        this._nodeFactory = JsonNodeFactory.instance;
        this._ctorDetector = null;
        this._coercionConfigs = coercionConfigs;
        this._parserFeatures = 0;
        this._parserFeaturesToChange = 0;
        this._formatReadFeatures = 0;
        this._formatReadFeaturesToChange = 0;
    }

    public JsonParser initialize(JsonParser jsonParser) {
        int i11 = this._parserFeaturesToChange;
        if (i11 != 0) {
            jsonParser.mo10911w0(this._parserFeatures, i11);
        }
        int i12 = this._formatReadFeaturesToChange;
        if (i12 != 0) {
            jsonParser.mo10909v0(this._formatReadFeatures, i12);
        }
        return jsonParser;
    }

    public AbstractC6340b introspectForBuilder(JavaType javaType, AbstractC6340b abstractC6340b) {
        return getClassIntrospector().forDeserializationWithBuilder(this, javaType, this, abstractC6340b);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._deserFeatures) != 0;
    }

    public DeserializationConfig withFeatures(DeserializationFeature... deserializationFeatureArr) {
        int mask = this._deserFeatures;
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            mask |= deserializationFeature.getMask();
        }
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public /* bridge */ /* synthetic */ MapperConfigBase withView(Class cls) {
        return withView((Class<?>) cls);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature) {
        int i11 = this._deserFeatures & (~deserializationFeature.getMask());
        return i11 == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i11, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        int i11 = this._deserFeatures;
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            i11 &= ~deserializationFeature.getMask();
        }
        return i11 == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i11, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new DeserializationConfig(this, baseSettings);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _withMapperFeatures(long j11) {
        return new DeserializationConfig(this, j11, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    /* JADX INFO: renamed from: a */
    public final DeserializationConfig m11131a(InterfaceC6298b... interfaceC6298bArr) {
        JsonParser.Feature featureMappedFeature;
        int i11 = this._parserFeatures;
        int i12 = this._parserFeaturesToChange;
        int i13 = this._formatReadFeatures;
        int i14 = this._formatReadFeaturesToChange;
        int i15 = i11;
        int i16 = i13;
        for (InterfaceC6298b interfaceC6298b : interfaceC6298bArr) {
            int mask = interfaceC6298b.getMask();
            i16 |= mask;
            i14 |= mask;
            if ((interfaceC6298b instanceof JsonReadFeature) && (featureMappedFeature = ((JsonReadFeature) interfaceC6298b).mappedFeature()) != null) {
                int mask2 = featureMappedFeature.getMask();
                i15 |= mask2;
                i12 |= mask2;
            }
        }
        return (this._formatReadFeatures == i16 && this._formatReadFeaturesToChange == i14 && this._parserFeatures == i15 && this._parserFeaturesToChange == i12) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i15, i12, i16, i14);
    }

    /* JADX INFO: renamed from: b */
    public final DeserializationConfig m11132b(InterfaceC6298b... interfaceC6298bArr) {
        JsonParser.Feature featureMappedFeature;
        int i11 = this._parserFeatures;
        int i12 = this._parserFeaturesToChange;
        int i13 = this._formatReadFeatures;
        int i14 = this._formatReadFeaturesToChange;
        int i15 = i11;
        int i16 = i13;
        for (InterfaceC6298b interfaceC6298b : interfaceC6298bArr) {
            int mask = interfaceC6298b.getMask();
            i16 &= ~mask;
            i14 |= mask;
            if ((interfaceC6298b instanceof JsonReadFeature) && (featureMappedFeature = ((JsonReadFeature) interfaceC6298b).mappedFeature()) != null) {
                int mask2 = featureMappedFeature.getMask();
                i15 &= ~mask2;
                i12 |= mask2;
            }
        }
        return (this._formatReadFeatures == i16 && this._formatReadFeaturesToChange == i14 && this._parserFeatures == i15 && this._parserFeaturesToChange == i12) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i15, i12, i16, i14);
    }

    public CoercionAction findCoercionAction(LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        return this._coercionConfigs.findCoercion(this, logicalType, cls, coercionInputShape);
    }

    public CoercionAction findCoercionFromBlankString(LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        return this._coercionConfigs.findCoercionFromBlankString(this, logicalType, cls, coercionAction);
    }

    public BaseSettings getBaseSettings() {
        return this._base;
    }

    public ConstructorDetector getConstructorDetector() {
        ConstructorDetector constructorDetector = this._ctorDetector;
        return constructorDetector == null ? ConstructorDetector.DEFAULT : constructorDetector;
    }

    public final int getDeserializationFeatures() {
        return this._deserFeatures;
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._nodeFactory;
    }

    public C6492i<AbstractC6361f> getProblemHandlers() {
        return this._problemHandlers;
    }

    public final boolean hasDeserializationFeatures(int i11) {
        return (this._deserFeatures & i11) == i11;
    }

    public final boolean hasSomeOfFeatures(int i11) {
        return (i11 & this._deserFeatures) != 0;
    }

    @Deprecated
    public AbstractC6340b introspectForBuilder(JavaType javaType) {
        return getClassIntrospector().forDeserializationWithBuilder(this, javaType, this);
    }

    public final boolean isEnabled(JsonParser.Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this._parserFeaturesToChange) != 0) {
            return (feature.getMask() & this._parserFeatures) != 0;
        }
        return jsonFactory.isEnabled(feature);
    }

    public final boolean requiresFullValue() {
        return DeserializationFeature.FAIL_ON_TRAILING_TOKENS.enabledIn(this._deserFeatures);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public boolean useRootWrapping() {
        PropertyName propertyName = this._rootName;
        return propertyName != null ? !propertyName.isEmpty() : isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
    }

    public DeserializationConfig withHandler(AbstractC6361f abstractC6361f) {
        return C6492i.m11974a(this._problemHandlers, abstractC6361f) ? this : new DeserializationConfig(this, (C6492i<AbstractC6361f>) new C6492i(abstractC6361f, this._problemHandlers));
    }

    public DeserializationConfig withNoProblemHandlers() {
        return this._problemHandlers == null ? this : new DeserializationConfig(this, (C6492i<AbstractC6361f>) null);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig withRootName(PropertyName propertyName) {
        return (propertyName != null ? !propertyName.equals(this._rootName) : this._rootName != null) ? new DeserializationConfig(this, propertyName) : this;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new DeserializationConfig(this, cls);
    }

    public AbstractC6428b findTypeDeserializer(JavaType javaType) throws JsonMappingException {
        Collection<NamedType> collectionCollectAndResolveSubtypesByTypeId;
        C6406c c6406cMo11174t = introspectClassAnnotations(javaType.getRawClass()).mo11174t();
        InterfaceC6430d<?> interfaceC6430dFindTypeResolver = getAnnotationIntrospector().findTypeResolver(this, c6406cMo11174t, javaType);
        if (interfaceC6430dFindTypeResolver == null) {
            interfaceC6430dFindTypeResolver = getDefaultTyper(javaType);
            collectionCollectAndResolveSubtypesByTypeId = null;
            if (interfaceC6430dFindTypeResolver == null) {
                return null;
            }
        } else {
            collectionCollectAndResolveSubtypesByTypeId = getSubtypeResolver().collectAndResolveSubtypesByTypeId(this, c6406cMo11174t);
        }
        return interfaceC6430dFindTypeResolver.buildTypeDeserializer(this, javaType, collectionCollectAndResolveSubtypesByTypeId);
    }

    public AbstractC6340b introspect(JavaType javaType) {
        return getClassIntrospector().forDeserialization(this, javaType, this);
    }

    public AbstractC6340b introspectForCreation(JavaType javaType) {
        return getClassIntrospector().forCreation(this, javaType, this);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig with(AbstractC6427a abstractC6427a) {
        return this._subtypeResolver == abstractC6427a ? this : new DeserializationConfig(this, abstractC6427a);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int i11 = (~deserializationFeature.getMask()) & this._deserFeatures;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            i11 &= ~deserializationFeature2.getMask();
        }
        return i11 == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i11, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new DeserializationConfig(this, contextAttributes);
    }

    public JsonParser initialize(JsonParser jsonParser, InterfaceC6299c interfaceC6299c) {
        int i11 = this._parserFeaturesToChange;
        if (i11 != 0) {
            jsonParser.mo10911w0(this._parserFeatures, i11);
        }
        int i12 = this._formatReadFeaturesToChange;
        if (i12 != 0) {
            jsonParser.mo10909v0(this._formatReadFeatures, i12);
        }
        if (interfaceC6299c != null) {
            jsonParser.mo10854B0(interfaceC6299c);
        }
        return jsonParser;
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature) {
        int mask = this._deserFeatures | deserializationFeature.getMask();
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withFeatures(JsonParser.Feature... featureArr) {
        int i11 = this._parserFeatures;
        int i12 = i11;
        int i13 = this._parserFeaturesToChange;
        for (JsonParser.Feature feature : featureArr) {
            int mask = feature.getMask();
            i12 |= mask;
            i13 |= mask;
        }
        return (this._parserFeatures == i12 && this._parserFeaturesToChange == i13) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i12, i13, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withoutFeatures(JsonParser.Feature... featureArr) {
        int i11 = this._parserFeatures;
        int i12 = i11;
        int i13 = this._parserFeaturesToChange;
        for (JsonParser.Feature feature : featureArr) {
            int mask = feature.getMask();
            i12 &= ~mask;
            i13 |= mask;
        }
        return (this._parserFeatures == i12 && this._parserFeaturesToChange == i13) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i12, i13, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int mask = deserializationFeature.getMask() | this._deserFeatures;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            mask |= deserializationFeature2.getMask();
        }
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig without(JsonParser.Feature feature) {
        int i11 = this._parserFeatures & (~feature.getMask());
        int mask = this._parserFeaturesToChange | feature.getMask();
        return (this._parserFeatures == i11 && this._parserFeaturesToChange == mask) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i11, mask, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withFeatures(InterfaceC6298b... interfaceC6298bArr) {
        if (interfaceC6298bArr.length > 0 && (interfaceC6298bArr[0] instanceof JsonReadFeature)) {
            return m11131a(interfaceC6298bArr);
        }
        int i11 = this._formatReadFeatures;
        int i12 = i11;
        int i13 = this._formatReadFeaturesToChange;
        for (InterfaceC6298b interfaceC6298b : interfaceC6298bArr) {
            int mask = interfaceC6298b.getMask();
            i12 |= mask;
            i13 |= mask;
        }
        return (this._formatReadFeatures == i12 && this._formatReadFeaturesToChange == i13) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i12, i13);
    }

    public DeserializationConfig without(InterfaceC6298b interfaceC6298b) {
        if (interfaceC6298b instanceof JsonReadFeature) {
            return m11132b(interfaceC6298b);
        }
        int i11 = this._formatReadFeatures & (~interfaceC6298b.getMask());
        int mask = this._formatReadFeaturesToChange | interfaceC6298b.getMask();
        return (this._formatReadFeatures == i11 && this._formatReadFeaturesToChange == mask) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i11, mask);
    }

    public DeserializationConfig withoutFeatures(InterfaceC6298b... interfaceC6298bArr) {
        if (interfaceC6298bArr.length > 0 && (interfaceC6298bArr[0] instanceof JsonReadFeature)) {
            return m11132b(interfaceC6298bArr);
        }
        int i11 = this._formatReadFeatures;
        int i12 = i11;
        int i13 = this._formatReadFeaturesToChange;
        for (InterfaceC6298b interfaceC6298b : interfaceC6298bArr) {
            int mask = interfaceC6298b.getMask();
            i12 &= ~mask;
            i13 |= mask;
        }
        return (this._formatReadFeatures == i12 && this._formatReadFeaturesToChange == i13) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i12, i13);
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, AbstractC6427a abstractC6427a, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, CoercionConfigs coercionConfigs) {
        super(deserializationConfig, abstractC6427a, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._coercionConfigs = coercionConfigs;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig with(JsonParser.Feature feature) {
        int mask = this._parserFeatures | feature.getMask();
        int mask2 = this._parserFeaturesToChange | feature.getMask();
        return (this._parserFeatures == mask && this._parserFeaturesToChange == mask2) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, mask, mask2, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(InterfaceC6298b interfaceC6298b) {
        if (interfaceC6298b instanceof JsonReadFeature) {
            return m11131a(interfaceC6298b);
        }
        int mask = this._formatReadFeatures | interfaceC6298b.getMask();
        int mask2 = this._formatReadFeaturesToChange | interfaceC6298b.getMask();
        return (this._formatReadFeatures == mask && this._formatReadFeaturesToChange == mask2) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, mask, mask2);
    }

    public DeserializationConfig with(JsonNodeFactory jsonNodeFactory) {
        return this._nodeFactory == jsonNodeFactory ? this : new DeserializationConfig(this, jsonNodeFactory);
    }

    @Deprecated
    public DeserializationConfig(BaseSettings baseSettings, AbstractC6427a abstractC6427a, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        this(baseSettings, abstractC6427a, simpleMixInResolver, rootNameLookup, configOverrides, new CoercionConfigs());
    }

    public DeserializationConfig with(ConstructorDetector constructorDetector) {
        return this._ctorDetector == constructorDetector ? this : new DeserializationConfig(this, constructorDetector);
    }

    @Deprecated
    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        this(deserializationConfig, deserializationConfig._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, new CoercionConfigs());
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, long j11, int i11, int i12, int i13, int i14, int i15) {
        super(deserializationConfig, j11);
        this._deserFeatures = i11;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = i12;
        this._parserFeaturesToChange = i13;
        this._formatReadFeatures = i14;
        this._formatReadFeaturesToChange = i15;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, AbstractC6427a abstractC6427a) {
        super(deserializationConfig, abstractC6427a);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, BaseSettings baseSettings) {
        super(deserializationConfig, baseSettings);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, JsonNodeFactory jsonNodeFactory) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = jsonNodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, ConstructorDetector constructorDetector) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = constructorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, C6492i<AbstractC6361f> c6492i) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = c6492i;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, PropertyName propertyName) {
        super(deserializationConfig, propertyName);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, Class<?> cls) {
        super(deserializationConfig, cls);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, ContextAttributes contextAttributes) {
        super(deserializationConfig, contextAttributes);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(deserializationConfig, simpleMixInResolver);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }
}
