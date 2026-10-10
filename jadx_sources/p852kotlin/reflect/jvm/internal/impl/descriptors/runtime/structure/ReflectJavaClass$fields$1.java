package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class ReflectJavaClass$fields$1 extends FunctionReferenceImpl implements Function1<Member, Boolean> {
    public static final ReflectJavaClass$fields$1 INSTANCE = new ReflectJavaClass$fields$1();

    @Override // p852kotlin.jvm.functions.Function1
    public final Boolean invoke(Member p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return Boolean.valueOf(p11.isSynthetic());
    }

    public ReflectJavaClass$fields$1() {
        super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
    }
}
