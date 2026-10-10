package p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: utfEncoding.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nutfEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n37#2:74\n36#2,3:75\n1#3:78\n*S KotlinDebug\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n*L\n55#1:74\n55#1:75,3\n*E\n"})
public final class UtfEncodingKt {
    @NotNull
    public static final byte[] stringsToBytes(@NotNull String[] strings) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        int length = 0;
        for (String str : strings) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i11 = 0;
        for (String str2 : strings) {
            int length2 = str2.length();
            int i12 = 0;
            while (i12 < length2) {
                bArr[i11] = (byte) str2.charAt(i12);
                i12++;
                i11++;
            }
        }
        return bArr;
    }
}
