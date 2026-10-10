package t30;

import android.view.View;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.Action;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: t30.e */
/* JADX INFO: compiled from: ViewEx.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0006"}, m90084d2 = {"clickAndClearInputFocus", "", "Landroid/view/View;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "clearInputFocus", "TradeBaseLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44685e {
    /* JADX INFO: renamed from: f */
    public static final Unit m98847f(View view, Action action) throws Exception {
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        KeyboardUtils.m6034f(view);
        if (action != null) {
            action.run();
        }
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
        view.clearFocus();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final void m98843b(@NotNull View view, @Nullable Action action) throws Exception {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        KeyboardUtils.m6034f(view);
        if (action != null) {
            action.run();
        }
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
        view.clearFocus();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m98844c(View view, Action action, int i11, Object obj) throws Exception {
        if ((i11 & 1) != 0) {
            action = null;
        }
        m98843b(view, action);
    }

    /* JADX INFO: renamed from: d */
    public static final void m98845d(@NotNull final View view, @Nullable final Action action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        C27046k.m66710y(view, 1000L, new Function0() { // from class: t30.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44685e.m98847f(view, action);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m98846e(View view, Action action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            action = null;
        }
        m98845d(view, action);
    }
}
