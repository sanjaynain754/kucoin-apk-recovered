package p852kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: readPackageFragment.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nreadPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 readPackageFragment.kt\norg/jetbrains/kotlin/metadata/builtins/ReadPackageFragmentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
public final class ReadPackageFragmentKt {
    @NotNull
    public static final Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> readBuiltinsPackageFragment(@NotNull InputStream inputStream) {
        ProtoBuf.PackageFragment from;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        try {
            BuiltInsBinaryVersion from2 = BuiltInsBinaryVersion.Companion.readFrom(inputStream);
            if (from2.isCompatibleWithCurrentCompilerVersion()) {
                ExtensionRegistryLite extensionRegistryLiteNewInstance = ExtensionRegistryLite.newInstance();
                BuiltInsProtoBuf.registerAllExtensions(extensionRegistryLiteNewInstance);
                from = ProtoBuf.PackageFragment.parseFrom(inputStream, extensionRegistryLiteNewInstance);
            } else {
                from = null;
            }
            Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> pairM90091to = TuplesKt.m90091to(from, from2);
            CloseableKt.closeFinally(inputStream, null);
            return pairM90091to;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(inputStream, th2);
                throw th3;
            }
        }
    }
}
