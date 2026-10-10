package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Constructor;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class ReflectJavaClass$constructors$2 extends FunctionReferenceImpl implements Function1<Constructor<?>, ReflectJavaConstructor> {
    public static final ReflectJavaClass$constructors$2 INSTANCE = new ReflectJavaClass$constructors$2();

    public ReflectJavaClass$constructors$2() {
        super(1, ReflectJavaConstructor.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final ReflectJavaConstructor invoke(Constructor<?> p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return new ReflectJavaConstructor(p11);
    }
}
