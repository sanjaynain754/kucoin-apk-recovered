package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41722p1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SubclassOptInRequired;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.m */
/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H'¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lkotlinx/coroutines/flow/m;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/r;", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "d", "(Ljava/lang/Object;)Z", "b", "()V", "Lkotlinx/coroutines/flow/w;", "", "e", "()Lkotlinx/coroutines/flow/w;", "subscriptionCount", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SubclassOptInRequired(markerClass = {InterfaceC41722p1.class})
public interface InterfaceC41668m<T> extends InterfaceC41673r<T>, InterfaceC41635f<T> {
    /* JADX INFO: renamed from: b */
    void mo90853b();

    /* JADX INFO: renamed from: d */
    boolean mo90855d(T value);

    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41678w<Integer> m90999e();

    @Nullable
    Object emit(T t11, @NotNull Continuation<? super Unit> continuation);
}
