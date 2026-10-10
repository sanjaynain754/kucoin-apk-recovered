package p694vk;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import androidx.media3.common.MimeTypes;
import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.utils.ScreenUtils;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vk.u */
/* JADX INFO: compiled from: AutoSizeFix.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kucoin/AutoSizeFix;", "", "<init>", "()V", "screenWidth", "", "screenHeight", "init", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45592u {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45592u f102714a = new C45592u();

    /* JADX INFO: renamed from: b */
    public static int f102715b;

    /* JADX INFO: renamed from: c */
    public static int f102716c;

    /* JADX INFO: renamed from: vk.u$a */
    /* JADX INFO: compiled from: AutoSizeFix.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kucoin/AutoSizeFix$init$1", "Landroid/content/ComponentCallbacks;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements ComponentCallbacks {
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            Intrinsics.checkNotNullParameter(newConfig, "newConfig");
            if (newConfig.orientation == 1) {
                AutoSizeConfig.getInstance().setScreenWidth(C45592u.f102715b);
                AutoSizeConfig.getInstance().setScreenHeight(C45592u.f102716c);
            } else {
                AutoSizeConfig.getInstance().setScreenWidth(C45592u.f102716c);
                AutoSizeConfig.getInstance().setScreenHeight(C45592u.f102715b);
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m100685c(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        int[] screenSize = ScreenUtils.getScreenSize(application);
        if (application.getResources().getConfiguration().orientation == 1) {
            f102715b = screenSize[0];
            f102716c = screenSize[1];
        } else {
            f102715b = screenSize[1];
            f102716c = screenSize[0];
        }
        application.registerComponentCallbacks(new a());
    }
}
