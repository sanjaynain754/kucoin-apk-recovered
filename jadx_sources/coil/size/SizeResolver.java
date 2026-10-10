package coil.size;

import org.jetbrains.annotations.NotNull;
import p816z0.RealSizeResolver;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SizeResolver.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m90084d2 = {"Lcoil/size/SizeResolver;", "", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface SizeResolver {

    /* JADX INFO: compiled from: SizeResolver.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcoil/size/SizeResolver$Companion;", "", "()V", "invoke", "Lcoil/size/SizeResolver;", "size", "Lcoil/size/Size;", "create", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f5838a = new Companion();

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final SizeResolver create(@NotNull Size size) {
            Intrinsics.checkNotNullParameter(size, "size");
            return new RealSizeResolver(size);
        }
    }
}
