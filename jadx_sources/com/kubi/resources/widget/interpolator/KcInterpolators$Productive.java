package com.kubi.resources.widget.interpolator;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: KcInterpolators.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/resources/widget/interpolator/KcInterpolators$Productive;", "", "x1", "", "y1", "x2", "y2", "<init>", "(Ljava/lang/String;IFFFF)V", "getX1", "()F", "getY1", "getX2", "getY2", "EASE_IN_OUT", "EASE_IN", "EASE_OUT", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum KcInterpolators$Productive {
    EASE_IN_OUT(0.29f, 0.04f, 0.23f, 1.0f),
    EASE_IN(0.39f, 0.06f, 1.0f, 1.0f),
    EASE_OUT(0.0f, 0.0f, 0.3f, 1.0f);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final float x1;
    private final float x2;
    private final float y1;
    private final float y2;

    @NotNull
    public static EnumEntries<KcInterpolators$Productive> getEntries() {
        return $ENTRIES;
    }

    public final float getX1() {
        return this.x1;
    }

    public final float getX2() {
        return this.x2;
    }

    public final float getY1() {
        return this.y1;
    }

    public final float getY2() {
        return this.y2;
    }

    KcInterpolators$Productive(float f11, float f12, float f13, float f14) {
        this.x1 = f11;
        this.y1 = f12;
        this.x2 = f13;
        this.y2 = f14;
    }
}
