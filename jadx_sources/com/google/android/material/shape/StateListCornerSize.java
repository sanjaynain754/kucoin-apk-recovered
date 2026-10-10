package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import com.google.android.material.C7090R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StateListCornerSize {
    private static final int INITIAL_CAPACITY = 10;

    @NonNull
    private CornerSize defaultCornerSize;
    int stateCount;

    @NonNull
    int[][] stateSpecs = new int[10][];

    @NonNull
    CornerSize[] cornerSizes = new CornerSize[10];

    @NonNull
    public static StateListCornerSize create(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i11, @NonNull CornerSize cornerSize) {
        int next;
        int resourceId = typedArray.getResourceId(i11, 0);
        if (resourceId == 0) {
            return create(ShapeAppearanceModel.getCornerSize(typedArray, i11, cornerSize));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return create(ShapeAppearanceModel.getCornerSize(typedArray, i11, cornerSize));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                StateListCornerSize stateListCornerSize = new StateListCornerSize();
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
                    stateListCornerSize.loadCornerSizesFromItems(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return stateListCornerSize;
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
            return create(cornerSize);
        }
    }

    private void addStateCornerSize(@NonNull int[] iArr, @NonNull CornerSize cornerSize) {
        int i11 = this.stateCount;
        if (i11 == 0 || iArr.length == 0) {
            this.defaultCornerSize = cornerSize;
        }
        if (i11 >= this.stateSpecs.length) {
            growArray(i11, i11 + 10);
        }
        int[][] iArr2 = this.stateSpecs;
        int i12 = this.stateCount;
        iArr2[i12] = iArr;
        this.cornerSizes[i12] = cornerSize;
        this.stateCount = i12 + 1;
    }

    private void growArray(int i11, int i12) {
        int[][] iArr = new int[i12][];
        System.arraycopy(this.stateSpecs, 0, iArr, 0, i11);
        this.stateSpecs = iArr;
        CornerSize[] cornerSizeArr = new CornerSize[i12];
        System.arraycopy(this.cornerSizes, 0, cornerSizeArr, 0, i11);
        this.cornerSizes = cornerSizeArr;
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
    public CornerSize getDefaultCornerSize() {
        return this.defaultCornerSize;
    }

    public boolean isStateful() {
        return this.stateCount > 1;
    }

    @NonNull
    public StateListCornerSize withTransformedCornerSizes(@NonNull ShapeAppearanceModel.CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        StateListCornerSize stateListCornerSize = new StateListCornerSize();
        stateListCornerSize.stateCount = this.stateCount;
        int[][] iArr = new int[this.stateSpecs.length][];
        stateListCornerSize.stateSpecs = iArr;
        int[][] iArr2 = this.stateSpecs;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        stateListCornerSize.cornerSizes = new CornerSize[this.cornerSizes.length];
        for (int i11 = 0; i11 < this.stateCount; i11++) {
            stateListCornerSize.cornerSizes[i11] = cornerSizeUnaryOperator.apply(this.cornerSizes[i11]);
        }
        return stateListCornerSize;
    }

    private void loadCornerSizesFromItems(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
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
                            typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSet, C7090R.styleable.ShapeAppearance);
                        } else {
                            typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C7090R.styleable.ShapeAppearance, 0, 0);
                        }
                        CornerSize cornerSize = ShapeAppearanceModel.getCornerSize(typedArrayObtainStyledAttributes, C7090R.styleable.ShapeAppearance_cornerSize, new AbsoluteCornerSize(0.0f));
                        typedArrayObtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i11 = 0;
                        for (int i12 = 0; i12 < attributeCount; i12++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i12);
                            if (attributeNameResource != C7090R.attr.cornerSize) {
                                int i13 = i11 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i11] = attributeNameResource;
                                i11 = i13;
                            }
                        }
                        addStateCornerSize(StateSet.trimStateSet(iArr, i11), cornerSize);
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
    public CornerSize getCornerSizeForState(@NonNull int[] iArr) {
        int iIndexOfStateSet = indexOfStateSet(iArr);
        if (iIndexOfStateSet < 0) {
            iIndexOfStateSet = indexOfStateSet(StateSet.WILD_CARD);
        }
        if (iIndexOfStateSet < 0) {
            return this.defaultCornerSize;
        }
        return this.cornerSizes[iIndexOfStateSet];
    }

    @NonNull
    public static StateListCornerSize create(@NonNull CornerSize cornerSize) {
        StateListCornerSize stateListCornerSize = new StateListCornerSize();
        stateListCornerSize.addStateCornerSize(StateSet.WILD_CARD, cornerSize);
        return stateListCornerSize;
    }
}
