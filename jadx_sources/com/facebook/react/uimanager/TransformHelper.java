package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class TransformHelper {
    private static ThreadLocal<double[]> sHelperMatrix = new ThreadLocal<double[]>() { // from class: com.facebook.react.uimanager.TransformHelper.1
        @Override // java.lang.ThreadLocal
        public double[] initialValue() {
            return new double[16];
        }
    };

    private static float[] getTranslateForTransformOrigin(float f11, float f12, ReadableArray readableArray, boolean z11) {
        if (readableArray == null) {
            return null;
        }
        if (f12 == 0.0f && f11 == 0.0f) {
            return null;
        }
        float f13 = f11 / 2.0f;
        float f14 = f12 / 2.0f;
        float[] fArr = new float[3];
        fArr[0] = f13;
        fArr[1] = f14;
        fArr[2] = 0.0f;
        int i11 = 0;
        while (i11 < readableArray.size() && i11 < 3) {
            int i12 = C61032.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i11).ordinal()];
            if (i12 == 1) {
                fArr[i11] = (float) readableArray.getDouble(i11);
            } else if (i12 == 2 && z11) {
                String string = readableArray.getString(i11);
                if (string.endsWith("%")) {
                    fArr[i11] = ((i11 == 0 ? f11 : f12) * Float.parseFloat(string.substring(0, string.length() - 1))) / 100.0f;
                }
            }
            i11++;
        }
        return new float[]{(-f13) + fArr[0], (-f14) + fArr[1], fArr[2]};
    }

    @Deprecated(forRemoval = true, since = "0.75")
    public static void processTransform(ReadableArray readableArray, double[] dArr) {
        processTransform(readableArray, dArr, 0.0f, 0.0f, null, false);
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.TransformHelper$2 */
    public static /* synthetic */ class C61032 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static double parseTranslateValue(String str, double d11) {
        try {
            return str.endsWith("%") ? (Double.parseDouble(str.substring(0, str.length() - 1)) * d11) / 100.0d : Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            C45999a.m101488I(ReactConstants.TAG, "Invalid translate value: " + str);
            return 0.0d;
        }
    }

    @Deprecated(forRemoval = true, since = "0.75")
    public static void processTransform(ReadableArray readableArray, double[] dArr, float f11, float f12, ReadableArray readableArray2) {
        processTransform(readableArray, dArr, f11, f12, readableArray2, false);
    }

    private static double convertToRadians(ReadableMap readableMap, String str) {
        double d11;
        boolean z11 = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z11 = false;
            }
            d11 = Float.parseFloat(string);
        } else {
            d11 = readableMap.getDouble(str);
        }
        if (z11) {
            return d11;
        }
        return MatrixMathHelper.degreesToRadians(d11);
    }

    public static void processTransform(ReadableArray readableArray, double[] dArr, float f11, float f12, ReadableArray readableArray2, boolean z11) {
        double translateValue;
        double translateValue2;
        double translateValue3;
        double translateValue4;
        double[] dArr2 = sHelperMatrix.get();
        MatrixMathHelper.resetIdentityMatrix(dArr);
        float[] translateForTransformOrigin = getTranslateForTransformOrigin(f11, f12, readableArray2, z11);
        int i11 = 0;
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr2);
            MatrixMathHelper.applyTranslate3D(dArr2, translateForTransformOrigin[0], translateForTransformOrigin[1], translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(dArr, dArr, dArr2);
        }
        int i12 = 16;
        if (readableArray.size() == 16 && readableArray.getType(0) == ReadableType.Number) {
            MatrixMathHelper.resetIdentityMatrix(dArr2);
            for (int i13 = 0; i13 < readableArray.size(); i13++) {
                dArr2[i13] = readableArray.getDouble(i13);
            }
            MatrixMathHelper.multiplyInto(dArr, dArr, dArr2);
        } else {
            int size = readableArray.size();
            int i14 = 0;
            while (i14 < size) {
                ReadableMap map = readableArray.getMap(i14);
                String strNextKey = map.keySetIterator().nextKey();
                MatrixMathHelper.resetIdentityMatrix(dArr2);
                if ("matrix".equals(strNextKey)) {
                    ReadableArray array = map.getArray(strNextKey);
                    for (int i15 = i11; i15 < i12; i15++) {
                        dArr2[i15] = array.getDouble(i15);
                    }
                } else if ("perspective".equals(strNextKey)) {
                    MatrixMathHelper.applyPerspective(dArr2, map.getDouble(strNextKey));
                } else if ("rotateX".equals(strNextKey)) {
                    MatrixMathHelper.applyRotateX(dArr2, convertToRadians(map, strNextKey));
                } else if ("rotateY".equals(strNextKey)) {
                    MatrixMathHelper.applyRotateY(dArr2, convertToRadians(map, strNextKey));
                } else {
                    if (!"rotate".equals(strNextKey) && !"rotateZ".equals(strNextKey)) {
                        if ("scale".equals(strNextKey)) {
                            double d11 = map.getDouble(strNextKey);
                            MatrixMathHelper.applyScaleX(dArr2, d11);
                            MatrixMathHelper.applyScaleY(dArr2, d11);
                        } else if ("scaleX".equals(strNextKey)) {
                            MatrixMathHelper.applyScaleX(dArr2, map.getDouble(strNextKey));
                        } else if ("scaleY".equals(strNextKey)) {
                            MatrixMathHelper.applyScaleY(dArr2, map.getDouble(strNextKey));
                        } else if ("translate".equals(strNextKey)) {
                            ReadableArray array2 = map.getArray(strNextKey);
                            ReadableType type = array2.getType(i11);
                            ReadableType readableType = ReadableType.String;
                            if (type == readableType && z11) {
                                translateValue3 = parseTranslateValue(array2.getString(i11), f11);
                            } else {
                                translateValue3 = array2.getDouble(i11);
                            }
                            if (array2.getType(1) == readableType && z11) {
                                translateValue4 = parseTranslateValue(array2.getString(1), f12);
                            } else {
                                translateValue4 = array2.getDouble(1);
                            }
                            MatrixMathHelper.applyTranslate3D(dArr2, translateValue3, translateValue4, array2.size() > 2 ? array2.getDouble(2) : 0.0d);
                        } else {
                            size = size;
                            i11 = i11;
                            i14 = i14;
                            if (ViewProps.TRANSLATE_X.equals(strNextKey)) {
                                if (map.getType(strNextKey) == ReadableType.String && z11) {
                                    translateValue2 = parseTranslateValue(map.getString(strNextKey), f11);
                                } else {
                                    translateValue2 = map.getDouble(strNextKey);
                                }
                                MatrixMathHelper.applyTranslate2D(dArr2, translateValue2, 0.0d);
                            } else if (ViewProps.TRANSLATE_Y.equals(strNextKey)) {
                                if (map.getType(strNextKey) == ReadableType.String && z11) {
                                    translateValue = parseTranslateValue(map.getString(strNextKey), f12);
                                } else {
                                    translateValue = map.getDouble(strNextKey);
                                }
                                MatrixMathHelper.applyTranslate2D(dArr2, 0.0d, translateValue);
                            } else if ("skewX".equals(strNextKey)) {
                                MatrixMathHelper.applySkewX(dArr2, convertToRadians(map, strNextKey));
                            } else if ("skewY".equals(strNextKey)) {
                                MatrixMathHelper.applySkewY(dArr2, convertToRadians(map, strNextKey));
                            } else {
                                C45999a.m101488I(ReactConstants.TAG, "Unsupported transform type: " + strNextKey);
                            }
                        }
                    } else {
                        size = size;
                        i11 = i11;
                        i14 = i14;
                        MatrixMathHelper.applyRotateZ(dArr2, convertToRadians(map, strNextKey));
                    }
                    MatrixMathHelper.multiplyInto(dArr, dArr, dArr2);
                    i14++;
                    size = size;
                    i11 = i11;
                    i12 = 16;
                }
                size = size;
                i11 = i11;
                i14 = i14;
                MatrixMathHelper.multiplyInto(dArr, dArr, dArr2);
                i14++;
                size = size;
                i11 = i11;
                i12 = 16;
            }
        }
        int i16 = i11;
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr2);
            MatrixMathHelper.applyTranslate3D(dArr2, -translateForTransformOrigin[i16], -translateForTransformOrigin[1], -translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(dArr, dArr, dArr2);
        }
    }
}
