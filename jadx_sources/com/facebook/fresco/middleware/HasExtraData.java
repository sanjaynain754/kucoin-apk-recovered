package com.facebook.fresco.middleware;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: HasExtraData.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u0012J'\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bj\u0002`\fH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00062\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bj\u0002`\fH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/fresco/middleware/HasExtraData;", "", ExifInterface.LONGITUDE_EAST, "", "key", "value", "", "putExtra", "(Ljava/lang/String;Ljava/lang/Object;)V", "getExtra", "(Ljava/lang/String;)Ljava/lang/Object;", "", "Lcom/facebook/fresco/middleware/Extras;", "getExtras", "()Ljava/util/Map;", "extras", "putExtras", "(Ljava/util/Map;)V", "Companion", "middleware_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface HasExtraData {

    /* JADX INFO: compiled from: HasExtraData.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/facebook/fresco/middleware/HasExtraData$Companion;", "", "<init>", "()V", "KEY_ID", "", "KEY_ENCODED_SIZE", "KEY_ENCODED_WIDTH", "KEY_ENCODED_HEIGHT", "KEY_URI_SOURCE", "KEY_IMAGE_FORMAT", "KEY_BITMAP_CONFIG", "KEY_IS_ROUNDED", "KEY_NON_FATAL_DECODE_ERROR", "KEY_ORIGINAL_URL", "KEY_MODIFIED_URL", "KEY_IMAGE_SOURCE_TYPE", "KEY_ORIGIN", "KEY_ORIGIN_SUBCATEGORY", "KEY_MULTIPLEX_BITMAP_COUNT", "KEY_MULTIPLEX_ENCODED_COUNT", "KEY_LAST_SCAN_NUMBER", "KEY_IMAGE_SOURCE_EXTRAS", "KEY_COLOR_SPACE", "middleware_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {

        @NotNull
        public static final String KEY_BITMAP_CONFIG = "bitmap_config";

        @NotNull
        public static final String KEY_COLOR_SPACE = "image_color_space";

        @NotNull
        public static final String KEY_ENCODED_HEIGHT = "encoded_height";

        @NotNull
        public static final String KEY_ENCODED_SIZE = "encoded_size";

        @NotNull
        public static final String KEY_ENCODED_WIDTH = "encoded_width";

        @NotNull
        public static final String KEY_ID = "id";

        @NotNull
        public static final String KEY_IMAGE_FORMAT = "image_format";

        @NotNull
        public static final String KEY_IMAGE_SOURCE_EXTRAS = "image_source_extras";

        @NotNull
        public static final String KEY_IMAGE_SOURCE_TYPE = "image_source_type";

        @NotNull
        public static final String KEY_IS_ROUNDED = "is_rounded";

        @NotNull
        public static final String KEY_LAST_SCAN_NUMBER = "last_scan_num";

        @NotNull
        public static final String KEY_MODIFIED_URL = "modified_url";

        @NotNull
        public static final String KEY_MULTIPLEX_BITMAP_COUNT = "multiplex_bmp_cnt";

        @NotNull
        public static final String KEY_MULTIPLEX_ENCODED_COUNT = "multiplex_enc_cnt";

        @NotNull
        public static final String KEY_NON_FATAL_DECODE_ERROR = "non_fatal_decode_error";

        @NotNull
        public static final String KEY_ORIGIN = "origin";

        @NotNull
        public static final String KEY_ORIGINAL_URL = "original_url";

        @NotNull
        public static final String KEY_ORIGIN_SUBCATEGORY = "origin_sub";

        @NotNull
        public static final String KEY_URI_SOURCE = "uri_source";

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f8477a = new Companion();
    }

    @Nullable
    <E> E getExtra(@NotNull String key);

    @NotNull
    Map<String, Object> getExtras();

    <E> void putExtra(@NotNull String key, @Nullable E value);

    void putExtras(@NotNull Map<String, ? extends Object> extras);
}
