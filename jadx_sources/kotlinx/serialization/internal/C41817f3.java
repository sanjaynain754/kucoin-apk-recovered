package kotlinx.serialization.internal;

import kotlinx.serialization.encoding.CompositeDecoder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExperimentalUnsignedTypes;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.UByte;
import p852kotlin.UByteArray;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import wg0.InterfaceC45829b;

/* JADX INFO: renamed from: kotlinx.serialization.internal.f3 */
/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Lkotlinx/serialization/internal/f3;", "Ltg0/d;", "Lkotlin/UByteArray;", "Lkotlinx/serialization/internal/m2;", "Lkotlin/UByte;", "Lkotlinx/serialization/internal/e3;", "<init>", "()V", "", "v", "([B)I", "y", "([B)Lkotlinx/serialization/internal/e3;", "w", "()[B", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "", "x", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/e3;Z)V", "Lwg0/b;", "encoder", "content", "size", "z", "(Lwg0/b;[BI)V", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
@ExperimentalUnsignedTypes
public final class C41817f3 extends AbstractC41851m2<UByte, UByteArray, C41812e3> implements InterfaceC44951d<UByteArray> {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C41817f3 f91927c = new C41817f3();

    @NotNull
    /* JADX INFO: renamed from: w */
    public byte[] m91550w() {
        return UByteArray.m103914constructorimpl(0);
    }

    public C41817f3() {
        super(C45236a.serializer(UByte.INSTANCE));
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ int mo91427e(Object obj) {
        return m91549v(((UByteArray) obj).getStorage());
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ Object mo91432k(Object obj) {
        return m91552y(((UByteArray) obj).getStorage());
    }

    @Override // kotlinx.serialization.internal.AbstractC41851m2
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ void mo91489u(InterfaceC45829b interfaceC45829b, UByteArray uByteArray, int i11) {
        m91553z(interfaceC45829b, uByteArray.getStorage(), i11);
    }

    /* JADX INFO: renamed from: v */
    public int m91549v(@NotNull byte[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UByteArray.m103921getSizeimpl(collectionSize);
    }

    @Override // kotlinx.serialization.internal.AbstractC41894w, kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo91430h(@NotNull CompositeDecoder decoder, int index, @NotNull C41812e3 builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m91533e(UByte.m103862constructorimpl(decoder.decodeInlineElement(getDescriptor(), index).decodeByte()));
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public C41812e3 m91552y(@NotNull byte[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new C41812e3(toBuilder, null);
    }

    /* JADX INFO: renamed from: z */
    public void m91553z(@NotNull InterfaceC45829b encoder, @NotNull byte[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < size; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeByte(UByteArray.m103920getw2LRezQ(content, i11));
        }
    }

    @Override // kotlinx.serialization.internal.AbstractC41851m2
    /* JADX INFO: renamed from: r */
    public /* bridge */ /* synthetic */ UByteArray mo91488r() {
        return UByteArray.m103913boximpl(m91550w());
    }
}
