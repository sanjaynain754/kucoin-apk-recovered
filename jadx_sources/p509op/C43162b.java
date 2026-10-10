package p509op;

import com.kubi.resources.widget.MarqueeTextView;
import com.kubi.utils.extensions.DowngradeExKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import y70.C46396e;

/* JADX INFO: renamed from: op.b */
/* JADX INFO: compiled from: DisplayBanner.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0007\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u001a\u001c\u0010\r\u001a\u00020\t*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"MARGIN_BANNER_CATEGORY", "", "BANNER_CLOSE_FOREVER_VALUE", "", "getContentList", "", "Lcom/kubi/resources/widget/MarqueeTextView$IString;", "Lcom/kubi/margin/trade/banner/DisplayBanner;", "isAllowDisplay", "", "closeAndSave", "", "closeKeepDay", "isGapOverDays", "days", "", "oldTimeMillis", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43162b {
    /* JADX INFO: renamed from: d */
    public static final boolean m94764d(long j11, int i11, long j12) {
        return j11 - j12 > ((long) (i11 * 86400000));
    }

    /* JADX INFO: renamed from: a */
    public static final void m94761a(@NotNull InterfaceC43161a interfaceC43161a) {
        String bannerId;
        Intrinsics.checkNotNullParameter(interfaceC43161a, "<this>");
        if (interfaceC43161a instanceof InterfaceC43161a.Common) {
            bannerId = ((InterfaceC43161a.Common) interfaceC43161a).getBannerId();
        } else {
            if (!(interfaceC43161a instanceof InterfaceC43161a.Income)) {
                throw new NoWhenBranchMatchedException();
            }
            bannerId = ((InterfaceC43161a.Income) interfaceC43161a).getBannerId();
        }
        if (bannerId != null) {
            C46396e.m102356m("MARGIN_BANNER_CATEGORY_1", bannerId, System.currentTimeMillis());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<MarqueeTextView.InterfaceC22932e> m94762b(@NotNull InterfaceC43161a interfaceC43161a) {
        Intrinsics.checkNotNullParameter(interfaceC43161a, "<this>");
        if (interfaceC43161a instanceof InterfaceC43161a.Common) {
            return CollectionsKt.listOf(((InterfaceC43161a.Common) interfaceC43161a).getContentItem());
        }
        if (interfaceC43161a instanceof InterfaceC43161a.Income) {
            return ((InterfaceC43161a.Income) interfaceC43161a).m94760b();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m94763c(@NotNull String str, @Nullable String str2) {
        int iM66542l;
        Intrinsics.checkNotNullParameter(str, "<this>");
        long jM102349f = C46396e.m102349f("MARGIN_BANNER_CATEGORY_1", str, 0L);
        if (jM102349f == 0) {
            return true;
        }
        if (jM102349f != -1 && (iM66542l = DowngradeExKt.m66542l(str2, 0)) > 0) {
            return m94764d(System.currentTimeMillis(), iM66542l, jM102349f);
        }
        return false;
    }
}
