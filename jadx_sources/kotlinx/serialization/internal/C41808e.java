package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.e */
/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Lkotlinx/serialization/internal/e;", "Lkotlinx/serialization/internal/d1;", "Lvg0/f;", "elementDesc", "<init>", "(Lvg0/f;)V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/String;", "serialName", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41808e extends AbstractC41805d1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41808e(@NotNull InterfaceC45533f elementDesc) {
        super(elementDesc, null);
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
    }

    @Override // vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: h */
    public String getSerialName() {
        return "kotlin.collections.ArrayList";
    }
}
