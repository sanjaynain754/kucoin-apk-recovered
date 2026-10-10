package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.y */
/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/w;", "Lkotlin/Result;", DbParams.KEY_CHANNEL_RESULT, "", "d", "(Lkotlinx/coroutines/w;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/x1;", "parent", "b", "(Lkotlinx/coroutines/x1;)Lkotlinx/coroutines/w;", "value", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Lkotlinx/coroutines/w;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCompletableDeferred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableDeferred.kt\nkotlinx/coroutines/CompletableDeferredKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public final class C41777y {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41769w<T> m91386a(T t11) {
        C41773x c41773x = new C41773x(null);
        c41773x.mo91370n(t11);
        return c41773x;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC41769w<T> m91387b(@Nullable InterfaceC41775x1 interfaceC41775x1) {
        return new C41773x(interfaceC41775x1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC41769w m91388c(InterfaceC41775x1 interfaceC41775x1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41775x1 = null;
        }
        return m91387b(interfaceC41775x1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final <T> boolean m91389d(@NotNull InterfaceC41769w<T> interfaceC41769w, @NotNull Object obj) {
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj);
        if (thM103847exceptionOrNullimpl == null) {
            return interfaceC41769w.mo91370n(obj);
        }
        return interfaceC41769w.mo91369m(thM103847exceptionOrNullimpl);
    }
}
