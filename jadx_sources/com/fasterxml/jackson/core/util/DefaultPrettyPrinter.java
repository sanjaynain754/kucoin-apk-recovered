package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.InterfaceC6305h;
import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p062io.SerializedString;
import com.tencent.bugly.proguard.C33627eb;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class DefaultPrettyPrinter implements InterfaceC6305h, InterfaceC6325d<DefaultPrettyPrinter>, Serializable {
    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(C33627eb.f69716f);
    private static final long serialVersionUID = 1;
    protected InterfaceC6321a _arrayIndenter;
    protected transient int _nesting;
    protected String _objectFieldValueSeparatorWithSpaces;
    protected InterfaceC6321a _objectIndenter;
    protected final InterfaceC6306i _rootSeparator;
    protected Separators _separators;
    protected boolean _spacesInObjectEntries;

    public static class FixedSpaceIndenter extends NopIndenter {
        public static final FixedSpaceIndenter instance = new FixedSpaceIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.InterfaceC6321a
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.InterfaceC6321a
        public void writeIndentation(JsonGenerator jsonGenerator, int i11) throws IOException {
            jsonGenerator.mo10834o0(' ');
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.core.util.DefaultPrettyPrinter$a */
    public interface InterfaceC6321a {
        boolean isInline();

        void writeIndentation(JsonGenerator jsonGenerator, int i11) throws IOException;
    }

    public DefaultPrettyPrinter() {
        this(DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    public DefaultPrettyPrinter withRootSeparator(InterfaceC6306i interfaceC6306i) {
        InterfaceC6306i interfaceC6306i2 = this._rootSeparator;
        return (interfaceC6306i2 == interfaceC6306i || (interfaceC6306i != null && interfaceC6306i.equals(interfaceC6306i2))) ? this : new DefaultPrettyPrinter(this, interfaceC6306i);
    }

    public DefaultPrettyPrinter withSpacesInObjectEntries() {
        return _withSpaces(true);
    }

    public DefaultPrettyPrinter withoutSpacesInObjectEntries() {
        return _withSpaces(false);
    }

    public DefaultPrettyPrinter(String str) {
        this(str == null ? null : new SerializedString(str));
    }

    public DefaultPrettyPrinter _withSpaces(boolean z11) {
        if (this._spacesInObjectEntries == z11) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._spacesInObjectEntries = z11;
        return defaultPrettyPrinter;
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fasterxml.jackson.core.util.InterfaceC6325d
    public DefaultPrettyPrinter createInstance() {
        if (getClass() == DefaultPrettyPrinter.class) {
            return new DefaultPrettyPrinter(this);
        }
        throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
    }

    public void indentArraysWith(InterfaceC6321a interfaceC6321a) {
        if (interfaceC6321a == null) {
            interfaceC6321a = NopIndenter.instance;
        }
        this._arrayIndenter = interfaceC6321a;
    }

    public void indentObjectsWith(InterfaceC6321a interfaceC6321a) {
        if (interfaceC6321a == null) {
            interfaceC6321a = NopIndenter.instance;
        }
        this._objectIndenter = interfaceC6321a;
    }

    public DefaultPrettyPrinter withArrayIndenter(InterfaceC6321a interfaceC6321a) {
        if (interfaceC6321a == null) {
            interfaceC6321a = NopIndenter.instance;
        }
        if (this._arrayIndenter == interfaceC6321a) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._arrayIndenter = interfaceC6321a;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withObjectIndenter(InterfaceC6321a interfaceC6321a) {
        if (interfaceC6321a == null) {
            interfaceC6321a = NopIndenter.instance;
        }
        if (this._objectIndenter == interfaceC6321a) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._objectIndenter = interfaceC6321a;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withSeparators(Separators separators) {
        this._separators = separators;
        this._objectFieldValueSeparatorWithSpaces = C33627eb.f69716f + separators.getObjectFieldValueSeparator() + C33627eb.f69716f;
        return this;
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo10834o0(this._separators.getArrayValueSeparator());
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeEndArray(JsonGenerator jsonGenerator, int i11) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting--;
        }
        if (i11 > 0) {
            this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.mo10834o0(' ');
        }
        jsonGenerator.mo10834o0(']');
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeEndObject(JsonGenerator jsonGenerator, int i11) throws IOException {
        if (!this._objectIndenter.isInline()) {
            this._nesting--;
        }
        if (i11 > 0) {
            this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.mo10834o0(' ');
        }
        jsonGenerator.mo10834o0('}');
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo10834o0(this._separators.getObjectEntrySeparator());
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        if (this._spacesInObjectEntries) {
            jsonGenerator.mo10838q0(this._objectFieldValueSeparatorWithSpaces);
        } else {
            jsonGenerator.mo10834o0(this._separators.getObjectFieldValueSeparator());
        }
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        InterfaceC6306i interfaceC6306i = this._rootSeparator;
        if (interfaceC6306i != null) {
            jsonGenerator.mo10836p0(interfaceC6306i);
        }
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting++;
        }
        jsonGenerator.mo10834o0('[');
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo10834o0('{');
        if (this._objectIndenter.isInline()) {
            return;
        }
        this._nesting++;
    }

    public DefaultPrettyPrinter(InterfaceC6306i interfaceC6306i) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._rootSeparator = interfaceC6306i;
        withSeparators(InterfaceC6305h.f10064H0);
    }

    public DefaultPrettyPrinter withRootSeparator(String str) {
        return withRootSeparator(str == null ? null : new SerializedString(str));
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        this(defaultPrettyPrinter, defaultPrettyPrinter._rootSeparator);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter, InterfaceC6306i interfaceC6306i) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        this._objectIndenter = defaultPrettyPrinter._objectIndenter;
        this._spacesInObjectEntries = defaultPrettyPrinter._spacesInObjectEntries;
        this._nesting = defaultPrettyPrinter._nesting;
        this._separators = defaultPrettyPrinter._separators;
        this._objectFieldValueSeparatorWithSpaces = defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces;
        this._rootSeparator = interfaceC6306i;
    }

    public static class NopIndenter implements InterfaceC6321a, Serializable {
        public static final NopIndenter instance = new NopIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.InterfaceC6321a
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.InterfaceC6321a
        public void writeIndentation(JsonGenerator jsonGenerator, int i11) throws IOException {
        }
    }
}
