package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44963p;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: kotlinx.serialization.internal.a3 */
/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00028\u0000*\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\tH\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0007H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0018¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u001e¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020!¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020&¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020)¢\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0007H\u0014¢\u0006\u0004\bL\u0010KJ%\u0010M\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\bM\u0010NJ%\u0010O\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0015¢\u0006\u0004\bO\u0010PJ%\u0010Q\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0018¢\u0006\u0004\bQ\u0010RJ%\u0010S\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\bS\u0010TJ%\u0010U\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\bU\u0010VJ%\u0010W\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001e¢\u0006\u0004\bW\u0010XJ%\u0010Y\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020!¢\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020&¢\u0006\u0004\b[\u0010\\J%\u0010]\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020)¢\u0006\u0004\b]\u0010^J\u001d\u0010_\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b_\u0010`JA\u0010d\u001a\u00020\u0012\"\n\b\u0001\u0010a*\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00010b2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\bd\u0010eJA\u0010f\u001a\u00020\u0012\"\b\b\u0001\u0010a*\u00020\u00012\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00010b2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\bf\u0010eJ\u0017\u0010h\u001a\u00020\u00122\u0006\u0010g\u001a\u00028\u0000H\u0004¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00028\u0000H\u0004¢\u0006\u0004\bj\u0010kR$\u0010p\u001a\u0012\u0012\u0004\u0012\u00028\u00000lj\b\u0012\u0004\u0012\u00028\u0000`m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010r\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bq\u0010kR\u0016\u0010t\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bs\u0010k¨\u0006u"}, m90084d2 = {"Lkotlinx/serialization/internal/a3;", "", "Tag", "Lwg0/c;", "Lwg0/b;", "<init>", "()V", "Lvg0/f;", "desc", "", "index", "", "c", "(Lvg0/f;I)Z", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lvg0/f;I)Ljava/lang/Object;", "tag", "value", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/Object;I)V", "", "f", "(Ljava/lang/Object;B)V", "", "n", "(Ljava/lang/Object;S)V", "", "m", "(Ljava/lang/Object;J)V", "", "j", "(Ljava/lang/Object;F)V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/Object;D)V", "e", "(Ljava/lang/Object;Z)V", "", "g", "(Ljava/lang/Object;C)V", "", "o", "(Ljava/lang/Object;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "i", "(Ljava/lang/Object;Lvg0/f;I)V", "inlineDescriptor", "k", "(Ljava/lang/Object;Lvg0/f;)Lwg0/c;", "descriptor", "encodeInline", "(Lvg0/f;)Lwg0/c;", "encodeBoolean", "(Z)V", "encodeByte", "(B)V", "encodeShort", "(S)V", "encodeInt", "(I)V", "encodeLong", "(J)V", "encodeFloat", "(F)V", "encodeDouble", "(D)V", "encodeChar", "(C)V", "encodeString", "(Ljava/lang/String;)V", "encodeEnum", "(Lvg0/f;I)V", "endStructure", "(Lvg0/f;)V", "p", "encodeBooleanElement", "(Lvg0/f;IZ)V", "encodeByteElement", "(Lvg0/f;IB)V", "encodeShortElement", "(Lvg0/f;IS)V", "encodeIntElement", "(Lvg0/f;II)V", "encodeLongElement", "(Lvg0/f;IJ)V", "encodeFloatElement", "(Lvg0/f;IF)V", "encodeDoubleElement", "(Lvg0/f;ID)V", "encodeCharElement", "(Lvg0/f;IC)V", "encodeStringElement", "(Lvg0/f;ILjava/lang/String;)V", "encodeInlineElement", "(Lvg0/f;I)Lwg0/c;", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/p;", "serializer", "encodeSerializableElement", "(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V", "encodeNullableSerializableElement", "name", "u", "(Ljava/lang/Object;)V", "t", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/ArrayList;", "tagStack", "q", "currentTag", "r", "currentTagOrNull", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedEncoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
public abstract class AbstractC41792a3<Tag> implements InterfaceC45830c, InterfaceC45829b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<Tag> tagStack = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public abstract void mo91466e(Tag tag, boolean value);

    @Override // wg0.InterfaceC45830c
    public abstract <T> void encodeSerializableValue(@NotNull InterfaceC44963p<? super T> interfaceC44963p, T t11);

    /* JADX INFO: renamed from: f */
    public abstract void mo91467f(Tag tag, byte value);

    /* JADX INFO: renamed from: g */
    public abstract void mo91468g(Tag tag, char value);

    /* JADX INFO: renamed from: h */
    public abstract void mo91469h(Tag tag, double value);

    /* JADX INFO: renamed from: i */
    public abstract void mo91470i(Tag tag, @NotNull InterfaceC45533f enumDescriptor, int ordinal);

    /* JADX INFO: renamed from: j */
    public abstract void mo91471j(Tag tag, float value);

    /* JADX INFO: renamed from: l */
    public abstract void mo91473l(Tag tag, int value);

    /* JADX INFO: renamed from: m */
    public abstract void mo91474m(Tag tag, long value);

    /* JADX INFO: renamed from: n */
    public abstract void mo91475n(Tag tag, short value);

    /* JADX INFO: renamed from: o */
    public abstract void mo91476o(Tag tag, @NotNull String value);

    /* JADX INFO: renamed from: p */
    public abstract void mo91477p(@NotNull InterfaceC45533f descriptor);

    /* JADX INFO: renamed from: s */
    public abstract Tag mo91480s(@NotNull InterfaceC45533f interfaceC45533f, int i11);

    @Override // wg0.InterfaceC45829b
    public final void encodeBooleanElement(@NotNull InterfaceC45533f descriptor, int index, boolean value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo91466e(mo91480s(descriptor, index), value);
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeByteElement(@NotNull InterfaceC45533f descriptor, int index, byte value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo91467f(mo91480s(descriptor, index), value);
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeCharElement(@NotNull InterfaceC45533f descriptor, int index, char value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo91468g(mo91480s(descriptor, index), value);
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeDoubleElement(@NotNull InterfaceC45533f descriptor, int index, double value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo91469h(mo91480s(descriptor, index), value);
    }

    @Override // wg0.InterfaceC45830c
    public final void encodeEnum(@NotNull InterfaceC45533f enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        mo91470i(m91481t(), enumDescriptor, index);
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeFloatElement(@NotNull InterfaceC45533f descriptor, int index, float value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo91471j(mo91480s(descriptor, index), value);
    }

    @Override // wg0.InterfaceC45830c
    @NotNull
    public InterfaceC45830c encodeInline(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo91472k(m91481t(), descriptor);
    }

    @Override // wg0.InterfaceC45829b
    @NotNull
    public final InterfaceC45830c encodeInlineElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo91472k(mo91480s(descriptor, index), descriptor.mo91525d(index));
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeIntElement(@NotNull InterfaceC45533f descriptor, int index, int value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo91473l(mo91480s(descriptor, index), value);
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeLongElement(@NotNull InterfaceC45533f descriptor, int index, long value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo91474m(mo91480s(descriptor, index), value);
    }

    @Override // wg0.InterfaceC45829b
    public <T> void encodeNullableSerializableElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull InterfaceC44963p<? super T> serializer, @Nullable T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (m91464c(descriptor, index)) {
            m91465d(serializer, value);
        }
    }

    @Override // wg0.InterfaceC45829b
    public <T> void encodeSerializableElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull InterfaceC44963p<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (m91464c(descriptor, index)) {
            encodeSerializableValue(serializer, value);
        }
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeShortElement(@NotNull InterfaceC45533f descriptor, int index, short value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo91475n(mo91480s(descriptor, index), value);
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeStringElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        mo91476o(mo91480s(descriptor, index), value);
    }

    @Override // wg0.InterfaceC45829b
    public final void endStructure(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.tagStack.isEmpty()) {
            m91481t();
        }
        mo91477p(descriptor);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public InterfaceC45830c mo91472k(Tag tag, @NotNull InterfaceC45533f inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        m91482u(tag);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final Tag m91478q() {
        return (Tag) CollectionsKt.last((List) this.tagStack);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final Tag m91479r() {
        return (Tag) CollectionsKt.lastOrNull((List) this.tagStack);
    }

    /* JADX INFO: renamed from: t */
    public final Tag m91481t() {
        if (this.tagStack.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.tagStack;
        return arrayList.remove(CollectionsKt.getLastIndex(arrayList));
    }

    /* JADX INFO: renamed from: u */
    public final void m91482u(Tag name) {
        this.tagStack.add(name);
    }

    /* JADX INFO: renamed from: c */
    private final boolean m91464c(InterfaceC45533f desc, int index) {
        m91482u(mo91480s(desc, index));
        return true;
    }

    @Override // wg0.InterfaceC45830c
    @NotNull
    public InterfaceC45829b beginCollection(@NotNull InterfaceC45533f interfaceC45533f, int i11) {
        return InterfaceC45830c.a.m101244a(this, interfaceC45533f, i11);
    }

    /* JADX INFO: renamed from: d */
    public <T> void m91465d(@NotNull InterfaceC44963p<? super T> interfaceC44963p, @Nullable T t11) {
        InterfaceC45830c.a.m101246c(this, interfaceC44963p, t11);
    }

    @Override // wg0.InterfaceC45830c
    public final void encodeBoolean(boolean value) {
        mo91466e(m91481t(), value);
    }

    @Override // wg0.InterfaceC45830c
    public final void encodeByte(byte value) {
        mo91467f(m91481t(), value);
    }

    @Override // wg0.InterfaceC45830c
    public final void encodeChar(char value) {
        mo91468g(m91481t(), value);
    }

    @Override // wg0.InterfaceC45830c
    public final void encodeDouble(double value) {
        mo91469h(m91481t(), value);
    }

    @Override // wg0.InterfaceC45830c
    public final void encodeFloat(float value) {
        mo91471j(m91481t(), value);
    }

    @Override // wg0.InterfaceC45830c
    public final void encodeInt(int value) {
        mo91473l(m91481t(), value);
    }

    @Override // wg0.InterfaceC45830c
    public final void encodeLong(long value) {
        mo91474m(m91481t(), value);
    }

    @Override // wg0.InterfaceC45830c
    public final void encodeShort(short value) {
        mo91475n(m91481t(), value);
    }

    @Override // wg0.InterfaceC45830c
    public final void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        mo91476o(m91481t(), value);
    }
}
