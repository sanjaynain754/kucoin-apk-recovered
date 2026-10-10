package p852kotlin.jvm.internal;

import p852kotlin.SinceKotlin;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes61.dex */
public class PropertyReference2Impl extends PropertyReference2 {
    public PropertyReference2Impl(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // p852kotlin.reflect.KProperty2
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference2Impl(Class cls, String str, String str2, int i11) {
        super(cls, str, str2, i11);
    }
}
