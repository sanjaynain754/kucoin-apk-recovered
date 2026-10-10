package androidx.privacysandbox.ads.adservices.internal;

import android.content.Context;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BackCompatManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/internal/BackCompatManager;", "", "()V", "getManager", ExifInterface.GPS_DIRECTION_TRUE, "context", "Landroid/content/Context;", "tag", "", "manager", "Lkotlin/Function1;", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class BackCompatManager {

    @NotNull
    public static final BackCompatManager INSTANCE = new BackCompatManager();

    @Nullable
    public final <T> T getManager(@NotNull Context context, @NotNull String tag, @NotNull Function1<? super Context, ? extends T> manager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(manager, "manager");
        try {
            return manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(tag, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + AdServicesInfo.INSTANCE.extServicesVersionS());
            return null;
        }
    }

    private BackCompatManager() {
    }
}
