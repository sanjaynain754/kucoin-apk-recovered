package kotlinx.coroutines.flow;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.v */
/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lkotlinx/coroutines/flow/v;", "Lkotlinx/coroutines/flow/SharingStarted;", "<init>", "()V", "Lkotlinx/coroutines/flow/w;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/SharingCommand;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/flow/w;)Lkotlinx/coroutines/flow/e;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41677v implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC41634e<SharingCommand> mo90862a(@NotNull InterfaceC41678w<Integer> subscriptionCount) {
        return C41636g.m90889M(SharingCommand.START);
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Eagerly";
    }
}
