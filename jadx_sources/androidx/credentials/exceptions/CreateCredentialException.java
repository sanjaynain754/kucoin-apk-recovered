package androidx.credentials.exceptions;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.credentials.internal.ConversionUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CreateCredentialException.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\b\b&\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0001\rB\u001d\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m90084d2 = {"Landroidx/credentials/exceptions/CreateCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "type", "", "errorMessage", "", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "getType", "()Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/CharSequence;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class CreateCredentialException extends Exception {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_CREATE_CREDENTIAL_EXCEPTION_MESSAGE = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE";

    @NotNull
    private static final String EXTRA_CREATE_CREDENTIAL_EXCEPTION_TYPE = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE";

    @Nullable
    private final CharSequence errorMessage;

    @NotNull
    private final String type;

    /* JADX INFO: compiled from: CreateCredentialException.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Landroidx/credentials/exceptions/CreateCredentialException$Companion;", "", "<init>", "()V", "EXTRA_CREATE_CREDENTIAL_EXCEPTION_TYPE", "", "EXTRA_CREATE_CREDENTIAL_EXCEPTION_MESSAGE", "asBundle", "Landroid/os/Bundle;", "ex", "Landroidx/credentials/exceptions/CreateCredentialException;", "fromBundle", "bundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Bundle asBundle(@NotNull CreateCredentialException ex2) {
            Intrinsics.checkNotNullParameter(ex2, "ex");
            Bundle bundle = new Bundle();
            bundle.putString(CreateCredentialException.EXTRA_CREATE_CREDENTIAL_EXCEPTION_TYPE, ex2.getType());
            CharSequence errorMessage = ex2.getErrorMessage();
            if (errorMessage != null) {
                bundle.putCharSequence(CreateCredentialException.EXTRA_CREATE_CREDENTIAL_EXCEPTION_MESSAGE, errorMessage);
            }
            return bundle;
        }

        @JvmStatic
        @NotNull
        public final CreateCredentialException fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString(CreateCredentialException.EXTRA_CREATE_CREDENTIAL_EXCEPTION_TYPE);
            if (string != null) {
                return ConversionUtilsKt.toJetpackCreateException(string, bundle.getCharSequence(CreateCredentialException.EXTRA_CREATE_CREDENTIAL_EXCEPTION_MESSAGE));
            }
            throw new IllegalArgumentException("Bundle was missing exception type.");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public CreateCredentialException(@NotNull String type) {
        this(type, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(type, "type");
    }

    public /* synthetic */ CreateCredentialException(String str, CharSequence charSequence, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : charSequence);
    }

    @JvmStatic
    @NotNull
    public static final Bundle asBundle(@NotNull CreateCredentialException createCredentialException) {
        return INSTANCE.asBundle(createCredentialException);
    }

    @JvmStatic
    @NotNull
    public static final CreateCredentialException fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public CharSequence getErrorMessage() {
        return this.errorMessage;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public String getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateCredentialException(@NotNull String type, @Nullable CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.errorMessage = charSequence;
    }
}
