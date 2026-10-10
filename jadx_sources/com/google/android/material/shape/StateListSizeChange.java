package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import com.google.android.material.C7090R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StateListSizeChange {
    private static final int INITIAL_CAPACITY = 10;

    @NonNull
    private SizeChange defaultSizeChange;
    int stateCount;

    @NonNull
    int[][] stateSpecs = new int[10][];

    @NonNull
    SizeChange[] sizeChanges = new SizeChange[10];

    public static class SizeChangeAmount {
        float amount;
        SizeChangeType type;

        public int getChange(@Px int i11) {
            SizeChangeType sizeChangeType = this.type;
            if (sizeChangeType == SizeChangeType.PERCENT) {
                return (int) (this.amount * i11);
            }
            if (sizeChangeType == SizeChangeType.PIXELS) {
                return (int) this.amount;
            }
            return 0;
        }

        public SizeChangeAmount(SizeChangeType sizeChangeType, float f11) {
            this.type = sizeChangeType;
            this.amount = f11;
        }
    }

    public enum SizeChangeType {
        PERCENT,
        PIXELS
    }

    @Nullable
    public static StateListSizeChange create(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i11) {
        int next;
        int resourceId = typedArray.getResourceId(i11, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                StateListSizeChange stateListSizeChange = new StateListSizeChange();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    stateListSizeChange.loadSizeChangeFromItems(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return stateListSizeChange;
            } catch (Throwable th2) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public int getMaxWidthChange(@Px int i11) {
        float fMax;
        int i12 = -i11;
        for (int i13 = 0; i13 < this.stateCount; i13++) {
            SizeChangeAmount sizeChangeAmount = this.sizeChanges[i13].widthChange;
            SizeChangeType sizeChangeType = sizeChangeAmount.type;
            if (sizeChangeType == SizeChangeType.PIXELS) {
                fMax = Math.max(i12, sizeChangeAmount.amount);
            } else {
                if (sizeChangeType == SizeChangeType.PERCENT) {
                    fMax = Math.max(i12, i11 * sizeChangeAmount.amount);
                }
            }
            i12 = (int) fMax;
        }
        return i12;
    }

    public static class SizeChange {

        @Nullable
        public SizeChangeAmount widthChange;

        public SizeChange(@Nullable SizeChangeAmount sizeChangeAmount) {
            this.widthChange = sizeChangeAmount;
        }

        public SizeChange(@NonNull SizeChange sizeChange) {
            SizeChangeAmount sizeChangeAmount = sizeChange.widthChange;
            this.widthChange = new SizeChangeAmount(sizeChangeAmount.type, sizeChangeAmount.amount);
        }
    }

    private void addStateSizeChange(@NonNull int[] iArr, @NonNull SizeChange sizeChange) {
        int i11 = this.stateCount;
        if (i11 == 0 || iArr.length == 0) {
            this.defaultSizeChange = sizeChange;
        }
        if (i11 >= this.stateSpecs.length) {
            growArray(i11, i11 + 10);
        }
        int[][] iArr2 = this.stateSpecs;
        int i12 = this.stateCount;
        iArr2[i12] = iArr;
        this.sizeChanges[i12] = sizeChange;
        this.stateCount = i12 + 1;
    }

    private void growArray(int i11, int i12) {
        int[][] iArr = new int[i12][];
        System.arraycopy(this.stateSpecs, 0, iArr, 0, i11);
        this.stateSpecs = iArr;
        SizeChange[] sizeChangeArr = new SizeChange[i12];
        System.arraycopy(this.sizeChanges, 0, sizeChangeArr, 0, i11);
        this.sizeChanges = sizeChangeArr;
    }

    private int indexOfStateSet(int[] iArr) {
        int[][] iArr2 = this.stateSpecs;
        for (int i11 = 0; i11 < this.stateCount; i11++) {
            if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                return i11;
            }
        }
        return -1;
    }

    @NonNull
    public SizeChange getDefaultSizeChange() {
        return this.defaultSizeChange;
    }

    public boolean isStateful() {
        return this.stateCount > 1;
    }

    @Nullable
    private SizeChangeAmount getSizeChangeAmount(@NonNull TypedArray typedArray, int i11, @Nullable SizeChangeAmount sizeChangeAmount) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        if (typedValuePeekValue != null) {
            int i12 = typedValuePeekValue.type;
            if (i12 == 5) {
                return new SizeChangeAmount(SizeChangeType.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i12 == 6) {
                return new SizeChangeAmount(SizeChangeType.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return sizeChangeAmount;
    }

    private void loadSizeChangeFromItems(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainStyledAttributes;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        if (theme == null) {
                            typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSet, C7090R.styleable.StateListSizeChange);
                        } else {
                            typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C7090R.styleable.StateListSizeChange, 0, 0);
                        }
                        SizeChangeAmount sizeChangeAmount = getSizeChangeAmount(typedArrayObtainStyledAttributes, C7090R.styleable.StateListSizeChange_widthChange, null);
                        typedArrayObtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i11 = 0;
                        for (int i12 = 0; i12 < attributeCount; i12++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i12);
                            if (attributeNameResource != C7090R.attr.widthChange) {
                                int i13 = i11 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i11] = attributeNameResource;
                                i11 = i13;
                            }
                        }
                        addStateSizeChange(StateSet.trimStateSet(iArr, i11), new SizeChange(sizeChangeAmount));
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @NonNull
    public SizeChange getSizeChangeForState(@NonNull int[] iArr) {
        int iIndexOfStateSet = indexOfStateSet(iArr);
        if (iIndexOfStateSet < 0) {
            iIndexOfStateSet = indexOfStateSet(StateSet.WILD_CARD);
        }
        if (iIndexOfStateSet < 0) {
            return this.defaultSizeChange;
        }
        return this.sizeChanges[iIndexOfStateSet];
    }
}
