package androidx.privacysandbox.ads.adservices.internal;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: AdServicesInfo.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo;", "", "()V", "adServicesVersion", "", "extServicesVersionS", "Extensions30ExtImpl", "Extensions30Impl", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AdServicesInfo {

    @NotNull
    public static final AdServicesInfo INSTANCE = new AdServicesInfo();

    /* JADX INFO: compiled from: AdServicesInfo.kt */
    @RequiresApi(30)
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo$Extensions30ExtImpl;", "", "()V", "getAdExtServicesVersionS", "", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Extensions30ExtImpl {

        @NotNull
        public static final Extensions30ExtImpl INSTANCE = new Extensions30ExtImpl();

        @DoNotInline
        public final int getAdExtServicesVersionS() {
            return SdkExtensions.getExtensionVersion(31);
        }

        private Extensions30ExtImpl() {
        }
    }

    /* JADX INFO: compiled from: AdServicesInfo.kt */
    @RequiresApi(30)
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo$Extensions30Impl;", "", "()V", "getAdServicesVersion", "", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Extensions30Impl {

        @NotNull
        public static final Extensions30Impl INSTANCE = new Extensions30Impl();

        private Extensions30Impl() {
        }

        @DoNotInline
        public final int getAdServicesVersion() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public final int adServicesVersion() {
        if (Build.VERSION.SDK_INT >= 33) {
            return Extensions30Impl.INSTANCE.getAdServicesVersion();
        }
        return 0;
    }

    public final int extServicesVersionS() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 31 || i11 == 32) {
            return Extensions30ExtImpl.INSTANCE.getAdExtServicesVersionS();
        }
        return 0;
    }

    private AdServicesInfo() {
    }
}
