package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import p852kotlin.reflect.jvm.internal.impl.protobuf.Parser;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 */
/* JADX INFO: compiled from: DeserializedMemberScope.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1\n*L\n1#1,512:1\n*E\n"})
public final class C41429xb5e458c1 implements Function0 {
    final /* synthetic */ ByteArrayInputStream $inputStream;
    final /* synthetic */ Parser $parser;
    final /* synthetic */ DeserializedMemberScope this$0;

    public C41429xb5e458c1(Parser parser, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        this.$parser = parser;
        this.$inputStream = byteArrayInputStream;
        this.this$0 = deserializedMemberScope;
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final MessageLite invoke() {
        return (MessageLite) this.$parser.parseDelimitedFrom(this.$inputStream, this.this$0.getC().getComponents().getExtensionRegistryLite());
    }
}
