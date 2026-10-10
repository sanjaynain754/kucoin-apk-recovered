package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C2711C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes34.dex */
final class RtspTrackTiming {
    public final long rtpTimestamp;
    public final int sequenceNumber;
    public final Uri uri;

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public static ImmutableList<RtspTrackTiming> parseTrackTiming(String str, Uri uri) throws ParserException {
        byte b11;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        String[] strArrSplit = Util.split(str, ",");
        int length = strArrSplit.length;
        int i11 = 0;
        while (i11 < length) {
            String str2 = strArrSplit[i11];
            String[] strArrSplit2 = Util.split(str2, ";");
            int length2 = strArrSplit2.length;
            int i12 = i11;
            long j11 = C2711C.TIME_UNSET;
            int i13 = 0;
            Uri uriResolveUri = null;
            int i14 = -1;
            while (i13 < length2) {
                String str3 = strArrSplit2[i13];
                try {
                    String[] strArrSplitAtFirst = Util.splitAtFirst(str3, "=");
                    String str4 = strArrSplitAtFirst[0];
                    String str5 = strArrSplitAtFirst[1];
                    int iHashCode = str4.hashCode();
                    String[] strArr = strArrSplit;
                    int i15 = length;
                    if (iHashCode != 113759) {
                        if (iHashCode != 116079) {
                            if (iHashCode == 1524180539 && str4.equals("rtptime")) {
                                b11 = 2;
                            } else {
                                b11 = -1;
                            }
                        } else if (str4.equals("url")) {
                            b11 = 0;
                        } else {
                            b11 = -1;
                        }
                    } else if (str4.equals("seq")) {
                        b11 = 1;
                    } else {
                        b11 = -1;
                    }
                    if (b11 == 0) {
                        uriResolveUri = resolveUri(str5, uri);
                    } else if (b11 == 1) {
                        i14 = Integer.parseInt(str5);
                    } else {
                        if (b11 != 2) {
                            throw ParserException.createForMalformedManifest(str4, null);
                        }
                        j11 = Long.parseLong(str5);
                    }
                    i13++;
                    strArrSplit = strArr;
                    length = i15;
                } catch (Exception e11) {
                    throw ParserException.createForMalformedManifest(str3, e11);
                }
            }
            String[] strArr2 = strArrSplit;
            int i16 = length;
            if (uriResolveUri == null || uriResolveUri.getScheme() == null || (i14 == -1 && j11 == C2711C.TIME_UNSET)) {
                throw ParserException.createForMalformedManifest(str2, null);
            }
            builder.add(new RtspTrackTiming(j11, i14, uriResolveUri));
            i11 = i12 + 1;
            strArrSplit = strArr2;
            length = i16;
        }
        return builder.build();
    }

    private RtspTrackTiming(long j11, int i11, Uri uri) {
        this.rtpTimestamp = j11;
        this.sequenceNumber = i11;
        this.uri = uri;
    }

    @VisibleForTesting
    public static Uri resolveUri(String str, Uri uri) {
        Assertions.checkArgument(((String) Assertions.checkNotNull(uri.getScheme())).equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        if (((String) Assertions.checkNotNull(uri3.getHost())).equals(uri.getHost())) {
            return uri3;
        }
        if (string.endsWith("/")) {
            return UriUtil.resolveToUri(string, str);
        }
        return UriUtil.resolveToUri(string + "/", str);
    }
}
