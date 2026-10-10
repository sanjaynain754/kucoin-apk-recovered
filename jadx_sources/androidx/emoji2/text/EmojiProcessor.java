package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private static final int MAX_LOOK_AROUND_CHARACTER = 16;

    @Nullable
    private final int[] mEmojiAsDefaultStyleExceptions;

    @NonNull
    private EmojiCompat.GlyphChecker mGlyphChecker;

    @NonNull
    private final MetadataRepo mMetadataRepo;

    @NonNull
    private final EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    public static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {
        private final EmojiCompat.SpanFactory mSpanFactory;

        @Nullable
        public UnprecomputeTextOnModificationSpannable spannable;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public UnprecomputeTextOnModificationSpannable getResult() {
            return this.spannable;
        }

        public EmojiProcessAddSpanCallback(@Nullable UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.spannable = unprecomputeTextOnModificationSpannable;
            this.mSpanFactory = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i11, int i12, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            Spannable spannableString;
            if (typefaceEmojiRasterizer.isPreferredSystemRender()) {
                return true;
            }
            if (this.spannable == null) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                this.spannable = new UnprecomputeTextOnModificationSpannable(spannableString);
            }
            this.spannable.setSpan(this.mSpanFactory.createSpan(typefaceEmojiRasterizer), i11, i12, 33);
            return true;
        }
    }

    public interface EmojiProcessCallback<T> {
        T getResult();

        boolean handleEmoji(@NonNull CharSequence charSequence, int i11, int i12, TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {
        private final int mOffset;
        public int start = -1;
        public int end = -1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public EmojiProcessLookupCallback getResult() {
            return this;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i11, int i12, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i13 = this.mOffset;
            if (i11 > i13 || i13 >= i12) {
                return i12 <= i13;
            }
            this.start = i11;
            this.end = i12;
            return false;
        }

        public EmojiProcessLookupCallback(int i11) {
            this.mOffset = i11;
        }
    }

    public static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final MetadataRepo.Node mRootNode;
        private int mState = 1;
        private final boolean mUseEmojiAsDefaultStyle;

        private int reset() {
            this.mState = 1;
            this.mCurrentNode = this.mRootNode;
            this.mCurrentDepth = 0;
            return 1;
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
            if (this.mCurrentNode.getData().isDefaultEmoji() || isEmojiStyle(this.mLastCodepoint)) {
                return true;
            }
            if (this.mUseEmojiAsDefaultStyle) {
                if (this.mEmojiAsDefaultStyleExceptions == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.mCurrentNode.getData().getCodepointAt(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        public int check(int i11) {
            MetadataRepo.Node node = this.mCurrentNode.get(i11);
            int iReset = 2;
            if (this.mState != 2) {
                if (node == null) {
                    iReset = reset();
                } else {
                    this.mState = 2;
                    this.mCurrentNode = node;
                    this.mCurrentDepth = 1;
                }
            } else if (node != null) {
                this.mCurrentNode = node;
                this.mCurrentDepth++;
            } else if (isTextStyle(i11)) {
                iReset = reset();
            } else if (!isEmojiStyle(i11)) {
                if (this.mCurrentNode.getData() != null) {
                    iReset = 3;
                    if (this.mCurrentDepth != 1 || shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                    } else {
                        iReset = reset();
                    }
                } else {
                    iReset = reset();
                }
            }
            this.mLastCodepoint = i11;
            return iReset;
        }

        public TypefaceEmojiRasterizer getCurrentMetadata() {
            return this.mCurrentNode.getData();
        }

        public TypefaceEmojiRasterizer getFlushMetadata() {
            return this.mFlushNode.getData();
        }

        public boolean isInFlushableState() {
            if (this.mState != 2 || this.mCurrentNode.getData() == null) {
                return false;
            }
            return this.mCurrentDepth > 1 || shouldUseEmojiPresentationStyleForSingleCodepoint();
        }

        public ProcessorSm(MetadataRepo.Node node, boolean z11, int[] iArr) {
            this.mRootNode = node;
            this.mCurrentNode = node;
            this.mUseEmojiAsDefaultStyle = z11;
            this.mEmojiAsDefaultStyleExceptions = iArr;
        }

        private static boolean isEmojiStyle(int i11) {
            if (i11 == 65039) {
                return true;
            }
            return false;
        }

        private static boolean isTextStyle(int i11) {
            if (i11 == 65038) {
                return true;
            }
            return false;
        }
    }

    public static boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, boolean z11) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i11 >= 0 && i12 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (hasInvalidSelection(selectionStart, selectionEnd)) {
                return false;
            }
            if (z11) {
                iMax = CodepointIndexFinder.findIndexBackward(editable, selectionStart, Math.max(i11, 0));
                iMin = CodepointIndexFinder.findIndexForward(editable, selectionEnd, Math.max(i12, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i11, 0);
                iMin = Math.min(selectionEnd + i12, editable.length());
            }
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(iMax, iMin, EmojiSpan.class);
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    private static boolean hasInvalidSelection(int i11, int i12) {
        return i11 == -1 || i12 == -1 || i11 != i12;
    }

    public int getEmojiMatch(@NonNull CharSequence charSequence) {
        return getEmojiMatch(charSequence, this.mMetadataRepo.getMetadataVersion());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:? A[SYNTHETIC] */
    public CharSequence process(@NonNull CharSequence charSequence, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, @IntRange(from = 0) int i13, boolean z11) throws Throwable {
        UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable;
        CharSequence charSequence2;
        Throwable th2;
        int i14;
        int i15;
        EmojiSpan[] emojiSpanArr;
        int i16;
        int spanStart;
        boolean z12 = charSequence instanceof SpannableBuilder;
        if (z12) {
            ((SpannableBuilder) charSequence).beginBatchEdit();
        }
        if (z12) {
            unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable((Spannable) charSequence);
            if (unprecomputeTextOnModificationSpannable != null) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    spanStart = unprecomputeTextOnModificationSpannable.getSpanStart(emojiSpan);
                    int spanEnd = unprecomputeTextOnModificationSpannable.getSpanEnd(emojiSpan);
                    if (spanStart != i12) {
                        unprecomputeTextOnModificationSpannable.removeSpan(emojiSpan);
                    }
                    i11 = Math.min(spanStart, i11);
                    i12 = Math.max(spanEnd, i12);
                }
            }
            i14 = i11;
            i15 = i12;
            if (i14 == i15) {
                charSequence2 = charSequence;
                if (!z12) {
                    return charSequence2;
                }
                ((SpannableBuilder) charSequence2).endBatchEdit();
            } else {
                charSequence2 = charSequence;
                if (!z12) {
                    return charSequence2;
                }
                ((SpannableBuilder) charSequence2).endBatchEdit();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable((Spannable) charSequence);
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    th2 = th;
                    if (!z12) {
                        throw th2;
                    }
                    ((SpannableBuilder) charSequence2).endBatchEdit();
                    throw th2;
                }
            } else {
                unprecomputeTextOnModificationSpannable = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i11 + (-1), i12 + 1, EmojiSpan.class) > i12) ? null : new UnprecomputeTextOnModificationSpannable(charSequence);
            }
            if (unprecomputeTextOnModificationSpannable != null && (emojiSpanArr = (EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(i11, i12, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
                while (i16 < r5) {
                    spanStart = unprecomputeTextOnModificationSpannable.getSpanStart(emojiSpan);
                    int spanEnd2 = unprecomputeTextOnModificationSpannable.getSpanEnd(emojiSpan);
                    if (spanStart != i12) {
                        unprecomputeTextOnModificationSpannable.removeSpan(emojiSpan);
                    }
                    i11 = Math.min(spanStart, i11);
                    i12 = Math.max(spanEnd2, i12);
                }
            }
            i14 = i11;
            i15 = i12;
            if (i14 == i15 && i14 < charSequence.length()) {
                if (i13 != Integer.MAX_VALUE && unprecomputeTextOnModificationSpannable != null) {
                    i13 -= ((EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(0, unprecomputeTextOnModificationSpannable.length(), EmojiSpan.class)).length;
                }
                charSequence2 = charSequence;
                try {
                    UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable2 = (UnprecomputeTextOnModificationSpannable) process(charSequence2, i14, i15, i13, z11, new EmojiProcessAddSpanCallback(unprecomputeTextOnModificationSpannable, this.mSpanFactory));
                    if (unprecomputeTextOnModificationSpannable2 == null) {
                        if (z12) {
                        }
                        return charSequence2;
                    }
                    Spannable unwrappedSpannable = unprecomputeTextOnModificationSpannable2.getUnwrappedSpannable();
                    if (z12) {
                        ((SpannableBuilder) charSequence2).endBatchEdit();
                    }
                    return unwrappedSpannable;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    if (!z12) {
                        throw th2;
                    }
                    ((SpannableBuilder) charSequence2).endBatchEdit();
                    throw th2;
                }
            }
            charSequence2 = charSequence;
            if (!z12) {
                return charSequence2;
            }
            ((SpannableBuilder) charSequence2).endBatchEdit();
            return charSequence2;
        } catch (Throwable th5) {
            th2 = th5;
            charSequence2 = charSequence;
        }
        if (!z12) {
            throw th2;
        }
        ((SpannableBuilder) charSequence2).endBatchEdit();
        throw th2;
    }

    /* JADX INFO: loaded from: classes34.dex */
    @RequiresApi(19)
    public static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
        }

        public static int findIndexBackward(CharSequence charSequence, int i11, int i12) {
            int length = charSequence.length();
            if (i11 < 0 || length < i11 || i12 < 0) {
                return -1;
            }
            while (true) {
                boolean z11 = false;
                while (i12 != 0) {
                    i11--;
                    if (i11 < 0) {
                        if (z11) {
                            return -1;
                        }
                        return 0;
                    }
                    char cCharAt = charSequence.charAt(i11);
                    if (z11) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i12--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i12--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z11 = true;
                    }
                }
                return i11;
            }
        }

        public static int findIndexForward(CharSequence charSequence, int i11, int i12) {
            int length = charSequence.length();
            if (i11 < 0 || length < i11 || i12 < 0) {
                return -1;
            }
            while (true) {
                boolean z11 = false;
                while (i12 != 0) {
                    if (i11 >= length) {
                        if (z11) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i11);
                    if (z11) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i12--;
                        i11++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i12--;
                        i11++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11++;
                        z11 = true;
                    }
                }
                return i11;
            }
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {
        private final String mExclusion;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public MarkExclusionCallback getResult() {
            return this;
        }

        public MarkExclusionCallback(String str) {
            this.mExclusion = str;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i11, int i12, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i11, i12), this.mExclusion)) {
                return true;
            }
            typefaceEmojiRasterizer.setExclusion(true);
            return false;
        }
    }

    public static boolean handleOnKeyDown(@NonNull Editable editable, int i11, @NonNull KeyEvent keyEvent) {
        boolean zDelete;
        if (i11 != 67) {
            zDelete = i11 != 112 ? false : delete(editable, keyEvent, true);
        } else {
            zDelete = delete(editable, keyEvent, false);
        }
        if (!zDelete) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public int getEmojiEnd(@NonNull CharSequence charSequence, @IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i11, i11 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanEnd(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i11 - 16), Math.min(charSequence.length(), i11 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i11))).end;
    }

    public int getEmojiMatch(@NonNull CharSequence charSequence, int i11) {
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int length = charSequence.length();
        int iCharCount = 0;
        int i12 = 0;
        int i13 = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int iCheck = processorSm.check(iCodePointAt);
            TypefaceEmojiRasterizer currentMetadata = processorSm.getCurrentMetadata();
            if (iCheck == 1) {
                iCharCount += Character.charCount(iCodePointAt);
                i13 = 0;
            } else if (iCheck == 2) {
                iCharCount += Character.charCount(iCodePointAt);
            } else if (iCheck == 3) {
                currentMetadata = processorSm.getFlushMetadata();
                if (currentMetadata.getCompatAdded() <= i11) {
                    i12++;
                }
            }
            if (currentMetadata != null && currentMetadata.getCompatAdded() <= i11) {
                i13++;
            }
        }
        if (i12 != 0) {
            return 2;
        }
        if (!processorSm.isInFlushableState() || processorSm.getCurrentMetadata().getCompatAdded() > i11) {
            return i13 == 0 ? 0 : 2;
        }
        return 1;
    }

    public int getEmojiStart(@NonNull CharSequence charSequence, @IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i11, i11 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i11 - 16), Math.min(charSequence.length(), i11 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i11))).start;
    }

    public EmojiProcessor(@NonNull MetadataRepo metadataRepo, @NonNull EmojiCompat.SpanFactory spanFactory, @NonNull EmojiCompat.GlyphChecker glyphChecker, boolean z11, @Nullable int[] iArr, @NonNull Set<int[]> set) {
        this.mSpanFactory = spanFactory;
        this.mMetadataRepo = metadataRepo;
        this.mGlyphChecker = glyphChecker;
        this.mUseEmojiAsDefaultStyle = z11;
        this.mEmojiAsDefaultStyleExceptions = iArr;
        initExclusions(set);
    }

    private static boolean delete(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z11) {
        EmojiSpan[] emojiSpanArr;
        if (hasModifiers(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!hasInvalidSelection(selectionStart, selectionEnd) && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z11 && spanStart == selectionStart) || ((!z11 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasGlyph(CharSequence charSequence, int i11, int i12, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer.getHasGlyph() == 0) {
            typefaceEmojiRasterizer.setHasGlyph(this.mGlyphChecker.hasGlyph(charSequence, i11, i12, typefaceEmojiRasterizer.getSdkAdded()));
        }
        if (typefaceEmojiRasterizer.getHasGlyph() == 2) {
            return true;
        }
        return false;
    }

    private static boolean hasModifiers(@NonNull KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void initExclusions(@NonNull Set<int[]> set) {
        if (!set.isEmpty()) {
            for (int[] iArr : set) {
                String str = new String(iArr, 0, iArr.length);
                process(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
            }
        }
    }

    private <T> T process(@NonNull CharSequence charSequence, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, @IntRange(from = 0) int i13, boolean z11, EmojiProcessCallback<T> emojiProcessCallback) {
        int iCharCount;
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int i14 = 0;
        boolean zHandleEmoji = true;
        int iCodePointAt = Character.codePointAt(charSequence, i11);
        loop0: while (true) {
            iCharCount = i11;
            while (true) {
                if (i11 >= i12 || i14 >= i13 || !zHandleEmoji) {
                    break loop0;
                }
                int iCheck = processorSm.check(iCodePointAt);
                if (iCheck == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i12) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i11 = iCharCount;
                } else if (iCheck == 2) {
                    i11 += Character.charCount(iCodePointAt);
                    if (i11 < i12) {
                        iCodePointAt = Character.codePointAt(charSequence, i11);
                    }
                } else if (iCheck != 3) {
                }
            }
            if (z11 || !hasGlyph(charSequence, iCharCount, i11, processorSm.getFlushMetadata())) {
                zHandleEmoji = emojiProcessCallback.handleEmoji(charSequence, iCharCount, i11, processorSm.getFlushMetadata());
                i14++;
            }
        }
        if (processorSm.isInFlushableState() && i14 < i13 && zHandleEmoji && (z11 || !hasGlyph(charSequence, iCharCount, i11, processorSm.getCurrentMetadata()))) {
            emojiProcessCallback.handleEmoji(charSequence, iCharCount, i11, processorSm.getCurrentMetadata());
        }
        return emojiProcessCallback.getResult();
    }
}
