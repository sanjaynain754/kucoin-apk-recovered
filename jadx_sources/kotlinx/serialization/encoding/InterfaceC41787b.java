package kotlinx.serialization.encoding;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44949c;
import vg0.InterfaceC45533f;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: kotlinx.serialization.encoding.b */
/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020!H&¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020!H&¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\u00028\u0000\"\n\b\u0000\u0010+*\u0004\u0018\u00010\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, m90084d2 = {"Lkotlinx/serialization/encoding/b;", "", "", "decodeNotNullMark", "()Z", "", "decodeNull", "()Ljava/lang/Void;", "decodeBoolean", "", "decodeByte", "()B", "", "decodeShort", "()S", "", "decodeChar", "()C", "", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeFloat", "()F", "", "decodeDouble", "()D", "", "decodeString", "()Ljava/lang/String;", "Lvg0/f;", "enumDescriptor", "decodeEnum", "(Lvg0/f;)I", "descriptor", "decodeInline", "(Lvg0/f;)Lkotlinx/serialization/encoding/b;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lvg0/f;)Lkotlinx/serialization/encoding/CompositeDecoder;", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/c;", "deserializer", "decodeSerializableValue", "(Ltg0/c;)Ljava/lang/Object;", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "serializersModule", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC41787b {

    /* JADX INFO: renamed from: kotlinx.serialization.encoding.b$a */
    /* JADX INFO: compiled from: Decoding.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDecoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Decoding.kt\nkotlinx/serialization/encoding/Decoder$DefaultImpls\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,575:1\n270#2,2:576\n*S KotlinDebug\n*F\n+ 1 Decoding.kt\nkotlinx/serialization/encoding/Decoder$DefaultImpls\n*L\n263#1:576,2\n*E\n"})
    public static final class a {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static <T> T m91415a(@NotNull InterfaceC41787b interfaceC41787b, @NotNull InterfaceC44949c<? extends T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return (deserializer.getDescriptor().mo91523b() || interfaceC41787b.decodeNotNullMark()) ? (T) interfaceC41787b.decodeSerializableValue(deserializer) : (T) interfaceC41787b.decodeNull();
        }

        /* JADX INFO: renamed from: b */
        public static <T> T m91416b(@NotNull InterfaceC41787b interfaceC41787b, @NotNull InterfaceC44949c<? extends T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return deserializer.deserialize(interfaceC41787b);
        }
    }

    @NotNull
    CompositeDecoder beginStructure(@NotNull InterfaceC45533f descriptor);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(@NotNull InterfaceC45533f enumDescriptor);

    float decodeFloat();

    @NotNull
    InterfaceC41787b decodeInline(@NotNull InterfaceC45533f descriptor);

    int decodeInt();

    long decodeLong();

    boolean decodeNotNullMark();

    @Nullable
    Void decodeNull();

    <T> T decodeSerializableValue(@NotNull InterfaceC44949c<? extends T> deserializer);

    short decodeShort();

    @NotNull
    String decodeString();

    @NotNull
    AbstractC46494a getSerializersModule();
}
