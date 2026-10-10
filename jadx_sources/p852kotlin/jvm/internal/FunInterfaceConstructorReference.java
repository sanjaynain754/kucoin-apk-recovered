package p852kotlin.jvm.internal;

import java.io.Serializable;
import p852kotlin.SinceKotlin;
import p852kotlin.reflect.KFunction;

/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.7")
public class FunInterfaceConstructorReference extends FunctionReference implements Serializable {
    private final Class funInterface;

    public FunInterfaceConstructorReference(Class cls) {
        super(1);
        this.funInterface = cls;
    }

    @Override // p852kotlin.jvm.internal.FunctionReference
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FunInterfaceConstructorReference) {
            return this.funInterface.equals(((FunInterfaceConstructorReference) obj).funInterface);
        }
        return false;
    }

    @Override // p852kotlin.jvm.internal.FunctionReference, p852kotlin.jvm.internal.CallableReference
    public KFunction getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }

    @Override // p852kotlin.jvm.internal.FunctionReference
    public int hashCode() {
        return this.funInterface.hashCode();
    }

    @Override // p852kotlin.jvm.internal.FunctionReference
    public String toString() {
        return "fun interface " + this.funInterface.getName();
    }
}
