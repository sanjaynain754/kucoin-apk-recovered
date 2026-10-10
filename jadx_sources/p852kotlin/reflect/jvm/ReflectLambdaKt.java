package p852kotlin.reflect.jvm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KFunction;
import p852kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import p852kotlin.reflect.jvm.internal.KFunctionImpl;
import p852kotlin.reflect.jvm.internal.UtilKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;

/* JADX INFO: compiled from: reflectLambda.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¨\u0006\u0004"}, m90084d2 = {"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflection"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nreflectLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 reflectLambda.kt\nkotlin/reflect/jvm/ReflectLambdaKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public final class ReflectLambdaKt {
    @ExperimentalReflectionOnLambdas
    @Nullable
    public static final <R> KFunction<R> reflect(@NotNull Function<? extends R> function) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        Metadata metadata = (Metadata) function.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrM90083d1 = metadata.m90083d1();
        if (strArrM90083d1.length == 0) {
            strArrM90083d1 = null;
        }
        if (strArrM90083d1 == null) {
            return null;
        }
        Pair<JvmNameResolver, ProtoBuf.Function> functionDataFrom = JvmProtoBufUtil.readFunctionDataFrom(strArrM90083d1, metadata.m90084d2());
        JvmNameResolver jvmNameResolverComponent1 = functionDataFrom.component1();
        ProtoBuf.Function functionComponent2 = functionDataFrom.component2();
        MetadataVersion metadataVersion = new MetadataVersion(metadata.m90086mv(), (metadata.m90088xi() & 8) != 0);
        Class<?> cls = function.getClass();
        ProtoBuf.TypeTable typeTable = functionComponent2.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
        return new KFunctionImpl(EmptyContainerForLocal.INSTANCE, (SimpleFunctionDescriptor) UtilKt.deserializeToDescriptor(cls, functionComponent2, jvmNameResolverComponent1, new TypeTable(typeTable), metadataVersion, ReflectLambdaKt$reflect$descriptor$1.INSTANCE));
    }
}
