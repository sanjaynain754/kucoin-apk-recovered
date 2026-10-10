package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.widget.C1528R;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes23.dex */
public class ViewTransition {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    public static final String CONSTRAINT_OVERRIDE = "ConstraintOverride";
    public static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    public static final String CUSTOM_METHOD = "CustomMethod";
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    public static final String KEY_FRAME_SET_TAG = "KeyFrameSet";
    static final int LINEAR = 3;
    public static final int ONSTATE_ACTION_DOWN = 1;
    public static final int ONSTATE_ACTION_DOWN_UP = 3;
    public static final int ONSTATE_ACTION_UP = 2;
    public static final int ONSTATE_SHARED_VALUE_SET = 4;
    public static final int ONSTATE_SHARED_VALUE_UNSET = 5;
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "ViewTransition";
    private static final int UNSET = -1;
    static final int VIEWTRANSITIONMODE_ALLSTATES = 1;
    static final int VIEWTRANSITIONMODE_CURRENTSTATE = 0;
    static final int VIEWTRANSITIONMODE_NOSTATE = 2;
    public static final String VIEW_TRANSITION_TAG = "ViewTransition";
    ConstraintSet.Constraint mConstraintDelta;
    Context mContext;
    private int mId;
    KeyFrames mKeyFrames;
    ConstraintSet mSet;
    private int mTargetId;
    private String mTargetString;
    int mViewTransitionMode;
    private int mOnStateTransition = -1;
    private boolean mDisabled = false;
    private int mPathMotionArc = 0;
    private int mDuration = -1;
    private int mUpDuration = -1;
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private int mDefaultInterpolatorID = -1;
    private int mSetsTag = -1;
    private int mClearsTag = -1;
    private int mIfTagSet = -1;
    private int mIfTagNotSet = -1;
    private int mSharedValueTarget = -1;
    private int mSharedValueID = -1;
    private int mSharedValueCurrent = -1;

    public static class Animate {
        private final int mClearsTag;
        float mDpositionDt;
        int mDuration;
        boolean mHoldAt100;
        Interpolator mInterpolator;
        long mLastRender;
        MotionController mMC;
        float mPosition;
        private final int mSetsTag;
        long mStart;
        int mUpDuration;
        ViewTransitionController mVtController;
        KeyCache mCache = new KeyCache();
        boolean mReverse = false;
        Rect mTempRec = new Rect();

        public void reactTo(int i11, float f11, float f12) {
            if (i11 == 1) {
                if (this.mReverse) {
                    return;
                }
                reverse(true);
            } else {
                if (i11 != 2) {
                    return;
                }
                this.mMC.getView().getHitRect(this.mTempRec);
                if (this.mTempRec.contains((int) f11, (int) f12) || this.mReverse) {
                    return;
                }
                reverse(true);
            }
        }

        public void mutate() {
            if (this.mReverse) {
                mutateReverse();
            } else {
                mutateForward();
            }
        }

        public void reverse(boolean z11) {
            int i11;
            this.mReverse = z11;
            if (z11 && (i11 = this.mUpDuration) != -1) {
                this.mDpositionDt = i11 == 0 ? Float.MAX_VALUE : 1.0f / i11;
            }
            this.mVtController.invalidate();
            this.mLastRender = System.nanoTime();
        }

        public Animate(ViewTransitionController viewTransitionController, MotionController motionController, int i11, int i12, int i13, Interpolator interpolator, int i14, int i15) {
            float f11;
            this.mHoldAt100 = false;
            this.mVtController = viewTransitionController;
            this.mMC = motionController;
            this.mDuration = i11;
            this.mUpDuration = i12;
            long jNanoTime = System.nanoTime();
            this.mStart = jNanoTime;
            this.mLastRender = jNanoTime;
            this.mVtController.addAnimation(this);
            this.mInterpolator = interpolator;
            this.mSetsTag = i14;
            this.mClearsTag = i15;
            if (i13 == 3) {
                this.mHoldAt100 = true;
            }
            if (i11 == 0) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = 1.0f / i11;
            }
            this.mDpositionDt = f11;
            mutate();
        }

        public void mutateForward() {
            float interpolation;
            long jNanoTime = System.nanoTime();
            long j11 = jNanoTime - this.mLastRender;
            this.mLastRender = jNanoTime;
            float f11 = this.mPosition + (((float) (j11 * 1.0E-6d)) * this.mDpositionDt);
            this.mPosition = f11;
            if (f11 >= 1.0f) {
                this.mPosition = 1.0f;
            }
            Interpolator interpolator = this.mInterpolator;
            if (interpolator == null) {
                interpolation = this.mPosition;
            } else {
                interpolation = interpolator.getInterpolation(this.mPosition);
            }
            float f12 = interpolation;
            MotionController motionController = this.mMC;
            boolean zInterpolate = motionController.interpolate(motionController.mView, f12, jNanoTime, this.mCache);
            if (this.mPosition >= 1.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, null);
                }
                if (!this.mHoldAt100) {
                    this.mVtController.removeAnimation(this);
                }
            }
            if (this.mPosition >= 1.0f && !zInterpolate) {
                return;
            }
            this.mVtController.invalidate();
        }

        public void mutateReverse() {
            float interpolation;
            long jNanoTime = System.nanoTime();
            long j11 = jNanoTime - this.mLastRender;
            this.mLastRender = jNanoTime;
            float f11 = this.mPosition - (((float) (j11 * 1.0E-6d)) * this.mDpositionDt);
            this.mPosition = f11;
            if (f11 < 0.0f) {
                this.mPosition = 0.0f;
            }
            Interpolator interpolator = this.mInterpolator;
            if (interpolator == null) {
                interpolation = this.mPosition;
            } else {
                interpolation = interpolator.getInterpolation(this.mPosition);
            }
            float f12 = interpolation;
            MotionController motionController = this.mMC;
            boolean zInterpolate = motionController.interpolate(motionController.mView, f12, jNanoTime, this.mCache);
            if (this.mPosition <= 0.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, null);
                }
                this.mVtController.removeAnimation(this);
            }
            if (this.mPosition <= 0.0f && !zInterpolate) {
                return;
            }
            this.mVtController.invalidate();
        }
    }

    public boolean matchesView(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.mTargetId == -1 && this.mTargetString == null) || !checkTags(view)) {
            return false;
        }
        if (view.getId() == this.mTargetId) {
            return true;
        }
        return this.mTargetString != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).constraintTag) != null && str.matches(this.mTargetString);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public ViewTransition(Context context, XmlPullParser xmlPullParser) {
        byte b11;
        this.mContext = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals(CONSTRAINT_OVERRIDE)) {
                                b11 = -1;
                            } else {
                                b11 = 2;
                            }
                            break;
                        case -1239391468:
                            if (!name.equals(KEY_FRAME_SET_TAG)) {
                                b11 = -1;
                            } else {
                                b11 = 1;
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                b11 = -1;
                            } else {
                                b11 = 0;
                            }
                            break;
                        case 366511058:
                            if (!name.equals(CUSTOM_METHOD)) {
                                b11 = -1;
                            } else {
                                b11 = 4;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals(CUSTOM_ATTRIBUTE)) {
                                b11 = -1;
                            } else {
                                b11 = 3;
                            }
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    if (b11 == 0) {
                        parseViewTransitionTags(context, xmlPullParser);
                    } else if (b11 == 1) {
                        this.mKeyFrames = new KeyFrames(context, xmlPullParser);
                    } else if (b11 == 2) {
                        this.mConstraintDelta = ConstraintSet.buildDelta(context, xmlPullParser);
                    } else if (b11 == 3 || b11 == 4) {
                        ConstraintAttribute.parse(context, xmlPullParser, this.mConstraintDelta.mCustomConstraints);
                    } else {
                        Log.e("ViewTransition", Debug.getLoc() + " unknown tag " + name);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(".xml:");
                        sb2.append(xmlPullParser.getLineNumber());
                        Log.e("ViewTransition", sb2.toString());
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            Log.e("ViewTransition", "Error parsing XML resource", e11);
        } catch (XmlPullParserException e12) {
            Log.e("ViewTransition", "Error parsing XML resource", e12);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2272a(ViewTransition viewTransition, View[] viewArr) {
        if (viewTransition.mSetsTag != -1) {
            for (View view : viewArr) {
                view.setTag(viewTransition.mSetsTag, Long.valueOf(System.nanoTime()));
            }
        }
        if (viewTransition.mClearsTag != -1) {
            for (View view2 : viewArr) {
                view2.setTag(viewTransition.mClearsTag, null);
            }
        }
    }

    private void updateTransition(MotionScene.Transition transition, View view) {
        int i11 = this.mDuration;
        if (i11 != -1) {
            transition.setDuration(i11);
        }
        transition.setPathMotionArc(this.mPathMotionArc);
        transition.setInterpolatorInfo(this.mDefaultInterpolator, this.mDefaultInterpolatorString, this.mDefaultInterpolatorID);
        int id2 = view.getId();
        KeyFrames keyFrames = this.mKeyFrames;
        if (keyFrames != null) {
            ArrayList<Key> keyFramesForView = keyFrames.getKeyFramesForView(-1);
            KeyFrames keyFrames2 = new KeyFrames();
            Iterator<Key> it = keyFramesForView.iterator();
            while (it.hasNext()) {
                keyFrames2.addKey(it.next().mo103474clone().setViewId(id2));
            }
            transition.addKeyFrame(keyFrames2);
        }
    }

    public void applyIndependentTransition(ViewTransitionController viewTransitionController, MotionLayout motionLayout, View view) {
        MotionController motionController = new MotionController(view);
        motionController.setBothStates(view);
        this.mKeyFrames.addAllFrames(motionController);
        motionController.setup(motionLayout.getWidth(), motionLayout.getHeight(), this.mDuration, System.nanoTime());
        new Animate(viewTransitionController, motionController, this.mDuration, this.mUpDuration, this.mOnStateTransition, getInterpolator(motionLayout.getContext()), this.mSetsTag, this.mClearsTag);
    }

    public void applyTransition(ViewTransitionController viewTransitionController, MotionLayout motionLayout, int i11, ConstraintSet constraintSet, final View... viewArr) {
        if (this.mDisabled) {
            return;
        }
        int i12 = this.mViewTransitionMode;
        if (i12 == 2) {
            applyIndependentTransition(viewTransitionController, motionLayout, viewArr[0]);
            return;
        }
        if (i12 == 1) {
            for (int i13 : motionLayout.getConstraintSetIds()) {
                if (i13 != i11) {
                    ConstraintSet constraintSet2 = motionLayout.getConstraintSet(i13);
                    for (View view : viewArr) {
                        ConstraintSet.Constraint constraint = constraintSet2.getConstraint(view.getId());
                        ConstraintSet.Constraint constraint2 = this.mConstraintDelta;
                        if (constraint2 != null) {
                            constraint2.applyDelta(constraint);
                            constraint.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
                        }
                    }
                }
            }
        }
        ConstraintSet constraintSet3 = new ConstraintSet();
        constraintSet3.clone(constraintSet);
        for (View view2 : viewArr) {
            ConstraintSet.Constraint constraint3 = constraintSet3.getConstraint(view2.getId());
            ConstraintSet.Constraint constraint4 = this.mConstraintDelta;
            if (constraint4 != null) {
                constraint4.applyDelta(constraint3);
                constraint3.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
            }
        }
        motionLayout.updateState(i11, constraintSet3);
        int i14 = C1528R.id.view_transition;
        motionLayout.updateState(i14, constraintSet);
        motionLayout.setState(i14, -1, -1);
        MotionScene.Transition transition = new MotionScene.Transition(-1, motionLayout.mScene, i14, i11);
        for (View view3 : viewArr) {
            updateTransition(transition, view3);
        }
        motionLayout.setTransition(transition);
        motionLayout.transitionToEnd(new Runnable() { // from class: androidx.constraintlayout.motion.widget.a
            @Override // java.lang.Runnable
            public final void run() {
                ViewTransition.m2272a(this.f2215b, viewArr);
            }
        });
    }

    public boolean checkTags(View view) {
        int i11 = this.mIfTagSet;
        boolean z11 = i11 == -1 || view.getTag(i11) != null;
        int i12 = this.mIfTagNotSet;
        return z11 && (i12 == -1 || view.getTag(i12) == null);
    }

    public int getId() {
        return this.mId;
    }

    public Interpolator getInterpolator(Context context) {
        int i11 = this.mDefaultInterpolator;
        if (i11 == -2) {
            return AnimationUtils.loadInterpolator(context, this.mDefaultInterpolatorID);
        }
        if (i11 == -1) {
            final Easing interpolator = Easing.getInterpolator(this.mDefaultInterpolatorString);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.ViewTransition.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f11) {
                    return (float) interpolator.get(f11);
                }
            };
        }
        if (i11 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i11 == 1) {
            return new AccelerateInterpolator();
        }
        if (i11 == 2) {
            return new DecelerateInterpolator();
        }
        if (i11 == 4) {
            return new BounceInterpolator();
        }
        if (i11 == 5) {
            return new OvershootInterpolator();
        }
        if (i11 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public int getSharedValue() {
        return this.mSharedValueTarget;
    }

    public int getSharedValueCurrent() {
        return this.mSharedValueCurrent;
    }

    public int getSharedValueID() {
        return this.mSharedValueID;
    }

    public int getStateTransition() {
        return this.mOnStateTransition;
    }

    public boolean isEnabled() {
        return !this.mDisabled;
    }

    public void setEnabled(boolean z11) {
        this.mDisabled = !z11;
    }

    public void setId(int i11) {
        this.mId = i11;
    }

    public void setSharedValue(int i11) {
        this.mSharedValueTarget = i11;
    }

    public void setSharedValueCurrent(int i11) {
        this.mSharedValueCurrent = i11;
    }

    public void setSharedValueID(int i11) {
        this.mSharedValueID = i11;
    }

    public void setStateTransition(int i11) {
        this.mOnStateTransition = i11;
    }

    public boolean supports(int i11) {
        int i12 = this.mOnStateTransition;
        if (i12 == 1) {
            return i11 == 0;
        }
        if (i12 == 2) {
            return i11 == 1;
        }
        return i12 == 3 && i11 == 0;
    }

    public String toString() {
        return "ViewTransition(" + Debug.getName(this.mContext, this.mId) + ")";
    }

    private void parseViewTransitionTags(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1528R.styleable.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == C1528R.styleable.ViewTransition_android_id) {
                this.mId = typedArrayObtainStyledAttributes.getResourceId(index, this.mId);
            } else if (index == C1528R.styleable.ViewTransition_motionTarget) {
                if (MotionLayout.IS_IN_EDIT_MODE) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.mTargetId);
                    this.mTargetId = resourceId;
                    if (resourceId == -1) {
                        this.mTargetString = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.mTargetString = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.mTargetId = typedArrayObtainStyledAttributes.getResourceId(index, this.mTargetId);
                }
            } else if (index == C1528R.styleable.ViewTransition_onStateTransition) {
                this.mOnStateTransition = typedArrayObtainStyledAttributes.getInt(index, this.mOnStateTransition);
            } else if (index == C1528R.styleable.ViewTransition_transitionDisable) {
                this.mDisabled = typedArrayObtainStyledAttributes.getBoolean(index, this.mDisabled);
            } else if (index == C1528R.styleable.ViewTransition_pathMotionArc) {
                this.mPathMotionArc = typedArrayObtainStyledAttributes.getInt(index, this.mPathMotionArc);
            } else if (index == C1528R.styleable.ViewTransition_duration) {
                this.mDuration = typedArrayObtainStyledAttributes.getInt(index, this.mDuration);
            } else if (index == C1528R.styleable.ViewTransition_upDuration) {
                this.mUpDuration = typedArrayObtainStyledAttributes.getInt(index, this.mUpDuration);
            } else if (index == C1528R.styleable.ViewTransition_viewTransitionMode) {
                this.mViewTransitionMode = typedArrayObtainStyledAttributes.getInt(index, this.mViewTransitionMode);
            } else if (index == C1528R.styleable.ViewTransition_motionInterpolator) {
                int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i12 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.mDefaultInterpolatorID = resourceId2;
                    if (resourceId2 != -1) {
                        this.mDefaultInterpolator = -2;
                    }
                } else if (i12 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.mDefaultInterpolatorString = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.mDefaultInterpolatorID = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.mDefaultInterpolator = -2;
                    } else {
                        this.mDefaultInterpolator = -1;
                    }
                } else {
                    this.mDefaultInterpolator = typedArrayObtainStyledAttributes.getInteger(index, this.mDefaultInterpolator);
                }
            } else if (index == C1528R.styleable.ViewTransition_setsTag) {
                this.mSetsTag = typedArrayObtainStyledAttributes.getResourceId(index, this.mSetsTag);
            } else if (index == C1528R.styleable.ViewTransition_clearsTag) {
                this.mClearsTag = typedArrayObtainStyledAttributes.getResourceId(index, this.mClearsTag);
            } else if (index == C1528R.styleable.ViewTransition_ifTagSet) {
                this.mIfTagSet = typedArrayObtainStyledAttributes.getResourceId(index, this.mIfTagSet);
            } else if (index == C1528R.styleable.ViewTransition_ifTagNotSet) {
                this.mIfTagNotSet = typedArrayObtainStyledAttributes.getResourceId(index, this.mIfTagNotSet);
            } else if (index == C1528R.styleable.ViewTransition_SharedValueId) {
                this.mSharedValueID = typedArrayObtainStyledAttributes.getResourceId(index, this.mSharedValueID);
            } else if (index == C1528R.styleable.ViewTransition_SharedValue) {
                this.mSharedValueTarget = typedArrayObtainStyledAttributes.getInteger(index, this.mSharedValueTarget);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
