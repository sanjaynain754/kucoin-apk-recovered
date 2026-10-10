package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.react.common.ReactConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class ViewGroupDrawingOrderHelper {

    @Nullable
    private int[] mDrawingOrderIndices;
    private int mNumberOfChildrenWithZIndex = 0;
    private final ViewGroup mViewGroup;

    public void update() {
        this.mNumberOfChildrenWithZIndex = 0;
        for (int i11 = 0; i11 < this.mViewGroup.getChildCount(); i11++) {
            if (ViewGroupManager.getViewZIndex(this.mViewGroup.getChildAt(i11)) != null) {
                this.mNumberOfChildrenWithZIndex++;
            }
        }
        this.mDrawingOrderIndices = null;
    }

    public int getChildDrawingOrder(int i11, int i12) {
        int[] iArr = this.mDrawingOrderIndices;
        if (iArr != null && (i12 >= iArr.length || iArr[i12] >= i11)) {
            C45999a.m101490K(ReactConstants.TAG, "getChildDrawingOrder index out of bounds! Please check any custom view manipulations you may have done. childCount = %d, index = %d", Integer.valueOf(i11), Integer.valueOf(i12));
            update();
        }
        if (this.mDrawingOrderIndices == null) {
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < i11; i13++) {
                arrayList.add(this.mViewGroup.getChildAt(i13));
            }
            Collections.sort(arrayList, new Comparator<View>() { // from class: com.facebook.react.uimanager.ViewGroupDrawingOrderHelper.1
                @Override // java.util.Comparator
                public int compare(View view, View view2) {
                    Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
                    Integer num = 0;
                    if (viewZIndex == null) {
                        viewZIndex = num;
                    }
                    Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view2);
                    return viewZIndex.intValue() - (viewZIndex2 != null ? viewZIndex2 : 0).intValue();
                }
            });
            this.mDrawingOrderIndices = new int[i11];
            for (int i14 = 0; i14 < i11; i14++) {
                this.mDrawingOrderIndices[i14] = this.mViewGroup.indexOfChild((View) arrayList.get(i14));
            }
        }
        return this.mDrawingOrderIndices[i12];
    }

    public boolean shouldEnableCustomDrawingOrder() {
        return this.mNumberOfChildrenWithZIndex > 0;
    }

    public ViewGroupDrawingOrderHelper(ViewGroup viewGroup) {
        this.mViewGroup = viewGroup;
    }

    public void handleAddView(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.mNumberOfChildrenWithZIndex++;
        }
        this.mDrawingOrderIndices = null;
    }

    public void handleRemoveView(@Nullable View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.mNumberOfChildrenWithZIndex--;
        }
        this.mDrawingOrderIndices = null;
    }
}
