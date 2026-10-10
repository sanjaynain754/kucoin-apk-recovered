package p852kotlin.jvm.internal;

import p852kotlin.SinceKotlin;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes61.dex */
public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    public MutablePropertyReference2Impl(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // p852kotlin.reflect.KProperty2
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @Override // p852kotlin.reflect.KMutableProperty2
    public void set(Object obj, Object obj2, Object obj3) {
        getSetter().call(obj, obj2, obj3);
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i11) {
        super(cls, str, str2, i11);
    }
}
