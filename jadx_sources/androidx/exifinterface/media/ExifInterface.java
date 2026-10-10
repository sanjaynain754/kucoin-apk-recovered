package androidx.exifinterface.media;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import com.jumio.analytics.MobileEvents;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33844oi;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.flutter.embedding.android.KeyboardMap;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.p505ws.WebSocketProtocol;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes.dex */
public class ExifInterface {
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    private static final Charset ASCII;
    static final short BYTE_ALIGN_II = 18761;
    static final short BYTE_ALIGN_MM = 19789;
    public static final int COLOR_SPACE_S_RGB = 1;
    public static final int COLOR_SPACE_UNCALIBRATED = 65535;
    public static final short CONTRAST_HARD = 2;
    public static final short CONTRAST_NORMAL = 0;
    public static final short CONTRAST_SOFT = 1;
    public static final int DATA_DEFLATE_ZIP = 8;
    public static final int DATA_HUFFMAN_COMPRESSED = 2;
    public static final int DATA_JPEG = 6;
    public static final int DATA_JPEG_COMPRESSED = 7;
    public static final int DATA_LOSSY_JPEG = 34892;
    public static final int DATA_PACK_BITS_COMPRESSED = 32773;
    public static final int DATA_UNCOMPRESSED = 1;
    private static final Pattern DATETIME_PRIMARY_FORMAT_PATTERN;
    private static final Pattern DATETIME_SECONDARY_FORMAT_PATTERN;
    private static final int DATETIME_VALUE_STRING_LENGTH = 19;
    private static final ExifTag[] EXIF_POINTER_TAGS;
    static final ExifTag[][] EXIF_TAGS;
    public static final short EXPOSURE_MODE_AUTO = 0;
    public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
    public static final short EXPOSURE_MODE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_ACTION = 6;
    public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
    public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
    public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
    public static final short EXPOSURE_PROGRAM_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_NORMAL = 2;
    public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
    public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
    public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
    public static final short FILE_SOURCE_DSC = 3;
    public static final short FILE_SOURCE_OTHER = 0;
    public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
    public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
    public static final short FLAG_FLASH_FIRED = 1;
    public static final short FLAG_FLASH_MODE_AUTO = 24;
    public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
    public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
    public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
    public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
    public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
    public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final String GPS_DIRECTION_MAGNETIC = "M";
    public static final String GPS_DIRECTION_TRUE = "T";
    public static final String GPS_DISTANCE_KILOMETERS = "K";
    public static final String GPS_DISTANCE_MILES = "M";
    public static final String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final String GPS_MEASUREMENT_2D = "2";
    public static final String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final String GPS_SPEED_KNOTS = "N";
    public static final String GPS_SPEED_MILES_PER_HOUR = "M";
    private static final Pattern GPS_TIMESTAMP_PATTERN;

    @VisibleForTesting
    static final byte[] IDENTIFIER_EXIF_APP1;
    private static final byte[] IDENTIFIER_XMP_APP1;
    private static final ExifTag[] IFD_EXIF_TAGS;
    private static final int IFD_FORMAT_BYTE = 1;
    private static final int IFD_FORMAT_DOUBLE = 12;
    private static final int IFD_FORMAT_IFD = 13;
    private static final int IFD_FORMAT_SBYTE = 6;
    private static final int IFD_FORMAT_SINGLE = 11;
    private static final int IFD_FORMAT_SLONG = 9;
    private static final int IFD_FORMAT_SRATIONAL = 10;
    private static final int IFD_FORMAT_SSHORT = 8;
    private static final int IFD_FORMAT_STRING = 2;
    private static final int IFD_FORMAT_ULONG = 4;
    private static final int IFD_FORMAT_UNDEFINED = 7;
    private static final int IFD_FORMAT_URATIONAL = 5;
    private static final int IFD_FORMAT_USHORT = 3;
    private static final ExifTag[] IFD_GPS_TAGS;
    private static final ExifTag[] IFD_INTEROPERABILITY_TAGS;
    private static final int IFD_OFFSET = 8;
    private static final ExifTag[] IFD_THUMBNAIL_TAGS;
    private static final ExifTag[] IFD_TIFF_TAGS;
    private static final int IFD_TYPE_EXIF = 1;
    private static final int IFD_TYPE_GPS = 2;
    private static final int IFD_TYPE_INTEROPERABILITY = 3;
    private static final int IFD_TYPE_ORF_CAMERA_SETTINGS = 7;
    private static final int IFD_TYPE_ORF_IMAGE_PROCESSING = 8;
    private static final int IFD_TYPE_ORF_MAKER_NOTE = 6;
    private static final int IFD_TYPE_PEF = 9;
    private static final int IFD_TYPE_PREVIEW = 5;
    private static final int IFD_TYPE_PRIMARY = 0;
    private static final int IFD_TYPE_THUMBNAIL = 4;
    private static final int IMAGE_TYPE_AVIF = 15;
    private static final int IMAGE_TYPE_DNG = 3;
    private static final int IMAGE_TYPE_HEIC = 12;
    private static final int IMAGE_TYPE_JPEG = 4;
    private static final int IMAGE_TYPE_ORF = 7;
    private static final int IMAGE_TYPE_PEF = 8;
    private static final int IMAGE_TYPE_PNG = 13;
    private static final int IMAGE_TYPE_RAF = 9;
    private static final int IMAGE_TYPE_RW2 = 10;
    private static final int IMAGE_TYPE_UNKNOWN = 0;
    private static final int IMAGE_TYPE_WEBP = 14;
    public static final String LATITUDE_NORTH = "N";
    public static final String LATITUDE_SOUTH = "S";
    public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
    public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_D50 = 23;
    public static final short LIGHT_SOURCE_D55 = 20;
    public static final short LIGHT_SOURCE_D65 = 21;
    public static final short LIGHT_SOURCE_D75 = 22;
    public static final short LIGHT_SOURCE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_FLASH = 4;
    public static final short LIGHT_SOURCE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_OTHER = 255;
    public static final short LIGHT_SOURCE_SHADE = 11;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
    public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
    public static final String LONGITUDE_EAST = "E";
    public static final String LONGITUDE_WEST = "W";
    private static final byte MARKER = -1;

    @VisibleForTesting
    static final byte MARKER_APP1 = -31;
    private static final byte MARKER_COM = -2;
    private static final byte MARKER_EOI = -39;
    private static final byte MARKER_SOF0 = -64;
    private static final byte MARKER_SOF1 = -63;
    private static final byte MARKER_SOF10 = -54;
    private static final byte MARKER_SOF11 = -53;
    private static final byte MARKER_SOF13 = -51;
    private static final byte MARKER_SOF14 = -50;
    private static final byte MARKER_SOF15 = -49;
    private static final byte MARKER_SOF2 = -62;
    private static final byte MARKER_SOF3 = -61;
    private static final byte MARKER_SOF5 = -59;
    private static final byte MARKER_SOF6 = -58;
    private static final byte MARKER_SOF7 = -57;
    private static final byte MARKER_SOF9 = -55;
    private static final byte MARKER_SOS = -38;
    private static final int MAX_THUMBNAIL_SIZE = 512;
    public static final short METERING_MODE_AVERAGE = 1;
    public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
    public static final short METERING_MODE_MULTI_SPOT = 4;
    public static final short METERING_MODE_OTHER = 255;
    public static final short METERING_MODE_PARTIAL = 6;
    public static final short METERING_MODE_PATTERN = 5;
    public static final short METERING_MODE_SPOT = 3;
    public static final short METERING_MODE_UNKNOWN = 0;
    private static final Pattern NON_ZERO_TIME_PATTERN;
    private static final ExifTag[] ORF_CAMERA_SETTINGS_TAGS;
    private static final ExifTag[] ORF_IMAGE_PROCESSING_TAGS;
    private static final int ORF_MAKER_NOTE_HEADER_1_SIZE = 8;
    private static final int ORF_MAKER_NOTE_HEADER_2_SIZE = 12;
    private static final ExifTag[] ORF_MAKER_NOTE_TAGS;
    private static final short ORF_SIGNATURE_1 = 20306;
    private static final short ORF_SIGNATURE_2 = 21330;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    private static final int PEF_MAKER_NOTE_SKIP_SIZE = 6;
    private static final String PEF_SIGNATURE = "PENTAX";
    private static final ExifTag[] PEF_TAGS;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
    private static final int PNG_CHUNK_CRC_BYTE_LENGTH = 4;
    private static final int PNG_CHUNK_TYPE_EXIF = 1700284774;
    private static final int PNG_CHUNK_TYPE_IEND = 1229278788;
    private static final int PNG_CHUNK_TYPE_IHDR = 1229472850;
    private static final int PNG_CHUNK_TYPE_ITXT = 1767135348;
    private static final int RAF_OFFSET_TO_JPEG_IMAGE_OFFSET = 84;
    private static final String RAF_SIGNATURE = "FUJIFILMCCD-RAW";
    private static final Set<String> RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY;
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;
    private static final short RW2_SIGNATURE = 85;
    public static final short SATURATION_HIGH = 0;
    public static final short SATURATION_LOW = 0;
    public static final short SATURATION_NORMAL = 0;
    public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
    public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
    public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
    public static final short SENSITIVITY_TYPE_REI = 2;
    public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
    public static final short SENSITIVITY_TYPE_SOS = 1;
    public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
    public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final short SENSOR_TYPE_NOT_DEFINED = 1;
    public static final short SENSOR_TYPE_ONE_CHIP = 2;
    public static final short SENSOR_TYPE_THREE_CHIP = 4;
    public static final short SENSOR_TYPE_TRILINEAR = 7;
    public static final short SENSOR_TYPE_TWO_CHIP = 3;
    public static final short SHARPNESS_HARD = 2;
    public static final short SHARPNESS_NORMAL = 0;
    public static final short SHARPNESS_SOFT = 1;
    private static final int SIGNATURE_CHECK_SIZE = 5000;
    private static final int SKIP_BUFFER_SIZE = 8192;
    static final byte START_CODE = 42;
    public static final int STREAM_TYPE_EXIF_DATA_ONLY = 1;
    public static final int STREAM_TYPE_FULL_IMAGE_DATA = 0;
    public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
    public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
    public static final String TAG_APERTURE_VALUE = "ApertureValue";
    public static final String TAG_ARTIST = "Artist";
    public static final String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final String TAG_BRIGHTNESS_VALUE = "BrightnessValue";

    @Deprecated
    public static final String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CAMERA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CFA_PATTERN = "CFAPattern";
    public static final String TAG_COLOR_SPACE = "ColorSpace";
    public static final String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final String TAG_COMPRESSION = "Compression";
    public static final String TAG_CONTRAST = "Contrast";
    public static final String TAG_COPYRIGHT = "Copyright";
    public static final String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final String TAG_DATETIME = "DateTime";
    public static final String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final String TAG_DNG_VERSION = "DNGVersion";
    private static final String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    public static final String TAG_EXIF_VERSION = "ExifVersion";
    public static final String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final String TAG_FILE_SOURCE = "FileSource";
    public static final String TAG_FLASH = "Flash";
    public static final String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final String TAG_FOCAL_LENGTH = "FocalLength";
    public static final String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final String TAG_F_NUMBER = "FNumber";
    public static final String TAG_GAIN_CONTROL = "GainControl";
    public static final String TAG_GAMMA = "Gamma";
    public static final String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final String TAG_GPS_DOP = "GPSDOP";
    public static final String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    private static final String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    public static final String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final String TAG_GPS_SPEED = "GPSSpeed";
    public static final String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final String TAG_GPS_STATUS = "GPSStatus";
    public static final String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final String TAG_GPS_TRACK = "GPSTrack";
    public static final String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final String TAG_IMAGE_LENGTH = "ImageLength";
    public static final String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final String TAG_IMAGE_WIDTH = "ImageWidth";
    private static final String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    public static final String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final String TAG_ISO_SPEED = "ISOSpeed";
    public static final String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";

    @Deprecated
    public static final String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final String TAG_LENS_MAKE = "LensMake";
    public static final String TAG_LENS_MODEL = "LensModel";
    public static final String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final String TAG_LIGHT_SOURCE = "LightSource";
    public static final String TAG_MAKE = "Make";
    public static final String TAG_MAKER_NOTE = "MakerNote";
    public static final String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final String TAG_METERING_MODE = "MeteringMode";
    public static final String TAG_MODEL = "Model";
    public static final String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final String TAG_OECF = "OECF";
    public static final String TAG_OFFSET_TIME = "OffsetTime";
    public static final String TAG_OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized";
    public static final String TAG_OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal";
    public static final String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    private static final String TAG_ORF_CAMERA_SETTINGS_IFD_POINTER = "CameraSettingsIFDPointer";
    private static final String TAG_ORF_IMAGE_PROCESSING_IFD_POINTER = "ImageProcessingIFDPointer";
    public static final String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final String TAG_ORIENTATION = "Orientation";
    public static final String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    private static final ExifTag TAG_RAF_IMAGE_SIZE;
    public static final String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final String TAG_RW2_ISO = "ISO";
    public static final String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final String TAG_SATURATION = "Saturation";
    public static final String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final String TAG_SCENE_TYPE = "SceneType";
    public static final String TAG_SENSING_METHOD = "SensingMethod";
    public static final String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final String TAG_SHARPNESS = "Sharpness";
    public static final String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final String TAG_SOFTWARE = "Software";
    public static final String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    public static final String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final String TAG_SUBFILE_TYPE = "SubfileType";
    public static final String TAG_SUBJECT_AREA = "SubjectArea";
    public static final String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final String TAG_SUBSEC_TIME = "SubSecTime";
    public static final String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    private static final String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    public static final String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    public static final String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final String TAG_USER_COMMENT = "UserComment";
    public static final String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final String TAG_WHITE_POINT = "WhitePoint";
    public static final String TAG_XMP = "Xmp";
    public static final String TAG_X_RESOLUTION = "XResolution";
    public static final String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final String TAG_Y_RESOLUTION = "YResolution";
    private static final int WEBP_CHUNK_SIZE_BYTE_LENGTH = 4;
    private static final int WEBP_CHUNK_TYPE_BYTE_LENGTH = 4;
    private static final int WEBP_CHUNK_TYPE_VP8X_DEFAULT_LENGTH = 10;
    private static final int WEBP_FILE_SIZE_BYTE_LENGTH = 4;
    private static final byte WEBP_VP8L_SIGNATURE = 47;

    @Deprecated
    public static final int WHITEBALANCE_AUTO = 0;

    @Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;
    private static final int XMP_HANDLING_PREFER_SEPARATE = 2;
    private static final int XMP_HANDLING_PREFER_TIFF_700_IF_PRESENT = 3;
    private static final int XMP_HANDLING_TIFF_700_ONLY = 1;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
    private static final HashMap<Integer, Integer> sExifPointerTagMap;
    private static final HashMap<Integer, ExifTag>[] sExifTagMapsForReading;
    private static final HashMap<String, ExifTag>[] sExifTagMapsForWriting;
    private static final SimpleDateFormat sFormatterPrimary;
    private static final SimpleDateFormat sFormatterSecondary;
    private boolean mAreThumbnailStripsConsecutive;
    private AssetManager.AssetInputStream mAssetInputStream;
    private final HashMap<String, ExifAttribute>[] mAttributes;
    private Set<Integer> mAttributesOffsets;
    private ByteOrder mExifByteOrder;
    private boolean mFileOnDiskContainsSeparateXmpMarker;
    private String mFilename;
    private boolean mHasThumbnail;
    private boolean mHasThumbnailStrips;
    private boolean mIsExifDataOnly;
    private int mMimeType;
    private boolean mModified;
    private int mOffsetToExifData;
    private int mOrfMakerNoteOffset;
    private int mOrfThumbnailLength;
    private int mOrfThumbnailOffset;
    private FileDescriptor mSeekableFileDescriptor;
    private byte[] mThumbnailBytes;
    private int mThumbnailCompression;
    private int mThumbnailLength;
    private int mThumbnailOffset;
    private ExifAttribute mXmpFromSeparateMarker;
    private static final String TAG = "ExifInterface";
    private static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final List<Integer> ROTATION_ORDER = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> FLIPPED_ROTATION_ORDER = Arrays.asList(2, 7, 4, 5);
    public static final int[] BITS_PER_SAMPLE_RGB = {8, 8, 8};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = {4};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = {8};
    private static final byte MARKER_SOI = -40;
    static final byte[] JPEG_SIGNATURE = {-1, MARKER_SOI, -1};
    private static final byte[] HEIF_TYPE_FTYP = {BuiltinOptions.CumsumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ReadVariableOptions};
    private static final byte[] HEIF_BRAND_MIF1 = {BuiltinOptions.HashtableImportOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.TransposeConvOptions};
    private static final byte[] HEIF_BRAND_HEIC = {BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.DensifyOptions};
    private static final byte[] HEIF_BRAND_AVIF = {BuiltinOptions.ScatterNdOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CumsumOptions};
    private static final byte[] HEIF_BRAND_AVIS = {BuiltinOptions.ScatterNdOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BucketizeOptions};
    private static final byte[] ORF_MAKER_NOTE_HEADER_1 = {BuiltinOptions.SplitVOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UniqueOptions, 0};
    private static final byte[] ORF_MAKER_NOTE_HEADER_2 = {BuiltinOptions.SplitVOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.WhereOptions, BuiltinOptions.GatherNdOptions, 0, BuiltinOptions.RangeOptions, BuiltinOptions.RangeOptions};
    private static final byte[] PNG_SIGNATURE = {-119, BuiltinOptions.UniqueOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 13, 10, 26, 10};

    @VisibleForTesting
    static final byte[] PNG_ITXT_XMP_KEYWORD = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    private static final byte[] WEBP_SIGNATURE_1 = {BuiltinOptions.AddNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BidirectionalSequenceRNNOptions};
    private static final byte[] WEBP_SIGNATURE_2 = {BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.UniqueOptions};
    private static final byte[] WEBP_CHUNK_TYPE_EXIF = {BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions};
    private static final byte[] WEBP_VP8_SIGNATURE = {-99, 1, 42};
    private static final byte[] WEBP_CHUNK_TYPE_VP8X = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_VP8L = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_VP8 = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_ANIM = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_ANMF = "ANMF".getBytes(Charset.defaultCharset());
    private static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static final byte[] EXIF_ASCII_PREFIX = {BuiltinOptions.FloorDivOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.RangeOptions, 0, 0, 0};

    public static class ByteOrderedDataInputStream extends InputStream implements DataInput {
        public static final int LENGTH_UNSET = -1;
        private ByteOrder mByteOrder;
        protected final DataInputStream mDataInputStream;
        private int mLength;
        protected int mPosition;
        private byte[] mSkipBuffer;

        public ByteOrderedDataInputStream(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.mLength = bArr.length;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.mPosition++;
            return this.mDataInputStream.read();
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i11, int i12) throws IOException {
            this.mPosition += i12;
            this.mDataInputStream.readFully(bArr, i11, i12);
        }

        public void skipFully(int i11) throws IOException {
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i11 - i12;
                int iSkip = (int) this.mDataInputStream.skip(i13);
                if (iSkip <= 0) {
                    if (this.mSkipBuffer == null) {
                        this.mSkipBuffer = new byte[8192];
                    }
                    iSkip = this.mDataInputStream.read(this.mSkipBuffer, 0, Math.min(8192, i13));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i11 + " bytes.");
                    }
                }
                i12 += iSkip;
            }
            this.mPosition += i12;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.mDataInputStream.available();
        }

        public int length() {
            return this.mLength;
        }

        @Override // java.io.InputStream
        public void mark(int i11) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public int position() {
            return this.mPosition;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.mPosition++;
            return this.mDataInputStream.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.mPosition++;
            int i11 = this.mDataInputStream.read();
            if (i11 >= 0) {
                return (byte) i11;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.mPosition += 2;
            return this.mDataInputStream.readChar();
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.mPosition += 4;
            int i11 = this.mDataInputStream.read();
            int i12 = this.mDataInputStream.read();
            int i13 = this.mDataInputStream.read();
            int i14 = this.mDataInputStream.read();
            if ((i11 | i12 | i13 | i14) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i14 << 24) + (i13 << 16) + (i12 << 8) + i11;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
            }
            throw new IOException("Invalid byte order: " + this.mByteOrder);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d(ExifInterface.TAG, "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.mPosition += 8;
            int i11 = this.mDataInputStream.read();
            int i12 = this.mDataInputStream.read();
            int i13 = this.mDataInputStream.read();
            int i14 = this.mDataInputStream.read();
            int i15 = this.mDataInputStream.read();
            int i16 = this.mDataInputStream.read();
            int i17 = this.mDataInputStream.read();
            int i18 = this.mDataInputStream.read();
            if ((i11 | i12 | i13 | i14 | i15 | i16 | i17 | i18) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i18) << 56) + (((long) i17) << 48) + (((long) i16) << 40) + (((long) i15) << 32) + (((long) i14) << 24) + (((long) i13) << 16) + (((long) i12) << 8) + ((long) i11);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i11) << 56) + (((long) i12) << 48) + (((long) i13) << 40) + (((long) i14) << 32) + (((long) i15) << 24) + (((long) i16) << 16) + (((long) i17) << 8) + ((long) i18);
            }
            throw new IOException("Invalid byte order: " + this.mByteOrder);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.mPosition += 2;
            int i11 = this.mDataInputStream.read();
            int i12 = this.mDataInputStream.read();
            if ((i11 | i12) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i12 << 8) + i11);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i11 << 8) + i12);
            }
            throw new IOException("Invalid byte order: " + this.mByteOrder);
        }

        public byte[] readToEnd() throws IOException {
            byte[] bArrCopyOf = new byte[1024];
            int i11 = 0;
            while (true) {
                if (i11 == bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                }
                int i12 = this.mDataInputStream.read(bArrCopyOf, i11, bArrCopyOf.length - i11);
                if (i12 == -1) {
                    return Arrays.copyOf(bArrCopyOf, i11);
                }
                i11 += i12;
                this.mPosition += i12;
            }
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.mPosition += 2;
            return this.mDataInputStream.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.mPosition++;
            return this.mDataInputStream.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.mPosition += 2;
            int i11 = this.mDataInputStream.read();
            int i12 = this.mDataInputStream.read();
            if ((i11 | i12) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i12 << 8) + i11;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i11 << 8) + i12;
            }
            throw new IOException("Invalid byte order: " + this.mByteOrder);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public void setByteOrder(ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        @Override // java.io.DataInput
        public int skipBytes(int i11) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public ByteOrderedDataInputStream(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) throws IOException {
            int i13 = this.mDataInputStream.read(bArr, i11, i12);
            this.mPosition += i13;
            return i13;
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.mPosition += bArr.length;
            this.mDataInputStream.readFully(bArr);
        }

        public long readUnsignedInt() throws IOException {
            return ((long) readInt()) & KeyboardMap.kValueMask;
        }

        public ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.mDataInputStream = dataInputStream;
            dataInputStream.mark(0);
            this.mPosition = 0;
            this.mByteOrder = byteOrder;
            this.mLength = inputStream instanceof ByteOrderedDataInputStream ? ((ByteOrderedDataInputStream) inputStream).length() : -1;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class ByteOrderedDataOutputStream extends FilterOutputStream {
        private ByteOrder mByteOrder;
        final DataOutputStream mOutputStream;

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.mOutputStream.write(bArr);
        }

        public void setByteOrder(ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) throws IOException {
            this.mOutputStream.write(bArr, i11, i12);
        }

        public void writeByte(int i11) throws IOException {
            this.mOutputStream.write(i11);
        }

        public void writeInt(int i11) throws IOException {
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.mOutputStream.write(i11 & 255);
                this.mOutputStream.write((i11 >>> 8) & 255);
                this.mOutputStream.write((i11 >>> 16) & 255);
                this.mOutputStream.write((i11 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.mOutputStream.write((i11 >>> 24) & 255);
                this.mOutputStream.write((i11 >>> 16) & 255);
                this.mOutputStream.write((i11 >>> 8) & 255);
                this.mOutputStream.write(i11 & 255);
            }
        }

        public void writeShort(short s11) throws IOException {
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.mOutputStream.write(s11 & 255);
                this.mOutputStream.write((s11 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.mOutputStream.write((s11 >>> 8) & 255);
                this.mOutputStream.write(s11 & 255);
            }
        }

        public ByteOrderedDataOutputStream(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.mOutputStream = new DataOutputStream(outputStream);
            this.mByteOrder = byteOrder;
        }

        public void writeUnsignedShort(int i11) throws IOException {
            if (i11 <= 65535) {
                writeShort((short) i11);
                return;
            }
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }

        public void writeUnsignedInt(long j11) throws IOException {
            if (j11 <= KeyboardMap.kValueMask) {
                writeInt((int) j11);
                return;
            }
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }
    }

    public static class ExifAttribute {
        public static final long BYTES_OFFSET_UNKNOWN = -1;
        public final byte[] bytes;
        public final long bytesOffset;
        public final int format;
        public final int numberOfComponents;

        public ExifAttribute(int i11, int i12, byte[] bArr) {
            this(i11, i12, -1L, bArr);
        }

        public static ExifAttribute createByte(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(ExifInterface.ASCII);
            return new ExifAttribute(1, bytes.length, bytes);
        }

        public static ExifAttribute createULong(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j11 : jArr) {
                byteBufferWrap.putInt((int) j11);
            }
            return new ExifAttribute(4, jArr.length, byteBufferWrap.array());
        }

        public static ExifAttribute createURational(Rational[] rationalArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[5] * rationalArr.length]);
            byteBufferWrap.order(byteOrder);
            for (Rational rational : rationalArr) {
                byteBufferWrap.putInt((int) rational.numerator);
                byteBufferWrap.putInt((int) rational.denominator);
            }
            return new ExifAttribute(5, rationalArr.length, byteBufferWrap.array());
        }

        public static ExifAttribute createUShort(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i11 : iArr) {
                byteBufferWrap.putShort((short) i11);
            }
            return new ExifAttribute(3, iArr.length, byteBufferWrap.array());
        }

        /* JADX WARN: Code duplicated, block: B:172:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:193:? A[SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0032: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0031 */
        public Object getValue(ByteOrder byteOrder) throws Throwable {
            Throwable th2;
            IOException iOException;
            ByteOrderedDataInputStream byteOrderedDataInputStream;
            InputStream inputStream;
            byte b11;
            byte b12;
            int length = 0;
            InputStream inputStream2 = null;
            try {
                try {
                    byteOrderedDataInputStream = new ByteOrderedDataInputStream(this.bytes);
                    try {
                        byteOrderedDataInputStream.setByteOrder(byteOrder);
                        switch (this.format) {
                            case 1:
                            case 6:
                                byte[] bArr = this.bytes;
                                if (bArr.length != 1 || (b11 = bArr[0]) < 0 || b11 > 1) {
                                    String str = new String(bArr, ExifInterface.ASCII);
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return str;
                                    } catch (IOException e11) {
                                        Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e11);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b11 + BuiltinOptions.SliceOptions)});
                                try {
                                    byteOrderedDataInputStream.close();
                                    return str2;
                                } catch (IOException e12) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e12);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (this.numberOfComponents >= ExifInterface.EXIF_ASCII_PREFIX.length) {
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= ExifInterface.EXIF_ASCII_PREFIX.length) {
                                            length = ExifInterface.EXIF_ASCII_PREFIX.length;
                                        } else if (this.bytes[i11] == ExifInterface.EXIF_ASCII_PREFIX[i11]) {
                                            i11++;
                                        }
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                while (length < this.numberOfComponents && (b12 = this.bytes[length]) != 0) {
                                    if (b12 >= 32) {
                                        sb2.append((char) b12);
                                    } else {
                                        sb2.append('?');
                                    }
                                    length++;
                                }
                                String string = sb2.toString();
                                try {
                                    byteOrderedDataInputStream.close();
                                    return string;
                                } catch (IOException e13) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e13);
                                    return string;
                                }
                            case 3:
                                int[] iArr = new int[this.numberOfComponents];
                                while (length < this.numberOfComponents) {
                                    iArr[length] = byteOrderedDataInputStream.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return iArr;
                                } catch (IOException e14) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e14);
                                    return iArr;
                                }
                            case 4:
                                long[] jArr = new long[this.numberOfComponents];
                                while (length < this.numberOfComponents) {
                                    jArr[length] = byteOrderedDataInputStream.readUnsignedInt();
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return jArr;
                                } catch (IOException e15) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e15);
                                    return jArr;
                                }
                            case 5:
                                Rational[] rationalArr = new Rational[this.numberOfComponents];
                                while (length < this.numberOfComponents) {
                                    rationalArr[length] = new Rational(byteOrderedDataInputStream.readUnsignedInt(), byteOrderedDataInputStream.readUnsignedInt());
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return rationalArr;
                                } catch (IOException e16) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e16);
                                    return rationalArr;
                                }
                            case 8:
                                int[] iArr2 = new int[this.numberOfComponents];
                                while (length < this.numberOfComponents) {
                                    iArr2[length] = byteOrderedDataInputStream.readShort();
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return iArr2;
                                } catch (IOException e17) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e17);
                                    return iArr2;
                                }
                            case 9:
                                int[] iArr3 = new int[this.numberOfComponents];
                                while (length < this.numberOfComponents) {
                                    iArr3[length] = byteOrderedDataInputStream.readInt();
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return iArr3;
                                } catch (IOException e18) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e18);
                                    return iArr3;
                                }
                            case 10:
                                Rational[] rationalArr2 = new Rational[this.numberOfComponents];
                                while (length < this.numberOfComponents) {
                                    rationalArr2[length] = new Rational(byteOrderedDataInputStream.readInt(), byteOrderedDataInputStream.readInt());
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return rationalArr2;
                                } catch (IOException e19) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e19);
                                    return rationalArr2;
                                }
                            case 11:
                                double[] dArr = new double[this.numberOfComponents];
                                while (length < this.numberOfComponents) {
                                    dArr[length] = byteOrderedDataInputStream.readFloat();
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return dArr;
                                } catch (IOException e21) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e21);
                                    return dArr;
                                }
                            case 12:
                                double[] dArr2 = new double[this.numberOfComponents];
                                while (length < this.numberOfComponents) {
                                    dArr2[length] = byteOrderedDataInputStream.readDouble();
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return dArr2;
                                } catch (IOException e22) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e22);
                                    return dArr2;
                                }
                            default:
                                try {
                                    byteOrderedDataInputStream.close();
                                    return null;
                                } catch (IOException e23) {
                                    Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e23);
                                    return null;
                                }
                        }
                    } catch (IOException e24) {
                        iOException = e24;
                        Log.w(ExifInterface.TAG, "IOException occurred during reading a value", iOException);
                        if (byteOrderedDataInputStream != null) {
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e25) {
                                Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e25);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        throw th2;
                    }
                    try {
                        inputStream2.close();
                        throw th2;
                    } catch (IOException e26) {
                        Log.e(ExifInterface.TAG, "IOException occurred while closing InputStream", e26);
                        throw th2;
                    }
                }
            } catch (IOException e27) {
                iOException = e27;
                byteOrderedDataInputStream = null;
            } catch (Throwable th4) {
                th2 = th4;
                if (inputStream2 != null) {
                    throw th2;
                }
                inputStream2.close();
                throw th2;
            }
        }

        public ExifAttribute(int i11, int i12, long j11, byte[] bArr) {
            this.format = i11;
            this.numberOfComponents = i12;
            this.bytesOffset = j11;
            this.bytes = bArr;
        }

        public static ExifAttribute createString(String str) {
            byte[] bytes = (str + (char) 0).getBytes(ExifInterface.ASCII);
            return new ExifAttribute(2, bytes.length, bytes);
        }

        public String toString() {
            return "(" + ExifInterface.IFD_FORMAT_NAMES[this.format] + ", data length:" + this.bytes.length + ")";
        }

        public static ExifAttribute createDouble(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d11 : dArr) {
                byteBufferWrap.putDouble(d11);
            }
            return new ExifAttribute(12, dArr.length, byteBufferWrap.array());
        }

        public static ExifAttribute createSLong(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i11 : iArr) {
                byteBufferWrap.putInt(i11);
            }
            return new ExifAttribute(9, iArr.length, byteBufferWrap.array());
        }

        public static ExifAttribute createSRational(Rational[] rationalArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[10] * rationalArr.length]);
            byteBufferWrap.order(byteOrder);
            for (Rational rational : rationalArr) {
                byteBufferWrap.putInt((int) rational.numerator);
                byteBufferWrap.putInt((int) rational.denominator);
            }
            return new ExifAttribute(10, rationalArr.length, byteBufferWrap.array());
        }

        public double getDoubleValue(ByteOrder byteOrder) throws Throwable {
            Object value = getValue(byteOrder);
            if (value != null) {
                if (value instanceof String) {
                    return Double.parseDouble((String) value);
                }
                if (value instanceof long[]) {
                    long[] jArr = (long[]) value;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (value instanceof int[]) {
                    int[] iArr = (int[]) value;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (value instanceof double[]) {
                    double[] dArr = (double[]) value;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (value instanceof Rational[]) {
                    Rational[] rationalArr = (Rational[]) value;
                    if (rationalArr.length == 1) {
                        return rationalArr[0].calculate();
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a double value");
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int getIntValue(ByteOrder byteOrder) throws Throwable {
            Object value = getValue(byteOrder);
            if (value != null) {
                if (value instanceof String) {
                    return Integer.parseInt((String) value);
                }
                if (value instanceof long[]) {
                    long[] jArr = (long[]) value;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (value instanceof int[]) {
                    int[] iArr = (int[]) value;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a integer value");
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String getStringValue(ByteOrder byteOrder) throws Throwable {
            Object value = getValue(byteOrder);
            if (value == null) {
                return null;
            }
            if (value instanceof String) {
                return (String) value;
            }
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                while (i11 < jArr.length) {
                    sb2.append(jArr[i11]);
                    i11++;
                    if (i11 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (value instanceof int[]) {
                int[] iArr = (int[]) value;
                while (i11 < iArr.length) {
                    sb2.append(iArr[i11]);
                    i11++;
                    if (i11 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (value instanceof double[]) {
                double[] dArr = (double[]) value;
                while (i11 < dArr.length) {
                    sb2.append(dArr[i11]);
                    i11++;
                    if (i11 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(value instanceof Rational[])) {
                return null;
            }
            Rational[] rationalArr = (Rational[]) value;
            while (i11 < rationalArr.length) {
                sb2.append(rationalArr[i11].numerator);
                sb2.append('/');
                sb2.append(rationalArr[i11].denominator);
                i11++;
                if (i11 != rationalArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        public int size() {
            return ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[this.format] * this.numberOfComponents;
        }

        public static ExifAttribute createULong(long j11, ByteOrder byteOrder) {
            return createULong(new long[]{j11}, byteOrder);
        }

        public static ExifAttribute createUShort(int i11, ByteOrder byteOrder) {
            return createUShort(new int[]{i11}, byteOrder);
        }

        public static ExifAttribute createURational(Rational rational, ByteOrder byteOrder) {
            return createURational(new Rational[]{rational}, byteOrder);
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ExifStreamType {
    }

    public static class ExifTag {
        public final String name;
        public final int number;
        public final int primaryFormat;
        public final int secondaryFormat;

        public ExifTag(String str, int i11, int i12) {
            this.name = str;
            this.number = i11;
            this.primaryFormat = i12;
            this.secondaryFormat = -1;
        }

        public boolean isFormatCompatible(int i11) {
            int i12;
            int i13 = this.primaryFormat;
            if (i13 == 7 || i11 == 7 || i13 == i11 || (i12 = this.secondaryFormat) == i11) {
                return true;
            }
            if ((i13 == 4 || i12 == 4) && i11 == 3) {
                return true;
            }
            if ((i13 == 9 || i12 == 9) && i11 == 8) {
                return true;
            }
            return (i13 == 12 || i12 == 12) && i11 == 11;
        }

        public ExifTag(String str, int i11, int i12, int i13) {
            this.name = str;
            this.number = i11;
            this.primaryFormat = i12;
            this.secondaryFormat = i13;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface IfdType {
    }

    /* JADX INFO: loaded from: classes34.dex */
    @VisibleForTesting
    public static class Rational {
        public final long denominator;
        public final long numerator;

        private Rational(long j11, long j12) {
            if (j12 == 0) {
                this.numerator = 0L;
                this.denominator = 1L;
            } else {
                this.numerator = j11;
                this.denominator = j12;
            }
        }

        public static Rational createFromDouble(double d11) {
            long j11;
            long j12;
            long j13 = 1;
            if (d11 >= 9.223372036854776E18d || d11 <= -9.223372036854776E18d) {
                return new Rational(d11 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
            }
            double dAbs = Math.abs(d11);
            long j14 = 0;
            long j15 = 1;
            double d12 = dAbs;
            long j16 = 0;
            while (true) {
                double d13 = d12 % 1.0d;
                long j17 = (long) (d12 - d13);
                j11 = j16 + (j17 * j13);
                j12 = (j17 * j14) + j15;
                d12 = 1.0d / d13;
                long j18 = j13;
                if (Math.abs(dAbs - (j11 / j12)) <= 1.0E-8d * dAbs) {
                    break;
                }
                j15 = j14;
                j13 = j11;
                j16 = j18;
                j14 = j12;
            }
            if (d11 < 0.0d) {
                j11 = -j11;
            }
            return new Rational(j11, j12);
        }

        public double calculate() {
            return this.numerator / this.denominator;
        }

        public String toString() {
            return this.numerator + "/" + this.denominator;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class SeekableByteOrderedDataInputStream extends ByteOrderedDataInputStream {
        public SeekableByteOrderedDataInputStream(byte[] bArr) throws IOException {
            super(bArr);
            this.mDataInputStream.mark(Integer.MAX_VALUE);
        }

        public void seek(long j11) throws IOException {
            int i11 = this.mPosition;
            if (i11 > j11) {
                this.mPosition = 0;
                this.mDataInputStream.reset();
            } else {
                j11 -= (long) i11;
            }
            skipFully((int) j11);
        }

        public SeekableByteOrderedDataInputStream(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.mDataInputStream.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    static {
        ExifTag[] exifTagArr = {new ExifTag(TAG_NEW_SUBFILE_TYPE, 254, 4), new ExifTag(TAG_SUBFILE_TYPE, 255, 4), new ExifTag(TAG_IMAGE_WIDTH, 256, 3, 4), new ExifTag(TAG_IMAGE_LENGTH, 257, 3, 4), new ExifTag(TAG_BITS_PER_SAMPLE, 258, 3), new ExifTag(TAG_COMPRESSION, 259, 3), new ExifTag(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new ExifTag(TAG_IMAGE_DESCRIPTION, 270, 2), new ExifTag(TAG_MAKE, 271, 2), new ExifTag(TAG_MODEL, 272, 2), new ExifTag(TAG_STRIP_OFFSETS, BaseQuickAdapter.HEADER_VIEW, 3, 4), new ExifTag(TAG_ORIENTATION, 274, 3), new ExifTag(TAG_SAMPLES_PER_PIXEL, 277, 3), new ExifTag(TAG_ROWS_PER_STRIP, 278, 3, 4), new ExifTag(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new ExifTag(TAG_X_RESOLUTION, 282, 5), new ExifTag(TAG_Y_RESOLUTION, 283, 5), new ExifTag(TAG_PLANAR_CONFIGURATION, 284, 3), new ExifTag(TAG_RESOLUTION_UNIT, 296, 3), new ExifTag(TAG_TRANSFER_FUNCTION, 301, 3), new ExifTag(TAG_SOFTWARE, 305, 2), new ExifTag(TAG_DATETIME, 306, 2), new ExifTag(TAG_ARTIST, 315, 2), new ExifTag(TAG_WHITE_POINT, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 5), new ExifTag(TAG_PRIMARY_CHROMATICITIES, MobileEvents.EVENTTYPE_PERFORMANCE, 5), new ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT, InputDeviceCompat.SOURCE_DPAD, 4), new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new ExifTag(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new ExifTag(TAG_Y_CB_CR_SUB_SAMPLING, C33556b3.f69031d, 3), new ExifTag(TAG_Y_CB_CR_POSITIONING, 531, 3), new ExifTag(TAG_REFERENCE_BLACK_WHITE, 532, 5), new ExifTag(TAG_COPYRIGHT, 33432, 2), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new ExifTag(TAG_RW2_SENSOR_TOP_BORDER, 4, 4), new ExifTag(TAG_RW2_SENSOR_LEFT_BORDER, 5, 4), new ExifTag(TAG_RW2_SENSOR_BOTTOM_BORDER, 6, 4), new ExifTag(TAG_RW2_SENSOR_RIGHT_BORDER, 7, 4), new ExifTag(TAG_RW2_ISO, 23, 3), new ExifTag(TAG_RW2_JPG_FROM_RAW, 46, 7), new ExifTag(TAG_XMP, 700, 1)};
        IFD_TIFF_TAGS = exifTagArr;
        ExifTag[] exifTagArr2 = {new ExifTag(TAG_EXPOSURE_TIME, 33434, 5), new ExifTag(TAG_F_NUMBER, 33437, 5), new ExifTag(TAG_EXPOSURE_PROGRAM, 34850, 3), new ExifTag(TAG_SPECTRAL_SENSITIVITY, 34852, 2), new ExifTag(TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new ExifTag(TAG_OECF, 34856, 7), new ExifTag(TAG_SENSITIVITY_TYPE, 34864, 3), new ExifTag(TAG_STANDARD_OUTPUT_SENSITIVITY, 34865, 4), new ExifTag(TAG_RECOMMENDED_EXPOSURE_INDEX, 34866, 4), new ExifTag(TAG_ISO_SPEED, 34867, 4), new ExifTag(TAG_ISO_SPEED_LATITUDE_YYY, 34868, 4), new ExifTag(TAG_ISO_SPEED_LATITUDE_ZZZ, 34869, 4), new ExifTag(TAG_EXIF_VERSION, 36864, 2), new ExifTag(TAG_DATETIME_ORIGINAL, 36867, 2), new ExifTag(TAG_DATETIME_DIGITIZED, 36868, 2), new ExifTag(TAG_OFFSET_TIME, 36880, 2), new ExifTag(TAG_OFFSET_TIME_ORIGINAL, 36881, 2), new ExifTag(TAG_OFFSET_TIME_DIGITIZED, 36882, 2), new ExifTag(TAG_COMPONENTS_CONFIGURATION, 37121, 7), new ExifTag(TAG_COMPRESSED_BITS_PER_PIXEL, 37122, 5), new ExifTag(TAG_SHUTTER_SPEED_VALUE, 37377, 10), new ExifTag(TAG_APERTURE_VALUE, 37378, 5), new ExifTag(TAG_BRIGHTNESS_VALUE, 37379, 10), new ExifTag(TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new ExifTag(TAG_MAX_APERTURE_VALUE, 37381, 5), new ExifTag(TAG_SUBJECT_DISTANCE, 37382, 5), new ExifTag(TAG_METERING_MODE, 37383, 3), new ExifTag(TAG_LIGHT_SOURCE, 37384, 3), new ExifTag(TAG_FLASH, 37385, 3), new ExifTag(TAG_FOCAL_LENGTH, 37386, 5), new ExifTag(TAG_SUBJECT_AREA, 37396, 3), new ExifTag(TAG_MAKER_NOTE, 37500, 7), new ExifTag(TAG_USER_COMMENT, 37510, 7), new ExifTag(TAG_SUBSEC_TIME, 37520, 2), new ExifTag(TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new ExifTag(TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new ExifTag(TAG_FLASHPIX_VERSION, 40960, 7), new ExifTag(TAG_COLOR_SPACE, 40961, 3), new ExifTag(TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new ExifTag(TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new ExifTag(TAG_RELATED_SOUND_FILE, 40964, 2), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new ExifTag(TAG_FLASH_ENERGY, 41483, 5), new ExifTag(TAG_SPATIAL_FREQUENCY_RESPONSE, 41484, 7), new ExifTag(TAG_FOCAL_PLANE_X_RESOLUTION, 41486, 5), new ExifTag(TAG_FOCAL_PLANE_Y_RESOLUTION, 41487, 5), new ExifTag(TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new ExifTag(TAG_SUBJECT_LOCATION, 41492, 3), new ExifTag(TAG_EXPOSURE_INDEX, 41493, 5), new ExifTag(TAG_SENSING_METHOD, 41495, 3), new ExifTag(TAG_FILE_SOURCE, 41728, 7), new ExifTag(TAG_SCENE_TYPE, 41729, 7), new ExifTag(TAG_CFA_PATTERN, 41730, 7), new ExifTag(TAG_CUSTOM_RENDERED, 41985, 3), new ExifTag(TAG_EXPOSURE_MODE, 41986, 3), new ExifTag(TAG_WHITE_BALANCE, 41987, 3), new ExifTag(TAG_DIGITAL_ZOOM_RATIO, 41988, 5), new ExifTag(TAG_FOCAL_LENGTH_IN_35MM_FILM, 41989, 3), new ExifTag(TAG_SCENE_CAPTURE_TYPE, 41990, 3), new ExifTag(TAG_GAIN_CONTROL, 41991, 3), new ExifTag(TAG_CONTRAST, 41992, 3), new ExifTag(TAG_SATURATION, 41993, 3), new ExifTag(TAG_SHARPNESS, 41994, 3), new ExifTag(TAG_DEVICE_SETTING_DESCRIPTION, 41995, 7), new ExifTag(TAG_SUBJECT_DISTANCE_RANGE, 41996, 3), new ExifTag(TAG_IMAGE_UNIQUE_ID, 42016, 2), new ExifTag("CameraOwnerName", 42032, 2), new ExifTag(TAG_BODY_SERIAL_NUMBER, 42033, 2), new ExifTag(TAG_LENS_SPECIFICATION, 42034, 5), new ExifTag(TAG_LENS_MAKE, 42035, 2), new ExifTag(TAG_LENS_MODEL, 42036, 2), new ExifTag(TAG_GAMMA, 42240, 5), new ExifTag(TAG_DNG_VERSION, 50706, 1), new ExifTag(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        IFD_EXIF_TAGS = exifTagArr2;
        ExifTag[] exifTagArr3 = {new ExifTag(TAG_GPS_VERSION_ID, 0, 1), new ExifTag(TAG_GPS_LATITUDE_REF, 1, 2), new ExifTag(TAG_GPS_LATITUDE, 2, 5, 10), new ExifTag(TAG_GPS_LONGITUDE_REF, 3, 2), new ExifTag(TAG_GPS_LONGITUDE, 4, 5, 10), new ExifTag(TAG_GPS_ALTITUDE_REF, 5, 1), new ExifTag(TAG_GPS_ALTITUDE, 6, 5), new ExifTag(TAG_GPS_TIMESTAMP, 7, 5), new ExifTag(TAG_GPS_SATELLITES, 8, 2), new ExifTag(TAG_GPS_STATUS, 9, 2), new ExifTag(TAG_GPS_MEASURE_MODE, 10, 2), new ExifTag(TAG_GPS_DOP, 11, 5), new ExifTag(TAG_GPS_SPEED_REF, 12, 2), new ExifTag(TAG_GPS_SPEED, 13, 5), new ExifTag(TAG_GPS_TRACK_REF, 14, 2), new ExifTag(TAG_GPS_TRACK, 15, 5), new ExifTag(TAG_GPS_IMG_DIRECTION_REF, 16, 2), new ExifTag(TAG_GPS_IMG_DIRECTION, 17, 5), new ExifTag(TAG_GPS_MAP_DATUM, 18, 2), new ExifTag(TAG_GPS_DEST_LATITUDE_REF, 19, 2), new ExifTag(TAG_GPS_DEST_LATITUDE, 20, 5), new ExifTag(TAG_GPS_DEST_LONGITUDE_REF, 21, 2), new ExifTag(TAG_GPS_DEST_LONGITUDE, 22, 5), new ExifTag(TAG_GPS_DEST_BEARING_REF, 23, 2), new ExifTag(TAG_GPS_DEST_BEARING, 24, 5), new ExifTag(TAG_GPS_DEST_DISTANCE_REF, 25, 2), new ExifTag(TAG_GPS_DEST_DISTANCE, 26, 5), new ExifTag(TAG_GPS_PROCESSING_METHOD, 27, 7), new ExifTag(TAG_GPS_AREA_INFORMATION, 28, 7), new ExifTag(TAG_GPS_DATESTAMP, 29, 2), new ExifTag(TAG_GPS_DIFFERENTIAL, 30, 3), new ExifTag(TAG_GPS_H_POSITIONING_ERROR, 31, 5)};
        IFD_GPS_TAGS = exifTagArr3;
        ExifTag[] exifTagArr4 = {new ExifTag(TAG_INTEROPERABILITY_INDEX, 1, 2)};
        IFD_INTEROPERABILITY_TAGS = exifTagArr4;
        ExifTag[] exifTagArr5 = {new ExifTag(TAG_NEW_SUBFILE_TYPE, 254, 4), new ExifTag(TAG_SUBFILE_TYPE, 255, 4), new ExifTag(TAG_THUMBNAIL_IMAGE_WIDTH, 256, 3, 4), new ExifTag(TAG_THUMBNAIL_IMAGE_LENGTH, 257, 3, 4), new ExifTag(TAG_BITS_PER_SAMPLE, 258, 3), new ExifTag(TAG_COMPRESSION, 259, 3), new ExifTag(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new ExifTag(TAG_IMAGE_DESCRIPTION, 270, 2), new ExifTag(TAG_MAKE, 271, 2), new ExifTag(TAG_MODEL, 272, 2), new ExifTag(TAG_STRIP_OFFSETS, BaseQuickAdapter.HEADER_VIEW, 3, 4), new ExifTag("ThumbnailOrientation", 274, 3), new ExifTag(TAG_SAMPLES_PER_PIXEL, 277, 3), new ExifTag(TAG_ROWS_PER_STRIP, 278, 3, 4), new ExifTag(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new ExifTag(TAG_X_RESOLUTION, 282, 5), new ExifTag(TAG_Y_RESOLUTION, 283, 5), new ExifTag(TAG_PLANAR_CONFIGURATION, 284, 3), new ExifTag(TAG_RESOLUTION_UNIT, 296, 3), new ExifTag(TAG_TRANSFER_FUNCTION, 301, 3), new ExifTag(TAG_SOFTWARE, 305, 2), new ExifTag(TAG_DATETIME, 306, 2), new ExifTag(TAG_ARTIST, 315, 2), new ExifTag(TAG_WHITE_POINT, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 5), new ExifTag(TAG_PRIMARY_CHROMATICITIES, MobileEvents.EVENTTYPE_PERFORMANCE, 5), new ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT, InputDeviceCompat.SOURCE_DPAD, 4), new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new ExifTag(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new ExifTag(TAG_Y_CB_CR_SUB_SAMPLING, C33556b3.f69031d, 3), new ExifTag(TAG_Y_CB_CR_POSITIONING, 531, 3), new ExifTag(TAG_REFERENCE_BLACK_WHITE, 532, 5), new ExifTag(TAG_COPYRIGHT, 33432, 2), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new ExifTag(TAG_DNG_VERSION, 50706, 1), new ExifTag(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        IFD_THUMBNAIL_TAGS = exifTagArr5;
        TAG_RAF_IMAGE_SIZE = new ExifTag(TAG_STRIP_OFFSETS, BaseQuickAdapter.HEADER_VIEW, 3);
        ExifTag[] exifTagArr6 = {new ExifTag(TAG_ORF_THUMBNAIL_IMAGE, 256, 7), new ExifTag(TAG_ORF_CAMERA_SETTINGS_IFD_POINTER, 8224, 4), new ExifTag(TAG_ORF_IMAGE_PROCESSING_IFD_POINTER, 8256, 4)};
        ORF_MAKER_NOTE_TAGS = exifTagArr6;
        ExifTag[] exifTagArr7 = {new ExifTag(TAG_ORF_PREVIEW_IMAGE_START, 257, 4), new ExifTag(TAG_ORF_PREVIEW_IMAGE_LENGTH, 258, 4)};
        ORF_CAMERA_SETTINGS_TAGS = exifTagArr7;
        ExifTag[] exifTagArr8 = {new ExifTag(TAG_ORF_ASPECT_FRAME, 4371, 3)};
        ORF_IMAGE_PROCESSING_TAGS = exifTagArr8;
        ExifTag[] exifTagArr9 = {new ExifTag(TAG_COLOR_SPACE, 55, 3)};
        PEF_TAGS = exifTagArr9;
        ExifTag[][] exifTagArr10 = {exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr, exifTagArr6, exifTagArr7, exifTagArr8, exifTagArr9};
        EXIF_TAGS = exifTagArr10;
        EXIF_POINTER_TAGS = new ExifTag[]{new ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new ExifTag(TAG_ORF_CAMERA_SETTINGS_IFD_POINTER, 8224, 1), new ExifTag(TAG_ORF_IMAGE_PROCESSING_IFD_POINTER, 8256, 1)};
        sExifTagMapsForReading = new HashMap[exifTagArr10.length];
        sExifTagMapsForWriting = new HashMap[exifTagArr10.length];
        RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY = Collections.unmodifiableSet(new HashSet(Arrays.asList(TAG_F_NUMBER, TAG_DIGITAL_ZOOM_RATIO, TAG_EXPOSURE_TIME, TAG_SUBJECT_DISTANCE)));
        sExifPointerTagMap = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        ASCII = charsetForName;
        IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(charsetForName);
        IDENTIFIER_XMP_APP1 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        sFormatterPrimary = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        sFormatterSecondary = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i11 = 0;
        while (true) {
            ExifTag[][] exifTagArr11 = EXIF_TAGS;
            if (i11 >= exifTagArr11.length) {
                HashMap<Integer, Integer> map = sExifPointerTagMap;
                ExifTag[] exifTagArr12 = EXIF_POINTER_TAGS;
                map.put(Integer.valueOf(exifTagArr12[0].number), 5);
                map.put(Integer.valueOf(exifTagArr12[1].number), 1);
                map.put(Integer.valueOf(exifTagArr12[2].number), 2);
                map.put(Integer.valueOf(exifTagArr12[3].number), 3);
                map.put(Integer.valueOf(exifTagArr12[4].number), 7);
                map.put(Integer.valueOf(exifTagArr12[5].number), 8);
                NON_ZERO_TIME_PATTERN = Pattern.compile(".*[1-9].*");
                GPS_TIMESTAMP_PATTERN = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                DATETIME_PRIMARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                DATETIME_SECONDARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            sExifTagMapsForReading[i11] = new HashMap<>();
            sExifTagMapsForWriting[i11] = new HashMap<>();
            for (ExifTag exifTag : exifTagArr11[i11]) {
                sExifTagMapsForReading[i11].put(Integer.valueOf(exifTag.number), exifTag);
                sExifTagMapsForWriting[i11].put(exifTag.name, exifTag);
            }
            i11++;
        }
    }

    public ExifInterface(File file) throws Throwable {
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        initForFilename(file.getAbsolutePath());
    }

    private String convertDecimalDegree(double d11) {
        long j11 = (long) d11;
        double d12 = d11 - j11;
        long j12 = (long) (d12 * 60.0d);
        return j11 + "/1," + j12 + "/1," + Math.round((d12 - (j12 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    private void copyChunksUpToGivenChunkType(ByteOrderedDataInputStream byteOrderedDataInputStream, ByteOrderedDataOutputStream byteOrderedDataOutputStream, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            byteOrderedDataInputStream.readFully(bArr3);
            copyWebPChunk(byteOrderedDataInputStream, byteOrderedDataOutputStream, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private static int getXmpHandlingForImageType(int i11) {
        if (i11 != 4) {
            return (i11 == 9 || i11 == 15 || i11 == 12 || i11 == 13) ? 2 : 1;
        }
        return 3;
    }

    private int isHeicOrAvifFormat(byte[] bArr) throws Throwable {
        long j11;
        ByteOrderedDataInputStream byteOrderedDataInputStream = null;
        try {
            try {
                ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr);
                try {
                    long length = byteOrderedDataInputStream2.readInt();
                    byte[] bArr2 = new byte[4];
                    byteOrderedDataInputStream2.readFully(bArr2);
                    if (!Arrays.equals(bArr2, HEIF_TYPE_FTYP)) {
                        byteOrderedDataInputStream2.close();
                        return 0;
                    }
                    if (length == 1) {
                        length = byteOrderedDataInputStream2.readLong();
                        j11 = 16;
                        if (length < 16) {
                            byteOrderedDataInputStream2.close();
                            return 0;
                        }
                    } else {
                        j11 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j12 = length - j11;
                    if (j12 < 8) {
                        byteOrderedDataInputStream2.close();
                        return 0;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z11 = false;
                    boolean z12 = false;
                    boolean z13 = false;
                    for (long j13 = 0; j13 < j12 / 4; j13++) {
                        try {
                            byteOrderedDataInputStream2.readFully(bArr3);
                            if (j13 != 1) {
                                if (Arrays.equals(bArr3, HEIF_BRAND_MIF1)) {
                                    z11 = true;
                                } else if (Arrays.equals(bArr3, HEIF_BRAND_HEIC)) {
                                    z12 = true;
                                } else if (Arrays.equals(bArr3, HEIF_BRAND_AVIF) || Arrays.equals(bArr3, HEIF_BRAND_AVIS)) {
                                    z13 = true;
                                }
                                if (!z11) {
                                    continue;
                                } else {
                                    if (z12) {
                                        byteOrderedDataInputStream2.close();
                                        return 12;
                                    }
                                    if (z13) {
                                        byteOrderedDataInputStream2.close();
                                        return 15;
                                    }
                                }
                            }
                        } catch (EOFException unused) {
                            byteOrderedDataInputStream2.close();
                            return 0;
                        }
                    }
                    byteOrderedDataInputStream2.close();
                } catch (Exception e11) {
                    e = e11;
                    byteOrderedDataInputStream = byteOrderedDataInputStream2;
                    if (DEBUG) {
                        Log.d(TAG, "Exception parsing HEIF file type box.", e);
                    }
                    if (byteOrderedDataInputStream != null) {
                        byteOrderedDataInputStream.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteOrderedDataInputStream = byteOrderedDataInputStream2;
                    if (byteOrderedDataInputStream != null) {
                        byteOrderedDataInputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean isJpegFormat(byte[] bArr) throws IOException {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = JPEG_SIGNATURE;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    private boolean isOrfFormat(byte[] bArr) throws Throwable {
        ByteOrderedDataInputStream byteOrderedDataInputStream = null;
        try {
            ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr);
            try {
                ByteOrder byteOrder = readByteOrder(byteOrderedDataInputStream2);
                this.mExifByteOrder = byteOrder;
                byteOrderedDataInputStream2.setByteOrder(byteOrder);
                short s11 = byteOrderedDataInputStream2.readShort();
                boolean z11 = s11 == 20306 || s11 == 21330;
                byteOrderedDataInputStream2.close();
                return z11;
            } catch (Exception unused) {
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean isPngFormat(byte[] bArr) throws IOException {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = PNG_SIGNATURE;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    private boolean isRw2Format(byte[] bArr) throws Throwable {
        ByteOrderedDataInputStream byteOrderedDataInputStream = null;
        try {
            ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr);
            try {
                ByteOrder byteOrder = readByteOrder(byteOrderedDataInputStream2);
                this.mExifByteOrder = byteOrder;
                byteOrderedDataInputStream2.setByteOrder(byteOrder);
                boolean z11 = byteOrderedDataInputStream2.readShort() == 85;
                byteOrderedDataInputStream2.close();
                return z11;
            } catch (Exception unused) {
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean isSupportedFormatForSavingAttributes(int i11) {
        return i11 == 4 || i11 == 13 || i11 == 14;
    }

    public static boolean isSupportedMimeType(String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase) {
            case "image/x-fuji-raf":
            case "image/x-samsung-srw":
            case "image/x-sony-arw":
            case "image/heic":
            case "image/heif":
            case "image/jpeg":
            case "image/webp":
            case "image/x-adobe-dng":
            case "image/x-panasonic-rw2":
            case "image/png":
            case "image/x-pentax-pef":
            case "image/x-olympus-orf":
            case "image/x-nikon-nef":
            case "image/x-nikon-nrw":
            case "image/x-canon-cr2":
                return true;
            default:
                return false;
        }
    }

    private boolean isWebpFormat(byte[] bArr) throws IOException {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = WEBP_SIGNATURE_1;
            if (i11 >= bArr2.length) {
                int i12 = 0;
                while (true) {
                    byte[] bArr3 = WEBP_SIGNATURE_2;
                    if (i12 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[WEBP_SIGNATURE_1.length + i12 + 4] != bArr3[i12]) {
                        return false;
                    }
                    i12++;
                }
            } else {
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00af A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #2 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x0007, B:12:0x001c, B:14:0x0020, B:15:0x002e, B:17:0x0036, B:19:0x003f, B:38:0x0071, B:25:0x0050, B:32:0x005e, B:35:0x0066, B:36:0x006a, B:37:0x006e, B:39:0x007b, B:41:0x0085, B:44:0x008d, B:47:0x0095, B:50:0x009d, B:55:0x00ab, B:57:0x00af), top: B:66:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    private void loadAttributes(InputStream inputStream) {
        boolean z11;
        for (int i11 = 0; i11 < EXIF_TAGS.length; i11++) {
            try {
                try {
                    this.mAttributes[i11] = new HashMap<>();
                } catch (Throwable th2) {
                    addDefaultValuesForCompatibility();
                    if (DEBUG) {
                        printAttributes();
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                e = e11;
                z11 = DEBUG;
                if (z11) {
                    Log.w(TAG, "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                addDefaultValuesForCompatibility();
                if (z11) {
                    printAttributes();
                    return;
                }
                return;
            } catch (UnsupportedOperationException e12) {
                e = e12;
                z11 = DEBUG;
                if (z11) {
                    Log.w(TAG, "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                addDefaultValuesForCompatibility();
                if (z11) {
                    printAttributes();
                    return;
                }
                return;
            }
        }
        if (!this.mIsExifDataOnly) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.mMimeType = getMimeType(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (shouldSupportSeek(this.mMimeType)) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(inputStream);
            if (!this.mIsExifDataOnly) {
                int i12 = this.mMimeType;
                if (i12 == 12 || i12 == 15) {
                    getHeifAttributes(seekableByteOrderedDataInputStream, i12);
                } else if (i12 == 7) {
                    getOrfAttributes(seekableByteOrderedDataInputStream);
                } else if (i12 == 10) {
                    getRw2Attributes(seekableByteOrderedDataInputStream);
                } else {
                    getRawAttributes(seekableByteOrderedDataInputStream);
                }
            } else if (!getStandaloneAttributes(seekableByteOrderedDataInputStream)) {
                addDefaultValuesForCompatibility();
                if (DEBUG) {
                    printAttributes();
                    return;
                }
                return;
            }
            seekableByteOrderedDataInputStream.seek(this.mOffsetToExifData);
            setThumbnailData(seekableByteOrderedDataInputStream);
        } else {
            ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(inputStream);
            int i13 = this.mMimeType;
            if (i13 == 4) {
                getJpegAttributes(byteOrderedDataInputStream, 0, 0);
            } else if (i13 == 13) {
                getPngAttributes(byteOrderedDataInputStream);
            } else if (i13 == 9) {
                getRafAttributes(byteOrderedDataInputStream);
            } else if (i13 == 14) {
                getWebpAttributes(byteOrderedDataInputStream);
            }
        }
        addDefaultValuesForCompatibility();
        if (DEBUG) {
            printAttributes();
        }
    }

    private static Long parseDateTime(String str, String str2, String str3) {
        if (str != null && NON_ZERO_TIME_PATTERN.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = sFormatterPrimary.parse(str, parsePosition);
                if (date == null && (date = sFormatterSecondary.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    int i11 = 1;
                    String strSubstring = str3.substring(0, 1);
                    int i12 = Integer.parseInt(str3.substring(1, 3));
                    int i13 = Integer.parseInt(str3.substring(4, 6));
                    if (("+".equals(strSubstring) || C33820nf.f71144W.equals(strSubstring)) && C33844oi.f71346o.equals(str3.substring(3, 4)) && i12 <= 14) {
                        int i14 = ((i12 * 60) + i13) * 60000;
                        if (!C33820nf.f71144W.equals(strSubstring)) {
                            i11 = -1;
                        }
                        time += (long) (i14 * i11);
                    }
                }
                if (str2 != null) {
                    time += ExifInterfaceUtils.parseSubSeconds(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    private void printAttributes() {
        for (int i11 = 0; i11 < this.mAttributes.length; i11++) {
            Log.d(TAG, "The size of tag group[" + i11 + "]: " + this.mAttributes[i11].size());
            for (Map.Entry<String, ExifAttribute> entry : this.mAttributes[i11].entrySet()) {
                ExifAttribute value = entry.getValue();
                Log.d(TAG, "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.getStringValue(this.mExifByteOrder) + "'");
            }
        }
    }

    private void removeAttribute(String str) {
        for (int i11 = 0; i11 < EXIF_TAGS.length; i11++) {
            this.mAttributes[i11].remove(str);
        }
    }

    private static boolean shouldSupportSeek(int i11) {
        return (i11 == 4 || i11 == 9 || i11 == 13 || i11 == 14) ? false : true;
    }

    private void validateImages() throws Throwable {
        swapBasedOnImageSize(0, 5);
        swapBasedOnImageSize(0, 4);
        swapBasedOnImageSize(5, 4);
        ExifAttribute exifAttribute = this.mAttributes[1].get(TAG_PIXEL_X_DIMENSION);
        ExifAttribute exifAttribute2 = this.mAttributes[1].get(TAG_PIXEL_Y_DIMENSION);
        if (exifAttribute != null && exifAttribute2 != null) {
            this.mAttributes[0].put(TAG_IMAGE_WIDTH, exifAttribute);
            this.mAttributes[0].put(TAG_IMAGE_LENGTH, exifAttribute2);
        }
        if (this.mAttributes[4].isEmpty() && isThumbnail(this.mAttributes[5])) {
            HashMap<String, ExifAttribute>[] mapArr = this.mAttributes;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!isThumbnail(this.mAttributes[4])) {
            Log.d(TAG, "No image meets the size requirements of a thumbnail image.");
        }
        replaceInvalidTags(0, "ThumbnailOrientation", TAG_ORIENTATION);
        replaceInvalidTags(0, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        replaceInvalidTags(0, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        replaceInvalidTags(5, "ThumbnailOrientation", TAG_ORIENTATION);
        replaceInvalidTags(5, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        replaceInvalidTags(5, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        replaceInvalidTags(4, TAG_ORIENTATION, "ThumbnailOrientation");
        replaceInvalidTags(4, TAG_IMAGE_LENGTH, TAG_THUMBNAIL_IMAGE_LENGTH);
        replaceInvalidTags(4, TAG_IMAGE_WIDTH, TAG_THUMBNAIL_IMAGE_WIDTH);
    }

    @Deprecated
    public boolean getLatLong(float[] fArr) {
        double[] latLong = getLatLong();
        if (latLong == null) {
            return false;
        }
        fArr[0] = (float) latLong[0];
        fArr[1] = (float) latLong[1];
        return true;
    }

    public void resetOrientation() {
        setAttribute(TAG_ORIENTATION, Integer.toString(1));
    }

    private void addDefaultValuesForCompatibility() {
        String attribute = getAttribute(TAG_DATETIME_ORIGINAL);
        if (attribute != null && getAttribute(TAG_DATETIME) == null) {
            this.mAttributes[0].put(TAG_DATETIME, ExifAttribute.createString(attribute));
        }
        if (getAttribute(TAG_IMAGE_WIDTH) == null) {
            this.mAttributes[0].put(TAG_IMAGE_WIDTH, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (getAttribute(TAG_IMAGE_LENGTH) == null) {
            this.mAttributes[0].put(TAG_IMAGE_LENGTH, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (getAttribute(TAG_ORIENTATION) == null) {
            this.mAttributes[0].put(TAG_ORIENTATION, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (getAttribute(TAG_LIGHT_SOURCE) == null) {
            this.mAttributes[1].put(TAG_LIGHT_SOURCE, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
    }

    private static double convertRationalLatLonToDouble(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d11 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d12 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d13 = d11 + (d12 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals(LATITUDE_SOUTH) && !str2.equals(LONGITUDE_WEST)) {
                if (!str2.equals("N") && !str2.equals(LONGITUDE_EAST)) {
                    throw new IllegalArgumentException();
                }
                return d13;
            }
            return -d13;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    private ExifAttribute getExifAttribute(String str) {
        ExifAttribute exifAttribute;
        ExifAttribute exifAttribute2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str)) {
            if (DEBUG) {
                Log.d(TAG, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        if (TAG_XMP.equals(str) && getXmpHandlingForImageType(this.mMimeType) == 2 && (exifAttribute2 = this.mXmpFromSeparateMarker) != null) {
            return exifAttribute2;
        }
        for (int i11 = 0; i11 < EXIF_TAGS.length; i11++) {
            ExifAttribute exifAttribute3 = this.mAttributes[i11].get(str);
            if (exifAttribute3 != null) {
                return exifAttribute3;
            }
        }
        if (!TAG_XMP.equals(str) || (exifAttribute = this.mXmpFromSeparateMarker) == null) {
            return null;
        }
        return exifAttribute;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:57:0x015c A[LOOP:0: B:10:0x0037->B:57:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00ae. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00b1. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void getJpegAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getJpegAttributes(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, int, int):void");
    }

    private int getMimeType(BufferedInputStream bufferedInputStream) throws Throwable {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (isJpegFormat(bArr)) {
            return 4;
        }
        if (isRafFormat(bArr)) {
            return 9;
        }
        int iIsHeicOrAvifFormat = isHeicOrAvifFormat(bArr);
        if (iIsHeicOrAvifFormat != 0) {
            return iIsHeicOrAvifFormat;
        }
        if (isOrfFormat(bArr)) {
            return 7;
        }
        if (isRw2Format(bArr)) {
            return 10;
        }
        if (isPngFormat(bArr)) {
            return 13;
        }
        return isWebpFormat(bArr) ? 14 : 0;
    }

    private void getPngAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        if (DEBUG) {
            Log.d(TAG, "getPngAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
        int iPosition = byteOrderedDataInputStream.position();
        byteOrderedDataInputStream.skipFully(PNG_SIGNATURE.length);
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            if (z11 && z12) {
                break;
            }
            try {
                int i11 = byteOrderedDataInputStream.readInt();
                int i12 = byteOrderedDataInputStream.readInt();
                int iPosition2 = byteOrderedDataInputStream.position() + i11 + 4;
                if (byteOrderedDataInputStream.position() - iPosition == 16 && i12 != PNG_CHUNK_TYPE_IHDR) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i12 == PNG_CHUNK_TYPE_IEND) {
                    break;
                }
                if (i12 == PNG_CHUNK_TYPE_EXIF && !z11) {
                    this.mOffsetToExifData = byteOrderedDataInputStream.position() - iPosition;
                    byte[] bArr = new byte[i11];
                    byteOrderedDataInputStream.readFully(bArr);
                    int i13 = byteOrderedDataInputStream.readInt();
                    CRC32 crc32 = new CRC32();
                    updateCrcWithInt(crc32, i12);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i13) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i13 + ", calculated CRC value: " + crc32.getValue());
                    }
                    readExifSegment(bArr, 0);
                    validateImages();
                    setThumbnailData(new ByteOrderedDataInputStream(bArr));
                    z11 = true;
                } else if (i12 == PNG_CHUNK_TYPE_ITXT && !z12) {
                    byte[] bArr2 = PNG_ITXT_XMP_KEYWORD;
                    if (i11 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        byteOrderedDataInputStream.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int iPosition3 = byteOrderedDataInputStream.position() - iPosition;
                            int i14 = i11 - length;
                            byte[] bArr4 = new byte[i14];
                            byteOrderedDataInputStream.readFully(bArr4);
                            this.mXmpFromSeparateMarker = new ExifAttribute(1, i14, iPosition3, bArr4);
                            z12 = true;
                        }
                    }
                }
                byteOrderedDataInputStream.skipFully(iPosition2 - byteOrderedDataInputStream.position());
            } catch (EOFException e11) {
                throw new IOException("Encountered corrupt PNG file.", e11);
            }
        }
        this.mFileOnDiskContainsSeparateXmpMarker = z12;
    }

    private void getRafAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        boolean z11 = DEBUG;
        if (z11) {
            Log.d(TAG, "getRafAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.skipFully(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        byteOrderedDataInputStream.readFully(bArr);
        byteOrderedDataInputStream.readFully(bArr2);
        byteOrderedDataInputStream.readFully(bArr3);
        int i11 = ByteBuffer.wrap(bArr).getInt();
        int i12 = ByteBuffer.wrap(bArr2).getInt();
        int i13 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i12];
        byteOrderedDataInputStream.skipFully(i11 - byteOrderedDataInputStream.position());
        byteOrderedDataInputStream.readFully(bArr4);
        getJpegAttributes(new ByteOrderedDataInputStream(bArr4), i11, 5);
        byteOrderedDataInputStream.skipFully(i13 - byteOrderedDataInputStream.position());
        byteOrderedDataInputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
        int i14 = byteOrderedDataInputStream.readInt();
        if (z11) {
            Log.d(TAG, "numberOfDirectoryEntry: " + i14);
        }
        for (int i15 = 0; i15 < i14; i15++) {
            int unsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int unsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (unsignedShort == TAG_RAF_IMAGE_SIZE.number) {
                short s11 = byteOrderedDataInputStream.readShort();
                short s12 = byteOrderedDataInputStream.readShort();
                ExifAttribute exifAttributeCreateUShort = ExifAttribute.createUShort(s11, this.mExifByteOrder);
                ExifAttribute exifAttributeCreateUShort2 = ExifAttribute.createUShort(s12, this.mExifByteOrder);
                this.mAttributes[0].put(TAG_IMAGE_LENGTH, exifAttributeCreateUShort);
                this.mAttributes[0].put(TAG_IMAGE_WIDTH, exifAttributeCreateUShort2);
                if (DEBUG) {
                    Log.d(TAG, "Updated to length: " + ((int) s11) + ", width: " + ((int) s12));
                    return;
                }
                return;
            }
            byteOrderedDataInputStream.skipFully(unsignedShort2);
        }
    }

    private void getRw2Attributes(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        if (DEBUG) {
            Log.d(TAG, "getRw2Attributes starting with: " + seekableByteOrderedDataInputStream);
        }
        getRawAttributes(seekableByteOrderedDataInputStream);
        ExifAttribute exifAttribute = this.mAttributes[0].get(TAG_RW2_JPG_FROM_RAW);
        if (exifAttribute != null) {
            getJpegAttributes(new ByteOrderedDataInputStream(exifAttribute.bytes), (int) exifAttribute.bytesOffset, 5);
        }
        ExifAttribute exifAttribute2 = this.mAttributes[0].get(TAG_RW2_ISO);
        ExifAttribute exifAttribute3 = this.mAttributes[1].get(TAG_PHOTOGRAPHIC_SENSITIVITY);
        if (exifAttribute2 == null || exifAttribute3 != null) {
            return;
        }
        this.mAttributes[1].put(TAG_PHOTOGRAPHIC_SENSITIVITY, exifAttribute2);
    }

    private boolean getStandaloneAttributes(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        byte[] bArr = IDENTIFIER_EXIF_APP1;
        byte[] bArr2 = new byte[bArr.length];
        seekableByteOrderedDataInputStream.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w(TAG, "Given data is not EXIF-only.");
            return false;
        }
        byte[] toEnd = seekableByteOrderedDataInputStream.readToEnd();
        this.mOffsetToExifData = bArr.length;
        readExifSegment(toEnd, 0);
        return true;
    }

    private void getWebpAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        if (DEBUG) {
            Log.d(TAG, "getWebpAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.setByteOrder(ByteOrder.LITTLE_ENDIAN);
        byteOrderedDataInputStream.skipFully(WEBP_SIGNATURE_1.length);
        int i11 = byteOrderedDataInputStream.readInt() + 8;
        byte[] bArr = WEBP_SIGNATURE_2;
        byteOrderedDataInputStream.skipFully(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
                int i12 = byteOrderedDataInputStream.readInt();
                int i13 = length + 8;
                if (Arrays.equals(WEBP_CHUNK_TYPE_EXIF, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i12];
                    byteOrderedDataInputStream.readFully(bArrCopyOfRange);
                    byte[] bArr3 = IDENTIFIER_EXIF_APP1;
                    if (ExifInterfaceUtils.startsWith(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i12);
                    }
                    this.mOffsetToExifData = i13;
                    readExifSegment(bArrCopyOfRange, 0);
                    setThumbnailData(new ByteOrderedDataInputStream(bArrCopyOfRange));
                    return;
                }
                if (i12 % 2 == 1) {
                    i12++;
                }
                length = i13 + i12;
                if (length == i11) {
                    return;
                }
                if (length > i11) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                byteOrderedDataInputStream.skipFully(i12);
            } catch (EOFException e11) {
                throw new IOException("Encountered corrupt WebP file.", e11);
            }
        }
    }

    private static Pair<Integer, Integer> guessDataFormat(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairGuessDataFormat = guessDataFormat(strArrSplit[0]);
            if (((Integer) pairGuessDataFormat.first).intValue() == 2) {
                return pairGuessDataFormat;
            }
            for (int i11 = 1; i11 < strArrSplit.length; i11++) {
                Pair<Integer, Integer> pairGuessDataFormat2 = guessDataFormat(strArrSplit[i11]);
                int iIntValue = (((Integer) pairGuessDataFormat2.first).equals(pairGuessDataFormat.first) || ((Integer) pairGuessDataFormat2.second).equals(pairGuessDataFormat.first)) ? ((Integer) pairGuessDataFormat.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairGuessDataFormat.second).intValue() == -1 || !(((Integer) pairGuessDataFormat2.first).equals(pairGuessDataFormat.second) || ((Integer) pairGuessDataFormat2.second).equals(pairGuessDataFormat.second))) ? -1 : ((Integer) pairGuessDataFormat.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairGuessDataFormat = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairGuessDataFormat = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairGuessDataFormat;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j11 = Long.parseLong(str);
                    if (j11 < 0 || j11 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return j11 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                    }
                    return new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j12 = (long) Double.parseDouble(strArrSplit2[0]);
                long j13 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j12 >= 0 && j13 >= 0) {
                    if (j12 <= 2147483647L && j13 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private void handleThumbnailFromJfif(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap<String, ExifAttribute> map) throws Throwable {
        ExifAttribute exifAttribute = map.get(TAG_JPEG_INTERCHANGE_FORMAT);
        ExifAttribute exifAttribute2 = map.get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
        int intValue2 = exifAttribute2.getIntValue(this.mExifByteOrder);
        if (this.mMimeType == 7) {
            intValue += this.mOrfMakerNoteOffset;
        }
        if (intValue > 0 && intValue2 > 0) {
            this.mHasThumbnail = true;
            if (this.mFilename == null && this.mAssetInputStream == null && this.mSeekableFileDescriptor == null) {
                byte[] bArr = new byte[intValue2];
                byteOrderedDataInputStream.skipFully(intValue);
                byteOrderedDataInputStream.readFully(bArr);
                this.mThumbnailBytes = bArr;
            }
            this.mThumbnailOffset = intValue;
            this.mThumbnailLength = intValue2;
        }
        if (DEBUG) {
            Log.d(TAG, "Setting thumbnail attributes with offset: " + intValue + ", length: " + intValue2);
        }
    }

    private void handleThumbnailFromStrips(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap<String, ExifAttribute> map) throws IOException {
        int i11;
        ExifAttribute exifAttribute = map.get(TAG_STRIP_OFFSETS);
        ExifAttribute exifAttribute2 = map.get(TAG_STRIP_BYTE_COUNTS);
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        long[] jArrConvertToLongArray = ExifInterfaceUtils.convertToLongArray(exifAttribute.getValue(this.mExifByteOrder));
        long[] jArrConvertToLongArray2 = ExifInterfaceUtils.convertToLongArray(exifAttribute2.getValue(this.mExifByteOrder));
        if (jArrConvertToLongArray == null || jArrConvertToLongArray.length == 0) {
            Log.w(TAG, "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrConvertToLongArray2 == null || jArrConvertToLongArray2.length == 0) {
            Log.w(TAG, "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrConvertToLongArray.length != jArrConvertToLongArray2.length) {
            Log.w(TAG, "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j11 = 0;
        for (long j12 : jArrConvertToLongArray2) {
            j11 += j12;
        }
        int i12 = (int) j11;
        byte[] bArr = new byte[i12];
        int i13 = 1;
        this.mAreThumbnailStripsConsecutive = true;
        this.mHasThumbnailStrips = true;
        this.mHasThumbnail = true;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < jArrConvertToLongArray.length) {
            int i17 = (int) jArrConvertToLongArray[i14];
            int i18 = (int) jArrConvertToLongArray2[i14];
            if (i14 < jArrConvertToLongArray.length - i13) {
                i11 = i14;
                if (i17 + i18 != jArrConvertToLongArray[i11 + 1]) {
                    this.mAreThumbnailStripsConsecutive = false;
                }
            } else {
                i11 = i14;
            }
            int i19 = i17 - i15;
            if (i19 < 0) {
                Log.d(TAG, "Invalid strip offset value");
                return;
            }
            try {
                byteOrderedDataInputStream.skipFully(i19);
                int i21 = i15 + i19;
                byte[] bArr2 = new byte[i18];
                try {
                    byteOrderedDataInputStream.readFully(bArr2);
                    i15 = i21 + i18;
                    System.arraycopy(bArr2, 0, bArr, i16, i18);
                    i16 += i18;
                    i14 = i11 + 1;
                    i13 = 1;
                } catch (EOFException unused) {
                    Log.d(TAG, "Failed to read " + i18 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d(TAG, "Failed to skip " + i19 + " bytes.");
                return;
            }
        }
        this.mThumbnailBytes = bArr;
        if (this.mAreThumbnailStripsConsecutive) {
            this.mThumbnailOffset = (int) jArrConvertToLongArray[0];
            this.mThumbnailLength = i12;
        }
    }

    private void initForFilename(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.mAssetInputStream = null;
        this.mFilename = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (isSeekableFD(fileInputStream2.getFD())) {
                    this.mSeekableFileDescriptor = fileInputStream2.getFD();
                } else {
                    this.mSeekableFileDescriptor = null;
                }
                loadAttributes(fileInputStream2);
                ExifInterfaceUtils.closeQuietly(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                ExifInterfaceUtils.closeQuietly(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean isRafFormat(byte[] bArr) throws IOException {
        byte[] bytes = RAF_SIGNATURE.getBytes(Charset.defaultCharset());
        for (int i11 = 0; i11 < bytes.length; i11++) {
            if (bArr[i11] != bytes[i11]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSeekableFD(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!DEBUG) {
                return false;
            }
            Log.d(TAG, "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean isSupportedDataType(HashMap<String, ExifAttribute> map) {
        ExifAttribute exifAttribute;
        int intValue;
        ExifAttribute exifAttribute2 = map.get(TAG_BITS_PER_SAMPLE);
        if (exifAttribute2 != null) {
            int[] iArr = (int[]) exifAttribute2.getValue(this.mExifByteOrder);
            int[] iArr2 = BITS_PER_SAMPLE_RGB;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.mMimeType == 3 && (exifAttribute = map.get(TAG_PHOTOMETRIC_INTERPRETATION)) != null && (((intValue = exifAttribute.getIntValue(this.mExifByteOrder)) == 1 && Arrays.equals(iArr, BITS_PER_SAMPLE_GREYSCALE_2)) || (intValue == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!DEBUG) {
            return false;
        }
        Log.d(TAG, "Unsupported data type value");
        return false;
    }

    private boolean isThumbnail(HashMap<String, ExifAttribute> map) {
        ExifAttribute exifAttribute = map.get(TAG_IMAGE_LENGTH);
        ExifAttribute exifAttribute2 = map.get(TAG_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.getIntValue(this.mExifByteOrder) <= 512 && exifAttribute2.getIntValue(this.mExifByteOrder) <= 512;
    }

    private void readExifSegment(byte[] bArr, int i11) throws IOException {
        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(bArr);
        parseTiffHeaders(seekableByteOrderedDataInputStream);
        readImageFileDirectory(seekableByteOrderedDataInputStream, i11);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:109:0x0300  */
    /* JADX WARN: Code duplicated, block: B:111:0x030a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0336  */
    /* JADX WARN: Code duplicated, block: B:147:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:0x0138  */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x015d  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0172  */
    /* JADX WARN: Code duplicated, block: B:60:0x0175  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0200  */
    /* JADX WARN: Code duplicated, block: B:74:0x0204 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0206  */
    /* JADX WARN: Code duplicated, block: B:77:0x020a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0217  */
    /* JADX WARN: Code duplicated, block: B:83:0x021c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0221  */
    /* JADX WARN: Code duplicated, block: B:86:0x0228  */
    /* JADX WARN: Code duplicated, block: B:89:0x0242  */
    /* JADX WARN: Code duplicated, block: B:98:0x028b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x028d  */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x02a4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0144, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x01dd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:99:0x028d, please report this as an issue */
    private void readImageFileDirectory(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i11) throws IOException {
        int i12;
        ExifTag exifTag;
        long j11;
        boolean z11;
        boolean z12;
        ExifTag exifTag2;
        Integer num;
        int unsignedShort;
        long unsignedInt;
        String str;
        int i13;
        this.mAttributesOffsets.add(Integer.valueOf(seekableByteOrderedDataInputStream.position()));
        short s11 = seekableByteOrderedDataInputStream.readShort();
        if (DEBUG) {
            Log.d(TAG, "numberOfDirectoryEntry: " + ((int) s11));
        }
        if (s11 <= 0) {
            return;
        }
        short s12 = 0;
        while (s12 < s11) {
            int unsignedShort2 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int unsignedShort3 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int i14 = seekableByteOrderedDataInputStream.readInt();
            long jPosition = ((long) seekableByteOrderedDataInputStream.position()) + 4;
            ExifTag exifTag3 = sExifTagMapsForReading[i11].get(Integer.valueOf(unsignedShort2));
            boolean z13 = DEBUG;
            if (z13) {
                i12 = 4;
                Log.d(TAG, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i11), Integer.valueOf(unsignedShort2), exifTag3 != null ? exifTag3.name : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i14)));
            } else {
                i12 = 4;
            }
            if (exifTag3 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = IFD_FORMAT_BYTES_PER_FORMAT;
                    if (unsignedShort3 < iArr.length) {
                        if (exifTag3.isFormatCompatible(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = exifTag3.primaryFormat;
                            }
                            exifTag = exifTag3;
                            j11 = ((long) i14) * ((long) iArr[unsignedShort3]);
                            if (j11 < 0 || j11 > 2147483647L) {
                                if (z13) {
                                    Log.d(TAG, "Skip the tag entry since the number of components is invalid: " + i14);
                                }
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                        } else if (z13) {
                            Log.d(TAG, "Skip the tag entry since data format (" + IFD_FORMAT_NAMES[unsignedShort3] + ") is unexpected for tag: " + exifTag3.name);
                        }
                    }
                    if (z11) {
                        if (j11 > 4) {
                            i13 = seekableByteOrderedDataInputStream.readInt();
                            if (z13) {
                                Log.d(TAG, "seek to data offset: " + i13);
                            }
                            if (this.mMimeType == 7) {
                                exifTag2 = exifTag;
                                z12 = z13;
                                if (TAG_MAKER_NOTE.equals(exifTag2.name)) {
                                    this.mOrfMakerNoteOffset = i13;
                                } else if (i11 != 6 && TAG_ORF_THUMBNAIL_IMAGE.equals(exifTag2.name)) {
                                    this.mOrfThumbnailOffset = i13;
                                    this.mOrfThumbnailLength = i14;
                                    ExifAttribute exifAttributeCreateUShort = ExifAttribute.createUShort(6, this.mExifByteOrder);
                                    ExifAttribute exifAttributeCreateULong = ExifAttribute.createULong(this.mOrfThumbnailOffset, this.mExifByteOrder);
                                    ExifAttribute exifAttributeCreateULong2 = ExifAttribute.createULong(this.mOrfThumbnailLength, this.mExifByteOrder);
                                    this.mAttributes[i12].put(TAG_COMPRESSION, exifAttributeCreateUShort);
                                    this.mAttributes[i12].put(TAG_JPEG_INTERCHANGE_FORMAT, exifAttributeCreateULong);
                                    this.mAttributes[i12].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, exifAttributeCreateULong2);
                                }
                            } else {
                                z12 = z13;
                                exifTag2 = exifTag;
                            }
                            seekableByteOrderedDataInputStream.seek(i13);
                        } else {
                            z12 = z13;
                            unsignedShort2 = unsignedShort2;
                            i14 = i14;
                            exifTag2 = exifTag;
                        }
                        num = sExifPointerTagMap.get(Integer.valueOf(unsignedShort2));
                        if (z12) {
                            Log.d(TAG, "nextIfdType: " + num + " byteCount: " + j11);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == i12) {
                                    unsignedInt = seekableByteOrderedDataInputStream.readUnsignedInt();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = seekableByteOrderedDataInputStream.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = seekableByteOrderedDataInputStream.readInt();
                                } else {
                                    unsignedInt = -1;
                                }
                                if (z12) {
                                    Log.d(TAG, String.format("Offset: %d, tagName: %s", Long.valueOf(unsignedInt), exifTag2.name));
                                }
                                if (unsignedInt > 0 || (seekableByteOrderedDataInputStream.length() != -1 && unsignedInt >= seekableByteOrderedDataInputStream.length())) {
                                    if (z12) {
                                        str = "Skip jump into the IFD since its offset is invalid: " + unsignedInt;
                                        if (seekableByteOrderedDataInputStream.length() != -1) {
                                            str = str + " (total length: " + seekableByteOrderedDataInputStream.length() + ")";
                                        }
                                        Log.d(TAG, str);
                                    }
                                } else if (!this.mAttributesOffsets.contains(Integer.valueOf((int) unsignedInt))) {
                                    seekableByteOrderedDataInputStream.seek(unsignedInt);
                                    readImageFileDirectory(seekableByteOrderedDataInputStream, num.intValue());
                                } else if (z12) {
                                    Log.d(TAG, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + unsignedInt + ")");
                                }
                                seekableByteOrderedDataInputStream.seek(jPosition);
                            } else {
                                unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                            }
                            unsignedInt = unsignedShort;
                            if (z12) {
                                Log.d(TAG, String.format("Offset: %d, tagName: %s", Long.valueOf(unsignedInt), exifTag2.name));
                            }
                            if (unsignedInt > 0) {
                                if (z12) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + unsignedInt;
                                    if (seekableByteOrderedDataInputStream.length() != -1) {
                                        str = str + " (total length: " + seekableByteOrderedDataInputStream.length() + ")";
                                    }
                                    Log.d(TAG, str);
                                }
                            } else if (z12) {
                                str = "Skip jump into the IFD since its offset is invalid: " + unsignedInt;
                                if (seekableByteOrderedDataInputStream.length() != -1) {
                                    str = str + " (total length: " + seekableByteOrderedDataInputStream.length() + ")";
                                }
                                Log.d(TAG, str);
                            }
                            seekableByteOrderedDataInputStream.seek(jPosition);
                        } else {
                            int iPosition = seekableByteOrderedDataInputStream.position() + this.mOffsetToExifData;
                            byte[] bArr = new byte[(int) j11];
                            seekableByteOrderedDataInputStream.readFully(bArr);
                            ExifAttribute exifAttribute = new ExifAttribute(unsignedShort3, i14, iPosition, bArr);
                            this.mAttributes[i11].put(exifTag2.name, exifAttribute);
                            if (TAG_DNG_VERSION.equals(exifTag2.name)) {
                                this.mMimeType = 3;
                            }
                            if (((!TAG_MAKE.equals(exifTag2.name) || TAG_MODEL.equals(exifTag2.name)) && exifAttribute.getStringValue(this.mExifByteOrder).contains(PEF_SIGNATURE)) || (TAG_COMPRESSION.equals(exifTag2.name) && exifAttribute.getIntValue(this.mExifByteOrder) == 65535)) {
                                this.mMimeType = 8;
                            }
                            if (seekableByteOrderedDataInputStream.position() != jPosition) {
                                seekableByteOrderedDataInputStream.seek(jPosition);
                            }
                        }
                    } else {
                        seekableByteOrderedDataInputStream.seek(jPosition);
                    }
                    s12 = (short) (s12 + 1);
                    s11 = s11;
                }
                exifTag = exifTag3;
                if (z13) {
                    Log.d(TAG, "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j11 = 0;
                z11 = false;
                if (z11) {
                    seekableByteOrderedDataInputStream.seek(jPosition);
                } else {
                    if (j11 > 4) {
                        i13 = seekableByteOrderedDataInputStream.readInt();
                        if (z13) {
                            Log.d(TAG, "seek to data offset: " + i13);
                        }
                        if (this.mMimeType == 7) {
                            exifTag2 = exifTag;
                            z12 = z13;
                            if (TAG_MAKER_NOTE.equals(exifTag2.name)) {
                                this.mOrfMakerNoteOffset = i13;
                            } else if (i11 != 6) {
                            }
                        } else {
                            z12 = z13;
                            exifTag2 = exifTag;
                        }
                        seekableByteOrderedDataInputStream.seek(i13);
                    } else {
                        z12 = z13;
                        unsignedShort2 = unsignedShort2;
                        i14 = i14;
                        exifTag2 = exifTag;
                    }
                    num = sExifPointerTagMap.get(Integer.valueOf(unsignedShort2));
                    if (z12) {
                        Log.d(TAG, "nextIfdType: " + num + " byteCount: " + j11);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == i12) {
                                unsignedInt = seekableByteOrderedDataInputStream.readUnsignedInt();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = seekableByteOrderedDataInputStream.readInt();
                            } else {
                                unsignedShort = seekableByteOrderedDataInputStream.readShort();
                            }
                            if (z12) {
                                Log.d(TAG, String.format("Offset: %d, tagName: %s", Long.valueOf(unsignedInt), exifTag2.name));
                            }
                            if (unsignedInt > 0) {
                                if (z12) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + unsignedInt;
                                    if (seekableByteOrderedDataInputStream.length() != -1) {
                                        str = str + " (total length: " + seekableByteOrderedDataInputStream.length() + ")";
                                    }
                                    Log.d(TAG, str);
                                }
                            } else if (z12) {
                                str = "Skip jump into the IFD since its offset is invalid: " + unsignedInt;
                                if (seekableByteOrderedDataInputStream.length() != -1) {
                                    str = str + " (total length: " + seekableByteOrderedDataInputStream.length() + ")";
                                }
                                Log.d(TAG, str);
                            }
                            seekableByteOrderedDataInputStream.seek(jPosition);
                        } else {
                            unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                        }
                        unsignedInt = unsignedShort;
                        if (z12) {
                            Log.d(TAG, String.format("Offset: %d, tagName: %s", Long.valueOf(unsignedInt), exifTag2.name));
                        }
                        if (unsignedInt > 0) {
                            if (z12) {
                                str = "Skip jump into the IFD since its offset is invalid: " + unsignedInt;
                                if (seekableByteOrderedDataInputStream.length() != -1) {
                                    str = str + " (total length: " + seekableByteOrderedDataInputStream.length() + ")";
                                }
                                Log.d(TAG, str);
                            }
                        } else if (z12) {
                            str = "Skip jump into the IFD since its offset is invalid: " + unsignedInt;
                            if (seekableByteOrderedDataInputStream.length() != -1) {
                                str = str + " (total length: " + seekableByteOrderedDataInputStream.length() + ")";
                            }
                            Log.d(TAG, str);
                        }
                        seekableByteOrderedDataInputStream.seek(jPosition);
                    } else {
                        int iPosition2 = seekableByteOrderedDataInputStream.position() + this.mOffsetToExifData;
                        byte[] bArr2 = new byte[(int) j11];
                        seekableByteOrderedDataInputStream.readFully(bArr2);
                        ExifAttribute exifAttribute2 = new ExifAttribute(unsignedShort3, i14, iPosition2, bArr2);
                        this.mAttributes[i11].put(exifTag2.name, exifAttribute2);
                        if (TAG_DNG_VERSION.equals(exifTag2.name)) {
                            this.mMimeType = 3;
                        }
                        if (!TAG_MAKE.equals(exifTag2.name)) {
                        }
                        this.mMimeType = 8;
                        if (seekableByteOrderedDataInputStream.position() != jPosition) {
                            seekableByteOrderedDataInputStream.seek(jPosition);
                        }
                    }
                }
                s12 = (short) (s12 + 1);
                s11 = s11;
            } else if (z13) {
                Log.d(TAG, "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            exifTag = exifTag3;
            j11 = 0;
            z11 = false;
            if (z11) {
                seekableByteOrderedDataInputStream.seek(jPosition);
            } else {
                if (j11 > 4) {
                    i13 = seekableByteOrderedDataInputStream.readInt();
                    if (z13) {
                        Log.d(TAG, "seek to data offset: " + i13);
                    }
                    if (this.mMimeType == 7) {
                        exifTag2 = exifTag;
                        z12 = z13;
                        if (TAG_MAKER_NOTE.equals(exifTag2.name)) {
                            this.mOrfMakerNoteOffset = i13;
                        } else if (i11 != 6) {
                        }
                    } else {
                        z12 = z13;
                        exifTag2 = exifTag;
                    }
                    seekableByteOrderedDataInputStream.seek(i13);
                } else {
                    z12 = z13;
                    unsignedShort2 = unsignedShort2;
                    i14 = i14;
                    exifTag2 = exifTag;
                }
                num = sExifPointerTagMap.get(Integer.valueOf(unsignedShort2));
                if (z12) {
                    Log.d(TAG, "nextIfdType: " + num + " byteCount: " + j11);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i12) {
                            unsignedInt = seekableByteOrderedDataInputStream.readUnsignedInt();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = seekableByteOrderedDataInputStream.readInt();
                        } else {
                            unsignedShort = seekableByteOrderedDataInputStream.readShort();
                        }
                        if (z12) {
                            Log.d(TAG, String.format("Offset: %d, tagName: %s", Long.valueOf(unsignedInt), exifTag2.name));
                        }
                        if (unsignedInt > 0) {
                            if (z12) {
                                str = "Skip jump into the IFD since its offset is invalid: " + unsignedInt;
                                if (seekableByteOrderedDataInputStream.length() != -1) {
                                    str = str + " (total length: " + seekableByteOrderedDataInputStream.length() + ")";
                                }
                                Log.d(TAG, str);
                            }
                        } else if (z12) {
                            str = "Skip jump into the IFD since its offset is invalid: " + unsignedInt;
                            if (seekableByteOrderedDataInputStream.length() != -1) {
                                str = str + " (total length: " + seekableByteOrderedDataInputStream.length() + ")";
                            }
                            Log.d(TAG, str);
                        }
                        seekableByteOrderedDataInputStream.seek(jPosition);
                    } else {
                        unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                    }
                    unsignedInt = unsignedShort;
                    if (z12) {
                        Log.d(TAG, String.format("Offset: %d, tagName: %s", Long.valueOf(unsignedInt), exifTag2.name));
                    }
                    if (unsignedInt > 0) {
                        if (z12) {
                            str = "Skip jump into the IFD since its offset is invalid: " + unsignedInt;
                            if (seekableByteOrderedDataInputStream.length() != -1) {
                                str = str + " (total length: " + seekableByteOrderedDataInputStream.length() + ")";
                            }
                            Log.d(TAG, str);
                        }
                    } else if (z12) {
                        str = "Skip jump into the IFD since its offset is invalid: " + unsignedInt;
                        if (seekableByteOrderedDataInputStream.length() != -1) {
                            str = str + " (total length: " + seekableByteOrderedDataInputStream.length() + ")";
                        }
                        Log.d(TAG, str);
                    }
                    seekableByteOrderedDataInputStream.seek(jPosition);
                } else {
                    int iPosition3 = seekableByteOrderedDataInputStream.position() + this.mOffsetToExifData;
                    byte[] bArr3 = new byte[(int) j11];
                    seekableByteOrderedDataInputStream.readFully(bArr3);
                    ExifAttribute exifAttribute3 = new ExifAttribute(unsignedShort3, i14, iPosition3, bArr3);
                    this.mAttributes[i11].put(exifTag2.name, exifAttribute3);
                    if (TAG_DNG_VERSION.equals(exifTag2.name)) {
                        this.mMimeType = 3;
                    }
                    if (!TAG_MAKE.equals(exifTag2.name)) {
                    }
                    this.mMimeType = 8;
                    if (seekableByteOrderedDataInputStream.position() != jPosition) {
                        seekableByteOrderedDataInputStream.seek(jPosition);
                    }
                }
            }
            s12 = (short) (s12 + 1);
            s11 = s11;
        }
        int i15 = seekableByteOrderedDataInputStream.readInt();
        boolean z14 = DEBUG;
        if (z14) {
            Log.d(TAG, String.format("nextIfdOffset: %d", Integer.valueOf(i15)));
        }
        long j12 = i15;
        if (j12 <= 0) {
            if (z14) {
                Log.d(TAG, "Stop reading file since a wrong offset may cause an infinite loop: " + i15);
                return;
            }
            return;
        }
        if (this.mAttributesOffsets.contains(Integer.valueOf(i15))) {
            if (z14) {
                Log.d(TAG, "Stop reading file since re-reading an IFD may cause an infinite loop: " + i15);
                return;
            }
            return;
        }
        seekableByteOrderedDataInputStream.seek(j12);
        if (this.mAttributes[4].isEmpty()) {
            readImageFileDirectory(seekableByteOrderedDataInputStream, 4);
        } else if (this.mAttributes[5].isEmpty()) {
            readImageFileDirectory(seekableByteOrderedDataInputStream, 5);
        }
    }

    private void replaceInvalidTags(int i11, String str, String str2) {
        if (this.mAttributes[i11].isEmpty() || this.mAttributes[i11].get(str) == null) {
            return;
        }
        HashMap<String, ExifAttribute> map = this.mAttributes[i11];
        map.put(str2, map.get(str));
        this.mAttributes[i11].remove(str);
    }

    private void retrieveJpegImageSize(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i11) throws Throwable {
        ExifAttribute exifAttribute = this.mAttributes[i11].get(TAG_IMAGE_LENGTH);
        ExifAttribute exifAttribute2 = this.mAttributes[i11].get(TAG_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            ExifAttribute exifAttribute3 = this.mAttributes[i11].get(TAG_JPEG_INTERCHANGE_FORMAT);
            ExifAttribute exifAttribute4 = this.mAttributes[i11].get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            if (exifAttribute3 == null || exifAttribute4 == null) {
                return;
            }
            int intValue = exifAttribute3.getIntValue(this.mExifByteOrder);
            int intValue2 = exifAttribute3.getIntValue(this.mExifByteOrder);
            seekableByteOrderedDataInputStream.seek(intValue);
            byte[] bArr = new byte[intValue2];
            seekableByteOrderedDataInputStream.readFully(bArr);
            getJpegAttributes(new ByteOrderedDataInputStream(bArr), intValue, i11);
        }
    }

    private void saveJpegAttributes(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte b11;
        byte[] bArr;
        if (DEBUG) {
            Log.d(TAG, "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(inputStream);
        ByteOrderedDataOutputStream byteOrderedDataOutputStream = new ByteOrderedDataOutputStream(outputStream, ByteOrder.BIG_ENDIAN);
        if (byteOrderedDataInputStream.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        byteOrderedDataOutputStream.writeByte(-1);
        if (byteOrderedDataInputStream.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        byteOrderedDataOutputStream.writeByte(-40);
        byteOrderedDataOutputStream.writeByte(-1);
        byteOrderedDataOutputStream.writeByte(-31);
        this.mOffsetToExifData = writeExifSegment(byteOrderedDataOutputStream);
        if (this.mXmpFromSeparateMarker != null) {
            byteOrderedDataOutputStream.write(-1);
            byteOrderedDataOutputStream.writeByte(-31);
            byte[] bArr2 = IDENTIFIER_XMP_APP1;
            byteOrderedDataOutputStream.writeUnsignedShort(bArr2.length + 2 + this.mXmpFromSeparateMarker.bytes.length);
            byteOrderedDataOutputStream.write(bArr2);
            byteOrderedDataOutputStream.write(this.mXmpFromSeparateMarker.bytes);
            this.mFileOnDiskContainsSeparateXmpMarker = true;
        }
        byte[] bArr3 = new byte[4096];
        while (byteOrderedDataInputStream.readByte() == -1) {
            do {
                b11 = byteOrderedDataInputStream.readByte();
            } while (b11 == -1);
            if (b11 == -39 || b11 == -38) {
                byteOrderedDataOutputStream.writeByte(-1);
                byteOrderedDataOutputStream.writeByte(b11);
                ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream);
                return;
            }
            if (b11 != -31) {
                byteOrderedDataOutputStream.writeByte(-1);
                byteOrderedDataOutputStream.writeByte(b11);
                int unsignedShort = byteOrderedDataInputStream.readUnsignedShort();
                byteOrderedDataOutputStream.writeUnsignedShort(unsignedShort);
                int i11 = unsignedShort - 2;
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i11 > 0) {
                    int i12 = byteOrderedDataInputStream.read(bArr3, 0, Math.min(i11, 4096));
                    if (i12 < 0) {
                        break;
                    }
                    byteOrderedDataOutputStream.write(bArr3, 0, i12);
                    i11 -= i12;
                }
            } else {
                int unsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr4 = IDENTIFIER_XMP_APP1;
                if (length >= bArr4.length) {
                    bArr = new byte[bArr4.length];
                } else {
                    byte[] bArr5 = IDENTIFIER_EXIF_APP1;
                    bArr = length >= bArr5.length ? new byte[bArr5.length] : null;
                }
                if (bArr != null) {
                    byteOrderedDataInputStream.readFully(bArr);
                    if (ExifInterfaceUtils.startsWith(bArr, IDENTIFIER_EXIF_APP1) || ExifInterfaceUtils.startsWith(bArr, bArr4)) {
                        byteOrderedDataInputStream.skipFully(length - bArr.length);
                    }
                }
                byteOrderedDataOutputStream.writeByte(-1);
                byteOrderedDataOutputStream.writeByte(b11);
                byteOrderedDataOutputStream.writeUnsignedShort(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    byteOrderedDataOutputStream.write(bArr);
                }
                while (length > 0) {
                    int i13 = byteOrderedDataInputStream.read(bArr3, 0, Math.min(length, 4096));
                    if (i13 < 0) {
                        break;
                    }
                    byteOrderedDataOutputStream.write(bArr3, 0, i13);
                    length -= i13;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0044 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0044
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void savePngAttributes(java.io.InputStream r9, java.io.OutputStream r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.savePngAttributes(java.io.InputStream, java.io.OutputStream):void");
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0213 A[Catch: all -> 0x007e, Exception -> 0x0082, TryCatch #5 {Exception -> 0x0082, all -> 0x007e, blocks: (B:7:0x004f, B:9:0x005b, B:11:0x006f, B:12:0x0071, B:80:0x01f7, B:82:0x0213, B:83:0x021c, B:19:0x0086, B:21:0x0095, B:23:0x009d, B:25:0x00a1, B:28:0x00b1, B:30:0x00bc, B:31:0x00c1, B:32:0x00c3, B:36:0x00d1, B:37:0x00d6, B:38:0x00da, B:39:0x00e6, B:41:0x00ee, B:45:0x00fc, B:47:0x0104, B:50:0x010b, B:52:0x011a, B:54:0x012a, B:69:0x0186, B:71:0x0192, B:72:0x0199, B:74:0x01d3, B:79:0x01f0, B:76:0x01e1, B:78:0x01e9, B:55:0x013e, B:56:0x0145, B:57:0x0146, B:59:0x0150, B:61:0x0156, B:65:0x016f, B:66:0x0177, B:67:0x017e), top: B:97:0x004f }] */
    private void saveWebpAttributes(InputStream inputStream, OutputStream outputStream) throws Throwable {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iWriteExifSegment;
        boolean z11;
        if (DEBUG) {
            Log.d(TAG, "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(inputStream, byteOrder);
        ByteOrderedDataOutputStream byteOrderedDataOutputStream = new ByteOrderedDataOutputStream(outputStream, byteOrder);
        byte[] bArr = WEBP_SIGNATURE_1;
        ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, bArr.length);
        int i16 = byteOrderedDataInputStream.readInt();
        byte[] bArr2 = WEBP_SIGNATURE_2;
        byteOrderedDataInputStream.skipFully(bArr2.length);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    ByteOrderedDataOutputStream byteOrderedDataOutputStream2 = new ByteOrderedDataOutputStream(byteArrayOutputStream2, byteOrder);
                    int i17 = this.mOffsetToExifData;
                    if (i17 == 0) {
                        byte[] bArr3 = new byte[4];
                        byteOrderedDataInputStream.readFully(bArr3);
                        byte[] bArr4 = WEBP_CHUNK_TYPE_VP8X;
                        boolean z12 = true;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i18 = byteOrderedDataInputStream.readInt();
                            byte[] bArr5 = new byte[i18 % 2 == 1 ? i18 + 1 : i18];
                            byteOrderedDataInputStream.readFully(bArr5);
                            byte b11 = (byte) (bArr5[0] | 8);
                            bArr5[0] = b11;
                            boolean z13 = ((b11 >> 1) & 1) == 1;
                            byteOrderedDataOutputStream2.write(bArr4);
                            byteOrderedDataOutputStream2.writeInt(i18);
                            byteOrderedDataOutputStream2.write(bArr5);
                            if (z13) {
                                copyChunksUpToGivenChunkType(byteOrderedDataInputStream, byteOrderedDataOutputStream2, WEBP_CHUNK_TYPE_ANIM, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    try {
                                        byteOrderedDataInputStream.readFully(bArr6);
                                        z11 = !Arrays.equals(bArr6, WEBP_CHUNK_TYPE_ANMF);
                                    } catch (EOFException unused) {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        break;
                                    } else {
                                        copyWebPChunk(byteOrderedDataInputStream, byteOrderedDataOutputStream2, bArr6);
                                    }
                                }
                                iWriteExifSegment = writeExifSegment(byteOrderedDataOutputStream2);
                            } else {
                                copyChunksUpToGivenChunkType(byteOrderedDataInputStream, byteOrderedDataOutputStream2, WEBP_CHUNK_TYPE_VP8, WEBP_CHUNK_TYPE_VP8L);
                                iWriteExifSegment = writeExifSegment(byteOrderedDataOutputStream2);
                            }
                        } else {
                            byte[] bArr7 = WEBP_CHUNK_TYPE_VP8;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, WEBP_CHUNK_TYPE_VP8L)) {
                                int i19 = byteOrderedDataInputStream.readInt();
                                int i21 = i19 % 2 == 1 ? i19 + 1 : i19;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    byteOrderedDataInputStream.readFully(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    byteOrderedDataInputStream.readFully(bArr9);
                                    if (!Arrays.equals(WEBP_VP8_SIGNATURE, bArr9)) {
                                        throw new IOException("Error checking VP8 signature");
                                    }
                                    i14 = byteOrderedDataInputStream.readInt();
                                    i11 = -1;
                                    i13 = (i14 >> 16) & 16383;
                                    i12 = i21 - 10;
                                    i15 = i14 & 16383;
                                    z12 = false;
                                } else {
                                    i11 = -1;
                                    if (!Arrays.equals(bArr3, WEBP_CHUNK_TYPE_VP8L)) {
                                        i12 = i21;
                                        i13 = 0;
                                        i14 = 0;
                                        z12 = false;
                                        i15 = 0;
                                    } else {
                                        if (byteOrderedDataInputStream.readByte() != 47) {
                                            throw new IOException("Error checking VP8L signature");
                                        }
                                        i14 = byteOrderedDataInputStream.readInt();
                                        int i22 = (i14 & 16383) + 1;
                                        int i23 = ((i14 & 268419072) >>> 14) + 1;
                                        if ((i14 & 268435456) == 0) {
                                            z12 = false;
                                        }
                                        i12 = i21 - 5;
                                        i15 = i22;
                                        i13 = i23;
                                    }
                                }
                                byteOrderedDataOutputStream2.write(bArr4);
                                byteOrderedDataOutputStream2.writeInt(10);
                                byte[] bArr10 = new byte[10];
                                if (z12) {
                                    bArr10[0] = (byte) (bArr10[0] | 16);
                                }
                                bArr10[0] = (byte) (bArr10[0] | 8);
                                int i24 = i15 - 1;
                                int i25 = i13 - 1;
                                bArr10[4] = (byte) i24;
                                bArr10[5] = (byte) (i24 >> 8);
                                bArr10[6] = (byte) (i24 >> 16);
                                bArr10[7] = (byte) i25;
                                bArr10[8] = (byte) (i25 >> 8);
                                bArr10[9] = (byte) (i25 >> 16);
                                byteOrderedDataOutputStream2.write(bArr10);
                                byteOrderedDataOutputStream2.write(bArr3);
                                byteOrderedDataOutputStream2.writeInt(i19);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    byteOrderedDataOutputStream2.write(bArr8);
                                    byteOrderedDataOutputStream2.write(WEBP_VP8_SIGNATURE);
                                    byteOrderedDataOutputStream2.writeInt(i14);
                                } else if (Arrays.equals(bArr3, WEBP_CHUNK_TYPE_VP8L)) {
                                    byteOrderedDataOutputStream2.write(47);
                                    byteOrderedDataOutputStream2.writeInt(i14);
                                }
                                ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream2, i12);
                                iWriteExifSegment = writeExifSegment(byteOrderedDataOutputStream2);
                            } else {
                                iWriteExifSegment = -1;
                                i11 = -1;
                            }
                        }
                        ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream2, (i16 + 8) - byteOrderedDataInputStream.position());
                        int size = byteArrayOutputStream2.size();
                        byte[] bArr11 = WEBP_SIGNATURE_2;
                        byteOrderedDataOutputStream.writeInt(size + bArr11.length);
                        byteOrderedDataOutputStream.write(bArr11);
                        if (iWriteExifSegment != i11) {
                            this.mOffsetToExifData = byteOrderedDataOutputStream.mOutputStream.size() + iWriteExifSegment;
                        }
                        byteArrayOutputStream2.writeTo(byteOrderedDataOutputStream);
                        ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream);
                        ExifInterfaceUtils.closeQuietly(byteArrayOutputStream2);
                    }
                    ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream2, (i17 - ((bArr.length + 4) + bArr2.length)) - 8);
                    byteOrderedDataInputStream.skipFully(4);
                    int i26 = byteOrderedDataInputStream.readInt();
                    if (i26 % 2 != 0) {
                        i26++;
                    }
                    byteOrderedDataInputStream.skipFully(i26);
                    iWriteExifSegment = writeExifSegment(byteOrderedDataOutputStream2);
                    i11 = -1;
                    ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream2, (i16 + 8) - byteOrderedDataInputStream.position());
                    int size2 = byteArrayOutputStream2.size();
                    byte[] bArr12 = WEBP_SIGNATURE_2;
                    byteOrderedDataOutputStream.writeInt(size2 + bArr12.length);
                    byteOrderedDataOutputStream.write(bArr12);
                    if (iWriteExifSegment != i11) {
                        this.mOffsetToExifData = byteOrderedDataOutputStream.mOutputStream.size() + iWriteExifSegment;
                    }
                    byteArrayOutputStream2.writeTo(byteOrderedDataOutputStream);
                    ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream);
                    ExifInterfaceUtils.closeQuietly(byteArrayOutputStream2);
                } catch (Exception e11) {
                    e = e11;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    ExifInterfaceUtils.closeQuietly(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    private void setThumbnailData(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        HashMap<String, ExifAttribute> map = this.mAttributes[4];
        ExifAttribute exifAttribute = map.get(TAG_COMPRESSION);
        if (exifAttribute == null) {
            this.mThumbnailCompression = 6;
            handleThumbnailFromJfif(byteOrderedDataInputStream, map);
            return;
        }
        int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
        this.mThumbnailCompression = intValue;
        if (intValue != 1) {
            if (intValue == 6) {
                handleThumbnailFromJfif(byteOrderedDataInputStream, map);
                return;
            } else if (intValue != 7) {
                return;
            }
        }
        if (isSupportedDataType(map)) {
            handleThumbnailFromStrips(byteOrderedDataInputStream, map);
        }
    }

    private void swapBasedOnImageSize(int i11, int i12) throws Throwable {
        if (this.mAttributes[i11].isEmpty() || this.mAttributes[i12].isEmpty()) {
            if (DEBUG) {
                Log.d(TAG, "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        ExifAttribute exifAttribute = this.mAttributes[i11].get(TAG_IMAGE_LENGTH);
        ExifAttribute exifAttribute2 = this.mAttributes[i11].get(TAG_IMAGE_WIDTH);
        ExifAttribute exifAttribute3 = this.mAttributes[i12].get(TAG_IMAGE_LENGTH);
        ExifAttribute exifAttribute4 = this.mAttributes[i12].get(TAG_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            if (DEBUG) {
                Log.d(TAG, "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (exifAttribute3 == null || exifAttribute4 == null) {
            if (DEBUG) {
                Log.d(TAG, "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
        int intValue2 = exifAttribute2.getIntValue(this.mExifByteOrder);
        int intValue3 = exifAttribute3.getIntValue(this.mExifByteOrder);
        int intValue4 = exifAttribute4.getIntValue(this.mExifByteOrder);
        if (intValue >= intValue3 || intValue2 >= intValue4) {
            return;
        }
        HashMap<String, ExifAttribute>[] mapArr = this.mAttributes;
        HashMap<String, ExifAttribute> map = mapArr[i11];
        mapArr[i11] = mapArr[i12];
        mapArr[i12] = map;
    }

    private static void updateCrcWithInt(CRC32 crc32, int i11) {
        crc32.update(i11 >>> 24);
        crc32.update(i11 >>> 16);
        crc32.update(i11 >>> 8);
        crc32.update(i11);
    }

    private void updateImageSizeValues(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i11) throws Throwable {
        ExifAttribute exifAttributeCreateUShort;
        ExifAttribute exifAttributeCreateUShort2;
        ExifAttribute exifAttribute = this.mAttributes[i11].get(TAG_DEFAULT_CROP_SIZE);
        ExifAttribute exifAttribute2 = this.mAttributes[i11].get(TAG_RW2_SENSOR_TOP_BORDER);
        ExifAttribute exifAttribute3 = this.mAttributes[i11].get(TAG_RW2_SENSOR_LEFT_BORDER);
        ExifAttribute exifAttribute4 = this.mAttributes[i11].get(TAG_RW2_SENSOR_BOTTOM_BORDER);
        ExifAttribute exifAttribute5 = this.mAttributes[i11].get(TAG_RW2_SENSOR_RIGHT_BORDER);
        if (exifAttribute == null) {
            if (exifAttribute2 == null || exifAttribute3 == null || exifAttribute4 == null || exifAttribute5 == null) {
                retrieveJpegImageSize(seekableByteOrderedDataInputStream, i11);
                return;
            }
            int intValue = exifAttribute2.getIntValue(this.mExifByteOrder);
            int intValue2 = exifAttribute4.getIntValue(this.mExifByteOrder);
            int intValue3 = exifAttribute5.getIntValue(this.mExifByteOrder);
            int intValue4 = exifAttribute3.getIntValue(this.mExifByteOrder);
            if (intValue2 <= intValue || intValue3 <= intValue4) {
                return;
            }
            ExifAttribute exifAttributeCreateUShort3 = ExifAttribute.createUShort(intValue2 - intValue, this.mExifByteOrder);
            ExifAttribute exifAttributeCreateUShort4 = ExifAttribute.createUShort(intValue3 - intValue4, this.mExifByteOrder);
            this.mAttributes[i11].put(TAG_IMAGE_LENGTH, exifAttributeCreateUShort3);
            this.mAttributes[i11].put(TAG_IMAGE_WIDTH, exifAttributeCreateUShort4);
            return;
        }
        if (exifAttribute.format == 5) {
            Rational[] rationalArr = (Rational[]) exifAttribute.getValue(this.mExifByteOrder);
            if (rationalArr == null || rationalArr.length != 2) {
                Log.w(TAG, "Invalid crop size values. cropSize=" + Arrays.toString(rationalArr));
                return;
            }
            exifAttributeCreateUShort = ExifAttribute.createURational(rationalArr[0], this.mExifByteOrder);
            exifAttributeCreateUShort2 = ExifAttribute.createURational(rationalArr[1], this.mExifByteOrder);
        } else {
            int[] iArr = (int[]) exifAttribute.getValue(this.mExifByteOrder);
            if (iArr == null || iArr.length != 2) {
                Log.w(TAG, "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            exifAttributeCreateUShort = ExifAttribute.createUShort(iArr[0], this.mExifByteOrder);
            exifAttributeCreateUShort2 = ExifAttribute.createUShort(iArr[1], this.mExifByteOrder);
        }
        this.mAttributes[i11].put(TAG_IMAGE_WIDTH, exifAttributeCreateUShort);
        this.mAttributes[i11].put(TAG_IMAGE_LENGTH, exifAttributeCreateUShort2);
    }

    private int writeExifSegment(ByteOrderedDataOutputStream byteOrderedDataOutputStream) throws IOException {
        long j11;
        ExifTag[][] exifTagArr = EXIF_TAGS;
        int[] iArr = new int[exifTagArr.length];
        int[] iArr2 = new int[exifTagArr.length];
        for (ExifTag exifTag : EXIF_POINTER_TAGS) {
            removeAttribute(exifTag.name);
        }
        if (this.mHasThumbnail) {
            if (this.mHasThumbnailStrips) {
                removeAttribute(TAG_STRIP_OFFSETS);
                removeAttribute(TAG_STRIP_BYTE_COUNTS);
            } else {
                removeAttribute(TAG_JPEG_INTERCHANGE_FORMAT);
                removeAttribute(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            }
        }
        for (int i11 = 0; i11 < EXIF_TAGS.length; i11++) {
            Iterator<Map.Entry<String, ExifAttribute>> it = this.mAttributes[i11].entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == null) {
                    it.remove();
                }
            }
        }
        long j12 = 0;
        if (!this.mAttributes[1].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (!this.mAttributes[2].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[2].name, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (!this.mAttributes[3].isEmpty()) {
            this.mAttributes[1].put(EXIF_POINTER_TAGS[3].name, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (this.mHasThumbnail) {
            if (this.mHasThumbnailStrips) {
                this.mAttributes[4].put(TAG_STRIP_OFFSETS, ExifAttribute.createUShort(0, this.mExifByteOrder));
                this.mAttributes[4].put(TAG_STRIP_BYTE_COUNTS, ExifAttribute.createUShort(this.mThumbnailLength, this.mExifByteOrder));
            } else {
                this.mAttributes[4].put(TAG_JPEG_INTERCHANGE_FORMAT, ExifAttribute.createULong(0L, this.mExifByteOrder));
                this.mAttributes[4].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, ExifAttribute.createULong(this.mThumbnailLength, this.mExifByteOrder));
            }
        }
        for (int i12 = 0; i12 < EXIF_TAGS.length; i12++) {
            Iterator<Map.Entry<String, ExifAttribute>> it2 = this.mAttributes[i12].entrySet().iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                int size = it2.next().getValue().size();
                if (size > 4) {
                    i13 += size;
                }
            }
            iArr2[i12] = iArr2[i12] + i13;
        }
        int size2 = 8;
        for (int i14 = 0; i14 < EXIF_TAGS.length; i14++) {
            if (!this.mAttributes[i14].isEmpty()) {
                iArr[i14] = size2;
                size2 += (this.mAttributes[i14].size() * 12) + 6 + iArr2[i14];
            }
        }
        if (this.mHasThumbnail) {
            if (this.mHasThumbnailStrips) {
                this.mAttributes[4].put(TAG_STRIP_OFFSETS, ExifAttribute.createUShort(size2, this.mExifByteOrder));
            } else {
                this.mAttributes[4].put(TAG_JPEG_INTERCHANGE_FORMAT, ExifAttribute.createULong(size2, this.mExifByteOrder));
            }
            this.mThumbnailOffset = size2;
            size2 += this.mThumbnailLength;
        }
        if (this.mMimeType == 4) {
            size2 += 8;
        }
        if (DEBUG) {
            for (int i15 = 0; i15 < EXIF_TAGS.length; i15++) {
                Log.d(TAG, String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i15), Integer.valueOf(iArr[i15]), Integer.valueOf(this.mAttributes[i15].size()), Integer.valueOf(iArr2[i15]), Integer.valueOf(size2)));
            }
        }
        if (!this.mAttributes[1].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong(iArr[1], this.mExifByteOrder));
        }
        if (!this.mAttributes[r13].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[r13].name, ExifAttribute.createULong(iArr[2], this.mExifByteOrder));
        }
        if (!this.mAttributes[r14].isEmpty()) {
            this.mAttributes[1].put(EXIF_POINTER_TAGS[r14].name, ExifAttribute.createULong(iArr[3], this.mExifByteOrder));
        }
        int i16 = this.mMimeType;
        if (i16 == 4) {
            if (size2 > 65535) {
                throw new IllegalStateException("Size of exif data (" + size2 + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            byteOrderedDataOutputStream.writeUnsignedShort(size2);
            byteOrderedDataOutputStream.write(IDENTIFIER_EXIF_APP1);
        } else if (i16 == 13) {
            byteOrderedDataOutputStream.writeInt(size2);
            byteOrderedDataOutputStream.writeInt(PNG_CHUNK_TYPE_EXIF);
        } else if (i16 == 14) {
            byteOrderedDataOutputStream.write(WEBP_CHUNK_TYPE_EXIF);
            byteOrderedDataOutputStream.writeInt(size2);
        }
        int size3 = byteOrderedDataOutputStream.mOutputStream.size();
        byteOrderedDataOutputStream.writeShort(this.mExifByteOrder == ByteOrder.BIG_ENDIAN ? BYTE_ALIGN_MM : BYTE_ALIGN_II);
        byteOrderedDataOutputStream.setByteOrder(this.mExifByteOrder);
        byteOrderedDataOutputStream.writeUnsignedShort(42);
        byteOrderedDataOutputStream.writeUnsignedInt(8L);
        int i17 = 0;
        while (i17 < EXIF_TAGS.length) {
            if (this.mAttributes[i17].isEmpty()) {
                j11 = j12;
            } else {
                byteOrderedDataOutputStream.writeUnsignedShort(this.mAttributes[i17].size());
                int size4 = iArr[i17] + 2 + (this.mAttributes[i17].size() * 12) + 4;
                for (Map.Entry<String, ExifAttribute> entry : this.mAttributes[i17].entrySet()) {
                    int i18 = sExifTagMapsForWriting[i17].get(entry.getKey()).number;
                    ExifAttribute value = entry.getValue();
                    int size5 = value.size();
                    byteOrderedDataOutputStream.writeUnsignedShort(i18);
                    byteOrderedDataOutputStream.writeUnsignedShort(value.format);
                    byteOrderedDataOutputStream.writeInt(value.numberOfComponents);
                    if (size5 > 4) {
                        byteOrderedDataOutputStream.writeUnsignedInt(size4);
                        size4 += size5;
                    } else {
                        byteOrderedDataOutputStream.write(value.bytes);
                        if (size5 < 4) {
                            while (size5 < 4) {
                                byteOrderedDataOutputStream.writeByte(0);
                                size5++;
                            }
                        }
                    }
                }
                if (i17 != 0 || this.mAttributes[4].isEmpty()) {
                    j11 = 0;
                    byteOrderedDataOutputStream.writeUnsignedInt(0L);
                } else {
                    byteOrderedDataOutputStream.writeUnsignedInt(iArr[4]);
                    j11 = 0;
                }
                Iterator<Map.Entry<String, ExifAttribute>> it3 = this.mAttributes[i17].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = it3.next().getValue().bytes;
                    if (bArr.length > 4) {
                        byteOrderedDataOutputStream.write(bArr, 0, bArr.length);
                    }
                }
            }
            i17++;
            j12 = j11;
        }
        if (this.mHasThumbnail) {
            byteOrderedDataOutputStream.write(getThumbnailBytes());
        }
        if (this.mMimeType == 14 && size2 % 2 == 1) {
            byteOrderedDataOutputStream.writeByte(0);
        }
        byteOrderedDataOutputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
        return size3;
    }

    private void writePngExifChunk(ByteOrderedDataOutputStream byteOrderedDataOutputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.mOffsetToExifData = byteOrderedDataOutputStream.mOutputStream.size() + writeExifSegment(new ByteOrderedDataOutputStream(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteOrderedDataOutputStream.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        byteOrderedDataOutputStream.writeInt((int) crc32.getValue());
    }

    private void writePngXmpItxtChunk(ByteOrderedDataOutputStream byteOrderedDataOutputStream) throws IOException {
        byteOrderedDataOutputStream.writeInt(this.mXmpFromSeparateMarker.bytes.length + 22);
        CRC32 crc32 = new CRC32();
        byteOrderedDataOutputStream.writeInt(PNG_CHUNK_TYPE_ITXT);
        updateCrcWithInt(crc32, PNG_CHUNK_TYPE_ITXT);
        byte[] bArr = PNG_ITXT_XMP_KEYWORD;
        byteOrderedDataOutputStream.write(bArr);
        crc32.update(bArr);
        byteOrderedDataOutputStream.write(this.mXmpFromSeparateMarker.bytes);
        crc32.update(this.mXmpFromSeparateMarker.bytes);
        byteOrderedDataOutputStream.writeInt((int) crc32.getValue());
        this.mFileOnDiskContainsSeparateXmpMarker = true;
    }

    public void flipHorizontally() {
        int i11 = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i11 = 2;
                break;
            case 2:
                break;
            case 3:
                i11 = 4;
                break;
            case 4:
                i11 = 3;
                break;
            case 5:
                i11 = 6;
                break;
            case 6:
                i11 = 5;
                break;
            case 7:
                i11 = 8;
                break;
            case 8:
                i11 = 7;
                break;
            default:
                i11 = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i11));
    }

    public void flipVertically() {
        int i11 = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i11 = 4;
                break;
            case 2:
                i11 = 3;
                break;
            case 3:
                i11 = 2;
                break;
            case 4:
                break;
            case 5:
                i11 = 8;
                break;
            case 6:
                i11 = 7;
                break;
            case 7:
                i11 = 6;
                break;
            case 8:
                i11 = 5;
                break;
            default:
                i11 = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i11));
    }

    public double getAltitude(double d11) {
        double attributeDouble = getAttributeDouble(TAG_GPS_ALTITUDE, -1.0d);
        int attributeInt = getAttributeInt(TAG_GPS_ALTITUDE_REF, -1);
        if (attributeDouble < 0.0d || attributeInt < 0) {
            return d11;
        }
        return attributeDouble * ((double) (attributeInt != 1 ? 1 : -1));
    }

    public String getAttribute(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute == null) {
            return null;
        }
        if (!str.equals(TAG_GPS_TIMESTAMP)) {
            if (!RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY.contains(str)) {
                return exifAttribute.getStringValue(this.mExifByteOrder);
            }
            try {
                return Double.toString(exifAttribute.getDoubleValue(this.mExifByteOrder));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i11 = exifAttribute.format;
        if (i11 != 5 && i11 != 10) {
            Log.w(TAG, "GPS Timestamp format is not rational. format=" + exifAttribute.format);
            return null;
        }
        Rational[] rationalArr = (Rational[]) exifAttribute.getValue(this.mExifByteOrder);
        if (rationalArr == null || rationalArr.length != 3) {
            Log.w(TAG, "Invalid GPS Timestamp array. array=" + Arrays.toString(rationalArr));
            return null;
        }
        Rational rational = rationalArr[0];
        Integer numValueOf = Integer.valueOf((int) (rational.numerator / rational.denominator));
        Rational rational2 = rationalArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (rational2.numerator / rational2.denominator));
        Rational rational3 = rationalArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (rational3.numerator / rational3.denominator)));
    }

    public byte[] getAttributeBytes(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            return exifAttribute.bytes;
        }
        return null;
    }

    public double getAttributeDouble(String str, double d11) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            try {
                return exifAttribute.getDoubleValue(this.mExifByteOrder);
            } catch (NumberFormatException unused) {
            }
        }
        return d11;
    }

    public int getAttributeInt(String str, int i11) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            try {
                return exifAttribute.getIntValue(this.mExifByteOrder);
            } catch (NumberFormatException unused) {
            }
        }
        return i11;
    }

    public long[] getAttributeRange(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.mModified) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            return new long[]{exifAttribute.bytesOffset, exifAttribute.bytes.length};
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long getDateTime() {
        return parseDateTime(getAttribute(TAG_DATETIME), getAttribute(TAG_SUBSEC_TIME), getAttribute(TAG_OFFSET_TIME));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long getDateTimeDigitized() {
        return parseDateTime(getAttribute(TAG_DATETIME_DIGITIZED), getAttribute(TAG_SUBSEC_TIME_DIGITIZED), getAttribute(TAG_OFFSET_TIME_DIGITIZED));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long getDateTimeOriginal() {
        return parseDateTime(getAttribute(TAG_DATETIME_ORIGINAL), getAttribute(TAG_SUBSEC_TIME_ORIGINAL), getAttribute(TAG_OFFSET_TIME_ORIGINAL));
    }

    @SuppressLint({"AutoBoxing"})
    public Long getGpsDateTime() {
        String attribute = getAttribute(TAG_GPS_DATESTAMP);
        String attribute2 = getAttribute(TAG_GPS_TIMESTAMP);
        if (attribute != null && attribute2 != null) {
            Pattern pattern = NON_ZERO_TIME_PATTERN;
            if (pattern.matcher(attribute).matches() || pattern.matcher(attribute2).matches()) {
                String str = attribute + ' ' + attribute2;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date date = sFormatterPrimary.parse(str, parsePosition);
                    if (date == null && (date = sFormatterSecondary.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(date.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    public int getRotationDegrees() {
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public byte[] getThumbnail() {
        int i11 = this.mThumbnailCompression;
        if (i11 == 6 || i11 == 7) {
            return getThumbnailBytes();
        }
        return null;
    }

    public Bitmap getThumbnailBitmap() throws Throwable {
        if (!this.mHasThumbnail) {
            return null;
        }
        if (this.mThumbnailBytes == null) {
            this.mThumbnailBytes = getThumbnailBytes();
        }
        int i11 = this.mThumbnailCompression;
        if (i11 == 6 || i11 == 7) {
            return BitmapFactory.decodeByteArray(this.mThumbnailBytes, 0, this.mThumbnailLength);
        }
        if (i11 == 1) {
            int length = this.mThumbnailBytes.length / 3;
            int[] iArr = new int[length];
            for (int i12 = 0; i12 < length; i12++) {
                byte[] bArr = this.mThumbnailBytes;
                int i13 = i12 * 3;
                iArr[i12] = (bArr[i13] << 16) + (bArr[i13 + 1] << 8) + bArr[i13 + 2];
            }
            ExifAttribute exifAttribute = this.mAttributes[4].get(TAG_THUMBNAIL_IMAGE_LENGTH);
            ExifAttribute exifAttribute2 = this.mAttributes[4].get(TAG_THUMBNAIL_IMAGE_WIDTH);
            if (exifAttribute != null && exifAttribute2 != null) {
                return Bitmap.createBitmap(iArr, exifAttribute2.getIntValue(this.mExifByteOrder), exifAttribute.getIntValue(this.mExifByteOrder), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    public byte[] getThumbnailBytes() throws Throwable {
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        Exception e11;
        InputStream inputStream = null;
        if (!this.mHasThumbnail) {
            return null;
        }
        byte[] bArr = this.mThumbnailBytes;
        if (bArr != null) {
            return bArr;
        }
        try {
            fileInputStream = this.mAssetInputStream;
            if (fileInputStream != null) {
                try {
                    if (!fileInputStream.markSupported()) {
                        Log.d(TAG, "Cannot read thumbnail from inputstream without mark/reset support");
                        ExifInterfaceUtils.closeQuietly(fileInputStream);
                        return null;
                    }
                    fileInputStream.reset();
                    fileDescriptor = null;
                } catch (Exception e12) {
                    e11 = e12;
                    fileDescriptor = null;
                    Log.d(TAG, "Encountered exception while getting thumbnail", e11);
                    ExifInterfaceUtils.closeQuietly(fileInputStream);
                    if (fileDescriptor != null) {
                        ExifInterfaceUtils.closeFileDescriptor(fileDescriptor);
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileDescriptor = null;
                    inputStream = fileInputStream;
                    ExifInterfaceUtils.closeQuietly(inputStream);
                    if (fileDescriptor != null) {
                        ExifInterfaceUtils.closeFileDescriptor(fileDescriptor);
                    }
                    throw th;
                }
            } else if (this.mFilename != null) {
                fileInputStream = new FileInputStream(this.mFilename);
                fileDescriptor = null;
            } else {
                FileDescriptor fileDescriptorDup = Os.dup(this.mSeekableFileDescriptor);
                try {
                    Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                    fileDescriptor = fileDescriptorDup;
                    fileInputStream = new FileInputStream(fileDescriptorDup);
                } catch (Exception e13) {
                    e11 = e13;
                    fileDescriptor = fileDescriptorDup;
                    fileInputStream = null;
                    Log.d(TAG, "Encountered exception while getting thumbnail", e11);
                    ExifInterfaceUtils.closeQuietly(fileInputStream);
                    if (fileDescriptor != null) {
                        ExifInterfaceUtils.closeFileDescriptor(fileDescriptor);
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    fileDescriptor = fileDescriptorDup;
                    ExifInterfaceUtils.closeQuietly(inputStream);
                    if (fileDescriptor != null) {
                        ExifInterfaceUtils.closeFileDescriptor(fileDescriptor);
                    }
                    throw th;
                }
            }
            try {
                try {
                    ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(fileInputStream);
                    byteOrderedDataInputStream.skipFully(this.mThumbnailOffset + this.mOffsetToExifData);
                    byte[] bArr2 = new byte[this.mThumbnailLength];
                    byteOrderedDataInputStream.readFully(bArr2);
                    this.mThumbnailBytes = bArr2;
                    ExifInterfaceUtils.closeQuietly(fileInputStream);
                    if (fileDescriptor != null) {
                        ExifInterfaceUtils.closeFileDescriptor(fileDescriptor);
                    }
                    return bArr2;
                } catch (Exception e14) {
                    e11 = e14;
                    Log.d(TAG, "Encountered exception while getting thumbnail", e11);
                    ExifInterfaceUtils.closeQuietly(fileInputStream);
                    if (fileDescriptor != null) {
                        ExifInterfaceUtils.closeFileDescriptor(fileDescriptor);
                    }
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = fileInputStream;
                ExifInterfaceUtils.closeQuietly(inputStream);
                if (fileDescriptor != null) {
                    ExifInterfaceUtils.closeFileDescriptor(fileDescriptor);
                }
                throw th;
            }
        } catch (Exception e15) {
            fileInputStream = null;
            e11 = e15;
            fileDescriptor = null;
        } catch (Throwable th5) {
            th = th5;
            fileDescriptor = null;
        }
    }

    public long[] getThumbnailRange() {
        if (this.mModified) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.mHasThumbnail) {
            return null;
        }
        if (!this.mHasThumbnailStrips || this.mAreThumbnailStripsConsecutive) {
            return new long[]{this.mThumbnailOffset + this.mOffsetToExifData, this.mThumbnailLength};
        }
        return null;
    }

    public boolean hasThumbnail() {
        return this.mHasThumbnail;
    }

    public boolean isFlipped() {
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        return attributeInt == 2 || attributeInt == 7 || attributeInt == 4 || attributeInt == 5;
    }

    public boolean isThumbnailCompressed() {
        if (!this.mHasThumbnail) {
            return false;
        }
        int i11 = this.mThumbnailCompression;
        return i11 == 6 || i11 == 7;
    }

    public void rotate(int i11) {
        if (i11 % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        List<Integer> list = ROTATION_ORDER;
        int iIntValue = 0;
        if (list.contains(Integer.valueOf(attributeInt))) {
            int iIndexOf = (list.indexOf(Integer.valueOf(attributeInt)) + (i11 / 90)) % 4;
            iIntValue = list.get(iIndexOf + (iIndexOf < 0 ? 4 : 0)).intValue();
        } else {
            List<Integer> list2 = FLIPPED_ROTATION_ORDER;
            if (list2.contains(Integer.valueOf(attributeInt))) {
                int iIndexOf2 = (list2.indexOf(Integer.valueOf(attributeInt)) + (i11 / 90)) % 4;
                iIntValue = list2.get(iIndexOf2 + (iIndexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(iIntValue));
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f3 A[Catch: all -> 0x00fc, Exception -> 0x00ff, TryCatch #18 {Exception -> 0x00ff, all -> 0x00fc, blocks: (B:68:0x00ef, B:70:0x00f3, B:77:0x0110, B:76:0x0101), top: B:123:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0101 A[Catch: all -> 0x00fc, Exception -> 0x00ff, TryCatch #18 {Exception -> 0x00ff, all -> 0x00fc, blocks: (B:68:0x00ef, B:70:0x00f3, B:77:0x0110, B:76:0x0101), top: B:123:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0154  */
    public void saveAttributes() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream2;
        Exception e11;
        FileOutputStream fileOutputStream4;
        if (!isSupportedFormatForSavingAttributes(this.mMimeType)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.mSeekableFileDescriptor == null && this.mFilename == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.mHasThumbnail && this.mHasThumbnailStrips && !this.mAreThumbnailStripsConsecutive) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.mModified = true;
        this.mThumbnailBytes = getThumbnail();
        InputStream inputStream = null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.mFilename != null) {
                fileInputStream = new FileInputStream(this.mFilename);
            } else {
                Os.lseek(this.mSeekableFileDescriptor, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.mSeekableFileDescriptor);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    ExifInterfaceUtils.copy(fileInputStream, fileOutputStream);
                    ExifInterfaceUtils.closeQuietly(fileInputStream);
                    ExifInterfaceUtils.closeQuietly(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.mFilename != null) {
                                        fileOutputStream3 = new FileOutputStream(this.mFilename);
                                    } else {
                                        Os.lseek(this.mSeekableFileDescriptor, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream3 = new FileOutputStream(this.mSeekableFileDescriptor);
                                    }
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                                            try {
                                                int i11 = this.mMimeType;
                                                if (i11 == 4) {
                                                    saveJpegAttributes(bufferedInputStream, bufferedOutputStream);
                                                } else if (i11 == 13) {
                                                    savePngAttributes(bufferedInputStream, bufferedOutputStream);
                                                } else if (i11 == 14) {
                                                    saveWebpAttributes(bufferedInputStream, bufferedOutputStream);
                                                }
                                                ExifInterfaceUtils.closeQuietly(bufferedInputStream);
                                                ExifInterfaceUtils.closeQuietly(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.mThumbnailBytes = null;
                                            } catch (Exception e12) {
                                                exc = e12;
                                                inputStream = fileInputStream3;
                                                try {
                                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                    try {
                                                        if (this.mFilename != null) {
                                                            fileOutputStream4 = new FileOutputStream(this.mFilename);
                                                        } else {
                                                            Os.lseek(this.mSeekableFileDescriptor, 0L, OsConstants.SEEK_SET);
                                                            fileOutputStream4 = new FileOutputStream(this.mSeekableFileDescriptor);
                                                        }
                                                        fileOutputStream3 = fileOutputStream4;
                                                        ExifInterfaceUtils.copy(fileInputStream2, fileOutputStream3);
                                                        ExifInterfaceUtils.closeQuietly(fileInputStream2);
                                                        ExifInterfaceUtils.closeQuietly(fileOutputStream3);
                                                        throw new IOException("Failed to save new file", exc);
                                                    } catch (Exception e13) {
                                                        e11 = e13;
                                                        try {
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e11);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            inputStream = fileInputStream2;
                                                            ExifInterfaceUtils.closeQuietly(inputStream);
                                                            ExifInterfaceUtils.closeQuietly(fileOutputStream3);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        inputStream = fileInputStream2;
                                                        ExifInterfaceUtils.closeQuietly(inputStream);
                                                        ExifInterfaceUtils.closeQuietly(fileOutputStream3);
                                                        throw th;
                                                    }
                                                } catch (Exception e14) {
                                                    fileInputStream2 = inputStream;
                                                    e11 = e14;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    ExifInterfaceUtils.closeQuietly(inputStream);
                                                    ExifInterfaceUtils.closeQuietly(fileOutputStream3);
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e15) {
                                            inputStream = fileInputStream3;
                                            exc = e15;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            inputStream = bufferedInputStream;
                                            ExifInterfaceUtils.closeQuietly(inputStream);
                                            ExifInterfaceUtils.closeQuietly(0);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e16) {
                                        inputStream = fileInputStream3;
                                        exc = e16;
                                    }
                                } catch (Exception e17) {
                                    e = e17;
                                    fileOutputStream2 = null;
                                    inputStream = fileInputStream3;
                                    exc = e;
                                    fileOutputStream3 = fileOutputStream2;
                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                    if (this.mFilename != null) {
                                        fileOutputStream4 = new FileOutputStream(this.mFilename);
                                    } else {
                                        Os.lseek(this.mSeekableFileDescriptor, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream4 = new FileOutputStream(this.mSeekableFileDescriptor);
                                    }
                                    fileOutputStream3 = fileOutputStream4;
                                    ExifInterfaceUtils.copy(fileInputStream2, fileOutputStream3);
                                    ExifInterfaceUtils.closeQuietly(fileInputStream2);
                                    ExifInterfaceUtils.closeQuietly(fileOutputStream3);
                                    throw new IOException("Failed to save new file", exc);
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                ExifInterfaceUtils.closeQuietly(inputStream);
                                ExifInterfaceUtils.closeQuietly(0);
                                if (0 == 0) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e18) {
                            e = e18;
                            fileOutputStream2 = null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Exception e19) {
                    e = e19;
                    inputStream = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th8) {
                        th = th8;
                        ExifInterfaceUtils.closeQuietly(inputStream);
                        ExifInterfaceUtils.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    inputStream = fileInputStream;
                    ExifInterfaceUtils.closeQuietly(inputStream);
                    ExifInterfaceUtils.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Exception e21) {
                e = e21;
                fileOutputStream = null;
            } catch (Throwable th10) {
                th = th10;
                fileOutputStream = null;
            }
        } catch (Exception e22) {
            e = e22;
            fileOutputStream = null;
        } catch (Throwable th11) {
            th = th11;
            fileOutputStream = null;
        }
    }

    public void setAltitude(double d11) {
        String str = d11 >= 0.0d ? "0" : "1";
        setAttribute(TAG_GPS_ALTITUDE, Rational.createFromDouble(Math.abs(d11)).toString());
        setAttribute(TAG_GPS_ALTITUDE_REF, str);
    }

    public void setAttribute(String str, String str2) {
        ExifTag exifTag;
        int i11;
        String str3;
        int i12;
        int i13;
        String str4 = str;
        String strReplaceAll = str2;
        if (str4 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str4)) {
            if (DEBUG) {
                Log.d(TAG, "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        int i14 = 2;
        String str5 = "/";
        int i15 = 1;
        if (strReplaceAll != null) {
            if (RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY.contains(str4) && !strReplaceAll.contains("/")) {
                try {
                    strReplaceAll = Rational.createFromDouble(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w(TAG, "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
            } else if (str4.equals(TAG_GPS_TIMESTAMP)) {
                Matcher matcher = GPS_TIMESTAMP_PATTERN.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w(TAG, "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if (TAG_DATETIME.equals(str4) || TAG_DATETIME_ORIGINAL.equals(str4) || TAG_DATETIME_DIGITIZED.equals(str4)) {
                boolean zFind = DATETIME_PRIMARY_FORMAT_PATTERN.matcher(strReplaceAll).find();
                boolean zFind2 = DATETIME_SECONDARY_FORMAT_PATTERN.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    Log.w(TAG, "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll(C33820nf.f71144W, C33844oi.f71346o);
                }
            }
        }
        int i16 = 0;
        if (TAG_XMP.equals(str4)) {
            boolean z11 = this.mAttributes[0].containsKey(TAG_XMP) || this.mAttributes[5].containsKey(TAG_XMP);
            int xmpHandlingForImageType = getXmpHandlingForImageType(this.mMimeType);
            if ((xmpHandlingForImageType == 2 && (this.mXmpFromSeparateMarker != null || !z11)) || (xmpHandlingForImageType == 3 && !z11)) {
                this.mXmpFromSeparateMarker = strReplaceAll != null ? ExifAttribute.createByte(strReplaceAll) : null;
                return;
            }
        }
        int i17 = 0;
        while (i17 < EXIF_TAGS.length) {
            if ((i17 != 4 || this.mHasThumbnail) && (exifTag = sExifTagMapsForWriting[i17].get(str4)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairGuessDataFormat = guessDataFormat(strReplaceAll);
                    if (exifTag.primaryFormat == ((Integer) pairGuessDataFormat.first).intValue() || exifTag.primaryFormat == ((Integer) pairGuessDataFormat.second).intValue()) {
                        i11 = exifTag.primaryFormat;
                    } else {
                        int i18 = exifTag.secondaryFormat;
                        if (i18 == -1 || !(i18 == ((Integer) pairGuessDataFormat.first).intValue() || exifTag.secondaryFormat == ((Integer) pairGuessDataFormat.second).intValue())) {
                            int i19 = exifTag.primaryFormat;
                            if (i19 == i15 || i19 == 7 || i19 == i14) {
                                i11 = i19;
                            } else if (DEBUG) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str4);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = IFD_FORMAT_NAMES;
                                sb2.append(strArr[exifTag.primaryFormat]);
                                sb2.append(exifTag.secondaryFormat == -1 ? "" : ", " + strArr[exifTag.secondaryFormat]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) pairGuessDataFormat.first).intValue()]);
                                sb2.append(((Integer) pairGuessDataFormat.second).intValue() != -1 ? ", " + strArr[((Integer) pairGuessDataFormat.second).intValue()] : "");
                                sb2.append(")");
                                Log.d(TAG, sb2.toString());
                            }
                        } else {
                            i11 = exifTag.secondaryFormat;
                        }
                    }
                    switch (i11) {
                        case 1:
                            str3 = str5;
                            i12 = i15;
                            i13 = i16;
                            this.mAttributes[i17].put(str4, ExifAttribute.createByte(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            str3 = str5;
                            i12 = i15;
                            i13 = i16;
                            this.mAttributes[i17].put(str4, ExifAttribute.createString(strReplaceAll));
                            break;
                        case 3:
                            str3 = str5;
                            i12 = i15;
                            i13 = i16;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i21 = i13; i21 < strArrSplit.length; i21++) {
                                iArr[i21] = Integer.parseInt(strArrSplit[i21]);
                            }
                            this.mAttributes[i17].put(str4, ExifAttribute.createUShort(iArr, this.mExifByteOrder));
                            break;
                        case 4:
                            str3 = str5;
                            i12 = i15;
                            i13 = i16;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i22 = i13; i22 < strArrSplit2.length; i22++) {
                                jArr[i22] = Long.parseLong(strArrSplit2[i22]);
                            }
                            this.mAttributes[i17].put(str4, ExifAttribute.createULong(jArr, this.mExifByteOrder));
                            break;
                        case 5:
                            i12 = i15;
                            i13 = i16;
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            Rational[] rationalArr = new Rational[strArrSplit3.length];
                            int i23 = i13;
                            while (i23 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i23].split(str5, -1);
                                rationalArr[i23] = new Rational((long) Double.parseDouble(strArrSplit4[i13]), (long) Double.parseDouble(strArrSplit4[i12]));
                                i23++;
                                str5 = str5;
                            }
                            str3 = str5;
                            this.mAttributes[i17].put(str4, ExifAttribute.createURational(rationalArr, this.mExifByteOrder));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (DEBUG) {
                                Log.d(TAG, "Data format isn't one of expected formats: " + i11);
                            }
                            break;
                        case 9:
                            i12 = i15;
                            i13 = i16;
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i24 = i13; i24 < strArrSplit5.length; i24++) {
                                iArr2[i24] = Integer.parseInt(strArrSplit5[i24]);
                            }
                            this.mAttributes[i17].put(str4, ExifAttribute.createSLong(iArr2, this.mExifByteOrder));
                            str3 = str5;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            Rational[] rationalArr2 = new Rational[strArrSplit6.length];
                            int i25 = i16;
                            while (i25 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i25].split(str5, -1);
                                int i26 = i15;
                                int i27 = i25;
                                rationalArr2[i27] = new Rational((long) Double.parseDouble(strArrSplit7[i16]), (long) Double.parseDouble(strArrSplit7[i26]));
                                i25 = i27 + 1;
                                i15 = i26;
                                strArrSplit6 = strArrSplit6;
                                i16 = i16;
                            }
                            i12 = i15;
                            i13 = i16;
                            this.mAttributes[i17].put(str4, ExifAttribute.createSRational(rationalArr2, this.mExifByteOrder));
                            str3 = str5;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i28 = i16; i28 < strArrSplit8.length; i28++) {
                                dArr[i28] = Double.parseDouble(strArrSplit8[i28]);
                            }
                            this.mAttributes[i17].put(str4, ExifAttribute.createDouble(dArr, this.mExifByteOrder));
                            break;
                    }
                } else {
                    this.mAttributes[i17].remove(str4);
                }
                str3 = str5;
                i12 = i15;
                i13 = i16;
            } else {
                str3 = str5;
                i12 = i15;
                i13 = i16;
            }
            i17++;
            i15 = i12;
            i16 = i13;
            str5 = str3;
            i14 = 2;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setDateTime(Long l11) {
        if (l11 == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if (l11.longValue() < 0) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String string = Long.toString(l11.longValue() % 1000);
        for (int length = string.length(); length < 3; length++) {
            string = "0" + string;
        }
        setAttribute(TAG_DATETIME, sFormatterPrimary.format(new Date(l11.longValue())));
        setAttribute(TAG_SUBSEC_TIME, string);
    }

    public void setGpsInfo(Location location) {
        if (location == null) {
            return;
        }
        setAttribute(TAG_GPS_PROCESSING_METHOD, location.getProvider());
        setLatLong(location.getLatitude(), location.getLongitude());
        setAltitude(location.getAltitude());
        setAttribute(TAG_GPS_SPEED_REF, "K");
        setAttribute(TAG_GPS_SPEED, Rational.createFromDouble((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = sFormatterPrimary.format(new Date(location.getTime())).split("\\s+", -1);
        setAttribute(TAG_GPS_DATESTAMP, strArrSplit[0]);
        setAttribute(TAG_GPS_TIMESTAMP, strArrSplit[1]);
    }

    private void copyWebPChunk(ByteOrderedDataInputStream byteOrderedDataInputStream, ByteOrderedDataOutputStream byteOrderedDataOutputStream, byte[] bArr) throws IOException {
        int i11 = byteOrderedDataInputStream.readInt();
        byteOrderedDataOutputStream.write(bArr);
        byteOrderedDataOutputStream.writeInt(i11);
        if (i11 % 2 == 1) {
            i11++;
        }
        ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, i11);
    }

    private void getHeifAttributes(final SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i11) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 28) {
            if (i11 == 15 && i13 < 31) {
                throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    ExifInterfaceUtils.Api23Impl.setDataSource(mediaMetadataRetriever, new MediaDataSource() { // from class: androidx.exifinterface.media.ExifInterface.1
                        long mPosition;

                        @Override // android.media.MediaDataSource
                        public long getSize() throws IOException {
                            return -1L;
                        }

                        @Override // android.media.MediaDataSource
                        public int readAt(long j11, byte[] bArr, int i14, int i15) throws IOException {
                            if (i15 == 0) {
                                return 0;
                            }
                            if (j11 < 0) {
                                return -1;
                            }
                            try {
                                long j12 = this.mPosition;
                                if (j12 != j11) {
                                    if (j12 >= 0 && j11 >= j12 + ((long) seekableByteOrderedDataInputStream.available())) {
                                        return -1;
                                    }
                                    seekableByteOrderedDataInputStream.seek(j11);
                                    this.mPosition = j11;
                                }
                                if (i15 > seekableByteOrderedDataInputStream.available()) {
                                    i15 = seekableByteOrderedDataInputStream.available();
                                }
                                int i16 = seekableByteOrderedDataInputStream.read(bArr, i14, i15);
                                if (i16 >= 0) {
                                    this.mPosition += (long) i16;
                                    return i16;
                                }
                            } catch (IOException unused) {
                            }
                            this.mPosition = -1L;
                            return -1;
                        }

                        @Override // java.io.Closeable, java.lang.AutoCloseable
                        public void close() throws IOException {
                        }
                    });
                    String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                    String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                    String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                    String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(strExtractMetadata6)) {
                        strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                        strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                        strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(strExtractMetadata7)) {
                        strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                        strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                        strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        strExtractMetadata = null;
                        strExtractMetadata2 = null;
                        strExtractMetadata3 = null;
                    }
                    if (strExtractMetadata != null) {
                        this.mAttributes[0].put(TAG_IMAGE_WIDTH, ExifAttribute.createUShort(Integer.parseInt(strExtractMetadata), this.mExifByteOrder));
                    }
                    if (strExtractMetadata3 != null) {
                        this.mAttributes[0].put(TAG_IMAGE_LENGTH, ExifAttribute.createUShort(Integer.parseInt(strExtractMetadata3), this.mExifByteOrder));
                    }
                    if (strExtractMetadata2 != null) {
                        int i14 = Integer.parseInt(strExtractMetadata2);
                        if (i14 != 90) {
                            if (i14 != 180) {
                                if (i14 != 270) {
                                    i12 = 1;
                                } else {
                                    i12 = 8;
                                }
                            } else {
                                i12 = 3;
                            }
                        } else {
                            i12 = 6;
                        }
                        this.mAttributes[0].put(TAG_ORIENTATION, ExifAttribute.createUShort(i12, this.mExifByteOrder));
                    }
                    if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                        int i15 = Integer.parseInt(strExtractMetadata4);
                        int i16 = Integer.parseInt(strExtractMetadata5);
                        if (i16 > 6) {
                            seekableByteOrderedDataInputStream.seek(i15);
                            byte[] bArr = new byte[6];
                            seekableByteOrderedDataInputStream.readFully(bArr);
                            int i17 = i15 + 6;
                            int i18 = i16 - 6;
                            if (Arrays.equals(bArr, IDENTIFIER_EXIF_APP1)) {
                                byte[] bArr2 = new byte[i18];
                                seekableByteOrderedDataInputStream.readFully(bArr2);
                                this.mOffsetToExifData = i17;
                                readExifSegment(bArr2, 0);
                            } else {
                                throw new IOException("Invalid identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                    String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                    if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                        int i19 = Integer.parseInt(strExtractMetadata8);
                        int i21 = Integer.parseInt(strExtractMetadata9);
                        long j11 = i19;
                        seekableByteOrderedDataInputStream.seek(j11);
                        byte[] bArr3 = new byte[i21];
                        seekableByteOrderedDataInputStream.readFully(bArr3);
                        this.mXmpFromSeparateMarker = new ExifAttribute(1, i21, j11, bArr3);
                        this.mFileOnDiskContainsSeparateXmpMarker = true;
                    }
                    if (DEBUG) {
                        Log.d(TAG, "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                    }
                    try {
                        mediaMetadataRetriever.release();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } catch (Throwable th2) {
                    try {
                        mediaMetadataRetriever.release();
                        throw th2;
                    } catch (IOException unused2) {
                        throw th2;
                    }
                }
            } catch (RuntimeException e11) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e11);
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
    }

    private void getOrfAttributes(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        int i11;
        int i12;
        getRawAttributes(seekableByteOrderedDataInputStream);
        ExifAttribute exifAttribute = this.mAttributes[1].get(TAG_MAKER_NOTE);
        if (exifAttribute != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.bytes);
            seekableByteOrderedDataInputStream2.setByteOrder(this.mExifByteOrder);
            byte[] bArr = ORF_MAKER_NOTE_HEADER_1;
            byte[] bArr2 = new byte[bArr.length];
            seekableByteOrderedDataInputStream2.readFully(bArr2);
            seekableByteOrderedDataInputStream2.seek(0L);
            byte[] bArr3 = ORF_MAKER_NOTE_HEADER_2;
            byte[] bArr4 = new byte[bArr3.length];
            seekableByteOrderedDataInputStream2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                seekableByteOrderedDataInputStream2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                seekableByteOrderedDataInputStream2.seek(12L);
            }
            readImageFileDirectory(seekableByteOrderedDataInputStream2, 6);
            ExifAttribute exifAttribute2 = this.mAttributes[7].get(TAG_ORF_PREVIEW_IMAGE_START);
            ExifAttribute exifAttribute3 = this.mAttributes[7].get(TAG_ORF_PREVIEW_IMAGE_LENGTH);
            if (exifAttribute2 != null && exifAttribute3 != null) {
                this.mAttributes[5].put(TAG_JPEG_INTERCHANGE_FORMAT, exifAttribute2);
                this.mAttributes[5].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, exifAttribute3);
            }
            ExifAttribute exifAttribute4 = this.mAttributes[8].get(TAG_ORF_ASPECT_FRAME);
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.getValue(this.mExifByteOrder);
                if (iArr != null && iArr.length == 4) {
                    int i13 = iArr[2];
                    int i14 = iArr[0];
                    if (i13 > i14 && (i11 = iArr[3]) > (i12 = iArr[1])) {
                        int i15 = (i13 - i14) + 1;
                        int i16 = (i11 - i12) + 1;
                        if (i15 < i16) {
                            int i17 = i15 + i16;
                            i16 = i17 - i16;
                            i15 = i17 - i16;
                        }
                        ExifAttribute exifAttributeCreateUShort = ExifAttribute.createUShort(i15, this.mExifByteOrder);
                        ExifAttribute exifAttributeCreateUShort2 = ExifAttribute.createUShort(i16, this.mExifByteOrder);
                        this.mAttributes[0].put(TAG_IMAGE_WIDTH, exifAttributeCreateUShort);
                        this.mAttributes[0].put(TAG_IMAGE_LENGTH, exifAttributeCreateUShort2);
                        return;
                    }
                    return;
                }
                Log.w(TAG, "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    private void getRawAttributes(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        ExifAttribute exifAttribute;
        parseTiffHeaders(seekableByteOrderedDataInputStream);
        readImageFileDirectory(seekableByteOrderedDataInputStream, 0);
        updateImageSizeValues(seekableByteOrderedDataInputStream, 0);
        updateImageSizeValues(seekableByteOrderedDataInputStream, 5);
        updateImageSizeValues(seekableByteOrderedDataInputStream, 4);
        validateImages();
        if (this.mMimeType == 8 && (exifAttribute = this.mAttributes[1].get(TAG_MAKER_NOTE)) != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.bytes);
            seekableByteOrderedDataInputStream2.setByteOrder(this.mExifByteOrder);
            seekableByteOrderedDataInputStream2.skipFully(6);
            readImageFileDirectory(seekableByteOrderedDataInputStream2, 9);
            ExifAttribute exifAttribute2 = this.mAttributes[9].get(TAG_COLOR_SPACE);
            if (exifAttribute2 != null) {
                this.mAttributes[1].put(TAG_COLOR_SPACE, exifAttribute2);
            }
        }
    }

    private void parseTiffHeaders(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        ByteOrder byteOrder = readByteOrder(byteOrderedDataInputStream);
        this.mExifByteOrder = byteOrder;
        byteOrderedDataInputStream.setByteOrder(byteOrder);
        int unsignedShort = byteOrderedDataInputStream.readUnsignedShort();
        int i11 = this.mMimeType;
        if (i11 != 7 && i11 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i12 = byteOrderedDataInputStream.readInt();
        if (i12 >= 8) {
            int i13 = i12 - 8;
            if (i13 > 0) {
                byteOrderedDataInputStream.skipFully(i13);
                return;
            }
            return;
        }
        throw new IOException("Invalid first Ifd offset: " + i12);
    }

    private ByteOrder readByteOrder(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        short s11 = byteOrderedDataInputStream.readShort();
        if (s11 != 18761) {
            if (s11 == 19789) {
                if (DEBUG) {
                    Log.d(TAG, "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(s11));
        }
        if (DEBUG) {
            Log.d(TAG, "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public boolean hasAttribute(String str) {
        if (getExifAttribute(str) != null) {
            return true;
        }
        return false;
    }

    public double[] getLatLong() {
        String attribute = getAttribute(TAG_GPS_LATITUDE);
        String attribute2 = getAttribute(TAG_GPS_LATITUDE_REF);
        String attribute3 = getAttribute(TAG_GPS_LONGITUDE);
        String attribute4 = getAttribute(TAG_GPS_LONGITUDE_REF);
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return null;
        }
        try {
            return new double[]{convertRationalLatLonToDouble(attribute, attribute2), convertRationalLatLonToDouble(attribute3, attribute4)};
        } catch (IllegalArgumentException unused) {
            Log.w(TAG, "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", attribute, attribute2, attribute3, attribute4));
            return null;
        }
    }

    public void setLatLong(double d11, double d12) {
        String str;
        String str2;
        if (d11 >= -90.0d && d11 <= 90.0d && !Double.isNaN(d11)) {
            if (d12 >= -180.0d && d12 <= 180.0d && !Double.isNaN(d12)) {
                if (d11 >= 0.0d) {
                    str = "N";
                } else {
                    str = LATITUDE_SOUTH;
                }
                setAttribute(TAG_GPS_LATITUDE_REF, str);
                setAttribute(TAG_GPS_LATITUDE, convertDecimalDegree(Math.abs(d11)));
                if (d12 >= 0.0d) {
                    str2 = LONGITUDE_EAST;
                } else {
                    str2 = LONGITUDE_WEST;
                }
                setAttribute(TAG_GPS_LONGITUDE_REF, str2);
                setAttribute(TAG_GPS_LONGITUDE, convertDecimalDegree(Math.abs(d12)));
                return;
            }
            throw new IllegalArgumentException("Longitude value " + d12 + " is not valid.");
        }
        throw new IllegalArgumentException("Latitude value " + d11 + " is not valid.");
    }

    public ExifInterface(String str) throws Throwable {
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            initForFilename(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public ExifInterface(FileDescriptor fileDescriptor) throws Throwable {
        boolean z11;
        FileInputStream fileInputStream;
        Throwable th2;
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.mAssetInputStream = null;
            this.mFilename = null;
            if (isSeekableFD(fileDescriptor)) {
                this.mSeekableFileDescriptor = fileDescriptor;
                try {
                    fileDescriptor = Os.dup(fileDescriptor);
                    z11 = true;
                } catch (Exception e11) {
                    throw new IOException("Failed to duplicate file descriptor", e11);
                }
            } else {
                this.mSeekableFileDescriptor = null;
                z11 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    loadAttributes(fileInputStream);
                    ExifInterfaceUtils.closeQuietly(fileInputStream);
                    if (z11) {
                        ExifInterfaceUtils.closeFileDescriptor(fileDescriptor);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    ExifInterfaceUtils.closeQuietly(fileInputStream);
                    if (z11) {
                        ExifInterfaceUtils.closeFileDescriptor(fileDescriptor);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream = null;
                th2 = th4;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public ExifInterface(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    public ExifInterface(InputStream inputStream, int i11) throws IOException {
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.mFilename = null;
            boolean z11 = i11 == 1;
            this.mIsExifDataOnly = z11;
            if (z11) {
                this.mAssetInputStream = null;
                this.mSeekableFileDescriptor = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.mAssetInputStream = (AssetManager.AssetInputStream) inputStream;
                this.mSeekableFileDescriptor = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (isSeekableFD(fileInputStream.getFD())) {
                    this.mAssetInputStream = null;
                    this.mSeekableFileDescriptor = fileInputStream.getFD();
                } else {
                    this.mAssetInputStream = null;
                    this.mSeekableFileDescriptor = null;
                }
            } else {
                this.mAssetInputStream = null;
                this.mSeekableFileDescriptor = null;
            }
            loadAttributes(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
