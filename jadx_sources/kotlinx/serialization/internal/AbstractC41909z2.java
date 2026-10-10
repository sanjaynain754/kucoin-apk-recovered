package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44949c;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.z2 */
/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b.\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00028\u0000*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH$¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\rH\u0014¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010/\u001a\u00020\rH\u0014¢\u0006\u0004\b0\u00101J3\u00106\u001a\u00028\u0001\"\n\b\u0001\u00102*\u0004\u0018\u00010\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00032\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0012¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u0015¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u0018¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u000e¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\u001d¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020 ¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020#¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020&¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020)¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\r¢\u0006\u0004\bP\u0010QJ\u001d\u0010R\u001a\u00020\u00122\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bR\u0010SJ\u001d\u0010T\u001a\u00020\u00152\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bT\u0010UJ\u001d\u0010V\u001a\u00020\u00182\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bV\u0010WJ\u001d\u0010X\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bZ\u0010[J\u001d\u0010\\\u001a\u00020 2\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\\\u0010]J\u001d\u0010^\u001a\u00020#2\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b^\u0010_J\u001d\u0010`\u001a\u00020&2\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020)2\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bb\u0010cJ\u001d\u0010d\u001a\u00020\u00032\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bd\u0010eJA\u0010f\u001a\u00028\u0001\"\n\b\u0001\u00102*\u0004\u0018\u00010\u00012\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bf\u0010gJC\u0010h\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u00102*\u00020\u00012\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bh\u0010gJ\u0017\u0010k\u001a\u00020j2\u0006\u0010i\u001a\u00028\u0000H\u0004¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00028\u0000H\u0004¢\u0006\u0004\bm\u0010nR*\u0010u\u001a\u0012\u0012\u0004\u0012\u00028\u00000oj\b\u0012\u0004\u0012\u00028\u0000`p8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0016\u0010x\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010z\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\by\u0010n¨\u0006{"}, m90084d2 = {"Lkotlinx/serialization/internal/z2;", "", "Tag", "Lkotlinx/serialization/encoding/b;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "<init>", "()V", ExifInterface.LONGITUDE_EAST, "tag", "Lkotlin/Function0;", "block", "x", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lvg0/f;", "", "index", "t", "(Lvg0/f;I)Ljava/lang/Object;", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/Object;)Z", "", "i", "(Ljava/lang/Object;)B", "", "q", "(Ljava/lang/Object;)S", "o", "(Ljava/lang/Object;)I", "", "p", "(Ljava/lang/Object;)J", "", "m", "(Ljava/lang/Object;)F", "", "k", "(Ljava/lang/Object;)D", "", "j", "(Ljava/lang/Object;)C", "", "r", "(Ljava/lang/Object;)Ljava/lang/String;", "enumDescriptor", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/Object;Lvg0/f;)I", "inlineDescriptor", "n", "(Ljava/lang/Object;Lvg0/f;)Lkotlinx/serialization/encoding/b;", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/c;", "deserializer", "previousValue", "g", "(Ltg0/c;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "decodeInline", "(Lvg0/f;)Lkotlinx/serialization/encoding/b;", "", "decodeNull", "()Ljava/lang/Void;", "decodeBoolean", "()Z", "decodeByte", "()B", "decodeShort", "()S", "decodeInt", "()I", "decodeLong", "()J", "decodeFloat", "()F", "decodeDouble", "()D", "decodeChar", "()C", "decodeString", "()Ljava/lang/String;", "decodeEnum", "(Lvg0/f;)I", "decodeBooleanElement", "(Lvg0/f;I)Z", "decodeByteElement", "(Lvg0/f;I)B", "decodeShortElement", "(Lvg0/f;I)S", "decodeIntElement", "(Lvg0/f;I)I", "decodeLongElement", "(Lvg0/f;I)J", "decodeFloatElement", "(Lvg0/f;I)F", "decodeDoubleElement", "(Lvg0/f;I)D", "decodeCharElement", "(Lvg0/f;I)C", "decodeStringElement", "(Lvg0/f;I)Ljava/lang/String;", "decodeInlineElement", "(Lvg0/f;I)Lkotlinx/serialization/encoding/b;", "decodeSerializableElement", "(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;", "decodeNullableSerializableElement", "name", "", "w", "(Ljava/lang/Object;)V", "v", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/ArrayList;", "u", "()Ljava/util/ArrayList;", "tagStack", "b", "Z", "flag", CmcdData.Factory.STREAMING_FORMAT_SS, "currentTagOrNull", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,342:1\n1#2:343\n270#3,2:344\n*S KotlinDebug\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedDecoder\n*L\n287#1:344,2\n*E\n"})
public abstract class AbstractC41909z2<Tag> implements InterfaceC41787b, CompositeDecoder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<Tag> tagStack = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean flag;

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    @Nullable
    public final Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public abstract <T> T decodeSerializableValue(@NotNull InterfaceC44949c<? extends T> interfaceC44949c);

    /* JADX INFO: renamed from: h */
    public abstract boolean mo91759h(Tag tag);

    /* JADX INFO: renamed from: i */
    public abstract byte mo91760i(Tag tag);

    /* JADX INFO: renamed from: j */
    public abstract char mo91761j(Tag tag);

    /* JADX INFO: renamed from: k */
    public abstract double mo91762k(Tag tag);

    /* JADX INFO: renamed from: l */
    public abstract int mo91763l(Tag tag, @NotNull InterfaceC45533f enumDescriptor);

    /* JADX INFO: renamed from: m */
    public abstract float mo91764m(Tag tag);

    /* JADX INFO: renamed from: o */
    public abstract int mo91766o(Tag tag);

    /* JADX INFO: renamed from: p */
    public abstract long mo91767p(Tag tag);

    /* JADX INFO: renamed from: q */
    public abstract short mo91768q(Tag tag);

    @NotNull
    /* JADX INFO: renamed from: r */
    public abstract String mo91769r(Tag tag);

    /* JADX INFO: renamed from: t */
    public abstract Tag mo91651t(@NotNull InterfaceC45533f interfaceC45533f, int i11);

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean decodeBooleanElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo91759h(mo91651t(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final byte decodeByteElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo91760i(mo91651t(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final char decodeCharElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo91761j(mo91651t(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final double decodeDoubleElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo91762k(mo91651t(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public final int decodeEnum(@NotNull InterfaceC45533f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return mo91763l(m91772v(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final float decodeFloatElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo91764m(mo91651t(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    @NotNull
    public InterfaceC41787b decodeInline(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo91765n(m91772v(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public final InterfaceC41787b decodeInlineElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo91765n(mo91651t(descriptor, index), descriptor.mo91525d(index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeIntElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo91766o(mo91651t(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final long decodeLongElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo91767p(mo91651t(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    @Nullable
    public final <T> T decodeNullableSerializableElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull final InterfaceC44949c<? extends T> deserializer, @Nullable final T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) m91774x(mo91651t(descriptor, index), new Function0() { // from class: kotlinx.serialization.internal.y2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC41909z2.m91756e(this.f92063b, deserializer, previousValue);
            }
        });
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final <T> T decodeSerializableElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull final InterfaceC44949c<? extends T> deserializer, @Nullable final T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) m91774x(mo91651t(descriptor, index), new Function0() { // from class: kotlinx.serialization.internal.x2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC41909z2.m91757f(this.f92055b, deserializer, previousValue);
            }
        });
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final short decodeShortElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo91768q(mo91651t(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public final String decodeStringElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo91769r(mo91651t(descriptor, index));
    }

    /* JADX INFO: renamed from: g */
    public <T> T m91758g(@NotNull InterfaceC44949c<? extends T> deserializer, @Nullable T previousValue) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public InterfaceC41787b mo91765n(Tag tag, @NotNull InterfaceC45533f inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        m91773w(tag);
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final Tag m91770s() {
        return (Tag) CollectionsKt.lastOrNull((List) this.tagStack);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ArrayList<Tag> m91771u() {
        return this.tagStack;
    }

    /* JADX INFO: renamed from: v */
    public final Tag m91772v() {
        ArrayList<Tag> arrayList = this.tagStack;
        Tag tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.flag = true;
        return tagRemove;
    }

    /* JADX INFO: renamed from: w */
    public final void m91773w(Tag name) {
        this.tagStack.add(name);
    }

    /* JADX INFO: renamed from: e */
    public static final Object m91756e(AbstractC41909z2 abstractC41909z2, InterfaceC44949c interfaceC44949c, Object obj) {
        if (!interfaceC44949c.getDescriptor().mo91523b() && !abstractC41909z2.decodeNotNullMark()) {
            return abstractC41909z2.decodeNull();
        }
        return abstractC41909z2.m91758g(interfaceC44949c, obj);
    }

    /* JADX INFO: renamed from: f */
    public static final Object m91757f(AbstractC41909z2 abstractC41909z2, InterfaceC44949c interfaceC44949c, Object obj) {
        return abstractC41909z2.m91758g(interfaceC44949c, obj);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public final boolean decodeBoolean() {
        return mo91759h(m91772v());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public final byte decodeByte() {
        return mo91760i(m91772v());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public final char decodeChar() {
        return mo91761j(m91772v());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeCollectionSize(@NotNull InterfaceC45533f interfaceC45533f) {
        return CompositeDecoder.C41785a.m91412a(this, interfaceC45533f);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public final double decodeDouble() {
        return mo91762k(m91772v());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public final float decodeFloat() {
        return mo91764m(m91772v());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public final int decodeInt() {
        return mo91766o(m91772v());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public final long decodeLong() {
        return mo91767p(m91772v());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public boolean decodeSequentially() {
        return CompositeDecoder.C41785a.m91413b(this);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public final short decodeShort() {
        return mo91768q(m91772v());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    @NotNull
    public final String decodeString() {
        return mo91769r(m91772v());
    }

    /* JADX INFO: renamed from: x */
    public final <E> E m91774x(Tag tag, Function0<? extends E> block) {
        m91773w(tag);
        E eInvoke = block.invoke();
        if (!this.flag) {
            m91772v();
        }
        this.flag = false;
        return eInvoke;
    }
}
