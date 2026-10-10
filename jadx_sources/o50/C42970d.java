package o50;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.kubi.utils.extensions.core.C27029c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048c2.C4781a0;
import p048c2.C4793j;
import p419l2.C42032f;
import p628t1.C44611c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: o50.d */
/* JADX INFO: compiled from: ImageViewExt.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u001e\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m90084d2 = {"loadIconByGlide", "", "Landroid/widget/ImageView;", "iconUrl", "", "defaultIcon", "", "loadPictureByGlide", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImageViewExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewExt.kt\ncom/kubi/tradingbotkit/ext/ImageViewExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TradingBotIssue.kt\ncom/kubi/tradingbotkit/exeption/TradingBotIssueKt\n*L\n1#1,58:1\n1#2:59\n45#3,4:60\n*S KotlinDebug\n*F\n+ 1 ImageViewExt.kt\ncom/kubi/tradingbotkit/ext/ImageViewExtKt\n*L\n37#1:60,4\n*E\n"})
public final class C42970d {
    /* JADX INFO: renamed from: a */
    public static final void m94364a(@NotNull ImageView imageView, @Nullable String str, int i11) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Context context = imageView.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            if (!activity.isDestroyed()) {
                activity.isFinishing();
            }
            ComponentCallbacks2C5309c.m6556t(imageView.getContext()).mo6634v(str).mo6606a(new C42032f().mo92213o0(new C44611c(new C4793j(), new C4781a0(C27029c.m66601d(imageView, 4)))).mo92188b0(i11)).m6594E0(imageView);
        }
    }
}
