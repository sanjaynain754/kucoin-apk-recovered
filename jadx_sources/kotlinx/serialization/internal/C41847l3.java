package kotlinx.serialization.internal;

import kotlinx.serialization.encoding.CompositeDecoder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExperimentalUnsignedTypes;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.ULong;
import p852kotlin.ULongArray;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import wg0.InterfaceC45829b;

/* JADX INFO: renamed from: kotlinx.serialization.internal.l3 */
/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Lkotlinx/serialization/internal/l3;", "Ltg0/d;", "Lkotlin/ULongArray;", "Lkotlinx/serialization/internal/m2;", "Lkotlin/ULong;", "Lkotlinx/serialization/internal/k3;", "<init>", "()V", "", "v", "([J)I", "y", "([J)Lkotlinx/serialization/internal/k3;", "w", "()[J", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "", "x", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/k3;Z)V", "Lwg0/b;", "encoder", "content", "size", "z", "(Lwg0/b;[JI)V", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
@ExperimentalUnsignedTypes
public final class C41847l3 extends AbstractC41851m2<ULong, ULongArray, C41842k3> implements InterfaceC44951d<ULongArray> {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C41847l3 f91985c = new C41847l3();

    @NotNull
    /* JADX INFO: renamed from: w */
    public long[] m91636w() {
        return ULongArray.m104072constructorimpl(0);
    }

    public C41847l3() {
        super(C45236a.serializer(ULong.INSTANCE));
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ int mo91427e(Object obj) {
        return m91635v(((ULongArray) obj).getStorage());
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ Object mo91432k(Object obj) {
        return m91638y(((ULongArray) obj).getStorage());
    }

    @Override // kotlinx.serialization.internal.AbstractC41851m2
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ void mo91489u(InterfaceC45829b interfaceC45829b, ULongArray uLongArray, int i11) {
        m91639z(interfaceC45829b, uLongArray.getStorage(), i11);
    }

    /* JADX INFO: renamed from: v */
    public int m91635v(@NotNull long[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return ULongArray.m104079getSizeimpl(collectionSize);
    }

    @Override // kotlinx.serialization.internal.AbstractC41894w, kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo91430h(@NotNull CompositeDecoder decoder, int index, @NotNull C41842k3 builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m91628e(ULong.m104018constructorimpl(decoder.decodeInlineElement(getDescriptor(), index).decodeLong()));
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public C41842k3 m91638y(@NotNull long[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new C41842k3(toBuilder, null);
    }

    /* JADX INFO: renamed from: z */
    public void m91639z(@NotNull InterfaceC45829b encoder, @NotNull long[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < size; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeLong(ULongArray.m104078getsVKNKU(content, i11));
        }
    }

    @Override // kotlinx.serialization.internal.AbstractC41851m2
    /* JADX INFO: renamed from: r */
    public /* bridge */ /* synthetic */ ULongArray mo91488r() {
        return ULongArray.m104071boximpl(m91636w());
    }
}
