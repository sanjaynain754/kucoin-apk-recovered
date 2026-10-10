package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.w0 */
/* JADX INFO: compiled from: CommentLexers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lkotlinx/serialization/json/internal/w0;", "Lkotlinx/serialization/json/internal/u0;", "", "source", "<init>", "(Ljava/lang/String;)V", "", "j", "()B", "", "e", "()Z", "", "expected", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(C)V", "F", "", "J", "()I", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCommentLexers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/StringJsonLexerWithComments\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,219:1\n158#2:220\n*S KotlinDebug\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/StringJsonLexerWithComments\n*L\n66#1:220\n*E\n"})
public final class C41958w0 extends C41954u0 {
    @Override // kotlinx.serialization.json.internal.C41954u0, kotlinx.serialization.json.internal.JsonReader
    /* JADX INFO: renamed from: J */
    public int mo91823J() {
        int i11;
        int iIndexOf$default = this.currentPosition;
        if (iIndexOf$default == -1) {
            return iIndexOf$default;
        }
        String strMo91816C = mo91816C();
        while (iIndexOf$default < strMo91816C.length()) {
            char cCharAt = strMo91816C.charAt(iIndexOf$default);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i11 = iIndexOf$default + 1) >= strMo91816C.length()) {
                    break;
                }
                char cCharAt2 = strMo91816C.charAt(i11);
                if (cCharAt2 == '*') {
                    int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) strMo91816C, "*/", iIndexOf$default + 2, false, 4, (Object) null);
                    if (iIndexOf$default2 == -1) {
                        this.currentPosition = strMo91816C.length();
                        JsonReader.m91812x(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    iIndexOf$default = iIndexOf$default2 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iIndexOf$default = StringsKt.indexOf$default((CharSequence) strMo91816C, '\n', iIndexOf$default + 2, false, 4, (Object) null);
                    iIndexOf$default = iIndexOf$default == -1 ? strMo91816C.length() : iIndexOf$default + 1;
                }
            }
        }
        this.currentPosition = iIndexOf$default;
        return iIndexOf$default;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41958w0(@NotNull String source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    /* JADX INFO: renamed from: F */
    public byte mo91819F() {
        String strMo91816C = mo91816C();
        int iMo91823J = mo91823J();
        if (iMo91823J < strMo91816C.length() && iMo91823J != -1) {
            this.currentPosition = iMo91823J;
            return C41914b.m91858a(strMo91816C.charAt(iMo91823J));
        }
        return (byte) 10;
    }

    @Override // kotlinx.serialization.json.internal.C41954u0, kotlinx.serialization.json.internal.JsonReader
    /* JADX INFO: renamed from: e */
    public boolean mo91834e() {
        int iMo91823J = mo91823J();
        if (iMo91823J < mo91816C().length() && iMo91823J != -1) {
            return m91817D(mo91816C().charAt(iMo91823J));
        }
        return false;
    }

    @Override // kotlinx.serialization.json.internal.C41954u0, kotlinx.serialization.json.internal.JsonReader
    /* JADX INFO: renamed from: j */
    public byte mo91839j() {
        String strMo91816C = mo91816C();
        int iMo91823J = mo91823J();
        if (iMo91823J < strMo91816C.length() && iMo91823J != -1) {
            this.currentPosition = iMo91823J + 1;
            return C41914b.m91858a(strMo91816C.charAt(iMo91823J));
        }
        return (byte) 10;
    }

    @Override // kotlinx.serialization.json.internal.C41954u0, kotlinx.serialization.json.internal.JsonReader
    /* JADX INFO: renamed from: l */
    public void mo91841l(char expected) {
        String strMo91816C = mo91816C();
        int iMo91823J = mo91823J();
        if (iMo91823J >= strMo91816C.length() || iMo91823J == -1) {
            this.currentPosition = -1;
            m91828P(expected);
        }
        char cCharAt = strMo91816C.charAt(iMo91823J);
        this.currentPosition = iMo91823J + 1;
        if (cCharAt == expected) {
            return;
        }
        m91828P(expected);
    }
}
