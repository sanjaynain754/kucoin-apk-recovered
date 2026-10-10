package com.fasterxml.jackson.databind.type;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.C6485b;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6493j;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import p424l7.AbstractC42116b;

/* JADX INFO: loaded from: classes45.dex */
public class TypeFactory implements Serializable {
    protected static final SimpleType CORE_TYPE_BOOL;
    protected static final SimpleType CORE_TYPE_CLASS;
    protected static final SimpleType CORE_TYPE_COMPARABLE;
    protected static final SimpleType CORE_TYPE_ENUM;
    protected static final SimpleType CORE_TYPE_INT;
    protected static final SimpleType CORE_TYPE_JSON_NODE;
    protected static final SimpleType CORE_TYPE_LONG;
    protected static final SimpleType CORE_TYPE_OBJECT;
    protected static final SimpleType CORE_TYPE_STRING;

    /* JADX INFO: renamed from: i */
    public static final Class<?> f10692i;

    /* JADX INFO: renamed from: j */
    public static final Class<?> f10693j;

    /* JADX INFO: renamed from: k */
    public static final Class<?> f10694k;
    private static final long serialVersionUID = 1;
    protected final ClassLoader _classLoader;
    protected final AbstractC6480b[] _modifiers;
    protected final TypeParser _parser;
    protected final InterfaceC6493j<Object, JavaType> _typeCache;

    /* JADX INFO: renamed from: b */
    public static final JavaType[] f10685b = new JavaType[0];
    protected static final TypeFactory instance = new TypeFactory();
    protected static final TypeBindings EMPTY_BINDINGS = TypeBindings.emptyBindings();

    /* JADX INFO: renamed from: c */
    public static final Class<?> f10686c = String.class;

    /* JADX INFO: renamed from: d */
    public static final Class<?> f10687d = Object.class;

    /* JADX INFO: renamed from: e */
    public static final Class<?> f10688e = Comparable.class;

    /* JADX INFO: renamed from: f */
    public static final Class<?> f10689f = Class.class;

    /* JADX INFO: renamed from: g */
    public static final Class<?> f10690g = Enum.class;

    /* JADX INFO: renamed from: h */
    public static final Class<?> f10691h = AbstractC6391f.class;

    static {
        Class<?> cls = Boolean.TYPE;
        f10692i = cls;
        Class<?> cls2 = Integer.TYPE;
        f10693j = cls2;
        Class<?> cls3 = Long.TYPE;
        f10694k = cls3;
        CORE_TYPE_BOOL = new SimpleType(cls);
        CORE_TYPE_INT = new SimpleType(cls2);
        CORE_TYPE_LONG = new SimpleType(cls3);
        CORE_TYPE_STRING = new SimpleType((Class<?>) String.class);
        CORE_TYPE_OBJECT = new SimpleType((Class<?>) Object.class);
        CORE_TYPE_COMPARABLE = new SimpleType((Class<?>) Comparable.class);
        CORE_TYPE_ENUM = new SimpleType((Class<?>) Enum.class);
        CORE_TYPE_CLASS = new SimpleType((Class<?>) Class.class);
        CORE_TYPE_JSON_NODE = new SimpleType((Class<?>) AbstractC6391f.class);
    }

    private TypeFactory() {
        this((InterfaceC6493j<Object, JavaType>) null);
    }

    public JavaType _fromWellKnownInterface(C6479a c6479a, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        for (JavaType javaType2 : javaTypeArr) {
            JavaType javaTypeRefine = javaType2.refine(cls, typeBindings, javaType, javaTypeArr);
            if (javaTypeRefine != null) {
                return javaTypeRefine;
            }
        }
        return null;
    }

    public Class<?> classForName(String str, boolean z11, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(str, true, classLoader);
    }

    public ArrayType constructArrayType(Class<?> cls) {
        return ArrayType.construct(_fromAny(null, cls, null), null);
    }

    public CollectionLikeType constructCollectionLikeType(Class<?> cls, Class<?> cls2) {
        return constructCollectionLikeType(cls, _fromClass(null, cls2, EMPTY_BINDINGS));
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, Class<?> cls2) {
        return constructCollectionType(cls, _fromClass(null, cls2, EMPTY_BINDINGS));
    }

    public MapLikeType constructMapLikeType(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        TypeBindings typeBindings = EMPTY_BINDINGS;
        return constructMapLikeType(cls, _fromClass(null, cls2, typeBindings), _fromClass(null, cls3, typeBindings));
    }

    public MapType constructMapType(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        JavaType javaType_fromClass;
        JavaType javaType_fromClass2;
        if (cls == Properties.class) {
            javaType_fromClass = CORE_TYPE_STRING;
            javaType_fromClass2 = javaType_fromClass;
        } else {
            TypeBindings typeBindings = EMPTY_BINDINGS;
            javaType_fromClass = _fromClass(null, cls2, typeBindings);
            javaType_fromClass2 = _fromClass(null, cls3, typeBindings);
        }
        return constructMapType(cls, javaType_fromClass, javaType_fromClass2);
    }

    public JavaType constructParametricType(Class<?> cls, Class<?>... clsArr) {
        int length = clsArr.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i11 = 0; i11 < length; i11++) {
            javaTypeArr[i11] = _fromClass(null, clsArr[i11], EMPTY_BINDINGS);
        }
        return constructParametricType(cls, javaTypeArr);
    }

    @Deprecated
    public JavaType constructParametrizedType(Class<?> cls, Class<?> cls2, JavaType... javaTypeArr) {
        return constructParametricType(cls, javaTypeArr);
    }

    public JavaType constructSimpleType(Class<?> cls, JavaType[] javaTypeArr) {
        return _fromClass(null, cls, TypeBindings.create(cls, javaTypeArr));
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        return constructSpecializedType(javaType, cls, false);
    }

    public JavaType constructType(Type type) {
        return _fromAny(null, type, EMPTY_BINDINGS);
    }

    public JavaType[] findTypeParameters(JavaType javaType, Class<?> cls) {
        JavaType javaTypeFindSuperType = javaType.findSuperType(cls);
        return javaTypeFindSuperType == null ? f10685b : javaTypeFindSuperType.getBindings().typeParameterArray();
    }

    public JavaType resolveMemberType(Type type, TypeBindings typeBindings) {
        return _fromAny(null, type, typeBindings);
    }

    @Deprecated
    public TypeFactory withCache(LRUMap<Object, JavaType> lRUMap) {
        return new TypeFactory(lRUMap, this._parser, this._modifiers, this._classLoader);
    }

    @Deprecated
    public TypeFactory(LRUMap<Object, JavaType> lRUMap) {
        this((InterfaceC6493j<Object, JavaType>) lRUMap);
    }

    public static TypeFactory defaultInstance() {
        return instance;
    }

    public static Class<?> rawClass(Type type) {
        return type instanceof Class ? (Class) type : defaultInstance().constructType(type).getRawClass();
    }

    public JavaType _applyModifiers(Type type, JavaType javaType) {
        if (this._modifiers == null) {
            return javaType;
        }
        TypeBindings bindings = javaType.getBindings();
        if (bindings == null) {
            bindings = EMPTY_BINDINGS;
        }
        AbstractC6480b[] abstractC6480bArr = this._modifiers;
        int length = abstractC6480bArr.length;
        int i11 = 0;
        while (i11 < length) {
            AbstractC6480b abstractC6480b = abstractC6480bArr[i11];
            JavaType javaTypeM11863a = abstractC6480b.m11863a(javaType, type, bindings, this);
            if (javaTypeM11863a == null) {
                throw new IllegalStateException(String.format("TypeModifier %s (of type %s) return null for type %s", abstractC6480b, abstractC6480b.getClass().getName(), javaType));
            }
            i11++;
            javaType = javaTypeM11863a;
        }
        return javaType;
    }

    public Class<?> _findPrimitive(String str) {
        if ("int".equals(str)) {
            return Integer.TYPE;
        }
        if ("long".equals(str)) {
            return Long.TYPE;
        }
        if (TypedValues.Custom.S_FLOAT.equals(str)) {
            return Float.TYPE;
        }
        if ("double".equals(str)) {
            return Double.TYPE;
        }
        if (TypedValues.Custom.S_BOOLEAN.equals(str)) {
            return Boolean.TYPE;
        }
        if ("byte".equals(str)) {
            return Byte.TYPE;
        }
        if ("char".equals(str)) {
            return Character.TYPE;
        }
        if ("short".equals(str)) {
            return Short.TYPE;
        }
        if ("void".equals(str)) {
            return Void.TYPE;
        }
        return null;
    }

    public JavaType _fromAny(C6479a c6479a, Type type, TypeBindings typeBindings) {
        JavaType javaType_fromWildcard;
        if (type instanceof Class) {
            javaType_fromWildcard = _fromClass(c6479a, (Class) type, EMPTY_BINDINGS);
        } else if (type instanceof ParameterizedType) {
            javaType_fromWildcard = _fromParamType(c6479a, (ParameterizedType) type, typeBindings);
        } else {
            if (type instanceof JavaType) {
                return (JavaType) type;
            }
            if (type instanceof GenericArrayType) {
                javaType_fromWildcard = _fromArrayType(c6479a, (GenericArrayType) type, typeBindings);
            } else if (type instanceof TypeVariable) {
                javaType_fromWildcard = _fromVariable(c6479a, (TypeVariable) type, typeBindings);
            } else {
                if (!(type instanceof WildcardType)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unrecognized Type: ");
                    sb2.append(type == null ? "[null]" : type.toString());
                    throw new IllegalArgumentException(sb2.toString());
                }
                javaType_fromWildcard = _fromWildcard(c6479a, (WildcardType) type, typeBindings);
            }
        }
        return _applyModifiers(type, javaType_fromWildcard);
    }

    public JavaType _fromWellKnownClass(C6479a c6479a, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        if (typeBindings == null) {
            typeBindings = EMPTY_BINDINGS;
        }
        if (cls == Map.class) {
            return m11852c(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == Collection.class) {
            return m11851b(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == AtomicReference.class) {
            return m11853d(cls, typeBindings, javaType, javaTypeArr);
        }
        return null;
    }

    public JavaType _newSimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new SimpleType(cls, typeBindings, javaType, javaTypeArr);
    }

    public JavaType _unknownType() {
        return CORE_TYPE_OBJECT;
    }

    /* JADX INFO: renamed from: a */
    public final TypeBindings m11850a(JavaType javaType, int i11, Class<?> cls, boolean z11) {
        PlaceholderForType[] placeholderForTypeArr = new PlaceholderForType[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            placeholderForTypeArr[i12] = new PlaceholderForType(i12);
        }
        JavaType javaTypeFindSuperType = _fromClass(null, cls, TypeBindings.create(cls, placeholderForTypeArr)).findSuperType(javaType.getRawClass());
        if (javaTypeFindSuperType == null) {
            throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", javaType.getRawClass().getName(), cls.getName()));
        }
        String strM11854e = m11854e(javaType, javaTypeFindSuperType);
        if (strM11854e == null || z11) {
            JavaType[] javaTypeArr = new JavaType[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                JavaType javaTypeActualType = placeholderForTypeArr[i13].actualType();
                if (javaTypeActualType == null) {
                    javaTypeActualType = unknownType();
                }
                javaTypeArr[i13] = javaTypeActualType;
            }
            return TypeBindings.create(cls, javaTypeArr);
        }
        throw new IllegalArgumentException("Failed to specialize base type " + javaType.toCanonical() + " as " + cls.getName() + ", problem: " + strM11854e);
    }

    /* JADX INFO: renamed from: c */
    public final JavaType m11852c(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType_unknownType;
        JavaType javaType2;
        JavaType javaType3;
        if (cls != Properties.class) {
            List<JavaType> typeParameters = typeBindings.getTypeParameters();
            int size = typeParameters.size();
            if (size == 0) {
                javaType_unknownType = _unknownType();
            } else {
                if (size != 2) {
                    throw new IllegalArgumentException(String.format("Strange Map type %s with %d type parameter%s (%s), can not resolve", C6490g.m11921X(cls), Integer.valueOf(size), size == 1 ? "" : CmcdData.Factory.STREAMING_FORMAT_SS, typeBindings));
                }
                JavaType javaType4 = typeParameters.get(0);
                javaType2 = typeParameters.get(1);
                javaType3 = javaType4;
            }
            return MapType.construct(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
        }
        javaType_unknownType = CORE_TYPE_STRING;
        javaType3 = javaType_unknownType;
        javaType2 = javaType3;
        return MapType.construct(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
    }

    public Class<?> classForName(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public void clearCache() {
        this._typeCache.clear();
    }

    public ArrayType constructArrayType(JavaType javaType) {
        return ArrayType.construct(javaType, null);
    }

    public JavaType constructFromCanonical(String str) throws IllegalArgumentException {
        return this._parser.parse(str);
    }

    @Deprecated
    public JavaType constructParametrizedType(Class<?> cls, Class<?> cls2, Class<?>... clsArr) {
        return constructParametricType(cls, clsArr);
    }

    @Deprecated
    public JavaType constructSimpleType(Class<?> cls, Class<?> cls2, JavaType[] javaTypeArr) {
        return constructSimpleType(cls, javaTypeArr);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        if (r0 == java.util.EnumSet.class) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls, boolean z11) throws IllegalArgumentException {
        int length;
        JavaType javaType_fromClass;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass != cls) {
            if (rawClass == Object.class) {
                javaType_fromClass = _fromClass(null, cls, EMPTY_BINDINGS);
            } else {
                if (!rawClass.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException(String.format("Class %s not subtype of %s", C6490g.m11921X(cls), C6490g.m11904G(javaType)));
                }
                if (!javaType.isContainerType()) {
                    javaType_fromClass = (javaType.getBindings().isEmpty() && (length = cls.getTypeParameters().length) != 0) ? _fromClass(null, cls, m11850a(javaType, length, cls, z11)) : _fromClass(null, cls, EMPTY_BINDINGS);
                } else if (javaType.isMapLikeType()) {
                    if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                        javaType_fromClass = _fromClass(null, cls, TypeBindings.create(cls, javaType.getKeyType(), javaType.getContentType()));
                    } else if (javaType.getBindings().isEmpty()) {
                        javaType_fromClass = _fromClass(null, cls, EMPTY_BINDINGS);
                    }
                } else if (javaType.isCollectionLikeType()) {
                    if (cls == ArrayList.class || cls == LinkedList.class || cls == HashSet.class || cls == TreeSet.class) {
                        javaType_fromClass = _fromClass(null, cls, TypeBindings.create(cls, javaType.getContentType()));
                    }
                } else if (javaType.getBindings().isEmpty()) {
                    javaType_fromClass = _fromClass(null, cls, EMPTY_BINDINGS);
                }
            }
            return javaType_fromClass.withHandlersFrom(javaType);
        }
        return javaType;
    }

    public JavaType constructType(AbstractC42116b<?> abstractC42116b) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11855f(JavaType javaType, JavaType javaType2) {
        if (javaType2 instanceof PlaceholderForType) {
            ((PlaceholderForType) javaType2).actualType(javaType);
            return true;
        }
        if (javaType.getRawClass() != javaType2.getRawClass()) {
            return false;
        }
        List<JavaType> typeParameters = javaType.getBindings().getTypeParameters();
        List<JavaType> typeParameters2 = javaType2.getBindings().getTypeParameters();
        int size = typeParameters.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!m11855f(typeParameters.get(i11), typeParameters2.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        Throwable thM11903F;
        Class<?> cls_findPrimitive;
        if (str.indexOf(46) < 0 && (cls_findPrimitive = _findPrimitive(str)) != null) {
            return cls_findPrimitive;
        }
        ClassLoader classLoader = getClassLoader();
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (classLoader != null) {
            try {
                return classForName(str, true, classLoader);
            } catch (Exception e11) {
                thM11903F = C6490g.m11903F(e11);
            }
        } else {
            thM11903F = null;
        }
        try {
            return classForName(str);
        } catch (Exception e12) {
            if (thM11903F == null) {
                thM11903F = C6490g.m11903F(e12);
            }
            C6490g.m11943j0(thM11903F);
            throw new ClassNotFoundException(thM11903F.getMessage(), thM11903F);
        }
    }

    public ClassLoader getClassLoader() {
        return this._classLoader;
    }

    public JavaType moreSpecificType(JavaType javaType, JavaType javaType2) {
        Class<?> rawClass;
        Class<?> rawClass2;
        if (javaType == null) {
            return javaType2;
        }
        return (javaType2 == null || (rawClass = javaType.getRawClass()) == (rawClass2 = javaType2.getRawClass()) || !rawClass.isAssignableFrom(rawClass2)) ? javaType : javaType2;
    }

    @Deprecated
    public JavaType uncheckedSimpleType(Class<?> cls) {
        return _constructSimple(cls, EMPTY_BINDINGS, null, null);
    }

    public TypeFactory withCache(InterfaceC6493j<Object, JavaType> interfaceC6493j) {
        return new TypeFactory(interfaceC6493j, this._parser, this._modifiers, this._classLoader);
    }

    public TypeFactory withClassLoader(ClassLoader classLoader) {
        return new TypeFactory(this._typeCache, this._parser, this._modifiers, classLoader);
    }

    public TypeFactory withModifier(AbstractC6480b abstractC6480b) {
        InterfaceC6493j<Object, JavaType> interfaceC6493j = this._typeCache;
        AbstractC6480b[] abstractC6480bArr = null;
        if (abstractC6480b == null) {
            interfaceC6493j = null;
        } else {
            AbstractC6480b[] abstractC6480bArr2 = this._modifiers;
            if (abstractC6480bArr2 == null) {
                abstractC6480bArr = new AbstractC6480b[]{abstractC6480b};
                interfaceC6493j = null;
            } else {
                abstractC6480bArr = (AbstractC6480b[]) C6485b.m11878j(abstractC6480bArr2, abstractC6480b);
            }
        }
        return new TypeFactory(interfaceC6493j, this._parser, abstractC6480bArr, this._classLoader);
    }

    public TypeFactory(InterfaceC6493j<Object, JavaType> interfaceC6493j) {
        this._typeCache = interfaceC6493j == null ? new LRUMap<>(16, 200) : interfaceC6493j;
        this._parser = new TypeParser(this);
        this._modifiers = null;
        this._classLoader = null;
    }

    public static JavaType unknownType() {
        return defaultInstance()._unknownType();
    }

    public JavaType _constructSimple(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType_findWellKnownSimple;
        if (typeBindings.isEmpty() && (javaType_findWellKnownSimple = _findWellKnownSimple(cls)) != null) {
            return javaType_findWellKnownSimple;
        }
        return _newSimpleType(cls, typeBindings, javaType, javaTypeArr);
    }

    public JavaType _findWellKnownSimple(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == f10692i) {
                return CORE_TYPE_BOOL;
            }
            if (cls == f10693j) {
                return CORE_TYPE_INT;
            }
            if (cls == f10694k) {
                return CORE_TYPE_LONG;
            }
            return null;
        }
        if (cls == f10686c) {
            return CORE_TYPE_STRING;
        }
        if (cls == f10687d) {
            return CORE_TYPE_OBJECT;
        }
        if (cls == f10691h) {
            return CORE_TYPE_JSON_NODE;
        }
        return null;
    }

    public JavaType _fromArrayType(C6479a c6479a, GenericArrayType genericArrayType, TypeBindings typeBindings) {
        return ArrayType.construct(_fromAny(c6479a, genericArrayType.getGenericComponentType(), typeBindings), typeBindings);
    }

    public JavaType _fromClass(C6479a c6479a, Class<?> cls, TypeBindings typeBindings) {
        Object objAsKey;
        C6479a c6479aM11860b;
        JavaType javaType_resolveSuperClass;
        JavaType[] javaTypeArr_resolveSuperInterfaces;
        Class<?> cls2;
        TypeBindings typeBindings2;
        TypeFactory typeFactory;
        JavaType javaType_fromWellKnownClass;
        JavaType javaType_findWellKnownSimple = _findWellKnownSimple(cls);
        if (javaType_findWellKnownSimple != null) {
            return javaType_findWellKnownSimple;
        }
        if (typeBindings != null && !typeBindings.isEmpty()) {
            objAsKey = typeBindings.asKey(cls);
        } else {
            objAsKey = cls;
        }
        JavaType javaTypeRefine = this._typeCache.get(objAsKey);
        if (javaTypeRefine != null) {
            return javaTypeRefine;
        }
        if (c6479a == null) {
            c6479aM11860b = new C6479a(cls);
        } else {
            C6479a c6479aM11861c = c6479a.m11861c(cls);
            if (c6479aM11861c != null) {
                ResolvedRecursiveType resolvedRecursiveType = new ResolvedRecursiveType(cls, EMPTY_BINDINGS);
                c6479aM11861c.m11859a(resolvedRecursiveType);
                return resolvedRecursiveType;
            }
            c6479aM11860b = c6479a.m11860b(cls);
        }
        C6479a c6479a2 = c6479aM11860b;
        if (cls.isArray()) {
            javaType_fromWellKnownClass = ArrayType.construct(_fromAny(c6479a2, cls.getComponentType(), typeBindings), typeBindings);
            typeFactory = this;
        } else {
            if (cls.isInterface()) {
                javaTypeArr_resolveSuperInterfaces = _resolveSuperInterfaces(c6479a2, cls, typeBindings);
                javaType_resolveSuperClass = null;
            } else {
                javaType_resolveSuperClass = _resolveSuperClass(c6479a2, cls, typeBindings);
                javaTypeArr_resolveSuperInterfaces = _resolveSuperInterfaces(c6479a2, cls, typeBindings);
            }
            JavaType[] javaTypeArr = javaTypeArr_resolveSuperInterfaces;
            JavaType javaType = javaType_resolveSuperClass;
            if (cls == Properties.class) {
                SimpleType simpleType = CORE_TYPE_STRING;
                cls2 = cls;
                typeBindings2 = typeBindings;
                javaTypeRefine = MapType.construct(cls2, typeBindings2, javaType, javaTypeArr, simpleType, simpleType);
            } else {
                cls2 = cls;
                typeBindings2 = typeBindings;
                if (javaType != null) {
                    javaTypeRefine = javaType.refine(cls2, typeBindings2, javaType, javaTypeArr);
                }
            }
            typeFactory = this;
            if (javaTypeRefine == null) {
                javaType_fromWellKnownClass = typeFactory._fromWellKnownClass(c6479a2, cls2, typeBindings2, javaType, javaTypeArr);
                typeFactory = this;
                if (javaType_fromWellKnownClass == null && (javaType_fromWellKnownClass = typeFactory._fromWellKnownInterface(c6479a2, cls2, typeBindings2, javaType, javaTypeArr)) == null) {
                    javaType_fromWellKnownClass = _newSimpleType(cls2, typeBindings2, javaType, javaTypeArr);
                }
            } else {
                javaType_fromWellKnownClass = javaTypeRefine;
            }
        }
        c6479a2.m11862d(javaType_fromWellKnownClass);
        if (!javaType_fromWellKnownClass.hasHandlers()) {
            typeFactory._typeCache.putIfAbsent(objAsKey, javaType_fromWellKnownClass);
        }
        return javaType_fromWellKnownClass;
    }

    public JavaType _fromParamType(C6479a c6479a, ParameterizedType parameterizedType, TypeBindings typeBindings) {
        int length;
        TypeBindings typeBindingsCreate;
        Class<?> cls = (Class) parameterizedType.getRawType();
        if (cls == f10690g) {
            return CORE_TYPE_ENUM;
        }
        if (cls == f10688e) {
            return CORE_TYPE_COMPARABLE;
        }
        if (cls == f10689f) {
            return CORE_TYPE_CLASS;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments == null) {
            length = 0;
        } else {
            length = actualTypeArguments.length;
        }
        if (length == 0) {
            typeBindingsCreate = EMPTY_BINDINGS;
        } else {
            JavaType[] javaTypeArr = new JavaType[length];
            for (int i11 = 0; i11 < length; i11++) {
                javaTypeArr[i11] = _fromAny(c6479a, actualTypeArguments[i11], typeBindings);
            }
            typeBindingsCreate = TypeBindings.create(cls, javaTypeArr);
        }
        return _fromClass(c6479a, cls, typeBindingsCreate);
    }

    public JavaType _fromVariable(C6479a c6479a, TypeVariable<?> typeVariable, TypeBindings typeBindings) {
        Type[] bounds;
        String name = typeVariable.getName();
        if (typeBindings != null) {
            JavaType javaTypeFindBoundType = typeBindings.findBoundType(name);
            if (javaTypeFindBoundType != null) {
                return javaTypeFindBoundType;
            }
            if (typeBindings.hasUnbound(name)) {
                return CORE_TYPE_OBJECT;
            }
            TypeBindings typeBindingsWithUnboundVariable = typeBindings.withUnboundVariable(name);
            synchronized (typeVariable) {
                bounds = typeVariable.getBounds();
            }
            return _fromAny(c6479a, bounds[0], typeBindingsWithUnboundVariable);
        }
        throw new IllegalArgumentException("Null `bindings` passed (type variable \"" + name + "\")");
    }

    public JavaType _fromWildcard(C6479a c6479a, WildcardType wildcardType, TypeBindings typeBindings) {
        return _fromAny(c6479a, wildcardType.getUpperBounds()[0], typeBindings);
    }

    public JavaType _resolveSuperClass(C6479a c6479a, Class<?> cls, TypeBindings typeBindings) {
        Type typeM11901D = C6490g.m11901D(cls);
        if (typeM11901D == null) {
            return null;
        }
        return _fromAny(c6479a, typeM11901D, typeBindings);
    }

    public JavaType[] _resolveSuperInterfaces(C6479a c6479a, Class<?> cls, TypeBindings typeBindings) {
        Type[] typeArrM11900C = C6490g.m11900C(cls);
        if (typeArrM11900C != null && typeArrM11900C.length != 0) {
            int length = typeArrM11900C.length;
            JavaType[] javaTypeArr = new JavaType[length];
            for (int i11 = 0; i11 < length; i11++) {
                javaTypeArr[i11] = _fromAny(c6479a, typeArrM11900C[i11], typeBindings);
            }
            return javaTypeArr;
        }
        return f10685b;
    }

    /* JADX INFO: renamed from: b */
    public final JavaType m11851b(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType_unknownType;
        List<JavaType> typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType_unknownType = _unknownType();
        } else if (typeParameters.size() == 1) {
            javaType_unknownType = typeParameters.get(0);
        } else {
            throw new IllegalArgumentException("Strange Collection type " + cls.getName() + ": cannot determine type parameters");
        }
        return CollectionType.construct(cls, typeBindings, javaType, javaTypeArr, javaType_unknownType);
    }

    public JavaType constructGeneralizedType(JavaType javaType, Class<?> cls) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        JavaType javaTypeFindSuperType = javaType.findSuperType(cls);
        if (javaTypeFindSuperType == null) {
            if (!cls.isAssignableFrom(rawClass)) {
                throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), javaType));
            }
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), javaType));
        }
        return javaTypeFindSuperType;
    }

    public CollectionLikeType constructRawCollectionLikeType(Class<?> cls) {
        return constructCollectionLikeType(cls, unknownType());
    }

    public CollectionType constructRawCollectionType(Class<? extends Collection> cls) {
        return constructCollectionType(cls, unknownType());
    }

    public MapLikeType constructRawMapLikeType(Class<?> cls) {
        return constructMapLikeType(cls, unknownType(), unknownType());
    }

    public MapType constructRawMapType(Class<? extends Map> cls) {
        return constructMapType(cls, unknownType(), unknownType());
    }

    public JavaType constructReferenceType(Class<?> cls, JavaType javaType) {
        return ReferenceType.construct(cls, TypeBindings.create(cls, javaType), null, null, javaType);
    }

    @Deprecated
    public JavaType constructType(Type type, TypeBindings typeBindings) {
        if (type instanceof Class) {
            return _applyModifiers(type, _fromClass(null, (Class) type, typeBindings));
        }
        return _fromAny(null, type, typeBindings);
    }

    /* JADX INFO: renamed from: d */
    public final JavaType m11853d(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType_unknownType;
        List<JavaType> typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType_unknownType = _unknownType();
        } else if (typeParameters.size() == 1) {
            javaType_unknownType = typeParameters.get(0);
        } else {
            throw new IllegalArgumentException("Strange Reference type " + cls.getName() + ": cannot determine type parameters");
        }
        return ReferenceType.construct(cls, typeBindings, javaType, javaTypeArr, javaType_unknownType);
    }

    /* JADX INFO: renamed from: e */
    public final String m11854e(JavaType javaType, JavaType javaType2) throws IllegalArgumentException {
        JavaType javaTypeUnknownType;
        List<JavaType> typeParameters = javaType.getBindings().getTypeParameters();
        List<JavaType> typeParameters2 = javaType2.getBindings().getTypeParameters();
        int size = typeParameters2.size();
        int size2 = typeParameters.size();
        for (int i11 = 0; i11 < size2; i11++) {
            JavaType javaType3 = typeParameters.get(i11);
            if (i11 < size) {
                javaTypeUnknownType = typeParameters2.get(i11);
            } else {
                javaTypeUnknownType = unknownType();
            }
            if (!m11855f(javaType3, javaTypeUnknownType) && !javaType3.hasRawClass(Object.class) && ((i11 != 0 || !javaType.isMapLikeType() || !javaTypeUnknownType.hasRawClass(Object.class)) && (!javaType3.isInterface() || !javaType3.isTypeOrSuperTypeOf(javaTypeUnknownType.getRawClass())))) {
                return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", Integer.valueOf(i11 + 1), Integer.valueOf(size2), javaType3.toCanonical(), javaTypeUnknownType.toCanonical());
            }
        }
        return null;
    }

    public CollectionLikeType constructCollectionLikeType(Class<?> cls, JavaType javaType) {
        JavaType javaType_fromClass = _fromClass(null, cls, TypeBindings.createIfNeeded(cls, javaType));
        if (javaType_fromClass instanceof CollectionLikeType) {
            return (CollectionLikeType) javaType_fromClass;
        }
        return CollectionLikeType.upgradeFrom(javaType_fromClass, javaType);
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, JavaType javaType) {
        TypeBindings typeBindingsCreateIfNeeded = TypeBindings.createIfNeeded(cls, javaType);
        CollectionType collectionType = (CollectionType) _fromClass(null, cls, typeBindingsCreateIfNeeded);
        if (typeBindingsCreateIfNeeded.isEmpty() && javaType != null) {
            JavaType contentType = collectionType.findSuperType(Collection.class).getContentType();
            if (!contentType.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", C6490g.m11921X(cls), javaType, contentType));
            }
        }
        return collectionType;
    }

    @Deprecated
    public JavaType[] findTypeParameters(Class<?> cls, Class<?> cls2, TypeBindings typeBindings) {
        return findTypeParameters(constructType(cls, typeBindings), cls2);
    }

    public MapLikeType constructMapLikeType(Class<?> cls, JavaType javaType, JavaType javaType2) {
        JavaType javaType_fromClass = _fromClass(null, cls, TypeBindings.createIfNeeded(cls, new JavaType[]{javaType, javaType2}));
        if (javaType_fromClass instanceof MapLikeType) {
            return (MapLikeType) javaType_fromClass;
        }
        return MapLikeType.upgradeFrom(javaType_fromClass, javaType, javaType2);
    }

    public JavaType constructParametricType(Class<?> cls, JavaType... javaTypeArr) {
        return constructParametricType(cls, TypeBindings.create(cls, javaTypeArr));
    }

    @Deprecated
    public JavaType[] findTypeParameters(Class<?> cls, Class<?> cls2) {
        return findTypeParameters(constructType(cls), cls2);
    }

    public MapType constructMapType(Class<? extends Map> cls, JavaType javaType, JavaType javaType2) {
        TypeBindings typeBindingsCreateIfNeeded = TypeBindings.createIfNeeded(cls, new JavaType[]{javaType, javaType2});
        MapType mapType = (MapType) _fromClass(null, cls, typeBindingsCreateIfNeeded);
        if (typeBindingsCreateIfNeeded.isEmpty()) {
            JavaType javaTypeFindSuperType = mapType.findSuperType(Map.class);
            JavaType keyType = javaTypeFindSuperType.getKeyType();
            if (keyType.equals(javaType)) {
                JavaType contentType = javaTypeFindSuperType.getContentType();
                if (!contentType.equals(javaType2)) {
                    throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", C6490g.m11921X(cls), javaType2, contentType));
                }
            } else {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", C6490g.m11921X(cls), javaType, keyType));
            }
        }
        return mapType;
    }

    public JavaType constructParametricType(Class<?> cls, TypeBindings typeBindings) {
        return _applyModifiers(cls, _fromClass(null, cls, typeBindings));
    }

    @Deprecated
    public JavaType constructType(Type type, Class<?> cls) {
        return constructType(type, cls == null ? null : constructType(cls));
    }

    @Deprecated
    public TypeFactory(LRUMap<Object, JavaType> lRUMap, TypeParser typeParser, AbstractC6480b[] abstractC6480bArr, ClassLoader classLoader) {
        this((InterfaceC6493j<Object, JavaType>) lRUMap, typeParser, abstractC6480bArr, classLoader);
    }

    @Deprecated
    public JavaType constructType(Type type, JavaType javaType) {
        TypeBindings bindings;
        if (javaType == null) {
            bindings = EMPTY_BINDINGS;
        } else {
            TypeBindings bindings2 = javaType.getBindings();
            if (type.getClass() != Class.class) {
                JavaType superClass = javaType;
                bindings = bindings2;
                while (bindings.isEmpty() && (superClass = superClass.getSuperClass()) != null) {
                    bindings = superClass.getBindings();
                }
            } else {
                bindings = bindings2;
            }
        }
        return _fromAny(null, type, bindings);
    }

    public TypeFactory(InterfaceC6493j<Object, JavaType> interfaceC6493j, TypeParser typeParser, AbstractC6480b[] abstractC6480bArr, ClassLoader classLoader) {
        this._typeCache = interfaceC6493j == null ? new LRUMap<>(16, 200) : interfaceC6493j;
        this._parser = typeParser.withFactory(this);
        this._modifiers = abstractC6480bArr;
        this._classLoader = classLoader;
    }
}
