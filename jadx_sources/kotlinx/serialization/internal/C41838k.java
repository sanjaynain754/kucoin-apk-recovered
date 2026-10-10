package kotlinx.serialization.internal;

import kotlinx.serialization.encoding.CompositeDecoder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.ByteCompanionObject;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import wg0.InterfaceC45829b;

/* JADX INFO: renamed from: kotlinx.serialization.internal.k */
/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Lkotlinx/serialization/internal/k;", "Ltg0/d;", "", "Lkotlinx/serialization/internal/m2;", "", "Lkotlinx/serialization/internal/j;", "<init>", "()V", "", "v", "([B)I", "y", "([B)Lkotlinx/serialization/internal/j;", "w", "()[B", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "", "x", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/j;Z)V", "Lwg0/b;", "encoder", "content", "size", "z", "(Lwg0/b;[BI)V", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public final class C41838k extends AbstractC41851m2<Byte, byte[], C41833j> implements InterfaceC44951d<byte[]> {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C41838k f91974c = new C41838k();

    @Override // kotlinx.serialization.internal.AbstractC41851m2
    @NotNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public byte[] mo91488r() {
        return new byte[0];
    }

    public C41838k() {
        super(C45236a.serializer(ByteCompanionObject.INSTANCE));
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo91427e(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // kotlinx.serialization.internal.AbstractC41894w, kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo91430h(@NotNull CompositeDecoder decoder, int index, @NotNull C41833j builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m91607e(decoder.decodeByteElement(getDescriptor(), index));
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C41833j mo91432k(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new C41833j(bArr);
    }

    @Override // kotlinx.serialization.internal.AbstractC41851m2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo91489u(@NotNull InterfaceC45829b encoder, @NotNull byte[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < size; i11++) {
            encoder.encodeByteElement(getDescriptor(), i11, content[i11]);
        }
    }
}
