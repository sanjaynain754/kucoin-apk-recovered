package androidx.constraintlayout.core.motion;

import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes23.dex */
public class CustomAttribute {
    private static final String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    String mName;
    private String mStringValue;
    private AttributeType mType;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.mMethod = false;
        this.mName = str;
        this.mType = attributeType;
    }

    public boolean diff(CustomAttribute customAttribute) {
        AttributeType attributeType;
        if (customAttribute != null && (attributeType = this.mType) == customAttribute.mType) {
            switch (attributeType) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    if (this.mIntegerValue == customAttribute.mIntegerValue) {
                        return true;
                    }
                    break;
                case FLOAT_TYPE:
                    return this.mFloatValue == customAttribute.mFloatValue;
                case COLOR_TYPE:
                case COLOR_DRAWABLE_TYPE:
                    return this.mColorValue == customAttribute.mColorValue;
                case STRING_TYPE:
                    return this.mIntegerValue == customAttribute.mIntegerValue;
                case BOOLEAN_TYPE:
                    return this.mBooleanValue == customAttribute.mBooleanValue;
                case DIMENSION_TYPE:
                    return this.mFloatValue == customAttribute.mFloatValue;
                default:
                    return false;
            }
        }
        return false;
    }

    public void setValue(float[] fArr) {
        switch (this.mType) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.mIntegerValue = (int) fArr[0];
                return;
            case FLOAT_TYPE:
                this.mFloatValue = fArr[0];
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int iHsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.mColorValue = iHsvToRgb;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (iHsvToRgb & 16777215);
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                this.mBooleanValue = ((double) fArr[0]) > 0.5d;
                return;
            case DIMENSION_TYPE:
                this.mFloatValue = fArr[0];
                return;
            default:
                return;
        }
    }

    private static int clamp(int i11) {
        int i12 = (i11 & (~(i11 >> 31))) - 255;
        return (i12 & (i12 >> 31)) + 255;
    }

    public static int hsvToRgb(float f11, float f12, float f13) {
        float f14 = f11 * 6.0f;
        int i11 = (int) f14;
        float f15 = f14 - i11;
        float f16 = f13 * 255.0f;
        int i12 = (int) (((1.0f - f12) * f16) + 0.5f);
        int i13 = (int) (((1.0f - (f15 * f12)) * f16) + 0.5f);
        int i14 = (int) (((1.0f - ((1.0f - f15) * f12)) * f16) + 0.5f);
        int i15 = (int) (f16 + 0.5f);
        if (i11 == 0) {
            return ((i15 << 16) + (i14 << 8) + i12) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i11 == 1) {
            return ((i13 << 16) + (i15 << 8) + i12) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i11 == 2) {
            return ((i12 << 16) + (i15 << 8) + i14) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i11 == 3) {
            return ((i12 << 16) + (i13 << 8) + i15) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i11 == 4) {
            return ((i14 << 16) + (i12 << 8) + i15) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i11 != 5) {
            return 0;
        }
        return ((i15 << 16) + (i12 << 8) + i13) | ViewCompat.MEASURED_STATE_MASK;
    }

    public AttributeType getType() {
        return this.mType;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case INT_TYPE:
                return this.mIntegerValue;
            case FLOAT_TYPE:
                return this.mFloatValue;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case DIMENSION_TYPE:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.mType) {
            case INT_TYPE:
                fArr[0] = this.mIntegerValue;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i11 = this.mColorValue;
                int i12 = (i11 >> 24) & 255;
                float fPow = (float) Math.pow(((i11 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i11 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i11 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i12 / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int iOrdinal = this.mType.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        int iOrdinal = this.mType.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public void setColorValue(int i11) {
        this.mColorValue = i11;
    }

    public void setFloatValue(float f11) {
        this.mFloatValue = f11;
    }

    public void setIntValue(int i11) {
        this.mIntegerValue = i11;
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z11) {
        this.mName = str;
        this.mType = attributeType;
        this.mMethod = z11;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (this.mType) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.mIntegerValue = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.mColorValue = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.mStringValue = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
        }
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.mMethod = false;
        this.mName = customAttribute.mName;
        this.mType = customAttribute.mType;
        setValue(obj);
    }
}
