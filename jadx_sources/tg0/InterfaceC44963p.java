package tg0;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: tg0.p */
/* JADX INFO: compiled from: KSerializer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Ltg0/p;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lwg0/c;", "encoder", "value", "", "serialize", "(Lwg0/c;Ljava/lang/Object;)V", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC44963p<T> {
    @NotNull
    InterfaceC45533f getDescriptor();

    void serialize(@NotNull InterfaceC45830c encoder, T value);
}
