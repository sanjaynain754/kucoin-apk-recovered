package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: kotlinx.coroutines.r2 */
/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlinx/coroutines/r2;", ExifInterface.LATITUDE_SOUTH, "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "context", "J", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "oldState", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC41731r2<S> extends CoroutineContext.Element {
    /* JADX INFO: renamed from: J */
    S mo91199J(@NotNull CoroutineContext context);

    /* JADX INFO: renamed from: l */
    void mo91200l(@NotNull CoroutineContext context, S oldState);

    /* JADX INFO: renamed from: kotlinx.coroutines.r2$a */
    /* JADX INFO: compiled from: ThreadContextElement.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static <S, R> R m91201a(@NotNull InterfaceC41731r2<S> interfaceC41731r2, R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(interfaceC41731r2, r11, function2);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public static <S> CoroutineContext m91202b(@NotNull InterfaceC41731r2<S> interfaceC41731r2, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(interfaceC41731r2, coroutineContext);
        }
    }
}
