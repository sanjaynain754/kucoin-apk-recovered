package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.hls.HlsTrackMetadataEntry;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import com.google.common.collect.Iterables;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String LOG_TAG = "HlsPlaylistParser";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PART = "#EXT-X-PART";
    private static final String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final String TAG_SKIP = "#EXT-X-SKIP";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_MAP = "MAP";
    private static final String TYPE_PART = "PART";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private final HlsMultivariantPlaylist multivariantPlaylist;

    @Nullable
    private final HlsMediaPlaylist previousMediaPlaylist;
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_VIDEO = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern REGEX_SUBTITLES = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern REGEX_CLOSED_CAPTIONS = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_CHANNELS = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_ATTR_DURATION = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_TARGET_DURATION = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_CAN_SKIP_UNTIL = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final Pattern REGEX_SKIPPED_SEGMENTS = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern REGEX_HOLD_BACK = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_HOLD_BACK = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_LAST_MSN = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern REGEX_LAST_PART = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_BYTERANGE_START = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE_LENGTH = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_PRELOAD_HINT_TYPE = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern REGEX_CHARACTERISTICS = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final Pattern REGEX_PRECISE = compileBooleanAttrPattern("PRECISE");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    public static class LineIterator {
        private final Queue<String> extraLines;

        @Nullable
        private String next;
        private final BufferedReader reader;

        public boolean hasNext() throws IOException {
            String strTrim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                this.next = (String) Assertions.checkNotNull(this.extraLines.poll());
                return true;
            }
            do {
                String line = this.reader.readLine();
                this.next = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.next = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        public String next() throws IOException {
            if (hasNext()) {
                String str = this.next;
                this.next = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public HlsPlaylistParser() {
        this(HlsMultivariantPlaylist.EMPTY, null);
    }

    private static DrmInitData getPlaylistProtectionSchemes(@Nullable String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i11 = 0; i11 < schemeDataArr.length; i11++) {
            schemeDataArr2[i11] = schemeDataArr[i11].copyWithData(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithAudioGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i11);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithSubtitleGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i11);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithVideoGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i11);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x031a A[PHI: r13
      0x031a: PHI (r13v7 java.lang.String) = (r13v5 java.lang.String), (r13v2 java.lang.String) binds: [B:117:0x0329, B:111:0x030d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:226:0x0608  */
    /* JADX WARN: Code duplicated, block: B:228:0x0615  */
    /* JADX WARN: Code duplicated, block: B:231:0x062b  */
    private static HlsMediaPlaylist parseMediaPlaylist(HlsMultivariantPlaylist hlsMultivariantPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist, LineIterator lineIterator, String str) throws IOException {
        HlsMediaPlaylist.Segment segment;
        int i11;
        long j11;
        long j12;
        long j13;
        HlsMediaPlaylist.Segment segment2;
        long j14;
        boolean z11;
        DrmInitData drmInitData;
        DrmInitData playlistProtectionSchemes;
        HlsMediaPlaylist.Segment segment3;
        hlsMultivariantPlaylist = hlsMultivariantPlaylist;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        boolean z12 = hlsMultivariantPlaylist.hasIndependentSegments;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HlsMediaPlaylist.ServerControl serverControl = new HlsMediaPlaylist.ServerControl(C2711C.TIME_UNSET, false, C2711C.TIME_UNSET, C2711C.TIME_UNSET, false);
        TreeMap treeMap = new TreeMap();
        boolean z13 = z12;
        long j15 = -9223372036854775807L;
        long doubleAttr = -9223372036854775807L;
        long j16 = 0;
        long j17 = 0;
        long jMsToUs = 0;
        long j18 = 0;
        long longAttr = 0;
        long timeSecondsToUs = 0;
        long j19 = 0;
        String str2 = "";
        String optionalStringAttr = str2;
        boolean optionalBooleanAttribute = false;
        String encryptionScheme = null;
        DrmInitData drmInitData2 = null;
        HlsMediaPlaylist.Part part = null;
        int i12 = 0;
        DrmInitData playlistProtectionSchemes2 = null;
        String str3 = null;
        long j21 = -1;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int i13 = 0;
        HlsMediaPlaylist.Segment segment4 = null;
        int i14 = 0;
        String stringAttr = null;
        long j22 = -1;
        boolean z17 = false;
        long intAttr = -9223372036854775807L;
        long j23 = 0;
        int intAttr2 = 1;
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList4.add(next);
            }
            if (next.startsWith(TAG_PLAYLIST_TYPE)) {
                String stringAttr2 = parseStringAttr(next, REGEX_PLAYLIST_TYPE, map);
                if ("VOD".equals(stringAttr2)) {
                    i12 = 1;
                } else if ("EVENT".equals(stringAttr2)) {
                    i12 = 2;
                }
            } else if (next.equals(TAG_IFRAME)) {
                z17 = true;
            } else {
                if (next.startsWith(TAG_START)) {
                    ArrayList arrayList5 = arrayList4;
                    serverControl = serverControl;
                    long doubleAttr2 = (long) (parseDoubleAttr(next, REGEX_TIME_OFFSET) * 1000000.0d);
                    optionalBooleanAttribute = parseOptionalBooleanAttribute(next, REGEX_PRECISE, false);
                    arrayList4 = arrayList5;
                    j15 = doubleAttr2;
                } else {
                    ArrayList arrayList6 = arrayList4;
                    serverControl = serverControl;
                    if (next.startsWith(TAG_SERVER_CONTROL)) {
                        serverControl = parseServerControl(next);
                        arrayList4 = arrayList6;
                    } else if (next.startsWith(TAG_PART_INF)) {
                        doubleAttr = (long) (parseDoubleAttr(next, REGEX_PART_TARGET_DURATION) * 1000000.0d);
                        arrayList4 = arrayList6;
                    } else if (next.startsWith(TAG_INIT_SEGMENT)) {
                        String stringAttr3 = parseStringAttr(next, REGEX_URI, map);
                        boolean z18 = optionalBooleanAttribute;
                        String optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, map);
                        if (optionalStringAttr2 != null) {
                            String[] strArrSplit = Util.split(optionalStringAttr2, "@");
                            j21 = Long.parseLong(strArrSplit[0]);
                            if (strArrSplit.length > 1) {
                                j16 = Long.parseLong(strArrSplit[1]);
                            }
                        }
                        long j24 = j21;
                        long j25 = j24 == j22 ? 0L : j16;
                        if (stringAttr != null && str3 == null) {
                            throw ParserException.createForMalformedManifest("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        HlsMediaPlaylist.Segment segment5 = new HlsMediaPlaylist.Segment(stringAttr3, j25, j24, stringAttr, str3);
                        String str4 = str3;
                        if (j24 != j22) {
                            j25 += j24;
                        }
                        str3 = str4;
                        arrayList4 = arrayList6;
                        segment4 = segment5;
                        j16 = j25;
                        j21 = j22;
                        serverControl = serverControl;
                        optionalBooleanAttribute = z18;
                    } else {
                        optionalBooleanAttribute = optionalBooleanAttribute;
                        arrayList4 = arrayList6;
                        str3 = str3;
                        stringAttr = stringAttr;
                        if (next.startsWith(TAG_TARGET_DURATION)) {
                            intAttr = 1000000 * ((long) parseIntAttr(next, REGEX_TARGET_DURATION));
                        } else {
                            if (next.startsWith(TAG_MEDIA_SEQUENCE)) {
                                longAttr = parseLongAttr(next, REGEX_MEDIA_SEQUENCE);
                                stringAttr = stringAttr;
                                str3 = str3;
                                j23 = longAttr;
                            } else if (next.startsWith(TAG_VERSION)) {
                                intAttr2 = parseIntAttr(next, REGEX_VERSION);
                            } else {
                                if (next.startsWith(TAG_DEFINE)) {
                                    String optionalStringAttr3 = parseOptionalStringAttr(next, REGEX_IMPORT, map);
                                    if (optionalStringAttr3 != null) {
                                        String str5 = hlsMultivariantPlaylist.variableDefinitions.get(optionalStringAttr3);
                                        if (str5 != null) {
                                            map.put(optionalStringAttr3, str5);
                                        }
                                    } else {
                                        map.put(parseStringAttr(next, REGEX_NAME, map), parseStringAttr(next, REGEX_VALUE, map));
                                    }
                                } else if (next.startsWith(TAG_MEDIA_DURATION)) {
                                    timeSecondsToUs = parseTimeSecondsToUs(next, REGEX_MEDIA_DURATION);
                                    optionalStringAttr = parseOptionalStringAttr(next, REGEX_MEDIA_TITLE, str2, map);
                                } else {
                                    String str6 = str2;
                                    if (next.startsWith(TAG_SKIP)) {
                                        int intAttr3 = parseIntAttr(next, REGEX_SKIPPED_SEGMENTS);
                                        Assertions.checkState(hlsMediaPlaylist2 != null && arrayList.isEmpty());
                                        str2 = str6;
                                        int i15 = (int) (j23 - ((HlsMediaPlaylist) Util.castNonNull(hlsMediaPlaylist2)).mediaSequence);
                                        int i16 = intAttr3 + i15;
                                        if (i15 < 0 || i16 > hlsMediaPlaylist2.segments.size()) {
                                            throw new DeltaUpdateException();
                                        }
                                        stringAttr = stringAttr;
                                        str3 = str3;
                                        long j26 = j17;
                                        while (i15 < i16) {
                                            HlsMediaPlaylist.Segment segmentCopyWith = hlsMediaPlaylist2.segments.get(i15);
                                            int i17 = i15;
                                            if (j23 != hlsMediaPlaylist2.mediaSequence) {
                                                segmentCopyWith = segmentCopyWith.copyWith(j26, (hlsMediaPlaylist2.discontinuitySequence - i13) + segmentCopyWith.relativeDiscontinuitySequence);
                                            }
                                            arrayList.add(segmentCopyWith);
                                            j18 = j26 + segmentCopyWith.durationUs;
                                            long j27 = segmentCopyWith.byteRangeLength;
                                            if (j27 != j22) {
                                                j16 = segmentCopyWith.byteRangeOffset + j27;
                                            }
                                            int i18 = segmentCopyWith.relativeDiscontinuitySequence;
                                            HlsMediaPlaylist.Segment segment6 = segmentCopyWith.initializationSegment;
                                            drmInitData2 = segmentCopyWith.drmInitData;
                                            String str7 = segmentCopyWith.fullSegmentEncryptionKeyUri;
                                            String str8 = segmentCopyWith.encryptionIV;
                                            int i19 = i16;
                                            if (str8 == null || !str8.equals(Long.toHexString(longAttr))) {
                                                str3 = segmentCopyWith.encryptionIV;
                                            }
                                            longAttr++;
                                            i14 = i18;
                                            segment4 = segment6;
                                            stringAttr = str7;
                                            j26 = j18;
                                            i15 = i17 + 1;
                                            i16 = i19;
                                        }
                                        hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                        j17 = j26;
                                    } else {
                                        str2 = str6;
                                        if (next.startsWith(TAG_KEY)) {
                                            String stringAttr4 = parseStringAttr(next, REGEX_METHOD, map);
                                            String optionalStringAttr4 = parseOptionalStringAttr(next, REGEX_KEYFORMAT, "identity", map);
                                            if (METHOD_NONE.equals(stringAttr4)) {
                                                treeMap.clear();
                                                drmInitData2 = null;
                                                str3 = null;
                                                stringAttr = null;
                                            } else {
                                                String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_IV, map);
                                                if (!"identity".equals(optionalStringAttr4)) {
                                                    if (encryptionScheme == null) {
                                                        encryptionScheme = parseEncryptionScheme(stringAttr4);
                                                    }
                                                    DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, optionalStringAttr4, map);
                                                    if (drmSchemeData != null) {
                                                        treeMap.put(optionalStringAttr4, drmSchemeData);
                                                        str3 = optionalStringAttr5;
                                                        drmInitData2 = null;
                                                        stringAttr = null;
                                                    } else {
                                                        str3 = optionalStringAttr5;
                                                        stringAttr = null;
                                                    }
                                                } else if (METHOD_AES_128.equals(stringAttr4)) {
                                                    stringAttr = parseStringAttr(next, REGEX_URI, map);
                                                    str3 = optionalStringAttr5;
                                                } else {
                                                    str3 = optionalStringAttr5;
                                                    stringAttr = null;
                                                }
                                            }
                                            hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                        } else {
                                            if (next.startsWith(TAG_BYTERANGE)) {
                                                String[] strArrSplit2 = Util.split(parseStringAttr(next, REGEX_BYTERANGE, map), "@");
                                                j21 = Long.parseLong(strArrSplit2[0]);
                                                if (strArrSplit2.length > 1) {
                                                    j16 = Long.parseLong(strArrSplit2[1]);
                                                }
                                            } else if (next.startsWith(TAG_DISCONTINUITY_SEQUENCE)) {
                                                i13 = Integer.parseInt(next.substring(next.indexOf(58) + 1));
                                                hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                stringAttr = stringAttr;
                                                str3 = str3;
                                                serverControl = serverControl;
                                                optionalBooleanAttribute = optionalBooleanAttribute;
                                                arrayList4 = arrayList4;
                                                z16 = true;
                                            } else if (next.equals(TAG_DISCONTINUITY)) {
                                                i14++;
                                            } else if (next.startsWith(TAG_PROGRAM_DATE_TIME)) {
                                                if (jMsToUs == 0) {
                                                    jMsToUs = Util.msToUs(Util.parseXsDateTime(next.substring(next.indexOf(58) + 1))) - j17;
                                                }
                                            } else if (next.equals(TAG_GAP)) {
                                                hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                stringAttr = stringAttr;
                                                str3 = str3;
                                                serverControl = serverControl;
                                                optionalBooleanAttribute = optionalBooleanAttribute;
                                                arrayList4 = arrayList4;
                                                z14 = true;
                                            } else if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                                                hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                stringAttr = stringAttr;
                                                str3 = str3;
                                                serverControl = serverControl;
                                                optionalBooleanAttribute = optionalBooleanAttribute;
                                                arrayList4 = arrayList4;
                                                z13 = true;
                                            } else if (next.equals(TAG_ENDLIST)) {
                                                hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                stringAttr = stringAttr;
                                                str3 = str3;
                                                serverControl = serverControl;
                                                optionalBooleanAttribute = optionalBooleanAttribute;
                                                arrayList4 = arrayList4;
                                                z15 = true;
                                            } else {
                                                if (next.startsWith(TAG_RENDITION_REPORT)) {
                                                    treeMap = treeMap;
                                                    arrayList3.add(new HlsMediaPlaylist.RenditionReport(Uri.parse(UriUtil.resolve(str, parseStringAttr(next, REGEX_URI, map))), parseOptionalLongAttr(next, REGEX_LAST_MSN, j22), parseOptionalIntAttr(next, REGEX_LAST_PART, -1)));
                                                } else {
                                                    treeMap = treeMap;
                                                    if (!next.startsWith(TAG_PRELOAD_HINT)) {
                                                        j11 = longAttr;
                                                        if (next.startsWith(TAG_PART)) {
                                                            String segmentEncryptionIV = getSegmentEncryptionIV(j11, stringAttr, str3);
                                                            String stringAttr5 = parseStringAttr(next, REGEX_URI, map);
                                                            long doubleAttr3 = (long) (parseDoubleAttr(next, REGEX_ATTR_DURATION) * 1000000.0d);
                                                            boolean optionalBooleanAttribute2 = parseOptionalBooleanAttribute(next, REGEX_INDEPENDENT, false) | (z13 && arrayList2.isEmpty());
                                                            boolean optionalBooleanAttribute3 = parseOptionalBooleanAttribute(next, REGEX_GAP, false);
                                                            String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, map);
                                                            if (optionalStringAttr6 != null) {
                                                                String[] strArrSplit3 = Util.split(optionalStringAttr6, "@");
                                                                long j28 = Long.parseLong(strArrSplit3[0]);
                                                                if (strArrSplit3.length > 1) {
                                                                    j19 = Long.parseLong(strArrSplit3[1]);
                                                                }
                                                                j12 = j28;
                                                            } else {
                                                                j12 = -1;
                                                            }
                                                            long j29 = j12 == -1 ? 0L : j19;
                                                            if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                                DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                drmInitData2 = new DrmInitData(encryptionScheme, schemeDataArr);
                                                                if (playlistProtectionSchemes2 == null) {
                                                                    playlistProtectionSchemes2 = getPlaylistProtectionSchemes(encryptionScheme, schemeDataArr);
                                                                }
                                                            }
                                                            DrmInitData drmInitData3 = drmInitData2;
                                                            HlsMediaPlaylist.Segment segment7 = segment4;
                                                            int i21 = i14;
                                                            arrayList2.add(new HlsMediaPlaylist.Part(stringAttr5, segment4, doubleAttr3, i14, j18, drmInitData3, stringAttr, segmentEncryptionIV, j29, j12, optionalBooleanAttribute3, optionalBooleanAttribute2, false));
                                                            j18 += doubleAttr3;
                                                            if (j12 != -1) {
                                                                j29 += j12;
                                                            }
                                                            j19 = j29;
                                                            segment4 = segment7;
                                                            stringAttr = stringAttr;
                                                            longAttr = j11;
                                                            i14 = i21;
                                                            drmInitData2 = drmInitData3;
                                                        } else {
                                                            segment = segment4;
                                                            i11 = i14;
                                                            if (next.startsWith(RunnableC33958ua.f72251f)) {
                                                                stringAttr = stringAttr;
                                                                hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                                segment4 = segment;
                                                                str3 = str3;
                                                                longAttr = j11;
                                                                optionalStringAttr = optionalStringAttr;
                                                                timeSecondsToUs = timeSecondsToUs;
                                                                j17 = j17;
                                                                j16 = j16;
                                                                serverControl = serverControl;
                                                                optionalBooleanAttribute = optionalBooleanAttribute;
                                                                arrayList4 = arrayList4;
                                                                treeMap = treeMap;
                                                                j22 = -1;
                                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                                i14 = i11;
                                                            } else {
                                                                long j31 = j17;
                                                                String segmentEncryptionIV2 = getSegmentEncryptionIV(j11, stringAttr, str3);
                                                                longAttr = j11 + 1;
                                                                String strReplaceVariableReferences = replaceVariableReferences(next, map);
                                                                HlsMediaPlaylist.Segment segment8 = (HlsMediaPlaylist.Segment) map2.get(strReplaceVariableReferences);
                                                                if (j21 == -1) {
                                                                    segment2 = segment8;
                                                                    j14 = 0;
                                                                } else {
                                                                    if (z17 && segment == null && segment8 == null) {
                                                                        j13 = j16;
                                                                        segment8 = new HlsMediaPlaylist.Segment(strReplaceVariableReferences, 0L, j13, null, null);
                                                                        map2.put(strReplaceVariableReferences, segment8);
                                                                    } else {
                                                                        j13 = j16;
                                                                    }
                                                                    segment2 = segment8;
                                                                    j14 = j13;
                                                                }
                                                                if (drmInitData2 != null || treeMap.isEmpty()) {
                                                                    z11 = false;
                                                                } else {
                                                                    z11 = false;
                                                                    DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                    drmInitData2 = new DrmInitData(encryptionScheme, schemeDataArr2);
                                                                    if (playlistProtectionSchemes2 == null) {
                                                                        playlistProtectionSchemes = getPlaylistProtectionSchemes(encryptionScheme, schemeDataArr2);
                                                                        drmInitData = drmInitData2;
                                                                    }
                                                                    if (segment != null) {
                                                                        segment3 = segment;
                                                                    } else {
                                                                        segment3 = segment2;
                                                                    }
                                                                    long j32 = timeSecondsToUs;
                                                                    stringAttr = stringAttr;
                                                                    arrayList.add(new HlsMediaPlaylist.Segment(strReplaceVariableReferences, segment3, optionalStringAttr, j32, i11, j31, drmInitData, stringAttr, segmentEncryptionIV2, j14, j21, z14, arrayList2));
                                                                    j18 = j31 + j32;
                                                                    arrayList2 = new ArrayList();
                                                                    if (j21 != -1) {
                                                                        j14 += j21;
                                                                    }
                                                                    j16 = j14;
                                                                    segment4 = segment;
                                                                    playlistProtectionSchemes2 = playlistProtectionSchemes;
                                                                    z14 = z11;
                                                                    optionalStringAttr = str2;
                                                                    i14 = i11;
                                                                    drmInitData2 = drmInitData;
                                                                    timeSecondsToUs = 0;
                                                                    j17 = j18;
                                                                    j21 = -1;
                                                                }
                                                                drmInitData = drmInitData2;
                                                                playlistProtectionSchemes = playlistProtectionSchemes2;
                                                                if (segment != null) {
                                                                    segment3 = segment;
                                                                } else {
                                                                    segment3 = segment2;
                                                                }
                                                                long j33 = timeSecondsToUs;
                                                                stringAttr = stringAttr;
                                                                arrayList.add(new HlsMediaPlaylist.Segment(strReplaceVariableReferences, segment3, optionalStringAttr, j33, i11, j31, drmInitData, stringAttr, segmentEncryptionIV2, j14, j21, z14, arrayList2));
                                                                j18 = j31 + j33;
                                                                arrayList2 = new ArrayList();
                                                                if (j21 != -1) {
                                                                    j14 += j21;
                                                                }
                                                                j16 = j14;
                                                                segment4 = segment;
                                                                playlistProtectionSchemes2 = playlistProtectionSchemes;
                                                                z14 = z11;
                                                                optionalStringAttr = str2;
                                                                i14 = i11;
                                                                drmInitData2 = drmInitData;
                                                                timeSecondsToUs = 0;
                                                                j17 = j18;
                                                                j21 = -1;
                                                            }
                                                        }
                                                        j22 = -1;
                                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    } else if (part == null && TYPE_PART.equals(parseStringAttr(next, REGEX_PRELOAD_HINT_TYPE, map))) {
                                                        String stringAttr6 = parseStringAttr(next, REGEX_URI, map);
                                                        long optionalLongAttr = parseOptionalLongAttr(next, REGEX_BYTERANGE_START, -1L);
                                                        long optionalLongAttr2 = parseOptionalLongAttr(next, REGEX_BYTERANGE_LENGTH, -1L);
                                                        long j34 = longAttr;
                                                        String segmentEncryptionIV3 = getSegmentEncryptionIV(j34, stringAttr, str3);
                                                        if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                            DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            drmInitData2 = new DrmInitData(encryptionScheme, schemeDataArr3);
                                                            if (playlistProtectionSchemes2 == null) {
                                                                playlistProtectionSchemes2 = getPlaylistProtectionSchemes(encryptionScheme, schemeDataArr3);
                                                            }
                                                        }
                                                        DrmInitData drmInitData4 = drmInitData2;
                                                        if (optionalLongAttr == -1 || optionalLongAttr2 != -1) {
                                                            part = new HlsMediaPlaylist.Part(stringAttr6, segment4, 0L, i14, j18, drmInitData4, stringAttr, segmentEncryptionIV3, optionalLongAttr != -1 ? optionalLongAttr : 0L, optionalLongAttr2, false, false, true);
                                                        }
                                                        hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                        stringAttr = stringAttr;
                                                        str3 = str3;
                                                        longAttr = j34;
                                                        drmInitData2 = drmInitData4;
                                                        serverControl = serverControl;
                                                        optionalBooleanAttribute = optionalBooleanAttribute;
                                                        arrayList4 = arrayList4;
                                                        treeMap = treeMap;
                                                        j22 = -1;
                                                    }
                                                }
                                                segment = segment4;
                                                i11 = i14;
                                                j11 = longAttr;
                                                hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                segment4 = segment;
                                                str3 = str3;
                                                longAttr = j11;
                                                optionalStringAttr = optionalStringAttr;
                                                timeSecondsToUs = timeSecondsToUs;
                                                j17 = j17;
                                                j16 = j16;
                                                serverControl = serverControl;
                                                optionalBooleanAttribute = optionalBooleanAttribute;
                                                arrayList4 = arrayList4;
                                                treeMap = treeMap;
                                                j22 = -1;
                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                i14 = i11;
                                            }
                                            hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                        }
                                    }
                                }
                                treeMap = treeMap;
                                segment = segment4;
                                i11 = i14;
                                j11 = longAttr;
                                hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                segment4 = segment;
                                str3 = str3;
                                longAttr = j11;
                                optionalStringAttr = optionalStringAttr;
                                timeSecondsToUs = timeSecondsToUs;
                                j17 = j17;
                                j16 = j16;
                                serverControl = serverControl;
                                optionalBooleanAttribute = optionalBooleanAttribute;
                                arrayList4 = arrayList4;
                                treeMap = treeMap;
                                j22 = -1;
                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                i14 = i11;
                            }
                            serverControl = serverControl;
                            optionalBooleanAttribute = optionalBooleanAttribute;
                            arrayList4 = arrayList4;
                        }
                        stringAttr = stringAttr;
                        str3 = str3;
                        serverControl = serverControl;
                        optionalBooleanAttribute = optionalBooleanAttribute;
                        arrayList4 = arrayList4;
                    }
                }
                serverControl = serverControl;
            }
        }
        boolean z19 = optionalBooleanAttribute;
        ArrayList arrayList7 = arrayList4;
        HlsMediaPlaylist.ServerControl serverControl2 = serverControl;
        HashMap map3 = new HashMap();
        for (int i22 = 0; i22 < arrayList3.size(); i22++) {
            HlsMediaPlaylist.RenditionReport renditionReport = (HlsMediaPlaylist.RenditionReport) arrayList3.get(i22);
            long size = renditionReport.lastMediaSequence;
            if (size == -1) {
                size = (j23 + ((long) arrayList.size())) - (arrayList2.isEmpty() ? 1L : 0L);
            }
            int size2 = renditionReport.lastPartIndex;
            if (size2 == -1 && doubleAttr != C2711C.TIME_UNSET) {
                size2 = (arrayList2.isEmpty() ? ((HlsMediaPlaylist.Segment) Iterables.getLast(arrayList)).parts : arrayList2).size() - 1;
            }
            Uri uri = renditionReport.playlistUri;
            map3.put(uri, new HlsMediaPlaylist.RenditionReport(uri, size, size2));
        }
        if (part != null) {
            arrayList2.add(part);
        }
        return new HlsMediaPlaylist(i12, str, arrayList7, j15, z19, jMsToUs, z16, i13, j23, intAttr2, intAttr, doubleAttr, z13, z15, jMsToUs != 0, playlistProtectionSchemes2, arrayList, arrayList2, serverControl2, map3);
    }

    @Nullable
    private static String parseOptionalStringAttr(String str, Pattern pattern, Map<String, String> map) {
        return parseOptionalStringAttr(str, pattern, null, map);
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z11, int i11) throws IOException {
        while (i11 != -1 && Character.isWhitespace(i11) && (z11 || !Util.isLinebreak(i11))) {
            i11 = bufferedReader.read();
        }
        return i11;
    }

    public HlsPlaylistParser(HlsMultivariantPlaylist hlsMultivariantPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    @Nullable
    private static String getSegmentEncryptionIV(long j11, @Nullable String str, @Nullable String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j11);
    }

    private static double parseDoubleAttr(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    @Nullable
    private static DrmInitData.SchemeData parseDrmSchemeData(String str, String str2, Map<String, String> map) throws ParserException {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, "1", map);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String stringAttr = parseStringAttr(str, REGEX_URI, map);
            return new DrmInitData.SchemeData(C2711C.WIDEVINE_UUID, MimeTypes.VIDEO_MP4, Base64.decode(stringAttr.substring(stringAttr.indexOf(44)), 0));
        }
        if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return new DrmInitData.SchemeData(C2711C.WIDEVINE_UUID, "hls", Util.getUtf8Bytes(str));
        }
        if (!KEYFORMAT_PLAYREADY.equals(str2) || !"1".equals(optionalStringAttr)) {
            return null;
        }
        String stringAttr2 = parseStringAttr(str, REGEX_URI, map);
        byte[] bArrDecode = Base64.decode(stringAttr2.substring(stringAttr2.indexOf(44)), 0);
        UUID uuid = C2711C.PLAYREADY_UUID;
        return new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, PsshAtomUtil.buildPsshAtom(uuid, bArrDecode));
    }

    private static String parseEncryptionScheme(String str) {
        return (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) ? C2711C.CENC_TYPE_cenc : C2711C.CENC_TYPE_cbcs;
    }

    private static int parseIntAttr(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    private static long parseLongAttr(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:152:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x012e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0135  */
    /* JADX WARN: Code duplicated, block: B:47:0x0152  */
    /* JADX WARN: Code duplicated, block: B:49:0x015f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0165  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:80:0x02ee  */
    /* JADX WARN: Multi-variable type inference failed */
    private static HlsMultivariantPlaylist parseMultivariantPlaylist(LineIterator lineIterator, String str) throws IOException {
        ArrayList arrayList;
        String mediaMimeType;
        int i11;
        String str2;
        String mediaMimeType2;
        int i12;
        ArrayList arrayList2;
        int i13;
        int i14;
        String optionalStringAttr;
        float f11;
        Uri uriResolveToUri;
        Uri uri;
        ArrayList arrayList3;
        String str3 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z11 = false;
        boolean zContains = false;
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList11.add(next);
            }
            boolean zStartsWith = next.startsWith(TAG_I_FRAME_STREAM_INF);
            if (next.startsWith(TAG_DEFINE)) {
                map2.put(parseStringAttr(next, REGEX_NAME, map2), parseStringAttr(next, REGEX_VALUE, map2));
            } else {
                if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                    arrayList2 = arrayList11;
                    z11 = true;
                } else if (next.startsWith(TAG_MEDIA)) {
                    arrayList9.add(next);
                } else if (next.startsWith(TAG_SESSION_KEY)) {
                    DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr(next, REGEX_KEYFORMAT, "identity", map2), map2);
                    if (drmSchemeData != null) {
                        arrayList10.add(new DrmInitData(parseEncryptionScheme(parseStringAttr(next, REGEX_METHOD, map2)), drmSchemeData));
                    }
                } else if (next.startsWith(TAG_STREAM_INF) || zStartsWith) {
                    zContains |= next.contains(ATTR_CLOSED_CAPTIONS_NONE);
                    int i15 = zStartsWith ? 16384 : 0;
                    int intAttr = parseIntAttr(next, REGEX_BANDWIDTH);
                    boolean z12 = z11;
                    int optionalIntAttr = parseOptionalIntAttr(next, REGEX_AVERAGE_BANDWIDTH, -1);
                    String optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_CODECS, map2);
                    String optionalStringAttr3 = parseOptionalStringAttr(next, REGEX_RESOLUTION, map2);
                    if (optionalStringAttr3 != null) {
                        arrayList2 = arrayList11;
                        String[] strArrSplit = Util.split(optionalStringAttr3, "x");
                        i14 = Integer.parseInt(strArrSplit[0]);
                        i13 = Integer.parseInt(strArrSplit[1]);
                        if (i14 <= 0 || i13 <= 0) {
                        }
                        optionalStringAttr = parseOptionalStringAttr(next, REGEX_FRAME_RATE, map2);
                        if (optionalStringAttr != null) {
                            f11 = Float.parseFloat(optionalStringAttr);
                        } else {
                            f11 = -1.0f;
                        }
                        String optionalStringAttr4 = parseOptionalStringAttr(next, REGEX_VIDEO, map2);
                        String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_AUDIO, map2);
                        String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map2);
                        String optionalStringAttr7 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map2);
                        if (zStartsWith) {
                            uriResolveToUri = UriUtil.resolveToUri(str3, parseStringAttr(next, REGEX_URI, map2));
                        } else {
                            if (lineIterator.hasNext()) {
                                throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            uriResolveToUri = UriUtil.resolveToUri(str3, replaceVariableReferences(lineIterator.next(), map2));
                        }
                        uri = uriResolveToUri;
                        arrayList4.add(new HlsMultivariantPlaylist.Variant(uri, new Format.Builder().setId(arrayList4.size()).setContainerMimeType(MimeTypes.APPLICATION_M3U8).setCodecs(optionalStringAttr2).setAverageBitrate(optionalIntAttr).setPeakBitrate(intAttr).setWidth(i14).setHeight(i13).setFrameRate(f11).setRoleFlags(i15).build(), optionalStringAttr4, optionalStringAttr5, optionalStringAttr6, optionalStringAttr7));
                        arrayList3 = (ArrayList) map.get(uri);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map.put(uri, arrayList3);
                        }
                        arrayList3.add(new HlsTrackMetadataEntry.VariantInfo(optionalIntAttr, intAttr, optionalStringAttr4, optionalStringAttr5, optionalStringAttr6, optionalStringAttr7));
                        z11 = z12;
                    } else {
                        arrayList2 = arrayList11;
                    }
                    i13 = -1;
                    i14 = -1;
                    optionalStringAttr = parseOptionalStringAttr(next, REGEX_FRAME_RATE, map2);
                    if (optionalStringAttr != null) {
                        f11 = Float.parseFloat(optionalStringAttr);
                    } else {
                        f11 = -1.0f;
                    }
                    String optionalStringAttr8 = parseOptionalStringAttr(next, REGEX_VIDEO, map2);
                    String optionalStringAttr9 = parseOptionalStringAttr(next, REGEX_AUDIO, map2);
                    String optionalStringAttr10 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map2);
                    String optionalStringAttr11 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map2);
                    if (zStartsWith) {
                        uriResolveToUri = UriUtil.resolveToUri(str3, parseStringAttr(next, REGEX_URI, map2));
                    } else {
                        if (lineIterator.hasNext()) {
                            throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriResolveToUri = UriUtil.resolveToUri(str3, replaceVariableReferences(lineIterator.next(), map2));
                    }
                    uri = uriResolveToUri;
                    arrayList4.add(new HlsMultivariantPlaylist.Variant(uri, new Format.Builder().setId(arrayList4.size()).setContainerMimeType(MimeTypes.APPLICATION_M3U8).setCodecs(optionalStringAttr2).setAverageBitrate(optionalIntAttr).setPeakBitrate(intAttr).setWidth(i14).setHeight(i13).setFrameRate(f11).setRoleFlags(i15).build(), optionalStringAttr8, optionalStringAttr9, optionalStringAttr10, optionalStringAttr11));
                    arrayList3 = (ArrayList) map.get(uri);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        map.put(uri, arrayList3);
                    }
                    arrayList3.add(new HlsTrackMetadataEntry.VariantInfo(optionalIntAttr, intAttr, optionalStringAttr8, optionalStringAttr9, optionalStringAttr10, optionalStringAttr11));
                    z11 = z12;
                }
                arrayList10 = arrayList10;
                arrayList11 = arrayList2;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
            }
            arrayList2 = arrayList11;
            arrayList10 = arrayList10;
            arrayList11 = arrayList2;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
        }
        ArrayList arrayList12 = arrayList6;
        ArrayList arrayList13 = arrayList7;
        boolean z13 = z11;
        ArrayList arrayList14 = arrayList10;
        ArrayList arrayList15 = arrayList11;
        int i16 = 1;
        ArrayList arrayList16 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i17 = 0;
        while (i17 < arrayList4.size()) {
            HlsMultivariantPlaylist.Variant variant = (HlsMultivariantPlaylist.Variant) arrayList4.get(i17);
            if (hashSet.add(variant.url)) {
                Assertions.checkState(variant.format.metadata == null ? i16 : 0);
                i12 = i16;
                Metadata.Entry[] entryArr = new Metadata.Entry[i12];
                entryArr[0] = new HlsTrackMetadataEntry(null, null, (List) Assertions.checkNotNull((ArrayList) map.get(variant.url)));
                arrayList16.add(variant.copyWithFormat(variant.format.buildUpon().setMetadata(new Metadata(entryArr)).build()));
            } else {
                i12 = i16;
            }
            i17 += i12;
            i16 = i12;
        }
        ArrayList arrayList17 = null;
        Format formatBuild = null;
        int i18 = 0;
        while (i18 < arrayList9.size()) {
            String str4 = (String) arrayList9.get(i18);
            String stringAttr = parseStringAttr(str4, REGEX_GROUP_ID, map2);
            String stringAttr2 = parseStringAttr(str4, REGEX_NAME, map2);
            Format.Builder language = new Format.Builder().setId(stringAttr + C33844oi.f71346o + stringAttr2).setLabel(stringAttr2).setContainerMimeType(MimeTypes.APPLICATION_M3U8).setSelectionFlags(parseSelectionFlags(str4)).setRoleFlags(parseRoleFlags(str4, map2)).setLanguage(parseOptionalStringAttr(str4, REGEX_LANGUAGE, map2));
            String optionalStringAttr12 = parseOptionalStringAttr(str4, REGEX_URI, map2);
            Uri uriResolveToUri2 = optionalStringAttr12 == null ? null : UriUtil.resolveToUri(str3, optionalStringAttr12);
            ArrayList arrayList18 = arrayList17;
            Metadata metadata = new Metadata(new HlsTrackMetadataEntry(stringAttr, stringAttr2, Collections.EMPTY_LIST));
            String stringAttr3 = parseStringAttr(str4, REGEX_TYPE, map2);
            stringAttr3.getClass();
            switch (stringAttr3) {
                case "SUBTITLES":
                    arrayList = arrayList12;
                    HlsMultivariantPlaylist.Variant variantWithSubtitleGroup = getVariantWithSubtitleGroup(arrayList4, stringAttr);
                    if (variantWithSubtitleGroup != null) {
                        String codecsOfType = Util.getCodecsOfType(variantWithSubtitleGroup.format.codecs, 3);
                        language.setCodecs(codecsOfType);
                        mediaMimeType = MimeTypes.getMediaMimeType(codecsOfType);
                    } else {
                        mediaMimeType = null;
                    }
                    if (mediaMimeType == null) {
                        mediaMimeType = "text/vtt";
                    }
                    language.setSampleMimeType(mediaMimeType).setMetadata(metadata);
                    if (uriResolveToUri2 != null) {
                        HlsMultivariantPlaylist.Rendition rendition = new HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2);
                        arrayList13 = arrayList13;
                        arrayList13.add(rendition);
                    } else {
                        arrayList13 = arrayList13;
                        Log.m2961w(LOG_TAG, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                    }
                    arrayList17 = arrayList18;
                    break;
                case "CLOSED-CAPTIONS":
                    arrayList = arrayList12;
                    String stringAttr4 = parseStringAttr(str4, REGEX_INSTREAM_ID, map2);
                    if (stringAttr4.startsWith("CC")) {
                        i11 = Integer.parseInt(stringAttr4.substring(2));
                        str2 = MimeTypes.APPLICATION_CEA608;
                    } else {
                        i11 = Integer.parseInt(stringAttr4.substring(7));
                        str2 = MimeTypes.APPLICATION_CEA708;
                    }
                    ArrayList arrayList19 = arrayList18 == null ? new ArrayList() : arrayList18;
                    language.setSampleMimeType(str2).setAccessibilityChannel(i11);
                    arrayList19.add(language.build());
                    arrayList17 = arrayList19;
                    arrayList13 = arrayList13;
                    break;
                case "AUDIO":
                    HlsMultivariantPlaylist.Variant variantWithAudioGroup = getVariantWithAudioGroup(arrayList4, stringAttr);
                    if (variantWithAudioGroup != null) {
                        String codecsOfType2 = Util.getCodecsOfType(variantWithAudioGroup.format.codecs, 1);
                        language.setCodecs(codecsOfType2);
                        mediaMimeType2 = MimeTypes.getMediaMimeType(codecsOfType2);
                    } else {
                        mediaMimeType2 = null;
                    }
                    String optionalStringAttr13 = parseOptionalStringAttr(str4, REGEX_CHANNELS, map2);
                    if (optionalStringAttr13 != null) {
                        language.setChannelCount(Integer.parseInt(Util.splitAtFirst(optionalStringAttr13, "/")[0]));
                        if (MimeTypes.AUDIO_E_AC3.equals(mediaMimeType2) && optionalStringAttr13.endsWith("/JOC")) {
                            language.setCodecs(MimeTypes.CODEC_E_AC3_JOC);
                            mediaMimeType2 = MimeTypes.AUDIO_E_AC3_JOC;
                        }
                    }
                    language.setSampleMimeType(mediaMimeType2);
                    if (uriResolveToUri2 == null) {
                        arrayList = arrayList12;
                        if (variantWithAudioGroup != null) {
                            formatBuild = language.build();
                            arrayList13 = arrayList13;
                            arrayList17 = arrayList18;
                        }
                        break;
                    } else {
                        language.setMetadata(metadata);
                        arrayList = arrayList12;
                        arrayList.add(new HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2));
                    }
                    arrayList17 = arrayList18;
                    break;
                case "VIDEO":
                    HlsMultivariantPlaylist.Variant variantWithVideoGroup = getVariantWithVideoGroup(arrayList4, stringAttr);
                    if (variantWithVideoGroup != null) {
                        Format format = variantWithVideoGroup.format;
                        String codecsOfType3 = Util.getCodecsOfType(format.codecs, 2);
                        language.setCodecs(codecsOfType3).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType3)).setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate);
                    }
                    if (uriResolveToUri2 != null) {
                        language.setMetadata(metadata);
                        arrayList5.add(new HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2));
                        break;
                    }
                default:
                    arrayList = arrayList12;
                    arrayList17 = arrayList18;
                    break;
            }
            i18++;
            arrayList12 = arrayList;
            arrayList13 = arrayList13;
            str3 = str;
        }
        return new HlsMultivariantPlaylist(str, arrayList15, arrayList16, arrayList5, arrayList12, arrayList13, arrayList8, formatBuild, zContains ? Collections.EMPTY_LIST : arrayList17, z13, map2, arrayList14);
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) Assertions.checkNotNull(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map);
    }

    private static int parseRoleFlags(String str, Map<String, String> map) {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map);
        if (TextUtils.isEmpty(optionalStringAttr)) {
            return 0;
        }
        String[] strArrSplit = Util.split(optionalStringAttr, ",");
        int i11 = Util.contains(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
        if (Util.contains(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
            i11 |= 4096;
        }
        if (Util.contains(strArrSplit, "public.accessibility.describes-music-and-sound")) {
            i11 |= 1024;
        }
        return Util.contains(strArrSplit, "public.easy-to-read") ? i11 | 8192 : i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int parseSelectionFlags(String str) {
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false);
        ?? r11 = optionalBooleanAttribute;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false)) {
            r11 = (optionalBooleanAttribute ? 1 : 0) | 2;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false) ? r11 | 4 : r11;
    }

    private static HlsMediaPlaylist.ServerControl parseServerControl(String str) {
        double optionalDoubleAttr = parseOptionalDoubleAttr(str, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d);
        long j11 = C2711C.TIME_UNSET;
        long j12 = optionalDoubleAttr == -9.223372036854776E18d ? -9223372036854775807L : (long) (optionalDoubleAttr * 1000000.0d);
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_CAN_SKIP_DATE_RANGES, false);
        double optionalDoubleAttr2 = parseOptionalDoubleAttr(str, REGEX_HOLD_BACK, -9.223372036854776E18d);
        long j13 = optionalDoubleAttr2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (optionalDoubleAttr2 * 1000000.0d);
        double optionalDoubleAttr3 = parseOptionalDoubleAttr(str, REGEX_PART_HOLD_BACK, -9.223372036854776E18d);
        if (optionalDoubleAttr3 != -9.223372036854776E18d) {
            j11 = (long) (optionalDoubleAttr3 * 1000000.0d);
        }
        return new HlsMediaPlaylist.ServerControl(j12, optionalBooleanAttribute, j13, j11, parseOptionalBooleanAttribute(str, REGEX_CAN_BLOCK_RELOAD, false));
    }

    private static long parseTimeSecondsToUs(String str, Pattern pattern) throws ParserException {
        return new BigDecimal(parseStringAttr(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String replaceVariableReferences(String str, Map<String, String> map) {
        Matcher matcher = REGEX_VARIABLE_REFERENCE.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    Util.closeQuietly(bufferedReader);
                    throw ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith(TAG_STREAM_INF)) {
                        arrayDeque.add(strTrim);
                        HlsMultivariantPlaylist multivariantPlaylist = parseMultivariantPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
                        Util.closeQuietly(bufferedReader);
                        return multivariantPlaylist;
                    }
                    if (!strTrim.startsWith(TAG_TARGET_DURATION) && !strTrim.startsWith(TAG_MEDIA_SEQUENCE) && !strTrim.startsWith(TAG_MEDIA_DURATION) && !strTrim.startsWith(TAG_KEY) && !strTrim.startsWith(TAG_BYTERANGE) && !strTrim.equals(TAG_DISCONTINUITY) && !strTrim.equals(TAG_DISCONTINUITY_SEQUENCE) && !strTrim.equals(TAG_ENDLIST)) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    HlsMediaPlaylist mediaPlaylist = parseMediaPlaylist(this.multivariantPlaylist, this.previousMediaPlaylist, new LineIterator(arrayDeque, bufferedReader), uri.toString());
                    Util.closeQuietly(bufferedReader);
                    return mediaPlaylist;
                }
            }
        } catch (Throwable th2) {
            Util.closeQuietly(bufferedReader);
            throw th2;
        }
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) throws IOException {
        int i11 = bufferedReader.read();
        if (i11 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i11 = bufferedReader.read();
        }
        int iSkipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, i11);
        for (int i12 = 0; i12 < 7; i12++) {
            if (iSkipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i12)) {
                return false;
            }
            iSkipIgnorableWhitespace = bufferedReader.read();
        }
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, iSkipIgnorableWhitespace));
    }

    private static boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z11) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return z11;
    }

    private static double parseOptionalDoubleAttr(String str, Pattern pattern, double d11) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Double.parseDouble((String) Assertions.checkNotNull(matcher.group(1)));
        }
        return d11;
    }

    private static int parseOptionalIntAttr(String str, Pattern pattern, int i11) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
        }
        return i11;
    }

    private static long parseOptionalLongAttr(String str, Pattern pattern, long j11) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
        }
        return j11;
    }

    private static String parseStringAttr(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String optionalStringAttr = parseOptionalStringAttr(str, pattern, map);
        if (optionalStringAttr != null) {
            return optionalStringAttr;
        }
        throw ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }
}
