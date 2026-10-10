package com.fasterxml.jackson.databind.type;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes45.dex */
public class TypeBindings implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final String[] f10671b;

    /* JADX INFO: renamed from: c */
    public static final JavaType[] f10672c;

    /* JADX INFO: renamed from: d */
    public static final TypeBindings f10673d;
    private static final long serialVersionUID = 1;
    private final int _hashCode;
    private final String[] _names;
    private final JavaType[] _types;
    private final String[] _unboundVariables;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.type.TypeBindings$a */
    public static final class C6476a {

        /* JADX INFO: renamed from: a */
        public final Class<?> f10674a;

        /* JADX INFO: renamed from: b */
        public final JavaType[] f10675b;

        /* JADX INFO: renamed from: c */
        public final int f10676c;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != C6476a.class) {
                return false;
            }
            C6476a c6476a = (C6476a) obj;
            if (this.f10676c == c6476a.f10676c && this.f10674a == c6476a.f10674a) {
                JavaType[] javaTypeArr = c6476a.f10675b;
                int length = this.f10675b.length;
                if (length == javaTypeArr.length) {
                    for (int i11 = 0; i11 < length; i11++) {
                        if (!this.f10675b[i11].equals(javaTypeArr[i11])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f10676c;
        }

        public String toString() {
            return this.f10674a.getName() + "<>";
        }

        public C6476a(Class<?> cls, JavaType[] javaTypeArr, int i11) {
            this.f10674a = cls;
            this.f10675b = javaTypeArr;
            this.f10676c = i11;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.type.TypeBindings$b */
    public static class C6477b {

        /* JADX INFO: renamed from: a */
        public static final TypeVariable<?>[] f10677a = AbstractList.class.getTypeParameters();

        /* JADX INFO: renamed from: b */
        public static final TypeVariable<?>[] f10678b = Collection.class.getTypeParameters();

        /* JADX INFO: renamed from: c */
        public static final TypeVariable<?>[] f10679c = Iterable.class.getTypeParameters();

        /* JADX INFO: renamed from: d */
        public static final TypeVariable<?>[] f10680d = List.class.getTypeParameters();

        /* JADX INFO: renamed from: e */
        public static final TypeVariable<?>[] f10681e = ArrayList.class.getTypeParameters();

        /* JADX INFO: renamed from: f */
        public static final TypeVariable<?>[] f10682f = Map.class.getTypeParameters();

        /* JADX INFO: renamed from: g */
        public static final TypeVariable<?>[] f10683g = HashMap.class.getTypeParameters();

        /* JADX INFO: renamed from: h */
        public static final TypeVariable<?>[] f10684h = LinkedHashMap.class.getTypeParameters();

        /* JADX INFO: renamed from: a */
        public static TypeVariable<?>[] m11848a(Class<?> cls) {
            if (cls == Collection.class) {
                return f10678b;
            }
            if (cls == List.class) {
                return f10680d;
            }
            if (cls == ArrayList.class) {
                return f10681e;
            }
            if (cls == AbstractList.class) {
                return f10677a;
            }
            return cls == Iterable.class ? f10679c : cls.getTypeParameters();
        }

        /* JADX INFO: renamed from: b */
        public static TypeVariable<?>[] m11849b(Class<?> cls) {
            if (cls == Map.class) {
                return f10682f;
            }
            if (cls == HashMap.class) {
                return f10683g;
            }
            return cls == LinkedHashMap.class ? f10684h : cls.getTypeParameters();
        }
    }

    static {
        String[] strArr = new String[0];
        f10671b = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        f10672c = javaTypeArr;
        f10673d = new TypeBindings(strArr, javaTypeArr, null);
    }

    public static TypeBindings create(Class<?> cls, List<JavaType> list) {
        return create(cls, (list == null || list.isEmpty()) ? f10672c : (JavaType[]) list.toArray(f10672c));
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType javaType) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return f10673d;
        }
        if (length == 1) {
            return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!C6490g.m11905H(obj, getClass())) {
            return false;
        }
        TypeBindings typeBindings = (TypeBindings) obj;
        int length = this._types.length;
        if (length != typeBindings.size()) {
            return false;
        }
        JavaType[] javaTypeArr = typeBindings._types;
        for (int i11 = 0; i11 < length; i11++) {
            if (!javaTypeArr[i11].equals(this._types[i11])) {
                return false;
            }
        }
        return true;
    }

    public static TypeBindings emptyBindings() {
        return f10673d;
    }

    public Object asKey(Class<?> cls) {
        return new C6476a(cls, this._types, this._hashCode);
    }

    public JavaType findBoundType(String str) {
        JavaType selfReferencedType;
        int length = this._names.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(this._names[i11])) {
                JavaType javaType = this._types[i11];
                return (!(javaType instanceof ResolvedRecursiveType) || (selfReferencedType = ((ResolvedRecursiveType) javaType).getSelfReferencedType()) == null) ? javaType : selfReferencedType;
            }
        }
        return null;
    }

    public String getBoundName(int i11) {
        if (i11 < 0) {
            return null;
        }
        String[] strArr = this._names;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }

    public JavaType getBoundType(int i11) {
        if (i11 < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this._types;
        if (i11 >= javaTypeArr.length) {
            return null;
        }
        return javaTypeArr[i11];
    }

    public List<JavaType> getTypeParameters() {
        JavaType[] javaTypeArr = this._types;
        return javaTypeArr.length == 0 ? Collections.EMPTY_LIST : Arrays.asList(javaTypeArr);
    }

    public boolean hasUnbound(String str) {
        String[] strArr = this._unboundVariables;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(this._unboundVariables[length]));
        return true;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public boolean isEmpty() {
        return this._types.length == 0;
    }

    public Object readResolve() {
        String[] strArr = this._names;
        return (strArr == null || strArr.length == 0) ? f10673d : this;
    }

    public int size() {
        return this._types.length;
    }

    public String toString() {
        if (this._types.length == 0) {
            return "<>";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Typography.less);
        int length = this._types.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 > 0) {
                sb2.append(',');
            }
            sb2.append(this._types[i11].getGenericSignature());
        }
        sb2.append(Typography.greater);
        return sb2.toString();
    }

    public JavaType[] typeParameterArray() {
        return this._types;
    }

    public TypeBindings withUnboundVariable(String str) {
        String[] strArr = this._unboundVariables;
        int length = strArr == null ? 0 : strArr.length;
        String[] strArr2 = length == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr, length + 1);
        strArr2[length] = str;
        return new TypeBindings(this._names, this._types, strArr2);
    }

    public TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? f10671b : strArr;
        this._names = strArr;
        javaTypeArr = javaTypeArr == null ? f10672c : javaTypeArr;
        this._types = javaTypeArr;
        if (strArr.length == javaTypeArr.length) {
            int length = javaTypeArr.length;
            int iHashCode = 1;
            for (int i11 = 0; i11 < length; i11++) {
                iHashCode += this._types[i11].hashCode();
            }
            this._unboundVariables = strArr2;
            this._hashCode = iHashCode;
            return;
        }
        throw new IllegalArgumentException("Mismatching names (" + strArr.length + "), types (" + javaTypeArr.length + ")");
    }

    public static TypeBindings create(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = f10672c;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return create(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return create(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                strArr[i11] = typeParameters[i11].getName();
            }
        } else {
            strArr = f10671b;
        }
        if (strArr.length != javaTypeArr.length) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create TypeBindings for class ");
            sb2.append(cls.getName());
            sb2.append(" with ");
            sb2.append(javaTypeArr.length);
            sb2.append(" type parameter");
            sb2.append(javaTypeArr.length == 1 ? "" : CmcdData.Factory.STREAMING_FORMAT_SS);
            sb2.append(": class expects ");
            sb2.append(strArr.length);
            throw new IllegalArgumentException(sb2.toString());
        }
        return new TypeBindings(strArr, javaTypeArr, null);
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && typeParameters.length != 0) {
            if (javaTypeArr == null) {
                javaTypeArr = f10672c;
            }
            int length = typeParameters.length;
            String[] strArr = new String[length];
            for (int i11 = 0; i11 < length; i11++) {
                strArr[i11] = typeParameters[i11].getName();
            }
            if (length != javaTypeArr.length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot create TypeBindings for class ");
                sb2.append(cls.getName());
                sb2.append(" with ");
                sb2.append(javaTypeArr.length);
                sb2.append(" type parameter");
                sb2.append(javaTypeArr.length == 1 ? "" : CmcdData.Factory.STREAMING_FORMAT_SS);
                sb2.append(": class expects ");
                sb2.append(length);
                throw new IllegalArgumentException(sb2.toString());
            }
            return new TypeBindings(strArr, javaTypeArr, null);
        }
        return f10673d;
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType) {
        TypeVariable<?>[] typeVariableArrM11848a = C6477b.m11848a(cls);
        int length = typeVariableArrM11848a == null ? 0 : typeVariableArrM11848a.length;
        if (length == 1) {
            return new TypeBindings(new String[]{typeVariableArrM11848a[0].getName()}, new JavaType[]{javaType}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeVariable<?>[] typeVariableArrM11849b = C6477b.m11849b(cls);
        int length = typeVariableArrM11849b == null ? 0 : typeVariableArrM11849b.length;
        if (length == 2) {
            return new TypeBindings(new String[]{typeVariableArrM11849b[0].getName(), typeVariableArrM11849b[1].getName()}, new JavaType[]{javaType, javaType2}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
    }

    public static TypeBindings create(List<String> list, List<JavaType> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            return new TypeBindings((String[]) list.toArray(f10671b), (JavaType[]) list2.toArray(f10672c), null);
        }
        return f10673d;
    }
}
