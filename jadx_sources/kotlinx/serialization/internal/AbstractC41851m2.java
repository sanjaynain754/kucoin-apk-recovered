package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Iterator;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.AbstractC41841k2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44951d;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: kotlinx.serialization.internal.m2 */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00028\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00028\u0001*\u00028\u0002H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013*\u00028\u0001H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00028\u0002H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00028\u0001H$¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\nH$¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0001¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00028\u00012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, m90084d2 = {"Lkotlinx/serialization/internal/m2;", "Element", "Array", "Lkotlinx/serialization/internal/k2;", "Builder", "Lkotlinx/serialization/internal/w;", "Ltg0/d;", "primitiveSerializer", "<init>", "(Ltg0/d;)V", "", "p", "(Lkotlinx/serialization/internal/k2;)I", "t", "(Lkotlinx/serialization/internal/k2;)Ljava/lang/Object;", "size", "", "q", "(Lkotlinx/serialization/internal/k2;I)V", "", "d", "(Ljava/lang/Object;)Ljava/util/Iterator;", "index", "element", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lkotlinx/serialization/internal/k2;ILjava/lang/Object;)V", "o", "()Lkotlinx/serialization/internal/k2;", "r", "()Ljava/lang/Object;", "Lwg0/b;", "encoder", "content", "u", "(Lwg0/b;Ljava/lang/Object;I)V", "Lwg0/c;", "value", "serialize", "(Lwg0/c;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;", "Lvg0/f;", "b", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n*L\n1#1,283:1\n488#2,4:284\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n*L\n174#1:284,4\n*E\n"})
public abstract class AbstractC41851m2<Element, Array, Builder extends AbstractC41841k2<Array>> extends AbstractC41894w<Element, Array, Builder> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f descriptor;

    /* JADX INFO: renamed from: r */
    public abstract Array mo91488r();

    /* JADX INFO: renamed from: u */
    public abstract void mo91489u(@NotNull InterfaceC45829b encoder, Array content, int size);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC41851m2(@NotNull InterfaceC44951d<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.descriptor = new C41846l2(primitiveSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: d */
    public final Iterator<Element> mo91426d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a, tg0.InterfaceC44949c
    public final Array deserialize(@NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return m91428f(decoder, null);
    }

    @Override // kotlinx.serialization.internal.AbstractC41894w, tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public final InterfaceC45533f getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int mo91424b(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return builder.getPosition();
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void mo91425c(@NotNull Builder builder, int i11) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.mo91435b(i11);
    }

    @Override // kotlinx.serialization.internal.AbstractC41894w
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void mo91507n(@NotNull Builder builder, int i11, Element element) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // kotlinx.serialization.internal.AbstractC41894w, tg0.InterfaceC44963p
    public final void serialize(@NotNull InterfaceC45830c encoder, Array value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iMo91427e = mo91427e(value);
        InterfaceC45533f interfaceC45533f = this.descriptor;
        InterfaceC45829b interfaceC45829bBeginCollection = encoder.beginCollection(interfaceC45533f, iMo91427e);
        mo91489u(interfaceC45829bBeginCollection, value, iMo91427e);
        interfaceC45829bBeginCollection.endStructure(interfaceC45533f);
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Array mo91433l(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return (Array) builder.mo91434a();
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Builder mo91423a() {
        return mo91432k(mo91488r());
    }
}
