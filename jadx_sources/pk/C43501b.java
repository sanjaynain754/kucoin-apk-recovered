package pk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5270g;
import com.blankj.utilcode.util.C5290q;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.jsbridge.exception.WebBridgeException;
import com.kubi.kweb.R$color;
import com.kubi.kweb.R$drawable;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.widget.web.ui.KWebBaseActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: pk.b */
/* JADX INFO: compiled from: UpdateHeaderUtils.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002J'\u0010\n\u001a\u00020\u0007*\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0014\u0010\u0013\u001a\u00020\r*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002Jª\u0001\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/jsbridge/utils/UpdateHeaderUtils;", "", "<init>", "()V", "TAG", "", "setTint", "", "Landroid/widget/ImageView;", "tintColor", "setResByByte", "bytes", "defaultId", "", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;)V", "toThemeColor", "", "context", "Landroid/content/Context;", "toColor", "updateHeader", "activity", "Lcom/kubi/widget/web/ui/KWebBaseActivity;", "statusBarTransparent", "leftVisible", "rightVisible", "title", "titleColor", "background", ViewProps.VISIBLE, "statusBarIsLightMode", "leftIcon", "leftTint", "leadIcon", "trailIcon", "rightIcon", "rightTint", "WebBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUpdateHeaderUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateHeaderUtils.kt\ncom/kubi/jsbridge/utils/UpdateHeaderUtils\n+ 2 KWebBridgeIssue.kt\ncom/kubi/jsbridge/exception/KWebBridgeIssueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n44#2,2:186\n1#3:188\n*S KotlinDebug\n*F\n+ 1 UpdateHeaderUtils.kt\ncom/kubi/jsbridge/utils/UpdateHeaderUtils\n*L\n53#1:186,2\n*E\n"})
public final class C43501b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43501b f96040a = new C43501b();

    /* JADX INFO: renamed from: f */
    public final boolean m95726f(@NotNull KWebBaseActivity activity, boolean z11, boolean z12, boolean z13, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z14, boolean z15, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        NavigationBar navigationBar;
        KWebBaseActivity kWebBaseActivity;
        C43501b c43501b;
        C43501b c43501b2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        NavigationBar navigationBar2 = activity.getNavigationBar();
        if (z11) {
            C44128b.m97266j("MyKcWebView-updateHeader", "updateHeader apply transparent statusBar");
            activity.m67439L0(true, null);
        } else {
            activity.m67439L0(false, Integer.valueOf(str3 != null ? m95724d(str3, activity) : m95725e(z15, activity)));
        }
        C5270g.m6204r(activity, z15);
        if (!z14) {
            C44128b.m97266j("MyKcWebView-updateHeader", "updateHeader [2隐藏导航栏] url=" + activity.url() + " \nvisible=" + z14 + " statusBarTransparent=" + z11 + " statusBarIsLightMode=" + z15 + " title=" + str + " background=" + str3 + " leftVisible=" + z12 + " rightVisible=" + z13);
            navigationBar2.m54692c();
            return true;
        }
        C44128b.m97266j("MyKcWebView-updateHeader", "updateHeader [1显示导航栏] url=" + activity.url() + " \nvisible=" + z14 + " statusBarTransparent=" + z11 + " statusBarIsLightMode=" + z15 + " title=" + str + " background=" + str3 + " leftVisible=" + z12 + " rightVisible=" + z13);
        navigationBar2.m54699j();
        if (str == null || str.length() == 0) {
            navigationBar = navigationBar2;
            navigationBar.setTitle("");
        } else {
            navigationBar = navigationBar2;
            navigationBar.setTitle(str);
            if (str2 != null) {
                navigationBar.setTitleTextColor(str2);
            }
        }
        if (str3 == null || str3.length() == 0) {
            kWebBaseActivity = activity;
            navigationBar.setBackGroundColor(ContextCompat.getColor(kWebBaseActivity, R$color.c_overlay));
            C44128b.m97266j("MyKcWebView-updateHeader", "updateHeader empty background fallback overlay");
        } else {
            try {
                navigationBar.setBackGroundColor(Color.parseColor(str3));
                C44128b.m97266j("MyKcWebView-updateHeader", "updateHeader apply navBar background=" + str3);
                kWebBaseActivity = activity;
            } catch (Exception unused) {
                kWebBaseActivity = activity;
                navigationBar.setBackGroundColor(ContextCompat.getColor(kWebBaseActivity, R$color.c_overlay));
                C44128b.m97266j("MyKcWebView-updateHeader", "updateHeader invalid background=" + str3 + " fallback overlay");
            }
        }
        ImageView leftIcon = navigationBar.getLeftIcon();
        Intrinsics.checkNotNullExpressionValue(leftIcon, "getLeftIcon(...)");
        if (z12) {
            c43501b = this;
            c43501b.m95722a(leftIcon, str4, Integer.valueOf(R$drawable.ic2_arrow_left2_20));
            c43501b.m95723c(leftIcon, str5);
        } else {
            c43501b = this;
            ViewExtKt.m66577h(leftIcon);
        }
        if (z13) {
            ImageView rightThreeIcon = navigationBar.getRightThreeIcon();
            if (rightThreeIcon != null) {
                c43501b.m95722a(rightThreeIcon, str8, Integer.valueOf(R$drawable.ic_close_24));
            }
        } else {
            ImageView rightThreeIcon2 = navigationBar.getRightThreeIcon();
            if (rightThreeIcon2 != null) {
                ViewExtKt.m66577h(rightThreeIcon2);
            }
        }
        ImageView rightOneIcon = navigationBar.getRightOneIcon();
        if (rightOneIcon != null) {
            m95721b(c43501b, rightOneIcon, str6, null, 2, null);
        }
        ImageView rightTwoIcon = navigationBar.getRightTwoIcon();
        if (rightTwoIcon != null) {
            m95721b(this, rightTwoIcon, str7, null, 2, null);
            c43501b2 = this;
        } else {
            c43501b2 = this;
        }
        ImageView rightOneIcon2 = navigationBar.getRightOneIcon();
        if (rightOneIcon2 != null) {
            c43501b2.m95723c(rightOneIcon2, str9);
        }
        ImageView rightTwoIcon2 = navigationBar.getRightTwoIcon();
        if (rightTwoIcon2 != null) {
            c43501b2.m95723c(rightTwoIcon2, str9);
        }
        ImageView rightThreeIcon3 = navigationBar.getRightThreeIcon();
        if (rightThreeIcon3 != null) {
            c43501b2.m95723c(rightThreeIcon3, str9);
        }
        C44128b.m97266j("MyKcWebView-updateHeader", "updateHeader return success url=" + kWebBaseActivity.url());
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m95721b(C43501b c43501b, ImageView imageView, String str, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        c43501b.m95722a(imageView, str, num);
    }

    /* JADX INFO: renamed from: a */
    public final void m95722a(ImageView imageView, String str, @DrawableRes Integer num) {
        if (str == null || str.length() == 0) {
            if (num == null) {
                ViewExtKt.m66577h(imageView);
                return;
            } else {
                imageView.setImageResource(num.intValue());
                ViewExtKt.m66594y(imageView);
                return;
            }
        }
        try {
            Bitmap bitmapM6355f = C5290q.m6355f(C43500a.f96039a.m95720a(str), 0);
            if (bitmapM6355f == null) {
                ViewExtKt.m66577h(imageView);
            } else {
                imageView.setImageBitmap(bitmapM6355f);
                ViewExtKt.m66594y(imageView);
            }
        } catch (Exception e11) {
            C43846g.m96568c(new WebBridgeException(e11, "setResByByte", false, null, 8, null), null, 2, null);
            ViewExtKt.m66577h(imageView);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m95723c(ImageView imageView, String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    imageView.setColorFilter(Color.parseColor(str), PorterDuff.Mode.SRC_IN);
                    return;
                }
            } catch (Exception unused) {
                imageView.setColorFilter(ContextCompat.getColor(imageView.getContext(), R$color.c_icon), PorterDuff.Mode.SRC_IN);
                return;
            }
        }
        imageView.setColorFilter(ContextCompat.getColor(imageView.getContext(), R$color.c_icon), PorterDuff.Mode.SRC_IN);
    }

    /* JADX INFO: renamed from: e */
    public final int m95725e(boolean z11, Context context) {
        return ContextCompat.getColor(context, z11 ? com.kubi.widget.web.R$color.kweb_background_light : com.kubi.widget.web.R$color.kweb_background_dark);
    }

    /* JADX INFO: renamed from: d */
    public final int m95724d(String str, Context context) {
        if (str.length() > 0) {
            try {
                return Color.parseColor(str);
            } catch (Exception unused) {
                return ContextCompat.getColor(context, R$color.c_overlay);
            }
        }
        return ContextCompat.getColor(context, R$color.c_overlay);
    }
}
