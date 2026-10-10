package p422l5;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: l5.c */
/* JADX INFO: compiled from: ImageFormatCheckerUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Ll5/c;", "", "<init>", "()V", "", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)[B", "byteArray", "pattern", "", "c", "([B[B)Z", "", TypedValues.CycleType.S_WAVE_OFFSET, "b", "([B[BI)Z", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImageFormatCheckerUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageFormatCheckerUtils.kt\ncom/facebook/imageformat/ImageFormatCheckerUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n2632#2,3:109\n*S KotlinDebug\n*F\n+ 1 ImageFormatCheckerUtils.kt\ncom/facebook/imageformat/ImageFormatCheckerUtils\n*L\n57#1:109,3\n*E\n"})
public final class C42056c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42056c f92353a = new C42056c();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m92263b(@NotNull byte[] byteArray, @NotNull byte[] pattern, int offset) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (pattern.length + offset > byteArray.length) {
            return false;
        }
        Iterable indices = ArraysKt.getIndices(pattern);
        if ((indices instanceof Collection) && ((Collection) indices).isEmpty()) {
            return true;
        }
        Iterator it = indices.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (byteArray[offset + iNextInt] != pattern[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m92264c(@NotNull byte[] byteArray, @NotNull byte[] pattern) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return m92263b(byteArray, pattern, 0);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final byte[] m92262a(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Charset charsetForName = Charset.forName("ASCII");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            byte[] bytes = value.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("ASCII not found!", e11);
        }
    }
}
