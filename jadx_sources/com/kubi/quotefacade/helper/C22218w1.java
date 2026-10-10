package com.kubi.quotefacade.helper;

import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.kubi.event.api.C12572a;
import com.kubi.quotefacade.favorites.QuoteFavoriteFragment;
import com.kubi.resources.C22912t;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.w1 */
/* JADX INFO: compiled from: QuoteBaseEx.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00006\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\f\u0010\b\u001a\u00020\u0004*\u0004\u0018\u00010\t\u001a\f\u0010\n\u001a\u00020\u0004*\u0004\u0018\u00010\t\u001a3\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"getTradeSymbol", "", "text", SessionDescription.ATTR_RANGE, "", "Ljava/math/BigDecimal;", "min", "max", "isHomeRankFavPosition", "Landroid/os/Bundle;", "isHomeRankPosition", "HOME_RANK_FAV_LIMITE_COUNT", "", "notifyFavContentHigth", "", "Landroid/view/View;", "parentFragment", "Landroidx/fragment/app/Fragment;", "knownHeight", "includeFooter", "(Landroid/view/View;Landroidx/fragment/app/Fragment;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C22218w1 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final CharSequence m52122b(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default(text, "/", 0, false, 6, (Object) null);
        if ((text instanceof C27096v0) && iLastIndexOf$default != -1) {
            C27096v0 c27096v0 = (C27096v0) text;
            c27096v0.setSpan(new AbsoluteSizeSpan(12, true), iLastIndexOf$default, c27096v0.length(), 33);
        }
        return text;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m52123c(@Nullable Bundle bundle) {
        return Intrinsics.areEqual(bundle != null ? RouteExKt.m56284y(bundle, "positionType") : null, "HOME_RANK");
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m52124d(@Nullable Bundle bundle) {
        return Intrinsics.areEqual(bundle != null ? RouteExKt.m56284y(bundle, "positionType") : null, "HOMEPAGE");
    }

    /* JADX INFO: renamed from: e */
    public static final void m52125e(@NotNull final View view, @Nullable final Fragment fragment, @Nullable final Integer num, @Nullable final Boolean bool) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        C22912t.m54416n(view, new Runnable() { // from class: com.kubi.quotefacade.helper.v1
            @Override // java.lang.Runnable
            public final void run() {
                C22218w1.m52127g(fragment, num, view, bool);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m52126f(View view, Fragment fragment, Integer num, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fragment = null;
        }
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            bool = null;
        }
        m52125e(view, fragment, num, bool);
    }

    /* JADX INFO: renamed from: g */
    public static final void m52127g(Fragment fragment, Integer num, View view, Boolean bool) {
        int iM66658b;
        do {
            if (fragment instanceof QuoteFavoriteFragment) {
                break;
            } else {
                fragment = fragment != null ? fragment.getParentFragment() : null;
            }
        } while (fragment != null);
        if (m52123c(fragment != null ? fragment.getArguments() : null)) {
            if ((fragment instanceof QuoteFavoriteFragment ? (QuoteFavoriteFragment) fragment : null) != null) {
                iM66658b = C27040e.m66658b(80);
                if (C27025c.m66566d(bool)) {
                    iM66658b += C27040e.m66658b(40);
                }
            } else {
                iM66658b = 0;
            }
            int iIntValue = num != null ? num.intValue() : view.getMeasuredHeight();
            if (iIntValue > 0) {
                C12572a.m23695d("com.kubi.home.event.HomeEvent:RankFavContentHeight", Integer.valueOf(iIntValue + iM66658b), 0L, 4, null);
            }
        }
    }
}
