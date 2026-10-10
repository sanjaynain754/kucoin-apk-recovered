package kotlinx.serialization.json.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.i0 */
/* JADX INFO: compiled from: JsonToStringWriter.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0019\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0016\u0010&\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%¨\u0006'"}, m90084d2 = {"Lkotlinx/serialization/json/internal/i0;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "<init>", "()V", "", "value", "", "writeLong", "(J)V", "", "char", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(C)V", "", "text", "c", "(Ljava/lang/String;)V", "b", "g", "toString", "()Ljava/lang/String;", "", "firstEscapedChar", "currentSize", TypedValues.Custom.S_STRING, "d", "(IILjava/lang/String;)V", "expected", "e", "(I)V", "oldSize", "additional", "f", "(II)I", "", "[C", "array", "I", "size", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41930i0 implements InternalJsonWriter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public char[] array = C41933k.f92123c.m91953d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int size;

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    /* JADX INFO: renamed from: a */
    public void mo91791a(char c11) {
        m91945e(1);
        char[] cArr = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        cArr[i11] = c11;
    }

    /* JADX INFO: renamed from: f */
    public final int m91946f(int oldSize, int additional) {
        int i11 = additional + oldSize;
        char[] cArr = this.array;
        if (cArr.length <= i11) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i11, oldSize * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.array = cArrCopyOf;
        }
        return oldSize;
    }

    /* JADX INFO: renamed from: e */
    public final void m91945e(int expected) {
        m91946f(this.size, expected);
    }

    /* JADX INFO: renamed from: g */
    public void m91947g() {
        C41933k.f92123c.m91952c(this.array);
    }

    @NotNull
    public String toString() {
        return new String(this.array, 0, this.size);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    /* JADX INFO: renamed from: b */
    public void mo91792b(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        m91945e(text.length() + 2);
        char[] cArr = this.array;
        int i11 = this.size;
        int i12 = i11 + 1;
        cArr[i11] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i12);
        int i13 = length + i12;
        for (int i14 = i12; i14 < i13; i14++) {
            char c11 = cArr[i14];
            if (c11 < C41960x0.m92014a().length && C41960x0.m92014a()[c11] != 0) {
                m91944d(i14 - i12, i14, text);
                return;
            }
        }
        cArr[i13] = '\"';
        this.size = i13 + 1;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    /* JADX INFO: renamed from: c */
    public void mo91793c(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        m91945e(length);
        text.getChars(0, text.length(), this.array, this.size);
        this.size += length;
    }

    /* JADX INFO: renamed from: d */
    public final void m91944d(int firstEscapedChar, int currentSize, String string) {
        byte b11;
        int length = string.length();
        while (firstEscapedChar < length) {
            int iM91946f = m91946f(currentSize, 2);
            char cCharAt = string.charAt(firstEscapedChar);
            if (cCharAt >= C41960x0.m92014a().length || (b11 = C41960x0.m92014a()[cCharAt]) == 0) {
                int i11 = iM91946f + 1;
                this.array[iM91946f] = cCharAt;
                currentSize = i11;
            } else if (b11 == 1) {
                String str = C41960x0.m92015b()[cCharAt];
                Intrinsics.checkNotNull(str);
                int iM91946f2 = m91946f(iM91946f, str.length());
                str.getChars(0, str.length(), this.array, iM91946f2);
                currentSize = iM91946f2 + str.length();
                this.size = currentSize;
            } else {
                char[] cArr = this.array;
                cArr[iM91946f] = '\\';
                cArr[iM91946f + 1] = (char) b11;
                currentSize = iM91946f + 2;
                this.size = currentSize;
            }
            firstEscapedChar++;
        }
        int iM91946f3 = m91946f(currentSize, 1);
        this.array[iM91946f3] = '\"';
        this.size = iM91946f3 + 1;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long value) {
        mo91793c(String.valueOf(value));
    }
}
