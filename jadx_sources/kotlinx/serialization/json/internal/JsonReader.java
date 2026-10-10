package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.a, reason: from toString */
/* JADX INFO: compiled from: AbstractJsonLexer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u000b\n\u0002\u0010\u0001\n\u0002\b&\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010\u0003J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H&¢\u0006\u0004\b$\u0010\u0014J\u000f\u0010%\u001a\u00020\u000fH&¢\u0006\u0004\b%\u0010\u0011J\u000f\u0010'\u001a\u00020&H&¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u000f¢\u0006\u0004\b)\u0010\u0011J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020*H\u0004¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u001f¢\u0006\u0004\b-\u0010\u0003J\u0015\u0010/\u001a\u00020&2\u0006\u0010.\u001a\u00020&¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020*H&¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020*H\u0004¢\u0006\u0004\b3\u00102J!\u00107\u001a\u0002062\u0006\u00104\u001a\u00020&2\b\b\u0002\u00105\u001a\u00020\u000fH\u0000¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020&H\u0016¢\u0006\u0004\b9\u0010(J\u0017\u0010;\u001a\u00020\u000f2\b\b\u0002\u0010:\u001a\u00020\u000f¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0004H&¢\u0006\u0004\b=\u0010>J!\u0010A\u001a\u0004\u0018\u00010\n2\u0006\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u000fH&¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u0004\u0018\u00010\n2\u0006\u0010@\u001a\u00020\u000f¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u001f¢\u0006\u0004\bE\u0010\u0003J\u001f\u0010G\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010\fJ\u000f\u0010H\u001a\u00020\nH&¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\n¢\u0006\u0004\bI\u0010\u000eJ'\u0010J\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0005¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\n¢\u0006\u0004\bL\u0010\u000eJ\r\u0010M\u001a\u00020\n¢\u0006\u0004\bM\u0010\u000eJ\u001f\u0010P\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u0004H\u0014¢\u0006\u0004\bP\u0010QJ\u0015\u0010S\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020\u000f¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010\u000eJ\u0015\u0010W\u001a\u00020\u001f2\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bW\u0010XJ)\u0010[\u001a\u0002062\u0006\u0010Y\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010Z\u001a\u00020\n¢\u0006\u0004\b[\u0010\\J\r\u0010^\u001a\u00020]¢\u0006\u0004\b^\u0010_J\r\u0010`\u001a\u00020\u000f¢\u0006\u0004\b`\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010SR\u0014\u0010c\u001a\u00020a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010dR&\u0010m\u001a\u00060fj\u0002`g8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bP\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010\u0016\u001a\u00020\u00158$X¤\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006p"}, m90084d2 = {"Lkotlinx/serialization/json/internal/a;", "", "<init>", "()V", "", "lastPosition", "current", "b", "(II)I", "currentPosition", "", CmcdData.Factory.STREAMING_FORMAT_SS, "(II)Ljava/lang/String;", "L", "()Ljava/lang/String;", "", "Q", "()Z", "startPosition", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)I", "", "source", "startPos", "c", "(Ljava/lang/CharSequence;I)I", "B", "start", "f", "(I)Z", "literalSuffix", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;I)V", "u", ViewProps.POSITION, "H", "e", "", "j", "()B", "M", "", "D", "(C)Z", "v", "expected", "k", "(B)B", CmcdData.Factory.STREAM_TYPE_LIVE, "(C)V", "P", "expectedToken", "wasConsumed", "", "y", "(BZ)Ljava/lang/Void;", "F", "doConsume", "N", "(Z)Z", "J", "()I", "keyToMatch", "isLenient", ExifInterface.LONGITUDE_EAST, "(Ljava/lang/String;Z)Ljava/lang/String;", "G", "(Z)Ljava/lang/String;", "t", "endPos", "K", "i", "o", "p", "(Ljava/lang/CharSequence;II)Ljava/lang/String;", "r", "q", "fromIndex", "toIndex", "d", "(II)V", "allowLenientStrings", "I", "(Z)V", "toString", "key", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Ljava/lang/String;)V", "message", "hint", "w", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/Void;", "", "m", "()J", "g", "Lkotlinx/serialization/json/internal/e0;", "Lkotlinx/serialization/json/internal/e0;", "path", "Ljava/lang/String;", "peekedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "escapedString", "C", "()Ljava/lang/CharSequence;", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbstractJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,747:1\n739#1,5:748\n1#2:753\n*S KotlinDebug\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n216#1:748,5\n*E\n"})
public abstract class JsonReader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @JvmField
    public int currentPosition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public String peekedString;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final C41922e0 path = new C41922e0();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public StringBuilder escapedString = new StringBuilder();

    @NotNull
    /* JADX INFO: renamed from: C */
    public abstract CharSequence getSource();

    @Nullable
    /* JADX INFO: renamed from: E */
    public abstract String mo91818E(@NotNull String keyToMatch, boolean isLenient);

    /* JADX INFO: renamed from: H */
    public abstract int mo91821H(int position);

    /* JADX INFO: renamed from: J */
    public abstract int mo91823J();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo91834e();

    @NotNull
    /* JADX INFO: renamed from: i */
    public abstract String mo91838i();

    /* JADX INFO: renamed from: j */
    public abstract byte mo91839j();

    /* JADX INFO: renamed from: l */
    public abstract void mo91841l(char expected);

    /* JADX INFO: renamed from: t */
    public final void m91848t() {
        this.peekedString = null;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ boolean m91810O(JsonReader jsonReader, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return jsonReader.m91827N(z11);
    }

    /* JADX INFO: renamed from: n */
    public static final double m91811n(long j11, boolean z11) {
        if (!z11) {
            return Math.pow(10.0d, -j11);
        }
        if (z11) {
            return Math.pow(10.0d, j11);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Void m91812x(JsonReader jsonReader, String str, int i11, String str2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i12 & 2) != 0) {
            i11 = jsonReader.currentPosition;
        }
        if ((i12 & 4) != 0) {
            str2 = "";
        }
        return jsonReader.m91851w(str, i11, str2);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Void m91813z(JsonReader jsonReader, byte b11, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return jsonReader.m91852y(b11, z11);
    }

    /* JADX INFO: renamed from: A */
    public final void m91814A(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        m91851w("Encountered an unknown key '" + key + '\'', StringsKt.lastIndexOf$default((CharSequence) m91824K(0, this.currentPosition), key, 0, false, 6, (Object) null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: D */
    public final boolean m91817D(char c11) {
        return (c11 == ',' || c11 == ':' || c11 == ']' || c11 == '}') ? false : true;
    }

    /* JADX INFO: renamed from: I */
    public final void m91822I(boolean allowLenientStrings) {
        ArrayList arrayList = new ArrayList();
        byte bMo91819F = mo91819F();
        if (bMo91819F != 8 && bMo91819F != 6) {
            m91845q();
            return;
        }
        while (true) {
            byte bMo91819F2 = mo91819F();
            if (bMo91819F2 != 1) {
                if (bMo91819F2 == 8 || bMo91819F2 == 6) {
                    arrayList.add(Byte.valueOf(bMo91819F2));
                } else if (bMo91819F2 == 9) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                        throw C41915b0.m91866f(this.currentPosition, "found ] instead of } at path: " + this.path, getSource());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bMo91819F2 == 7) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                        throw C41915b0.m91866f(this.currentPosition, "found } instead of ] at path: " + this.path, getSource());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bMo91819F2 == 10) {
                    m91812x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                mo91839j();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (allowLenientStrings) {
                m91845q();
            } else {
                mo91838i();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final String m91825L() {
        String str = this.peekedString;
        Intrinsics.checkNotNull(str);
        this.peekedString = null;
        return str;
    }

    /* JADX INFO: renamed from: P */
    public final void m91828P(char expected) {
        int i11 = this.currentPosition;
        if (i11 > 0 && expected == '\"') {
            try {
                this.currentPosition = i11 - 1;
                String strM91845q = m91845q();
                this.currentPosition = i11;
                if (Intrinsics.areEqual(strM91845q, "null")) {
                    m91851w("Expected string literal but 'null' literal was found", this.currentPosition - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th2) {
                this.currentPosition = i11;
                throw th2;
            }
        }
        m91813z(this, C41914b.m91858a(expected), false, 2, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: c */
    public final int m91832c(CharSequence source, int startPos) {
        int i11 = startPos + 4;
        if (i11 < source.length()) {
            this.escapedString.append((char) ((m91815B(source, startPos) << 12) + (m91815B(source, startPos + 1) << 8) + (m91815B(source, startPos + 2) << 4) + m91815B(source, startPos + 3)));
            return i11;
        }
        this.currentPosition = startPos;
        m91849u();
        if (this.currentPosition + 4 < source.length()) {
            return m91832c(source, this.currentPosition);
        }
        m91812x(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: d */
    public void m91833d(int fromIndex, int toIndex) {
        this.escapedString.append(getSource(), fromIndex, toIndex);
    }

    /* JADX INFO: renamed from: m */
    public final long m91842m() {
        boolean z11;
        boolean z12;
        int iMo91821H = mo91821H(mo91823J());
        if (iMo91821H >= getSource().length() || iMo91821H == -1) {
            m91812x(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(iMo91821H) == '\"') {
            iMo91821H++;
            if (iMo91821H == getSource().length()) {
                m91812x(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = iMo91821H;
        boolean z13 = false;
        boolean z14 = false;
        long j11 = 0;
        long j12 = 0;
        loop0: while (true) {
            z12 = false;
            while (true) {
                if (i11 == getSource().length()) {
                    break loop0;
                }
                char cCharAt = getSource().charAt(i11);
                if ((cCharAt == 'e' || cCharAt == 'E') && !z13) {
                    if (i11 == iMo91821H) {
                        m91812x(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i11++;
                    z13 = true;
                } else if (cCharAt != '-' || !z13) {
                    if (cCharAt != '+' || !z13) {
                        if (cCharAt != '-') {
                            if (C41914b.m91858a(cCharAt) != 0) {
                                break loop0;
                            }
                            i11++;
                            int i12 = cCharAt - '0';
                            if (i12 < 0 || i12 >= 10) {
                                m91812x(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            if (z13) {
                                j12 = (j12 * ((long) 10)) + ((long) i12);
                            } else {
                                j11 = (j11 * ((long) 10)) - ((long) i12);
                                if (j11 > 0) {
                                    m91812x(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new KotlinNothingValueException();
                                }
                            }
                        } else {
                            if (i11 != iMo91821H) {
                                m91812x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            i11++;
                            z14 = true;
                        }
                    } else {
                        if (i11 == iMo91821H) {
                            m91812x(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i11++;
                    }
                }
                z12 = true;
            }
            if (i11 == iMo91821H) {
                m91812x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i11++;
        }
        boolean z15 = i11 != iMo91821H;
        if (iMo91821H == i11 || (z14 && iMo91821H == i11 - 1)) {
            m91812x(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z11) {
            if (!z15) {
                m91812x(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (getSource().charAt(i11) != '\"') {
                m91812x(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i11++;
        }
        this.currentPosition = i11;
        if (z13) {
            double dM91811n = j11 * m91811n(j12, z12);
            if (dM91811n > 9.223372036854776E18d || dM91811n < -9.223372036854776E18d) {
                m91812x(this, "Numeric value overflow", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (Math.floor(dM91811n) != dM91811n) {
                m91812x(this, "Can't convert " + dM91811n + " to Long", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            j11 = (long) dM91811n;
        }
        if (z14) {
            return j11;
        }
        if (j11 != Long.MIN_VALUE) {
            return -j11;
        }
        m91812x(this, "Numeric value overflow", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final String m91843o() {
        return this.peekedString != null ? m91825L() : mo91838i();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final String m91845q() {
        if (this.peekedString != null) {
            return m91825L();
        }
        int iMo91823J = mo91823J();
        if (iMo91823J >= getSource().length() || iMo91823J == -1) {
            m91812x(this, "EOF", iMo91823J, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bM91858a = C41914b.m91858a(getSource().charAt(iMo91823J));
        if (bM91858a == 1) {
            return m91843o();
        }
        if (bM91858a != 0) {
            m91812x(this, "Expected beginning of the string, but got " + getSource().charAt(iMo91823J), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z11 = false;
        while (C41914b.m91858a(getSource().charAt(iMo91823J)) == 0) {
            iMo91823J++;
            if (iMo91823J >= getSource().length()) {
                m91833d(this.currentPosition, iMo91823J);
                int iMo91821H = mo91821H(iMo91823J);
                if (iMo91821H == -1) {
                    this.currentPosition = iMo91823J;
                    return m91847s(0, 0);
                }
                iMo91823J = iMo91821H;
                z11 = true;
            }
        }
        String strM91824K = !z11 ? m91824K(this.currentPosition, iMo91823J) : m91847s(this.currentPosition, iMo91823J);
        this.currentPosition = iMo91823J;
        return strM91824K;
    }

    @NotNull
    public String toString() {
        return "JsonReader(source='" + ((Object) getSource()) + "', currentPosition=" + this.currentPosition + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final Void m91851w(@NotNull String message, int position, @NotNull String hint) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw C41915b0.m91866f(position, message + " at path: " + this.path.m91932a() + str, getSource());
    }

    /* JADX INFO: renamed from: B */
    public final int m91815B(CharSequence source, int currentPosition) {
        char cCharAt = source.charAt(currentPosition);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m91812x(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: F */
    public byte mo91819F() {
        CharSequence charSequenceMo91816C = getSource();
        int i11 = this.currentPosition;
        while (true) {
            int iMo91821H = mo91821H(i11);
            if (iMo91821H != -1) {
                char cCharAt = charSequenceMo91816C.charAt(iMo91821H);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                    this.currentPosition = iMo91821H;
                    return C41914b.m91858a(cCharAt);
                }
                i11 = iMo91821H + 1;
            } else {
                this.currentPosition = iMo91821H;
                return (byte) 10;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    public final String m91820G(boolean isLenient) {
        String strM91843o;
        byte bMo91819F = mo91819F();
        if (isLenient) {
            if (bMo91819F != 1 && bMo91819F != 0) {
                return null;
            }
            strM91843o = m91845q();
        } else {
            if (bMo91819F != 1) {
                return null;
            }
            strM91843o = m91843o();
        }
        this.peekedString = strM91843o;
        return strM91843o;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public String m91824K(int startPos, int endPos) {
        return getSource().subSequence(startPos, endPos).toString();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m91826M() {
        int iMo91823J = mo91823J();
        CharSequence charSequenceMo91816C = getSource();
        if (iMo91823J >= charSequenceMo91816C.length() || iMo91823J == -1 || charSequenceMo91816C.charAt(iMo91823J) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m91827N(boolean doConsume) {
        int iMo91821H = mo91821H(mo91823J());
        int length = getSource().length() - iMo91821H;
        if (length < 4 || iMo91821H == -1) {
            return false;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            if ("null".charAt(i11) != getSource().charAt(iMo91821H + i11)) {
                return false;
            }
        }
        if (length > 4 && C41914b.m91858a(getSource().charAt(iMo91821H + 4)) == 0) {
            return false;
        }
        if (doConsume) {
            this.currentPosition = iMo91821H + 4;
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m91829Q() {
        if (getSource().charAt(this.currentPosition - 1) != '\"') {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final int m91830a(int startPosition) {
        int iMo91821H = mo91821H(startPosition);
        if (iMo91821H != -1) {
            int i11 = iMo91821H + 1;
            char cCharAt = getSource().charAt(iMo91821H);
            if (cCharAt == 'u') {
                return m91832c(getSource(), i11);
            }
            char cM91859b = C41914b.m91859b(cCharAt);
            if (cM91859b != 0) {
                this.escapedString.append(cM91859b);
                return i11;
            }
            m91812x(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        m91812x(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: b */
    public final int m91831b(int lastPosition, int current) {
        m91833d(lastPosition, current);
        return m91830a(current + 1);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m91835f(int start) {
        int iMo91821H = mo91821H(start);
        if (iMo91821H < getSource().length() && iMo91821H != -1) {
            int i11 = iMo91821H + 1;
            int iCharAt = getSource().charAt(iMo91821H) | ' ';
            if (iCharAt != 102) {
                if (iCharAt == 116) {
                    m91837h("rue", i11);
                    return true;
                }
                m91812x(this, "Expected valid boolean literal prefix, but had '" + m91845q() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            m91837h("alse", i11);
            return false;
        }
        m91812x(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m91836g() {
        boolean z11;
        int iMo91823J = mo91823J();
        if (iMo91823J != getSource().length()) {
            if (getSource().charAt(iMo91823J) == '\"') {
                iMo91823J++;
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zM91835f = m91835f(iMo91823J);
            if (z11) {
                if (this.currentPosition != getSource().length()) {
                    if (getSource().charAt(this.currentPosition) == '\"') {
                        this.currentPosition++;
                        return zM91835f;
                    }
                    m91812x(this, "Expected closing quotation mark", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                m91812x(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return zM91835f;
        }
        m91812x(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: h */
    public final void m91837h(String literalSuffix, int current) {
        if (getSource().length() - current >= literalSuffix.length()) {
            int length = literalSuffix.length();
            for (int i11 = 0; i11 < length; i11++) {
                if (literalSuffix.charAt(i11) != (getSource().charAt(current + i11) | ' ')) {
                    m91812x(this, "Expected valid boolean literal prefix, but had '" + m91845q() + '\'', 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            this.currentPosition = current + literalSuffix.length();
            return;
        }
        m91812x(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: k */
    public final byte m91840k(byte expected) {
        byte bMo91839j = mo91839j();
        if (bMo91839j == expected) {
            return bMo91839j;
        }
        m91813z(this, expected, false, 2, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final String m91844p(@NotNull CharSequence source, int startPosition, int current) {
        String strM91847s;
        Intrinsics.checkNotNullParameter(source, "source");
        char cCharAt = source.charAt(current);
        boolean z11 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int iMo91821H = mo91821H(m91831b(startPosition, current));
                if (iMo91821H != -1) {
                    z11 = true;
                    startPosition = iMo91821H;
                    current = startPosition;
                } else {
                    m91812x(this, "Unexpected EOF", iMo91821H, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                current++;
                if (current >= source.length()) {
                    m91833d(startPosition, current);
                    int iMo91821H2 = mo91821H(current);
                    if (iMo91821H2 != -1) {
                        startPosition = iMo91821H2;
                        current = startPosition;
                        z11 = true;
                    } else {
                        m91812x(this, "Unexpected EOF", iMo91821H2, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                }
            }
            cCharAt = source.charAt(current);
        }
        if (!z11) {
            strM91847s = m91824K(startPosition, current);
        } else {
            strM91847s = m91847s(startPosition, current);
        }
        this.currentPosition = current + 1;
        return strM91847s;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final String m91846r() {
        String strM91845q = m91845q();
        if (Intrinsics.areEqual(strM91845q, "null") && m91829Q()) {
            m91812x(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return strM91845q;
    }

    /* JADX INFO: renamed from: s */
    public final String m91847s(int lastPosition, int currentPosition) {
        m91833d(lastPosition, currentPosition);
        String string = this.escapedString.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.escapedString.setLength(0);
        return string;
    }

    /* JADX INFO: renamed from: v */
    public final void m91850v() {
        if (mo91839j() == 10) {
            return;
        }
        m91812x(this, "Expected EOF after parsing, but had " + getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final Void m91852y(byte expectedToken, boolean wasConsumed) {
        int i11;
        String strValueOf;
        String strM91860c = C41914b.m91860c(expectedToken);
        if (wasConsumed) {
            i11 = this.currentPosition - 1;
        } else {
            i11 = this.currentPosition;
        }
        int i12 = i11;
        if (this.currentPosition != getSource().length() && i12 >= 0) {
            strValueOf = String.valueOf(getSource().charAt(i12));
        } else {
            strValueOf = "EOF";
        }
        m91812x(this, "Expected " + strM91860c + ", but had '" + strValueOf + "' instead", i12, null, 4, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: u */
    public void m91849u() {
    }
}
