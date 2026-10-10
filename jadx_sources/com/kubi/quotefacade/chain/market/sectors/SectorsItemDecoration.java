package com.kubi.quotefacade.chain.market.sectors;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.sectors.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ChainSectorsFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/market/sectors/SectorsItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "<init>", "()V", "dp8", "", "dp16", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainSectorsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainSectorsFragment.kt\ncom/kubi/quotefacade/chain/market/sectors/SectorsItemDecoration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"})
public final class SectorsItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    public final int f41615d = C27040e.m66658b(8);

    /* JADX INFO: renamed from: e */
    public final int f41616e = C27040e.m66658b(16);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        boolean zM6511a = C5303w0.m6511a();
        Integer numValueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            RecyclerView.Adapter adapter = parent.getAdapter();
            int iM66650j = C27039d.m66650j(adapter != null ? Integer.valueOf(adapter.getItemCount()) : null);
            if (iIntValue == 0) {
                if (zM6511a) {
                    outRect.right = this.f41616e;
                    return;
                } else {
                    outRect.left = this.f41616e;
                    return;
                }
            }
            if (iIntValue != iM66650j - 1) {
                if (zM6511a) {
                    outRect.right = this.f41615d;
                    return;
                } else {
                    outRect.left = this.f41615d;
                    return;
                }
            }
            if (zM6511a) {
                outRect.left = this.f41616e;
                outRect.right = this.f41615d;
            } else {
                outRect.left = this.f41615d;
                outRect.right = this.f41616e;
            }
        }
    }
}
