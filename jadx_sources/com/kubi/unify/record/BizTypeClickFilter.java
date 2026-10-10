package com.kubi.unify.record;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.unify.R$string;
import com.kubi.utils.C27017c;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p203di.AbstractC36711s;
import p761xh.C46203d1;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.unify.record.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BizTypeClickFilter.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/unify/record/BizTypeClickFilter;", "Lcom/kubi/futures/history/filter/TradeTypeClickFilter;", "clickView", "Landroidx/appcompat/widget/AppCompatTextView;", "anchorView", "Landroid/view/View;", "<init>", "(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;)V", "buildTradeTypeList", "", "Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup$TradeTypeAdapter$TradeTypeIndex;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BizTypeClickFilter extends AbstractC36711s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizTypeClickFilter(@NotNull AppCompatTextView clickView, @NotNull View anchorView) {
        super(clickView, anchorView);
        Intrinsics.checkNotNullParameter(clickView, "clickView");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
    }

    @Override // p203di.AbstractC36711s
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<C46203d1.a.TradeTypeIndex> mo65317d() {
        return CollectionsKt.mutableListOf(new C46203d1.a.TradeTypeIndex(C27017c.f54310a.m66516f(R$string.unify_interest_history, new Object[0]), "interest", true));
    }
}
