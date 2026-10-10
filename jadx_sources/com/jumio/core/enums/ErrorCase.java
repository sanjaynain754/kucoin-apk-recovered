package com.jumio.core.enums;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.core.C9301R;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'GENERAL_NETWORK_ERROR' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m90084d2 = {"Lcom/jumio/core/enums/ErrorCase;", "", "domain", "", "message", "", "retry", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;IZ)V", "getDomain", "()Ljava/lang/String;", "getMessage", "()I", "getRetry", "()Z", "GENERAL_NETWORK_ERROR", "BLOCKING_NETWORK_ERROR", "CERTIFICATE_ERROR", "AUTH_FAILED", "DEVICE_IS_OFFLINE", "OCR_LOADING_FAILED", "CANCEL_TYPE_USER", "NO_CAMERA_CONNECTION", "ALE_KEY_NOT_VALID", "TRANSACTION_FINISHED", "PROCESS_CANT_BE_COMPLETED", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ErrorCase {
    public static final ErrorCase ALE_KEY_NOT_VALID;
    public static final ErrorCase AUTH_FAILED;
    public static final ErrorCase BLOCKING_NETWORK_ERROR;
    public static final ErrorCase CANCEL_TYPE_USER;
    public static final ErrorCase CERTIFICATE_ERROR;
    public static final ErrorCase DEVICE_IS_OFFLINE;
    public static final ErrorCase GENERAL_NETWORK_ERROR;
    public static final ErrorCase NO_CAMERA_CONNECTION;
    public static final ErrorCase OCR_LOADING_FAILED;
    public static final ErrorCase PROCESS_CANT_BE_COMPLETED;
    public static final ErrorCase TRANSACTION_FINISHED;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ErrorCase[] f13827d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumEntries f13828e;

    /* JADX INFO: renamed from: a */
    public final String f13829a;

    /* JADX INFO: renamed from: b */
    public final int f13830b;

    /* JADX INFO: renamed from: c */
    public final boolean f13831c;

    static {
        int i11 = C9301R.string.jumio_error_case_network_problems;
        ErrorCase errorCase = new ErrorCase("GENERAL_NETWORK_ERROR", 0, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, i11, true);
        GENERAL_NETWORK_ERROR = errorCase;
        ErrorCase errorCase2 = new ErrorCase("BLOCKING_NETWORK_ERROR", 1, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, i11, false);
        BLOCKING_NETWORK_ERROR = errorCase2;
        int i12 = C9301R.string.jumio_error_case_auth_failed;
        ErrorCase errorCase3 = new ErrorCase("CERTIFICATE_ERROR", 2, "B", i12, false);
        CERTIFICATE_ERROR = errorCase3;
        ErrorCase errorCase4 = new ErrorCase("AUTH_FAILED", 3, "C", i12, false);
        AUTH_FAILED = errorCase4;
        ErrorCase errorCase5 = new ErrorCase("DEVICE_IS_OFFLINE", 4, ExifInterface.LONGITUDE_EAST, C9301R.string.jumio_error_case_device_is_offline, true);
        DEVICE_IS_OFFLINE = errorCase5;
        int i13 = C9301R.string.jumio_error_case_scanning_not_possible;
        ErrorCase errorCase6 = new ErrorCase("OCR_LOADING_FAILED", 5, "F", i13, false);
        OCR_LOADING_FAILED = errorCase6;
        ErrorCase errorCase7 = new ErrorCase("CANCEL_TYPE_USER", 6, "G", C9301R.string.jumio_error_case_cancelled_by_user, false);
        CANCEL_TYPE_USER = errorCase7;
        ErrorCase errorCase8 = new ErrorCase("NO_CAMERA_CONNECTION", 7, "H", C9301R.string.jumio_error_case_no_camera_connection, false);
        NO_CAMERA_CONNECTION = errorCase8;
        ErrorCase errorCase9 = new ErrorCase("ALE_KEY_NOT_VALID", 8, "I", C9301R.string.jumio_error_case_certificate_not_valid_anymore, false);
        ALE_KEY_NOT_VALID = errorCase9;
        ErrorCase errorCase10 = new ErrorCase("TRANSACTION_FINISHED", 9, "J", C9301R.string.jumio_error_case_session_expired, false);
        TRANSACTION_FINISHED = errorCase10;
        ErrorCase errorCase11 = new ErrorCase("PROCESS_CANT_BE_COMPLETED", 10, "N", i13, false);
        PROCESS_CANT_BE_COMPLETED = errorCase11;
        ErrorCase[] errorCaseArr = {errorCase, errorCase2, errorCase3, errorCase4, errorCase5, errorCase6, errorCase7, errorCase8, errorCase9, errorCase10, errorCase11};
        f13827d = errorCaseArr;
        f13828e = EnumEntriesKt.enumEntries(errorCaseArr);
    }

    @NotNull
    public static EnumEntries<ErrorCase> getEntries() {
        return f13828e;
    }

    public static ErrorCase valueOf(String str) {
        return (ErrorCase) Enum.valueOf(ErrorCase.class, str);
    }

    public static ErrorCase[] values() {
        return (ErrorCase[]) f13827d.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getDomain, reason: from getter */
    public final String getF13829a() {
        return this.f13829a;
    }

    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public final int getF13830b() {
        return this.f13830b;
    }

    /* JADX INFO: renamed from: getRetry, reason: from getter */
    public final boolean getF13831c() {
        return this.f13831c;
    }

    public ErrorCase(String str, int i11, String str2, int i12, boolean z11) {
        super(str, i11);
        this.f13829a = str2;
        this.f13830b = i12;
        this.f13831c = z11;
    }
}
