package okhttp3.internal.http;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010\r\u001a\u00020\u0004*\u00020\u0006\u001a\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0002\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0002\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n\u001a\f\u0010\u001a\u001a\u00020\u0004*\u00020\u0010H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"QUOTED_STRING_DELIMITERS", "Lokio/ByteString;", "TOKEN_DELIMITERS", "hasBody", "", "response", "Lokhttp3/Response;", "parseChallenges", "", "Lokhttp3/Challenge;", "Lokhttp3/Headers;", "headerName", "", "promisesBody", "readChallengeHeader", "", "Lokio/Buffer;", DbParams.KEY_CHANNEL_RESULT, "", "readQuotedString", "readToken", "receiveHeaders", "Lokhttp3/CookieJar;", "url", "Lokhttp3/HttpUrl;", "headers", "skipCommasAndWhitespace", "startsWith", "prefix", "", "okhttp"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@JvmName(name = "HttpHeaders")
public final class HttpHeaders {

    @NotNull
    private static final ByteString QUOTED_STRING_DELIMITERS;

    @NotNull
    private static final ByteString TOKEN_DELIMITERS;

    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd A[EDGE_INSN: B:59:0x00bd->B:48:0x00bd BREAK  A[LOOP:2: B:22:0x0074->B:47:0x00bb], SYNTHETIC] */
    private static final void readChallengeHeader(Buffer buffer, List<Challenge> list) throws EOFException {
        String token;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(buffer);
                    token2 = readToken(buffer);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(buffer);
                String token3 = readToken(buffer);
                if (token3 == null) {
                    if (buffer.exhausted()) {
                        list.add(new Challenge(token2, (Map<String, String>) MapsKt.emptyMap()));
                        return;
                    }
                    return;
                }
                int iSkipAll = Util.skipAll(buffer, (byte) 61);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(buffer);
                if (zSkipCommasAndWhitespace || !(zSkipCommasAndWhitespace2 || buffer.exhausted())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = iSkipAll + Util.skipAll(buffer, (byte) 61);
                    while (true) {
                        if (token3 != null) {
                            if (iSkipAll2 != 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (startsWith(buffer, BuiltinOptions.TopKV2Options)) {
                                token = readQuotedString(buffer);
                            } else {
                                token = readToken(buffer);
                            }
                            if (token != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(buffer)) {
                            }
                            token3 = null;
                        } else {
                            token3 = readToken(buffer);
                            if (!skipCommasAndWhitespace(buffer)) {
                                iSkipAll2 = Util.skipAll(buffer, (byte) 61);
                                if (iSkipAll2 != 0) {
                                    break;
                                }
                                if (iSkipAll2 <= 1 || skipCommasAndWhitespace(buffer)) {
                                    return;
                                }
                                if (startsWith(buffer, BuiltinOptions.TopKV2Options)) {
                                    token = readQuotedString(buffer);
                                } else {
                                    token = readToken(buffer);
                                }
                                if (token != null || ((String) linkedHashMap.put(token3, token)) != null) {
                                    return;
                                }
                                if (skipCommasAndWhitespace(buffer) && !buffer.exhausted()) {
                                    return;
                                } else {
                                    token3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new Challenge(token2, linkedHashMap));
                    token2 = token3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, token3 + StringsKt.repeat("=", iSkipAll));
                    Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new Challenge(token2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    private static final boolean skipCommasAndWhitespace(Buffer buffer) throws EOFException {
        boolean z11 = false;
        while (!buffer.exhausted()) {
            byte b11 = buffer.getByte(0L);
            if (b11 == 44) {
                buffer.readByte();
                z11 = true;
            } else {
                if (b11 != 32 && b11 != 9) {
                    break;
                }
                buffer.readByte();
            }
        }
        return z11;
    }

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        QUOTED_STRING_DELIMITERS = companion.encodeUtf8("\"\\");
        TOKEN_DELIMITERS = companion.encodeUtf8("\t ,=");
    }

    @NotNull
    public static final List<Challenge> parseChallenges(@NotNull Headers headers, @NotNull String headerName) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (StringsKt.equals(headerName, headers.name(i11), true)) {
                try {
                    readChallengeHeader(new Buffer().writeUtf8(headers.value(i11)), arrayList);
                } catch (EOFException e11) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e11);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !StringsKt.equals("chunked", Response.header$default(response, com.google.common.net.HttpHeaders.TRANSFER_ENCODING, null, 2, null), true)) ? false : true;
    }

    private static final String readToken(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(TOKEN_DELIMITERS);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    public static final void receiveHeaders(@NotNull CookieJar cookieJar, @NotNull HttpUrl url, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(cookieJar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.INSTANCE.parseAll(url, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, all);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return promisesBody(response);
    }

    private static final String readQuotedString(Buffer buffer) throws EOFException {
        if (buffer.readByte() == 34) {
            Buffer buffer2 = new Buffer();
            while (true) {
                long jIndexOfElement = buffer.indexOfElement(QUOTED_STRING_DELIMITERS);
                if (jIndexOfElement == -1) {
                    return null;
                }
                if (buffer.getByte(jIndexOfElement) == 34) {
                    buffer2.write(buffer, jIndexOfElement);
                    buffer.readByte();
                    return buffer2.readUtf8();
                }
                if (buffer.size() == jIndexOfElement + 1) {
                    return null;
                }
                buffer2.write(buffer, jIndexOfElement);
                buffer.readByte();
                buffer2.write(buffer, 1L);
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private static final boolean startsWith(Buffer buffer, byte b11) {
        if (!buffer.exhausted() && buffer.getByte(0L) == b11) {
            return true;
        }
        return false;
    }
}
