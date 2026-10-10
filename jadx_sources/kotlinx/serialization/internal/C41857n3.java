package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExperimentalUnsignedTypes;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.UShortArray;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: kotlinx.serialization.internal.n3 */
/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lkotlinx/serialization/internal/n3;", "Lkotlinx/serialization/internal/k2;", "Lkotlin/UShortArray;", "bufferWithData", "<init>", "([SLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "", "b", "(I)V", "Lkotlin/UShort;", "c", "e", "(S)V", "f", "()[S", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "[S", "buffer", "value", "I", "d", "()I", ViewProps.POSITION, "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
@ExperimentalUnsignedTypes
public final class C41857n3 extends AbstractC41841k2<UShortArray> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public short[] buffer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int position;

    public /* synthetic */ C41857n3(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    /* JADX INFO: renamed from: e */
    public final void m91656e(short c11) {
        AbstractC41841k2.m91627c(this, 0, 1, null);
        short[] sArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        UShortArray.m104188set01HTLdE(sArr, position, c11);
    }

    public C41857n3(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = UShortArray.m104184getSizeimpl(bufferWithData);
        mo91435b(10);
    }

    @Override // kotlinx.serialization.internal.AbstractC41841k2
    /* JADX INFO: renamed from: b */
    public void mo91435b(int requiredCapacity) {
        if (UShortArray.m104184getSizeimpl(this.buffer) < requiredCapacity) {
            short[] sArr = this.buffer;
            short[] sArrCopyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(requiredCapacity, UShortArray.m104184getSizeimpl(sArr) * 2));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.buffer = UShortArray.m104178constructorimpl(sArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.AbstractC41841k2
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getPosition() {
        return this.position;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public short[] m91657f() {
        short[] sArrCopyOf = Arrays.copyOf(this.buffer, getPosition());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return UShortArray.m104178constructorimpl(sArrCopyOf);
    }

    @Override // kotlinx.serialization.internal.AbstractC41841k2
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ UShortArray mo91434a() {
        return UShortArray.m104176boximpl(m91657f());
    }
}
