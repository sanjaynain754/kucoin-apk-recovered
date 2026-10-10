package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class ReflectJavaClass$fields$2 extends FunctionReferenceImpl implements Function1<Field, ReflectJavaField> {
    public static final ReflectJavaClass$fields$2 INSTANCE = new ReflectJavaClass$fields$2();

    public ReflectJavaClass$fields$2() {
        super(1, ReflectJavaField.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final ReflectJavaField invoke(Field p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return new ReflectJavaField(p11);
    }
}
