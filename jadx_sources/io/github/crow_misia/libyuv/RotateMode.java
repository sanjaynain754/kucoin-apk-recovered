package io.github.crow_misia.libyuv;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;
import ze0.InterfaceC46774e;

/* JADX INFO: compiled from: RotateMode.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m90084d2 = {"Lio/github/crow_misia/libyuv/RotateMode;", "", "", "degrees", "<init>", "(Ljava/lang/String;II)V", "Lze0/e;", TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, "dst", "calculateWidth$core_release", "(Lze0/e;Lze0/e;)I", "calculateWidth", "calculateHeight$core_release", "calculateHeight", "I", "getDegrees", "()I", "ROTATE_0", "ROTATE_90", "ROTATE_180", "ROTATE_270", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum RotateMode {
    ROTATE_0(0),
    ROTATE_90(90),
    ROTATE_180(180),
    ROTATE_270(270);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f86996c = EnumEntriesKt.enumEntries(m87800a());
    private final int degrees;

    /* JADX INFO: renamed from: io.github.crow_misia.libyuv.RotateMode$a */
    /* JADX INFO: compiled from: RotateMode.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public /* synthetic */ class C39136a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RotateMode.values().length];
            try {
                iArr[RotateMode.ROTATE_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RotateMode.ROTATE_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RotateMode.ROTATE_90.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RotateMode.ROTATE_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static EnumEntries<RotateMode> getEntries() {
        return f86996c;
    }

    public final int calculateHeight$core_release(@NotNull InterfaceC46774e src, @NotNull InterfaceC46774e dst) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i11 = C39136a.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1 || i11 == 2) {
            return Math.min(src.getCropRect().height(), dst.getCropRect().height());
        }
        if (i11 == 3 || i11 == 4) {
            return Math.min(src.getCropRect().height(), dst.getCropRect().width());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int calculateWidth$core_release(@NotNull InterfaceC46774e src, @NotNull InterfaceC46774e dst) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i11 = C39136a.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1 || i11 == 2) {
            return Math.min(src.getCropRect().width(), dst.getCropRect().width());
        }
        if (i11 == 3 || i11 == 4) {
            return Math.min(src.getCropRect().width(), dst.getCropRect().height());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getDegrees() {
        return this.degrees;
    }

    RotateMode(int i11) {
        this.degrees = i11;
    }
}
