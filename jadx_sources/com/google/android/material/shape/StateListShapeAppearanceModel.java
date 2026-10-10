package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.annotation.XmlRes;
import com.google.android.material.C7090R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StateListShapeAppearanceModel {
    public static final int CORNER_BOTTOM_LEFT = 4;
    public static final int CORNER_BOTTOM_RIGHT = 8;
    public static final int CORNER_TOP_LEFT = 1;
    public static final int CORNER_TOP_RIGHT = 2;
    private static final int INITIAL_CAPACITY = 10;

    @Nullable
    final StateListCornerSize bottomLeftCornerSizeOverride;

    @Nullable
    final StateListCornerSize bottomRightCornerSizeOverride;

    @NonNull
    final ShapeAppearanceModel defaultShape;

    @NonNull
    final ShapeAppearanceModel[] shapeAppearanceModels;
    final int stateCount;

    @NonNull
    final int[][] stateSpecs;

    @Nullable
    final StateListCornerSize topLeftCornerSizeOverride;

    @Nullable
    final StateListCornerSize topRightCornerSizeOverride;

    public static final class Builder {

        @Nullable
        private StateListCornerSize bottomLeftCornerSizeOverride;

        @Nullable
        private StateListCornerSize bottomRightCornerSizeOverride;

        @NonNull
        private ShapeAppearanceModel defaultShape;

        @NonNull
        private ShapeAppearanceModel[] shapeAppearanceModels;
        private int stateCount;

        @NonNull
        private int[][] stateSpecs;

        @Nullable
        private StateListCornerSize topLeftCornerSizeOverride;

        @Nullable
        private StateListCornerSize topRightCornerSizeOverride;

        private boolean containsFlag(int i11, int i12) {
            return (i12 | i11) == i11;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setCornerSizeOverride(@NonNull StateListCornerSize stateListCornerSize, int i11) {
            if (containsFlag(i11, 1)) {
                this.topLeftCornerSizeOverride = stateListCornerSize;
            }
            if (containsFlag(i11, 2)) {
                this.topRightCornerSizeOverride = stateListCornerSize;
            }
            if (containsFlag(i11, 4)) {
                this.bottomLeftCornerSizeOverride = stateListCornerSize;
            }
            if (containsFlag(i11, 8)) {
                this.bottomRightCornerSizeOverride = stateListCornerSize;
            }
            return this;
        }

        public Builder(@NonNull StateListShapeAppearanceModel stateListShapeAppearanceModel) {
            int i11 = stateListShapeAppearanceModel.stateCount;
            this.stateCount = i11;
            this.defaultShape = stateListShapeAppearanceModel.defaultShape;
            int[][] iArr = stateListShapeAppearanceModel.stateSpecs;
            int[][] iArr2 = new int[iArr.length][];
            this.stateSpecs = iArr2;
            this.shapeAppearanceModels = new ShapeAppearanceModel[stateListShapeAppearanceModel.shapeAppearanceModels.length];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(stateListShapeAppearanceModel.shapeAppearanceModels, 0, this.shapeAppearanceModels, 0, this.stateCount);
            this.topLeftCornerSizeOverride = stateListShapeAppearanceModel.topLeftCornerSizeOverride;
            this.topRightCornerSizeOverride = stateListShapeAppearanceModel.topRightCornerSizeOverride;
            this.bottomLeftCornerSizeOverride = stateListShapeAppearanceModel.bottomLeftCornerSizeOverride;
            this.bottomRightCornerSizeOverride = stateListShapeAppearanceModel.bottomRightCornerSizeOverride;
        }

        private void growArray(int i11, int i12) {
            int[][] iArr = new int[i12][];
            System.arraycopy(this.stateSpecs, 0, iArr, 0, i11);
            this.stateSpecs = iArr;
            ShapeAppearanceModel[] shapeAppearanceModelArr = new ShapeAppearanceModel[i12];
            System.arraycopy(this.shapeAppearanceModels, 0, shapeAppearanceModelArr, 0, i11);
            this.shapeAppearanceModels = shapeAppearanceModelArr;
        }

        private void initialize() {
            this.defaultShape = new ShapeAppearanceModel();
            this.stateSpecs = new int[10][];
            this.shapeAppearanceModels = new ShapeAppearanceModel[10];
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addStateShapeAppearanceModel(@NonNull int[] iArr, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
            int i11 = this.stateCount;
            if (i11 == 0 || iArr.length == 0) {
                this.defaultShape = shapeAppearanceModel;
            }
            if (i11 >= this.stateSpecs.length) {
                growArray(i11, i11 + 10);
            }
            int[][] iArr2 = this.stateSpecs;
            int i12 = this.stateCount;
            iArr2[i12] = iArr;
            this.shapeAppearanceModels[i12] = shapeAppearanceModel;
            this.stateCount = i12 + 1;
            return this;
        }

        @Nullable
        public StateListShapeAppearanceModel build() {
            if (this.stateCount == 0) {
                return null;
            }
            return new StateListShapeAppearanceModel(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder withTransformedCornerSizes(@NonNull ShapeAppearanceModel.CornerSizeUnaryOperator cornerSizeUnaryOperator) {
            ShapeAppearanceModel[] shapeAppearanceModelArr = new ShapeAppearanceModel[this.shapeAppearanceModels.length];
            for (int i11 = 0; i11 < this.stateCount; i11++) {
                shapeAppearanceModelArr[i11] = this.shapeAppearanceModels[i11].withTransformedCornerSizes(cornerSizeUnaryOperator);
            }
            this.shapeAppearanceModels = shapeAppearanceModelArr;
            StateListCornerSize stateListCornerSize = this.topLeftCornerSizeOverride;
            if (stateListCornerSize != null) {
                this.topLeftCornerSizeOverride = stateListCornerSize.withTransformedCornerSizes(cornerSizeUnaryOperator);
            }
            StateListCornerSize stateListCornerSize2 = this.topRightCornerSizeOverride;
            if (stateListCornerSize2 != null) {
                this.topRightCornerSizeOverride = stateListCornerSize2.withTransformedCornerSizes(cornerSizeUnaryOperator);
            }
            StateListCornerSize stateListCornerSize3 = this.bottomLeftCornerSizeOverride;
            if (stateListCornerSize3 != null) {
                this.bottomLeftCornerSizeOverride = stateListCornerSize3.withTransformedCornerSizes(cornerSizeUnaryOperator);
            }
            StateListCornerSize stateListCornerSize4 = this.bottomRightCornerSizeOverride;
            if (stateListCornerSize4 != null) {
                this.bottomRightCornerSizeOverride = stateListCornerSize4.withTransformedCornerSizes(cornerSizeUnaryOperator);
            }
            return this;
        }

        public Builder(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
            initialize();
            addStateShapeAppearanceModel(StateSet.WILD_CARD, shapeAppearanceModel);
        }

        private Builder(@NonNull Context context, @XmlRes int i11) {
            int next;
            initialize();
            try {
                XmlResourceParser xml = context.getResources().getXml(i11);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            StateListShapeAppearanceModel.loadShapeAppearanceModelsFromItems(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
                } catch (Throwable th2) {
                    if (xml != null) {
                        try {
                            xml.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                initialize();
            }
        }
    }

    @Nullable
    public static StateListShapeAppearanceModel create(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i11) {
        int resourceId = typedArray.getResourceId(i11, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new Builder(context, resourceId).build();
        }
        return null;
    }

    private StateListShapeAppearanceModel(@NonNull Builder builder) {
        this.stateCount = builder.stateCount;
        this.defaultShape = builder.defaultShape;
        this.stateSpecs = builder.stateSpecs;
        this.shapeAppearanceModels = builder.shapeAppearanceModels;
        this.topLeftCornerSizeOverride = builder.topLeftCornerSizeOverride;
        this.topRightCornerSizeOverride = builder.topRightCornerSizeOverride;
        this.bottomLeftCornerSizeOverride = builder.bottomLeftCornerSizeOverride;
        this.bottomRightCornerSizeOverride = builder.bottomRightCornerSizeOverride;
    }

    private int indexOfStateSet(int[] iArr) {
        int[][] iArr2 = this.stateSpecs;
        for (int i11 = 0; i11 < this.stateCount; i11++) {
            if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                return i11;
            }
        }
        return -1;
    }

    public static int swapCornerPositionRtl(int i11) {
        int i12 = i11 & 5;
        return ((i11 & 10) >> 1) | (i12 << 1);
    }

    @NonNull
    public ShapeAppearanceModel getDefaultShape(boolean z11) {
        if (!z11 || (this.topLeftCornerSizeOverride == null && this.topRightCornerSizeOverride == null && this.bottomLeftCornerSizeOverride == null && this.bottomRightCornerSizeOverride == null)) {
            return this.defaultShape;
        }
        ShapeAppearanceModel.Builder builder = this.defaultShape.toBuilder();
        StateListCornerSize stateListCornerSize = this.topLeftCornerSizeOverride;
        if (stateListCornerSize != null) {
            builder.setTopLeftCornerSize(stateListCornerSize.getDefaultCornerSize());
        }
        StateListCornerSize stateListCornerSize2 = this.topRightCornerSizeOverride;
        if (stateListCornerSize2 != null) {
            builder.setTopRightCornerSize(stateListCornerSize2.getDefaultCornerSize());
        }
        StateListCornerSize stateListCornerSize3 = this.bottomLeftCornerSizeOverride;
        if (stateListCornerSize3 != null) {
            builder.setBottomLeftCornerSize(stateListCornerSize3.getDefaultCornerSize());
        }
        StateListCornerSize stateListCornerSize4 = this.bottomRightCornerSizeOverride;
        if (stateListCornerSize4 != null) {
            builder.setBottomRightCornerSize(stateListCornerSize4.getDefaultCornerSize());
        }
        return builder.build();
    }

    public int getStateCount() {
        return this.stateCount;
    }

    public boolean isStateful() {
        StateListCornerSize stateListCornerSize;
        StateListCornerSize stateListCornerSize2;
        StateListCornerSize stateListCornerSize3;
        StateListCornerSize stateListCornerSize4;
        return this.stateCount > 1 || ((stateListCornerSize = this.topLeftCornerSizeOverride) != null && stateListCornerSize.isStateful()) || (((stateListCornerSize2 = this.topRightCornerSizeOverride) != null && stateListCornerSize2.isStateful()) || (((stateListCornerSize3 = this.bottomLeftCornerSizeOverride) != null && stateListCornerSize3.isStateful()) || ((stateListCornerSize4 = this.bottomRightCornerSizeOverride) != null && stateListCornerSize4.isStateful())));
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadShapeAppearanceModelsFromItems(@NonNull Builder builder, @NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainStyledAttributes;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        if (theme == null) {
                            typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSet, C7090R.styleable.MaterialShape);
                        } else {
                            typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C7090R.styleable.MaterialShape, 0, 0);
                        }
                        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context, typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.MaterialShape_shapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.MaterialShape_shapeAppearanceOverlay, 0)).build();
                        typedArrayObtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i11 = 0;
                        for (int i12 = 0; i12 < attributeCount; i12++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i12);
                            if (attributeNameResource != C7090R.attr.shapeAppearance && attributeNameResource != C7090R.attr.shapeAppearanceOverlay) {
                                int i13 = i11 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i11] = attributeNameResource;
                                i11 = i13;
                            }
                        }
                        builder.addStateShapeAppearanceModel(StateSet.trimStateSet(iArr, i11), shapeAppearanceModelBuild);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @NonNull
    public ShapeAppearanceModel getShapeForState(@NonNull int[] iArr) {
        int iIndexOfStateSet = indexOfStateSet(iArr);
        if (iIndexOfStateSet < 0) {
            iIndexOfStateSet = indexOfStateSet(StateSet.WILD_CARD);
        }
        if (this.topLeftCornerSizeOverride == null && this.topRightCornerSizeOverride == null && this.bottomLeftCornerSizeOverride == null && this.bottomRightCornerSizeOverride == null) {
            return this.shapeAppearanceModels[iIndexOfStateSet];
        }
        ShapeAppearanceModel.Builder builder = this.shapeAppearanceModels[iIndexOfStateSet].toBuilder();
        StateListCornerSize stateListCornerSize = this.topLeftCornerSizeOverride;
        if (stateListCornerSize != null) {
            builder.setTopLeftCornerSize(stateListCornerSize.getCornerSizeForState(iArr));
        }
        StateListCornerSize stateListCornerSize2 = this.topRightCornerSizeOverride;
        if (stateListCornerSize2 != null) {
            builder.setTopRightCornerSize(stateListCornerSize2.getCornerSizeForState(iArr));
        }
        StateListCornerSize stateListCornerSize3 = this.bottomLeftCornerSizeOverride;
        if (stateListCornerSize3 != null) {
            builder.setBottomLeftCornerSize(stateListCornerSize3.getCornerSizeForState(iArr));
        }
        StateListCornerSize stateListCornerSize4 = this.bottomRightCornerSizeOverride;
        if (stateListCornerSize4 != null) {
            builder.setBottomRightCornerSize(stateListCornerSize4.getCornerSizeForState(iArr));
        }
        return builder.build();
    }

    @NonNull
    public StateListShapeAppearanceModel withTransformedCornerSizes(@NonNull ShapeAppearanceModel.CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().withTransformedCornerSizes(cornerSizeUnaryOperator).build();
    }
}
