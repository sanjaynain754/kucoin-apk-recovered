package com.jumio.android.renderscript;

import com.google.mlkit.vision.common.InputImage;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Toolkit.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m90084d2 = {"Lcom/jumio/android/renderscript/YuvFormat;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NV21", "YV12", "jumio-toolkit_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum YuvFormat {
    NV21(17),
    YV12(InputImage.IMAGE_FORMAT_YV12);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int value;

    @NotNull
    public static EnumEntries<YuvFormat> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    YuvFormat(int i11) {
        this.value = i11;
    }
}
