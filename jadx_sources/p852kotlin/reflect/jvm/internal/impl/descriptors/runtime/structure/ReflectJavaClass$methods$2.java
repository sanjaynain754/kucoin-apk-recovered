package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class ReflectJavaClass$methods$2 extends FunctionReferenceImpl implements Function1<Method, ReflectJavaMethod> {
    public static final ReflectJavaClass$methods$2 INSTANCE = new ReflectJavaClass$methods$2();

    public ReflectJavaClass$methods$2() {
        super(1, ReflectJavaMethod.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final ReflectJavaMethod invoke(Method p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return new ReflectJavaMethod(p11);
    }
}
