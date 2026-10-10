package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes23.dex */
public class ListViewAutoScrollHelper extends AutoScrollHelper {
    private final ListView mTarget;

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollHorizontally(int i11) {
        return false;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollVertically(int i11) {
        ListView listView = this.mTarget;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i12 = firstVisiblePosition + childCount;
        if (i11 > 0) {
            if (i12 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i11 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public void scrollTargetBy(int i11, int i12) {
        this.mTarget.scrollListBy(i12);
    }

    public ListViewAutoScrollHelper(@NonNull ListView listView) {
        super(listView);
        this.mTarget = listView;
    }
}
