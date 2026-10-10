package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes34.dex */
@SuppressLint({"ViewConstructor"})
class GhostViewHolder extends FrameLayout {
    private boolean mAttached;

    @NonNull
    private ViewGroup mParent;

    private static boolean isOnTop(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i11 = 1; i11 < iMin; i11++) {
            View view = arrayList.get(i11);
            View view2 = arrayList2.get(i11);
            if (view != view2) {
                return isOnTop(view, view2);
            }
        }
        return arrayList2.size() == iMin;
    }

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static float getZ(View view) {
            return view.getZ();
        }
    }

    public static GhostViewHolder getHolder(@NonNull ViewGroup viewGroup) {
        return (GhostViewHolder) viewGroup.getTag(C4093R.id.ghost_view_holder);
    }

    private int getInsertIndex(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i11 = 0;
        while (i11 <= childCount) {
            int i12 = (i11 + childCount) / 2;
            getParents(((GhostViewPort) getChildAt(i12)).mView, arrayList2);
            if (isOnTop(arrayList, (ArrayList<View>) arrayList2)) {
                i11 = i12 + 1;
            } else {
                childCount = i12 - 1;
            }
            arrayList2.clear();
        }
        return i11;
    }

    public void addGhostView(GhostViewPort ghostViewPort) {
        ArrayList<View> arrayList = new ArrayList<>();
        getParents(ghostViewPort.mView, arrayList);
        int insertIndex = getInsertIndex(arrayList);
        if (insertIndex < 0 || insertIndex >= getChildCount()) {
            addView(ghostViewPort);
        } else {
            addView(ghostViewPort, insertIndex);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.mAttached) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    public void popToOverlayTop() {
        if (!this.mAttached) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        this.mParent.getOverlay().remove(this);
        this.mParent.getOverlay().add(this);
    }

    public GhostViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.mParent = viewGroup;
        viewGroup.setTag(C4093R.id.ghost_view_holder, this);
        this.mParent.getOverlay().add(this);
        this.mAttached = true;
    }

    private static void getParents(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            getParents((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.mParent.setTag(C4093R.id.ghost_view_holder, null);
            this.mParent.getOverlay().remove(this);
            this.mAttached = false;
        }
    }

    private static boolean isOnTop(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (Api21Impl.getZ(view) != Api21Impl.getZ(view2)) {
            return Api21Impl.getZ(view) > Api21Impl.getZ(view2);
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(ViewGroupUtils.getChildDrawingOrder(viewGroup, i11));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                return true;
            }
        }
        return true;
    }
}
