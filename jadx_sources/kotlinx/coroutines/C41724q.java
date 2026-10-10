package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import og0.C43058h;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.q */
/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m;", "Lkotlinx/coroutines/l;", "handler", "", "c", "(Lkotlinx/coroutines/m;Lkotlinx/coroutines/l;)V", "Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/o;", "b", "(Lkotlin/coroutines/Continuation;)Lkotlinx/coroutines/o;", "Lkotlinx/coroutines/b1;", "handle", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/m;Lkotlinx/coroutines/b1;)V", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,498:1\n1#2:499\n*E\n"})
public final class C41724q {
    /* JADX INFO: renamed from: a */
    public static final void m91186a(@NotNull InterfaceC41708m<?> interfaceC41708m, @NotNull InterfaceC41550b1 interfaceC41550b1) {
        m91188c(interfaceC41708m, new C41555c1(interfaceC41550b1));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> C41716o<T> m91187b(@NotNull Continuation<? super T> continuation) {
        if (!(continuation instanceof C43058h)) {
            return new C41716o<>(continuation, 1);
        }
        C41716o<T> c41716oM94575j = ((C43058h) continuation).m94575j();
        if (c41716oM94575j != null) {
            if (!c41716oM94575j.m91150O()) {
                c41716oM94575j = null;
            }
            if (c41716oM94575j != null) {
                return c41716oM94575j;
            }
        }
        return new C41716o<>(continuation, 2);
    }

    /* JADX INFO: renamed from: c */
    public static final <T> void m91188c(@NotNull InterfaceC41708m<? super T> interfaceC41708m, @NotNull InterfaceC41704l interfaceC41704l) {
        if (!(interfaceC41708m instanceof C41716o)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C41716o) interfaceC41708m).m91145I(interfaceC41704l);
    }
}
