package com.jumio.commons.obfuscate;

import java.util.Random;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Charsets;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m90084d2 = {"Lcom/jumio/commons/obfuscate/StringDeobfuscator;", "", "<init>", "()V", "deobfuscate", "", "input", "", "seed", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStringDeobfuscator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringDeobfuscator.kt\ncom/jumio/commons/obfuscate/StringDeobfuscator\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,20:1\n13477#2,3:21\n*S KotlinDebug\n*F\n+ 1 StringDeobfuscator.kt\ncom/jumio/commons/obfuscate/StringDeobfuscator\n*L\n13#1:21,3\n*E\n"})
public final class StringDeobfuscator {

    @NotNull
    public static final StringDeobfuscator INSTANCE = new StringDeobfuscator();

    @JvmStatic
    @NotNull
    public static final String deobfuscate(@NotNull byte[] input, long seed) {
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bArr = new byte[input.length];
        new Random(seed).nextBytes(bArr);
        int length = input.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            bArr[i12] = (byte) (input[i11] ^ bArr[i12]);
            i11++;
            i12++;
        }
        return new String(bArr, Charsets.UTF_8);
    }
}
