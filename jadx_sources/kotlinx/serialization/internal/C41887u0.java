package kotlinx.serialization.internal;

import kotlinx.serialization.encoding.CompositeDecoder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.IntCompanionObject;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import wg0.InterfaceC45829b;

/* JADX INFO: renamed from: kotlinx.serialization.internal.u0 */
/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Lkotlinx/serialization/internal/u0;", "Ltg0/d;", "", "Lkotlinx/serialization/internal/m2;", "", "Lkotlinx/serialization/internal/t0;", "<init>", "()V", "v", "([I)I", "y", "([I)Lkotlinx/serialization/internal/t0;", "w", "()[I", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "", "x", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/t0;Z)V", "Lwg0/b;", "encoder", "content", "size", "z", "(Lwg0/b;[II)V", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public final class C41887u0 extends AbstractC41851m2<Integer, int[], C41883t0> implements InterfaceC44951d<int[]> {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C41887u0 f92038c = new C41887u0();

    @Override // kotlinx.serialization.internal.AbstractC41851m2
    @NotNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] mo91488r() {
        return new int[0];
    }

    public C41887u0() {
        super(C45236a.serializer(IntCompanionObject.INSTANCE));
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo91427e(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @Override // kotlinx.serialization.internal.AbstractC41894w, kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo91430h(@NotNull CompositeDecoder decoder, int index, @NotNull C41883t0 builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m91716e(decoder.decodeIntElement(getDescriptor(), index));
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C41883t0 mo91432k(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new C41883t0(iArr);
    }

    @Override // kotlinx.serialization.internal.AbstractC41851m2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo91489u(@NotNull InterfaceC45829b encoder, @NotNull int[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < size; i11++) {
            encoder.encodeIntElement(getDescriptor(), i11, content[i11]);
        }
    }
}
