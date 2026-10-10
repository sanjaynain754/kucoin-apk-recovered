package io.trtc.tuikit.atomicx.widget.basicwidget.button;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import cg0.C4968b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AtomicButton.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0016"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/button/ButtonSize;", "", "heightDp", "", "minWidthDp", "iconSizeDp", "<init>", "(Ljava/lang/String;IFFF)V", "getHeightDp", "()F", "getMinWidthDp", "getIconSizeDp", "XS", ExifInterface.LATITUDE_SOUTH, "M", "L", "getHeightPx", "", "context", "Landroid/content/Context;", "getMinWidthPx", "getIconSizePx", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum ButtonSize {
    XS(24.0f, 48.0f, 14.0f),
    S(32.0f, 64.0f, 16.0f),
    M(40.0f, 80.0f, 20.0f),
    L(48.0f, 96.0f, 20.0f);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f87525c = EnumEntriesKt.enumEntries(m88143a());
    private final float heightDp;
    private final float iconSizeDp;
    private final float minWidthDp;

    @NotNull
    public static EnumEntries<ButtonSize> getEntries() {
        return f87525c;
    }

    public final float getHeightDp() {
        return this.heightDp;
    }

    public final int getHeightPx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C4968b.m5262a(context, this.heightDp);
    }

    public final float getIconSizeDp() {
        return this.iconSizeDp;
    }

    public final int getIconSizePx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C4968b.m5262a(context, this.iconSizeDp);
    }

    public final float getMinWidthDp() {
        return this.minWidthDp;
    }

    public final int getMinWidthPx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C4968b.m5262a(context, this.minWidthDp);
    }

    ButtonSize(float f11, float f12, float f13) {
        this.heightDp = f11;
        this.minWidthDp = f12;
        this.iconSizeDp = f13;
    }
}
