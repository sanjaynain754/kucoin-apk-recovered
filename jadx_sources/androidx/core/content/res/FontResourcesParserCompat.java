package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.C1533R;
import androidx.core.provider.FontRequest;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FontResourcesParserCompat {
    private static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    private static final int ITALIC = 1;
    private static final int NORMAL_WEIGHT = 400;

    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {

        @NonNull
        private final FontFileResourceEntry[] mEntries;

        @NonNull
        public FontFileResourceEntry[] getEntries() {
            return this.mEntries;
        }

        public FontFamilyFilesResourceEntry(@NonNull FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.mEntries = fontFileResourceEntryArr;
        }
    }

    public static final class FontFileResourceEntry {

        @NonNull
        private final String mFileName;
        private final boolean mItalic;
        private final int mResourceId;
        private final int mTtcIndex;
        private final String mVariationSettings;
        private final int mWeight;

        @NonNull
        public String getFileName() {
            return this.mFileName;
        }

        public int getResourceId() {
            return this.mResourceId;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        @Nullable
        public String getVariationSettings() {
            return this.mVariationSettings;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }

        public FontFileResourceEntry(@NonNull String str, int i11, boolean z11, @Nullable String str2, int i12, int i13) {
            this.mFileName = str;
            this.mWeight = i11;
            this.mItalic = z11;
            this.mVariationSettings = str2;
            this.mTtcIndex = i12;
            this.mResourceId = i13;
        }
    }

    public static final class ProviderResourceEntry implements FamilyResourceEntry {

        @Nullable
        private final FontRequest mFallbackRequest;

        @NonNull
        private final FontRequest mRequest;
        private final int mStrategy;

        @Nullable
        private final String mSystemFontFamilyName;
        private final int mTimeoutMs;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public ProviderResourceEntry(@NonNull FontRequest fontRequest, @Nullable FontRequest fontRequest2, int i11, int i12, @Nullable String str) {
            this.mRequest = fontRequest;
            this.mFallbackRequest = fontRequest2;
            this.mStrategy = i11;
            this.mTimeoutMs = i12;
            this.mSystemFontFamilyName = str;
        }

        @Nullable
        public FontRequest getFallbackRequest() {
            return this.mFallbackRequest;
        }

        public int getFetchStrategy() {
            return this.mStrategy;
        }

        @NonNull
        public FontRequest getRequest() {
            return this.mRequest;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public String getSystemFontFamilyName() {
            return this.mSystemFontFamilyName;
        }

        public int getTimeout() {
            return this.mTimeoutMs;
        }

        public ProviderResourceEntry(@NonNull FontRequest fontRequest, int i11, int i12) {
            this(fontRequest, null, i11, i12, null);
        }
    }

    @Nullable
    private static FamilyResourceEntry readFamilies(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return readFamily(xmlPullParser, resources);
        }
        skip(xmlPullParser);
        return null;
    }

    private static void skip(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i11 = 1;
        while (i11 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i11++;
            } else if (next == 3) {
                i11--;
            }
        }
    }

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static int getType(TypedArray typedArray, int i11) {
            return typedArray.getType(i11);
        }
    }

    @NonNull
    public static List<List<byte[]>> readCerts(@NonNull Resources resources, @ArrayRes int i11) {
        if (i11 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i11);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (getType(typedArrayObtainTypedArray, 0) == 1) {
                for (int i12 = 0; i12 < typedArrayObtainTypedArray.length(); i12++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i12, 0);
                    if (resourceId != 0) {
                        arrayList.add(toByteArrayList(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(toByteArrayList(resources.getStringArray(i11)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    @Nullable
    private static FamilyResourceEntry readFamily(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C1533R.styleable.FontFamily);
        String string = typedArrayObtainAttributes.getString(C1533R.styleable.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(C1533R.styleable.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(C1533R.styleable.FontFamily_fontProviderQuery);
        String string4 = typedArrayObtainAttributes.getString(C1533R.styleable.FontFamily_fontProviderFallbackQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(C1533R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(C1533R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(C1533R.styleable.FontFamily_fontProviderFetchTimeout, 500);
        String string5 = typedArrayObtainAttributes.getString(C1533R.styleable.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                skip(xmlPullParser);
            }
            List<List<byte[]>> certs = readCerts(resources, resourceId);
            return new ProviderResourceEntry(new FontRequest(string, string2, string3, certs), string4 != null ? new FontRequest(string, string2, string4, certs) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(readFont(xmlPullParser, resources));
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new FontFamilyFilesResourceEntry((FontFileResourceEntry[]) arrayList.toArray(new FontFileResourceEntry[0]));
    }

    private static List<byte[]> toByteArrayList(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    private FontResourcesParserCompat() {
    }

    private static int getType(TypedArray typedArray, int i11) {
        return Api21Impl.getType(typedArray, i11);
    }

    @Nullable
    public static FamilyResourceEntry parse(@NonNull XmlPullParser xmlPullParser, @NonNull Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return readFamilies(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    private static FontFileResourceEntry readFont(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        boolean z11;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C1533R.styleable.FontFamilyFont);
        int i11 = C1533R.styleable.FontFamilyFont_fontWeight;
        if (!typedArrayObtainAttributes.hasValue(i11)) {
            i11 = C1533R.styleable.FontFamilyFont_android_fontWeight;
        }
        int i12 = typedArrayObtainAttributes.getInt(i11, 400);
        int i13 = C1533R.styleable.FontFamilyFont_fontStyle;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = C1533R.styleable.FontFamilyFont_android_fontStyle;
        }
        if (1 == typedArrayObtainAttributes.getInt(i13, 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i14 = C1533R.styleable.FontFamilyFont_ttcIndex;
        if (!typedArrayObtainAttributes.hasValue(i14)) {
            i14 = C1533R.styleable.FontFamilyFont_android_ttcIndex;
        }
        int i15 = C1533R.styleable.FontFamilyFont_fontVariationSettings;
        if (!typedArrayObtainAttributes.hasValue(i15)) {
            i15 = C1533R.styleable.FontFamilyFont_android_fontVariationSettings;
        }
        String string = typedArrayObtainAttributes.getString(i15);
        int i16 = typedArrayObtainAttributes.getInt(i14, 0);
        int i17 = C1533R.styleable.FontFamilyFont_font;
        if (!typedArrayObtainAttributes.hasValue(i17)) {
            i17 = C1533R.styleable.FontFamilyFont_android_font;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i17, 0);
        String string2 = typedArrayObtainAttributes.getString(i17);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            skip(xmlPullParser);
        }
        return new FontFileResourceEntry(string2, i12, z11, string, i16, resourceId);
    }
}
