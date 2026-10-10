package com.facebook.react.uimanager;

import androidx.annotation.Nullable;
import com.facebook.react.uimanager.annotations.ReactPropertyHolder;
import com.facebook.yoga.AbstractC6262a;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaGutter;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.YogaWrap;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.Arrays;
import p193d7.AbstractC36629b;
import p193d7.AbstractC36636i;
import p193d7.C36633f;
import p193d7.InterfaceC36628a;
import p193d7.InterfaceC36634g;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
@ReactPropertyHolder
public class ReactShadowNodeImpl implements ReactShadowNode<ReactShadowNodeImpl> {
    private static final AbstractC36629b sYogaConfig = ReactYogaConfigProvider.get();

    @Nullable
    private ArrayList<ReactShadowNodeImpl> mChildren;
    private Integer mHeightMeasureSpec;
    private boolean mIsLayoutOnly;

    @Nullable
    private ReactShadowNodeImpl mLayoutParent;

    @Nullable
    private ArrayList<ReactShadowNodeImpl> mNativeChildren;

    @Nullable
    private ReactShadowNodeImpl mNativeParent;
    private final float[] mPadding;

    @Nullable
    private ReactShadowNodeImpl mParent;
    private int mReactTag;
    private int mRootTag;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;

    @Nullable
    private ThemedReactContext mThemedContext;

    @Nullable
    private String mViewClassName;
    private Integer mWidthMeasureSpec;
    private AbstractC6262a mYogaNode;
    private boolean mNodeUpdated = true;
    private int mTotalNativeChildren = 0;
    private final boolean[] mPaddingIsPercent = new boolean[9];
    private final Spacing mDefaultPadding = new Spacing(0.0f);

    private void getHierarchyInfoWithIndentation(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("  ");
        }
        sb2.append("<");
        sb2.append(getClass().getSimpleName());
        sb2.append(" view='");
        sb2.append(getViewClass());
        sb2.append("' tag=");
        sb2.append(getReactTag());
        if (this.mYogaNode != null) {
            sb2.append(" layout='x:");
            sb2.append(getScreenX());
            sb2.append(" y:");
            sb2.append(getScreenY());
            sb2.append(" w:");
            sb2.append(getLayoutWidth());
            sb2.append(" h:");
            sb2.append(getLayoutHeight());
            sb2.append("'");
        } else {
            sb2.append("(virtual node)");
        }
        sb2.append(">\n");
        if (getChildCount() == 0) {
            return;
        }
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            getChildAt(i13).getHierarchyInfoWithIndentation(sb2, i11 + 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    private void updatePadding() {
        for (int i11 = 0; i11 <= 8; i11++) {
            if (i11 == 0 || i11 == 2 || i11 == 4 || i11 == 5) {
                if (C36633f.m81965a(this.mPadding[i11]) && C36633f.m81965a(this.mPadding[6]) && C36633f.m81965a(this.mPadding[8])) {
                    this.mYogaNode.mo10719c0(YogaEdge.fromInt(i11), this.mDefaultPadding.getRaw(i11));
                } else if (this.mPaddingIsPercent[i11]) {
                    this.mYogaNode.mo10721d0(YogaEdge.fromInt(i11), this.mPadding[i11]);
                } else {
                    this.mYogaNode.mo10719c0(YogaEdge.fromInt(i11), this.mPadding[i11]);
                }
            } else if (i11 == 1 || i11 == 3) {
                if (C36633f.m81965a(this.mPadding[i11]) && C36633f.m81965a(this.mPadding[7]) && C36633f.m81965a(this.mPadding[8])) {
                    this.mYogaNode.mo10719c0(YogaEdge.fromInt(i11), this.mDefaultPadding.getRaw(i11));
                } else if (this.mPaddingIsPercent[i11]) {
                    this.mYogaNode.mo10721d0(YogaEdge.fromInt(i11), this.mPadding[i11]);
                } else {
                    this.mYogaNode.mo10719c0(YogaEdge.fromInt(i11), this.mPadding[i11]);
                }
            } else if (C36633f.m81965a(this.mPadding[i11])) {
                this.mYogaNode.mo10719c0(YogaEdge.fromInt(i11), this.mDefaultPadding.getRaw(i11));
            } else if (this.mPaddingIsPercent[i11]) {
                this.mYogaNode.mo10721d0(YogaEdge.fromInt(i11), this.mPadding[i11]);
            } else {
                this.mYogaNode.mo10719c0(YogaEdge.fromInt(i11), this.mPadding[i11]);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void calculateLayout() {
        calculateLayout(Float.NaN, Float.NaN);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean hoistNativeChildren() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i11) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList<>(4);
        }
        this.mChildren.add(i11, reactShadowNodeImpl);
        reactShadowNodeImpl.mParent = this;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            AbstractC6262a abstractC6262a = reactShadowNodeImpl.mYogaNode;
            if (abstractC6262a == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + reactShadowNodeImpl.toString() + "' to a '" + toString() + "')");
            }
            this.mYogaNode.mo10714a(abstractC6262a, i11);
        }
        markUpdated();
        int totalNativeNodeContributionToParent = reactShadowNodeImpl.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren += totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(totalNativeNodeContributionToParent);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void addNativeChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i11) {
        C38115a.m86045a(getNativeKind() == NativeKind.PARENT);
        C38115a.m86045a(reactShadowNodeImpl.getNativeKind() != NativeKind.NONE);
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i11, reactShadowNodeImpl);
        reactShadowNodeImpl.mNativeParent = this;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void calculateLayout(float f11, float f12) {
        this.mYogaNode.mo10716b(f11, f12);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dispatchUpdates(float f11, float f12, UIViewOperationQueue uIViewOperationQueue, @Nullable NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(uIViewOperationQueue);
        }
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            float f13 = f11 + layoutX;
            int iRound = Math.round(f13);
            float f14 = f12 + layoutY;
            int iRound2 = Math.round(f14);
            int iRound3 = Math.round(f13 + getLayoutWidth());
            int iRound4 = Math.round(f14 + getLayoutHeight());
            int iRound5 = Math.round(layoutX);
            int iRound6 = Math.round(layoutY);
            int i11 = iRound3 - iRound;
            int i12 = iRound4 - iRound2;
            boolean z11 = (iRound5 == this.mScreenX && iRound6 == this.mScreenY && i11 == this.mScreenWidth && i12 == this.mScreenHeight) ? false : true;
            this.mScreenX = iRound5;
            this.mScreenY = iRound6;
            this.mScreenWidth = i11;
            this.mScreenHeight = i12;
            if (z11) {
                if (nativeViewHierarchyOptimizer != null) {
                    nativeViewHierarchyOptimizer.handleUpdateLayout(this);
                } else {
                    uIViewOperationQueue.enqueueUpdateLayout(getParent().getReactTag(), getReactTag(), getScreenX(), getScreenY(), getScreenWidth(), getScreenHeight(), getLayoutDirection());
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dispose() {
        AbstractC6262a abstractC6262a = this.mYogaNode;
        if (abstractC6262a != null) {
            abstractC6262a.mo10746s();
            YogaNodePool.get().release(this.mYogaNode);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getChildAt(int i11) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList != null) {
            return arrayList.get(i11);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i11 + " out of bounds: node has no children");
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getChildCount() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public float getFlex() {
        return this.mYogaNode.mo10720d();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Integer getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public String getHierarchyInfo() {
        StringBuilder sb2 = new StringBuilder();
        getHierarchyInfoWithIndentation(sb2, 0);
        return sb2.toString();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaDirection getLayoutDirection() {
        return this.mYogaNode.mo10724f();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutHeight() {
        return this.mYogaNode.mo10726g();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    @Nullable
    public final ReactShadowNodeImpl getLayoutParent() {
        ReactShadowNodeImpl reactShadowNodeImpl = this.mLayoutParent;
        return reactShadowNodeImpl != null ? reactShadowNodeImpl : getNativeParent();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutWidth() {
        return this.mYogaNode.mo10730i();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutX() {
        return this.mYogaNode.mo10732j();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutY() {
        return this.mYogaNode.mo10734k();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getNativeChildCount() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mNativeChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getNativeOffsetForChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        int totalNativeNodeContributionToParent = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            ReactShadowNodeImpl childAt = getChildAt(i11);
            if (reactShadowNodeImpl == childAt) {
                return totalNativeNodeContributionToParent;
            }
            totalNativeNodeContributionToParent += childAt.getTotalNativeNodeContributionToParent();
        }
        throw new RuntimeException("Child " + reactShadowNodeImpl.getReactTag() + " was not a child of " + this.mReactTag);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    @Nullable
    public final ReactShadowNodeImpl getNativeParent() {
        return this.mNativeParent;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getPadding(int i11) {
        return this.mYogaNode.mo10728h(YogaEdge.fromInt(i11));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    @Nullable
    public final ReactShadowNodeImpl getParent() {
        return this.mParent;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getReactTag() {
        return this.mReactTag;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getRootTag() {
        C38115a.m86045a(this.mRootTag != 0);
        return this.mRootTag;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenX() {
        return this.mScreenX;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenY() {
        return this.mScreenY;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStyleHeight() {
        return this.mYogaNode.mo10722e();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStylePadding(int i11) {
        return this.mYogaNode.mo10736l(YogaEdge.fromInt(i11));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStyleWidth() {
        return this.mYogaNode.mo10738m();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ThemedReactContext getThemedContext() {
        return (ThemedReactContext) C38115a.m86047c(this.mThemedContext);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final String getViewClass() {
        return (String) C38115a.m86047c(this.mViewClassName);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Integer getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasNewLayout() {
        AbstractC6262a abstractC6262a = this.mYogaNode;
        return abstractC6262a != null && abstractC6262a.mo10740n();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasUpdates() {
        return this.mNodeUpdated || hasNewLayout() || isDirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int indexOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(reactShadowNodeImpl);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int indexOfNativeChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        C38115a.m86047c(this.mNativeChildren);
        return this.mNativeChildren.indexOf(reactShadowNodeImpl);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isDescendantOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        for (ReactShadowNodeImpl parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == reactShadowNodeImpl) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean isDirty() {
        AbstractC6262a abstractC6262a = this.mYogaNode;
        return abstractC6262a != null && abstractC6262a.mo10742o();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isMeasureDefined() {
        return this.mYogaNode.mo10743p();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void markLayoutSeen() {
        AbstractC6262a abstractC6262a = this.mYogaNode;
        if (abstractC6262a != null) {
            abstractC6262a.mo10744q();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void markUpdated() {
        if (this.mNodeUpdated) {
            return;
        }
        this.mNodeUpdated = true;
        ReactShadowNodeImpl parent = getParent();
        if (parent != null) {
            parent.markUpdated();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void removeAllNativeChildren() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mNativeChildren;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.mNativeChildren.get(size).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public ReactShadowNodeImpl removeChildAt(int i11) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i11 + " out of bounds: node has no children");
        }
        ReactShadowNodeImpl reactShadowNodeImplRemove = arrayList.remove(i11);
        reactShadowNodeImplRemove.mParent = null;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            this.mYogaNode.mo10745r(i11);
        }
        markUpdated();
        int totalNativeNodeContributionToParent = reactShadowNodeImplRemove.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
        return reactShadowNodeImplRemove;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl removeNativeChildAt(int i11) {
        C38115a.m86047c(this.mNativeChildren);
        ReactShadowNodeImpl reactShadowNodeImplRemove = this.mNativeChildren.remove(i11);
        reactShadowNodeImplRemove.mNativeParent = null;
        return reactShadowNodeImplRemove;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignContent(YogaAlign yogaAlign) {
        this.mYogaNode.mo10747t(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignItems(YogaAlign yogaAlign) {
        this.mYogaNode.mo10748u(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignSelf(YogaAlign yogaAlign) {
        this.mYogaNode.mo10749v(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setBaselineFunction(InterfaceC36628a interfaceC36628a) {
        this.mYogaNode.mo10751x(interfaceC36628a);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setBorder(int i11, float f11) {
        this.mYogaNode.mo10752y(YogaEdge.fromInt(i11), f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setColumnGap(float f11) {
        this.mYogaNode.mo10697J(YogaGutter.COLUMN, f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setColumnGapPercent(float f11) {
        this.mYogaNode.mo10698K(YogaGutter.COLUMN, f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setDefaultPadding(int i11, float f11) {
        this.mDefaultPadding.set(i11, f11);
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setDisplay(YogaDisplay yogaDisplay) {
        this.mYogaNode.mo10689B(yogaDisplay);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlex(float f11) {
        this.mYogaNode.mo10690C(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasis(float f11) {
        this.mYogaNode.mo10691D(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasisAuto() {
        this.mYogaNode.mo10692E();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasisPercent(float f11) {
        this.mYogaNode.mo10693F(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexDirection(YogaFlexDirection yogaFlexDirection) {
        this.mYogaNode.mo10694G(yogaFlexDirection);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexGrow(float f11) {
        this.mYogaNode.mo10695H(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexShrink(float f11) {
        this.mYogaNode.mo10696I(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexWrap(YogaWrap yogaWrap) {
        this.mYogaNode.mo10735k0(yogaWrap);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setGap(float f11) {
        this.mYogaNode.mo10697J(YogaGutter.ALL, f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setGapPercent(float f11) {
        this.mYogaNode.mo10697J(YogaGutter.ALL, f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setJustifyContent(YogaJustify yogaJustify) {
        this.mYogaNode.mo10702O(yogaJustify);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setLayoutDirection(YogaDirection yogaDirection) {
        this.mYogaNode.mo10688A(yogaDirection);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setLayoutParent(@Nullable ReactShadowNodeImpl reactShadowNodeImpl) {
        this.mLayoutParent = reactShadowNodeImpl;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMargin(int i11, float f11) {
        this.mYogaNode.mo10703P(YogaEdge.fromInt(i11), f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMarginAuto(int i11) {
        this.mYogaNode.mo10704Q(YogaEdge.fromInt(i11));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMarginPercent(int i11, float f11) {
        this.mYogaNode.mo10705R(YogaEdge.fromInt(i11), f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMeasureFunction(InterfaceC36634g interfaceC36634g) {
        this.mYogaNode.mo10710W(interfaceC36634g);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setOverflow(YogaOverflow yogaOverflow) {
        this.mYogaNode.mo10717b0(yogaOverflow);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPadding(int i11, float f11) {
        this.mPadding[i11] = f11;
        this.mPaddingIsPercent[i11] = false;
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPaddingPercent(int i11, float f11) {
        this.mPadding[i11] = f11;
        this.mPaddingIsPercent[i11] = !C36633f.m81965a(f11);
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPosition(int i11, float f11) {
        this.mYogaNode.mo10723e0(YogaEdge.fromInt(i11), f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPositionPercent(int i11, float f11) {
        this.mYogaNode.mo10725f0(YogaEdge.fromInt(i11), f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPositionType(YogaPositionType yogaPositionType) {
        this.mYogaNode.mo10727g0(yogaPositionType);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setReactTag(int i11) {
        this.mReactTag = i11;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setRootTag(int i11) {
        this.mRootTag = i11;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setRowGap(float f11) {
        this.mYogaNode.mo10697J(YogaGutter.ROW, f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setRowGapPercent(float f11) {
        this.mYogaNode.mo10698K(YogaGutter.ROW, f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setShouldNotifyOnLayout(boolean z11) {
        this.mShouldNotifyOnLayout = z11;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleAspectRatio(float f11) {
        this.mYogaNode.mo10750w(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeight(float f11) {
        this.mYogaNode.mo10699L(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeightAuto() {
        this.mYogaNode.mo10700M();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeightPercent(float f11) {
        this.mYogaNode.mo10701N(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxHeight(float f11) {
        this.mYogaNode.mo10706S(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxHeightPercent(float f11) {
        this.mYogaNode.mo10707T(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxWidth(float f11) {
        this.mYogaNode.mo10708U(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxWidthPercent(float f11) {
        this.mYogaNode.mo10709V(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinHeight(float f11) {
        this.mYogaNode.mo10711X(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinHeightPercent(float f11) {
        this.mYogaNode.mo10712Y(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinWidth(float f11) {
        this.mYogaNode.mo10713Z(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinWidthPercent(float f11) {
        this.mYogaNode.mo10715a0(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidth(float f11) {
        this.mYogaNode.mo10729h0(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidthAuto() {
        this.mYogaNode.mo10731i0();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidthPercent(float f11) {
        this.mYogaNode.mo10733j0(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setThemedContext(ThemedReactContext themedReactContext) {
        this.mThemedContext = themedReactContext;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    public String toString() {
        return "[" + this.mViewClassName + C33627eb.f69716f + getReactTag() + "]";
    }

    public ReactShadowNodeImpl() {
        float[] fArr = new float[9];
        this.mPadding = fArr;
        if (!isVirtual()) {
            AbstractC6262a abstractC6262aAcquire = YogaNodePool.get().acquire();
            abstractC6262aAcquire = abstractC6262aAcquire == null ? AbstractC36636i.m81968a(sYogaConfig) : abstractC6262aAcquire;
            this.mYogaNode = abstractC6262aAcquire;
            abstractC6262aAcquire.mo10753z(this);
            Arrays.fill(fArr, Float.NaN);
            return;
        }
        this.mYogaNode = null;
    }

    private int getTotalNativeNodeContributionToParent() {
        NativeKind nativeKind = getNativeKind();
        if (nativeKind == NativeKind.NONE) {
            return this.mTotalNativeChildren;
        }
        if (nativeKind != NativeKind.LEAF) {
            return 1;
        }
        return this.mTotalNativeChildren + 1;
    }

    private void updateNativeChildrenCountInParent(int i11) {
        if (getNativeKind() != NativeKind.PARENT) {
            for (ReactShadowNodeImpl parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.mTotalNativeChildren += i11;
                if (parent.getNativeKind() == NativeKind.PARENT) {
                    return;
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Iterable<? extends ReactShadowNode> calculateLayoutOnChildren() {
        if (isVirtualAnchor()) {
            return null;
        }
        return this.mChildren;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dirty() {
        if (!isVirtual()) {
            this.mYogaNode.mo10718c();
        } else if (getParent() != null) {
            getParent().dirty();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean dispatchUpdatesWillChangeLayout(float f11, float f12) {
        if (!hasNewLayout()) {
            return false;
        }
        float layoutX = getLayoutX();
        float layoutY = getLayoutY();
        float f13 = f11 + layoutX;
        int iRound = Math.round(f13);
        float f14 = f12 + layoutY;
        int iRound2 = Math.round(f14);
        int iRound3 = Math.round(f13 + getLayoutWidth());
        int iRound4 = Math.round(f14 + getLayoutHeight());
        int iRound5 = Math.round(layoutX);
        int iRound6 = Math.round(layoutY);
        int i11 = iRound3 - iRound;
        int i12 = iRound4 - iRound2;
        if (iRound5 == this.mScreenX && iRound6 == this.mScreenY && i11 == this.mScreenWidth && i12 == this.mScreenHeight) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public NativeKind getNativeKind() {
        if (!isVirtual() && !isLayoutOnly()) {
            if (hoistNativeChildren()) {
                return NativeKind.LEAF;
            }
            return NativeKind.PARENT;
        }
        return NativeKind.NONE;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void removeAndDisposeAllChildren() {
        if (getChildCount() == 0) {
            return;
        }
        int totalNativeNodeContributionToParent = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.mo10745r(childCount);
            }
            ReactShadowNodeImpl childAt = getChildAt(childCount);
            childAt.mParent = null;
            totalNativeNodeContributionToParent += childAt.getTotalNativeNodeContributionToParent();
            childAt.dispose();
        }
        ((ArrayList) C38115a.m86047c(this.mChildren)).clear();
        markUpdated();
        this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setIsLayoutOnly(boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (getParent() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        C38115a.m86046b(z12, "Must remove from no opt parent first");
        if (this.mNativeParent == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        C38115a.m86046b(z13, "Must remove from native parent first");
        if (getNativeChildCount() == 0) {
            z14 = true;
        }
        C38115a.m86046b(z14, "Must remove all native children first");
        this.mIsLayoutOnly = z11;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMeasureSpecs(int i11, int i12) {
        this.mWidthMeasureSpec = Integer.valueOf(i11);
        this.mHeightMeasureSpec = Integer.valueOf(i12);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void updateProperties(ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerPropertyUpdater.updateProps(this, reactStylesDiffMap);
        onAfterUpdateTransaction();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onAfterUpdateTransaction() {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object obj) {
    }
}
