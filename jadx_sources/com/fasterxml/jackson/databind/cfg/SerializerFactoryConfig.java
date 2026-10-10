package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.ser.AbstractC6454c;
import com.fasterxml.jackson.databind.ser.InterfaceC6469k;
import com.fasterxml.jackson.databind.util.C6485b;
import com.fasterxml.jackson.databind.util.C6486c;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public final class SerializerFactoryConfig implements Serializable {
    private static final long serialVersionUID = 1;
    protected final InterfaceC6469k[] _additionalKeySerializers;
    protected final InterfaceC6469k[] _additionalSerializers;
    protected final AbstractC6454c[] _modifiers;
    protected static final InterfaceC6469k[] NO_SERIALIZERS = new InterfaceC6469k[0];
    protected static final AbstractC6454c[] NO_MODIFIERS = new AbstractC6454c[0];

    public SerializerFactoryConfig() {
        this(null, null, null);
    }

    public SerializerFactoryConfig(InterfaceC6469k[] interfaceC6469kArr, InterfaceC6469k[] interfaceC6469kArr2, AbstractC6454c[] abstractC6454cArr) {
        this._additionalSerializers = interfaceC6469kArr == null ? NO_SERIALIZERS : interfaceC6469kArr;
        this._additionalKeySerializers = interfaceC6469kArr2 == null ? NO_SERIALIZERS : interfaceC6469kArr2;
        this._modifiers = abstractC6454cArr == null ? NO_MODIFIERS : abstractC6454cArr;
    }

    public boolean hasKeySerializers() {
        return this._additionalKeySerializers.length > 0;
    }

    public boolean hasSerializerModifiers() {
        return this._modifiers.length > 0;
    }

    public boolean hasSerializers() {
        return this._additionalSerializers.length > 0;
    }

    public Iterable<InterfaceC6469k> keySerializers() {
        return new C6486c(this._additionalKeySerializers);
    }

    public Iterable<AbstractC6454c> serializerModifiers() {
        return new C6486c(this._modifiers);
    }

    public Iterable<InterfaceC6469k> serializers() {
        return new C6486c(this._additionalSerializers);
    }

    public SerializerFactoryConfig withAdditionalKeySerializers(InterfaceC6469k interfaceC6469k) {
        if (interfaceC6469k == null) {
            throw new IllegalArgumentException("Cannot pass null Serializers");
        }
        return new SerializerFactoryConfig(this._additionalSerializers, (InterfaceC6469k[]) C6485b.m11878j(this._additionalKeySerializers, interfaceC6469k), this._modifiers);
    }

    public SerializerFactoryConfig withAdditionalSerializers(InterfaceC6469k interfaceC6469k) {
        if (interfaceC6469k != null) {
            return new SerializerFactoryConfig((InterfaceC6469k[]) C6485b.m11878j(this._additionalSerializers, interfaceC6469k), this._additionalKeySerializers, this._modifiers);
        }
        throw new IllegalArgumentException("Cannot pass null Serializers");
    }

    public SerializerFactoryConfig withSerializerModifier(AbstractC6454c abstractC6454c) {
        if (abstractC6454c == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        return new SerializerFactoryConfig(this._additionalSerializers, this._additionalKeySerializers, (AbstractC6454c[]) C6485b.m11878j(this._modifiers, abstractC6454c));
    }
}
