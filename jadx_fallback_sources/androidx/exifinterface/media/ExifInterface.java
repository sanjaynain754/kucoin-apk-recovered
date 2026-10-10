package androidx.exifinterface.media;

/* JADX INFO: loaded from: classes.dex */
public class ExifInterface {
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    private static final java.nio.charset.Charset ASCII = null;
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = null;
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = null;
    public static final int[] BITS_PER_SAMPLE_RGB = null;
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
    private static final java.util.regex.Pattern DATETIME_PRIMARY_FORMAT_PATTERN = null;
    private static final java.util.regex.Pattern DATETIME_SECONDARY_FORMAT_PATTERN = null;
    private static final int DATETIME_VALUE_STRING_LENGTH = 19;
    private static final boolean DEBUG = false;
    private static final byte[] EXIF_ASCII_PREFIX = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] EXIF_POINTER_TAGS = null;
    static final androidx.exifinterface.media.ExifInterface.ExifTag[][] EXIF_TAGS = null;
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
    private static final java.util.List<java.lang.Integer> FLIPPED_ROTATION_ORDER = null;
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final java.lang.String GPS_DIRECTION_MAGNETIC = "M";
    public static final java.lang.String GPS_DIRECTION_TRUE = "T";
    public static final java.lang.String GPS_DISTANCE_KILOMETERS = "K";
    public static final java.lang.String GPS_DISTANCE_MILES = "M";
    public static final java.lang.String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final java.lang.String GPS_MEASUREMENT_2D = "2";
    public static final java.lang.String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final java.lang.String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final java.lang.String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final java.lang.String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final java.lang.String GPS_SPEED_KNOTS = "N";
    public static final java.lang.String GPS_SPEED_MILES_PER_HOUR = "M";
    private static final java.util.regex.Pattern GPS_TIMESTAMP_PATTERN = null;
    private static final byte[] HEIF_BRAND_AVIF = null;
    private static final byte[] HEIF_BRAND_AVIS = null;
    private static final byte[] HEIF_BRAND_HEIC = null;
    private static final byte[] HEIF_BRAND_MIF1 = null;
    private static final byte[] HEIF_TYPE_FTYP = null;

    @androidx.annotation.VisibleForTesting
    static final byte[] IDENTIFIER_EXIF_APP1 = null;
    private static final byte[] IDENTIFIER_XMP_APP1 = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_EXIF_TAGS = null;
    private static final int IFD_FORMAT_BYTE = 1;
    private static final int[] IFD_FORMAT_BYTES_PER_FORMAT = null;
    private static final int IFD_FORMAT_DOUBLE = 12;
    private static final int IFD_FORMAT_IFD = 13;
    private static final java.lang.String[] IFD_FORMAT_NAMES = null;
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
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_GPS_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_INTEROPERABILITY_TAGS = null;
    private static final int IFD_OFFSET = 8;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_THUMBNAIL_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] IFD_TIFF_TAGS = null;
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
    static final byte[] JPEG_SIGNATURE = null;
    public static final java.lang.String LATITUDE_NORTH = "N";
    public static final java.lang.String LATITUDE_SOUTH = "S";
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
    public static final java.lang.String LONGITUDE_EAST = "E";
    public static final java.lang.String LONGITUDE_WEST = "W";
    private static final byte MARKER = -1;

    @androidx.annotation.VisibleForTesting
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
    private static final byte MARKER_SOI = -40;
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
    private static final java.util.regex.Pattern NON_ZERO_TIME_PATTERN = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] ORF_CAMERA_SETTINGS_TAGS = null;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] ORF_IMAGE_PROCESSING_TAGS = null;
    private static final byte[] ORF_MAKER_NOTE_HEADER_1 = null;
    private static final int ORF_MAKER_NOTE_HEADER_1_SIZE = 8;
    private static final byte[] ORF_MAKER_NOTE_HEADER_2 = null;
    private static final int ORF_MAKER_NOTE_HEADER_2_SIZE = 12;
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] ORF_MAKER_NOTE_TAGS = null;
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
    private static final java.lang.String PEF_SIGNATURE = "PENTAX";
    private static final androidx.exifinterface.media.ExifInterface.ExifTag[] PEF_TAGS = null;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
    private static final int PNG_CHUNK_CRC_BYTE_LENGTH = 4;
    private static final int PNG_CHUNK_TYPE_EXIF = 1700284774;
    private static final int PNG_CHUNK_TYPE_IEND = 1229278788;
    private static final int PNG_CHUNK_TYPE_IHDR = 1229472850;
    private static final int PNG_CHUNK_TYPE_ITXT = 1767135348;

    @androidx.annotation.VisibleForTesting
    static final byte[] PNG_ITXT_XMP_KEYWORD = null;
    private static final byte[] PNG_SIGNATURE = null;
    private static final int RAF_OFFSET_TO_JPEG_IMAGE_OFFSET = 84;
    private static final java.lang.String RAF_SIGNATURE = "FUJIFILMCCD-RAW";
    private static final java.util.Set<java.lang.String> RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY = null;
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;
    private static final java.util.List<java.lang.Integer> ROTATION_ORDER = null;
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
    private static final java.lang.String TAG = "ExifInterface";
    public static final java.lang.String TAG_APERTURE_VALUE = "ApertureValue";
    public static final java.lang.String TAG_ARTIST = "Artist";
    public static final java.lang.String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final java.lang.String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final java.lang.String TAG_BRIGHTNESS_VALUE = "BrightnessValue";

    @java.lang.Deprecated
    public static final java.lang.String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final java.lang.String TAG_CAMERA_OWNER_NAME = "CameraOwnerName";
    public static final java.lang.String TAG_CFA_PATTERN = "CFAPattern";
    public static final java.lang.String TAG_COLOR_SPACE = "ColorSpace";
    public static final java.lang.String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final java.lang.String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final java.lang.String TAG_COMPRESSION = "Compression";
    public static final java.lang.String TAG_CONTRAST = "Contrast";
    public static final java.lang.String TAG_COPYRIGHT = "Copyright";
    public static final java.lang.String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final java.lang.String TAG_DATETIME = "DateTime";
    public static final java.lang.String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final java.lang.String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final java.lang.String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final java.lang.String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final java.lang.String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final java.lang.String TAG_DNG_VERSION = "DNGVersion";
    private static final java.lang.String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    public static final java.lang.String TAG_EXIF_VERSION = "ExifVersion";
    public static final java.lang.String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final java.lang.String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final java.lang.String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final java.lang.String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final java.lang.String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final java.lang.String TAG_FILE_SOURCE = "FileSource";
    public static final java.lang.String TAG_FLASH = "Flash";
    public static final java.lang.String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final java.lang.String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final java.lang.String TAG_FOCAL_LENGTH = "FocalLength";
    public static final java.lang.String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final java.lang.String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final java.lang.String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final java.lang.String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final java.lang.String TAG_F_NUMBER = "FNumber";
    public static final java.lang.String TAG_GAIN_CONTROL = "GainControl";
    public static final java.lang.String TAG_GAMMA = "Gamma";
    public static final java.lang.String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final java.lang.String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final java.lang.String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final java.lang.String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final java.lang.String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final java.lang.String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final java.lang.String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final java.lang.String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final java.lang.String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final java.lang.String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final java.lang.String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final java.lang.String TAG_GPS_DOP = "GPSDOP";
    public static final java.lang.String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final java.lang.String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final java.lang.String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    private static final java.lang.String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    public static final java.lang.String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final java.lang.String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final java.lang.String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final java.lang.String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final java.lang.String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final java.lang.String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final java.lang.String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final java.lang.String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final java.lang.String TAG_GPS_SPEED = "GPSSpeed";
    public static final java.lang.String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final java.lang.String TAG_GPS_STATUS = "GPSStatus";
    public static final java.lang.String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final java.lang.String TAG_GPS_TRACK = "GPSTrack";
    public static final java.lang.String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final java.lang.String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final java.lang.String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final java.lang.String TAG_IMAGE_LENGTH = "ImageLength";
    public static final java.lang.String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final java.lang.String TAG_IMAGE_WIDTH = "ImageWidth";
    private static final java.lang.String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    public static final java.lang.String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final java.lang.String TAG_ISO_SPEED = "ISOSpeed";
    public static final java.lang.String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final java.lang.String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";

    @java.lang.Deprecated
    public static final java.lang.String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final java.lang.String TAG_LENS_MAKE = "LensMake";
    public static final java.lang.String TAG_LENS_MODEL = "LensModel";
    public static final java.lang.String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final java.lang.String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final java.lang.String TAG_LIGHT_SOURCE = "LightSource";
    public static final java.lang.String TAG_MAKE = "Make";
    public static final java.lang.String TAG_MAKER_NOTE = "MakerNote";
    public static final java.lang.String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final java.lang.String TAG_METERING_MODE = "MeteringMode";
    public static final java.lang.String TAG_MODEL = "Model";
    public static final java.lang.String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final java.lang.String TAG_OECF = "OECF";
    public static final java.lang.String TAG_OFFSET_TIME = "OffsetTime";
    public static final java.lang.String TAG_OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized";
    public static final java.lang.String TAG_OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal";
    public static final java.lang.String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    private static final java.lang.String TAG_ORF_CAMERA_SETTINGS_IFD_POINTER = "CameraSettingsIFDPointer";
    private static final java.lang.String TAG_ORF_IMAGE_PROCESSING_IFD_POINTER = "ImageProcessingIFDPointer";
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final java.lang.String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final java.lang.String TAG_ORIENTATION = "Orientation";
    public static final java.lang.String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final java.lang.String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final java.lang.String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final java.lang.String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final java.lang.String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final java.lang.String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    private static final androidx.exifinterface.media.ExifInterface.ExifTag TAG_RAF_IMAGE_SIZE = null;
    public static final java.lang.String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final java.lang.String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final java.lang.String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final java.lang.String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final java.lang.String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final java.lang.String TAG_RW2_ISO = "ISO";
    public static final java.lang.String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final java.lang.String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final java.lang.String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final java.lang.String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final java.lang.String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final java.lang.String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final java.lang.String TAG_SATURATION = "Saturation";
    public static final java.lang.String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final java.lang.String TAG_SCENE_TYPE = "SceneType";
    public static final java.lang.String TAG_SENSING_METHOD = "SensingMethod";
    public static final java.lang.String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final java.lang.String TAG_SHARPNESS = "Sharpness";
    public static final java.lang.String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final java.lang.String TAG_SOFTWARE = "Software";
    public static final java.lang.String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final java.lang.String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final java.lang.String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    public static final java.lang.String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final java.lang.String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final java.lang.String TAG_SUBFILE_TYPE = "SubfileType";
    public static final java.lang.String TAG_SUBJECT_AREA = "SubjectArea";
    public static final java.lang.String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final java.lang.String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final java.lang.String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final java.lang.String TAG_SUBSEC_TIME = "SubSecTime";
    public static final java.lang.String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final java.lang.String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    private static final java.lang.String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    public static final java.lang.String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final java.lang.String TAG_USER_COMMENT = "UserComment";
    public static final java.lang.String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final java.lang.String TAG_WHITE_POINT = "WhitePoint";
    public static final java.lang.String TAG_XMP = "Xmp";
    public static final java.lang.String TAG_X_RESOLUTION = "XResolution";
    public static final java.lang.String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final java.lang.String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final java.lang.String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final java.lang.String TAG_Y_RESOLUTION = "YResolution";
    private static final int WEBP_CHUNK_SIZE_BYTE_LENGTH = 4;
    private static final byte[] WEBP_CHUNK_TYPE_ANIM = null;
    private static final byte[] WEBP_CHUNK_TYPE_ANMF = null;
    private static final int WEBP_CHUNK_TYPE_BYTE_LENGTH = 4;
    private static final byte[] WEBP_CHUNK_TYPE_EXIF = null;
    private static final byte[] WEBP_CHUNK_TYPE_VP8 = null;
    private static final byte[] WEBP_CHUNK_TYPE_VP8L = null;
    private static final byte[] WEBP_CHUNK_TYPE_VP8X = null;
    private static final int WEBP_CHUNK_TYPE_VP8X_DEFAULT_LENGTH = 10;
    private static final int WEBP_FILE_SIZE_BYTE_LENGTH = 4;
    private static final byte[] WEBP_SIGNATURE_1 = null;
    private static final byte[] WEBP_SIGNATURE_2 = null;
    private static final byte WEBP_VP8L_SIGNATURE = 47;
    private static final byte[] WEBP_VP8_SIGNATURE = null;

    @java.lang.Deprecated
    public static final int WHITEBALANCE_AUTO = 0;

    @java.lang.Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;
    private static final int XMP_HANDLING_PREFER_SEPARATE = 2;
    private static final int XMP_HANDLING_PREFER_TIFF_700_IF_PRESENT = 3;
    private static final int XMP_HANDLING_TIFF_700_ONLY = 1;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> sExifPointerTagMap = null;
    private static final java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface.ExifTag>[] sExifTagMapsForReading = null;
    private static final java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifTag>[] sExifTagMapsForWriting = null;
    private static final java.text.SimpleDateFormat sFormatterPrimary = null;
    private static final java.text.SimpleDateFormat sFormatterSecondary = null;
    private boolean mAreThumbnailStripsConsecutive;
    private android.content.res.AssetManager.AssetInputStream mAssetInputStream;
    private final java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>[] mAttributes;
    private java.util.Set<java.lang.Integer> mAttributesOffsets;
    private java.nio.ByteOrder mExifByteOrder;
    private boolean mFileOnDiskContainsSeparateXmpMarker;
    private java.lang.String mFilename;
    private boolean mHasThumbnail;
    private boolean mHasThumbnailStrips;
    private boolean mIsExifDataOnly;
    private int mMimeType;
    private boolean mModified;
    private int mOffsetToExifData;
    private int mOrfMakerNoteOffset;
    private int mOrfThumbnailLength;
    private int mOrfThumbnailOffset;
    private java.io.FileDescriptor mSeekableFileDescriptor;
    private byte[] mThumbnailBytes;
    private int mThumbnailCompression;
    private int mThumbnailLength;
    private int mThumbnailOffset;
    private androidx.exifinterface.media.ExifInterface.ExifAttribute mXmpFromSeparateMarker;


    public static class ByteOrderedDataInputStream extends java.io.InputStream implements java.io.DataInput {
        public static final int LENGTH_UNSET = -1;
        private java.nio.ByteOrder mByteOrder;
        protected final java.io.DataInputStream mDataInputStream;
        private int mLength;
        protected int mPosition;
        private byte[] mSkipBuffer;

        public ByteOrderedDataInputStream(java.io.InputStream r2) throws java.io.IOException {
                r1 = this;
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r1.<init>(r2, r0)
                return
        }

        public ByteOrderedDataInputStream(java.io.InputStream r3, java.nio.ByteOrder r4) {
                r2 = this;
                r2.<init>()
                java.io.DataInputStream r0 = new java.io.DataInputStream
                r0.<init>(r3)
                r2.mDataInputStream = r0
                r1 = 0
                r0.mark(r1)
                r2.mPosition = r1
                r2.mByteOrder = r4
                boolean r4 = r3 instanceof androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream
                if (r4 == 0) goto L1d
                androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r3 = (androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream) r3
                int r3 = r3.length()
                goto L1e
            L1d:
                r3 = -1
            L1e:
                r2.mLength = r3
                return
        }

        public ByteOrderedDataInputStream(byte[] r3) throws java.io.IOException {
                r2 = this;
                java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                r0.<init>(r3)
                java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
                r2.<init>(r0, r1)
                int r3 = r3.length
                r2.mLength = r3
                return
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
                r1 = this;
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.available()
                return r0
        }

        public int length() {
                r1 = this;
                int r0 = r1.mLength
                return r0
        }

        @Override // java.io.InputStream
        public void mark(int r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Mark is currently unsupported"
                r2.<init>(r0)
                throw r2
        }

        public int position() {
                r1 = this;
                int r0 = r1.mPosition
                return r0
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.read()
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r2 = r0.read(r2, r3, r4)
                int r3 = r1.mPosition
                int r3 = r3 + r2
                r1.mPosition = r3
                return r2
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                boolean r0 = r0.readBoolean()
                return r0
        }

        @Override // java.io.DataInput
        public byte readByte() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.read()
                if (r0 < 0) goto L10
                byte r0 = (byte) r0
                return r0
            L10:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public char readChar() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 2
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                char r0 = r0.readChar()
                return r0
        }

        @Override // java.io.DataInput
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readLong()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // java.io.DataInput
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readInt()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // java.io.DataInput
        public void readFully(byte[] r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.mPosition
                int r1 = r3.length
                int r0 = r0 + r1
                r2.mPosition = r0
                java.io.DataInputStream r0 = r2.mDataInputStream
                r0.readFully(r3)
                return
        }

        @Override // java.io.DataInput
        public void readFully(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + r4
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                r0.readFully(r2, r3, r4)
                return
        }

        @Override // java.io.DataInput
        public int readInt() throws java.io.IOException {
                r6 = this;
                int r0 = r6.mPosition
                int r0 = r0 + 4
                r6.mPosition = r0
                java.io.DataInputStream r0 = r6.mDataInputStream
                int r0 = r0.read()
                java.io.DataInputStream r1 = r6.mDataInputStream
                int r1 = r1.read()
                java.io.DataInputStream r2 = r6.mDataInputStream
                int r2 = r2.read()
                java.io.DataInputStream r3 = r6.mDataInputStream
                int r3 = r3.read()
                r4 = r0 | r1
                r4 = r4 | r2
                r4 = r4 | r3
                if (r4 < 0) goto L5b
                java.nio.ByteOrder r4 = r6.mByteOrder
                java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
                if (r4 != r5) goto L34
                int r3 = r3 << 24
                int r2 = r2 << 16
                int r3 = r3 + r2
                int r1 = r1 << 8
                int r3 = r3 + r1
                int r3 = r3 + r0
                return r3
            L34:
                java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
                if (r4 != r5) goto L42
                int r0 = r0 << 24
                int r1 = r1 << 16
                int r0 = r0 + r1
                int r1 = r2 << 8
                int r0 = r0 + r1
                int r0 = r0 + r3
                return r0
            L42:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid byte order: "
                r1.append(r2)
                java.nio.ByteOrder r2 = r6.mByteOrder
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L5b:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public java.lang.String readLine() throws java.io.IOException {
                r2 = this;
                java.lang.String r0 = "ExifInterface"
                java.lang.String r1 = "Currently unsupported"
                android.util.Log.d(r0, r1)
                r0 = 0
                return r0
        }

        @Override // java.io.DataInput
        public long readLong() throws java.io.IOException {
                r19 = this;
                r0 = r19
                int r1 = r0.mPosition
                r2 = 8
                int r1 = r1 + r2
                r0.mPosition = r1
                java.io.DataInputStream r1 = r0.mDataInputStream
                int r1 = r1.read()
                java.io.DataInputStream r3 = r0.mDataInputStream
                int r3 = r3.read()
                java.io.DataInputStream r4 = r0.mDataInputStream
                int r4 = r4.read()
                java.io.DataInputStream r5 = r0.mDataInputStream
                int r5 = r5.read()
                java.io.DataInputStream r6 = r0.mDataInputStream
                int r6 = r6.read()
                java.io.DataInputStream r7 = r0.mDataInputStream
                int r7 = r7.read()
                java.io.DataInputStream r8 = r0.mDataInputStream
                int r8 = r8.read()
                java.io.DataInputStream r9 = r0.mDataInputStream
                int r9 = r9.read()
                r10 = r1 | r3
                r10 = r10 | r4
                r10 = r10 | r5
                r10 = r10 | r6
                r10 = r10 | r7
                r10 = r10 | r8
                r10 = r10 | r9
                if (r10 < 0) goto Lad
                java.nio.ByteOrder r10 = r0.mByteOrder
                java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
                r14 = 32
                r15 = 40
                r16 = 48
                r17 = 56
                if (r10 != r11) goto L70
                long r9 = (long) r9
                long r9 = r9 << r17
                r11 = 16
                r18 = 24
                long r12 = (long) r8
                long r12 = r12 << r16
                long r9 = r9 + r12
                long r7 = (long) r7
                long r7 = r7 << r15
                long r9 = r9 + r7
                long r6 = (long) r6
                long r6 = r6 << r14
                long r9 = r9 + r6
                long r5 = (long) r5
                long r5 = r5 << r18
                long r9 = r9 + r5
                long r4 = (long) r4
                long r4 = r4 << r11
                long r9 = r9 + r4
                long r3 = (long) r3
                long r2 = r3 << r2
                long r9 = r9 + r2
                long r1 = (long) r1
                long r9 = r9 + r1
                return r9
            L70:
                r11 = 16
                r18 = 24
                java.nio.ByteOrder r12 = java.nio.ByteOrder.BIG_ENDIAN
                if (r10 != r12) goto L94
                long r12 = (long) r1
                long r12 = r12 << r17
                r1 = r2
                long r2 = (long) r3
                long r2 = r2 << r16
                long r12 = r12 + r2
                long r2 = (long) r4
                long r2 = r2 << r15
                long r12 = r12 + r2
                long r2 = (long) r5
                long r2 = r2 << r14
                long r12 = r12 + r2
                long r2 = (long) r6
                long r2 = r2 << r18
                long r12 = r12 + r2
                long r2 = (long) r7
                long r2 = r2 << r11
                long r12 = r12 + r2
                long r2 = (long) r8
                long r1 = r2 << r1
                long r12 = r12 + r1
                long r1 = (long) r9
                long r12 = r12 + r1
                return r12
            L94:
                java.io.IOException r1 = new java.io.IOException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid byte order: "
                r2.append(r3)
                java.nio.ByteOrder r3 = r0.mByteOrder
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Lad:
                java.io.EOFException r1 = new java.io.EOFException
                r1.<init>()
                throw r1
        }

        @Override // java.io.DataInput
        public short readShort() throws java.io.IOException {
                r4 = this;
                int r0 = r4.mPosition
                int r0 = r0 + 2
                r4.mPosition = r0
                java.io.DataInputStream r0 = r4.mDataInputStream
                int r0 = r0.read()
                java.io.DataInputStream r1 = r4.mDataInputStream
                int r1 = r1.read()
                r2 = r0 | r1
                if (r2 < 0) goto L43
                java.nio.ByteOrder r2 = r4.mByteOrder
                java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
                if (r2 != r3) goto L21
                int r1 = r1 << 8
                int r1 = r1 + r0
                short r0 = (short) r1
                return r0
            L21:
                java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
                if (r2 != r3) goto L2a
                int r0 = r0 << 8
                int r0 = r0 + r1
                short r0 = (short) r0
                return r0
            L2a:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid byte order: "
                r1.append(r2)
                java.nio.ByteOrder r2 = r4.mByteOrder
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L43:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        public byte[] readToEnd() throws java.io.IOException {
                r4 = this;
                r0 = 1024(0x400, float:1.435E-42)
                byte[] r0 = new byte[r0]
                r1 = 0
            L5:
                int r2 = r0.length
                if (r1 != r2) goto Lf
                int r2 = r0.length
                int r2 = r2 * 2
                byte[] r0 = java.util.Arrays.copyOf(r0, r2)
            Lf:
                java.io.DataInputStream r2 = r4.mDataInputStream
                int r3 = r0.length
                int r3 = r3 - r1
                int r2 = r2.read(r0, r1, r3)
                r3 = -1
                if (r2 == r3) goto L21
                int r1 = r1 + r2
                int r3 = r4.mPosition
                int r3 = r3 + r2
                r4.mPosition = r3
                goto L5
            L21:
                byte[] r0 = java.util.Arrays.copyOf(r0, r1)
                return r0
        }

        @Override // java.io.DataInput
        public java.lang.String readUTF() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 2
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                java.lang.String r0 = r0.readUTF()
                return r0
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws java.io.IOException {
                r1 = this;
                int r0 = r1.mPosition
                int r0 = r0 + 1
                r1.mPosition = r0
                java.io.DataInputStream r0 = r1.mDataInputStream
                int r0 = r0.readUnsignedByte()
                return r0
        }

        public long readUnsignedInt() throws java.io.IOException {
                r4 = this;
                int r0 = r4.readInt()
                long r0 = (long) r0
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r0 = r0 & r2
                return r0
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws java.io.IOException {
                r4 = this;
                int r0 = r4.mPosition
                int r0 = r0 + 2
                r4.mPosition = r0
                java.io.DataInputStream r0 = r4.mDataInputStream
                int r0 = r0.read()
                java.io.DataInputStream r1 = r4.mDataInputStream
                int r1 = r1.read()
                r2 = r0 | r1
                if (r2 < 0) goto L41
                java.nio.ByteOrder r2 = r4.mByteOrder
                java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
                if (r2 != r3) goto L20
                int r1 = r1 << 8
                int r1 = r1 + r0
                return r1
            L20:
                java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
                if (r2 != r3) goto L28
                int r0 = r0 << 8
                int r0 = r0 + r1
                return r0
            L28:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid byte order: "
                r1.append(r2)
                java.nio.ByteOrder r2 = r4.mByteOrder
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L41:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.InputStream
        public void reset() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Reset is currently unsupported"
                r0.<init>(r1)
                throw r0
        }

        public void setByteOrder(java.nio.ByteOrder r1) {
                r0 = this;
                r0.mByteOrder = r1
                return
        }

        @Override // java.io.DataInput
        public int skipBytes(int r2) throws java.io.IOException {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "skipBytes is currently unsupported"
                r2.<init>(r0)
                throw r2
        }

        public void skipFully(int r7) throws java.io.IOException {
                r6 = this;
                r0 = 0
                r1 = r0
            L2:
                if (r1 >= r7) goto L48
                java.io.DataInputStream r2 = r6.mDataInputStream
                int r3 = r7 - r1
                long r4 = (long) r3
                long r4 = r2.skip(r4)
                int r2 = (int) r4
                if (r2 > 0) goto L46
                byte[] r2 = r6.mSkipBuffer
                r4 = 8192(0x2000, float:1.148E-41)
                if (r2 != 0) goto L1a
                byte[] r2 = new byte[r4]
                r6.mSkipBuffer = r2
            L1a:
                int r2 = java.lang.Math.min(r4, r3)
                java.io.DataInputStream r3 = r6.mDataInputStream
                byte[] r4 = r6.mSkipBuffer
                int r2 = r3.read(r4, r0, r2)
                r3 = -1
                if (r2 == r3) goto L2a
                goto L46
            L2a:
                java.io.EOFException r0 = new java.io.EOFException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Reached EOF while skipping "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = " bytes."
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            L46:
                int r1 = r1 + r2
                goto L2
            L48:
                int r7 = r6.mPosition
                int r7 = r7 + r1
                r6.mPosition = r7
                return
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class ByteOrderedDataOutputStream extends java.io.FilterOutputStream {
        private java.nio.ByteOrder mByteOrder;
        final java.io.DataOutputStream mOutputStream;

        public ByteOrderedDataOutputStream(java.io.OutputStream r2, java.nio.ByteOrder r3) {
                r1 = this;
                r1.<init>(r2)
                java.io.DataOutputStream r0 = new java.io.DataOutputStream
                r0.<init>(r2)
                r1.mOutputStream = r0
                r1.mByteOrder = r3
                return
        }

        public void setByteOrder(java.nio.ByteOrder r1) {
                r0 = this;
                r0.mByteOrder = r1
                return
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] r2) throws java.io.IOException {
                r1 = this;
                java.io.DataOutputStream r0 = r1.mOutputStream
                r0.write(r2)
                return
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.io.DataOutputStream r0 = r1.mOutputStream
                r0.write(r2, r3, r4)
                return
        }

        public void writeByte(int r2) throws java.io.IOException {
                r1 = this;
                java.io.DataOutputStream r0 = r1.mOutputStream
                r0.write(r2)
                return
        }

        public void writeInt(int r3) throws java.io.IOException {
                r2 = this;
                java.nio.ByteOrder r0 = r2.mByteOrder
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                if (r0 != r1) goto L29
                java.io.DataOutputStream r0 = r2.mOutputStream
                r1 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.DataOutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 8
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.DataOutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 16
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.DataOutputStream r0 = r2.mOutputStream
                int r3 = r3 >>> 24
                r3 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r3)
                return
            L29:
                java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
                if (r0 != r1) goto L4f
                java.io.DataOutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 24
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.DataOutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 16
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.DataOutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 8
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.DataOutputStream r0 = r2.mOutputStream
                r3 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r3)
            L4f:
                return
        }

        public void writeShort(short r3) throws java.io.IOException {
                r2 = this;
                java.nio.ByteOrder r0 = r2.mByteOrder
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                if (r0 != r1) goto L17
                java.io.DataOutputStream r0 = r2.mOutputStream
                r1 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.DataOutputStream r0 = r2.mOutputStream
                int r3 = r3 >>> 8
                r3 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r3)
                return
            L17:
                java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
                if (r0 != r1) goto L2b
                java.io.DataOutputStream r0 = r2.mOutputStream
                int r1 = r3 >>> 8
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.DataOutputStream r0 = r2.mOutputStream
                r3 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r3)
            L2b:
                return
        }

        public void writeUnsignedInt(long r3) throws java.io.IOException {
                r2 = this;
                r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 > 0) goto Le
                int r3 = (int) r3
                r2.writeInt(r3)
                return
            Le:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "val is larger than the maximum value of a 32-bit unsigned integer"
                r3.<init>(r4)
                throw r3
        }

        public void writeUnsignedShort(int r2) throws java.io.IOException {
                r1 = this;
                r0 = 65535(0xffff, float:9.1834E-41)
                if (r2 > r0) goto La
                short r2 = (short) r2
                r1.writeShort(r2)
                return
            La:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "val is larger than the maximum value of a 16-bit unsigned integer"
                r2.<init>(r0)
                throw r2
        }
    }

    public static class ExifAttribute {
        public static final long BYTES_OFFSET_UNKNOWN = -1;
        public final byte[] bytes;
        public final long bytesOffset;
        public final int format;
        public final int numberOfComponents;

        public ExifAttribute(int r1, int r2, long r3, byte[] r5) {
                r0 = this;
                r0.<init>()
                r0.format = r1
                r0.numberOfComponents = r2
                r0.bytesOffset = r3
                r0.bytes = r5
                return
        }

        public ExifAttribute(int r7, int r8, byte[] r9) {
                r6 = this;
                r3 = -1
                r0 = r6
                r1 = r7
                r2 = r8
                r5 = r9
                r0.<init>(r1, r2, r3, r5)
                return
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createByte(java.lang.String r5) {
                r0 = 0
                int r1 = r5.length()
                r2 = 1
                if (r1 != r2) goto L28
                char r1 = r5.charAt(r0)
                r3 = 48
                if (r1 < r3) goto L28
                char r1 = r5.charAt(r0)
                r4 = 49
                if (r1 > r4) goto L28
                char r5 = r5.charAt(r0)
                int r5 = r5 - r3
                byte r5 = (byte) r5
                byte[] r1 = new byte[r2]
                r1[r0] = r5
                androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                r5.<init>(r2, r2, r1)
                return r5
            L28:
                java.nio.charset.Charset r0 = androidx.exifinterface.media.ExifInterface.access$100()
                byte[] r5 = r5.getBytes(r0)
                androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r1 = r5.length
                r0.<init>(r2, r1, r5)
                return r0
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createDouble(double[] r5, java.nio.ByteOrder r6) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.access$000()
                r1 = 12
                r0 = r0[r1]
                int r2 = r5.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r6)
                int r6 = r5.length
                r2 = 0
            L15:
                if (r2 >= r6) goto L1f
                r3 = r5[r2]
                r0.putDouble(r3)
                int r2 = r2 + 1
                goto L15
            L1f:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r5 = r5.length
                byte[] r0 = r0.array()
                r6.<init>(r1, r5, r0)
                return r6
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createSLong(int[] r4, java.nio.ByteOrder r5) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.access$000()
                r1 = 9
                r0 = r0[r1]
                int r2 = r4.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r5)
                int r5 = r4.length
                r2 = 0
            L15:
                if (r2 >= r5) goto L1f
                r3 = r4[r2]
                r0.putInt(r3)
                int r2 = r2 + 1
                goto L15
            L1f:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r4 = r4.length
                byte[] r0 = r0.array()
                r5.<init>(r1, r4, r0)
                return r5
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createSRational(androidx.exifinterface.media.ExifInterface.Rational[] r6, java.nio.ByteOrder r7) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.access$000()
                r1 = 10
                r0 = r0[r1]
                int r2 = r6.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r7)
                int r7 = r6.length
                r2 = 0
            L15:
                if (r2 >= r7) goto L28
                r3 = r6[r2]
                long r4 = r3.numerator
                int r4 = (int) r4
                r0.putInt(r4)
                long r3 = r3.denominator
                int r3 = (int) r3
                r0.putInt(r3)
                int r2 = r2 + 1
                goto L15
            L28:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r6 = r6.length
                byte[] r0 = r0.array()
                r7.<init>(r1, r6, r0)
                return r7
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createString(java.lang.String r3) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                r3 = 0
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.nio.charset.Charset r0 = androidx.exifinterface.media.ExifInterface.access$100()
                byte[] r3 = r3.getBytes(r0)
                androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r1 = r3.length
                r2 = 2
                r0.<init>(r2, r1, r3)
                return r0
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createULong(long r2, java.nio.ByteOrder r4) {
                r0 = 1
                long[] r0 = new long[r0]
                r1 = 0
                r0[r1] = r2
                androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = createULong(r0, r4)
                return r2
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createULong(long[] r5, java.nio.ByteOrder r6) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.access$000()
                r1 = 4
                r0 = r0[r1]
                int r2 = r5.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r6)
                int r6 = r5.length
                r2 = 0
            L14:
                if (r2 >= r6) goto L1f
                r3 = r5[r2]
                int r3 = (int) r3
                r0.putInt(r3)
                int r2 = r2 + 1
                goto L14
            L1f:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r5 = r5.length
                byte[] r0 = r0.array()
                r6.<init>(r1, r5, r0)
                return r6
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createURational(androidx.exifinterface.media.ExifInterface.Rational r0, java.nio.ByteOrder r1) {
                androidx.exifinterface.media.ExifInterface$Rational[] r0 = new androidx.exifinterface.media.ExifInterface.Rational[]{r0}
                androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = createURational(r0, r1)
                return r0
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createURational(androidx.exifinterface.media.ExifInterface.Rational[] r6, java.nio.ByteOrder r7) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.access$000()
                r1 = 5
                r0 = r0[r1]
                int r2 = r6.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r7)
                int r7 = r6.length
                r2 = 0
            L14:
                if (r2 >= r7) goto L27
                r3 = r6[r2]
                long r4 = r3.numerator
                int r4 = (int) r4
                r0.putInt(r4)
                long r3 = r3.denominator
                int r3 = (int) r3
                r0.putInt(r3)
                int r2 = r2 + 1
                goto L14
            L27:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r6 = r6.length
                byte[] r0 = r0.array()
                r7.<init>(r1, r6, r0)
                return r7
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort(int r0, java.nio.ByteOrder r1) {
                int[] r0 = new int[]{r0}
                androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = createUShort(r0, r1)
                return r0
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort(int[] r4, java.nio.ByteOrder r5) {
                int[] r0 = androidx.exifinterface.media.ExifInterface.access$000()
                r1 = 3
                r0 = r0[r1]
                int r2 = r4.length
                int r0 = r0 * r2
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                r0.order(r5)
                int r5 = r4.length
                r2 = 0
            L14:
                if (r2 >= r5) goto L1f
                r3 = r4[r2]
                short r3 = (short) r3
                r0.putShort(r3)
                int r2 = r2 + 1
                goto L14
            L1f:
                androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
                int r4 = r4.length
                byte[] r0 = r0.array()
                r5.<init>(r1, r4, r0)
                return r5
        }

        public double getDoubleValue(java.nio.ByteOrder r5) {
                r4 = this;
                java.lang.Object r5 = r4.getValue(r5)
                if (r5 == 0) goto L6b
                boolean r0 = r5 instanceof java.lang.String
                if (r0 == 0) goto L11
                java.lang.String r5 = (java.lang.String) r5
                double r0 = java.lang.Double.parseDouble(r5)
                return r0
            L11:
                boolean r0 = r5 instanceof long[]
                java.lang.String r1 = "There are more than one component"
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L28
                long[] r5 = (long[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L22
                r0 = r5[r2]
                double r0 = (double) r0
                return r0
            L22:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r1)
                throw r5
            L28:
                boolean r0 = r5 instanceof int[]
                if (r0 == 0) goto L3b
                int[] r5 = (int[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L35
                r5 = r5[r2]
                double r0 = (double) r5
                return r0
            L35:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r1)
                throw r5
            L3b:
                boolean r0 = r5 instanceof double[]
                if (r0 == 0) goto L4d
                double[] r5 = (double[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L47
                r0 = r5[r2]
                return r0
            L47:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r1)
                throw r5
            L4d:
                boolean r0 = r5 instanceof androidx.exifinterface.media.ExifInterface.Rational[]
                if (r0 == 0) goto L63
                androidx.exifinterface.media.ExifInterface$Rational[] r5 = (androidx.exifinterface.media.ExifInterface.Rational[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L5d
                r5 = r5[r2]
                double r0 = r5.calculate()
                return r0
            L5d:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r1)
                throw r5
            L63:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "Couldn't find a double value"
                r5.<init>(r0)
                throw r5
            L6b:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "NULL can't be converted to a double value"
                r5.<init>(r0)
                throw r5
        }

        public int getIntValue(java.nio.ByteOrder r5) {
                r4 = this;
                java.lang.Object r5 = r4.getValue(r5)
                if (r5 == 0) goto L42
                boolean r0 = r5 instanceof java.lang.String
                if (r0 == 0) goto L11
                java.lang.String r5 = (java.lang.String) r5
                int r5 = java.lang.Integer.parseInt(r5)
                return r5
            L11:
                boolean r0 = r5 instanceof long[]
                java.lang.String r1 = "There are more than one component"
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L28
                long[] r5 = (long[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L22
                r0 = r5[r2]
                int r5 = (int) r0
                return r5
            L22:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r1)
                throw r5
            L28:
                boolean r0 = r5 instanceof int[]
                if (r0 == 0) goto L3a
                int[] r5 = (int[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L34
                r5 = r5[r2]
                return r5
            L34:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r1)
                throw r5
            L3a:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "Couldn't find a integer value"
                r5.<init>(r0)
                throw r5
            L42:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "NULL can't be converted to a integer value"
                r5.<init>(r0)
                throw r5
        }

        public java.lang.String getStringValue(java.nio.ByteOrder r8) {
                r7 = this;
                java.lang.Object r8 = r7.getValue(r8)
                r0 = 0
                if (r8 != 0) goto L8
                return r0
            L8:
                boolean r1 = r8 instanceof java.lang.String
                if (r1 == 0) goto Lf
                java.lang.String r8 = (java.lang.String) r8
                return r8
            Lf:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                boolean r2 = r8 instanceof long[]
                java.lang.String r3 = ","
                r4 = 0
                if (r2 == 0) goto L33
                long[] r8 = (long[]) r8
            L1d:
                int r0 = r8.length
                if (r4 >= r0) goto L2e
                r5 = r8[r4]
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L1d
                r1.append(r3)
                goto L1d
            L2e:
                java.lang.String r8 = r1.toString()
                return r8
            L33:
                boolean r2 = r8 instanceof int[]
                if (r2 == 0) goto L4f
                int[] r8 = (int[]) r8
            L39:
                int r0 = r8.length
                if (r4 >= r0) goto L4a
                r0 = r8[r4]
                r1.append(r0)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L39
                r1.append(r3)
                goto L39
            L4a:
                java.lang.String r8 = r1.toString()
                return r8
            L4f:
                boolean r2 = r8 instanceof double[]
                if (r2 == 0) goto L6b
                double[] r8 = (double[]) r8
            L55:
                int r0 = r8.length
                if (r4 >= r0) goto L66
                r5 = r8[r4]
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L55
                r1.append(r3)
                goto L55
            L66:
                java.lang.String r8 = r1.toString()
                return r8
            L6b:
                boolean r2 = r8 instanceof androidx.exifinterface.media.ExifInterface.Rational[]
                if (r2 == 0) goto L95
                androidx.exifinterface.media.ExifInterface$Rational[] r8 = (androidx.exifinterface.media.ExifInterface.Rational[]) r8
            L71:
                int r0 = r8.length
                if (r4 >= r0) goto L90
                r0 = r8[r4]
                long r5 = r0.numerator
                r1.append(r5)
                r0 = 47
                r1.append(r0)
                r0 = r8[r4]
                long r5 = r0.denominator
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L71
                r1.append(r3)
                goto L71
            L90:
                java.lang.String r8 = r1.toString()
                return r8
            L95:
                return r0
        }

        public java.lang.Object getValue(java.nio.ByteOrder r14) {
                r13 = this;
                r0 = 0
                r1 = 1
                java.lang.String r2 = "IOException occurred while closing InputStream"
                java.lang.String r3 = "ExifInterface"
                r4 = 0
                androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r5 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L190
                byte[] r6 = r13.bytes     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L190
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L190
                r5.setByteOrder(r14)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r14 = r13.format     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                switch(r14) {
                    case 1: goto L15a;
                    case 2: goto L108;
                    case 3: goto Lef;
                    case 4: goto Ld6;
                    case 5: goto Lb3;
                    case 6: goto L15a;
                    case 7: goto L108;
                    case 8: goto L9a;
                    case 9: goto L81;
                    case 10: goto L5c;
                    case 11: goto L42;
                    case 12: goto L20;
                    default: goto L16;
                }
            L16:
                r5.close()     // Catch: java.io.IOException -> L1a
                return r4
            L1a:
                r0 = move-exception
                r14 = r0
                android.util.Log.e(r3, r2, r14)
                return r4
            L20:
                int r14 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                double[] r14 = new double[r14]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
            L24:
                int r6 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r0 >= r6) goto L39
                double r6 = r5.readDouble()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r14[r0] = r6     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r0 = r0 + r1
                goto L24
            L30:
                r0 = move-exception
                r14 = r0
                r4 = r5
                goto L1a4
            L35:
                r0 = move-exception
                r14 = r0
                goto L193
            L39:
                r5.close()     // Catch: java.io.IOException -> L3d
                return r14
            L3d:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
                return r14
            L42:
                int r14 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                double[] r14 = new double[r14]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
            L46:
                int r6 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r0 >= r6) goto L53
                float r6 = r5.readFloat()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                double r6 = (double) r6     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r14[r0] = r6     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r0 = r0 + r1
                goto L46
            L53:
                r5.close()     // Catch: java.io.IOException -> L57
                return r14
            L57:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
                return r14
            L5c:
                int r14 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                androidx.exifinterface.media.ExifInterface$Rational[] r14 = new androidx.exifinterface.media.ExifInterface.Rational[r14]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
            L60:
                int r6 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r0 >= r6) goto L78
                int r6 = r5.readInt()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                long r8 = (long) r6     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r6 = r5.readInt()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                long r10 = (long) r6     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                androidx.exifinterface.media.ExifInterface$Rational r7 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r12 = 0
                r7.<init>(r8, r10, r12)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r14[r0] = r7     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r0 = r0 + r1
                goto L60
            L78:
                r5.close()     // Catch: java.io.IOException -> L7c
                return r14
            L7c:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
                return r14
            L81:
                int r14 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int[] r14 = new int[r14]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
            L85:
                int r6 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r0 >= r6) goto L91
                int r6 = r5.readInt()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r14[r0] = r6     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r0 = r0 + r1
                goto L85
            L91:
                r5.close()     // Catch: java.io.IOException -> L95
                return r14
            L95:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
                return r14
            L9a:
                int r14 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int[] r14 = new int[r14]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
            L9e:
                int r6 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r0 >= r6) goto Laa
                short r6 = r5.readShort()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r14[r0] = r6     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r0 = r0 + r1
                goto L9e
            Laa:
                r5.close()     // Catch: java.io.IOException -> Lae
                return r14
            Lae:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
                return r14
            Lb3:
                int r14 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                androidx.exifinterface.media.ExifInterface$Rational[] r14 = new androidx.exifinterface.media.ExifInterface.Rational[r14]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
            Lb7:
                int r6 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r0 >= r6) goto Lcd
                long r8 = r5.readUnsignedInt()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                long r10 = r5.readUnsignedInt()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                androidx.exifinterface.media.ExifInterface$Rational r7 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r12 = 0
                r7.<init>(r8, r10, r12)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r14[r0] = r7     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r0 = r0 + r1
                goto Lb7
            Lcd:
                r5.close()     // Catch: java.io.IOException -> Ld1
                return r14
            Ld1:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
                return r14
            Ld6:
                int r14 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                long[] r14 = new long[r14]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
            Lda:
                int r6 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r0 >= r6) goto Le6
                long r6 = r5.readUnsignedInt()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r14[r0] = r6     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r0 = r0 + r1
                goto Lda
            Le6:
                r5.close()     // Catch: java.io.IOException -> Lea
                return r14
            Lea:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
                return r14
            Lef:
                int r14 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int[] r14 = new int[r14]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
            Lf3:
                int r6 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r0 >= r6) goto Lff
                int r6 = r5.readUnsignedShort()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r14[r0] = r6     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r0 = r0 + r1
                goto Lf3
            Lff:
                r5.close()     // Catch: java.io.IOException -> L103
                return r14
            L103:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
                return r14
            L108:
                int r14 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                byte[] r6 = androidx.exifinterface.media.ExifInterface.access$300()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r6 = r6.length     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r14 < r6) goto L12d
                r14 = r0
            L112:
                byte[] r6 = androidx.exifinterface.media.ExifInterface.access$300()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r6 = r6.length     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r14 >= r6) goto L128
                byte[] r6 = r13.bytes     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r6 = r6[r14]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                byte[] r7 = androidx.exifinterface.media.ExifInterface.access$300()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r7 = r7[r14]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r6 == r7) goto L126
                goto L12d
            L126:
                int r14 = r14 + r1
                goto L112
            L128:
                byte[] r14 = androidx.exifinterface.media.ExifInterface.access$300()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r0 = r14.length     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
            L12d:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r14.<init>()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
            L132:
                int r6 = r13.numberOfComponents     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r0 >= r6) goto L14d
                byte[] r6 = r13.bytes     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r6 = r6[r0]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r6 != 0) goto L13d
                goto L14d
            L13d:
                r7 = 32
                if (r6 < r7) goto L146
                char r6 = (char) r6     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r14.append(r6)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                goto L14b
            L146:
                r6 = 63
                r14.append(r6)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
            L14b:
                int r0 = r0 + r1
                goto L132
            L14d:
                java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r5.close()     // Catch: java.io.IOException -> L155
                return r14
            L155:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
                return r14
            L15a:
                byte[] r14 = r13.bytes     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r6 = r14.length     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r6 != r1) goto L17a
                r6 = r14[r0]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                if (r6 < 0) goto L17a
                if (r6 > r1) goto L17a
                java.lang.String r14 = new java.lang.String     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r1[r0] = r6     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r14.<init>(r1)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r5.close()     // Catch: java.io.IOException -> L175
                return r14
            L175:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
                return r14
            L17a:
                java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                java.nio.charset.Charset r0 = androidx.exifinterface.media.ExifInterface.access$100()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r1.<init>(r14, r0)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r5.close()     // Catch: java.io.IOException -> L187
                return r1
            L187:
                r0 = move-exception
                r14 = r0
                android.util.Log.e(r3, r2, r14)
                return r1
            L18d:
                r0 = move-exception
                r14 = r0
                goto L1a4
            L190:
                r0 = move-exception
                r14 = r0
                r5 = r4
            L193:
                java.lang.String r0 = "IOException occurred during reading a value"
                android.util.Log.w(r3, r0, r14)     // Catch: java.lang.Throwable -> L30
                if (r5 == 0) goto L1a3
                r5.close()     // Catch: java.io.IOException -> L19e
                goto L1a3
            L19e:
                r0 = move-exception
                r14 = r0
                android.util.Log.e(r3, r2, r14)
            L1a3:
                return r4
            L1a4:
                if (r4 == 0) goto L1ae
                r4.close()     // Catch: java.io.IOException -> L1aa
                goto L1ae
            L1aa:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L1ae:
                throw r14
        }

        public int size() {
                r2 = this;
                int[] r0 = androidx.exifinterface.media.ExifInterface.access$000()
                int r1 = r2.format
                r0 = r0[r1]
                int r1 = r2.numberOfComponents
                int r0 = r0 * r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "("
                r0.append(r1)
                java.lang.String[] r1 = androidx.exifinterface.media.ExifInterface.access$200()
                int r2 = r3.format
                r1 = r1[r2]
                r0.append(r1)
                java.lang.String r1 = ", data length:"
                r0.append(r1)
                byte[] r1 = r3.bytes
                int r1 = r1.length
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface ExifStreamType {
    }

    public static class ExifTag {
        public final java.lang.String name;
        public final int number;
        public final int primaryFormat;
        public final int secondaryFormat;

        public ExifTag(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.number = r2
                r0.primaryFormat = r3
                r1 = -1
                r0.secondaryFormat = r1
                return
        }

        public ExifTag(java.lang.String r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.number = r2
                r0.primaryFormat = r3
                r0.secondaryFormat = r4
                return
        }

        public boolean isFormatCompatible(int r5) {
                r4 = this;
                int r0 = r4.primaryFormat
                r1 = 1
                r2 = 7
                if (r0 == r2) goto L31
                if (r5 != r2) goto L9
                goto L31
            L9:
                if (r0 == r5) goto L31
                int r2 = r4.secondaryFormat
                if (r2 != r5) goto L10
                goto L31
            L10:
                r3 = 4
                if (r0 == r3) goto L15
                if (r2 != r3) goto L19
            L15:
                r3 = 3
                if (r5 != r3) goto L19
                return r1
            L19:
                r3 = 9
                if (r0 == r3) goto L1f
                if (r2 != r3) goto L24
            L1f:
                r3 = 8
                if (r5 != r3) goto L24
                return r1
            L24:
                r3 = 12
                if (r0 == r3) goto L2a
                if (r2 != r3) goto L2f
            L2a:
                r0 = 11
                if (r5 != r0) goto L2f
                return r1
            L2f:
                r5 = 0
                return r5
            L31:
                return r1
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface IfdType {
    }

    /* JADX INFO: loaded from: classes34.dex */
    @androidx.annotation.VisibleForTesting
    public static class Rational {
        public final long denominator;
        public final long numerator;

        private Rational(long r4, long r6) {
                r3 = this;
                r3.<init>()
                r0 = 0
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 != 0) goto L10
                r3.numerator = r0
                r4 = 1
                r3.denominator = r4
                return
            L10:
                r3.numerator = r4
                r3.denominator = r6
                return
        }

        public /* synthetic */ Rational(long r1, long r3, androidx.exifinterface.media.ExifInterface.C25131 r5) {
                r0 = this;
                r0.<init>(r1, r3)
                return
        }

        public static androidx.exifinterface.media.ExifInterface.Rational createFromDouble(double r23) {
                r0 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
                int r0 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
                r3 = 1
                if (r0 >= 0) goto Le
                r5 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
                int r0 = (r23 > r5 ? 1 : (r23 == r5 ? 0 : -1))
                if (r0 > 0) goto L11
            Le:
                r21 = 0
                goto L50
            L11:
                double r5 = java.lang.Math.abs(r23)
                r7 = 4487126258331716666(0x3e45798ee2308c3a, double:1.0E-8)
                double r7 = r7 * r5
                r9 = 0
                r11 = r3
                r15 = r5
                r13 = r9
            L20:
                r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r19 = r15 % r17
                r21 = 0
                double r1 = r15 - r19
                long r0 = (long) r1
                long r15 = r0 * r3
                long r13 = r13 + r15
                long r0 = r0 * r9
                long r0 = r0 + r11
                double r15 = r17 / r19
                double r11 = (double) r13
                r17 = r3
                double r2 = (double) r0
                double r11 = r11 / r2
                double r2 = r5 - r11
                double r2 = java.lang.Math.abs(r2)
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 > 0) goto L4a
                androidx.exifinterface.media.ExifInterface$Rational r2 = new androidx.exifinterface.media.ExifInterface$Rational
                int r3 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
                if (r3 >= 0) goto L46
                long r13 = -r13
            L46:
                r2.<init>(r13, r0)
                return r2
            L4a:
                r11 = r9
                r3 = r13
                r13 = r17
                r9 = r0
                goto L20
            L50:
                androidx.exifinterface.media.ExifInterface$Rational r0 = new androidx.exifinterface.media.ExifInterface$Rational
                int r1 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
                if (r1 <= 0) goto L5c
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L5e
            L5c:
                r1 = -9223372036854775808
            L5e:
                r0.<init>(r1, r3)
                return r0
        }

        public double calculate() {
                r4 = this;
                long r0 = r4.numerator
                double r0 = (double) r0
                long r2 = r4.denominator
                double r2 = (double) r2
                double r0 = r0 / r2
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r1 = r3.numerator
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                long r1 = r3.denominator
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class SeekableByteOrderedDataInputStream extends androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream {
        public SeekableByteOrderedDataInputStream(java.io.InputStream r2) throws java.io.IOException {
                r1 = this;
                r1.<init>(r2)
                boolean r2 = r2.markSupported()
                if (r2 == 0) goto L12
                java.io.DataInputStream r2 = r1.mDataInputStream
                r0 = 2147483647(0x7fffffff, float:NaN)
                r2.mark(r0)
                return
            L12:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset"
                r2.<init>(r0)
                throw r2
        }

        public SeekableByteOrderedDataInputStream(byte[] r2) throws java.io.IOException {
                r1 = this;
                r1.<init>(r2)
                java.io.DataInputStream r2 = r1.mDataInputStream
                r0 = 2147483647(0x7fffffff, float:NaN)
                r2.mark(r0)
                return
        }

        public void seek(long r4) throws java.io.IOException {
                r3 = this;
                int r0 = r3.mPosition
                long r1 = (long) r0
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 <= 0) goto L10
                r0 = 0
                r3.mPosition = r0
                java.io.DataInputStream r0 = r3.mDataInputStream
                r0.reset()
                goto L12
            L10:
                long r0 = (long) r0
                long r4 = r4 - r0
            L12:
                int r4 = (int) r4
                r3.skipFully(r4)
                return
        }
    }

    static {
            java.lang.String r0 = "ExifInterface"
            r1 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            androidx.exifinterface.media.ExifInterface.DEBUG = r0
            r0 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Integer[] r5 = new java.lang.Integer[]{r3, r5, r2, r7}
            java.util.List r5 = java.util.Arrays.asList(r5)
            androidx.exifinterface.media.ExifInterface.ROTATION_ORDER = r5
            r5 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r9 = 7
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r13 = 5
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            java.lang.Integer[] r12 = new java.lang.Integer[]{r8, r10, r12, r14}
            java.util.List r12 = java.util.Arrays.asList(r12)
            androidx.exifinterface.media.ExifInterface.FLIPPED_ROTATION_ORDER = r12
            int[] r12 = new int[]{r6, r6, r6}
            androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_RGB = r12
            int[] r12 = new int[]{r11}
            androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_GREYSCALE_1 = r12
            int[] r12 = new int[]{r6}
            androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_GREYSCALE_2 = r12
            byte[] r12 = new byte[r1]
            r12 = {x0bc0: FILL_ARRAY_DATA , data: [-1, -40, -1} // fill-array
            androidx.exifinterface.media.ExifInterface.JPEG_SIGNATURE = r12
            byte[] r12 = new byte[r11]
            r12 = {x0bc6: FILL_ARRAY_DATA , data: [102, 116, 121, 112} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_TYPE_FTYP = r12
            byte[] r12 = new byte[r11]
            r12 = {x0bcc: FILL_ARRAY_DATA , data: [109, 105, 102, 49} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_BRAND_MIF1 = r12
            byte[] r12 = new byte[r11]
            r12 = {x0bd2: FILL_ARRAY_DATA , data: [104, 101, 105, 99} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_BRAND_HEIC = r12
            byte[] r12 = new byte[r11]
            r12 = {x0bd8: FILL_ARRAY_DATA , data: [97, 118, 105, 102} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_BRAND_AVIF = r12
            byte[] r12 = new byte[r11]
            r12 = {x0bde: FILL_ARRAY_DATA , data: [97, 118, 105, 115} // fill-array
            androidx.exifinterface.media.ExifInterface.HEIF_BRAND_AVIS = r12
            byte[] r15 = new byte[r4]
            r15 = {x0be4: FILL_ARRAY_DATA , data: [79, 76, 89, 77, 80, 0} // fill-array
            androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_1 = r15
            r15 = 10
            byte[] r12 = new byte[r15]
            r12 = {x0bec: FILL_ARRAY_DATA , data: [79, 76, 89, 77, 80, 85, 83, 0, 73, 73} // fill-array
            androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_2 = r12
            byte[] r12 = new byte[r6]
            r12 = {x0bf6: FILL_ARRAY_DATA , data: [-119, 80, 78, 71, 13, 10, 26, 10} // fill-array
            androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE = r12
            java.lang.String r12 = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000"
            java.nio.charset.Charset r15 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r12 = r12.getBytes(r15)
            androidx.exifinterface.media.ExifInterface.PNG_ITXT_XMP_KEYWORD = r12
            byte[] r12 = new byte[r11]
            r12 = {x0bfe: FILL_ARRAY_DATA , data: [82, 73, 70, 70} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1 = r12
            byte[] r12 = new byte[r11]
            r12 = {x0c04: FILL_ARRAY_DATA , data: [87, 69, 66, 80} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2 = r12
            byte[] r12 = new byte[r11]
            r12 = {x0c0a: FILL_ARRAY_DATA , data: [69, 88, 73, 70} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_EXIF = r12
            byte[] r12 = new byte[r1]
            r12 = {x0c10: FILL_ARRAY_DATA , data: [-99, 1, 42} // fill-array
            androidx.exifinterface.media.ExifInterface.WEBP_VP8_SIGNATURE = r12
            java.lang.String r12 = "VP8X"
            java.nio.charset.Charset r15 = java.nio.charset.Charset.defaultCharset()
            byte[] r12 = r12.getBytes(r15)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8X = r12
            java.lang.String r12 = "VP8L"
            java.nio.charset.Charset r15 = java.nio.charset.Charset.defaultCharset()
            byte[] r12 = r12.getBytes(r15)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L = r12
            java.lang.String r12 = "VP8 "
            java.nio.charset.Charset r15 = java.nio.charset.Charset.defaultCharset()
            byte[] r12 = r12.getBytes(r15)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8 = r12
            java.lang.String r12 = "ANIM"
            java.nio.charset.Charset r15 = java.nio.charset.Charset.defaultCharset()
            byte[] r12 = r12.getBytes(r15)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANIM = r12
            java.lang.String r12 = "ANMF"
            java.nio.charset.Charset r15 = java.nio.charset.Charset.defaultCharset()
            byte[] r12 = r12.getBytes(r15)
            androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANMF = r12
            java.lang.String r32 = "DOUBLE"
            java.lang.String r33 = "IFD"
            java.lang.String r20 = ""
            java.lang.String r21 = "BYTE"
            java.lang.String r22 = "STRING"
            java.lang.String r23 = "USHORT"
            java.lang.String r24 = "ULONG"
            java.lang.String r25 = "URATIONAL"
            java.lang.String r26 = "SBYTE"
            java.lang.String r27 = "UNDEFINED"
            java.lang.String r28 = "SSHORT"
            java.lang.String r29 = "SLONG"
            java.lang.String r30 = "SRATIONAL"
            java.lang.String r31 = "SINGLE"
            java.lang.String[] r12 = new java.lang.String[]{r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}
            androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES = r12
            r12 = 14
            int[] r12 = new int[r12]
            r12 = {x0c16: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1} // fill-array
            androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT = r12
            byte[] r12 = new byte[r6]
            r12 = {x0c36: FILL_ARRAY_DATA , data: [65, 83, 67, 73, 73, 0, 0, 0} // fill-array
            androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX = r12
            androidx.exifinterface.media.ExifInterface$ExifTag r12 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "NewSubfileType"
            r6 = 254(0xfe, float:3.56E-43)
            r12.<init>(r15, r6, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "SubfileType"
            r0 = 255(0xff, float:3.57E-43)
            r6.<init>(r15, r0, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "ImageWidth"
            r9 = 256(0x100, float:3.59E-43)
            r0.<init>(r15, r9, r1, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r15 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "ImageLength"
            r4 = 257(0x101, float:3.6E-43)
            r15.<init>(r9, r4, r1, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r4 = "BitsPerSample"
            r13 = 258(0x102, float:3.62E-43)
            r9.<init>(r4, r13, r1)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "Compression"
            r11 = 259(0x103, float:3.63E-43)
            r4.<init>(r13, r11, r1)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "PhotometricInterpretation"
            r5 = 262(0x106, float:3.67E-43)
            r11.<init>(r13, r5, r1)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "ImageDescription"
            r1 = 270(0x10e, float:3.78E-43)
            r22 = r0
            r0 = 2
            r5.<init>(r13, r1, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "Make"
            r25 = r4
            r4 = 271(0x10f, float:3.8E-43)
            r1.<init>(r13, r4, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "Model"
            r28 = r1
            r1 = 272(0x110, float:3.81E-43)
            r4.<init>(r13, r1, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r1 = "StripOffsets"
            r13 = 273(0x111, float:3.83E-43)
            r29 = r4
            r27 = r5
            r4 = 3
            r5 = 4
            r0.<init>(r1, r13, r4, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "Orientation"
            r30 = r0
            r0 = 274(0x112, float:3.84E-43)
            r5.<init>(r13, r0, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "SamplesPerPixel"
            r31 = r5
            r5 = 277(0x115, float:3.88E-43)
            r0.<init>(r13, r5, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "RowsPerStrip"
            r32 = r0
            r0 = 278(0x116, float:3.9E-43)
            r21 = r6
            r6 = 4
            r5.<init>(r13, r0, r4, r6)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "StripByteCounts"
            r33 = r5
            r5 = 279(0x117, float:3.91E-43)
            r0.<init>(r13, r5, r4, r6)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "XResolution"
            r6 = 282(0x11a, float:3.95E-43)
            r13 = 5
            r4.<init>(r5, r6, r13)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "YResolution"
            r34 = r0
            r0 = 283(0x11b, float:3.97E-43)
            r5.<init>(r6, r0, r13)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "PlanarConfiguration"
            r13 = 284(0x11c, float:3.98E-43)
            r35 = r4
            r4 = 3
            r0.<init>(r6, r13, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "ResolutionUnit"
            r37 = r0
            r0 = 296(0x128, float:4.15E-43)
            r6.<init>(r13, r0, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "TransferFunction"
            r36 = r5
            r5 = 301(0x12d, float:4.22E-43)
            r0.<init>(r13, r5, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "Software"
            r13 = 305(0x131, float:4.27E-43)
            r39 = r0
            r0 = 2
            r4.<init>(r5, r13, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "DateTime"
            r40 = r4
            r4 = 306(0x132, float:4.29E-43)
            r5.<init>(r13, r4, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "Artist"
            r41 = r5
            r5 = 315(0x13b, float:4.41E-43)
            r4.<init>(r13, r5, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "WhitePoint"
            r13 = 318(0x13e, float:4.46E-43)
            r42 = r4
            r4 = 5
            r0.<init>(r5, r13, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "PrimaryChromaticities"
            r43 = r0
            r0 = 319(0x13f, float:4.47E-43)
            r5.<init>(r13, r0, r4)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r4 = "SubIFDPointer"
            r13 = 330(0x14a, float:4.62E-43)
            r44 = r5
            r5 = 4
            r0.<init>(r4, r13, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r13 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r45 = r0
            java.lang.String r0 = "JPEGInterchangeFormat"
            r38 = r6
            r6 = 513(0x201, float:7.19E-43)
            r13.<init>(r0, r6, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "JPEGInterchangeFormatLength"
            r24 = r9
            r9 = 514(0x202, float:7.2E-43)
            r0.<init>(r6, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "YCbCrCoefficients"
            r9 = 529(0x211, float:7.41E-43)
            r47 = r0
            r0 = 5
            r5.<init>(r6, r9, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "YCbCrSubSampling"
            r9 = 530(0x212, float:7.43E-43)
            r48 = r5
            r5 = 3
            r0.<init>(r6, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "YCbCrPositioning"
            r49 = r0
            r0 = 531(0x213, float:7.44E-43)
            r6.<init>(r9, r0, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "ReferenceBlackWhite"
            r9 = 532(0x214, float:7.45E-43)
            r50 = r6
            r6 = 5
            r0.<init>(r5, r9, r6)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "Copyright"
            r9 = 33432(0x8298, float:4.6848E-41)
            r51 = r0
            r0 = 2
            r5.<init>(r6, r9, r0)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r6 = "ExifIFDPointer"
            r9 = 34665(0x8769, float:4.8576E-41)
            r52 = r5
            r5 = 4
            r0.<init>(r6, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r53 = r0
            java.lang.String r0 = "GPSInfoIFDPointer"
            r26 = r11
            r11 = 34853(0x8825, float:4.884E-41)
            r9.<init>(r0, r11, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r54 = r9
            java.lang.String r9 = "SensorTopBorder"
            r11.<init>(r9, r5, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r55 = r11
            java.lang.String r11 = "SensorLeftBorder"
            r20 = r12
            r12 = 5
            r9.<init>(r11, r12, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r12 = "SensorBottomBorder"
            r56 = r9
            r9 = 6
            r11.<init>(r12, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r12 = "SensorRightBorder"
            r57 = r11
            r11 = 7
            r9.<init>(r12, r11, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r12 = "ISO"
            r11 = 23
            r58 = r9
            r9 = 3
            r5.<init>(r12, r11, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "JpgFromRaw"
            r12 = 46
            r59 = r5
            r5 = 7
            r9.<init>(r11, r12, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "Xmp"
            r12 = 700(0x2bc, float:9.81E-43)
            r60 = r9
            r9 = 1
            r5.<init>(r11, r12, r9)
            r61 = r5
            r46 = r13
            r23 = r15
            androidx.exifinterface.media.ExifInterface$ExifTag[] r67 = new androidx.exifinterface.media.ExifInterface.ExifTag[]{r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61}
            androidx.exifinterface.media.ExifInterface.IFD_TIFF_TAGS = r67
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "ExposureTime"
            r11 = 33434(0x829a, float:4.6851E-41)
            r12 = 5
            r5.<init>(r9, r11, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "FNumber"
            r13 = 33437(0x829d, float:4.6855E-41)
            r9.<init>(r11, r13, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r12 = "ExposureProgram"
            r13 = 34850(0x8822, float:4.8835E-41)
            r15 = 3
            r11.<init>(r12, r13, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r12 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "SpectralSensitivity"
            r15 = 34852(0x8824, float:4.8838E-41)
            r68 = r5
            r5 = 2
            r12.<init>(r13, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "PhotographicSensitivity"
            r15 = 34855(0x8827, float:4.8842E-41)
            r69 = r9
            r9 = 3
            r5.<init>(r13, r15, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r13 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "OECF"
            r9 = 34856(0x8828, float:4.8844E-41)
            r72 = r5
            r5 = 7
            r13.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "SensitivityType"
            r15 = 34864(0x8830, float:4.8855E-41)
            r70 = r11
            r11 = 3
            r5.<init>(r9, r15, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "StandardOutputSensitivity"
            r15 = 34865(0x8831, float:4.8856E-41)
            r74 = r5
            r5 = 4
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "RecommendedExposureIndex"
            r75 = r9
            r9 = 34866(0x8832, float:4.8858E-41)
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "ISOSpeed"
            r76 = r11
            r11 = 34867(0x8833, float:4.8859E-41)
            r9.<init>(r15, r11, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "ISOSpeedLatitudeyyy"
            r77 = r9
            r9 = 34868(0x8834, float:4.886E-41)
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "ISOSpeedLatitudezzz"
            r78 = r11
            r11 = 34869(0x8835, float:4.8862E-41)
            r9.<init>(r15, r11, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "ExifVersion"
            r15 = 36864(0x9000, float:5.1657E-41)
            r79 = r9
            r9 = 2
            r5.<init>(r11, r15, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "DateTimeOriginal"
            r80 = r5
            r5 = 36867(0x9003, float:5.1662E-41)
            r11.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "DateTimeDigitized"
            r81 = r11
            r11 = 36868(0x9004, float:5.1663E-41)
            r5.<init>(r15, r11, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "OffsetTime"
            r82 = r5
            r5 = 36880(0x9010, float:5.168E-41)
            r11.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "OffsetTimeOriginal"
            r83 = r11
            r11 = 36881(0x9011, float:5.1681E-41)
            r5.<init>(r15, r11, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "OffsetTimeDigitized"
            r84 = r5
            r5 = 36882(0x9012, float:5.1683E-41)
            r11.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "ComponentsConfiguration"
            r15 = 37121(0x9101, float:5.2018E-41)
            r85 = r11
            r11 = 7
            r5.<init>(r9, r15, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "CompressedBitsPerPixel"
            r15 = 37122(0x9102, float:5.2019E-41)
            r86 = r5
            r5 = 5
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "ShutterSpeedValue"
            r5 = 37377(0x9201, float:5.2376E-41)
            r87 = r9
            r9 = 10
            r11.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "ApertureValue"
            r9 = 37378(0x9202, float:5.2378E-41)
            r88 = r11
            r11 = 5
            r5.<init>(r15, r9, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "BrightnessValue"
            r15 = 37379(0x9203, float:5.2379E-41)
            r89 = r5
            r5 = 10
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "ExposureBiasValue"
            r90 = r9
            r9 = 37380(0x9204, float:5.238E-41)
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "MaxApertureValue"
            r15 = 37381(0x9205, float:5.2382E-41)
            r91 = r11
            r11 = 5
            r5.<init>(r9, r15, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "SubjectDistance"
            r92 = r5
            r5 = 37382(0x9206, float:5.2383E-41)
            r9.<init>(r15, r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "MeteringMode"
            r15 = 37383(0x9207, float:5.2385E-41)
            r93 = r9
            r9 = 3
            r5.<init>(r11, r15, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "LightSource"
            r94 = r5
            r5 = 37384(0x9208, float:5.2386E-41)
            r11.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "Flash"
            r95 = r11
            r11 = 37385(0x9209, float:5.2388E-41)
            r5.<init>(r15, r11, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "FocalLength"
            r9 = 37386(0x920a, float:5.2389E-41)
            r96 = r5
            r5 = 5
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "SubjectArea"
            r15 = 37396(0x9214, float:5.2403E-41)
            r97 = r11
            r11 = 3
            r5.<init>(r9, r15, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "MakerNote"
            r15 = 37500(0x927c, float:5.2549E-41)
            r98 = r5
            r5 = 7
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "UserComment"
            r99 = r9
            r9 = 37510(0x9286, float:5.2563E-41)
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "SubSecTime"
            r15 = 37520(0x9290, float:5.2577E-41)
            r100 = r11
            r11 = 2
            r5.<init>(r9, r15, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "SubSecTimeOriginal"
            r101 = r5
            r5 = 37521(0x9291, float:5.2578E-41)
            r9.<init>(r15, r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "SubSecTimeDigitized"
            r102 = r9
            r9 = 37522(0x9292, float:5.258E-41)
            r5.<init>(r15, r9, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "FlashpixVersion"
            r15 = 40960(0xa000, float:5.7397E-41)
            r103 = r5
            r5 = 7
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "ColorSpace"
            r15 = 40961(0xa001, float:5.7399E-41)
            r104 = r9
            r9 = 3
            r5.<init>(r11, r15, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "PixelXDimension"
            r105 = r5
            r5 = 40962(0xa002, float:5.74E-41)
            r71 = r12
            r12 = 4
            r11.<init>(r15, r5, r9, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "PixelYDimension"
            r106 = r11
            r11 = 40963(0xa003, float:5.7401E-41)
            r5.<init>(r15, r11, r9, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "RelatedSoundFile"
            r15 = 40964(0xa004, float:5.7403E-41)
            r12 = 2
            r9.<init>(r11, r15, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r12 = "InteroperabilityIFDPointer"
            r15 = 40965(0xa005, float:5.7404E-41)
            r107 = r5
            r5 = 4
            r11.<init>(r12, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r12 = "FlashEnergy"
            r15 = 41483(0xa20b, float:5.813E-41)
            r108 = r9
            r9 = 5
            r5.<init>(r12, r15, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r12 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "SpatialFrequencyResponse"
            r9 = 41484(0xa20c, float:5.8131E-41)
            r110 = r5
            r5 = 7
            r12.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "FocalPlaneXResolution"
            r15 = 41486(0xa20e, float:5.8134E-41)
            r109 = r11
            r11 = 5
            r5.<init>(r9, r15, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "FocalPlaneYResolution"
            r112 = r5
            r5 = 41487(0xa20f, float:5.8136E-41)
            r9.<init>(r15, r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "FocalPlaneResolutionUnit"
            r15 = 41488(0xa210, float:5.8137E-41)
            r113 = r9
            r9 = 3
            r5.<init>(r11, r15, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "SubjectLocation"
            r114 = r5
            r5 = 41492(0xa214, float:5.8143E-41)
            r11.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "ExposureIndex"
            r9 = 41493(0xa215, float:5.8144E-41)
            r115 = r11
            r11 = 5
            r5.<init>(r15, r9, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "SensingMethod"
            r15 = 41495(0xa217, float:5.8147E-41)
            r116 = r5
            r5 = 3
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "FileSource"
            r15 = 41728(0xa300, float:5.8473E-41)
            r117 = r9
            r9 = 7
            r5.<init>(r11, r15, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "SceneType"
            r118 = r5
            r5 = 41729(0xa301, float:5.8475E-41)
            r11.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "CFAPattern"
            r119 = r11
            r11 = 41730(0xa302, float:5.8476E-41)
            r5.<init>(r15, r11, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "CustomRendered"
            r15 = 41985(0xa401, float:5.8834E-41)
            r120 = r5
            r5 = 3
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "ExposureMode"
            r121 = r9
            r9 = 41986(0xa402, float:5.8835E-41)
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "WhiteBalance"
            r122 = r11
            r11 = 41987(0xa403, float:5.8836E-41)
            r9.<init>(r15, r11, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "DigitalZoomRatio"
            r5 = 41988(0xa404, float:5.8838E-41)
            r123 = r9
            r9 = 5
            r11.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "FocalLengthIn35mmFilm"
            r15 = 41989(0xa405, float:5.8839E-41)
            r124 = r11
            r11 = 3
            r5.<init>(r9, r15, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "SceneCaptureType"
            r125 = r5
            r5 = 41990(0xa406, float:5.884E-41)
            r9.<init>(r15, r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GainControl"
            r126 = r9
            r9 = 41991(0xa407, float:5.8842E-41)
            r5.<init>(r15, r9, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "Contrast"
            r127 = r5
            r5 = 41992(0xa408, float:5.8843E-41)
            r9.<init>(r15, r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "Saturation"
            r128 = r9
            r9 = 41993(0xa409, float:5.8845E-41)
            r5.<init>(r15, r9, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "Sharpness"
            r129 = r5
            r5 = 41994(0xa40a, float:5.8846E-41)
            r9.<init>(r15, r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "DeviceSettingDescription"
            r11 = 41995(0xa40b, float:5.8848E-41)
            r130 = r9
            r9 = 7
            r5.<init>(r15, r11, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "SubjectDistanceRange"
            r15 = 41996(0xa40c, float:5.8849E-41)
            r131 = r5
            r5 = 3
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "ImageUniqueID"
            r15 = 42016(0xa420, float:5.8877E-41)
            r132 = r9
            r9 = 2
            r5.<init>(r11, r15, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "CameraOwnerName"
            r133 = r5
            r5 = 42032(0xa430, float:5.89E-41)
            r11.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "BodySerialNumber"
            r134 = r11
            r11 = 42033(0xa431, float:5.8901E-41)
            r5.<init>(r15, r11, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "LensSpecification"
            r9 = 42034(0xa432, float:5.8902E-41)
            r135 = r5
            r5 = 5
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "LensMake"
            r15 = 42035(0xa433, float:5.8904E-41)
            r136 = r11
            r11 = 2
            r5.<init>(r9, r15, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "LensModel"
            r137 = r5
            r5 = 42036(0xa434, float:5.8905E-41)
            r9.<init>(r15, r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "Gamma"
            r15 = 42240(0xa500, float:5.9191E-41)
            r138 = r9
            r9 = 5
            r5.<init>(r11, r15, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "DNGVersion"
            r15 = 50706(0xc612, float:7.1054E-41)
            r139 = r5
            r5 = 1
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "DefaultCropSize"
            r5 = 50720(0xc620, float:7.1074E-41)
            r140 = r9
            r111 = r12
            r9 = 3
            r12 = 4
            r11.<init>(r15, r5, r9, r12)
            r141 = r11
            r73 = r13
            androidx.exifinterface.media.ExifInterface$ExifTag[] r68 = new androidx.exifinterface.media.ExifInterface.ExifTag[]{r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141}
            androidx.exifinterface.media.ExifInterface.IFD_EXIF_TAGS = r68
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "GPSVersionID"
            r11 = 1
            r12 = 0
            r5.<init>(r9, r12, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r12 = "GPSLatitudeRef"
            r13 = 2
            r9.<init>(r12, r11, r13)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r12 = "GPSLatitude"
            r20 = r5
            r5 = 10
            r15 = 5
            r11.<init>(r12, r13, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r12 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "GPSLongitudeRef"
            r15 = 3
            r12.<init>(r5, r15, r13)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "GPSLongitude"
            r21 = r9
            r22 = r11
            r9 = 5
            r11 = 10
            r15 = 4
            r5.<init>(r13, r15, r9, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "GPSAltitudeRef"
            r15 = 1
            r11.<init>(r13, r9, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r13 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSAltitude"
            r24 = r5
            r5 = 6
            r13.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSTimeStamp"
            r25 = r11
            r11 = 7
            r5.<init>(r15, r11, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "GPSSatellites"
            r27 = r5
            r5 = 2
            r15 = 8
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSStatus"
            r28 = r9
            r9 = 9
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSMeasureMode"
            r29 = r11
            r11 = 10
            r9.<init>(r15, r11, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSDOP"
            r5 = 11
            r30 = r9
            r9 = 5
            r11.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSSpeedRef"
            r9 = 12
            r31 = r11
            r11 = 2
            r5.<init>(r15, r9, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSSpeed"
            r32 = r5
            r5 = 13
            r11 = 5
            r9.<init>(r15, r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSTrackRef"
            r11 = 14
            r33 = r9
            r9 = 2
            r5.<init>(r15, r11, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSTrack"
            r9 = 15
            r34 = r5
            r5 = 5
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSImgDirectionRef"
            r5 = 16
            r35 = r11
            r11 = 2
            r9.<init>(r15, r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSImgDirection"
            r11 = 17
            r36 = r9
            r9 = 5
            r5.<init>(r15, r11, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "GPSMapDatum"
            r15 = 18
            r37 = r5
            r5 = 2
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSDestLatitudeRef"
            r38 = r9
            r9 = 19
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSDestLatitude"
            r5 = 20
            r39 = r11
            r11 = 5
            r9.<init>(r15, r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSDestLongitudeRef"
            r11 = 21
            r40 = r9
            r9 = 2
            r5.<init>(r15, r11, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSDestLongitude"
            r9 = 22
            r41 = r5
            r5 = 5
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSDestBearingRef"
            r5 = 23
            r42 = r11
            r11 = 2
            r9.<init>(r15, r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSDestBearing"
            r11 = 24
            r43 = r9
            r9 = 5
            r5.<init>(r15, r11, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSDestDistanceRef"
            r9 = 25
            r44 = r5
            r5 = 2
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "GPSDestDistance"
            r45 = r11
            r11 = 26
            r15 = 5
            r5.<init>(r9, r11, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "GPSProcessingMethod"
            r15 = 27
            r46 = r5
            r5 = 7
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "GPSAreaInformation"
            r47 = r9
            r9 = 28
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "GPSDateStamp"
            r15 = 29
            r48 = r11
            r11 = 2
            r5.<init>(r9, r15, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "GPSDifferential"
            r15 = 30
            r49 = r5
            r5 = 3
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "GPSHPositioningError"
            r15 = 31
            r50 = r9
            r9 = 5
            r5.<init>(r11, r15, r9)
            r51 = r5
            r23 = r12
            r26 = r13
            androidx.exifinterface.media.ExifInterface$ExifTag[] r69 = new androidx.exifinterface.media.ExifInterface.ExifTag[]{r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51}
            androidx.exifinterface.media.ExifInterface.IFD_GPS_TAGS = r69
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "InteroperabilityIndex"
            r11 = 1
            r12 = 2
            r5.<init>(r9, r11, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag[] r70 = new androidx.exifinterface.media.ExifInterface.ExifTag[]{r5}
            androidx.exifinterface.media.ExifInterface.IFD_INTEROPERABILITY_TAGS = r70
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "NewSubfileType"
            r11 = 254(0xfe, float:3.56E-43)
            r12 = 4
            r5.<init>(r9, r11, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "SubfileType"
            r13 = 255(0xff, float:3.57E-43)
            r9.<init>(r11, r13, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "ThumbnailImageWidth"
            r17 = r5
            r5 = 256(0x100, float:3.59E-43)
            r15 = 3
            r11.<init>(r13, r5, r15, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "ThumbnailImageLength"
            r18 = r9
            r9 = 257(0x101, float:3.6E-43)
            r5.<init>(r13, r9, r15, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r12 = "BitsPerSample"
            r13 = 258(0x102, float:3.62E-43)
            r9.<init>(r12, r13, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r12 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "Compression"
            r20 = r5
            r5 = 259(0x103, float:3.63E-43)
            r12.<init>(r13, r5, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "PhotometricInterpretation"
            r21 = r9
            r9 = 262(0x106, float:3.67E-43)
            r5.<init>(r13, r9, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r13 = "ImageDescription"
            r15 = 270(0x10e, float:3.78E-43)
            r23 = r5
            r5 = 2
            r9.<init>(r13, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r13 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "Make"
            r24 = r9
            r9 = 271(0x10f, float:3.8E-43)
            r13.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "Model"
            r19 = r11
            r11 = 272(0x110, float:3.81E-43)
            r9.<init>(r15, r11, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r26 = r9
            r9 = 273(0x111, float:3.83E-43)
            r11 = 3
            r15 = 4
            r5.<init>(r1, r9, r11, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "ThumbnailOrientation"
            r27 = r5
            r5 = 274(0x112, float:3.84E-43)
            r9.<init>(r15, r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "SamplesPerPixel"
            r28 = r9
            r9 = 277(0x115, float:3.88E-43)
            r5.<init>(r15, r9, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "RowsPerStrip"
            r29 = r5
            r5 = 278(0x116, float:3.9E-43)
            r22 = r12
            r12 = 4
            r9.<init>(r15, r5, r11, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "StripByteCounts"
            r30 = r9
            r9 = 279(0x117, float:3.91E-43)
            r5.<init>(r15, r9, r11, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "XResolution"
            r12 = 282(0x11a, float:3.95E-43)
            r15 = 5
            r9.<init>(r11, r12, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r12 = "YResolution"
            r31 = r5
            r5 = 283(0x11b, float:3.97E-43)
            r11.<init>(r12, r5, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r12 = "PlanarConfiguration"
            r15 = 284(0x11c, float:3.98E-43)
            r32 = r9
            r9 = 3
            r5.<init>(r12, r15, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r12 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "ResolutionUnit"
            r34 = r5
            r5 = 296(0x128, float:4.15E-43)
            r12.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "TransferFunction"
            r33 = r11
            r11 = 301(0x12d, float:4.22E-43)
            r5.<init>(r15, r11, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "Software"
            r15 = 305(0x131, float:4.27E-43)
            r36 = r5
            r5 = 2
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "DateTime"
            r37 = r9
            r9 = 306(0x132, float:4.29E-43)
            r11.<init>(r15, r9, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "Artist"
            r38 = r11
            r11 = 315(0x13b, float:4.41E-43)
            r9.<init>(r15, r11, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "WhitePoint"
            r15 = 318(0x13e, float:4.46E-43)
            r39 = r9
            r9 = 5
            r5.<init>(r11, r15, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "PrimaryChromaticities"
            r40 = r5
            r5 = 319(0x13f, float:4.47E-43)
            r11.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r9 = 330(0x14a, float:4.62E-43)
            r15 = 4
            r5.<init>(r4, r9, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r42 = r5
            java.lang.String r5 = "JPEGInterchangeFormat"
            r41 = r11
            r11 = 513(0x201, float:7.19E-43)
            r9.<init>(r5, r11, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "JPEGInterchangeFormatLength"
            r43 = r9
            r9 = 514(0x202, float:7.2E-43)
            r5.<init>(r11, r9, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "YCbCrCoefficients"
            r15 = 529(0x211, float:7.41E-43)
            r44 = r5
            r5 = 5
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "YCbCrSubSampling"
            r15 = 530(0x212, float:7.43E-43)
            r45 = r9
            r9 = 3
            r5.<init>(r11, r15, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "YCbCrPositioning"
            r46 = r5
            r5 = 531(0x213, float:7.44E-43)
            r11.<init>(r15, r5, r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "ReferenceBlackWhite"
            r15 = 532(0x214, float:7.45E-43)
            r47 = r11
            r11 = 5
            r5.<init>(r9, r15, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "Copyright"
            r15 = 33432(0x8298, float:4.6848E-41)
            r48 = r5
            r5 = 2
            r9.<init>(r11, r15, r5)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r11 = 34665(0x8769, float:4.8576E-41)
            r15 = 4
            r5.<init>(r6, r11, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r50 = r5
            r5 = 34853(0x8825, float:4.884E-41)
            r11.<init>(r0, r5, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r15 = "DNGVersion"
            r49 = r9
            r9 = 50706(0xc612, float:7.1054E-41)
            r51 = r11
            r11 = 1
            r5.<init>(r15, r9, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "DefaultCropSize"
            r15 = 50720(0xc620, float:7.1074E-41)
            r52 = r5
            r35 = r12
            r5 = 3
            r12 = 4
            r9.<init>(r11, r15, r5, r12)
            r53 = r9
            r25 = r13
            androidx.exifinterface.media.ExifInterface$ExifTag[] r71 = new androidx.exifinterface.media.ExifInterface.ExifTag[]{r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53}
            androidx.exifinterface.media.ExifInterface.IFD_THUMBNAIL_TAGS = r71
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r11 = 273(0x111, float:3.83E-43)
            r9.<init>(r1, r11, r5)
            androidx.exifinterface.media.ExifInterface.TAG_RAF_IMAGE_SIZE = r9
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "ThumbnailImage"
            r9 = 256(0x100, float:3.59E-43)
            r11 = 7
            r1.<init>(r5, r9, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "CameraSettingsIFDPointer"
            r11 = 8224(0x2020, float:1.1524E-41)
            r12 = 4
            r5.<init>(r9, r11, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "ImageProcessingIFDPointer"
            r13 = 8256(0x2040, float:1.1569E-41)
            r9.<init>(r11, r13, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag[] r73 = new androidx.exifinterface.media.ExifInterface.ExifTag[]{r1, r5, r9}
            androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_TAGS = r73
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "PreviewImageStart"
            r9 = 257(0x101, float:3.6E-43)
            r1.<init>(r5, r9, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "PreviewImageLength"
            r13 = 258(0x102, float:3.62E-43)
            r5.<init>(r9, r13, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag[] r74 = new androidx.exifinterface.media.ExifInterface.ExifTag[]{r1, r5}
            androidx.exifinterface.media.ExifInterface.ORF_CAMERA_SETTINGS_TAGS = r74
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "AspectFrame"
            r9 = 4371(0x1113, float:6.125E-42)
            r11 = 3
            r1.<init>(r5, r9, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag[] r75 = new androidx.exifinterface.media.ExifInterface.ExifTag[]{r1}
            androidx.exifinterface.media.ExifInterface.ORF_IMAGE_PROCESSING_TAGS = r75
            androidx.exifinterface.media.ExifInterface$ExifTag r1 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r5 = "ColorSpace"
            r9 = 55
            r1.<init>(r5, r9, r11)
            androidx.exifinterface.media.ExifInterface$ExifTag[] r76 = new androidx.exifinterface.media.ExifInterface.ExifTag[]{r1}
            androidx.exifinterface.media.ExifInterface.PEF_TAGS = r76
            r72 = r67
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r1 = new androidx.exifinterface.media.ExifInterface.ExifTag[][]{r67, r68, r69, r70, r71, r72, r73, r74, r75, r76}
            androidx.exifinterface.media.ExifInterface.EXIF_TAGS = r1
            androidx.exifinterface.media.ExifInterface$ExifTag r5 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r9 = 330(0x14a, float:4.62E-43)
            r12 = 4
            r5.<init>(r4, r9, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r11 = 34665(0x8769, float:4.8576E-41)
            r4.<init>(r6, r11, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = new androidx.exifinterface.media.ExifInterface$ExifTag
            r9 = 34853(0x8825, float:4.884E-41)
            r6.<init>(r0, r9, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r0 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r9 = "InteroperabilityIFDPointer"
            r11 = 40965(0xa005, float:5.7404E-41)
            r0.<init>(r9, r11, r12)
            androidx.exifinterface.media.ExifInterface$ExifTag r9 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r11 = "CameraSettingsIFDPointer"
            r12 = 8224(0x2020, float:1.1524E-41)
            r15 = 1
            r9.<init>(r11, r12, r15)
            androidx.exifinterface.media.ExifInterface$ExifTag r11 = new androidx.exifinterface.media.ExifInterface$ExifTag
            java.lang.String r12 = "ImageProcessingIFDPointer"
            r13 = 8256(0x2040, float:1.1569E-41)
            r11.<init>(r12, r13, r15)
            r20 = r0
            r18 = r4
            r17 = r5
            r19 = r6
            r21 = r9
            r22 = r11
            androidx.exifinterface.media.ExifInterface$ExifTag[] r0 = new androidx.exifinterface.media.ExifInterface.ExifTag[]{r17, r18, r19, r20, r21, r22}
            androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS = r0
            int r0 = r1.length
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading = r0
            int r0 = r1.length
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "ExposureTime"
            java.lang.String r4 = "SubjectDistance"
            java.lang.String r5 = "FNumber"
            java.lang.String r6 = "DigitalZoomRatio"
            java.lang.String[] r1 = new java.lang.String[]{r5, r6, r1, r4}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            androidx.exifinterface.media.ExifInterface.RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.exifinterface.media.ExifInterface.sExifPointerTagMap = r0
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            androidx.exifinterface.media.ExifInterface.ASCII = r0
            java.lang.String r1 = "Exif\u0000\u0000"
            byte[] r1 = r1.getBytes(r0)
            androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1 = r1
            java.lang.String r1 = "http://ns.adobe.com/xap/1.0/\u0000"
            byte[] r0 = r1.getBytes(r0)
            androidx.exifinterface.media.ExifInterface.IDENTIFIER_XMP_APP1 = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r4 = "yyyy:MM:dd HH:mm:ss"
            r0.<init>(r4, r1)
            androidx.exifinterface.media.ExifInterface.sFormatterPrimary = r0
            java.lang.String r4 = "UTC"
            java.util.TimeZone r4 = java.util.TimeZone.getTimeZone(r4)
            r0.setTimeZone(r4)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r4, r1)
            androidx.exifinterface.media.ExifInterface.sFormatterSecondary = r0
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            r12 = 0
        Lb0d:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            if (r12 >= r1) goto Lb4c
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r1 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r1[r12] = r4
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r1 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r1[r12] = r4
            r0 = r0[r12]
            int r1 = r0.length
            r4 = 0
        Lb28:
            if (r4 >= r1) goto Lb47
            r5 = r0[r4]
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r6 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading
            r6 = r6[r12]
            int r9 = r5.number
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r9, r5)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r6 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            r6 = r6[r12]
            java.lang.String r9 = r5.name
            r6.put(r9, r5)
            r62 = 1
            int r4 = r4 + 1
            goto Lb28
        Lb47:
            r62 = 1
            int r12 = r12 + 1
            goto Lb0d
        Lb4c:
            r62 = 1
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = androidx.exifinterface.media.ExifInterface.sExifPointerTagMap
            androidx.exifinterface.media.ExifInterface$ExifTag[] r1 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r16 = 0
            r4 = r1[r16]
            int r4 = r4.number
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r4, r14)
            r4 = r1[r62]
            int r4 = r4.number
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r4, r3)
            r65 = 2
            r3 = r1[r65]
            int r3 = r3.number
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r8)
            r66 = 3
            r3 = r1[r66]
            int r3 = r3.number
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r2)
            r64 = 4
            r2 = r1[r64]
            int r2 = r2.number
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r10)
            r63 = 5
            r1 = r1[r63]
            int r1 = r1.number
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r1, r7)
            java.lang.String r0 = ".*[1-9].*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.NON_ZERO_TIME_PATTERN = r0
            java.lang.String r0 = "^(\\d{2}):(\\d{2}):(\\d{2})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.GPS_TIMESTAMP_PATTERN = r0
            java.lang.String r0 = "^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.DATETIME_PRIMARY_FORMAT_PATTERN = r0
            java.lang.String r0 = "^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.exifinterface.media.ExifInterface.DATETIME_SECONDARY_FORMAT_PATTERN = r0
            return
    }

    public ExifInterface(java.io.File r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r2.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r2.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.mExifByteOrder = r0
            if (r3 == 0) goto L20
            java.lang.String r3 = r3.getAbsolutePath()
            r2.initForFilename(r3)
            return
        L20:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "file cannot be null"
            r3.<init>(r0)
            throw r3
    }

    public ExifInterface(java.io.FileDescriptor r5) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r4.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r4.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r4.mExifByteOrder = r0
            if (r5 == 0) goto L57
            r0 = 0
            r4.mAssetInputStream = r0
            r4.mFilename = r0
            boolean r1 = isSeekableFD(r5)
            if (r1 == 0) goto L34
            r4.mSeekableFileDescriptor = r5
            java.io.FileDescriptor r5 = android.system.Os.dup(r5)     // Catch: java.lang.Exception -> L2b
            r1 = 1
            goto L37
        L2b:
            r5 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to duplicate file descriptor"
            r0.<init>(r1, r5)
            throw r0
        L34:
            r4.mSeekableFileDescriptor = r0
            r1 = 0
        L37:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L4a
            r4.loadAttributes(r2)     // Catch: java.lang.Throwable -> L48
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r2)
            if (r1 == 0) goto L47
            androidx.exifinterface.media.ExifInterfaceUtils.closeFileDescriptor(r5)
        L47:
            return
        L48:
            r0 = move-exception
            goto L4e
        L4a:
            r2 = move-exception
            r3 = r2
            r2 = r0
            r0 = r3
        L4e:
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r2)
            if (r1 == 0) goto L56
            androidx.exifinterface.media.ExifInterfaceUtils.closeFileDescriptor(r5)
        L56:
            throw r0
        L57:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "fileDescriptor cannot be null"
            r5.<init>(r0)
            throw r5
    }

    public ExifInterface(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ExifInterface(java.io.InputStream r3, int r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r2.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r2.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.mExifByteOrder = r0
            if (r3 == 0) goto L57
            r0 = 0
            r2.mFilename = r0
            r1 = 1
            if (r4 != r1) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            r2.mIsExifDataOnly = r1
            if (r1 == 0) goto L29
            r2.mAssetInputStream = r0
            r2.mSeekableFileDescriptor = r0
            goto L53
        L29:
            boolean r4 = r3 instanceof android.content.res.AssetManager.AssetInputStream
            if (r4 == 0) goto L35
            r4 = r3
            android.content.res.AssetManager$AssetInputStream r4 = (android.content.res.AssetManager.AssetInputStream) r4
            r2.mAssetInputStream = r4
            r2.mSeekableFileDescriptor = r0
            goto L53
        L35:
            boolean r4 = r3 instanceof java.io.FileInputStream
            if (r4 == 0) goto L4f
            r4 = r3
            java.io.FileInputStream r4 = (java.io.FileInputStream) r4
            java.io.FileDescriptor r1 = r4.getFD()
            boolean r1 = isSeekableFD(r1)
            if (r1 == 0) goto L4f
            r2.mAssetInputStream = r0
            java.io.FileDescriptor r4 = r4.getFD()
            r2.mSeekableFileDescriptor = r4
            goto L53
        L4f:
            r2.mAssetInputStream = r0
            r2.mSeekableFileDescriptor = r0
        L53:
            r2.loadAttributes(r3)
            return
        L57:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "inputStream cannot be null"
            r3.<init>(r4)
            throw r3
    }

    public ExifInterface(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r2.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r2.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.mExifByteOrder = r0
            if (r3 == 0) goto L1c
            r2.initForFilename(r3)
            return
        L1c:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "filename cannot be null"
            r3.<init>(r0)
            throw r3
    }

    public static /* synthetic */ int[] access$000() {
            int[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
            return r0
    }

    public static /* synthetic */ java.nio.charset.Charset access$100() {
            java.nio.charset.Charset r0 = androidx.exifinterface.media.ExifInterface.ASCII
            return r0
    }

    public static /* synthetic */ java.lang.String[] access$200() {
            java.lang.String[] r0 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES
            return r0
    }

    public static /* synthetic */ byte[] access$300() {
            byte[] r0 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX
            return r0
    }

    private void addDefaultValuesForCompatibility() {
            r6 = this;
            java.lang.String r0 = "DateTimeOriginal"
            java.lang.String r0 = r6.getAttribute(r0)
            r1 = 0
            if (r0 == 0) goto L1c
            java.lang.String r2 = "DateTime"
            java.lang.String r3 = r6.getAttribute(r2)
            if (r3 != 0) goto L1c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r6.mAttributes
            r3 = r3[r1]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r0)
            r3.put(r2, r0)
        L1c:
            java.lang.String r0 = "ImageWidth"
            java.lang.String r2 = r6.getAttribute(r0)
            r3 = 0
            if (r2 != 0) goto L33
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r2 = r2[r1]
            java.nio.ByteOrder r5 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r5)
            r2.put(r0, r5)
        L33:
            java.lang.String r0 = "ImageLength"
            java.lang.String r2 = r6.getAttribute(r0)
            if (r2 != 0) goto L48
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r2 = r2[r1]
            java.nio.ByteOrder r5 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r5)
            r2.put(r0, r5)
        L48:
            java.lang.String r0 = "Orientation"
            java.lang.String r2 = r6.getAttribute(r0)
            if (r2 != 0) goto L5d
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r1 = r2[r1]
            java.nio.ByteOrder r2 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r2)
            r1.put(r0, r2)
        L5d:
            java.lang.String r0 = "LightSource"
            java.lang.String r1 = r6.getAttribute(r0)
            if (r1 != 0) goto L73
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.mAttributes
            r2 = 1
            r1 = r1[r2]
            java.nio.ByteOrder r2 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r3, r2)
            r1.put(r0, r2)
        L73:
            return
    }

    private java.lang.String convertDecimalDegree(double r9) {
            r8 = this;
            long r0 = (long) r9
            double r2 = (double) r0
            double r9 = r9 - r2
            r2 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r4 = r9 * r2
            long r4 = (long) r4
            double r6 = (double) r4
            double r6 = r6 / r2
            double r9 = r9 - r6
            r2 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r9 = r9 * r2
            r2 = 4711630319722168320(0x416312d000000000, double:1.0E7)
            double r9 = r9 * r2
            long r9 = java.lang.Math.round(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "/1,"
            r2.append(r0)
            r2.append(r4)
            r2.append(r0)
            r2.append(r9)
            java.lang.String r9 = "/10000000"
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            return r9
    }

    private static double convertRationalLatLonToDouble(java.lang.String r11, java.lang.String r12) {
            java.lang.String r0 = "/"
            java.lang.String r1 = ","
            r2 = -1
            java.lang.String[] r11 = r11.split(r1, r2)     // Catch: java.lang.Throwable -> L93
            r1 = 0
            r3 = r11[r1]     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r3 = r3.split(r0, r2)     // Catch: java.lang.Throwable -> L93
            r4 = r3[r1]     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L93
            double r4 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.Throwable -> L93
            r6 = 1
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L93
            double r7 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.Throwable -> L93
            double r4 = r4 / r7
            r3 = r11[r6]     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r3 = r3.split(r0, r2)     // Catch: java.lang.Throwable -> L93
            r7 = r3[r1]     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L93
            double r7 = java.lang.Double.parseDouble(r7)     // Catch: java.lang.Throwable -> L93
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L93
            double r9 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.Throwable -> L93
            double r7 = r7 / r9
            r3 = 2
            r11 = r11[r3]     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r11 = r11.split(r0, r2)     // Catch: java.lang.Throwable -> L93
            r0 = r11[r1]     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L93
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Throwable -> L93
            r11 = r11[r6]     // Catch: java.lang.Throwable -> L93
            java.lang.String r11 = r11.trim()     // Catch: java.lang.Throwable -> L93
            double r2 = java.lang.Double.parseDouble(r11)     // Catch: java.lang.Throwable -> L93
            double r0 = r0 / r2
            r2 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r7 = r7 / r2
            double r4 = r4 + r7
            r2 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r0 = r0 / r2
            double r4 = r4 + r0
            java.lang.String r11 = "S"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L93
            if (r11 != 0) goto L91
            java.lang.String r11 = "W"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L93
            if (r11 == 0) goto L79
            goto L91
        L79:
            java.lang.String r11 = "N"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L93
            if (r11 != 0) goto L90
            java.lang.String r11 = "E"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L93
            if (r11 == 0) goto L8a
            goto L90
        L8a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L93
            r11.<init>()     // Catch: java.lang.Throwable -> L93
            throw r11     // Catch: java.lang.Throwable -> L93
        L90:
            return r4
        L91:
            double r11 = -r4
            return r11
        L93:
            r11 = move-exception
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r11)
            throw r12
    }

    private void copyChunksUpToGivenChunkType(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r3, androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream r4, byte[] r5, byte[] r6) throws java.io.IOException {
            r2 = this;
        L0:
            r0 = 4
            byte[] r0 = new byte[r0]
            r3.readFully(r0)
            r2.copyWebPChunk(r3, r4, r0)
            boolean r1 = java.util.Arrays.equals(r0, r5)
            if (r1 != 0) goto L17
            if (r6 == 0) goto L0
            boolean r0 = java.util.Arrays.equals(r0, r6)
            if (r0 == 0) goto L0
        L17:
            return
    }

    private void copyWebPChunk(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r3, androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream r4, byte[] r5) throws java.io.IOException {
            r2 = this;
            int r0 = r3.readInt()
            r4.write(r5)
            r4.writeInt(r0)
            int r5 = r0 % 2
            r1 = 1
            if (r5 != r1) goto L11
            int r0 = r0 + 1
        L11:
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r3, r4, r0)
            return
    }

    private androidx.exifinterface.media.ExifInterface.ExifAttribute getExifAttribute(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L50
            java.lang.String r0 = "ISOSpeedRatings"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L17
            boolean r4 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r4 == 0) goto L15
            java.lang.String r4 = "ExifInterface"
            java.lang.String r0 = "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r4, r0)
        L15:
            java.lang.String r4 = "PhotographicSensitivity"
        L17:
            java.lang.String r0 = "Xmp"
            boolean r1 = r0.equals(r4)
            if (r1 == 0) goto L2d
            int r1 = r3.mMimeType
            int r1 = getXmpHandlingForImageType(r1)
            r2 = 2
            if (r1 != r2) goto L2d
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = r3.mXmpFromSeparateMarker
            if (r1 == 0) goto L2d
            return r1
        L2d:
            r1 = 0
        L2e:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r2 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r2 = r2.length
            if (r1 >= r2) goto L43
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r3.mAttributes
            r2 = r2[r1]
            java.lang.Object r2 = r2.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r2
            if (r2 == 0) goto L40
            return r2
        L40:
            int r1 = r1 + 1
            goto L2e
        L43:
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L4e
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = r3.mXmpFromSeparateMarker
            if (r4 == 0) goto L4e
            return r4
        L4e:
            r4 = 0
            return r4
        L50:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "tag shouldn't be null"
            r4.<init>(r0)
            throw r4
    }

    private void getHeifAttributes(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r14, int r15) throws java.io.IOException {
            r13 = this;
            java.lang.String r0 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L173
            r2 = 15
            r3 = 31
            if (r15 != r2) goto L1a
            if (r1 < r3) goto L12
            goto L1a
        L12:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException
            java.lang.String r15 = "Reading EXIF from AVIF files is supported from SDK 31 and above"
            r14.<init>(r15)
            throw r14
        L1a:
            android.media.MediaMetadataRetriever r15 = new android.media.MediaMetadataRetriever
            r15.<init>()
            androidx.exifinterface.media.ExifInterface$1 r1 = new androidx.exifinterface.media.ExifInterface$1     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r1.<init>(r13, r14)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            androidx.exifinterface.media.ExifInterfaceUtils.Api23Impl.setDataSource(r15, r1)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r1 = 33
            java.lang.String r1 = r15.extractMetadata(r1)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r2 = 34
            java.lang.String r2 = r15.extractMetadata(r2)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r4 = 26
            java.lang.String r4 = r15.extractMetadata(r4)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r5 = 17
            java.lang.String r5 = r15.extractMetadata(r5)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            if (r4 == 0) goto L5e
            r0 = 29
            java.lang.String r0 = r15.extractMetadata(r0)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r4 = 30
            java.lang.String r4 = r15.extractMetadata(r4)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            java.lang.String r3 = r15.extractMetadata(r3)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            goto L7a
        L56:
            r0 = move-exception
            r14 = r0
            goto L16f
        L5a:
            r0 = move-exception
            r14 = r0
            goto L167
        L5e:
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            if (r0 == 0) goto L77
            r0 = 18
            java.lang.String r0 = r15.extractMetadata(r0)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r3 = 19
            java.lang.String r4 = r15.extractMetadata(r3)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r3 = 24
            java.lang.String r3 = r15.extractMetadata(r3)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            goto L7a
        L77:
            r0 = 0
            r3 = r0
            r4 = r3
        L7a:
            r5 = 0
            if (r0 == 0) goto L90
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r13.mAttributes     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r6 = r6[r5]     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            java.lang.String r7 = "ImageWidth"
            int r8 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            java.nio.ByteOrder r9 = r13.mExifByteOrder     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r8, r9)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
        L90:
            if (r4 == 0) goto La5
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r13.mAttributes     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r6 = r6[r5]     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            java.lang.String r7 = "ImageLength"
            int r8 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            java.nio.ByteOrder r9 = r13.mExifByteOrder     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r8, r9)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
        La5:
            r6 = 1
            r7 = 6
            if (r3 == 0) goto Ld0
            int r8 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r9 = 90
            if (r8 == r9) goto Lc0
            r9 = 180(0xb4, float:2.52E-43)
            if (r8 == r9) goto Lbe
            r9 = 270(0x10e, float:3.78E-43)
            if (r8 == r9) goto Lbb
            r8 = r6
            goto Lc1
        Lbb:
            r8 = 8
            goto Lc1
        Lbe:
            r8 = 3
            goto Lc1
        Lc0:
            r8 = r7
        Lc1:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r13.mAttributes     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r9 = r9[r5]     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            java.lang.String r10 = "Orientation"
            java.nio.ByteOrder r11 = r13.mExifByteOrder     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r8, r11)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r9.put(r10, r8)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
        Ld0:
            if (r1 == 0) goto L10d
            if (r2 == 0) goto L10d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            if (r2 <= r7) goto L105
            long r8 = (long) r1     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r14.seek(r8)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            byte[] r8 = new byte[r7]     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r14.readFully(r8)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            int r1 = r1 + r7
            int r2 = r2 + (-6)
            byte[] r7 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            boolean r7 = java.util.Arrays.equals(r8, r7)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            if (r7 == 0) goto Lfd
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r14.readFully(r2)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r13.mOffsetToExifData = r1     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r13.readExifSegment(r2, r5)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            goto L10d
        Lfd:
            java.io.IOException r14 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            java.lang.String r0 = "Invalid identifier"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            throw r14     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
        L105:
            java.io.IOException r14 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            java.lang.String r0 = "Invalid exif length"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            throw r14     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
        L10d:
            r1 = 41
            java.lang.String r1 = r15.extractMetadata(r1)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r2 = 42
            java.lang.String r2 = r15.extractMetadata(r2)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            if (r1 == 0) goto L138
            if (r2 == 0) goto L138
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            int r9 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            long r10 = (long) r1     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r14.seek(r10)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            byte[] r12 = new byte[r9]     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r14.readFully(r12)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = new androidx.exifinterface.media.ExifInterface$ExifAttribute     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r8 = 1
            r7.<init>(r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r13.mXmpFromSeparateMarker = r7     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r13.mFileOnDiskContainsSeparateXmpMarker = r6     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
        L138:
            boolean r14 = androidx.exifinterface.media.ExifInterface.DEBUG     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            if (r14 == 0) goto L163
            java.lang.String r14 = "ExifInterface"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r1.<init>()     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            java.lang.String r2 = "Heif meta: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r1.append(r0)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            java.lang.String r0 = "x"
            r1.append(r0)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r1.append(r4)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            java.lang.String r0 = ", rotation "
            r1.append(r0)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            r1.append(r3)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
            android.util.Log.d(r14, r0)     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L5a
        L163:
            r15.release()     // Catch: java.io.IOException -> L166
        L166:
            return
        L167:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r0.<init>(r1, r14)     // Catch: java.lang.Throwable -> L56
            throw r0     // Catch: java.lang.Throwable -> L56
        L16f:
            r15.release()     // Catch: java.io.IOException -> L172
        L172:
            throw r14
        L173:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException
            java.lang.String r15 = "Reading EXIF from HEIC files is supported from SDK 28 and above"
            r14.<init>(r15)
            throw r14
    }

    private void getJpegAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r20, int r21, int r22) throws java.io.IOException {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L20:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.setByteOrder(r3)
            byte r3 = r1.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r3 != r6) goto L1af
            byte r7 = r1.readByte()
            r8 = -40
            if (r7 != r8) goto L194
            r3 = 2
        L37:
            byte r5 = r1.readByte()
            if (r5 != r6) goto L177
        L3d:
            int r5 = r3 + 1
            byte r7 = r1.readByte()
            if (r7 == r6) goto L174
            boolean r5 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r5 == 0) goto L63
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Found JPEG segment indicator: "
            r8.append(r9)
            r9 = r7 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r4, r8)
        L63:
            r8 = -39
            if (r7 == r8) goto L16e
            r8 = -38
            if (r7 != r8) goto L6d
            goto L16e
        L6d:
            int r8 = r1.readUnsignedShort()
            int r9 = r8 + (-2)
            int r3 = r3 + 4
            if (r5 == 0) goto L9e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "JPEG segment: "
            r5.append(r10)
            r10 = r7 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r5.append(r10)
            java.lang.String r10 = " (length: "
            r5.append(r10)
            r5.append(r8)
            java.lang.String r10 = ")"
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r4, r5)
        L9e:
            java.lang.String r5 = "Invalid length"
            if (r9 < 0) goto L168
            r10 = -31
            r11 = 0
            r12 = 1
            if (r7 == r10) goto L113
            r10 = -2
            if (r7 == r10) goto Lf2
            switch(r7) {
                case -64: goto Lb9;
                case -63: goto Lb9;
                case -62: goto Lb9;
                case -61: goto Lb9;
                default: goto Lae;
            }
        Lae:
            switch(r7) {
                case -59: goto Lb9;
                case -58: goto Lb9;
                case -57: goto Lb9;
                default: goto Lb1;
            }
        Lb1:
            switch(r7) {
                case -55: goto Lb9;
                case -54: goto Lb9;
                case -53: goto Lb9;
                default: goto Lb4;
            }
        Lb4:
            switch(r7) {
                case -51: goto Lb9;
                case -50: goto Lb9;
                case -49: goto Lb9;
                default: goto Lb7;
            }
        Lb7:
            goto L15a
        Lb9:
            r1.skipFully(r12)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r0.mAttributes
            r7 = r7[r2]
            r9 = 4
            if (r2 == r9) goto Lc6
            java.lang.String r10 = "ImageLength"
            goto Lc8
        Lc6:
            java.lang.String r10 = "ThumbnailImageLength"
        Lc8:
            int r11 = r1.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r11 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r11, r13)
            r7.put(r10, r11)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r0.mAttributes
            r7 = r7[r2]
            if (r2 == r9) goto Ldf
            java.lang.String r9 = "ImageWidth"
            goto Le1
        Ldf:
            java.lang.String r9 = "ThumbnailImageWidth"
        Le1:
            int r10 = r1.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r10, r12)
            r7.put(r9, r10)
            int r9 = r8 + (-7)
            goto L15a
        Lf2:
            byte[] r7 = new byte[r9]
            r1.readFully(r7)
            java.lang.String r8 = "UserComment"
            java.lang.String r9 = r0.getAttribute(r8)
            if (r9 != 0) goto L111
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.mAttributes
            r9 = r9[r12]
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r12 = androidx.exifinterface.media.ExifInterface.ASCII
            r10.<init>(r7, r12)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r10)
            r9.put(r8, r7)
        L111:
            r9 = r11
            goto L15a
        L113:
            byte[] r7 = new byte[r9]
            r1.readFully(r7)
            int r8 = r3 + r9
            byte[] r10 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            boolean r13 = androidx.exifinterface.media.ExifInterfaceUtils.startsWith(r7, r10)
            if (r13 == 0) goto L139
            int r12 = r10.length
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r12, r9)
            int r3 = r21 + r3
            int r9 = r10.length
            int r3 = r3 + r9
            r0.mOffsetToExifData = r3
            r0.readExifSegment(r7, r2)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r3 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r3.<init>(r7)
            r0.setThumbnailData(r3)
            goto L158
        L139:
            byte[] r10 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_XMP_APP1
            boolean r13 = androidx.exifinterface.media.ExifInterfaceUtils.startsWith(r7, r10)
            if (r13 == 0) goto L158
            int r13 = r10.length
            int r3 = r3 + r13
            int r10 = r10.length
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r10, r9)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r13 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
            int r15 = r7.length
            long r9 = (long) r3
            r14 = 1
            r18 = r7
            r16 = r9
            r13.<init>(r14, r15, r16, r18)
            r0.mXmpFromSeparateMarker = r13
            r0.mFileOnDiskContainsSeparateXmpMarker = r12
        L158:
            r3 = r8
            goto L111
        L15a:
            if (r9 < 0) goto L162
            r1.skipFully(r9)
            int r3 = r3 + r9
            goto L37
        L162:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r5)
            throw r1
        L168:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r5)
            throw r1
        L16e:
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            r1.setByteOrder(r2)
            return
        L174:
            r3 = r5
            goto L3d
        L177:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L194:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1af:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private int getMimeType(java.io.BufferedInputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 5000(0x1388, float:7.006E-42)
            r2.mark(r0)
            byte[] r0 = new byte[r0]
            r2.read(r0)
            r2.reset()
            boolean r2 = isJpegFormat(r0)
            if (r2 == 0) goto L15
            r2 = 4
            return r2
        L15:
            boolean r2 = r1.isRafFormat(r0)
            if (r2 == 0) goto L1e
            r2 = 9
            return r2
        L1e:
            int r2 = r1.isHeicOrAvifFormat(r0)
            if (r2 == 0) goto L25
            return r2
        L25:
            boolean r2 = r1.isOrfFormat(r0)
            if (r2 == 0) goto L2d
            r2 = 7
            return r2
        L2d:
            boolean r2 = r1.isRw2Format(r0)
            if (r2 == 0) goto L36
            r2 = 10
            return r2
        L36:
            boolean r2 = r1.isPngFormat(r0)
            if (r2 == 0) goto L3f
            r2 = 13
            return r2
        L3f:
            boolean r2 = r1.isWebpFormat(r0)
            if (r2 == 0) goto L48
            r2 = 14
            return r2
        L48:
            r2 = 0
            return r2
    }

    private void getOrfAttributes(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r6) throws java.io.IOException {
            r5 = this;
            r5.getRawAttributes(r6)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r5.mAttributes
            r0 = 1
            r6 = r6[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r6 = r6.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r6
            if (r6 == 0) goto Lef
            androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream
            byte[] r6 = r6.bytes
            r1.<init>(r6)
            java.nio.ByteOrder r6 = r5.mExifByteOrder
            r1.setByteOrder(r6)
            byte[] r6 = androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_1
            int r2 = r6.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.seek(r3)
            byte[] r3 = androidx.exifinterface.media.ExifInterface.ORF_MAKER_NOTE_HEADER_2
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r6 = java.util.Arrays.equals(r2, r6)
            if (r6 == 0) goto L3f
            r2 = 8
            r1.seek(r2)
            goto L4a
        L3f:
            boolean r6 = java.util.Arrays.equals(r4, r3)
            if (r6 == 0) goto L4a
            r2 = 12
            r1.seek(r2)
        L4a:
            r6 = 6
            r5.readImageFileDirectory(r1, r6)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r5.mAttributes
            r1 = 7
            r6 = r6[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r6 = r6.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r6
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r5.mAttributes
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r6 == 0) goto L7e
            if (r1 == 0) goto L7e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r5.mAttributes
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r6)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r5.mAttributes
            r6 = r6[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r6.put(r2, r1)
        L7e:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r5.mAttributes
            r1 = 8
            r6 = r6[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r6 = r6.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r6
            if (r6 == 0) goto Lef
            java.nio.ByteOrder r1 = r5.mExifByteOrder
            java.lang.Object r6 = r6.getValue(r1)
            int[] r6 = (int[]) r6
            if (r6 == 0) goto Ld5
            int r1 = r6.length
            r2 = 4
            if (r1 == r2) goto L9d
            goto Ld5
        L9d:
            r1 = 2
            r1 = r6[r1]
            r2 = 0
            r3 = r6[r2]
            if (r1 <= r3) goto Lef
            r4 = 3
            r4 = r6[r4]
            r6 = r6[r0]
            if (r4 <= r6) goto Lef
            int r1 = r1 - r3
            int r1 = r1 + r0
            int r4 = r4 - r6
            int r4 = r4 + r0
            if (r1 >= r4) goto Lb6
            int r1 = r1 + r4
            int r4 = r1 - r4
            int r1 = r1 - r4
        Lb6:
            java.nio.ByteOrder r6 = r5.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r1, r6)
            java.nio.ByteOrder r0 = r5.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r4, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r5.mAttributes
            r1 = r1[r2]
            java.lang.String r3 = "ImageWidth"
            r1.put(r3, r6)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r6 = r5.mAttributes
            r6 = r6[r2]
            java.lang.String r1 = "ImageLength"
            r6.put(r1, r0)
            return
        Ld5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid aspect frame values. frame="
            r0.append(r1)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r6)
        Lef:
            return
    }

    private void getPngAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r18) throws java.io.IOException {
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r2 == 0) goto L1e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getPngAttributes starting with: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ExifInterface"
            android.util.Log.d(r3, r2)
        L1e:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            r0.setByteOrder(r2)
            int r2 = r0.position()
            byte[] r3 = androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE
            int r3 = r3.length
            r0.skipFully(r3)
            r3 = 0
            r4 = r3
            r5 = r4
        L30:
            if (r4 == 0) goto L34
            if (r5 != 0) goto L62
        L34:
            int r6 = r0.readInt()     // Catch: java.io.EOFException -> L5a
            int r7 = r0.readInt()     // Catch: java.io.EOFException -> L5a
            int r8 = r0.position()     // Catch: java.io.EOFException -> L5a
            int r8 = r8 + r6
            int r8 = r8 + 4
            int r9 = r0.position()     // Catch: java.io.EOFException -> L5a
            int r9 = r9 - r2
            r10 = 16
            if (r9 != r10) goto L5d
            r9 = 1229472850(0x49484452, float:820293.1)
            if (r7 != r9) goto L52
            goto L5d
        L52:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.EOFException -> L5a
            java.lang.String r2 = "Encountered invalid PNG file--IHDR chunk should appear as the first chunk"
            r0.<init>(r2)     // Catch: java.io.EOFException -> L5a
            throw r0     // Catch: java.io.EOFException -> L5a
        L5a:
            r0 = move-exception
            goto Lfc
        L5d:
            r9 = 1229278788(0x49454e44, float:808164.25)
            if (r7 != r9) goto L65
        L62:
            r1.mFileOnDiskContainsSeparateXmpMarker = r5     // Catch: java.io.EOFException -> L5a
            return
        L65:
            r9 = 1700284774(0x65584966, float:6.383657E22)
            r10 = 1
            if (r7 != r9) goto Lc2
            if (r4 != 0) goto Lc2
            int r4 = r0.position()     // Catch: java.io.EOFException -> L5a
            int r4 = r4 - r2
            r1.mOffsetToExifData = r4     // Catch: java.io.EOFException -> L5a
            byte[] r4 = new byte[r6]     // Catch: java.io.EOFException -> L5a
            r0.readFully(r4)     // Catch: java.io.EOFException -> L5a
            int r6 = r0.readInt()     // Catch: java.io.EOFException -> L5a
            java.util.zip.CRC32 r9 = new java.util.zip.CRC32     // Catch: java.io.EOFException -> L5a
            r9.<init>()     // Catch: java.io.EOFException -> L5a
            updateCrcWithInt(r9, r7)     // Catch: java.io.EOFException -> L5a
            r9.update(r4)     // Catch: java.io.EOFException -> L5a
            long r11 = r9.getValue()     // Catch: java.io.EOFException -> L5a
            int r7 = (int) r11     // Catch: java.io.EOFException -> L5a
            if (r7 != r6) goto L9f
            r1.readExifSegment(r4, r3)     // Catch: java.io.EOFException -> L5a
            r1.validateImages()     // Catch: java.io.EOFException -> L5a
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r6 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.io.EOFException -> L5a
            r6.<init>(r4)     // Catch: java.io.EOFException -> L5a
            r1.setThumbnailData(r6)     // Catch: java.io.EOFException -> L5a
            r4 = r10
            goto Lf2
        L9f:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.EOFException -> L5a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L5a
            r2.<init>()     // Catch: java.io.EOFException -> L5a
            java.lang.String r3 = "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "
            r2.append(r3)     // Catch: java.io.EOFException -> L5a
            r2.append(r6)     // Catch: java.io.EOFException -> L5a
            java.lang.String r3 = ", calculated CRC value: "
            r2.append(r3)     // Catch: java.io.EOFException -> L5a
            long r3 = r9.getValue()     // Catch: java.io.EOFException -> L5a
            r2.append(r3)     // Catch: java.io.EOFException -> L5a
            java.lang.String r2 = r2.toString()     // Catch: java.io.EOFException -> L5a
            r0.<init>(r2)     // Catch: java.io.EOFException -> L5a
            throw r0     // Catch: java.io.EOFException -> L5a
        Lc2:
            r9 = 1767135348(0x69545874, float:1.6044374E25)
            if (r7 != r9) goto Lf2
            if (r5 != 0) goto Lf2
            byte[] r7 = androidx.exifinterface.media.ExifInterface.PNG_ITXT_XMP_KEYWORD     // Catch: java.io.EOFException -> L5a
            int r9 = r7.length     // Catch: java.io.EOFException -> L5a
            if (r6 < r9) goto Lf2
            int r9 = r7.length     // Catch: java.io.EOFException -> L5a
            byte[] r11 = new byte[r9]     // Catch: java.io.EOFException -> L5a
            r0.readFully(r11)     // Catch: java.io.EOFException -> L5a
            boolean r7 = java.util.Arrays.equals(r11, r7)     // Catch: java.io.EOFException -> L5a
            if (r7 == 0) goto Lf2
            int r5 = r0.position()     // Catch: java.io.EOFException -> L5a
            int r5 = r5 - r2
            int r13 = r6 - r9
            byte[] r6 = new byte[r13]     // Catch: java.io.EOFException -> L5a
            r0.readFully(r6)     // Catch: java.io.EOFException -> L5a
            androidx.exifinterface.media.ExifInterface$ExifAttribute r11 = new androidx.exifinterface.media.ExifInterface$ExifAttribute     // Catch: java.io.EOFException -> L5a
            r12 = 1
            long r14 = (long) r5     // Catch: java.io.EOFException -> L5a
            r16 = r6
            r11.<init>(r12, r13, r14, r16)     // Catch: java.io.EOFException -> L5a
            r1.mXmpFromSeparateMarker = r11     // Catch: java.io.EOFException -> L5a
            r5 = r10
        Lf2:
            int r6 = r0.position()     // Catch: java.io.EOFException -> L5a
            int r8 = r8 - r6
            r0.skipFully(r8)     // Catch: java.io.EOFException -> L5a
            goto L30
        Lfc:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Encountered corrupt PNG file."
            r2.<init>(r3, r0)
            throw r2
    }

    private void getRafAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r8) throws java.io.IOException {
            r7 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            java.lang.String r1 = "ExifInterface"
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getRafAttributes starting with: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
        L1a:
            r2 = 84
            r8.skipFully(r2)
            r2 = 4
            byte[] r3 = new byte[r2]
            byte[] r4 = new byte[r2]
            byte[] r2 = new byte[r2]
            r8.readFully(r3)
            r8.readFully(r4)
            r8.readFully(r2)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            int r3 = r3.getInt()
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            int r4 = r4.getInt()
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            int r2 = r2.getInt()
            byte[] r4 = new byte[r4]
            int r5 = r8.position()
            int r5 = r3 - r5
            r8.skipFully(r5)
            r8.readFully(r4)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r5 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r5.<init>(r4)
            r4 = 5
            r7.getJpegAttributes(r5, r3, r4)
            int r3 = r8.position()
            int r2 = r2 - r3
            r8.skipFully(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            r8.setByteOrder(r2)
            int r2 = r8.readInt()
            if (r0 == 0) goto L85
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "numberOfDirectoryEntry: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L85:
            r0 = 0
            r3 = r0
        L87:
            if (r3 >= r2) goto Le4
            int r4 = r8.readUnsignedShort()
            int r5 = r8.readUnsignedShort()
            androidx.exifinterface.media.ExifInterface$ExifTag r6 = androidx.exifinterface.media.ExifInterface.TAG_RAF_IMAGE_SIZE
            int r6 = r6.number
            if (r4 != r6) goto Lde
            short r2 = r8.readShort()
            short r8 = r8.readShort()
            java.nio.ByteOrder r3 = r7.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r2, r3)
            java.nio.ByteOrder r4 = r7.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r8, r4)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r7.mAttributes
            r5 = r5[r0]
            java.lang.String r6 = "ImageLength"
            r5.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r7.mAttributes
            r0 = r3[r0]
            java.lang.String r3 = "ImageWidth"
            r0.put(r3, r4)
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto Le4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Updated to length: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = ", width: "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            android.util.Log.d(r1, r8)
            return
        Lde:
            r8.skipFully(r5)
            int r3 = r3 + 1
            goto L87
        Le4:
            return
    }

    private void getRawAttributes(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r4) throws java.io.IOException {
            r3 = this;
            r3.parseTiffHeaders(r4)
            r0 = 0
            r3.readImageFileDirectory(r4, r0)
            r3.updateImageSizeValues(r4, r0)
            r0 = 5
            r3.updateImageSizeValues(r4, r0)
            r0 = 4
            r3.updateImageSizeValues(r4, r0)
            r3.validateImages()
            int r4 = r3.mMimeType
            r0 = 8
            if (r4 != r0) goto L54
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r3.mAttributes
            r0 = 1
            r4 = r4[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r4 = r4.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            if (r4 == 0) goto L54
            androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream
            byte[] r4 = r4.bytes
            r1.<init>(r4)
            java.nio.ByteOrder r4 = r3.mExifByteOrder
            r1.setByteOrder(r4)
            r4 = 6
            r1.skipFully(r4)
            r4 = 9
            r3.readImageFileDirectory(r1, r4)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r3.mAttributes
            r4 = r1[r4]
            java.lang.String r1 = "ColorSpace"
            java.lang.Object r4 = r4.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            if (r4 == 0) goto L54
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r3.mAttributes
            r0 = r2[r0]
            r0.put(r1, r4)
        L54:
            return
    }

    private void getRw2Attributes(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getRw2Attributes starting with: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L1a:
            r4.getRawAttributes(r5)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r4.mAttributes
            r0 = 0
            r5 = r5[r0]
            java.lang.String r1 = "JpgFromRaw"
            java.lang.Object r5 = r5.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r5
            if (r5 == 0) goto L3a
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            byte[] r2 = r5.bytes
            r1.<init>(r2)
            long r2 = r5.bytesOffset
            int r5 = (int) r2
            r2 = 5
            r4.getJpegAttributes(r1, r5, r2)
        L3a:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r4.mAttributes
            r5 = r5[r0]
            java.lang.String r0 = "ISO"
            java.lang.Object r5 = r5.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r5
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r1 = 1
            r0 = r0[r1]
            java.lang.String r2 = "PhotographicSensitivity"
            java.lang.Object r0 = r0.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            if (r5 == 0) goto L5e
            if (r0 != 0) goto L5e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r0 = r0[r1]
            r0.put(r2, r5)
        L5e:
            return
    }

    private boolean getStandaloneAttributes(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r4) throws java.io.IOException {
            r3 = this;
            byte[] r0 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            int r1 = r0.length
            byte[] r1 = new byte[r1]
            r4.readFully(r1)
            boolean r1 = java.util.Arrays.equals(r1, r0)
            r2 = 0
            if (r1 != 0) goto L17
            java.lang.String r4 = "ExifInterface"
            java.lang.String r0 = "Given data is not EXIF-only."
            android.util.Log.w(r4, r0)
            return r2
        L17:
            byte[] r4 = r4.readToEnd()
            int r0 = r0.length
            r3.mOffsetToExifData = r0
            r3.readExifSegment(r4, r2)
            r4 = 1
            return r4
    }

    private void getWebpAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getWebpAttributes starting with: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L1a:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.setByteOrder(r0)
            byte[] r0 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r0 = r0.length
            r6.skipFully(r0)
            int r0 = r6.readInt()
            int r0 = r0 + 8
            byte[] r1 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2
            int r2 = r1.length
            r6.skipFully(r2)
            int r1 = r1.length
            int r1 = r1 + 8
        L34:
            r2 = 4
            byte[] r2 = new byte[r2]     // Catch: java.io.EOFException -> L5b
            r6.readFully(r2)     // Catch: java.io.EOFException -> L5b
            int r3 = r6.readInt()     // Catch: java.io.EOFException -> L5b
            int r1 = r1 + 8
            byte[] r4 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_EXIF     // Catch: java.io.EOFException -> L5b
            boolean r2 = java.util.Arrays.equals(r4, r2)     // Catch: java.io.EOFException -> L5b
            if (r2 == 0) goto L6c
            byte[] r0 = new byte[r3]     // Catch: java.io.EOFException -> L5b
            r6.readFully(r0)     // Catch: java.io.EOFException -> L5b
            byte[] r6 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1     // Catch: java.io.EOFException -> L5b
            boolean r2 = androidx.exifinterface.media.ExifInterfaceUtils.startsWith(r0, r6)     // Catch: java.io.EOFException -> L5b
            if (r2 == 0) goto L5d
            int r6 = r6.length     // Catch: java.io.EOFException -> L5b
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r6, r3)     // Catch: java.io.EOFException -> L5b
            goto L5d
        L5b:
            r6 = move-exception
            goto L85
        L5d:
            r5.mOffsetToExifData = r1     // Catch: java.io.EOFException -> L5b
            r6 = 0
            r5.readExifSegment(r0, r6)     // Catch: java.io.EOFException -> L5b
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r6 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.io.EOFException -> L5b
            r6.<init>(r0)     // Catch: java.io.EOFException -> L5b
            r5.setThumbnailData(r6)     // Catch: java.io.EOFException -> L5b
            return
        L6c:
            int r2 = r3 % 2
            r4 = 1
            if (r2 != r4) goto L73
            int r3 = r3 + 1
        L73:
            int r1 = r1 + r3
            if (r1 != r0) goto L77
            return
        L77:
            if (r1 > r0) goto L7d
            r6.skipFully(r3)     // Catch: java.io.EOFException -> L5b
            goto L34
        L7d:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.io.EOFException -> L5b
            java.lang.String r0 = "Encountered WebP file with invalid chunk size"
            r6.<init>(r0)     // Catch: java.io.EOFException -> L5b
            throw r6     // Catch: java.io.EOFException -> L5b
        L85:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Encountered corrupt WebP file."
            r0.<init>(r1, r6)
            throw r0
    }

    private static int getXmpHandlingForImageType(int r1) {
            r0 = 4
            if (r1 == r0) goto L17
            r0 = 9
            if (r1 == r0) goto L15
            r0 = 15
            if (r1 == r0) goto L15
            r0 = 12
            if (r1 == r0) goto L15
            r0 = 13
            if (r1 == r0) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 2
            return r1
        L17:
            r1 = 3
            return r1
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat(java.lang.String r10) {
            java.lang.String r0 = ","
            boolean r1 = r10.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto La6
            java.lang.String[] r10 = r10.split(r0, r6)
            r0 = r10[r2]
            android.util.Pair r0 = guessDataFormat(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L29
            return r0
        L29:
            int r1 = r10.length
            if (r3 >= r1) goto La5
            r1 = r10[r3]
            android.util.Pair r1 = guessDataFormat(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L4d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L4b
            goto L4d
        L4b:
            r2 = r6
            goto L55
        L4d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L55:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L80
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L77
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L80
        L77:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L81
        L80:
            r1 = r6
        L81:
            if (r2 != r6) goto L8b
            if (r1 != r6) goto L8b
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L8b:
            if (r2 != r6) goto L97
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto La2
        L97:
            if (r1 != r6) goto La2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        La2:
            int r3 = r3 + 1
            goto L29
        La5:
            return r0
        La6:
            java.lang.String r0 = "/"
            boolean r1 = r10.contains(r0)
            r8 = 0
            if (r1 == 0) goto L105
            java.lang.String[] r10 = r10.split(r0, r6)
            int r0 = r10.length
            if (r0 != r4) goto Lff
            r0 = r10[r2]     // Catch: java.lang.NumberFormatException -> Lff
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> Lff
            long r0 = (long) r0     // Catch: java.lang.NumberFormatException -> Lff
            r10 = r10[r3]     // Catch: java.lang.NumberFormatException -> Lff
            double r2 = java.lang.Double.parseDouble(r10)     // Catch: java.lang.NumberFormatException -> Lff
            long r2 = (long) r2     // Catch: java.lang.NumberFormatException -> Lff
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = 10
            if (r10 < 0) goto Lf5
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 >= 0) goto Ld0
            goto Lf5
        Ld0:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r0 = 5
            if (r10 > 0) goto Leb
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 <= 0) goto Ldd
            goto Leb
        Ldd:
            android.util.Pair r10 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> Lff
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> Lff
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lff
            r10.<init>(r1, r0)     // Catch: java.lang.NumberFormatException -> Lff
            return r10
        Leb:
            android.util.Pair r10 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> Lff
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lff
            r10.<init>(r0, r7)     // Catch: java.lang.NumberFormatException -> Lff
            return r10
        Lf5:
            android.util.Pair r10 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> Lff
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> Lff
            r10.<init>(r0, r7)     // Catch: java.lang.NumberFormatException -> Lff
            return r10
        Lff:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L105:
            long r0 = java.lang.Long.parseLong(r10)     // Catch: java.lang.NumberFormatException -> L13c
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r3 = 4
            if (r2 < 0) goto L124
            r8 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L124
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L13c
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L13c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L13c
            r0.<init>(r1, r2)     // Catch: java.lang.NumberFormatException -> L13c
            return r0
        L124:
            if (r2 >= 0) goto L132
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L13c
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L13c
            r0.<init>(r1, r7)     // Catch: java.lang.NumberFormatException -> L13c
            return r0
        L132:
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L13c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L13c
            r0.<init>(r1, r7)     // Catch: java.lang.NumberFormatException -> L13c
            return r0
        L13c:
            java.lang.Double.parseDouble(r10)     // Catch: java.lang.NumberFormatException -> L14b
            android.util.Pair r10 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L14b
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L14b
            r10.<init>(r0, r7)     // Catch: java.lang.NumberFormatException -> L14b
            return r10
        L14b:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
    }

    private void handleThumbnailFromJfif(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4, java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "JPEGInterchangeFormat"
            java.lang.Object r0 = r5.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.lang.String r1 = "JPEGInterchangeFormatLength"
            java.lang.Object r5 = r5.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r5
            if (r0 == 0) goto L6b
            if (r5 == 0) goto L6b
            java.nio.ByteOrder r1 = r3.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r3.mExifByteOrder
            int r5 = r5.getIntValue(r1)
            int r1 = r3.mMimeType
            r2 = 7
            if (r1 != r2) goto L28
            int r1 = r3.mOrfMakerNoteOffset
            int r0 = r0 + r1
        L28:
            if (r0 <= 0) goto L49
            if (r5 <= 0) goto L49
            r1 = 1
            r3.mHasThumbnail = r1
            java.lang.String r1 = r3.mFilename
            if (r1 != 0) goto L45
            android.content.res.AssetManager$AssetInputStream r1 = r3.mAssetInputStream
            if (r1 != 0) goto L45
            java.io.FileDescriptor r1 = r3.mSeekableFileDescriptor
            if (r1 != 0) goto L45
            byte[] r1 = new byte[r5]
            r4.skipFully(r0)
            r4.readFully(r1)
            r3.mThumbnailBytes = r1
        L45:
            r3.mThumbnailOffset = r0
            r3.mThumbnailLength = r5
        L49:
            boolean r4 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r4 == 0) goto L6b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Setting thumbnail attributes with offset: "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = ", length: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "ExifInterface"
            android.util.Log.d(r5, r4)
        L6b:
            return
    }

    private void handleThumbnailFromStrips(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r20, java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> r21) throws java.io.IOException {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = " bytes."
            java.lang.String r4 = "StripOffsets"
            java.lang.Object r4 = r2.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            java.lang.String r5 = "StripByteCounts"
            java.lang.Object r2 = r2.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r2
            if (r4 == 0) goto Lea
            if (r2 == 0) goto Lea
            java.nio.ByteOrder r5 = r0.mExifByteOrder
            java.lang.Object r4 = r4.getValue(r5)
            long[] r4 = androidx.exifinterface.media.ExifInterfaceUtils.convertToLongArray(r4)
            java.nio.ByteOrder r5 = r0.mExifByteOrder
            java.lang.Object r2 = r2.getValue(r5)
            long[] r2 = androidx.exifinterface.media.ExifInterfaceUtils.convertToLongArray(r2)
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto Le4
            int r6 = r4.length
            if (r6 != 0) goto L39
            goto Le4
        L39:
            if (r2 == 0) goto Ldd
            int r6 = r2.length
            if (r6 != 0) goto L40
            goto Ldd
        L40:
            int r6 = r4.length
            int r7 = r2.length
            if (r6 == r7) goto L4b
            java.lang.String r1 = "stripOffsets and stripByteCounts should have same length."
            android.util.Log.w(r5, r1)
            return
        L4b:
            int r6 = r2.length
            r7 = 0
            r8 = 0
            r10 = r7
        L50:
            if (r10 >= r6) goto L58
            r11 = r2[r10]
            long r8 = r8 + r11
            int r10 = r10 + 1
            goto L50
        L58:
            int r6 = (int) r8
            byte[] r8 = new byte[r6]
            r9 = 1
            r0.mAreThumbnailStripsConsecutive = r9
            r0.mHasThumbnailStrips = r9
            r0.mHasThumbnail = r9
            r10 = r7
            r11 = r10
            r12 = r11
        L65:
            int r13 = r4.length
            if (r10 >= r13) goto Lcf
            r13 = r4[r10]
            int r13 = (int) r13
            r14 = r2[r10]
            int r14 = (int) r14
            int r15 = r4.length
            int r15 = r15 - r9
            if (r10 >= r15) goto L82
            int r15 = r13 + r14
            r16 = r10
            long r9 = (long) r15
            int r15 = r16 + 1
            r17 = r4[r15]
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 == 0) goto L84
            r0.mAreThumbnailStripsConsecutive = r7
            goto L84
        L82:
            r16 = r10
        L84:
            int r13 = r13 - r11
            if (r13 >= 0) goto L8d
            java.lang.String r1 = "Invalid strip offset value"
            android.util.Log.d(r5, r1)
            return
        L8d:
            r1.skipFully(r13)     // Catch: java.io.EOFException -> Lb7
            int r11 = r11 + r13
            byte[] r9 = new byte[r14]
            r1.readFully(r9)     // Catch: java.io.EOFException -> L9f
            int r11 = r11 + r14
            java.lang.System.arraycopy(r9, r7, r8, r12, r14)
            int r12 = r12 + r14
            int r10 = r16 + 1
            r9 = 1
            goto L65
        L9f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read "
            r1.append(r2)
            r1.append(r14)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
            return
        Lb7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to skip "
            r1.append(r2)
            r1.append(r13)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
            return
        Lcf:
            r0.mThumbnailBytes = r8
            boolean r1 = r0.mAreThumbnailStripsConsecutive
            if (r1 == 0) goto Lea
            r1 = r4[r7]
            int r1 = (int) r1
            r0.mThumbnailOffset = r1
            r0.mThumbnailLength = r6
            return
        Ldd:
            java.lang.String r1 = "stripByteCounts should not be null or have zero length."
            android.util.Log.w(r5, r1)
            return
        Le4:
            java.lang.String r1 = "stripOffsets should not be null or have zero length."
            android.util.Log.w(r5, r1)
        Lea:
            return
    }

    private void initForFilename(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            if (r3 == 0) goto L2e
            r0 = 0
            r2.mAssetInputStream = r0
            r2.mFilename = r3
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L29
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L29
            java.io.FileDescriptor r3 = r1.getFD()     // Catch: java.lang.Throwable -> L1d
            boolean r3 = isSeekableFD(r3)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L20
            java.io.FileDescriptor r3 = r1.getFD()     // Catch: java.lang.Throwable -> L1d
            r2.mSeekableFileDescriptor = r3     // Catch: java.lang.Throwable -> L1d
            goto L22
        L1d:
            r3 = move-exception
            r0 = r1
            goto L2a
        L20:
            r2.mSeekableFileDescriptor = r0     // Catch: java.lang.Throwable -> L1d
        L22:
            r2.loadAttributes(r1)     // Catch: java.lang.Throwable -> L1d
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r1)
            return
        L29:
            r3 = move-exception
        L2a:
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r0)
            throw r3
        L2e:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "filename cannot be null"
            r3.<init>(r0)
            throw r3
    }

    private int isHeicOrAvifFormat(byte[] r15) throws java.io.IOException {
            r14 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r2.<init>(r15)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            int r1 = r2.readInt()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            r2.readFully(r5)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            byte[] r6 = androidx.exifinterface.media.ExifInterface.HEIF_TYPE_FTYP     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            if (r5 != 0) goto L1e
            r2.close()
            return r0
        L1e:
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 8
            if (r7 != 0) goto L3c
            long r3 = r2.readLong()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            r10 = 16
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 >= 0) goto L3d
            r2.close()
            return r0
        L34:
            r15 = move-exception
            r1 = r2
            goto Lbb
        L38:
            r15 = move-exception
            r1 = r2
            goto Laa
        L3c:
            r10 = r8
        L3d:
            int r7 = r15.length     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            long r12 = (long) r7     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L45
            int r15 = r15.length     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            long r3 = (long) r15
        L45:
            long r3 = r3 - r10
            int r15 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r15 >= 0) goto L4e
            r2.close()
            return r0
        L4e:
            byte[] r15 = new byte[r1]     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            r7 = 0
            r1 = r0
            r9 = r1
            r10 = r9
        L55:
            r11 = 4
            long r11 = r3 / r11
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 >= 0) goto La3
            r2.readFully(r15)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38 java.io.EOFException -> L9f
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L65
            goto L9d
        L65:
            byte[] r11 = androidx.exifinterface.media.ExifInterface.HEIF_BRAND_MIF1     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            r12 = 1
            if (r11 == 0) goto L70
            r1 = r12
            goto L8b
        L70:
            byte[] r11 = androidx.exifinterface.media.ExifInterface.HEIF_BRAND_HEIC     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            if (r11 == 0) goto L7a
            r9 = r12
            goto L8b
        L7a:
            byte[] r11 = androidx.exifinterface.media.ExifInterface.HEIF_BRAND_AVIF     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            if (r11 != 0) goto L8a
            byte[] r11 = androidx.exifinterface.media.ExifInterface.HEIF_BRAND_AVIS     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L38
            if (r11 == 0) goto L8b
        L8a:
            r10 = r12
        L8b:
            if (r1 == 0) goto L9d
            if (r9 == 0) goto L95
            r2.close()
            r15 = 12
            return r15
        L95:
            if (r10 == 0) goto L9d
            r2.close()
            r15 = 15
            return r15
        L9d:
            long r7 = r7 + r5
            goto L55
        L9f:
            r2.close()
            return r0
        La3:
            r2.close()
            goto Lba
        La7:
            r15 = move-exception
            goto Lbb
        La9:
            r15 = move-exception
        Laa:
            boolean r2 = androidx.exifinterface.media.ExifInterface.DEBUG     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto Lb5
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch: java.lang.Throwable -> La7
        Lb5:
            if (r1 == 0) goto Lba
            r1.close()
        Lba:
            return r0
        Lbb:
            if (r1 == 0) goto Lc0
            r1.close()
        Lc0:
            throw r15
    }

    private static boolean isJpegFormat(byte[] r4) throws java.io.IOException {
            r0 = 0
            r1 = r0
        L2:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.JPEG_SIGNATURE
            int r3 = r2.length
            if (r1 >= r3) goto L11
            r3 = r4[r1]
            r2 = r2[r1]
            if (r3 == r2) goto Le
            return r0
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            r4 = 1
            return r4
    }

    private boolean isOrfFormat(byte[] r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2d
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2d
            java.nio.ByteOrder r4 = r3.readByteOrder(r2)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r3.mExifByteOrder = r4     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r2.setByteOrder(r4)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            short r4 = r2.readShort()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L1c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L1d
        L1c:
            r0 = 1
        L1d:
            r2.close()
            return r0
        L21:
            r4 = move-exception
            r1 = r2
            goto L27
        L24:
            r1 = r2
            goto L2d
        L26:
            r4 = move-exception
        L27:
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            throw r4
        L2d:
            if (r1 == 0) goto L32
            r1.close()
        L32:
            return r0
    }

    private boolean isPngFormat(byte[] r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE
            int r3 = r2.length
            if (r1 >= r3) goto L11
            r3 = r5[r1]
            r2 = r2[r1]
            if (r3 == r2) goto Le
            return r0
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            r5 = 1
            return r5
    }

    private boolean isRafFormat(byte[] r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            byte[] r0 = r0.getBytes(r1)
            r1 = 0
            r2 = r1
        Lc:
            int r3 = r0.length
            if (r2 >= r3) goto L19
            r3 = r6[r2]
            r4 = r0[r2]
            if (r3 == r4) goto L16
            return r1
        L16:
            int r2 = r2 + 1
            goto Lc
        L19:
            r6 = 1
            return r6
    }

    private boolean isRw2Format(byte[] r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L29
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L29
            java.nio.ByteOrder r4 = r3.readByteOrder(r2)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r3.mExifByteOrder = r4     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r2.setByteOrder(r4)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            short r4 = r2.readShort()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r1 = 85
            if (r4 != r1) goto L19
            r0 = 1
        L19:
            r2.close()
            return r0
        L1d:
            r4 = move-exception
            r1 = r2
            goto L23
        L20:
            r1 = r2
            goto L29
        L22:
            r4 = move-exception
        L23:
            if (r1 == 0) goto L28
            r1.close()
        L28:
            throw r4
        L29:
            if (r1 == 0) goto L2e
            r1.close()
        L2e:
            return r0
    }

    private static boolean isSeekableFD(java.io.FileDescriptor r3) {
            int r0 = android.system.OsConstants.SEEK_CUR     // Catch: java.lang.Exception -> L9
            r1 = 0
            android.system.Os.lseek(r3, r1, r0)     // Catch: java.lang.Exception -> L9
            r3 = 1
            return r3
        L9:
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r3 == 0) goto L14
            java.lang.String r3 = "ExifInterface"
            java.lang.String r0 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r3, r0)
        L14:
            r3 = 0
            return r3
    }

    private boolean isSupportedDataType(java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> r6) {
            r5 = this;
            java.lang.String r0 = "BitsPerSample"
            java.lang.Object r0 = r6.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            if (r0 == 0) goto L45
            java.nio.ByteOrder r1 = r5.mExifByteOrder
            java.lang.Object r0 = r0.getValue(r1)
            int[] r0 = (int[]) r0
            int[] r1 = androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_RGB
            boolean r2 = java.util.Arrays.equals(r1, r0)
            r3 = 1
            if (r2 == 0) goto L1c
            return r3
        L1c:
            int r2 = r5.mMimeType
            r4 = 3
            if (r2 != r4) goto L45
            java.lang.String r2 = "PhotometricInterpretation"
            java.lang.Object r6 = r6.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r6
            if (r6 == 0) goto L45
            java.nio.ByteOrder r2 = r5.mExifByteOrder
            int r6 = r6.getIntValue(r2)
            if (r6 != r3) goto L3b
            int[] r2 = androidx.exifinterface.media.ExifInterface.BITS_PER_SAMPLE_GREYSCALE_2
            boolean r2 = java.util.Arrays.equals(r0, r2)
            if (r2 != 0) goto L44
        L3b:
            r2 = 6
            if (r6 != r2) goto L45
            boolean r6 = java.util.Arrays.equals(r0, r1)
            if (r6 == 0) goto L45
        L44:
            return r3
        L45:
            boolean r6 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r6 == 0) goto L50
            java.lang.String r6 = "ExifInterface"
            java.lang.String r0 = "Unsupported data type value"
            android.util.Log.d(r6, r0)
        L50:
            r6 = 0
            return r6
    }

    private static boolean isSupportedFormatForSavingAttributes(int r1) {
            r0 = 4
            if (r1 == r0) goto Le
            r0 = 13
            if (r1 == r0) goto Le
            r0 = 14
            if (r1 != r0) goto Lc
            goto Le
        Lc:
            r1 = 0
            return r1
        Le:
            r1 = 1
            return r1
    }

    public static boolean isSupportedMimeType(java.lang.String r4) {
            r0 = 1
            r1 = 0
            if (r4 == 0) goto Ld5
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r2)
            r4.getClass()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case -1875291391: goto Lc6;
                case -1635437028: goto Lbb;
                case -1594371159: goto Lb0;
                case -1487464693: goto La5;
                case -1487464690: goto L9a;
                case -1487394660: goto L8f;
                case -1487018032: goto L84;
                case -1423313290: goto L79;
                case -985160897: goto L6b;
                case -879258763: goto L5d;
                case -332763809: goto L4f;
                case 1378106698: goto L41;
                case 2099152104: goto L33;
                case 2099152524: goto L25;
                case 2111234748: goto L17;
                default: goto L15;
            }
        L15:
            goto Ld0
        L17:
            java.lang.String r3 = "image/x-canon-cr2"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L21
            goto Ld0
        L21:
            r2 = 14
            goto Ld0
        L25:
            java.lang.String r3 = "image/x-nikon-nrw"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L2f
            goto Ld0
        L2f:
            r2 = 13
            goto Ld0
        L33:
            java.lang.String r3 = "image/x-nikon-nef"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L3d
            goto Ld0
        L3d:
            r2 = 12
            goto Ld0
        L41:
            java.lang.String r3 = "image/x-olympus-orf"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L4b
            goto Ld0
        L4b:
            r2 = 11
            goto Ld0
        L4f:
            java.lang.String r3 = "image/x-pentax-pef"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L59
            goto Ld0
        L59:
            r2 = 10
            goto Ld0
        L5d:
            java.lang.String r3 = "image/png"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L67
            goto Ld0
        L67:
            r2 = 9
            goto Ld0
        L6b:
            java.lang.String r3 = "image/x-panasonic-rw2"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L75
            goto Ld0
        L75:
            r2 = 8
            goto Ld0
        L79:
            java.lang.String r3 = "image/x-adobe-dng"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L82
            goto Ld0
        L82:
            r2 = 7
            goto Ld0
        L84:
            java.lang.String r3 = "image/webp"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L8d
            goto Ld0
        L8d:
            r2 = 6
            goto Ld0
        L8f:
            java.lang.String r3 = "image/jpeg"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L98
            goto Ld0
        L98:
            r2 = 5
            goto Ld0
        L9a:
            java.lang.String r3 = "image/heif"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto La3
            goto Ld0
        La3:
            r2 = 4
            goto Ld0
        La5:
            java.lang.String r3 = "image/heic"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto Lae
            goto Ld0
        Lae:
            r2 = 3
            goto Ld0
        Lb0:
            java.lang.String r3 = "image/x-sony-arw"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto Lb9
            goto Ld0
        Lb9:
            r2 = 2
            goto Ld0
        Lbb:
            java.lang.String r3 = "image/x-samsung-srw"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto Lc4
            goto Ld0
        Lc4:
            r2 = r0
            goto Ld0
        Lc6:
            java.lang.String r3 = "image/x-fuji-raf"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto Lcf
            goto Ld0
        Lcf:
            r2 = r1
        Ld0:
            switch(r2) {
                case 0: goto Ld4;
                case 1: goto Ld4;
                case 2: goto Ld4;
                case 3: goto Ld4;
                case 4: goto Ld4;
                case 5: goto Ld4;
                case 6: goto Ld4;
                case 7: goto Ld4;
                case 8: goto Ld4;
                case 9: goto Ld4;
                case 10: goto Ld4;
                case 11: goto Ld4;
                case 12: goto Ld4;
                case 13: goto Ld4;
                case 14: goto Ld4;
                default: goto Ld3;
            }
        Ld3:
            return r1
        Ld4:
            return r0
        Ld5:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "mimeType shouldn't be null"
            r4.<init>(r0)
            throw r4
    }

    private boolean isThumbnail(java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> r3) {
            r2 = this;
            java.lang.String r0 = "ImageLength"
            java.lang.Object r0 = r3.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.lang.String r1 = "ImageWidth"
            java.lang.Object r3 = r3.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            if (r0 == 0) goto L28
            if (r3 == 0) goto L28
            java.nio.ByteOrder r1 = r2.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r2.mExifByteOrder
            int r3 = r3.getIntValue(r1)
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L28
            if (r3 > r1) goto L28
            r3 = 1
            return r3
        L28:
            r3 = 0
            return r3
    }

    private boolean isWebpFormat(byte[] r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r3 = r2.length
            if (r1 >= r3) goto L11
            r3 = r5[r1]
            r2 = r2[r1]
            if (r3 == r2) goto Le
            return r0
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            r1 = r0
        L12:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2
            int r3 = r2.length
            if (r1 >= r3) goto L27
            byte[] r3 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r3 = r3.length
            int r3 = r3 + r1
            int r3 = r3 + 4
            r3 = r5[r3]
            r2 = r2[r1]
            if (r3 == r2) goto L24
            return r0
        L24:
            int r1 = r1 + 1
            goto L12
        L27:
            r5 = 1
            return r5
    }

    private void loadAttributes(java.io.InputStream r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r2 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            int r2 = r2.length     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r1 >= r2) goto L1c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r4.mAttributes     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r3.<init>()     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r2[r1] = r3     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            int r1 = r1 + 1
            goto L2
        L13:
            r5 = move-exception
            goto Lbf
        L16:
            r5 = move-exception
            goto Lab
        L19:
            r5 = move-exception
            goto Lab
        L1c:
            boolean r1 = r4.mIsExifDataOnly     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r1 != 0) goto L2e
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            int r5 = r4.getMimeType(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r4.mMimeType = r5     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r5 = r1
        L2e:
            int r1 = r4.mMimeType     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            boolean r1 = shouldSupportSeek(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r1 == 0) goto L7b
            androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream r0 = new androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            boolean r5 = r4.mIsExifDataOnly     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r5 == 0) goto L50
            boolean r5 = r4.getStandaloneAttributes(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r5 != 0) goto L71
            r4.addDefaultValuesForCompatibility()
            boolean r5 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r5 == 0) goto Lbe
            r4.printAttributes()
            return
        L50:
            int r5 = r4.mMimeType     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r1 = 12
            if (r5 == r1) goto L6e
            r1 = 15
            if (r5 != r1) goto L5b
            goto L6e
        L5b:
            r1 = 7
            if (r5 != r1) goto L62
            r4.getOrfAttributes(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto L71
        L62:
            r1 = 10
            if (r5 != r1) goto L6a
            r4.getRw2Attributes(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto L71
        L6a:
            r4.getRawAttributes(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto L71
        L6e:
            r4.getHeifAttributes(r0, r5)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
        L71:
            int r5 = r4.mOffsetToExifData     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r0.seek(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r4.setThumbnailData(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto La0
        L7b:
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            int r5 = r4.mMimeType     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r2 = 4
            if (r5 != r2) goto L89
            r4.getJpegAttributes(r1, r0, r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto La0
        L89:
            r0 = 13
            if (r5 != r0) goto L91
            r4.getPngAttributes(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto La0
        L91:
            r0 = 9
            if (r5 != r0) goto L99
            r4.getRafAttributes(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto La0
        L99:
            r0 = 14
            if (r5 != r0) goto La0
            r4.getWebpAttributes(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
        La0:
            r4.addDefaultValuesForCompatibility()
            boolean r5 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r5 == 0) goto Lbe
            r4.printAttributes()
            return
        Lab:
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Lb6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L13
        Lb6:
            r4.addDefaultValuesForCompatibility()
            if (r0 == 0) goto Lbe
            r4.printAttributes()
        Lbe:
            return
        Lbf:
            r4.addDefaultValuesForCompatibility()
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto Lc9
            r4.printAttributes()
        Lc9:
            throw r5
    }

    private static java.lang.Long parseDateTime(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r0 = 0
            if (r10 == 0) goto L84
            java.util.regex.Pattern r1 = androidx.exifinterface.media.ExifInterface.NON_ZERO_TIME_PATTERN
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L11
            goto L84
        L11:
            java.text.ParsePosition r1 = new java.text.ParsePosition
            r2 = 0
            r1.<init>(r2)
            java.text.SimpleDateFormat r3 = androidx.exifinterface.media.ExifInterface.sFormatterPrimary     // Catch: java.lang.IllegalArgumentException -> L84
            java.util.Date r3 = r3.parse(r10, r1)     // Catch: java.lang.IllegalArgumentException -> L84
            if (r3 != 0) goto L28
            java.text.SimpleDateFormat r3 = androidx.exifinterface.media.ExifInterface.sFormatterSecondary     // Catch: java.lang.IllegalArgumentException -> L84
            java.util.Date r3 = r3.parse(r10, r1)     // Catch: java.lang.IllegalArgumentException -> L84
            if (r3 != 0) goto L28
            return r0
        L28:
            long r3 = r3.getTime()     // Catch: java.lang.IllegalArgumentException -> L84
            if (r12 == 0) goto L78
            r10 = 1
            java.lang.String r1 = r12.substring(r2, r10)     // Catch: java.lang.IllegalArgumentException -> L84
            r2 = 3
            java.lang.String r5 = r12.substring(r10, r2)     // Catch: java.lang.IllegalArgumentException -> L84
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.IllegalArgumentException -> L84
            r6 = 6
            r7 = 4
            java.lang.String r6 = r12.substring(r7, r6)     // Catch: java.lang.IllegalArgumentException -> L84
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.IllegalArgumentException -> L84
            java.lang.String r8 = "+"
            boolean r8 = r8.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L84
            java.lang.String r9 = "-"
            if (r8 != 0) goto L56
            boolean r8 = r9.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L84
            if (r8 == 0) goto L78
        L56:
            java.lang.String r8 = ":"
            java.lang.String r12 = r12.substring(r2, r7)     // Catch: java.lang.IllegalArgumentException -> L84
            boolean r12 = r8.equals(r12)     // Catch: java.lang.IllegalArgumentException -> L84
            if (r12 == 0) goto L78
            r12 = 14
            if (r5 > r12) goto L78
            int r5 = r5 * 60
            int r5 = r5 + r6
            r12 = 60000(0xea60, float:8.4078E-41)
            int r5 = r5 * r12
            boolean r12 = r9.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L84
            if (r12 == 0) goto L74
            goto L75
        L74:
            r10 = -1
        L75:
            int r5 = r5 * r10
            long r1 = (long) r5     // Catch: java.lang.IllegalArgumentException -> L84
            long r3 = r3 + r1
        L78:
            if (r11 == 0) goto L7f
            long r10 = androidx.exifinterface.media.ExifInterfaceUtils.parseSubSeconds(r11)     // Catch: java.lang.IllegalArgumentException -> L84
            long r3 = r3 + r10
        L7f:
            java.lang.Long r10 = java.lang.Long.valueOf(r3)     // Catch: java.lang.IllegalArgumentException -> L84
            return r10
        L84:
            return r0
    }

    private void parseTiffHeaders(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4) throws java.io.IOException {
            r3 = this;
            java.nio.ByteOrder r0 = r3.readByteOrder(r4)
            r3.mExifByteOrder = r0
            r4.setByteOrder(r0)
            int r0 = r4.readUnsignedShort()
            int r1 = r3.mMimeType
            r2 = 7
            if (r1 == r2) goto L36
            r2 = 10
            if (r1 == r2) goto L36
            r1 = 42
            if (r0 != r1) goto L1b
            goto L36
        L1b:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid start code: "
            r1.append(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L36:
            int r0 = r4.readInt()
            r1 = 8
            if (r0 < r1) goto L46
            int r0 = r0 + (-8)
            if (r0 <= 0) goto L45
            r4.skipFully(r0)
        L45:
            return
        L46:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid first Ifd offset: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
    }

    private void printAttributes() {
            r7 = this;
            r0 = 0
        L1:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r7.mAttributes
            int r1 = r1.length
            if (r0 >= r1) goto L89
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The size of tag group["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "]: "
            r1.append(r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r7.mAttributes
            r2 = r2[r0]
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ExifInterface"
            android.util.Log.d(r2, r1)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r7.mAttributes
            r1 = r1[r0]
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L38:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L85
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "tagName: "
            r5.append(r6)
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r5.append(r3)
            java.lang.String r3 = ", tagType: "
            r5.append(r3)
            java.lang.String r3 = r4.toString()
            r5.append(r3)
            java.lang.String r3 = ", tagValue: '"
            r5.append(r3)
            java.nio.ByteOrder r3 = r7.mExifByteOrder
            java.lang.String r3 = r4.getStringValue(r3)
            r5.append(r3)
            java.lang.String r3 = "'"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.d(r2, r3)
            goto L38
        L85:
            int r0 = r0 + 1
            goto L1
        L89:
            return
    }

    private java.nio.ByteOrder readByteOrder(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4) throws java.io.IOException {
            r3 = this;
            short r4 = r4.readShort()
            r0 = 18761(0x4949, float:2.629E-41)
            java.lang.String r1 = "ExifInterface"
            if (r4 == r0) goto L35
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r4 != r0) goto L1a
            boolean r4 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r4 == 0) goto L17
            java.lang.String r4 = "readExifSegment: Byte Align MM"
            android.util.Log.d(r1, r4)
        L17:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            return r4
        L1a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid byte order: "
            r1.append(r2)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L35:
            boolean r4 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r4 == 0) goto L3e
            java.lang.String r4 = "readExifSegment: Byte Align II"
            android.util.Log.d(r1, r4)
        L3e:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            return r4
    }

    private void readExifSegment(byte[] r2, int r3) throws java.io.IOException {
            r1 = this;
            androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream r0 = new androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream
            r0.<init>(r2)
            r1.parseTiffHeaders(r0)
            r1.readImageFileDirectory(r0, r3)
            return
    }

    private void readImageFileDirectory(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r26, int r27) throws java.io.IOException {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            java.util.Set<java.lang.Integer> r3 = r0.mAttributesOffsets
            int r4 = r1.position()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            short r3 = r1.readShort()
            boolean r4 = androidx.exifinterface.media.ExifInterface.DEBUG
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L31:
            if (r3 > 0) goto L35
            goto L3bc
        L35:
            r6 = 0
        L36:
            if (r6 >= r3) goto L342
            int r10 = r1.readUnsignedShort()
            int r11 = r1.readUnsignedShort()
            int r14 = r1.readInt()
            int r12 = r1.position()
            long r12 = (long) r12
            r15 = 4
            long r12 = r12 + r15
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r17 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForReading
            r4 = r17[r2]
            r18 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r7)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = (androidx.exifinterface.media.ExifInterface.ExifTag) r4
            boolean r7 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r7 == 0) goto L8d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r20 = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r16 = 4
            if (r4 == 0) goto L73
            java.lang.String r9 = r4.name
        L70:
            r22 = r3
            goto L75
        L73:
            r9 = 0
            goto L70
        L75:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r23 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r3 = new java.lang.Object[]{r8, r15, r9, r3, r6}
            java.lang.String r6 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            android.util.Log.d(r5, r3)
            goto L95
        L8d:
            r22 = r3
            r23 = r6
            r20 = r15
            r16 = 4
        L95:
            r3 = 7
            if (r4 != 0) goto Lb2
            if (r7 == 0) goto Lae
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Skip the tag entry since tag number is not defined: "
            r6.append(r8)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        Lae:
            r24 = r4
            goto L12e
        Lb2:
            if (r11 <= 0) goto Lb9
            int[] r6 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT
            int r8 = r6.length
            if (r11 < r8) goto Lbc
        Lb9:
            r24 = r4
            goto L118
        Lbc:
            boolean r8 = r4.isFormatCompatible(r11)
            if (r8 != 0) goto Le7
            if (r7 == 0) goto Lae
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Skip the tag entry since data format ("
            r6.append(r8)
            java.lang.String[] r8 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES
            r8 = r8[r11]
            r6.append(r8)
            java.lang.String r8 = ") is unexpected for tag: "
            r6.append(r8)
            java.lang.String r8 = r4.name
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
            goto Lae
        Le7:
            if (r11 != r3) goto Leb
            int r11 = r4.primaryFormat
        Leb:
            long r8 = (long) r14
            r6 = r6[r11]
            r24 = r4
            long r3 = (long) r6
            long r8 = r8 * r3
            int r3 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r3 < 0) goto L100
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto Lfe
            goto L100
        Lfe:
            r3 = 1
            goto L131
        L100:
            if (r7 == 0) goto L116
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since the number of components is invalid: "
            r3.append(r4)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L116:
            r3 = 0
            goto L131
        L118:
            if (r7 == 0) goto L12e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L12e:
            r8 = r18
            goto L116
        L131:
            if (r3 != 0) goto L138
            r1.seek(r12)
            goto L339
        L138:
            int r3 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            java.lang.String r4 = "Compression"
            if (r3 <= 0) goto L1c7
            int r3 = r1.readInt()
            if (r7 == 0) goto L158
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r15 = "seek to data offset: "
            r6.append(r15)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L158:
            int r6 = r0.mMimeType
            r15 = 7
            if (r6 != r15) goto L1ba
            r6 = r24
            java.lang.String r15 = r6.name
            r17 = r7
            java.lang.String r7 = "MakerNote"
            boolean r7 = r7.equals(r15)
            if (r7 == 0) goto L172
            r0.mOrfMakerNoteOffset = r3
        L16d:
            r21 = r10
            r20 = r14
            goto L1c2
        L172:
            r7 = 6
            if (r2 != r7) goto L16d
            java.lang.String r15 = "ThumbnailImage"
            java.lang.String r7 = r6.name
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L16d
            r0.mOrfThumbnailOffset = r3
            r0.mOrfThumbnailLength = r14
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            r15 = 6
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r15, r7)
            int r15 = r0.mOrfThumbnailOffset
            r20 = r14
            long r14 = (long) r15
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r14, r2)
            int r14 = r0.mOrfThumbnailLength
            long r14 = (long) r14
            r21 = r10
            java.nio.ByteOrder r10 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r14, r10)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r14 = r0.mAttributes
            r14 = r14[r16]
            r14.put(r4, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r0.mAttributes
            r7 = r7[r16]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r7.put(r14, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r16]
            java.lang.String r7 = "JPEGInterchangeFormatLength"
            r2.put(r7, r10)
            goto L1c2
        L1ba:
            r17 = r7
            r21 = r10
            r20 = r14
            r6 = r24
        L1c2:
            long r2 = (long) r3
            r1.seek(r2)
            goto L1cf
        L1c7:
            r17 = r7
            r21 = r10
            r20 = r14
            r6 = r24
        L1cf:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = androidx.exifinterface.media.ExifInterface.sExifPointerTagMap
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r17 == 0) goto L1f9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "nextIfdType: "
            r3.append(r7)
            r3.append(r2)
            java.lang.String r7 = " byteCount: "
            r3.append(r7)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L1f9:
            r3 = 8
            r7 = 3
            if (r2 == 0) goto L2c7
            if (r11 == r7) goto L221
            r4 = r16
            if (r11 == r4) goto L21c
            if (r11 == r3) goto L217
            r3 = 9
            if (r11 == r3) goto L211
            r3 = 13
            if (r11 == r3) goto L211
            r3 = -1
            goto L226
        L211:
            int r3 = r1.readInt()
        L215:
            long r3 = (long) r3
            goto L226
        L217:
            short r3 = r1.readShort()
            goto L215
        L21c:
            long r3 = r1.readUnsignedInt()
            goto L226
        L221:
            int r3 = r1.readUnsignedShort()
            goto L215
        L226:
            if (r17 == 0) goto L23b
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r6 = r6.name
            java.lang.Object[] r6 = new java.lang.Object[]{r7, r6}
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r5, r6)
        L23b:
            int r6 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            java.lang.String r7 = ")"
            r8 = -1
            if (r6 <= 0) goto L28b
            int r6 = r1.length()
            if (r6 == r8) goto L251
            int r6 = r1.length()
            long r9 = (long) r6
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 >= 0) goto L28b
        L251:
            java.util.Set<java.lang.Integer> r6 = r0.mAttributesOffsets
            int r8 = (int) r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L269
            r1.seek(r3)
            int r2 = r2.intValue()
            r0.readImageFileDirectory(r1, r2)
            goto L2c2
        L269:
            if (r17 == 0) goto L2c2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r8)
            r6.append(r2)
            java.lang.String r2 = " (at "
            r6.append(r2)
            r6.append(r3)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            android.util.Log.d(r5, r2)
            goto L2c2
        L28b:
            if (r17 == 0) goto L2c2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r3 = r1.length()
            if (r3 == r8) goto L2bf
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " (total length: "
            r3.append(r2)
            int r2 = r1.length()
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
        L2bf:
            android.util.Log.d(r5, r2)
        L2c2:
            r1.seek(r12)
            goto L339
        L2c7:
            int r2 = r1.position()
            int r10 = r0.mOffsetToExifData
            int r2 = r2 + r10
            int r8 = (int) r8
            byte[] r8 = new byte[r8]
            r1.readFully(r8)
            r9 = r12
            androidx.exifinterface.media.ExifInterface$ExifAttribute r12 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
            long r13 = (long) r2
            r17 = r8
            r15 = r13
            r14 = r20
            r13 = r11
            r12.<init>(r13, r14, r15, r17)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r27]
            java.lang.String r8 = r6.name
            r2.put(r8, r12)
            java.lang.String r2 = "DNGVersion"
            java.lang.String r8 = r6.name
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L2f6
            r0.mMimeType = r7
        L2f6:
            java.lang.String r2 = "Make"
            java.lang.String r7 = r6.name
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L30a
            java.lang.String r2 = "Model"
            java.lang.String r7 = r6.name
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L318
        L30a:
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            java.lang.String r2 = r12.getStringValue(r2)
            java.lang.String r7 = "PENTAX"
            boolean r2 = r2.contains(r7)
            if (r2 != 0) goto L32b
        L318:
            java.lang.String r2 = r6.name
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L32d
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            int r2 = r12.getIntValue(r2)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r4) goto L32d
        L32b:
            r0.mMimeType = r3
        L32d:
            int r2 = r1.position()
            long r2 = (long) r2
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L339
            r1.seek(r9)
        L339:
            int r6 = r23 + 1
            short r6 = (short) r6
            r2 = r27
            r3 = r22
            goto L36
        L342:
            r18 = 0
            int r2 = r1.readInt()
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r3 == 0) goto L35d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r6 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            android.util.Log.d(r5, r4)
        L35d:
            long r6 = (long) r2
            int r4 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r4 <= 0) goto L3a6
            java.util.Set<java.lang.Integer> r4 = r0.mAttributesOffsets
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.contains(r8)
            if (r4 != 0) goto L38f
            r1.seek(r6)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r4 = 4
            r2 = r2[r4]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L380
            r0.readImageFileDirectory(r1, r4)
            return
        L380:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3bc
            r0.readImageFileDirectory(r1, r3)
            return
        L38f:
            if (r3 == 0) goto L3bc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
            return
        L3a6:
            if (r3 == 0) goto L3bc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
        L3bc:
            return
    }

    private void removeAttribute(java.lang.String r3) {
            r2 = this;
            r0 = 0
        L1:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r1 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r1 = r1.length
            if (r0 >= r1) goto L10
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r2.mAttributes
            r1 = r1[r0]
            r1.remove(r3)
            int r0 = r0 + 1
            goto L1
        L10:
            return
    }

    private void replaceInvalidTags(int r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r2.mAttributes
            r0 = r0[r3]
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L28
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r2.mAttributes
            r0 = r0[r3]
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L28
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r2.mAttributes
            r0 = r0[r3]
            java.lang.Object r1 = r0.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            r0.put(r5, r1)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r2.mAttributes
            r3 = r5[r3]
            r3.remove(r4)
        L28:
            return
    }

    private void retrieveJpegImageSize(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r5, int r6) throws java.io.IOException {
            r4 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r0 = r0[r6]
            java.lang.String r1 = "ImageLength"
            java.lang.Object r0 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r4.mAttributes
            r1 = r1[r6]
            java.lang.String r2 = "ImageWidth"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r0 == 0) goto L1c
            if (r1 != 0) goto L55
        L1c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r0 = r0[r6]
            java.lang.String r1 = "JPEGInterchangeFormat"
            java.lang.Object r0 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r4.mAttributes
            r1 = r1[r6]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r0 == 0) goto L55
            if (r1 == 0) goto L55
            java.nio.ByteOrder r1 = r4.mExifByteOrder
            int r1 = r0.getIntValue(r1)
            java.nio.ByteOrder r2 = r4.mExifByteOrder
            int r0 = r0.getIntValue(r2)
            long r2 = (long) r1
            r5.seek(r2)
            byte[] r0 = new byte[r0]
            r5.readFully(r0)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r5 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r5.<init>(r0)
            r4.getJpegAttributes(r5, r1, r6)
        L55:
            return
    }

    private void saveJpegAttributes(java.io.InputStream r13, java.io.OutputStream r14) throws java.io.IOException {
            r12 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "saveJpegAttributes starting with (inputStream: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L27:
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r0 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r0.<init>(r13)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r13 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r13.<init>(r14, r1)
            byte r14 = r0.readByte()
            java.lang.String r1 = "Invalid marker"
            r2 = -1
            if (r14 != r2) goto L133
            r13.writeByte(r2)
            byte r14 = r0.readByte()
            r3 = -40
            if (r14 != r3) goto L12d
            r13.writeByte(r3)
            r13.writeByte(r2)
            r14 = -31
            r13.writeByte(r14)
            int r3 = r12.writeExifSegment(r13)
            r12.mOffsetToExifData = r3
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = r12.mXmpFromSeparateMarker
            if (r3 == 0) goto L7d
            r13.write(r2)
            r13.writeByte(r14)
            byte[] r3 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_XMP_APP1
            int r4 = r3.length
            int r4 = r4 + 2
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = r12.mXmpFromSeparateMarker
            byte[] r5 = r5.bytes
            int r5 = r5.length
            int r4 = r4 + r5
            r13.writeUnsignedShort(r4)
            r13.write(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = r12.mXmpFromSeparateMarker
            byte[] r3 = r3.bytes
            r13.write(r3)
            r3 = 1
            r12.mFileOnDiskContainsSeparateXmpMarker = r3
        L7d:
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r3]
        L81:
            byte r5 = r0.readByte()
            if (r5 != r2) goto L127
        L87:
            byte r5 = r0.readByte()
            if (r5 == r2) goto L87
            r6 = -39
            if (r5 == r6) goto L11d
            r6 = -38
            if (r5 == r6) goto L11d
            java.lang.String r6 = "Invalid length"
            r7 = 0
            if (r5 == r14) goto Lc2
            r13.writeByte(r2)
            r13.writeByte(r5)
            int r5 = r0.readUnsignedShort()
            r13.writeUnsignedShort(r5)
            int r5 = r5 + (-2)
            if (r5 < 0) goto Lbc
        Lab:
            if (r5 <= 0) goto L81
            int r6 = java.lang.Math.min(r5, r3)
            int r6 = r0.read(r4, r7, r6)
            if (r6 < 0) goto L81
            r13.write(r4, r7, r6)
            int r5 = r5 - r6
            goto Lab
        Lbc:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r6)
            throw r13
        Lc2:
            int r8 = r0.readUnsignedShort()
            int r9 = r8 + (-2)
            if (r9 < 0) goto L117
            byte[] r6 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_XMP_APP1
            int r10 = r6.length
            if (r9 < r10) goto Ld3
            int r10 = r6.length
            byte[] r10 = new byte[r10]
            goto Ldd
        Ld3:
            byte[] r10 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            int r11 = r10.length
            if (r9 < r11) goto Ldc
            int r10 = r10.length
            byte[] r10 = new byte[r10]
            goto Ldd
        Ldc:
            r10 = 0
        Ldd:
            if (r10 == 0) goto Lf6
            r0.readFully(r10)
            byte[] r11 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            boolean r11 = androidx.exifinterface.media.ExifInterfaceUtils.startsWith(r10, r11)
            if (r11 != 0) goto Lf0
            boolean r6 = androidx.exifinterface.media.ExifInterfaceUtils.startsWith(r10, r6)
            if (r6 == 0) goto Lf6
        Lf0:
            int r5 = r10.length
            int r9 = r9 - r5
            r0.skipFully(r9)
            goto L81
        Lf6:
            r13.writeByte(r2)
            r13.writeByte(r5)
            r13.writeUnsignedShort(r8)
            if (r10 == 0) goto L106
            int r5 = r10.length
            int r9 = r9 - r5
            r13.write(r10)
        L106:
            if (r9 <= 0) goto L81
            int r5 = java.lang.Math.min(r9, r3)
            int r5 = r0.read(r4, r7, r5)
            if (r5 < 0) goto L81
            r13.write(r4, r7, r5)
            int r9 = r9 - r5
            goto L106
        L117:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r6)
            throw r13
        L11d:
            r13.writeByte(r2)
            r13.writeByte(r5)
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r0, r13)
            return
        L127:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r1)
            throw r13
        L12d:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r1)
            throw r13
        L133:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r1)
            throw r13
    }

    private void savePngAttributes(java.io.InputStream r9, java.io.OutputStream r10) throws java.io.IOException {
            r8 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L27:
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r0 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r0.<init>(r9)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r9 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE
            int r10 = r10.length
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r0, r9, r10)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = r8.mXmpFromSeparateMarker
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L43
            boolean r10 = r8.mFileOnDiskContainsSeparateXmpMarker
            if (r10 == 0) goto L78
        L43:
            r10 = r1
        L44:
            if (r1 != 0) goto L4d
            if (r10 == 0) goto L49
            goto L4d
        L49:
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r0, r9)
            return
        L4d:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L7a
            r9.writeInt(r3)
            r9.writeInt(r4)
            int r3 = r3 + 4
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r0, r9, r3)
            int r3 = r8.mOffsetToExifData
            if (r3 != 0) goto L6d
            r8.writePngExifChunk(r9)
            r1 = r2
        L6d:
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = r8.mXmpFromSeparateMarker
            if (r3 == 0) goto L44
            boolean r3 = r8.mFileOnDiskContainsSeparateXmpMarker
            if (r3 != 0) goto L44
            r8.writePngXmpItxtChunk(r9)
        L78:
            r10 = r2
            goto L44
        L7a:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L8b
            if (r1 == 0) goto L8b
            r8.writePngExifChunk(r9)
            int r3 = r3 + 4
            r0.skipFully(r3)
            r1 = r2
            goto L44
        L8b:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto Lbd
            byte[] r5 = androidx.exifinterface.media.ExifInterface.PNG_ITXT_XMP_KEYWORD
            int r6 = r5.length
            if (r3 < r6) goto Lbd
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto Lb0
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = r8.mXmpFromSeparateMarker
            if (r10 == 0) goto Lac
            r8.writePngXmpItxtChunk(r9)
        Lac:
            r0.skipFully(r6)
            goto L78
        Lb0:
            r9.writeInt(r3)
            r9.writeInt(r4)
            r9.write(r7)
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r0, r9, r6)
            goto L44
        Lbd:
            r9.writeInt(r3)
            r9.writeInt(r4)
            int r3 = r3 + 4
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r0, r9, r3)
            goto L44
    }

    private void saveWebpAttributes(java.io.InputStream r22, java.io.OutputStream r23) throws java.io.IOException {
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            boolean r3 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r3 == 0) goto L2d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "saveWebpAttributes starting with (inputStream: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", outputStream: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ExifInterface"
            android.util.Log.d(r4, r3)
        L2d:
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r3 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            r3.<init>(r0, r4)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r0 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream
            r0.<init>(r2, r4)
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_1
            int r5 = r2.length
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r3, r0, r5)
            int r5 = r3.readInt()
            byte[] r6 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2
            int r7 = r6.length
            r3.skipFully(r7)
            r7 = 0
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L226 java.lang.Exception -> L228
            r8.<init>()     // Catch: java.lang.Throwable -> L226 java.lang.Exception -> L228
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r9 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r9.<init>(r8, r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r4 = r1.mOffsetToExifData     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r11 = 4
            r12 = 8
            if (r4 == 0) goto L86
            int r2 = r2.length     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r2 = r2 + r11
            int r6 = r6.length     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r2 = r2 + r6
            int r4 = r4 - r2
            int r4 = r4 - r12
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r3, r9, r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r3.skipFully(r11)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r2 = r3.readInt()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r4 = r2 % 2
            if (r4 == 0) goto L71
            int r2 = r2 + 1
        L71:
            r3.skipFully(r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r2 = r1.writeExifSegment(r9)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
        L78:
            r23 = r12
        L7a:
            r16 = -1
            goto L1f7
        L7e:
            r0 = move-exception
            r7 = r8
            goto L231
        L82:
            r0 = move-exception
            r7 = r8
            goto L229
        L86:
            byte[] r2 = new byte[r11]     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r3.readFully(r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            byte[] r4 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8X     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            boolean r6 = java.util.Arrays.equals(r2, r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r13 = 0
            r14 = 1
            if (r6 == 0) goto Le6
            int r2 = r3.readInt()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r6 = r2 % 2
            if (r6 != r14) goto La0
            int r6 = r2 + 1
            goto La1
        La0:
            r6 = r2
        La1:
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r3.readFully(r6)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r15 = r6[r13]     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r15 = r15 | r12
            byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r6[r13] = r15     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r15 = r15 >> r14
            r15 = r15 & r14
            if (r15 != r14) goto Lb1
            r13 = r14
        Lb1:
            r9.write(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r9.writeInt(r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r9.write(r6)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            if (r13 == 0) goto Lda
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANIM     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r1.copyChunksUpToGivenChunkType(r3, r9, r2, r7)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
        Lc1:
            byte[] r2 = new byte[r11]     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r3.readFully(r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82 java.io.EOFException -> Lce
            byte[] r4 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_ANMF     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82 java.io.EOFException -> Lce
            boolean r4 = java.util.Arrays.equals(r2, r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82 java.io.EOFException -> Lce
            r4 = r4 ^ r14
            goto Lcf
        Lce:
            r4 = r14
        Lcf:
            if (r4 == 0) goto Ld6
            int r2 = r1.writeExifSegment(r9)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            goto L78
        Ld6:
            r1.copyWebPChunk(r3, r9, r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            goto Lc1
        Lda:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            byte[] r4 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r1.copyChunksUpToGivenChunkType(r3, r9, r2, r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r2 = r1.writeExifSegment(r9)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            goto L78
        Le6:
            byte[] r6 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            boolean r7 = java.util.Arrays.equals(r2, r6)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            if (r7 != 0) goto Lfc
            byte[] r7 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            boolean r7 = java.util.Arrays.equals(r2, r7)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            if (r7 == 0) goto Lf7
            goto Lfc
        Lf7:
            r23 = r12
            r2 = -1
            goto L7a
        Lfc:
            int r7 = r3.readInt()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r15 = r7 % 2
            if (r15 != r14) goto L109
            int r15 = r7 + 1
        L106:
            r22 = r11
            goto L10b
        L109:
            r15 = r7
            goto L106
        L10b:
            r11 = 3
            r23 = r12
            byte[] r12 = new byte[r11]     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            boolean r16 = java.util.Arrays.equals(r2, r6)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r17 = r13
            r13 = 47
            if (r16 == 0) goto L146
            r3.readFully(r12)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r3.readFully(r11)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            byte[] r14 = androidx.exifinterface.media.ExifInterface.WEBP_VP8_SIGNATURE     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            boolean r11 = java.util.Arrays.equals(r14, r11)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            if (r11 == 0) goto L13e
            int r11 = r3.readInt()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r14 = r11 & 16383(0x3fff, float:2.2957E-41)
            r16 = -1
            int r10 = r11 >> 16
            r10 = r10 & 16383(0x3fff, float:2.2957E-41)
            int r15 = r15 + (-10)
            r20 = r15
            r15 = r14
            r14 = r17
            goto L186
        L13e:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            java.lang.String r2 = "Error checking VP8 signature"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            throw r0     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
        L146:
            r16 = -1
            byte[] r10 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            boolean r10 = java.util.Arrays.equals(r2, r10)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            if (r10 == 0) goto L17f
            byte r10 = r3.readByte()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            if (r10 != r13) goto L177
            int r11 = r3.readInt()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r10 = r11 & 16383(0x3fff, float:2.2957E-41)
            int r10 = r10 + r14
            r18 = 268419072(0xfffc000, float:2.5218897E-29)
            r18 = r11 & r18
            int r18 = r18 >>> 14
            int r18 = r18 + 1
            r19 = 268435456(0x10000000, float:2.524355E-29)
            r19 = r11 & r19
            if (r19 == 0) goto L16d
            goto L16f
        L16d:
            r14 = r17
        L16f:
            int r15 = r15 + (-5)
            r20 = r15
            r15 = r10
            r10 = r18
            goto L186
        L177:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            java.lang.String r2 = "Error checking VP8L signature"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            throw r0     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
        L17f:
            r20 = r15
            r10 = r17
            r11 = r10
            r14 = r11
            r15 = r14
        L186:
            r9.write(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r4 = 10
            r9.writeInt(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            if (r14 == 0) goto L199
            r14 = r4[r17]     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r14 = r14 | 16
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r4[r17] = r14     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
        L199:
            r14 = r4[r17]     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r14 = r14 | 8
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r4[r17] = r14     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r15 = r15 + (-1)
            int r10 = r10 + (-1)
            byte r14 = (byte) r15     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r4[r22] = r14     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r14 = r15 >> 8
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r17 = 5
            r4[r17] = r14     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r14 = r15 >> 16
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r15 = 6
            r4[r15] = r14     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r14 = 7
            byte r15 = (byte) r10     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r4[r14] = r15     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r14 = r10 >> 8
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r4[r23] = r14     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r10 = r10 >> 16
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r14 = 9
            r4[r14] = r10     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r9.write(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r9.write(r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r9.writeInt(r7)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            boolean r4 = java.util.Arrays.equals(r2, r6)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            if (r4 == 0) goto L1e1
            r9.write(r12)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_VP8_SIGNATURE     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r9.write(r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r9.writeInt(r11)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
        L1de:
            r15 = r20
            goto L1f0
        L1e1:
            byte[] r4 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_VP8L     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            boolean r2 = java.util.Arrays.equals(r2, r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            if (r2 == 0) goto L1de
            r9.write(r13)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r9.writeInt(r11)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            goto L1de
        L1f0:
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r3, r9, r15)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r2 = r1.writeExifSegment(r9)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
        L1f7:
            int r5 = r5 + 8
            int r4 = r3.position()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r5 = r5 - r4
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r3, r9, r5)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r4 = r8.size()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            byte[] r5 = androidx.exifinterface.media.ExifInterface.WEBP_SIGNATURE_2     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r6 = r5.length     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r4 = r4 + r6
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r0.write(r5)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r4 = r16
            if (r2 == r4) goto L21c
            java.io.DataOutputStream r4 = r0.mOutputStream     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r4 = r4 + r2
            r1.mOffsetToExifData = r4     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
        L21c:
            r8.writeTo(r0)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r3, r0)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r8)
            return
        L226:
            r0 = move-exception
            goto L231
        L228:
            r0 = move-exception
        L229:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L226
            java.lang.String r3 = "Failed to save WebP file"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L226
            throw r2     // Catch: java.lang.Throwable -> L226
        L231:
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r7)
            throw r0
    }

    private void setThumbnailData(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r5) throws java.io.IOException {
            r4 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r4.mAttributes
            r1 = 4
            r0 = r0[r1]
            java.lang.String r1 = "Compression"
            java.lang.Object r1 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            r2 = 6
            if (r1 == 0) goto L2f
            java.nio.ByteOrder r3 = r4.mExifByteOrder
            int r1 = r1.getIntValue(r3)
            r4.mThumbnailCompression = r1
            r3 = 1
            if (r1 == r3) goto L25
            if (r1 == r2) goto L21
            r2 = 7
            if (r1 == r2) goto L25
            goto L2e
        L21:
            r4.handleThumbnailFromJfif(r5, r0)
            return
        L25:
            boolean r1 = r4.isSupportedDataType(r0)
            if (r1 == 0) goto L2e
            r4.handleThumbnailFromStrips(r5, r0)
        L2e:
            return
        L2f:
            r4.mThumbnailCompression = r2
            r4.handleThumbnailFromJfif(r5, r0)
            return
    }

    private static boolean shouldSupportSeek(int r1) {
            r0 = 4
            if (r1 == r0) goto L12
            r0 = 9
            if (r1 == r0) goto L12
            r0 = 13
            if (r1 == r0) goto L12
            r0 = 14
            if (r1 != r0) goto L10
            goto L12
        L10:
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    private void swapBasedOnImageSize(int r7, int r8) throws java.io.IOException {
            r6 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.mAttributes
            r0 = r0[r7]
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "ExifInterface"
            if (r0 != 0) goto L89
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.mAttributes
            r0 = r0[r8]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            goto L89
        L18:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.mAttributes
            r0 = r0[r7]
            java.lang.String r2 = "ImageLength"
            java.lang.Object r0 = r0.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r6.mAttributes
            r3 = r3[r7]
            java.lang.String r4 = "ImageWidth"
            java.lang.Object r3 = r3.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r6.mAttributes
            r5 = r5[r8]
            java.lang.Object r2 = r5.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r6.mAttributes
            r5 = r5[r8]
            java.lang.Object r4 = r5.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            if (r0 == 0) goto L7f
            if (r3 != 0) goto L49
            goto L7f
        L49:
            if (r2 == 0) goto L75
            if (r4 != 0) goto L4e
            goto L75
        L4e:
            java.nio.ByteOrder r1 = r6.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r6.mExifByteOrder
            int r1 = r3.getIntValue(r1)
            java.nio.ByteOrder r3 = r6.mExifByteOrder
            int r2 = r2.getIntValue(r3)
            java.nio.ByteOrder r3 = r6.mExifByteOrder
            int r3 = r4.getIntValue(r3)
            if (r0 >= r2) goto L92
            if (r1 >= r3) goto L92
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.mAttributes
            r1 = r0[r7]
            r2 = r0[r8]
            r0[r7] = r2
            r0[r8] = r1
            return
        L75:
            boolean r7 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r7 == 0) goto L92
            java.lang.String r7 = "Second image does not contain valid size information"
            android.util.Log.d(r1, r7)
            return
        L7f:
            boolean r7 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r7 == 0) goto L92
            java.lang.String r7 = "First image does not contain valid size information"
            android.util.Log.d(r1, r7)
            return
        L89:
            boolean r7 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r7 == 0) goto L92
            java.lang.String r7 = "Cannot perform swap since only one image data exists"
            android.util.Log.d(r1, r7)
        L92:
            return
    }

    private static void updateCrcWithInt(java.util.zip.CRC32 r1, int r2) {
            int r0 = r2 >>> 24
            r1.update(r0)
            int r0 = r2 >>> 16
            r1.update(r0)
            int r0 = r2 >>> 8
            r1.update(r0)
            r1.update(r2)
            return
    }

    private void updateImageSizeValues(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r10, int r11) throws java.io.IOException {
            r9 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r9.mAttributes
            r0 = r0[r11]
            java.lang.String r1 = "DefaultCropSize"
            java.lang.Object r0 = r0.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r9.mAttributes
            r1 = r1[r11]
            java.lang.String r2 = "SensorTopBorder"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r9.mAttributes
            r2 = r2[r11]
            java.lang.String r3 = "SensorLeftBorder"
            java.lang.Object r2 = r2.get(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r3 = r3[r11]
            java.lang.String r4 = "SensorBottomBorder"
            java.lang.Object r3 = r3.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r9.mAttributes
            r4 = r4[r11]
            java.lang.String r5 = "SensorRightBorder"
            java.lang.Object r4 = r4.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            java.lang.String r5 = "ImageLength"
            java.lang.String r6 = "ImageWidth"
            if (r0 == 0) goto Lc8
            int r10 = r0.format
            r1 = 5
            java.lang.String r2 = "Invalid crop size values. cropSize="
            java.lang.String r3 = "ExifInterface"
            r4 = 1
            r7 = 0
            r8 = 2
            if (r10 != r1) goto L84
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            java.lang.Object r10 = r0.getValue(r10)
            androidx.exifinterface.media.ExifInterface$Rational[] r10 = (androidx.exifinterface.media.ExifInterface.Rational[]) r10
            if (r10 == 0) goto L6d
            int r0 = r10.length
            if (r0 == r8) goto L5c
            goto L6d
        L5c:
            r0 = r10[r7]
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(r0, r1)
            r10 = r10[r4]
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(r10, r1)
            goto La2
        L6d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r10 = java.util.Arrays.toString(r10)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            android.util.Log.w(r3, r10)
            return
        L84:
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            java.lang.Object r10 = r0.getValue(r10)
            int[] r10 = (int[]) r10
            if (r10 == 0) goto Lb1
            int r0 = r10.length
            if (r0 == r8) goto L92
            goto Lb1
        L92:
            r0 = r10[r7]
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r0, r1)
            r10 = r10[r4]
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r10, r1)
        La2:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r9.mAttributes
            r1 = r1[r11]
            r1.put(r6, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r9.mAttributes
            r11 = r0[r11]
            r11.put(r5, r10)
            return
        Lb1:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r10 = java.util.Arrays.toString(r10)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            android.util.Log.w(r3, r10)
            return
        Lc8:
            if (r1 == 0) goto L109
            if (r2 == 0) goto L109
            if (r3 == 0) goto L109
            if (r4 == 0) goto L109
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            int r10 = r1.getIntValue(r10)
            java.nio.ByteOrder r0 = r9.mExifByteOrder
            int r0 = r3.getIntValue(r0)
            java.nio.ByteOrder r1 = r9.mExifByteOrder
            int r1 = r4.getIntValue(r1)
            java.nio.ByteOrder r3 = r9.mExifByteOrder
            int r2 = r2.getIntValue(r3)
            if (r0 <= r10) goto L108
            if (r1 <= r2) goto L108
            int r0 = r0 - r10
            int r1 = r1 - r2
            java.nio.ByteOrder r10 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r0, r10)
            java.nio.ByteOrder r0 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r1, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r9.mAttributes
            r1 = r1[r11]
            r1.put(r5, r10)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r9.mAttributes
            r10 = r10[r11]
            r10.put(r6, r0)
        L108:
            return
        L109:
            r9.retrieveJpegImageSize(r10, r11)
            return
    }

    private void validateImages() throws java.io.IOException {
            r9 = this;
            r0 = 0
            r1 = 5
            r9.swapBasedOnImageSize(r0, r1)
            r2 = 4
            r9.swapBasedOnImageSize(r0, r2)
            r9.swapBasedOnImageSize(r1, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r4 = 1
            r3 = r3[r4]
            java.lang.String r5 = "PixelXDimension"
            java.lang.Object r3 = r3.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r9.mAttributes
            r4 = r5[r4]
            java.lang.String r5 = "PixelYDimension"
            java.lang.Object r4 = r4.get(r5)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r4
            java.lang.String r5 = "ImageLength"
            java.lang.String r6 = "ImageWidth"
            if (r3 == 0) goto L3b
            if (r4 == 0) goto L3b
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r9.mAttributes
            r7 = r7[r0]
            r7.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r3 = r3[r0]
            r3.put(r5, r4)
        L3b:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r3 = r3[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L5c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r3 = r3[r1]
            boolean r3 = r9.isThumbnail(r3)
            if (r3 == 0) goto L5c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r4 = r3[r1]
            r3[r2] = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3[r1] = r4
        L5c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r9.mAttributes
            r3 = r3[r2]
            boolean r3 = r9.isThumbnail(r3)
            if (r3 != 0) goto L6d
            java.lang.String r3 = "ExifInterface"
            java.lang.String r4 = "No image meets the size requirements of a thumbnail image."
            android.util.Log.d(r3, r4)
        L6d:
            java.lang.String r3 = "ThumbnailOrientation"
            java.lang.String r4 = "Orientation"
            r9.replaceInvalidTags(r0, r3, r4)
            java.lang.String r7 = "ThumbnailImageLength"
            r9.replaceInvalidTags(r0, r7, r5)
            java.lang.String r8 = "ThumbnailImageWidth"
            r9.replaceInvalidTags(r0, r8, r6)
            r9.replaceInvalidTags(r1, r3, r4)
            r9.replaceInvalidTags(r1, r7, r5)
            r9.replaceInvalidTags(r1, r8, r6)
            r9.replaceInvalidTags(r2, r4, r3)
            r9.replaceInvalidTags(r2, r5, r7)
            r9.replaceInvalidTags(r2, r6, r8)
            return
    }

    private int writeExifSegment(androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream r19) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r2 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r3 = r2.length
            int[] r3 = new int[r3]
            int r2 = r2.length
            int[] r2 = new int[r2]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r4 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            int r5 = r4.length
            r6 = 0
            r7 = r6
        L11:
            if (r7 >= r5) goto L1d
            r8 = r4[r7]
            java.lang.String r8 = r8.name
            r0.removeAttribute(r8)
            int r7 = r7 + 1
            goto L11
        L1d:
            boolean r4 = r0.mHasThumbnail
            java.lang.String r5 = "JPEGInterchangeFormatLength"
            java.lang.String r7 = "StripByteCounts"
            java.lang.String r8 = "JPEGInterchangeFormat"
            java.lang.String r9 = "StripOffsets"
            if (r4 == 0) goto L3a
            boolean r4 = r0.mHasThumbnailStrips
            if (r4 == 0) goto L34
            r0.removeAttribute(r9)
            r0.removeAttribute(r7)
            goto L3a
        L34:
            r0.removeAttribute(r8)
            r0.removeAttribute(r5)
        L3a:
            r4 = r6
        L3b:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r10 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r10 = r10.length
            if (r4 >= r10) goto L65
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r0.mAttributes
            r10 = r10[r4]
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L4c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L62
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            if (r11 != 0) goto L4c
            r10.remove()
            goto L4c
        L62:
            int r4 = r4 + 1
            goto L3b
        L65:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r10 = 1
            r4 = r4[r10]
            boolean r4 = r4.isEmpty()
            r11 = 0
            if (r4 != 0) goto L85
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r6]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r13 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r13 = r13[r10]
            java.lang.String r13 = r13.name
            java.nio.ByteOrder r14 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r14 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r11, r14)
            r4.put(r13, r14)
        L85:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r13 = 2
            r4 = r4[r13]
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto La3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r6]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r14 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r14 = r14[r13]
            java.lang.String r14 = r14.name
            java.nio.ByteOrder r15 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r15 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r11, r15)
            r4.put(r14, r15)
        La3:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r14 = 3
            r4 = r4[r14]
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto Lc4
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r10]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r15 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r15 = r15[r14]
            java.lang.String r15 = r15.name
            r16 = r13
            java.nio.ByteOrder r13 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r13 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r11, r13)
            r4.put(r15, r13)
            goto Lc6
        Lc4:
            r16 = r13
        Lc6:
            boolean r4 = r0.mHasThumbnail
            r13 = 4
            if (r4 == 0) goto Leb
            boolean r4 = r0.mHasThumbnailStrips
            if (r4 == 0) goto Lee
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r13]
            java.nio.ByteOrder r5 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r6, r5)
            r4.put(r9, r5)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r13]
            int r5 = r0.mThumbnailLength
            java.nio.ByteOrder r15 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r5, r15)
            r4.put(r7, r5)
        Leb:
            r17 = r14
            goto L10d
        Lee:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r13]
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r11, r7)
            r4.put(r8, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r13]
            int r7 = r0.mThumbnailLength
            r17 = r14
            long r14 = (long) r7
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r14, r7)
            r4.put(r5, r7)
        L10d:
            r4 = r6
        L10e:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r5 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r5 = r5.length
            if (r4 >= r5) goto L142
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r0.mAttributes
            r5 = r5[r4]
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r7 = r6
        L120:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L13a
            java.lang.Object r14 = r5.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r14 = r14.getValue()
            androidx.exifinterface.media.ExifInterface$ExifAttribute r14 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r14
            int r14 = r14.size()
            if (r14 <= r13) goto L120
            int r7 = r7 + r14
            goto L120
        L13a:
            r5 = r2[r4]
            int r5 = r5 + r7
            r2[r4] = r5
            int r4 = r4 + 1
            goto L10e
        L142:
            r4 = 8
            r5 = r6
        L145:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r7 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r7 = r7.length
            if (r5 >= r7) goto L169
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r0.mAttributes
            r7 = r7[r5]
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L166
            r3[r5] = r4
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r0.mAttributes
            r7 = r7[r5]
            int r7 = r7.size()
            int r7 = r7 * 12
            int r7 = r7 + 6
            r14 = r2[r5]
            int r7 = r7 + r14
            int r4 = r4 + r7
        L166:
            int r5 = r5 + 1
            goto L145
        L169:
            boolean r5 = r0.mHasThumbnail
            if (r5 == 0) goto L192
            boolean r5 = r0.mHasThumbnailStrips
            if (r5 == 0) goto L17f
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r0.mAttributes
            r5 = r5[r13]
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r4, r7)
            r5.put(r9, r7)
            goto L18d
        L17f:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r0.mAttributes
            r5 = r5[r13]
            long r14 = (long) r4
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r14, r7)
            r5.put(r8, r7)
        L18d:
            r0.mThumbnailOffset = r4
            int r5 = r0.mThumbnailLength
            int r4 = r4 + r5
        L192:
            int r5 = r0.mMimeType
            if (r5 != r13) goto L198
            int r4 = r4 + 8
        L198:
            boolean r5 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r5 == 0) goto L1d4
            r5 = r6
        L19d:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r7 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r7 = r7.length
            if (r5 >= r7) goto L1d4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r8 = r3[r5]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.mAttributes
            r9 = r9[r5]
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r14 = r2[r5]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8, r9, r14, r15}
            java.lang.String r8 = "index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            java.lang.String r8 = "ExifInterface"
            android.util.Log.d(r8, r7)
            int r5 = r5 + 1
            goto L19d
        L1d4:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r10]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1f4
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r6]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r5 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r5 = r5[r10]
            java.lang.String r5 = r5.name
            r7 = r3[r10]
            long r7 = (long) r7
            java.nio.ByteOrder r9 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r7, r9)
            r2.put(r5, r7)
        L1f4:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r16]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L214
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r6]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r5 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r5 = r5[r16]
            java.lang.String r5 = r5.name
            r7 = r3[r16]
            long r7 = (long) r7
            java.nio.ByteOrder r9 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r7, r9)
            r2.put(r5, r7)
        L214:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r17]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L234
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r10]
            androidx.exifinterface.media.ExifInterface$ExifTag[] r5 = androidx.exifinterface.media.ExifInterface.EXIF_POINTER_TAGS
            r5 = r5[r17]
            java.lang.String r5 = r5.name
            r7 = r3[r17]
            long r7 = (long) r7
            java.nio.ByteOrder r9 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r7, r9)
            r2.put(r5, r7)
        L234:
            int r2 = r0.mMimeType
            r5 = 14
            if (r2 == r13) goto L254
            r7 = 13
            if (r2 == r7) goto L24a
            if (r2 == r5) goto L241
            goto L261
        L241:
            byte[] r2 = androidx.exifinterface.media.ExifInterface.WEBP_CHUNK_TYPE_EXIF
            r1.write(r2)
            r1.writeInt(r4)
            goto L261
        L24a:
            r1.writeInt(r4)
            r2 = 1700284774(0x65584966, float:6.383657E22)
            r1.writeInt(r2)
            goto L261
        L254:
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r2) goto L36f
            r1.writeUnsignedShort(r4)
            byte[] r2 = androidx.exifinterface.media.ExifInterface.IDENTIFIER_EXIF_APP1
            r1.write(r2)
        L261:
            java.io.DataOutputStream r2 = r1.mOutputStream
            int r2 = r2.size()
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            java.nio.ByteOrder r8 = java.nio.ByteOrder.BIG_ENDIAN
            if (r7 != r8) goto L270
            r7 = 19789(0x4d4d, float:2.773E-41)
            goto L272
        L270:
            r7 = 18761(0x4949, float:2.629E-41)
        L272:
            r1.writeShort(r7)
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            r1.setByteOrder(r7)
            r7 = 42
            r1.writeUnsignedShort(r7)
            r7 = 8
            r1.writeUnsignedInt(r7)
            r7 = r6
        L285:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r8 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r8 = r8.length
            if (r7 >= r8) goto L352
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r8 = r0.mAttributes
            r8 = r8[r7]
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L34b
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r8 = r0.mAttributes
            r8 = r8[r7]
            int r8 = r8.size()
            r1.writeUnsignedShort(r8)
            r8 = r3[r7]
            int r8 = r8 + 2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.mAttributes
            r9 = r9[r7]
            int r9 = r9.size()
            int r9 = r9 * 12
            int r8 = r8 + r9
            int r8 = r8 + r13
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.mAttributes
            r9 = r9[r7]
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L2bb:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L309
            java.lang.Object r14 = r9.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r15 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            r15 = r15[r7]
            java.lang.Object r10 = r14.getKey()
            java.lang.Object r10 = r15.get(r10)
            androidx.exifinterface.media.ExifInterface$ExifTag r10 = (androidx.exifinterface.media.ExifInterface.ExifTag) r10
            int r10 = r10.number
            java.lang.Object r14 = r14.getValue()
            androidx.exifinterface.media.ExifInterface$ExifAttribute r14 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r14
            int r15 = r14.size()
            r1.writeUnsignedShort(r10)
            int r10 = r14.format
            r1.writeUnsignedShort(r10)
            int r10 = r14.numberOfComponents
            r1.writeInt(r10)
            if (r15 <= r13) goto L2f6
            long r11 = (long) r8
            r1.writeUnsignedInt(r11)
            int r8 = r8 + r15
            goto L305
        L2f6:
            byte[] r10 = r14.bytes
            r1.write(r10)
            if (r15 >= r13) goto L305
        L2fd:
            if (r15 >= r13) goto L305
            r1.writeByte(r6)
            int r15 = r15 + 1
            goto L2fd
        L305:
            r10 = 1
            r11 = 0
            goto L2bb
        L309:
            if (r7 != 0) goto L31e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r8 = r0.mAttributes
            r8 = r8[r13]
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L31e
            r8 = r3[r13]
            long r8 = (long) r8
            r1.writeUnsignedInt(r8)
            r8 = 0
            goto L323
        L31e:
            r8 = 0
            r1.writeUnsignedInt(r8)
        L323:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r0.mAttributes
            r10 = r10[r7]
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L32f:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L34c
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            androidx.exifinterface.media.ExifInterface$ExifAttribute r11 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r11
            byte[] r11 = r11.bytes
            int r12 = r11.length
            if (r12 <= r13) goto L32f
            int r12 = r11.length
            r1.write(r11, r6, r12)
            goto L32f
        L34b:
            r8 = r11
        L34c:
            int r7 = r7 + 1
            r11 = r8
            r10 = 1
            goto L285
        L352:
            boolean r3 = r0.mHasThumbnail
            if (r3 == 0) goto L35d
            byte[] r3 = r0.getThumbnailBytes()
            r1.write(r3)
        L35d:
            int r3 = r0.mMimeType
            if (r3 != r5) goto L369
            int r4 = r4 % 2
            r3 = 1
            if (r4 != r3) goto L369
            r1.writeByte(r6)
        L369:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.setByteOrder(r3)
            return r2
        L36f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Size of exif data ("
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private void writePngExifChunk(androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream r5) throws java.io.IOException {
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataOutputStream
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            r1.<init>(r0, r2)
            int r1 = r4.writeExifSegment(r1)
            java.io.DataOutputStream r2 = r5.mOutputStream
            int r2 = r2.size()
            int r2 = r2 + r1
            r4.mOffsetToExifData = r2
            byte[] r0 = r0.toByteArray()
            r5.write(r0)
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            int r2 = r0.length
            r3 = 4
            int r2 = r2 - r3
            r1.update(r0, r3, r2)
            long r0 = r1.getValue()
            int r0 = (int) r0
            r5.writeInt(r0)
            return
    }

    private void writePngXmpItxtChunk(androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream r3) throws java.io.IOException {
            r2 = this;
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = r2.mXmpFromSeparateMarker
            byte[] r0 = r0.bytes
            int r0 = r0.length
            int r0 = r0 + 22
            r3.writeInt(r0)
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r1 = 1767135348(0x69545874, float:1.6044374E25)
            r3.writeInt(r1)
            updateCrcWithInt(r0, r1)
            byte[] r1 = androidx.exifinterface.media.ExifInterface.PNG_ITXT_XMP_KEYWORD
            r3.write(r1)
            r0.update(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = r2.mXmpFromSeparateMarker
            byte[] r1 = r1.bytes
            r3.write(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = r2.mXmpFromSeparateMarker
            byte[] r1 = r1.bytes
            r0.update(r1)
            long r0 = r0.getValue()
            int r0 = (int) r0
            r3.writeInt(r0)
            r3 = 1
            r2.mFileOnDiskContainsSeparateXmpMarker = r3
            return
    }

    public void flipHorizontally() {
            r3 = this;
            java.lang.String r0 = "Orientation"
            r1 = 1
            int r2 = r3.getAttributeInt(r0, r1)
            switch(r2) {
                case 1: goto L19;
                case 2: goto L1a;
                case 3: goto L17;
                case 4: goto L15;
                case 5: goto L13;
                case 6: goto L11;
                case 7: goto Le;
                case 8: goto Lc;
                default: goto La;
            }
        La:
            r1 = 0
            goto L1a
        Lc:
            r1 = 7
            goto L1a
        Le:
            r1 = 8
            goto L1a
        L11:
            r1 = 5
            goto L1a
        L13:
            r1 = 6
            goto L1a
        L15:
            r1 = 3
            goto L1a
        L17:
            r1 = 4
            goto L1a
        L19:
            r1 = 2
        L1a:
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r3.setAttribute(r0, r1)
            return
    }

    public void flipVertically() {
            r3 = this;
            java.lang.String r0 = "Orientation"
            r1 = 1
            int r2 = r3.getAttributeInt(r0, r1)
            switch(r2) {
                case 1: goto L19;
                case 2: goto L17;
                case 3: goto L15;
                case 4: goto L1a;
                case 5: goto L12;
                case 6: goto L10;
                case 7: goto Le;
                case 8: goto Lc;
                default: goto La;
            }
        La:
            r1 = 0
            goto L1a
        Lc:
            r1 = 5
            goto L1a
        Le:
            r1 = 6
            goto L1a
        L10:
            r1 = 7
            goto L1a
        L12:
            r1 = 8
            goto L1a
        L15:
            r1 = 2
            goto L1a
        L17:
            r1 = 3
            goto L1a
        L19:
            r1 = 4
        L1a:
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r3.setAttribute(r0, r1)
            return
    }

    public double getAltitude(double r7) {
            r6 = this;
            java.lang.String r0 = "GPSAltitude"
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r0 = r6.getAttributeDouble(r0, r1)
            java.lang.String r2 = "GPSAltitudeRef"
            r3 = -1
            int r2 = r6.getAttributeInt(r2, r3)
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L1f
            if (r2 < 0) goto L1f
            r7 = 1
            if (r2 != r7) goto L1b
            goto L1c
        L1b:
            r3 = r7
        L1c:
            double r7 = (double) r3
            double r0 = r0 * r7
            return r0
        L1f:
            return r7
    }

    public java.lang.String getAttribute(java.lang.String r6) {
            r5 = this;
            if (r6 == 0) goto Laf
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = r5.getExifAttribute(r6)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r2 = "GPSTimeStamp"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L94
            int r6 = r0.format
            r2 = 5
            java.lang.String r3 = "ExifInterface"
            if (r6 == r2) goto L34
            r2 = 10
            if (r6 == r2) goto L34
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "GPS Timestamp format is not rational. format="
            r6.append(r2)
            int r0 = r0.format
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r3, r6)
            return r1
        L34:
            java.nio.ByteOrder r6 = r5.mExifByteOrder
            java.lang.Object r6 = r0.getValue(r6)
            androidx.exifinterface.media.ExifInterface$Rational[] r6 = (androidx.exifinterface.media.ExifInterface.Rational[]) r6
            if (r6 == 0) goto L7b
            int r0 = r6.length
            r2 = 3
            if (r0 == r2) goto L43
            goto L7b
        L43:
            r0 = 0
            r0 = r6[r0]
            long r1 = r0.numerator
            float r1 = (float) r1
            long r2 = r0.denominator
            float r0 = (float) r2
            float r1 = r1 / r0
            int r0 = (int) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            r1 = r6[r1]
            long r2 = r1.numerator
            float r2 = (float) r2
            long r3 = r1.denominator
            float r1 = (float) r3
            float r2 = r2 / r1
            int r1 = (int) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r6 = r6[r2]
            long r2 = r6.numerator
            float r2 = (float) r2
            long r3 = r6.denominator
            float r6 = (float) r3
            float r2 = r2 / r6
            int r6 = (int) r2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r1, r6}
            java.lang.String r0 = "%02d:%02d:%02d"
            java.lang.String r6 = java.lang.String.format(r0, r6)
            return r6
        L7b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Invalid GPS Timestamp array. array="
            r0.append(r2)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.w(r3, r6)
            return r1
        L94:
            java.util.Set<java.lang.String> r2 = androidx.exifinterface.media.ExifInterface.RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY
            boolean r6 = r2.contains(r6)
            if (r6 == 0) goto La8
            java.nio.ByteOrder r6 = r5.mExifByteOrder     // Catch: java.lang.NumberFormatException -> La7
            double r2 = r0.getDoubleValue(r6)     // Catch: java.lang.NumberFormatException -> La7
            java.lang.String r6 = java.lang.Double.toString(r2)     // Catch: java.lang.NumberFormatException -> La7
            return r6
        La7:
            return r1
        La8:
            java.nio.ByteOrder r6 = r5.mExifByteOrder
            java.lang.String r6 = r0.getStringValue(r6)
            return r6
        Laf:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "tag shouldn't be null"
            r6.<init>(r0)
            throw r6
    }

    public byte[] getAttributeBytes(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = r1.getExifAttribute(r2)
            if (r2 == 0) goto Lb
            byte[] r2 = r2.bytes
            return r2
        Lb:
            r2 = 0
            return r2
        Ld:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "tag shouldn't be null"
            r2.<init>(r0)
            throw r2
    }

    public double getAttributeDouble(java.lang.String r2, double r3) {
            r1 = this;
            if (r2 == 0) goto L11
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = r1.getExifAttribute(r2)
            if (r2 != 0) goto L9
            goto L10
        L9:
            java.nio.ByteOrder r0 = r1.mExifByteOrder     // Catch: java.lang.NumberFormatException -> L10
            double r2 = r2.getDoubleValue(r0)     // Catch: java.lang.NumberFormatException -> L10
            return r2
        L10:
            return r3
        L11:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "tag shouldn't be null"
            r2.<init>(r3)
            throw r2
    }

    public int getAttributeInt(java.lang.String r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L11
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = r1.getExifAttribute(r2)
            if (r2 != 0) goto L9
            goto L10
        L9:
            java.nio.ByteOrder r0 = r1.mExifByteOrder     // Catch: java.lang.NumberFormatException -> L10
            int r2 = r2.getIntValue(r0)     // Catch: java.lang.NumberFormatException -> L10
            return r2
        L10:
            return r3
        L11:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "tag shouldn't be null"
            r2.<init>(r3)
            throw r2
    }

    public long[] getAttributeRange(java.lang.String r6) {
            r5 = this;
            if (r6 == 0) goto L26
            boolean r0 = r5.mModified
            if (r0 != 0) goto L1e
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = r5.getExifAttribute(r6)
            if (r6 == 0) goto L1c
            long r0 = r6.bytesOffset
            byte[] r6 = r6.bytes
            int r6 = r6.length
            long r2 = (long) r6
            r6 = 2
            long[] r6 = new long[r6]
            r4 = 0
            r6[r4] = r0
            r0 = 1
            r6[r0] = r2
            return r6
        L1c:
            r6 = 0
            return r6
        L1e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "The underlying file has been modified since being parsed"
            r6.<init>(r0)
            throw r6
        L26:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "tag shouldn't be null"
            r6.<init>(r0)
            throw r6
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public java.lang.Long getDateTime() {
            r3 = this;
            java.lang.String r0 = "DateTime"
            java.lang.String r0 = r3.getAttribute(r0)
            java.lang.String r1 = "SubSecTime"
            java.lang.String r1 = r3.getAttribute(r1)
            java.lang.String r2 = "OffsetTime"
            java.lang.String r2 = r3.getAttribute(r2)
            java.lang.Long r0 = parseDateTime(r0, r1, r2)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public java.lang.Long getDateTimeDigitized() {
            r3 = this;
            java.lang.String r0 = "DateTimeDigitized"
            java.lang.String r0 = r3.getAttribute(r0)
            java.lang.String r1 = "SubSecTimeDigitized"
            java.lang.String r1 = r3.getAttribute(r1)
            java.lang.String r2 = "OffsetTimeDigitized"
            java.lang.String r2 = r3.getAttribute(r2)
            java.lang.Long r0 = parseDateTime(r0, r1, r2)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public java.lang.Long getDateTimeOriginal() {
            r3 = this;
            java.lang.String r0 = "DateTimeOriginal"
            java.lang.String r0 = r3.getAttribute(r0)
            java.lang.String r1 = "SubSecTimeOriginal"
            java.lang.String r1 = r3.getAttribute(r1)
            java.lang.String r2 = "OffsetTimeOriginal"
            java.lang.String r2 = r3.getAttribute(r2)
            java.lang.Long r0 = parseDateTime(r0, r1, r2)
            return r0
    }

    @android.annotation.SuppressLint({"AutoBoxing"})
    public java.lang.Long getGpsDateTime() {
            r5 = this;
            java.lang.String r0 = "GPSDateStamp"
            java.lang.String r0 = r5.getAttribute(r0)
            java.lang.String r1 = "GPSTimeStamp"
            java.lang.String r1 = r5.getAttribute(r1)
            r2 = 0
            if (r0 == 0) goto L5c
            if (r1 == 0) goto L5c
            java.util.regex.Pattern r3 = androidx.exifinterface.media.ExifInterface.NON_ZERO_TIME_PATTERN
            java.util.regex.Matcher r4 = r3.matcher(r0)
            boolean r4 = r4.matches()
            if (r4 != 0) goto L28
            java.util.regex.Matcher r3 = r3.matcher(r1)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L28
            goto L5c
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r0 = 32
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.text.ParsePosition r1 = new java.text.ParsePosition
            r3 = 0
            r1.<init>(r3)
            java.text.SimpleDateFormat r3 = androidx.exifinterface.media.ExifInterface.sFormatterPrimary     // Catch: java.lang.IllegalArgumentException -> L5c
            java.util.Date r3 = r3.parse(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L5c
            if (r3 != 0) goto L53
            java.text.SimpleDateFormat r3 = androidx.exifinterface.media.ExifInterface.sFormatterSecondary     // Catch: java.lang.IllegalArgumentException -> L5c
            java.util.Date r3 = r3.parse(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L5c
            if (r3 != 0) goto L53
            return r2
        L53:
            long r0 = r3.getTime()     // Catch: java.lang.IllegalArgumentException -> L5c
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L5c
            return r0
        L5c:
            return r2
    }

    @java.lang.Deprecated
    public boolean getLatLong(float[] r5) {
            r4 = this;
            double[] r0 = r4.getLatLong()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = r0[r1]
            float r2 = (float) r2
            r5[r1] = r2
            r1 = 1
            r2 = r0[r1]
            float r0 = (float) r2
            r5[r1] = r0
            return r1
    }

    public double[] getLatLong() {
            r10 = this;
            java.lang.String r0 = "GPSLatitude"
            java.lang.String r0 = r10.getAttribute(r0)
            java.lang.String r1 = "GPSLatitudeRef"
            java.lang.String r1 = r10.getAttribute(r1)
            java.lang.String r2 = "GPSLongitude"
            java.lang.String r2 = r10.getAttribute(r2)
            java.lang.String r3 = "GPSLongitudeRef"
            java.lang.String r3 = r10.getAttribute(r3)
            if (r0 == 0) goto L52
            if (r1 == 0) goto L52
            if (r2 == 0) goto L52
            if (r3 == 0) goto L52
            double r4 = convertRationalLatLonToDouble(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L32
            double r6 = convertRationalLatLonToDouble(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L32
            r8 = 2
            double[] r8 = new double[r8]     // Catch: java.lang.IllegalArgumentException -> L32
            r9 = 0
            r8[r9] = r4     // Catch: java.lang.IllegalArgumentException -> L32
            r4 = 1
            r8[r4] = r6     // Catch: java.lang.IllegalArgumentException -> L32
            return r8
        L32:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Latitude/longitude values are not parsable. "
            r4.append(r5)
            java.lang.String r5 = "latValue=%s, latRef=%s, lngValue=%s, lngRef=%s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            java.lang.String r0 = java.lang.String.format(r5, r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.w(r1, r0)
        L52:
            r0 = 0
            return r0
    }

    public int getRotationDegrees() {
            r2 = this;
            java.lang.String r0 = "Orientation"
            r1 = 1
            int r0 = r2.getAttributeInt(r0, r1)
            switch(r0) {
                case 3: goto L12;
                case 4: goto L12;
                case 5: goto Lf;
                case 6: goto Lc;
                case 7: goto Lc;
                case 8: goto Lf;
                default: goto La;
            }
        La:
            r0 = 0
            return r0
        Lc:
            r0 = 90
            return r0
        Lf:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L12:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
    }

    public byte[] getThumbnail() {
            r2 = this;
            int r0 = r2.mThumbnailCompression
            r1 = 6
            if (r0 == r1) goto Lb
            r1 = 7
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            byte[] r0 = r2.getThumbnailBytes()
            return r0
    }

    public android.graphics.Bitmap getThumbnailBitmap() {
            r8 = this;
            boolean r0 = r8.mHasThumbnail
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r8.mThumbnailBytes
            if (r0 != 0) goto L10
            byte[] r0 = r8.getThumbnailBytes()
            r8.mThumbnailBytes = r0
        L10:
            int r0 = r8.mThumbnailCompression
            r2 = 6
            r3 = 0
            if (r0 == r2) goto L70
            r2 = 7
            if (r0 != r2) goto L1a
            goto L70
        L1a:
            r2 = 1
            if (r0 != r2) goto L6f
            byte[] r0 = r8.mThumbnailBytes
            int r0 = r0.length
            int r0 = r0 / 3
            int[] r2 = new int[r0]
        L24:
            if (r3 >= r0) goto L3f
            byte[] r4 = r8.mThumbnailBytes
            int r5 = r3 * 3
            r6 = r4[r5]
            int r6 = r6 << 16
            int r7 = r5 + 1
            r7 = r4[r7]
            int r7 = r7 << 8
            int r6 = r6 + r7
            int r5 = r5 + 2
            r4 = r4[r5]
            int r6 = r6 + r4
            r2[r3] = r6
            int r3 = r3 + 1
            goto L24
        L3f:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r8.mAttributes
            r3 = 4
            r0 = r0[r3]
            java.lang.String r4 = "ThumbnailImageLength"
            java.lang.Object r0 = r0.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r8.mAttributes
            r3 = r4[r3]
            java.lang.String r4 = "ThumbnailImageWidth"
            java.lang.Object r3 = r3.get(r4)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r3
            if (r0 == 0) goto L6f
            if (r3 == 0) goto L6f
            java.nio.ByteOrder r1 = r8.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r8.mExifByteOrder
            int r1 = r3.getIntValue(r1)
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0, r3)
            return r0
        L6f:
            return r1
        L70:
            byte[] r0 = r8.mThumbnailBytes
            int r1 = r8.mThumbnailLength
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r1)
            return r0
    }

    public byte[] getThumbnailBytes() {
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r8.mHasThumbnail
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r8.mThumbnailBytes
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r8.mAssetInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r1 == 0) goto L2f
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            if (r3 == 0) goto L26
            r1.reset()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
        L1a:
            r3 = r2
            goto L58
        L1c:
            r0 = move-exception
            r3 = r2
        L1e:
            r2 = r1
            goto L90
        L21:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L82
        L26:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r1)
            return r2
        L2f:
            java.lang.String r1 = r8.mFilename     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r1 == 0) goto L43
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.lang.String r3 = r8.mFilename     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            goto L1a
        L3b:
            r0 = move-exception
            r3 = r2
            goto L90
        L3e:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L82
        L43:
            java.io.FileDescriptor r1 = r8.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.io.FileDescriptor r1 = android.system.Os.dup(r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r4 = 0
            android.system.Os.lseek(r1, r4, r3)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r7 = r3
            r3 = r1
            r1 = r7
        L58:
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r4 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r8.mThumbnailOffset     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r6 = r8.mOffsetToExifData     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r5 + r6
            r4.skipFully(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r8.mThumbnailLength     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4.readFully(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r8.mThumbnailBytes = r5     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r1)
            if (r3 == 0) goto L76
            androidx.exifinterface.media.ExifInterfaceUtils.closeFileDescriptor(r3)
        L76:
            return r5
        L77:
            r0 = move-exception
            goto L1e
        L79:
            r4 = move-exception
            goto L82
        L7b:
            r0 = move-exception
            r3 = r1
            goto L90
        L7e:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L82:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L77
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r1)
            if (r3 == 0) goto L8f
            androidx.exifinterface.media.ExifInterfaceUtils.closeFileDescriptor(r3)
        L8f:
            return r2
        L90:
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r2)
            if (r3 == 0) goto L98
            androidx.exifinterface.media.ExifInterfaceUtils.closeFileDescriptor(r3)
        L98:
            throw r0
    }

    public long[] getThumbnailRange() {
            r6 = this;
            boolean r0 = r6.mModified
            if (r0 != 0) goto L26
            boolean r0 = r6.mHasThumbnail
            r1 = 0
            if (r0 == 0) goto L25
            boolean r0 = r6.mHasThumbnailStrips
            if (r0 == 0) goto L12
            boolean r0 = r6.mAreThumbnailStripsConsecutive
            if (r0 != 0) goto L12
            return r1
        L12:
            int r0 = r6.mThumbnailOffset
            int r1 = r6.mOffsetToExifData
            int r0 = r0 + r1
            long r0 = (long) r0
            int r2 = r6.mThumbnailLength
            long r2 = (long) r2
            r4 = 2
            long[] r4 = new long[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r2
            return r4
        L25:
            return r1
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The underlying file has been modified since being parsed"
            r0.<init>(r1)
            throw r0
    }

    public boolean hasAttribute(java.lang.String r1) {
            r0 = this;
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = r0.getExifAttribute(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public boolean hasThumbnail() {
            r1 = this;
            boolean r0 = r1.mHasThumbnail
            return r0
    }

    public boolean isFlipped() {
            r3 = this;
            java.lang.String r0 = "Orientation"
            r1 = 1
            int r0 = r3.getAttributeInt(r0, r1)
            r2 = 2
            if (r0 == r2) goto L15
            r2 = 7
            if (r0 == r2) goto L15
            r2 = 4
            if (r0 == r2) goto L15
            r2 = 5
            if (r0 == r2) goto L15
            r0 = 0
            return r0
        L15:
            return r1
    }

    public boolean isThumbnailCompressed() {
            r3 = this;
            boolean r0 = r3.mHasThumbnail
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r3.mThumbnailCompression
            r2 = 6
            if (r0 == r2) goto L10
            r2 = 7
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            return r1
        L10:
            r0 = 1
            return r0
    }

    public void resetOrientation() {
            r2 = this;
            r0 = 1
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r1 = "Orientation"
            r2.setAttribute(r1, r0)
            return
    }

    public void rotate(int r7) {
            r6 = this;
            int r0 = r7 % 90
            if (r0 != 0) goto L62
            r0 = 1
            java.lang.String r1 = "Orientation"
            int r0 = r6.getAttributeInt(r1, r0)
            java.util.List<java.lang.Integer> r2 = androidx.exifinterface.media.ExifInterface.ROTATION_ORDER
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r3)
            r4 = 0
            r5 = 4
            if (r3 == 0) goto L34
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r2.indexOf(r0)
            int r7 = r7 / 90
            int r0 = r0 + r7
            int r0 = r0 % r5
            if (r0 >= 0) goto L28
            r4 = r5
        L28:
            int r0 = r0 + r4
            java.lang.Object r7 = r2.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r4 = r7.intValue()
            goto L5a
        L34:
            java.util.List<java.lang.Integer> r2 = androidx.exifinterface.media.ExifInterface.FLIPPED_ROTATION_ORDER
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L5a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r2.indexOf(r0)
            int r7 = r7 / 90
            int r0 = r0 + r7
            int r0 = r0 % r5
            if (r0 >= 0) goto L4f
            r4 = r5
        L4f:
            int r0 = r0 + r4
            java.lang.Object r7 = r2.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r4 = r7.intValue()
        L5a:
            java.lang.String r7 = java.lang.Integer.toString(r4)
            r6.setAttribute(r1, r7)
            return
        L62:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "degree should be a multiple of 90"
            r7.<init>(r0)
            throw r7
    }

    public void saveAttributes() throws java.io.IOException {
            r13 = this;
            int r0 = r13.mMimeType
            boolean r0 = isSupportedFormatForSavingAttributes(r0)
            if (r0 == 0) goto L174
            java.io.FileDescriptor r0 = r13.mSeekableFileDescriptor
            if (r0 != 0) goto L19
            java.lang.String r0 = r13.mFilename
            if (r0 == 0) goto L11
            goto L19
        L11:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            r0.<init>(r1)
            throw r0
        L19:
            boolean r0 = r13.mHasThumbnail
            if (r0 == 0) goto L2e
            boolean r0 = r13.mHasThumbnailStrips
            if (r0 == 0) goto L2e
            boolean r0 = r13.mAreThumbnailStripsConsecutive
            if (r0 == 0) goto L26
            goto L2e
        L26:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            r0.<init>(r1)
            throw r0
        L2e:
            r0 = 1
            r13.mModified = r0
            byte[] r1 = r13.getThumbnail()
            r13.mThumbnailBytes = r1
            r1 = 0
            java.lang.String r2 = "temp"
            java.lang.String r3 = "tmp"
            java.io.File r2 = java.io.File.createTempFile(r2, r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
            java.lang.String r3 = r13.mFilename     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
            r4 = 0
            if (r3 == 0) goto L58
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
            java.lang.String r6 = r13.mFilename     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
            goto L66
        L50:
            r0 = move-exception
            r6 = r1
            goto L16d
        L54:
            r0 = move-exception
            r6 = r1
            goto L164
        L58:
            java.io.FileDescriptor r3 = r13.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
            int r6 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
            android.system.Os.lseek(r3, r4, r6)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
            java.io.FileDescriptor r6 = r13.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
        L66:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L15e java.lang.Exception -> L161
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L15e java.lang.Exception -> L161
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r3, r6)     // Catch: java.lang.Throwable -> L158 java.lang.Exception -> L15b
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r3)
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r6)
            r3 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> Le6
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> Le6
            java.lang.String r7 = r13.mFilename     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L8a
            if (r7 == 0) goto L92
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L8a
            java.lang.String r8 = r13.mFilename     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L8a
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L8a
            goto La0
        L86:
            r0 = move-exception
            r9 = r1
            goto L14c
        L8a:
            r7 = move-exception
            r8 = r1
            r9 = r8
            r1 = r6
        L8e:
            r6 = r7
            r7 = r9
            goto Lea
        L92:
            java.io.FileDescriptor r7 = r13.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L8a
            int r8 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L8a
            android.system.Os.lseek(r7, r4, r8)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L8a
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L8a
            java.io.FileDescriptor r8 = r13.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L8a
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L8a
        La0:
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> Le0
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> Le0
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> Ld7 java.lang.Exception -> Lda
            r9.<init>(r7)     // Catch: java.lang.Throwable -> Ld7 java.lang.Exception -> Lda
            int r10 = r13.mMimeType     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb7
            r11 = 4
            if (r10 != r11) goto Lbc
            r13.saveJpegAttributes(r8, r9)     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb7
            goto Lcb
        Lb3:
            r0 = move-exception
        Lb4:
            r1 = r8
            goto L14c
        Lb7:
            r1 = move-exception
            r12 = r6
            r6 = r1
            r1 = r12
            goto Lea
        Lbc:
            r11 = 13
            if (r10 != r11) goto Lc4
            r13.savePngAttributes(r8, r9)     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb7
            goto Lcb
        Lc4:
            r11 = 14
            if (r10 != r11) goto Lcb
            r13.saveWebpAttributes(r8, r9)     // Catch: java.lang.Throwable -> Lb3 java.lang.Exception -> Lb7
        Lcb:
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r8)
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r9)
            r2.delete()
            r13.mThumbnailBytes = r1
            return
        Ld7:
            r0 = move-exception
            r9 = r1
            goto Lb4
        Lda:
            r9 = move-exception
            r12 = r9
            r9 = r1
            r1 = r6
            r6 = r12
            goto Lea
        Le0:
            r8 = move-exception
            r9 = r1
            r1 = r6
            r6 = r8
            r8 = r9
            goto Lea
        Le6:
            r7 = move-exception
            r8 = r1
            r9 = r8
            goto L8e
        Lea:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L121 java.lang.Exception -> L123
            r10.<init>(r2)     // Catch: java.lang.Throwable -> L121 java.lang.Exception -> L123
            java.lang.String r1 = r13.mFilename     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lff
            if (r1 == 0) goto L101
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lff
            java.lang.String r4 = r13.mFilename     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lff
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lff
        Lfa:
            r7 = r1
            goto L110
        Lfc:
            r0 = move-exception
        Lfd:
            r1 = r10
            goto L145
        Lff:
            r1 = move-exception
            goto L126
        L101:
            java.io.FileDescriptor r1 = r13.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lff
            int r11 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lff
            android.system.Os.lseek(r1, r4, r11)     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lff
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lff
            java.io.FileDescriptor r4 = r13.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lff
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lff
            goto Lfa
        L110:
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r10, r7)     // Catch: java.lang.Throwable -> Lfc java.lang.Exception -> Lff
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r10)     // Catch: java.lang.Throwable -> Lb3
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r7)     // Catch: java.lang.Throwable -> Lb3
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = "Failed to save new file"
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> Lb3
            throw r0     // Catch: java.lang.Throwable -> Lb3
        L121:
            r0 = move-exception
            goto L145
        L123:
            r3 = move-exception
            r10 = r1
            r1 = r3
        L126:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L141
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L141
            r4.<init>()     // Catch: java.lang.Throwable -> L141
            java.lang.String r5 = "Failed to save new file. Original file is stored in "
            r4.append(r5)     // Catch: java.lang.Throwable -> L141
            java.lang.String r5 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L141
            r4.append(r5)     // Catch: java.lang.Throwable -> L141
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L141
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L141
            throw r3     // Catch: java.lang.Throwable -> L141
        L141:
            r1 = move-exception
            r3 = r0
            r0 = r1
            goto Lfd
        L145:
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r1)     // Catch: java.lang.Throwable -> Lb3
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r7)     // Catch: java.lang.Throwable -> Lb3
            throw r0     // Catch: java.lang.Throwable -> Lb3
        L14c:
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r1)
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r9)
            if (r3 != 0) goto L157
            r2.delete()
        L157:
            throw r0
        L158:
            r0 = move-exception
        L159:
            r1 = r3
            goto L16d
        L15b:
            r0 = move-exception
        L15c:
            r1 = r3
            goto L164
        L15e:
            r0 = move-exception
            r6 = r1
            goto L159
        L161:
            r0 = move-exception
            r6 = r1
            goto L15c
        L164:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L16c
            java.lang.String r3 = "Failed to copy original file to temp file"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L16c
            throw r2     // Catch: java.lang.Throwable -> L16c
        L16c:
            r0 = move-exception
        L16d:
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r1)
            androidx.exifinterface.media.ExifInterfaceUtils.closeQuietly(r6)
            throw r0
        L174:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats."
            r0.<init>(r1)
            throw r0
    }

    public void setAltitude(double r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L9
            java.lang.String r0 = "0"
            goto Lb
        L9:
            java.lang.String r0 = "1"
        Lb:
            double r3 = java.lang.Math.abs(r3)
            androidx.exifinterface.media.ExifInterface$Rational r3 = androidx.exifinterface.media.ExifInterface.Rational.createFromDouble(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "GPSAltitude"
            r2.setAttribute(r4, r3)
            java.lang.String r3 = "GPSAltitudeRef"
            r2.setAttribute(r3, r0)
            return
    }

    public void setAttribute(java.lang.String r24, java.lang.String r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            if (r1 == 0) goto L3ec
            java.lang.String r3 = "ISOSpeedRatings"
            boolean r3 = r3.equals(r1)
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L1e
            boolean r1 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r1 == 0) goto L1c
            java.lang.String r1 = "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r4, r1)
        L1c:
            java.lang.String r1 = "PhotographicSensitivity"
        L1e:
            r3 = 3
            r5 = 2
            java.lang.String r6 = "/"
            r7 = 1
            if (r2 == 0) goto L120
            java.util.Set<java.lang.String> r8 = androidx.exifinterface.media.ExifInterface.RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY
            boolean r8 = r8.contains(r1)
            java.lang.String r9 = " : "
            java.lang.String r10 = "Invalid value for "
            if (r8 == 0) goto L5e
            boolean r8 = r2.contains(r6)
            if (r8 != 0) goto L5e
            double r11 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.NumberFormatException -> L45
            androidx.exifinterface.media.ExifInterface$Rational r8 = androidx.exifinterface.media.ExifInterface.Rational.createFromDouble(r11)     // Catch: java.lang.NumberFormatException -> L45
            java.lang.String r2 = r8.toString()     // Catch: java.lang.NumberFormatException -> L45
            goto L120
        L45:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            r3.append(r1)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r4, r1)
            return
        L5e:
            java.lang.String r8 = "GPSTimeStamp"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto Lc3
            java.util.regex.Pattern r8 = androidx.exifinterface.media.ExifInterface.GPS_TIMESTAMP_PATTERN
            java.util.regex.Matcher r8 = r8.matcher(r2)
            boolean r11 = r8.find()
            if (r11 != 0) goto L8b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            r3.append(r1)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r4, r1)
            return
        L8b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = r8.group(r7)
            int r9 = java.lang.Integer.parseInt(r9)
            r2.append(r9)
            java.lang.String r9 = "/1,"
            r2.append(r9)
            java.lang.String r10 = r8.group(r5)
            int r10 = java.lang.Integer.parseInt(r10)
            r2.append(r10)
            r2.append(r9)
            java.lang.String r8 = r8.group(r3)
            int r8 = java.lang.Integer.parseInt(r8)
            r2.append(r8)
            java.lang.String r8 = "/1"
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            goto L120
        Lc3:
            java.lang.String r8 = "DateTime"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto Ldb
            java.lang.String r8 = "DateTimeOriginal"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto Ldb
            java.lang.String r8 = "DateTimeDigitized"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L120
        Ldb:
            java.util.regex.Pattern r8 = androidx.exifinterface.media.ExifInterface.DATETIME_PRIMARY_FORMAT_PATTERN
            java.util.regex.Matcher r8 = r8.matcher(r2)
            boolean r8 = r8.find()
            java.util.regex.Pattern r11 = androidx.exifinterface.media.ExifInterface.DATETIME_SECONDARY_FORMAT_PATTERN
            java.util.regex.Matcher r11 = r11.matcher(r2)
            boolean r11 = r11.find()
            int r12 = r2.length()
            r13 = 19
            if (r12 != r13) goto L107
            if (r8 != 0) goto Lfc
            if (r11 != 0) goto Lfc
            goto L107
        Lfc:
            if (r11 == 0) goto L120
            java.lang.String r8 = "-"
            java.lang.String r9 = ":"
            java.lang.String r2 = r2.replaceAll(r8, r9)
            goto L120
        L107:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            r3.append(r1)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r4, r1)
            return
        L120:
            java.lang.String r8 = "Xmp"
            boolean r9 = r8.equals(r1)
            r10 = 0
            if (r9 == 0) goto L15f
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.mAttributes
            r9 = r9[r10]
            boolean r9 = r9.containsKey(r8)
            if (r9 != 0) goto L141
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.mAttributes
            r11 = 5
            r9 = r9[r11]
            boolean r8 = r9.containsKey(r8)
            if (r8 == 0) goto L13f
            goto L141
        L13f:
            r8 = r10
            goto L142
        L141:
            r8 = r7
        L142:
            int r9 = r0.mMimeType
            int r9 = getXmpHandlingForImageType(r9)
            if (r9 != r5) goto L150
            androidx.exifinterface.media.ExifInterface$ExifAttribute r11 = r0.mXmpFromSeparateMarker
            if (r11 != 0) goto L154
            if (r8 == 0) goto L154
        L150:
            if (r9 != r3) goto L15f
            if (r8 != 0) goto L15f
        L154:
            if (r2 == 0) goto L15b
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createByte(r2)
            goto L15c
        L15b:
            r1 = 0
        L15c:
            r0.mXmpFromSeparateMarker = r1
            return
        L15f:
            r3 = r10
        L160:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r8 = androidx.exifinterface.media.ExifInterface.EXIF_TAGS
            int r8 = r8.length
            if (r3 >= r8) goto L3eb
            r8 = 4
            if (r3 != r8) goto L174
            boolean r8 = r0.mHasThumbnail
            if (r8 != 0) goto L174
        L16c:
            r22 = r6
            r24 = r7
            r20 = r10
            goto L3e0
        L174:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r8 = androidx.exifinterface.media.ExifInterface.sExifTagMapsForWriting
            r8 = r8[r3]
            java.lang.Object r8 = r8.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = (androidx.exifinterface.media.ExifInterface.ExifTag) r8
            if (r8 == 0) goto L16c
            if (r2 != 0) goto L18a
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r8 = r0.mAttributes
            r8 = r8[r3]
            r8.remove(r1)
            goto L16c
        L18a:
            android.util.Pair r9 = guessDataFormat(r2)
            int r11 = r8.primaryFormat
            java.lang.Object r12 = r9.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r13 = -1
            if (r11 == r12) goto L25e
            int r11 = r8.primaryFormat
            java.lang.Object r12 = r9.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 != r12) goto L1a9
            goto L25e
        L1a9:
            int r11 = r8.secondaryFormat
            if (r11 == r13) goto L1c7
            java.lang.Object r12 = r9.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 == r12) goto L1c3
            int r11 = r8.secondaryFormat
            java.lang.Object r12 = r9.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 != r12) goto L1c7
        L1c3:
            int r8 = r8.secondaryFormat
            goto L260
        L1c7:
            int r11 = r8.primaryFormat
            if (r11 == r7) goto L25c
            r12 = 7
            if (r11 == r12) goto L25c
            if (r11 != r5) goto L1d2
            goto L25c
        L1d2:
            boolean r11 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r11 == 0) goto L16c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Given tag ("
            r11.append(r12)
            r11.append(r1)
            java.lang.String r12 = ") value didn't match with one of expected formats: "
            r11.append(r12)
            java.lang.String[] r12 = androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES
            int r14 = r8.primaryFormat
            r14 = r12[r14]
            r11.append(r14)
            int r14 = r8.secondaryFormat
            java.lang.String r15 = ", "
            java.lang.String r16 = ""
            if (r14 != r13) goto L1fc
            r8 = r16
            goto L20f
        L1fc:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r15)
            int r8 = r8.secondaryFormat
            r8 = r12[r8]
            r14.append(r8)
            java.lang.String r8 = r14.toString()
        L20f:
            r11.append(r8)
            java.lang.String r8 = " (guess: "
            r11.append(r8)
            java.lang.Object r8 = r9.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r8 = r12[r8]
            r11.append(r8)
            java.lang.Object r8 = r9.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r13) goto L231
        L22e:
            r8 = r16
            goto L24b
        L231:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r15)
            java.lang.Object r9 = r9.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r9 = r12[r9]
            r8.append(r9)
            java.lang.String r16 = r8.toString()
            goto L22e
        L24b:
            r11.append(r8)
            java.lang.String r8 = ")"
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            android.util.Log.d(r4, r8)
            goto L16c
        L25c:
            r8 = r11
            goto L260
        L25e:
            int r8 = r8.primaryFormat
        L260:
            java.lang.String r9 = ","
            switch(r8) {
                case 1: goto L3cf;
                case 2: goto L3bd;
                case 3: goto L392;
                case 4: goto L367;
                case 5: goto L31e;
                case 6: goto L265;
                case 7: goto L3bd;
                case 8: goto L265;
                case 9: goto L2f5;
                case 10: goto L2a4;
                case 11: goto L265;
                case 12: goto L27f;
                default: goto L265;
            }
        L265:
            boolean r9 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r9 == 0) goto L16c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "Data format isn't one of expected formats: "
            r9.append(r11)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.d(r4, r8)
            goto L16c
        L27f:
            java.lang.String[] r8 = r2.split(r9, r13)
            int r9 = r8.length
            double[] r9 = new double[r9]
            r11 = r10
        L287:
            int r12 = r8.length
            if (r11 >= r12) goto L295
            r12 = r8[r11]
            double r12 = java.lang.Double.parseDouble(r12)
            r9[r11] = r12
            int r11 = r11 + 1
            goto L287
        L295:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r8 = r0.mAttributes
            r8 = r8[r3]
            java.nio.ByteOrder r11 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r9 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createDouble(r9, r11)
            r8.put(r1, r9)
            goto L16c
        L2a4:
            java.lang.String[] r8 = r2.split(r9, r13)
            int r9 = r8.length
            androidx.exifinterface.media.ExifInterface$Rational[] r9 = new androidx.exifinterface.media.ExifInterface.Rational[r9]
            r11 = r10
        L2ac:
            int r12 = r8.length
            if (r11 >= r12) goto L2e0
            r12 = r8[r11]
            java.lang.String[] r12 = r12.split(r6, r13)
            androidx.exifinterface.media.ExifInterface$Rational r14 = new androidx.exifinterface.media.ExifInterface$Rational
            r15 = r12[r10]
            r24 = r7
            r25 = r8
            double r7 = java.lang.Double.parseDouble(r15)
            long r7 = (long) r7
            r12 = r12[r24]
            r20 = r10
            r21 = r11
            double r10 = java.lang.Double.parseDouble(r12)
            long r10 = (long) r10
            r19 = 0
            r15 = r7
            r17 = r10
            r14.<init>(r15, r17, r19)
            r9[r21] = r14
            int r11 = r21 + 1
            r7 = r24
            r8 = r25
            r10 = r20
            goto L2ac
        L2e0:
            r24 = r7
            r20 = r10
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r0.mAttributes
            r7 = r7[r3]
            java.nio.ByteOrder r8 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createSRational(r9, r8)
            r7.put(r1, r8)
        L2f1:
            r22 = r6
            goto L3e0
        L2f5:
            r24 = r7
            r20 = r10
            java.lang.String[] r7 = r2.split(r9, r13)
            int r8 = r7.length
            int[] r8 = new int[r8]
            r9 = r20
        L302:
            int r10 = r7.length
            if (r9 >= r10) goto L310
            r10 = r7[r9]
            int r10 = java.lang.Integer.parseInt(r10)
            r8[r9] = r10
            int r9 = r9 + 1
            goto L302
        L310:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r0.mAttributes
            r7 = r7[r3]
            java.nio.ByteOrder r9 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createSLong(r8, r9)
            r7.put(r1, r8)
            goto L2f1
        L31e:
            r24 = r7
            r20 = r10
            java.lang.String[] r7 = r2.split(r9, r13)
            int r8 = r7.length
            androidx.exifinterface.media.ExifInterface$Rational[] r8 = new androidx.exifinterface.media.ExifInterface.Rational[r8]
            r9 = r20
        L32b:
            int r10 = r7.length
            if (r9 >= r10) goto L356
            r10 = r7[r9]
            java.lang.String[] r10 = r10.split(r6, r13)
            androidx.exifinterface.media.ExifInterface$Rational r14 = new androidx.exifinterface.media.ExifInterface$Rational
            r11 = r10[r20]
            double r11 = java.lang.Double.parseDouble(r11)
            long r11 = (long) r11
            r10 = r10[r24]
            r22 = r6
            double r5 = java.lang.Double.parseDouble(r10)
            long r5 = (long) r5
            r19 = 0
            r17 = r5
            r15 = r11
            r14.<init>(r15, r17, r19)
            r8[r9] = r14
            int r9 = r9 + 1
            r6 = r22
            r5 = 2
            goto L32b
        L356:
            r22 = r6
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r0.mAttributes
            r5 = r5[r3]
            java.nio.ByteOrder r6 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(r8, r6)
            r5.put(r1, r6)
            goto L3e0
        L367:
            r22 = r6
            r24 = r7
            r20 = r10
            java.lang.String[] r5 = r2.split(r9, r13)
            int r6 = r5.length
            long[] r6 = new long[r6]
            r7 = r20
        L376:
            int r8 = r5.length
            if (r7 >= r8) goto L384
            r8 = r5[r7]
            long r8 = java.lang.Long.parseLong(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L376
        L384:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r0.mAttributes
            r5 = r5[r3]
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(r6, r7)
            r5.put(r1, r6)
            goto L3e0
        L392:
            r22 = r6
            r24 = r7
            r20 = r10
            java.lang.String[] r5 = r2.split(r9, r13)
            int r6 = r5.length
            int[] r6 = new int[r6]
            r7 = r20
        L3a1:
            int r8 = r5.length
            if (r7 >= r8) goto L3af
            r8 = r5[r7]
            int r8 = java.lang.Integer.parseInt(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L3a1
        L3af:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r0.mAttributes
            r5 = r5[r3]
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(r6, r7)
            r5.put(r1, r6)
            goto L3e0
        L3bd:
            r22 = r6
            r24 = r7
            r20 = r10
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r0.mAttributes
            r5 = r5[r3]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r2)
            r5.put(r1, r6)
            goto L3e0
        L3cf:
            r22 = r6
            r24 = r7
            r20 = r10
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r0.mAttributes
            r5 = r5[r3]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r6 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createByte(r2)
            r5.put(r1, r6)
        L3e0:
            int r3 = r3 + 1
            r7 = r24
            r10 = r20
            r6 = r22
            r5 = 2
            goto L160
        L3eb:
            return
        L3ec:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "tag shouldn't be null"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void setDateTime(java.lang.Long r6) {
            r5 = this;
            if (r6 == 0) goto L54
            long r0 = r6.longValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L4c
            long r0 = r6.longValue()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 % r2
            java.lang.String r0 = java.lang.Long.toString(r0)
            int r1 = r0.length()
        L1b:
            r2 = 3
            if (r1 >= r2) goto L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "0"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r1 = r1 + 1
            goto L1b
        L32:
            java.text.SimpleDateFormat r1 = androidx.exifinterface.media.ExifInterface.sFormatterPrimary
            java.util.Date r2 = new java.util.Date
            long r3 = r6.longValue()
            r2.<init>(r3)
            java.lang.String r6 = r1.format(r2)
            java.lang.String r1 = "DateTime"
            r5.setAttribute(r1, r6)
            java.lang.String r6 = "SubSecTime"
            r5.setAttribute(r6, r0)
            return
        L4c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Timestamp should a positive value."
            r6.<init>(r0)
            throw r6
        L54:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "Timestamp should not be null."
            r6.<init>(r0)
            throw r6
    }

    public void setGpsInfo(android.location.Location r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "GPSProcessingMethod"
            java.lang.String r1 = r5.getProvider()
            r4.setAttribute(r0, r1)
            double r0 = r5.getLatitude()
            double r2 = r5.getLongitude()
            r4.setLatLong(r0, r2)
            double r0 = r5.getAltitude()
            r4.setAltitude(r0)
            java.lang.String r0 = "GPSSpeedRef"
            java.lang.String r1 = "K"
            r4.setAttribute(r0, r1)
            float r0 = r5.getSpeed()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS
            r2 = 1
            long r1 = r1.toSeconds(r2)
            float r1 = (float) r1
            float r0 = r0 * r1
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r1
            double r0 = (double) r0
            androidx.exifinterface.media.ExifInterface$Rational r0 = androidx.exifinterface.media.ExifInterface.Rational.createFromDouble(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GPSSpeed"
            r4.setAttribute(r1, r0)
            java.text.SimpleDateFormat r0 = androidx.exifinterface.media.ExifInterface.sFormatterPrimary
            java.util.Date r1 = new java.util.Date
            long r2 = r5.getTime()
            r1.<init>(r2)
            java.lang.String r5 = r0.format(r1)
            java.lang.String r0 = "\\s+"
            r1 = -1
            java.lang.String[] r5 = r5.split(r0, r1)
            r0 = 0
            r0 = r5[r0]
            java.lang.String r1 = "GPSDateStamp"
            r4.setAttribute(r1, r0)
            r0 = 1
            r5 = r5[r0]
            java.lang.String r0 = "GPSTimeStamp"
            r4.setAttribute(r0, r5)
            return
    }

    public void setLatLong(double r5, double r7) {
            r4 = this;
            r0 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            java.lang.String r1 = " is not valid."
            if (r0 < 0) goto L85
            r2 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 > 0) goto L85
            boolean r0 = java.lang.Double.isNaN(r5)
            if (r0 != 0) goto L85
            r2 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L6b
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 > 0) goto L6b
            boolean r0 = java.lang.Double.isNaN(r7)
            if (r0 != 0) goto L6b
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L3b
            java.lang.String r2 = "N"
            goto L3d
        L3b:
            java.lang.String r2 = "S"
        L3d:
            java.lang.String r3 = "GPSLatitudeRef"
            r4.setAttribute(r3, r2)
            double r5 = java.lang.Math.abs(r5)
            java.lang.String r5 = r4.convertDecimalDegree(r5)
            java.lang.String r6 = "GPSLatitude"
            r4.setAttribute(r6, r5)
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 < 0) goto L56
            java.lang.String r5 = "E"
            goto L58
        L56:
            java.lang.String r5 = "W"
        L58:
            java.lang.String r6 = "GPSLongitudeRef"
            r4.setAttribute(r6, r5)
            double r5 = java.lang.Math.abs(r7)
            java.lang.String r5 = r4.convertDecimalDegree(r5)
            java.lang.String r6 = "GPSLongitude"
            r4.setAttribute(r6, r5)
            return
        L6b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Longitude value "
            r6.append(r0)
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L85:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Latitude value "
            r8.append(r0)
            r8.append(r5)
            r8.append(r1)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
            throw r7
    }
}
