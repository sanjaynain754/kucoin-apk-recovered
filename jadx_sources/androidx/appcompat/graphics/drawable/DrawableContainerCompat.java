package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: loaded from: classes23.dex */
public class DrawableContainerCompat extends Drawable implements Drawable.Callback {
    private static final boolean DEBUG = false;
    private static final boolean DEFAULT_DITHER = true;
    private static final String TAG = "DrawableContainerCompat";
    private Runnable mAnimationRunnable;
    private BlockInvalidateCallback mBlockInvalidateCallback;
    private Drawable mCurrDrawable;
    private DrawableContainerState mDrawableContainerState;
    private long mEnterAnimationEnd;
    private long mExitAnimationEnd;
    private boolean mHasAlpha;
    private Rect mHotspotBounds;
    private Drawable mLastDrawable;
    private boolean mMutated;
    private int mAlpha = 255;
    private int mCurIndex = -1;

    public static class BlockInvalidateCallback implements Drawable.Callback {
        private Drawable.Callback mCallback;

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j11) {
            Drawable.Callback callback = this.mCallback;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j11);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            Drawable.Callback callback = this.mCallback;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        public Drawable.Callback unwrap() {
            Drawable.Callback callback = this.mCallback;
            this.mCallback = null;
            return callback;
        }

        public BlockInvalidateCallback wrap(Drawable.Callback callback) {
            this.mCallback = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
        }
    }

    public static abstract class DrawableContainerState extends Drawable.ConstantState {
        boolean mAutoMirrored;
        boolean mCanConstantState;
        int mChangingConfigurations;
        boolean mCheckedConstantSize;
        boolean mCheckedConstantState;
        boolean mCheckedOpacity;
        boolean mCheckedPadding;
        boolean mCheckedStateful;
        int mChildrenChangingConfigurations;
        ColorFilter mColorFilter;
        int mConstantHeight;
        int mConstantMinimumHeight;
        int mConstantMinimumWidth;
        Rect mConstantPadding;
        boolean mConstantSize;
        int mConstantWidth;
        int mDensity;
        boolean mDither;
        SparseArray<Drawable.ConstantState> mDrawableFutures;
        Drawable[] mDrawables;
        int mEnterFadeDuration;
        int mExitFadeDuration;
        boolean mHasColorFilter;
        boolean mHasTintList;
        boolean mHasTintMode;
        int mLayoutDirection;
        boolean mMutated;
        int mNumChildren;
        int mOpacity;
        final DrawableContainerCompat mOwner;
        Resources mSourceRes;
        boolean mStateful;
        ColorStateList mTintList;
        PorterDuff.Mode mTintMode;
        boolean mVariablePadding;

        public final void clearMutated() {
            this.mMutated = false;
        }

        public void computeConstantSize() {
            this.mCheckedConstantSize = true;
            createAllFutures();
            int i11 = this.mNumChildren;
            Drawable[] drawableArr = this.mDrawables;
            this.mConstantHeight = -1;
            this.mConstantWidth = -1;
            this.mConstantMinimumHeight = 0;
            this.mConstantMinimumWidth = 0;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.mConstantWidth) {
                    this.mConstantWidth = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.mConstantHeight) {
                    this.mConstantHeight = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.mConstantMinimumWidth) {
                    this.mConstantMinimumWidth = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.mConstantMinimumHeight) {
                    this.mConstantMinimumHeight = minimumHeight;
                }
            }
        }

        public void invalidateCache() {
            this.mCheckedOpacity = false;
            this.mCheckedStateful = false;
        }

        private void createAllFutures() {
            SparseArray<Drawable.ConstantState> sparseArray = this.mDrawableFutures;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    this.mDrawables[this.mDrawableFutures.keyAt(i11)] = prepareDrawable(this.mDrawableFutures.valueAt(i11).newDrawable(this.mSourceRes));
                }
                this.mDrawableFutures = null;
            }
        }

        private Drawable prepareDrawable(Drawable drawable) {
            DrawableCompat.setLayoutDirection(drawable, this.mLayoutDirection);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.mOwner);
            return drawableMutate;
        }

        public final int addChild(Drawable drawable) {
            int i11 = this.mNumChildren;
            if (i11 >= this.mDrawables.length) {
                growArray(i11, i11 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.mOwner);
            this.mDrawables[i11] = drawable;
            this.mNumChildren++;
            this.mChildrenChangingConfigurations = drawable.getChangingConfigurations() | this.mChildrenChangingConfigurations;
            invalidateCache();
            this.mConstantPadding = null;
            this.mCheckedPadding = false;
            this.mCheckedConstantSize = false;
            this.mCheckedConstantState = false;
            return i11;
        }

        @RequiresApi(21)
        public final void applyTheme(Resources.Theme theme) {
            if (theme != null) {
                createAllFutures();
                int i11 = this.mNumChildren;
                Drawable[] drawableArr = this.mDrawables;
                for (int i12 = 0; i12 < i11; i12++) {
                    Drawable drawable = drawableArr[i12];
                    if (drawable != null && DrawableCompat.canApplyTheme(drawable)) {
                        DrawableCompat.applyTheme(drawableArr[i12], theme);
                        this.mChildrenChangingConfigurations |= drawableArr[i12].getChangingConfigurations();
                    }
                }
                updateDensity(Api21Impl.getResources(theme));
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @RequiresApi(21)
        public boolean canApplyTheme() {
            int i11 = this.mNumChildren;
            Drawable[] drawableArr = this.mDrawables;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.mDrawableFutures.get(i12);
                    if (constantState != null && Api21Impl.canApplyTheme(constantState)) {
                        return true;
                    }
                } else if (DrawableCompat.canApplyTheme(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public boolean canConstantState() {
            if (this.mCheckedConstantState) {
                return this.mCanConstantState;
            }
            createAllFutures();
            this.mCheckedConstantState = true;
            int i11 = this.mNumChildren;
            Drawable[] drawableArr = this.mDrawables;
            for (int i12 = 0; i12 < i11; i12++) {
                if (drawableArr[i12].getConstantState() == null) {
                    this.mCanConstantState = false;
                    return false;
                }
            }
            this.mCanConstantState = true;
            return true;
        }

        public final int getCapacity() {
            return this.mDrawables.length;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mChangingConfigurations | this.mChildrenChangingConfigurations;
        }

        public final Drawable getChild(int i11) {
            int iIndexOfKey;
            Drawable drawable = this.mDrawables[i11];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.mDrawableFutures;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i11)) < 0) {
                return null;
            }
            Drawable drawablePrepareDrawable = prepareDrawable(this.mDrawableFutures.valueAt(iIndexOfKey).newDrawable(this.mSourceRes));
            this.mDrawables[i11] = drawablePrepareDrawable;
            this.mDrawableFutures.removeAt(iIndexOfKey);
            if (this.mDrawableFutures.size() == 0) {
                this.mDrawableFutures = null;
            }
            return drawablePrepareDrawable;
        }

        public final int getChildCount() {
            return this.mNumChildren;
        }

        public final int getConstantHeight() {
            if (!this.mCheckedConstantSize) {
                computeConstantSize();
            }
            return this.mConstantHeight;
        }

        public final int getConstantMinimumHeight() {
            if (!this.mCheckedConstantSize) {
                computeConstantSize();
            }
            return this.mConstantMinimumHeight;
        }

        public final int getConstantMinimumWidth() {
            if (!this.mCheckedConstantSize) {
                computeConstantSize();
            }
            return this.mConstantMinimumWidth;
        }

        public final Rect getConstantPadding() {
            Rect rect = null;
            if (this.mVariablePadding) {
                return null;
            }
            Rect rect2 = this.mConstantPadding;
            if (rect2 != null || this.mCheckedPadding) {
                return rect2;
            }
            createAllFutures();
            Rect rect3 = new Rect();
            int i11 = this.mNumChildren;
            Drawable[] drawableArr = this.mDrawables;
            for (int i12 = 0; i12 < i11; i12++) {
                if (drawableArr[i12].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i13 = rect3.left;
                    if (i13 > rect.left) {
                        rect.left = i13;
                    }
                    int i14 = rect3.top;
                    if (i14 > rect.top) {
                        rect.top = i14;
                    }
                    int i15 = rect3.right;
                    if (i15 > rect.right) {
                        rect.right = i15;
                    }
                    int i16 = rect3.bottom;
                    if (i16 > rect.bottom) {
                        rect.bottom = i16;
                    }
                }
            }
            this.mCheckedPadding = true;
            this.mConstantPadding = rect;
            return rect;
        }

        public final int getConstantWidth() {
            if (!this.mCheckedConstantSize) {
                computeConstantSize();
            }
            return this.mConstantWidth;
        }

        public final int getEnterFadeDuration() {
            return this.mEnterFadeDuration;
        }

        public final int getExitFadeDuration() {
            return this.mExitFadeDuration;
        }

        public final int getOpacity() {
            if (this.mCheckedOpacity) {
                return this.mOpacity;
            }
            createAllFutures();
            int i11 = this.mNumChildren;
            Drawable[] drawableArr = this.mDrawables;
            int opacity = i11 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i12 = 1; i12 < i11; i12++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i12].getOpacity());
            }
            this.mOpacity = opacity;
            this.mCheckedOpacity = true;
            return opacity;
        }

        public void growArray(int i11, int i12) {
            Drawable[] drawableArr = new Drawable[i12];
            Drawable[] drawableArr2 = this.mDrawables;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i11);
            }
            this.mDrawables = drawableArr;
        }

        public final boolean isConstantSize() {
            return this.mConstantSize;
        }

        public final boolean isStateful() {
            if (this.mCheckedStateful) {
                return this.mStateful;
            }
            createAllFutures();
            int i11 = this.mNumChildren;
            Drawable[] drawableArr = this.mDrawables;
            boolean z11 = false;
            for (int i12 = 0; i12 < i11; i12++) {
                if (drawableArr[i12].isStateful()) {
                    z11 = true;
                    break;
                }
            }
            this.mStateful = z11;
            this.mCheckedStateful = true;
            return z11;
        }

        public void mutate() {
            int i11 = this.mNumChildren;
            Drawable[] drawableArr = this.mDrawables;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.mMutated = true;
        }

        public final void setConstantSize(boolean z11) {
            this.mConstantSize = z11;
        }

        public final void setEnterFadeDuration(int i11) {
            this.mEnterFadeDuration = i11;
        }

        public final void setExitFadeDuration(int i11) {
            this.mExitFadeDuration = i11;
        }

        public final boolean setLayoutDirection(int i11, int i12) {
            int i13 = this.mNumChildren;
            Drawable[] drawableArr = this.mDrawables;
            boolean z11 = false;
            for (int i14 = 0; i14 < i13; i14++) {
                Drawable drawable = drawableArr[i14];
                if (drawable != null) {
                    boolean layoutDirection = DrawableCompat.setLayoutDirection(drawable, i11);
                    if (i14 == i12) {
                        z11 = layoutDirection;
                    }
                }
            }
            this.mLayoutDirection = i11;
            return z11;
        }

        public final void setVariablePadding(boolean z11) {
            this.mVariablePadding = z11;
        }

        public final void updateDensity(Resources resources) {
            if (resources != null) {
                this.mSourceRes = resources;
                int iResolveDensity = DrawableContainerCompat.resolveDensity(resources, this.mDensity);
                int i11 = this.mDensity;
                this.mDensity = iResolveDensity;
                if (i11 != iResolveDensity) {
                    this.mCheckedConstantSize = false;
                    this.mCheckedPadding = false;
                }
            }
        }

        public DrawableContainerState(DrawableContainerState drawableContainerState, DrawableContainerCompat drawableContainerCompat, Resources resources) {
            Resources resources2;
            int i11;
            this.mVariablePadding = false;
            this.mConstantSize = false;
            this.mDither = true;
            this.mEnterFadeDuration = 0;
            this.mExitFadeDuration = 0;
            this.mOwner = drawableContainerCompat;
            if (resources != null) {
                resources2 = resources;
            } else if (drawableContainerState != null) {
                resources2 = drawableContainerState.mSourceRes;
            } else {
                resources2 = null;
            }
            this.mSourceRes = resources2;
            if (drawableContainerState != null) {
                i11 = drawableContainerState.mDensity;
            } else {
                i11 = 0;
            }
            int iResolveDensity = DrawableContainerCompat.resolveDensity(resources, i11);
            this.mDensity = iResolveDensity;
            if (drawableContainerState != null) {
                this.mChangingConfigurations = drawableContainerState.mChangingConfigurations;
                this.mChildrenChangingConfigurations = drawableContainerState.mChildrenChangingConfigurations;
                this.mCheckedConstantState = true;
                this.mCanConstantState = true;
                this.mVariablePadding = drawableContainerState.mVariablePadding;
                this.mConstantSize = drawableContainerState.mConstantSize;
                this.mDither = drawableContainerState.mDither;
                this.mMutated = drawableContainerState.mMutated;
                this.mLayoutDirection = drawableContainerState.mLayoutDirection;
                this.mEnterFadeDuration = drawableContainerState.mEnterFadeDuration;
                this.mExitFadeDuration = drawableContainerState.mExitFadeDuration;
                this.mAutoMirrored = drawableContainerState.mAutoMirrored;
                this.mColorFilter = drawableContainerState.mColorFilter;
                this.mHasColorFilter = drawableContainerState.mHasColorFilter;
                this.mTintList = drawableContainerState.mTintList;
                this.mTintMode = drawableContainerState.mTintMode;
                this.mHasTintList = drawableContainerState.mHasTintList;
                this.mHasTintMode = drawableContainerState.mHasTintMode;
                if (drawableContainerState.mDensity == iResolveDensity) {
                    if (drawableContainerState.mCheckedPadding) {
                        this.mConstantPadding = drawableContainerState.mConstantPadding != null ? new Rect(drawableContainerState.mConstantPadding) : null;
                        this.mCheckedPadding = true;
                    }
                    if (drawableContainerState.mCheckedConstantSize) {
                        this.mConstantWidth = drawableContainerState.mConstantWidth;
                        this.mConstantHeight = drawableContainerState.mConstantHeight;
                        this.mConstantMinimumWidth = drawableContainerState.mConstantMinimumWidth;
                        this.mConstantMinimumHeight = drawableContainerState.mConstantMinimumHeight;
                        this.mCheckedConstantSize = true;
                    }
                }
                if (drawableContainerState.mCheckedOpacity) {
                    this.mOpacity = drawableContainerState.mOpacity;
                    this.mCheckedOpacity = true;
                }
                if (drawableContainerState.mCheckedStateful) {
                    this.mStateful = drawableContainerState.mStateful;
                    this.mCheckedStateful = true;
                }
                Drawable[] drawableArr = drawableContainerState.mDrawables;
                this.mDrawables = new Drawable[drawableArr.length];
                this.mNumChildren = drawableContainerState.mNumChildren;
                SparseArray<Drawable.ConstantState> sparseArray = drawableContainerState.mDrawableFutures;
                if (sparseArray != null) {
                    this.mDrawableFutures = sparseArray.clone();
                } else {
                    this.mDrawableFutures = new SparseArray<>(this.mNumChildren);
                }
                int i12 = this.mNumChildren;
                for (int i13 = 0; i13 < i12; i13++) {
                    Drawable drawable = drawableArr[i13];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.mDrawableFutures.put(i13, constantState);
                        } else {
                            this.mDrawables[i13] = drawableArr[i13];
                        }
                    }
                }
                return;
            }
            this.mDrawables = new Drawable[10];
            this.mNumChildren = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public void animate(boolean z11) {
        boolean z12;
        Drawable drawable;
        long j11;
        boolean z13 = true;
        this.mHasAlpha = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.mCurrDrawable;
        if (drawable2 != null) {
            long j12 = this.mEnterAnimationEnd;
            if (j12 != 0) {
                if (j12 <= jUptimeMillis) {
                    drawable2.setAlpha(this.mAlpha);
                    this.mEnterAnimationEnd = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j12 - jUptimeMillis) * 255)) / this.mDrawableContainerState.mEnterFadeDuration)) * this.mAlpha) / 255);
                    z12 = true;
                }
            }
            drawable = this.mLastDrawable;
            if (drawable != null) {
                j11 = this.mExitAnimationEnd;
                if (j11 == 0) {
                    if (j11 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.mLastDrawable = null;
                        this.mExitAnimationEnd = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j11 - jUptimeMillis) * 255)) / this.mDrawableContainerState.mExitFadeDuration) * this.mAlpha) / 255);
                    }
                }
                if (z11 || !z13) {
                }
                scheduleSelf(this.mAnimationRunnable, jUptimeMillis + 16);
                return;
            }
            this.mExitAnimationEnd = 0L;
            z13 = z12;
            if (z11) {
            }
        }
        this.mEnterAnimationEnd = 0L;
        z12 = false;
        drawable = this.mLastDrawable;
        if (drawable != null) {
            j11 = this.mExitAnimationEnd;
            if (j11 == 0) {
                if (j11 <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.mLastDrawable = null;
                    this.mExitAnimationEnd = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j11 - jUptimeMillis) * 255)) / this.mDrawableContainerState.mExitFadeDuration) * this.mAlpha) / 255);
                }
            }
            if (z11) {
            }
        }
        this.mExitAnimationEnd = 0L;
        z13 = z12;
        if (z11) {
        }
    }

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static boolean canApplyTheme(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void getOutline(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources getResources(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    private void initializeDrawableForDisplay(Drawable drawable) {
        if (this.mBlockInvalidateCallback == null) {
            this.mBlockInvalidateCallback = new BlockInvalidateCallback();
        }
        drawable.setCallback(this.mBlockInvalidateCallback.wrap(drawable.getCallback()));
        try {
            if (this.mDrawableContainerState.mEnterFadeDuration <= 0 && this.mHasAlpha) {
                drawable.setAlpha(this.mAlpha);
            }
            DrawableContainerState drawableContainerState = this.mDrawableContainerState;
            if (drawableContainerState.mHasColorFilter) {
                drawable.setColorFilter(drawableContainerState.mColorFilter);
            } else {
                if (drawableContainerState.mHasTintList) {
                    DrawableCompat.setTintList(drawable, drawableContainerState.mTintList);
                }
                DrawableContainerState drawableContainerState2 = this.mDrawableContainerState;
                if (drawableContainerState2.mHasTintMode) {
                    DrawableCompat.setTintMode(drawable, drawableContainerState2.mTintMode);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.mDrawableContainerState.mDither);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
            DrawableCompat.setAutoMirrored(drawable, this.mDrawableContainerState.mAutoMirrored);
            Rect rect = this.mHotspotBounds;
            if (rect != null) {
                DrawableCompat.setHotspotBounds(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.mBlockInvalidateCallback.unwrap());
        }
    }

    public static int resolveDensity(@Nullable Resources resources, int i11) {
        if (resources != null) {
            i11 = resources.getDisplayMetrics().densityDpi;
        }
        if (i11 == 0) {
            return 160;
        }
        return i11;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        this.mDrawableContainerState.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public boolean canApplyTheme() {
        return this.mDrawableContainerState.canApplyTheme();
    }

    public void clearMutated() {
        this.mDrawableContainerState.clearMutated();
        this.mMutated = false;
    }

    public DrawableContainerState cloneConstantState() {
        return this.mDrawableContainerState;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.mLastDrawable;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mAlpha;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.mDrawableContainerState.canConstantState()) {
            return null;
        }
        this.mDrawableContainerState.mChangingConfigurations = getChangingConfigurations();
        return this.mDrawableContainerState;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.mCurrDrawable;
    }

    public int getCurrentIndex() {
        return this.mCurIndex;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@NonNull Rect rect) {
        Rect rect2 = this.mHotspotBounds;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.mDrawableContainerState.isConstantSize()) {
            return this.mDrawableContainerState.getConstantHeight();
        }
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.mDrawableContainerState.isConstantSize()) {
            return this.mDrawableContainerState.getConstantWidth();
        }
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.mDrawableContainerState.isConstantSize()) {
            return this.mDrawableContainerState.getConstantMinimumHeight();
        }
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.mDrawableContainerState.isConstantSize()) {
            return this.mDrawableContainerState.getConstantMinimumWidth();
        }
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.mCurrDrawable;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.mDrawableContainerState.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            Api21Impl.getOutline(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        boolean padding;
        Rect constantPadding = this.mDrawableContainerState.getConstantPadding();
        if (constantPadding != null) {
            rect.set(constantPadding);
            padding = (constantPadding.right | ((constantPadding.left | constantPadding.top) | constantPadding.bottom)) != 0;
        } else {
            Drawable drawable = this.mCurrDrawable;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (needsMirroring()) {
            int i11 = rect.left;
            rect.left = rect.right;
            rect.right = i11;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        DrawableContainerState drawableContainerState = this.mDrawableContainerState;
        if (drawableContainerState != null) {
            drawableContainerState.invalidateCache();
        }
        if (drawable != this.mCurrDrawable || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.mDrawableContainerState.mAutoMirrored;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.mDrawableContainerState.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z11;
        Drawable drawable = this.mLastDrawable;
        boolean z12 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.mLastDrawable = null;
            z11 = true;
        } else {
            z11 = false;
        }
        Drawable drawable2 = this.mCurrDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.mHasAlpha) {
                this.mCurrDrawable.setAlpha(this.mAlpha);
            }
        }
        if (this.mExitAnimationEnd != 0) {
            this.mExitAnimationEnd = 0L;
            z11 = true;
        }
        if (this.mEnterAnimationEnd != 0) {
            this.mEnterAnimationEnd = 0L;
        } else {
            z12 = z11;
        }
        if (z12) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            DrawableContainerState drawableContainerStateCloneConstantState = cloneConstantState();
            drawableContainerStateCloneConstantState.mutate();
            setConstantState(drawableContainerStateCloneConstantState);
            this.mMutated = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.mLastDrawable;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.mCurrDrawable;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i11) {
        return this.mDrawableContainerState.setLayoutDirection(i11, getCurrentIndex());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i11) {
        Drawable drawable = this.mLastDrawable;
        if (drawable != null) {
            return drawable.setLevel(i11);
        }
        Drawable drawable2 = this.mCurrDrawable;
        if (drawable2 != null) {
            return drawable2.setLevel(i11);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        Drawable drawable = this.mLastDrawable;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.mCurrDrawable;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j11) {
        if (drawable != this.mCurrDrawable || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j11);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public boolean selectDrawable(int i11) {
        if (i11 == this.mCurIndex) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.mDrawableContainerState.mExitFadeDuration > 0) {
            Drawable drawable = this.mLastDrawable;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.mCurrDrawable;
            if (drawable2 != null) {
                this.mLastDrawable = drawable2;
                this.mExitAnimationEnd = ((long) this.mDrawableContainerState.mExitFadeDuration) + jUptimeMillis;
            } else {
                this.mLastDrawable = null;
                this.mExitAnimationEnd = 0L;
            }
        } else {
            Drawable drawable3 = this.mCurrDrawable;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i11 >= 0) {
            DrawableContainerState drawableContainerState = this.mDrawableContainerState;
            if (i11 < drawableContainerState.mNumChildren) {
                Drawable child = drawableContainerState.getChild(i11);
                this.mCurrDrawable = child;
                this.mCurIndex = i11;
                if (child != null) {
                    int i12 = this.mDrawableContainerState.mEnterFadeDuration;
                    if (i12 > 0) {
                        this.mEnterAnimationEnd = jUptimeMillis + ((long) i12);
                    }
                    initializeDrawableForDisplay(child);
                }
            } else {
                this.mCurrDrawable = null;
                this.mCurIndex = -1;
            }
        } else {
            this.mCurrDrawable = null;
            this.mCurIndex = -1;
        }
        if (this.mEnterAnimationEnd != 0 || this.mExitAnimationEnd != 0) {
            Runnable runnable = this.mAnimationRunnable;
            if (runnable == null) {
                this.mAnimationRunnable = new Runnable() { // from class: androidx.appcompat.graphics.drawable.DrawableContainerCompat.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DrawableContainerCompat.this.animate(true);
                        DrawableContainerCompat.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(runnable);
            }
            animate(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.mHasAlpha && this.mAlpha == i11) {
            return;
        }
        this.mHasAlpha = true;
        this.mAlpha = i11;
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            if (this.mEnterAnimationEnd == 0) {
                drawable.setAlpha(i11);
            } else {
                animate(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z11) {
        DrawableContainerState drawableContainerState = this.mDrawableContainerState;
        if (drawableContainerState.mAutoMirrored != z11) {
            drawableContainerState.mAutoMirrored = z11;
            Drawable drawable = this.mCurrDrawable;
            if (drawable != null) {
                DrawableCompat.setAutoMirrored(drawable, z11);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        DrawableContainerState drawableContainerState = this.mDrawableContainerState;
        drawableContainerState.mHasColorFilter = true;
        if (drawableContainerState.mColorFilter != colorFilter) {
            drawableContainerState.mColorFilter = colorFilter;
            Drawable drawable = this.mCurrDrawable;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setConstantState(DrawableContainerState drawableContainerState) {
        this.mDrawableContainerState = drawableContainerState;
        int i11 = this.mCurIndex;
        if (i11 >= 0) {
            Drawable child = drawableContainerState.getChild(i11);
            this.mCurrDrawable = child;
            if (child != null) {
                initializeDrawableForDisplay(child);
            }
        }
        this.mLastDrawable = null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        DrawableContainerState drawableContainerState = this.mDrawableContainerState;
        if (drawableContainerState.mDither != z11) {
            drawableContainerState.mDither = z11;
            Drawable drawable = this.mCurrDrawable;
            if (drawable != null) {
                drawable.setDither(z11);
            }
        }
    }

    public void setEnterFadeDuration(int i11) {
        this.mDrawableContainerState.mEnterFadeDuration = i11;
    }

    public void setExitFadeDuration(int i11) {
        this.mDrawableContainerState.mExitFadeDuration = i11;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f11, float f12) {
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            DrawableCompat.setHotspot(drawable, f11, f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i11, int i12, int i13, int i14) {
        Rect rect = this.mHotspotBounds;
        if (rect == null) {
            this.mHotspotBounds = new Rect(i11, i12, i13, i14);
        } else {
            rect.set(i11, i12, i13, i14);
        }
        Drawable drawable = this.mCurrDrawable;
        if (drawable != null) {
            DrawableCompat.setHotspotBounds(drawable, i11, i12, i13, i14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        DrawableContainerState drawableContainerState = this.mDrawableContainerState;
        drawableContainerState.mHasTintList = true;
        if (drawableContainerState.mTintList != colorStateList) {
            drawableContainerState.mTintList = colorStateList;
            DrawableCompat.setTintList(this.mCurrDrawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        DrawableContainerState drawableContainerState = this.mDrawableContainerState;
        drawableContainerState.mHasTintMode = true;
        if (drawableContainerState.mTintMode != mode) {
            drawableContainerState.mTintMode = mode;
            DrawableCompat.setTintMode(this.mCurrDrawable, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        if (drawable != this.mCurrDrawable || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    public final void updateDensity(Resources resources) {
        this.mDrawableContainerState.updateDensity(resources);
    }

    private boolean needsMirroring() {
        if (isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.mDrawableContainerState.getChangingConfigurations();
    }

    public void setCurrentIndex(int i11) {
        selectDrawable(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@ColorInt int i11) {
        setTintList(ColorStateList.valueOf(i11));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        Drawable drawable = this.mLastDrawable;
        if (drawable != null) {
            drawable.setVisible(z11, z12);
        }
        Drawable drawable2 = this.mCurrDrawable;
        if (drawable2 != null) {
            drawable2.setVisible(z11, z12);
        }
        return visible;
    }
}
