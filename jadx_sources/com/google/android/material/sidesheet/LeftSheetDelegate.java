package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes45.dex */
final class LeftSheetDelegate extends SheetDelegate {
    final SideSheetBehavior<? extends View> sheetBehavior;

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getSheetEdge() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean isExpandingOutwards(float f11) {
        return f11 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int calculateInnerMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getCoplanarSiblingAdjacentMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getExpandedOffset() {
        return Math.max(0, this.sheetBehavior.getParentInnerEdge() + this.sheetBehavior.getInnerMargin());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getHiddenOffset() {
        return (-this.sheetBehavior.getChildWidth()) - this.sheetBehavior.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getMaxViewPositionHorizontal() {
        return this.sheetBehavior.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getMinViewPositionHorizontal() {
        return -this.sheetBehavior.getChildWidth();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public void updateCoplanarSiblingAdjacentMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.leftMargin = i11;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public void updateCoplanarSiblingLayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12) {
        if (i11 <= this.sheetBehavior.getParentWidth()) {
            marginLayoutParams.leftMargin = i12;
        }
    }

    public LeftSheetDelegate(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.sheetBehavior = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public float calculateSlideOffset(int i11) {
        float hiddenOffset = getHiddenOffset();
        return (i11 - hiddenOffset) / (getExpandedOffset() - hiddenOffset);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public <V extends View> int getOuterEdge(@NonNull V v11) {
        return v11.getRight() + this.sheetBehavior.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getParentInnerEdge(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean isReleasedCloseToInnerEdge(@NonNull View view) {
        if (view.getRight() < (getExpandedOffset() - getHiddenOffset()) / 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean isSwipeSignificant(float f11, float f12) {
        if (SheetUtils.isSwipeMostlyHorizontal(f11, f12) && Math.abs(f11) > this.sheetBehavior.getSignificantVelocityThreshold()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean shouldHide(@NonNull View view, float f11) {
        if (Math.abs(view.getLeft() + (f11 * this.sheetBehavior.getHideFriction())) > this.sheetBehavior.getHideThreshold()) {
            return true;
        }
        return false;
    }
}
