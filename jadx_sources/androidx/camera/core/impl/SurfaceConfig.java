package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.android.material.internal.ViewUtils;
import com.jumio.core.constants.ConstantsKt;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SurfaceConfig.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0004#$%&B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0000J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J'\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0014HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, m90084d2 = {"Landroidx/camera/core/impl/SurfaceConfig;", "", "configType", "Landroidx/camera/core/impl/SurfaceConfig$ConfigType;", "configSize", "Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "streamUseCase", "Landroidx/camera/core/impl/StreamUseCase;", "<init>", "(Landroidx/camera/core/impl/SurfaceConfig$ConfigType;Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;Landroidx/camera/core/impl/StreamUseCase;)V", "getConfigType", "()Landroidx/camera/core/impl/SurfaceConfig$ConfigType;", "getConfigSize", "()Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "getStreamUseCase", "()Landroidx/camera/core/impl/StreamUseCase;", "isSupported", "", "other", "imageFormat", "", "getImageFormat", "()I", "getResolution", "Landroid/util/Size;", "definition", "Landroidx/camera/core/impl/SurfaceSizeDefinition;", "component1", "component2", "component3", "copy", "equals", "hashCode", "toString", "", "Companion", "ConfigType", "ConfigSource", "ConfigSize", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSurfaceConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurfaceConfig.kt\nandroidx/camera/core/impl/SurfaceConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,385:1\n1216#2,2:386\n1246#2,4:388\n*S KotlinDebug\n*F\n+ 1 SurfaceConfig.kt\nandroidx/camera/core/impl/SurfaceConfig\n*L\n61#1:386,2\n61#1:388,4\n*E\n"})
public final /* data */ class SurfaceConfig {

    @NotNull
    private static final Map<Integer, ConfigType> CONFIG_TYPES_BY_IMAGE_FORMAT;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final StreamUseCase DEFAULT_STREAM_USE_CASE = StreamUseCase.DEFAULT;

    @NotNull
    private static final ConfigSize[] FEATURE_COMBO_QUERY_SUPPORTED_SIZES = {ConfigSize.S720P_16_9, ConfigSize.S1080P_4_3, ConfigSize.S1080P_16_9, ConfigSize.S1440P_16_9, ConfigSize.UHD, ConfigSize.X_VGA};

    @NotNull
    private static final Map<ConfigType, Integer> IMAGE_FORMATS_BY_CONFIG_TYPE;

    @NotNull
    private final ConfigSize configSize;

    @NotNull
    private final ConfigType configType;
    private final int imageFormat;

    @NotNull
    private final StreamUseCase streamUseCase;

    /* JADX INFO: compiled from: SurfaceConfig.kt */
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0007J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\rH\u0007J>\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0007R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Landroidx/camera/core/impl/SurfaceConfig$Companion;", "", "<init>", "()V", "DEFAULT_STREAM_USE_CASE", "Landroidx/camera/core/impl/StreamUseCase;", "FEATURE_COMBO_QUERY_SUPPORTED_SIZES", "", "Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "[Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "IMAGE_FORMATS_BY_CONFIG_TYPE", "", "Landroidx/camera/core/impl/SurfaceConfig$ConfigType;", "", "CONFIG_TYPES_BY_IMAGE_FORMAT", "create", "Landroidx/camera/core/impl/SurfaceConfig;", "type", "size", "streamUseCase", "getConfigType", "imageFormat", "transformSurfaceConfig", "Landroid/util/Size;", "surfaceSizeDefinition", "Landroidx/camera/core/impl/SurfaceSizeDefinition;", "cameraMode", "configSource", "Landroidx/camera/core/impl/SurfaceConfig$ConfigSource;", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final SurfaceConfig create(@NotNull ConfigType type, @NotNull ConfigSize size) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(size, "size");
            return create$default(this, type, size, null, 4, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final SurfaceConfig transformSurfaceConfig(int i11, @NotNull Size size, @NotNull SurfaceSizeDefinition surfaceSizeDefinition) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "surfaceSizeDefinition");
            return transformSurfaceConfig$default(this, i11, size, surfaceSizeDefinition, 0, null, null, 56, null);
        }

        private Companion() {
        }

        public static /* synthetic */ SurfaceConfig create$default(Companion companion, ConfigType configType, ConfigSize configSize, StreamUseCase streamUseCase, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                streamUseCase = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
            }
            return companion.create(configType, configSize, streamUseCase);
        }

        public static /* synthetic */ SurfaceConfig transformSurfaceConfig$default(Companion companion, int i11, Size size, SurfaceSizeDefinition surfaceSizeDefinition, int i12, ConfigSource configSource, StreamUseCase streamUseCase, int i13, Object obj) {
            if ((i13 & 8) != 0) {
                i12 = 0;
            }
            int i14 = i12;
            if ((i13 & 16) != 0) {
                configSource = ConfigSource.CAPTURE_SESSION_TABLES;
            }
            ConfigSource configSource2 = configSource;
            if ((i13 & 32) != 0) {
                streamUseCase = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
            }
            return companion.transformSurfaceConfig(i11, size, surfaceSizeDefinition, i14, configSource2, streamUseCase);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final SurfaceConfig create(@NotNull ConfigType type, @NotNull ConfigSize size, @NotNull StreamUseCase streamUseCase) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(streamUseCase, "streamUseCase");
            return new SurfaceConfig(type, size, streamUseCase);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final SurfaceConfig transformSurfaceConfig(int i11, @NotNull Size size, @NotNull SurfaceSizeDefinition surfaceSizeDefinition, int i12) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "surfaceSizeDefinition");
            return transformSurfaceConfig$default(this, i11, size, surfaceSizeDefinition, i12, null, null, 48, null);
        }

        @JvmStatic
        @NotNull
        public final ConfigType getConfigType(int imageFormat) {
            ConfigType configType = (ConfigType) SurfaceConfig.CONFIG_TYPES_BY_IMAGE_FORMAT.get(Integer.valueOf(imageFormat));
            if (configType == null) {
                return ConfigType.PRIV;
            }
            return configType;
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final SurfaceConfig transformSurfaceConfig(int i11, @NotNull Size size, @NotNull SurfaceSizeDefinition surfaceSizeDefinition, int i12, @NotNull ConfigSource configSource) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "surfaceSizeDefinition");
            Intrinsics.checkNotNullParameter(configSource, "configSource");
            return transformSurfaceConfig$default(this, i11, size, surfaceSizeDefinition, i12, configSource, null, 32, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final SurfaceConfig transformSurfaceConfig(int imageFormat, @NotNull Size size, @NotNull SurfaceSizeDefinition surfaceSizeDefinition, int cameraMode, @NotNull ConfigSource configSource, @NotNull StreamUseCase streamUseCase) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "surfaceSizeDefinition");
            Intrinsics.checkNotNullParameter(configSource, "configSource");
            Intrinsics.checkNotNullParameter(streamUseCase, "streamUseCase");
            ConfigType configType = getConfigType(imageFormat);
            ConfigSize configSize = ConfigSize.NOT_SUPPORT;
            int area = SizeUtil.getArea(size);
            if (cameraMode == 1) {
                if (area <= SizeUtil.getArea(surfaceSizeDefinition.getS720pSize(imageFormat))) {
                    configSize = ConfigSize.S720P_16_9;
                } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getS1440pSize(imageFormat))) {
                    configSize = ConfigSize.S1440P_4_3;
                }
            } else if (configSource == ConfigSource.FEATURE_COMBINATION_TABLE) {
                Size maximumSize = surfaceSizeDefinition.getMaximumSize(imageFormat);
                for (ConfigSize configSize2 : SurfaceConfig.FEATURE_COMBO_QUERY_SUPPORTED_SIZES) {
                    if (Intrinsics.areEqual(size, configSize2.getRelatedFixedSize())) {
                        configSize = configSize2;
                        break;
                    }
                }
                if (configSize == ConfigSize.NOT_SUPPORT && Intrinsics.areEqual(size, maximumSize)) {
                    configSize = ConfigSize.MAXIMUM;
                }
            } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getAnalysisSize())) {
                configSize = ConfigSize.VGA;
            } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getPreviewSize())) {
                configSize = ConfigSize.PREVIEW;
            } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getRecordSize())) {
                configSize = ConfigSize.RECORD;
            } else {
                Size maximumSize2 = surfaceSizeDefinition.getMaximumSize(imageFormat);
                Size ultraMaximumSize = surfaceSizeDefinition.getUltraMaximumSize(imageFormat);
                if ((maximumSize2 == null || area <= SizeUtil.getArea(maximumSize2)) && cameraMode != 2) {
                    configSize = ConfigSize.MAXIMUM;
                } else if (ultraMaximumSize != null && area <= SizeUtil.getArea(ultraMaximumSize)) {
                    configSize = ConfigSize.ULTRA_MAXIMUM;
                }
            }
            return create(configType, configSize, streamUseCase);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PREVIEW' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: SurfaceConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m90084d2 = {"Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "", "id", "", "relatedFixedSize", "Landroid/util/Size;", "<init>", "(Ljava/lang/String;IILandroid/util/Size;)V", "getId", "()I", "getRelatedFixedSize", "()Landroid/util/Size;", "VGA", "X_VGA", "S720P_16_9", "PREVIEW", "S1080P_4_3", "S1080P_16_9", "S1440P_4_3", "S1440P_16_9", "UHD", "RECORD", "MAXIMUM", "MAXIMUM_4_3", "MAXIMUM_16_9", "ULTRA_MAXIMUM", "NOT_SUPPORT", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class ConfigSize {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConfigSize[] $VALUES;
        public static final ConfigSize PREVIEW;
        public static final ConfigSize RECORD;
        private final int id;

        @Nullable
        private final Size relatedFixedSize;
        public static final ConfigSize VGA = new ConfigSize("VGA", 0, 0, new Size(C33556b3.f69051i, TXVodDownloadDataSource.QUALITY_480P));
        public static final ConfigSize X_VGA = new ConfigSize("X_VGA", 1, 1, new Size(1024, ViewUtils.EDGE_TO_EDGE_FLAGS));
        public static final ConfigSize S720P_16_9 = new ConfigSize("S720P_16_9", 2, 2, new Size(1280, 720));
        public static final ConfigSize S1080P_4_3 = new ConfigSize("S1080P_4_3", 4, 4, new Size(1440, TXVodDownloadDataSource.QUALITY_1080P));
        public static final ConfigSize S1080P_16_9 = new ConfigSize("S1080P_16_9", 5, 5, new Size(1920, TXVodDownloadDataSource.QUALITY_1080P));
        public static final ConfigSize S1440P_4_3 = new ConfigSize("S1440P_4_3", 6, 6, new Size(1920, 1440));
        public static final ConfigSize S1440P_16_9 = new ConfigSize("S1440P_16_9", 7, 7, new Size(2560, 1440));
        public static final ConfigSize UHD = new ConfigSize("UHD", 8, 8, new Size(3840, 2160));
        public static final ConfigSize MAXIMUM = new ConfigSize("MAXIMUM", 10, 10, null, 2, null);
        public static final ConfigSize MAXIMUM_4_3 = new ConfigSize("MAXIMUM_4_3", 11, 11, null, 2, null);
        public static final ConfigSize MAXIMUM_16_9 = new ConfigSize("MAXIMUM_16_9", 12, 12, null, 2, null);
        public static final ConfigSize ULTRA_MAXIMUM = new ConfigSize("ULTRA_MAXIMUM", 13, 13, null, 2, null);
        public static final ConfigSize NOT_SUPPORT = new ConfigSize("NOT_SUPPORT", 14, 14, null, 2, null);

        private ConfigSize(String str, int i11, int i12, Size size) {
            super(str, i11);
            this.id = i12;
            this.relatedFixedSize = size;
        }

        private static final /* synthetic */ ConfigSize[] $values() {
            return new ConfigSize[]{VGA, X_VGA, S720P_16_9, PREVIEW, S1080P_4_3, S1080P_16_9, S1440P_4_3, S1440P_16_9, UHD, RECORD, MAXIMUM, MAXIMUM_4_3, MAXIMUM_16_9, ULTRA_MAXIMUM, NOT_SUPPORT};
        }

        static {
            int i11 = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            Size size = null;
            PREVIEW = new ConfigSize("PREVIEW", 3, 3, size, i11, defaultConstructorMarker);
            RECORD = new ConfigSize("RECORD", 9, 9, size, i11, defaultConstructorMarker);
            ConfigSize[] configSizeArr$values = $values();
            $VALUES = configSizeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(configSizeArr$values);
        }

        public /* synthetic */ ConfigSize(String str, int i11, int i12, Size size, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11, i12, (i13 & 2) != 0 ? null : size);
        }

        @NotNull
        public static EnumEntries<ConfigSize> getEntries() {
            return $ENTRIES;
        }

        public static ConfigSize valueOf(String str) {
            return (ConfigSize) Enum.valueOf(ConfigSize.class, str);
        }

        public static ConfigSize[] values() {
            return (ConfigSize[]) $VALUES.clone();
        }

        public final int getId() {
            return this.id;
        }

        @Nullable
        public final Size getRelatedFixedSize() {
            return this.relatedFixedSize;
        }
    }

    /* JADX INFO: compiled from: SurfaceConfig.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Landroidx/camera/core/impl/SurfaceConfig$ConfigSource;", "", "<init>", "(Ljava/lang/String;I)V", "FEATURE_COMBINATION_TABLE", "CAPTURE_SESSION_TABLES", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public enum ConfigSource {
        FEATURE_COMBINATION_TABLE,
        CAPTURE_SESSION_TABLES;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<ConfigSource> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: SurfaceConfig.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"Landroidx/camera/core/impl/SurfaceConfig$ConfigType;", "", "<init>", "(Ljava/lang/String;I)V", PrivFrame.f3522ID, "YUV", ConstantsKt.FILE_TYPE_JPEG, "JPEG_R", "RAW", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public enum ConfigType {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<ConfigType> getEntries() {
            return $ENTRIES;
        }
    }

    public SurfaceConfig(@NotNull ConfigType configType, @NotNull ConfigSize configSize, @NotNull StreamUseCase streamUseCase) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        Intrinsics.checkNotNullParameter(configSize, "configSize");
        Intrinsics.checkNotNullParameter(streamUseCase, "streamUseCase");
        this.configType = configType;
        this.configSize = configSize;
        this.streamUseCase = streamUseCase;
        Integer num = IMAGE_FORMATS_BY_CONFIG_TYPE.get(configType);
        this.imageFormat = num != null ? num.intValue() : 0;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SurfaceConfig create(@NotNull ConfigType configType, @NotNull ConfigSize configSize) {
        return INSTANCE.create(configType, configSize);
    }

    @JvmStatic
    @NotNull
    public static final ConfigType getConfigType(int i11) {
        return INSTANCE.getConfigType(i11);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SurfaceConfig transformSurfaceConfig(int i11, @NotNull Size size, @NotNull SurfaceSizeDefinition surfaceSizeDefinition) {
        return INSTANCE.transformSurfaceConfig(i11, size, surfaceSizeDefinition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) other;
        return this.configType == surfaceConfig.configType && this.configSize == surfaceConfig.configSize && this.streamUseCase == surfaceConfig.streamUseCase;
    }

    /* JADX INFO: compiled from: SurfaceConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfigSize.values().length];
            try {
                iArr[ConfigSize.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConfigSize.RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConfigSize.MAXIMUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConfigSize.MAXIMUM_4_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConfigSize.MAXIMUM_16_9.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ConfigSize.ULTRA_MAXIMUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ConfigSize.NOT_SUPPORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Map<ConfigType, Integer> mapMapOf = MapsKt.mapOf(TuplesKt.m90091to(ConfigType.YUV, 35), TuplesKt.m90091to(ConfigType.JPEG, 256), TuplesKt.m90091to(ConfigType.JPEG_R, Integer.valueOf(JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY)), TuplesKt.m90091to(ConfigType.RAW, 32), TuplesKt.m90091to(ConfigType.PRIV, 34));
        IMAGE_FORMATS_BY_CONFIG_TYPE = mapMapOf;
        Set<Map.Entry<ConfigType, Integer>> setEntrySet = mapMapOf.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (ConfigType) entry.getKey());
        }
        CONFIG_TYPES_BY_IMAGE_FORMAT = linkedHashMap;
    }

    public static /* synthetic */ SurfaceConfig copy$default(SurfaceConfig surfaceConfig, ConfigType configType, ConfigSize configSize, StreamUseCase streamUseCase, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            configType = surfaceConfig.configType;
        }
        if ((i11 & 2) != 0) {
            configSize = surfaceConfig.configSize;
        }
        if ((i11 & 4) != 0) {
            streamUseCase = surfaceConfig.streamUseCase;
        }
        return surfaceConfig.copy(configType, configSize, streamUseCase);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SurfaceConfig create(@NotNull ConfigType configType, @NotNull ConfigSize configSize, @NotNull StreamUseCase streamUseCase) {
        return INSTANCE.create(configType, configSize, streamUseCase);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SurfaceConfig transformSurfaceConfig(int i11, @NotNull Size size, @NotNull SurfaceSizeDefinition surfaceSizeDefinition, int i12) {
        return INSTANCE.transformSurfaceConfig(i11, size, surfaceSizeDefinition, i12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConfigType getConfigType() {
        return this.configType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConfigSize getConfigSize() {
        return this.configSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StreamUseCase getStreamUseCase() {
        return this.streamUseCase;
    }

    @NotNull
    public final SurfaceConfig copy(@NotNull ConfigType configType, @NotNull ConfigSize configSize, @NotNull StreamUseCase streamUseCase) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        Intrinsics.checkNotNullParameter(configSize, "configSize");
        Intrinsics.checkNotNullParameter(streamUseCase, "streamUseCase");
        return new SurfaceConfig(configType, configSize, streamUseCase);
    }

    @NotNull
    public final ConfigSize getConfigSize() {
        return this.configSize;
    }

    @NotNull
    public final ConfigType getConfigType() {
        return this.configType;
    }

    public final int getImageFormat() {
        return this.imageFormat;
    }

    @NotNull
    public final Size getResolution(@NotNull SurfaceSizeDefinition definition) {
        Size previewSize;
        Intrinsics.checkNotNullParameter(definition, "definition");
        switch (WhenMappings.$EnumSwitchMapping$0[this.configSize.ordinal()]) {
            case 1:
                previewSize = definition.getPreviewSize();
                break;
            case 2:
                previewSize = definition.getRecordSize();
                break;
            case 3:
                previewSize = definition.getMaximumSize(this.imageFormat);
                break;
            case 4:
                previewSize = definition.getMaximum4x3Size(this.imageFormat);
                break;
            case 5:
                previewSize = definition.getMaximum16x9Size(this.imageFormat);
                break;
            case 6:
                previewSize = definition.getUltraMaximumSize(this.imageFormat);
                break;
            case 7:
                throw new IllegalStateException("Not supported config size");
            default:
                previewSize = this.configSize.getRelatedFixedSize();
                break;
        }
        Intrinsics.checkNotNull(previewSize);
        return previewSize;
    }

    @NotNull
    public final StreamUseCase getStreamUseCase() {
        return this.streamUseCase;
    }

    public int hashCode() {
        return (((this.configType.hashCode() * 31) + this.configSize.hashCode()) * 31) + this.streamUseCase.hashCode();
    }

    @NotNull
    public String toString() {
        return "SurfaceConfig(configType=" + this.configType + ", configSize=" + this.configSize + ", streamUseCase=" + this.streamUseCase + ')';
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SurfaceConfig transformSurfaceConfig(int i11, @NotNull Size size, @NotNull SurfaceSizeDefinition surfaceSizeDefinition, int i12, @NotNull ConfigSource configSource) {
        return INSTANCE.transformSurfaceConfig(i11, size, surfaceSizeDefinition, i12, configSource);
    }

    public final boolean isSupported(@NotNull SurfaceConfig other) {
        StreamUseCase streamUseCase;
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.configSize.getId() > this.configSize.getId() || other.configType != this.configType) {
            return false;
        }
        StreamUseCase streamUseCase2 = this.streamUseCase;
        StreamUseCase streamUseCase3 = StreamUseCase.DEFAULT;
        if (streamUseCase2 != streamUseCase3 && (streamUseCase = other.streamUseCase) != streamUseCase3 && streamUseCase != streamUseCase2) {
            return false;
        }
        return true;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SurfaceConfig transformSurfaceConfig(int i11, @NotNull Size size, @NotNull SurfaceSizeDefinition surfaceSizeDefinition, int i12, @NotNull ConfigSource configSource, @NotNull StreamUseCase streamUseCase) {
        return INSTANCE.transformSurfaceConfig(i11, size, surfaceSizeDefinition, i12, configSource, streamUseCase);
    }

    public /* synthetic */ SurfaceConfig(ConfigType configType, ConfigSize configSize, StreamUseCase streamUseCase, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(configType, configSize, (i11 & 4) != 0 ? DEFAULT_STREAM_USE_CASE : streamUseCase);
    }
}
