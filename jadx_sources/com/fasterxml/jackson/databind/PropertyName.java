package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.core.p062io.SerializedString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class PropertyName implements Serializable {
    private static final long serialVersionUID = 1;
    protected InterfaceC6306i _encodedSimple;
    protected final String _namespace;
    protected final String _simpleName;
    public static final PropertyName USE_DEFAULT = new PropertyName("", null);
    public static final PropertyName NO_NAME = new PropertyName(new String(""), null);

    public PropertyName(String str) {
        this(str, null);
    }

    public static PropertyName construct(String str) {
        return (str == null || str.isEmpty()) ? USE_DEFAULT : new PropertyName(InternCache.instance.intern(str), null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        PropertyName propertyName = (PropertyName) obj;
        String str = this._simpleName;
        if (str == null) {
            if (propertyName._simpleName != null) {
                return false;
            }
        } else if (!str.equals(propertyName._simpleName)) {
            return false;
        }
        String str2 = this._namespace;
        if (str2 == null) {
            return propertyName._namespace == null;
        }
        return str2.equals(propertyName._namespace);
    }

    public boolean hasSimpleName() {
        return !this._simpleName.isEmpty();
    }

    public PropertyName(String str, String str2) {
        this._simpleName = C6490g.m11923Z(str);
        this._namespace = str2;
    }

    public String getNamespace() {
        return this._namespace;
    }

    public String getSimpleName() {
        return this._simpleName;
    }

    public boolean hasNamespace() {
        return this._namespace != null;
    }

    public boolean hasSimpleName(String str) {
        return this._simpleName.equals(str);
    }

    public int hashCode() {
        String str = this._namespace;
        return str == null ? this._simpleName.hashCode() : str.hashCode() ^ this._simpleName.hashCode();
    }

    public PropertyName internSimpleName() {
        String strIntern;
        return (this._simpleName.isEmpty() || (strIntern = InternCache.instance.intern(this._simpleName)) == this._simpleName) ? this : new PropertyName(strIntern, this._namespace);
    }

    public boolean isEmpty() {
        return this._namespace == null && this._simpleName.isEmpty();
    }

    public Object readResolve() {
        String str;
        return (this._namespace == null && ((str = this._simpleName) == null || "".equals(str))) ? USE_DEFAULT : this;
    }

    public InterfaceC6306i simpleAsEncoded(MapperConfig<?> mapperConfig) {
        InterfaceC6306i interfaceC6306i = this._encodedSimple;
        if (interfaceC6306i != null) {
            return interfaceC6306i;
        }
        InterfaceC6306i serializedString = mapperConfig == null ? new SerializedString(this._simpleName) : mapperConfig.compileString(this._simpleName);
        this._encodedSimple = serializedString;
        return serializedString;
    }

    public String toString() {
        if (this._namespace == null) {
            return this._simpleName;
        }
        return "{" + this._namespace + "}" + this._simpleName;
    }

    public PropertyName withNamespace(String str) {
        return (str != null ? !str.equals(this._namespace) : this._namespace != null) ? new PropertyName(this._simpleName, str) : this;
    }

    public PropertyName withSimpleName(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(this._simpleName) ? this : new PropertyName(str, this._namespace);
    }

    public static PropertyName construct(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null && str.isEmpty()) {
            return USE_DEFAULT;
        }
        return new PropertyName(InternCache.instance.intern(str), str2);
    }
}
