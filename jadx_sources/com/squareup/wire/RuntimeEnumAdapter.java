package com.squareup.wire;

import com.squareup.wire.WireEnum;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes59.dex */
public final class RuntimeEnumAdapter<E extends WireEnum> extends EnumAdapter<E> {
    private Method fromValueMethod;
    private final Class<E> type;

    private Method getFromValueMethod() {
        Method method = this.fromValueMethod;
        if (method != null) {
            return method;
        }
        try {
            Method method2 = this.type.getMethod("fromValue", Integer.TYPE);
            this.fromValueMethod = method2;
            return method2;
        } catch (NoSuchMethodException e11) {
            throw new AssertionError(e11);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof RuntimeEnumAdapter) && ((RuntimeEnumAdapter) obj).type == this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public RuntimeEnumAdapter(Class<E> cls) {
        super(cls);
        this.type = cls;
    }

    @Override // com.squareup.wire.EnumAdapter
    public E fromValue(int i11) {
        try {
            return (E) getFromValueMethod().invoke(null, Integer.valueOf(i11));
        } catch (IllegalAccessException | InvocationTargetException e11) {
            throw new AssertionError(e11);
        }
    }
}
