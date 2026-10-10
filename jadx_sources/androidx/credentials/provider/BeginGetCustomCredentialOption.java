package androidx.credentials.provider;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BeginGetCustomCredentialOption.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetCustomCredentialOption;", "Landroidx/credentials/provider/BeginGetCredentialOption;", "id", "", "type", "candidateQueryData", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBeginGetCustomCredentialOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginGetCustomCredentialOption.kt\nandroidx/credentials/provider/BeginGetCustomCredentialOption\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public class BeginGetCustomCredentialOption extends BeginGetCredentialOption {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: BeginGetCustomCredentialOption.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0002\b\u000bJ%\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0002\b\r¨\u0006\u000e"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetCustomCredentialOption$Companion;", "", "<init>", "()V", "createFrom", "Landroidx/credentials/provider/BeginGetCustomCredentialOption;", "data", "Landroid/os/Bundle;", "id", "", "type", "createFrom$credentials", "createFromEntrySlice", "createFromEntrySlice$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final BeginGetCustomCredentialOption createFrom$credentials(@NotNull Bundle data, @NotNull String id2, @NotNull String type) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            return new BeginGetCustomCredentialOption(id2, type, data);
        }

        @JvmStatic
        @NotNull
        public final BeginGetCustomCredentialOption createFromEntrySlice$credentials(@NotNull Bundle data, @NotNull String id2, @NotNull String type) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            return new BeginGetCustomCredentialOption(id2, type, data);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetCustomCredentialOption(@NotNull String id2, @NotNull String type, @NotNull Bundle candidateQueryData) {
        super(id2, type, candidateQueryData);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        if (id2.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
