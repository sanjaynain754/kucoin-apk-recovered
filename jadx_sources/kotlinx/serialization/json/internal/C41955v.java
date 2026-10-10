package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.flutter.embedding.android.KeyboardMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.UByte;
import p852kotlin.UInt;
import p852kotlin.ULong;
import p852kotlin.UShort;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.v */
/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lkotlinx/serialization/json/internal/v;", "Lkotlinx/serialization/json/internal/n;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "", "forceQuoting", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "", "v", "", "i", "(I)V", "", "j", "(J)V", "", "e", "(B)V", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(S)V", "c", "Z", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41955v extends C41939n {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean forceQuoting;

    @Override // kotlinx.serialization.json.internal.C41939n
    /* JADX INFO: renamed from: e */
    public void mo91968e(byte v11) {
        boolean z11 = this.forceQuoting;
        String strM103906toStringimpl = UByte.m103906toStringimpl(UByte.m103862constructorimpl(v11));
        if (z11) {
            mo91977n(strM103906toStringimpl);
        } else {
            m91974k(strM103906toStringimpl);
        }
    }

    @Override // kotlinx.serialization.json.internal.C41939n
    /* JADX INFO: renamed from: i */
    public void mo91972i(int v11) {
        boolean z11 = this.forceQuoting;
        int iM103939constructorimpl = UInt.m103939constructorimpl(v11);
        if (z11) {
            mo91977n(Long.toString(((long) iM103939constructorimpl) & KeyboardMap.kValueMask, 10));
        } else {
            m91974k(Long.toString(((long) iM103939constructorimpl) & KeyboardMap.kValueMask, 10));
        }
    }

    @Override // kotlinx.serialization.json.internal.C41939n
    /* JADX INFO: renamed from: j */
    public void mo91973j(long v11) {
        boolean z11 = this.forceQuoting;
        long jM104018constructorimpl = ULong.m104018constructorimpl(v11);
        if (z11) {
            mo91977n(C41953u.m92010a(jM104018constructorimpl, 10));
        } else {
            m91974k(C41951t.m92007a(jM104018constructorimpl, 10));
        }
    }

    @Override // kotlinx.serialization.json.internal.C41939n
    /* JADX INFO: renamed from: l */
    public void mo91975l(short v11) {
        boolean z11 = this.forceQuoting;
        String strM104169toStringimpl = UShort.m104169toStringimpl(UShort.m104125constructorimpl(v11));
        if (z11) {
            mo91977n(strM104169toStringimpl);
        } else {
            m91974k(strM104169toStringimpl);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41955v(@NotNull InternalJsonWriter writer, boolean z11) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.forceQuoting = z11;
    }
}
