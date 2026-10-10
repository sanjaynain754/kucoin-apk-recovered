package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.C1528R;

/* JADX INFO: loaded from: classes23.dex */
public class MotionButton extends AppCompatButton {
    private Path mPath;
    RectF mRect;
    private float mRound;
    private float mRoundPercent;
    ViewOutlineProvider mViewOutlineProvider;

    public MotionButton(Context context) {
        super(context);
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1528R.styleable.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == C1528R.styleable.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C1528R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float getRound() {
        return this.mRound;
    }

    public float getRoundPercent() {
        return this.mRoundPercent;
    }

    @RequiresApi(21)
    public void setRoundPercent(float f11) {
        boolean z11 = this.mRoundPercent != f11;
        this.mRoundPercent = f11;
        if (f11 != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionButton.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        int width = MotionButton.this.getWidth();
                        int height = MotionButton.this.getHeight();
                        outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionButton.this.mRoundPercent) / 2.0f);
                    }
                };
                this.mViewOutlineProvider = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.mRoundPercent) / 2.0f;
            this.mRect.set(0.0f, 0.0f, width, height);
            this.mPath.reset();
            this.mPath.addRoundRect(this.mRect, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    @RequiresApi(21)
    public void setRound(float f11) {
        boolean z11;
        if (Float.isNaN(f11)) {
            this.mRound = f11;
            float f12 = this.mRoundPercent;
            this.mRoundPercent = -1.0f;
            setRoundPercent(f12);
            return;
        }
        if (this.mRound != f11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mRound = f11;
        if (f11 != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionButton.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.mRound);
                    }
                };
                this.mViewOutlineProvider = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.mRect.set(0.0f, 0.0f, getWidth(), getHeight());
            this.mPath.reset();
            Path path = this.mPath;
            RectF rectF = this.mRect;
            float f13 = this.mRound;
            path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        init(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        init(context, attributeSet);
    }
}
