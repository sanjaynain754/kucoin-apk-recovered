package com.kubi.sdk;

import com.kubi.utils.storage.StorageType;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.sdk.d0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BaseConstants.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/BaseConstants;", "", "<init>", "()V", "DEFAULT_STRING", "", "DEFAULT_BOOLEAN", "", "DEFAULT_INT", "", "DEFAULT_DOUBLE", "Ljava/math/BigDecimal;", "getDEFAULT_DOUBLE", "()Ljava/math/BigDecimal;", "DEFAULT_PLATFORM", "LOG_TAG", "LAUNCHER_CATEGORY", "newVersionGuidanceSid", "Lcom/kubi/utils/storage/StorageId;", "getNewVersionGuidanceSid", "()Lcom/kubi/utils/storage/StorageId;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BaseConstants {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BaseConstants f46539a = new BaseConstants();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final BigDecimal f46540b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<Boolean> f46541c;

    static {
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalNegate = ONE.negate();
        Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
        f46540b = bigDecimalNegate;
        f46541c = new StorageId<>("appLauncher", "newVersion4x", StorageType.Shared, false, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final BigDecimal m56608a() {
        return f46540b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<Boolean> m56609b() {
        return f46541c;
    }
}
