package p852kotlin.jvm.internal;

import p852kotlin.SinceKotlin;
import p852kotlin.reflect.KCallable;
import p852kotlin.reflect.KProperty0;

/* JADX INFO: loaded from: classes61.dex */
public abstract class PropertyReference0 extends PropertyReference implements KProperty0 {
    public PropertyReference0() {
    }

    @SinceKotlin(version = "1.1")
    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // p852kotlin.reflect.KProperty
    public KProperty0.Getter getGetter() {
        return ((KProperty0) getReflected()).getGetter();
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }

    @Override // p852kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.property0(this);
    }

    @Override // p852kotlin.reflect.KProperty0
    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((KProperty0) getReflected()).getDelegate();
    }

    @Override // p852kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }
}
