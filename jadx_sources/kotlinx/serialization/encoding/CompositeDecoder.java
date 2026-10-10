package kotlinx.serialization.encoding;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44949c;
import vg0.InterfaceC45533f;
import yg0.AbstractC46494a;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u00016J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b)\u0010*JE\u0010/\u001a\u00028\u0000\"\n\b\u0000\u0010+*\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b/\u00100JG\u00101\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010+*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00018\u0000H'¢\u0006\u0004\b1\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00067"}, m90084d2 = {"Lkotlinx/serialization/encoding/CompositeDecoder;", "", "Lvg0/f;", "descriptor", "", "endStructure", "(Lvg0/f;)V", "", "decodeSequentially", "()Z", "", "decodeElementIndex", "(Lvg0/f;)I", "decodeCollectionSize", "index", "decodeBooleanElement", "(Lvg0/f;I)Z", "", "decodeByteElement", "(Lvg0/f;I)B", "", "decodeCharElement", "(Lvg0/f;I)C", "", "decodeShortElement", "(Lvg0/f;I)S", "decodeIntElement", "(Lvg0/f;I)I", "", "decodeLongElement", "(Lvg0/f;I)J", "", "decodeFloatElement", "(Lvg0/f;I)F", "", "decodeDoubleElement", "(Lvg0/f;I)D", "", "decodeStringElement", "(Lvg0/f;I)Ljava/lang/String;", "Lkotlinx/serialization/encoding/b;", "decodeInlineElement", "(Lvg0/f;I)Lkotlinx/serialization/encoding/b;", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/c;", "deserializer", "previousValue", "decodeSerializableElement", "(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;", "decodeNullableSerializableElement", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "serializersModule", "Companion", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface CompositeDecoder {

    /* JADX INFO: compiled from: Decoding.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lkotlinx/serialization/encoding/CompositeDecoder$Companion;", "", "<init>", "()V", "DECODE_DONE", "", "UNKNOWN_NAME", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public static final int DECODE_DONE = -1;
        public static final int UNKNOWN_NAME = -3;

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f91887a = new Companion();
    }

    /* JADX INFO: renamed from: kotlinx.serialization.encoding.CompositeDecoder$a */
    /* JADX INFO: compiled from: Decoding.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C41785a {
        /* JADX INFO: renamed from: b */
        public static boolean m91413b(@NotNull CompositeDecoder compositeDecoder) {
            return false;
        }

        /* JADX INFO: renamed from: a */
        public static int m91412a(@NotNull CompositeDecoder compositeDecoder, @NotNull InterfaceC45533f descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return -1;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Object m91414c(CompositeDecoder compositeDecoder, InterfaceC45533f interfaceC45533f, int i11, InterfaceC44949c interfaceC44949c, Object obj, int i12, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i12 & 8) != 0) {
                obj = null;
            }
            return compositeDecoder.decodeSerializableElement(interfaceC45533f, i11, interfaceC44949c, obj);
        }
    }

    boolean decodeBooleanElement(@NotNull InterfaceC45533f descriptor, int index);

    byte decodeByteElement(@NotNull InterfaceC45533f descriptor, int index);

    char decodeCharElement(@NotNull InterfaceC45533f descriptor, int index);

    int decodeCollectionSize(@NotNull InterfaceC45533f descriptor);

    double decodeDoubleElement(@NotNull InterfaceC45533f descriptor, int index);

    int decodeElementIndex(@NotNull InterfaceC45533f descriptor);

    float decodeFloatElement(@NotNull InterfaceC45533f descriptor, int index);

    @NotNull
    InterfaceC41787b decodeInlineElement(@NotNull InterfaceC45533f descriptor, int index);

    int decodeIntElement(@NotNull InterfaceC45533f descriptor, int index);

    long decodeLongElement(@NotNull InterfaceC45533f descriptor, int index);

    @Nullable
    <T> T decodeNullableSerializableElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull InterfaceC44949c<? extends T> deserializer, @Nullable T previousValue);

    boolean decodeSequentially();

    <T> T decodeSerializableElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull InterfaceC44949c<? extends T> deserializer, @Nullable T previousValue);

    short decodeShortElement(@NotNull InterfaceC45533f descriptor, int index);

    @NotNull
    String decodeStringElement(@NotNull InterfaceC45533f descriptor, int index);

    void endStructure(@NotNull InterfaceC45533f descriptor);

    @NotNull
    AbstractC46494a getSerializersModule();
}
