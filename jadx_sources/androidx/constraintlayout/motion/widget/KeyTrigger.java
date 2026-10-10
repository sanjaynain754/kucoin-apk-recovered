package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.C1528R;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33978va;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public class KeyTrigger extends Key {
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    static final String NAME = "KeyTrigger";
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    private static final String TAG = "KeyTrigger";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    RectF mCollisionRect;
    private String mCross;
    private int mCurveFit;
    private boolean mFireCrossReset;
    private float mFireLastPos;
    private boolean mFireNegativeReset;
    private boolean mFirePositiveReset;
    private float mFireThreshold;
    HashMap<String, Method> mMethodHashMap;
    private String mNegativeCross;
    private String mPositiveCross;
    private boolean mPostLayout;
    RectF mTargetRect;
    private int mTriggerCollisionId;
    private View mTriggerCollisionView;
    private int mTriggerID;
    private int mTriggerReceiver;
    float mTriggerSlack = 0.1f;
    int mViewTransitionOnCross;
    int mViewTransitionOnNegativeCross;
    int mViewTransitionOnPositiveCross;

    public static class Loader {
        private static final int COLLISION = 9;
        private static final int CROSS = 4;
        private static final int FRAME_POS = 8;
        private static final int NEGATIVE_CROSS = 1;
        private static final int POSITIVE_CROSS = 2;
        private static final int POST_LAYOUT = 10;
        private static final int TARGET_ID = 7;
        private static final int TRIGGER_ID = 6;
        private static final int TRIGGER_RECEIVER = 11;
        private static final int TRIGGER_SLACK = 5;
        private static final int VT_CROSS = 12;
        private static final int VT_NEGATIVE_CROSS = 13;
        private static final int VT_POSITIVE_CROSS = 14;
        private static SparseIntArray sAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sAttrMap = sparseIntArray;
            sparseIntArray.append(C1528R.styleable.KeyTrigger_framePosition, 8);
            sAttrMap.append(C1528R.styleable.KeyTrigger_onCross, 4);
            sAttrMap.append(C1528R.styleable.KeyTrigger_onNegativeCross, 1);
            sAttrMap.append(C1528R.styleable.KeyTrigger_onPositiveCross, 2);
            sAttrMap.append(C1528R.styleable.KeyTrigger_motionTarget, 7);
            sAttrMap.append(C1528R.styleable.KeyTrigger_triggerId, 6);
            sAttrMap.append(C1528R.styleable.KeyTrigger_triggerSlack, 5);
            sAttrMap.append(C1528R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            sAttrMap.append(C1528R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            sAttrMap.append(C1528R.styleable.KeyTrigger_triggerReceiver, 11);
            sAttrMap.append(C1528R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            sAttrMap.append(C1528R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            sAttrMap.append(C1528R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        private Loader() {
        }

        public static void read(KeyTrigger keyTrigger, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (sAttrMap.get(index)) {
                    case 1:
                        keyTrigger.mNegativeCross = typedArray.getString(index);
                        break;
                    case 2:
                        keyTrigger.mPositiveCross = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e(TypedValues.TriggerType.NAME, "unused attribute 0x" + Integer.toHexString(index) + "   " + sAttrMap.get(index));
                        break;
                    case 4:
                        keyTrigger.mCross = typedArray.getString(index);
                        break;
                    case 5:
                        keyTrigger.mTriggerSlack = typedArray.getFloat(index, keyTrigger.mTriggerSlack);
                        break;
                    case 6:
                        keyTrigger.mTriggerID = typedArray.getResourceId(index, keyTrigger.mTriggerID);
                        break;
                    case 7:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, keyTrigger.mTargetId);
                            keyTrigger.mTargetId = resourceId;
                            if (resourceId == -1) {
                                keyTrigger.mTargetString = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyTrigger.mTargetString = typedArray.getString(index);
                        } else {
                            keyTrigger.mTargetId = typedArray.getResourceId(index, keyTrigger.mTargetId);
                        }
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, keyTrigger.mFramePosition);
                        keyTrigger.mFramePosition = integer;
                        keyTrigger.mFireThreshold = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        keyTrigger.mTriggerCollisionId = typedArray.getResourceId(index, keyTrigger.mTriggerCollisionId);
                        break;
                    case 10:
                        keyTrigger.mPostLayout = typedArray.getBoolean(index, keyTrigger.mPostLayout);
                        break;
                    case 11:
                        keyTrigger.mTriggerReceiver = typedArray.getResourceId(index, keyTrigger.mTriggerReceiver);
                        break;
                    case 12:
                        keyTrigger.mViewTransitionOnCross = typedArray.getResourceId(index, keyTrigger.mViewTransitionOnCross);
                        break;
                    case 13:
                        keyTrigger.mViewTransitionOnNegativeCross = typedArray.getResourceId(index, keyTrigger.mViewTransitionOnNegativeCross);
                        break;
                    case 14:
                        keyTrigger.mViewTransitionOnPositiveCross = typedArray.getResourceId(index, keyTrigger.mViewTransitionOnPositiveCross);
                        break;
                }
            }
        }
    }

    private void fire(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(C33978va.f72339h)) {
            fireCustom(str, view);
            return;
        }
        if (this.mMethodHashMap.containsKey(str)) {
            method = this.mMethodHashMap.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.mMethodHashMap.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.mMethodHashMap.put(str, null);
                Log.e(TypedValues.TriggerType.NAME, "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + C33627eb.f69716f + Debug.getName(view));
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            Log.e(TypedValues.TriggerType.NAME, "Exception in call \"" + this.mCross + "\"on class " + view.getClass().getSimpleName() + C33627eb.f69716f + Debug.getName(view));
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public Key mo103474clone() {
        return new KeyTrigger().copy(this);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00db  */
    public void conditionallyFire(float f11, View view) {
        boolean z11;
        boolean z12;
        boolean z13;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z14;
        boolean z15 = true;
        boolean z16 = false;
        if (this.mTriggerCollisionId != Key.UNSET) {
            if (this.mTriggerCollisionView == null) {
                this.mTriggerCollisionView = ((ViewGroup) view.getParent()).findViewById(this.mTriggerCollisionId);
            }
            setUpRect(this.mCollisionRect, this.mTriggerCollisionView, this.mPostLayout);
            setUpRect(this.mTargetRect, view, this.mPostLayout);
            if (this.mCollisionRect.intersect(this.mTargetRect)) {
                if (this.mFireCrossReset) {
                    this.mFireCrossReset = false;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.mFirePositiveReset) {
                    this.mFirePositiveReset = false;
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.mFireNegativeReset = true;
            } else {
                if (this.mFireCrossReset) {
                    z11 = false;
                } else {
                    this.mFireCrossReset = true;
                    z11 = true;
                }
                if (this.mFireNegativeReset) {
                    this.mFireNegativeReset = false;
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.mFirePositiveReset = true;
                z16 = z14;
                z13 = false;
            }
        } else {
            if (this.mFireCrossReset) {
                float f16 = this.mFireThreshold;
                if ((f11 - f16) * (this.mFireLastPos - f16) < 0.0f) {
                    this.mFireCrossReset = false;
                    z11 = true;
                }
                if (this.mFireNegativeReset) {
                    f14 = this.mFireThreshold;
                    f15 = f11 - f14;
                    if ((this.mFireLastPos - f14) * f15 >= 0.0f && f15 < 0.0f) {
                        this.mFireNegativeReset = false;
                        z12 = true;
                    }
                    if (this.mFirePositiveReset) {
                        f12 = this.mFireThreshold;
                        f13 = f11 - f12;
                        if ((this.mFireLastPos - f12) * f13 < 0.0f || f13 <= 0.0f) {
                            z15 = false;
                        } else {
                            this.mFirePositiveReset = false;
                        }
                        z13 = z15;
                    } else {
                        if (Math.abs(f11 - this.mFireThreshold) > this.mTriggerSlack) {
                            this.mFirePositiveReset = true;
                        }
                        z13 = false;
                    }
                    z16 = z12;
                } else if (Math.abs(f11 - this.mFireThreshold) > this.mTriggerSlack) {
                    this.mFireNegativeReset = true;
                }
                z12 = false;
                if (this.mFirePositiveReset) {
                    f12 = this.mFireThreshold;
                    f13 = f11 - f12;
                    if ((this.mFireLastPos - f12) * f13 < 0.0f) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    z13 = z15;
                } else {
                    if (Math.abs(f11 - this.mFireThreshold) > this.mTriggerSlack) {
                        this.mFirePositiveReset = true;
                    }
                    z13 = false;
                }
                z16 = z12;
            } else if (Math.abs(f11 - this.mFireThreshold) > this.mTriggerSlack) {
                this.mFireCrossReset = true;
            }
            z11 = false;
            if (this.mFireNegativeReset) {
                f14 = this.mFireThreshold;
                f15 = f11 - f14;
                if ((this.mFireLastPos - f14) * f15 >= 0.0f) {
                }
                if (this.mFirePositiveReset) {
                    f12 = this.mFireThreshold;
                    f13 = f11 - f12;
                    if ((this.mFireLastPos - f12) * f13 < 0.0f) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    z13 = z15;
                } else {
                    if (Math.abs(f11 - this.mFireThreshold) > this.mTriggerSlack) {
                        this.mFirePositiveReset = true;
                    }
                    z13 = false;
                }
                z16 = z12;
            } else if (Math.abs(f11 - this.mFireThreshold) > this.mTriggerSlack) {
                this.mFireNegativeReset = true;
            }
            z12 = false;
            if (this.mFirePositiveReset) {
                f12 = this.mFireThreshold;
                f13 = f11 - f12;
                if ((this.mFireLastPos - f12) * f13 < 0.0f) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                z13 = z15;
            } else {
                if (Math.abs(f11 - this.mFireThreshold) > this.mTriggerSlack) {
                    this.mFirePositiveReset = true;
                }
                z13 = false;
            }
            z16 = z12;
        }
        this.mFireLastPos = f11;
        if (z16 || z11 || z13) {
            ((MotionLayout) view.getParent()).fireTrigger(this.mTriggerID, z13, f11);
        }
        View viewFindViewById = this.mTriggerReceiver == Key.UNSET ? view : ((MotionLayout) view.getParent()).findViewById(this.mTriggerReceiver);
        if (z16) {
            String str = this.mNegativeCross;
            if (str != null) {
                fire(str, viewFindViewById);
            }
            if (this.mViewTransitionOnNegativeCross != Key.UNSET) {
                ((MotionLayout) view.getParent()).viewTransition(this.mViewTransitionOnNegativeCross, viewFindViewById);
            }
        }
        if (z13) {
            String str2 = this.mPositiveCross;
            if (str2 != null) {
                fire(str2, viewFindViewById);
            }
            if (this.mViewTransitionOnPositiveCross != Key.UNSET) {
                ((MotionLayout) view.getParent()).viewTransition(this.mViewTransitionOnPositiveCross, viewFindViewById);
            }
        }
        if (z11) {
            String str3 = this.mCross;
            if (str3 != null) {
                fire(str3, viewFindViewById);
            }
            if (this.mViewTransitionOnCross != Key.UNSET) {
                ((MotionLayout) view.getParent()).viewTransition(this.mViewTransitionOnCross, viewFindViewById);
            }
        }
    }

    public int getCurveFit() {
        return this.mCurveFit;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        Loader.read(this, context.obtainStyledAttributes(attributeSet, C1528R.styleable.KeyTrigger), context);
    }

    public KeyTrigger() {
        int i11 = Key.UNSET;
        this.mViewTransitionOnNegativeCross = i11;
        this.mViewTransitionOnPositiveCross = i11;
        this.mViewTransitionOnCross = i11;
        this.mCollisionRect = new RectF();
        this.mTargetRect = new RectF();
        this.mMethodHashMap = new HashMap<>();
        this.mCurveFit = -1;
        this.mCross = null;
        int i12 = Key.UNSET;
        this.mTriggerReceiver = i12;
        this.mNegativeCross = null;
        this.mPositiveCross = null;
        this.mTriggerID = i12;
        this.mTriggerCollisionId = i12;
        this.mTriggerCollisionView = null;
        this.mFireCrossReset = true;
        this.mFireNegativeReset = true;
        this.mFirePositiveReset = true;
        this.mFireThreshold = Float.NaN;
        this.mPostLayout = false;
        this.mType = 5;
        this.mCustomConstraints = new HashMap<>();
    }

    private void fireCustom(String str, View view) {
        boolean z11;
        if (str.length() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.mCustomConstraints.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z11 || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.applyCustom(view);
                }
            }
        }
    }

    private void setUpRect(RectF rectF, View view, boolean z11) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z11) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyTrigger keyTrigger = (KeyTrigger) key;
        this.mCurveFit = keyTrigger.mCurveFit;
        this.mCross = keyTrigger.mCross;
        this.mTriggerReceiver = keyTrigger.mTriggerReceiver;
        this.mNegativeCross = keyTrigger.mNegativeCross;
        this.mPositiveCross = keyTrigger.mPositiveCross;
        this.mTriggerID = keyTrigger.mTriggerID;
        this.mTriggerCollisionId = keyTrigger.mTriggerCollisionId;
        this.mTriggerCollisionView = keyTrigger.mTriggerCollisionView;
        this.mTriggerSlack = keyTrigger.mTriggerSlack;
        this.mFireCrossReset = keyTrigger.mFireCrossReset;
        this.mFireNegativeReset = keyTrigger.mFireNegativeReset;
        this.mFirePositiveReset = keyTrigger.mFirePositiveReset;
        this.mFireThreshold = keyTrigger.mFireThreshold;
        this.mFireLastPos = keyTrigger.mFireLastPos;
        this.mPostLayout = keyTrigger.mPostLayout;
        this.mCollisionRect = keyTrigger.mCollisionRect;
        this.mTargetRect = keyTrigger.mTargetRect;
        this.mMethodHashMap = keyTrigger.mMethodHashMap;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "positiveCross":
                this.mPositiveCross = obj.toString();
                break;
            case "viewTransitionOnPositiveCross":
                this.mViewTransitionOnPositiveCross = toInt(obj);
                break;
            case "triggerCollisionId":
                this.mTriggerCollisionId = toInt(obj);
                break;
            case "triggerID":
                this.mTriggerID = toInt(obj);
                break;
            case "negativeCross":
                this.mNegativeCross = obj.toString();
                break;
            case "triggerCollisionView":
                this.mTriggerCollisionView = (View) obj;
                break;
            case "viewTransitionOnNegativeCross":
                this.mViewTransitionOnNegativeCross = toInt(obj);
                break;
            case "CROSS":
                this.mCross = obj.toString();
                break;
            case "triggerSlack":
                this.mTriggerSlack = toFloat(obj);
                break;
            case "viewTransitionOnCross":
                this.mViewTransitionOnCross = toInt(obj);
                break;
            case "postLayout":
                this.mPostLayout = toBoolean(obj);
                break;
            case "triggerReceiver":
                this.mTriggerReceiver = toInt(obj);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
    }
}
