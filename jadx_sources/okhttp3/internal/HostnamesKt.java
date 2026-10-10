package okhttp3.internal;

import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: hostnames.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, m90084d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", TUIConstants.TUIContact.LIMIT, "address", "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class HostnamesKt {
    private static final boolean decodeIpv4Suffix(String str, int i11, int i12, byte[] bArr, int i13) {
        int i14 = i13;
        while (i11 < i12) {
            if (i14 == bArr.length) {
                return false;
            }
            if (i14 != i13) {
                if (str.charAt(i11) != '.') {
                    return false;
                }
                i11++;
            }
            int i15 = i11;
            int i16 = 0;
            while (i15 < i12) {
                char cCharAt = str.charAt(i15);
                if (Intrinsics.compare((int) cCharAt, 48) < 0 || Intrinsics.compare((int) cCharAt, 57) > 0) {
                    break;
                }
                if ((i16 == 0 && i11 != i15) || (i16 = ((i16 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i15++;
            }
            if (i15 - i11 == 0) {
                return false;
            }
            bArr[i14] = (byte) i16;
            i14++;
            i11 = i15;
        }
        return i14 == i13 + 4;
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < bArr.length) {
            int i15 = i13;
            while (i15 < 16 && bArr[i15] == 0 && bArr[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i11 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        Buffer buffer = new Buffer();
        while (i12 < bArr.length) {
            if (i12 == i11) {
                buffer.writeByte(58);
                i12 += i14;
                if (i12 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i12 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((Util.and(bArr[i12], 255) << 8) | Util.and(bArr[i12 + 1], 255));
                i12 += 2;
            }
        }
        return buffer.readUtf8();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[LOOP:1: B:30:0x0064->B:33:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0076 A[EDGE_INSN: B:54:0x0076->B:34:0x0076 BREAK  A[LOOP:1: B:30:0x0064->B:33:0x0070], SYNTHETIC] */
    private static final InetAddress decodeIpv6(String str, int i11, int i12) {
        int i13;
        int i14;
        int hexDigit;
        byte[] bArr = new byte[16];
        int i15 = i11;
        int i16 = 0;
        int i17 = -1;
        int i18 = -1;
        while (i15 < i12) {
            if (i16 == 16) {
                return null;
            }
            int i19 = i15 + 2;
            if (i19 <= i12 && StringsKt.startsWith$default(str, "::", i15, false, 4, (Object) null)) {
                if (i17 != -1) {
                    return null;
                }
                i16 += 2;
                if (i19 == i12) {
                    i17 = i16;
                    break;
                }
                i17 = i16;
                i18 = i19;
                i13 = 0;
                i15 = i18;
                while (i15 < i12) {
                    hexDigit = Util.parseHexDigit(str.charAt(i15));
                    if (hexDigit != -1) {
                        break;
                        break;
                    }
                    i13 = (i13 << 4) + hexDigit;
                    i15++;
                }
                i14 = i15 - i18;
                if (i14 != 0) {
                }
                return null;
            }
            if (i16 != 0) {
                if (!StringsKt.startsWith$default(str, C33844oi.f71346o, i15, false, 4, (Object) null)) {
                    if (!StringsKt.startsWith$default(str, C33978va.f72339h, i15, false, 4, (Object) null) || !decodeIpv4Suffix(str, i18, i12, bArr, i16 - 2)) {
                        return null;
                    }
                    i16 += 2;
                    break;
                }
                i15++;
            }
            i18 = i15;
            i13 = 0;
            i15 = i18;
            while (i15 < i12) {
                hexDigit = Util.parseHexDigit(str.charAt(i15));
                if (hexDigit != -1) {
                    break;
                }
                i13 = (i13 << 4) + hexDigit;
                i15++;
            }
            i14 = i15 - i18;
            if (i14 != 0 || i14 > 4) {
                return null;
            }
            int i21 = i16 + 1;
            bArr[i16] = (byte) ((i13 >>> 8) & 255);
            i16 += 2;
            bArr[i21] = (byte) (i13 & 255);
        }
        if (i16 != 16) {
            if (i17 == -1) {
                return null;
            }
            int i22 = i16 - i17;
            System.arraycopy(bArr, i17, bArr, 16 - i22, i22);
            Arrays.fill(bArr, i17, (16 - i16) + i17, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    @Nullable
    public static final String toCanonicalHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) C33844oi.f71346o, false, 2, (Object) null)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0 || containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressDecodeIpv6 = (StringsKt.startsWith$default(str, "[", false, 2, (Object) null) && StringsKt.endsWith$default(str, "]", false, 2, (Object) null)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
        if (inetAddressDecodeIpv6 == null) {
            return null;
        }
        byte[] address = inetAddressDecodeIpv6.getAddress();
        if (address.length == 16) {
            Intrinsics.checkNotNullExpressionValue(address, "address");
            return inet6AddressToAscii(address);
        }
        if (address.length == 4) {
            return inetAddressDecodeIpv6.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }

    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0 || StringsKt.indexOf$default((CharSequence) " #%/:?@[\\]", cCharAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
        }
        return false;
    }
}
