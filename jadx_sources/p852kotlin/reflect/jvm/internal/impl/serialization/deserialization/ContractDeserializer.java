package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;

/* JADX INFO: compiled from: ContractDeserializer.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface ContractDeserializer {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: ContractDeserializer.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final ContractDeserializer DEFAULT = new ContractDeserializer() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer$Companion$DEFAULT$1
            @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer
            public Pair deserializeContractFromFunction(ProtoBuf.Function proto, FunctionDescriptor ownerFunction, TypeTable typeTable, TypeDeserializer typeDeserializer) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                Intrinsics.checkNotNullParameter(ownerFunction, "ownerFunction");
                Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
                return null;
            }
        };

        @NotNull
        public final ContractDeserializer getDEFAULT() {
            return DEFAULT;
        }

        private Companion() {
        }
    }

    @Nullable
    Pair<CallableDescriptor.UserDataKey<?>, Object> deserializeContractFromFunction(@NotNull ProtoBuf.Function function, @NotNull FunctionDescriptor functionDescriptor, @NotNull TypeTable typeTable, @NotNull TypeDeserializer typeDeserializer);
}
