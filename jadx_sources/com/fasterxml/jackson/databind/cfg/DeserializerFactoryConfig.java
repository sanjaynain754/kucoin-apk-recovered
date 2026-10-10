package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.AbstractC6339a;
import com.fasterxml.jackson.databind.deser.AbstractC6357b;
import com.fasterxml.jackson.databind.deser.InterfaceC6363h;
import com.fasterxml.jackson.databind.deser.InterfaceC6364i;
import com.fasterxml.jackson.databind.deser.InterfaceC6378m;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.util.C6485b;
import com.fasterxml.jackson.databind.util.C6486c;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class DeserializerFactoryConfig implements Serializable {
    private static final long serialVersionUID = 1;
    protected final AbstractC6339a[] _abstractTypeResolvers;
    protected final InterfaceC6363h[] _additionalDeserializers;
    protected final InterfaceC6364i[] _additionalKeyDeserializers;
    protected final AbstractC6357b[] _modifiers;
    protected final InterfaceC6378m[] _valueInstantiators;
    protected static final InterfaceC6363h[] NO_DESERIALIZERS = new InterfaceC6363h[0];
    protected static final AbstractC6357b[] NO_MODIFIERS = new AbstractC6357b[0];
    protected static final AbstractC6339a[] NO_ABSTRACT_TYPE_RESOLVERS = new AbstractC6339a[0];
    protected static final InterfaceC6378m[] NO_VALUE_INSTANTIATORS = new InterfaceC6378m[0];
    protected static final InterfaceC6364i[] DEFAULT_KEY_DESERIALIZERS = {new StdKeyDeserializers()};

    public DeserializerFactoryConfig() {
        this(null, null, null, null, null);
    }

    public DeserializerFactoryConfig(InterfaceC6363h[] interfaceC6363hArr, InterfaceC6364i[] interfaceC6364iArr, AbstractC6357b[] abstractC6357bArr, AbstractC6339a[] abstractC6339aArr, InterfaceC6378m[] interfaceC6378mArr) {
        this._additionalDeserializers = interfaceC6363hArr == null ? NO_DESERIALIZERS : interfaceC6363hArr;
        this._additionalKeyDeserializers = interfaceC6364iArr == null ? DEFAULT_KEY_DESERIALIZERS : interfaceC6364iArr;
        this._modifiers = abstractC6357bArr == null ? NO_MODIFIERS : abstractC6357bArr;
        this._abstractTypeResolvers = abstractC6339aArr == null ? NO_ABSTRACT_TYPE_RESOLVERS : abstractC6339aArr;
        this._valueInstantiators = interfaceC6378mArr == null ? NO_VALUE_INSTANTIATORS : interfaceC6378mArr;
    }

    public Iterable<AbstractC6339a> abstractTypeResolvers() {
        return new C6486c(this._abstractTypeResolvers);
    }

    public Iterable<AbstractC6357b> deserializerModifiers() {
        return new C6486c(this._modifiers);
    }

    public Iterable<InterfaceC6363h> deserializers() {
        return new C6486c(this._additionalDeserializers);
    }

    public boolean hasAbstractTypeResolvers() {
        return this._abstractTypeResolvers.length > 0;
    }

    public boolean hasDeserializerModifiers() {
        return this._modifiers.length > 0;
    }

    public boolean hasDeserializers() {
        return this._additionalDeserializers.length > 0;
    }

    public boolean hasKeyDeserializers() {
        return this._additionalKeyDeserializers.length > 0;
    }

    public boolean hasValueInstantiators() {
        return this._valueInstantiators.length > 0;
    }

    public Iterable<InterfaceC6364i> keyDeserializers() {
        return new C6486c(this._additionalKeyDeserializers);
    }

    public Iterable<InterfaceC6378m> valueInstantiators() {
        return new C6486c(this._valueInstantiators);
    }

    public DeserializerFactoryConfig withAbstractTypeResolver(AbstractC6339a abstractC6339a) {
        if (abstractC6339a == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, (AbstractC6339a[]) C6485b.m11878j(this._abstractTypeResolvers, abstractC6339a), this._valueInstantiators);
    }

    public DeserializerFactoryConfig withAdditionalDeserializers(InterfaceC6363h interfaceC6363h) {
        if (interfaceC6363h != null) {
            return new DeserializerFactoryConfig((InterfaceC6363h[]) C6485b.m11878j(this._additionalDeserializers, interfaceC6363h), this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
        }
        throw new IllegalArgumentException("Cannot pass null Deserializers");
    }

    public DeserializerFactoryConfig withAdditionalKeyDeserializers(InterfaceC6364i interfaceC6364i) {
        if (interfaceC6364i == null) {
            throw new IllegalArgumentException("Cannot pass null KeyDeserializers");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, (InterfaceC6364i[]) C6485b.m11878j(this._additionalKeyDeserializers, interfaceC6364i), this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
    }

    public DeserializerFactoryConfig withDeserializerModifier(AbstractC6357b abstractC6357b) {
        if (abstractC6357b == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, (AbstractC6357b[]) C6485b.m11878j(this._modifiers, abstractC6357b), this._abstractTypeResolvers, this._valueInstantiators);
    }

    public DeserializerFactoryConfig withValueInstantiators(InterfaceC6378m interfaceC6378m) {
        if (interfaceC6378m == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, (InterfaceC6378m[]) C6485b.m11878j(this._valueInstantiators, interfaceC6378m));
    }
}
