package com.jumio.commons.enums;

import jumio.core.AbstractC40520D3;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m90084d2 = {"Lcom/jumio/commons/enums/ScreenAngle;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PORTRAIT", "LANDSCAPE", "INVERTED_PORTRAIT", "INVERTED_LANDSCAPE", "toActivityInfo", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum ScreenAngle {
    PORTRAIT(0),
    LANDSCAPE(90),
    INVERTED_PORTRAIT(180),
    INVERTED_LANDSCAPE(270);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int value;

    @NotNull
    public static EnumEntries<ScreenAngle> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    public final int toActivityInfo() {
        int i11 = AbstractC40520D3.f89951a[ordinal()];
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 0;
        }
        if (i11 == 3) {
            return 9;
        }
        if (i11 == 4) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }

    ScreenAngle(int i11) {
        this.value = i11;
    }
}
