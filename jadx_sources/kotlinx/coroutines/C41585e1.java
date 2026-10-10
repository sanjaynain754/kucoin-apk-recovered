package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.e1 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lkotlinx/coroutines/e1;", "Lkotlinx/coroutines/s1;", "", "isActive", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "b", "Z", "()Z", "Lkotlinx/coroutines/f2;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlinx/coroutines/f2;", "list", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41585e1 implements InterfaceC41741s1 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isActive;

    @Override // kotlinx.coroutines.InterfaceC41741s1
    @Nullable
    /* JADX INFO: renamed from: a */
    public C41590f2 getList() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC41741s1
    /* JADX INFO: renamed from: isActive, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(getIsActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }

    public C41585e1(boolean z11) {
        this.isActive = z11;
    }
}
