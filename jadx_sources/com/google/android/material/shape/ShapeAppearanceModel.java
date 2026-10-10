package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.C7090R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public class ShapeAppearanceModel {
    public static final int NUM_CORNERS = 4;
    public static final CornerSize PILL = new RelativeCornerSize(0.5f);
    EdgeTreatment bottomEdge;
    CornerTreatment bottomLeftCorner;
    CornerSize bottomLeftCornerSize;
    CornerTreatment bottomRightCorner;
    CornerSize bottomRightCornerSize;
    EdgeTreatment leftEdge;
    EdgeTreatment rightEdge;
    EdgeTreatment topEdge;
    CornerTreatment topLeftCorner;
    CornerSize topLeftCornerSize;
    CornerTreatment topRightCorner;
    CornerSize topRightCornerSize;

    public static final class Builder {

        @NonNull
        private EdgeTreatment bottomEdge;

        @NonNull
        private CornerTreatment bottomLeftCorner;

        @NonNull
        private CornerSize bottomLeftCornerSize;

        @NonNull
        private CornerTreatment bottomRightCorner;

        @NonNull
        private CornerSize bottomRightCornerSize;

        @NonNull
        private EdgeTreatment leftEdge;

        @NonNull
        private EdgeTreatment rightEdge;

        @NonNull
        private EdgeTreatment topEdge;

        @NonNull
        private CornerTreatment topLeftCorner;

        @NonNull
        private CornerSize topLeftCornerSize;

        @NonNull
        private CornerTreatment topRightCorner;

        @NonNull
        private CornerSize topRightCornerSize;

        public Builder() {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@NonNull CornerSize cornerSize) {
            return setTopLeftCornerSize(cornerSize).setTopRightCornerSize(cornerSize).setBottomRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCorners(int i11, @Dimension float f11) {
            return setAllCorners(MaterialShapeUtils.createCornerTreatment(i11)).setAllCornerSizes(f11);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i11, @Dimension float f11) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i11)).setBottomLeftCornerSize(f11);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@Dimension float f11) {
            this.bottomLeftCornerSize = new AbsoluteCornerSize(f11);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i11, @Dimension float f11) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i11)).setBottomRightCornerSize(f11);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@Dimension float f11) {
            this.bottomRightCornerSize = new AbsoluteCornerSize(f11);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i11, @Dimension float f11) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i11)).setTopLeftCornerSize(f11);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@Dimension float f11) {
            this.topLeftCornerSize = new AbsoluteCornerSize(f11);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i11, @Dimension float f11) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i11)).setTopRightCornerSize(f11);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@Dimension float f11) {
            this.topRightCornerSize = new AbsoluteCornerSize(f11);
            return this;
        }

        private static float compatCornerTreatmentSize(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).radius;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).size;
            }
            return -1.0f;
        }

        @NonNull
        public ShapeAppearanceModel build() {
            return new ShapeAppearanceModel(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.bottomEdge = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.bottomLeftCornerSize = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@NonNull CornerSize cornerSize) {
            this.bottomRightCornerSize = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setLeftEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.leftEdge = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setRightEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.rightEdge = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.topEdge = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.topLeftCornerSize = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@NonNull CornerSize cornerSize) {
            this.topRightCornerSize = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCorners(@NonNull CornerTreatment cornerTreatment) {
            return setTopLeftCorner(cornerTreatment).setTopRightCorner(cornerTreatment).setBottomRightCorner(cornerTreatment).setBottomLeftCorner(cornerTreatment);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllEdges(@NonNull EdgeTreatment edgeTreatment) {
            return setLeftEdge(edgeTreatment).setTopEdge(edgeTreatment).setRightEdge(edgeTreatment).setBottomEdge(edgeTreatment);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i11, @NonNull CornerSize cornerSize) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i11)).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i11, @NonNull CornerSize cornerSize) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i11)).setBottomRightCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i11, @NonNull CornerSize cornerSize) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i11)).setTopLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i11, @NonNull CornerSize cornerSize) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i11)).setTopRightCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@Dimension float f11) {
            return setTopLeftCornerSize(f11).setTopRightCornerSize(f11).setBottomRightCornerSize(f11).setBottomLeftCornerSize(f11);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.bottomLeftCorner = cornerTreatment;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setBottomLeftCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.bottomRightCorner = cornerTreatment;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setBottomRightCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.topLeftCorner = cornerTreatment;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setTopLeftCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.topRightCorner = cornerTreatment;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setTopRightCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        public Builder(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.topLeftCorner = shapeAppearanceModel.topLeftCorner;
            this.topRightCorner = shapeAppearanceModel.topRightCorner;
            this.bottomRightCorner = shapeAppearanceModel.bottomRightCorner;
            this.bottomLeftCorner = shapeAppearanceModel.bottomLeftCorner;
            this.topLeftCornerSize = shapeAppearanceModel.topLeftCornerSize;
            this.topRightCornerSize = shapeAppearanceModel.topRightCornerSize;
            this.bottomRightCornerSize = shapeAppearanceModel.bottomRightCornerSize;
            this.bottomLeftCornerSize = shapeAppearanceModel.bottomLeftCornerSize;
            this.topEdge = shapeAppearanceModel.topEdge;
            this.rightEdge = shapeAppearanceModel.rightEdge;
            this.bottomEdge = shapeAppearanceModel.bottomEdge;
            this.leftEdge = shapeAppearanceModel.leftEdge;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface CornerSizeUnaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize);
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(float f11) {
        return toBuilder().setAllCornerSizes(f11).build();
    }

    private ShapeAppearanceModel(@NonNull Builder builder) {
        this.topLeftCorner = builder.topLeftCorner;
        this.topRightCorner = builder.topRightCorner;
        this.bottomRightCorner = builder.bottomRightCorner;
        this.bottomLeftCorner = builder.bottomLeftCorner;
        this.topLeftCornerSize = builder.topLeftCornerSize;
        this.topRightCornerSize = builder.topRightCornerSize;
        this.bottomRightCornerSize = builder.bottomRightCornerSize;
        this.bottomLeftCornerSize = builder.bottomLeftCornerSize;
        this.topEdge = builder.topEdge;
        this.rightEdge = builder.rightEdge;
        this.bottomEdge = builder.bottomEdge;
        this.leftEdge = builder.leftEdge;
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        return builder(context, attributeSet, i11, i12, 0);
    }

    @NonNull
    public EdgeTreatment getBottomEdge() {
        return this.bottomEdge;
    }

    @NonNull
    public CornerTreatment getBottomLeftCorner() {
        return this.bottomLeftCorner;
    }

    @NonNull
    public CornerSize getBottomLeftCornerSize() {
        return this.bottomLeftCornerSize;
    }

    @NonNull
    public CornerTreatment getBottomRightCorner() {
        return this.bottomRightCorner;
    }

    @NonNull
    public CornerSize getBottomRightCornerSize() {
        return this.bottomRightCornerSize;
    }

    @NonNull
    public EdgeTreatment getLeftEdge() {
        return this.leftEdge;
    }

    @NonNull
    public EdgeTreatment getRightEdge() {
        return this.rightEdge;
    }

    @NonNull
    public EdgeTreatment getTopEdge() {
        return this.topEdge;
    }

    @NonNull
    public CornerTreatment getTopLeftCorner() {
        return this.topLeftCorner;
    }

    @NonNull
    public CornerSize getTopLeftCornerSize() {
        return this.topLeftCornerSize;
    }

    @NonNull
    public CornerTreatment getTopRightCorner() {
        return this.topRightCorner;
    }

    @NonNull
    public CornerSize getTopRightCornerSize() {
        return this.topRightCornerSize;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean hasRoundedCorners() {
        return (this.topRightCorner instanceof RoundedCornerTreatment) && (this.topLeftCorner instanceof RoundedCornerTreatment) && (this.bottomRightCorner instanceof RoundedCornerTreatment) && (this.bottomLeftCorner instanceof RoundedCornerTreatment);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect(@NonNull RectF rectF) {
        boolean z11 = this.leftEdge.getClass().equals(EdgeTreatment.class) && this.rightEdge.getClass().equals(EdgeTreatment.class) && this.topEdge.getClass().equals(EdgeTreatment.class) && this.bottomEdge.getClass().equals(EdgeTreatment.class);
        float cornerSize = this.topLeftCornerSize.getCornerSize(rectF);
        return z11 && ((this.topRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.topRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomLeftCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomLeftCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0) && hasRoundedCorners();
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @NonNull
    public String toString() {
        return "[" + getTopLeftCornerSize() + ", " + getTopRightCornerSize() + ", " + getBottomRightCornerSize() + ", " + getBottomLeftCornerSize() + "]";
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(@NonNull CornerSize cornerSize) {
        return toBuilder().setAllCornerSizes(cornerSize).build();
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12, int i13) {
        return builder(context, attributeSet, i11, i12, new AbsoluteCornerSize(i13));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static CornerSize getCornerSize(@NonNull TypedArray typedArray, int i11, @NonNull CornerSize cornerSize) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        if (typedValuePeekValue != null) {
            int i12 = typedValuePeekValue.type;
            if (i12 == 5) {
                return new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i12 == 6) {
                return new RelativeCornerSize(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cornerSize;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ShapeAppearanceModel withTransformedCornerSizes(@NonNull CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().setTopLeftCornerSize(cornerSizeUnaryOperator.apply(getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeUnaryOperator.apply(getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeUnaryOperator.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeUnaryOperator.apply(getBottomRightCornerSize())).build();
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12, @NonNull CornerSize cornerSize) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7090R.styleable.MaterialShape, i11, i12);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return builder(context, resourceId, resourceId2, cornerSize);
    }

    @NonNull
    public static Builder builder(Context context, @StyleRes int i11, @StyleRes int i12) {
        return builder(context, i11, i12, 0);
    }

    @NonNull
    private static Builder builder(Context context, @StyleRes int i11, @StyleRes int i12, int i13) {
        return builder(context, i11, i12, new AbsoluteCornerSize(i13));
    }

    @NonNull
    private static Builder builder(Context context, @StyleRes int i11, @StyleRes int i12, @NonNull CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i11);
        if (i12 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i12, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C7090R.styleable.ShapeAppearance);
        try {
            int i13 = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.ShapeAppearance_cornerFamily, 0);
            int i14 = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.ShapeAppearance_cornerFamilyTopLeft, i13);
            int i15 = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.ShapeAppearance_cornerFamilyTopRight, i13);
            int i16 = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.ShapeAppearance_cornerFamilyBottomRight, i13);
            int i17 = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i13);
            CornerSize cornerSize2 = getCornerSize(typedArrayObtainStyledAttributes, C7090R.styleable.ShapeAppearance_cornerSize, cornerSize);
            CornerSize cornerSize3 = getCornerSize(typedArrayObtainStyledAttributes, C7090R.styleable.ShapeAppearance_cornerSizeTopLeft, cornerSize2);
            CornerSize cornerSize4 = getCornerSize(typedArrayObtainStyledAttributes, C7090R.styleable.ShapeAppearance_cornerSizeTopRight, cornerSize2);
            CornerSize cornerSize5 = getCornerSize(typedArrayObtainStyledAttributes, C7090R.styleable.ShapeAppearance_cornerSizeBottomRight, cornerSize2);
            return new Builder().setTopLeftCorner(i14, cornerSize3).setTopRightCorner(i15, cornerSize4).setBottomRightCorner(i16, cornerSize5).setBottomLeftCorner(i17, getCornerSize(typedArrayObtainStyledAttributes, C7090R.styleable.ShapeAppearance_cornerSizeBottomLeft, cornerSize2));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public ShapeAppearanceModel() {
        this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
    }
}
