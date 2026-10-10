package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import com.facebook.react.uimanager.layoutanimation.SimpleSpringInterpolator;
import com.jumio.core.extraction.ProcessingTimesRecorderKt;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes23.dex */
public class TransitionParser {
    private static int map(String str, String... strArr) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (strArr[i11].equals(str)) {
                return i11;
            }
        }
        return 0;
    }

    @Deprecated
    public static void parse(CLObject cLObject, Transition transition, CorePixelDp corePixelDp) throws CLParsingException {
        parse(cLObject, transition);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void parse(@NonNull CLObject cLObject, @NonNull Transition transition) throws CLParsingException {
        transition.resetProperties();
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        TypedBundle typedBundle = new TypedBundle();
        boolean z11 = true;
        boolean z12 = false;
        if (stringOrNull != null) {
            switch (stringOrNull) {
                case "startVertical":
                    typedBundle.add(509, 1);
                    break;
                case "startHorizontal":
                    typedBundle.add(509, 2);
                    break;
                case "flip":
                    typedBundle.add(509, 3);
                    break;
                case "none":
                    typedBundle.add(509, 0);
                    break;
                case "above":
                    typedBundle.add(509, 5);
                    break;
                case "below":
                    typedBundle.add(509, 4);
                    break;
            }
            z12 = true;
        }
        String stringOrNull2 = cLObject.getStringOrNull("interpolator");
        if (stringOrNull2 != null) {
            typedBundle.add(TypedValues.TransitionType.TYPE_INTERPOLATOR, stringOrNull2);
            z12 = true;
        }
        float floatOrNaN = cLObject.getFloatOrNaN(TypedValues.TransitionType.S_STAGGERED);
        if (Float.isNaN(floatOrNaN)) {
            z11 = z12;
        } else {
            typedBundle.add(TypedValues.TransitionType.TYPE_STAGGERED, floatOrNaN);
        }
        if (z11) {
            transition.setTransitionProperties(typedBundle);
        }
        CLObject objectOrNull = cLObject.getObjectOrNull("onSwipe");
        if (objectOrNull != null) {
            parseOnSwipe(objectOrNull, transition);
        }
        parseKeyFrames(cLObject, transition);
    }

    private static void parseKeyAttribute(CLObject cLObject, Transition transition) throws CLParsingException {
        CLArray arrayOrNull;
        CustomVariable[][] customVariableArr;
        CLObject cLObject2;
        boolean z11 = true;
        CLArray arrayOrNull2 = cLObject.getArrayOrNull("target");
        if (arrayOrNull2 == null || (arrayOrNull = cLObject.getArrayOrNull(ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL)) == null) {
            return;
        }
        String stringOrNull = cLObject.getStringOrNull("transitionEasing");
        String[] strArr = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"};
        int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 303};
        boolean[] zArr = {false, false, true, true, true, false, false, false, false};
        int size = arrayOrNull.size();
        TypedBundle[] typedBundleArr = new TypedBundle[size];
        for (int i11 = 0; i11 < arrayOrNull.size(); i11++) {
            typedBundleArr[i11] = new TypedBundle();
        }
        int i12 = 0;
        for (int i13 = 9; i12 < i13; i13 = 9) {
            String str = strArr[i12];
            int i14 = iArr[i12];
            boolean z12 = zArr[i12];
            CLArray arrayOrNull3 = cLObject.getArrayOrNull(str);
            boolean z13 = z11;
            if (arrayOrNull3 != null && arrayOrNull3.size() != size) {
                throw new CLParsingException("incorrect size for " + str + " array, not matching targets array!", cLObject);
            }
            if (arrayOrNull3 != null) {
                for (int i15 = 0; i15 < size; i15++) {
                    float pixels = arrayOrNull3.getFloat(i15);
                    if (z12) {
                        pixels = transition.mToPixel.toPixels(pixels);
                    }
                    typedBundleArr[i15].add(i14, pixels);
                }
            } else {
                float floatOrNaN = cLObject.getFloatOrNaN(str);
                if (!Float.isNaN(floatOrNaN)) {
                    if (z12) {
                        floatOrNaN = transition.mToPixel.toPixels(floatOrNaN);
                    }
                    for (int i16 = 0; i16 < size; i16++) {
                        typedBundleArr[i16].add(i14, floatOrNaN);
                    }
                }
            }
            i12++;
            z11 = z13;
        }
        boolean z14 = z11;
        int i17 = 0;
        CLElement orNull = cLObject.getOrNull("custom");
        if (orNull == null || !(orNull instanceof CLObject)) {
            customVariableArr = null;
        } else {
            CLObject cLObject3 = (CLObject) orNull;
            int size2 = cLObject3.size();
            int size3 = arrayOrNull.size();
            int[] iArr2 = new int[2];
            iArr2[z14 ? 1 : 0] = size2;
            iArr2[0] = size3;
            customVariableArr = (CustomVariable[][]) Array.newInstance((Class<?>) CustomVariable.class, iArr2);
            int i18 = 0;
            while (i18 < size2) {
                CLKey cLKey = (CLKey) cLObject3.get(i18);
                String strContent = cLKey.content();
                if (cLKey.getValue() instanceof CLArray) {
                    CLArray cLArray = (CLArray) cLKey.getValue();
                    int size4 = cLArray.size();
                    if (size4 != size || size4 <= 0) {
                        cLObject2 = cLObject3;
                    } else {
                        int i19 = i17;
                        if (cLArray.get(i19) instanceof CLNumber) {
                            int i21 = i19;
                            while (i21 < size) {
                                customVariableArr[i21][i18] = new CustomVariable(strContent, 901, cLArray.get(i21).getFloat());
                                i21++;
                                cLObject3 = cLObject3;
                            }
                            cLObject2 = cLObject3;
                        } else {
                            cLObject2 = cLObject3;
                            for (int i22 = 0; i22 < size; i22++) {
                                long colorString = ConstraintSetParser.parseColorString(cLArray.get(i22).content());
                                if (colorString != -1) {
                                    customVariableArr[i22][i18] = new CustomVariable(strContent, 902, (int) colorString);
                                }
                            }
                        }
                    }
                } else {
                    cLObject2 = cLObject3;
                    CLElement value = cLKey.getValue();
                    if (value instanceof CLNumber) {
                        float f11 = value.getFloat();
                        for (int i23 = 0; i23 < size; i23++) {
                            customVariableArr[i23][i18] = new CustomVariable(strContent, 901, f11);
                        }
                    } else {
                        long colorString2 = ConstraintSetParser.parseColorString(value.content());
                        if (colorString2 != -1) {
                            int i24 = 0;
                            while (i24 < size) {
                                customVariableArr[i24][i18] = new CustomVariable(strContent, 902, (int) colorString2);
                                i24++;
                                size2 = size2;
                                colorString2 = colorString2;
                            }
                        }
                    }
                }
                i18++;
                size2 = size2;
                cLObject3 = cLObject2;
                i17 = 0;
            }
        }
        String stringOrNull2 = cLObject.getStringOrNull("curveFit");
        for (int i25 = 0; i25 < arrayOrNull2.size(); i25++) {
            for (int i26 = 0; i26 < size; i26++) {
                String string = arrayOrNull2.getString(i25);
                TypedBundle typedBundle = typedBundleArr[i26];
                if (stringOrNull2 != null) {
                    typedBundle.add(508, map(stringOrNull2, "spline", "linear"));
                }
                typedBundle.addIfNotNull(501, stringOrNull);
                typedBundle.add(100, arrayOrNull.getInt(i26));
                transition.addKeyAttribute(string, typedBundle, customVariableArr != null ? customVariableArr[i26] : null);
            }
        }
    }

    private static void parseKeyCycle(CLObject cLObject, Transition transition) throws CLParsingException {
        CLArray array = cLObject.getArray("target");
        CLArray array2 = cLObject.getArray(ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL);
        String stringOrNull = cLObject.getStringOrNull("transitionEasing");
        String[] strArr = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", "period", TypedValues.CycleType.S_WAVE_OFFSET, TypedValues.CycleType.S_WAVE_PHASE};
        int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 403, TypedValues.CycleType.TYPE_WAVE_PERIOD, TypedValues.CycleType.TYPE_WAVE_OFFSET, TypedValues.CycleType.TYPE_WAVE_PHASE};
        int[] iArr2 = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 0};
        int size = array2.size();
        TypedBundle[] typedBundleArr = new TypedBundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            typedBundleArr[i11] = new TypedBundle();
        }
        boolean z11 = false;
        for (int i12 = 0; i12 < 12; i12++) {
            if (cLObject.has(strArr[i12]) && iArr2[i12] == 1) {
                z11 = true;
            }
        }
        int i13 = 0;
        for (int i14 = 12; i13 < i14; i14 = 12) {
            String str = strArr[i13];
            int i15 = iArr[i13];
            int i16 = iArr2[i13];
            CLArray arrayOrNull = cLObject.getArrayOrNull(str);
            String[] strArr2 = strArr;
            if (arrayOrNull != null && arrayOrNull.size() != size) {
                throw new CLParsingException("incorrect size for $attrName array, not matching targets array!", cLObject);
            }
            if (arrayOrNull != null) {
                int i17 = 0;
                while (i17 < size) {
                    float pixels = arrayOrNull.getFloat(i17);
                    int i18 = i17;
                    if (i16 == 1) {
                        pixels = transition.mToPixel.toPixels(pixels);
                    } else if (i16 == 2 && z11) {
                        pixels = transition.mToPixel.toPixels(pixels);
                    }
                    typedBundleArr[i18].add(i15, pixels);
                    i17 = i18 + 1;
                }
            } else {
                float floatOrNaN = cLObject.getFloatOrNaN(str);
                if (!Float.isNaN(floatOrNaN)) {
                    if (i16 == 1) {
                        floatOrNaN = transition.mToPixel.toPixels(floatOrNaN);
                    } else if (i16 == 2 && z11) {
                        floatOrNaN = transition.mToPixel.toPixels(floatOrNaN);
                    }
                    for (int i19 = 0; i19 < size; i19++) {
                        typedBundleArr[i19].add(i15, floatOrNaN);
                    }
                }
                i13++;
                strArr = strArr2;
            }
            i13++;
            strArr = strArr2;
        }
        String stringOrNull2 = cLObject.getStringOrNull("curveFit");
        String stringOrNull3 = cLObject.getStringOrNull("easing");
        String stringOrNull4 = cLObject.getStringOrNull("waveShape");
        String stringOrNull5 = cLObject.getStringOrNull(TypedValues.CycleType.S_CUSTOM_WAVE_SHAPE);
        for (int i21 = 0; i21 < array.size(); i21++) {
            for (int i22 = 0; i22 < size; i22++) {
                String string = array.getString(i21);
                TypedBundle typedBundle = typedBundleArr[i22];
                if (stringOrNull2 != null) {
                    if (stringOrNull2.equals("linear")) {
                        typedBundle.add(401, 1);
                    } else if (stringOrNull2.equals("spline")) {
                        typedBundle.add(401, 0);
                    }
                }
                typedBundle.addIfNotNull(501, stringOrNull);
                if (stringOrNull3 != null) {
                    typedBundle.add(TypedValues.CycleType.TYPE_EASING, stringOrNull3);
                }
                if (stringOrNull4 != null) {
                    typedBundle.add(421, stringOrNull4);
                }
                if (stringOrNull5 != null) {
                    typedBundle.add(422, stringOrNull5);
                }
                typedBundle.add(100, array2.getInt(i22));
                transition.addKeyCycle(string, typedBundle);
            }
        }
    }

    public static void parseKeyFrames(CLObject cLObject, Transition transition) throws CLParsingException {
        CLObject objectOrNull = cLObject.getObjectOrNull("KeyFrames");
        if (objectOrNull == null) {
            return;
        }
        CLArray arrayOrNull = objectOrNull.getArrayOrNull("KeyPositions");
        if (arrayOrNull != null) {
            for (int i11 = 0; i11 < arrayOrNull.size(); i11++) {
                CLElement cLElement = arrayOrNull.get(i11);
                if (cLElement instanceof CLObject) {
                    parseKeyPosition((CLObject) cLElement, transition);
                }
            }
        }
        CLArray arrayOrNull2 = objectOrNull.getArrayOrNull(TypedValues.AttributesType.NAME);
        if (arrayOrNull2 != null) {
            for (int i12 = 0; i12 < arrayOrNull2.size(); i12++) {
                CLElement cLElement2 = arrayOrNull2.get(i12);
                if (cLElement2 instanceof CLObject) {
                    parseKeyAttribute((CLObject) cLElement2, transition);
                }
            }
        }
        CLArray arrayOrNull3 = objectOrNull.getArrayOrNull("KeyCycles");
        if (arrayOrNull3 != null) {
            for (int i13 = 0; i13 < arrayOrNull3.size(); i13++) {
                CLElement cLElement3 = arrayOrNull3.get(i13);
                if (cLElement3 instanceof CLObject) {
                    parseKeyCycle((CLObject) cLElement3, transition);
                }
            }
        }
    }

    private static void parseKeyPosition(CLObject cLObject, Transition transition) throws CLParsingException {
        TypedBundle typedBundle = new TypedBundle();
        CLArray array = cLObject.getArray("target");
        CLArray array2 = cLObject.getArray(ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL);
        CLArray arrayOrNull = cLObject.getArrayOrNull("percentX");
        CLArray arrayOrNull2 = cLObject.getArrayOrNull("percentY");
        CLArray arrayOrNull3 = cLObject.getArrayOrNull("percentWidth");
        CLArray arrayOrNull4 = cLObject.getArrayOrNull("percentHeight");
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        String stringOrNull2 = cLObject.getStringOrNull("transitionEasing");
        String stringOrNull3 = cLObject.getStringOrNull("curveFit");
        String stringOrNull4 = cLObject.getStringOrNull("type");
        if (stringOrNull4 == null) {
            stringOrNull4 = "parentRelative";
        }
        if (arrayOrNull == null || array2.size() == arrayOrNull.size()) {
            if (arrayOrNull2 == null || array2.size() == arrayOrNull2.size()) {
                int i11 = 0;
                while (i11 < array.size()) {
                    String string = array.getString(i11);
                    int map = map(stringOrNull4, "deltaRelative", "pathRelative", "parentRelative");
                    typedBundle.clear();
                    typedBundle.add(510, map);
                    if (stringOrNull3 != null) {
                        map(typedBundle, 508, stringOrNull3, "spline", "linear");
                    }
                    typedBundle.addIfNotNull(501, stringOrNull2);
                    if (stringOrNull != null) {
                        map(typedBundle, 509, stringOrNull, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                    }
                    int i12 = 0;
                    while (i12 < array2.size()) {
                        typedBundle.add(100, array2.getInt(i12));
                        set(typedBundle, 506, arrayOrNull, i12);
                        set(typedBundle, 507, arrayOrNull2, i12);
                        set(typedBundle, 503, arrayOrNull3, i12);
                        set(typedBundle, 504, arrayOrNull4, i12);
                        transition.addKeyPosition(string, typedBundle);
                        i12++;
                        stringOrNull4 = stringOrNull4;
                    }
                    i11++;
                    stringOrNull4 = stringOrNull4;
                }
            }
        }
    }

    private static void parseOnSwipe(CLContainer cLContainer, Transition transition) {
        String stringOrNull = cLContainer.getStringOrNull("anchor");
        int map = map(cLContainer.getStringOrNull("side"), Transition.OnSwipe.SIDES);
        int map2 = map(cLContainer.getStringOrNull("direction"), Transition.OnSwipe.DIRECTIONS);
        float floatOrNaN = cLContainer.getFloatOrNaN("scale");
        float floatOrNaN2 = cLContainer.getFloatOrNaN("threshold");
        float floatOrNaN3 = cLContainer.getFloatOrNaN("maxVelocity");
        float floatOrNaN4 = cLContainer.getFloatOrNaN("maxAccel");
        String stringOrNull2 = cLContainer.getStringOrNull("limitBounds");
        int map3 = map(cLContainer.getStringOrNull("mode"), Transition.OnSwipe.MODE);
        int map4 = map(cLContainer.getStringOrNull("touchUp"), Transition.OnSwipe.TOUCH_UP);
        float floatOrNaN5 = cLContainer.getFloatOrNaN("springMass");
        float floatOrNaN6 = cLContainer.getFloatOrNaN("springStiffness");
        float floatOrNaN7 = cLContainer.getFloatOrNaN(SimpleSpringInterpolator.PARAM_SPRING_DAMPING);
        float floatOrNaN8 = cLContainer.getFloatOrNaN("stopThreshold");
        int map5 = map(cLContainer.getStringOrNull("springBoundary"), Transition.OnSwipe.BOUNDARY);
        String stringOrNull3 = cLContainer.getStringOrNull("around");
        Transition.OnSwipe onSwipeCreateOnSwipe = transition.createOnSwipe();
        onSwipeCreateOnSwipe.setAnchorId(stringOrNull);
        onSwipeCreateOnSwipe.setAnchorSide(map);
        onSwipeCreateOnSwipe.setDragDirection(map2);
        onSwipeCreateOnSwipe.setDragScale(floatOrNaN);
        onSwipeCreateOnSwipe.setDragThreshold(floatOrNaN2);
        onSwipeCreateOnSwipe.setMaxVelocity(floatOrNaN3);
        onSwipeCreateOnSwipe.setMaxAcceleration(floatOrNaN4);
        onSwipeCreateOnSwipe.setLimitBoundsTo(stringOrNull2);
        onSwipeCreateOnSwipe.setAutoCompleteMode(map3);
        onSwipeCreateOnSwipe.setOnTouchUp(map4);
        onSwipeCreateOnSwipe.setSpringMass(floatOrNaN5);
        onSwipeCreateOnSwipe.setSpringStiffness(floatOrNaN6);
        onSwipeCreateOnSwipe.setSpringDamping(floatOrNaN7);
        onSwipeCreateOnSwipe.setSpringStopThreshold(floatOrNaN8);
        onSwipeCreateOnSwipe.setSpringBoundary(map5);
        onSwipeCreateOnSwipe.setRotationCenterId(stringOrNull3);
    }

    private static void set(TypedBundle typedBundle, int i11, CLArray cLArray, int i12) throws CLParsingException {
        if (cLArray != null) {
            typedBundle.add(i11, cLArray.getFloat(i12));
        }
    }

    private static void map(TypedBundle typedBundle, int i11, String str, String... strArr) {
        for (int i12 = 0; i12 < strArr.length; i12++) {
            if (strArr[i12].equals(str)) {
                typedBundle.add(i11, i12);
            }
        }
    }
}
