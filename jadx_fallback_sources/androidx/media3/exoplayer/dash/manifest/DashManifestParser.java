package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes34.dex */
@androidx.media3.common.util.UnstableApi
public class DashManifestParser extends org.xml.sax.helpers.DefaultHandler implements androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.dash.manifest.DashManifest> {
    private static final java.util.regex.Pattern CEA_608_ACCESSIBILITY_PATTERN = null;
    private static final java.util.regex.Pattern CEA_708_ACCESSIBILITY_PATTERN = null;
    private static final java.util.regex.Pattern FRAME_RATE_PATTERN = null;
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = null;
    private static final java.lang.String TAG = "MpdParser";
    private final org.xmlpull.v1.XmlPullParserFactory xmlParserFactory;

    public static final class RepresentationInfo {
        public final com.google.common.collect.ImmutableList<androidx.media3.exoplayer.dash.manifest.BaseUrl> baseUrls;
        public final java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> drmSchemeDatas;

        @androidx.annotation.Nullable
        public final java.lang.String drmSchemeType;
        public final java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> essentialProperties;
        public final androidx.media3.common.Format format;
        public final java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Descriptor> inbandEventStreams;
        public final long revisionId;
        public final androidx.media3.exoplayer.dash.manifest.SegmentBase segmentBase;
        public final java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> supplementalProperties;

        public RepresentationInfo(androidx.media3.common.Format r1, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> r2, androidx.media3.exoplayer.dash.manifest.SegmentBase r3, @androidx.annotation.Nullable java.lang.String r4, java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> r5, java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Descriptor> r6, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r7, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r8, long r9) {
                r0 = this;
                r0.<init>()
                r0.format = r1
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r2)
                r0.baseUrls = r1
                r0.segmentBase = r3
                r0.drmSchemeType = r4
                r0.drmSchemeDatas = r5
                r0.inbandEventStreams = r6
                r0.essentialProperties = r7
                r0.supplementalProperties = r8
                r0.revisionId = r9
                return
        }
    }

    static {
            java.lang.String r0 = "(\\d+)(?:/(\\d+))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.FRAME_RATE_PATTERN = r0
            java.lang.String r0 = "CC([1-4])=.*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.CEA_608_ACCESSIBILITY_PATTERN = r0
            java.lang.String r0 = "([1-9]|[1-5][0-9]|6[0-3])=.*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.CEA_708_ACCESSIBILITY_PATTERN = r0
            r0 = 21
            int[] r0 = new int[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14} // fill-array
            androidx.media3.exoplayer.dash.manifest.DashManifestParser.MPEG_CHANNEL_CONFIGURATION_MAPPING = r0
            return
    }

    public DashManifestParser() {
            r3 = this;
            r3.<init>()
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch: org.xmlpull.v1.XmlPullParserException -> La
            r3.xmlParserFactory = r0     // Catch: org.xmlpull.v1.XmlPullParserException -> La
            return
        La:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't create XmlPullParserFactory instance"
            r1.<init>(r2, r0)
            throw r1
    }

    private long addSegmentTimelineElementsToList(java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> r1, long r2, long r4, int r6, long r7) {
            r0 = this;
            if (r6 < 0) goto L5
            int r6 = r6 + 1
            goto Lb
        L5:
            long r7 = r7 - r2
            long r6 = androidx.media3.common.util.Util.ceilDivide(r7, r4)
            int r6 = (int) r6
        Lb:
            r7 = 0
        Lc:
            if (r7 >= r6) goto L19
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentTimelineElement r8 = r0.buildSegmentTimelineElement(r2, r4)
            r1.add(r8)
            long r2 = r2 + r4
            int r7 = r7 + 1
            goto Lc
        L19:
            return r2
    }

    private static int checkContentTypeConsistency(int r1, int r2) {
            r0 = -1
            if (r1 != r0) goto L4
            return r2
        L4:
            if (r2 != r0) goto L7
            return r1
        L7:
            if (r1 != r2) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            androidx.media3.common.util.Assertions.checkState(r2)
            return r1
    }

    @androidx.annotation.Nullable
    private static java.lang.String checkLanguageConsistency(@androidx.annotation.Nullable java.lang.String r0, @androidx.annotation.Nullable java.lang.String r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            if (r1 != 0) goto L6
            return r0
        L6:
            boolean r1 = r0.equals(r1)
            androidx.media3.common.util.Assertions.checkState(r1)
            return r0
    }

    private static void fillInClearKeyInformation(java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> r6) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L23
            java.lang.Object r2 = r6.get(r1)
            androidx.media3.common.DrmInitData$SchemeData r2 = (androidx.media3.common.DrmInitData.SchemeData) r2
            java.util.UUID r3 = androidx.media3.common.C2711C.CLEARKEY_UUID
            java.util.UUID r4 = r2.uuid
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L20
            java.lang.String r2 = r2.licenseServerUrl
            if (r2 == 0) goto L20
            r6.remove(r1)
            goto L24
        L20:
            int r1 = r1 + 1
            goto L2
        L23:
            r2 = 0
        L24:
            if (r2 != 0) goto L27
            goto L52
        L27:
            int r1 = r6.size()
            if (r0 >= r1) goto L52
            java.lang.Object r1 = r6.get(r0)
            androidx.media3.common.DrmInitData$SchemeData r1 = (androidx.media3.common.DrmInitData.SchemeData) r1
            java.util.UUID r3 = androidx.media3.common.C2711C.COMMON_PSSH_UUID
            java.util.UUID r4 = r1.uuid
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4f
            java.lang.String r3 = r1.licenseServerUrl
            if (r3 != 0) goto L4f
            androidx.media3.common.DrmInitData$SchemeData r3 = new androidx.media3.common.DrmInitData$SchemeData
            java.util.UUID r4 = androidx.media3.common.C2711C.CLEARKEY_UUID
            java.lang.String r5 = r1.mimeType
            byte[] r1 = r1.data
            r3.<init>(r4, r2, r5, r1)
            r6.set(r0, r3)
        L4f:
            int r0 = r0 + 1
            goto L27
        L52:
            return
    }

    private static void filterRedundantIncompleteSchemeDatas(java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> r4) {
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L31
            java.lang.Object r1 = r4.get(r0)
            androidx.media3.common.DrmInitData$SchemeData r1 = (androidx.media3.common.DrmInitData.SchemeData) r1
            boolean r2 = r1.hasData()
            if (r2 != 0) goto L2e
            r2 = 0
        L15:
            int r3 = r4.size()
            if (r2 >= r3) goto L2e
            java.lang.Object r3 = r4.get(r2)
            androidx.media3.common.DrmInitData$SchemeData r3 = (androidx.media3.common.DrmInitData.SchemeData) r3
            boolean r3 = r3.canReplace(r1)
            if (r3 == 0) goto L2b
            r4.remove(r0)
            goto L2e
        L2b:
            int r2 = r2 + 1
            goto L15
        L2e:
            int r0 = r0 + (-1)
            goto L6
        L31:
            return
    }

    private static long getFinalAvailabilityTimeOffset(long r3, long r5) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto Lb
        La:
            r3 = r5
        Lb:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L15
            return r0
        L15:
            return r3
    }

    @androidx.annotation.Nullable
    private static java.lang.String getSampleMimeType(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2) {
            boolean r0 = androidx.media3.common.MimeTypes.isAudio(r1)
            if (r0 == 0) goto Lb
            java.lang.String r1 = androidx.media3.common.MimeTypes.getAudioMediaMimeType(r2)
            return r1
        Lb:
            boolean r0 = androidx.media3.common.MimeTypes.isVideo(r1)
            if (r0 == 0) goto L16
            java.lang.String r1 = androidx.media3.common.MimeTypes.getVideoMediaMimeType(r2)
            return r1
        L16:
            boolean r0 = androidx.media3.common.MimeTypes.isText(r1)
            if (r0 == 0) goto L1d
            goto L23
        L1d:
            boolean r0 = androidx.media3.common.MimeTypes.isImage(r1)
            if (r0 == 0) goto L24
        L23:
            return r1
        L24:
            java.lang.String r0 = "application/mp4"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            java.lang.String r1 = androidx.media3.common.MimeTypes.getMediaMimeType(r2)
            java.lang.String r2 = "text/vtt"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L3b
            java.lang.String r1 = "application/x-mp4-vtt"
        L3b:
            return r1
        L3c:
            r1 = 0
            return r1
    }

    private boolean isDvbProfileDeclared(java.lang.String[] r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L15
            r3 = r6[r2]
            java.lang.String r4 = "urn:dvb:dash:profile:dvb-dash:"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L12
            r6 = 1
            return r6
        L12:
            int r2 = r2 + 1
            goto L3
        L15:
            return r1
    }

    public static void maybeSkipTag(org.xmlpull.v1.XmlPullParser r2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r2)
            if (r0 != 0) goto L7
            goto L1f
        L7:
            r0 = 1
        L8:
            if (r0 == 0) goto L1f
            r2.next()
            boolean r1 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r2)
            if (r1 == 0) goto L16
            int r0 = r0 + 1
            goto L8
        L16:
            boolean r1 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r2)
            if (r1 == 0) goto L8
            int r0 = r0 + (-1)
            goto L8
        L1f:
            return
    }

    public static int parseCea608AccessibilityChannel(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r4) {
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L4d
            java.lang.Object r1 = r4.get(r0)
            androidx.media3.exoplayer.dash.manifest.Descriptor r1 = (androidx.media3.exoplayer.dash.manifest.Descriptor) r1
            java.lang.String r2 = r1.schemeIdUri
            java.lang.String r3 = "urn:scte:dash:cc:cea-608:2015"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4a
            java.lang.String r2 = r1.value
            if (r2 == 0) goto L4a
            java.util.regex.Pattern r3 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.CEA_608_ACCESSIBILITY_PATTERN
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L32
            r4 = 1
            java.lang.String r4 = r2.group(r4)
            int r4 = java.lang.Integer.parseInt(r4)
            return r4
        L32:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to parse CEA-608 channel number from: "
            r2.append(r3)
            java.lang.String r1 = r1.value
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MpdParser"
            androidx.media3.common.util.Log.m2961w(r2, r1)
        L4a:
            int r0 = r0 + 1
            goto L1
        L4d:
            r4 = -1
            return r4
    }

    public static int parseCea708AccessibilityChannel(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r4) {
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L4d
            java.lang.Object r1 = r4.get(r0)
            androidx.media3.exoplayer.dash.manifest.Descriptor r1 = (androidx.media3.exoplayer.dash.manifest.Descriptor) r1
            java.lang.String r2 = r1.schemeIdUri
            java.lang.String r3 = "urn:scte:dash:cc:cea-708:2015"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4a
            java.lang.String r2 = r1.value
            if (r2 == 0) goto L4a
            java.util.regex.Pattern r3 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.CEA_708_ACCESSIBILITY_PATTERN
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L32
            r4 = 1
            java.lang.String r4 = r2.group(r4)
            int r4 = java.lang.Integer.parseInt(r4)
            return r4
        L32:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to parse CEA-708 service block number from: "
            r2.append(r3)
            java.lang.String r1 = r1.value
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MpdParser"
            androidx.media3.common.util.Log.m2961w(r2, r1)
        L4a:
            int r0 = r0 + 1
            goto L1
        L4d:
            r4 = -1
            return r4
    }

    public static long parseDateTime(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, long r3) throws androidx.media3.common.ParserException {
            r0 = 0
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 != 0) goto L8
            return r3
        L8:
            long r1 = androidx.media3.common.util.Util.parseXsDateTime(r1)
            return r1
    }

    public static androidx.media3.exoplayer.dash.manifest.Descriptor parseDescriptor(org.xmlpull.v1.XmlPullParser r4, java.lang.String r5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            java.lang.String r0 = "schemeIdUri"
            java.lang.String r1 = ""
            java.lang.String r0 = parseString(r4, r0, r1)
            java.lang.String r1 = "value"
            r2 = 0
            java.lang.String r1 = parseString(r4, r1, r2)
            java.lang.String r3 = "id"
            java.lang.String r2 = parseString(r4, r3, r2)
        L17:
            r4.next()
            boolean r3 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r4, r5)
            if (r3 == 0) goto L17
            androidx.media3.exoplayer.dash.manifest.Descriptor r4 = new androidx.media3.exoplayer.dash.manifest.Descriptor
            r4.<init>(r0, r1, r2)
            return r4
    }

    public static int parseDolbyChannelConfiguration(org.xmlpull.v1.XmlPullParser r4) {
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "value"
            java.lang.String r4 = r4.getAttributeValue(r2, r3)
            r2 = -1
            if (r4 != 0) goto Le
            return r2
        Le:
            java.lang.String r4 = com.google.common.base.Ascii.toLowerCase(r4)
            r4.getClass()
            int r3 = r4.hashCode()
            switch(r3) {
                case 1596796: goto L4a;
                case 2937391: goto L3f;
                case 3094034: goto L34;
                case 3094035: goto L29;
                case 3133436: goto L1e;
                default: goto L1c;
            }
        L1c:
            r4 = r2
            goto L54
        L1e:
            java.lang.String r3 = "fa01"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L27
            goto L1c
        L27:
            r4 = 4
            goto L54
        L29:
            java.lang.String r3 = "f801"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L32
            goto L1c
        L32:
            r4 = 3
            goto L54
        L34:
            java.lang.String r3 = "f800"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L3d
            goto L1c
        L3d:
            r4 = r0
            goto L54
        L3f:
            java.lang.String r3 = "a000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L48
            goto L1c
        L48:
            r4 = r1
            goto L54
        L4a:
            java.lang.String r3 = "4000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L53
            goto L1c
        L53:
            r4 = 0
        L54:
            switch(r4) {
                case 0: goto L60;
                case 1: goto L5f;
                case 2: goto L5d;
                case 3: goto L5b;
                case 4: goto L58;
                default: goto L57;
            }
        L57:
            return r2
        L58:
            r4 = 8
            return r4
        L5b:
            r4 = 6
            return r4
        L5d:
            r4 = 5
            return r4
        L5f:
            return r0
        L60:
            return r1
    }

    public static int parseDtsChannelConfiguration(org.xmlpull.v1.XmlPullParser r2) {
            java.lang.String r0 = "value"
            r1 = -1
            int r2 = parseInt(r2, r0, r1)
            if (r2 <= 0) goto Lf
            r0 = 33
            if (r2 >= r0) goto Lf
            return r2
        Lf:
            return r1
    }

    public static int parseDtsxChannelConfiguration(org.xmlpull.v1.XmlPullParser r2) {
            r0 = 0
            java.lang.String r1 = "value"
            java.lang.String r2 = r2.getAttributeValue(r0, r1)
            r0 = -1
            if (r2 != 0) goto Lc
            return r0
        Lc:
            r1 = 16
            int r2 = java.lang.Integer.parseInt(r2, r1)
            int r2 = java.lang.Integer.bitCount(r2)
            if (r2 != 0) goto L19
            return r0
        L19:
            return r2
    }

    public static long parseDuration(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, long r3) {
            r0 = 0
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 != 0) goto L8
            return r3
        L8:
            long r1 = androidx.media3.common.util.Util.parseXsDuration(r1)
            return r1
    }

    public static java.lang.String parseEac3SupplementalProperties(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r5) {
            r0 = 0
        L1:
            int r1 = r5.size()
            if (r0 >= r1) goto L3b
            java.lang.Object r1 = r5.get(r0)
            androidx.media3.exoplayer.dash.manifest.Descriptor r1 = (androidx.media3.exoplayer.dash.manifest.Descriptor) r1
            java.lang.String r2 = r1.schemeIdUri
            java.lang.String r3 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L22
            java.lang.String r3 = "JOC"
            java.lang.String r4 = r1.value
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L35
        L22:
            java.lang.String r3 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L38
            java.lang.String r2 = "ec+3"
            java.lang.String r1 = r1.value
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L38
        L35:
            java.lang.String r5 = "audio/eac3-joc"
            return r5
        L38:
            int r0 = r0 + 1
            goto L1
        L3b:
            java.lang.String r5 = "audio/eac3"
            return r5
    }

    public static float parseFloat(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, float r3) {
            r0 = 0
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 != 0) goto L8
            return r3
        L8:
            float r1 = java.lang.Float.parseFloat(r1)
            return r1
    }

    public static float parseFrameRate(org.xmlpull.v1.XmlPullParser r2, float r3) {
            r0 = 0
            java.lang.String r1 = "frameRate"
            java.lang.String r2 = r2.getAttributeValue(r0, r1)
            if (r2 == 0) goto L33
            java.util.regex.Pattern r0 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.FRAME_RATE_PATTERN
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r0 = r2.matches()
            if (r0 == 0) goto L33
            r3 = 1
            java.lang.String r3 = r2.group(r3)
            int r3 = java.lang.Integer.parseInt(r3)
            r0 = 2
            java.lang.String r2 = r2.group(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L31
            float r3 = (float) r3
            int r2 = java.lang.Integer.parseInt(r2)
            float r2 = (float) r2
            float r3 = r3 / r2
            return r3
        L31:
            float r2 = (float) r3
            return r2
        L33:
            return r3
    }

    public static int parseInt(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3) {
            r0 = 0
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 != 0) goto L8
            return r3
        L8:
            int r1 = java.lang.Integer.parseInt(r1)
            return r1
    }

    public static long parseLastSegmentNumberSupplementalProperty(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r4) {
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L21
            java.lang.Object r1 = r4.get(r0)
            androidx.media3.exoplayer.dash.manifest.Descriptor r1 = (androidx.media3.exoplayer.dash.manifest.Descriptor) r1
            java.lang.String r2 = r1.schemeIdUri
            java.lang.String r3 = "http://dashif.org/guidelines/last-segment-number"
            boolean r2 = com.google.common.base.Ascii.equalsIgnoreCase(r3, r2)
            if (r2 == 0) goto L1e
            java.lang.String r4 = r1.value
            long r0 = java.lang.Long.parseLong(r4)
            return r0
        L1e:
            int r0 = r0 + 1
            goto L1
        L21:
            r0 = -1
            return r0
    }

    public static long parseLong(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, long r3) {
            r0 = 0
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 != 0) goto L8
            return r3
        L8:
            long r1 = java.lang.Long.parseLong(r1)
            return r1
    }

    public static int parseMpegChannelConfiguration(org.xmlpull.v1.XmlPullParser r3) {
            java.lang.String r0 = "value"
            r1 = -1
            int r3 = parseInt(r3, r0, r1)
            if (r3 < 0) goto L12
            int[] r0 = androidx.media3.exoplayer.dash.manifest.DashManifestParser.MPEG_CHANNEL_CONFIGURATION_MAPPING
            int r2 = r0.length
            if (r3 >= r2) goto L12
            r3 = r0[r3]
            return r3
        L12:
            return r1
    }

    public static java.lang.String parseString(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, java.lang.String r3) {
            r0 = 0
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 != 0) goto L8
            return r3
        L8:
            return r1
    }

    public static java.lang.String parseText(org.xmlpull.v1.XmlPullParser r3, java.lang.String r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            java.lang.String r0 = ""
        L2:
            r3.next()
            int r1 = r3.getEventType()
            r2 = 4
            if (r1 != r2) goto L11
            java.lang.String r0 = r3.getText()
            goto L14
        L11:
            maybeSkipTag(r3)
        L14:
            boolean r1 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r3, r4)
            if (r1 == 0) goto L2
            return r0
    }

    public androidx.media3.exoplayer.dash.manifest.AdaptationSet buildAdaptationSet(long r9, int r11, java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> r12, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r13, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r14, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r15) {
            r8 = this;
            androidx.media3.exoplayer.dash.manifest.AdaptationSet r0 = new androidx.media3.exoplayer.dash.manifest.AdaptationSet
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r3, r4, r5, r6, r7)
            return r0
    }

    public androidx.media3.extractor.metadata.emsg.EventMessage buildEvent(java.lang.String r9, java.lang.String r10, long r11, long r13, byte[] r15) {
            r8 = this;
            androidx.media3.extractor.metadata.emsg.EventMessage r0 = new androidx.media3.extractor.metadata.emsg.EventMessage
            r1 = r9
            r2 = r10
            r5 = r11
            r3 = r13
            r7 = r15
            r0.<init>(r1, r2, r3, r5, r7)
            return r0
    }

    public androidx.media3.exoplayer.dash.manifest.EventStream buildEventStream(java.lang.String r8, java.lang.String r9, long r10, long[] r12, androidx.media3.extractor.metadata.emsg.EventMessage[] r13) {
            r7 = this;
            androidx.media3.exoplayer.dash.manifest.EventStream r0 = new androidx.media3.exoplayer.dash.manifest.EventStream
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r5, r6)
            return r0
    }

    public androidx.media3.common.Format buildFormat(@androidx.annotation.Nullable java.lang.String r8, @androidx.annotation.Nullable java.lang.String r9, int r10, int r11, float r12, int r13, int r14, int r15, @androidx.annotation.Nullable java.lang.String r16, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r17, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r18, @androidx.annotation.Nullable java.lang.String r19, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r20, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r21) {
            r7 = this;
            r0 = r17
            r1 = r20
            r2 = r19
            java.lang.String r3 = getSampleMimeType(r9, r2)
            java.lang.String r4 = "audio/eac3"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L20
            java.lang.String r3 = parseEac3SupplementalProperties(r21)
            java.lang.String r4 = "audio/eac3-joc"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L20
            java.lang.String r2 = "ec+3"
        L20:
            int r4 = r7.parseSelectionFlagsFromRoleDescriptors(r0)
            int r0 = r7.parseRoleFlagsFromRoleDescriptors(r0)
            r5 = r18
            int r6 = r7.parseRoleFlagsFromAccessibilityDescriptors(r5)
            r0 = r0 | r6
            int r6 = r7.parseRoleFlagsFromProperties(r1)
            r0 = r0 | r6
            r6 = r21
            int r6 = r7.parseRoleFlagsFromProperties(r6)
            r0 = r0 | r6
            android.util.Pair r1 = r7.parseTileCountFromProperties(r1)
            androidx.media3.common.Format$Builder r6 = new androidx.media3.common.Format$Builder
            r6.<init>()
            androidx.media3.common.Format$Builder r8 = r6.setId(r8)
            androidx.media3.common.Format$Builder r8 = r8.setContainerMimeType(r9)
            androidx.media3.common.Format$Builder r8 = r8.setSampleMimeType(r3)
            androidx.media3.common.Format$Builder r8 = r8.setCodecs(r2)
            androidx.media3.common.Format$Builder r8 = r8.setPeakBitrate(r15)
            androidx.media3.common.Format$Builder r8 = r8.setSelectionFlags(r4)
            androidx.media3.common.Format$Builder r8 = r8.setRoleFlags(r0)
            r9 = r16
            androidx.media3.common.Format$Builder r8 = r8.setLanguage(r9)
            r9 = -1
            if (r1 == 0) goto L72
            java.lang.Object r0 = r1.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L73
        L72:
            r0 = r9
        L73:
            androidx.media3.common.Format$Builder r8 = r8.setTileCountHorizontal(r0)
            if (r1 == 0) goto L82
            java.lang.Object r0 = r1.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L83
        L82:
            r0 = r9
        L83:
            androidx.media3.common.Format$Builder r8 = r8.setTileCountVertical(r0)
            boolean r0 = androidx.media3.common.MimeTypes.isVideo(r3)
            if (r0 == 0) goto L99
            androidx.media3.common.Format$Builder r9 = r8.setWidth(r10)
            androidx.media3.common.Format$Builder r9 = r9.setHeight(r11)
            r9.setFrameRate(r12)
            goto Ld7
        L99:
            boolean r12 = androidx.media3.common.MimeTypes.isAudio(r3)
            if (r12 == 0) goto La7
            androidx.media3.common.Format$Builder r9 = r8.setChannelCount(r13)
            r9.setSampleRate(r14)
            goto Ld7
        La7:
            boolean r12 = androidx.media3.common.MimeTypes.isText(r3)
            if (r12 == 0) goto Lca
            java.lang.String r10 = "application/cea-608"
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto Lba
            int r9 = parseCea608AccessibilityChannel(r5)
            goto Lc6
        Lba:
            java.lang.String r10 = "application/cea-708"
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto Lc6
            int r9 = parseCea708AccessibilityChannel(r5)
        Lc6:
            r8.setAccessibilityChannel(r9)
            goto Ld7
        Lca:
            boolean r9 = androidx.media3.common.MimeTypes.isImage(r3)
            if (r9 == 0) goto Ld7
            androidx.media3.common.Format$Builder r9 = r8.setWidth(r10)
            r9.setHeight(r11)
        Ld7:
            androidx.media3.common.Format r8 = r8.build()
            return r8
    }

    public androidx.media3.exoplayer.dash.manifest.DashManifest buildMediaPresentationDescription(long r22, long r24, long r26, boolean r28, long r29, long r31, long r33, long r35, @androidx.annotation.Nullable androidx.media3.exoplayer.dash.manifest.ProgramInformation r37, @androidx.annotation.Nullable androidx.media3.exoplayer.dash.manifest.UtcTimingElement r38, @androidx.annotation.Nullable androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement r39, @androidx.annotation.Nullable android.net.Uri r40, java.util.List<androidx.media3.exoplayer.dash.manifest.Period> r41) {
            r21 = this;
            androidx.media3.exoplayer.dash.manifest.DashManifest r0 = new androidx.media3.exoplayer.dash.manifest.DashManifest
            r1 = r22
            r3 = r24
            r5 = r26
            r7 = r28
            r8 = r29
            r10 = r31
            r12 = r33
            r14 = r35
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r20 = r41
            r0.<init>(r1, r3, r5, r7, r8, r10, r12, r14, r16, r17, r18, r19, r20)
            return r0
    }

    public androidx.media3.exoplayer.dash.manifest.Period buildPeriod(@androidx.annotation.Nullable java.lang.String r8, long r9, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> r11, java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> r12, @androidx.annotation.Nullable androidx.media3.exoplayer.dash.manifest.Descriptor r13) {
            r7 = this;
            androidx.media3.exoplayer.dash.manifest.Period r0 = new androidx.media3.exoplayer.dash.manifest.Period
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r4, r5, r6)
            return r0
    }

    public androidx.media3.exoplayer.dash.manifest.RangedUri buildRangedUri(java.lang.String r7, long r8, long r10) {
            r6 = this;
            androidx.media3.exoplayer.dash.manifest.RangedUri r0 = new androidx.media3.exoplayer.dash.manifest.RangedUri
            r1 = r7
            r2 = r8
            r4 = r10
            r0.<init>(r1, r2, r4)
            return r0
    }

    public androidx.media3.exoplayer.dash.manifest.Representation buildRepresentation(androidx.media3.exoplayer.dash.manifest.DashManifestParser.RepresentationInfo r14, @androidx.annotation.Nullable java.lang.String r15, java.util.List<androidx.media3.common.Label> r16, @androidx.annotation.Nullable java.lang.String r17, java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> r18, java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Descriptor> r19) {
            r13 = this;
            androidx.media3.common.Format r1 = r14.format
            androidx.media3.common.Format$Builder r1 = r1.buildUpon()
            if (r15 == 0) goto L12
            boolean r2 = r16.isEmpty()
            if (r2 == 0) goto L12
            r1.setLabel(r15)
            goto L17
        L12:
            r0 = r16
            r1.setLabels(r0)
        L17:
            java.lang.String r0 = r14.drmSchemeType
            if (r0 != 0) goto L1d
            r0 = r17
        L1d:
            java.util.ArrayList<androidx.media3.common.DrmInitData$SchemeData> r2 = r14.drmSchemeDatas
            r3 = r18
            r2.addAll(r3)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L38
            fillInClearKeyInformation(r2)
            filterRedundantIncompleteSchemeDatas(r2)
            androidx.media3.common.DrmInitData r3 = new androidx.media3.common.DrmInitData
            r3.<init>(r0, r2)
            r1.setDrmInitData(r3)
        L38:
            java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Descriptor> r9 = r14.inbandEventStreams
            r0 = r19
            r9.addAll(r0)
            long r4 = r14.revisionId
            androidx.media3.common.Format r6 = r1.build()
            com.google.common.collect.ImmutableList<androidx.media3.exoplayer.dash.manifest.BaseUrl> r7 = r14.baseUrls
            androidx.media3.exoplayer.dash.manifest.SegmentBase r8 = r14.segmentBase
            java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r10 = r14.essentialProperties
            java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r11 = r14.supplementalProperties
            r12 = 0
            androidx.media3.exoplayer.dash.manifest.Representation r14 = androidx.media3.exoplayer.dash.manifest.Representation.newInstance(r4, r6, r7, r8, r9, r10, r11, r12)
            return r14
    }

    public androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentList buildSegmentList(androidx.media3.exoplayer.dash.manifest.RangedUri r19, long r20, long r22, long r24, long r26, @androidx.annotation.Nullable java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> r28, long r29, @androidx.annotation.Nullable java.util.List<androidx.media3.exoplayer.dash.manifest.RangedUri> r31, long r32, long r34) {
            r18 = this;
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentList r0 = new androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentList
            long r14 = androidx.media3.common.util.Util.msToUs(r32)
            long r16 = androidx.media3.common.util.Util.msToUs(r34)
            r1 = r19
            r2 = r20
            r4 = r22
            r6 = r24
            r8 = r26
            r10 = r28
            r11 = r29
            r13 = r31
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r13, r14, r16)
            return r0
    }

    public androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTemplate buildSegmentTemplate(androidx.media3.exoplayer.dash.manifest.RangedUri r22, long r23, long r25, long r27, long r29, long r31, java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> r33, long r34, @androidx.annotation.Nullable androidx.media3.exoplayer.dash.manifest.UrlTemplate r36, @androidx.annotation.Nullable androidx.media3.exoplayer.dash.manifest.UrlTemplate r37, long r38, long r40) {
            r21 = this;
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentTemplate r0 = new androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentTemplate
            long r17 = androidx.media3.common.util.Util.msToUs(r38)
            long r19 = androidx.media3.common.util.Util.msToUs(r40)
            r1 = r22
            r2 = r23
            r4 = r25
            r6 = r27
            r8 = r29
            r10 = r31
            r12 = r33
            r13 = r34
            r15 = r36
            r16 = r37
            r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13, r15, r16, r17, r19)
            return r0
    }

    public androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long r2, long r4) {
            r1 = this;
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentTimelineElement r0 = new androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentTimelineElement
            r0.<init>(r2, r4)
            return r0
    }

    public androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase buildSingleSegmentBase(androidx.media3.exoplayer.dash.manifest.RangedUri r11, long r12, long r14, long r16, long r18) {
            r10 = this;
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SingleSegmentBase r0 = new androidx.media3.exoplayer.dash.manifest.SegmentBase$SingleSegmentBase
            r1 = r11
            r2 = r12
            r4 = r14
            r6 = r16
            r8 = r18
            r0.<init>(r1, r2, r4, r6, r8)
            return r0
    }

    public androidx.media3.exoplayer.dash.manifest.UtcTimingElement buildUtcTimingElement(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            androidx.media3.exoplayer.dash.manifest.UtcTimingElement r0 = new androidx.media3.exoplayer.dash.manifest.UtcTimingElement
            r0.<init>(r2, r3)
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public androidx.media3.exoplayer.dash.manifest.DashManifest parse(android.net.Uri r4, java.io.InputStream r5) throws java.io.IOException {
            r3 = this;
            r0 = 0
            org.xmlpull.v1.XmlPullParserFactory r1 = r3.xmlParserFactory     // Catch: org.xmlpull.v1.XmlPullParserException -> L22
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()     // Catch: org.xmlpull.v1.XmlPullParserException -> L22
            r1.setInput(r5, r0)     // Catch: org.xmlpull.v1.XmlPullParserException -> L22
            int r5 = r1.next()     // Catch: org.xmlpull.v1.XmlPullParserException -> L22
            r2 = 2
            if (r5 != r2) goto L24
            java.lang.String r5 = "MPD"
            java.lang.String r2 = r1.getName()     // Catch: org.xmlpull.v1.XmlPullParserException -> L22
            boolean r5 = r5.equals(r2)     // Catch: org.xmlpull.v1.XmlPullParserException -> L22
            if (r5 == 0) goto L24
            androidx.media3.exoplayer.dash.manifest.DashManifest r4 = r3.parseMediaPresentationDescription(r1, r4)     // Catch: org.xmlpull.v1.XmlPullParserException -> L22
            return r4
        L22:
            r4 = move-exception
            goto L2b
        L24:
            java.lang.String r4 = "inputStream does not contain a valid media presentation description"
            androidx.media3.common.ParserException r4 = androidx.media3.common.ParserException.createForMalformedManifest(r4, r0)     // Catch: org.xmlpull.v1.XmlPullParserException -> L22
            throw r4     // Catch: org.xmlpull.v1.XmlPullParserException -> L22
        L2b:
            androidx.media3.common.ParserException r4 = androidx.media3.common.ParserException.createForMalformedManifest(r0, r4)
            throw r4
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public /* bridge */ /* synthetic */ androidx.media3.exoplayer.dash.manifest.DashManifest parse(android.net.Uri r1, java.io.InputStream r2) throws java.io.IOException {
            r0 = this;
            androidx.media3.exoplayer.dash.manifest.DashManifest r1 = r0.parse(r1, r2)
            return r1
    }

    public androidx.media3.exoplayer.dash.manifest.AdaptationSet parseAdaptationSet(org.xmlpull.v1.XmlPullParser r44, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> r45, @androidx.annotation.Nullable androidx.media3.exoplayer.dash.manifest.SegmentBase r46, long r47, long r49, long r51, long r53, long r55, boolean r57) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r43 = this;
            r0 = r43
            r1 = r44
            java.lang.String r2 = "id"
            r3 = -1
            long r28 = parseLong(r1, r2, r3)
            int r2 = r43.parseContentType(r44)
            java.lang.String r3 = "mimeType"
            r4 = 0
            java.lang.String r3 = r1.getAttributeValue(r4, r3)
            java.lang.String r5 = "codecs"
            java.lang.String r5 = r1.getAttributeValue(r4, r5)
            java.lang.String r6 = "width"
            r7 = -1
            int r6 = parseInt(r1, r6, r7)
            java.lang.String r8 = "height"
            int r8 = parseInt(r1, r8, r7)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r9 = parseFrameRate(r1, r9)
            java.lang.String r10 = "audioSamplingRate"
            int r10 = parseInt(r1, r10, r7)
            java.lang.String r11 = "lang"
            java.lang.String r12 = r1.getAttributeValue(r4, r11)
            java.lang.String r13 = "label"
            java.lang.String r30 = r1.getAttributeValue(r4, r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r16 = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r17 = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r19 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r21 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r31 = 0
            r23 = r51
            r18 = r3
            r22 = r5
            r25 = r6
            r26 = r8
            r8 = r9
            r6 = r17
            r5 = r21
            r32 = r31
            r9 = -1
            r33 = 0
            r17 = r46
            r21 = r4
            r3 = r49
        L94:
            r1.next()
            r46 = r8
            java.lang.String r8 = "BaseURL"
            boolean r8 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r8)
            if (r8 == 0) goto Ld6
            if (r32 != 0) goto La9
            long r3 = r0.parseAvailabilityTimeOffsetUs(r1, r3)
            r32 = 1
        La9:
            r8 = r45
            r49 = r3
            r3 = r57
            java.util.List r4 = r0.parseBaseUrl(r1, r8, r3)
            r2.addAll(r4)
            r40 = r2
            r35 = r11
            r37 = r14
            r3 = r15
            r4 = r17
            r2 = r19
            r52 = r21
            r34 = 0
            r14 = r46
            r19 = r7
            r21 = r9
            r15 = r10
            r17 = r12
            r9 = r16
            r7 = r49
        Ld2:
            r16 = r13
            goto L33f
        Ld6:
            r8 = r45
            r34 = r3
            r3 = r57
            java.lang.String r4 = "ContentProtection"
            boolean r4 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r4)
            if (r4 == 0) goto L116
            android.util.Pair r4 = r43.parseContentProtection(r44)
            java.lang.Object r0 = r4.first
            if (r0 == 0) goto Lf0
            r33 = r0
            java.lang.String r33 = (java.lang.String) r33
        Lf0:
            java.lang.Object r0 = r4.second
            if (r0 == 0) goto Lf9
            androidx.media3.common.DrmInitData$SchemeData r0 = (androidx.media3.common.DrmInitData.SchemeData) r0
            r14.add(r0)
        Lf9:
            r40 = r2
            r37 = r14
            r3 = r15
            r4 = r17
            r2 = r19
            r52 = r21
            r14 = r46
            r19 = r7
            r21 = r9
            r15 = r10
            r17 = r12
            r9 = r16
            r7 = r34
            r34 = 0
        L113:
            r35 = r11
            goto Ld2
        L116:
            java.lang.String r0 = "ContentComponent"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r0)
            if (r0 == 0) goto L14b
            r0 = 0
            java.lang.String r4 = r1.getAttributeValue(r0, r11)
            java.lang.String r4 = checkLanguageConsistency(r6, r4)
            int r6 = r43.parseContentType(r44)
            int r5 = checkContentTypeConsistency(r5, r6)
            r40 = r2
            r6 = r4
            r37 = r14
            r3 = r15
            r4 = r17
            r2 = r19
            r52 = r21
            r14 = r46
            r19 = r7
            r21 = r9
            r15 = r10
            r17 = r12
            r9 = r16
            r7 = r34
            r34 = r0
            goto L113
        L14b:
            r0 = 0
            java.lang.String r4 = "Role"
            boolean r20 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r4)
            if (r20 == 0) goto L183
            androidx.media3.exoplayer.dash.manifest.Descriptor r4 = parseDescriptor(r1, r4)
            r12.add(r4)
        L15b:
            r40 = r2
            r20 = r6
            r37 = r14
            r3 = r15
            r4 = r17
            r2 = r19
            r52 = r21
            r14 = r46
            r19 = r7
            r21 = r9
            r15 = r10
            r17 = r12
            r9 = r16
            r7 = r34
            r34 = r0
            r35 = r11
            r16 = r13
            r41 = r23
            r23 = r5
            r5 = r41
            goto L337
        L183:
            java.lang.String r4 = "AudioChannelConfiguration"
            boolean r4 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r4)
            if (r4 == 0) goto L1af
            int r4 = r43.parseAudioChannelConfiguration(r44)
            r40 = r2
            r37 = r14
            r3 = r15
            r9 = r16
            r2 = r19
            r52 = r21
            r14 = r46
            r21 = r4
            r19 = r7
            r15 = r10
            r16 = r13
            r4 = r17
            r7 = r34
            r34 = r0
            r35 = r11
            r17 = r12
            goto L33f
        L1af:
            java.lang.String r4 = "Accessibility"
            boolean r20 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r4)
            if (r20 == 0) goto L1bf
            androidx.media3.exoplayer.dash.manifest.Descriptor r4 = parseDescriptor(r1, r4)
            r13.add(r4)
            goto L15b
        L1bf:
            java.lang.String r4 = "EssentialProperty"
            boolean r20 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r4)
            if (r20 == 0) goto L1cf
            androidx.media3.exoplayer.dash.manifest.Descriptor r4 = parseDescriptor(r1, r4)
            r7.add(r4)
            goto L15b
        L1cf:
            java.lang.String r4 = "SupplementalProperty"
            boolean r20 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r4)
            if (r20 == 0) goto L1e0
            androidx.media3.exoplayer.dash.manifest.Descriptor r4 = parseDescriptor(r1, r4)
            r15.add(r4)
            goto L15b
        L1e0:
            java.lang.String r4 = "Representation"
            boolean r4 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r4)
            if (r4 == 0) goto L26a
            boolean r4 = r2.isEmpty()
            r40 = r2
            r27 = r3
            if (r4 != 0) goto L21d
            r3 = r40
            r8 = r46
            r37 = r14
            r36 = r16
            r16 = r17
            r4 = r18
            r38 = r19
            r39 = r21
        L202:
            r19 = r47
            r17 = r53
            r2 = r1
            r14 = r7
            r7 = r26
            r1 = r43
            r41 = r34
            r34 = r0
            r0 = r5
            r35 = r11
            r5 = r22
            r21 = r41
            r11 = r6
            r6 = r25
            r25 = r55
            goto L22d
        L21d:
            r3 = r8
            r37 = r14
            r36 = r16
            r16 = r17
            r4 = r18
            r38 = r19
            r39 = r21
            r8 = r46
            goto L202
        L22d:
            androidx.media3.exoplayer.dash.manifest.DashManifestParser$RepresentationInfo r3 = r1.parseRepresentation(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r25, r27)
            r18 = r4
            r25 = r6
            r26 = r7
            r20 = r11
            r17 = r12
            r19 = r14
            r4 = r16
            r14 = r8
            r16 = r13
            r13 = r15
            r7 = r21
            r22 = r5
            r21 = r9
            r15 = r10
            r5 = r23
            androidx.media3.common.Format r9 = r3.format
            java.lang.String r9 = r9.sampleMimeType
            int r9 = androidx.media3.common.MimeTypes.getTrackType(r9)
            int r0 = checkContentTypeConsistency(r0, r9)
            r9 = r39
            r9.add(r3)
            r1 = r2
        L25e:
            r52 = r9
            r3 = r13
            r6 = r20
            r9 = r36
            r2 = r38
            r5 = r0
            goto L33f
        L26a:
            r4 = r21
            r21 = r9
            r9 = r4
            r40 = r2
            r20 = r6
            r37 = r14
            r36 = r16
            r4 = r17
            r38 = r19
            r14 = r46
            r2 = r1
            r19 = r7
            r17 = r12
            r16 = r13
            r13 = r15
            r7 = r34
            r1 = r43
            r34 = r0
            r0 = r5
            r15 = r10
            r35 = r11
            r5 = r23
            java.lang.String r3 = "SegmentBase"
            boolean r3 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r2, r3)
            if (r3 == 0) goto L2a5
            r3 = r4
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SingleSegmentBase r3 = (androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase) r3
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SingleSegmentBase r3 = r1.parseSegmentBase(r2, r3)
            r1 = r2
            r4 = r3
            r23 = r5
            goto L25e
        L2a5:
            java.lang.String r3 = "SegmentList"
            boolean r3 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r2, r3)
            if (r3 == 0) goto L2d5
            r39 = r9
            long r9 = r1.parseAvailabilityTimeOffsetUs(r2, r5)
            r2 = r4
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentList r2 = (androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentList) r2
            r5 = r47
            r3 = r53
            r11 = r55
            r23 = r0
            r0 = r1
            r52 = r39
            r1 = r44
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentList r2 = r0.parseSegmentList(r1, r2, r3, r5, r7, r9, r11)
            r4 = r2
            r3 = r13
            r6 = r20
            r5 = r23
            r2 = r38
            r23 = r9
            r9 = r36
            goto L33f
        L2d5:
            r23 = r0
            r0 = r1
            r1 = r2
            r52 = r9
            java.lang.String r2 = "SegmentTemplate"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto L303
            long r10 = r0.parseAvailabilityTimeOffsetUs(r1, r5)
            r2 = r4
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentTemplate r2 = (androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTemplate) r2
            r4 = r53
            r8 = r7
            r3 = r13
            r6 = r47
            r12 = r55
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentTemplate r2 = r0.parseSegmentTemplate(r1, r2, r3, r4, r6, r8, r10, r12)
            r7 = r8
            r4 = r2
            r6 = r20
            r5 = r23
            r9 = r36
            r2 = r38
            r23 = r10
            goto L33f
        L303:
            r3 = r13
            java.lang.String r0 = "InbandEventStream"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r0)
            if (r2 == 0) goto L318
            androidx.media3.exoplayer.dash.manifest.Descriptor r0 = parseDescriptor(r1, r0)
            r2 = r38
            r2.add(r0)
            r9 = r36
            goto L337
        L318:
            r2 = r38
            java.lang.String r0 = "Label"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r0)
            if (r0 == 0) goto L32c
            androidx.media3.common.Label r0 = r43.parseLabel(r44)
            r9 = r36
            r9.add(r0)
            goto L337
        L32c:
            r9 = r36
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1)
            if (r0 == 0) goto L337
            r43.parseAdaptationSetChild(r44)
        L337:
            r41 = r5
            r5 = r23
            r23 = r41
            r6 = r20
        L33f:
            java.lang.String r0 = "AdaptationSet"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r1, r0)
            if (r0 == 0) goto L397
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r52.size()
            r0.<init>(r1)
            r1 = r31
        L352:
            int r4 = r52.size()
            if (r1 >= r4) goto L384
            r10 = r52
            java.lang.Object r4 = r10.get(r1)
            androidx.media3.exoplayer.dash.manifest.DashManifestParser$RepresentationInfo r4 = (androidx.media3.exoplayer.dash.manifest.DashManifestParser.RepresentationInfo) r4
            r44 = r43
            r50 = r2
            r45 = r4
            r47 = r9
            r46 = r30
            r48 = r33
            r49 = r37
            androidx.media3.exoplayer.dash.manifest.Representation r2 = r44.buildRepresentation(r45, r46, r47, r48, r49, r50)
            r9 = r46
            r36 = r47
            r38 = r50
            r0.add(r2)
            int r1 = r1 + 1
            r30 = r9
            r9 = r36
            r2 = r38
            goto L352
        L384:
            r44 = r43
            r48 = r0
            r51 = r3
            r47 = r5
            r49 = r16
            r50 = r19
            r45 = r28
            androidx.media3.exoplayer.dash.manifest.AdaptationSet r0 = r44.buildAdaptationSet(r45, r47, r48, r49, r50, r51)
            return r0
        L397:
            r0 = r43
            r10 = r15
            r13 = r16
            r12 = r17
            r11 = r35
            r15 = r3
            r17 = r4
            r3 = r7
            r16 = r9
            r8 = r14
            r7 = r19
            r9 = r21
            r14 = r37
            r21 = r52
            r19 = r2
            r2 = r40
            goto L94
    }

    public void parseAdaptationSetChild(org.xmlpull.v1.XmlPullParser r1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = this;
            maybeSkipTag(r1)
            return
    }

    public int parseAudioChannelConfiguration(org.xmlpull.v1.XmlPullParser r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r3 = this;
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = parseString(r4, r0, r1)
            r0.getClass()
            r1 = -1
            int r2 = r0.hashCode()
            switch(r2) {
                case -2128649360: goto L5d;
                case -1352850286: goto L51;
                case -1138141449: goto L45;
                case -986633423: goto L39;
                case -79006963: goto L2d;
                case 312179081: goto L21;
                case 2036691300: goto L15;
                default: goto L13;
            }
        L13:
            r0 = r1
            goto L68
        L15:
            java.lang.String r2 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1f
            goto L13
        L1f:
            r0 = 6
            goto L68
        L21:
            java.lang.String r2 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2b
            goto L13
        L2b:
            r0 = 5
            goto L68
        L2d:
            java.lang.String r2 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L37
            goto L13
        L37:
            r0 = 4
            goto L68
        L39:
            java.lang.String r2 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L43
            goto L13
        L43:
            r0 = 3
            goto L68
        L45:
            java.lang.String r2 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4f
            goto L13
        L4f:
            r0 = 2
            goto L68
        L51:
            java.lang.String r2 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            goto L13
        L5b:
            r0 = 1
            goto L68
        L5d:
            java.lang.String r2 = "urn:dts:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L67
            goto L13
        L67:
            r0 = 0
        L68:
            switch(r0) {
                case 0: goto L83;
                case 1: goto L7b;
                case 2: goto L76;
                case 3: goto L71;
                case 4: goto L83;
                case 5: goto L6c;
                case 6: goto L76;
                default: goto L6b;
            }
        L6b:
            goto L87
        L6c:
            int r1 = parseDtsxChannelConfiguration(r4)
            goto L87
        L71:
            int r1 = parseMpegChannelConfiguration(r4)
            goto L87
        L76:
            int r1 = parseDolbyChannelConfiguration(r4)
            goto L87
        L7b:
            java.lang.String r0 = "value"
            int r1 = parseInt(r4, r0, r1)
            goto L87
        L83:
            int r1 = parseDtsChannelConfiguration(r4)
        L87:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r4, r0)
            if (r0 == 0) goto L87
            return r1
    }

    public long parseAvailabilityTimeOffsetUs(org.xmlpull.v1.XmlPullParser r3, long r4) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "availabilityTimeOffset"
            java.lang.String r3 = r3.getAttributeValue(r0, r1)
            if (r3 != 0) goto La
            return r4
        La:
            java.lang.String r4 = "INF"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L18
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r3
        L18:
            float r3 = java.lang.Float.parseFloat(r3)
            r4 = 1232348160(0x49742400, float:1000000.0)
            float r3 = r3 * r4
            long r3 = (long) r3
            return r3
    }

    public java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> parseBaseUrl(org.xmlpull.v1.XmlPullParser r9, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> r10, boolean r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r8 = this;
            java.lang.String r0 = "dvb:priority"
            r1 = 0
            java.lang.String r0 = r9.getAttributeValue(r1, r0)
            r2 = 1
            if (r0 == 0) goto Lf
            int r0 = java.lang.Integer.parseInt(r0)
            goto L15
        Lf:
            if (r11 == 0) goto L13
            r0 = r2
            goto L15
        L13:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L15:
            java.lang.String r3 = "dvb:weight"
            java.lang.String r3 = r9.getAttributeValue(r1, r3)
            if (r3 == 0) goto L21
            int r2 = java.lang.Integer.parseInt(r3)
        L21:
            java.lang.String r3 = "serviceLocation"
            java.lang.String r1 = r9.getAttributeValue(r1, r3)
            java.lang.String r3 = "BaseURL"
            java.lang.String r9 = parseText(r9, r3)
            boolean r3 = androidx.media3.common.util.UriUtil.isAbsolute(r9)
            if (r3 == 0) goto L45
            if (r1 != 0) goto L37
            r1 = r9
        L37:
            androidx.media3.exoplayer.dash.manifest.BaseUrl r10 = new androidx.media3.exoplayer.dash.manifest.BaseUrl
            r10.<init>(r9, r1, r0, r2)
            androidx.media3.exoplayer.dash.manifest.BaseUrl[] r9 = new androidx.media3.exoplayer.dash.manifest.BaseUrl[]{r10}
            java.util.ArrayList r9 = com.google.common.collect.Lists.newArrayList(r9)
            return r9
        L45:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
        L4b:
            int r5 = r10.size()
            if (r4 >= r5) goto L75
            java.lang.Object r5 = r10.get(r4)
            androidx.media3.exoplayer.dash.manifest.BaseUrl r5 = (androidx.media3.exoplayer.dash.manifest.BaseUrl) r5
            java.lang.String r6 = r5.url
            java.lang.String r6 = androidx.media3.common.util.UriUtil.resolve(r6, r9)
            if (r1 != 0) goto L61
            r7 = r6
            goto L62
        L61:
            r7 = r1
        L62:
            if (r11 == 0) goto L6a
            int r0 = r5.priority
            int r2 = r5.weight
            java.lang.String r7 = r5.serviceLocation
        L6a:
            androidx.media3.exoplayer.dash.manifest.BaseUrl r5 = new androidx.media3.exoplayer.dash.manifest.BaseUrl
            r5.<init>(r6, r7, r0, r2)
            r3.add(r5)
            int r4 = r4 + 1
            goto L4b
        L75:
            return r3
    }

    public android.util.Pair<java.lang.String, androidx.media3.common.DrmInitData.SchemeData> parseContentProtection(org.xmlpull.v1.XmlPullParser r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r11 = this;
            r0 = 1
            java.lang.String r1 = "schemeIdUri"
            r2 = 0
            java.lang.String r1 = r12.getAttributeValue(r2, r1)
            java.lang.String r3 = "MpdParser"
            r4 = 0
            if (r1 == 0) goto L9f
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase(r1)
            r1.getClass()
            r5 = -1
            int r6 = r1.hashCode()
            switch(r6) {
                case -1980789791: goto L42;
                case 489446379: goto L36;
                case 755418770: goto L2a;
                case 1812765994: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L4d
        L1e:
            java.lang.String r6 = "urn:mpeg:dash:mp4protection:2011"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L28
            goto L4d
        L28:
            r5 = 3
            goto L4d
        L2a:
            java.lang.String r6 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L34
            goto L4d
        L34:
            r5 = 2
            goto L4d
        L36:
            java.lang.String r6 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L40
            goto L4d
        L40:
            r5 = r0
            goto L4d
        L42:
            java.lang.String r6 = "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L4c
            goto L4d
        L4c:
            r5 = r4
        L4d:
            switch(r5) {
                case 0: goto L9c;
                case 1: goto L99;
                case 2: goto L94;
                case 3: goto L51;
                default: goto L50;
            }
        L50:
            goto L9f
        L51:
            java.lang.String r1 = "value"
            java.lang.String r1 = r12.getAttributeValue(r2, r1)
            java.lang.String r5 = "default_KID"
            java.lang.String r5 = androidx.media3.common.util.XmlPullParserUtil.getAttributeValueIgnorePrefix(r12, r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L8b
            java.lang.String r6 = "00000000-0000-0000-0000-000000000000"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L8b
            java.lang.String r6 = "\\s+"
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            java.util.UUID[] r6 = new java.util.UUID[r6]
            r7 = r4
        L76:
            int r8 = r5.length
            if (r7 >= r8) goto L83
            r8 = r5[r7]
            java.util.UUID r8 = java.util.UUID.fromString(r8)
            r6[r7] = r8
            int r7 = r7 + r0
            goto L76
        L83:
            java.util.UUID r0 = androidx.media3.common.C2711C.COMMON_PSSH_UUID
            byte[] r5 = androidx.media3.extractor.mp4.PsshAtomUtil.buildPsshAtom(r0, r6, r2)
            r6 = r2
            goto La2
        L8b:
            java.lang.String r0 = "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute."
            androidx.media3.common.util.Log.m2961w(r3, r0)
            r0 = r2
            r5 = r0
        L92:
            r6 = r5
            goto La2
        L94:
            java.util.UUID r0 = androidx.media3.common.C2711C.WIDEVINE_UUID
        L96:
            r1 = r2
        L97:
            r5 = r1
            goto L92
        L99:
            java.util.UUID r0 = androidx.media3.common.C2711C.PLAYREADY_UUID
            goto L96
        L9c:
            java.util.UUID r0 = androidx.media3.common.C2711C.CLEARKEY_UUID
            goto L96
        L9f:
            r0 = r2
            r1 = r0
            goto L97
        La2:
            r12.next()
            java.lang.String r7 = "clearkey:Laurl"
            boolean r7 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r12, r7)
            r8 = 4
            if (r7 != 0) goto Lb6
            java.lang.String r7 = "dashif:Laurl"
            boolean r7 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r12, r7)
            if (r7 == 0) goto Lc1
        Lb6:
            int r7 = r12.next()
            if (r7 != r8) goto Lc1
            java.lang.String r6 = r12.getText()
            goto L123
        Lc1:
            java.lang.String r7 = "ms:laurl"
            boolean r7 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r12, r7)
            if (r7 == 0) goto Ld0
            java.lang.String r6 = "licenseUrl"
            java.lang.String r6 = r12.getAttributeValue(r2, r6)
            goto L123
        Ld0:
            if (r5 != 0) goto Lfb
            java.lang.String r7 = "pssh"
            boolean r7 = androidx.media3.common.util.XmlPullParserUtil.isStartTagIgnorePrefix(r12, r7)
            if (r7 == 0) goto Lfb
            int r7 = r12.next()
            if (r7 != r8) goto Lfb
            java.lang.String r0 = r12.getText()
            byte[] r0 = android.util.Base64.decode(r0, r4)
            java.util.UUID r5 = androidx.media3.extractor.mp4.PsshAtomUtil.parseUuid(r0)
            if (r5 != 0) goto Lf7
            java.lang.String r0 = "Skipping malformed cenc:pssh data"
            androidx.media3.common.util.Log.m2961w(r3, r0)
            r0 = r5
            r5 = r2
            goto L123
        Lf7:
            r10 = r5
            r5 = r0
            r0 = r10
            goto L123
        Lfb:
            if (r5 != 0) goto L120
            java.util.UUID r7 = androidx.media3.common.C2711C.PLAYREADY_UUID
            boolean r9 = r7.equals(r0)
            if (r9 == 0) goto L120
            java.lang.String r9 = "mspr:pro"
            boolean r9 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r12, r9)
            if (r9 == 0) goto L120
            int r9 = r12.next()
            if (r9 != r8) goto L120
            java.lang.String r5 = r12.getText()
            byte[] r5 = android.util.Base64.decode(r5, r4)
            byte[] r5 = androidx.media3.extractor.mp4.PsshAtomUtil.buildPsshAtom(r7, r5)
            goto L123
        L120:
            maybeSkipTag(r12)
        L123:
            java.lang.String r7 = "ContentProtection"
            boolean r7 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r12, r7)
            if (r7 == 0) goto La2
            if (r0 == 0) goto L135
            androidx.media3.common.DrmInitData$SchemeData r2 = new androidx.media3.common.DrmInitData$SchemeData
            java.lang.String r12 = "video/mp4"
            r2.<init>(r0, r6, r12, r5)
        L135:
            android.util.Pair r12 = android.util.Pair.create(r1, r2)
            return r12
    }

    public int parseContentType(org.xmlpull.v1.XmlPullParser r3) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "contentType"
            java.lang.String r3 = r3.getAttributeValue(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = -1
            if (r0 == 0) goto Lf
            return r1
        Lf:
            java.lang.String r0 = "audio"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L19
            r3 = 1
            return r3
        L19:
            java.lang.String r0 = "video"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L24
            r3 = 2
            return r3
        L24:
            java.lang.String r0 = "text"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2f
            r3 = 3
            return r3
        L2f:
            java.lang.String r0 = "image"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L39
            r3 = 4
            return r3
        L39:
            return r1
    }

    public android.util.Pair<java.lang.Long, androidx.media3.extractor.metadata.emsg.EventMessage> parseEvent(org.xmlpull.v1.XmlPullParser r18, java.lang.String r19, java.lang.String r20, long r21, long r23, java.io.ByteArrayOutputStream r25) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            r17 = this;
            r0 = r18
            java.lang.String r1 = "id"
            r2 = 0
            long r7 = parseLong(r0, r1, r2)
            java.lang.String r1 = "duration"
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r9 = parseLong(r0, r1, r4)
            java.lang.String r1 = "presentationTime"
            long r1 = parseLong(r0, r1, r2)
            r11 = 1000(0x3e8, double:4.94E-321)
            r13 = r21
            long r9 = androidx.media3.common.util.Util.scaleLargeTimestamp(r9, r11, r13)
            long r11 = r1 - r23
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r21
            long r1 = androidx.media3.common.util.Util.scaleLargeTimestamp(r11, r13, r15)
            java.lang.String r3 = "messageData"
            r4 = 0
            java.lang.String r3 = parseString(r0, r3, r4)
            r4 = r17
            r5 = r25
            byte[] r0 = r4.parseEventObject(r0, r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            if (r3 != 0) goto L4a
        L44:
            r5 = r19
            r6 = r20
            r11 = r0
            goto L4f
        L4a:
            byte[] r0 = androidx.media3.common.util.Util.getUtf8Bytes(r3)
            goto L44
        L4f:
            androidx.media3.extractor.metadata.emsg.EventMessage r0 = r4.buildEvent(r5, r6, r7, r9, r11)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
    }

    public byte[] parseEventObject(org.xmlpull.v1.XmlPullParser r6, java.io.ByteArrayOutputStream r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r5 = this;
            r7.reset()
            org.xmlpull.v1.XmlSerializer r0 = android.util.Xml.newSerializer()
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = r1.name()
            r0.setOutput(r7, r1)
            r6.nextToken()
        L13:
            java.lang.String r1 = "Event"
            boolean r1 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r6, r1)
            if (r1 != 0) goto L9c
            int r1 = r6.getEventType()
            switch(r1) {
                case 0: goto L91;
                case 1: goto L8d;
                case 2: goto L69;
                case 3: goto L5d;
                case 4: goto L55;
                case 5: goto L4d;
                case 6: goto L45;
                case 7: goto L3d;
                case 8: goto L35;
                case 9: goto L2d;
                case 10: goto L24;
                default: goto L22;
            }
        L22:
            goto L97
        L24:
            java.lang.String r1 = r6.getText()
            r0.docdecl(r1)
            goto L97
        L2d:
            java.lang.String r1 = r6.getText()
            r0.comment(r1)
            goto L97
        L35:
            java.lang.String r1 = r6.getText()
            r0.processingInstruction(r1)
            goto L97
        L3d:
            java.lang.String r1 = r6.getText()
            r0.ignorableWhitespace(r1)
            goto L97
        L45:
            java.lang.String r1 = r6.getText()
            r0.entityRef(r1)
            goto L97
        L4d:
            java.lang.String r1 = r6.getText()
            r0.cdsect(r1)
            goto L97
        L55:
            java.lang.String r1 = r6.getText()
            r0.text(r1)
            goto L97
        L5d:
            java.lang.String r1 = r6.getNamespace()
            java.lang.String r2 = r6.getName()
            r0.endTag(r1, r2)
            goto L97
        L69:
            java.lang.String r1 = r6.getNamespace()
            java.lang.String r2 = r6.getName()
            r0.startTag(r1, r2)
            r1 = 0
        L75:
            int r2 = r6.getAttributeCount()
            if (r1 >= r2) goto L97
            java.lang.String r2 = r6.getAttributeNamespace(r1)
            java.lang.String r3 = r6.getAttributeName(r1)
            java.lang.String r4 = r6.getAttributeValue(r1)
            r0.attribute(r2, r3, r4)
            int r1 = r1 + 1
            goto L75
        L8d:
            r0.endDocument()
            goto L97
        L91:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2 = 0
            r0.startDocument(r2, r1)
        L97:
            r6.nextToken()
            goto L13
        L9c:
            r0.flush()
            byte[] r6 = r7.toByteArray()
            return r6
    }

    public androidx.media3.exoplayer.dash.manifest.EventStream parseEventStream(org.xmlpull.v1.XmlPullParser r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r11 = this;
            java.lang.String r0 = "schemeIdUri"
            java.lang.String r1 = ""
            java.lang.String r3 = parseString(r12, r0, r1)
            java.lang.String r0 = "value"
            java.lang.String r4 = parseString(r12, r0, r1)
            java.lang.String r0 = "timescale"
            r1 = 1
            long r5 = parseLong(r12, r0, r1)
            java.lang.String r0 = "presentationTimeOffset"
            r1 = 0
            long r8 = parseLong(r12, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream
            r1 = 512(0x200, float:7.17E-43)
            r10.<init>(r1)
        L2e:
            r12.next()
            java.lang.String r1 = "Event"
            boolean r1 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r12, r1)
            if (r1 == 0) goto L46
            r2 = r11
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r12
            android.util.Pair r12 = r2.parseEvent(r3, r4, r5, r6, r8, r10)
            r0.add(r12)
            goto L4d
        L46:
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r12
            maybeSkipTag(r3)
        L4d:
            java.lang.String r12 = "EventStream"
            boolean r12 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r3, r12)
            if (r12 == 0) goto L8b
            int r12 = r0.size()
            long[] r12 = new long[r12]
            int r1 = r0.size()
            androidx.media3.extractor.metadata.emsg.EventMessage[] r8 = new androidx.media3.extractor.metadata.emsg.EventMessage[r1]
            r1 = 0
        L62:
            int r2 = r0.size()
            if (r1 >= r2) goto L81
            java.lang.Object r2 = r0.get(r1)
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r9 = r3.longValue()
            r12[r1] = r9
            java.lang.Object r2 = r2.second
            androidx.media3.extractor.metadata.emsg.EventMessage r2 = (androidx.media3.extractor.metadata.emsg.EventMessage) r2
            r8[r1] = r2
            int r1 = r1 + 1
            goto L62
        L81:
            r2 = r11
            r3 = r4
            r4 = r5
            r5 = r6
            r7 = r12
            androidx.media3.exoplayer.dash.manifest.EventStream r12 = r2.buildEventStream(r3, r4, r5, r7, r8)
            return r12
        L8b:
            r12 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            goto L2e
    }

    public androidx.media3.exoplayer.dash.manifest.RangedUri parseInitialization(org.xmlpull.v1.XmlPullParser r3) {
            r2 = this;
            java.lang.String r0 = "sourceURL"
            java.lang.String r1 = "range"
            androidx.media3.exoplayer.dash.manifest.RangedUri r3 = r2.parseRangedUrl(r3, r0, r1)
            return r3
    }

    public androidx.media3.common.Label parseLabel(org.xmlpull.v1.XmlPullParser r3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "lang"
            java.lang.String r0 = r3.getAttributeValue(r0, r1)
            java.lang.String r1 = "Label"
            java.lang.String r3 = parseText(r3, r1)
            androidx.media3.common.Label r1 = new androidx.media3.common.Label
            r1.<init>(r0, r3)
            return r1
    }

    public androidx.media3.exoplayer.dash.manifest.DashManifest parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser r39, android.net.Uri r40) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r38 = this;
            r0 = r38
            r1 = r39
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r4 = "profiles"
            java.lang.String[] r3 = r0.parseProfiles(r1, r4, r3)
            boolean r11 = r0.isDvbProfileDeclared(r3)
            java.lang.String r3 = "availabilityStartTime"
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r7 = parseDateTime(r1, r3, r12)
            java.lang.String r3 = "mediaPresentationDuration"
            long r14 = parseDuration(r1, r3, r12)
            java.lang.String r3 = "minBufferTime"
            long r16 = parseDuration(r1, r3, r12)
            java.lang.String r3 = "type"
            r4 = 0
            java.lang.String r3 = r1.getAttributeValue(r4, r3)
            java.lang.String r5 = "dynamic"
            boolean r18 = r5.equals(r3)
            if (r18 == 0) goto L42
            java.lang.String r3 = "minimumUpdatePeriod"
            long r5 = parseDuration(r1, r3, r12)
            r19 = r5
            goto L44
        L42:
            r19 = r12
        L44:
            if (r18 == 0) goto L4f
            java.lang.String r3 = "timeShiftBufferDepth"
            long r5 = parseDuration(r1, r3, r12)
            r9 = r5
            goto L50
        L4f:
            r9 = r12
        L50:
            if (r18 == 0) goto L5c
            java.lang.String r3 = "suggestedPresentationDelay"
            long r5 = parseDuration(r1, r3, r12)
            r21 = r5
            goto L5e
        L5c:
            r21 = r12
        L5e:
            java.lang.String r3 = "publishTime"
            long r23 = parseDateTime(r1, r3, r12)
            r5 = 0
            if (r18 == 0) goto L6c
            r25 = r5
            goto L6e
        L6c:
            r25 = r12
        L6e:
            androidx.media3.exoplayer.dash.manifest.BaseUrl r3 = new androidx.media3.exoplayer.dash.manifest.BaseUrl
            java.lang.String r2 = r40.toString()
            java.lang.String r4 = r40.toString()
            r29 = r12
            r12 = 1
            if (r11 == 0) goto L7f
            r13 = r12
            goto L81
        L7f:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
        L81:
            r3.<init>(r2, r4, r13, r12)
            androidx.media3.exoplayer.dash.manifest.BaseUrl[] r2 = new androidx.media3.exoplayer.dash.manifest.BaseUrl[]{r3}
            java.util.ArrayList r13 = com.google.common.collect.Lists.newArrayList(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r18 == 0) goto L9a
            r5 = r29
        L9a:
            r31 = r13
            r12 = r25
            r25 = 0
            r27 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
        Laa:
            r1.next()
            java.lang.String r4 = "BaseURL"
            boolean r4 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r4)
            if (r4 == 0) goto Ld0
            if (r27 != 0) goto Lbd
            long r12 = r0.parseAvailabilityTimeOffsetUs(r1, r12)
            r27 = 1
        Lbd:
            r4 = r31
            r31 = r2
            java.util.List r2 = r0.parseBaseUrl(r1, r4, r11)
            r3.addAll(r2)
        Lc8:
            r28 = r3
            r2 = r31
            r31 = r4
            goto L193
        Ld0:
            r4 = r31
            r31 = r2
            java.lang.String r2 = "ProgramInformation"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto Le1
            androidx.media3.exoplayer.dash.manifest.ProgramInformation r32 = r38.parseProgramInformation(r39)
            goto Lc8
        Le1:
            java.lang.String r2 = "UTCTiming"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto Lee
            androidx.media3.exoplayer.dash.manifest.UtcTimingElement r33 = r38.parseUtcTiming(r39)
            goto Lc8
        Lee:
            java.lang.String r2 = "Location"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto L103
            java.lang.String r2 = r40.toString()
            java.lang.String r0 = r1.nextText()
            android.net.Uri r34 = androidx.media3.common.util.UriUtil.resolveToUri(r2, r0)
            goto Lc8
        L103:
            java.lang.String r0 = "ServiceDescription"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r0)
            if (r0 == 0) goto L110
            androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement r35 = r38.parseServiceDescription(r39)
            goto Lc8
        L110:
            java.lang.String r0 = "Period"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r0)
            if (r0 == 0) goto L187
            if (r25 != 0) goto L187
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L12f
            r2 = r3
            r28 = r2
            r37 = r31
            r31 = r4
            r3 = r5
            r5 = r12
            r13 = r37
        L12b:
            r0 = r38
            r12 = 0
            goto L139
        L12f:
            r28 = r3
            r2 = r4
            r3 = r5
            r5 = r12
            r13 = r31
            r31 = r2
            goto L12b
        L139:
            android.util.Pair r2 = r0.parsePeriod(r1, r2, r3, r5, r7, r9, r11)
            java.lang.Object r0 = r2.first
            androidx.media3.exoplayer.dash.manifest.Period r0 = (androidx.media3.exoplayer.dash.manifest.Period) r0
            r36 = r13
            long r12 = r0.startMs
            int r12 = (r12 > r29 ? 1 : (r12 == r29 ? 0 : -1))
            if (r12 != 0) goto L16b
            if (r18 == 0) goto L150
            r2 = r36
            r25 = 1
            goto L184
        L150:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to determine start of period "
            r0.append(r1)
            int r1 = r36.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.createForMalformedManifest(r0, r12)
            throw r0
        L16b:
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r4 = (r2 > r29 ? 1 : (r2 == r29 ? 0 : -1))
            if (r4 != 0) goto L17c
            r12 = r29
        L179:
            r2 = r36
            goto L180
        L17c:
            long r12 = r0.startMs
            long r12 = r12 + r2
            goto L179
        L180:
            r2.add(r0)
            r3 = r12
        L184:
            r12 = r5
            r5 = r3
            goto L193
        L187:
            r28 = r3
            r2 = r31
            r31 = r4
            r3 = r5
            r5 = r12
            maybeSkipTag(r1)
            goto L184
        L193:
            java.lang.String r0 = "MPD"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r1, r0)
            if (r0 == 0) goto L1de
            int r0 = (r14 > r29 ? 1 : (r14 == r29 ? 0 : -1))
            if (r0 != 0) goto L1a8
            int r0 = (r5 > r29 ? 1 : (r5 == r29 ? 0 : -1))
            if (r0 == 0) goto L1a6
            r4 = r5
            r12 = 0
            goto L1b3
        L1a6:
            if (r18 == 0) goto L1aa
        L1a8:
            r12 = 0
            goto L1b2
        L1aa:
            java.lang.String r0 = "Unable to determine duration of static manifest."
            r12 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.createForMalformedManifest(r0, r12)
            throw r0
        L1b2:
            r4 = r14
        L1b3:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1d6
            r1 = r38
            r11 = r9
            r9 = r19
            r13 = r21
            r20 = r34
            r19 = r35
            r21 = r2
            r2 = r7
            r6 = r16
            r8 = r18
            r15 = r23
            r17 = r32
            r18 = r33
            androidx.media3.exoplayer.dash.manifest.DashManifest r0 = r1.buildMediaPresentationDescription(r2, r4, r6, r8, r9, r11, r13, r15, r17, r18, r19, r20, r21)
            return r0
        L1d6:
            r0 = r12
            java.lang.String r1 = "No periods found."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.createForMalformedManifest(r1, r0)
            throw r0
        L1de:
            r36 = r2
            r2 = r16
            r4 = r18
            r17 = r32
            r18 = r33
            r32 = r23
            r23 = r21
            r21 = r9
            r9 = r19
            r20 = r34
            r19 = r35
            r0 = r38
            r19 = r9
            r9 = r21
            r21 = r23
            r23 = r32
            r32 = r17
            r33 = r18
            r16 = r2
            r18 = r4
            r3 = r28
            r2 = r36
            goto Laa
    }

    public android.util.Pair<androidx.media3.exoplayer.dash.manifest.Period, java.lang.Long> parsePeriod(org.xmlpull.v1.XmlPullParser r33, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> r34, long r35, long r37, long r39, long r41, boolean r43) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r32 = this;
            r0 = r32
            r1 = r33
            java.lang.String r2 = "id"
            r15 = 0
            java.lang.String r16 = r1.getAttributeValue(r15, r2)
            java.lang.String r2 = "start"
            r3 = r35
            long r17 = parseDuration(r1, r2, r3)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r39 > r2 ? 1 : (r39 == r2 ? 0 : -1))
            if (r4 == 0) goto L20
            long r4 = r39 + r17
            goto L21
        L20:
            r4 = r2
        L21:
            java.lang.String r6 = "duration"
            long r6 = parseDuration(r1, r6, r2)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r11 = 0
            r13 = r2
            r20 = r9
            r19 = r11
            r21 = r15
            r11 = r37
            r2 = r8
            r3 = r21
            r8 = r13
        L44:
            r1.next()
            java.lang.String r13 = "BaseURL"
            boolean r13 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r13)
            if (r13 == 0) goto L7b
            if (r19 != 0) goto L57
            long r11 = r0.parseAvailabilityTimeOffsetUs(r1, r11)
            r19 = 1
        L57:
            r13 = r34
            r14 = r43
            java.util.List r15 = r0.parseBaseUrl(r1, r13, r14)
            r10.addAll(r15)
            r24 = r2
            r26 = r8
            r28 = r11
            r25 = r20
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r22 = 0
            r8 = r4
            r12 = r6
            r20 = r10
            r6 = r21
            r7 = r1
        L78:
            r10 = r3
            goto L184
        L7b:
            r13 = r34
            r14 = r43
            java.lang.String r15 = "AdaptationSet"
            boolean r15 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r15)
            if (r15 == 0) goto Lc2
            boolean r15 = r10.isEmpty()
            if (r15 != 0) goto L9c
            r15 = r2
            r2 = r10
            r25 = r20
            r20 = r2
        L93:
            r30 = r11
            r12 = r41
            r10 = r4
            r4 = r6
            r6 = r30
            goto La3
        L9c:
            r15 = r2
            r2 = r13
            r25 = r20
            r20 = r10
            goto L93
        La3:
            androidx.media3.exoplayer.dash.manifest.AdaptationSet r2 = r0.parseAdaptationSet(r1, r2, r3, r4, r6, r8, r10, r12, r14)
            r30 = r6
            r6 = r4
            r4 = r10
            r10 = r8
            r8 = r30
            r15.add(r2)
        Lb1:
            r35 = r3
            r12 = r6
            r24 = r15
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r22 = 0
            r7 = r1
            r0 = r8
            r8 = r4
            goto L177
        Lc2:
            r15 = r2
            r25 = r20
            r20 = r10
            r30 = r11
            r10 = r8
            r8 = r30
            java.lang.String r2 = "EventStream"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto Lde
            androidx.media3.exoplayer.dash.manifest.EventStream r2 = r32.parseEventStream(r33)
            r14 = r25
            r14.add(r2)
            goto Lb1
        Lde:
            r14 = r25
            java.lang.String r2 = "SegmentBase"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto L104
            r13 = 0
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SingleSegmentBase r3 = r0.parseSegmentBase(r1, r13)
            r28 = r8
            r26 = r10
            r22 = r13
            r25 = r14
            r24 = r15
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = r3
        Lfd:
            r8 = r4
            r12 = r6
            r6 = r21
            r7 = r1
            goto L184
        L104:
            r13 = 0
            java.lang.String r2 = "SegmentList"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto L135
            r22 = r4
            r5 = r6
            r7 = r8
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r9 = r0.parseAvailabilityTimeOffsetUs(r1, r2)
            r3 = r2
            r2 = 0
            r11 = r41
            r25 = r14
            r24 = r15
            r14 = r3
            r3 = r22
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentList r2 = r0.parseSegmentList(r1, r2, r3, r5, r7, r9, r11)
            r10 = r9
            r8 = r7
            r6 = r5
            r4 = r3
            r28 = r8
            r26 = r10
            r22 = r13
            r10 = r2
            goto Lfd
        L135:
            r35 = r3
            r25 = r14
            r24 = r15
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r2 = "SegmentTemplate"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto L165
            long r10 = r0.parseAvailabilityTimeOffsetUs(r1, r14)
            r2 = 0
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.m13439of()
            r22 = r13
            r12 = r41
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentTemplate r3 = r0.parseSegmentTemplate(r1, r2, r3, r4, r6, r8, r10, r12)
            r12 = r6
            r7 = r1
            r0 = r8
            r8 = r4
            r28 = r0
            r26 = r10
            r6 = r21
            goto L78
        L165:
            r22 = r13
            r12 = r6
            r7 = r1
            r0 = r8
            r8 = r4
            java.lang.String r2 = "AssetIdentifier"
            boolean r3 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r7, r2)
            if (r3 == 0) goto L180
            androidx.media3.exoplayer.dash.manifest.Descriptor r21 = parseDescriptor(r7, r2)
        L177:
            r28 = r0
            r26 = r10
            r6 = r21
            r10 = r35
            goto L184
        L180:
            maybeSkipTag(r7)
            goto L177
        L184:
            java.lang.String r0 = "Period"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r7, r0)
            if (r0 == 0) goto L1a3
            r0 = r32
            r1 = r16
            r2 = r17
            r4 = r24
            r5 = r25
            androidx.media3.exoplayer.dash.manifest.Period r1 = r0.buildPeriod(r1, r2, r4, r5, r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
        L1a3:
            r0 = r32
            r21 = r6
            r1 = r7
            r4 = r8
            r3 = r10
            r6 = r12
            r13 = r14
            r10 = r20
            r15 = r22
            r2 = r24
            r20 = r25
            r8 = r26
            r11 = r28
            goto L44
    }

    public java.lang.String[] parseProfiles(org.xmlpull.v1.XmlPullParser r2, java.lang.String r3, java.lang.String[] r4) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r2.getAttributeValue(r0, r3)
            if (r2 != 0) goto L8
            return r4
        L8:
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            return r2
    }

    public androidx.media3.exoplayer.dash.manifest.ProgramInformation parseProgramInformation(org.xmlpull.v1.XmlPullParser r9) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            r8 = this;
            java.lang.String r0 = "moreInformationURL"
            r1 = 0
            java.lang.String r6 = parseString(r9, r0, r1)
            java.lang.String r0 = "lang"
            java.lang.String r7 = parseString(r9, r0, r1)
            r0 = r1
            r2 = r0
        Lf:
            r9.next()
            java.lang.String r3 = "Title"
            boolean r3 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r9, r3)
            if (r3 == 0) goto L22
            java.lang.String r1 = r9.nextText()
        L1e:
            r4 = r0
            r3 = r1
            r5 = r2
            goto L40
        L22:
            java.lang.String r3 = "Source"
            boolean r3 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r9, r3)
            if (r3 == 0) goto L2f
            java.lang.String r0 = r9.nextText()
            goto L1e
        L2f:
            java.lang.String r3 = "Copyright"
            boolean r3 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r9, r3)
            if (r3 == 0) goto L3c
            java.lang.String r2 = r9.nextText()
            goto L1e
        L3c:
            maybeSkipTag(r9)
            goto L1e
        L40:
            java.lang.String r0 = "ProgramInformation"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r9, r0)
            if (r0 == 0) goto L4e
            androidx.media3.exoplayer.dash.manifest.ProgramInformation r2 = new androidx.media3.exoplayer.dash.manifest.ProgramInformation
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L4e:
            r1 = r3
            r0 = r4
            r2 = r5
            goto Lf
    }

    public androidx.media3.exoplayer.dash.manifest.RangedUri parseRangedUrl(org.xmlpull.v1.XmlPullParser r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r0 = 0
            java.lang.String r2 = r8.getAttributeValue(r0, r9)
            java.lang.String r8 = r8.getAttributeValue(r0, r10)
            r9 = -1
            if (r8 == 0) goto L2e
            java.lang.String r0 = "-"
            java.lang.String[] r8 = r8.split(r0)
            r0 = 0
            r0 = r8[r0]
            long r0 = java.lang.Long.parseLong(r0)
            int r3 = r8.length
            r4 = 2
            if (r3 != r4) goto L2a
            r9 = 1
            r8 = r8[r9]
            long r8 = java.lang.Long.parseLong(r8)
            long r8 = r8 - r0
            r3 = 1
            long r9 = r8 + r3
        L2a:
            r5 = r9
            r3 = r0
            r1 = r7
            goto L31
        L2e:
            r0 = 0
            goto L2a
        L31:
            androidx.media3.exoplayer.dash.manifest.RangedUri r8 = r1.buildRangedUri(r2, r3, r5)
            return r8
    }

    public androidx.media3.exoplayer.dash.manifest.DashManifestParser.RepresentationInfo parseRepresentation(org.xmlpull.v1.XmlPullParser r33, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> r34, @androidx.annotation.Nullable java.lang.String r35, @androidx.annotation.Nullable java.lang.String r36, int r37, int r38, float r39, int r40, int r41, @androidx.annotation.Nullable java.lang.String r42, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r43, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r44, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r45, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r46, @androidx.annotation.Nullable androidx.media3.exoplayer.dash.manifest.SegmentBase r47, long r48, long r50, long r52, long r54, long r56, boolean r58) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r32 = this;
            r0 = r32
            r1 = r33
            java.lang.String r2 = "id"
            r3 = 0
            java.lang.String r14 = r1.getAttributeValue(r3, r2)
            java.lang.String r2 = "bandwidth"
            r4 = -1
            int r15 = parseInt(r1, r2, r4)
            java.lang.String r2 = "mimeType"
            r4 = r35
            java.lang.String r16 = parseString(r1, r2, r4)
            java.lang.String r2 = "codecs"
            r4 = r36
            java.lang.String r17 = parseString(r1, r2, r4)
            java.lang.String r2 = "width"
            r4 = r37
            int r18 = parseInt(r1, r2, r4)
            java.lang.String r2 = "height"
            r4 = r38
            int r19 = parseInt(r1, r2, r4)
            r2 = r39
            float r20 = parseFrameRate(r1, r2)
            java.lang.String r2 = "audioSamplingRate"
            r4 = r41
            int r21 = parseInt(r1, r2, r4)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = r45
            r4.<init>(r5)
            r22 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r5 = r46
            r14.<init>(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            r23 = r40
            r9 = r54
            r24 = r3
            r25 = r7
            r3 = r47
            r7 = r52
        L6d:
            r1.next()
            java.lang.String r11 = "BaseURL"
            boolean r11 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r11)
            if (r11 == 0) goto La5
            if (r25 != 0) goto L80
            long r7 = r0.parseAvailabilityTimeOffsetUs(r1, r7)
            r25 = 1
        L80:
            r11 = r34
            r12 = r58
            r39 = r2
            java.util.List r2 = r0.parseBaseUrl(r1, r11, r12)
            r6.addAll(r2)
            r0 = r1
            r27 = r6
            r28 = r9
            r2 = r14
            r26 = r15
            r6 = r23
            r30 = r24
            r31 = r25
            r15 = r39
            r23 = r3
            r24 = r7
        La1:
            r14 = r13
            r13 = r4
            goto L1c0
        La5:
            r11 = r34
            r12 = r58
            r39 = r2
            java.lang.String r2 = "AudioChannelConfiguration"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto Lcb
            int r2 = r32.parseAudioChannelConfiguration(r33)
            r0 = r1
            r23 = r3
            r27 = r6
            r28 = r9
            r26 = r15
            r30 = r24
            r31 = r25
            r15 = r39
            r6 = r2
        Lc7:
            r24 = r7
            r2 = r14
            goto La1
        Lcb:
            java.lang.String r2 = "SegmentBase"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto Leb
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SingleSegmentBase r3 = (androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase) r3
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SingleSegmentBase r2 = r0.parseSegmentBase(r1, r3)
            r0 = r1
            r27 = r6
            r28 = r9
            r26 = r15
            r6 = r23
            r30 = r24
            r31 = r25
            r15 = r39
            r23 = r2
            goto Lc7
        Leb:
            java.lang.String r2 = "SegmentList"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto L121
            long r9 = r0.parseAvailabilityTimeOffsetUs(r1, r9)
            r2 = r3
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentList r2 = (androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentList) r2
            r11 = r56
            r27 = r6
            r41 = r14
            r26 = r15
            r15 = r39
            r5 = r50
            r14 = r4
            r3 = r48
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentList r2 = r0.parseSegmentList(r1, r2, r3, r5, r7, r9, r11)
            r0 = r14
            r14 = r13
            r13 = r0
            r0 = r1
            r28 = r9
        L113:
            r6 = r23
            r30 = r24
            r31 = r25
            r23 = r2
            r24 = r7
            r2 = r41
            goto L1c0
        L121:
            r27 = r6
            r41 = r14
            r26 = r15
            r15 = r39
            r14 = r4
            java.lang.String r2 = "SegmentTemplate"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto L150
            long r10 = r0.parseAvailabilityTimeOffsetUs(r1, r9)
            r2 = r3
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentTemplate r2 = (androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTemplate) r2
            r3 = r46
            r4 = r48
            r8 = r7
            r40 = r14
            r6 = r50
            r14 = r13
            r12 = r56
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentTemplate r2 = r0.parseSegmentTemplate(r1, r2, r3, r4, r6, r8, r10, r12)
            r0 = r1
            r7 = r8
            r13 = r40
            r28 = r10
            goto L113
        L150:
            r0 = r1
            r40 = r14
            r14 = r13
            java.lang.String r1 = "ContentProtection"
            boolean r1 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r1 == 0) goto L182
            android.util.Pair r1 = r32.parseContentProtection(r33)
            java.lang.Object r2 = r1.first
            if (r2 == 0) goto L168
            r24 = r2
            java.lang.String r24 = (java.lang.String) r24
        L168:
            java.lang.Object r1 = r1.second
            if (r1 == 0) goto L171
            androidx.media3.common.DrmInitData$SchemeData r1 = (androidx.media3.common.DrmInitData.SchemeData) r1
            r14.add(r1)
        L171:
            r13 = r40
        L173:
            r2 = r41
        L175:
            r28 = r9
            r6 = r23
            r30 = r24
            r31 = r25
            r23 = r3
            r24 = r7
            goto L1c0
        L182:
            java.lang.String r1 = "InbandEventStream"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r2 == 0) goto L194
            androidx.media3.exoplayer.dash.manifest.Descriptor r1 = parseDescriptor(r0, r1)
            r15.add(r1)
            r13 = r40
            goto L173
        L194:
            java.lang.String r1 = "EssentialProperty"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r2 == 0) goto L1a6
            androidx.media3.exoplayer.dash.manifest.Descriptor r1 = parseDescriptor(r0, r1)
            r13 = r40
            r13.add(r1)
            goto L173
        L1a6:
            r13 = r40
            java.lang.String r1 = "SupplementalProperty"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r2 == 0) goto L1ba
            androidx.media3.exoplayer.dash.manifest.Descriptor r1 = parseDescriptor(r0, r1)
            r2 = r41
            r2.add(r1)
            goto L175
        L1ba:
            r2 = r41
            maybeSkipTag(r0)
            goto L175
        L1c0:
            java.lang.String r1 = "Representation"
            boolean r1 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r0, r1)
            if (r1 == 0) goto L215
            r0 = r14
            r14 = r2
            r2 = r16
            r16 = r0
            r0 = r32
            r9 = r42
            r10 = r43
            r11 = r44
            r12 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r21
            r1 = r22
            r8 = r26
            androidx.media3.common.Format r1 = r0.buildFormat(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r23 == 0) goto L1eb
            goto L1f0
        L1eb:
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SingleSegmentBase r23 = new androidx.media3.exoplayer.dash.manifest.SegmentBase$SingleSegmentBase
            r23.<init>()
        L1f0:
            androidx.media3.exoplayer.dash.manifest.DashManifestParser$RepresentationInfo r0 = new androidx.media3.exoplayer.dash.manifest.DashManifestParser$RepresentationInfo
            boolean r2 = r27.isEmpty()
            if (r2 != 0) goto L1f9
            goto L1fb
        L1f9:
            r27 = r34
        L1fb:
            r2 = -1
            r33 = r0
            r34 = r1
            r42 = r2
            r40 = r13
            r41 = r14
            r39 = r15
            r38 = r16
            r36 = r23
            r35 = r27
            r37 = r30
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r0
        L215:
            r1 = r2
            r0 = r30
            r5 = r46
            r4 = r13
            r13 = r14
            r2 = r15
            r3 = r23
            r7 = r24
            r15 = r26
            r9 = r28
            r25 = r31
            r24 = r0
            r14 = r1
            r23 = r6
            r6 = r27
            r0 = r32
            r1 = r33
            goto L6d
    }

    public int parseRoleFlagsFromAccessibilityDescriptors(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r6) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r0 >= r2) goto L36
            java.lang.Object r2 = r6.get(r0)
            androidx.media3.exoplayer.dash.manifest.Descriptor r2 = (androidx.media3.exoplayer.dash.manifest.Descriptor) r2
            java.lang.String r3 = r2.schemeIdUri
            java.lang.String r4 = "urn:mpeg:dash:role:2011"
            boolean r3 = com.google.common.base.Ascii.equalsIgnoreCase(r4, r3)
            if (r3 == 0) goto L21
            java.lang.String r2 = r2.value
            int r2 = r5.parseRoleFlagsFromDashRoleScheme(r2)
        L1f:
            r1 = r1 | r2
            goto L33
        L21:
            java.lang.String r3 = "urn:tva:metadata:cs:AudioPurposeCS:2007"
            java.lang.String r4 = r2.schemeIdUri
            boolean r3 = com.google.common.base.Ascii.equalsIgnoreCase(r3, r4)
            if (r3 == 0) goto L33
            java.lang.String r2 = r2.value
            int r2 = r5.parseTvaAudioPurposeCsValue(r2)
            goto L1f
        L33:
            int r0 = r0 + 1
            goto L2
        L36:
            return r1
    }

    public int parseRoleFlagsFromDashRoleScheme(@androidx.annotation.Nullable java.lang.String r8) {
            r7 = this;
            r0 = 8
            r1 = 4
            r2 = 2
            r3 = 1
            r4 = 0
            if (r8 != 0) goto L9
            return r4
        L9:
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -2060497896: goto La7;
                case -1724546052: goto L9c;
                case -1580883024: goto L91;
                case -1574842690: goto L86;
                case -1408024454: goto L7b;
                case -1396432756: goto L70;
                case 99825: goto L65;
                case 3343801: goto L5a;
                case 3530173: goto L4c;
                case 552573414: goto L3e;
                case 899152809: goto L30;
                case 1629013393: goto L22;
                case 1855372047: goto L13;
                default: goto L11;
            }
        L11:
            goto Lb2
        L13:
            java.lang.String r6 = "supplementary"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L1e
            goto Lb2
        L1e:
            r5 = 12
            goto Lb2
        L22:
            java.lang.String r6 = "emergency"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L2c
            goto Lb2
        L2c:
            r5 = 11
            goto Lb2
        L30:
            java.lang.String r6 = "commentary"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L3a
            goto Lb2
        L3a:
            r5 = 10
            goto Lb2
        L3e:
            java.lang.String r6 = "caption"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L48
            goto Lb2
        L48:
            r5 = 9
            goto Lb2
        L4c:
            java.lang.String r6 = "sign"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L57
            goto Lb2
        L57:
            r5 = r0
            goto Lb2
        L5a:
            java.lang.String r6 = "main"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L63
            goto Lb2
        L63:
            r5 = 7
            goto Lb2
        L65:
            java.lang.String r6 = "dub"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L6e
            goto Lb2
        L6e:
            r5 = 6
            goto Lb2
        L70:
            java.lang.String r6 = "forced-subtitle"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L79
            goto Lb2
        L79:
            r5 = 5
            goto Lb2
        L7b:
            java.lang.String r6 = "alternate"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L84
            goto Lb2
        L84:
            r5 = r1
            goto Lb2
        L86:
            java.lang.String r6 = "forced_subtitle"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L8f
            goto Lb2
        L8f:
            r5 = 3
            goto Lb2
        L91:
            java.lang.String r6 = "enhanced-audio-intelligibility"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L9a
            goto Lb2
        L9a:
            r5 = r2
            goto Lb2
        L9c:
            java.lang.String r6 = "description"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto La5
            goto Lb2
        La5:
            r5 = r3
            goto Lb2
        La7:
            java.lang.String r6 = "subtitle"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto Lb1
            goto Lb2
        Lb1:
            r5 = r4
        Lb2:
            switch(r5) {
                case 0: goto Lcc;
                case 1: goto Lc9;
                case 2: goto Lc6;
                case 3: goto Lcc;
                case 4: goto Lc5;
                case 5: goto Lcc;
                case 6: goto Lc2;
                case 7: goto Lc1;
                case 8: goto Lbe;
                case 9: goto Lbb;
                case 10: goto Lba;
                case 11: goto Lb7;
                case 12: goto Lb6;
                default: goto Lb5;
            }
        Lb5:
            return r4
        Lb6:
            return r1
        Lb7:
            r8 = 32
            return r8
        Lba:
            return r0
        Lbb:
            r8 = 64
            return r8
        Lbe:
            r8 = 256(0x100, float:3.59E-43)
            return r8
        Lc1:
            return r3
        Lc2:
            r8 = 16
            return r8
        Lc5:
            return r2
        Lc6:
            r8 = 2048(0x800, float:2.87E-42)
            return r8
        Lc9:
            r8 = 512(0x200, float:7.17E-43)
            return r8
        Lcc:
            r8 = 128(0x80, float:1.8E-43)
            return r8
    }

    public int parseRoleFlagsFromProperties(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.size()
            if (r0 >= r2) goto L1d
            java.lang.Object r2 = r5.get(r0)
            androidx.media3.exoplayer.dash.manifest.Descriptor r2 = (androidx.media3.exoplayer.dash.manifest.Descriptor) r2
            java.lang.String r3 = "http://dashif.org/guidelines/trickmode"
            java.lang.String r2 = r2.schemeIdUri
            boolean r2 = com.google.common.base.Ascii.equalsIgnoreCase(r3, r2)
            if (r2 == 0) goto L1a
            r1 = 16384(0x4000, float:2.2959E-41)
        L1a:
            int r0 = r0 + 1
            goto L2
        L1d:
            return r1
    }

    public int parseRoleFlagsFromRoleDescriptors(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r6) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r0 >= r2) goto L23
            java.lang.Object r2 = r6.get(r0)
            androidx.media3.exoplayer.dash.manifest.Descriptor r2 = (androidx.media3.exoplayer.dash.manifest.Descriptor) r2
            java.lang.String r3 = r2.schemeIdUri
            java.lang.String r4 = "urn:mpeg:dash:role:2011"
            boolean r3 = com.google.common.base.Ascii.equalsIgnoreCase(r4, r3)
            if (r3 == 0) goto L20
            java.lang.String r2 = r2.value
            int r2 = r5.parseRoleFlagsFromDashRoleScheme(r2)
            r1 = r1 | r2
        L20:
            int r0 = r0 + 1
            goto L2
        L23:
            return r1
    }

    public androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase parseSegmentBase(org.xmlpull.v1.XmlPullParser r18, @androidx.annotation.Nullable androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 == 0) goto Lb
            long r4 = r1.timescale
            goto Lc
        Lb:
            r4 = r2
        Lc:
            java.lang.String r6 = "timescale"
            long r9 = parseLong(r0, r6, r4)
            r4 = 0
            if (r1 == 0) goto L1a
            long r6 = r1.presentationTimeOffset
            goto L1b
        L1a:
            r6 = r4
        L1b:
            java.lang.String r8 = "presentationTimeOffset"
            long r11 = parseLong(r0, r8, r6)
            if (r1 == 0) goto L27
            long r6 = r1.indexStart
            goto L28
        L27:
            r6 = r4
        L28:
            if (r1 == 0) goto L2c
            long r4 = r1.indexLength
        L2c:
            java.lang.String r8 = "indexRange"
            r13 = 0
            java.lang.String r8 = r0.getAttributeValue(r13, r8)
            if (r8 == 0) goto L4b
            java.lang.String r4 = "-"
            java.lang.String[] r4 = r8.split(r4)
            r5 = 0
            r5 = r4[r5]
            long r6 = java.lang.Long.parseLong(r5)
            r5 = 1
            r4 = r4[r5]
            long r4 = java.lang.Long.parseLong(r4)
            long r4 = r4 - r6
            long r4 = r4 + r2
        L4b:
            r15 = r4
            if (r1 == 0) goto L50
            androidx.media3.exoplayer.dash.manifest.RangedUri r13 = r1.initialization
        L50:
            r0.next()
            java.lang.String r1 = "Initialization"
            boolean r1 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r1 == 0) goto L61
            androidx.media3.exoplayer.dash.manifest.RangedUri r13 = r17.parseInitialization(r18)
        L5f:
            r8 = r13
            goto L65
        L61:
            maybeSkipTag(r0)
            goto L5f
        L65:
            java.lang.String r1 = "SegmentBase"
            boolean r1 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r0, r1)
            if (r1 == 0) goto L75
            r13 = r6
            r7 = r17
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SingleSegmentBase r0 = r7.buildSingleSegmentBase(r8, r9, r11, r13, r15)
            return r0
        L75:
            r13 = r8
            goto L50
    }

    public androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentList parseSegmentList(org.xmlpull.v1.XmlPullParser r25, @androidx.annotation.Nullable androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentList r26, long r27, long r29, long r31, long r33, long r35) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r24 = this;
            r1 = r25
            r6 = r26
            r2 = 1
            if (r6 == 0) goto Lb
            long r4 = r6.timescale
            goto Lc
        Lb:
            r4 = r2
        Lc:
            java.lang.String r0 = "timescale"
            long r8 = parseLong(r1, r0, r4)
            if (r6 == 0) goto L18
            long r4 = r6.presentationTimeOffset
            goto L1a
        L18:
            r4 = 0
        L1a:
            java.lang.String r0 = "presentationTimeOffset"
            long r10 = parseLong(r1, r0, r4)
            if (r6 == 0) goto L26
            long r4 = r6.duration
            goto L2b
        L26:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2b:
            java.lang.String r0 = "duration"
            long r14 = parseLong(r1, r0, r4)
            if (r6 == 0) goto L35
            long r2 = r6.startNumber
        L35:
            java.lang.String r0 = "startNumber"
            long r12 = parseLong(r1, r0, r2)
            long r17 = getFinalAvailabilityTimeOffset(r31, r33)
            r0 = 0
            r7 = r0
            r16 = r7
            r19 = r16
        L46:
            r1.next()
            java.lang.String r0 = "Initialization"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r0)
            if (r0 == 0) goto L59
            androidx.media3.exoplayer.dash.manifest.RangedUri r0 = r24.parseInitialization(r25)
            r16 = r0
            r2 = r8
            goto L88
        L59:
            java.lang.String r0 = "SegmentTimeline"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r0)
            if (r0 == 0) goto L6d
            r0 = r24
            r4 = r29
            r2 = r8
            java.util.List r8 = r0.parseSegmentTimeline(r1, r2, r4)
            r19 = r8
            goto L88
        L6d:
            r2 = r8
            java.lang.String r0 = "SegmentURL"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r0)
            if (r0 == 0) goto L85
            if (r7 != 0) goto L7d
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L7d:
            androidx.media3.exoplayer.dash.manifest.RangedUri r0 = r24.parseSegmentUrl(r25)
            r7.add(r0)
            goto L88
        L85:
            maybeSkipTag(r1)
        L88:
            java.lang.String r0 = "SegmentList"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r1, r0)
            if (r0 == 0) goto Lb9
            if (r6 == 0) goto La5
            if (r16 == 0) goto L95
            goto L99
        L95:
            androidx.media3.exoplayer.dash.manifest.RangedUri r0 = r6.initialization
            r16 = r0
        L99:
            if (r19 == 0) goto L9c
            goto La0
        L9c:
            java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentTimelineElement> r0 = r6.segmentTimeline
            r19 = r0
        La0:
            if (r7 == 0) goto La3
            goto La5
        La3:
            java.util.List<androidx.media3.exoplayer.dash.manifest.RangedUri> r7 = r6.mediaSegments
        La5:
            r6 = r19
            r19 = r7
            r7 = r16
            r16 = r6
            r6 = r24
            r22 = r27
            r20 = r35
            r8 = r2
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentList r0 = r6.buildSegmentList(r7, r8, r10, r12, r14, r16, r17, r19, r20, r22)
            return r0
        Lb9:
            r8 = r2
            goto L46
    }

    public androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTemplate parseSegmentTemplate(org.xmlpull.v1.XmlPullParser r23, @androidx.annotation.Nullable androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTemplate r24, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r25, long r26, long r28, long r30, long r32, long r34) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r22 = this;
            r0 = r22
            r1 = r23
            r6 = r24
            r2 = 1
            if (r6 == 0) goto Ld
            long r4 = r6.timescale
            goto Le
        Ld:
            r4 = r2
        Le:
            java.lang.String r7 = "timescale"
            long r4 = parseLong(r1, r7, r4)
            if (r6 == 0) goto L1a
            long r7 = r6.presentationTimeOffset
            goto L1c
        L1a:
            r7 = 0
        L1c:
            java.lang.String r9 = "presentationTimeOffset"
            long r7 = parseLong(r1, r9, r7)
            if (r6 == 0) goto L28
            long r9 = r6.duration
            goto L2d
        L28:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2d:
            java.lang.String r11 = "duration"
            long r11 = parseLong(r1, r11, r9)
            if (r6 == 0) goto L37
            long r2 = r6.startNumber
        L37:
            java.lang.String r9 = "startNumber"
            long r9 = parseLong(r1, r9, r2)
            long r13 = parseLastSegmentNumberSupplementalProperty(r25)
            long r15 = getFinalAvailabilityTimeOffset(r30, r32)
            if (r6 == 0) goto L4b
            androidx.media3.exoplayer.dash.manifest.UrlTemplate r3 = r6.mediaTemplate
            goto L4c
        L4b:
            r3 = 0
        L4c:
            java.lang.String r2 = "media"
            androidx.media3.exoplayer.dash.manifest.UrlTemplate r17 = r0.parseUrlTemplate(r1, r2, r3)
            if (r6 == 0) goto L57
            androidx.media3.exoplayer.dash.manifest.UrlTemplate r2 = r6.initializationTemplate
            goto L58
        L57:
            r2 = 0
        L58:
            java.lang.String r3 = "initialization"
            androidx.media3.exoplayer.dash.manifest.UrlTemplate r18 = r0.parseUrlTemplate(r1, r3, r2)
            r19 = 0
            r20 = 0
        L62:
            r1.next()
            java.lang.String r2 = "Initialization"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto L75
            androidx.media3.exoplayer.dash.manifest.RangedUri r2 = r22.parseInitialization(r23)
            r19 = r2
            r2 = r4
            goto L89
        L75:
            java.lang.String r2 = "SegmentTimeline"
            boolean r2 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r1, r2)
            if (r2 == 0) goto L85
            r2 = r4
            r4 = r28
            java.util.List r20 = r0.parseSegmentTimeline(r1, r2, r4)
            goto L89
        L85:
            r2 = r4
            maybeSkipTag(r1)
        L89:
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r1, r0)
            if (r0 == 0) goto Lb7
            if (r6 == 0) goto La1
            if (r19 == 0) goto L96
            goto L9a
        L96:
            androidx.media3.exoplayer.dash.manifest.RangedUri r0 = r6.initialization
            r19 = r0
        L9a:
            if (r20 == 0) goto L9d
            goto La1
        L9d:
            java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentTimelineElement> r0 = r6.segmentTimeline
            r20 = r0
        La1:
            r1 = r22
            r3 = r2
            r5 = r7
            r7 = r9
            r9 = r13
            r14 = r15
            r16 = r18
            r2 = r19
            r13 = r20
            r20 = r26
            r18 = r34
            androidx.media3.exoplayer.dash.manifest.SegmentBase$SegmentTemplate r0 = r1.buildSegmentTemplate(r2, r3, r5, r7, r9, r11, r13, r14, r16, r17, r18, r20)
            return r0
        Lb7:
            r4 = r7
            r7 = r9
            r9 = r13
            r14 = r15
            r0 = r22
            r15 = r14
            r13 = r9
            r9 = r7
            r7 = r4
            r4 = r2
            goto L62
    }

    public java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> parseSegmentTimeline(org.xmlpull.v1.XmlPullParser r20, long r21, long r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r19 = this;
            r0 = r20
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            r3 = r2
            r5 = r10
            r2 = r12
            r7 = r2
        L13:
            r0.next()
            java.lang.String r8 = "S"
            boolean r8 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r8)
            if (r8 == 0) goto L43
            java.lang.String r8 = "t"
            long r8 = parseLong(r0, r8, r10)
            if (r2 == 0) goto L2f
            r2 = r1
            r1 = r19
            long r3 = r1.addSegmentTimelineElementsToList(r2, r3, r5, r7, r8)
            r1 = r2
        L2f:
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 == 0) goto L34
            r3 = r8
        L34:
            java.lang.String r2 = "d"
            long r5 = parseLong(r0, r2, r10)
            java.lang.String r2 = "r"
            int r7 = parseInt(r0, r2, r12)
            r2 = 1
            goto L46
        L43:
            maybeSkipTag(r0)
        L46:
            java.lang.String r8 = "SegmentTimeline"
            boolean r8 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r0, r8)
            if (r8 == 0) goto L13
            if (r2 == 0) goto L63
            r17 = 1000(0x3e8, double:4.94E-321)
            r15 = r21
            r13 = r23
            long r8 = androidx.media3.common.util.Util.scaleLargeTimestamp(r13, r15, r17)
            r0 = r19
            r2 = r3
            r4 = r5
            r6 = r7
            r7 = r8
            r0.addSegmentTimelineElementsToList(r1, r2, r4, r6, r7)
        L63:
            return r1
    }

    public androidx.media3.exoplayer.dash.manifest.RangedUri parseSegmentUrl(org.xmlpull.v1.XmlPullParser r3) {
            r2 = this;
            java.lang.String r0 = "media"
            java.lang.String r1 = "mediaRange"
            androidx.media3.exoplayer.dash.manifest.RangedUri r3 = r2.parseRangedUrl(r3, r0, r1)
            return r3
    }

    public int parseSelectionFlagsFromDashRoleScheme(@androidx.annotation.Nullable java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "forced_subtitle"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L15
            java.lang.String r1 = "forced-subtitle"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L15
            return r0
        L15:
            r3 = 2
            return r3
    }

    public int parseSelectionFlagsFromRoleDescriptors(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r6) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r0 >= r2) goto L23
            java.lang.Object r2 = r6.get(r0)
            androidx.media3.exoplayer.dash.manifest.Descriptor r2 = (androidx.media3.exoplayer.dash.manifest.Descriptor) r2
            java.lang.String r3 = r2.schemeIdUri
            java.lang.String r4 = "urn:mpeg:dash:role:2011"
            boolean r3 = com.google.common.base.Ascii.equalsIgnoreCase(r4, r3)
            if (r3 == 0) goto L20
            java.lang.String r2 = r2.value
            int r2 = r5.parseSelectionFlagsFromDashRoleScheme(r2)
            r1 = r1 | r2
        L20:
            int r0 = r0 + 1
            goto L2
        L23:
            return r1
    }

    public androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement parseServiceDescription(org.xmlpull.v1.XmlPullParser r22) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r21 = this;
            r0 = r22
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4 = r1
            r6 = r4
            r8 = r6
            r10 = r3
            r11 = r10
        Lf:
            r0.next()
            java.lang.String r12 = "Latency"
            boolean r12 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r12)
            java.lang.String r13 = "max"
            java.lang.String r14 = "min"
            if (r12 == 0) goto L36
            java.lang.String r4 = "target"
            long r4 = parseLong(r0, r4, r1)
            long r6 = parseLong(r0, r14, r1)
            long r8 = parseLong(r0, r13, r1)
        L2d:
            r13 = r4
            r15 = r6
            r17 = r8
            r19 = r10
            r20 = r11
            goto L47
        L36:
            java.lang.String r12 = "PlaybackRate"
            boolean r12 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r12)
            if (r12 == 0) goto L2d
            float r10 = parseFloat(r0, r14, r3)
            float r11 = parseFloat(r0, r13, r3)
            goto L2d
        L47:
            java.lang.String r4 = "ServiceDescription"
            boolean r4 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r0, r4)
            if (r4 == 0) goto L55
            androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement r12 = new androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement
            r12.<init>(r13, r15, r17, r19, r20)
            return r12
        L55:
            r4 = r13
            r6 = r15
            r8 = r17
            r10 = r19
            r11 = r20
            goto Lf
    }

    @androidx.annotation.Nullable
    public android.util.Pair<java.lang.Integer, java.lang.Integer> parseTileCountFromProperties(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> r6) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L4f
            java.lang.Object r2 = r6.get(r1)
            androidx.media3.exoplayer.dash.manifest.Descriptor r2 = (androidx.media3.exoplayer.dash.manifest.Descriptor) r2
            java.lang.String r3 = r2.schemeIdUri
            java.lang.String r4 = "http://dashif.org/thumbnail_tile"
            boolean r3 = com.google.common.base.Ascii.equalsIgnoreCase(r4, r3)
            if (r3 != 0) goto L22
            java.lang.String r3 = "http://dashif.org/guidelines/thumbnail_tile"
            java.lang.String r4 = r2.schemeIdUri
            boolean r3 = com.google.common.base.Ascii.equalsIgnoreCase(r3, r4)
            if (r3 == 0) goto L4c
        L22:
            java.lang.String r2 = r2.value
            if (r2 == 0) goto L4c
            java.lang.String r3 = "x"
            java.lang.String[] r2 = androidx.media3.common.util.Util.split(r2, r3)
            int r3 = r2.length
            r4 = 2
            if (r3 == r4) goto L32
            goto L4c
        L32:
            r3 = r2[r0]     // Catch: java.lang.NumberFormatException -> L4c
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L4c
            r4 = 1
            r2 = r2[r4]     // Catch: java.lang.NumberFormatException -> L4c
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L4c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L4c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L4c
            android.util.Pair r6 = android.util.Pair.create(r3, r2)     // Catch: java.lang.NumberFormatException -> L4c
            return r6
        L4c:
            int r1 = r1 + 1
            goto L2
        L4f:
            r6 = 0
            return r6
    }

    public int parseTvaAudioPurposeCsValue(@androidx.annotation.Nullable java.lang.String r6) {
            r5 = this;
            r0 = 4
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L6
            return r2
        L6:
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case 49: goto L3b;
                case 50: goto L30;
                case 51: goto L25;
                case 52: goto L1a;
                case 53: goto Le;
                case 54: goto Lf;
                default: goto Le;
            }
        Le:
            goto L45
        Lf:
            java.lang.String r4 = "6"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L18
            goto L45
        L18:
            r3 = r0
            goto L45
        L1a:
            java.lang.String r4 = "4"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L23
            goto L45
        L23:
            r3 = 3
            goto L45
        L25:
            java.lang.String r4 = "3"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L2e
            goto L45
        L2e:
            r3 = 2
            goto L45
        L30:
            java.lang.String r4 = "2"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L39
            goto L45
        L39:
            r3 = r1
            goto L45
        L3b:
            java.lang.String r4 = "1"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L44
            goto L45
        L44:
            r3 = r2
        L45:
            switch(r3) {
                case 0: goto L51;
                case 1: goto L4e;
                case 2: goto L4d;
                case 3: goto L4a;
                case 4: goto L49;
                default: goto L48;
            }
        L48:
            return r2
        L49:
            return r1
        L4a:
            r6 = 8
            return r6
        L4d:
            return r0
        L4e:
            r6 = 2048(0x800, float:2.87E-42)
            return r6
        L51:
            r6 = 512(0x200, float:7.17E-43)
            return r6
    }

    @androidx.annotation.Nullable
    public androidx.media3.exoplayer.dash.manifest.UrlTemplate parseUrlTemplate(org.xmlpull.v1.XmlPullParser r2, java.lang.String r3, @androidx.annotation.Nullable androidx.media3.exoplayer.dash.manifest.UrlTemplate r4) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r2.getAttributeValue(r0, r3)
            if (r2 == 0) goto Lc
            androidx.media3.exoplayer.dash.manifest.UrlTemplate r2 = androidx.media3.exoplayer.dash.manifest.UrlTemplate.compile(r2)
            return r2
        Lc:
            return r4
    }

    public androidx.media3.exoplayer.dash.manifest.UtcTimingElement parseUtcTiming(org.xmlpull.v1.XmlPullParser r4) {
            r3 = this;
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = r4.getAttributeValue(r1, r0)
            java.lang.String r2 = "value"
            java.lang.String r4 = r4.getAttributeValue(r1, r2)
            androidx.media3.exoplayer.dash.manifest.UtcTimingElement r4 = r3.buildUtcTimingElement(r0, r4)
            return r4
    }
}
