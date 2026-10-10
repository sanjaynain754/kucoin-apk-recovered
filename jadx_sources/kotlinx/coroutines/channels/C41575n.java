package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41784z2;
import og0.AbstractC43081x;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.n */
/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lkotlinx/coroutines/channels/n;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/z2;", "Lkotlinx/coroutines/o;", "Lkotlinx/coroutines/channels/ChannelResult;", "cont", "<init>", "(Lkotlinx/coroutines/o;)V", "Log0/x;", "segment", "", "index", "", "e", "(Log0/x;I)V", "b", "Lkotlinx/coroutines/o;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41575n<E> implements InterfaceC41784z2 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final C41716o<ChannelResult<? extends E>> cont;

    @Override // kotlinx.coroutines.InterfaceC41784z2
    /* JADX INFO: renamed from: e */
    public void mo90632e(@NotNull AbstractC43081x<?> segment, int index) {
        this.cont.mo90632e(segment, index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41575n(@NotNull C41716o<? super ChannelResult<? extends E>> c41716o) {
        this.cont = c41716o;
    }
}
