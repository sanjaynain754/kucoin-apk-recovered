package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: kotlinx.serialization.internal.m0 */
/* JADX INFO: compiled from: PluginHelperInterfaces.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"Lkotlinx/serialization/internal/m0;", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/d;", "", "childSerializers", "()[Ltg0/d;", "typeParametersSerializers", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC41849m0<T> extends InterfaceC44951d<T> {

    /* JADX INFO: renamed from: kotlinx.serialization.internal.m0$a */
    /* JADX INFO: compiled from: PluginHelperInterfaces.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a {
        @NotNull
        /* JADX INFO: renamed from: a */
        public static <T> InterfaceC44951d<?>[] m91640a(@NotNull InterfaceC41849m0<T> interfaceC41849m0) {
            return C41836j2.f91971a;
        }
    }

    @NotNull
    InterfaceC44951d<?>[] childSerializers();

    @NotNull
    InterfaceC44951d<?>[] typeParametersSerializers();
}
