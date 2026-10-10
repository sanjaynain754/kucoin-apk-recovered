package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ViewSpline extends SplineSet {
    private static final String TAG = "ViewSpline";

    public static class CustomSet extends ViewSpline {
        String mAttributeName;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i11, float f11) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        public void setPoint(int i11, ConstraintAttribute constraintAttribute) {
            this.mConstraintAttributeList.append(i11, constraintAttribute);
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            this.mCurveFit.getPos(f11, this.mTempValues);
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mTempValues);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i11) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i12);
                ConstraintAttribute constraintAttributeValueAt = this.mConstraintAttributeList.valueAt(i12);
                dArr[i12] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i11, dArr, dArr2);
        }

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }
    }

    public abstract void setProperty(View view, float f11);

    public static class AlphaSet extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setAlpha(get(f11));
        }
    }

    public static class ElevationSet extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setElevation(get(f11));
        }
    }

    public static class PathRotate extends ViewSpline {
        public void setPathRotate(View view, float f11, double d11, double d12) {
            view.setRotation(get(f11) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
        }
    }

    public static class PivotXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setPivotX(get(f11));
        }
    }

    public static class PivotYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setPivotY(get(f11));
        }
    }

    public static class ProgressSet extends ViewSpline {
        boolean mNoMethod = false;

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f11));
                return;
            }
            if (!this.mNoMethod) {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.mNoMethod = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(get(f11)));
                    } catch (IllegalAccessException e11) {
                        Log.e(ViewSpline.TAG, "unable to setProgress", e11);
                    } catch (InvocationTargetException e12) {
                        Log.e(ViewSpline.TAG, "unable to setProgress", e12);
                    }
                }
            }
        }
    }

    public static class RotationSet extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setRotation(get(f11));
        }
    }

    public static class RotationXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setRotationX(get(f11));
        }
    }

    public static class RotationYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setRotationY(get(f11));
        }
    }

    public static class ScaleXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setScaleX(get(f11));
        }
    }

    public static class ScaleYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setScaleY(get(f11));
        }
    }

    public static class TranslationXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setTranslationX(get(f11));
        }
    }

    public static class TranslationYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setTranslationY(get(f11));
        }
    }

    public static class TranslationZset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setTranslationZ(get(f11));
        }
    }

    public static ViewSpline makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static ViewSpline makeSpline(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return new RotationXset();
            case "rotationY":
                return new RotationYset();
            case "translationX":
                return new TranslationXset();
            case "translationY":
                return new TranslationYset();
            case "translationZ":
                return new TranslationZset();
            case "progress":
                return new ProgressSet();
            case "scaleX":
                return new ScaleXset();
            case "scaleY":
                return new ScaleYset();
            case "waveVariesBy":
                return new AlphaSet();
            case "transformPivotX":
                return new PivotXset();
            case "transformPivotY":
                return new PivotYset();
            case "rotation":
                return new RotationSet();
            case "elevation":
                return new ElevationSet();
            case "transitionPathRotate":
                return new PathRotate();
            case "alpha":
                return new AlphaSet();
            case "waveOffset":
                return new AlphaSet();
            default:
                return null;
        }
    }
}
