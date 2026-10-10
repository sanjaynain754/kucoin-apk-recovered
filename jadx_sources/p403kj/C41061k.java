package p403kj;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.home.realtime.IRealTimeData;
import com.kubi.home.realtime.dialog.DataListAdapter;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kj.k */
/* JADX INFO: compiled from: SwipeToDeleteCallback.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/home/realtime/dialog/SwipeToDeleteCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "adapter", "Lcom/kubi/home/realtime/dialog/DataListAdapter;", "onItemSwiped", "Lkotlin/Function1;", "Lcom/kubi/home/realtime/IRealTimeData;", "", "<init>", "(Lcom/kubi/home/realtime/dialog/DataListAdapter;Lkotlin/jvm/functions/Function1;)V", "onMove", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "target", "onSwiped", "direction", "", "getSwipeDirs", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41061k extends ItemTouchHelper.SimpleCallback {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final DataListAdapter f91275b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function1<IRealTimeData, Unit> f91276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C41061k(@NotNull DataListAdapter adapter, @NotNull Function1<? super IRealTimeData, Unit> onItemSwiped) {
        super(0, 16);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(onItemSwiped, "onItemSwiped");
        this.f91275b = adapter;
        this.f91276c = onItemSwiped;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback
    public int getSwipeDirs(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (viewHolder instanceof DataListAdapter.C14824b) {
            return super.getSwipeDirs(recyclerView, viewHolder);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int direction) {
        IRealTimeData iRealTimeDataM30099i;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int adapterPosition = viewHolder.getAdapterPosition();
        if (!(viewHolder instanceof DataListAdapter.C14824b) || (iRealTimeDataM30099i = this.f91275b.m30099i(adapterPosition)) == null) {
            return;
        }
        this.f91276c.invoke(iRealTimeDataM30099i);
    }
}
