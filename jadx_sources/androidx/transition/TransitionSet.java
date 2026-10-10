package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class TransitionSet extends Transition {
    private static final int FLAG_CHANGE_EPICENTER = 8;
    private static final int FLAG_CHANGE_INTERPOLATOR = 1;
    private static final int FLAG_CHANGE_PATH_MOTION = 4;
    private static final int FLAG_CHANGE_PROPAGATION = 2;
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER = 0;
    private int mChangeFlags;
    int mCurrentListeners;
    private boolean mPlayTogether;
    boolean mStarted;
    ArrayList<Transition> mTransitions;

    /* JADX INFO: loaded from: classes34.dex */
    public static class TransitionSetListener extends TransitionListenerAdapter {
        TransitionSet mTransitionSet;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            TransitionSet transitionSet = this.mTransitionSet;
            int i11 = transitionSet.mCurrentListeners - 1;
            transitionSet.mCurrentListeners = i11;
            if (i11 == 0) {
                transitionSet.mStarted = false;
                transitionSet.end();
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
            TransitionSet transitionSet = this.mTransitionSet;
            if (transitionSet.mStarted) {
                return;
            }
            transitionSet.start();
            this.mTransitionSet.mStarted = true;
        }

        public TransitionSetListener(TransitionSet transitionSet) {
            this.mTransitionSet = transitionSet;
        }
    }

    public TransitionSet() {
        this.mTransitions = new ArrayList<>();
        this.mPlayTogether = true;
        this.mStarted = false;
        this.mChangeFlags = 0;
    }

    private int indexOfTransition(long j11) {
        for (int i11 = 1; i11 < this.mTransitions.size(); i11++) {
            if (this.mTransitions.get(i11).mSeekOffsetInParent > j11) {
                return i11 - 1;
            }
        }
        return this.mTransitions.size() - 1;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z11) {
        for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
            this.mTransitions.get(i11).excludeTarget(view, z11);
        }
        return super.excludeTarget(view, z11);
    }

    @Override // androidx.transition.Transition
    public boolean hasAnimators() {
        for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
            if (this.mTransitions.get(i11).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public TransitionSet setOrdering(int i11) {
        if (i11 == 0) {
            this.mPlayTogether = true;
            return this;
        }
        if (i11 == 1) {
            this.mPlayTogether = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i11);
    }

    private void addTransitionInternal(@NonNull Transition transition) {
        this.mTransitions.add(transition);
        transition.mParent = this;
    }

    private void setupStartEndListeners() {
        TransitionSetListener transitionSetListener = new TransitionSetListener(this);
        Iterator<Transition> it = this.mTransitions.iterator();
        while (it.hasNext()) {
            it.next().addListener(transitionSetListener);
        }
        this.mCurrentListeners = this.mTransitions.size();
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addListener(@NonNull Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.addListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.view)) {
            for (Transition transition : this.mTransitions) {
                if (transition.isValidTarget(transitionValues.view)) {
                    transition.captureEndValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.view)) {
            for (Transition transition : this.mTransitions) {
                if (transition.isValidTarget(transitionValues.view)) {
                    transition.captureStartValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: clone */
    public Transition mo103716clone() {
        TransitionSet transitionSet = (TransitionSet) super.mo103716clone();
        transitionSet.mTransitions = new ArrayList<>();
        int size = this.mTransitions.size();
        for (int i11 = 0; i11 < size; i11++) {
            transitionSet.addTransitionInternal(this.mTransitions.get(i11).mo103716clone());
        }
        return transitionSet;
    }

    public int getOrdering() {
        return !this.mPlayTogether ? 1 : 0;
    }

    @Nullable
    public Transition getTransitionAt(int i11) {
        if (i11 < 0 || i11 >= this.mTransitions.size()) {
            return null;
        }
        return this.mTransitions.get(i11);
    }

    public int getTransitionCount() {
        return this.mTransitions.size();
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        int size = this.mTransitions.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!this.mTransitions.get(i11).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    @RequiresApi(34)
    public void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        TransitionListenerAdapter transitionListenerAdapter = new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.2
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(@NonNull Transition transition) {
                TransitionSet.this.mTransitions.remove(transition);
                if (TransitionSet.this.hasAnimators()) {
                    return;
                }
                TransitionSet.this.notifyListeners(Transition.TransitionNotification.ON_CANCEL, false);
                TransitionSet transitionSet = TransitionSet.this;
                transitionSet.mEnded = true;
                transitionSet.notifyListeners(Transition.TransitionNotification.ON_END, false);
            }
        };
        for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
            Transition transition = this.mTransitions.get(i11);
            transition.addListener(transitionListenerAdapter);
            transition.prepareAnimatorsForSeeking();
            long totalDurationMillis = transition.getTotalDurationMillis();
            if (this.mPlayTogether) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                long j11 = this.mTotalDuration;
                transition.mSeekOffsetInParent = j11;
                this.mTotalDuration = j11 + totalDurationMillis;
            }
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeListener(@NonNull Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.removeListener(transitionListener);
    }

    @NonNull
    public TransitionSet removeTransition(@NonNull Transition transition) {
        this.mTransitions.remove(transition);
        transition.mParent = null;
        return this;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        if (this.mTransitions.isEmpty()) {
            start();
            end();
            return;
        }
        setupStartEndListeners();
        if (this.mPlayTogether) {
            Iterator<Transition> it = this.mTransitions.iterator();
            while (it.hasNext()) {
                it.next().runAnimators();
            }
            return;
        }
        for (int i11 = 1; i11 < this.mTransitions.size(); i11++) {
            Transition transition = this.mTransitions.get(i11 - 1);
            final Transition transition2 = this.mTransitions.get(i11);
            transition.addListener(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public void onTransitionEnd(@NonNull Transition transition3) {
                    transition2.runAnimators();
                    transition3.removeListener(this);
                }
            });
        }
        Transition transition3 = this.mTransitions.get(0);
        if (transition3 != null) {
            transition3.runAnimators();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    @RequiresApi(34)
    public void setCurrentPlayTimeMillis(long j11, long j12) {
        long j13;
        long totalDurationMillis = getTotalDurationMillis();
        long j14 = 0;
        if (this.mParent != null) {
            if (j11 < 0 && j12 < 0) {
                return;
            }
            if (j11 > totalDurationMillis && j12 > totalDurationMillis) {
                return;
            }
        }
        boolean z11 = j11 < j12;
        if ((j11 >= 0 && j12 < 0) || (j11 <= totalDurationMillis && j12 > totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(Transition.TransitionNotification.ON_START, z11);
        }
        if (!this.mPlayTogether) {
            int iIndexOfTransition = indexOfTransition(j12);
            if (j11 >= j12) {
                while (true) {
                    if (iIndexOfTransition < this.mTransitions.size()) {
                        Transition transition = this.mTransitions.get(iIndexOfTransition);
                        long j15 = transition.mSeekOffsetInParent;
                        j13 = j14;
                        long j16 = j11 - j15;
                        if (j16 < j13) {
                            break;
                        }
                        transition.setCurrentPlayTimeMillis(j16, j12 - j15);
                        iIndexOfTransition++;
                        j14 = j13;
                    }
                }
            } else {
                j13 = 0;
                while (iIndexOfTransition >= 0) {
                    Transition transition2 = this.mTransitions.get(iIndexOfTransition);
                    long j17 = transition2.mSeekOffsetInParent;
                    long j18 = j11 - j17;
                    transition2.setCurrentPlayTimeMillis(j18, j12 - j17);
                    if (j18 >= 0) {
                        break;
                    } else {
                        iIndexOfTransition--;
                    }
                }
            }
            if (this.mParent != null) {
                if ((j11 > totalDurationMillis || j12 > totalDurationMillis) && (j11 >= 0 || j12 < j13)) {
                    return;
                }
                if (j11 > totalDurationMillis) {
                    this.mEnded = true;
                }
                notifyListeners(Transition.TransitionNotification.ON_END, z11);
            }
        }
        for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
            this.mTransitions.get(i11).setCurrentPlayTimeMillis(j11, j12);
        }
        j13 = j14;
        if (this.mParent != null) {
            if (j11 > totalDurationMillis) {
                return;
            } else {
                return;
            }
            if (j11 > totalDurationMillis) {
                this.mEnded = true;
            }
            notifyListeners(Transition.TransitionNotification.ON_END, z11);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet setDuration(long j11) {
        ArrayList<Transition> arrayList;
        super.setDuration(j11);
        if (this.mDuration >= 0 && (arrayList = this.mTransitions) != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.mTransitions.get(i11).setDuration(j11);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.mChangeFlags |= 1;
        ArrayList<Transition> arrayList = this.mTransitions;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.mTransitions.get(i11).setInterpolator(timeInterpolator);
            }
        }
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet setStartDelay(long j11) {
        return (TransitionSet) super.setStartDelay(j11);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public /* bridge */ /* synthetic */ Transition addTarget(@NonNull Class cls) {
        return addTarget((Class<?>) cls);
    }

    @NonNull
    public TransitionSet addTransition(@NonNull Transition transition) {
        addTransitionInternal(transition);
        long j11 = this.mDuration;
        if (j11 >= 0) {
            transition.setDuration(j11);
        }
        if ((this.mChangeFlags & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.mChangeFlags & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.mChangeFlags & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.mChangeFlags & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.mTransitions.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mTransitions.get(i11).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public void capturePropagationValues(TransitionValues transitionValues) {
        super.capturePropagationValues(transitionValues);
        int size = this.mTransitions.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mTransitions.get(i11).capturePropagationValues(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public void createAnimators(@NonNull ViewGroup viewGroup, @NonNull TransitionValuesMaps transitionValuesMaps, @NonNull TransitionValuesMaps transitionValuesMaps2, @NonNull ArrayList<TransitionValues> arrayList, @NonNull ArrayList<TransitionValues> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.mTransitions.size();
        for (int i11 = 0; i11 < size; i11++) {
            Transition transition = this.mTransitions.get(i11);
            if (startDelay > 0 && (this.mPlayTogether || i11 == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.mTransitions.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mTransitions.get(i11).forceToEnd(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(@Nullable View view) {
        super.pause(view);
        int size = this.mTransitions.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mTransitions.get(i11).pause(view);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public /* bridge */ /* synthetic */ Transition removeTarget(@NonNull Class cls) {
        return removeTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(@Nullable View view) {
        super.resume(view);
        int size = this.mTransitions.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mTransitions.get(i11).resume(view);
        }
    }

    @Override // androidx.transition.Transition
    public void setCanRemoveViews(boolean z11) {
        super.setCanRemoveViews(z11);
        int size = this.mTransitions.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mTransitions.get(i11).setCanRemoveViews(z11);
        }
    }

    @Override // androidx.transition.Transition
    public void setEpicenterCallback(@Nullable Transition.EpicenterCallback epicenterCallback) {
        super.setEpicenterCallback(epicenterCallback);
        this.mChangeFlags |= 8;
        int size = this.mTransitions.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mTransitions.get(i11).setEpicenterCallback(epicenterCallback);
        }
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.mChangeFlags |= 4;
        if (this.mTransitions != null) {
            for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
                this.mTransitions.get(i11).setPathMotion(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void setPropagation(@Nullable TransitionPropagation transitionPropagation) {
        super.setPropagation(transitionPropagation);
        this.mChangeFlags |= 2;
        int size = this.mTransitions.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mTransitions.get(i11).setPropagation(transitionPropagation);
        }
    }

    @Override // androidx.transition.Transition
    public String toString(String str) {
        String string = super.toString(str);
        for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sb2.append(this.mTransitions.get(i11).toString(str + "  "));
            string = sb2.toString();
        }
        return string;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z11) {
        for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
            this.mTransitions.get(i11).excludeTarget(str, z11);
        }
        return super.excludeTarget(str, z11);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@NonNull View view) {
        for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
            this.mTransitions.get(i11).addTarget(view);
        }
        return (TransitionSet) super.addTarget(view);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@IdRes int i11) {
        for (int i12 = 0; i12 < this.mTransitions.size(); i12++) {
            this.mTransitions.get(i12).removeTarget(i11);
        }
        return (TransitionSet) super.removeTarget(i11);
    }

    public TransitionSet(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTransitions = new ArrayList<>();
        this.mPlayTogether = true;
        this.mStarted = false;
        this.mChangeFlags = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.TRANSITION_SET);
        setOrdering(TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(int i11, boolean z11) {
        for (int i12 = 0; i12 < this.mTransitions.size(); i12++) {
            this.mTransitions.get(i12).excludeTarget(i11, z11);
        }
        return super.excludeTarget(i11, z11);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@IdRes int i11) {
        for (int i12 = 0; i12 < this.mTransitions.size(); i12++) {
            this.mTransitions.get(i12).addTarget(i11);
        }
        return (TransitionSet) super.addTarget(i11);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@NonNull View view) {
        for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
            this.mTransitions.get(i11).removeTarget(view);
        }
        return (TransitionSet) super.removeTarget(view);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z11) {
        for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
            this.mTransitions.get(i11).excludeTarget(cls, z11);
        }
        return super.excludeTarget(cls, z11);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@NonNull String str) {
        for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
            this.mTransitions.get(i11).addTarget(str);
        }
        return (TransitionSet) super.addTarget(str);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@NonNull Class<?> cls) {
        for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
            this.mTransitions.get(i11).removeTarget(cls);
        }
        return (TransitionSet) super.removeTarget(cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@NonNull Class<?> cls) {
        for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
            this.mTransitions.get(i11).addTarget(cls);
        }
        return (TransitionSet) super.addTarget(cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@NonNull String str) {
        for (int i11 = 0; i11 < this.mTransitions.size(); i11++) {
            this.mTransitions.get(i11).removeTarget(str);
        }
        return (TransitionSet) super.removeTarget(str);
    }
}
