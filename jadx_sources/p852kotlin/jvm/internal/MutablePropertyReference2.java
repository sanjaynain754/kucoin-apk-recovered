package p852kotlin.jvm.internal;

import p852kotlin.SinceKotlin;
import p852kotlin.reflect.KCallable;
import p852kotlin.reflect.KMutableProperty2;
import p852kotlin.reflect.KProperty2;

/* JADX INFO: loaded from: classes61.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements KMutableProperty2 {
    public MutablePropertyReference2() {
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference2(Class cls, String str, String str2, int i11) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i11);
    }

    @Override // p852kotlin.reflect.KProperty
    public KProperty2.Getter getGetter() {
        return ((KMutableProperty2) getReflected()).getGetter();
    }

    @Override // p852kotlin.reflect.KMutableProperty
    public KMutableProperty2.Setter getSetter() {
        return ((KMutableProperty2) getReflected()).getSetter();
    }

    @Override // p852kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.mutableProperty2(this);
    }

    @Override // p852kotlin.reflect.KProperty2
    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((KMutableProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }
}
