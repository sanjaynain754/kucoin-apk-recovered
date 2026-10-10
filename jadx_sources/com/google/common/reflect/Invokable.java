package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
public abstract class Invokable<T, R> implements AnnotatedElement, Member {
    private static final boolean ANNOTATED_TYPE_EXISTS = initAnnotatedTypeExists();
    private final AccessibleObject accessibleObject;
    private final Member member;

    public static class ConstructorInvokable<T> extends Invokable<T, T> {
        final Constructor<?> constructor;

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
            return false;
        }

        private boolean mayNeedHiddenThis() {
            Class<?> declaringClass = this.constructor.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return !Modifier.isStatic(enclosingMethod.getModifiers());
            }
            return (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.Invokable
        public Type[] getGenericExceptionTypes() {
            return this.constructor.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.Invokable
        public Type[] getGenericParameterTypes() {
            Type[] genericParameterTypes = this.constructor.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !mayNeedHiddenThis()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        @Override // com.google.common.reflect.Invokable
        public final Annotation[][] getParameterAnnotations() {
            return this.constructor.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.Invokable
        public final Object invokeInternal(Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            try {
                return this.constructor.newInstance(objArr);
            } catch (InstantiationException e11) {
                throw new RuntimeException(this.constructor + " failed.", e11);
            }
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
            return this.constructor.isVarArgs();
        }

        public ConstructorInvokable(Constructor<?> constructor) {
            super(constructor);
            this.constructor = constructor;
        }

        @Override // com.google.common.reflect.Invokable
        public Type getGenericReturnType() {
            Class<? super T> declaringClass = getDeclaringClass();
            TypeVariable<Class<? super T>>[] typeParameters = declaringClass.getTypeParameters();
            if (typeParameters.length > 0) {
                return Types.newParameterizedType(declaringClass, typeParameters);
            }
            return declaringClass;
        }

        @Override // com.google.common.reflect.Invokable
        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<?>>[] typeParameters2 = this.constructor.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[typeParameters.length + typeParameters2.length];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }
    }

    public static class MethodInvokable<T> extends Invokable<T, Object> {
        final Method method;

        @Override // com.google.common.reflect.Invokable
        public Type[] getGenericExceptionTypes() {
            return this.method.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.Invokable
        public Type[] getGenericParameterTypes() {
            return this.method.getGenericParameterTypes();
        }

        @Override // com.google.common.reflect.Invokable
        public Type getGenericReturnType() {
            return this.method.getGenericReturnType();
        }

        @Override // com.google.common.reflect.Invokable
        public final Annotation[][] getParameterAnnotations() {
            return this.method.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.Invokable
        public final TypeVariable<?>[] getTypeParameters() {
            return this.method.getTypeParameters();
        }

        @Override // com.google.common.reflect.Invokable
        public final Object invokeInternal(Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            return this.method.invoke(obj, objArr);
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
            return this.method.isVarArgs();
        }

        public MethodInvokable(Method method) {
            super(method);
            this.method = method;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
            if (!isFinal() && !isPrivate() && !isStatic() && !Modifier.isFinal(getDeclaringClass().getModifiers())) {
                return true;
            }
            return false;
        }
    }

    public static Invokable<?, Object> from(Method method) {
        return new MethodInvokable(method);
    }

    public abstract Type[] getGenericExceptionTypes();

    public abstract Type[] getGenericParameterTypes();

    public abstract Type getGenericReturnType();

    public abstract Annotation[][] getParameterAnnotations();

    public abstract TypeVariable<?>[] getTypeParameters();

    public abstract Object invokeInternal(Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException;

    public abstract boolean isOverridable();

    public abstract boolean isVarArgs();

    public final <R1 extends R> Invokable<T, R1> returning(Class<R1> cls) {
        return returning(TypeToken.m13664of((Class) cls));
    }

    public static <T> Invokable<T, T> from(Constructor<T> constructor) {
        return new ConstructorInvokable(constructor);
    }

    private static boolean initAnnotatedTypeExists() {
        try {
            Class.forName("java.lang.reflect.AnnotatedType");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Invokable) {
            Invokable invokable = (Invokable) obj;
            if (getOwnerType().equals(invokable.getOwnerType()) && this.member.equals(invokable.member)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.accessibleObject.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.accessibleObject.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.accessibleObject.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.member.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.member.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.member.getName();
    }

    public int hashCode() {
        return this.member.hashCode();
    }

    public final boolean isAccessible() {
        return this.accessibleObject.isAccessible();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.accessibleObject.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.member.isSynthetic();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R1 extends R> Invokable<T, R1> returning(TypeToken<R1> typeToken) {
        if (typeToken.isSupertypeOf(getReturnType())) {
            return this;
        }
        throw new IllegalArgumentException("Invokable is known to return " + getReturnType() + ", not " + typeToken);
    }

    public final void setAccessible(boolean z11) {
        this.accessibleObject.setAccessible(z11);
    }

    public String toString() {
        return this.member.toString();
    }

    public final boolean trySetAccessible() {
        try {
            this.accessibleObject.setAccessible(true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public <M extends AccessibleObject & Member> Invokable(M m11) {
        Preconditions.checkNotNull(m11);
        this.accessibleObject = m11;
        this.member = m11;
    }

    public final ImmutableList<TypeToken<? extends Throwable>> getExceptionTypes() {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type type : getGenericExceptionTypes()) {
            builder.add(TypeToken.m13665of(type));
        }
        return builder.build();
    }

    public TypeToken<T> getOwnerType() {
        return TypeToken.m13664of((Class) getDeclaringClass());
    }

    @IgnoreJRERequirement
    public final ImmutableList<Parameter> getParameters() {
        Type[] genericParameterTypes = getGenericParameterTypes();
        Annotation[][] parameterAnnotations = getParameterAnnotations();
        Object[] objArr = new Object[genericParameterTypes.length];
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i11 = 0; i11 < genericParameterTypes.length; i11++) {
            builder.add(new Parameter(this, i11, TypeToken.m13665of(genericParameterTypes[i11]), parameterAnnotations[i11], objArr[i11]));
        }
        return builder.build();
    }

    public final TypeToken<? extends R> getReturnType() {
        return (TypeToken<? extends R>) TypeToken.m13665of(getGenericReturnType());
    }

    @CanIgnoreReturnValue
    public final R invoke(T t11, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        return (R) invokeInternal(t11, (Object[]) Preconditions.checkNotNull(objArr));
    }

    public final boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    public final boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    public final boolean isNative() {
        return Modifier.isNative(getModifiers());
    }

    public final boolean isPackagePrivate() {
        if (!isPrivate() && !isPublic() && !isProtected()) {
            return true;
        }
        return false;
    }

    public final boolean isPrivate() {
        return Modifier.isPrivate(getModifiers());
    }

    public final boolean isProtected() {
        return Modifier.isProtected(getModifiers());
    }

    public final boolean isPublic() {
        return Modifier.isPublic(getModifiers());
    }

    public final boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public final boolean isSynchronized() {
        return Modifier.isSynchronized(getModifiers());
    }

    public final boolean isTransient() {
        return Modifier.isTransient(getModifiers());
    }

    public final boolean isVolatile() {
        return Modifier.isVolatile(getModifiers());
    }
}
