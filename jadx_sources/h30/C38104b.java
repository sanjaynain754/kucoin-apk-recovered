package h30;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.kubi.router.utils.RouteExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: h30.b */
/* JADX INFO: compiled from: TradeBaseEx.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\f\u0010\b\u001a\u00020\u0004*\u0004\u0018\u00010\t\u001a6\u0010\f\u001a\u00020\r*\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0087\b¢\u0006\u0002\u0010\u0013\u001aD\u0010\u0014\u001a\u00020\r*\u00020\u001528\u0010\u0016\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\r\u0018\u00010\u0017\"\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"getTradeSymbol", "", "text", SessionDescription.ATTR_RANGE, "", "Ljava/math/BigDecimal;", "min", "max", "isHomeRankFavPosition", "Landroid/os/Bundle;", "HOME_RANK_FAV_LIMITE_COUNT", "", "notifyFavContentHigth", "", "Landroid/view/View;", "parentFragment", "Landroidx/fragment/app/Fragment;", "knownHeight", "includeFooter", "(Landroid/view/View;Landroidx/fragment/app/Fragment;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "setFocusChangeListener", "Landroid/widget/EditText;", "call", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "hasFocus", "TradeBaseLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38104b {
    /* JADX INFO: renamed from: b */
    public static final boolean m86030b(@Nullable Bundle bundle) {
        return Intrinsics.areEqual(bundle != null ? RouteExKt.m56284y(bundle, "positionType") : null, "HOME_RANK");
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m86031c(@NotNull BigDecimal bigDecimal, @NotNull BigDecimal min, @NotNull BigDecimal max) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        return bigDecimal.compareTo(min) >= 0 && bigDecimal.compareTo(max) <= 0;
    }

    /* JADX INFO: renamed from: d */
    public static final void m86032d(@NotNull EditText editText, @Nullable final Function2<? super View, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        final View.OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: h30.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                C38104b.m86033e(onFocusChangeListener, function2, view, z11);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final void m86033e(View.OnFocusChangeListener onFocusChangeListener, Function2 function2, View view, boolean z11) {
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
        if (function2 != null) {
            Intrinsics.checkNotNull(view);
            function2.invoke(view, Boolean.valueOf(z11));
        }
    }
}
