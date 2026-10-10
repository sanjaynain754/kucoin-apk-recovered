package com.tencent.thumbplayer.tcmedia.adapter.strategy.utils;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.p153b.C35240c;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalID;
import com.tencent.thumbplayer.tcmedia.tplayer.TPOptionalIDInternal;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes62.dex */
public class TPNativeKeyMapUtil {
    private static final String REVERSE_MAP_NAME_SUFFIX = ".reverseMap";
    private static final String TAG = "TPNativeKeyMapUtil";
    private static final Map<String, Map<Number, Number>> sNameToMap = new ConcurrentHashMap();
    private static final Map<Class<?>, AtomicBoolean> sHasThisAnnotationInitMap = new ConcurrentHashMap();
    private static final SparseArray<C35240c.a> sToNativeOptionalIdMap = new SparseArray<>();
    private static final SparseArray<String> sOptionalIdKeyToNameMap = new SparseArray<>();
    private static final AtomicBoolean sHasOptionalIdMapInit = new AtomicBoolean(false);

    private static <T extends Annotation> void checkFillMapValidity(Class<T> cls, Map<Number, Number> map, Map<Number, Number> map2, Class<?> cls2, Number number, Number number2) {
        if (map.containsKey(number2)) {
            throw new IllegalStateException(cls2.getName() + " 配置了重复的成员变量，注解=" + cls.getName() + " 成员变量值=" + number2 + " 请查找一下使用这个注解@" + cls.getName() + "的哪两个成员变量值相等");
        }
        if (map2.containsKey(number)) {
            throw new IllegalStateException(cls2.getName() + " 配置了重复的注解值，注解=" + cls.getName() + " 成员变量值=" + number2 + " 请查找一下@" + cls.getName() + "(这个值)在哪里重复了");
        }
    }

    public static <T extends Annotation> Set<Map.Entry<Number, Number>> getEntrySetOfToNativeMap(Class<T> cls) {
        return new HashSet(getMapForAnnotation(cls, true).entrySet());
    }

    public static <T extends Annotation> Set<Map.Entry<Number, Number>> getEntrySetOfToTPMap(Class<T> cls) {
        return new HashSet(getMapForAnnotation(cls, false).entrySet());
    }

    public static <T extends Annotation> int toNativeIntValue(Class<T> cls, int i11) {
        Map<Number, Number> mapForAnnotation = getMapForAnnotation(cls, true);
        if (mapForAnnotation.containsKey(Integer.valueOf(i11))) {
            return mapForAnnotation.get(Integer.valueOf(i11)).intValue();
        }
        TPLogUtil.m78797e(TAG, "toNativeValue, tpValue=" + i11 + "return default value, clazz" + cls);
        return (int) ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)).nativeDefValue();
    }

    public static <T extends Annotation> long toNativeLongValue(Class<T> cls, long j11) {
        Map<Number, Number> mapForAnnotation = getMapForAnnotation(cls, true);
        if (mapForAnnotation.containsKey(Long.valueOf(j11))) {
            return mapForAnnotation.get(Long.valueOf(j11)).longValue();
        }
        TPLogUtil.m78797e(TAG, "toNativeValue, tpValue=" + j11 + "return default value, clazz" + cls);
        return ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)).nativeDefValue();
    }

    public static <T extends Annotation> int toTPIntValue(Class<T> cls, int i11) {
        Map<Number, Number> mapForAnnotation = getMapForAnnotation(cls, false);
        if (mapForAnnotation.containsKey(Integer.valueOf(i11))) {
            return mapForAnnotation.get(Integer.valueOf(i11)).intValue();
        }
        TPLogUtil.m78800i(TAG, "toTPValue, nativeValue=" + i11 + "return default value, clazz" + cls);
        return (int) ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)).tpDefValue();
    }

    public static <T extends Annotation> long toTPLongValue(Class<T> cls, long j11) {
        Map<Number, Number> mapForAnnotation = getMapForAnnotation(cls, false);
        if (mapForAnnotation.containsKey(Long.valueOf(j11))) {
            return mapForAnnotation.get(Long.valueOf(j11)).longValue();
        }
        TPLogUtil.m78800i(TAG, "toTPValue, nativeValue=" + j11 + "return default value, clazz" + cls);
        return ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)).tpDefValue();
    }

    private static <T extends Annotation> void buildBiDirectionMapForAnnotation(Class<T> cls) {
        AtomicBoolean atomicBoolean;
        TPLogUtil.m78800i(TAG, "buildBiDirectionMapForAnnotation, clazz=".concat(String.valueOf(cls)));
        Map<Class<?>, AtomicBoolean> map = sHasThisAnnotationInitMap;
        synchronized (map) {
            try {
                atomicBoolean = map.get(cls);
                if (atomicBoolean == null) {
                    atomicBoolean = new AtomicBoolean(false);
                    map.put(cls, atomicBoolean);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (atomicBoolean) {
            try {
                if (atomicBoolean.get()) {
                    TPLogUtil.m78800i(TAG, "className=" + cls.getSimpleName() + " already init");
                } else {
                    searchClassToFillMap(cls);
                    atomicBoolean.set(true);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static void buildNativeInitConfigMap() {
        TPNativeKeyMap.MapInitConfig mapInitConfig;
        try {
            Class<?> cls = Class.forName(TPOptionalID.class.getName());
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType().toString().equals("int") && (mapInitConfig = (TPNativeKeyMap.MapInitConfig) field.getAnnotation(TPNativeKeyMap.MapInitConfig.class)) != null) {
                    int i11 = field.getInt(cls);
                    sOptionalIdKeyToNameMap.put(i11, mapInitConfig.keyName());
                    if (mapInitConfig.value() == -1) {
                        sToNativeOptionalIdMap.put(i11, new C35240c.a());
                    } else {
                        field.setAccessible(true);
                        sToNativeOptionalIdMap.put(i11, new C35240c.a(mapInitConfig.type(), mapInitConfig.value()));
                    }
                }
            }
        } catch (ClassNotFoundException e11) {
            TPLogUtil.m78798e(TAG, e11);
        } catch (IllegalAccessException e12) {
            TPLogUtil.m78798e(TAG, e12);
        }
    }

    private static void buildOptionalIdMap() {
        AtomicBoolean atomicBoolean = sHasOptionalIdMapInit;
        synchronized (atomicBoolean) {
            try {
                if (sToNativeOptionalIdMap.size() == 0) {
                    if (atomicBoolean.get()) {
                        throw new IllegalStateException("构建Map错误，请查看【--keep class com.tencent.thumbplayer.tcmedia.api.** { *; }】是否加入反混淆");
                    }
                    buildNativeInitConfigMap();
                    buildPublicToNativeOptionalIdMap();
                    buildPrivateToNativeOptionalIdMap();
                    atomicBoolean.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void buildPrivateToNativeOptionalIdMap() {
        try {
            buildNativeOptionalIdToMapInternal(Class.forName(TPOptionalIDInternal.class.getName()));
        } catch (ClassNotFoundException e11) {
            TPLogUtil.m78798e(TAG, e11);
        }
    }

    private static void buildPublicToNativeOptionalIdMap() {
        try {
            buildNativeOptionalIdToMapInternal(Class.forName(TPOptionalID.class.getName()));
        } catch (ClassNotFoundException e11) {
            TPLogUtil.m78798e(TAG, e11);
        }
    }

    public static C35240c.a convertToNativeOptionalId(@TPCommonEnum.TPOptionalId int i11) {
        SparseArray<C35240c.a> sparseArray = sToNativeOptionalIdMap;
        if (sparseArray.size() == 0) {
            buildOptionalIdMap();
        }
        return sparseArray.get(i11, new C35240c.a());
    }

    public static String getOptionalIdName(int i11) {
        if (!sHasOptionalIdMapInit.get()) {
            buildOptionalIdMap();
        }
        return sOptionalIdKeyToNameMap.get(i11, "");
    }

    private static <T extends Annotation> void searchClassToFillMap(Class<T> cls) {
        boolean z11;
        Annotation annotation;
        Number number;
        Number numberValueOf;
        Class<T> cls2 = cls;
        String mapKey = getMapKey(cls2, true);
        Map<String, Map<Number, Number>> map = sNameToMap;
        Map<Number, Number> map2 = map.get(mapKey);
        String mapKey2 = getMapKey(cls2, false);
        Map<Number, Number> map3 = map.get(mapKey2);
        if (map2 == null || map3 == null) {
            map2 = new HashMap<>();
            map.put(mapKey, map2);
            map3 = new HashMap<>();
            map.put(mapKey2, map3);
        }
        Map<Number, Number> map4 = map2;
        Map<Number, Number> map5 = map3;
        try {
            TPNativeKeyMap.SearchConfig searchConfig = (TPNativeKeyMap.SearchConfig) cls2.getAnnotation(TPNativeKeyMap.SearchConfig.class);
            if (searchConfig == null) {
                throw new IllegalArgumentException(cls.getCanonicalName() + "has not SearchConfig annotation");
            }
            Class<?> clsSearchClass = searchConfig.searchClass();
            Field[] declaredFields = clsSearchClass.getDeclaredFields();
            int length = declaredFields.length;
            int i11 = 0;
            while (i11 < length) {
                Field field = declaredFields[i11];
                String str = "";
                Class<? extends Number> clsValueClass = searchConfig.valueClass();
                Class<? extends Number> cls3 = Integer.TYPE;
                Class<? extends Number> cls4 = Long.TYPE;
                if (clsValueClass == cls3) {
                    str = "int";
                } else if (searchConfig.valueClass() == cls4) {
                    str = "long";
                }
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("代码还没实现对" + searchConfig.valueClass().getName() + "的支持");
                }
                if (!field.getType().toString().equals(str) || (annotation = field.getAnnotation(cls2)) == null) {
                    z11 = false;
                } else {
                    field.setAccessible(true);
                    Map<Number, Number> map6 = map4;
                    Map<Number, Number> map7 = map5;
                    Method declaredMethod = cls2.getDeclaredMethod("value", new Class[0]);
                    declaredMethod.setAccessible(true);
                    if (searchConfig.valueClass() == cls3) {
                        number = (Integer) declaredMethod.invoke(annotation, new Object[0]);
                        numberValueOf = Integer.valueOf(field.getInt(clsSearchClass));
                        z11 = false;
                    } else {
                        if (searchConfig.valueClass() != cls4) {
                            throw new IllegalArgumentException("代码还没实现对" + searchConfig.valueClass().getName() + "的支持");
                        }
                        z11 = false;
                        number = (Long) declaredMethod.invoke(annotation, new Object[0]);
                        numberValueOf = Long.valueOf(field.getLong(clsSearchClass));
                    }
                    Number number2 = number;
                    Number number3 = numberValueOf;
                    map4 = map6;
                    map5 = map7;
                    checkFillMapValidity(cls2, map4, map5, clsSearchClass, number2, number3);
                    map4.put(number3, number2);
                    map5.put(number2, number3);
                }
                i11++;
                cls2 = cls;
            }
        } catch (IllegalAccessException e11) {
            TPLogUtil.m78798e(TAG, e11);
        } catch (NoSuchMethodException e12) {
            TPLogUtil.m78798e(TAG, e12);
            throw new IllegalStateException("com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap下所有元素需要加到混淆中, 并且每个MapXXX注解需要有value方法");
        } catch (InvocationTargetException e13) {
            TPLogUtil.m78798e(TAG, e13);
        }
    }

    private static void buildNativeOptionalIdToMapInternal(Class<?> cls) {
        TPNativeKeyMap.MapOptionalId mapOptionalId;
        try {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType().toString().equals("int") && (mapOptionalId = (TPNativeKeyMap.MapOptionalId) field.getAnnotation(TPNativeKeyMap.MapOptionalId.class)) != null) {
                    int i11 = field.getInt(cls);
                    sOptionalIdKeyToNameMap.put(i11, mapOptionalId.keyName());
                    if (mapOptionalId.value() == -1) {
                        sToNativeOptionalIdMap.put(i11, new C35240c.a());
                    } else {
                        field.setAccessible(true);
                        sToNativeOptionalIdMap.put(i11, new C35240c.a(mapOptionalId.type(), mapOptionalId.value()));
                    }
                }
            }
        } catch (IllegalAccessException e11) {
            TPLogUtil.m78798e(TAG, e11);
        }
    }

    private static <T extends Annotation> Map<Number, Number> getMapForAnnotation(Class<T> cls, boolean z11) {
        String mapKey = getMapKey(cls, z11);
        Map<String, Map<Number, Number>> map = sNameToMap;
        Map<Number, Number> map2 = map.get(mapKey);
        if (map2 == null || map2.size() == 0) {
            buildBiDirectionMapForAnnotation(cls);
            map2 = map.get(mapKey);
        }
        if (((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)) != null) {
            if (map2 != null && map2.size() != 0) {
                return map2;
            }
            throw new IllegalStateException(cls.getSimpleName() + " is null after buildBiDirectionMap");
        }
        throw new IllegalArgumentException(cls.getSimpleName() + "has not SearchConfig annotation");
    }

    private static <T extends Annotation> String getMapKey(Class<T> cls, boolean z11) {
        String canonicalName = cls.getCanonicalName();
        if (z11) {
            return canonicalName;
        }
        return canonicalName + REVERSE_MAP_NAME_SUFFIX;
    }

    public static void init() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Class<?>[] declaredClasses = TPNativeKeyMap.class.getDeclaredClasses();
        TPLogUtil.m78800i(TAG, "init BiDirectionMap for tp&native value");
        for (Class<?> cls : declaredClasses) {
            if (cls.isAnnotation() && Modifier.isPublic(cls.getModifiers()) && ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)) != null) {
                buildBiDirectionMapForAnnotation(cls);
            }
        }
        TPLogUtil.m78800i(TAG, "init cost time=" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }
}
