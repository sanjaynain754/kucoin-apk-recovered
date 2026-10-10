package androidx.profileinstaller;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes34.dex */
class WritableFileSection {
    final byte[] mContents;
    final int mExpectedInflateSize;
    final boolean mNeedsCompression;
    final FileSectionType mType;

    public WritableFileSection(@NonNull FileSectionType fileSectionType, int i11, @NonNull byte[] bArr, boolean z11) {
        this.mType = fileSectionType;
        this.mExpectedInflateSize = i11;
        this.mContents = bArr;
        this.mNeedsCompression = z11;
    }
}
