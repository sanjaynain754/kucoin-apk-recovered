package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.selects.InterfaceC41751f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SubclassOptInRequired;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.r0 */
/* JADX INFO: compiled from: Deferred.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m90084d2 = {"Lkotlinx/coroutines/r0;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/x1;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "C", "()Lkotlinx/coroutines/selects/f;", "onAwait", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SubclassOptInRequired(markerClass = {InterfaceC41763u1.class})
public interface InterfaceC41729r0<T> extends InterfaceC41775x1 {
    @NotNull
    /* JADX INFO: renamed from: C */
    InterfaceC41751f<T> mo91196C();

    /* JADX INFO: renamed from: b */
    T mo91197b();

    @Nullable
    /* JADX INFO: renamed from: h */
    Object mo91198h(@NotNull Continuation<? super T> continuation);
}
