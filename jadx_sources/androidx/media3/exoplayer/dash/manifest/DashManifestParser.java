package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C2711C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.firebase.messaging.Constants;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {
    private static final String TAG = "MpdParser";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    private static int checkContentTypeConsistency(int i11, int i12) {
        if (i11 == -1) {
            return i12;
        }
        if (i12 == -1) {
            return i11;
        }
        Assertions.checkState(i11 == i12);
        return i11;
    }

    private static void fillInClearKeyInformation(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i11);
            if (C2711C.CLEARKEY_UUID.equals(schemeData.uuid) && (str = schemeData.licenseServerUrl) != null) {
                arrayList.remove(i11);
                break;
            }
            i11++;
        }
        if (str == null) {
            return;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            DrmInitData.SchemeData schemeData2 = arrayList.get(i12);
            if (C2711C.COMMON_PSSH_UUID.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                arrayList.set(i12, new DrmInitData.SchemeData(C2711C.CLEARKEY_UUID, str, schemeData2.mimeType, schemeData2.data));
            }
        }
    }

    private boolean isDvbProfileDeclared(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static int parseCea608AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Descriptor descriptor = list.get(i11);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.m2961w(TAG, "Unable to parse CEA-608 channel number from: " + descriptor.value);
            }
        }
        return -1;
    }

    public static int parseCea708AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Descriptor descriptor = list.get(i11);
            if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.m2961w(TAG, "Unable to parse CEA-708 service block number from: " + descriptor.value);
            }
        }
        return -1;
    }

    public static long parseDateTime(XmlPullParser xmlPullParser, String str, long j11) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j11 : Util.parseXsDateTime(attributeValue);
    }

    public static int parseDolbyChannelConfiguration(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String lowerCase = Ascii.toLowerCase(attributeValue);
        lowerCase.getClass();
        switch (lowerCase) {
            case "4000":
                return 1;
            case "a000":
                return 2;
            case "f800":
                return 5;
            case "f801":
                return 6;
            case "fa01":
                return 8;
            default:
                return -1;
        }
    }

    public static int parseDtsxChannelConfiguration(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    public static long parseDuration(XmlPullParser xmlPullParser, String str, long j11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j11 : Util.parseXsDuration(attributeValue);
    }

    public static String parseEac3SupplementalProperties(List<Descriptor> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            Descriptor descriptor = list.get(i11);
            String str = descriptor.schemeIdUri;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(descriptor.value)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && MimeTypes.CODEC_E_AC3_JOC.equals(descriptor.value)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
        }
        return MimeTypes.AUDIO_E_AC3;
    }

    public static float parseFloat(XmlPullParser xmlPullParser, String str, float f11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f11 : Float.parseFloat(attributeValue);
    }

    public static float parseFrameRate(XmlPullParser xmlPullParser, float f11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
            if (matcher.matches()) {
                int i11 = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                return !TextUtils.isEmpty(strGroup) ? i11 / Integer.parseInt(strGroup) : i11;
            }
        }
        return f11;
    }

    public static int parseInt(XmlPullParser xmlPullParser, String str, int i11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i11 : Integer.parseInt(attributeValue);
    }

    public static long parseLastSegmentNumberSupplementalProperty(List<Descriptor> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            Descriptor descriptor = list.get(i11);
            if (Ascii.equalsIgnoreCase("http://dashif.org/guidelines/last-segment-number", descriptor.schemeIdUri)) {
                return Long.parseLong(descriptor.value);
            }
        }
        return -1L;
    }

    public static long parseLong(XmlPullParser xmlPullParser, String str, long j11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j11 : Long.parseLong(attributeValue);
    }

    public static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public long parseAvailabilityTimeOffsetUs(XmlPullParser xmlPullParser, long j11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j11;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0120  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public Pair<String, DrmInitData.SchemeData> parseContentProtection(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        UUID uuid;
        String attributeValue;
        String str;
        String text;
        ?? BuildPsshAtom;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue2 != null) {
            String lowerCase = Ascii.toLowerCase(attributeValue2);
            lowerCase.getClass();
            switch (lowerCase) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = C2711C.CLEARKEY_UUID;
                    attributeValue = null;
                    str = attributeValue;
                    text = str;
                    BuildPsshAtom = str;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = C2711C.PLAYREADY_UUID;
                    attributeValue = null;
                    str = attributeValue;
                    text = str;
                    BuildPsshAtom = str;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = C2711C.WIDEVINE_UUID;
                    attributeValue = null;
                    str = attributeValue;
                    text = str;
                    BuildPsshAtom = str;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    String attributeValueIgnorePrefix = XmlPullParserUtil.getAttributeValueIgnorePrefix(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(attributeValueIgnorePrefix) && !"00000000-0000-0000-0000-000000000000".equals(attributeValueIgnorePrefix)) {
                        String[] strArrSplit = attributeValueIgnorePrefix.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                            uuidArr[i11] = UUID.fromString(strArrSplit[i11]);
                        }
                        uuid = C2711C.COMMON_PSSH_UUID;
                        byte[] bArrBuildPsshAtom = PsshAtomUtil.buildPsshAtom(uuid, uuidArr, null);
                        text = null;
                        BuildPsshAtom = bArrBuildPsshAtom;
                        break;
                    } else {
                        Log.m2961w(TAG, "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uuid = null;
                        str = null;
                        text = str;
                        BuildPsshAtom = str;
                        break;
                    }
                    break;
                default:
                    uuid = null;
                    attributeValue = null;
                    str = attributeValue;
                    text = str;
                    BuildPsshAtom = str;
                    break;
            }
        } else {
            uuid = null;
            attributeValue = null;
            str = attributeValue;
            text = str;
            BuildPsshAtom = str;
        }
        do {
            xmlPullParser.next();
            if ((XmlPullParserUtil.isStartTag(xmlPullParser, "clearkey:Laurl") || XmlPullParserUtil.isStartTag(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                BuildPsshAtom = BuildPsshAtom;
                text = xmlPullParser.getText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ms:laurl")) {
                BuildPsshAtom = BuildPsshAtom;
                text = xmlPullParser.getAttributeValue(null, TUIConstants.TUIBeauty.PARAM_NAME_LICENSE_URL);
            } else if (BuildPsshAtom == 0 && XmlPullParserUtil.isStartTagIgnorePrefix(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuid2 = PsshAtomUtil.parseUuid(bArrDecode);
                if (uuid2 == null) {
                    Log.m2961w(TAG, "Skipping malformed cenc:pssh data");
                    uuid = uuid2;
                    BuildPsshAtom = 0;
                    text = text;
                } else {
                    BuildPsshAtom = bArrDecode;
                    uuid = uuid2;
                    text = text;
                }
            } else if (BuildPsshAtom == 0) {
                UUID uuid3 = C2711C.PLAYREADY_UUID;
                if (uuid3.equals(uuid) && XmlPullParserUtil.isStartTag(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    BuildPsshAtom = PsshAtomUtil.buildPsshAtom(uuid3, Base64.decode(xmlPullParser.getText(), 0));
                    text = text;
                } else {
                    maybeSkipTag(xmlPullParser);
                    BuildPsshAtom = BuildPsshAtom;
                    text = text;
                }
            } else {
                maybeSkipTag(xmlPullParser);
                BuildPsshAtom = BuildPsshAtom;
                text = text;
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.SchemeData(uuid, text, MimeTypes.VIDEO_MP4, BuildPsshAtom) : null);
    }

    public int parseContentType(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public Label parseLabel(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return new Label(xmlPullParser.getAttributeValue(null, "lang"), parseText(xmlPullParser, "Label"));
    }

    public String[] parseProfiles(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    public RangedUri parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) {
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j12 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split(C33820nf.f71144W);
            j11 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j12 = (Long.parseLong(strArrSplit[1]) - j11) + 1;
            }
        } else {
            j11 = 0;
        }
        return buildRangedUri(attributeValue, j11, j12);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0215 A[LOOP:0: B:3:0x006d->B:56:0x0215, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01c8 A[EDGE_INSN: B:57:0x01c8->B:46:0x01c8 BREAK  A[LOOP:0: B:3:0x006d->B:56:0x0215], SYNTHETIC] */
    public RepresentationInfo parseRepresentation(XmlPullParser xmlPullParser, List<BaseUrl> list, @Nullable String str, @Nullable String str2, int i11, int i12, float f11, int i13, int i14, @Nullable String str3, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, List<Descriptor> list5, @Nullable SegmentBase segmentBase, long j11, long j12, long j13, long j14, long j15, boolean z11) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int audioChannelConfiguration;
        SegmentBase segmentBase2;
        long j16;
        SegmentBase segmentTemplate;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        int i15 = parseInt(xmlPullParser2, "bandwidth", -1);
        String string = parseString(xmlPullParser2, "mimeType", str);
        String string2 = parseString(xmlPullParser2, "codecs", str2);
        int i16 = parseInt(xmlPullParser2, "width", i11);
        int i17 = parseInt(xmlPullParser2, "height", i12);
        float frameRate = parseFrameRate(xmlPullParser2, f11);
        int i18 = parseInt(xmlPullParser2, "audioSamplingRate", i14);
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList(list4);
        ArrayList arrayList10 = new ArrayList(list5);
        int i19 = i13;
        long j17 = j14;
        String str4 = null;
        boolean z12 = false;
        SegmentBase segmentBase3 = segmentBase;
        long availabilityTimeOffsetUs = j13;
        ArrayList arrayList11 = new ArrayList();
        while (true) {
            xmlPullParser2.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z12) {
                    availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser2, availabilityTimeOffsetUs);
                    z12 = true;
                }
                arrayList11.addAll(parseBaseUrl(xmlPullParser2, list, z11));
                xmlPullParser2 = xmlPullParser2;
                arrayList6 = arrayList11;
                j17 = j17;
                i15 = i15;
                audioChannelConfiguration = i19;
                str4 = str4;
                z12 = z12;
                arrayList = arrayList8;
                segmentBase2 = segmentBase3;
                j16 = availabilityTimeOffsetUs;
            } else {
                arrayList = arrayList8;
                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AudioChannelConfiguration")) {
                    segmentBase2 = segmentBase3;
                    audioChannelConfiguration = parseAudioChannelConfiguration(xmlPullParser);
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentBase")) {
                        audioChannelConfiguration = i19;
                        segmentBase2 = parseSegmentBase(xmlPullParser2, (SegmentBase.SingleSegmentBase) segmentBase3);
                    } else {
                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentList")) {
                            long availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser2, j17);
                            arrayList4 = arrayList11;
                            arrayList2 = arrayList10;
                            i15 = i15;
                            arrayList = arrayList;
                            segmentTemplate = parseSegmentList(xmlPullParser2, (SegmentBase.SegmentList) segmentBase3, j11, j12, availabilityTimeOffsetUs, availabilityTimeOffsetUs2, j15);
                            arrayList3 = arrayList9;
                            j17 = availabilityTimeOffsetUs2;
                        } else {
                            ArrayList arrayList12 = arrayList11;
                            arrayList2 = arrayList10;
                            i15 = i15;
                            arrayList = arrayList;
                            ArrayList arrayList13 = arrayList9;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                long availabilityTimeOffsetUs3 = parseAvailabilityTimeOffsetUs(xmlPullParser2, j17);
                                long j18 = availabilityTimeOffsetUs;
                                segmentTemplate = parseSegmentTemplate(xmlPullParser2, (SegmentBase.SegmentTemplate) segmentBase3, list5, j11, j12, j18, availabilityTimeOffsetUs3, j15);
                                availabilityTimeOffsetUs = j18;
                                arrayList3 = arrayList13;
                                j17 = availabilityTimeOffsetUs3;
                                arrayList4 = arrayList12;
                            } else {
                                xmlPullParser2 = xmlPullParser2;
                                arrayList7 = arrayList7;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentProtection")) {
                                    Pair<String, DrmInitData.SchemeData> contentProtection = parseContentProtection(xmlPullParser);
                                    Object obj = contentProtection.first;
                                    if (obj != null) {
                                        str4 = (String) obj;
                                    }
                                    Object obj2 = contentProtection.second;
                                    if (obj2 != null) {
                                        arrayList7.add((DrmInitData.SchemeData) obj2);
                                    }
                                    arrayList3 = arrayList13;
                                } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "InbandEventStream")) {
                                    arrayList.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                    arrayList3 = arrayList13;
                                } else {
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EssentialProperty")) {
                                        arrayList3 = arrayList13;
                                        arrayList3.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                                    } else {
                                        arrayList3 = arrayList13;
                                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SupplementalProperty")) {
                                            arrayList10 = arrayList2;
                                            arrayList10.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                                        } else {
                                            arrayList10 = arrayList2;
                                            maybeSkipTag(xmlPullParser2);
                                        }
                                    }
                                    j17 = j17;
                                    audioChannelConfiguration = i19;
                                    str4 = str4;
                                    z12 = z12;
                                    segmentBase2 = segmentBase3;
                                    j16 = availabilityTimeOffsetUs;
                                    arrayList5 = arrayList12;
                                }
                                arrayList10 = arrayList2;
                                j17 = j17;
                                audioChannelConfiguration = i19;
                                str4 = str4;
                                z12 = z12;
                                segmentBase2 = segmentBase3;
                                j16 = availabilityTimeOffsetUs;
                                arrayList5 = arrayList12;
                            }
                        }
                        audioChannelConfiguration = i19;
                        str4 = str4;
                        z12 = z12;
                        segmentBase2 = segmentTemplate;
                        j16 = availabilityTimeOffsetUs;
                        arrayList10 = arrayList2;
                        arrayList5 = arrayList4;
                    }
                    if (XmlPullParserUtil.isEndTag(xmlPullParser2, "Representation")) {
                        break;
                    }
                    ArrayList arrayList14 = arrayList10;
                    arrayList9 = arrayList3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList;
                    segmentBase3 = segmentBase2;
                    availabilityTimeOffsetUs = j16;
                    i15 = i15;
                    j17 = j17;
                    z12 = z12;
                    str4 = str4;
                    arrayList10 = arrayList14;
                    i19 = audioChannelConfiguration;
                    arrayList11 = arrayList5;
                    xmlPullParser2 = xmlPullParser;
                }
                j16 = availabilityTimeOffsetUs;
                arrayList6 = arrayList11;
            }
            arrayList7 = arrayList7;
            arrayList3 = arrayList9;
            arrayList5 = arrayList6;
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "Representation")) {
                break;
                break;
            }
            ArrayList arrayList15 = arrayList10;
            arrayList9 = arrayList3;
            arrayList7 = arrayList7;
            arrayList8 = arrayList;
            segmentBase3 = segmentBase2;
            availabilityTimeOffsetUs = j16;
            i15 = i15;
            j17 = j17;
            z12 = z12;
            str4 = str4;
            arrayList10 = arrayList15;
            i19 = audioChannelConfiguration;
            arrayList11 = arrayList5;
            xmlPullParser2 = xmlPullParser;
        }
        ArrayList arrayList16 = arrayList7;
        List<Descriptor> list6 = arrayList10;
        Format formatBuildFormat = buildFormat(attributeValue, string, i16, i17, frameRate, audioChannelConfiguration, i18, i15, str3, list2, list3, string2, arrayList3, list6);
        if (segmentBase2 == null) {
            segmentBase2 = new SegmentBase.SingleSegmentBase();
        }
        boolean zIsEmpty = arrayList5.isEmpty();
        List list7 = arrayList5;
        if (zIsEmpty) {
            list7 = list;
        }
        return new RepresentationInfo(formatBuildFormat, list7, segmentBase2, str4, arrayList16, arrayList, arrayList3, list6, -1L);
    }

    public int parseRoleFlagsFromAccessibilityDescriptors(List<Descriptor> list) {
        int tvaAudioPurposeCsValue;
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            Descriptor descriptor = list.get(i12);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                tvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(descriptor.value);
            } else {
                if (Ascii.equalsIgnoreCase("urn:tva:metadata:cs:AudioPurposeCS:2007", descriptor.schemeIdUri)) {
                    tvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
                }
            }
            i11 |= tvaAudioPurposeCsValue;
        }
        return i11;
    }

    public int parseRoleFlagsFromProperties(List<Descriptor> list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (Ascii.equalsIgnoreCase("http://dashif.org/guidelines/trickmode", list.get(i12).schemeIdUri)) {
                i11 = 16384;
            }
        }
        return i11;
    }

    public int parseRoleFlagsFromRoleDescriptors(List<Descriptor> list) {
        int roleFlagsFromDashRoleScheme = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Descriptor descriptor = list.get(i11);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                roleFlagsFromDashRoleScheme |= parseRoleFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return roleFlagsFromDashRoleScheme;
    }

    public int parseSelectionFlagsFromDashRoleScheme(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int parseSelectionFlagsFromRoleDescriptors(List<Descriptor> list) {
        int selectionFlagsFromDashRoleScheme = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Descriptor descriptor = list.get(i11);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                selectionFlagsFromDashRoleScheme |= parseSelectionFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return selectionFlagsFromDashRoleScheme;
    }

    @Nullable
    public Pair<Integer, Integer> parseTileCountFromProperties(List<Descriptor> list) {
        String str;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Descriptor descriptor = list.get(i11);
            if ((Ascii.equalsIgnoreCase("http://dashif.org/thumbnail_tile", descriptor.schemeIdUri) || Ascii.equalsIgnoreCase("http://dashif.org/guidelines/thumbnail_tile", descriptor.schemeIdUri)) && (str = descriptor.value) != null) {
                String[] strArrSplit = Util.split(str, "x");
                if (strArrSplit.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int parseTvaAudioPurposeCsValue(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        byte b11 = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b11 = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b11 = 1;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    b11 = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b11 = 3;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    b11 = 4;
                }
                break;
        }
        switch (b11) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    @Nullable
    public UrlTemplate parseUrlTemplate(XmlPullParser xmlPullParser, String str, @Nullable UrlTemplate urlTemplate) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? UrlTemplate.compile(attributeValue) : urlTemplate;
    }

    public static final class RepresentationInfo {
        public final ImmutableList<BaseUrl> baseUrls;
        public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;

        @Nullable
        public final String drmSchemeType;
        public final List<Descriptor> essentialProperties;
        public final Format format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;
        public final List<Descriptor> supplementalProperties;

        public RepresentationInfo(Format format, List<BaseUrl> list, SegmentBase segmentBase, @Nullable String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2, List<Descriptor> list2, List<Descriptor> list3, long j11) {
            this.format = format;
            this.baseUrls = ImmutableList.copyOf((Collection) list);
            this.segmentBase = segmentBase;
            this.drmSchemeType = str;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.essentialProperties = list2;
            this.supplementalProperties = list3;
            this.revisionId = j11;
        }
    }

    private long addSegmentTimelineElementsToList(List<SegmentBase.SegmentTimelineElement> list, long j11, long j12, int i11, long j13) {
        int iCeilDivide = i11 >= 0 ? i11 + 1 : (int) Util.ceilDivide(j13 - j11, j12);
        for (int i12 = 0; i12 < iCeilDivide; i12++) {
            list.add(buildSegmentTimelineElement(j11, j12));
            j11 += j12;
        }
        return j11;
    }

    @Nullable
    private static String checkLanguageConsistency(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        Assertions.checkState(str.equals(str2));
        return str;
    }

    public static String parseText(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return text;
    }

    public AdaptationSet buildAdaptationSet(long j11, int i11, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        return new AdaptationSet(j11, i11, list, list2, list3, list4);
    }

    public EventMessage buildEvent(String str, String str2, long j11, long j12, byte[] bArr) {
        return new EventMessage(str, str2, j12, j11, bArr);
    }

    public EventStream buildEventStream(String str, String str2, long j11, long[] jArr, EventMessage[] eventMessageArr) {
        return new EventStream(str, str2, j11, jArr, eventMessageArr);
    }

    public Format buildFormat(@Nullable String str, @Nullable String str2, int i11, int i12, float f11, int i13, int i14, int i15, @Nullable String str3, List<Descriptor> list, List<Descriptor> list2, @Nullable String str4, List<Descriptor> list3, List<Descriptor> list4) {
        String str5 = str4;
        String sampleMimeType = getSampleMimeType(str2, str5);
        if (MimeTypes.AUDIO_E_AC3.equals(sampleMimeType)) {
            sampleMimeType = parseEac3SupplementalProperties(list4);
            if (MimeTypes.AUDIO_E_AC3_JOC.equals(sampleMimeType)) {
                str5 = MimeTypes.CODEC_E_AC3_JOC;
            }
        }
        int selectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
        int roleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list) | parseRoleFlagsFromAccessibilityDescriptors(list2) | parseRoleFlagsFromProperties(list3) | parseRoleFlagsFromProperties(list4);
        Pair<Integer, Integer> tileCountFromProperties = parseTileCountFromProperties(list3);
        Format.Builder language = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(sampleMimeType).setCodecs(str5).setPeakBitrate(i15).setSelectionFlags(selectionFlagsFromRoleDescriptors).setRoleFlags(roleFlagsFromRoleDescriptors).setLanguage(str3);
        int cea708AccessibilityChannel = -1;
        Format.Builder tileCountVertical = language.setTileCountHorizontal(tileCountFromProperties != null ? ((Integer) tileCountFromProperties.first).intValue() : -1).setTileCountVertical(tileCountFromProperties != null ? ((Integer) tileCountFromProperties.second).intValue() : -1);
        if (MimeTypes.isVideo(sampleMimeType)) {
            tileCountVertical.setWidth(i11).setHeight(i12).setFrameRate(f11);
        } else if (MimeTypes.isAudio(sampleMimeType)) {
            tileCountVertical.setChannelCount(i13).setSampleRate(i14);
        } else if (MimeTypes.isText(sampleMimeType)) {
            if (MimeTypes.APPLICATION_CEA608.equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea608AccessibilityChannel(list2);
            } else if (MimeTypes.APPLICATION_CEA708.equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea708AccessibilityChannel(list2);
            }
            tileCountVertical.setAccessibilityChannel(cea708AccessibilityChannel);
        } else if (MimeTypes.isImage(sampleMimeType)) {
            tileCountVertical.setWidth(i11).setHeight(i12);
        }
        return tileCountVertical.build();
    }

    public DashManifest buildMediaPresentationDescription(long j11, long j12, long j13, boolean z11, long j14, long j15, long j16, long j17, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTimingElement, @Nullable ServiceDescriptionElement serviceDescriptionElement, @Nullable Uri uri, List<Period> list) {
        return new DashManifest(j11, j12, j13, z11, j14, j15, j16, j17, programInformation, utcTimingElement, serviceDescriptionElement, uri, list);
    }

    public Period buildPeriod(@Nullable String str, long j11, List<AdaptationSet> list, List<EventStream> list2, @Nullable Descriptor descriptor) {
        return new Period(str, j11, list, list2, descriptor);
    }

    public RangedUri buildRangedUri(String str, long j11, long j12) {
        return new RangedUri(str, j11, j12);
    }

    public Representation buildRepresentation(RepresentationInfo representationInfo, @Nullable String str, List<Label> list, @Nullable String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2) {
        Format.Builder builderBuildUpon = representationInfo.format.buildUpon();
        if (str == null || !list.isEmpty()) {
            builderBuildUpon.setLabels(list);
        } else {
            builderBuildUpon.setLabel(str);
        }
        String str3 = representationInfo.drmSchemeType;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = representationInfo.drmSchemeDatas;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            fillInClearKeyInformation(arrayList3);
            filterRedundantIncompleteSchemeDatas(arrayList3);
            builderBuildUpon.setDrmInitData(new DrmInitData(str3, arrayList3));
        }
        ArrayList<Descriptor> arrayList4 = representationInfo.inbandEventStreams;
        arrayList4.addAll(arrayList2);
        return Representation.newInstance(representationInfo.revisionId, builderBuildUpon.build(), representationInfo.baseUrls, representationInfo.segmentBase, arrayList4, representationInfo.essentialProperties, representationInfo.supplementalProperties, null);
    }

    public SegmentBase.SegmentList buildSegmentList(RangedUri rangedUri, long j11, long j12, long j13, long j14, @Nullable List<SegmentBase.SegmentTimelineElement> list, long j15, @Nullable List<RangedUri> list2, long j16, long j17) {
        return new SegmentBase.SegmentList(rangedUri, j11, j12, j13, j14, list, j15, list2, Util.msToUs(j16), Util.msToUs(j17));
    }

    public SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangedUri, long j11, long j12, long j13, long j14, long j15, List<SegmentBase.SegmentTimelineElement> list, long j16, @Nullable UrlTemplate urlTemplate, @Nullable UrlTemplate urlTemplate2, long j17, long j18) {
        return new SegmentBase.SegmentTemplate(rangedUri, j11, j12, j13, j14, j15, list, j16, urlTemplate, urlTemplate2, Util.msToUs(j17), Util.msToUs(j18));
    }

    public SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long j11, long j12) {
        return new SegmentBase.SegmentTimelineElement(j11, j12);
    }

    public SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangedUri, long j11, long j12, long j13, long j14) {
        return new SegmentBase.SingleSegmentBase(rangedUri, j11, j12, j13, j14);
    }

    public UtcTimingElement buildUtcTimingElement(String str, String str2) {
        return new UtcTimingElement(str, str2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public DashManifest parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return parseMediaPresentationDescription(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e11) {
            throw ParserException.createForMalformedManifest(null, e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0397 A[LOOP:0: B:3:0x0094->B:74:0x0397, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0347 A[EDGE_INSN: B:75:0x0347->B:68:0x0347 BREAK  A[LOOP:0: B:3:0x0094->B:74:0x0397], SYNTHETIC] */
    public AdaptationSet parseAdaptationSet(XmlPullParser xmlPullParser, List<BaseUrl> list, @Nullable SegmentBase segmentBase, long j11, long j12, long j13, long j14, long j15, boolean z11) throws XmlPullParserException, IOException {
        long j16;
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int iCheckContentTypeConsistency;
        long j17;
        int i11;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long j18 = parseLong(xmlPullParser2, "id", -1L);
        int contentType = parseContentType(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int i12 = parseInt(xmlPullParser2, "width", -1);
        int i13 = parseInt(xmlPullParser2, "height", -1);
        float frameRate = parseFrameRate(xmlPullParser2, -1.0f);
        int i14 = parseInt(xmlPullParser2, "audioSamplingRate", -1);
        String str2 = "lang";
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, Constants.ScionAnalytics.PARAM_LABEL);
        List<Label> arrayList4 = new ArrayList<>();
        ArrayList<DrmInitData.SchemeData> arrayList5 = new ArrayList<>();
        ArrayList<Descriptor> arrayList6 = new ArrayList<>();
        List<Label> list2 = arrayList4;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList<Descriptor> arrayList10 = arrayList6;
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        long j19 = j13;
        String str3 = attributeValue;
        String str4 = attributeValue2;
        int i15 = i12;
        int i16 = i13;
        float f11 = frameRate;
        String str5 = attributeValue3;
        int iCheckContentTypeConsistency2 = contentType;
        boolean z12 = false;
        int audioChannelConfiguration = -1;
        String str6 = null;
        SegmentBase segmentList = segmentBase;
        ArrayList arrayList14 = arrayList12;
        long availabilityTimeOffsetUs = j12;
        while (true) {
            xmlPullParser2.next();
            float f12 = f11;
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z12) {
                    availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser2, availabilityTimeOffsetUs);
                    z12 = true;
                }
                long j21 = availabilityTimeOffsetUs;
                arrayList13.addAll(parseBaseUrl(xmlPullParser2, list, z11));
                arrayList13 = arrayList13;
                arrayList5 = arrayList5;
                arrayList11 = arrayList11;
                segmentList = segmentList;
                arrayList10 = arrayList10;
                arrayList14 = arrayList14;
                f12 = f12;
                arrayList9 = arrayList9;
                audioChannelConfiguration = audioChannelConfiguration;
                i14 = i14;
                arrayList8 = arrayList8;
                list2 = list2;
                j16 = j21;
            } else {
                j16 = availabilityTimeOffsetUs;
                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> contentProtection = parseContentProtection(xmlPullParser);
                    Object obj = contentProtection.first;
                    if (obj != null) {
                        str6 = (String) obj;
                    }
                    Object obj2 = contentProtection.second;
                    if (obj2 != null) {
                        arrayList5.add((DrmInitData.SchemeData) obj2);
                    }
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentComponent")) {
                        String strCheckLanguageConsistency = checkLanguageConsistency(str5, xmlPullParser2.getAttributeValue(null, str2));
                        iCheckContentTypeConsistency2 = checkContentTypeConsistency(iCheckContentTypeConsistency2, parseContentType(xmlPullParser));
                        str5 = strCheckLanguageConsistency;
                    } else {
                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Role")) {
                            arrayList8.add(parseDescriptor(xmlPullParser2, "Role"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AudioChannelConfiguration")) {
                            arrayList13 = arrayList13;
                            arrayList5 = arrayList5;
                            arrayList11 = arrayList11;
                            list2 = list2;
                            arrayList10 = arrayList10;
                            arrayList14 = arrayList14;
                            f12 = f12;
                            audioChannelConfiguration = parseAudioChannelConfiguration(xmlPullParser);
                            arrayList9 = arrayList9;
                            i14 = i14;
                            arrayList2 = arrayList7;
                            segmentList = segmentList;
                            j16 = j16;
                            str2 = str2;
                            arrayList8 = arrayList8;
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Accessibility")) {
                            arrayList7.add(parseDescriptor(xmlPullParser2, "Accessibility"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EssentialProperty")) {
                            arrayList9.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SupplementalProperty")) {
                            arrayList11.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                        } else {
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Representation")) {
                                arrayList13 = arrayList13;
                                List<BaseUrl> list3 = !arrayList13.isEmpty() ? arrayList13 : list;
                                XmlPullParser xmlPullParser3 = xmlPullParser2;
                                ArrayList arrayList15 = arrayList9;
                                int i17 = i16;
                                int i18 = iCheckContentTypeConsistency2;
                                str2 = str2;
                                String str7 = str4;
                                String str8 = str5;
                                int i19 = i15;
                                RepresentationInfo representation = parseRepresentation(xmlPullParser3, list3, str3, str7, i19, i17, f12, audioChannelConfiguration, i14, str8, arrayList8, arrayList7, arrayList15, arrayList11, segmentList, j14, j11, j16, j19, j15, z11);
                                str3 = str3;
                                i15 = i19;
                                i16 = i17;
                                str = str8;
                                arrayList8 = arrayList8;
                                arrayList9 = arrayList15;
                                segmentList = segmentList;
                                f12 = f12;
                                arrayList2 = arrayList7;
                                arrayList3 = arrayList11;
                                j16 = j16;
                                str4 = str7;
                                audioChannelConfiguration = audioChannelConfiguration;
                                i14 = i14;
                                iCheckContentTypeConsistency = checkContentTypeConsistency(i18, MimeTypes.getTrackType(representation.format.sampleMimeType));
                                arrayList = arrayList14;
                                arrayList.add(representation);
                                xmlPullParser2 = xmlPullParser3;
                            } else {
                                ArrayList arrayList16 = arrayList14;
                                audioChannelConfiguration = audioChannelConfiguration;
                                arrayList = arrayList16;
                                arrayList13 = arrayList13;
                                str = str5;
                                arrayList5 = arrayList5;
                                list2 = list2;
                                segmentList = segmentList;
                                arrayList10 = arrayList10;
                                f12 = f12;
                                XmlPullParser xmlPullParser4 = xmlPullParser2;
                                arrayList9 = arrayList9;
                                arrayList8 = arrayList8;
                                arrayList2 = arrayList7;
                                arrayList3 = arrayList11;
                                j16 = j16;
                                iCheckContentTypeConsistency = iCheckContentTypeConsistency2;
                                i14 = i14;
                                str2 = str2;
                                j17 = j19;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser4, "SegmentBase")) {
                                    xmlPullParser2 = xmlPullParser4;
                                    segmentList = parseSegmentBase(xmlPullParser4, (SegmentBase.SingleSegmentBase) segmentList);
                                    j19 = j17;
                                } else if (XmlPullParserUtil.isStartTag(xmlPullParser4, "SegmentList")) {
                                    long availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser4, j17);
                                    arrayList14 = arrayList;
                                    xmlPullParser2 = xmlPullParser;
                                    segmentList = parseSegmentList(xmlPullParser2, (SegmentBase.SegmentList) segmentList, j14, j11, j16, availabilityTimeOffsetUs2, j15);
                                    arrayList11 = arrayList3;
                                    str5 = str;
                                    iCheckContentTypeConsistency2 = iCheckContentTypeConsistency;
                                    arrayList10 = arrayList10;
                                    j19 = availabilityTimeOffsetUs2;
                                    list2 = list2;
                                } else {
                                    i11 = iCheckContentTypeConsistency;
                                    xmlPullParser2 = xmlPullParser4;
                                    arrayList14 = arrayList;
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                        long availabilityTimeOffsetUs3 = parseAvailabilityTimeOffsetUs(xmlPullParser2, j17);
                                        arrayList11 = arrayList3;
                                        SegmentBase segmentTemplate = parseSegmentTemplate(xmlPullParser2, (SegmentBase.SegmentTemplate) segmentList, arrayList11, j14, j11, j16, availabilityTimeOffsetUs3, j15);
                                        j16 = j16;
                                        segmentList = segmentTemplate;
                                        str5 = str;
                                        iCheckContentTypeConsistency2 = i11;
                                        list2 = list2;
                                        arrayList10 = arrayList10;
                                        j19 = availabilityTimeOffsetUs3;
                                    } else {
                                        arrayList11 = arrayList3;
                                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "InbandEventStream")) {
                                            arrayList10 = arrayList10;
                                            arrayList10.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                            list2 = list2;
                                        } else {
                                            arrayList10 = arrayList10;
                                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Label")) {
                                                list2 = list2;
                                                list2.add(parseLabel(xmlPullParser));
                                            } else {
                                                list2 = list2;
                                                if (XmlPullParserUtil.isStartTag(xmlPullParser2)) {
                                                    parseAdaptationSetChild(xmlPullParser);
                                                }
                                            }
                                        }
                                        long j22 = j17;
                                        iCheckContentTypeConsistency2 = i11;
                                        j19 = j22;
                                        str5 = str;
                                    }
                                }
                            }
                            arrayList14 = arrayList;
                            arrayList11 = arrayList3;
                            str5 = str;
                            list2 = list2;
                            arrayList10 = arrayList10;
                            iCheckContentTypeConsistency2 = iCheckContentTypeConsistency;
                        }
                        arrayList13 = arrayList13;
                        str = str5;
                        arrayList5 = arrayList5;
                        arrayList11 = arrayList11;
                        segmentList = segmentList;
                        arrayList10 = arrayList10;
                        arrayList14 = arrayList14;
                        f12 = f12;
                        arrayList9 = arrayList9;
                        audioChannelConfiguration = audioChannelConfiguration;
                        i14 = i14;
                        arrayList8 = arrayList8;
                        list2 = list2;
                        j16 = j16;
                        str2 = str2;
                        arrayList2 = arrayList7;
                        long j23 = j19;
                        i11 = iCheckContentTypeConsistency2;
                        j17 = j23;
                        long j24 = j17;
                        iCheckContentTypeConsistency2 = i11;
                        j19 = j24;
                        str5 = str;
                    }
                    if (XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                        break;
                    }
                    i14 = i14;
                    arrayList7 = arrayList2;
                    arrayList8 = arrayList8;
                    str2 = str2;
                    arrayList11 = arrayList11;
                    segmentList = segmentList;
                    availabilityTimeOffsetUs = j16;
                    list2 = list2;
                    f11 = f12;
                    arrayList9 = arrayList9;
                    audioChannelConfiguration = audioChannelConfiguration;
                    arrayList5 = arrayList5;
                    arrayList14 = arrayList14;
                    arrayList10 = arrayList10;
                    arrayList13 = arrayList13;
                }
            }
            arrayList2 = arrayList7;
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                break;
                break;
            }
            i14 = i14;
            arrayList7 = arrayList2;
            arrayList8 = arrayList8;
            str2 = str2;
            arrayList11 = arrayList11;
            segmentList = segmentList;
            availabilityTimeOffsetUs = j16;
            list2 = list2;
            f11 = f12;
            arrayList9 = arrayList9;
            audioChannelConfiguration = audioChannelConfiguration;
            arrayList5 = arrayList5;
            arrayList14 = arrayList14;
            arrayList10 = arrayList10;
            arrayList13 = arrayList13;
        }
        List<Representation> arrayList17 = new ArrayList<>(arrayList14.size());
        int i21 = 0;
        while (i21 < arrayList14.size()) {
            ArrayList<Descriptor> arrayList18 = arrayList10;
            List<Label> list4 = list2;
            String str9 = attributeValue4;
            arrayList17.add(buildRepresentation((RepresentationInfo) arrayList14.get(i21), str9, list4, str6, arrayList5, arrayList18));
            i21++;
            attributeValue4 = str9;
            list2 = list4;
            arrayList10 = arrayList18;
        }
        return buildAdaptationSet(j18, iCheckContentTypeConsistency2, arrayList17, arrayList2, arrayList9, arrayList11);
    }

    public List<BaseUrl> parseBaseUrl(XmlPullParser xmlPullParser, List<BaseUrl> list, boolean z11) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i11 = attributeValue != null ? Integer.parseInt(attributeValue) : z11 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i12 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = parseText(xmlPullParser, "BaseURL");
        if (UriUtil.isAbsolute(text)) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return Lists.newArrayList(new BaseUrl(text, attributeValue3, i11, i12));
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            BaseUrl baseUrl = list.get(i13);
            String strResolve = UriUtil.resolve(baseUrl.url, text);
            String str = attributeValue3 == null ? strResolve : attributeValue3;
            if (z11) {
                i11 = baseUrl.priority;
                i12 = baseUrl.weight;
                str = baseUrl.serviceLocation;
            }
            arrayList.add(new BaseUrl(strResolve, str, i11, i12));
        }
        return arrayList;
    }

    public Pair<Long, EventMessage> parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j11, long j12, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long j13 = parseLong(xmlPullParser, "id", 0L);
        long j14 = parseLong(xmlPullParser, TypedValues.TransitionType.S_DURATION, C2711C.TIME_UNSET);
        long j15 = parseLong(xmlPullParser, "presentationTime", 0L);
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j14, 1000L, j11);
        long jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(j15 - j12, 1000000L, j11);
        String string = parseString(xmlPullParser, "messageData", null);
        byte[] eventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jScaleLargeTimestamp2);
        if (string != null) {
            eventObject = Util.getUtf8Bytes(string);
        }
        return Pair.create(lValueOf, buildEvent(str, str2, j13, jScaleLargeTimestamp, eventObject));
    }

    /* JADX WARN: Code duplicated, block: B:68:0x019f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01de A[LOOP:0: B:24:0x00aa->B:82:0x01de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x019b A[SYNTHETIC] */
    public DashManifest parseMediaPresentationDescription(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Throwable th2;
        long j11;
        DashManifestParser dashManifestParser = this;
        boolean zIsDvbProfileDeclared = dashManifestParser.isDvbProfileDeclared(dashManifestParser.parseProfiles(xmlPullParser, "profiles", new String[0]));
        long dateTime = parseDateTime(xmlPullParser, "availabilityStartTime", C2711C.TIME_UNSET);
        long duration = parseDuration(xmlPullParser, "mediaPresentationDuration", C2711C.TIME_UNSET);
        long duration2 = parseDuration(xmlPullParser, "minBufferTime", C2711C.TIME_UNSET);
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long duration3 = zEquals ? parseDuration(xmlPullParser, "minimumUpdatePeriod", C2711C.TIME_UNSET) : -9223372036854775807L;
        long duration4 = zEquals ? parseDuration(xmlPullParser, "timeShiftBufferDepth", C2711C.TIME_UNSET) : -9223372036854775807L;
        long duration5 = zEquals ? parseDuration(xmlPullParser, "suggestedPresentationDelay", C2711C.TIME_UNSET) : -9223372036854775807L;
        long dateTime2 = parseDateTime(xmlPullParser, "publishTime", C2711C.TIME_UNSET);
        long j12 = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayListNewArrayList = Lists.newArrayList(new BaseUrl(uri.toString(), uri.toString(), zIsDvbProfileDeclared ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        long j13 = zEquals ? -9223372036854775807L : 0L;
        ArrayList arrayList9 = arrayListNewArrayList;
        long availabilityTimeOffsetUs = j12;
        boolean z11 = false;
        boolean z12 = false;
        ProgramInformation programInformation = null;
        UtcTimingElement utcTiming = null;
        Uri uriResolveToUri = null;
        ServiceDescriptionElement serviceDescription = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z12) {
                    availabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, availabilityTimeOffsetUs);
                    z12 = true;
                }
                arrayList = arrayList9;
                arrayList2 = arrayList7;
                arrayList8.addAll(dashManifestParser.parseBaseUrl(xmlPullParser, arrayList, zIsDvbProfileDeclared));
            } else {
                arrayList = arrayList9;
                arrayList2 = arrayList7;
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "ProgramInformation")) {
                    programInformation = parseProgramInformation(xmlPullParser);
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "UTCTiming")) {
                    utcTiming = parseUtcTiming(xmlPullParser);
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Location")) {
                    uriResolveToUri = UriUtil.resolveToUri(uri.toString(), xmlPullParser.nextText());
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "ServiceDescription")) {
                        serviceDescription = parseServiceDescription(xmlPullParser);
                    } else {
                        if (!XmlPullParserUtil.isStartTag(xmlPullParser, "Period") || z11) {
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList2;
                            arrayList9 = arrayList;
                            j13 = j13;
                            availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                            maybeSkipTag(xmlPullParser);
                        } else {
                            if (arrayList8.isEmpty()) {
                                arrayList3 = arrayList8;
                                arrayList5 = arrayList;
                                arrayList6 = arrayList2;
                                arrayList9 = arrayList5;
                            } else {
                                arrayList5 = arrayList8;
                                arrayList3 = arrayList5;
                                arrayList9 = arrayList;
                                arrayList6 = arrayList2;
                            }
                            Pair<Period, Long> period = parsePeriod(xmlPullParser, arrayList5, j13, availabilityTimeOffsetUs, dateTime, duration4, zIsDvbProfileDeclared);
                            Period period2 = (Period) period.first;
                            ArrayList arrayList10 = arrayList6;
                            if (period2.startMs != C2711C.TIME_UNSET) {
                                long jLongValue = ((Long) period.second).longValue();
                                long j14 = jLongValue == C2711C.TIME_UNSET ? -9223372036854775807L : period2.startMs + jLongValue;
                                arrayList4 = arrayList10;
                                arrayList4.add(period2);
                                j13 = j14;
                            } else {
                                if (!zEquals) {
                                    throw ParserException.createForMalformedManifest("Unable to determine start of period " + arrayList10.size(), null);
                                }
                                arrayList4 = arrayList10;
                                z11 = true;
                            }
                        }
                        availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                        j13 = j13;
                    }
                    if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                        if (duration != C2711C.TIME_UNSET) {
                            th2 = null;
                            j11 = duration;
                        } else if (j13 != C2711C.TIME_UNSET) {
                            j11 = j13;
                            th2 = null;
                        } else {
                            if (!zEquals) {
                                throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", null);
                            }
                            th2 = null;
                            j11 = duration;
                        }
                        if (arrayList4.isEmpty()) {
                            throw ParserException.createForMalformedManifest("No periods found.", th2);
                        }
                        return buildMediaPresentationDescription(dateTime, j11, duration2, zEquals, duration3, duration4, duration5, dateTime2, programInformation, utcTiming, serviceDescription, uriResolveToUri, arrayList4);
                    }
                    dashManifestParser = this;
                    duration3 = duration3;
                    duration4 = duration4;
                    duration5 = duration5;
                    dateTime2 = dateTime2;
                    programInformation = programInformation;
                    utcTiming = utcTiming;
                    duration2 = duration2;
                    zEquals = zEquals;
                    arrayList8 = arrayList3;
                    arrayList7 = arrayList4;
                }
            }
            arrayList3 = arrayList8;
            arrayList4 = arrayList2;
            arrayList9 = arrayList;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                if (duration != C2711C.TIME_UNSET) {
                    th2 = null;
                    j11 = duration;
                } else if (j13 != C2711C.TIME_UNSET) {
                    j11 = j13;
                    th2 = null;
                } else {
                    if (!zEquals) {
                        throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", null);
                    }
                    th2 = null;
                    j11 = duration;
                }
                if (arrayList4.isEmpty()) {
                    return buildMediaPresentationDescription(dateTime, j11, duration2, zEquals, duration3, duration4, duration5, dateTime2, programInformation, utcTiming, serviceDescription, uriResolveToUri, arrayList4);
                }
                throw ParserException.createForMalformedManifest("No periods found.", th2);
            }
            dashManifestParser = this;
            duration3 = duration3;
            duration4 = duration4;
            duration5 = duration5;
            dateTime2 = dateTime2;
            programInformation = programInformation;
            utcTiming = utcTiming;
            duration2 = duration2;
            zEquals = zEquals;
            arrayList8 = arrayList3;
            arrayList7 = arrayList4;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 4421. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public android.util.Pair<androidx.media3.exoplayer.dash.manifest.Period, java.lang.Long> parsePeriod(org.xmlpull.v1.XmlPullParser r33, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> r34, long r35, long r37, long r39, long r41, boolean r43) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.manifest.DashManifestParser.parsePeriod(org.xmlpull.v1.XmlPullParser, java.util.List, long, long, long, long, boolean):android.util.Pair");
    }

    public ProgramInformation parseProgramInformation(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String string = parseString(xmlPullParser, "moreInformationURL", null);
        String string2 = parseString(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, ExifInterface.TAG_COPYRIGHT)) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str = strNextText2;
            String str2 = strNextText;
            String str3 = strNextText3;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ProgramInformation")) {
                return new ProgramInformation(str2, str, str3, string, string2);
            }
            strNextText = str2;
            strNextText2 = str;
            strNextText3 = str3;
        }
    }

    public int parseRoleFlagsFromDashRoleScheme(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
            case "forced-subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    public SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xmlPullParser, @Nullable SegmentBase.SingleSegmentBase singleSegmentBase) throws XmlPullParserException, IOException {
        long j11 = parseLong(xmlPullParser, "timescale", singleSegmentBase != null ? singleSegmentBase.timescale : 1L);
        long j12 = parseLong(xmlPullParser, "presentationTimeOffset", singleSegmentBase != null ? singleSegmentBase.presentationTimeOffset : 0L);
        long j13 = singleSegmentBase != null ? singleSegmentBase.indexStart : 0L;
        long j14 = singleSegmentBase != null ? singleSegmentBase.indexLength : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split(C33820nf.f71144W);
            j13 = Long.parseLong(strArrSplit[0]);
            j14 = (Long.parseLong(strArrSplit[1]) - j13) + 1;
        }
        long j15 = j14;
        RangedUri initialization = singleSegmentBase != null ? singleSegmentBase.initialization : null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
            RangedUri rangedUri = initialization;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentBase")) {
                return buildSingleSegmentBase(rangedUri, j11, j12, j13, j15);
            }
            initialization = rangedUri;
        }
    }

    public SegmentBase.SegmentList parseSegmentList(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentList segmentList, long j11, long j12, long j13, long j14, long j15) throws XmlPullParserException, IOException {
        long j16;
        long j17 = parseLong(xmlPullParser, "timescale", segmentList != null ? segmentList.timescale : 1L);
        long j18 = parseLong(xmlPullParser, "presentationTimeOffset", segmentList != null ? segmentList.presentationTimeOffset : 0L);
        long j19 = parseLong(xmlPullParser, TypedValues.TransitionType.S_DURATION, segmentList != null ? segmentList.duration : C2711C.TIME_UNSET);
        long j21 = parseLong(xmlPullParser, "startNumber", segmentList != null ? segmentList.startNumber : 1L);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j13, j14);
        List<RangedUri> arrayList = null;
        RangedUri initialization = null;
        List<SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
                j16 = j17;
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                j16 = j17;
                segmentTimeline = parseSegmentTimeline(xmlPullParser, j16, j12);
            } else {
                j16 = j17;
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentURL")) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(parseSegmentUrl(xmlPullParser));
                } else {
                    maybeSkipTag(xmlPullParser);
                }
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentList")) {
                break;
            }
            j17 = j16;
        }
        if (segmentList != null) {
            if (initialization == null) {
                initialization = segmentList.initialization;
            }
            if (segmentTimeline == null) {
                segmentTimeline = segmentList.segmentTimeline;
            }
            if (arrayList == null) {
                arrayList = segmentList.mediaSegments;
            }
        }
        return buildSegmentList(initialization, j16, j18, j21, j19, segmentTimeline, finalAvailabilityTimeOffset, arrayList, j15, j11);
    }

    public SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentTemplate segmentTemplate, List<Descriptor> list, long j11, long j12, long j13, long j14, long j15) throws XmlPullParserException, IOException {
        long j16;
        DashManifestParser dashManifestParser = this;
        long j17 = parseLong(xmlPullParser, "timescale", segmentTemplate != null ? segmentTemplate.timescale : 1L);
        long j18 = parseLong(xmlPullParser, "presentationTimeOffset", segmentTemplate != null ? segmentTemplate.presentationTimeOffset : 0L);
        long j19 = parseLong(xmlPullParser, TypedValues.TransitionType.S_DURATION, segmentTemplate != null ? segmentTemplate.duration : C2711C.TIME_UNSET);
        long j21 = parseLong(xmlPullParser, "startNumber", segmentTemplate != null ? segmentTemplate.startNumber : 1L);
        long lastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j13, j14);
        UrlTemplate urlTemplate = dashManifestParser.parseUrlTemplate(xmlPullParser, "media", segmentTemplate != null ? segmentTemplate.mediaTemplate : null);
        UrlTemplate urlTemplate2 = dashManifestParser.parseUrlTemplate(xmlPullParser, "initialization", segmentTemplate != null ? segmentTemplate.initializationTemplate : null);
        RangedUri initialization = null;
        List<SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
                j16 = j17;
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                j16 = j17;
                segmentTimeline = dashManifestParser.parseSegmentTimeline(xmlPullParser, j16, j12);
            } else {
                j16 = j17;
                maybeSkipTag(xmlPullParser);
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            dashManifestParser = this;
            finalAvailabilityTimeOffset = finalAvailabilityTimeOffset;
            lastSegmentNumberSupplementalProperty = lastSegmentNumberSupplementalProperty;
            j21 = j21;
            j18 = j18;
            j17 = j16;
        }
        if (segmentTemplate != null) {
            if (initialization == null) {
                initialization = segmentTemplate.initialization;
            }
            if (segmentTimeline == null) {
                segmentTimeline = segmentTemplate.segmentTimeline;
            }
        }
        return buildSegmentTemplate(initialization, j16, j18, j21, lastSegmentNumberSupplementalProperty, j19, segmentTimeline, finalAvailabilityTimeOffset, urlTemplate2, urlTemplate, j15, j11);
    }

    public List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xmlPullParser, long j11, long j12) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jAddSegmentTimelineElementsToList = 0;
        long j13 = -9223372036854775807L;
        boolean z11 = false;
        int i11 = 0;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, ExifInterface.LATITUDE_SOUTH)) {
                long j14 = parseLong(xmlPullParser, "t", C2711C.TIME_UNSET);
                if (z11) {
                    ArrayList arrayList2 = arrayList;
                    jAddSegmentTimelineElementsToList = addSegmentTimelineElementsToList(arrayList2, jAddSegmentTimelineElementsToList, j13, i11, j14);
                    arrayList = arrayList2;
                }
                if (j14 != C2711C.TIME_UNSET) {
                    jAddSegmentTimelineElementsToList = j14;
                }
                j13 = parseLong(xmlPullParser, "d", C2711C.TIME_UNSET);
                i11 = parseInt(xmlPullParser, "r", 0);
                z11 = true;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTimeline"));
        if (z11) {
            addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j13, i11, Util.scaleLargeTimestamp(j12, j11, 1000L));
        }
        return arrayList;
    }

    public RangedUri parseSegmentUrl(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "media", "mediaRange");
    }

    public ServiceDescriptionElement parseServiceDescription(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        float f11 = -3.4028235E38f;
        float f12 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Latency")) {
                j11 = parseLong(xmlPullParser, "target", C2711C.TIME_UNSET);
                j12 = parseLong(xmlPullParser, "min", C2711C.TIME_UNSET);
                j13 = parseLong(xmlPullParser, "max", C2711C.TIME_UNSET);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "PlaybackRate")) {
                f11 = parseFloat(xmlPullParser, "min", -3.4028235E38f);
                f12 = parseFloat(xmlPullParser, "max", -3.4028235E38f);
            }
            long j14 = j11;
            long j15 = j12;
            long j16 = j13;
            float f13 = f11;
            float f14 = f12;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ServiceDescription")) {
                return new ServiceDescriptionElement(j14, j15, j16, f13, f14);
            }
            j11 = j14;
            j12 = j15;
            j13 = j16;
            f11 = f13;
            f12 = f14;
        }
    }

    public DashManifestParser() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e11) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e11);
        }
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.hasData()) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (arrayList.get(i11).canReplace(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    @Nullable
    private static String getSampleMimeType(@Nullable String str, @Nullable String str2) {
        if (MimeTypes.isAudio(str)) {
            return MimeTypes.getAudioMediaMimeType(str2);
        }
        if (MimeTypes.isVideo(str)) {
            return MimeTypes.getVideoMediaMimeType(str2);
        }
        if (MimeTypes.isText(str) || MimeTypes.isImage(str)) {
            return str;
        }
        if (MimeTypes.APPLICATION_MP4.equals(str)) {
            String mediaMimeType = MimeTypes.getMediaMimeType(str2);
            if ("text/vtt".equals(mediaMimeType)) {
                return MimeTypes.APPLICATION_MP4VTT;
            }
            return mediaMimeType;
        }
        return null;
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
            int i11 = 1;
            while (i11 != 0) {
                xmlPullParser.next();
                if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                    i11++;
                } else if (XmlPullParserUtil.isEndTag(xmlPullParser)) {
                    i11--;
                }
            }
        }
    }

    public static Descriptor parseDescriptor(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String string = parseString(xmlPullParser, "schemeIdUri", "");
        String string2 = parseString(xmlPullParser, "value", null);
        String string3 = parseString(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return new Descriptor(string, string2, string3);
    }

    public static int parseDtsChannelConfiguration(XmlPullParser xmlPullParser) {
        int i11 = parseInt(xmlPullParser, "value", -1);
        if (i11 <= 0 || i11 >= 33) {
            return -1;
        }
        return i11;
    }

    public static int parseMpegChannelConfiguration(XmlPullParser xmlPullParser) {
        int i11 = parseInt(xmlPullParser, "value", -1);
        if (i11 >= 0) {
            int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
        }
        return -1;
    }

    public void parseAdaptationSetChild(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        maybeSkipTag(xmlPullParser);
    }

    public int parseAudioChannelConfiguration(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String string = parseString(xmlPullParser, "schemeIdUri", null);
        string.getClass();
        int dtsChannelConfiguration = -1;
        switch (string) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                dtsChannelConfiguration = parseDtsChannelConfiguration(xmlPullParser);
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                dtsChannelConfiguration = parseInt(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                dtsChannelConfiguration = parseDolbyChannelConfiguration(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                dtsChannelConfiguration = parseMpegChannelConfiguration(xmlPullParser);
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                dtsChannelConfiguration = parseDtsxChannelConfiguration(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        return dtsChannelConfiguration;
    }

    public byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!XmlPullParserUtil.isEndTag(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i11 = 0; i11 < xmlPullParser.getAttributeCount(); i11++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i11), xmlPullParser.getAttributeName(i11), xmlPullParser.getAttributeValue(i11));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public EventStream parseEventStream(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j11;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String string = parseString(xmlPullParser, "schemeIdUri", "");
        String string2 = parseString(xmlPullParser, "value", "");
        long j12 = parseLong(xmlPullParser, "timescale", 1L);
        long j13 = parseLong(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Event")) {
                j11 = j12;
                str = string2;
                str2 = string;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(parseEvent(xmlPullParser2, str2, str, j11, j13, byteArrayOutputStream));
            } else {
                j11 = j12;
                str = string2;
                str2 = string;
                xmlPullParser2 = xmlPullParser;
                maybeSkipTag(xmlPullParser2);
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "EventStream")) {
                break;
            }
            xmlPullParser = xmlPullParser2;
            string = str2;
            string2 = str;
            j12 = j11;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Pair pair = (Pair) arrayList.get(i11);
            jArr[i11] = ((Long) pair.first).longValue();
            eventMessageArr[i11] = (EventMessage) pair.second;
        }
        return buildEventStream(str2, str, j11, jArr, eventMessageArr);
    }

    public RangedUri parseInitialization(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", SessionDescription.ATTR_RANGE);
    }

    public UtcTimingElement parseUtcTiming(XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    private static long getFinalAvailabilityTimeOffset(long j11, long j12) {
        if (j12 != C2711C.TIME_UNSET) {
            j11 = j12;
        }
        if (j11 == Long.MAX_VALUE) {
            return C2711C.TIME_UNSET;
        }
        return j11;
    }
}
