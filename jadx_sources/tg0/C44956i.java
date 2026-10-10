package tg0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.AbstractC41793b;
import kotlinx.serialization.internal.C41798c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: tg0.i */
/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/internal/b;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "", "klassName", "Ltg0/c;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/serialization/internal/b;Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Ltg0/c;", "Lwg0/c;", "encoder", "value", "Ltg0/p;", "b", "(Lkotlinx/serialization/internal/b;Lwg0/c;Ljava/lang/Object;)Ltg0/p;", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C44956i {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC44949c<T> m99414a(@NotNull AbstractC41793b<T> abstractC41793b, @NotNull CompositeDecoder decoder, @Nullable String str) {
        Intrinsics.checkNotNullParameter(abstractC41793b, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC44949c<T> interfaceC44949cMo91485c = abstractC41793b.mo91485c(decoder, str);
        if (interfaceC44949cMo91485c != null) {
            return interfaceC44949cMo91485c;
        }
        C41798c.m91503a(str, abstractC41793b.mo91487e());
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC44963p<T> m99415b(@NotNull AbstractC41793b<T> abstractC41793b, @NotNull InterfaceC45830c encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(abstractC41793b, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC44963p<T> interfaceC44963pMo91486d = abstractC41793b.mo91486d(encoder, value);
        if (interfaceC44963pMo91486d != null) {
            return interfaceC44963pMo91486d;
        }
        C41798c.m91504b(Reflection.getOrCreateKotlinClass(value.getClass()), abstractC41793b.mo91487e());
        throw new KotlinNothingValueException();
    }
}
