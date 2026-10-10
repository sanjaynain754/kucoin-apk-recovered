package p607rv;

import android.graphics.Rect;
import android.view.View;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: rv.a */
/* JADX INFO: compiled from: DistanceUtil.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/utils/DistanceUtil;", "", "<init>", "()V", "getViewDistanceToBottomWindow", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "QuoteFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44177a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44177a f97517a = new C44177a();

    /* JADX INFO: renamed from: a */
    public final int m97396a(@Nullable View view) {
        if (view == null) {
            return -1;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int height = iArr[1] + view.getHeight();
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return (int) ((rect.bottom - height) / view.getResources().getDisplayMetrics().density);
    }
}
