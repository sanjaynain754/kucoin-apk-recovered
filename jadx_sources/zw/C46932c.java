package zw;

import androidx.core.content.ContextCompat;
import com.kubi.resources.widget.rorbin.badgeview.QBadgeView;
import com.kubi.sdk.res.R$color;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zw.c */
/* JADX INFO: compiled from: BadgeEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, m90084d2 = {"applyCommonRedStyle", "Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;", "getMiddleXWithDot", "", "imgWidth", "", "getMiddleXWithNumber", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46932c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final QBadgeView m103404a(@NotNull QBadgeView qBadgeView) {
        Intrinsics.checkNotNullParameter(qBadgeView, "<this>");
        qBadgeView.m55419B(ContextCompat.getColor(qBadgeView.getContext(), R$color.secondary)).mo55428e(4.0f, true).mo55430g(ContextCompat.getColor(qBadgeView.getContext(), R$color.c_overlay), 1.0f, true).mo55427d(false).mo55432i(8.0f, true);
        return qBadgeView;
    }

    /* JADX INFO: renamed from: b */
    public static final float m103405b(@NotNull QBadgeView qBadgeView, int i11) {
        Intrinsics.checkNotNullParameter(qBadgeView, "<this>");
        return (qBadgeView.getMeasuredWidth() - i11) / 2.0f;
    }

    /* JADX INFO: renamed from: c */
    public static final float m103406c(@NotNull QBadgeView qBadgeView, int i11) {
        Intrinsics.checkNotNullParameter(qBadgeView, "<this>");
        return ((qBadgeView.getMeasuredWidth() - i11) / 2.0f) - (i11 / 4.0f);
    }
}
