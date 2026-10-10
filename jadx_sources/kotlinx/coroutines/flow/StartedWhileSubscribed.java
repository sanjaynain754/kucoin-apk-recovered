package kotlinx.coroutines.flow;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Lkotlinx/coroutines/flow/SharingStarted;", "", "stopTimeout", "replayExpiration", "<init>", "(JJ)V", "Lkotlinx/coroutines/flow/w;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/SharingCommand;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/flow/w;)Lkotlinx/coroutines/flow/e;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "J", "c", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSharingStarted.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharingStarted.kt\nkotlinx/coroutines/flow/StartedWhileSubscribed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
public final class StartedWhileSubscribed implements SharingStarted {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long stopTimeout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long replayExpiration;

    @NotNull
    public String toString() {
        List listCreateListBuilder = CollectionsKt.createListBuilder(2);
        if (this.stopTimeout > 0) {
            listCreateListBuilder.add("stopTimeout=" + this.stopTimeout + "ms");
        }
        if (this.replayExpiration < Long.MAX_VALUE) {
            listCreateListBuilder.add("replayExpiration=" + this.replayExpiration + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), null, null, null, 0, null, null, 63, null) + ')';
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC41634e<SharingCommand> mo90862a(@NotNull InterfaceC41678w<Integer> subscriptionCount) {
        return C41636g.m90939v(C41636g.m90943z(C41636g.m90930n0(subscriptionCount, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(null)));
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof StartedWhileSubscribed)) {
            return false;
        }
        StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) other;
        return this.stopTimeout == startedWhileSubscribed.stopTimeout && this.replayExpiration == startedWhileSubscribed.replayExpiration;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.stopTimeout) * 31) + Long.hashCode(this.replayExpiration);
    }

    public StartedWhileSubscribed(long j11, long j12) {
        this.stopTimeout = j11;
        this.replayExpiration = j12;
        if (j11 >= 0) {
            if (j12 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j12 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j11 + " ms) cannot be negative").toString());
    }
}
