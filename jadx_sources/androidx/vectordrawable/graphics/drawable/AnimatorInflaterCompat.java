package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.AnimatorRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class AnimatorInflaterCompat {
    private static final boolean DBG_ANIMATOR_INFLATER = false;
    private static final int MAX_NUM_POINTS = 100;
    private static final String TAG = "AnimatorInflater";
    private static final int TOGETHER = 0;
    private static final int VALUE_TYPE_COLOR = 3;
    private static final int VALUE_TYPE_FLOAT = 0;
    private static final int VALUE_TYPE_INT = 1;
    private static final int VALUE_TYPE_PATH = 2;
    private static final int VALUE_TYPE_UNDEFINED = 4;

    public static class PathDataEvaluator implements TypeEvaluator<PathParser.PathDataNode[]> {
        private PathParser.PathDataNode[] mNodeArray;

        public PathDataEvaluator() {
        }

        public PathDataEvaluator(PathParser.PathDataNode[] pathDataNodeArr) {
            this.mNodeArray = pathDataNodeArr;
        }

        @Override // android.animation.TypeEvaluator
        public PathParser.PathDataNode[] evaluate(float f11, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            if (!PathParser.canMorph(pathDataNodeArr, pathDataNodeArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!PathParser.canMorph(this.mNodeArray, pathDataNodeArr)) {
                this.mNodeArray = PathParser.deepCopyNodes(pathDataNodeArr);
            }
            for (int i11 = 0; i11 < pathDataNodeArr.length; i11++) {
                this.mNodeArray[i11].interpolatePathDataNode(pathDataNodeArr[i11], pathDataNodeArr2[i11], f11);
            }
            return this.mNodeArray;
        }
    }

    private static Animator createAnimatorFromXml(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f11) throws XmlPullParserException, IOException {
        return createAnimatorFromXml(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f11);
    }

    private static PropertyValuesHolder getPVH(TypedArray typedArray, int i11, int i12, int i13, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i12);
        boolean z11 = typedValuePeekValue != null;
        int i14 = z11 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i13);
        boolean z12 = typedValuePeekValue2 != null;
        int i15 = z12 ? typedValuePeekValue2.type : 0;
        if (i11 == 4) {
            i11 = ((z11 && isColorType(i14)) || (z12 && isColorType(i15))) ? 3 : 0;
        }
        boolean z13 = i11 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i11 == 2) {
            String string = typedArray.getString(i12);
            String string2 = typedArray.getString(i13);
            PathParser.PathDataNode[] pathDataNodeArrCreateNodesFromPathData = PathParser.createNodesFromPathData(string);
            PathParser.PathDataNode[] pathDataNodeArrCreateNodesFromPathData2 = PathParser.createNodesFromPathData(string2);
            if (pathDataNodeArrCreateNodesFromPathData != null || pathDataNodeArrCreateNodesFromPathData2 != null) {
                if (pathDataNodeArrCreateNodesFromPathData != null) {
                    PathDataEvaluator pathDataEvaluator = new PathDataEvaluator();
                    if (pathDataNodeArrCreateNodesFromPathData2 == null) {
                        return PropertyValuesHolder.ofObject(str, pathDataEvaluator, pathDataNodeArrCreateNodesFromPathData);
                    }
                    if (PathParser.canMorph(pathDataNodeArrCreateNodesFromPathData, pathDataNodeArrCreateNodesFromPathData2)) {
                        return PropertyValuesHolder.ofObject(str, pathDataEvaluator, pathDataNodeArrCreateNodesFromPathData, pathDataNodeArrCreateNodesFromPathData2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (pathDataNodeArrCreateNodesFromPathData2 != null) {
                    return PropertyValuesHolder.ofObject(str, new PathDataEvaluator(), pathDataNodeArrCreateNodesFromPathData2);
                }
            }
            return null;
        }
        ArgbEvaluator argbEvaluator = i11 == 3 ? ArgbEvaluator.getInstance() : null;
        if (z13) {
            if (z11) {
                float dimension = i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f);
                if (z12) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i15 == 5 ? typedArray.getDimension(i13, 0.0f) : typedArray.getFloat(i13, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i15 == 5 ? typedArray.getDimension(i13, 0.0f) : typedArray.getFloat(i13, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z11) {
            if (i14 == 5) {
                color2 = (int) typedArray.getDimension(i12, 0.0f);
            } else {
                color2 = isColorType(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
            }
            if (z12) {
                if (i15 == 5) {
                    color3 = (int) typedArray.getDimension(i13, 0.0f);
                } else {
                    color3 = isColorType(i15) ? typedArray.getColor(i13, 0) : typedArray.getInt(i13, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z12) {
            if (i15 == 5) {
                color = (int) typedArray.getDimension(i13, 0.0f);
            } else {
                color = isColorType(i15) ? typedArray.getColor(i13, 0) : typedArray.getInt(i13, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt != null && argbEvaluator != null) {
            propertyValuesHolderOfInt.setEvaluator(argbEvaluator);
        }
        return propertyValuesHolderOfInt;
    }

    public static Animator loadAnimator(Context context, @AnimatorRes int i11) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i11);
    }

    private static PropertyValuesHolder loadPvh(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i11) throws XmlPullParserException, IOException {
        int size;
        Context context2;
        Resources.Theme theme2;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals(AnimatedPasterJsonConfig.CONFIG_KEYFRAME)) {
                if (i11 == 4) {
                    i11 = inferValueTypeOfKeyframe(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                int i12 = i11;
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
                Keyframe keyframeLoadKeyframe = loadKeyframe(context2, resources, theme2, Xml.asAttributeSet(xmlPullParser), i12, xmlPullParser2);
                if (keyframeLoadKeyframe != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeLoadKeyframe);
                }
                xmlPullParser2.next();
                i11 = i12;
            } else {
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
            }
            context = context2;
            theme = theme2;
            xmlPullParser = xmlPullParser2;
        }
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            return null;
        }
        Keyframe keyframe = (Keyframe) arrayList.get(0);
        Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
        float fraction = keyframe2.getFraction();
        if (fraction < 1.0f) {
            if (fraction < 0.0f) {
                keyframe2.setFraction(1.0f);
            } else {
                arrayList.add(arrayList.size(), createNewKeyframe(keyframe2, 1.0f));
                size++;
            }
        }
        float fraction2 = keyframe.getFraction();
        if (fraction2 != 0.0f) {
            if (fraction2 < 0.0f) {
                keyframe.setFraction(0.0f);
            } else {
                arrayList.add(0, createNewKeyframe(keyframe, 0.0f));
                size++;
            }
        }
        Keyframe[] keyframeArr = new Keyframe[size];
        arrayList.toArray(keyframeArr);
        for (int i13 = 0; i13 < size; i13++) {
            Keyframe keyframe3 = keyframeArr[i13];
            if (keyframe3.getFraction() < 0.0f) {
                if (i13 == 0) {
                    keyframe3.setFraction(0.0f);
                } else {
                    int i14 = size - 1;
                    if (i13 == i14) {
                        keyframe3.setFraction(1.0f);
                    } else {
                        int i15 = i13;
                        for (int i16 = i13 + 1; i16 < i14 && keyframeArr[i16].getFraction() < 0.0f; i16++) {
                            i15 = i16;
                        }
                        distributeKeyframes(keyframeArr, keyframeArr[i15 + 1].getFraction() - keyframeArr[i13 - 1].getFraction(), i13, i15);
                    }
                }
            }
        }
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
        if (i11 == 3) {
            propertyValuesHolderOfKeyframe.setEvaluator(ArgbEvaluator.getInstance());
        }
        return propertyValuesHolderOfKeyframe;
    }

    private static Animator createAnimatorFromXml(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i11, float f11) throws XmlPullParserException, IOException {
        int i12;
        int depth = xmlPullParser.getDepth();
        Animator animatorLoadAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i12 = 0;
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    animatorLoadAnimator = loadObjectAnimator(context, resources, theme, attributeSet, f11, xmlPullParser);
                } else if (name.equals("animator")) {
                    animatorLoadAnimator = loadAnimator(context, resources, theme, attributeSet, null, f11, xmlPullParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_ANIMATOR_SET);
                    createAnimatorFromXml(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, TypedArrayUtils.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "ordering", 0, 0), f11);
                    typedArrayObtainAttributes.recycle();
                    animatorLoadAnimator = animatorSet2;
                } else {
                    if (!name.equals("propertyValuesHolder")) {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    PropertyValuesHolder[] propertyValuesHolderArrLoadValues = loadValues(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                    if (propertyValuesHolderArrLoadValues != null && (animatorLoadAnimator instanceof ValueAnimator)) {
                        ((ValueAnimator) animatorLoadAnimator).setValues(propertyValuesHolderArrLoadValues);
                    }
                    i12 = 1;
                }
                if (animatorSet != null && i12 == 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animatorLoadAnimator);
                }
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i12] = (Animator) it.next();
                i12++;
            }
            if (i11 == 0) {
                animatorSet.playTogether(animatorArr);
                return animatorLoadAnimator;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return animatorLoadAnimator;
    }

    private static void distributeKeyframes(Keyframe[] keyframeArr, float f11, int i11, int i12) {
        float f12 = f11 / ((i12 - i11) + 2);
        while (i11 <= i12) {
            keyframeArr[i11].setFraction(keyframeArr[i11 - 1].getFraction() + f12);
            i11++;
        }
    }

    private static void dumpKeyframes(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        Log.d(TAG, str);
        int length = objArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            Keyframe keyframe = (Keyframe) objArr[i11];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyframe ");
            sb2.append(i11);
            sb2.append(": fraction ");
            Object value = "null";
            sb2.append(keyframe.getFraction() < 0.0f ? "null" : Float.valueOf(keyframe.getFraction()));
            sb2.append(", , value : ");
            if (keyframe.hasValue()) {
                value = keyframe.getValue();
            }
            sb2.append(value);
            Log.d(TAG, sb2.toString());
        }
    }

    private static int inferValueTypeOfKeyframe(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_KEYFRAME);
        int i11 = 0;
        TypedValue typedValuePeekNamedValue = TypedArrayUtils.peekNamedValue(typedArrayObtainAttributes, xmlPullParser, "value", 0);
        if (typedValuePeekNamedValue != null && isColorType(typedValuePeekNamedValue.type)) {
            i11 = 3;
        }
        typedArrayObtainAttributes.recycle();
        return i11;
    }

    private static boolean isColorType(int i11) {
        return i11 >= 28 && i11 <= 31;
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i11) throws Resources.NotFoundException {
        return loadAnimator(context, resources, theme, i11, 1.0f);
    }

    private static Keyframe loadKeyframe(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i11, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Keyframe keyframeOfFloat;
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_KEYFRAME);
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue typedValuePeekNamedValue = TypedArrayUtils.peekNamedValue(typedArrayObtainAttributes, xmlPullParser, "value", 0);
        boolean z11 = typedValuePeekNamedValue != null;
        if (i11 == 4) {
            i11 = (z11 && isColorType(typedValuePeekNamedValue.type)) ? 3 : 0;
        }
        if (!z11) {
            keyframeOfFloat = i11 == 0 ? Keyframe.ofFloat(namedFloat) : Keyframe.ofInt(namedFloat);
        } else if (i11 != 0) {
            keyframeOfFloat = (i11 == 1 || i11 == 3) ? Keyframe.ofInt(namedFloat, TypedArrayUtils.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "value", 0, 0)) : null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(namedFloat, TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "value", 0, 0.0f));
        }
        int namedResourceId = TypedArrayUtils.getNamedResourceId(typedArrayObtainAttributes, xmlPullParser, "interpolator", 1, 0);
        if (namedResourceId > 0) {
            keyframeOfFloat.setInterpolator(AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
        }
        typedArrayObtainAttributes.recycle();
        return keyframeOfFloat;
    }

    private static ObjectAnimator loadObjectAnimator(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f11, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        loadAnimator(context, resources, theme, attributeSet, objectAnimator, f11, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder[] loadValues(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i11;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser2.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser2.next();
            } else {
                if (xmlPullParser2.getName().equals("propertyValuesHolder")) {
                    TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER);
                    String namedString = TypedArrayUtils.getNamedString(typedArrayObtainAttributes, xmlPullParser2, "propertyName", 3);
                    int namedInt = TypedArrayUtils.getNamedInt(typedArrayObtainAttributes, xmlPullParser2, "valueType", 2, 4);
                    PropertyValuesHolder propertyValuesHolderLoadPvh = loadPvh(context, resources, theme, xmlPullParser2, namedString, namedInt);
                    if (propertyValuesHolderLoadPvh == null) {
                        propertyValuesHolderLoadPvh = getPVH(typedArrayObtainAttributes, namedInt, 0, 1, namedString);
                    }
                    if (propertyValuesHolderLoadPvh != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(propertyValuesHolderLoadPvh);
                    }
                    typedArrayObtainAttributes.recycle();
                }
                xmlPullParser.next();
                xmlPullParser2 = xmlPullParser;
            }
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size];
        for (i11 = 0; i11 < size; i11++) {
            propertyValuesHolderArr[i11] = (PropertyValuesHolder) arrayList.get(i11);
        }
        return propertyValuesHolderArr;
    }

    private static void parseAnimatorFromTypeArray(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f11, XmlPullParser xmlPullParser) {
        long namedInt = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, TypedValues.TransitionType.S_DURATION, 1, 300);
        long namedInt2 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "startOffset", 2, 0);
        int namedInt3 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "valueType", 7, 4);
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "valueFrom") && TypedArrayUtils.hasAttribute(xmlPullParser, "valueTo")) {
            if (namedInt3 == 4) {
                namedInt3 = inferValueTypeFromValues(typedArray, 5, 6);
            }
            PropertyValuesHolder pvh = getPVH(typedArray, namedInt3, 5, 6, "");
            if (pvh != null) {
                valueAnimator.setValues(pvh);
            }
        }
        valueAnimator.setDuration(namedInt);
        valueAnimator.setStartDelay(namedInt2);
        valueAnimator.setRepeatCount(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            setupObjectAnimator(valueAnimator, typedArray2, namedInt3, f11, xmlPullParser);
        }
    }

    private static void setupObjectAnimator(ValueAnimator valueAnimator, TypedArray typedArray, int i11, float f11, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String namedString = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 1);
        if (namedString == null) {
            objectAnimator.setPropertyName(TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String namedString2 = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyXName", 2);
        String namedString3 = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyYName", 3);
        if (i11 != 2) {
        }
        if (namedString2 != null || namedString3 != null) {
            setupPathMotion(PathParser.createPathFromPathData(namedString), objectAnimator, f11 * 0.5f, namedString2, namedString3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    private static void setupPathMotion(Path path, ObjectAnimator objectAnimator, float f11, String str, String str2) {
        char c11 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f12 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f11)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f13 = length / (iMin - 1);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= iMin) {
                break;
            }
            char c12 = c11;
            pathMeasure2.getPosTan(f12 - ((Float) arrayList.get(i12)).floatValue(), fArr3, null);
            fArr[i11] = fArr3[c12];
            fArr2[i11] = fArr3[1];
            f12 += f13;
            int i13 = i12 + 1;
            if (i13 < arrayList.size() && f12 > ((Float) arrayList.get(i13)).floatValue()) {
                pathMeasure2.nextContour();
                i12 = i13;
            }
            i11++;
            c11 = c12;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }

    private AnimatorInflaterCompat() {
    }

    private static Keyframe createNewKeyframe(Keyframe keyframe, float f11) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f11);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f11);
        }
        return Keyframe.ofObject(f11);
    }

    private static int inferValueTypeFromValues(TypedArray typedArray, int i11, int i12) {
        boolean z11;
        int i13;
        int i14;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        boolean z12 = true;
        if (typedValuePeekValue != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i13 = typedValuePeekValue.type;
        } else {
            i13 = 0;
        }
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        if (typedValuePeekValue2 == null) {
            z12 = false;
        }
        if (z12) {
            i14 = typedValuePeekValue2.type;
        } else {
            i14 = 0;
        }
        if (!z11 || !isColorType(i13)) {
            if (!z12 || !isColorType(i14)) {
                return 0;
            }
            return 3;
        }
        return 3;
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i11, float f11) throws Resources.NotFoundException {
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(i11);
                    Animator animatorCreateAnimatorFromXml = createAnimatorFromXml(context, resources, theme, animation, f11);
                    if (animation != null) {
                        animation.close();
                    }
                    return animatorCreateAnimatorFromXml;
                } catch (IOException e11) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i11));
                    notFoundException.initCause(e11);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e12) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i11));
                notFoundException2.initCause(e12);
                throw notFoundException2;
            }
        } catch (Throwable th2) {
            if (animation != null) {
                animation.close();
            }
            throw th2;
        }
    }

    private static ValueAnimator loadAnimator(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f11, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_ANIMATOR);
        TypedArray typedArrayObtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PROPERTY_ANIMATOR);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        parseAnimatorFromTypeArray(valueAnimator, typedArrayObtainAttributes, typedArrayObtainAttributes2, f11, xmlPullParser);
        int namedResourceId = TypedArrayUtils.getNamedResourceId(typedArrayObtainAttributes, xmlPullParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            valueAnimator.setInterpolator(AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
        }
        typedArrayObtainAttributes.recycle();
        if (typedArrayObtainAttributes2 != null) {
            typedArrayObtainAttributes2.recycle();
        }
        return valueAnimator;
    }
}
