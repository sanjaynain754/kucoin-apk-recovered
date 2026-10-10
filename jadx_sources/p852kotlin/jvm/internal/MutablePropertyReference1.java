package p852kotlin.jvm.internal;

import p852kotlin.SinceKotlin;
import p852kotlin.reflect.KCallable;
import p852kotlin.reflect.KMutableProperty1;
import p852kotlin.reflect.KProperty1;

/* JADX INFO: loaded from: classes23.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements KMutableProperty1 {
    public MutablePropertyReference1() {
    }

    @SinceKotlin(version = "1.1")
    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @Override // p852kotlin.reflect.KProperty
    public KProperty1.Getter getGetter() {
        return ((KMutableProperty1) getReflected()).getGetter();
    }

    @Override // p852kotlin.reflect.KMutableProperty
    public KMutableProperty1.Setter getSetter() {
        return ((KMutableProperty1) getReflected()).getSetter();
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }

    @Override // p852kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.mutableProperty1(this);
    }

    @Override // p852kotlin.reflect.KProperty1
    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((KMutableProperty1) getReflected()).getDelegate(obj);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }
}
