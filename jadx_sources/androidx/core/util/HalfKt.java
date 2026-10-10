package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Half;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Half.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\n\n\u0002\u0010\u000e\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, m90084d2 = {"toHalf", "Landroid/util/Half;", "", "", "", "", "core-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SuppressLint({"ClassVerificationFailure"})
@SourceDebugExtension({"SMAP\nHalf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n1#1,57:1\n42#1:58\n*S KotlinDebug\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n49#1:58\n*E\n"})
public final class HalfKt {
    @RequiresApi(26)
    @NotNull
    public static final Half toHalf(short s11) {
        return Half.valueOf(s11);
    }

    @RequiresApi(26)
    @NotNull
    public static final Half toHalf(float f11) {
        return Half.valueOf(f11);
    }

    @RequiresApi(26)
    @NotNull
    public static final Half toHalf(@NotNull String str) {
        return Half.valueOf(str);
    }

    @RequiresApi(26)
    @NotNull
    public static final Half toHalf(double d11) {
        return Half.valueOf((float) d11);
    }
}
