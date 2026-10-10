package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.C33675gh;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.p */
/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0013\u001a\u00020\u00042#\u0010\u0012\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m90084d2 = {"Lkotlinx/coroutines/channels/p;", ExifInterface.LONGITUDE_EAST, "", "element", "", C33675gh.f70005k, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "F", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "handler", "d", "(Lkotlin/jvm/functions/Function1;)V", "q", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC41577p<E> {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.p$a */
    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m90714a(InterfaceC41577p interfaceC41577p, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i11 & 1) != 0) {
                th2 = null;
            }
            return interfaceC41577p.mo90553F(th2);
        }
    }

    /* JADX INFO: renamed from: F */
    boolean mo90553F(@Nullable Throwable cause);

    /* JADX INFO: renamed from: d */
    void mo90591d(@NotNull Function1<? super Throwable, Unit> handler);

    @NotNull
    /* JADX INFO: renamed from: e */
    Object mo90594e(E element);

    /* JADX INFO: renamed from: q */
    boolean mo90614q();

    @Nullable
    Object send(E e11, @NotNull Continuation<? super Unit> continuation);
}
