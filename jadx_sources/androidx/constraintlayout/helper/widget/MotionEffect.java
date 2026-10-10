package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.KeyAttributes;
import androidx.constraintlayout.motion.widget.KeyPosition;
import androidx.constraintlayout.motion.widget.MotionController;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C1528R;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes23.dex */
public class MotionEffect extends MotionHelper {
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final String TAG = "FadeMove";
    private static final int UNSET = -1;
    public static final int WEST = 3;
    private int mFadeMove;
    private float mMotionEffectAlpha;
    private int mMotionEffectEnd;
    private int mMotionEffectStart;
    private boolean mMotionEffectStrictMove;
    private int mMotionEffectTranslationX;
    private int mMotionEffectTranslationY;
    private int mViewTransitionId;

    public MotionEffect(Context context) {
        super(context);
        this.mMotionEffectAlpha = 0.1f;
        this.mMotionEffectStart = 49;
        this.mMotionEffectEnd = 50;
        this.mMotionEffectTranslationX = 0;
        this.mMotionEffectTranslationY = 0;
        this.mMotionEffectStrictMove = true;
        this.mViewTransitionId = -1;
        this.mFadeMove = -1;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isDecorator() {
        return true;
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1528R.styleable.MotionEffect);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == C1528R.styleable.MotionEffect_motionEffect_start) {
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, this.mMotionEffectStart);
                    this.mMotionEffectStart = i12;
                    this.mMotionEffectStart = Math.max(Math.min(i12, 99), 0);
                } else if (index == C1528R.styleable.MotionEffect_motionEffect_end) {
                    int i13 = typedArrayObtainStyledAttributes.getInt(index, this.mMotionEffectEnd);
                    this.mMotionEffectEnd = i13;
                    this.mMotionEffectEnd = Math.max(Math.min(i13, 99), 0);
                } else if (index == C1528R.styleable.MotionEffect_motionEffect_translationX) {
                    this.mMotionEffectTranslationX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMotionEffectTranslationX);
                } else if (index == C1528R.styleable.MotionEffect_motionEffect_translationY) {
                    this.mMotionEffectTranslationY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMotionEffectTranslationY);
                } else if (index == C1528R.styleable.MotionEffect_motionEffect_alpha) {
                    this.mMotionEffectAlpha = typedArrayObtainStyledAttributes.getFloat(index, this.mMotionEffectAlpha);
                } else if (index == C1528R.styleable.MotionEffect_motionEffect_move) {
                    this.mFadeMove = typedArrayObtainStyledAttributes.getInt(index, this.mFadeMove);
                } else if (index == C1528R.styleable.MotionEffect_motionEffect_strict) {
                    this.mMotionEffectStrictMove = typedArrayObtainStyledAttributes.getBoolean(index, this.mMotionEffectStrictMove);
                } else if (index == C1528R.styleable.MotionEffect_motionEffect_viewTransition) {
                    this.mViewTransitionId = typedArrayObtainStyledAttributes.getResourceId(index, this.mViewTransitionId);
                }
            }
            int i14 = this.mMotionEffectStart;
            int i15 = this.mMotionEffectEnd;
            if (i14 == i15) {
                if (i14 > 0) {
                    this.mMotionEffectStart = i14 - 1;
                } else {
                    this.mMotionEffectEnd = i15 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0170  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f7  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0194, code lost:
    
        if (r14 == 0.0f) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01aa, code lost:
    
        if (r14 == 0.0f) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01bb, code lost:
    
        if (r15 == 0.0f) goto L59;
     */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPreSetup(MotionLayout motionLayout, HashMap<View, MotionController> map) {
        Key keyAttributes;
        Key keyAttributes2;
        Key keyAttributes3;
        int i11;
        int i12;
        int i13;
        HashMap<View, MotionController> map2 = map;
        View[] views = getViews((ConstraintLayout) getParent());
        if (views == null) {
            Log.v(TAG, Debug.getLoc() + " views = null");
            return;
        }
        Key keyAttributes4 = new KeyAttributes();
        Key keyAttributes5 = new KeyAttributes();
        keyAttributes4.setValue("alpha", Float.valueOf(this.mMotionEffectAlpha));
        keyAttributes5.setValue("alpha", Float.valueOf(this.mMotionEffectAlpha));
        keyAttributes4.setFramePosition(this.mMotionEffectStart);
        keyAttributes5.setFramePosition(this.mMotionEffectEnd);
        KeyPosition keyPosition = new KeyPosition();
        keyPosition.setFramePosition(this.mMotionEffectStart);
        keyPosition.setType(0);
        keyPosition.setValue("percentX", 0);
        keyPosition.setValue("percentY", 0);
        KeyPosition keyPosition2 = new KeyPosition();
        keyPosition2.setFramePosition(this.mMotionEffectEnd);
        keyPosition2.setType(0);
        int i14 = 1;
        keyPosition2.setValue("percentX", 1);
        keyPosition2.setValue("percentY", 1);
        Key keyAttributes6 = null;
        if (this.mMotionEffectTranslationX > 0) {
            keyAttributes = new KeyAttributes();
            keyAttributes2 = new KeyAttributes();
            keyAttributes.setValue("translationX", Integer.valueOf(this.mMotionEffectTranslationX));
            keyAttributes.setFramePosition(this.mMotionEffectEnd);
            keyAttributes2.setValue("translationX", 0);
            keyAttributes2.setFramePosition(this.mMotionEffectEnd - 1);
        } else {
            keyAttributes = null;
            keyAttributes2 = null;
        }
        if (this.mMotionEffectTranslationY > 0) {
            keyAttributes6 = new KeyAttributes();
            keyAttributes3 = new KeyAttributes();
            keyAttributes6.setValue("translationY", Integer.valueOf(this.mMotionEffectTranslationY));
            keyAttributes6.setFramePosition(this.mMotionEffectEnd);
            keyAttributes3.setValue("translationY", 0);
            keyAttributes3.setFramePosition(this.mMotionEffectEnd - 1);
        } else {
            keyAttributes3 = null;
        }
        int i15 = this.mFadeMove;
        if (i15 == -1) {
            int[] iArr = new int[4];
            i11 = 3;
            i12 = 2;
            for (View view : views) {
                MotionController motionController = map2.get(view);
                if (motionController != null) {
                    float finalX = motionController.getFinalX() - motionController.getStartX();
                    float finalY = motionController.getFinalY() - motionController.getStartY();
                    if (finalY < 0.0f) {
                        iArr[1] = iArr[1] + 1;
                    }
                    if (finalY > 0.0f) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (finalX > 0.0f) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (finalX < 0.0f) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
            }
            int i16 = iArr[0];
            int i17 = 0;
            for (int i18 = 4; i14 < i18; i18 = 4) {
                int i19 = iArr[i14];
                if (i16 < i19) {
                    i17 = i14;
                    i16 = i19;
                }
                i14++;
            }
            i15 = i17;
        } else {
            i11 = 3;
            i12 = 2;
        }
        int i21 = 0;
        while (i21 < views.length) {
            MotionController motionController2 = map2.get(views[i21]);
            if (motionController2 != null) {
                float finalX2 = motionController2.getFinalX() - motionController2.getStartX();
                float finalY2 = motionController2.getFinalY() - motionController2.getStartY();
                if (i15 == 0) {
                    if (finalY2 > 0.0f) {
                        if (this.mMotionEffectStrictMove) {
                        }
                    }
                    i13 = this.mViewTransitionId;
                    if (i13 == -1) {
                        motionController2.addKey(keyAttributes4);
                        motionController2.addKey(keyAttributes5);
                        motionController2.addKey(keyPosition);
                        motionController2.addKey(keyPosition2);
                        if (this.mMotionEffectTranslationX > 0) {
                            motionController2.addKey(keyAttributes);
                            motionController2.addKey(keyAttributes2);
                        }
                        if (this.mMotionEffectTranslationY > 0) {
                            motionController2.addKey(keyAttributes6);
                            motionController2.addKey(keyAttributes3);
                        }
                    } else {
                        motionLayout.applyViewTransition(i13, motionController2);
                    }
                } else if (i15 == 1) {
                    if (finalY2 < 0.0f) {
                        if (this.mMotionEffectStrictMove) {
                        }
                    }
                    i13 = this.mViewTransitionId;
                    if (i13 == -1) {
                        motionController2.addKey(keyAttributes4);
                        motionController2.addKey(keyAttributes5);
                        motionController2.addKey(keyPosition);
                        motionController2.addKey(keyPosition2);
                        if (this.mMotionEffectTranslationX > 0) {
                            motionController2.addKey(keyAttributes);
                            motionController2.addKey(keyAttributes2);
                        }
                        if (this.mMotionEffectTranslationY > 0) {
                            motionController2.addKey(keyAttributes6);
                            motionController2.addKey(keyAttributes3);
                        }
                    } else {
                        motionLayout.applyViewTransition(i13, motionController2);
                    }
                } else if (i15 == i12) {
                    if (finalX2 < 0.0f) {
                        if (this.mMotionEffectStrictMove) {
                        }
                    }
                    i13 = this.mViewTransitionId;
                    if (i13 == -1) {
                        motionController2.addKey(keyAttributes4);
                        motionController2.addKey(keyAttributes5);
                        motionController2.addKey(keyPosition);
                        motionController2.addKey(keyPosition2);
                        if (this.mMotionEffectTranslationX > 0) {
                            motionController2.addKey(keyAttributes);
                            motionController2.addKey(keyAttributes2);
                        }
                        if (this.mMotionEffectTranslationY > 0) {
                            motionController2.addKey(keyAttributes6);
                            motionController2.addKey(keyAttributes3);
                        }
                    } else {
                        motionLayout.applyViewTransition(i13, motionController2);
                    }
                } else if (i15 != i11 || finalX2 <= 0.0f || (this.mMotionEffectStrictMove && finalY2 != 0.0f)) {
                    i13 = this.mViewTransitionId;
                    if (i13 == -1) {
                        motionController2.addKey(keyAttributes4);
                        motionController2.addKey(keyAttributes5);
                        motionController2.addKey(keyPosition);
                        motionController2.addKey(keyPosition2);
                        if (this.mMotionEffectTranslationX > 0) {
                            motionController2.addKey(keyAttributes);
                            motionController2.addKey(keyAttributes2);
                        }
                        if (this.mMotionEffectTranslationY > 0) {
                            motionController2.addKey(keyAttributes6);
                            motionController2.addKey(keyAttributes3);
                        }
                    } else {
                        motionLayout.applyViewTransition(i13, motionController2);
                    }
                }
            }
            i21++;
            map2 = map;
            i11 = 3;
            i12 = 2;
        }
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMotionEffectAlpha = 0.1f;
        this.mMotionEffectStart = 49;
        this.mMotionEffectEnd = 50;
        this.mMotionEffectTranslationX = 0;
        this.mMotionEffectTranslationY = 0;
        this.mMotionEffectStrictMove = true;
        this.mViewTransitionId = -1;
        this.mFadeMove = -1;
        init(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mMotionEffectAlpha = 0.1f;
        this.mMotionEffectStart = 49;
        this.mMotionEffectEnd = 50;
        this.mMotionEffectTranslationX = 0;
        this.mMotionEffectTranslationY = 0;
        this.mMotionEffectStrictMove = true;
        this.mViewTransitionId = -1;
        this.mFadeMove = -1;
        init(context, attributeSet);
    }
}
