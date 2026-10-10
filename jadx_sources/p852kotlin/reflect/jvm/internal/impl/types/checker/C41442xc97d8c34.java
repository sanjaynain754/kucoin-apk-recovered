package p852kotlin.reflect.jvm.internal.impl.types.checker;

import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1 */
/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C41442xc97d8c34 extends FunctionReferenceImpl implements Function2<KotlinType, KotlinType, Boolean> {
    @Override // p852kotlin.jvm.functions.Function2
    public final Boolean invoke(KotlinType p11, KotlinType p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return Boolean.valueOf(((NewKotlinTypeCheckerImpl) this.receiver).equalTypes(p11, p12));
    }

    public C41442xc97d8c34(Object obj) {
        super(2, obj, NewKotlinTypeCheckerImpl.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
    }
}
