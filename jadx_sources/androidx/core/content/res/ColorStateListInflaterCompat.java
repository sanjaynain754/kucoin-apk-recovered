package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.C1533R;
import androidx.core.math.MathUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ColorStateListInflaterCompat {
    private static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal<>();

    @Nullable
    public static ColorStateList inflate(@NonNull Resources resources, @XmlRes int i11, @Nullable Resources.Theme theme) {
        try {
            return createFromXml(resources, resources.getXml(i11), theme);
        } catch (Exception e11) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e11);
            return null;
        }
    }

    @ColorInt
    private static int modulateColorAlpha(@ColorInt int i11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f11, @FloatRange(from = 0.0d, m1552to = 100.0d) float f12) {
        boolean z11 = f12 >= 0.0f && f12 <= 100.0f;
        if (f11 == 1.0f && !z11) {
            return i11;
        }
        int iClamp = MathUtils.clamp((int) ((Color.alpha(i11) * f11) + 0.5f), 0, 255);
        if (z11) {
            CamColor camColorFromColor = CamColor.fromColor(i11);
            i11 = CamColor.toColor(camColorFromColor.getHue(), camColorFromColor.getChroma(), f12);
        }
        return (i11 & 16777215) | (iClamp << 24);
    }

    @NonNull
    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = sTempTypedValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private ColorStateListInflaterCompat() {
    }

    @NonNull
    public static ColorStateList createFromXml(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return createFromXmlInner(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    public static ColorStateList createFromXmlInner(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return inflate(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static boolean isColorInt(@NonNull Resources resources, @ColorRes int i11) {
        TypedValue typedValue = getTypedValue();
        resources.getValue(i11, typedValue, true);
        int i12 = typedValue.type;
        if (i12 >= 28 && i12 <= 31) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    private static ColorStateList inflate(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f11;
        int i11 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrAppend = new int[20];
        int i12 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i11 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = obtainAttributes(resources, theme, attributeSet, C1533R.styleable.ColorStateListItem);
                int i13 = C1533R.styleable.ColorStateListItem_android_color;
                int resourceId = typedArrayObtainAttributes.getResourceId(i13, -1);
                if (resourceId != -1 && !isColorInt(resources, resourceId)) {
                    try {
                        color = createFromXml(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayObtainAttributes.getColor(C1533R.styleable.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(i13, -65281);
                }
                int i14 = C1533R.styleable.ColorStateListItem_android_alpha;
                float f12 = 1.0f;
                if (typedArrayObtainAttributes.hasValue(i14)) {
                    f12 = typedArrayObtainAttributes.getFloat(i14, 1.0f);
                } else {
                    int i15 = C1533R.styleable.ColorStateListItem_alpha;
                    if (typedArrayObtainAttributes.hasValue(i15)) {
                        f12 = typedArrayObtainAttributes.getFloat(i15, 1.0f);
                    }
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    int i16 = C1533R.styleable.ColorStateListItem_android_lStar;
                    if (typedArrayObtainAttributes.hasValue(i16)) {
                        f11 = typedArrayObtainAttributes.getFloat(i16, -1.0f);
                    } else {
                        f11 = typedArrayObtainAttributes.getFloat(C1533R.styleable.ColorStateListItem_lStar, -1.0f);
                    }
                } else {
                    f11 = typedArrayObtainAttributes.getFloat(C1533R.styleable.ColorStateListItem_lStar, -1.0f);
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i17 = 0;
                for (int i18 = 0; i18 < attributeCount; i18++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i18);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C1533R.attr.alpha && attributeNameResource != C1533R.attr.lStar) {
                        int i19 = i17 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i18, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i17] = attributeNameResource;
                        i17 = i19;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i17);
                iArrAppend = GrowingArrayUtils.append(iArrAppend, i12, modulateColorAlpha(color, f12, f11));
                iArr = (int[][]) GrowingArrayUtils.append(iArr, i12, iArrTrimStateSet);
                i12++;
            }
            i11 = 1;
        }
        int[] iArr3 = new int[i12];
        int[][] iArr4 = new int[i12][];
        System.arraycopy(iArrAppend, 0, iArr3, 0, i12);
        System.arraycopy(iArr, 0, iArr4, 0, i12);
        return new ColorStateList(iArr4, iArr3);
    }
}
