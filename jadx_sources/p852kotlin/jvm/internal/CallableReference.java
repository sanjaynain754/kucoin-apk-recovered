package p852kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.KotlinReflectionNotSupportedError;
import p852kotlin.reflect.KCallable;
import p852kotlin.reflect.KDeclarationContainer;
import p852kotlin.reflect.KParameter;
import p852kotlin.reflect.KType;
import p852kotlin.reflect.KTypeParameter;
import p852kotlin.reflect.KVisibility;

/* JADX INFO: loaded from: classes23.dex */
public abstract class CallableReference implements KCallable, Serializable {

    @SinceKotlin(version = "1.1")
    public static final Object NO_RECEIVER = NoReceiver.INSTANCE;

    @SinceKotlin(version = "1.4")
    private final boolean isTopLevel;

    @SinceKotlin(version = "1.4")
    private final String name;

    @SinceKotlin(version = "1.4")
    private final Class owner;

    @SinceKotlin(version = "1.1")
    protected final Object receiver;
    private transient KCallable reflected;

    @SinceKotlin(version = "1.4")
    private final String signature;

    @SinceKotlin(version = "1.2")
    public static class NoReceiver implements Serializable {
        private static final NoReceiver INSTANCE = new NoReceiver();

        private Object readResolve() throws ObjectStreamException {
            return INSTANCE;
        }

        private NoReceiver() {
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    public abstract KCallable computeReflected();

    @SinceKotlin(version = "1.1")
    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    @SinceKotlin(version = "1.1")
    public KCallable compute() {
        KCallable kCallable = this.reflected;
        if (kCallable != null) {
            return kCallable;
        }
        KCallable kCallableComputeReflected = computeReflected();
        this.reflected = kCallableComputeReflected;
        return kCallableComputeReflected;
    }

    @SinceKotlin(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // p852kotlin.reflect.KCallable
    public String getName() {
        return this.name;
    }

    public KDeclarationContainer getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? Reflection.getOrCreateKotlinPackage(cls) : Reflection.getOrCreateKotlinClass(cls);
    }

    public String getSignature() {
        return this.signature;
    }

    @SinceKotlin(version = "1.4")
    public CallableReference(Object obj, Class cls, String str, String str2, boolean z11) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z11;
    }

    @Override // p852kotlin.reflect.KCallable
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p852kotlin.reflect.KCallable
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @Override // p852kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // p852kotlin.reflect.KCallable
    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    @SinceKotlin(version = "1.1")
    public KCallable getReflected() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // p852kotlin.reflect.KCallable
    public KType getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // p852kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public List<KTypeParameter> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p852kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p852kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p852kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p852kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p852kotlin.reflect.KCallable
    @SinceKotlin(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
