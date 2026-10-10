package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.AppsFlyerProperties;
import kotlinx.coroutines.channels.InterfaceC41577p;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.p */
/* JADX INFO: compiled from: SendingCollector.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lkotlinx/coroutines/flow/internal/p;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/channels/p;", AppsFlyerProperties.CHANNEL, "<init>", "(Lkotlinx/coroutines/channels/p;)V", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/channels/p;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41662p<T> implements InterfaceC41635f<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41577p<T> channel;

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    @Nullable
    public Object emit(T t11, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = this.channel.send(t11, continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41662p(@NotNull InterfaceC41577p<? super T> interfaceC41577p) {
        this.channel = interfaceC41577p;
    }
}
