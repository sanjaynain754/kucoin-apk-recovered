package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.InterfaceC6298b;
import com.fasterxml.jackson.core.InterfaceC6305h;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.InterfaceC6325d;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.AbstractC6427a;
import com.fasterxml.jackson.databind.ser.AbstractC6456e;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;

/* JADX INFO: loaded from: classes45.dex */
public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig> implements Serializable {
    protected static final InterfaceC6305h DEFAULT_PRETTY_PRINTER = new DefaultPrettyPrinter();

    /* JADX INFO: renamed from: d */
    public static final int f10199d = MapperConfig.collectFeatureDefaults(SerializationFeature.class);
    private static final long serialVersionUID = 1;
    protected final InterfaceC6305h _defaultPrettyPrinter;
    protected final AbstractC6456e _filterProvider;
    protected final int _formatWriteFeatures;
    protected final int _formatWriteFeaturesToChange;
    protected final int _generatorFeatures;
    protected final int _generatorFeaturesToChange;
    protected final int _serFeatures;

    public SerializationConfig(BaseSettings baseSettings, AbstractC6427a abstractC6427a, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, abstractC6427a, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = f10199d;
        this._defaultPrettyPrinter = DEFAULT_PRETTY_PRINTER;
        this._generatorFeatures = 0;
        this._generatorFeaturesToChange = 0;
        this._formatWriteFeatures = 0;
        this._formatWriteFeaturesToChange = 0;
    }

    public AbstractC6456e getFilterProvider() {
        return null;
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return (serializationFeature.getMask() & this._serFeatures) != 0;
    }

    public SerializationConfig withFeatures(SerializationFeature... serializationFeatureArr) {
        int mask = this._serFeatures;
        for (SerializationFeature serializationFeature : serializationFeatureArr) {
            mask |= serializationFeature.getMask();
        }
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public /* bridge */ /* synthetic */ MapperConfigBase withView(Class cls) {
        return withView((Class<?>) cls);
    }

    public SerializationConfig without(SerializationFeature serializationFeature) {
        int i11 = this._serFeatures & (~serializationFeature.getMask());
        return i11 == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i11, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withoutFeatures(SerializationFeature... serializationFeatureArr) {
        int i11 = this._serFeatures;
        for (SerializationFeature serializationFeature : serializationFeatureArr) {
            i11 &= ~serializationFeature.getMask();
        }
        return i11 == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i11, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final SerializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new SerializationConfig(this, baseSettings);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final SerializationConfig _withMapperFeatures(long j11) {
        return new SerializationConfig(this, j11, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    /* JADX INFO: renamed from: a */
    public final SerializationConfig m11146a(InterfaceC6298b... interfaceC6298bArr) {
        JsonGenerator.Feature featureMappedFeature;
        int i11 = this._generatorFeatures;
        int i12 = this._generatorFeaturesToChange;
        int i13 = this._formatWriteFeatures;
        int i14 = this._formatWriteFeaturesToChange;
        int i15 = i11;
        int i16 = i13;
        for (InterfaceC6298b interfaceC6298b : interfaceC6298bArr) {
            int mask = interfaceC6298b.getMask();
            i16 |= mask;
            i14 |= mask;
            if ((interfaceC6298b instanceof JsonWriteFeature) && (featureMappedFeature = ((JsonWriteFeature) interfaceC6298b).mappedFeature()) != null) {
                int mask2 = featureMappedFeature.getMask();
                i15 |= mask2;
                i12 |= mask2;
            }
        }
        return (this._formatWriteFeatures == i16 && this._formatWriteFeaturesToChange == i14 && this._generatorFeatures == i15 && this._generatorFeaturesToChange == i12) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i15, i12, i16, i14);
    }

    /* JADX INFO: renamed from: b */
    public final SerializationConfig m11147b(InterfaceC6298b... interfaceC6298bArr) {
        JsonGenerator.Feature featureMappedFeature;
        int i11 = this._generatorFeatures;
        int i12 = this._generatorFeaturesToChange;
        int i13 = this._formatWriteFeatures;
        int i14 = this._formatWriteFeaturesToChange;
        int i15 = i11;
        int i16 = i13;
        for (InterfaceC6298b interfaceC6298b : interfaceC6298bArr) {
            int mask = interfaceC6298b.getMask();
            i16 &= ~mask;
            i14 |= mask;
            if ((interfaceC6298b instanceof JsonWriteFeature) && (featureMappedFeature = ((JsonWriteFeature) interfaceC6298b).mappedFeature()) != null) {
                int mask2 = featureMappedFeature.getMask();
                i15 &= ~mask2;
                i12 |= mask2;
            }
        }
        return (this._formatWriteFeatures == i16 && this._formatWriteFeaturesToChange == i14 && this._generatorFeatures == i15 && this._generatorFeaturesToChange == i12) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i15, i12, i16, i14);
    }

    public InterfaceC6305h constructDefaultPrettyPrinter() {
        InterfaceC6305h interfaceC6305h = this._defaultPrettyPrinter;
        return interfaceC6305h instanceof InterfaceC6325d ? (InterfaceC6305h) ((InterfaceC6325d) interfaceC6305h).createInstance() : interfaceC6305h;
    }

    public InterfaceC6305h getDefaultPrettyPrinter() {
        return this._defaultPrettyPrinter;
    }

    public final int getSerializationFeatures() {
        return this._serFeatures;
    }

    public final boolean hasSerializationFeatures(int i11) {
        return (this._serFeatures & i11) == i11;
    }

    public void initialize(JsonGenerator jsonGenerator) {
        InterfaceC6305h interfaceC6305hConstructDefaultPrettyPrinter;
        if (SerializationFeature.INDENT_OUTPUT.enabledIn(this._serFeatures) && jsonGenerator.m10835p() == null && (interfaceC6305hConstructDefaultPrettyPrinter = constructDefaultPrettyPrinter()) != null) {
            jsonGenerator.m10789E(interfaceC6305hConstructDefaultPrettyPrinter);
        }
        boolean zEnabledIn = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._serFeatures);
        int i11 = this._generatorFeaturesToChange;
        if (i11 != 0 || zEnabledIn) {
            int i12 = this._generatorFeatures;
            if (zEnabledIn) {
                int mask = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i12 |= mask;
                i11 |= mask;
            }
            jsonGenerator.mo10844v(i12, i11);
        }
        int i13 = this._formatWriteFeaturesToChange;
        if (i13 != 0) {
            jsonGenerator.m10842u(this._formatWriteFeatures, i13);
        }
    }

    public final boolean isEnabled(JsonGenerator.Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this._generatorFeaturesToChange) != 0) {
            return (feature.getMask() & this._generatorFeatures) != 0;
        }
        return jsonFactory.isEnabled(feature);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public boolean useRootWrapping() {
        PropertyName propertyName = this._rootName;
        return propertyName != null ? !propertyName.isEmpty() : isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
    }

    public SerializationConfig withDefaultPrettyPrinter(InterfaceC6305h interfaceC6305h) {
        return this._defaultPrettyPrinter == interfaceC6305h ? this : new SerializationConfig(this, interfaceC6305h);
    }

    @Deprecated
    public SerializationConfig withPropertyInclusion(JsonInclude.Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig withRootName(PropertyName propertyName) {
        return (propertyName != null ? !propertyName.equals(this._rootName) : this._rootName != null) ? new SerializationConfig(this, propertyName) : this;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new SerializationConfig(this, cls);
    }

    @Deprecated
    public JsonInclude.Include getSerializationInclusion() {
        JsonInclude.Include valueInclusion = getDefaultPropertyInclusion().getValueInclusion();
        if (valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
            return JsonInclude.Include.ALWAYS;
        }
        return valueInclusion;
    }

    public AbstractC6340b introspect(JavaType javaType) {
        return getClassIntrospector().forSerialization(this, javaType, this);
    }

    public SerializationConfig without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int i11 = (~serializationFeature.getMask()) & this._serFeatures;
        for (SerializationFeature serializationFeature2 : serializationFeatureArr) {
            i11 &= ~serializationFeature2.getMask();
        }
        return i11 == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i11, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig with(AbstractC6427a abstractC6427a) {
        return abstractC6427a == this._subtypeResolver ? this : new SerializationConfig(this, abstractC6427a);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new SerializationConfig(this, contextAttributes);
    }

    public SerializationConfig withFeatures(JsonGenerator.Feature... featureArr) {
        int i11 = this._generatorFeatures;
        int i12 = i11;
        int i13 = this._generatorFeaturesToChange;
        for (JsonGenerator.Feature feature : featureArr) {
            int mask = feature.getMask();
            i12 |= mask;
            i13 |= mask;
        }
        return (this._generatorFeatures == i12 && this._generatorFeaturesToChange == i13) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i12, i13, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withoutFeatures(JsonGenerator.Feature... featureArr) {
        int i11 = this._generatorFeatures;
        int i12 = i11;
        int i13 = this._generatorFeaturesToChange;
        for (JsonGenerator.Feature feature : featureArr) {
            int mask = feature.getMask();
            i12 &= ~mask;
            i13 |= mask;
        }
        return (this._generatorFeatures == i12 && this._generatorFeaturesToChange == i13) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i12, i13, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig with(DateFormat dateFormat) {
        SerializationConfig serializationConfig = (SerializationConfig) super.with(dateFormat);
        if (dateFormat == null) {
            return serializationConfig.with(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        return serializationConfig.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public SerializationConfig without(JsonGenerator.Feature feature) {
        int i11 = this._generatorFeatures & (~feature.getMask());
        int mask = this._generatorFeaturesToChange | feature.getMask();
        return (this._generatorFeatures == i11 && this._generatorFeaturesToChange == mask) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i11, mask, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig(SerializationConfig serializationConfig, AbstractC6427a abstractC6427a, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(serializationConfig, abstractC6427a, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(SerializationFeature serializationFeature) {
        int mask = this._serFeatures | serializationFeature.getMask();
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withFeatures(InterfaceC6298b... interfaceC6298bArr) {
        if (interfaceC6298bArr.length > 0 && (interfaceC6298bArr[0] instanceof JsonWriteFeature)) {
            return m11146a(interfaceC6298bArr);
        }
        int i11 = this._formatWriteFeatures;
        int i12 = i11;
        int i13 = this._formatWriteFeaturesToChange;
        for (InterfaceC6298b interfaceC6298b : interfaceC6298bArr) {
            int mask = interfaceC6298b.getMask();
            i12 |= mask;
            i13 |= mask;
        }
        return (this._formatWriteFeatures == i12 && this._formatWriteFeaturesToChange == i13) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i12, i13);
    }

    public SerializationConfig without(InterfaceC6298b interfaceC6298b) {
        if (interfaceC6298b instanceof JsonWriteFeature) {
            return m11147b(interfaceC6298b);
        }
        int i11 = this._formatWriteFeatures & (~interfaceC6298b.getMask());
        int mask = this._formatWriteFeaturesToChange | interfaceC6298b.getMask();
        return (this._formatWriteFeatures == i11 && this._formatWriteFeaturesToChange == mask) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i11, mask);
    }

    public SerializationConfig withoutFeatures(InterfaceC6298b... interfaceC6298bArr) {
        if (interfaceC6298bArr.length > 0 && (interfaceC6298bArr[0] instanceof JsonWriteFeature)) {
            return m11147b(interfaceC6298bArr);
        }
        int i11 = this._formatWriteFeatures;
        int i12 = i11;
        int i13 = this._formatWriteFeaturesToChange;
        for (InterfaceC6298b interfaceC6298b : interfaceC6298bArr) {
            int mask = interfaceC6298b.getMask();
            i12 &= ~mask;
            i13 |= mask;
        }
        return (this._formatWriteFeatures == i12 && this._formatWriteFeaturesToChange == i13) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i12, i13);
    }

    public SerializationConfig with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int mask = serializationFeature.getMask() | this._serFeatures;
        for (SerializationFeature serializationFeature2 : serializationFeatureArr) {
            mask |= serializationFeature2.getMask();
        }
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Deprecated
    public SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        this(serializationConfig, serializationConfig._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
    }

    public SerializationConfig with(JsonGenerator.Feature feature) {
        int mask = this._generatorFeatures | feature.getMask();
        int mask2 = this._generatorFeaturesToChange | feature.getMask();
        return (this._generatorFeatures == mask && this._generatorFeaturesToChange == mask2) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, mask, mask2, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig(SerializationConfig serializationConfig, AbstractC6427a abstractC6427a) {
        super(serializationConfig, abstractC6427a);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(InterfaceC6298b interfaceC6298b) {
        if (interfaceC6298b instanceof JsonWriteFeature) {
            return m11146a(interfaceC6298b);
        }
        int mask = this._formatWriteFeatures | interfaceC6298b.getMask();
        int mask2 = this._formatWriteFeaturesToChange | interfaceC6298b.getMask();
        return (this._formatWriteFeatures == mask && this._formatWriteFeaturesToChange == mask2) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, mask, mask2);
    }

    public SerializationConfig(SerializationConfig serializationConfig, long j11, int i11, int i12, int i13, int i14, int i15) {
        super(serializationConfig, j11);
        this._serFeatures = i11;
        serializationConfig.getClass();
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = i12;
        this._generatorFeaturesToChange = i13;
        this._formatWriteFeatures = i14;
        this._formatWriteFeaturesToChange = i15;
    }

    public SerializationConfig withFilters(AbstractC6456e abstractC6456e) {
        return this;
    }

    public SerializationConfig(SerializationConfig serializationConfig, BaseSettings baseSettings) {
        super(serializationConfig, baseSettings);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, Class<?> cls) {
        super(serializationConfig, cls);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, PropertyName propertyName) {
        super(serializationConfig, propertyName);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, ContextAttributes contextAttributes) {
        super(serializationConfig, contextAttributes);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(serializationConfig, simpleMixInResolver);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, InterfaceC6305h interfaceC6305h) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = interfaceC6305h;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }
}
