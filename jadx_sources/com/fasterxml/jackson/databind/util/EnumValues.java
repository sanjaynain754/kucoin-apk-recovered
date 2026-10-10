package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public final class EnumValues implements Serializable {
    private static final long serialVersionUID = 1;
    private final Class<Enum<?>> _enumClass;
    private final InterfaceC6306i[] _textual;
    private final Enum<?>[] _values;

    /* JADX INFO: renamed from: b */
    public transient EnumMap<?, InterfaceC6306i> f10703b;

    public static EnumValues construct(SerializationConfig serializationConfig, Class<Enum<?>> cls) {
        return serializationConfig.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING) ? constructFromToString(serializationConfig, cls) : constructFromName(serializationConfig, cls);
    }

    public List<Enum<?>> enums() {
        return Arrays.asList(this._values);
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public EnumMap<?, InterfaceC6306i> internalMap() {
        EnumMap<?, InterfaceC6306i> enumMap = this.f10703b;
        if (enumMap != null) {
            return enumMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Enum<?> r11 : this._values) {
            linkedHashMap.put(r11, this._textual[r11.ordinal()]);
        }
        return new EnumMap<>(linkedHashMap);
    }

    public InterfaceC6306i serializedValueFor(Enum<?> r11) {
        return this._textual[r11.ordinal()];
    }

    public Collection<InterfaceC6306i> values() {
        return Arrays.asList(this._textual);
    }

    public EnumValues(Class<Enum<?>> cls, InterfaceC6306i[] interfaceC6306iArr) {
        this._enumClass = cls;
        this._values = cls.getEnumConstants();
        this._textual = interfaceC6306iArr;
    }

    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> clsM11956r = C6490g.m11956r(cls);
        Enum<?>[] enumArr = (Enum[]) clsM11956r.getEnumConstants();
        if (enumArr != null) {
            String[] strArrFindEnumValues = mapperConfig.getAnnotationIntrospector().findEnumValues(clsM11956r, enumArr, new String[enumArr.length]);
            InterfaceC6306i[] interfaceC6306iArr = new InterfaceC6306i[enumArr.length];
            int length = enumArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                Enum<?> r11 = enumArr[i11];
                String strName = strArrFindEnumValues[i11];
                if (strName == null) {
                    strName = r11.name();
                }
                interfaceC6306iArr[r11.ordinal()] = mapperConfig.compileString(strName);
            }
            return construct(cls, interfaceC6306iArr);
        }
        throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
    }

    public static EnumValues constructFromToString(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Enum[] enumArr = (Enum[]) C6490g.m11956r(cls).getEnumConstants();
        if (enumArr != null) {
            ArrayList arrayList = new ArrayList(enumArr.length);
            for (Enum r11 : enumArr) {
                arrayList.add(r11.toString());
            }
            return construct(mapperConfig, cls, arrayList);
        }
        throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
    }

    public static EnumValues construct(MapperConfig<?> mapperConfig, Class<Enum<?>> cls, List<String> list) {
        int size = list.size();
        InterfaceC6306i[] interfaceC6306iArr = new InterfaceC6306i[size];
        for (int i11 = 0; i11 < size; i11++) {
            interfaceC6306iArr[i11] = mapperConfig.compileString(list.get(i11));
        }
        return construct(cls, interfaceC6306iArr);
    }

    public static EnumValues construct(Class<Enum<?>> cls, InterfaceC6306i[] interfaceC6306iArr) {
        return new EnumValues(cls, interfaceC6306iArr);
    }
}
