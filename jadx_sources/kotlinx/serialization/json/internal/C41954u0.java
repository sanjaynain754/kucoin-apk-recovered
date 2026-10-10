package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.u0 */
/* JADX INFO: compiled from: StringJsonLexer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, m90084d2 = {"Lkotlinx/serialization/json/internal/u0;", "Lkotlinx/serialization/json/internal/a;", "", "source", "<init>", "(Ljava/lang/String;)V", "", ViewProps.POSITION, "H", "(I)I", "", "j", "()B", "", "e", "()Z", "J", "()I", "", "expected", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(C)V", "i", "()Ljava/lang/String;", "keyToMatch", "isLenient", ExifInterface.LONGITUDE_EAST, "(Ljava/lang/String;Z)Ljava/lang/String;", "Ljava/lang/String;", "R", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStringJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n158#2:130\n158#2:131\n158#2:132\n158#2:133\n1863#3,2:134\n*S KotlinDebug\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n*L\n23#1:130\n38#1:131\n57#1:132\n73#1:133\n109#1:134,2\n*E\n"})
public class C41954u0 extends JsonReader {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String source;

    @Override // kotlinx.serialization.json.internal.JsonReader
    @Nullable
    /* JADX INFO: renamed from: E */
    public String mo91818E(@NotNull String keyToMatch, boolean isLenient) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i11 = this.currentPosition;
        try {
            if (mo91839j() == 6 && Intrinsics.areEqual(m91820G(isLenient), keyToMatch)) {
                m91848t();
                if (mo91839j() == 5) {
                    return m91820G(isLenient);
                }
            }
            return null;
        } finally {
            this.currentPosition = i11;
            m91848t();
        }
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    /* JADX INFO: renamed from: J */
    public int mo91823J() {
        char cCharAt;
        int i11 = this.currentPosition;
        if (i11 == -1) {
            return i11;
        }
        String strMo91816C = mo91816C();
        while (i11 < strMo91816C.length() && ((cCharAt = strMo91816C.charAt(i11)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i11++;
        }
        this.currentPosition = i11;
        return i11;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    @NotNull
    /* JADX INFO: renamed from: R, reason: from getter and merged with bridge method [inline-methods] */
    public String mo91816C() {
        return this.source;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    /* JADX INFO: renamed from: e */
    public boolean mo91834e() {
        int i11 = this.currentPosition;
        if (i11 == -1) {
            return false;
        }
        String strMo91816C = mo91816C();
        while (i11 < strMo91816C.length()) {
            char cCharAt = strMo91816C.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i11;
                return m91817D(cCharAt);
            }
            i11++;
        }
        this.currentPosition = i11;
        return false;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    @NotNull
    /* JADX INFO: renamed from: i */
    public String mo91838i() {
        mo91841l('\"');
        int i11 = this.currentPosition;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) mo91816C(), '\"', i11, false, 4, (Object) null);
        if (iIndexOf$default == -1) {
            m91845q();
            m91852y((byte) 1, false);
            throw new KotlinNothingValueException();
        }
        for (int i12 = i11; i12 < iIndexOf$default; i12++) {
            if (mo91816C().charAt(i12) == '\\') {
                return m91844p(mo91816C(), this.currentPosition, i12);
            }
        }
        this.currentPosition = iIndexOf$default + 1;
        String strSubstring = mo91816C().substring(i11, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    /* JADX INFO: renamed from: l */
    public void mo91841l(char expected) {
        if (this.currentPosition == -1) {
            m91828P(expected);
        }
        String strMo91816C = mo91816C();
        int i11 = this.currentPosition;
        while (i11 < strMo91816C.length()) {
            int i12 = i11 + 1;
            char cCharAt = strMo91816C.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i12;
                if (cCharAt == expected) {
                    return;
                } else {
                    m91828P(expected);
                }
            }
            i11 = i12;
        }
        this.currentPosition = -1;
        m91828P(expected);
    }

    public C41954u0(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    /* JADX INFO: renamed from: H */
    public int mo91821H(int position) {
        if (position < mo91816C().length()) {
            return position;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.JsonReader
    /* JADX INFO: renamed from: j */
    public byte mo91839j() {
        String strMo91816C = mo91816C();
        int i11 = this.currentPosition;
        while (i11 != -1 && i11 < strMo91816C.length()) {
            int i12 = i11 + 1;
            char cCharAt = strMo91816C.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i12;
                return C41914b.m91858a(cCharAt);
            }
            i11 = i12;
        }
        this.currentPosition = strMo91816C.length();
        return (byte) 10;
    }
}
