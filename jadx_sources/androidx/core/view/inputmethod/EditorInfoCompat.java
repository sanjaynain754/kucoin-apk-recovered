package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.BuildCompat;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes23.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class EditorInfoCompat {
    private static final String CONTENT_MIME_TYPES_INTEROP_KEY = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String CONTENT_MIME_TYPES_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String CONTENT_SELECTION_END_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    private static final String CONTENT_SELECTION_HEAD_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    private static final String CONTENT_SURROUNDING_TEXT_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;

    @VisibleForTesting
    static final int MAX_INITIAL_SELECTION_LENGTH = 1024;

    @VisibleForTesting
    static final int MEMORY_EFFICIENT_TEXT_LENGTH = 2048;

    @VisibleForTesting
    static final String STYLUS_HANDWRITING_ENABLED_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";

    private static void trimLongSurroundingText(EditorInfo editorInfo, CharSequence charSequence, int i11, int i12) {
        int i13 = i12 - i11;
        int i14 = i13 > 1024 ? 0 : i13;
        int i15 = 2048 - i14;
        int iMin = Math.min(charSequence.length() - i12, i15 - Math.min(i11, (int) (((double) i15) * 0.8d)));
        int iMin2 = Math.min(i11, i15 - iMin);
        int i16 = i11 - iMin2;
        if (isCutOnSurrogate(charSequence, i16, 0)) {
            i16++;
            iMin2--;
        }
        if (isCutOnSurrogate(charSequence, (i12 + iMin) - 1, 1)) {
            iMin--;
        }
        setSurroundingText(editorInfo, i14 != i13 ? TextUtils.concat(charSequence.subSequence(i16, i16 + iMin2), charSequence.subSequence(i12, iMin + i12)) : charSequence.subSequence(i16, iMin2 + i14 + iMin + i16), iMin2, i14 + iMin2);
    }

    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static CharSequence getInitialSelectedText(@NonNull EditorInfo editorInfo, int i11) {
            return editorInfo.getInitialSelectedText(i11);
        }

        public static CharSequence getInitialTextAfterCursor(@NonNull EditorInfo editorInfo, int i11, int i12) {
            return editorInfo.getInitialTextAfterCursor(i11, i12);
        }

        public static CharSequence getInitialTextBeforeCursor(@NonNull EditorInfo editorInfo, int i11, int i12) {
            return editorInfo.getInitialTextBeforeCursor(i11, i12);
        }

        public static void setInitialSurroundingSubText(@NonNull EditorInfo editorInfo, CharSequence charSequence, int i11) {
            editorInfo.setInitialSurroundingSubText(charSequence, i11);
        }
    }

    @RequiresApi(35)
    public static class Api35Impl {
        private Api35Impl() {
        }

        public static boolean isStylusHandwritingEnabled(@NonNull EditorInfo editorInfo) {
            return editorInfo.isStylusHandwritingEnabled();
        }

        public static void setStylusHandwritingEnabled(@NonNull EditorInfo editorInfo, boolean z11) {
            editorInfo.setStylusHandwritingEnabled(z11);
        }
    }

    @NonNull
    public static String[] getContentMimeTypes(@NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : EMPTY_STRING_ARRAY;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return EMPTY_STRING_ARRAY;
        }
        String[] stringArray = bundle.getStringArray(CONTENT_MIME_TYPES_KEY);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(CONTENT_MIME_TYPES_INTEROP_KEY);
        }
        return stringArray != null ? stringArray : EMPTY_STRING_ARRAY;
    }

    @Nullable
    public static CharSequence getInitialSelectedText(@NonNull EditorInfo editorInfo, int i11) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialSelectedText(editorInfo, i11);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int iMin = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int iMax = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i12 = editorInfo.extras.getInt(CONTENT_SELECTION_HEAD_KEY);
        int i13 = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
        int i14 = iMax - iMin;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i13 - i12 != i14 || (charSequence = editorInfo.extras.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        return (i11 & 1) != 0 ? charSequence.subSequence(i12, i13) : TextUtils.substring(charSequence, i12, i13);
    }

    @Nullable
    public static CharSequence getInitialTextAfterCursor(@NonNull EditorInfo editorInfo, int i11, int i12) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialTextAfterCursor(editorInfo, i11, i12);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        int i13 = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
        int iMin = Math.min(i11, charSequence.length() - i13);
        return (i12 & 1) != 0 ? charSequence.subSequence(i13, iMin + i13) : TextUtils.substring(charSequence, i13, iMin + i13);
    }

    @Nullable
    public static CharSequence getInitialTextBeforeCursor(@NonNull EditorInfo editorInfo, int i11, int i12) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialTextBeforeCursor(editorInfo, i11, i12);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        int i13 = editorInfo.extras.getInt(CONTENT_SELECTION_HEAD_KEY);
        int iMin = Math.min(i11, i13);
        return (i12 & 1) != 0 ? charSequence.subSequence(i13 - iMin, i13) : TextUtils.substring(charSequence, i13 - iMin, i13);
    }

    public static int getProtocol(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean zContainsKey = bundle.containsKey(CONTENT_MIME_TYPES_KEY);
        boolean zContainsKey2 = editorInfo.extras.containsKey(CONTENT_MIME_TYPES_INTEROP_KEY);
        if (zContainsKey && zContainsKey2) {
            return 4;
        }
        if (zContainsKey) {
            return 3;
        }
        return zContainsKey2 ? 2 : 0;
    }

    private static boolean isCutOnSurrogate(CharSequence charSequence, int i11, int i12) {
        if (i12 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i11));
        }
        if (i12 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i11));
    }

    private static boolean isPasswordInputType(int i11) {
        int i12 = i11 & 4095;
        return i12 == 129 || i12 == 225 || i12 == 18;
    }

    public static boolean isStylusHandwritingEnabled(@NonNull EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        if (bundle != null && bundle.containsKey(STYLUS_HANDWRITING_ENABLED_KEY)) {
            return editorInfo.extras.getBoolean(STYLUS_HANDWRITING_ENABLED_KEY);
        }
        if (BuildCompat.isAtLeastV()) {
            return Api35Impl.isStylusHandwritingEnabled(editorInfo);
        }
        return false;
    }

    public static void setContentMimeTypes(@NonNull EditorInfo editorInfo, @Nullable String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(CONTENT_MIME_TYPES_KEY, strArr);
        editorInfo.extras.putStringArray(CONTENT_MIME_TYPES_INTEROP_KEY, strArr);
    }

    public static void setInitialSurroundingText(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence, 0);
        } else {
            setInitialSurroundingSubText(editorInfo, charSequence, 0);
        }
    }

    private static void setSurroundingText(EditorInfo editorInfo, CharSequence charSequence, int i11, int i12) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(CONTENT_SURROUNDING_TEXT_KEY, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(CONTENT_SELECTION_HEAD_KEY, i11);
        editorInfo.extras.putInt(CONTENT_SELECTION_END_KEY, i12);
    }

    @Deprecated
    public EditorInfoCompat() {
    }

    public static void setInitialSurroundingSubText(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence, int i11) {
        int i12;
        int i13;
        Preconditions.checkNotNull(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence, i11);
            return;
        }
        int i14 = editorInfo.initialSelStart;
        int i15 = editorInfo.initialSelEnd;
        if (i14 > i15) {
            i12 = i15 - i11;
        } else {
            i12 = i14 - i11;
        }
        if (i14 > i15) {
            i13 = i14 - i11;
        } else {
            i13 = i15 - i11;
        }
        int length = charSequence.length();
        if (i11 >= 0 && i12 >= 0 && i13 <= length) {
            if (isPasswordInputType(editorInfo.inputType)) {
                setSurroundingText(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                setSurroundingText(editorInfo, charSequence, i12, i13);
                return;
            } else {
                trimLongSurroundingText(editorInfo, charSequence, i12, i13);
                return;
            }
        }
        setSurroundingText(editorInfo, null, 0, 0);
    }

    public static void setStylusHandwritingEnabled(@NonNull EditorInfo editorInfo, boolean z11) {
        if (BuildCompat.isAtLeastV()) {
            Api35Impl.setStylusHandwritingEnabled(editorInfo, z11);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean(STYLUS_HANDWRITING_ENABLED_KEY, z11);
    }
}
