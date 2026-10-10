package wg0;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44963p;
import vg0.InterfaceC45533f;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: wg0.c */
/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0013H&¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\"H&¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\"H&¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020*2\u0006\u0010'\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b.\u0010/J1\u00103\u001a\u00020\u0002\"\n\b\u0000\u00100*\u0004\u0018\u00010\u00012\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000012\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u00104R\u0014\u00108\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, m90084d2 = {"Lwg0/c;", "", "", "encodeNotNullMark", "()V", "encodeNull", "", "value", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "", "encodeChar", "(C)V", "", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeString", "(Ljava/lang/String;)V", "Lvg0/f;", "enumDescriptor", "index", "encodeEnum", "(Lvg0/f;I)V", "descriptor", "encodeInline", "(Lvg0/f;)Lwg0/c;", "Lwg0/b;", "beginStructure", "(Lvg0/f;)Lwg0/b;", "collectionSize", "beginCollection", "(Lvg0/f;I)Lwg0/b;", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/p;", "serializer", "encodeSerializableValue", "(Ltg0/p;Ljava/lang/Object;)V", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "serializersModule", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC45830c {

    /* JADX INFO: renamed from: wg0.c$a */
    /* JADX INFO: compiled from: Encoding.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a {
        @NotNull
        /* JADX INFO: renamed from: a */
        public static InterfaceC45829b m101244a(@NotNull InterfaceC45830c interfaceC45830c, @NotNull InterfaceC45533f descriptor, int i11) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return interfaceC45830c.beginStructure(descriptor);
        }

        /* JADX INFO: renamed from: c */
        public static <T> void m101246c(@NotNull InterfaceC45830c interfaceC45830c, @NotNull InterfaceC44963p<? super T> serializer, @Nullable T t11) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            if (serializer.getDescriptor().mo91523b()) {
                interfaceC45830c.encodeSerializableValue(serializer, t11);
            } else if (t11 == null) {
                interfaceC45830c.encodeNull();
            } else {
                interfaceC45830c.encodeNotNullMark();
                interfaceC45830c.encodeSerializableValue(serializer, t11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d */
        public static <T> void m101247d(@NotNull InterfaceC45830c interfaceC45830c, @NotNull InterfaceC44963p<? super T> serializer, T t11) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            serializer.serialize(interfaceC45830c, t11);
        }

        /* JADX INFO: renamed from: b */
        public static void m101245b(@NotNull InterfaceC45830c interfaceC45830c) {
        }
    }

    @NotNull
    InterfaceC45829b beginCollection(@NotNull InterfaceC45533f descriptor, int collectionSize);

    @NotNull
    InterfaceC45829b beginStructure(@NotNull InterfaceC45533f descriptor);

    void encodeBoolean(boolean value);

    void encodeByte(byte value);

    void encodeChar(char value);

    void encodeDouble(double value);

    void encodeEnum(@NotNull InterfaceC45533f enumDescriptor, int index);

    void encodeFloat(float value);

    @NotNull
    InterfaceC45830c encodeInline(@NotNull InterfaceC45533f descriptor);

    void encodeInt(int value);

    void encodeLong(long value);

    void encodeNotNullMark();

    void encodeNull();

    <T> void encodeSerializableValue(@NotNull InterfaceC44963p<? super T> serializer, T value);

    void encodeShort(short value);

    void encodeString(@NotNull String value);

    @NotNull
    AbstractC46494a getSerializersModule();
}
