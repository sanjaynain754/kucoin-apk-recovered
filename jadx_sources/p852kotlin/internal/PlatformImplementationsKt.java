package p852kotlin.internal;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.KotlinVersion;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.SinceKotlin;
import p852kotlin.internal.jdk8.JDK8PlatformImplementations;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\"\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010\u0006\u001a \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0001\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "castToBaseType", ExifInterface.GPS_DIRECTION_TRUE, "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PlatformImplementationsKt {

    @JvmField
    @NotNull
    public static final PlatformImplementations IMPLEMENTATIONS = new JDK8PlatformImplementations();

    @SinceKotlin(version = "1.2")
    @PublishedApi
    public static final boolean apiVersionIsAtLeast(int i11, int i12, int i13) {
        return KotlinVersion.CURRENT.isAtLeast(i11, i12, i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final /* synthetic */ <T> T castToBaseType(Object obj) throws ClassNotFoundException {
        try {
            Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
            return obj;
        } catch (ClassCastException e11) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (Intrinsics.areEqual(classLoader, classLoader2)) {
                throw e11;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e11);
        }
    }
}
