package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SubclassOptInRequired;

/* JADX INFO: renamed from: kotlinx.coroutines.w */
/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lkotlinx/coroutines/w;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/r0;", "value", "", "n", "(Ljava/lang/Object;)Z", "", "exception", "m", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SubclassOptInRequired(markerClass = {InterfaceC41763u1.class})
public interface InterfaceC41769w<T> extends InterfaceC41729r0<T> {
    /* JADX INFO: renamed from: m */
    boolean mo91369m(@NotNull Throwable exception);

    /* JADX INFO: renamed from: n */
    boolean mo91370n(T value);
}
