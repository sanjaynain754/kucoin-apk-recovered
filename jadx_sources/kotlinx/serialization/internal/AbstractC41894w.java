package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.Iterator;
import kotlinx.serialization.encoding.CompositeDecoder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: kotlinx.serialization.internal.w */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00028\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H$¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0001\u0003%&'¨\u0006("}, m90084d2 = {"Lkotlinx/serialization/internal/w;", "Element", "Collection", "Builder", "Lkotlinx/serialization/internal/a;", "Ltg0/d;", "elementSerializer", "<init>", "(Ltg0/d;)V", "", "index", "element", "", "n", "(Ljava/lang/Object;ILjava/lang/Object;)V", "Lwg0/c;", "encoder", "value", "serialize", "(Lwg0/c;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "builder", SpellCheckPlugin.START_INDEX_KEY, "size", "g", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;II)V", "", "checkIndex", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/lang/Object;Z)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ltg0/d;", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "Lkotlinx/serialization/internal/x;", "Lkotlinx/serialization/internal/m2;", "Lkotlinx/serialization/internal/p2;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n488#2,4:284\n1#3:288\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n*L\n66#1:284,4\n*E\n"})
public abstract class AbstractC41894w<Element, Collection, Builder> extends AbstractC41788a<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44951d<Element> elementSerializer;

    public /* synthetic */ AbstractC41894w(InterfaceC44951d interfaceC44951d, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC44951d);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public abstract InterfaceC45533f getDescriptor();

    /* JADX INFO: renamed from: n */
    public abstract void mo91507n(Builder builder, int i11, Element element);

    public AbstractC41894w(InterfaceC44951d<Element> interfaceC44951d) {
        super(null);
        this.elementSerializer = interfaceC44951d;
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: g */
    public final void mo91429g(@NotNull CompositeDecoder decoder, Builder builder, int startIndex, int size) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (size < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i11 = 0; i11 < size; i11++) {
            mo91430h(decoder, startIndex + i11, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: h */
    public void mo91430h(@NotNull CompositeDecoder decoder, int index, Builder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        mo91507n(builder, index, CompositeDecoder.C41785a.m91414c(decoder, getDescriptor(), index, this.elementSerializer, null, 8, null));
    }

    @Override // tg0.InterfaceC44963p
    public void serialize(@NotNull InterfaceC45830c encoder, Collection value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iMo91427e = mo91427e(value);
        InterfaceC45533f descriptor = getDescriptor();
        InterfaceC45829b interfaceC45829bBeginCollection = encoder.beginCollection(descriptor, iMo91427e);
        Iterator<Element> itMo91426d = mo91426d(value);
        for (int i11 = 0; i11 < iMo91427e; i11++) {
            interfaceC45829bBeginCollection.encodeSerializableElement(getDescriptor(), i11, this.elementSerializer, itMo91426d.next());
        }
        interfaceC45829bBeginCollection.endStructure(descriptor);
    }
}
