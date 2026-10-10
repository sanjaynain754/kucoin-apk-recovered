package p852kotlin.jvm.internal;

import p852kotlin.SinceKotlin;
import p852kotlin.reflect.KCallable;
import p852kotlin.reflect.KMutableProperty0;
import p852kotlin.reflect.KProperty0;

/* JADX INFO: loaded from: classes61.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements KMutableProperty0 {
    public MutablePropertyReference0() {
    }

    @SinceKotlin(version = "1.1")
    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @Override // p852kotlin.reflect.KProperty
    public KProperty0.Getter getGetter() {
        return ((KMutableProperty0) getReflected()).getGetter();
    }

    @Override // p852kotlin.reflect.KMutableProperty
    public KMutableProperty0.Setter getSetter() {
        return ((KMutableProperty0) getReflected()).getSetter();
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }

    @Override // p852kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.mutableProperty0(this);
    }

    @Override // p852kotlin.reflect.KProperty0
    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((KMutableProperty0) getReflected()).getDelegate();
    }

    @Override // p852kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }
}
