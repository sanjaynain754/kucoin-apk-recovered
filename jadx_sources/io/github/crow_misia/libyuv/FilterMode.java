package io.github.crow_misia.libyuv;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: FilterMode.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m90084d2 = {"Lio/github/crow_misia/libyuv/FilterMode;", "", "mode", "", "<init>", "(Ljava/lang/String;II)V", "getMode", "()I", "NONE", "LINEAR", "BILINEAR", "BOX", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum FilterMode {
    NONE(0),
    LINEAR(1),
    BILINEAR(2),
    BOX(3);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f86990c = EnumEntriesKt.enumEntries(m87796a());
    private final int mode;

    @NotNull
    public static EnumEntries<FilterMode> getEntries() {
        return f86990c;
    }

    public final int getMode() {
        return this.mode;
    }

    FilterMode(int i11) {
        this.mode = i11;
    }
}
