package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.Arrays;
import okio.Base64;
import okio.Buffer;
import okio.SegmentedByteString;
import okio._JvmPlatformKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: okio.internal.-ByteString, reason: invalid class name */
/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0080\b\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\r\u0010\u0011\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0080\b\u001a-\u0010\u0016\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u000f\u0010\u001c\u001a\u0004\u0018\u00010\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\tH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0080\b\u001a\u0017\u0010\"\u001a\u00020 *\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010#H\u0080\b\u001a\u0015\u0010$\u001a\u00020%*\u00020\f2\u0006\u0010&\u001a\u00020\u0007H\u0080\b\u001a\r\u0010'\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010(\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010)\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u001d\u0010*\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\r\u0010,\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\tH\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\fH\u0080\b\u001a\u001d\u00102\u001a\u00020\f*\u00020\f2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0080\b\u001a\r\u00105\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00106\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00107\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u00108\u001a\u00020\f*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010:\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a$\u0010;\u001a\u00020\u0017*\u00020\f2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006>"}, m90084d2 = {"HEX_DIGIT_CHARS", "", "getHEX_DIGIT_CHARS$annotations", "()V", "getHEX_DIGIT_CHARS", "()[C", "codePointIndexToCharIndex", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "codePointCount", "commonOf", "Lokio/ByteString;", "data", "decodeHexDigit", "c", "", "commonBase64", "", "commonBase64Url", "commonCompareTo", "other", "commonCopyInto", "", TypedValues.CycleType.S_WAVE_OFFSET, "target", "targetOffset", "byteCount", "commonDecodeBase64", "commonDecodeHex", "commonEncodeUtf8", "commonEndsWith", "", "suffix", "commonEquals", "", "commonGetByte", "", "pos", "commonGetSize", "commonHashCode", "commonHex", "commonIndexOf", "fromIndex", "commonInternalArray", "commonLastIndexOf", "commonRangeEquals", "otherOffset", "commonStartsWith", "prefix", "commonSubstring", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "commonToAsciiLowercase", "commonToAsciiUppercase", "commonToByteArray", "commonToByteString", "commonToString", "commonUtf8", "commonWrite", "buffer", "Lokio/Buffer;", "okio"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@JvmName(name = "-ByteString")
@SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utf8.kt\nokio/Utf8\n*L\n1#1,363:1\n131#1,2:369\n133#1,9:372\n68#2:364\n74#2:365\n74#2:367\n74#2:368\n68#2:396\n74#2:408\n1#3:366\n1#3:371\n212#4,7:381\n122#4:388\n219#4,5:389\n122#4:394\n226#4:395\n228#4:397\n397#4,2:398\n122#4:400\n400#4,6:401\n127#4:407\n406#4:409\n122#4:410\n407#4,13:411\n122#4:424\n422#4:425\n122#4:426\n425#4:427\n230#4,3:428\n440#4,3:431\n122#4:434\n443#4:435\n127#4:436\n446#4,10:437\n127#4:447\n456#4:448\n122#4:449\n457#4,4:450\n127#4:454\n461#4:455\n122#4:456\n462#4,14:457\n122#4:471\n477#4,2:472\n122#4:474\n481#4:475\n122#4:476\n484#4:477\n234#4,3:478\n500#4,3:481\n122#4:484\n503#4:485\n127#4:486\n506#4,2:487\n127#4:489\n510#4,10:490\n127#4:500\n520#4:501\n122#4:502\n521#4,4:503\n127#4:507\n525#4:508\n122#4:509\n526#4,4:510\n127#4:514\n530#4:515\n122#4:516\n531#4,15:517\n122#4:532\n547#4,2:533\n122#4:535\n550#4,2:536\n122#4:538\n554#4:539\n122#4:540\n557#4:541\n241#4:542\n122#4:543\n242#4,5:544\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n*L\n329#1:369,2\n329#1:372,9\n67#1:364\n68#1:365\n258#1:367\n259#1:368\n348#1:396\n348#1:408\n329#1:371\n348#1:381,7\n353#1:388\n348#1:389,5\n353#1:394\n348#1:395\n348#1:397\n348#1:398,2\n353#1:400\n348#1:401,6\n348#1:407\n348#1:409\n353#1:410\n348#1:411,13\n353#1:424\n348#1:425\n353#1:426\n348#1:427\n348#1:428,3\n348#1:431,3\n353#1:434\n348#1:435\n348#1:436\n348#1:437,10\n348#1:447\n348#1:448\n353#1:449\n348#1:450,4\n348#1:454\n348#1:455\n353#1:456\n348#1:457,14\n353#1:471\n348#1:472,2\n353#1:474\n348#1:475\n353#1:476\n348#1:477\n348#1:478,3\n348#1:481,3\n353#1:484\n348#1:485\n348#1:486\n348#1:487,2\n348#1:489\n348#1:490,10\n348#1:500\n348#1:501\n353#1:502\n348#1:503,4\n348#1:507\n348#1:508\n353#1:509\n348#1:510,4\n348#1:514\n348#1:515\n353#1:516\n348#1:517,15\n353#1:532\n348#1:533,2\n353#1:535\n348#1:536,2\n353#1:538\n348#1:539\n353#1:540\n348#1:541\n348#1:542\n353#1:543\n348#1:544,5\n*E\n"})
public final class ByteString {

    @NotNull
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final boolean commonEndsWith(@NotNull okio.ByteString byteString, @NotNull okio.ByteString suffix) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final int commonLastIndexOf(@NotNull okio.ByteString byteString, @NotNull okio.ByteString other, int i11) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return byteString.lastIndexOf(other.internalArray$okio(), i11);
    }

    public static final boolean commonRangeEquals(@NotNull okio.ByteString byteString, int i11, @NotNull okio.ByteString other, int i12, int i13) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return other.rangeEquals(i12, byteString.getData(), i11, i13);
    }

    public static final boolean commonStartsWith(@NotNull okio.ByteString byteString, @NotNull okio.ByteString prefix) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int codePointIndexToCharIndex(byte[] bArr, int i11) {
        byte b11;
        int i12;
        int i13 = 1;
        int length = bArr.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < length) {
            byte b12 = bArr[i14];
            if (b12 >= 0) {
                int i17 = i16 + 1;
                if (i16 == i11) {
                    break;
                }
                if ((b12 != 10 && b12 != 13 && ((b12 >= 0 && b12 < 32) || (127 <= b12 && b12 < 160))) || b12 == 65533) {
                    return -1;
                }
                i15 += b12 < 65536 ? i13 : 2;
                i14 += i13;
                while (true) {
                    i16 = i17;
                    if (i14 >= length || (b11 = bArr[i14]) < 0) {
                        break;
                    }
                    i14 += i13;
                    i17 = i16 + 1;
                    if (i16 == i11) {
                        return i15;
                    }
                    if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (127 <= b11 && b11 < 160))) || b11 == 65533) {
                        return -1;
                    }
                    i15 += b11 < 65536 ? i13 : 2;
                }
            } else {
                int i18 = i13;
                if ((b12 >> 5) == -2) {
                    int i19 = i14 + 1;
                    if (length <= i19) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    byte b13 = bArr[i19];
                    if ((b13 & 192) != 128) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    int i21 = (b13 ^ 3968) ^ (b12 << 6);
                    if (i21 < 128) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    i12 = i16 + 1;
                    if (i16 == i11) {
                        break;
                    }
                    if ((i21 != 10 && i21 != 13 && ((i21 >= 0 && i21 < 32) || (127 <= i21 && i21 < 160))) || i21 == 65533) {
                        return -1;
                    }
                    i15 += i21 < 65536 ? i18 : 2;
                    Unit unit = Unit.INSTANCE;
                    i14 += 2;
                    i16 = i12;
                    i13 = i18;
                } else if ((b12 >> 4) == -2) {
                    int i22 = i14 + 2;
                    if (length <= i22) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    byte b14 = bArr[i14 + 1];
                    if ((b14 & 192) != 128) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    byte b15 = bArr[i22];
                    if ((b15 & 192) != 128) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    int i23 = ((b15 ^ (-123008)) ^ (b14 << 6)) ^ (b12 << 12);
                    if (i23 < 2048) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    if (55296 <= i23 && i23 < 57344) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    i12 = i16 + 1;
                    if (i16 == i11) {
                        break;
                    }
                    if ((i23 != 10 && i23 != 13 && ((i23 >= 0 && i23 < 32) || (127 <= i23 && i23 < 160))) || i23 == 65533) {
                        return -1;
                    }
                    i15 += i23 < 65536 ? i18 : 2;
                    Unit unit2 = Unit.INSTANCE;
                    i14 += 3;
                    i16 = i12;
                    i13 = i18;
                } else {
                    if ((b12 >> 3) != -2) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    int i24 = i14 + 3;
                    if (length <= i24) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    byte b16 = bArr[i14 + 1];
                    if ((b16 & 192) != 128) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    byte b17 = bArr[i14 + 2];
                    if ((b17 & 192) != 128) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    byte b18 = bArr[i24];
                    if ((b18 & 192) != 128) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    int i25 = (((b18 ^ 3678080) ^ (b17 << 6)) ^ (b16 << 12)) ^ (b12 << 18);
                    if (i25 > 1114111) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    if (55296 <= i25 && i25 < 57344) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    if (i25 < 65536) {
                        if (i16 == i11) {
                            break;
                        }
                        return -1;
                    }
                    i12 = i16 + 1;
                    if (i16 == i11) {
                        break;
                    }
                    if ((i25 != 10 && i25 != 13 && ((i25 >= 0 && i25 < 32) || (127 <= i25 && i25 < 160))) || i25 == 65533) {
                        return -1;
                    }
                    i15 += i25 < 65536 ? i18 : 2;
                    Unit unit3 = Unit.INSTANCE;
                    i14 += 4;
                    i16 = i12;
                    i13 = i18;
                }
            }
        }
        return i15;
    }

    @NotNull
    public static final String commonBase64(@NotNull okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return Base64.encodeBase64$default(byteString.getData(), null, 1, null);
    }

    @NotNull
    public static final String commonBase64Url(@NotNull okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return Base64.encodeBase64(byteString.getData(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(@NotNull okio.ByteString byteString, @NotNull okio.ByteString other) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = byteString.size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i11 = 0; i11 < iMin; i11++) {
            int i12 = byteString.getByte(i11) & 255;
            int i13 = other.getByte(i11) & 255;
            if (i12 != i13) {
                return i12 < i13 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void commonCopyInto(@NotNull okio.ByteString byteString, int i11, @NotNull byte[] target, int i12, int i13) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        ArraysKt.copyInto(byteString.getData(), target, i12, i11, i13 + i11);
    }

    @Nullable
    public static final okio.ByteString commonDecodeBase64(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new okio.ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    @NotNull
    public static final okio.ByteString commonDecodeHex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) ((decodeHexDigit(str.charAt(i12)) << 4) + decodeHexDigit(str.charAt(i12 + 1)));
        }
        return new okio.ByteString(bArr);
    }

    @NotNull
    public static final okio.ByteString commonEncodeUtf8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        okio.ByteString byteString = new okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(@NotNull okio.ByteString byteString, @NotNull byte[] suffix) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final boolean commonEquals(@NotNull okio.ByteString byteString, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof okio.ByteString) {
            okio.ByteString byteString2 = (okio.ByteString) obj;
            if (byteString2.size() == byteString.getData().length && byteString2.rangeEquals(0, byteString.getData(), 0, byteString.getData().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(@NotNull okio.ByteString byteString, int i11) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.getData()[i11];
    }

    public static final int commonGetSize(@NotNull okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.getData().length;
    }

    public static final int commonHashCode(@NotNull okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        int hashCode = byteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = Arrays.hashCode(byteString.getData());
        byteString.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    @NotNull
    public static final String commonHex(@NotNull okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        char[] cArr = new char[byteString.getData().length * 2];
        int i11 = 0;
        for (byte b11 : byteString.getData()) {
            int i12 = i11 + 1;
            cArr[i11] = getHEX_DIGIT_CHARS()[(b11 >> 4) & 15];
            i11 += 2;
            cArr[i12] = getHEX_DIGIT_CHARS()[b11 & 15];
        }
        return StringsKt.concatToString(cArr);
    }

    public static final int commonIndexOf(@NotNull okio.ByteString byteString, @NotNull byte[] other, int i11) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = byteString.getData().length - other.length;
        int iMax = Math.max(i11, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(byteString.getData(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @NotNull
    public static final byte[] commonInternalArray(@NotNull okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.getData();
    }

    public static final int commonLastIndexOf(@NotNull okio.ByteString byteString, @NotNull byte[] other, int i11) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i11), byteString.getData().length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(byteString.getData(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    @NotNull
    public static final okio.ByteString commonOf(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return new okio.ByteString(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(@NotNull okio.ByteString byteString, int i11, @NotNull byte[] other, int i12, int i13) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return i11 >= 0 && i11 <= byteString.getData().length - i13 && i12 >= 0 && i12 <= other.length - i13 && SegmentedByteString.arrayRangeEquals(byteString.getData(), i11, other, i12, i13);
    }

    public static final boolean commonStartsWith(@NotNull okio.ByteString byteString, @NotNull byte[] prefix) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.length);
    }

    @NotNull
    public static final okio.ByteString commonSubstring(@NotNull okio.ByteString byteString, int i11, int i12) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i12);
        if (i11 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iResolveDefaultParameter <= byteString.getData().length) {
            if (iResolveDefaultParameter - i11 >= 0) {
                return (i11 == 0 && iResolveDefaultParameter == byteString.getData().length) ? byteString : new okio.ByteString(ArraysKt.copyOfRange(byteString.getData(), i11, iResolveDefaultParameter));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + byteString.getData().length + ')').toString());
    }

    @NotNull
    public static final okio.ByteString commonToAsciiLowercase(@NotNull okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        for (int i11 = 0; i11 < byteString.getData().length; i11++) {
            byte b11 = byteString.getData()[i11];
            if (b11 >= 65 && b11 <= 90) {
                byte[] data = byteString.getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i11] = (byte) (b11 + 32);
                for (int i12 = i11 + 1; i12 < bArrCopyOf.length; i12++) {
                    byte b12 = bArrCopyOf[i12];
                    if (b12 >= 65 && b12 <= 90) {
                        bArrCopyOf[i12] = (byte) (b12 + 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final okio.ByteString commonToAsciiUppercase(@NotNull okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        for (int i11 = 0; i11 < byteString.getData().length; i11++) {
            byte b11 = byteString.getData()[i11];
            if (b11 >= 97 && b11 <= 122) {
                byte[] data = byteString.getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i11] = (byte) (b11 - 32);
                for (int i12 = i11 + 1; i12 < bArrCopyOf.length; i12++) {
                    byte b12 = bArrCopyOf[i12];
                    if (b12 >= 97 && b12 <= 122) {
                        bArrCopyOf[i12] = (byte) (b12 - 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        byte[] data = byteString.getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    @NotNull
    public static final okio.ByteString commonToByteString(@NotNull byte[] bArr, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i12);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i11, iResolveDefaultParameter);
        return new okio.ByteString(ArraysKt.copyOfRange(bArr, i11, iResolveDefaultParameter + i11));
    }

    @NotNull
    public static final String commonToString(@NotNull okio.ByteString byteString) {
        okio.ByteString byteString2 = byteString;
        Intrinsics.checkNotNullParameter(byteString2, "<this>");
        if (byteString2.getData().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString2.getData(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString2.utf8();
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(strSubstring, "\\", "\\\\", false, 4, (Object) null), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return "[text=" + strReplace$default + ']';
            }
            return "[size=" + byteString2.getData().length + " text=" + strReplace$default + "…]";
        }
        if (byteString2.getData().length <= 64) {
            return "[hex=" + byteString2.hex() + ']';
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(byteString2.getData().length);
        sb2.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString2, 64);
        if (iResolveDefaultParameter > byteString2.getData().length) {
            throw new IllegalArgumentException(("endIndex > length(" + byteString2.getData().length + ')').toString());
        }
        if (iResolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iResolveDefaultParameter != byteString2.getData().length) {
            byteString2 = new okio.ByteString(ArraysKt.copyOfRange(byteString2.getData(), 0, iResolveDefaultParameter));
        }
        sb2.append(byteString2.hex());
        sb2.append("…]");
        return sb2.toString();
    }

    @NotNull
    public static final String commonUtf8(@NotNull okio.ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        String utf8 = byteString.getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(@NotNull okio.ByteString byteString, @NotNull Buffer buffer, int i11, int i12) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.write(byteString.getData(), i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int decodeHexDigit(char c11) {
        if ('0' <= c11 && c11 < ':') {
            return c11 - '0';
        }
        if ('a' <= c11 && c11 < 'g') {
            return c11 - 'W';
        }
        if ('A' <= c11 && c11 < 'G') {
            return c11 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c11);
    }

    @NotNull
    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }
}
