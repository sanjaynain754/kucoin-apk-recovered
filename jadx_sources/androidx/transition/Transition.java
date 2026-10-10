package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.util.Consumer;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<TransitionValues> mEndValuesList;
    private EpicenterCallback mEpicenterCallback;
    private TransitionListener[] mListenersCache;
    private ArrayMap<String, String> mNameOverrides;
    TransitionPropagation mPropagation;
    SeekController mSeekController;
    long mSeekOffsetInParent;
    private ArrayList<TransitionValues> mStartValuesList;
    long mTotalDuration;
    private static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final PathMotion STRAIGHT_PATH_MOTION = new PathMotion() { // from class: androidx.transition.Transition.1
        @Override // androidx.transition.PathMotion
        @NonNull
        public Path getPath(float f11, float f12, float f13, float f14) {
            Path path = new Path();
            path.moveTo(f11, f12);
            path.lineTo(f13, f14);
            return path;
        }
    };
    private static ThreadLocal<ArrayMap<Animator, AnimationInfo>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private TransitionValuesMaps mStartValues = new TransitionValuesMaps();
    private TransitionValuesMaps mEndValues = new TransitionValuesMaps();
    TransitionSet mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    int mNumInstances = 0;
    private boolean mPaused = false;
    boolean mEnded = false;
    private Transition mCloneParent = null;
    private ArrayList<TransitionListener> mListeners = null;
    ArrayList<Animator> mAnimators = new ArrayList<>();
    private PathMotion mPathMotion = STRAIGHT_PATH_MOTION;

    /* JADX INFO: loaded from: classes34.dex */
    public static class ArrayListManager {
        public static <T> ArrayList<T> add(ArrayList<T> arrayList, T t11) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t11)) {
                arrayList.add(t11);
            }
            return arrayList;
        }

        public static <T> ArrayList<T> remove(ArrayList<T> arrayList, T t11) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t11);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        private ArrayListManager() {
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static abstract class EpicenterCallback {
        @Nullable
        public abstract Rect onGetEpicenter(@NonNull Transition transition);
    }

    /* JADX INFO: loaded from: classes34.dex */
    @RequiresApi(26)
    public static class Impl26 {
        @DoNotInline
        public static void setCurrentPlayTime(Animator animator, long j11) {
            ((AnimatorSet) animator).setCurrentPlayTime(j11);
        }

        private Impl26() {
        }

        @DoNotInline
        public static long getTotalDuration(Animator animator) {
            return animator.getTotalDuration();
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface MatchOrder {
    }

    /* JADX INFO: loaded from: classes34.dex */
    @RequiresApi(34)
    public class SeekController extends TransitionListenerAdapter implements TransitionSeekController, DynamicAnimation.OnAnimationUpdateListener {
        private boolean mIsCanceled;
        private boolean mIsReady;
        private Runnable mResetToStartState;
        private SpringAnimation mSpringAnimation;
        private long mCurrentPlayTime = -1;
        private ArrayList<Consumer<TransitionSeekController>> mOnReadyListeners = null;
        private ArrayList<Consumer<TransitionSeekController>> mOnProgressListeners = null;
        private Consumer<TransitionSeekController>[] mListenerCache = null;
        private final VelocityTracker1D mVelocityTracker = new VelocityTracker1D();

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
            this.mIsCanceled = true;
        }

        public void ready() {
            this.mIsReady = true;
            ArrayList<Consumer<TransitionSeekController>> arrayList = this.mOnReadyListeners;
            if (arrayList != null) {
                this.mOnReadyListeners = null;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    arrayList.get(i11).accept(this);
                }
            }
            callProgressListeners();
        }

        public SeekController() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m3788a(SeekController seekController, DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
            if (z11) {
                seekController.getClass();
                return;
            }
            if (f11 >= 1.0f) {
                Transition.this.notifyListeners(TransitionNotification.ON_END, false);
                return;
            }
            long durationMillis = seekController.getDurationMillis();
            Transition transitionAt = ((TransitionSet) Transition.this).getTransitionAt(0);
            Transition transition = transitionAt.mCloneParent;
            transitionAt.mCloneParent = null;
            Transition.this.setCurrentPlayTimeMillis(-1L, seekController.mCurrentPlayTime);
            Transition.this.setCurrentPlayTimeMillis(durationMillis, -1L);
            seekController.mCurrentPlayTime = durationMillis;
            Runnable runnable = seekController.mResetToStartState;
            if (runnable != null) {
                runnable.run();
            }
            Transition.this.mAnimators.clear();
            if (transition != null) {
                transition.notifyListeners(TransitionNotification.ON_END, true);
            }
        }

        private void callProgressListeners() {
            ArrayList<Consumer<TransitionSeekController>> arrayList = this.mOnProgressListeners;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.mOnProgressListeners.size();
            if (this.mListenerCache == null) {
                this.mListenerCache = new Consumer[size];
            }
            Consumer<TransitionSeekController>[] consumerArr = (Consumer[]) this.mOnProgressListeners.toArray(this.mListenerCache);
            this.mListenerCache = null;
            for (int i11 = 0; i11 < size; i11++) {
                consumerArr[i11].accept(this);
                consumerArr[i11] = null;
            }
            this.mListenerCache = consumerArr;
        }

        private void ensureAnimation() {
            if (this.mSpringAnimation != null) {
                return;
            }
            this.mVelocityTracker.addDataPoint(AnimationUtils.currentAnimationTimeMillis(), this.mCurrentPlayTime);
            this.mSpringAnimation = new SpringAnimation(new FloatValueHolder());
            SpringForce springForce = new SpringForce();
            springForce.setDampingRatio(1.0f);
            springForce.setStiffness(200.0f);
            this.mSpringAnimation.setSpring(springForce);
            this.mSpringAnimation.setStartValue(this.mCurrentPlayTime);
            this.mSpringAnimation.addUpdateListener(this);
            this.mSpringAnimation.setStartVelocity(this.mVelocityTracker.calculateVelocity());
            this.mSpringAnimation.setMaxValue(getDurationMillis() + 1);
            this.mSpringAnimation.setMinValue(-1.0f);
            this.mSpringAnimation.setMinimumVisibleChange(4.0f);
            this.mSpringAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: androidx.transition.c
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
                    Transition.SeekController.m3788a(this.f3681a, dynamicAnimation, z11, f11, f12);
                }
            });
        }

        @Override // androidx.transition.TransitionSeekController
        public void addOnProgressChangedListener(@NonNull Consumer<TransitionSeekController> consumer) {
            if (this.mOnProgressListeners == null) {
                this.mOnProgressListeners = new ArrayList<>();
            }
            this.mOnProgressListeners.add(consumer);
        }

        @Override // androidx.transition.TransitionSeekController
        public void animateToStart(@NonNull Runnable runnable) {
            this.mResetToStartState = runnable;
            ensureAnimation();
            this.mSpringAnimation.animateToFinalPosition(0.0f);
        }

        @Override // androidx.transition.TransitionSeekController
        public long getDurationMillis() {
            return Transition.this.getTotalDurationMillis();
        }

        @Override // androidx.transition.TransitionSeekController
        public boolean isReady() {
            return this.mIsReady;
        }

        @Override // androidx.transition.TransitionSeekController
        public void removeOnProgressChangedListener(@NonNull Consumer<TransitionSeekController> consumer) {
            ArrayList<Consumer<TransitionSeekController>> arrayList = this.mOnProgressListeners;
            if (arrayList != null) {
                arrayList.remove(consumer);
            }
        }

        @Override // androidx.transition.TransitionSeekController
        public void removeOnReadyListener(@NonNull Consumer<TransitionSeekController> consumer) {
            ArrayList<Consumer<TransitionSeekController>> arrayList = this.mOnReadyListeners;
            if (arrayList != null) {
                arrayList.remove(consumer);
                if (this.mOnReadyListeners.isEmpty()) {
                    this.mOnReadyListeners = null;
                }
            }
        }

        @Override // androidx.transition.TransitionSeekController
        public void setCurrentFraction(float f11) {
            if (this.mSpringAnimation != null) {
                throw new IllegalStateException("setCurrentFraction() called after animation has been started");
            }
            setCurrentPlayTimeMillis((long) (f11 * getDurationMillis()));
        }

        @Override // androidx.transition.TransitionSeekController
        public void setCurrentPlayTimeMillis(long j11) {
            if (this.mSpringAnimation != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j11 == this.mCurrentPlayTime || !isReady()) {
                return;
            }
            if (!this.mIsCanceled) {
                if (j11 != 0 || this.mCurrentPlayTime <= 0) {
                    long durationMillis = getDurationMillis();
                    if (j11 == durationMillis && this.mCurrentPlayTime < durationMillis) {
                        j11 = 1 + durationMillis;
                    }
                } else {
                    j11 = -1;
                }
                long j12 = this.mCurrentPlayTime;
                if (j11 != j12) {
                    Transition.this.setCurrentPlayTimeMillis(j11, j12);
                    this.mCurrentPlayTime = j11;
                }
            }
            callProgressListeners();
            this.mVelocityTracker.addDataPoint(AnimationUtils.currentAnimationTimeMillis(), j11);
        }

        @Override // androidx.transition.TransitionSeekController
        public void addOnReadyListener(@NonNull Consumer<TransitionSeekController> consumer) {
            if (isReady()) {
                consumer.accept(this);
                return;
            }
            if (this.mOnReadyListeners == null) {
                this.mOnReadyListeners = new ArrayList<>();
            }
            this.mOnReadyListeners.add(consumer);
        }

        @Override // androidx.transition.TransitionSeekController
        public void animateToEnd() {
            ensureAnimation();
            this.mSpringAnimation.animateToFinalPosition(getDurationMillis() + 1);
        }

        @Override // androidx.transition.TransitionSeekController
        public float getCurrentFraction() {
            return getCurrentPlayTimeMillis() / getDurationMillis();
        }

        @Override // androidx.transition.TransitionSeekController
        public long getCurrentPlayTimeMillis() {
            return Math.min(getDurationMillis(), Math.max(0L, this.mCurrentPlayTime));
        }

        public void initPlayTime() {
            long j11 = 0;
            if (getDurationMillis() == 0) {
                j11 = 1;
            }
            Transition.this.setCurrentPlayTimeMillis(j11, this.mCurrentPlayTime);
            this.mCurrentPlayTime = j11;
        }

        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
        public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f11, float f12) {
            long jMax = Math.max(-1L, Math.min(getDurationMillis() + 1, Math.round(f11)));
            Transition.this.setCurrentPlayTimeMillis(jMax, this.mCurrentPlayTime);
            this.mCurrentPlayTime = jMax;
            callProgressListeners();
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public interface TransitionListener {
        void onTransitionCancel(@NonNull Transition transition);

        void onTransitionEnd(@NonNull Transition transition);

        default void onTransitionEnd(@NonNull Transition transition, boolean z11) {
            onTransitionEnd(transition);
        }

        void onTransitionPause(@NonNull Transition transition);

        void onTransitionResume(@NonNull Transition transition);

        void onTransitionStart(@NonNull Transition transition);

        default void onTransitionStart(@NonNull Transition transition, boolean z11) {
            onTransitionStart(transition);
        }
    }

    public Transition() {
    }

    private void addUnmatched(ArrayMap<View, TransitionValues> arrayMap, ArrayMap<View, TransitionValues> arrayMap2) {
        for (int i11 = 0; i11 < arrayMap.getSize(); i11++) {
            TransitionValues transitionValuesValueAt = arrayMap.valueAt(i11);
            if (isValidTarget(transitionValuesValueAt.view)) {
                this.mStartValuesList.add(transitionValuesValueAt);
                this.mEndValuesList.add(null);
            }
        }
        for (int i12 = 0; i12 < arrayMap2.getSize(); i12++) {
            TransitionValues transitionValuesValueAt2 = arrayMap2.valueAt(i12);
            if (isValidTarget(transitionValuesValueAt2.view)) {
                this.mEndValuesList.add(transitionValuesValueAt2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static boolean isValidMatch(int i11) {
        return i11 >= 1 && i11 <= 4;
    }

    @NonNull
    public Transition addTarget(@NonNull View view) {
        this.mTargets.add(view);
        return this;
    }

    public abstract void captureEndValues(@NonNull TransitionValues transitionValues);

    public abstract void captureStartValues(@NonNull TransitionValues transitionValues);

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        return null;
    }

    @NonNull
    public Transition excludeChildren(@NonNull View view, boolean z11) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z11);
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z11) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z11);
        return this;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return null;
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public boolean isTransitionRequired(@Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (isValueChanged(transitionValues, transitionValues2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = transitionValues.values.keySet().iterator();
                while (it.hasNext()) {
                    if (isValueChanged(transitionValues, transitionValues2, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @NonNull
    public Transition removeTarget(@NonNull View view) {
        this.mTargets.remove(view);
        return this;
    }

    @NonNull
    public String toString() {
        return toString("");
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class AnimationInfo {
        Animator mAnimator;
        String mName;
        Transition mTransition;
        TransitionValues mValues;
        View mView;
        WindowId mWindowId;

        public AnimationInfo(View view, String str, Transition transition, WindowId windowId, TransitionValues transitionValues, Animator animator) {
            this.mView = view;
            this.mName = str;
            this.mValues = transitionValues;
            this.mWindowId = windowId;
            this.mTransition = transition;
            this.mAnimator = animator;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public interface TransitionNotification {
        public static final TransitionNotification ON_START = new TransitionNotification() { // from class: androidx.transition.d
            @Override // androidx.transition.Transition.TransitionNotification
            public final void notifyListener(Transition.TransitionListener transitionListener, Transition transition, boolean z11) {
                transitionListener.onTransitionStart(transition, z11);
            }
        };
        public static final TransitionNotification ON_END = new TransitionNotification() { // from class: androidx.transition.e
            @Override // androidx.transition.Transition.TransitionNotification
            public final void notifyListener(Transition.TransitionListener transitionListener, Transition transition, boolean z11) {
                transitionListener.onTransitionEnd(transition, z11);
            }
        };
        public static final TransitionNotification ON_CANCEL = new TransitionNotification() { // from class: androidx.transition.f
            @Override // androidx.transition.Transition.TransitionNotification
            public final void notifyListener(Transition.TransitionListener transitionListener, Transition transition, boolean z11) {
                transitionListener.onTransitionCancel(transition);
            }
        };
        public static final TransitionNotification ON_PAUSE = new TransitionNotification() { // from class: androidx.transition.g
            @Override // androidx.transition.Transition.TransitionNotification
            public final void notifyListener(Transition.TransitionListener transitionListener, Transition transition, boolean z11) {
                transitionListener.onTransitionPause(transition);
            }
        };
        public static final TransitionNotification ON_RESUME = new TransitionNotification() { // from class: androidx.transition.h
            @Override // androidx.transition.Transition.TransitionNotification
            public final void notifyListener(Transition.TransitionListener transitionListener, Transition transition, boolean z11) {
                transitionListener.onTransitionResume(transition);
            }
        };

        void notifyListener(@NonNull TransitionListener transitionListener, @NonNull Transition transition, boolean z11);
    }

    private static void addViewValues(TransitionValuesMaps transitionValuesMaps, View view, TransitionValues transitionValues) {
        transitionValuesMaps.mViewValues.put(view, transitionValues);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (transitionValuesMaps.mIdValues.indexOfKey(id2) >= 0) {
                transitionValuesMaps.mIdValues.put(id2, null);
            } else {
                transitionValuesMaps.mIdValues.put(id2, view);
            }
        }
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            if (transitionValuesMaps.mNameValues.containsKey(transitionName)) {
                transitionValuesMaps.mNameValues.put(transitionName, null);
            } else {
                transitionValuesMaps.mNameValues.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (transitionValuesMaps.mItemIdValues.indexOfKey(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    transitionValuesMaps.mItemIdValues.put(itemIdAtPosition, view);
                    return;
                }
                View view2 = transitionValuesMaps.mItemIdValues.get(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    transitionValuesMaps.mItemIdValues.put(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean alreadyContains(int[] iArr, int i11) {
        int i12 = iArr[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            if (iArr[i13] == i12) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view, boolean z11) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (this.mTargetTypeExcludes.get(i11).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    TransitionValues transitionValues = new TransitionValues(view);
                    if (z11) {
                        captureStartValues(transitionValues);
                    } else {
                        captureEndValues(transitionValues);
                    }
                    transitionValues.mTargetedTransitions.add(this);
                    capturePropagationValues(transitionValues);
                    if (z11) {
                        addViewValues(this.mStartValues, view, transitionValues);
                    } else {
                        addViewValues(this.mEndValues, view, transitionValues);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    if (this.mTargetTypeChildExcludes.get(i12).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                                captureHierarchy(viewGroup.getChildAt(i13), z11);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i11, boolean z11) {
        if (i11 > 0) {
            return z11 ? ArrayListManager.add(arrayList, Integer.valueOf(i11)) : ArrayListManager.remove(arrayList, Integer.valueOf(i11));
        }
        return arrayList;
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t11, boolean z11) {
        if (t11 != null) {
            return z11 ? ArrayListManager.add(arrayList, t11) : ArrayListManager.remove(arrayList, t11);
        }
        return arrayList;
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z11) {
        if (cls != null) {
            return z11 ? ArrayListManager.add(arrayList, cls) : ArrayListManager.remove(arrayList, cls);
        }
        return arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z11) {
        if (view != null) {
            return z11 ? ArrayListManager.add(arrayList, view) : ArrayListManager.remove(arrayList, view);
        }
        return arrayList;
    }

    private static ArrayMap<Animator, AnimationInfo> getRunningAnimators() {
        ArrayMap<Animator, AnimationInfo> arrayMap = sRunningAnimators.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap<Animator, AnimationInfo> arrayMap2 = new ArrayMap<>();
        sRunningAnimators.set(arrayMap2);
        return arrayMap2;
    }

    private static boolean isValueChanged(TransitionValues transitionValues, TransitionValues transitionValues2, String str) {
        Object obj = transitionValues.values.get(str);
        Object obj2 = transitionValues2.values.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void matchStartAndEnd(TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2) {
        ArrayMap<View, TransitionValues> arrayMap = new ArrayMap<>(transitionValuesMaps.mViewValues);
        ArrayMap<View, TransitionValues> arrayMap2 = new ArrayMap<>(transitionValuesMaps2.mViewValues);
        int i11 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i11 >= iArr.length) {
                addUnmatched(arrayMap, arrayMap2);
                return;
            }
            int i12 = iArr[i11];
            if (i12 == 1) {
                matchInstances(arrayMap, arrayMap2);
            } else if (i12 == 2) {
                matchNames(arrayMap, arrayMap2, transitionValuesMaps.mNameValues, transitionValuesMaps2.mNameValues);
            } else if (i12 == 3) {
                matchIds(arrayMap, arrayMap2, transitionValuesMaps.mIdValues, transitionValuesMaps2.mIdValues);
            } else if (i12 == 4) {
                matchItemIds(arrayMap, arrayMap2, transitionValuesMaps.mItemIdValues, transitionValuesMaps2.mItemIdValues);
            }
            i11++;
        }
    }

    private void notifyFromTransition(Transition transition, TransitionNotification transitionNotification, boolean z11) {
        Transition transition2 = this.mCloneParent;
        if (transition2 != null) {
            transition2.notifyFromTransition(transition, transitionNotification, z11);
        }
        ArrayList<TransitionListener> arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        TransitionListener[] transitionListenerArr = this.mListenersCache;
        if (transitionListenerArr == null) {
            transitionListenerArr = new TransitionListener[size];
        }
        this.mListenersCache = null;
        TransitionListener[] transitionListenerArr2 = (TransitionListener[]) this.mListeners.toArray(transitionListenerArr);
        for (int i11 = 0; i11 < size; i11++) {
            transitionNotification.notifyListener(transitionListenerArr2[i11], transition, z11);
            transitionListenerArr2[i11] = null;
        }
        this.mListenersCache = transitionListenerArr2;
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i11 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i11] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(strTrim)) {
                iArr[i11] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i11] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(strTrim)) {
                iArr[i11] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                i11--;
                iArr = iArr2;
            }
            i11++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, final ArrayMap<Animator, AnimationInfo> arrayMap) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    arrayMap.remove(animator2);
                    Transition.this.mCurrentAnimators.remove(animator2);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                    Transition.this.mCurrentAnimators.add(animator2);
                }
            });
            animate(animator);
        }
    }

    @NonNull
    public Transition addListener(@NonNull TransitionListener transitionListener) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(transitionListener);
        return this;
    }

    @NonNull
    public Transition addTarget(@IdRes int i11) {
        if (i11 != 0) {
            this.mTargetIds.add(Integer.valueOf(i11));
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void animate(@Nullable Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                Transition.this.end();
                animator2.removeListener(this);
            }
        });
        animator.start();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator animator = animatorArr[i11];
            animatorArr[i11] = null;
            animator.cancel();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(TransitionNotification.ON_CANCEL, false);
    }

    public void capturePropagationValues(TransitionValues transitionValues) {
        String[] propagationProperties;
        if (this.mPropagation == null || transitionValues.values.isEmpty() || (propagationProperties = this.mPropagation.getPropagationProperties()) == null) {
            return;
        }
        for (String str : propagationProperties) {
            if (!transitionValues.values.containsKey(str)) {
                this.mPropagation.captureValues(transitionValues);
                return;
            }
        }
    }

    public void clearValues(boolean z11) {
        if (z11) {
            this.mStartValues.mViewValues.clear();
            this.mStartValues.mIdValues.clear();
            this.mStartValues.mItemIdValues.clear();
        } else {
            this.mEndValues.mViewValues.clear();
            this.mEndValues.mIdValues.clear();
            this.mEndValues.mItemIdValues.clear();
        }
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Transition mo103716clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.mAnimators = new ArrayList<>();
            transition.mStartValues = new TransitionValuesMaps();
            transition.mEndValues = new TransitionValuesMaps();
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            transition.mSeekController = null;
            transition.mCloneParent = this;
            transition.mListeners = null;
            return transition;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    public void createAnimators(@NonNull ViewGroup viewGroup, @NonNull TransitionValuesMaps transitionValuesMaps, @NonNull TransitionValuesMaps transitionValuesMaps2, @NonNull ArrayList<TransitionValues> arrayList, @NonNull ArrayList<TransitionValues> arrayList2) {
        Animator animatorCreateAnimator;
        int i11;
        boolean z11;
        int i12;
        View view;
        TransitionValues transitionValues;
        Animator animator;
        Animator animator2;
        TransitionValues transitionValues2;
        ArrayMap<Animator, AnimationInfo> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z12 = getRootTransition().mSeekController != null;
        long jMin = Long.MAX_VALUE;
        int i13 = 0;
        while (i13 < size) {
            TransitionValues transitionValues3 = arrayList.get(i13);
            TransitionValues transitionValues4 = arrayList2.get(i13);
            if (transitionValues3 != null && !transitionValues3.mTargetedTransitions.contains(this)) {
                transitionValues3 = null;
            }
            if (transitionValues4 != null && !transitionValues4.mTargetedTransitions.contains(this)) {
                transitionValues4 = null;
            }
            if (!(transitionValues3 == null && transitionValues4 == null) && ((transitionValues3 == null || transitionValues4 == null || isTransitionRequired(transitionValues3, transitionValues4)) && (animatorCreateAnimator = createAnimator(viewGroup, transitionValues3, transitionValues4)) != null)) {
                if (transitionValues4 != null) {
                    View view2 = transitionValues4.view;
                    String[] transitionProperties = getTransitionProperties();
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        transitionValues2 = new TransitionValues(view2);
                        i11 = size;
                        z11 = z12;
                        TransitionValues transitionValues5 = transitionValuesMaps2.mViewValues.get(view2);
                        i12 = i13;
                        if (transitionValues5 != null) {
                            int i14 = 0;
                            while (i14 < transitionProperties.length) {
                                Map<String, Object> map = transitionValues2.values;
                                int i15 = i14;
                                String str = transitionProperties[i15];
                                map.put(str, transitionValues5.values.get(str));
                                i14 = i15 + 1;
                                transitionProperties = transitionProperties;
                            }
                        }
                        int size2 = runningAnimators.getSize();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size2) {
                                view = view2;
                                animator2 = animatorCreateAnimator;
                                break;
                            }
                            AnimationInfo animationInfo = runningAnimators.get(runningAnimators.keyAt(i16));
                            if (animationInfo.mValues != null && animationInfo.mView == view2) {
                                view = view2;
                                if (animationInfo.mName.equals(getName()) && animationInfo.mValues.equals(transitionValues2)) {
                                    animator2 = null;
                                    break;
                                }
                            } else {
                                view = view2;
                            }
                            i16++;
                            view2 = view;
                        }
                    } else {
                        view = view2;
                        i11 = size;
                        z11 = z12;
                        i12 = i13;
                        animator2 = animatorCreateAnimator;
                        transitionValues2 = null;
                    }
                    TransitionValues transitionValues6 = transitionValues2;
                    animator = animator2;
                    transitionValues = transitionValues6;
                } else {
                    i11 = size;
                    z11 = z12;
                    i12 = i13;
                    view = transitionValues3.view;
                    transitionValues = null;
                }
                if (animator != null) {
                    animator = animatorCreateAnimator;
                    TransitionPropagation transitionPropagation = this.mPropagation;
                    if (transitionPropagation != null) {
                        long startDelay = transitionPropagation.getStartDelay(viewGroup, this, transitionValues3, transitionValues4);
                        sparseIntArray.put(this.mAnimators.size(), (int) startDelay);
                        jMin = Math.min(startDelay, jMin);
                    }
                    long j11 = jMin;
                    AnimationInfo animationInfo2 = new AnimationInfo(view, getName(), this, viewGroup.getWindowId(), transitionValues, animator);
                    Animator animator3 = animator;
                    if (z11) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator);
                        animator3 = animatorSet;
                    }
                    runningAnimators.put(animator3, animationInfo2);
                    this.mAnimators.add(animator3);
                    jMin = j11;
                } else {
                    animator = animatorCreateAnimator;
                }
            } else {
                i11 = size;
                z11 = z12;
                i12 = i13;
            }
            i13 = i12 + 1;
            size = i11;
            z12 = z11;
        }
        if (sparseIntArray.size() != 0) {
            for (int i17 = 0; i17 < sparseIntArray.size(); i17++) {
                AnimationInfo animationInfo3 = runningAnimators.get(this.mAnimators.get(sparseIntArray.keyAt(i17)));
                animationInfo3.mAnimator.setStartDelay((((long) sparseIntArray.valueAt(i17)) - jMin) + animationInfo3.mAnimator.getStartDelay());
            }
        }
    }

    @NonNull
    @RequiresApi(34)
    public TransitionSeekController createSeekController() {
        SeekController seekController = new SeekController();
        this.mSeekController = seekController;
        addListener(seekController);
        return this.mSeekController;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void end() {
        int i11 = this.mNumInstances - 1;
        this.mNumInstances = i11;
        if (i11 == 0) {
            notifyListeners(TransitionNotification.ON_END, false);
            for (int i12 = 0; i12 < this.mStartValues.mItemIdValues.size(); i12++) {
                View viewValueAt = this.mStartValues.mItemIdValues.valueAt(i12);
                if (viewValueAt != null) {
                    viewValueAt.setHasTransientState(false);
                }
            }
            for (int i13 = 0; i13 < this.mEndValues.mItemIdValues.size(); i13++) {
                View viewValueAt2 = this.mEndValues.mItemIdValues.valueAt(i13);
                if (viewValueAt2 != null) {
                    viewValueAt2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    @NonNull
    public Transition excludeChildren(@IdRes int i11, boolean z11) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i11, z11);
        return this;
    }

    @NonNull
    public Transition excludeTarget(@IdRes int i11, boolean z11) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i11, z11);
        return this;
    }

    public long getDuration() {
        return this.mDuration;
    }

    @Nullable
    public Rect getEpicenter() {
        EpicenterCallback epicenterCallback = this.mEpicenterCallback;
        if (epicenterCallback == null) {
            return null;
        }
        return epicenterCallback.onGetEpicenter(this);
    }

    @Nullable
    public EpicenterCallback getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public TransitionValues getMatchedTransitionValues(View view, boolean z11) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getMatchedTransitionValues(view, z11);
        }
        ArrayList<TransitionValues> arrayList = z11 ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            }
            TransitionValues transitionValues = arrayList.get(i11);
            if (transitionValues == null) {
                return null;
            }
            if (transitionValues.view == view) {
                break;
            }
            i11++;
        }
        if (i11 >= 0) {
            return (z11 ? this.mEndValuesList : this.mStartValuesList).get(i11);
        }
        return null;
    }

    @NonNull
    public String getName() {
        return this.mName;
    }

    @NonNull
    public PathMotion getPathMotion() {
        return this.mPathMotion;
    }

    @Nullable
    public TransitionPropagation getPropagation() {
        return this.mPropagation;
    }

    @NonNull
    public final Transition getRootTransition() {
        TransitionSet transitionSet = this.mParent;
        return transitionSet != null ? transitionSet.getRootTransition() : this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @NonNull
    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    @Nullable
    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    @Nullable
    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    @NonNull
    public List<View> getTargets() {
        return this.mTargets;
    }

    public final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    @Nullable
    public TransitionValues getTransitionValues(@NonNull View view, boolean z11) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z11);
        }
        return (z11 ? this.mStartValues : this.mEndValues).mViewValues.get(view);
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(@Nullable View view) {
        if (this.mEnded) {
            return;
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator animator = animatorArr[i11];
            animatorArr[i11] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(TransitionNotification.ON_PAUSE, false);
        this.mPaused = true;
    }

    public void playTransition(@NonNull ViewGroup viewGroup) {
        AnimationInfo animationInfo;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        ArrayMap<Animator, AnimationInfo> runningAnimators = getRunningAnimators();
        int size = runningAnimators.getSize();
        WindowId windowId = viewGroup.getWindowId();
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator animatorKeyAt = runningAnimators.keyAt(i11);
            if (animatorKeyAt != null && (animationInfo = runningAnimators.get(animatorKeyAt)) != null && animationInfo.mView != null && windowId.equals(animationInfo.mWindowId)) {
                TransitionValues transitionValues = animationInfo.mValues;
                View view = animationInfo.mView;
                TransitionValues transitionValues2 = getTransitionValues(view, true);
                TransitionValues matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues2 == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.mViewValues.get(view);
                }
                if ((transitionValues2 != null || matchedTransitionValues != null) && animationInfo.mTransition.isTransitionRequired(transitionValues, matchedTransitionValues)) {
                    Transition transition = animationInfo.mTransition;
                    if (transition.getRootTransition().mSeekController != null) {
                        animatorKeyAt.cancel();
                        transition.mCurrentAnimators.remove(animatorKeyAt);
                        runningAnimators.remove(animatorKeyAt);
                        if (transition.mCurrentAnimators.size() == 0) {
                            transition.notifyListeners(TransitionNotification.ON_CANCEL, false);
                            if (!transition.mEnded) {
                                transition.mEnded = true;
                                transition.notifyListeners(TransitionNotification.ON_END, false);
                            }
                        }
                    } else if (animatorKeyAt.isRunning() || animatorKeyAt.isStarted()) {
                        animatorKeyAt.cancel();
                    } else {
                        runningAnimators.remove(animatorKeyAt);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        if (this.mSeekController == null) {
            runAnimators();
        } else if (Build.VERSION.SDK_INT >= 34) {
            prepareAnimatorsForSeeking();
            this.mSeekController.initPlayTime();
            this.mSeekController.ready();
        }
    }

    @NonNull
    public Transition removeListener(@NonNull TransitionListener transitionListener) {
        Transition transition;
        ArrayList<TransitionListener> arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(transitionListener) && (transition = this.mCloneParent) != null) {
                transition.removeListener(transitionListener);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    @NonNull
    public Transition removeTarget(@IdRes int i11) {
        if (i11 != 0) {
            this.mTargetIds.remove(Integer.valueOf(i11));
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(@Nullable View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                int size = this.mCurrentAnimators.size();
                Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                for (int i11 = size - 1; i11 >= 0; i11--) {
                    Animator animator = animatorArr[i11];
                    animatorArr[i11] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyListeners(TransitionNotification.ON_RESUME, false);
            }
            this.mPaused = false;
        }
    }

    public void setCanRemoveViews(boolean z11) {
        this.mCanRemoveViews = z11;
    }

    @RequiresApi(34)
    public void setCurrentPlayTimeMillis(long j11, long j12) {
        long totalDurationMillis = getTotalDurationMillis();
        int i11 = 0;
        boolean z11 = j11 < j12;
        if ((j12 < 0 && j11 >= 0) || (j12 > totalDurationMillis && j11 <= totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(TransitionNotification.ON_START, z11);
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (i11 < size) {
            Animator animator = animatorArr[i11];
            animatorArr[i11] = null;
            Impl26.setCurrentPlayTime(animator, Math.min(Math.max(0L, j11), Impl26.getTotalDuration(animator)));
            i11++;
            totalDurationMillis = totalDurationMillis;
        }
        long j13 = totalDurationMillis;
        this.mAnimatorCache = animatorArr;
        if ((j11 <= j13 || j12 > j13) && (j11 >= 0 || j12 < 0)) {
            return;
        }
        if (j11 > j13) {
            this.mEnded = true;
        }
        notifyListeners(TransitionNotification.ON_END, z11);
    }

    @NonNull
    public Transition setDuration(long j11) {
        this.mDuration = j11;
        return this;
    }

    public void setEpicenterCallback(@Nullable EpicenterCallback epicenterCallback) {
        this.mEpicenterCallback = epicenterCallback;
    }

    @NonNull
    public Transition setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(@Nullable int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (!isValidMatch(iArr[i11])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (alreadyContains(iArr, i11)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(@Nullable PathMotion pathMotion) {
        if (pathMotion == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = pathMotion;
        }
    }

    public void setPropagation(@Nullable TransitionPropagation transitionPropagation) {
        this.mPropagation = transitionPropagation;
    }

    @NonNull
    public Transition setStartDelay(long j11) {
        this.mStartDelay = j11;
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(TransitionNotification.ON_START, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.mDuration != -1) {
            sb2.append("dur(");
            sb2.append(this.mDuration);
            sb2.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb2.append("dly(");
            sb2.append(this.mStartDelay);
            sb2.append(") ");
        }
        if (this.mInterpolator != null) {
            sb2.append("interp(");
            sb2.append(this.mInterpolator);
            sb2.append(") ");
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            sb2.append("tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i11 = 0; i11 < this.mTargetIds.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.mTargetIds.get(i11));
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i12 = 0; i12 < this.mTargets.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.mTargets.get(i12));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    private void matchIds(ArrayMap<View, TransitionValues> arrayMap, ArrayMap<View, TransitionValues> arrayMap2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            View viewValueAt = sparseArray.valueAt(i11);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i11))) != null && isValidTarget(view)) {
                TransitionValues transitionValues = arrayMap.get(viewValueAt);
                TransitionValues transitionValues2 = arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.mStartValuesList.add(transitionValues);
                    this.mEndValuesList.add(transitionValues2);
                    arrayMap.remove(viewValueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchInstances(ArrayMap<View, TransitionValues> arrayMap, ArrayMap<View, TransitionValues> arrayMap2) {
        TransitionValues transitionValuesRemove;
        for (int size = arrayMap.getSize() - 1; size >= 0; size--) {
            View viewKeyAt = arrayMap.keyAt(size);
            if (viewKeyAt != null && isValidTarget(viewKeyAt) && (transitionValuesRemove = arrayMap2.remove(viewKeyAt)) != null && isValidTarget(transitionValuesRemove.view)) {
                this.mStartValuesList.add(arrayMap.removeAt(size));
                this.mEndValuesList.add(transitionValuesRemove);
            }
        }
    }

    private void matchItemIds(ArrayMap<View, TransitionValues> arrayMap, ArrayMap<View, TransitionValues> arrayMap2, LongSparseArray<View> longSparseArray, LongSparseArray<View> longSparseArray2) {
        View view;
        int size = longSparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            View viewValueAt = longSparseArray.valueAt(i11);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = longSparseArray2.get(longSparseArray.keyAt(i11))) != null && isValidTarget(view)) {
                TransitionValues transitionValues = arrayMap.get(viewValueAt);
                TransitionValues transitionValues2 = arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.mStartValuesList.add(transitionValues);
                    this.mEndValuesList.add(transitionValues2);
                    arrayMap.remove(viewValueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchNames(ArrayMap<View, TransitionValues> arrayMap, ArrayMap<View, TransitionValues> arrayMap2, ArrayMap<String, View> arrayMap3, ArrayMap<String, View> arrayMap4) {
        View view;
        int size = arrayMap3.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            View viewValueAt = arrayMap3.valueAt(i11);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = arrayMap4.get(arrayMap3.keyAt(i11))) != null && isValidTarget(view)) {
                TransitionValues transitionValues = arrayMap.get(viewValueAt);
                TransitionValues transitionValues2 = arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.mStartValuesList.add(transitionValues);
                    this.mEndValuesList.add(transitionValues2);
                    arrayMap.remove(viewValueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    @NonNull
    public Transition addTarget(@NonNull String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public void captureValues(@NonNull ViewGroup viewGroup, boolean z11) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        ArrayMap<String, String> arrayMap;
        clearValues(z11);
        if ((this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) || (((arrayList = this.mTargetNames) != null && !arrayList.isEmpty()) || ((arrayList2 = this.mTargetTypes) != null && !arrayList2.isEmpty()))) {
            captureHierarchy(viewGroup, z11);
        } else {
            for (int i11 = 0; i11 < this.mTargetIds.size(); i11++) {
                View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i11).intValue());
                if (viewFindViewById != null) {
                    TransitionValues transitionValues = new TransitionValues(viewFindViewById);
                    if (z11) {
                        captureStartValues(transitionValues);
                    } else {
                        captureEndValues(transitionValues);
                    }
                    transitionValues.mTargetedTransitions.add(this);
                    capturePropagationValues(transitionValues);
                    if (z11) {
                        addViewValues(this.mStartValues, viewFindViewById, transitionValues);
                    } else {
                        addViewValues(this.mEndValues, viewFindViewById, transitionValues);
                    }
                }
            }
            for (int i12 = 0; i12 < this.mTargets.size(); i12++) {
                View view = this.mTargets.get(i12);
                TransitionValues transitionValues2 = new TransitionValues(view);
                if (z11) {
                    captureStartValues(transitionValues2);
                } else {
                    captureEndValues(transitionValues2);
                }
                transitionValues2.mTargetedTransitions.add(this);
                capturePropagationValues(transitionValues2);
                if (z11) {
                    addViewValues(this.mStartValues, view, transitionValues2);
                } else {
                    addViewValues(this.mEndValues, view, transitionValues2);
                }
            }
        }
        if (!z11 && (arrayMap = this.mNameOverrides) != null) {
            int size = arrayMap.getSize();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i13 = 0; i13 < size; i13++) {
                arrayList3.add(this.mStartValues.mNameValues.remove(this.mNameOverrides.keyAt(i13)));
            }
            for (int i14 = 0; i14 < size; i14++) {
                View view2 = (View) arrayList3.get(i14);
                if (view2 != null) {
                    this.mStartValues.mNameValues.put(this.mNameOverrides.valueAt(i14), view2);
                }
            }
        }
    }

    @NonNull
    public Transition excludeChildren(@NonNull Class<?> cls, boolean z11) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z11);
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z11) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z11);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(@Nullable ViewGroup viewGroup) {
        ArrayMap<Animator, AnimationInfo> runningAnimators = getRunningAnimators();
        int size = runningAnimators.getSize();
        if (viewGroup != null && size != 0) {
            WindowId windowId = viewGroup.getWindowId();
            ArrayMap arrayMap = new ArrayMap(runningAnimators);
            runningAnimators.clear();
            for (int i11 = size - 1; i11 >= 0; i11--) {
                AnimationInfo animationInfo = (AnimationInfo) arrayMap.valueAt(i11);
                if (animationInfo.mView != null && windowId.equals(animationInfo.mWindowId)) {
                    ((Animator) arrayMap.keyAt(i11)).end();
                }
            }
        }
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (this.mTargetTypeExcludes.get(i11).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && ViewCompat.getTransitionName(view) != null && this.mTargetNameExcludes.contains(ViewCompat.getTransitionName(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id2)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.getTransitionName(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i12 = 0; i12 < this.mTargetTypes.size(); i12++) {
                if (this.mTargetTypes.get(i12).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void notifyListeners(TransitionNotification transitionNotification, boolean z11) {
        notifyFromTransition(this, transitionNotification, z11);
    }

    @RequiresApi(34)
    public void prepareAnimatorsForSeeking() {
        ArrayMap<Animator, AnimationInfo> runningAnimators = getRunningAnimators();
        this.mTotalDuration = 0L;
        for (int i11 = 0; i11 < this.mAnimators.size(); i11++) {
            Animator animator = this.mAnimators.get(i11);
            AnimationInfo animationInfo = runningAnimators.get(animator);
            if (animator != null && animationInfo != null) {
                if (getDuration() >= 0) {
                    animationInfo.mAnimator.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    animationInfo.mAnimator.setStartDelay(getStartDelay() + animationInfo.mAnimator.getStartDelay());
                }
                if (getInterpolator() != null) {
                    animationInfo.mAnimator.setInterpolator(getInterpolator());
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = Math.max(this.mTotalDuration, Impl26.getTotalDuration(animator));
            }
        }
        this.mAnimators.clear();
    }

    @NonNull
    public Transition removeTarget(@NonNull String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        start();
        ArrayMap<Animator, AnimationInfo> runningAnimators = getRunningAnimators();
        for (Animator animator : this.mAnimators) {
            if (runningAnimators.containsKey(animator)) {
                start();
                runAnimator(animator, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z11) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z11);
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public Transition(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.TRANSITION);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long namedInt = TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, xmlResourceParser, TypedValues.TransitionType.S_DURATION, 1, -1);
        if (namedInt >= 0) {
            setDuration(namedInt);
        }
        long namedInt2 = TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (namedInt2 > 0) {
            setStartDelay(namedInt2);
        }
        int namedResourceId = TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, namedResourceId));
        }
        String namedString = TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (namedString != null) {
            setMatchOrder(parseMatchOrder(namedString));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
