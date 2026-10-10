package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.UnmodifiableIterator;
import com.tencent.bugly.proguard.C33844oi;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
final class RtspMessageUtil {
    public static final long DEFAULT_RTSP_TIMEOUT_MS = 60000;
    private static final String RTSP_VERSION = "RTSP/1.0";
    private static final Pattern REQUEST_LINE_PATTERN = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");
    private static final Pattern STATUS_LINE_PATTERN = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");
    private static final Pattern CONTENT_LENGTH_HEADER_PATTERN = Pattern.compile("Content-Length:\\s?(\\d+)", 2);
    private static final Pattern SESSION_HEADER_PATTERN = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");
    private static final Pattern WWW_AUTHENTICATION_HEADER_DIGEST_PATTERN = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");
    private static final Pattern WWW_AUTHENTICATION_HEADER_BASIC_PATTERN = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* JADX INFO: renamed from: LF */
    private static final String f3303LF = new String(new byte[]{10});
    private static final String CRLF = new String(new byte[]{13, 10});

    public static final class RtspAuthUserInfo {
        public final String password;
        public final String username;

        public RtspAuthUserInfo(String str, String str2) {
            this.username = str;
            this.password = str2;
        }
    }

    public static final class RtspSessionHeader {
        public final String sessionId;
        public final long timeoutMs;

        public RtspSessionHeader(String str, long j11) {
            this.sessionId = str;
            this.timeoutMs = j11;
        }
    }

    public static void checkManifestExpression(boolean z11, @Nullable String str) throws ParserException {
        if (!z11) {
            throw ParserException.createForMalformedManifest(str, null);
        }
    }

    public static byte[] convertMessageToByteArray(List<String> list) {
        return Joiner.m13373on(CRLF).join(list).getBytes(RtspMessageChannel.CHARSET);
    }

    private static String getRtspStatusReasonPhrase(int i11) {
        if (i11 == 200) {
            return "OK";
        }
        if (i11 == 461) {
            return "Unsupported Transport";
        }
        if (i11 == 500) {
            return "Internal Server Error";
        }
        if (i11 == 505) {
            return "RTSP Version Not Supported";
        }
        if (i11 == 301) {
            return "Move Permanently";
        }
        if (i11 == 302) {
            return "Move Temporarily";
        }
        if (i11 == 400) {
            return "Bad Request";
        }
        if (i11 == 401) {
            return "Unauthorized";
        }
        if (i11 == 404) {
            return "Not Found";
        }
        if (i11 == 405) {
            return "Method Not Allowed";
        }
        switch (i11) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static byte[] getStringBytes(String str) {
        return str.getBytes(RtspMessageChannel.CHARSET);
    }

    public static boolean isRtspResponse(List<String> list) {
        return STATUS_LINE_PATTERN.matcher(list.get(0)).matches();
    }

    public static boolean isRtspStartLine(String str) {
        return REQUEST_LINE_PATTERN.matcher(str).matches() || STATUS_LINE_PATTERN.matcher(str).matches();
    }

    public static long parseContentLengthHeader(String str) throws ParserException {
        try {
            Matcher matcher = CONTENT_LENGTH_HEADER_PATTERN.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e11) {
            throw ParserException.createForMalformedManifest(str, e11);
        }
    }

    private static int parseMethodString(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                return 0;
        }
    }

    public static ImmutableList<Integer> parsePublicHeader(@Nullable String str) {
        if (str == null) {
            return ImmutableList.m13439of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (String str2 : Util.split(str, ",\\s?")) {
            int methodString = parseMethodString(str2);
            if (methodString != 0) {
                builder.add(Integer.valueOf(methodString));
            }
        }
        return builder.build();
    }

    public static RtspRequest parseRequest(List<String> list) {
        Matcher matcher = REQUEST_LINE_PATTERN.matcher(list.get(0));
        Assertions.checkArgument(matcher.matches());
        int methodString = parseMethodString((String) Assertions.checkNotNull(matcher.group(1)));
        Uri uri = Uri.parse((String) Assertions.checkNotNull(matcher.group(2)));
        int iIndexOf = list.indexOf("");
        Assertions.checkArgument(iIndexOf > 0);
        return new RtspRequest(uri, methodString, new RtspHeaders.Builder().addAll(list.subList(1, iIndexOf)).build(), Joiner.m13373on(CRLF).join(list.subList(iIndexOf + 1, list.size())));
    }

    public static RtspResponse parseResponse(List<String> list) {
        Matcher matcher = STATUS_LINE_PATTERN.matcher(list.get(0));
        Assertions.checkArgument(matcher.matches());
        int i11 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
        int iIndexOf = list.indexOf("");
        Assertions.checkArgument(iIndexOf > 0);
        return new RtspResponse(i11, new RtspHeaders.Builder().addAll(list.subList(1, iIndexOf)).build(), Joiner.m13373on(CRLF).join(list.subList(iIndexOf + 1, list.size())));
    }

    public static RtspSessionHeader parseSessionHeader(String str) throws ParserException {
        long j11;
        Matcher matcher = SESSION_HEADER_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedManifest(str, null);
        }
        String str2 = (String) Assertions.checkNotNull(matcher.group(1));
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j11 = ((long) Integer.parseInt(strGroup)) * 1000;
            } catch (NumberFormatException e11) {
                throw ParserException.createForMalformedManifest(str, e11);
            }
        } else {
            j11 = 60000;
        }
        return new RtspSessionHeader(str2, j11);
    }

    public static RtspAuthenticationInfo parseWwwAuthenticateHeader(String str) throws ParserException {
        Matcher matcher = WWW_AUTHENTICATION_HEADER_DIGEST_PATTERN.matcher(str);
        if (matcher.find()) {
            return new RtspAuthenticationInfo(2, (String) Assertions.checkNotNull(matcher.group(1)), (String) Assertions.checkNotNull(matcher.group(3)), Strings.nullToEmpty(matcher.group(4)));
        }
        Matcher matcher2 = WWW_AUTHENTICATION_HEADER_BASIC_PATTERN.matcher(str);
        if (matcher2.matches()) {
            return new RtspAuthenticationInfo(1, (String) Assertions.checkNotNull(matcher2.group(1)), "", "");
        }
        throw ParserException.createForMalformedManifest("Invalid WWW-Authenticate header " + str, null);
    }

    public static ImmutableList<String> serializeRequest(RtspRequest rtspRequest) {
        Assertions.checkArgument(rtspRequest.headers.get(RtspHeaders.CSEQ) != null);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.add(Util.formatInvariant("%s %s %s", toMethodString(rtspRequest.method), rtspRequest.uri, RTSP_VERSION));
        ImmutableListMultimap<String, String> immutableListMultimapAsMultiMap = rtspRequest.headers.asMultiMap();
        UnmodifiableIterator<String> it = immutableListMultimapAsMultiMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ImmutableList<String> immutableList = immutableListMultimapAsMultiMap.get(next);
            for (int i11 = 0; i11 < immutableList.size(); i11++) {
                builder.add(Util.formatInvariant("%s: %s", next, immutableList.get(i11)));
            }
        }
        builder.add("");
        builder.add(rtspRequest.messageBody);
        return builder.build();
    }

    public static ImmutableList<String> serializeResponse(RtspResponse rtspResponse) {
        Assertions.checkArgument(rtspResponse.headers.get(RtspHeaders.CSEQ) != null);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.add(Util.formatInvariant("%s %s %s", RTSP_VERSION, Integer.valueOf(rtspResponse.status), getRtspStatusReasonPhrase(rtspResponse.status)));
        ImmutableListMultimap<String, String> immutableListMultimapAsMultiMap = rtspResponse.headers.asMultiMap();
        UnmodifiableIterator<String> it = immutableListMultimapAsMultiMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ImmutableList<String> immutableList = immutableListMultimapAsMultiMap.get(next);
            for (int i11 = 0; i11 < immutableList.size(); i11++) {
                builder.add(Util.formatInvariant("%s: %s", next, immutableList.get(i11)));
            }
        }
        builder.add("");
        builder.add(rtspResponse.messageBody);
        return builder.build();
    }

    public static String[] splitRtspMessageBody(String str) {
        String str2 = CRLF;
        if (!str.contains(str2)) {
            str2 = f3303LF;
        }
        return Util.split(str, str2);
    }

    private RtspMessageUtil() {
    }

    public static int parseInt(String str) throws ParserException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e11) {
            throw ParserException.createForMalformedManifest(str, e11);
        }
    }

    @Nullable
    public static RtspAuthUserInfo parseUserInfo(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(C33844oi.f71346o)) {
            return null;
        }
        String[] strArrSplitAtFirst = Util.splitAtFirst(userInfo, C33844oi.f71346o);
        return new RtspAuthUserInfo(strArrSplitAtFirst[0], strArrSplitAtFirst[1]);
    }

    public static Uri removeUserInfo(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) Assertions.checkNotNull(uri.getEncodedAuthority());
        Assertions.checkArgument(str.contains("@"));
        return uri.buildUpon().encodedAuthority(Util.split(str, "@")[1]).build();
    }

    public static String toMethodString(int i11) {
        switch (i11) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
