package com.jumio.core.constants;

import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\"\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0011\u0010\u0015\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u000e\u0010\u0017\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001cX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"MIME_TYPE_WEBP", "", "MIME_TYPE_JPEG", "MIME_TYPE_PNG", "MIME_TYPE_PDF", "MIME_TYPE_JPEG_2000", "MIME_TYPE_OCTET_STREAM", "FILE_TYPE_WEBP", "FILE_TYPE_JPEG", "FILE_TYPE_PNG", "FILE_TYPE_JPEG_2000", "FILE_TYPE_DAT", "TEMP_FILE_PREFIX", "JPEG_SIGNATURE", "", "getJPEG_SIGNATURE", "()[B", "PNG_SIGNATURE", "getPNG_SIGNATURE", "PDF_SIGNATURE", "getPDF_SIGNATURE", "WEBP_SIGNATURE", "getWEBP_SIGNATURE", "FILE_HEADER_BYTE_COUNT", "", "FACE_CAPTURE_MODE_FRONT", "FACE_CAPTURE_MODE_BACK", "NANOS_TO_SECONDS", "", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ConstantsKt {

    @NotNull
    public static final String FACE_CAPTURE_MODE_BACK = "back";

    @NotNull
    public static final String FACE_CAPTURE_MODE_FRONT = "front";
    public static final int FILE_HEADER_BYTE_COUNT = 16;

    @NotNull
    public static final String FILE_TYPE_DAT = "DAT";

    @NotNull
    public static final String FILE_TYPE_JPEG = "JPEG";

    @NotNull
    public static final String FILE_TYPE_JPEG_2000 = "JPEG_2000";

    @NotNull
    public static final String FILE_TYPE_PNG = "PNG";

    @NotNull
    public static final String FILE_TYPE_WEBP = "WEBP";

    @NotNull
    public static final String MIME_TYPE_JPEG = "image/jpeg";

    @NotNull
    public static final String MIME_TYPE_JPEG_2000 = "image/jp2";

    @NotNull
    public static final String MIME_TYPE_OCTET_STREAM = "application/octet-stream";

    @NotNull
    public static final String MIME_TYPE_PDF = "application/pdf";

    @NotNull
    public static final String MIME_TYPE_PNG = "image/png";

    @NotNull
    public static final String MIME_TYPE_WEBP = "image/webp";
    public static final double NANOS_TO_SECONDS = 1.0E9d;

    @NotNull
    public static final String TEMP_FILE_PREFIX = "tmp_";

    @NotNull
    private static final byte[] JPEG_SIGNATURE = {-1, -40, -1};

    @NotNull
    private static final byte[] PNG_SIGNATURE = {-119, BuiltinOptions.UniqueOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 13, 10, 26, 10};

    @NotNull
    private static final byte[] PDF_SIGNATURE = {BuiltinOptions.CastOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceRNNOptions};

    @NotNull
    private static final byte[] WEBP_SIGNATURE = {BuiltinOptions.AddNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BidirectionalSequenceRNNOptions};

    @NotNull
    public static final byte[] getJPEG_SIGNATURE() {
        return JPEG_SIGNATURE;
    }

    @NotNull
    public static final byte[] getPDF_SIGNATURE() {
        return PDF_SIGNATURE;
    }

    @NotNull
    public static final byte[] getPNG_SIGNATURE() {
        return PNG_SIGNATURE;
    }

    @NotNull
    public static final byte[] getWEBP_SIGNATURE() {
        return WEBP_SIGNATURE;
    }
}
