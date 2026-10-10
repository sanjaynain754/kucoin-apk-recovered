package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.ConstraintSet;

/* JADX INFO: loaded from: classes23.dex */
public class TransitionBuilder {
    private static final String TAG = "TransitionBuilder";

    public static MotionScene.Transition buildTransition(MotionScene motionScene, int i11, int i12, ConstraintSet constraintSet, int i13, ConstraintSet constraintSet2) {
        MotionScene.Transition transition = new MotionScene.Transition(i11, motionScene, i12, i13);
        updateConstraintSetInMotionScene(motionScene, transition, constraintSet, constraintSet2);
        return transition;
    }

    public static void validate(MotionLayout motionLayout) {
        MotionScene motionScene = motionLayout.mScene;
        if (motionScene == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if (!motionScene.validateLayout(motionLayout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (motionScene.mCurrentTransition == null || motionScene.getDefinedTransitions().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }

    private static void updateConstraintSetInMotionScene(MotionScene motionScene, MotionScene.Transition transition, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
        int startConstraintSetId = transition.getStartConstraintSetId();
        int endConstraintSetId = transition.getEndConstraintSetId();
        motionScene.setConstraintSet(startConstraintSetId, constraintSet);
        motionScene.setConstraintSet(endConstraintSetId, constraintSet2);
    }
}
