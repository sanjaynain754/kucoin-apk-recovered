package androidx.credentials;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CustomCredential.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/CustomCredential;", "Landroidx/credentials/Credential;", "type", "", "data", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCustomCredential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomCredential.kt\nandroidx/credentials/CustomCredential\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public class CustomCredential extends Credential {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCredential(@NotNull String type, @NotNull Bundle data) {
        super(type, data);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        if (type.length() > 0) {
        } else {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
