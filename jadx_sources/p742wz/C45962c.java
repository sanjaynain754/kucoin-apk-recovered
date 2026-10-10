package p742wz;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.sdk.mode.R$font;
import com.kubi.utils.C27059l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: wz.c */
/* JADX INFO: compiled from: ModeUtils.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000bJ\u0016\u0010\u0011\u001a\u00020\u0012*\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\rR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/mode/utils/ModeUtils;", "", "<init>", "()V", "mediumFont", "Landroid/graphics/Typeface;", "getMediumFont", "()Landroid/graphics/Typeface;", "mediumFont$delegate", "Lkotlin/Lazy;", "isWeb3Path", "", "path", "", "uri", "Landroid/net/Uri;", "isSupportSwitchAnimation", "log", "", "tag", "LMode_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45962c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45962c f103401a = new C45962c();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f103402b = LazyKt.lazy(new Function0() { // from class: wz.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45962c.m101398d();
        }
    });

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m101397c(C45962c c45962c, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "LiteTag";
        }
        c45962c.m101399b(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static final Typeface m101398d() {
        return ResourcesCompat.getFont(C27059l.f54343a.m66757a(), R$font.medium);
    }

    /* JADX INFO: renamed from: b */
    public final void m101399b(@Nullable String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (str == null) {
            str = "";
        }
        C44128b.m97259c(tag, str);
    }
}
