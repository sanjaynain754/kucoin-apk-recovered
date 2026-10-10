package p852kotlin.jvm.internal;

import p852kotlin.SinceKotlin;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes23.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i11) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i11);
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }
}
