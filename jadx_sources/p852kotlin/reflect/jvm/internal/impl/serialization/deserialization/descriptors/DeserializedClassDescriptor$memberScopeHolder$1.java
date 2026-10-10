package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends FunctionReferenceImpl implements Function1<KotlinTypeRefiner, DeserializedClassDescriptor.DeserializedClassMemberScope> {
    public DeserializedClassDescriptor$memberScopeHolder$1(Object obj) {
        super(1, obj, DeserializedClassDescriptor.DeserializedClassMemberScope.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final DeserializedClassDescriptor.DeserializedClassMemberScope invoke(KotlinTypeRefiner p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return new DeserializedClassDescriptor.DeserializedClassMemberScope((DeserializedClassDescriptor) this.receiver, p11);
    }
}
