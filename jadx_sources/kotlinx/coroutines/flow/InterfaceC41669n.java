package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41722p1;
import p852kotlin.Metadata;
import p852kotlin.SubclassOptInRequired;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.n */
/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\r\u001a\u00028\u00008&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m90084d2 = {"Lkotlinx/coroutines/flow/n;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/w;", "Lkotlinx/coroutines/flow/m;", "expect", "update", "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SubclassOptInRequired(markerClass = {InterfaceC41722p1.class})
public interface InterfaceC41669n<T> extends InterfaceC41678w<T>, InterfaceC41668m<T> {
    boolean compareAndSet(T expect, T update);

    @Override // kotlinx.coroutines.flow.InterfaceC41678w
    T getValue();

    void setValue(T t11);
}
