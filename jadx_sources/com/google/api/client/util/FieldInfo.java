package com.google.api.client.util;

import com.google.common.base.Ascii;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes56.dex */
public class FieldInfo {
    private static final Map<Field, FieldInfo> CACHE = new WeakHashMap();
    private final Field field;
    private final boolean isPrimitive;
    private final String name;
    private final Method[] setters;

    /* JADX INFO: renamed from: of */
    public static FieldInfo m13333of(Enum<?> r11) {
        try {
            FieldInfo fieldInfoM13334of = m13334of(r11.getClass().getField(r11.name()));
            Preconditions.checkArgument(fieldInfoM13334of != null, "enum constant missing @Value or @NullValue annotation: %s", r11);
            return fieldInfoM13334of;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    private Method[] settersMethodForField(Field field) {
        ArrayList arrayList = new ArrayList();
        for (Method method : field.getDeclaringClass().getDeclaredMethods()) {
            if (Ascii.toLowerCase(method.getName()).equals("set" + Ascii.toLowerCase(field.getName())) && method.getParameterTypes().length == 1) {
                arrayList.add(method);
            }
        }
        return (Method[]) arrayList.toArray(new Method[0]);
    }

    public <T extends Enum<T>> T enumValue() {
        return (T) Enum.valueOf(this.field.getDeclaringClass(), this.field.getName());
    }

    public ClassInfo getClassInfo() {
        return ClassInfo.m13331of(this.field.getDeclaringClass());
    }

    public Field getField() {
        return this.field;
    }

    public Type getGenericType() {
        return this.field.getGenericType();
    }

    public String getName() {
        return this.name;
    }

    public Class<?> getType() {
        return this.field.getType();
    }

    public Object getValue(Object obj) {
        return getFieldValue(this.field, obj);
    }

    public boolean isFinal() {
        return Modifier.isFinal(this.field.getModifiers());
    }

    public boolean isPrimitive() {
        return this.isPrimitive;
    }

    public void setValue(Object obj, Object obj2) {
        Method[] methodArr = this.setters;
        if (methodArr.length > 0) {
            for (Method method : methodArr) {
                if (obj2 == null || method.getParameterTypes()[0].isAssignableFrom(obj2.getClass())) {
                    try {
                        method.invoke(obj, obj2);
                        return;
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                        continue;
                    }
                }
            }
        }
        setFieldValue(this.field, obj, obj2);
    }

    public FieldInfo(Field field, String str) {
        String strIntern;
        this.field = field;
        if (str == null) {
            strIntern = null;
        } else {
            strIntern = str.intern();
        }
        this.name = strIntern;
        this.isPrimitive = Data.isPrimitive(getType());
        this.setters = settersMethodForField(field);
    }

    public static Object getFieldValue(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static void setFieldValue(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object fieldValue = getFieldValue(field, obj);
            if (obj2 == null) {
                if (fieldValue == null) {
                    return;
                }
            } else if (obj2.equals(fieldValue)) {
                return;
            }
            throw new IllegalArgumentException("expected final value <" + fieldValue + "> but was <" + obj2 + "> on " + field.getName() + " field in " + obj.getClass().getName());
        }
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException e11) {
            throw new IllegalArgumentException(e11);
        } catch (SecurityException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    /* JADX INFO: renamed from: of */
    public static FieldInfo m13334of(Field field) {
        String strValue = null;
        if (field == null) {
            return null;
        }
        Map<Field, FieldInfo> map = CACHE;
        synchronized (map) {
            try {
                FieldInfo fieldInfo = map.get(field);
                boolean zIsEnumConstant = field.isEnumConstant();
                if (fieldInfo == null && (zIsEnumConstant || !Modifier.isStatic(field.getModifiers()))) {
                    if (zIsEnumConstant) {
                        Value value = (Value) field.getAnnotation(Value.class);
                        if (value != null) {
                            strValue = value.value();
                        } else if (((NullValue) field.getAnnotation(NullValue.class)) == null) {
                            return null;
                        }
                    } else {
                        Key key = (Key) field.getAnnotation(Key.class);
                        if (key == null) {
                            return null;
                        }
                        strValue = key.value();
                        field.setAccessible(true);
                    }
                    if ("##default".equals(strValue)) {
                        strValue = field.getName();
                    }
                    fieldInfo = new FieldInfo(field, strValue);
                    map.put(field, fieldInfo);
                }
                return fieldInfo;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
