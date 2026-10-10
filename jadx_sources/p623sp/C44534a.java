package p623sp;

import android.widget.TextView;
import com.kubi.data.entity.MarginOfflineInfo;
import com.kubi.margin.R$string;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sp.a */
/* JADX INFO: compiled from: MarginOfflineSymbolUIExt.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0006"}, m90084d2 = {"updateSymbolOfflineTimeTagView", "", "tvAlert", "Landroid/widget/TextView;", "offlineInfo", "Lcom/kubi/data/entity/MarginOfflineInfo;", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44534a {
    /* JADX INFO: renamed from: a */
    public static final void m98546a(@NotNull TextView tvAlert, @Nullable MarginOfflineInfo marginOfflineInfo) {
        Long time;
        String strM92633f;
        Intrinsics.checkNotNullParameter(tvAlert, "tvAlert");
        if (marginOfflineInfo == null || (time = marginOfflineInfo.getTime()) == null || (strM92633f = C42179a.m92633f(time.longValue(), null, true, false, null, 13, null)) == null) {
            ViewExtKt.m66577h(tvAlert);
        } else {
            ViewExtKt.m66594y(tvAlert);
            tvAlert.setText(tvAlert.getContext().getString(R$string.kc_margin_delist_tag, strM92633f, "UTC+8"));
        }
    }
}
