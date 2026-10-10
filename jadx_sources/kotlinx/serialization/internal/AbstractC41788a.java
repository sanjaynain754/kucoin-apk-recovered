package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.Iterator;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: kotlinx.serialization.internal.a */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007*\u00028\u0001H$¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n*\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0002H$¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0007*\u00028\u0002H$¢\u0006\u0004\b\u000f\u0010\tJ\u0013\u0010\u0010\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0012\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u0014*\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u0007H$¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010#\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00028\u00022\b\b\u0002\u0010\"\u001a\u00020!H$¢\u0006\u0004\b#\u0010$J/\u0010&\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00022\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H$¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u0002H\u0002¢\u0006\u0004\b(\u0010)\u0082\u0001\u0002*+¨\u0006,"}, m90084d2 = {"Lkotlinx/serialization/internal/a;", "Element", "Collection", "Builder", "Ltg0/d;", "<init>", "()V", "", "e", "(Ljava/lang/Object;)I", "", "d", "(Ljava/lang/Object;)Ljava/util/Iterator;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/Object;", "b", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "size", "", "c", "(Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/b;", "decoder", "previous", "f", "(Lkotlinx/serialization/encoding/b;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "index", "builder", "", "checkIndex", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/lang/Object;Z)V", SpellCheckPlugin.START_INDEX_KEY, "g", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;II)V", "j", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;)I", "Lkotlinx/serialization/internal/w;", "Lkotlinx/serialization/internal/k1;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class AbstractC41788a<Element, Collection, Builder> implements InterfaceC44951d<Collection> {
    public /* synthetic */ AbstractC41788a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract Builder mo91423a();

    /* JADX INFO: renamed from: b */
    public abstract int mo91424b(Builder builder);

    /* JADX INFO: renamed from: c */
    public abstract void mo91425c(Builder builder, int i11);

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract Iterator<Element> mo91426d(Collection collection);

    /* JADX INFO: renamed from: e */
    public abstract int mo91427e(Collection collection);

    /* JADX INFO: renamed from: g */
    public abstract void mo91429g(@NotNull CompositeDecoder decoder, Builder builder, int startIndex, int size);

    /* JADX INFO: renamed from: h */
    public abstract void mo91430h(@NotNull CompositeDecoder decoder, int index, Builder builder, boolean checkIndex);

    /* JADX INFO: renamed from: k */
    public abstract Builder mo91432k(Collection collection);

    /* JADX INFO: renamed from: l */
    public abstract Collection mo91433l(Builder builder);

    public AbstractC41788a() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m91422i(AbstractC41788a abstractC41788a, CompositeDecoder compositeDecoder, int i11, Object obj, boolean z11, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        abstractC41788a.mo91430h(compositeDecoder, i11, obj, z11);
    }

    @Override // tg0.InterfaceC44949c
    public Collection deserialize(@NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return m91428f(decoder, null);
    }

    /* JADX INFO: renamed from: f */
    public final Collection m91428f(@NotNull InterfaceC41787b decoder, @Nullable Collection previous) {
        Builder builderMo91423a;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (previous == null || (builderMo91423a = mo91432k(previous)) == null) {
            builderMo91423a = mo91423a();
        }
        Builder builder = builderMo91423a;
        int iMo91424b = mo91424b(builder);
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(getDescriptor());
        if (!compositeDecoderBeginStructure.decodeSequentially()) {
            while (true) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                m91422i(this, compositeDecoderBeginStructure, iMo91424b + iDecodeElementIndex, builder, false, 8, null);
            }
        } else {
            mo91429g(compositeDecoderBeginStructure, builder, iMo91424b, m91431j(compositeDecoderBeginStructure, builder));
        }
        compositeDecoderBeginStructure.endStructure(getDescriptor());
        return mo91433l(builder);
    }

    /* JADX INFO: renamed from: j */
    public final int m91431j(CompositeDecoder decoder, Builder builder) {
        int iDecodeCollectionSize = decoder.decodeCollectionSize(getDescriptor());
        mo91425c(builder, iDecodeCollectionSize);
        return iDecodeCollectionSize;
    }
}
