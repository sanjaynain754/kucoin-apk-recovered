package androidx.media3.exoplayer.smoothstreaming.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.rtsp.RtpPayloadFormat;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import androidx.media3.extractor.mp4.TrackEncryptionBox;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class SsManifestParser implements ParsingLoadable.Parser<SsManifest> {
    private final XmlPullParserFactory xmlParserFactory;

    public static abstract class ElementParser {
        private final String baseUri;
        private final List<Pair<String, Object>> normalizedAttributes = new LinkedList();

        @Nullable
        private final ElementParser parent;
        private final String tag;

        public abstract Object build();

        @Nullable
        public final Object getNormalizedAttribute(String str) {
            for (int i11 = 0; i11 < this.normalizedAttributes.size(); i11++) {
                Pair<String, Object> pair = this.normalizedAttributes.get(i11);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            ElementParser elementParser = this.parent;
            if (elementParser == null) {
                return null;
            }
            return elementParser.getNormalizedAttribute(str);
        }

        public boolean handleChildInline(String str) {
            return false;
        }

        public final Object parse(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.tag.equals(name)) {
                        parseStartTag(xmlPullParser);
                        z11 = true;
                    } else if (z11) {
                        if (i11 > 0) {
                            i11++;
                        } else if (handleChildInline(name)) {
                            parseStartTag(xmlPullParser);
                        } else {
                            ElementParser elementParserNewChildParser = newChildParser(this, name, this.baseUri);
                            if (elementParserNewChildParser == null) {
                                i11 = 1;
                            } else {
                                addChild(elementParserNewChildParser.parse(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z11 && i11 == 0) {
                        parseText(xmlPullParser);
                    }
                } else if (!z11) {
                    continue;
                } else if (i11 > 0) {
                    i11--;
                } else {
                    String name2 = xmlPullParser.getName();
                    parseEndTag(xmlPullParser);
                    if (!handleChildInline(name2)) {
                        return build();
                    }
                }
                xmlPullParser.next();
            }
        }

        public final boolean parseBoolean(XmlPullParser xmlPullParser, String str, boolean z11) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z11;
        }

        public final int parseInt(XmlPullParser xmlPullParser, String str, int i11) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i11;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e11) {
                throw ParserException.createForMalformedManifest(null, e11);
            }
        }

        public final long parseLong(XmlPullParser xmlPullParser, String str, long j11) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j11;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e11) {
                throw ParserException.createForMalformedManifest(null, e11);
            }
        }

        public final int parseRequiredInt(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e11) {
                throw ParserException.createForMalformedManifest(null, e11);
            }
        }

        public final long parseRequiredLong(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e11) {
                throw ParserException.createForMalformedManifest(null, e11);
            }
        }

        public final String parseRequiredString(XmlPullParser xmlPullParser, String str) throws MissingFieldException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new MissingFieldException(str);
        }

        private ElementParser newChildParser(ElementParser elementParser, String str, String str2) {
            if (QualityLevelParser.TAG.equals(str)) {
                return new QualityLevelParser(elementParser, str2);
            }
            if (ProtectionParser.TAG.equals(str)) {
                return new ProtectionParser(elementParser, str2);
            }
            if (StreamIndexParser.TAG.equals(str)) {
                return new StreamIndexParser(elementParser, str2);
            }
            return null;
        }

        public final void putNormalizedAttribute(String str, @Nullable Object obj) {
            this.normalizedAttributes.add(Pair.create(str, obj));
        }

        public ElementParser(@Nullable ElementParser elementParser, String str, String str2) {
            this.parent = elementParser;
            this.baseUri = str;
            this.tag = str2;
        }

        public void addChild(Object obj) {
        }

        public void parseEndTag(XmlPullParser xmlPullParser) {
        }

        public void parseStartTag(XmlPullParser xmlPullParser) throws ParserException {
        }

        public void parseText(XmlPullParser xmlPullParser) {
        }
    }

    public static class MissingFieldException extends ParserException {
        public MissingFieldException(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    public static class ProtectionParser extends ElementParser {
        private static final int INITIALIZATION_VECTOR_SIZE = 8;
        public static final String KEY_SYSTEM_ID = "SystemID";
        public static final String TAG = "Protection";
        public static final String TAG_PROTECTION_HEADER = "ProtectionHeader";
        private boolean inProtectionHeader;
        private byte[] initData;
        private UUID uuid;

        private static String stripCurlyBraces(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        public ProtectionParser(ElementParser elementParser, String str) {
            super(elementParser, str, TAG);
        }

        private static TrackEncryptionBox[] buildTrackEncryptionBoxes(byte[] bArr) {
            return new TrackEncryptionBox[]{new TrackEncryptionBox(true, null, 8, getProtectionElementKeyId(bArr), 0, 0, null)};
        }

        private static byte[] getProtectionElementKeyId(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < bArr.length; i11 += 2) {
                sb2.append((char) bArr[i11]);
            }
            String string = sb2.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            swap(bArrDecode, 0, 3);
            swap(bArrDecode, 1, 2);
            swap(bArrDecode, 4, 5);
            swap(bArrDecode, 6, 7);
            return bArrDecode;
        }

        private static void swap(byte[] bArr, int i11, int i12) {
            byte b11 = bArr[i11];
            bArr[i11] = bArr[i12];
            bArr[i12] = b11;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public Object build() {
            UUID uuid = this.uuid;
            return new SsManifest.ProtectionElement(uuid, PsshAtomUtil.buildPsshAtom(uuid, this.initData), buildTrackEncryptionBoxes(this.initData));
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public boolean handleChildInline(String str) {
            return TAG_PROTECTION_HEADER.equals(str);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public void parseEndTag(XmlPullParser xmlPullParser) {
            if (TAG_PROTECTION_HEADER.equals(xmlPullParser.getName())) {
                this.inProtectionHeader = false;
            }
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public void parseText(XmlPullParser xmlPullParser) {
            if (this.inProtectionHeader) {
                this.initData = Base64.decode(xmlPullParser.getText(), 0);
            }
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public void parseStartTag(XmlPullParser xmlPullParser) {
            if (TAG_PROTECTION_HEADER.equals(xmlPullParser.getName())) {
                this.inProtectionHeader = true;
                this.uuid = UUID.fromString(stripCurlyBraces(xmlPullParser.getAttributeValue(null, KEY_SYSTEM_ID)));
            }
        }
    }

    public static class QualityLevelParser extends ElementParser {
        private static final String KEY_BITRATE = "Bitrate";
        private static final String KEY_CHANNELS = "Channels";
        private static final String KEY_CODEC_PRIVATE_DATA = "CodecPrivateData";
        private static final String KEY_FOUR_CC = "FourCC";
        private static final String KEY_INDEX = "Index";
        private static final String KEY_LANGUAGE = "Language";
        private static final String KEY_MAX_HEIGHT = "MaxHeight";
        private static final String KEY_MAX_WIDTH = "MaxWidth";
        private static final String KEY_NAME = "Name";
        private static final String KEY_SAMPLING_RATE = "SamplingRate";
        private static final String KEY_SUB_TYPE = "Subtype";
        private static final String KEY_TYPE = "Type";
        public static final String TAG = "QualityLevel";
        private Format format;

        public QualityLevelParser(ElementParser elementParser, String str) {
            super(elementParser, str, TAG);
        }

        private static List<byte[]> buildCodecSpecificData(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bytesFromHexString = Util.getBytesFromHexString(str);
                byte[][] bArrSplitNalUnits = CodecSpecificDataUtil.splitNalUnits(bytesFromHexString);
                if (bArrSplitNalUnits == null) {
                    arrayList.add(bytesFromHexString);
                    return arrayList;
                }
                Collections.addAll(arrayList, bArrSplitNalUnits);
            }
            return arrayList;
        }

        @Nullable
        private static String fourCCToMimeType(String str) {
            if (str.equalsIgnoreCase(RtpPayloadFormat.RTP_MEDIA_H264) || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return MimeTypes.APPLICATION_TTML;
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return MimeTypes.AUDIO_AC3;
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return MimeTypes.AUDIO_E_AC3;
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return MimeTypes.AUDIO_DTS;
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return MimeTypes.AUDIO_DTS_HD;
            }
            if (str.equalsIgnoreCase("dtse")) {
                return MimeTypes.AUDIO_DTS_EXPRESS;
            }
            if (str.equalsIgnoreCase("opus")) {
                return MimeTypes.AUDIO_OPUS;
            }
            return null;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public Object build() {
            return this.format;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public void parseStartTag(XmlPullParser xmlPullParser) throws ParserException {
            int i11;
            Format.Builder builder = new Format.Builder();
            String strFourCCToMimeType = fourCCToMimeType(parseRequiredString(xmlPullParser, KEY_FOUR_CC));
            int iIntValue = ((Integer) getNormalizedAttribute(KEY_TYPE)).intValue();
            if (iIntValue == 2) {
                builder.setContainerMimeType(MimeTypes.VIDEO_MP4).setWidth(parseRequiredInt(xmlPullParser, KEY_MAX_WIDTH)).setHeight(parseRequiredInt(xmlPullParser, KEY_MAX_HEIGHT)).setInitializationData(buildCodecSpecificData(xmlPullParser.getAttributeValue(null, KEY_CODEC_PRIVATE_DATA)));
            } else if (iIntValue == 1) {
                if (strFourCCToMimeType == null) {
                    strFourCCToMimeType = "audio/mp4a-latm";
                }
                int requiredInt = parseRequiredInt(xmlPullParser, KEY_CHANNELS);
                int requiredInt2 = parseRequiredInt(xmlPullParser, KEY_SAMPLING_RATE);
                List<byte[]> listBuildCodecSpecificData = buildCodecSpecificData(xmlPullParser.getAttributeValue(null, KEY_CODEC_PRIVATE_DATA));
                if (listBuildCodecSpecificData.isEmpty() && "audio/mp4a-latm".equals(strFourCCToMimeType)) {
                    listBuildCodecSpecificData = Collections.singletonList(AacUtil.buildAacLcAudioSpecificConfig(requiredInt2, requiredInt));
                }
                builder.setContainerMimeType(MimeTypes.AUDIO_MP4).setChannelCount(requiredInt).setSampleRate(requiredInt2).setInitializationData(listBuildCodecSpecificData);
            } else if (iIntValue == 3) {
                String str = (String) getNormalizedAttribute(KEY_SUB_TYPE);
                if (str == null) {
                    i11 = 0;
                } else if (str.equals("CAPT")) {
                    i11 = 64;
                } else if (str.equals("DESC")) {
                    i11 = 1024;
                } else {
                    i11 = 0;
                }
                builder.setContainerMimeType(MimeTypes.APPLICATION_MP4).setRoleFlags(i11);
            } else {
                builder.setContainerMimeType(MimeTypes.APPLICATION_MP4);
            }
            this.format = builder.setId(xmlPullParser.getAttributeValue(null, KEY_INDEX)).setLabel((String) getNormalizedAttribute(KEY_NAME)).setSampleMimeType(strFourCCToMimeType).setAverageBitrate(parseRequiredInt(xmlPullParser, KEY_BITRATE)).setLanguage((String) getNormalizedAttribute(KEY_LANGUAGE)).build();
        }
    }

    public static class SmoothStreamingMediaParser extends ElementParser {
        private static final String KEY_DURATION = "Duration";
        private static final String KEY_DVR_WINDOW_LENGTH = "DVRWindowLength";
        private static final String KEY_IS_LIVE = "IsLive";
        private static final String KEY_LOOKAHEAD_COUNT = "LookaheadCount";
        private static final String KEY_MAJOR_VERSION = "MajorVersion";
        private static final String KEY_MINOR_VERSION = "MinorVersion";
        private static final String KEY_TIME_SCALE = "TimeScale";
        public static final String TAG = "SmoothStreamingMedia";
        private long duration;
        private long dvrWindowLength;
        private boolean isLive;
        private int lookAheadCount;
        private int majorVersion;
        private int minorVersion;

        @Nullable
        private SsManifest.ProtectionElement protectionElement;
        private final List<SsManifest.StreamElement> streamElements;
        private long timescale;

        public SmoothStreamingMediaParser(ElementParser elementParser, String str) {
            super(elementParser, str, TAG);
            this.lookAheadCount = -1;
            this.protectionElement = null;
            this.streamElements = new LinkedList();
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public void addChild(Object obj) {
            if (obj instanceof SsManifest.StreamElement) {
                this.streamElements.add((SsManifest.StreamElement) obj);
            } else if (obj instanceof SsManifest.ProtectionElement) {
                Assertions.checkState(this.protectionElement == null);
                this.protectionElement = (SsManifest.ProtectionElement) obj;
            }
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public Object build() {
            int size = this.streamElements.size();
            SsManifest.StreamElement[] streamElementArr = new SsManifest.StreamElement[size];
            this.streamElements.toArray(streamElementArr);
            if (this.protectionElement != null) {
                SsManifest.ProtectionElement protectionElement = this.protectionElement;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(protectionElement.uuid, MimeTypes.VIDEO_MP4, protectionElement.data));
                for (int i11 = 0; i11 < size; i11++) {
                    SsManifest.StreamElement streamElement = streamElementArr[i11];
                    int i12 = streamElement.type;
                    if (i12 == 2 || i12 == 1) {
                        Format[] formatArr = streamElement.formats;
                        for (int i13 = 0; i13 < formatArr.length; i13++) {
                            formatArr[i13] = formatArr[i13].buildUpon().setDrmInitData(drmInitData).build();
                        }
                    }
                }
            }
            return new SsManifest(this.majorVersion, this.minorVersion, this.timescale, this.duration, this.dvrWindowLength, this.lookAheadCount, this.isLive, this.protectionElement, streamElementArr);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public void parseStartTag(XmlPullParser xmlPullParser) throws ParserException {
            this.majorVersion = parseRequiredInt(xmlPullParser, KEY_MAJOR_VERSION);
            this.minorVersion = parseRequiredInt(xmlPullParser, KEY_MINOR_VERSION);
            this.timescale = parseLong(xmlPullParser, KEY_TIME_SCALE, 10000000L);
            this.duration = parseRequiredLong(xmlPullParser, KEY_DURATION);
            this.dvrWindowLength = parseLong(xmlPullParser, KEY_DVR_WINDOW_LENGTH, 0L);
            this.lookAheadCount = parseInt(xmlPullParser, KEY_LOOKAHEAD_COUNT, -1);
            this.isLive = parseBoolean(xmlPullParser, KEY_IS_LIVE, false);
            putNormalizedAttribute(KEY_TIME_SCALE, Long.valueOf(this.timescale));
        }
    }

    public static class StreamIndexParser extends ElementParser {
        private static final String KEY_DISPLAY_HEIGHT = "DisplayHeight";
        private static final String KEY_DISPLAY_WIDTH = "DisplayWidth";
        private static final String KEY_FRAGMENT_DURATION = "d";
        private static final String KEY_FRAGMENT_REPEAT_COUNT = "r";
        private static final String KEY_FRAGMENT_START_TIME = "t";
        private static final String KEY_LANGUAGE = "Language";
        private static final String KEY_MAX_HEIGHT = "MaxHeight";
        private static final String KEY_MAX_WIDTH = "MaxWidth";
        private static final String KEY_NAME = "Name";
        private static final String KEY_SUB_TYPE = "Subtype";
        private static final String KEY_TIME_SCALE = "TimeScale";
        private static final String KEY_TYPE = "Type";
        private static final String KEY_TYPE_AUDIO = "audio";
        private static final String KEY_TYPE_TEXT = "text";
        private static final String KEY_TYPE_VIDEO = "video";
        private static final String KEY_URL = "Url";
        public static final String TAG = "StreamIndex";
        private static final String TAG_STREAM_FRAGMENT = "c";
        private final String baseUri;
        private int displayHeight;
        private int displayWidth;
        private final List<Format> formats;
        private String language;
        private long lastChunkDuration;
        private int maxHeight;
        private int maxWidth;
        private String name;
        private ArrayList<Long> startTimes;
        private String subType;
        private long timescale;
        private int type;
        private String url;

        private int parseType(XmlPullParser xmlPullParser) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, KEY_TYPE);
            if (attributeValue == null) {
                throw new MissingFieldException(KEY_TYPE);
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw ParserException.createForMalformedManifest("Invalid key value[" + attributeValue + "]", null);
        }

        public StreamIndexParser(ElementParser elementParser, String str) {
            super(elementParser, str, TAG);
            this.baseUri = str;
            this.formats = new LinkedList();
        }

        private void parseStreamFragmentStartTag(XmlPullParser xmlPullParser) throws ParserException {
            int size = this.startTimes.size();
            long jLongValue = parseLong(xmlPullParser, KEY_FRAGMENT_START_TIME, C2711C.TIME_UNSET);
            int i11 = 1;
            if (jLongValue == C2711C.TIME_UNSET) {
                if (size == 0) {
                    jLongValue = 0;
                } else {
                    if (this.lastChunkDuration == -1) {
                        throw ParserException.createForMalformedManifest("Unable to infer start time", null);
                    }
                    jLongValue = this.lastChunkDuration + this.startTimes.get(size - 1).longValue();
                }
            }
            this.startTimes.add(Long.valueOf(jLongValue));
            this.lastChunkDuration = parseLong(xmlPullParser, "d", C2711C.TIME_UNSET);
            long j11 = parseLong(xmlPullParser, KEY_FRAGMENT_REPEAT_COUNT, 1L);
            if (j11 > 1 && this.lastChunkDuration == C2711C.TIME_UNSET) {
                throw ParserException.createForMalformedManifest("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j12 = i11;
                if (j12 >= j11) {
                    return;
                }
                this.startTimes.add(Long.valueOf((this.lastChunkDuration * j12) + jLongValue));
                i11++;
            }
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public void addChild(Object obj) {
            if (obj instanceof Format) {
                this.formats.add((Format) obj);
            }
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public Object build() {
            Format[] formatArr = new Format[this.formats.size()];
            this.formats.toArray(formatArr);
            return new SsManifest.StreamElement(this.baseUri, this.url, this.type, this.subType, this.timescale, this.name, this.maxWidth, this.maxHeight, this.displayWidth, this.displayHeight, this.language, formatArr, this.startTimes, this.lastChunkDuration);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public boolean handleChildInline(String str) {
            return TAG_STREAM_FRAGMENT.equals(str);
        }

        private void parseStreamElementStartTag(XmlPullParser xmlPullParser) throws ParserException {
            int type = parseType(xmlPullParser);
            this.type = type;
            putNormalizedAttribute(KEY_TYPE, Integer.valueOf(type));
            if (this.type == 3) {
                this.subType = parseRequiredString(xmlPullParser, KEY_SUB_TYPE);
            } else {
                this.subType = xmlPullParser.getAttributeValue(null, KEY_SUB_TYPE);
            }
            putNormalizedAttribute(KEY_SUB_TYPE, this.subType);
            String attributeValue = xmlPullParser.getAttributeValue(null, KEY_NAME);
            this.name = attributeValue;
            putNormalizedAttribute(KEY_NAME, attributeValue);
            this.url = parseRequiredString(xmlPullParser, KEY_URL);
            this.maxWidth = parseInt(xmlPullParser, KEY_MAX_WIDTH, -1);
            this.maxHeight = parseInt(xmlPullParser, KEY_MAX_HEIGHT, -1);
            this.displayWidth = parseInt(xmlPullParser, KEY_DISPLAY_WIDTH, -1);
            this.displayHeight = parseInt(xmlPullParser, KEY_DISPLAY_HEIGHT, -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, KEY_LANGUAGE);
            this.language = attributeValue2;
            putNormalizedAttribute(KEY_LANGUAGE, attributeValue2);
            long j11 = parseInt(xmlPullParser, KEY_TIME_SCALE, -1);
            this.timescale = j11;
            if (j11 == -1) {
                this.timescale = ((Long) getNormalizedAttribute(KEY_TIME_SCALE)).longValue();
            }
            this.startTimes = new ArrayList<>();
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser.ElementParser
        public void parseStartTag(XmlPullParser xmlPullParser) throws ParserException {
            if (TAG_STREAM_FRAGMENT.equals(xmlPullParser.getName())) {
                parseStreamFragmentStartTag(xmlPullParser);
            } else {
                parseStreamElementStartTag(xmlPullParser);
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public SsManifest parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (SsManifest) new SmoothStreamingMediaParser(null, uri.toString()).parse(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e11) {
            throw ParserException.createForMalformedManifest(null, e11);
        }
    }

    public SsManifestParser() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e11) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e11);
        }
    }
}
