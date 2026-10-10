package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.r1 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lkotlinx/coroutines/r1;", "Lkotlinx/coroutines/s1;", "Lkotlinx/coroutines/f2;", "list", "<init>", "(Lkotlinx/coroutines/f2;)V", "", "toString", "()Ljava/lang/String;", "b", "Lkotlinx/coroutines/f2;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlinx/coroutines/f2;", "", "isActive", "()Z", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41730r1 implements InterfaceC41741s1 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C41590f2 list;

    @Override // kotlinx.coroutines.InterfaceC41741s1
    public boolean isActive() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC41741s1
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public C41590f2 getList() {
        return this.list;
    }

    public C41730r1(@NotNull C41590f2 c41590f2) {
        this.list = c41590f2;
    }

    @NotNull
    public String toString() {
        return super.toString();
    }
}
