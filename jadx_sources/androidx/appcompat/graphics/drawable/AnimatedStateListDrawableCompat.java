package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.resources.C0509R;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes23.dex */
public class AnimatedStateListDrawableCompat extends StateListDrawableCompat implements TintAwareDrawable {
    private static final String ELEMENT_ITEM = "item";
    private static final String ELEMENT_TRANSITION = "transition";
    private static final String ITEM_MISSING_DRAWABLE_ERROR = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String LOGTAG = "AnimatedStateListDrawableCompat";
    private static final String TRANSITION_MISSING_DRAWABLE_ERROR = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String TRANSITION_MISSING_FROM_TO_ID = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private boolean mMutated;
    private AnimatedStateListState mState;
    private Transition mTransition;
    private int mTransitionFromIndex;
    private int mTransitionToIndex;

    public static class AnimatableTransition extends Transition {

        /* JADX INFO: renamed from: mA */
        private final Animatable f1189mA;

        public AnimatableTransition(Animatable animatable) {
            super();
            this.f1189mA = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
            this.f1189mA.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
            this.f1189mA.stop();
        }
    }

    public static class AnimatedStateListState extends StateListDrawableCompat.StateListState {
        private static final long REVERSED_BIT = 4294967296L;
        private static final long REVERSIBLE_FLAG_BIT = 8589934592L;
        SparseArrayCompat<Integer> mStateIds;
        LongSparseArray<Long> mTransitions;

        private static long generateTransitionKey(int i11, int i12) {
            return ((long) i12) | (((long) i11) << 32);
        }

        public int getKeyframeIdAt(int i11) {
            if (i11 < 0) {
                return 0;
            }
            return this.mStateIds.get(i11, 0).intValue();
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public void mutate() {
            this.mTransitions = this.mTransitions.m103469clone();
            this.mStateIds = this.mStateIds.m103470clone();
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }

        public AnimatedStateListState(@Nullable AnimatedStateListState animatedStateListState, @NonNull AnimatedStateListDrawableCompat animatedStateListDrawableCompat, @Nullable Resources resources) {
            super(animatedStateListState, animatedStateListDrawableCompat, resources);
            if (animatedStateListState != null) {
                this.mTransitions = animatedStateListState.mTransitions;
                this.mStateIds = animatedStateListState.mStateIds;
            } else {
                this.mTransitions = new LongSparseArray<>();
                this.mStateIds = new SparseArrayCompat<>();
            }
        }

        public int addStateSet(@NonNull int[] iArr, @NonNull Drawable drawable, int i11) {
            int iAddStateSet = super.addStateSet(iArr, drawable);
            this.mStateIds.put(iAddStateSet, Integer.valueOf(i11));
            return iAddStateSet;
        }

        public int addTransition(int i11, int i12, @NonNull Drawable drawable, boolean z11) {
            long j11;
            int iAddChild = super.addChild(drawable);
            long jGenerateTransitionKey = generateTransitionKey(i11, i12);
            if (z11) {
                j11 = REVERSIBLE_FLAG_BIT;
            } else {
                j11 = 0;
            }
            long j12 = iAddChild;
            this.mTransitions.append(jGenerateTransitionKey, Long.valueOf(j12 | j11));
            if (z11) {
                this.mTransitions.append(generateTransitionKey(i12, i11), Long.valueOf(REVERSED_BIT | j12 | j11));
            }
            return iAddChild;
        }

        public int indexOfKeyframe(@NonNull int[] iArr) {
            int iIndexOfStateSet = super.indexOfStateSet(iArr);
            if (iIndexOfStateSet >= 0) {
                return iIndexOfStateSet;
            }
            return super.indexOfStateSet(StateSet.WILD_CARD);
        }

        public int indexOfTransition(int i11, int i12) {
            return (int) this.mTransitions.get(generateTransitionKey(i11, i12), -1L).longValue();
        }

        public boolean isTransitionReversed(int i11, int i12) {
            if ((this.mTransitions.get(generateTransitionKey(i11, i12), -1L).longValue() & REVERSED_BIT) != 0) {
                return true;
            }
            return false;
        }

        public boolean transitionHasReversibleFlag(int i11, int i12) {
            if ((this.mTransitions.get(generateTransitionKey(i11, i12), -1L).longValue() & REVERSIBLE_FLAG_BIT) != 0) {
                return true;
            }
            return false;
        }
    }

    public static class AnimatedVectorDrawableTransition extends Transition {
        private final AnimatedVectorDrawableCompat mAvd;

        public AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            super();
            this.mAvd = animatedVectorDrawableCompat;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
            this.mAvd.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
            this.mAvd.stop();
        }
    }

    public static class AnimationDrawableTransition extends Transition {
        private final ObjectAnimator mAnim;
        private final boolean mHasReversibleFlag;

        public AnimationDrawableTransition(AnimationDrawable animationDrawable, boolean z11, boolean z12) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i11 = z11 ? numberOfFrames - 1 : 0;
            int i12 = z11 ? 0 : numberOfFrames - 1;
            FrameInterpolator frameInterpolator = new FrameInterpolator(animationDrawable, z11);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i11, i12);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(frameInterpolator.getTotalDuration());
            objectAnimatorOfInt.setInterpolator(frameInterpolator);
            this.mHasReversibleFlag = z12;
            this.mAnim = objectAnimatorOfInt;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public boolean canReverse() {
            return this.mHasReversibleFlag;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void reverse() {
            this.mAnim.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
            this.mAnim.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
            this.mAnim.cancel();
        }
    }

    public static class FrameInterpolator implements TimeInterpolator {
        private int[] mFrameTimes;
        private int mFrames;
        private int mTotalDuration;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            int i11 = (int) ((f11 * this.mTotalDuration) + 0.5f);
            int i12 = this.mFrames;
            int[] iArr = this.mFrameTimes;
            int i13 = 0;
            while (i13 < i12) {
                int i14 = iArr[i13];
                if (i11 < i14) {
                    break;
                }
                i11 -= i14;
                i13++;
            }
            return (i13 / i12) + (i13 < i12 ? i11 / this.mTotalDuration : 0.0f);
        }

        public int getTotalDuration() {
            return this.mTotalDuration;
        }

        public FrameInterpolator(AnimationDrawable animationDrawable, boolean z11) {
            updateFrames(animationDrawable, z11);
        }

        public int updateFrames(AnimationDrawable animationDrawable, boolean z11) {
            int i11;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.mFrames = numberOfFrames;
            int[] iArr = this.mFrameTimes;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.mFrameTimes = new int[numberOfFrames];
            }
            int[] iArr2 = this.mFrameTimes;
            int i12 = 0;
            for (int i13 = 0; i13 < numberOfFrames; i13++) {
                if (z11) {
                    i11 = (numberOfFrames - i13) - 1;
                } else {
                    i11 = i13;
                }
                int duration = animationDrawable.getDuration(i11);
                iArr2[i13] = duration;
                i12 += duration;
            }
            this.mTotalDuration = i12;
            return i12;
        }
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public AnimatedStateListDrawableCompat(@Nullable AnimatedStateListState animatedStateListState, @Nullable Resources resources) {
        super(null);
        this.mTransitionToIndex = -1;
        this.mTransitionFromIndex = -1;
        setConstantState(new AnimatedStateListState(animatedStateListState, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    private int parseItem(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0509R.styleable.AnimatedStateListDrawableItem);
        int resourceId = typedArrayObtainAttributes.getResourceId(C0509R.styleable.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = typedArrayObtainAttributes.getResourceId(C0509R.styleable.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable drawable = resourceId2 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId2) : null;
        typedArrayObtainAttributes.recycle();
        int[] iArrExtractStateSet = extractStateSet(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ITEM_MISSING_DRAWABLE_ERROR);
            }
            drawable = xmlPullParser.getName().equals("vector") ? VectorDrawableCompat.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawable != null) {
            return this.mState.addStateSet(iArrExtractStateSet, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ITEM_MISSING_DRAWABLE_ERROR);
    }

    private int parseTransition(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0509R.styleable.AnimatedStateListDrawableTransition);
        int resourceId = typedArrayObtainAttributes.getResourceId(C0509R.styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = typedArrayObtainAttributes.getResourceId(C0509R.styleable.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = typedArrayObtainAttributes.getResourceId(C0509R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable drawable = resourceId3 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId3) : null;
        boolean z11 = typedArrayObtainAttributes.getBoolean(C0509R.styleable.AnimatedStateListDrawableTransition_android_reversible, false);
        typedArrayObtainAttributes.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + TRANSITION_MISSING_DRAWABLE_ERROR);
            }
            drawable = xmlPullParser.getName().equals("animated-vector") ? AnimatedVectorDrawableCompat.createFromXmlInner(context, resources, xmlPullParser, attributeSet, theme) : Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawable == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + TRANSITION_MISSING_DRAWABLE_ERROR);
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.mState.addTransition(resourceId, resourceId2, drawable, z11);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + TRANSITION_MISSING_FROM_TO_ID);
    }

    private boolean selectTransition(int i11) {
        int currentIndex;
        int iIndexOfTransition;
        Transition animatableTransition;
        Transition transition = this.mTransition;
        if (transition == null) {
            currentIndex = getCurrentIndex();
        } else {
            if (i11 == this.mTransitionToIndex) {
                return true;
            }
            if (i11 == this.mTransitionFromIndex && transition.canReverse()) {
                transition.reverse();
                this.mTransitionToIndex = this.mTransitionFromIndex;
                this.mTransitionFromIndex = i11;
                return true;
            }
            currentIndex = this.mTransitionToIndex;
            transition.stop();
        }
        this.mTransition = null;
        this.mTransitionFromIndex = -1;
        this.mTransitionToIndex = -1;
        AnimatedStateListState animatedStateListState = this.mState;
        int keyframeIdAt = animatedStateListState.getKeyframeIdAt(currentIndex);
        int keyframeIdAt2 = animatedStateListState.getKeyframeIdAt(i11);
        if (keyframeIdAt2 == 0 || keyframeIdAt == 0 || (iIndexOfTransition = animatedStateListState.indexOfTransition(keyframeIdAt, keyframeIdAt2)) < 0) {
            return false;
        }
        boolean zTransitionHasReversibleFlag = animatedStateListState.transitionHasReversibleFlag(keyframeIdAt, keyframeIdAt2);
        selectDrawable(iIndexOfTransition);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            animatableTransition = new AnimationDrawableTransition((AnimationDrawable) current, animatedStateListState.isTransitionReversed(keyframeIdAt, keyframeIdAt2), zTransitionHasReversibleFlag);
        } else {
            if (!(current instanceof AnimatedVectorDrawableCompat)) {
                if (current instanceof Animatable) {
                    animatableTransition = new AnimatableTransition((Animatable) current);
                }
                return false;
            }
            animatableTransition = new AnimatedVectorDrawableTransition((AnimatedVectorDrawableCompat) current);
        }
        animatableTransition.start();
        this.mTransition = animatableTransition;
        this.mTransitionFromIndex = currentIndex;
        this.mTransitionToIndex = i11;
        return true;
    }

    private void updateStateFromTypedArray(TypedArray typedArray) {
        AnimatedStateListState animatedStateListState = this.mState;
        animatedStateListState.mChangingConfigurations |= Compatibility.Api21Impl.getChangingConfigurations(typedArray);
        animatedStateListState.setVariablePadding(typedArray.getBoolean(C0509R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, animatedStateListState.mVariablePadding));
        animatedStateListState.setConstantSize(typedArray.getBoolean(C0509R.styleable.AnimatedStateListDrawableCompat_android_constantSize, animatedStateListState.mConstantSize));
        animatedStateListState.setEnterFadeDuration(typedArray.getInt(C0509R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, animatedStateListState.mEnterFadeDuration));
        animatedStateListState.setExitFadeDuration(typedArray.getInt(C0509R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, animatedStateListState.mExitFadeDuration));
        setDither(typedArray.getBoolean(C0509R.styleable.AnimatedStateListDrawableCompat_android_dither, animatedStateListState.mDither));
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public void inflate(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0509R.styleable.AnimatedStateListDrawableCompat);
        setVisible(typedArrayObtainAttributes.getBoolean(C0509R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        updateStateFromTypedArray(typedArrayObtainAttributes);
        updateDensity(resources);
        typedArrayObtainAttributes.recycle();
        inflateChildElements(context, resources, xmlPullParser, attributeSet, theme);
        init();
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            this.mState.mutate();
            this.mMutated = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        int iIndexOfKeyframe = this.mState.indexOfKeyframe(iArr);
        boolean z11 = iIndexOfKeyframe != getCurrentIndex() && (selectTransition(iIndexOfKeyframe) || selectDrawable(iIndexOfKeyframe));
        Drawable current = getCurrent();
        return current != null ? current.setState(iArr) | z11 : z11;
    }

    @Nullable
    public static AnimatedStateListDrawableCompat create(@NonNull Context context, @DrawableRes int i11, @Nullable Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i11);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return createFromXmlInner(context, resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e11) {
            Log.e(LOGTAG, "parser error", e11);
            return null;
        } catch (XmlPullParserException e12) {
            Log.e(LOGTAG, "parser error", e12);
            return null;
        }
    }

    @NonNull
    public static AnimatedStateListDrawableCompat createFromXmlInner(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            AnimatedStateListDrawableCompat animatedStateListDrawableCompat = new AnimatedStateListDrawableCompat();
            animatedStateListDrawableCompat.inflate(context, resources, xmlPullParser, attributeSet, theme);
            return animatedStateListDrawableCompat;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void inflateChildElements(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth) {
                        if (xmlPullParser.getName().equals(ELEMENT_ITEM)) {
                            parseItem(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (xmlPullParser.getName().equals(ELEMENT_TRANSITION)) {
                            parseTransition(context, resources, xmlPullParser, attributeSet, theme);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void init() {
        onStateChange(getState());
    }

    public void addState(@NonNull int[] iArr, @NonNull Drawable drawable, int i11) {
        ObjectsCompat.requireNonNull(drawable);
        this.mState.addStateSet(iArr, drawable, i11);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void addTransition(int i11, int i12, @NonNull T t11, boolean z11) {
        ObjectsCompat.requireNonNull(t11);
        this.mState.addTransition(i11, i12, t11, z11);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public void clearMutated() {
        super.clearMutated();
        this.mMutated = false;
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public AnimatedStateListState cloneConstantState() {
        return new AnimatedStateListState(this.mState, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        Transition transition = this.mTransition;
        if (transition != null) {
            transition.stop();
            this.mTransition = null;
            selectDrawable(this.mTransitionToIndex);
            this.mTransitionToIndex = -1;
            this.mTransitionFromIndex = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public void setConstantState(@NonNull DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.setConstantState(drawableContainerState);
        if (drawableContainerState instanceof AnimatedStateListState) {
            this.mState = (AnimatedStateListState) drawableContainerState;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        Transition transition = this.mTransition;
        if (transition != null && (visible || z12)) {
            if (z11) {
                transition.start();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    public static abstract class Transition {
        private Transition() {
        }

        public boolean canReverse() {
            return false;
        }

        public abstract void start();

        public abstract void stop();

        public void reverse() {
        }
    }
}
