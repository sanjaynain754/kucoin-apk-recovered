package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41550b1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00018\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Landroidx/lifecycle/LiveDataScope;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/b1;", "emitSource", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestValue", "()Ljava/lang/Object;", "latestValue", "lifecycle-livedata_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface LiveDataScope<T> {
    @Nullable
    Object emit(T t11, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object emitSource(@NotNull LiveData<T> liveData, @NotNull Continuation<? super InterfaceC41550b1> continuation);

    @Nullable
    T getLatestValue();
}
