package androidx.credentials.exceptions.publickeycredential;

import androidx.annotation.RestrictTo;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: GetPublicKeyCredentialException.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001d\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m90084d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "Landroidx/credentials/exceptions/GetCredentialException;", "type", "", "errorMessage", "", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "getType", "()Ljava/lang/String;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGetPublicKeyCredentialException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetPublicKeyCredentialException.kt\nandroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public class GetPublicKeyCredentialException extends GetCredentialException {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String type;

    /* JADX INFO: compiled from: GetPublicKeyCredentialException.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\t"}, m90084d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException$Companion;", "", "<init>", "()V", "createFrom", "Landroidx/credentials/exceptions/GetCredentialException;", "type", "", "msg", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final GetCredentialException createFrom(@NotNull String type, @Nullable String msg) {
            Intrinsics.checkNotNullParameter(type, "type");
            try {
                if (StringsKt.startsWith$default(type, GetPublicKeyCredentialDomException.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION, false, 2, (Object) null)) {
                    return GetPublicKeyCredentialDomException.INSTANCE.createFrom(type, msg);
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new GetCredentialCustomException(type, msg);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public GetPublicKeyCredentialException(@NotNull String type) {
        this(type, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(type, "type");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetPublicKeyCredentialException(@NotNull String type, @Nullable CharSequence charSequence) {
        super(type, charSequence);
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final GetCredentialException createFrom(@NotNull String str, @Nullable String str2) {
        return INSTANCE.createFrom(str, str2);
    }

    @Override // androidx.credentials.exceptions.GetCredentialException
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public String getType() {
        return this.type;
    }

    public /* synthetic */ GetPublicKeyCredentialException(String str, CharSequence charSequence, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : charSequence);
    }
}
